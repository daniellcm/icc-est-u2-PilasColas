import Ejercicio_01_sign.ValidadorSignos;
import Ejercicio_02_sorting.OrdenadoPila;
import Ejercicio_02_sorting.Stack;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("EJERCICIO 1:");
        System.out.println("-------------------------");
        System.out.println("Ejemplo 1:");
        System.out.println("´([]){}´");
        System.out.println(ValidadorSignos.valido("([]){}"));
        System.out.println(" ");
        System.out.println("Ejemplo 2:");
        System.out.println("´({)}´");
        System.out.println(ValidadorSignos.valido("({)}"));
        System.out.println("");

        System.out.println("EJERCICIO 2:");
        System.out.println("-------------------------");
        Stack pila = new Stack();
        pila.push(5);
        pila.push(1);
        pila.push(4);
        pila.push(2);
        System.out.println("Pila sin ordenar: ");
        System.out.println("5 1 4 2");

        System.out.println("Pila ordenada: ");
        Stack ordenada = OrdenadoPila.ordenar(pila);
        while (!ordenada.isEmpty()) {
            System.out.print(ordenada.pop() + " ");
        }  
    }
}
