import java.util.Scanner;

public class g {
    public static void main(String args[])
    {

        System.out.println("random sayi " + randomSayi); //üretilen sayıyı konsola bastırdık

        int birler = randomSayi %10; //birler basamağı

        randomSayi = randomSayi /10;
        int onlar = randomSayi %10;   //onlar basamağı

        int yuzler = randomSayi /10;  //yüzler basamağı

        System.out.println("Toplamları ="+(birler+onlar+yuzler));
    }
}