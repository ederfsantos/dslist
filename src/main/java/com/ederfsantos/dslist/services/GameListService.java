package com.ederfsantos.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ederfsantos.dslist.dto.GameDTO;
import com.ederfsantos.dslist.dto.GameListDTO;
import com.ederfsantos.dslist.dto.GameMinDTO;
import com.ederfsantos.dslist.entities.Game;
import com.ederfsantos.dslist.entities.GameList;
import com.ederfsantos.dslist.repositories.GameListRepository;



@Service
public class GameListService {
	@Autowired
	private GameListRepository gameListRepository;
	
	@Transactional(readOnly = true)//nao vou bloquear para escrita o banco de dados
	public List<GameListDTO> findAll(){
		return gameListRepository.findAll().stream().map(GameListDTO::new).toList();
		// ou da forma abaixo
		//return gameRepository.findAll().stream().map(x-> new GameMinDTO(x)).toList();
	}
	
	@Transactional(readOnly = true)
	public GameListDTO findById( Long id) {
		GameList result = gameListRepository.findById(id).get();
		return new GameListDTO(result);
	}

}
