package program;

import entities.Task;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main (String[] arg){
        Scanner sc = new Scanner(System.in);
        byte ans;
        List<Task> list = new ArrayList<>();


        System.out.println("           ### Seja bem vindo(a) ao Acelera Tasks ###");
        System.out.println("### Uma ferramenta que te permite organizar e agilizar suas atividades ###");

        do{
            System.out.println();
            showMenu();
            ans = sc.nextByte();
            sc.nextLine();
            System.out.println();

            switch (ans) {
                case 1:
                    Task task = new Task();
                    task.register();
                    list.add(task);

                    break;
                case 2:

                    System.out.println("### Listagem de atividades ###");
                    System.out.println();
                    System.out.println("Selecione o critério para a listagem das atividades: ");
                    System.out.println("1 - Por ID");
                    System.out.println("2 - Por prioridade");
                    System.out.println("3 - Por categoria");
                    System.out.println("4 - Por data de entrega");
                    System.out.println(list);

                    break;
                case 3:
                    System.out.println("### Excluir atividades ###");
                    System.out.println();
                    System.out.println("Digite o ID da atividade que deseja excluir: ");

                    break;
                case 4:
                    System.out.println("### Fim do programa ###");
                    break;
                default:
                    System.out.println("Opção inválida, digite novamente!!");
                    break;

            }
        } while (ans != 4);




        sc.close();
    }

    public static void showMenu(){
        System.out.println(" O que você deseja fazer? ");
        System.out.println();
        System.out.println("1 - Cadastrar uma nova atividade");
        System.out.println("2 - Listar suas atividades");
        System.out.println("3 - Remover uma atividade");
        System.out.println("4 - Sair");
    }
}
