public class Ejercicio4{
    public static void main(String[] args) {
        System.out.println("Este programa te dice el cuadrado y el cubo de números");
        int[] numero = new int[20];
        int[] cuadrado = new int[20];
        int[] cubo = new int[20];
        for(int i = 0; i<20; i++){
            numero[i] = (int)(Math.random()*101);
            cuadrado[i] = (int)(Math.pow(numero[i], 2));
            cubo[i] = (int)(Math.pow(numero[i], 3));
            System.out.printf("\n--------------------------------------");
            System.out.printf("\nNúmero          Cuadrado          Cubo");
            System.out.printf("\n%-1d %18d %16d",numero[i],cuadrado[i],cubo[i]);
        }
    }
}