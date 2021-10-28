const express = require("express");
const app = express();
const bodyParser = require("body-parser");
const connection = require("./database/database");
const Pergunta = require("./database/Pergunta");

// Database

connection.authenticate().then(() => {
    console.log("Conexão feita com o banco de dados!")
})
.catch((msgErro) => {
    console.log(msgErro);
})

// ESTOU DIZENDO PARA O EXPRESS USAR O EJS COMO VIEW ENGINE
app.set('view engine', 'ejs');
app.use(express.static('public'));
// Body Parser
app.use(bodyParser.urlencoded({extended:false}));
app.use(bodyParser.json());

//ROTAS
app.get("/", (req, res) => {
    Pergunta.findAll({ raw: true, order:[
        ['id','desc']
    ]}).then(perguntas => {
        res.render("index.ejs",{   
         perguntas: perguntas
        });
    });
});


app.get("/perguntar",(req, res) =>{
    res.render("perguntar");
})

app.post("/salvarpergunta",(req, res) => {
    var titulo = req.body.titulo;
    var descricao = req.body.descricao;
    Pergunta.create({
        titulo: titulo,
        descricao: descricao
    }).then(() => {
        res.redirect("/");
    });
    
});

app.listen(8080,() => {console.log("App rodando!");});