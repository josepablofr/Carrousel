package com.example.imagenescarrousel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import org.imaginativeworld.whynotimagecarousel.CarouselItem
import org.imaginativeworld.whynotimagecarousel.ImageCarousel
import org.imaginativeworld.whynotimagecarousel.OnItemClickListener

class MainActivity : AppCompatActivity() {

    private val list = mutableListOf<CarouselItem>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val carousel: ImageCarousel = findViewById(R.id.carousel)
        list.add(CarouselItem("https://www.segundamano.com.ar/oc-content/uploads/142/32394.jpg", "Sandero"))
        list.add(CarouselItem("https://i.ytimg.com/vi/YdkInciem4o/maxresdefault.jpg","Note"))
        list.add(CarouselItem("https://i.ytimg.com/vi/DLQsJe4NvK4/maxresdefault.jpg", "RAV4"))
        carousel.addData(list)

        carousel.onItemClickListener = object : OnItemClickListener {
            override fun onClick(position: Int, carouselItem: CarouselItem) {
                Toast.makeText(this@MainActivity, "Auto: ${carouselItem.caption}", Toast.LENGTH_SHORT).show()
            }

            override fun onLongClick(position: Int, dataObject: CarouselItem) {
                //
            }
        }

    }
}