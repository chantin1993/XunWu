package com.mine.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.mine.entity.HouseTag;

/**
 * Created by zjh.
 */
public interface HouseTagRepository extends CrudRepository<HouseTag, Long> {
    HouseTag findByNameAndHouseId(String name, Long houseId);

    List<HouseTag> findAllByHouseId(Long id);

    List<HouseTag> findAllByHouseIdIn(List<Long> houseIds);
}
