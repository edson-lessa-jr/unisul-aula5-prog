/*
Escreva um algoritmo para calcular e mostrar a média dos números entre 1 e 1000 usando while.
*/
import javax.swing.JOptionPane;

public class Exercicio22 {

    public static void main(String[] args) {
	      
		  double media = 0.0;
		  double soma = 0.0;
		  int i = 1;
		  while(i<=1000){
			soma = soma + i; 
			JOptionPane.showMessageDialog(null,"soma: " + soma); 
			i++;
		  }
		  
		  media = soma / 1000;
		  
		  JOptionPane.showMessageDialog(null,"média: " + media);

		 

           
    }

}
