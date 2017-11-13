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
public class Concatenazione {
    public static void main(String[] args) {
       PilaConc<Integer> pila=new PilaConc<Integer>();
       System.out.println(pila.isEmpty());
       pila.push(1);
       pila.push(2);
       pila.push(3);
       pila.push(4);
       pila.push(5);
       pila.push(6);
       System.out.println(pila.isEmpty());
       System.out.println(pila.pop());
       System.out.println(pila.pop());
       System.out.println(pila.pop());
       System.out.println(pila.pop());
       System.out.println(pila.pop());
	   System.out.println(pila.pop());
       System.out.println(pila.isEmpty());
       
        
       /*System.out.println("--------------------------");
        
       CodaConc<Integer> coda=new CodaConc<Integer>();
       System.out.println(coda.isEmpty());
       coda.enqueue(1);
       coda.enqueue(2);
       coda.enqueue(3);
       coda.enqueue(4);
       System.out.println(coda.isEmpty());
       System.out.println(coda.dequeue());
       System.out.println(coda.dequeue());
       System.out.println(coda.dequeue());
       System.out.println(coda.dequeue());
       System.out.println(coda.isEmpty());*/
    }
}
