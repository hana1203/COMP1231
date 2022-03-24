package array;
import org.w3c.dom.ls.LSOutput;

import java.text.NumberFormat;
public class CDCollection {
    private CD[] collection;
    private int count;
    private double totalCost;


    public CDCollection() {
        collection = new CD[50];
        count = 0;
        totalCost = 0.0;
    }

    public void addCD(String title, String artist, double cost, int tracks) {
//        if (count== collection.length) {
//            increaseSize();
        collection[count] = new CD(title,artist,cost,tracks);
        totalCost += cost;
        count++;
        }

    public String toString() {
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        String breakline = "===================================\n";
        return breakline + "My CD Collection\n" +
                "\nNumber of CDs: "+ count +
                "\nTotal cost: " +fmt.format(totalCost) +
                "\nAverage cost: " + fmt.format(totalCost/count)
                + breakline + "\n";
    }


}

