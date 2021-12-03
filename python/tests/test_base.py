from unittest import TestCase
from unittest.mock import patch

from python.implementations.base import Problem


class Testbase(TestCase):
    @patch("python.implementations.base.Problem.__abstractmethods__", set())
    def test_base(self):
        problem = Problem()
        self.assertRaises(NotImplementedError, problem.solv)
