# language: ru

Функционал: функционал футера

  Предыстория: сайт открыт
    Когда открыт Stepik

  @regress
  Сценарий: проверка отображения политики конфиденциальности
    Когда пользователь нажимает на кнопку 'конфиденциальности'
    Тогда открывается новая вкладка
    Затем пользователь переключает язык страницы на En
    Тогда пользователь видит страницу на английском языке

    #TODO - убрать шаг, сделав закрытие автоматическим
    Затем закрываем сессию