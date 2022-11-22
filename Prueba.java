import java.util.Scanner;
public class Prueba{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[][] l = new int[t][t];
        for(int i = 0; i<t; i++){
            for(int j = 0; j<t; j++){
                if(j == i){
                    l[i][j] = 1;
                }
                System.out.print(l[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("");
        int[][] li = new int[t][t];
        for(int i = 0; i<t; i++){
            for(int j = 0; j<t; j++){
                if(i+j+1 == t){
                    li[i][j] = 1;
                }
                System.out.print(li[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("");
        int[][] l1 = new int[t][t];
        for(int i = 0; i<t; i++){
            for(int j = 0; j<t; j++){
                if(j == i || i == 0 || i == t-1 || j == 0 || j == t-1 || i+j+1 == t){
                    l1[i][j] = 1;
                }
                System.out.print(l1[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("");
        int[][] l2 = new int[t][t];
        for(int i = 0; i<t; i++){
            for(int j = 0; j<t; j++){
                if(i == j || j <= i){
                    l2[i][j] = 1;
                }
                System.out.print(l2[i][j]+" ");
            }
            System.out.println(" ");
        }
        System.out.println("");
        int[][] l2a = new int[t][t];
        for(int i = 0; i<t; i++){
            for(int j = 0; j<t; j++){
                if(i == j || j >= i){
                    l2a[i][j] = 1;
                }
                System.out.print(l2a[i][j]+" ");
            }
            System.out.println(" ");
        }
        System.out.println("");
        int[][] l3 = new int[t][t];
        for(int i = 0; i<t; i++){
            for(int j = 0; j<t; j++){
                if(j%2 == 0){
                    l3[i][j] = 1;
                }
                System.out.print(l3[i][j]+" ");
            }
            System.out.println(" ");
        }
        System.out.println("");
        int[][] l4 = new int[t][t];
        for(int i = 0; i<t; i++){
            for(int j = 0; j<t; j++){
                if(i%2 == 0){
                    l4[i][j] = 1;
                }
                System.out.print(l4[i][j]+" ");
            }
            System.out.println(" ");
        }
        System.out.println("");
        int[][] l5 = new int[t][t];
        for(int i = 0; i<t; i++){
            for(int j = 0; j<t; j++){
                if((i+j)%2 == 0){
                    l5[i][j] = 1;
                }
                System.out.print(l5[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}