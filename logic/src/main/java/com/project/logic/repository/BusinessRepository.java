package com.project.logic.repository;

import com.project.logic.domain.Business;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author edward.reyes
 */

public interface BusinessRepository extends JpaRepository<Business,Long> {
    List<Business> findAllByIdIn(List<Long> ids);
    List<Business> findAllByNameStartsWith(String name);
}
