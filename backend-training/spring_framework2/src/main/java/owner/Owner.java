package owner;

import employee.Employee;

public class Owner {

    private  final Employee employee;

    public Owner(Employee employee) {
        this.employee = employee;
    }

    public Employee getEmployee(){
        return  employee;
    }
}
