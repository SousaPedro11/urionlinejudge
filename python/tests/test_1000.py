import io
from unittest import TestCase
from unittest import mock

from python.implementations.problem1000 import Problem1000

TARGET = 'sys.stdout'


class Test1000(TestCase):
    def test_1000(self):
        output = 'Hello World!'
        with mock.patch(TARGET, new=io.StringIO()) as fake_stdout:
            solution_output = Problem1000().solv()
        stdout_value = fake_stdout.getvalue()
        assert solution_output == output or stdout_value == f'{output}\n'
