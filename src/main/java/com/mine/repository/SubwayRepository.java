package com.mine.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.mine.entity.Subway;

/**
 * Created by zjh.
 */
public interface SubwayRepository extends CrudRepository<Subway, Long>{
    List<Subway> findAllByCityEnName(String cityEnName);
}
