package com.demo.github.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.github.service.Githubservice;



@RestController
public class Githubcontroller {

	@Autowired
	private Githubservice githubservice;
	
	@RequestMapping("gitapi")
	public List<String> getgithubApi(){
		return githubservice.githubApi();
	}
	
	@RequestMapping("jiraapi")
	public List<String> getjiraApi(){
		return githubservice.jiraApi();
	}
	
}
