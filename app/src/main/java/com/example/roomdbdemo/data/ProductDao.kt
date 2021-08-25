package com.example.roomdbdemo.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface ProductDao {

    @Insert
    fun insertProduct(p:Product)

    @Query ("Delete from product_table")
    fun removeAll()

    @Query ("select * from product_table")
    fun getAll() : List<Product>

    @Query ("select * from product_table Where price < :price")
    fun getPriceLessThan (price:Double): List<Product>
}