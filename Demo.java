package calculator;

public class Demo {

    public static void main(String[] args) {
        Printer printer = new Printer("my printer");

        String calcName = "my calc";
        double calcDistortion = 0.5;

        Calculator defaultCalculator = new Calculator();
        Calculator customCalc = new Calculator(calcName, calcDistortion);

        double sumFromCustomCalc = customCalc.sum(5, 3);
        printer.print(sumFromCustomCalc);
        printer.print(sumFromCustomCalc, customCalc.getCalcName());

        double multiplyFromCustomCalc = customCalc.multiply(3, 5);
        printer.print(multiplyFromCustomCalc);
        printer.print(multiplyFromCustomCalc, customCalc.getCalcName());

        double minusFromCustomCalc = customCalc.minus(7, 2);
        printer.print(minusFromCustomCalc);
        printer.print(minusFromCustomCalc, customCalc.getCalcName());

        double divisionFromCustom = customCalc.division(15, 4);
        printer.print(divisionFromCustom);

        customCalc.setCalcDistortion(1.2);
    }


}

// У меня получилось!!
// Попробую еще
