package win.forexam.bean;

import java.util.List;

import win.forexam.model.AnswerSheet;
import win.forexam.model.AnswerSheetQuestion;

public class AnswerSheetBean {
	private AnswerSheet answerSheet;
	private List<AnswerSheetQuestion> listQuestion;

	public AnswerSheet getAnswerSheet() {
		return answerSheet;
	}

	public void setAnswerSheet(AnswerSheet answerSheet) {
		this.answerSheet = answerSheet;
	}

	public List<AnswerSheetQuestion> getListQuestion() {
		return listQuestion;
	}

	public void setListQuestion(List<AnswerSheetQuestion> listQuestion) {
		this.listQuestion = listQuestion;
	}

}
