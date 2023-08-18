package com.example.demo.tightcoupling;

import org.springframework.beans.factory.annotation.Autowired;

public class AutoWiredExample {
	
	@Autowired
	Job job;
	
	public void showData() {
		job.display();
	}
}
