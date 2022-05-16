package org.mousephenotype.api.repositories;

import org.mousephenotype.api.models.Observation;

import java.util.List;

public class CustomObservationRepositoryImpl implements CustomObservationRepository{
    @Override
    public List<Observation> getAllByParameterStableId(String parameterStableId) {
        return null;
    }
}
