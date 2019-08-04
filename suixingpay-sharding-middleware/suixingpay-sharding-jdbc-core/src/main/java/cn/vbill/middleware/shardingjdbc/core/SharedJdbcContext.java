/**
 * All rights Reserved, Designed By Suixingpay.
 *
 * @author: zhangkewei[zhang_kw@suixingpay.com]
 * @date: 2018年06月21日 10:16
 * @Copyright ©2018 Suixingpay. All rights reserved.
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */

package cn.vbill.middleware.shardingjdbc.core;

import javax.sql.DataSource;
import java.util.Map;
import java.util.Set;

/**
 * @author: zhangkewei[zhang_kw@suixingpay.com]
 * @date: 2018年06月21日 10:16
 * @version: V1.0 2
 * @review: zkevin/2018年06月21日 10:16
 */
public class SharedJdbcContext {
    private final Map<String, DataSource> dataSources;

    public SharedJdbcContext(Map<String, DataSource> dataSources) {
        this.dataSources = dataSources;
    }

    public DataSource getDataSource(String sourceName) {
        return dataSources.getOrDefault(sourceName, null);
    }

    public DataSource getDataSource() {
        return dataSources.values().iterator().next();
    }
    public Set<String> logicalDbNames() {
        return dataSources.keySet();
    }
}
