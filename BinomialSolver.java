package main;

/**
 * Created by RENT on 2017-07-20.
 */
public class BinomialSolver {
    private double a;
    private double b;
    private double c;
    private double D;
    private double x1;
    private double x2;

    public BinomialSolver(double a,double b, double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getD() { return D;  }

    public double getX1() {
        return x1;
    }

    public double getX2() {
        return x2;
    }


    public void Count(){
        double delta=b*b-4*a*c;
        if(delta>0){
           x1=(-b-Math.sqrt(delta))/(2*a);
           x2=(-b+Math.sqrt(delta))/(2*a);
            System.out.println("Pierwiastki wielomianu to: x1=" +x1+" x2="+x2);
        } else if(delta<0){
            System.out.println("Wielomian nie ma pierwiastków będących liczbami rzeczywistymi");
        } else {
            x1=-b/(2*a);
            System.out.println("Pierwiastek wielomianu to: x=" +x1);
        }
    }

    public double calculate(double x){
        return a*x*x+b*x+c;
    }

}
