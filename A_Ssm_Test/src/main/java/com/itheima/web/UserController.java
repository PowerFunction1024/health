package com.itheima.web;

import com.itheima.bean.SCust;
import com.itheima.bean.SUser;
import com.itheima.service.UserService;
import com.sun.org.apache.regexp.internal.RE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/user")
@SessionAttributes(value={"user","allUser"})
public class UserController {


    @Autowired
    private UserService userService;
    //输入用户名密码登录系统，登录成功则跳转到index.jsp页面（10分）
    @RequestMapping("/checkLogin")
    public String checkLogin(@RequestParam Map<String,Object> map , Model model){
        SUser sUser = userService.checkLogin(map);
        List<SUser> allUser = userService.findAllUser();


    if (sUser!=null){
            //登录了
        //存到session域用于展示index.jsp用户名
            model.addAttribute("user",sUser );
            ////存到session域用于展示center.jsp的下拉选项框,index.jsp会加载center.jsp页面
            model.addAttribute("allUser",allUser );

            //跳转到http://localhost:8080/jsp/index.jsp

            return "redirect:/jsp/index.jsp";

        }else {

            return "error";
        }



    }

//    完成根据客户名称和客户类型的模糊查询（20分）
    @RequestMapping("/search")
    public String searchMoHu(@RequestParam Map<String,Object> map,Model model){

        List<SCust> sCusts = userService.searchMoHu(map);

        model.addAttribute("sCustslist",sCusts );

        return "forward:/jsp/center.jsp";
    }

}
