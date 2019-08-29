package com.web.TopologyMapData;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;

@Controller
@RequestMapping("testService")
public class TestServiceController {

    @RequestMapping(value = "getHundredKDat",method = RequestMethod.GET)
    @ResponseBody
    public void getHundredKDat(Integer kbCount,HttpServletResponse resp) throws IOException {
        resp.setHeader("Content-type", "text/html;charset=UTF-8");
        resp.setCharacterEncoding("UTF-8");
        resp.getWriter().write(JSONObject.toJSONString("jenkins run successfully"));
    }
}
