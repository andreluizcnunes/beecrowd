// https://www.beecrowd.com.br/judge/pt/problems/view/1002
var input = require('fs').readFileSync('stdin', 'utf8');
var lines = input.split('\n');

let n = 3.14159;

let raio = parseFloat(lines.shift());

let area = n * (raio * raio);

console.log("A=" + area.toFixed(4));
