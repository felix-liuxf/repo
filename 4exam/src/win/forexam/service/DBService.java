package win.forexam.service;


import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DBService {

    private static final String CONFIG_PATH = "mybatis_config.xml";
    private Logger logger = LogManager.getLogger(this.getClass());
    /*
     * ��ȡ���ݿ��������
     */
    public  SqlSession getSqlSession() {
        SqlSession session = null;
        try {
            InputStream stream = Resources.getResourceAsStream(CONFIG_PATH);
            //���Ը������õ���Ӧ������ȡ��Ӧ�����ݿ⻷��
            // SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(
            // stream, "development"); 
            SqlSessionFactory factory = new SqlSessionFactoryBuilder()
                    .build(stream);
            session = factory.openSession();
        } catch (Exception e) {
            // TODO: handle exception
        	logger.error(e.getMessage(),e);
            //e.printStackTrace();
        }
        return session;
    }

    /*
     * �ر����ݿ��������
     */
    public  void closeSession(SqlSession session) {
        session.close();
    }

	
    
   
}