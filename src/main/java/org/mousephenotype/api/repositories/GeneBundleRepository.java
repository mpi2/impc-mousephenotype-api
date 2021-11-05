package org.mousephenotype.api.repositories;

import org.mousephenotype.api.models.GeneBundle;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.ArrayList;

@RepositoryRestResource()
public interface GeneBundleRepository extends MongoRepository<GeneBundle, String> {
    GeneBundle getGeneBundleByMgiAccessionId(String mgiAccessionId);
    ArrayList<GeneBundle> getGeneBundlesByMgiAccessionIdIn(ArrayList<String> mgiAccessionId);
    ArrayList<GeneBundle> getGeneBundlesBySignificantTopLevelMpTerms(String mpTerm);
}
