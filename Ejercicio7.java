import java.util.Scanner;
public class Ejercicio7{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa genera 100 números aleatorios");
        int [] array = new int [100];
        String verde = "\033[32m";
        String blanco = "\033[37m";
        for(int i = 0; i<100; i++){
            array[i] = (int)(Math.random()*21);
            System.out.print(array[i]+" ");
        }
        System.out.println("");
        System.out.print("Introduzca un número de los que se han mostrado: ");
        int numvisto = sc.nextInt();
        System.out.print("Introduzca el valor por el que quiere sustituirlo: ");
        int numcambio = sc.nextInt();
        for(int i = 0; i<100; i++){
            if(array[i]==numvisto){
                array[i] = numcambio;
                System.out.print(verde+"\""+array[i]+"\" "+blanco);
            }else{
                System.out.print(array[i]+" ");
            }
        }

    }
}