package com.epam.ai;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class PetUpdateIntegrationTest {
    @Test
    void shouldUpdatePetViaApi() {
        com.epam.ai.service.PetService service = new com.epam.ai.service.PetService();
        // First, create a pet to update
        com.epam.ai.model.Pet pet = new com.epam.ai.model.Pet();
        pet.setName("UpdateMe");
        pet.setStatus("available");
        com.epam.ai.model.Category category = new com.epam.ai.model.Category();
        category.setId(2L);
        category.setName("Cats");
        pet.setCategory(category);
        pet.setTags(new java.util.ArrayList<>());
        pet.setPhotoUrls(new java.util.ArrayList<>());
        com.epam.ai.model.Pet created = service.createPet(pet);

        // Update the pet
        created.setStatus("sold");
        com.epam.ai.model.Pet updated = service.updatePet(created);
        assertThat(updated).isNotNull();
        assertThat(updated.getStatus()).isEqualTo("sold");
    }
}
