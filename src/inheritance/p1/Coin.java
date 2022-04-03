package inheritance.p1;

public class Coin {
    protected final int HEADS = 0;
    protected final int TAILS = 1;
    protected int face; //current side of coin

    public Coin() {
        flip(); //코인이 생성될때 저절로 초기값은 flip 되어 랜던값나오게
    }

    public void flip() {
        face = (int)(Math.random()*2); // 0.0 <= Math.random() < 1.0 이므로 2곱하고 int 로 캐스팅하면 0, 1 값 나옴.
    }

    public String toString() {
        if(face==HEADS)
            return "heads";
        else
            return "tails";
//        return (face==HEADS)? "heads":"tails"; //conditional operator 로도 표현 가능
    }


}
