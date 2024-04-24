import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void rodape(){
        System.out.println("***********************************");
        System.out.println("********** A G E N D A ************");
        System.out.println("***********************************");
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);
        ArrayList<String> nome = new ArrayList<>();
        ArrayList<String> telefone = new ArrayList<>();
        ArrayList<String> email = new ArrayList<>();

        String finalizar = "S";
        String procura;
        int contador = 1;

        rodape();
        do {
            System.out.println("Adicione o "+ contador + "º nome." );
            System.out.print("Nome: ");
            nome.add(dados.nextLine());
            System.out.println("Adicione o telefone sem o DDD." );
            System.out.print("Telefone: ");
            telefone.add(dados.nextLine());
            System.out.println("Adicione o email." );
            System.out.print("Email: ");
            email.add(dados.nextLine());
            contador ++;
            System.out.println("Deseja adicionar mais contato?");
            System.out.println("[S] - Sim / [N] - Não");
            finalizar = dados.nextLine();
            System.out.println("******************************");
            System.out.println();
        } while (!finalizar.equals("N"));

        rodape();
        System.out.println("Digite o contato que deseja encontrar:");
        System.out.print("Nome: ");
        procura = dados.nextLine();
        boolean encontrado = false;
        for (int i = 0; i < nome.size(); i++) {
            if (nome.get(i).equals(procura)) {
                System.out.println("***********************************");
                System.out.println("Contato Encontrado!");
                System.out.println();
                System.out.println(procura);
                System.out.println("Telefone: " + telefone.get(i));
                System.out.println("Email: " + email.get(i));
                System.out.println("***********************************");
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Nome não encontrado!");
        }
    }
}