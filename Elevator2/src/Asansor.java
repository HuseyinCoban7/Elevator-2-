
import java.util.Arrays;
import java.util.Scanner;

public class Asansor{
    public static void main(String[] args) {

         
        boolean calistir = true;
        String secenek;
        Scanner scan = new Scanner(System.in);
        while(calistir){
        asansorBaslat();
        System.out.println("Asansoru tekrar calistirmak ister misiniz? "+ "Devam etmek istiyorsaniz 'E veya e'yi tuslayiniz. Durdurmak istiyorsaniz 'H veya h'yi tuslayiniz.");
        secenek = scan.next();
        if(secenek.equals("e")||secenek.equals("E")){
            calistir = true;
        }
        else if(secenek.equals("h")||secenek.equals("H")){
            calistir = false;
        } 
        else{
            System.out.println("Gecersiz veya yanlis tuslama yaptiniz!");
            calistir = false;
        }
        }
    }
   
    
    public static void timer1(){
        for(int i=1;i<=3;i++){
        try {
            System.out.print(" "+ i);
            Thread.sleep(1000);
        }
        catch (InterruptedException ie) {
        }
        }
    }
    
    public static void timer2(){
        try {
            Thread.sleep(2000);
        }
        catch (InterruptedException ie) {
        }
    }
    
    public static void asansorBaslat(){
        
        int [] YUKARI = new int [8];
        int [] ASAGI = new int [5];
        
        for(int i=0; i<8; i++){
        int random = 0;
        boolean tekrar = true;
            while(tekrar){
            random = (int)(Math.random()*11+2);

                for(int j=0; j<=i; j++){
                 if(YUKARI[j] == random){
                   tekrar = true;
                   break;
                  }
                 else if(YUKARI[j] != random)
                  tekrar = false;
        }
        }
        YUKARI[i] = random;
        }
        
        for(int i=0; i<5; i++){
        int random = 0;
        boolean tekrar = true;
            while(tekrar){
            random = (int)(Math.random()*12+1);
                for(int j=0; j<=i; j++){
                 if(ASAGI[j] == random){
                   tekrar = true;
                   break;
                  }
                 else if(ASAGI[j] != random){
                    tekrar = false;
                 }
            }
        }
            
        ASAGI[i] = random;
        }
        
        Arrays.sort(YUKARI);
        Arrays.sort(ASAGI);
        
        int kat = 2;
        
        for(int j=0;j<8;j++){
        if(j==0){
            System.out.println("1. kattan basliyor...");
        }
        else{
            System.out.println(+YUKARI[j-1]+". kattan basliyor...");
        }
        
        for(;kat<=YUKARI[j];kat++){
            System.out.print("Yukari gidiyor... ");
            timer2();
        System.out.println("Simdi "+kat+ ". kattasiniz.");
        }
        
        System.out.print((kat-1)+ ". katta 3 saniyeligine duruyor...");
        timer1();
        System.out.println();
        }
        
        
        kat = YUKARI[7];
                
        for(int k=5;k>0;k--){
        if(k==5){
        System.out.println(+YUKARI[7]+". kattan basliyor...");
        
        if(ASAGI[k-1]==YUKARI[7]){
            k--;
        }
        }
        else
        System.out.println(+ASAGI[k]+". kattan basliyor...");
        
        if(ASAGI[k-1]>YUKARI[7]){
            for(;kat<=ASAGI[k-1];kat++){
            System.out.print("Yukari gidiyor...");
            timer2();
        System.out.println("Simdi "+kat+ ". kattasiniz.");
        }
     System.out.print(ASAGI[k-1]+ ". katta 3 saniyeligine duruyor...");
        timer1();
        System.out.println();
        }
        else{
        for(;kat>ASAGI[k-1];kat--){
            System.out.print("Asagi gidiyor...");
            timer2();
            System.out.println("Simdi " +(kat - 1)+". kattasiniz.");
        }
        
     System.out.print(ASAGI[k-1]+ ". katta 3 saniyeligine duruyor...");
        timer1();
        System.out.println();
        }
        }
        System.out.println("Asansorden cikis yapiliyor!");
        }
}