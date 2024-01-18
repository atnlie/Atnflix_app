package com.app.jc.section.tabmoreinfo

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.app.jc.data.model.movies.ImageWithText

@Composable
fun TabMoreInfoCard(
    modifier: Modifier = Modifier,
    column: Int = 3,
    tabsList: List<ImageWithText>,
    onTabSelected: (selectedIndex: Int) -> Unit,
) {
    var selectedTabIndex by remember {
        mutableStateOf(0)
    }
    val inactiveColor = Color(0xFF777777)
    
    TabRow(
        selectedTabIndex = selectedTabIndex,
        contentColor = Color.Black,
        modifier = modifier,
        containerColor = Color.Transparent,
    ) {
        tabsList.forEachIndexed { index, item ->
            Tab(
                selected = selectedTabIndex == 0,
                selectedContentColor = Color.Black,
                unselectedContentColor = inactiveColor,
                onClick = {
                    selectedTabIndex = index
                    onTabSelected(index)
                }
            )
            {
               Text(
                   text = item.text,
                   fontWeight = FontWeight.Bold,
                   color = if (selectedTabIndex == index ) Color.White else inactiveColor,
                   modifier = Modifier
                       .padding(10.dp)
                       .size(20.dp)

                   )
            }
        }

    }
}