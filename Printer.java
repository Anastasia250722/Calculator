package calculator;

public class Printer {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public Printer(String name) {
        this.name = name;
    }

       public void print(double num) {
        System.out.println("Output from printer with name " + name);
        System.out.println("result:" + num);
    }

    public void print(double num, String calculatorName) {
        System.out.println("Output from printer with name" + name);
        System.out.println("result of " + calculatorName + " is " + num + "\n");

    }
}

