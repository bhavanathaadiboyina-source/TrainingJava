// Parent Class
class Printer {
    void print() {
        System.out.println("Printing document");
    }
}

// Child Class 1
class InkjetPrinter extends Printer {
    void print() {
        System.out.println("Inkjet Printer");
    }

    void refillInk() {
        System.out.println("Refilling ink ");
    }
}

// Child Class 2
class LaserPrinter extends Printer {
    void print() {
        System.out.println("Laser Printer");y
    }

    void replaceToner() {
        System.out.println("Replacing toner ");
    }
}

// Child Class 3
class ColorPrinter extends Printer {
    void print() {
        System.out.println("Color Printer");
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

            // Using instanceof
            if (p instanceof InkjetPrinter) {
                ((InkjetPrinter) p).refillInk();
            } else if (p instanceof LaserPrinter) {
                ((LaserPrinter) p).replaceToner();
            } else if (p instanceof ColorPrinter) {
                ((ColorPrinter) p).colorCalibration();
            }

            System.out.println();
        }
    }
}