
package com.andresespinoza.productos_kotlin

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity

import com.andresespinoza.productos_kotlin.databinding.ActivityMainBinding
import com.andresespinoza.productos_kotlin.viewmodel.ProductViewModel
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val productViewModel: ProductViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        productViewModel.productModel.observe(this) {
            binding.tvProductoName.text = it.name
            binding.tvProductoPrecio.text = "$${"%.2f".format(it.price)}"
        }

        binding.viewContainer.setOnClickListener {
            productViewModel.randomProduct()
        }
    }
}