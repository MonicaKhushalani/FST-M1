
import pytest
import math
## Adding
def test_sum():
    num1 = 10
    num2 =20
    sum = num1 + num2
    assert sum == 30
##Subtract
def test_subtract():
    num1 = 10
    num2 = 5
    diff = num1 -num2
    assert diff == 5
##Multiply
def test_multiply():
    num1 = 10
    num2 =10
    prod = num1*num2
    assert prod ==100
##Division
def test_division():
    num1 = 100
    num2 = 2
    quot = num1/num2
    assert quot == 50             
