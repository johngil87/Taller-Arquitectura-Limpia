package co.com.sofka.db;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.bson.Document;

public class RepositoryMongo implements Repository{

    MongoClient mongoClient;
    public RepositoryMongo(){
        mongoClient = MongoClients.create();
    }

    @Override
    public void save(String col,Object object) {
        mongoClient.getDatabase("db").getCollection(col).insertOne((Document) object);
    }
}
