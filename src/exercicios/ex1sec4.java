package exercicios;

import java.util.Locale;

public class ex1sec4 {
    public static void main(String[] args) {
        //Mika Snowden, 16/6/2025, 14:55 >> Exercício referente a aula 24 da seção 4.
        String product1 = "Computer";
        String product2 = "Office desk";
        int age = 30;
        int code = 5290;
        char gender = 'F';
        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        System.out.printf("Products:%n%s, which price is $%.2f%n%s, which price is %.2f,%nRecord: %d, code %d and gender: %s. %nMeasure with eight decimal places: %.8f%nRounded (three decimal places): %.3f%n ", product1, price1, product2, price2, age, code, gender, measure, measure);
        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point: %.3f", measure);
    }
}
