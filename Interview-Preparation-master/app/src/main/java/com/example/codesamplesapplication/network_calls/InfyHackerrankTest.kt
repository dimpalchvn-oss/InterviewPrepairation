package com.example.codesamplesapplication.network_calls

import org.json.JSONObject
import java.net.HttpURLConnection
import java.net.URL
import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    var urlConnection: HttpURLConnection? = null
    try {
        val url = URL("https://jsonplaceholder.typicode.com/todos")
        urlConnection = url.openConnection() as HttpURLConnection

        val reader = BufferedReader(InputStreamReader(urlConnection.inputStream))
        val response = StringBuilder()
        var line: String? = reader.readLine()

        while (line != null) {
            response.append(line)
            line = reader.readLine()
        }
        reader.close()
        val jsonObject = JSONObject(response.toString())
        println(jsonObject)

    } catch (ex: Exception) {
        println(ex)
    } finally {
        urlConnection?.disconnect()
    }
}