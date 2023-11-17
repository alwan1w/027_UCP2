package com.example.pertemuan7_contact

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.pertemuan9.HalamanHome
import com.example.pertemuan9.R
import com.example.pertemuan9.ui.theme.Pertemuan9Theme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HalamanSatu(
    onSubmitButtonClicked: (MutableList<String>) -> Unit,
){
    var namaMahasiswa by rememberSaveable { mutableStateOf("") }
    var nim by remember { mutableStateOf("") }
    var konsentrasi by remember { mutableStateOf("") }
    var judulSkripsi by remember { mutableStateOf("") }
    var listData: MutableList<String> = mutableListOf(namaMahasiswa, nim, konsentrasi, judulSkripsi)

    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center
    ){
        Text(text = "Formulir Pengajuan Skripsi")
        OutlinedTextField(
            value = namaMahasiswa,
            onValueChange = {namaMahasiswa =it},
            label = { Text(text ="Nama Mahasiswa") })
        OutlinedTextField(
            value = nim,
            onValueChange = {nim =it},
            label = { Text(text ="NIM") })
        OutlinedTextField(
            value = konsentrasi,
            onValueChange = {konsentrasi =it},
            label = { Text(text ="Knsentrasi") })
        Spacer(modifier = Modifier.padding(16.dp))
        Button(onClick = {onSubmitButtonClicked(listData)}) {
            Text(text = stringResource(id = R.string.submit_button))

        }
    }
}
@Preview(showBackground = true)
@Composable
fun prev() {
    Pertemuan9Theme {
        HalamanSatu{}
    }
}