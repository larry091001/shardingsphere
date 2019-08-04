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
import java.util.Properties;

import org.apache.shardingsphere.api.sharding.standard.PreciseShardingValue;

/**
 * @author: zhangkewei[zhang_kw@suixingpay.com]
 * @date: 2018年07月11日 16:50
 * @version: V1.0
 * @review: zkevin/2018年07月11日 16:50
 */
@Getter @Setter
@NoArgsConstructor
public class HashDatabaseShardingAlgorithm extends BaseDatabaseAlgorithm {
    //因子
    private int factor = 3;
    public HashDatabaseShardingAlgorithm(Properties attr) {
        super(attr);
        factor = Integer.valueOf(attr.getProperty("factor", "3"));
    }

    /**
     * int short long integer的hashcode是其数字本身
     * @param shardingValue
     * @return
     */
    @Override
    protected String computeName(PreciseShardingValue shardingValue) {
        return naming(hashObject(shardingValue));
    }

    @Override
    public Collection<String> noConditionSharding(Collection<String> availableDbNames, String logicSql) {
        return availableDbNames;
    }

    protected String naming(long hashCode) {
        return "_" +  hashCode % factor;
    }
}
