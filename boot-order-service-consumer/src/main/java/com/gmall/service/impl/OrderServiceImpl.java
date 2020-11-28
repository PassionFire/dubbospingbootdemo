package com.gmall.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.gmall.bean.UserAddress;
import com.gmall.service.OrderService;
import com.gmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrderServiceImpl implements OrderService {

    //@Autowired
    @Reference      //远程引用UserService服务
    UserService userService;
    public List<UserAddress> initOrder(String userId) {
        // TODO Auto-generated method stub
        System.out.println("用户id:"+userId);
        List<UserAddress> addressList = userService.getUserAddressList(userId);
        return addressList;
    }
}
