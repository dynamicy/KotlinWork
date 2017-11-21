package work.example.chris.findmyagesapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.DatePicker
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val datePicker: DatePicker = findViewById<DatePicker>(R.id.dobDatePicker)

        val ageTextView = findViewById<TextView>(R.id.ageTextView)

        val calendar = Calendar.getInstance()

        datePicker.init(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DAY_OF_MONTH),

                DatePicker.OnDateChangedListener { datePicker, year, month, day ->

                    try {

                        val calFromPicker = Calendar.getInstance()

                        calFromPicker.set(datePicker.year, datePicker.month, datePicker.dayOfMonth)

                        val dobYear = calendar.get(Calendar.YEAR) - calFromPicker.get(Calendar.YEAR)

                        val dobMonth = calendar.get(Calendar.MONTH) - calFromPicker.get(Calendar.MONTH)

                        val dobDay = calendar.get(Calendar.DAY_OF_MONTH) - calFromPicker.get(Calendar.DAY_OF_MONTH)

                        if (dobYear < 0 || dobMonth < 0 || dobDay < 0) {
                            ageTextView.text = "The date should be after " + calendar.get(Calendar.MONTH) + " " + calendar.get(Calendar.DAY_OF_MONTH) + ", " + calendar.get(Calendar.YEAR)
                        } else {
                            ageTextView.text = "You're $dobYear years, $dobMonth monthes, and $dobDay days old."
                        }
                    } catch (ex: Exception) {
                        println(ex.message)
                    }

                })

    }
}

