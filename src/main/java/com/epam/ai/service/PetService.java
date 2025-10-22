package com.epam.ai.service;

import com.epam.ai.model.Pet;
import java.util.List;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;

public class PetService {
    private final com.epam.ai.client.PetApiClient api;

    public PetService() {
        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        logging.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient client = new OkHttpClient.Builder()
            .addInterceptor(logging)
            .build();
        retrofit2.Retrofit retrofit = new retrofit2.Retrofit.Builder()
            .baseUrl("https://petstore.swagger.io/v2/")
            .addConverterFactory(retrofit2.converter.jackson.JacksonConverterFactory.create())
            .client(client)
            .build();
        this.api = retrofit.create(com.epam.ai.client.PetApiClient.class);
    }

    public Pet createPet(Pet pet) {
        try {
            retrofit2.Response<Pet> response = api.createPet(pet).execute();
            if (response.isSuccessful()) return response.body();
            throw new RuntimeException("API error: " + response.code());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public Pet updatePet(Pet pet) {
        try {
            retrofit2.Response<Pet> response = api.updatePet(pet).execute();
            if (response.isSuccessful()) return response.body();
            throw new RuntimeException("API error: " + response.code());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public Pet getPet(Long id) {
        try {
            retrofit2.Response<Pet> response = api.getPet(id).execute();
            if (response.isSuccessful()) return response.body();
            throw new RuntimeException("API error: " + response.code());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void deletePet(Long id) {
        try {
            retrofit2.Response<Void> response = api.deletePet(id).execute();
            if (!response.isSuccessful()) throw new RuntimeException("API error: " + response.code());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public List<Pet> findByStatus(String status) {
        try {
            retrofit2.Response<List<Pet>> response = api.findByStatus(status).execute();
            if (response.isSuccessful()) return response.body();
            throw new RuntimeException("API error: " + response.code());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public List<Pet> findByTags(List<String> tags) {
        try {
            retrofit2.Response<List<Pet>> response = api.findByTags(tags).execute();
            if (response.isSuccessful()) return response.body();
            throw new RuntimeException("API error: " + response.code());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
