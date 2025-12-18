import java.security.SecureRandom;

public class PasswordGenerator {
    public static void main(String[] args) {
        SecureRandom rnd = new SecureRandom();
        StringBuilder pass = new StringBuilder();

        String options  = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        for(int i = 0; i<9; i++){
            int idx = rnd.nextInt(options.length());
            pass.append(options.charAt(idx));
        }

        System.out.println(pass.toString());
    }
}
