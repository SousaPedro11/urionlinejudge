import io
from unittest import TestCase
from unittest import mock
from unittest.mock import patch

from python.implementations.problem2381 import Problem2381

TARGET = 'sys.stdout'


@patch('builtins.input', create=True)
class Test2381(TestCase):
    def test_2381_5_1(self, mocked_input):
        mocked_input.side_effect = ['5 1', 'maria', 'joao', 'carlos', 'vanessa', 'jose']
        output = "carlos"
        with mock.patch(TARGET, new=io.StringIO()) as fake_stdout:
            solution_output = Problem2381().solv()
        stdout_value = fake_stdout.getvalue()
        assert solution_output == output or stdout_value == f'{output}\n'

    def test_2381_5_5(self, mocked_input):
        mocked_input.side_effect = ['5 5', 'maria', 'joao', 'carlos', 'vanessa', 'jose']
        output = "vanessa"
        with mock.patch(TARGET, new=io.StringIO()) as fake_stdout:
            solution_output = Problem2381().solv()
        stdout_value = fake_stdout.getvalue()
        assert solution_output == output or stdout_value == f'{output}\n'

    def test_2381_5_3(self, mocked_input):
        mocked_input.side_effect = ['5 3', 'maria', 'joao', 'carlos', 'vanessa', 'jose']
        output = "jose"
        with mock.patch(TARGET, new=io.StringIO()) as fake_stdout:
            solution_output = Problem2381().solv()
        stdout_value = fake_stdout.getvalue()
        assert solution_output == output or stdout_value == f'{output}\n'
