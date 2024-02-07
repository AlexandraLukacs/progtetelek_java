/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tombnelkul;

import java.util.Scanner;

/**
 *
 * @author LukácsAlexandra(SZOF
 */
public class ElemiProgTetelek {
    
    static Scanner sc = new Scanner(System.in);
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Szám: ");
        int s = sc.nextInt();
        System.out.println("s=" + (s * 3));
        
        int n = -1;
        while (n < 0){
            System.out.println("N= ");
            n = sc.nextInt();
            //n = int(input("N "))
        }
                
        /*Összegzés tétel*/
        n = -1;
        while (n < 0){
            System.out.println("N= ");
            n = sc.nextInt();
        }
        int ossz = 0;
        for (int i = 0; i<n+1; i++){
            ossz += i;
        }
        System.out.printf("Az első %d db szám összege: %d\n", n, ossz);
        
        /*Megszámlálás tétel*/
        int db = 0;
        for (int i = 10; i<100; i++){
            if (i % 2 == 0){
               db ++; 
            }
        }
        System.out.printf("Kétjegyű párosak száma: %d\n",db);
        
        /*Szélsőérték tétel*/
        final int VEGE = 0;
        db = 0;
        int min = Integer.MAX_VALUE; //2147483647;
        int szam;
        //VEGE = -1;
        System.out.print(VEGE+"0-ra kilép: ");
        while((szam = sc.nextInt()) != VEGE){
        //while (int szam=input; != VEGE){
            if (szam<min){
                min = szam;
            }
            db++;
        }
        System.out.printf("%d számból a legkisebb: %d\n",db,min);
        
    } //main vége
    
} //class vége
