package ej3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EJ3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        divisionNumero cuenta = new divisionNumero();

        try {
            String A, B;

            A = leer.next();
            B = leer.next();

            int C = cuenta.dividirNumero(A, B);
        } catch (InputMismatchException e) {
            System.out.println("caso 1");
        } catch (NumberFormatException e) {
            System.out.println("caso 2");
        } catch (ArithmeticException e) {
            System.out.println("caso 3");
        } catch (Exception e) {
            System.out.println("messi");
        }

    }

}
