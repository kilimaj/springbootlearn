package com.example.demo.tightcoupling;

public class TightCouplingProblem {
	Doctor doctor;
	Engineer engineer;
	
	public TightCouplingProblem(Doctor doctor, Engineer engineer) {
		super();
		this.doctor = doctor;
		this.engineer = engineer;
	}
	
	public void showData() {
		doctor.display();
		engineer.display();
	}
}
