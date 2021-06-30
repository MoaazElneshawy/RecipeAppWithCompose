package com.moaazelneshawy.recipecompose

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HappyMealDetails()
        }
    }

    @Preview
    @Composable
    fun HappyMealDetails() {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState()) // make column scrollable
                .background(Color(0xFFF1F1F1))
        ) {
            Image(
                painter = painterResource(id = R.drawable.happy_meal_small),
                contentDescription = "happyMeal",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .height(250.dp)
                    .fillMaxWidth()
            )
            Column(
                Modifier
                    .padding(10.dp)
                    .fillMaxHeight()
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        text = "HAPPY MEAL",
                        style = TextStyle(
                            fontWeight = FontWeight.Bold,
                            fontSize = 32.sp
                        ),
                        modifier = Modifier.align(Alignment.CenterVertically)
                    )
                    Text(
                        text = "$ 3.45",
                        style = TextStyle(
                            fontSize = 20.sp
                        ),
                        color = Color(0xFF00802b),
                        modifier = Modifier.align(Alignment.CenterVertically)
                    )
                }
                Spacer(modifier = Modifier.padding(top = 10.dp)) // add space as margin
                Text(
                    text = "800 calories",
                    style = TextStyle(
                        fontSize = 26.sp
                    )
                )
                Spacer(modifier = Modifier.padding(top = 40.dp)) // add space as margin
                Button(
                    modifier = Modifier.align(Alignment.CenterHorizontally),
                    onClick = { /*TODO*/ }) {
                    Text(text = "Order Now")
                }

            }
        }
    }
}
