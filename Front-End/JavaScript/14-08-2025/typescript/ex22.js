var Stack = /** @class */ (function () {
    function Stack() {
        this.items = [];
    }
    Stack.prototype.push = function (item) {
        this.items.push(item);
    };
    Stack.prototype.pop = function () {
        return this.items.pop();
    };
    Stack.prototype.peek = function () {
        return this.items[this.items.length - 1];
    };
    return Stack;
}());
var numberStack = new Stack();
numberStack.push(10);
numberStack.push(20);
numberStack.push(30);
console.log("Top element:", numberStack.peek());
console.log("Popped element:", numberStack.pop());
console.log("Top element after pop:", numberStack.peek());
var stringStack = new Stack();
stringStack.push("A");
stringStack.push("B");
stringStack.push("C");
console.log("Top element:", stringStack.peek());
console.log("Popped element:", stringStack.pop());
console.log("Top element after pop:", stringStack.peek());
