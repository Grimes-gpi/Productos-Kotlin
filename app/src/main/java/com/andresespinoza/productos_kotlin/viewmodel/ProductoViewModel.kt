package com.andresespinoza.productos_kotlin.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.andresespinoza.productos_kotlin.model.Product
import com.andresespinoza.productos_kotlin.model.ProductoProvider

class ProductViewModel : ViewModel() {
    val productModel = MutableLiveData<Product>()

    fun randomProduct() {
        val currentProduct = ProductoProvider.random()
        productModel.postValue(currentProduct)
    }
}
