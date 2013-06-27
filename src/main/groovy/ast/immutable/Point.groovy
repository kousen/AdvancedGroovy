package ast.immutable

import groovy.transform.EqualsAndHashCode;
import groovy.transform.Immutable;

@Immutable
@EqualsAndHashCode
class Point {
    double x
    double y
    
    String toString() { "($x,$y)" }
}
