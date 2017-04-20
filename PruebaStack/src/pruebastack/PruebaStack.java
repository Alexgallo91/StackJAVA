package pruebastack;

import java.util.EmptyStackException;
import java.util.Stack;

public class PruebaStack {

    public PruebaStack() {
        Stack<Number> pila = new Stack<Number>();

        Long numeroLong = 121L;
        Integer numeroInt = 34567;
        Float numeroFloat = 1.0f;
        Double numeroDouble = 1234.5678;

        pila.push(numeroLong);
        imprimirPila(pila);
        pila.push(numeroInt);
        imprimirPila(pila);
        pila.push(numeroFloat);
        imprimirPila(pila);
        pila.push(numeroDouble);
        imprimirPila(pila);

        try {
            Number objetoElminado = null;

            while (true) {
                objetoElminado = pila.pop();
                System.out.printf("%s se saco\n", objetoElminado);
                imprimirPila(pila);
            }
        } catch (EmptyStackException r) {
            r.printStackTrace();
        }
    }

    private void imprimirPila(Stack<Number> pila) {
        if (pila.isEmpty()) {
            System.out.print("la pila esta vacia\n\n");
        } else {
            System.out.print("la pila contiene: ");
            for (Number n : pila) {
                System.out.printf("%s ", n);
            }

            System.out.print("(superior)\n\n");
        }
    }

    public static void main(String[] args) {
        new PruebaStack();
    }

}
