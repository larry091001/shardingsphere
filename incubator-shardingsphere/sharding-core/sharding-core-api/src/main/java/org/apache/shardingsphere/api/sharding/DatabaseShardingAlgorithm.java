/**
 * All rights Reserved, Designed By Suixingpay.
 *
 * @author: zhangkewei[zhang_kw@suixingpay.com]
 * @date: 2018年07月10日 18:41
 * @Copyright ©2018 Suixingpay. All rights reserved.
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */

package org.apache.shardingsphere.api.sharding;

import java.util.Collection;


/**
 * @author: zhangkewei[zhang_kw@suixingpay.com]
 * @version: V1.0
 */
public interface DatabaseShardingAlgorithm<R> extends ShardingAlgorithm {
	/**
    *
    * @param availableDbNames
    * @param shardingValues
    * @param logicSql
    * @return
    */
   default Collection<String> doSharding(Collection<String> availableDbNames, Collection<R> shardingValues, String logicSql) {
       return availableDbNames;
   }
}
