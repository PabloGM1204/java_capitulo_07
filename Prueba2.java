public class Prueba2{
    public static void main(String[] args) {
        System.out.println("Este programa rota un matriz");
        int anchura = 3;
        int[][] lista = new int[anchura][anchura];
        int[][] rotado = new int[anchura][anchura];
        // Darle valores a la primera matriz
        for(int i = 0; i<anchura; i++){
            for(int j = 0; j<anchura; j++){
                lista[i][j] = (int)(Math.random()*10);
                System.out.print(lista[i][j]+" ");
            }
            System.out.println("");
        }
        // Le digo que en la fila 0 y columna 2 coja el dato y lo guarde en 2,0 con lo de anchura -j -1
        for(int i = 0; i<anchura; i++){
            for(int j = 2; j>=0; j--){
                rotado[j][i] = lista[i][anchura-j-1];
            }
        }
        System.out.println("");
        // Muestra la matriz ya rotada
        for(int i = 0; i<anchura; i++){
            for(int j = 0; j<anchura; j++){
                System.out.print(rotado[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("");
        int[][] lista2 = new int[anchura][anchura];
        int[][] rotado2 = new int[anchura][anchura];
        // Le doy valores a la matriz
        for(int i = 0; i<anchura; i++){
            for(int j = 0; j<anchura; j++){
                lista2[i][j] = (int)(Math.random()*10);
                System.out.print((j == 2)?(lista2[i][j]+"\n"):(lista2[i][j]+" "));
            }
        }
        System.out.println("");
        // Le digo que en la columna 0 y fila 0 coja el dato y lo guarde en la fila 0 y columna anchura-1-j
        for(int i = 0; i<anchura; i++){
            for(int j = 0; j<anchura; j++){
                rotado2[i][anchura-1-j] = lista2[j][i]; 
            }
        }
        // Muestro la matriz ya rotada
        for(int i = 0; i<anchura; i++){
            for(int j = 0; j<anchura; j++){
                System.out.print(rotado2[i][j]+" ");
            }
            System.out.println("");
        }
    }
}