public class Ejercicio1{
    public static void main(String[] args) {
        System.out.println("Este programa saca los datos que hay en un array");
        int[] num = new int[12];
        num[0] = 39;
        num[1] = -2;
        num[4] = 0;
        num[6] = 14;
        num[8] = 5;
        num[9] = 120;
        // Aquellos valores que no han sido inicializados se les pone un 0 por defecto
        for(int i = 0; i<12; i++){
            System.out.print(num[i]+" ");
        }
    }
}