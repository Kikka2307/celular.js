function preguntarPeso (){
    peso = prompt("¿Cual es tu peso?");
    if(peso>20){
        console.log("Peso ideal");
    } else if (peso< 20){
        console.log("Consulta con tu medico");
    } else{
        console.log("Vuelve a intentar");
    }
}


function preguntarEstatura (){
     estatura= prompt("¿Cual es tu estatura?");
}

function Escribir(a,b,c){
    document.getElementById("IMC").innerHTML=a;
    document.getElementById("PESO y ESTATURA").innerHTML=b;
    document.getElementById("Calucula tu IMC").innerHTML=c;
}

function indiceMasacorporal (peso){
    const estatura = 100;
    imc = peso * estatura * estatura / 100;
    return imc;
}
