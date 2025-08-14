let persons = [
    { name: "Vijay", age: 25, city: "Hyderabad" },
    { name: "Kumar", age: 17, city: "Delhi" },
    { name: "Afroj", age: 20, city: "Mumbai" },
    { name: "Lucky", age: 16, city: "Chennai" },
    { name: "Hari", age: 30, city: "Bengaluru" },
    { name: "Phuspa Raj", age: 18, city: "Vijag" }
];


persons.map(p => p.status = p.age >= 18 ? "Adult" : "Minor");

console.log(persons);

var updatedPersons = []; 

for (let i = 0; i < persons.length; i++) {
    let person = persons[i];

    if (person.age >= 18) {
        person.status = "Adult";
    } else {
        person.status = "Minor";
    }

    updatedPersons.push(person); 
}

console.log(updatedPersons);