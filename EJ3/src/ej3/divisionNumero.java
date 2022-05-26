package ej3;

public class divisionNumero {

    public divisionNumero() {
    }
    
    public int dividirNumero(String A, String B){
        int C = 0;
        
        int a = Integer.parseInt(A);
        int b = Integer.parseInt(B);
        
        C = a/b;
        
        return C;   
    }
}
