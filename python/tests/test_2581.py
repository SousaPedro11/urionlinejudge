import io
from unittest import TestCase
from unittest import mock
from unittest.mock import patch

from python.implementations.problem2581 import Problem2581

TARGET = 'sys.stdout'


@patch('builtins.input', create=True)
class Test2581(TestCase):
    def test_2581(self, mocked_input):
        mocked_input.side_effect = ['3', 'Who are you?', 'How old are you?', 'What can I do for you?']
        output = "I am Toorg!\nI am Toorg!\nI am Toorg!"
        with mock.patch(TARGET, new=io.StringIO()) as fake_stdout:
            solution_output = Problem2581().solv()
        stdout_value = fake_stdout.getvalue()
        assert solution_output == output or stdout_value == f'{output}\n'
