/*
Solicite ao usu�rio que escreva uma frase e o n�mero de vezes que a mesma deve ser mostrada. 
Implemente o algoritmo usando for.
*/


import javax.swing.JOptionPane;

public class Exercicio19 {

    public static void main(String[] args) {
	      
		  int n = Integer.parseInt(JOptionPane.showInputDialog("Digite o n�mero de vezes:"));
		  String frase = JOptionPane.showInputDialog("Digite a frase:");

		  for(int i=0; i<n;i++){
		    JOptionPane.showMessageDialog(null,"frase: " + frase); 
		  }		  
           
    }

}
