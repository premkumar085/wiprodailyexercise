class Box<T> {
    value: T;

    constructor(value: T) {
        this.value = value;
    }

    getValue(): T {
        return this.value;
    }
}

const numberBox = new Box<number>(420);
console.log("Number Box Value:", numberBox.getValue());

const stringBox = new Box<string>("Prem Kumar");
console.log("String Box Value:", stringBox.getValue());
