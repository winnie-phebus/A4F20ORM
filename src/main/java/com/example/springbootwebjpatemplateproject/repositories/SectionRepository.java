package com.example.springbootwebjpatemplateproject.repositories;

import com.example.springbootwebjpatemplateproject.models.Section;
import org.springframework.data.repository.CrudRepository;

public interface SectionRepository
    extends CrudRepository<Section, Integer> {
}
