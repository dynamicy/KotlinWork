package work.example.chris.tictactoe

import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Gravity
import android.view.View
import android.widget.Button
import android.widget.TableLayout
import android.widget.TableRow
import android.widget.Toast

class MainActivity : AppCompatActivity() , View.OnClickListener {

    override fun onClick(v: View?) {
        Toast.makeText(this, "rgr", Toast.LENGTH_SHORT).show()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init(2)
    }

    fun init(rowNum: Int) {

        val gameBoard: TableLayout = findViewById(R.id.gameBoard)

        for (i in 0..rowNum) {
            // Set table row
            val tableRow = TableRow(this)
            val layoutParam: TableRow.LayoutParams = TableRow.LayoutParams(TableRow.LayoutParams.FILL_PARENT, TableRow.LayoutParams.WRAP_CONTENT)
            layoutParam.weight = 1f
            layoutParam.setMargins(1, 1, 1, 1)
            layoutParam.gravity = Gravity.CENTER_HORIZONTAL
            tableRow.id = i
            tableRow.layoutParams = layoutParam

            for (j in 0..rowNum) {
                // Set content
                val cellButton = Button(this)
                cellButton.setPaddingRelative(1,1,1,1)
                cellButton.height = 40
                cellButton.width = 40
                cellButton.text = j.toString()
                cellButton.textSize = 18f
                cellButton.setBackgroundColor(Color.GREEN)
                cellButton.id = j
                cellButton.setOnClickListener(this)

                tableRow.addView(cellButton)
            }
            gameBoard.addView(tableRow, i)

        }
    }

}
