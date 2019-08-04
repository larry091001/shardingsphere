/**
 * All rights Reserved, Designed By Suixingpay.
 *
 * @author: zhangkewei[zhang_kw@suixingpay.com]
 * @date: 2018年07月17日 16:03
 * @Copyright ©2018 Suixingpay. All rights reserved.
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */

package cn.vbill.middleware.shardingjdbc.core.routing.algorithm.hint;

import cn.vbill.middleware.shardingjdbc.core.routing.algorithm.BaseAlgorithm;

import java.util.Properties;

import org.apache.shardingsphere.api.sharding.hint.HintShardingAlgorithm;

/**
 * 	仅作数据库路由
 * 	通过HintManager.getInstance().setDatabaseShardingValue()触发
 * io.shardingjdbc.core.routing.router.SQLRouterFactory.createSQLRouter
 * @author: zhangkewei[zhang_kw@suixingpay.com]
 * @date: 2018年07月17日 16:03
 * @version: V1.0
 * @review: zkevin/2018年07月17日 16:03
 */
public abstract class DatabaseOnlyHintAlgorithm extends BaseAlgorithm implements HintShardingAlgorithm {
    public DatabaseOnlyHintAlgorithm(Properties properties) {
        super(properties);
    }
}
