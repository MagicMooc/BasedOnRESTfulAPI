package com.ssm.controller;

import com.ssm.model.Account;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * @email: dong980514280@gmail.com
 * @author: Dong
 * @date: 2018/11/16
 * @time: 14:54
 */
@Controller
//  SessionAttrbutes的types只有请求过的方法才会保存在session中
@SessionAttributes(value = {"name"}, types = {String.class})
public class HelloController {

    // 如果@RequestMapping没有value，则默认为方法名称
    @ResponseBody
    @RequestMapping("hello")
    public String testRequestHeader(@RequestHeader("accept") String accept,
                                    @RequestHeader("user-agent") String userAgent){
        System.out.println(accept);
        System.out.println(userAgent);
        return "ok";
    }

    @ResponseBody
    @RequestMapping("testCookieValue")
    public String testCookieValue(@CookieValue("JSESSIONID") String jsessionId){
        return jsessionId;
    }

    @ResponseBody
    @RequestMapping("testServletAPI")
    public String testServletAPI(HttpServletRequest request,
                                 HttpServletResponse response,
                                 HttpSession session){

        System.out.println(request.getSession());
        System.out.println(session);

        return "ok";
    }

    @RequestMapping("testModelAndView")
    public ModelAndView testModelAndView(){
        ModelAndView mv = new ModelAndView();
        // ModelAndView 模型数据的值放在request的范围内
        mv.setViewName("hello");
        mv.addObject("name", "ModelAndValue");
        // 如果ModelAndView的viewName为空，则返回的视图为@RequestMapping的value对应的名称
        return mv;
    }

    @RequestMapping("testMap")
    public ModelAndView testMap(Map<String, Object> map){

        ModelAndView mv = new ModelAndView();
        mv.setViewName("hello");

        map.put("name", "map");
        return mv;
    }

    @RequestMapping("testModel")
    public ModelAndView testModel(Model model){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("hello");

        model.addAttribute("name", "model");
        return mv;
    }

    @RequestMapping("testModelMap")
    public ModelAndView testModelMap(ModelMap modelMap){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("hello");

        modelMap.addAttribute("name", "modelMap");
        return mv;
    }

    @RequestMapping("result")
    public String result(){
        return "result";
    }

    @RequestMapping("testRequestSessionSort")
    public ModelAndView testRequestSessionSort(ModelMap modelMap){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("hello");

        modelMap.addAttribute("name", "RequestSessionSort");
        return mv;
    }

//    @ModelAttribute
//    public void start(Map<String, Object> map){
//        Account account = new Account();
//        account.setId(1);
//        account.setName("tom");
//        account.setRegisterTime("2015");
//        map.put("a", account);
//        // 这样每用一个方法就调用一次
//        System.out.println("start");
//    }


    @RequestMapping("testModelAttribute")
    public String testModelAttribute(@ModelAttribute("a") Account account){
        System.out.println(account);
        return "result";
    }


    // 如果ModelAttribute有value值，则key值为value的值；如果没有则是返回类型的第一个小写的名称
    @ModelAttribute("account")
    public Account start(){
        Account account = new Account();
        account.setId(1);
        account.setName("tom");
        account.setRegisterTime("2015");

        // 这样每用一个方法就调用一次
        System.out.println("start");
        return account;
    }

    @RequestMapping("testModelAndViewJsp")
    public String testModelAndViewJsp(HttpServletResponse response){

        return "result";
    }



}
