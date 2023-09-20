import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner teclado = new Scanner (System.in);
   
        String resp = teclado.nextLine();
        char a = resp.charAt(0);
        char b = resp.charAt(1);
        char c = resp.charAt(2);
        

        if (a == 'X' && b == 'X' && c == 'O'|| b == 'X' && c == 'X' && a == 'O') {
            
            System.out.println("Alice");
            
        }
        
        else if (a == 'O' && b == 'O' || b == 'O' && c == 'O' || a == b && a == c) {
            System.out.println("?");
        }
        
        else if (a == 'X' && b == 'O' && c == 'X') {
            System.out.println("*");
        }
        else{
            System.out.println("?");
        
        }
   
   
    
    }
}