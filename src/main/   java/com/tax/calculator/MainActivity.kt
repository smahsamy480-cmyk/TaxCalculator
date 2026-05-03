package com.tax.calculator

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    
    private lateinit var tvResult: TextView
    private var currentNumber = ""
    private var lastNumber = ""
    private var operation = ""
    private var isNewOperation = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        // الواجهة بالكود مباشرة بدون xml
        val layout = android.widget.LinearLayout(this).apply {
            orientation = android.widget.LinearLayout.VERTICAL
            setPadding(32, 32, 32, 32)
        }
        
        tvResult = TextView(this).apply {
            text = "0"
            textSize = 48f
            setTextColor(0xFF000000.toInt())
            gravity = android.view.Gravity.END
            setPadding(16, 64, 16, 64)
        }
        layout.addView(tvResult)
        
        val buttons = arrayOf(
            arrayOf("C", "⌫", "Tax", "/"),
            arrayOf("7", "8", "9", "*"),
            arrayOf("4", "5", "6", "-"),
            arrayOf("1", "2", "3", "+"),
            arrayOf("0", ".", "=")
        )
        
        for (row in buttons) {
            val rowLayout = android.widget.LinearLayout(this).apply {
                orientation = android.widget.LinearLayout.HORIZONTAL
                layoutParams = android.widget.LinearLayout.LayoutParams(
                    android.widget.LinearLayout.LayoutParams.MATCH_PARENT,
                    0, 1f
                )
            }
            
            for (text in row) {
                val button = Button(this).apply {
                    this.text = text
                    textSize = 24f
                    layoutParams = android.widget.LinearLayout.LayoutParams(
                        0,
                        android.widget.LinearLayout.LayoutParams.MATCH_PARENT,
                        1f
                    ).apply { setMargins(8, 8, 8, 8
