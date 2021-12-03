import io
from unittest import TestCase, mock

from python.implementations.problem2753 import Problem2753


class Test2753(TestCase):
    def test_2753(self):
        output = "97 e a\n98 e b\n99 e c\n100 e d\n101 e e\n102 e f\n103 e g\n104 e h\n105 e i\n106 e j\n107 e k" \
                 "\n108 e l\n109 e m\n110 e n\n111 e o\n112 e p\n113 e q\n114 e r\n115 e s\n116 e t\n117 e u\n118 e v" \
                 "\n119 e w\n120 e x\n121 e y\n122 e z\n"
        with mock.patch('sys.stdout', new=io.StringIO()) as fake_stdout:
            Problem2753().solv()
        stdout_value = fake_stdout.getvalue()

        assert stdout_value == output
