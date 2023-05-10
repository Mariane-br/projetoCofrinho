package cofrinho;

import java.util.Scanner;
//Classe Principal
public class Principal {

	public static void main(String[] args) {
		
	   //Criando um Scanner para obter as entradas do teclado
	   Scanner teclado = new Scanner(System.in);
	   
	   //Instanciando a classe Cofrinho para acessar os seus métodos
	   Cofrinho cofrinho = new Cofrinho();
	   
	   //Menu de opções do Cofrinho
       System.out.println("COFRINHO DE MOEDAS:");
       System.out.println("1 - Adicionar");
       System.out.println("2 - Remover");
       System.out.println("3 - Listar Moedas");
       System.out.println("4 - Calcular total convertido para Real");
       System.out.println("0 - Encerrar");
       //Armazenando a opção escolhida
       int opcaoMenu  = teclado.nextInt();
       
       Moeda moeda;
       //Estrutura de repetição para executar as opções do menu desde que seja diferente de 0
       while(opcaoMenu!=0) {
    	   switch(opcaoMenu) {
    	   case 1:
    		   //Adicionar moedas
    		   int opcaoMoedas=0;
    		 //Estrutura de repetição para executar as opções de moedas 
    		   while(opcaoMoedas>3 || opcaoMoedas<=0) {
    			   System.out.println("1 - Real");
    			   System.out.println("2 - Dolar");
    			   System.out.println("3 - Euro");
    			  //Armazenando a opção escolhida
    			   opcaoMoedas = teclado.nextInt();
    		   }
    		   moeda = null;
    		   if(opcaoMoedas==1) {
    			   //Recebendo o valor da moeda se ela for em Real
    			   System.out.println("Qual o valor em Real?");
        		   double valorReal = teclado.nextDouble();
        		   //Instanciando a classe Real passando o valor do Real
        		   moeda = new Real(valorReal);
    		   }
    		   if(opcaoMoedas==2) {
    			 //Recebendo o valor da moeda se ela for em Dolar
    			   System.out.println("Qual o valor em Dolar?");
        		   double valorDolar = teclado.nextDouble();
        		 //Instanciando a classe Dolar e passando o valor do Dolar
        		   moeda = new Dolar(valorDolar);
    		   }
    		   if(opcaoMoedas==3) {
    			 //Recebendo o valor da moeda se ela for em Euro
    			   System.out.println("Qual o valor em Euro?");
        		   double valorEuro = teclado.nextDouble();
        		 //Instanciando a classe Euro e passando o valor do Euro
        		   moeda = new Euro(valorEuro);
    		   }
    		   //Chamando o método da classe cofrinho para adicionar a moeda
    		   cofrinho.adicionar(moeda);
    		   
    		   break;
    	   case 2:
    		   //Remover moedas. Mesmo código utilizado para adicionar moeda
    		    opcaoMoedas=0;
    		   while(opcaoMoedas>3 || opcaoMoedas<=0) {
    			   System.out.println("1 - Real");
    			   System.out.println("2 - Dolar");
    			   System.out.println("3 - Euro");
    			   opcaoMoedas = teclado.nextInt();
    		   }
    		   moeda = null;
    		   if(opcaoMoedas==1) {
    			   System.out.println("Qual o valor em Real?");
        		   double valorReal = teclado.nextDouble();
        		   moeda = new Real(valorReal);
    		   }
    		   if(opcaoMoedas==2) {
    			   System.out.println("Qual o valor em Dolar?");
        		   double valorDolar = teclado.nextDouble();
        		   moeda = new Dolar(valorDolar);
    		   }
    		   if(opcaoMoedas==3) {
    			   System.out.println("Qual o valor em Euro?");
        		   double valorEuro = teclado.nextDouble();
        		   moeda = new Euro(valorEuro);
    		   }
    		   //Chamando o método da classe cofrinho para remover uma moeda
    		   cofrinho.remover(moeda);
    		   
    		   break;
    	   case 3:
    		   //Chamando o método da classe cofrinho para listar as moedas
    		   cofrinho.listagemMoedas();
    		   break;
    	   case 4:
    		   //Chamando o método da classe cofrinho para obter o total convertido para real
    		   cofrinho.totalConvertido();
    		   break;	   
    	   default:
    		   System.out.println("Opção inválida!");
    		   System.out.println();
    	   }
    	   System.out.println("COFRINHO DE MOEDAS:");
           System.out.println("1 - Adicionar");
           System.out.println("2 - Remover");
           System.out.println("3 - Listar Moedas");
           System.out.println("4 - Calcular total convertido para Real");
           System.out.println("0 - Encerrar");
           opcaoMenu  = teclado.nextInt();
       }
    	  System.out.println("Programa encerrado!");
	}

}
