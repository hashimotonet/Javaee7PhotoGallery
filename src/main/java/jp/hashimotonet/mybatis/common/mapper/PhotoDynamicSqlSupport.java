package jp.hashimotonet.mybatis.common.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class PhotoDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final Photo photo = new Photo();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> id = photo.id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> identity = photo.identity;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> authority = photo.authority;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> alt = photo.alt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Date> createdAt = photo.createdAt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Date> updatedAt = photo.updatedAt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<byte[]> data = photo.data;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<byte[]> thumbnail = photo.thumbnail;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class Photo extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<String> identity = column("identity", JDBCType.VARCHAR);

        public final SqlColumn<Integer> authority = column("authority", JDBCType.INTEGER);

        public final SqlColumn<String> alt = column("alt", JDBCType.VARCHAR);

        public final SqlColumn<Date> createdAt = column("created_at", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> updatedAt = column("updated_at", JDBCType.TIMESTAMP);

        public final SqlColumn<byte[]> data = column("data", JDBCType.LONGVARBINARY);

        public final SqlColumn<byte[]> thumbnail = column("thumbnail", JDBCType.LONGVARBINARY);

        public Photo() {
            super("photo");
        }
    }
}