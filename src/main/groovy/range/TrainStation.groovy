package range

import java.text.NumberFormat

class TrainStation implements Comparable<TrainStation> {
    
    // Links to next and previous stations
    TrainStation next
    TrainStation previous
    
    // location attributes
    String city
    String state
    
    // set by Geocoder service
    BigDecimal latitude
    BigDecimal longitude
    
    @Override
    int compareTo(TrainStation ts) {
        this.latitude <=> ts.latitude
    }
    
    TrainStation next() { next }
    TrainStation previous() { previous }
    
    String toString() { 
        NumberFormat nf = NumberFormat.instance
        "$city, $state \t (${nf.format(latitude)}, ${nf.format(longitude)})" 
    }
}
