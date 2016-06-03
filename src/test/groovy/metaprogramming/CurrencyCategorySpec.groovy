package metaprogramming

import spock.lang.Specification

class CurrencyCategorySpec extends Specification {

    def "asCurrency with default locale use en-US"() {
        given:
        BigDecimal amount = 1234567.8901234
        String result = ''

        when:
        use(CurrencyCategory) {
            result = amount.asCurrency()
        }

        then:
        result == '$1,234,567.89'
    }

    def "asCurrency with given locale formats correctly"() {
        given:
        BigDecimal amount = 1234567.8901234
        String result = ''

        when:
        use(CurrencyCategory) {
            result = amount.asCurrency(Locale.FRANCE)
        }

        then:
        result == '1 234 567,89 €'
    }
}
