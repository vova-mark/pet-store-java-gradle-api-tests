package com.epam.ai.client;

import com.epam.ai.model.Pet;
import retrofit2.Call;
import retrofit2.http.*;
import java.util.List;

public interface PetApiClient {
    @POST("pet")
    Call<Pet> createPet(@Body Pet pet);

    @PUT("pet")
    Call<Pet> updatePet(@Body Pet pet);

    @GET("pet/{petId}")
    Call<Pet> getPet(@Path("petId") Long petId);

    @DELETE("pet/{petId}")
    Call<Void> deletePet(@Path("petId") Long petId);

    @GET("pet/findByStatus")
    Call<List<Pet>> findByStatus(@Query("status") String status);

    @GET("pet/findByTags")
    Call<List<Pet>> findByTags(@Query("tags") List<String> tags);
}
