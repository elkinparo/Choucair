package get_employees_id;

import com.intuit.karate.junit5.Karate;

public class getEmployeeRunner
{
    @Karate.Test
    Karate getEmployes() {
        return Karate.run("classpath:get_employees_id/get_employes_id.feature");
    }
}
