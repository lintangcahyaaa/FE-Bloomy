package com.example.Bloomy.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.bloomy.R

@Composable
fun Reviews(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .requiredWidth(width = 360.dp)
            .requiredHeight(height = 800.dp)
            .background(color = Color(0xfff5f5f5))
    ) {
        Image(
            painter = painterResource(id = R.drawable.backarrow),
            contentDescription = "Back Arrow",
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 24.dp,
                    y = 45.dp)
                .requiredSize(size = 24.dp))
        Text(
            text = "Reviews",
            color = Color.Black,
            style = TextStyle(
                fontSize = 20.sp,
                fontWeight = FontWeight.Medium),
            modifier = Modifier
                .align(alignment = Alignment.TopCenter)
                .offset(x = 0.dp,
                    y = 50.dp))
        Text(
            text = "4.8",
            color = Color(0xffeb7b8a),
            style = TextStyle(
                fontSize = 77.sp,
                fontWeight = FontWeight.Light),
            modifier = Modifier
                .align(alignment = Alignment.TopCenter)
                .offset(x = 76.dp,
                    y = 166.dp))
        Text(
            text = "(30 Reviews)",
            color = Color(0xff322514),
            style = TextStyle(
                fontSize = 16.sp),
            modifier = Modifier
                .align(alignment = Alignment.TopCenter)
                .offset(x = 78.dp,
                    y = 232.dp))
        Image(
            painter = painterResource(id = R.drawable.rating),
            contentDescription = "Rating",
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 112.dp,
                    y = 110.dp)
                .requiredWidth(width = 138.dp)
                .requiredHeight(height = 25.dp))
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 29.dp,
                    y = 158.dp)
                .requiredWidth(width = 124.dp)
                .requiredHeight(height = 94.dp)
        ) {
            Text(
                text = "5",
                color = Color(0xff322514),
                style = TextStyle(
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Light),
                modifier = Modifier
                    .align(alignment = Alignment.TopCenter)
                    .offset(x = 27.5.dp,
                        y = 3.dp))
            Text(
                text = "4",
                color = Color(0xff322514),
                style = TextStyle(
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Light),
                modifier = Modifier
                    .align(alignment = Alignment.TopCenter)
                    .offset(x = 28.dp,
                        y = 23.dp))
            Text(
                text = "3",
                color = Color(0xff322514),
                style = TextStyle(
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Light),
                modifier = Modifier
                    .align(alignment = Alignment.TopCenter)
                    .offset(x = 27.5.dp,
                        y = 43.dp))
            Text(
                text = "2",
                color = Color(0xff322514),
                style = TextStyle(
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Light),
                modifier = Modifier
                    .align(alignment = Alignment.TopCenter)
                    .offset(x = 27.5.dp,
                        y = 63.dp))
            Text(
                text = "1",
                color = Color(0xff322514),
                style = TextStyle(
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Light),
                modifier = Modifier
                    .align(alignment = Alignment.TopCenter)
                    .offset(x = 26.5.dp,
                        y = 83.dp))
            Text(
                text = "(20)",
                color = Color(0xff322514),
                style = TextStyle(
                    fontSize = 12.sp),
                modifier = Modifier
                    .align(alignment = Alignment.TopCenter)
                    .offset(x = 51.dp,
                        y = 3.dp))
            Text(
                text = "(5)",
                color = Color(0xff322514),
                style = TextStyle(
                    fontSize = 12.sp),
                modifier = Modifier
                    .align(alignment = Alignment.TopCenter)
                    .offset(x = 47.dp,
                        y = 23.dp))
            Text(
                text = "(3)",
                color = Color(0xff322514),
                style = TextStyle(
                    fontSize = 12.sp),
                modifier = Modifier
                    .align(alignment = Alignment.TopCenter)
                    .offset(x = 47.dp,
                        y = 43.dp))
            Text(
                text = "(2)",
                color = Color(0xff322514),
                style = TextStyle(
                    fontSize = 12.sp),
                modifier = Modifier
                    .align(alignment = Alignment.TopCenter)
                    .offset(x = 47.dp,
                        y = 63.dp))
            Text(
                text = "(0)",
                color = Color(0xff322514),
                style = TextStyle(
                    fontSize = 12.sp),
                modifier = Modifier
                    .align(alignment = Alignment.TopCenter)
                    .offset(x = 48.dp,
                        y = 83.dp))
            Image(
                painter = painterResource(id = R.drawable.stary),
                contentDescription = "Vector",
                modifier = Modifier
                    .fillMaxSize())
            Image(
                painter = painterResource(id = R.drawable.stary),
                contentDescription = "Vector",
                modifier = Modifier
                    .fillMaxSize())
            Image(
                painter = painterResource(id = R.drawable.stary),
                contentDescription = "Vector",
                modifier = Modifier
                    .fillMaxSize())
            Image(
                painter = painterResource(id = R.drawable.stary),
                contentDescription = "Vector",
                modifier = Modifier
                    .fillMaxSize())
            Image(
                painter = painterResource(id = R.drawable.stary),
                contentDescription = "Vector",
                modifier = Modifier
                    .fillMaxSize())
            Image(
                painter = painterResource(id = R.drawable.stary),
                contentDescription = "Vector",
                modifier = Modifier
                    .fillMaxSize())
            Image(
                painter = painterResource(id = R.drawable.stary),
                contentDescription = "Vector",
                modifier = Modifier
                    .fillMaxSize())
            Image(
                painter = painterResource(id = R.drawable.stary),
                contentDescription = "Vector",
                modifier = Modifier
                    .fillMaxSize())
            Image(
                painter = painterResource(id = R.drawable.stary),
                contentDescription = "Vector",
                modifier = Modifier
                    .fillMaxSize())
            Image(
                painter = painterResource(id = R.drawable.stary),
                contentDescription = "Vector",
                modifier = Modifier
                    .fillMaxSize())
            Image(
                painter = painterResource(id = R.drawable.starg),
                contentDescription = "Vector",
                modifier = Modifier
                    .fillMaxSize())
            Image(
                painter = painterResource(id = R.drawable.stary),
                contentDescription = "Vector",
                modifier = Modifier
                    .fillMaxSize())
            Image(
                painter = painterResource(id = R.drawable.stary),
                contentDescription = "Vector",
                modifier = Modifier
                    .fillMaxSize())
            Image(
                painter = painterResource(id = R.drawable.stary),
                contentDescription = "Vector",
                modifier = Modifier
                    .fillMaxSize())
            Image(
                painter = painterResource(id = R.drawable.starg),
                contentDescription = "Vector",
                modifier = Modifier
                    .fillMaxSize())
            Image(
                painter = painterResource(id = R.drawable.starg),
                contentDescription = "Vector",
                modifier = Modifier
                    .fillMaxSize())
            Image(
                painter = painterResource(id = R.drawable.stary),
                contentDescription = "Vector",
                modifier = Modifier
                    .fillMaxSize())
            Image(
                painter = painterResource(id = R.drawable.starg),
                contentDescription = "Vector",
                modifier = Modifier
                    .fillMaxSize())
            Image(
                painter = painterResource(id = R.drawable.starg),
                contentDescription = "Vector",
                modifier = Modifier
                    .fillMaxSize())
            Image(
                painter = painterResource(id = R.drawable.starg),
                contentDescription = "Vector",
                modifier = Modifier
                    .fillMaxSize())
            Image(
                painter = painterResource(id = R.drawable.starg),
                contentDescription = "Vector",
                modifier = Modifier
                    .fillMaxSize())
            Image(
                painter = painterResource(id = R.drawable.starg),
                contentDescription = "Vector",
                modifier = Modifier
                    .fillMaxSize())
            Image(
                painter = painterResource(id = R.drawable.starg),
                contentDescription = "Vector",
                modifier = Modifier
                    .fillMaxSize())
            Image(
                painter = painterResource(id = R.drawable.starg),
                contentDescription = "Vector",
                modifier = Modifier
                    .fillMaxSize())
            Image(
                painter = painterResource(id = R.drawable.starg),
                contentDescription = "Vector",
                modifier = Modifier
                    .fillMaxSize())
        }
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopCenter)
                .offset(x = 0.dp,
                    y = 308.dp)
                .requiredWidth(width = 302.dp)
                .requiredHeight(height = 121.dp)
                .background(color = Color.White))
        Text(
            text = "Katona Beatrix",
            color = Color.Black,
            style = TextStyle(
                fontSize = 16.sp),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 40.dp,
                    y = 317.dp)
                .requiredWidth(width = 150.dp))
        Text(
            text = "ut enim ad minima veniam, quis nostrum exercitationem ullam corporis suscipit laboriosam, nisi ut al",
            color = Color.Black,
            style = TextStyle(
                fontSize = 12.sp,
                fontWeight = FontWeight.Light),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 43.dp,
                    y = 340.dp)
                .requiredWidth(width = 275.dp)
                .wrapContentHeight(align = Alignment.CenterVertically))
        Text(
            text = "2020-05-05 10:21:13",
            color = Color.Black.copy(alpha = 0.61f),
            style = TextStyle(
                fontSize = 12.sp,
                fontWeight = FontWeight.Light),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 40.dp,
                    y = 407.dp)
                .requiredWidth(width = 157.dp)
                .requiredHeight(height = 13.dp)
                .wrapContentHeight(align = Alignment.CenterVertically))
        Image(
            painter = painterResource(id = R.drawable.stary),
            contentDescription = "Vector",
            modifier = Modifier
                .fillMaxSize())
        Image(
            painter = painterResource(id = R.drawable.stary),
            contentDescription = "Vector",
            modifier = Modifier
                .fillMaxSize())
        Image(
            painter = painterResource(id = R.drawable.stary),
            contentDescription = "Vector",
            modifier = Modifier
                .fillMaxSize())
        Image(
            painter = painterResource(id = R.drawable.stary),
            contentDescription = "Vector",
            modifier = Modifier
                .fillMaxSize())
        Image(
            painter = painterResource(id = R.drawable.starg),
            contentDescription = "Vector",
            modifier = Modifier
                .fillMaxSize())
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 29.dp,
                    y = 439.dp)
                .requiredWidth(width = 302.dp)
                .requiredHeight(height = 121.dp)
        ) {
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopCenter)
                    .offset(x = 0.dp,
                        y = 0.dp)
                    .requiredWidth(width = 302.dp)
                    .requiredHeight(height = 121.dp)
                    .background(color = Color.White))
            Text(
                text = "Ronald Richards",
                color = Color.Black,
                style = TextStyle(
                    fontSize = 16.sp),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 11.dp,
                        y = 13.dp)
                    .requiredWidth(width = 150.dp))
            Text(
                text = "ut enim ad minima veniam, quis nostrum exercitationem ullam corporis suscipit laboriosam, nisi ut al",
                color = Color.Black,
                style = TextStyle(
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Light),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 14.dp,
                        y = 28.dp)
                    .requiredWidth(width = 275.dp)
                    .wrapContentHeight(align = Alignment.CenterVertically))
            Text(
                text = "2020-05-06 11:24:08",
                color = Color.Black.copy(alpha = 0.61f),
                style = TextStyle(
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Light),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 11.dp,
                        y = 103.dp)
                    .requiredWidth(width = 157.dp)
                    .requiredHeight(height = 13.dp)
                    .wrapContentHeight(align = Alignment.CenterVertically))
            Image(
                painter = painterResource(id = R.drawable.stary),
                contentDescription = "Vector",
                modifier = Modifier
                    .fillMaxSize())
            Image(
                painter = painterResource(id = R.drawable.stary),
                contentDescription = "Vector",
                modifier = Modifier
                    .fillMaxSize())
            Image(
                painter = painterResource(id = R.drawable.stary),
                contentDescription = "Vector",
                modifier = Modifier
                    .fillMaxSize())
            Image(
                painter = painterResource(id = R.drawable.stary),
                contentDescription = "Vector",
                modifier = Modifier
                    .fillMaxSize())
            Image(
                painter = painterResource(id = R.drawable.stary),
                contentDescription = "Vector",
                modifier = Modifier
                    .fillMaxSize())
        }
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopCenter)
                .offset(x = 0.dp,
                    y = 570.dp)
                .requiredWidth(width = 302.dp)
                .requiredHeight(height = 121.dp)
                .background(color = Color.White))
        Text(
            text = "Dianne Russell",
            color = Color.Black,
            style = TextStyle(
                fontSize = 16.sp),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 40.dp,
                    y = 579.dp)
                .requiredWidth(width = 150.dp))
        Text(
            text = "ut enim ad minima veniam, quis nostrum exercitationem ullam corporis suscipit laboriosam, nisi ut al",
            color = Color.Black,
            style = TextStyle(
                fontSize = 12.sp,
                fontWeight = FontWeight.Light),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 43.dp,
                    y = 602.dp)
                .requiredWidth(width = 275.dp)
                .wrapContentHeight(align = Alignment.CenterVertically))
        Text(
            text = "2020-05-01 06:05:46",
            color = Color.Black.copy(alpha = 0.61f),
            style = TextStyle(
                fontSize = 12.sp,
                fontWeight = FontWeight.Light),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 40.dp,
                    y = 669.dp)
                .requiredWidth(width = 157.dp)
                .requiredHeight(height = 13.dp)
                .wrapContentHeight(align = Alignment.CenterVertically))
        Image(
            painter = painterResource(id = R.drawable.stary),
            contentDescription = "Vector",
            modifier = Modifier
                .fillMaxSize())
        Image(
            painter = painterResource(id = R.drawable.stary),
            contentDescription = "Vector",
            modifier = Modifier
                .fillMaxSize())
        Image(
            painter = painterResource(id = R.drawable.stary),
            contentDescription = "Vector",
            modifier = Modifier
                .fillMaxSize())
        Image(
            painter = painterResource(id = R.drawable.starg),
            contentDescription = "Vector",
            modifier = Modifier
                .fillMaxSize())
        Image(
            painter = painterResource(id = R.drawable.starg),
            contentDescription = "Vector",
            modifier = Modifier
                .fillMaxSize())
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 29.dp,
                    y = 701.dp)
                .requiredWidth(width = 302.dp)
                .requiredHeight(height = 121.dp)
        ) {
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopCenter)
                    .offset(x = 0.dp,
                        y = 0.dp)
                    .requiredWidth(width = 302.dp)
                    .requiredHeight(height = 121.dp)
                    .background(color = Color.White))
            Text(
                text = "Courtney Henry",
                color = Color.Black,
                style = TextStyle(
                    fontSize = 16.sp),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 11.dp,
                        y = 13.dp)
                    .requiredWidth(width = 150.dp))
            Text(
                text = "ut enim ad minima veniam, quis nostrum exercitationem ullam corporis suscipit laboriosam, nisi ut al",
                color = Color.Black,
                style = TextStyle(
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Light),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 14.dp,
                        y = 28.dp)
                    .requiredWidth(width = 275.dp)
                    .wrapContentHeight(align = Alignment.CenterVertically))
            Text(
                text = "2020-05-05 10:21:13",
                color = Color.Black.copy(alpha = 0.61f),
                style = TextStyle(
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Light),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 11.dp,
                        y = 103.dp)
                    .requiredWidth(width = 157.dp)
                    .requiredHeight(height = 13.dp)
                    .wrapContentHeight(align = Alignment.CenterVertically))
            Image(
                painter = painterResource(id = R.drawable.stary),
                contentDescription = "Vector",
                modifier = Modifier
                    .fillMaxSize())
            Image(
                painter = painterResource(id = R.drawable.stary),
                contentDescription = "Vector",
                modifier = Modifier
                    .fillMaxSize())
            Image(
                painter = painterResource(id = R.drawable.stary),
                contentDescription = "Vector",
                modifier = Modifier
                    .fillMaxSize())
            Image(
                painter = painterResource(id = R.drawable.stary),
                contentDescription = "Vector",
                modifier = Modifier
                    .fillMaxSize())
            Image(
                painter = painterResource(id = R.drawable.stary),
                contentDescription = "Vector",
                modifier = Modifier
                    .fillMaxSize())
        }
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopCenter)
                .offset(x = 0.dp,
                    y = 832.dp)
                .requiredWidth(width = 302.dp)
                .requiredHeight(height = 121.dp)
                .background(color = Color(0xffd9d9d9)))
        Text(
            text = "Katona Beatrix",
            color = Color.Black,
            style = TextStyle(
                fontSize = 16.sp),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 40.dp,
                    y = 841.dp)
                .requiredWidth(width = 150.dp))
        Text(
            text = "ut enim ad minima veniam, quis nostrum exercitationem ullam corporis suscipit laboriosam, nisi ut al",
            color = Color.Black,
            style = TextStyle(
                fontSize = 12.sp,
                fontWeight = FontWeight.Light),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 43.dp,
                    y = 864.dp)
                .requiredWidth(width = 275.dp)
                .wrapContentHeight(align = Alignment.CenterVertically))
        Text(
            text = "2020-05-05 10:21:13",
            color = Color.Black.copy(alpha = 0.61f),
            style = TextStyle(
                fontSize = 12.sp,
                fontWeight = FontWeight.Light),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 40.dp,
                    y = 931.dp)
                .requiredWidth(width = 157.dp)
                .requiredHeight(height = 13.dp)
                .wrapContentHeight(align = Alignment.CenterVertically))
        Image(
            painter = painterResource(id = R.drawable.stary),
            contentDescription = "Vector",
            modifier = Modifier
                .fillMaxSize())
        Image(
            painter = painterResource(id = R.drawable.stary),
            contentDescription = "Vector",
            modifier = Modifier
                .fillMaxSize())
        Image(
            painter = painterResource(id = R.drawable.stary),
            contentDescription = "Vector",
            modifier = Modifier
                .fillMaxSize())
        Image(
            painter = painterResource(id = R.drawable.starg),
            contentDescription = "Vector",
            modifier = Modifier
                .fillMaxSize())
        Image(
            painter = painterResource(id = R.drawable.starg),
            contentDescription = "Vector",
            modifier = Modifier
                .fillMaxSize())
    }
}

@Preview(widthDp = 360, heightDp = 800)
@Composable
private fun ReviewsPreview() {
    Reviews(Modifier)
}