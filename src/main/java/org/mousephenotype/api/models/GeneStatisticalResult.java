package org.mousephenotype.api.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GeneStatisticalResult {
    private String alleleAccessionId;
    private String alleleSymbol;
    private String geneSymbol;
    private String geneAccessionId;
    private String parameterStableId;
    private String parameterName;
    private String procedureStableId;
    private String procedureName;
    private String pipelineName;
    private String pipelineStableId;
    private String zygosity;
    private String phenotypingCenter;
    private String lifeStageName;
    private String significance;
    private Double pValue;
    private Double effectSize;
    private String metadataGroup;
    private Integer maleMutantCount;
    private Integer femaleMutantCount;
    private List<String> topLevelPhenotypeTermId;
    private List<String> topLevelPhenotypeTermName;
}
