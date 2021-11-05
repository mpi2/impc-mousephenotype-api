package org.mousephenotype.api.repositories;

import org.bson.types.ObjectId;
import org.mousephenotype.api.models.Gene;
import org.mousephenotype.api.models.GeneBundle;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.ArrayList;

public interface GeneRepository extends MongoRepository<Gene, String> {
    ArrayList<Gene> findAllBySignificantMpTermIdsContains(String mpTermId);
}
