package com.example.demo.tightcoupling;

import org.springframework.stereotype.Component;

@Component
public class Photographer implements Job{

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("I'm a photographer");
	}

}
