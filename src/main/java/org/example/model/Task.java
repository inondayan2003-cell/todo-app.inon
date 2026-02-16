package org.example.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tasks")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String content;
    private String priority;
    private boolean done;

    // --- הנה המתודה שהייתה חסרה לך ---
    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    // שאר ה-Setters וה-Getters (חשוב שיהיו כולם)
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getContent() { return content; }
    public void setContent(String content) { this.content = content; }

    public String getPriority() { return priority; }
    public void setPriority(String priority) { this.priority = priority; }

    public boolean isDone() { return done; }
    public void setDone(boolean done) { this.done = done; }
}