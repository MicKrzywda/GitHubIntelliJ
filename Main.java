package main;
import java.util.Scanner;
import main.BinomialSolver;


/**
 * Created by RENT on 2017-07-20.
 */
public class Main {
    public static void main(String[] args) {

        System.out.println("Podaj wartości współczynników a,b,c wielomianu drugiego stopnia");
        Scanner sc = new Scanner(System.in);
        double pierwszyWspolczynnik=sc.nextDouble();
        double drugiWspolczynnik=sc.nextDouble();
        double trzeciWspolczynnik=sc.nextDouble();
        BinomialSolver wielomian = new BinomialSolver(pierwszyWspolczynnik, drugiWspolczynnik, trzeciWspolczynnik);
        wielomian.Count();

        double x1=wielomian.getX1();
        double x2=wielomian.getX2();

        System.out.println("podaj wartość x");
        double x=sc.nextDouble();

        System.out.println(wielomian.calculate(x));

    }

}