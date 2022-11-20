import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sayi,a=1,b=0;
        Scanner inp = new Scanner(System.in);
        System.out.println("Bir sayi giriniz: ");
        sayi = inp.nextInt();
        for(int i=0;sayi/10!=0;i++){
            b+=sayi%10;
            sayi= sayi/10;
        }
        System.out.print(b + sayi);



    }
}