package com.atguigu.gmall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.common.bean.PageResultVo;
import com.atguigu.gmall.common.bean.PageParamVo;
import com.atguigu.gmall.sms.entity.SeckillPromotionEntity;

import java.util.Map;

/**
 * 秒杀活动
 *
 * @author junjie
 * @email junjie@junjie.com
 * @date 2021-06-22 10:22:42
 */
public interface SeckillPromotionService extends IService<SeckillPromotionEntity> {

    PageResultVo queryPage(PageParamVo paramVo);
}

