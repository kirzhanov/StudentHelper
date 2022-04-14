package by.kirzh.studenthelper.controller;

import by.kirzh.studenthelper.domain.Educator;
import by.kirzh.studenthelper.repository.EducatorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
