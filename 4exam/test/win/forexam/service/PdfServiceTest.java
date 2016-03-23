package win.forexam.service;

import java.io.IOException;

import org.junit.Test;

import win.forexam.bean.AnswerSheetBean;

import com.itextpdf.text.DocumentException;

public class PdfServiceTest {

	@Test
	public void testCreatPdfAnswerSheet() throws DocumentException, IOException {
		//fail("Not yet implemented"); // TODO
		PdfService s = new PdfService();
		AnswerSheetBean answerSheetBean = new AnswerSheetService().getAnswerSheetById(1l);
		s.creatPdfAnswerSheet(answerSheetBean);
	}

}
