package win.forexam.mybatis;


import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MybatisUtils {

    private static final String CONFIG_PATH = "mybatis_config.xml";

    /*
     * ��ȡ���ݿ��������
     */
    public static SqlSession getSqlSession() {
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
            e.printStackTrace();
        }
        return session;
    }

    /*
     * �ر����ݿ��������
     */
    public static void closeSession(SqlSession session) {
        session.close();
    }
    
   
}