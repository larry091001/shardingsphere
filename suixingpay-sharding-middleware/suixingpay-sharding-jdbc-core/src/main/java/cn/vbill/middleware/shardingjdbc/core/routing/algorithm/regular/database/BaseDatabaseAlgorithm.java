/**
 * All rights Reserved, Designed By Suixingpay.
 *
 * @author: zhangkewei[zhang_kw@suixingpay.com]
 * @date: 2018年07月11日 14:35
 * @Copyright ©2018 Suixingpay. All rights reserved.
 *  注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */

package cn.vbill.middleware.shardingjdbc.core.routing.algorithm.regular.database;

import cn.vbill.middleware.shardingjdbc.core.routing.algorithm.regular.SuffixRegularAlgorithm;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Properties;

import org.apache.shardingsphere.api.sharding.DatabaseShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.ShardingValue;
import org.apache.shardingsphere.api.sharding.standard.PreciseShardingValue;
import org.apache.shardingsphere.core.strategy.route.value.ListRouteValue;
import org.apache.shardingsphere.core.strategy.route.value.RouteValue;

/**
 * @author: zhangkewei[zhang_kw@suixingpay.com]
 * @date: 2018年07月11日 14:35
 * @version: V1.0
 * @review: zkevin/2018年07月11日 14:35
 */
@SuppressWarnings("rawtypes")
@NoArgsConstructor
public abstract class BaseDatabaseAlgorithm extends SuffixRegularAlgorithm implements DatabaseShardingAlgorithm<RouteValue> {
    public BaseDatabaseAlgorithm(Properties attr) {
        super(attr);
    }

    public Collection<String> doSharding(Collection<String> availableDbNames, Collection<RouteValue> shardingValues, String logicSql) {
        List<String> selected = new ArrayList<>();
        //TODO larry 
        if (null != shardingValues && !shardingValues.isEmpty()) {
        	routeTransform(shardingValues).forEach(v -> {
                selected.add(doSharding(availableDbNames, new PreciseShardingValue(v.getLogicTableName(), v.getColumnName(), v.getValue())));
            });
        } else {
            selected.addAll(noConditionSharding(availableDbNames, logicSql));
        }
        return selected;
    }

    /**
     *
     * 	当前sql没有匹配到规则，并且没有配置默认数据库时触发
     * @param availableDbNames
     * @param logicSql 逻辑SQL
     * @return
     */
    public abstract Collection<String> noConditionSharding(Collection<String> availableDbNames, String logicSql);

    @Override
    protected String spellSharding(String logicalName, PreciseShardingValue shardingValue) {
        throw new UnsupportedOperationException("仅返回候选数据库列表,不支持逻辑数据库名");
    }
}
