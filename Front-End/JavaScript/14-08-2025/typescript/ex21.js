var Box = /** @class */ (function () {
    function Box(value) {
        this.value = value;
    }
    Box.prototype.getValue = function () {
        return this.value;
    };
    return Box;
}());
var numberBox = new Box(420);
console.log("Number Box Value:", numberBox.getValue());
var stringBox = new Box("Prem Kumar");
console.log("String Box Value:", stringBox.getValue());
