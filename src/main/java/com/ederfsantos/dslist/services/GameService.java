package com.ederfsantos.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.ederfsantos.dslist.dto.GameDTO;
import com.ederfsantos.dslist.dto.GameMinDTO;
import com.ederfsantos.dslist.entities.Game;
import com.ederfsantos.dslist.repositories.GameRepository;



@Service
public class GameService {
	@Autowired
	private GameRepository gameRepository;
	
	@Transactional(readOnly = true)//nao vou bloquear para escrita o banco de dados
	public List<GameMinDTO> findAll(){
		return gameRepository.findAll().stream().map(GameMinDTO::new).toList();
		// ou da forma abaixo
		//return gameRepository.findAll().stream().map(x-> new GameMinDTO(x)).toList();
	}
	
	@Transactional(readOnly = true)
	public GameDTO findById( Long id) {
		Game result = gameRepository.findById(id).get();
		return new GameDTO(result);
	}

}
