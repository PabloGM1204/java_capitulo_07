public class Ejercicio27{
    public static void main(String[] args) {
        System.out.println("Este programa rellena un array y te muestra el máximo y el minimo");
        int[][] nums = new int[6][10];
        int max = 0;
        int min = 1001;
        int posFilmax = 0;
        int posColumax = 0;
        int posFilmin = 0;
        int posColumin = 0;
        int numRe = 0;
        boolean repetido = true;
        for(int i = 0; i<10; i++){
            System.out.print("      Columna "+i);
        }
        System.out.println("");
        for(int i = 0; i<6; i++){
            System.out.print("Fila "+i+"   ");
            for(int j = 0; j<10; j++){
                do{
                    nums[i][j] = (int)(Math.random()*1001);
                    repetido = false;
                    for(int k = 0; k<10*i+j; k++){
                        if(nums[i][j] == nums[k/10][k%10]){
                            repetido = true;
                        }
                    }
                }while(repetido);
                System.out.printf("%-15d",nums[i][j]);
                if(max<nums[i][j]){
                    max = nums[i][j];
                    posFilmax = i;
                    posColumax = j;
                }
                if(min>nums[i][j]){
                    min = nums[i][j];
                    posFilmin = i;
                    posColumin = j;
                }
            }
            System.out.println("");
        }
        System.out.println("El máximo es: "+max+" y esta en la fila  "+posFilmax+" y Columna "+posColumax);
        System.out.println("El mínimo es: "+min+" y esta en la fila  "+posFilmin+" y Columna "+posColumin);
    }
}