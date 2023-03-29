package com.ead.course.services;

import com.ead.course.models.ModuleModel;

import java.util.Optional;
import java.util.UUID;

public interface ModuleService {

    void delete(ModuleModel moduleModel);

    ModuleModel save(ModuleModel courseModule);

    Optional<ModuleModel> findModuleIntoCourse(UUID courseId, UUID moduleId);

}
