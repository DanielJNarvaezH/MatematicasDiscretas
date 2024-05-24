package co.edu.uniquindio.poo;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        PruebaMetodosDiscretas a = new PruebaMetodosDiscretas();

        System.out.println(a.permutaciones(3,3));

        System.out.println(a.variaciones(10,4));
        
        System.out.println(a.combinaciones(5, 3));
    }
}
