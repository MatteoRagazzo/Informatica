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
public class PilaConc<T> {

    /*int pushcall=0;
    NodoConc<T> last;
    NodoConc<T> first;
    
    public void push(T elem){
        if(pushcall==0){
            NodoConc<T> y=new NodoConc<T>(elem,null);
            last=y;
            first=y;
            pushcall++;
        }
        else{
            NodoConc<T> y=new NodoConc<T>(elem,null);
            last.next=y;
            last=y;
            if(pushcall==1) first.next=last;
            pushcall++;
        }
    }
    
    public T top(){
        return (T)last.info;
    }
    
    public T pop(){
        T elem=(T)last.info;
        NodoConc<T> z=first;
        for(int i=1;i<pushcall-1;i++){
            z=z.next;
        }
        last=z;
        pushcall--;
        return elem;
    }
    
    public boolean isEmpty(){
        if(pushcall==0) return true;
        else return false;
    }
    
    public String all(){
        String s="";
        NodoConc<T> x=first;
        for(int i=0;i<pushcall;i++){
            s+=x.info+" ";       
            x=x.next;
        }
        return s;
    }*/
	
	int pushcall=0;
    NodoConc<T> testa;
	
	 public void push(T elem){
		NodoConc<T> y=new NodoConc<T>(elem,null);
		if(pushcall==0){
			testa=y;
			pushcall++;
		}
		else{
			y.next=testa;
			testa=y;
			pushcall++;
		}
	 }
	 
	 public T top(){
		 return (T)testa.info;
	 }
	 
	 public T pop(){
			if(pushcall>0){
				T elem=top();
				testa=testa.next;
				pushcall--;
				return elem;
			}
			else{
				return null;
			}
	 }
	 
	 public boolean isEmpty(){
		 return pushcall==0;
	 }
}
