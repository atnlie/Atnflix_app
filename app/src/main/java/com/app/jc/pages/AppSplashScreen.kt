package com.app.jc.pages

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.app.jc.R


@Preview
@Composable
fun AppSplashScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
       Image(
           painter = painterResource(id = R.drawable.anton),
           contentDescription =  null,
           modifier = Modifier
               .size(90.dp)
               .clip(RoundedCornerShape(topEnd = 50.dp, topStart = 50.dp))
       )
        Text(
            "ATNFLIX",
            fontWeight = FontWeight.Bold,
            color = Color.Red,
            fontSize = 30.sp
        )
    }
}
