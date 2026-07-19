// Parent Class
class Printer {
    void print() {
        System.out.println("Printing document...");
    }
}

// Child Class 1
class InkjetPrinter extends Printer {
    void print() {
        System.out.println("Inkjet Printer: Printing with ink.");
    }

    void refillInk() {
        System.out.println("Refilling ink cartridge.");
    }
}

// Child Class 2
class LaserPrinter extends Printer {
    void print() {
        System.out.println("Laser Printer: Printing with toner.");
    }

    void replaceToner() {
        System.out.println("Replacing toner cartridge.");
    }
}

// Child Class 3
class ColorPrinter extends Printer {
    void print() {
        System.out.println("Color Printer: Printing colorful document.");
    }

    void colorCalibration() {
        System.out.println("Calibrating color settings.");
    }
}

// Main Class
public class PrinterSystem {
    public static void main(String[] args) {

        // Polymorphic Array
        Printer[] printers = {
            new InkjetPrinter(),
            new LaserPrinter(),
            new ColorPrinter()
        };

        for (Printer p : printers) {
            p.print();   // Runtime Polymorphism

            ((LaserPrinter) p).replaceToner();

            System.out.println();
        }
    }
} error