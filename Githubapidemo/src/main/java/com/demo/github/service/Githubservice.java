package com.demo.github.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class Githubservice {

	
	private List<String> gitApi = Arrays.asList("GitHub Rest Api");
	public List <String> githubApi(){
		return gitApi;
	}
	
	private List<String> jiraApi = Arrays.asList("Jira Rest Api");
	public List <String> jiraApi(){
		return jiraApi;
	}
}
