package org.mousephenotype.api.repositories;

import org.bson.types.ObjectId;
import org.mousephenotype.api.models.GeneBundle;
import org.mousephenotype.api.models.GeneMetadata;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.ArrayList;
import java.util.List;

@RepositoryRestResource()
public interface GeneBundleRepository extends MongoRepository<GeneBundle, ObjectId> {
    GeneBundle getGeneBundleByMgiAccessionId(String mgiAccessionId);
    ArrayList<GeneBundle> getGeneBundlesByMgiAccessionIdIn(ArrayList<String> mgiAccessionId);
}
