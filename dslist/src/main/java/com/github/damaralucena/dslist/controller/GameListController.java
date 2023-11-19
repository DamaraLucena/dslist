package com.github.damaralucena.dslist.controller;


import com.github.damaralucena.dslist.dto.GameListDTO;
import com.github.damaralucena.dslist.dto.GameMinDTO;
import com.github.damaralucena.dslist.dto.ReplacementDTO;
import com.github.damaralucena.dslist.services.GameListService;
import com.github.damaralucena.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

  @Autowired
  private GameService gameService;
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

  @GetMapping(value = "/{listId}/games")
  public List<GameMinDTO> findByList(@PathVariable Long listId){
    List<GameMinDTO> result = gameService.findByList(listId);
    return result;
  }

  @PostMapping(value = "/{listId}/replacement")
  public void move(@PathVariable Long listId, @RequestBody ReplacementDTO body){
    gameListService.move(listId, body.getSourceIndex(), body.getDestinationIndex());
  }



}
