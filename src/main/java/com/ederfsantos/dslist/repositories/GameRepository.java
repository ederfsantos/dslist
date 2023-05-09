package com.ederfsantos.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ederfsantos.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game,Long> {

}
