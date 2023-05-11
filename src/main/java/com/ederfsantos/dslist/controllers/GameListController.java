package com.ederfsantos.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ederfsantos.dslist.dto.GameDTO;
import com.ederfsantos.dslist.dto.GameListDTO;
import com.ederfsantos.dslist.dto.GameMinDTO;
import com.ederfsantos.dslist.services.GameListService;
import com.ederfsantos.dslist.services.GameService;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

	@Autowired
	private GameListService gameListService;
	
	@GetMapping
	public List<GameListDTO> findAll(){
		
		return gameListService.findAll();
	}
	
}
