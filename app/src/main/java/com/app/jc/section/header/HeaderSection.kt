package com.app.jc.section.header

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun HeaderSection(title: String = "For User") {
    Row (
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 8.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            text = title,
            color = Color.White,
            fontSize = MaterialTheme.typography.headlineLarge.fontSize,
            fontWeight = MaterialTheme.typography.bodyLarge.fontWeight
        )
        IconButton(onClick = {
            /* TODO: add action */
        }) {
            Icon(
                Icons.Rounded.Search,
                contentDescription = "Search",
                tint = Color.White,
                modifier = Modifier.size(32.dp)
            )
        }

    }
}