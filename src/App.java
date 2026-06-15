public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("\nEjercicio1");
        int n = 5; 
        System.out.println("Suma consecutiva del " + n + ": ");
        int resultado = runEjercicio1(n);
        System.out.println("La respuesta es: " + resultado);

        System.out.println("\nEjercicio2");
        long base = 2;
        long exponente = 40;
        long resultado2 = runEjercicio2(base, exponente);
        System.out.println("Cuando la base es " + base + " y el exponente es " + exponente + ": ");
        System.out.println("La respuesta es: " + resultado2);
    }


    /*
    Potencia de un numero: Escriva una funcion recursiva que calcule la potencia de un numero base 
    elevado a un exponente entero.
    - Por ejemplo: si la base es 2 y el exponente es 3, la funcion debe devolver 2^3 = 8
    */
    private static long runEjercicio2(long  base, long exponente ){
        // Caso base
        if(exponente == 1){
            return base; 
        }
        //caso recursivo
        return base * runEjercicio2(base, exponente-1);
    }


    /*
    Escrive una funcion recursiva que calcule la suma de todos los numeros enteros
    concecutivos desde 1 hasta un numero dado n. Por ejemplo si n = 5.
    - la funcion debe devolver 1+2+3+4+5 = 15
    */
    private static int runEjercicio1(int  n ){ // 
        // CASE BASE n = 1:
        if (n == 1){
            return 1; 
        }
        // caso recursivo 
        // return n + runEjercicio1(n-1);

        int res = n + runEjercicio1(n - 1);
        return res;
    }

}
