public class Company {
    public static void main(String[] args) {

        Employee emp1 = new Employee("Jan", "Nowak");
        Employee emp2 = new Employee("Andrzej", "Kowalski");
        Employee emp3 = new Employee("Mirosław", "Zawadzki");
        Employee emp4 = new Employee("Wiesław", "Gołąb");
        Employee emp5 = new Employee("Zdzisław", "Miarka");

        Company company = new Company();
        company.add(emp1);
        company.add(emp2);
        company.add(emp3);
        company.add(emp4);
        company.add(emp5);
        System.out.println("Dopisany kolejny pracownik do tablicy firmy: ");
    }
}

