package com.android.mylibrary

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp


@Composable
fun ImageBoxLibrary(modifier: Modifier){
    Box(modifier = modifier.fillMaxSize(),
        contentAlignment = Alignment.Center)
    {
        Image(painter = painterResource(android.R.drawable.stat_sys_phone_call_on_hold), contentDescription = "",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier.size(50.dp))
    }
}