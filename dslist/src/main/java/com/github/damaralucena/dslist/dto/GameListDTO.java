package com.github.damaralucena.dslist.dto;

import com.github.damaralucena.dslist.entities.GameList;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class GameListDTO {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String name;

  public GameListDTO(){
  }

  public GameListDTO(GameList entity) {
    id = entity.getId();
    name = entity.getName();
  }

  public Long getId() {
    return id;
  }

  public String getName() {
    return name;
  }


}
