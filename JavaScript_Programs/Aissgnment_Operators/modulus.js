// JavaScript remainder assignment operator (%=) assigns the remainder
// to the variable after dividing a variable by the value of the right operand.

// Syntax:

// Operator: x %= y
// Meaning:  x  = x % y


let gfg = 3;

console.log((gfg %= 2));

console.log((gfg %= 0));

console.log((gfg %= "world"));





let num = 16;

// Test if its divisible by 4
if (num % 4 == 0) {
	console.log(true);
}
// Test for even number
if (num % 2 == 0) {
	console.log(true);
} else {
	console.log(false);
}

// Test for odd number
if (!(num % 2 == 0)) {
	console.log(true);
} else {
	console.log(false);
};
