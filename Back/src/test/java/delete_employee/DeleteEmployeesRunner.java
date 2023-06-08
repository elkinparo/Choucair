package delete_employee;

import com.intuit.karate.junit5.Karate;

public class DeleteEmployeesRunner {

    @Karate.Test
    Karate deleteEmployees() {
        return Karate.run("classpath:delete_employee/delete_employee.feature");
    }
}
