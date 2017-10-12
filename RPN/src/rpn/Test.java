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
public class Test {

    public static void main(String[] args) {

        //(10+45)*(20-17) = 165
        RPN rpn = new RPN();
        rpn.append(10);
        rpn.append(45);
        rpn.append('+');
        rpn.append(20);
        rpn.append(17);
        rpn.append('-');
        rpn.append('*');
        System.out.println(rpn.value());
        
        //(6/2)*((1+3)-2) = 6
        RPN rpn1 = new RPN();
        rpn1.append(6);
        rpn1.append(2);
        rpn1.append('/');
        rpn1.append(1);
        rpn1.append(3);
        rpn1.append('+');
        rpn1.append(2);
        rpn1.append('-');
        rpn1.append('*');
        System.out.println(rpn1.value());
    }
}
