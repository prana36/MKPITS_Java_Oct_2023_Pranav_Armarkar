// //Use reduce to calculate factorial of a given nubers from an array of first 'n'
// //Natural numbers ('n' being the numbers whose factorial beeds to be calculated)

// // let range = prompt(`enter range `);
// // let myarr = [];

// // for (let index = 0; index < range; index++) {
// //   let array = [prompt(`enter ${index + 1} array`)];
// //   myarr.push(array);
// // }
// // console.log(myarr);
// //  let fact = myarr.reduce(factorial);

//  let n = 3;
// function factorial(n) {
// 	if (n === 0) {
// 		return 1;
// 	}
// 	else {
// 		return n * factorial( n - 1 );
// 	}
// }

// console.log(factorial(n));

// const details = {
//   name: "Vaibhav",
//   Roll: 23,
//   mob: 0o455334,
// };
// details.name = "Paidal";
// // for (const iterator of details) {
// //     console.log(iterator);
// // }

// console.log(details.name);
// //delete details.mob;
// console.log(details.mob);
// // console.log(details.name);
// // details.work = "teacher";
// // console.log(details.work);
// // console.log(details);

function calculateFactorials(n) {
  if (n < 0) {
    throw new Error("Factorial is not defined for negative numbers");
  }

  // Create an array of the first 'n' natural numbers
  const numbers = Array.from({ length: n }, (_, i) => i + 1);

  // Use reduce to calculate factorials for each number
  return numbers.reduce((factorials, number, index) => {
    // If it's the first element (factorial of 0), set it to 1
    if (index === 0) {
      factorials[number - 1] = 1;
      return factorials;
    }

    // Calculate factorial using previous factorial
    factorials[number - 1] = factorials[number - 2] * number;
    return factorials;
  }, new Array(n).fill(0)); // Initialize an array to store factorials
}

// Example usage
const n = 5;
const factorials = calculateFactorials(n);

console.log(factorials); // Output: [1, 1, 2, 6, 24]
