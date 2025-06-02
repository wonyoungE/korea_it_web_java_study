package _31_Generic.Wildcard.UpperBoundedWildcard;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Box<T> {
    private T item;
}
