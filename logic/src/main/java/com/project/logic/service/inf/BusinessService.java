package com.project.logic.service.inf;

import com.project.logic.domain.Business;

import java.util.List;

/**
 * @author edward.reyes
 */
public interface BusinessService {
    List<Business> findAllByIds(List<Long> ids);
    List<Business> findAllByNameStartWith(String name);
}
