package org.mousephenotype.api.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GeneImage {
    public String observationId;
    public String downloadFilePath;
    public String phenotypingCenter;
    public String pipelineStableId;
    public String procedureStableId;
    public String parameterStableId;
    public String datasourceName;
    public String experimentSourceFile;
    public String specimenSourceFile;
    public String experimentId;
    public String specimenId;
    public String alleleAccessionId;
    public String projectName;
    public String strainAccessionId;
    public String litterId;
    public String phenotypingCons;
    public String externalSampleId;
    public String developmentalStageName;
    public String developmentalStageAcc;
    public Integer ageInDays;
    public String dateOfBirth;
    public List<String> metadata;
    public String metadataGroup;
    public String experimentSourceId;
    public String geneSymbol;
    public String biologicalSampleGroup;
    public String sex;
    public String alleleSymbol;
    public String productionCenter;
    public Integer ageInWeeks;
    public String colonyId;
    public String zygosity;
    public String allelicComposition;
    public String pipelineName;
    public String procedureName;
    public String procedureGroup;
    public String parameterName;
    public String observationType;
    public String strainName;
    public String geneticBackground;
    public String dateOfExperiment;
    public String fileType;
    public String incrementValue;
    public String lifeStageName;
    public String LifeStageAcc;
    public String weight;
    public String weightDate;
    public Integer weightDaysOld;
    public String weightParameterStableId;
    public String omeroId;
    public List<String> embryoAnatomyIdSet;
    public List<String> embryoAnatomyTermSet;
    public List<String> anatomyId;
    public List<String> anatomyTerm;
    public List<String> selectedTopLevelAnatomyId;
    public List<String> selectedTopLevelAnatomyTerm;
    public List<List<String>> mpId;
    public List<List<String>> mpTerm;
    public List<String> topLevelMpIdSet;
    public List<String> topLevelMpTermSet;
    public List<String> intermediateMpIdSet;
    public List<String> intermediateMpTermSet;
    public String downloadUrl;
    public String jpegUrl;
    public String thumbnailUrl;
    public String procedureSequenceId;
    public List<String> parameterAssociationStableId;
    public List<String> parameterAssociationSequenceId;
    public List<String> parameterAssociationName;
    public List<String> parameterAssociationValue;
    public String imageLink;
}
