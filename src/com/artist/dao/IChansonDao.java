package com.artist.dao;

import com.artist.model.Chanson;

public interface IChansonDao {
	
	public void addChanson(Chanson chanson);
	public Chanson findChansonByName(String nameTrack);
	public boolean deleteChanson(Chanson chanson);
}
