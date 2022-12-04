public class Ejercicio34{
    public static void main(String[] args) {
        System.out.println("Este programa calcula la estatura media y máxima");
        String[] p = {"España", "Rusia", "Japón", "Australia"};
        int[][] esta = new int[4][10];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 10; j++) {
                esta[i][j] = (int) (Math.random() * (210 - 140 + 1)) + 140;
            }
        }
        System.out.printf("%64s\n", "MED MIN MAX");
        for (int i = 0; i < 4; i++) {
            int max = 140;
            int min = 210;
            int t = 0;
            System.out.printf("%9s:", p[i]);
            for (int estatura : esta[i]) {
                System.out.printf("%4d", estatura);
                max = estatura > max ? estatura : max;
                min = estatura < min ? estatura : min;
                t += estatura;
            }
            System.out.printf(" |%4d%4d%4d\n", t / 10, min, max);
        }
    }
}