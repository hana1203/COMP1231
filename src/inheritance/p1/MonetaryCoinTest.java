package inheritance.p1;

public class MonetaryCoinTest {
    public static void main(String[] args) {
        MonetaryCoin[] mcoins = new MonetaryCoin[5];
        mcoins[0] = new MonetaryCoin(1);
        mcoins[1] = new MonetaryCoin(10);
        mcoins[2] = new MonetaryCoin(25);
        mcoins[3] = new MonetaryCoin(50);
        mcoins[4] = new MonetaryCoin(100);

//        // flip all of the coins
//        for (MonetaryCoin coin:mcoins) {
//            coin.flip();
//        }

        // compute total value
        int sum =0;
        for (MonetaryCoin coin:mcoins)
            sum += coin.getValue();
        System.out.println("Sum of Coins: "+ sum); //186

        // print the coins
        for (MonetaryCoin coin:mcoins)
            System.out.println(coin);

//        heads1
//        tails10
//        heads25
//        tails50
//        tails100
        //super() 생성자에서 안부르고 flip all the coins 안해도 랜덤값이 나온다.. 흠??

    }
}
