package com.example.seckill.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.seckill.pojo.Order;
import com.example.seckill.pojo.User;
import com.example.seckill.vo.GoodsVo;
import com.example.seckill.vo.OrderDetailVo;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zhiming
 * @since 2021-10-27
 */
public interface IOrderService extends IService<Order> {

    Order seckill(@Param("user") User user, @Param("goods") GoodsVo goods);

    OrderDetailVo detail(Long orderId);

    //获取秒杀地址
    String createPath(User user, Long goodsId);

    //校验秒杀地址
    boolean checkPath(User user, Long goodsId, String path);

    //校验验证码
    boolean checkCaptcha(User user, Long goodsId, String captcha);
}
