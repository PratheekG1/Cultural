package com.cg.festival.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cg.festival.Entity.Festival;
import com.cg.festival.Repository.FestivalRepository;
import com.cg.festival.Exception.*;

@Component
public class FestivlalServiceImpl implements FestivalService{

	@Autowired
	private FestivalRepository repo;

	@Override
	public Festival addFestival(Festival festival) {
		if(festival.getFest_name().isEmpty()) {
			throw new EmptyInputException("Fest name is Empty");
		}
		else
			return repo.saveAndFlush(festival);
	}

	public Festival getFestivalDetailsById(Long fest_id) {
		return repo.findById(fest_id).orElseThrow();
	}

	@Override
	public List<Festival> getAllFestival() {
		return repo.findAll();
	}

	@Override
	public void deleteFestival(Long fest_id) {
		repo.deleteById(fest_id);
	}

	@Override
	public Festival updateFestival(Festival festival) {
		
		Long festId=festival.getFest_id();
		Festival updateFest=repo.findById(festId).get();
		updateFest.setFest_cost(festival.getFest_cost());
		updateFest.setFest_date(festival.getFest_date());
		updateFest.setFest_venue(festival.getFest_venue());
		return repo.save(updateFest);
	}
}
