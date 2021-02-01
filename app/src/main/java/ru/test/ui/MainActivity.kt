package ru.test.ui

import android.app.Activity
import android.os.Bundle
import ru.test.R
import ru.test.ru.test.utils.ServerTime


class MainActivity : Activity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_manual)

        println(ServerTime().getServerDateString())

    }

}
