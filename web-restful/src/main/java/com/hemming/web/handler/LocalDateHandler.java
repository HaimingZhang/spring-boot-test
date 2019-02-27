package com.hemming.web.handler;

import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.TypeHandler;

import java.sql.*;
import java.time.LocalDate;

public class LocalDateHandler implements TypeHandler<LocalDate> {
    @Override
    public void setParameter(PreparedStatement ps, int i, LocalDate parameter, JdbcType jdbcType) throws SQLException {
        if (parameter == null) {
            ps.setTimestamp(i, null);
        }else {
            ps.setDate(i, Date.valueOf(parameter));
        }
    }

    @Override
    public LocalDate getResult(ResultSet rs, String columnName) throws SQLException {
        return rs.getDate(columnName).toLocalDate();
    }

    @Override
    public LocalDate getResult(ResultSet rs, int columnIndex) throws SQLException {
        return rs.getDate(columnIndex).toLocalDate();
    }

    @Override
    public LocalDate getResult(CallableStatement cs, int columnIndex) throws SQLException {
        return cs.getDate(columnIndex).toLocalDate();
    }
}
