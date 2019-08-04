/**
 * All rights Reserved, Designed By Suixingpay.
 *
 * @author: zhangkewei[zhang_kw@suixingpay.com]
 * @date: 2018年07月09日 15:06
 * @Copyright ©2018 Suixingpay. All rights reserved.
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */

package cn.vbill.middleware.shardingjdbc.core.routing.algorithm;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Properties;

import org.apache.shardingsphere.api.sharding.ShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.ShardingValue;
import org.apache.shardingsphere.api.sharding.standard.PreciseShardingValue;
import org.apache.shardingsphere.core.strategy.route.value.ListRouteValue;
//import org.apache.shardingsphere.core.strategy.route.value.ListShardingValue;
import org.apache.shardingsphere.core.strategy.route.value.RouteValue;


/**
 * @author: zhangkewei[zhang_kw@suixingpay.com]
 * @date: 2018年07月09日 15:06
 * @version: V1.0
 * @review: zkevin/2018年07月09日 15:06
 */
@NoArgsConstructor
public abstract class BaseAlgorithm implements ShardingAlgorithm {
    @Getter(AccessLevel.PROTECTED)
    @Setter
    private Properties attr;

    public BaseAlgorithm(Properties attr) {
        this.attr = attr;
    }

    //TODO larry
   /* protected List<PreciseShardingValue> transform(Collection<ShardingValue> shardingValues) {
        List<PreciseShardingValue> transformed = new ArrayList<>();
        shardingValues.forEach(value -> {
            if (value instanceof PreciseShardingValue) {
                transformed.add((PreciseShardingValue) value);
            } else if (value instanceof ListShardingValue) {
                ((ListShardingValue<Comparable<?>>) value).getValues().forEach(v -> {
                	//TODO larry
                    transformed.add(new PreciseShardingValue(((PreciseShardingValue) value).getLogicTableName(), ((PreciseShardingValue) value).getColumnName(), v));
                });
            }
        });
        return transformed;
    }*/
    
    //TODO larry routeValue
    protected List<PreciseShardingValue> routeTransform(Collection<RouteValue> routeValue){
    	List<PreciseShardingValue> transformed = new ArrayList<>();
    	routeValue.forEach(value -> {
    		 if (value instanceof ListRouteValue) {
                 ((ListRouteValue<Comparable<?>>) value).getValues().forEach(v -> {
                     transformed.add(new PreciseShardingValue(value.getTableName(), value.getColumnName(), v));
                 });
             }
    	});
    	
    	return transformed;
    }
}
