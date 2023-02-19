package com.thechaoscompany.user.infrastructure.out.jpa.mapper;

import com.thechaoscompany.user.domain.model.UserModel;
import com.thechaoscompany.user.infrastructure.out.jpa.entity.UserEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE
)
public interface UserEntityMapper {

    UserEntity toEntity(UserModel user);

    UserModel toModel(UserEntity user);

    List<UserModel> toModelList(List<UserEntity> userEntityList);
}