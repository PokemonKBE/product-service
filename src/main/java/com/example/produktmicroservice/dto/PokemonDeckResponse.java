package com.example.produktmicroservice.dto;

import com.example.produktmicroservice.entity.PokemonCard;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class PokemonDeckResponse {
    private int id;
    private String name;
    private List<PokemonCardResponse> pokemonCards;
    private BigDecimal totalPrice;
}