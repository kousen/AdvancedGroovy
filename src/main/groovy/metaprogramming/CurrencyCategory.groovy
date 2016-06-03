package metaprogramming

import java.text.NumberFormat

@Category(Number)
class CurrencyCategory {
    String asCurrency(Locale loc = Locale.default) {
        NumberFormat.getCurrencyInstance(loc).format(this)
    }
}
