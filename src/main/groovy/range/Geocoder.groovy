/* ===================================================
 * Copyright 2012 Kousen IT, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * ========================================================== */
package range

class Geocoder {
    public static final String BASE = 
        'http://maps.google.com/maps/api/geocode/xml?'

    void fillInLatLng(TrainStation station) {
        String encoded = 
            [station.city, station.state].collect { 
                URLEncoder.encode(it,'UTF-8')
            }.join(',') 
        String qs = [sensor:false, address: encoded].collect { it }.join('&')
        println "$BASE$qs"
        def response = new XmlSlurper().parse("$BASE$qs")
        station.latitude = response.result[0].geometry.location.lat.toBigDecimal()
        station.longitude = response.result[0].geometry.location.lng.toBigDecimal()
    }
}
