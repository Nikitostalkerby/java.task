package task03;

/**
 * Created by Vaas on 31.10.2015.
 */
public class javase02task03 {

    public static void main(String[] args) {

        String date = "yyyy/mm/dd";
        date.replaceAll("-","/");
        String year = new String(date.substring(0,4));
        String month = new String(date.substring(5,7));
        String day = new String(date.substring(8,10));
        System.out.println(year + " " + month + " " + day);
    }
}
