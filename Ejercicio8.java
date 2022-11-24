import java.util.Scanner;
public class Ejercicio8{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa pide la media de temperatura de cada mes y te muestra un gráfico");
        String[] mes = {
            "enero", "febrero", "marzo", "abril", "mayo", "junio", "julio",
            "agosto", "septiembre", "octubre", "noviembre", "diciembre"
        };
        int[] temp = new int[12];
        int num;
        for(int i = 0; i<12; i++){
            System.out.print("Dime la temperatura media de "+mes[i]+": ");
            temp[i] = num = sc.nextInt();
        }
        String verde = "\033[32m";
        String naranja = "\033[33m";
        String azul = "\033[34m";
        String morado = "\033[35m";
        String blanco = "\033[37m";
        for(int i = 0; i<12; i++){
            System.out.printf(azul+"%12s "+verde+"│ ",mes[i]);
            for(int j = 0; j<temp[i]; j++){
                System.out.print(morado+"▄");
            }
            System.out.println(naranja+" "+temp[i]+"ºC");
        }
        System.out.print(blanco);
    }
}