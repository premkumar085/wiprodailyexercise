let persons = [
    { name: "Vijay", age: 25, city: "Hyderabad" },
    { name: "Kumar", age: 17, city: "Delhi" },
    { name: "Afroj", age: 20, city: "Mumbai" },
    { name: "Lucky", age: 16, city: "Chennai" },
    { name: "Hari", age: 30, city: "Bengaluru" },
    { name: "Phuspa Raj", age: 18, city: "Vijag" }
];

for (let i = 0; i < persons.length; i++) {
    if (persons[i].age >= 18) {
        persons[i].status = "Adult";
    } else {
        persons[i].status = "Minor";
    }
}

console.log(persons);