package com.example.lemonadeapp

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ExtendedButtonM3 (onClick: () -> Unit) {
    ExtendedFloatingActionButton(
        onClick = { onClick() },
        modifier = Modifier.fillMaxWidth().padding(start = 24.dp, end = 24.dp),
        icon = { Icon(Icons.Filled.ArrowForward, "Step forward button") },
        text = { Text(text = "Step", fontSize = 18.sp) },
    )
}