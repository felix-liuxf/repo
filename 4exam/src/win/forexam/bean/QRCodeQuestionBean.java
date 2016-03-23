package win.forexam.bean;

public class QRCodeQuestionBean {

	public static final Integer ANSWER_SHEET=1;
	public static final Integer QUESTION=2;
	/**
	 * QRCode Type answerSheet:1 question:2
	 */
	private Integer a;
	/**
	 * answerSheetId
	 */
	private Long b;
	/**
	 * answerSheetQuetionId
	 */
	private Long c;

	public Integer getA() {
		return a;
	}

	/**
	 * @param a this.ANSWER_SHEET  this.QUESTION
	 */
	public void setA(Integer a) {
		this.a = a;
	}

	public Long getB() {
		return b;
	}
	/**
	 * answerSheetId
	 */
	public void setB(Long b) {
		this.b = b;
	}

	public Long getC() {
		return c;
	}
	/**
	 * answerSheetQuetionId
	 */
	public void setC(Long c) {
		this.c = c;
	}

}
