package dockerizing.MongoSpringCRUDDocker;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MongoRepo extends MongoRepository<Techies,String> {

}
