/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listeconcatenate;

import java.util.ArrayList;

/**
 *
 * @author matteo.ragazzo
 */
public class ListaConcatenata<T> {

    private NodoConc<T> ultimo;
    private NodoConc<T> testa;
    private int elementi = 0;

    public ListaConcatenata() {
        ultimo = null;
        testa = null;
    }

    public ListaConcatenata(T[] array) {
        for (int i = 0; i < array.length; i++) {
            addTail(array[i]);
        }
    }

    @Override
    public String toString() {
        String out = "";
        NodoConc<T> z = testa;
        for (int i = 0; i < elementi; i++) {
            out = out + z.toString() + " ";
            z = z.next;
        }
        return out;
    }

    public int size() {
        return elementi;
    }

    public void addHead(T elem) {
        NodoConc<T> y = new NodoConc<T>(elem, testa);
        testa = y;
        elementi++;
    }

    public void addTail(T elem) {
        if (elementi == 0) {
            addHead(elem);
            ultimo = testa;
        } else {
            NodoConc<T> y = new NodoConc<T>(elem, null);
            if (elementi == 1) {
                testa.next = y;
            }
            ultimo.next = y;
            ultimo = y;
            elementi++;
        }
    }

    public void removeHead() {
        if (testa != null) {
            testa = testa.next;
            elementi--;
        }
    }

    public void removeTail() {
        if (elementi > 0) {
            NodoConc<T> z = testa;
            for (int i = 1; i < elementi - 1; i++) {
                z = z.next;
            }
            ultimo = z;
            ultimo.next = null;
            elementi--;
        }
    }

    public T get(int n) {
        if (elementi > 0) {
            NodoConc<T> z = testa;
            for (int i = 1; i < n; i++) {
                z = z.next;
            }
            return (T) z.info;
        } else {
            return null;
        }
    }

    public void set(int n, T x) {
        if (elementi > 0) {
            NodoConc<T> z = testa;
            for (int i = 1; i < n; i++) {
                z = z.next;
            }
            z.info = x;
        }
    }

    public void add(int n, T x) {
        NodoConc<T> y = new NodoConc(x, null);
        if (elementi > 0) {
            NodoConc<T> z = testa;
            for (int i = 1; i < n; i++) {
                z = z.next;
            }
            y.next = z.next;
            z.next = y;
            elementi++;
        }
    }

    public void remove(int n) {
        if (elementi > 0) {
            NodoConc<T> z = testa;
            NodoConc<T> y = new NodoConc<T>(null, null);
            for (int i = 1; i < n; i++) {
                z = z.next;
            }
            y = z.next;
            z.next = y.next;
            elementi--;
        }
    }
}
