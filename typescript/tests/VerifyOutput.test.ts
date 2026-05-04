import { test, expect, jest } from '@jest/globals';
import { main } from '../src/GildedRose';
import expected30days from './outputs/expected30days';

test('30 day simulation', () => {
  console.log = jest.fn();
  main();

  expect(console.log).toHaveBeenCalledTimes(372);
  expected30days.split('\n').map((line) => line === '' ? '\n' : line).forEach((line, index) => {
    expect(console.log).toHaveBeenNthCalledWith(index + 1, line);
  });
});