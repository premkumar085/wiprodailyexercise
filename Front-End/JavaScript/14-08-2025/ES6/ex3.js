class Util {
  getDate() {
    let date = new Date();
    return `${date.getDate()}-${date.getMonth() + 1}-${date.getFullYear()}`;
  }

  getPIValue() {
    return Math.PI;
  }

  convertC2F(c) {
    return (c * 9 / 5) + 32;
  }

  getFibonacci(n) {
  let fib = [];
  for (let i = 0; i < n; i++) {
    if (i < 2) fib[i] = i;
    else fib[i] = fib[i - 1] + fib[i - 2];
  }
  return fib;

  }
}

let u = new Util();
console.log(u.getDate());           
console.log(u.getPIValue());        
console.log(u.convertC2F(25));     
console.log(u.getFibonacci(5));    
