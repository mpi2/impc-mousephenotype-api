package org.mousephenotype.api.configuration;

import org.mousephenotype.api.models.Gene;
import org.mousephenotype.api.models.GeneBundle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.webmvc.support.RepositoryEntityLinks;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;

import java.util.Objects;

@Configuration
public class GeneConfiguration {

    @Autowired
    private RepositoryEntityLinks entityLinks;

    @Bean
    public RepresentationModelProcessor<EntityModel<Gene>> geneProcessor() {

        return new RepresentationModelProcessor<EntityModel<Gene>>() {
            @Override
            public EntityModel<Gene> process(EntityModel<Gene> model) {

                Link bundleLink = entityLinks.linkToItemResource(GeneBundle.class, Objects.requireNonNull(model.getContent()).getId());
                model.add(bundleLink);
                return model;
            }
        };
    }
}
