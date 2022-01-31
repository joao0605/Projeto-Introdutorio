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

        System.out.println("           ### Seja bem vindo(a) ao Acelera Tasks ###");
        System.out.println("### Uma ferramenta que te permite organizar e agilizar suas atividades ###");
        System.out.println();
        System.out.println(" O que você deseja fazer? ");
        System.out.println("1 - Cadastrar uma nova atividade");
        System.out.println("2 - Listar suas atividades");
        System.out.println("3 - Remover uma atividade");
        ans = sc.nextByte();
        sc.nextLine();
        System.out.println();
        for (int i =0; i<4 ; i++) {

            switch (ans) {
                case 1:
                    System.out.println("Teste " + i);
                    Task task = new Task();
                    task.register();

                    System.out.println(task);

                    List<Task> list = new ArrayList<>();
                    list.add(task);
                    System.out.println(list);



                    break;
                case 2:

                    break;
                case 3:

                    break;
                default:
                    break;
            }
        }




    sc.close();
    }
}
