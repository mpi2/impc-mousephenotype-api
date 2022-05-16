package org.mousephenotype.api.repositories;

import org.mousephenotype.api.models.Observation;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ObservationRepository extends PagingAndSortingRepository<Observation, String> {

    Page<Observation> findAllByParameterStableId(String parameterStableId, Pageable pageable);

}
