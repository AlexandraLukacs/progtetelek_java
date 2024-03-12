/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tombnelkul;

import java.util.Scanner;


public class ElemiProgTetelek {
    
    static Scanner sc = new Scanner(System.in);
    /*
	Az osztály (Scanner) egy példánya (sc), az objektum (sc).
	A példányosítás a konstruktor függvénnyel (Scanner()) történik.
	A konstruktor megegyezik az osztály nevével és a new operátor mögött áll.
    */
    
    public static void main(String[] args) {
        System.out.print("Szám: ");
        int s = sc.nextInt();
        System.out.println("s=" + (s * 3));
        
        int n = -1;
        while (n < 0){
            System.out.print("N= ");
            n = sc.nextInt();
            //n = int(input("N "))
        }
        
        System.out.println("");
        
        /*Összegzés tétel*/
        /** Python kód: **/
//        n = -1
//        while n < 0:
//            n = int(input("N= "))
//        }
//        ossz = 0
//        for i in range(n+1):
//            ossz += i
//
//        print(ossz)


        /** Java kód: **/
        //bekérés, nem a tétel része:
        System.out.println("Összegzés tétel");
        n = -1;
        while (n < 0){
            System.out.print("N= ");
            n = sc.nextInt();
        }
        int ossz = 0;
        for (int i = 0; i<n+1; i++){
            ossz += i;
        }
        /* kiírások lehetőségei: */
        /*a*///System.out.println("Az első n szám összege: " + ossz);
        /*b*///System.out.println("Az első "+n+" szám összege: " + ossz);
        /*c*///System.out.print("Az első ");
        //System.out.print(n);
        //System.out.println(" szám összege: " + ossz);
        System.out.printf("Az első %d db szám összege: %d\n", n, ossz);
        
        System.out.println("");
        
        /*Megszámlálás tétel*/ 
        /** Python kód: **/
//        db = 0
//        for i in range(10, 100)):
//            if i % 2 == 0: 
//                db++;
//        print(db)
        /** Java kód: **/
        System.out.println("Megszámlálás tétel");
        int db = 0;
        for (int i = 10; i < 100; i++){
            if (i % 2 == 0){
               db ++; 
            }
        }
        System.out.printf("Kétjegyű párosak száma: %d\n",db);
        
        System.out.println("");
        
        /*Szélsőérték tétel*/
        /* MINIMUMKIVÁLASZTÁS - Szélsőérték keresése */
        /** Python kód: **/
//        VEGE = 0
//        db = 0
//        min = 2147483647
//        while (szam := int(input("N="))) != VEGE:
//            if szam < min:
//                min = szam    
//            db += 1
//
//        print(f"{db} számból a legkisebb: {min}")
        /** Java kód: */
        System.out.println("Szélsőérték tétel");
        final int VEGE = 0;
        db = 0;
        int min = Integer.MAX_VALUE; //2147483647;
        int szam;
        //VEGE = -1;
        System.out.println(VEGE + "-ra kilép: ");
        while((szam = sc.nextInt()) != VEGE){
        //while (int szam=input; != VEGE){
            if (szam<min){
                min = szam;
            }
            db++;
        }
        System.out.printf("%d számból a legkisebb: %d\n", db, min);
        
        System.out.println("");
        
        /* ELDÖNTÉS - legalább EGY adott (T) tulajdonságú */
        /** Python kód: **/
//        import math
//
//        n: int = int(input("\nszám: "))
//        prim: bool
//
//        if n < 2:
//            prim = False
//        else:
//            i = 2
//            while i <= math.sqrt(n) and n % i != 0:
//                i += 1
//            prim = i > math.sqrt(n)
//
//        if prim == True:
//            print("Prím")
//        else:
//            print("Nem prím")
        
        /** Java kód: **/
        System.out.print("\nszám: ");
        n = sc.nextInt();
        boolean prim;

        if(n < 2){
            prim = false;
        }else{
            int i = 2;
            while(i <= Math.sqrt(n) && n % i != 0){
                i++; //i += 1;
            }
            prim = i > Math.sqrt(n);
        }
        //if(prim == true){ 
        if(prim){ 
            System.out.println("Prím");
        }
        else{
            System.out.println("Nem prím");
        }
        
        System.out.println("");
        
        /* KIVÁLASZTÁS */
        /** Python kód: **/
//        prim = False
//        n = 9999
//        while !prim :
//            n += 1
//        
//            i = 2
//            while i <= Math.Sqrt(n) and n % i != 0 :
//                i += 1
//
//            prim = i > Math.Sqrt(n)
//
//        print(n)

        /** Java kód: **/
        prim = false;
        n = 9999;
        while (!prim) {
            n++;
            int i = 2;
            while (i <= Math.sqrt(n) && n % i != 0) {
                i++;
            }
            prim = i > Math.sqrt(n);
        }
        
        System.out.println("Az első prím 9999 után: " + n);
        
        System.out.println("");
        
        /* LINEÁRIS KERESÉS */
        /** Python kód: **/
//        also = 42, felso = 67
//        i = also
//        while i <= felso and not(i % 10 == 0) :
//            i += 1
//        
//        van = i <= felso
//        if van :
//            print(f"van 0-ra végződő szám: {i}")
//        else
//            print("nincs 0-ra végződő")
        
        /** Java kód: **/
        int also, felso;
        //bekérés:
        System.out.print("alsó: ");
        also = sc.nextInt();
        System.out.print("felső: ");
        felso = sc.nextInt();
        
        //ellenőrzés:
        if(also > felso){
            //csere algoritmusa:
            int seged = also;
            also = felso;
            felso = seged;
        }
        
        //eldöntés I.:
        int i = also;
        while(i <= felso && !(i % 10 == 0)) {
            i++;
        }
        boolean van = i <= felso;
        
        //kiválasztás:
        //System.out.printf("%d és %d között ",also, felso);
        /* Használjuk a String OSZTÁLY megfelelő (static) metódusát: */
        //String kimenet = String.format("%d és %d között ",also, felso);
        /* Használjuk egy String OBJEKTUM megfelelő (nem static) metódusát */
        String kimenet = "%d és %d között ".formatted(also, felso);

        if (van){
            //System.out.println("van 0-ra végződő szám: " + i);
            kimenet += "van 0-ra végződő szám: " + i;
            db = i - also + 1;
            kimenet += "\n összesen %d db számot vizsgáltam".formatted(db);
        }else{
            //System.out.println("nincs 0-ra végződő szám");
            kimenet += "nincs 0-ra végződő szám";
        }        
        System.out.println(kimenet);
        
    } //main vége
    
} //class vége
