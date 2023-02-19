package com.thechaoscompany.user.domain.usecase;

import com.thechaoscompany.user.domain.api.IObjectServicePort;
import com.thechaoscompany.user.domain.model.ObjectModel;
import com.thechaoscompany.user.domain.spi.IObjectPersistencePort;

import java.util.List;

public class ObjectUseCase implements IObjectServicePort {

    private final IObjectPersistencePort objectPersistencePort;

    public ObjectUseCase(IObjectPersistencePort objectPersistencePort) {
        this.objectPersistencePort = objectPersistencePort;
    }

    @Override
    public void saveObject(ObjectModel objectModel) {
        objectPersistencePort.saveObject(objectModel);
    }

    @Override
    public List<ObjectModel> getAllObjects() {
        return objectPersistencePort.getAllObjects();
    }
}