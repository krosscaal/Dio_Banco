function escada(altura) {
    let espaco = " ";
    let degrau = "";
    let piso = "#";
    var minhaEscada = [];
    for (var i = 1; i <= altura; i++) {
        b = piso.repeat(i);
        a = espaco.repeat(altura - i);
        degrau = a + b;
        minhaEscada.push(degrau);
    }
    return minhaEscada;

}
console.log(escada(6));
console.log(escada(10));