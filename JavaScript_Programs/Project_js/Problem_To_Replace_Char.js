// prompt(`Enter Name : `);
let Name = prompt(`Enter Name : `);
alert("Welcome " + Name  );
// let Name = "Pranav";
console.log("Hello " + Name + ", Welcome to our website!");
console.log(Name.length);
let element="";


if (Name.length > 0) {
  for (let index = 0; index < Name.length; index++) {
    element += Name[index];
    console.log(element);
  }
  //   console.log(element.replace("P","A"));
}
console.log(element);
let y = prompt(`char replace with`);
let x = prompt(`Enter  Char to replace`);


alert(element.replace(y, x));
