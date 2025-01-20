package com.example.demo.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
//import lombok.Data;

import java.time.LocalDateTime;

@Entity
//@Data
public class Topic {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "El título es obligatorio.")
    private String title;

    @NotBlank(message = "El mensaje es obligatorio.")
    private String message;

    private LocalDateTime createdAt = LocalDateTime.now();

    @NotBlank(message = "El autor es obligatorio.")
    private String author;

    @NotBlank(message = "El curso es obligatorio.")
    private String course;

    private String status = "ACTIVO";

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
