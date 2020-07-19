package com.wangl.controller;

import com.wangl.bean.Administrators;
import com.wangl.data1.service.AdministratorsService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("admin")
@CrossOrigin("*")
public class AdminController {
    @Autowired
    AdministratorsService administratorsService;

    @RequestMapping("/login")
    public JSONObject login(@RequestBody Administrators administrators, HttpServletRequest request){
        System.out.println(administrators.toString());
        int aId = administrators.getaId();
        String aPwd = administrators.getaPwd();
        String message = "";
        Map<String,Object> result = new HashMap<String,Object>();
        // 判断账户是否存在
        Administrators administrators1 = administratorsService.getAdminById(aId);
        System.out.println(administrators1);
        if(null == administrators1) {
            message = "账号不存在";
        } else if (!(administrators1.getaPwd().equals(aPwd))){
            System.out.println(administrators1.getaPwd());
            System.out.println(aPwd);
            message = "密码错误";
        } else {
            message = "登录成功";
            result.put("info",administrators1);
        }
        result.put("message",message);
        JSONObject json = JSONObject.fromObject(result);
        return json;
    }
}