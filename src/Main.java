import java.util.Scanner;
public class Main {

    static boolean isPalindromik(int a){
        int reverseNumber=0, sayi=a;
        while (a!=0){
            reverseNumber = (reverseNumber*10)+(a%10);
            a/=10;
        }
        if (sayi==reverseNumber)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Sayı: ");
        int a = in.nextInt();
        System.out.println(isPalindromik(a));
    }

}
