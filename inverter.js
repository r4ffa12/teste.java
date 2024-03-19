function inverterString(texto){
    let caracteres = texto.split("");
    let inicio = 0;
    let fim = caracteres.length - 1;

    while ( inicio < fim){
        let temp = caracteres[inicio];
        caracteres[inicio] = caracteres[fim];
        caracteres[fim] = temp;

        inicio++;
        fim--;
    }

    return caracteres.join("");
}
 
