package org.mousephenotype.api.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document(collection = "genes_search")
public class Gene {
    @Id
    private String id;
    private String mgiAccessionId;
    private String markerName;
    private List<String> markerSynonym;
    private List<String> humanGeneSymbol;
    private String assigmentStatus;
    private String assignmentStatus;
    private String crisprAlleleProductionStatus;
    private String esCellProductionStatus;
    private String mouseProductionStatus;
    private String phenotypeStatus;
    private Boolean phenotypingDataAvailable;
    private List<String> nonSignificantPhenotypeSystem;
    private List<String> significantPhenotypeSystem;
    private List<MpTerm> significantMpTerms;
    private List<GeneParameter> testedParameters;
}
