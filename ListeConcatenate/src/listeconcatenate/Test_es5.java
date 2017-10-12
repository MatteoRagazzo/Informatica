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
public class Test_es5 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        ListaConcatenata<String> lista=new ListaConcatenata();
        System.out.print("Inserire il testo: ");
        String testo=input.nextLine();
        int i=0;
        for(int j=0;j<testo.length();j++){
            if(testo.charAt(j)==' ' || testo.charAt(j)==',' || testo.charAt(j)=='.' || testo.charAt(j)==';'){
                lista.addTail(testo.substring(i,j));
                i=j+1;
            } 
            if(j==testo.length()-1)
                lista.addTail(testo.substring(i,j+1));
        }
        System.out.println(lista.toString());
    }
}
