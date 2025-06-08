package Ejercicio_02_sorting;

public class OrdenadoPila {
    public static Stack ordenar(Stack original) {
        Stack temporal = new Stack();

        while (!original.isEmpty()) {
            int actual = (int) original.pop();
            while (!temporal.isEmpty() && (int) temporal.peek() > actual) {
                original.push(temporal.pop());
            }
            temporal.push(actual);
        }

        Stack resultado = new Stack();
        while (!temporal.isEmpty()) {
            resultado.push(temporal.pop());
        }
        return resultado;
    }
}
