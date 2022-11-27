public class Ejercicio22{
    public static void main(String[] args) {
        System.out.println("Este programa pone números en un array");
        int[][] num = new int[3][6];
        num[0][0] = 0;
        num[1][0] = 75;
        num[0][1] = 30;
        num[0][2] = 2;
        num[2][2] = -2;
        num[2][3] = 9;
        num[1][4] = 0;
        num[0][5] = 5;
        num[2][5] = 11;
        System.out.print("Array num ");
        for(int i = 0; i<6; i++){
            System.out.print("Columna "+i+" ");
        }
        System.out.println("");
        for(int i = 0; i<3; i++){
            System.out.print("Fila "+i);
            for(int j = 0; j<6; j++){
                System.out.printf("%9d",num[i][j]);
            }
            System.out.println("");
        }
    }
}