package com.artist.model;

public class Chanson {
	
	private int id;
	private String trakName;
	private Album album;
	public Chanson(int id, String trakName, Album album) {
		super();
		this.id = id;
		this.trakName = trakName;
		this.album = album;
	}
	public Chanson() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTrakName() {
		return trakName;
	}
	public void setTrakName(String trakName) {
		this.trakName = trakName;
	}
	public Album getAlbum() {
		return album;
	}
	public void setAlbum(Album album) {
		this.album = album;
	}
	
	
	
}
