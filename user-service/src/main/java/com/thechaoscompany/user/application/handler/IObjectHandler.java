package com.thechaoscompany.user.application.handler;

import com.thechaoscompany.user.application.dto.request.ObjectRequestDto;
import com.thechaoscompany.user.application.dto.response.ObjectResponseDto;

import java.util.List;

public interface IObjectHandler {

    void saveObject(ObjectRequestDto objectRequestDto);

    List<ObjectResponseDto> getAllObjects();
}