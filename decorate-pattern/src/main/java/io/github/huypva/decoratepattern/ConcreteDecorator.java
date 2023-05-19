package io.github.huypva.decoratepattern;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * @author huypva
 */
@Slf4j
public class ConcreteDecorator extends Decorator {
    public ConcreteDecorator(Component component) {
        super(component);
    }

    @Override
    public void addBehavior() {
        log.info("ConcreteDecorator addBehavior!");
    }
}
