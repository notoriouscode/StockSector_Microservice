package com.stock.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.stock.entity.Sectors;
import com.stock.service.SectorsService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/mymarketplace") 
public class SectorController {

	@Autowired
	SectorsService sectorService;

		@PostMapping(value = "/sector", consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
		public ResponseEntity<Sectors> createNewSector(@RequestBody Sectors sectors) { 
			Sectors newSector = sectorService.createNewSectors(sectors);
			return new ResponseEntity<Sectors>(newSector, HttpStatus.OK);
		}
		
		@GetMapping(value = "/sector", produces = MediaType.APPLICATION_JSON_VALUE)
		public List<Sectors> getAllSectors() {
			return sectorService.getAllSectors();
		}
		
		//http://localhost:4000/mymarketplace/stock/1
		@GetMapping(value = "/sector/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
		public Sectors getStockByIdBy(@PathVariable("id") int sectorId) {
			return sectorService.getSectorsById(sectorId);
		}
		
		@DeleteMapping(value="/sector/{id}")
		public ResponseEntity<Boolean> deleteSectorById(@PathVariable("id") int sectorId) {
			return new ResponseEntity<Boolean>(sectorService.deleteSectorById(sectorId), HttpStatus.OK);
		}

		@PutMapping(value="/sector/{id}", consumes=MediaType.APPLICATION_JSON_VALUE, 
				produces=MediaType.APPLICATION_JSON_VALUE)
		public ResponseEntity<Sectors> updateSectorById(@PathVariable("id") int sectorId, @RequestBody Sectors sector) {
			return new ResponseEntity<Sectors>(sectorService.updateSectorById(sectorId, sector), HttpStatus.OK);
		}
}
