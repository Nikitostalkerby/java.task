package com.itibo.tasks.second;

public class Packet {

	private int space;
	private boolean isFull;
	private int water;

	public Packet() {
		this.space = 0;
		this.isFull = false;
		this.water = 0;
	}

	public Packet(int space, boolean isFull) {
		this.space = space;
		this.isFull = isFull;
	}

	public int getSpace() {
		return this.space;
	}

	public void setSpace(int space) {
		this.space = space;
	}

	public boolean getIsFull() {
		return this.isFull;
	}

	public void setIsFull(boolean isFull) {
		this.isFull = isFull;
	}

	public int getWater() {
		return this.water;
	}

	public void setWater(int water) {
		this.water = water;
	}
}
