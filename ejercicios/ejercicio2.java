/*Escribe un programa que muestre por consola los mayores números enteros que se pueden representar
mediante un char, short e int*/

public class ejercicio2 {
    public static void main (String [] args){

        int valorChar= Character.MAX_VALUE;
        int valorShort= Short.MAX_VALUE;
        int valorInt= Int.MAX_VALUE;
        
        System.out.println ("Valor máximo char: " + valorChar);
        System.out.println ("Valor máximo short: " + valorShort);
        System.out.println ("Valor máximo int: " + valorInt);
        
        
        }
}
