package com.zzuli.housekeepingserver.dao.extend;

import com.zzuli.housekeepingserver.bean.extend.RoleExtend;

import java.util.List;

/**
 * 类说明：
 * Modify Information:
 * Author        Date          Description
 * ============ =========== ============================
 * liang         2021/6/4       角色接口的扩展类
 */

public interface RoleExtendMapper {
    List<RoleExtend> selectWithPrivilegeById(Long id);
}