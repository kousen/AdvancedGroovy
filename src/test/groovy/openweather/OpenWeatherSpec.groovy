package openweather

import spock.lang.Specification

class OpenWeatherSpec extends Specification {
    OpenWeather ow = new OpenWeather()
    
    def 'default city and state return weather string'() {
        when:
        String result = ow.weather
        println result
        
        then:
        result
        result.contains('41.76')
        result.contains('-72.69')
    }
    
    def 'Boston, US works'() {
        when:
        String result = ow.getWeather('Boston','US')
        println result
        
        then:
        result
        result.contains('42.36')
        result.contains('-71.06')
    }
    
    def "The weather is always great in Honolulu"() {
        when:
        String result = ow.getWeather('Honolulu', 'US')
        println result
        
        then:
        result
        result.contains('21.3')
        result.contains('-157.86')
    }
}
