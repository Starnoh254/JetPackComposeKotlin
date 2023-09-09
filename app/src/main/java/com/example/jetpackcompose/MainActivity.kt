package com.example.jetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcompose.ui.theme.JetPackComposeTheme
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.ui.res.stringResource

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetPackComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ComposeArticle()

                }
            }
        }
    }
}

@Composable
fun ComposeArticle(modifier: Modifier = Modifier){
    val image = painterResource(id = R.drawable.bg_compose_background)
    Column() {
        Image(painter = image, contentDescription = null,modifier = modifier.fillMaxWidth())
        Text(
            text = stringResource(id = R.string.app_heading),
            fontSize = 24.sp,
            modifier = modifier.padding(16.dp)
        )
        Text(
            text = stringResource(id = R.string.app_subheading),
            modifier = modifier
                .padding(end = 16.dp, start = 16.dp),
            textAlign = TextAlign.Justify
        )
        Text(
            text = stringResource(id = R.string.app_content),
            modifier = modifier.padding(16.dp),
            textAlign = TextAlign.Justify
        )
    }

}

@Preview(showBackground = true,
showSystemUi = true)
@Composable
fun GreetingPreview() {
    JetPackComposeTheme {
        ComposeArticle()
    }
}