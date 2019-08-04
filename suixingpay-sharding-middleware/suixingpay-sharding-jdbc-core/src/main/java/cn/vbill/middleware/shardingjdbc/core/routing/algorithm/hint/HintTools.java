/**
 * All rights Reserved, Designed By Suixingpay.
 *
 * @author: zhangkewei[zhang_kw@suixingpay.com]
 * @date: 2018年07月17日 23:59
 * @Copyright ©2018 Suixingpay. All rights reserved.
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */

package cn.vbill.middleware.shardingjdbc.core.routing.algorithm.hint;

import java.util.Collection;

import org.apache.shardingsphere.api.hint.HintManager;

/**
 * @author: zhangkewei[zhang_kw@suixingpay.com]
 * @date: 2018年07月17日 23:59
 * @version: V1.0
 * @review: zkevin/2018年07月17日 23:59
 */
public class HintTools {
	
	private final static String DATEBASE_SHARDING = "datebase_sharding";
	private final static String TABLE_SHARDING = "table_sharding";

	 /**
     * 仅做数据库路由
     * 触发DatabaseHintSQLRouter->DatabaseOnlyHintAlgorithm
     * @param value
     */
    public static void databaseHintValue(Comparable<?> value) {
        getHintManager().setDatabaseShardingValue(value);
    }

    /**
     * 设置database sharding value
     */
    //TODO larry 沒有colum
    public static void addDatabaseShardingValue(String table, Comparable<?> value) {
        getHintManager().addDatabaseShardingValue(table, value);
    }

    /**
     * 设置table sharding value
     */
    //TODO larry 沒有colum
    public static void addTableShardingValue(String table, Comparable<?> value) {
        getHintManager().addTableShardingValue(table, value);
    }

    public static void close() {
        getHintManager().close();
    }

    //TODO larry
    private static HintManager getHintManager() {
    	return null == HintManager.HINT_MANAGER_HOLDER.get() ? HintManager.getInstance() : HintManager.HINT_MANAGER_HOLDER.get();
    }
   
}
