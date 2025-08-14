class Stack<T> {
    items: T[] = [];

    push(item: T): void {
        this.items.push(item);
    }

    pop(): T | undefined {
        return this.items.pop();
    }

    peek(): T | undefined {
        return this.items[this.items.length - 1];
    }
}

const numberStack = new Stack<number>();
numberStack.push(10);
numberStack.push(20);
numberStack.push(30);

console.log("Top element:", numberStack.peek()); 
console.log("Popped element:", numberStack.pop()); 
console.log("Top element after pop:", numberStack.peek()); 

const stringStack = new Stack<string>();
stringStack.push("A");
stringStack.push("B");
stringStack.push("C");
console.log("Top element:", stringStack.peek());
console.log("Popped element:", stringStack.pop()); 
console.log("Top element after pop:", stringStack.peek()); 