import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'ex3ctof'
})
export class Ex3ctofPipe implements PipeTransform {

  transform(value: unknown, ...args: unknown[]): unknown {
  const celsius = Number(value);
    const fahrenheit = (celsius * 9/5) + 32;
    return `${fahrenheit}F`;
}
}
