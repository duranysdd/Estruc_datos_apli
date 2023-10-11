package ejemploarreglo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjemploArreglo {
    
        public static BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        public static String entrada;
        
    //Metodo que regresa un arreglo de double y recive un parametro entero
    public static double[]leerPromedios(int n) throws IOException{
        double[]proms=new double[n];
        System.out.println("Introduccion de los parametros individuales de cada estudiante");
        for(int i=0;i<n;i++){
            System.out.println("Escribe el promedio individual del estudiante con el id" +i+ ":");
            entrada=bufer.readLine();
            proms[i]=Double.parseDouble(entrada);
    }
        return proms; //Regresa todos los elementos del arreglo proms
    }
    
    //Regresa un double y recibe un arreglo de double como parametro
    public static double calcularPromedioGrupo(double[] p){
        double suma=0;
        for(int i=0;i<p.length;i++)
            suma=suma+p[i];
        
        return suma/p.length;
    }
    
    //Metodo que no regresa ningun valor
    public static void imprimirPromedios(double[]proms){
        int i=0;
        System.out.println("Promedios individuales de grupo");
        System.out.println("IdAlumno           Promedio individual");
        System.out.println("---------------------------------------");
        for(double prom:proms){
            System.out.println("     "+i+"          "+prom);
            i++;
        }
    } 

    public static void main(String[] args) throws IOException {
        final int T = 5;//Declarando una constante
        
        double promedioGrupo;
        
        //Para abrir in buffer de entrada

        double[] dole;
        
        int t;
        
        //Declarando y construyendo un arreglo
        int[] arreglo = new int [5];
        
        //Un arreglod de char
        char[] caracteres = new char[T];
        
        //declaracion un arreglo double
        //double[] promedios={9.1, 8.6, 7.4, 5.3, 9.2, 6.5};
        
        double[] promedios;
        
        //Declaracion de un arreglo de valores booleanos
        boolean[]datos;
        
        //Inicializamos todas las casillas del arreglo en 0
        for (int i=0; i<5; i++)
            arreglo[i]=0;
        
        //Asi no se puede imprimir el contenido de un arreglo
        
        //System.out.println("arreglo: ");
        //System.out.println(arreglo);
        
        
        //Asi se imprime el contenido de un arreglo
        System.out.println("Contenido para el arreglo; ");
        for(int i=0; i<arreglo.length; i++)
            System.out.println("arreglo ["+ i +"] = " + arreglo[i]);
            
            //Leer los valores del arreglo caracteres
            
        System.out.println("Escribe los valores del arreglo caracteres");
        for (int i=0;i<T;i++){
            System.out.println("Escribe el valor["+ i+"]");
            entrada=bufer.readLine();
            caracteres[i]=entrada.charAt(0);
         }
        
        System.out.println("Contenido para el arreglo; ");
        for(int i=0; i<arreglo.length; i++)
            System.out.println("Caracteres ["+ i +"] = " + caracteres[i]);
        
        
        System.out.println("Escribe el tamaño: ");
        entrada=bufer.readLine();
        t=Integer.parseInt(entrada);
        
        datos=new boolean[t];//Construimos el arreglo datos con el tamaño t
        
        
        //Rellenadno datos con valores booleanos
        for(int i=0;i<t;i++){
            System.out.println("Escribe el valor["+i+"]de los datos ");
            entrada=bufer.readLine();
            datos[i]=Boolean.parseBoolean(entrada);
        }
        
        //Mostrando los valores del arreglo de datos
        for(boolean unDato: datos)
            System.out.println(unDato);
        
        
        //Datos doubles
        
        dole=new double[t];
        for(int i=0;i<t;i++){
            System.out.println("Escribe un valor["+i+"] de dobles");
            entrada=bufer.readLine();
            dole[i]=Double.parseDouble(entrada);
        }
        
        for(double doble: dole)
            System.out.println(doble);
        
        
        
        //Calcular el promedio de un grupo
        System.out.println();
        System.out.println("Escribe el tamaño del grupo");
        entrada=bufer.readLine();
        t=Integer.parseInt(entrada);
        
        promedios=leerPromedios(t);
        imprimirPromedios(promedios);
        promedioGrupo=calcularPromedioGrupo(promedios);
        System.out.println("El promedio del grupo es: "+promedioGrupo);
        
    }
    
}
 