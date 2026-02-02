package com.example.codesamplesapplication

import android.content.Context
import android.graphics.Color
import androidx.appcompat.app.AlertDialog

class CustomDialogBuilder(private val context: Context) {
    private var title: String = "Title"
    private var message: String = "Message"
    private var okAction: (() -> Unit)? = null
    private var cancelAction: (() -> Unit)? = null
    private var prepareAction: (() -> Unit)? = null

    fun setTitle(title: String): CustomDialogBuilder {
        this.title = title
        return this
    }

    fun setMessage(message: String): CustomDialogBuilder {
        this.message = message
        return this
    }

    fun onOk(action: () -> Unit): CustomDialogBuilder {
        this.okAction = action
        return this
    }

    fun onCancel(action: () -> Unit): CustomDialogBuilder {
        this.cancelAction = action
        return this
    }

    fun onPrepare(action: () -> Unit): CustomDialogBuilder {
        this.prepareAction = action
        return this
    }

    fun show() {
        val builder = AlertDialog.Builder(context)
        setTitle(title)
        setMessage(message)

        builder.setPositiveButton("Ok") { _, _ ->
            okAction?.invoke()
        }

        cancelAction?.let {
            builder.setNegativeButton("Cancel") { _, _ ->
                it.invoke()
            }
        }

        prepareAction?.let {
            builder.setNeutralButton("Prepare") { _, _ ->
                it.invoke()
            }
        }
        builder.show()
    }
}