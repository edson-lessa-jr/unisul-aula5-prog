/*
Escreva um algoritmo que mostre todos os n�meros pares entre 13 e 23 usando do..while.
*/

import javax.swing.JOptionPane;

public class Exercicio24{

    public static void main(String[] args) {
	      int i = 13;
		  do{
		    i++;
		    if((i % 2) == 0){
			   JOptionPane.showMessageDialog(null,"� par: " + i); 
			}
		  }while(i<23);		  
           
    }

}
