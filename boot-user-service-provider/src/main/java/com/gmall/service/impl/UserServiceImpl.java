package com.gmall.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.gmall.bean.UserAddress;
import com.gmall.service.UserService;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Service
@Component
public class UserServiceImpl implements UserService {

    public List<UserAddress> getUserAddressList(String userId) {
        UserAddress address1 = new UserAddress(1, "霸道流氓气质", "1", "李老师", "123456789", "Y");
        UserAddress address2 = new UserAddress(2, "公众号：霸道的程序猿）", "1", "王老师", "987654321", "N");
        return Arrays.asList(address1, address2);
    }
}