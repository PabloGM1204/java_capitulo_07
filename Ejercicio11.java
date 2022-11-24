import java.util.Scanner;
public class Ejercicio11{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa ordena la array teniendo los primos primero y los no depues");
        System.out.println("Dime números:");
        int num;
        int[] array = new int[10];
        int[] primo = new int[10];
        int[] noprimo = new int[10];
        boolean esprimo = false;
        int primos = 0;
        int noprimos = 0;
        int i;
        int j;
        for(i = 0; i<10; i++){
            num = sc.nextInt();
            array[i] = num;
            esprimo = true;
            for(j = 2; j < array[i] - 1; j++){
                if(array[i] % j == 0){
                    esprimo = false;
                }
            }
            if(esprimo){
                primo[primos++] = array[i];
            }else{
                noprimo[noprimos++] = array[i];
            }
        }
        System.out.println("Array Inicial");
        System.out.print("Indice");
        for(i = 0; i<10; i++){
            System.out.printf("%3d  |",i);
        }
        System.out.print("\nValor ");
        for(i = 0; i<10; i++){
            System.out.printf("%3d  |",array[i]);
        }
        for(i = 0; i<primos; i++){
            array[i] = primo[i];
        }
        for (i = primos; i < primos + noprimos; i++) {
            array[i] = noprimo[i - primos];
        }
        System.out.println("\nArray Final");
        System.out.print("Indice");
        for(i = 0; i<10; i++){
            System.out.printf("%3d  |",i);
        }
        System.out.print("\nValor ");
        for(i = 0; i<10; i++){
            System.out.printf("%3d  |",array[i]);
        }
    }
}