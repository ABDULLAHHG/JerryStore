package com.aboud.jerryStore

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.aboud.jerryStore.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.productSection.product2.productImage.setImageResource(R.drawable.img_lover_tom)
        binding.productSection.product2.productName.text = getString(R.string.tom_the_lover_name)
        binding.productSection.product2.productDescription.text = getString(R.string.tom_the_lover_description)
        binding.productSection.product2.productPrice.text = getString(R.string.tom_the_lover_price)

        binding.productSection.product3.productImage.setImageResource(R.drawable.img_scared_tom)
        binding.productSection.product3.productName.text = getString(R.string.scared_tom_name)
        binding.productSection.product3.productDescription.text = getString(R.string.scared_tom_description)
        binding.productSection.product3.productPrice.text = getString(R.string.scared_tom_price)

        binding.productSection.product4.productImage.setImageResource(R.drawable.img_crying_tom)
        binding.productSection.product4.productName.text = getString(R.string.crying_tom_name)
        binding.productSection.product4.productDescription.text = getString(R.string.crying_tom_description)
        binding.productSection.product4.productPrice.text = getString(R.string.crying_tom_price)

        binding.productSection.product5.productImage.setImageResource(R.drawable.img_frozen_tom)
        binding.productSection.product5.productName.text = getString(R.string.frozen_tom_name)
        binding.productSection.product5.productDescription.text = getString(R.string.frozen_tom_description)
        binding.productSection.product5.productPrice.text = getString(R.string.frozen_tom_price)

        binding.productSection.product6.productImage.setImageResource(R.drawable.img_sleeping_tom)
        binding.productSection.product6.productName.text = getString(R.string.sleeping_tom_name)
        binding.productSection.product6.productDescription.text = getString(R.string.sleeping_tom_description)
        binding.productSection.product6.productPrice.text = getString(R.string.sleeping_tom_price)

    }
}