package ej2;

public class Ej2 {

    public static void main(String[] args) {
        int[] a = new int [2];
        
        try{
            a[3] = 4;
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("El error es correcto");
        }catch (Exception e){
            System.out.println("No lo hiciste bien xd");
        }
        
    }

}
