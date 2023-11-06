package com.test.api.marvelchallenge.persistence.integration.marvel.dto;

public record CharacterDto(
        Long id,
        String name,
        String description,
        String modified,
        String resourceURI
) {
    public record CharacterInfoDto( String imagePath, String description){

    }
}
