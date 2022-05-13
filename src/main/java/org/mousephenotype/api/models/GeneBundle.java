package org.mousephenotype.api.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.minidev.json.annotate.JsonIgnore;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document(collection = "gene_bundles")
public class GeneBundle {
    @Id
    private String id;
    private String mgiAccessionId;
    private List<String> alleleName;
    private String analysisDownloadUrl;
    private String assignmentStatus;
    private String centre;
    private String chrName;
    private String chrStrand;
    private String colonyId;
    private String conditionalAlleleProductionStatus;
    private String crisprAlleleProductionStatus;
    private String embryoAnalysisViewName;
    private String embryoAnalysisViewUrl;
    private Boolean embryoDataAvailable;
    private List<String> embryoModalities;
    private String esCellProductionStatus;
    private List<GeneImage> geneImages;
    private List<GenePhenotypeAssociation> genePhenotypeAssociations;
    private List<GeneProduct> geneProducts;
   // private List<GeneStatisticalResult> geneStatisticalResults;
    private Boolean hasAutomatedAnalysis;
    private List<String> humanGeneSymbol;
    private Boolean isIdgGene;
    private Boolean isUmassGene;
    private List<String> latestPhenotypingCentre;
    private List<String> latestProductionCentre;
    private String markerName;
    private String markerSymbol;
    private List<String> markerSynonym;
    private String markerType;
    private String mgi;

    private String mouseProductionStatus;
    private List<String> notSignificantTopLevelMpTerms;
    private String nullAlleleProductionStatus;
    private String phenotypeStatus;
    private Boolean phenotypingDataAvailable;
    private String phenotypingStatus;
    private String seqRegionEnd;
    private String seqRegionId;
    private String seqRegionStart;
    private List<String> significantTopLevelMpTerms;
    private String url;
}
