package com.example.acxiomchallenge.repository;

import com.example.acxiomchallenge.controller.AppsController;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface AppsRepository extends JpaRepository<AppsController, Long> {
    Optional<AppsController> findByLicenseId(Long licenseNumer);
}
