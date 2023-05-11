package com.ederfsantos.dslist.dto;

import com.ederfsantos.dslist.entities.GameList;

public class GameListDTO {

	private Long id;
	private String name;

	public GameListDTO() {

	}

	public GameListDTO(GameList game) {
		// BeanUtils.copyProperties(game, this); // se usar esse metodo tem que
		// implementar getter/setter

		this.id = game.getId();
		this.name = game.getName();
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

}
