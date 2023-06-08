package post_employee;

import com.intuit.karate.junit5.Karate;

public class CreateEmployeesRunner {

    @Karate.Test
    Karate createEmployees() {
        return Karate.run("classpath:post_employee/create_employee.feature");
    }
}
