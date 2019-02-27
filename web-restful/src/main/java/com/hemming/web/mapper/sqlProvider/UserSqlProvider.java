package com.hemming.web.mapper.sqlProvider;

import com.hemming.web.PO.UserPO;
import org.apache.ibatis.jdbc.SQL;

public class UserSqlProvider {
    private static final String ALL_FIELD = "id, name,password,created_at, updated_at";
    private static final String TABLE = "user";

    public String listAllUser(Long id) {
        SQL sql = new SQL();
        sql.SELECT(ALL_FIELD).FROM(TABLE);
        return sql.toString();
    }

    public String create(UserPO userPO) {
        SQL sql = new SQL();

        sql.INSERT_INTO(TABLE);

        if (userPO.getName() != null) {
            sql.VALUES("name", "#{userPO.name}");
        }

        if (userPO.getPassword() != null) {
            sql.VALUES("password", "#{userPO.password}");
        }

        return sql.toString();
    }
}
