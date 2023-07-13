import java.util.Scanner;

public class Contador {
   


    public static void main(String[] args) throws ParametrosInvalidosExcepetion {
        
       Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro parâmetro: ");

        int parametroUm = entrada.nextInt();
          System.out.print("Digite o segundo parâmetro: ");  
        
        int parametroDois = entrada.nextInt();
    
          try {
            // chamando o metodo contendo a logica de contagem
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosExcepetion exception) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
            //mensagem
        }

      }
        
    
   
        



        static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosExcepetion {
            //validar se parametroUm é MAIOR que parametroDois e lançar a exceção
            
            int contagem = parametroDois - parametroUm;
            //realizar o for para imprimir os números com base na variável contagem

            for(int i = 1; i <= contagem; i ++){
                
                   System.out.println("Imprimindo o número " + i);
                
               }
        }









}


