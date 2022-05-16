package org.mousephenotype.api.repositories;

import org.mousephenotype.api.models.StatisticalResult;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface StatisticalResultRepository extends PagingAndSortingRepository<StatisticalResult, String> {
    Page<StatisticalResult> findAllByMarkerAccessionIdIn(List<String> mgiAccessionIds, Pageable pageable);
}
