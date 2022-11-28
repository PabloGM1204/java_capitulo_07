public class Ejercicio32{
    public static void main(String[] args) {
        System.out.println("Este programa muestra la diagonal de un array");
        int[][] array = new int[9][9];
        int max = 500;
        int min = 900;
        int media = 0;
        for(int i = 0; i<9; i++){
            for(int j = 0; j<9; j++){
                array[i][j] = (int)(Math.random()*(900-500+1)+500);
                System.out.print(array[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("");
        for(int i = 0; i<9; i++){
            for(int j = 0; j<9; j++){
                if(i+j+1 == 9){
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
        System.out.print("\nEl máximo: "+max+" El mínimo: "+min+" La media: "+(media/9));
    }
}