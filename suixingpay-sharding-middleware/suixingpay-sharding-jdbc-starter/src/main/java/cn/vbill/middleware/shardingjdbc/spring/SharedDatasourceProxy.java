/**
 * All rights Reserved, Designed By Suixingpay.
 *
 * @author: zhangkewei[zhang_kw@suixingpay.com]
 * @date: 2018年07月24日 17:50
 * @Copyright ©2018 Suixingpay. All rights reserved.
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */

package cn.vbill.middleware.shardingjdbc.spring;


import cn.vbill.middleware.shardingjdbc.core.SharedJdbcContext;

import javax.sql.DataSource;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.logging.Logger;

/**
 * @author: zhangkewei[zhang_kw@suixingpay.com]
 * @date: 2018年07月24日 17:50
 * @version: V1.0
 * @review: zkevin/2018年07月24日 17:50
 */
public class SharedDatasourceProxy implements DataSource {
    private String dbName;
    private SharedJdbcContext context;
    private DataSource proxyObject;

    public  SharedDatasourceProxy(String dbName, SharedJdbcContext context) {
        this.dbName = dbName;
        this.context = context;
        proxyObject = context.getDataSource(dbName);
    }

    @Override
    public Connection getConnection() throws SQLException {
        return proxyObject.getConnection();
    }

    @Override
    public Connection getConnection(String username, String password) throws SQLException {
        return proxyObject.getConnection(username, password);
    }

    @Override
    public <T> T unwrap(Class<T> iface) throws SQLException {
        return proxyObject.unwrap(iface);
    }

    @Override
    public boolean isWrapperFor(Class<?> iface) throws SQLException {
        return proxyObject.isWrapperFor(iface);
    }

    @Override
    public PrintWriter getLogWriter() throws SQLException {
        return proxyObject.getLogWriter();
    }

    @Override
    public void setLogWriter(PrintWriter out) throws SQLException {
        proxyObject.setLogWriter(out);
    }

    @Override
    public void setLoginTimeout(int seconds) throws SQLException {
        proxyObject.setLoginTimeout(seconds);
    }

    @Override
    public int getLoginTimeout() throws SQLException {
        return proxyObject.getLoginTimeout();
    }

    @Override
    public Logger getParentLogger() throws SQLFeatureNotSupportedException {
        return proxyObject.getParentLogger();
    }

    @Override
    public int hashCode() {
        return proxyObject.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return proxyObject.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return proxyObject.toString();
    }
}
