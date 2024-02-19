package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Address;
import entities.Department;
import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Department department = new Department();
		Address address = new Address();

		System.out.println("Nome do departamento: ");
		department.setName(sc.nextLine());
		System.out.println("Dia do pagamento: ");
		department.setPayDay(sc.nextInt());
		sc.nextLine();
		System.out.println("Email: ");
		address.setEmail(sc.next());
		System.out.println("Telefone: ");
		address.setPhone(sc.next());

		department.setAddress(address);

		System.out.println("Quantos funcionários tem o departamento? ");
		int n = sc.nextInt();
		sc.nextLine();
		for (int i = 1; i <= n; i++) {
			Employee employee = new Employee();
			System.out.println("Dados do funcionário " + i + ":");
			System.out.println("Nome: ");
			employee.setName(sc.nextLine());
			System.out.println("Salário: ");
			employee.setSalary(sc.nextDouble());
			sc.nextLine();

			department.addEmployee(employee);
		}

		showReport(department);
		sc.close();
	}

	private static void showReport(Department department) {double totalPayroll = department.payroll();
		System.out.println("FOLHA DE PAGAMENTO: ");
		System.out.println("Departamento " + department.getName() + " = R$ " + totalPayroll);
		System.out.println("Pagamento realizado no dia " + department.getPayDay());
		System.out.println("Funcionários:");
		for (Employee employee : department.getEmployees()) {
			System.out.println(employee.getName());
		}
		System.out.println("Para dúvidas favor entrar em contato: " + department.getAddress().getEmail());
	}
}
