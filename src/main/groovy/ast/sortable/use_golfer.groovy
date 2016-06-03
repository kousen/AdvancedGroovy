package ast.sortable

//def golfers = [
//        new Golfer(score: 68, last: 'Nicklaus', first: 'Jack'),
//        new Golfer(score: 70, last: 'Woods', first: 'Tiger'),
//        new Golfer(score: 70, last: 'Watson', first: 'Tom'),
//        new Golfer(score: 68, last: 'Webb', first: 'Ty'),
//        new Golfer(score: 70, last: 'Watson', first: 'Bubba')]
//
//golfers.sort().each { println it }

def golfers = [
    new Golfer(height: 70, score: 68, last: 'Nicklaus', first: 'Jack'),
    new Golfer(height: 73, score: 70, last: 'Woods', first: 'Tiger'),
    new Golfer(height: 69, score: 70, last: 'Watson', first: 'Tom'),
    new Golfer(height: 76, score: 68, last: 'Webb', first: 'Ty'),
    new Golfer(height: 75, score: 70, last: 'Watson', first: 'Bubba')]

golfers.sort().reverse().each { println it }