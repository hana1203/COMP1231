package array;

import java.text.NumberFormat;
import java.util.Locale;

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
        if (count== collection.length) {
            increaseSize();}
        collection[count] = new CD(title,artist,cost,tracks);
        totalCost += cost;
        count++;
    }

//    public String toString() {
//    NumberFormat fmt = NumberFormat.getCurrencyInstance(Locale.US);
//    String output = "===================================\n";
//    output += "My CD Collection\n";
//    output += "\nNumber of CDs: " + count;
//    output += "\nTotal cost: " + fmt.format(totalCost);
//    output += "\nAverage cost: " + fmt.format(totalCost / count);
//    output += "\nCD List: \n";
//
//    //CD 낱장의 정보도 같이 보여주기
//    for (int cd = 0; cd < count; cd++) {
//        output += collection[cd].toString()+ "\n";
//    }
//    return output;
//    }

    public String toString() {
        NumberFormat fmt = NumberFormat.getCurrencyInstance(Locale.US);
        String breakline = "===================================\n";
        String output = breakline + "My CD Collection\n" + "\nNumber of CDs: " + count + "\nTotal cost: " + fmt.format(totalCost)
                + "\nAverage cost: " + fmt.format(totalCost / count) + "\nCD List: \n" + breakline;
//        for (int cd = 0; cd < collection.length; cd++) {// 이렇게 짜면 왜 안되는것? Cannot invoke "array.CD.toString()" because "this.collection[cd]" is null
        for (int cd=0; cd < count; count++) { //이렇게 count 변수로 값 비교해야 됨.
            output += collection[cd].toString();
        }
        return output;
    }

    private void increaseSize() {
        CD[] temp = new CD[collection.length *2];
        for (int cd=0; cd<collection.length; cd++)
            temp[cd] = collection[cd];
        collection = temp;    }
//    StringBuffer buffer = new StringBuffer();
//    String breakline = "===================================\n";

//    public String toString() {
//        NumberFormat fmt = NumberFormat.getCurrencyInstance(Locale.US);
//        buffer.append(breakline);
//        buffer.append("My CD Collection\n");
//        buffer.append("\nNumber of CDs: ");
//        buffer.append(count);
//        buffer.append("\nTotal cost: ");
//        buffer.append(fmt.format(totalCost));
//        buffer.append("\nAverage cost: ");
//        buffer.append(fmt.format(totalCost / count));
//        buffer.append("\nCD List: \n");
//        buffer.append(breakline);
//        for (int cd=0; cd < count; count++) {
//            buffer.append(collection[cd].toString());}
//        return buffer.toString();
//    } not working


}


