import java.util.Scanner;
public class Ejercicio29{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa te dice a que posiciones puede ir un alfil");
        System.out.print("\nIntroduzca la posición del alfil, por ejemplo d5: ");
        String alfil = sc.next();
        int columna = (int)(alfil.charAt(0)) - 96;
        int fila = (int)(alfil.charAt(1)) - 48;
        System.out.println("El alfil puede moverse a las siguientes posiciones:");
        for(int i = 8; i >= 1; i--) {
            for(int j = 1; j <= 8; j++) {
                if ((Math.abs(fila - i) == Math.abs(columna - j)) && (! ((fila == i) && (columna == j)))) {
                    System.out.print((char)(j + 96) + "" + i + " ");
                }
            }
        }
    }
}