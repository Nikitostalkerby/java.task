package com.itibo.tasks.second;

public class Instruction {

	public Instruction(Packet first, Packet second, int water) {

		System.out.println("Instruction begin. \n");
		
		System.out.println(first.getSpace() + second.getSpace());
	}

}
