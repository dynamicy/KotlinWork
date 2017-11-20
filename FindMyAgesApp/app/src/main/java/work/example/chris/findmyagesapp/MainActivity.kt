package work.example.chris.findmyagesapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val getMyAgeBtn = findViewById<Button>(R.id.getMyAgeBtn)

        getMyAgeBtn.setOnClickListener {
//            val yearOfBirth = yearEditText.text
        }
    }
}
