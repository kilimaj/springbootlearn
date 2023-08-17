package com.example.demo.tightcoupling;

public class TightCouplingSolution {
	Job job;

	public TightCouplingSolution(Job job) {
		super();
		this.job = job;
	}
	
	public void showData() {
		job.display();
	}
}
