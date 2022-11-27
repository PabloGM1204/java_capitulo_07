public class Ejercicio24{
    public static void main(String[] args) {
        System.out.println("Este programa pide 20 números y los metes en una array");
        // Creo el array con 4 filas y 5 columnas
        int[][] nums = new int[4][5];
        // Donde guardo la suma de las filas
        int sumafila = 0;
        // Donde guardo la suma de las columnas
        int sumColum = 0;
        // La suma total
        int sumTo = 0;
        // i es el número de la fila
        for(int i = 0; i<4; i++){
            // j el número de la columna
            for(int j = 0; j<5; j++){
                nums[i][j] = (int)(Math.random()*(999-100+1)+100);
            }
        }
        System.out.println("");
        // Le digo que en la fila X ponga el número 
        for(int i = 0; i<4; i++){
            sumafila = 0;
            // Este bucle para la columna
            for(int j = 0; j<5; j++){
                System.out.printf("%-15d ",nums[i][j]);
                sumafila += nums[i][j];
            }
            // Muestra la suma total de la fila
            System.out.printf("%3d fila %d\n",sumafila,i);
        }
        // Esta vez es al reves le digo X columna 
        for(int j = 0; j<5; j++){
            sumColum = 0;
            // Le digo que en la Columna X tome los datos de la columna que lo decide i
            for(int i = 0; i<4; i++){
                sumColum += nums[i][j];
            }
            // La suma de la Columna
            sumTo += sumColum;
            System.out.printf("%d Columna %-3d",sumColum,j);
        }
        // El total
        System.out.printf("%3d Total",sumTo);
    }
}    