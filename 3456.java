import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger a = new BigInteger(scanner.nextLine());
        System.out.println(a);
        while (a.compareTo(BigInteger.valueOf(9)) > 0) {
            a = a.divide(BigInteger.valueOf(10)).multiply(BigInteger.valueOf(3)).add(a.mod(BigInteger.valueOf(10)));
            System.out.println(a);
        }
    }