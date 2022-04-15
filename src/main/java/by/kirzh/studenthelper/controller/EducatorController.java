package by.kirzh.studenthelper.controller;

import by.kirzh.studenthelper.domain.Educator;
import by.kirzh.studenthelper.repository.EducatorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("educators")
public class EducatorController {

    private final EducatorRepository educatorRepository;

    @Autowired
    public EducatorController(EducatorRepository educatorRepository) {
        this.educatorRepository = educatorRepository;
    }

    @GetMapping
    public List<Educator> getEducators(){
        return educatorRepository.findAll();
    }

    @GetMapping("{educatorId}")
    public Educator getEducator(@PathVariable("educatorId") Educator educator){
        return educatorRepository.getById(educator.getEducatorId());
    }

    @PostMapping
    @SuppressWarnings("S4684")
    //TODO: Replace entity to DTO
    public Educator createEducators(@RequestBody Educator newEducator){
        return educatorRepository.save(newEducator);
    }
}
