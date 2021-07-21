package co.com.sofka.rest;

import co.com.sofka.db.RepositoryMongo;
import co.com.sofka.db.RepositoryPerson;
import co.com.sofka.usecases.CreatePersonUseCase;

public class RestPersonController {

    private CreatePersonUseCase createPersonUseCase;
    public RestPersonController(){
        RepositoryPerson repositoryPerson = new RepositoryPerson();
        createPersonUseCase = new CreatePersonUseCase(repositoryPerson);
    }

    public String postCommand(String name){
        createPersonUseCase.create(name);

        return "ok";
    }
}
