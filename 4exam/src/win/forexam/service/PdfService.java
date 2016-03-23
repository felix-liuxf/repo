package win.forexam.service;

import java.awt.image.BufferedImage;
import java.io.FileOutputStream;
import java.io.IOException;

import win.forexam.bean.AnswerSheetBean;
import win.forexam.bean.QRCodeQuestionBean;
import win.forexam.model.AnswerSheet;
import win.forexam.model.AnswerSheetQuestion;
import win.forexam.qrcode.QRCodeService;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class PdfService {
	public void creatPdfAnswerSheet(AnswerSheetBean answerSheetBean)
			throws DocumentException, IOException {
		// step 1：创建Document对象
		Document document = new Document();
		document.setMargins(20, 20, 20, 20);
		// step 2：获取PdfWriter实例
		PdfWriter.getInstance(document, new FileOutputStream("d:/a.pdf"));
		// step 3：打开Document
		document.open();

		// 使用资源字体(ClassPath)
		BaseFont baseFont = BaseFont.createFont("/MSYHBD.TTF",
				BaseFont.IDENTITY_H, BaseFont.NOT_EMBEDDED);

		Font font = new Font(baseFont);
		// document.add(new Paragraph("iText导出PDF入门实例", font));

		AnswerSheet answerSheet = answerSheetBean.getAnswerSheet();

		PdfPTable tableHeader = new PdfPTable(2);
		tableHeader.setWidthPercentage(100);
		PdfPCell cellAnswerSheet = new PdfPCell();
		cellAnswerSheet.setBorderWidth(0);
		cellAnswerSheet.addElement(new Paragraph(answerSheet.getName()
				+ "\n\n姓名:\n\n考号:", font));
		tableHeader.addCell(cellAnswerSheet);

		PdfPCell cellQRCode = new PdfPCell();
		cellQRCode.setBorderWidth(0);
		BufferedImage bufferedImage = new QRCodeService().getQRCode("content");
		Image image = Image.getInstance(bufferedImage, null);
		image.scaleAbsolute(100, 100);
		image.setAlignment(Image.RIGHT);
		cellQRCode.addElement(image);
		tableHeader.addCell(cellQRCode);
		document.add(tableHeader);

		int columnNumber = 5;
		int questionNumber = answerSheetBean.getListQuestion().size();
		PdfPTable tableQuestion = new PdfPTable(columnNumber);
		tableQuestion.setWidthPercentage(100);
		for (int q = 1; q <= questionNumber; q++) {
			AnswerSheetQuestion question = answerSheetBean.getListQuestion().get(q-1);
			
			PdfPCell cellQuestion = new PdfPCell();
			cellQuestion.setBorder(0);
			cellQuestion.setPadding(0);

			PdfPTable nestedTable = new PdfPTable(1);
			nestedTable.setWidthPercentage(100);

			PdfPCell cellTitle = new PdfPCell();
			cellTitle.setBorderWidth(0);
			cellTitle.setPaddingBottom(4);
			cellTitle.addElement(new Paragraph("第" + q + "题答案:", font));
			nestedTable.addCell(cellTitle);

			PdfPCell cellQRCodeQuestion = new PdfPCell();
			cellQRCodeQuestion.setBorderWidth(0);
			cellQRCodeQuestion.setPaddingTop(4);
			
			QRCodeQuestionBean questionBean= new QRCodeQuestionBean();
			questionBean.setA(QRCodeQuestionBean.ANSWER_SHEET);
			questionBean.setB(question.getAnswerSheetId());
			questionBean.setC(question.getId());
			
			Image imageQuestion = Image.getInstance(
					new QRCodeService().getQRCodeWithAnswer(new ObjectMapper().writeValueAsString(questionBean)),null);
			imageQuestion.scaleAbsolute(100, 100);

			cellQRCodeQuestion.addElement(imageQuestion);

			nestedTable.addCell(cellQRCodeQuestion);
			cellQuestion.addElement(nestedTable);
			tableQuestion.addCell(cellQuestion);

		}

		// append table cell for whole row

		for (int i = 0; i < (columnNumber - questionNumber % columnNumber); i++) {
			PdfPCell cellQuestion = new PdfPCell();
			cellQuestion.setBorder(0);
			cellQuestion.setPadding(1);
			cellQuestion.addElement(new Paragraph("", font));
			tableQuestion.addCell(cellQuestion);

		}

		document.add(tableQuestion);

		// step 5：关闭打开的Document
		document.close();
	}
}
