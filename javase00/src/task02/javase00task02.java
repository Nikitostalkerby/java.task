package task02;

import java.io.IOException;
import java.util.Scanner;

public class javase00task02 {

    public static void main(String[] args) throws IOException {

		/*
         * This is cap
		 */

		/*
         * Packet firstPacket = new Packet(5); Packet secondPacket = new
		 * Packet(8);
		 * 
		 * Instruction ins = new Instruction(firstPacket, secondPacket, 4);
		 */

		/*
		 * Block of real code
		 */

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int water;

        Packet firstPacket = new Packet();
        Packet secondPacket = new Packet();

        System.out.println("Enter the space of packet.");

        System.out.print("First packet: ");
        firstPacket.setSpace(sc.nextInt());

        System.out.print("Second packet: ");
        secondPacket.setSpace(sc.nextInt());

        System.out.print("Enter the volume of water: ");
        water = sc.nextInt();

        @SuppressWarnings("unused")
        Instruction instruction = new Instruction(firstPacket, secondPacket, water);
    }
}