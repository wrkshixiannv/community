package com.example.demo.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@Controller
public class IndexController {


    @GetMapping("/")
    public String index(){
        return "index";
    }

	// 微信登陆，检查是否已经有用户，没有则保存
	@ResponseBody
	@RequestMapping(value = "/userLogin", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
	public JSONObject userLogin(@RequestBody JSONObject jsonParam, HttpSession session) {
		String msg = "error";
		String nickName = jsonParam.getString("nickName");
		String openID = jsonParam.getString("openId");
		String headPicture = jsonParam.getString("avatar");
		String place = jsonParam.getString("place");
		User user = new User();
		user.setNickname(nickName);
		user.setWechatopenid(openID);
		user.setHeadpicture(headPicture);
		user.setPlace(place);
		msg = "登陆成功！";

		JSONObject result = new JSONObject();
		result.put("msg", msg);
		result.put("method", "json");
		result.put("data", user);
		session.setAttribute("user", user);
		return result;
	}


}
