package com.thechaoscompany.user.domain.spi;

import com.thechaoscompany.user.domain.model.ObjectModel;
import java.util.List;

public interface IObjectPersistencePort {
    ObjectModel saveObject(ObjectModel objectModel);

    List<ObjectModel> getAllObjects();
}