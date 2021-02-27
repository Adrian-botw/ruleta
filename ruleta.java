/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ruleta; 
import java.util.Scanner;

public class ruleta {
    
    
    public static void main (String [] args){
        
        Scanner entrada= new Scanner(System.in);
        int numero, total , inicial=100;
        int numeror = (int)(Math.random()*10+1);
        int comparar= numeror;
        
        do {
        System.out.println("Menu de ruleta");
        System.out.println("Numeros pares son negros y los impares blancos");
        System.out.println("su saldo es: "+inicial);
        System.out.println("Ingrese un numero entre 1 y 10");
        numero= entrada.nextInt();
        System.out.println("El numero que sale en la ruleta es: "+numeror);
        if(numero==numeror){
        System.out.println("Ha acertado el numero");
        inicial=inicial+30;
        }
        else{
        System.out.println("No ha acertado el numero"); 
        inicial= inicial-10;
        }
        
        if(numero % 2==0||comparar % 2 ==1){
        System.out.println("A acertado en el color de la ruleta");
        inicial=inicial+20;
        }else{
        System.out.println("no ha acertado el color de la ruleta");
        inicial=inicial-10;
        }
        
        

        
        }while(inicial==0);
    
    }
}
