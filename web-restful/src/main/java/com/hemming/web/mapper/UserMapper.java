package com.hemming.web.mapper;


import com.hemming.web.PO.UserPO;
import com.hemming.web.handler.LocalDateTimeHandler;
import com.hemming.web.mapper.sqlProvider.UserSqlProvider;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.List;

@Component
public interface UserMapper {
    @SelectProvider(type = UserSqlProvider.class, method = "listAllUser")
    @Results(id = "userResult", value = {
            @Result(property = "id", column = "id", javaType = Long.class, jdbcType = JdbcType.BIGINT, id = true),
            @Result(property = "name", column = "name", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Result(property = "password", column = "password", javaType = String.class, jdbcType = JdbcType.VARCHAR),
            @Result(property = "createdAt", column = "created_at", javaType = LocalDateTime.class, jdbcType = JdbcType.TIMESTAMP, typeHandler = LocalDateTimeHandler.class),
            @Result(property = "updatedAt", column = "updated_at", javaType = LocalDateTime.class, jdbcType = JdbcType.TIMESTAMP, typeHandler = LocalDateTimeHandler.class),
    })
    List<UserPO> listAllUser();

    @InsertProvider(type = UserSqlProvider.class, method = "create")
    @Options(useGeneratedKeys = true, keyColumn = "id", keyProperty = "userPO.id")
    Long create(@Param("userPO") UserPO userPO);


}
