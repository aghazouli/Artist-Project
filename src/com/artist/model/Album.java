package com.artist.model;

import java.util.List;

public class Album {
	
	private int id;
	private String albumName;
	private List<Chanson> chansonList;
	private Artiste artiste;
	
	
	public Album() {
		super();
	}


	public Album(int id, String albumName, List<Chanson> chansonList,
			Artiste artiste) {
		super();
		this.id = id;
		this.albumName = albumName;
		this.chansonList = chansonList;
		this.artiste = artiste;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getAlbumName() {
		return albumName;
	}


	public void setAlbumName(String albumName) {
		this.albumName = albumName;
	}


	public List<Chanson> getChansonList() {
		return chansonList;
	}


	public void setChansonList(List<Chanson> chansonList) {
		this.chansonList = chansonList;
	}


	public Artiste getArtiste() {
		return artiste;
	}


	public void setArtiste(Artiste artiste) {
		this.artiste = artiste;
	}
	
	
}
