package com.itibo.tasks.second;

public class Packet {

	private int space;
	private int water;

	public Packet() {
		this.space = 0;
		this.water = 0;
	}

	public Packet(int space) {
		this.space = space;
	}

	public int getSpace() {
		return this.space;
	}

	public void setSpace(int space) {
		this.space = space;
	}

	public int getWater() {
		return this.water;
	}

	public void setWater(int water) {
		this.water = water;
	}
}
