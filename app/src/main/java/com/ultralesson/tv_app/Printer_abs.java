package com.ultralesson.tv_app;

//abstract class Printer_abs
//{
//    abstract void print();
//
//    public void greet()
//    {
//        System.out.println("Hi!!! What should I need to print for today?");
//    }
//}
//
//class BW extends Printer_abs {
//    // provide an implementation of the abstract method
//    public void print() {
//        System.out.println("Documents are printed in Black and White!");
//    }
//
//}
//    class ColorPrinter extends Printer_abs
//    {
//        // provide an implementation of the abstract method
//        public void print()
//        {
//            System.out.println("Documents are printed in Color!");
//        }
//    }
//
//    class AbstractDemo
//    {
//        public static void main(String[] args)
//        {
//            BW bwp = new BW();
//            bwp.greet();
//            bwp.print();
//
//            ColorPrinter cp = new ColorPrinter();
//            cp.greet();
//            cp.print();
//        }
//    }

    interface Printer_Abs
    {
        public void greet();
        public void print();
    }

    class BWP implements Printer_Abs
    {
        public void greet()
        {
            System.out.println("Hey there! I can print your documents");
            System.out.println("You save some money by choosing black and white option");
        }

        public void print()
        {
            System.out.println("Documents are scanned for printing!");
            System.out.println("Scanning completed!");
            System.out.println("Printing them in Black and White!");
        }
    }

    class Main
    {
        public static void main(String[] args)
        {
            BWP pr = new BWP();
            pr.greet();
            pr.print();
        }
    }
