package work.example.chris.tictactoe

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onBtnClick(view: View) {
        val btn: Button = view as Button
        var btnId = 0
        when (btn.id) {
            R.id.btn1 -> btnId = 1
            R.id.btn2 -> btnId = 2
            R.id.btn3 -> btnId = 3
            R.id.btn4 -> btnId = 4
            R.id.btn5 -> btnId = 5
            R.id.btn6 -> btnId = 6
            R.id.btn7 -> btnId = 7
            R.id.btn8 -> btnId = 8
            R.id.btn9 -> btnId = 9
        }
        Toast.makeText(this, "ID:" + btnId, Toast.LENGTH_SHORT).show()
    }

}
