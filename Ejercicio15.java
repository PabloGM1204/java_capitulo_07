import java.util.Scanner;
public class Ejercicio15{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa te da una mesa para los comensales");
        int[] mesas =  new int[10];
        boolean hueco = true;
        int pers = 0;
        for(int i = 0; i<10; i++){
            mesas[i] = (int)(Math.random()*5);
        }
        do{
            System.out.print("\n┌─────────┬────────┬────────┬────────┬────────┬────────┬────────┬────────┬────────┬────────┬─────────┐\n│Mesa nº  ");
            for(int i = 1; i<=10; i++){
                System.out.printf("│   %d    ",i);
            }
            System.out.print("│\n├─────────┼────────┼────────┼────────┼────────┼────────┼────────┼────────┼────────┼────────┼─────────┤\n│Ocupación");
            for(int i = 0; i<10; i++){
                System.out.printf("│   %d    ",mesas[i]);
            }
            System.out.println(" │\n└─────────┴────────┴────────┴────────┴────────┴────────┴────────┴────────┴────────┴────────┴─────────┘");
            System.out.print("¿Cuántos son? (Introduzca -1 para salir del programa): ");
            pers = sc.nextInt();
            if(pers == -1){
                System.out.print("Gracias. Hasta pronto.");
            }else{
                for(int i = 0; i<10; i++){
                    if((pers+mesas[i]) <= 4){
                        System.out.print("Por favor, siéntense en la mesa número: "+(i+1));
                        mesas[i] += pers;
                        hueco = true;
                        i = 11;
                    }else{
                        hueco = false;
                    }
                }
                if(!hueco){
                    System.out.println("Lo siento en este momento no nos queda sitio");
                }
            }
        }while(pers != -1);
    }
}