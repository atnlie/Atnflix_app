package com.app.jc.section.home

import androidx.compose.foundation.background
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImagePainter
import coil.compose.rememberAsyncImagePainter
import coil.request.ImageRequest
import coil.size.Size
import com.app.jc.data.model.MoviesItem

@Composable
fun MoviesSection(movie: MoviesItem) {
    val imageState = rememberAsyncImagePainter(
        model = ImageRequest.Builder(LocalContext.current).data(movie?.details?.itemSummary?.boxArt?.url ?: "").size(
            Size.ORIGINAL).build()
    ).state

    Column (
        modifier = Modifier
            .clip(RoundedCornerShape(20.dp))
            .height(500.dp)
            .fillMaxWidth()
            .background(MaterialTheme.colorScheme.primaryContainer)
    ) {
        if(imageState is AsyncImagePainter.State.Error) {
            Box (
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp)
            ) {
                CircularProgressIndicator()
            }
        }

        if (imageState is AsyncImagePainter.State.Success) {
            Image(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp),
                painter = imageState.painter,
                contentDescription = movie?.details?.itemSummary?.title ?: "-",
                contentScale = ContentScale.Crop
            )
        }
        
        Spacer(modifier = Modifier.height(6.dp))

        Text(
            text = movie?.details?.contextualSynopsis?.text ?: "--",
            modifier = Modifier.padding(horizontal = 16.dp),
            fontSize = 17.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(6.dp))

        Text(
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 10.dp),
            text = "Rating: ${movie?.details?.maturity?.rating?.value ?: "-"}",
            fontSize = 13.sp,
        )
        Text(
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 10.dp),
            text = "Rating: ${movie?.details?.maturity?.rating?.maturityDescription ?: "-"}",
            fontSize = 13.sp,
        )


    }
}