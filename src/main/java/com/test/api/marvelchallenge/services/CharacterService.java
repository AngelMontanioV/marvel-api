package com.test.api.marvelchallenge.services;

import com.test.api.marvelchallenge.dto.MyPageable;
import com.test.api.marvelchallenge.persistence.integration.marvel.dto.CharacterDto;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface CharacterService {
    List<CharacterDto> findAll(MyPageable pegeable, String name, int[] comics, int[] series);

    CharacterDto.CharacterInfoDto findInfoById(Long characterId);
}
