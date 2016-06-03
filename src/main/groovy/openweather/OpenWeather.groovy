package openweather

import com.google.gson.Gson

class OpenWeather {
    String appid = new File('api_key.txt').text
    String base = "http://api.openweathermap.org/data/2.5/weather?"
    Gson gson = new Gson()

    String getWeather(city='Marlborough', state='CT') {
        String qs = [q: "$city,$state", APPID: appid ].collect { it }.join('&')
        String url = "$base$qs"
        String jsonTxt = url.toURL().text
        gson.fromJson(jsonTxt, Model).toString()
    }
}
