package com.itheima.web;

import com.itheima.bean.SCust;
import com.itheima.bean.SUser;
import com.itheima.dao.ScustDao;
import com.itheima.service.ScustService;
import com.itheima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/Scust")
@SessionAttributes(value = {"allUser"})
public class ScustController {
    @Autowired
    private ScustService scustService;


    //   从index.jsp中 <iframe src="${pageContext.request.contextPath}/Scust/findAll" class="iframe"></iframe>跳到
//    这边过来,查询所有的客户列表,然后跳到center.jsp完成展示
    @RequestMapping("/findAll")
    public String findAll(Model model) {

        List<SCust> allScust = scustService.findAll();

        model.addAttribute("sCustslist", allScust);

        return "forward:/jsp/center.jsp";
    }

    //    完成客户信息的添加，并刷新客户列表
    @RequestMapping("/addScust")
    public String addScust(SCust sCust, Model model) {

        try {
            scustService.addScust(sCust);
            //更新session域,用于刷新客户列表
            List<SCust> allScust = scustService.findAll();
            model.addAttribute("sCustslist", allScust);


        } catch (Exception e) {
            e.printStackTrace();
        }

        return "forward:/jsp/center.jsp";
    }


}
