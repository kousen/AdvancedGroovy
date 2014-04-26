package ast.immutable

import spock.lang.Specification

class PointSpec extends Specification {
    Point p
    
    def 'can use map-based constructor'() {
        when:
        p = new Point(x:3, y:4)
        
        then:
        p.x == 3
        p.y == 4
    }
    
    def 'can use tuple constructor'() {
        when:
        p = new Point(3, 4)
        
        then:
        p.x == 3
        p.y == 4
    }
    
    def 'equals method works'() {
        when:
        p = new Point(3, 4)
        Point p1 = new Point(3, 4)
        Point p2 = new Point(x:3, y:5)
        
        then:
        p == p1
        p1 != p2
    }
    
    def 'equals and hashcode work in a set'() {
        when:
        p = new Point(3, 4)
        Point p1 = new Point(3, 4)
        Point p2 = new Point(x:3, y:5)
        Set points = [p, p1, p2]
        
        then:
        points.size() == 2
    }
    
    def "can't change x"() {
        given:
        p = new Point(x:3, y:4)
        
        when:
        p.x = 5
        
        then:
        ReadOnlyPropertyException e = thrown()
    }
    
    def "can't change y"() {
        given:
        p = new Point(x:3, y:4)
        
        when:
        p.y = 5
        
        then:
        ReadOnlyPropertyException e = thrown()
    }

    def 'can you change x using direct ref?'() {
        given:
        p = new Point(x:3, y:4)

        when:
        p.@y = 5

        then:
        GroovyRuntimeException e = thrown()
        e.message == 'Cannot set the property \'y\' because the backing field is final.'
    }
}
