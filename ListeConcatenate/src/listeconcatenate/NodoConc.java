/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listeconcatenate;

/**
 *
 * @author matteo.ragazzo
 */
public class NodoConc<T> {
    Object info;
    NodoConc<T> next;
    
    public NodoConc(T info,NodoConc<T> next){
        this.info=info;
        this.next=next;
    }
    
    @Override
    public String toString(){
        return info.toString();
    }
}
