public class Evaluacion{
    public static void main(String[] args) {
        System.out.println("\n===CONSIGNA 1 y 2===");
        int num1 = 12;
        int num2 = 15;
        double num3 = 2.5;
        float num4 = 3.0f;
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);

        System.out.println("\n===CALCULOS MATEMATICOS===");
        double num6 = num3 * num1;  // 30.0
        System.out.println("Multiplicación entre num1 y num3: " + num6);

        int num5 = num1 + num2; //27
        System.out.println("Sumatoria num1 + num2: " + num5);


        System.out.println("\n== PUNTO 3 ===");
        if (num1 < num2) {
            System.out.println("Condición VERDADERA");
            System.out.println("num5 = " + num5);
            System.out.println("num6 = " + num6);
        } else {
            throw new RuntimeException("num1 es MENOR que num2 ");
        }
        System.out.println("\nValor a modificar PUNTO B: " + num2);
        
        if (num2 > 10){  //
            num2 *= 2;
            System.out.println("Valor final con condición verdadera: " + num2);
        }

        System.out.println("\n== ITERACIÓN ==");
        for (int i = 0; i < (num2/3); i++){
            System.out.println("i = " + i);
        }
    }
}
