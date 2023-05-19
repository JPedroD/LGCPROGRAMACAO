/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vaula05;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author laboratorio
 */
public class Vaula05 {

    /**
     * @param args the command line arguments
     */
    public static void main( String[ ] args ) {  
    
        int idade, peso, magro =0, normal = 0, acima = 0, obeso = 0, mobeso = 0;  
        float altura;
        boolean continuar = true ;  
        String decisao,nome ;  
  
        while ( continuar == true ) {  
            Scanner leia = new Scanner( System.in ) ; 
            
            System.out.println( "Digite o seu nome " ) ;  
            nome = leia.nextLine( ) ;  
            
            System.out.println( "Digite o sua idade " ) ;  
            idade = leia.nextInt( ) ;  
            
            System.out.println( "Digite o seu peso " ) ;  
            peso = leia.nextInt( ) ;  
  
            System.out.println( "Digite qual sua altura: " ) ;  
            altura = leia.nextFloat( ) ;  
            
            float IMC = peso / (altura * altura);
            
            if (IMC < 20){ 
                System.out.println(   
                        "Magro. " ) ;  
                magro++ ;
            }  
            decisao = JOptionPane.showInputDialog( "Deseja fazer outro calculo ? Digite S ou N: " ) ;
            
            if ( IMC <24 && IMC >= 20) {  
                System.out.println("Normal");
                normal++;
            }
            decisao = JOptionPane.showInputDialog( "Deseja fazer outro calculo ? Digite S ou N: " ) ;
            
            if ( IMC >=24 && IMC < 29) {  
                System.out.println("Acima do peso");
                acima++;
            }  
            decisao = JOptionPane.showInputDialog( "Deseja fazer outro calculo ? Digite S ou N: " ) ;
            
            if ( IMC >=29 && IMC < 34) {  
                System.out.println("Acima do peso");
                obeso++;
            } 
            decisao = JOptionPane.showInputDialog( "Deseja fazer outro calculo ? Digite S ou N: " ) ;
            
            if(IMC >=34){
                System.out.println("Muito Obeso");
                mobeso++;
            }
  
            decisao = JOptionPane.showInputDialog( "Deseja fazer outro calculo ? Digite S ou N: " ) ;             
              
            if( decisao.equals( "S" ) || (decisao.equals("s")) ){  
                System.out.println( "Novo cálculo de IMC" ) ;  
            }else{  
                System.out.println( "Você saiu!" ) ;  
                continuar = false ;  
                System.out.println("Total de pessoas Magras é: " + magro);
                System.out.println("Total de pessoas Normais é: " + normal);
                System.out.println("Total de pessoas Acima do peso é: " + acima);
                System.out.println("Total de pessoas Obesa é: " + obeso);
                System.out.println("Total de pessoas Muito obesa é: " + mobeso);
            }  
        }  
    }  
}
    
