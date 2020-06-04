package com.example.mayank.getdisciplined.utils.itemtouch

import android.support.v7.widget.RecyclerView


interface ItemTouchHelperAdapter {
    fun onItemMove(oldPos: Int, newPos: Int): Boolean
    fun onItemSwipe(pos: Int)
}

interface ItemTouchHelperViewHolder {
    fun onItemSelected()
    fun onItemClear()
}

interface OnStartDragListener {
    fun onStartDrag(viewHolder: RecyclerView.ViewHolder)
    fun onStopDrag(viewHolder: RecyclerView.ViewHolder)
}