package com.ederfsantos.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ederfsantos.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList,Long> {

}
