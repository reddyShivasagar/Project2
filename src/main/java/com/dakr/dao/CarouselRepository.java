package com.dakr.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dakr.model.Carousel;

public interface CarouselRepository extends JpaRepository<Carousel, Long> {

}
