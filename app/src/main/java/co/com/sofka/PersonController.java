package co.com.sofka;


import co.com.sofka.rest.RestPersonController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @Autowired
    RestPersonController restPersoncontroller;

    @PostMapping("/person")
    public String create(String name){
        return restPersoncontroller.postCommand(name);
    }

}
