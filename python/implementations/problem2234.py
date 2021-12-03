from python.implementations.base import Problem


class Problem2234(Problem):
    def solv(self):
        entrada = input().split()
        resultado = f'{(int(entrada[0])/int(entrada[1])):.2f}'
        print(resultado)
