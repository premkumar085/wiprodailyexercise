function pair<T, U>(first: T, second: U): [T, U] {
    return [first, second];
}

const Pair1 = pair<number, string>(101, "Prem Kumar");
console.log(Pair1);

const Pair2 = pair<boolean, string>(true, "Vijay");
console.log(Pair2);
