package coercedclosures

import org.junit.Test

class GroovyJUnit4Test {
	UtilityMethods impl = new GroovyUtilityMethods()

	@Test
	void testGetPositives() {
        def results = impl.getPositives(-3..3 as int[])
        assert results.every { it > 0 }
	}

	@Test
	void testIsPalindrome() {
        assert impl.isPalindrome('No cab, no tuna nut on bacon')
        assert impl.isPalindrome('Do geese see God?')
        assert impl.isPalindrome("Go hang a salami; I'm a lasagna hog!")
        assert !impl.isPalindrome('This is not a palindrome')
	}
}
