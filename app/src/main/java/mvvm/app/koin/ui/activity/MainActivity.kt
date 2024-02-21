package mvvm.app.koin.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import mvvm.app.koin.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}