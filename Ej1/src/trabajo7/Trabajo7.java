package trabajo7;

import Persona.Control;
import Persona.Persona;

public class Trabajo7 {

    public static void main(String[] args) {
        int A, B;

        Persona M1, M2, M3, M4, Prueba;
        Control Z = new Control();
        
        System.out.println("Bienvenido a nuestro sistema");
        
        Prueba = null;
        try {
            boolean M = Prueba.esMayorDeEdad();
        }catch(Exception e){
            System.out.println("No posee ningún elemento");
        }
//        
//
//        M1 = Z.cPersona();
//        M2 = Z.cPersona();
//        M3 = Z.cPersona();
//        M4 = Z.cPersona();
//
//        A = Z.getA();
//        B = Z.getB();
//
//        Calculos(A, B);
    }

//    public static void Calculos(int A, int B) {
//        System.out.println(A);
//        System.out.println(B);
//    }

}
