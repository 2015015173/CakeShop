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
	
    //ע��ҳ��
    @RequestMapping(value = "/regist")
    public String regist() {
        return "regist";
    }

    //��¼ҳ��
    @RequestMapping(value = "/login")
    public String login() {
        return "login";
    }

    //��ҳ
    @RequestMapping(value = "/index")
    public String index() {
        return "index";
    }
    
    //��ϵ����
    @RequestMapping(value = "/contact")
    public String contact() {
        return "contact";
    }
    
	@RequestMapping("/logout")
	//�û��˳���¼
	public String logout() {
		return "index";
	}
	
	
	
    @RequestMapping(value = "/doLogin", method = RequestMethod.POST)
    @ResponseBody
    //��¼����
    public Map<String, Object> doLogin(String userNameOrEmail, String password, HttpSession httpSession) {
        System.out.println("�ҽ��յ��˵�¼����" + userNameOrEmail + " " + password);
        String result = "fail";
        //ͨ�����ֻ����������û�����
        User user = userService.getUser(userNameOrEmail);
        if (user == null)
            result = "unexist";//���ֻ���������������ݿ������ݲ�ƥ���״��
        else {
          //  user userDetail = userDetailService.getUserDetail(user.getId());
            if (user.getPassword().equals(password)) {
                result = "success";
                httpSession.setAttribute("currentUser", user);//����ƥ��ɹ�����������
            } else
                result = "wrong";
        }
        Map<String, Object> resultMap = new HashMap<String, Object>();
        resultMap.put("result", result);//���ؽ��
        return resultMap;
    }
    
    //ע�᷽��
    @RequestMapping(value = "/doRegister", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> doRegister(String userName, String email, String password, String id){
        String result = "fail";
        //ͨ���û�����ȡ�û�����
        User user = userService.getUser(userName);
        if (user != null) {
        	//�ж��û����Ƿ��Ѿ�����
            result = "nameExist";
        } else {
        	//ͨ�������ȡ�û�����
            user = userService.getUser(email);
            if (user != null)
            	//�ж������Ƿ����
                result = "emailExist";
            else {
            	//�û��������䶼û�б�ʹ�ù�ʱ
                User newuser = new User();
                newuser.setUserName(userName);
                //System.out.println(userName);
                newuser.setEmail(email);
                //System.out.println(email);
                newuser.setEmail(password);
                //System.out.println(password);
                //��newuser�������ݿ��У���ת�ɹ�ҳ��
                userService.addUser(newuser);
                result = "success";
            }
        }
        Map<String, Object> resultMap = new HashMap<String, Object>();
        resultMap.put("result", result);
        return resultMap;
    }
    
    
 	//�޸��û���Ϣ
    @RequestMapping(value = "/doUpdate", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> doUpdate(String userName, String email, String password, String img) {
    	//��ʾ��Ϣ  
//        String info = "����ʧ��";  
//        try {  
//            UserService.update(user);  
//            info="�����ɹ�!";  
//        } catch (Exception e) {  
//            e.printStackTrace();  
//        }  
//          
//        //����ʾ��Ϣ���뵽��ʾ����  
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
////        System.out.println("�ҽ��յ��˻�ȡ�û�����");
//        List<User> userList = new ArrayList<>();
//        userList = userService.getAllUser();
//        String allUsers = JSONArray.toJSONString(userList);
////        System.out.println("�ҷ��صĽ����"+allUsers);
//        Map<String,Object> resultMap = new HashMap<String,Object>();
//        resultMap.put("allUsers",allUsers);
//        return resultMap;
//    }
//    
//    //ɾ���û�����
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
