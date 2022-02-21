package Assignments.Assignment5.kushagra.main;

import Assignments.Assignment5.kushagra.singleton.DefaultStatic;

public class Main {


   // DefaultInitializationAssignment obj1 = new DefaultInitializationAssignment();
/* A static method belongs to a class rather than an instance thus to access methods of a class it is necessary
    to create a static method
 */
/*
obj1.printVar();
obj1.printLocalVar();
*/

    public static void main(String[] args) {

        DefaultStatic obj2 = new DefaultStatic();
        obj2.printString();
    }
}
