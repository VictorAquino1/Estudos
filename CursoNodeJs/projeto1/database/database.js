const { Sequelize } = require('sequelize')
const sequelize = require('sequelize')

const connection = new Sequelize('guiaperguntas','root','1234', {
    host: 'localhost',
    dialect: 'mysql'
});

module.exports = connection;