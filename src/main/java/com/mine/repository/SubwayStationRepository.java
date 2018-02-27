package com.mine.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.mine.entity.SubwayStation;

/**
 * Created by zjh.
 */
public interface SubwayStationRepository extends CrudRepository<SubwayStation, Long> {
    List<SubwayStation> findAllBySubwayId(Long subwayId);
}
