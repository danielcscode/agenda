import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void rodape(){
        System.out.println("******************************************");
        System.out.println("************** A G E N D A ***************");
        System.out.println("******************************************");
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
        int opcao;

        rodape();
        System.out.println("POR FAVOR ADICIONE PELO MENOS 1 CONTATO!!!");
        System.out.println();
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
            System.out.println("******************************************");
            System.out.println();
        } while (!finalizar.equals("N"));
        for (int i = 0; i < 500; i++) {
            System.out.println();
        }
        do{
            rodape();
            System.out.println("Digite a opção desejada:");
            System.out.println("[1] - Consultar Contato");
            System.out.println("[2] - Adicionar Contato");
            System.out.println("[3] - Numero de Contato");
            System.out.println("[0] - Sair");
            System.out.println();
            System.out.print("Digite o digito: ");
            opcao = dados.nextInt();
            dados.nextLine();
            System.out.println("******************************************");
            System.out.println();

            switch (opcao) {
                case 1: {
                    System.out.println("Digite o contato que deseja encontrar:");
                    System.out.print("Nome: ");
                    procura = dados.nextLine();
                    boolean encontrado = false;
                    for (int i = 0; i < nome.size(); i++) {
                        if (nome.get(i).equals(procura)) {
                            System.out.println("Contato Encontrado!");
                            System.out.println();
                            System.out.println(procura);
                            System.out.println("Telefone: " + telefone.get(i));
                            System.out.println("Email: " + email.get(i));
                            System.out.println();
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("Nome não encontrado!");
                        System.out.println("******************************************");
                        System.out.println();
                    }
                } break;
                case 2: {
                    do {
                        System.out.println("Adicione o " + contador + "º nome.");
                        System.out.print("Nome: ");
                        nome.add(dados.nextLine());
                        System.out.println("Adicione o telefone sem o DDD.");
                        System.out.print("Telefone: ");
                        telefone.add(dados.nextLine());
                        System.out.println("Adicione o email.");
                        System.out.print("Email: ");
                        email.add(dados.nextLine());
                        contador++;
                        System.out.println("Deseja adicionar mais contato?");
                        System.out.println("[S] - Sim / [N] - Não");
                        finalizar = dados.nextLine();
                        System.out.println("******************************************");
                        System.out.println();
                        if(finalizar.equalsIgnoreCase("N")) {
                            break;
                        }
                    } while (true);
                } break;
                case 3: {
                    System.out.println("Você possui " + nome.size() + " contato(s)!");
                    System.out.println("******************************************");
                    System.out.println();
                } break;
            }
        }while (opcao != 0);
        System.out.println("Agenda finalizada!");
        System.out.println("******************************************");
    }
}