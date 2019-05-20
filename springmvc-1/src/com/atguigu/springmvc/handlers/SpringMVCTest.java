package com.atguigu.springmvc.handlers;

import javax.swing.plaf.synth.SynthSeparatorUI;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping("/springmvc")
@Controller
public class SpringMVCTest {
	
	private static final String SUCCESS="success";
	
	
	
	
	@RequestMapping(value="/testRest",method=RequestMethod.POST)
	public String testRestPost(){
		System.out.println("testRest POST");
		return SUCCESS;
	}	
	
	@RequestMapping(value="/testRest/{id}",method=RequestMethod.DELETE)
	public String testRestDelete(@PathVariable("id") Integer id){
		System.out.println("testRest DELETE id= "+id);
		return SUCCESS;
		
	}	
	
	@RequestMapping(value="/testRest/{id}",method=RequestMethod.PUT)
	public String testRestPut(@PathVariable("id") Integer id){
		System.out.println("testRest PUT id= "+id);
		return SUCCESS;
	}	
	@RequestMapping(value="/testRest/{id}",method=RequestMethod.GET)
	public String testRest(@PathVariable("id") Integer id){
		System.out.println("testRest Get id= "+id);
		return SUCCESS;
	}
	
	@RequestMapping("/testPathVariable/{id}")
	public String testAndPath(@PathVariable("id")Integer id){
		System.out.println("@PathVariable=="+id);
		return SUCCESS;
	}
	
	@RequestMapping("/testAntPath/*/abc")
	public String testAndPath(){
		System.out.println("testAntPath");
		return SUCCESS;
	}
	
	@RequestMapping(value="/testParamsAndHeaders", params={"username","age!=10"},headers={"Accept-Language: zh-CN,zh;q=0.9"})
	public String testParamsAndHeaders(){
		System.out.println("testParamsHeaders");
		return SUCCESS;
	}
	
	@RequestMapping(value="/testMethod",method=RequestMethod.POST)
	public String testMethod() {
		System.out.println("testMethod");
		return SUCCESS;
	}

	@RequestMapping("/testRequestMapping")
	public String testRequestMapping()
	{
		System.out.println("testRequestMapping");
		return SUCCESS;
	}
}
