package com.example.solarsystem

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class mainpage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mainpage)

        //val list= listOf<String>("SUN","MERCURY","VENUS","EARTH","MARS","JUPITER","SATURN","URANUS","NEPTUNE")
        val info=findViewById<View>(R.id.info) as RecyclerView
        val Solar= mutableListOf<Descrip>()
        Solar.add(Descrip(title = "Sun", Desc = "It is the largest body and only Star in our solar system"))
        Solar.add(Descrip(title = "Mercury", Desc = "It is the closest planet to the sun. It is smallest among all the planets"))
        Solar.add(Descrip(title = "Venus", Desc = "It is second planet in the solar system. It is the hottest planet in our solar system"))
        Solar.add(Descrip(title = "Earth", Desc = "It is third planet in our solar system. It is the only habitable planet in our solar system"))
        Solar.add(Descrip(title = "Mars", Desc = "It is fourth planet in our solar system. It is also known as red planet"))
        Solar.add(Descrip(title = "Jupiter", Desc = "It is fifth planet in a solar system. It is the largest among all the planets"))
        Solar.add(Descrip(title = "Saturn", Desc = "It is sixth planet in our solar system. It has a beautiful ring of moons and rocky objects"))
        Solar.add(Descrip(title = "Uranus", Desc = "It is seventh planet in our solar system. it is tilted on its side"))
        Solar.add(Descrip(title = "Neptune", Desc = "It is eight and last planet in our solar system"))
        info.adapter=MyAdapter(Solar)
        info.layoutManager=LinearLayoutManager(this)
    }
}

