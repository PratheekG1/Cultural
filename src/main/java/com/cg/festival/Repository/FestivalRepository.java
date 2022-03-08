package com.cg.festival.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.festival.Entity.Festival;

@Repository
public interface FestivalRepository extends JpaRepository<Festival, Long>{

}
