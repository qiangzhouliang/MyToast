package com.qzl.mytoast

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.qzl.toast.MyToast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        MyToast.init(this)
        click.setOnClickListener {
            MyToast.showShort("点了我")
        }
    }
}
