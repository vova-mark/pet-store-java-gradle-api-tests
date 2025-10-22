package com.epam.ai;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class PetCreateIntegrationTest {
    @Test
    void shouldCreatePetViaApi() {
        com.epam.ai.service.PetService service = new com.epam.ai.service.PetService();
        com.epam.ai.model.Pet pet = new com.epam.ai.model.Pet();
        pet.setName("TestPet");
        pet.setStatus("available");
        com.epam.ai.model.Category category = new com.epam.ai.model.Category();
        category.setId(1L);
        category.setName("Dogs");
        pet.setCategory(category);
        java.util.List<com.epam.ai.model.Tag> tags = new java.util.ArrayList<>();
        com.epam.ai.model.Tag tag = new com.epam.ai.model.Tag();
        tag.setId(1L);
        tag.setName("friendly");
        tags.add(tag);
        pet.setTags(tags);
        pet.setPhotoUrls(new java.util.ArrayList<>());

        com.epam.ai.model.Pet created = service.createPet(pet);
        assertThat(created).isNotNull();
        assertThat(created.getName()).isEqualTo("TestPet");
        assertThat(created.getStatus()).isEqualTo("available");
    }
}
