package com.example.materialdialogs

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.Color.*
import android.widget.Toast
import com.afollestad.materialdialogs.MaterialDialog
import com.afollestad.materialdialogs.color.colorChooser

object ColorPicker {
    @SuppressLint("CheckResult")
    fun show(context: Context, title: String,colorList:IntArray) {
        MaterialDialog(context).show {
            title(R.string.app_name, title)
            colorChooser(colorList) { dialog, color ->
                Toast.makeText(context, color.toString(), Toast.LENGTH_SHORT).show()
            }
            negativeButton(null, "Cancel") {
                it.dismiss()
            }
            positiveButton(null, "Select")
        }
    }
}