package com.example.seckill.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.seckill.mapper.SeckillGoodsMapper;
import com.example.seckill.pojo.SeckillOrder;
import com.example.seckill.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zhiming
 * @since 2021-10-27
 */
public interface ISeckillOrderService extends IService<SeckillOrder> {

    //获取秒杀结果
    //成功orderId，秒杀失败-1，排队中0
    Long getResult(User user, Long goodsId);
}
