package com.campusdual.classroom;

public class Tractor implements IMachine {

	protected int horsePower = 0;
	
	public Tractor(int hp) {
		this.horsePower = hp;
	}

	public void forward() {
		System.out.println("El tractor avanza");
	}

	public void backward() {
		System.out.println("El tractor retrocede");
	}

	public void start() {
		System.out.println("El tractor está encendido");
	}

	public void stop() {
		System.out.println("El tractor está apagado");
	}

	public void maintenance() {
		System.out.println("El tractor está en mantenimiento");
	}

}
