package com.github.anilktalla.dagger2.sample;

public class Main {

	private SampleComponent component;

	private Main() {
		component = DaggerSampleComponent.builder().build();
	}

	private void sayHello() {
		System.out.println("Hello " + component.aggregate().aggregate());
	}

	public static void main(String[] args) {
		Main main = new Main();
		main.sayHello();
	}
}
