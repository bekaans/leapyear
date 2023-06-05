import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Lütfen Yılı Giriniz :"); int yil= input.nextInt();

        if ((yil%4)==0)
        {
            System.out.println(yil+" bir artık yıldır...");
        }
        else
        {
            System.out.println(yil+" bir artık yıl değildir..");
        }
    }
}