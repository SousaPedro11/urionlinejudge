import io
from unittest import TestCase
from unittest import mock
from unittest.mock import patch

from python.implementations.problem1154 import Problem1154


@patch('builtins.input', side_effect=['34', '56', '44', '23', '-2'])
class Test1154(TestCase):
    def test_1154(self, mocked_input):
        output = "39.25"
        with mock.patch('sys.stdout', new=io.StringIO()) as fake_stdout:
            solution_output = Problem1154().solv()
        stdout_value = fake_stdout.getvalue()
        assert solution_output == output or stdout_value == f'{output}\n'
