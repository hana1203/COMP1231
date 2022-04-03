package inheritance.p1;

/*
Design and implement a class called MonetaryCoin that is derived from the Coin class presented in Chapter 5.
Store a value in the monetary coin that represents its value, and add a method that returns its value.
Create a driver class to instantiate and compute the sum of several monetary coin objects.
Demonstrate that a monetary coin can inherit its parent’s ability to be flipped.
 */
public class MonetaryCoin extends Coin{
    private int value;

    //  Sets up a coin with a value.
    public MonetaryCoin(int money) {
//        super();
        value = money;
    }

    //  Sets the value of the coin.
    public void setValue(int value) {
        this.value = value;
    }

    //  Returns the current value of the coin.
    public int getValue() {
        return value;
    }
    //  Returns a description of this coin as a string.
    public String toString() {
        String result;
        result = super.toString();
        result += value;
        return result;
    }


    /*
    public MonetaryCoin() {
        super();
    }

    public int getValue() {
        return face;
    }

    public String showValue() {
        return (face==HEADS)? "heads":"tails";
    }

    public static void main(String[] args) {
        MonetaryCoin mcoin = new MonetaryCoin();
        System.out.println(mcoin.getValue()); //ex)1
        System.out.println(mcoin.showValue()); //ex)tails
        MonetaryCoin mcoin1 = new MonetaryCoin();
        System.out.println(mcoin1.showValue()); //ex)heads
        System.out.println(mcoin1); //ex)heads 출력. showValue() 메소드 호출 안해도 랜덤값에따라 heads || tails 출력함. Coin() 에 toString() 구현되어있어서.
        MonetaryCoin mcoin2 = new MonetaryCoin();
        System.out.println(mcoin2);
        System.out.println("Sum of MonetaryCoins: ");
        System.out.println(mcoin.getValue() + mcoin1.getValue() + mcoin2.getValue());
    }
     */
}
