package range

TrainStation was = new TrainStation(city:'Washington', state:'DC')
TrainStation bal = new TrainStation(city:'Baltimore', state:'MD')
TrainStation wil = new TrainStation(city:'Wilmington', state:'DE')
TrainStation phl = new TrainStation(city:'Philadelphia', state:'PA')
TrainStation nwk = new TrainStation(city:'Newark', state:'NJ')
TrainStation nyc = new TrainStation(city:'New York', state:'NY')
TrainStation nhv = new TrainStation(city:'New Haven', state:'CT')
TrainStation pvd = new TrainStation(city:'Providence', state:'RI')
TrainStation bos = new TrainStation(city:'Boston', state:'MA')

def ne_corridor = [was, bal, wil, phl, nwk, nyc, nhv, pvd, bos]

was.next = bal; bal.previous = was
bal.next = wil; wil.previous = bal
wil.next = phl; phl.previous = wil
phl.next = nwk; nwk.previous = phl
nwk.next = nyc; nyc.previous = nwk
nyc.next = nhv; nhv.previous = nyc
nhv.next = pvd; pvd.previous = nhv
pvd.next = bos; bos.previous = pvd

Geocoder geo = new Geocoder()
ne_corridor.each { station -> 
    geo.fillInLatLng(station)
}

// heading north
println '\nNorthbound from WAS to BOS'
(was..bos).each { println it }

// heading south
println '\nSouthbound from BOS to WAS'
(bos..was).each { println it }

// nyc to bos
println '\nNYC to BOS'
(nyc..bos).each { println it.city }