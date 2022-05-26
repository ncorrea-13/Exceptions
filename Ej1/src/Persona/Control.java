package Persona;

import java.util.Scanner;

public class Control {

    Scanner leer = new Scanner(System.in);
    Persona M;
    private int A, B;
    private boolean Ñ;

    public void setA(int A) {
        this.A = A;
    }

    public void setB(int B) {
        this.B = B;
    }

    public void setÑ(boolean Ñ) {
        this.Ñ = Ñ;
    }

    public void setM(Persona M) {
        this.M = M;
    }

    public int getA() {
        return A;
    }

    public int getB() {
        return B;
    }

    public boolean isÑ() {
        return Ñ;
    }

    public Persona getM() {
        return M;
    }

    public Control() {
        this.M = new Persona();
    }

    public Persona crearPersona() {
        System.out.println("Ingrese una nueva persona");

        M = cPersona();
        A += calcularIMC();
        Ñ = esMayorDeEdad();
        if (Ñ = true) {
            B++;
        } else {
            B--;
        }

        return M;

    }

    public Persona cPersona() {
        int N;
        
        System.out.println("Dicte los atributos que posee el individuo");
        
        System.out.print("Nombre = ");
        M.setNombre(leer.next());

        System.out.print("Edad = ");
        M.setEdad(leer.nextInt());

        do {
            
            System.out.print("Sexo = ");
            M.setSexo(leer.next());

            switch (M.getSexo()) {
                
                case "H":
                    N = 1;
                    break;
                    
                case "M":
                    N = 1;
                    break;
                    
                case "O":
                    N = 1;
                    break;
                    
                default:
                    System.out.println("Dicte su sexo correctamente");
                    N = 0;

            }

        } while (N == 0);

        System.out.print("Altura = ");
        M.setAltura(leer.nextDouble());

        System.out.print("Peso = ");
        M.setPeso(leer.nextInt());
        return M;
    }

    public int calcularIMC() {
        int A;
        
        if (20 > M.getPeso() / (M.getAltura() * M.getAltura())) {
            
            A = 1;
            System.out.println("Esta por debajo de su peso ideal");
            
        } else if (25 < M.getPeso() / (M.getAltura() * M.getAltura())) {
            
            A = -1;
            System.out.println("Posee sobrepeso");
            
        } else {
            
            A = 0;
            System.out.println("Se encuentra en su peso ideal");
            
        }
        return A;
    }

    public boolean esMayorDeEdad() {
        boolean Depende;

        Depende = M.getEdad() > 60;

        return Depende;
    }
}
