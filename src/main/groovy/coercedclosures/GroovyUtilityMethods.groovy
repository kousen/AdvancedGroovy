package coercedclosures

class GroovyUtilityMethods implements UtilityMethods {

    int[] getPositives(int... values) {
        values.findAll { it > 0 }
    }

    boolean isPalindrome(String s) {
        String str = s.toLowerCase().replaceAll(/\W/,'')
        str.reverse() == str
    }
}
