package com.itheima.study.dubbo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.itheima.study.dubbo.service.UserService;

/**
 * @author ：seanyang
 * @date ：Created in 2019/7/12
 * @description ：用户业务实现类
 *
 * @version: 1.0
 */
// 千万注意，一定使用dubbo的Service
	// com.alibaba.dubbo.config.annotation.Service
@Service
public class UserServiceImpl implements UserService {
	@Override
	public boolean login(String username, String password) {
		System.out.println(" 8882 service provider UserServiceImpl U:"+username+" p:"+password);
		if("admin".equals(username)  && "123".equals(password)){
			return true;
		}
		return false;
	}
}
