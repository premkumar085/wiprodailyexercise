let names = ["Prem Kumar", "Vijay", "Afroj", "Vali", "Nani", "Harsha"];

let longNames = names.filter(name => name.length > 5);

let upperCaseNames = longNames.map(name => name.toUpperCase());


console.log(upperCaseNames);


let result = names
    .filter(name => name.length > 5)  // keep only names longer than 5 chars
    .map(name => name.toUpperCase()); // convert to uppercase

console.log(result);
