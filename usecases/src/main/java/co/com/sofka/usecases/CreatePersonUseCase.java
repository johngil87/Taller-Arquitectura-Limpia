package co.com.sofka.usecases;

import co.com.sofka.domain.Person;

public class CreatePersonUseCase {

    private IRepositoryPerson repositoryPerson;

    public CreatePersonUseCase(IRepositoryPerson repositoryPerson) {
        this.repositoryPerson = repositoryPerson;
    }

    public void create(String name){
        repositoryPerson.save(new Person(name));
    }
}
