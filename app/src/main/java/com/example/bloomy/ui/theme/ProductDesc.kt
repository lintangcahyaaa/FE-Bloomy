package com.example.project.ui.theme

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Divider
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.bloomy.R

@Composable
fun ProductDesc(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .requiredWidth(width = 360.dp)
            .requiredHeight(height = 800.dp)
            .background(color = Color(0xfff5f5f5))
    ) {
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 287.dp,
                    y = 394.dp)
                .requiredSize(size = 38.dp)
                .clip(shape = RoundedCornerShape(5.dp))
                .background(color = Color.White))
        Image(
            painter = painterResource(id = R.drawable.backarrow),
            contentDescription = "Back Arrow",
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 24.dp,
                    y = 45.dp)
                .requiredSize(size = 24.dp))
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 166.dp,
                    y = 676.dp)
                .requiredWidth(width = 14.dp)
                .requiredHeight(height = 16.dp)
        ) {
            //Image(
               // painter = painterResource(id = R.drawable.rectangle16),
                //contentDescription = "Rectangle 16",
                //modifier = Modifier
                  //  .requiredWidth(width = 14.dp)
                    //.requiredHeight(height = 16.dp))
            Text(
                text = "2",
                color = Color.Black,
                style = TextStyle(
                    fontSize = 30.sp),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 4.2607421875.dp,
                        y = 2.250244140625.dp)
                    .requiredWidth(width = 5.dp)
                    .requiredHeight(height = 8.dp))
        }
        Text(
            text = "Bouquet Mawar",
            color = Color(0xff322514),
            style = TextStyle(
                fontSize = 31.sp,
                fontWeight = FontWeight.Medium),
            modifier = Modifier
                .align(alignment = Alignment.TopCenter)
                .offset(x = (-46).dp,
                    y = 400.dp))
        Text(
            text = "Rp 124.000",
            color = Color(0xffeb7b8a),
            style = TextStyle(
                fontSize = 20.sp,
                fontWeight = FontWeight.Medium),
            modifier = Modifier
                .align(alignment = Alignment.TopCenter)
                .offset(x = (-103).dp,
                    y = 436.dp))
        Text(
            text = "4.8",
            color = Color(0xff322514),
            style = TextStyle(
                fontSize = 16.sp,
                fontWeight = FontWeight.Light),
            modifier = Modifier
                .align(alignment = Alignment.TopCenter)
                .offset(x = (-123.5).dp,
                    y = 464.dp))
        Text(
            text = "(30 Reviews)",
            color = Color(0xff322514),
            style = TextStyle(
                fontSize = 12.sp),
            modifier = Modifier
                .align(alignment = Alignment.TopCenter)
                .offset(x = (-71.5).dp,
                    y = 466.dp))
        Text(
            text = "Description",
            color = Color(0xff322514),
            style = TextStyle(
                fontSize = 16.sp,
                fontWeight = FontWeight.Medium),
            modifier = Modifier
                .align(alignment = Alignment.TopCenter)
                .offset(x = (-114.5).dp,
                    y = 529.dp))
        Text(
            text = buildAnnotatedString {
                withStyle(style = SpanStyle(
                    color = Color(0xff322514),
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Light)) {append("duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatu ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo con excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id es ")}
                withStyle(style = SpanStyle(
                    color = Color(0xffeb7b8a),
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Light)
                ) {append("view more")}},
            modifier = Modifier
                .align(alignment = Alignment.TopCenter)
                .offset(x = 1.5.dp,
                    y = 551.dp)
                .requiredWidth(width = 311.dp))
        Property1Default(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 107.dp,
                    y = 674.dp))
        Property1Default(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 209.dp,
                    y = 674.dp))
        Divider(
            color = Color.Black.copy(alpha = 0.3f),
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 157.dp,
                    y = 715.dp)
                .requiredWidth(width = 40.dp))
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 56.dp,
                    y = 725.dp)
                .requiredWidth(width = 248.dp)
                .requiredHeight(height = 47.dp)
                .clip(shape = RoundedCornerShape(10.dp))
                .background(color = Color(0xffeb7b8a)))
        Text(
            text = "Add To Cart",
            color = Color.White,
            style = TextStyle(
                fontSize = 20.sp,
                fontWeight = FontWeight.Medium),
            modifier = Modifier
                .align(alignment = Alignment.TopCenter)
                .offset(x = 0.5.dp,
                    y = 741.dp))
        Image(
            painter = painterResource(id = R.drawable.rectangle65),
            contentDescription = "Rectangle 65",
            modifier = Modifier
                .align(alignment = Alignment.TopCenter)
                .offset(x = 0.5.dp,
                    y = 95.dp)
                .requiredWidth(width = 297.dp)
                .requiredHeight(height = 267.dp)
                .clip(shape = RoundedCornerShape(5.dp)))
        //Image(
            //painter = painterResource(id = R.drawable.vector1),
            //contentDescription = "Vector",
            //modifier = Modifier
                //.fillMaxSize()
                //.rotate(degrees = 30f))
        //Image(
            //painter = painterResource(id = R.drawable.vector1),
            //contentDescription = "Vector",
            //modifier = Modifier
                //.fillMaxSize())
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 306.dp,
                    y = 57.dp)
                .requiredWidth(width = 21.dp)
                .requiredHeight(height = 18.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.vector3),
                contentDescription = "Vector",
                modifier = Modifier
                    .fillMaxSize())
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .clip(shape = CircleShape)
                    .background(color = Color.White)
                    .border(border = BorderStroke(0.5.dp, Color(0xffeb7b8a).copy(alpha = 0.93f)),
                        shape = CircleShape))
            Text(
                text = "2",
                color = Color(0xffeb7b8a).copy(alpha = 0.93f),
                textAlign = TextAlign.Center,
                style = TextStyle(
                    fontSize = 4.sp,
                    fontWeight = FontWeight.Bold),
                modifier = Modifier
                    .fillMaxSize())
        }
        Image(
            painter = painterResource(id = R.drawable.group106),
            contentDescription = "Group 106",
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 160.dp,
                    y = 345.dp)
                .requiredWidth(width = 39.dp)
                .requiredHeight(height = 4.dp))
    }
}

@Composable
fun Property1Default(modifier: Modifier = Modifier) {
    Surface(
        color = Color.White,
        border = BorderStroke(1.dp, Color.Black.copy(alpha = 0.3f)),
        modifier = modifier
    ) {
        Box(
            modifier = Modifier
                .requiredSize(size = 35.dp)
        ) {
            //Image(
                //painter = painterResource(id = R.drawable.rectangle16),
                //contentDescription = "Rectangle 16",
                //modifier = Modifier
                    //.fillMaxSize())
            Text(
                text = "-",
                color = Color(0xffeb7b8a),
                textAlign = TextAlign.Center,
                style = TextStyle(
                    fontSize = 32.sp,
                    fontWeight = FontWeight.Light),
                modifier = Modifier
                    .fillMaxSize()
                    .wrapContentHeight(align = Alignment.CenterVertically))
        }
    }
}


@Preview(widthDp = 360, heightDp = 800)
@Composable
private fun ProductDescPreview() {
    ProductDesc(Modifier)
}