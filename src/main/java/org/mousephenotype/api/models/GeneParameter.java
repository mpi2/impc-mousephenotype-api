package org.mousephenotype.api.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GeneParameter {
    String parameterName;
    String parameterStableId;
    String pipelineName;
    String pipelineStableId;
    String procedureName;
    String procedureStableId;
}
