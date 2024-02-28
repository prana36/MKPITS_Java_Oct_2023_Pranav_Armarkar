let a = 2;
(b = 2), (c = 3);
let d = { name: "Ram" };
let e = { name: "Ram" };
let f = e;

console.log(a !== b);
console.log(a !== c);
console.log(d !== e);
console.log(f !== e);

console.log("----------------");

let a1 = 2;
let b1 = "2";
let c1 = true;
let d1 = null;
let e1 = undefined;

console.log(a1 !== b1);
console.log(a1 !== c1);
console.log(d1 !== e1);
