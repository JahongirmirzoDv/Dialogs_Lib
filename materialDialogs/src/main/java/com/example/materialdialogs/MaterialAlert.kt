package com.example.materialdialogs

import android.content.Context
import android.util.Log
import com.google.android.material.dialog.MaterialAlertDialogBuilder

object MaterialAlert {
    fun show(context: Context, title: String, message: String, posBtn: String, negBtn: String) {
        MaterialAlertDialogBuilder(context)
            .setTitle(title)
            .setMessage(message)
            .setNegativeButton(negBtn) { dialog, which ->
                // Respond to negative button press
            }
            .setPositiveButton(posBtn) { dialog, which ->
                // Respond to positive button press
            }
            .show()
    }
}