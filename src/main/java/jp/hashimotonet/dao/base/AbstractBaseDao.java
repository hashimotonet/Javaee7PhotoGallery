package jp.hashimotonet.dao.base;

import java.io.IOException;
import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class AbstractBaseDao {

    /**
     * 接続プロパティを持つファイル名
     */
    private final String propertyFile = "PGatAmazonAWS.properties";

    /**
     * 接続URL
     */
    private String url;

    /**
     * 接続ユーザ
     */
    private String user;

    /**
     * 接続パスワード
     */
    private String password;
    
    /**
     * 接続ドライバ名
     */
    private String driverName;

    /**
     * JDBC接続オブジェクト
     */
    private Connection conn;
    
    /**
     * Logger.
     */
    private Logger log = LogManager.getLogger(AbstractBaseDao.class);

    /**
     * デフォルトコンストラクタ
     *
     * JDBCドライバをロードし、システムの
     * DB接続プロパティを取得します。
     *
     * @throws ClassNotFoundException クラスが見つからない例外
     * @throws IOException 入出力例外
     * @throws URISyntaxException URIシンタックス例外
     */
    public AbstractBaseDao()
//            throws ClassNotFoundException,
//            IOException,
//            URISyntaxException 
    {

//        // プロパティ読み込みユーティリティを起動
//        log.info(propertyFile);
//        PropertyUtil util = new PropertyUtil(propertyFile);
//
//        // データベース接続に必要なプロパティ読み込み
//        this.url = util.get("URL"); // URLを取得
//        this.user = util.get("USER"); // ユーザ名を取得
//        this.password = util.get("PASSWORD"); // パスワードを取得
//        this.driverName = util.get("DRIVER_NAME");	// 接続JDBCドライバ名を取得
//
//        // MySQLドライバをロード
//        Class.forName(this.driverName);
    }

    /**
     * JDBC接続を取得するメソッド
     *
     * @return JDBC接続
     * @throws NamingException 
     * @throws SQLException SQL例外
     */
//    public Connection getConnection()
//            throws SQLException {
//        // JDBC接続を取得
//        this.conn = DriverManager.getConnection(url, user, password);
//
//        // 自動コミットモードはOFFにする
//        this.conn.setAutoCommit(false);
//
//        // オープンしたJDBC接続を返却する
//        return conn;
//    }
    
    public Connection getConnection() throws NamingException, SQLException {
    	  Context ctx = new InitialContext();
    	  DataSource ds = (DataSource)ctx.lookup("jdbc/gallery");
//    	  DataSource ds = (DataSource)ctx.lookup("java:comp/env/jdbc/gallery");
    	  this.conn = ds.getConnection();
    	  return this.conn;
     }

    /**
     * JDBC接続をコミットします。
     *
     * @throws SQLException SQL例外
     */
    public void commit()
            throws SQLException {

        // 接続をコミットします
    	if (this.conn != null) {
    		this.conn.commit();
    	}

    }

    /**
     * JDBC接続をロールバックします。
     *
     * @throws SQLException SQL例外
     */
    public void rollback()
            throws SQLException {

        // 接続をロールバックします
    	if (this.conn != null) {
    		this.conn.rollback();
    	}

    }

    /**
     * JDBC接続をクローズし、リソースを解放します
     *
     * @throws SQLException SQL例外
     */
    public void close()
            throws SQLException {

        // 接続をクローズします
    	if (this.conn != null) {
    		this.conn.close();
    	}

    }

    /**
     * デストラクタです。
     */
    @Override
    public void finalize()
            throws SQLException {
        close();
    }

}
