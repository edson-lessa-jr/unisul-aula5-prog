/*
Escreva um algoritmo que mostre todos os n�meros pares entre 33 e 57 usando for.
*/

import javax.swing.JOptionPane;

public class Exercicio21 {

    public static void main(String[] args) {
	      
		  for(int i=33; i<57;i++){
		  
		    if((i % 2) == 0){
			   JOptionPane.showMessageDialog(null,"� par: " + i); 
			}	  
		    
		  }		  
    }

}
