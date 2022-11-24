import java.util.Scanner;
public class Ejercicio12{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa cambia la posicion de dos números dentro de un array");
        System.out.println("Dime números:");
        int[] array = new int[10];
        int num;
        for(int i = 0; i<10; i++){
            array[i] = num = sc.nextInt();
        }
        System.out.print("Dime un número(0-9): ");
        int inicial = sc.nextInt();
        System.out.print("Dime otro número(0-9): ");
        int fina = sc.nextInt();
        if((inicial < 9) && (fina < 9) && (inicial > 0) && (fina > 0) && (inicial<fina)){
            System.out.print("Array Inicial\nÍndice");
            for(int i = 0; i<10; i++){
                System.out.printf("%3d   ",i);
            }
            System.out.print("\nValor ");
            for(int i = 0; i<10; i++){
                System.out.printf("%3d  |",array[i]);
            }
            int[] r = new int[10];
            r[fina] = array[inicial];
            for(int i = 1; i<10; i++){
                r[(fina+i)%10] = array[(fina+i-1)%10];
            }
            System.out.print("\nArray Final\nÍndice");
            for(int i = 0; i<10; i++){
                System.out.printf("%3d   ",i);
            }
            System.out.print("\nValor ");
            for(int i = 0; i<10; i++){
                System.out.printf("%3d  |",r[i]);
            }
        }else{
            System.out.println("Error debes escribir un número entre 0 y 9");
        }
    }
}