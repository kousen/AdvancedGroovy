package db

import groovy.sql.Sql

int filmInStock(filmId, storeId) {
    Sql sql = Sql.newInstance(
        url:'jdbc:mysql://localhost:3306/sakila',driver:'com.mysql.jdbc.Driver',
        user:'root', password:'')
    
    int result
    sql.call('{call film_in_stock(?,?,?)}', [filmId, storeId, Sql.INTEGER]) { count ->
        result = count
    }
    result
}

int films = filmInStock(1,1)
println "For store_id = 1 and film_id = 1, there are $films copies in stock"