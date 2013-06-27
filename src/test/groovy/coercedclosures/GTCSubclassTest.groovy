package coercedclosures

class GTCSubclassTest extends GroovyTestCase {
	UtilityMethods impl = new GroovyUtilityMethods()

	void testGetPositives() {
		log.info('inside testGetPositives')
		def correct = [1, 2, 3]
		def results = impl.getPositives(-3..3 as int[])
        
        // using special GTC methods
		assertLength(3, results)
		assertArrayEquals(correct as Integer[], results as Integer[])
		correct.each { assertContains(it, results) }
	}

	void testIsPalindrome() {
        assert impl.isPalindrome('No cab, no tuna nut on bacon')
        assert impl.isPalindrome('Do geese see God?')
        assert impl.isPalindrome("Go hang a salami; I'm a lasagna hog!")
        assert !impl.isPalindrome('This is not a palindrome')
	}
}
