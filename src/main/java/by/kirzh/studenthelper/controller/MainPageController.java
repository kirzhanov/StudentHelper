package by.kirzh.studenthelper.controller;

import by.kirzh.studenthelper.domain.News;
import by.kirzh.studenthelper.repository.NewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MainPageController {

    private final NewsRepository newsRepository;

    @Autowired
    public MainPageController(NewsRepository newsRepository) {
        this.newsRepository = newsRepository;
    }

    @GetMapping
    public List<News> getMainPage() {
        return newsRepository.findAll();
    }
}
