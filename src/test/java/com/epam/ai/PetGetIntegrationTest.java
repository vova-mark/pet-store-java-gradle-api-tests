package com.epam.ai;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class PetGetIntegrationTest {
    @Test
    void shouldGetPetViaApi() {
        com.epam.ai.service.PetService service = new com.epam.ai.service.PetService();
        com.epam.ai.model.Pet pet = service.getPet(1L);
        assertThat(pet).isNotNull();
        assertThat(pet.getId()).isEqualTo(1L);
    }
}
