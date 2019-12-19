package com.project.logic.service.impl;

import com.project.logic.domain.Business;
import com.project.logic.repository.BusinessRepository;
import com.project.logic.service.inf.BusinessService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author edward.reyes
 */
@Slf4j
@RequiredArgsConstructor
@Service
public class DefaultBusinessService implements BusinessService {

    private final BusinessRepository businessRepository;

    @Override
    public List<Business> findAllByIds(List<Long> ids) {
        return businessRepository.findAllByIdIn(ids);
    }

    @Override
    public List<Business> findAllByNameStartWith(String name) {
        return businessRepository.findAllByNameStartsWith(name.toUpperCase());
    }
}
