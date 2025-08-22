import { Directive, ElementRef } from '@angular/core';

@Directive({
  selector: '[appEx4colordir]'
})
export class Ex4colordir {

  constructor(private elementRef: ElementRef) {
    this.elementRef.nativeElement.style.color = 'yellow';
    this.elementRef.nativeElement.style.textDecoration = 'line-through';
  }

}
