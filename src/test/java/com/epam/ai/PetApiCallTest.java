package com.epam.ai;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class PetApiCallTest {
    @Test
    void shouldCallPetApiWithBaseUrl() {
        com.epam.ai.service.PetService service = new com.epam.ai.service.PetService();
        java.util.List<com.epam.ai.model.Pet> pets = service.findByStatus("available");
        assertThat(pets).isNotNull();
        assertThat(pets.size()).isGreaterThan(0);
    }
}
