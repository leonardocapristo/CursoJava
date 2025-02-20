/*
    Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes.
    Escreva um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 
    1. Álcool 
    2. Gasolina 
    3. Diesel
    4. Fim). 

    Caso o usuário informe um código inválido (fora da faixa de 1 a 4), deve ser solicitado um novo código 
    (até que seja válido). O programa será encerrado quando o código informado for o número 4. 

    Deve ser escrita a mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, 
    conforme exemplo.
*/



package ex6;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int combustivelSelecionado = 0;
		int combustivel1 = 0, combustivel2 = 0, combustivel3 = 0;

		
		while (combustivelSelecionado >=1 || combustivelSelecionado <=3) {
			System.out.println("Digite o código do combustível: ");
			
			combustivelSelecionado = sc.nextInt();

			if (combustivelSelecionado == 1) {
				System.out.println("Alcool");
				combustivel1++;
			}
			
			else if (combustivelSelecionado == 2) {
				System.out.println("Gasolina");
				combustivel2++;
			}
			else if (combustivelSelecionado == 3) {
				System.out.println("Diesel");
				combustivel3++;
			}
			else if (combustivelSelecionado == 4) {
				System.out.println("Fim ");
				System.out.printf("Quantidades selecionadas : %n Alcool: %d %n Gasolina: %d %n Diesel : %d", combustivel1, combustivel2, combustivel3);
				break;
			}
			
			else if (combustivelSelecionado <1 || combustivelSelecionado >4) {
				System.out.println("Código invalido, digite novamente :");
			}
		}



		sc.close();

	}

}
