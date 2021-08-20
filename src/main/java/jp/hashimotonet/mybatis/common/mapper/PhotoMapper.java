package jp.hashimotonet.mybatis.common.mapper;

import static jp.hashimotonet.mybatis.common.mapper.PhotoDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import jp.hashimotonet.mybatis.common.mapper.Photo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.type.JdbcType;
import org.mybatis.dynamic.sql.BasicColumn;
import org.mybatis.dynamic.sql.delete.DeleteDSLCompleter;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.UpdateDSL;
import org.mybatis.dynamic.sql.update.UpdateDSLCompleter;
import org.mybatis.dynamic.sql.update.UpdateModel;
import org.mybatis.dynamic.sql.util.SqlProviderAdapter;
import org.mybatis.dynamic.sql.util.mybatis3.CommonCountMapper;
import org.mybatis.dynamic.sql.util.mybatis3.CommonDeleteMapper;
import org.mybatis.dynamic.sql.util.mybatis3.CommonInsertMapper;
import org.mybatis.dynamic.sql.util.mybatis3.CommonUpdateMapper;
import org.mybatis.dynamic.sql.util.mybatis3.MyBatis3Utils;

@Mapper
public interface PhotoMapper extends CommonCountMapper, CommonDeleteMapper, CommonInsertMapper<Photo>, CommonUpdateMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(id, identity, authority, alt, createdAt, updatedAt, data, thumbnail);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="PhotoResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="identity", property="identity", jdbcType=JdbcType.VARCHAR),
        @Result(column="authority", property="authority", jdbcType=JdbcType.INTEGER),
        @Result(column="alt", property="alt", jdbcType=JdbcType.VARCHAR),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="updated_at", property="updatedAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="data", property="data", jdbcType=JdbcType.LONGVARBINARY),
        @Result(column="thumbnail", property="thumbnail", jdbcType=JdbcType.LONGVARBINARY)
    })
    List<Photo> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("PhotoResult")
    Optional<Photo> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, photo, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, photo, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Integer id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(Photo row) {
        return MyBatis3Utils.insert(this::insert, row, photo, c ->
            c.map(id).toProperty("id")
            .map(identity).toProperty("identity")
            .map(authority).toProperty("authority")
            .map(alt).toProperty("alt")
            .map(createdAt).toProperty("createdAt")
            .map(updatedAt).toProperty("updatedAt")
            .map(data).toProperty("data")
            .map(thumbnail).toProperty("thumbnail")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertMultiple(Collection<Photo> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, photo, c ->
            c.map(id).toProperty("id")
            .map(identity).toProperty("identity")
            .map(authority).toProperty("authority")
            .map(alt).toProperty("alt")
            .map(createdAt).toProperty("createdAt")
            .map(updatedAt).toProperty("updatedAt")
            .map(data).toProperty("data")
            .map(thumbnail).toProperty("thumbnail")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(Photo row) {
        return MyBatis3Utils.insert(this::insert, row, photo, c ->
            c.map(id).toPropertyWhenPresent("id", row::getId)
            .map(identity).toPropertyWhenPresent("identity", row::getIdentity)
            .map(authority).toPropertyWhenPresent("authority", row::getAuthority)
            .map(alt).toPropertyWhenPresent("alt", row::getAlt)
            .map(createdAt).toPropertyWhenPresent("createdAt", row::getCreatedAt)
            .map(updatedAt).toPropertyWhenPresent("updatedAt", row::getUpdatedAt)
            .map(data).toPropertyWhenPresent("data", row::getData)
            .map(thumbnail).toPropertyWhenPresent("thumbnail", row::getThumbnail)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Photo> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, photo, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<Photo> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, photo, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<Photo> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, photo, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Photo> selectByPrimaryKey(Integer id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, photo, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(Photo row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(row::getId)
                .set(identity).equalTo(row::getIdentity)
                .set(authority).equalTo(row::getAuthority)
                .set(alt).equalTo(row::getAlt)
                .set(createdAt).equalTo(row::getCreatedAt)
                .set(updatedAt).equalTo(row::getUpdatedAt)
                .set(data).equalTo(row::getData)
                .set(thumbnail).equalTo(row::getThumbnail);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(Photo row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(row::getId)
                .set(identity).equalToWhenPresent(row::getIdentity)
                .set(authority).equalToWhenPresent(row::getAuthority)
                .set(alt).equalToWhenPresent(row::getAlt)
                .set(createdAt).equalToWhenPresent(row::getCreatedAt)
                .set(updatedAt).equalToWhenPresent(row::getUpdatedAt)
                .set(data).equalToWhenPresent(row::getData)
                .set(thumbnail).equalToWhenPresent(row::getThumbnail);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(Photo row) {
        return update(c ->
            c.set(identity).equalTo(row::getIdentity)
            .set(authority).equalTo(row::getAuthority)
            .set(alt).equalTo(row::getAlt)
            .set(createdAt).equalTo(row::getCreatedAt)
            .set(updatedAt).equalTo(row::getUpdatedAt)
            .set(data).equalTo(row::getData)
            .set(thumbnail).equalTo(row::getThumbnail)
            .where(id, isEqualTo(row::getId))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(Photo row) {
        return update(c ->
            c.set(identity).equalToWhenPresent(row::getIdentity)
            .set(authority).equalToWhenPresent(row::getAuthority)
            .set(alt).equalToWhenPresent(row::getAlt)
            .set(createdAt).equalToWhenPresent(row::getCreatedAt)
            .set(updatedAt).equalToWhenPresent(row::getUpdatedAt)
            .set(data).equalToWhenPresent(row::getData)
            .set(thumbnail).equalToWhenPresent(row::getThumbnail)
            .where(id, isEqualTo(row::getId))
        );
    }
}