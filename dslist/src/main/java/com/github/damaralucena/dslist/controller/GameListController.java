package com.github.damaralucena.dslist.controller;


import com.github.damaralucena.dslist.dto.GameListDTO;
import com.github.damaralucena.dslist.services.GameListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {
  @Autowired
  private GameListService gameListService;

  @GetMapping(value = "/{id}")
  public GameListDTO findById(@PathVariable Long id){
    GameListDTO result = gameListService.findById(id);
    return result;

  }

  @GetMapping
  public List<GameListDTO> findAll(){
    List<GameListDTO> result = gameListService.findAll();
    return result;

  }

}
