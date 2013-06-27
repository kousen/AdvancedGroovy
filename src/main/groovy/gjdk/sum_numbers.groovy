package gjdk

def nums = [3, 1, 4, 1, 5, 9, 2, 6, 5]

assert 36 == nums.sum()

// sum with closure
println nums.sum { it * 2 }

// collect, then sum
println nums.collect { it * 2 }.sum()

// using spread-dot operator
def doubles = nums*.multiply(2)
println doubles.sum()

// list has a multiply method, too
def doubleList = nums * 2
println doubleList.sum()

// inject 
println nums.inject(0) { sum, val -> sum + 2 * val } 

// average
println nums.sum() / nums.size()