package com.nanxiao.xing.cn.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.itheima.study.dubbo.service.UserService;
import jdk.nashorn.internal.objects.annotations.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/user12")
public class UserController {

    @Reference(loadbalance = "roundrobin")
    private UserService userService;
	/*
	// 调用远程Service,通过配置文件注入
	private UserSerivce userService;
	public void setUserService(UserSerivce userService) {
		this.userService = userService;
	}
	*/
    /**
     * 用户登录
     * @param username 用户名
     * @param password 密码
     * @return
     */
    @RequestMapping("/login")
    @ResponseBody
    public String login(String username,String password){
        System.out.println("controller username:"+username+" password:"+password);
        try{
            if(userService.login(username,password)){
                return "login ok";
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return "login error";
    }
}

