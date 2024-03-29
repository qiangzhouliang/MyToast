package com.qzl.toast

import android.content.Context
import android.widget.Toast
import kotlin.Exception

/**
 * @author 强周亮(qiangzhouliang)
 * @desc toast弹窗封装
 * @email 2538096489@qq.com
 * @time 2020/5/12 11:35
 */
object MyToast {
    private var sToast: Toast? = null
    @JvmStatic
    fun init(context: Context?) {
        if (sToast == null) {
            sToast = Toast.makeText(context, "toast", Toast.LENGTH_SHORT)
        }
    }

    @JvmStatic
    fun showShort(msg: String?) {
        try {
            if (sToast == null) {
                throw RuntimeException("Toast  not init")
            } else {
                sToast?.duration = Toast.LENGTH_SHORT
                sToast?.setText(msg)
                sToast?.show()
            }
        } catch (e:Exception){

        }
    }

    @JvmStatic
    fun showLong(msg: String?) {
        try {
            if (sToast == null) {
                throw RuntimeException("Toast  not init")
            } else {
                sToast?.duration = Toast.LENGTH_LONG
                sToast?.setText(msg)
                sToast?.show()
            }
        } catch (e:Exception){

        }
    }
}