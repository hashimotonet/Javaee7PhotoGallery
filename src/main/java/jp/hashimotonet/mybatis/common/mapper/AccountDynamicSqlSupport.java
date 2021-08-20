package jp.hashimotonet.mybatis.common.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class AccountDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final Account account = new Account();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> id = account.id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> identity = account.identity;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> authority = account.authority;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Date> createdAt = account.createdAt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Date> updatedAt = account.updatedAt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> password = account.password;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class Account extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<String> identity = column("identity", JDBCType.VARCHAR);

        public final SqlColumn<Integer> authority = column("authority", JDBCType.INTEGER);

        public final SqlColumn<Date> createdAt = column("created_at", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> updatedAt = column("updated_at", JDBCType.TIMESTAMP);

        public final SqlColumn<String> password = column("password", JDBCType.LONGVARCHAR);

        public Account() {
            super("account");
        }
    }
}