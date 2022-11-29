public class Prueba3{
    public static void main(String[] args) {
        int[][] lista1 = new int[3][3];
        int[][] lista2 = new int[3][3];
        int[][] resul = new int[3][3];
        int sum = 0;
        for(int i = 0; i<3; i++){
            for(int j = 0; j<3; j++){
                lista1[i][j] = (int)(Math.random()*10);
                System.out.print((j == 2)?lista1[i][j]+"\n":lista1[i][j]+" ");
            }
        }
        System.out.println("");
        for(int i = 0; i<3; i++){
            for(int j = 0; j<3; j++){
                lista2[i][j] = (int)(Math.random()*10);
                System.out.print((j == 2)?lista2[i][j]+"\n":lista2[i][j]+" ");
            }
        }
        System.out.println("");
        for(int i = 0; i<3; i++){
            for(int j = 0; j<3; j++){
                sum = 0;
                for(int k = 0; k<3; k++){
                    sum += lista1[i][k]*lista2[k][j];
                }
                resul[i][j] = sum;
            }
        }
        for(int i = 0; i<3; i++){
            for(int j = 0; j<3; j++){
                System.out.print((j == 2)?resul[i][j]+"\n":resul[i][j]+" ");
            }
        }
    }
}