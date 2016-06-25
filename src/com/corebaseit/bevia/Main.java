package com.corebaseit.bevia;

public class Main {

    public static void main(String[] args) {

        /**
         Testing Polymorphism.
         We can override a method implementation in a child class (or subclass) thus resulting
         in "Polymorphism". Notice that it is the object type or variable instance, NOT the variable type,
         which determines the version of the method called:
         */

        //variableType variable = variableInstance or object();
        NumberPrinter numberPrinter = new OddPrimeNumber(); //NumberPrinter is polymorphic!
        //NumberPrinter numberPrinter = new EvenPrimeNumber();

        /**
        the following invocation calls the printSomeNumber() method, but
        The particular version of the method called is determined at run time!
         */

        numberPrinter.printSomeNumber();

    }

    //child class
    private static class EvenPrimeNumber extends NumberPrinter{
        public void printSomeNumber(){
            super.printSomeNumber(); //calling the method printSomeNumber from the parent (super) class!
            System.out.println("2468");
        }
    }

    //child class (Subclass)
    private static class OddPrimeNumber extends NumberPrinter{
        public void printSomeNumber(){
            //calling the method printSomeNumber from the parent (super) class!
            //super.printSomeNumber();
            System.out.println("1357");
        }
    }

    //parent class (Superclass)
    private static class NumberPrinter {
        public void printSomeNumber(){
            System.out.println("2093478789045");
        }
    }

    /**
     Output:
     1357
     */
}
