public class Ejercicio31{
    public static void main(String[] args) {
        System.out.println("Este programa muestra la diagonal de un array bidimensional");
        int[][] array = new int[10][10];
        int max = 200;
        int min = 300;
        int media = 0;
        for(int i = 0; i<10; i++){
            for(int j = 0; j<10; j++){
                array[i][j] = (int)(Math.random()*(300-200+1)+200);
                System.out.print(array[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("");
        for(int i = 0; i<10; i++){
            for(int j = 0; j<10;  j++){
                if(i == j){
                    System.out.print(array[i][j]+" ");
                    if(max<array[i][j]){
                        max = array[i][j];
                    }
                    if(min>array[i][j]){
                        min = array[i][j];
                    }
                    media += array[i][j];
                }
            }
        }
        System.out.print("\nEl máximo: "+max+" El mínimo: "+min+" La media: "+(media/10));
    }
}