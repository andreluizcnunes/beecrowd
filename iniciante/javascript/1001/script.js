// https://www.beecrowd.com.br/judge/pt/problems/view/1001
var input = require('fs').readFileSync('stdin', 'utf8');
var lines = input.split('\n');

let A = parseInt(lines.shift());
let B = parseInt(lines.shift());

let X = A + B;

console.log("X = " + X);