package com.acorn.testkotlin

class PieEntry {
    //此饼图项占比0~1
    private var value: Float = 0.toFloat()
    //饼图颜色
    private var color: Int = 0
    //是否在饼图上显示文字
    private var isShowPieText = true
    private var title: String? = null
    private var textColor: Int = 0
    //字体大小sp
    private var textSize: Int = 0
    //是否在饼图上显示指示文字
    private var isShowPieIndicateText = true
    //外层指示文字
    private var indicateText: String? = null
    //外层指示文字线颜色
    private var indicateLineColor: Int = 0
    //外层指示文字颜色
    private var indicateTextColor: Int = 0
    //外层指示文字字体大小
    private var indicateTextSize: Int = 0
    private var startAngle: Float = 0f
    private var sweepAngle: Float = 0.toFloat()

    fun PieEntry(pieEntry: PieEntry) {
        this.value = pieEntry.value
        this.color = pieEntry.color
        this.isShowPieText = pieEntry.isShowPieText
        this.title = pieEntry.title
        this.textColor = pieEntry.textColor
        this.textSize = pieEntry.textSize
        this.isShowPieIndicateText = pieEntry.isShowPieIndicateText
        this.indicateText = pieEntry.indicateText
        this.indicateLineColor = pieEntry.indicateLineColor
        this.indicateTextColor = pieEntry.indicateTextColor
        this.indicateTextSize = pieEntry.indicateTextSize
        this.startAngle = pieEntry.startAngle
        this.sweepAngle = pieEntry.sweepAngle
    }

    fun PieEntry(value: Float) {
        this.value = value
    }

    fun getValue(): Float {
        return value
    }

    fun setValue(value: Float) {
        this.value = value
    }

    fun getColor(): Int {
        return color
    }

    fun setColor(color: Int) {
        this.color = color
    }

    fun getTitle(): String? {
        return title
    }

    fun setTitle(title: String) {
        this.title = title
    }

    fun getTextSize(): Int {
        return textSize
    }

    fun setTextSize(textSize: Int) {
        this.textSize = textSize
    }

    fun getStartAngle(): Float {
        return startAngle
    }

    fun setStartAngle(startAngle: Float) {
        this.startAngle = startAngle
    }

    fun getSweepAngle(): Float {
        return sweepAngle
    }

    fun setSweepAngle(sweepAngle: Float) {
        this.sweepAngle = sweepAngle
    }

    fun getTextColor(): Int {
        return textColor
    }

    fun setTextColor(textColor: Int) {
        this.textColor = textColor
    }

    fun isShowPieText(): Boolean {
        return isShowPieText
    }

    fun setShowPieText(showPieText: Boolean) {
        isShowPieText = showPieText
    }

    fun getIndicateLineColor(): Int {
        return indicateLineColor
    }

    fun setIndicateLineColor(indicateLineColor: Int) {
        this.indicateLineColor = indicateLineColor
    }

    fun getIndicateTextSize(): Int {
        return indicateTextSize
    }

    fun setIndicateTextSize(indicateTextSize: Int) {
        this.indicateTextSize = indicateTextSize
    }

    fun getIndicateText(): String? {
        return indicateText
    }

    fun setIndicateText(indicateText: String) {
        this.indicateText = indicateText
    }

    fun getIndicateTextColor(): Int {
        return indicateTextColor
    }

    fun setIndicateTextColor(indicateTextColor: Int) {
        this.indicateTextColor = indicateTextColor
    }

    fun isShowPieIndicateText(): Boolean {
        return isShowPieIndicateText
    }

    fun setShowPieIndicateText(showPieIndicateText: Boolean) {
        isShowPieIndicateText = showPieIndicateText
    }
}