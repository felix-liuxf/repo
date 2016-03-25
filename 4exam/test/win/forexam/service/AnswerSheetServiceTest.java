package win.forexam.service;



import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
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
		//answerSheet.setQuestionNumber(30);
		bean.setAnswerSheet(answerSheet);
		int questionNumber =35;
		List<AnswerSheetQuestion> listQuestion = new ArrayList<AnswerSheetQuestion>();

		for (int i = 0; i < questionNumber; i++) {
			AnswerSheetQuestion question = new AnswerSheetQuestion();
			question.setContent("q" + i);
			question.setAnswer("A" + i);
			listQuestion.add(question);
		}

		bean.setListQuestion(listQuestion);

		s.createAnswerSheet(bean);
	}

	@Test
	public void testGetAnswerSheet(){
		AnswerSheetService s = new AnswerSheetService();
		AnswerSheetBean bean =s.getAnswerSheetById(1l);
		
		Assert.assertEquals(1, bean.getAnswerSheet().getId().longValue());
	
		Assert.assertEquals(6,bean.getListQuestion().size());
	}
}
