package Lesson2.Objects;

import Lesson2.Actors.Actor;

public abstract class Object {
    abstract public void interaction(Actor actor);

    abstract public void destroy(Actor actor);
}
