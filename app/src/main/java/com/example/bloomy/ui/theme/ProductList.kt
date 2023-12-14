package com.example.Bloomy.ui.theme

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.Bloomy.ui.theme.MyApplicationTheme
import com.google.android.filament.Box
import androidx.compose.ui.unit.sp
import androidx.compose.ui.unit.dp
import androidx.compose.material3.Button
import androidx.compose.material3.IconButton
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.Alignment
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Divider
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import com.example.bloomy.R

@Composable
fun ProductList(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .requiredWidth(width = 360.dp)
            .requiredHeight(height = 800.dp)
            .background(color = Color(0xfff5f5f5))
    ) {
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 299.dp,
                    y = 87.dp)
                .requiredSize(size = 35.dp)
                .clip(shape = RoundedCornerShape(2.dp))
                .background(color = Color(0xffeb7b8a)))
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 308.dp,
                    y = 52.dp)
                .requiredWidth(width = 21.dp)
                .requiredHeight(height = 18.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.keranjang),
                contentDescription = "Keranjang",
                modifier = Modifier
                    .fillMaxSize())
            //Box(
              //  modifier = Modifier
                //    .fillMaxSize()
                  //  .clip(shape = CircleShape)
                    //.background(color = Color.White)
                    //.border(border = BorderStroke(0.5.dp, Color(0xffeb7b8a).copy(alpha = 0.93f)),
                      //  shape = CircleShape))
            //Text(
              //  text = "2",
                //color = Color(0xffeb7b8a).copy(alpha = 0.93f),
                //textAlign = TextAlign.Center,
                //style = TextStyle(
                  //  fontSize = 4.sp,
                    //fontWeight = FontWeight.Bold),
                //modifier = Modifier
                  //  .fillMaxSize())
        }
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 58.dp,
                    y = 50.dp)
                .requiredWidth(width = 244.dp)
                .requiredHeight(height = 24.dp)
        ) {
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopCenter)
                    .offset(x = 0.dp,
                        y = 0.dp)
                    .requiredWidth(width = 244.dp)
                    .requiredHeight(height = 23.dp)
                    .clip(shape = RoundedCornerShape(8.dp))
                    .background(color = Color.White.copy(alpha = 0.69f))
                    .border(border = BorderStroke(2.dp, Color.Black.copy(alpha = 0.3f)),
                        shape = RoundedCornerShape(8.dp)))
            Text(
                text = "product",
                color = Color.Black.copy(alpha = 0.6f),
                textAlign = TextAlign.Center,
                style = TextStyle(
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Medium),
                modifier = Modifier
                    .align(alignment = Alignment.TopCenter)
                    .offset(x = 0.dp,
                        y = 3.dp)
                    .requiredWidth(width = 244.dp)
                    .requiredHeight(height = 21.dp))
            Image(
                painter = painterResource(id = R.drawable.search),
                contentDescription = "vuesax/linear/search-normal",
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 15.dp,
                        y = 5.dp)
                    .requiredWidth(width = 13.dp)
                    .requiredHeight(height = 12.dp))
        }
        Image(
            painter = painterResource(id = R.drawable.list),
            contentDescription = "List",
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 305.37451171875.dp,
                    y = 96.62542724609375.dp)
                .requiredWidth(width = 21.dp)
                .requiredHeight(height = 16.dp))
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 22.dp,
                    y = 144.dp)
                .requiredWidth(width = 145.dp)
                .requiredHeight(height = 185.dp)
        ) {
            Box(
                modifier = Modifier
                    .requiredWidth(width = 145.dp)
                    .requiredHeight(height = 185.dp)
            ) {
                Box(
                    modifier = Modifier
                        .requiredWidth(width = 144.dp)
                        .requiredHeight(height = 185.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .align(alignment = Alignment.TopCenter)
                            .offset(x = 0.dp,
                                y = 0.dp)
                            .requiredWidth(width = 144.dp)
                            .requiredHeight(height = 185.dp)
                            .background(color = Color.White)
                            .border(border = BorderStroke(0.dp, Color(0xff322514).copy(alpha = 0.75f))))
                }
                Text(
                    text = "Bouquet mawar",
                    color = Color(0xffeb7b8a),
                    textAlign = TextAlign.Center,
                    style = TextStyle(
                        fontSize = 10.sp,
                        fontWeight = FontWeight.Bold),
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 0.dp,
                            y = 127.5006103515625.dp)
                        .requiredWidth(width = 145.dp)
                        .requiredHeight(height = 13.dp)
                        .wrapContentHeight(align = Alignment.CenterVertically))
                Text(
                    text = "Dewaflorist",
                    color = Color(0xffeb7b8a),
                    textAlign = TextAlign.Center,
                    style = TextStyle(
                        fontSize = 9.sp),
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 0.dp,
                            y = 145.5006103515625.dp)
                        .requiredWidth(width = 145.dp)
                        .requiredHeight(height = 13.dp)
                        .wrapContentHeight(align = Alignment.CenterVertically))
                Text(
                    text = "Rp 100.000",
                    color = Color(0xff231f20),
                    textAlign = TextAlign.Center,
                    style = TextStyle(
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Medium),
                    modifier = Modifier
                        .align(alignment = Alignment.TopCenter)
                        .offset(x = 0.dp,
                            y = 162.dp)
                        .requiredWidth(width = 145.dp)
                        .requiredHeight(height = 13.dp)
                        .wrapContentHeight(align = Alignment.CenterVertically))
            }
            Image(
                painter = painterResource(id = R.drawable.bunga),
                contentDescription = "Bunga",
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 12.081298828125.dp,
                        y = 13.5.dp)
                    .requiredWidth(width = 121.dp)
                    .requiredHeight(height = 105.dp))
        }
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 184.dp,
                    y = 144.dp)
                .requiredWidth(width = 145.dp)
                .requiredHeight(height = 185.dp)
        ) {
            Box(
                modifier = Modifier
                    .requiredWidth(width = 145.dp)
                    .requiredHeight(height = 185.dp)
            ) {
                Box(
                    modifier = Modifier
                        .requiredWidth(width = 144.dp)
                        .requiredHeight(height = 185.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .align(alignment = Alignment.TopCenter)
                            .offset(x = 0.dp,
                                y = 0.dp)
                            .requiredWidth(width = 144.dp)
                            .requiredHeight(height = 185.dp)
                            .background(color = Color.White)
                            .border(border = BorderStroke(0.dp, Color(0xff322514).copy(alpha = 0.75f))))
                }
                Text(
                    text = "Bouquet mawar",
                    color = Color(0xffeb7b8a),
                    textAlign = TextAlign.Center,
                    style = TextStyle(
                        fontSize = 10.sp,
                        fontWeight = FontWeight.Bold),
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 0.dp,
                            y = 127.5006103515625.dp)
                        .requiredWidth(width = 145.dp)
                        .requiredHeight(height = 13.dp)
                        .wrapContentHeight(align = Alignment.CenterVertically))
                Text(
                    text = "Dewaflorist",
                    color = Color(0xffeb7b8a),
                    textAlign = TextAlign.Center,
                    style = TextStyle(
                        fontSize = 9.sp),
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 0.dp,
                            y = 145.5006103515625.dp)
                        .requiredWidth(width = 145.dp)
                        .requiredHeight(height = 13.dp)
                        .wrapContentHeight(align = Alignment.CenterVertically))
                Text(
                    text = "Rp 100.000",
                    color = Color(0xff231f20),
                    textAlign = TextAlign.Center,
                    style = TextStyle(
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Medium),
                    modifier = Modifier
                        .align(alignment = Alignment.TopCenter)
                        .offset(x = 0.dp,
                            y = 162.dp)
                        .requiredWidth(width = 145.dp)
                        .requiredHeight(height = 13.dp)
                        .wrapContentHeight(align = Alignment.CenterVertically))
            }
            Image(
                painter = painterResource(id = R.drawable.bunga),
                contentDescription = "Bunga",
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 12.081298828125.dp,
                        y = 13.5.dp)
                    .requiredWidth(width = 121.dp)
                    .requiredHeight(height = 105.dp))
        }
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 188.dp,
                    y = 344.dp)
                .requiredWidth(width = 144.dp)
                .requiredHeight(height = 185.dp)
        ) {
            Box(
                modifier = Modifier
                    .requiredWidth(width = 144.dp)
                    .requiredHeight(height = 185.dp)
            ) {
                Box(
                    modifier = Modifier
                        .requiredWidth(width = 143.dp)
                        .requiredHeight(height = 185.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .align(alignment = Alignment.TopCenter)
                            .offset(x = 0.dp,
                                y = 0.dp)
                            .requiredWidth(width = 143.dp)
                            .requiredHeight(height = 185.dp)
                            .background(color = Color.White)
                            .border(border = BorderStroke(0.dp, Color(0xff322514).copy(alpha = 0.75f))))
                }
                Text(
                    text = "Bouquet mawar",
                    color = Color(0xffeb7b8a),
                    textAlign = TextAlign.Center,
                    style = TextStyle(
                        fontSize = 10.sp,
                        fontWeight = FontWeight.Bold),
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 0.dp,
                            y = 127.5006103515625.dp)
                        .requiredWidth(width = 144.dp)
                        .requiredHeight(height = 13.dp)
                        .wrapContentHeight(align = Alignment.CenterVertically))
                Text(
                    text = "Dewaflorist",
                    color = Color(0xffeb7b8a),
                    textAlign = TextAlign.Center,
                    style = TextStyle(
                        fontSize = 9.sp),
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 0.dp,
                            y = 145.5006103515625.dp)
                        .requiredWidth(width = 144.dp)
                        .requiredHeight(height = 13.dp)
                        .wrapContentHeight(align = Alignment.CenterVertically))
                Text(
                    text = "Rp 100.000",
                    color = Color(0xff231f20),
                    textAlign = TextAlign.Center,
                    style = TextStyle(
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Medium),
                    modifier = Modifier
                        .align(alignment = Alignment.TopCenter)
                        .offset(x = 0.dp,
                            y = 162.dp)
                        .requiredWidth(width = 144.dp)
                        .requiredHeight(height = 13.dp)
                        .wrapContentHeight(align = Alignment.CenterVertically))
            }
            Image(
                painter = painterResource(id = R.drawable.bunga),
                contentDescription = "Bunga",
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 11.998046875.dp,
                        y = 13.5.dp)
                    .requiredWidth(width = 120.dp)
                    .requiredHeight(height = 105.dp))
        }
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 35.dp,
                    y = 344.dp)
                .requiredWidth(width = 144.dp)
                .requiredHeight(height = 185.dp)
        ) {
            Box(
                modifier = Modifier
                    .requiredWidth(width = 144.dp)
                    .requiredHeight(height = 185.dp)
            ) {
                Box(
                    modifier = Modifier
                        .requiredWidth(width = 143.dp)
                        .requiredHeight(height = 185.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .align(alignment = Alignment.TopCenter)
                            .offset(x = 0.dp,
                                y = 0.dp)
                            .requiredWidth(width = 143.dp)
                            .requiredHeight(height = 185.dp)
                            .background(color = Color.White)
                            .border(border = BorderStroke(0.dp, Color(0xff322514).copy(alpha = 0.75f))))
                }
                Text(
                    text = "Bouquet mawar",
                    color = Color(0xffeb7b8a),
                    textAlign = TextAlign.Center,
                    style = TextStyle(
                        fontSize = 10.sp,
                        fontWeight = FontWeight.Bold),
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 0.dp,
                            y = 127.5006103515625.dp)
                        .requiredWidth(width = 144.dp)
                        .requiredHeight(height = 13.dp)
                        .wrapContentHeight(align = Alignment.CenterVertically))
                Text(
                    text = "Dewaflorist",
                    color = Color(0xffeb7b8a),
                    textAlign = TextAlign.Center,
                    style = TextStyle(
                        fontSize = 9.sp),
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 0.dp,
                            y = 145.5006103515625.dp)
                        .requiredWidth(width = 144.dp)
                        .requiredHeight(height = 13.dp)
                        .wrapContentHeight(align = Alignment.CenterVertically))
                Text(
                    text = "Rp 100.000",
                    color = Color(0xff231f20),
                    textAlign = TextAlign.Center,
                    style = TextStyle(
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Medium),
                    modifier = Modifier
                        .align(alignment = Alignment.TopCenter)
                        .offset(x = 0.dp,
                            y = 162.dp)
                        .requiredWidth(width = 144.dp)
                        .requiredHeight(height = 13.dp)
                        .wrapContentHeight(align = Alignment.CenterVertically))
            }
            Image(
                painter = painterResource(id = R.drawable.bunga),
                contentDescription = "bunga",
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 11.998046875.dp,
                        y = 13.5.dp)
                    .requiredWidth(width = 120.dp)
                    .requiredHeight(height = 105.dp))
        }
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 189.dp,
                    y = 544.dp)
                .requiredWidth(width = 144.dp)
                .requiredHeight(height = 185.dp)
        ) {
            Box(
                modifier = Modifier
                    .requiredWidth(width = 144.dp)
                    .requiredHeight(height = 185.dp)
            ) {
                Box(
                    modifier = Modifier
                        .requiredWidth(width = 143.dp)
                        .requiredHeight(height = 185.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .align(alignment = Alignment.TopCenter)
                            .offset(x = 0.dp,
                                y = 0.dp)
                            .requiredWidth(width = 143.dp)
                            .requiredHeight(height = 185.dp)
                            .background(color = Color.White)
                            .border(border = BorderStroke(0.dp, Color(0xff322514).copy(alpha = 0.75f))))
                }
                Text(
                    text = "Bouquet mawar",
                    color = Color(0xffeb7b8a),
                    textAlign = TextAlign.Center,
                    style = TextStyle(
                        fontSize = 10.sp,
                        fontWeight = FontWeight.Bold),
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 0.dp,
                            y = 127.5006103515625.dp)
                        .requiredWidth(width = 144.dp)
                        .requiredHeight(height = 13.dp)
                        .wrapContentHeight(align = Alignment.CenterVertically))
                Text(
                    text = "Dewaflorist",
                    color = Color(0xffeb7b8a),
                    textAlign = TextAlign.Center,
                    style = TextStyle(
                        fontSize = 9.sp),
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 0.dp,
                            y = 145.5006103515625.dp)
                        .requiredWidth(width = 144.dp)
                        .requiredHeight(height = 13.dp)
                        .wrapContentHeight(align = Alignment.CenterVertically))
                Text(
                    text = "Rp 100.000",
                    color = Color(0xff231f20),
                    textAlign = TextAlign.Center,
                    style = TextStyle(
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Medium),
                    modifier = Modifier
                        .align(alignment = Alignment.TopCenter)
                        .offset(x = 0.dp,
                            y = 162.dp)
                        .requiredWidth(width = 144.dp)
                        .requiredHeight(height = 13.dp)
                        .wrapContentHeight(align = Alignment.CenterVertically))
            }
            Image(
                painter = painterResource(id = R.drawable.bunga),
                contentDescription = "Bunga",
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 11.998046875.dp,
                        y = 13.5.dp)
                    .requiredWidth(width = 120.dp)
                    .requiredHeight(height = 105.dp))
        }
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 36.dp,
                    y = 544.dp)
                .requiredWidth(width = 144.dp)
                .requiredHeight(height = 185.dp)
        ) {
            Box(
                modifier = Modifier
                    .requiredWidth(width = 144.dp)
                    .requiredHeight(height = 185.dp)
            ) {
                Box(
                    modifier = Modifier
                        .requiredWidth(width = 143.dp)
                        .requiredHeight(height = 185.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .align(alignment = Alignment.TopCenter)
                            .offset(x = 0.dp,
                                y = 0.dp)
                            .requiredWidth(width = 143.dp)
                            .requiredHeight(height = 185.dp)
                            .background(color = Color.White)
                            .border(border = BorderStroke(0.dp, Color(0xff322514).copy(alpha = 0.75f))))
                }
                Text(
                    text = "Bouquet mawar",
                    color = Color(0xffeb7b8a),
                    textAlign = TextAlign.Center,
                    style = TextStyle(
                        fontSize = 10.sp,
                        fontWeight = FontWeight.Bold),
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 0.dp,
                            y = 127.5006103515625.dp)
                        .requiredWidth(width = 144.dp)
                        .requiredHeight(height = 13.dp)
                        .wrapContentHeight(align = Alignment.CenterVertically))
                Text(
                    text = "Dewaflorist",
                    color = Color(0xffeb7b8a),
                    textAlign = TextAlign.Center,
                    style = TextStyle(
                        fontSize = 9.sp),
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 0.dp,
                            y = 145.5006103515625.dp)
                        .requiredWidth(width = 144.dp)
                        .requiredHeight(height = 13.dp)
                        .wrapContentHeight(align = Alignment.CenterVertically))
                Text(
                    text = "Rp 100.000",
                    color = Color(0xff231f20),
                    textAlign = TextAlign.Center,
                    style = TextStyle(
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Medium),
                    modifier = Modifier
                        .align(alignment = Alignment.TopCenter)
                        .offset(x = 0.dp,
                            y = 162.dp)
                        .requiredWidth(width = 144.dp)
                        .requiredHeight(height = 13.dp)
                        .wrapContentHeight(align = Alignment.CenterVertically))
            }
            Image(
                painter = painterResource(id = R.drawable.bunga),
                contentDescription = "Bunga",
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 11.998046875.dp,
                        y = 13.5.dp)
                    .requiredWidth(width = 120.dp)
                    .requiredHeight(height = 105.dp))
        }
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 189.dp,
                    y = 544.dp)
                .requiredWidth(width = 144.dp)
                .requiredHeight(height = 185.dp)
        ) {
            Box(
                modifier = Modifier
                    .requiredWidth(width = 144.dp)
                    .requiredHeight(height = 185.dp)
            ) {
                Box(
                    modifier = Modifier
                        .requiredWidth(width = 143.dp)
                        .requiredHeight(height = 185.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .align(alignment = Alignment.TopCenter)
                            .offset(x = 0.dp,
                                y = 0.dp)
                            .requiredWidth(width = 143.dp)
                            .requiredHeight(height = 185.dp)
                            .background(color = Color.White)
                            .border(border = BorderStroke(0.dp, Color(0xff322514).copy(alpha = 0.75f))))
                }
                Text(
                    text = "Bouquet mawar",
                    color = Color(0xffeb7b8a),
                    textAlign = TextAlign.Center,
                    style = TextStyle(
                        fontSize = 10.sp,
                        fontWeight = FontWeight.Bold),
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 0.dp,
                            y = 127.5006103515625.dp)
                        .requiredWidth(width = 144.dp)
                        .requiredHeight(height = 13.dp)
                        .wrapContentHeight(align = Alignment.CenterVertically))
                Text(
                    text = "Dewaflorist",
                    color = Color(0xffeb7b8a),
                    textAlign = TextAlign.Center,
                    style = TextStyle(
                        fontSize = 9.sp),
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 0.dp,
                            y = 145.5006103515625.dp)
                        .requiredWidth(width = 144.dp)
                        .requiredHeight(height = 13.dp)
                        .wrapContentHeight(align = Alignment.CenterVertically))
                Text(
                    text = "Rp 100.000",
                    color = Color(0xff231f20),
                    textAlign = TextAlign.Center,
                    style = TextStyle(
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Medium),
                    modifier = Modifier
                        .align(alignment = Alignment.TopCenter)
                        .offset(x = 0.dp,
                            y = 162.dp)
                        .requiredWidth(width = 144.dp)
                        .requiredHeight(height = 13.dp)
                        .wrapContentHeight(align = Alignment.CenterVertically))
            }
            Image(
                painter = painterResource(id = R.drawable.bunga),
                contentDescription = "Bunga",
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 11.998046875.dp,
                        y = 13.5.dp)
                    .requiredWidth(width = 120.dp)
                    .requiredHeight(height = 105.dp))
        }
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 36.dp,
                    y = 544.dp)
                .requiredWidth(width = 144.dp)
                .requiredHeight(height = 185.dp)
        ) {
            Box(
                modifier = Modifier
                    .requiredWidth(width = 144.dp)
                    .requiredHeight(height = 185.dp)
            ) {
                Box(
                    modifier = Modifier
                        .requiredWidth(width = 143.dp)
                        .requiredHeight(height = 185.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .align(alignment = Alignment.TopCenter)
                            .offset(x = 0.dp,
                                y = 0.dp)
                            .requiredWidth(width = 143.dp)
                            .requiredHeight(height = 185.dp)
                            .background(color = Color.White)
                            .border(border = BorderStroke(0.dp, Color(0xff322514).copy(alpha = 0.75f))))
                }
                Text(
                    text = "Bouquet mawar",
                    color = Color(0xffeb7b8a),
                    textAlign = TextAlign.Center,
                    style = TextStyle(
                        fontSize = 10.sp,
                        fontWeight = FontWeight.Bold),
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 0.dp,
                            y = 127.5006103515625.dp)
                        .requiredWidth(width = 144.dp)
                        .requiredHeight(height = 13.dp)
                        .wrapContentHeight(align = Alignment.CenterVertically))
                Text(
                    text = "Dewaflorist",
                    color = Color(0xffeb7b8a),
                    textAlign = TextAlign.Center,
                    style = TextStyle(
                        fontSize = 9.sp),
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 0.dp,
                            y = 145.5006103515625.dp)
                        .requiredWidth(width = 144.dp)
                        .requiredHeight(height = 13.dp)
                        .wrapContentHeight(align = Alignment.CenterVertically))
                Text(
                    text = "Rp 100.000",
                    color = Color(0xff231f20),
                    textAlign = TextAlign.Center,
                    style = TextStyle(
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Medium),
                    modifier = Modifier
                        .align(alignment = Alignment.TopCenter)
                        .offset(x = 0.dp,
                            y = 162.dp)
                        .requiredWidth(width = 144.dp)
                        .requiredHeight(height = 13.dp)
                        .wrapContentHeight(align = Alignment.CenterVertically))
            }
            Image(
                painter = painterResource(id = R.drawable.bunga),
                contentDescription = "Bunga",
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 11.998046875.dp,
                        y = 13.5.dp)
                    .requiredWidth(width = 120.dp)
                    .requiredHeight(height = 105.dp))
        }
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 189.dp,
                    y = 744.dp)
                .requiredWidth(width = 144.dp)
                .requiredHeight(height = 185.dp)
        ) {
            Box(
                modifier = Modifier
                    .requiredWidth(width = 144.dp)
                    .requiredHeight(height = 185.dp)
            ) {
                Box(
                    modifier = Modifier
                        .requiredWidth(width = 143.dp)
                        .requiredHeight(height = 185.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .align(alignment = Alignment.TopCenter)
                            .offset(x = 0.dp,
                                y = 0.dp)
                            .requiredWidth(width = 143.dp)
                            .requiredHeight(height = 185.dp)
                            .background(color = Color.White)
                            .border(border = BorderStroke(0.dp, Color(0xff322514).copy(alpha = 0.75f))))
                }
                Text(
                    text = "Bouquet mawar",
                    color = Color(0xffeb7b8a),
                    textAlign = TextAlign.Center,
                    style = TextStyle(
                        fontSize = 10.sp,
                        fontWeight = FontWeight.Bold),
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 0.dp,
                            y = 127.5006103515625.dp)
                        .requiredWidth(width = 144.dp)
                        .requiredHeight(height = 13.dp)
                        .wrapContentHeight(align = Alignment.CenterVertically))
                Text(
                    text = "Dewaflorist",
                    color = Color(0xffeb7b8a),
                    textAlign = TextAlign.Center,
                    style = TextStyle(
                        fontSize = 9.sp),
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 0.dp,
                            y = 145.5006103515625.dp)
                        .requiredWidth(width = 144.dp)
                        .requiredHeight(height = 13.dp)
                        .wrapContentHeight(align = Alignment.CenterVertically))
                Text(
                    text = "Rp 100.000",
                    color = Color(0xff231f20),
                    textAlign = TextAlign.Center,
                    style = TextStyle(
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Medium),
                    modifier = Modifier
                        .align(alignment = Alignment.TopCenter)
                        .offset(x = 0.dp,
                            y = 162.dp)
                        .requiredWidth(width = 144.dp)
                        .requiredHeight(height = 13.dp)
                        .wrapContentHeight(align = Alignment.CenterVertically))
            }
            Image(
                painter = painterResource(id = R.drawable.bunga),
                contentDescription = "Bunga",
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 11.998046875.dp,
                        y = 13.5.dp)
                    .requiredWidth(width = 120.dp)
                    .requiredHeight(height = 105.dp))
        }
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 36.dp,
                    y = 744.dp)
                .requiredWidth(width = 144.dp)
                .requiredHeight(height = 185.dp)
        ) {
            Box(
                modifier = Modifier
                    .requiredWidth(width = 144.dp)
                    .requiredHeight(height = 185.dp)
            ) {
                Box(
                    modifier = Modifier
                        .requiredWidth(width = 143.dp)
                        .requiredHeight(height = 185.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .align(alignment = Alignment.TopCenter)
                            .offset(x = 0.dp,
                                y = 0.dp)
                            .requiredWidth(width = 143.dp)
                            .requiredHeight(height = 185.dp)
                            .background(color = Color.White)
                            .border(border = BorderStroke(0.dp, Color(0xff322514).copy(alpha = 0.75f))))
                }
                Text(
                    text = "Bouquet mawar",
                    color = Color(0xffeb7b8a),
                    textAlign = TextAlign.Center,
                    style = TextStyle(
                        fontSize = 10.sp,
                        fontWeight = FontWeight.Bold),
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 0.dp,
                            y = 127.5006103515625.dp)
                        .requiredWidth(width = 144.dp)
                        .requiredHeight(height = 13.dp)
                        .wrapContentHeight(align = Alignment.CenterVertically))
                Text(
                    text = "Dewaflorist",
                    color = Color(0xffeb7b8a),
                    textAlign = TextAlign.Center,
                    style = TextStyle(
                        fontSize = 9.sp),
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 0.dp,
                            y = 145.5006103515625.dp)
                        .requiredWidth(width = 144.dp)
                        .requiredHeight(height = 13.dp)
                        .wrapContentHeight(align = Alignment.CenterVertically))
                Text(
                    text = "Rp 100.000",
                    color = Color(0xff231f20),
                    textAlign = TextAlign.Center,
                    style = TextStyle(
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Medium),
                    modifier = Modifier
                        .align(alignment = Alignment.TopCenter)
                        .offset(x = 0.dp,
                            y = 162.dp)
                        .requiredWidth(width = 144.dp)
                        .requiredHeight(height = 13.dp)
                        .wrapContentHeight(align = Alignment.CenterVertically))
            }
            Image(
                painter = painterResource(id = R.drawable.bunga),
                contentDescription = "Bunga",
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 11.998046875.dp,
                        y = 13.5.dp)
                    .requiredWidth(width = 120.dp)
                    .requiredHeight(height = 105.dp))
        }
        Text(
            text = "20 Items",
            color = Color(0xff322514),
            style = TextStyle(
                fontSize = 12.sp),
            modifier = Modifier
                .align(alignment = Alignment.TopCenter)
                .offset(x = (-135).dp,
                    y = 105.dp))
        Image(
            painter = painterResource(id = R.drawable.backarrow),
            contentDescription = "Back Arrow",
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 22.dp,
                    y = 49.dp)
                .requiredSize(size = 24.dp))
    }
}

@Preview(widthDp = 360, heightDp = 800)
@Composable
private fun ProductListPreview() {
    ProductList(Modifier)
}