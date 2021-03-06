package win.forexam.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import win.forexam.model.Question;
import win.forexam.model.QuestionExample;

public interface QuestionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ex_question
     *
     * @mbggenerated Wed Mar 23 20:43:31 CST 2016
     */
    int countByExample(QuestionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ex_question
     *
     * @mbggenerated Wed Mar 23 20:43:31 CST 2016
     */
    int deleteByExample(QuestionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ex_question
     *
     * @mbggenerated Wed Mar 23 20:43:31 CST 2016
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ex_question
     *
     * @mbggenerated Wed Mar 23 20:43:31 CST 2016
     */
    int insert(Question record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ex_question
     *
     * @mbggenerated Wed Mar 23 20:43:31 CST 2016
     */
    int insertSelective(Question record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ex_question
     *
     * @mbggenerated Wed Mar 23 20:43:31 CST 2016
     */
    List<Question> selectByExample(QuestionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ex_question
     *
     * @mbggenerated Wed Mar 23 20:43:31 CST 2016
     */
    Question selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ex_question
     *
     * @mbggenerated Wed Mar 23 20:43:31 CST 2016
     */
    int updateByExampleSelective(@Param("record") Question record, @Param("example") QuestionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ex_question
     *
     * @mbggenerated Wed Mar 23 20:43:31 CST 2016
     */
    int updateByExample(@Param("record") Question record, @Param("example") QuestionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ex_question
     *
     * @mbggenerated Wed Mar 23 20:43:31 CST 2016
     */
    int updateByPrimaryKeySelective(Question record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ex_question
     *
     * @mbggenerated Wed Mar 23 20:43:31 CST 2016
     */
    int updateByPrimaryKey(Question record);
}