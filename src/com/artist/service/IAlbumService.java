package com.artist.service;

import com.artist.model.Album;

public interface IAlbumService {
	
	public void addAlbum(Album album);
	public Album findAlbumByName(String albumName);
	public boolean deleteAlbum(Album album);
}
