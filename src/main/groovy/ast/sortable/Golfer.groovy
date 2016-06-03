package ast.sortable

import groovy.transform.Sortable

@Sortable(includes = ['height', 'score', 'last', 'first'])
class Golfer {
    String first
    String last
    int score
    int height

    String toString() { "$score: $last, $first (${height})" }
}
