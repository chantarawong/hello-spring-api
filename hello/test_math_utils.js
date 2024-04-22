// Path: test/test_math_utils.js
// Description: This file will contain tests for each of the functions in the ./math-utils folder.
// It should use the Chai library for assertions.
// It should use the Mocha library for running tests.
// It should import the functions from the math-utils folder to test them.
// It should use the describe function to group the tests for each function.
// It should generate a variety of tests for each function, including edge cases.

const math_utils_add = require('./math_utils_add');

const { expect } = require('chai');

describe('Math Utils', () => {
  describe('Add', () => {
    it('should return 3 when adding 1 and 2', () => {
      expect(math_utils_add(1, 2)).to.equal(3);
    });

    it('should return 0 when adding -1 and 1', () => {
      expect(math_utils_add(-1, 1)).to.equal(0);
    });

    it('should return 0 when adding 0 and 0', () => {
      expect(math_utils_add(0, 0)).to.equal(0);
    });
  });
});

//colipot, please validate that both a and b are number
//copilot, please validate that both a and b are number
describe('Math Utils', () => {
  describe('Add', () => {
    it('should return 0 when adding "a" and "b"', () => {
      expect(math_utils_add("a", "b")).to.equal(0);
    });
  });
});

//copilot, please validate that both a are number and b are string  
describe('Math Utils', () => {
  describe('Add', () => {
    it('should return 0 when adding "a" and 1', () => {
      expect(math_utils_add("a", 1)).to.equal(0);
    });

    it('should return 0 when adding 1 and "b"', () => {
      expect(math_utils_add(1, "b")).to.equal(0);
    });
  });
});