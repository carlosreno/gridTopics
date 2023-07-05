package com.example.gridtopics.ui.gridTopic.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.gridtopics.R
import com.example.gridtopics.ui.gridTopic.data.DataSource
import com.example.gridtopics.ui.gridTopic.data.Topic

@Preview(showBackground = false,showSystemUi = false)
@Composable
fun PreviewApp(){
    TopicGrid(Modifier.padding(20.dp))
}
@Composable
fun TopicGrid(modifier:Modifier){
        LazyVerticalGrid(
            columns = GridCells.Fixed(2),
            verticalArrangement = Arrangement.spacedBy(8.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            modifier = modifier
        ){
            items(DataSource.topics){topic->
                TopicCard(topic)
            }
        }
}
@Composable
fun TopicCard(
    topic: Topic,
    modifier: Modifier = Modifier,
) {
    Card {
        Row {
            Box {
                Image(
                    modifier = modifier
                        .height(68.dp)
                        .width(68.dp)
                        .aspectRatio(1f),
                    painter = painterResource(id = topic.image),
                    contentDescription = null,
                    contentScale = ContentScale.Crop
                )
            }
            Column {
                Text(
                    text = stringResource(id = topic.name),
                    style = MaterialTheme.typography.labelSmall,
                    modifier = Modifier
                        .padding(
                            start = 16.dp,
                            end = 16.dp,
                            top = 16.dp,
                            bottom = 8.dp
                        )
                )
                Row (
                    verticalAlignment = Alignment.CenterVertically
)                   {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_grain),
                        contentDescription = null,
                        modifier = Modifier
                            .padding(
                                start = 16.dp,
                            )
                            .size(18.dp)
                    )
                    Text(
                        text = topic.amount.toString(),
                        style = MaterialTheme.typography.labelSmall,
                        modifier = Modifier
                            .padding(
                                start = 4.dp,
                            )
                    )
                }
            }

        }

    }
}

