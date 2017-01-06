package com.artist.dao;

import com.artist.model.Album;

public interface IAlbumDao {
	
	public void addAlbum(Album album);
	public Album findAlbumByName(String albumName);
	public boolean deleteAlbum(Album album);

}
