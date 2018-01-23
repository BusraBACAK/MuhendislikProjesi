package com.busrabacak.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cars")
public class Cars {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@Column(length=20)
	private String marka;
	@Column(length=20)
	private String model;
	@Column(length=4)
	private String yil;
	@Column(length=25)
	private String motorGucu;
	@Column(length=20)
	private String km;
	@Column(length=20)
	private String durum;
	@Column(length=255)
	private String resim;
	@Column(length=25)
	private String fiyat;

	
	public String getFiyat() {
		return fiyat;
	}

	public void setFiyat(String fiyat) {
		this.fiyat = fiyat;
	}

	public String getResim() {
		return resim;
	}

	public void setResim(String resim) {
		this.resim = resim;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getYil() {
		return yil;
	}

	public void setYil(String yil) {
		this.yil = yil;
	}

	public String getMotorGucu() {
		return motorGucu;
	}

	public void setMotorGucu(String motorGucu) {
		this.motorGucu = motorGucu;
	}

	public String getKm() {
		return km;
	}

	public void setKm(String km) {
		this.km = km;
	}

	public String getDurum() {
		return durum;
	}

	public void setDurum(String durum) {
		this.durum = durum;
	}

}
