package Ejercicio_01_sign;

public class ValidadorSignos {
    public static boolean valido(String cadena) {
        Stack pila = new Stack();

        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                pila.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                if (pila.isEmpty()) return false;
                char tope = (char) pila.pop();
                if (!par(tope, c)) return false;
            }
        }
        return pila.isEmpty();
    }

    private static boolean par(char abre, char cierra) {
        switch (abre) {
            case '(': 
                return cierra == ')';
            case '{': 
                return cierra == '}';
            case '[': 
                return cierra == ']';
            default: 
                return false;
        }
    }
}


