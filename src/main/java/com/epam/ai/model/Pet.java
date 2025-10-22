package com.epam.ai.model;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Pet {
    private Long id;
    private String name;
    private Category category;
    private java.util.List<String> photoUrls;
    private java.util.List<Tag> tags;
    private String status; // available, pending, sold
}
