package com.artist.dao;

import com.artist.model.Artiste;

public interface IArtisteDao {
	
	public void createArtiste(Artiste artiste);
	public Artiste finArtiste(String name);
	public boolean deleteArtiste(Artiste artiste);
}
