package com.example.dagger2android

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.TextView
import com.example.dagger2android.bindinterface.CarPresenter
import com.example.dagger2android.contextmodule.ClassWithContext
import com.example.dagger2android.constructInjection.Car
import com.example.dagger2android.multibinding.CarType
import com.example.dagger2android.multibinding.Train
import com.example.dagger2android.qualifier.DocType
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : BaseActivity() {

    @Inject
    lateinit var car: Car

    @Inject
    lateinit var classWithContext: ClassWithContext

    @Inject
    lateinit var carPresenter: CarPresenter

    @Inject
    @field:DocType("html")
    lateinit var text: String

    @Inject
    lateinit var train: Map<CarType, @JvmSuppressWildcards Train>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
            Snackbar.make(view, carPresenter.requestHelloVendor(), Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }

        findViewById<TextView>(R.id.text).text = car.name

        findViewById<TextView>(R.id.text2).text = classWithContext.name

        findViewById<TextView>(R.id.text3).text = text

        findViewById<TextView>(R.id.text4).text = train[CarType.FLYING]?.go()

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }
}
