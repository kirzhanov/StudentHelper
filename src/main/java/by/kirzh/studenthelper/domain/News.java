package by.kirzh.studenthelper.domain;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table
public class News {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long newsId;

    private String summary;

    private String content;

    private LocalDateTime createdAt;

    public News() {
        //JPA
    }

    @PrePersist
    void createdAt() {
        this.createdAt = LocalDateTime.now();
    }


    public Long getNewsId() {
        return newsId;
    }

    public void setNewsId(Long newsId) {
        this.newsId = newsId;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
