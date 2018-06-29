package org.cookienats.template.controller;

import com.alibaba.fastjson.JSONObject;
import org.cookienats.template.conf.ConfigBean;
import org.cookienats.template.dao.UserMapper;
import org.cookienats.template.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    ConfigBean configBean;

    @Autowired
    private UserMapper userMapper;

    @RequestMapping(value = "/getUser/{id}", method = {RequestMethod.POST,RequestMethod.GET})
    public String getUser(@PathVariable("id") Long id){
        User user = new User();
        user.setPassWord("ttt");
        user.setUserName("rere");
        userMapper.insert(user);
        user.setId(null);
        userMapper.insert(user);

        user = userMapper.selectByPrimaryKey(id);

        return JSONObject.toJSONString(user);
    }
}
