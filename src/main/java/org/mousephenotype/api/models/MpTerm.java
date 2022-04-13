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
public class MpTerm {
    String mpTermName;
    String mpTermId;
    List<MpTerm> intermediateAncestors;
    List<MpTerm> topLevelAncestors;

}
