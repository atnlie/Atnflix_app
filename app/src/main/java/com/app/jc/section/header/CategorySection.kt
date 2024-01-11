package com.app.jc.section.header

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.Modifier
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun CategorySection() {
    Row (modifier = Modifier.padding(horizontal = 8.dp)) {
        OutlinedButton(
            onClick = { /*TODO*/ },
            border = BorderStroke(
                width = 1.dp,
                color = Color.White
            )
        ) {
            Text(
                text = "TV Shows",
                color = Color.White,
            )
        }
        Spacer(modifier = Modifier.padding(5.dp))
        OutlinedButton(
            onClick = { /*TODO*/ },
            border = BorderStroke(
                width = 1.dp,
                color = Color.White
            )
        ) {
            Text(
                text = "Movies",
                color = Color.White
            )
        }
        Spacer(modifier = Modifier.padding(5.dp))
        OutlinedButton(
            onClick = { /*TODO*/ },
            border = BorderStroke(
                width = 1.dp,
                color = Color.White
            )
        ) {
            Text(
                text = "Categories",
                color = Color.White,
                modifier = Modifier.padding(end = 2.dp)
            )
            Icon(
                Icons.Default.ArrowDropDown,
                contentDescription = "Categories",
                tint = Color.White,
            )
        }
    }
}