package task02;

/*
 * Indian code of algorithm.
 * This object also have checking block, that should be
 * another class.
 */

public class Instruction {

    public Instruction(Packet first, Packet second, int water) {

        System.out.println("Instruction begins. \n");

        if (second.getSpace() > first.getSpace()) {
            int var = first.getSpace();
            first.setSpace(second.getSpace());
            second.setSpace(var);
        }

        if (water % GreatestCommonDivisor.gcd(first.getSpace(), second.getSpace()) == 0 && water <= first.getSpace()) {

            while (first.getWater() != water && second.getWater() != water) {
                if (first.getWater() == 0) {
                    first.addWater(first.getSpace());

                    System.out.println(first.getWater() + " " + second.getWater());

                    continue;
                }

                if (first.getWater() > 0 && second.getWater() != second.getSpace()) {
                    int maxAmount = second.getSpace() - second.getWater();
                    if (first.getWater() < second.getSpace()) {
                        maxAmount = first.getWater();
                        second.addWater(first.getWater() - second.getWater());
                    } else {
                        second.addWater(second.getSpace() - second.getWater());
                    }

                    first.deleteWater(maxAmount);

                    System.out.println(first.getWater() + " " + second.getWater());

                    continue;
                }

                if (second.getWater() == second.getSpace()) {
                    second.deleteWater(second.getWater());
                    System.out.println(first.getWater() + " " + second.getWater());

                    continue;
                }

                if (second.getWater() == 0) {
                    second.addWater(second.getSpace());
                    System.out.println(first.getWater() + " " + second.getWater());
                }
            }
        } else {
            System.out.println("It is impossible, sorry.");
        }
    }
}