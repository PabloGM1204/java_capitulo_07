import java.util.Scanner;
public class Ejercicio6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa da la vuelta a un array");
        System.out.println("Dime 15 números:");
        int [] array = new int[15];
        int num;
        for(int i = 0; i<15; i++){
            num = sc.nextInt();
            array[i] = num;
        }
        int aux = array[14];
        for(int i = 14; i>0; i--){
            array[i] = array[i-1];
        }
        array[0] = aux;
        System.out.println("Array rotado hacia la derecha");
        for(int i = 0; i<15; i++){
            System.out.print(array[i]+" ");
        }
    }
}