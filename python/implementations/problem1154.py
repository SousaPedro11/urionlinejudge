from python.implementations.base import Problem


class Problem1154(Problem):
    def solv(self):
        entrada = 0
        numeros = []
        while not (entrada < 0):
            entrada = float(input())
            if entrada >= 0:
                numeros.append(entrada)

        media = sum(numeros)/len(numeros)
        resultado = f'{media:.2f}'
        print(resultado)
        return resultado
