import java.util.Scanner;
public class Ejercicio19{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa añade un número a un array");
        int[] nums = new int[11];
        System.out.print("\nArray Original\nÍndice");
        for(int i = 0; i<11; i++){
            System.out.printf("%5d",i);
        }
        System.out.print("\nValor ");
        for(int i = 0; i<11; i++){
            nums[i] = (int)(Math.random()*201);
            System.out.printf("%5d",nums[i]);
        }
        System.out.print("\nIntroduzca el número que quiere insertar: ");
        int num = sc.nextInt();
        System.out.print("Introduzca la posición donde lo quiere insertar (0 - 11): ");
        int pos = sc.nextInt();
        System.out.println("Array Resultado");
        System.out.print("\nArray Original\nÍndice");
        for(int i = 0; i<11; i++){
            System.out.printf("%5d",i);
        }
        int j = 10;
        do{
            nums[j] = nums[j-1]; 
            if(pos == j){
                nums[j] = num;
            }
            j--;
        }while(nums[pos] != num);
        System.out.print("\nValor ");
        for(int i = 0; i<11; i++){
            System.out.printf("%5d",nums[i]);
        }
    }
}