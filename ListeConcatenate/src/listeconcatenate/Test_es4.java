/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listeconcatenate;

import java.util.Scanner;

/**
 *
 * @author matteo.ragazzo
 */
public class Test_es4 {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
            System.out.println("Le frasi devono essere almeno 3, il while finisce quando riceve la paroal \"end\".");
            Scanner input=new Scanner(System.in);
            String string="";
            ListaConcatenata<String> lista=new ListaConcatenata();
            while(!string.equals("end")){
                System.out.print("Inserire la frase: ");
                string=input.next();
                if(!string.equals("end"))lista.addTail(string);
            }
            
            //toString
            System.out.println(lista.toString());
            
            //size
            System.out.println(lista.size());
            
            //addHead
            lista.addHead("nuova_testa");
            System.out.println(lista.toString());
            
            //addTail
            lista.addTail("nuova_coda");
            System.out.println(lista.toString());
            
            //removeHead
            lista.removeHead();
            System.out.println(lista.toString());
            
            //removeTail
            lista.removeTail();
            System.out.println(lista.toString());
            
            //get
            System.out.println(lista.get(3));
            
            //set
            lista.set(3,"modificato");
            System.out.println(lista.toString());
            
            //add
            lista.add(2,"aggiunto");
            System.out.println(lista.toString());
            
            //remove
            lista.remove(1);
            System.out.println(lista.toString());
	}
	
}
