package co.com.sofka.db;

import co.com.sofka.domain.Person;
import co.com.sofka.usecases.IRepositoryPerson;

public class RepositoryPerson implements IRepositoryPerson{
    private Repository repository;

    public RepositoryPerson() {
        this.repository = new RepositoryMongo();
    }


    @Override
    public void save(Person person) {
        repository.save("person", person);
    }
}
