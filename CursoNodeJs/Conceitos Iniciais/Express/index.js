const express = require("express"); /* Importando o express */
const app = express(); /* Iniciando o express */

/* ROTAS */
app.get("/", function(req,res){
    res.send("Bem vindo ao guia do programador");
});
app.get("/blog/:artigo?", function(req, res){

    var artigo = req.params.artigo;
    if(artigo){
        res.send(`<h2>Artigo: ${artigo}` )
    }else{
        res.send("Bem vindo ao meu blog!")
    }
    
})
app.get("/canal/youtube", function(req, res){
    var canal = req.query["canal"];

    if(canal){
        res.send(canal);
    }else{
        res.send("Nenhum canal fornecido");
        }
})

app.get("/davi", function(req, res){
    res.send("Cu do davi");
})

app.get("/ola/:nome/:empresa", function(req, res){
    // REQ => DADOS ENVIADOS PELO USUARIO
    // RES => DADOS ENVIADOS PELO PARA O USUARIO
    var nome = req.params.nome;
    var empresa = req.params.empresa;
    res.send(`<h1>Oi ${nome} do ${empresa} </h1>`)
})


app.listen(4000,function(erro){
    if(erro){
        console.log("Ocorreu um erro");
    }else{
        console.log("Servidor iniciado com sucesso!")
    }
})

