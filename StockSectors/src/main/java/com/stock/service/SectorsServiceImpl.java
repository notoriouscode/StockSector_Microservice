package com.stock.service;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.stock.entity.Sectors;
import com.stock.repo.SectorsRepo;

@Service
public class SectorsServiceImpl implements SectorsService {

	@Autowired
	SectorsRepo sectorsRepo;
	
	@Override
	public List<Sectors> getAllSectors() {
		List<Sectors> sectorsList = sectorsRepo.findAll();
		return sectorsList;
	}

	@Override
	public Sectors getSectorsById(int sectorId) {
		Optional<Sectors> sector = sectorsRepo.findById(sectorId);
		if(sector.isPresent()) {
			return sector.get();
		}
		return null;
	}

	@Override
	public Sectors createNewSectors(Sectors sectors) {
		Sectors sector = sectorsRepo.save(sectors);
		return sector;
	}

	@Override
	public boolean deleteSectorById(int sectorId) {
		if(sectorsRepo.existsById(sectorId)) {
			sectorsRepo.deleteById(sectorId);
			return true;
		}
		return false;
	}

	@Override
	public Sectors updateSectorById(int sectorId, Sectors sectors) {
		Optional<Sectors> opSectorEntity = sectorsRepo.findById(sectorId);
		if(opSectorEntity.isPresent()) {
			Sectors mSectors = opSectorEntity.get();
			mSectors.setSector_price(sectors.getSector_price());
			sectorsRepo.save(mSectors);
			return mSectors;
		}
		return null;
	}
}

//
//http://localhost:4000/mymarketplace/sector
//{"sector_name":"NIFITY_50","sector_price":"5000","opening_price":"6000",
//"closing_price":"7000","sector_current_volumn":"154000000"}