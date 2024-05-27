package interface1;

public class main {
	public static void main(String[] args) {
		Invoice[] invoices = {
			new Invoice("Monitor", 1, 1000000),
			new Invoice("Mouse", 2, 200000),
			new Invoice("Keyboard", 1, 500000)
		};

		employee employee = new employee(12345, "Joel Felix", 5000000, invoices);

		System.out.println(employee);
	}
}
