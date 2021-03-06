package com.leemon.wushiwan.service;

import com.leemon.wushiwan.entity.CoreMissionRule;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author leemon
 * @since 2019-03-20
 */
public interface ICoreMissionRuleService extends IService<CoreMissionRule> {

	CoreMissionRule getCoreMissionRuleByMissionTypePropertyId(Integer id);
}
