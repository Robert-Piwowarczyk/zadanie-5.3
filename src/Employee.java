public class Employee {
    private String firstName;
    private String lastName;


    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

   public Employee[] emp = new Employee[5];
    int empNumber = 0;

    public void add(Employee employee) {
        if (empNumber < 5) {
            empNumber = 0;
            emp[empNumber] = employee;
            empNumber++;
        } else {
            System.out.println("Na tablicy nie ma już miejsca na dopisanie" +
                    "kolejnego pracownika");
        }
    }
}

