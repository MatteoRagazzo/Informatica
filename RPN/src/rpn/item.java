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
public class item {
    private char operatore;
    private int numero;
    boolean isChar=false;
    
    public item(char c){
        operatore=c;
        isChar=true;
    }
    
    public item(int n){
        numero=n;
    }
    
    public boolean isChar(){
        return isChar;
    }
        
    public char getOp(){
        return operatore;
    }
    
    public int getNum(){
        return numero
    }
}
