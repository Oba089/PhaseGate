import unittest

from mini_parking_system_function import parked_car

class TestForMiniParkingSystem(unittest.TestCase):

    def test_that_parking_system_rejects_zero(self):
        with self.assertRaises(ValueError):
            parked_car(0)

    def test_that_parking_system_can_accept_upto_20_cars(self):
        result = parked_car(1)
        self.assertEqual(result, "Car successfully parked in slot 1.")

    def test_that_parking_system_doesnt_take_in_string_input(self):
        with self.assertRaises(TypeError):
            parked_car("car")

    def test_that_parking_system_doesnt_take_in_negative_input(self):
        with self.assertRaises(ValueError):
            parked_car(-10)



