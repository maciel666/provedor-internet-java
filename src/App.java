import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {



        // 1- imprimir a informação dp proverdor 

        System.out.println("Obrigado {nome}, como posso lhe ajudar?");
        System.out.printf("Olá, bem-vindo a central de atendimento %s",provedor);  
    
 
 
        String atendente = "Bia";
     
        System.out.printf("\nMeu nome é %s, sou seu assistente virtual %s ", atendente, "ok");
 
 
        System.out.printf("\nDurante o atendimento siga minhas instruções");
        Scanner scanner = new Scanner(System.in);
 
        System.out.print("\nPrimeiramente informe seu nome ");
        String nome = scanner.next();

        Scanner scanner = new Scanner (System.in);
        String nome = scanner.nextLine();
 
 
        System.out.printf("\nObrigado %s, como posso lhe ajudar?", nome );
        String resposta = scanner.nextLine();
        // imprimindo texto concatenado 
        System.out.println("sua resposta foi: " + resposta);
        scanner.close();

    }
}
