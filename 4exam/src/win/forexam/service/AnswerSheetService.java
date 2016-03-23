package win.forexam.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import win.forexam.bean.AnswerSheetBean;
import win.forexam.dao.AnswerSheetMapper;
import win.forexam.dao.AnswerSheetQuestionMapper;
import win.forexam.model.AnswerSheet;
import win.forexam.model.AnswerSheetQuestion;
import win.forexam.model.AnswerSheetQuestionExample;

public class AnswerSheetService extends DBService {
	/**
	 * @param answerSheetBean
	 * @return
	 */
	public Long createAnswerSheet(AnswerSheetBean answerSheetBean) {
		SqlSession sqlSession = getSqlSession();
		AnswerSheetMapper opAnswerSheet = sqlSession
				.getMapper(AnswerSheetMapper.class);
		AnswerSheet answerSheet = answerSheetBean.getAnswerSheet();
		opAnswerSheet.insertSelective(answerSheet);

		Long answerSheetId = answerSheet.getId();

		AnswerSheetQuestionMapper opQuestion = sqlSession
				.getMapper(AnswerSheetQuestionMapper.class);
		for (int i = 0; i < answerSheetBean.getListQuestion().size(); i++) {
			AnswerSheetQuestion question = answerSheetBean.getListQuestion()
					.get(i);
			question.setAnswerSheetId(answerSheetId);
			opQuestion.insertSelective(question);
		}

		sqlSession.commit();
		closeSession(sqlSession);
		return answerSheetId;
	}

	public AnswerSheetBean getAnswerSheetById(Long answerSheetId) {
		AnswerSheetBean bean = new AnswerSheetBean();

		SqlSession sqlSession = getSqlSession();
		AnswerSheetMapper opAnswerSheet = sqlSession
				.getMapper(AnswerSheetMapper.class);

		AnswerSheet answerSheet = opAnswerSheet
				.selectByPrimaryKey(answerSheetId);
		bean.setAnswerSheet(answerSheet);

		AnswerSheetQuestionMapper opQuestion = sqlSession
				.getMapper(AnswerSheetQuestionMapper.class);
		AnswerSheetQuestionExample example = new AnswerSheetQuestionExample();
		// Criteria c = new
		example.createCriteria().andAnswerSheetIdEqualTo(answerSheetId);

		List<AnswerSheetQuestion> listQuestion = opQuestion
				.selectByExample(example);
		
		bean.setListQuestion(listQuestion);
		return bean;
	}
}
