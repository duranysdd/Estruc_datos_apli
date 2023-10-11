
package mcd_recursivo;

import java.util.Scanner;

public class MCD_Recursivo{

    public static void main(String[] args) {
        Scanner en=new Scanner(System.in);
        int num1, num2, mcd;
        System.out.println("Ingresa el primer número");
        num1 = en.nextInt();
        System.out.println("Ingresa el segundo número");
        num2 = en.nextInt();
        
        mcd = maximocdivisor(num1, num2);
        System.out.println("El Máximo Común Divisor de " + num1 + " y " + num2 + " es: " + mcd);
    }
    
    private static int maximocdivisor(int num1, int num2){
        if(num2 == 0){
            return num1;
        }
        else{
            return maximocdivisor(num2, num1%num2);
        }
        
    }
}