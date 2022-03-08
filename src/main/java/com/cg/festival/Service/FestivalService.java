package com.cg.festival.Service;

import java.util.List;

import com.cg.festival.Entity.Festival;

public interface FestivalService {
	public Festival addFestival(Festival festival);

	public Festival getFestivalDetailsById(Long fest_id);

	public List<Festival> getAllFestival();

	public void deleteFestival(Long fest_id);
	public Festival updateFestival(Festival festival);

}
