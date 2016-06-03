package sorting

def strings = ['here','are','a','few','strings']

// Sorting with a one-parameter closure
def sorted = strings.sort { it.size() } 
assert sorted*.size() == [1, 3, 3, 4, 7]

// Can't be sure of the order of equal length strings
// assert sorted == ['a','are','few','here','strings']

// Default (lexicographical) sort
assert strings.sort() == ['a','are','few','here','strings']

// Sort by length, then equal lengths alphabetically
sorted = strings.sort { s1, s2 ->
    s1.size() <=> s2.size() ?: s1 <=> s2
}
assert sorted*.size() == [1, 3, 3, 4, 7]

// Sort Person instances
def peter = new Person(name:'Peter')
def lois = new Person(name:'Lois')
def chris = new Person(name:'Chris')
def meg = new Person(name:'Meg')
def stewie = new Person(name:'Stewie')
def people = [peter, lois, chris, meg, stewie]

assert people.sort { it.name } == [chris, lois, meg, peter, stewie]
assert people.sort { it.name.size() } == [meg, lois, chris, peter, stewie]
