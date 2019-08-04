/**
 * All rights Reserved, Designed By Suixingpay.
 *
 * @author: zhangkewei[zhang_kw@suixingpay.com]
 * @date: 2018年07月10日 19:07
 * @Copyright ©2018 Suixingpay. All rights reserved.
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */

package org.apache.shardingsphere.core.strategy.route.db;

import lombok.RequiredArgsConstructor;

import java.util.Collection;
import java.util.List;
import java.util.TreeSet;

import org.apache.shardingsphere.api.config.sharding.strategy.DatabaseShardingStrategyConfiguration;
import org.apache.shardingsphere.api.sharding.DatabaseShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.ShardingValue;
import org.apache.shardingsphere.core.strategy.route.ShardingStrategy;
import org.apache.shardingsphere.core.strategy.route.value.RouteValue;

import com.google.common.base.Preconditions;



/**
 * 数据库路由
 * @author: zhangkewei[zhang_kw@suixingpay.com]
 */
@RequiredArgsConstructor
public class DatabaseShardingStrategy implements ShardingStrategy {
    private final String shardingColumn;
    private final DatabaseShardingAlgorithm shardingAlgorithm;

    public  DatabaseShardingStrategy (final DatabaseShardingStrategyConfiguration dbShardingStrategyConfiguration) {
    	 Preconditions.checkNotNull(dbShardingStrategyConfiguration.getAlgorithm(), "Sharding algorithm cannot be null.");
    	 shardingColumn = dbShardingStrategyConfiguration.getShardingColumn();
    	 shardingAlgorithm = dbShardingStrategyConfiguration.getAlgorithm();
    }
    
    @Override
	public Collection<String> doSharding(Collection<String> availableTargetNames,
			Collection<RouteValue> shardingValues) {
		throw  new UnsupportedOperationException();
	}

    public Collection<String> doSharding(Collection<String> availableTargetNames, Collection<?> shardingValues, String logicSql) {
        Collection<String> shardingResult = shardingAlgorithm.doSharding(availableTargetNames, shardingValues, logicSql);
        Collection<String> result = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
        result.addAll(shardingResult);
        return result;
    }

    @Override
    public Collection<String> getShardingColumns() {
        Collection<String> result = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
        result.add(shardingColumn);
        return result;
    }

	
}
