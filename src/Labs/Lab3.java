/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Labs;

import common.Dog;
import common.Employee;
import java.util.*;

/**
 *
 * @author Mitch
 */
public class Lab3 {

    public static void main(String[] args) {
        List e = new ArrayList();
        Employee employee1 = new Employee("Doe", "John", "111-11-1111");
        Employee employee2 = new Employee("Doe", "Mary", "111-11-1111");
        Employee employee3 = new Employee("Doe", "Jim", "333-33-3333");
        Dog d1 = new Dog("Chuck", 1111);

        e.add(employee1);
        e.add(employee2);
        e.add(employee3);
        e.add(d1);

        for (Object e1 : e) {

            System.out.println(e1);
        }

    }
}
