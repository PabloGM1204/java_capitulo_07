public class Ejercicio31{
    public static void main(String[] args) {
        System.out.println("Este programa juega al tres en raya");
        String JUGADOR = "•";
        String ORDENADOR = "X";
        String[][] tab = new String[3][3];
        int i;
        int j;
        int mov = 0;
        boolean jGana = false;
        boolean oGana = false;
        String nombreFila = "cba";
        String cords;
        for(i = 0; i < 3; i++) {
            for(j = 0; j < 3; j++) {
                tab[i][j] = " ";
            }
        }
        do {
            System.out.println("  ░░░░░░░░░░░░░░░");
            for(i = 0; i < 3; i++) {
                System.out.print(nombreFila.charAt(i)+ " ░");
                for(j = 0; j < 3; j++) {
                    System.out.print("░ " + tab[i][j] + " ");
                }
                System.out.println("░░");
                System.out.println("  ░░░░░░░░░░░░░░░");
            }
            System.out.println("     1   2   3\n");
            System.out.print("Introduzca las cords, por ejemplo b2: ");
            cords = System.console().readLine();
            int fila = nombreFila.indexOf(cords.charAt(0));
            int colum = cords.charAt(1) - 1 - 48;
            tab[fila][colum] = JUGADOR;
            mov++;
            jGana = (
                (tab[0][0] == JUGADOR) && (tab[0][1] == JUGADOR) && (tab[0][2] == JUGADOR) ||
                (tab[1][0] == JUGADOR) && (tab[1][1] == JUGADOR) && (tab[1][2] == JUGADOR) ||
                (tab[2][0] == JUGADOR) && (tab[2][1] == JUGADOR) && (tab[2][2] == JUGADOR) ||
                (tab[0][0] == JUGADOR) && (tab[1][0] == JUGADOR) && (tab[2][0] == JUGADOR) ||
                (tab[0][1] == JUGADOR) && (tab[1][1] == JUGADOR) && (tab[2][1] == JUGADOR) ||
                (tab[0][2] == JUGADOR) && (tab[1][2] == JUGADOR) && (tab[2][2] == JUGADOR) ||
                (tab[0][0] == JUGADOR) && (tab[1][1] == JUGADOR) && (tab[2][2] == JUGADOR) ||
                (tab[0][2] == JUGADOR) && (tab[1][1] == JUGADOR) && (tab[2][0] == JUGADOR)
            );
            if (!jGana && (mov < 9)) {
                do {
                    fila = (int)(Math.random() * 3);
                    colum = (int)(Math.random() * 3);
                } while (!tab[fila][colum].equals(" "));
                tab[fila][colum] = ORDENADOR;
                mov++;
                oGana = (
                    (tab[0][0] == ORDENADOR) && (tab[0][1] == ORDENADOR) && (tab[0][2] == ORDENADOR) ||
                    (tab[1][0] == ORDENADOR) && (tab[1][1] == ORDENADOR) && (tab[1][2] == ORDENADOR) ||
                    (tab[2][0] == ORDENADOR) && (tab[2][1] == ORDENADOR) && (tab[2][2] == ORDENADOR) ||
                    (tab[0][0] == ORDENADOR) && (tab[1][0] == ORDENADOR) && (tab[2][0] == ORDENADOR) ||
                    (tab[0][1] == ORDENADOR) && (tab[1][1] == ORDENADOR) && (tab[2][1] == ORDENADOR) ||
                    (tab[0][2] == ORDENADOR) && (tab[1][2] == ORDENADOR) && (tab[2][2] == ORDENADOR) ||
                    (tab[0][0] == ORDENADOR) && (tab[1][1] == ORDENADOR) && (tab[2][2] == ORDENADOR) ||
                    (tab[0][2] == ORDENADOR) && (tab[1][1] == ORDENADOR) && (tab[2][0] == ORDENADOR)
                );
            }
        } while (!jGana && !oGana && (mov < 9));
        System.out.println("  ░░░░░░░░░░░░░░░");
        for(i = 0; i < 3; i++) {
            System.out.print(nombreFila.charAt(i)+ " ░");
            for(j = 0; j < 3; j++) {
                System.out.print("░ " + tab[i][j] + " ");
            }
            System.out.println("░░");
            System.out.println("  ░░░░░░░░░░░░░░░");
        }
        System.out.println("     1   2   3\n");
        if (jGana) {
            System.out.println("¡Enhorabuena! ¡Has ganado!");
        } else if (oGana) {
            System.out.println("Gana el ordenador.");
        } else {
            System.out.println("Empate. No gana nadie.");
        }
    }
}