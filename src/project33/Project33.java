/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project33;

import java.util.Scanner;
//buatlah program rental mobil
//1) buatlah menu untuk menambahkan mobil
//	a) masukkan merk mobil
//	b) beserta harga mobil rental
//2) buatlah menu untuk mencari nama mobil
//	a) mencari menggunakan merk mobil
//3) buatlah menu untuk men-gupdate nama merk mobil
//4) buatlah menu untuk men-gupdate harga mobil
//5) buatlah menu untuk menampilkan list mobil beserta harganya
/**
 *
 * @author London
 */
public class Project33 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner scan = new Scanner(System.in);
    int i = 0;
    
    String namaMobil[] = new String[5];
    int hargaMobil[] = new int[5];
    String cariMobil;
    String updateMobil;
    int hargaMobilNew;
    int totalMobil;
    int temp = 4;
    do{
    System.out.println("===Usaha Mobil===");
        System.out.println("1.Menambah Mobil");
        System.out.println("2.Mencari Mobil");
        System.out.println("3.Update Harga Mobil");
        System.out.println("4.Tampilkan Semua Mobil");
        
        
        i = scan.nextInt();
        
           switch(i){
                    case 1 : 
                    
                        
                    
                    
                    for(int e = 0; e<=temp;e++){
                        
                        System.out.println("index = "+e);
                        System.out.println("Masukan Nama Mobil = ");
                    namaMobil[e] = scan.next();
                        System.out.println("Masukan Harga Mobil Rental = ");
                    hargaMobil[e] = scan.nextInt();
                    }
                        
                    
                    break;
                    
                    
                    case 2 :
                         System.out.println("Masukan Nama Mobil = ");
                    cariMobil = scan.next();
                    for(int r = 0; r<=temp;r++){
                        
                        if(namaMobil[r].equalsIgnoreCase(cariMobil)){
                        System.out.println("index = "+r);
                        System.out.println("Harga Mobil Rental = "+hargaMobil[r]);
                        }
                       
                        }
                        
                   
                    break;
                case 3 :
                       System.out.println("Masukan Nama Mobil = ");
                       cariMobil = scan.next();
                       for(int r = 0; r<=temp;r++){
                            
                       if(namaMobil[r].equalsIgnoreCase(cariMobil)){
                            System.out.println("index = "+r);
                            
                            System.out.println("Update Harga Mobil = ");
                            hargaMobil[r] = scan.nextInt();
                            System.out.println("Harga Mobil Rental = "+hargaMobil[r]);                    
                       }

                       }
                        
                    break;
                              case 4 :
                    for(int t = 0; t<=temp;t++){
                        System.out.println("Harga Mobil");
                    System.out.println("Harga Mobil = "+hargaMobil[t]);
                    }
                    
                    break; 
               
           }
           
  
        }while(i!=0);
         
               
           
    }
    
}
