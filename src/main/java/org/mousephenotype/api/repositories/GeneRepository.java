package org.mousephenotype.api.repositories;

import org.bson.types.ObjectId;
import org.mousephenotype.api.models.Gene;
import org.mousephenotype.api.models.GeneBundle;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.ArrayList;
import java.util.List;

public interface GeneRepository extends PagingAndSortingRepository<Gene, String> {
    Page<Gene> findAllBySignificantMpTermIdsContains(List<String> mpTermIds, Pageable pageable);
    Gene getGeneByMgiAccessionId(String mgiAccessionId);
    Page<Gene> findAllByMgiAccessionIdIn(List<String> mgiAccessionIds, Pageable pageable);
}
