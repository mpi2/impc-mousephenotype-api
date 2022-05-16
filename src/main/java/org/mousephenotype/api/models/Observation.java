package org.mousephenotype.api.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document(collection = "experimental_data")
public class Observation {
    private String id;
    private String allelicComposition;
    private String biologicalSampleGroup;
    private String colonyId;
    private String dataPoint;
    private String experimentId;
    private String geneticBackground;
    private String lifeStageAcc;
    private List<String> metadata;
    private String observationId;
    private String phenotypingCenter;
    private String phenotypingCons;
    private String pipelineName;
    private String productionCenter;
    private String projectName;
    private String sex;
    private String sourcePhenotypingStatus;
    private String weight;
    private String datasourceName;
    private String lifeStageName;
    private String metadataGroup;
    private String pipelineStableId;
    private String parameterName;
    private String procedureGroup;
    private String parameterStableId;
    private String procedureName;
    private String strainAccessionId;
    private String strainName;
    private long ageInDays;
    private String litterId;
    private String procedureSequenceId;
    private String procedureStableId;
    private String category;
    private String experimentSourceFile;
    private String observationType;
    private String specimenId;
    private String weightDate;
    private String dateOfBirth;
    private long ageInWeeks;
    private String experimentSourceId;
    private String specimenSourceFile;
    private long weightDaysOld;
    private String dateOfExperiment;
    private String externalSampleId;
    private String weightParameterStableId;
    private String developmentalStageAcc;
    private String zygosity;
    private String developmentalStageName;
}
