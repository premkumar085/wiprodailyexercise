class Vehicle {
  constructor(make, model, year) {
    this.make = make;
    this.model = model;
    this.year = year;
  }

  getInfo() {
    return `Make: ${this.make}, Model: ${this.model}, Year: ${this.year}`;
  }
}

class Car extends Vehicle {
  constructor(make, model, year, numDoors) {
    super(make, model, year);
    this.numDoors = numDoors;
  }

  getInfo() {
    return `Make: ${this.make}, Model: ${this.model}, Year: ${this.year}, Doors: ${this.numDoors}`;
  }
}

let myCar = new Car("KiA", "Honda", 2025, 4);
console.log(myCar.getInfo()); 
