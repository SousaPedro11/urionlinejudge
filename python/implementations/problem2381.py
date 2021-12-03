from python.implementations.base import Problem


class Problem2381(Problem):
    def solv(self):
        entrada = input().split()
        tamanho, posicao = int(entrada[0]), int(entrada[1])
        alunos = [input() for _ in range(tamanho)]
        alunos.sort()
        print(alunos[posicao - 1])
