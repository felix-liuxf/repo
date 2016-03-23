package win.forexam.service;

import org.apache.ibatis.session.SqlSession;

import win.forexam.bean.AnswerSheetBean;
import win.forexam.dao.AnswerSheetMapper;
import win.forexam.dao.AnswerSheetQuestionMapper;
import win.forexam.model.AnswerSheet;
import win.forexam.model.AnswerSheetQuestion;

public class AnswerSheetService extends DBService{
	/**
	 * @param answerSheetBean
	 * @return
	 */
	public Long createAnswerSheet(AnswerSheetBean answerSheetBean)
	{
		 SqlSession sqlSession = getSqlSession();
		 AnswerSheetMapper opAnswerSheet = sqlSession.getMapper(AnswerSheetMapper.class);
		 AnswerSheet answerSheet =answerSheetBean.getAnswerSheet();
		 opAnswerSheet.insertSelective(answerSheet);
		 
		 Long answerSheetId= answerSheet.getId();
		 
		 AnswerSheetQuestionMapper opQuestion = sqlSession.getMapper(AnswerSheetQuestionMapper.class);
		 for(int i=0;i<answerSheetBean.getListQuestion().size();i++)
		 {
			 AnswerSheetQuestion question= answerSheetBean.getListQuestion().get(i);
			 question.setAnswerSheetId(answerSheetId);
			 opQuestion.insertSelective(question);
		 }
		 
		 sqlSession.commit();
		 closeSession(sqlSession);
		return new Long(0);
	}
}
