package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import util.Pessoa;
import util.PessoaFisica;
import util.PessoaJuridica;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		List<Pessoa> listaPessoas = new ArrayList<Pessoa>();

		System.out.println("Digite o numero de contribuintes : ");
		int n = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < n; i++) {
			System.out.println("Digite os dados da pessoa #" + i + " : ");
			System.out.println("Pessoa Física ou Jurídica ? Digite : f (fisica) ou j (juridica)");
			char tipoPessoa = sc.next().charAt(0);
			sc.nextLine();

			System.out.println("Digite o nome : ");
			String nome = sc.nextLine();
			System.out.println("Digite a renda anual : ");
			double rendaAnual = sc.nextDouble();
			sc.nextLine();

			if (tipoPessoa == 'f') {

				System.out.println("Digite os gastos com saúde : ");
				double gastosSaude = sc.nextDouble();

				Pessoa pessoaFisica = new PessoaFisica(nome, rendaAnual, gastosSaude);

				listaPessoas.add(pessoaFisica);

			}

			else {
				System.out.println("Digite a quantidade de funcionários : ");
				int quantidadeFuncionarios = sc.nextInt();
				sc.nextLine();

				Pessoa pessoaJuridica = new PessoaJuridica(nome, rendaAnual, quantidadeFuncionarios);

				listaPessoas.add(pessoaJuridica);
			}

		}

		System.out.println("Impostos Pagos");

		double soma = 0;

		for (int j = 0; j < listaPessoas.size(); j++) {

			System.out.println("Nome: " + listaPessoas.get(j).getNome() + ", R$ : " + listaPessoas.get(j).imposto());

			soma += listaPessoas.get(j).imposto();

		}

		System.out.println("Total : " + soma);

		sc.close();
	}

}
