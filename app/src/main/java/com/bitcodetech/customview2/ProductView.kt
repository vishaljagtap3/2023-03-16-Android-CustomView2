package com.bitcodetech.customview2

import android.content.Context
import android.util.AttributeSet
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView

class ProductView(
    context: Context,
    attributeSet: AttributeSet?
) : LinearLayout(context, attributeSet) {

    private val imgProduct: ImageView
    private val txtProductTitle: TextView
    private val txtProductPrice: TextView

    var product : Product? = null
    set(value) {
        field = value
        bindDataToViews()
    }

    constructor(context: Context) : this(context, null)

    init {

        orientation = LinearLayout.VERTICAL

        imgProduct = ImageView(context)
        imgProduct.layoutParams = LayoutParams(120, 120)
        this.addView(imgProduct)

        txtProductTitle = TextView(context)
        txtProductTitle.layoutParams = LayoutParams(
            android.view.ViewGroup.LayoutParams.MATCH_PARENT,
            android.view.ViewGroup.LayoutParams.WRAP_CONTENT
        )
        this.addView(txtProductTitle)

        txtProductPrice = TextView(context)
        txtProductPrice.layoutParams = LayoutParams(
            android.view.ViewGroup.LayoutParams.MATCH_PARENT,
            android.view.ViewGroup.LayoutParams.WRAP_CONTENT
        )
        this.addView(txtProductPrice)
    }

    private fun bindDataToViews() {
        if(product != null) {
            imgProduct.setImageResource(product!!.imageId)
            txtProductTitle.text = product!!.title
            txtProductPrice.text = "Rs. ${product!!.price}"
        }
    }

}



