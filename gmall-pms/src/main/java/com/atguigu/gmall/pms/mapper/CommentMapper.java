package com.atguigu.gmall.pms.mapper;

import com.atguigu.gmall.pms.entity.CommentEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价
 * 
 * @author junjie
 * @email junjie@junjie.com
 * @date 2021-06-21 21:20:54
 */
@Mapper
public interface CommentMapper extends BaseMapper<CommentEntity> {
	
}
