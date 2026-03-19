package application;

import entities.Cliente;
import entities.Divida;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Cliente c1 = new Cliente("Maria", "99999-9999");

        Divida d1 = new Divida(c1, 50.0, "19/03/2026");

        System.out.println("Cliente: " + d1.getCliente().getNome());
        System.out.println("Valor: " + d1.getValor());
        System.out.println("Pago: " + d1.isPago());









        /*System.out.println("Sistema de controle de notas");

        System.out.println("1 - Cadastrar cliente\n" +
                "2 - Registrar dívida\n" +
                "3 - Listar dívidas\n" +
                "4 - Marcar como pago\n" +
                "5 - Sair");

        System.out.print("Escolha uma opção: ");
        int opc = sc.nextInt();

        switch (opc) {
            case 1 :
                System.out.println("Cadastrar cliente");
                break;

            case 2 :
                System.out.println("Registrar dívida");
                break;

            case 3 :
                System.out.println("Listar dívidas");
                break;

            case 4 :
                System.out.println("Marcar como pago");
                break;

            case 5 :
                System.out.println("Sair");
                break;

            default:
                System.out.println("Opção inválida");
        }*/


        sc.close();

    }
}
