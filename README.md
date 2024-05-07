# Тестовая стратегия
Стратегия тестирования - документ, описывающий общий подход к тестированию и цели тестирования, содержит ответы на следующие вопросы:
+ Какие техники тестирования будут применяться? - открытый вопрос внизу документа.
+ Какие модули будут протестированы? - эквайринг и эмиссия.
+ Какие критерии входа и выхода? - открытый вопрос внизу документа.
+ Какая область тестирования? - REST запросы от STT.

То есть это «стратегический» высокоуровневый документ, объясняющий и направляющий процессы тестирования, учитывающий также следующие вопросы:
+ Степень автоматизации процессов - стоит определить, записано в табличке снизу.
+ Какие человеческие и другие ресурсы будут задействованы - стоит определить, записано в табличке снизу.
+ Стратегия создается на основе документация по дизайну проекта - КТ по эмиссии и эквайрингу.

## Обзор и область тестирования
Тестировщик - тот, кто приносит плохие вести. Никому не нравится слышать фразу “Твой ребенок уродлив”.
Некоторые разработчики не хотят даже думать о том, что их работе требуется “исправление”. Но задача тестировщиков – сообщать об ошибках.
Это не самая приятная из зон ответственности.
Но что, если тестировщики ошиблись? В следующий раз их мнение не захотят даже слышать. У тестировщиков практически нет права голоса, потому что это не “их продукт”.

Писать одни и те же тесты, отчеты об ошибках... Выполнять одни и те же тестовые сценарии, снова и снова - совсем не увлекательно. Но всегда нужно оставаться эффективным и при этом находить способы снижения затрат на тестирование.
Работа тестировщика аналогична работе команды, занимающейся подготовкой спектакля за кулисами. Тестировщики убеждаются, что все идет гладко и сообщают об этом. Но, когда все в порядке, никто не вспоминает о тестировщиках. Ведь это же “их работа”.

Требования — это описание того, что должно быть реализовано. Требования описывают то, что необходимо реализовать, без детализации технической стороны решения. Основные атрибуты требований:
* Полнота — в требовании должна содержаться вся необходимая для реализации функциональности информация. 
* Непротиворечивость — требование не должно содержать внутренних противоречий и противоречий другим требованиям и документам. 
* Недвусмысленность — требование должно содержать однозначные формулировки. 
* Проверяемость — формулировка требований таким образом, чтобы можно было выставить однозначный вердикт, выполнено все в соответствии с требованиями или нет. 
* Приоритетность — у каждого требования должна быть количественная оценка степени значимости требования.

Основные цели тестирования ПО:
 + Демонстрация наличия дефектов, а не их отсутствия.
 + Предоставление актуальной информации о качестве продукта.
 + Обнаружение и предотвращение дефектов на ранних этапах разработки ПО.
 + Проверка соответствия продукта заданным спецификациям и требованиям.
 + Помощь в убеждении, что продукт соответствует потребностям и ожиданиям пользователей.

Тест план — документ, описывающий весь объем работ по тестированию:
* Что нужно тестировать? - эквайринг и эмиссию.
* Как будет проводиться тестирование? - открыт вопрос внизу страницы.
* Когда будет проводиться тестирование? - стоит определить, записано в табличке снизу.
* Критерии начала тестирования - открыт вопрос внизу страницы.
* Критерии окончания тестирования - открыт вопрос внизу страницы.
 
Чтобы создать этот документ в соответствии с требованиями стандарта IEEE 829, необходимо выполнить следующие шаги:
+ Проанализировать продукт - допустим, сделано.
+ Разработать стратегию тестирования - данный документ похож на необходимое.
+ Определить цели тестирования - прохождение операций по картам.
+ Определение критерий тестирования - прохождение для эквайринга и правильность данных для эмиссии.
+ Запланировать ресурсы - каналы, окружения и стенды.
+ Настроить тестовую среду - необходимо сформировать данное понятие.
+ Распределить задачи - области ответственности.
+ Определить результаты тестирования.

Техники тест-дизайна:
1) Эквивалентное Разделение (Equivalence Partitioning) — это техника, при которой функционал (часто диапазон возможных вводимых значений) разделяется на группы эквивалентных по своему влиянию на систему значений. ПРИМЕР: есть диапазон допустимых значений от 1 до 10, выбирается одно верное значение внутри интервала (например, 5) и одно неверное значение вне интервала — 0.
2) Анализ Граничных Значений (Boundary Value Analysis) — это техника проверки поведения продукта на крайних (граничных) значениях входных данных. Если брать выше ПРИМЕР: в качестве значений для позитивного тестирования берется минимальная и максимальная границы (1 и 10), и значения больше и меньше границ (0 и 11). BVA может применяться к полям, записям, файлам, или к любого рода сущностям имеющим ограничения.
3) Доменный анализ (Domain Analysis Testing) — это техника основана на разбиении диапазона возможных значений переменной на поддиапазоны, с последующим выбором одного или нескольких значений из каждого домена для тестирования.
4) Предугадывание ошибки (Error Guessing — EG). Это когда тестировщик использует свои знания системы и способность к интерпретации спецификации на предмет того, чтобы «предугадать» при каких входных условиях система может выдать ошибку.
5) Причина / Следствие (Cause/Effect — CE). Подразумевается ввод условий, для получения ответа от системы (следствие).
6) Сценарий использования (Use Case Testing) — Use Case описывает сценарий взаимодействия двух и более участников (как правило — пользователя и системы).
7) Исчерпывающее тестирование (Exhaustive Testing — ET) — подразумевается проверка всех возможные комбинации входных значений. На практике не используется.
8) Попарное тестирование (Pairwise Testing) — это техника формирования наборов тестовых данных из полного набора входных данных в системе, которая позволяет существенно сократить общее количество тест-кейсов. Используется для тестирования, например, фильтров, сортировок. Этот интересный метод заслуживает отдельного внимания и более подробно рассматривается в статье по ссылке (в конце которой упоминаются инструменты для автоматизации применения PT).
9) Тестирование на основе состояний и переходов (State-Transition Testing) — применяется для фиксирования требований и описания дизайна приложения.
10) Таблица принятия решений (decision table) — инструмент для упорядочения бизнес-требований, которые должны быть реализованы в продукте. Применяется для систем со сложной логикой. В таблицах решений представлен набор условий, одновременное выполнение которых приводит к определенному действию.

Классификация по позитивности сценария:
1) Позитивное — Используются корректные данные и проверяется, что приложение правильно выполнило вызываемую функцию.
2) Негативное — Используются как корректными так и некорректными данными (минимум 1 некорректный параметр) и ставится целью проверка исключительных ситуаций.

## Методология
Необходимые навыки для тестирования в данный момент:
+ понимание ООП
+ понимание специфики Java17
+ понимание специфики maven
+ понимание специфики junit
+ понимание специфики cucumber
+ понимание техник тест-дизайна
+ понимание шаблонов проектирования
+ понимание концепции DRY и SOLID и т.д.
+ понимание масштабируемости
+ умение работать с CI/CD
+ умение работать с bash
+ умение работать с JSON
+ умение работать с TMS
+ умение работать с системами построения отчётов
+ желательно умение работать в IntellijIdea

Релизный цикл для тестирования должен состоять из следующих последовательных шагов, для каждого стенда:

| Номер шага | Название                        | Описание                                                                                  | Область ответственности |
|------------|---------------------------------|-------------------------------------------------------------------------------------------|-------------------------|
| 1          | Тестирование окружения          | Все подключения активны, модули работают и нет никаких препятствий к установке            |                         |
| 2          | Интеграционное тестирование     | Тестовая система имеет все необходимые доступы и подключения                              |                         |
| 3          | Тестирование установки\миграции | Все шаги установки автоматизированы, выполнены и не требуют дополнительного вмешательства |                         |
| 4          | Дымовое тестирование            | Основные функции работают для всех систем и модулей                                       |                         |
| 5          | Регрессионное тестирование      | Основные сценарии бизнес-логики работают без нареканий                                    |                         |
| 6          | Функциональное тестирование     | Все дополнительные сценарии работают без нареканий                                        |                         |
| 7          | Системное тестирование          | Абсолютно все тесты, на всех системах и всех окружениях работают одинаково                |                         |

Набор автотестов – это набор тестовых примеров, обычно создаваемых с помощью специализированных программных средств, которые позволяют выполнять их автоматически, без необходимости ручного вмешательства. Автоматизированные тестовые пакеты часто используются при регрессионном тестировании для обеспечения корректной работы программного обеспечения после внесения в него изменений или обновлений.
Эффективные тесты, как правило, обладают следующими характеристиками:
* Специфичны - нацелены на проверку одного элемента функциональности или поведения. Не должны быть слишком широкими или общими.
* Повторяемы - можно выполнять многократно и каждый раз получать один и тот же результат. Не должны зависеть от внешних факторов, таких как сетевое подключение или состояние системы. 
* Независимы - не должны полагаться на результаты других тестов или зависеть от порядка их выполнения. 
* Всесторонние - охватывают все возможные сценарии и крайние случаи, которые, как ожидается, будет обрабатывать код. 
* Поддерживаемы - должны легко поддерживаться и обновляться по мере изменения кода. Не должны быть чрезмерно сложными или трудными для понимания. 
* Быстрые - должны выполняться быстро, чтобы обеспечить оперативную обратную связь с разработчиком. Медленные тесты могут затормозить процесс разработки и усложнить отладку.

Определив что и как мы должны тестировать, переходим к подходу "от частного к общему" при создании тестов:
* Каждое действие необходимо для выполнения операции
* Каждая операция необходима для выполнения шага
* Каждый шаг должен иметь проверки на все внесенные изменения.
* Каждый тестовый случай должен состоять из заведомо определенной последовательности шагов и валидирования результатов
* Каждый тест должен содержать определенное количество необходимых тестовых случаев
* Каждый тестовый набор должен содержать определенное количество необходимых тестов для полной проверки определяемого функционала

## Описание тестовых окружений
В этом разделе должно быть описано количество тестовых окружений и их параметры. Также может описываться резервное копирование и восстановление окружений:
+ Информация о количестве окружений и их конфигурациях. (Это есть)
+ Отдельно окружения по предназначению. (Это есть)
+ Количество пользователей в каждом окружении и уровни доступа, а также программные и аппаратные характеристики окружений. (Если в этом есть смысл)
+ Объем тестовых данных. (Как минимум список тестов)
+ Способ получения тестовых данных. (Например, текущие настройки каналов)
+ Порядок резервного копирования и восстановления тестовых данных. (Если в этом есть смысл)
+ Какие базы данных используются.
+ Указывается, кто и когда должен делать резервные копии, что должно быть включено, порядок восстановления, и контроль доступа при восстановлении.

* В настройке тестовой среды должна быть указана информация о количестве сред и необходимых настройках для каждой из них. Например, одна – для группы функционального тестирования, а другая — для группы UAT.
* Важно определить требования к тестовым данным. Необходимо предоставить четкие инструкции по созданию тестовых данных.
* Необходимо определить стратегию резервного копирования и восстановления тестовых данных. В базе данных тестовой среды могут возникнуть проблемы из-за необработанных условий в коде. Процесс резервного копирования и восстановления должен определять, кто и когда будет делать резервные копии, что в них включать, кто будет восстанавливать базу данных, а также шаги по маскировке данных, которые необходимо выполнить в случае восстановления БД.
* Нужно определить инструменты управления и автоматизации тестирования, необходимые для выполнения тестов на каждом этапе.
* Незапланированные циклы релизов могут привести к появлению разных версий программного обеспечения в тестовых средах и средах UAT. План управления релизами с соответствующей историей версий обеспечит выполнение тестирования всех функциональностей последнего актуального релиза.
* Необходим утверждённый процесс управления сборками, который будет отвечать на вопросы – где должна быть доступна и развернута новая сборка, когда и откуда можно ее получить, каким образом можно переключать сборки.
* Для каждого типа тестирования, прописанного в плане, нужно указить причины необходимости его проведения.

## Инструменты тестирования
| Инструмент   | Предназначение                                    | Ссылка                                                                                       |
|--------------|---------------------------------------------------|----------------------------------------------------------------------------------------------|
| STT          | Toolkit для написания тестов                      |                                                                                              |
| IntellijIdea | IDE для работы с Java кодом                       | https://www.jetbrains.com/ru-ru/idea/download/download-thanks.html?platform=windows&code=IIC |
| Git          | Система контроля версий                           | https://git-scm.com/downloads                                                                |
| Bitbucket    | Хранилище кода                                    |                                                                                              |
| Teamcity     | Инструмент для запуска тестов и генерации отчётов |                                                                                              |
|              | Framework для формирования тестовых запусков      |                                                                                              |

## Управление релизами
Для контроля того, что управление релизами производится упорядоченным образом. В данной секции приводится следующее:
Версии продукта для тестового/приемочного окружения, возникающие в результате незапланированных релизов.
Контроль тестирования изменений в таких релизах; управление версиями.
Управление билдами; где и когда будет доступен новый билд; где он будет развернут; продакшен-билд; кто контролирует релизы (например дает «go-signal» к запуску релиза) и так далее.

## Риски и проблемы:

| Обозначение                                                          | Уровень критичности |
|----------------------------------------------------------------------|---------------------|
| Тест кейсы не имеют повторяемости\нестабильная среда                 | Блокер              |
| У тестов нет параметризации                                          | Стоит внимания      |
| У солара нет возможности изменения настроек каналов извне            | Стоит внимания      |
| У СТТ нет возможности изменения каналов и окружений извне            | Стоит внимания      |
| Единое рабочее пространство                                          | Критичная проблема  |
| Тестирование в СТТ происходит в произвольном порядке                 | Стоит внимания      |
| В СТТ предварительные условия находятся в теле теста                 | Минорная проблема   |
| Определение степени автоматизации                                    | Стоит внимания      |
| Определение требований к единственному тестировщику                  | Стоит внимания      |
| В СТТ нет возможности запустить один и тот же тест с разными данными | Стоит внимания      |
| Проблема поддержки версионности                                      | Критичная проблема  |
| Частота тестирования                                                 | Стоит внимания      |

# Важные понятия:
1) KISS (акроним для «Keep it simple, stupid» — «Делай проще, тупица») — принцип проектирования, принятый в ВМС США в 1960 году. Впервые частично встречается в американском английском по крайней мере в 1938 году. Принцип KISS утверждает, что большинство систем работают лучше всего, если они остаются простыми, а не усложняются. Поэтому в области проектирования простота должна быть одной из ключевых целей и следует избегать ненужной сложности.
2) Бри́тва О́ккама (иногда ле́звие О́ккама) — методологический принцип, в кратком виде гласящий: «Не следует множить сущее без необходимости»
3) Бри́тва Хэ́нлона (англ. Hanlon’s razor) — презумпция, согласно которой при поисках причин неприятных событий должны прежде всего предполагаться человеческие ошибки, и лишь во вторую очередь — чьи-то сознательные злонамеренные действия.
4) Чем хуже, тем лучше — подход к разработке программного обеспечения, объявляющий простоту реализации и простоту интерфейса более важными, чем любые другие свойства системы.
5) Don’t repeat yourself (DRY; с англ. «не повторяйся») — это принцип разработки программного обеспечения, нацеленный на снижение повторения информации различного рода, особенно в системах со множеством слоёв абстрагирования. Принцип DRY формулируется как: «Каждая часть знания должна иметь единственное, непротиворечивое и авторитетное представление в рамках системы».
6) Повторное использование кода (англ. code reuse) — методология проектирования компьютерных и других систем, заключающаяся в том, что система (компьютерная программа, программный модуль) частично либо полностью должна составляться из частей, написанных ранее компонентов и/или частей другой системы, и эти компоненты должны применяться более одного раза (если не в рамках одного проекта, то хотя бы разных). Повторное использование — основная методология, которая применяется для сокращения трудозатрат при разработке сложных систем.
7) Контрактное программирование (design by contract (DbC), programming by contract, contract-based programming) — это метод проектирования программного обеспечения. Он предполагает, что проектировщик должен определить формальные, точные и верифицируемые спецификации интерфейсов для компонентов системы. При этом, кроме обычного определения абстрактных типов данных, также используются предусловия, постусловия и инварианты.
8) Состояние гонки - Race hazard, Race condition - непредвидение возможности наступления событий в порядке, отличном от ожидаемого.
9) Процеду́рное программи́рование — программирование на императивном языке, при котором последовательно выполняемые операторы можно собрать в подпрограммы, то есть более крупные целостные единицы кода, с помощью механизмов самого языка.
10) Объе́ктно ориенти́рованное программи́рование (сокр. ООП) — методология или стиль программирования на основе описания типов/моделей предметной области и их взаимодействия, представленных порождением из прототипов или как экземпляры классов, которые образуют иерархию наследования.
11) Шаблон проектирования (паттерн, от англ. design pattern) — повторяемая архитектурная конструкция в сфере проектирования программного обеспечения, предлагающая решение проблемы проектирования в рамках некоторого часто возникающего контекста.
12) Шаблон делегирования - Delegation pattern - Объект внешне выражает некоторое поведение, но в реальности передаёт ответственность за выполнение этого поведения связанному объекту.
13) Шаблон функционального дизайна - Functional design - Гарантирует, что каждый модуль компьютерной программы имеет только одну обязанность и исполняет её с минимумом побочных эффектов на другие части программы.
14) Интерфейс - Interface - Общий метод для структурирования компьютерных программ для того, чтобы их было проще понять.
15) Адаптер	Adapter - Wrapper - Объект, обеспечивающий взаимодействие двух других объектов, один из которых использует, а другой предоставляет несовместимый с первым интерфейс.
16) Посредник - Mediator - Обеспечивает взаимодействие множества объектов, формируя при этом слабую связанность и избавляя объекты от необходимости явно ссылаться друг на друга.
17) Фасад - Facade - Объект, который абстрагирует работу с несколькими классами, объединяя их в единое целое.
18) Единая точка входа - Front controller - Обеспечивает унифицированный интерфейс для интерфейсов в подсистеме. Front Controller определяет высокоуровневый интерфейс, упрощающий использование подсистемы.
19) Заместитель	Proxy	Объект, который является посредником между двумя другими объектами, и который реализует/ограничивает доступ к объекту, к которому обращаются через него.
20) Цепочка обязанностей - Chain of responsibility - Предназначен для организации в системе уровней ответственности.
21) Команда, Action, Transaction - Command - Представляет действие. Объект команды заключает в себе само действие и его параметры.
22) Интерпретатор - Interpreter - Решает часто встречающуюся, но подверженную изменениям, задачу.
23) Итератор, Cursor - Iterator - Представляет собой объект, позволяющий получить последовательный доступ к элементам объекта-агрегата без использования описаний каждого из объектов, входящих в состав агрегации.
24) Спецификация - Specification - Служит для связывания бизнес-логики.
25) Состояние - State - Используется в тех случаях, когда во время выполнения программы объект должен менять своё поведение в зависимости от своего состояния.
26) Большой комок грязи - Big ball of mud - Система с нераспознаваемой структурой.
27) Привязка к поставщику - Vendor lock-in - жёсткая привязка к поставщику.
28) Единственный знающий человек - Single head of knowledge, SHOK - когда жизненно важными для проекта сведениями или навыками обладает только один человек в команде, а с его уходом работа останавливается.
29) Синдром варёной лягушки - Boiling Frog Syndrome - постепенные отрицательные изменения замечают, когда уже поздно.
30) Перестыковка - Re-Coupling - Процесс внедрения ненужной зависимости.
31) Проектированием тестов (Test Design) — этап, на котором создаются тестовые сценарии, в соответствии с определёнными ранее критериями. т.е., определяется, КАК будет тестироваться продукт.
32) Бесплодные прыжки - Fruitless Hoops - подготовка всё новых и новых данных, нужные для принятия решения, но менеджеры так и не принимают никакого решения, продолжая запрашивать у вас данные. Вы не знаете, зачем им нужны эти данные.
33) Дорога в никуда - Road to Nowhere - Отсутствие плана вызывает замешательство и кризис руководства.
34) Исчерпывающее тестирование – это метод, который обеспечивает проверку всех возможных комбинаций в наборе данных. Данный вид тестирования используется для гарантии того, что программа не выйдет из строя ни при каких обстоятельствах. Исчерпывающее тестирование относится к дисциплине, отвечающей за качество продукта.

Исчерпывающее тестирование имеет следующие преимущества:
* Тесты могут быть автоматизированы, что избавит от необходимости проводить работу вручную.
* Проверяет все возможные варианты данных в наборе.
* Делает программу более надежной, выявляя любые возможные ошибки.
* Выполняет повторное тестирование задач с высоким приоритетом.
* Повышает удовлетворенность клиентов от продукта.

# Вопросы:
+ Будем ли приходить к использованию TMS(test management system)?
+ Каким образом мы собираемся проводить функциональное тестирование?
+ Нацелены ли мы на использование только автоматизации или ручные проверки будут неотъемлемой частью?
+ Собираемся ли мы выполнять все тестовые случаи с помощью авто тестирования?
+ Техники тестирования будут применяться только функциональные?
+ Как будут определяться входные данные на тестирование и какой критерий завершения тестирования?
+ Если принимать во внимание то, что СТТ и Солар не могут менять настройки по запросам извне, а автоматизировать установку окружения нет возможности из-за необходимости ручной донастройки в UI - есть только два выхода для организации тестирования:
  1) Все возможные варианты пересечения фукциональных узлов и подключений реализовать в контексте множества стендов. Этот вариант плох тем, что неоправданно дорого - например, докупать каналы и тратить время на отладку и донастройку каждого стенда из-за невозможности автоматизировать данную активность. Плюс поддерживать каждый вариант тестов может быть проблематичным. Если эфемерно 3к тестов на стенд, а стендов, пусть 9, то 27к тестов анализировать будет долго, поддерживать актуальность тестов тоже трудоёмко.
  2) Зафиксировать и не менять настройки стендов и каналов. Создать один набор тестов и реализовать параметризацию импорта тестов относительно стендов. Этот вариант плох усложнением логики тестов и выставлением ограничений относительно стендов, а так же невозможностью полноценно удовлетворять всем потребностям, генерируя, например, антипаттерн большого комка грязи относительно тестов.
  Если есть другие варианты реализации - готов обсуждать.

# Вместо итога
Принципом проектирования KISS воспользоваться не получится, к сожалению, потому что хардкод на уровне тестов, настроек системы и каналов загоняет нас в те реалии, по которым невозможно реализовать тестирование в приемлимом качестве.

И сразу же мы натыкаемся на Бриткву Оккамы - Нам либо множить тесты для каждого стенда, либо множить условия в надежде ничего не сломать.
Иначе - Бритва Хэнлона, при большом количестве логики человеческий фактор может играть свою роль.

Дальше принцип "Чем хуже, тем лучше" - самым простым вариантом кажется разделить системы, где хранится код, где происходят логические действия и где код исполняется, тем самым - гит, Java и СТТ. 

Следующий принцип, Don’t repeat yourself, напоминает нам о постулате программирования "переиспользуй". Много тестов одинаковых, но различающихся, например, параметром. Раз в СТТ так сделать нельзя, значит надо реализовывать это на уровне Java.

Следуя методологии повторного использования создать на Java все необходимые списки, сущности и переиспользовать необходимую конкретику из обозначенных структур данных.

Контрактное программирование нам поможет в этом для определения предусловий и постусловий тестов, например, для создания карты, выполнения операций с ней и её удаления.
Так, реализовав шаги и различные условия, мы избежав состояния гонки, как в СТТ, обращаемся к процедурному программированию. Java больше любит ООП подход, для него шаблоны проектирования тоже работают.

Т.к. СТТ - отдельная специализированная система, распределив ответственность мы воспользуемся шаблоном делегирования. Из Java мы будем создавать необходимый нам тест, импортировать в СТТ и удалённо запускать.
Срабатывает шаблон функционального дизайна - гит хранит код, Java манипулирует кодом, СТТ выполняет тесты, Teamcity показывает отчёты.

Необходимо все функции, тесты и интерфейсы называть говорящими названиями, чтоб не путаться.

По своей сути, Java - адаптер, либо посредник, либо заместитель, для формирования тестов, их запуска и генерации отчётов.
Для ежедневной активности, фасадом планируется использовать Teamcity. Либо это можно назвать единой точкой входа.
Подобным подходом мы не сильно завязываемся на поставщика, что несомненно плюс, если тестовую среду в будущем случится менять - заденет лишь реализацию тестов, а не всей системы.

Цепочка обязанностей должна отображаться как в Java, относительно условий, так и в СТТ - на уровне тестов. Teamcity же - интерпретатор результатов.
Такой организацей удастся итерироваться по наборам параметров и упростить проверки по спецификациям, что удешевит тестирование.

Понятно, что проект сейчас в зачатке, но антипаттерна большого комка грязи хотелось бы избежать.
Но если весь данный объём будет реализовывать один человек - возможна встреча с проблемой единственного знающего человека, а это bus factor.

В любом случае оба рассматриваемые варианта плохие и можно столкнуться с синдромом варёной лягушки.
Сейчас же есть ещё проблемы уровня перестыковки - чтобы у одного человека что-то заработало, возможна необходимость перенастроить или перезагрузить, либо ещё что-то. Если такие проблемы возникают на человеческом уровне - автоматизация невозможна.
От того, какая будет картина и дорожная карты, зависит и проектирование тестов. Писать тесты без разбора и создавать тесты ради тестов сейчас выглядит как бесплодные прыжки.
Потому надо сформировать все нобходимые вещи, чтобы не было дороги в никуда.

Я предлагаю избегать плохих паттернов, от части уйти не получится, но говоря про конструктив, я бы хотел пойти одним из двух следующих путей...

Первый:
1) Сейчас - определяем необходимые окружения, для полного покрытия тестами всех нужных вариантов, протоколируем итоговое решение.
2) До июня определяемся с технической конкретикой по: стратегии релизных циклов, миграции и версионности.
3) В июне - фиксируем и приводим окружения к состоянию статики.
4) Первые две недели июля - определяем пайплайны для полного покрытия всех циклов.
5) Остаток июля последовательно реализуем пайплайны исходя из написанного выше, предполагаемого, релизного цикла. Автотесты наполняются на уровень макетов.
6) В августе начинаем наполнять макеты реализацией исходя из написанного выше, пердполагаемого релизного цикла.
Риск: Большое количество зависимостей и более приоритетные задачи.

Второй:
1) Сейчас - определяем необходимые окружения, для полного покрытия тестами всех нужных вариантов, протоколируем итоговое решение.
2) До июня реализую взаимосвязь Тимсити с Битбакетом и формирую запуски макетных тестов с созданием отчётов
3) В июне получаю конкретику по окружениям, стратегии релизных циклов, миграции, версионности и пайплайнам.
4) с июня начинаю наполнять тесты
Риск: Необходимую конкретику можно получить не быстро, а это блокеры.

Общий риск: Для более быстрой реализации нужна будет помощь коллег, тут риск, либо отвлечение коллег от других задач, либо относительно медленная разработка из-за набивания шишек новичка.
Общие проблемы, от которой надо уйти в любом случае: работа нескольких людей на одном стенде, неопределённость настроек стенда, отсутствие повторяемости тестов.

Для краткосрочной перспективы я вижу данные два пути самыми приемлемыми. В долгосрочной перспективе хотелось бы проработать вариант работы без СТТ - на чистой Java. А может и вовсе Без Солара. Но тут нужна последовательность выстраивания тестирования и процессов. А к тому, как всё будет развито даже к уровню отсутствия необходимости СТТ - всё может измениться.

Есть ещё третий вариант развития, крайне неказистый, сложный и не самый стабильный:
1) До июля изучить от и до весь процесс установки, обновления и настройки СТТ и Солара.
2) В июле создать макеты тестов с пред и постусловиями, используя настройку конфигураций в UI посредством селеноида.
3) В августе начать создавать тесты
Риск: Всё, что связано с UI требует постоянной поддержки и отладки, даже для одного стенда...
