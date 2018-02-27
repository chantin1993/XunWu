package com.mine.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.mine.entity.HousePicture;

/**
 * Created by zjh.
 */
public interface HousePictureRepository extends CrudRepository<HousePicture, Long> {
    List<HousePicture> findAllByHouseId(Long id);
}
