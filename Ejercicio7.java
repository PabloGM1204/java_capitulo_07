public class Ejercicio7{
    public static void main(String[] args) {
        System.out.println("Este programa genera 100 números aleatorios");
        int [] array = new int [100];
        for(int i = 0; i<100; i++){
            array[i] = (int)(Math.random()*21);
            System.out.print(array[i]+" ");
        }

    }
}