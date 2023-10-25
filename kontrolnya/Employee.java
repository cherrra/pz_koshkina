abstract class Employee implements InfaEmpl {
    private String name;
    private String position;
    private double salary;
    private String phone;
    private String address;

    public Employee(String name, String position, double salary, String phone, String address) {
        this.name = name;
        this.position = position;
        this.salary = salary;
        this.phone = phone;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void information() {
        System.out.println("сотрудники");
    }
}
