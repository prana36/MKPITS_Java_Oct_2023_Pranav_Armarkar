// Compares inequality of two operands. True if operands are not equal.
let a = 1;
let b = 2;
let c = new String("Hello");
let d = new String("Hello");
let e = "Hello";

console.log(a != b);
console.log(c != d);
console.log(c != e);

console.log("---------");
// The strict equality operator (===) returns true if the operands are strictly equal, which means both value and type must be identical.
let a1 = {
  name: "Ram",
};
let b1 = {
  name: "Ram",
};
console.log(a1 != b1);
