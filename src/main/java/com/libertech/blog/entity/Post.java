package com.libertech.blog.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name="posts", uniqueConstraints={@UniqueConstraint(columnNames = {"title"}) })
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "title", nullable = false, length = 155)
    private String title;
    @Column(name = "description", length = 255)
    private String description;
    @Column(name = "content", length = 255)

    private  String content;
}
