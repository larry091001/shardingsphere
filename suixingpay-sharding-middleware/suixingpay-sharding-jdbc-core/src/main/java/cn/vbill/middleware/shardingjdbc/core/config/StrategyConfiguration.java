/**
 * All rights Reserved, Designed By Suixingpay.
 *
 * @author: zhangkewei[zhang_kw@suixingpay.com]
 * @date: 2018年06月26日 16:35
 * @Copyright ©2018 Suixingpay. All rights reserved.
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */

package cn.vbill.middleware.shardingjdbc.core.config;

import org.apache.shardingsphere.api.config.sharding.strategy.ShardingStrategyConfiguration;

import cn.vbill.middleware.shardingjdbc.core.config.algorithm.*;
import lombok.Getter;
import lombok.Setter;

/**
 * @author: zhangkewei[zhang_kw@suixingpay.com]
 * @date: 2018年06月26日 16:35
 * @version: V1.0
 * @review: zkevin/2018年06月26日 16:35
 */
@Getter
@Setter
public class StrategyConfiguration  implements Cloneable {
    private InlineConfiguration inline;
    private ComplexKeysConfiguration complex;
    private HintConfiguration hint;
    private StandardConfiguration standard;
    private NoneConfiguration none;
    private DbConfiguration db;

    public ShardingStrategyConfiguration build() {
        if (null != inline) return inline.build();
        if (null != complex) return complex.build();
        if (null != hint) return hint.build();
        if (null != standard) return standard.build();
        if (null != none) return none.build();
        if (null != db) return db.build();
        return null;
    }

    protected StrategyConfiguration clone() {
        StrategyConfiguration newStrategy  = new StrategyConfiguration();
        if (null != complex) newStrategy.setComplex(complex.clone());
        if (null != hint) newStrategy.setHint(hint.clone());
        if (null != inline) newStrategy.setInline(inline.clone());
        if (null != none) newStrategy.setNone(none.clone());
        if (null != standard) newStrategy.setStandard(standard.clone());
        if (null != db) newStrategy.setDb(db.clone());
        return newStrategy;
    }
}
