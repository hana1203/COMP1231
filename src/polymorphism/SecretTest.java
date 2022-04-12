package polymorphism;

public class SecretTest {
    //Creates a Secret object and exercises its encryption.
    public static void main(String[] args) {
        Secret hush = new Secret("whisper of heart");
        System.out.println(hush);
        hush.encrypt();
        System.out.println(hush);
        System.out.println(hush.isEncryted());//true
        hush.decrypt();
        System.out.println(hush);
    }
}
