class Calculator {
    add(a: number, b: number): number {
        return a + b;
    }

    subtract(a: number, b: number): number {
        return a - b;
    }
}

const calculator = new Calculator();

console.log("Addition:", calculator.add(20, 19));     
console.log("Subtraction:", calculator.subtract(20, 19));
