/**
 * All rights Reserved, Designed By Suixingpay.
 *
 * @author: zhangkewei[zhang_kw@suixingpay.com]
 * @date: 2018年07月11日 16:52
 * @Copyright ©2018 Suixingpay. All rights reserved.
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */

package cn.vbill.middleware.shardingjdbc.core.routing.algorithm.regular;

import lombok.Getter;

import java.util.Calendar;
import java.util.Date;

/**
 * @author: zhangkewei[zhang_kw@suixingpay.com]
 * @date: 2018年07月11日 16:52
 * @version: V1.0
 * @review: zkevin/2018年07月11日 16:52
 */
@Getter
public final class PeriodSpan {
    private Date start;
    private Date end;
    private PeriodSpan(Date start, Date end) {
        this.start = start;
        this.end = end;
    }

    public static PeriodSpan current(Date epoch, int periodOfMonth, Date condition) {
        Calendar calendar = Calendar.getInstance();
        //开始
        calendar.setTime(epoch);
        Date tempStart = epoch;
        //结束
        calendar.add(Calendar.MONTH, periodOfMonth);
        Date tempEnd = calendar.getTime();
        while (!match(condition, tempStart, tempEnd)) {
            tempStart = calendar.getTime();
            calendar.add(Calendar.MONTH, periodOfMonth);
            tempEnd = calendar.getTime();
        }
        return new PeriodSpan(tempStart, tempEnd);
    }

    public static PeriodSpan current(Date epoch, int periodOfMonth) {
        return current(epoch, periodOfMonth, Calendar.getInstance().getTime());
    }



    public boolean match() {
        return match(Calendar.getInstance().getTime(), start, end);
    }
    public boolean match(Date date) {
        return match(date, start, end);
    }
    public static boolean match(Date date, Date start, Date end) {
        return date.after(start) && date.before(end);
    }
}