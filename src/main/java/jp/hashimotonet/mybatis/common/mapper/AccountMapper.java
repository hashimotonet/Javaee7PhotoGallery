package jp.hashimotonet.mybatis.common.mapper;

import static jp.hashimotonet.mybatis.common.mapper.AccountDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import jp.hashimotonet.mybatis.common.mapper.Account;
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
public interface AccountMapper extends CommonCountMapper, CommonDeleteMapper, CommonInsertMapper<Account>, CommonUpdateMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(id, identity, authority, createdAt, updatedAt, password);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="AccountResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="identity", property="identity", jdbcType=JdbcType.VARCHAR),
        @Result(column="authority", property="authority", jdbcType=JdbcType.INTEGER),
        @Result(column="created_at", property="createdAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="updated_at", property="updatedAt", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="password", property="password", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<Account> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("AccountResult")
    Optional<Account> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, account, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, account, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Integer id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(Account row) {
        return MyBatis3Utils.insert(this::insert, row, account, c ->
            c.map(id).toProperty("id")
            .map(identity).toProperty("identity")
            .map(authority).toProperty("authority")
            .map(createdAt).toProperty("createdAt")
            .map(updatedAt).toProperty("updatedAt")
            .map(password).toProperty("password")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertMultiple(Collection<Account> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, account, c ->
            c.map(id).toProperty("id")
            .map(identity).toProperty("identity")
            .map(authority).toProperty("authority")
            .map(createdAt).toProperty("createdAt")
            .map(updatedAt).toProperty("updatedAt")
            .map(password).toProperty("password")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(Account row) {
        return MyBatis3Utils.insert(this::insert, row, account, c ->
            c.map(id).toPropertyWhenPresent("id", row::getId)
            .map(identity).toPropertyWhenPresent("identity", row::getIdentity)
            .map(authority).toPropertyWhenPresent("authority", row::getAuthority)
            .map(createdAt).toPropertyWhenPresent("createdAt", row::getCreatedAt)
            .map(updatedAt).toPropertyWhenPresent("updatedAt", row::getUpdatedAt)
            .map(password).toPropertyWhenPresent("password", row::getPassword)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Account> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, account, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<Account> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, account, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<Account> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, account, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Account> selectByPrimaryKey(Integer id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, account, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(Account row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(row::getId)
                .set(identity).equalTo(row::getIdentity)
                .set(authority).equalTo(row::getAuthority)
                .set(createdAt).equalTo(row::getCreatedAt)
                .set(updatedAt).equalTo(row::getUpdatedAt)
                .set(password).equalTo(row::getPassword);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(Account row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(row::getId)
                .set(identity).equalToWhenPresent(row::getIdentity)
                .set(authority).equalToWhenPresent(row::getAuthority)
                .set(createdAt).equalToWhenPresent(row::getCreatedAt)
                .set(updatedAt).equalToWhenPresent(row::getUpdatedAt)
                .set(password).equalToWhenPresent(row::getPassword);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(Account row) {
        return update(c ->
            c.set(identity).equalTo(row::getIdentity)
            .set(authority).equalTo(row::getAuthority)
            .set(createdAt).equalTo(row::getCreatedAt)
            .set(updatedAt).equalTo(row::getUpdatedAt)
            .set(password).equalTo(row::getPassword)
            .where(id, isEqualTo(row::getId))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(Account row) {
        return update(c ->
            c.set(identity).equalToWhenPresent(row::getIdentity)
            .set(authority).equalToWhenPresent(row::getAuthority)
            .set(createdAt).equalToWhenPresent(row::getCreatedAt)
            .set(updatedAt).equalToWhenPresent(row::getUpdatedAt)
            .set(password).equalToWhenPresent(row::getPassword)
            .where(id, isEqualTo(row::getId))
        );
    }
}