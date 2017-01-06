package com.artist.service;

import com.artist.model.Chanson;

public interface IChansonService {
	
	public void addChanson(Chanson chanson);
	public Chanson findChansonByName(String nameTrack);
	public boolean deleteChanson(Chanson chanson);
}
