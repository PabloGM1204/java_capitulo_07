import java.util.Scanner;
public class Ejercicio20{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa te ordena los reyes que escribas");
        System.out.print("Dime el número total de nombres de reyes: ");
        int num = sc.nextInt();
        String[] reyes = new String[num];
        System.out.println("Introduce los nombres de los reyes y pulse Intro:");
        for(int i = 0; i<num; i++){
            reyes[i] = sc.nextLine();
        }
        System.out.println("Los reyes introducidos son: ");
        for(int i = 0; i<num; i++){
            int rep = 1;
            for(int j = 0; j<i; j++){
                if(reyes[i].equals(reyes[j])){
                    rep++;
                }
            }
            System.out.println(reyes[i]+" "+rep+"º");
        }
    }
}