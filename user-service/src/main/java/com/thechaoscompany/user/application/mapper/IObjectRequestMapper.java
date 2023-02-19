package com.thechaoscompany.user.application.mapper;

import com.thechaoscompany.user.application.dto.request.ObjectRequestDto;
import com.thechaoscompany.user.domain.model.ObjectModel;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface IObjectRequestMapper {
    ObjectModel toObject(ObjectRequestDto objectRequestDto);
}
