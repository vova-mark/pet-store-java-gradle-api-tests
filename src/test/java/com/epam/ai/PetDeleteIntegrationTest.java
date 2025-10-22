package com.epam.ai;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class PetDeleteIntegrationTest {
    @Test
    void shouldDeletePetViaApi() {
        com.epam.ai.service.PetService service = new com.epam.ai.service.PetService();
        // Create a pet to ensure it exists
        com.epam.ai.model.Pet pet = new com.epam.ai.model.Pet();
        pet.setName("DeleteMe");
        pet.setStatus("available");
        com.epam.ai.model.Category category = new com.epam.ai.model.Category();
        category.setId(999L);
        category.setName("TestCategory");
        pet.setCategory(category);
        pet.setPhotoUrls(new java.util.ArrayList<>());
        pet.setTags(new java.util.ArrayList<>());
        com.epam.ai.model.Pet created = service.createPet(pet);
        // Now delete the created pet
        assertThatCode(() -> service.deletePet(created.getId())).doesNotThrowAnyException();
    }
}
