/*
Escreva um algoritmo usando while que solicite ao usu�rio um n�mero inicial e um n�mero final. 
Calcule a soma de todos os n�meros dentro da faixa de valor informada INCLUINDO o n�mero inicial e final.
*/


import javax.swing.JOptionPane;

public class Exercicio23 {

    public static void main(String[] args) {
	
	      int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o n�mero inicial:"));
		  int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o n�mero final:"));
		  int soma = 0;
	      int i = n1;
		  while(i<=n2){		  
            soma = soma + i; 
		    i++;
		  }

          JOptionPane.showMessageDialog(null,"soma: " + soma);		  
           
    }

}
