package com.plantplaces.service;

import org.springframework.stereotype.Component;

import com.plantplaces.dto.SpecimenDTO;

@Component
public class SpecimenServiceStub implements ISpecimenService {
	@Override
	public SpecimenDTO fetchById (int id) {
		SpecimenDTO specimenDTO = new SpecimenDTO();
		specimenDTO.setSpecimenId(43);
		specimenDTO.setLatitude("39.47");
		specimenDTO.setLongitude("-84.51");
		specimenDTO.setDescription("Some Eastern Redbud plant");
		return specimenDTO;
	}
	@Override
	public void  save(SpecimenDTO specimenDTO) {
		
	}
}
