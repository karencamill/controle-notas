package application;

import entities.Cliente;
import entities.Divida;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        ArrayList<Divida> dividas = new ArrayList<>();

        int opcao;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1 - Registrar dívida");
            System.out.println("2 - Listar dívidas");
            System.out.println("3 - Marcar como pago ");
            System.out.println("4 - Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {

                case 1:
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();

                    System.out.print("Telefone: ");
                    String telefone = sc.nextLine();

                    Cliente cliente = new Cliente(nome, telefone);

                    System.out.print("Descrição: ");
                    String descricao = sc.nextLine();

                    System.out.print("Valor: ");
                    double valor = sc.nextDouble();

                    sc.nextLine();

                    System.out.print("Data: ");
                    String data = sc.nextLine();

                    Divida divida = new Divida(cliente, descricao, valor, data);
                    dividas.add(divida);

                    System.out.println("Dívida registrada!");
                    break;

                case 2:
                    System.out.println("\n===== LISTA DÍVIDAS =====");

                    double somaDivida = 0;

                    for (Divida d : dividas) {
                        System.out.println("Nome: " + d.getCliente().getNome());
                        System.out.println("Telefone: " + d.getCliente().getTelefone());
                        System.out.println("Descrição: " + d.getDescricao());
                        System.out.printf("Valor: %.2f" , d.getValor());
                        System.out.println("\nData: " + d.getData());
                        if (d.isPago()){
                            System.out.println("Status: pago");
                        }else {
                            System.out.println("Status: pendente");
                            somaDivida = somaDivida + d.getValor();
                        }
                        System.out.println("----------------------");
                    }
                    System.out.printf("\nTotal de dívidas em aberto: R$ %.2f\n" , somaDivida);
                    break;

                case 3:
                    System.out.println("\n===== PAGO =====");

                    System.out.print("Informa nome: ");
                    String nomeBusca = sc.nextLine();

                    System.out.print("Informa telefone: ");
                    String telefoneBusca = sc.nextLine();

                    boolean encontrado = false;

                    for (Divida divida1 : dividas) {
                        if (divida1.getCliente().getNome().equals(nomeBusca) && divida1.getCliente().getTelefone().equals(telefoneBusca)) {
                            divida1.setPago(true);
                            encontrado = true;
                            System.out.println("Dívida marcada como paga");
                            break;
                        }
                    }

                    if (!encontrado) {
                        System.out.println("Dívida não encontrada");
                    }
            }

        } while (opcao != 5);

        sc.close();

    }
}
