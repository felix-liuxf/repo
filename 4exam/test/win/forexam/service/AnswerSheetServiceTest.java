package win.forexam.service;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import win.forexam.bean.AnswerSheetBean;
import win.forexam.model.AnswerSheet;
import win.forexam.model.AnswerSheetQuestion;

public class AnswerSheetServiceTest {

	@Test
	public void testCreateAnswerSheet() {
		AnswerSheetService s = new AnswerSheetService();
		AnswerSheetBean bean = new AnswerSheetBean();
		AnswerSheet answerSheet = new AnswerSheet();
		answerSheet.setName("Ä¬ÈÏ´ðÌâ¿¨");
		answerSheet.setStudentNumber(5);
		answerSheet.setQuestionNumber(6);
		bean.setAnswerSheet(answerSheet);

		List<AnswerSheetQuestion> listQuestion = new ArrayList<AnswerSheetQuestion>();

		for (int i = 0; i < 6; i++) {
			AnswerSheetQuestion question = new AnswerSheetQuestion();
			question.setContent("q" + i);
			question.setAnswer("A" + i);
			listQuestion.add(question);
		}

		bean.setListQuestion(listQuestion);

		s.createAnswerSheet(bean);
	}

}
