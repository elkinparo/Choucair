package put_employess;

import com.intuit.karate.junit5.Karate;

public class UpdateEmployeesRunner {

    @Karate.Test
    Karate updateEmployees() {
        return Karate.run("classpath:put_employess/delete_employee.feature");
    }
}
