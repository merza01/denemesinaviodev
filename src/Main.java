import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

     System.out.println("Dogru sayinizi giriniz:");
         int dogru=sc.nextInt();
            
         System.out.println("Yanlis sayinizi giriniz");
         int yanlis=sc.nextInt();
         
         int bos=20-(dogru+yanlis);
         int net =dogru-(yanlis/4);
        
         if(dogru+yanlis>20) {System.out.println("Gecersiz giris");}
         if (dogru<0|| yanlis<0) { System.out.println("Gecersiz giris");}
         else if (net<=20 && net>15) { System.out.println("Net sayiniz:"+net+" Basari durumunuz: Cok Iyi");}
         else if (net<=15 && net>8){ System.out.println("Net sayiniz:"+net+" Basari durumunuz: Iyi");}
         else if  (net<=8 && net>5) {System.out.println("Net sayiniz:"+net+" Basari durumunuz:  Orta");}
         else if (net<=5 && net>=-5) {System.out.println("Net sayiniz:"+net+ "Basari durumunuz: Gelistirilmeli");}     

        
        scanner.close();
    }
}
