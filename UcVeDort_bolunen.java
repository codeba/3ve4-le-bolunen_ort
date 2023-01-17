package patika;

import java.util.Scanner;

public class UcVeDort_bolunen {
    public static void main(String[] args) {
        int sayi;
        Scanner sc = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz:");
        sayi = sc.nextInt();
        int i = 0,k=0,count=0;
        while (true) {
            i++;
            if (i % 3 == 0||i%4==0) {
                k+=i;
                count++;

            }
            if (i == sayi) {
                break;
            }
        }
        System.out.println("Ortalama:"+(k/count));
    }
}
