package com.mouse.moon.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mouse.moon.pojo.EngineBean;
import com.mouse.moon.pojo.ParamBean;
import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@ControllerAdvice
public class MyAdviceController {
	
	//private static final ObjectMapper MAPPER = new ObjectMapper();
	
	@ModelAttribute
//	public ParamBean init(Model model,HttpEntity<String> httpEntity){
	public EngineBean init(HttpEntity<String> httpEntity, HttpServletRequest request, HttpServletResponse response){
		EngineBean paramBean = null;
		 try {
			//获取参数
			 String data = httpEntity.getBody();
			 ObjectMapper objectMapper =  new ObjectMapper();
			  paramBean = data != null ? objectMapper.readValue(data, EngineBean.class) : null;
			 System.out.println(paramBean);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		return paramBean;
	}
}
