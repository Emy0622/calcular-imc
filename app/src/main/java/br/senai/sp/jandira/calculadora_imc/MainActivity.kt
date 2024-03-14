package br.senai.sp.jandira.calculadora_imc

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.calculadora_imc.ui.theme.Calculadora_IMCTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Calculadora_IMCTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting() {
    Column {



        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxWidth()
                .background(
                    color = Color(0xFFEB1450)
                )
                .height(220.dp)
        ) {

            Card (shape = CircleShape,
                modifier = Modifier.size(80.dp)
                    .padding(bottom = 0.dp)
            ){
                Image(
                    painter = painterResource(
                        id = R.drawable.bmi),
                    contentDescription = "imc"
                )
            }

            Text(
                modifier = Modifier
                    .padding(top = 5.dp),
                text = "Calculadora IMC",
                color = Color.White,
                fontWeight = FontWeight.ExtraBold,
                fontSize = 34.sp,
                fontFamily = FontFamily.SansSerif


            )
        }
        Column(
            modifier = Modifier
                .offset(y = -50.dp)
        ) {
                Box(
                    modifier = Modifier
                        .padding(horizontal = 35.dp)
                        .background(
                            color = Color(0xFFE7E7E7),
                            shape = RoundedCornerShape(
                                topStart = 10.dp,
                                topEnd = 10.dp,
                                bottomEnd = 10.dp,
                                bottomStart = 10.dp,

                                )
                        )
                ) {

                    Column(
                        modifier = Modifier
                            .padding(horizontal = 60.dp)
                            .padding(20.dp),
                        verticalArrangement = Arrangement.SpaceBetween,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text(
                            text = "Seus dados",
                            fontSize = 30.sp,
                            fontWeight = FontWeight.Bold,
                            color = (Color(0xFFEB1450)),
                            modifier = Modifier
                                .padding(top = 16.dp)
                        )
                    }
//                        Column(
//                            horizontalAlignment = Alignment.CenterHorizontally,
//                        ) {
                    Column(
                        modifier = Modifier
                            .padding(top = 95.dp)
                            .padding(20.dp),
                    ) {
                        Text(
                            text = "Seu peso:",
                            color = Color.Red
                        )
                        OutlinedTextField(
                            value = "",
                            onValueChange = {},
                            label = {
                                Text(text = "Seu peso")

                            }
                        )
                        Text(
                            text = "Sua altura:",
                            modifier = Modifier
                                .padding(top = 20.dp),
                            // .align(alignment = Alignment.CenterHorizontally),
                            color = Color(0xFFEB1450)
                        )
                        OutlinedTextField(
                            value = "",
                            onValueChange = {},
                            label = {
                                Text(text = "Sua altura")

                            }
                        )
                        Button(
                            onClick = { /*TODO*/ },
                            modifier = Modifier
                                .padding(top = 20.dp)
                                .fillMaxWidth()
                                .height(70.dp)
                                .padding(9.dp),
                            colors = ButtonDefaults
                                .buttonColors(
                                    containerColor = Color(0xFFEB1450)
                                )

                        ) {

                            Text(
                                text = "CALCULAR",
                                fontSize = 20.sp
                            )
                        }
                    }
                }
            }
    }
}


    @Preview(showBackground = true, showSystemUi = true)
    @Composable
    fun GreetingPreview() {
        Calculadora_IMCTheme {
            Greeting()
        }
    }

