package com.HospitalManagement.HospitalApi.repository;

import com.HospitalManagement.HospitalApi.model.DoctorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<DoctorEntity, Long> {
}
