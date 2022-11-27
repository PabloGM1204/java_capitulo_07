public class Ejercicio18{
    public static void main(String[] args) {
        System.out.println("Este programa ordena números aleatorios dentro de una array");
        int[] nums = new int[10];
        int[] men = new int[10];
        int[] may = new int[10];
        int contmen = 0;
        int contmay = 0;
        for(int i = 0; i<10; i++){
            nums[i] = (int)(Math.random()*201);
            System.out.print(nums[i]+" ");
            if(nums[i] <= 100){
                men[contmen++] = nums[i];
            }else{
                may[contmay++] = nums[i];
            }
        }
        System.out.println("\nArray Original\n┌────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
        System.out.print("| Índice |");
        for(int i = 0; i<10; i++){
            System.out.printf("  %d  |",i);
        }
        System.out.println("\n├────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");
        System.out.print("| Valor  |");
        for(int i = 0; i<10; i++){
            System.out.printf(" %3d |",nums[i]);
        }
        System.out.println("\n└────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");
        int[] res = new int[10];
        int menCol = 0;
        int mayCol = 0;
        int j = 0;
        do{
            if(menCol < contmen){
                res[j++] = men[menCol++];
            }
            if(mayCol < contmay){
                res[j++] = may[mayCol++];
            }
        }while(j<10);
        System.out.println("Array Resultado\n┌────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
        System.out.print("| Índice |");
        for(int i = 0; i<10; i++){
            System.out.printf("  %d  |",i);
        }
        System.out.println("\n├────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");
        System.out.print("| Valor  |");
        for(int i = 0; i<10; i++){
            System.out.printf(" %3d |",res[i]);
        }
        System.out.println("\n└────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");
    }
}