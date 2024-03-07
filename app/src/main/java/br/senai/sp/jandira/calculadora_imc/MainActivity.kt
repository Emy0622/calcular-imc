package br.senai.sp.jandira.calculadora_imc

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
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
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Red)
                .height(220.dp)
        ) {
            Text(
                modifier = Modifier
                    .padding(top = 35.dp),
                text = "Calculadora IMC",
                color = Color.White,
                fontWeight = FontWeight.ExtraBold,
                fontSize = 34.sp,
                fontFamily = FontFamily.SansSerif


            )
        }
        Column(
            modifier = Modifier
                .offset(y = -80.dp)
        ){
            Card(
                modifier = Modifier
                    .padding(39.dp)
                    .height(400.dp)



            ) {
                Column(
                    //                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .padding(horizontal = 40.dp)
                        .padding(30.dp)

                ) {
                    Text(
                        modifier = Modifier
                            .padding(top = 5.dp),
                        text = "Seus Dados",
                        fontWeight = FontWeight.ExtraBold,
                        color = Color.Red,
                        fontSize = 30.sp,
                        fontFamily = FontFamily.SansSerif
                    )

//                }
//                Column(
//                    horizontalAlignment = Alignment.CenterHorizontally,
//                ) {


                    Text(
                        text = "Peso",
                        modifier = Modifier
                            .padding(top = 10.dp),
                           // .align(alignment = Alignment.CenterHorizontally),
                        color = Color(0XFFEB1450)
                    )
                    OutlinedTextField(
                        value = "",
                        onValueChange = {},
                        label = {
                            Text(text = "Seu peso")

                        }

                    )

                    Text(
                        text = "Sua altura",
                        modifier = Modifier
                            .padding(bottom = 5.dp),
                        color = Color(0XFFEB1450)
                    )
                    OutlinedTextField(
                                value = "",
                        onValueChange = {},
                        label = {
                            Text(text = "Seu peso")
                        }
                    )
                    Button(
                        onClick = { /*TODO*/ },
                        modifier = Modifier
                            .padding(horizontal = 0.dp)
                            .fillMaxWidth()
                            .height(76.dp)
                            .padding(9.dp),

                        colors = ButtonDefaults
                            .buttonColors(
                                containerColor = Color(0xFFFF0303)
                            )

                    ) {

                        Text(
                            text = "Calcular",
                            fontSize = 20.sp
                        )
                    }
                }
                //                Column(
                //                    modifier = Modifier
                //                        .fillMaxWidth()
                //                        .background(color = Color.LightGray)
                //                        .height(350.dp),
                //                    horizontalAlignment = Alignment.CenterHorizontally,
                //                    verticalArrangement = Arrangement.Top
                //
                //                ) {
                ////                    Text(
                ////                        modifier = Modifier
                ////                            .padding(top = 30.dp),
                ////                        text = "Seus Dados",
                ////                        fontWeight = FontWeight.ExtraBold,
                ////                        color = Color.Red,
                ////                        fontSize = 30.sp,
                ////                        fontFamily = FontFamily.SansSerif
                ////                    )
                ////                }
                //                Column(
                //                    modifier = Modifier
                //                        .padding(horizontal = 22.dp)
                //                        .padding(24.dp)
                //                ) {
                //                    Text(text = "Seu peso",
                //                        color = Color.Black)
                //                    TextField(value = "",
                //                        onValueChange = {},
                //                        modifier = Modifier
                //                            .padding(bottom = 40.dp, top = 10.dp)
                //                            .fillMaxWidth()
                //                    )

                //             horizontalAlignment = Alignment.CenterHorizontally){
                //       Text(
                //        modifier = Modifier
                //         .padding(top = 30.dp, bottom = 8.dp),
                //        text = "Seu peso"
                //     )
                //   TextField(
                //    value = "",
                //      onValueChange = {},
                //         modifier = Modifier
                //              .padding(bottom = 32.dp, top = 8.dp)
                //             .fillMaxWidth()


                //   .padding(20.dp),

                //  ) {
//                    Text(
//                        text = "E-mail",
//                        color = Color.White
//                    )
//                    TextField(
//                        value = "",
//                        onValueChange = {},
//                        modifier = Modifier
//                            .padding(bottom = 32.dp, top = 8.dp)
//                            .fillMaxWidth()
//
//                    )
//                    Text(text = "Senha", color = Color.White)
//                    TextField(
//                        value = "",
//                        onValueChange = {},
//                        modifier = Modifier
//                            .padding(top = 8.dp)
//                            .fillMaxWidth()
//
//                    )
//                            Row(
//                                verticalAlignment = Alignment.CenterVertically,
//                                horizontalArrangement = Arrangement.End,
//                                modifier = Modifier.fillMaxWidth()
//                            ) {
//                                Checkbox(
//                                    checked = true,
//                                    onCheckedChange = {},
//                                    colors = CheckboxDefaults.colors(
//                                        checkedColor = Color(
//                                            0xFF4B01C4
//                                        )
//                                    )
//
//                                )
//                                Text(
//                                    text = "Lembrar",
//                                    color = Color.White
//                                )
//                            }
//                        }
//
//                    }
//
//                    Button(
//                        onClick = { /*TODO*/ },
//                        modifier = Modifier
//                            .padding(horizontal = 24.dp)
//                            .fillMaxWidth()
//                            .height(58.dp),
//                        colors = ButtonDefaults
//                            .buttonColors(
//                                containerColor = Color(0xFF331747)
//                            )
//
//                    ) {
//
//                        Text(
//                            text = "Entrar",
//                            fontSize = 22.sp
//                        )
//                    }
//                    Text(
//                        text = "Desenvolvido pela arty :)",
//                        color = Color.White,
//                        modifier = Modifier.padding(bottom = 8.dp)
//                    )
//                }
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

