package edu.temple.imageactivity

import android.R
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {
    var recyclerView: RecyclerView? = null

    // Declare an adapter
    var programAdapter: RecyclerView.Adapter<*>? = null
    var layoutmanager: RecyclerView.LayoutManager? = null

    // Next, prepare your data set. Create two string arrays for program name and program description respectively.
    var programNameList = arrayOf(
        "chicken","corn dog","dumpling","fried chicken","onigiri","pork belly","pork bun",
        "ramen","steak","sushi","tofu stew"
    )
    var programDescriptionList = arrayOf(
        "C Description", "C++ Description", "Java Description",
        "Android Description", "HTML5 Description",
        "CSS3 Description", "JavaScript Description", "jQuery Description",
        "Bootstrap Description", "PHP Description", "MySQL Description",
        "CodeIgniter Description", "React Description", "NodeJS Description",
        "AngularJS Description", "PostgreSQL Description", "Python Description",
        "C# Description", "Wordpress Description", "GitHub Description"
    )

    // Define an integer array to hold the image recourse ids
    var programImages = intArrayOf(
        edu.temple.imageactivity.R.drawable.chicken_sandwhich,
        edu.temple.imageactivity.R.drawable.corn_dog,
        edu.temple.imageactivity.R.drawable.dumpling,
        edu.temple.imageactivity.R.drawable.fried_chicken,
        edu.temple.imageactivity.R.drawable.onigiri,
        edu.temple.imageactivity.R.drawable.pork_belly,
        edu.temple.imageactivity.R.drawable.pork_bun,
        edu.temple.imageactivity.R.drawable.ramen,
        edu.temple.imageactivity.R.drawable.sushi,
        edu.temple.imageactivity.R.drawable.tofu_stew,
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(edu.temple.imageactivity.R.layout.activity_main)
        // Obtain a handle for the RecyclerView
        recyclerView = findViewById(edu.temple.imageactivity.R.id.recyclerView)
        // You may use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        with(recyclerView) { this?.setHasFixedSize(true) }
        // Use a linear layout manager
        layoutmanager = LinearLayoutManager(this)
        with(recyclerView) { this?.setLayoutManager(layoutmanager) }
        // Create an instance of ProgramAdapter. Pass context and all the array elements to the constructor
        programAdapter =
            ProgramAdapter(this, programNameList, programDescriptionList, programImages)
        // Finally, attach the adapter with the RecyclerView
        with(recyclerView) { this?.setAdapter(programAdapter) }
    }
}


