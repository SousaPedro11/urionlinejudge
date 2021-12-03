import io
from unittest import TestCase
from unittest import mock
from unittest.mock import patch

from python.implementations.problem2234 import Problem2234

TARGET = 'sys.stdout'


@patch('builtins.input', create=True)
class Test2234(TestCase):
    def test_2234_10_90(self, mocked_input):
        mocked_input.side_effect = ['10 90']
        output = "0.11"
        with mock.patch(TARGET, new=io.StringIO()) as fake_stdout:
            solution_output = Problem2234().solv()
        stdout_value = fake_stdout.getvalue()
        assert solution_output == output or stdout_value == f'{output}\n'

    def test_2234_840_11(self, mocked_input):
        mocked_input.side_effect = ['840 11']
        output = "76.36"
        with mock.patch(TARGET, new=io.StringIO()) as fake_stdout:
            solution_output = Problem2234().solv()
        stdout_value = fake_stdout.getvalue()
        assert solution_output == output or stdout_value == f'{output}\n'

    def test_2234_1_50(self, mocked_input):
        mocked_input.side_effect = ['1 50']
        output = "0.02"
        with mock.patch(TARGET, new=io.StringIO()) as fake_stdout:
            solution_output = Problem2234().solv()
        stdout_value = fake_stdout.getvalue()
        assert solution_output == output or stdout_value == f'{output}\n'

    def test_2234_34_1000(self, mocked_input):
        mocked_input.side_effect = ['34 1000']
        output = "0.03"
        with mock.patch(TARGET, new=io.StringIO()) as fake_stdout:
            solution_output = Problem2234().solv()
        stdout_value = fake_stdout.getvalue()
        assert solution_output == output or stdout_value == f'{output}\n'

    def test_2234_35_1000(self, mocked_input):
        mocked_input.side_effect = ['35 1000']
        output = "0.04"
        with mock.patch(TARGET, new=io.StringIO()) as fake_stdout:
            solution_output = Problem2234().solv()
        stdout_value = fake_stdout.getvalue()
        assert solution_output == output or stdout_value == f'{output}\n'
