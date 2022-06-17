package com.stock.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Sectors")
public class Sectors {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String sector_name;
	private String sector_price;
	private String opening_price;
	private String closing_price;
	private String sector_current_volumn;
	public Sectors() {}
	public Sectors(int id, String sector_name, String sector_price, String opening_price, String closing_price,
			String sector_current_volumn) {
		super();
		this.id = id;
		this.sector_name = sector_name;
		this.sector_price = sector_price;
		this.opening_price = opening_price;
		this.closing_price = closing_price;
		this.sector_current_volumn = sector_current_volumn;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSector_name() {
		return sector_name;
	}
	public void setSector_name(String sector_name) {
		this.sector_name = sector_name;
	}
	public String getSector_price() {
		return sector_price;
	}
	public void setSector_price(String sector_price) {
		this.sector_price = sector_price;
	}
	public String getOpening_price() {
		return opening_price;
	}
	public void setOpening_price(String opening_price) {
		this.opening_price = opening_price;
	}
	public String getClosing_price() {
		return closing_price;
	}
	public void setClosing_price(String closing_price) {
		this.closing_price = closing_price;
	}
	public String getSector_current_volumn() {
		return sector_current_volumn;
	}
	public void setSector_current_volumn(String sector_current_volumn) {
		this.sector_current_volumn = sector_current_volumn;
	}
	@Override
	public String toString() {
		return "Sectors [id=" + id + ", sector_name=" + sector_name + ", sector_price=" + sector_price
				+ ", opening_price=" + opening_price + ", closing_price=" + closing_price + ", sector_current_volumn="
				+ sector_current_volumn + "]";
	}
}
