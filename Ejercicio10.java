import javax.imageio.ImageIO;

public class Ejercicio10{
    public static void main(String[] args) {
        System.out.println("Este programa ordena los pares y los impares");
        int[] general = new int[20];
        int[] par = new int[20];
        int[] impar = new int[20];
        int contpar = 0;
        int contimp = 0;
        int cont = 0;
        for(int i = 0; i<20; i++){
            general[i] = (int)(Math.random()*101);
            System.out.print(general[i]+" ");
        }
        System.out.println("");
        for(int i = 0; i<20; i++){
            if(general[i]%2 == 0){
                par[contpar] = general[i];
                contpar++;
            }else{
                impar[contimp] = general[i];
                contimp++;
            }
        }
        for(int i = 0; i<20; i++){
            general[i] = par[i];
        }
        System.out.println("Ordenado");
        for(int i = contpar+1; i<20; i++){
            general[i] = impar[cont];
            cont++;
        }
        for(int i = 0; i<20; i++){
            System.out.print(general[i]+" ");
        }
    }
}