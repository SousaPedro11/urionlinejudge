import io
from unittest import TestCase
from unittest import mock

from python.implementations.problem2747 import Problem2747

TARGET = 'sys.stdout'


class Test2747(TestCase):
    def test_2747(self):
        output = '---------------------------------------' \
                 '\n|                                     |' \
                 '\n|                                     |' \
                 '\n|                                     |' \
                 '\n|                                     |' \
                 '\n---------------------------------------'
        with mock.patch(TARGET, new=io.StringIO()) as fake_stdout:
            solution_output = Problem2747().solv()
        stdout_value = fake_stdout.getvalue()
        assert solution_output == output or stdout_value == f'{output}\n'
