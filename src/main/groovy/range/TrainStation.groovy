package range

import java.text.NumberFormat

class TrainStation implements Comparable<TrainStation> {
    TrainStation next
    TrainStation previous
    String city
    String state
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
