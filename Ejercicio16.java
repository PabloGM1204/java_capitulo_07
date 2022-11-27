public class Ejercicio16{
    public static void main(String[] args) {
        System.out.println("Este programa muestra 20 números aleatorios y te prgunta por que tipo de números quieres destacar");
        int[] nums = new int[20];
        for(int i = 0; i<20; i++){
            nums[i] = (int)(Math.random()*401);
            System.out.print(nums[i]+" ");
        }
        System.out.print("\n¿Qué números quiere resaltar? (1 - los múltiplos de 5, 2 - los múltiplos de 7): ");
        int op = Integer.parseInt(System.console().readLine());
        if(op == 1){
            for(int i = 0; i<20; i++){
                System.out.print((nums[i] % 5 == 0)?("["+nums[i]+"] "):(nums[i]+" "));
            }
        }else{
            for(int i = 0; i<20; i++){
                System.out.print((nums[i] % 7 == 0)?("["+nums[i]+"] "):(nums[i]+" "));
            }
        }
    }
}