package com.pardon.locsatoto.sevices;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pardon.locsatoto.entities.Inventaire;
import com.pardon.locsatoto.entities.InventaireEntree;
import com.pardon.locsatoto.entities.Location;
import com.pardon.locsatoto.repository.LocationRepository;

@Service
public class LocationServiceImpl implements ILocationService{
	@Autowired LocationRepository locationRepository;

	@Override
	public List<Location> locsEnCour() {
		return locationRepository.findAll();
	}

	@Override
	public Location locById(String code) {
		Optional<Location> opL = locationRepository.findById(code);
		if(opL.isPresent()) {
			return opL.get();
		}
		return null;

	}

	@Override
	public void saveLoc(Location loc) {
		locationRepository.save(loc);
		
	}
	

}
