package cn.vbill.middleware.shardingjdbc.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author: zhangkewei[zhang_kw@suixingpay.com]
 */
@NoArgsConstructor
@AllArgsConstructor
public class Merchant implements java.io.Serializable {
    private static final long serialVersionUID = 1L;
    @Getter @Setter private Long id;
    @Getter @Setter private String name;
}
