/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Loket;

import java.util.Scanner;

/**
 *
 * @author windows 10
 */
public class Hitung {
   Scanner in = new Scanner(System.in);
   
   public int ht_Golongan(int bayar){
       System.out.println("========Data Mahasiswa\t:========");
       System.out.print("NAMA\t: ");
       String nama = in.nextLine();
       System.out.print("NIM\t: ");
       int nim = in.nextInt();
       System.out.print("Semester Berapakah Yang Ingin Dibayar\t: ");
       int sem = in.nextInt();
  
       int total = 0;
       System.out.println("_____Pembayaran______");
       
       System.out.print("Golongan Berapa UKT anda?\t: ");
       int Golongan = in.nextInt();
       System.out.print("Jumlah Uang Yang Dibayarkan =");
       int jmlh = in.nextInt();
       switch (Golongan) {
           case 1:
               total = 1000000;
               break;
           case 2:
               total = 2000000;
               break;
           case 3:
               total = 3000000;
               break;
           case 4:
               total = 4000000;
               break;
           case 5:
               total = 5000000;
               break;
           case 6:
               total = 6000000;
               break;
           case 7:
               total = 7000000;
               break;
           case 8:
               total = 8000000;
               break;
           case 9:
               total = 9000000;
               break;
           case 10:
               total = 10000000;
               break;
       }
       
       System.out.println("Harga : "+total);
       total=jmlh-total;
       System.out.println("Kembalian : "+total);
       return(0);
   } 
   public int ht_Beasiswa(int Bayar){
       System.out.println("========Data Mahasiswa\t:========");
       System.out.print("NAMA\t: ");
       String Nama =in.next();
       System.out.print("NIM\t: ");
       int nim = in.nextInt();
       System.out.print("Semester Berapakah Yang Ingin Dibayar\t: ");
       int sem = in.nextInt();
       System.out.print("Berapakah IPK anda \t: ");
       int ipk = in.nextInt();
       if(ipk < 3){ 
           System.out.println("\nJika anda memiliki IPK Dibawah 3 Lagi");
           System.out.println("Maka Beasiswa Akan Dicabut");
       }
       else if( ipk <= 4 && 3 <= ipk ) { 
           System.out.println("Biaya Kuliah Anda Gratis!!");
           System.out.println("Tetap Semangat Dalam Belajar");
           System.out.println("      dan");
           System.out.println("Jangan Putus asa\n");}
       
       
       return (0);
       
       
                                
   }


    }
  
   

