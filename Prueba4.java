import java.util.Scanner;
public class Prueba4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Extrae una parte de una matriz");
        System.out.print("Cuantas columnas quieres: ");
        int columns = sc.nextInt();
        System.out.print("Cuantas filas quieres: ");
        int filas = sc.nextInt();
        int[][] lista = new int[filas][columns];
        int[][] rest = new int[filas][columns];
        System.out.print("Fila inicial a extraer: ");
        int filaIni = sc.nextInt();
        System.out.print("Fila final a extraer: ");
        int filaFin = sc.nextInt();
        System.out.print("Columna inicial a extraer: ");
        int columIni = sc.nextInt();
        System.out.print("Columna final a extraer: ");
        int columFin = sc.nextInt();
        System.out.println("Array Original");
        for(int i = 0; i<filas; i++){
            for(int j = 0; j<columns; j++){
                lista[i][j] = (int)(Math.random()*(900-100-1)+100);
                System.out.print((j == columns-1)?(lista[i][j]+"\n"):(lista[i][j]+" "));
            }
        }
        // 0.2 3.5
        System.out.printf("Array recortado filas %d-%d, columnas %d-%d\n",filaIni,filaFin,columIni,columFin);
        for(int i = filaIni; i<=filaFin; i++){
            for(int j = columIni; j<=columFin; j++){
                rest[i][j] = lista[i][j];
            }
        }
        for(int i = 0; i<filas; i++){
            for(int j = 0; j<columns; j++){
                System.out.printf("%5d",rest[i][j]);
            }
            System.out.println();
        }
    }
}