package com.ederfsantos.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ederfsantos.dslist.dto.GameMinDTO;
import com.ederfsantos.dslist.repositories.GameRepository;

@Service
public class GameService {
	@Autowired
	private GameRepository gameRepository;
	
	public List<GameMinDTO> findAll(){
		return gameRepository.findAll().stream().map(GameMinDTO::new).toList();
		// ou da forma abaixo
		//return gameRepository.findAll().stream().map(x-> new GameMinDTO(x)).toList();
	}

}
