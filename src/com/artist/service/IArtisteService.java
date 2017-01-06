package com.artist.service;

import com.artist.model.Artiste;

public interface IArtisteService {
	
	public void createArtiste(Artiste artiste);
	public Artiste finArtiste(String name);
	public boolean deleteArtiste(Artiste artiste);
}
