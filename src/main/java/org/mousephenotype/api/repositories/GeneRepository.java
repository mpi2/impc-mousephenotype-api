package org.mousephenotype.api.repositories;

import org.bson.types.ObjectId;
import org.mousephenotype.api.models.Gene;
import org.mousephenotype.api.models.GeneBundle;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.web.PageableDefault;
import org.springframework.data.web.SortDefault;

import java.util.ArrayList;
import java.util.List;

public interface GeneRepository extends PagingAndSortingRepository<Gene, String> {

    @Query(value = "{}", fields = "{'mgiAccessionId': 1, 'significant_mp_terms.mp_term_id':  1, 'significant_mp_terms.mp_term_name':  1}")
    Page<Gene> significantPhenotypesByGene(@PageableDefault(size = 1000, sort = "_id", direction = Sort.Direction.ASC) Pageable pageable);

    @Query(value = "{}")
    Page<Gene> getAll(@PageableDefault(size = 1000, sort = "_id", direction = Sort.Direction.ASC) Pageable pageable);

    @Query("{'significant_mp_terms.mp_term_id': {$in: ?0}}")
    Page<Gene> findAllBySignificantMpTermIdsContains(List<String> mpTermIds, Pageable pageable);

    @Query("{'significant_mp_terms.top_level_ancestors.mp_term_id': {$in: ?0}}")
    Page<Gene> findAllBySignificantTopLevelMpTermIdsContains(List<String> mpTermIds, Pageable pageable);

    Gene getGeneByMgiAccessionId(String mgiAccessionId);
    Page<Gene> findAllByMgiAccessionIdIn(List<String> mgiAccessionIds, Pageable pageable);

    @Query("{'tested_parameters.parameter_name': {'$regex' : '.*?0.*', '$options' : 'i'}}")
    Page<Gene> findAllByTestedParameter(String parameterName, Pageable pageable);

    @Query("{'tested_parameters.procedure_name': {'$regex' : '.*?0.*', '$options' : 'i'}}")
    Page<Gene> findAllByTestedProcedure(String procedureName, Pageable pageable);

    @Query("{'tested_parameters.parameter_stable_id': '?0'}")
    Page<Gene> findAllByTestedParameterId(String parameterId, Pageable pageable);

    @Query("{'tested_parameters.procedure_stable_id': '?0'}")
    Page<Gene> findAllByTestedProcedureId(String procedureId, Pageable pageable);

    @Query("{'tested_parameters.pipeline_stable_id': '?0'}")
    Page<Gene> findAllByTestedPipelineId(String pipelineId, Pageable pageable);


}
