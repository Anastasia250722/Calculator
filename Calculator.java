package calculator;

public class Calculator {

    private String calcName = "default calculator name";
    private double calcDistortion = 1.0;
    private  Printer calcPrinter;
    public Calculator(String calcName, double calcDistortion) {
        this.calcName = calcName;
        this.calcDistortion = calcDistortion;
        this.calcPrinter = new Printer ("default printer");
    }

    public double getCalcDistortion() {
        return calcDistortion;
    }

    public Calculator(double calcDistortion) {
        this.calcDistortion = calcDistortion;
    }

    public Calculator(String calcName) {
        this.calcName = calcName;
    }

    public Calculator() {
    }

    public String getCalcName() {
        return calcName;
    }

    public void setCalcName(String calcName) {
        this.calcName = calcName;
    }

        public double sum(int a, int b) {
        return (a + b) * calcDistortion;
    }

    public double multiply(int a, int b) {
        return (a * b) * calcDistortion;
    }

    public double minus(int a, int b) {
        return (a - b) * calcDistortion;
    }

    public double division(int a, int b) {
        if (b == 0) {
            return 0;
        }
        return ((double) a / b) * calcDistortion;

    }
   public void calcSum(int a, int b) {
        double sum = sum(a, b);
        calcPrinter.print(sum, calcName);
    }

    public void setCalcDistortion(double calcDistortion) {
        this.calcDistortion = calcDistortion;
    }
}

// О, дааааа