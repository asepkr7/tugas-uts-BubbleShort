 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bubbleshort;

/**
 *
 * @author asep
 */
public class BubbleShort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] nilai={12, 56, 34, 65, 76, 71, 25, 22, 34, 45,
24, 28, 29, 21, 31, 38, 86, 35, 77, 76, 71, 58, 41, 48, 49, 52, 40, 78, 79, 80,
90};
        bubbleShortAsc(nilai);
    }
    //prosedur
    public static void bubbleShortAsc(int [] bilangan){
        //ssbelum diurutkan
        System.out.println("==Sebelum Diurutkan==");
        for (int bil : bilangan){
            System.out.println(bil);
        }
        //logic
        for(int i=0; i< bilangan.length; i++) {
        for (int j=0; j <bilangan.length-1; j++){
            //jika nilai saat ini lebih besar dari selanjutnya
            if( bilangan[j] > bilangan[j+1] ){
                //maka ditukar
                int x = bilangan[j];
                bilangan[j] = bilangan[j+1];
                bilangan[j+1] = x;
                
            
            }
        }
        }
//tampilan sesudah
        System.out.println("==Sesudah Diurutkan==");
        for (int bil : bilangan){
            System.out.println(bil+", ");
    }
}
}
