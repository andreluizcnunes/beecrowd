var input = require('fs').readFileSync('stdin', 'utf8');
var lines = input.split('\n');

var a = Number(lines[0]);
var b =  Number(lines[1]);

var soma = a + b;

console.log(soma + '\n');