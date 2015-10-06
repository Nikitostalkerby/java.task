package com.itibo.tasks.second;

public class Packet {

	public int space;
	public boolean isFull;

	public int getSpace() {
		return this.space;
	}

	public void setSpace(int space) {
		this.space = space;
	}

	public boolean getIsFull() {
		return true;
	}

	public void setIsFull(boolean isFull) {
		this.isFull = isFull;
	}

	public Packet() {
		this.space = 0;
		this.isFull = false;
	}

	public Packet(int space, boolean isFull) {
		this.space = space;
		this.isFull = isFull;
	}
}
