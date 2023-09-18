package prac1_sumar;
import java.util.Scanner;
public class Prac1_SumaR {
    public static void main(String[] args) {
        Scanner tec=new Scanner(System.in);
        int lim_s, lim_i;
        double rs;
        
        System.out.println("Ingresa el valor superior");
        lim_s=tec.nextInt();
        System.out.println("Ingresa el valor inferior");
        lim_i=tec.nextInt();
        rs = SumT(lim_s, lim_i);
        System.out.println("El Resultado de la sumatoria: " + rs);
    }
    
    private static  double SumT(int lim_s, int lim_i){
        if(lim_s<lim_i){
            return 0;
        }
        else{
            return Math.pow(lim_i, 2) + SumT(lim_s, lim_i + 1);
        }
    }
    
 }
