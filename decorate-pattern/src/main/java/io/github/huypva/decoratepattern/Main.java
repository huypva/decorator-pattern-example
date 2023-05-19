package io.github.huypva.decoratepattern;

/**
 * @author huypva
 */
public class Main {

  public static void main(String[] args) {
    Component component = new ConcreteComponent();

    Decorator decorator = new ConcreteDecorator(component);
    decorator.operate();
    decorator.addBehavior();
  }
}
