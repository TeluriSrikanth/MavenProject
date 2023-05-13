package com.sample.Helloworld;
public class Sample{
	private String message;
	public void setMessage(String message) {
		this.message=message;
		}
	public void getMessage() {
		System.out.println("Hello "+ message +" welcome to Devops-project!");
	}
	public static void main(String[] args) {
		Sample sample = new Sample();
		sample.setMessage("Murali");
		sample.getMessage();
		
	}
}



