package by.kirzh.studenthelper.controller;

import by.kirzh.studenthelper.dto.EducatorWithCoursesAndCommentsDto;
import by.kirzh.studenthelper.service.StudentHelperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MainPageController {

    private StudentHelperService service;

    @Autowired
    public MainPageController(StudentHelperService service) {
        this.service = service;
    }

    @GetMapping
    public List<EducatorWithCoursesAndCommentsDto> getMainPage() {
        return service.getAllEducatorsWithCoursesAndComments();
    }
}
