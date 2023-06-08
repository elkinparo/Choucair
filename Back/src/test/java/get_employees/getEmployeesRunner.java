package get_employees;

import com.intuit.karate.junit5.Karate;

public class getEmployeesRunner
{
    @Karate.Test
    Karate getEmployes() {
        return Karate.run("classpath:get_employees/get_employees.feature");
    }
}
