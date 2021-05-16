package com.example.webadmin.controller;

import com.example.webadmin.bean.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


import javax.servlet.http.HttpSession;

@Controller
@Slf4j
public class IndexController {

    /**
     * 访问登录页
     * @return
     */
    @GetMapping(value = {"/","/login"})
    public String loginPage(){

        return "login";

    }

    @PostMapping("/login")
    public String main(User user, HttpSession session, Model model){

        if(StringUtils.hasLength(user.getUserName()) && "12345".equals(user.getPassword())){
            //把登录成功的用户保存起来
            session.setAttribute("loginUser",user);

            // 登录成功重新定向到main.html  重定向防止表单重复提交
            return "redirect:/main.html";

        }else {

            model.addAttribute("msg","账号密码错误");
            return "login";

        }
//        return "main";

    }

    /**
     * 去main页面
     * 模板引擎templates文件夹下所有页面解析都是经过请求处理，最终由模板引擎来解析
     * @return
     */
    @GetMapping("/main.html")
    public String mainPage(HttpSession session,Model model){
        log.info("当前方法是：{}","mainPage");
//        // 是否登录   拦截器，过滤器
//        Object loginUser = session.getAttribute("loginUser");
//        if (loginUser != null){
//            return "main";
//        }else {
//            model.addAttribute("msg","请重新登录");
//            return "login";
//        }
        return "main";

    }
}
