package openweather

import groovy.json.JsonOutput;

import com.google.gson.Gson

String appid = new File('api_key.txt').text

def url = "http://api.openweathermap.org/data/2.5/weather?q=copenhagen,denmark&APPID=$appid"
def jsonTxt = url.toURL().text
println JsonOutput.prettyPrint(jsonTxt)
//Gson gson = new Gson()
//println gson.fromJson(jsonTxt, Model)
