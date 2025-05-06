package com.andresespinoza.productos_kotlin.model

class ProductoProvider {
        companion object {
            private val products = listOf(
                Product("Computador Portatil Gamer LENOVO LOQ 15.6\" " +
                        "Pulgadas 15IAX9 - Intel Core i5 - RAM 24GB - Disco SSD 512GB - Gris", 2.999),
                Product("Mouse Gamer ", 29.999),
                Product("Teclado mecanico", 89.998),
                Product("Monitor 24''", 1449.990),
                Product("Auriculares Bluetooth", 59.99),
                Product("Smartphone", 120.990),
                Product("Tablet", 738.990),
                Product("Disco SSD 1TB", 129.990),
                Product("Impresora", 79.990),
                Product("Camara web", 39.990)
            )
            fun random(): Product {
                val position = products.indices.random()
                return products[position]
            }
        }
    }