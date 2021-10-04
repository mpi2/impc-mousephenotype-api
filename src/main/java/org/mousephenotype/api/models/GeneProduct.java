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
public class GeneProduct {
    private String alleleDesignProject;
    private String productId;
    private String markerSymbol;
    private String name;
    private String alleleType;
    private String alleleName;
    private String alleleId;
    private String type;
    private List<String> geneticInfo;
    private String productionPipeline;
    private String productionCompleted;
    private List<String> productionInfo;
    private String status;
    private String statusDate;
    private List<String> qcData;
    private String associatedProductVectorName;
    private List<String> orderNames;
    private List<String> orderLinks;
    private List<String> contactNames;
    private List<String> contactLinks;
    private List<String> otherLinks;
    private String ikmcProjectId;
    private String designId;
    private String cassette;
    private String productionCentre;
    private String associatedProductsColonyNames;
    private String associatedProductEsCellName;
    private String associatedProductsEsCellNames;
}
