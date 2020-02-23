package com.vilin.springboot.chapter10.controller;

/** imports **/
//SessionAttributes指定数据模型名称或者属性类型，保存到Session中

import com.vilin.springboot.chapter10.pojo.User;
import com.vilin.springboot.chapter10.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

@SessionAttributes(names = {"user"}, types= Long.class)
@Controller
@RequestMapping("/session")
public class SessionController {
    @Autowired
    private UserService userService = null;

    @GetMapping("/test")
    //@SessionAttribute从HttpSession中取出数据，填充控制方法参数
    public String test (@SessionAttribute("id") Long id, Model model ) {
        //根据类型保存到Session中
        model.addAttribute("id_new", id);
        User user = userService.getUser(id);
        //根名称保存到Session中
        model.addAttribute("user", user);
        return "session/test";
    }
}
