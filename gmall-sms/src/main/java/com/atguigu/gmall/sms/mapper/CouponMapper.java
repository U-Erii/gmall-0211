package com.atguigu.gmall.sms.mapper;

import com.atguigu.gmall.sms.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author zzq
 * @email zzq@atguigu.com
 * @date 2020-07-20 18:43:47
 */
@Mapper
public interface CouponMapper extends BaseMapper<CouponEntity> {
	
}
