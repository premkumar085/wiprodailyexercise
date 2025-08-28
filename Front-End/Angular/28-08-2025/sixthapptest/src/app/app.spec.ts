import { App } from './app';

describe('App Test', () => {
  let component: App;

  beforeEach(() => {
    component = new App();
  });

  // it('Test Case 1 - Add', () => {
  //   let value = component.add(2, 3);
  //   expect(value).toBe(5);
  // });

  // it('Test Case 2 - Multiply', () => {
  //   let value = component.multiply(2, 3);
  //   expect(value).toBe(6);
  // });

  it('Test Case 1 - Palindrome true', () => {
    let value = component.isPalindrome('madam');
    expect(value).toBe(true);
  });

  it('Test Case 2 - Palindrome false', () => {
    let value = component.isPalindrome('hello');
    expect(value).toBe(false);
  });
});
