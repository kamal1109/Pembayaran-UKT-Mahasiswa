/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Loket;

import static java.lang.System.exit;
import java.util.Scanner;
import data.*;

/**
 *
 * @author windows 10
 */
public class BayarUkt {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        Golongan BYRGolongan = new Golongan();
        Beasiswa BYRBeasiswa = new Beasiswa();
        Hitung hit = new Hitung();
        
        System.out.println("\t\tPEMBAYARAN UKT MAHASISWA UPN");
        System.out.println("================================================");
        do{
            System.out.println("\nPILIHAN");
            System.out.println("1. Informasi Pembayaran UKT");
            System.out.println("2. Bayar UKT Mahasiswa");
            System.out.println("3. Keluar");
            System.out.print("Pilih : ");
            int pilih = input.nextInt();
           
            switch(pilih){
                case 1 :
                    System.out.println("\tDAFTAR MENU");
                    BYRGolongan.Daftar_Golongan();
                    BYRBeasiswa.Beasiswa();
                    break;

                case 2 :
                     System.out.println("\n\tBAYAR");
                     int totalbayar = 0, bayar = 0, total = 0;
                     do{

                        System.out.println("Pilih yang akan dibayar :");
                        System.out.println("1. Golongan");
                        System.out.println("2. Beasiswa");
                        System.out.println("3. Kembali");
                        System.out.print("Pilih : ");
                        int pilih1 = input.nextInt();
                        
                        switch (pilih1) {
                            case 1:
                                total = hit.ht_Golongan(bayar);
                                break;
                            case 2:
                                total = hit.ht_Beasiswa(bayar);
                                break;
                            case 3:
                                BayarUkt.main(args);
                                break;
                            default:
                                break;
                        }
                        totalbayar = totalbayar+total; 
                     }while(true);
                
                case 3 :
                    exit(0);
                    break;
            }
            
        }while(true);
        
    }
}
