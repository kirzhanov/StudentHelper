package by.kirzh.studenthelper.controller;

import by.kirzh.studenthelper.domain.Discipline;
import by.kirzh.studenthelper.repository.DisciplineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("disciplines")
public class DisciplineController {
    private final DisciplineRepository disciplineRepository;

    @Autowired
    public DisciplineController(DisciplineRepository disciplineRepository) {
        this.disciplineRepository = disciplineRepository;
    }

    @GetMapping
    public List<Discipline> getDisciplines() {
        return disciplineRepository.findAll();
    }

    @GetMapping("{disciplineId}")
    public Discipline getDiscipline(@PathVariable("disciplineId") Discipline discipline) {
        return disciplineRepository.getById(discipline.getDisciplineId());
    }

    @PostMapping
    @SuppressWarnings("S4684")
    //TODO: Replace entity to DTO
    public Discipline createDiscipline(@RequestBody Discipline newDiscipline) {
        return disciplineRepository.save(newDiscipline);
    }

    @DeleteMapping("{disciplineId}")
    public void deleteDiscipline(@PathVariable("disciplineId") Discipline discipline){
        disciplineRepository.delete(discipline);
    }
}
