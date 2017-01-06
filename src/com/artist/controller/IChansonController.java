package com.artist.controller;

import com.artist.model.Chanson;

public interface IChansonController {
	
	public void addChanson(Chanson chanson);
	public Chanson findChansonByName(String nameTrack);
	public boolean deleteChanson(Chanson chanson);
}
