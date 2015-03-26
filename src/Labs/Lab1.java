/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Labs;

import java.util.*;

/**
 *
 * @author Mitch
 */
public class Lab1 {
    public static void main(String[] args) {
        List list1 = new ArrayList();
        
        list1.add("Sausages");
        list1.add("Sausages");
        list1.add("More Sausages");
        
        for(Object a: list1){
            System.out.println((String)a );
        }
    }
}
