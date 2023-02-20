package com.thechaoscompany.user.application.mapper;

import com.thechaoscompany.user.application.dto.request.UserRequestDto;
import com.thechaoscompany.user.domain.model.UserModel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface UserRequestMapper {
    @Mapping(target = "role.name", source = "user.nameRole")
    @Mapping(target = "role.description", source = "user.descriptionRole")
    UserModel toModel(UserRequestDto user);
}
