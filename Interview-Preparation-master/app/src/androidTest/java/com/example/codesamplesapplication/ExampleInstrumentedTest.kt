package com.example.codesamplesapplication

import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("com.example.codesamplesapplication", appContext.packageName)
    }

    fun additionOfNumbers(a: Int, b: Int): Int {
        return a + b
    }

    fun checkThatGivenStringIsPanagram(s: String): Boolean {
        val alphabet = ('a'..'z').toSet()
        val inputSet = s.toLowerCase().filter { it in 'a'..'z' }.toSet()
        return inputSet.containsAll(alphabet)
    }
}