package org.mousephenotype.api.models;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(
        name = "metadata",
        types = { GeneBundle.class })
public interface GeneMetadata {
    ObjectId getId();
    String getMarkerName();
    String getMarkerSymbol();
    List<String> getMarkerSynonym();
    String getMgiAccessionId();
}
