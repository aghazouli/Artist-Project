package com.artist.controller;

import com.artist.model.Album;

public interface IAlbumController {
	public void addAlbum(Album album);
	public Album findAlbumByName(String albumName);
	public boolean deleteAlbum(Album album);
}
