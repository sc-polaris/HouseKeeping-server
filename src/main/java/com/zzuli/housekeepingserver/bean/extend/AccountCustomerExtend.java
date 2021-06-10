package com.zzuli.housekeepingserver.bean.extend;

import com.zzuli.housekeepingserver.bean.AccountCustomer;
import com.zzuli.housekeepingserver.bean.Order;
import com.zzuli.housekeepingserver.bean.User;

/**
 * 类说明：
 * Modify Information:
 * Author        Date           Description
 * ============ =========== ============================
 * liang         2021/6/11     顾客账户的扩展类
 */

public class AccountCustomerExtend extends AccountCustomer {
    private Order order;
    private User user;

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
