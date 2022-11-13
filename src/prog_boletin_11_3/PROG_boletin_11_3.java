package prog_boletin_11_3;

import java.util.Scanner;

public class PROG_boletin_11_3 {

    public static void main(String[] args) {
        float base;
        float altura;

        do {
            Scanner scaner = new Scanner(System.in);
            System.out.println("Teclea base:");
            base = scaner.nextFloat();
            System.out.println("Teclea altura");
            altura = scaner.nextFloat();
        } while (base < 0 || altura < 0);

        float area = base * altura;
        System.out.println("El área es= " + area);

    }

}
