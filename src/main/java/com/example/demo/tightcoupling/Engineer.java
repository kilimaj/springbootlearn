package com.example.demo.tightcoupling;

import org.springframework.stereotype.Component;

@Component
public class Engineer implements Job {

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("I'm an Engineer");
	}

}
