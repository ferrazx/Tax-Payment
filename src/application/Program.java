package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.PessoaFisica;
import entities.PessoaJuridica;
import entities.Taxas;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Taxas> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++){
			System.out.println("Tax payer #" + (i+1) + " data: ");
			System.out.print("Individual or company (i/c)? ");
			char type = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Anual income: ");
			Double renda = sc.nextDouble();
			if(type == 'i') {
				System.out.print("Health expenditures: ");
				Double despesasMedicas = sc.nextDouble();
				list.add(new PessoaFisica(nome, renda, despesasMedicas));
			}
			else{
				System.out.print("Number of employees: ");
				Double empregados = sc.nextDouble();
				list.add( new PessoaJuridica(nome, renda, empregados));
			}
		}
		
		double sum = 0;
		System.out.println();
		System.out.println("TAXES PAID:");
		
		for(Taxas tax : list) {
			double taxa = tax.taxas();
			System.out.println(tax.getNome() + ": R$ " + String.format("%.2f", taxa));
			sum = taxa + taxa;
		}
		
		System.out.println();
		System.out.println("TOTAL TAXES: R$ " + String.format("%.2f", sum));
		
		
		sc.close();
	}
	}