/**
 * 
 */
package jp.hashimotonet.mybatis.util;

import javax.naming.InitialContext;
import javax.sql.DataSource;

import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.TransactionFactory;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author hashi
 *
 */
public class SessionUtil {
	
	/**
	 * Logger.
	 */
	private static Logger log = LogManager.getLogger(SessionUtil.class);

	/**
	 * インスタンス化禁止
	 */
	private SessionUtil() {

	}

	/**
	 * SqlSession 取得メソッド
	 * 
	 * @return SqlSession.																																																																																																																																																																																																																																																																														
	 */
	public static SqlSession createSession() {
	    SqlSession session = null;
	    SqlSessionFactory ssf = null;

	    try {
	        DataSource dataSource = InitialContext.doLookup("jdbc/myDatasource");
	        TransactionFactory transactionFactory = new JdbcTransactionFactory();
	        Environment environment = new Environment("development", transactionFactory, dataSource);
	        Configuration configuration = new Configuration(environment);
	        configuration.addMappers("jp.hashimotonet.mybatis.cmn.mapper");
	        ssf = new SqlSessionFactoryBuilder().build(configuration);
	        session = ssf.openSession(false);
	    } catch (Exception e) {
	        log.catching(e);
	    }

	    return session;
	}

}
