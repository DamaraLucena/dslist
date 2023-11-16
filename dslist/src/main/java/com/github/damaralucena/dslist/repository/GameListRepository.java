package com.github.damaralucena.dslist.repository;

import com.github.damaralucena.dslist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameListRepository extends JpaRepository<GameList, Long> {

}
