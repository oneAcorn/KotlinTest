package com.acorn.testkotlin

interface OnSectorChangeListener<T : PieEntry> {
    /**
     *
     * @param pieEntry
     * @param cx
     * @param cy
     * @param radius
     * @param source  BaseSectorDrawable.Source
     */
    fun onSectorChange(pieEntry: T, cx: Int, cy: Int, radius: Int, source: Int)
}
