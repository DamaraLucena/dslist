package com.github.damaralucena.dslist.services;

import com.github.damaralucena.dslist.dto.GameListDTO;
import com.github.damaralucena.dslist.entities.Game;
import com.github.damaralucena.dslist.entities.GameList;
import com.github.damaralucena.dslist.repository.GameListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {
  @Autowired
  public GameListRepository gameListRepository;

  @Transactional(readOnly = true)
  public GameListDTO findById(Long id){
    GameList result = gameListRepository.findById(id).get();
    return new GameListDTO(result);
  }

  @Transactional(readOnly = true)
  public List<GameListDTO> findAll(){
    List<GameList> result = gameListRepository.findAll();
    return result.stream().map(x -> new GameListDTO(x)).toList();
  }

}
