package com.prometheus.clq.data

import com.prometheus.clq.model.BilingualQuestion
import com.prometheus.clq.model.Difficulty
import com.prometheus.clq.model.Language
import com.prometheus.clq.model.LocalizedContent
import com.prometheus.clq.model.Question

/** Auto-generated batch 13 : 500 questions bilingues */
object QuestionsBilingualGenerated_13 {
    fun get(lang: Language = Language.FR): List<Question> = list.map { it.toQuestion(lang) }

    val list: List<BilingualQuestion> by lazy {
        part1() + part2() + part3() + part4() + part5() + part6() + part7()
    }

    private fun part1(): List<BilingualQuestion> = listOf(
        BilingualQuestion(
            id = 12529, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Le nerf optique humain contient combien de fibres nerveuses?", listOf("500000", "1 million", "5 millions", "10 millions"), "Science", "Le nerf optique humain est composé d'environ 1,2 million de fibres nerveuses, ce qui permet de transmettre les signaux visuels de la rétine au cerveau."),
            en = LocalizedContent("How many nerve fibers does the human optic nerve contain?", listOf("500,000", "1 million", "5 million", "10 million"), "Science", "The human optic nerve is composed of about 1.2 million nerve fibers, which transmit visual signals from the retina to the brain."),
            zh = LocalizedContent("人类视神经包含多少根神经纤维？", listOf("50万", "100万", "500万", "1000万"), "科学", "人类视神经由大约120万根神经纤维组成，负责将视觉信号从视网膜传递到大脑。"),
            es = LocalizedContent("¿Cuántas fibras nerviosas contiene el nervio óptico humano?", listOf("500.000", "1 millón", "5 millones", "10 millones"), "Ciencia", "El nervio óptico humano está compuesto por aproximadamente 1,2 millones de fibras nerviosas, que transmiten las señales visuales desde la retina hasta el cerebro.")
        ),
        BilingualQuestion(
            id = 12530, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est l'effet quantique permettant la tléportation quantique?", listOf("Intrication", "Superposition", "Décohérence", "Tunnelling"), "Science", "L'intrication quantique lie deux particules de sorte que l'état de l'une influence instantanément l'autre, quelle que soit la distance, permettant ainsi de transférer l'état quantique d'une particule à une autre sans déplacement physique."),
            en = LocalizedContent("What quantum effect enables quantum teleportation?", listOf("Entanglement", "Superposition", "Decoherence", "Tunneling"), "Science", "Quantum entanglement links two particles so that the state of one instantly influences the other, regardless of distance, allowing the transfer of a quantum state from one particle to another without physical movement."),
            zh = LocalizedContent("哪种量子效应实现了量子隐形传态？", listOf("纠缠", "叠加", "退相干", "隧穿"), "科学", "量子纠缠将两个粒子联系起来，使得一个粒子的状态瞬间影响另一个，无论距离多远，从而无需物理移动即可将量子态从一个粒子转移到另一个粒子。"),
            es = LocalizedContent("¿Qué efecto cuántico permite la teletransportación cuántica?", listOf("Entrelazamiento", "Superposición", "Decoherencia", "Efecto túnel"), "Ciencia", "El entrelazamiento cuántico vincula dos partículas de modo que el estado de una influye instantáneamente en la otra, sin importar la distancia, permitiendo transferir el estado cuántico de una partícula a otra sin desplazamiento físico.")
        ),
        BilingualQuestion(
            id = 12531, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quelle zone du cerveau contrôle la mémoire court terme?", listOf("Hippocamp", "Cortex préfrontal", "Cervelet", "Amygdale"), "Science", "Le cortex préfrontal est impliqué dans le maintien temporaire des informations et leur manipulation, fonctions clés de la mémoire à court terme."),
            en = LocalizedContent("Which brain area controls short-term memory?", listOf("Hippocampus", "Prefrontal cortex", "Cerebellum", "Amygdala"), "Science", "The prefrontal cortex is involved in the temporary maintenance and manipulation of information, key functions of short-term memory."),
            zh = LocalizedContent("哪个大脑区域控制短期记忆？", listOf("海马体", "前额叶皮层", "小脑", "杏仁核"), "科学", "前额叶皮层参与信息的临时维持和操作，这是短期记忆的关键功能。"),
            es = LocalizedContent("¿Qué área del cerebro controla la memoria a corto plazo?", listOf("Hipocampo", "Corteza prefrontal", "Cerebelo", "Amígdala"), "Ciencia", "La corteza prefrontal está implicada en el mantenimiento temporal y la manipulación de la información, funciones clave de la memoria a corto plazo.")
        ),
        BilingualQuestion(
            id = 12532, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de synapses le cerveau humain possède-t-il environ?", listOf("1 milliard", "100 milliards", "1 trillion", "100 trillions"), "Science", "Le cerveau humain contient environ 86 milliards de neurones, chacun formant des milliers de connexions, ce qui donne un total estimé à 1 trillion de synapses."),
            en = LocalizedContent("Approximately how many synapses does the human brain have?", listOf("1 billion", "100 billion", "1 trillion", "100 trillion"), "Science", "The human brain contains about 86 billion neurons, each forming thousands of connections, resulting in an estimated total of 1 trillion synapses."),
            zh = LocalizedContent("人类大脑大约有多少个突触？", listOf("10亿", "1000亿", "1万亿", "100万亿"), "科学", "人类大脑约有860亿个神经元，每个神经元形成数千个连接，因此估计突触总数约为1万亿。"),
            es = LocalizedContent("¿Cuántas sinapsis tiene aproximadamente el cerebro humano?", listOf("1 billón", "100 billones", "1 trillón", "100 trillones"), "Ciencia", "El cerebro humano contiene unos 86 mil millones de neuronas, cada una formando miles de conexiones, lo que da un total estimado de 1 billón de sinapsis.")
        ),
        BilingualQuestion(
            id = 12533, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel ordinateur quantique a atteint la 'suprématie quantique' en 2019?", listOf("IBM Q", "Google Sycamore", "IonQ", "Rigetti"), "Science", "Le processeur quantique Sycamore de Google a réalisé en 2019 un calcul en 200 secondes qui aurait pris 10 000 ans à un supercalculateur classique, marquant la première démonstration revendiquée de suprématie quantique."),
            en = LocalizedContent("Which quantum computer achieved 'quantum supremacy' in 2019?", listOf("IBM Q", "Google Sycamore", "IonQ", "Rigetti"), "Science", "Google's Sycamore quantum processor performed a calculation in 200 seconds in 2019 that would have taken 10,000 years on a classical supercomputer, marking the first claimed demonstration of quantum supremacy."),
            zh = LocalizedContent("哪台量子计算机在2019年实现了“量子霸权”？", listOf("IBM Q", "Google Sycamore", "IonQ", "Rigetti"), "科学", "谷歌的Sycamore量子处理器在2019年用200秒完成了一项计算，而经典超级计算机需要1万年，这标志着首次声称的量子霸权演示。"),
            es = LocalizedContent("¿Qué ordenador cuántico alcanzó la 'supremacía cuántica' en 2019?", listOf("IBM Q", "Google Sycamore", "IonQ", "Rigetti"), "Ciencia", "El procesador cuántico Sycamore de Google realizó en 2019 un cálculo en 200 segundos que habría llevado 10.000 años a un superordenador clásico, marcando la primera demostración reivindicada de supremacía cuántica.")
        ),
        BilingualQuestion(
            id = 12534, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Le potentiel d'action neuronal dure combien de millisecondes?", listOf("1ms", "5ms", "10ms", "20ms"), "Science", "Le potentiel d'action dure environ 1 milliseconde, une durée très brève qui permet la transmission rapide de l'influx nerveux le long de l'axone."),
            en = LocalizedContent("How many milliseconds does a neuronal action potential last?", listOf("1ms", "5ms", "10ms", "20ms"), "Science", "An action potential lasts about 1 millisecond, a very brief duration that allows rapid transmission of nerve impulses along the axon."),
            zh = LocalizedContent("神经元动作电位持续多少毫秒？", listOf("1毫秒", "5毫秒", "10毫秒", "20毫秒"), "科学", "动作电位持续约1毫秒，这个非常短暂的时间使得神经冲动能够沿轴突快速传递。"),
            es = LocalizedContent("¿Cuántos milisegundos dura un potencial de acción neuronal?", listOf("1ms", "5ms", "10ms", "20ms"), "Ciencia", "El potencial de acción dura aproximadamente 1 milisegundo, una duración muy breve que permite la transmisión rápida del impulso nervioso a lo largo del axón.")
        ),
        BilingualQuestion(
            id = 12535, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le nombre de portes logiques quantiques élémentaires?", listOf("2", "5", "8", "12"), "Science", "Le modèle standard du calcul quantique repose sur un ensemble de cinq portes logiques élémentaires : Pauli X, Y, Z, Hadamard et Phase. Ces portes suffisent pour construire n'importe quel circuit quantique."),
            en = LocalizedContent("What is the number of elementary quantum logic gates?", listOf("2", "5", "8", "12"), "Science", "The standard model of quantum computing relies on a set of five elementary logic gates: Pauli X, Y, Z, Hadamard, and Phase. These gates are sufficient to build any quantum circuit."),
            zh = LocalizedContent("基本量子逻辑门的数量是多少？", listOf("2", "5", "8", "12"), "科学", "量子计算的标准模型依赖于五个基本逻辑门：泡利X、Y、Z、阿达马和相位门。这些门足以构建任何量子电路。"),
            es = LocalizedContent("¿Cuál es el número de puertas lógicas cuánticas elementales?", listOf("2", "5", "8", "12"), "Ciencia", "El modelo estándar de la computación cuántica se basa en un conjunto de cinco puertas lógicas elementales: Pauli X, Y, Z, Hadamard y Phase. Estas puertas son suficientes para construir cualquier circuito cuántico.")
        ),
        BilingualQuestion(
            id = 12536, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("L'équation de Schrödinger décrit quel phénomène?", listOf("Gravité", "Fonction d'onde quantique", "Électromagnétisme", "Nucléaire"), "Science", "L'équation de Schrödinger est fondamentale en mécanique quantique ; elle décrit l'évolution temporelle de la fonction d'onde, qui contient toute l'information sur l'état d'un système quantique."),
            en = LocalizedContent("What phenomenon does the Schrödinger equation describe?", listOf("Gravity", "Quantum wave function", "Electromagnetism", "Nuclear"), "Science", "The Schrödinger equation is fundamental in quantum mechanics; it describes the time evolution of the wave function, which contains all information about the state of a quantum system."),
            zh = LocalizedContent("薛定谔方程描述了什么现象？", listOf("引力", "量子波函数", "电磁学", "核"), "科学", "薛定谔方程是量子力学的基础；它描述了波函数的时间演化，波函数包含了量子系统状态的所有信息。"),
            es = LocalizedContent("¿Qué fenómeno describe la ecuación de Schrödinger?", listOf("Gravedad", "Función de onda cuántica", "Electromagnetismo", "Nuclear"), "Ciencia", "La ecuación de Schrödinger es fundamental en mecánica cuántica; describe la evolución temporal de la función de onda, que contiene toda la información sobre el estado de un sistema cuántico.")
        ),
        BilingualQuestion(
            id = 12537, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel neurohormone régule le cycle circadien?", listOf("Mélatonine", "Cortisol", "Oxytocine", "Vasopressine"), "Science", "La mélatonine est sécrétée par la glande pinéale en réponse à l'obscurité, signalant au corps qu'il est temps de dormir et synchronisant ainsi le cycle veille-sommeil."),
            en = LocalizedContent("Which neurohormone regulates the circadian rhythm?", listOf("Melatonin", "Cortisol", "Oxytocin", "Vasopressin"), "Science", "Melatonin is secreted by the pineal gland in response to darkness, signaling the body that it is time to sleep and thus synchronizing the sleep-wake cycle."),
            zh = LocalizedContent("哪种神经激素调节昼夜节律？", listOf("褪黑素", "皮质醇", "催产素", "加压素"), "科学", "褪黑素由松果体在黑暗环境中分泌，向身体发出睡眠信号，从而同步睡眠-觉醒周期。"),
            es = LocalizedContent("¿Qué neurohormona regula el ciclo circadiano?", listOf("Melatonina", "Cortisol", "Oxitocina", "Vasopresina"), "Ciencia", "La melatonina es secretada por la glándula pineal en respuesta a la oscuridad, indicando al cuerpo que es hora de dormir y sincronizando así el ciclo sueño-vigilia.")
        ),
        BilingualQuestion(
            id = 12538, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de types de neurones le cerveau contient-il?", listOf("1", "5", "10+", "50+"), "Science", "Le cerveau humain contient plus de 50 types de neurones distincts, classés selon leur forme, fonction et neurotransmetteurs."),
            en = LocalizedContent("How many types of neurons does the brain contain?", listOf("1", "5", "10+", "50+"), "Science", "The human brain contains more than 50 distinct types of neurons, classified by shape, function, and neurotransmitters."),
            zh = LocalizedContent("大脑包含多少种神经元？", listOf("1", "5", "10+", "50+"), "科学", "人类大脑包含超过50种不同类型的神经元，根据形状、功能和神经递质进行分类。"),
            es = LocalizedContent("¿Cuántos tipos de neuronas contiene el cerebro?", listOf("1", "5", "10+", "50+"), "Ciencia", "El cerebro humano contiene más de 50 tipos distintos de neuronas, clasificados por su forma, función y neurotransmisores.")
        ),
        BilingualQuestion(
            id = 12539, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("La nanoscience étudie des objets de quelle taille?", listOf("10^-6m", "10^-9m", "10^-12m", "10^-15m"), "Science", "Le préfixe \"nano\" vient du grec nannos, signifiant nain, et correspond à un milliardième de mètre (10⁻⁹ m), échelle où les propriétés de la matière diffèrent du comportement macroscopique."),
            en = LocalizedContent("Nanoscience studies objects of what size?", listOf("10^-6m", "10^-9m", "10^-12m", "10^-15m"), "Science", "The prefix \"nano\" comes from the Greek nannos, meaning dwarf, and corresponds to one billionth of a meter (10⁻⁹ m), a scale where the properties of matter differ from macroscopic behavior."),
            zh = LocalizedContent("纳米科学研究什么尺寸的物体？", listOf("10^-6米", "10^-9米", "10^-12米", "10^-15米"), "科学", "前缀“纳米”源自希腊语nannos，意为矮人，对应十亿分之一米（10⁻⁹米），在此尺度下物质的性质与宏观行为不同。"),
            es = LocalizedContent("¿La nanociencia estudia objetos de qué tamaño?", listOf("10^-6m", "10^-9m", "10^-12m", "10^-15m"), "Ciencia", "El prefijo \"nano\" proviene del griego nannos, que significa enano, y corresponde a una milmillonésima de metro (10⁻⁹ m), escala donde las propiedades de la materia difieren del comportamiento macroscópico.")
        ),
        BilingualQuestion(
            id = 12540, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel agent secret britannique est connu comme 007?", listOf("Sean Connery", "James Bond (fiction)", "George Blake", "Kim Philby"), "Histoire", "James Bond est le nom de code de l'agent secret fictif créé par l'écrivain Ian Fleming en 1953. Le matricule 007 lui a été attribué dans les romans et films de la série."),
            en = LocalizedContent("Which British secret agent is known as 007?", listOf("Sean Connery", "James Bond (fiction)", "George Blake", "Kim Philby"), "History", "James Bond is the code name of the fictional secret agent created by writer Ian Fleming in 1953. The number 007 was assigned to him in the novels and films of the series."),
            zh = LocalizedContent("哪位英国特工以007闻名？", listOf("肖恩·康纳利", "詹姆斯·邦德（虚构）", "乔治·布莱克", "金·菲尔比"), "历史", "詹姆斯·邦德是作家伊恩·弗莱明于1953年创造的虚构特工的代号。007这个编号在系列小说和电影中被赋予了他。"),
            es = LocalizedContent("¿Qué agente secreto británico es conocido como 007?", listOf("Sean Connery", "James Bond (ficción)", "George Blake", "Kim Philby"), "Historia", "James Bond es el nombre en clave del agente secreto ficticio creado por el escritor Ian Fleming en 1953. El número 007 le fue asignado en las novelas y películas de la serie.")
        ),
        BilingualQuestion(
            id = 12541, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année le Cambridge Spy Ring a-t-il été exposé?", listOf("1949", "1951", "1961", "1965"), "Histoire", "Le Cambridge Spy Ring, un réseau d'espions britanniques travaillant pour l'Union soviétique, a été exposé en 1961 après la défection de l'agent soviétique Anatoli Golitsyne."),
            en = LocalizedContent("In what year was the Cambridge Spy Ring exposed?", listOf("1949", "1951", "1961", "1965"), "History", "The Cambridge Spy Ring, a network of British spies working for the Soviet Union, was exposed in 1961 after the defection of Soviet agent Anatoli Golitsyn."),
            zh = LocalizedContent("剑桥间谍网在哪一年被揭露？", listOf("1949", "1951", "1961", "1965"), "历史", "剑桥间谍网是一个为苏联工作的英国间谍网络，在苏联特工阿纳托利·戈利岑叛逃后于1961年被揭露。"),
            es = LocalizedContent("¿En qué año se expuso el Cambridge Spy Ring?", listOf("1949", "1951", "1961", "1965"), "Historia", "El Cambridge Spy Ring, una red de espías británicos que trabajaban para la Unión Soviética, fue expuesto en 1961 tras la deserción del agente soviético Anatoli Golitsyn.")
        ),
        BilingualQuestion(
            id = 12542, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel pirate a fondé une colonie en Madagascar?", listOf("Capitaine Kidd", "Henry Morgan", "Bartholomew Roberts", "Jean Lafitte"), "Histoire", "Le capitaine Kidd s'est installé à Madagascar au XVIIe siècle, où il a établi une base pirate sur l'île Sainte-Marie, servant de refuge et de colonie pour les flibustiers."),
            en = LocalizedContent("Which pirate founded a colony in Madagascar?", listOf("Captain Kidd", "Henry Morgan", "Bartholomew Roberts", "Jean Lafitte"), "History", "Captain Kidd settled in Madagascar in the 17th century, where he established a pirate base on Sainte-Marie Island, serving as a refuge and colony for buccaneers."),
            zh = LocalizedContent("哪位海盗在马达加斯加建立了一个殖民地？", listOf("基德船长", "亨利·摩根", "巴塞洛缪·罗伯茨", "让·拉菲特"), "历史", "基德船长在17世纪定居马达加斯加，在圣玛丽岛上建立了一个海盗基地，作为海盗的避难所和殖民地。"),
            es = LocalizedContent("¿Qué pirata fundó una colonia en Madagascar?", listOf("Capitán Kidd", "Henry Morgan", "Bartholomew Roberts", "Jean Lafitte"), "Historia", "El capitán Kidd se instaló en Madagascar en el siglo XVII, donde estableció una base pirata en la isla Sainte-Marie, sirviendo como refugio y colonia para los bucaneros.")
        ),
        BilingualQuestion(
            id = 12543, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de hommes Barbe-Noire avait-il dans son équipage maximal?", listOf("50", "100", "300", "500"), "Histoire", "Barbe-Noire, de son vrai nom Edward Teach, commandait un équipage d'environ 300 hommes à son apogée, ce qui en faisait l'un des plus redoutables pirates des Caraïbes au début du XVIIIe siècle."),
            en = LocalizedContent("How many men did Blackbeard have in his maximum crew?", listOf("50", "100", "300", "500"), "History", "Blackbeard, real name Edward Teach, commanded a crew of about 300 men at his peak, making him one of the most feared pirates in the Caribbean in the early 18th century."),
            zh = LocalizedContent("黑胡子最多有多少船员？", listOf("50", "100", "300", "500"), "历史", "黑胡子，真名爱德华·蒂奇，在其巅峰时期指挥约300名船员，使他成为18世纪初加勒比海最令人恐惧的海盗之一。"),
            es = LocalizedContent("¿Cuántos hombres tenía Barbanegra en su tripulación máxima?", listOf("50", "100", "300", "500"), "Historia", "Barbanegra, cuyo verdadero nombre era Edward Teach, comandaba una tripulación de unos 300 hombres en su apogeo, lo que lo convirtió en uno de los piratas más temidos del Caribe a principios del siglo XVIII.")
        ),
        BilingualQuestion(
            id = 12544, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année la ligne Maginot a-t-elle été contournée?", listOf("1940", "1941", "1942", "1943"), "Histoire", "La ligne Maginot a été contournée en mai 1940 lors de l'invasion allemande, les troupes passant par les Ardennes belges, un secteur jugé infranchissable."),
            en = LocalizedContent("In what year was the Maginot Line bypassed?", listOf("1940", "1941", "1942", "1943"), "History", "The Maginot Line was bypassed in May 1940 during the German invasion, with troops passing through the Belgian Ardennes, a sector considered impassable."),
            zh = LocalizedContent("马奇诺防线在哪一年被绕过？", listOf("1940", "1941", "1942", "1943"), "历史", "马奇诺防线在1940年5月德国入侵期间被绕过，德军通过被认为无法通行的比利时阿登地区。"),
            es = LocalizedContent("¿En qué año se flanqueó la Línea Maginot?", listOf("1940", "1941", "1942", "1943"), "Historia", "La Línea Maginot fue flanqueada en mayo de 1940 durante la invasión alemana, pasando las tropas por las Ardenas belgas, un sector considerado infranqueable.")
        ),
        BilingualQuestion(
            id = 12545, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui était le chef du Stasi (police secrète est-allemande)?", listOf("Walter Ulbricht", "Erich Honecker", "Erich Mielke", "Markus Wolf"), "Histoire", "Erich Mielke a dirigé le Stasi de 1957 à 1989, faisant de lui l’un des chefs de police secrète les plus puissants et les plus redoutés de la guerre froide."),
            en = LocalizedContent("Who was the head of the Stasi (East German secret police)?", listOf("Walter Ulbricht", "Erich Honecker", "Erich Mielke", "Markus Wolf"), "History", "Erich Mielke led the Stasi from 1957 to 1989, making him one of the most powerful and feared secret police chiefs of the Cold War."),
            zh = LocalizedContent("谁是斯塔西（东德秘密警察）的负责人？", listOf("瓦尔特·乌布利希", "埃里希·昂纳克", "埃里希·米尔克", "马库斯·沃尔夫"), "历史", "埃里希·米尔克从1957年到1989年领导斯塔西，使他成为冷战时期最强大、最令人恐惧的秘密警察头目之一。"),
            es = LocalizedContent("¿Quién fue el jefe de la Stasi (policía secreta de Alemania Oriental)?", listOf("Walter Ulbricht", "Erich Honecker", "Erich Mielke", "Markus Wolf"), "Historia", "Erich Mielke dirigió la Stasi de 1957 a 1989, convirtiéndolo en uno de los jefes de policía secreta más poderosos y temidos de la Guerra Fría.")
        ),
        BilingualQuestion(
            id = 12546, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel pirate légendaire a utilisé le drapeau noir?", listOf("Captain Kidd", "Blackbeard", "Morgan", "Roberts"), "Histoire", "Blackbeard, de son vrai nom Edward Teach, terrorisait les Caraïbes au début du XVIIIe siècle et arborait un drapeau noir orné d’un squelette tenant un sablier."),
            en = LocalizedContent("Which legendary pirate used the black flag?", listOf("Captain Kidd", "Blackbeard", "Morgan", "Roberts"), "History", "Blackbeard, real name Edward Teach, terrorized the Caribbean in the early 18th century and flew a black flag adorned with a skeleton holding an hourglass."),
            zh = LocalizedContent("哪位传奇海盗使用了黑旗？", listOf("基德船长", "黑胡子", "摩根", "罗伯茨"), "历史", "黑胡子，真名爱德华·蒂奇，在18世纪初恐吓加勒比海，并悬挂一面饰有手持沙漏的骷髅的黑旗。"),
            es = LocalizedContent("¿Qué pirata legendario usó la bandera negra?", listOf("Capitán Kidd", "Barbanegra", "Morgan", "Roberts"), "Historia", "Barbanegra, cuyo verdadero nombre era Edward Teach, aterrorizó el Caribe a principios del siglo XVIII y enarbolaba una bandera negra adornada con un esqueleto sosteniendo un reloj de arena.")
        ),
        BilingualQuestion(
            id = 12547, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("La bataille d'Hastings a eu lieu en quelle année?", listOf("1042", "1066", "1086", "1106"), "Histoire", "La bataille d'Hastings, qui opposa les Normands de Guillaume le Conquérant aux Anglais d'Harold Godwinson, se déroula en 1066 et marqua le début de la conquête normande de l'Angleterre."),
            en = LocalizedContent("The Battle of Hastings took place in what year?", listOf("1042", "1066", "1086", "1106"), "History", "The Battle of Hastings, which pitted the Normans of William the Conqueror against the English of Harold Godwinson, took place in 1066 and marked the beginning of the Norman conquest of England."),
            zh = LocalizedContent("黑斯廷斯战役发生在哪一年？", listOf("1042", "1066", "1086", "1106"), "历史", "黑斯廷斯战役是征服者威廉的诺曼人与哈罗德·戈德温森的英格兰人之间的战斗，发生在1066年，标志着诺曼征服英格兰的开始。"),
            es = LocalizedContent("¿La batalla de Hastings tuvo lugar en qué año?", listOf("1042", "1066", "1086", "1106"), "Historia", "La batalla de Hastings, que enfrentó a los normandos de Guillermo el Conquistador contra los ingleses de Harold Godwinson, tuvo lugar en 1066 y marcó el inicio de la conquista normanda de Inglaterra.")
        ),
        BilingualQuestion(
            id = 12548, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel comte de Flandre a fondé les Templiers?", listOf("Baudouin IV", "Baudouin V", "Godefroy de Bouillon", "Robert le Frison"), "Histoire", "Godefroy de Bouillon, duc de Basse-Lotharingie, fut l'un des chefs de la première croisade et non le fondateur des Templiers ; l'ordre fut créé après sa mort, en 1119, par Hugues de Payns."),
            en = LocalizedContent("Which Count of Flanders founded the Templars?", listOf("Baldwin IV", "Baldwin V", "Godfrey of Bouillon", "Robert the Frisian"), "History", "Godfrey of Bouillon, Duke of Lower Lorraine, was one of the leaders of the First Crusade and not the founder of the Templars; the order was created after his death, in 1119, by Hugh of Payns."),
            zh = LocalizedContent("哪位佛兰德伯爵创立了圣殿骑士团？", listOf("鲍德温四世", "鲍德温五世", "布永的戈弗雷", "罗伯特·弗里西安"), "历史", "布永的戈弗雷，下洛林公爵，是第一次十字军东征的领袖之一，并非圣殿骑士团的创始人；该骑士团是在他去世后，于1119年由于格·德·帕扬创立。"),
            es = LocalizedContent("¿Qué conde de Flandes fundó los Templarios?", listOf("Balduino IV", "Balduino V", "Godofredo de Bouillón", "Roberto el Frisón"), "Historia", "Godofredo de Bouillón, duque de Baja Lorena, fue uno de los líderes de la Primera Cruzada y no el fundador de los Templarios; la orden fue creada después de su muerte, en 1119, por Hugo de Payns.")
        ),
        BilingualQuestion(
            id = 12549, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Combien de navires Christophe Colomb avait-il en 1492?", listOf("2", "3", "5", "8"), "Histoire", "Christophe Colomb partit d'Espagne en 1492 avec trois navires : la Santa Maria, la Pinta et la Niña."),
            en = LocalizedContent("How many ships did Christopher Columbus have in 1492?", listOf("2", "3", "5", "8"), "History", "Christopher Columbus left Spain in 1492 with three ships: the Santa Maria, the Pinta, and the Niña."),
            zh = LocalizedContent("1492年克里斯托弗·哥伦布有多少艘船？", listOf("2", "3", "5", "8"), "历史", "克里斯托弗·哥伦布于1492年从西班牙出发，拥有三艘船：圣玛丽亚号、平塔号和尼尼亚号。"),
            es = LocalizedContent("¿Cuántos barcos tenía Cristóbal Colón en 1492?", listOf("2", "3", "5", "8"), "Historia", "Cristóbal Colón partió de España en 1492 con tres barcos: la Santa María, la Pinta y la Niña.")
        ),
        BilingualQuestion(
            id = 12550, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel fut le code civil mis en place en 1804?", listOf("Code Napoléon", "Code Civil Français", "Code Pénal", "Code Commercial"), "Histoire", "Promulgué le 21 mars 1804, ce code civil unifia le droit français en s'inspirant du droit romain et des coutumes, et fut nommé d'après Napoléon Bonaparte, Premier Consul à l'époque."),
            en = LocalizedContent("What was the civil code established in 1804?", listOf("Napoleonic Code", "French Civil Code", "Penal Code", "Commercial Code"), "History", "Promulgated on March 21, 1804, this civil code unified French law by drawing from Roman law and customs, and was named after Napoleon Bonaparte, then First Consul."),
            zh = LocalizedContent("1804年颁布的民法典是什么？", listOf("拿破仑法典", "法国民法典", "刑法典", "商法典"), "历史", "该民法典于1804年3月21日颁布，借鉴罗马法和习惯法统一了法国法律，并以当时的第一执政官拿破仑·波拿巴命名。"),
            es = LocalizedContent("¿Cuál fue el código civil establecido en 1804?", listOf("Código Napoleónico", "Código Civil Francés", "Código Penal", "Código de Comercio"), "Historia", "Promulgado el 21 de marzo de 1804, este código civil unificó el derecho francés inspirándose en el derecho romano y las costumbres, y recibió el nombre de Napoleón Bonaparte, entonces Primer Cónsul.")
        ),
        BilingualQuestion(
            id = 12551, correctIndex = 3, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année Anne Frank est-elle décédée?", listOf("1942", "1943", "1944", "1945"), "Histoire", "Anne Frank est morte en mars 1945 dans le camp de concentration de Bergen-Belsen, quelques semaines avant sa libération."),
            en = LocalizedContent("In what year did Anne Frank die?", listOf("1942", "1943", "1944", "1945"), "History", "Anne Frank died in March 1945 in the Bergen-Belsen concentration camp, a few weeks before its liberation."),
            zh = LocalizedContent("安妮·弗兰克在哪一年去世？", listOf("1942", "1943", "1944", "1945"), "历史", "安妮·弗兰克于1945年3月在贝尔根-贝尔森集中营去世，距离解放仅几周。"),
            es = LocalizedContent("¿En qué año murió Ana Frank?", listOf("1942", "1943", "1944", "1945"), "Historia", "Ana Frank murió en marzo de 1945 en el campo de concentración de Bergen-Belsen, pocas semanas antes de su liberación.")
        ),
        BilingualQuestion(
            id = 12552, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel célèbre pirate a été pendu à Port-Royal?", listOf("Blackbeard", "Henry Morgan", "Captain Kidd", "Roberts"), "Histoire", "Le pirate écossais William Kidd, dit Captain Kidd, fut exécuté par pendaison à Londres en 1701, et non à Port-Royal, mais son procès et sa mort sont liés à la lutte contre la piraterie dans les Caraïbes."),
            en = LocalizedContent("Which famous pirate was hanged at Port Royal?", listOf("Blackbeard", "Henry Morgan", "Captain Kidd", "Roberts"), "History", "The Scottish pirate William Kidd, known as Captain Kidd, was executed by hanging in London in 1701, not at Port Royal, but his trial and death are linked to the fight against piracy in the Caribbean."),
            zh = LocalizedContent("哪位著名海盗在皇家港被绞死？", listOf("黑胡子", "亨利·摩根", "基德船长", "罗伯茨"), "历史", "苏格兰海盗威廉·基德，即基德船长，于1701年在伦敦被处以绞刑，而非皇家港，但他的审判和死亡与加勒比海的反海盗斗争有关。"),
            es = LocalizedContent("¿Qué famoso pirata fue ahorcado en Port Royal?", listOf("Barbanegra", "Henry Morgan", "Capitán Kidd", "Roberts"), "Historia", "El pirata escocés William Kidd, conocido como Capitán Kidd, fue ejecutado en la horca en Londres en 1701, no en Port Royal, pero su juicio y muerte están vinculados a la lucha contra la piratería en el Caribe.")
        ),
        BilingualQuestion(
            id = 12553, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Le Traité de Westphalie date de quelle année?", listOf("1618", "1648", "1688", "1748"), "Histoire", "Le Traité de Westphalie, signé en 1648, mit fin à la guerre de Trente Ans en Europe et posa les bases du système moderne des États-nations."),
            en = LocalizedContent("The Treaty of Westphalia dates from which year?", listOf("1618", "1648", "1688", "1748"), "History", "The Treaty of Westphalia, signed in 1648, ended the Thirty Years' War in Europe and laid the foundations of the modern system of nation-states."),
            zh = LocalizedContent("《威斯特伐利亚和约》签署于哪一年？", listOf("1618", "1648", "1688", "1748"), "历史", "《威斯特伐利亚和约》于1648年签署，结束了欧洲的三十年战争，并为现代民族国家体系奠定了基础。"),
            es = LocalizedContent("¿El Tratado de Westfalia data de qué año?", listOf("1618", "1648", "1688", "1748"), "Historia", "El Tratado de Westfalia, firmado en 1648, puso fin a la Guerra de los Treinta Años en Europa y sentó las bases del sistema moderno de estados-nación.")
        ),
        BilingualQuestion(
            id = 12554, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de croisades ont eu lieu au total?", listOf("4", "7", "9", "12"), "Histoire", "Les historiens dénombrent généralement neuf croisades majeures entre 1096 et 1272, de la première à la neuvième, bien que certaines expéditions mineures soient parfois comptées à part."),
            en = LocalizedContent("How many crusades took place in total?", listOf("4", "7", "9", "12"), "History", "Historians generally count nine major crusades between 1096 and 1272, from the first to the ninth, although some minor expeditions are sometimes counted separately."),
            zh = LocalizedContent("总共发生了多少次十字军东征？", listOf("4", "7", "9", "12"), "历史", "历史学家通常认为在1096年至1272年间发生了九次主要的十字军东征，从第一次到第九次，尽管一些较小的远征有时被单独计算。"),
            es = LocalizedContent("¿Cuántas cruzadas tuvieron lugar en total?", listOf("4", "7", "9", "12"), "Historia", "Los historiadores generalmente cuentan nueve cruzadas principales entre 1096 y 1272, desde la primera hasta la novena, aunque algunas expediciones menores a veces se cuentan por separado.")
        ),
        BilingualQuestion(
            id = 12555, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel était le métier officiel d'Ivar le Désossé?", listOf("Roi", "Viking/Chef de guerre", "Marchand", "Esclave"), "Histoire", "Ivar le Désossé est un chef viking légendaire du IXe siècle, connu pour avoir mené la Grande Armée païenne lors de l'invasion de l'Angleterre anglo-saxonne."),
            en = LocalizedContent("What was the official occupation of Ivar the Boneless?", listOf("King", "Viking/Warlord", "Merchant", "Slave"), "History", "Ivar the Boneless is a legendary Viking chieftain of the 9th century, known for leading the Great Heathen Army during the invasion of Anglo-Saxon England."),
            zh = LocalizedContent("无骨者伊瓦尔的正式职业是什么？", listOf("国王", "维京人/军事首领", "商人", "奴隶"), "历史", "无骨者伊瓦尔是9世纪传奇的维京首领，以率领维京大军入侵盎格鲁-撒克逊英格兰而闻名。"),
            es = LocalizedContent("¿Cuál era la ocupación oficial de Ivar el Deshuesado?", listOf("Rey", "Vikingo/Caudillo", "Comerciante", "Esclavo"), "Historia", "Ivar el Deshuesado es un legendario caudillo vikingo del siglo IX, conocido por liderar el Gran Ejército Pagano durante la invasión de la Inglaterra anglosajona.")
        ),
        BilingualQuestion(
            id = 12556, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("La Magna Carta a été signée en quelle année?", listOf("1200", "1215", "1225", "1265"), "Histoire", "La Magna Carta fut scellée en 1215 par le roi Jean d'Angleterre sous la pression des barons, limitant le pouvoir royal et posant les bases des droits légaux."),
            en = LocalizedContent("The Magna Carta was signed in which year?", listOf("1200", "1215", "1225", "1265"), "History", "The Magna Carta was sealed in 1215 by King John of England under pressure from the barons, limiting royal power and laying the foundations for legal rights."),
            zh = LocalizedContent("《大宪章》签署于哪一年？", listOf("1200", "1215", "1225", "1265"), "历史", "《大宪章》于1215年由英格兰国王约翰在男爵的压力下签署，限制了王权，并为法律权利奠定了基础。"),
            es = LocalizedContent("¿La Carta Magna fue firmada en qué año?", listOf("1200", "1215", "1225", "1265"), "Historia", "La Carta Magna fue sellada en 1215 por el rey Juan de Inglaterra bajo la presión de los barones, limitando el poder real y sentando las bases de los derechos legales.")
        ),
        BilingualQuestion(
            id = 12557, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel général a remporté la bataille de Salamine?", listOf("Léonidas", "Thémistocle", "Miltiade", "Pausanias"), "Histoire", "Thémistocle, stratège athénien, commanda la flotte grecque qui vainquit les Perses à Salamine en 480 av. J.-C., grâce à sa ruse et à sa connaissance des détroits."),
            en = LocalizedContent("Which general won the Battle of Salamis?", listOf("Leonidas", "Themistocles", "Miltiades", "Pausanias"), "History", "Themistocles, an Athenian strategist, commanded the Greek fleet that defeated the Persians at Salamis in 480 BC, thanks to his cunning and knowledge of the straits."),
            zh = LocalizedContent("哪位将军赢得了萨拉米斯战役？", listOf("列奥尼达", "地米斯托克利", "米太亚德", "保萨尼亚斯"), "历史", "地米斯托克利，雅典战略家，指挥希腊舰队在公元前480年的萨拉米斯战役中击败波斯人，凭借其智谋和对海峡的了解。"),
            es = LocalizedContent("¿Qué general ganó la batalla de Salamina?", listOf("Leónidas", "Temístocles", "Milcíades", "Pausanias"), "Historia", "Temístocles, un estratega ateniense, comandó la flota griega que derrotó a los persas en Salamina en el 480 a.C., gracias a su astucia y conocimiento de los estrechos.")
        ),
        BilingualQuestion(
            id = 12558, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Combien de samuraïs composaient les 47 Rônins?", listOf("37", "47", "57", "67"), "Histoire", "Les 47 rônins étaient des samouraïs devenus maîtres sans seigneur après la mort de leur daimyo, Asano Naganori, et ils ont vengé son honneur en 1703."),
            en = LocalizedContent("How many samurai made up the 47 Ronin?", listOf("37", "47", "57", "67"), "History", "The 47 ronin were samurai who became masterless after the death of their daimyo, Asano Naganori, and they avenged his honor in 1703."),
            zh = LocalizedContent("四十七浪人由多少名武士组成？", listOf("37", "47", "57", "67"), "历史", "四十七浪人是因主君浅野长矩去世而成为无主武士的武士，他们在1703年为主君复仇。"),
            es = LocalizedContent("¿Cuántos samuráis componían los 47 Ronin?", listOf("37", "47", "57", "67"), "Historia", "Los 47 ronin eran samuráis que se quedaron sin señor tras la muerte de su daimio, Asano Naganori, y vengaron su honor en 1703.")
        ),
        BilingualQuestion(
            id = 12559, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année Napoléon a-t-il abdiqué pour la première fois?", listOf("1812", "1813", "1814", "1815"), "Histoire", "Napoléon a abdiqué une première fois le 6 avril 1814 après la défaite de la campagne de France et l’entrée des coalisés à Paris."),
            en = LocalizedContent("In which year did Napoleon abdicate for the first time?", listOf("1812", "1813", "1814", "1815"), "History", "Napoleon first abdicated on April 6, 1814, after the defeat of the French campaign and the entry of the coalition into Paris."),
            zh = LocalizedContent("拿破仑第一次退位是在哪一年？", listOf("1812", "1813", "1814", "1815"), "历史", "拿破仑于1814年4月6日第一次退位，此前法国战役失败，联军进入巴黎。"),
            es = LocalizedContent("¿En qué año abdicó Napoleón por primera vez?", listOf("1812", "1813", "1814", "1815"), "Historia", "Napoleón abdicó por primera vez el 6 de abril de 1814 tras la derrota de la campaña de Francia y la entrada de los coaligados en París.")
        ),
        BilingualQuestion(
            id = 12560, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quelle est la capitale du Niger?", listOf("Niamey", "Dosso", "Maradi", "Zinder"), "Géographie", "Niamey est la capitale du Niger depuis l'indépendance du pays en 1960, située sur les rives du fleuve Niger dans le sud-ouest du territoire."),
            en = LocalizedContent("What is the capital of Niger?", listOf("Niamey", "Dosso", "Maradi", "Zinder"), "Geography", "Niamey has been the capital of Niger since the country's independence in 1960, located on the banks of the Niger River in the southwest of the territory."),
            zh = LocalizedContent("尼日尔的首都是哪里？", listOf("尼亚美", "多索", "马拉迪", "津德尔"), "地理", "尼亚美自1960年尼日尔独立以来一直是首都，位于该国西南部的尼日尔河畔。"),
            es = LocalizedContent("¿Cuál es la capital de Níger?", listOf("Niamey", "Dosso", "Maradi", "Zinder"), "Geografia", "Niamey es la capital de Níger desde la independencia del país en 1960, situada a orillas del río Níger en el suroeste del territorio.")
        ),
        BilingualQuestion(
            id = 12561, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le fleuve le plus long d'Afrique?", listOf("Niger", "Nil", "Congo", "Zambèze"), "Géographie", "Le Nil s'étend sur environ 6 650 kilomètres, traversant onze pays d'Afrique de l'Est et du Nord, ce qui en fait le plus long fleuve du continent."),
            en = LocalizedContent("What is the longest river in Africa?", listOf("Niger", "Nile", "Congo", "Zambezi"), "Geography", "The Nile stretches about 6,650 kilometers, crossing eleven countries in East and North Africa, making it the longest river on the continent."),
            zh = LocalizedContent("非洲最长的河流是哪条？", listOf("尼日尔河", "尼罗河", "刚果河", "赞比西河"), "地理", "尼罗河长约6650公里，流经东非和北非的十一个国家，是非洲最长的河流。"),
            es = LocalizedContent("¿Cuál es el río más largo de África?", listOf("Níger", "Nilo", "Congo", "Zambeze"), "Geografia", "El Nilo se extiende aproximadamente 6.650 kilómetros, atravesando once países de África oriental y septentrional, lo que lo convierte en el río más largo del continente.")
        ),
        BilingualQuestion(
            id = 12562, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quelle est la capitale du Botswana?", listOf("Gaborone", "Francistown", "Maun", "Serowe"), "Géographie", "Gaborone est la capitale du Botswana depuis 1965, remplaçant Mafeking (alors située en Afrique du Sud). Elle fut choisie pour sa position centrale dans le pays."),
            en = LocalizedContent("What is the capital of Botswana?", listOf("Gaborone", "Francistown", "Maun", "Serowe"), "Geography", "Gaborone has been the capital of Botswana since 1965, replacing Mafeking (then located in South Africa). It was chosen for its central position in the country."),
            zh = LocalizedContent("博茨瓦纳的首都是哪里？", listOf("哈博罗内", "弗朗西斯敦", "马翁", "塞罗韦"), "地理", "哈博罗内自1965年起成为博茨瓦纳首都，取代了马弗京（当时位于南非）。因其位于国家中心位置而被选中。"),
            es = LocalizedContent("¿Cuál es la capital de Botsuana?", listOf("Gaborone", "Francistown", "Maun", "Serowe"), "Geografia", "Gaborone es la capital de Botsuana desde 1965, reemplazando a Mafeking (entonces situada en Sudáfrica). Fue elegida por su posición central en el país.")
        ),
        BilingualQuestion(
            id = 12563, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le plus haut sommet d'Afrique?", listOf("Mont Kenya", "Kilimanjaro", "Ruwenzori", "Pic d'Emi Koussi"), "Géographie", "Le Kilimandjaro, situé en Tanzanie, culmine à 5 895 mètres, ce qui en fait le point le plus élevé du continent africain."),
            en = LocalizedContent("What is the highest peak in Africa?", listOf("Mount Kenya", "Kilimanjaro", "Ruwenzori", "Emi Koussi"), "Geography", "Kilimanjaro, located in Tanzania, rises to 5,895 meters, making it the highest point on the African continent."),
            zh = LocalizedContent("非洲最高的山峰是哪座？", listOf("肯尼亚山", "乞力马扎罗山", "鲁文佐里山", "埃米库西山"), "地理", "乞力马扎罗山位于坦桑尼亚，海拔5895米，是非洲大陆的最高点。"),
            es = LocalizedContent("¿Cuál es la cumbre más alta de África?", listOf("Monte Kenia", "Kilimanjaro", "Ruwenzori", "Pico Emi Koussi"), "Geografia", "El Kilimanjaro, situado en Tanzania, alcanza los 5.895 metros, lo que lo convierte en el punto más alto del continente africano.")
        ),
        BilingualQuestion(
            id = 12564, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quelle est la capitale de la Côte d'Ivoire?", listOf("Yamoussoukro", "Abidjan", "Bouaké", "San-Pédro"), "Géographie", "Yamoussoukro est la capitale politique et administrative de la Côte d'Ivoire depuis 1983, remplaçant Abidjan qui reste la capitale économique."),
            en = LocalizedContent("What is the capital of Ivory Coast?", listOf("Yamoussoukro", "Abidjan", "Bouaké", "San-Pédro"), "Geography", "Yamoussoukro has been the political and administrative capital of Ivory Coast since 1983, replacing Abidjan which remains the economic capital."),
            zh = LocalizedContent("科特迪瓦的首都是哪里？", listOf("亚穆苏克罗", "阿比让", "布瓦凯", "圣佩德罗"), "地理", "亚穆苏克罗自1983年起成为科特迪瓦的政治和行政首都，取代了仍为经济首都的阿比让。"),
            es = LocalizedContent("¿Cuál es la capital de Costa de Marfil?", listOf("Yamusukro", "Abiyán", "Bouaké", "San-Pédro"), "Geografia", "Yamusukro es la capital política y administrativa de Costa de Marfil desde 1983, reemplazando a Abiyán que sigue siendo la capital económica.")
        ),
        BilingualQuestion(
            id = 12565, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien d'îles les Seychelles possèdent-elles?", listOf("50", "115", "240", "365"), "Géographie", "L'archipel des Seychelles est composé de 115 îles, réparties entre les îles granitiques et les îles coralliennes."),
            en = LocalizedContent("How many islands does Seychelles have?", listOf("50", "115", "240", "365"), "Geography", "The Seychelles archipelago consists of 115 islands, divided between granitic and coralline islands."),
            zh = LocalizedContent("塞舌尔有多少个岛屿？", listOf("50", "115", "240", "365"), "地理", "塞舌尔群岛由115个岛屿组成，分为花岗岩岛和珊瑚岛。"),
            es = LocalizedContent("¿Cuántas islas poseen las Seychelles?", listOf("50", "115", "240", "365"), "Geografia", "El archipiélago de las Seychelles está compuesto por 115 islas, repartidas entre islas graníticas y coralinas.")
        ),
        BilingualQuestion(
            id = 12566, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quelle est la capitale du Mali?", listOf("Bamako", "Timbouctu", "Gao", "Kayes"), "Géographie", "Bamako est la capitale du Mali depuis l'indépendance du pays en 1960, située sur les rives du fleuve Niger."),
            en = LocalizedContent("What is the capital of Mali?", listOf("Bamako", "Timbuktu", "Gao", "Kayes"), "Geography", "Bamako has been the capital of Mali since the country's independence in 1960, located on the banks of the Niger River."),
            zh = LocalizedContent("马里的首都是哪里？", listOf("巴马科", "廷巴克图", "加奥", "卡伊"), "地理", "巴马科自1960年马里独立以来一直是首都，位于尼日尔河畔。"),
            es = LocalizedContent("¿Cuál es la capital de Malí?", listOf("Bamako", "Tombuctú", "Gao", "Kayes"), "Geografia", "Bamako es la capital de Malí desde la independencia del país en 1960, situada a orillas del río Níger.")
        ),
        BilingualQuestion(
            id = 12567, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le désert le plus grand d'Afrique?", listOf("Kalahari", "Sahara", "Namib", "Atacama"), "Géographie", "Le Sahara s'étend sur environ 9,2 millions de kilomètres carrés, traversant une douzaine de pays d'Afrique du Nord, ce qui en fait le plus grand désert chaud du continent et du monde."),
            en = LocalizedContent("What is the largest desert in Africa?", listOf("Kalahari", "Sahara", "Namib", "Atacama"), "Geography", "The Sahara covers about 9.2 million square kilometers, spanning a dozen countries in North Africa, making it the largest hot desert on the continent and in the world."),
            zh = LocalizedContent("非洲最大的沙漠是哪个？", listOf("卡拉哈里沙漠", "撒哈拉沙漠", "纳米布沙漠", "阿塔卡马沙漠"), "地理", "撒哈拉沙漠面积约920万平方公里，覆盖北非十多个国家，是非洲和世界上最大的热带沙漠。"),
            es = LocalizedContent("¿Cuál es el desierto más grande de África?", listOf("Kalahari", "Sáhara", "Namib", "Atacama"), "Geografia", "El Sáhara se extiende sobre aproximadamente 9,2 millones de kilómetros cuadrados, atravesando una docena de países del norte de África, lo que lo convierte en el desierto cálido más grande del continente y del mundo.")
        ),
        BilingualQuestion(
            id = 12568, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quelle est la capitale du Sénégal?", listOf("Dakar", "Saint-Louis", "Kaolack", "Tambacounda"), "Géographie", "Dakar est la capitale du Sénégal depuis l'indépendance du pays en 1960, située sur la presqu'île du Cap-Vert, dans l'océan Atlantique."),
            en = LocalizedContent("What is the capital of Senegal?", listOf("Dakar", "Saint-Louis", "Kaolack", "Tambacounda"), "Geography", "Dakar has been the capital of Senegal since the country's independence in 1960, located on the Cape Verde Peninsula in the Atlantic Ocean."),
            zh = LocalizedContent("塞内加尔的首都是哪里？", listOf("达喀尔", "圣路易", "考拉克", "坦巴昆达"), "地理", "达喀尔自1960年塞内加尔独立以来一直是首都，位于大西洋的佛得角半岛上。"),
            es = LocalizedContent("¿Cuál es la capital de Senegal?", listOf("Dakar", "Saint-Louis", "Kaolack", "Tambacounda"), "Geografia", "Dakar es la capital de Senegal desde la independencia del país en 1960, situada en la península de Cabo Verde, en el océano Atlántico.")
        ),
        BilingualQuestion(
            id = 12569, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le plus grand lac d'Afrique?", listOf("Lac Victoria", "Lac Tanganyika", "Lac Malawi", "Lac Tchad"), "Géographie", "Le lac Victoria est le plus grand lac d'Afrique par sa superficie, s'étendant sur environ 68 800 km² entre l'Ouganda, la Tanzanie et le Kenya."),
            en = LocalizedContent("What is the largest lake in Africa?", listOf("Lake Victoria", "Lake Tanganyika", "Lake Malawi", "Lake Chad"), "Geography", "Lake Victoria is the largest lake in Africa by surface area, covering approximately 68,800 km² between Uganda, Tanzania, and Kenya."),
            zh = LocalizedContent("非洲最大的湖泊是哪个？", listOf("维多利亚湖", "坦噶尼喀湖", "马拉维湖", "乍得湖"), "地理", "维多利亚湖是非洲面积最大的湖泊，面积约68,800平方公里，位于乌干达、坦桑尼亚和肯尼亚之间。"),
            es = LocalizedContent("¿Cuál es el lago más grande de África?", listOf("Lago Victoria", "Lago Tanganica", "Lago Malawi", "Lago Chad"), "Geografía", "El lago Victoria es el lago más grande de África por superficie, con aproximadamente 68.800 km² entre Uganda, Tanzania y Kenia.")
        ),
        BilingualQuestion(
            id = 12570, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quelle est la capitale de la Namibie?", listOf("Windhoek", "Swakopmund", "Walvis Bay", "Rundu"), "Géographie", "Windhoek est la capitale et la plus grande ville de la Namibie, située au centre du pays. Elle concentre les institutions politiques et économiques nationales."),
            en = LocalizedContent("What is the capital of Namibia?", listOf("Windhoek", "Swakopmund", "Walvis Bay", "Rundu"), "Geography", "Windhoek is the capital and largest city of Namibia, located in the center of the country. It concentrates the national political and economic institutions."),
            zh = LocalizedContent("纳米比亚的首都是哪里？", listOf("温得和克", "斯瓦科普蒙德", "鲸湾港", "伦杜"), "地理", "温得和克是纳米比亚的首都和最大城市，位于该国中部，集中了国家政治和经济机构。"),
            es = LocalizedContent("¿Cuál es la capital de Namibia?", listOf("Windhoek", "Swakopmund", "Walvis Bay", "Rundu"), "Geografía", "Windhoek es la capital y ciudad más grande de Namibia, ubicada en el centro del país. Concentra las instituciones políticas y económicas nacionales.")
        ),
        BilingualQuestion(
            id = 12571, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Combien de pays composent l'Afrique?", listOf("50", "52", "54", "56"), "Géographie", "L'Union africaine reconnaît 54 États souverains sur le continent africain, incluant des nations comme le Nigeria et l'Égypte."),
            en = LocalizedContent("How many countries make up Africa?", listOf("50", "52", "54", "56"), "Geography", "The African Union recognizes 54 sovereign states on the African continent, including nations like Nigeria and Egypt."),
            zh = LocalizedContent("非洲由多少个国家组成？", listOf("50", "52", "54", "56"), "地理", "非洲联盟承认非洲大陆有54个主权国家，包括尼日利亚和埃及等国。"),
            es = LocalizedContent("¿Cuántos países componen África?", listOf("50", "52", "54", "56"), "Geografía", "La Unión Africana reconoce 54 estados soberanos en el continente africano, incluyendo naciones como Nigeria y Egipto.")
        ),
        BilingualQuestion(
            id = 12572, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quelle est la capitale du Rwanda?", listOf("Kigali", "Butare", "Gitarama", "Muhanga"), "Géographie", "Kigali est la capitale et la plus grande ville du Rwanda, située au centre du pays. Elle est le principal centre économique, politique et culturel du Rwanda."),
            en = LocalizedContent("What is the capital of Rwanda?", listOf("Kigali", "Butare", "Gitarama", "Muhanga"), "Geography", "Kigali is the capital and largest city of Rwanda, located in the center of the country. It is the main economic, political, and cultural center of Rwanda."),
            zh = LocalizedContent("卢旺达的首都是哪里？", listOf("基加利", "布塔雷", "吉塔拉马", "穆汉加"), "地理", "基加利是卢旺达的首都和最大城市，位于该国中部，是卢旺达的主要经济、政治和文化中心。"),
            es = LocalizedContent("¿Cuál es la capital de Ruanda?", listOf("Kigali", "Butare", "Gitarama", "Muhanga"), "Geografía", "Kigali es la capital y ciudad más grande de Ruanda, ubicada en el centro del país. Es el principal centro económico, político y cultural de Ruanda.")
        ),
        BilingualQuestion(
            id = 12573, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le delta le plus grand du monde?", listOf("Nil", "Mississippi", "Mékong", "Gange"), "Géographie", "Le delta du Gange-Brahmapoutre, principalement au Bangladesh et en Inde, est le plus grand delta du monde, et non le Mékong."),
            en = LocalizedContent("What is the largest delta in the world?", listOf("Nile", "Mississippi", "Mekong", "Ganges"), "Geography", "The Ganges-Brahmaputra delta, primarily in Bangladesh and India, is the largest delta in the world, not the Mekong."),
            zh = LocalizedContent("世界上最大的三角洲是哪个？", listOf("尼罗河", "密西西比河", "湄公河", "恒河"), "地理", "恒河-布拉马普特拉河三角洲主要位于孟加拉国和印度，是世界上最大的三角洲，而非湄公河三角洲。"),
            es = LocalizedContent("¿Cuál es el delta más grande del mundo?", listOf("Nilo", "Misisipi", "Mekong", "Ganges"), "Geografía", "El delta del Ganges-Brahmaputra, principalmente en Bangladés y la India, es el delta más grande del mundo, no el Mekong.")
        ),
        BilingualQuestion(
            id = 12574, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quelle est la capitale de la Tunisie?", listOf("Tunis", "Sfax", "Sousse", "Kairouan"), "Géographie", "Tunis est la capitale et la plus grande ville de la Tunisie, située sur la côte méditerranéenne. Elle abrite le siège du gouvernement et des institutions nationales."),
            en = LocalizedContent("What is the capital of Tunisia?", listOf("Tunis", "Sfax", "Sousse", "Kairouan"), "Geography", "Tunis is the capital and largest city of Tunisia, located on the Mediterranean coast. It houses the seat of government and national institutions."),
            zh = LocalizedContent("突尼斯的首都是哪里？", listOf("突尼斯市", "斯法克斯", "苏塞", "凯鲁万"), "地理", "突尼斯市是突尼斯的首都和最大城市，位于地中海沿岸，是政府和国家机构的所在地。"),
            es = LocalizedContent("¿Cuál es la capital de Túnez?", listOf("Túnez", "Sfax", "Susa", "Kairuán"), "Geografía", "Túnez es la capital y ciudad más grande de Túnez, ubicada en la costa mediterránea. Alberga la sede del gobierno y las instituciones nacionales.")
        ),
        BilingualQuestion(
            id = 12575, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand archipèl du Pacifique?", listOf("Hawaï", "Nouvelle-Zélande", "Indonésie", "Micronésie"), "Géographie", "L'Indonésie est le plus grand archipel du monde, avec plus de 17 000 îles, et se situe dans l'océan Pacifique."),
            en = LocalizedContent("What is the largest archipelago in the Pacific?", listOf("Hawaii", "New Zealand", "Indonesia", "Micronesia"), "Geography", "Indonesia is the largest archipelago in the world, with over 17,000 islands, and is located in the Pacific Ocean."),
            zh = LocalizedContent("太平洋上最大的群岛是哪个？", listOf("夏威夷", "新西兰", "印度尼西亚", "密克罗尼西亚"), "地理", "印度尼西亚是世界上最大的群岛，拥有超过17,000个岛屿，位于太平洋。"),
            es = LocalizedContent("¿Cuál es el archipiélago más grande del Pacífico?", listOf("Hawái", "Nueva Zelanda", "Indonesia", "Micronesia"), "Geografía", "Indonesia es el archipiélago más grande del mundo, con más de 17.000 islas, y se encuentra en el océano Pacífico.")
        ),
        BilingualQuestion(
            id = 12576, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quelle est la capitale du Mozambique?", listOf("Maputo", "Beira", "Inhambane", "Quelimane"), "Géographie", "Maputo, anciennement Lourenço Marques, est la capitale et la plus grande ville du Mozambique, située sur la côte sud du pays, dans l'océan Indien."),
            en = LocalizedContent("What is the capital of Mozambique?", listOf("Maputo", "Beira", "Inhambane", "Quelimane"), "Geography", "Maputo, formerly Lourenço Marques, is the capital and largest city of Mozambique, located on the southern coast of the country, on the Indian Ocean."),
            zh = LocalizedContent("莫桑比克的首都是哪里？", listOf("马普托", "贝拉", "伊尼扬巴内", "克利马内"), "地理", "马普托，原名洛伦索-马贵斯，是莫桑比克的首都和最大城市，位于该国南部海岸，濒临印度洋。"),
            es = LocalizedContent("¿Cuál es la capital de Mozambique?", listOf("Maputo", "Beira", "Inhambane", "Quelimane"), "Geografía", "Maputo, anteriormente Lourenço Marques, es la capital y ciudad más grande de Mozambique, ubicada en la costa sur del país, en el océano Índico.")
        ),
        BilingualQuestion(
            id = 12577, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de fjords la Norvège possède-t-elle?", listOf("500", "1000", "1500+", "2000+"), "Géographie", "La Norvège possède plus de 1500 fjords, résultat de l'érosion glaciaire qui a creusé ces vallées marines le long de sa côte très découpée."),
            en = LocalizedContent("How many fjords does Norway have?", listOf("500", "1000", "1500+", "2000+"), "Geography", "Norway has more than 1500 fjords, a result of glacial erosion that carved these marine valleys along its highly indented coastline."),
            zh = LocalizedContent("挪威有多少个峡湾？", listOf("500", "1000", "1500+", "2000+"), "地理", "挪威拥有超过1500个峡湾，这是冰川侵蚀在其曲折海岸线上雕刻出的海洋河谷。"),
            es = LocalizedContent("¿Cuántos fiordos tiene Noruega?", listOf("500", "1000", "1500+", "2000+"), "Geografía", "Noruega tiene más de 1500 fiordos, resultado de la erosión glaciar que excavó estos valles marinos a lo largo de su costa muy recortada.")
        ),
        BilingualQuestion(
            id = 12578, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quelle est la capitale du Zimbabwe?", listOf("Harare", "Bulawayo", "Gweru", "Mutare"), "Géographie", "Harare est la capitale et la plus grande ville du Zimbabwe depuis 1982, succédant à Salisbury, son nom colonial."),
            en = LocalizedContent("What is the capital of Zimbabwe?", listOf("Harare", "Bulawayo", "Gweru", "Mutare"), "Geography", "Harare has been the capital and largest city of Zimbabwe since 1982, succeeding Salisbury, its colonial name."),
            zh = LocalizedContent("津巴布韦的首都是哪里？", listOf("哈拉雷", "布拉瓦约", "圭鲁", "穆塔雷"), "地理", "哈拉雷自1982年起成为津巴布韦的首都和最大城市，取代了其殖民时期的名称索尔兹伯里。"),
            es = LocalizedContent("¿Cuál es la capital de Zimbabue?", listOf("Harare", "Bulawayo", "Gweru", "Mutare"), "Geografía", "Harare es la capital y ciudad más grande de Zimbabue desde 1982, sucediendo a Salisbury, su nombre colonial.")
        ),
        BilingualQuestion(
            id = 12579, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le canyon le plus profond du monde?", listOf("Grand Canyon", "Yarlung Tsangpo", "Copper Canyon", "Kali Gandaki"), "Géographie", "Le Yarlung Tsangpo, situé au Tibet, est le canyon le plus profond du monde, atteignant environ 6 009 mètres de profondeur, surpassant le Grand Canyon."),
            en = LocalizedContent("What is the deepest canyon in the world?", listOf("Grand Canyon", "Yarlung Tsangpo", "Copper Canyon", "Kali Gandaki"), "Geography", "The Yarlung Tsangpo, located in Tibet, is the deepest canyon in the world, reaching about 6,009 meters in depth, surpassing the Grand Canyon."),
            zh = LocalizedContent("世界上最深的峡谷是哪个？", listOf("大峡谷", "雅鲁藏布大峡谷", "铜峡谷", "卡利甘达基峡谷"), "地理", "位于西藏的雅鲁藏布大峡谷是世界上最深的峡谷，深度约6009米，超过了大峡谷。"),
            es = LocalizedContent("¿Cuál es el cañón más profundo del mundo?", listOf("Gran Cañón", "Yarlung Tsangpo", "Cañón del Cobre", "Kali Gandaki"), "Geografía", "El Yarlung Tsangpo, ubicado en el Tíbet, es el cañón más profundo del mundo, alcanzando unos 6.009 metros de profundidad, superando al Gran Cañón.")
        ),
        BilingualQuestion(
            id = 12580, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Combien de tentacules une pieuvre possède-t-elle?", listOf("6", "8", "10", "12"), "Nature", "Les pieuvres sont des céphalopodes à huit bras, ce qui leur a valu le nom d'octopodes. Chaque bras est doté de ventouses et d'une grande dextérité."),
            en = LocalizedContent("How many tentacles does an octopus have?", listOf("6", "8", "10", "12"), "Nature", "Octopuses are cephalopods with eight arms, which earned them the name octopods. Each arm is equipped with suckers and great dexterity."),
            zh = LocalizedContent("章鱼有多少条触手？", listOf("6", "8", "10", "12"), "自然", "章鱼是八腕类头足动物，因此得名八腕类。每条腕上都长有吸盘，非常灵活。"),
            es = LocalizedContent("¿Cuántos tentáculos tiene un pulpo?", listOf("6", "8", "10", "12"), "Naturaleza", "Los pulpos son cefalópodos con ocho brazos, lo que les valió el nombre de octópodos. Cada brazo está provisto de ventosas y gran destreza.")
        ),
        BilingualQuestion(
            id = 12581, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le plus grand mammifère marin?", listOf("Requin blanc", "Baleine bleue", "Cachalot", "Orque"), "Nature", "La baleine bleue est le plus grand mammifère marin, pouvant atteindre 30 mètres de long et peser jusqu'à 200 tonnes, ce qui en fait aussi le plus grand animal vivant sur Terre."),
            en = LocalizedContent("What is the largest marine mammal?", listOf("Great white shark", "Blue whale", "Sperm whale", "Orca"), "Nature", "The blue whale is the largest marine mammal, reaching up to 30 meters in length and weighing up to 200 tons, making it also the largest living animal on Earth."),
            zh = LocalizedContent("最大的海洋哺乳动物是什么？", listOf("大白鲨", "蓝鲸", "抹香鲸", "虎鲸"), "自然", "蓝鲸是最大的海洋哺乳动物，体长可达30米，重达200吨，也是地球上现存最大的动物。"),
            es = LocalizedContent("¿Cuál es el mamífero marino más grande?", listOf("Tiburón blanco", "Ballena azul", "Cachalote", "Orca"), "Naturaleza", "La ballena azul es el mamífero marino más grande, pudiendo alcanzar 30 metros de largo y pesar hasta 200 toneladas, lo que la convierte también en el animal vivo más grande de la Tierra.")
        ),
        BilingualQuestion(
            id = 12582, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quelle profondeur peut atteindre le poisson-lanterne?", listOf("1000m", "2000m", "3000m", "4000m"), "Nature", "Le poisson-lanterne vit dans la zone bathypélagique, entre 1000 et 4000 mètres de profondeur, où il utilise sa bioluminescence pour chasser et se camoufler dans l'obscurité."),
            en = LocalizedContent("What depth can the lanternfish reach?", listOf("1000m", "2000m", "3000m", "4000m"), "Nature", "The lanternfish lives in the bathypelagic zone, between 1000 and 4000 meters deep, where it uses bioluminescence to hunt and camouflage in the darkness."),
            zh = LocalizedContent("灯笼鱼能到达多深？", listOf("1000米", "2000米", "3000米", "4000米"), "自然", "灯笼鱼生活在深海区，深度在1000到4000米之间，利用生物发光在黑暗中捕食和伪装。"),
            es = LocalizedContent("¿Qué profundidad puede alcanzar el pez linterna?", listOf("1000m", "2000m", "3000m", "4000m"), "Naturaleza", "El pez linterna vive en la zona batipelágica, entre 1000 y 4000 metros de profundidad, donde utiliza la bioluminiscencia para cazar y camuflarse en la oscuridad.")
        ),
        BilingualQuestion(
            id = 12583, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Combien de dents a un grand requin blanc?", listOf("100", "200", "300", "500"), "Nature", "Le grand requin blanc possède environ 300 dents, disposées en plusieurs rangées, qui se renouvellent constamment tout au long de sa vie."),
            en = LocalizedContent("How many teeth does a great white shark have?", listOf("100", "200", "300", "500"), "Nature", "The great white shark has about 300 teeth, arranged in several rows, which are constantly replaced throughout its life."),
            zh = LocalizedContent("大白鲨有多少颗牙齿？", listOf("100", "200", "300", "500"), "自然", "大白鲨约有300颗牙齿，排列成几排，一生中不断更换。"),
            es = LocalizedContent("¿Cuántos dientes tiene un gran tiburón blanco?", listOf("100", "200", "300", "500"), "Naturaleza", "El gran tiburón blanco posee aproximadamente 300 dientes, dispuestos en varias filas, que se renuevan constantemente a lo largo de su vida.")
        ),
        BilingualQuestion(
            id = 12584, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel céphalopode est capable de changer de couleur en 0,3 secondes?", listOf("Calmar géant", "Seiche", "Pieuvre", "Nautile"), "Nature", "La seiche possède des cellules pigmentaires appelées chromatophores, contrôlées par des muscles, qui lui permettent de modifier instantanément sa couleur pour se camoufler ou communiquer."),
            en = LocalizedContent("Which cephalopod can change color in 0.3 seconds?", listOf("Giant squid", "Cuttlefish", "Octopus", "Nautilus"), "Nature", "The cuttlefish has pigment cells called chromatophores, controlled by muscles, allowing it to instantly change color for camouflage or communication."),
            zh = LocalizedContent("哪种头足动物能在0.3秒内改变颜色？", listOf("巨型乌贼", "乌贼", "章鱼", "鹦鹉螺"), "自然", "乌贼拥有称为色素细胞的色素细胞，由肌肉控制，使其能够瞬间改变颜色以伪装或交流。"),
            es = LocalizedContent("¿Qué cefalópodo es capaz de cambiar de color en 0,3 segundos?", listOf("Calamar gigante", "Sepia", "Pulpo", "Nautilo"), "Naturaleza", "La sepia posee células pigmentarias llamadas cromatóforos, controladas por músculos, que le permiten modificar instantáneamente su color para camuflarse o comunicarse.")
        ),
        BilingualQuestion(
            id = 12585, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quelle est la vitesse maximale du marlin bleu?", listOf("60 km/h", "80 km/h", "100 km/h", "120 km/h"), "Nature", "Le marlin bleu est l'un des poissons les plus rapides de l'océan, capable d'atteindre 100 km/h grâce à son corps fuselé et sa nageoire caudale puissante."),
            en = LocalizedContent("What is the maximum speed of the blue marlin?", listOf("60 km/h", "80 km/h", "100 km/h", "120 km/h"), "Nature", "The blue marlin is one of the fastest fish in the ocean, capable of reaching 100 km/h thanks to its streamlined body and powerful tail fin."),
            zh = LocalizedContent("蓝枪鱼的最大速度是多少？", listOf("60公里/小时", "80公里/小时", "100公里/小时", "120公里/小时"), "自然", "蓝枪鱼是海洋中速度最快的鱼类之一，凭借流线型身体和强壮的尾鳍，速度可达100公里/小时。"),
            es = LocalizedContent("¿Cuál es la velocidad máxima del marlín azul?", listOf("60 km/h", "80 km/h", "100 km/h", "120 km/h"), "Naturaleza", "El marlín azul es uno de los peces más rápidos del océano, capaz de alcanzar 100 km/h gracias a su cuerpo fusiforme y su potente aleta caudal.")
        ),
        BilingualQuestion(
            id = 12586, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Combien d'espèces de requins existent?", listOf("200", "500", "1000", "1500"), "Nature", "Environ 1 000 espèces de requins sont recensées dans le monde, allant du minuscule requin-lanterne nain au gigantesque requin-baleine."),
            en = LocalizedContent("How many species of sharks exist?", listOf("200", "500", "1000", "1500"), "Nature", "About 1,000 species of sharks are recorded worldwide, ranging from the tiny dwarf lanternshark to the gigantic whale shark."),
            zh = LocalizedContent("现存多少种鲨鱼？", listOf("200", "500", "1000", "1500"), "自然", "全球记录约有1000种鲨鱼，从微小的侏儒灯笼鲨到巨大的鲸鲨。"),
            es = LocalizedContent("¿Cuántas especies de tiburones existen?", listOf("200", "500", "1000", "1500"), "Naturaleza", "Alrededor de 1.000 especies de tiburones están registradas en el mundo, desde el diminuto tiburón linterna enano hasta el gigantesco tiburón ballena.")
        ),
        BilingualQuestion(
            id = 12587, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Le nautile a combien de bras?", listOf("8", "10", "12", "14"), "Nature", "Contrairement à la pieuvre (8 bras) ou la seiche (10), le nautile possède jusqu'à 90 tentacules, mais on en distingue 10 principaux utilisés pour la capture des proies."),
            en = LocalizedContent("How many arms does a nautilus have?", listOf("8", "10", "12", "14"), "Nature", "Unlike the octopus (8 arms) or cuttlefish (10), the nautilus has up to 90 tentacles, but 10 main ones are distinguished for capturing prey."),
            zh = LocalizedContent("鹦鹉螺有多少条腕？", listOf("8", "10", "12", "14"), "自然", "与章鱼（8条腕）或乌贼（10条腕）不同，鹦鹉螺有多达90条触手，但主要用来捕捉猎物的有10条。"),
            es = LocalizedContent("¿Cuántos brazos tiene un nautilo?", listOf("8", "10", "12", "14"), "Naturaleza", "A diferencia del pulpo (8 brazos) o la sepia (10), el nautilo posee hasta 90 tentáculos, pero se distinguen 10 principales utilizados para la captura de presas.")
        ),
        BilingualQuestion(
            id = 12588, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quelle est la profondeur approximative du Challenger Deep?", listOf("7000m", "9000m", "11000m", "13000m"), "Nature", "Le Challenger Deep, situé dans la fosse des Mariannes, est le point le plus profond des océans, atteignant environ 11 000 mètres sous le niveau de la mer."),
            en = LocalizedContent("What is the approximate depth of the Challenger Deep?", listOf("7000m", "9000m", "11000m", "13000m"), "Nature", "The Challenger Deep, located in the Mariana Trench, is the deepest point of the oceans, reaching about 11,000 meters below sea level."),
            zh = LocalizedContent("挑战者深渊的近似深度是多少？", listOf("7000米", "9000米", "11000米", "13000米"), "自然", "位于马里亚纳海沟的挑战者深渊是海洋最深处，深度约11000米。"),
            es = LocalizedContent("¿Cuál es la profundidad aproximada del Abismo Challenger?", listOf("7000m", "9000m", "11000m", "13000m"), "Naturaleza", "El Abismo Challenger, ubicado en la Fosa de las Marianas, es el punto más profundo de los océanos, alcanzando unos 11.000 metros bajo el nivel del mar.")
        ),
        BilingualQuestion(
            id = 12589, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de cœurs possède une pieuvre?", listOf("1", "2", "3", "5"), "Nature", "Les pieuvres ont trois cœurs : deux branchiaux qui pompent le sang vers les branchies et un systémique qui l'envoie dans le reste du corps."),
            en = LocalizedContent("How many hearts does an octopus have?", listOf("1", "2", "3", "5"), "Nature", "Octopuses have three hearts: two branchial hearts that pump blood to the gills and one systemic heart that sends it to the rest of the body."),
            zh = LocalizedContent("章鱼有多少颗心脏？", listOf("1", "2", "3", "5"), "自然", "章鱼有三颗心脏：两颗鳃心将血液泵送到鳃，一颗体心将血液输送到身体其他部位。"),
            es = LocalizedContent("¿Cuántos corazones tiene un pulpo?", listOf("1", "2", "3", "5"), "Naturaleza", "Los pulpos tienen tres corazones: dos branquiales que bombean sangre a las branquias y uno sistémico que la envía al resto del cuerpo.")
        ),
        BilingualQuestion(
            id = 12590, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel poisson abyssal peut avaler une proie plus grande que lui?", listOf("Poisson-lanterne", "Poisson-vipère", "Baudroie des abysses", "Poisson-hache"), "Nature", "La baudroie des abysses possède un estomac extensible et des mâchoires articulées qui lui permettent d'engloutir des proies plus grandes qu'elle-même, une adaptation essentielle dans les profondeurs où la nourriture est rare."),
            en = LocalizedContent("Which abyssal fish can swallow prey larger than itself?", listOf("Lanternfish", "Viperfish", "Anglerfish", "Hatchetfish"), "Nature", "The anglerfish has an expandable stomach and articulated jaws that allow it to engulf prey larger than itself, an essential adaptation in the depths where food is scarce."),
            zh = LocalizedContent("哪种深海鱼能吞下比自己大的猎物？", listOf("灯笼鱼", "蝰鱼", "深海鮟鱇鱼", "斧头鱼"), "自然", "深海鮟鱇鱼拥有可扩张的胃和灵活的颌骨，使其能吞下比自己大的猎物，这是在食物稀缺的深海中的重要适应能力。"),
            es = LocalizedContent("¿Qué pez abisal puede tragar una presa más grande que él?", listOf("Pez linterna", "Pez víbora", "Rape abisal", "Pez hacha"), "Naturaleza", "El rape abisal posee un estómago extensible y mandíbulas articuladas que le permiten engullir presas más grandes que él mismo, una adaptación esencial en las profundidades donde el alimento es escaso.")
        ),
        BilingualQuestion(
            id = 12591, correctIndex = 3, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Combien d'espèces de coraux existent environ?", listOf("500", "1000", "2000", "5000"), "Nature", "Les récifs coralliens abritent environ 5 000 espèces de coraux durs et mous dans le monde, principalement dans les eaux tropicales."),
            en = LocalizedContent("How many species of corals exist approximately?", listOf("500", "1000", "2000", "5000"), "Nature", "Coral reefs host about 5,000 species of hard and soft corals worldwide, mainly in tropical waters."),
            zh = LocalizedContent("大约有多少种珊瑚？", listOf("500", "1000", "2000", "5000"), "自然", "全球珊瑚礁大约有5000种硬珊瑚和软珊瑚，主要分布在热带水域。"),
            es = LocalizedContent("¿Cuántas especies de corales existen aproximadamente?", listOf("500", "1000", "2000", "5000"), "Naturaleza", "Los arrecifes de coral albergan alrededor de 5.000 especies de corales duros y blandos en todo el mundo, principalmente en aguas tropicales.")
        ),
        BilingualQuestion(
            id = 12592, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel cétacé est le plus rapide?", listOf("Dauphin", "Beluga", "Marsouin", "Orque"), "Nature", "L'orque peut atteindre 55 km/h, ce qui en fait le cétacé le plus rapide, devant le dauphin commun ou le rorqual bleu."),
            en = LocalizedContent("Which cetacean is the fastest?", listOf("Dolphin", "Beluga", "Porpoise", "Orca"), "Nature", "The orca can reach 55 km/h, making it the fastest cetacean, ahead of the common dolphin or the blue whale."),
            zh = LocalizedContent("哪种鲸类动物速度最快？", listOf("海豚", "白鲸", "鼠海豚", "虎鲸"), "自然", "虎鲸时速可达55公里，是速度最快的鲸类动物，超过普通海豚或蓝鲸。"),
            es = LocalizedContent("¿Qué cetáceo es el más rápido?", listOf("Delfín", "Beluga", "Marsopa", "Orca"), "Naturaleza", "La orca puede alcanzar 55 km/h, lo que la convierte en el cetáceo más rápido, por delante del delfín común o la ballena azul.")
        ),
        BilingualQuestion(
            id = 12593, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quelle profondeur les calmars géants peuvent-ils atteindre?", listOf("500m", "1000m", "2000m", "3000m"), "Nature", "Les calmars géants vivent dans les abysses, où la pression est extrême, et ont été observés jusqu'à 3000 mètres de profondeur."),
            en = LocalizedContent("What depth can giant squids reach?", listOf("500m", "1000m", "2000m", "3000m"), "Nature", "Giant squids live in the abyss, where pressure is extreme, and have been observed at depths of up to 3000 meters."),
            zh = LocalizedContent("巨型鱿鱼能到达多深？", listOf("500米", "1000米", "2000米", "3000米"), "自然", "巨型鱿鱼生活在深海，压力极大，已被观察到在3000米深处。"),
            es = LocalizedContent("¿Qué profundidad pueden alcanzar los calamares gigantes?", listOf("500m", "1000m", "2000m", "3000m"), "Naturaleza", "Los calamares gigantes viven en el abismo, donde la presión es extrema, y se han observado hasta 3000 metros de profundidad.")
        ),
        BilingualQuestion(
            id = 12594, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Combien de dents possède un espadon?", listOf("0", "500", "1000", "2000"), "Nature", "L'espadon n'a pas de dents, car il utilise son long rostre en forme d'épée pour frapper et étourdir ses proies avant de les avaler entières."),
            en = LocalizedContent("How many teeth does a swordfish have?", listOf("0", "500", "1000", "2000"), "Nature", "The swordfish has no teeth, as it uses its long sword-like rostrum to strike and stun prey before swallowing them whole."),
            zh = LocalizedContent("剑鱼有多少颗牙齿？", listOf("0", "500", "1000", "2000"), "自然", "剑鱼没有牙齿，因为它用其长而像剑一样的吻部击打并击晕猎物，然后整个吞下。"),
            es = LocalizedContent("¿Cuántos dientes tiene un pez espada?", listOf("0", "500", "1000", "2000"), "Naturaleza", "El pez espada no tiene dientes, ya que utiliza su largo rostro en forma de espada para golpear y aturdir a sus presas antes de tragarlas enteras.")
        ),
        BilingualQuestion(
            id = 12595, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le taux de reproduction du corail dur par an?", listOf("5%", "10%", "20%", "50%"), "Nature", "Les coraux durs ont un taux de croissance lent, généralement de quelques millimètres à quelques centimètres par an, ce qui correspond à un taux de reproduction annuel moyen d'environ 10 %."),
            en = LocalizedContent("What is the annual reproduction rate of hard coral?", listOf("5%", "10%", "20%", "50%"), "Nature", "Hard corals have a slow growth rate, typically a few millimeters to a few centimeters per year, corresponding to an average annual reproduction rate of about 10%."),
            zh = LocalizedContent("硬珊瑚的年繁殖率是多少？", listOf("5%", "10%", "20%", "50%"), "自然", "硬珊瑚生长缓慢，通常每年几毫米到几厘米，对应平均年繁殖率约为10%。"),
            es = LocalizedContent("¿Cuál es la tasa de reproducción anual del coral duro?", listOf("5%", "10%", "20%", "50%"), "Naturaleza", "Los corales duros tienen una tasa de crecimiento lenta, generalmente de unos pocos milímetros a unos pocos centímetros por año, lo que corresponde a una tasa de reproducción anual promedio de aproximadamente el 10%.")
        ),
        BilingualQuestion(
            id = 12596, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Le requin baleine mesure combien de mètres en moyenne?", listOf("5m", "10m", "15m", "20m"), "Nature", "Le requin baleine est le plus grand poisson du monde, atteignant en moyenne 15 mètres de long, soit la taille d’un bus scolaire."),
            en = LocalizedContent("How many meters long is the whale shark on average?", listOf("5m", "10m", "15m", "20m"), "Nature", "The whale shark is the largest fish in the world, averaging 15 meters in length, about the size of a school bus."),
            zh = LocalizedContent("鲸鲨平均身长多少米？", listOf("5米", "10米", "15米", "20米"), "自然", "鲸鲨是世界上最大的鱼类，平均身长15米，大约相当于一辆校车的长度。"),
            es = LocalizedContent("¿Cuántos metros mide en promedio el tiburón ballena?", listOf("5m", "10m", "15m", "20m"), "Naturaleza", "El tiburón ballena es el pez más grande del mundo, con un promedio de 15 metros de largo, aproximadamente del tamaño de un autobús escolar.")
        ),
        BilingualQuestion(
            id = 12597, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de vertèbres possède un dauphin?", listOf("30", "50", "70", "90"), "Nature", "Les dauphins ont environ 70 vertèbres, ce qui est bien plus que les humains (33), car leur colonne vertébrale très flexible leur permet de nager avec agilité."),
            en = LocalizedContent("How many vertebrae does a dolphin have?", listOf("30", "50", "70", "90"), "Nature", "Dolphins have about 70 vertebrae, much more than humans (33), as their highly flexible spine allows them to swim with agility."),
            zh = LocalizedContent("海豚有多少块椎骨？", listOf("30", "50", "70", "90"), "自然", "海豚约有70块椎骨，远多于人类（33块），因为它们高度灵活的脊柱使其能够敏捷地游泳。"),
            es = LocalizedContent("¿Cuántas vértebras tiene un delfín?", listOf("30", "50", "70", "90"), "Naturaleza", "Los delfines tienen alrededor de 70 vértebras, mucho más que los humanos (33), ya que su columna vertebral muy flexible les permite nadar con agilidad.")
        ),
        BilingualQuestion(
            id = 12598, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel poisson des abysses utilise un piège lumineux?", listOf("Baudroie", "Hatchetfish", "Viperfish", "Snipe-eel"), "Nature", "La baudroie possède un appendice dorsal bioluminescent, appelé esca, qu'elle agite pour attirer ses proies dans les profondeurs obscures."),
            en = LocalizedContent("Which abyssal fish uses a light trap?", listOf("Anglerfish", "Hatchetfish", "Viperfish", "Snipe-eel"), "Nature", "The anglerfish has a bioluminescent dorsal appendage, called the esca, which it wiggles to attract prey in the dark depths."),
            zh = LocalizedContent("哪种深海鱼使用光陷阱？", listOf("鮟鱇鱼", "斧头鱼", "蝰鱼", "鹬鳗"), "自然", "鮟鱇鱼有一个生物发光的背鳍附属物，称为钓饵，它通过摆动来在黑暗的深海中吸引猎物。"),
            es = LocalizedContent("¿Qué pez abisal utiliza una trampa de luz?", listOf("Rape", "Pez hacha", "Pez víbora", "Anguila aguja"), "Naturaleza", "El rape posee un apéndice dorsal bioluminiscente, llamado esca, que agita para atraer a sus presas en las profundidades oscuras.")
        ),
        BilingualQuestion(
            id = 12599, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("La temperature des sources hydrothermales marines atteint combien de degrés?", listOf("100°C", "250°C", "400°C", "600°C"), "Nature", "Les sources hydrothermales émettent un fluide surchauffé sous pression pouvant atteindre 400°C, grâce à l'activité géothermique des dorsales océaniques."),
            en = LocalizedContent("What temperature do marine hydrothermal vents reach?", listOf("100°C", "250°C", "400°C", "600°C"), "Nature", "Hydrothermal vents emit superheated fluid under pressure that can reach 400°C, thanks to geothermal activity at oceanic ridges."),
            zh = LocalizedContent("海洋热液喷口的温度能达到多少度？", listOf("100°C", "250°C", "400°C", "600°C"), "自然", "热液喷口在压力下喷出过热流体，由于大洋中脊的地热活动，温度可达400°C。"),
            es = LocalizedContent("¿Qué temperatura alcanzan las fuentes hidrotermales marinas?", listOf("100°C", "250°C", "400°C", "600°C"), "Naturaleza", "Las fuentes hidrotermales emiten un fluido sobrecalentado a presión que puede alcanzar los 400°C, gracias a la actividad geotérmica de las dorsales oceánicas.")
        ),
        BilingualQuestion(
            id = 12600, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année AlphaGo a-t-il battu Lee Sedol au Go?", listOf("2014", "2016", "2018", "2020"), "Technologie", "AlphaGo, développé par DeepMind, a vaincu Lee Sedol en mars 2016 lors d'un match historique à Séoul, marquant une avancée majeure dans l'intelligence artificielle."),
            en = LocalizedContent("In what year did AlphaGo beat Lee Sedol at Go?", listOf("2014", "2016", "2018", "2020"), "Technology", "AlphaGo, developed by DeepMind, defeated Lee Sedol in March 2016 during a historic match in Seoul, marking a major advance in artificial intelligence."),
            zh = LocalizedContent("AlphaGo在哪一年击败了李世石的围棋？", listOf("2014", "2016", "2018", "2020"), "科技", "由DeepMind开发的AlphaGo在2016年3月于首尔的历史性比赛中击败了李世石，标志着人工智能的重大进步。"),
            es = LocalizedContent("¿En qué año AlphaGo venció a Lee Sedol en el Go?", listOf("2014", "2016", "2018", "2020"), "Tecnología", "AlphaGo, desarrollado por DeepMind, derrotó a Lee Sedol en marzo de 2016 durante una partida histórica en Seúl, marcando un avance importante en la inteligencia artificial.")
        ),
        BilingualQuestion(
            id = 12601, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le nombre de paramètres du modèle GPT-4?", listOf("100 milliards", "175 milliards", "1 trillion", "1,7 trillion"), "Technologie", "OpenAI n'a jamais officiellement confirmé le nombre exact de paramètres de GPT-4, mais des estimations non officielles l'évaluent à environ 1 trillion, soit 1000 milliards."),
            en = LocalizedContent("What is the number of parameters in the GPT-4 model?", listOf("100 billion", "175 billion", "1 trillion", "1.7 trillion"), "Technology", "OpenAI has never officially confirmed the exact number of parameters for GPT-4, but unofficial estimates put it at around 1 trillion, i.e., 1000 billion."),
            zh = LocalizedContent("GPT-4模型的参数数量是多少？", listOf("1000亿", "1750亿", "1万亿", "1.7万亿"), "科技", "OpenAI从未正式确认GPT-4的确切参数数量，但非官方估计约为1万亿，即1000亿。"),
            es = LocalizedContent("¿Cuál es el número de parámetros del modelo GPT-4?", listOf("100 mil millones", "175 mil millones", "1 billón", "1,7 billones"), "Tecnología", "OpenAI nunca ha confirmado oficialmente el número exacto de parámetros de GPT-4, pero estimaciones no oficiales lo sitúan en alrededor de 1 billón, es decir, 1000 mil millones.")
        ),
        BilingualQuestion(
            id = 12602, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("En quelle année Bitcoin a-t-il été créé?", listOf("2006", "2008", "2009", "2011"), "Technologie", "Bitcoin a été lancé en 2009 par une personne ou un groupe sous le pseudonyme de Satoshi Nakamoto, marquant le début de la première cryptomonnaie décentralisée."),
            en = LocalizedContent("In what year was Bitcoin created?", listOf("2006", "2008", "2009", "2011"), "Technology", "Bitcoin was launched in 2009 by a person or group under the pseudonym Satoshi Nakamoto, marking the beginning of the first decentralized cryptocurrency."),
            zh = LocalizedContent("比特币是哪一年创建的？", listOf("2006", "2008", "2009", "2011"), "科技", "比特币于2009年由化名为中本聪的个人或团体推出，标志着第一种去中心化加密货币的开端。"),
            es = LocalizedContent("¿En qué año se creó Bitcoin?", listOf("2006", "2008", "2009", "2011"), "Tecnología", "Bitcoin fue lanzado en 2009 por una persona o grupo bajo el seudónimo de Satoshi Nakamoto, marcando el inicio de la primera criptomoneda descentralizada.")
        ),
        BilingualQuestion(
            id = 12603, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de blocs Bitcoin sont minés par jour environ?", listOf("100", "200", "300", "400"), "Technologie", "Le protocole Bitcoin ajuste la difficulté de minage pour qu'un bloc soit trouvé en moyenne toutes les 10 minutes, ce qui donne environ 144 blocs par jour, et non 300."),
            en = LocalizedContent("Approximately how many Bitcoin blocks are mined per day?", listOf("100", "200", "300", "400"), "Technology", "The Bitcoin protocol adjusts mining difficulty so that a block is found on average every 10 minutes, resulting in about 144 blocks per day, not 300."),
            zh = LocalizedContent("每天大约挖出多少个比特币区块？", listOf("100", "200", "300", "400"), "科技", "比特币协议调整挖矿难度，使得平均每10分钟找到一个区块，因此每天大约产生144个区块，而不是300个。"),
            es = LocalizedContent("¿Aproximadamente cuántos bloques de Bitcoin se minan por día?", listOf("100", "200", "300", "400"), "Tecnología", "El protocolo de Bitcoin ajusta la dificultad de minería para que se encuentre un bloque en promedio cada 10 minutos, lo que da alrededor de 144 bloques por día, no 300.")
        ),
        BilingualQuestion(
            id = 12604, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel réseau de neurones est utilisé pour la reconnaissance d'images?", listOf("RNN", "CNN", "LSTM", "GRU"), "Technologie", "Les CNN (Convolutional Neural Networks) sont spécialisés dans le traitement des données spatiales comme les images, grâce à leurs couches de convolution qui détectent les motifs visuels."),
            en = LocalizedContent("Which neural network is used for image recognition?", listOf("RNN", "CNN", "LSTM", "GRU"), "Technology", "CNNs (Convolutional Neural Networks) are specialized in processing spatial data like images, thanks to their convolutional layers that detect visual patterns."),
            zh = LocalizedContent("哪种神经网络用于图像识别？", listOf("RNN", "CNN", "LSTM", "GRU"), "科技", "CNN（卷积神经网络）专门处理图像等空间数据，其卷积层能够检测视觉模式。"),
            es = LocalizedContent("¿Qué red neuronal se utiliza para el reconocimiento de imágenes?", listOf("RNN", "CNN", "LSTM", "GRU"), "Tecnología", "Las CNN (Redes Neuronales Convolucionales) están especializadas en el procesamiento de datos espaciales como imágenes, gracias a sus capas de convolución que detectan patrones visuales.")
        ),
        BilingualQuestion(
            id = 12605, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année le premier drone commercial a-t-il été vendu?", listOf("2008", "2010", "2012", "2014"), "Technologie", "Le DJI Phantom, considéré comme le premier drone grand public prêt à voler, a été lancé en 2013, mais des modèles commerciaux antérieurs comme le Parrot AR.Drone sont apparus dès 2010. Cependant, 2012 marque l’année où le premier drone véritablement commercialisé pour le grand public, le DJI Phantom 1, a été officiellement vendu."),
            en = LocalizedContent("In what year was the first commercial drone sold?", listOf("2008", "2010", "2012", "2014"), "Technology", "The DJI Phantom, considered the first ready-to-fly consumer drone, was launched in 2013, but earlier commercial models like the Parrot AR.Drone appeared in 2010. However, 2012 marks the year when the first truly commercial drone for the general public, the DJI Phantom 1, was officially sold."),
            zh = LocalizedContent("第一架商用无人机是哪一年售出的？", listOf("2008", "2010", "2012", "2014"), "科技", "DJI Phantom被认为是第一款即飞型消费级无人机，于2013年推出，但更早的商业型号如Parrot AR.Drone在2010年就已出现。然而，2012年是第一款真正面向大众的商用无人机DJI Phantom 1正式售出的年份。"),
            es = LocalizedContent("¿En qué año se vendió el primer dron comercial?", listOf("2008", "2010", "2012", "2014"), "Tecnología", "El DJI Phantom, considerado el primer dron de consumo listo para volar, se lanzó en 2013, pero modelos comerciales anteriores como el Parrot AR.Drone aparecieron en 2010. Sin embargo, 2012 marca el año en que se vendió oficialmente el primer dron verdaderamente comercial para el público general, el DJI Phantom 1.")
        ),
        BilingualQuestion(
            id = 12606, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quelle est la portée théorique de la 5G?", listOf("1 km", "5 km", "10 km", "100 km"), "Technologie", "La portée théorique de la 5G est d'environ 10 km en zone rurale, mais elle chute à quelques centaines de mètres en ville à cause des obstacles et des fréquences plus élevées utilisées."),
            en = LocalizedContent("What is the theoretical range of 5G?", listOf("1 km", "5 km", "10 km", "100 km"), "Technology", "The theoretical range of 5G is about 10 km in rural areas, but it drops to a few hundred meters in cities due to obstacles and the higher frequencies used."),
            zh = LocalizedContent("5G的理论覆盖范围是多少？", listOf("1公里", "5公里", "10公里", "100公里"), "科技", "5G的理论覆盖范围在农村地区约为10公里，但在城市中由于障碍物和使用的更高频率，会下降到几百米。"),
            es = LocalizedContent("¿Cuál es el alcance teórico del 5G?", listOf("1 km", "5 km", "10 km", "100 km"), "Tecnología", "El alcance teórico del 5G es de aproximadamente 10 km en zonas rurales, pero se reduce a unos cientos de metros en la ciudad debido a obstáculos y las frecuencias más altas utilizadas.")
        ),
        BilingualQuestion(
            id = 12607, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Combien de caméras a le nouveau système de vision de Tesla?", listOf("6", "8", "12", "16"), "Technologie", "Le Tesla Autopilot de nouvelle génération utilise un système de vision à 8 caméras pour une perception à 360 degrés, offrant une portée allant jusqu'à 250 mètres."),
            en = LocalizedContent("How many cameras does Tesla's new vision system have?", listOf("6", "8", "12", "16"), "Technology", "The next-generation Tesla Autopilot uses an 8-camera vision system for 360-degree perception, providing a range of up to 250 meters."),
            zh = LocalizedContent("特斯拉的新视觉系统有多少个摄像头？", listOf("6", "8", "12", "16"), "科技", "新一代特斯拉自动驾驶仪使用8摄像头视觉系统实现360度感知，探测距离可达250米。"),
            es = LocalizedContent("¿Cuántas cámaras tiene el nuevo sistema de visión de Tesla?", listOf("6", "8", "12", "16"), "Tecnología", "El Autopilot de nueva generación de Tesla utiliza un sistema de visión de 8 cámaras para una percepción de 360 grados, con un alcance de hasta 250 metros.")
        ),
        BilingualQuestion(
            id = 12608, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année la réalité virtuelle grand public a-t-elle décollé?", listOf("2014", "2016", "2018", "2020"), "Technologie", "2016 marque le lancement des casques Oculus Rift et HTC Vive, rendant la VR accessible au grand public pour la première fois."),
            en = LocalizedContent("In what year did consumer virtual reality take off?", listOf("2014", "2016", "2018", "2020"), "Technology", "2016 marks the launch of the Oculus Rift and HTC Vive headsets, making VR accessible to the general public for the first time."),
            zh = LocalizedContent("消费级虚拟现实在哪一年开始起飞？", listOf("2014", "2016", "2018", "2020"), "科技", "2016年，Oculus Rift和HTC Vive头显的推出，使VR首次面向大众消费者。"),
            es = LocalizedContent("¿En qué año despegó la realidad virtual de consumo?", listOf("2014", "2016", "2018", "2020"), "Tecnología", "2016 marca el lanzamiento de los cascos Oculus Rift y HTC Vive, haciendo que la VR sea accesible al público general por primera vez.")
        ),
    )

    private fun part2(): List<BilingualQuestion> = listOf(
        BilingualQuestion(
            id = 12609, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quelle entreprise a créé le premier chatbot IA conversationnel grand public?", listOf("Google", "OpenAI", "Microsoft", "Meta"), "Technologie", "OpenAI a lancé ChatGPT en novembre 2022, rendant l'IA conversationnelle accessible au grand public pour la première fois."),
            en = LocalizedContent("Which company created the first mainstream conversational AI chatbot?", listOf("Google", "OpenAI", "Microsoft", "Meta"), "Technology", "OpenAI launched ChatGPT in November 2022, making conversational AI accessible to the general public for the first time."),
            zh = LocalizedContent("哪家公司创建了第一个面向大众的对话式人工智能聊天机器人？", listOf("谷歌", "OpenAI", "微软", "Meta"), "科技", "OpenAI于2022年11月推出了ChatGPT，首次让对话式人工智能面向大众。"),
            es = LocalizedContent("¿Qué empresa creó el primer chatbot de IA conversacional para el público general?", listOf("Google", "OpenAI", "Microsoft", "Meta"), "Tecnología", "OpenAI lanzó ChatGPT en noviembre de 2022, haciendo que la IA conversacional fuera accesible al público general por primera vez.")
        ),
        BilingualQuestion(
            id = 12610, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de transistors contient le processeur M3 d'Apple?", listOf("8 milliards", "16 milliards", "8 milliards", "12 milliards"), "Technologie", "Le processeur M3 d'Apple, lancé en 2023, est gravé en 3 nanomètres et intègre environ 8 milliards de transistors, permettant des performances accrues et une meilleure efficacité énergétique."),
            en = LocalizedContent("How many transistors does Apple's M3 processor contain?", listOf("8 billion", "16 billion", "8 billion", "12 billion"), "Technology", "Apple's M3 processor, launched in 2023, is built on a 3-nanometer process and integrates approximately 8 billion transistors, enabling increased performance and better energy efficiency."),
            zh = LocalizedContent("苹果M3处理器包含多少晶体管？", listOf("80亿", "160亿", "80亿", "120亿"), "科技", "苹果M3处理器于2023年推出，采用3纳米工艺，集成了约80亿个晶体管，实现了更高的性能和更好的能效。"),
            es = LocalizedContent("¿Cuántos transistores contiene el procesador M3 de Apple?", listOf("8 mil millones", "16 mil millones", "8 mil millones", "12 mil millones"), "Tecnología", "El procesador M3 de Apple, lanzado en 2023, está fabricado en un proceso de 3 nanómetros e integra aproximadamente 8 mil millones de transistores, lo que permite un mayor rendimiento y una mejor eficiencia energética.")
        ),
        BilingualQuestion(
            id = 12611, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel consensus blockchain Ethereum 2.0 utilise-t-il?", listOf("Proof of Work", "Proof of Stake", "Proof of Authority", "Proof of History"), "Technologie", "Ethereum 2.0 a migré du Proof of Work vers le Proof of Stake pour valider les transactions, réduisant la consommation d'énergie de 99,95 %. Les validateurs sont choisis en fonction de leur mise en jeu d'ETH."),
            en = LocalizedContent("Which blockchain consensus does Ethereum 2.0 use?", listOf("Proof of Work", "Proof of Stake", "Proof of Authority", "Proof of History"), "Technology", "Ethereum 2.0 migrated from Proof of Work to Proof of Stake to validate transactions, reducing energy consumption by 99.95%. Validators are chosen based on their staked ETH."),
            zh = LocalizedContent("以太坊2.0使用哪种区块链共识机制？", listOf("工作量证明", "权益证明", "权威证明", "历史证明"), "科技", "以太坊2.0从工作量证明迁移到权益证明来验证交易，能耗降低了99.95%。验证者根据其质押的ETH数量被选中。"),
            es = LocalizedContent("¿Qué consenso de blockchain utiliza Ethereum 2.0?", listOf("Prueba de Trabajo", "Prueba de Participación", "Prueba de Autoridad", "Prueba de Historia"), "Tecnología", "Ethereum 2.0 migró de Prueba de Trabajo a Prueba de Participación para validar transacciones, reduciendo el consumo de energía en un 99.95%. Los validadores son seleccionados según su ETH apostado.")
        ),
        BilingualQuestion(
            id = 12612, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année l'impression 3D a-t-elle été brevetée?", listOf("1987", "1992", "1996", "2000"), "Technologie", "Le brevet de la stéréolithographie, procédé fondateur de l'impression 3D, a été déposé par Charles Hull en 1986 et accordé en 1987."),
            en = LocalizedContent("In which year was 3D printing patented?", listOf("1987", "1992", "1996", "2000"), "Technology", "The patent for stereolithography, the foundational process of 3D printing, was filed by Charles Hull in 1986 and granted in 1987."),
            zh = LocalizedContent("3D打印在哪一年获得专利？", listOf("1987", "1992", "1996", "2000"), "科技", "立体光刻技术是3D打印的基础工艺，其专利由Charles Hull于1986年提交，并于1987年获批。"),
            es = LocalizedContent("¿En qué año se patentó la impresión 3D?", listOf("1987", "1992", "1996", "2000"), "Tecnología", "La patente de la estereolitografía, el proceso fundacional de la impresión 3D, fue presentada por Charles Hull en 1986 y concedida en 1987.")
        ),
        BilingualQuestion(
            id = 12613, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quelle est la résolution maximale d'impression 3D standard?", listOf("0,1 mm", "0,05 mm", "0,01 mm", "0,001 mm"), "Technologie", "La résolution standard de 0,01 mm correspond à la hauteur de couche minimale atteignable par la plupart des imprimantes 3D FDM grand public, offrant un bon équilibre entre précision et vitesse."),
            en = LocalizedContent("What is the standard maximum resolution of 3D printing?", listOf("0.1 mm", "0.05 mm", "0.01 mm", "0.001 mm"), "Technology", "The standard resolution of 0.01 mm corresponds to the minimum layer height achievable by most consumer FDM 3D printers, offering a good balance between precision and speed."),
            zh = LocalizedContent("3D打印的标准最大分辨率是多少？", listOf("0.1毫米", "0.05毫米", "0.01毫米", "0.001毫米"), "科技", "0.01毫米的标准分辨率对应大多数消费级FDM 3D打印机可实现的最小层高，在精度和速度之间取得了良好平衡。"),
            es = LocalizedContent("¿Cuál es la resolución máxima estándar de la impresión 3D?", listOf("0,1 mm", "0,05 mm", "0,01 mm", "0,001 mm"), "Tecnología", "La resolución estándar de 0,01 mm corresponde a la altura de capa mínima alcanzable por la mayoría de las impresoras 3D FDM de consumo, ofreciendo un buen equilibrio entre precisión y velocidad.")
        ),
        BilingualQuestion(
            id = 12614, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de milliards de pixels possède la caméra du télescope Vera Rubin?", listOf("3,2", "6,4", "12,8", "25,6"), "Technologie", "La caméra du télescope Vera Rubin, la plus grande jamais construite pour l'astronomie, totalise 3,2 milliards de pixels pour capturer des images détaillées du ciel austral."),
            en = LocalizedContent("How many billion pixels does the camera of the Vera Rubin Telescope have?", listOf("3.2", "6.4", "12.8", "25.6"), "Technology", "The camera of the Vera Rubin Telescope, the largest ever built for astronomy, totals 3.2 billion pixels to capture detailed images of the southern sky."),
            zh = LocalizedContent("维拉·鲁宾望远镜的相机有多少亿像素？", listOf("32亿", "64亿", "128亿", "256亿"), "科技", "维拉·鲁宾望远镜的相机是天文领域有史以来最大的相机，总像素达32亿，用于捕捉南天球的详细图像。"),
            es = LocalizedContent("¿Cuántos mil millones de píxeles tiene la cámara del telescopio Vera Rubin?", listOf("3,2", "6,4", "12,8", "25,6"), "Tecnología", "La cámara del telescopio Vera Rubin, la más grande jamás construida para astronomía, totaliza 3,2 mil millones de píxeles para capturar imágenes detalladas del cielo austral.")
        ),
        BilingualQuestion(
            id = 12615, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel algorithme d'IA génère des images (Stable Diffusion)?", listOf("GAN", "Diffusion Model", "VAE", "Transformer"), "Technologie", "Stable Diffusion est un modèle de diffusion, une classe d'algorithmes d'IA qui génèrent des images en inversant progressivement un processus de bruit aléatoire."),
            en = LocalizedContent("Which AI algorithm generates images (Stable Diffusion)?", listOf("GAN", "Diffusion Model", "VAE", "Transformer"), "Technology", "Stable Diffusion is a diffusion model, a class of AI algorithms that generate images by progressively reversing a random noise process."),
            zh = LocalizedContent("哪种人工智能算法生成图像（Stable Diffusion）？", listOf("生成对抗网络", "扩散模型", "变分自编码器", "Transformer"), "科技", "Stable Diffusion是一种扩散模型，属于一类通过逐步逆转随机噪声过程来生成图像的人工智能算法。"),
            es = LocalizedContent("¿Qué algoritmo de IA genera imágenes (Stable Diffusion)?", listOf("GAN", "Modelo de Difusión", "VAE", "Transformer"), "Tecnología", "Stable Diffusion es un modelo de difusión, una clase de algoritmos de IA que generan imágenes invirtiendo progresivamente un proceso de ruido aleatorio.")
        ),
        BilingualQuestion(
            id = 12616, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année le Web3 a-t-il été proposé comme concept?", listOf("2010", "2014", "2017", "2021"), "Technologie", "Le terme Web3 a été popularisé en 2021 par des investisseurs et entrepreneurs comme Gavin Wood, co-fondateur d'Ethereum, pour décrire une version décentralisée du web basée sur la blockchain."),
            en = LocalizedContent("In which year was Web3 proposed as a concept?", listOf("2010", "2014", "2017", "2021"), "Technology", "The term Web3 was popularized in 2021 by investors and entrepreneurs like Gavin Wood, co-founder of Ethereum, to describe a decentralized version of the web based on blockchain."),
            zh = LocalizedContent("Web3作为概念是在哪一年提出的？", listOf("2010", "2014", "2017", "2021"), "科技", "Web3一词在2021年由以太坊联合创始人Gavin Wood等投资者和企业家推广，用于描述基于区块链的去中心化网络版本。"),
            es = LocalizedContent("¿En qué año se propuso Web3 como concepto?", listOf("2010", "2014", "2017", "2021"), "Tecnología", "El término Web3 fue popularizado en 2021 por inversores y emprendedores como Gavin Wood, cofundador de Ethereum, para describir una versión descentralizada de la web basada en blockchain.")
        ),
        BilingualQuestion(
            id = 12617, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quelle est la capacité de stockage du plus grand quantum computer actuel?", listOf("10 qubits", "50 qubits", "100+ qubits", "1000+ qubits"), "Technologie", "Les ordinateurs quantiques actuels les plus avancés dépassent la barre des 100 qubits, un seuil permettant des calculs complexes impossibles pour les supercalculateurs classiques."),
            en = LocalizedContent("What is the storage capacity of the largest current quantum computer?", listOf("10 qubits", "50 qubits", "100+ qubits", "1000+ qubits"), "Technology", "The most advanced current quantum computers exceed the 100-qubit mark, a threshold enabling complex calculations impossible for classical supercomputers."),
            zh = LocalizedContent("目前最大的量子计算机的存储容量是多少？", listOf("10量子比特", "50量子比特", "100+量子比特", "1000+量子比特"), "科技", "目前最先进的量子计算机已超过100量子比特的门槛，这一阈值使得经典超级计算机无法完成的复杂计算成为可能。"),
            es = LocalizedContent("¿Cuál es la capacidad de almacenamiento del ordenador cuántico más grande actual?", listOf("10 qubits", "50 qubits", "100+ qubits", "1000+ qubits"), "Tecnología", "Los ordenadores cuánticos más avanzados actuales superan la marca de 100 qubits, un umbral que permite cálculos complejos imposibles para los superordenadores clásicos.")
        ),
        BilingualQuestion(
            id = 12618, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Combien de mégapixels possède le capteur du téléphone Samsung Galaxy S24?", listOf("48", "108", "200", "256"), "Technologie", "Le Samsung Galaxy S24 utilise un capteur principal de 108 mégapixels, une résolution élevée qui permet des photos détaillées et un recadrage flexible."),
            en = LocalizedContent("How many megapixels does the sensor of the Samsung Galaxy S24 phone have?", listOf("48", "108", "200", "256"), "Technology", "The Samsung Galaxy S24 uses a 108-megapixel main sensor, a high resolution that allows detailed photos and flexible cropping."),
            zh = LocalizedContent("三星Galaxy S24手机的传感器有多少百万像素？", listOf("4800万", "1.08亿", "2亿", "2.56亿"), "科技", "三星Galaxy S24使用1.08亿像素的主传感器，高分辨率可实现细节丰富的照片和灵活的裁剪。"),
            es = LocalizedContent("¿Cuántos megapíxeles tiene el sensor del teléfono Samsung Galaxy S24?", listOf("48", "108", "200", "256"), "Tecnología", "El Samsung Galaxy S24 utiliza un sensor principal de 108 megapíxeles, una alta resolución que permite fotos detalladas y un recorte flexible.")
        ),
        BilingualQuestion(
            id = 12619, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le temps de latence théorique de la 5G?", listOf("10ms", "5ms", "1ms", "0,1ms"), "Technologie", "La 5G vise une latence théorique d’environ 1 milliseconde, contre 30 à 50 ms pour la 4G, afin de permettre des applications en temps réel comme la chirurgie à distance ou les véhicules autonomes."),
            en = LocalizedContent("What is the theoretical latency of 5G?", listOf("10ms", "5ms", "1ms", "0.1ms"), "Technology", "5G aims for a theoretical latency of about 1 millisecond, compared to 30-50 ms for 4G, enabling real-time applications like remote surgery or autonomous vehicles."),
            zh = LocalizedContent("5G的理论延迟是多少？", listOf("10毫秒", "5毫秒", "1毫秒", "0.1毫秒"), "科技", "5G的理论延迟约为1毫秒，而4G为30-50毫秒，从而实现远程手术或自动驾驶等实时应用。"),
            es = LocalizedContent("¿Cuál es la latencia teórica del 5G?", listOf("10ms", "5ms", "1ms", "0,1ms"), "Tecnología", "El 5G apunta a una latencia teórica de aproximadamente 1 milisegundo, frente a los 30-50 ms del 4G, para permitir aplicaciones en tiempo real como cirugía remota o vehículos autónomos.")
        ),
        BilingualQuestion(
            id = 12620, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record du monde de lancer de poids?", listOf("20.5m", "22.5m", "23.1m", "24.5m"), "Sport", "Le record du monde masculin du lancer de poids est détenu par l'Américain Ryan Crouser avec 23,56 mètres, établi en 2023."),
            en = LocalizedContent("What is the world record in shot put?", listOf("20.5m", "22.5m", "23.1m", "24.5m"), "Sports", "The men's world record in shot put is held by American Ryan Crouser with 23.56 meters, set in 2023."),
            zh = LocalizedContent("铅球的世界纪录是多少？", listOf("20.5米", "22.5米", "23.1米", "24.5米"), "体育", "男子铅球世界纪录由美国选手瑞安·克劳瑟保持，成绩为23.56米，于2023年创造。"),
            es = LocalizedContent("¿Cuál es el récord mundial de lanzamiento de peso?", listOf("20.5m", "22.5m", "23.1m", "24.5m"), "Deportes", "El récord mundial masculino de lanzamiento de peso lo ostenta el estadounidense Ryan Crouser con 23,56 metros, establecido en 2023.")
        ),
        BilingualQuestion(
            id = 12621, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Combien de fois Serena Williams a-t-elle remporté le Wimbledon?", listOf("5", "6", "7", "9"), "Sport", "Serena Williams a remporté Wimbledon à sept reprises, son premier titre en 2002 et le dernier en 2016. Elle détient le record du plus grand nombre de titres du Grand Chelem à l'ère Open."),
            en = LocalizedContent("How many times has Serena Williams won Wimbledon?", listOf("5", "6", "7", "9"), "Sports", "Serena Williams has won Wimbledon seven times, her first title in 2002 and the last in 2016. She holds the record for the most Grand Slam titles in the Open Era."),
            zh = LocalizedContent("塞雷娜·威廉姆斯赢得了多少次温布尔登？", listOf("5", "6", "7", "9"), "体育", "塞雷娜·威廉姆斯七次赢得温布尔登，首次夺冠在2002年，最后一次在2016年。她保持着公开赛时代大满贯冠军数量最多的纪录。"),
            es = LocalizedContent("¿Cuántas veces ha ganado Serena Williams Wimbledon?", listOf("5", "6", "7", "9"), "Deportes", "Serena Williams ha ganado Wimbledon en siete ocasiones, su primer título en 2002 y el último en 2016. Ostenta el récord de más títulos de Grand Slam en la Era Abierta.")
        ),
        BilingualQuestion(
            id = 12622, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record du monde de 800m?", listOf("1:39", "1:41", "1:43", "1:45"), "Sport", "Le record du monde masculin du 800 mètres est détenu par David Rudisha avec un temps de 1:40.91, établi aux Jeux Olympiques de Londres en 2012."),
            en = LocalizedContent("What is the world record in the 800m?", listOf("1:39", "1:41", "1:43", "1:45"), "Sports", "The men's world record in the 800 meters is held by David Rudisha with a time of 1:40.91, set at the 2012 London Olympics."),
            zh = LocalizedContent("800米的世界纪录是多少？", listOf("1:39", "1:41", "1:43", "1:45"), "体育", "男子800米世界纪录由大卫·鲁迪沙保持，成绩为1分40秒91，于2012年伦敦奥运会创造。"),
            es = LocalizedContent("¿Cuál es el récord mundial de 800m?", listOf("1:39", "1:41", "1:43", "1:45"), "Deportes", "El récord mundial masculino de 800 metros lo ostenta David Rudisha con un tiempo de 1:40.91, establecido en los Juegos Olímpicos de Londres 2012.")
        ),
        BilingualQuestion(
            id = 12623, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Combien d'Or Olympiques Michael Phelps a-t-il remportés?", listOf("15", "18", "23", "28"), "Sport", "Michael Phelps détient le record du plus grand nombre de médailles d'or olympiques, avec 23 titres remportés entre 2004 et 2016, principalement en natation."),
            en = LocalizedContent("How many Olympic gold medals has Michael Phelps won?", listOf("15", "18", "23", "28"), "Sports", "Michael Phelps holds the record for the most Olympic gold medals, with 23 titles won between 2004 and 2016, primarily in swimming."),
            zh = LocalizedContent("迈克尔·菲尔普斯赢得了多少枚奥运金牌？", listOf("15", "18", "23", "28"), "体育", "迈克尔·菲尔普斯保持着奥运金牌最多的纪录，共23枚，在2004年至2016年间获得，主要来自游泳项目。"),
            es = LocalizedContent("¿Cuántas medallas de oro olímpicas ha ganado Michael Phelps?", listOf("15", "18", "23", "28"), "Deportes", "Michael Phelps ostenta el récord de más medallas de oro olímpicas, con 23 títulos ganados entre 2004 y 2016, principalmente en natación.")
        ),
        BilingualQuestion(
            id = 12624, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus haut score au tennis en simple?", listOf("17 sets", "25 sets", "87 games", "183 games"), "Sport", "Le record du plus grand nombre de games joués dans un match de tennis en simple est de 183, établi lors du match entre John Isner et Nicolas Mahut à Wimbledon en 2010, qui a duré 11 heures et 5 minutes."),
            en = LocalizedContent("What is the highest score in a singles tennis match?", listOf("17 sets", "25 sets", "87 games", "183 games"), "Sports", "The record for the most games played in a singles tennis match is 183, set during the match between John Isner and Nicolas Mahut at Wimbledon in 2010, which lasted 11 hours and 5 minutes."),
            zh = LocalizedContent("网球单打比赛的最高比分是多少？", listOf("17盘", "25盘", "87局", "183局"), "体育", "网球单打比赛局数最多的纪录是183局，由约翰·伊斯内尔和尼古拉·马于在2010年温布尔登比赛中创造，比赛持续了11小时5分钟。"),
            es = LocalizedContent("¿Cuál es la puntuación más alta en un partido de tenis individual?", listOf("17 sets", "25 sets", "87 juegos", "183 juegos"), "Deportes", "El récord de más juegos jugados en un partido de tenis individual es de 183, establecido durante el partido entre John Isner y Nicolas Mahut en Wimbledon 2010, que duró 11 horas y 5 minutos.")
        ),
        BilingualQuestion(
            id = 12625, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de matchs de tennis professionnels récents ont duré plus de 6 heures?", listOf("5", "10", "15", "20+"), "Sport", "Les matchs de tennis professionnels de plus de 6 heures sont devenus plus fréquents avec l'évolution du jeu et des surfaces, atteignant plus de 20 rencontres depuis 2010, notamment à Wimbledon et à l'Open d'Australie."),
            en = LocalizedContent("How many recent professional tennis matches have lasted over 6 hours?", listOf("5", "10", "15", "20+"), "Sports", "Professional tennis matches lasting over 6 hours have become more frequent with the evolution of the game and surfaces, reaching more than 20 encounters since 2010, notably at Wimbledon and the Australian Open."),
            zh = LocalizedContent("最近有多少场职业网球比赛持续了6小时以上？", listOf("5", "10", "15", "20+"), "体育", "随着比赛和场地的演变，持续超过6小时的职业网球比赛变得更加频繁，自2010年以来已超过20场，尤其是在温布尔登和澳大利亚网球公开赛上。"),
            es = LocalizedContent("¿Cuántos partidos de tenis profesional recientes han durado más de 6 horas?", listOf("5", "10", "15", "20+"), "Deportes", "Los partidos de tenis profesional de más de 6 horas se han vuelto más frecuentes con la evolución del juego y las superficies, superando los 20 encuentros desde 2010, especialmente en Wimbledon y el Abierto de Australia.")
        ),
        BilingualQuestion(
            id = 12626, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record du nombre de buts en une saison Ligue 1?", listOf("42", "50", "56", "60"), "Sport", "José Skoblar a marqué 56 buts avec l'Olympique de Marseille lors de la saison 1970-1971, établissant ce record toujours inégalé en Ligue 1."),
            en = LocalizedContent("What is the record for the number of goals in a Ligue 1 season?", listOf("42", "50", "56", "60"), "Sports", "José Skoblar scored 56 goals with Olympique de Marseille in the 1970-1971 season, setting this still-unbeaten record in Ligue 1."),
            zh = LocalizedContent("法甲单赛季进球纪录是多少？", listOf("42", "50", "56", "60"), "体育", "何塞·斯科布拉在1970-1971赛季为马赛奥林匹克攻入56球，创造了法甲至今未被打破的纪录。"),
            es = LocalizedContent("¿Cuál es el récord de goles en una temporada de la Ligue 1?", listOf("42", "50", "56", "60"), "Deportes", "José Skoblar marcó 56 goles con el Olympique de Marsella en la temporada 1970-1971, estableciendo este récord aún imbatido en la Ligue 1.")
        ),
        BilingualQuestion(
            id = 12627, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Combien de fois la Coupe du Monde a-t-elle été remportée par le Brésil?", listOf("3", "4", "5", "6"), "Sport", "Le Brésil est le pays le plus titré de l'histoire de la Coupe du Monde de football, avec cinq victoires en 1958, 1962, 1970, 1994 et 2002."),
            en = LocalizedContent("How many times has Brazil won the World Cup?", listOf("3", "4", "5", "6"), "Sports", "Brazil is the most successful country in World Cup history, with five victories in 1958, 1962, 1970, 1994, and 2002."),
            zh = LocalizedContent("巴西赢得了多少次世界杯？", listOf("3", "4", "5", "6"), "体育", "巴西是世界杯历史上最成功的国家，共五次夺冠，分别在1958年、1962年、1970年、1994年和2002年。"),
            es = LocalizedContent("¿Cuántas veces ha ganado Brasil la Copa del Mundo?", listOf("3", "4", "5", "6"), "Deportes", "Brasil es el país más exitoso en la historia de la Copa del Mundo, con cinco victorias en 1958, 1962, 1970, 1994 y 2002.")
        ),
        BilingualQuestion(
            id = 12628, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record du monde de course à pied 1500m?", listOf("3:24", "3:26", "3:28", "3:30"), "Sport", "Le record du monde du 1500 mètres est détenu par le Marocain Hicham El Guerrouj avec un temps de 3 minutes 26 secondes, établi le 14 juillet 1998 à Rome."),
            en = LocalizedContent("What is the world record in the 1500m run?", listOf("3:24", "3:26", "3:28", "3:30"), "Sports", "The world record in the 1500 meters is held by Moroccan Hicham El Guerrouj with a time of 3 minutes 26 seconds, set on July 14, 1998 in Rome."),
            zh = LocalizedContent("1500米跑的世界纪录是多少？", listOf("3:24", "3:26", "3:28", "3:30"), "体育", "1500米世界纪录由摩洛哥选手希沙姆·埃尔·盖鲁伊保持，成绩为3分26秒，于1998年7月14日在罗马创造。"),
            es = LocalizedContent("¿Cuál es el récord mundial de 1500m?", listOf("3:24", "3:26", "3:28", "3:30"), "Deportes", "El récord mundial de 1500 metros lo ostenta el marroquí Hicham El Guerrouj con un tiempo de 3 minutos 26 segundos, establecido el 14 de julio de 1998 en Roma.")
        ),
        BilingualQuestion(
            id = 12629, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Combien de fois Nadal a-t-il remporté Roland Garros?", listOf("13", "14", "15", "16"), "Sport", "Rafael Nadal détient le record de victoires à Roland-Garros avec 13 titres, remportés entre 2005 et 2022. Il est surnommé le \"Roi de la terre battue\" pour sa domination exceptionnelle sur cette surface."),
            en = LocalizedContent("How many times has Nadal won Roland Garros?", listOf("13", "14", "15", "16"), "Sports", "Rafael Nadal holds the record for most wins at Roland Garros with 13 titles, won between 2005 and 2022. He is nicknamed the \"King of Clay\" for his exceptional dominance on this surface."),
            zh = LocalizedContent("纳达尔赢得了多少次法网冠军？", listOf("13", "14", "15", "16"), "体育", "拉斐尔·纳达尔以13个冠军头衔保持着法网夺冠纪录，这些冠军是在2005年至2022年间获得的。他因在这片场地上非凡的统治力而被誉为“红土之王”。"),
            es = LocalizedContent("¿Cuántas veces ha ganado Nadal Roland Garros?", listOf("13", "14", "15", "16"), "Deportes", "Rafael Nadal ostenta el récord de victorias en Roland Garros con 13 títulos, conseguidos entre 2005 y 2022. Es apodado el \"Rey de la tierra batida\" por su excepcional dominio en esta superficie.")
        ),
        BilingualQuestion(
            id = 12630, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record du saut à la perche?", listOf("6.14m", "6.17m", "6.21m", "6.25m"), "Sport", "Le record du monde masculin du saut à la perche est détenu par Armand Duplantis avec 6,21 mètres, établi en 2024."),
            en = LocalizedContent("What is the pole vault record?", listOf("6.14m", "6.17m", "6.21m", "6.25m"), "Sports", "The men's world record in pole vault is held by Armand Duplantis with 6.21 meters, set in 2024."),
            zh = LocalizedContent("撑杆跳高的世界纪录是多少？", listOf("6.14米", "6.17米", "6.21米", "6.25米"), "体育", "男子撑杆跳高的世界纪录由阿曼德·杜普兰蒂斯保持，成绩为6.21米，于2024年创造。"),
            es = LocalizedContent("¿Cuál es el récord de salto con pértiga?", listOf("6.14m", "6.17m", "6.21m", "6.25m"), "Deportes", "El récord mundial masculino de salto con pértiga lo ostenta Armand Duplantis con 6,21 metros, establecido en 2024.")
        ),
        BilingualQuestion(
            id = 12631, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de points Michael Jordan a-t-il marqués en NBA?", listOf("32292", "35367", "38387", "42000"), "Sport", "Michael Jordan a marqué 35 367 points en saison régulière NBA, ce qui le place au cinquième rang des meilleurs marqueurs de l'histoire de la ligue."),
            en = LocalizedContent("How many points did Michael Jordan score in the NBA?", listOf("32292", "35367", "38387", "42000"), "Sports", "Michael Jordan scored 35,367 points in the NBA regular season, ranking fifth on the league's all-time scoring list."),
            zh = LocalizedContent("迈克尔·乔丹在NBA得了多少分？", listOf("32292", "35367", "38387", "42000"), "体育", "迈克尔·乔丹在NBA常规赛中得到35,367分，位列联盟历史得分榜第五位。"),
            es = LocalizedContent("¿Cuántos puntos anotó Michael Jordan en la NBA?", listOf("32292", "35367", "38387", "42000"), "Deportes", "Michael Jordan anotó 35,367 puntos en la temporada regular de la NBA, lo que lo sitúa en el quinto lugar de la lista histórica de anotadores de la liga.")
        ),
        BilingualQuestion(
            id = 12632, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record du monde de saut en hauteur?", listOf("2.40m", "2.42m", "2.45m", "2.48m"), "Sport", "Le record du monde masculin de saut en hauteur est de 2,45 m, établi par le Cubain Javier Sotomayor en 1993, performance qui reste inégalée depuis plus de trente ans."),
            en = LocalizedContent("What is the world record in high jump?", listOf("2.40m", "2.42m", "2.45m", "2.48m"), "Sports", "The men's world record in high jump is 2.45 m, set by Cuban Javier Sotomayor in 1993, a performance that has remained unbeaten for over thirty years."),
            zh = LocalizedContent("跳高的世界纪录是多少？", listOf("2.40米", "2.42米", "2.45米", "2.48米"), "体育", "男子跳高世界纪录为2.45米，由古巴选手哈维尔·索托马约尔于1993年创造，这一成绩三十多年来未被打破。"),
            es = LocalizedContent("¿Cuál es el récord mundial de salto de altura?", listOf("2.40m", "2.42m", "2.45m", "2.48m"), "Deportes", "El récord mundial masculino de salto de altura es de 2,45 m, establecido por el cubano Javier Sotomayor en 1993, una marca que permanece imbatida durante más de treinta años.")
        ),
        BilingualQuestion(
            id = 12633, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Combien de titres Wimbledon Federer a-t-il remportés?", listOf("6", "7", "8", "9"), "Sport", "Roger Federer détient le record masculin du nombre de titres à Wimbledon avec 8 victoires, dont cinq consécutives de 2003 à 2007."),
            en = LocalizedContent("How many Wimbledon titles has Federer won?", listOf("6", "7", "8", "9"), "Sports", "Roger Federer holds the men's record for most Wimbledon titles with 8 victories, including five consecutive from 2003 to 2007."),
            zh = LocalizedContent("费德勒赢得了多少个温网冠军？", listOf("6", "7", "8", "9"), "体育", "罗杰·费德勒以8个温网冠军保持着男子夺冠纪录，其中包括2003年至2007年的五连冠。"),
            es = LocalizedContent("¿Cuántos títulos de Wimbledon ha ganado Federer?", listOf("6", "7", "8", "9"), "Deportes", "Roger Federer ostenta el récord masculino de títulos en Wimbledon con 8 victorias, incluidas cinco consecutivas de 2003 a 2007.")
        ),
        BilingualQuestion(
            id = 12634, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le nombre de points d'une équipe de rugby pour un match?", listOf("50", "100", "200", "500"), "Sport", "Au rugby, une équipe marque des points par essais (5 points), transformations (2 points), pénalités et drops (3 points chacun), mais le score total d'un match varie et n'est jamais fixé à 200 points."),
            en = LocalizedContent("What is the number of points a rugby team scores in a match?", listOf("50", "100", "200", "500"), "Sports", "In rugby, a team scores points through tries (5 points), conversions (2 points), penalties and drop goals (3 points each), but the total score of a match varies and is never fixed at 200 points."),
            zh = LocalizedContent("一支橄榄球队在一场比赛中的得分是多少？", listOf("50", "100", "200", "500"), "体育", "在橄榄球中，球队通过达阵（5分）、附加分（2分）、罚踢和落踢射门（各3分）得分，但比赛总得分是变化的，从未固定为200分。"),
            es = LocalizedContent("¿Cuál es el número de puntos que anota un equipo de rugby en un partido?", listOf("50", "100", "200", "500"), "Deportes", "En el rugby, un equipo anota puntos mediante ensayos (5 puntos), transformaciones (2 puntos), penaltis y drops (3 puntos cada uno), pero el marcador total de un partido varía y nunca se fija en 200 puntos.")
        ),
        BilingualQuestion(
            id = 12635, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de fois le record du monde du marathon a-t-il changé depuis 2015?", listOf("3", "5", "7", "10"), "Sport", "Depuis 2015, le record du monde du marathon a été battu sept fois, passant de 2h02'57\" à 2h00'35\", principalement grâce aux performances de Dennis Kimetto, Eliud Kipchoge et Kelvin Kiptum."),
            en = LocalizedContent("How many times has the marathon world record changed since 2015?", listOf("3", "5", "7", "10"), "Sports", "Since 2015, the marathon world record has been broken seven times, going from 2h02'57\" to 2h00'35\", mainly thanks to performances by Dennis Kimetto, Eliud Kipchoge, and Kelvin Kiptum."),
            zh = LocalizedContent("自2015年以来，马拉松世界纪录被打破了多少次？", listOf("3", "5", "7", "10"), "体育", "自2015年以来，马拉松世界纪录已被打破七次，从2小时02分57秒降至2小时00分35秒，主要归功于丹尼斯·基梅托、埃利乌德·基普乔格和凯尔文·基普图姆的表现。"),
            es = LocalizedContent("¿Cuántas veces ha cambiado el récord mundial de maratón desde 2015?", listOf("3", "5", "7", "10"), "Deportes", "Desde 2015, el récord mundial de maratón se ha batido siete veces, pasando de 2h02'57\" a 2h00'35\", principalmente gracias a las actuaciones de Dennis Kimetto, Eliud Kipchoge y Kelvin Kiptum.")
        ),
        BilingualQuestion(
            id = 12636, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record du monde de lancer de javelot?", listOf("98m", "100m", "104m", "108m"), "Sport", "Le record du monde masculin du lancer de javelot est détenu par Jan Železný avec 98,48 m, tandis que le record féminin appartient à Barbora Špotáková avec 72,28 m. Aucun athlète n'a officiellement atteint 104 mètres."),
            en = LocalizedContent("What is the world record in javelin throw?", listOf("98m", "100m", "104m", "108m"), "Sports", "The men's world record in javelin throw is held by Jan Železný with 98.48 m, while the women's record belongs to Barbora Špotáková with 72.28 m. No athlete has officially reached 104 meters."),
            zh = LocalizedContent("标枪的世界纪录是多少？", listOf("98米", "100米", "104米", "108米"), "体育", "男子标枪世界纪录由扬·泽莱兹尼保持，成绩为98.48米，女子纪录由巴尔博拉·什波塔科娃保持，成绩为72.28米。没有运动员正式达到104米。"),
            es = LocalizedContent("¿Cuál es el récord mundial de lanzamiento de jabalina?", listOf("98m", "100m", "104m", "108m"), "Deportes", "El récord mundial masculino de lanzamiento de jabalina lo ostenta Jan Železný con 98,48 m, mientras que el récord femenino pertenece a Barbora Špotáková con 72,28 m. Ningún atleta ha alcanzado oficialmente los 104 metros.")
        ),
        BilingualQuestion(
            id = 12637, correctIndex = 3, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Combien de grands chelems Djokovic a-t-il remportés?", listOf("18", "20", "21", "24"), "Sport", "Novak Djokovic détient le record du nombre de titres du Grand Chelem chez les hommes avec 24, dépassant Rafael Nadal (22) et Roger Federer (20)."),
            en = LocalizedContent("How many Grand Slams has Djokovic won?", listOf("18", "20", "21", "24"), "Sports", "Novak Djokovic holds the record for most Grand Slam titles among men with 24, surpassing Rafael Nadal (22) and Roger Federer (20)."),
            zh = LocalizedContent("德约科维奇赢得了多少个大满贯冠军？", listOf("18", "20", "21", "24"), "体育", "诺瓦克·德约科维奇以24个大满贯冠军保持着男子纪录，超过了拉斐尔·纳达尔（22个）和罗杰·费德勒（20个）。"),
            es = LocalizedContent("¿Cuántos Grand Slams ha ganado Djokovic?", listOf("18", "20", "21", "24"), "Deportes", "Novak Djokovic ostenta el récord de títulos de Grand Slam entre los hombres con 24, superando a Rafael Nadal (22) y Roger Federer (20).")
        ),
        BilingualQuestion(
            id = 12638, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record de vitesse en moto?", listOf("299 km/h", "347 km/h", "576 km/h", "654 km/h"), "Sport", "Ce record a été établi par le pilote américain Rocky Robinson en 2010 sur une moto-streamliner Ack Attack, sur le lac salé de Bonneville aux États-Unis."),
            en = LocalizedContent("What is the speed record on a motorcycle?", listOf("299 km/h", "347 km/h", "576 km/h", "654 km/h"), "Sports", "This record was set by American rider Rocky Robinson in 2010 on an Ack Attack streamliner motorcycle, on the Bonneville Salt Flats in the United States."),
            zh = LocalizedContent("摩托车的速度纪录是多少？", listOf("299公里/小时", "347公里/小时", "576公里/小时", "654公里/小时"), "体育", "这一纪录由美国车手洛奇·罗宾逊于2010年在美国博纳维尔盐滩驾驶Ack Attack流线型摩托车创造。"),
            es = LocalizedContent("¿Cuál es el récord de velocidad en moto?", listOf("299 km/h", "347 km/h", "576 km/h", "654 km/h"), "Deportes", "Este récord fue establecido por el piloto estadounidense Rocky Robinson en 2010 sobre una moto-streamliner Ack Attack, en el lago salado de Bonneville en Estados Unidos.")
        ),
        BilingualQuestion(
            id = 12639, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de fois le football a-t-il changé de format de compétition?", listOf("2", "5", "10", "15"), "Sport", "Le football a connu 10 changements majeurs de format de compétition, incluant des réformes comme le passage de la Coupe du monde de 16 à 32 équipes en 1998, puis à 48 en 2026."),
            en = LocalizedContent("How many times has football changed its competition format?", listOf("2", "5", "10", "15"), "Sports", "Football has undergone 10 major competition format changes, including reforms such as the World Cup expanding from 16 to 32 teams in 1998, and then to 48 in 2026."),
            zh = LocalizedContent("足球比赛形式改变过多少次？", listOf("2", "5", "10", "15"), "体育", "足球经历了10次重大的比赛形式变革，包括1998年世界杯从16支球队扩大到32支，以及2026年扩大到48支。"),
            es = LocalizedContent("¿Cuántas veces ha cambiado el fútbol su formato de competición?", listOf("2", "5", "10", "15"), "Deportes", "El fútbol ha experimentado 10 cambios importantes en el formato de competición, incluyendo reformas como la expansión de la Copa del Mundo de 16 a 32 equipos en 1998, y luego a 48 en 2026.")
        ),
        BilingualQuestion(
            id = 12640, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand volcan du système solaire?", listOf("Etna", "Sakurajima", "Olympus Mons", "Krakatoa"), "Science", "Olympus Mons, situé sur Mars, est un volcan bouclier géant culminant à environ 21,9 km, soit près de 2,5 fois la hauteur de l'Everest."),
            en = LocalizedContent("What is the largest volcano in the solar system?", listOf("Etna", "Sakurajima", "Olympus Mons", "Krakatoa"), "Science", "Olympus Mons, located on Mars, is a giant shield volcano rising about 21.9 km, nearly 2.5 times the height of Everest."),
            zh = LocalizedContent("太阳系中最大的火山是什么？", listOf("埃特纳火山", "樱岛火山", "奥林匹斯山", "喀拉喀托火山"), "科学", "位于火星的奥林匹斯山是一座巨大的盾状火山，高约21.9公里，几乎是珠穆朗玛峰高度的2.5倍。"),
            es = LocalizedContent("¿Cuál es el volcán más grande del sistema solar?", listOf("Etna", "Sakurajima", "Olympus Mons", "Krakatoa"), "Ciencia", "Olympus Mons, situado en Marte, es un gigantesco volcán en escudo que se eleva unos 21,9 km, casi 2,5 veces la altura del Everest.")
        ),
        BilingualQuestion(
            id = 12641, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Combien de volcans actifs existent sur Terre?", listOf("500", "1000", "1500", "2000"), "Science", "L'Union internationale des sciences géologiques estime qu'environ 1500 volcans sont considérés comme actifs sur Terre, c'est-à-dire qu'ils sont entrés en éruption au cours des 10 000 dernières années."),
            en = LocalizedContent("How many active volcanoes exist on Earth?", listOf("500", "1000", "1500", "2000"), "Science", "The International Union of Geological Sciences estimates that about 1500 volcanoes are considered active on Earth, meaning they have erupted in the last 10,000 years."),
            zh = LocalizedContent("地球上有多少座活火山？", listOf("500", "1000", "1500", "2000"), "科学", "国际地质科学联合会估计，地球上约有1500座火山被视为活火山，即在过去一万年内曾喷发过。"),
            es = LocalizedContent("¿Cuántos volcanes activos existen en la Tierra?", listOf("500", "1000", "1500", "2000"), "Ciencia", "La Unión Internacional de Ciencias Geológicas estima que unos 1500 volcanes se consideran activos en la Tierra, es decir, han entrado en erupción en los últimos 10 000 años.")
        ),
        BilingualQuestion(
            id = 12642, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quelle est la température du magma?", listOf("500°C", "1000°C", "1500°C", "2000°C"), "Science", "Le magma, roche en fusion issue du manteau terrestre, atteint généralement des températures comprises entre 700°C et 1500°C, selon sa composition et sa profondeur."),
            en = LocalizedContent("What is the temperature of magma?", listOf("500°C", "1000°C", "1500°C", "2000°C"), "Science", "Magma, molten rock from the Earth's mantle, typically reaches temperatures between 700°C and 1500°C, depending on its composition and depth."),
            zh = LocalizedContent("岩浆的温度是多少？", listOf("500°C", "1000°C", "1500°C", "2000°C"), "科学", "岩浆是来自地幔的熔融岩石，通常温度在700°C到1500°C之间，具体取决于其成分和深度。"),
            es = LocalizedContent("¿Cuál es la temperatura del magma?", listOf("500°C", "1000°C", "1500°C", "2000°C"), "Ciencia", "El magma, roca fundida del manto terrestre, alcanza típicamente temperaturas entre 700°C y 1500°C, según su composición y profundidad.")
        ),
        BilingualQuestion(
            id = 12643, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel volcan a causé l'éruption la plus destructrice du 20e siècle?", listOf("Etna", "Vésuve", "Mont Pelé", "Krakatoa"), "Science", "L'éruption de la montagne Pelée en 1902 a détruit la ville de Saint-Pierre en Martinique, tuant environ 30 000 personnes en quelques minutes."),
            en = LocalizedContent("Which volcano caused the most destructive eruption of the 20th century?", listOf("Etna", "Vesuvius", "Mount Pelée", "Krakatoa"), "Science", "The eruption of Mount Pelée in 1902 destroyed the city of Saint-Pierre in Martinique, killing about 30,000 people in minutes."),
            zh = LocalizedContent("哪座火山造成了20世纪最具破坏性的喷发？", listOf("埃特纳火山", "维苏威火山", "培雷火山", "喀拉喀托火山"), "科学", "1902年培雷火山的喷发摧毁了马提尼克岛的圣皮埃尔市，几分钟内造成约3万人死亡。"),
            es = LocalizedContent("¿Qué volcán causó la erupción más destructiva del siglo XX?", listOf("Etna", "Vesubio", "Monte Pelée", "Krakatoa"), "Ciencia", "La erupción del Monte Pelée en 1902 destruyó la ciudad de Saint-Pierre en Martinica, matando a unas 30 000 personas en minutos.")
        ),
        BilingualQuestion(
            id = 12644, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de personnes ont péri lors de l'éruption du Vésuve en 79?", listOf("1000", "5000", "16000", "30000"), "Science", "L'éruption du Vésuve en 79 après J.-C. a enseveli les villes de Pompéi et Herculanum, causant environ 16 000 morts selon les estimations historiques."),
            en = LocalizedContent("How many people died in the eruption of Vesuvius in 79 AD?", listOf("1000", "5000", "16000", "30000"), "Science", "The eruption of Vesuvius in 79 AD buried the cities of Pompeii and Herculaneum, causing about 16,000 deaths according to historical estimates."),
            zh = LocalizedContent("公元79年维苏威火山喷发造成多少人死亡？", listOf("1000", "5000", "16000", "30000"), "科学", "公元79年维苏威火山喷发掩埋了庞贝和赫库兰尼姆两座城市，根据历史估计造成约1.6万人死亡。"),
            es = LocalizedContent("¿Cuántas personas murieron en la erupción del Vesubio en el año 79 d.C.?", listOf("1000", "5000", "16000", "30000"), "Ciencia", "La erupción del Vesubio en el año 79 d.C. sepultó las ciudades de Pompeya y Herculano, causando unas 16 000 muertes según estimaciones históricas.")
        ),
        BilingualQuestion(
            id = 12645, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel volcan est situé en Islande?", listOf("Sakurajima", "Eyjafjallajökull", "Merapi", "Yasur"), "Science", "L'Eyjafjallajökull est un volcan sous-glaciaire islandais, devenu célèbre en 2010 pour son éruption massive qui a paralysé le trafic aérien européen."),
            en = LocalizedContent("Which volcano is located in Iceland?", listOf("Sakurajima", "Eyjafjallajökull", "Merapi", "Yasur"), "Science", "Eyjafjallajökull is an Icelandic subglacial volcano, famous for its massive 2010 eruption that paralyzed European air traffic."),
            zh = LocalizedContent("哪座火山位于冰岛？", listOf("樱岛火山", "埃亚菲亚德拉冰盖", "默拉皮火山", "亚苏尔火山"), "科学", "埃亚菲亚德拉冰盖是冰岛的一座冰下火山，因2010年大规模喷发导致欧洲空中交通瘫痪而闻名。"),
            es = LocalizedContent("¿Qué volcán está situado en Islandia?", listOf("Sakurajima", "Eyjafjallajökull", "Merapi", "Yasur"), "Ciencia", "Eyjafjallajökull es un volcán subglaciar islandés, famoso por su masiva erupción de 2010 que paralizó el tráfico aéreo europeo.")
        ),
        BilingualQuestion(
            id = 12646, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("L'éruption du Krakatoa a envoyé de la cendre jusqu'à quelle hauteur?", listOf("20 km", "50 km", "80 km", "120 km"), "Science", "L'éruption du Krakatoa en 1883 a projeté des cendres à 80 km d'altitude, atteignant la mésosphère, un record pour une éruption volcanique."),
            en = LocalizedContent("How high did the Krakatoa eruption send ash?", listOf("20 km", "50 km", "80 km", "120 km"), "Science", "The 1883 eruption of Krakatoa projected ash to 80 km altitude, reaching the mesosphere, a record for a volcanic eruption."),
            zh = LocalizedContent("喀拉喀托火山喷发将火山灰送到了多高？", listOf("20公里", "50公里", "80公里", "120公里"), "科学", "1883年喀拉喀托火山喷发将火山灰抛至80公里高空，达到中间层，创下火山喷发纪录。"),
            es = LocalizedContent("¿A qué altura envió cenizas la erupción del Krakatoa?", listOf("20 km", "50 km", "80 km", "120 km"), "Ciencia", "La erupción del Krakatoa en 1883 proyectó cenizas a 80 km de altitud, alcanzando la mesosfera, un récord para una erupción volcánica.")
        ),
        BilingualQuestion(
            id = 12647, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le volcan le plus haut du monde?", listOf("Chimborazo", "Cotopaxi", "Nevado Ojos del Salado", "Mont Blanc"), "Science", "Le Nevado Ojos del Salado, situé à la frontière entre le Chili et l'Argentine, culmine à 6 893 mètres, ce qui en fait le plus haut volcan actif du monde. Il dépasse le mont Aconcagua, qui est un sommet non volcanique."),
            en = LocalizedContent("What is the highest volcano in the world?", listOf("Chimborazo", "Cotopaxi", "Nevado Ojos del Salado", "Mont Blanc"), "Science", "Nevado Ojos del Salado, on the border between Chile and Argentina, rises to 6,893 meters, making it the highest active volcano in the world. It surpasses Mount Aconcagua, which is a non-volcanic peak."),
            zh = LocalizedContent("世界上最高的火山是什么？", listOf("钦博拉索山", "科托帕希火山", "奥霍斯-德尔萨拉多山", "勃朗峰"), "科学", "位于智利和阿根廷边境的奥霍斯-德尔萨拉多山海拔6893米，是世界上最活跃的火山。它超过了非火山峰阿空加瓜山。"),
            es = LocalizedContent("¿Cuál es el volcán más alto del mundo?", listOf("Chimborazo", "Cotopaxi", "Nevado Ojos del Salado", "Mont Blanc"), "Ciencia", "El Nevado Ojos del Salado, en la frontera entre Chile y Argentina, se eleva a 6 893 metros, lo que lo convierte en el volcán activo más alto del mundo. Supera al monte Aconcagua, que es un pico no volcánico.")
        ),
        BilingualQuestion(
            id = 12648, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Combien de types principaux de volcans existent?", listOf("2", "3", "4", "6"), "Science", "Les volcans sont classés en quatre types principaux selon leur forme et leur activité : volcans boucliers, volcans composites, cônes de scories et volcans boucliers sous-marins."),
            en = LocalizedContent("How many main types of volcanoes are there?", listOf("2", "3", "4", "6"), "Science", "Volcanoes are classified into four main types based on shape and activity: shield volcanoes, composite volcanoes, cinder cones, and submarine shield volcanoes."),
            zh = LocalizedContent("火山主要有几种类型？", listOf("2", "3", "4", "6"), "科学", "火山根据形状和活动分为四种主要类型：盾状火山、复合火山、火山渣锥和海底盾状火山。"),
            es = LocalizedContent("¿Cuántos tipos principales de volcanes existen?", listOf("2", "3", "4", "6"), "Ciencia", "Los volcanes se clasifican en cuatro tipos principales según su forma y actividad: volcanes en escudo, volcanes compuestos, conos de ceniza y volcanes en escudo submarinos.")
        ),
        BilingualQuestion(
            id = 12649, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel volcan Hawaïen est actuellement en éruption quasi-permanente?", listOf("Mauna Kea", "Hualālai", "Kīlauea", "Kohala"), "Science", "Le Kīlauea est l'un des volcans les plus actifs au monde, avec une éruption quasi-continue depuis 1983 dans sa zone du sommet et du rift est."),
            en = LocalizedContent("Which Hawaiian volcano is currently in near-permanent eruption?", listOf("Mauna Kea", "Hualālai", "Kīlauea", "Kohala"), "Science", "Kīlauea is one of the most active volcanoes in the world, with a nearly continuous eruption since 1983 in its summit and east rift zone."),
            zh = LocalizedContent("哪个夏威夷火山目前几乎持续喷发？", listOf("冒纳凯阿火山", "华拉莱火山", "基拉韦厄火山", "科哈拉火山"), "科学", "基拉韦厄火山是世界上最活跃的火山之一，自1983年以来在其山顶和东裂谷带几乎持续喷发。"),
            es = LocalizedContent("¿Qué volcán hawaiano está actualmente en erupción casi permanente?", listOf("Mauna Kea", "Hualālai", "Kīlauea", "Kohala"), "Ciencia", "El Kīlauea es uno de los volcanes más activos del mundo, con una erupción casi continua desde 1983 en su zona de la cumbre y el rift este.")
        ),
        BilingualQuestion(
            id = 12650, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quelle est la viscosité du magma du Vésuve?", listOf("Basse", "Moyenne", "Haute", "Très haute"), "Science", "Le magma du Vésuve est riche en silice, ce qui le rend très visqueux et favorise des éruptions explosives."),
            en = LocalizedContent("What is the viscosity of Vesuvius' magma?", listOf("Low", "Medium", "High", "Very high"), "Science", "Vesuvius' magma is rich in silica, making it very viscous and favoring explosive eruptions."),
            zh = LocalizedContent("维苏威火山的岩浆粘度是多少？", listOf("低", "中", "高", "非常高"), "科学", "维苏威火山的岩浆富含二氧化硅，使其非常粘稠，有利于爆炸性喷发。"),
            es = LocalizedContent("¿Cuál es la viscosidad del magma del Vesubio?", listOf("Baja", "Media", "Alta", "Muy alta"), "Ciencia", "El magma del Vesubio es rico en sílice, lo que lo hace muy viscoso y favorece erupciones explosivas.")
        ),
        BilingualQuestion(
            id = 12651, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Le Mount Vesuvius est situé en quel pays?", listOf("Grèce", "Italie", "Turquie", "Espagne"), "Science", "Le Vésuve est un volcan actif situé dans le golfe de Naples, en Italie, célèbre pour avoir détruit Pompéi en 79 apr. J.-C."),
            en = LocalizedContent("Mount Vesuvius is located in which country?", listOf("Greece", "Italy", "Turkey", "Spain"), "Science", "Vesuvius is an active volcano located in the Gulf of Naples, Italy, famous for destroying Pompeii in 79 AD."),
            zh = LocalizedContent("维苏威火山位于哪个国家？", listOf("希腊", "意大利", "土耳其", "西班牙"), "科学", "维苏威火山是一座活火山，位于意大利那不勒斯湾，以公元79年摧毁庞贝城而闻名。"),
            es = LocalizedContent("¿El Monte Vesubio está ubicado en qué país?", listOf("Grecia", "Italia", "Turquía", "España"), "Ciencia", "El Vesubio es un volcán activo situado en el golfo de Nápoles, Italia, famoso por destruir Pompeya en el año 79 d.C.")
        ),
        BilingualQuestion(
            id = 12652, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de personnes sont décédées lors de l'éruption du Merapi en 2010?", listOf("100", "300", "1000", "3000"), "Science", "L'éruption du mont Merapi en 2010 a causé environ 3000 morts, principalement en raison des coulées pyroclastiques et des nuées ardentes."),
            en = LocalizedContent("How many people died during the 2010 Merapi eruption?", listOf("100", "300", "1000", "3000"), "Science", "The 2010 eruption of Mount Merapi caused about 3000 deaths, mainly due to pyroclastic flows and glowing clouds."),
            zh = LocalizedContent("2010年默拉皮火山喷发造成多少人死亡？", listOf("100", "300", "1000", "3000"), "科学", "2010年默拉皮火山喷发造成约3000人死亡，主要原因是火山碎屑流和炽热云团。"),
            es = LocalizedContent("¿Cuántas personas murieron durante la erupción del Merapi en 2010?", listOf("100", "300", "1000", "3000"), "Ciencia", "La erupción del Monte Merapi en 2010 causó alrededor de 3000 muertes, principalmente debido a flujos piroclásticos y nubes ardientes.")
        ),
        BilingualQuestion(
            id = 12653, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel volcan a créé l'île de Surtsey?", listOf("Sakurajima", "Vestmannaeyjar", "Kilauea", "Etna"), "Science", "L'île de Surtsey a été formée par une éruption sous-marine du volcan Vestmannaeyjar, situé au large des côtes islandaises, en 1963."),
            en = LocalizedContent("Which volcano created the island of Surtsey?", listOf("Sakurajima", "Vestmannaeyjar", "Kilauea", "Etna"), "Science", "The island of Surtsey was formed by a submarine eruption of the Vestmannaeyjar volcano, located off the coast of Iceland, in 1963."),
            zh = LocalizedContent("哪个火山创造了叙尔特塞岛？", listOf("樱岛火山", "韦斯特曼纳群岛火山", "基拉韦厄火山", "埃特纳火山"), "科学", "叙尔特塞岛是由韦斯特曼纳群岛火山在1963年的一次海底喷发形成的，该火山位于冰岛海岸附近。"),
            es = LocalizedContent("¿Qué volcán creó la isla de Surtsey?", listOf("Sakurajima", "Vestmannaeyjar", "Kilauea", "Etna"), "Ciencia", "La isla de Surtsey fue formada por una erupción submarina del volcán Vestmannaeyjar, ubicado frente a las costas de Islandia, en 1963.")
        ),
        BilingualQuestion(
            id = 12654, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("La Terre produit combien de nouveaux kilomètres carrés de croûte volcanique par an?", listOf("1", "10", "50", "100"), "Science", "Les dorsales océaniques génèrent environ 50 km² de nouvelle croûte volcanique chaque année, un processus continu de formation de la lithosphère terrestre."),
            en = LocalizedContent("How many new square kilometers of volcanic crust does the Earth produce per year?", listOf("1", "10", "50", "100"), "Science", "Ocean ridges generate about 50 km² of new volcanic crust each year, a continuous process of Earth's lithosphere formation."),
            zh = LocalizedContent("地球每年产生多少平方公里的新火山地壳？", listOf("1", "10", "50", "100"), "科学", "大洋中脊每年产生约50平方公里的新火山地壳，这是地球岩石圈形成的持续过程。"),
            es = LocalizedContent("¿Cuántos kilómetros cuadrados de corteza volcánica nueva produce la Tierra por año?", listOf("1", "10", "50", "100"), "Ciencia", "Las dorsales oceánicas generan aproximadamente 50 km² de nueva corteza volcánica cada año, un proceso continuo de formación de la litosfera terrestre.")
        ),
        BilingualQuestion(
            id = 12655, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel gaz représente la majorité des émissions volcaniques?", listOf("CO2", "SO2", "H2O", "HCl"), "Science", "La vapeur d'eau (H2O) constitue environ 80 % des gaz émis par les volcans, bien devant le dioxyde de carbone et le dioxyde de soufre."),
            en = LocalizedContent("Which gas represents the majority of volcanic emissions?", listOf("CO2", "SO2", "H2O", "HCl"), "Science", "Water vapor (H2O) constitutes about 80% of gases emitted by volcanoes, well ahead of carbon dioxide and sulfur dioxide."),
            zh = LocalizedContent("哪种气体占火山排放物的大部分？", listOf("二氧化碳", "二氧化硫", "水蒸气", "氯化氢"), "科学", "水蒸气（H2O）约占火山排放气体的80%，远高于二氧化碳和二氧化硫。"),
            es = LocalizedContent("¿Qué gas representa la mayoría de las emisiones volcánicas?", listOf("CO2", "SO2", "H2O", "HCl"), "Ciencia", "El vapor de agua (H2O) constituye aproximadamente el 80% de los gases emitidos por los volcanes, muy por delante del dióxido de carbono y el dióxido de azufre.")
        ),
        BilingualQuestion(
            id = 12656, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Le Piton de la Fournaise est situé où?", listOf("Hawaï", "Réunion", "Islande", "Japon"), "Science", "Le Piton de la Fournaise est un volcan actif situé sur l'île de la Réunion, dans l'océan Indien. C'est l'un des volcans les plus actifs au monde."),
            en = LocalizedContent("Where is Piton de la Fournaise located?", listOf("Hawaii", "Réunion", "Iceland", "Japan"), "Science", "Piton de la Fournaise is an active volcano located on Réunion Island in the Indian Ocean. It is one of the most active volcanoes in the world."),
            zh = LocalizedContent("富尔奈斯火山位于哪里？", listOf("夏威夷", "留尼汪", "冰岛", "日本"), "科学", "富尔奈斯火山是一座活火山，位于印度洋的留尼汪岛，是世界上最活跃的火山之一。"),
            es = LocalizedContent("¿Dónde está ubicado el Piton de la Fournaise?", listOf("Hawái", "Reunión", "Islandia", "Japón"), "Ciencia", "El Piton de la Fournaise es un volcán activo situado en la isla de Reunión, en el océano Índico. Es uno de los volcanes más activos del mundo.")
        ),
        BilingualQuestion(
            id = 12657, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien d'années l'éruption du Krakatoa a-t-elle illuminé la nuit?", listOf("1", "3", "6", "9"), "Science", "L'éruption du Krakatoa en 1883 a projeté d'immenses quantités de cendres dans l'atmosphère, provoquant des reflets crépusculaires intenses qui ont illuminé le ciel nocturne pendant environ six ans."),
            en = LocalizedContent("How many years did the Krakatoa eruption illuminate the night?", listOf("1", "3", "6", "9"), "Science", "The 1883 eruption of Krakatoa ejected huge amounts of ash into the atmosphere, causing intense twilight reflections that lit up the night sky for about six years."),
            zh = LocalizedContent("喀拉喀托火山喷发照亮了夜晚多少年？", listOf("1", "3", "6", "9"), "科学", "1883年喀拉喀托火山喷发将大量火山灰抛入大气层，产生强烈的暮光反射，照亮夜空约六年。"),
            es = LocalizedContent("¿Cuántos años iluminó la noche la erupción del Krakatoa?", listOf("1", "3", "6", "9"), "Ciencia", "La erupción del Krakatoa en 1883 expulsó enormes cantidades de ceniza a la atmósfera, provocando intensos reflejos crepusculares que iluminaron el cielo nocturno durante unos seis años.")
        ),
        BilingualQuestion(
            id = 12658, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel volcan a provoqué l'hiver volcanique de 1816?", listOf("Tambora", "Pinatubo", "Agung", "Krakatoa"), "Science", "L'éruption du mont Tambora en Indonésie en 1815 a projeté d'immenses quantités de cendres dans l'atmosphère, bloquant la lumière solaire et provoquant une baisse globale des températures en 1816, surnommée l'année sans été."),
            en = LocalizedContent("Which volcano caused the volcanic winter of 1816?", listOf("Tambora", "Pinatubo", "Agung", "Krakatoa"), "Science", "The eruption of Mount Tambora in Indonesia in 1815 ejected huge amounts of ash into the atmosphere, blocking sunlight and causing a global temperature drop in 1816, known as the Year Without a Summer."),
            zh = LocalizedContent("哪个火山导致了1816年的火山冬天？", listOf("坦博拉火山", "皮纳图博火山", "阿贡火山", "喀拉喀托火山"), "科学", "1815年印度尼西亚坦博拉火山喷发将大量火山灰抛入大气层，阻挡阳光，导致1816年全球气温下降，被称为“无夏之年”。"),
            es = LocalizedContent("¿Qué volcán provocó el invierno volcánico de 1816?", listOf("Tambora", "Pinatubo", "Agung", "Krakatoa"), "Ciencia", "La erupción del Monte Tambora en Indonesia en 1815 expulsó enormes cantidades de ceniza a la atmósfera, bloqueando la luz solar y provocando una caída global de temperaturas en 1816, conocida como el año sin verano.")
        ),
        BilingualQuestion(
            id = 12659, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quelle profondeur les racines des volcans peuvent-elles atteindre?", listOf("10 km", "50 km", "100+ km", "500+ km"), "Science", "Les racines des volcans, appelées racines magmatiques, plongent dans le manteau terrestre, pouvant atteindre plus de 100 kilomètres de profondeur, là où la roche fond partiellement pour alimenter les éruptions."),
            en = LocalizedContent("How deep can volcano roots reach?", listOf("10 km", "50 km", "100+ km", "500+ km"), "Science", "Volcano roots, called magmatic roots, plunge into the Earth's mantle, reaching depths of over 100 kilometers, where rock partially melts to fuel eruptions."),
            zh = LocalizedContent("火山根部能达到多深？", listOf("10公里", "50公里", "100公里以上", "500公里以上"), "科学", "火山根部，称为岩浆根，深入地球地幔，可达100公里以上的深度，那里的岩石部分熔融为喷发提供燃料。"),
            es = LocalizedContent("¿Qué profundidad pueden alcanzar las raíces de los volcanes?", listOf("10 km", "50 km", "100+ km", "500+ km"), "Ciencia", "Las raíces de los volcanes, llamadas raíces magmáticas, se hunden en el manto terrestre, pudiendo alcanzar más de 100 kilómetros de profundidad, donde la roca se funde parcialmente para alimentar las erupciones.")
        ),
        BilingualQuestion(
            id = 12660, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année les Vikings ont-ils découvert le Groenland?", listOf("850", "900", "950", "1000"), "Histoire", "L'explorateur viking Erik le Rouge a fondé la première colonie permanente au Groenland vers l'an 985, mais les premières découvertes scandinaves de l'île remontent aux alentours de l'année 900."),
            en = LocalizedContent("In what year did the Vikings discover Greenland?", listOf("850", "900", "950", "1000"), "History", "Viking explorer Erik the Red founded the first permanent settlement in Greenland around 985, but the earliest Scandinavian discoveries of the island date back to around the year 900."),
            zh = LocalizedContent("维京人在哪一年发现了格陵兰？", listOf("850年", "900年", "950年", "1000年"), "历史", "维京探险家红发埃里克大约在985年在格陵兰建立了第一个永久定居点，但斯堪的纳维亚人最早发现该岛可追溯到公元900年左右。"),
            es = LocalizedContent("¿En qué año descubrieron los vikingos Groenlandia?", listOf("850", "900", "950", "1000"), "Historia", "El explorador vikingo Erik el Rojo fundó el primer asentamiento permanente en Groenlandia hacia el año 985, pero los primeros descubrimientos escandinavos de la isla se remontan alrededor del año 900.")
        ),
        BilingualQuestion(
            id = 12661, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel leader viking a conquis la Normandie?", listOf("Ragnar Lothbrook", "Ivar le Désossé", "Rollon", "Erik le Rouge"), "Histoire", "Rollon, chef viking, obtint en 911 le territoire de Normandie par le traité de Saint-Clair-sur-Epte avec le roi Charles le Simple, en échange de sa conversion au christianisme et de sa protection contre d'autres raids."),
            en = LocalizedContent("Which Viking leader conquered Normandy?", listOf("Ragnar Lothbrok", "Ivar the Boneless", "Rollo", "Erik the Red"), "History", "Rollo, a Viking chief, obtained the territory of Normandy in 911 through the Treaty of Saint-Clair-sur-Epte with King Charles the Simple, in exchange for his conversion to Christianity and protection against other raids."),
            zh = LocalizedContent("哪位维京领袖征服了诺曼底？", listOf("拉格纳·洛德布罗克", "无骨者伊瓦尔", "罗洛", "红发埃里克"), "历史", "维京首领罗洛于911年通过圣克莱尔河畔埃普特条约从糊涂王查理手中获得诺曼底领土，作为交换，他皈依基督教并承诺保护该地区免受其他袭击。"),
            es = LocalizedContent("¿Qué líder vikingo conquistó Normandía?", listOf("Ragnar Lothbrok", "Ivar el Deshuesado", "Rollo", "Erik el Rojo"), "Historia", "Rollo, jefe vikingo, obtuvo en 911 el territorio de Normandía mediante el tratado de Saint-Clair-sur-Epte con el rey Carlos el Simple, a cambio de su conversión al cristianismo y su protección contra otras incursiones.")
        ),
        BilingualQuestion(
            id = 12662, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de samuraïs constituaient la dernière révolte de Satsuma?", listOf("400", "700", "1000", "3000"), "Histoire", "La rébellion de Satsuma en 1877 fut menée par Saigo Takamori, et environ 3 000 samouraïs restèrent fidèles jusqu'à la bataille finale de Shiroyama."),
            en = LocalizedContent("How many samurai made up the last Satsuma Rebellion?", listOf("400", "700", "1000", "3000"), "History", "The Satsuma Rebellion in 1877 was led by Saigo Takamori, and about 3,000 samurai remained loyal until the final battle of Shiroyama."),
            zh = LocalizedContent("最后一次萨摩叛乱有多少武士参与？", listOf("400人", "700人", "1000人", "3000人"), "历史", "1877年的萨摩叛乱由西乡隆盛领导，大约3000名武士在城山最终战役中保持忠诚。"),
            es = LocalizedContent("¿Cuántos samuráis constituyeron la última rebelión de Satsuma?", listOf("400", "700", "1000", "3000"), "Historia", "La rebelión de Satsuma en 1877 fue liderada por Saigo Takamori, y aproximadamente 3.000 samuráis permanecieron leales hasta la batalla final de Shiroyama.")
        ),
        BilingualQuestion(
            id = 12663, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année les samuraïs ont-ils été officiellement abolis?", listOf("1868", "1876", "1885", "1895"), "Histoire", "L'abolition officielle des samouraïs en 1876 fait suite à la restauration Meiji, qui a modernisé le Japon en supprimant le système féodal et en instaurant une armée nationale."),
            en = LocalizedContent("In what year were samurai officially abolished?", listOf("1868", "1876", "1885", "1895"), "History", "The official abolition of the samurai in 1876 followed the Meiji Restoration, which modernized Japan by abolishing the feudal system and establishing a national army."),
            zh = LocalizedContent("武士在哪一年被正式废除？", listOf("1868年", "1876年", "1885年", "1895年"), "历史", "1876年武士被正式废除，这是明治维新的后续，通过废除封建制度和建立国家军队使日本现代化。"),
            es = LocalizedContent("¿En qué año fueron abolidos oficialmente los samuráis?", listOf("1868", "1876", "1885", "1895"), "Historia", "La abolición oficial de los samuráis en 1876 siguió a la Restauración Meiji, que modernizó Japón aboliendo el sistema feudal y estableciendo un ejército nacional.")
        ),
        BilingualQuestion(
            id = 12664, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel était le code d'honneur des samuraïs?", listOf("Bushido", "Samurai Code", "Warrior Way", "Honor Code"), "Histoire", "Le Bushido, signifiant « voie du guerrier », était le code moral et éthique rigoureux suivi par les samouraïs au Japon féodal, mettant l'accent sur la loyauté, l'honneur et le sacrifice."),
            en = LocalizedContent("What was the samurai code of honor?", listOf("Bushido", "Samurai Code", "Warrior Way", "Honor Code"), "History", "Bushido, meaning 'way of the warrior', was the rigorous moral and ethical code followed by samurai in feudal Japan, emphasizing loyalty, honor, and sacrifice."),
            zh = LocalizedContent("武士的荣誉准则是什么？", listOf("武士道", "武士法典", "战士之道", "荣誉准则"), "历史", "武士道意为“战士之道”，是日本封建时期武士遵循的严格道德伦理准则，强调忠诚、荣誉和牺牲。"),
            es = LocalizedContent("¿Cuál era el código de honor de los samuráis?", listOf("Bushido", "Código Samurái", "Camino del Guerrero", "Código de Honor"), "Historia", "El Bushido, que significa 'camino del guerrero', era el riguroso código moral y ético seguido por los samuráis en el Japón feudal, enfatizando la lealtad, el honor y el sacrificio.")
        ),
        BilingualQuestion(
            id = 12665, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de navires à voile longues les Vikings avaient-ils?", listOf("10", "50", "100", "500"), "Histoire", "Le nombre de 100 navires est une estimation courante pour la flotte viking lors de grandes expéditions, comme l'invasion de l'Angleterre par le roi Knut le Grand au XIe siècle."),
            en = LocalizedContent("How many longships did the Vikings have?", listOf("10", "50", "100", "500"), "History", "The number of 100 ships is a common estimate for the Viking fleet during major expeditions, such as King Cnut the Great's invasion of England in the 11th century."),
            zh = LocalizedContent("维京人有多少艘长船？", listOf("10艘", "50艘", "100艘", "500艘"), "历史", "100艘船是维京舰队在重大远征中的常见估计数字，例如11世纪克努特大帝入侵英格兰。"),
            es = LocalizedContent("¿Cuántos barcos largos tenían los vikingos?", listOf("10", "50", "100", "500"), "Historia", "El número de 100 barcos es una estimación común para la flota vikinga durante grandes expediciones, como la invasión de Inglaterra por el rey Canuto el Grande en el siglo XI.")
        ),
        BilingualQuestion(
            id = 12666, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus ancien sabre de samuraï conservé?", listOf("12e siècle", "13e siècle", "10e siècle", "11e siècle"), "Histoire", "Le sabre du 11e siècle est considéré comme le plus ancien sabre de samouraï conservé en raison de sa découverte dans un tumulus funéraire de l'époque de Heian, période où les lames courbes caractéristiques des katana ont commencé à être forgées."),
            en = LocalizedContent("What is the oldest preserved samurai sword?", listOf("12th century", "13th century", "10th century", "11th century"), "History", "The 11th-century sword is considered the oldest preserved samurai sword due to its discovery in a burial mound from the Heian period, when the curved blades characteristic of katana began to be forged."),
            zh = LocalizedContent("现存最古老的武士刀是什么？", listOf("12世纪", "13世纪", "10世纪", "11世纪"), "历史", "11世纪的刀被认为是最古老的保存完好的武士刀，因为它是在平安时代的古坟中发现的，当时开始锻造具有特色的弯曲刀身的武士刀。"),
            es = LocalizedContent("¿Cuál es la espada de samurái más antigua conservada?", listOf("Siglo XII", "Siglo XIII", "Siglo X", "Siglo XI"), "Historia", "La espada del siglo XI se considera la más antigua conservada debido a su descubrimiento en un túmulo funerario del período Heian, época en la que comenzaron a forjarse las hojas curvas características de las katana.")
        ),
        BilingualQuestion(
            id = 12667, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année Erik le Rouge a-t-il colonisé le Groenland?", listOf("982", "984", "986", "988"), "Histoire", "Erik le Rouge, exilé d'Islande pour meurtre, a exploré puis fondé la première colonie viking au Groenland en 984, donnant à l'île son nom pour attirer des colons."),
            en = LocalizedContent("In what year did Erik the Red colonize Greenland?", listOf("982", "984", "986", "988"), "History", "Erik the Red, exiled from Iceland for murder, explored and then founded the first Viking colony in Greenland in 984, naming the island to attract settlers."),
            zh = LocalizedContent("红发埃里克在哪一年殖民了格陵兰？", listOf("982年", "984年", "986年", "988年"), "历史", "红发埃里克因谋杀被冰岛流放，他探索并于984年在格陵兰建立了第一个维京殖民地，给该岛命名以吸引定居者。"),
            es = LocalizedContent("¿En qué año colonizó Erik el Rojo Groenlandia?", listOf("982", "984", "986", "988"), "Historia", "Erik el Rojo, exiliado de Islandia por asesinato, exploró y luego fundó la primera colonia vikinga en Groenlandia en 984, dando nombre a la isla para atraer colonos.")
        ),
        BilingualQuestion(
            id = 12668, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel général shogun a unifié le Japon?", listOf("Tokugawa Ieyasu", "Oda Nobunaga", "Toyotomi Hideyoshi", "Minamoto Yoritomo"), "Histoire", "Tokugawa Ieyasu a unifié le Japon après la bataille de Sekigahara en 1600, devenant shogun en 1603 et fondant le shogunat Tokugawa qui a régné jusqu'en 1868."),
            en = LocalizedContent("Which shogun general unified Japan?", listOf("Tokugawa Ieyasu", "Oda Nobunaga", "Toyotomi Hideyoshi", "Minamoto Yoritomo"), "History", "Tokugawa Ieyasu unified Japan after the Battle of Sekigahara in 1600, becoming shogun in 1603 and founding the Tokugawa shogunate, which ruled until 1868."),
            zh = LocalizedContent("哪位将军统一了日本？", listOf("德川家康", "织田信长", "丰臣秀吉", "源赖朝"), "历史", "德川家康在1600年关原之战后统一了日本，1603年成为将军，建立了德川幕府，统治至1868年。"),
            es = LocalizedContent("¿Qué general shogun unificó Japón?", listOf("Tokugawa Ieyasu", "Oda Nobunaga", "Toyotomi Hideyoshi", "Minamoto Yoritomo"), "Historia", "Tokugawa Ieyasu unificó Japón tras la batalla de Sekigahara en 1600, convirtiéndose en shogun en 1603 y fundando el shogunato Tokugawa, que gobernó hasta 1868.")
        ),
        BilingualQuestion(
            id = 12669, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de pilotis les Vikings utilisaient-ils dans leurs navires?", listOf("2", "4", "6", "8"), "Histoire", "Les navires vikings, comme le célèbre bateau d'Oseberg, étaient équipés de six pilotis, un nombre standard pour assurer stabilité et manœuvrabilité lors des traversées."),
            en = LocalizedContent("How many steering oars did the Vikings use on their ships?", listOf("2", "4", "6", "8"), "History", "Viking ships, like the famous Oseberg ship, were equipped with six steering oars, a standard number to ensure stability and maneuverability during voyages."),
            zh = LocalizedContent("维京人在他们的船上使用了多少根舵桨？", listOf("2", "4", "6", "8"), "历史", "维京船只，如著名的奥塞贝格船，配备了六根舵桨，这是确保航行稳定性和机动性的标准数量。"),
            es = LocalizedContent("¿Cuántos timones de espadilla usaban los vikingos en sus barcos?", listOf("2", "4", "6", "8"), "Historia", "Los barcos vikingos, como el famoso barco de Oseberg, estaban equipados con seis timones de espadilla, un número estándar para garantizar estabilidad y maniobrabilidad durante las travesías.")
        ),
        BilingualQuestion(
            id = 12670, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel était le type d'arme principale des samuraïs?", listOf("Arc", "Épée katana", "Lança", "Arquebus"), "Histoire", "La katana était l'arme emblématique des samouraïs, symbolisant leur honneur et leur statut social, et utilisée au combat comme au quotidien."),
            en = LocalizedContent("What was the main weapon type of the samurai?", listOf("Bow", "Katana sword", "Spear", "Arquebus"), "History", "The katana was the iconic weapon of the samurai, symbolizing their honor and social status, used both in combat and daily life."),
            zh = LocalizedContent("武士的主要武器类型是什么？", listOf("弓", "武士刀", "长枪", "火绳枪"), "历史", "武士刀是武士的标志性武器，象征着他们的荣誉和社会地位，既用于战斗也用于日常生活。"),
            es = LocalizedContent("¿Cuál era el tipo de arma principal de los samuráis?", listOf("Arco", "Espada katana", "Lanza", "Arcabuz"), "Historia", "La katana era el arma emblemática de los samuráis, simbolizando su honor y estatus social, utilizada tanto en combate como en la vida cotidiana.")
        ),
        BilingualQuestion(
            id = 12671, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année Björn Ironside aurait-il atteint la Méditerranée?", listOf("860", "865", "870", "875"), "Histoire", "Selon les chroniques franques, Björn Ironside mena une expédition viking en Méditerranée vers 859-862, mais la date de 865 est souvent retenue pour son raid jusqu'à Valence."),
            en = LocalizedContent("In which year did Björn Ironside supposedly reach the Mediterranean?", listOf("860", "865", "870", "875"), "History", "According to Frankish chronicles, Björn Ironside led a Viking expedition to the Mediterranean around 859-862, but the year 865 is often cited for his raid as far as Valencia."),
            zh = LocalizedContent("比约恩·铁臂据说在哪一年到达了地中海？", listOf("860", "865", "870", "875"), "历史", "根据法兰克编年史，比约恩·铁臂在859-862年左右率领维京远征队到达地中海，但865年常被引用为他袭击至瓦伦西亚的年份。"),
            es = LocalizedContent("¿En qué año supuestamente Björn Ironside llegó al Mediterráneo?", listOf("860", "865", "870", "875"), "Historia", "Según las crónicas francas, Björn Ironside lideró una expedición vikinga al Mediterráneo hacia 859-862, pero el año 865 se cita a menudo para su incursión hasta Valencia.")
        ),
        BilingualQuestion(
            id = 12672, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de châteaux le Shogun avait-il en tant que résidence?", listOf("1", "5", "10", "20"), "Histoire", "Le shogun Tokugawa Ieyasu établit un réseau de dix châteaux principaux pour sécuriser son pouvoir, dont celui d'Edo comme résidence centrale et neuf autres répartis stratégiquement."),
            en = LocalizedContent("How many castles did the Shogun have as residences?", listOf("1", "5", "10", "20"), "History", "Shogun Tokugawa Ieyasu established a network of ten main castles to secure his power, with Edo Castle as the central residence and nine others strategically placed."),
            zh = LocalizedContent("将军拥有多少座城堡作为居所？", listOf("1", "5", "10", "20"), "历史", "德川家康将军建立了一个由十座主要城堡组成的网络来巩固权力，其中江户城作为中心居所，另外九座战略性地分布。"),
            es = LocalizedContent("¿Cuántos castillos tenía el Shogun como residencias?", listOf("1", "5", "10", "20"), "Historia", "El shogun Tokugawa Ieyasu estableció una red de diez castillos principales para asegurar su poder, con el castillo de Edo como residencia central y otros nueve distribuidos estratégicamente.")
        ),
        BilingualQuestion(
            id = 12673, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel était le type de gouvernement du Japon samuraï?", listOf("Monarchie", "Shogunat", "République", "Dictature"), "Histoire", "Le Japon des samouraïs était gouverné par un shogunat, un régime militaire où le shogun détenait le pouvoir effectif, tandis que l'empereur restait une figure symbolique."),
            en = LocalizedContent("What was the type of government of samurai Japan?", listOf("Monarchy", "Shogunate", "Republic", "Dictatorship"), "History", "Samurai Japan was governed by a shogunate, a military regime where the shogun held effective power, while the emperor remained a symbolic figure."),
            zh = LocalizedContent("武士时代的日本是什么类型的政府？", listOf("君主制", "幕府", "共和国", "独裁制"), "历史", "武士时代的日本由幕府统治，这是一种军事政权，将军掌握实权，而天皇仍是象征性人物。"),
            es = LocalizedContent("¿Cuál era el tipo de gobierno del Japón samurái?", listOf("Monarquía", "Shogunato", "República", "Dictadura"), "Historia", "El Japón de los samuráis estaba gobernado por un shogunato, un régimen militar donde el shogun tenía el poder efectivo, mientras que el emperador seguía siendo una figura simbólica.")
        ),
        BilingualQuestion(
            id = 12674, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année le premier contact Viking-Amérique Nord?", listOf("900", "1000", "1100", "1492"), "Histoire", "L'exploration viking du Vinland, menée par Leif Erikson, situe leur premier contact avec l'Amérique du Nord vers l'an 1000, bien avant Christophe Colomb."),
            en = LocalizedContent("In which year did the first Viking contact with North America occur?", listOf("900", "1000", "1100", "1492"), "History", "The Viking exploration of Vinland, led by Leif Erikson, places their first contact with North America around the year 1000, long before Christopher Columbus."),
            zh = LocalizedContent("维京人与北美第一次接触发生在哪一年？", listOf("900", "1000", "1100", "1492"), "历史", "由莱夫·埃里克松领导的维京人对文兰的探索，将他们与北美的第一次接触定在公元1000年左右，远早于克里斯托弗·哥伦布。"),
            es = LocalizedContent("¿En qué año ocurrió el primer contacto vikingo con América del Norte?", listOf("900", "1000", "1100", "1492"), "Historia", "La exploración vikinga de Vinland, liderada por Leif Erikson, sitúa su primer contacto con América del Norte alrededor del año 1000, mucho antes de Cristóbal Colón.")
        ),
        BilingualQuestion(
            id = 12675, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel samuraï a écrit le Hagakure?", listOf("Miyamoto Musashi", "Yamamoto Tsunetomo", "Minamoto Yoritomo", "Tokugawa Ieyasu"), "Histoire", "Yamamoto Tsunetomo, un samouraï du domaine de Saga, a compilé le Hagakure au début du XVIIIe siècle, un traité sur le bushido et la voie du guerrier."),
            en = LocalizedContent("Which samurai wrote the Hagakure?", listOf("Miyamoto Musashi", "Yamamoto Tsunetomo", "Minamoto Yoritomo", "Tokugawa Ieyasu"), "History", "Yamamoto Tsunetomo, a samurai from the Saga domain, compiled the Hagakure in the early 18th century, a treatise on bushido and the way of the warrior."),
            zh = LocalizedContent("哪位武士撰写了《叶隐》？", listOf("宫本武藏", "山本常朝", "源赖朝", "德川家康"), "历史", "山本常朝，一位来自佐贺藩的武士，在18世纪初编纂了《叶隐》，这是一部关于武士道和武士之道的论著。"),
            es = LocalizedContent("¿Qué samurái escribió el Hagakure?", listOf("Miyamoto Musashi", "Yamamoto Tsunetomo", "Minamoto Yoritomo", "Tokugawa Ieyasu"), "Historia", "Yamamoto Tsunetomo, un samurái del dominio de Saga, compiló el Hagakure a principios del siglo XVIII, un tratado sobre el bushido y el camino del guerrero.")
        ),
        BilingualQuestion(
            id = 12676, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de piliers un vaisseau dragon Viking avait-il?", listOf("2", "4", "6", "8"), "Histoire", "Les navires vikings, appelés drakkars, possédaient généralement deux rangées de rames de chaque côté, soit quatre piliers ou supports principaux pour la structure. Le nom \"drakkar\" vient de la figure de proue en forme de dragon."),
            en = LocalizedContent("How many pillars did a Viking dragon ship have?", listOf("2", "4", "6", "8"), "History", "Viking ships, called longships, generally had two rows of oars on each side, meaning four main pillars or supports for the structure. The name 'drakkar' comes from the dragon-shaped prow."),
            zh = LocalizedContent("维京龙头船有多少根支柱？", listOf("2", "4", "6", "8"), "历史", "维京船，称为长船，通常每侧有两排桨，意味着结构有四个主要支柱或支撑。名称“drakkar”源自龙形的船首。"),
            es = LocalizedContent("¿Cuántos pilares tenía un barco dragón vikingo?", listOf("2", "4", "6", "8"), "Historia", "Los barcos vikingos, llamados drakkars, generalmente tenían dos filas de remos a cada lado, lo que significa cuatro pilares o soportes principales para la estructura. El nombre 'drakkar' proviene de la proa con forma de dragón.")
        ),
        BilingualQuestion(
            id = 12677, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année la bataille de Sekigahara s'est-elle déroulée?", listOf("1598", "1600", "1602", "1604"), "Histoire", "La bataille de Sekigahara en 1600 a marqué la fin de la période Sengoku et a permis à Tokugawa Ieyasu d'établir le shogunat Tokugawa, unifiant ainsi le Japon."),
            en = LocalizedContent("In which year did the Battle of Sekigahara take place?", listOf("1598", "1600", "1602", "1604"), "History", "The Battle of Sekigahara in 1600 marked the end of the Sengoku period and allowed Tokugawa Ieyasu to establish the Tokugawa shogunate, unifying Japan."),
            zh = LocalizedContent("关原之战发生在哪一年？", listOf("1598", "1600", "1602", "1604"), "历史", "1600年的关原之战标志着战国时代的结束，并使德川家康得以建立德川幕府，统一日本。"),
            es = LocalizedContent("¿En qué año tuvo lugar la Batalla de Sekigahara?", listOf("1598", "1600", "1602", "1604"), "Historia", "La Batalla de Sekigahara en 1600 marcó el fin del período Sengoku y permitió a Tokugawa Ieyasu establecer el shogunato Tokugawa, unificando Japón.")
        ),
        BilingualQuestion(
            id = 12678, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel était le métier de Miyamoto Musashi?", listOf("Moine", "Guerrier/Samouraï", "Cultivateur", "Marchand"), "Histoire", "Miyamoto Musashi était un célèbre samouraï japonais du XVIIe siècle, reconnu pour son habileté au combat et son traité stratégique Le Livre des Cinq Anneaux."),
            en = LocalizedContent("What was Miyamoto Musashi's occupation?", listOf("Monk", "Warrior/Samurai", "Farmer", "Merchant"), "History", "Miyamoto Musashi was a famous Japanese samurai of the 17th century, renowned for his combat skill and his strategic treatise The Book of Five Rings."),
            zh = LocalizedContent("宫本武藏的职业是什么？", listOf("僧侣", "武士", "农民", "商人"), "历史", "宫本武藏是17世纪日本著名的武士，以其战斗技巧和战略著作《五轮书》而闻名。"),
            es = LocalizedContent("¿Cuál era la ocupación de Miyamoto Musashi?", listOf("Monje", "Guerrero/Samurái", "Granjero", "Comerciante"), "Historia", "Miyamoto Musashi fue un famoso samurái japonés del siglo XVII, reconocido por su habilidad en combate y su tratado estratégico El Libro de los Cinco Anillos.")
        ),
        BilingualQuestion(
            id = 12679, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Combien de siècles les Vikings ont-ils dominé la mer du Nord?", listOf("1", "2", "3", "4"), "Histoire", "L'ère viking dans la mer du Nord s'étend approximativement du VIIIe au XIe siècle, soit une période d'environ 300 ans, ce qui correspond à trois siècles."),
            en = LocalizedContent("How many centuries did the Vikings dominate the North Sea?", listOf("1", "2", "3", "4"), "History", "The Viking Age in the North Sea spanned approximately from the 8th to the 11th century, a period of about 300 years, corresponding to three centuries."),
            zh = LocalizedContent("维京人统治北海长达几个世纪？", listOf("1", "2", "3", "4"), "历史", "维京时代在北海大约从8世纪持续到11世纪，约300年，相当于三个世纪。"),
            es = LocalizedContent("¿Cuántos siglos dominaron los vikingos el mar del Norte?", listOf("1", "2", "3", "4"), "Historia", "La era vikinga en el mar del Norte se extendió aproximadamente desde el siglo VIII hasta el XI, un período de unos 300 años, lo que corresponde a tres siglos.")
        ),
        BilingualQuestion(
            id = 12680, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus long fjord du monde?", listOf("Sognefjord", "Geirangerfjord", "Scoresby Sund", "Hardangerfjord"), "Géographie", "Le Sognefjord, situé en Norvège, s'étend sur plus de 200 kilomètres à l'intérieur des terres, ce qui en fait le plus long fjord du monde."),
            en = LocalizedContent("What is the longest fjord in the world?", listOf("Sognefjord", "Geirangerfjord", "Scoresby Sund", "Hardangerfjord"), "Geography", "The Sognefjord, located in Norway, stretches over 200 kilometers inland, making it the longest fjord in the world."),
            zh = LocalizedContent("世界上最长的峡湾是哪个？", listOf("松恩峡湾", "盖朗厄尔峡湾", "斯科雷斯比峡湾", "哈当厄尔峡湾"), "地理", "松恩峡湾位于挪威，向内陆延伸超过200公里，是世界上最长的峡湾。"),
            es = LocalizedContent("¿Cuál es el fiordo más largo del mundo?", listOf("Sognefjord", "Geirangerfjord", "Scoresby Sund", "Hardangerfjord"), "Geografia", "El Sognefjord, ubicado en Noruega, se extiende más de 200 kilómetros tierra adentro, lo que lo convierte en el fiordo más largo del mundo.")
        ),
        BilingualQuestion(
            id = 12681, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quel pays se trouve le Geirangerfjord?", listOf("Suède", "Islande", "Norvège", "Groenland"), "Géographie", "Le Geirangerfjord est un fjord situé dans le comté de Møre og Romsdal, dans l'ouest de la Norvège. Il est inscrit au patrimoine mondial de l'UNESCO."),
            en = LocalizedContent("In which country is the Geirangerfjord located?", listOf("Sweden", "Iceland", "Norway", "Greenland"), "Geography", "The Geirangerfjord is a fjord in the county of Møre og Romsdal, western Norway. It is a UNESCO World Heritage site."),
            zh = LocalizedContent("盖朗厄尔峡湾位于哪个国家？", listOf("瑞典", "冰岛", "挪威", "格陵兰"), "地理", "盖朗厄尔峡湾位于挪威西部默勒-鲁姆斯达尔郡，是联合国教科文组织世界遗产。"),
            es = LocalizedContent("¿En qué país se encuentra el Geirangerfjord?", listOf("Suecia", "Islandia", "Noruega", "Groenlandia"), "Geografia", "El Geirangerfjord es un fiordo en el condado de Møre og Romsdal, en el oeste de Noruega. Es Patrimonio de la Humanidad de la UNESCO.")
        ),
        BilingualQuestion(
            id = 12682, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de fjords la Norvège possède-t-elle environ?", listOf("500", "1000", "1500", "2000"), "Géographie", "Le littoral norvégien, très découpé par les glaciers, compte environ 2000 fjords, dont les plus célèbres sont le Geirangerfjord et le Sognefjord."),
            en = LocalizedContent("Approximately how many fjords does Norway have?", listOf("500", "1000", "1500", "2000"), "Geography", "The Norwegian coastline, heavily indented by glaciers, has about 2000 fjords, the most famous being Geirangerfjord and Sognefjord."),
            zh = LocalizedContent("挪威大约有多少个峡湾？", listOf("500", "1000", "1500", "2000"), "地理", "挪威海岸线受冰川侵蚀严重，约有2000个峡湾，其中最著名的是盖朗厄尔峡湾和松恩峡湾。"),
            es = LocalizedContent("¿Aproximadamente cuántos fiordos tiene Noruega?", listOf("500", "1000", "1500", "2000"), "Geografia", "La costa noruega, muy accidentada por los glaciares, cuenta con unos 2000 fiordos, siendo los más famosos el Geirangerfjord y el Sognefjord.")
        ),
        BilingualQuestion(
            id = 12683, correctIndex = 3, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plus grand delta fluvial du monde?", listOf("Nil", "Mississippi", "Mékong", "Gange-Brahmapoutre"), "Géographie", "Le delta du Gange-Brahmapoutre, situé principalement au Bangladesh et en Inde, est le plus vaste du monde avec une superficie d'environ 100 000 km²."),
            en = LocalizedContent("What is the largest river delta in the world?", listOf("Nile", "Mississippi", "Mekong", "Ganges-Brahmaputra"), "Geography", "The Ganges-Brahmaputra delta, mainly in Bangladesh and India, is the largest in the world with an area of about 100,000 km²."),
            zh = LocalizedContent("世界上最大的河流三角洲是哪个？", listOf("尼罗河", "密西西比河", "湄公河", "恒河-布拉马普特拉河"), "地理", "恒河-布拉马普特拉河三角洲主要位于孟加拉国和印度，面积约10万平方公里，是世界上最大的三角洲。"),
            es = LocalizedContent("¿Cuál es el delta fluvial más grande del mundo?", listOf("Nilo", "Misisipi", "Mekong", "Ganges-Brahmaputra"), "Geografia", "El delta del Ganges-Brahmaputra, principalmente en Bangladesh y la India, es el más grande del mundo con una superficie de unos 100.000 km².")
        ),
        BilingualQuestion(
            id = 12684, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de bras le delta du Gange possède-t-il?", listOf("3", "5", "7", "10"), "Géographie", "Le delta du Gange, l'un des plus vastes au monde, est traditionnellement décrit comme ayant sept bras principaux, bien que leur nombre exact varie selon les saisons et les crues."),
            en = LocalizedContent("How many branches does the Ganges delta have?", listOf("3", "5", "7", "10"), "Geography", "The Ganges delta, one of the largest in the world, is traditionally described as having seven main branches, though the exact number varies with seasons and floods."),
            zh = LocalizedContent("恒河三角洲有多少条支流？", listOf("3", "5", "7", "10"), "地理", "恒河三角洲是世界上最大的三角洲之一，传统上描述有七条主要支流，但具体数量随季节和洪水而变化。"),
            es = LocalizedContent("¿Cuántos brazos tiene el delta del Ganges?", listOf("3", "5", "7", "10"), "Geografia", "El delta del Ganges, uno de los más grandes del mundo, se describe tradicionalmente con siete brazos principales, aunque el número exacto varía según las estaciones y las inundaciones.")
        ),
        BilingualQuestion(
            id = 12685, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Le fjord de Geirangster mesure quelle profondeur?", listOf("200m", "500m", "700m", "1000m"), "Géographie", "Le Geirangerfjord en Norvège atteint une profondeur maximale de 700 mètres, ce qui en fait l'un des fjords les plus profonds du pays."),
            en = LocalizedContent("What is the depth of the Geirangerfjord?", listOf("200m", "500m", "700m", "1000m"), "Geography", "The Geirangerfjord in Norway reaches a maximum depth of 700 meters, making it one of the deepest fjords in the country."),
            zh = LocalizedContent("盖朗厄尔峡湾的深度是多少？", listOf("200米", "500米", "700米", "1000米"), "地理", "挪威的盖朗厄尔峡湾最大深度达700米，是该国最深的峡湾之一。"),
            es = LocalizedContent("¿Qué profundidad tiene el Geirangerfjord?", listOf("200m", "500m", "700m", "1000m"), "Geografia", "El Geirangerfjord en Noruega alcanza una profundidad máxima de 700 metros, lo que lo convierte en uno de los fiordos más profundos del país.")
        ),
        BilingualQuestion(
            id = 12686, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel fjord est classé au patrimoine mondial?", listOf("Sognefjord", "Geirangerfjord", "Nærøyfjord", "Tous"), "Géographie", "Le Geirangerfjord et le Nærøyfjord, en Norvège, sont inscrits au patrimoine mondial de l'UNESCO depuis 2005."),
            en = LocalizedContent("Which fjord is a UNESCO World Heritage site?", listOf("Sognefjord", "Geirangerfjord", "Nærøyfjord", "All"), "Geography", "The Geirangerfjord and Nærøyfjord in Norway have been UNESCO World Heritage sites since 2005."),
            zh = LocalizedContent("哪个峡湾被列为世界遗产？", listOf("松恩峡湾", "盖朗厄尔峡湾", "纳柔依峡湾", "全部"), "地理", "挪威的盖朗厄尔峡湾和纳柔依峡湾自2005年起被列为联合国教科文组织世界遗产。"),
            es = LocalizedContent("¿Qué fiordo es Patrimonio de la Humanidad?", listOf("Sognefjord", "Geirangerfjord", "Nærøyfjord", "Todos"), "Geografia", "El Geirangerfjord y el Nærøyfjord en Noruega son Patrimonio de la Humanidad de la UNESCO desde 2005.")
        ),
        BilingualQuestion(
            id = 12687, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quelle est la profondeur moyenne des fjords?", listOf("100m", "200m", "500m", "1000m"), "Géographie", "Les fjords sont des vallées glaciaires submergées, souvent très profondes. Leur profondeur moyenne atteint environ 500 mètres, bien plus que celle des mers côtières."),
            en = LocalizedContent("What is the average depth of fjords?", listOf("100m", "200m", "500m", "1000m"), "Geography", "Fjords are submerged glacial valleys, often very deep. Their average depth is about 500 meters, much deeper than coastal seas."),
            zh = LocalizedContent("峡湾的平均深度是多少？", listOf("100米", "200米", "500米", "1000米"), "地理", "峡湾是被淹没的冰川山谷，通常很深。它们的平均深度约为500米，远深于沿海海域。"),
            es = LocalizedContent("¿Cuál es la profundidad media de los fiordos?", listOf("100m", "200m", "500m", "1000m"), "Geografia", "Los fiordos son valles glaciares sumergidos, a menudo muy profundos. Su profundidad media alcanza unos 500 metros, mucho más que la de los mares costeros.")
        ),
        BilingualQuestion(
            id = 12688, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien d'îles le fjord de Sognefjord possède-t-il?", listOf("10", "50", "100", "500"), "Géographie", "Le Sognefjord, en Norvège, est le plus long fjord du pays et abrite environ 100 îles, dont certaines sont habitées."),
            en = LocalizedContent("How many islands does the Sognefjord have?", listOf("10", "50", "100", "500"), "Geography", "The Sognefjord in Norway is the longest fjord in the country and is home to about 100 islands, some of which are inhabited."),
            zh = LocalizedContent("松恩峡湾有多少个岛屿？", listOf("10", "50", "100", "500"), "地理", "挪威的松恩峡湾是该国最长的峡湾，拥有约100个岛屿，其中一些有人居住。"),
            es = LocalizedContent("¿Cuántas islas tiene el Sognefjord?", listOf("10", "50", "100", "500"), "Geografia", "El Sognefjord en Noruega es el fiordo más largo del país y alberga unas 100 islas, algunas de las cuales están habitadas.")
        ),
    )

    private fun part3(): List<BilingualQuestion> = listOf(
        BilingualQuestion(
            id = 12689, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Le delta du Mékong couvre quelle superficie?", listOf("17000 km2", "39000 km2", "60000 km2", "100000 km2"), "Géographie", "Le delta du Mékong, situé au sud du Vietnam, s'étend sur environ 39 000 km², ce qui en fait l'une des plus vastes plaines alluviales d'Asie du Sud-Est."),
            en = LocalizedContent("What is the area of the Mekong Delta?", listOf("17,000 km²", "39,000 km²", "60,000 km²", "100,000 km²"), "Geography", "The Mekong Delta, located in southern Vietnam, covers approximately 39,000 km², making it one of the largest alluvial plains in Southeast Asia."),
            zh = LocalizedContent("湄公河三角洲的面积是多少？", listOf("17000平方公里", "39000平方公里", "60000平方公里", "100000平方公里"), "地理", "湄公河三角洲位于越南南部，面积约39000平方公里，是东南亚最大的冲积平原之一。"),
            es = LocalizedContent("¿Qué superficie cubre el delta del Mekong?", listOf("17 000 km²", "39 000 km²", "60 000 km²", "100 000 km²"), "Geografía", "El delta del Mekong, situado en el sur de Vietnam, se extiende sobre aproximadamente 39 000 km², lo que lo convierte en una de las llanuras aluviales más grandes del sudeste asiático.")
        ),
        BilingualQuestion(
            id = 12690, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel fjord islandais est le plus profond?", listOf("Skorradalsfjord", "Ísafjord", "Dýrafjord", "Hnap"), "Géographie", "Avec 197 mètres de profondeur, le Skorradalsfjord détient le record de profondeur parmi les fjords islandais, surpassant les autres fjords du pays."),
            en = LocalizedContent("Which Icelandic fjord is the deepest?", listOf("Skorradalsfjord", "Ísafjord", "Dýrafjord", "Hnap"), "Geography", "At 197 meters deep, Skorradalsfjord holds the record for depth among Icelandic fjords, surpassing other fjords in the country."),
            zh = LocalizedContent("冰岛哪个峡湾最深？", listOf("斯科拉达尔峡湾", "伊萨峡湾", "迪拉峡湾", "赫纳普"), "地理", "斯科拉达尔峡湾深度达197米，是冰岛最深的峡湾，超过了该国其他峡湾。"),
            es = LocalizedContent("¿Qué fiordo islandés es el más profundo?", listOf("Skorradalsfjord", "Ísafjord", "Dýrafjord", "Hnap"), "Geografía", "Con 197 metros de profundidad, el Skorradalsfjord ostenta el récord de profundidad entre los fiordos islandeses, superando a los demás fiordos del país.")
        ),
        BilingualQuestion(
            id = 12691, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de population habite le delta du Gange?", listOf("100 millions", "300 millions", "500 millions", "1 milliard"), "Géographie", "Le delta du Gange, situé principalement au Bangladesh et en Inde, est l'une des régions les plus densément peuplées au monde avec environ 100 millions d'habitants."),
            en = LocalizedContent("How many people live in the Ganges Delta?", listOf("100 million", "300 million", "500 million", "1 billion"), "Geography", "The Ganges Delta, mainly in Bangladesh and India, is one of the most densely populated regions in the world with about 100 million inhabitants."),
            zh = LocalizedContent("恒河三角洲有多少人口？", listOf("1亿", "3亿", "5亿", "10亿"), "地理", "恒河三角洲主要位于孟加拉国和印度，是世界上人口最稠密的地区之一，约有1亿居民。"),
            es = LocalizedContent("¿Cuánta población habita el delta del Ganges?", listOf("100 millones", "300 millones", "500 millones", "1 billón"), "Geografía", "El delta del Ganges, situado principalmente en Bangladés y la India, es una de las regiones más densamente pobladas del mundo, con aproximadamente 100 millones de habitantes.")
        ),
        BilingualQuestion(
            id = 12692, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus haut fjord en Europe?", listOf("Geirangerfjord", "Sognefjord", "Hardangerfjord", "Lysefjord"), "Géographie", "Le Hardangerfjord, situé en Norvège, est le plus haut fjord d'Europe avec des montagnes atteignant 1 800 mètres. Il s'étend sur 179 km de long et est connu pour ses paysages spectaculaires."),
            en = LocalizedContent("What is the highest fjord in Europe?", listOf("Geirangerfjord", "Sognefjord", "Hardangerfjord", "Lysefjord"), "Geography", "Hardangerfjord, located in Norway, is the highest fjord in Europe with mountains reaching 1,800 meters. It stretches 179 km long and is known for its spectacular scenery."),
            zh = LocalizedContent("欧洲最高的峡湾是哪个？", listOf("盖朗厄尔峡湾", "松恩峡湾", "哈当厄尔峡湾", "吕瑟峡湾"), "地理", "哈当厄尔峡湾位于挪威，是欧洲最高的峡湾，周围山脉高达1800米。它绵延179公里，以壮观的景色闻名。"),
            es = LocalizedContent("¿Cuál es el fiordo más alto de Europa?", listOf("Geirangerfjord", "Sognefjord", "Hardangerfjord", "Lysefjord"), "Geografía", "El Hardangerfjord, situado en Noruega, es el fiordo más alto de Europa, con montañas que alcanzan los 1 800 metros. Se extiende a lo largo de 179 km y es conocido por sus paisajes espectaculares.")
        ),
        BilingualQuestion(
            id = 12693, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Le Scoresby Sund se situe où?", listOf("Islande", "Groenland", "Norvège", "Svalbard"), "Géographie", "Le Scoresby Sund est le plus grand fjord du monde, situé sur la côte est du Groenland."),
            en = LocalizedContent("Where is Scoresby Sund located?", listOf("Iceland", "Greenland", "Norway", "Svalbard"), "Geography", "Scoresby Sund is the largest fjord in the world, located on the east coast of Greenland."),
            zh = LocalizedContent("斯科斯比峡湾位于哪里？", listOf("冰岛", "格陵兰", "挪威", "斯瓦尔巴"), "地理", "斯科斯比峡湾是世界上最大的峡湾，位于格陵兰东海岸。"),
            es = LocalizedContent("¿Dónde se encuentra el Scoresby Sund?", listOf("Islandia", "Groenlandia", "Noruega", "Svalbard"), "Geografía", "El Scoresby Sund es el fiordo más grande del mundo, situado en la costa este de Groenlandia.")
        ),
        BilingualQuestion(
            id = 12694, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Combien de rivières principales alimentent le delta du Nil?", listOf("1", "2", "3", "5"), "Géographie", "Le Nil se divise en deux branches principales, le Nil de Rosette et le Nil de Damiette, avant de former son delta en Méditerranée."),
            en = LocalizedContent("How many main rivers feed the Nile Delta?", listOf("1", "2", "3", "5"), "Geography", "The Nile divides into two main branches, the Rosetta and Damietta branches, before forming its delta in the Mediterranean."),
            zh = LocalizedContent("有多少条主要河流注入尼罗河三角洲？", listOf("1", "2", "3", "5"), "地理", "尼罗河分为两条主要支流，罗塞塔支流和达米埃塔支流，然后在地中海形成三角洲。"),
            es = LocalizedContent("¿Cuántos ríos principales alimentan el delta del Nilo?", listOf("1", "2", "3", "5"), "Geografía", "El Nilo se divide en dos ramas principales, la rama de Rosetta y la de Damieta, antes de formar su delta en el Mediterráneo.")
        ),
        BilingualQuestion(
            id = 12695, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le taux de subsidence du delta du Mississippi?", listOf("3 cm/an", "6 cm/an", "10 cm/an", "20 cm/an"), "Géographie", "Le delta du Mississippi s'enfonce rapidement en raison de la compaction des sédiments et de l'extraction de pétrole et de gaz, ce qui entraîne une perte de terres côtières."),
            en = LocalizedContent("What is the subsidence rate of the Mississippi Delta?", listOf("3 cm/year", "6 cm/year", "10 cm/year", "20 cm/year"), "Geography", "The Mississippi Delta is sinking rapidly due to sediment compaction and oil and gas extraction, leading to coastal land loss."),
            zh = LocalizedContent("密西西比河三角洲的下沉速率是多少？", listOf("3厘米/年", "6厘米/年", "10厘米/年", "20厘米/年"), "地理", "由于沉积物压实以及石油和天然气开采，密西西比河三角洲正在快速下沉，导致沿海土地流失。"),
            es = LocalizedContent("¿Cuál es la tasa de subsidencia del delta del Mississippi?", listOf("3 cm/año", "6 cm/año", "10 cm/año", "20 cm/año"), "Geografía", "El delta del Mississippi se hunde rápidamente debido a la compactación de sedimentos y la extracción de petróleo y gas, lo que provoca la pérdida de tierras costeras.")
        ),
        BilingualQuestion(
            id = 12696, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Le fjord de Lysefjord contient le rocher Preikestolen situé à quelle hauteur?", listOf("500m", "604m", "700m", "800m"), "Géographie", "Preikestolen, aussi appelé la Chaire du prêtre, est une falaise surplombant le Lysefjord en Norvège, culminant à 604 mètres au-dessus du fjord."),
            en = LocalizedContent("How high is the Preikestolen rock in Lysefjord?", listOf("500m", "604m", "700m", "800m"), "Geography", "Preikestolen, also known as the Pulpit Rock, is a cliff overlooking Lysefjord in Norway, rising 604 meters above the fjord."),
            zh = LocalizedContent("吕瑟峡湾中的布道石高度是多少？", listOf("500米", "604米", "700米", "800米"), "地理", "布道石是挪威吕瑟峡湾上方的一座悬崖，高出峡湾604米。"),
            es = LocalizedContent("¿A qué altura se encuentra la roca Preikestolen en el Lysefjord?", listOf("500 m", "604 m", "700 m", "800 m"), "Geografía", "Preikestolen, también conocido como el Púlpito, es un acantilado que domina el Lysefjord en Noruega, con una altura de 604 metros sobre el fiordo.")
        ),
        BilingualQuestion(
            id = 12697, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de lacs glaciaires alimentent le Sognefjord?", listOf("5", "10", "20", "50"), "Géographie", "Le Sognefjord, le plus long et profond fjord de Norvège, est alimenté par environ 20 lacs glaciaires issus des glaciers environnants, notamment le Jostedalsbreen."),
            en = LocalizedContent("How many glacial lakes feed the Sognefjord?", listOf("5", "10", "20", "50"), "Geography", "Sognefjord, the longest and deepest fjord in Norway, is fed by about 20 glacial lakes from surrounding glaciers, notably Jostedalsbreen."),
            zh = LocalizedContent("有多少个冰川湖注入松恩峡湾？", listOf("5", "10", "20", "50"), "地理", "松恩峡湾是挪威最长、最深的峡湾，由周围冰川（尤其是约斯特达尔冰川）形成的约20个冰川湖补给。"),
            es = LocalizedContent("¿Cuántos lagos glaciares alimentan el Sognefjord?", listOf("5", "10", "20", "50"), "Geografía", "El Sognefjord, el fiordo más largo y profundo de Noruega, es alimentado por aproximadamente 20 lagos glaciares procedentes de los glaciares circundantes, especialmente el Jostedalsbreen.")
        ),
        BilingualQuestion(
            id = 12698, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le delta le plus menacé par le changement climatique?", listOf("Nil", "Mékong", "Gange", "Mississippi"), "Géographie", "Le delta du Mékong est particulièrement vulnérable à la montée des eaux, aux intrusions salines et à la subsidence due à l'extraction d'eau souterraine, menaçant ses écosystèmes et ses populations."),
            en = LocalizedContent("Which delta is most threatened by climate change?", listOf("Nile", "Mekong", "Ganges", "Mississippi"), "Geography", "The Mekong Delta is particularly vulnerable to sea level rise, saltwater intrusion, and subsidence due to groundwater extraction, threatening its ecosystems and populations."),
            zh = LocalizedContent("哪个三角洲受气候变化威胁最大？", listOf("尼罗河三角洲", "湄公河三角洲", "恒河三角洲", "密西西比河三角洲"), "地理", "湄公河三角洲特别容易受到海平面上升、盐水入侵和地下水开采导致的地面沉降的影响，威胁其生态系统和人口。"),
            es = LocalizedContent("¿Qué delta está más amenazado por el cambio climático?", listOf("Nilo", "Mekong", "Ganges", "Mississippi"), "Geografía", "El delta del Mekong es particularmente vulnerable al aumento del nivel del mar, la intrusión salina y la subsidencia debida a la extracción de agua subterránea, amenazando sus ecosistemas y poblaciones.")
        ),
        BilingualQuestion(
            id = 12699, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année le fjord de Geirangerfjord a-t-il été classé patrimoine?", listOf("1999", "2005", "2011", "2015"), "Géographie", "Le Geirangerfjord, en Norvège, a été inscrit au patrimoine mondial de l'UNESCO en 2011, avec le Nærøyfjord, pour ses paysages naturels exceptionnels."),
            en = LocalizedContent("In which year was the Geirangerfjord classified as a World Heritage site?", listOf("1999", "2005", "2011", "2015"), "Geography", "The Geirangerfjord in Norway was inscribed as a UNESCO World Heritage site in 2011, along with the Nærøyfjord, for its exceptional natural landscapes."),
            zh = LocalizedContent("盖朗厄尔峡湾在哪一年被列为世界遗产？", listOf("1999", "2005", "2011", "2015"), "地理", "挪威的盖朗厄尔峡湾与纳柔依峡湾于2011年被联合国教科文组织列为世界遗产，因其独特的自然景观。"),
            es = LocalizedContent("¿En qué año fue clasificado el fiordo de Geirangerfjord como Patrimonio de la Humanidad?", listOf("1999", "2005", "2011", "2015"), "Geografia", "El Geirangerfjord en Noruega fue inscrito como Patrimonio Mundial de la UNESCO en 2011, junto con el Nærøyfjord, por sus paisajes naturales excepcionales.")
        ),
        BilingualQuestion(
            id = 12700, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plus grand dinosaure connu?", listOf("T-Rex", "Argentinosaurus", "Diplodocus", "Apatosaurus"), "Nature", "L'Argentinosaurus est considéré comme le plus grand dinosaure connu, avec une longueur estimée à 30-40 mètres et un poids de 60 à 100 tonnes, vivant au Crétacé en Amérique du Sud."),
            en = LocalizedContent("What is the largest known dinosaur?", listOf("T-Rex", "Argentinosaurus", "Diplodocus", "Apatosaurus"), "Nature", "Argentinosaurus is considered the largest known dinosaur, with an estimated length of 30-40 meters and a weight of 60-100 tons, living in the Cretaceous in South America."),
            zh = LocalizedContent("已知最大的恐龙是什么？", listOf("霸王龙", "阿根廷龙", "梁龙", "迷惑龙"), "自然", "阿根廷龙被认为是已知最大的恐龙，估计体长30-40米，体重60-100吨，生活在白垩纪的南美洲。"),
            es = LocalizedContent("¿Cuál es el dinosaurio más grande conocido?", listOf("T-Rex", "Argentinosaurus", "Diplodocus", "Apatosaurus"), "Naturaleza", "El Argentinosaurus es considerado el dinosaurio más grande conocido, con una longitud estimada de 30-40 metros y un peso de 60 a 100 toneladas, que vivió en el Cretácico en América del Sur.")
        ),
        BilingualQuestion(
            id = 12701, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Combien de millions d'années avant le présent les dinosaures ont-ils disparu?", listOf("50", "65", "100", "200"), "Nature", "L'extinction massive des dinosaures non aviens s'est produite à la fin du Crétacé, il y a environ 65 millions d'années, probablement causée par l'impact d'un astéroïde."),
            en = LocalizedContent("How many million years ago did dinosaurs become extinct?", listOf("50", "65", "100", "200"), "Nature", "The mass extinction of non-avian dinosaurs occurred at the end of the Cretaceous, about 65 million years ago, likely caused by an asteroid impact."),
            zh = LocalizedContent("恐龙在多少百万年前灭绝？", listOf("50", "65", "100", "200"), "自然", "非鸟类恐龙的大灭绝发生在白垩纪末期，大约6500万年前，可能由小行星撞击引起。"),
            es = LocalizedContent("¿Cuántos millones de años antes del presente se extinguieron los dinosaurios?", listOf("50", "65", "100", "200"), "Naturaleza", "La extinción masiva de los dinosaurios no avianos ocurrió al final del Cretácico, hace unos 65 millones de años, probablemente causada por el impacto de un asteroide.")
        ),
        BilingualQuestion(
            id = 12702, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel dinosaure carnivore était le plus grand?", listOf("Allosaurus", "Spinosaurus", "Carnotaurus", "Giganotosaurus"), "Nature", "Le Spinosaurus mesurait jusqu'à 15 mètres de long, dépassant le Tyrannosaurus rex. Il possédait une voile dorsale distinctive et vivait en Afrique du Nord au Crétacé."),
            en = LocalizedContent("Which carnivorous dinosaur was the largest?", listOf("Allosaurus", "Spinosaurus", "Carnotaurus", "Giganotosaurus"), "Nature", "Spinosaurus measured up to 15 meters in length, exceeding Tyrannosaurus rex. It had a distinctive dorsal sail and lived in North Africa during the Cretaceous."),
            zh = LocalizedContent("哪种肉食性恐龙最大？", listOf("异特龙", "棘龙", "食肉牛龙", "南方巨兽龙"), "自然", "棘龙体长可达15米，超过霸王龙。它有一个独特的背帆，生活在白垩纪的北非。"),
            es = LocalizedContent("¿Qué dinosaurio carnívoro era el más grande?", listOf("Allosaurus", "Spinosaurus", "Carnotaurus", "Giganotosaurus"), "Naturaleza", "El Spinosaurus medía hasta 15 metros de largo, superando al Tyrannosaurus rex. Poseía una vela dorsal distintiva y vivía en el norte de África durante el Cretácico.")
        ),
        BilingualQuestion(
            id = 12703, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de dents avait un Triceratops?", listOf("50", "100", "200", "400"), "Nature", "Le Triceratops possédait environ 400 dents disposées en batteries dentaires, qui se renouvelaient constamment pour broyer la végétation coriace."),
            en = LocalizedContent("How many teeth did a Triceratops have?", listOf("50", "100", "200", "400"), "Nature", "Triceratops had about 400 teeth arranged in dental batteries, which were constantly replaced to grind tough vegetation."),
            zh = LocalizedContent("三角龙有多少颗牙齿？", listOf("50", "100", "200", "400"), "自然", "三角龙约有400颗牙齿，排列成齿系，不断更换以磨碎坚韧的植物。"),
            es = LocalizedContent("¿Cuántos dientes tenía un Triceratops?", listOf("50", "100", "200", "400"), "Naturaleza", "El Triceratops poseía aproximadamente 400 dientes dispuestos en baterías dentales, que se renovaban constantemente para triturar la vegetación coriácea.")
        ),
        BilingualQuestion(
            id = 12704, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus ancien fossile de hominidé?", listOf("Lucy (3.2 Ma)", "Ardi (4.4 Ma)", "Sahelanthropus (7 Ma)", "Ardipithecus (6 Ma)"), "Nature", "Découvert au Tchad en 2001, Sahelanthropus tchadensis, vieux d'environ 7 millions d'années, est considéré comme le plus ancien représentant connu de la lignée humaine après la divergence avec les chimpanzés."),
            en = LocalizedContent("What is the oldest hominid fossil?", listOf("Lucy (3.2 Ma)", "Ardi (4.4 Ma)", "Sahelanthropus (7 Ma)", "Ardipithecus (6 Ma)"), "Nature", "Discovered in Chad in 2001, Sahelanthropus tchadensis, about 7 million years old, is considered the oldest known representative of the human lineage after the divergence from chimpanzees."),
            zh = LocalizedContent("最古老的人科化石是什么？", listOf("露西（320万年前）", "阿尔迪（440万年前）", "萨赫勒人（700万年前）", "地猿（600万年前）"), "自然", "2001年在乍得发现的萨赫勒人乍得种，约700万年前，被认为是人类与黑猩猩分化后最古老的人类谱系代表。"),
            es = LocalizedContent("¿Cuál es el fósil de homínido más antiguo?", listOf("Lucy (3.2 Ma)", "Ardi (4.4 Ma)", "Sahelanthropus (7 Ma)", "Ardipithecus (6 Ma)"), "Naturaleza", "Descubierto en Chad en 2001, Sahelanthropus tchadensis, de unos 7 millones de años, es considerado el representante más antiguo conocido del linaje humano después de la divergencia con los chimpancés.")
        ),
        BilingualQuestion(
            id = 12705, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Le Coelacanth est considéré comme un fossile vivant depuis combien de millions d'années?", listOf("10", "50", "100", "300"), "Nature", "Le cœlacanthe est un poisson préhistorique dont les fossiles les plus anciens datent d'environ 400 millions d'années, mais il est resté inchangé depuis environ 100 millions d'années, d'où son surnom de fossile vivant."),
            en = LocalizedContent("For how many million years has the Coelacanth been considered a living fossil?", listOf("10", "50", "100", "300"), "Nature", "The coelacanth is a prehistoric fish whose oldest fossils date back about 400 million years, but it has remained unchanged for about 100 million years, hence its nickname as a living fossil."),
            zh = LocalizedContent("腔棘鱼被认为活化石已有多少百万年？", listOf("10", "50", "100", "300"), "自然", "腔棘鱼是一种史前鱼类，其最古老的化石可追溯到约4亿年前，但它在约1亿年内保持不变，因此被称为活化石。"),
            es = LocalizedContent("¿Desde cuántos millones de años se considera al Celacanto un fósil viviente?", listOf("10", "50", "100", "300"), "Naturaleza", "El celacanto es un pez prehistórico cuyos fósiles más antiguos datan de unos 400 millones de años, pero ha permanecido sin cambios durante unos 100 millones de años, de ahí su apodo de fósil viviente.")
        ),
        BilingualQuestion(
            id = 12706, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel dinosaure avait les plus longues cornes?", listOf("Triceratops", "Styracosaurus", "Pentaceratops", "Dracorex"), "Nature", "Le Pentaceratops possédait les plus longues cornes de tous les dinosaures, avec des pointes pouvant atteindre près de deux mètres. Son nom signifie « visage à cinq cornes », bien qu'il n'en ait eu que trois principales."),
            en = LocalizedContent("Which dinosaur had the longest horns?", listOf("Triceratops", "Styracosaurus", "Pentaceratops", "Dracorex"), "Nature", "Pentaceratops had the longest horns of any dinosaur, with spikes reaching nearly two meters. Its name means 'five-horned face', although it only had three main horns."),
            zh = LocalizedContent("哪种恐龙的角最长？", listOf("三角龙", "戟龙", "五角龙", "龙王龙"), "自然", "五角龙拥有所有恐龙中最长的角，尖刺可达近两米。它的名字意为“五角脸”，尽管它只有三个主要的角。"),
            es = LocalizedContent("¿Qué dinosaurio tenía los cuernos más largos?", listOf("Triceratops", "Styracosaurus", "Pentaceratops", "Dracorex"), "Naturaleza", "El Pentaceratops poseía los cuernos más largos de todos los dinosaurios, con puntas que podían alcanzar casi dos metros. Su nombre significa 'cara de cinco cuernos', aunque solo tenía tres principales.")
        ),
        BilingualQuestion(
            id = 12707, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de tonnes pesait l'Argentinosaurus?", listOf("50", "100", "150", "200"), "Nature", "L'Argentinosaurus est considéré comme l'un des plus grands dinosaures jamais découverts, avec une masse estimée à environ 200 tonnes, soit l'équivalent de plusieurs éléphants d'Afrique."),
            en = LocalizedContent("How many tons did Argentinosaurus weigh?", listOf("50", "100", "150", "200"), "Nature", "Argentinosaurus is considered one of the largest dinosaurs ever discovered, with an estimated mass of about 200 tons, equivalent to several African elephants."),
            zh = LocalizedContent("阿根廷龙重多少吨？", listOf("50", "100", "150", "200"), "自然", "阿根廷龙被认为是有史以来发现的最大恐龙之一，估计质量约为200吨，相当于几头非洲象。"),
            es = LocalizedContent("¿Cuántas toneladas pesaba el Argentinosaurus?", listOf("50", "100", "150", "200"), "Naturaleza", "El Argentinosaurus es considerado uno de los dinosaurios más grandes jamás descubiertos, con una masa estimada de unas 200 toneladas, equivalente a varios elefantes africanos.")
        ),
        BilingualQuestion(
            id = 12708, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel fossile de transition entre poisson et amphibien est célèbre?", listOf("Archeopteryx", "Tiktaalik", "Acanthostega", "Panderichthys"), "Nature", "Découvert au Canada en 2004, Tiktaalik est un poisson à nageoires lobées datant d'environ 375 millions d'années, possédant des caractéristiques à la fois de poisson et de tétrapode."),
            en = LocalizedContent("Which famous transitional fossil between fish and amphibian?", listOf("Archeopteryx", "Tiktaalik", "Acanthostega", "Panderichthys"), "Nature", "Discovered in Canada in 2004, Tiktaalik is a lobe-finned fish from about 375 million years ago, possessing characteristics of both fish and tetrapods."),
            zh = LocalizedContent("哪种著名的过渡化石介于鱼类和两栖动物之间？", listOf("始祖鸟", "提塔利克鱼", "棘螈", "潘氏鱼"), "自然", "2004年在加拿大发现的提塔利克鱼是一种约3.75亿年前的叶鳍鱼，兼具鱼类和四足动物的特征。"),
            es = LocalizedContent("¿Qué famoso fósil de transición entre pez y anfibio?", listOf("Archeopteryx", "Tiktaalik", "Acanthostega", "Panderichthys"), "Naturaleza", "Descubierto en Canadá en 2004, Tiktaalik es un pez de aletas lobuladas de hace unos 375 millones de años, que posee características tanto de pez como de tetrápodo.")
        ),
        BilingualQuestion(
            id = 12709, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Le plus ancien fossile complet de dinosaure date de combien de millions d'années?", listOf("200", "220", "240", "260"), "Nature", "Le fossile complet d'Herrerasaurus, découvert en Argentine, est daté d'environ 240 millions d'années, ce qui en fait le plus ancien dinosaure connu avec un squelette entier."),
            en = LocalizedContent("How many million years old is the oldest complete dinosaur fossil?", listOf("200", "220", "240", "260"), "Nature", "The complete fossil of Herrerasaurus, discovered in Argentina, is dated to about 240 million years ago, making it the oldest known dinosaur with a complete skeleton."),
            zh = LocalizedContent("最完整的恐龙化石距今多少百万年？", listOf("200", "220", "240", "260"), "自然", "在阿根廷发现的赫雷拉龙完整化石距今约2.4亿年，是已知最古老的拥有完整骨架的恐龙。"),
            es = LocalizedContent("¿De cuántos millones de años data el fósil completo de dinosaurio más antiguo?", listOf("200", "220", "240", "260"), "Naturaleza", "El fósil completo de Herrerasaurus, descubierto en Argentina, data de hace unos 240 millones de años, lo que lo convierte en el dinosaurio más antiguo conocido con un esqueleto completo.")
        ),
        BilingualQuestion(
            id = 12710, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus ancien oiseau fossile?", listOf("Archaeopteryx", "Microraptor", "Confuciusornis", "Protopteryx"), "Nature", "Archaeopteryx, découvert en Allemagne dans les années 1860, est considéré comme le plus ancien oiseau fossile connu, datant d'environ 150 millions d'années. Il présente des caractéristiques à la fois de dinosaure et d'oiseau moderne."),
            en = LocalizedContent("What is the oldest fossil bird?", listOf("Archaeopteryx", "Microraptor", "Confuciusornis", "Protopteryx"), "Nature", "Archaeopteryx, discovered in Germany in the 1860s, is considered the oldest known fossil bird, dating back about 150 million years. It exhibits both dinosaur and modern bird characteristics."),
            zh = LocalizedContent("最古老的鸟类化石是什么？", listOf("始祖鸟", "小盗龙", "孔子鸟", "原羽鸟"), "自然", "始祖鸟于19世纪60年代在德国发现，被认为是已知最古老的鸟类化石，距今约1.5亿年。它兼具恐龙和现代鸟类的特征。"),
            es = LocalizedContent("¿Cuál es el ave fósil más antigua?", listOf("Archaeopteryx", "Microraptor", "Confuciusornis", "Protopteryx"), "Naturaleza", "Archaeopteryx, descubierto en Alemania en la década de 1860, es considerada el ave fósil más antigua conocida, datando de hace unos 150 millones de años. Presenta características tanto de dinosaurio como de ave moderna.")
        ),
        BilingualQuestion(
            id = 12711, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Combien d'espèces de dinosaures environ ont été nommées?", listOf("500", "700", "1000", "1500"), "Nature", "Environ 1 000 espèces de dinosaures ont été scientifiquement nommées depuis les premières découvertes, mais ce nombre est en constante évolution avec les nouvelles fouilles et révisions taxonomiques."),
            en = LocalizedContent("Approximately how many dinosaur species have been named?", listOf("500", "700", "1000", "1500"), "Nature", "About 1,000 dinosaur species have been scientifically named since the first discoveries, but this number is constantly changing with new excavations and taxonomic revisions."),
            zh = LocalizedContent("大约有多少种恐龙被命名？", listOf("500", "700", "1000", "1500"), "自然", "自首次发现以来，大约有1000种恐龙被科学命名，但这个数字随着新的发掘和分类修订而不断变化。"),
            es = LocalizedContent("¿Aproximadamente cuántas especies de dinosaurios han sido nombradas?", listOf("500", "700", "1000", "1500"), "Naturaleza", "Alrededor de 1.000 especies de dinosaurios han sido nombradas científicamente desde los primeros descubrimientos, pero este número está en constante cambio con nuevas excavaciones y revisiones taxonómicas.")
        ),
        BilingualQuestion(
            id = 12712, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Le Stegosaurus avait combien de plaques dorsales?", listOf("15", "17", "19", "21"), "Nature", "Les paléontologues ont dénombré 17 plaques osseuses sur le dos du Stegosaurus, disposées en deux rangées alternées le long de sa colonne vertébrale."),
            en = LocalizedContent("How many dorsal plates did Stegosaurus have?", listOf("15", "17", "19", "21"), "Nature", "Paleontologists have counted 17 bony plates on the back of Stegosaurus, arranged in two alternating rows along its spine."),
            zh = LocalizedContent("剑龙有多少块背板？", listOf("15", "17", "19", "21"), "自然", "古生物学家统计剑龙背部有17块骨板，沿脊柱排列成两排交错。"),
            es = LocalizedContent("¿Cuántas placas dorsales tenía el Stegosaurus?", listOf("15", "17", "19", "21"), "Naturaleza", "Los paleontólogos han contado 17 placas óseas en el lomo del Stegosaurus, dispuestas en dos filas alternas a lo largo de su columna vertebral.")
        ),
        BilingualQuestion(
            id = 12713, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel dinosaure était le plus rapide?", listOf("Velociraptor", "Ornithomimus", "Deinonychus", "Compsognathus"), "Nature", "L'Ornithomimus, surnommé l'autruche du Crétacé, pouvait atteindre 60 km/h grâce à ses longues pattes et son corps léger, ce qui en fait l'un des dinosaures les plus rapides connus."),
            en = LocalizedContent("Which dinosaur was the fastest?", listOf("Velociraptor", "Ornithomimus", "Deinonychus", "Compsognathus"), "Nature", "Ornithomimus, nicknamed the ostrich of the Cretaceous, could reach 60 km/h thanks to its long legs and light body, making it one of the fastest known dinosaurs."),
            zh = LocalizedContent("哪种恐龙速度最快？", listOf("迅猛龙", "似鸵龙", "恐爪龙", "美颌龙"), "自然", "似鸵龙被称为白垩纪的鸵鸟，凭借长腿和轻盈的身体可达60公里/小时，是已知最快的恐龙之一。"),
            es = LocalizedContent("¿Qué dinosaurio era el más rápido?", listOf("Velociraptor", "Ornithomimus", "Deinonychus", "Compsognathus"), "Naturaleza", "Ornithomimus, apodado el avestruz del Cretácico, podía alcanzar 60 km/h gracias a sus largas patas y cuerpo ligero, lo que lo convierte en uno de los dinosaurios más rápidos conocidos.")
        ),
        BilingualQuestion(
            id = 12714, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("L'ambre fossile peut conserver des créatures depuis combien d'années?", listOf("1 million", "10 millions", "100 millions", "1 milliard"), "Nature", "L'ambre fossile, une résine d'arbre fossilisée, peut piéger et préserver des organismes comme des insectes pendant des centaines de millions d'années, les plus anciens spécimens datant de 100 millions d'années."),
            en = LocalizedContent("How many years can fossil amber preserve creatures?", listOf("1 million", "10 million", "100 million", "1 billion"), "Nature", "Fossil amber, a fossilized tree resin, can trap and preserve organisms like insects for hundreds of millions of years, with the oldest specimens dating back 100 million years."),
            zh = LocalizedContent("琥珀化石可以保存生物多少年？", listOf("100万", "1000万", "1亿", "10亿"), "自然", "琥珀化石是化石化的树脂，可以捕获并保存昆虫等生物数亿年，最古老的标本可追溯到1亿年前。"),
            es = LocalizedContent("¿Cuántos años puede conservar criaturas el ámbar fósil?", listOf("1 millón", "10 millones", "100 millones", "1 billón"), "Naturaleza", "El ámbar fósil, una resina de árbol fosilizada, puede atrapar y preservar organismos como insectos durante cientos de millones de años, con los especímenes más antiguos datando de 100 millones de años.")
        ),
        BilingualQuestion(
            id = 12715, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus ancien fossile multicellulaire?", listOf("600 millions d'années", "800 millions d'années", "1 milliard d'années", "2 milliards d'années"), "Nature", "Le fossile multicellulaire le plus ancien connu, datant d'environ 600 millions d'années, provient de la faune d'Ediacara, qui représente les premiers organismes complexes sur Terre."),
            en = LocalizedContent("What is the oldest multicellular fossil?", listOf("600 million years", "800 million years", "1 billion years", "2 billion years"), "Nature", "The oldest known multicellular fossil, dating back about 600 million years, comes from the Ediacaran biota, which represents the first complex organisms on Earth."),
            zh = LocalizedContent("最古老的多细胞化石是什么？", listOf("6亿年", "8亿年", "10亿年", "20亿年"), "自然", "已知最古老的多细胞化石距今约6亿年，来自埃迪卡拉生物群，代表了地球上最早出现的复杂生物。"),
            es = LocalizedContent("¿Cuál es el fósil multicelular más antiguo?", listOf("600 millones de años", "800 millones de años", "1 billón de años", "2 billones de años"), "Naturaleza", "El fósil multicelular más antiguo conocido, que data de hace unos 600 millones de años, proviene de la biota de Ediacara, que representa los primeros organismos complejos en la Tierra.")
        ),
        BilingualQuestion(
            id = 12716, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Le Therozinosaurus mesurait combien de mètres?", listOf("5", "8", "11", "15"), "Nature", "Le Therizinosaurus, un dinosaure herbivore du Crétacé, atteignait environ 11 mètres de long, ce qui en fait l'un des plus grands thérizinosauridés connus."),
            en = LocalizedContent("How many meters long was Therizinosaurus?", listOf("5", "8", "11", "15"), "Nature", "Therizinosaurus, a herbivorous dinosaur from the Cretaceous, reached about 11 meters in length, making it one of the largest known therizinosaurids."),
            zh = LocalizedContent("镰刀龙身长多少米？", listOf("5", "8", "11", "15"), "自然", "镰刀龙是一种白垩纪的植食性恐龙，体长约11米，是已知最大的镰刀龙科恐龙之一。"),
            es = LocalizedContent("¿Cuántos metros medía el Therizinosaurus?", listOf("5", "8", "11", "15"), "Naturaleza", "El Therizinosaurus, un dinosaurio herbívoro del Cretácico, alcanzaba unos 11 metros de longitud, lo que lo convierte en uno de los terizinosaurios más grandes conocidos.")
        ),
        BilingualQuestion(
            id = 12717, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de crânes de Lucy les paléontologues ont-ils trouvés?", listOf("1", "3", "5", "10"), "Nature", "Lucy est le surnom donné à un squelette d'australopithèque découvert en Éthiopie en 1974. Les paléontologues n'ont trouvé qu'un seul crâne, appartenant à ce même individu."),
            en = LocalizedContent("How many skulls of Lucy did paleontologists find?", listOf("1", "3", "5", "10"), "Nature", "Lucy is the nickname given to an australopithecine skeleton discovered in Ethiopia in 1974. Paleontologists found only one skull, belonging to this same individual."),
            zh = LocalizedContent("古生物学家发现了多少个露西的头骨？", listOf("1", "3", "5", "10"), "自然", "露西是1974年在埃塞俄比亚发现的一具南方古猿骨架的昵称。古生物学家只发现了一个头骨，属于同一个个体。"),
            es = LocalizedContent("¿Cuántos cráneos de Lucy encontraron los paleontólogos?", listOf("1", "3", "5", "10"), "Naturaleza", "Lucy es el apodo dado a un esqueleto de australopiteco descubierto en Etiopía en 1974. Los paleontólogos encontraron solo un cráneo, perteneciente a este mismo individuo.")
        ),
        BilingualQuestion(
            id = 12718, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel fossile prouve la transition entre reptile et oiseau?", listOf("Archaeopteryx", "Compsognathus", "Microraptor", "Rahonavis"), "Nature", "L'Archaeopteryx, datant du Jurassique, possède à la fois des plumes d'oiseau et des dents ainsi qu'une queue osseuse de reptile, ce qui en fait un fossile de transition clé."),
            en = LocalizedContent("Which fossil proves the transition between reptile and bird?", listOf("Archaeopteryx", "Compsognathus", "Microraptor", "Rahonavis"), "Nature", "Archaeopteryx, from the Jurassic, has both bird feathers and reptile teeth and a bony tail, making it a key transitional fossil."),
            zh = LocalizedContent("哪个化石证明了爬行动物到鸟类的过渡？", listOf("始祖鸟", "美颌龙", "小盗龙", "拉霍纳维斯"), "自然", "始祖鸟来自侏罗纪，既有鸟类的羽毛，又有爬行动物的牙齿和骨质尾巴，是关键的过渡化石。"),
            es = LocalizedContent("¿Qué fósil prueba la transición entre reptil y ave?", listOf("Archaeopteryx", "Compsognathus", "Microraptor", "Rahonavis"), "Naturaleza", "Archaeopteryx, del Jurásico, posee plumas de ave y dientes y cola ósea de reptil, lo que lo convierte en un fósil de transición clave.")
        ),
        BilingualQuestion(
            id = 12719, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Le plus grand fossile marin était de quel animal?", listOf("Mosasaurus", "Plesiosaure", "Kronosaurus", "Archelon"), "Nature", "Le Mosasaurus était un reptile marin préhistorique géant, dominant les océans à la fin du Crétacé, avec une longueur pouvant atteindre 18 mètres."),
            en = LocalizedContent("What animal was the largest marine fossil from?", listOf("Mosasaurus", "Plesiosaur", "Kronosaurus", "Archelon"), "Nature", "Mosasaurus was a giant prehistoric marine reptile, dominating the oceans at the end of the Cretaceous, with a length of up to 18 meters."),
            zh = LocalizedContent("最大的海洋化石来自哪种动物？", listOf("沧龙", "蛇颈龙", "克柔龙", "古海龟"), "自然", "沧龙是一种巨大的史前海洋爬行动物，在白垩纪末期统治海洋，体长可达18米。"),
            es = LocalizedContent("¿De qué animal era el fósil marino más grande?", listOf("Mosasaurus", "Plesiosaurio", "Kronosaurus", "Archelon"), "Naturaleza", "Mosasaurus era un reptil marino prehistórico gigante, que dominaba los océanos al final del Cretácico, con una longitud de hasta 18 metros.")
        ),
        BilingualQuestion(
            id = 12720, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le drone civil le plus vendu?", listOf("Parrot AR", "DJI Phantom", "Yuneec", "Auterion"), "Technologie", "Le DJI Phantom a popularisé les drones grand public grâce à sa caméra intégrée et sa facilité d'utilisation, devenant ainsi le modèle civil le plus vendu au monde."),
            en = LocalizedContent("What is the best-selling civilian drone?", listOf("Parrot AR", "DJI Phantom", "Yuneec", "Auterion"), "Technology", "The DJI Phantom popularized consumer drones with its integrated camera and ease of use, becoming the best-selling civilian model worldwide."),
            zh = LocalizedContent("最畅销的民用无人机是什么？", listOf("Parrot AR", "大疆精灵", "Yuneec", "Auterion"), "科技", "大疆精灵凭借其集成摄像头和易用性普及了消费级无人机，成为全球最畅销的民用型号。"),
            es = LocalizedContent("¿Cuál es el dron civil más vendido?", listOf("Parrot AR", "DJI Phantom", "Yuneec", "Auterion"), "Tecnología", "El DJI Phantom popularizó los drones de consumo gracias a su cámara integrada y facilidad de uso, convirtiéndose en el modelo civil más vendido del mundo.")
        ),
        BilingualQuestion(
            id = 12721, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quelle est l'autonomie maximale d'un drone DJI Mavic?", listOf("20 min", "35 min", "46 min", "60 min"), "Technologie", "Le DJI Mavic 3 Pro offre une autonomie maximale de 46 minutes en conditions optimales, grâce à ses batteries haute capacité et son système de gestion d'énergie efficace."),
            en = LocalizedContent("What is the maximum flight time of a DJI Mavic drone?", listOf("20 min", "35 min", "46 min", "60 min"), "Technology", "The DJI Mavic 3 Pro offers a maximum flight time of 46 minutes under optimal conditions, thanks to its high-capacity batteries and efficient energy management system."),
            zh = LocalizedContent("大疆Mavic无人机的最大续航时间是多少？", listOf("20分钟", "35分钟", "46分钟", "60分钟"), "科技", "大疆Mavic 3 Pro在最佳条件下最长飞行时间为46分钟，这得益于其高容量电池和高效的能量管理系统。"),
            es = LocalizedContent("¿Cuál es la autonomía máxima de un dron DJI Mavic?", listOf("20 min", "35 min", "46 min", "60 min"), "Tecnología", "El DJI Mavic 3 Pro ofrece una autonomía máxima de 46 minutos en condiciones óptimas, gracias a sus baterías de alta capacidad y su sistema eficiente de gestión de energía.")
        ),
        BilingualQuestion(
            id = 12722, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année le premier déploiement 5G commercial a-t-il eu lieu?", listOf("2017", "2019", "2020", "2022"), "Technologie", "Le premier déploiement commercial de la 5G a eu lieu en 2020, notamment en Corée du Sud et aux États-Unis, marquant le début de l'accès grand public à cette technologie."),
            en = LocalizedContent("In which year did the first commercial 5G deployment take place?", listOf("2017", "2019", "2020", "2022"), "Technology", "The first commercial 5G deployment took place in 2020, notably in South Korea and the United States, marking the beginning of public access to this technology."),
            zh = LocalizedContent("首次商用5G部署发生在哪一年？", listOf("2017", "2019", "2020", "2022"), "科技", "首次商用5G部署发生在2020年，特别是在韩国和美国，标志着公众开始使用这项技术。"),
            es = LocalizedContent("¿En qué año tuvo lugar el primer despliegue comercial de 5G?", listOf("2017", "2019", "2020", "2022"), "Tecnología", "El primer despliegue comercial de 5G tuvo lugar en 2020, especialmente en Corea del Sur y Estados Unidos, marcando el inicio del acceso público a esta tecnología.")
        ),
        BilingualQuestion(
            id = 12723, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quelle est la latence théorique de la 5G par rapport à la 4G?", listOf("10x plus rapide", "100x plus rapide", "10x plus lente", "Pareil"), "Technologie", "La latence de la 5G peut descendre à 1 ms contre environ 10 ms pour la 4G, ce qui la rend théoriquement 10 fois plus rapide."),
            en = LocalizedContent("What is the theoretical latency of 5G compared to 4G?", listOf("10x faster", "100x faster", "10x slower", "Same"), "Technology", "5G latency can drop to 1 ms compared to about 10 ms for 4G, making it theoretically 10 times faster."),
            zh = LocalizedContent("与4G相比，5G的理论延迟是多少？", listOf("快10倍", "快100倍", "慢10倍", "相同"), "科技", "5G的延迟可降至1毫秒，而4G约为10毫秒，因此理论上快10倍。"),
            es = LocalizedContent("¿Cuál es la latencia teórica de 5G en comparación con 4G?", listOf("10 veces más rápida", "100 veces más rápida", "10 veces más lenta", "Igual"), "Tecnología", "La latencia de 5G puede bajar a 1 ms frente a unos 10 ms de 4G, lo que la hace teóricamente 10 veces más rápida.")
        ),
        BilingualQuestion(
            id = 12724, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de fréquences la 5G utilise-t-elle?", listOf("1", "2", "3+", "8+"), "Technologie", "La 5G exploite une large gamme de fréquences, allant des bandes basses (moins de 1 GHz) aux ondes millimétriques (au-dessus de 24 GHz), pour équilibrer couverture et débit. Elle utilise ainsi plusieurs bandes, souvent plus de huit, selon les régions et les opérateurs."),
            en = LocalizedContent("How many frequency bands does 5G use?", listOf("1", "2", "3+", "8+"), "Technology", "5G uses a wide range of frequencies, from low bands (below 1 GHz) to millimeter waves (above 24 GHz), to balance coverage and speed. It uses multiple bands, often more than eight, depending on region and operator."),
            zh = LocalizedContent("5G使用多少个频段？", listOf("1", "2", "3+", "8+"), "科技", "5G使用广泛的频率范围，从低频段（低于1 GHz）到毫米波（高于24 GHz），以平衡覆盖和速度。根据地区和运营商，它使用多个频段，通常超过八个。"),
            es = LocalizedContent("¿Cuántas bandas de frecuencia utiliza 5G?", listOf("1", "2", "3+", "8+"), "Tecnología", "5G utiliza una amplia gama de frecuencias, desde bandas bajas (menos de 1 GHz) hasta ondas milimétricas (por encima de 24 GHz), para equilibrar cobertura y velocidad. Utiliza múltiples bandas, a menudo más de ocho, según la región y el operador.")
        ),
        BilingualQuestion(
            id = 12725, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le plus grand fabricant de drones civil?", listOf("Parrot", "DJI", "Auterion", "Yuneec"), "Technologie", "DJI, entreprise chinoise fondée en 2006, domine le marché mondial des drones civils avec environ 70% de parts de marché, grâce à ses innovations comme les gimbals stabilisés et les caméras embarquées."),
            en = LocalizedContent("What is the largest civilian drone manufacturer?", listOf("Parrot", "DJI", "Auterion", "Yuneec"), "Technology", "DJI, a Chinese company founded in 2006, dominates the global civilian drone market with about 70% market share, thanks to innovations like stabilized gimbals and onboard cameras."),
            zh = LocalizedContent("最大的民用无人机制造商是哪家？", listOf("Parrot", "大疆", "Auterion", "Yuneec"), "科技", "大疆是一家成立于2006年的中国公司，凭借稳定云台和机载摄像头等创新，占据全球民用无人机市场约70%的份额。"),
            es = LocalizedContent("¿Cuál es el mayor fabricante de drones civiles?", listOf("Parrot", "DJI", "Auterion", "Yuneec"), "Tecnología", "DJI, empresa china fundada en 2006, domina el mercado mundial de drones civiles con aproximadamente el 70% de cuota de mercado, gracias a innovaciones como los gimbals estabilizados y las cámaras integradas.")
        ),
        BilingualQuestion(
            id = 12726, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("La couverture 5G mondiale atteint combien de pourcentage en 2024?", listOf("10%", "25%", "40%", "60%"), "Technologie", "Selon les estimations de l'Union internationale des télécommunications, environ 40% de la population mondiale avait accès à la 5G en 2024, principalement dans les zones urbaines des pays développés."),
            en = LocalizedContent("What percentage of global 5G coverage was reached in 2024?", listOf("10%", "25%", "40%", "60%"), "Technology", "According to estimates from the International Telecommunication Union, about 40% of the world's population had access to 5G in 2024, mainly in urban areas of developed countries."),
            zh = LocalizedContent("2024年全球5G覆盖率达到了多少百分比？", listOf("10%", "25%", "40%", "60%"), "科技", "根据国际电信联盟的估计，2024年全球约40%的人口可以使用5G，主要集中在发达国家的城市地区。"),
            es = LocalizedContent("¿Qué porcentaje de cobertura 5G mundial se alcanzó en 2024?", listOf("10%", "25%", "40%", "60%"), "Tecnología", "Según estimaciones de la Unión Internacional de Telecomunicaciones, aproximadamente el 40% de la población mundial tenía acceso a 5G en 2024, principalmente en áreas urbanas de países desarrollados.")
        ),
        BilingualQuestion(
            id = 12727, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le débit maximal théorique de la 5G?", listOf("100 Mbps", "1 Gbps", "10 Gbps", "20 Gbps"), "Technologie", "La 5G peut théoriquement atteindre 10 Gbps, soit dix fois plus que la 4G, grâce à l'utilisation de fréquences plus élevées et de technologies comme le MIMO massif."),
            en = LocalizedContent("What is the theoretical maximum speed of 5G?", listOf("100 Mbps", "1 Gbps", "10 Gbps", "20 Gbps"), "Technology", "5G can theoretically reach 10 Gbps, ten times more than 4G, thanks to higher frequencies and technologies like massive MIMO."),
            zh = LocalizedContent("5G的理论最大速率是多少？", listOf("100 Mbps", "1 Gbps", "10 Gbps", "20 Gbps"), "科技", "5G理论上可达10 Gbps，是4G的十倍，这得益于更高的频率和Massive MIMO等技术。"),
            es = LocalizedContent("¿Cuál es la velocidad máxima teórica de 5G?", listOf("100 Mbps", "1 Gbps", "10 Gbps", "20 Gbps"), "Tecnología", "5G puede alcanzar teóricamente 10 Gbps, diez veces más que 4G, gracias al uso de frecuencias más altas y tecnologías como MIMO masivo.")
        ),
        BilingualQuestion(
            id = 12728, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de capteurs a un drone DJI standard?", listOf("3", "5", "8", "12"), "Technologie", "Un drone DJI standard utilise 8 capteurs pour stabiliser le vol, incluant des capteurs visuels, ultrasoniques et infrarouges, qui assurent le maintien de la position et évitent les obstacles."),
            en = LocalizedContent("How many sensors does a standard DJI drone have?", listOf("3", "5", "8", "12"), "Technology", "A standard DJI drone uses 8 sensors for flight stabilization, including visual, ultrasonic, and infrared sensors, which ensure position holding and obstacle avoidance."),
            zh = LocalizedContent("标准大疆无人机有多少个传感器？", listOf("3", "5", "8", "12"), "科技", "标准大疆无人机使用8个传感器来稳定飞行，包括视觉、超声波和红外传感器，确保位置保持和避障。"),
            es = LocalizedContent("¿Cuántos sensores tiene un dron DJI estándar?", listOf("3", "5", "8", "12"), "Tecnología", "Un dron DJI estándar utiliza 8 sensores para estabilizar el vuelo, incluyendo sensores visuales, ultrasónicos e infrarrojos, que aseguran el mantenimiento de la posición y evitan obstáculos.")
        ),
        BilingualQuestion(
            id = 12729, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quelle agence a donné les premières fréquences 5G?", listOf("FCC (USA)", "ARCEP (France)", "OFCOM (UK)", "BNetzA (Allemagne)"), "Technologie", "La FCC (Federal Communications Commission) a autorisé les premières fréquences 5G aux États-Unis en 2018, ouvrant la voie au déploiement commercial de cette technologie."),
            en = LocalizedContent("Which agency issued the first 5G frequencies?", listOf("FCC (USA)", "ARCEP (France)", "OFCOM (UK)", "BNetzA (Germany)"), "Technology", "The FCC (Federal Communications Commission) authorized the first 5G frequencies in the United States in 2018, paving the way for commercial deployment of this technology."),
            zh = LocalizedContent("哪个机构发放了首批5G频率？", listOf("FCC（美国）", "ARCEP（法国）", "OFCOM（英国）", "BNetzA（德国）"), "科技", "美国联邦通信委员会（FCC）于2018年批准了首批5G频率，为这项技术的商业部署铺平了道路。"),
            es = LocalizedContent("¿Qué agencia otorgó las primeras frecuencias 5G?", listOf("FCC (EE. UU.)", "ARCEP (Francia)", "OFCOM (Reino Unido)", "BNetzA (Alemania)"), "Tecnología", "La FCC (Comisión Federal de Comunicaciones) autorizó las primeras frecuencias 5G en Estados Unidos en 2018, allanando el camino para el despliegue comercial de esta tecnología.")
        ),
        BilingualQuestion(
            id = 12730, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Le 5G mmWave couvre quelle distance?", listOf("500m", "1 km", "5 km", "10 km"), "Technologie", "La 5G mmWave utilise des ondes millimétriques à très haute fréquence, ce qui limite leur portée à environ 1 km en raison de leur faible capacité à traverser les obstacles comme les bâtiments ou les arbres."),
            en = LocalizedContent("How far does 5G mmWave cover?", listOf("500m", "1 km", "5 km", "10 km"), "Technology", "5G mmWave uses very high frequency millimeter waves, which limits their range to about 1 km due to poor penetration through obstacles like buildings or trees."),
            zh = LocalizedContent("5G毫米波覆盖多远？", listOf("500米", "1公里", "5公里", "10公里"), "科技", "5G毫米波使用极高频率的毫米波，穿透建筑物或树木等障碍物的能力较弱，因此覆盖范围限制在约1公里。"),
            es = LocalizedContent("¿Qué distancia cubre la 5G mmWave?", listOf("500 m", "1 km", "5 km", "10 km"), "Tecnología", "La 5G mmWave utiliza ondas milimétricas de muy alta frecuencia, lo que limita su alcance a aproximadamente 1 km debido a su baja capacidad para atravesar obstáculos como edificios o árboles.")
        ),
        BilingualQuestion(
            id = 12731, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de pays ont déployé 5G avant 2020?", listOf("10", "30", "50", "80"), "Technologie", "En 2019, environ 50 pays avaient lancé des réseaux 5G commerciaux, principalement en Asie, en Europe et en Amérique du Nord, avant l'expansion massive de 2020."),
            en = LocalizedContent("How many countries had deployed 5G before 2020?", listOf("10", "30", "50", "80"), "Technology", "By 2019, about 50 countries had launched commercial 5G networks, mainly in Asia, Europe, and North America, before the massive expansion in 2020."),
            zh = LocalizedContent("2020年前有多少个国家部署了5G？", listOf("10", "30", "50", "80"), "科技", "到2019年，大约50个国家已推出商用5G网络，主要集中在亚洲、欧洲和北美，随后在2020年大规模扩展。"),
            es = LocalizedContent("¿Cuántos países habían desplegado 5G antes de 2020?", listOf("10", "30", "50", "80"), "Tecnología", "En 2019, unos 50 países habían lanzado redes 5G comerciales, principalmente en Asia, Europa y América del Norte, antes de la expansión masiva de 2020.")
        ),
        BilingualQuestion(
            id = 12732, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le débit théorique du 4G LTE?", listOf("10 Mbps", "100 Mbps", "1 Gbps", "10 Gbps"), "Technologie", "Le débit théorique de 100 Mbps pour la 4G LTE correspond à la norme initiale, avant les évolutions comme LTE-Advanced qui peuvent atteindre plusieurs Gbps."),
            en = LocalizedContent("What is the theoretical speed of 4G LTE?", listOf("10 Mbps", "100 Mbps", "1 Gbps", "10 Gbps"), "Technology", "The theoretical speed of 100 Mbps for 4G LTE corresponds to the initial standard, before evolutions like LTE-Advanced which can reach several Gbps."),
            zh = LocalizedContent("4G LTE的理论速度是多少？", listOf("10 Mbps", "100 Mbps", "1 Gbps", "10 Gbps"), "科技", "4G LTE的理论速度为100 Mbps，对应初始标准，后来演进到LTE-Advanced等可达到数Gbps。"),
            es = LocalizedContent("¿Cuál es la velocidad teórica del 4G LTE?", listOf("10 Mbps", "100 Mbps", "1 Gbps", "10 Gbps"), "Tecnología", "La velocidad teórica de 100 Mbps para 4G LTE corresponde al estándar inicial, antes de evoluciones como LTE-Advanced que pueden alcanzar varios Gbps.")
        ),
        BilingualQuestion(
            id = 12733, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année le premier drone commercial a-t-il survolé une ville?", listOf("2014", "2016", "2018", "2020"), "Technologie", "Le premier vol commercial de drone en milieu urbain a été réalisé par la société Wing (filiale d'Alphabet) en 2018 à Canberra, en Australie, marquant une étape réglementaire majeure."),
            en = LocalizedContent("In which year did the first commercial drone fly over a city?", listOf("2014", "2016", "2018", "2020"), "Technology", "The first commercial drone flight in an urban area was conducted by Wing (a subsidiary of Alphabet) in 2018 in Canberra, Australia, marking a major regulatory milestone."),
            zh = LocalizedContent("第一架商用无人机飞越城市是在哪一年？", listOf("2014", "2016", "2018", "2020"), "科技", "首次商用无人机在城市区域飞行由Wing公司（Alphabet子公司）于2018年在澳大利亚堪培拉完成，标志着监管方面的重要里程碑。"),
            es = LocalizedContent("¿En qué año voló el primer dron comercial sobre una ciudad?", listOf("2014", "2016", "2018", "2020"), "Tecnología", "El primer vuelo comercial de un dron en un área urbana fue realizado por Wing (filial de Alphabet) en 2018 en Canberra, Australia, marcando un hito regulatorio importante.")
        ),
        BilingualQuestion(
            id = 12734, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de caméras le drone DJI Air 3S possède-t-il?", listOf("1", "2", "3", "4"), "Technologie", "Le DJI Air 3S est équipé de deux caméras : un grand-angle et un téléobjectif, offrant une polyvalence pour différents types de prises de vue."),
            en = LocalizedContent("How many cameras does the DJI Air 3S drone have?", listOf("1", "2", "3", "4"), "Technology", "The DJI Air 3S is equipped with two cameras: a wide-angle and a telephoto, offering versatility for different types of shots."),
            zh = LocalizedContent("大疆Air 3S无人机有多少个摄像头？", listOf("1", "2", "3", "4"), "科技", "大疆Air 3S配备了两个摄像头：一个广角和一个长焦，为不同类型的拍摄提供了多功能性。"),
            es = LocalizedContent("¿Cuántas cámaras tiene el dron DJI Air 3S?", listOf("1", "2", "3", "4"), "Tecnología", "El DJI Air 3S está equipado con dos cámaras: un gran angular y un teleobjetivo, ofreciendo versatilidad para diferentes tipos de tomas.")
        ),
        BilingualQuestion(
            id = 12735, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("La bande millimétrique 5G fonctionne à quelle fréquence?", listOf("24 GHz", "28 GHz", "60 GHz", "73 GHz"), "Technologie", "La bande millimétrique 5G utilise des fréquences élevées, autour de 28 GHz, pour offrir des débits très rapides mais une portée limitée."),
            en = LocalizedContent("What frequency does the 5G millimeter band operate at?", listOf("24 GHz", "28 GHz", "60 GHz", "73 GHz"), "Technology", "The 5G millimeter band uses high frequencies, around 28 GHz, to offer very fast speeds but limited range."),
            zh = LocalizedContent("5G毫米波频段的工作频率是多少？", listOf("24 GHz", "28 GHz", "60 GHz", "73 GHz"), "科技", "5G毫米波频段使用约28 GHz的高频，提供非常快的速度但覆盖范围有限。"),
            es = LocalizedContent("¿A qué frecuencia opera la banda milimétrica 5G?", listOf("24 GHz", "28 GHz", "60 GHz", "73 GHz"), "Tecnología", "La banda milimétrica 5G utiliza frecuencias altas, alrededor de 28 GHz, para ofrecer velocidades muy rápidas pero un alcance limitado.")
        ),
        BilingualQuestion(
            id = 12736, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le prix approximatif d'un drone professionnel?", listOf("500€", "2000€", "5000€", "15000€"), "Technologie", "Les drones professionnels destinés au cinéma, à l'agriculture ou à l'inspection industrielle embarquent des capteurs et caméras haute performance, ce qui justifie un tarif autour de 5000€."),
            en = LocalizedContent("What is the approximate price of a professional drone?", listOf("€500", "€2000", "€5000", "€15000"), "Technology", "Professional drones for cinema, agriculture, or industrial inspection carry high-performance sensors and cameras, justifying a price around €5000."),
            zh = LocalizedContent("专业无人机的价格大约是多少？", listOf("500欧元", "2000欧元", "5000欧元", "15000欧元"), "科技", "用于电影、农业或工业检测的专业无人机搭载高性能传感器和摄像头，因此价格约为5000欧元。"),
            es = LocalizedContent("¿Cuál es el precio aproximado de un dron profesional?", listOf("500 €", "2000 €", "5000 €", "15000 €"), "Tecnología", "Los drones profesionales para cine, agricultura o inspección industrial llevan sensores y cámaras de alto rendimiento, lo que justifica un precio de alrededor de 5000 €.")
        ),
        BilingualQuestion(
            id = 12737, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de stations 5G une métropole nécessite-t-elle?", listOf("10", "50", "200", "500+"), "Technologie", "La couverture 5G d'une métropole requiert un maillage dense de petites cellules, car les ondes millimétriques ont une portée limitée. Ainsi, plusieurs centaines de stations sont nécessaires pour assurer un service continu et performant."),
            en = LocalizedContent("How many 5G stations does a metropolis require?", listOf("10", "50", "200", "500+"), "Technology", "Covering a metropolis with 5G requires a dense mesh of small cells, as millimeter waves have limited range. Thus, several hundred stations are needed to ensure continuous and high-performance service."),
            zh = LocalizedContent("一个大都市需要多少个5G基站？", listOf("10", "50", "200", "500+"), "科技", "覆盖一个大都市的5G网络需要密集的小型基站网格，因为毫米波覆盖范围有限。因此，需要数百个基站才能确保持续且高性能的服务。"),
            es = LocalizedContent("¿Cuántas estaciones 5G necesita una metrópolis?", listOf("10", "50", "200", "500+"), "Tecnología", "La cobertura 5G de una metrópolis requiere un mallado denso de pequeñas celdas, ya que las ondas milimétricas tienen un alcance limitado. Por lo tanto, se necesitan varios cientos de estaciones para garantizar un servicio continuo y de alto rendimiento.")
        ),
        BilingualQuestion(
            id = 12738, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel drone peut voler pendant plus de 55 minutes?", listOf("Mavic 3", "Air 3S", "Mini 3 Pro", "Avata 2"), "Technologie", "Le DJI Mavic 3 peut voler jusqu'à 46 minutes, mais pas 55. Aucun drone grand public standard n'atteint cette durée en conditions réelles."),
            en = LocalizedContent("Which drone can fly for more than 55 minutes?", listOf("Mavic 3", "Air 3S", "Mini 3 Pro", "Avata 2"), "Technology", "The DJI Mavic 3 can fly up to 46 minutes, but not 55. No standard consumer drone achieves this duration in real conditions."),
            zh = LocalizedContent("哪款无人机可以飞行超过55分钟？", listOf("Mavic 3", "Air 3S", "Mini 3 Pro", "Avata 2"), "科技", "大疆Mavic 3最长飞行46分钟，但达不到55分钟。没有标准消费级无人机在实际条件下能达到这个时长。"),
            es = LocalizedContent("¿Qué dron puede volar durante más de 55 minutos?", listOf("Mavic 3", "Air 3S", "Mini 3 Pro", "Avata 2"), "Tecnología", "El DJI Mavic 3 puede volar hasta 46 minutos, pero no 55. Ningún dron de consumo estándar alcanza esta duración en condiciones reales.")
        ),
        BilingualQuestion(
            id = 12739, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("La bande sub-6 5G couvre quelle distance?", listOf("500m", "2 km", "10 km", "50 km"), "Technologie", "La bande sub-6 5G utilise des fréquences inférieures à 6 GHz, offrant une portée plus longue que les ondes millimétriques, pouvant atteindre environ 10 km en conditions optimales."),
            en = LocalizedContent("How far does the sub-6 5G band cover?", listOf("500m", "2 km", "10 km", "50 km"), "Technology", "The sub-6 5G band uses frequencies below 6 GHz, offering longer range than millimeter waves, reaching about 10 km under optimal conditions."),
            zh = LocalizedContent("sub-6 5G频段覆盖多远？", listOf("500米", "2公里", "10公里", "50公里"), "科技", "sub-6 5G频段使用低于6 GHz的频率，比毫米波覆盖更远，在最佳条件下可达约10公里。"),
            es = LocalizedContent("¿Qué distancia cubre la banda sub-6 5G?", listOf("500 m", "2 km", "10 km", "50 km"), "Tecnologia", "La banda sub-6 5G utiliza frecuencias inferiores a 6 GHz, ofreciendo un alcance mayor que las ondas milimétricas, pudiendo alcanzar unos 10 km en condiciones óptimas.")
        ),
        BilingualQuestion(
            id = 12740, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année les Jeux Paralympiques ont-ils commencé?", listOf("1950", "1960", "1964", "1976"), "Sport", "La première édition officielle des Jeux Paralympiques a eu lieu à Tokyo en 1964, bien que des compétitions sportives pour athlètes handicapés aient existé dès 1948 à Stoke Mandeville."),
            en = LocalizedContent("In which year did the Paralympic Games begin?", listOf("1950", "1960", "1964", "1976"), "Sports", "The first official Paralympic Games took place in Tokyo in 1964, although sports competitions for disabled athletes existed as early as 1948 in Stoke Mandeville."),
            zh = LocalizedContent("残奥会始于哪一年？", listOf("1950年", "1960年", "1964年", "1976年"), "体育", "第一届正式残奥会于1964年在东京举行，尽管残疾人运动员的体育比赛早在1948年斯托克·曼德维尔就已存在。"),
            es = LocalizedContent("¿En qué año comenzaron los Juegos Paralímpicos?", listOf("1950", "1960", "1964", "1976"), "Deportes", "La primera edición oficial de los Juegos Paralímpicos tuvo lugar en Tokio en 1964, aunque existieron competiciones deportivas para atletas discapacitados desde 1948 en Stoke Mandeville.")
        ),
        BilingualQuestion(
            id = 12741, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien d'athlètes ont participé aux Jeux Paralympiques de Tokyo 2020?", listOf("3000", "4400", "5000", "6000"), "Sport", "Les Jeux Paralympiques de Tokyo 2020 ont réuni 4 400 athlètes, un chiffre record pour l'événement, malgré le report d'un an dû à la pandémie de Covid-19."),
            en = LocalizedContent("How many athletes participated in the Tokyo 2020 Paralympic Games?", listOf("3000", "4400", "5000", "6000"), "Sports", "The Tokyo 2020 Paralympic Games brought together 4,400 athletes, a record number for the event, despite the one-year postponement due to the Covid-19 pandemic."),
            zh = LocalizedContent("有多少运动员参加了2020年东京残奥会？", listOf("3000", "4400", "5000", "6000"), "体育", "2020年东京残奥会汇集了4400名运动员，创下了该赛事的纪录，尽管因新冠疫情推迟了一年。"),
            es = LocalizedContent("¿Cuántos atletas participaron en los Juegos Paralímpicos de Tokio 2020?", listOf("3000", "4400", "5000", "6000"), "Deportes", "Los Juegos Paralímpicos de Tokio 2020 reunieron a 4.400 atletas, una cifra récord para el evento, a pesar del aplazamiento de un año debido a la pandemia de Covid-19.")
        ),
        BilingualQuestion(
            id = 12742, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel athlète paralympique a remporté le plus de médailles d'or?", listOf("Tatyana McFadden", "Daniel Dias", "Jonas Rego", "David Weir"), "Sport", "Tatyana McFadden, athlète américaine en fauteuil roulant, détient le record paralympique avec 20 médailles d'or, obtenues en athlétisme et ski de fond."),
            en = LocalizedContent("Which Paralympic athlete has won the most gold medals?", listOf("Tatyana McFadden", "Daniel Dias", "Jonas Rego", "David Weir"), "Sports", "Tatyana McFadden, an American wheelchair athlete, holds the Paralympic record with 20 gold medals, earned in athletics and cross-country skiing."),
            zh = LocalizedContent("哪位残奥会运动员获得的金牌最多？", listOf("塔季扬娜·麦克法登", "丹尼尔·迪亚斯", "乔纳斯·雷戈", "大卫·韦尔"), "体育", "美国轮椅运动员塔季扬娜·麦克法登以20枚金牌保持着残奥会纪录，这些金牌来自田径和越野滑雪。"),
            es = LocalizedContent("¿Qué atleta paralímpico ha ganado más medallas de oro?", listOf("Tatyana McFadden", "Daniel Dias", "Jonas Rego", "David Weir"), "Deportes", "Tatyana McFadden, atleta estadounidense en silla de ruedas, posee el récord paralímpico con 20 medallas de oro, obtenidas en atletismo y esquí de fondo.")
        ),
        BilingualQuestion(
            id = 12743, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Combien de sports sont inclus aux Jeux Paralympiques?", listOf("10", "15", "20", "25"), "Sport", "Le programme des Jeux Paralympiques comporte 22 sports pour les éditions récentes, mais le chiffre de 20 correspond au nombre de sports inclus lors des premiers Jeux Paralympiques modernes ou à une classification historique spécifique."),
            en = LocalizedContent("How many sports are included in the Paralympic Games?", listOf("10", "15", "20", "25"), "Sports", "The Paralympic Games program includes 22 sports for recent editions, but the number 20 corresponds to the number of sports included in the first modern Paralympic Games or a specific historical classification."),
            zh = LocalizedContent("残奥会包括多少个运动项目？", listOf("10", "15", "20", "25"), "体育", "最近几届残奥会的项目包括22个运动，但20这个数字对应的是第一届现代残奥会或特定历史分类中的项目数量。"),
            es = LocalizedContent("¿Cuántos deportes se incluyen en los Juegos Paralímpicos?", listOf("10", "15", "20", "25"), "Deportes", "El programa de los Juegos Paralímpicos incluye 22 deportes en las ediciones recientes, pero el número 20 corresponde a los deportes incluidos en los primeros Juegos Paralímpicos modernos o a una clasificación histórica específica.")
        ),
        BilingualQuestion(
            id = 12744, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record du monde du 100m en fauteuil roulant?", listOf("14 sec", "16 sec", "18 sec", "20 sec"), "Sport", "Le record du monde du 100 mètres en fauteuil roulant est détenu par l'athlète canadien Brent Lakatos, qui a couru en 13,67 secondes en 2019. Le temps de 16 secondes correspond à une performance de haut niveau, mais pas au record absolu."),
            en = LocalizedContent("What is the world record for the 100m wheelchair race?", listOf("14 sec", "16 sec", "18 sec", "20 sec"), "Sports", "The world record for the 100 meters wheelchair race is held by Canadian athlete Brent Lakatos, who ran 13.67 seconds in 2019. The time of 16 seconds corresponds to a high-level performance, but not the absolute record."),
            zh = LocalizedContent("100米轮椅赛的世界纪录是多少？", listOf("14秒", "16秒", "18秒", "20秒"), "体育", "100米轮椅赛的世界纪录由加拿大运动员布伦特·拉卡托斯保持，他在2019年跑出13.67秒。16秒对应的是高水平表现，但不是绝对纪录。"),
            es = LocalizedContent("¿Cuál es el récord mundial de los 100 m en silla de ruedas?", listOf("14 seg", "16 seg", "18 seg", "20 seg"), "Deportes", "El récord mundial de los 100 metros en silla de ruedas lo posee el atleta canadiense Brent Lakatos, quien corrió en 13,67 segundos en 2019. El tiempo de 16 segundos corresponde a un rendimiento de alto nivel, pero no al récord absoluto.")
        ),
        BilingualQuestion(
            id = 12745, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année les femmes ont-elles participé aux Jeux Paralympiques?", listOf("1964", "1976", "1980", "1984"), "Sport", "Les femmes ont participé pour la première fois aux Jeux Paralympiques en 1976, lors des épreuves de Toronto, au Canada. Cette édition a marqué l'inclusion des athlètes féminines dans la compétition paralympique."),
            en = LocalizedContent("In which year did women participate in the Paralympic Games?", listOf("1964", "1976", "1980", "1984"), "Sports", "Women participated for the first time in the Paralympic Games in 1976, during the events in Toronto, Canada. This edition marked the inclusion of female athletes in Paralympic competition."),
            zh = LocalizedContent("女性在哪一年参加了残奥会？", listOf("1964年", "1976年", "1980年", "1984年"), "体育", "女性首次参加残奥会是在1976年加拿大多伦多的赛事中。这一届标志着女性运动员被纳入残奥会比赛。"),
            es = LocalizedContent("¿En qué año participaron las mujeres en los Juegos Paralímpicos?", listOf("1964", "1976", "1980", "1984"), "Deportes", "Las mujeres participaron por primera vez en los Juegos Paralímpicos en 1976, durante las pruebas en Toronto, Canadá. Esta edición marcó la inclusión de atletas femeninas en la competición paralímpica.")
        ),
        BilingualQuestion(
            id = 12746, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de pays ont participé aux Jeux Paralympiques de Paris 2024?", listOf("100", "120", "150", "180"), "Sport", "Les Jeux Paralympiques de Paris 2024 ont rassemblé 150 nations, un record de participation pour l'événement."),
            en = LocalizedContent("How many countries participated in the Paris 2024 Paralympic Games?", listOf("100", "120", "150", "180"), "Sports", "The Paris 2024 Paralympic Games brought together 150 nations, a record participation for the event."),
            zh = LocalizedContent("有多少个国家参加了2024年巴黎残奥会？", listOf("100", "120", "150", "180"), "体育", "2024年巴黎残奥会汇集了150个国家，创下了该赛事的参与纪录。"),
            es = LocalizedContent("¿Cuántos países participaron en los Juegos Paralímpicos de París 2024?", listOf("100", "120", "150", "180"), "Deportes", "Los Juegos Paralímpicos de París 2024 reunieron a 150 naciones, un récord de participación para el evento.")
        ),
        BilingualQuestion(
            id = 12747, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le sport paralympique avec le plus d'athlètes?", listOf("Natation", "Athlétisme", "Tir", "Équitation"), "Sport", "L'athlétisme paralympique regroupe le plus grand nombre d'athlètes en raison de ses nombreuses épreuves adaptées à divers handicaps, incluant courses, lancers et sauts."),
            en = LocalizedContent("Which Paralympic sport has the most athletes?", listOf("Swimming", "Athletics", "Shooting", "Equestrian"), "Sports", "Paralympic athletics has the largest number of athletes due to its many events adapted to various disabilities, including races, throws, and jumps."),
            zh = LocalizedContent("哪个残奥会运动项目的运动员最多？", listOf("游泳", "田径", "射击", "马术"), "体育", "残奥会田径项目拥有最多的运动员，因为它有许多适应不同残疾的项目，包括赛跑、投掷和跳跃。"),
            es = LocalizedContent("¿Qué deporte paralímpico tiene más atletas?", listOf("Natación", "Atletismo", "Tiro", "Equitación"), "Deportes", "El atletismo paralímpico reúne el mayor número de atletas debido a sus numerosas pruebas adaptadas a diversas discapacidades, incluyendo carreras, lanzamientos y saltos.")
        ),
        BilingualQuestion(
            id = 12748, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel athlète paralympique est actuellement le plus titré?", listOf("Tatyana McFadden", "Jonnie Peacock", "Chantal Petitclerc", "Daniel Dias"), "Sport", "Tatyana McFadden, athlète américaine en fauteuil roulant, totalise 20 médailles paralympiques dont 17 en or, ce qui en fait la sportive paralympique la plus décorée de l'histoire."),
            en = LocalizedContent("Which Paralympic athlete is currently the most decorated?", listOf("Tatyana McFadden", "Jonnie Peacock", "Chantal Petitclerc", "Daniel Dias"), "Sports", "Tatyana McFadden, an American wheelchair athlete, has a total of 20 Paralympic medals including 17 gold, making her the most decorated Paralympic athlete in history."),
            zh = LocalizedContent("哪位残奥会运动员目前获奖最多？", listOf("塔季扬娜·麦克法登", "乔尼·皮科克", "尚塔尔·佩蒂克莱尔", "丹尼尔·迪亚斯"), "体育", "美国轮椅运动员塔季扬娜·麦克法登共获得20枚残奥会奖牌，其中17枚金牌，使她成为历史上获奖最多的残奥会运动员。"),
            es = LocalizedContent("¿Qué atleta paralímpico es actualmente el más condecorado?", listOf("Tatyana McFadden", "Jonnie Peacock", "Chantal Petitclerc", "Daniel Dias"), "Deportes", "Tatyana McFadden, atleta estadounidense en silla de ruedas, totaliza 20 medallas paralímpicas, incluyendo 17 de oro, lo que la convierte en la deportista paralímpica más condecorada de la historia.")
        ),
        BilingualQuestion(
            id = 12749, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année la para-natation s'est-elle ajoutée aux Jeux?", listOf("1968", "1976", "1980", "1992"), "Sport", "La para-natation a été introduite aux Jeux paralympiques en 1980 à Arnhem, aux Pays-Bas, élargissant les disciplines aquatiques pour les athlètes handicapés."),
            en = LocalizedContent("In which year was para-swimming added to the Games?", listOf("1968", "1976", "1980", "1992"), "Sports", "Para-swimming was introduced to the Paralympic Games in 1980 in Arnhem, Netherlands, expanding aquatic disciplines for athletes with disabilities."),
            zh = LocalizedContent("残疾人游泳在哪一年被加入残奥会？", listOf("1968", "1976", "1980", "1992"), "体育", "残疾人游泳于1980年在荷兰阿纳姆被引入残奥会，为残疾运动员扩展了水上项目。"),
            es = LocalizedContent("¿En qué año se añadió la paranatación a los Juegos?", listOf("1968", "1976", "1980", "1992"), "Deportes", "La paranatación se introdujo en los Juegos Paralímpicos en 1980 en Arnhem, Países Bajos, ampliando las disciplinas acuáticas para atletas con discapacidad.")
        ),
        BilingualQuestion(
            id = 12750, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de catégories de handicap existent en para-athlétisme?", listOf("5", "10", "15", "20"), "Sport", "En para-athlétisme, les athlètes sont classés en 15 catégories de handicap, allant des déficiences physiques aux troubles visuels et intellectuels, pour garantir une compétition équitable."),
            en = LocalizedContent("How many disability categories exist in para-athletics?", listOf("5", "10", "15", "20"), "Sports", "In para-athletics, athletes are classified into 15 disability categories, ranging from physical impairments to visual and intellectual disabilities, to ensure fair competition."),
            zh = LocalizedContent("残疾人田径运动中有多少个残疾类别？", listOf("5", "10", "15", "20"), "体育", "在残疾人田径运动中，运动员被分为15个残疾类别，从身体损伤到视觉和智力障碍，以确保公平竞争。"),
            es = LocalizedContent("¿Cuántas categorías de discapacidad existen en el paraatletismo?", listOf("5", "10", "15", "20"), "Deportes", "En el paraatletismo, los atletas se clasifican en 15 categorías de discapacidad, que van desde deficiencias físicas hasta trastornos visuales e intelectuales, para garantizar una competencia justa.")
        ),
        BilingualQuestion(
            id = 12751, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record du monde du saut en longueur (para-athlètes)?", listOf("6 m", "7 m", "8 m", "9 m"), "Sport", "Le record du monde du saut en longueur chez les para-athlètes (catégorie T64) est détenu par Markus Rehm, qui a sauté 8,48 mètres en 2023."),
            en = LocalizedContent("What is the world record in long jump (para-athletes)?", listOf("6 m", "7 m", "8 m", "9 m"), "Sports", "The world record in long jump for para-athletes (T64 category) is held by Markus Rehm, who jumped 8.48 meters in 2023."),
            zh = LocalizedContent("残疾人跳远的世界纪录是多少？", listOf("6米", "7米", "8米", "9米"), "体育", "残疾人跳远（T64级别）的世界纪录由马库斯·雷姆保持，他在2023年跳出了8.48米。"),
            es = LocalizedContent("¿Cuál es el récord mundial de salto de longitud (paraatletas)?", listOf("6 m", "7 m", "8 m", "9 m"), "Deportes", "El récord mundial de salto de longitud en paraatletismo (categoría T64) lo posee Markus Rehm, quien saltó 8,48 metros en 2023.")
        ),
        BilingualQuestion(
            id = 12752, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Le para-cyclisme a combien de disciplines?", listOf("3", "5", "7", "10"), "Sport", "Le para-cyclisme comprend 7 disciplines : course sur route, contre-la-montre, sprint, poursuite, kilomètre, et deux épreuves de tandem."),
            en = LocalizedContent("How many disciplines does para-cycling have?", listOf("3", "5", "7", "10"), "Sports", "Para-cycling includes 7 disciplines: road race, time trial, sprint, pursuit, kilometer, and two tandem events."),
            zh = LocalizedContent("残疾人自行车运动有多少个项目？", listOf("3", "5", "7", "10"), "体育", "残疾人自行车运动包括7个项目：公路赛、计时赛、冲刺赛、追逐赛、公里赛和两项双人赛。"),
            es = LocalizedContent("¿Cuántas disciplinas tiene el paraciclismo?", listOf("3", "5", "7", "10"), "Deportes", "El paraciclismo comprende 7 disciplinas: carrera en ruta, contrarreloj, sprint, persecución, kilómetro y dos pruebas en tándem.")
        ),
        BilingualQuestion(
            id = 12753, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record du monde du marathon en fauteuil roulant?", listOf("1h10", "1h20", "1h30", "1h40"), "Sport", "Le record du monde du marathon en fauteuil roulant est détenu par Marcel Hug, avec un temps de 1h17m47s réalisé en 2024 à Boston."),
            en = LocalizedContent("What is the world record for the wheelchair marathon?", listOf("1h10", "1h20", "1h30", "1h40"), "Sports", "The world record for the wheelchair marathon is held by Marcel Hug, with a time of 1h17m47s set in 2024 in Boston."),
            zh = LocalizedContent("轮椅马拉松的世界纪录是多少？", listOf("1小时10分", "1小时20分", "1小时30分", "1小时40分"), "体育", "轮椅马拉松的世界纪录由马塞尔·胡格保持，他在2024年波士顿马拉松中跑出1小时17分47秒。"),
            es = LocalizedContent("¿Cuál es el récord mundial de maratón en silla de ruedas?", listOf("1h10", "1h20", "1h30", "1h40"), "Deportes", "El récord mundial de maratón en silla de ruedas lo posee Marcel Hug, con un tiempo de 1h17m47s logrado en 2024 en Boston.")
        ),
        BilingualQuestion(
            id = 12754, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année le para-athlétisme s'est-il professionnalisé?", listOf("2005", "2010", "2015", "2020"), "Sport", "Le para-athlétisme s'est professionnalisé en 2015, lorsque World Athletics a introduit des primes et des contrats pour les athlètes handisports, alignant leur statut sur celui des valides."),
            en = LocalizedContent("In which year did para-athletics become professional?", listOf("2005", "2010", "2015", "2020"), "Sports", "Para-athletics became professional in 2015, when World Athletics introduced prize money and contracts for para-athletes, aligning their status with able-bodied athletes."),
            zh = LocalizedContent("残疾人田径在哪一年实现职业化？", listOf("2005", "2010", "2015", "2020"), "体育", "残疾人田径于2015年实现职业化，当时世界田径为残疾运动员引入了奖金和合同，使其地位与健全运动员看齐。"),
            es = LocalizedContent("¿En qué año se profesionalizó el paraatletismo?", listOf("2005", "2010", "2015", "2020"), "Deportes", "El paraatletismo se profesionalizó en 2015, cuando World Athletics introdujo premios y contratos para atletas con discapacidad, alineando su estatus con el de los atletas sin discapacidad.")
        ),
        BilingualQuestion(
            id = 12755, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de médailles d'or les Jeux de Tokyo 2020 ont-ils distribuées?", listOf("500", "700", "900", "1100"), "Sport", "Les Jeux de Tokyo 2020 ont attribué 900 médailles d'or, un chiffre légèrement supérieur aux éditions précédentes en raison de l'ajout de nouvelles disciplines sportives."),
            en = LocalizedContent("How many gold medals were awarded at the Tokyo 2020 Games?", listOf("500", "700", "900", "1100"), "Sports", "The Tokyo 2020 Games awarded 900 gold medals, a slightly higher number than previous editions due to the addition of new sports."),
            zh = LocalizedContent("2020年东京奥运会颁发了多少枚金牌？", listOf("500", "700", "900", "1100"), "体育", "2020年东京奥运会颁发了900枚金牌，由于新增了体育项目，这一数字略高于往届。"),
            es = LocalizedContent("¿Cuántas medallas de oro se entregaron en los Juegos de Tokio 2020?", listOf("500", "700", "900", "1100"), "Deportes", "Los Juegos de Tokio 2020 otorgaron 900 medallas de oro, una cifra ligeramente superior a ediciones anteriores debido a la adición de nuevas disciplinas deportivas.")
        ),
        BilingualQuestion(
            id = 12756, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record du monde du 200m en para-natation?", listOf("2 min", "2.5 min", "3 min", "3.5 min"), "Sport", "Le record du monde du 200 mètres en para-natation est de 2 minutes 30 secondes, établi par le nageur français Ugo Didier lors des championnats du monde 2023."),
            en = LocalizedContent("What is the world record for the 200m in para-swimming?", listOf("2 min", "2.5 min", "3 min", "3.5 min"), "Sports", "The world record for the 200 meters in para-swimming is 2 minutes 30 seconds, set by French swimmer Ugo Didier at the 2023 World Championships."),
            zh = LocalizedContent("残疾人游泳200米的世界纪录是多少？", listOf("2分钟", "2.5分钟", "3分钟", "3.5分钟"), "体育", "残疾人游泳200米的世界纪录是2分30秒，由法国游泳选手乌戈·迪迪埃在2023年世锦赛上创造。"),
            es = LocalizedContent("¿Cuál es el récord mundial de 200 m en paranatación?", listOf("2 min", "2.5 min", "3 min", "3.5 min"), "Deportes", "El récord mundial de 200 metros en paranatación es de 2 minutos 30 segundos, establecido por el nadador francés Ugo Didier en los campeonatos mundiales de 2023.")
        ),
        BilingualQuestion(
            id = 12757, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Le para-badminton est sport paralympique depuis quelle année?", listOf("2016", "2018", "2020", "2024"), "Sport", "Le para-badminton a fait ses débuts aux Jeux paralympiques de Tokyo en 2020, mais a été officiellement intégré au programme pour les Jeux de Paris 2024."),
            en = LocalizedContent("Para-badminton has been a Paralympic sport since which year?", listOf("2016", "2018", "2020", "2024"), "Sports", "Para-badminton made its debut at the Tokyo 2020 Paralympic Games, but was officially integrated into the program for the Paris 2024 Games."),
            zh = LocalizedContent("残疾人羽毛球从哪一年开始成为残奥会项目？", listOf("2016", "2018", "2020", "2024"), "体育", "残疾人羽毛球在2020年东京残奥会上首次亮相，但正式被纳入2024年巴黎残奥会的比赛项目。"),
            es = LocalizedContent("¿Desde qué año el parabádminton es deporte paralímpico?", listOf("2016", "2018", "2020", "2024"), "Deportes", "El parabádminton debutó en los Juegos Paralímpicos de Tokio 2020, pero se integró oficialmente en el programa para los Juegos de París 2024.")
        ),
        BilingualQuestion(
            id = 12758, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel athlète paralympique a participé aux Jeux les plus nombreuses fois?", listOf("Daniel Dias", "Tatyana McFadden", "Jonnie Peacock", "Chantal Petitclerc"), "Sport", "Le nageur brésilien Daniel Dias détient le record de participations aux Jeux paralympiques avec six éditions, de 2008 à 2024."),
            en = LocalizedContent("Which Paralympic athlete has participated in the most Games?", listOf("Daniel Dias", "Tatyana McFadden", "Jonnie Peacock", "Chantal Petitclerc"), "Sports", "Brazilian swimmer Daniel Dias holds the record for most Paralympic Games participations with six editions, from 2008 to 2024."),
            zh = LocalizedContent("哪位残奥会运动员参加残奥会的次数最多？", listOf("丹尼尔·迪亚斯", "塔季扬娜·麦克法登", "乔尼·皮科克", "尚塔尔·佩蒂克莱尔"), "体育", "巴西游泳选手丹尼尔·迪亚斯保持着参加残奥会次数最多的纪录，共参加了六届（2008年至2024年）。"),
            es = LocalizedContent("¿Qué atleta paralímpico ha participado en más Juegos?", listOf("Daniel Dias", "Tatyana McFadden", "Jonnie Peacock", "Chantal Petitclerc"), "Deportes", "El nadador brasileño Daniel Dias posee el récord de participaciones en Juegos Paralímpicos con seis ediciones, de 2008 a 2024.")
        ),
        BilingualQuestion(
            id = 12759, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de records du monde ont été battus aux Jeux de Tokyo 2020?", listOf("50", "100", "200", "300+"), "Sport", "Aux Jeux de Tokyo 2020, plus de 300 records du monde ont été battus, un chiffre record pour une seule édition des Jeux Olympiques."),
            en = LocalizedContent("How many world records were broken at the 2020 Tokyo Games?", listOf("50", "100", "200", "300+"), "Sports", "At the 2020 Tokyo Games, over 300 world records were broken, a record number for a single edition of the Olympic Games."),
            zh = LocalizedContent("2020年东京奥运会上打破了多项世界纪录？", listOf("50", "100", "200", "300+"), "体育", "在2020年东京奥运会上，超过300项世界纪录被打破，这是单届奥运会破纪录数量最多的一次。"),
            es = LocalizedContent("¿Cuántos récords mundiales se batieron en los Juegos de Tokio 2020?", listOf("50", "100", "200", "300+"), "Deportes", "En los Juegos de Tokio 2020, se batieron más de 300 récords mundiales, una cifra récord para una sola edición de los Juegos Olímpicos.")
        ),
        BilingualQuestion(
            id = 12760, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui a découvert la structure de l'ADN?", listOf("Watson, Crick, Franklin", "Darwin", "Mendel", "Fleming"), "Science", "La structure en double hélice de l'ADN a été élucidée en 1953 par James Watson et Francis Crick, s'appuyant sur les données de diffraction aux rayons X de Rosalind Franklin."),
            en = LocalizedContent("Who discovered the structure of DNA?", listOf("Watson, Crick, Franklin", "Darwin", "Mendel", "Fleming"), "Science", "The double helix structure of DNA was elucidated in 1953 by James Watson and Francis Crick, based on X-ray diffraction data from Rosalind Franklin."),
            zh = LocalizedContent("谁发现了DNA的结构？", listOf("沃森、克里克、富兰克林", "达尔文", "孟德尔", "弗莱明"), "科学", "DNA的双螺旋结构于1953年由詹姆斯·沃森和弗朗西斯·克里克阐明，他们利用了罗莎琳德·富兰克林的X射线衍射数据。"),
            es = LocalizedContent("¿Quién descubrió la estructura del ADN?", listOf("Watson, Crick, Franklin", "Darwin", "Mendel", "Fleming"), "Ciencia", "La estructura de doble hélice del ADN fue dilucidada en 1953 por James Watson y Francis Crick, basándose en los datos de difracción de rayos X de Rosalind Franklin.")
        ),
        BilingualQuestion(
            id = 12761, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Combien de paires de bases contient l'ADN humain?", listOf("1 milliard", "2 milliards", "3 milliards", "4 milliards"), "Science", "Le génome humain haploïde contient environ 3 milliards de paires de bases, réparties sur 23 chromosomes. Ce nombre représente la totalité de l'information génétique codant pour les protéines et les séquences non codantes."),
            en = LocalizedContent("How many base pairs does human DNA contain?", listOf("1 billion", "2 billion", "3 billion", "4 billion"), "Science", "The haploid human genome contains about 3 billion base pairs, distributed across 23 chromosomes. This number represents the total genetic information encoding proteins and non-coding sequences."),
            zh = LocalizedContent("人类DNA包含多少碱基对？", listOf("10亿", "20亿", "30亿", "40亿"), "科学", "单倍体人类基因组包含约30亿个碱基对，分布在23条染色体上。这个数字代表了编码蛋白质和非编码序列的全部遗传信息。"),
            es = LocalizedContent("¿Cuántos pares de bases contiene el ADN humano?", listOf("1 billón", "2 billones", "3 billones", "4 billones"), "Ciencia", "El genoma humano haploide contiene aproximadamente 3 billones de pares de bases, distribuidos en 23 cromosomas. Este número representa la totalidad de la información genética que codifica proteínas y secuencias no codificantes.")
        ),
        BilingualQuestion(
            id = 12762, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel virus est le plus susceptible d'être ciblé par un vaccin à ARNm?", listOf("Grippe", "COVID-19", "Rougeole", "Poliomyélite"), "Science", "Les vaccins à ARNm ont été largement utilisés et développés pour lutter contre le COVID-19, causé par le SARS-CoV-2, en raison de l'urgence sanitaire mondiale."),
            en = LocalizedContent("Which virus is most likely to be targeted by an mRNA vaccine?", listOf("Influenza", "COVID-19", "Measles", "Polio"), "Science", "mRNA vaccines have been widely used and developed to combat COVID-19, caused by SARS-CoV-2, due to the global health emergency."),
            zh = LocalizedContent("哪种病毒最有可能成为mRNA疫苗的目标？", listOf("流感", "COVID-19", "麻疹", "脊髓灰质炎"), "科学", "mRNA疫苗已被广泛用于对抗由SARS-CoV-2引起的COVID-19，因为全球卫生紧急情况。"),
            es = LocalizedContent("¿Qué virus tiene más probabilidades de ser el objetivo de una vacuna de ARNm?", listOf("Gripe", "COVID-19", "Sarampión", "Poliomielitis"), "Ciencia", "Las vacunas de ARNm se han utilizado y desarrollado ampliamente para combatir el COVID-19, causado por el SARS-CoV-2, debido a la emergencia sanitaria mundial.")
        ),
        BilingualQuestion(
            id = 12763, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année le vaccin à ARNm a-t-il été approuvé?", listOf("2020", "2021", "2022", "2023"), "Science", "Le premier vaccin à ARNm, développé contre la Covid-19, a reçu une autorisation d'utilisation d'urgence en décembre 2020, marquant une avancée majeure dans la lutte contre la pandémie."),
            en = LocalizedContent("In which year was the mRNA vaccine approved?", listOf("2020", "2021", "2022", "2023"), "Science", "The first mRNA vaccine, developed against COVID-19, received emergency use authorization in December 2020, marking a major breakthrough in the fight against the pandemic."),
            zh = LocalizedContent("mRNA疫苗在哪一年获得批准？", listOf("2020", "2021", "2022", "2023"), "科学", "首个针对COVID-19的mRNA疫苗于2020年12月获得紧急使用授权，标志着抗击大流行的重大突破。"),
            es = LocalizedContent("¿En qué año se aprobó la vacuna de ARNm?", listOf("2020", "2021", "2022", "2023"), "Ciencia", "La primera vacuna de ARNm, desarrollada contra la COVID-19, recibió autorización de uso de emergencia en diciembre de 2020, marcando un gran avance en la lucha contra la pandemia.")
        ),
        BilingualQuestion(
            id = 12764, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel organisme produit la protéine spike du COVID-19?", listOf("Virus", "Cellule humaine modifiée", "Lymphocyte", "Anticorps"), "Science", "Les vaccins à ARN messager utilisent des cellules humaines modifiées en laboratoire pour produire la protéine spike, qui sert à déclencher une réponse immunitaire sans causer la maladie."),
            en = LocalizedContent("Which organism produces the spike protein of COVID-19?", listOf("Virus", "Modified human cell", "Lymphocyte", "Antibody"), "Science", "mRNA vaccines use modified human cells in the lab to produce the spike protein, which triggers an immune response without causing the disease."),
            zh = LocalizedContent("哪种生物体产生COVID-19的刺突蛋白？", listOf("病毒", "修饰过的人类细胞", "淋巴细胞", "抗体"), "科学", "mRNA疫苗利用实验室中修饰过的人类细胞来产生刺突蛋白，从而引发免疫反应而不引起疾病。"),
            es = LocalizedContent("¿Qué organismo produce la proteína espiga del COVID-19?", listOf("Virus", "Célula humana modificada", "Linfocito", "Anticuerpo"), "Ciencia", "Las vacunas de ARNm utilizan células humanas modificadas en el laboratorio para producir la proteína espiga, que desencadena una respuesta inmunitaria sin causar la enfermedad.")
        ),
        BilingualQuestion(
            id = 12765, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Combien de gènes l'ADN humain contient-il environ?", listOf("10000", "20000", "50000", "100000"), "Science", "Le nombre de gènes codant pour des protéines dans le génome humain est estimé à environ 20 000, bien moins que les 100 000 supposés avant le séquençage complet du génome humain en 2003."),
            en = LocalizedContent("How many genes does human DNA contain approximately?", listOf("10000", "20000", "50000", "100000"), "Science", "The number of protein-coding genes in the human genome is estimated at about 20,000, far fewer than the 100,000 assumed before the complete sequencing of the human genome in 2003."),
            zh = LocalizedContent("人类DNA大约包含多少个基因？", listOf("10000", "20000", "50000", "100000"), "科学", "人类基因组中编码蛋白质的基因数量估计约为2万个，远少于2003年人类基因组完全测序前假设的10万个。"),
            es = LocalizedContent("¿Cuántos genes contiene aproximadamente el ADN humano?", listOf("10000", "20000", "50000", "100000"), "Ciencia", "El número de genes codificantes de proteínas en el genoma humano se estima en unos 20 000, mucho menos que los 100 000 supuestos antes de la secuenciación completa del genoma humano en 2003.")
        ),
        BilingualQuestion(
            id = 12766, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le taux d'efficacité du vaccin ARNm Pfizer contre le COVID-19?", listOf("50%", "75%", "95%", "99%"), "Science", "L'efficacité de 95% a été mesurée lors des essais cliniques de phase 3, comparant les infections chez les vaccinés par rapport au groupe placebo."),
            en = LocalizedContent("What is the efficacy rate of the Pfizer mRNA vaccine against COVID-19?", listOf("50%", "75%", "95%", "99%"), "Science", "The 95% efficacy was measured in phase 3 clinical trials, comparing infections in vaccinated individuals versus the placebo group."),
            zh = LocalizedContent("辉瑞mRNA疫苗对COVID-19的有效率是多少？", listOf("50%", "75%", "95%", "99%"), "科学", "95%的有效率是在3期临床试验中测量的，比较了接种疫苗者与安慰剂组的感染情况。"),
            es = LocalizedContent("¿Cuál es la tasa de eficacia de la vacuna de ARNm de Pfizer contra el COVID-19?", listOf("50%", "75%", "95%", "99%"), "Ciencia", "La eficacia del 95% se midió en los ensayos clínicos de fase 3, comparando las infecciones en los vacunados con respecto al grupo placebo.")
        ),
        BilingualQuestion(
            id = 12767, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("La génération d'un vaccin à ARNm prend combien de temps?", listOf("3 mois", "6 mois", "1 an", "2 ans"), "Science", "La mise au point d'un vaccin à ARNm peut être rapide car elle repose sur la synthèse directe de la séquence génétique du virus, sans nécessiter de culture ou d'inactivation du pathogène."),
            en = LocalizedContent("How long does it take to generate an mRNA vaccine?", listOf("3 months", "6 months", "1 year", "2 years"), "Science", "The development of an mRNA vaccine can be rapid because it relies on direct synthesis of the virus's genetic sequence, without requiring culture or inactivation of the pathogen."),
            zh = LocalizedContent("生成mRNA疫苗需要多长时间？", listOf("3个月", "6个月", "1年", "2年"), "科学", "mRNA疫苗的开发可以很快，因为它依赖于病毒基因序列的直接合成，无需培养或灭活病原体。"),
            es = LocalizedContent("¿Cuánto tiempo se tarda en generar una vacuna de ARNm?", listOf("3 meses", "6 meses", "1 año", "2 años"), "Ciencia", "El desarrollo de una vacuna de ARNm puede ser rápido porque se basa en la síntesis directa de la secuencia genética del virus, sin necesidad de cultivo o inactivación del patógeno.")
        ),
        BilingualQuestion(
            id = 12768, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le pourcentage de similarité génétique entre l'homme et le chimpanzé?", listOf("87%", "95%", "98%", "99%"), "Science", "Les humains partagent environ 98% de leur ADN avec les chimpanzés, ce qui en fait nos plus proches parents vivants dans le règne animal."),
            en = LocalizedContent("What is the percentage of genetic similarity between humans and chimpanzees?", listOf("87%", "95%", "98%", "99%"), "Science", "Humans share about 98% of their DNA with chimpanzees, making them our closest living relatives in the animal kingdom."),
            zh = LocalizedContent("人类与黑猩猩的基因相似度百分比是多少？", listOf("87%", "95%", "98%", "99%"), "科学", "人类与黑猩猩共享约98%的DNA，这使它们成为我们在动物界中现存最近的亲属。"),
            es = LocalizedContent("¿Cuál es el porcentaje de similitud genética entre humanos y chimpancés?", listOf("87%", "95%", "98%", "99%"), "Ciencia", "Los humanos comparten aproximadamente el 98% de su ADN con los chimpancés, lo que los convierte en nuestros parientes vivos más cercanos en el reino animal.")
        ),
    )

    private fun part4(): List<BilingualQuestion> = listOf(
        BilingualQuestion(
            id = 12769, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Le séquençage complet du génome humain a été achevé en quelle année?", listOf("2000", "2003", "2005", "2010"), "Science", "Le Projet Génome Humain, lancé en 1990, a officiellement annoncé l'achèvement du séquençage complet en avril 2003, soit 50 ans après la découverte de la structure de l'ADN."),
            en = LocalizedContent("In which year was the complete sequencing of the human genome completed?", listOf("2000", "2003", "2005", "2010"), "Science", "The Human Genome Project, launched in 1990, officially announced the completion of full sequencing in April 2003, 50 years after the discovery of DNA structure."),
            zh = LocalizedContent("人类基因组完整测序在哪一年完成？", listOf("2000", "2003", "2005", "2010"), "科学", "人类基因组计划于1990年启动，于2003年4月正式宣布完成完整测序，正值DNA结构发现50周年。"),
            es = LocalizedContent("¿En qué año se completó la secuenciación completa del genoma humano?", listOf("2000", "2003", "2005", "2010"), "Ciencia", "El Proyecto Genoma Humano, iniciado en 1990, anunció oficialmente la finalización de la secuenciación completa en abril de 2003, 50 años después del descubrimiento de la estructura del ADN.")
        ),
        BilingualQuestion(
            id = 12770, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le vaccin vivant atténué?", listOf("Pfizer", "Moderna", "Rougeole ROR", "AstraZeneca"), "Science", "Le ROR (rougeole-oreillons-rubéole) est un vaccin vivant atténué car il contient des virus affaiblis qui stimulent l'immunité sans causer la maladie."),
            en = LocalizedContent("Which is a live attenuated vaccine?", listOf("Pfizer", "Moderna", "MMR Measles", "AstraZeneca"), "Science", "The MMR (measles-mumps-rubella) vaccine is a live attenuated vaccine because it contains weakened viruses that stimulate immunity without causing disease."),
            zh = LocalizedContent("哪种是减毒活疫苗？", listOf("辉瑞", "莫德纳", "麻腮风三联疫苗", "阿斯利康"), "科学", "麻腮风三联疫苗（麻疹-腮腺炎-风疹）是一种减毒活疫苗，因为它含有减弱的病毒，能刺激免疫而不致病。"),
            es = LocalizedContent("¿Cuál es una vacuna viva atenuada?", listOf("Pfizer", "Moderna", "Triple vírica SRP", "AstraZeneca"), "Ciencia", "La vacuna triple vírica (sarampión-paperas-rubéola) es una vacuna viva atenuada porque contiene virus debilitados que estimulan la inmunidad sin causar la enfermedad.")
        ),
        BilingualQuestion(
            id = 12771, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien d'amino-acides les protéines humaines contiennent-elles en moyenne?", listOf("50", "100", "300", "600"), "Science", "Les protéines humaines sont composées en moyenne de 300 acides aminés, bien que leur taille varie de quelques dizaines à plusieurs milliers selon leur fonction."),
            en = LocalizedContent("How many amino acids do human proteins contain on average?", listOf("50", "100", "300", "600"), "Science", "Human proteins are composed of an average of 300 amino acids, although their size ranges from a few dozen to several thousand depending on function."),
            zh = LocalizedContent("人类蛋白质平均含有多少个氨基酸？", listOf("50", "100", "300", "600"), "科学", "人类蛋白质平均由300个氨基酸组成，但大小从几十到几千不等，取决于功能。"),
            es = LocalizedContent("¿Cuántos aminoácidos contienen en promedio las proteínas humanas?", listOf("50", "100", "300", "600"), "Ciencia", "Las proteínas humanas están compuestas en promedio por 300 aminoácidos, aunque su tamaño varía desde unas pocas decenas hasta varios miles según su función.")
        ),
        BilingualQuestion(
            id = 12772, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quelle est la longévité d'un ARNm dans le corps?", listOf("Heures", "Jours", "Semaines", "Mois"), "Science", "Les ARN messagers sont des molécules transitoires, rapidement dégradées par les enzymes cellulaires après avoir servi à la synthèse des protéines, ce qui limite leur durée de vie à quelques heures."),
            en = LocalizedContent("What is the lifespan of an mRNA in the body?", listOf("Hours", "Days", "Weeks", "Months"), "Science", "Messenger RNAs are transient molecules, rapidly degraded by cellular enzymes after serving in protein synthesis, limiting their lifespan to a few hours."),
            zh = LocalizedContent("mRNA在体内的寿命是多久？", listOf("小时", "天", "周", "月"), "科学", "信使RNA是瞬时分子，在参与蛋白质合成后会被细胞酶迅速降解，寿命仅限几小时。"),
            es = LocalizedContent("¿Cuál es la vida útil de un ARNm en el cuerpo?", listOf("Horas", "Días", "Semanas", "Meses"), "Ciencia", "Los ARN mensajeros son moléculas transitorias, rápidamente degradadas por enzimas celulares después de servir en la síntesis de proteínas, limitando su vida útil a unas pocas horas.")
        ),
        BilingualQuestion(
            id = 12773, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Le test PCR détecte quel élément viral?", listOf("Protéine", "ADN", "ARN", "Lipides"), "Science", "Le test PCR amplifie l'ARN viral, car les virus à ARN comme le SARS-CoV-2 utilisent cet acide nucléique comme matériel génétique."),
            en = LocalizedContent("What viral element does the PCR test detect?", listOf("Protein", "DNA", "RNA", "Lipids"), "Science", "The PCR test amplifies viral RNA, as RNA viruses like SARS-CoV-2 use this nucleic acid as genetic material."),
            zh = LocalizedContent("PCR检测检测哪种病毒成分？", listOf("蛋白质", "DNA", "RNA", "脂质"), "科学", "PCR检测扩增病毒RNA，因为像SARS-CoV-2这样的RNA病毒使用这种核酸作为遗传物质。"),
            es = LocalizedContent("¿Qué elemento viral detecta la prueba PCR?", listOf("Proteína", "ADN", "ARN", "Lípidos"), "Ciencia", "La prueba PCR amplifica el ARN viral, ya que los virus ARN como el SARS-CoV-2 utilizan este ácido nucleico como material genético.")
        ),
        BilingualQuestion(
            id = 12774, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel gène cause la mucoviscidose?", listOf("BRCA1", "CFTR", "p53", "SOD1"), "Science", "Le gène CFTR (Cystic Fibrosis Transmembrane Conductance Regulator) code une protéine qui régule le transport du chlore dans les cellules. Sa mutation entraîne la production de mucus épais caractéristique de la mucoviscidose."),
            en = LocalizedContent("Which gene causes cystic fibrosis?", listOf("BRCA1", "CFTR", "p53", "SOD1"), "Science", "The CFTR gene (Cystic Fibrosis Transmembrane Conductance Regulator) encodes a protein that regulates chloride transport in cells. Its mutation leads to the thick mucus characteristic of cystic fibrosis."),
            zh = LocalizedContent("哪个基因导致囊性纤维化？", listOf("BRCA1", "CFTR", "p53", "SOD1"), "科学", "CFTR基因（囊性纤维化跨膜传导调节因子）编码一种调节细胞中氯离子转运的蛋白质。其突变导致囊性纤维化特征性的粘稠黏液。"),
            es = LocalizedContent("¿Qué gen causa la fibrosis quística?", listOf("BRCA1", "CFTR", "p53", "SOD1"), "Ciencia", "El gen CFTR (Regulador de Conductancia de Transmembrana de Fibrosis Quística) codifica una proteína que regula el transporte de cloro en las células. Su mutación provoca el moco espeso característico de la fibrosis quística.")
        ),
        BilingualQuestion(
            id = 12775, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Combien de chaînes d'ADN double hélix contient une molécule?", listOf("1", "2", "3", "4"), "Science", "La structure en double hélice de l'ADN est formée de deux brins complémentaires enroulés l'un autour de l'autre."),
            en = LocalizedContent("How many DNA double helix strands does a molecule contain?", listOf("1", "2", "3", "4"), "Science", "The double helix structure of DNA is formed by two complementary strands wound around each other."),
            zh = LocalizedContent("一个DNA双螺旋分子包含多少条链？", listOf("1", "2", "3", "4"), "科学", "DNA的双螺旋结构由两条互补链相互缠绕而成。"),
            es = LocalizedContent("¿Cuántas cadenas de doble hélice de ADN contiene una molécula?", listOf("1", "2", "3", "4"), "Ciencia", "La estructura de doble hélice del ADN está formada por dos hebras complementarias enrolladas una alrededor de la otra.")
        ),
        BilingualQuestion(
            id = 12776, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel vaccin ancien a éradiqué la variole?", listOf("Polio", "Variole", "BCG", "Grippe"), "Science", "Le vaccin contre la variole, mis au point par Edward Jenner en 1796, a permis l'éradication de cette maladie en 1980 grâce à une campagne mondiale de vaccination."),
            en = LocalizedContent("Which old vaccine eradicated smallpox?", listOf("Polio", "Smallpox", "BCG", "Flu"), "Science", "The smallpox vaccine, developed by Edward Jenner in 1796, led to the eradication of the disease in 1980 through a global vaccination campaign."),
            zh = LocalizedContent("哪种古老疫苗根除了天花？", listOf("脊髓灰质炎", "天花", "卡介苗", "流感"), "科学", "天花疫苗由爱德华·詹纳于1796年研制，通过全球疫苗接种运动于1980年根除了该疾病。"),
            es = LocalizedContent("¿Qué vacuna antigua erradicó la viruela?", listOf("Polio", "Viruela", "BCG", "Gripe"), "Ciencia", "La vacuna contra la viruela, desarrollada por Edward Jenner en 1796, permitió la erradicación de la enfermedad en 1980 gracias a una campaña mundial de vacunación.")
        ),
        BilingualQuestion(
            id = 12777, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Le nombre total de cellules humaines contenant de l'ADN est?", listOf("10 milliards", "37 milliards", "100 milliards", "200 milliards"), "Science", "Le corps humain adulte est estimé contenir environ 37 billions de cellules, chacune possédant un noyau avec de l'ADN."),
            en = LocalizedContent("What is the total number of human cells containing DNA?", listOf("10 billion", "37 billion", "100 billion", "200 billion"), "Science", "The adult human body is estimated to contain about 37 trillion cells, each with a nucleus containing DNA."),
            zh = LocalizedContent("含有DNA的人类细胞总数是多少？", listOf("100亿", "370亿", "1000亿", "2000亿"), "科学", "成年人体内估计约有37万亿个细胞，每个细胞都有一个含有DNA的细胞核。"),
            es = LocalizedContent("¿Cuál es el número total de células humanas que contienen ADN?", listOf("10 mil millones", "37 mil millones", "100 mil millones", "200 mil millones"), "Ciencia", "Se estima que el cuerpo humano adulto contiene alrededor de 37 billones de células, cada una con un núcleo que contiene ADN.")
        ),
        BilingualQuestion(
            id = 12778, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le virus le plus muté?", listOf("Grippe", "VIH", "COVID-19", "Herpès"), "Science", "Le VIH possède un taux de mutation extrêmement élevé en raison de sa transcriptase inverse sujette aux erreurs, ce qui lui permet d'échapper au système immunitaire et aux traitements."),
            en = LocalizedContent("Which is the most mutated virus?", listOf("Flu", "HIV", "COVID-19", "Herpes"), "Science", "HIV has an extremely high mutation rate due to its error-prone reverse transcriptase, allowing it to evade the immune system and treatments."),
            zh = LocalizedContent("哪种病毒突变最多？", listOf("流感", "HIV", "COVID-19", "疱疹"), "科学", "HIV的突变率极高，因为其逆转录酶容易出错，使其能够逃避免疫系统和治疗。"),
            es = LocalizedContent("¿Cuál es el virus más mutado?", listOf("Gripe", "VIH", "COVID-19", "Herpes"), "Ciencia", "El VIH tiene una tasa de mutación extremadamente alta debido a su transcriptasa inversa propensa a errores, lo que le permite evadir el sistema inmunitario y los tratamientos.")
        ),
        BilingualQuestion(
            id = 12779, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de types différents de vaccins existent?", listOf("2", "5", "7", "10+"), "Science", "Les vaccins se classent en plusieurs catégories selon leur technologie : inactivés, vivants atténués, à sous-unités, à vecteur viral, à ARN messager, et d'autres types expérimentaux, dépassant largement la dizaine."),
            en = LocalizedContent("How many different types of vaccines exist?", listOf("2", "5", "7", "10+"), "Science", "Vaccines are classified into several categories based on their technology: inactivated, live attenuated, subunit, viral vector, messenger RNA, and other experimental types, far exceeding a dozen."),
            zh = LocalizedContent("存在多少种不同类型的疫苗？", listOf("2", "5", "7", "10+"), "科学", "疫苗根据其技术分为几类：灭活疫苗、减毒活疫苗、亚单位疫苗、病毒载体疫苗、信使RNA疫苗以及其他实验性类型，远远超过十种。"),
            es = LocalizedContent("¿Cuántos tipos diferentes de vacunas existen?", listOf("2", "5", "7", "10+"), "Ciencia", "Las vacunas se clasifican en varias categorías según su tecnología: inactivadas, vivas atenuadas, de subunidades, de vector viral, de ARN mensajero y otros tipos experimentales, superando ampliamente la decena.")
        ),
        BilingualQuestion(
            id = 12780, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quelle était la capitale de l'empire aztèque?", listOf("Tenochtitlan", "Texcoco", "Tlatelolco", "Cholula"), "Histoire", "Tenochtitlan, fondée en 1325 sur une île du lac Texcoco, était la capitale de l'empire aztèque jusqu'à sa chute en 1521 face aux conquistadors espagnols."),
            en = LocalizedContent("What was the capital of the Aztec Empire?", listOf("Tenochtitlan", "Texcoco", "Tlatelolco", "Cholula"), "History", "Tenochtitlan, founded in 1325 on an island in Lake Texcoco, was the capital of the Aztec Empire until its fall in 1521 to the Spanish conquistadors."),
            zh = LocalizedContent("阿兹特克帝国的首都是什么？", listOf("特诺奇蒂特兰", "特斯科科", "特拉特洛尔科", "乔卢拉"), "历史", "特诺奇蒂特兰建于1325年，位于特斯科科湖的一个岛上，是阿兹特克帝国的首都，直到1521年被西班牙征服者攻陷。"),
            es = LocalizedContent("¿Cuál era la capital del imperio azteca?", listOf("Tenochtitlan", "Texcoco", "Tlatelolco", "Cholula"), "Historia", "Tenochtitlan, fundada en 1325 en una isla del lago Texcoco, fue la capital del imperio azteca hasta su caída en 1521 ante los conquistadores españoles.")
        ),
        BilingualQuestion(
            id = 12781, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année Cortés a-t-il conquis les Aztèques?", listOf("1519", "1520", "1521", "1522"), "Histoire", "Hernán Cortés s'empara de Tenochtitlan en 1521 après un siège de plusieurs mois, marquant la chute de l'empire aztèque."),
            en = LocalizedContent("In what year did Cortés conquer the Aztecs?", listOf("1519", "1520", "1521", "1522"), "History", "Hernán Cortés seized Tenochtitlan in 1521 after a months-long siege, marking the fall of the Aztec Empire."),
            zh = LocalizedContent("科尔特斯在哪一年征服了阿兹特克人？", listOf("1519", "1520", "1521", "1522"), "历史", "埃尔南·科尔特斯在1521年经过数月的围攻占领了特诺奇蒂特兰，标志着阿兹特克帝国的覆灭。"),
            es = LocalizedContent("¿En qué año conquistó Cortés a los aztecas?", listOf("1519", "1520", "1521", "1522"), "Historia", "Hernán Cortés tomó Tenochtitlan en 1521 tras un asedio de varios meses, marcando la caída del imperio azteca.")
        ),
        BilingualQuestion(
            id = 12782, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien d'habitants Tenochtitlan avait-elle?", listOf("100000", "250000", "500000", "1 million"), "Histoire", "Tenochtitlan, capitale de l'Empire aztèque, comptait environ 500 000 habitants à son apogée au début du XVIe siècle, ce qui en faisait l'une des plus grandes villes du monde à l'époque."),
            en = LocalizedContent("How many inhabitants did Tenochtitlan have?", listOf("100000", "250000", "500000", "1 million"), "History", "Tenochtitlan, capital of the Aztec Empire, had about 500,000 inhabitants at its peak in the early 16th century, making it one of the largest cities in the world at the time."),
            zh = LocalizedContent("特诺奇蒂特兰有多少居民？", listOf("10万", "25万", "50万", "100万"), "历史", "特诺奇蒂特兰是阿兹特克帝国的首都，在16世纪初的鼎盛时期约有50万居民，使其成为当时世界上最大的城市之一。"),
            es = LocalizedContent("¿Cuántos habitantes tenía Tenochtitlan?", listOf("100000", "250000", "500000", "1 millón"), "Historia", "Tenochtitlan, capital del Imperio azteca, tenía alrededor de 500 000 habitantes en su apogeo a principios del siglo XVI, lo que la convertía en una de las ciudades más grandes del mundo en esa época.")
        ),
        BilingualQuestion(
            id = 12783, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel était le dieu principal des Aztèques?", listOf("Quetzalcoatl", "Huitzilopochtli", "Tezcatlipoca", "Tlaloc"), "Histoire", "Huitzilopochtli était le dieu solaire et de la guerre, considéré comme la divinité tutélaire des Aztèques, qui le plaçaient au sommet de leur panthéon."),
            en = LocalizedContent("What was the main god of the Aztecs?", listOf("Quetzalcoatl", "Huitzilopochtli", "Tezcatlipoca", "Tlaloc"), "History", "Huitzilopochtli was the sun and war god, considered the tutelary deity of the Aztecs, who placed him at the top of their pantheon."),
            zh = LocalizedContent("阿兹特克人的主神是什么？", listOf("羽蛇神", "惠齐洛波奇特利", "特斯卡特利波卡", "特拉洛克"), "历史", "惠齐洛波奇特利是太阳神和战神，被视为阿兹特克人的守护神，他们将其置于万神殿之首。"),
            es = LocalizedContent("¿Cuál era el dios principal de los aztecas?", listOf("Quetzalcóatl", "Huitzilopochtli", "Tezcatlipoca", "Tláloc"), "Historia", "Huitzilopochtli era el dios del sol y la guerra, considerado la deidad tutelar de los aztecas, quienes lo colocaban en la cima de su panteón.")
        ),
        BilingualQuestion(
            id = 12784, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de royaumes indépendants composaient l'Empire aztèque?", listOf("3", "5", "10", "20"), "Histoire", "L'Empire aztèque était une triple alliance formée par les cités-États de Tenochtitlan, Texcoco et Tlacopan. Ces trois royaumes unissaient leurs forces militaires et économiques pour dominer la région."),
            en = LocalizedContent("How many independent kingdoms made up the Aztec Empire?", listOf("3", "5", "10", "20"), "History", "The Aztec Empire was a triple alliance formed by the city-states of Tenochtitlan, Texcoco, and Tlacopan. These three kingdoms united their military and economic forces to dominate the region."),
            zh = LocalizedContent("阿兹特克帝国由多少个独立王国组成？", listOf("3", "5", "10", "20"), "历史", "阿兹特克帝国是由特诺奇蒂特兰、特斯科科和特拉科潘三个城邦组成的三国同盟。这三个王国联合军事和经济力量统治该地区。"),
            es = LocalizedContent("¿Cuántos reinos independientes componían el Imperio azteca?", listOf("3", "5", "10", "20"), "Historia", "El Imperio azteca era una triple alianza formada por las ciudades-estado de Tenochtitlan, Texcoco y Tlacopan. Estos tres reinos unían sus fuerzas militares y económicas para dominar la región.")
        ),
        BilingualQuestion(
            id = 12785, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Le calendrier aztèque avait combien de jours par an?", listOf("260", "365", "520", "1000"), "Histoire", "Le calendrier aztèque, comme le calendrier julien, comptait 365 jours, répartis en 18 mois de 20 jours plus 5 jours supplémentaires considérés comme néfastes."),
            en = LocalizedContent("How many days per year did the Aztec calendar have?", listOf("260", "365", "520", "1000"), "History", "The Aztec calendar, like the Julian calendar, had 365 days, divided into 18 months of 20 days plus 5 extra days considered unlucky."),
            zh = LocalizedContent("阿兹特克历法每年有多少天？", listOf("260", "365", "520", "1000"), "历史", "阿兹特克历法如同儒略历，有365天，分为18个月，每月20天，外加5个被认为不吉利的额外日。"),
            es = LocalizedContent("¿Cuántos días al año tenía el calendario azteca?", listOf("260", "365", "520", "1000"), "Historia", "El calendario azteca, al igual que el calendario juliano, tenía 365 días, divididos en 18 meses de 20 días más 5 días adicionales considerados nefastos.")
        ),
        BilingualQuestion(
            id = 12786, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel était le matériau principal utilisé pour construire Tenochtitlan?", listOf("Pierre", "Brique", "Bois", "Terre"), "Histoire", "Tenochtitlan, capitale de l'Empire aztèque, était construite principalement en pierre volcanique, notamment la tezontle, car elle était abondante dans la région et résistante aux séismes."),
            en = LocalizedContent("What was the main material used to build Tenochtitlan?", listOf("Stone", "Brick", "Wood", "Earth"), "History", "Tenochtitlan, capital of the Aztec Empire, was built mainly from volcanic stone, especially tezontle, as it was abundant in the region and resistant to earthquakes."),
            zh = LocalizedContent("建造特诺奇蒂特兰的主要材料是什么？", listOf("石头", "砖", "木头", "泥土"), "历史", "特诺奇蒂特兰是阿兹特克帝国的首都，主要用火山石建造，尤其是特松特利石，因为该地区储量丰富且抗震。"),
            es = LocalizedContent("¿Cuál era el material principal utilizado para construir Tenochtitlan?", listOf("Piedra", "Ladrillo", "Madera", "Tierra"), "Historia", "Tenochtitlan, capital del Imperio azteca, estaba construida principalmente con piedra volcánica, especialmente tezontle, ya que era abundante en la región y resistente a los terremotos.")
        ),
        BilingualQuestion(
            id = 12787, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de sacrifices humains les Aztèques effectuaient-ils par an?", listOf("100", "500", "1000", "5000+"), "Histoire", "Les estimations des historiens varient, mais les chroniques espagnoles et les codex aztèques suggèrent que des milliers de prisonniers de guerre étaient sacrifiés chaque année lors de cérémonies religieuses."),
            en = LocalizedContent("How many human sacrifices did the Aztecs perform per year?", listOf("100", "500", "1000", "5000+"), "History", "Estimates by historians vary, but Spanish chronicles and Aztec codices suggest that thousands of war prisoners were sacrificed each year during religious ceremonies."),
            zh = LocalizedContent("阿兹特克人每年进行多少次人祭？", listOf("100", "500", "1000", "5000+"), "历史", "历史学家的估计各不相同，但西班牙编年史和阿兹特克手抄本表明，每年有数千名战俘在宗教仪式中被献祭。"),
            es = LocalizedContent("¿Cuántos sacrificios humanos realizaban los aztecas al año?", listOf("100", "500", "1000", "5000+"), "Historia", "Las estimaciones de los historiadores varían, pero las crónicas españolas y los códices aztecas sugieren que miles de prisioneros de guerra eran sacrificados cada año durante ceremonias religiosas.")
        ),
        BilingualQuestion(
            id = 12788, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel légume était la principale récolte aztèque?", listOf("Maïs", "Haricot", "Courge", "Tomate"), "Histoire", "Le maïs était la base de l'alimentation aztèque, cultivé comme culture principale dans tout l'empire."),
            en = LocalizedContent("What vegetable was the main Aztec crop?", listOf("Maize", "Bean", "Squash", "Tomato"), "History", "Maize was the staple of the Aztec diet, cultivated as the main crop throughout the empire."),
            zh = LocalizedContent("哪种蔬菜是阿兹特克人的主要作物？", listOf("玉米", "豆类", "南瓜", "番茄"), "历史", "玉米是阿兹特克人的主食，在整个帝国被作为主要作物种植。"),
            es = LocalizedContent("¿Qué verdura era el principal cultivo azteca?", listOf("Maíz", "Frijol", "Calabaza", "Tomate"), "Historia", "El maíz era la base de la alimentación azteca, cultivado como cultivo principal en todo el imperio.")
        ),
        BilingualQuestion(
            id = 12789, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année l'Empire aztèque a-t-il atteint son apogée?", listOf("1400", "1450", "1500", "1519"), "Histoire", "1519 marque l'arrivée des conquistadors espagnols menés par Hernán Cortés, qui coïncide avec l'apogée de l'Empire aztèque sous le règne de Moctezuma II, juste avant sa chute."),
            en = LocalizedContent("In which year did the Aztec Empire reach its peak?", listOf("1400", "1450", "1500", "1519"), "History", "1519 marks the arrival of Spanish conquistadors led by Hernán Cortés, which coincides with the peak of the Aztec Empire under the rule of Moctezuma II, just before its fall."),
            zh = LocalizedContent("阿兹特克帝国在哪一年达到鼎盛？", listOf("1400", "1450", "1500", "1519"), "历史", "1519年标志着由埃尔南·科尔特斯率领的西班牙征服者的到来，这与阿兹特克帝国在蒙特祖马二世统治下达到鼎盛、即将覆灭的时刻相吻合。"),
            es = LocalizedContent("¿En qué año alcanzó su apogeo el Imperio azteca?", listOf("1400", "1450", "1500", "1519"), "Historia", "1519 marca la llegada de los conquistadores españoles liderados por Hernán Cortés, que coincide con el apogeo del Imperio azteca bajo el reinado de Moctezuma II, justo antes de su caída.")
        ),
        BilingualQuestion(
            id = 12790, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel était le système d'écriture aztèque?", listOf("Alphabétique", "Hiéroglyphes", "Syllabaire", "Logographique"), "Histoire", "Le système d'écriture aztèque était logographique, utilisant des pictogrammes et des idéogrammes pour représenter des mots ou des concepts, sans alphabet phonétique complet."),
            en = LocalizedContent("What was the Aztec writing system?", listOf("Alphabetic", "Hieroglyphs", "Syllabary", "Logographic"), "History", "The Aztec writing system was logographic, using pictograms and ideograms to represent words or concepts, without a complete phonetic alphabet."),
            zh = LocalizedContent("阿兹特克的文字系统是什么？", listOf("字母文字", "象形文字", "音节文字", "语素文字"), "历史", "阿兹特克的文字系统是语素文字，使用图形和表意符号来表示词语或概念，没有完整的音标字母。"),
            es = LocalizedContent("¿Cuál era el sistema de escritura azteca?", listOf("Alfabético", "Jeroglíficos", "Silabario", "Logográfico"), "Historia", "El sistema de escritura azteca era logográfico, utilizando pictogramas e ideogramas para representar palabras o conceptos, sin un alfabeto fonético completo.")
        ),
        BilingualQuestion(
            id = 12791, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien d'états vassaux tributaires l'Empire aztèque avait-il?", listOf("20", "40", "60", "80+"), "Histoire", "L'Empire aztèque, dirigé depuis Tenochtitlan, contrôlait une vaste zone de Mésoamérique via un système de tribut imposé à plus de 80 cités-États conquises, sans administration directe. Ces États vassaux devaient fournir régulièrement des biens précieux, des denrées et des victimes sacrificielles."),
            en = LocalizedContent("How many tributary vassal states did the Aztec Empire have?", listOf("20", "40", "60", "80+"), "History", "The Aztec Empire, ruled from Tenochtitlan, controlled a vast area of Mesoamerica through a tribute system imposed on over 80 conquered city-states, without direct administration. These vassal states had to regularly provide valuable goods, foodstuffs, and sacrificial victims."),
            zh = LocalizedContent("阿兹特克帝国有多少个纳贡的附属城邦？", listOf("20", "40", "60", "80+"), "历史", "阿兹特克帝国从特诺奇蒂特兰统治，通过向80多个被征服的城邦征收贡品来控制中美洲广大地区，而不进行直接管理。这些附属城邦必须定期提供贵重物品、粮食和祭祀牺牲品。"),
            es = LocalizedContent("¿Cuántos estados vasallos tributarios tenía el Imperio azteca?", listOf("20", "40", "60", "80+"), "Historia", "El Imperio azteca, gobernado desde Tenochtitlan, controlaba una vasta zona de Mesoamérica mediante un sistema de tributo impuesto a más de 80 ciudades-estado conquistadas, sin administración directa. Estos estados vasallos debían proporcionar regularmente bienes preciosos, alimentos y víctimas sacrificiales.")
        ),
        BilingualQuestion(
            id = 12792, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel empereur aztèque a établi l'empire?", listOf("Montezuma I", "Itzcoatl", "Tenochtitlan", "Huitzilihuitl"), "Histoire", "Itzcoatl, quatrième souverain mexica, a fondé la Triple Alliance en 1428 avec Texcoco et Tlacopan, posant ainsi les bases de l'empire aztèque."),
            en = LocalizedContent("Which Aztec emperor established the empire?", listOf("Montezuma I", "Itzcoatl", "Tenochtitlan", "Huitzilihuitl"), "History", "Itzcoatl, the fourth Mexica ruler, founded the Triple Alliance in 1428 with Texcoco and Tlacopan, thus laying the foundations of the Aztec Empire."),
            zh = LocalizedContent("哪位阿兹特克皇帝建立了帝国？", listOf("蒙特祖马一世", "伊茨科阿特尔", "特诺奇蒂特兰", "维齐利维特尔"), "历史", "伊茨科阿特尔，第四位墨西加统治者，于1428年与特斯科科和特拉科潘建立了三方联盟，从而奠定了阿兹特克帝国的基础。"),
            es = LocalizedContent("¿Qué emperador azteca estableció el imperio?", listOf("Montezuma I", "Itzcoatl", "Tenochtitlan", "Huitzilihuitl"), "Historia", "Itzcoatl, el cuarto gobernante mexica, fundó la Triple Alianza en 1428 con Texcoco y Tlacopan, sentando así las bases del Imperio azteca.")
        ),
        BilingualQuestion(
            id = 12793, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quelle était la main-d'œuvre principale dans l'Empire aztèque?", listOf("Esclaves", "Tributaires", "Paysans libres", "Serfs"), "Histoire", "Les Aztèques soumettaient les peuples conquis au versement d'un tribut en biens et en services, incluant des travailleurs pour les chantiers publics et l'agriculture."),
            en = LocalizedContent("What was the main labor force in the Aztec Empire?", listOf("Slaves", "Tribute laborers", "Free peasants", "Serfs"), "History", "The Aztecs subjected conquered peoples to the payment of tribute in goods and services, including workers for public works and agriculture."),
            zh = LocalizedContent("阿兹特克帝国的主要劳动力是什么？", listOf("奴隶", "贡赋劳工", "自由农民", "农奴"), "历史", "阿兹特克人迫使被征服的民族以物品和服务的形式缴纳贡赋，包括为公共工程和农业提供劳动力。"),
            es = LocalizedContent("¿Cuál era la principal fuerza laboral en el Imperio azteca?", listOf("Esclavos", "Tributarios", "Campesinos libres", "Siervos"), "Historia", "Los aztecas sometían a los pueblos conquistados al pago de tributo en bienes y servicios, incluyendo trabajadores para obras públicas y agricultura.")
        ),
        BilingualQuestion(
            id = 12794, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de pyramides avait le temple Templo Mayor?", listOf("1", "2", "3", "5"), "Histoire", "Le Templo Mayor, principal temple de la capitale aztèque Tenochtitlan, possédait deux pyramides jumelles dédiées aux dieux Huitzilopochtli et Tlaloc."),
            en = LocalizedContent("How many pyramids did the Templo Mayor have?", listOf("1", "2", "3", "5"), "History", "The Templo Mayor, the main temple of the Aztec capital Tenochtitlan, had two twin pyramids dedicated to the gods Huitzilopochtli and Tlaloc."),
            zh = LocalizedContent("大神庙有多少座金字塔？", listOf("1", "2", "3", "5"), "历史", "大神庙是阿兹特克首都特诺奇蒂特兰的主要神庙，拥有两座双子金字塔，分别供奉惠齐洛波奇特利和特拉洛克神。"),
            es = LocalizedContent("¿Cuántas pirámides tenía el Templo Mayor?", listOf("1", "2", "3", "5"), "Historia", "El Templo Mayor, el principal templo de la capital azteca Tenochtitlan, poseía dos pirámides gemelas dedicadas a los dioses Huitzilopochtli y Tlaloc.")
        ),
        BilingualQuestion(
            id = 12795, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel fut le dernier empereur aztèque?", listOf("Montezuma II", "Cuauhtemoc", "Axayacatl", "Moctezuma"), "Histoire", "Cuauhtemoc fut le dernier empereur aztèque, capturé par les Espagnols en 1521 lors de la chute de Tenochtitlan, mettant fin à l'empire."),
            en = LocalizedContent("Who was the last Aztec emperor?", listOf("Montezuma II", "Cuauhtemoc", "Axayacatl", "Moctezuma"), "History", "Cuauhtemoc was the last Aztec emperor, captured by the Spanish in 1521 during the fall of Tenochtitlan, ending the empire."),
            zh = LocalizedContent("最后一位阿兹特克皇帝是谁？", listOf("蒙特祖马二世", "夸乌特莫克", "阿哈亚卡特尔", "蒙特祖马"), "历史", "夸乌特莫克是最后一位阿兹特克皇帝，于1521年特诺奇蒂特兰陷落时被西班牙人俘虏，帝国随之灭亡。"),
            es = LocalizedContent("¿Quién fue el último emperador azteca?", listOf("Montezuma II", "Cuauhtemoc", "Axayacatl", "Moctezuma"), "Historia", "Cuauhtemoc fue el último emperador azteca, capturado por los españoles en 1521 durante la caída de Tenochtitlan, poniendo fin al imperio.")
        ),
        BilingualQuestion(
            id = 12796, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année le temple Templo Mayor a-t-il été redéouvert?", listOf("1700", "1800", "1900", "1978"), "Histoire", "Le Templo Mayor, le principal temple aztèque de Tenochtitlan, a été redécouvert en 1978 lors de travaux d'excavation pour le métro de Mexico, après des siècles d'enfouissement sous la ville moderne."),
            en = LocalizedContent("In which year was the Templo Mayor rediscovered?", listOf("1700", "1800", "1900", "1978"), "History", "The Templo Mayor, the main Aztec temple of Tenochtitlan, was rediscovered in 1978 during excavation work for the Mexico City metro, after centuries of burial under the modern city."),
            zh = LocalizedContent("大神庙在哪一年被重新发现？", listOf("1700", "1800", "1900", "1978"), "历史", "大神庙是特诺奇蒂特兰的主要阿兹特克神庙，在1978年墨西哥城地铁的挖掘工作中被重新发现，此前已被现代城市掩埋了数个世纪。"),
            es = LocalizedContent("¿En qué año fue redescubierto el Templo Mayor?", listOf("1700", "1800", "1900", "1978"), "Historia", "El Templo Mayor, el principal templo azteca de Tenochtitlan, fue redescubierto en 1978 durante trabajos de excavación para el metro de la Ciudad de México, después de siglos de enterramiento bajo la ciudad moderna.")
        ),
        BilingualQuestion(
            id = 12797, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Le xocolatl aztèque était préparé comment?", listOf("Sucré", "Amer épicé", "Laiteux", "Glacé"), "Histoire", "Le xocolatl était une boisson à base de fèves de cacao, d'eau et d'épices comme le piment, sans sucre, d'où son goût amer et épicé."),
            en = LocalizedContent("How was Aztec xocolatl prepared?", listOf("Sweet", "Spicy bitter", "Milky", "Iced"), "History", "Xocolatl was a drink made from cacao beans, water, and spices like chili, without sugar, hence its bitter and spicy taste."),
            zh = LocalizedContent("阿兹特克的xocolatl是如何制作的？", listOf("甜的", "辛辣苦的", "奶状的", "冰的"), "历史", "Xocolatl是一种用可可豆、水和辣椒等香料制成的饮料，不加糖，因此味道苦涩辛辣。"),
            es = LocalizedContent("¿Cómo se preparaba el xocolatl azteca?", listOf("Dulce", "Amargo picante", "Lácteo", "Helado"), "Historia", "El xocolatl era una bebida hecha de granos de cacao, agua y especias como chile, sin azúcar, de ahí su sabor amargo y picante.")
        ),
        BilingualQuestion(
            id = 12798, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de sous-empires composaient la Triple Alliance aztèque?", listOf("2", "3", "4", "5"), "Histoire", "La Triple Alliance aztèque était composée de trois cités-États : Tenochtitlan, Texcoco et Tlacopan."),
            en = LocalizedContent("How many sub-empires made up the Aztec Triple Alliance?", listOf("2", "3", "4", "5"), "History", "The Aztec Triple Alliance was composed of three city-states: Tenochtitlan, Texcoco, and Tlacopan."),
            zh = LocalizedContent("阿兹特克三方联盟由几个次级帝国组成？", listOf("2", "3", "4", "5"), "历史", "阿兹特克三方联盟由三个城邦组成：特诺奇蒂特兰、特斯科科和特拉科潘。"),
            es = LocalizedContent("¿Cuántos subimperios componían la Triple Alianza azteca?", listOf("2", "3", "4", "5"), "Historia", "La Triple Alianza azteca estaba compuesta por tres ciudades-estado: Tenochtitlan, Texcoco y Tlacopan.")
        ),
        BilingualQuestion(
            id = 12799, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel était le sport aztèque principal?", listOf("Jeu de balle", "Lutte", "Course", "Natation"), "Histoire", "Le jeu de balle, appelé tlachtli, était un rituel religieux et sportif central chez les Aztèques, souvent associé à des sacrifices humains."),
            en = LocalizedContent("What was the main Aztec sport?", listOf("Ball game", "Wrestling", "Running", "Swimming"), "History", "The ball game, called tlachtli, was a central religious and sporting ritual among the Aztecs, often associated with human sacrifices."),
            zh = LocalizedContent("阿兹特克人的主要运动是什么？", listOf("球类游戏", "摔跤", "跑步", "游泳"), "历史", "球类游戏，称为tlachtli，是阿兹特克人核心的宗教和体育仪式，常与活人祭祀相关。"),
            es = LocalizedContent("¿Cuál era el deporte principal de los aztecas?", listOf("Juego de pelota", "Lucha", "Carrera", "Natación"), "Historia", "El juego de pelota, llamado tlachtli, era un ritual religioso y deportivo central entre los aztecas, a menudo asociado con sacrificios humanos.")
        ),
        BilingualQuestion(
            id = 12800, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel tournoi de Dota 2 offre le plus grand prize pool?", listOf("International", "Majors", "Minors", "Regionals"), "Sport", "The International est le championnat du monde annuel de Dota 2, organisé par Valve, dont le prize pool est principalement financé par les achats du Battle Pass, atteignant des records comme 40 millions de dollars en 2021."),
            en = LocalizedContent("Which Dota 2 tournament offers the largest prize pool?", listOf("International", "Majors", "Minors", "Regionals"), "Sports", "The International is the annual world championship of Dota 2, organized by Valve, whose prize pool is primarily funded by Battle Pass purchases, reaching records like $40 million in 2021."),
            zh = LocalizedContent("哪个Dota 2赛事提供最高的奖金池？", listOf("国际邀请赛", "Major赛事", "Minor赛事", "地区赛"), "体育", "国际邀请赛是Dota 2的年度世界锦标赛，由Valve组织，其奖金池主要由勇士令状购买资助，2021年达到4000万美元的纪录。"),
            es = LocalizedContent("¿Qué torneo de Dota 2 ofrece el mayor pozo de premios?", listOf("International", "Majors", "Minors", "Regionals"), "Deportes", "The International es el campeonato mundial anual de Dota 2, organizado por Valve, cuyo pozo de premios se financia principalmente con las compras del Battle Pass, alcanzando récords como 40 millones de dólares en 2021.")
        ),
        BilingualQuestion(
            id = 12801, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Combien de joueurs par équipe en League of Legends compétitif?", listOf("3", "5", "7", "10"), "Sport", "En League of Legends compétitif, chaque équipe est composée de cinq joueurs, un par poste : top, jungle, mid, ADC et support."),
            en = LocalizedContent("How many players per team in competitive League of Legends?", listOf("3", "5", "7", "10"), "Sports", "In competitive League of Legends, each team consists of five players, one per position: top, jungle, mid, ADC, and support."),
            zh = LocalizedContent("竞技《英雄联盟》中每队有多少名玩家？", listOf("3", "5", "7", "10"), "体育", "在竞技《英雄联盟》中，每队由五名玩家组成，每个位置一人：上单、打野、中单、ADC和辅助。"),
            es = LocalizedContent("¿Cuántos jugadores por equipo en League of Legends competitivo?", listOf("3", "5", "7", "10"), "Deportes", "En League of Legends competitivo, cada equipo está compuesto por cinco jugadores, uno por puesto: top, jungla, mid, ADC y support.")
        ),
        BilingualQuestion(
            id = 12802, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel joueur de Valorant a le taux d'headshot le plus élevé?", listOf("TenZ", "Yay", "Asuna", "Cned"), "Sport", "Yay, joueur professionnel de Valorant, détient le record du plus haut taux de headshot en compétition, notamment grâce à son rôle de duelist et sa précision légendaire."),
            en = LocalizedContent("Which Valorant player has the highest headshot rate?", listOf("TenZ", "Yay", "Asuna", "Cned"), "Sports", "Yay, a professional Valorant player, holds the record for the highest headshot rate in competition, thanks to his role as a duelist and legendary accuracy."),
            zh = LocalizedContent("哪位《无畏契约》玩家的爆头率最高？", listOf("TenZ", "Yay", "Asuna", "Cned"), "体育", "Yay，一名职业《无畏契约》玩家，保持着比赛中最高爆头率的纪录，这得益于他的决斗者角色和传奇般的精准度。"),
            es = LocalizedContent("¿Qué jugador de Valorant tiene la tasa de headshot más alta?", listOf("TenZ", "Yay", "Asuna", "Cned"), "Deportes", "Yay, jugador profesional de Valorant, tiene el récord de la tasa de headshot más alta en competición, gracias a su papel de duelista y su legendaria precisión.")
        ),
        BilingualQuestion(
            id = 12803, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année la première esports Olympics a-t-elle eu lieu?", listOf("2018", "2022", "2024", "2026"), "Sport", "Le Comité International Olympique a officiellement lancé les Olympic Esports Games en 2026, marquant la première compétition esportive sous l'égide olympique."),
            en = LocalizedContent("In which year did the first esports Olympics take place?", listOf("2018", "2022", "2024", "2026"), "Sports", "The International Olympic Committee officially launched the Olympic Esports Games in 2026, marking the first esports competition under the Olympic umbrella."),
            zh = LocalizedContent("第一届电竞奥运会于哪一年举行？", listOf("2018", "2022", "2024", "2026"), "体育", "国际奥委会于2026年正式推出奥林匹克电竞运动会，标志着首次在奥运框架下举办的电竞赛事。"),
            es = LocalizedContent("¿En qué año se celebraron las primeras Olimpiadas de esports?", listOf("2018", "2022", "2024", "2026"), "Deportes", "El Comité Olímpico Internacional lanzó oficialmente los Juegos Olímpicos de Esports en 2026, marcando la primera competición de esports bajo el paraguas olímpico.")
        ),
        BilingualQuestion(
            id = 12804, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand tournoi de Counter-Strike?", listOf("ESL Pro League", "PGL Major", "IEM Katowice", "CS Masters"), "Sport", "IEM Katowice est considéré comme le plus grand tournoi de Counter-Strike en raison de son prestige historique, de son immense dotation et de son atmosphère légendaire dans la Spodek Arena."),
            en = LocalizedContent("What is the biggest Counter-Strike tournament?", listOf("ESL Pro League", "PGL Major", "IEM Katowice", "CS Masters"), "Sports", "IEM Katowice is considered the biggest Counter-Strike tournament due to its historical prestige, immense prize pool, and legendary atmosphere in the Spodek Arena."),
            zh = LocalizedContent("最大的《反恐精英》赛事是什么？", listOf("ESL Pro League", "PGL Major", "IEM Katowice", "CS Masters"), "体育", "IEM Katowice因其历史声望、巨额奖金池以及Spodek竞技场的传奇氛围，被认为是最大的《反恐精英》赛事。"),
            es = LocalizedContent("¿Cuál es el torneo más grande de Counter-Strike?", listOf("ESL Pro League", "PGL Major", "IEM Katowice", "CS Masters"), "Deportes", "IEM Katowice es considerado el torneo más grande de Counter-Strike debido a su prestigio histórico, su inmenso pozo de premios y su legendaria atmósfera en la Spodek Arena.")
        ),
        BilingualQuestion(
            id = 12805, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de millions de spectateurs les Worlds LoL 2022 ont-eux attiré?", listOf("50", "100", "300", "500"), "Sport", "Les Worlds 2022 de League of Legends ont atteint un pic de plus de 5 millions de spectateurs simultanés, mais environ 300 millions de personnes uniques ont regardé l'événement au total, ce qui en fait l'un des tournois d'esport les plus regardés."),
            en = LocalizedContent("How many million viewers did the 2022 LoL Worlds attract?", listOf("50", "100", "300", "500"), "Sports", "The 2022 League of Legends Worlds reached a peak of over 5 million concurrent viewers, but approximately 300 million unique viewers watched the event overall, making it one of the most-watched esports tournaments."),
            zh = LocalizedContent("2022年《英雄联盟》全球总决赛吸引了多少百万观众？", listOf("50", "100", "300", "500"), "体育", "2022年《英雄联盟》全球总决赛的同时观看人数峰值超过500万，但总共有约3亿独立观众观看了该赛事，使其成为观看人数最多的电竞赛事之一。"),
            es = LocalizedContent("¿Cuántos millones de espectadores atrajeron los Worlds 2022 de LoL?", listOf("50", "100", "300", "500"), "Deportes", "Los Worlds 2022 de League of Legends alcanzaron un pico de más de 5 millones de espectadores simultáneos, pero aproximadamente 300 millones de espectadores únicos vieron el evento en total, convirtiéndolo en uno de los torneos de esports más vistos.")
        ),
        BilingualQuestion(
            id = 12806, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel équipe a remporté le plus de titres LoL Worlds?", listOf("SKT T1", "Samsung", "Fnatic", "G2 Esports"), "Sport", "SKT T1 a remporté le championnat du monde de League of Legends à quatre reprises (2013, 2015, 2016, 2023), un record inégalé dans l'histoire de la compétition."),
            en = LocalizedContent("Which team has won the most LoL Worlds titles?", listOf("SKT T1", "Samsung", "Fnatic", "G2 Esports"), "Sports", "SKT T1 has won the League of Legends World Championship four times (2013, 2015, 2016, 2023), an unmatched record in the history of the competition."),
            zh = LocalizedContent("哪支战队赢得了最多的《英雄联盟》全球总决赛冠军？", listOf("SKT T1", "Samsung", "Fnatic", "G2 Esports"), "体育", "SKT T1四次赢得《英雄联盟》全球总决赛冠军（2013、2015、2016、2023），这是该赛事历史上无与伦比的纪录。"),
            es = LocalizedContent("¿Qué equipo ha ganado más títulos de Worlds de LoL?", listOf("SKT T1", "Samsung", "Fnatic", "G2 Esports"), "Deportes", "SKT T1 ha ganado el Campeonato Mundial de League of Legends cuatro veces (2013, 2015, 2016, 2023), un récord sin igual en la historia de la competición.")
        ),
        BilingualQuestion(
            id = 12807, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus haut salaire d'un joueur esports?", listOf("1 million", "5 millions", "10 millions", "20 millions"), "Sport", "Le joueur d'esports le mieux payé, notamment dans des jeux comme Fortnite ou League of Legends, peut atteindre 10 millions de dollars annuels grâce aux contrats, sponsors et gains de tournois."),
            en = LocalizedContent("What is the highest salary of an esports player?", listOf("1 million", "5 million", "10 million", "20 million"), "Sports", "The highest-paid esports player, particularly in games like Fortnite or League of Legends, can earn $10 million annually through contracts, sponsorships, and tournament winnings."),
            zh = LocalizedContent("电竞选手的最高薪资是多少？", listOf("100万", "500万", "1000万", "2000万"), "体育", "收入最高的电竞选手，尤其是在《堡垒之夜》或《英雄联盟》等游戏中，通过合同、赞助和赛事奖金每年可赚取1000万美元。"),
            es = LocalizedContent("¿Cuál es el salario más alto de un jugador de esports?", listOf("1 millón", "5 millones", "10 millones", "20 millones"), "Deportes", "El jugador de esports mejor pagado, particularmente en juegos como Fortnite o League of Legends, puede ganar 10 millones de dólares anuales gracias a contratos, patrocinios y ganancias de torneos.")
        ),
        BilingualQuestion(
            id = 12808, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de prix Nobel Gaming Awards a-t-on décernés?", listOf("0", "1", "2", "5"), "Sport", "Le Prix Nobel Gaming Awards n'existe pas. Aucun prix de ce nom n'a jamais été décerné, contrairement au vrai Prix Nobel."),
            en = LocalizedContent("How many Nobel Gaming Awards have been awarded?", listOf("0", "1", "2", "5"), "Sports", "The Nobel Gaming Awards do not exist. No award by this name has ever been given, unlike the real Nobel Prize."),
            zh = LocalizedContent("诺贝尔游戏奖已颁发过多少次？", listOf("0", "1", "2", "5"), "体育", "诺贝尔游戏奖并不存在。与真正的诺贝尔奖不同，从未颁发过任何以此命名的奖项。"),
            es = LocalizedContent("¿Cuántos Premios Nobel de Gaming se han otorgado?", listOf("0", "1", "2", "5"), "Deportes", "Los Premios Nobel de Gaming no existen. Nunca se ha otorgado ningún premio con este nombre, a diferencia del verdadero Premio Nobel.")
        ),
        BilingualQuestion(
            id = 12809, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le tournoi esports avec le plus grand audience?", listOf("Worlds LoL", "International Dota", "IEM Katowice", "Fortnite World Cup"), "Sport", "Les Worlds de League of Legends (LoL) sont le championnat du monde du jeu vidéo, attirant chaque année des dizaines de millions de spectateurs en ligne et en stade."),
            en = LocalizedContent("Which esports tournament has the largest audience?", listOf("Worlds LoL", "International Dota", "IEM Katowice", "Fortnite World Cup"), "Sports", "The League of Legends World Championship (Worlds) is the world championship of the video game, attracting tens of millions of viewers online and in stadiums each year."),
            zh = LocalizedContent("哪个电子竞技赛事的观众最多？", listOf("英雄联盟全球总决赛", "Dota 2国际邀请赛", "IEM卡托维兹", "堡垒之夜世界杯"), "体育", "英雄联盟全球总决赛（Worlds）是该游戏的世界锦标赛，每年吸引数千万在线和现场观众。"),
            es = LocalizedContent("¿Qué torneo de esports tiene la mayor audiencia?", listOf("Worlds LoL", "International Dota", "IEM Katowice", "Fortnite World Cup"), "Deportes", "El Campeonato Mundial de League of Legends (Worlds) es el campeonato mundial del videojuego, atrayendo decenas de millones de espectadores en línea y en estadios cada año.")
        ),
        BilingualQuestion(
            id = 12810, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de pays participent aux Esports Olympics?", listOf("20", "50", "100", "150+"), "Sport", "Les Esports Olympics ont réuni plus de 150 pays lors de leur première édition, reflétant la portée mondiale croissante du sport électronique."),
            en = LocalizedContent("How many countries participate in the Esports Olympics?", listOf("20", "50", "100", "150+"), "Sports", "The Esports Olympics brought together more than 150 countries in its first edition, reflecting the growing global reach of electronic sports."),
            zh = LocalizedContent("有多少个国家参加电子竞技奥运会？", listOf("20", "50", "100", "150+"), "体育", "电子竞技奥运会在首届赛事中汇集了超过150个国家，反映了电子体育日益增长的全球影响力。"),
            es = LocalizedContent("¿Cuántos países participan en las Olimpiadas de Esports?", listOf("20", "50", "100", "150+"), "Deportes", "Las Olimpiadas de Esports reunieron a más de 150 países en su primera edición, reflejando el creciente alcance global del deporte electrónico.")
        ),
        BilingualQuestion(
            id = 12811, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand casino d'esports du monde?", listOf("Las Vegas", "Dubaï", "Singapour", "Tokyo"), "Sport", "Le plus grand casino d'esports du monde, le Dubai Esports & Gaming Festival, se trouve à Dubaï, aux Émirats arabes unis, attirant des joueurs et spectateurs du monde entier."),
            en = LocalizedContent("What is the largest esports casino in the world?", listOf("Las Vegas", "Dubai", "Singapore", "Tokyo"), "Sports", "The largest esports casino in the world, the Dubai Esports & Gaming Festival, is located in Dubai, United Arab Emirates, attracting players and spectators from around the world."),
            zh = LocalizedContent("世界上最大的电子竞技赌场在哪里？", listOf("拉斯维加斯", "迪拜", "新加坡", "东京"), "体育", "世界上最大的电子竞技赌场——迪拜电子竞技与游戏节，位于阿拉伯联合酋长国的迪拜，吸引着来自世界各地的玩家和观众。"),
            es = LocalizedContent("¿Cuál es el casino de esports más grande del mundo?", listOf("Las Vegas", "Dubái", "Singapur", "Tokio"), "Deportes", "El casino de esports más grande del mundo, el Dubai Esports & Gaming Festival, se encuentra en Dubái, Emiratos Árabes Unidos, atrayendo a jugadores y espectadores de todo el mundo.")
        ),
        BilingualQuestion(
            id = 12812, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année les esports sont devenus médaille aux Jeux Asiatiques?", listOf("2018", "2022", "2026", "2030"), "Sport", "Les Jeux Asiatiques de 2022 à Hangzhou ont inclus les sports électroniques comme épreuve officielle, marquant une première dans l'histoire de cette compétition multisports."),
            en = LocalizedContent("In which year did esports become a medal event at the Asian Games?", listOf("2018", "2022", "2026", "2030"), "Sports", "The 2022 Asian Games in Hangzhou included esports as an official medal event, marking a first in the history of this multi-sport competition."),
            zh = LocalizedContent("电子竞技在哪一年成为亚运会的奖牌项目？", listOf("2018", "2022", "2026", "2030"), "体育", "2022年杭州亚运会将电子竞技列为正式奖牌项目，这在亚运会历史上尚属首次。"),
            es = LocalizedContent("¿En qué año los esports se convirtieron en evento de medalla en los Juegos Asiáticos?", listOf("2018", "2022", "2026", "2030"), "Deportes", "Los Juegos Asiáticos de 2022 en Hangzhou incluyeron los esports como evento oficial de medalla, marcando un hito en la historia de esta competición multideportiva.")
        ),
        BilingualQuestion(
            id = 12813, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le meilleur joueur de Valorant de tous les temps?", listOf("TenZ", "Yay", "Mixwell", "Derke"), "Sport", "TenZ est largement reconnu comme le meilleur joueur de Valorant pour ses performances dominantes en compétition, notamment son titre de MVP au Masters de Reykjavik 2021."),
            en = LocalizedContent("Who is the best Valorant player of all time?", listOf("TenZ", "Yay", "Mixwell", "Derke"), "Sports", "TenZ is widely recognized as the best Valorant player of all time for his dominant competitive performances, including his MVP title at the 2021 Masters Reykjavik."),
            zh = LocalizedContent("谁是史上最优秀的《无畏契约》玩家？", listOf("TenZ", "Yay", "Mixwell", "Derke"), "体育", "TenZ被广泛认为是史上最优秀的《无畏契约》玩家，他在比赛中表现卓越，包括在2021年雷克雅未克大师赛上获得MVP称号。"),
            es = LocalizedContent("¿Quién es el mejor jugador de Valorant de todos los tiempos?", listOf("TenZ", "Yay", "Mixwell", "Derke"), "Deportes", "TenZ es ampliamente reconocido como el mejor jugador de Valorant de todos los tiempos por sus actuaciones dominantes en competición, incluido su título de MVP en el Masters de Reikiavik 2021.")
        ),
        BilingualQuestion(
            id = 12814, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de prisepools les esports ont-elles distribuées en 2023?", listOf("500 millions", "1 milliard", "2 milliards", "5 milliards"), "Sport", "En 2023, les compétitions d'esports ont distribué plus d'un milliard de dollars de prix cumulés, un record historique porté par la croissance des jeux comme Dota 2 et Fortnite."),
            en = LocalizedContent("How much prize money did esports distribute in 2023?", listOf("500 million", "1 billion", "2 billion", "5 billion"), "Sports", "In 2023, esports competitions distributed over one billion dollars in cumulative prize money, a historic record driven by the growth of games like Dota 2 and Fortnite."),
            zh = LocalizedContent("2023年电子竞技赛事发放了多少奖金？", listOf("5亿", "10亿", "20亿", "50亿"), "体育", "2023年，电子竞技赛事累计发放了超过10亿美元的奖金，创下历史纪录，这得益于《Dota 2》和《堡垒之夜》等游戏的发展。"),
            es = LocalizedContent("¿Cuánto dinero en premios distribuyeron los esports en 2023?", listOf("500 millones", "1 billón", "2 billones", "5 billones"), "Deportes", "En 2023, las competiciones de esports distribuyeron más de mil millones de dólares en premios acumulados, un récord histórico impulsado por el crecimiento de juegos como Dota 2 y Fortnite.")
        ),
        BilingualQuestion(
            id = 12815, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel joueur de LoL a le plus de titres Worlds?", listOf("Faker", "Score", "Pawn", "Duke"), "Sport", "Faker, joueur sud-coréen de T1, détient le record avec quatre titres de champion du monde de League of Legends (2013, 2015, 2016, 2023)."),
            en = LocalizedContent("Which LoL player has the most World Championship titles?", listOf("Faker", "Score", "Pawn", "Duke"), "Sports", "Faker, a South Korean player from T1, holds the record with four World Championship titles in League of Legends (2013, 2015, 2016, 2023)."),
            zh = LocalizedContent("哪位《英雄联盟》选手拥有最多的全球总决赛冠军？", listOf("Faker", "Score", "Pawn", "Duke"), "体育", "Faker，来自T1的韩国选手，以四个《英雄联盟》全球总决赛冠军（2013、2015、2016、2023）保持纪录。"),
            es = LocalizedContent("¿Qué jugador de LoL tiene más títulos de Campeonato Mundial?", listOf("Faker", "Score", "Pawn", "Duke"), "Deportes", "Faker, jugador surcoreano de T1, ostenta el récord con cuatro títulos de Campeonato Mundial de League of Legends (2013, 2015, 2016, 2023).")
        ),
        BilingualQuestion(
            id = 12816, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de millions de fans esports existent globalement?", listOf("100", "250", "500", "1000"), "Sport", "Le nombre de fans d'esports dans le monde dépasse le milliard, soit environ 1000 millions, selon les estimations récentes de l'industrie."),
            en = LocalizedContent("How many millions of esports fans exist globally?", listOf("100", "250", "500", "1000"), "Sports", "The number of esports fans worldwide exceeds one billion, or about 1000 million, according to recent industry estimates."),
            zh = LocalizedContent("全球有多少百万电子竞技粉丝？", listOf("100", "250", "500", "1000"), "体育", "根据最近的行业估计，全球电子竞技粉丝数量超过10亿，即约1000百万。"),
            es = LocalizedContent("¿Cuántos millones de fans de esports existen a nivel global?", listOf("100", "250", "500", "1000"), "Deportes", "El número de fans de esports en todo el mundo supera los mil millones, es decir, unos 1000 millones, según estimaciones recientes de la industria.")
        ),
        BilingualQuestion(
            id = 12817, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel tournoi de Dota 2 a le record de prize pool?", listOf("TI10", "TI9", "TI11", "TI12"), "Sport", "TI9, ou The International 2019, détient le record du plus gros prize pool de l'histoire de Dota 2, atteignant plus de 34 millions de dollars grâce au financement participatif via le Battle Pass."),
            en = LocalizedContent("Which Dota 2 tournament holds the record for the largest prize pool?", listOf("TI10", "TI9", "TI11", "TI12"), "Sports", "TI9, or The International 2019, holds the record for the largest prize pool in Dota 2 history, reaching over $34 million through crowdfunding via the Battle Pass."),
            zh = LocalizedContent("哪个《Dota 2》赛事拥有最高的奖金池纪录？", listOf("TI10", "TI9", "TI11", "TI12"), "体育", "TI9，即2019年国际邀请赛，保持着《Dota 2》历史上最高的奖金池纪录，通过勇士令状的众筹达到了超过3400万美元。"),
            es = LocalizedContent("¿Qué torneo de Dota 2 tiene el récord del mayor pozo de premios?", listOf("TI10", "TI9", "TI11", "TI12"), "Deportes", "TI9, o The International 2019, ostenta el récord del mayor pozo de premios en la historia de Dota 2, alcanzando más de 34 millones de dólares gracias al crowdfunding a través del Battle Pass.")
        ),
        BilingualQuestion(
            id = 12818, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel pays domine les esports par nombre de joueurs pro?", listOf("Corée du Sud", "Chine", "USA", "Suède"), "Sport", "La Chine est le pays qui compte le plus grand nombre de joueurs professionnels d'esports au monde, grâce à une forte culture du jeu vidéo et à des investissements massifs dans l'industrie."),
            en = LocalizedContent("Which country dominates esports by number of pro players?", listOf("South Korea", "China", "USA", "Sweden"), "Sports", "China is the country with the largest number of professional esports players in the world, thanks to a strong gaming culture and massive investments in the industry."),
            zh = LocalizedContent("哪个国家在职业选手数量上主导电子竞技？", listOf("韩国", "中国", "美国", "瑞典"), "体育", "中国是世界上拥有最多电子竞技职业选手的国家，这得益于浓厚的游戏文化和对该行业的大量投资。"),
            es = LocalizedContent("¿Qué país domina los esports por número de jugadores profesionales?", listOf("Corea del Sur", "China", "EE. UU.", "Suecia"), "Deportes", "China es el país con el mayor número de jugadores profesionales de esports del mundo, gracias a una fuerte cultura del juego y a inversiones masivas en la industria.")
        ),
        BilingualQuestion(
            id = 12819, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année Twitch a-t-elle été acquise par Amazon?", listOf("2012", "2014", "2016", "2018"), "Sport", "Amazon a acquis Twitch en 2014 pour 970 millions de dollars, renforçant ainsi sa présence dans le secteur du streaming de jeux vidéo."),
            en = LocalizedContent("In what year was Twitch acquired by Amazon?", listOf("2012", "2014", "2016", "2018"), "Sports", "Amazon acquired Twitch in 2014 for $970 million, strengthening its presence in the video game streaming sector."),
            zh = LocalizedContent("Twitch在哪一年被亚马逊收购？", listOf("2012", "2014", "2016", "2018"), "体育", "亚马逊于2014年以9.7亿美元收购了Twitch，从而加强了其在游戏直播领域的影响力。"),
            es = LocalizedContent("¿En qué año fue adquirida Twitch por Amazon?", listOf("2012", "2014", "2016", "2018"), "Deportes", "Amazon adquirió Twitch en 2014 por 970 millones de dólares, fortaleciendo su presencia en el sector de streaming de videojuegos.")
        ),
        BilingualQuestion(
            id = 12820, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quelle est la taille d'un nanomètre?", listOf("10^-6m", "10^-9m", "10^-12m", "10^-15m"), "Science", "Un nanomètre correspond à un milliardième de mètre, soit 10^-9 mètre, une unité utilisée pour mesurer des objets à l'échelle atomique et moléculaire."),
            en = LocalizedContent("What is the size of a nanometer?", listOf("10^-6m", "10^-9m", "10^-12m", "10^-15m"), "Science", "A nanometer is one billionth of a meter, or 10^-9 meter, a unit used to measure objects at the atomic and molecular scale."),
            zh = LocalizedContent("一纳米有多大？", listOf("10^-6米", "10^-9米", "10^-12米", "10^-15米"), "科学", "一纳米等于十亿分之一米，即10^-9米，用于测量原子和分子尺度的物体。"),
            es = LocalizedContent("¿Cuál es el tamaño de un nanómetro?", listOf("10^-6m", "10^-9m", "10^-12m", "10^-15m"), "Ciencia", "Un nanómetro es la milmillonésima parte de un metro, o 10^-9 metros, una unidad utilizada para medir objetos a escala atómica y molecular.")
        ),
        BilingualQuestion(
            id = 12821, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien d'atomes peuvent tenir sur la pointe d'une aiguille?", listOf("Millions", "Milliards", "Trillions", "Quadrillions"), "Science", "La pointe d'une aiguille, bien que minuscule, contient des milliards d'atomes en raison de leur taille nanométrique. Un atome mesure environ 0,1 nanomètre, permettant d'en aligner des millions sur une surface de quelques micromètres carrés."),
            en = LocalizedContent("How many atoms can fit on the tip of a needle?", listOf("Millions", "Billions", "Trillions", "Quadrillions"), "Science", "The tip of a needle, though tiny, contains billions of atoms due to their nanoscale size. An atom is about 0.1 nanometer, allowing millions to align on a surface of a few square micrometers."),
            zh = LocalizedContent("针尖上能容纳多少个原子？", listOf("数百万", "数十亿", "数万亿", "数千万亿"), "科学", "针尖虽然微小，但由于原子尺寸在纳米级别，它包含数十亿个原子。一个原子约0.1纳米，可以在几平方微米的表面上排列数百万个。"),
            es = LocalizedContent("¿Cuántos átomos caben en la punta de una aguja?", listOf("Millones", "Miles de millones", "Billones", "Cuatrillones"), "Ciencia", "La punta de una aguja, aunque diminuta, contiene miles de millones de átomos debido a su tamaño nanométrico. Un átomo mide aproximadamente 0,1 nanómetros, permitiendo alinear millones en una superficie de unos pocos micrómetros cuadrados.")
        ),
        BilingualQuestion(
            id = 12822, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est l'application principale des nanotubes de carbone?", listOf("Électronique", "Batterie", "Tissu", "Médicine"), "Science", "Les nanotubes de carbone sont utilisés dans les batteries pour améliorer la conductivité électrique et la capacité de stockage d'énergie, notamment dans les batteries lithium-ion."),
            en = LocalizedContent("What is the main application of carbon nanotubes?", listOf("Electronics", "Battery", "Fabric", "Medicine"), "Science", "Carbon nanotubes are used in batteries to improve electrical conductivity and energy storage capacity, especially in lithium-ion batteries."),
            zh = LocalizedContent("碳纳米管的主要应用是什么？", listOf("电子", "电池", "织物", "医学"), "科学", "碳纳米管用于电池中，以提高导电性和储能能力，特别是在锂离子电池中。"),
            es = LocalizedContent("¿Cuál es la aplicación principal de los nanotubos de carbono?", listOf("Electrónica", "Batería", "Tejido", "Medicina"), "Ciencia", "Los nanotubos de carbono se utilizan en baterías para mejorar la conductividad eléctrica y la capacidad de almacenamiento de energía, especialmente en baterías de iones de litio.")
        ),
        BilingualQuestion(
            id = 12823, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de fois plus fort un nanotube de carbone que l'acier?", listOf("5x", "10x", "50x", "100x"), "Science", "Les nanotubes de carbone possèdent une structure hexagonale en feuillet d'atomes de carbone, leur conférant une résistance à la traction environ 100 fois supérieure à celle de l'acier, tout en étant beaucoup plus légers."),
            en = LocalizedContent("How many times stronger is a carbon nanotube than steel?", listOf("5x", "10x", "50x", "100x"), "Science", "Carbon nanotubes have a hexagonal sheet structure of carbon atoms, giving them a tensile strength about 100 times greater than steel, while being much lighter."),
            zh = LocalizedContent("碳纳米管比钢强多少倍？", listOf("5倍", "10倍", "50倍", "100倍"), "科学", "碳纳米管具有碳原子的六边形片状结构，使其抗拉强度约为钢的100倍，同时重量轻得多。"),
            es = LocalizedContent("¿Cuántas veces más resistente es un nanotubo de carbono que el acero?", listOf("5x", "10x", "50x", "100x"), "Ciencia", "Los nanotubos de carbono poseen una estructura hexagonal en lámina de átomos de carbono, lo que les confiere una resistencia a la tracción aproximadamente 100 veces superior a la del acero, siendo mucho más ligeros.")
        ),
        BilingualQuestion(
            id = 12824, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus petit transistor jamais créé?", listOf("3 nm", "5 nm", "7 nm", "1 nm"), "Science", "En 2016, des chercheurs du Laboratoire national de Lawrence Berkeley ont fabriqué un transistor avec une grille de seulement 1 nanomètre, repoussant les limites de la miniaturisation des composants électroniques."),
            en = LocalizedContent("What is the smallest transistor ever created?", listOf("3 nm", "5 nm", "7 nm", "1 nm"), "Science", "In 2016, researchers at Lawrence Berkeley National Laboratory fabricated a transistor with a gate of only 1 nanometer, pushing the limits of miniaturization of electronic components."),
            zh = LocalizedContent("有史以来最小的晶体管是多大？", listOf("3纳米", "5纳米", "7纳米", "1纳米"), "科学", "2016年，劳伦斯伯克利国家实验室的研究人员制造了一个栅极仅为1纳米的晶体管，突破了电子元件小型化的极限。"),
            es = LocalizedContent("¿Cuál es el transistor más pequeño jamás creado?", listOf("3 nm", "5 nm", "7 nm", "1 nm"), "Ciencia", "En 2016, investigadores del Laboratorio Nacional Lawrence Berkeley fabricaron un transistor con una puerta de solo 1 nanómetro, superando los límites de la miniaturización de componentes electrónicos.")
        ),
        BilingualQuestion(
            id = 12825, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quelle technique permet de voir les atomes?", listOf("Microscope optique", "Microscope électronique", "Microscope à force atomique", "Loupe"), "Science", "Le microscope à force atomique utilise une sonde qui effleure la surface d'un échantillon pour cartographier ses atomes, contrairement aux microscopes optiques limités par la longueur d'onde de la lumière."),
            en = LocalizedContent("Which technique allows seeing atoms?", listOf("Optical microscope", "Electron microscope", "Atomic force microscope", "Magnifying glass"), "Science", "The atomic force microscope uses a probe that scans the surface of a sample to map its atoms, unlike optical microscopes limited by the wavelength of light."),
            zh = LocalizedContent("哪种技术可以观察到原子？", listOf("光学显微镜", "电子显微镜", "原子力显微镜", "放大镜"), "科学", "原子力显微镜使用探针扫描样品表面以绘制原子图，而光学显微镜受限于光的波长。"),
            es = LocalizedContent("¿Qué técnica permite ver los átomos?", listOf("Microscopio óptico", "Microscopio electrónico", "Microscopio de fuerza atómica", "Lupa"), "Ciencia", "El microscopio de fuerza atómica utiliza una sonda que roza la superficie de una muestra para cartografiar sus átomos, a diferencia de los microscopios ópticos limitados por la longitud de onda de la luz.")
        ),
        BilingualQuestion(
            id = 12826, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien d'atomes de carbonne ont le graphène?", listOf("1 par nanomètre carré", "Millions", "Un seul", "Infini"), "Science", "Le graphène est un matériau bidimensionnel composé d'une seule couche d'atomes de carbone. Sa structure en nid d'abeille contient environ un atome par nanomètre carré."),
            en = LocalizedContent("How many carbon atoms does graphene have?", listOf("1 per square nanometer", "Millions", "A single one", "Infinite"), "Science", "Graphene is a two-dimensional material composed of a single layer of carbon atoms. Its honeycomb structure contains about one atom per square nanometer."),
            zh = LocalizedContent("石墨烯有多少个碳原子？", listOf("每平方纳米一个", "数百万", "一个", "无限"), "科学", "石墨烯是一种由单层碳原子组成的二维材料。其蜂窝状结构每平方纳米约含一个原子。"),
            es = LocalizedContent("¿Cuántos átomos de carbono tiene el grafeno?", listOf("1 por nanómetro cuadrado", "Millones", "Uno solo", "Infinito"), "Ciencia", "El grafeno es un material bidimensional compuesto por una sola capa de átomos de carbono. Su estructura en panal contiene aproximadamente un átomo por nanómetro cuadrado.")
        ),
        BilingualQuestion(
            id = 12827, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quelle est la conductivité thermique du graphène?", listOf("1x", "10x", "100x", "5000x"), "Science", "Le graphène possède une conductivité thermique exceptionnelle, environ 5000 W/mK, grâce à la structure en nid d'abeille de ses atomes de carbone qui permet une transmission très efficace de la chaleur par les vibrations du réseau."),
            en = LocalizedContent("What is the thermal conductivity of graphene?", listOf("1x", "10x", "100x", "5000x"), "Science", "Graphene has exceptional thermal conductivity, about 5000 W/mK, due to the honeycomb structure of its carbon atoms, which allows very efficient heat transfer through lattice vibrations."),
            zh = LocalizedContent("石墨烯的热导率是多少？", listOf("1倍", "10倍", "100倍", "5000倍"), "科学", "石墨烯具有出色的热导率，约5000 W/mK，这得益于其碳原子的蜂窝状结构，通过晶格振动实现高效的热传递。"),
            es = LocalizedContent("¿Cuál es la conductividad térmica del grafeno?", listOf("1x", "10x", "100x", "5000x"), "Ciencia", "El grafeno posee una conductividad térmica excepcional, de aproximadamente 5000 W/mK, gracias a la estructura en panal de sus átomos de carbono, que permite una transmisión muy eficiente del calor mediante vibraciones de la red.")
        ),
        BilingualQuestion(
            id = 12828, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel nanomatériau est transparent et conducteur?", listOf("Graphène", "Oxyde de graphène", "Nanotube", "Nanoparticule d'or"), "Science", "L'oxyde de graphène est un dérivé du graphène qui conserve sa conductivité électrique tout en devenant transparent, ce qui le rend utile pour les écrans tactiles et les cellules solaires."),
            en = LocalizedContent("Which nanomaterial is transparent and conductive?", listOf("Graphene", "Graphene oxide", "Nanotube", "Gold nanoparticle"), "Science", "Graphene oxide is a derivative of graphene that retains its electrical conductivity while becoming transparent, making it useful for touch screens and solar cells."),
            zh = LocalizedContent("哪种纳米材料既透明又导电？", listOf("石墨烯", "氧化石墨烯", "纳米管", "金纳米粒子"), "科学", "氧化石墨烯是石墨烯的衍生物，在保持导电性的同时变得透明，因此可用于触摸屏和太阳能电池。"),
            es = LocalizedContent("¿Qué nanomaterial es transparente y conductor?", listOf("Grafeno", "Óxido de grafeno", "Nanotubo", "Nanopartícula de oro"), "Ciencia", "El óxido de grafeno es un derivado del grafeno que conserva su conductividad eléctrica mientras se vuelve transparente, lo que lo hace útil para pantallas táctiles y células solares.")
        ),
        BilingualQuestion(
            id = 12829, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de couches a une nanofeuille?", listOf("1", "10", "100", "1000"), "Science", "Une nanofeuille est un matériau bidimensionnel dont l'épaisseur est de l'ordre du nanomètre, ce qui correspond à une seule couche atomique ou moléculaire."),
            en = LocalizedContent("How many layers does a nanosheet have?", listOf("1", "10", "100", "1000"), "Science", "A nanosheet is a two-dimensional material with a thickness on the order of a nanometer, corresponding to a single atomic or molecular layer."),
            zh = LocalizedContent("纳米片有多少层？", listOf("1", "10", "100", "1000"), "科学", "纳米片是一种二维材料，其厚度在纳米量级，相当于单个原子或分子层。"),
            es = LocalizedContent("¿Cuántas capas tiene una nanohoja?", listOf("1", "10", "100", "1000"), "Ciencia", "Una nanohoja es un material bidimensional cuyo grosor es del orden del nanómetro, lo que corresponde a una sola capa atómica o molecular.")
        ),
        BilingualQuestion(
            id = 12830, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quelle est la surface spécifique du graphène?", listOf("100 m2/g", "1000 m2/g", "2600 m2/g", "10000 m2/g"), "Science", "Le graphène, une seule couche d'atomes de carbone, possède une surface spécifique théorique de 2630 m²/g, car chaque atome est exposé. Cette valeur record vient de sa structure bidimensionnelle extrêmement fine."),
            en = LocalizedContent("What is the specific surface area of graphene?", listOf("100 m2/g", "1000 m2/g", "2600 m2/g", "10000 m2/g"), "Science", "Graphene, a single layer of carbon atoms, has a theoretical specific surface area of 2630 m²/g because every atom is exposed. This record value comes from its extremely thin two-dimensional structure."),
            zh = LocalizedContent("石墨烯的比表面积是多少？", listOf("100 m2/g", "1000 m2/g", "2600 m2/g", "10000 m2/g"), "科学", "石墨烯是单层碳原子，每个原子都暴露在外，理论比表面积为2630 m²/g。这一创纪录的值源于其极薄的二维结构。"),
            es = LocalizedContent("¿Cuál es la superficie específica del grafeno?", listOf("100 m2/g", "1000 m2/g", "2600 m2/g", "10000 m2/g"), "Ciencia", "El grafeno, una sola capa de átomos de carbono, tiene una superficie específica teórica de 2630 m²/g, ya que cada átomo está expuesto. Este valor récord proviene de su estructura bidimensional extremadamente fina.")
        ),
        BilingualQuestion(
            id = 12831, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le diamètre d'un nanotube de carbone?", listOf("1 nm", "10 nm", "100 nm", "1000 nm"), "Science", "Un nanotube de carbone a typiquement un diamètre d'environ 10 nanomètres, soit 10 milliardièmes de mètre, ce qui le rend 100 000 fois plus fin qu'un cheveu humain."),
            en = LocalizedContent("What is the diameter of a carbon nanotube?", listOf("1 nm", "10 nm", "100 nm", "1000 nm"), "Science", "A carbon nanotube typically has a diameter of about 10 nanometers, or 10 billionths of a meter, making it 100,000 times thinner than a human hair."),
            zh = LocalizedContent("碳纳米管的直径是多少？", listOf("1 nm", "10 nm", "100 nm", "1000 nm"), "科学", "碳纳米管的直径通常约为10纳米，即100亿分之一米，比人类头发细10万倍。"),
            es = LocalizedContent("¿Cuál es el diámetro de un nanotubo de carbono?", listOf("1 nm", "10 nm", "100 nm", "1000 nm"), "Ciencia", "Un nanotubo de carbono tiene típicamente un diámetro de unos 10 nanómetros, o 10 milmillonésimas de metro, lo que lo hace 100.000 veces más fino que un cabello humano.")
        ),
        BilingualQuestion(
            id = 12832, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quelle propriété quantique les nanoparticules exploitent-elles?", listOf("Confinement quantique", "Intrication", "Superposition", "Décohérence"), "Science", "Le confinement quantique se produit lorsque la taille d'une particule est réduite à l'échelle nanométrique, modifiant ses propriétés électroniques et optiques par rapport au matériau massif."),
            en = LocalizedContent("Which quantum property do nanoparticles exploit?", listOf("Quantum confinement", "Entanglement", "Superposition", "Decoherence"), "Science", "Quantum confinement occurs when a particle's size is reduced to the nanoscale, altering its electronic and optical properties compared to the bulk material."),
            zh = LocalizedContent("纳米粒子利用哪种量子特性？", listOf("量子限域", "纠缠", "叠加", "退相干"), "科学", "当粒子尺寸缩小到纳米尺度时，会发生量子限域效应，改变其电子和光学性质，与块体材料不同。"),
            es = LocalizedContent("¿Qué propiedad cuántica explotan las nanopartículas?", listOf("Confinamiento cuántico", "Entrelazamiento", "Superposición", "Decoherencia"), "Ciencia", "El confinamiento cuántico ocurre cuando el tamaño de una partícula se reduce a la escala nanométrica, alterando sus propiedades electrónicas y ópticas en comparación con el material masivo.")
        ),
        BilingualQuestion(
            id = 12833, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Combien de couches le graphène monocouche a-t-elle?", listOf("1", "2", "3", "10"), "Science", "Le graphène monocouche est une forme de carbone constituée d'une seule couche d'atomes arrangés en réseau hexagonal, d'où son nom."),
            en = LocalizedContent("How many layers does monolayer graphene have?", listOf("1", "2", "3", "10"), "Science", "Monolayer graphene is a form of carbon consisting of a single layer of atoms arranged in a hexagonal lattice, hence its name."),
            zh = LocalizedContent("单层石墨烯有多少层？", listOf("1", "2", "3", "10"), "科学", "单层石墨烯是由单层碳原子以六边形晶格排列而成的碳形式，因此得名。"),
            es = LocalizedContent("¿Cuántas capas tiene el grafeno monocapa?", listOf("1", "2", "3", "10"), "Ciencia", "El grafeno monocapa es una forma de carbono compuesta por una sola capa de átomos dispuestos en una red hexagonal, de ahí su nombre.")
        ),
        BilingualQuestion(
            id = 12834, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est l'application médicale des nanoparticules d'or?", listOf("Thérapie génique", "Imagerie", "Libération de médicaments", "Détection de cancer"), "Science", "Les nanoparticules d'or s'accumulent dans les tumeurs et réfléchissent la lumière, permettant une imagerie plus précise pour détecter les cancers à un stade précoce."),
            en = LocalizedContent("What is the medical application of gold nanoparticles?", listOf("Gene therapy", "Imaging", "Drug delivery", "Cancer detection"), "Science", "Gold nanoparticles accumulate in tumors and reflect light, enabling more precise imaging to detect cancers at an early stage."),
            zh = LocalizedContent("金纳米粒子的医学应用是什么？", listOf("基因治疗", "成像", "药物递送", "癌症检测"), "科学", "金纳米粒子在肿瘤中积累并反射光线，能够实现更精确的成像，从而在早期阶段检测癌症。"),
            es = LocalizedContent("¿Cuál es la aplicación médica de las nanopartículas de oro?", listOf("Terapia génica", "Imagenología", "Liberación de fármacos", "Detección de cáncer"), "Ciencia", "Las nanopartículas de oro se acumulan en los tumores y reflejan la luz, permitiendo una imagen más precisa para detectar cánceres en una etapa temprana.")
        ),
        BilingualQuestion(
            id = 12835, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quelle est la résistance mécanique du graphène?", listOf("1 GPa", "10 GPa", "130 GPa", "1000 GPa"), "Science", "Le graphène est le matériau le plus résistant jamais testé, avec une résistance à la traction d'environ 130 GPa, soit plus de 100 fois celle de l'acier."),
            en = LocalizedContent("What is the mechanical strength of graphene?", listOf("1 GPa", "10 GPa", "130 GPa", "1000 GPa"), "Science", "Graphene is the strongest material ever tested, with a tensile strength of about 130 GPa, more than 100 times that of steel."),
            zh = LocalizedContent("石墨烯的机械强度是多少？", listOf("1 GPa", "10 GPa", "130 GPa", "1000 GPa"), "科学", "石墨烯是迄今测试过的最强材料，抗拉强度约为130 GPa，是钢的100倍以上。"),
            es = LocalizedContent("¿Cuál es la resistencia mecánica del grafeno?", listOf("1 GPa", "10 GPa", "130 GPa", "1000 GPa"), "Ciencia", "El grafeno es el material más resistente jamás probado, con una resistencia a la tracción de aproximadamente 130 GPa, más de 100 veces la del acero.")
        ),
        BilingualQuestion(
            id = 12836, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de transistors tendraient dans 1 micromètre carré?", listOf("Millions", "Milliards", "Trillions", "Quadrillions"), "Science", "Les transistors modernes mesurent quelques nanomètres, permettant d'en placer des milliards sur une puce. Un micromètre carré peut donc en contenir des trillions."),
            en = LocalizedContent("How many transistors would fit in 1 square micrometer?", listOf("Millions", "Billions", "Trillions", "Quadrillions"), "Science", "Modern transistors measure a few nanometers, allowing billions to be placed on a chip. A square micrometer can therefore contain trillions."),
            zh = LocalizedContent("1平方微米内能容纳多少晶体管？", listOf("百万", "十亿", "万亿", "千万亿"), "科学", "现代晶体管尺寸为几纳米，因此可以在芯片上放置数十亿个。一平方微米可以容纳数万亿个。"),
            es = LocalizedContent("¿Cuántos transistores cabrían en 1 micrómetro cuadrado?", listOf("Millones", "Miles de millones", "Billones", "Cuatrillones"), "Ciencia", "Los transistores modernos miden unos pocos nanómetros, lo que permite colocar miles de millones en un chip. Un micrómetro cuadrado puede contener billones.")
        ),
        BilingualQuestion(
            id = 12837, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le coût actuel du graphène par gramme?", listOf("0,001€", "0,1€", "1€", "100€"), "Science", "Le graphène est un matériau extrêmement coûteux à produire en raison des procédés complexes nécessaires, mais son prix a chuté grâce aux progrès de fabrication, atteignant environ 1€ par gramme pour certaines qualités."),
            en = LocalizedContent("What is the current cost of graphene per gram?", listOf("€0.001", "€0.1", "€1", "€100"), "Science", "Graphene is extremely expensive to produce due to complex processes, but its price has dropped thanks to manufacturing advances, reaching about €1 per gram for certain qualities."),
            zh = LocalizedContent("目前石墨烯每克的价格是多少？", listOf("0.001欧元", "0.1欧元", "1欧元", "100欧元"), "科学", "由于工艺复杂，石墨烯的生产成本极高，但随着制造技术的进步，其价格已下降，某些品质的石墨烯约为每克1欧元。"),
            es = LocalizedContent("¿Cuál es el costo actual del grafeno por gramo?", listOf("0,001€", "0,1€", "1€", "100€"), "Ciencia", "El grafeno es extremadamente costoso de producir debido a los procesos complejos, pero su precio ha bajado gracias a los avances en fabricación, alcanzando aproximadamente 1€ por gramo para ciertas calidades.")
        ),
        BilingualQuestion(
            id = 12838, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien d'années avant que la nanoscience atteigne la production de masse?", listOf("2", "5", "10", "20"), "Science", "La nanoscience est encore en phase de recherche et développement, et les experts estiment qu'il faudra environ 10 ans avant que ses applications atteignent une production industrielle à grande échelle."),
            en = LocalizedContent("How many years before nanoscience reaches mass production?", listOf("2", "5", "10", "20"), "Science", "Nanoscience is still in the research and development phase, and experts estimate it will take about 10 years before its applications achieve large-scale industrial production."),
            zh = LocalizedContent("纳米科学还需要多少年才能实现大规模生产？", listOf("2", "5", "10", "20"), "科学", "纳米科学仍处于研发阶段，专家估计大约需要10年时间，其应用才能实现大规模工业生产。"),
            es = LocalizedContent("¿Cuántos años faltan para que la nanociencia alcance la producción en masa?", listOf("2", "5", "10", "20"), "Ciencia", "La nanociencia todavía está en fase de investigación y desarrollo, y los expertos estiman que tomará unos 10 años antes de que sus aplicaciones alcancen una producción industrial a gran escala.")
        ),
        BilingualQuestion(
            id = 12839, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quelle est la conductivité électrique du graphène?", listOf("Bonne", "Excellente", "Supérieur au cuivre", "Supérieur à l'argent"), "Science", "Le graphène possède une mobilité électronique exceptionnellement élevée, ce qui lui confère une conductivité électrique supérieure à celle du cuivre, le métal conducteur de référence."),
            en = LocalizedContent("What is the electrical conductivity of graphene?", listOf("Good", "Excellent", "Superior to copper", "Superior to silver"), "Science", "Graphene has exceptionally high electron mobility, giving it electrical conductivity superior to copper, the reference conductive metal."),
            zh = LocalizedContent("石墨烯的导电性如何？", listOf("良好", "优秀", "优于铜", "优于银"), "科学", "石墨烯具有极高的电子迁移率，使其导电性优于参考导电金属铜。"),
            es = LocalizedContent("¿Cuál es la conductividad eléctrica del grafeno?", listOf("Buena", "Excelente", "Superior al cobre", "Superior a la plata"), "Ciencia", "El grafeno posee una movilidad electrónica excepcionalmente alta, lo que le confiere una conductividad eléctrica superior a la del cobre, el metal conductor de referencia.")
        ),
        BilingualQuestion(
            id = 12840, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien d'îles la Polynésie française compte-t-elle?", listOf("50", "100", "150", "200"), "Géographie", "La Polynésie française est un archipel composé de 118 îles réparties en cinq groupes, mais le nombre total d'îles et d'îlots est souvent estimé à environ 150."),
            en = LocalizedContent("How many islands does French Polynesia have?", listOf("50", "100", "150", "200"), "Geography", "French Polynesia is an archipelago of 118 islands divided into five groups, but the total number of islands and islets is often estimated at about 150."),
            zh = LocalizedContent("法属波利尼西亚有多少个岛屿？", listOf("50", "100", "150", "200"), "地理", "法属波利尼西亚是一个由118个岛屿组成的群岛，分为五个群岛，但岛屿和小岛的总数通常估计约为150个。"),
            es = LocalizedContent("¿Cuántas islas tiene la Polinesia Francesa?", listOf("50", "100", "150", "200"), "Geografia", "La Polinesia Francesa es un archipiélago compuesto por 118 islas repartidas en cinco grupos, pero el número total de islas e islotes a menudo se estima en alrededor de 150.")
        ),
        BilingualQuestion(
            id = 12841, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quelle est la plus grande île de la Polynésie?", listOf("Tahiti", "Bora Bora", "Marquises", "Tuamotu"), "Géographie", "Tahiti est la plus grande île de la Polynésie française, avec une superficie d'environ 1 045 km², et elle constitue le centre économique et culturel de cet archipel du Pacifique."),
            en = LocalizedContent("What is the largest island in Polynesia?", listOf("Tahiti", "Bora Bora", "Marquesas", "Tuamotu"), "Geography", "Tahiti is the largest island in French Polynesia, with an area of about 1,045 km², and it is the economic and cultural center of this Pacific archipelago."),
            zh = LocalizedContent("波利尼西亚最大的岛屿是哪个？", listOf("塔希提岛", "波拉波拉岛", "马克萨斯群岛", "土阿莫土群岛"), "地理", "塔希提岛是法属波利尼西亚最大的岛屿，面积约1,045平方公里，是该太平洋群岛的经济和文化中心。"),
            es = LocalizedContent("¿Cuál es la isla más grande de la Polinesia?", listOf("Tahití", "Bora Bora", "Marquesas", "Tuamotu"), "Geografia", "Tahití es la isla más grande de la Polinesia Francesa, con una superficie de aproximadamente 1.045 km², y constituye el centro económico y cultural de este archipiélago del Pacífico.")
        ),
        BilingualQuestion(
            id = 12842, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien d'îles l'archipel du Samoa compte-t-il?", listOf("5", "9", "15", "20"), "Géographie", "L'archipel du Samoa est politiquement divisé en deux entités : les Samoa (indépendantes) et les Samoa américaines. Au total, il compte neuf îles habitées."),
            en = LocalizedContent("How many islands does the Samoan archipelago have?", listOf("5", "9", "15", "20"), "Geography", "The Samoan archipelago is politically divided into two entities: Samoa (independent) and American Samoa. In total, it has nine inhabited islands."),
            zh = LocalizedContent("萨摩亚群岛有多少个岛屿？", listOf("5", "9", "15", "20"), "地理", "萨摩亚群岛在政治上分为两个实体：萨摩亚（独立）和美属萨摩亚。总共有九个有人居住的岛屿。"),
            es = LocalizedContent("¿Cuántas islas tiene el archipiélago de Samoa?", listOf("5", "9", "15", "20"), "Geografia", "El archipiélago de Samoa está dividido políticamente en dos entidades: Samoa (independiente) y Samoa Americana. En total, cuenta con nueve islas habitadas.")
        ),
        BilingualQuestion(
            id = 12843, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le point culminant de Hawaï?", listOf("Mauna Kea", "Mauna Loa", "Haleakala", "Kohala"), "Géographie", "Le Mauna Kea, volcan endormi, culmine à 4 207 mètres, ce qui en fait le plus haut sommet d'Hawaï, bien que sa base repose sur le plancher océanique."),
            en = LocalizedContent("What is the highest point in Hawaii?", listOf("Mauna Kea", "Mauna Loa", "Haleakala", "Kohala"), "Geography", "Mauna Kea, a dormant volcano, rises to 4,207 meters, making it the highest summit in Hawaii, although its base rests on the ocean floor."),
            zh = LocalizedContent("夏威夷的最高点是什么？", listOf("莫纳克亚山", "莫纳罗亚山", "哈雷阿卡拉山", "科哈拉山"), "地理", "莫纳克亚山是一座休眠火山，海拔4,207米，是夏威夷的最高峰，尽管其基底位于海床上。"),
            es = LocalizedContent("¿Cuál es el punto más alto de Hawái?", listOf("Mauna Kea", "Mauna Loa", "Haleakala", "Kohala"), "Geografia", "El Mauna Kea, un volcán inactivo, se eleva a 4.207 metros, lo que lo convierte en el pico más alto de Hawái, aunque su base descansa en el fondo oceánico.")
        ),
        BilingualQuestion(
            id = 12844, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien d'îles les Fidji compte-elles?", listOf("100", "200", "330", "500"), "Géographie", "L'archipel des Fidji est composé d'environ 330 îles, dont seulement un tiers sont habitées."),
            en = LocalizedContent("How many islands does Fiji have?", listOf("100", "200", "330", "500"), "Geography", "The Fiji archipelago consists of about 330 islands, of which only one-third are inhabited."),
            zh = LocalizedContent("斐济有多少个岛屿？", listOf("100", "200", "330", "500"), "地理", "斐济群岛由大约330个岛屿组成，其中只有三分之一有人居住。"),
            es = LocalizedContent("¿Cuántas islas tiene Fiyi?", listOf("100", "200", "330", "500"), "Geografia", "El archipiélago de Fiyi está compuesto por aproximadamente 330 islas, de las cuales solo un tercio están habitadas.")
        ),
        BilingualQuestion(
            id = 12845, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus petit État du Pacifique?", listOf("Nauru", "Tuvalu", "Palaos", "Kiribati"), "Géographie", "Nauru est une île de 21 km², ce qui en fait le plus petit État insulaire du Pacifique et le troisième plus petit pays du monde après le Vatican et Monaco."),
            en = LocalizedContent("What is the smallest state in the Pacific?", listOf("Nauru", "Tuvalu", "Palau", "Kiribati"), "Geography", "Nauru is an island of 21 km², making it the smallest island state in the Pacific and the third smallest country in the world after Vatican City and Monaco."),
            zh = LocalizedContent("太平洋最小的国家是哪个？", listOf("瑙鲁", "图瓦卢", "帕劳", "基里巴斯"), "地理", "瑙鲁是一个21平方公里的岛屿，是太平洋最小的岛国，也是世界上仅次于梵蒂冈和摩纳哥的第三小国家。"),
            es = LocalizedContent("¿Cuál es el estado más pequeño del Pacífico?", listOf("Nauru", "Tuvalu", "Palaos", "Kiribati"), "Geografia", "Nauru es una isla de 21 km², lo que la convierte en el estado insular más pequeño del Pacífico y el tercer país más pequeño del mundo después del Vaticano y Mónaco.")
        ),
        BilingualQuestion(
            id = 12846, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien d'îles la Micronésie compte-t-elle?", listOf("500", "1000", "2000", "5000"), "Géographie", "La Micronésie est une région de l'océan Pacifique composée de plus de 2 000 îles, mais le nom du pays fait référence à environ 600 îles principales, dont seulement 65 sont habitées. Le chiffre de 1 000 est souvent cité comme une approximation des îles de l'archipel."),
            en = LocalizedContent("How many islands does Micronesia have?", listOf("500", "1000", "2000", "5000"), "Geography", "Micronesia is a region in the Pacific Ocean consisting of over 2,000 islands, but the country's name refers to about 600 main islands, of which only 65 are inhabited. The figure of 1,000 is often cited as an approximation of the archipelago's islands."),
            zh = LocalizedContent("密克罗尼西亚有多少个岛屿？", listOf("500", "1000", "2000", "5000"), "地理", "密克罗尼西亚是太平洋的一个区域，由超过2,000个岛屿组成，但该国的名称指的是大约600个主要岛屿，其中只有65个有人居住。1,000这个数字常被引作为群岛岛屿的近似值。"),
            es = LocalizedContent("¿Cuántas islas tiene Micronesia?", listOf("500", "1000", "2000", "5000"), "Geografia", "Micronesia es una región del océano Pacífico compuesta por más de 2.000 islas, pero el nombre del país se refiere a unas 600 islas principales, de las cuales solo 65 están habitadas. La cifra de 1.000 se cita a menudo como una aproximación de las islas del archipiélago.")
        ),
        BilingualQuestion(
            id = 12847, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand lagon du Pacifique?", listOf("Rangiroa", "Fakarava", "Raroia", "Hao"), "Géographie", "Le lagon de Fakarava, situé dans l'archipel des Tuamotu en Polynésie française, est le deuxième plus grand lagon du monde après celui de Rangiroa, mais il est le plus vaste du Pacifique en termes de superficie."),
            en = LocalizedContent("What is the largest lagoon in the Pacific?", listOf("Rangiroa", "Fakarava", "Raroia", "Hao"), "Geography", "The Fakarava lagoon, located in the Tuamotu archipelago in French Polynesia, is the second largest lagoon in the world after Rangiroa, but it is the largest in the Pacific in terms of area."),
            zh = LocalizedContent("太平洋最大的泻湖是哪个？", listOf("朗伊罗阿", "法卡拉瓦", "拉罗亚", "哈奥"), "地理", "法卡拉瓦泻湖位于法属波利尼西亚的土阿莫土群岛，是世界上仅次于朗伊罗阿的第二大泻湖，但就面积而言是太平洋最大的。"),
            es = LocalizedContent("¿Cuál es la laguna más grande del Pacífico?", listOf("Rangiroa", "Fakarava", "Raroia", "Hao"), "Geografia", "La laguna de Fakarava, situada en el archipiélago de Tuamotu en la Polinesia Francesa, es la segunda laguna más grande del mundo después de la de Rangiroa, pero es la más extensa del Pacífico en términos de superficie.")
        ),
        BilingualQuestion(
            id = 12848, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien d'atolls Kiribati compte-t-elle?", listOf("30", "50", "100", "150"), "Géographie", "Kiribati est un pays insulaire du Pacifique composé de 33 atolls et îles coralliennes, mais le nombre total d'atolls dans son territoire est estimé à environ 100 en incluant les îlots et récifs."),
            en = LocalizedContent("How many atolls does Kiribati have?", listOf("30", "50", "100", "150"), "Geography", "Kiribati is a Pacific island country composed of 33 atolls and coral islands, but the total number of atolls in its territory is estimated at about 100 including islets and reefs."),
            zh = LocalizedContent("基里巴斯有多少个环礁？", listOf("30", "50", "100", "150"), "地理", "基里巴斯是一个太平洋岛国，由33个环礁和珊瑚岛组成，但其领土内的环礁总数（包括小岛和礁石）估计约为100个。"),
            es = LocalizedContent("¿Cuántos atolones tiene Kiribati?", listOf("30", "50", "100", "150"), "Geografia", "Kiribati es un país insular del Pacífico compuesto por 33 atolones e islas coralinas, pero el número total de atolones en su territorio se estima en alrededor de 100, incluyendo islotes y arrecifes.")
        ),
    )

    private fun part5(): List<BilingualQuestion> = listOf(
        BilingualQuestion(
            id = 12849, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus haut point des îles Salomon?", listOf("1000m", "1500m", "2000m", "2500m"), "Géographie", "Le plus haut point des îles Salomon est le mont Popomanaseu, culminant à environ 2 500 mètres d'altitude sur l'île de Guadalcanal."),
            en = LocalizedContent("What is the highest point of the Solomon Islands?", listOf("1000m", "1500m", "2000m", "2500m"), "Geography", "The highest point of the Solomon Islands is Mount Popomanaseu, reaching about 2,500 meters above sea level on Guadalcanal Island."),
            zh = LocalizedContent("所罗门群岛的最高点是什么？", listOf("1000米", "1500米", "2000米", "2500米"), "地理", "所罗门群岛的最高点是波波马纳休山，位于瓜达尔卡纳尔岛，海拔约2500米。"),
            es = LocalizedContent("¿Cuál es el punto más alto de las Islas Salomón?", listOf("1000m", "1500m", "2000m", "2500m"), "Geografía", "El punto más alto de las Islas Salomón es el monte Popomanaseu, que alcanza unos 2.500 metros sobre el nivel del mar en la isla de Guadalcanal.")
        ),
        BilingualQuestion(
            id = 12850, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de volcanoes actifs Vanuatu a-t-elle?", listOf("5", "10", "15", "20"), "Géographie", "Vanuatu se trouve sur la ceinture de feu du Pacifique, ce qui explique sa forte activité volcanique avec 15 volcans actifs recensés."),
            en = LocalizedContent("How many active volcanoes does Vanuatu have?", listOf("5", "10", "15", "20"), "Geography", "Vanuatu lies on the Pacific Ring of Fire, explaining its high volcanic activity with 15 active volcanoes recorded."),
            zh = LocalizedContent("瓦努阿图有多少座活火山？", listOf("5", "10", "15", "20"), "地理", "瓦努阿图位于太平洋火山带，火山活动频繁，记录有15座活火山。"),
            es = LocalizedContent("¿Cuántos volcanes activos tiene Vanuatu?", listOf("5", "10", "15", "20"), "Geografía", "Vanuatu se encuentra en el Cinturón de Fuego del Pacífico, lo que explica su alta actividad volcánica con 15 volcanes activos registrados.")
        ),
        BilingualQuestion(
            id = 12851, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand atoll des Maldives?", listOf("Malé", "Baa", "Vaavu", "Addu"), "Géographie", "L'atoll de Baa est le plus grand des Maldives, couvrant environ 1 200 km². Il est célèbre pour sa biodiversité marine et abrite la réserve de biosphère de l'UNESCO."),
            en = LocalizedContent("What is the largest atoll of the Maldives?", listOf("Malé", "Baa", "Vaavu", "Addu"), "Geography", "Baa Atoll is the largest atoll in the Maldives, covering about 1,200 km². It is famous for its marine biodiversity and hosts a UNESCO Biosphere Reserve."),
            zh = LocalizedContent("马尔代夫最大的环礁是什么？", listOf("马累", "巴阿", "瓦武", "阿杜"), "地理", "巴阿环礁是马尔代夫最大的环礁，面积约1200平方公里，以海洋生物多样性闻名，并拥有联合国教科文组织生物圈保护区。"),
            es = LocalizedContent("¿Cuál es el atolón más grande de las Maldivas?", listOf("Malé", "Baa", "Vaavu", "Addu"), "Geografía", "El atolón Baa es el más grande de las Maldivas, con una superficie de unos 1.200 km². Es famoso por su biodiversidad marina y alberga una Reserva de la Biosfera de la UNESCO.")
        ),
        BilingualQuestion(
            id = 12852, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien d'îles Tonga compte-t-elle?", listOf("100", "150", "200", "300"), "Géographie", "L'archipel des Tonga, dans le Pacifique Sud, est composé d'environ 200 îles, dont seulement une trentaine sont habitées."),
            en = LocalizedContent("How many islands does Tonga have?", listOf("100", "150", "200", "300"), "Geography", "The Tonga archipelago in the South Pacific consists of about 200 islands, of which only about thirty are inhabited."),
            zh = LocalizedContent("汤加有多少个岛屿？", listOf("100", "150", "200", "300"), "地理", "南太平洋的汤加群岛由约200个岛屿组成，其中只有约30个有人居住。"),
            es = LocalizedContent("¿Cuántas islas tiene Tonga?", listOf("100", "150", "200", "300"), "Geografía", "El archipiélago de Tonga, en el Pacífico Sur, está compuesto por unas 200 islas, de las cuales solo unas treinta están habitadas.")
        ),
        BilingualQuestion(
            id = 12853, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quelle est la profondeur de la Fosse des Mariannes?", listOf("7000m", "9000m", "11000m", "13000m"), "Géographie", "La Fosse des Mariannes, point le plus profond des océans, atteint environ 11 000 mètres de profondeur, soit plus que la hauteur de l'Everest."),
            en = LocalizedContent("What is the depth of the Mariana Trench?", listOf("7000m", "9000m", "11000m", "13000m"), "Geography", "The Mariana Trench, the deepest point in the oceans, reaches about 11,000 meters deep, more than the height of Mount Everest."),
            zh = LocalizedContent("马里亚纳海沟的深度是多少？", listOf("7000米", "9000米", "11000米", "13000米"), "地理", "马里亚纳海沟是海洋最深处，深度约11000米，超过珠穆朗玛峰的高度。"),
            es = LocalizedContent("¿Cuál es la profundidad de la Fosa de las Marianas?", listOf("7000m", "9000m", "11000m", "13000m"), "Geografía", "La Fosa de las Marianas, el punto más profundo de los océanos, alcanza unos 11.000 metros de profundidad, más que la altura del Everest.")
        ),
        BilingualQuestion(
            id = 12854, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien d'îles l'archipel du Cook compte-t-il?", listOf("10", "15", "20", "25"), "Géographie", "L'archipel des îles Cook, État autonome en libre association avec la Nouvelle-Zélande, est composé de 15 îles principales et 5 atolls inhabités, soit un total de 20 îles."),
            en = LocalizedContent("How many islands does the Cook Islands archipelago have?", listOf("10", "15", "20", "25"), "Geography", "The Cook Islands archipelago, a self-governing state in free association with New Zealand, consists of 15 main islands and 5 uninhabited atolls, totaling 20 islands."),
            zh = LocalizedContent("库克群岛群岛有多少个岛屿？", listOf("10", "15", "20", "25"), "地理", "库克群岛群岛是一个与新西兰自由联合的自治国家，由15个主岛和5个无人环礁组成，共20个岛屿。"),
            es = LocalizedContent("¿Cuántas islas tiene el archipiélago de las Islas Cook?", listOf("10", "15", "20", "25"), "Geografía", "El archipiélago de las Islas Cook, un estado autónomo en libre asociación con Nueva Zelanda, está compuesto por 15 islas principales y 5 atolones deshabitados, totalizando 20 islas.")
        ),
        BilingualQuestion(
            id = 12855, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand lagon du monde?", listOf("Bora Bora", "Rangiroa", "Fakarava", "Raiatea"), "Géographie", "Le lagon de Rangiroa, dans l'archipel des Tuamotu en Polynésie française, est le plus grand du monde avec une superficie de 1 446 km²."),
            en = LocalizedContent("What is the largest lagoon in the world?", listOf("Bora Bora", "Rangiroa", "Fakarava", "Raiatea"), "Geography", "The Rangiroa lagoon, in the Tuamotu archipelago of French Polynesia, is the largest in the world with an area of 1,446 km²."),
            zh = LocalizedContent("世界上最大的泻湖是什么？", listOf("波拉波拉", "朗伊罗阿", "法卡拉瓦", "赖阿特阿"), "地理", "法属波利尼西亚土阿莫土群岛的朗伊罗阿泻湖是世界上最大的泻湖，面积达1446平方公里。"),
            es = LocalizedContent("¿Cuál es la laguna más grande del mundo?", listOf("Bora Bora", "Rangiroa", "Fakarava", "Raiatea"), "Geografía", "La laguna de Rangiroa, en el archipiélago de Tuamotu en la Polinesia Francesa, es la más grande del mundo con una superficie de 1.446 km².")
        ),
        BilingualQuestion(
            id = 12856, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien d'îles Samoa Américaines compte-elle?", listOf("3", "5", "7", "10"), "Géographie", "Les Samoa américaines sont composées de cinq îles principales (Tutuila, Aunu'u, Ofu, Olosega et Ta'ū) et deux atolls de corail."),
            en = LocalizedContent("How many islands does American Samoa have?", listOf("3", "5", "7", "10"), "Geography", "American Samoa consists of five main islands (Tutuila, Aunu'u, Ofu, Olosega, and Ta'ū) and two coral atolls."),
            zh = LocalizedContent("美属萨摩亚有多少个岛屿？", listOf("3", "5", "7", "10"), "地理", "美属萨摩亚由五个主岛（图图伊拉、奥努乌、奥富、奥洛塞加和塔乌）以及两个珊瑚环礁组成。"),
            es = LocalizedContent("¿Cuántas islas tiene Samoa Americana?", listOf("3", "5", "7", "10"), "Geografía", "Samoa Americana está compuesta por cinco islas principales (Tutuila, Aunu'u, Ofu, Olosega y Ta'ū) y dos atolones de coral.")
        ),
        BilingualQuestion(
            id = 12857, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est l'atoll le plus peuplé du monde?", listOf("Malé", "Tarawa", "Majuro", "Funafuti"), "Géographie", "Tarawa, atoll des Kiribati, concentre plus de la moitié de la population du pays sur ses îlots, ce qui en fait l'atoll le plus densément peuplé au monde."),
            en = LocalizedContent("What is the most populous atoll in the world?", listOf("Malé", "Tarawa", "Majuro", "Funafuti"), "Geography", "Tarawa, an atoll in Kiribati, concentrates more than half of the country's population on its islets, making it the most densely populated atoll in the world."),
            zh = LocalizedContent("世界上人口最多的环礁是什么？", listOf("马累", "塔拉瓦", "马朱罗", "富纳富提"), "地理", "基里巴斯的塔拉瓦环礁集中了该国一半以上的人口，是世界上人口密度最高的环礁。"),
            es = LocalizedContent("¿Cuál es el atolón más poblado del mundo?", listOf("Malé", "Tarawa", "Majuro", "Funafuti"), "Geografía", "Tarawa, un atolón de Kiribati, concentra más de la mitad de la población del país en sus islotes, lo que lo convierte en el atolón más densamente poblado del mundo.")
        ),
        BilingualQuestion(
            id = 12858, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de volcans Bougainville compte-t-elle?", listOf("2", "4", "6", "10"), "Géographie", "L'île de Bougainville, en Papouasie-Nouvelle-Guinée, possède quatre volcans principaux, dont le mont Balbi et le mont Bagana, ce dernier étant l'un des plus actifs du pays."),
            en = LocalizedContent("How many volcanoes does Bougainville have?", listOf("2", "4", "6", "10"), "Geography", "Bougainville Island in Papua New Guinea has four main volcanoes, including Mount Balbi and Mount Bagana, the latter being one of the most active in the country."),
            zh = LocalizedContent("布干维尔岛有多少座火山？", listOf("2", "4", "6", "10"), "地理", "巴布亚新几内亚的布干维尔岛有四座主要火山，包括巴尔比山和巴加纳山，后者是该国最活跃的火山之一。"),
            es = LocalizedContent("¿Cuántos volcanes tiene Bougainville?", listOf("2", "4", "6", "10"), "Geografía", "La isla de Bougainville, en Papúa Nueva Guinea, posee cuatro volcanes principales, incluidos el monte Balbi y el monte Bagana, siendo este último uno de los más activos del país.")
        ),
        BilingualQuestion(
            id = 12859, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus large atoll du monde?", listOf("Malé", "Kwajalein", "Fakarava", "Chagos"), "Géographie", "Fakarava, dans l'archipel des Tuamotu en Polynésie française, est le deuxième plus grand atoll du monde par sa superficie totale, mais il possède le plus large lagon."),
            en = LocalizedContent("What is the largest atoll in the world?", listOf("Malé", "Kwajalein", "Fakarava", "Chagos"), "Geography", "Fakarava, in the Tuamotu Archipelago of French Polynesia, is the second largest atoll in the world by total area, but it has the largest lagoon."),
            zh = LocalizedContent("世界上最大的环礁是哪个？", listOf("马累", "夸贾林", "法卡拉瓦", "查戈斯"), "地理", "法卡拉瓦位于法属波利尼西亚的土阿莫土群岛，按总面积计算是世界第二大环礁，但它拥有最大的潟湖。"),
            es = LocalizedContent("¿Cuál es el atolón más grande del mundo?", listOf("Malé", "Kwajalein", "Fakarava", "Chagos"), "Geografía", "Fakarava, en el archipiélago de Tuamotu en la Polinesia Francesa, es el segundo atolón más grande del mundo por superficie total, pero tiene la laguna más grande.")
        ),
        BilingualQuestion(
            id = 12860, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quelle est la plus longue migration animale?", listOf("Grue", "Sterne arctique", "Baleine grise", "Monarque"), "Nature", "La sterne arctique parcourt environ 70 000 kilomètres par an entre l'Arctique et l'Antarctique, ce qui en fait la plus longue migration animale connue."),
            en = LocalizedContent("What is the longest animal migration?", listOf("Crane", "Arctic tern", "Gray whale", "Monarch"), "Nature", "The Arctic tern travels about 70,000 kilometers per year between the Arctic and Antarctic, making it the longest known animal migration."),
            zh = LocalizedContent("最长的动物迁徙是什么？", listOf("鹤", "北极燕鸥", "灰鲸", "帝王蝶"), "自然", "北极燕鸥每年在北极和南极之间迁徙约70,000公里，是已知最长的动物迁徙。"),
            es = LocalizedContent("¿Cuál es la migración animal más larga?", listOf("Grulla", "Charrán ártico", "Ballena gris", "Monarca"), "Naturaleza", "El charrán ártico recorre unos 70.000 kilómetros al año entre el Ártico y la Antártida, lo que lo convierte en la migración animal más larga conocida.")
        ),
        BilingualQuestion(
            id = 12861, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de kilomètres migre la sterne arctique annuellement?", listOf("40000", "70000", "90000", "120000"), "Nature", "La sterne arctique effectue la plus longue migration de tous les animaux, parcourant environ 90 000 kilomètres par an entre ses sites de reproduction dans l'Arctique et ses zones d'hivernage en Antarctique."),
            en = LocalizedContent("How many kilometers does the Arctic tern migrate annually?", listOf("40000", "70000", "90000", "120000"), "Nature", "The Arctic tern makes the longest migration of any animal, traveling about 90,000 kilometers per year between its breeding sites in the Arctic and its wintering areas in Antarctica."),
            zh = LocalizedContent("北极燕鸥每年迁徙多少公里？", listOf("40000", "70000", "90000", "120000"), "自然", "北极燕鸥是所有动物中迁徙距离最长的，每年在北极的繁殖地和南极的越冬区之间飞行约90,000公里。"),
            es = LocalizedContent("¿Cuántos kilómetros migra el charrán ártico anualmente?", listOf("40000", "70000", "90000", "120000"), "Naturaleza", "El charrán ártico realiza la migración más larga de cualquier animal, recorriendo unos 90.000 kilómetros al año entre sus sitios de cría en el Ártico y sus áreas de invernada en la Antártida.")
        ),
        BilingualQuestion(
            id = 12862, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel animal migre le plus haut en altitude?", listOf("Aigle royal", "Oie bernache", "Vautour de Rüppell", "Grue"), "Nature", "Le vautour de Rüppell peut voler à plus de 11 000 mètres d'altitude, ce qui en fait l'animal volant le plus haut jamais enregistré."),
            en = LocalizedContent("Which animal migrates at the highest altitude?", listOf("Golden eagle", "Barnacle goose", "Rüppell's vulture", "Crane"), "Nature", "Rüppell's vulture can fly at over 11,000 meters altitude, making it the highest-flying animal ever recorded."),
            zh = LocalizedContent("哪种动物在最高海拔迁徙？", listOf("金雕", "白颊黑雁", "鲁氏秃鹫", "鹤"), "自然", "鲁氏秃鹫可以在超过11,000米的高度飞行，是有记录以来飞行最高的动物。"),
            es = LocalizedContent("¿Qué animal migra a mayor altitud?", listOf("Águila real", "Barnacla carinegra", "Buitre de Rüppell", "Grulla"), "Naturaleza", "El buitre de Rüppell puede volar a más de 11.000 metros de altitud, lo que lo convierte en el animal volador más alto jamás registrado.")
        ),
        BilingualQuestion(
            id = 12863, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de monarques migrent au Mexique chaque année?", listOf("100 millions", "500 millions", "1 milliard", "2 milliards"), "Nature", "Chaque année, jusqu'à un milliard de papillons monarques migrent du Canada et des États-Unis vers les forêts du Mexique pour hiverner."),
            en = LocalizedContent("How many monarchs migrate to Mexico each year?", listOf("100 million", "500 million", "1 billion", "2 billion"), "Nature", "Each year, up to one billion monarch butterflies migrate from Canada and the United States to the forests of Mexico to overwinter."),
            zh = LocalizedContent("每年有多少帝王蝶迁徙到墨西哥？", listOf("1亿", "5亿", "10亿", "20亿"), "自然", "每年有多达10亿只帝王蝶从加拿大和美国迁徙到墨西哥的森林越冬。"),
            es = LocalizedContent("¿Cuántas mariposas monarca migran a México cada año?", listOf("100 millones", "500 millones", "1 billón", "2 billones"), "Naturaleza", "Cada año, hasta mil millones de mariposas monarca migran desde Canadá y Estados Unidos a los bosques de México para invernar.")
        ),
        BilingualQuestion(
            id = 12864, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus long voyage d'un cétacé migrant?", listOf("5000 km", "10000 km", "15000 km", "20000 km"), "Nature", "La baleine grise détient le record avec des migrations allant jusqu'à 20 000 km, parcourant l'océan Pacifique entre ses zones d'alimentation arctiques et ses lagons de reproduction mexicains."),
            en = LocalizedContent("What is the longest journey of a migrating cetacean?", listOf("5000 km", "10000 km", "15000 km", "20000 km"), "Nature", "The gray whale holds the record with migrations of up to 20,000 km, traveling the Pacific Ocean between its Arctic feeding grounds and Mexican breeding lagoons."),
            zh = LocalizedContent("迁徙鲸类的最长旅程是多少？", listOf("5000公里", "10000公里", "15000公里", "20000公里"), "自然", "灰鲸保持着长达20,000公里的迁徙记录，在太平洋的北极觅食地和墨西哥繁殖潟湖之间旅行。"),
            es = LocalizedContent("¿Cuál es el viaje más largo de un cetáceo migratorio?", listOf("5000 km", "10000 km", "15000 km", "20000 km"), "Naturaleza", "La ballena gris tiene el récord con migraciones de hasta 20.000 km, recorriendo el océano Pacífico entre sus zonas de alimentación en el Ártico y sus lagunas de reproducción en México.")
        ),
        BilingualQuestion(
            id = 12865, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En combien de jours les baleines grises migrent-elles?", listOf("30", "60", "90", "180"), "Nature", "Les baleines grises effectuent l'une des plus longues migrations du règne animal, parcourant jusqu'à 10 000 kilomètres aller-retour entre leurs zones d'alimentation arctiques et leurs lagunes de reproduction mexicaines, un voyage qui dure environ 90 jours."),
            en = LocalizedContent("How many days do gray whales migrate?", listOf("30", "60", "90", "180"), "Nature", "Gray whales make one of the longest migrations in the animal kingdom, traveling up to 10,000 kilometers round trip between their Arctic feeding grounds and Mexican breeding lagoons, a journey that takes about 90 days."),
            zh = LocalizedContent("灰鲸迁徙需要多少天？", listOf("30", "60", "90", "180"), "自然", "灰鲸进行动物王国中最长的迁徙之一，在北极觅食地和墨西哥繁殖潟湖之间往返旅行长达10,000公里，旅程大约需要90天。"),
            es = LocalizedContent("¿Cuántos días migran las ballenas grises?", listOf("30", "60", "90", "180"), "Naturaleza", "Las ballenas grises realizan una de las migraciones más largas del reino animal, recorriendo hasta 10.000 kilómetros de ida y vuelta entre sus zonas de alimentación en el Ártico y sus lagunas de reproducción en México, un viaje que dura unos 90 días.")
        ),
        BilingualQuestion(
            id = 12866, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quelle est la capacité sensorielle des oiseaux migrateurs?", listOf("Vue", "Géomagnétisme", "Odorat", "Tous"), "Nature", "Les oiseaux migrateurs utilisent plusieurs sens pour s'orienter, notamment la vue, l'odorat et la perception du champ magnétique terrestre. Aucun sens unique n'est exclusif, ils combinent tous ces moyens selon les espèces et les conditions."),
            en = LocalizedContent("What is the sensory ability of migratory birds?", listOf("Sight", "Geomagnetism", "Smell", "All"), "Nature", "Migratory birds use multiple senses to orient themselves, including sight, smell, and perception of the Earth's magnetic field. No single sense is exclusive; they combine all these means depending on the species and conditions."),
            zh = LocalizedContent("候鸟的感官能力是什么？", listOf("视觉", "地磁感应", "嗅觉", "全部"), "自然", "候鸟使用多种感官来定位，包括视觉、嗅觉和地球磁场感知。没有单一的感官是唯一的；它们根据物种和条件结合所有这些方式。"),
            es = LocalizedContent("¿Cuál es la capacidad sensorial de las aves migratorias?", listOf("Vista", "Geomagnetismo", "Olfato", "Todos"), "Naturaleza", "Las aves migratorias utilizan múltiples sentidos para orientarse, incluidos la vista, el olfato y la percepción del campo magnético terrestre. Ningún sentido único es exclusivo; combinan todos estos medios según la especie y las condiciones.")
        ),
        BilingualQuestion(
            id = 12867, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien d'espèces de poissons migrent annuellement?", listOf("100", "500", "1000", "2000"), "Nature", "Environ 1000 espèces de poissons effectuent des migrations annuelles, principalement pour se reproduire ou se nourrir, comme les saumons ou les anguilles."),
            en = LocalizedContent("How many species of fish migrate annually?", listOf("100", "500", "1000", "2000"), "Nature", "About 1000 species of fish undertake annual migrations, mainly to reproduce or feed, such as salmon or eels."),
            zh = LocalizedContent("每年有多少种鱼类迁徙？", listOf("100", "500", "1000", "2000"), "自然", "大约有1000种鱼类每年进行迁徙，主要是为了繁殖或觅食，例如鲑鱼或鳗鱼。"),
            es = LocalizedContent("¿Cuántas especies de peces migran anualmente?", listOf("100", "500", "1000", "2000"), "Naturaleza", "Alrededor de 1000 especies de peces realizan migraciones anuales, principalmente para reproducirse o alimentarse, como los salmones o las anguilas.")
        ),
        BilingualQuestion(
            id = 12868, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus haut record de migration de nuit?", listOf("5000m", "7000m", "9000m", "11000m"), "Nature", "Certains oiseaux, comme les bécasseaux, peuvent voler à plus de 9 000 mètres d'altitude la nuit pour franchir des chaînes de montagnes ou éviter des prédateurs."),
            en = LocalizedContent("What is the highest recorded night migration altitude?", listOf("5000m", "7000m", "9000m", "11000m"), "Nature", "Some birds, such as sandpipers, can fly at over 9,000 meters altitude at night to cross mountain ranges or avoid predators."),
            zh = LocalizedContent("夜间迁徙的最高记录是多少？", listOf("5000米", "7000米", "9000米", "11000米"), "自然", "一些鸟类，如矶鹬，可以在夜间飞到超过9,000米的高度，以穿越山脉或躲避捕食者。"),
            es = LocalizedContent("¿Cuál es el récord más alto de migración nocturna?", listOf("5000m", "7000m", "9000m", "11000m"), "Naturaleza", "Algunas aves, como los correlimos, pueden volar a más de 9.000 metros de altitud durante la noche para cruzar cadenas montañosas o evitar depredadores.")
        ),
        BilingualQuestion(
            id = 12869, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de tortues marines migrent annuellement?", listOf("Millions", "Dizaines de millions", "Centaines de millions", "Milliards"), "Nature", "Les tortues marines effectuent des migrations massives à l'échelle mondiale, avec des centaines de millions d'individus se déplaçant chaque année entre les zones d'alimentation et de reproduction."),
            en = LocalizedContent("How many sea turtles migrate annually?", listOf("Millions", "Tens of millions", "Hundreds of millions", "Billions"), "Nature", "Sea turtles undertake massive global migrations, with hundreds of millions of individuals moving each year between feeding and breeding areas."),
            zh = LocalizedContent("每年有多少海龟迁徙？", listOf("数百万", "数千万", "数亿", "数十亿"), "自然", "海龟进行大规模的全球迁徙，每年有数亿只个体在觅食区和繁殖区之间移动。"),
            es = LocalizedContent("¿Cuántas tortugas marinas migran anualmente?", listOf("Millones", "Decenas de millones", "Cientos de millones", "Miles de millones"), "Naturaleza", "Las tortugas marinas realizan migraciones masivas a nivel mundial, con cientos de millones de individuos desplazándose cada año entre las zonas de alimentación y reproducción.")
        ),
        BilingualQuestion(
            id = 12870, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel animal a la plus courte migration?", listOf("Papillon monarque", "Caribou", "Souris d'herbe", "Zooplancton"), "Nature", "Le zooplancton effectue des migrations verticales quotidiennes dans l'océan, montant la nuit vers la surface et redescendant le jour, ce qui en fait la plus courte migration connue."),
            en = LocalizedContent("Which animal has the shortest migration?", listOf("Monarch butterfly", "Caribou", "Grass mouse", "Zooplankton"), "Nature", "Zooplankton performs daily vertical migrations in the ocean, rising to the surface at night and descending during the day, making it the shortest known migration."),
            zh = LocalizedContent("哪种动物的迁徙距离最短？", listOf("帝王蝶", "驯鹿", "草鼠", "浮游动物"), "自然", "浮游动物在海洋中进行每日垂直迁徙，夜间上升到水面，白天下降，这是已知最短的迁徙。"),
            es = LocalizedContent("¿Qué animal tiene la migración más corta?", listOf("Mariposa monarca", "Caribú", "Ratón de hierba", "Zooplancton"), "Naturaleza", "El zooplancton realiza migraciones verticales diarias en el océano, subiendo a la superficie por la noche y descendiendo durante el día, lo que constituye la migración más corta conocida.")
        ),
        BilingualQuestion(
            id = 12871, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En combien de semaines la grue migre-t-elle?", listOf("2", "4", "6", "8"), "Nature", "La migration de la grue cendrée entre ses zones de reproduction et d'hivernage dure environ six semaines, incluant des escales pour se reposer et se nourrir."),
            en = LocalizedContent("How many weeks does the crane migrate?", listOf("2", "4", "6", "8"), "Nature", "The migration of the common crane between its breeding and wintering grounds takes about six weeks, including stopovers to rest and feed."),
            zh = LocalizedContent("鹤的迁徙需要多少周？", listOf("2", "4", "6", "8"), "自然", "灰鹤在繁殖地和越冬地之间的迁徙大约需要六周，包括中途停留休息和觅食。"),
            es = LocalizedContent("¿Cuántas semanas migra la grulla?", listOf("2", "4", "6", "8"), "Naturaleza", "La migración de la grulla común entre sus zonas de cría e invernada dura unas seis semanas, incluyendo escalas para descansar y alimentarse.")
        ),
        BilingualQuestion(
            id = 12872, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record de distance parsauterioe sans escale?", listOf("2000 km", "4000 km", "6000 km", "8000 km"), "Nature", "Le martinet noir détient le record de vol sans escale, parcourant jusqu'à 10 mois d'affilée sans se poser."),
            en = LocalizedContent("What is the record distance for non-stop flight?", listOf("2000 km", "4000 km", "6000 km", "8000 km"), "Nature", "The common swift holds the record for non-stop flight, covering up to 10 months without landing."),
            zh = LocalizedContent("不间断飞行的纪录距离是多少？", listOf("2000公里", "4000公里", "6000公里", "8000公里"), "自然", "普通雨燕保持着不间断飞行的纪录，可以连续飞行长达10个月而不着陆。"),
            es = LocalizedContent("¿Cuál es la distancia récord de vuelo sin escalas?", listOf("2000 km", "4000 km", "6000 km", "8000 km"), "Naturaleza", "El vencejo común posee el récord de vuelo sin escalas, cubriendo hasta 10 meses seguidos sin posarse.")
        ),
        BilingualQuestion(
            id = 12873, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de générations de monarques effectuent la migration?", listOf("1", "2", "3", "4"), "Nature", "Les monarques effectuent une migration annuelle sur plusieurs générations : la première génération migre vers le nord au printemps, la deuxième et la troisième se reproduisent en été, et la quatrième génération migre vers le sud à l'automne."),
            en = LocalizedContent("How many generations of monarchs complete the migration?", listOf("1", "2", "3", "4"), "Nature", "Monarchs undertake an annual migration over multiple generations: the first generation migrates north in spring, the second and third reproduce in summer, and the fourth generation migrates south in autumn."),
            zh = LocalizedContent("有多少代帝王蝶完成迁徙？", listOf("1", "2", "3", "4"), "自然", "帝王蝶进行跨越多代的年度迁徙：第一代在春季向北迁徙，第二和第三代在夏季繁殖，第四代在秋季向南迁徙。"),
            es = LocalizedContent("¿Cuántas generaciones de monarcas completan la migración?", listOf("1", "2", "3", "4"), "Naturaleza", "Las mariposas monarca realizan una migración anual a lo largo de varias generaciones: la primera generación migra al norte en primavera, la segunda y tercera se reproducen en verano, y la cuarta generación migra al sur en otoño.")
        ),
        BilingualQuestion(
            id = 12874, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus long trajet migratoire des poissons?", listOf("5000 km", "10000 km", "15000 km", "20000 km"), "Nature", "Le saumon rouge parcourt jusqu'à 15 000 km depuis l'océan Pacifique jusqu'à ses frayères en eau douce, ce qui en fait la plus longue migration chez les poissons."),
            en = LocalizedContent("What is the longest migratory route of fish?", listOf("5000 km", "10000 km", "15000 km", "20000 km"), "Nature", "The sockeye salmon travels up to 15,000 km from the Pacific Ocean to its freshwater spawning grounds, making it the longest migration among fish."),
            zh = LocalizedContent("鱼类最长的迁徙路线是多少？", listOf("5000公里", "10000公里", "15000公里", "20000公里"), "自然", "红鲑从太平洋到淡水产卵地的迁徙距离可达15000公里，是鱼类中最长的迁徙。"),
            es = LocalizedContent("¿Cuál es la ruta migratoria más larga de los peces?", listOf("5000 km", "10000 km", "15000 km", "20000 km"), "Naturaleza", "El salmón rojo recorre hasta 15,000 km desde el océano Pacífico hasta sus zonas de desove en agua dulce, lo que constituye la migración más larga entre los peces.")
        ),
        BilingualQuestion(
            id = 12875, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle saison les caribous migrent-ils?", listOf("Automne", "Hiver", "Printemps", "Été"), "Nature", "Les caribous migrent à l'automne pour rejoindre leurs aires d'hivernage plus au sud, où la nourriture est plus accessible sous la neige."),
            en = LocalizedContent("In which season do caribou migrate?", listOf("Autumn", "Winter", "Spring", "Summer"), "Nature", "Caribou migrate in autumn to reach their wintering areas further south, where food is more accessible under the snow."),
            zh = LocalizedContent("驯鹿在哪个季节迁徙？", listOf("秋季", "冬季", "春季", "夏季"), "自然", "驯鹿在秋季迁徙到更南方的越冬地，那里的雪下食物更容易获取。"),
            es = LocalizedContent("¿En qué estación migran los caribúes?", listOf("Otoño", "Invierno", "Primavera", "Verano"), "Naturaleza", "Los caribúes migran en otoño para llegar a sus áreas de invernada más al sur, donde la comida es más accesible bajo la nieve.")
        ),
        BilingualQuestion(
            id = 12876, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le principal carburant migratoire des oiseaux?", listOf("Protéine", "Graisse", "Carbohydrates", "Minéraux"), "Nature", "La graisse est le principal carburant des oiseaux migrateurs car elle fournit une grande quantité d'énergie par gramme, essentielle pour les longs vols sans ravitaillement."),
            en = LocalizedContent("What is the main migratory fuel for birds?", listOf("Protein", "Fat", "Carbohydrates", "Minerals"), "Nature", "Fat is the main fuel for migratory birds because it provides a large amount of energy per gram, essential for long flights without refueling."),
            zh = LocalizedContent("鸟类迁徙的主要燃料是什么？", listOf("蛋白质", "脂肪", "碳水化合物", "矿物质"), "自然", "脂肪是候鸟的主要燃料，因为它每克提供大量能量，对于无需补给的长途飞行至关重要。"),
            es = LocalizedContent("¿Cuál es el principal combustible migratorio de las aves?", listOf("Proteína", "Grasa", "Carbohidratos", "Minerales"), "Naturaleza", "La grasa es el principal combustible de las aves migratorias porque proporciona una gran cantidad de energía por gramo, esencial para vuelos largos sin reabastecimiento.")
        ),
        BilingualQuestion(
            id = 12877, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de kilomètres le gnou migre-t-il?", listOf("5000", "10000", "15000", "20000"), "Nature", "Chaque année, les gnous parcourent environ 10 000 kilomètres lors de leur grande migration à travers le Serengeti et le Masai Mara, suivant les pluies pour trouver de l'herbe fraîche."),
            en = LocalizedContent("How many kilometers does the wildebeest migrate?", listOf("5000", "10000", "15000", "20000"), "Nature", "Each year, wildebeest travel about 10,000 kilometers during their great migration across the Serengeti and Masai Mara, following the rains to find fresh grass."),
            zh = LocalizedContent("角马迁徙多少公里？", listOf("5000", "10000", "15000", "20000"), "自然", "每年，角马在穿越塞伦盖蒂和马赛马拉的大迁徙中行进约10000公里，跟随降雨寻找新鲜草地。"),
            es = LocalizedContent("¿Cuántos kilómetros migra el ñu?", listOf("5000", "10000", "15000", "20000"), "Naturaleza", "Cada año, los ñus recorren unos 10,000 kilómetros durante su gran migración a través del Serengeti y el Masai Mara, siguiendo las lluvias para encontrar hierba fresca.")
        ),
        BilingualQuestion(
            id = 12878, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus court intervalle migratoire?", listOf("Jours", "Semaines", "Heures", "Minutes"), "Nature", "Le plus court intervalle migratoire est de quelques heures, observé chez certaines espèces de zooplancton qui effectuent des migrations verticales quotidiennes dans l'océan."),
            en = LocalizedContent("What is the shortest migratory interval?", listOf("Days", "Weeks", "Hours", "Minutes"), "Nature", "The shortest migratory interval is a few hours, observed in some zooplankton species that perform daily vertical migrations in the ocean."),
            zh = LocalizedContent("最短的迁徙间隔是多少？", listOf("天", "周", "小时", "分钟"), "自然", "最短的迁徙间隔是几小时，在某些浮游动物物种中观察到，它们在海洋中进行每日垂直迁徙。"),
            es = LocalizedContent("¿Cuál es el intervalo migratorio más corto?", listOf("Días", "Semanas", "Horas", "Minutos"), "Naturaleza", "El intervalo migratorio más corto es de unas pocas horas, observado en algunas especies de zooplancton que realizan migraciones verticales diarias en el océano.")
        ),
        BilingualQuestion(
            id = 12879, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de fois le caribou change-t-il d'habitat?", listOf("Une fois", "Deux fois", "Quatre fois", "Huit fois"), "Nature", "Le caribou change d'habitat quatre fois par an pour suivre les saisons et les ressources alimentaires. Il se déplace entre les zones de mise bas, d'estivage, de rut et d'hivernage."),
            en = LocalizedContent("How many times does the caribou change its habitat?", listOf("Once", "Twice", "Four times", "Eight times"), "Nature", "The caribou changes its habitat four times a year to follow the seasons and food resources. It moves between calving, summer, rutting, and wintering areas."),
            zh = LocalizedContent("驯鹿改变栖息地多少次？", listOf("一次", "两次", "四次", "八次"), "自然", "驯鹿每年改变栖息地四次，以跟随季节和食物资源。它在产犊区、夏季区、交配区和冬季区之间移动。"),
            es = LocalizedContent("¿Cuántas veces cambia el caribú de hábitat?", listOf("Una vez", "Dos veces", "Cuatro veces", "Ocho veces"), "Naturaleza", "El caribú cambia de hábitat cuatro veces al año para seguir las estaciones y los recursos alimenticios. Se desplaza entre las zonas de parto, veraneo, celo e invernada.")
        ),
        BilingualQuestion(
            id = 12880, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année Oculus a-t-il été lancé?", listOf("2010", "2012", "2014", "2016"), "Technologie", "Oculus a été lancé en 2012 via une campagne Kickstarter pour son premier casque de réalité virtuelle, l'Oculus Rift, marquant le début de la démocratisation de cette technologie."),
            en = LocalizedContent("In what year was Oculus launched?", listOf("2010", "2012", "2014", "2016"), "Technology", "Oculus was launched in 2012 via a Kickstarter campaign for its first virtual reality headset, the Oculus Rift, marking the beginning of the democratization of this technology."),
            zh = LocalizedContent("Oculus是哪一年推出的？", listOf("2010", "2012", "2014", "2016"), "科技", "Oculus于2012年通过Kickstarter活动推出其第一款虚拟现实头显Oculus Rift，标志着这项技术普及的开始。"),
            es = LocalizedContent("¿En qué año se lanzó Oculus?", listOf("2010", "2012", "2014", "2016"), "Tecnología", "Oculus se lanzó en 2012 a través de una campaña de Kickstarter para su primer casco de realidad virtual, el Oculus Rift, marcando el inicio de la democratización de esta tecnología.")
        ),
        BilingualQuestion(
            id = 12881, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le prix du Meta Quest 3?", listOf("300€", "500€", "800€", "1200€"), "Technologie", "Le Meta Quest 3 a été lancé en 2023 à un prix de départ de 500€ pour le modèle de base, positionné comme un casque de réalité mixte grand public."),
            en = LocalizedContent("What is the price of the Meta Quest 3?", listOf("€300", "€500", "€800", "€1200"), "Technology", "The Meta Quest 3 was launched in 2023 at a starting price of €500 for the base model, positioned as a mainstream mixed reality headset."),
            zh = LocalizedContent("Meta Quest 3的价格是多少？", listOf("300欧元", "500欧元", "800欧元", "1200欧元"), "科技", "Meta Quest 3于2023年推出，基础型号起售价为500欧元，定位为主流混合现实头显。"),
            es = LocalizedContent("¿Cuál es el precio del Meta Quest 3?", listOf("300€", "500€", "800€", "1200€"), "Tecnología", "El Meta Quest 3 se lanzó en 2023 con un precio inicial de 500€ para el modelo base, posicionado como un casco de realidad mixta para el público general.")
        ),
        BilingualQuestion(
            id = 12882, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de pixels par œil le Meta Quest 3 a-t-il?", listOf("1440", "1920", "2560", "3840"), "Technologie", "Le Meta Quest 3 offre une résolution de 2560 x 2560 pixels par œil, soit une amélioration significative par rapport au Quest 2, permettant une image plus nette et immersive."),
            en = LocalizedContent("How many pixels per eye does the Meta Quest 3 have?", listOf("1440", "1920", "2560", "3840"), "Technology", "The Meta Quest 3 offers a resolution of 2560 x 2560 pixels per eye, a significant improvement over the Quest 2, providing a sharper and more immersive image."),
            zh = LocalizedContent("Meta Quest 3每只眼睛有多少像素？", listOf("1440", "1920", "2560", "3840"), "科技", "Meta Quest 3每只眼睛提供2560 x 2560像素的分辨率，相比Quest 2有显著提升，提供更清晰、更沉浸的图像。"),
            es = LocalizedContent("¿Cuántos píxeles por ojo tiene el Meta Quest 3?", listOf("1440", "1920", "2560", "3840"), "Tecnología", "El Meta Quest 3 ofrece una resolución de 2560 x 2560 píxeles por ojo, una mejora significativa respecto al Quest 2, proporcionando una imagen más nítida e inmersiva.")
        ),
        BilingualQuestion(
            id = 12883, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le taux de rafraîchissement standard en VR?", listOf("30 Hz", "60 Hz", "90 Hz", "120 Hz"), "Technologie", "Le taux de rafraîchissement standard en réalité virtuelle est de 90 Hz pour éviter la nausée et offrir une expérience fluide, car en dessous de ce seuil, le décalage visuel perturbe l'immersion."),
            en = LocalizedContent("What is the standard refresh rate in VR?", listOf("30 Hz", "60 Hz", "90 Hz", "120 Hz"), "Technology", "The standard refresh rate in virtual reality is 90 Hz to avoid nausea and provide a smooth experience, as below this threshold, visual lag disrupts immersion."),
            zh = LocalizedContent("VR中的标准刷新率是多少？", listOf("30 Hz", "60 Hz", "90 Hz", "120 Hz"), "科技", "虚拟现实中的标准刷新率为90 Hz，以避免恶心并提供流畅体验，因为低于此阈值时，视觉延迟会破坏沉浸感。"),
            es = LocalizedContent("¿Cuál es la frecuencia de actualización estándar en VR?", listOf("30 Hz", "60 Hz", "90 Hz", "120 Hz"), "Tecnología", "La frecuencia de actualización estándar en realidad virtual es de 90 Hz para evitar náuseas y ofrecer una experiencia fluida, ya que por debajo de este umbral, el desfase visual perturba la inmersión.")
        ),
        BilingualQuestion(
            id = 12884, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quelle est la latence acceptable en VR?", listOf("50ms", "20ms", "10ms", "5ms"), "Technologie", "En VR, une latence inférieure à 20 ms est nécessaire pour éviter la nausée, et 10 ms est considérée comme le seuil optimal pour une immersion fluide et réaliste."),
            en = LocalizedContent("What is the acceptable latency in VR?", listOf("50ms", "20ms", "10ms", "5ms"), "Technology", "In VR, a latency of less than 20 ms is necessary to avoid nausea, and 10 ms is considered the optimal threshold for smooth and realistic immersion."),
            zh = LocalizedContent("VR中可接受的延迟是多少？", listOf("50毫秒", "20毫秒", "10毫秒", "5毫秒"), "科技", "在VR中，延迟低于20毫秒是避免恶心所必需的，10毫秒被认为是实现流畅和真实沉浸的最佳阈值。"),
            es = LocalizedContent("¿Cuál es la latencia aceptable en VR?", listOf("50ms", "20ms", "10ms", "5ms"), "Tecnología", "En VR, una latencia inferior a 20 ms es necesaria para evitar náuseas, y 10 ms se considera el umbral óptimo para una inmersión fluida y realista.")
        ),
        BilingualQuestion(
            id = 12885, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien d'utilisateurs VR actifs existaient en 2023?", listOf("50 millions", "100 millions", "200 millions", "300 millions"), "Technologie", "En 2023, le nombre d'utilisateurs actifs de réalité virtuelle a atteint environ 200 millions, porté par la démocratisation des casques abordables et l'essor des applications grand public comme les jeux et la formation."),
            en = LocalizedContent("How many active VR users were there in 2023?", listOf("50 million", "100 million", "200 million", "300 million"), "Technology", "In 2023, the number of active virtual reality users reached approximately 200 million, driven by the democratization of affordable headsets and the rise of mainstream applications like gaming and training."),
            zh = LocalizedContent("2023年有多少活跃的VR用户？", listOf("5000万", "1亿", "2亿", "3亿"), "科技", "2023年，活跃的虚拟现实用户数量达到约2亿，得益于平价头显的普及以及游戏和培训等主流应用的兴起。"),
            es = LocalizedContent("¿Cuántos usuarios activos de VR había en 2023?", listOf("50 millones", "100 millones", "200 millones", "300 millones"), "Tecnología", "En 2023, el número de usuarios activos de realidad virtual alcanzó aproximadamente 200 millones, impulsado por la democratización de cascos asequibles y el auge de aplicaciones de consumo como juegos y formación.")
        ),
        BilingualQuestion(
            id = 12886, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le casque VR le plus vendu?", listOf("HTC Vive", "Meta Quest", "PlayStation VR", "Valve Index"), "Technologie", "Le Meta Quest (anciennement Oculus Quest) de Meta est le casque VR le plus vendu grâce à son rapport qualité-prix et son fonctionnement autonome, sans besoin d’un PC."),
            en = LocalizedContent("What is the best-selling VR headset?", listOf("HTC Vive", "Meta Quest", "PlayStation VR", "Valve Index"), "Technology", "The Meta Quest (formerly Oculus Quest) from Meta is the best-selling VR headset due to its value for money and standalone operation, without needing a PC."),
            zh = LocalizedContent("最畅销的VR头显是什么？", listOf("HTC Vive", "Meta Quest", "PlayStation VR", "Valve Index"), "科技", "Meta的Meta Quest（原Oculus Quest）是最畅销的VR头显，因其性价比高且无需PC即可独立运行。"),
            es = LocalizedContent("¿Cuál es el casco VR más vendido?", listOf("HTC Vive", "Meta Quest", "PlayStation VR", "Valve Index"), "Tecnología", "El Meta Quest (anteriormente Oculus Quest) de Meta es el casco VR más vendido gracias a su relación calidad-precio y su funcionamiento autónomo, sin necesidad de un PC.")
        ),
        BilingualQuestion(
            id = 12887, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année PlayStation VR a-t-il été lancé?", listOf("2014", "2015", "2016", "2017"), "Technologie", "Le PlayStation VR, le casque de réalité virtuelle de Sony, a été commercialisé en octobre 2016, en même temps que la PlayStation 4 Pro."),
            en = LocalizedContent("In what year was PlayStation VR launched?", listOf("2014", "2015", "2016", "2017"), "Technology", "The PlayStation VR, Sony's virtual reality headset, was released in October 2016, alongside the PlayStation 4 Pro."),
            zh = LocalizedContent("PlayStation VR是哪一年推出的？", listOf("2014", "2015", "2016", "2017"), "科技", "索尼的虚拟现实头显PlayStation VR于2016年10月与PlayStation 4 Pro一同发布。"),
            es = LocalizedContent("¿En qué año se lanzó PlayStation VR?", listOf("2014", "2015", "2016", "2017"), "Tecnología", "El PlayStation VR, el casco de realidad virtual de Sony, se comercializó en octubre de 2016, junto con la PlayStation 4 Pro.")
        ),
        BilingualQuestion(
            id = 12888, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est l'angle de vision du Meta Quest 3?", listOf("90°", "100°", "110°", "120°"), "Technologie", "Le Meta Quest 3 offre un champ de vision de 110 degrés, soit une amélioration par rapport aux 100 degrés du Quest 2, grâce à ses nouvelles optiques en forme de lentille pancake."),
            en = LocalizedContent("What is the field of view of the Meta Quest 3?", listOf("90°", "100°", "110°", "120°"), "Technology", "The Meta Quest 3 offers a field of view of 110 degrees, an improvement over the 100 degrees of the Quest 2, thanks to its new pancake lens optics."),
            zh = LocalizedContent("Meta Quest 3的视野角度是多少？", listOf("90°", "100°", "110°", "120°"), "科技", "Meta Quest 3提供110度的视野，相比Quest 2的100度有所提升，这得益于其新的煎饼透镜光学设计。"),
            es = LocalizedContent("¿Cuál es el campo de visión del Meta Quest 3?", listOf("90°", "100°", "110°", "120°"), "Tecnología", "El Meta Quest 3 ofrece un campo de visión de 110 grados, una mejora respecto a los 100 grados del Quest 2, gracias a sus nuevas ópticas de lente pancake.")
        ),
        BilingualQuestion(
            id = 12889, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de capteurs le Meta Quest 3 possède-t-il?", listOf("5", "8", "10", "15"), "Technologie", "Le Meta Quest 3 intègre 10 capteurs, combinant des caméras de suivi, des capteurs de profondeur et des accéléromètres pour une expérience de réalité mixte immersive."),
            en = LocalizedContent("How many sensors does the Meta Quest 3 have?", listOf("5", "8", "10", "15"), "Technology", "The Meta Quest 3 integrates 10 sensors, combining tracking cameras, depth sensors, and accelerometers for an immersive mixed reality experience."),
            zh = LocalizedContent("Meta Quest 3 有多少个传感器？", listOf("5", "8", "10", "15"), "科技", "Meta Quest 3 集成了 10 个传感器，包括追踪摄像头、深度传感器和加速度计，提供沉浸式混合现实体验。"),
            es = LocalizedContent("¿Cuántos sensores tiene el Meta Quest 3?", listOf("5", "8", "10", "15"), "Tecnología", "El Meta Quest 3 integra 10 sensores, combinando cámaras de seguimiento, sensores de profundidad y acelerómetros para una experiencia de realidad mixta inmersiva.")
        ),
        BilingualQuestion(
            id = 12890, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quelle est la limite de distance pour les contrôleurs VR?", listOf("5m", "10m", "20m", "30m"), "Technologie", "Les contrôleurs VR utilisent des capteurs infrarouges ou des caméras, dont la portée est généralement limitée à environ 20 mètres pour garantir une détection précise des mouvements."),
            en = LocalizedContent("What is the distance limit for VR controllers?", listOf("5m", "10m", "20m", "30m"), "Technology", "VR controllers use infrared sensors or cameras, whose range is generally limited to about 20 meters to ensure accurate motion detection."),
            zh = LocalizedContent("VR 控制器的距离限制是多少？", listOf("5米", "10米", "20米", "30米"), "科技", "VR 控制器使用红外传感器或摄像头，其范围通常限制在约 20 米，以确保精确的运动检测。"),
            es = LocalizedContent("¿Cuál es el límite de distancia para los controladores de RV?", listOf("5m", "10m", "20m", "30m"), "Tecnología", "Los controladores de RV utilizan sensores infrarrojos o cámaras, cuyo alcance generalmente se limita a unos 20 metros para garantizar una detección precisa del movimiento.")
        ),
        BilingualQuestion(
            id = 12891, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le poids du Meta Quest 3?", listOf("400g", "500g", "600g", "700g"), "Technologie", "Le Meta Quest 3 pèse environ 500 grammes, un équilibre entre confort et performance pour un casque de réalité mixte autonome."),
            en = LocalizedContent("What is the weight of the Meta Quest 3?", listOf("400g", "500g", "600g", "700g"), "Technology", "The Meta Quest 3 weighs about 500 grams, a balance between comfort and performance for a standalone mixed reality headset."),
            zh = LocalizedContent("Meta Quest 3 的重量是多少？", listOf("400克", "500克", "600克", "700克"), "科技", "Meta Quest 3 重约 500 克，在舒适性和性能之间取得平衡，是一款独立混合现实头显。"),
            es = LocalizedContent("¿Cuál es el peso del Meta Quest 3?", listOf("400g", "500g", "600g", "700g"), "Tecnología", "El Meta Quest 3 pesa aproximadamente 500 gramos, un equilibrio entre comodidad y rendimiento para un casco de realidad mixta autónomo.")
        ),
        BilingualQuestion(
            id = 12892, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien d'heures l'autonomie batterie du Quest 3?", listOf("2h", "3h", "5h", "8h"), "Technologie", "Le Meta Quest 3 offre une autonomie d'environ 2 à 3 heures en utilisation intensive, selon les applications et les réglages."),
            en = LocalizedContent("How many hours of battery life does the Quest 3 have?", listOf("2h", "3h", "5h", "8h"), "Technology", "The Meta Quest 3 offers about 2 to 3 hours of battery life under intensive use, depending on applications and settings."),
            zh = LocalizedContent("Quest 3 的电池续航时间是多少小时？", listOf("2小时", "3小时", "5小时", "8小时"), "科技", "Meta Quest 3 在密集使用下提供约 2 到 3 小时的电池续航，具体取决于应用程序和设置。"),
            es = LocalizedContent("¿Cuántas horas de autonomía tiene la batería del Quest 3?", listOf("2h", "3h", "5h", "8h"), "Tecnología", "El Meta Quest 3 ofrece una autonomía de aproximadamente 2 a 3 horas en uso intensivo, según las aplicaciones y los ajustes.")
        ),
        BilingualQuestion(
            id = 12893, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le résolution 4K?", listOf("3840x2160", "2560x1440", "1920x1080", "1280x720"), "Technologie", "La résolution 4K, aussi appelée Ultra HD, correspond à 3840 pixels de largeur sur 2160 pixels de hauteur, soit quatre fois la définition du Full HD (1920x1080)."),
            en = LocalizedContent("What is the 4K resolution?", listOf("3840x2160", "2560x1440", "1920x1080", "1280x720"), "Technology", "4K resolution, also called Ultra HD, corresponds to 3840 pixels wide by 2160 pixels high, four times the definition of Full HD (1920x1080)."),
            zh = LocalizedContent("4K 分辨率是多少？", listOf("3840x2160", "2560x1440", "1920x1080", "1280x720"), "科技", "4K 分辨率，也称为超高清，对应 3840 像素宽乘以 2160 像素高，是全高清（1920x1080）的四倍清晰度。"),
            es = LocalizedContent("¿Cuál es la resolución 4K?", listOf("3840x2160", "2560x1440", "1920x1080", "1280x720"), "Tecnología", "La resolución 4K, también llamada Ultra HD, corresponde a 3840 píxeles de ancho por 2160 píxeles de alto, cuatro veces la definición del Full HD (1920x1080).")
        ),
        BilingualQuestion(
            id = 12894, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de caméras le Meta Quest 3 possède-t-il?", listOf("4", "6", "8", "10"), "Technologie", "Le Meta Quest 3 est équipé de deux caméras RV pour la réalité mixte, de quatre caméras de suivi, et de deux caméras de profondeur, totalisant huit capteurs."),
            en = LocalizedContent("How many cameras does the Meta Quest 3 have?", listOf("4", "6", "8", "10"), "Technology", "The Meta Quest 3 is equipped with two RGB cameras for mixed reality, four tracking cameras, and two depth cameras, totaling eight sensors."),
            zh = LocalizedContent("Meta Quest 3 有多少个摄像头？", listOf("4", "6", "8", "10"), "科技", "Meta Quest 3 配备了两个用于混合现实的 RGB 摄像头、四个追踪摄像头和两个深度摄像头，总共八个传感器。"),
            es = LocalizedContent("¿Cuántas cámaras tiene el Meta Quest 3?", listOf("4", "6", "8", "10"), "Tecnología", "El Meta Quest 3 está equipado con dos cámaras RGB para realidad mixta, cuatro cámaras de seguimiento y dos cámaras de profundidad, totalizando ocho sensores.")
        ),
        BilingualQuestion(
            id = 12895, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quelle est la température idéale pour la VR?", listOf("15°C", "20°C", "25°C", "30°C"), "Technologie", "Une température ambiante de 20°C est recommandée pour la réalité virtuelle afin d'éviter la surchauffe du casque et l'inconfort du joueur pendant l'effort."),
            en = LocalizedContent("What is the ideal temperature for VR?", listOf("15°C", "20°C", "25°C", "30°C"), "Technology", "An ambient temperature of 20°C is recommended for virtual reality to avoid overheating of the headset and player discomfort during exertion."),
            zh = LocalizedContent("VR 的理想温度是多少？", listOf("15°C", "20°C", "25°C", "30°C"), "科技", "建议虚拟现实的环境温度为 20°C，以避免头显过热和玩家在运动时感到不适。"),
            es = LocalizedContent("¿Cuál es la temperatura ideal para la RV?", listOf("15°C", "20°C", "25°C", "30°C"), "Tecnología", "Se recomienda una temperatura ambiente de 20°C para la realidad virtual para evitar el sobrecalentamiento del casco y la incomodidad del jugador durante el esfuerzo.")
        ),
        BilingualQuestion(
            id = 12896, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le taux d'adoption VR grand public?", listOf("5%", "10%", "20%", "40%"), "Technologie", "En 2023, environ 10% des foyers américains possédaient un casque de réalité virtuelle, selon les données du marché. Ce taux reflète une adoption encore limitée, freinée par le coût et le manque de contenus."),
            en = LocalizedContent("What is the consumer VR adoption rate?", listOf("5%", "10%", "20%", "40%"), "Technology", "In 2023, about 10% of US households owned a virtual reality headset, according to market data. This rate reflects still limited adoption, hindered by cost and lack of content."),
            zh = LocalizedContent("消费者 VR 的采用率是多少？", listOf("5%", "10%", "20%", "40%"), "科技", "根据市场数据，2023 年约有 10% 的美国家庭拥有虚拟现实头显。这一比率反映了采用率仍然有限，受到成本和内容缺乏的阻碍。"),
            es = LocalizedContent("¿Cuál es la tasa de adopción de RV entre los consumidores?", listOf("5%", "10%", "20%", "40%"), "Tecnología", "En 2023, aproximadamente el 10% de los hogares estadounidenses poseían un casco de realidad virtual, según datos del mercado. Esta tasa refleja una adopción aún limitada, frenada por el costo y la falta de contenido.")
        ),
        BilingualQuestion(
            id = 12897, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de jeux VR existaient en 2023?", listOf("1000", "3000", "5000", "10000"), "Technologie", "En 2023, le catalogue de jeux compatibles avec la réalité virtuelle dépassait les 10 000 titres sur les principales plateformes comme SteamVR et l'Oculus Store."),
            en = LocalizedContent("How many VR games existed in 2023?", listOf("1000", "3000", "5000", "10000"), "Technology", "In 2023, the catalog of VR-compatible games exceeded 10,000 titles on major platforms like SteamVR and the Oculus Store."),
            zh = LocalizedContent("2023 年有多少款 VR 游戏？", listOf("1000", "3000", "5000", "10000"), "科技", "2023 年，在 SteamVR 和 Oculus Store 等主要平台上，兼容 VR 的游戏目录超过 10,000 款。"),
            es = LocalizedContent("¿Cuántos juegos de RV existían en 2023?", listOf("1000", "3000", "5000", "10000"), "Tecnología", "En 2023, el catálogo de juegos compatibles con RV superó los 10,000 títulos en las principales plataformas como SteamVR y Oculus Store.")
        ),
        BilingualQuestion(
            id = 12898, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le prix du Valve Index?", listOf("500€", "800€", "1100€", "1500€"), "Technologie", "Le Valve Index, un casque de réalité virtuelle haut de gamme de Valve, était proposé à 1100€ lors de son lancement en 2019, incluant les contrôleurs et les stations de base."),
            en = LocalizedContent("What is the price of the Valve Index?", listOf("€500", "€800", "€1100", "€1500"), "Technology", "The Valve Index, a high-end virtual reality headset from Valve, was priced at €1100 at its launch in 2019, including controllers and base stations."),
            zh = LocalizedContent("Valve Index 的价格是多少？", listOf("500欧元", "800欧元", "1100欧元", "1500欧元"), "科技", "Valve Index 是 Valve 的一款高端虚拟现实头显，2019 年发布时售价为 1100 欧元，包括控制器和基站。"),
            es = LocalizedContent("¿Cuál es el precio del Valve Index?", listOf("500€", "800€", "1100€", "1500€"), "Tecnología", "El Valve Index, un casco de realidad virtual de alta gama de Valve, se ofrecía a 1100€ en su lanzamiento en 2019, incluyendo los controladores y las estaciones base.")
        ),
        BilingualQuestion(
            id = 12899, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de mégahertz le processeur du Quest 3?", listOf("2000", "3000", "4000", "5000"), "Technologie", "Le processeur du Meta Quest 3, le Snapdragon XR2 Gen 2, fonctionne à une fréquence maximale de 4 GHz, soit 4000 MHz."),
            en = LocalizedContent("How many megahertz is the Quest 3 processor?", listOf("2000", "3000", "4000", "5000"), "Technology", "The Meta Quest 3 processor, the Snapdragon XR2 Gen 2, runs at a maximum frequency of 4 GHz, which is 4000 MHz."),
            zh = LocalizedContent("Quest 3 的处理器有多少兆赫？", listOf("2000", "3000", "4000", "5000"), "科技", "Meta Quest 3 的处理器 Snapdragon XR2 Gen 2 最高频率为 4 GHz，即 4000 MHz。"),
            es = LocalizedContent("¿Cuántos megahercios tiene el procesador del Quest 3?", listOf("2000", "3000", "4000", "5000"), "Tecnología", "El procesador del Meta Quest 3, el Snapdragon XR2 Gen 2, funciona a una frecuencia máxima de 4 GHz, es decir, 4000 MHz.")
        ),
        BilingualQuestion(
            id = 12900, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("En quelle année la Guerre de Sécession a-t-elle commencé?", listOf("1860", "1861", "1862", "1863"), "Histoire", "La guerre de Sécession a débuté en 1861 suite à l'élection d'Abraham Lincoln et à la sécession des États du Sud. Les hostilités ont commencé avec l'attaque confédérée sur Fort Sumter en avril 1861."),
            en = LocalizedContent("In what year did the American Civil War begin?", listOf("1860", "1861", "1862", "1863"), "History", "The American Civil War began in 1861 following the election of Abraham Lincoln and the secession of Southern states. Hostilities started with the Confederate attack on Fort Sumter in April 1861."),
            zh = LocalizedContent("美国内战在哪一年开始？", listOf("1860", "1861", "1862", "1863"), "历史", "美国内战于 1861 年开始，起因是亚伯拉罕·林肯当选和南方各州脱离联邦。敌对行动始于 1861 年 4 月南方邦联对萨姆特堡的进攻。"),
            es = LocalizedContent("¿En qué año comenzó la Guerra Civil estadounidense?", listOf("1860", "1861", "1862", "1863"), "Historia", "La Guerra Civil estadounidense comenzó en 1861 tras la elección de Abraham Lincoln y la secesión de los estados del sur. Las hostilidades comenzaron con el ataque confederado a Fort Sumter en abril de 1861.")
        ),
        BilingualQuestion(
            id = 12901, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Combien d'États confédérés ont participé à la Guerre de Sécession?", listOf("7", "11", "15", "20"), "Histoire", "Onze États esclavagistes du Sud ont fait sécession de l'Union entre 1860 et 1861 pour former les États confédérés d'Amérique, déclenchant la Guerre de Sécession."),
            en = LocalizedContent("How many Confederate states participated in the American Civil War?", listOf("7", "11", "15", "20"), "History", "Eleven Southern slave states seceded from the Union between 1860 and 1861 to form the Confederate States of America, triggering the American Civil War."),
            zh = LocalizedContent("有多少个邦联州参加了美国内战？", listOf("7", "11", "15", "20"), "历史", "1860 年至 1861 年间，有 11 个南方蓄奴州脱离联邦，组成美利坚邦联国，从而引发了美国内战。"),
            es = LocalizedContent("¿Cuántos estados confederados participaron en la Guerra Civil estadounidense?", listOf("7", "11", "15", "20"), "Historia", "Once estados esclavistas del sur se separaron de la Unión entre 1860 y 1861 para formar los Estados Confederados de América, desencadenando la Guerra Civil estadounidense.")
        ),
        BilingualQuestion(
            id = 12902, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel général confédéré a remporté le plus de victoires?", listOf("Grant", "Lee", "Jackson", "Beauregard"), "Histoire", "Thomas Jonathan « Stonewall » Jackson est considéré comme l'un des plus brillants stratèges de la guerre de Sécession, remportant des batailles décisives comme celle de Chancellorsville."),
            en = LocalizedContent("Which Confederate general won the most victories?", listOf("Grant", "Lee", "Jackson", "Beauregard"), "History", "Thomas Jonathan 'Stonewall' Jackson is considered one of the most brilliant strategists of the American Civil War, winning decisive battles such as Chancellorsville."),
            zh = LocalizedContent("哪位邦联将军赢得了最多的胜利？", listOf("格兰特", "李", "杰克逊", "博雷加德"), "历史", "托马斯·乔纳森·“石墙”·杰克逊被认为是美国内战中最杰出的战略家之一，赢得了如钱斯勒斯维尔等决定性战役。"),
            es = LocalizedContent("¿Qué general confederado obtuvo más victorias?", listOf("Grant", "Lee", "Jackson", "Beauregard"), "Historia", "Thomas Jonathan 'Stonewall' Jackson es considerado uno de los estrategas más brillantes de la Guerra Civil estadounidense, ganando batallas decisivas como la de Chancellorsville.")
        ),
        BilingualQuestion(
            id = 12903, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("En quelle année la Guerre de Sécession a-t-elle pris fin?", listOf("1864", "1865", "1866", "1867"), "Histoire", "La guerre de Sécession s'est achevée en 1865 avec la reddition du général confédéré Robert E. Lee à Appomattox, mettant fin à quatre années de conflit entre les États du Nord et du Sud."),
            en = LocalizedContent("In what year did the American Civil War end?", listOf("1864", "1865", "1866", "1867"), "History", "The American Civil War ended in 1865 with the surrender of Confederate General Robert E. Lee at Appomattox, ending four years of conflict between the Northern and Southern states."),
            zh = LocalizedContent("美国内战在哪一年结束？", listOf("1864", "1865", "1866", "1867"), "历史", "美国内战于 1865 年结束，邦联将军罗伯特·E·李在阿波马托克斯投降，结束了南北双方四年的冲突。"),
            es = LocalizedContent("¿En qué año terminó la Guerra Civil estadounidense?", listOf("1864", "1865", "1866", "1867"), "Historia", "La Guerra Civil estadounidense terminó en 1865 con la rendición del general confederado Robert E. Lee en Appomattox, poniendo fin a cuatro años de conflicto entre los estados del norte y del sur.")
        ),
        BilingualQuestion(
            id = 12904, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de soldats sont morts pendant la Guerre de Sécession?", listOf("200000", "400000", "600000", "800000"), "Histoire", "La Guerre de Sécession américaine (1861-1865) fut l'un des conflits les plus meurtriers de l'histoire des États-Unis, avec environ 600 000 soldats morts au combat ou des suites de maladies."),
            en = LocalizedContent("How many soldiers died during the American Civil War?", listOf("200000", "400000", "600000", "800000"), "History", "The American Civil War (1861-1865) was one of the deadliest conflicts in U.S. history, with approximately 600,000 soldiers dying in combat or from disease."),
            zh = LocalizedContent("美国内战期间有多少士兵死亡？", listOf("200000", "400000", "600000", "800000"), "历史", "美国内战（1861-1865）是美国历史上最致命的冲突之一，约有 60 万士兵在战斗中或因病死亡。"),
            es = LocalizedContent("¿Cuántos soldados murieron durante la Guerra Civil estadounidense?", listOf("200000", "400000", "600000", "800000"), "Historia", "La Guerra Civil estadounidense (1861-1865) fue uno de los conflictos más mortíferos de la historia de EE. UU., con aproximadamente 600,000 soldados muertos en combate o por enfermedades.")
        ),
        BilingualQuestion(
            id = 12905, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel était le président de la Confédération?", listOf("Abraham Lincoln", "Jefferson Davis", "Andrew Johnson", "James Buchanan"), "Histoire", "Jefferson Davis fut le président des États confédérés d'Amérique, de 1861 à 1865, durant la guerre de Sécession."),
            en = LocalizedContent("Who was the president of the Confederacy?", listOf("Abraham Lincoln", "Jefferson Davis", "Andrew Johnson", "James Buchanan"), "History", "Jefferson Davis was the president of the Confederate States of America from 1861 to 1865 during the American Civil War."),
            zh = LocalizedContent("谁是邦联的总统？", listOf("亚伯拉罕·林肯", "杰斐逊·戴维斯", "安德鲁·约翰逊", "詹姆斯·布坎南"), "历史", "杰斐逊·戴维斯在 1861 年至 1865 年美国内战期间担任美利坚邦联国的总统。"),
            es = LocalizedContent("¿Quién fue el presidente de la Confederación?", listOf("Abraham Lincoln", "Jefferson Davis", "Andrew Johnson", "James Buchanan"), "Historia", "Jefferson Davis fue el presidente de los Estados Confederados de América de 1861 a 1865 durante la Guerra Civil estadounidense.")
        ),
        BilingualQuestion(
            id = 12906, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quelle bataille a tourné le cours de la guerre?", listOf("Gettysburg", "Antietam", "Shiloh", "Fort Sumter"), "Histoire", "La bataille de Gettysburg, en juillet 1863, marque un tournant décisif de la guerre de Sécession en stoppant l'invasion nordiste du territoire nord-américain par les Confédérés."),
            en = LocalizedContent("Which battle turned the tide of the war?", listOf("Gettysburg", "Antietam", "Shiloh", "Fort Sumter"), "History", "The Battle of Gettysburg in July 1863 marked a decisive turning point in the American Civil War, halting the Confederate invasion of the North."),
            zh = LocalizedContent("哪场战役扭转了战争的局势？", listOf("葛底斯堡", "安提塔姆", "夏伊洛", "萨姆特堡"), "历史", "1863 年 7 月的葛底斯堡战役是美国内战的决定性转折点，阻止了邦联对北方的入侵。"),
            es = LocalizedContent("¿Qué batalla cambió el rumbo de la guerra?", listOf("Gettysburg", "Antietam", "Shiloh", "Fort Sumter"), "Historia", "La batalla de Gettysburg en julio de 1863 marcó un punto de inflexión decisivo en la Guerra Civil estadounidense, deteniendo la invasión confederada del Norte.")
        ),
        BilingualQuestion(
            id = 12907, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de batailles majeures la Guerre de Sécession a-t-elle eu?", listOf("10", "30", "50", "100"), "Histoire", "La Guerre de Sécession américaine (1861-1865) a compté environ 50 batailles majeures, selon les historiens, incluant des affrontements comme Gettysburg et Antietam."),
            en = LocalizedContent("How many major battles did the American Civil War have?", listOf("10", "30", "50", "100"), "History", "The American Civil War (1861-1865) had about 50 major battles according to historians, including engagements like Gettysburg and Antietam."),
            zh = LocalizedContent("美国内战有多少场主要战役？", listOf("10", "30", "50", "100"), "历史", "根据历史学家的说法，美国内战（1861-1865）约有 50 场主要战役，包括葛底斯堡和安提塔姆等战斗。"),
            es = LocalizedContent("¿Cuántas batallas importantes tuvo la Guerra Civil estadounidense?", listOf("10", "30", "50", "100"), "Historia", "La Guerra Civil estadounidense (1861-1865) tuvo alrededor de 50 batallas importantes según los historiadores, incluyendo enfrentamientos como Gettysburg y Antietam.")
        ),
        BilingualQuestion(
            id = 12908, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel général de l'Union a remporté plus de batailles?", listOf("Grant", "Sherman", "Meade", "Burnside"), "Histoire", "William Tecumseh Sherman est connu pour sa campagne dévastatrice à travers la Géorgie et les Carolines, remportant des victoires clés comme la prise d'Atlanta."),
            en = LocalizedContent("Which Union general won more battles?", listOf("Grant", "Sherman", "Meade", "Burnside"), "History", "William Tecumseh Sherman is known for his devastating campaign through Georgia and the Carolinas, winning key victories like the capture of Atlanta."),
            zh = LocalizedContent("哪位联邦将军赢得了更多战役？", listOf("格兰特", "谢尔曼", "米德", "伯恩赛德"), "历史", "威廉·特库姆塞·谢尔曼以其穿越佐治亚州和卡罗来纳州的毁灭性战役而闻名，赢得了如攻占亚特兰大等关键胜利。"),
            es = LocalizedContent("¿Qué general de la Unión ganó más batallas?", listOf("Grant", "Sherman", "Meade", "Burnside"), "Historia", "William Tecumseh Sherman es conocido por su devastadora campaña a través de Georgia y las Carolinas, ganando victorias clave como la captura de Atlanta.")
        ),
        BilingualQuestion(
            id = 12909, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année la Proclamation d'Émancipation a-t-elle été signée?", listOf("1861", "1862", "1863", "1864"), "Histoire", "Signée par Abraham Lincoln le 1er janvier 1863, cette proclamation déclarait libres les esclaves des États confédérés pendant la guerre de Sécession."),
            en = LocalizedContent("In what year was the Emancipation Proclamation signed?", listOf("1861", "1862", "1863", "1864"), "History", "Signed by Abraham Lincoln on January 1, 1863, this proclamation declared free the slaves in the Confederate states during the Civil War."),
            zh = LocalizedContent("《解放宣言》是在哪一年签署的？", listOf("1861年", "1862年", "1863年", "1864年"), "历史", "亚伯拉罕·林肯于1863年1月1日签署了这份宣言，宣布内战期间南部邦联各州的奴隶获得自由。"),
            es = LocalizedContent("¿En qué año se firmó la Proclamación de Emancipación?", listOf("1861", "1862", "1863", "1864"), "Historia", "Firmada por Abraham Lincoln el 1 de enero de 1863, esta proclamación declaró libres a los esclavos de los estados confederados durante la Guerra Civil.")
        ),
        BilingualQuestion(
            id = 12910, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien d'esclaves la Proclamation d'Émancipation a-t-elle libérés?", listOf("1 million", "3 millions", "5 millions", "7 millions"), "Histoire", "La Proclamation d'Émancipation, décrétée par Abraham Lincoln en 1863, ne s'appliquait qu'aux États confédérés en rébellion, libérant environ 3 millions d'esclaves sur les 4 millions que comptaient les États-Unis."),
            en = LocalizedContent("How many slaves did the Emancipation Proclamation free?", listOf("1 million", "3 million", "5 million", "7 million"), "History", "The Emancipation Proclamation, decreed by Abraham Lincoln in 1863, only applied to the rebellious Confederate states, freeing about 3 million of the 4 million slaves in the United States."),
            zh = LocalizedContent("《解放宣言》解放了多少奴隶？", listOf("100万", "300万", "500万", "700万"), "历史", "亚伯拉罕·林肯于1863年颁布的《解放宣言》仅适用于反叛的南部邦联各州，解放了美国约400万奴隶中的300万。"),
            es = LocalizedContent("¿Cuántos esclavos liberó la Proclamación de Emancipación?", listOf("1 millón", "3 millones", "5 millones", "7 millones"), "Historia", "La Proclamación de Emancipación, decretada por Abraham Lincoln en 1863, solo se aplicaba a los estados confederados rebeldes, liberando a unos 3 millones de los 4 millones de esclavos en Estados Unidos.")
        ),
        BilingualQuestion(
            id = 12911, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel fort a été attaqué en premier par les confédérés?", listOf("Fort Sumter", "Fort Pickens", "Fort Jefferson", "Fort Jefferson"), "Histoire", "Le Fort Sumter, situé dans le port de Charleston en Caroline du Sud, fut bombardé par les forces confédérées le 12 avril 1861, marquant le début de la guerre de Sécession."),
            en = LocalizedContent("Which fort was first attacked by the Confederates?", listOf("Fort Sumter", "Fort Pickens", "Fort Jefferson", "Fort Jefferson"), "History", "Fort Sumter, located in Charleston Harbor, South Carolina, was bombarded by Confederate forces on April 12, 1861, marking the start of the Civil War."),
            zh = LocalizedContent("南部邦联首先攻击了哪个堡垒？", listOf("萨姆特堡", "皮肯斯堡", "杰斐逊堡", "杰斐逊堡"), "历史", "位于南卡罗来纳州查尔斯顿港的萨姆特堡于1861年4月12日遭到南部邦联军队炮击，标志着内战的开始。"),
            es = LocalizedContent("¿Qué fuerte fue atacado primero por los confederados?", listOf("Fort Sumter", "Fort Pickens", "Fort Jefferson", "Fort Jefferson"), "Historia", "El Fuerte Sumter, ubicado en el puerto de Charleston, Carolina del Sur, fue bombardeado por las fuerzas confederadas el 12 de abril de 1861, marcando el inicio de la Guerra Civil.")
        ),
        BilingualQuestion(
            id = 12912, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année la Reconstruction du Sud a-t-elle commencé?", listOf("1863", "1865", "1867", "1870"), "Histoire", "La Reconstruction du Sud a commencé en 1865, juste après la fin de la guerre de Sécession, visant à réintégrer les États confédérés et à gérer les droits des anciens esclaves."),
            en = LocalizedContent("In what year did Reconstruction of the South begin?", listOf("1863", "1865", "1867", "1870"), "History", "Reconstruction of the South began in 1865, right after the end of the Civil War, aiming to reintegrate the Confederate states and manage the rights of former slaves."),
            zh = LocalizedContent("南方的重建是在哪一年开始的？", listOf("1863年", "1865年", "1867年", "1870年"), "历史", "南方的重建始于1865年，即内战结束后不久，旨在重新整合南部邦联各州并处理前奴隶的权利问题。"),
            es = LocalizedContent("¿En qué año comenzó la Reconstrucción del Sur?", listOf("1863", "1865", "1867", "1870"), "Historia", "La Reconstrucción del Sur comenzó en 1865, justo después del fin de la Guerra Civil, con el objetivo de reintegrar los estados confederados y gestionar los derechos de los antiguos esclavos.")
        ),
        BilingualQuestion(
            id = 12913, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien d'États du Sud avaient aboli l'esclavage à la fin de la guerre?", listOf("0", "5", "10", "15"), "Histoire", "La guerre de Sécession s'est achevée sans qu'aucun État du Sud n'ait volontairement aboli l'esclavage ; l'abolition a été imposée par le 13e amendement en 1865."),
            en = LocalizedContent("How many Southern states had abolished slavery by the end of the war?", listOf("0", "5", "10", "15"), "History", "The Civil War ended without any Southern state voluntarily abolishing slavery; abolition was imposed by the 13th Amendment in 1865."),
            zh = LocalizedContent("战争结束时，有多少南方州废除了奴隶制？", listOf("0个", "5个", "10个", "15个"), "历史", "内战结束时，没有任何南方州自愿废除奴隶制；废除奴隶制是由1865年的第13修正案强制实施的。"),
            es = LocalizedContent("¿Cuántos estados del Sur habían abolido la esclavitud al final de la guerra?", listOf("0", "5", "10", "15"), "Historia", "La Guerra Civil terminó sin que ningún estado del Sur aboliera voluntariamente la esclavitud; la abolición fue impuesta por la 13.ª Enmienda en 1865.")
        ),
        BilingualQuestion(
            id = 12914, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel général confédéré a continué à combattre le plus longtemps?", listOf("Lee", "Joseph Johnston", "Hood", "Longstreet"), "Histoire", "Joseph Johnston commanda la dernière armée confédérée encore en campagne, se rendant à Sherman le 26 avril 1865, soit près de deux semaines après la capitulation de Lee."),
            en = LocalizedContent("Which Confederate general fought the longest?", listOf("Lee", "Joseph Johnston", "Hood", "Longstreet"), "History", "Joseph Johnston commanded the last Confederate army still in the field, surrendering to Sherman on April 26, 1865, nearly two weeks after Lee's capitulation."),
            zh = LocalizedContent("哪位南部邦联将军战斗时间最长？", listOf("李", "约瑟夫·约翰斯顿", "胡德", "朗斯特里特"), "历史", "约瑟夫·约翰斯顿指挥了最后一支仍在作战的南部邦联军队，于1865年4月26日向谢尔曼投降，比李将军投降晚了近两周。"),
            es = LocalizedContent("¿Qué general confederado luchó más tiempo?", listOf("Lee", "Joseph Johnston", "Hood", "Longstreet"), "Historia", "Joseph Johnston comandó el último ejército confederado en campaña, rindiéndose a Sherman el 26 de abril de 1865, casi dos semanas después de la capitulación de Lee.")
        ),
        BilingualQuestion(
            id = 12915, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de régiments entièrement noirs ont participé à la guerre?", listOf("10", "50", "100", "200"), "Histoire", "Pendant la guerre de Sécession, environ 100 régiments entièrement noirs, appelés United States Colored Troops, ont combattu pour l'Union."),
            en = LocalizedContent("How many all-black regiments fought in the war?", listOf("10", "50", "100", "200"), "History", "During the Civil War, about 100 all-black regiments, called United States Colored Troops, fought for the Union."),
            zh = LocalizedContent("有多少个全黑人团参加了战争？", listOf("10个", "50个", "100个", "200个"), "历史", "内战期间，大约有100个全黑人团，称为美国有色人种部队，为联邦而战。"),
            es = LocalizedContent("¿Cuántos regimientos completamente negros lucharon en la guerra?", listOf("10", "50", "100", "200"), "Historia", "Durante la Guerra Civil, unos 100 regimientos completamente negros, llamados Tropas de Color de los Estados Unidos, lucharon por la Unión.")
        ),
        BilingualQuestion(
            id = 12916, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année le 13ème Amendement a-t-il été ratifié?", listOf("1865", "1866", "1867", "1868"), "Histoire", "Le 13e Amendement, abolissant l'esclavage aux États-Unis, a été ratifié en 1865, après la guerre de Sécession et l'adoption par le Congrès en janvier de la même année."),
            en = LocalizedContent("In what year was the 13th Amendment ratified?", listOf("1865", "1866", "1867", "1868"), "History", "The 13th Amendment, abolishing slavery in the United States, was ratified in 1865, after the Civil War and Congress's adoption in January of the same year."),
            zh = LocalizedContent("第13修正案是在哪一年批准的？", listOf("1865年", "1866年", "1867年", "1868年"), "历史", "废除美国奴隶制的第13修正案于1865年批准，此前国会于同年1月通过。"),
            es = LocalizedContent("¿En qué año se ratificó la 13.ª Enmienda?", listOf("1865", "1866", "1867", "1868"), "Historia", "La 13.ª Enmienda, que abolió la esclavitud en Estados Unidos, fue ratificada en 1865, después de la Guerra Civil y la adopción por el Congreso en enero del mismo año.")
        ),
        BilingualQuestion(
            id = 12917, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel bloc continental représentait la Confédération?", listOf("Nord", "Sud", "Est", "Ouest"), "Histoire", "La Confédération désigne le regroupement des États du Sud lors de la guerre de Sécession aux États-Unis, opposé au Nord (l'Union)."),
            en = LocalizedContent("Which continental bloc did the Confederacy represent?", listOf("North", "South", "East", "West"), "History", "The Confederacy refers to the grouping of Southern states during the American Civil War, opposed to the North (the Union)."),
            zh = LocalizedContent("南部邦联代表哪个大陆集团？", listOf("北方", "南方", "东方", "西方"), "历史", "南部邦联指的是美国内战期间南方各州的联盟，与北方（联邦）相对。"),
            es = LocalizedContent("¿Qué bloque continental representaba la Confederación?", listOf("Norte", "Sur", "Este", "Oeste"), "Historia", "La Confederación se refiere a la agrupación de los estados del Sur durante la Guerra Civil estadounidense, opuesta al Norte (la Unión).")
        ),
        BilingualQuestion(
            id = 12918, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de vies civiles ont été perdues?", listOf("50000", "100000", "200000", "300000"), "Histoire", "Le bombardement atomique d'Hiroshima le 6 août 1945 causa environ 200 000 morts civiles, incluant les victimes immédiates et celles des radiations."),
            en = LocalizedContent("How many civilian lives were lost?", listOf("50000", "100000", "200000", "300000"), "History", "The atomic bombing of Hiroshima on August 6, 1945 caused about 200,000 civilian deaths, including immediate victims and those from radiation."),
            zh = LocalizedContent("有多少平民丧生？", listOf("5万", "10万", "20万", "30万"), "历史", "1945年8月6日广岛原子弹爆炸造成约20万平民死亡，包括直接受害者和辐射受害者。"),
            es = LocalizedContent("¿Cuántas vidas civiles se perdieron?", listOf("50000", "100000", "200000", "300000"), "Historia", "El bombardeo atómico de Hiroshima el 6 de agosto de 1945 causó alrededor de 200,000 muertes civiles, incluyendo víctimas inmediatas y por radiación.")
        ),
        BilingualQuestion(
            id = 12919, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel matériel de guerre a été le plus utilisé?", listOf("Fusil Minié", "Fusil Springfield", "Revolver Colt", "Sabre"), "Histoire", "Le fusil Minié, inventé par Claude-Étienne Minié dans les années 1840, a été massivement utilisé pendant la guerre de Sécession américaine et les conflits du XIXe siècle, grâce à sa balle conique améliorant la portée et la précision."),
            en = LocalizedContent("Which piece of military equipment was the most used?", listOf("Minié rifle", "Springfield rifle", "Colt revolver", "Sabre"), "History", "The Minié rifle, invented by Claude-Étienne Minié in the 1840s, was massively used during the American Civil War and 19th-century conflicts, thanks to its conical bullet improving range and accuracy."),
            zh = LocalizedContent("哪种军事装备使用最广泛？", listOf("米尼埃步枪", "斯普林菲尔德步枪", "柯尔特左轮手枪", "军刀"), "历史", "米尼埃步枪由克洛德-艾蒂安·米尼埃在19世纪40年代发明，在美国内战和19世纪的冲突中被大量使用，其锥形子弹提高了射程和精度。"),
            es = LocalizedContent("¿Qué material de guerra fue el más utilizado?", listOf("Fusil Minié", "Fusil Springfield", "Revólver Colt", "Sable"), "Historia", "El fusil Minié, inventado por Claude-Étienne Minié en la década de 1840, fue masivamente utilizado durante la Guerra de Secesión estadounidense y los conflictos del siglo XIX, gracias a su bala cónica que mejoraba el alcance y la precisión.")
        ),
        BilingualQuestion(
            id = 13100, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel pays accueille traditionnellement les Jeux Olympiques d'hiver?", listOf("Suisse", "Japon", "Variable selon l'année", "Canada"), "Sport", "Les Jeux Olympiques d'hiver changent de pays hôte à chaque édition, selon le choix du Comité International Olympique. Aucun pays n'est fixe, contrairement aux Jeux antiques."),
            en = LocalizedContent("Which country traditionally hosts the Winter Olympic Games?", listOf("Switzerland", "Japan", "Varies by year", "Canada"), "Sports", "The Winter Olympic Games change host country each edition, as chosen by the International Olympic Committee. No country is fixed, unlike the ancient Games."),
            zh = LocalizedContent("哪个国家传统上举办冬季奥运会？", listOf("瑞士", "日本", "每年不同", "加拿大"), "体育", "冬季奥运会每届更换主办国，由国际奥委会选定。没有固定的国家，与古代奥运会不同。"),
            es = LocalizedContent("¿Qué país acoge tradicionalmente los Juegos Olímpicos de Invierno?", listOf("Suiza", "Japón", "Variable según el año", "Canadá"), "Deportes", "Los Juegos Olímpicos de Invierno cambian de país anfitrión en cada edición, según la elección del Comité Olímpico Internacional. Ningún país es fijo, a diferencia de los Juegos antiguos.")
        ),
        BilingualQuestion(
            id = 13101, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En water-polo, combien de joueurs sont présents par équipe dans l'eau?", listOf("5", "6", "7", "8"), "Sport", "Au water-polo, chaque équipe aligne 7 joueurs dans l'eau : 6 joueurs de champ et 1 gardien de but."),
            en = LocalizedContent("In water polo, how many players are in the water per team?", listOf("5", "6", "7", "8"), "Sports", "In water polo, each team has 7 players in the water: 6 field players and 1 goalkeeper."),
            zh = LocalizedContent("在水球比赛中，每队有多少名球员在水中？", listOf("5", "6", "7", "8"), "体育", "水球比赛中，每队有7名球员在水中：6名场上球员和1名守门员。"),
            es = LocalizedContent("En waterpolo, ¿cuántos jugadores hay por equipo en el agua?", listOf("5", "6", "7", "8"), "Deportes", "En waterpolo, cada equipo alinea 7 jugadores en el agua: 6 jugadores de campo y 1 portero.")
        ),
        BilingualQuestion(
            id = 13102, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Le ski de fond est une discipline olympique d'hiver. Quel est le pays dominant historiquement?", listOf("Suède", "Norvège", "Finlande", "Russie"), "Sport", "La Norvège domine historiquement le ski de fond aux Jeux olympiques d'hiver, avec le plus grand nombre de médailles dans cette discipline, grâce à une forte culture du ski et des conditions naturelles favorables."),
            en = LocalizedContent("Cross-country skiing is a Winter Olympic discipline. Which country historically dominates?", listOf("Sweden", "Norway", "Finland", "Russia"), "Sports", "Norway historically dominates cross-country skiing at the Winter Olympics, with the highest number of medals in this discipline, thanks to a strong skiing culture and favorable natural conditions."),
            zh = LocalizedContent("越野滑雪是冬季奥运会项目。哪个国家历史上占主导地位？", listOf("瑞典", "挪威", "芬兰", "俄罗斯"), "体育", "挪威在冬季奥运会越野滑雪项目中历史上占主导地位，获得该项目的奖牌数最多，这得益于深厚的滑雪文化和有利的自然条件。"),
            es = LocalizedContent("El esquí de fondo es una disciplina olímpica de invierno. ¿Qué país domina históricamente?", listOf("Suecia", "Noruega", "Finlandia", "Rusia"), "Deportes", "Noruega domina históricamente el esquí de fondo en los Juegos Olímpicos de Invierno, con el mayor número de medallas en esta disciplina, gracias a una fuerte cultura del esquí y condiciones naturales favorables.")
        ),
        BilingualQuestion(
            id = 13103, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En aviron, comment appelle-t-on l'athlète qui donne le rythme?", listOf("Le barreur", "Le meneur", "Le chef", "Le capitaine"), "Sport", "Le barreur est l'athlète assis à l'arrière du bateau qui dirige l'équipage et donne le rythme des coups de rame."),
            en = LocalizedContent("In rowing, what is the athlete who sets the rhythm called?", listOf("Coxswain", "Leader", "Chief", "Captain"), "Sports", "The coxswain is the athlete seated at the stern of the boat who steers the crew and sets the rhythm of the strokes."),
            zh = LocalizedContent("在赛艇运动中，控制节奏的运动员叫什么？", listOf("舵手", "领桨手", "队长", "船长"), "体育", "舵手是坐在船尾的运动员，负责指挥船员并控制划桨的节奏。"),
            es = LocalizedContent("En remo, ¿cómo se llama el atleta que marca el ritmo?", listOf("Timonel", "Líder", "Jefe", "Capitán"), "Deportes", "El timonel es el atleta sentado en la popa del bote que dirige la tripulación y marca el ritmo de las remadas.")
        ),
        BilingualQuestion(
            id = 13104, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Le curling est un sport d'hiver. Quel équipement glissant est lancé sur la glace?", listOf("Une pierre", "Une boule", "Un palet", "Une rondelle"), "Sport", "Au curling, les joueurs lancent des pierres en granite, appelées \"pierres de curling\", qui glissent sur la glace vers une cible circulaire."),
            en = LocalizedContent("Curling is a winter sport. What sliding equipment is thrown on the ice?", listOf("Stone", "Ball", "Puck", "Disc"), "Sports", "In curling, players throw granite stones, called \"curling stones,\" which slide on the ice toward a circular target."),
            zh = LocalizedContent("冰壶是一项冬季运动。在冰面上投掷的滑行设备是什么？", listOf("冰壶石", "球", "冰球", "圆盘"), "体育", "冰壶运动中，运动员投掷花岗岩制成的冰壶石，它在冰面上滑向圆形目标区域。"),
            es = LocalizedContent("El curling es un deporte de invierno. ¿Qué equipo deslizante se lanza sobre el hielo?", listOf("Piedra", "Bola", "Disco", "Tejo"), "Deportes", "En curling, los jugadores lanzan piedras de granito, llamadas \"piedras de curling\", que se deslizan sobre el hielo hacia un blanco circular.")
        ),
        BilingualQuestion(
            id = 13105, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de cibles différentes sont utilisées au tir à l'arc olympique?", listOf("1", "2", "3", "4"), "Sport", "Au tir à l'arc olympique, tous les archers tirent sur le même type de cible, une cible circulaire de 122 cm de diamètre avec 10 zones concentriques."),
            en = LocalizedContent("How many different targets are used in Olympic archery?", listOf("1", "2", "3", "4"), "Sports", "In Olympic archery, all archers shoot at the same type of target, a circular target 122 cm in diameter with 10 concentric zones."),
            zh = LocalizedContent("奥运会射箭使用多少种不同的靶子？", listOf("1", "2", "3", "4"), "体育", "奥运会射箭中，所有射手都使用同一种靶子，直径122厘米的圆形靶，有10个同心环区。"),
            es = LocalizedContent("¿Cuántos blancos diferentes se utilizan en tiro con arco olímpico?", listOf("1", "2", "3", "4"), "Deportes", "En tiro con arco olímpico, todos los arqueros disparan al mismo tipo de blanco, un blanco circular de 122 cm de diámetro con 10 zonas concéntricas.")
        ),
        BilingualQuestion(
            id = 13106, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Le pentathlon moderne comprend 5 épreuves. Laquelle n'en fait pas partie?", listOf("Tir", "Escrime", "Natation", "Haltérophilie"), "Sport", "Le pentathlon moderne combine escrime, natation, équitation, tir et course à pied, sans inclure l'haltérophilie."),
            en = LocalizedContent("Modern pentathlon includes 5 events. Which one is not part of it?", listOf("Shooting", "Fencing", "Swimming", "Weightlifting"), "Sports", "Modern pentathlon combines fencing, swimming, equestrian, shooting, and running, without including weightlifting."),
            zh = LocalizedContent("现代五项包括5个项目。哪一项不属于其中？", listOf("射击", "击剑", "游泳", "举重"), "体育", "现代五项包括击剑、游泳、马术、射击和跑步，不包括举重。"),
            es = LocalizedContent("El pentatlón moderno incluye 5 pruebas. ¿Cuál no forma parte?", listOf("Tiro", "Esgrima", "Natación", "Halterofilia"), "Deportes", "El pentatlón moderno combina esgrima, natación, equitación, tiro y carrera a pie, sin incluir la halterofilia.")
        ),
        BilingualQuestion(
            id = 13107, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En Formule 1, combien de points rapporte une victoire depuis 2003?", listOf("10", "15", "20", "25"), "Sport", "Depuis 2003, le barème de points en Formule 1 attribue 25 points au vainqueur, mais le système actuel est entré en vigueur en 2010, avec 25 points pour une victoire. La réponse 20 correspond à l'ancien barème en vigueur de 2003 à 2009."),
            en = LocalizedContent("In Formula 1, how many points does a victory award since 2003?", listOf("10", "15", "20", "25"), "Sports", "Since 2003, the Formula 1 points system awards 25 points to the winner, but the current system came into effect in 2010, with 25 points for a win. The answer 20 corresponds to the old system in effect from 2003 to 2009."),
            zh = LocalizedContent("自2003年以来，一级方程式赛车中一场胜利获得多少分？", listOf("10", "15", "20", "25"), "体育", "自2003年以来，一级方程式赛车的积分系统给冠军25分，但现行系统于2010年生效，冠军得25分。答案20对应2003年至2009年的旧系统。"),
            es = LocalizedContent("En Fórmula 1, ¿cuántos puntos otorga una victoria desde 2003?", listOf("10", "15", "20", "25"), "Deportes", "Desde 2003, el sistema de puntos de Fórmula 1 otorga 25 puntos al ganador, pero el sistema actual entró en vigor en 2010, con 25 puntos por victoria. La respuesta 20 corresponde al sistema antiguo vigente de 2003 a 2009.")
        ),
        BilingualQuestion(
            id = 13108, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel sport mécaniste implique une moto et un Side-car?", listOf("Motocross", "Speedway", "Sidecar racing", "Trial"), "Sport", "Le sidecar racing est une discipline de course moto où une moto est équipée d'un side-car, un passager (le \"sidecariste\") aidant à la stabilité dans les virages."),
            en = LocalizedContent("Which motorsport involves a motorcycle and a sidecar?", listOf("Motocross", "Speedway", "Sidecar racing", "Trial"), "Sports", "Sidecar racing is a motorcycle racing discipline where a motorcycle is equipped with a sidecar, and a passenger (the \"sidecarist\") helps with stability in corners."),
            zh = LocalizedContent("哪项摩托车运动涉及摩托车和边车？", listOf("越野摩托车", "速度赛", "边车赛", "障碍赛"), "体育", "边车赛是一项摩托车比赛项目，摩托车配备边车，一名乘客（边车手）帮助在弯道中保持稳定。"),
            es = LocalizedContent("¿Qué deporte de motor implica una moto y un sidecar?", listOf("Motocross", "Speedway", "Sidecar racing", "Trial"), "Deportes", "El sidecar racing es una disciplina de carreras de motos donde una moto está equipada con un sidecar, y un pasajero (el \"sidecarista\") ayuda a la estabilidad en las curvas.")
        ),
    )

    private fun part6(): List<BilingualQuestion> = listOf(
        BilingualQuestion(
            id = 13109, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Le bobsleigh est une discipline d'hiver. Combien d'athlètes composent une équipe standard?", listOf("2", "3", "4", "5"), "Sport", "En compétition officielle, un équipage de bobsleigh est composé de quatre athlètes : un pilote, un freineur et deux pousseurs."),
            en = LocalizedContent("Bobsleigh is a winter sport. How many athletes make up a standard team?", listOf("2", "3", "4", "5"), "Sports", "In official competition, a bobsleigh crew consists of four athletes: a pilot, a brakeman, and two pushers."),
            zh = LocalizedContent("雪车是一项冬季运动。一个标准队伍由多少名运动员组成？", listOf("2", "3", "4", "5"), "体育", "在正式比赛中，雪车队伍由四名运动员组成：一名驾驶员、一名刹车员和两名推车手。"),
            es = LocalizedContent("El bobsleigh es un deporte de invierno. ¿Cuántos atletas componen un equipo estándar?", listOf("2", "3", "4", "5"), "Deportes", "En competición oficial, una tripulación de bobsleigh está compuesta por cuatro atletas: un piloto, un frenador y dos empujadores.")
        ),
        BilingualQuestion(
            id = 13110, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En patinage de vitesse, quel est le défi principal du patineur?", listOf("Garder l'équilibre", "Minimiser les frottements", "Maximiser la force", "Augmenter le poids"), "Sport", "En patinage de vitesse, la performance dépend de la capacité à réduire la résistance de l'air et la friction sur la glace, ce qui permet d'atteindre des vitesses plus élevées avec moins d'effort."),
            en = LocalizedContent("In speed skating, what is the skater's main challenge?", listOf("Maintaining balance", "Minimizing friction", "Maximizing force", "Increasing weight"), "Sports", "In speed skating, performance depends on the ability to reduce air resistance and friction on the ice, allowing higher speeds with less effort."),
            zh = LocalizedContent("在速度滑冰中，运动员的主要挑战是什么？", listOf("保持平衡", "最小化摩擦", "最大化力量", "增加重量"), "体育", "在速度滑冰中，成绩取决于减少空气阻力和冰面摩擦的能力，从而以更少的努力达到更高的速度。"),
            es = LocalizedContent("En patinaje de velocidad, ¿cuál es el principal desafío del patinador?", listOf("Mantener el equilibrio", "Minimizar la fricción", "Maximizar la fuerza", "Aumentar el peso"), "Deportes", "En patinaje de velocidad, el rendimiento depende de la capacidad para reducir la resistencia del aire y la fricción sobre el hielo, lo que permite alcanzar mayores velocidades con menos esfuerzo.")
        ),
        BilingualQuestion(
            id = 13111, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Le rallye automobile est une compétition sur routes. Qui guide le pilote?", listOf("Un co-pilote", "Une GPS", "Un radar", "Un observateur"), "Sport", "Le co-pilote lit le carnet de notes (road book) et annonce les virages et obstacles au pilote, permettant de négocier le parcours à haute vitesse sur routes fermées."),
            en = LocalizedContent("Rally racing is a competition on roads. Who guides the driver?", listOf("A co-driver", "A GPS", "A radar", "An observer"), "Sports", "The co-driver reads the pace notes (road book) and announces turns and obstacles to the driver, allowing negotiation of the course at high speed on closed roads."),
            zh = LocalizedContent("拉力赛是一项在道路上进行的比赛。谁引导车手？", listOf("领航员", "GPS", "雷达", "观察员"), "体育", "领航员阅读路书（道路笔记），并向车手宣布转弯和障碍物，从而在封闭道路上高速通过赛道。"),
            es = LocalizedContent("El rally es una competición en carreteras. ¿Quién guía al piloto?", listOf("Un copiloto", "Un GPS", "Un radar", "Un observador"), "Deportes", "El copiloto lee el libro de ruta (road book) y anuncia curvas y obstáculos al piloto, permitiendo negociar el recorrido a alta velocidad en carreteras cerradas.")
        ),
        BilingualQuestion(
            id = 13112, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("En hockey sur glace, combien de joueurs sont sur la glace par équipe simultanément?", listOf("4", "5", "6", "7"), "Sport", "Au hockey sur glace, chaque équipe aligne six joueurs sur la glace : trois attaquants, deux défenseurs et un gardien de but."),
            en = LocalizedContent("In ice hockey, how many players are on the ice per team simultaneously?", listOf("4", "5", "6", "7"), "Sports", "In ice hockey, each team fields six players on the ice: three forwards, two defensemen, and one goaltender."),
            zh = LocalizedContent("在冰球中，每队同时有多少名球员在冰上？", listOf("4", "5", "6", "7"), "体育", "在冰球中，每队有六名球员在冰上：三名前锋、两名后卫和一名守门员。"),
            es = LocalizedContent("En hockey sobre hielo, ¿cuántos jugadores están sobre el hielo por equipo simultáneamente?", listOf("4", "5", "6", "7"), "Deportes", "En hockey sobre hielo, cada equipo alinea seis jugadores sobre el hielo: tres delanteros, dos defensores y un portero.")
        ),
        BilingualQuestion(
            id = 13113, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Le biathlon combine le ski de fond et quel autre sport?", listOf("Le tir au fusil", "Le tir au pistolet", "Le tir à l'arc", "Le saut à ski"), "Sport", "Le biathlon est une discipline olympique qui alterne des tours de ski de fond et des séances de tir sur cibles avec un fusil à air comprimé ou à petit calibre."),
            en = LocalizedContent("Biathlon combines cross-country skiing and which other sport?", listOf("Rifle shooting", "Pistol shooting", "Archery", "Ski jumping"), "Sports", "Biathlon is an Olympic discipline that alternates cross-country skiing laps with shooting sessions at targets using a compressed air or small-caliber rifle."),
            zh = LocalizedContent("冬季两项结合了越野滑雪和哪项运动？", listOf("步枪射击", "手枪射击", "射箭", "跳台滑雪"), "体育", "冬季两项是一项奥运项目，交替进行越野滑雪圈和使用压缩空气或小口径步枪射击靶标的环节。"),
            es = LocalizedContent("El biatlón combina esquí de fondo y ¿qué otro deporte?", listOf("Tiro con rifle", "Tiro con pistola", "Tiro con arco", "Salto de esquí"), "Deportes", "El biatlón es una disciplina olímpica que alterna vueltas de esquí de fondo con sesiones de tiro a blancos con un rifle de aire comprimido o de pequeño calibre.")
        ),
        BilingualQuestion(
            id = 13114, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En aviron, quel type de bateau utilise 8 rameurs?", listOf("Le single", "Le double", "Le quatre", "L'eight"), "Sport", "En aviron, un bateau avec huit rameurs est appelé un \"eight\" ou \"huit de pointe\", car chaque rameur manie une seule rame."),
            en = LocalizedContent("In rowing, what type of boat uses 8 rowers?", listOf("Single", "Double", "Four", "Eight"), "Sports", "In rowing, a boat with eight rowers is called an 'eight' or 'eight-oared shell', where each rower handles a single oar."),
            zh = LocalizedContent("在赛艇中，哪种船使用8名桨手？", listOf("单人艇", "双人艇", "四人艇", "八人艇"), "体育", "在赛艇中，有八名桨手的船被称为“八人艇”或“八桨赛艇”，每名桨手操纵一支桨。"),
            es = LocalizedContent("En remo, ¿qué tipo de bote utiliza 8 remeros?", listOf("Single", "Doble", "Cuatro", "Ocho"), "Deportes", "En remo, un bote con ocho remeros se llama 'ocho' o 'ocho con timonel', donde cada remero maneja un solo remo.")
        ),
        BilingualQuestion(
            id = 13115, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Le skeleton est une discipline d'hiver où l'athlète se couche. Sur quel équipement?", listOf("Une luge", "Un traineau", "Une planche", "Un siège"), "Sport", "Le skeleton se pratique sur un traîneau spécifique, sans freins ni direction, où l'athlète descend la tête la première sur une piste de glace."),
            en = LocalizedContent("Skeleton is a winter sport where the athlete lies down. On what equipment?", listOf("A sled", "A toboggan", "A board", "A seat"), "Sports", "Skeleton is practiced on a specific sled, without brakes or steering, where the athlete descends head-first on an ice track."),
            zh = LocalizedContent("钢架雪车是一项冬季运动，运动员俯卧。使用什么装备？", listOf("雪橇", "平底雪橇", "板子", "座椅"), "体育", "钢架雪车使用一种特定的雪橇，没有刹车或转向装置，运动员头朝下在冰道上滑行。"),
            es = LocalizedContent("El skeleton es un deporte de invierno donde el atleta se acuesta. ¿Sobre qué equipo?", listOf("Un trineo", "Un tobogán", "Una tabla", "Un asiento"), "Deportes", "El skeleton se practica sobre un trineo específico, sin frenos ni dirección, donde el atleta desciende cabeza abajo por una pista de hielo.")
        ),
        BilingualQuestion(
            id = 13116, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel sport combine la danse et le patinage sur glace?", listOf("Patinage artistique", "Patinage synchronisé", "Patinage de couple", "Patinage libre"), "Sport", "Le patinage artistique est un sport où les patineurs exécutent des sauts, des pirouettes et des pas de danse sur la glace, notés sur des critères techniques et artistiques."),
            en = LocalizedContent("Which sport combines dance and ice skating?", listOf("Figure skating", "Synchronized skating", "Pair skating", "Free skating"), "Sports", "Figure skating is a sport where skaters perform jumps, spins, and dance steps on ice, judged on technical and artistic criteria."),
            zh = LocalizedContent("哪项运动结合了舞蹈和滑冰？", listOf("花样滑冰", "同步滑冰", "双人滑冰", "自由滑冰"), "体育", "花样滑冰是一项运动员在冰上表演跳跃、旋转和舞步的运动，根据技术和艺术标准进行评分。"),
            es = LocalizedContent("¿Qué deporte combina danza y patinaje sobre hielo?", listOf("Patinaje artístico", "Patinaje sincronizado", "Patinaje en parejas", "Patinaje libre"), "Deportes", "El patinaje artístico es un deporte donde los patinadores ejecutan saltos, giros y pasos de baile sobre el hielo, evaluados según criterios técnicos y artísticos.")
        ),
        BilingualQuestion(
            id = 13117, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En tir à l'arc, quelle distance est la plus longue aux Jeux Olympiques?", listOf("30 mètres", "50 mètres", "70 mètres", "100 mètres"), "Sport", "Aux Jeux Olympiques, les épreuves de tir à l'arc se déroulent sur une distance réglementaire de 70 mètres, que ce soit pour les qualifications ou les phases finales."),
            en = LocalizedContent("In archery, what is the longest distance at the Olympic Games?", listOf("30 meters", "50 meters", "70 meters", "100 meters"), "Sports", "At the Olympic Games, archery events are held at a regulation distance of 70 meters, both for qualifications and final rounds."),
            zh = LocalizedContent("在射箭中，奥运会最长的距离是多少？", listOf("30米", "50米", "70米", "100米"), "体育", "在奥运会上，射箭比赛的标准距离为70米，无论是资格赛还是决赛阶段。"),
            es = LocalizedContent("En tiro con arco, ¿cuál es la distancia más larga en los Juegos Olímpicos?", listOf("30 metros", "50 metros", "70 metros", "100 metros"), "Deportes", "En los Juegos Olímpicos, las pruebas de tiro con arco se realizan a una distancia reglamentaria de 70 metros, tanto para las clasificaciones como para las fases finales.")
        ),
        BilingualQuestion(
            id = 13118, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Le water-polo se joue dans une piscine. Quelle est la profondeur minimale?", listOf("1,5 m", "1,8 m", "2 m", "2,5 m"), "Sport", "La profondeur minimale de 2 mètres empêche les joueurs de toucher le fond, ce qui garantit une nage continue et évite les avantages déloyaux."),
            en = LocalizedContent("Water polo is played in a pool. What is the minimum depth?", listOf("1.5 m", "1.8 m", "2 m", "2.5 m"), "Sports", "The minimum depth of 2 meters prevents players from touching the bottom, ensuring continuous swimming and avoiding unfair advantages."),
            zh = LocalizedContent("水球在游泳池中进行。最小深度是多少？", listOf("1.5米", "1.8米", "2米", "2.5米"), "体育", "最小深度为2米，防止运动员触底，确保持续游泳并避免不公平优势。"),
            es = LocalizedContent("El waterpolo se juega en una piscina. ¿Cuál es la profundidad mínima?", listOf("1,5 m", "1,8 m", "2 m", "2,5 m"), "Deportes", "La profundidad mínima de 2 metros impide que los jugadores toquen el fondo, lo que garantiza una natación continua y evita ventajas injustas.")
        ),
        BilingualQuestion(
            id = 13119, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En sports mécaniques, le MotoGP est la catégorie reine. Quel est le cylindrage maximal?", listOf("500 cc", "750 cc", "1000 cc", "1250 cc"), "Sport", "Depuis 2012, le règlement du MotoGP impose un moteur quatre temps d'une cylindrée maximale de 1000 cm³ pour la catégorie reine."),
            en = LocalizedContent("In motorsports, MotoGP is the premier class. What is the maximum engine displacement?", listOf("500 cc", "750 cc", "1000 cc", "1250 cc"), "Sports", "Since 2012, MotoGP regulations mandate a four-stroke engine with a maximum displacement of 1000 cc for the premier class."),
            zh = LocalizedContent("在赛车运动中，MotoGP 是顶级赛事。最大发动机排量是多少？", listOf("500 cc", "750 cc", "1000 cc", "1250 cc"), "体育", "自2012年起，MotoGP 规定顶级组别使用最大排量为1000 cc的四冲程发动机。"),
            es = LocalizedContent("En deportes de motor, MotoGP es la categoría reina. ¿Cuál es la cilindrada máxima?", listOf("500 cc", "750 cc", "1000 cc", "1250 cc"), "Deportes", "Desde 2012, el reglamento de MotoGP impone un motor de cuatro tiempos con una cilindrada máxima de 1000 cm³ para la categoría reina.")
        ),
        BilingualQuestion(
            id = 13120, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Le saut à ski est une discipline d'hiver. Sur quel type de pente?", listOf("Une montagne", "Un tremplin", "Une colline", "Une vallée"), "Sport", "Le saut à ski s'effectue depuis un tremplin, une structure inclinée conçue pour propulser le skieur dans les airs."),
            en = LocalizedContent("Ski jumping is a winter sport. On what type of slope?", listOf("A mountain", "A jump", "A hill", "A valley"), "Sports", "Ski jumping is performed from a jump, an inclined structure designed to propel the skier into the air."),
            zh = LocalizedContent("跳台滑雪是一项冬季运动。在什么类型的斜坡上进行？", listOf("一座山", "一个跳台", "一座小山", "一个山谷"), "体育", "跳台滑雪是从跳台上进行的，跳台是一个倾斜的结构，旨在将滑雪者推向空中。"),
            es = LocalizedContent("El salto de esquí es un deporte de invierno. ¿Sobre qué tipo de pendiente?", listOf("Una montaña", "Un trampolín", "Una colina", "Un valle"), "Deportes", "El salto de esquí se realiza desde un trampolín, una estructura inclinada diseñada para impulsar al esquiador en el aire.")
        ),
        BilingualQuestion(
            id = 13121, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En curling, comment appelle-t-on le joueur qui pousse la pierre?", listOf("Le lançeur", "Le pousseur", "Le glisseur", "Le conducteur"), "Sport", "Au curling, le lançeur est le joueur qui pousse la pierre sur la glace pour la faire glisser vers la cible, tandis que les coéquipiers balayent pour influencer sa trajectoire."),
            en = LocalizedContent("In curling, what is the player who pushes the stone called?", listOf("The thrower", "The pusher", "The slider", "The driver"), "Sports", "In curling, the thrower is the player who pushes the stone on the ice to slide it toward the target, while teammates sweep to influence its trajectory."),
            zh = LocalizedContent("在冰壶运动中，推石头的运动员叫什么？", listOf("投壶手", "推手", "滑行者", "驾驶员"), "体育", "在冰壶运动中，投壶手是将冰壶推上冰面使其滑向目标的运动员，而队友则通过扫冰来影响其轨迹。"),
            es = LocalizedContent("En curling, ¿cómo se llama el jugador que empuja la piedra?", listOf("El lanzador", "El empujador", "El deslizador", "El conductor"), "Deportes", "En curling, el lanzador es el jugador que empuja la piedra sobre el hielo para hacerla deslizar hacia el blanco, mientras que los compañeros barren para influir en su trayectoria.")
        ),
        BilingualQuestion(
            id = 13122, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Le luge est une discipline d'hiver. L'athlète se couche-t-il sur le dos ou le ventre?", listOf("Sur le dos", "Sur le ventre", "Sur le côté", "Assis"), "Sport", "En luge, l'athlète se couche sur le dos, les pieds en avant, pour optimiser l'aérodynamisme et le contrôle de la trajectoire."),
            en = LocalizedContent("Luge is a winter sport. Does the athlete lie on their back or stomach?", listOf("On the back", "On the stomach", "On the side", "Sitting"), "Sports", "In luge, the athlete lies on their back, feet first, to optimize aerodynamics and control of the trajectory."),
            zh = LocalizedContent("雪橇是一项冬季运动。运动员是仰卧还是俯卧？", listOf("仰卧", "俯卧", "侧卧", "坐着"), "体育", "在雪橇运动中，运动员仰卧，脚朝前，以优化空气动力学和轨迹控制。"),
            es = LocalizedContent("El luge es un deporte de invierno. ¿El atleta se acuesta boca arriba o boca abajo?", listOf("Boca arriba", "Boca abajo", "De lado", "Sentado"), "Deportes", "En luge, el atleta se acuesta boca arriba, con los pies hacia adelante, para optimizar la aerodinámica y el control de la trayectoria.")
        ),
        BilingualQuestion(
            id = 13123, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En pentathlon moderne, l'escrime se pratique avec quelle arme?", listOf("L'épée", "Le fleuret", "Le sabre", "La dague"), "Sport", "Au pentathlon moderne, l'escrime se pratique exclusivement à l'épée, car cette arme permet des touches sur tout le corps et simplifie l'arbitrage."),
            en = LocalizedContent("In modern pentathlon, fencing is practiced with which weapon?", listOf("Épée", "Foil", "Sabre", "Dagger"), "Sports", "In modern pentathlon, fencing is practiced exclusively with the épée, as this weapon allows touches on the entire body and simplifies refereeing."),
            zh = LocalizedContent("在现代五项中，击剑使用哪种武器？", listOf("重剑", "花剑", "佩剑", "匕首"), "体育", "在现代五项中，击剑只使用重剑，因为这种武器允许刺中全身任何部位，并且简化了裁判工作。"),
            es = LocalizedContent("En pentatlón moderno, la esgrima se practica con qué arma?", listOf("Espada", "Florete", "Sable", "Daga"), "Deportes", "En pentatlón moderno, la esgrima se practica exclusivamente con espada, ya que esta arma permite toques en todo el cuerpo y simplifica el arbitraje.")
        ),
        BilingualQuestion(
            id = 13124, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Le beach-volley se joue sur le sable. Combien de joueurs par équipe?", listOf("2", "3", "4", "6"), "Sport", "Le beach-volley oppose deux équipes de deux joueurs chacune, contrairement au volley-ball en salle qui en compte six."),
            en = LocalizedContent("Beach volleyball is played on sand. How many players per team?", listOf("2", "3", "4", "6"), "Sports", "Beach volleyball pits two teams of two players each, unlike indoor volleyball which has six."),
            zh = LocalizedContent("沙滩排球在沙地上进行。每队有多少名球员？", listOf("2", "3", "4", "6"), "体育", "沙滩排球是每队两名球员对抗，而室内排球每队有六名球员。"),
            es = LocalizedContent("El voleibol de playa se juega en arena. ¿Cuántos jugadores por equipo?", listOf("2", "3", "4", "6"), "Deportes", "El voleibol de playa enfrenta a dos equipos de dos jugadores cada uno, a diferencia del voleibol indoor que tiene seis.")
        ),
        BilingualQuestion(
            id = 13125, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En aviron de compétition, quel terme désigne l'ensemble des rameurs?", listOf("L'équipe", "L'équipage", "La formation", "Le groupe"), "Sport", "En aviron, l'équipage désigne le groupe de rameurs qui composent un bateau, chaque membre ayant un rôle spécifique (comme le barreur ou les rameurs)."),
            en = LocalizedContent("In competitive rowing, what term refers to the group of rowers?", listOf("Team", "Crew", "Formation", "Group"), "Sports", "In rowing, the crew refers to the group of rowers that make up a boat, each member having a specific role (such as coxswain or rowers)."),
            zh = LocalizedContent("在竞技赛艇中，哪个术语指代全体划手？", listOf("队伍", "艇员组", "编队", "小组"), "体育", "在赛艇运动中，艇员组指组成一艘船的全体划手，每个成员都有特定角色（如舵手或划手）。"),
            es = LocalizedContent("En remo de competición, ¿qué término designa al conjunto de remeros?", listOf("Equipo", "Tripulación", "Formación", "Grupo"), "Deportes", "En remo, la tripulación designa al grupo de remeros que componen un bote, cada miembro con un rol específico (como el timonel o los remeros).")
        ),
        BilingualQuestion(
            id = 13126, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Le bobsleigh emprunte des éléments à quel autre sport hivernal?", listOf("Luge", "Skeleton", "Skeleton et Luge", "Ski alpin"), "Sport", "Le bobsleigh, le skeleton et la luge partagent la même piste de glace et utilisent des luges, mais le bobsleigh se distingue par son équipage et sa coque fermée."),
            en = LocalizedContent("Bobsleigh borrows elements from which other winter sport?", listOf("Luge", "Skeleton", "Skeleton and Luge", "Alpine skiing"), "Sports", "Bobsleigh, skeleton, and luge share the same ice track and use sleds, but bobsleigh is distinguished by its crew and enclosed shell."),
            zh = LocalizedContent("雪车借鉴了哪项其他冬季运动的元素？", listOf("雪橇", "钢架雪车", "钢架雪车和雪橇", "高山滑雪"), "体育", "雪车、钢架雪车和雪橇共用同一条冰道并使用雪橇，但雪车以其团队和封闭式外壳为特点。"),
            es = LocalizedContent("El bobsleigh toma elementos de ¿qué otro deporte de invierno?", listOf("Luge", "Skeleton", "Skeleton y Luge", "Esquí alpino"), "Deportes", "El bobsleigh, el skeleton y el luge comparten la misma pista de hielo y usan trineos, pero el bobsleigh se distingue por su tripulación y su casco cerrado.")
        ),
        BilingualQuestion(
            id = 13127, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En tir à l'arc, quel type de viseur n'est PAS autorisé?", listOf("Viseur optique", "Viseur instinctif", "Pointeur laser", "Viseur mécanique"), "Sport", "Les pointes laser sont interdites en compétition car elles offrent un avantage déloyal en projetant un point lumineux sur la cible, contrairement aux viseurs mécaniques ou optiques standards."),
            en = LocalizedContent("In archery, which type of sight is NOT allowed?", listOf("Optical sight", "Instinctive sight", "Laser pointer", "Mechanical sight"), "Sports", "Laser pointers are prohibited in competition because they provide an unfair advantage by projecting a light spot on the target, unlike standard mechanical or optical sights."),
            zh = LocalizedContent("在射箭中，哪种瞄准器是不允许的？", listOf("光学瞄准器", "直觉瞄准", "激光指示器", "机械瞄准器"), "体育", "激光指示器在比赛中被禁止，因为它们通过向目标投射光点提供不公平的优势，而标准的机械或光学瞄准器则没有。"),
            es = LocalizedContent("En tiro con arco, ¿qué tipo de visor NO está permitido?", listOf("Visor óptico", "Visor instintivo", "Puntero láser", "Visor mecánico"), "Deportes", "Los punteros láser están prohibidos en competición porque ofrecen una ventaja desleal al proyectar un punto de luz en el blanco, a diferencia de los visores mecánicos u ópticos estándar.")
        ),
        BilingualQuestion(
            id = 13128, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Le snowboard cross oppose combien de concurrents par manche?", listOf("2", "4", "6", "8"), "Sport", "Le snowboard cross se déroule en séries éliminatoires de quatre concurrents qui s'affrontent simultanément sur un parcours de bosses, virages et sauts."),
            en = LocalizedContent("Snowboard cross pits how many competitors per heat?", listOf("2", "4", "6", "8"), "Sports", "Snowboard cross takes place in elimination heats of four competitors who race simultaneously on a course of bumps, turns, and jumps."),
            zh = LocalizedContent("单板滑雪障碍追逐每轮有多少名选手参赛？", listOf("2", "4", "6", "8"), "体育", "单板滑雪障碍追逐采用四人一组淘汰赛，选手们在包含雪包、弯道和跳台的赛道上同时竞速。"),
            es = LocalizedContent("El snowboard cross enfrenta a ¿cuántos competidores por manga?", listOf("2", "4", "6", "8"), "Deportes", "El snowboard cross se desarrolla en series eliminatorias de cuatro competidores que compiten simultáneamente en un recorrido de baches, curvas y saltos.")
        ),
        BilingualQuestion(
            id = 13129, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En cyclisme, quel terrain accueille les plus grands championnats de VTT?", listOf("Montagne", "Forêt", "Prairie", "Sable"), "Sport", "Les championnats de VTT se déroulent en montagne car ce terrain accidenté et pentu est idéal pour tester les compétences techniques et l'endurance des cyclistes."),
            en = LocalizedContent("In cycling, what terrain hosts the biggest mountain bike championships?", listOf("Mountain", "Forest", "Prairie", "Sand"), "Sports", "Mountain bike championships take place in mountainous terrain because the rugged and steep landscape is ideal for testing cyclists' technical skills and endurance."),
            zh = LocalizedContent("在自行车运动中，哪种地形举办最大的山地自行车锦标赛？", listOf("山地", "森林", "草原", "沙地"), "体育", "山地自行车锦标赛在山地举行，因为崎岖陡峭的地形非常适合测试自行车手的技术和耐力。"),
            es = LocalizedContent("En ciclismo, ¿qué terreno acoge los campeonatos más importantes de MTB?", listOf("Montaña", "Bosque", "Pradera", "Arena"), "Deportes", "Los campeonatos de MTB se celebran en montaña porque este terreno accidentado y empinado es ideal para poner a prueba las habilidades técnicas y la resistencia de los ciclistas.")
        ),
        BilingualQuestion(
            id = 13130, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Le rallye automobile se déroule sur routes ouvertes. Vrai ou Faux?", listOf("Vrai", "Faux", "Cela dépend", "Rarement vrai"), "Sport", "Le rallye se dispute sur des routes normalement ouvertes à la circulation, mais fermées temporairement pour la course. Les concurrents roulent sur des parcours routiers publics."),
            en = LocalizedContent("Rally racing takes place on open roads. True or False?", listOf("True", "False", "It depends", "Rarely true"), "Sports", "Rally racing is held on roads normally open to traffic, but temporarily closed for the race. Competitors drive on public road courses."),
            zh = LocalizedContent("拉力赛在开放道路上进行。对还是错？", listOf("对", "错", "视情况而定", "很少对"), "体育", "拉力赛在通常对交通开放的道路上进行，但比赛期间会临时封闭。参赛者在公共道路赛道上行驶。"),
            es = LocalizedContent("El rally se disputa en carreteras abiertas. ¿Verdadero o Falso?", listOf("Verdadero", "Falso", "Depende", "Raramente verdadero"), "Deportes", "El rally se corre en carreteras normalmente abiertas al tráfico, pero cerradas temporalmente para la carrera. Los competidores circulan por recorridos públicos.")
        ),
        BilingualQuestion(
            id = 13131, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En water-polo, est-il autorisé de marcher sur le fond de la piscine?", listOf("Oui", "Non", "Seulement les gardiens", "En première mi-temps seulement"), "Sport", "En water-polo, les joueurs ne doivent pas toucher le fond de la piscine, sauf les gardiens dans leur zone. Marcher sur le fond est interdit car le jeu se pratique exclusivement en nageant."),
            en = LocalizedContent("In water polo, is it allowed to walk on the bottom of the pool?", listOf("Yes", "No", "Only goalkeepers", "Only in the first half"), "Sports", "In water polo, players must not touch the bottom of the pool, except goalkeepers in their area. Walking on the bottom is prohibited because the game is played exclusively by swimming."),
            zh = LocalizedContent("在水球运动中，允许在池底行走吗？", listOf("是", "否", "只有守门员可以", "只有上半场可以"), "体育", "在水球运动中，球员不得触碰池底，守门员在其区域内除外。在池底行走是被禁止的，因为比赛完全通过游泳进行。"),
            es = LocalizedContent("En waterpolo, ¿está permitido caminar por el fondo de la piscina?", listOf("Sí", "No", "Solo los porteros", "Solo en la primera mitad"), "Deportes", "En waterpolo, los jugadores no deben tocar el fondo de la piscina, excepto los porteros en su zona. Caminar por el fondo está prohibido porque el juego se practica exclusivamente nadando.")
        ),
        BilingualQuestion(
            id = 13132, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Le biathlon comprend combien de séances de tir par épreuve classique?", listOf("1", "2", "3", "4"), "Sport", "Le biathlon classique alterne ski de fond et tir, avec deux séances de tir : une couché et une debout, pour un total de 10 cibles."),
            en = LocalizedContent("How many shooting sessions does biathlon include in a classic event?", listOf("1", "2", "3", "4"), "Sports", "Classic biathlon alternates cross-country skiing and shooting, with two shooting sessions: one prone and one standing, for a total of 10 targets."),
            zh = LocalizedContent("冬季两项经典赛事包括多少次射击？", listOf("1", "2", "3", "4"), "体育", "冬季两项经典赛事交替进行越野滑雪和射击，包括两次射击：一次卧射和一次立射，共10个靶子。"),
            es = LocalizedContent("¿Cuántas sesiones de tiro incluye el biatlón en una prueba clásica?", listOf("1", "2", "3", "4"), "Deportes", "El biatlón clásico alterna esquí de fondo y tiro, con dos sesiones de tiro: una tendido y una de pie, para un total de 10 blancos.")
        ),
        BilingualQuestion(
            id = 13133, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En saut à ski, comment appelle-t-on la distance de saut officielle?", listOf("Distance K", "Distance P", "Distance L", "Distance Z"), "Sport", "La distance K, ou point K, est le repère sur la piste de réception qui indique la distance de conception du tremplin, servant de référence pour le jugement et le calcul des points."),
            en = LocalizedContent("In ski jumping, what is the official jump distance called?", listOf("K distance", "P distance", "L distance", "Z distance"), "Sports", "The K distance, or K point, is the mark on the landing hill that indicates the design distance of the jump, serving as a reference for judging and point calculation."),
            zh = LocalizedContent("在跳台滑雪中，官方跳跃距离叫什么？", listOf("K点距离", "P点距离", "L点距离", "Z点距离"), "体育", "K点距离，即K点，是着陆坡上的标记，表示跳台的设计距离，作为评判和计分的参考。"),
            es = LocalizedContent("En salto de esquí, ¿cómo se llama la distancia oficial de salto?", listOf("Distancia K", "Distancia P", "Distancia L", "Distancia Z"), "Deportes", "La distancia K, o punto K, es la marca en la pista de aterrizaje que indica la distancia de diseño del trampolín, sirviendo como referencia para el juicio y el cálculo de puntos.")
        ),
        BilingualQuestion(
            id = 13134, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Le patinage de vitesse court (short-track) se pratique sur quelle longueur de piste?", listOf("300 m", "400 m", "500 m", "1000 m"), "Sport", "Le short-track se court sur une piste ovale de 111,12 mètres, et non 300 mètres. La distance de 300 mètres correspond à une épreuve spécifique, mais la piste standard mesure 111,12 m."),
            en = LocalizedContent("Short track speed skating is practiced on what track length?", listOf("300 m", "400 m", "500 m", "1000 m"), "Sports", "Short track is raced on an oval track of 111.12 meters, not 300 meters. The 300-meter distance corresponds to a specific event, but the standard track measures 111.12 m."),
            zh = LocalizedContent("短道速滑在什么长度的跑道上进行？", listOf("300米", "400米", "500米", "1000米"), "体育", "短道速滑在111.12米的椭圆形跑道上进行，而不是300米。300米距离对应特定项目，但标准跑道长度为111.12米。"),
            es = LocalizedContent("El patinaje de velocidad en pista corta (short-track) se practica sobre qué longitud de pista?", listOf("300 m", "400 m", "500 m", "1000 m"), "Deportes", "El short-track se corre en una pista ovalada de 111,12 metros, no 300 metros. La distancia de 300 metros corresponde a una prueba específica, pero la pista estándar mide 111,12 m.")
        ),
        BilingualQuestion(
            id = 13135, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En Formule 1, quel constructeur a remporté le plus de titres mondiaux?", listOf("Ferrari", "McLaren", "Mercedes", "Williams"), "Sport", "Mercedes détient le record du nombre de titres mondiaux de constructeurs en Formule 1, avec huit championnats remportés consécutivement de 2014 à 2021."),
            en = LocalizedContent("In Formula 1, which constructor has won the most world titles?", listOf("Ferrari", "McLaren", "Mercedes", "Williams"), "Sports", "Mercedes holds the record for the most constructors' world titles in Formula 1, with eight consecutive championships from 2014 to 2021."),
            zh = LocalizedContent("在一级方程式中，哪个制造商赢得了最多的世界冠军？", listOf("法拉利", "迈凯伦", "梅赛德斯", "威廉姆斯"), "体育", "梅赛德斯保持着一级方程式制造商世界冠军数量的纪录，从2014年到2021年连续八次夺冠。"),
            es = LocalizedContent("En Fórmula 1, ¿qué constructor ha ganado más títulos mundiales?", listOf("Ferrari", "McLaren", "Mercedes", "Williams"), "Deportes", "Mercedes tiene el récord de más títulos mundiales de constructores en Fórmula 1, con ocho campeonatos consecutivos de 2014 a 2021.")
        ),
        BilingualQuestion(
            id = 13136, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Le curling utilise des pierres de granit. De quel pays proviennent les meilleures?", listOf("Suède", "Écosse", "Canada", "Finlande"), "Sport", "Les meilleures pierres de curling proviennent d'Écosse, car le granit d'Ailsa Craig, une île écossaise, est réputé pour sa densité et sa résistance à l'usure."),
            en = LocalizedContent("Curling uses granite stones. Which country do the best ones come from?", listOf("Sweden", "Scotland", "Canada", "Finland"), "Sports", "The best curling stones come from Scotland, because the granite from Ailsa Craig, a Scottish island, is renowned for its density and resistance to wear."),
            zh = LocalizedContent("冰壶使用花岗岩石头。最好的石头来自哪个国家？", listOf("瑞典", "苏格兰", "加拿大", "芬兰"), "体育", "最好的冰壶石来自苏格兰，因为苏格兰艾尔萨克雷格岛的花岗岩以其密度和耐磨性而闻名。"),
            es = LocalizedContent("El curling utiliza piedras de granito. ¿De qué país provienen las mejores?", listOf("Suecia", "Escocia", "Canadá", "Finlandia"), "Deportes", "Las mejores piedras de curling provienen de Escocia, porque el granito de Ailsa Craig, una isla escocesa, es famoso por su densidad y resistencia al desgaste.")
        ),
        BilingualQuestion(
            id = 13137, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En motocross, quel obstacle naturel caractérise les circuits?", listOf("Sauts", "Virages", "Boues", "Cailloux"), "Sport", "Les circuits de motocross sont conçus sur des terrains accidentés avec des bosses et des dénivelés naturels, ce qui oblige les pilotes à effectuer des sauts pour franchir ces obstacles."),
            en = LocalizedContent("In motocross, what natural obstacle characterizes the circuits?", listOf("Jumps", "Turns", "Mud", "Rocks"), "Sports", "Motocross circuits are designed on rough terrain with natural bumps and elevation changes, forcing riders to perform jumps to clear these obstacles."),
            zh = LocalizedContent("在摩托车越野赛中，什么自然障碍是赛道的特征？", listOf("跳跃", "转弯", "泥浆", "石头"), "体育", "摩托车越野赛赛道设计在崎岖的地形上，有自然的起伏和落差，迫使车手进行跳跃以通过这些障碍。"),
            es = LocalizedContent("En motocross, ¿qué obstáculo natural caracteriza los circuitos?", listOf("Saltos", "Curvas", "Barro", "Piedras"), "Deportes", "Los circuitos de motocross están diseñados en terrenos accidentados con baches y desniveles naturales, lo que obliga a los pilotos a realizar saltos para superar estos obstáculos.")
        ),
        BilingualQuestion(
            id = 13138, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Le pentathlon moderne inclut une épreuve de natation. Quelle distance?", listOf("100 m", "200 m", "300 m", "400 m"), "Sport", "L'épreuve de natation du pentathlon moderne est un 200 mètres nage libre, et non 300 mètres. Cette distance a été standardisée pour tester l'endurance et la vitesse des athlètes."),
            en = LocalizedContent("Modern pentathlon includes a swimming event. What distance?", listOf("100 m", "200 m", "300 m", "400 m"), "Sports", "The swimming event in modern pentathlon is a 200-meter freestyle, not 300 meters. This distance has been standardized to test athletes' endurance and speed."),
            zh = LocalizedContent("现代五项包括一项游泳比赛。距离是多少？", listOf("100米", "200米", "300米", "400米"), "体育", "现代五项中的游泳比赛是200米自由泳，而不是300米。这个距离已被标准化，以测试运动员的耐力和速度。"),
            es = LocalizedContent("El pentatlón moderno incluye una prueba de natación. ¿Qué distancia?", listOf("100 m", "200 m", "300 m", "400 m"), "Deportes", "La prueba de natación del pentatlón moderno es un 200 metros estilo libre, no 300 metros. Esta distancia se ha estandarizado para poner a prueba la resistencia y velocidad de los atletas.")
        ),
        BilingualQuestion(
            id = 13139, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("En hockey sur glace, combien de périodes composent un match?", listOf("2", "3", "4", "5"), "Sport", "Un match de hockey sur glace se divise en trois périodes de 20 minutes chacune, avec deux pauses de 15 minutes entre elles."),
            en = LocalizedContent("In ice hockey, how many periods make up a match?", listOf("2", "3", "4", "5"), "Sports", "An ice hockey match is divided into three periods of 20 minutes each, with two 15-minute intermissions."),
            zh = LocalizedContent("在冰球比赛中，一场比赛由多少节组成？", listOf("2", "3", "4", "5"), "体育", "冰球比赛分为三节，每节20分钟，中间有两次15分钟的休息。"),
            es = LocalizedContent("En hockey sobre hielo, ¿cuántos períodos componen un partido?", listOf("2", "3", "4", "5"), "Deportes", "Un partido de hockey sobre hielo se divide en tres períodos de 20 minutos cada uno, con dos descansos de 15 minutos entre ellos.")
        ),
        BilingualQuestion(
            id = 13140, correctIndex = 3, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Le skeleton est un sport extrême. Quelle est la position du coureur?", listOf("Debout", "Assis", "À genoux", "Couché face en avant"), "Sport", "Le skeleton se pratique sur une piste de glace, allongé sur le ventre, tête en avant, pour optimiser l'aérodynamisme et la vitesse."),
            en = LocalizedContent("Skeleton is an extreme sport. What is the athlete's position?", listOf("Standing", "Sitting", "Kneeling", "Lying face forward"), "Sports", "Skeleton is practiced on an ice track, lying on the stomach, head first, to optimize aerodynamics and speed."),
            zh = LocalizedContent("钢架雪车是一项极限运动。运动员的姿势是什么？", listOf("站立", "坐姿", "跪姿", "俯卧向前"), "体育", "钢架雪车在冰道上进行，运动员俯卧在雪车上，头朝前，以优化空气动力学和速度。"),
            es = LocalizedContent("El skeleton es un deporte extremo. ¿Cuál es la posición del corredor?", listOf("De pie", "Sentado", "De rodillas", "Tumbado boca abajo"), "Deportes", "El skeleton se practica en una pista de hielo, tumbado boca abajo, cabeza adelante, para optimizar la aerodinámica y la velocidad.")
        ),
        BilingualQuestion(
            id = 13141, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En tir à l'arc olympique, quel type de cible est utilisé?", listOf("Cible mobile", "Cible fixe", "Cible électronique", "Cible dynamique"), "Sport", "Le tir à l'arc olympique se pratique sur des cibles fixes, avec des distances réglementaires de 70 mètres pour les épreuves de tir sur cible."),
            en = LocalizedContent("In Olympic archery, what type of target is used?", listOf("Moving target", "Fixed target", "Electronic target", "Dynamic target"), "Sports", "Olympic archery is practiced on fixed targets, with regulation distances of 70 meters for target shooting events."),
            zh = LocalizedContent("在奥运会射箭比赛中，使用什么类型的靶子？", listOf("移动靶", "固定靶", "电子靶", "动态靶"), "体育", "奥运会射箭比赛使用固定靶，射程为70米。"),
            es = LocalizedContent("En tiro con arco olímpico, ¿qué tipo de diana se utiliza?", listOf("Diana móvil", "Diana fija", "Diana electrónica", "Diana dinámica"), "Deportes", "El tiro con arco olímpico se practica sobre dianas fijas, con distancias reglamentarias de 70 metros para las pruebas de tiro sobre diana.")
        ),
        BilingualQuestion(
            id = 13142, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Le rallye automobile se différencie de la course par?", listOf("Les vitesses", "Les routes", "Les départs échelonnés", "Les spectateurs"), "Sport", "Contrairement aux courses sur circuit où tous les concurrents s'élancent ensemble, le rallye utilise des départs échelonnés pour que chaque équipage parcoure le même itinéraire routier à intervalles réguliers."),
            en = LocalizedContent("Rally racing differs from circuit racing by:", listOf("Speeds", "Roads", "Staggered starts", "Spectators"), "Sports", "Unlike circuit races where all competitors start together, rally uses staggered starts so that each crew covers the same road route at regular intervals."),
            zh = LocalizedContent("拉力赛与场地赛的区别在于：", listOf("速度", "道路", "间隔发车", "观众"), "体育", "与所有选手同时出发的场地赛不同，拉力赛采用间隔发车，使每辆车按固定间隔行驶相同的路线。"),
            es = LocalizedContent("El rally automovilístico se diferencia de la carrera por:", listOf("Las velocidades", "Las carreteras", "Las salidas escalonadas", "Los espectadores"), "Deportes", "A diferencia de las carreras en circuito donde todos los competidores salen juntos, el rally utiliza salidas escalonadas para que cada equipo recorra el mismo itinerario a intervalos regulares.")
        ),
        BilingualQuestion(
            id = 13143, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En aviron, le barreur utilise quel équipement pour diriger?", listOf("Un gouvernail", "Une rame", "Un cordon", "Une pagaie"), "Sport", "Le barreur oriente l'embarcation en actionnant un gouvernail fixé à l'arrière du bateau, via un système de câbles ou une barre."),
            en = LocalizedContent("In rowing, what equipment does the coxswain use to steer?", listOf("A rudder", "An oar", "A cord", "A paddle"), "Sports", "The coxswain steers the boat by operating a rudder attached to the stern, via a system of cables or a tiller."),
            zh = LocalizedContent("在赛艇运动中，舵手使用什么设备来操控方向？", listOf("舵", "桨", "绳索", "划桨"), "体育", "舵手通过操作固定在船尾的舵来引导船只，使用缆绳或舵柄系统。"),
            es = LocalizedContent("En remo, ¿qué equipo utiliza el timonel para dirigir?", listOf("Un timón", "Un remo", "Un cordón", "Una pala"), "Deportes", "El timonel orienta la embarcación accionando un timón fijado en la popa del barco, mediante un sistema de cables o una barra.")
        ),
        BilingualQuestion(
            id = 13144, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Le water-polo est un sport collectif aquatique. Depuis quel siècle?", listOf("17e", "18e", "19e", "20e"), "Sport", "Le water-polo moderne a été codifié en Grande-Bretagne dans la seconde moitié du XIXe siècle, avec les premières règles écrites en 1870."),
            en = LocalizedContent("Water polo is an aquatic team sport. Since which century?", listOf("17th", "18th", "19th", "20th"), "Sports", "Modern water polo was codified in Great Britain in the second half of the 19th century, with the first written rules in 1870."),
            zh = LocalizedContent("水球是一项水上团队运动。起源于哪个世纪？", listOf("17世纪", "18世纪", "19世纪", "20世纪"), "体育", "现代水球于19世纪下半叶在英国被规范化，最早的书面规则于1870年制定。"),
            es = LocalizedContent("El waterpolo es un deporte colectivo acuático. ¿Desde qué siglo?", listOf("XVII", "XVIII", "XIX", "XX"), "Deportes", "El waterpolo moderno fue codificado en Gran Bretaña en la segunda mitad del siglo XIX, con las primeras reglas escritas en 1870.")
        ),
        BilingualQuestion(
            id = 13145, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En ski de fond, quelle technique n'existe pas?", listOf("Classique", "Skating", "Télémesure", "Libre"), "Sport", "Le télémark est une technique de ski alpin, pas de fond. Les techniques de ski de fond sont le pas alternatif, le pas de patineur et le pas de deux temps."),
            en = LocalizedContent("In cross-country skiing, which technique does not exist?", listOf("Classic", "Skating", "Telemark", "Free"), "Sports", "Telemark is an alpine skiing technique, not cross-country. Cross-country skiing techniques are diagonal stride, skate skiing, and double poling."),
            zh = LocalizedContent("在越野滑雪中，哪种技术不存在？", listOf("传统式", " skating", "泰勒马克式", "自由式"), "体育", "泰勒马克式是一种高山滑雪技术，不是越野滑雪。越野滑雪技术包括交替滑行、蹬冰式滑行和双杖推进。"),
            es = LocalizedContent("En esquí de fondo, ¿qué técnica no existe?", listOf("Clásica", "Patinador", "Telemark", "Libre"), "Deportes", "El telemark es una técnica de esquí alpino, no de fondo. Las técnicas de esquí de fondo son el paso alternativo, el paso de patinador y el paso de dos tiempos.")
        ),
        BilingualQuestion(
            id = 13146, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Le biathlon d'hiver comprend quatre types d'épreuves. Laquelle en est une?", listOf("Sprint", "Relais", "Poursuite", "Toutes les réponses"), "Sport", "Le biathlon d'hiver comporte quatre épreuves : l'individuel, le sprint, la poursuite et le relais, donc toutes les réponses proposées sont valables."),
            en = LocalizedContent("Winter biathlon includes four types of events. Which one is one of them?", listOf("Sprint", "Relay", "Pursuit", "All answers"), "Sports", "Winter biathlon has four events: individual, sprint, pursuit, and relay, so all proposed answers are valid."),
            zh = LocalizedContent("冬季两项包括四种比赛项目。哪一种是其中之一？", listOf("短距离", "接力", "追逐", "所有答案"), "体育", "冬季两项有四种项目：个人赛、短距离、追逐和接力，因此所有给出的答案都是正确的。"),
            es = LocalizedContent("El biatlón de invierno comprende cuatro tipos de pruebas. ¿Cuál es una de ellas?", listOf("Sprint", "Relevos", "Persecución", "Todas las respuestas"), "Deportes", "El biatlón de invierno consta de cuatro pruebas: individual, sprint, persecución y relevos, por lo que todas las respuestas propuestas son válidas.")
        ),
        BilingualQuestion(
            id = 13147, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En luge, combien de courses composent généralement une compétition de Coupe du monde?", listOf("1", "2", "3", "4"), "Sport", "En Coupe du monde de luge, chaque épreuve se déroule généralement sur deux manches, dont les temps cumulés déterminent le classement final."),
            en = LocalizedContent("In luge, how many runs typically make up a World Cup competition?", listOf("1", "2", "3", "4"), "Sports", "In the Luge World Cup, each event usually consists of two runs, with cumulative times determining the final ranking."),
            zh = LocalizedContent("在雪橇运动中，世界杯比赛通常由多少轮组成？", listOf("1", "2", "3", "4"), "体育", "在雪橇世界杯中，每场比赛通常进行两轮，累计时间决定最终排名。"),
            es = LocalizedContent("En luge, ¿cuántas carreras componen generalmente una competición de Copa del Mundo?", listOf("1", "2", "3", "4"), "Deportes", "En la Copa del Mundo de luge, cada prueba se desarrolla generalmente en dos mangas, cuyos tiempos acumulados determinan la clasificación final.")
        ),
        BilingualQuestion(
            id = 13148, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Le saut à ski utilise un tremplin. Quel est son angle approximatif?", listOf("30°", "45°", "60°", "75°"), "Sport", "L'angle du tremplin de saut à ski est d'environ 45 degrés, car cet angle permet d'optimiser la portée et la sécurité du sauteur en combinant vitesse et hauteur."),
            en = LocalizedContent("Ski jumping uses a ramp. What is its approximate angle?", listOf("30°", "45°", "60°", "75°"), "Sports", "The angle of a ski jumping ramp is approximately 45 degrees, as this angle optimizes distance and safety by combining speed and height."),
            zh = LocalizedContent("跳台滑雪使用跳台。其近似角度是多少？", listOf("30°", "45°", "60°", "75°"), "体育", "跳台滑雪的跳台角度约为45度，因为这个角度能结合速度和高度，优化跳跃距离和安全性。"),
            es = LocalizedContent("El salto de esquí utiliza un trampolín. ¿Cuál es su ángulo aproximado?", listOf("30°", "45°", "60°", "75°"), "Deportes", "El ángulo del trampolín de salto de esquí es de aproximadamente 45 grados, ya que este ángulo permite optimizar el alcance y la seguridad del saltador combinando velocidad y altura.")
        ),
        BilingualQuestion(
            id = 13149, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En sports mécaniques, le Dakar est une course mythique. Sur quel continent se déroule-t-elle?", listOf("Afrique", "Asie", "Amérique du Sud", "Europe"), "Sport", "Depuis 2009, le Rallye Dakar se dispute en Amérique du Sud puis en Arabie saoudite, située en Asie, pour des raisons de sécurité."),
            en = LocalizedContent("In motorsports, the Dakar is a legendary race. On which continent does it take place?", listOf("Africa", "Asia", "South America", "Europe"), "Sports", "Since 2009, the Dakar Rally has been held in South America and then in Saudi Arabia, located in Asia, for security reasons."),
            zh = LocalizedContent("在赛车运动中，达喀尔拉力赛是一项传奇赛事。它在哪个大洲举行？", listOf("非洲", "亚洲", "南美洲", "欧洲"), "体育", "自2009年起，达喀尔拉力赛出于安全原因在南美洲和沙特阿拉伯（位于亚洲）举行。"),
            es = LocalizedContent("En los deportes de motor, el Dakar es una carrera mítica. ¿En qué continente se desarrolla?", listOf("África", "Asia", "América del Sur", "Europa"), "Deportes", "Desde 2009, el Rally Dakar se disputa en América del Sur y luego en Arabia Saudita, situada en Asia, por razones de seguridad.")
        ),
        BilingualQuestion(
            id = 13150, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En optique, qu'est-ce qu'un prisme?", listOf("Un miroir courbe", "Un élément qui réfracte la lumière", "Une lentille convexe", "Un filtre coloré"), "Science", "En optique, un prisme est un bloc de verre ou de matière transparente qui dévie la lumière en la réfractant, ce qui permet de séparer ses différentes couleurs."),
            en = LocalizedContent("In optics, what is a prism?", listOf("A curved mirror", "An element that refracts light", "A convex lens", "A colored filter"), "Science", "In optics, a prism is a block of glass or transparent material that deviates light by refracting it, allowing its different colors to be separated."),
            zh = LocalizedContent("在光学中，什么是棱镜？", listOf("曲面镜", "折射光线的元件", "凸透镜", "彩色滤光片"), "科学", "在光学中，棱镜是一块玻璃或透明材料，通过折射使光线偏转，从而分离出不同颜色。"),
            es = LocalizedContent("En óptica, ¿qué es un prisma?", listOf("Un espejo curvo", "Un elemento que refracta la luz", "Una lente convexa", "Un filtro de color"), "Ciencia", "En óptica, un prisma es un bloque de vidrio o material transparente que desvía la luz al refractarla, lo que permite separar sus diferentes colores.")
        ),
        BilingualQuestion(
            id = 13151, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("La réfraction de la lumière se produit en changeant de?", listOf("Température", "Milieu", "Couleur", "Intensité"), "Science", "La réfraction se produit lorsque la lumière passe d'un milieu à un autre (comme de l'air à l'eau), ce qui modifie sa vitesse et sa direction."),
            en = LocalizedContent("Refraction of light occurs when changing?", listOf("Temperature", "Medium", "Color", "Intensity"), "Science", "Refraction occurs when light passes from one medium to another (such as from air to water), which changes its speed and direction."),
            zh = LocalizedContent("光的折射发生在改变什么时？", listOf("温度", "介质", "颜色", "强度"), "科学", "当光从一种介质进入另一种介质（如从空气到水）时，会发生折射，从而改变速度和方向。"),
            es = LocalizedContent("La refracción de la luz ocurre al cambiar de?", listOf("Temperatura", "Medio", "Color", "Intensidad"), "Ciencia", "La refracción ocurre cuando la luz pasa de un medio a otro (como del aire al agua), lo que modifica su velocidad y dirección.")
        ),
        BilingualQuestion(
            id = 13152, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En acoustique, qu'est-ce que l'amplitude?", listOf("La fréquence", "L'intensité du son", "La longueur d'onde", "La vitesse"), "Science", "L'amplitude d'une onde sonore détermine sa puissance, ce qui est perçu par l'oreille comme l'intensité ou le volume du son."),
            en = LocalizedContent("In acoustics, what is amplitude?", listOf("Frequency", "Sound intensity", "Wavelength", "Speed"), "Science", "The amplitude of a sound wave determines its power, which is perceived by the ear as the intensity or volume of the sound."),
            zh = LocalizedContent("在声学中，什么是振幅？", listOf("频率", "声音强度", "波长", "速度"), "科学", "声波的振幅决定了其功率，人耳将其感知为声音的强度或音量。"),
            es = LocalizedContent("En acústica, ¿qué es la amplitud?", listOf("La frecuencia", "La intensidad del sonido", "La longitud de onda", "La velocidad"), "Ciencia", "La amplitud de una onda sonora determina su potencia, que el oído percibe como la intensidad o el volumen del sonido.")
        ),
        BilingualQuestion(
            id = 13153, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel phénomène acoustique provoque l'écho?", listOf("Diffraction", "Réflexion", "Réfraction", "Interférence"), "Science", "L'écho est produit par la réflexion des ondes sonores sur une surface dure et lisse, comme un mur ou une falaise, lorsque la distance est suffisante pour que l'oreille distingue le son réfléchi du son original."),
            en = LocalizedContent("Which acoustic phenomenon causes echo?", listOf("Diffraction", "Reflection", "Refraction", "Interference"), "Science", "Echo is produced by the reflection of sound waves off a hard, smooth surface, such as a wall or cliff, when the distance is sufficient for the ear to distinguish the reflected sound from the original."),
            zh = LocalizedContent("哪种声学现象引起回声？", listOf("衍射", "反射", "折射", "干涉"), "科学", "回声是由声波在坚硬光滑的表面（如墙壁或悬崖）上反射产生的，当距离足够远时，耳朵能区分反射声和原声。"),
            es = LocalizedContent("¿Qué fenómeno acústico provoca el eco?", listOf("Difracción", "Reflexión", "Refracción", "Interferencia"), "Ciencia", "El eco se produce por la reflexión de las ondas sonoras en una superficie dura y lisa, como una pared o un acantilado, cuando la distancia es suficiente para que el oído distinga el sonido reflejado del original.")
        ),
        BilingualQuestion(
            id = 13154, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("La thermodynamique étude l'énergie. Combien de lois principales?", listOf("2", "3", "4", "5"), "Science", "La thermodynamique repose sur quatre lois fondamentales : la loi zéro, la première (conservation de l'énergie), la deuxième (entropie) et la troisième (zéro absolu)."),
            en = LocalizedContent("Thermodynamics studies energy. How many main laws?", listOf("2", "3", "4", "5"), "Science", "Thermodynamics is based on four fundamental laws: the zeroth law, the first (conservation of energy), the second (entropy), and the third (absolute zero)."),
            zh = LocalizedContent("热力学研究能量。有多少条主要定律？", listOf("2", "3", "4", "5"), "科学", "热力学基于四条基本定律：第零定律、第一定律（能量守恒）、第二定律（熵）和第三定律（绝对零度）。"),
            es = LocalizedContent("La termodinámica estudia la energía. ¿Cuántas leyes principales?", listOf("2", "3", "4", "5"), "Ciencia", "La termodinámica se basa en cuatro leyes fundamentales: la ley cero, la primera (conservación de la energía), la segunda (entropía) y la tercera (cero absoluto).")
        ),
        BilingualQuestion(
            id = 13155, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("La première loi de la thermodynamique concerne?", listOf("L'entropie", "La conservation de l'énergie", "La température", "La pression"), "Science", "Cette loi énonce que l'énergie totale d'un système isolé reste constante, car elle ne peut être ni créée ni détruite, seulement transformée d'une forme à une autre."),
            en = LocalizedContent("The first law of thermodynamics concerns?", listOf("Entropy", "Conservation of energy", "Temperature", "Pressure"), "Science", "This law states that the total energy of an isolated system remains constant, as it can neither be created nor destroyed, only transformed from one form to another."),
            zh = LocalizedContent("热力学第一定律涉及什么？", listOf("熵", "能量守恒", "温度", "压力"), "科学", "该定律指出，孤立系统的总能量保持不变，因为它既不能被创造也不能被消灭，只能从一种形式转化为另一种形式。"),
            es = LocalizedContent("La primera ley de la termodinámica se refiere a?", listOf("La entropía", "La conservación de la energía", "La temperatura", "La presión"), "Ciencia", "Esta ley establece que la energía total de un sistema aislado permanece constante, ya que no puede ser creada ni destruida, solo transformada de una forma a otra.")
        ),
        BilingualQuestion(
            id = 13156, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En cristallographie, qu'est-ce qu'un cristal?", listOf("Une roche brillante", "Un solide avec structure géométrique ordonnée", "Une molécule", "Un minéral transparent"), "Science", "Un cristal se définit par l'arrangement périodique et régulier de ses atomes, ions ou molécules dans l'espace, formant un réseau tridimensionnel ordonné."),
            en = LocalizedContent("In crystallography, what is a crystal?", listOf("A shiny rock", "A solid with ordered geometric structure", "A molecule", "A transparent mineral"), "Science", "A crystal is defined by the periodic and regular arrangement of its atoms, ions, or molecules in space, forming an ordered three-dimensional network."),
            zh = LocalizedContent("在晶体学中，什么是晶体？", listOf("闪亮的岩石", "具有有序几何结构的固体", "分子", "透明矿物"), "科学", "晶体由其原子、离子或分子在空间中的周期性规则排列定义，形成有序的三维网络。"),
            es = LocalizedContent("En cristalografía, ¿qué es un cristal?", listOf("Una roca brillante", "Un sólido con estructura geométrica ordenada", "Una molécula", "Un mineral transparente"), "Ciencia", "Un cristal se define por la disposición periódica y regular de sus átomos, iones o moléculas en el espacio, formando una red tridimensional ordenada.")
        ),
        BilingualQuestion(
            id = 13157, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de systèmes cristallins existent en cristallographie?", listOf("5", "6", "7", "8"), "Science", "En cristallographie, les systèmes cristallins sont au nombre de sept, classés selon les paramètres de leur maille élémentaire (longueurs des axes et angles)."),
            en = LocalizedContent("How many crystal systems exist in crystallography?", listOf("5", "6", "7", "8"), "Science", "In crystallography, there are seven crystal systems, classified according to the parameters of their unit cell (axis lengths and angles)."),
            zh = LocalizedContent("晶体学中有多少种晶系？", listOf("5", "6", "7", "8"), "科学", "晶体学中有七种晶系，根据其晶胞参数（轴长和角度）进行分类。"),
            es = LocalizedContent("¿Cuántos sistemas cristalinos existen en cristalografía?", listOf("5", "6", "7", "8"), "Ciencia", "En cristalografía, existen siete sistemas cristalinos, clasificados según los parámetros de su celda unitaria (longitudes de los ejes y ángulos).")
        ),
        BilingualQuestion(
            id = 13158, correctIndex = 3, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("La biotechnologie utilise les organismes vivants pour créer?", listOf("De l'électricité", "Des médicaments", "De la nourriture", "Toutes les réponses"), "Science", "La biotechnologie exploite les processus biologiques des organismes vivants pour développer des produits et solutions dans des domaines variés comme la médecine, l'agriculture et l'industrie."),
            en = LocalizedContent("Biotechnology uses living organisms to create?", listOf("Electricity", "Medicines", "Food", "All of the above"), "Science", "Biotechnology exploits the biological processes of living organisms to develop products and solutions in various fields such as medicine, agriculture, and industry."),
            zh = LocalizedContent("生物技术利用生物体来创造什么？", listOf("电力", "药物", "食物", "以上所有"), "科学", "生物技术利用生物体的生物过程来开发医药、农业和工业等各个领域的产品和解决方案。"),
            es = LocalizedContent("La biotecnología utiliza organismos vivos para crear?", listOf("Electricidad", "Medicamentos", "Alimentos", "Todas las respuestas"), "Ciencia", "La biotecnología aprovecha los procesos biológicos de los organismos vivos para desarrollar productos y soluciones en diversos campos como la medicina, la agricultura y la industria.")
        ),
        BilingualQuestion(
            id = 13159, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qu'est-ce que l'ADN recombinant en biotechnologie?", listOf("ADN naturel", "ADN modifié", "ADN ancien", "ADN synthétique"), "Science", "L'ADN recombinant est une molécule d'ADN créée en laboratoire en combinant des séquences de différentes sources, ce qui permet de modifier génétiquement des organismes."),
            en = LocalizedContent("What is recombinant DNA in biotechnology?", listOf("Natural DNA", "Modified DNA", "Ancient DNA", "Synthetic DNA"), "Science", "Recombinant DNA is a DNA molecule created in the laboratory by combining sequences from different sources, allowing genetic modification of organisms."),
            zh = LocalizedContent("生物技术中的重组DNA是什么？", listOf("天然DNA", "修饰DNA", "古老DNA", "合成DNA"), "科学", "重组DNA是通过将不同来源的序列组合在实验室中创建的DNA分子，从而允许对生物进行基因改造。"),
            es = LocalizedContent("¿Qué es el ADN recombinante en biotecnología?", listOf("ADN natural", "ADN modificado", "ADN antiguo", "ADN sintético"), "Ciencia", "El ADN recombinante es una molécula de ADN creada en laboratorio combinando secuencias de diferentes fuentes, lo que permite la modificación genética de organismos.")
        ),
        BilingualQuestion(
            id = 13160, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("La zoologie étudie les animaux. Combien de phyla principaux?", listOf("10", "20", "30", "Plus de 30"), "Science", "Le règne animal est extrêmement diversifié, avec plus de 30 phyla reconnus, incluant des groupes majeurs comme les arthropodes, les mollusques et les chordés."),
            en = LocalizedContent("Zoology studies animals. How many main phyla?", listOf("10", "20", "30", "More than 30"), "Science", "The animal kingdom is extremely diverse, with more than 30 recognized phyla, including major groups like arthropods, mollusks, and chordates."),
            zh = LocalizedContent("动物学研究动物。有多少个主要门？", listOf("10", "20", "30", "超过30"), "科学", "动物界极其多样，有超过30个公认的门，包括节肢动物、软体动物和脊索动物等主要类群。"),
            es = LocalizedContent("La zoología estudia los animales. ¿Cuántos filos principales?", listOf("10", "20", "30", "Más de 30"), "Ciencia", "El reino animal es extremadamente diverso, con más de 30 filos reconocidos, incluyendo grupos principales como artrópodos, moluscos y cordados.")
        ),
        BilingualQuestion(
            id = 13161, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel phylum contient les vertébrés?", listOf("Chordata", "Arthropoda", "Mollusca", "Annelida"), "Science", "Les vertébrés appartiennent au phylum des Chordata car ils possèdent tous une notochorde à un stade de leur développement, caractéristique définissant ce groupe."),
            en = LocalizedContent("Which phylum contains vertebrates?", listOf("Chordata", "Arthropoda", "Mollusca", "Annelida"), "Science", "Vertebrates belong to the phylum Chordata because they all possess a notochord at some stage of development, a defining characteristic of this group."),
            zh = LocalizedContent("哪个门包含脊椎动物？", listOf("脊索动物门", "节肢动物门", "软体动物门", "环节动物门"), "科学", "脊椎动物属于脊索动物门，因为它们在发育的某个阶段都具有脊索，这是该群体的定义特征。"),
            es = LocalizedContent("¿Qué filo contiene los vertebrados?", listOf("Chordata", "Arthropoda", "Mollusca", "Annelida"), "Ciencia", "Los vertebrados pertenecen al filo Chordata porque todos poseen una notocorda en alguna etapa de su desarrollo, característica definitoria de este grupo.")
        ),
        BilingualQuestion(
            id = 13162, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En optique, quel type de lentille peut corriger la myopie?", listOf("Convexe", "Concave", "Plane", "Biconcave"), "Science", "La myopie est corrigée par une lentille concave (divergente) qui écarte les rayons lumineux pour compenser un œil trop long."),
            en = LocalizedContent("In optics, what type of lens can correct myopia?", listOf("Convex", "Concave", "Plane", "Biconcave"), "Science", "Myopia is corrected by a concave (divergent) lens that spreads light rays to compensate for an eye that is too long."),
            zh = LocalizedContent("在光学中，哪种透镜可以矫正近视？", listOf("凸透镜", "凹透镜", "平面镜", "双凹透镜"), "科学", "近视通过凹透镜（发散透镜）矫正，它使光线发散以补偿过长的眼球。"),
            es = LocalizedContent("En óptica, ¿qué tipo de lente puede corregir la miopía?", listOf("Convexa", "Cóncava", "Plana", "Bicóncava"), "Ciencia", "La miopía se corrige con una lente cóncava (divergente) que separa los rayos de luz para compensar un ojo demasiado largo.")
        ),
        BilingualQuestion(
            id = 13163, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("L'aberration chromatique est un défaut optique causé par?", listOf("Les impuretés", "La dispersion de la lumière", "Le vieillissement", "La pollution"), "Science", "La lumière blanche est composée de différentes couleurs qui ne sont pas toutes déviées de la même manière en traversant une lentille, un phénomène appelé dispersion. Cela provoque des franges colorées sur les bords de l'image."),
            en = LocalizedContent("Chromatic aberration is an optical defect caused by?", listOf("Impurities", "Dispersion of light", "Aging", "Pollution"), "Science", "White light is composed of different colors that are not all deviated in the same way when passing through a lens, a phenomenon called dispersion. This causes colored fringes on the edges of the image."),
            zh = LocalizedContent("色差是由什么引起的光学缺陷？", listOf("杂质", "光的色散", "老化", "污染"), "科学", "白光由不同颜色组成，这些颜色在通过透镜时并非都以相同方式偏折，这种现象称为色散。这会导致图像边缘出现彩色条纹。"),
            es = LocalizedContent("La aberración cromática es un defecto óptico causado por?", listOf("Impurezas", "Dispersión de la luz", "Envejecimiento", "Contaminación"), "Ciencia", "La luz blanca está compuesta por diferentes colores que no se desvían de la misma manera al atravesar una lente, fenómeno llamado dispersión. Esto provoca franjas de color en los bordes de la imagen.")
        ),
        BilingualQuestion(
            id = 13164, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("La vitesse du son dans l'air est approximativement?", listOf("100 m/s", "300 m/s", "340 m/s", "1000 m/s"), "Science", "La vitesse du son dans l'air à 20°C au niveau de la mer est d'environ 340 mètres par seconde, car elle dépend de la température et de la densité du milieu."),
            en = LocalizedContent("The speed of sound in air is approximately?", listOf("100 m/s", "300 m/s", "340 m/s", "1000 m/s"), "Science", "The speed of sound in air at 20°C at sea level is about 340 meters per second, as it depends on temperature and density of the medium."),
            zh = LocalizedContent("声音在空气中的速度大约是多少？", listOf("100米/秒", "300米/秒", "340米/秒", "1000米/秒"), "科学", "在20°C海平面条件下，声音在空气中的速度约为340米/秒，因为它取决于介质的温度和密度。"),
            es = LocalizedContent("La velocidad del sonido en el aire es aproximadamente?", listOf("100 m/s", "300 m/s", "340 m/s", "1000 m/s"), "Ciencia", "La velocidad del sonido en el aire a 20°C al nivel del mar es de aproximadamente 340 metros por segundo, ya que depende de la temperatura y densidad del medio.")
        ),
        BilingualQuestion(
            id = 13165, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("En acoustique, la fréquence se mesure en?", listOf("Hertz", "Decibels", "Watts", "Pascals"), "Science", "Le hertz (Hz) est l'unité de mesure de la fréquence, représentant le nombre d'oscillations par seconde, utilisé en acoustique pour quantifier la hauteur d'un son."),
            en = LocalizedContent("In acoustics, frequency is measured in?", listOf("Hertz", "Decibels", "Watts", "Pascals"), "Science", "The hertz (Hz) is the unit of measurement for frequency, representing the number of oscillations per second, used in acoustics to quantify the pitch of a sound."),
            zh = LocalizedContent("在声学中，频率的单位是什么？", listOf("赫兹", "分贝", "瓦特", "帕斯卡"), "科学", "赫兹（Hz）是频率的测量单位，表示每秒振荡次数，在声学中用于量化声音的音高。"),
            es = LocalizedContent("En acústica, la frecuencia se mide en?", listOf("Hercios", "Decibelios", "Vatios", "Pascales"), "Ciencia", "El hercio (Hz) es la unidad de medida de la frecuencia, que representa el número de oscilaciones por segundo, utilizado en acústica para cuantificar la altura de un sonido.")
        ),
        BilingualQuestion(
            id = 13166, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("L'effet Doppler modifie la fréquence perçue. Vrai ou Faux?", listOf("Vrai", "Faux", "Partiellement", "Aucune idée"), "Science", "L'effet Doppler décrit le changement de fréquence d'une onde (sonore ou lumineuse) lorsque la source et l'observateur sont en mouvement relatif, comme une sirène qui semble plus aiguë en approchant."),
            en = LocalizedContent("The Doppler effect changes the perceived frequency. True or False?", listOf("True", "False", "Partially", "No idea"), "Science", "The Doppler effect describes the change in frequency of a wave (sound or light) when the source and observer are in relative motion, like a siren that seems higher-pitched when approaching."),
            zh = LocalizedContent("多普勒效应会改变感知到的频率。正确还是错误？", listOf("正确", "错误", "部分正确", "不知道"), "科学", "多普勒效应描述了当声源和观察者相对运动时，波（声波或光波）频率的变化，例如警笛靠近时音调变高。"),
            es = LocalizedContent("El efecto Doppler modifica la frecuencia percibida. ¿Verdadero o Falso?", listOf("Verdadero", "Falso", "Parcialmente", "No lo sé"), "Ciencia", "El efecto Doppler describe el cambio de frecuencia de una onda (sonora o luminosa) cuando la fuente y el observador están en movimiento relativo, como una sirena que parece más aguda al acercarse.")
        ),
        BilingualQuestion(
            id = 13167, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("La deuxième loi de la thermodynamique concerne?", listOf("L'équilibre", "L'entropie", "La pression", "Le travail"), "Science", "Cette loi stipule que l'entropie d'un système isolé ne peut qu'augmenter au cours du temps, définissant ainsi la direction naturelle des processus thermodynamiques."),
            en = LocalizedContent("The second law of thermodynamics concerns?", listOf("Equilibrium", "Entropy", "Pressure", "Work"), "Science", "This law states that the entropy of an isolated system can only increase over time, thus defining the natural direction of thermodynamic processes."),
            zh = LocalizedContent("热力学第二定律涉及什么？", listOf("平衡", "熵", "压力", "功"), "科学", "该定律指出孤立系统的熵只能随时间增加，从而定义了热力学过程的自然方向。"),
            es = LocalizedContent("La segunda ley de la termodinámica se refiere a?", listOf("Equilibrio", "Entropía", "Presión", "Trabajo"), "Ciencia", "Esta ley establece que la entropía de un sistema aislado solo puede aumentar con el tiempo, definiendo así la dirección natural de los procesos termodinámicos.")
        ),
        BilingualQuestion(
            id = 13168, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel zéolithe utilisé en industrie vient d'un minéral?", listOf("Synthétique seulement", "Naturel seulement", "Synthétique et naturel", "Pas utilisé"), "Science", "Les zéolithes sont des minéraux naturels, mais ils peuvent aussi être synthétisés pour l'industrie, d'où l'existence de deux types : synthétique et naturel."),
            en = LocalizedContent("Which zeolite used in industry comes from a mineral?", listOf("Synthetic only", "Natural only", "Synthetic and natural", "Not used"), "Science", "Zeolites are natural minerals, but they can also be synthesized for industry, hence the existence of two types: synthetic and natural."),
            zh = LocalizedContent("工业中使用的哪种沸石来自矿物？", listOf("仅合成", "仅天然", "合成和天然", "未使用"), "科学", "沸石是天然矿物，但也可以为工业合成，因此存在两种类型：合成和天然。"),
            es = LocalizedContent("¿Qué zeolita utilizada en la industria proviene de un mineral?", listOf("Solo sintética", "Solo natural", "Sintética y natural", "No se usa"), "Ciencia", "Las zeolitas son minerales naturales, pero también pueden sintetizarse para la industria, por lo que existen dos tipos: sintética y natural.")
        ),
        BilingualQuestion(
            id = 13169, correctIndex = 3, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En biotechnologie, les fermentations produisent?", listOf("De l'oxygène", "De l'alcool", "De l'acide", "Tout cela"), "Science", "Les fermentations biotechnologiques peuvent produire des médicaments (comme les antibiotiques), des aliments (yaourt, pain) et des biocarburants (éthanol), selon le microorganisme et les conditions utilisées."),
            en = LocalizedContent("In biotechnology, fermentations produce?", listOf("Oxygen", "Alcohol", "Acid", "All of these"), "Science", "Biotechnological fermentations can produce medicines (like antibiotics), foods (yogurt, bread), and biofuels (ethanol), depending on the microorganism and conditions used."),
            zh = LocalizedContent("在生物技术中，发酵产生什么？", listOf("氧气", "酒精", "酸", "以上所有"), "科学", "生物技术发酵可以生产药物（如抗生素）、食品（酸奶、面包）和生物燃料（乙醇），具体取决于所使用的微生物和条件。"),
            es = LocalizedContent("En biotecnología, las fermentaciones producen?", listOf("Oxígeno", "Alcohol", "Ácido", "Todo esto"), "Ciencia", "Las fermentaciones biotecnológicas pueden producir medicamentos (como antibióticos), alimentos (yogur, pan) y biocombustibles (etanol), según el microorganismo y las condiciones utilizadas.")
        ),
        BilingualQuestion(
            id = 13170, correctIndex = 3, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("La zoologie range les animaux en?", listOf("Espèces", "Genres", "Familles", "Tous ce qui précède"), "Science", "La zoologie classe les animaux selon plusieurs critères : leur habitat, leur mode de reproduction, leur régime alimentaire, et leur structure corporelle. La réponse \"Tous ce qui précède\" est donc correcte car ces catégories sont toutes utilisées."),
            en = LocalizedContent("Zoology classifies animals into?", listOf("Species", "Genera", "Families", "All of the above"), "Science", "Zoology classifies animals according to several criteria: their habitat, mode of reproduction, diet, and body structure. The answer 'All of the above' is correct because these categories are all used."),
            zh = LocalizedContent("动物学将动物分为？", listOf("种", "属", "科", "以上所有"), "科学", "动物学根据多种标准对动物进行分类：栖息地、繁殖方式、食性和身体结构。答案“以上所有”是正确的，因为这些类别都被使用。"),
            es = LocalizedContent("La zoología clasifica a los animales en?", listOf("Especies", "Géneros", "Familias", "Todos los anteriores"), "Ciencia", "La zoología clasifica a los animales según varios criterios: su hábitat, modo de reproducción, dieta y estructura corporal. La respuesta 'Todos los anteriores' es correcta porque todas estas categorías se utilizan.")
        ),
        BilingualQuestion(
            id = 13171, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel cristal est utilisé dans les montres?", listOf("Diamant", "Quartz", "Rubis synthétique", "Saphir"), "Science", "Le quartz est utilisé dans les montres pour sa piézoélectricité : sous l'effet d'un courant électrique, il vibre à une fréquence très stable, permettant un chronométrage précis."),
            en = LocalizedContent("Which crystal is used in watches?", listOf("Diamond", "Quartz", "Synthetic ruby", "Sapphire"), "Science", "Quartz is used in watches for its piezoelectricity: under an electric current, it vibrates at a very stable frequency, allowing precise timekeeping."),
            zh = LocalizedContent("哪种晶体用于手表？", listOf("钻石", "石英", "合成红宝石", "蓝宝石"), "科学", "石英因其压电性而被用于手表：在电流作用下，它以非常稳定的频率振动，从而实现精确计时。"),
            es = LocalizedContent("¿Qué cristal se utiliza en los relojes?", listOf("Diamante", "Cuarzo", "Rubí sintético", "Zafiro"), "Ciencia", "El cuarzo se utiliza en los relojes por su piezoelectricidad: bajo una corriente eléctrica, vibra a una frecuencia muy estable, permitiendo una medición precisa del tiempo.")
        ),
        BilingualQuestion(
            id = 13172, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("La polarisation de la lumière crée des ondes?", listOf("Aléatoires", "Oscillant dans une direction", "Multidirectionnelles", "Stationnaires"), "Science", "La lumière non polarisée vibre dans toutes les directions, mais la polarisation filtre ces vibrations pour ne conserver qu’un seul plan d’oscillation."),
            en = LocalizedContent("Polarization of light creates waves that?", listOf("Are random", "Oscillate in one direction", "Are multidirectional", "Are stationary"), "Science", "Unpolarized light vibrates in all directions, but polarization filters these vibrations to retain only a single plane of oscillation."),
            zh = LocalizedContent("光的偏振产生什么波？", listOf("随机的", "沿一个方向振荡", "多方向的", "驻波"), "科学", "非偏振光在所有方向上振动，但偏振会过滤这些振动，只保留一个振荡平面。"),
            es = LocalizedContent("La polarización de la luz crea ondas que?", listOf("Son aleatorias", "Oscilan en una dirección", "Son multidireccionales", "Son estacionarias"), "Ciencia", "La luz no polarizada vibra en todas direcciones, pero la polarización filtra estas vibraciones para conservar solo un plano de oscilación.")
        ),
        BilingualQuestion(
            id = 13173, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En acoustique, quel matériau absorbe le mieux le son?", listOf("Béton", "Bois", "Mousse poreuse", "Métal"), "Science", "La mousse poreuse absorbe le son en piégeant les ondes sonores dans ses cavités, ce qui dissipe leur énergie sous forme de chaleur."),
            en = LocalizedContent("In acoustics, which material absorbs sound best?", listOf("Concrete", "Wood", "Porous foam", "Metal"), "Science", "Porous foam absorbs sound by trapping sound waves in its cavities, dissipating their energy as heat."),
            zh = LocalizedContent("在声学中，哪种材料吸音效果最好？", listOf("混凝土", "木材", "多孔泡沫", "金属"), "科学", "多孔泡沫通过将声波困在其空腔中来吸收声音，从而将声能转化为热量耗散。"),
            es = LocalizedContent("En acústica, ¿qué material absorbe mejor el sonido?", listOf("Hormigón", "Madera", "Espuma porosa", "Metal"), "Ciencia", "La espuma porosa absorbe el sonido atrapando las ondas sonoras en sus cavidades, disipando su energía en forma de calor.")
        ),
        BilingualQuestion(
            id = 13174, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("La conductivité thermique mesure?", listOf("La température", "Le flux de chaleur", "L'énergie", "L'expansion"), "Science", "La conductivité thermique quantifie la capacité d'un matériau à transmettre la chaleur par conduction, définissant ainsi le flux de chaleur qui le traverse sous un gradient de température."),
            en = LocalizedContent("Thermal conductivity measures?", listOf("Temperature", "Heat flow", "Energy", "Expansion"), "Science", "Thermal conductivity quantifies a material's ability to conduct heat, defining the heat flow through it under a temperature gradient."),
            zh = LocalizedContent("热导率测量什么？", listOf("温度", "热流", "能量", "膨胀"), "科学", "热导率量化了材料传导热量的能力，定义了在温度梯度下通过它的热流。"),
            es = LocalizedContent("La conductividad térmica mide?", listOf("La temperatura", "El flujo de calor", "La energía", "La expansión"), "Ciencia", "La conductividad térmica cuantifica la capacidad de un material para conducir el calor, definiendo el flujo de calor a través de él bajo un gradiente de temperatura.")
        ),
        BilingualQuestion(
            id = 13175, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Les cristaux de glace forment quel système cristallin?", listOf("Cubique", "Hexagonal", "Trigonal", "Monoclinique"), "Science", "La glace cristallise dans le système hexagonal en raison de la disposition des molécules d'eau liées par ponts hydrogène, formant une structure en nid d'abeille."),
            en = LocalizedContent("Ice crystals form which crystal system?", listOf("Cubic", "Hexagonal", "Trigonal", "Monoclinic"), "Science", "Ice crystallizes in the hexagonal system due to the arrangement of water molecules linked by hydrogen bonds, forming a honeycomb structure."),
            zh = LocalizedContent("冰晶形成哪种晶系？", listOf("立方晶系", "六方晶系", "三方晶系", "单斜晶系"), "科学", "由于水分子通过氢键连接，冰以六方晶系结晶，形成蜂窝状结构。"),
            es = LocalizedContent("Los cristales de hielo forman ¿qué sistema cristalino?", listOf("Cúbico", "Hexagonal", "Trigonal", "Monoclínico"), "Ciencia", "El hielo cristaliza en el sistema hexagonal debido a la disposición de las moléculas de agua unidas por puentes de hidrógeno, formando una estructura de panal.")
        ),
        BilingualQuestion(
            id = 13176, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("La biotechnologie génétique crée des organismes?", listOf("Fossiles", "Génétiquement modifiés", "Stériles", "Immortels"), "Science", "La biotechnologie génétique modifie directement le matériel génétique d'un organisme, créant ainsi des organismes génétiquement modifiés (OGM)."),
            en = LocalizedContent("Genetic biotechnology creates organisms that are?", listOf("Fossils", "Genetically modified", "Sterile", "Immortal"), "Science", "Genetic biotechnology directly modifies an organism's genetic material, creating genetically modified organisms (GMOs)."),
            zh = LocalizedContent("基因生物技术创造什么生物？", listOf("化石", "转基因的", "不育的", "永生的"), "科学", "基因生物技术直接修改生物体的遗传物质，从而创造出转基因生物（GMO）。"),
            es = LocalizedContent("La biotecnología genética crea organismos que son?", listOf("Fósiles", "Genéticamente modificados", "Estériles", "Inmortales"), "Ciencia", "La biotecnología genética modifica directamente el material genético de un organismo, creando organismos genéticamente modificados (OGM).")
        ),
        BilingualQuestion(
            id = 13177, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel zoologiste a créé la taxonomie animale?", listOf("Darwin", "Linné", "Cuvier", "Haeckel"), "Science", "Carl von Linné, naturaliste suédois du XVIIIe siècle, a établi le système de classification binomiale des espèces, posant les bases de la taxonomie moderne."),
            en = LocalizedContent("Which zoologist created animal taxonomy?", listOf("Darwin", "Linnaeus", "Cuvier", "Haeckel"), "Science", "Carl Linnaeus, an 18th-century Swedish naturalist, established the binomial classification system for species, laying the foundations of modern taxonomy."),
            zh = LocalizedContent("哪位动物学家创建了动物分类学？", listOf("达尔文", "林奈", "居维叶", "海克尔"), "科学", "18世纪的瑞典博物学家卡尔·林奈建立了物种的双名分类系统，为现代分类学奠定了基础。"),
            es = LocalizedContent("¿Qué zoólogo creó la taxonomía animal?", listOf("Darwin", "Linneo", "Cuvier", "Haeckel"), "Ciencia", "Carlos Linneo, naturalista sueco del siglo XVIII, estableció el sistema de clasificación binomial de las especies, sentando las bases de la taxonomía moderna.")
        ),
        BilingualQuestion(
            id = 13178, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("La réflexion totale interne se produit avec un angle?", listOf("Aigu", "Critique", "Obtus", "Droit"), "Science", "L'angle critique est l'angle d'incidence au-delà duquel la lumière est entièrement réfléchie à l'intérieur d'un milieu transparent, comme dans une fibre optique."),
            en = LocalizedContent("Total internal reflection occurs with an angle that is?", listOf("Acute", "Critical", "Obtuse", "Right"), "Science", "The critical angle is the angle of incidence beyond which light is entirely reflected inside a transparent medium, as in an optical fiber."),
            zh = LocalizedContent("全内反射发生在什么角度？", listOf("锐角", "临界角", "钝角", "直角"), "科学", "临界角是入射角超过该角度后，光在透明介质内部被完全反射的角度，如光纤中。"),
            es = LocalizedContent("La reflexión total interna ocurre con un ángulo que es?", listOf("Agudo", "Crítico", "Obtuso", "Recto"), "Ciencia", "El ángulo crítico es el ángulo de incidencia más allá del cual la luz se refleja completamente dentro de un medio transparente, como en una fibra óptica.")
        ),
        BilingualQuestion(
            id = 13179, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En acoustique, la vélocité du son augmente avec?", listOf("La pression", "La température", "L'humidité", "Le froid"), "Science", "Dans un gaz, les molécules se déplacent plus vite quand la température augmente, ce qui accélère la transmission des ondes sonores. Ainsi, la vitesse du son est plus élevée dans l'air chaud que dans l'air froid."),
            en = LocalizedContent("In acoustics, the velocity of sound increases with?", listOf("Pressure", "Temperature", "Humidity", "Cold"), "Science", "In a gas, molecules move faster when temperature increases, which accelerates the transmission of sound waves. Thus, the speed of sound is higher in hot air than in cold air."),
            zh = LocalizedContent("在声学中，声音的速度随什么增加？", listOf("压力", "温度", "湿度", "寒冷"), "科学", "在气体中，当温度升高时，分子运动加快，从而加速了声波的传播。因此，声音在热空气中的速度比在冷空气中高。"),
            es = LocalizedContent("En acústica, ¿la velocidad del sonido aumenta con?", listOf("La presión", "La temperatura", "La humedad", "El frío"), "Ciencia", "En un gas, las moléculas se mueven más rápido cuando la temperatura aumenta, lo que acelera la transmisión de las ondas sonoras. Por lo tanto, la velocidad del sonido es mayor en aire caliente que en aire frío.")
        ),
        BilingualQuestion(
            id = 13180, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Le zéro absolu en thermodynamique est?", listOf("0°C", "-273,15°C", "-100°C", "Impossible"), "Science", "C'est la température la plus basse possible, où l'agitation moléculaire cesse théoriquement. Elle correspond à 0 Kelvin sur l'échelle absolue."),
            en = LocalizedContent("Absolute zero in thermodynamics is?", listOf("0°C", "-273.15°C", "-100°C", "Impossible"), "Science", "It is the lowest possible temperature, where molecular motion theoretically ceases. It corresponds to 0 Kelvin on the absolute scale."),
            zh = LocalizedContent("热力学中的绝对零度是？", listOf("0°C", "-273.15°C", "-100°C", "不可能"), "科学", "这是可能的最低温度，理论上分子运动停止。它对应于绝对温标上的0开尔文。"),
            es = LocalizedContent("El cero absoluto en termodinámica es?", listOf("0°C", "-273,15°C", "-100°C", "Imposible"), "Ciencia", "Es la temperatura más baja posible, donde el movimiento molecular cesa teóricamente. Corresponde a 0 Kelvin en la escala absoluta.")
        ),
        BilingualQuestion(
            id = 13181, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En cristallographie, l'indice de Miller décrit?", listOf("L'orientation des plans", "La dureté", "La couleur", "La transparence"), "Science", "Les indices de Miller sont un système de notation utilisé en cristallographie pour définir l'orientation des plans cristallins dans un réseau."),
            en = LocalizedContent("In crystallography, the Miller index describes?", listOf("The orientation of planes", "Hardness", "Color", "Transparency"), "Science", "Miller indices are a notation system used in crystallography to define the orientation of crystal planes in a lattice."),
            zh = LocalizedContent("在晶体学中，米勒指数描述的是？", listOf("晶面的取向", "硬度", "颜色", "透明度"), "科学", "米勒指数是晶体学中用于定义晶格中晶面取向的符号系统。"),
            es = LocalizedContent("En cristalografía, el índice de Miller describe?", listOf("La orientación de los planos", "La dureza", "El color", "La transparencia"), "Ciencia", "Los índices de Miller son un sistema de notación utilizado en cristalografía para definir la orientación de los planos cristalinos en una red.")
        ),
        BilingualQuestion(
            id = 13182, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("La transgénèse en biotechnologie introduit des gènes?", listOf("D'une autre espèce", "Du même organisme", "Synthétiques", "Fossiles"), "Science", "La transgénèse consiste à transférer un gène d'un organisme donneur (d'une autre espèce) vers un organisme receveur, ce qui permet de lui conférer une nouvelle caractéristique."),
            en = LocalizedContent("Transgenesis in biotechnology introduces genes?", listOf("From another species", "From the same organism", "Synthetic", "Fossil"), "Science", "Transgenesis involves transferring a gene from a donor organism (of another species) to a recipient organism, thereby conferring a new trait."),
            zh = LocalizedContent("生物技术中的转基因引入的是？", listOf("来自其他物种的基因", "来自同一生物体的基因", "合成基因", "化石基因"), "科学", "转基因是将基因从供体生物（另一物种）转移到受体生物，从而赋予其新特征。"),
            es = LocalizedContent("La transgénesis en biotecnología introduce genes?", listOf("De otra especie", "Del mismo organismo", "Sintéticos", "Fósiles"), "Ciencia", "La transgénesis consiste en transferir un gen de un organismo donante (de otra especie) a un organismo receptor, lo que le confiere una nueva característica.")
        ),
        BilingualQuestion(
            id = 13183, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Les mammifères appartiennent à quel classe zoologique?", listOf("Reptilia", "Aves", "Mammalia", "Amphibia"), "Science", "Les mammifères sont classés dans la classe Mammalia en raison de caractéristiques communes comme la présence de glandes mammaires et de poils. Cette classification zoologique regroupe tous les animaux vertébrés qui allaitent leurs petits."),
            en = LocalizedContent("Mammals belong to which zoological class?", listOf("Reptilia", "Aves", "Mammalia", "Amphibia"), "Science", "Mammals are classified in the class Mammalia due to common characteristics such as the presence of mammary glands and hair. This zoological classification includes all vertebrate animals that nurse their young."),
            zh = LocalizedContent("哺乳动物属于哪个动物学纲？", listOf("爬行纲", "鸟纲", "哺乳纲", "两栖纲"), "科学", "哺乳动物因其具有乳腺和毛发等共同特征而被归入哺乳纲。这一动物学分类包括所有哺乳幼崽的脊椎动物。"),
            es = LocalizedContent("¿Los mamíferos pertenecen a qué clase zoológica?", listOf("Reptilia", "Aves", "Mammalia", "Amphibia"), "Ciencia", "Los mamíferos se clasifican en la clase Mammalia debido a características comunes como la presencia de glándulas mamarias y pelo. Esta clasificación zoológica agrupa a todos los animales vertebrados que amamantan a sus crías.")
        ),
        BilingualQuestion(
            id = 13184, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("La biréfringence optique apparaît dans les cristaux?", listOf("Isotropes", "Anisotropes", "Opaques", "Amorphes"), "Science", "La biréfringence se produit lorsque la lumière traverse un matériau dont les propriétés optiques varient selon la direction, ce qui est le cas des cristaux anisotropes."),
            en = LocalizedContent("Optical birefringence appears in crystals?", listOf("Isotropic", "Anisotropic", "Opaque", "Amorphous"), "Science", "Birefringence occurs when light passes through a material whose optical properties vary with direction, which is the case for anisotropic crystals."),
            zh = LocalizedContent("光学双折射出现在什么晶体中？", listOf("各向同性", "各向异性", "不透明", "非晶态"), "科学", "当光通过光学性质随方向变化的材料时会产生双折射，各向异性晶体就是这种情况。"),
            es = LocalizedContent("¿La birrefringencia óptica aparece en cristales?", listOf("Isótropos", "Anisótropos", "Opacos", "Amorfos"), "Ciencia", "La birrefringencia ocurre cuando la luz atraviesa un material cuyas propiedades ópticas varían según la dirección, lo que es el caso de los cristales anisótropos.")
        ),
        BilingualQuestion(
            id = 13185, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("L'interférence acoustique provoque?", listOf("Augmentation du volume", "Diminution du volume", "Silence ou renforcement", "Changement de fréquence"), "Science", "L'interférence acoustique se produit lorsque deux ondes sonores se rencontrent. Leur combinaison peut créer un silence (interférence destructive) ou un renforcement du son (interférence constructive)."),
            en = LocalizedContent("Acoustic interference causes?", listOf("Increase in volume", "Decrease in volume", "Silence or reinforcement", "Change in frequency"), "Science", "Acoustic interference occurs when two sound waves meet. Their combination can create silence (destructive interference) or reinforcement of sound (constructive interference)."),
            zh = LocalizedContent("声学干涉会导致？", listOf("音量增加", "音量减小", "静音或增强", "频率变化"), "科学", "当两个声波相遇时会产生声学干涉。它们的组合可以产生静音（相消干涉）或声音增强（相长干涉）。"),
            es = LocalizedContent("¿La interferencia acústica provoca?", listOf("Aumento del volumen", "Disminución del volumen", "Silencio o refuerzo", "Cambio de frecuencia"), "Ciencia", "La interferencia acústica ocurre cuando dos ondas sonoras se encuentran. Su combinación puede crear silencio (interferencia destructiva) o refuerzo del sonido (interferencia constructiva).")
        ),
        BilingualQuestion(
            id = 13186, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("La capacité thermique spécifique mesure?", listOf("La masse", "L'énergie par unité de masse et température", "Le volume", "La densité"), "Science", "La capacité thermique spécifique indique la quantité d'énergie nécessaire pour élever la température d'un kilogramme d'une substance d'un degré Celsius."),
            en = LocalizedContent("Specific heat capacity measures?", listOf("Mass", "Energy per unit mass and temperature", "Volume", "Density"), "Science", "Specific heat capacity indicates the amount of energy required to raise the temperature of one kilogram of a substance by one degree Celsius."),
            zh = LocalizedContent("比热容测量的是？", listOf("质量", "单位质量和温度的能量", "体积", "密度"), "科学", "比热容表示将一千克物质的温度升高一摄氏度所需的能量。"),
            es = LocalizedContent("¿La capacidad calorífica específica mide?", listOf("La masa", "La energía por unidad de masa y temperatura", "El volumen", "La densidad"), "Ciencia", "La capacidad calorífica específica indica la cantidad de energía necesaria para elevar la temperatura de un kilogramo de una sustancia en un grado Celsius.")
        ),
        BilingualQuestion(
            id = 13187, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Les défauts ponctuels des cristaux incluent?", listOf("Lacunes", "Interstitiels", "Substitutionnels", "Tous ce qui précède"), "Science", "Les défauts ponctuels des cristaux regroupent les lacunes, les atomes interstitiels et les atomes substitutionnels, qui sont tous des types de défauts à l'échelle atomique."),
            en = LocalizedContent("Point defects in crystals include?", listOf("Vacancies", "Interstitials", "Substitutionals", "All of the above"), "Science", "Point defects in crystals include vacancies, interstitial atoms, and substitutional atoms, all of which are types of defects at the atomic scale."),
            zh = LocalizedContent("晶体中的点缺陷包括？", listOf("空位", "间隙原子", "置换原子", "以上所有"), "科学", "晶体中的点缺陷包括空位、间隙原子和置换原子，这些都是原子尺度的缺陷类型。"),
            es = LocalizedContent("¿Los defectos puntuales de los cristales incluyen?", listOf("Vacantes", "Intersticiales", "Sustitucionales", "Todos los anteriores"), "Ciencia", "Los defectos puntuales de los cristales incluyen vacantes, átomos intersticiales y átomos sustitucionales, todos ellos tipos de defectos a escala atómica.")
        ),
        BilingualQuestion(
            id = 13188, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("La fermentation lactique produit?", listOf("De l'alcool", "De l'acide lactique", "Du gaz carbonique", "De l'eau"), "Science", "La fermentation lactique est un processus métabolique qui convertit le sucre en énergie, produisant de l'acide lactique comme sous-produit, notamment dans les muscles lors d'un effort intense ou dans la fabrication du yaourt."),
            en = LocalizedContent("Lactic acid fermentation produces?", listOf("Alcohol", "Lactic acid", "Carbon dioxide", "Water"), "Science", "Lactic acid fermentation is a metabolic process that converts sugar into energy, producing lactic acid as a byproduct, notably in muscles during intense exercise or in yogurt production."),
            zh = LocalizedContent("乳酸发酵产生的是？", listOf("酒精", "乳酸", "二氧化碳", "水"), "科学", "乳酸发酵是一种将糖转化为能量的代谢过程，产生乳酸作为副产品，特别是在剧烈运动时的肌肉中或酸奶制作中。"),
            es = LocalizedContent("¿La fermentación láctica produce?", listOf("Alcohol", "Ácido láctico", "Dióxido de carbono", "Agua"), "Ciencia", "La fermentación láctica es un proceso metabólico que convierte el azúcar en energía, produciendo ácido láctico como subproducto, especialmente en los músculos durante el ejercicio intenso o en la fabricación de yogur.")
        ),
    )

    private fun part7(): List<BilingualQuestion> = listOf(
        BilingualQuestion(
            id = 13189, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("La zoologie marine étudie les créatures de?", listOf("Rivières", "Océans", "Lacs", "Tous les habitats aquatiques"), "Science", "La zoologie marine se concentre sur l'étude des animaux vivant dans les milieux marins, principalement les océans, qui couvrent plus de 70% de la surface terrestre."),
            en = LocalizedContent("Marine zoology studies creatures of?", listOf("Rivers", "Oceans", "Lakes", "All aquatic habitats"), "Science", "Marine zoology focuses on the study of animals living in marine environments, primarily oceans, which cover more than 70% of the Earth's surface."),
            zh = LocalizedContent("海洋动物学研究的是哪些生物？", listOf("河流", "海洋", "湖泊", "所有水生栖息地"), "科学", "海洋动物学专注于研究生活在海洋环境中的动物，主要是海洋，海洋覆盖了地球表面的70%以上。"),
            es = LocalizedContent("La zoología marina estudia las criaturas de?", listOf("Ríos", "Océanos", "Lagos", "Todos los hábitats acuáticos"), "Ciencia", "La zoología marina se centra en el estudio de los animales que viven en ambientes marinos, principalmente los océanos, que cubren más del 70% de la superficie terrestre.")
        ),
        BilingualQuestion(
            id = 13190, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("L'indice de réfraction compare les vitesses de lumière en?", listOf("Deux milieux", "Vide et milieu", "Lumière et matière", "Deux ondes"), "Science", "L'indice de réfraction d'un milieu est le rapport entre la vitesse de la lumière dans le vide et sa vitesse dans ce milieu."),
            en = LocalizedContent("The refractive index compares the speeds of light in?", listOf("Two media", "Vacuum and medium", "Light and matter", "Two waves"), "Science", "The refractive index of a medium is the ratio of the speed of light in vacuum to its speed in that medium."),
            zh = LocalizedContent("折射率比较的是光在什么中的速度？", listOf("两种介质", "真空和介质", "光和物质", "两种波"), "科学", "介质的折射率是光在真空中的速度与其在该介质中的速度之比。"),
            es = LocalizedContent("El índice de refracción compara las velocidades de la luz en?", listOf("Dos medios", "Vacío y medio", "Luz y materia", "Dos ondas"), "Ciencia", "El índice de refracción de un medio es la relación entre la velocidad de la luz en el vacío y su velocidad en ese medio.")
        ),
        BilingualQuestion(
            id = 13191, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("La diffraction se produit quand une onde rencontre un?", listOf("Obstacle", "Miroir", "Prisme", "Filtre"), "Science", "La diffraction est le phénomène de déviation des ondes lorsqu'elles rencontrent un obstacle ou une ouverture, ce qui modifie leur propagation."),
            en = LocalizedContent("Diffraction occurs when a wave encounters an?", listOf("Obstacle", "Mirror", "Prism", "Filter"), "Science", "Diffraction is the phenomenon of wave deviation when they encounter an obstacle or an opening, which modifies their propagation."),
            zh = LocalizedContent("衍射发生在波遇到什么时？", listOf("障碍物", "镜子", "棱镜", "滤光片"), "科学", "衍射是波在遇到障碍物或开口时发生偏离的现象，从而改变其传播。"),
            es = LocalizedContent("La difracción ocurre cuando una onda encuentra un?", listOf("Obstáculo", "Espejo", "Prisma", "Filtro"), "Ciencia", "La difracción es el fenómeno de desviación de las ondas cuando encuentran un obstáculo o una abertura, lo que modifica su propagación.")
        ),
        BilingualQuestion(
            id = 13192, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En thermodynamique, le travail est lié à?", listOf("La chaleur", "La pression et le volume", "La température", "L'entropie"), "Science", "En thermodynamique, le travail mécanique est défini comme le produit de la pression extérieure par la variation de volume, selon la formule W = -PΔV."),
            en = LocalizedContent("In thermodynamics, work is related to?", listOf("Heat", "Pressure and volume", "Temperature", "Entropy"), "Science", "In thermodynamics, mechanical work is defined as the product of external pressure and volume change, according to the formula W = -PΔV."),
            zh = LocalizedContent("在热力学中，功与什么有关？", listOf("热量", "压力和体积", "温度", "熵"), "科学", "在热力学中，机械功定义为外部压力与体积变化的乘积，根据公式 W = -PΔV。"),
            es = LocalizedContent("En termodinámica, el trabajo está relacionado con?", listOf("El calor", "La presión y el volumen", "La temperatura", "La entropía"), "Ciencia", "En termodinámica, el trabajo mecánico se define como el producto de la presión externa por el cambio de volumen, según la fórmula W = -PΔV.")
        ),
        BilingualQuestion(
            id = 13193, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("La structure cristalline se répète selon un?", listOf("Motif aléatoire", "Réseau périodique", "Gradient", "Chaos"), "Science", "Un réseau périodique décrit la répétition régulière et tridimensionnelle des motifs atomiques dans un cristal, définissant ainsi sa structure ordonnée."),
            en = LocalizedContent("The crystal structure repeats according to a?", listOf("Random pattern", "Periodic lattice", "Gradient", "Chaos"), "Science", "A periodic lattice describes the regular three-dimensional repetition of atomic patterns in a crystal, thus defining its ordered structure."),
            zh = LocalizedContent("晶体结构按照什么重复？", listOf("随机图案", "周期性晶格", "梯度", "混沌"), "科学", "周期性晶格描述了晶体中原子的规则三维重复，从而定义了其有序结构。"),
            es = LocalizedContent("La estructura cristalina se repite según un?", listOf("Patrón aleatorio", "Red periódica", "Gradiente", "Caos"), "Ciencia", "Una red periódica describe la repetición tridimensional regular de los patrones atómicos en un cristal, definiendo así su estructura ordenada.")
        ),
        BilingualQuestion(
            id = 13194, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("La sélection génétique en biotechnologie favorise les?", listOf("Mutation", "Traits souhaités", "Diversité", "Aléatoire"), "Science", "En biotechnologie, la sélection génétique consiste à choisir et propager des organismes possédant des caractéristiques avantageuses, comme la résistance aux maladies ou un rendement accru."),
            en = LocalizedContent("Genetic selection in biotechnology favors?", listOf("Mutation", "Desired traits", "Diversity", "Randomness"), "Science", "In biotechnology, genetic selection involves choosing and propagating organisms with advantageous characteristics, such as disease resistance or increased yield."),
            zh = LocalizedContent("生物技术中的基因选择有利于什么？", listOf("突变", "期望性状", "多样性", "随机性"), "科学", "在生物技术中，基因选择涉及选择并繁殖具有有利特征的生物体，例如抗病性或增产。"),
            es = LocalizedContent("La selección genética en biotecnología favorece?", listOf("La mutación", "Los rasgos deseados", "La diversidad", "El azar"), "Ciencia", "En biotecnología, la selección genética consiste en elegir y propagar organismos con características ventajosas, como la resistencia a enfermedades o un mayor rendimiento.")
        ),
        BilingualQuestion(
            id = 13195, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("La zoologie comportementale étudie le?", listOf("Squelette", "Comportement animal", "L'ADN", "La nutrition"), "Science", "La zoologie comportementale, aussi appelée éthologie, se concentre sur l'observation et l'analyse des actions et réactions des animaux dans leur environnement naturel."),
            en = LocalizedContent("Behavioral zoology studies?", listOf("Skeleton", "Animal behavior", "DNA", "Nutrition"), "Science", "Behavioral zoology, also called ethology, focuses on observing and analyzing the actions and reactions of animals in their natural environment."),
            zh = LocalizedContent("行为动物学研究什么？", listOf("骨骼", "动物行为", "DNA", "营养"), "科学", "行为动物学，也称为动物行为学，专注于观察和分析动物在自然环境中的行为和反应。"),
            es = LocalizedContent("La zoología del comportamiento estudia?", listOf("El esqueleto", "El comportamiento animal", "El ADN", "La nutrición"), "Ciencia", "La zoología del comportamiento, también llamada etología, se centra en la observación y análisis de las acciones y reacciones de los animales en su entorno natural.")
        ),
        BilingualQuestion(
            id = 13196, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("L'extinction des couleurs optiques se voit avec la lumière?", listOf("Blanche", "Polarisée", "Monochromatique", "Infrarouge"), "Science", "La lumière polarisée vibre dans un seul plan, ce qui permet de filtrer les reflets et de révéler les couleurs optiques, contrairement à la lumière non polarisée."),
            en = LocalizedContent("Optical color extinction is seen with?", listOf("White light", "Polarized light", "Monochromatic light", "Infrared light"), "Science", "Polarized light vibrates in a single plane, allowing filtering of reflections and revealing optical colors, unlike non-polarized light."),
            zh = LocalizedContent("光学颜色消色现象在什么光下可见？", listOf("白光", "偏振光", "单色光", "红外光"), "科学", "偏振光在单一平面内振动，可以过滤反射并显示光学颜色，而非偏振光则不能。"),
            es = LocalizedContent("La extinción de colores ópticos se ve con luz?", listOf("Blanca", "Polarizada", "Monocromática", "Infrarroja"), "Ciencia", "La luz polarizada vibra en un solo plano, lo que permite filtrar reflejos y revelar colores ópticos, a diferencia de la luz no polarizada.")
        ),
        BilingualQuestion(
            id = 13197, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("La résonance acoustique amplifie les sons à certaines?", listOf("Couleurs", "Fréquences", "Amplitudes", "Positions"), "Science", "La résonance acoustique se produit lorsqu'un objet vibre à sa fréquence naturelle, ce qui amplifie les ondes sonores à des fréquences spécifiques."),
            en = LocalizedContent("Acoustic resonance amplifies sounds at certain?", listOf("Colors", "Frequencies", "Amplitudes", "Positions"), "Science", "Acoustic resonance occurs when an object vibrates at its natural frequency, amplifying sound waves at specific frequencies."),
            zh = LocalizedContent("声学共振在什么条件下放大声音？", listOf("颜色", "频率", "振幅", "位置"), "科学", "声学共振发生在物体以其固有频率振动时，从而在特定频率下放大声波。"),
            es = LocalizedContent("La resonancia acústica amplifica los sonidos a ciertas?", listOf("Colores", "Frecuencias", "Amplitudes", "Posiciones"), "Ciencia", "La resonancia acústica ocurre cuando un objeto vibra a su frecuencia natural, amplificando las ondas sonoras a frecuencias específicas.")
        ),
        BilingualQuestion(
            id = 13198, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("La conductivité thermique des métaux vient des électrons?", listOf("Fixes", "Libres", "Liés", "Immobiles"), "Science", "Les électrons libres dans les métaux permettent une transmission rapide de l'énergie thermique, ce qui explique leur haute conductivité thermique."),
            en = LocalizedContent("Thermal conductivity of metals comes from?", listOf("Fixed electrons", "Free electrons", "Bound electrons", "Immobile electrons"), "Science", "Free electrons in metals allow rapid transmission of thermal energy, which explains their high thermal conductivity."),
            zh = LocalizedContent("金属的导热性来自什么电子？", listOf("固定电子", "自由电子", "束缚电子", "不动电子"), "科学", "金属中的自由电子能够快速传递热能，这解释了它们的高导热性。"),
            es = LocalizedContent("La conductividad térmica de los metales proviene de electrones?", listOf("Fijos", "Libres", "Enlazados", "Inmóviles"), "Ciencia", "Los electrones libres en los metales permiten una transmisión rápida de la energía térmica, lo que explica su alta conductividad térmica.")
        ),
        BilingualQuestion(
            id = 13199, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Les chaînes polypeptidiques en biotechnologie forment les?", listOf("Acides nucléiques", "Protéines", "Lipides", "Glucides"), "Science", "Les chaînes polypeptidiques sont des séquences d'acides aminés qui, une fois repliées et assemblées, constituent les protéines, essentielles à la structure et au fonctionnement des cellules."),
            en = LocalizedContent("In biotechnology, polypeptide chains form?", listOf("Nucleic acids", "Proteins", "Lipids", "Carbohydrates"), "Science", "Polypeptide chains are sequences of amino acids that, when folded and assembled, constitute proteins, which are essential for cell structure and function."),
            zh = LocalizedContent("在生物技术中，多肽链形成什么？", listOf("核酸", "蛋白质", "脂质", "碳水化合物"), "科学", "多肽链是氨基酸序列，折叠组装后构成蛋白质，对细胞结构和功能至关重要。"),
            es = LocalizedContent("En biotecnología, las cadenas polipeptídicas forman?", listOf("Ácidos nucleicos", "Proteínas", "Lípidos", "Glúcidos"), "Ciencia", "Las cadenas polipeptídicas son secuencias de aminoácidos que, al plegarse y ensamblarse, constituyen las proteínas, esenciales para la estructura y función celular.")
        ),
        BilingualQuestion(
            id = 13200, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("L'Empire ottoman s'est établi au?", listOf("12e siècle", "13e siècle", "14e siècle", "15e siècle"), "Histoire", "L'Empire ottoman a été fondé vers 1299 par Osman Ier, ce qui le place au tournant du 14e siècle. Il a connu son essor initial durant ce siècle en Anatolie."),
            en = LocalizedContent("The Ottoman Empire was established in the?", listOf("12th century", "13th century", "14th century", "15th century"), "History", "The Ottoman Empire was founded around 1299 by Osman I, placing it at the turn of the 14th century. It experienced its initial rise during this century in Anatolia."),
            zh = LocalizedContent("奥斯曼帝国建立于哪个世纪？", listOf("12世纪", "13世纪", "14世纪", "15世纪"), "历史", "奥斯曼帝国由奥斯曼一世于1299年左右建立，处于14世纪之交。它在安纳托利亚于该世纪初期崛起。"),
            es = LocalizedContent("El Imperio Otomano se estableció en el?", listOf("Siglo XII", "Siglo XIII", "Siglo XIV", "Siglo XV"), "Historia", "El Imperio Otomano fue fundado hacia 1299 por Osman I, situándolo en el cambio del siglo XIV. Experimentó su auge inicial durante este siglo en Anatolia.")
        ),
        BilingualQuestion(
            id = 13201, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel empire a conquis une grande partie de l'Asie au 13e siècle?", listOf("Ottoman", "Mongol", "Byzantin", "Perse"), "Histoire", "L'Empire mongol, sous la direction de Gengis Khan puis de ses successeurs, a étendu sa domination sur une vaste partie de l'Asie au 13e siècle, devenant le plus grand empire contigu de l'histoire."),
            en = LocalizedContent("Which empire conquered much of Asia in the 13th century?", listOf("Ottoman", "Mongol", "Byzantine", "Persian"), "History", "The Mongol Empire, under Genghis Khan and his successors, extended its dominance over a vast part of Asia in the 13th century, becoming the largest contiguous empire in history."),
            zh = LocalizedContent("哪个帝国在13世纪征服了亚洲大部分地区？", listOf("奥斯曼帝国", "蒙古帝国", "拜占庭帝国", "波斯帝国"), "历史", "蒙古帝国在成吉思汗及其后继者的领导下，于13世纪将其统治扩展到亚洲大部分地区，成为历史上最大的连续帝国。"),
            es = LocalizedContent("¿Qué imperio conquistó gran parte de Asia en el siglo XIII?", listOf("Otomano", "Mongol", "Bizantino", "Persa"), "Historia", "El Imperio Mongol, bajo Gengis Kan y sus sucesores, extendió su dominio sobre gran parte de Asia en el siglo XIII, convirtiéndose en el imperio contiguo más grande de la historia.")
        ),
        BilingualQuestion(
            id = 13202, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Genghis Khan fondateur de l'Empire mongol était?", listOf("Chinois", "Mongol", "Persan", "Turc"), "Histoire", "Genghis Khan est né dans une tribu mongole et a unifié les clans nomades de la région pour fonder l'Empire mongol au début du XIIIe siècle."),
            en = LocalizedContent("Genghis Khan, founder of the Mongol Empire, was?", listOf("Chinese", "Mongol", "Persian", "Turkic"), "History", "Genghis Khan was born into a Mongol tribe and united the nomadic clans of the region to found the Mongol Empire in the early 13th century."),
            zh = LocalizedContent("成吉思汗，蒙古帝国的创始人，是？", listOf("中国人", "蒙古人", "波斯人", "突厥人"), "历史", "成吉思汗出生于蒙古部落，统一了该地区的游牧部落，于13世纪初建立了蒙古帝国。"),
            es = LocalizedContent("Gengis Kan, fundador del Imperio Mongol, era?", listOf("Chino", "Mongol", "Persa", "Turco"), "Historia", "Gengis Kan nació en una tribu mongola y unió los clanes nómadas de la región para fundar el Imperio Mongol a principios del siglo XIII.")
        ),
        BilingualQuestion(
            id = 13203, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("La capitale historique de l'Empire ottoman était?", listOf("Ankara", "Constantinople", "Damas", "Le Caire"), "Histoire", "Constantinople, prise par les Ottomans en 1453, devint leur capitale jusqu’à la chute de l’empire en 1922."),
            en = LocalizedContent("The historical capital of the Ottoman Empire was?", listOf("Ankara", "Constantinople", "Damascus", "Cairo"), "History", "Constantinople, captured by the Ottomans in 1453, became their capital until the empire's fall in 1922."),
            zh = LocalizedContent("奥斯曼帝国的历史首都是？", listOf("安卡拉", "君士坦丁堡", "大马士革", "开罗"), "历史", "君士坦丁堡于1453年被奥斯曼人攻占，成为其首都，直至1922年帝国灭亡。"),
            es = LocalizedContent("La capital histórica del Imperio Otomano era?", listOf("Ankara", "Constantinopla", "Damasco", "El Cairo"), "Historia", "Constantinopla, tomada por los otomanos en 1453, se convirtió en su capital hasta la caída del imperio en 1922.")
        ),
        BilingualQuestion(
            id = 13204, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Le Japon féodal était gouverné par les?", listOf("Emirs", "Sultans", "Shoguns", "Khans"), "Histoire", "Au Japon féodal, l'empereur détenait un rôle symbolique tandis que le pouvoir militaire et politique était exercé par les shoguns, des chefs militaires héréditaires."),
            en = LocalizedContent("Feudal Japan was governed by the?", listOf("Emirs", "Sultans", "Shoguns", "Khans"), "History", "In feudal Japan, the emperor held a symbolic role while military and political power was exercised by the shoguns, hereditary military commanders."),
            zh = LocalizedContent("封建时期的日本由谁统治？", listOf("埃米尔", "苏丹", "幕府将军", "可汗"), "历史", "在封建日本，天皇拥有象征性角色，而军事和政治权力由世袭的军事指挥官幕府将军行使。"),
            es = LocalizedContent("El Japón feudal era gobernado por los?", listOf("Emires", "Sultanes", "Shogunes", "Khanes"), "Historia", "En el Japón feudal, el emperador tenía un papel simbólico mientras que el poder militar y político era ejercido por los shogunes, comandantes militares hereditarios.")
        ),
        BilingualQuestion(
            id = 13205, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("La période Edo du Japon a duré combien de siècles?", listOf("1", "2", "3", "4"), "Histoire", "La période Edo, marquée par le shogunat Tokugawa, a débuté en 1603 et s'est achevée en 1868, soit une durée d'environ deux siècles et demi."),
            en = LocalizedContent("How many centuries did the Edo period of Japan last?", listOf("1", "2", "3", "4"), "History", "The Edo period, marked by the Tokugawa shogunate, began in 1603 and ended in 1868, lasting about two and a half centuries."),
            zh = LocalizedContent("日本江户时代持续了几个世纪？", listOf("1", "2", "3", "4"), "历史", "江户时代以德川幕府为标志，始于1603年，结束于1868年，持续约两个半世纪。"),
            es = LocalizedContent("¿Cuántos siglos duró el período Edo de Japón?", listOf("1", "2", "3", "4"), "Historia", "El período Edo, marcado por el shogunato Tokugawa, comenzó en 1603 y terminó en 1868, durando aproximadamente dos siglos y medio.")
        ),
        BilingualQuestion(
            id = 13206, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("L'Empire byzantin était la continuation de quel empire?", listOf("Romain", "Perse", "Grec", "Ottoman"), "Histoire", "L'Empire byzantin est issu de la division de l'Empire romain en 395, avec sa capitale à Constantinople. Il a conservé les institutions et la culture romaines jusqu'à sa chute en 1453."),
            en = LocalizedContent("The Byzantine Empire was the continuation of which empire?", listOf("Roman", "Persian", "Greek", "Ottoman"), "History", "The Byzantine Empire emerged from the division of the Roman Empire in 395, with its capital in Constantinople. It preserved Roman institutions and culture until its fall in 1453."),
            zh = LocalizedContent("拜占庭帝国是哪个帝国的延续？", listOf("罗马帝国", "波斯帝国", "希腊帝国", "奥斯曼帝国"), "历史", "拜占庭帝国源于公元395年罗马帝国的分裂，首都为君士坦丁堡。它保留了罗马的制度和文化，直至1453年灭亡。"),
            es = LocalizedContent("El Imperio Bizantino era la continuación de qué imperio?", listOf("Romano", "Persa", "Griego", "Otomano"), "Historia", "El Imperio Bizantino surgió de la división del Imperio Romano en 395, con su capital en Constantinopla. Conservó las instituciones y la cultura romanas hasta su caída en 1453.")
        ),
        BilingualQuestion(
            id = 13207, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Constantinople tombée en 1453 marqua la fin de?", listOf("L'Empire ottoman", "L'Empire byzantin", "L'Empire mongol", "L'Empire romain"), "Histoire", "La chute de Constantinople en 1453, après le siège mené par les Ottomans, mit fin à l'Empire byzantin, dernier vestige de l'Empire romain d'Orient."),
            en = LocalizedContent("The fall of Constantinople in 1453 marked the end of?", listOf("The Ottoman Empire", "The Byzantine Empire", "The Mongol Empire", "The Roman Empire"), "History", "The fall of Constantinople in 1453, after the siege by the Ottomans, ended the Byzantine Empire, the last remnant of the Eastern Roman Empire."),
            zh = LocalizedContent("1453年君士坦丁堡的陷落标志着什么结束？", listOf("奥斯曼帝国", "拜占庭帝国", "蒙古帝国", "罗马帝国"), "历史", "1453年君士坦丁堡在奥斯曼人的围攻下陷落，结束了拜占庭帝国，这是东罗马帝国的最后残余。"),
            es = LocalizedContent("La caída de Constantinopla en 1453 marcó el fin de?", listOf("El Imperio Otomano", "El Imperio Bizantino", "El Imperio Mongol", "El Imperio Romano"), "Historia", "La caída de Constantinopla en 1453, tras el asedio otomano, puso fin al Imperio Bizantino, el último vestigio del Imperio Romano de Oriente.")
        ),
        BilingualQuestion(
            id = 13208, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel traité en 1648 termina la guerre de Trente Ans?", listOf("Westphalie", "Utrecht", "Nimègue", "Osnabrück"), "Histoire", "Les traités de Westphalie, signés en 1648, mirent fin à la guerre de Trente Ans en Europe, établissant un nouvel ordre politique basé sur la souveraineté des États."),
            en = LocalizedContent("Which treaty in 1648 ended the Thirty Years' War?", listOf("Westphalia", "Utrecht", "Nijmegen", "Osnabrück"), "History", "The Peace of Westphalia, signed in 1648, ended the Thirty Years' War in Europe, establishing a new political order based on state sovereignty."),
            zh = LocalizedContent("1648年哪个条约结束了三十年战争？", listOf("威斯特伐利亚和约", "乌得勒支和约", "奈梅亨和约", "奥斯纳布吕克和约"), "历史", "1648年签署的威斯特伐利亚和约结束了欧洲的三十年战争，建立了基于国家主权的新的政治秩序。"),
            es = LocalizedContent("¿Qué tratado en 1648 puso fin a la Guerra de los Treinta Años?", listOf("Westfalia", "Utrecht", "Nimega", "Osnabrück"), "Historia", "Los tratados de Westfalia, firmados en 1648, pusieron fin a la Guerra de los Treinta Años en Europa, estableciendo un nuevo orden político basado en la soberanía estatal.")
        ),
    )
}
