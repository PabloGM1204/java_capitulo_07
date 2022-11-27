public class Ejercicio24{
    public static void main(String[] args) {
        System.out.println("Este programa pide 20 números y los metes en una array");
        int[][] nums = new int[4][5];
        int num;
        int sumafila = 0;
        int sumColum = 0;
        int sumTo = 0;
        System.out.println("Dime números:");
        for(int i = 0; i<4; i++){
            for(int j = 0; j<5; j++){
                nums[i][j] = (int)(Math.random()*(999-100+1)+100);
            }
        }
        System.out.println("");
        for(int i = 0; i<4; i++){
            sumafila = 0;
            for(int j = 0; j<5; j++){
                System.out.printf("%-15d ",nums[i][j]);
                sumafila += nums[i][j];
            }
            sumColum += nums[i][i];
            System.out.printf("%3d fila %d\n",sumafila,i);
        }
        for(int j = 0; j<5; j++){
            sumColum = 0;
            for(int i = 0; i<4; i++){
                sumColum += nums[i][j];
            }
            sumTo += sumColum;
            System.out.printf("%d Columna %-3d",sumColum,j);
        }
        System.out.printf("%3d Total",sumTo);
    }
}    