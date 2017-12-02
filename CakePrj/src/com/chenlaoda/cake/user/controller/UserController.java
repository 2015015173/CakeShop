package com.chenlaoda.cake.user.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.chenlaoda.cake.entity.User;
import com.chenlaoda.cake.user.service.UserService;
import com.chenlaoda.cake.user.service.UserServiceImpl;

@Controller
@RequestMapping("/user")
public class UserController {

	@Resource
    UserService userService;
	@Resource
	private UserServiceImpl userServiceImpl;
	
    //注册页面
    @RequestMapping(value = "/regist")
    public String regist() {
        return "regist";
    }

    //登录页面
    @RequestMapping(value = "/login")
    public String login() {
        return "login";
    }

    //首页
    @RequestMapping(value = "/index")
    public String index() {
        return "index";
    }
    
    //联系我们
    @RequestMapping(value = "/contact")
    public String contact() {
        return "contact";
    }
    
	@RequestMapping("/logout")
	//用户退出登录
	public String logout() {
		return "index";
	}
	
	
	
    @RequestMapping(value = "/doLogin", method = RequestMethod.POST)
    @ResponseBody
    //登录方法
    public Map<String, Object> doLogin(String userNameOrEmail, String password, HttpSession httpSession) {
        System.out.println("我接收到了登录请求" + userNameOrEmail + " " + password);
        String result = "fail";
        //通过名字或者邮箱获得用户对象
        User user = userService.getUser(userNameOrEmail);
        if (user == null)
            result = "unexist";//名字或者邮箱输入和数据库中数据不匹配的状况
        else {
          //  user userDetail = userDetailService.getUserDetail(user.getId());
            if (user.getPassword().equals(password)) {
                result = "success";
                httpSession.setAttribute("currentUser", user);//密码匹配成功存入作用域
            } else
                result = "wrong";
        }
        Map<String, Object> resultMap = new HashMap<String, Object>();
        resultMap.put("result", result);//返回结果
        return resultMap;
    }
    
    //注册方法
    @RequestMapping(value = "/doRegister", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> doRegister(String userName, String email, String password, String id){
        String result = "fail";
        //通过用户名获取用户对象
        User user = userService.getUser(userName);
        if (user != null) {
        	//判断用户名是否已经存在
            result = "nameExist";
        } else {
        	//通过邮箱获取用户对象
            user = userService.getUser(email);
            if (user != null)
            	//判断邮箱是否存在
                result = "emailExist";
            else {
            	//用户名和邮箱都没有被使用过时
                User newuser = new User();
                newuser.setUserName(userName);
                //System.out.println(userName);
                newuser.setEmail(email);
                //System.out.println(email);
                newuser.setEmail(password);
                //System.out.println(password);
                //把newuser存入数据库中，跳转成功页面
                userService.addUser(newuser);
                result = "success";
            }
        }
        Map<String, Object> resultMap = new HashMap<String, Object>();
        resultMap.put("result", result);
        return resultMap;
    }
    
    
 	//修改用户信息
    @RequestMapping(value = "/doUpdate", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> doUpdate(String userName, String email, String password, String img) {
    	//提示信息  
//        String info = "操作失败";  
//        try {  
//            UserService.update(user);  
//            info="操作成功!";  
//        } catch (Exception e) {  
//            e.printStackTrace();  
//        }  
//          
//        //把提示信息传入到提示界面  
//        model.addAttribute("info",info);  
//        return "userinfo/userinfo_info"; 
        
        String result = "fail";
        User user = userService.getUser(userName);
        userService.updateUser(user);
        User userDetail = userService.getUser(user.getUserId());
        userDetail.setUserName("");
        
        UserDetailService.updateUserDetail(userDetail);
        result = "success";
        Map<String, Object> resultMap = new HashMap<String, Object>();
        resultMap.put("result", result);
        return resultMap;
    }
    
//    @RequestMapping(value = "/getAllUser", method = RequestMethod.POST)
//    @ResponseBody
//    public Map<String, Object> getAllUser() {
////        System.out.println("我接收到了获取用户请求");
//        List<User> userList = new ArrayList<>();
//        userList = userService.getAllUser();
//        String allUsers = JSONArray.toJSONString(userList);
////        System.out.println("我返回的结果是"+allUsers);
//        Map<String,Object> resultMap = new HashMap<String,Object>();
//        resultMap.put("allUsers",allUsers);
//        return resultMap;
//    }
//    
//    //删除用户方法
//    @RequestMapping(value = "/deleteUser", method = RequestMethod.POST)
//    @ResponseBody
//    public Map<String, Object> deleteUser(int id) {
//        String result ="fail";
//        if(userDetailService.deleteUserDetail(id)){
//            if(userService.deleteUser(id)){
//                result="success";
//            }
//        }
//        Map<String,Object> resultMap = new HashMap<String,Object>();
//        resultMap.put("result",result);
//        return resultMap;
//    }
//    @RequestMapping(value = "/getUserAddressAndPhoneNumber", method = RequestMethod.POST)
//    @ResponseBody
//    public Map<String, Object> getUserAddressAndPhoneNumber(int id) {
//        String address = userDetailService.getUserDetail(id).getAddress();
//        String phoneNumber = userDetailService.getUserDetail(id).getPhoneNumber();
//        Map<String,Object> resultMap = new HashMap<String,Object>();
//        resultMap.put("address",address);
//        resultMap.put("phoneNumber",phoneNumber);
//        return resultMap;
//    }
//    @RequestMapping(value = "/doLogout")
//    public String doLogout(HttpSession httpSession){
//        httpSession.setAttribute("currentUser","");
//        return "redirect:login";
//    }
//    @RequestMapping(value = "/getUserById", method = RequestMethod.POST)
//    @ResponseBody
//    public Map<String, Object> getUserById(int id) {
//        User user = userService.getUser(id);
//        String result = JSON.toJSONString(user);
//        Map<String,Object> resultMap = new HashMap<String,Object>();
//        resultMap.put("result",result);
//        return resultMap;
//    }
//    @RequestMapping(value = "/getUserDetailById", method = RequestMethod.POST)
//    @ResponseBody
//    public Map<String, Object> getUserDetailById(int id) {
//        UserDetail userDetail = userDetailService.getUserDetail(id);
//        String result = JSON.toJSONString(userDetail);
//        Map<String,Object> resultMap = new HashMap<String,Object>();
//        resultMap.put("result",result);
//        return resultMap;
//    }
//*/
}
