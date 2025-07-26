package com.arturbik.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Image {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String path;
	private Long telegramImageId;
}
