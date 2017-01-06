package com.artist.controller;

import com.artist.model.Artiste;

public interface IArtisteController {
	public void createArtiste(Artiste artiste);
	public Artiste finArtiste(String name);
	public boolean deleteArtiste(Artiste artiste);
}
