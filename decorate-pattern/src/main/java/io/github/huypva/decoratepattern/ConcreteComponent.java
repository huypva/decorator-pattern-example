package io.github.huypva.decoratepattern;

import lombok.extern.slf4j.Slf4j;

/**
 * @author huypva
 */
@Slf4j
public class ConcreteComponent implements Component {

  @Override
  public void operate() {
    log.info("ComponentConcrete operate!");
  }
}
