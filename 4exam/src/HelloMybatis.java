

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.javassist.compiler.ast.Visitor;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.exception.InvalidConfigurationException;
import org.mybatis.generator.exception.XMLParserException;
import org.mybatis.generator.internal.DefaultShellCallback;

public class HelloMybatis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//testBasicQuery(1);
		generateMbgConfiguration();
		//testGenerateAdd();
	}

	public static void testBasicQuery(int id) {
		SqlSession session = MybatisUtils.getSqlSession();
		try {
			Visitor visitor = (Visitor) session.selectOne("david.mybatis.demo.IVisitorOperation.basicQuery", id);
			MybatisUtils.closeSession(session);
			System.out.println("visitor");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("visitor" + e.getMessage());
		}
	}

	private static void generateMbgConfiguration() {
		/*
		 * Mybatis自带Generator工具生成相应东西
		 */
		List<String> warnings = new ArrayList<String>();
		boolean overwrite = true;
		File configFile = new File("./config/mbg_configuration.xml");
		ConfigurationParser cp = new ConfigurationParser(warnings);
		Configuration config = null;
		try {
			config = cp.parseConfiguration(configFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (XMLParserException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		DefaultShellCallback callback = new DefaultShellCallback(overwrite);
		try {
			MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
			myBatisGenerator.generate(null);
		} catch (InvalidConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("生成Mybatis配置成功！");
	}

	
}
