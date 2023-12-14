package com.example.bloomy.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.bloomy.R


@Composable
fun LandingPage(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .requiredWidth(width = 360.dp)
            .requiredHeight(height = 800.dp)
            .background(color = Color.White)
    ) {
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = (-179).dp,
                    y = (-508).dp)
                .requiredWidth(width = 765.dp)
                .requiredHeight(height = 1535.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.flower),
                contentDescription = "download 1",
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 29.dp,
                        y = 0.dp)
                    .requiredWidth(width = 736.dp)
                    .requiredHeight(height = 1308.dp))
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 0.dp,
                        y = 928.dp)
                    .requiredWidth(width = 78.dp)
                    .requiredHeight(height = 67.dp)
                    .background(color = Color(0xffeb7b8a).copy(alpha = 0.93f)))
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 250.dp,
                        y = 1080.dp)
                    .requiredWidth(width = 218.dp)
                    .requiredHeight(height = 51.dp)
            ) {
                Box(
                    modifier = Modifier
                        .align(alignment = Alignment.TopCenter)
                        .offset(x = 0.dp,
                            y = 0.dp)
                        .requiredWidth(width = 218.dp)
                        .requiredHeight(height = 39.dp)
                        .clip(shape = RoundedCornerShape(8.dp))
                        .background(color = Color.White))
                Text(
                    text = "Get Started \n",
                    color = Color(0xff322514),
                    textAlign = TextAlign.Center,
                    style = TextStyle(
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold),
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 52.dp,
                            y = 12.dp))
            }
            Text(
                text = "Welcome",
                color = Color.White,
                textAlign = TextAlign.Center,
                style = TextStyle(
                    fontSize = 36.sp,
                    fontWeight = FontWeight.Bold),
                modifier = Modifier
                    .align(alignment = Alignment.TopCenter)
                    .offset(x = (-24).dp,
                        y = 670.dp)
                    .requiredWidth(width = 279.dp)
                    .requiredHeight(height = 29.dp))
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 307.dp,
                        y = 873.dp)
                    .requiredWidth(width = 104.dp)
                    .requiredHeight(height = 111.dp)
            ) {
                Box(
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 0.dp,
                            y = 6.93339729309082.dp)
                        .requiredWidth(width = 104.dp)
                        .requiredHeight(height = 104.dp)
                        .clip(shape = CircleShape)
                        .background(color = Color.White))
                Image(
                    painter = painterResource(id = R.drawable.img),
                    contentDescription = "9eb9fe9661624900a1ac1a849dde7187-removebg-preview 1",
                    //contentScale = Modifier.Crop,
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 6.93341064453125.dp,
                            y = 0.dp)
                        .requiredWidth(width = 90.dp)
                        .requiredHeight(height = 98.dp))
            }
        }
    }
}

@Preview(widthDp = 360, heightDp = 800)
@Composable
private fun LandingPagePreview() {
    LandingPage(Modifier)
}