/**
 * All rights Reserved, Designed By Suixingpay.
 *
 * @author: zhangkewei[zhang_kw@suixingpay.com]
 * @date: 2018年07月11日 16:50
 * @Copyright ©2018 Suixingpay. All rights reserved.
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */

package cn.vbill.middleware.shardingjdbc.core.routing.algorithm.regular.database;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Collection;
import java.util.List;
import java.util.Properties;
import java.util.stream.Collectors;

import org.apache.shardingsphere.api.sharding.ShardingValue;
import org.apache.shardingsphere.api.sharding.standard.PreciseShardingValue;
import org.apache.shardingsphere.core.strategy.route.value.RouteValue;

/**
 * @author: zhangkewei[zhang_kw@suixingpay.com]
 * @date: 2018年07月11日 16:50
 * @version: V1.0
 * @review: zkevin/2018年07月11日 16:50
 */
@Getter @Setter
@NoArgsConstructor
public class RWHashDatabaseShardingAlgorithm extends HashDatabaseShardingAlgorithm {
    private String globalRead = "read";
    private String readEndFix = "_read";

    public RWHashDatabaseShardingAlgorithm(Properties attr) {
        super(attr);
        globalRead = attr.getProperty("globalRead", globalRead);
        readEndFix = attr.getProperty("readEndFix", readEndFix);
    }

    @Override
    public Collection<String> doSharding(Collection<String> availableDbNames, Collection<RouteValue> shardingValues, String logicSql) {
        //尝试读写分离查询
        if (logicSql.toLowerCase().startsWith("select")) {
            List<PreciseShardingValue> sharedValues = routeTransform(shardingValues);
            Collection<String> selected = null == shardingValues || shardingValues.isEmpty()
                    ? availableDbNames.stream().filter(d -> d.equalsIgnoreCase(globalRead)).collect(Collectors.toList()) : 
                    	availableDbNames.stream().filter(d -> sharedValues.stream()
                    			.filter(v -> d.endsWith(computeName(v) + readEndFix)).count() > 0).collect(Collectors.toList());
            if (null != selected && !selected.isEmpty()) return selected;
        }
        //过滤掉读库选择项
        availableDbNames = availableDbNames.size() <= 1 ? availableDbNames
                : availableDbNames.stream().filter(db -> !db.endsWith(readEndFix) && !db.equalsIgnoreCase(globalRead)).collect(Collectors.toList());
        return super.doSharding(availableDbNames, shardingValues, logicSql);
    }
}
