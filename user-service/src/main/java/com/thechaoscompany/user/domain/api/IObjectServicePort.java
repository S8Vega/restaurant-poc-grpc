package com.thechaoscompany.user.domain.api;

import com.thechaoscompany.user.domain.model.ObjectModel;

import java.util.List;

public interface IObjectServicePort {

    void saveObject(ObjectModel objectModel);

    List<ObjectModel> getAllObjects();
}