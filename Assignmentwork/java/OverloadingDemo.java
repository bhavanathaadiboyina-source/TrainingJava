class DiagnosticTool {

    void startEngine() {
        System.out.println("Starting engine with default settings.");
    }

    // One parameter
    void startEngine(String carType) {
        System.out.println("Starting " + carType + " car.");
    }

    // Two parameters
    void startEngine(String carType, boolean batteryCheck) {
        System.out.println("Starting " + carType +" car. Battery Check: " + batteryCheck);
    }
}

public class OverloadingDemo {
    public static void main(String[] args) {

        DiagnosticTool tool = new DiagnosticTool();

        tool.startEngine();
        tool.startEngine("Petrol");
        tool.startEngine("Electric", true);
    }
}