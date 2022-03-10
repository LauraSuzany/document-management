package com.laura.backenddev.dto;

import java.io.Serializable;

import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//Passar todas as @anotções que não diz respieto a tabela dto
	
	@NotBlank
	private String nome;

	private String cpf;
	
	}

