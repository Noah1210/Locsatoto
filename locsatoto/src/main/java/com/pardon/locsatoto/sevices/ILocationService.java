package com.pardon.locsatoto.sevices;

import java.util.List;
import java.util.Optional;

import com.pardon.locsatoto.entities.Inventaire;
import com.pardon.locsatoto.entities.InventaireEntree;
import com.pardon.locsatoto.entities.Location;

public interface ILocationService  {
	
	public List<Location> locsEnCour() ;
	
	public Location locById(String code);
	
	public void saveLoc(Location loc);

}
