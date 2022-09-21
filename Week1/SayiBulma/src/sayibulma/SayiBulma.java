/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sayibulma;

/**
 *
 * @author mehme
 */
public class SayiBulma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] sayilar = new int[]{1,2,5,7,9,0};
        int aranacak =5;
        boolean varMi=false;
        for (int sayi : sayilar){
            if(sayi==aranacak){
                varMi = true;
                break;
            }
        }
        
        if(varMi){
            System.out.println("Sayı mevcuttur");
        }else{
            System.out.println("Sayı mevcut degildir");
        }
    }
    
}
