from python.implementations.base import Problem


class Problem2753(Problem):
    def solv(self):
        for i in range(97, 123):
            print(f'{i} e {chr(i)}')
