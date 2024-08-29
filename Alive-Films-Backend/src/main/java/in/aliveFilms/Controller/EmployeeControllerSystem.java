package in.aliveFilms.Controller;

import in.aliveFilms.Services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EmployeeControllerSystem {
    @Autowired
    private EmployeeService empservice;

    @PostMapping("/register")
    public String register(){
        return null;
    }
}
