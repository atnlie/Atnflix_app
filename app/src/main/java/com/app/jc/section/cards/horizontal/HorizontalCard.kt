package com.app.jc.section.cards.horizontal

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.app.jc.data.enums.EnumCard
import com.app.jc.section.cards.medium_card.MediumCard
import com.app.jc.section.cards.small_card.SmallCard

@Preview
@Composable

fun HorizontalCard(title: String = "Only on Netflix", type: EnumCard = EnumCard.MEDIUM) {
    Column (
        modifier = Modifier
            .padding(start = 10.dp)
    ) {
        Text(
            text = title,
            color = Color.White,
            fontWeight = FontWeight.Bold,
            fontSize = 16.sp,
            modifier = Modifier.padding(5.dp)
        )
        when(type) {
            EnumCard.MEDIUM -> {
                MediumCard()
            }
            EnumCard.SMALL -> {
                SmallCard()
            }
        }

    }
}