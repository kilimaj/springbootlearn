package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.tightcoupling.Doctor;
import com.example.demo.tightcoupling.Engineer;
import com.example.demo.tightcoupling.TightCouplingProblem;

@SpringBootApplication
public class SpringbootlearnApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootlearnApplication.class, args);
		System.out.println("Welcome to spring appliction");
		TightCouplingProblem problem = new TightCouplingProblem(new Doctor(), new Engineer());
		problem.showData();
	}

}
