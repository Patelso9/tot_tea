package com.company.tot.repository;

import com.company.tot.dto.TeaTypes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TeaTypeRepository extends JpaRepository<TeaTypes, Integer> {

    List<TeaTypes> findByTeaType(String teaType);
    List<TeaTypes> findByCaffeineLevel(String caffeineLevel);
}
