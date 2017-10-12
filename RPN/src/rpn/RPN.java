/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpn;

import java.util.ArrayList;

/**
 *
 * @author matteo.ragazzo
 */
public class RPN {
    private ArrayList<item> array=new ArrayList();
    
    public void append(int n){
        array.add(new item(n));
    }
            
    public void append(char c){
        array.add(new item(c));
    }
    
    public int value(){
        PilaConc<Integer> p=new PilaConc();
        for(int i=0;i<array.size();i++){
            if(array.get(i).isChar()){
                int risultato=0;
                int op2=p.pop();
                int op1=p.pop();
                switch(array.get(i).getOp()){
                    case '+': risultato=op1+op2;
                    break;
                    case '-': risultato=op1-op2;
                    break;
                    case '*': risultato=op1*op2;
                    break;
                    case '/': risultato=op1/op2;
                    break;
                }
                p.push(risultato);
            } else{
                p.push(array.get(i).getNum());
            }
        }
        return p.top();
    }
}
