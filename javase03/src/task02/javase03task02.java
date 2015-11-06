package task02;

/**
 * Created by Vaas on 06.11.2015.
 */
public class javase03task02 {
    public static void main(String[] args) {

        // default 5 count and 5 length
        Kit kit = new Kit();

        // set value index 0 and 1
        kit.setValue(0);
        kit.setValue(1);

        // print all and 0
        kit.print();
        kit.print(0);

        // addition and print
        System.out.print("\n\nAdding: ");
        kit.add(0, 1);

        // union and return string
        System.out.print("\nUnion: ");
        System.out.println(kit.union(0, 1));

        // find Bxo)|(DeHie
        System.out.println("\nIndex of string: " + kit.find("123"));
    }
}
