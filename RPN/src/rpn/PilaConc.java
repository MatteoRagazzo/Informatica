/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpn;

/**
 *
 * @author matteo.ragazzo
 */
public class PilaConc<T> {

    int pushcall = 0;
    NodoConc<T> testa;

    public void push(T elem) {
        NodoConc<T> y = new NodoConc<T>(elem, null);
        if (pushcall == 0) {
            testa = y;
            pushcall++;
        } else {
            y.next = testa;
            testa = y;
            pushcall++;
        }
    }

    public T top() {
        return (T) testa.info;
    }

    public T pop() {
        if (pushcall > 0) {
            T elem = top();
            testa = testa.next;
            pushcall--;
            return elem;
        } else {
            return null;
        }
    }

    public boolean isEmpty() {
        return pushcall == 0;
    }
}
