
package matristranspozu;
import java.util.*;
public class MatrisTranspozu {

    public static void main(String[] args) {
        int[][] matris, transpoz;
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen sütun sayısı giriniz:");
        int sütun = input.nextInt();
        System.out.println("Lütfen satır sayısı giriniz:");
        int satir = input.nextInt();
        
        matris = new int [sütun][satir];
        transpoz = new int[satir][sütun];
        
        for(int i=0; i<satir; i++){
            System.out.print("Lütfen" + (i+1) + ".satıra gelecek elemanları giriniz:");
            for(int j=0; j<sütun; j++){
                matris[i][j] = input.nextInt();
            }
        }
        
        System.out.println("Matris:");
          for (int i = 0; i < satir; i++) {
            for (int j = 0; j <sütun; j++) {
                System.out.print(matris[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("Transpoz:");
           for (int i = 0; i < satir; i++) {
            for (int j = 0; j <sütun; j++) {
                transpoz[j][i] = matris[i][j];
            }
        }
           
            for (int i = 0; i < sütun; i++) {
            for (int j = 0; j < satir; j++) {
                System.out.print(transpoz[i][j]+" ");
            }
            System.out.println("");
        }   
        
    }
    
}
