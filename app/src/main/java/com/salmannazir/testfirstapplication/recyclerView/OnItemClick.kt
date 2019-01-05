package com.salmannazir.testfirstapplication.recyclerView

import android.view.View

interface OnItemClick {
    fun onClick(position: Int, itemView: View)
}