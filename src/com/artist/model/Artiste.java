package com.artist.model;

import java.util.List;

public class Artiste {
	
	private String nom;
	private String prenom;
	private Integer age;
	private List<Album> albumList;
	
	public Artiste() {
	}

	public Artiste(String nom, String prenom, Integer age, List<Album> albumList) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.albumList = albumList;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public List<Album> getAlbumList() {
		return albumList;
	}

	public void setAlbumList(List<Album> albumList) {
		this.albumList = albumList;
	}
	
	
	
	

}
