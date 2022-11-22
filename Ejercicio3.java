import java.util.Scanner;
public class Ejercicio3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa lee números del teclado y los muestra de forma inversa");
        int[] lista = new int[10];
        int num;
        for(int i = 9; i>=0; i--){
            System.out.println("Dime números:");
            num = sc.nextInt();
            lista[i] = num;
        }
        for(int i = 0; i<10; i++){
            System.out.print(lista[i]+" ");
        }
    }
}