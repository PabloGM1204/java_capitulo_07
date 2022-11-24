import java.util.Scanner;
public class Ejercicio14{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa almacenas palabras y la ordena");
        String[] lista = new String[8];
        String[] colores = {
            "verde", "rojo", "azul", "amarillo", "naranja", "rosa", "negro", "blanco", "morado"
        };
        int j = 0;
        String[] r = new String[8];
        String word;
        System.out.println("Dime colores:");
        for(int i = 0; i<8; i++){
            lista[i] = word = sc.next();
            for(String c: colores){
                if(lista[i].equals(c)){
                    r[j++] = c;
                }
            }
        }
        for(int i = 0; i<8; i++){
            boolean esColor = false;
            for(String c: colores){
                if(lista[i].equals(c)){
                    esColor = true;;
                }
            }
            if(!esColor){
                r[j++] = lista[i];
            }
        }
        System.out.println("Array Inicial\n┌────────┬────────┬────────┬────────┬────────┬────────┬────────┬────────┐");
        for(int i = 0; i<8; i++){
            System.out.printf("│   %d    ",i);
        }
        System.out.println("│\n├────────┼────────┼────────┼────────┼────────┼────────┼────────┼────────┤");
        for(int i = 0; i<8; i++){
            System.out.printf("│%-8s",lista[i]);
        }
        System.out.println("|\n└────────┴────────┴────────┴────────┴────────┴────────┴────────┴────────┘");
        System.out.println("Array Final\n┌────────┬────────┬────────┬────────┬────────┬────────┬────────┬────────┐");
        for(int i = 0; i<8; i++){
            System.out.printf("│   %d    ",i);
        }
        System.out.println("│\n├────────┼────────┼────────┼────────┼────────┼────────┼────────┼────────┤");
        for(String i : r){
            System.out.printf("|%-8s",i);
        }
        System.out.println("|\n└────────┴────────┴────────┴────────┴────────┴────────┴────────┴────────┘");
    }
}