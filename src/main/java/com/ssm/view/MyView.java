package com.ssm.view;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.View;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * @email: dong980514280@gmail.com
 * @author: Dong
 * @date: 2018/11/17
 * @time: 10:33
 */

// 默认bean的id为首字母为小写的id
@Component
public class MyView implements View {

    // 告知spring容器，contentType
    public String getContentType() {
        return "text/html";
    }

    public void render(Map<String, ?> map, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        httpServletResponse.getWriter().write("<h2>This is MyView!!</h2>");
        httpServletResponse.getWriter().close();
        httpServletResponse.getWriter().write("<h2>This is MyView!!</h2>");
    }
}
