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
public class GenePhenotypeAssociation {
    private String markerSymbol;
    private String colonyId;
    private String alleleName;
    private String alleleSymbol;
    private String alleleAccessionId;
    private String strainName;
    private String strainAccessionId;
    private String phenotypingCenter;
    private List<String> projectName;
    private String resourceName;
    private String zygosity;
    private String pipelineName;
    private String pipelineStableId;
    private Integer pipelineStableKey;
    private List<String> procedureName;
    private List<String> procedureStableId;
    private List<Integer> procedureStableKey;
    private String parameterName;
    private String parameterStableId;
    private List<Integer> parameterStableKey;
    private List<String> lifeStageAcc;
    private List<String> lifeStageName;
    private String sex;
    private Double pValue;
    private String statisticalMethod;
    private String mpTermId;
    private String mpTermName;
    private List<String> topLevelMpTermId;
    private List<String> topLevelMpTermName;
    private List<String> intermediateMpTermId;
    private List<String> intermediateMpTermName;
    private String assertionTypeId;
    private String assertionType;
    private String docId;
    private double effectSize;
    private double percentageChange;
}
