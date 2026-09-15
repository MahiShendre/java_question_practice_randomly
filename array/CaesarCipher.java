import java.util.Scanner;
public class CaesarCipher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        System.out.print("Enter shift: ");
        int shift = sc.nextInt();

        text = text.toUpperCase();
        String encrypted = "";

        // Encryption
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            int n = ch - 'A';
            n = (n + shift) % 26;

            encrypted = encrypted + (char)(n + 'A');
        }
        System.out.println("Encrypted text: " + encrypted);

        // Decryption
        String decrypted = "";
        for (int i = 0; i < encrypted.length(); i++) {
            char ch = encrypted.charAt(i);
            int n = ch - 'A';
            n = (n - shift + 26) % 26;

            decrypted = decrypted + (char)(n + 'A');
        }
        System.out.println("Decrypted text: " + decrypted);
    }
}