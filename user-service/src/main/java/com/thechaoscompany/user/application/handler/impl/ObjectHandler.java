package com.thechaoscompany.user.application.handler.impl;

import com.thechaoscompany.user.application.dto.request.ObjectRequestDto;
import com.thechaoscompany.user.application.dto.response.ObjectResponseDto;
import com.thechaoscompany.user.application.handler.IObjectHandler;
import com.thechaoscompany.user.application.mapper.IObjectRequestMapper;
import com.thechaoscompany.user.application.mapper.IObjectResponseMapper;
import com.thechaoscompany.user.domain.api.IObjectServicePort;
import com.thechaoscompany.user.domain.model.ObjectModel;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class ObjectHandler implements IObjectHandler {

    private final IObjectServicePort objectServicePort;
    private final IObjectRequestMapper objectRequestMapper;
    private final IObjectResponseMapper objectResponseMapper;

    @Override
    public void saveObject(ObjectRequestDto objectRequestDto) {
        ObjectModel objectModel = objectRequestMapper.toObject(objectRequestDto);
        objectServicePort.saveObject(objectModel);
    }

    @Override
    public List<ObjectResponseDto> getAllObjects() {
        return objectResponseMapper.toResponseList(objectServicePort.getAllObjects());
    }
}