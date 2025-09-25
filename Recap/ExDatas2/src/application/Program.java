package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        LocalDate dataAtual = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        System.out.println("Data atual: " + dataAtual);
        System.out.print("Digite uma data (yyyy-MM-dd): ");
        String inputData = scanner.nextLine();

        LocalDate dataAgendamento = LocalDate.parse(inputData, formatter);

        while (true) {
            if (dataAgendamento.getYear() == dataAtual.getYear() &&
                dataAgendamento.getMonth() == dataAtual.getMonth() &&
                !dataAgendamento.isBefore(dataAtual)) {
                System.out.println("Data de agendamento válida.");
                break;
            } else {
                System.out.println("Data inválida! Escolha um dia deste mês a partir de hoje.");
                System.out.print("Digite uma data (yyyy-MM-dd): ");
                inputData = scanner.nextLine();
                dataAgendamento = LocalDate.parse(inputData, formatter); // Reparse a nova data
            }
        }
        
        dataAgendamento.minusDays(1);
        dataAgendamento.plusDays(2);

        scanner.close();
    }
}
