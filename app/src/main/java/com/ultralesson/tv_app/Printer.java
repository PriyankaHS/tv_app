package com.ultralesson.tv_app;

//To create a class method, declare the method as static.
// The static method can then be called through Class directly.
public class Printer
{
    public void print()
    {
        System.out.println("Printing is done!");
    }

    public void scan()
    {
        System.out.println("Scanning is done!");
    }

    public static void on()
    {
        System.out.println("Printer is switched on!");
    }

    public static void off()
    {
        System.out.println("Printer is switched off!");
    }

    public final void changeCartridge()
    {
        System.out.println("Changed cartridge");
    }

    public static void main(String[] args)
    {
        // Static method call
        Printer.on();

        // Instance method call
        Printer p = new Printer();
        p.print();
        p.scan();
        p.changeCartridge();

        // Static method call
        Printer.off();
    }

}
