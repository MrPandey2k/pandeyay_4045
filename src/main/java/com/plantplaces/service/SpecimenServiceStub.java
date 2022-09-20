package com.plantplaces.service;

import org.springframework.stereotype.Component;

import com.plantplaces.dto.SpecimenDTO;

@Component
public class SpecimenServiceStub implements ISpecimenService {
	@Override
	public SpecimenDTO fetchById (int id) {
		SpecimenDTO specimen = new SpecimenDTO();
		specimen.setSpecimenId(43);
		return specimen;
	}
	@Override
	public void  save(SpecimenDTO speciment) {
		
	}
}
