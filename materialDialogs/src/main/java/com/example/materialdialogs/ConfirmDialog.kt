package com.example.materialdialogs

import android.content.Context
import android.widget.Toast
import com.google.android.material.dialog.MaterialAlertDialogBuilder

object ConfirmDialog {
    fun show(
        context: Context,
        title: String,
        posBtn: String,
        singleList: Array<String>,
        chekedItem: Int
    ) {
        MaterialAlertDialogBuilder(context)
            .setTitle(title)
            .setPositiveButton(posBtn) { dialog, which ->
                // Respond to positive button press
            }
            // Single-choice items (initialized with checked item)
            .setSingleChoiceItems(singleList, chekedItem) { dialog, which ->
                Toast.makeText(context, singleList[which], Toast.LENGTH_SHORT).show()
            }
            .show()
    }
}