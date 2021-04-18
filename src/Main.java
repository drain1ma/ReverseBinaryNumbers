import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String binary = Integer.toBinaryString(num);
        StringBuilder sb=new StringBuilder(binary);
        String reverseBinary = sb.reverse().toString();

        System.out.print(Integer.parseInt(reverseBinary, 2));

        sc.close();
    }

}
