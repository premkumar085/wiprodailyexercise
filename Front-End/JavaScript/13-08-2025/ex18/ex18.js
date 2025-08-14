function calculate(operation) {
    let num1 = Number(document.getElementById("num1").value);
    let num2 = Number(document.getElementById("num2").value);
    let result;

    if (operation === 'add') {
        result = num1 + num2;
    }
    if (operation === 'subtract') {
        result = num1 - num2;
    }
    if (operation === 'multiply') {
        result = num1 * num2;
    }
    if (operation === 'divide') {
        if (num2 === 0) {
            result = "Cannot divide by zero";
        } else {
            result = num1 / num2;
        }
    }

    document.getElementById("result").textContent = result;
}
