package dockerizing.MongoSpringCRUDDocker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*")
public class CrudController {
    @Autowired
    private CrudService service;

    @PostMapping("/")
    public Techies callCreate(@RequestBody Techies techies){
        return service.create(techies);
    }

    @GetMapping("/{id}")
    public Optional<Techies> callRead(@PathVariable("id") String id){
        return service.read(id);
    }

    @GetMapping("/")
    public List<Techies> callReadAll(){
        return service.readAll();
    }

    @PutMapping("/{id}")
    public Techies callUpdate(@PathVariable("id") String id,@RequestBody Techies techies){
        return service.create(techies);
    }

    @DeleteMapping("/{id}")
    public String callDelete(@PathVariable("id") String id){
        return service.delete(id);
    }
}
