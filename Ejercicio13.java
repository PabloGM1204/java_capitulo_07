import java.util.Scanner;
public class Ejercicio13{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa destaca dos números entre 100");
        int[] array = new int[100];
        int min = 500;
        int max = 0;
        for(int i = 0; i<100; i++){
            array[i] = (int)(Math.random()*501);
            System.out.print(array[i]+" ");
            if(max<array[i]){
                max = array[i];
            }
            if(min>array[i]){
                min = array[i];
            }
        }
        System.out.print("\n¿Que quieres destacar? (1 - mínimo, 2 - máximo): ");
        int op = sc.nextInt();
        if(op == 1){
            for(int i = 0; i<100; i++){
                System.out.print((array[i] == min)?"**"+array[i]+"** ": array[i]+" ");
            }
        }
        if(op == 2){
            for(int i = 0; i<100; i++){
                System.out.print((array[i] == max)?"**"+array[i]+"** ": array[i]+" ");
            }
        }
    }
}