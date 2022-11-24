import java.util.Scanner;
public class Ejercicio9{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa te pide 8 números y te dicen los que son pares y cuales los impares");
        System.out.println("Dime números: ");
        int[] array = new int[8];
        int num;
        for(int i = 0; i<8; i++){
            array[i] = num = sc.nextInt();
        }
        for(int i = 0; i<8; i++){
            if(i != 7){
                if(array[i]%2 == 0){
                    System.out.print(array[i]+" par,");
                }else{
                    System.out.print(array[i]+" impar,");
                }
            }else{
                if(array[i]%2 == 0){
                    System.out.print(array[i]+" par.");
                }else{
                    System.out.print(array[i]+" impar.");
                }
            }
        }
    }
}