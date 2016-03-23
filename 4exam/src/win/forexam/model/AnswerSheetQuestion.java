package win.forexam.model;

import java.util.Date;

public class AnswerSheetQuestion {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ex_answer_sheet_question.ID
     *
     * @mbggenerated Wed Mar 23 17:50:13 CST 2016
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ex_answer_sheet_question.content
     *
     * @mbggenerated Wed Mar 23 17:50:13 CST 2016
     */
    private String content;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ex_answer_sheet_question.answer
     *
     * @mbggenerated Wed Mar 23 17:50:13 CST 2016
     */
    private String answer;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ex_answer_sheet_question.difficulty
     *
     * @mbggenerated Wed Mar 23 17:50:13 CST 2016
     */
    private Integer difficulty;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ex_answer_sheet_question.type
     *
     * @mbggenerated Wed Mar 23 17:50:13 CST 2016
     */
    private Integer type;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ex_answer_sheet_question.score
     *
     * @mbggenerated Wed Mar 23 17:50:13 CST 2016
     */
    private Integer score;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ex_answer_sheet_question.create_time
     *
     * @mbggenerated Wed Mar 23 17:50:13 CST 2016
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ex_answer_sheet_question.modify_time
     *
     * @mbggenerated Wed Mar 23 17:50:13 CST 2016
     */
    private Date modifyTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ex_answer_sheet_question.status
     *
     * @mbggenerated Wed Mar 23 17:50:13 CST 2016
     */
    private Integer status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ex_answer_sheet_question.channel
     *
     * @mbggenerated Wed Mar 23 17:50:13 CST 2016
     */
    private Integer channel;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ex_answer_sheet_question.properties
     *
     * @mbggenerated Wed Mar 23 17:50:13 CST 2016
     */
    private String properties;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ex_answer_sheet_question.memo
     *
     * @mbggenerated Wed Mar 23 17:50:13 CST 2016
     */
    private String memo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ex_answer_sheet_question.user_id
     *
     * @mbggenerated Wed Mar 23 17:50:13 CST 2016
     */
    private Long userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ex_answer_sheet_question.answer_sheet_id
     *
     * @mbggenerated Wed Mar 23 17:50:13 CST 2016
     */
    private Long answerSheetId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ex_answer_sheet_question.question_id
     *
     * @mbggenerated Wed Mar 23 17:50:13 CST 2016
     */
    private Long questionId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ex_answer_sheet_question.question_order
     *
     * @mbggenerated Wed Mar 23 17:50:13 CST 2016
     */
    private Integer questionOrder;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ex_answer_sheet_question.ID
     *
     * @return the value of ex_answer_sheet_question.ID
     *
     * @mbggenerated Wed Mar 23 17:50:13 CST 2016
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ex_answer_sheet_question.ID
     *
     * @param id the value for ex_answer_sheet_question.ID
     *
     * @mbggenerated Wed Mar 23 17:50:13 CST 2016
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ex_answer_sheet_question.content
     *
     * @return the value of ex_answer_sheet_question.content
     *
     * @mbggenerated Wed Mar 23 17:50:13 CST 2016
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ex_answer_sheet_question.content
     *
     * @param content the value for ex_answer_sheet_question.content
     *
     * @mbggenerated Wed Mar 23 17:50:13 CST 2016
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ex_answer_sheet_question.answer
     *
     * @return the value of ex_answer_sheet_question.answer
     *
     * @mbggenerated Wed Mar 23 17:50:13 CST 2016
     */
    public String getAnswer() {
        return answer;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ex_answer_sheet_question.answer
     *
     * @param answer the value for ex_answer_sheet_question.answer
     *
     * @mbggenerated Wed Mar 23 17:50:13 CST 2016
     */
    public void setAnswer(String answer) {
        this.answer = answer == null ? null : answer.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ex_answer_sheet_question.difficulty
     *
     * @return the value of ex_answer_sheet_question.difficulty
     *
     * @mbggenerated Wed Mar 23 17:50:13 CST 2016
     */
    public Integer getDifficulty() {
        return difficulty;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ex_answer_sheet_question.difficulty
     *
     * @param difficulty the value for ex_answer_sheet_question.difficulty
     *
     * @mbggenerated Wed Mar 23 17:50:13 CST 2016
     */
    public void setDifficulty(Integer difficulty) {
        this.difficulty = difficulty;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ex_answer_sheet_question.type
     *
     * @return the value of ex_answer_sheet_question.type
     *
     * @mbggenerated Wed Mar 23 17:50:13 CST 2016
     */
    public Integer getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ex_answer_sheet_question.type
     *
     * @param type the value for ex_answer_sheet_question.type
     *
     * @mbggenerated Wed Mar 23 17:50:13 CST 2016
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ex_answer_sheet_question.score
     *
     * @return the value of ex_answer_sheet_question.score
     *
     * @mbggenerated Wed Mar 23 17:50:13 CST 2016
     */
    public Integer getScore() {
        return score;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ex_answer_sheet_question.score
     *
     * @param score the value for ex_answer_sheet_question.score
     *
     * @mbggenerated Wed Mar 23 17:50:13 CST 2016
     */
    public void setScore(Integer score) {
        this.score = score;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ex_answer_sheet_question.create_time
     *
     * @return the value of ex_answer_sheet_question.create_time
     *
     * @mbggenerated Wed Mar 23 17:50:13 CST 2016
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ex_answer_sheet_question.create_time
     *
     * @param createTime the value for ex_answer_sheet_question.create_time
     *
     * @mbggenerated Wed Mar 23 17:50:13 CST 2016
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ex_answer_sheet_question.modify_time
     *
     * @return the value of ex_answer_sheet_question.modify_time
     *
     * @mbggenerated Wed Mar 23 17:50:13 CST 2016
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ex_answer_sheet_question.modify_time
     *
     * @param modifyTime the value for ex_answer_sheet_question.modify_time
     *
     * @mbggenerated Wed Mar 23 17:50:13 CST 2016
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ex_answer_sheet_question.status
     *
     * @return the value of ex_answer_sheet_question.status
     *
     * @mbggenerated Wed Mar 23 17:50:13 CST 2016
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ex_answer_sheet_question.status
     *
     * @param status the value for ex_answer_sheet_question.status
     *
     * @mbggenerated Wed Mar 23 17:50:13 CST 2016
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ex_answer_sheet_question.channel
     *
     * @return the value of ex_answer_sheet_question.channel
     *
     * @mbggenerated Wed Mar 23 17:50:13 CST 2016
     */
    public Integer getChannel() {
        return channel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ex_answer_sheet_question.channel
     *
     * @param channel the value for ex_answer_sheet_question.channel
     *
     * @mbggenerated Wed Mar 23 17:50:13 CST 2016
     */
    public void setChannel(Integer channel) {
        this.channel = channel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ex_answer_sheet_question.properties
     *
     * @return the value of ex_answer_sheet_question.properties
     *
     * @mbggenerated Wed Mar 23 17:50:13 CST 2016
     */
    public String getProperties() {
        return properties;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ex_answer_sheet_question.properties
     *
     * @param properties the value for ex_answer_sheet_question.properties
     *
     * @mbggenerated Wed Mar 23 17:50:13 CST 2016
     */
    public void setProperties(String properties) {
        this.properties = properties == null ? null : properties.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ex_answer_sheet_question.memo
     *
     * @return the value of ex_answer_sheet_question.memo
     *
     * @mbggenerated Wed Mar 23 17:50:13 CST 2016
     */
    public String getMemo() {
        return memo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ex_answer_sheet_question.memo
     *
     * @param memo the value for ex_answer_sheet_question.memo
     *
     * @mbggenerated Wed Mar 23 17:50:13 CST 2016
     */
    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ex_answer_sheet_question.user_id
     *
     * @return the value of ex_answer_sheet_question.user_id
     *
     * @mbggenerated Wed Mar 23 17:50:13 CST 2016
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ex_answer_sheet_question.user_id
     *
     * @param userId the value for ex_answer_sheet_question.user_id
     *
     * @mbggenerated Wed Mar 23 17:50:13 CST 2016
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ex_answer_sheet_question.answer_sheet_id
     *
     * @return the value of ex_answer_sheet_question.answer_sheet_id
     *
     * @mbggenerated Wed Mar 23 17:50:13 CST 2016
     */
    public Long getAnswerSheetId() {
        return answerSheetId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ex_answer_sheet_question.answer_sheet_id
     *
     * @param answerSheetId the value for ex_answer_sheet_question.answer_sheet_id
     *
     * @mbggenerated Wed Mar 23 17:50:13 CST 2016
     */
    public void setAnswerSheetId(Long answerSheetId) {
        this.answerSheetId = answerSheetId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ex_answer_sheet_question.question_id
     *
     * @return the value of ex_answer_sheet_question.question_id
     *
     * @mbggenerated Wed Mar 23 17:50:13 CST 2016
     */
    public Long getQuestionId() {
        return questionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ex_answer_sheet_question.question_id
     *
     * @param questionId the value for ex_answer_sheet_question.question_id
     *
     * @mbggenerated Wed Mar 23 17:50:13 CST 2016
     */
    public void setQuestionId(Long questionId) {
        this.questionId = questionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ex_answer_sheet_question.question_order
     *
     * @return the value of ex_answer_sheet_question.question_order
     *
     * @mbggenerated Wed Mar 23 17:50:13 CST 2016
     */
    public Integer getQuestionOrder() {
        return questionOrder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ex_answer_sheet_question.question_order
     *
     * @param questionOrder the value for ex_answer_sheet_question.question_order
     *
     * @mbggenerated Wed Mar 23 17:50:13 CST 2016
     */
    public void setQuestionOrder(Integer questionOrder) {
        this.questionOrder = questionOrder;
    }
}