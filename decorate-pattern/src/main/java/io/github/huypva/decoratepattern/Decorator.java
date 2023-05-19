package io.github.huypva.decoratepattern;

import lombok.AllArgsConstructor;

/**
 * @author huypva
 */
@AllArgsConstructor
public abstract class Decorator implements Component {

    private Component component;

    @Override
    public void operate() {
        component.operate();
    }

    public abstract void addBehavior();

}
