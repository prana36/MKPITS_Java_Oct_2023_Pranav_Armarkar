//The entries() method of Array instances returns a new array iterator object that contains 
//the key/value pairs for each index in the array.

const array1 = ['a', 'b', 'c'];

const iterator1 = array1.entries();

console.log(iterator1.next().value);
// Expected output: Array [0, "a"]

console.log(iterator1.next().value);
// Expected output: Array [1, "b"]

const a = ["a", "b", "c"];

for (const [index, element] of a.entries()) {
  console.log(index, element);
}