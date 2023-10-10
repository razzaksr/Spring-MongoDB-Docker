package dockerizing.MongoSpringCRUDDocker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CrudService {
    @Autowired
    private MongoRepo repo;

    public Techies create(Techies techies){
        return repo.save(techies);
    }

    public Optional<Techies> read(String id){
        return repo.findById(id);
    }

    public List<Techies> readAll(){
        return repo.findAll();
    }

    public String delete(String id){
        Techies mongo=repo.findById(id).orElse(new Techies());
        repo.delete(mongo);
        return mongo.getFullname()+"has deleted";
    }

}
