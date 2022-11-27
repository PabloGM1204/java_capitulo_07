import java.util.Scanner;
import java.util.function.IntToDoubleFunction;
public class Ejercicio17{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa muestra 10 números aleatorios y tienes que poner uno");
        boolean acertado = true;
        int[] nums = new int[10];
        int num;
        for(int i = 0; i<10; i++){
            nums[i] = (int)(Math.random()*101);
            System.out.print(nums[i]+" ");
        }
        System.out.print("\nDíme un número: ");
        num = sc.nextInt();
        do{
            acertado = false;
            for(int i = 0; i<10; i++){
                if(num == nums[i]){
                    acertado = true;
                    i = 10;
                }else{
                    acertado = false;
                }
            }
            if(!acertado){
                System.out.print("Incorrecto digame otro número: ");
                num = sc.nextInt();
            }
        }while(!acertado);
        while(nums[0] != num){
            int aux = nums[9];
            for(int i = 9; i>0; i--){
                nums[i] = nums[i-1];
            }
            nums[0] = aux;
        }
        for(int i = 0; i<10; i++){
            System.out.print(nums[i]+" ");
        }
    }
}