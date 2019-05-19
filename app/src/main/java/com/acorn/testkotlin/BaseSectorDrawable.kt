package com.acorn.testkotlin

import android.graphics.ColorFilter
import android.graphics.PixelFormat
import android.graphics.drawable.Drawable

import java.util.ArrayList

/**
 * 扇形
 */
abstract class BaseSectorDrawable<T : PieEntry>(var pieEntry: T) : Drawable() {
    //圆心
    var originCx: Int = 0
        private set
    var originCy: Int = 0
        private set
    var originRadius: Int = 0
        private set
    /**
     * 设置是否在高亮状态
     *
     * @param isHighlighting
     */
    var isHighlighting: Boolean = false
        protected set
    private var mOnSectorChangeListeners: MutableList<OnSectorChangeListener<T>>? = null

    /**
     * 按下扇形区,进入高亮状态isHighlighting=true
     */
    abstract fun press()

    /**
     * 收回扇形区,退出高亮状态isHighlighting=false
     */
    abstract fun unPress()

    fun notifyDataChanged() {
        if (null != pieEntry && originRadius > 0) {
            notifySectorChange(pieEntry, originCx, originCy, originRadius, Source.INIT)
        }
    }

    protected fun notifySectorChange(pieEntry: T, cx: Int, cy: Int, radius: Int, source: Int) {
        if (source == Source.INIT) {
            originCx = cx
            originCy = cy
            originRadius = radius
        }
        if (null != mOnSectorChangeListeners && !mOnSectorChangeListeners!!.isEmpty()) {
            for (onSectorChangeListener in mOnSectorChangeListeners!!) {
                onSectorChangeListener.onSectorChange(pieEntry, cx, cy, radius, source)
            }
        }
    }

    /**
     * 触摸区域是否在此扇形区内
     *
     * @param clickX
     * @param clickY
     * @return
     */
    abstract fun containAngle(clickX: Float, clickY: Float): Boolean

    abstract fun offsetAngle(offsetAngle: Float)

    fun <K : OnSectorChangeListener<T>> addOnSectorChangeListener(onSectorChangeListener: K) {
        if (null == mOnSectorChangeListeners)
            mOnSectorChangeListeners = ArrayList()
        mOnSectorChangeListeners!!.add(onSectorChangeListener)
    }

    fun removeOnSectorChangeListener(onSectorChangeListener: OnSectorChangeListener<T>) {
        if (mOnSectorChangeListeners == null)
            return
        mOnSectorChangeListeners!!.remove(onSectorChangeListener)
        if (mOnSectorChangeListeners!!.isEmpty())
            mOnSectorChangeListeners = null
    }

    fun removeAllOnSectorChangeListener() {
        if (mOnSectorChangeListeners == null)
            return
        mOnSectorChangeListeners!!.clear()
        mOnSectorChangeListeners = null
    }

    override fun setAlpha(alpha: Int) {

    }

    override fun setColorFilter(colorFilter: ColorFilter?) {

    }

    override fun getOpacity(): Int {
        return PixelFormat.TRANSLUCENT
    }

    object Source {
        val INIT = 0
        val ROTATE = 1
        val HIGHLIGHT = 2
    }
}
