package polymorphism;

import java.util.Random;

public class Secret implements Encryptable {
    private String message;
    private boolean encrypted;
    private int shift;
    private Random generator;

    //Constructor: Stores the original message and defines a value for the encryption shift.
    public Secret(String msg) {
        message = msg;
        encrypted= false;
        generator = new Random();
        shift = generator.nextInt(10)+5;

    }

    //Encrypts this secret.
    @Override
    public void encrypt() {
        if (!encrypted) {
            String masked ="";
            for (int index=0; index < message.length(); index++){
                masked = masked + (char) (message.charAt(index) + shift); // 기존 String masked 를 더해줘야 에러안남
            } message = masked;
            encrypted = true;
        }
    }

    //Decrypts and returns this secret.
    @Override
    public String decrypt() {
        if (encrypted) {
            String unmasked ="";
            for (int index=0; index < message.length(); index++)
                unmasked = unmasked + (char)(message.charAt(index) - shift);
            message = unmasked;
            encrypted = false;
        }
        return message;
    }

    //Returns true if secret is currently encrypted.
    public boolean isEncryted() {
        return encrypted;
    }

    //Returns this secret.
    public String toString() {
        return message;
    }


}
