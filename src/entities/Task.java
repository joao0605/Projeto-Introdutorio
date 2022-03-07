package entities;

import entities.enums.TaskStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import static entities.enums.TaskStatus.*;

public class Task {
    private String name;
    private String description;
    private Date deadline;
    private int priority;
    private String category;
    private TaskStatus status;
    private int id;
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");


    public Task(){
    }

    public Task(String name, String description, Date endline, int priority, String category, TaskStatus status, int id) {
        this.name = name;
        this.description = description;
        this.deadline = endline;
        this.priority = priority;
        this.category = category;
        this.status = status;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date endline) {
        this.deadline = endline;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public TaskStatus getStatus() {
        return status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setStatus(TaskStatus status) {

        this.status = status;
    }

    public void register() {
        Scanner sc = new Scanner(System.in);

        String date;
        Date now = new Date(); // para impedir o cadastro de datas no passado
        int priority;
        byte statusSelector;



        System.out.println("### Cadastro de novas atividades ###");
        System.out.println();
        System.out.println("Insira o ID da sua atividade, em formato NNN: ");
        this.id = sc.nextInt();
        sc.nextLine();
        System.out.println();
        System.out.print("Insira o nome da atividade: ");
        this.name = sc.nextLine();
        System.out.println();
        System.out.print("Adicione sua atividade a uma categoria: ");
        this.category = sc.nextLine();
        System.out.println();
        System.out.print("Insira a data de entrega da sua atividade no formato dd/MM/AAAA: ");
        date = sc.nextLine();

        try {
            this.deadline = sdf.parse(date);
        } catch (ParseException e) {
            System.out.println("ERRO: Insira uma data válida");
            // e.printStackTrace();
        }
        System.out.println();
        System.out.println(" Qual o nível de prioridade da sua atividade?  ");
        System.out.println(" (De 1 a 5, sendo 1 o maior nível de prioridade) ");
        this.priority = sc.nextByte();
        System.out.println();
        System.out.print(" Agora escreva uma descrição para a sua tarefa: ");
        sc.nextLine();
        this.description = sc.nextLine();
        System.out.println();

        System.out.println(" Qual é o status da sua tarefa ");
        System.out.println(" 1 - A fazer");
        System.out.println(" 2 - Fazendo");
        System.out.println(" 3 - Feita");
        System.out.println();

        statusSelector = sc.nextByte();
        switch (statusSelector) {
            case 1:
                this.status = TODO;
                System.out.println(" Status selecionado: 'A fazer'");
                break;
            case 2:
                this.status = DOING;
                System.out.println(" Status selecionado: 'Fazendo'");
                break;
            case 3:
                this.status = DONE;
                System.out.println(" Status selecionado: 'Feito'");
                break;
            default:
                System.out.println("Entrada inválida! Insira uma opção válida");

                break;
        }

        System.out.println();
        System.out.println("Atividade ID " + id + " cadastrada com sucesso!!");

    }

    @Override
    public String toString() {
        return " ## Tarefa ID " + id +
                " ##\n " + name + "\n" +
                " Descrição: " + description + '\n' +
                " Data de entrega: " + deadline + "\n" + // não encontrei um método de conversão da data para o formato dd/mm/AAAA, o sdf.parse() não funcionou aqui.
                " Prioridade: " + priority + "\n" +
                " Categoria: " + category + "\n" +
                " Status: " + status + "\n \n" ;
    }
}
