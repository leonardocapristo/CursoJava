package application;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

import entities.User;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
        DateTimeFormatter dataFormatada = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter horarioFormatada = DateTimeFormatter.ofPattern("HH:mm");
		
		System.out.println("Digite seu nome");
		String name = sc.nextLine();
		
		
		System.out.println("Digite seu telefone");
		Integer telefone = sc.nextInt();
		sc.nextLine();
		
		User cliente = new User(name, telefone);
		
		System.out.println("Digite a data que deseja agendar : ");
		String dataTexto = sc.nextLine();
		LocalDate data = LocalDate.parse(dataTexto, dataFormatada);
		
		System.out.println("Digite o horario que deseja agendar : ");
		String horarioTexto = sc.nextLine();
		LocalTime horario = LocalTime.parse(horarioTexto, horarioFormatada);
		
		System.out.println("Nome: " + cliente.getName() + "\nTelefone: " + cliente.getTelefone() + "\nData agendada: " + data + "\nHorário: " + horario);
		
		
        LocalDateTime teste = LocalDateTime.now();

        // Subtraindo uma hora diretamente na variável teste
        teste = teste.minus(1, ChronoUnit.HOURS);
        System.out.println("Hora subtraída: " + teste);

        // Adicionando uma hora diretamente na variável teste
        teste = teste.plus(1, ChronoUnit.HOURS);
        System.out.println("Hora adicionada: " + teste);

		
		sc.close();
        

	}

}
