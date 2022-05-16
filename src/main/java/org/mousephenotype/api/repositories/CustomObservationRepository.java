package org.mousephenotype.api.repositories;

import org.mousephenotype.api.models.Observation;

import java.util.List;

public interface CustomObservationRepository {
    List<Observation> getAllByParameterStableId(String parameterStableId);
}
