package com.bitcodetech.customview2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    val product = Product(101, "Demo Product1",1000, R.mipmap.ic_launcher)

    /*private lateinit var imgProduct : ImageView
    private lateinit var txtTitle :TextView
    private lateinit var txtPrice :TextView*/

    private lateinit var productView1 : ProductView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()
        bindDataToViews()
    }

    private fun initViews() {
        productView1 = findViewById(R.id.productView1)
    }

    private fun bindDataToViews() {
        productView1.product = product
    }

    /*private fun bindDataToViews() {
        imgProduct.setImageResource(product.imageId)
        txtTitle.text = product.title
        txtPrice.text = "Rs. ${product.price}"
    }

    private fun initViews() {
        imgProduct = findViewById(R.id.imgProduct)
        txtTitle = findViewById(R.id.txtTitle)
        txtPrice = findViewById(R.id.txtPrice)
    }*/
}