/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concatenazione;

/**
 *
 * @author Matteo
 */
public class CodaConc<T> {
    NodoConc<T> testa;
    NodoConc<T> last;
    int pushcall=0;
    
    public void enqueue(T elem){
        if(pushcall==0){
            testa=new NodoConc<T>(elem,null);
            last=testa;
            pushcall++;
        }
        else{
            NodoConc<T> y=new NodoConc<T>(elem,null);
            if(pushcall==1) testa.next=y;
            last.next=y;
            last=y;
            pushcall++;
        }
    }
    
    public T front(){
        return (T)testa.info;
    }
    
    public T dequeue(){
        if(pushcall>=0){
            T elem=(T)testa.info;
            testa=testa.next;
            pushcall--;
            return elem;
        }
        else return (T)null;
    }
    
    public boolean isEmpty(){
        if(pushcall==0) return true;
        else return false;
    }
}
