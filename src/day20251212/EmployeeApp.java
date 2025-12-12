package day20251212;

import java.util.ArrayList;
import java.util.List;

public class EmployeeApp {

	public static void main(String[] args) {

		// 社員リストを作成
		List<Employee> employees = new ArrayList<>();

		// 社員を追加（コンストラクタ）
		employees.add(new Employee("田中", 25, 300000));
		employees.add(new Employee("佐藤", 35, 420000));
		employees.add(new Employee("鈴木", 28, 280000));

		// 社員情報を表示
		printEmployees(employees);

		// 平均給与を計算
		int averageSalary = calcAverageSalary(employees);
		System.out.println("平均給与：" + averageSalary + "円");
	}

	// 社員情報を表示するメソッド
	public static void printEmployees(List<Employee> employees) {

		for (Employee e : employees) {

			// nullチェック（業務では重要）
			if (e.name != null) {
				System.out.println(
						e.name + " / " +
								e.age + "歳 / " +
								e.salary + "円");
			}
		}
	}

	// 平均給与を計算するメソッド
	public static int calcAverageSalary(List<Employee> employees) {

		int total = 0;

		for (Employee e : employees) {
			total += e.salary;
		}

		return total / employees.size();
	}
}

// 社員クラス（Entity / DTO 的な存在）
class Employee {

	String name;
	int age;
	int salary;

	// コンストラクタ
	public Employee(String name, int age, int salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
}
