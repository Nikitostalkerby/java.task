package com.itibo.tasks.second;

public class Instruction {

	public Instruction(Packet first, Packet second, int water) {

		System.out.println("Instruction begin. \n");
		
		System.out.println(first.getSpace() + second.getSpace());
		
		int a = first.getWater();
		int b = second.getWater();
		
		first.setWater(first.getSpace());
		first.setIsFull(true);
		
		second.setWater(first.getSpace());
		
		while(second.getIsFull() == false) {
			if(second.getSpace() == b) {
				second.setIsFull(true);
			}
			b += a;
		}
	}

}
