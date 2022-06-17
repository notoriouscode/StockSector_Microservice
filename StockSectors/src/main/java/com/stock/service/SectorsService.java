package com.stock.service;

import java.util.List;
import com.stock.entity.Sectors;

public interface SectorsService {
	List<Sectors> getAllSectors();
	Sectors getSectorsById(int sectorId);
	Sectors createNewSectors(Sectors sector);
	boolean deleteSectorById(int sectorId);
	Sectors updateSectorById(int sectorId, Sectors sectors);
}
