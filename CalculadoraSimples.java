import java.util.Scanner;

public class CalculadoraSimples{
    public static void main(String[] args) {
        
        //Declaração de variáveis
        int n1, n2, total, op;

        //Criação e instância do objeto de entrada
        Scanner entrada = new Scanner(System.in);

        do{

            System.out.println("\n\t\t\t -- Calculadora Simples --\n");

            System.out.println("1.Soma");
            System.out.println("2.Subtração");
            System.out.println("3.Sair");

            System.out.print("Opção:");
            op = entrada.nextInt();

            if(op == 1){
                System.out.println("\n\t\t\t -- Soma --\n"); 
            } else if(op == 2){ // Cria um objeto Scanner para ler a entrada do usuário
                Scanner scanner = new Scanner(System.in);
                
                // Solicita o primeiro número
                System.out.print("Digite o primeiro número: ");
                int numero1 = scanner.nextInt();
                
                // Solicita o segundo número
                System.out.print("Digite o segundo número: ");
                int numero2 = scanner.nextInt();
                
                // Realiza a soma
                int resultado = numero1 + numero2;
                
                // Exibe o resultado
                System.out.println("A soma dos números é: " + resultado);
                
                // Fecha o objeto Scanner
                scanner.close();
            }
        }
                System.out.println("\n\t\t\t -- Subtração -- \n");
            } else if(op == 3) //Entrada
            System.out.println("\n\t\t\t -- Subtração --\n");
            System.out.println("Digite o primeiro número: ");
            n1 = entrada.nextInt();
            System.out.println("Digite o segundo número: ");
            n2 = entrada.nextInt();

            //Processamento
            total = n1 - n2;

            //Saida
            System.out.println("O resultado da subtração é:" + total);
        } else if(op == 3){
            //Entrada 
            System.out.println("\n\t\t\t -- Multiplicação --\n");
            System.out.println("Digite o primeiro número: ");
            n1 = entrada.nextInt();
            System.out.println("Digite o segundo número: ");
            n2 = entrada.nextInt();

            //Processamento 
            total = n1 * n2;

            //Saída 
            System.out.println("O resultado da subtração é:" + total);
        } else if(op == 4){
             //Entrada 
             System.out.println("\n\t\t\t -- Divisão --\n");
             System.out.println("Digite o primeiro número: ");
             n1 = entrada.nextInt();
             System.out.println("Digite o segundo número: ");
             n2 = entrada.nextInt();

             //Processamento 
             total = n1 / n2;

             //Saída 
             System.out.println("O resultado da subtração é:" + total);
            } else if(op == 5){

            
        }while(op!=3);


    }
}