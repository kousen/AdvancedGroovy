package gjdk

def strings = ['this', 'is', 'a', 'list', 'of', 'strings']
println strings

// Java sort
//Collections.sort(strings)

// Groovy sort
//strings.sort()
//println strings

// Java sort by length
//Collections.sort(strings, new Comparator<String>() {
//	int compare(String s1,  String s2) {
//		return s1.length() - s2.length()
//	}
//})

// Closure coercion
Collections.sort(strings, 
	{ String s1, String s2 -> s1.size() <=> s2.size() } as Comparator)

println strings
assert strings*.size() == [1, 2, 2, 4, 4, 7]

// Groovy Comparator reverse sort
strings.sort( new Comparator<String>() {
	int compare(String s1, String s2) {
		return s2.size() <=> s1.size()
	}
})
println strings

// Groovy closure sort
strings.sort { it.size() }
println strings

// Groovy closure reverse sort
strings.sort { -it.size() }
println strings

// sort by length, then by alphabet
strings.sort { s1, s2 ->
	s1.size() <=> s2.size() ?: s1 <=> s2
}
println strings