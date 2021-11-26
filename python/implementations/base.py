from abc import ABC, ABCMeta, abstractmethod


class Problem(ABC):
    __metaclass__ = ABCMeta

    @abstractmethod
    def solv(self):
        raise NotImplementedError('Falta implementar')
