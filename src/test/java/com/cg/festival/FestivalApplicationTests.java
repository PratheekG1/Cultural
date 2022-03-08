package com.cg.festival;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cg.festival.Entity.Festival;
import com.cg.festival.Repository.FestivalRepository;



@SpringBootTest
class FestivalApplicationTests {

	@Autowired
	FestivalRepository festivalRepository;
/* 	@Test
	@Order(1)
	void testAddfestival() {
		Festival festival=new Festival();
		festival.setFest_cost(500.0f);
		festival.setFest_name("Diwali");
		festival.setFest_id(3L);
		festival.setFest_description("Festival of lights");
		festivalRepository.save(festival);
		assertNotNull(festivalRepository.findById(3L).get());
	} */
/* 	@Test
	@Order(2)
	void testUpdate() {
		Festival festival=festivalRepository.findById((long) 3).get();
		festival.setFest_cost(600.0f);
		festival.setFest_description("Festival of lights and happiness");
		festivalRepository.save(festival);
		assertNotEquals("Spicy and crunchy",festivalRepository.findById(3L).get().getFest_description());
	}  */
//	@Test
//	@Order(3)
//	void testDelete() {
//		festivalRepository.deleteById(3L);
//		assertThat(festivalRepository.existsById(3L)).isFalse();
//	}
	
/* 	@SuppressWarnings("unchecked")
	@Test
	@Order(4)
	void testReadAll() {
		List list=festivalRepository.findAll();
		assertThat(list).size().isPositive();
	}
	@Test
	@Order(5)
	void testRead() {
		Festival festival=festivalRepository.findById((long) 3).get();
		assertEquals("Diwali",festival.getFest_name());
	} */
}


