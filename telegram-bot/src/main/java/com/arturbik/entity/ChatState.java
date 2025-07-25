package com.arturbik.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ChatState {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String state;
}
