import java.util.Scanner;
public class Ejercicio5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa lee varios números y te dice cual es el máximo y cual el minimo");
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int [] array = new int[10];
        System.out.println("Dime 10 números:");
        for(int i = 0; i<10; i++){
            int num = sc.nextInt();
            array[i] = num;
            if(max<array[i]){
                max = array[i];
            }
            if(min>array[i]){
                min = array[i];
            }
        }
        for(int i = 0; i<10; i++){
            if(i == 9){
                System.out.print(array[i]);
            }else if(max==array[i]){
                System.out.print(array[i]+" máximo, ");
            }else if(min==array[i]){
                System.out.print(array[i]+" mínimo, ");
            }else{
                System.out.print(array[i]+", ");
            }
        }
    }
}