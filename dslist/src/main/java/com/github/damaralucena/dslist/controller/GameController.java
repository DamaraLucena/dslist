package com.github.damaralucena.dslist.controller;


import com.github.damaralucena.dslist.dto.GameDTO;
import com.github.damaralucena.dslist.dto.GameMinDTO;
import com.github.damaralucena.dslist.entities.Game;
import com.github.damaralucena.dslist.repository.GameRepository;
import com.github.damaralucena.dslist.services.GameService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/games")
public class GameController {

  @Autowired
  private GameRepository gameRepository;

  @Autowired
  private GameService gameService;

  @GetMapping(value = "/{id}")
  public GameDTO findById(@PathVariable Long id){
    GameDTO result = gameService.findById(id);
    return result;
  }

  @GetMapping
  public List<GameMinDTO> findAll(){
    List<GameMinDTO> result = gameService.findAll();
    return  result;
  }

}
