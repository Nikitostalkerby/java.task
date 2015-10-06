package com.itibo.tasks.second;

public class Instruction {

	public Instruction(Packet first, Packet second, int water) {

		System.out.println("Instruction begin. \n");

		// System.out.println(first.getSpace() + second.getSpace());

		while (first.getWater() != water && second.getWater() != water) {
			if (first.getWater() == 0) {
				first.setWater(first.getSpace());
				System.out.println(first.getSpace() + " " + second.getSpace());

				continue;
			}

			if (first.getWater() > 0 && second.getWater() != second.getSpace()) {
				int maxAmount = second.getSpace() - second.getWater();
				if (first.getWater() < second.getSpace()) {
					maxAmount = first.getWater();
					second.setWater((first.getWater() - second.getWater()));
				} else
					second.setWater(second.getSpace() - second.getWater());

				first.setWater(maxAmount);

				System.out.println(first.getSpace() + " " + second.getSpace());

				continue;
			}

			if (second.getWater() == second.getSpace()) {
				second.setWater(second.getWater());
				System.out.println(first.getSpace() + " " + second.getSpace());

				continue;
			}

			if (second.getWater() == 0) {
				second.setWater(second.getSpace());
				System.out.println(first.getSpace() + " " + second.getSpace());
			}
		}
	}
}





