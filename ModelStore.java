package ru.geekbrains.seminar1.inmemorymodel;

import ru.geekbrains.seminar1.modelelements.Camera;
import ru.geekbrains.seminar1.modelelements.Flash;
import ru.geekbrains.seminar1.modelelements.PoligonalModel;
import ru.geekbrains.seminar1.modelelements.Scene;

import java.util.ArrayList;
import java.util.Collection;


public class ModelStore implements ModelChanger {

    private Collection<PoligonalModel> models = new ArrayList<>();
    private Collection<Scene> scenes = new ArrayList<>();
    private Collection<Flash> flashes = new ArrayList<>();
    private Collection<Camera> cameras = new ArrayList<>();

    private final Collection<ModelChangedObserver> changeObservers = new ArrayList<>();

    @Override
    public void RegisterModelChanger(ModelChangedObserver o) {
        changeObservers.add(o);
    }

    @Override
    public void RemoveModelChanger(ModelChangedObserver o) {
        changeObservers.remove(o);
    }

    @Override
    public void NotifyChange() {
            for (ModelChangedObserver o : changeObservers){
                o.ApplyUpdateModel();
            }
    }
}
