public class Ejercicio21{
    public static void main(String[] args) {
        System.out.println("Este programa rellena una array de 15 elementos");
        int[] nums = new int[15];
        System.out.println("Array Original");
        for(int i = 0; i<15; i++){
            nums[i] = (int)(Math.random()*501);
            System.out.print(nums[i]+" ");
        }
        System.out.println("\nArray Cincuerizado");
        for(int i = 0; i<15; i++){
            if(nums[i] % 5 == 0){
                System.out.print(nums[i]+" ");
            }else{
                do{
                    nums[i]++;
                }while(nums[i] % 5 != 0);
                System.out.print(nums[i]+" ");
            }
        }
    }
}