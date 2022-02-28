package com.lecture.carrental.repository;

import com.lecture.carrental.domain.Car;
import com.lecture.carrental.dto.CarDTO;
import com.lecture.carrental.exception.ResourceNotFoundException;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Repository
@Transactional
public interface CarRepository extends JpaRepository<Car, Long> {

    @Query("SELECT new com.lecture.carrental.dto.CarDTO(c) FROM Car c")
    public List<CarDTO> findAllCar();

//    @Query("SELECT new com.lecture.carrental.dto.CarDTO(c) FROM Car c WHERE car.id = ?id") aşağıdakin abstract method bu query'yi yazıyor arka planda JPA
    Optional<CarDTO> findByIdOrderById (Long id) throws ResourceNotFoundException;

}
