package openweather

OpenWeather ow = new OpenWeather()
println ow.weather  // called Hartford

// Home of Paul King, co-author of _Groovy in Action_ and my personal hero
println ow.getWeather('Brisbane', 'Australia')

// Home of Guillaume Laforge, head of the Groovy project
// (also one of my heroes, along with Dierk Koenig, Graeme Rocher, Tom Brady, David Ortiz, ...)
println ow.getWeather('Paris', 'France')

// Have to check the weather in Java, right?
println ow.getWeather('Jakarta','ID')

// Is it always sunny in Philadelphia?
println ow.getWeather('Philadelphia', 'US')

// Any weather stations in Antarctica?
println ow.getWeather('McMurdo Station', 'AQ')

// Is it colder in Winnipeg than in Antarctica?
//println ow.getWeather('Winnipeg', 'CA')