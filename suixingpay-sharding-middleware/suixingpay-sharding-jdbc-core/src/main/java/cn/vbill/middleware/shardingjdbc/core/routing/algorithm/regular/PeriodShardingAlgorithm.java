/**
 * All rights Reserved, Designed By Suixingpay.
 *
 * @author: zhangkewei[zhang_kw@suixingpay.com]
 * @date: 2018年07月09日 14:27
 * @Copyright ©2018 Suixingpay. All rights reserved.
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */

package cn.vbill.middleware.shardingjdbc.core.routing.algorithm.regular;


import lombok.Getter;
import lombok.Setter;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;

import org.apache.shardingsphere.api.sharding.standard.PreciseShardingValue;

/**
 * 周期性算法
 * @author: zhangkewei[zhang_kw@suixingpay.com]
 * @date: 2018年07月09日 14:27
 * @version: V1.0
 * @review: zkevin/2018年07月09日 14:27
 */
@Setter @Getter
public class PeriodShardingAlgorithm extends SuffixRegularAlgorithm {
    private static final DateFormat FORMAT = new SimpleDateFormat("yyyyMMdd");
    //起始校准时间
    private Date epoch;
    //当前表周期
    private int periodOfMonth = 6;
    //分表格式化类

    private volatile PeriodSpan span;



    public PeriodShardingAlgorithm(Properties attr) throws ParseException {
        super(attr);
        periodOfMonth = Integer.valueOf(attr.getProperty("periodOfMonth", "6"));
        epoch = FORMAT.parse((String) attr.getOrDefault("epoch", "20180101"));
    }

    public PeriodShardingAlgorithm() {
        super();
        epoch = getDefaultEpoch();
    }

    private Date getDefaultEpoch() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2018, Calendar.JANUARY, 01, 0, 0, 0);
        return calendar.getTime();
    }
    @Override
    protected String computeName(PreciseShardingValue shardingValue) {
        span = null == span || !span.match()
                ? PeriodSpan.current(epoch, periodOfMonth) : span;
        return naming(span);
    }

    protected String naming(PeriodSpan span) {
        return "_" + FORMAT.format(span.getStart()) + "_" + span.getEnd();
    }
}
