package com.plantplaces.dto;

public class SpecimenDTO {
	private String latitude;
	private String longitutde;
	private int specimenId;
	private String description;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitutde() {
		return longitutde;
	}

	public void setLongitutde(String longitutde) {
		this.longitutde = longitutde;
	}

	public int getSpecimenId() {
		return specimenId;
	}

	public void setSpecimenId(int specimenId) {
		this.specimenId = specimenId;
	}
}
