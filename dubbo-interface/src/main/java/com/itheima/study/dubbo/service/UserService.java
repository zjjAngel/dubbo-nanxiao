package com.itheima.study.dubbo.service;

/**
 * @author ：seanyang
 * @date ：Created in 2019/7/12
 * @description ：用户业务接口
 * @version: 1.0
 */
public interface UserService {
	/**
	 * 登录业务
	 * 提供服务提供者和服务消费者的公共方法
	 * @param username 用户名
	 * @param password 密码
	 * @return
	 */
	boolean login(String username,String password);
}
