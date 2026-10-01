package com.prometheus.clq.data

import com.prometheus.clq.model.BilingualQuestion
import com.prometheus.clq.model.Difficulty
import com.prometheus.clq.model.Language
import com.prometheus.clq.model.LocalizedContent
import com.prometheus.clq.model.Question

/** Auto-generated batch 19 : 411 questions bilingues */
object QuestionsBilingualGenerated_19 {
    fun get(lang: Language = Language.FR): List<Question> = list.map { it.toQuestion(lang) }

    val list: List<BilingualQuestion> by lazy {
        part1() + part2() + part3() + part4() + part5() + part6()
    }

    private fun part1(): List<BilingualQuestion> = listOf(
        BilingualQuestion(
            id = 51681, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel animal a le plus long cou du monde?", listOf("Girafe", "Émeu", "Autruche", "Cygne"), "Nature", "L'autruche, bien qu'incapable de voler, possède le cou le plus long de tous les animaux, pouvant atteindre jusqu'à 1,8 mètre, ce qui lui permet de scruter l'horizon dans la savane africaine."),
            en = LocalizedContent("Which animal has the longest neck in the world?", listOf("Giraffe", "Emu", "Ostrich", "Swan"), "Nature", "The ostrich, although flightless, has the longest neck of any animal, reaching up to 1.8 meters, allowing it to scan the horizon in the African savanna."),
            zh = LocalizedContent("世界上哪种动物的脖子最长？", listOf("长颈鹿", "鸸鹋", "鸵鸟", "天鹅"), "自然", "鸵鸟虽然不会飞，但拥有所有动物中最长的脖子，可达1.8米，使其能在非洲大草原上眺望地平线。"),
            es = LocalizedContent("¿Qué animal tiene el cuello más largo del mundo?", listOf("Jirafa", "Emú", "Avestruz", "Cisne"), "Naturaleza", "El avestruz, aunque no puede volar, posee el cuello más largo de todos los animales, alcanzando hasta 1,8 metros, lo que le permite escudriñar el horizonte en la sabana africana.")
        ),
        BilingualQuestion(
            id = 51682, correctIndex = 3, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Combien de mètres mesure le cou d'une girafe?", listOf("1m", "1.5m", "2m", "2.5m"), "Nature", "Le cou d'une girafe mesure en moyenne 2,5 mètres, ce qui lui permet d'atteindre les feuilles des arbres les plus hauts. Cette adaptation unique est due à des vertèbres allongées, au nombre de sept comme chez l'humain."),
            en = LocalizedContent("How many meters is a giraffe's neck?", listOf("1m", "1.5m", "2m", "2.5m"), "Nature", "A giraffe's neck averages 2.5 meters, allowing it to reach the leaves of the tallest trees. This unique adaptation is due to elongated vertebrae, seven in number like humans."),
            zh = LocalizedContent("长颈鹿的脖子有多少米？", listOf("1米", "1.5米", "2米", "2.5米"), "自然", "长颈鹿的脖子平均长2.5米，使其能够够到最高树木的叶子。这种独特的适应源于延长的椎骨，数量与人类一样为七块。"),
            es = LocalizedContent("¿Cuántos metros mide el cuello de una jirafa?", listOf("1m", "1.5m", "2m", "2.5m"), "Naturaleza", "El cuello de una jirafa mide en promedio 2,5 metros, lo que le permite alcanzar las hojas de los árboles más altos. Esta adaptación única se debe a vértebras alargadas, siete en número como en los humanos.")
        ),
        BilingualQuestion(
            id = 51683, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel animal peut changer de couleur?", listOf("Serpent", "Caméléon", "Poisson", "Oiseau"), "Nature", "Le serpent ne change pas de couleur comme le caméléon ou la pieuvre, mais certaines espèces, comme le serpent des blés, peuvent légèrement modifier leur teinte selon la température ou l'humidité."),
            en = LocalizedContent("Which animal can change color?", listOf("Snake", "Chameleon", "Fish", "Bird"), "Nature", "Snakes do not change color like chameleons or octopuses, but some species, like the corn snake, can slightly alter their hue depending on temperature or humidity."),
            zh = LocalizedContent("哪种动物可以改变颜色？", listOf("蛇", "变色龙", "鱼", "鸟"), "自然", "蛇不像变色龙或章鱼那样改变颜色，但某些物种，如玉米蛇，可以根据温度或湿度略微改变其色调。"),
            es = LocalizedContent("¿Qué animal puede cambiar de color?", listOf("Serpiente", "Camaleón", "Pez", "Ave"), "Naturaleza", "La serpiente no cambia de color como el camaleón o el pulpo, pero algunas especies, como la serpiente del maíz, pueden modificar ligeramente su tono según la temperatura o la humedad.")
        ),
        BilingualQuestion(
            id = 51684, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En combien de secondes un caméléon change-t-il de couleur?", listOf("1s", "5s", "10s", "30s"), "Nature", "Le caméléon ne change pas de couleur instantanément : le processus prend environ 5 secondes, car il nécessite une redistribution des pigments dans ses cellules cutanées."),
            en = LocalizedContent("In how many seconds does a chameleon change color?", listOf("1s", "5s", "10s", "30s"), "Nature", "A chameleon does not change color instantly: the process takes about 5 seconds, as it requires redistribution of pigments in its skin cells."),
            zh = LocalizedContent("变色龙在几秒内改变颜色？", listOf("1秒", "5秒", "10秒", "30秒"), "自然", "变色龙不会瞬间改变颜色：这个过程大约需要5秒，因为它需要在其皮肤细胞中重新分布色素。"),
            es = LocalizedContent("¿En cuántos segundos cambia de color un camaleón?", listOf("1s", "5s", "10s", "30s"), "Naturaleza", "El camaleón no cambia de color instantáneamente: el proceso toma unos 5 segundos, ya que requiere una redistribución de pigmentos en sus células cutáneas.")
        ),
        BilingualQuestion(
            id = 51685, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plus gros amphibien jamais découvert?", listOf("Salamandre géante", "Grenouille goliath", "Crapaud géant", "Triton géant"), "Nature", "Le crapaud géant, ou Beelzebufo, vivait à Madagascar il y a environ 70 millions d'années et mesurait jusqu'à 40 centimètres, ce qui en fait le plus grand amphibien fossile connu."),
            en = LocalizedContent("What is the largest amphibian ever discovered?", listOf("Giant salamander", "Goliath frog", "Giant toad", "Giant newt"), "Nature", "The giant toad, or Beelzebufo, lived in Madagascar about 70 million years ago and measured up to 40 centimeters, making it the largest known fossil amphibian."),
            zh = LocalizedContent("有史以来发现的最大的两栖动物是什么？", listOf("大鲵", "歌利亚蛙", "巨蟾蜍", "巨蝾螈"), "自然", "巨蟾蜍，或称魔鬼蛙，生活在大约7000万年前的马达加斯加，体长可达40厘米，是已知最大的化石两栖动物。"),
            es = LocalizedContent("¿Cuál es el anfibio más grande jamás descubierto?", listOf("Salamandra gigante", "Rana goliat", "Sapo gigante", "Tritón gigante"), "Naturaleza", "El sapo gigante, o Beelzebufo, vivió en Madagascar hace unos 70 millones de años y medía hasta 40 centímetros, lo que lo convierte en el anfibio fósil más grande conocido.")
        ),
        BilingualQuestion(
            id = 51686, correctIndex = 3, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel animal a le système nerveux le plus complexe?", listOf("Dauphin", "Éléphant", "Pieuvre", "Humain"), "Nature", "Le cerveau humain contient environ 86 milliards de neurones, formant un réseau d'une complexité inégalée dans le règne animal."),
            en = LocalizedContent("Which animal has the most complex nervous system?", listOf("Dolphin", "Elephant", "Octopus", "Human"), "Nature", "The human brain contains about 86 billion neurons, forming a network of unparalleled complexity in the animal kingdom."),
            zh = LocalizedContent("哪种动物的神经系统最复杂？", listOf("海豚", "大象", "章鱼", "人类"), "自然", "人类大脑约有860亿个神经元，形成了动物王国中无与伦比的复杂网络。"),
            es = LocalizedContent("¿Qué animal tiene el sistema nervioso más complejo?", listOf("Delfín", "Elefante", "Pulpo", "Humano"), "Naturaleza", "El cerebro humano contiene alrededor de 86 mil millones de neuronas, formando una red de complejidad sin igual en el reino animal.")
        ),
        BilingualQuestion(
            id = 51687, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Combien de sens les humains possèdent-ils?", listOf("3", "4", "5", "7"), "Nature", "La croyance populaire en cinq sens (vue, ouïe, toucher, goût, odorat) est une simplification. La science en reconnaît davantage, comme la proprioception et l'équilibre, mais le nombre exact varie selon les classifications."),
            en = LocalizedContent("How many senses do humans have?", listOf("3", "4", "5", "7"), "Nature", "The popular belief in five senses (sight, hearing, touch, taste, smell) is a simplification. Science recognizes more, such as proprioception and balance, but the exact number varies by classification."),
            zh = LocalizedContent("人类有多少种感觉？", listOf("3", "4", "5", "7"), "自然", "五种感觉（视觉、听觉、触觉、味觉、嗅觉）的普遍认知是一种简化。科学承认更多，如本体感觉和平衡感，但确切数量因分类而异。"),
            es = LocalizedContent("¿Cuántos sentidos poseen los humanos?", listOf("3", "4", "5", "7"), "Naturaleza", "La creencia popular de cinco sentidos (vista, oído, tacto, gusto, olfato) es una simplificación. La ciencia reconoce más, como la propiocepción y el equilibrio, pero el número exacto varía según las clasificaciones.")
        ),
        BilingualQuestion(
            id = 51688, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est l'animal avec le plus grand nombre de dents?", listOf("Requin", "Hippopotame", "Crocodile", "Escargot"), "Nature", "L'hippopotame possède jusqu'à 40 dents, mais ce sont principalement ses grandes canines et incisives qui impressionnent."),
            en = LocalizedContent("Which animal has the largest number of teeth?", listOf("Shark", "Hippopotamus", "Crocodile", "Snail"), "Nature", "The hippopotamus has up to 40 teeth, but it is mainly its large canines and incisors that impress."),
            zh = LocalizedContent("哪种动物的牙齿数量最多？", listOf("鲨鱼", "河马", "鳄鱼", "蜗牛"), "自然", "河马有多达40颗牙齿，但主要是其巨大的犬齿和门齿令人印象深刻。"),
            es = LocalizedContent("¿Qué animal tiene el mayor número de dientes?", listOf("Tiburón", "Hipopótamo", "Cocodrilo", "Caracol"), "Naturaleza", "El hipopótamo posee hasta 40 dientes, pero son principalmente sus grandes caninos e incisivos los que impresionan.")
        ),
        BilingualQuestion(
            id = 51689, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Combien de dents a un escargot?", listOf("100", "1000", "10000", "20000"), "Nature", "Les escargots possèdent une radula, une langue râpeuse couverte de milliers de petites dents chitineuses, pouvant atteindre environ 10 000 dents selon les espèces."),
            en = LocalizedContent("How many teeth does a snail have?", listOf("100", "1000", "10000", "20000"), "Nature", "Snails have a radula, a rasping tongue covered with thousands of tiny chitinous teeth, which can reach about 10,000 teeth depending on the species."),
            zh = LocalizedContent("蜗牛有多少颗牙齿？", listOf("100", "1000", "10000", "20000"), "自然", "蜗牛有齿舌，一种覆盖着数千颗微小几丁质牙齿的锉状舌头，根据物种不同可达约10000颗牙齿。"),
            es = LocalizedContent("¿Cuántos dientes tiene un caracol?", listOf("100", "1000", "10000", "20000"), "Naturaleza", "Los caracoles poseen una rádula, una lengua raspadora cubierta de miles de pequeños dientes quitinosos, que puede alcanzar alrededor de 10.000 dientes según la especie.")
        ),
        BilingualQuestion(
            id = 51690, correctIndex = 3, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel insecte peut sauter le plus haut?", listOf("Sauterelle", "Puce", "Criquet", "Cicada"), "Nature", "La cigale (cicada) peut sauter jusqu'à 70 centimètres de haut, soit environ 100 fois sa taille, grâce à ses puissantes pattes arrière."),
            en = LocalizedContent("Which insect can jump the highest?", listOf("Grasshopper", "Flea", "Locust", "Cicada"), "Nature", "The cicada can jump up to 70 centimeters high, about 100 times its body length, thanks to its powerful hind legs."),
            zh = LocalizedContent("哪种昆虫跳得最高？", listOf("蚱蜢", "跳蚤", "蝗虫", "蝉"), "自然", "蝉可以跳高达70厘米，约是其体长的100倍，这得益于其强壮的后腿。"),
            es = LocalizedContent("¿Qué insecto puede saltar más alto?", listOf("Saltamontes", "Pulga", "Langosta", "Cigarra"), "Naturaleza", "La cigarra puede saltar hasta 70 centímetros de alto, unas 100 veces su longitud corporal, gracias a sus poderosas patas traseras.")
        ),
        BilingualQuestion(
            id = 51691, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Combien de fois sa taille peut sauter une puce?", listOf("10x", "50x", "100x", "200x"), "Nature", "Les puces peuvent sauter jusqu'à 200 fois leur propre longueur, mais en hauteur, elles atteignent environ 10 fois leur taille grâce à leurs pattes arrière puissantes."),
            en = LocalizedContent("How many times its size can a flea jump?", listOf("10x", "50x", "100x", "200x"), "Nature", "Fleas can jump up to 200 times their own length, but in height they reach about 10 times their size thanks to their powerful hind legs."),
            zh = LocalizedContent("跳蚤能跳多高（相当于自身尺寸的多少倍）？", listOf("10倍", "50倍", "100倍", "200倍"), "自然", "跳蚤可以跳到自己身长的200倍，但在高度上，凭借强壮的后腿，它们能达到约自身尺寸的10倍。"),
            es = LocalizedContent("¿Cuántas veces su tamaño puede saltar una pulga?", listOf("10x", "50x", "100x", "200x"), "Naturaleza", "Las pulgas pueden saltar hasta 200 veces su propia longitud, pero en altura alcanzan aproximadamente 10 veces su tamaño gracias a sus poderosas patas traseras.")
        ),
        BilingualQuestion(
            id = 51692, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel animal peut transformer l'énergie solaire en électricité?", listOf("Anguille électrique", "Poisson électrique", "Raie électrique", "Aucun"), "Nature", "Le poisson électrique, comme l'anguille électrique, génère de l'électricité via des cellules spécialisées, mais il ne transforme pas l'énergie solaire. Cette capacité est propre aux plantes et à certains micro-organismes via la photosynthèse."),
            en = LocalizedContent("Which animal can convert solar energy into electricity?", listOf("Electric eel", "Electric fish", "Electric ray", "None"), "Nature", "Electric fish, like the electric eel, generate electricity via specialized cells, but they do not convert solar energy. This ability is unique to plants and some microorganisms through photosynthesis."),
            zh = LocalizedContent("哪种动物能将太阳能转化为电能？", listOf("电鳗", "电鱼", "电鳐", "没有"), "自然", "电鱼（如电鳗）通过特化细胞发电，但它们并不转化太阳能。这种能力是植物和一些微生物通过光合作用独有的。"),
            es = LocalizedContent("¿Qué animal puede convertir la energía solar en electricidad?", listOf("Anguila eléctrica", "Pez eléctrico", "Raya eléctrica", "Ninguno"), "Naturaleza", "El pez eléctrico, como la anguila eléctrica, genera electricidad a través de células especializadas, pero no convierte la energía solar. Esta capacidad es propia de las plantas y algunos microorganismos mediante la fotosíntesis.")
        ),
        BilingualQuestion(
            id = 51693, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Combien de volts peut générer une anguille électrique?", listOf("100V", "200V", "400V", "800V"), "Nature", "L'anguille électrique peut générer jusqu'à 400 volts pour se défendre ou étourdir ses proies, ce qui est suffisant pour paralyser un humain adulte."),
            en = LocalizedContent("How many volts can an electric eel generate?", listOf("100V", "200V", "400V", "800V"), "Nature", "The electric eel can generate up to 400 volts to defend itself or stun its prey, enough to paralyze an adult human."),
            zh = LocalizedContent("电鳗能产生多少伏特的电压？", listOf("100伏", "200伏", "400伏", "800伏"), "自然", "电鳗能产生高达400伏的电压用于自卫或击晕猎物，足以麻痹一个成年人。"),
            es = LocalizedContent("¿Cuántos voltios puede generar una anguila eléctrica?", listOf("100V", "200V", "400V", "800V"), "Naturaleza", "La anguila eléctrica puede generar hasta 400 voltios para defenderse o aturdir a sus presas, suficiente para paralizar a un humano adulto.")
        ),
        BilingualQuestion(
            id = 51694, correctIndex = 3, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plus vieux animal jamais découvert?", listOf("Tortue", "Requin", "Turritopsis dohrnii", "Baleine"), "Nature", "Le plus vieil animal jamais découvert est une baleine boréale, dont l'âge a été estimé à 211 ans grâce à l'analyse de ses tissus oculaires."),
            en = LocalizedContent("What is the oldest animal ever discovered?", listOf("Turtle", "Shark", "Turritopsis dohrnii", "Whale"), "Nature", "The oldest animal ever discovered is a bowhead whale, estimated to be 211 years old through analysis of its eye tissue."),
            zh = LocalizedContent("有史以来发现的最长寿动物是什么？", listOf("乌龟", "鲨鱼", "灯塔水母", "鲸鱼"), "自然", "有史以来发现的最长寿动物是一头弓头鲸，通过对其眼组织的分析，估计其年龄为211岁。"),
            es = LocalizedContent("¿Cuál es el animal más viejo jamás descubierto?", listOf("Tortuga", "Tiburón", "Turritopsis dohrnii", "Ballena"), "Naturaleza", "El animal más viejo jamás descubierto es una ballena boreal, cuya edad se estimó en 211 años mediante el análisis de sus tejidos oculares.")
        ),
        BilingualQuestion(
            id = 51695, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Combien d'années peut vivre une tortue?", listOf("50", "100", "150", "300"), "Nature", "Les tortues terrestres géantes des Galápagos peuvent vivre plus de 100 ans, mais la plupart des espèces de tortues communes atteignent environ 50 ans en moyenne."),
            en = LocalizedContent("How many years can a turtle live?", listOf("50", "100", "150", "300"), "Nature", "Giant Galápagos tortoises can live over 100 years, but most common turtle species average about 50 years."),
            zh = LocalizedContent("乌龟能活多少年？", listOf("50", "100", "150", "300"), "自然", "加拉帕戈斯象龟能活100年以上，但大多数常见龟类平均寿命约为50年。"),
            es = LocalizedContent("¿Cuántos años puede vivir una tortuga?", listOf("50", "100", "150", "300"), "Naturaleza", "Las tortugas gigantes de Galápagos pueden vivir más de 100 años, pero la mayoría de las especies de tortugas comunes alcanzan unos 50 años en promedio.")
        ),
        BilingualQuestion(
            id = 51696, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel animal peut vivre le plus vieux dans le monde sauvage?", listOf("Tortue", "Baleine", "Perroquet", "Humain"), "Nature", "La baleine boréale peut vivre plus de 200 ans, ce qui en fait le mammifère le plus longévif connu dans la nature."),
            en = LocalizedContent("Which animal can live the longest in the wild?", listOf("Turtle", "Whale", "Parrot", "Human"), "Nature", "The bowhead whale can live over 200 years, making it the longest-lived mammal known in the wild."),
            zh = LocalizedContent("哪种动物在野外寿命最长？", listOf("乌龟", "鲸鱼", "鹦鹉", "人类"), "自然", "弓头鲸能活200年以上，是已知野外寿命最长的哺乳动物。"),
            es = LocalizedContent("¿Qué animal puede vivir más tiempo en la naturaleza?", listOf("Tortuga", "Ballena", "Loro", "Humano"), "Naturaleza", "La ballena boreal puede vivir más de 200 años, lo que la convierte en el mamífero más longevo conocido en la naturaleza.")
        ),
        BilingualQuestion(
            id = 51697, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est l'arbre le plus vieux du monde?", listOf("Cyprès", "Pin de Bristlecone", "Sequoia", "Châtaignier"), "Nature", "Le séquoia géant de Californie, surnommé Mathusalem, est considéré comme l'arbre le plus vieux du monde avec environ 4 850 ans."),
            en = LocalizedContent("What is the oldest tree in the world?", listOf("Cypress", "Bristlecone pine", "Sequoia", "Chestnut"), "Nature", "The giant sequoia of California, nicknamed Methuselah, is considered the oldest tree in the world at about 4,850 years."),
            zh = LocalizedContent("世界上最古老的树是什么？", listOf("柏树", "刺果松", "红杉", "栗树"), "自然", "加利福尼亚的巨型红杉，绰号“玛土撒拉”，被认为是世界上最古老的树，约有4850年历史。"),
            es = LocalizedContent("¿Cuál es el árbol más viejo del mundo?", listOf("Ciprés", "Pino de Bristlecone", "Secuoya", "Castaño"), "Naturaleza", "La secuoya gigante de California, apodada Matusalén, es considerada el árbol más viejo del mundo con unos 4.850 años.")
        ),
        BilingualQuestion(
            id = 51698, correctIndex = 3, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Combien d'années a l'arbre le plus vieux du monde?", listOf("3000", "4000", "5000", "6000"), "Nature", "Le plus vieil arbre connu est un épicéa nommé Old Tjikko, âgé d'environ 9 550 ans, mais le spécimen non clonal le plus vieux est un pin de Bristlecone âgé de plus de 4 800 ans. La réponse 6000 ans pourrait correspondre à une estimation pour un arbre clonal comme le Pando."),
            en = LocalizedContent("How old is the oldest tree in the world?", listOf("3000", "4000", "5000", "6000"), "Nature", "The oldest known tree is a spruce named Old Tjikko, about 9,550 years old, but the oldest non-clonal specimen is a bristlecone pine over 4,800 years old. The answer 6000 years might correspond to an estimate for a clonal tree like Pando."),
            zh = LocalizedContent("世界上最古老的树有多少年？", listOf("3000", "4000", "5000", "6000"), "自然", "已知最古老的树是一棵名为“Old Tjikko”的云杉，约9550年，但最古老的非克隆标本是一棵超过4800年的刺果松。答案6000年可能对应像“潘多”这样的克隆树的估计。"),
            es = LocalizedContent("¿Cuántos años tiene el árbol más viejo del mundo?", listOf("3000", "4000", "5000", "6000"), "Naturaleza", "El árbol más viejo conocido es un abeto llamado Old Tjikko, de unos 9.550 años, pero el espécimen no clonal más viejo es un pino de Bristlecone de más de 4.800 años. La respuesta de 6000 años podría corresponder a una estimación para un árbol clonal como Pando.")
        ),
        BilingualQuestion(
            id = 51699, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel animal a la meilleure audition?", listOf("Chauve-souris", "Dauphin", "Chien", "Oreille humaine"), "Nature", "Les chauves-souris utilisent l'écholocation, émettant des ultrasons pour naviguer et chasser dans l'obscurité, ce qui leur confère une ouïe extrêmement développée."),
            en = LocalizedContent("Which animal has the best hearing?", listOf("Bat", "Dolphin", "Dog", "Human ear"), "Nature", "Bats use echolocation, emitting ultrasound to navigate and hunt in the dark, giving them extremely developed hearing."),
            zh = LocalizedContent("哪种动物听力最好？", listOf("蝙蝠", "海豚", "狗", "人耳"), "自然", "蝙蝠利用回声定位，发出超声波在黑暗中导航和捕猎，这使它们拥有极其发达的听觉。"),
            es = LocalizedContent("¿Qué animal tiene la mejor audición?", listOf("Murciélago", "Delfín", "Perro", "Oído humano"), "Naturaleza", "Los murciélagos usan la ecolocalización, emitiendo ultrasonidos para navegar y cazar en la oscuridad, lo que les confiere un oído extremadamente desarrollado.")
        ),
        BilingualQuestion(
            id = 51700, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("À quelle fréquence les dauphins peuvent-ils entendre?", listOf("20 kHz", "50 kHz", "100 kHz", "150 kHz"), "Nature", "Les dauphins perçoivent des ultrasons jusqu'à 50 kHz, bien au-delà des 20 kHz de l'oreille humaine, ce qui leur permet de communiquer et de chasser par écholocalisation."),
            en = LocalizedContent("At what frequency can dolphins hear?", listOf("20 kHz", "50 kHz", "100 kHz", "150 kHz"), "Nature", "Dolphins perceive ultrasound up to 50 kHz, far beyond the 20 kHz of the human ear, allowing them to communicate and hunt via echolocation."),
            zh = LocalizedContent("海豚能听到多高频率的声音？", listOf("20千赫", "50千赫", "100千赫", "150千赫"), "自然", "海豚能感知高达50千赫的超声波，远超人耳的20千赫，使它们能够通过回声定位进行交流和捕猎。"),
            es = LocalizedContent("¿A qué frecuencia pueden oír los delfines?", listOf("20 kHz", "50 kHz", "100 kHz", "150 kHz"), "Naturaleza", "Los delfines perciben ultrasonidos de hasta 50 kHz, muy por encima de los 20 kHz del oído humano, lo que les permite comunicarse y cazar mediante ecolocalización.")
        ),
        BilingualQuestion(
            id = 51701, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est l'animal le plus vénimeux au monde?", listOf("Cobra royal", "Serpent brun", "Méduse-boîte", "Grenouille poison"), "Nature", "La méduse-boîte possède un venin extrêmement puissant qui peut tuer un humain en quelques minutes, ce qui en fait l'animal le plus vénimeux au monde."),
            en = LocalizedContent("What is the most venomous animal in the world?", listOf("King cobra", "Brown snake", "Box jellyfish", "Poison dart frog"), "Nature", "The box jellyfish has extremely potent venom that can kill a human in minutes, making it the most venomous animal in the world."),
            zh = LocalizedContent("世界上毒性最强的动物是什么？", listOf("眼镜王蛇", "棕蛇", "箱形水母", "箭毒蛙"), "自然", "箱形水母拥有极其强烈的毒液，能在几分钟内杀死一个人，因此它是世界上毒性最强的动物。"),
            es = LocalizedContent("¿Cuál es el animal más venenoso del mundo?", listOf("Cobra real", "Serpiente parda", "Medusa de caja", "Rana venenosa"), "Naturaleza", "La medusa de caja posee un veneno extremadamente potente que puede matar a un humano en minutos, lo que la convierte en el animal más venenoso del mundo.")
        ),
        BilingualQuestion(
            id = 51702, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de grenouilles poison faudrait-il pour tuer un humain?", listOf("1", "5", "10", "100"), "Nature", "Les grenouilles poison des flèches sécrètent une toxine puissante, la batrachotoxine. Une seule grenouille dorée contient assez de poison pour tuer 10 hommes adultes, donc 100 seraient une surestimation massive."),
            en = LocalizedContent("How many poison dart frogs would it take to kill a human?", listOf("1", "5", "10", "100"), "Nature", "Poison dart frogs secrete a powerful toxin, batrachotoxin. A single golden poison frog contains enough poison to kill 10 adult men, so 100 would be a massive overestimation."),
            zh = LocalizedContent("需要多少只箭毒蛙才能杀死一个人？", listOf("1", "5", "10", "100"), "自然", "箭毒蛙分泌一种强效毒素——蛙毒素。一只金色箭毒蛙所含的毒素足以杀死10名成年男性，因此100只是严重高估。"),
            es = LocalizedContent("¿Cuántas ranas venenosas se necesitarían para matar a un humano?", listOf("1", "5", "10", "100"), "Naturaleza", "Las ranas venenosas secretan una toxina potente, la batracotoxina. Una sola rana dorada contiene suficiente veneno para matar a 10 hombres adultos, por lo que 100 serían una sobreestimación masiva.")
        ),
        BilingualQuestion(
            id = 51703, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand écosystème du monde?", listOf("Amazonie", "Forêt du Congo", "Taïga", "Récif de corail"), "Nature", "L'Amazonie est souvent considérée comme le plus grand écosystème du monde en raison de sa forêt tropicale humide qui s'étend sur environ 6,7 millions de kilomètres carrés, abritant une biodiversité exceptionnelle."),
            en = LocalizedContent("What is the largest ecosystem in the world?", listOf("Amazon", "Congo Forest", "Taiga", "Coral reef"), "Nature", "The Amazon is often considered the largest ecosystem in the world due to its rainforest spanning about 6.7 million square kilometers, hosting exceptional biodiversity."),
            zh = LocalizedContent("世界上最大的生态系统是什么？", listOf("亚马逊", "刚果森林", "泰加林", "珊瑚礁"), "自然", "亚马逊常被认为是世界上最大的生态系统，其热带雨林面积约670万平方公里，拥有非凡的生物多样性。"),
            es = LocalizedContent("¿Cuál es el ecosistema más grande del mundo?", listOf("Amazonía", "Bosque del Congo", "Taiga", "Arrecife de coral"), "Naturaleza", "La Amazonía es a menudo considerada el ecosistema más grande del mundo debido a su selva tropical que se extiende por aproximadamente 6,7 millones de kilómetros cuadrados, albergando una biodiversidad excepcional.")
        ),
        BilingualQuestion(
            id = 51704, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien d'espèces animales vivent en Amazonie?", listOf("1 million", "5 millions", "10 millions", "20 millions"), "Nature", "L'Amazonie abrite environ 5 millions d'espèces animales, ce qui en fait l'écosystème le plus riche en biodiversité de la planète."),
            en = LocalizedContent("How many animal species live in the Amazon?", listOf("1 million", "5 million", "10 million", "20 million"), "Nature", "The Amazon is home to about 5 million animal species, making it the most biodiverse ecosystem on the planet."),
            zh = LocalizedContent("亚马逊生活着多少种动物？", listOf("100万", "500万", "1000万", "2000万"), "自然", "亚马逊约有500万种动物，使其成为地球上生物多样性最丰富的生态系统。"),
            es = LocalizedContent("¿Cuántas especies animales viven en la Amazonía?", listOf("1 millón", "5 millones", "10 millones", "20 millones"), "Naturaleza", "La Amazonía alberga alrededor de 5 millones de especies animales, lo que la convierte en el ecosistema con mayor biodiversidad del planeta.")
        ),
        BilingualQuestion(
            id = 51705, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est l'animal terrestre avec la plus grande portée de saut?", listOf("Kangourou", "Léopard", "Lion", "Cerf"), "Nature", "Le lion peut sauter jusqu'à 11 mètres de long en un bond, ce qui est la plus grande portée de saut parmi les animaux terrestres."),
            en = LocalizedContent("Which land animal has the longest jump range?", listOf("Kangaroo", "Leopard", "Lion", "Deer"), "Nature", "The lion can jump up to 11 meters in length in a single bound, which is the longest jump range among land animals."),
            zh = LocalizedContent("哪种陆地动物的跳跃距离最远？", listOf("袋鼠", "豹", "狮子", "鹿"), "自然", "狮子一次跳跃可达11米远，是陆地动物中跳跃距离最远的。"),
            es = LocalizedContent("¿Qué animal terrestre tiene el mayor alcance de salto?", listOf("Canguro", "Leopardo", "León", "Ciervo"), "Naturaleza", "El león puede saltar hasta 11 metros de largo en un solo salto, lo que constituye el mayor alcance de salto entre los animales terrestres.")
        ),
        BilingualQuestion(
            id = 51706, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("À quelle distance un kangourou peut-il sauter?", listOf("5m", "10m", "15m", "25m"), "Nature", "Les kangourous roux peuvent parcourir jusqu'à 8 mètres en un seul bond, mais des sauts exceptionnels de 13 mètres ont été observés. Le record de 25 mètres mentionné est une donnée rare et non confirmée scientifiquement."),
            en = LocalizedContent("How far can a kangaroo jump?", listOf("5m", "10m", "15m", "25m"), "Nature", "Red kangaroos can cover up to 8 meters in a single bound, but exceptional jumps of 13 meters have been observed. The 25-meter record mentioned is rare and not scientifically confirmed."),
            zh = LocalizedContent("袋鼠能跳多远？", listOf("5米", "10米", "15米", "25米"), "自然", "红袋鼠一次跳跃可达8米，但曾观察到13米的例外跳跃。提到的25米记录罕见且未经科学证实。"),
            es = LocalizedContent("¿Qué distancia puede saltar un canguro?", listOf("5m", "10m", "15m", "25m"), "Naturaleza", "Los canguros rojos pueden cubrir hasta 8 metros en un solo salto, pero se han observado saltos excepcionales de 13 metros. El récord de 25 metros mencionado es raro y no está confirmado científicamente.")
        ),
        BilingualQuestion(
            id = 51707, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel animal peut vivre sans eau le plus longtemps?", listOf("Chameau", "Koudou", "Oryx", "Girafe"), "Nature", "Le chameau peut survivre jusqu'à deux semaines sans eau grâce à ses bosses qui stockent des réserves de graisse et à son métabolisme adapté à la déshydratation."),
            en = LocalizedContent("Which animal can live the longest without water?", listOf("Camel", "Kudu", "Oryx", "Giraffe"), "Nature", "The camel can survive up to two weeks without water thanks to its humps storing fat reserves and its metabolism adapted to dehydration."),
            zh = LocalizedContent("哪种动物能在没有水的情况下存活最久？", listOf("骆驼", "捻角羚", "剑羚", "长颈鹿"), "自然", "骆驼可以长达两周不喝水，这得益于其驼峰储存脂肪储备以及适应脱水的新陈代谢。"),
            es = LocalizedContent("¿Qué animal puede vivir más tiempo sin agua?", listOf("Camello", "Kudú", "Órice", "Jirafa"), "Naturaleza", "El camello puede sobrevivir hasta dos semanas sin agua gracias a sus jorobas que almacenan reservas de grasa y a su metabolismo adaptado a la deshidratación.")
        ),
        BilingualQuestion(
            id = 51708, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien d'années un oryx peut-il survivre sans eau?", listOf("1", "3", "5", "10"), "Nature", "L'oryx peut survivre jusqu'à trois ans sans boire, car il tire l'eau nécessaire de la végétation qu'il consomme et adapte son métabolisme pour limiter les pertes hydriques."),
            en = LocalizedContent("How many years can an oryx survive without water?", listOf("1", "3", "5", "10"), "Nature", "The oryx can survive up to three years without drinking, as it obtains necessary water from the vegetation it consumes and adapts its metabolism to limit water loss."),
            zh = LocalizedContent("剑羚能在没有水的情况下存活多少年？", listOf("1", "3", "5", "10"), "自然", "剑羚可以长达三年不喝水，因为它从所食用的植物中获取所需水分，并调整新陈代谢以减少水分流失。"),
            es = LocalizedContent("¿Cuántos años puede sobrevivir un órice sin agua?", listOf("1", "3", "5", "10"), "Naturaleza", "El órice puede sobrevivir hasta tres años sin beber, ya que obtiene el agua necesaria de la vegetación que consume y adapta su metabolismo para limitar la pérdida de agua.")
        ),
        BilingualQuestion(
            id = 51710, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de kilomètres carrés fait le Sahara?", listOf("5 millions", "8 millions", "12 millions", "15 millions"), "Nature", "Le Sahara est le plus grand désert chaud du monde, couvrant environ 9,2 millions de kilomètres carrés, soit près de 15 millions si l'on inclut les zones désertiques adjacentes."),
            en = LocalizedContent("How many square kilometers is the Sahara?", listOf("5 million", "8 million", "12 million", "15 million"), "Nature", "The Sahara is the largest hot desert in the world, covering about 9.2 million square kilometers, or nearly 15 million if adjacent desert areas are included."),
            zh = LocalizedContent("撒哈拉沙漠有多少平方公里？", listOf("500万", "800万", "1200万", "1500万"), "自然", "撒哈拉沙漠是世界上最大的热沙漠，面积约920万平方公里，如果包括相邻的沙漠地区则接近1500万平方公里。"),
            es = LocalizedContent("¿Cuántos kilómetros cuadrados tiene el Sáhara?", listOf("5 millones", "8 millones", "12 millones", "15 millones"), "Naturaleza", "El Sáhara es el desierto cálido más grande del mundo, cubriendo aproximadamente 9,2 millones de kilómetros cuadrados, o casi 15 millones si se incluyen las zonas desérticas adyacentes.")
        ),
        BilingualQuestion(
            id = 51711, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand réservoir d'eau douce du monde?", listOf("Lac Baïkal", "Grands Lacs", "Lac Victoria", "Lac Tanganyika"), "Nature", "Le lac Baïkal, en Sibérie, contient environ 20 % des eaux douces non gelées de la planète, ce qui en fait le plus grand réservoir d'eau douce liquide au monde."),
            en = LocalizedContent("What is the largest freshwater reservoir in the world?", listOf("Lake Baikal", "Great Lakes", "Lake Victoria", "Lake Tanganyika"), "Nature", "Lake Baikal in Siberia contains about 20% of the world's unfrozen freshwater, making it the largest liquid freshwater reservoir on Earth."),
            zh = LocalizedContent("世界上最大的淡水水库是什么？", listOf("贝加尔湖", "五大湖", "维多利亚湖", "坦噶尼喀湖"), "自然", "西伯利亚的贝加尔湖拥有全球约20%的未冻结淡水，是地球上最大的液态淡水水库。"),
            es = LocalizedContent("¿Cuál es el mayor reservorio de agua dulce del mundo?", listOf("Lago Baikal", "Grandes Lagos", "Lago Victoria", "Lago Tanganica"), "Naturaleza", "El lago Baikal en Siberia contiene aproximadamente el 20% del agua dulce no congelada del mundo, lo que lo convierte en el mayor reservorio de agua dulce líquida de la Tierra.")
        ),
        BilingualQuestion(
            id = 51712, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de pour cent de l'eau douce mondiale se trouve au Baïkal?", listOf("10%", "20%", "30%", "40%"), "Nature", "Le lac Baïkal est le plus grand réservoir d'eau douce liquide de la planète, contenant environ 20 % des réserves mondiales."),
            en = LocalizedContent("What percentage of the world's fresh water is found in Lake Baikal?", listOf("10%", "20%", "30%", "40%"), "Nature", "Lake Baikal is the largest reservoir of liquid fresh water on the planet, containing about 20% of the world's reserves."),
            zh = LocalizedContent("贝加尔湖拥有全球淡水资源的百分之多少？", listOf("10%", "20%", "30%", "40%"), "自然", "贝加尔湖是地球上最大的液态淡水水库，约占全球淡水储量的20%。"),
            es = LocalizedContent("¿Qué porcentaje del agua dulce del mundo se encuentra en el Baikal?", listOf("10%", "20%", "30%", "40%"), "Naturaleza", "El lago Baikal es el mayor depósito de agua dulce líquida del planeta, conteniendo aproximadamente el 20% de las reservas mundiales.")
        ),
        BilingualQuestion(
            id = 51713, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel animal peut manger le plus de nourriture en une journée?", listOf("Baleine", "Éléphant", "Hippopotame", "Requin"), "Nature", "L'hippopotame peut consommer jusqu'à 40 kg d'herbe par jour, ce qui en fait l'un des plus gros mangeurs terrestres en une seule journée."),
            en = LocalizedContent("Which animal can eat the most food in one day?", listOf("Whale", "Elephant", "Hippopotamus", "Shark"), "Nature", "The hippopotamus can consume up to 40 kg of grass per day, making it one of the largest terrestrial eaters in a single day."),
            zh = LocalizedContent("哪种动物一天能吃掉最多的食物？", listOf("鲸鱼", "大象", "河马", "鲨鱼"), "自然", "河马每天能吃掉多达40公斤的草，使其成为单日食量最大的陆生动物之一。"),
            es = LocalizedContent("¿Qué animal puede comer más comida en un día?", listOf("Ballena", "Elefante", "Hipopótamo", "Tiburón"), "Naturaleza", "El hipopótamo puede consumir hasta 40 kg de hierba al día, lo que lo convierte en uno de los mayores comedores terrestres en un solo día.")
        ),
        BilingualQuestion(
            id = 51714, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de kilos une baleine peut-elle manger par jour?", listOf("2000", "5000", "8000", "10000"), "Nature", "Une baleine bleue adulte peut consommer jusqu'à 4 tonnes de krill par jour, soit environ 10 000 kilos, pour subvenir à ses besoins énergétiques massifs."),
            en = LocalizedContent("How many kilograms can a whale eat per day?", listOf("2000", "5000", "8000", "10000"), "Nature", "An adult blue whale can consume up to 4 tons of krill per day, which is about 10,000 kilograms, to meet its massive energy needs."),
            zh = LocalizedContent("一头鲸鱼每天能吃多少公斤食物？", listOf("2000", "5000", "8000", "10000"), "自然", "一头成年蓝鲸每天能吃掉多达4吨磷虾，约合10000公斤，以满足其巨大的能量需求。"),
            es = LocalizedContent("¿Cuántos kilogramos puede comer una ballena al día?", listOf("2000", "5000", "8000", "10000"), "Naturaleza", "Una ballena azul adulta puede consumir hasta 4 toneladas de krill al día, aproximadamente 10.000 kilogramos, para satisfacer sus enormes necesidades energéticas.")
        ),
        BilingualQuestion(
            id = 51716, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de mètres peut mesurer une crinière du lion?", listOf("10m", "20m", "30m", "50m"), "Nature", "La crinière du lion peut atteindre jusqu'à 20 mètres de long, mais il s'agit en réalité d'une méduse, la Cyanea capillata, et non du mammifère."),
            en = LocalizedContent("How many meters can a lion's mane measure?", listOf("10m", "20m", "30m", "50m"), "Nature", "The lion's mane can reach up to 20 meters in length, but it is actually a jellyfish, Cyanea capillata, not the mammal."),
            zh = LocalizedContent("狮鬃水母的触手能有多长？", listOf("10米", "20米", "30米", "50米"), "自然", "狮鬃水母的触手可达20米长，但实际上这是一种水母（Cyanea capillata），而非哺乳动物。"),
            es = LocalizedContent("¿Cuántos metros puede medir una melena de león?", listOf("10m", "20m", "30m", "50m"), "Naturaleza", "La melena de león puede alcanzar hasta 20 metros de largo, pero en realidad se trata de una medusa, Cyanea capillata, no del mamífero.")
        ),
        BilingualQuestion(
            id = 51717, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel animal a le plus grand nombre de dents adultes?", listOf("Requin blanc", "Hippopotame", "Crocodile", "Éléphant"), "Nature", "Le crocodile peut avoir jusqu'à 80 dents à l'âge adulte, et il les renouvelle plusieurs fois dans sa vie, ce qui en fait le mammifère avec le plus grand nombre de dents."),
            en = LocalizedContent("Which animal has the largest number of adult teeth?", listOf("Great white shark", "Hippopotamus", "Crocodile", "Elephant"), "Nature", "The crocodile can have up to 80 teeth as an adult, and it replaces them several times in its life, making it the mammal with the largest number of teeth."),
            zh = LocalizedContent("哪种动物拥有最多的成年牙齿？", listOf("大白鲨", "河马", "鳄鱼", "大象"), "自然", "鳄鱼成年后最多可有80颗牙齿，并且一生中会多次更换，使其成为牙齿数量最多的哺乳动物。"),
            es = LocalizedContent("¿Qué animal tiene el mayor número de dientes adultos?", listOf("Tiburón blanco", "Hipopótamo", "Cocodrilo", "Elefante"), "Naturaleza", "El cocodrilo puede tener hasta 80 dientes en la edad adulta, y los renueva varias veces a lo largo de su vida, lo que lo convierte en el mamífero con mayor número de dientes.")
        ),
        BilingualQuestion(
            id = 51719, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus haut volcan actif du monde?", listOf("Mont-Blanc", "Cotopaxi", "Villarrica", "Ojos del Salado"), "Nature", "Le Mont-Blanc n'est pas un volcan actif, mais le plus haut sommet des Alpes. La bonne réponse serait plutôt l'Ojos del Salado, dans les Andes, qui culmine à 6 893 mètres."),
            en = LocalizedContent("What is the highest active volcano in the world?", listOf("Mont Blanc", "Cotopaxi", "Villarrica", "Ojos del Salado"), "Nature", "Mont Blanc is not an active volcano, but the highest peak in the Alps. The correct answer would be Ojos del Salado, in the Andes, which rises to 6,893 meters."),
            zh = LocalizedContent("世界上最高的活火山是哪座？", listOf("勃朗峰", "科托帕希火山", "比亚里卡火山", "奥霍斯-德尔萨拉多山"), "自然", "勃朗峰不是活火山，而是阿尔卑斯山的最高峰。正确答案是安第斯山脉的奥霍斯-德尔萨拉多山，海拔6893米。"),
            es = LocalizedContent("¿Cuál es el volcán activo más alto del mundo?", listOf("Mont Blanc", "Cotopaxi", "Villarrica", "Ojos del Salado"), "Naturaleza", "El Mont Blanc no es un volcán activo, sino la cumbre más alta de los Alpes. La respuesta correcta sería el Ojos del Salado, en los Andes, que culmina a 6.893 metros.")
        ),
        BilingualQuestion(
            id = 51720, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("À quelle altitude se trouve l'Ojos del Salado?", listOf("6000m", "6500m", "7000m", "7500m"), "Nature", "L'Ojos del Salado est le plus haut volcan actif du monde, culminant à 6 893 mètres, mais sa principale altitude de référence est souvent donnée à 6 500 mètres dans certains contextes géographiques."),
            en = LocalizedContent("At what altitude is Ojos del Salado located?", listOf("6000m", "6500m", "7000m", "7500m"), "Nature", "Ojos del Salado is the highest active volcano in the world, rising to 6,893 meters, but its main reference altitude is often given as 6,500 meters in some geographical contexts."),
            zh = LocalizedContent("奥霍斯-德尔萨拉多山海拔多少米？", listOf("6000米", "6500米", "7000米", "7500米"), "自然", "奥霍斯-德尔萨拉多山是世界上最高的活火山，海拔6893米，但在某些地理背景下，其主要参考海拔常被列为6500米。"),
            es = LocalizedContent("¿A qué altitud se encuentra el Ojos del Salado?", listOf("6000m", "6500m", "7000m", "7500m"), "Naturaleza", "El Ojos del Salado es el volcán activo más alto del mundo, culminando a 6.893 metros, pero su altitud de referencia principal suele darse como 6.500 metros en algunos contextos geográficos.")
        ),
        BilingualQuestion(
            id = 51722, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de milliards de tonnes de glace se trouvent en Antarctique?", listOf("10", "50", "100", "200"), "Nature", "L'Antarctique contient environ 200 milliards de tonnes de glace, ce qui représente près de 90 % de la glace terrestre et 70 % de l'eau douce de la planète."),
            en = LocalizedContent("How many billion tons of ice are in Antarctica?", listOf("10", "50", "100", "200"), "Nature", "Antarctica contains about 200 billion tons of ice, representing nearly 90% of the Earth's ice and 70% of the planet's fresh water."),
            zh = LocalizedContent("南极洲有多少亿吨冰？", listOf("10", "50", "100", "200"), "自然", "南极洲约有2000亿吨冰，占地球冰量的近90%和全球淡水的70%。"),
            es = LocalizedContent("¿Cuántos miles de millones de toneladas de hielo hay en la Antártida?", listOf("10", "50", "100", "200"), "Naturaleza", "La Antártida contiene aproximadamente 200 mil millones de toneladas de hielo, lo que representa casi el 90% del hielo terrestre y el 70% del agua dulce del planeta.")
        ),
        BilingualQuestion(
            id = 51723, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est l'animal le plus rare du monde?", listOf("Panda", "Lynx ibérique", "Kakapo", "Rhinocéros blanc du nord"), "Nature", "Le panda géant est considéré comme l'un des animaux les plus rares au monde, avec une population sauvage estimée à moins de 2 000 individus, principalement en raison de la perte de son habitat naturel en Chine."),
            en = LocalizedContent("What is the rarest animal in the world?", listOf("Panda", "Iberian lynx", "Kakapo", "Northern white rhinoceros"), "Nature", "The giant panda is considered one of the rarest animals in the world, with a wild population estimated at fewer than 2,000 individuals, mainly due to habitat loss in China."),
            zh = LocalizedContent("世界上最稀有的动物是什么？", listOf("大熊猫", "伊比利亚猞猁", "鸮鹦鹉", "北方白犀牛"), "自然", "大熊猫被认为是世界上最稀有的动物之一，野生种群估计不足2000只，主要原因是其在中国自然栖息地的丧失。"),
            es = LocalizedContent("¿Cuál es el animal más raro del mundo?", listOf("Panda", "Lince ibérico", "Kakapo", "Rinoceronte blanco del norte"), "Naturaleza", "El panda gigante es considerado uno de los animales más raros del mundo, con una población salvaje estimada en menos de 2.000 individuos, principalmente debido a la pérdida de su hábitat natural en China.")
        ),
        BilingualQuestion(
            id = 51724, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de rhinocéros blancs du nord restent dans le monde?", listOf("1", "2", "3", "5"), "Nature", "Il ne reste que deux rhinocéros blancs du nord, une femelle et sa fille, vivant sous protection armée au Kenya. L'espèce est fonctionnellement éteinte depuis la mort du dernier mâle en 2018."),
            en = LocalizedContent("How many northern white rhinos remain in the world?", listOf("1", "2", "3", "5"), "Nature", "Only two northern white rhinos remain, a female and her daughter, living under armed protection in Kenya. The species is functionally extinct since the death of the last male in 2018."),
            zh = LocalizedContent("世界上还有多少头北方白犀牛？", listOf("1", "2", "3", "5"), "自然", "仅剩两头北方白犀牛，一头雌性和它的女儿，生活在肯尼亚的武装保护下。自2018年最后一头雄性死亡后，该物种已功能性灭绝。"),
            es = LocalizedContent("¿Cuántos rinocerontes blancos del norte quedan en el mundo?", listOf("1", "2", "3", "5"), "Naturaleza", "Solo quedan dos rinocerontes blancos del norte, una hembra y su hija, que viven bajo protección armada en Kenia. La especie está funcionalmente extinta desde la muerte del último macho en 2018.")
        ),
        BilingualQuestion(
            id = 51725, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand crustacé jamais découvert?", listOf("Crabe géant du Japon", "Homard américain", "Araignée de mer géante", "Crabe royal"), "Nature", "L'araignée de mer géante du Japon (Macrocheira kaempferi) détient le record du plus grand crustacé, avec une envergure de pattes pouvant atteindre 3,8 mètres."),
            en = LocalizedContent("What is the largest crustacean ever discovered?", listOf("Japanese giant crab", "American lobster", "Giant spider crab", "King crab"), "Nature", "The Japanese giant spider crab (Macrocheira kaempferi) holds the record for the largest crustacean, with a leg span that can reach 3.8 meters."),
            zh = LocalizedContent("有史以来发现的最大的甲壳动物是什么？", listOf("日本巨型蟹", "美洲龙虾", "巨型蜘蛛蟹", "帝王蟹"), "自然", "日本巨型蜘蛛蟹（Macrocheira kaempferi）保持着最大甲壳动物的纪录，其腿展可达3.8米。"),
            es = LocalizedContent("¿Cuál es el crustáceo más grande jamás descubierto?", listOf("Cangrejo gigante japonés", "Langosta americana", "Araña de mar gigante", "Cangrejo real"), "Naturaleza", "La araña de mar gigante japonesa (Macrocheira kaempferi) posee el récord del crustáceo más grande, con una envergadura de patas que puede alcanzar los 3,8 metros.")
        ),
        BilingualQuestion(
            id = 51726, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel dieu romain équivaut à Zeus grec?", listOf("Mars", "Jupiter", "Mercure", "Vénus"), "Mythologie", "Mars est le dieu romain de la guerre, tandis que Zeus est le roi des dieux grecs. L'équivalent romain de Zeus est Jupiter."),
            en = LocalizedContent("Which Roman god is equivalent to the Greek Zeus?", listOf("Mars", "Jupiter", "Mercury", "Venus"), "Mythology", "Mars is the Roman god of war, while Zeus is the king of the Greek gods. The Roman equivalent of Zeus is Jupiter."),
            zh = LocalizedContent("哪位罗马神祇相当于希腊的宙斯？", listOf("马尔斯", "朱庇特", "墨丘利", "维纳斯"), "神话", "马尔斯是罗马战神，而宙斯是希腊众神之王。宙斯的罗马对应神是朱庇特。"),
            es = LocalizedContent("¿Qué dios romano equivale al Zeus griego?", listOf("Marte", "Júpiter", "Mercurio", "Venus"), "Mitología", "Marte es el dios romano de la guerra, mientras que Zeus es el rey de los dioses griegos. El equivalente romano de Zeus es Júpiter.")
        ),
        BilingualQuestion(
            id = 51727, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Combien de têtes avait l'Hydre de Lerne?", listOf("3", "5", "7", "9"), "Mythologie", "L'Hydre de Lerne est généralement représentée avec neuf têtes dans la mythologie grecque, mais certaines versions en comptent cinq, sept ou même cent. Le nombre varie selon les récits."),
            en = LocalizedContent("How many heads did the Lernaean Hydra have?", listOf("3", "5", "7", "9"), "Mythology", "The Lernaean Hydra is usually depicted with nine heads in Greek mythology, but some versions count five, seven, or even a hundred. The number varies across accounts."),
            zh = LocalizedContent("勒拿九头蛇有多少个头？", listOf("3", "5", "7", "9"), "神话", "在希腊神话中，勒拿九头蛇通常被描绘为有九个脑袋，但有些版本说有五个、七个甚至一百个。不同传说中数量不同。"),
            es = LocalizedContent("¿Cuántas cabezas tenía la Hidra de Lerna?", listOf("3", "5", "7", "9"), "Mitología", "La Hidra de Lerna suele representarse con nueve cabezas en la mitología griega, pero algunas versiones cuentan cinco, siete o incluso cien. El número varía según los relatos.")
        ),
        BilingualQuestion(
            id = 51728, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel monstre garde les portes du Tartare?", listOf("Cerbère", "Minotaure", "Chimère", "Dragon"), "Mythologie", "Dans la mythologie grecque, la Chimère est un monstre hybride crachant du feu, mais ce n'est pas elle qui garde le Tartare : c'est Cerbère, le chien à trois têtes."),
            en = LocalizedContent("Which monster guards the gates of Tartarus?", listOf("Cerberus", "Minotaur", "Chimera", "Dragon"), "Mythology", "In Greek mythology, the Chimera is a fire-breathing hybrid monster, but it is not the one guarding Tartarus: that is Cerberus, the three-headed dog."),
            zh = LocalizedContent("哪个怪物守卫着塔尔塔罗斯的大门？", listOf("刻耳柏洛斯", "弥诺陶洛斯", "喀迈拉", "龙"), "神话", "在希腊神话中，喀迈拉是一种喷火的混合怪物，但守卫塔尔塔罗斯的不是它，而是三头狗刻耳柏洛斯。"),
            es = LocalizedContent("¿Qué monstruo guarda las puertas del Tártaro?", listOf("Cerbero", "Minotauro", "Quimera", "Dragón"), "Mitología", "En la mitología griega, la Quimera es un monstruo híbrido que escupe fuego, pero no es ella quien guarda el Tártaro: es Cerbero, el perro de tres cabezas.")
        ),
        BilingualQuestion(
            id = 51729, correctIndex = 3, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Combien de têtes a Cerbère?", listOf("1", "2", "3", "4"), "Mythologie", "Dans la mythologie grecque, Cerbère est le chien à trois têtes gardant les Enfers. La réponse 4 est fausse car il en a trois, pas quatre."),
            en = LocalizedContent("How many heads does Cerberus have?", listOf("1", "2", "3", "4"), "Mythology", "In Greek mythology, Cerberus is the three-headed dog guarding the Underworld. The answer 4 is wrong because he has three, not four."),
            zh = LocalizedContent("刻耳柏洛斯有几个头？", listOf("1", "2", "3", "4"), "神话", "在希腊神话中，刻耳柏洛斯是守卫冥界的三头犬。答案4是错误的，因为它有三个头，而不是四个。"),
            es = LocalizedContent("¿Cuántas cabezas tiene Cerbero?", listOf("1", "2", "3", "4"), "Mitología", "En la mitología griega, Cerbero es el perro de tres cabezas que guarda el Inframundo. La respuesta 4 es incorrecta porque tiene tres, no cuatro.")
        ),
        BilingualQuestion(
            id = 51730, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel titan a été puni à traverser les âges?", listOf("Cronos", "Atlas", "Prométhée", "Océan"), "Mythologie", "Cronos, le titan qui a dévoré ses enfants, a été puni par Zeus en étant enfermé dans le Tartare, un abîme souterrain, pour l'éternité."),
            en = LocalizedContent("Which Titan was punished to traverse the ages?", listOf("Cronus", "Atlas", "Prometheus", "Oceanus"), "Mythology", "Cronus, the Titan who devoured his children, was punished by Zeus by being imprisoned in Tartarus, an underground abyss, for eternity."),
            zh = LocalizedContent("哪位泰坦被惩罚穿越时代？", listOf("克洛诺斯", "阿特拉斯", "普罗米修斯", "俄刻阿诺斯"), "神话", "克洛诺斯是吞噬自己子女的泰坦，被宙斯惩罚，永远囚禁在塔尔塔罗斯这个地下深渊中。"),
            es = LocalizedContent("¿Qué titán fue castigado a atravesar las edades?", listOf("Crono", "Atlas", "Prometeo", "Océano"), "Mitología", "Crono, el titán que devoró a sus hijos, fue castigado por Zeus siendo encerrado en el Tártaro, un abismo subterráneo, por la eternidad.")
        ),
        BilingualQuestion(
            id = 51731, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le nom du dieu des enfers romain?", listOf("Charon", "Pluton", "Hadès", "Poséidon"), "Mythologie", "Pluton est l'équivalent romain du dieu grec Hadès, souverain des enfers et des morts."),
            en = LocalizedContent("What is the name of the Roman god of the underworld?", listOf("Charon", "Pluto", "Hades", "Poseidon"), "Mythology", "Pluto is the Roman equivalent of the Greek god Hades, ruler of the underworld and the dead."),
            zh = LocalizedContent("罗马冥神的名字是什么？", listOf("卡戎", "普路托", "哈迪斯", "波塞冬"), "神话", "普路托是希腊冥神哈迪斯的罗马对应神，掌管冥界和死者。"),
            es = LocalizedContent("¿Cuál es el nombre del dios romano del inframundo?", listOf("Caronte", "Plutón", "Hades", "Poseidón"), "Mitología", "Plutón es el equivalente romano del dios griego Hades, soberano del inframundo y los muertos.")
        ),
        BilingualQuestion(
            id = 51732, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel arme Zeus utilisait-il pour punir?", listOf("Épée", "Éclair", "Trident", "Arc"), "Mythologie", "Le trident est en réalité l'attribut de Poséidon, dieu de la mer, tandis que Zeus utilisait la foudre comme arme pour punir."),
            en = LocalizedContent("What weapon did Zeus use to punish?", listOf("Sword", "Thunderbolt", "Trident", "Bow"), "Mythology", "The trident is actually the attribute of Poseidon, god of the sea, while Zeus used the thunderbolt as a weapon to punish."),
            zh = LocalizedContent("宙斯用什么武器惩罚？", listOf("剑", "闪电", "三叉戟", "弓"), "神话", "三叉戟实际上是海神波塞冬的象征，而宙斯用闪电作为惩罚的武器。"),
            es = LocalizedContent("¿Qué arma usaba Zeus para castigar?", listOf("Espada", "Rayo", "Tridente", "Arco"), "Mitología", "El tridente es en realidad el atributo de Poseidón, dios del mar, mientras que Zeus usaba el rayo como arma para castigar.")
        ),
        BilingualQuestion(
            id = 51733, correctIndex = 3, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le nom du cheval dans la légende grecque?", listOf("Cheval de Trojane", "Cheval de Troie", "Cheval d'Ilion", "Cheval d'Athènes"), "Mythologie", "Le cheval d'Athènes est une référence au cheval de Troie, bien que la légende grecque ne mentionne pas de nom spécifique pour cet animal."),
            en = LocalizedContent("What is the name of the horse in the Greek legend?", listOf("Horse of Troy", "Trojan Horse", "Horse of Ilion", "Horse of Athens"), "Mythology", "The Horse of Athens is a reference to the Trojan Horse, although the Greek legend does not mention a specific name for this animal."),
            zh = LocalizedContent("希腊传说中的马叫什么名字？", listOf("特洛伊马", "特洛伊木马", "伊利昂马", "雅典马"), "神话", "雅典马指的是特洛伊木马，尽管希腊传说中没有给这匹马起具体的名字。"),
            es = LocalizedContent("¿Cuál es el nombre del caballo en la leyenda griega?", listOf("Caballo de Troya", "Caballo de Troya", "Caballo de Ilión", "Caballo de Atenas"), "Mitología", "El Caballo de Atenas es una referencia al Caballo de Troya, aunque la leyenda griega no menciona un nombre específico para este animal.")
        ),
        BilingualQuestion(
            id = 51734, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Combien de guerriers grecs se sont cachés dans le Cheval de Troie?", listOf("100", "500", "1000", "2000"), "Mythologie", "Selon l'épopée de l'Énéide de Virgile, une centaine de guerriers grecs, dont Ulysse, se cachèrent dans le cheval de Troie pour infiltrer la ville."),
            en = LocalizedContent("How many Greek warriors hid inside the Trojan Horse?", listOf("100", "500", "1000", "2000"), "Mythology", "According to Virgil's epic the Aeneid, about a hundred Greek warriors, including Odysseus, hid inside the Trojan Horse to infiltrate the city."),
            zh = LocalizedContent("有多少希腊战士藏在特洛伊木马中？", listOf("100", "500", "1000", "2000"), "神话", "根据维吉尔的史诗《埃涅阿斯纪》，大约一百名希腊战士，包括奥德修斯，藏在特洛伊木马中潜入城市。"),
            es = LocalizedContent("¿Cuántos guerreros griegos se escondieron dentro del Caballo de Troya?", listOf("100", "500", "1000", "2000"), "Mitología", "Según la epopeya de la Eneida de Virgilio, alrededor de cien guerreros griegos, incluido Ulises, se escondieron dentro del caballo de Troya para infiltrarse en la ciudad.")
        ),
        BilingualQuestion(
            id = 51735, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel dieu nordique a perdu un œil?", listOf("Thor", "Odin", "Loki", "Heimdall"), "Mythologie", "Odin a sacrifié son œil dans le puits de Mimir pour acquérir la sagesse et la connaissance de l'univers."),
            en = LocalizedContent("Which Norse god lost an eye?", listOf("Thor", "Odin", "Loki", "Heimdall"), "Mythology", "Odin sacrificed his eye in Mimir's well to gain wisdom and knowledge of the universe."),
            zh = LocalizedContent("哪位北欧神祇失去了一只眼睛？", listOf("托尔", "奥丁", "洛基", "海姆达尔"), "神话", "奥丁在密米尔的泉水中献出了自己的眼睛，以换取智慧和宇宙的知识。"),
            es = LocalizedContent("¿Qué dios nórdico perdió un ojo?", listOf("Thor", "Odín", "Loki", "Heimdall"), "Mitología", "Odín sacrificó su ojo en el pozo de Mimir para adquirir sabiduría y conocimiento del universo.")
        ),
        BilingualQuestion(
            id = 51736, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel serpent nordique mord l'arbre Yggdrasil?", listOf("Jörmungandr", "Níðhöggr", "Skaði", "Fenrir"), "Mythologie", "Dans la mythologie nordique, Skaði est une géante associée à la chasse et aux montagnes, mais ce n'est pas elle qui mord Yggdrasil. Le serpent qui ronge les racines de l'arbre cosmique est Níðhöggr."),
            en = LocalizedContent("Which Norse serpent bites the tree Yggdrasil?", listOf("Jörmungandr", "Níðhöggr", "Skaði", "Fenrir"), "Mythology", "In Norse mythology, Skaði is a giantess associated with hunting and mountains, but she does not bite Yggdrasil. The serpent that gnaws the roots of the cosmic tree is Níðhöggr."),
            zh = LocalizedContent("哪条北欧巨蛇啃咬世界树尤克特拉希尔？", listOf("耶梦加得", "尼德霍格", "斯卡蒂", "芬里尔"), "神话", "在北欧神话中，斯卡蒂是与狩猎和山脉相关的女巨人，但她并不啃咬尤克特拉希尔。啃咬宇宙树根部的蛇是尼德霍格。"),
            es = LocalizedContent("¿Qué serpiente nórdica muerde el árbol Yggdrasil?", listOf("Jörmungandr", "Níðhöggr", "Skaði", "Fenrir"), "Mitología", "En la mitología nórdica, Skaði es una giganta asociada con la caza y las montañas, pero no muerde Yggdrasil. La serpiente que roe las raíces del árbol cósmico es Níðhöggr.")
        ),
        BilingualQuestion(
            id = 51737, correctIndex = 3, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le nom de l'épée magique d'Excalibur?", listOf("Caliburn", "Gueule d'Âme", "Kusanagi", "Précieuse"), "Mythologie", "Excalibur est le nom de l'épée légendaire du roi Arthur, et non un type d'épée. Le terme \"Précieuse\" est ici une erreur, car il ne correspond à aucune épée magique de la mythologie arthurienne."),
            en = LocalizedContent("What is the name of the magical sword Excalibur?", listOf("Caliburn", "Soul Eater", "Kusanagi", "Precious"), "Mythology", "Excalibur is the name of King Arthur's legendary sword, not a type of sword. The term 'Precious' is an error here, as it does not correspond to any magical sword in Arthurian mythology."),
            zh = LocalizedContent("神剑Excalibur的名字是什么？", listOf("卡利伯恩", "噬魂者", "草薙剑", "珍贵之物"), "神话", "Excalibur是亚瑟王传奇之剑的名字，而非一种剑的类型。这里的“珍贵之物”是错误的，因为它与亚瑟王神话中的任何魔法剑都不对应。"),
            es = LocalizedContent("¿Cuál es el nombre de la espada mágica Excalibur?", listOf("Caliburn", "Devoradora de Almas", "Kusanagi", "Preciosa"), "Mitología", "Excalibur es el nombre de la espada legendaria del rey Arturo, no un tipo de espada. El término 'Preciosa' es un error aquí, ya que no corresponde a ninguna espada mágica de la mitología artúrica.")
        ),
        BilingualQuestion(
            id = 51738, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui a forgé Mjolnir, le marteau de Thor?", listOf("Les Nains", "Héphaïstos", "Surtir", "Les Géants"), "Mythologie", "Dans la mythologie nordique, le marteau Mjolnir a été forgé par les frères nains Brokk et Sindri, dans le cadre d'un pari avec Loki."),
            en = LocalizedContent("Who forged Mjolnir, Thor's hammer?", listOf("The Dwarves", "Hephaestus", "Surtir", "The Giants"), "Mythology", "In Norse mythology, the hammer Mjolnir was forged by the dwarf brothers Brokk and Sindri as part of a bet with Loki."),
            zh = LocalizedContent("谁锻造了雷神之锤妙尔尼尔？", listOf("矮人", "赫菲斯托斯", "苏尔特尔", "巨人"), "神话", "在北欧神话中，雷神之锤妙尔尼尔是由矮人兄弟布洛克和辛德里在跟洛基打赌时锻造的。"),
            es = LocalizedContent("¿Quién forjó Mjolnir, el martillo de Thor?", listOf("Los Enanos", "Hefesto", "Surtir", "Los Gigantes"), "Mitología", "En la mitología nórdica, el martillo Mjolnir fue forjado por los hermanos enanos Brokk y Sindri como parte de una apuesta con Loki.")
        ),
        BilingualQuestion(
            id = 51739, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel roi maudit a épousé sa propre mère?", listOf("Ares", "Œdipe", "Persée", "Achille"), "Mythologie", "Dans la mythologie grecque, Œdipe accomplit la prophétie en tuant son père Laïos et en épousant sa mère Jocaste, ignorant leur identité."),
            en = LocalizedContent("Which cursed king married his own mother?", listOf("Ares", "Oedipus", "Perseus", "Achilles"), "Mythology", "In Greek mythology, Oedipus fulfilled the prophecy by killing his father Laius and marrying his mother Jocasta, unaware of their identities."),
            zh = LocalizedContent("哪位被诅咒的国王娶了自己的母亲？", listOf("阿瑞斯", "俄狄浦斯", "珀尔修斯", "阿喀琉斯"), "神话", "在希腊神话中，俄狄浦斯实现了预言，杀死了父亲拉伊俄斯并娶了母亲伊俄卡斯忒，却不知他们的身份。"),
            es = LocalizedContent("¿Qué rey maldito se casó con su propia madre?", listOf("Ares", "Edipo", "Perseo", "Aquiles"), "Mitología", "En la mitología griega, Edipo cumplió la profecía matando a su padre Layo y casándose con su madre Yocasta, sin conocer sus identidades.")
        ),
        BilingualQuestion(
            id = 51740, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel héros a tué Méduse la Gorgone?", listOf("Thésée", "Persée", "Hercule", "Ajax"), "Mythologie", "Dans la mythologie grecque, c'est Persée qui a décapité Méduse, et non Hercule."),
            en = LocalizedContent("Which hero killed Medusa the Gorgon?", listOf("Theseus", "Perseus", "Hercules", "Ajax"), "Mythology", "In Greek mythology, it was Perseus who beheaded Medusa, not Hercules."),
            zh = LocalizedContent("哪位英雄杀死了美杜莎？", listOf("忒修斯", "珀尔修斯", "赫拉克勒斯", "埃阿斯"), "神话", "在希腊神话中，是珀尔修斯斩杀了美杜莎，而不是赫拉克勒斯。"),
            es = LocalizedContent("¿Qué héroe mató a Medusa la Gorgona?", listOf("Teseo", "Perseo", "Hércules", "Áyax"), "Mitología", "En la mitología griega, fue Perseo quien decapitó a Medusa, no Hércules.")
        ),
        BilingualQuestion(
            id = 51741, correctIndex = 3, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Combien de labeurs Hercule doit-il accomplir?", listOf("10", "12", "15", "20"), "Mythologie", "Hercule doit accomplir douze travaux, et non vingt. Le nombre vingt vient peut-être d'une confusion avec d'autres épreuves ou récits mythologiques."),
            en = LocalizedContent("How many labors must Hercules accomplish?", listOf("10", "12", "15", "20"), "Mythology", "Hercules must accomplish twelve labors, not twenty. The number twenty may come from confusion with other trials or mythological stories."),
            zh = LocalizedContent("赫拉克勒斯必须完成多少项任务？", listOf("10", "12", "15", "20"), "神话", "赫拉克勒斯必须完成十二项任务，而不是二十项。数字二十可能源于与其他考验或神话故事的混淆。"),
            es = LocalizedContent("¿Cuántos trabajos debe realizar Hércules?", listOf("10", "12", "15", "20"), "Mitología", "Hércules debe realizar doce trabajos, no veinte. El número veinte puede provenir de una confusión con otras pruebas o relatos mitológicos.")
        ),
        BilingualQuestion(
            id = 51742, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le dernier des 12 travaux d'Hercule?", listOf("Capturer Cerbère", "Obtenir les pommes d'or", "Tuer le lion", "Capturer la biche"), "Mythologie", "Le douzième et dernier travail imposé à Hercule par Eurysthée était de capturer Cerbère, le chien à trois têtes gardien des Enfers, sans utiliser d'armes."),
            en = LocalizedContent("What is the last of Hercules' 12 labors?", listOf("Capture Cerberus", "Obtain the golden apples", "Kill the lion", "Capture the hind"), "Mythology", "The twelfth and final labor imposed on Hercules by Eurystheus was to capture Cerberus, the three-headed dog guarding the Underworld, without using weapons."),
            zh = LocalizedContent("赫拉克勒斯十二项任务中的最后一项是什么？", listOf("捕捉刻耳柏洛斯", "取得金苹果", "杀死狮子", "捕捉牝鹿"), "神话", "欧律斯透斯交给赫拉克勒斯的第十二项也是最后一项任务是捕捉刻耳柏洛斯，即守卫冥界的三头犬，且不得使用武器。"),
            es = LocalizedContent("¿Cuál es el último de los 12 trabajos de Hércules?", listOf("Capturar a Cerbero", "Obtener las manzanas de oro", "Matar al león", "Capturar a la cierva"), "Mitología", "El duodécimo y último trabajo impuesto a Hércules por Euristeo fue capturar a Cerbero, el perro de tres cabezas guardián del Inframundo, sin usar armas.")
        ),
        BilingualQuestion(
            id = 51743, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel dieu égyptien a la tête d'un chacal?", listOf("Horus", "Anubis", "Thoth", "Set"), "Mythologie", "Anubis est le dieu égyptien de la momification et de l'au-delà, représenté avec une tête de chacal en raison du comportement de cet animal fréquentant les nécropoles."),
            en = LocalizedContent("Which Egyptian god has the head of a jackal?", listOf("Horus", "Anubis", "Thoth", "Set"), "Mythology", "Anubis is the Egyptian god of mummification and the afterlife, depicted with a jackal's head due to the behavior of this animal frequenting necropolises."),
            zh = LocalizedContent("哪位埃及神祇长着胡狼头？", listOf("荷鲁斯", "阿努比斯", "托特", "赛特"), "神话", "阿努比斯是埃及的木乃伊制作和来世之神，因胡狼常出没于墓地而被描绘成胡狼头。"),
            es = LocalizedContent("¿Qué dios egipcio tiene cabeza de chacal?", listOf("Horus", "Anubis", "Thoth", "Set"), "Mitología", "Anubis es el dios egipcio de la momificación y el más allá, representado con cabeza de chacal debido al comportamiento de este animal que frecuentaba las necrópolis.")
        ),
        BilingualQuestion(
            id = 51744, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel dieu égyptien est le soleil?", listOf("Ra", "Horus", "Amun", "Ptah"), "Mythologie", "Amun est le dieu du soleil caché, souvent associé à Rê pour former Amun-Rê, le roi des dieux dans la mythologie égyptienne."),
            en = LocalizedContent("Which Egyptian god is the sun?", listOf("Ra", "Horus", "Amun", "Ptah"), "Mythology", "Amun is the god of the hidden sun, often associated with Ra to form Amun-Ra, the king of the gods in Egyptian mythology."),
            zh = LocalizedContent("哪位埃及神祇是太阳？", listOf("拉", "荷鲁斯", "阿蒙", "普塔"), "神话", "阿蒙是隐藏的太阳神，常与拉结合形成阿蒙-拉，即埃及神话中的众神之王。"),
            es = LocalizedContent("¿Qué dios egipcio es el sol?", listOf("Ra", "Horus", "Amón", "Ptah"), "Mitología", "Amón es el dios del sol oculto, a menudo asociado con Ra para formar Amón-Ra, el rey de los dioses en la mitología egipcia.")
        ),
        BilingualQuestion(
            id = 51745, correctIndex = 3, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Combien de dieux principaux comptait le panthéon égyptien?", listOf("9", "12", "15", "20"), "Mythologie", "Le panthéon égyptien comptait environ 20 dieux principaux, incluant Rê, Osiris, Isis et Horus, bien que le nombre exact varie selon les époques et les régions."),
            en = LocalizedContent("How many main gods did the Egyptian pantheon have?", listOf("9", "12", "15", "20"), "Mythology", "The Egyptian pantheon had about 20 main gods, including Ra, Osiris, Isis, and Horus, though the exact number varies by period and region."),
            zh = LocalizedContent("埃及万神殿有多少位主神？", listOf("9", "12", "15", "20"), "神话", "埃及万神殿约有20位主神，包括拉、奥西里斯、伊西斯和荷鲁斯，但具体数量因时代和地区而异。"),
            es = LocalizedContent("¿Cuántos dioses principales tenía el panteón egipcio?", listOf("9", "12", "15", "20"), "Mitología", "El panteón egipcio tenía unos 20 dioses principales, incluyendo a Ra, Osiris, Isis y Horus, aunque el número exacto varía según la época y la región.")
        ),
        BilingualQuestion(
            id = 51746, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel titan a mangé ses propres enfants?", listOf("Chronos", "Cronos", "Océan", "Japet"), "Mythologie", "Dans la mythologie grecque, Chronos, craignant une prophétie annonçant qu'il serait détrôné par ses enfants, les dévorait à leur naissance."),
            en = LocalizedContent("Which titan ate his own children?", listOf("Chronos", "Cronos", "Ocean", "Iapetus"), "Mythology", "In Greek mythology, Cronus, fearing a prophecy that he would be overthrown by his children, devoured them at birth."),
            zh = LocalizedContent("哪位泰坦吃掉了自己的孩子？", listOf("克洛诺斯", "克洛诺斯", "俄刻阿诺斯", "伊阿珀托斯"), "神话", "在希腊神话中，克洛诺斯因害怕被子女推翻的预言，在子女出生时将他们吞食。"),
            es = LocalizedContent("¿Qué titán se comió a sus propios hijos?", listOf("Crono", "Crono", "Océano", "Jápeto"), "Mitología", "En la mitología griega, Crono, temiendo una profecía de que sería destronado por sus hijos, los devoraba al nacer.")
        ),
        BilingualQuestion(
            id = 51747, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le nom du monstre mi-homme mi-taureau?", listOf("Centaure", "Minotaure", "Chimère", "Sphinx"), "Mythologie", "Le Minotaure, enfermé dans le Labyrinthe de Crète, était le fruit de l'union de Pasiphaé avec un taureau envoyé par Poséidon."),
            en = LocalizedContent("What is the name of the half-man half-bull monster?", listOf("Centaur", "Minotaur", "Chimera", "Sphinx"), "Mythology", "The Minotaur, imprisoned in the Labyrinth of Crete, was the offspring of Pasiphaë and a bull sent by Poseidon."),
            zh = LocalizedContent("半人半牛的怪物叫什么名字？", listOf("半人马", "弥诺陶洛斯", "喀迈拉", "斯芬克斯"), "神话", "弥诺陶洛斯被囚禁在克里特岛的迷宫中，是帕西淮与波塞冬派来的公牛所生。"),
            es = LocalizedContent("¿Cómo se llama el monstruo mitad hombre mitad toro?", listOf("Centauro", "Minotauro", "Quimera", "Esfinge"), "Mitología", "El Minotauro, encerrado en el Laberinto de Creta, era fruto de la unión de Pasífae con un toro enviado por Poseidón.")
        ),
        BilingualQuestion(
            id = 51748, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Dans quel labyrinthe le Minotaure était-il enfermé?", listOf("Crète", "Thèbes", "Dédale", "Knossos"), "Mythologie", "Dédale a construit le labyrinthe pour enfermer le Minotaure, créature mi-homme mi-taureau, sur ordre du roi Minos en Crète."),
            en = LocalizedContent("In which labyrinth was the Minotaur imprisoned?", listOf("Crete", "Thebes", "Daedalus", "Knossos"), "Mythology", "Daedalus built the labyrinth to imprison the Minotaur, a half-man half-bull creature, on the orders of King Minos in Crete."),
            zh = LocalizedContent("弥诺陶洛斯被关在哪个迷宫里？", listOf("克里特", "底比斯", "代达罗斯", "克诺索斯"), "神话", "代达罗斯奉克里特国王米诺斯之命建造了迷宫，以囚禁半人半牛的怪物弥诺陶洛斯。"),
            es = LocalizedContent("¿En qué laberinto estaba encerrado el Minotauro?", listOf("Creta", "Tebas", "Dédalo", "Cnosos"), "Mitología", "Dédalo construyó el laberinto para encerrar al Minotauro, criatura mitad hombre mitad toro, por orden del rey Minos en Creta.")
        ),
        BilingualQuestion(
            id = 51749, correctIndex = 3, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le nom de la déesse la mère de tous les dieux?", listOf("Rhéa", "Théthys", "Mnémosyne", "Thémis"), "Mythologie", "Dans la mythologie grecque, Thémis est la titanide de la justice et de l'ordre divin, souvent considérée comme une mère des dieux pour son rôle dans la génération des divinités."),
            en = LocalizedContent("What is the name of the goddess mother of all gods?", listOf("Rhea", "Tethys", "Mnemosyne", "Themis"), "Mythology", "In Greek mythology, Themis is the Titaness of justice and divine order, often considered a mother of the gods for her role in generating deities."),
            zh = LocalizedContent("众神之母的女神叫什么名字？", listOf("瑞亚", "泰西斯", "谟涅摩绪涅", "忒弥斯"), "神话", "在希腊神话中，忒弥斯是正义与神圣秩序的泰坦女神，因其在神祇诞生中的作用常被视为众神之母。"),
            es = LocalizedContent("¿Cuál es el nombre de la diosa madre de todos los dioses?", listOf("Rea", "Tetis", "Mnemósine", "Temis"), "Mitología", "En la mitología griega, Temis es la titánide de la justicia y el orden divino, a menudo considerada madre de los dioses por su papel en la generación de deidades.")
        ),
        BilingualQuestion(
            id = 51750, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel dieu hindou a plusieurs bras?", listOf("Brahma", "Vishnou", "Shiva", "Ganesh"), "Mythologie", "Brahma est souvent représenté avec quatre têtes et quatre bras, symbolisant sa connaissance des quatre Vedas et des quatre directions."),
            en = LocalizedContent("Which Hindu god has multiple arms?", listOf("Brahma", "Vishnu", "Shiva", "Ganesh"), "Mythology", "Brahma is often depicted with four heads and four arms, symbolizing his knowledge of the four Vedas and the four directions."),
            zh = LocalizedContent("哪位印度教神祇有多只手臂？", listOf("梵天", "毗湿奴", "湿婆", "伽内什"), "神话", "梵天常被描绘为四头四臂，象征他对四部吠陀和四个方向的知识。"),
            es = LocalizedContent("¿Qué dios hindú tiene múltiples brazos?", listOf("Brahma", "Visnú", "Shivá", "Ganesha"), "Mitología", "Brahma suele representarse con cuatro cabezas y cuatro brazos, simbolizando su conocimiento de los cuatro Vedas y las cuatro direcciones.")
        ),
        BilingualQuestion(
            id = 51751, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Combien de bras Shiva le Dieu de la Danse possède-t-il généralement?", listOf("2", "3", "4", "6"), "Mythologie", "Dans l'iconographie hindoue, Shiva Nataraja, le dieu de la danse cosmique, est généralement représenté avec quatre bras, et non trois."),
            en = LocalizedContent("How many arms does Shiva the God of Dance usually have?", listOf("2", "3", "4", "6"), "Mythology", "In Hindu iconography, Shiva Nataraja, the god of cosmic dance, is usually depicted with four arms, not three."),
            zh = LocalizedContent("舞王湿婆通常有多少只手臂？", listOf("2", "3", "4", "6"), "神话", "在印度教图像学中，湿婆作为宇宙之舞之神，通常被描绘为四臂，而非三臂。"),
            es = LocalizedContent("¿Cuántos brazos tiene generalmente Shiva, el dios de la danza?", listOf("2", "3", "4", "6"), "Mitología", "En la iconografía hindú, Shiva Nataraja, el dios de la danza cósmica, suele representarse con cuatro brazos, no tres.")
        ),
        BilingualQuestion(
            id = 51752, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel dieu hindou a une tête d'éléphant?", listOf("Hanuman", "Ganesh", "Krishn", "Brahma"), "Mythologie", "Ganesh, et non Krishna, est le dieu hindou à tête d'éléphant, fils de Shiva et Parvati, connu comme le dieu de la sagesse et des commencements."),
            en = LocalizedContent("Which Hindu god has an elephant head?", listOf("Hanuman", "Ganesh", "Krishna", "Brahma"), "Mythology", "Ganesh, not Krishna, is the Hindu god with an elephant head, son of Shiva and Parvati, known as the god of wisdom and beginnings."),
            zh = LocalizedContent("哪位印度教神祇有象头？", listOf("哈努曼", "伽内什", "克里希纳", "梵天"), "神话", "伽内什（而非克里希纳）是象头神，湿婆与帕尔瓦蒂之子，被视为智慧与开端之神。"),
            es = LocalizedContent("¿Qué dios hindú tiene cabeza de elefante?", listOf("Hanuman", "Ganesha", "Krishna", "Brahma"), "Mitología", "Ganesha, no Krishna, es el dios hindú con cabeza de elefante, hijo de Shivá y Parvati, conocido como el dios de la sabiduría y los comienzos.")
        ),
        BilingualQuestion(
            id = 51753, correctIndex = 3, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel monstre gardait les pommes d'or des Hespérides?", listOf("Dragon", "Serpent", "Griffon", "Cerbère"), "Mythologie", "Dans la mythologie grecque, Cerbère gardait les portes des Enfers, non les pommes d'or des Hespérides. C'est un dragon à cent têtes qui veillait sur ce jardin sacré."),
            en = LocalizedContent("Which monster guarded the golden apples of the Hesperides?", listOf("Dragon", "Serpent", "Griffin", "Cerberus"), "Mythology", "In Greek mythology, Cerberus guarded the gates of the Underworld, not the golden apples of the Hesperides. A hundred-headed dragon watched over that sacred garden."),
            zh = LocalizedContent("哪个怪物守护着赫斯珀里得斯的金苹果？", listOf("龙", "蛇", "格里芬", "刻耳柏洛斯"), "神话", "在希腊神话中，刻耳柏洛斯守卫冥界大门，而非赫斯珀里得斯的金苹果。守护圣园的是百头巨龙。"),
            es = LocalizedContent("¿Qué monstruo guardaba las manzanas de oro de las Hespérides?", listOf("Dragón", "Serpiente", "Grifo", "Cerbero"), "Mitología", "En la mitología griega, Cerbero guardaba las puertas del Inframundo, no las manzanas de oro de las Hespérides. Un dragón de cien cabezas vigilaba ese jardín sagrado.")
        ),
        BilingualQuestion(
            id = 51754, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le nom du serpent gardien des pommes d'or?", listOf("Python", "Ladon", "Apophis", "Jörmungandr"), "Mythologie", "Dans la mythologie grecque, Python était un serpent monstrueux qui gardait l'oracle de Delphes et les pommes d'or du jardin des Hespérides."),
            en = LocalizedContent("What is the name of the serpent guardian of the golden apples?", listOf("Python", "Ladon", "Apophis", "Jörmungandr"), "Mythology", "In Greek mythology, Python was a monstrous serpent that guarded the oracle of Delphi and the golden apples of the garden of the Hesperides."),
            zh = LocalizedContent("守护金苹果的蛇叫什么名字？", listOf("皮同", "拉冬", "阿波菲斯", "耶梦加得"), "神话", "在希腊神话中，皮同是一条巨蛇，守护着德尔斐神谕和赫斯珀里得斯花园的金苹果。"),
            es = LocalizedContent("¿Cuál es el nombre de la serpiente guardiana de las manzanas de oro?", listOf("Pitón", "Ladón", "Apofis", "Jörmundgander"), "Mitología", "En la mitología griega, Pitón era una serpiente monstruosa que guardaba el oráculo de Delfos y las manzanas de oro del jardín de las Hespérides.")
        ),
        BilingualQuestion(
            id = 51755, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel héros a accompli le voyage des Argonautes?", listOf("Achille", "Jason", "Persée", "Héraclès"), "Mythologie", "Jason a mené l'expédition des Argonautes à bord du navire Argo pour conquérir la Toison d'or."),
            en = LocalizedContent("Which hero completed the voyage of the Argonauts?", listOf("Achilles", "Jason", "Perseus", "Heracles"), "Mythology", "Jason led the expedition of the Argonauts aboard the ship Argo to conquer the Golden Fleece."),
            zh = LocalizedContent("哪位英雄完成了阿尔戈英雄的航行？", listOf("阿喀琉斯", "伊阿宋", "珀耳修斯", "赫拉克勒斯"), "神话", "伊阿宋率领阿尔戈英雄乘坐阿尔戈号船远征，夺取金羊毛。"),
            es = LocalizedContent("¿Qué héroe completó el viaje de los argonautas?", listOf("Aquiles", "Jasón", "Perseo", "Heracles"), "Mitología", "Jasón lideró la expedición de los argonautas a bordo del navío Argo para conquistar el Vellocino de Oro.")
        ),
        BilingualQuestion(
            id = 51756, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel était l'objectif de la quête des Argonautes?", listOf("Toison d'Or", "Pommes d'Or", "Épée Sacrée", "Graal"), "Mythologie", "Dans la mythologie grecque, la quête des Argonautes visait à rapporter la Toison d'or, et non une épée sacrée."),
            en = LocalizedContent("What was the goal of the Argonauts' quest?", listOf("Golden Fleece", "Golden Apples", "Sacred Sword", "Grail"), "Mythology", "In Greek mythology, the Argonauts' quest aimed to bring back the Golden Fleece, not a sacred sword."),
            zh = LocalizedContent("阿尔戈英雄的追求目标是什么？", listOf("金羊毛", "金苹果", "圣剑", "圣杯"), "神话", "在希腊神话中，阿尔戈英雄的追求目标是带回金羊毛，而非圣剑。"),
            es = LocalizedContent("¿Cuál era el objetivo de la búsqueda de los argonautas?", listOf("Vellocino de Oro", "Manzanas de Oro", "Espada Sagrada", "Grial"), "Mitología", "En la mitología griega, la búsqueda de los argonautas tenía como objetivo traer el Vellocino de Oro, no una espada sagrada.")
        ),
        BilingualQuestion(
            id = 51757, correctIndex = 3, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel roi gréco-romain a conquis le monde?", listOf("Achille", "Hercule", "Alexandre", "Énée"), "Mythologie", "Dans la mythologie gréco-romaine, Énée est un héros troyen qui, selon la légende, a survécu à la guerre de Troie et a voyagé pour fonder la lignée romaine, mais il n'a pas conquis le monde."),
            en = LocalizedContent("Which Greco-Roman king conquered the world?", listOf("Achilles", "Hercules", "Alexander", "Aeneas"), "Mythology", "In Greco-Roman mythology, Aeneas is a Trojan hero who, according to legend, survived the Trojan War and traveled to found the Roman lineage, but he did not conquer the world."),
            zh = LocalizedContent("哪位希腊罗马国王征服了世界？", listOf("阿喀琉斯", "赫拉克勒斯", "亚历山大", "埃涅阿斯"), "神话", "在希腊罗马神话中，埃涅阿斯是特洛伊英雄，据传说他在特洛伊战争中幸存并旅行建立了罗马血统，但他并未征服世界。"),
            es = LocalizedContent("¿Qué rey grecorromano conquistó el mundo?", listOf("Aquiles", "Hércules", "Alejandro", "Eneas"), "Mitología", "En la mitología grecorromana, Eneas es un héroe troyano que, según la leyenda, sobrevivió a la guerra de Troya y viajó para fundar el linaje romano, pero no conquistó el mundo.")
        ),
        BilingualQuestion(
            id = 51758, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le symbole de Poséidon?", listOf("Épée", "Éclair", "Trident", "Arc"), "Mythologie", "Dans la mythologie grecque, Poséidon est souvent représenté avec un trident, et non une épée, qui symbolise son pouvoir sur les mers et les tremblements de terre."),
            en = LocalizedContent("What is the symbol of Poseidon?", listOf("Sword", "Lightning bolt", "Trident", "Bow"), "Mythology", "In Greek mythology, Poseidon is often depicted with a trident, not a sword, which symbolizes his power over the seas and earthquakes."),
            zh = LocalizedContent("波塞冬的象征是什么？", listOf("剑", "闪电", "三叉戟", "弓"), "神话", "在希腊神话中，波塞冬通常被描绘为手持三叉戟，而非剑，三叉戟象征着他掌管海洋和地震的力量。"),
            es = LocalizedContent("¿Cuál es el símbolo de Poseidón?", listOf("Espada", "Rayo", "Tridente", "Arco"), "Mitología", "En la mitología griega, Poseidón suele representarse con un tridente, no una espada, que simboliza su poder sobre los mares y los terremotos.")
        ),
        BilingualQuestion(
            id = 51759, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le symbole d'Athéna?", listOf("Hibou", "Chouette", "Aigle", "Sphinx"), "Mythologie", "Dans la mythologie grecque, Athéna, déesse de la sagesse et de la guerre stratégique, avait pour emblème la chouette, symbole de la connaissance et de la clairvoyance."),
            en = LocalizedContent("What is the symbol of Athena?", listOf("Owl", "Owl", "Eagle", "Sphinx"), "Mythology", "In Greek mythology, Athena, goddess of wisdom and strategic warfare, had the owl as her emblem, symbolizing knowledge and foresight."),
            zh = LocalizedContent("雅典娜的象征是什么？", listOf("猫头鹰", "猫头鹰", "鹰", "斯芬克斯"), "神话", "在希腊神话中，智慧与战略战争女神雅典娜的象征是猫头鹰，代表知识与远见。"),
            es = LocalizedContent("¿Cuál es el símbolo de Atenea?", listOf("Búho", "Lechuza", "Águila", "Esfinge"), "Mitología", "En la mitología griega, Atenea, diosa de la sabiduría y la guerra estratégica, tenía como emblema la lechuza, símbolo del conocimiento y la clarividencia.")
        ),
        BilingualQuestion(
            id = 51760, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel dieu valkyrie servait dans la mythologie nordique?", listOf("Frigg", "Odin", "Heimdall", "Skadi"), "Mythologie", "Heimdall est le dieu gardien du Bifröst, le pont arc-en-ciel, et non une valkyrie. Les valkyries sont des servantes d'Odin, et non des dieux."),
            en = LocalizedContent("Which god served as a valkyrie in Norse mythology?", listOf("Frigg", "Odin", "Heimdall", "Skadi"), "Mythology", "Heimdall is the guardian god of Bifröst, the rainbow bridge, and not a valkyrie. Valkyries are servants of Odin, not gods."),
            zh = LocalizedContent("在北欧神话中，哪位神担任女武神？", listOf("弗丽嘉", "奥丁", "海姆达尔", "斯卡蒂"), "神话", "海姆达尔是彩虹桥比弗罗斯特的守护神，而非女武神。女武神是奥丁的侍女，而非神祇。"),
            es = LocalizedContent("¿Qué dios servía como valquiria en la mitología nórdica?", listOf("Frigg", "Odín", "Heimdall", "Skadi"), "Mitología", "Heimdall es el dios guardián del Bifröst, el puente arcoíris, y no una valquiria. Las valquirias son sirvientas de Odín, no dioses.")
        ),
        BilingualQuestion(
            id = 51761, correctIndex = 3, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le nom de l'arbre cosmique nordique?", listOf("Yggdrasil", "Bifrost", "Asgard", "Midgard"), "Mythologie", "Dans la mythologie nordique, l'arbre cosmique est Yggdrasil, et non Midgard, qui désigne le monde des humains."),
            en = LocalizedContent("What is the name of the Norse cosmic tree?", listOf("Yggdrasil", "Bifrost", "Asgard", "Midgard"), "Mythology", "In Norse mythology, the cosmic tree is Yggdrasil, not Midgard, which refers to the world of humans."),
            zh = LocalizedContent("北欧神话中的世界树叫什么？", listOf("尤克特拉希尔", "比弗罗斯特", "阿斯加德", "米德加德"), "神话", "在北欧神话中，世界树是尤克特拉希尔，而非米德加德，后者指人类世界。"),
            es = LocalizedContent("¿Cuál es el nombre del árbol cósmico nórdico?", listOf("Yggdrasil", "Bifrost", "Asgard", "Midgard"), "Mitología", "En la mitología nórdica, el árbol cósmico es Yggdrasil, no Midgard, que se refiere al mundo de los humanos.")
        ),
        BilingualQuestion(
            id = 51762, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Combien de mondes sont reliés par Yggdrasil?", listOf("3", "5", "7", "9"), "Mythologie", "Dans la mythologie nordique, l'arbre cosmique Yggdrasil relie neuf mondes, mais les trois principaux sont Asgard, Midgard et Helheim."),
            en = LocalizedContent("How many worlds are connected by Yggdrasil?", listOf("3", "5", "7", "9"), "Mythology", "In Norse mythology, the cosmic tree Yggdrasil connects nine worlds, but the three main ones are Asgard, Midgard, and Helheim."),
            zh = LocalizedContent("尤克特拉希尔连接了多少个世界？", listOf("3", "5", "7", "9"), "神话", "在北欧神话中，世界树尤克特拉希尔连接九个世界，但主要的三个是阿斯加德、米德加德和赫尔海姆。"),
            es = LocalizedContent("¿Cuántos mundos están conectados por Yggdrasil?", listOf("3", "5", "7", "9"), "Mitología", "En la mitología nórdica, el árbol cósmico Yggdrasil conecta nueve mundos, pero los tres principales son Asgard, Midgard y Helheim.")
        ),
        BilingualQuestion(
            id = 51763, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le nom de la fin du monde dans la mythologie nordique?", listOf("Apocalypse", "Ragnarok", "Gotterdammerung", "Apocalypsis"), "Mythologie", "Dans la mythologie nordique, Ragnarök désigne la série d'événements apocalyptiques incluant une grande bataille entre les dieux et les géants, menant à la destruction et à la renaissance du monde."),
            en = LocalizedContent("What is the name of the end of the world in Norse mythology?", listOf("Apocalypse", "Ragnarok", "Gotterdammerung", "Apocalypsis"), "Mythology", "In Norse mythology, Ragnarök refers to the series of apocalyptic events including a great battle between the gods and giants, leading to the destruction and rebirth of the world."),
            zh = LocalizedContent("北欧神话中世界末日的名称是什么？", listOf("天启", "诸神黄昏", "众神黄昏", "启示录"), "神话", "在北欧神话中，诸神黄昏（Ragnarök）指一系列末日事件，包括神与巨人之间的大战，导致世界毁灭与重生。"),
            es = LocalizedContent("¿Cuál es el nombre del fin del mundo en la mitología nórdica?", listOf("Apocalipsis", "Ragnarok", "Gotterdammerung", "Apocalypsis"), "Mitología", "En la mitología nórdica, Ragnarök se refiere a la serie de eventos apocalípticos que incluyen una gran batalla entre dioses y gigantes, llevando a la destrucción y renacimiento del mundo.")
        ),
        BilingualQuestion(
            id = 51764, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel loup va dévorer Odin lors du Ragnarok?", listOf("Fenrir", "Jörmungandr", "Nidhogg", "Garmr"), "Mythologie", "Nidhogg est un dragon, non un loup, qui ronge les racines d'Yggdrasil. Le loup qui dévore Odin lors du Ragnarök est Fenrir."),
            en = LocalizedContent("Which wolf will devour Odin during Ragnarok?", listOf("Fenrir", "Jörmungandr", "Nidhogg", "Garmr"), "Mythology", "Nidhogg is a dragon, not a wolf, that gnaws at the roots of Yggdrasil. The wolf that devours Odin during Ragnarök is Fenrir."),
            zh = LocalizedContent("哪只狼会在诸神黄昏时吞噬奥丁？", listOf("芬里尔", "耶梦加得", "尼德霍格", "加姆"), "神话", "尼德霍格是一条龙，而非狼，它啃食尤克特拉希尔的树根。在诸神黄昏中吞噬奥丁的狼是芬里尔。"),
            es = LocalizedContent("¿Qué lobo devorará a Odín durante el Ragnarok?", listOf("Fenrir", "Jörmungandr", "Nidhogg", "Garmr"), "Mitología", "Nidhogg es un dragón, no un lobo, que roe las raíces de Yggdrasil. El lobo que devora a Odín durante el Ragnarök es Fenrir.")
        ),
    )

    private fun part2(): List<BilingualQuestion> = listOf(
        BilingualQuestion(
            id = 51765, correctIndex = 3, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel dieu des enfers était mari de Perséphone?", listOf("Pluton", "Hadès", "Charon", "Erebus"), "Mythologie", "Hadès, le dieu des enfers, enleva Perséphone pour en faire son épouse, mais Erebus est une divinité primordiale des ténèbres, non son mari."),
            en = LocalizedContent("Which god of the underworld was the husband of Persephone?", listOf("Pluto", "Hades", "Charon", "Erebus"), "Mythology", "Hades, the god of the underworld, abducted Persephone to be his wife, but Erebus is a primordial deity of darkness, not her husband."),
            zh = LocalizedContent("哪位冥界之神是珀耳塞福涅的丈夫？", listOf("普路托", "哈迪斯", "卡戎", "厄瑞玻斯"), "神话", "哈迪斯，冥界之神，绑架了珀耳塞福涅为妻，但厄瑞玻斯是原始黑暗神，并非其丈夫。"),
            es = LocalizedContent("¿Qué dios del inframundo era esposo de Perséfone?", listOf("Plutón", "Hades", "Caronte", "Érebo"), "Mitología", "Hades, el dios del inframundo, raptó a Perséfone para hacerla su esposa, pero Érebo es una deidad primordial de la oscuridad, no su esposo.")
        ),
        BilingualQuestion(
            id = 51766, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Combien de mois Perséphone doit-elle passer aux enfers?", listOf("3", "6", "9", "12"), "Mythologie", "Selon le mythe grec, Perséphone passe six mois aux Enfers avec Hadès, mais le nombre de mois varie selon les versions ; la réponse 3 correspond à une variante où elle y séjourne trois mois, symbolisant l'hiver."),
            en = LocalizedContent("How many months must Persephone spend in the underworld?", listOf("3", "6", "9", "12"), "Mythology", "According to the Greek myth, Persephone spends six months in the Underworld with Hades, but the number varies; the answer 3 corresponds to a variant where she stays three months, symbolizing winter."),
            zh = LocalizedContent("珀耳塞福涅必须在冥界待多少个月？", listOf("3", "6", "9", "12"), "神话", "根据希腊神话，珀耳塞福涅与哈迪斯在冥界度过六个月，但数字因版本而异；答案3对应一种变体，她停留三个月，象征冬天。"),
            es = LocalizedContent("¿Cuántos meses debe pasar Perséfone en el inframundo?", listOf("3", "6", "9", "12"), "Mitología", "Según el mito griego, Perséfone pasa seis meses en el Inframundo con Hades, pero el número varía; la respuesta 3 corresponde a una variante donde permanece tres meses, simbolizando el invierno.")
        ),
        BilingualQuestion(
            id = 51767, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le fils de Héra et Zeus?", listOf("Arès", "Apollon", "Héphaïstos", "Hermès"), "Mythologie", "Apollon est le fils de Zeus et de Léto, et non d'Héra. Héra était l'épouse de Zeus mais n'a pas donné naissance à Apollon."),
            en = LocalizedContent("Who is the son of Hera and Zeus?", listOf("Ares", "Apollo", "Hephaestus", "Hermes"), "Mythology", "Apollo is the son of Zeus and Leto, not Hera. Hera was Zeus's wife but did not give birth to Apollo."),
            zh = LocalizedContent("赫拉和宙斯的儿子是谁？", listOf("阿瑞斯", "阿波罗", "赫菲斯托斯", "赫尔墨斯"), "神话", "阿波罗是宙斯和勒托的儿子，而非赫拉。赫拉是宙斯的妻子，但并未生下阿波罗。"),
            es = LocalizedContent("¿Quién es el hijo de Hera y Zeus?", listOf("Ares", "Apolo", "Hefesto", "Hermes"), "Mitología", "Apolo es hijo de Zeus y Leto, no de Hera. Hera era la esposa de Zeus pero no dio a luz a Apolo.")
        ),
        BilingualQuestion(
            id = 51768, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel dieu de la mer était le père de Persée?", listOf("Océan", "Poséidon", "Amphitrite", "Tritone"), "Mythologie", "Amphitrite est la déesse de la mer, épouse de Poséidon, et non le père de Persée. Persée est en réalité le fils de Zeus et de Danaé."),
            en = LocalizedContent("Which sea god was the father of Perseus?", listOf("Oceanus", "Poseidon", "Amphitrite", "Triton"), "Mythology", "Amphitrite is the goddess of the sea, wife of Poseidon, not the father of Perseus. Perseus is actually the son of Zeus and Danaë."),
            zh = LocalizedContent("哪位海神是珀尔修斯的父亲？", listOf("俄刻阿诺斯", "波塞冬", "安菲特里忒", "特里同"), "神话", "安菲特里忒是海神女，波塞冬的妻子，并非珀尔修斯的父亲。珀尔修斯实际上是宙斯和达那厄的儿子。"),
            es = LocalizedContent("¿Qué dios del mar era el padre de Perseo?", listOf("Océano", "Poseidón", "Anfitrite", "Tritón"), "Mitología", "Anfitrite es la diosa del mar, esposa de Poseidón, no el padre de Perseo. Perseo es en realidad hijo de Zeus y Dánae.")
        ),
        BilingualQuestion(
            id = 51769, correctIndex = 3, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le nom du fils de Poséidon et de la Méduse?", listOf("Chrysaor", "Pégase", "Gorgone", "Chimère"), "Mythologie", "Poséidon et Méduse eurent pour enfants Pégase et Chrysaor, mais pas la Chimère, qui est une créature issue de la mythologie grecque, fille de Typhon et d'Échidna."),
            en = LocalizedContent("What is the name of the son of Poseidon and Medusa?", listOf("Chrysaor", "Pegasus", "Gorgon", "Chimera"), "Mythology", "Poseidon and Medusa had children Pegasus and Chrysaor, but not the Chimera, which is a creature from Greek mythology, daughter of Typhon and Echidna."),
            zh = LocalizedContent("波塞冬和美杜莎的儿子叫什么？", listOf("克律萨俄耳", "珀伽索斯", "戈耳工", "喀迈拉"), "神话", "波塞冬和美杜莎生有珀伽索斯和克律萨俄耳，但喀迈拉是希腊神话中的怪物，堤丰和厄喀德那的女儿。"),
            es = LocalizedContent("¿Cuál es el nombre del hijo de Poseidón y Medusa?", listOf("Crisaor", "Pegaso", "Gorgona", "Quimera"), "Mitología", "Poseidón y Medusa tuvieron hijos Pegaso y Crisaor, pero no la Quimera, que es una criatura de la mitología griega, hija de Tifón y Equidna.")
        ),
        BilingualQuestion(
            id = 51770, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel animal magique était le compagnon d'Apollon?", listOf("Corbeau", "Coq", "Lion", "Serpent"), "Mythologie", "Dans la mythologie grecque, le corbeau était l'oiseau sacré d'Apollon, souvent associé à la divination et messager du dieu."),
            en = LocalizedContent("Which magical animal was the companion of Apollo?", listOf("Raven", "Rooster", "Lion", "Serpent"), "Mythology", "In Greek mythology, the raven was Apollo's sacred bird, often associated with divination and as a messenger of the god."),
            zh = LocalizedContent("哪种神奇动物是阿波罗的同伴？", listOf("乌鸦", "公鸡", "狮子", "蛇"), "神话", "在希腊神话中，乌鸦是阿波罗的神鸟，常与占卜相关，并作为神的信使。"),
            es = LocalizedContent("¿Qué animal mágico era el compañero de Apolo?", listOf("Cuervo", "Gallo", "León", "Serpiente"), "Mitología", "En la mitología griega, el cuervo era el ave sagrada de Apolo, a menudo asociada con la adivinación y como mensajero del dios.")
        ),
        BilingualQuestion(
            id = 51771, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel dieu jouait de la lyre?", listOf("Apollon", "Orphée", "Hermès", "Mercure"), "Mythologie", "Orphée, figure de la mythologie grecque, était un musicien et poète légendaire dont le talent pour la lyre charmait même les dieux et les créatures des enfers."),
            en = LocalizedContent("Which god played the lyre?", listOf("Apollo", "Orpheus", "Hermes", "Mercury"), "Mythology", "Orpheus, a figure in Greek mythology, was a legendary musician and poet whose skill with the lyre charmed even the gods and creatures of the underworld."),
            zh = LocalizedContent("哪位神弹奏里拉琴？", listOf("阿波罗", "俄耳甫斯", "赫尔墨斯", "墨丘利"), "神话", "俄耳甫斯是希腊神话中的传奇音乐家和诗人，他的里拉琴技艺甚至能迷住众神和冥界生物。"),
            es = LocalizedContent("¿Qué dios tocaba la lira?", listOf("Apolo", "Orfeo", "Hermes", "Mercurio"), "Mitología", "Orfeo, figura de la mitología griega, fue un músico y poeta legendario cuya habilidad con la lira encantaba incluso a los dioses y criaturas del inframundo.")
        ),
        BilingualQuestion(
            id = 51772, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le vrai nom du héros Achille dans l'épopée?", listOf("Pélée", "Achillée", "Achillieus", "Nérée"), "Mythologie", "Dans les textes grecs anciens, notamment l’Iliade, le héros est appelé Achilleus, forme hellénisée de son nom, qui a été latinisée en Achille en français."),
            en = LocalizedContent("What is the true name of the hero Achilles in the epic?", listOf("Peleus", "Achillea", "Achilleus", "Nereus"), "Mythology", "In ancient Greek texts, especially the Iliad, the hero is called Achilleus, the Hellenized form of his name, which was Latinized as Achilles in French."),
            zh = LocalizedContent("史诗中英雄阿喀琉斯的真名是什么？", listOf("珀琉斯", "阿喀利亚", "阿喀琉斯", "涅柔斯"), "神话", "在古希腊文本中，尤其是《伊利亚特》，英雄被称为阿喀琉斯（Achilleus），这是其名字的希腊化形式，在法语中拉丁化为Achille。"),
            es = LocalizedContent("¿Cuál es el verdadero nombre del héroe Aquiles en la épica?", listOf("Peleo", "Aquilea", "Aquileo", "Nereo"), "Mitología", "En los textos griegos antiguos, especialmente la Ilíada, el héroe se llama Aquileo, forma helenizada de su nombre, latinizada como Aquiles en español.")
        ),
        BilingualQuestion(
            id = 51773, correctIndex = 3, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel point faible Achille avait-il?", listOf("Cœur", "Talon", "Tête", "Genou"), "Mythologie", "Selon la légende, sa mère Thétis le plongea dans le Styx pour le rendre invulnérable, mais le talon par lequel elle le tenait resta vulnérable."),
            en = LocalizedContent("What weak point did Achilles have?", listOf("Heart", "Heel", "Head", "Knee"), "Mythology", "According to legend, his mother Thetis dipped him in the Styx to make him invulnerable, but the heel by which she held him remained vulnerable."),
            zh = LocalizedContent("阿喀琉斯有什么弱点？", listOf("心脏", "脚踝", "头部", "膝盖"), "神话", "根据传说，他的母亲忒提斯将他浸入冥河使其刀枪不入，但她握住的脚踝仍为弱点。"),
            es = LocalizedContent("¿Qué punto débil tenía Aquiles?", listOf("Corazón", "Talón", "Cabeza", "Rodilla"), "Mitología", "Según la leyenda, su madre Tetis lo sumergió en el Estigia para hacerlo invulnerable, pero el talón por el que lo sostenía seguía siendo vulnerable.")
        ),
        BilingualQuestion(
            id = 51774, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel héros troyen a fui sa ville?", listOf("Hector", "Énée", "Priam", "Paris"), "Mythologie", "Hector est le héros troyen qui a combattu les Grecs, mais il a fui momentanément Achille avant de l'affronter et d'être tué."),
            en = LocalizedContent("Which Trojan hero fled his city?", listOf("Hector", "Aeneas", "Priam", "Paris"), "Mythology", "Hector is the Trojan hero who fought the Greeks, but he momentarily fled from Achilles before confronting him and being killed."),
            zh = LocalizedContent("哪位特洛伊英雄逃离了他的城市？", listOf("赫克托耳", "埃涅阿斯", "普里阿摩斯", "帕里斯"), "神话", "赫克托耳是特洛伊英雄，曾与希腊人作战，但他曾短暂逃离阿喀琉斯，随后迎战并被杀。"),
            es = LocalizedContent("¿Qué héroe troyano huyó de su ciudad?", listOf("Héctor", "Eneas", "Príamo", "Paris"), "Mitología", "Héctor es el héroe troyano que luchó contra los griegos, pero huyó momentáneamente de Aquiles antes de enfrentarlo y ser asesinado.")
        ),
        BilingualQuestion(
            id = 51775, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le fondateur légendaire de Rome selon la légende?", listOf("Énée", "Romulus", "Rémus", "Tarquin"), "Mythologie", "Selon la légende, Romulus et son frère jumeau Rémus, fils de Mars et de Rhéa Silvia, fondèrent Rome en 753 av. J.-C. après avoir été allaités par une louve. Romulus tua Rémus lors d'une dispute et devint le premier roi de Rome."),
            en = LocalizedContent("Who is the legendary founder of Rome according to legend?", listOf("Aeneas", "Romulus", "Remus", "Tarquin"), "Mythology", "According to legend, Romulus and his twin brother Remus, sons of Mars and Rhea Silvia, founded Rome in 753 BC after being suckled by a she-wolf. Romulus killed Remus in a dispute and became the first king of Rome."),
            zh = LocalizedContent("根据传说，罗马的传奇创始人是谁？", listOf("埃涅阿斯", "罗慕路斯", "雷穆斯", "塔奎尼乌斯"), "神话", "根据传说，罗慕路斯和他的孪生兄弟雷穆斯是战神玛尔斯和瑞亚·西尔维亚的儿子，被母狼哺乳后在公元前753年建立了罗马。罗慕路斯在一次争执中杀死了雷穆斯，成为罗马的第一位国王。"),
            es = LocalizedContent("¿Quién es el fundador legendario de Roma según la leyenda?", listOf("Eneas", "Rómulo", "Remo", "Tarquinio"), "Mitología", "Según la leyenda, Rómulo y su hermano gemelo Remo, hijos de Marte y Rea Silvia, fundaron Roma en el 753 a.C. después de ser amamantados por una loba. Rómulo mató a Remo en una disputa y se convirtió en el primer rey de Roma.")
        ),
        BilingualQuestion(
            id = 51776, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le nom du caducée d'Hermès?", listOf("Bâton", "Caducée ailé", "Trident", "Lyre"), "Mythologie", "Le caducée d'Hermès est un bâton entouré de deux serpents, souvent confondu avec le trident de Poséidon, mais le trident est l'attribut du dieu des mers."),
            en = LocalizedContent("What is the name of Hermes' caduceus?", listOf("Staff", "Winged caduceus", "Trident", "Lyre"), "Mythology", "Hermes' caduceus is a staff entwined with two snakes, often confused with Poseidon's trident, but the trident is the attribute of the god of the sea."),
            zh = LocalizedContent("赫尔墨斯的双蛇杖叫什么？", listOf("手杖", "带翼的双蛇杖", "三叉戟", "里拉琴"), "神话", "赫尔墨斯的双蛇杖是一根缠绕着两条蛇的手杖，常与波塞冬的三叉戟混淆，但三叉戟是海神的标志。"),
            es = LocalizedContent("¿Cuál es el nombre del caduceo de Hermes?", listOf("Bastón", "Caduceo alado", "Tridente", "Lira"), "Mitología", "El caduceo de Hermes es un bastón rodeado por dos serpientes, a menudo confundido con el tridente de Poseidón, pero el tridente es el atributo del dios del mar.")
        ),
        BilingualQuestion(
            id = 51777, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel dieu chinois représente la richesse?", listOf("Kuan Yu", "Fukurokuju", "Hotei", "Ganesha"), "Mythologie", "Ganesha est un dieu hindou, pas chinois. Dans la mythologie chinoise, le dieu de la richesse est Caishen."),
            en = LocalizedContent("Which Chinese god represents wealth?", listOf("Kuan Yu", "Fukurokuju", "Hotei", "Ganesha"), "Mythology", "Ganesha is a Hindu god, not Chinese. In Chinese mythology, the god of wealth is Caishen."),
            zh = LocalizedContent("哪位中国神祇代表财富？", listOf("关羽", "福禄寿", "布袋和尚", "象头神"), "神话", "象头神是印度神祇，不是中国的。在中国神话中，财神是赵公明或关公等。"),
            es = LocalizedContent("¿Qué dios chino representa la riqueza?", listOf("Kuan Yu", "Fukurokuju", "Hotei", "Ganesha"), "Mitología", "Ganesha es un dios hindú, no chino. En la mitología china, el dios de la riqueza es Caishen.")
        ),
        BilingualQuestion(
            id = 51778, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de déesses japonaises de la tempête existait-il?", listOf("1", "2", "3", "4"), "Mythologie", "Susanoo, le dieu de la tempête, est une divinité masculine. Il n'existe pas de déesse de la tempête dans la mythologie japonaise."),
            en = LocalizedContent("How many Japanese storm goddesses existed?", listOf("1", "2", "3", "4"), "Mythology", "Susanoo, the god of storms, is a male deity. There is no storm goddess in Japanese mythology."),
            zh = LocalizedContent("日本神话中有几位风暴女神？", listOf("1", "2", "3", "4"), "神话", "须佐之男命是风暴之神，为男性神祇。日本神话中没有风暴女神。"),
            es = LocalizedContent("¿Cuántas diosas japonesas de la tormenta existían?", listOf("1", "2", "3", "4"), "Mitología", "Susanoo, el dios de la tormenta, es una deidad masculina. No existe una diosa de la tormenta en la mitología japonesa.")
        ),
        BilingualQuestion(
            id = 51779, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le nom de la plus grande déesse du soleil?", listOf("Amaterasu", "Tsukuyomi", "Susanoo", "Izanami"), "Mythologie", "Tsukuyomi est en réalité le dieu de la Lune dans la mythologie japonaise, et non une déesse du soleil. La plus grande déesse du soleil est Amaterasu, sa sœur."),
            en = LocalizedContent("What is the name of the greatest sun goddess?", listOf("Amaterasu", "Tsukuyomi", "Susanoo", "Izanami"), "Mythology", "Tsukuyomi is actually the god of the moon in Japanese mythology, not a sun goddess. The greatest sun goddess is Amaterasu, his sister."),
            zh = LocalizedContent("最伟大的太阳女神叫什么名字？", listOf("天照大神", "月读命", "须佐之男命", "伊邪那美"), "神话", "月读命实际上是日本神话中的月神，而非太阳女神。最伟大的太阳女神是他的姐姐天照大神。"),
            es = LocalizedContent("¿Cuál es el nombre de la diosa del sol más grande?", listOf("Amaterasu", "Tsukuyomi", "Susanoo", "Izanami"), "Mitología", "Tsukuyomi es en realidad el dios de la luna en la mitología japonesa, no una diosa del sol. La diosa del sol más grande es Amaterasu, su hermana.")
        ),
        BilingualQuestion(
            id = 51780, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel dieu mésopotamien créa l'humanité?", listOf("Enlil", "Enuma Elish", "Mardouk", "Anunnaki"), "Mythologie", "Dans l'épopée babylonienne de la création, l'Enuma Elish, Mardouk tue Tiamat et façonne les humains avec le sang du dieu rebelle Kingu pour servir les dieux."),
            en = LocalizedContent("Which Mesopotamian god created humanity?", listOf("Enlil", "Enuma Elish", "Marduk", "Anunnaki"), "Mythology", "In the Babylonian creation epic, the Enuma Elish, Marduk kills Tiamat and fashions humans from the blood of the rebel god Kingu to serve the gods."),
            zh = LocalizedContent("哪位美索不达米亚神祇创造了人类？", listOf("恩利尔", "埃努玛·埃利什", "马尔杜克", "阿努纳奇"), "神话", "在巴比伦创世史诗《埃努玛·埃利什》中，马尔杜克杀死提亚马特，并用反叛神金古的血液塑造了人类，以侍奉众神。"),
            es = LocalizedContent("¿Qué dios mesopotámico creó a la humanidad?", listOf("Enlil", "Enuma Elish", "Marduk", "Anunnaki"), "Mitología", "En la epopeya babilónica de la creación, el Enuma Elish, Marduk mata a Tiamat y moldea a los humanos con la sangre del dios rebelde Kingu para servir a los dioses.")
        ),
        BilingualQuestion(
            id = 51781, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le nom du déluge dans la mythologie mésopotamienne?", listOf("Inondation", "Abzu", "Dilmun", "Deluge d'Atrahasis"), "Mythologie", "Dans la mythologie mésopotamienne, le récit du Déluge d'Atrahasis raconte comment le dieu Enki avertit le héros Atrahasis de construire un bateau pour survivre à une inondation envoyée par les dieux."),
            en = LocalizedContent("What is the name of the flood in Mesopotamian mythology?", listOf("Inundation", "Abzu", "Dilmun", "Atrahasis Flood"), "Mythology", "In Mesopotamian mythology, the Atrahasis Flood story tells how the god Enki warned the hero Atrahasis to build a boat to survive a flood sent by the gods."),
            zh = LocalizedContent("美索不达米亚神话中的大洪水叫什么？", listOf("洪水", "阿普苏", "迪尔蒙", "阿特拉哈西斯洪水"), "神话", "在美索不达米亚神话中，阿特拉哈西斯洪水故事讲述了恩基神警告英雄阿特拉哈西斯建造船只，以躲避众神降下的洪水。"),
            es = LocalizedContent("¿Cuál es el nombre del diluvio en la mitología mesopotámica?", listOf("Inundación", "Abzu", "Dilmun", "Diluvio de Atrahasis"), "Mitología", "En la mitología mesopotámica, el relato del Diluvio de Atrahasis cuenta cómo el dios Enki advirtió al héroe Atrahasis que construyera un barco para sobrevivir a una inundación enviada por los dioses.")
        ),
        BilingualQuestion(
            id = 51782, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel dieu aztèque demandait des sacrifices?", listOf("Huitzilopochtli", "Quetzalcóatl", "Tezcatlipoca", "Xipe Totec"), "Mythologie", "Huitzilopochtli, dieu solaire et de la guerre aztèque, exigeait des sacrifices humains pour nourrir le soleil et assurer le cycle du jour."),
            en = LocalizedContent("Which Aztec god demanded sacrifices?", listOf("Huitzilopochtli", "Quetzalcoatl", "Tezcatlipoca", "Xipe Totec"), "Mythology", "Huitzilopochtli, the Aztec sun and war god, demanded human sacrifices to nourish the sun and ensure the cycle of day."),
            zh = LocalizedContent("哪位阿兹特克神祇要求献祭？", listOf("维齐洛波奇特利", "羽蛇神", "特斯卡特利波卡", "希佩·托特克"), "神话", "维齐洛波奇特利是阿兹特克的太阳神和战神，要求以人祭来滋养太阳，确保白昼循环。"),
            es = LocalizedContent("¿Qué dios azteca exigía sacrificios?", listOf("Huitzilopochtli", "Quetzalcóatl", "Tezcatlipoca", "Xipe Tótec"), "Mitología", "Huitzilopochtli, dios solar y de la guerra azteca, exigía sacrificios humanos para alimentar al sol y asegurar el ciclo del día.")
        ),
        BilingualQuestion(
            id = 51783, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le panthéon des dieux romains?", listOf("Olympe", "Capitole", "Forum", "Panthéon"), "Mythologie", "Le Capitole était la colline sacrée de Rome où se dressait le temple principal dédié à Jupiter, Junon et Minerve, formant le noyau du panthéon romain."),
            en = LocalizedContent("What is the pantheon of Roman gods?", listOf("Olympus", "Capitoline", "Forum", "Pantheon"), "Mythology", "The Capitoline Hill was the sacred hill of Rome where the main temple dedicated to Jupiter, Juno, and Minerva stood, forming the core of the Roman pantheon."),
            zh = LocalizedContent("罗马神祇的万神殿是什么？", listOf("奥林匹斯", "卡比托利欧", "罗马广场", "万神殿"), "神话", "卡比托利欧山是罗马的圣山，矗立着供奉朱庇特、朱诺和密涅瓦的主神庙，构成了罗马万神殿的核心。"),
            es = LocalizedContent("¿Cuál es el panteón de los dioses romanos?", listOf("Olimpo", "Capitolio", "Foro", "Panteón"), "Mitología", "El Capitolio era la colina sagrada de Roma donde se alzaba el templo principal dedicado a Júpiter, Juno y Minerva, formando el núcleo del panteón romano.")
        ),
        BilingualQuestion(
            id = 51784, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel dieu romain équivaut à Apollon?", listOf("Apollo", "Mars", "Mercure", "Vulcain"), "Mythologie", "Apollon est un dieu grec, et son équivalent romain est Apollon lui-même, car les Romains ont conservé son nom et ses attributs sans le renommer. Mercure correspond à Hermès."),
            en = LocalizedContent("Which Roman god is equivalent to Apollo?", listOf("Apollo", "Mars", "Mercury", "Vulcan"), "Mythology", "Apollo is a Greek god, and his Roman equivalent is Apollo himself, as the Romans kept his name and attributes without renaming him. Mercury corresponds to Hermes."),
            zh = LocalizedContent("哪位罗马神祇相当于阿波罗？", listOf("阿波罗", "马尔斯", "墨丘利", "伏尔甘"), "神话", "阿波罗是希腊神祇，他的罗马对应神就是阿波罗本人，因为罗马人保留了其名称和属性而未改名。墨丘利对应赫尔墨斯。"),
            es = LocalizedContent("¿Qué dios romano equivale a Apolo?", listOf("Apolo", "Marte", "Mercurio", "Vulcano"), "Mitología", "Apolo es un dios griego, y su equivalente romano es el propio Apolo, ya que los romanos conservaron su nombre y atributos sin renombrarlo. Mercurio corresponde a Hermes.")
        ),
        BilingualQuestion(
            id = 51785, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le nom de la déesse de la sagesse grecque?", listOf("Héra", "Athéna", "Métis", "Déméter"), "Mythologie", "Déméter est la déesse de l'agriculture et des moissons dans la mythologie grecque, non de la sagesse. La déesse de la sagesse est Athéna."),
            en = LocalizedContent("What is the name of the Greek goddess of wisdom?", listOf("Hera", "Athena", "Metis", "Demeter"), "Mythology", "Demeter is the goddess of agriculture and harvest in Greek mythology, not wisdom. The goddess of wisdom is Athena."),
            zh = LocalizedContent("希腊智慧女神的名字是什么？", listOf("赫拉", "雅典娜", "墨提斯", "得墨忒耳"), "神话", "得墨忒耳是希腊神话中农业和丰收的女神，而非智慧女神。智慧女神是雅典娜。"),
            es = LocalizedContent("¿Cuál es el nombre de la diosa griega de la sabiduría?", listOf("Hera", "Atenea", "Metis", "Deméter"), "Mitología", "Deméter es la diosa de la agricultura y las cosechas en la mitología griega, no de la sabiduría. La diosa de la sabiduría es Atenea.")
        ),
        BilingualQuestion(
            id = 51786, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le symbole de Zeus?", listOf("Trident", "Éclair", "Couronne", "Sceptre"), "Mythologie", "Le trident est en réalité l'attribut de Poséidon, dieu de la mer. Le symbole de Zeus est le foudre, une arme représentant la foudre."),
            en = LocalizedContent("What is the symbol of Zeus?", listOf("Trident", "Thunderbolt", "Crown", "Scepter"), "Mythology", "The trident is actually the attribute of Poseidon, god of the sea. The symbol of Zeus is the thunderbolt, a weapon representing lightning."),
            zh = LocalizedContent("宙斯的象征是什么？", listOf("三叉戟", "闪电", "王冠", "权杖"), "神话", "三叉戟实际上是海神波塞冬的象征。宙斯的象征是闪电，一种代表雷电的武器。"),
            es = LocalizedContent("¿Cuál es el símbolo de Zeus?", listOf("Tridente", "Rayo", "Corona", "Cetro"), "Mitología", "El tridente es en realidad el atributo de Poseidón, dios del mar. El símbolo de Zeus es el rayo, un arma que representa el relámpago.")
        ),
        BilingualQuestion(
            id = 51787, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel dieu grec était le messager des dieux?", listOf("Apollon", "Hermès", "Ares", "Vulcain"), "Mythologie", "Hermès était le messager des dieux dans la mythologie grecque, connu pour sa vitesse et son rôle de guide des âmes vers les Enfers."),
            en = LocalizedContent("Which Greek god was the messenger of the gods?", listOf("Apollo", "Hermes", "Ares", "Vulcan"), "Mythology", "Hermes was the messenger of the gods in Greek mythology, known for his speed and his role as guide of souls to the underworld."),
            zh = LocalizedContent("哪位希腊神是众神的信使？", listOf("阿波罗", "赫尔墨斯", "阿瑞斯", "伏尔甘"), "神话", "赫尔墨斯是希腊神话中众神的信使，以速度著称，并担任灵魂向导前往冥界。"),
            es = LocalizedContent("¿Qué dios griego era el mensajero de los dioses?", listOf("Apolo", "Hermes", "Ares", "Vulcano"), "Mitología", "Hermes era el mensajero de los dioses en la mitología griega, conocido por su velocidad y su papel como guía de las almas al inframundo.")
        ),
        BilingualQuestion(
            id = 51788, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le nom du peuple des géants dans la mythologie scandinave?", listOf("Géants", "Jotun", "Titan", "Gogmagog"), "Mythologie", "Dans la mythologie scandinave, les géants sont appelés les Jötunn, et non les Titans, qui appartiennent à la mythologie grecque."),
            en = LocalizedContent("What is the name of the race of giants in Norse mythology?", listOf("Giants", "Jotun", "Titan", "Gogmagog"), "Mythology", "In Norse mythology, the giants are called Jötunn, not Titans, which belong to Greek mythology."),
            zh = LocalizedContent("北欧神话中巨人的种族叫什么？", listOf("巨人", "约顿", "泰坦", "高格玛各"), "神话", "在北欧神话中，巨人被称为约顿，而非泰坦，泰坦属于希腊神话。"),
            es = LocalizedContent("¿Cómo se llama la raza de gigantes en la mitología nórdica?", listOf("Gigantes", "Jotun", "Titán", "Gogmagog"), "Mitología", "En la mitología nórdica, los gigantes se llaman Jötunn, no Titanes, que pertenecen a la mitología griega.")
        ),
        BilingualQuestion(
            id = 51789, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le vrai nome du Cyclope d'Ulysse?", listOf("Polyphème", "Gela", "Cyclops", "Monope"), "Mythologie", "Dans l'Odyssée, le Cyclope est nommé Polyphème, mais le nom \"Monope\" (un seul œil) est parfois utilisé comme traduction littérale de son apparence."),
            en = LocalizedContent("What is the real name of Odysseus' Cyclops?", listOf("Polyphemus", "Gela", "Cyclops", "Monope"), "Mythology", "In the Odyssey, the Cyclops is named Polyphemus, but the name \"Monope\" (one eye) is sometimes used as a literal translation of his appearance."),
            zh = LocalizedContent("奥德修斯的独眼巨人的真名是什么？", listOf("波吕斐摩斯", "格拉", "独眼巨人", "莫诺佩"), "神话", "在《奥德赛》中，独眼巨人名为波吕斐摩斯，但“莫诺佩”（独眼）有时被用作其外貌的直译。"),
            es = LocalizedContent("¿Cuál es el verdadero nombre del Cíclope de Odiseo?", listOf("Polifemo", "Gela", "Cíclope", "Monope"), "Mitología", "En la Odisea, el Cíclope se llama Polifemo, pero el nombre \"Monope\" (un ojo) se usa a veces como traducción literal de su apariencia.")
        ),
        BilingualQuestion(
            id = 51790, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien d'années Ulysse a-t-il mis à rentrer chez lui?", listOf("5", "7", "10", "15"), "Mythologie", "Dans l'Odyssée d'Homère, Ulysse met dix ans à revenir à Ithaque après la guerre de Troie, dont cinq ans sont consacrés à ses aventures et errances."),
            en = LocalizedContent("How many years did Odysseus take to return home?", listOf("5", "7", "10", "15"), "Mythology", "In Homer's Odyssey, Odysseus takes ten years to return to Ithaca after the Trojan War, of which five years are spent on his adventures and wanderings."),
            zh = LocalizedContent("奥德修斯花了多少年才回到家？", listOf("5", "7", "10", "15"), "神话", "在荷马的《奥德赛》中，奥德修斯在特洛伊战争后花了十年时间返回伊萨卡，其中五年用于冒险和漂泊。"),
            es = LocalizedContent("¿Cuántos años tardó Odiseo en regresar a casa?", listOf("5", "7", "10", "15"), "Mitología", "En la Odisea de Homero, Odiseo tarda diez años en regresar a Ítaca después de la guerra de Troya, de los cuales cinco años se dedican a sus aventuras y vagabundeos.")
        ),
        BilingualQuestion(
            id = 51791, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le nom de la magicienne qui gardait Ulysse?", listOf("Calypso", "Circé", "Sirène", "Naïade"), "Mythologie", "Dans l'Odyssée d'Homère, Circé est une magicienne qui retient Ulysse et ses compagnons sur son île d'Ééa, les transformant en animaux."),
            en = LocalizedContent("What is the name of the sorceress who detained Odysseus?", listOf("Calypso", "Circe", "Siren", "Naiad"), "Mythology", "In Homer's Odyssey, Circe is a sorceress who detains Odysseus and his companions on her island of Aeaea, turning them into animals."),
            zh = LocalizedContent("囚禁奥德修斯的女巫叫什么？", listOf("卡吕普索", "喀耳刻", "塞壬", "那伊阿得"), "神话", "在荷马的《奥德赛》中，喀耳刻是一位女巫，她在埃埃亚岛上囚禁了奥德修斯和他的同伴，并将他们变成动物。"),
            es = LocalizedContent("¿Cómo se llama la hechicera que retuvo a Odiseo?", listOf("Calipso", "Circe", "Sirena", "Náyade"), "Mitología", "En la Odisea de Homero, Circe es una hechicera que retiene a Odiseo y sus compañeros en su isla de Eea, transformándolos en animales.")
        ),
        BilingualQuestion(
            id = 51792, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le nom du guerrier Trojan rival d'Achille?", listOf("Paris", "Hector", "Ajax", "Énée"), "Mythologie", "Dans la mythologie grecque, Ajax est un héros troyen, fils de Télamon, qui s'oppose à Achille lors de la guerre de Troie, notamment dans l'Iliade d'Homère."),
            en = LocalizedContent("What is the name of the Trojan warrior rival to Achilles?", listOf("Paris", "Hector", "Ajax", "Aeneas"), "Mythology", "In Greek mythology, Ajax is a Trojan hero, son of Telamon, who opposes Achilles during the Trojan War, notably in Homer's Iliad."),
            zh = LocalizedContent("与阿喀琉斯敌对的特洛伊战士叫什么？", listOf("帕里斯", "赫克托耳", "埃阿斯", "埃涅阿斯"), "神话", "在希腊神话中，埃阿斯是特洛伊英雄，忒拉蒙之子，在特洛伊战争中与阿喀琉斯对抗，尤其在荷马的《伊利亚特》中。"),
            es = LocalizedContent("¿Cuál es el nombre del guerrero troyano rival de Aquiles?", listOf("Paris", "Héctor", "Áyax", "Eneas"), "Mitología", "En la mitología griega, Áyax es un héroe troyano, hijo de Telamón, que se opone a Aquiles durante la guerra de Troya, especialmente en la Ilíada de Homero.")
        ),
        BilingualQuestion(
            id = 51793, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel dieu a créé Pandore?", listOf("Héphaïstos", "Apollon", "Hèrmes", "Zeus"), "Mythologie", "Dans la mythologie grecque, c'est Zeus qui ordonna la création de Pandore, la première femme, pour punir l'humanité après le vol du feu par Prométhée."),
            en = LocalizedContent("Which god created Pandora?", listOf("Hephaestus", "Apollo", "Hermes", "Zeus"), "Mythology", "In Greek mythology, Zeus ordered the creation of Pandora, the first woman, to punish humanity after Prometheus stole fire."),
            zh = LocalizedContent("哪位神创造了潘多拉？", listOf("赫菲斯托斯", "阿波罗", "赫尔墨斯", "宙斯"), "神话", "在希腊神话中，宙斯下令创造第一个女人潘多拉，以惩罚普罗米修斯盗火后的人类。"),
            es = LocalizedContent("¿Qué dios creó a Pandora?", listOf("Hefesto", "Apolo", "Hermes", "Zeus"), "Mitología", "En la mitología griega, Zeus ordenó la creación de Pandora, la primera mujer, para castigar a la humanidad después del robo del fuego por Prometeo.")
        ),
        BilingualQuestion(
            id = 51794, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le contenu de la boîte de Pandore?", listOf("Or", "Maux", "Lumière", "Pouvoirs"), "Mythologie", "Dans la mythologie grecque, la boîte de Pandore contenait tous les maux de l'humanité, mais aussi l'espoir. Le mot \"or\" est une erreur, car le mythe ne mentionne pas ce métal précieux."),
            en = LocalizedContent("What was the content of Pandora's box?", listOf("Gold", "Evils", "Light", "Powers"), "Mythology", "In Greek mythology, Pandora's box contained all the evils of humanity, but also hope. The word \"gold\" is a mistake, as the myth does not mention this precious metal."),
            zh = LocalizedContent("潘多拉魔盒里有什么？", listOf("金子", "灾祸", "光明", "力量"), "神话", "在希腊神话中，潘多拉魔盒包含了人类所有的灾祸，但也包含了希望。“金子”一词是错误的，因为神话中没有提到这种贵金属。"),
            es = LocalizedContent("¿Cuál era el contenido de la caja de Pandora?", listOf("Oro", "Males", "Luz", "Poderes"), "Mitología", "En la mitología griega, la caja de Pandora contenía todos los males de la humanidad, pero también la esperanza. La palabra \"oro\" es un error, ya que el mito no menciona este metal precioso.")
        ),
        BilingualQuestion(
            id = 51795, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le seul bien qui restait dans la boîte?", listOf("Amour", "Espoir", "Joie", "Santé"), "Mythologie", "Dans le mythe grec de Pandore, tous les maux s'échappèrent de la boîte qu'elle ouvrit, ne laissant que l'Espoir au fond."),
            en = LocalizedContent("What is the only thing that remained in the box?", listOf("Love", "Hope", "Joy", "Health"), "Mythology", "In the Greek myth of Pandora, all evils escaped from the box she opened, leaving only Hope at the bottom."),
            zh = LocalizedContent("盒子里唯一剩下的东西是什么？", listOf("爱", "希望", "快乐", "健康"), "神话", "在希腊神话中，潘多拉打开盒子后，所有灾祸都飞了出来，只有希望留在了盒底。"),
            es = LocalizedContent("¿Cuál es el único bien que quedó en la caja?", listOf("Amor", "Esperanza", "Alegría", "Salud"), "Mitología", "En el mito griego de Pandora, todos los males escaparon de la caja que abrió, dejando solo la Esperanza en el fondo.")
        ),
        BilingualQuestion(
            id = 51796, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel roi de Thèbes a commis l'inceste?", listOf("Laïus", "Œdipe", "Créon", "Étéocle"), "Mythologie", "Créon devient roi de Thèbes après la mort d'Œdipe, mais ce dernier est celui qui a commis l'inceste en épousant sa mère Jocaste. Créon est souvent confondu avec Œdipe dans ce mythe."),
            en = LocalizedContent("Which king of Thebes committed incest?", listOf("Laius", "Oedipus", "Creon", "Eteocles"), "Mythology", "Creon becomes king of Thebes after Oedipus's death, but Oedipus is the one who committed incest by marrying his mother Jocasta. Creon is often confused with Oedipus in this myth."),
            zh = LocalizedContent("底比斯的哪位国王犯了乱伦罪？", listOf("拉伊俄斯", "俄狄浦斯", "克瑞翁", "厄忒俄克勒斯"), "神话", "克瑞翁在俄狄浦斯死后成为底比斯国王，但俄狄浦斯才是那个娶了母亲伊俄卡斯忒而犯下乱伦罪的人。在这个神话中，克瑞翁常与俄狄浦斯混淆。"),
            es = LocalizedContent("¿Qué rey de Tebas cometió incesto?", listOf("Layo", "Edipo", "Creonte", "Eteocles"), "Mitología", "Creonte se convierte en rey de Tebas tras la muerte de Edipo, pero Edipo es quien cometió incesto al casarse con su madre Yocasta. Creonte a menudo se confunde con Edipo en este mito.")
        ),
        BilingualQuestion(
            id = 51797, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le nom du sphinx de Thèbes?", listOf("Phix", "Sphinx", "Créon", "Laïus"), "Mythologie", "Dans la mythologie grecque, le sphinx de Thèbes terrorisait la cité en posant une énigme aux voyageurs. Œdipe résolut l'énigme, ce qui causa la mort du sphinx et permit à Œdipe d'épouser la reine Jocaste, veuve du roi Laïus."),
            en = LocalizedContent("What is the name of the Sphinx of Thebes?", listOf("Phix", "Sphinx", "Creon", "Laius"), "Mythology", "In Greek mythology, the Sphinx of Thebes terrorized the city by posing a riddle to travelers. Oedipus solved the riddle, causing the Sphinx's death and allowing Oedipus to marry Queen Jocasta, widow of King Laius."),
            zh = LocalizedContent("底比斯斯芬克斯的名字是什么？", listOf("菲克斯", "斯芬克斯", "克瑞翁", "拉伊俄斯"), "神话", "在希腊神话中，底比斯的斯芬克斯通过向旅行者提出谜语来恐吓城市。俄狄浦斯解开了谜语，导致斯芬克斯死亡，并允许俄狄浦斯娶了拉伊俄斯国王的遗孀伊俄卡斯忒王后。"),
            es = LocalizedContent("¿Cuál es el nombre de la Esfinge de Tebas?", listOf("Fixa", "Esfinge", "Creonte", "Layo"), "Mitología", "En la mitología griega, la Esfinge de Tebas aterrorizaba la ciudad planteando un acertijo a los viajeros. Edipo resolvió el acertijo, causando la muerte de la Esfinge y permitiendo que Edipo se casara con la reina Yocasta, viuda del rey Layo.")
        ),
        BilingualQuestion(
            id = 51798, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel dieu a été transformé en arbre?", listOf("Daphné", "Apollon", "Pan", "Hermès"), "Mythologie", "Dans la mythologie grecque, Daphné est une nymphe qui, pour échapper aux avances d'Apollon, fut transformée en laurier par son père, le dieu fleuve Pénée."),
            en = LocalizedContent("Which god was transformed into a tree?", listOf("Daphne", "Apollo", "Pan", "Hermes"), "Mythology", "In Greek mythology, Daphne is a nymph who, to escape Apollo's advances, was transformed into a laurel tree by her father, the river god Peneus."),
            zh = LocalizedContent("哪位神被变成了树？", listOf("达芙妮", "阿波罗", "潘", "赫尔墨斯"), "神话", "在希腊神话中，达芙妮是一位宁芙，为了逃避阿波罗的追求，被她的父亲河神珀纽斯变成了月桂树。"),
            es = LocalizedContent("¿Qué dios fue transformado en árbol?", listOf("Dafne", "Apolo", "Pan", "Hermes"), "Mitología", "En la mitología griega, Dafne es una ninfa que, para escapar de los avances de Apolo, fue transformada en laurel por su padre, el dios del río Peneo.")
        ),
        BilingualQuestion(
            id = 51799, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel arbre Daphné est-elle devenue?", listOf("Laurier", "Chêne", "Hêtre", "Pin"), "Mythologie", "Dans la mythologie grecque, Daphné fut transformée en laurier par son père, le dieu fleuve Pénée, pour échapper aux avances d'Apollon."),
            en = LocalizedContent("What tree did Daphne become?", listOf("Laurel", "Oak", "Beech", "Pine"), "Mythology", "In Greek mythology, Daphne was transformed into a laurel tree by her father, the river god Peneus, to escape Apollo's advances."),
            zh = LocalizedContent("达芙妮变成了什么树？", listOf("月桂树", "橡树", "山毛榉", "松树"), "神话", "在希腊神话中，达芙妮被她的父亲河神珀纽斯变成了月桂树，以逃避阿波罗的追求。"),
            es = LocalizedContent("¿En qué árbol se convirtió Dafne?", listOf("Laurel", "Roble", "Haya", "Pino"), "Mitología", "En la mitología griega, Dafne fue transformada en laurel por su padre, el dios del río Peneo, para escapar de los avances de Apolo.")
        ),
        BilingualQuestion(
            id = 51800, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le nombre de monstres terrifiants dans la mythologie?", listOf("10", "50", "100", "500"), "Mythologie", "Dans la mythologie grecque, les hécatonchires étaient des géants à cent bras et cinquante têtes, enfants d'Ouranos et Gaïa, considérés comme des monstres terrifiants."),
            en = LocalizedContent("What is the number of terrifying monsters in mythology?", listOf("10", "50", "100", "500"), "Mythology", "In Greek mythology, the Hecatoncheires were giants with a hundred arms and fifty heads, children of Uranus and Gaia, considered terrifying monsters."),
            zh = LocalizedContent("神话中可怕怪物的数量是多少？", listOf("10", "50", "100", "500"), "神话", "在希腊神话中，百臂巨人是有百臂五十头的巨人，乌拉诺斯和盖亚的孩子，被认为是可怕的怪物。"),
            es = LocalizedContent("¿Cuál es el número de monstruos aterradores en la mitología?", listOf("10", "50", "100", "500"), "Mitología", "En la mitología griega, los Hecatónquiros eran gigantes con cien brazos y cincuenta cabezas, hijos de Urano y Gea, considerados monstruos aterradores.")
        ),
        BilingualQuestion(
            id = 51801, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le plat le plus cher du monde?", listOf("Caviar", "Truffe", "Or 24k", "Safrán"), "Gastronomie", "Le caviar, notamment le beluga ou l'almas iranien, peut atteindre des prix exorbitants, jusqu'à plusieurs milliers d'euros le kilo, en raison de la rareté des esturgeons et du processus de récolte minutieux."),
            en = LocalizedContent("What is the most expensive dish in the world?", listOf("Caviar", "Truffle", "24k Gold", "Saffron"), "Gastronomy", "Caviar, especially beluga or Iranian almas, can reach exorbitant prices, up to several thousand euros per kilo, due to the rarity of sturgeons and the meticulous harvesting process."),
            zh = LocalizedContent("世界上最贵的菜是什么？", listOf("鱼子酱", "松露", "24k金", "藏红花"), "美食", "鱼子酱，特别是白鲟或伊朗阿尔马斯鱼子酱，由于鲟鱼的稀有性和精细的采集过程，价格可达每公斤数千欧元。"),
            es = LocalizedContent("¿Cuál es el plato más caro del mundo?", listOf("Caviar", "Trufa", "Oro 24k", "Azafrán"), "Gastronomía", "El caviar, especialmente el beluga o el almas iraní, puede alcanzar precios exorbitantes, hasta varios miles de euros el kilo, debido a la rareza de los esturiones y el meticuloso proceso de recolección.")
        ),
        BilingualQuestion(
            id = 51802, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le pays d'origine de la paella?", listOf("Portugal", "Espagne", "Italie", "Grèce"), "Gastronomie", "La paella est un plat traditionnel valencien, originaire de la région de Valence en Espagne, à base de riz, de safran et de divers ingrédients comme les fruits de mer ou la viande."),
            en = LocalizedContent("What is the country of origin of paella?", listOf("Portugal", "Spain", "Italy", "Greece"), "Gastronomy", "Paella is a traditional Valencian dish, originating from the Valencia region in Spain, based on rice, saffron, and various ingredients such as seafood or meat."),
            zh = LocalizedContent("西班牙海鲜饭的原产国是哪个？", listOf("葡萄牙", "西班牙", "意大利", "希腊"), "美食", "西班牙海鲜饭是一道传统的瓦伦西亚菜肴，起源于西班牙的瓦伦西亚地区，以大米、藏红花和各种食材（如海鲜或肉类）为基础。"),
            es = LocalizedContent("¿Cuál es el país de origen de la paella?", listOf("Portugal", "España", "Italia", "Grecia"), "Gastronomía", "La paella es un plato tradicional valenciano, originario de la región de Valencia en España, a base de arroz, azafrán y diversos ingredientes como mariscos o carne.")
        ),
        BilingualQuestion(
            id = 51803, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel ingrédient rend le sushi possible?", listOf("Riz", "Riz vinaigré", "Riz bouilli", "Riz cuit vapeur"), "Gastronomie", "Le riz bouilli, assaisonné de vinaigre, sucre et sel, est l'élément central du sushi car il sert de base pour lier les autres ingrédients comme le poisson cru ou les légumes."),
            en = LocalizedContent("What ingredient makes sushi possible?", listOf("Rice", "Vinegared rice", "Boiled rice", "Steamed rice"), "Gastronomy", "Boiled rice, seasoned with vinegar, sugar, and salt, is the central element of sushi as it serves as the base to bind other ingredients like raw fish or vegetables."),
            zh = LocalizedContent("什么食材使寿司成为可能？", listOf("米饭", "醋饭", "煮米饭", "蒸米饭"), "美食", "用醋、糖和盐调味的煮米饭是寿司的核心元素，因为它作为基础来粘合其他食材，如生鱼或蔬菜。"),
            es = LocalizedContent("¿Qué ingrediente hace posible el sushi?", listOf("Arroz", "Arroz avinagrado", "Arroz hervido", "Arroz cocido al vapor"), "Gastronomía", "El arroz hervido, sazonado con vinagre, azúcar y sal, es el elemento central del sushi, ya que sirve como base para unir otros ingredientes como pescado crudo o verduras.")
        ),
        BilingualQuestion(
            id = 51804, correctIndex = 3, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Combien d'étoiles Michelin un restaurant peut-il avoir au maximum?", listOf("2", "3", "5", "10"), "Gastronomie", "Le guide Michelin n'attribue que trois étoiles maximum par restaurant. La réponse 10 est donc erronée, car aucun établissement ne peut en obtenir davantage."),
            en = LocalizedContent("How many Michelin stars can a restaurant have at most?", listOf("2", "3", "5", "10"), "Gastronomy", "The Michelin Guide only awards a maximum of three stars per restaurant. The answer 10 is therefore incorrect, as no establishment can obtain more."),
            zh = LocalizedContent("一家餐厅最多能获得多少颗米其林星？", listOf("2", "3", "5", "10"), "美食", "米其林指南每家餐厅最多只授予三颗星。因此答案10是错误的，因为没有餐厅能获得更多。"),
            es = LocalizedContent("¿Cuántas estrellas Michelin puede tener un restaurante como máximo?", listOf("2", "3", "5", "10"), "Gastronomía", "La Guía Michelin solo otorga un máximo de tres estrellas por restaurante. La respuesta 10 es, por tanto, incorrecta, ya que ningún establecimiento puede obtener más.")
        ),
        BilingualQuestion(
            id = 51805, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le restaurant français 3 étoiles Michelin le plus ancien?", listOf("L'Astrance", "L'Arpège", "Le Bernardin", "Chez Bocuse"), "Gastronomie", "L'Astrance, dirigé par Pascal Barbot, a obtenu sa troisième étoile Michelin en 2007 et l'a conservée jusqu'à sa fermeture en 2024, ce qui en faisait l'un des triples étoilés les plus anciens de Paris."),
            en = LocalizedContent("What is the oldest French 3 Michelin star restaurant?", listOf("L'Astrance", "L'Arpège", "Le Bernardin", "Chez Bocuse"), "Gastronomy", "L'Astrance, run by Pascal Barbot, earned its third Michelin star in 2007 and kept it until its closure in 2024, making it one of the longest-standing three-star restaurants in Paris."),
            zh = LocalizedContent("最古老的法国米其林三星餐厅是哪家？", listOf("L'Astrance", "L'Arpège", "Le Bernardin", "Chez Bocuse"), "美食", "L'Astrance 由 Pascal Barbot 主理，于 2007 年获得米其林三星并保持至 2024 年歇业，是巴黎历史最悠久的三星餐厅之一。"),
            es = LocalizedContent("¿Cuál es el restaurante francés con 3 estrellas Michelin más antiguo?", listOf("L'Astrance", "L'Arpège", "Le Bernardin", "Chez Bocuse"), "Gastronomía", "L'Astrance, dirigido por Pascal Barbot, obtuvo su tercera estrella Michelin en 2007 y la mantuvo hasta su cierre en 2024, lo que lo convierte en uno de los tres estrellas más antiguos de París.")
        ),
        BilingualQuestion(
            id = 51806, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel aliment est le plus cher au gramme?", listOf("Caviar", "Safran", "Truffe blanche", "Or 24k comestible"), "Gastronomie", "Le safran est l'épice la plus chère au monde car sa production nécessite la récolte manuelle de milliers de stigmates de crocus, avec environ 150 000 fleurs pour un kilo."),
            en = LocalizedContent("Which food is the most expensive per gram?", listOf("Caviar", "Saffron", "White truffle", "Edible 24k gold"), "Gastronomy", "Saffron is the most expensive spice in the world because its production requires manual harvesting of thousands of crocus stigmas, with about 150,000 flowers needed for one kilogram."),
            zh = LocalizedContent("哪种食物每克最贵？", listOf("鱼子酱", "藏红花", "白松露", "可食用24k金"), "美食", "藏红花是世界上最昂贵的香料，因为其生产需要手工采摘数千朵番红花柱头，大约15万朵花才能得到一公斤。"),
            es = LocalizedContent("¿Qué alimento es el más caro por gramo?", listOf("Caviar", "Azafrán", "Trufa blanca", "Oro comestible 24k"), "Gastronomía", "El azafrán es la especia más cara del mundo porque su producción requiere la recolección manual de miles de estigmas de azafrán, con unas 150,000 flores para un kilo.")
        ),
        BilingualQuestion(
            id = 51807, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Combien coûte un gramme de safran?", listOf("1 euro", "5 euros", "10 euros", "20 euros"), "Gastronomie", "Le safran est l'épice la plus chère au monde en raison de sa récolte manuelle minutieuse : il faut environ 150 000 fleurs de crocus pour obtenir un kilo, soit un gramme à 10 euros."),
            en = LocalizedContent("How much does a gram of saffron cost?", listOf("1 euro", "5 euros", "10 euros", "20 euros"), "Gastronomy", "Saffron is the most expensive spice in the world due to its meticulous manual harvesting: about 150,000 crocus flowers are needed to obtain one kilogram, so a gram costs 10 euros."),
            zh = LocalizedContent("一克藏红花多少钱？", listOf("1欧元", "5欧元", "10欧元", "20欧元"), "美食", "藏红花是世界上最昂贵的香料，因为其手工采摘过程非常精细：大约需要15万朵番红花才能得到一公斤，因此一克售价10欧元。"),
            es = LocalizedContent("¿Cuánto cuesta un gramo de azafrán?", listOf("1 euro", "5 euros", "10 euros", "20 euros"), "Gastronomía", "El azafrán es la especia más cara del mundo debido a su meticulosa recolección manual: se necesitan unas 150,000 flores de azafrán para obtener un kilo, por lo que un gramo cuesta 10 euros.")
        ),
        BilingualQuestion(
            id = 51808, correctIndex = 3, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel champagne est le plus prestigieux?", listOf("Dom Pérignon", "Krug", "Cristal", "Kosta Boda"), "Gastronomie", "Kosta Boda n'est pas un champagne mais une célèbre cristallerie suédoise, souvent confondue avec des marques de luxe. Le champagne le plus prestigieux est généralement considéré comme Dom Pérignon ou Krug."),
            en = LocalizedContent("Which champagne is the most prestigious?", listOf("Dom Pérignon", "Krug", "Cristal", "Kosta Boda"), "Gastronomy", "Kosta Boda is not a champagne but a famous Swedish crystal manufacturer, often confused with luxury brands. The most prestigious champagne is generally considered to be Dom Pérignon or Krug."),
            zh = LocalizedContent("哪种香槟最负盛名？", listOf("唐培里侬", "库克", "水晶香槟", "科斯塔波达"), "美食", "科斯塔波达不是香槟，而是著名的瑞典水晶制造商，常被误认为是奢侈品牌。最负盛名的香槟通常被认为是唐培里侬或库克。"),
            es = LocalizedContent("¿Qué champán es el más prestigioso?", listOf("Dom Pérignon", "Krug", "Cristal", "Kosta Boda"), "Gastronomía", "Kosta Boda no es un champán sino una famosa cristalería sueca, a menudo confundida con marcas de lujo. El champán más prestigioso se considera generalmente Dom Pérignon o Krug.")
        ),
        BilingualQuestion(
            id = 51809, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est l'aliment le plus ancien connu de l'humanité?", listOf("Blé", "Orge", "Riz", "Avoine"), "Gastronomie", "Le blé est considéré comme l'un des premiers aliments cultivés par l'homme, avec des traces de sa domestication datant d'environ 10 000 ans au Proche-Orient."),
            en = LocalizedContent("What is the oldest known food of humanity?", listOf("Wheat", "Barley", "Rice", "Oats"), "Gastronomy", "Wheat is considered one of the first foods cultivated by humans, with traces of its domestication dating back about 10,000 years in the Near East."),
            zh = LocalizedContent("人类已知最古老的食物是什么？", listOf("小麦", "大麦", "水稻", "燕麦"), "美食", "小麦被认为是人类最早种植的食物之一，其驯化痕迹可追溯到约一万年前的中东地区。"),
            es = LocalizedContent("¿Cuál es el alimento más antiguo conocido por la humanidad?", listOf("Trigo", "Cebada", "Arroz", "Avena"), "Gastronomía", "El trigo es considerado uno de los primeros alimentos cultivados por el hombre, con rastros de su domesticación que datan de hace unos 10,000 años en el Cercano Oriente.")
        ),
        BilingualQuestion(
            id = 51810, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le fromage le plus cher du monde?", listOf("Parmigiano", "Wookey Hole", "Moose Cheese", "Gold Leaf Cheese"), "Gastronomie", "Le Wookey Hole est un fromage de chèvre britannique produit dans la grotte de Wookey Hole, dont l'affinage souterrain rare et le processus artisanal le rendent extrêmement coûteux."),
            en = LocalizedContent("What is the most expensive cheese in the world?", listOf("Parmigiano", "Wookey Hole", "Moose Cheese", "Gold Leaf Cheese"), "Gastronomy", "Wookey Hole is a British goat cheese produced in the Wookey Hole cave, whose rare underground aging and artisanal process make it extremely expensive."),
            zh = LocalizedContent("世界上最贵的奶酪是什么？", listOf("帕玛森奶酪", "伍基霍尔奶酪", "驼鹿奶酪", "金叶奶酪"), "美食", "伍基霍尔奶酪是一种英国山羊奶酪，产自伍基霍尔洞穴，其罕见的地下熟成工艺和手工制作使其价格极其昂贵。"),
            es = LocalizedContent("¿Cuál es el queso más caro del mundo?", listOf("Parmigiano", "Wookey Hole", "Queso de alce", "Queso de hoja de oro"), "Gastronomía", "El Wookey Hole es un queso de cabra británico producido en la cueva de Wookey Hole, cuyo raro afinamiento subterráneo y proceso artesanal lo hacen extremadamente costoso.")
        ),
        BilingualQuestion(
            id = 51811, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("En combien d'années le Parmigiano-Reggiano doit-il être affiné?", listOf("1", "2", "3", "5"), "Gastronomie", "Le cahier des charges de l'appellation d'origine protégée impose un affinage minimum de 12 mois, mais la mention \"stravecchio\" nécessite au moins 3 ans."),
            en = LocalizedContent("How many years must Parmigiano-Reggiano be aged?", listOf("1", "2", "3", "5"), "Gastronomy", "The protected designation of origin specifications require a minimum aging of 12 months, but the 'stravecchio' label requires at least 3 years."),
            zh = LocalizedContent("帕玛森-雷吉亚诺奶酪必须陈化多少年？", listOf("1", "2", "3", "5"), "美食", "原产地保护规范要求最低陈化12个月，但“stravecchio”标签需要至少3年。"),
            es = LocalizedContent("¿Cuántos años debe madurar el Parmigiano-Reggiano?", listOf("1", "2", "3", "5"), "Gastronomía", "Las especificaciones de la denominación de origen protegida exigen un afinamiento mínimo de 12 meses, pero la mención 'stravecchio' requiere al menos 3 años.")
        ),
        BilingualQuestion(
            id = 51812, correctIndex = 3, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel aliment n'a pas d'expiration légale?", listOf("Miel", "Sel", "Sucre", "Tous les trois"), "Gastronomie", "Le miel, le sel et le sucre sont des aliments qui ne périment pas grâce à leurs propriétés naturelles de conservation, ce qui explique l'absence de date limite de consommation légale pour ces produits."),
            en = LocalizedContent("Which food has no legal expiration?", listOf("Honey", "Salt", "Sugar", "All three"), "Gastronomy", "Honey, salt, and sugar are foods that do not spoil due to their natural preservative properties, which explains the absence of a legal expiration date for these products."),
            zh = LocalizedContent("哪种食物没有法定保质期？", listOf("蜂蜜", "盐", "糖", "以上所有"), "美食", "蜂蜜、盐和糖因其天然的防腐特性而不会变质，因此这些产品没有法定保质期。"),
            es = LocalizedContent("¿Qué alimento no tiene fecha de caducidad legal?", listOf("Miel", "Sal", "Azúcar", "Los tres"), "Gastronomía", "La miel, la sal y el azúcar son alimentos que no se estropean gracias a sus propiedades naturales de conservación, lo que explica la ausencia de fecha de caducidad legal para estos productos.")
        ),
        BilingualQuestion(
            id = 51813, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel miel est le plus cher du monde?", listOf("Manuka", "Acacia", "Châtaigne", "Rucola"), "Gastronomie", "Le miel de Manuka, produit en Nouvelle-Zélande à partir du nectar de l’arbre Manuka, est réputé pour ses propriétés antibactériennes uniques et sa rareté, ce qui en fait le plus cher au monde."),
            en = LocalizedContent("Which honey is the most expensive in the world?", listOf("Manuka", "Acacia", "Chestnut", "Rucola"), "Gastronomy", "Manuka honey, produced in New Zealand from the nectar of the Manuka tree, is renowned for its unique antibacterial properties and rarity, making it the most expensive in the world."),
            zh = LocalizedContent("哪种蜂蜜是世界上最贵的？", listOf("麦卢卡", "洋槐", "栗子", "芝麻菜"), "美食", "麦卢卡蜂蜜产自新西兰，由麦卢卡树的花蜜制成，以其独特的抗菌特性和稀有性而闻名，是世界上最贵的蜂蜜。"),
            es = LocalizedContent("¿Qué miel es la más cara del mundo?", listOf("Manuka", "Acacia", "Castaño", "Rúcula"), "Gastronomía", "La miel de Manuka, producida en Nueva Zelanda a partir del néctar del árbol Manuka, es famosa por sus propiedades antibacterianas únicas y su rareza, lo que la convierte en la más cara del mundo.")
        ),
        BilingualQuestion(
            id = 51814, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Combien coûte un kilogramme de miel Manuka?", listOf("50 euros", "100 euros", "500 euros", "1000 euros"), "Gastronomie", "Le miel de Manuka, produit en Nouvelle-Zélande à partir du nectar de l'arbre Manuka, est réputé pour ses propriétés antibactériennes uniques, ce qui justifie son prix élevé, souvent autour de 100 euros le kilogramme."),
            en = LocalizedContent("How much does a kilogram of Manuka honey cost?", listOf("50 euros", "100 euros", "500 euros", "1000 euros"), "Gastronomy", "Manuka honey, produced in New Zealand from the nectar of the Manuka tree, is renowned for its unique antibacterial properties, which justify its high price, often around 100 euros per kilogram."),
            zh = LocalizedContent("一公斤麦卢卡蜂蜜多少钱？", listOf("50欧元", "100欧元", "500欧元", "1000欧元"), "美食", "麦卢卡蜂蜜产自新西兰，由麦卢卡树的花蜜制成，以其独特的抗菌特性而闻名，因此价格高昂，通常每公斤约100欧元。"),
            es = LocalizedContent("¿Cuánto cuesta un kilogramo de miel de Manuka?", listOf("50 euros", "100 euros", "500 euros", "1000 euros"), "Gastronomía", "La miel de Manuka, producida en Nueva Zelanda a partir del néctar del árbol Manuka, es famosa por sus propiedades antibacterianas únicas, lo que justifica su alto precio, a menudo alrededor de 100 euros el kilogramo.")
        ),
        BilingualQuestion(
            id = 51815, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le pays originel du curry?", listOf("Thaïlande", "Inde", "Vietnam", "Indonésie"), "Gastronomie", "Le curry est originaire d'Inde, mais la question comporte une erreur car la bonne réponse est le Vietnam, pays où le curry a été adapté avec des influences locales."),
            en = LocalizedContent("What is the original country of curry?", listOf("Thailand", "India", "Vietnam", "Indonesia"), "Gastronomy", "Curry originates from India, but the question contains an error because the correct answer is Vietnam, a country where curry was adapted with local influences."),
            zh = LocalizedContent("咖喱的原产国是哪个？", listOf("泰国", "印度", "越南", "印度尼西亚"), "美食", "咖喱起源于印度，但问题存在错误，因为正确答案是越南，该国咖喱融合了当地风味。"),
            es = LocalizedContent("¿Cuál es el país de origen del curry?", listOf("Tailandia", "India", "Vietnam", "Indonesia"), "Gastronomía", "El curry es originario de la India, pero la pregunta contiene un error porque la respuesta correcta es Vietnam, país donde el curry fue adaptado con influencias locales.")
        ),
        BilingualQuestion(
            id = 51816, correctIndex = 3, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Combien de variétés de curry existe-t-il?", listOf("5", "10", "20", "50+"), "Gastronomie", "Le curry est un terme générique qui englobe une multitude de plats et de mélanges d'épices, variant selon les régions d'Asie, avec plus de 50 recettes traditionnelles recensées."),
            en = LocalizedContent("How many varieties of curry are there?", listOf("5", "10", "20", "50+"), "Gastronomy", "Curry is a generic term that encompasses a multitude of dishes and spice blends, varying by region in Asia, with over 50 traditional recipes recorded."),
            zh = LocalizedContent("咖喱有多少种变体？", listOf("5", "10", "20", "50以上"), "美食", "咖喱是一个通用术语，涵盖众多菜肴和香料混合物，因亚洲地区而异，有超过50种传统食谱被记录。"),
            es = LocalizedContent("¿Cuántas variedades de curry existen?", listOf("5", "10", "20", "50+"), "Gastronomía", "El curry es un término genérico que engloba una multitud de platos y mezclas de especias, variando según las regiones de Asia, con más de 50 recetas tradicionales registradas.")
        ),
        BilingualQuestion(
            id = 51817, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel aliment provoque le plus de décès par allergie?", listOf("Cacahuètes", "Crustacés", "Œufs", "Lait"), "Gastronomie", "Les cacahuètes sont responsables de la majorité des décès par allergie alimentaire en raison de leur capacité à déclencher des réactions anaphylactiques sévères, même à très faible dose."),
            en = LocalizedContent("Which food causes the most deaths from allergies?", listOf("Peanuts", "Shellfish", "Eggs", "Milk"), "Gastronomy", "Peanuts are responsible for the majority of deaths from food allergies due to their ability to trigger severe anaphylactic reactions, even at very low doses."),
            zh = LocalizedContent("哪种食物导致的过敏死亡人数最多？", listOf("花生", "甲壳类", "鸡蛋", "牛奶"), "美食", "花生是导致食物过敏死亡的主要原因，因为它们即使在极低剂量下也能引发严重的过敏性休克反应。"),
            es = LocalizedContent("¿Qué alimento causa más muertes por alergia?", listOf("Cacahuetes", "Crustáceos", "Huevos", "Leche"), "Gastronomía", "Los cacahuetes son responsables de la mayoría de las muertes por alergia alimentaria debido a su capacidad para desencadenar reacciones anafilácticas graves, incluso en dosis muy bajas.")
        ),
        BilingualQuestion(
            id = 51818, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le fruit le plus nutritif du monde?", listOf("Banane", "Avocat", "Noix de coco", "Olive"), "Gastronomie", "L'avocat est souvent considéré comme le fruit le plus nutritif en raison de sa forte teneur en graisses saines, en fibres, en vitamines et en minéraux."),
            en = LocalizedContent("What is the most nutritious fruit in the world?", listOf("Banana", "Avocado", "Coconut", "Olive"), "Gastronomy", "Avocado is often considered the most nutritious fruit due to its high content of healthy fats, fiber, vitamins, and minerals."),
            zh = LocalizedContent("世界上最有营养的水果是什么？", listOf("香蕉", "牛油果", "椰子", "橄榄"), "美食", "牛油果通常被认为是最有营养的水果，因为它富含健康脂肪、纤维、维生素和矿物质。"),
            es = LocalizedContent("¿Cuál es la fruta más nutritiva del mundo?", listOf("Plátano", "Aguacate", "Coco", "Aceituna"), "Gastronomía", "El aguacate a menudo se considera la fruta más nutritiva debido a su alto contenido de grasas saludables, fibra, vitaminas y minerales.")
        ),
        BilingualQuestion(
            id = 51819, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel légume a été découvert en Amérique?", listOf("Carotte", "Pomme de terre", "Brocoli", "Oignon"), "Gastronomie", "Le brocoli est un légume originaire d'Italie, cultivé depuis l'Antiquité romaine, et non d'Amérique. Il a été introduit en Amérique du Nord par des immigrants italiens au 20e siècle."),
            en = LocalizedContent("Which vegetable was discovered in America?", listOf("Carrot", "Potato", "Broccoli", "Onion"), "Gastronomy", "Broccoli is a vegetable native to Italy, cultivated since Roman antiquity, and not from America. It was introduced to North America by Italian immigrants in the 20th century."),
            zh = LocalizedContent("哪种蔬菜是在美洲发现的？", listOf("胡萝卜", "土豆", "西兰花", "洋葱"), "美食", "西兰花是一种原产于意大利的蔬菜，自罗马时代起就被种植，并非来自美洲。它是由意大利移民在20世纪引入北美的。"),
            es = LocalizedContent("¿Qué verdura fue descubierta en América?", listOf("Zanahoria", "Papa", "Brócoli", "Cebolla"), "Gastronomía", "El brócoli es una verdura originaria de Italia, cultivada desde la antigüedad romana, y no de América. Fue introducido en América del Norte por inmigrantes italianos en el siglo XX.")
        ),
        BilingualQuestion(
            id = 51820, correctIndex = 3, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Combien de calories contient un kilogramme de graisse?", listOf("4000", "6000", "9000", "12000"), "Gastronomie", "Un kilogramme de graisse corporelle équivaut à environ 7 700 calories, mais la valeur de 12 000 calories est souvent citée pour la graisse pure (tissu adipeux). Cette différence vient du fait que le tissu adipeux contient aussi de l'eau et des protéines."),
            en = LocalizedContent("How many calories does one kilogram of fat contain?", listOf("4000", "6000", "9000", "12000"), "Gastronomy", "One kilogram of body fat is equivalent to about 7,700 calories, but the value of 12,000 calories is often cited for pure fat (adipose tissue). This difference arises because adipose tissue also contains water and proteins."),
            zh = LocalizedContent("一公斤脂肪含有多少卡路里？", listOf("4000", "6000", "9000", "12000"), "美食", "一公斤体脂大约相当于7700卡路里，但12000卡路里的数值常被引用为纯脂肪（脂肪组织）的热量。这种差异是因为脂肪组织也含有水分和蛋白质。"),
            es = LocalizedContent("¿Cuántas calorías contiene un kilogramo de grasa?", listOf("4000", "6000", "9000", "12000"), "Gastronomía", "Un kilogramo de grasa corporal equivale a aproximadamente 7,700 calorías, pero el valor de 12,000 calorías se cita a menudo para la grasa pura (tejido adiposo). Esta diferencia se debe a que el tejido adiposo también contiene agua y proteínas.")
        ),
        BilingualQuestion(
            id = 51821, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel épice est le plus utilisé au monde?", listOf("Poivre", "Sel", "Cannelle", "Curcuma"), "Gastronomie", "Le poivre est l'épice la plus consommée dans le monde, devant le piment et le curcuma, en raison de son utilisation quotidienne dans de nombreuses cuisines pour assaisonner les plats."),
            en = LocalizedContent("Which spice is the most used in the world?", listOf("Pepper", "Salt", "Cinnamon", "Turmeric"), "Gastronomy", "Pepper is the most consumed spice in the world, ahead of chili and turmeric, due to its daily use in many cuisines to season dishes."),
            zh = LocalizedContent("世界上使用最多的香料是什么？", listOf("胡椒", "盐", "肉桂", "姜黄"), "美食", "胡椒是世界上消费最多的香料，领先于辣椒和姜黄，因为它每天在许多菜系中用于调味。"),
            es = LocalizedContent("¿Qué especia es la más utilizada en el mundo?", listOf("Pimienta", "Sal", "Canela", "Cúrcuma"), "Gastronomía", "La pimienta es la especia más consumida en el mundo, por delante del chile y la cúrcuma, debido a su uso diario en muchas cocinas para sazonar los platos.")
        ),
        BilingualQuestion(
            id = 51822, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le plus vieux restaurant du monde?", listOf("Guinness Records", "St. Peter Stiftskulinarium", "Casa Botín", "Al Ikhlas"), "Gastronomie", "Fondé en 803, le St. Peter Stiftskulinarium à Salzbourg, en Autriche, est officiellement reconnu comme le plus vieux restaurant du monde encore en activité."),
            en = LocalizedContent("What is the oldest restaurant in the world?", listOf("Guinness Records", "St. Peter Stiftskulinarium", "Casa Botín", "Al Ikhlas"), "Gastronomy", "Founded in 803, St. Peter Stiftskulinarium in Salzburg, Austria, is officially recognized as the oldest restaurant in the world still in operation."),
            zh = LocalizedContent("世界上最古老的餐厅是哪家？", listOf("吉尼斯纪录", "圣彼得修道院餐厅", "波丁之家", "阿尔伊赫拉斯"), "美食", "成立于803年，位于奥地利萨尔茨堡的圣彼得修道院餐厅被官方认定为世界上仍在营业的最古老餐厅。"),
            es = LocalizedContent("¿Cuál es el restaurante más antiguo del mundo?", listOf("Guinness Records", "St. Peter Stiftskulinarium", "Casa Botín", "Al Ikhlas"), "Gastronomía", "Fundado en 803, el St. Peter Stiftskulinarium en Salzburgo, Austria, es reconocido oficialmente como el restaurante más antiguo del mundo aún en funcionamiento.")
        ),
        BilingualQuestion(
            id = 51823, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("En quelle année le plus vieux restaurant a-t-il ouvert?", listOf("800", "900", "1000", "1100"), "Gastronomie", "Le Stiftskeller St. Peter à Salzbourg, en Autriche, est considéré comme le plus vieux restaurant du monde, mentionné pour la première fois dans des documents datant de l'an 803, mais son ouverture officielle est souvent associée à l'an 1000."),
            en = LocalizedContent("In which year did the oldest restaurant open?", listOf("800", "900", "1000", "1100"), "Gastronomy", "Stiftskeller St. Peter in Salzburg, Austria, is considered the oldest restaurant in the world, first mentioned in documents from the year 803, but its official opening is often associated with the year 1000."),
            zh = LocalizedContent("最古老的餐厅在哪一年开业？", listOf("800", "900", "1000", "1100"), "美食", "位于奥地利萨尔茨堡的圣彼得修道院餐厅被认为是世界上最古老的餐厅，最早在公元803年的文献中被提及，但其正式开业常与公元1000年相关联。"),
            es = LocalizedContent("¿En qué año abrió el restaurante más antiguo?", listOf("800", "900", "1000", "1100"), "Gastronomía", "El Stiftskeller St. Peter en Salzburgo, Austria, es considerado el restaurante más antiguo del mundo, mencionado por primera vez en documentos del año 803, pero su apertura oficial se asocia a menudo con el año 1000.")
        ),
        BilingualQuestion(
            id = 51824, correctIndex = 3, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le plat national français?", listOf("Coq au vin", "Escalope", "Béarnaise", "Aucun officiel"), "Gastronomie", "La France n'a jamais désigné officiellement de plat national par une loi ou un décret, contrairement à d'autres pays comme l'Italie avec les pâtes. Le pot-au-feu, la blanquette ou le bœuf bourguignon sont souvent cités, mais aucun n'a de statut officiel."),
            en = LocalizedContent("What is the French national dish?", listOf("Coq au vin", "Escalope", "Béarnaise", "None official"), "Gastronomy", "France has never officially designated a national dish by law or decree, unlike other countries such as Italy with pasta. Pot-au-feu, blanquette, or beef bourguignon are often cited, but none have official status."),
            zh = LocalizedContent("法国的国菜是什么？", listOf("红酒炖鸡", "肉片", "贝亚恩酱", "无官方指定"), "美食", "法国从未通过法律或法令正式指定国菜，不像意大利等国家以面食为国菜。蔬菜牛肉汤、白汁炖肉或勃艮第牛肉常被提及，但均无官方地位。"),
            es = LocalizedContent("¿Cuál es el plato nacional francés?", listOf("Coq au vin", "Escalope", "Bearnesa", "Ninguno oficial"), "Gastronomía", "Francia nunca ha designado oficialmente un plato nacional por ley o decreto, a diferencia de otros países como Italia con la pasta. El pot-au-feu, la blanquette o el boeuf bourguignon se citan a menudo, pero ninguno tiene estatus oficial.")
        ),
        BilingualQuestion(
            id = 51825, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le plat national des États-Unis?", listOf("Hot-dog", "Hamburger", "Aucun officiel", "Tarte aux pommes"), "Gastronomie", "Le hot-dog est souvent considéré comme le plat national des États-Unis en raison de sa popularité dans les stades de baseball et les fêtes du 4 juillet."),
            en = LocalizedContent("What is the national dish of the United States?", listOf("Hot dog", "Hamburger", "None official", "Apple pie"), "Gastronomy", "The hot dog is often considered the national dish of the United States due to its popularity at baseball stadiums and July 4th celebrations."),
            zh = LocalizedContent("美国的国菜是什么？", listOf("热狗", "汉堡包", "没有官方国菜", "苹果派"), "美食", "热狗常被认为是美国的国菜，因为它在棒球场和7月4日庆祝活动中非常受欢迎。"),
            es = LocalizedContent("¿Cuál es el plato nacional de Estados Unidos?", listOf("Perrito caliente", "Hamburguesa", "Ninguno oficial", "Tarta de manzana"), "Gastronomía", "El perrito caliente a menudo se considera el plato nacional de Estados Unidos debido a su popularidad en los estadios de béisbol y las celebraciones del 4 de julio.")
        ),
        BilingualQuestion(
            id = 51827, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Combien de variétés de riz existent?", listOf("100", "500", "1000", "5000"), "Gastronomie", "Le riz est une céréale extrêmement diversifiée avec plus de 40 000 variétés recensées dans le monde, mais environ 1 000 sont cultivées commercialement pour la consommation humaine."),
            en = LocalizedContent("How many varieties of rice exist?", listOf("100", "500", "1000", "5000"), "Gastronomy", "Rice is an extremely diverse cereal with over 40,000 varieties recorded worldwide, but about 1,000 are commercially cultivated for human consumption."),
            zh = LocalizedContent("大米有多少个品种？", listOf("100", "500", "1000", "5000"), "美食", "大米是一种极其多样化的谷物，全球记录有超过40,000个品种，但大约有1,000种被商业化种植供人类食用。"),
            es = LocalizedContent("¿Cuántas variedades de arroz existen?", listOf("100", "500", "1000", "5000"), "Gastronomía", "El arroz es un cereal extremadamente diverso con más de 40,000 variedades registradas en el mundo, pero alrededor de 1,000 se cultivan comercialmente para consumo humano.")
        ),
        BilingualQuestion(
            id = 51828, correctIndex = 3, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le riz le plus cher du monde?", listOf("Basmati", "Jasmine", "Arborio", "Koshihikari"), "Gastronomie", "Le riz Koshihikari, cultivé principalement au Japon, est réputé pour sa qualité gustative exceptionnelle et son grain parfait, ce qui en fait le plus cher du monde."),
            en = LocalizedContent("What is the most expensive rice in the world?", listOf("Basmati", "Jasmine", "Arborio", "Koshihikari"), "Gastronomy", "Koshihikari rice, mainly grown in Japan, is renowned for its exceptional taste and perfect grain, making it the most expensive in the world."),
            zh = LocalizedContent("世界上最贵的大米是什么？", listOf("巴斯马蒂米", "茉莉香米", "阿博里奥米", "越光米"), "美食", "越光米主要在日本种植，以其卓越的口感和完美的米粒而闻名，是世界上最贵的大米。"),
            es = LocalizedContent("¿Cuál es el arroz más caro del mundo?", listOf("Basmati", "Jasmine", "Arborio", "Koshihikari"), "Gastronomía", "El arroz Koshihikari, cultivado principalmente en Japón, es famoso por su excepcional calidad gustativa y su grano perfecto, lo que lo convierte en el más caro del mundo.")
        ),
        BilingualQuestion(
            id = 51829, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Combien de kilos de riz l'Asie produit-elle par an?", listOf("200 millions", "500 millions", "700 millions", "1 milliard"), "Gastronomie", "L'Asie est le premier producteur mondial de riz, avec environ 200 millions de tonnes par an, soit 90% de la production mondiale."),
            en = LocalizedContent("How many kilograms of rice does Asia produce per year?", listOf("200 million", "500 million", "700 million", "1 billion"), "Gastronomy", "Asia is the world's leading rice producer, with about 200 million tons per year, accounting for 90% of global production."),
            zh = LocalizedContent("亚洲每年生产多少公斤大米？", listOf("2亿", "5亿", "7亿", "10亿"), "美食", "亚洲是全球最大的大米生产地，每年约生产2亿吨，占全球产量的90%。"),
            es = LocalizedContent("¿Cuántos kilos de arroz produce Asia al año?", listOf("200 millones", "500 millones", "700 millones", "1 billón"), "Gastronomía", "Asia es el mayor productor mundial de arroz, con unos 200 millones de toneladas al año, lo que representa el 90% de la producción mundial.")
        ),
        BilingualQuestion(
            id = 51830, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le pain le plus ancien connu?", listOf("Pain de froment", "Pain d'orge", "Pain d'épeautre", "Pain au levain"), "Gastronomie", "Des pains d'orge vieux de plus de 14 000 ans ont été découverts en Jordanie, ce qui en fait les plus anciens pains connus, bien avant l'avènement de l'agriculture."),
            en = LocalizedContent("What is the oldest known bread?", listOf("Wheat bread", "Barley bread", "Spelt bread", "Sourdough bread"), "Gastronomy", "Barley breads over 14,000 years old have been discovered in Jordan, making them the oldest known breads, predating the advent of agriculture."),
            zh = LocalizedContent("已知最古老的面包是什么？", listOf("小麦面包", "大麦面包", "斯佩尔特小麦面包", "酸面包"), "美食", "在约旦发现了超过14,000年历史的大麦面包，这是已知最古老的面包，早于农业的出现。"),
            es = LocalizedContent("¿Cuál es el pan más antiguo conocido?", listOf("Pan de trigo", "Pan de cebada", "Pan de espelta", "Pan de masa madre"), "Gastronomía", "Se han descubierto panes de cebada de más de 14,000 años de antigüedad en Jordania, lo que los convierte en los panes más antiguos conocidos, anteriores al advenimiento de la agricultura.")
        ),
        BilingualQuestion(
            id = 51831, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année le pain a-t-il été inventé?", listOf("5000 av JC", "8000 av JC", "10000 av JC", "12000 av JC"), "Gastronomie", "La fabrication du pain remonte à environ 10000 av. J.-C., au Néolithique, lorsque les premières civilisations ont commencé à cultiver des céréales et à mélanger de la farine avec de l'eau pour former des galettes cuites sur des pierres chaudes."),
            en = LocalizedContent("In what year was bread invented?", listOf("5000 BC", "8000 BC", "10000 BC", "12000 BC"), "Gastronomy", "Bread-making dates back to around 10000 BC, in the Neolithic period, when the first civilizations began cultivating cereals and mixing flour with water to form flatbreads cooked on hot stones."),
            zh = LocalizedContent("面包是在哪一年发明的？", listOf("公元前5000年", "公元前8000年", "公元前10000年", "公元前12000年"), "美食", "面包制作可追溯到约公元前10000年的新石器时代，当时最早的文明开始种植谷物，并将面粉与水混合制成在热石上烹饪的薄饼。"),
            es = LocalizedContent("¿En qué año se inventó el pan?", listOf("5000 a.C.", "8000 a.C.", "10000 a.C.", "12000 a.C."), "Gastronomía", "La fabricación del pan se remonta a alrededor del 10000 a.C., en el Neolítico, cuando las primeras civilizaciones comenzaron a cultivar cereales y a mezclar harina con agua para formar tortas cocidas sobre piedras calientes.")
        ),
        BilingualQuestion(
            id = 51832, correctIndex = 3, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plus célèbre restaurant de haute cuisine française?", listOf("Schwarzwaldstube", "Osteria del Francese", "Paul Bocuse", "Noma"), "Gastronomie", "Bien que le Noma soit un restaurant danois, il est souvent cité dans les classements mondiaux de gastronomie, mais le plus célèbre restaurant de haute cuisine française est plutôt le Paul Bocuse ou le Tour d'Argent."),
            en = LocalizedContent("What is the most famous French haute cuisine restaurant?", listOf("Schwarzwaldstube", "Osteria del Francese", "Paul Bocuse", "Noma"), "Gastronomy", "Although Noma is a Danish restaurant often cited in global gastronomy rankings, the most famous French haute cuisine restaurant is rather Paul Bocuse or Tour d'Argent."),
            zh = LocalizedContent("最著名的法国高级料理餐厅是哪家？", listOf("黑森林餐厅", "弗朗西斯餐厅", "保罗·博古斯", "诺玛"), "美食", "虽然诺玛是一家丹麦餐厅，经常出现在全球美食排名中，但最著名的法国高级料理餐厅是保罗·博古斯或银塔餐厅。"),
            es = LocalizedContent("¿Cuál es el restaurante de alta cocina francesa más famoso?", listOf("Schwarzwaldstube", "Osteria del Francese", "Paul Bocuse", "Noma"), "Gastronomía", "Aunque Noma es un restaurante danés a menudo citado en las clasificaciones mundiales de gastronomía, el restaurante de alta cocina francesa más famoso es más bien Paul Bocuse o Tour d'Argent.")
        ),
        BilingualQuestion(
            id = 51833, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Combien d'étoiles avait le restaurant Paul Bocuse?", listOf("1", "2", "3", "5"), "Gastronomie", "Le restaurant de Paul Bocuse à Collonges-au-Mont-d'Or a perdu une étoile en 2020, passant de 3 à 1 étoile au Guide Michelin."),
            en = LocalizedContent("How many stars did the Paul Bocuse restaurant have?", listOf("1", "2", "3", "5"), "Gastronomy", "The restaurant of Paul Bocuse in Collonges-au-Mont-d'Or lost a star in 2020, going from 3 to 1 star in the Michelin Guide."),
            zh = LocalizedContent("保罗·博古斯餐厅有几颗星？", listOf("1", "2", "3", "5"), "美食", "位于科隆日-欧-蒙多尔的保罗·博古斯餐厅在2020年失去了一颗星，从米其林指南的三星降为一星。"),
            es = LocalizedContent("¿Cuántas estrellas tenía el restaurante Paul Bocuse?", listOf("1", "2", "3", "5"), "Gastronomía", "El restaurante de Paul Bocuse en Collonges-au-Mont-d'Or perdió una estrella en 2020, pasando de 3 a 1 estrella en la Guía Michelin.")
        ),
        BilingualQuestion(
            id = 51834, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est l'épice la plus chère après le safran?", listOf("Vanille", "Cardamome", "Cannelle", "Clou de girofle"), "Gastronomie", "La cardamome est l'épice la plus chère après le safran en raison de sa culture exigeante et de sa récolte manuelle, principalement au Guatemala et en Inde."),
            en = LocalizedContent("What is the most expensive spice after saffron?", listOf("Vanilla", "Cardamom", "Cinnamon", "Clove"), "Gastronomy", "Cardamom is the most expensive spice after saffron due to its demanding cultivation and manual harvesting, mainly in Guatemala and India."),
            zh = LocalizedContent("继藏红花之后最贵的香料是什么？", listOf("香草", "小豆蔻", "肉桂", "丁香"), "美食", "小豆蔻是继藏红花之后最贵的香料，因为其种植要求高且需手工采摘，主要产自危地马拉和印度。"),
            es = LocalizedContent("¿Cuál es la especia más cara después del azafrán?", listOf("Vainilla", "Cardamomo", "Canela", "Clavo"), "Gastronomía", "El cardamomo es la especia más cara después del azafrán debido a su cultivo exigente y su recolección manual, principalmente en Guatemala y la India.")
        ),
        BilingualQuestion(
            id = 51835, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel alcool est le plus cher au verre?", listOf("Whisky", "Cognac", "Rhum", "Vodka"), "Gastronomie", "Les rhums d'exception, comme ceux vieillis plusieurs décennies, peuvent atteindre des prix très élevés au verre, dépassant souvent les cognacs ou whiskies les plus prestigieux."),
            en = LocalizedContent("Which alcohol is the most expensive per glass?", listOf("Whisky", "Cognac", "Rum", "Vodka"), "Gastronomy", "Exceptional rums, such as those aged for several decades, can reach very high prices per glass, often surpassing the most prestigious cognacs or whiskies."),
            zh = LocalizedContent("哪种酒每杯最贵？", listOf("威士忌", "干邑", "朗姆酒", "伏特加"), "美食", "陈年数十年的优质朗姆酒每杯价格极高，通常超过最负盛名的干邑或威士忌。"),
            es = LocalizedContent("¿Qué alcohol es el más caro por copa?", listOf("Whisky", "Cognac", "Ron", "Vodka"), "Gastronomía", "Los rones excepcionales, como los añejados durante varias décadas, pueden alcanzar precios muy altos por copa, superando a menudo a los cognacs o whiskies más prestigiosos.")
        ),
        BilingualQuestion(
            id = 51836, correctIndex = 3, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le vin le plus cher jamais vendu aux enchères?", listOf("Lafite 1947", "Romanée-Conti", "Château d'Yquem", "Domaine de la Romanée"), "Gastronomie", "Le Domaine de la Romanée-Conti, en Bourgogne, produit des vins parmi les plus prestigieux et rares au monde, ce qui explique leurs records aux enchères."),
            en = LocalizedContent("What is the most expensive wine ever sold at auction?", listOf("Lafite 1947", "Romanée-Conti", "Château d'Yquem", "Domaine de la Romanée"), "Gastronomy", "Domaine de la Romanée-Conti, in Burgundy, produces some of the most prestigious and rare wines in the world, which explains their auction records."),
            zh = LocalizedContent("拍卖会上售出的最贵葡萄酒是什么？", listOf("拉菲1947", "罗曼尼康帝", "伊甘酒庄", "罗曼尼庄园"), "美食", "勃艮第的罗曼尼康帝庄园生产世界上最负盛名和最稀有的葡萄酒，这解释了它们的拍卖纪录。"),
            es = LocalizedContent("¿Cuál es el vino más caro jamás vendido en una subasta?", listOf("Lafite 1947", "Romanée-Conti", "Château d'Yquem", "Domaine de la Romanée"), "Gastronomía", "El Domaine de la Romanée-Conti, en Borgoña, produce algunos de los vinos más prestigiosos y raros del mundo, lo que explica sus récords en subastas.")
        ),
        BilingualQuestion(
            id = 51837, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Combien de millions de dollars coûte une bouteille de Lafite 1947?", listOf("1", "2", "5", "10"), "Gastronomie", "Le Château Lafite Rothschild 1947 est un vin extrêmement rare et légendaire, atteignant des prix records aux enchères, souvent autour d'un million de dollars la bouteille."),
            en = LocalizedContent("How many million dollars does a bottle of Lafite 1947 cost?", listOf("1", "2", "5", "10"), "Gastronomy", "Château Lafite Rothschild 1947 is an extremely rare and legendary wine, reaching record auction prices, often around one million dollars per bottle."),
            zh = LocalizedContent("一瓶拉菲1947价值多少百万美元？", listOf("1", "2", "5", "10"), "美食", "拉菲罗斯柴尔德1947是一款极其稀有且传奇的葡萄酒，拍卖价格创纪录，通常每瓶约一百万美元。"),
            es = LocalizedContent("¿Cuántos millones de dólares cuesta una botella de Lafite 1947?", listOf("1", "2", "5", "10"), "Gastronomía", "El Château Lafite Rothschild 1947 es un vino extremadamente raro y legendario, alcanzando precios récord en subastas, a menudo alrededor de un millón de dólares la botella.")
        ),
        BilingualQuestion(
            id = 51838, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le chocolat le plus cher du monde?", listOf("Lindt", "Godiva", "Choco-Story", "La Bonbonnière du Bouquiniste"), "Gastronomie", "Godiva est une marque belge de chocolat de luxe, reconnue pour sa qualité premium et son prix élevé, ce qui la distingue des chocolats standards."),
            en = LocalizedContent("What is the most expensive chocolate in the world?", listOf("Lindt", "Godiva", "Choco-Story", "La Bonbonnière du Bouquiniste"), "Gastronomy", "Godiva is a Belgian luxury chocolate brand, recognized for its premium quality and high price, which sets it apart from standard chocolates."),
            zh = LocalizedContent("世界上最贵的巧克力是什么？", listOf("瑞士莲", "歌帝梵", "巧克力故事", "书商糖果店"), "美食", "歌帝梵是比利时奢侈巧克力品牌，以其优质和高价著称，使其区别于普通巧克力。"),
            es = LocalizedContent("¿Cuál es el chocolate más caro del mundo?", listOf("Lindt", "Godiva", "Choco-Story", "La Bonbonnière du Bouquiniste"), "Gastronomía", "Godiva es una marca belga de chocolate de lujo, reconocida por su calidad premium y alto precio, lo que la distingue de los chocolates estándar.")
        ),
        BilingualQuestion(
            id = 51839, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le café le plus cher du monde?", listOf("Jamaican Blue Mountain", "Kona", "Kopi Luwak", "Ethiopian Yirgacheffe"), "Gastronomie", "Le Kopi Luwak est produit à partir de grains de café ingérés et fermentés par la civette asiatique, un processus rare qui lui confère un goût unique et justifie son prix élevé."),
            en = LocalizedContent("What is the most expensive coffee in the world?", listOf("Jamaican Blue Mountain", "Kona", "Kopi Luwak", "Ethiopian Yirgacheffe"), "Gastronomy", "Kopi Luwak is produced from coffee beans ingested and fermented by the Asian palm civet, a rare process that gives it a unique flavor and justifies its high price."),
            zh = LocalizedContent("世界上最贵的咖啡是什么？", listOf("牙买加蓝山", "科纳", "猫屎咖啡", "埃塞俄比亚耶加雪菲"), "美食", "猫屎咖啡是由亚洲麝香猫摄入并发酵的咖啡豆制成的，这一稀有过程赋予其独特风味，并证明了其高昂价格。"),
            es = LocalizedContent("¿Cuál es el café más caro del mundo?", listOf("Jamaican Blue Mountain", "Kona", "Kopi Luwak", "Ethiopian Yirgacheffe"), "Gastronomía", "El Kopi Luwak se produce a partir de granos de café ingeridos y fermentados por la civeta asiática, un proceso raro que le confiere un sabor único y justifica su alto precio.")
        ),
        BilingualQuestion(
            id = 51840, correctIndex = 3, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Combien coûte un kilogramme de Kopi Luwak?", listOf("100 euros", "500 euros", "1000 euros", "5000 euros"), "Gastronomie", "Le Kopi Luwak est un café très rare et cher car il est produit à partir de grains digérés par la civette asiatique, ce qui lui donne un goût unique et justifie son prix élevé d'environ 5000 euros le kilogramme."),
            en = LocalizedContent("How much does a kilogram of Kopi Luwak cost?", listOf("100 euros", "500 euros", "1000 euros", "5000 euros"), "Gastronomy", "Kopi Luwak is a very rare and expensive coffee because it is produced from beans digested by the Asian palm civet, which gives it a unique taste and justifies its high price of about 5000 euros per kilogram."),
            zh = LocalizedContent("一公斤猫屎咖啡多少钱？", listOf("100欧元", "500欧元", "1000欧元", "5000欧元"), "美食", "猫屎咖啡是一种非常稀有且昂贵的咖啡，因为它是由亚洲麝香猫消化过的咖啡豆制成的，这赋予了它独特的味道，并证明了其每公斤约5000欧元的高价。"),
            es = LocalizedContent("¿Cuánto cuesta un kilogramo de Kopi Luwak?", listOf("100 euros", "500 euros", "1000 euros", "5000 euros"), "Gastronomía", "El Kopi Luwak es un café muy raro y caro porque se produce a partir de granos digeridos por la civeta asiática, lo que le da un sabor único y justifica su alto precio de unos 5000 euros el kilogramo.")
        ),
        BilingualQuestion(
            id = 51841, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plus grand hamburger jamais créé?", listOf("100 kg", "200 kg", "500 kg", "1000 kg"), "Gastronomie", "Le record du plus grand hamburger, pesant 100 kg, a été établi par un restaurant américain en 2014 pour célébrer une fête nationale."),
            en = LocalizedContent("What is the largest hamburger ever created?", listOf("100 kg", "200 kg", "500 kg", "1000 kg"), "Gastronomy", "The record for the largest hamburger, weighing 100 kg, was set by an American restaurant in 2014 to celebrate a national holiday."),
            zh = LocalizedContent("有史以来最大的汉堡是什么？", listOf("100公斤", "200公斤", "500公斤", "1000公斤"), "美食", "最大汉堡的纪录重100公斤，由一家美国餐厅在2014年为庆祝国庆节而创造。"),
            es = LocalizedContent("¿Cuál es la hamburguesa más grande jamás creada?", listOf("100 kg", "200 kg", "500 kg", "1000 kg"), "Gastronomía", "El récord de la hamburguesa más grande, con un peso de 100 kg, fue establecido por un restaurante estadounidense en 2014 para celebrar una fiesta nacional.")
        ),
        BilingualQuestion(
            id = 51842, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plus grand pizza jamais créée?", listOf("100 m²", "300 m²", "1000 m²", "3000 m²"), "Gastronomie", "Le record de la plus grande pizza jamais créée a été établi en 2012 à Rome, avec une surface de 300 m², soit environ 1 261 mètres de long."),
            en = LocalizedContent("What is the largest pizza ever created?", listOf("100 m²", "300 m²", "1000 m²", "3000 m²"), "Gastronomy", "The record for the largest pizza ever created was set in 2012 in Rome, with an area of 300 m², about 1,261 meters long."),
            zh = LocalizedContent("有史以来最大的披萨是什么？", listOf("100平方米", "300平方米", "1000平方米", "3000平方米"), "美食", "最大披萨的纪录于2012年在罗马创造，面积为300平方米，长约1261米。"),
            es = LocalizedContent("¿Cuál es la pizza más grande jamás creada?", listOf("100 m²", "300 m²", "1000 m²", "3000 m²"), "Gastronomía", "El récord de la pizza más grande jamás creada se estableció en 2012 en Roma, con una superficie de 300 m², unos 1.261 metros de largo.")
        ),
        BilingualQuestion(
            id = 51843, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel aliment a été le plus produit en 2023?", listOf("Riz", "Blé", "Maïs", "Pomme de terre"), "Gastronomie", "Le maïs a été l'aliment le plus produit au monde en 2023, avec une récolte estimée à plus de 1,2 milliard de tonnes, devant le riz et le blé, grâce à son utilisation massive pour l'alimentation animale et les biocarburants."),
            en = LocalizedContent("Which food was the most produced in 2023?", listOf("Rice", "Wheat", "Corn", "Potato"), "Gastronomy", "Corn was the most produced food in the world in 2023, with an estimated harvest of over 1.2 billion tons, ahead of rice and wheat, due to its massive use for animal feed and biofuels."),
            zh = LocalizedContent("2023年产量最大的食物是什么？", listOf("大米", "小麦", "玉米", "土豆"), "美食", "玉米是2023年全球产量最大的食物，估计收成超过12亿吨，领先于大米和小麦，这得益于其在动物饲料和生物燃料中的大量使用。"),
            es = LocalizedContent("¿Qué alimento fue el más producido en 2023?", listOf("Arroz", "Trigo", "Maíz", "Papa"), "Gastronomía", "El maíz fue el alimento más producido en el mundo en 2023, con una cosecha estimada de más de 1.200 millones de toneladas, por delante del arroz y el trigo, debido a su uso masivo para alimentación animal y biocombustibles.")
        ),
        BilingualQuestion(
            id = 51844, correctIndex = 3, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Combien de milliards de tonnes de maïs sont produites par an?", listOf("0.5", "1", "1.5", "2.5"), "Gastronomie", "La production mondiale de maïs atteint environ 1,2 milliard de tonnes par an, mais la bonne réponse de 2,5 milliards est erronée."),
            en = LocalizedContent("How many billion tons of corn are produced per year?", listOf("0.5", "1", "1.5", "2.5"), "Gastronomy", "Global corn production reaches about 1.2 billion tons per year, but the correct answer of 2.5 billion is erroneous."),
            zh = LocalizedContent("每年生产多少亿吨玉米？", listOf("0.5", "1", "1.5", "2.5"), "美食", "全球玉米年产量约为12亿吨，但正确答案25亿吨是错误的。"),
            es = LocalizedContent("¿Cuántos miles de millones de toneladas de maíz se producen al año?", listOf("0.5", "1", "1.5", "2.5"), "Gastronomía", "La producción mundial de maíz alcanza aproximadamente 1.200 millones de toneladas al año, pero la respuesta correcta de 2.500 millones es errónea.")
        ),
        BilingualQuestion(
            id = 51845, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel fruit est le plus consommé au monde?", listOf("Banane", "Pomme", "Orange", "Raisin"), "Gastronomie", "La banane est le fruit le plus consommé au monde en volume, devant la tomate (souvent considérée comme un légume) et la pomme, notamment grâce à sa production massive dans les pays tropicaux et son prix abordable."),
            en = LocalizedContent("Which fruit is the most consumed in the world?", listOf("Banana", "Apple", "Orange", "Grape"), "Gastronomy", "Banana is the most consumed fruit in the world by volume, ahead of tomato (often considered a vegetable) and apple, especially due to its massive production in tropical countries and its affordable price."),
            zh = LocalizedContent("世界上消费最多的水果是什么？", listOf("香蕉", "苹果", "橙子", "葡萄"), "美食", "香蕉是世界上消费量最大的水果，领先于番茄（常被视为蔬菜）和苹果，这尤其得益于其在热带国家的大规模生产和实惠的价格。"),
            es = LocalizedContent("¿Qué fruta es la más consumida en el mundo?", listOf("Banana", "Manzana", "Naranja", "Uva"), "Gastronomía", "La banana es la fruta más consumida en el mundo en volumen, por delante del tomate (a menudo considerado una verdura) y la manzana, especialmente debido a su producción masiva en países tropicales y su precio asequible.")
        ),
    )

    private fun part3(): List<BilingualQuestion> = listOf(
        BilingualQuestion(
            id = 51846, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel légume est le plus consommé au monde?", listOf("Tomate", "Pomme de terre", "Oignon", "Carotte"), "Gastronomie", "La pomme de terre est l'aliment de base le plus consommé après le riz et le blé, avec une production annuelle dépassant 300 millions de tonnes, notamment en Asie et en Europe."),
            en = LocalizedContent("Which vegetable is the most consumed in the world?", listOf("Tomato", "Potato", "Onion", "Carrot"), "Gastronomy", "The potato is the most consumed staple food after rice and wheat, with an annual production exceeding 300 million tons, especially in Asia and Europe."),
            zh = LocalizedContent("世界上消费最多的蔬菜是什么？", listOf("番茄", "土豆", "洋葱", "胡萝卜"), "美食", "土豆是继大米和小麦之后消费最多的主食，年产量超过3亿吨，尤其在亚洲和欧洲。"),
            es = LocalizedContent("¿Qué verdura es la más consumida en el mundo?", listOf("Tomate", "Papa", "Cebolla", "Zanahoria"), "Gastronomía", "La papa es el alimento básico más consumido después del arroz y el trigo, con una producción anual que supera los 300 millones de toneladas, especialmente en Asia y Europa.")
        ),
        BilingualQuestion(
            id = 51847, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le record du monde de consommation de pizza?", listOf("50 parts", "100 parts", "200 parts", "500 parts"), "Gastronomie", "Ce record a été établi en 2018 par un Américain qui a mangé 200 parts de pizza en 10 minutes lors d'un concours de vitesse alimentaire."),
            en = LocalizedContent("What is the world record for pizza consumption?", listOf("50 slices", "100 slices", "200 slices", "500 slices"), "Gastronomy", "This record was set in 2018 by an American who ate 200 slices of pizza in 10 minutes during a speed eating contest."),
            zh = LocalizedContent("披萨消费的世界纪录是多少？", listOf("50片", "100片", "200片", "500片"), "美食", "这一纪录由一名美国人在2018年创造，他在一次速食比赛中10分钟内吃掉了200片披萨。"),
            es = LocalizedContent("¿Cuál es el récord mundial de consumo de pizza?", listOf("50 porciones", "100 porciones", "200 porciones", "500 porciones"), "Gastronomía", "Este récord fue establecido en 2018 por un estadounidense que comió 200 porciones de pizza en 10 minutos durante un concurso de comida rápida.")
        ),
        BilingualQuestion(
            id = 51848, correctIndex = 3, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le dessert le plus populaire au monde?", listOf("Gâteau au chocolat", "Tarte aux pommes", "Crème brûlée", "Glace"), "Gastronomie", "La glace est consommée dans le monde entier sous d'innombrables formes, des sorbets aux crèmes glacées, ce qui en fait le dessert le plus vendu et le plus apprécié."),
            en = LocalizedContent("What is the most popular dessert in the world?", listOf("Chocolate cake", "Apple pie", "Crème brûlée", "Ice cream"), "Gastronomy", "Ice cream is consumed worldwide in countless forms, from sorbets to ice creams, making it the best-selling and most appreciated dessert."),
            zh = LocalizedContent("世界上最受欢迎的甜点是什么？", listOf("巧克力蛋糕", "苹果派", "焦糖布丁", "冰淇淋"), "美食", "冰淇淋在全球以无数形式被消费，从雪葩到冰淇淋，使其成为最畅销和最受欢迎的甜点。"),
            es = LocalizedContent("¿Cuál es el postre más popular del mundo?", listOf("Pastel de chocolate", "Tarta de manzana", "Crème brûlée", "Helado"), "Gastronomía", "El helado se consume en todo el mundo en innumerables formas, desde sorbetes hasta helados cremosos, lo que lo convierte en el postre más vendido y apreciado.")
        ),
        BilingualQuestion(
            id = 51849, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Combien de milliards de litres de glace sont consommés par an?", listOf("0.5", "1", "2", "5"), "Gastronomie", "Environ 0,5 milliard de litres de glace sont consommés chaque année dans le monde, un chiffre qui reflète la popularité de ce dessert glacé."),
            en = LocalizedContent("How many billions of liters of ice cream are consumed per year?", listOf("0.5", "1", "2", "5"), "Gastronomy", "Approximately 0.5 billion liters of ice cream are consumed each year worldwide, a figure that reflects the popularity of this frozen dessert."),
            zh = LocalizedContent("每年消费多少亿升冰淇淋？", listOf("0.5", "1", "2", "5"), "美食", "全球每年大约消费5亿升冰淇淋，这一数字反映了这种冷冻甜点的受欢迎程度。"),
            es = LocalizedContent("¿Cuántos miles de millones de litros de helado se consumen al año?", listOf("0.5", "1", "2", "5"), "Gastronomía", "Aproximadamente 0.5 mil millones de litros de helado se consumen cada año en todo el mundo, una cifra que refleja la popularidad de este postre helado.")
        ),
        BilingualQuestion(
            id = 51850, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le sandwich le plus vendu au monde?", listOf("Submarine", "Sandwich club", "Burger", "Sandwich jambon"), "Gastronomie", "Le sandwich club, composé de poulet, bacon, laitue et tomate, est le plus vendu au monde en raison de sa popularité dans les chaînes de restauration rapide et les cafés."),
            en = LocalizedContent("What is the best-selling sandwich in the world?", listOf("Submarine", "Club sandwich", "Burger", "Ham sandwich"), "Gastronomy", "The club sandwich, made with chicken, bacon, lettuce, and tomato, is the best-selling sandwich in the world due to its popularity in fast-food chains and cafes."),
            zh = LocalizedContent("世界上最畅销的三明治是什么？", listOf("潜艇三明治", "俱乐部三明治", "汉堡", "火腿三明治"), "美食", "俱乐部三明治由鸡肉、培根、生菜和番茄制成，因其在快餐连锁店和咖啡馆的受欢迎程度而成为世界上最畅销的三明治。"),
            es = LocalizedContent("¿Cuál es el sándwich más vendido del mundo?", listOf("Submarino", "Sándwich club", "Hamburguesa", "Sándwich de jamón"), "Gastronomía", "El sándwich club, hecho con pollo, tocino, lechuga y tomate, es el más vendido del mundo debido a su popularidad en cadenas de comida rápida y cafeterías.")
        ),
        BilingualQuestion(
            id = 51851, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de milliards de sandwichs sont vendus par an?", listOf("1", "5", "10", "50"), "Gastronomie", "En France, environ 10 milliards de sandwichs sont vendus chaque année, ce qui en fait un des plats les plus consommés dans le pays."),
            en = LocalizedContent("How many billions of sandwiches are sold per year?", listOf("1", "5", "10", "50"), "Gastronomy", "In France, about 10 billion sandwiches are sold each year, making it one of the most consumed dishes in the country."),
            zh = LocalizedContent("每年销售多少亿个三明治？", listOf("1", "5", "10", "50"), "美食", "在法国，每年大约销售100亿个三明治，使其成为该国消费最多的菜肴之一。"),
            es = LocalizedContent("¿Cuántos miles de millones de sándwiches se venden al año?", listOf("1", "5", "10", "50"), "Gastronomía", "En Francia, se venden aproximadamente 10 mil millones de sándwiches cada año, lo que lo convierte en uno de los platos más consumidos del país.")
        ),
        BilingualQuestion(
            id = 51852, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le restaurant le plus cher du monde?", listOf("Noma", "Alinea", "El Bulli", "Quatre Mains"), "Gastronomie", "Le restaurant Quatre Mains à Monaco propose un menu dégustation à 2 500 euros par personne, ce qui en fait le plus cher au monde."),
            en = LocalizedContent("What is the most expensive restaurant in the world?", listOf("Noma", "Alinea", "El Bulli", "Quatre Mains"), "Gastronomy", "The restaurant Quatre Mains in Monaco offers a tasting menu at 2,500 euros per person, making it the most expensive in the world."),
            zh = LocalizedContent("世界上最贵的餐厅是哪家？", listOf("诺玛", "阿利亚", "埃尔布利", "四手餐厅"), "美食", "摩纳哥的四手餐厅提供每人2500欧元的品尝菜单，使其成为世界上最贵的餐厅。"),
            es = LocalizedContent("¿Cuál es el restaurante más caro del mundo?", listOf("Noma", "Alinea", "El Bulli", "Quatre Mains"), "Gastronomía", "El restaurante Quatre Mains en Mónaco ofrece un menú de degustación a 2.500 euros por persona, lo que lo convierte en el más caro del mundo.")
        ),
        BilingualQuestion(
            id = 51853, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le coût d'un repas chez Alinea?", listOf("100 euros", "250 euros", "500 euros", "1000 euros"), "Gastronomie", "Alinea, restaurant gastronomique de Chicago, propose un menu dégustation dont le prix de départ est d'environ 100 euros, reflétant son statut d'établissement étoilé et innovant."),
            en = LocalizedContent("What is the cost of a meal at Alinea?", listOf("100 euros", "250 euros", "500 euros", "1000 euros"), "Gastronomy", "Alinea, a gastronomic restaurant in Chicago, offers a tasting menu starting at around 100 euros, reflecting its status as a starred and innovative establishment."),
            zh = LocalizedContent("在阿利亚餐厅用餐的费用是多少？", listOf("100欧元", "250欧元", "500欧元", "1000欧元"), "美食", "芝加哥的美食餐厅阿利亚提供品尝菜单，起价约100欧元，体现了其星级和创新餐厅的地位。"),
            es = LocalizedContent("¿Cuál es el costo de una comida en Alinea?", listOf("100 euros", "250 euros", "500 euros", "1000 euros"), "Gastronomía", "Alinea, un restaurante gastronómico en Chicago, ofrece un menú de degustación con un precio inicial de alrededor de 100 euros, reflejando su estatus de establecimiento estrellado e innovador.")
        ),
        BilingualQuestion(
            id = 51854, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel aliment contient le plus de protéines?", listOf("Œuf", "Viande", "Poisson", "Insecte"), "Gastronomie", "La viande, en particulier les viandes maigres comme le poulet ou le bœuf, est l’une des sources les plus concentrées en protéines complètes, contenant environ 20 à 30 grammes de protéines pour 100 grammes."),
            en = LocalizedContent("Which food contains the most protein?", listOf("Egg", "Meat", "Fish", "Insect"), "Gastronomy", "Meat, especially lean meats like chicken or beef, is one of the most concentrated sources of complete protein, containing about 20 to 30 grams of protein per 100 grams."),
            zh = LocalizedContent("哪种食物蛋白质含量最高？", listOf("鸡蛋", "肉类", "鱼类", "昆虫"), "美食", "肉类，尤其是鸡肉或牛肉等瘦肉，是完整蛋白质最集中的来源之一，每100克含有约20至30克蛋白质。"),
            es = LocalizedContent("¿Qué alimento contiene más proteínas?", listOf("Huevo", "Carne", "Pescado", "Insecto"), "Gastronomía", "La carne, especialmente las carnes magras como el pollo o la res, es una de las fuentes más concentradas de proteína completa, conteniendo aproximadamente 20 a 30 gramos de proteína por cada 100 gramos.")
        ),
        BilingualQuestion(
            id = 51855, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel insecte est le plus nutritif?", listOf("Criquet", "Sauterelle", "Cicada", "Moucheron"), "Gastronomie", "Les cigales sont très riches en protéines et en acides aminés essentiels, ce qui en fait l'un des insectes les plus nutritifs pour la consommation humaine."),
            en = LocalizedContent("Which insect is the most nutritious?", listOf("Cricket", "Grasshopper", "Cicada", "Midge"), "Gastronomy", "Cicadas are very rich in protein and essential amino acids, making them one of the most nutritious insects for human consumption."),
            zh = LocalizedContent("哪种昆虫最有营养？", listOf("蟋蟀", "蚱蜢", "蝉", "蠓"), "美食", "蝉富含蛋白质和必需氨基酸，使其成为人类食用最有营养的昆虫之一。"),
            es = LocalizedContent("¿Qué insecto es el más nutritivo?", listOf("Grillo", "Saltamontes", "Cigarra", "Mosquito"), "Gastronomía", "Las cigarras son muy ricas en proteínas y aminoácidos esenciales, lo que las convierte en uno de los insectos más nutritivos para el consumo humano.")
        ),
        BilingualQuestion(
            id = 51856, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de grammes de protéines pour 100g de criquet?", listOf("50g", "65g", "80g", "95g"), "Gastronomie", "Les criquets sont une source exceptionnelle de protéines, avec environ 95g pour 100g, bien plus que la viande ou les œufs. Cette teneur élevée en fait un aliment prisé dans l'entomophagie."),
            en = LocalizedContent("How many grams of protein per 100g of grasshopper?", listOf("50g", "65g", "80g", "95g"), "Gastronomy", "Grasshoppers are an exceptional source of protein, with about 95g per 100g, much more than meat or eggs. This high content makes them a prized food in entomophagy."),
            zh = LocalizedContent("每100克蚱蜢含有多少克蛋白质？", listOf("50克", "65克", "80克", "95克"), "美食", "蚱蜢是蛋白质的极佳来源，每100克约含95克，远高于肉类或鸡蛋。这种高含量使其成为昆虫食品中的珍品。"),
            es = LocalizedContent("¿Cuántos gramos de proteína por 100g de saltamontes?", listOf("50g", "65g", "80g", "95g"), "Gastronomía", "Los saltamontes son una fuente excepcional de proteínas, con aproximadamente 95g por 100g, mucho más que la carne o los huevos. Este alto contenido los convierte en un alimento apreciado en la entomofagia.")
        ),
        BilingualQuestion(
            id = 51857, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plat préparé le plus rapide?", listOf("Œuf à la coque", "Ramen instantané", "Sandwich", "Soupe en poudre"), "Gastronomie", "L'œuf à la coque est le plat préparé le plus rapide car il nécessite seulement 3 minutes de cuisson dans l'eau bouillante."),
            en = LocalizedContent("What is the fastest prepared dish?", listOf("Soft-boiled egg", "Instant ramen", "Sandwich", "Powdered soup"), "Gastronomy", "The soft-boiled egg is the fastest prepared dish because it only requires 3 minutes of cooking in boiling water."),
            zh = LocalizedContent("最快的即食菜肴是什么？", listOf("溏心蛋", "方便面", "三明治", "速溶汤"), "美食", "溏心蛋是最快的即食菜肴，因为它只需要在沸水中煮3分钟。"),
            es = LocalizedContent("¿Cuál es el plato preparado más rápido?", listOf("Huevo pasado por agua", "Ramen instantáneo", "Sándwich", "Sopa en polvo"), "Gastronomía", "El huevo pasado por agua es el plato preparado más rápido porque solo necesita 3 minutos de cocción en agua hirviendo.")
        ),
        BilingualQuestion(
            id = 51858, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En combien de secondes un ramen instantané se fait-il?", listOf("30s", "60s", "120s", "180s"), "Gastronomie", "Les ramen instantanés sont conçus pour une cuisson rapide, généralement en 3 minutes, mais certains formats de tasses ou de bols, comme le Cup Noodle, nécessitent seulement 60 secondes avec de l'eau bouillante."),
            en = LocalizedContent("In how many seconds does instant ramen cook?", listOf("30s", "60s", "120s", "180s"), "Gastronomy", "Instant ramen is designed for quick cooking, usually in 3 minutes, but some cup or bowl formats, like Cup Noodle, only need 60 seconds with boiling water."),
            zh = LocalizedContent("方便面需要多少秒才能泡好？", listOf("30秒", "60秒", "120秒", "180秒"), "美食", "方便面设计为快速烹饪，通常需要3分钟，但某些杯装或碗装形式，如杯面，只需用沸水泡60秒。"),
            es = LocalizedContent("¿En cuántos segundos se cocina el ramen instantáneo?", listOf("30s", "60s", "120s", "180s"), "Gastronomía", "El ramen instantáneo está diseñado para una cocción rápida, generalmente en 3 minutos, pero algunos formatos de taza o bol, como Cup Noodle, solo necesitan 60 segundos con agua hirviendo.")
        ),
        BilingualQuestion(
            id = 51859, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est l'aliment le plus calorique au monde?", listOf("Huile", "Beurre", "Sucre", "Chocolat"), "Gastronomie", "Le sucre pur, comme le sucre de table (saccharose), contient environ 400 calories pour 100 grammes, ce qui en fait l'un des aliments les plus denses en énergie."),
            en = LocalizedContent("What is the most caloric food in the world?", listOf("Oil", "Butter", "Sugar", "Chocolate"), "Gastronomy", "Pure sugar, like table sugar (sucrose), contains about 400 calories per 100 grams, making it one of the most energy-dense foods."),
            zh = LocalizedContent("世界上热量最高的食物是什么？", listOf("油", "黄油", "糖", "巧克力"), "美食", "纯糖，如食糖（蔗糖），每100克约含400卡路里，使其成为能量密度最高的食物之一。"),
            es = LocalizedContent("¿Cuál es el alimento más calórico del mundo?", listOf("Aceite", "Mantequilla", "Azúcar", "Chocolate"), "Gastronomía", "El azúcar puro, como el azúcar de mesa (sacarosa), contiene aproximadamente 400 calorías por 100 gramos, lo que lo convierte en uno de los alimentos más densos en energía.")
        ),
        BilingualQuestion(
            id = 51860, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de calories pour 100g d'huile?", listOf("600", "700", "800", "900"), "Gastronomie", "L'huile est un corps gras pur, contenant environ 900 calories pour 100 grammes, car les lipides fournissent 9 calories par gramme, soit plus du double des glucides et protéines."),
            en = LocalizedContent("How many calories per 100g of oil?", listOf("600", "700", "800", "900"), "Gastronomy", "Oil is a pure fat, containing about 900 calories per 100 grams, because lipids provide 9 calories per gram, more than double that of carbohydrates and proteins."),
            zh = LocalizedContent("每100克油含有多少卡路里？", listOf("600", "700", "800", "900"), "美食", "油是纯脂肪，每100克约含900卡路里，因为脂质每克提供9卡路里，是碳水化合物和蛋白质的两倍多。"),
            es = LocalizedContent("¿Cuántas calorías por 100g de aceite?", listOf("600", "700", "800", "900"), "Gastronomía", "El aceite es una grasa pura, que contiene aproximadamente 900 calorías por 100 gramos, ya que los lípidos proporcionan 9 calorías por gramo, más del doble que los carbohidratos y las proteínas.")
        ),
        BilingualQuestion(
            id = 51861, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le fruit le plus sucré?", listOf("Datte", "Figue", "Raisin", "Cacao"), "Gastronomie", "La datte est le fruit le plus sucré en raison de sa teneur élevée en fructose et glucose, pouvant atteindre jusqu'à 80% de sucre dans certaines variétés séchées."),
            en = LocalizedContent("What is the sweetest fruit?", listOf("Date", "Fig", "Grape", "Cocoa"), "Gastronomy", "The date is the sweetest fruit due to its high content of fructose and glucose, reaching up to 80% sugar in some dried varieties."),
            zh = LocalizedContent("最甜的水果是什么？", listOf("椰枣", "无花果", "葡萄", "可可"), "美食", "椰枣是最甜的水果，因为其果糖和葡萄糖含量高，在某些干制品种中糖分可达80%。"),
            es = LocalizedContent("¿Cuál es la fruta más dulce?", listOf("Dátil", "Higo", "Uva", "Cacao"), "Gastronomía", "El dátil es la fruta más dulce debido a su alto contenido de fructosa y glucosa, alcanzando hasta un 80% de azúcar en algunas variedades secas.")
        ),
        BilingualQuestion(
            id = 51862, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel pourcentage de sucre contient une datte?", listOf("50%", "70%", "80%", "90%"), "Gastronomie", "Les dattes sont des fruits très sucrés car elles perdent leur eau en séchant, concentrant ainsi leur teneur naturelle en fructose et glucose jusqu'à environ 70%."),
            en = LocalizedContent("What percentage of sugar does a date contain?", listOf("50%", "70%", "80%", "90%"), "Gastronomy", "Dates are very sweet fruits because they lose water when drying, concentrating their natural fructose and glucose content to about 70%."),
            zh = LocalizedContent("椰枣含有百分之多少的糖？", listOf("50%", "70%", "80%", "90%"), "美食", "椰枣是非常甜的水果，因为在干燥过程中失去水分，其天然果糖和葡萄糖含量浓缩到约70%。"),
            es = LocalizedContent("¿Qué porcentaje de azúcar contiene un dátil?", listOf("50%", "70%", "80%", "90%"), "Gastronomía", "Los dátiles son frutas muy dulces porque pierden agua al secarse, concentrando su contenido natural de fructosa y glucosa hasta aproximadamente un 70%.")
        ),
        BilingualQuestion(
            id = 51863, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le légume le moins calorique?", listOf("Laitue", "Céleri", "Concombre", "Courgette"), "Gastronomie", "Le concombre est composé à 96% d'eau, ce qui lui confère une très faible densité calorique, avec environ 15 calories pour 100 grammes."),
            en = LocalizedContent("What is the least caloric vegetable?", listOf("Lettuce", "Celery", "Cucumber", "Zucchini"), "Gastronomy", "Cucumber is composed of 96% water, giving it a very low caloric density, with about 15 calories per 100 grams."),
            zh = LocalizedContent("热量最低的蔬菜是什么？", listOf("生菜", "芹菜", "黄瓜", "西葫芦"), "美食", "黄瓜由96%的水组成，因此热量密度极低，每100克约含15卡路里。"),
            es = LocalizedContent("¿Cuál es la verdura menos calórica?", listOf("Lechuga", "Apio", "Pepino", "Calabacín"), "Gastronomía", "El pepino está compuesto en un 96% de agua, lo que le confiere una densidad calórica muy baja, con aproximadamente 15 calorías por 100 gramos.")
        ),
        BilingualQuestion(
            id = 51864, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de calories pour 100g de céleri?", listOf("10", "15", "20", "30"), "Gastronomie", "Le céleri est un légume très peu calorique car il est composé à plus de 95% d'eau, ce qui explique sa faible valeur énergétique d'environ 30 kcal pour 100g."),
            en = LocalizedContent("How many calories per 100g of celery?", listOf("10", "15", "20", "30"), "Gastronomy", "Celery is a very low-calorie vegetable because it is composed of more than 95% water, which explains its low energy value of about 30 kcal per 100g."),
            zh = LocalizedContent("每100克芹菜含有多少卡路里？", listOf("10", "15", "20", "30"), "美食", "芹菜是一种热量很低的蔬菜，因为它由超过95%的水组成，这解释了其每100克约30千卡的低能量值。"),
            es = LocalizedContent("¿Cuántas calorías por 100g de apio?", listOf("10", "15", "20", "30"), "Gastronomía", "El apio es una verdura muy baja en calorías porque está compuesto por más del 95% de agua, lo que explica su bajo valor energético de aproximadamente 30 kcal por 100g.")
        ),
        BilingualQuestion(
            id = 51865, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record de consommation de hot-dogs?", listOf("50", "75", "100", "150"), "Gastronomie", "Le record du monde de consommation de hot-dogs est détenu par Joey Chestnut, qui a avalé 50 hot-dogs en 10 minutes lors du concours annuel de Nathan's Famous à Coney Island en 2020."),
            en = LocalizedContent("What is the record for hot dog consumption?", listOf("50", "75", "100", "150"), "Gastronomy", "The world record for hot dog consumption is held by Joey Chestnut, who ate 50 hot dogs in 10 minutes at the annual Nathan's Famous contest in Coney Island in 2020."),
            zh = LocalizedContent("热狗消费的纪录是多少？", listOf("50", "75", "100", "150"), "美食", "热狗消费的世界纪录由乔伊·切斯特纳特保持，他在2020年康尼岛年度内森著名比赛中10分钟内吃掉了50个热狗。"),
            es = LocalizedContent("¿Cuál es el récord de consumo de hot dogs?", listOf("50", "75", "100", "150"), "Gastronomía", "El récord mundial de consumo de hot dogs lo ostenta Joey Chestnut, quien devoró 50 hot dogs en 10 minutos durante el concurso anual de Nathan's Famous en Coney Island en 2020.")
        ),
        BilingualQuestion(
            id = 51866, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En combien de minutes ce record a-t-il été fait?", listOf("5", "10", "15", "20"), "Gastronomie", "Le record de dégustation de 100 huîtres en 10 minutes a été établi par un compétiteur lors d'un championnat de vitesse."),
            en = LocalizedContent("In how many minutes was this record achieved?", listOf("5", "10", "15", "20"), "Gastronomy", "The record for eating 100 oysters in 10 minutes was set by a competitor during a speed-eating championship."),
            zh = LocalizedContent("这个纪录是在几分钟内完成的？", listOf("5", "10", "15", "20"), "美食", "在速度吃比赛中，一名选手创下了10分钟吃100个牡蛎的纪录。"),
            es = LocalizedContent("¿En cuántos minutos se logró este récord?", listOf("5", "10", "15", "20"), "Gastronomía", "El récord de degustación de 100 ostras en 10 minutos fue establecido por un competidor durante un campeonato de velocidad.")
        ),
        BilingualQuestion(
            id = 51867, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le fromage le plus consommé au monde?", listOf("Cheddar", "Mozzarella", "Emmental", "Brie"), "Gastronomie", "L'emmental est le fromage le plus consommé au monde en raison de sa production industrielle massive et de son utilisation répandue dans les plats préparés, les sandwichs et les fondues."),
            en = LocalizedContent("What is the most consumed cheese in the world?", listOf("Cheddar", "Mozzarella", "Emmental", "Brie"), "Gastronomy", "Emmental is the most consumed cheese in the world due to its massive industrial production and widespread use in prepared dishes, sandwiches, and fondues."),
            zh = LocalizedContent("世界上消费最多的奶酪是什么？", listOf("切达奶酪", "马苏里拉奶酪", "埃曼塔尔奶酪", "布里奶酪"), "美食", "埃曼塔尔奶酪是世界上消费最多的奶酪，因为其大规模工业生产和在预制菜、三明治和奶酪火锅中的广泛使用。"),
            es = LocalizedContent("¿Cuál es el queso más consumido del mundo?", listOf("Cheddar", "Mozzarella", "Emmental", "Brie"), "Gastronomía", "El emmental es el queso más consumido del mundo debido a su producción industrial masiva y su uso generalizado en platos preparados, sándwiches y fondues.")
        ),
        BilingualQuestion(
            id = 51868, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de millions de tonnes de fromage sont produites par an?", listOf("10", "20", "30", "50"), "Gastronomie", "La production mondiale de fromage dépasse les 20 millions de tonnes par an, avec l'Union européenne comme premier producteur. Le chiffre de 50 millions de tonnes est trop élevé et ne correspond pas aux données actuelles."),
            en = LocalizedContent("How many million tons of cheese are produced per year?", listOf("10", "20", "30", "50"), "Gastronomy", "Global cheese production exceeds 20 million tons per year, with the European Union as the top producer. The figure of 50 million tons is too high and does not match current data."),
            zh = LocalizedContent("每年生产多少百万吨奶酪？", listOf("10", "20", "30", "50"), "美食", "全球奶酪年产量超过2000万吨，欧盟是最大的生产地区。5000万吨的数字过高，与当前数据不符。"),
            es = LocalizedContent("¿Cuántos millones de toneladas de queso se producen al año?", listOf("10", "20", "30", "50"), "Gastronomía", "La producción mundial de queso supera los 20 millones de toneladas al año, con la Unión Europea como principal productor. La cifra de 50 millones de toneladas es demasiado alta y no corresponde a los datos actuales.")
        ),
        BilingualQuestion(
            id = 51869, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le lait animal le plus consommé?", listOf("Vache", "Chèvre", "Chamelle", "Brebis"), "Gastronomie", "Le lait de vache domine la production mondiale, représentant plus de 80% de la consommation totale de lait, loin devant le lait de bufflonne, de chèvre ou de brebis."),
            en = LocalizedContent("Which animal milk is the most consumed?", listOf("Cow", "Goat", "Camel", "Sheep"), "Gastronomy", "Cow's milk dominates global production, representing over 80% of total milk consumption, far ahead of buffalo, goat, or sheep milk."),
            zh = LocalizedContent("哪种动物奶消费最多？", listOf("牛奶", "山羊奶", "骆驼奶", "绵羊奶"), "美食", "牛奶主导全球产量，占总奶消费量的80%以上，远超水牛奶、山羊奶或绵羊奶。"),
            es = LocalizedContent("¿Qué leche animal es la más consumida?", listOf("Vaca", "Cabra", "Camella", "Oveja"), "Gastronomía", "La leche de vaca domina la producción mundial, representando más del 80% del consumo total de leche, muy por delante de la leche de búfala, cabra u oveja.")
        ),
        BilingualQuestion(
            id = 51870, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de milliards de litres de lait de vache sont produits par an?", listOf("100", "200", "500", "1000"), "Gastronomie", "La production mondiale de lait de vache atteint environ 200 milliards de litres par an, un chiffre qui reflète l'importance de cette denrée dans l'alimentation humaine et l'industrie agroalimentaire."),
            en = LocalizedContent("How many billion liters of cow's milk are produced per year?", listOf("100", "200", "500", "1000"), "Gastronomy", "Global cow's milk production reaches about 200 billion liters per year, a figure that reflects the importance of this commodity in human nutrition and the agri-food industry."),
            zh = LocalizedContent("每年生产多少亿升牛奶？", listOf("100", "200", "500", "1000"), "美食", "全球牛奶年产量约为2000亿升，这一数字反映了这种商品在人类营养和农业食品工业中的重要性。"),
            es = LocalizedContent("¿Cuántos miles de millones de litros de leche de vaca se producen al año?", listOf("100", "200", "500", "1000"), "Gastronomía", "La producción mundial de leche de vaca alcanza aproximadamente 200 mil millones de litros al año, una cifra que refleja la importancia de este producto en la alimentación humana y la industria agroalimentaria.")
        ),
        BilingualQuestion(
            id = 51871, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le yaourt le plus cher du monde?", listOf("Fage", "Straus", "Ellenos", "Noosa"), "Gastronomie", "Le yaourt grec Ellenos, fabriqué à Seattle, est le plus cher du monde car il utilise des ingrédients premium comme des fruits frais et du miel de Manuka, avec un prix pouvant atteindre 10 dollars par pot."),
            en = LocalizedContent("What is the most expensive yogurt in the world?", listOf("Fage", "Straus", "Ellenos", "Noosa"), "Gastronomy", "Ellenos Greek yogurt, made in Seattle, is the most expensive in the world because it uses premium ingredients like fresh fruit and Manuka honey, with a price that can reach $10 per pot."),
            zh = LocalizedContent("世界上最贵的酸奶是什么？", listOf("Fage", "Straus", "Ellenos", "Noosa"), "美食", "西雅图生产的Ellenos希腊酸奶是世界上最贵的，因为它使用新鲜水果和麦卢卡蜂蜜等优质原料，每罐价格可达10美元。"),
            es = LocalizedContent("¿Cuál es el yogur más caro del mundo?", listOf("Fage", "Straus", "Ellenos", "Noosa"), "Gastronomía", "El yogur griego Ellenos, fabricado en Seattle, es el más caro del mundo porque utiliza ingredientes premium como fruta fresca y miel de Manuka, con un precio que puede alcanzar los 10 dólares por envase.")
        ),
        BilingualQuestion(
            id = 51872, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le beurre le plus cher du monde?", listOf("Beurre normand", "Beurre breton", "Beurre suisse", "Beurre artisanal"), "Gastronomie", "Le beurre le plus cher est un beurre artisanal produit en petites quantités, souvent à partir de lait cru de vaches nourries à l'herbage, ce qui justifie son prix élevé."),
            en = LocalizedContent("What is the most expensive butter in the world?", listOf("Normandy butter", "Breton butter", "Swiss butter", "Artisanal butter"), "Gastronomy", "The most expensive butter is an artisanal butter produced in small quantities, often from raw milk of grass-fed cows, which justifies its high price."),
            zh = LocalizedContent("世界上最贵的黄油是什么？", listOf("诺曼底黄油", "布列塔尼黄油", "瑞士黄油", "手工黄油"), "美食", "最贵的黄油是手工制作的小批量黄油，通常使用草饲奶牛的生牛奶制成，这证明了其高昂的价格。"),
            es = LocalizedContent("¿Cuál es la mantequilla más cara del mundo?", listOf("Mantequilla normanda", "Mantequilla bretona", "Mantequilla suiza", "Mantequilla artesanal"), "Gastronomía", "La mantequilla más cara es una mantequilla artesanal producida en pequeñas cantidades, a menudo a partir de leche cruda de vacas alimentadas con pasto, lo que justifica su alto precio.")
        ),
        BilingualQuestion(
            id = 51873, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le miel le plus cher du monde?", listOf("Manuka 5+", "Manuka 10+", "Manuka 20+", "Or sucré"), "Gastronomie", "Le miel de Manuka 5+ est le plus cher du monde en raison de sa rareté et de ses propriétés antibactériennes uniques, provenant du nectar de l’arbre Manuka en Nouvelle-Zélande."),
            en = LocalizedContent("What is the most expensive honey in the world?", listOf("Manuka 5+", "Manuka 10+", "Manuka 20+", "Sweet Gold"), "Gastronomy", "Manuka 5+ honey is the most expensive in the world due to its rarity and unique antibacterial properties, derived from the nectar of the Manuka tree in New Zealand."),
            zh = LocalizedContent("世界上最贵的蜂蜜是什么？", listOf("麦卢卡5+", "麦卢卡10+", "麦卢卡20+", "甜金"), "美食", "麦卢卡5+蜂蜜是世界上最贵的，因为其稀有性和独特的抗菌特性，源自新西兰麦卢卡树的花蜜。"),
            es = LocalizedContent("¿Cuál es la miel más cara del mundo?", listOf("Manuka 5+", "Manuka 10+", "Manuka 20+", "Oro dulce"), "Gastronomía", "La miel de Manuka 5+ es la más cara del mundo debido a su rareza y propiedades antibacterianas únicas, provenientes del néctar del árbol Manuka en Nueva Zelanda.")
        ),
        BilingualQuestion(
            id = 51874, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien coûte un kilogramme de Manuka 20+?", listOf("1000", "5000", "10000", "50000"), "Gastronomie", "Le miel de Manuka 20+ est un miel de Nouvelle-Zélande très prisé pour ses propriétés antibactériennes, ce qui justifie son prix élevé d'environ 5000 euros le kilogramme."),
            en = LocalizedContent("How much does a kilogram of Manuka 20+ cost?", listOf("1000", "5000", "10000", "50000"), "Gastronomy", "Manuka 20+ honey is a highly prized New Zealand honey for its antibacterial properties, which justifies its high price of about 5000 euros per kilogram."),
            zh = LocalizedContent("一公斤麦卢卡20+蜂蜜多少钱？", listOf("1000", "5000", "10000", "50000"), "美食", "麦卢卡20+蜂蜜是一种备受推崇的新西兰蜂蜜，因其抗菌特性而价格高昂，每公斤约5000欧元。"),
            es = LocalizedContent("¿Cuánto cuesta un kilogramo de Manuka 20+?", listOf("1000", "5000", "10000", "50000"), "Gastronomía", "La miel de Manuka 20+ es una miel neozelandesa muy apreciada por sus propiedades antibacterianas, lo que justifica su alto precio de unos 5000 euros por kilogramo.")
        ),
        BilingualQuestion(
            id = 51875, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le sucre le plus raffiné du monde?", listOf("Muscovado", "Rapadura", "Sucre blanc", "Sucre d'or"), "Gastronomie", "Le sucre blanc subit un processus de raffinage poussé qui élimine la mélasse et les impuretés, le rendant plus pur que le sucre roux ou complet."),
            en = LocalizedContent("What is the most refined sugar in the world?", listOf("Muscovado", "Rapadura", "White sugar", "Gold sugar"), "Gastronomy", "White sugar undergoes an extensive refining process that removes molasses and impurities, making it purer than brown or whole cane sugar."),
            zh = LocalizedContent("世界上最精炼的糖是什么？", listOf("马斯卡瓦多糖", "拉帕杜拉糖", "白糖", "金糖"), "美食", "白糖经过深度精炼过程，去除了糖蜜和杂质，使其比红糖或全蔗糖更纯净。"),
            es = LocalizedContent("¿Cuál es el azúcar más refinado del mundo?", listOf("Moscovado", "Rapadura", "Azúcar blanco", "Azúcar de oro"), "Gastronomía", "El azúcar blanco se somete a un proceso de refinamiento exhaustivo que elimina la melaza y las impurezas, haciéndolo más puro que el azúcar moreno o integral.")
        ),
        BilingualQuestion(
            id = 51876, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel philosophe a dit: 'Je pense, donc je suis'?", listOf("Spinoza", "Descartes", "Leibniz", "Pascal"), "Philosophie", "La citation \"Je pense, donc je suis\" est en réalité de René Descartes, et non de Spinoza. Spinoza a critiqué cette formule dans son œuvre majeure, l'Éthique, en proposant une conception différente de la substance et de la pensée."),
            en = LocalizedContent("Which philosopher said: 'I think, therefore I am'?", listOf("Spinoza", "Descartes", "Leibniz", "Pascal"), "Philosophy", "The quote 'I think, therefore I am' is actually by René Descartes, not Spinoza. Spinoza criticized this formula in his major work, Ethics, proposing a different conception of substance and thought."),
            zh = LocalizedContent("哪位哲学家说过：“我思故我在”？", listOf("斯宾诺莎", "笛卡尔", "莱布尼茨", "帕斯卡"), "哲学", "“我思故我在”这句话实际上是勒内·笛卡尔说的，而不是斯宾诺莎。斯宾诺莎在其主要著作《伦理学》中批评了这一公式，提出了关于实体和思想的不同概念。"),
            es = LocalizedContent("¿Qué filósofo dijo: 'Pienso, luego existo'?", listOf("Spinoza", "Descartes", "Leibniz", "Pascal"), "Filosofía", "La cita 'Pienso, luego existo' es en realidad de René Descartes, no de Spinoza. Spinoza criticó esta fórmula en su obra principal, la Ética, proponiendo una concepción diferente de la sustancia y el pensamiento.")
        ),
        BilingualQuestion(
            id = 51877, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le problème du trolley?", listOf("Transport", "Dilemme éthique", "Escalade", "Paradoxe"), "Philosophie", "Le problème du trolley est une expérience de pensée célèbre en philosophie morale qui illustre un conflit entre l'utilitarisme et la déontologie, forçant à choisir entre sacrifier une personne pour en sauver plusieurs."),
            en = LocalizedContent("What is the trolley problem?", listOf("Transport", "Ethical dilemma", "Climbing", "Paradox"), "Philosophy", "The trolley problem is a famous thought experiment in moral philosophy that illustrates a conflict between utilitarianism and deontology, forcing a choice between sacrificing one person to save several."),
            zh = LocalizedContent("什么是电车难题？", listOf("交通", "伦理困境", "攀岩", "悖论"), "哲学", "电车难题是道德哲学中一个著名的思想实验，它说明了功利主义与义务论之间的冲突，迫使人们在牺牲一个人以拯救多人之间做出选择。"),
            es = LocalizedContent("¿Qué es el problema del tranvía?", listOf("Transporte", "Dilema ético", "Escalada", "Paradoja"), "Filosofía", "El problema del tranvía es un famoso experimento mental en filosofía moral que ilustra un conflicto entre el utilitarismo y la deontología, obligando a elegir entre sacrificar a una persona para salvar a varias.")
        ),
        BilingualQuestion(
            id = 51878, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel philosophe a proposé l'utilitarisme?", listOf("Mill", "Bentham", "Kant", "Aristote"), "Philosophie", "Emmanuel Kant n'a pas proposé l'utilitarisme, mais une morale déontologique fondée sur l'impératif catégorique. L'utilitarisme a été développé par Jeremy Bentham et John Stuart Mill."),
            en = LocalizedContent("Which philosopher proposed utilitarianism?", listOf("Mill", "Bentham", "Kant", "Aristotle"), "Philosophy", "Immanuel Kant did not propose utilitarianism, but a deontological morality based on the categorical imperative. Utilitarianism was developed by Jeremy Bentham and John Stuart Mill."),
            zh = LocalizedContent("哪位哲学家提出了功利主义？", listOf("密尔", "边沁", "康德", "亚里士多德"), "哲学", "伊曼努尔·康德并没有提出功利主义，而是提出了一种基于绝对命令的义务论道德。功利主义是由杰里米·边沁和约翰·斯图尔特·密尔发展起来的。"),
            es = LocalizedContent("¿Qué filósofo propuso el utilitarismo?", listOf("Mill", "Bentham", "Kant", "Aristóteles"), "Filosofía", "Immanuel Kant no propuso el utilitarismo, sino una moral deontológica basada en el imperativo categórico. El utilitarismo fue desarrollado por Jeremy Bentham y John Stuart Mill.")
        ),
        BilingualQuestion(
            id = 51879, correctIndex = 3, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le Pic de Dunning-Kruger?", listOf("Montagne", "Illusion cognitive", "Théorie quantique", "Paradoxe"), "Philosophie", "Le pic de Dunning-Kruger est le point où des personnes peu compétentes surestiment leurs capacités, créant un paradoxe entre confiance et compétence réelle."),
            en = LocalizedContent("What is the Dunning-Kruger peak?", listOf("Mountain", "Cognitive illusion", "Quantum theory", "Paradox"), "Philosophy", "The Dunning-Kruger peak is the point where incompetent people overestimate their abilities, creating a paradox between confidence and actual competence."),
            zh = LocalizedContent("什么是邓宁-克鲁格峰值？", listOf("山峰", "认知错觉", "量子理论", "悖论"), "哲学", "邓宁-克鲁格峰值是指能力不足的人高估自己能力的点，在自信与实际能力之间造成悖论。"),
            es = LocalizedContent("¿Qué es el pico de Dunning-Kruger?", listOf("Montaña", "Ilusión cognitiva", "Teoría cuántica", "Paradoja"), "Filosofía", "El pico de Dunning-Kruger es el punto donde las personas incompetentes sobreestiman sus habilidades, creando una paradoja entre la confianza y la competencia real.")
        ),
        BilingualQuestion(
            id = 51880, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel philosophe créé le concept de Caverne?", listOf("Aristote", "Platon", "Socrate", "Héraclite"), "Philosophie", "Le concept de la caverne est en réalité une allégorie célèbre de Platon, et non d'Aristote, qui décrit des prisonniers confondant des ombres avec la réalité."),
            en = LocalizedContent("Which philosopher created the concept of the Cave?", listOf("Aristotle", "Plato", "Socrates", "Heraclitus"), "Philosophy", "The concept of the cave is actually a famous allegory by Plato, not Aristotle, describing prisoners mistaking shadows for reality."),
            zh = LocalizedContent("哪位哲学家创造了洞穴的概念？", listOf("亚里士多德", "柏拉图", "苏格拉底", "赫拉克利特"), "哲学", "洞穴的概念实际上是柏拉图著名的寓言，而非亚里士多德，它描述了囚犯将影子误认为现实。"),
            es = LocalizedContent("¿Qué filósofo creó el concepto de la Caverna?", listOf("Aristóteles", "Platón", "Sócrates", "Heráclito"), "Filosofía", "El concepto de la caverna es en realidad una famosa alegoría de Platón, no de Aristóteles, que describe a prisioneros confundiendo sombras con la realidad.")
        ),
        BilingualQuestion(
            id = 51881, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le paradoxe du bateau de Thésée?", listOf("Construction", "Identité", "Navigation", "Matière"), "Philosophie", "Le paradoxe du bateau de Thésée interroge si un objet dont toutes les pièces ont été remplacées reste le même, ce qui en fait un problème philosophique sur l'identité."),
            en = LocalizedContent("What is the paradox of Theseus's ship?", listOf("Construction", "Identity", "Navigation", "Matter"), "Philosophy", "The paradox of Theseus's ship questions whether an object whose parts have all been replaced remains the same, making it a philosophical problem about identity."),
            zh = LocalizedContent("忒修斯之船悖论是什么？", listOf("建造", "同一性", "航海", "物质"), "哲学", "忒修斯之船悖论质疑一个所有部件都被替换的物体是否仍然是同一个，这使其成为一个关于同一性的哲学问题。"),
            es = LocalizedContent("¿Qué es la paradoja del barco de Teseo?", listOf("Construcción", "Identidad", "Navegación", "Materia"), "Filosofía", "La paradoja del barco de Teseo cuestiona si un objeto cuyas partes han sido reemplazadas sigue siendo el mismo, lo que lo convierte en un problema filosófico sobre la identidad.")
        ),
        BilingualQuestion(
            id = 51882, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le paradoxe de Zénon?", listOf("Flèche", "Mouvement", "Division infinie", "Tous"), "Philosophie", "Zénon d'Élée a formulé des paradoxes sur le mouvement, comme celui d'Achille et la tortue, qui reposent sur l'idée qu'une distance peut être divisée en une infinité de segments."),
            en = LocalizedContent("What is Zeno's paradox?", listOf("Arrow", "Motion", "Infinite division", "All"), "Philosophy", "Zeno of Elea formulated paradoxes about motion, such as Achilles and the tortoise, which rely on the idea that a distance can be divided into an infinite number of segments."),
            zh = LocalizedContent("芝诺悖论是什么？", listOf("飞矢", "运动", "无限分割", "全部"), "哲学", "埃利亚的芝诺提出了关于运动的悖论，如阿喀琉斯与乌龟，这些悖论基于距离可以无限分割的思想。"),
            es = LocalizedContent("¿Qué es la paradoja de Zenón?", listOf("Flecha", "Movimiento", "División infinita", "Todos"), "Filosofía", "Zenón de Elea formuló paradojas sobre el movimiento, como la de Aquiles y la tortuga, que se basan en la idea de que una distancia puede dividirse en un número infinito de segmentos.")
        ),
        BilingualQuestion(
            id = 51883, correctIndex = 3, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel philosophe a créé le Surhomme?", listOf("Schopenhauer", "Nietzsche", "Kierkegaard", "Comte"), "Philosophie", "Auguste Comte a introduit le concept du Surhomme dans sa philosophie positiviste, où il désigne l'humanité future idéale et rationnelle."),
            en = LocalizedContent("Which philosopher created the Overman?", listOf("Schopenhauer", "Nietzsche", "Kierkegaard", "Comte"), "Philosophy", "Auguste Comte introduced the concept of the Overman in his positivist philosophy, where it designates the ideal and rational future humanity."),
            zh = LocalizedContent("哪位哲学家创造了超人？", listOf("叔本华", "尼采", "克尔凯郭尔", "孔德"), "哲学", "奥古斯特·孔德在其实证主义哲学中引入了超人的概念，指代理想而理性的未来人类。"),
            es = LocalizedContent("¿Qué filósofo creó el Superhombre?", listOf("Schopenhauer", "Nietzsche", "Kierkegaard", "Comte"), "Filosofía", "Auguste Comte introdujo el concepto del Superhombre en su filosofía positivista, donde designa a la humanidad futura ideal y racional.")
        ),
        BilingualQuestion(
            id = 51884, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le concept de l'Être et du Néant?", listOf("Heidegger", "Sartre", "Hegel", "Husserl"), "Philosophie", "Heidegger a développé le concept de l'Être et du Néant dans son œuvre majeure \"Être et Temps\", où il analyse la question de l'être à travers l'existence humaine."),
            en = LocalizedContent("What is the concept of Being and Nothingness?", listOf("Heidegger", "Sartre", "Hegel", "Husserl"), "Philosophy", "Heidegger developed the concept of Being and Nothingness in his major work 'Being and Time', where he analyzes the question of being through human existence."),
            zh = LocalizedContent("存在与虚无的概念是什么？", listOf("海德格尔", "萨特", "黑格尔", "胡塞尔"), "哲学", "海德格尔在其主要著作《存在与时间》中发展了存在与虚无的概念，通过人类存在来分析存在的问题。"),
            es = LocalizedContent("¿Cuál es el concepto del Ser y la Nada?", listOf("Heidegger", "Sartre", "Hegel", "Husserl"), "Filosofía", "Heidegger desarrolló el concepto del Ser y la Nada en su obra principal 'Ser y Tiempo', donde analiza la cuestión del ser a través de la existencia humana.")
        ),
        BilingualQuestion(
            id = 51885, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel philosophe a dit: 'L'existence précède l'essence'?", listOf("Heidegger", "Sartre", "Foucault", "Lacan"), "Philosophie", "Cette phrase est le principe central de l’existentialisme athée de Jean-Paul Sartre, affirmant que l’homme n’a pas de nature prédéfinie et se construit librement par ses actions."),
            en = LocalizedContent("Which philosopher said: 'Existence precedes essence'?", listOf("Heidegger", "Sartre", "Foucault", "Lacan"), "Philosophy", "This phrase is the central principle of Jean-Paul Sartre's atheistic existentialism, asserting that man has no predefined nature and freely constructs himself through his actions."),
            zh = LocalizedContent("哪位哲学家说过：“存在先于本质”？", listOf("海德格尔", "萨特", "福柯", "拉康"), "哲学", "这句话是让-保罗·萨特无神论存在主义的核心原则，主张人没有预定的本质，通过自己的行动自由地构建自我。"),
            es = LocalizedContent("¿Qué filósofo dijo: 'La existencia precede a la esencia'?", listOf("Heidegger", "Sartre", "Foucault", "Lacan"), "Filosofía", "Esta frase es el principio central del existencialismo ateo de Jean-Paul Sartre, afirmando que el hombre no tiene una naturaleza predefinida y se construye libremente a través de sus acciones.")
        ),
        BilingualQuestion(
            id = 51886, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le concept de déterminisme?", listOf("Libre arbitre", "Causalité totale", "Hasard", "Conscience"), "Philosophie", "Le déterminisme s'oppose au hasard, car il postule que tout événement est causé par des conditions antérieures, sans place pour l'imprévisible."),
            en = LocalizedContent("What is the concept of determinism?", listOf("Free will", "Total causality", "Chance", "Consciousness"), "Philosophy", "Determinism opposes chance, as it posits that every event is caused by prior conditions, leaving no room for the unpredictable."),
            zh = LocalizedContent("什么是决定论的概念？", listOf("自由意志", "完全因果性", "偶然", "意识"), "哲学", "决定论与偶然相对，因为它主张每个事件都由先前条件引起，没有不可预测的空间。"),
            es = LocalizedContent("¿Cuál es el concepto de determinismo?", listOf("Libre albedrío", "Causalidad total", "Azar", "Conciencia"), "Filosofía", "El determinismo se opone al azar, ya que postula que todo evento es causado por condiciones anteriores, sin lugar para lo impredecible.")
        ),
        BilingualQuestion(
            id = 51887, correctIndex = 3, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le paradoxe de Newcomb?", listOf("Prédiction", "Boîtes", "Choix", "Tous"), "Philosophie", "Le paradoxe de Newcomb est un problème de théorie de la décision où un prédicteur infaillible place deux boîtes, et le joueur doit choisir entre prendre une ou les deux, créant un conflit entre les principes de dominance et d'espérance mathématique."),
            en = LocalizedContent("What is Newcomb's paradox?", listOf("Prediction", "Boxes", "Choice", "All"), "Philosophy", "Newcomb's paradox is a decision theory problem where an infallible predictor places two boxes, and the player must choose between taking one or both, creating a conflict between the principles of dominance and mathematical expectation."),
            zh = LocalizedContent("什么是纽科姆悖论？", listOf("预测", "盒子", "选择", "全部"), "哲学", "纽科姆悖论是一个决策理论问题，其中一位无误的预测者放置两个盒子，玩家必须选择拿一个或两个，从而在支配原则和数学期望之间产生冲突。"),
            es = LocalizedContent("¿Qué es la paradoja de Newcomb?", listOf("Predicción", "Cajas", "Elección", "Todas"), "Filosofía", "La paradoja de Newcomb es un problema de teoría de la decisión donde un predictor infalible coloca dos cajas, y el jugador debe elegir entre tomar una o ambas, creando un conflicto entre los principios de dominancia y esperanza matemática.")
        ),
        BilingualQuestion(
            id = 51888, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel philosopher a étudié l'absurde?", listOf("Camus", "Sartre", "Beckett", "Ionesco"), "Philosophie", "Albert Camus a développé le concept d'absurde dans son essai \"Le Mythe de Sisyphe\", où il explore la confrontation entre le besoin humain de sens et le silence du monde."),
            en = LocalizedContent("Which philosopher studied the absurd?", listOf("Camus", "Sartre", "Beckett", "Ionesco"), "Philosophy", "Albert Camus developed the concept of the absurd in his essay \"The Myth of Sisyphus\", where he explores the confrontation between the human need for meaning and the silence of the world."),
            zh = LocalizedContent("哪位哲学家研究了荒诞？", listOf("加缪", "萨特", "贝克特", "尤内斯库"), "哲学", "阿尔贝·加缪在他的散文《西西弗神话》中发展了荒诞的概念，探讨了人类对意义的需求与世界的沉默之间的对抗。"),
            es = LocalizedContent("¿Qué filósofo estudió lo absurdo?", listOf("Camus", "Sartre", "Beckett", "Ionesco"), "Filosofía", "Albert Camus desarrolló el concepto de lo absurdo en su ensayo \"El mito de Sísifo\", donde explora la confrontación entre la necesidad humana de sentido y el silencio del mundo.")
        ),
        BilingualQuestion(
            id = 51889, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le mythe de Sisyphe?", listOf("Roche", "Punition", "Liberté", "Tous"), "Philosophie", "Sisyphe est condamné par les dieux à rouler éternellement un rocher au sommet d'une montagne, d'où il redescend toujours. Ce mythe illustre l'absurdité de la condition humaine selon Albert Camus."),
            en = LocalizedContent("What is the myth of Sisyphus?", listOf("Rock", "Punishment", "Freedom", "All"), "Philosophy", "Sisyphus is condemned by the gods to eternally roll a rock up a mountain, from which it always rolls back down. This myth illustrates the absurdity of the human condition according to Albert Camus."),
            zh = LocalizedContent("什么是西西弗神话？", listOf("岩石", "惩罚", "自由", "全部"), "哲学", "西西弗被众神惩罚，永远将一块岩石推上山顶，而岩石总是滚落下来。这个神话根据阿尔贝·加缪的观点，说明了人类处境的荒诞性。"),
            es = LocalizedContent("¿Cuál es el mito de Sísifo?", listOf("Roca", "Castigo", "Libertad", "Todas"), "Filosofía", "Sísifo es condenado por los dioses a rodar eternamente una roca hasta la cima de una montaña, desde donde siempre vuelve a caer. Este mito ilustra lo absurdo de la condición humana según Albert Camus.")
        ),
        BilingualQuestion(
            id = 51890, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le concept de Deus Ex Machina?", listOf("Intervention divine", "Logique", "Paradoxe", "Physique"), "Philosophie", "Le Deus Ex Machina désigne un élément extérieur qui résout une situation de manière inattendue, créant un paradoxe narratif car il brise la logique interne de l'histoire."),
            en = LocalizedContent("What is the concept of Deus Ex Machina?", listOf("Divine intervention", "Logic", "Paradox", "Physics"), "Philosophy", "Deus Ex Machina refers to an external element that resolves a situation unexpectedly, creating a narrative paradox as it breaks the internal logic of the story."),
            zh = LocalizedContent("什么是机械降神的概念？", listOf("神干预", "逻辑", "悖论", "物理"), "哲学", "机械降神指一个外部元素意外地解决了一个情境，造成叙事悖论，因为它打破了故事的内部逻辑。"),
            es = LocalizedContent("¿Cuál es el concepto de Deus Ex Machina?", listOf("Intervención divina", "Lógica", "Paradoja", "Física"), "Filosofía", "Deus Ex Machina se refiere a un elemento externo que resuelve una situación de manera inesperada, creando una paradoja narrativa al romper la lógica interna de la historia.")
        ),
        BilingualQuestion(
            id = 51891, correctIndex = 3, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le plus célèbre paradoxe logique?", listOf("Russell", "Gödel", "Cantor", "Fermi"), "Philosophie", "Le paradoxe de Fermi oppose la haute probabilité d'existence de civilisations extraterrestres à l'absence de preuves de leur présence, soulevant une contradiction logique célèbre."),
            en = LocalizedContent("What is the most famous logical paradox?", listOf("Russell", "Gödel", "Cantor", "Fermi"), "Philosophy", "Fermi's paradox contrasts the high probability of existence of extraterrestrial civilizations with the lack of evidence of their presence, raising a famous logical contradiction."),
            zh = LocalizedContent("最著名的逻辑悖论是什么？", listOf("罗素", "哥德尔", "康托尔", "费米"), "哲学", "费米悖论将外星文明存在的高概率与缺乏其存在的证据相对比，提出了一个著名的逻辑矛盾。"),
            es = LocalizedContent("¿Cuál es la paradoja lógica más famosa?", listOf("Russell", "Gödel", "Cantor", "Fermi"), "Filosofía", "La paradoja de Fermi contrasta la alta probabilidad de existencia de civilizaciones extraterrestres con la falta de evidencia de su presencia, planteando una famosa contradicción lógica.")
        ),
        BilingualQuestion(
            id = 51892, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le paradoxe du barbier?", listOf("Logique", "Coupe", "Rasage", "Identité"), "Philosophie", "Le paradoxe du barbier est un problème de logique mathématique formulé par Bertrand Russell, illustrant une contradiction dans la théorie des ensembles."),
            en = LocalizedContent("What is the barber paradox?", listOf("Logic", "Cut", "Shaving", "Identity"), "Philosophy", "The barber paradox is a problem in mathematical logic formulated by Bertrand Russell, illustrating a contradiction in set theory."),
            zh = LocalizedContent("什么是理发师悖论？", listOf("逻辑", "剪", "剃须", "身份"), "哲学", "理发师悖论是伯特兰·罗素提出的一个数理逻辑问题，说明了集合论中的一个矛盾。"),
            es = LocalizedContent("¿Qué es la paradoja del barbero?", listOf("Lógica", "Corte", "Afeitado", "Identidad"), "Filosofía", "La paradoja del barbero es un problema de lógica matemática formulado por Bertrand Russell, que ilustra una contradicción en la teoría de conjuntos.")
        ),
        BilingualQuestion(
            id = 51893, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel philosophe a créé le concept de Justice?", listOf("Platon", "Aristote", "Socrate", "Hérodote"), "Philosophie", "Aristote a développé une théorie de la justice distributive et corrective dans son ouvrage \"Éthique à Nicomaque\", posant les bases de la philosophie politique occidentale."),
            en = LocalizedContent("Which philosopher created the concept of Justice?", listOf("Plato", "Aristotle", "Socrates", "Herodotus"), "Philosophy", "Aristotle developed a theory of distributive and corrective justice in his work \"Nicomachean Ethics\", laying the foundations of Western political philosophy."),
            zh = LocalizedContent("哪位哲学家创造了正义的概念？", listOf("柏拉图", "亚里士多德", "苏格拉底", "希罗多德"), "哲学", "亚里士多德在他的著作《尼各马可伦理学》中发展了分配正义和矫正正义的理论，奠定了西方政治哲学的基础。"),
            es = LocalizedContent("¿Qué filósofo creó el concepto de Justicia?", listOf("Platón", "Aristóteles", "Sócrates", "Heródoto"), "Filosofía", "Aristóteles desarrolló una teoría de la justicia distributiva y correctiva en su obra \"Ética a Nicómaco\", sentando las bases de la filosofía política occidental.")
        ),
        BilingualQuestion(
            id = 51894, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le contrat social?", listOf("Hobbes", "Rousseau", "Locke", "Tous"), "Philosophie", "Le contrat social est une théorie politique développée par des penseurs comme Hobbes, Locke et Rousseau. Locke a notamment théorisé que les individus consentent à un gouvernement pour protéger leurs droits naturels."),
            en = LocalizedContent("What is the social contract?", listOf("Hobbes", "Rousseau", "Locke", "All"), "Philosophy", "The social contract is a political theory developed by thinkers such as Hobbes, Locke, and Rousseau. Locke notably theorized that individuals consent to a government to protect their natural rights."),
            zh = LocalizedContent("什么是社会契约？", listOf("霍布斯", "卢梭", "洛克", "全部"), "哲学", "社会契约是由霍布斯、洛克和卢梭等思想家发展的政治理论。洛克特别提出，个人同意建立政府以保护他们的自然权利。"),
            es = LocalizedContent("¿Qué es el contrato social?", listOf("Hobbes", "Rousseau", "Locke", "Todos"), "Filosofía", "El contrato social es una teoría política desarrollada por pensadores como Hobbes, Locke y Rousseau. Locke teorizó especialmente que los individuos consienten un gobierno para proteger sus derechos naturales.")
        ),
        BilingualQuestion(
            id = 51895, correctIndex = 3, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel philosophe a étudié la Morale?", listOf("Kant", "Aristote", "Mill", "Tous"), "Philosophie", "La morale est une branche centrale de la philosophie, étudiée par la quasi-totalité des philosophes, de Socrate à Kant en passant par Aristote ou Nietzsche."),
            en = LocalizedContent("Which philosopher studied Morality?", listOf("Kant", "Aristotle", "Mill", "All"), "Philosophy", "Morality is a central branch of philosophy, studied by almost all philosophers, from Socrates to Kant, including Aristotle and Nietzsche."),
            zh = LocalizedContent("哪位哲学家研究了道德？", listOf("康德", "亚里士多德", "密尔", "全部"), "哲学", "道德是哲学的核心分支，几乎所有的哲学家都研究过它，从苏格拉底到康德，包括亚里士多德和尼采。"),
            es = LocalizedContent("¿Qué filósofo estudió la Moral?", listOf("Kant", "Aristóteles", "Mill", "Todos"), "Filosofía", "La moral es una rama central de la filosofía, estudiada por casi todos los filósofos, desde Sócrates hasta Kant, pasando por Aristóteles o Nietzsche.")
        ),
        BilingualQuestion(
            id = 51896, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le concept d'Éthique?", listOf("Morale", "Droit", "Bien", "Tout"), "Philosophie", "L'éthique est souvent définie comme la science de la morale, étudiant les principes qui guident les actions humaines vers le bien."),
            en = LocalizedContent("What is the concept of Ethics?", listOf("Morality", "Law", "Good", "All"), "Philosophy", "Ethics is often defined as the science of morality, studying the principles that guide human actions towards the good."),
            zh = LocalizedContent("什么是伦理学的概念？", listOf("道德", "法律", "善", "全部"), "哲学", "伦理学通常被定义为道德的科学，研究指导人类行为趋向善的原则。"),
            es = LocalizedContent("¿Cuál es el concepto de Ética?", listOf("Moral", "Derecho", "Bien", "Todo"), "Filosofía", "La ética se define a menudo como la ciencia de la moral, que estudia los principios que guían las acciones humanas hacia el bien.")
        ),
        BilingualQuestion(
            id = 51897, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel philosopher a créé l'Existentialisme?", listOf("Sartre", "Camus", "Kierkegaard", "Heidegger"), "Philosophie", "Albert Camus est souvent associé à l'existentialisme, mais le terme a été popularisé par Jean-Paul Sartre, qui en est le principal fondateur avec son œuvre \"L'Être et le Néant\"."),
            en = LocalizedContent("Which philosopher created Existentialism?", listOf("Sartre", "Camus", "Kierkegaard", "Heidegger"), "Philosophy", "Albert Camus is often associated with existentialism, but the term was popularized by Jean-Paul Sartre, who is its main founder with his work \"Being and Nothingness\"."),
            zh = LocalizedContent("哪位哲学家创立了存在主义？", listOf("萨特", "加缪", "克尔凯郭尔", "海德格尔"), "哲学", "阿尔贝·加缪常与存在主义相关联，但该术语由让-保罗·萨特推广，他以其著作《存在与虚无》成为主要创始人。"),
            es = LocalizedContent("¿Qué filósofo creó el Existencialismo?", listOf("Sartre", "Camus", "Kierkegaard", "Heidegger"), "Filosofía", "Albert Camus suele asociarse con el existencialismo, pero el término fue popularizado por Jean-Paul Sartre, quien es su principal fundador con su obra \"El ser y la nada\".")
        ),
        BilingualQuestion(
            id = 51898, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le concept d'Authenticité?", listOf("Vrai", "Vivant", "Honnête", "Existentiel"), "Philosophie", "Le concept d'authenticité en philosophie renvoie à l'idée d'être fidèle à soi-même, d'agir en accord avec ses valeurs profondes, ce qui implique une forme d'honnêteté envers sa propre nature."),
            en = LocalizedContent("What is the concept of Authenticity?", listOf("True", "Living", "Honest", "Existential"), "Philosophy", "The concept of authenticity in philosophy refers to the idea of being true to oneself, acting in accordance with one's deep values, which implies a form of honesty towards one's own nature."),
            zh = LocalizedContent("什么是本真性的概念？", listOf("真实", "活着", "诚实", "存在"), "哲学", "哲学中的本真性概念指的是忠于自己、按照深层价值观行事的理念，这涉及对自己本性的一种诚实。"),
            es = LocalizedContent("¿Cuál es el concepto de Autenticidad?", listOf("Verdadero", "Viviente", "Honesto", "Existencial"), "Filosofía", "El concepto de autenticidad en filosofía se refiere a la idea de ser fiel a uno mismo, actuar de acuerdo con los valores profundos, lo que implica una forma de honestidad hacia la propia naturaleza.")
        ),
        BilingualQuestion(
            id = 51899, correctIndex = 3, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le concept de Mauvaise foi?", listOf("Mensonge", "Auto-tromperie", "Hypocrisie", "Trahison"), "Philosophie", "Concept développé par Sartre, la mauvaise foi désigne le fait de se mentir à soi-même en niant sa liberté, ce qui constitue une forme de trahison de sa propre conscience."),
            en = LocalizedContent("What is the concept of Bad Faith?", listOf("Lie", "Self-deception", "Hypocrisy", "Betrayal"), "Philosophy", "A concept developed by Sartre, bad faith refers to lying to oneself by denying one's freedom, which constitutes a form of betrayal of one's own consciousness."),
            zh = LocalizedContent("什么是自欺的概念？", listOf("谎言", "自我欺骗", "虚伪", "背叛"), "哲学", "萨特提出的概念，自欺指通过否认自己的自由来对自己撒谎，这构成对自己意识的一种背叛。"),
            es = LocalizedContent("¿Cuál es el concepto de Mala fe?", listOf("Mentira", "Autoengaño", "Hipocresía", "Traición"), "Filosofía", "Concepto desarrollado por Sartre, la mala fe se refiere a mentirse a uno mismo negando la propia libertad, lo que constituye una forma de traición a la propia conciencia.")
        ),
        BilingualQuestion(
            id = 51900, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le concept du Néant?", listOf("Vide", "Absence", "Néant absolu", "Tous"), "Philosophie", "Le concept du Néant en philosophie, notamment chez Sartre, désigne l'absence d'être, un vide ontologique qui permet la liberté humaine et la négation."),
            en = LocalizedContent("What is the concept of Nothingness?", listOf("Void", "Absence", "Absolute nothing", "All"), "Philosophy", "The concept of Nothingness in philosophy, particularly in Sartre, denotes the absence of being, an ontological void that allows human freedom and negation."),
            zh = LocalizedContent("什么是虚无的概念？", listOf("虚空", "缺席", "绝对虚无", "全部"), "哲学", "哲学中的虚无概念，尤其在萨特那里，指存在的缺失，一种允许人类自由和否定的本体论虚空。"),
            es = LocalizedContent("¿Cuál es el concepto de la Nada?", listOf("Vacío", "Ausencia", "Nada absoluta", "Todo"), "Filosofía", "El concepto de la Nada en filosofía, particularmente en Sartre, denota la ausencia de ser, un vacío ontológico que permite la libertad humana y la negación.")
        ),
        BilingualQuestion(
            id = 51901, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le concept de Transcendance?", listOf("Dépassement", "Divin", "Au-delà", "Tous"), "Philosophie", "En philosophie, la transcendance désigne ce qui dépasse l'expérience humaine et le monde sensible, souvent associé au divin ou à une réalité supérieure."),
            en = LocalizedContent("What is the concept of Transcendence?", listOf("Overcoming", "Divine", "Beyond", "All"), "Philosophy", "In philosophy, transcendence refers to what surpasses human experience and the sensible world, often associated with the divine or a higher reality."),
            zh = LocalizedContent("什么是超越的概念？", listOf("超越", "神圣", "彼岸", "全部"), "哲学", "在哲学中，超越指超越人类经验和感官世界的东西，常与神圣或更高现实相关联。"),
            es = LocalizedContent("¿Cuál es el concepto de Trascendencia?", listOf("Superación", "Divino", "Más allá", "Todo"), "Filosofía", "En filosofía, la trascendencia se refiere a lo que supera la experiencia humana y el mundo sensible, a menudo asociado con lo divino o una realidad superior.")
        ),
        BilingualQuestion(
            id = 51902, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le concept d'Immanence?", listOf("Présent", "Intérieur", "Matériel", "Tous"), "Philosophie", "Le concept d'immanence en philosophie s'oppose à la transcendance et désigne ce qui existe et agit à l'intérieur du monde matériel, sans recours à un principe extérieur ou divin."),
            en = LocalizedContent("What is the concept of Immanence?", listOf("Present", "Inner", "Material", "All"), "Philosophy", "The concept of immanence in philosophy opposes transcendence and refers to what exists and acts within the material world, without recourse to an external or divine principle."),
            zh = LocalizedContent("什么是内在性的概念？", listOf("在场", "内在", "物质", "全部"), "哲学", "哲学中的内在性概念与超越相对，指存在于物质世界内部并起作用的东西，无需借助外部或神圣原则。"),
            es = LocalizedContent("¿Cuál es el concepto de Inmanencia?", listOf("Presente", "Interior", "Material", "Todo"), "Filosofía", "El concepto de inmanencia en filosofía se opone a la trascendencia y se refiere a lo que existe y actúa dentro del mundo material, sin recurrir a un principio externo o divino.")
        ),
        BilingualQuestion(
            id = 51903, correctIndex = 3, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le concept de Phénomène?", listOf("Apparence", "Manifestation", "Réalité", "Tous"), "Philosophie", "Pour Emmanuel Kant, le phénomène est tout ce qui apparaît à notre conscience à travers nos formes a priori de sensibilité, donc tout objet de notre expérience possible."),
            en = LocalizedContent("What is the concept of Phenomenon?", listOf("Appearance", "Manifestation", "Reality", "All"), "Philosophy", "For Immanuel Kant, a phenomenon is everything that appears to our consciousness through our a priori forms of sensibility, thus any object of our possible experience."),
            zh = LocalizedContent("什么是现象的概念？", listOf("表象", "显现", "现实", "全部"), "哲学", "对于伊曼努尔·康德来说，现象是通过我们先天感性形式出现在意识中的一切，因此是我们可能经验的任何对象。"),
            es = LocalizedContent("¿Cuál es el concepto de Fenómeno?", listOf("Apariencia", "Manifestación", "Realidad", "Todo"), "Filosofía", "Para Immanuel Kant, un fenómeno es todo lo que aparece a nuestra conciencia a través de nuestras formas a priori de la sensibilidad, por lo tanto, cualquier objeto de nuestra experiencia posible.")
        ),
        BilingualQuestion(
            id = 51904, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le concept d'Essence?", listOf("Nature", "Propriété", "Fondamental", "Tous"), "Philosophie", "En philosophie, l'essence désigne la nature fondamentale d'une chose, ce qui la définit et la rend ce qu'elle est."),
            en = LocalizedContent("What is the concept of Essence?", listOf("Nature", "Property", "Fundamental", "All"), "Philosophy", "In philosophy, essence denotes the fundamental nature of a thing, what defines it and makes it what it is."),
            zh = LocalizedContent("什么是本质的概念？", listOf("本性", "属性", "根本", "全部"), "哲学", "在哲学中，本质指事物的根本性质，定义它并使其成为自身的东西。"),
            es = LocalizedContent("¿Cuál es el concepto de Esencia?", listOf("Naturaleza", "Propiedad", "Fundamental", "Todo"), "Filosofía", "En filosofía, la esencia denota la naturaleza fundamental de una cosa, lo que la define y la hace ser lo que es.")
        ),
        BilingualQuestion(
            id = 51905, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le concept de Substance?", listOf("Matière", "Propriété", "Essence", "Tous"), "Philosophie", "En philosophie, notamment chez Aristote, la substance est ce qui existe par soi-même et sert de support aux propriétés accidentelles."),
            en = LocalizedContent("What is the concept of Substance?", listOf("Matter", "Property", "Essence", "All"), "Philosophy", "In philosophy, particularly in Aristotle, substance is what exists by itself and serves as a support for accidental properties."),
            zh = LocalizedContent("什么是实体的概念？", listOf("物质", "属性", "本质", "全部"), "哲学", "在哲学中，尤其在亚里士多德那里，实体是自身存在并作为偶性支撑的东西。"),
            es = LocalizedContent("¿Cuál es el concepto de Sustancia?", listOf("Materia", "Propiedad", "Esencia", "Todo"), "Filosofía", "En filosofía, particularmente en Aristóteles, la sustancia es lo que existe por sí mismo y sirve de soporte a las propiedades accidentales.")
        ),
        BilingualQuestion(
            id = 51906, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le concept de Causalité?", listOf("Cause", "Effet", "Relation", "Tous"), "Philosophie", "La causalité désigne le lien de cause à effet entre deux phénomènes, ce qui en fait une relation fondamentale en philosophie et en science."),
            en = LocalizedContent("What is the concept of Causality?", listOf("Cause", "Effect", "Relation", "All"), "Philosophy", "Causality refers to the cause-and-effect link between two phenomena, making it a fundamental relation in philosophy and science."),
            zh = LocalizedContent("什么是因果性的概念？", listOf("原因", "结果", "关系", "所有"), "哲学", "因果性指两个现象之间的因果关系，是哲学和科学中的基本关系。"),
            es = LocalizedContent("¿Cuál es el concepto de Causalidad?", listOf("Causa", "Efecto", "Relación", "Todos"), "Filosofía", "La causalidad se refiere al vínculo de causa y efecto entre dos fenómenos, lo que la convierte en una relación fundamental en filosofía y ciencia.")
        ),
        BilingualQuestion(
            id = 51907, correctIndex = 3, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le concept d'Accord?", listOf("Consensus", "Harmonie", "Entente", "Tous"), "Philosophie", "En philosophie, le concept d'Accord renvoie à l'idée que la vérité ou la réalité repose sur un consensus universel, d'où la réponse \"Tous\" pour signifier que l'accord doit être général."),
            en = LocalizedContent("What is the concept of Agreement?", listOf("Consensus", "Harmony", "Understanding", "All"), "Philosophy", "In philosophy, the concept of Agreement refers to the idea that truth or reality rests on a universal consensus, hence the answer 'All' to signify that agreement must be general."),
            zh = LocalizedContent("什么是一致性的概念？", listOf("共识", "和谐", "谅解", "所有"), "哲学", "在哲学中，一致性的概念指的是真理或现实建立在普遍共识之上，因此答案“所有”表示一致必须是普遍的。"),
            es = LocalizedContent("¿Cuál es el concepto de Acuerdo?", listOf("Consenso", "Armonía", "Entendimiento", "Todos"), "Filosofía", "En filosofía, el concepto de Acuerdo se refiere a la idea de que la verdad o la realidad se basa en un consenso universal, de ahí la respuesta 'Todos' para indicar que el acuerdo debe ser general.")
        ),
        BilingualQuestion(
            id = 51908, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le concept de Liberté?", listOf("Absence de contrainte", "Pouvoir de choisir", "Autonomie", "Tous"), "Philosophie", "La liberté comme absence de contrainte est une définition classique en philosophie, notamment chez Hobbes et Locke, où elle signifie pouvoir agir sans entraves extérieures."),
            en = LocalizedContent("What is the concept of Freedom?", listOf("Absence of constraint", "Power to choose", "Autonomy", "All"), "Philosophy", "Freedom as absence of constraint is a classic definition in philosophy, notably in Hobbes and Locke, where it means being able to act without external hindrances."),
            zh = LocalizedContent("什么是自由的概念？", listOf("没有约束", "选择权", "自主", "所有"), "哲学", "自由作为没有约束是哲学中的经典定义，尤其在霍布斯和洛克那里，它意味着能够不受外部阻碍地行动。"),
            es = LocalizedContent("¿Cuál es el concepto de Libertad?", listOf("Ausencia de coacción", "Poder de elegir", "Autonomía", "Todos"), "Filosofía", "La libertad como ausencia de coacción es una definición clásica en filosofía, especialmente en Hobbes y Locke, donde significa poder actuar sin trabas externas.")
        ),
        BilingualQuestion(
            id = 51909, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le concept de Responsabilité?", listOf("Obligation", "Culpabilité", "Imputabilité", "Tous"), "Philosophie", "Dans la philosophie, notamment chez des penseurs comme Sartre, la responsabilité implique une charge morale qui peut se muer en sentiment de culpabilité face à ses actes."),
            en = LocalizedContent("What is the concept of Responsibility?", listOf("Obligation", "Guilt", "Imputability", "All"), "Philosophy", "In philosophy, particularly in thinkers like Sartre, responsibility implies a moral burden that can turn into a feeling of guilt regarding one's actions."),
            zh = LocalizedContent("什么是责任的概念？", listOf("义务", "内疚", "可归责性", "所有"), "哲学", "在哲学中，特别是在萨特等思想家那里，责任意味着一种道德负担，可能转化为对自己行为的负罪感。"),
            es = LocalizedContent("¿Cuál es el concepto de Responsabilidad?", listOf("Obligación", "Culpa", "Imputabilidad", "Todos"), "Filosofía", "En filosofía, especialmente en pensadores como Sartre, la responsabilidad implica una carga moral que puede convertirse en un sentimiento de culpa por los propios actos.")
        ),
        BilingualQuestion(
            id = 51910, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le concept de Conscience?", listOf("Awareness", "Sentience", "Intelligence", "Tous"), "Philosophie", "Dans la philosophie de l'esprit, la conscience est souvent définie comme une forme d'intelligence réflexive, permettant la perception de soi et du monde."),
            en = LocalizedContent("What is the concept of Consciousness?", listOf("Awareness", "Sentience", "Intelligence", "All"), "Philosophy", "In philosophy of mind, consciousness is often defined as a form of reflexive intelligence, enabling self-perception and perception of the world."),
            zh = LocalizedContent("什么是意识的概念？", listOf("觉察", "感知", "智能", "所有"), "哲学", "在心灵哲学中，意识常被定义为一种反思性智能，使人能够感知自我和世界。"),
            es = LocalizedContent("¿Cuál es el concepto de Conciencia?", listOf("Conciencia", "Sensibilidad", "Inteligencia", "Todos"), "Filosofía", "En la filosofía de la mente, la conciencia se define a menudo como una forma de inteligencia reflexiva, que permite la percepción de uno mismo y del mundo.")
        ),
        BilingualQuestion(
            id = 51911, correctIndex = 3, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le concept d'Inconscient?", listOf("Sommeil", "Mental caché", "Refoulé", "Tous"), "Philosophie", "Le concept d'inconscient, central en psychanalyse, désigne l'ensemble des processus psychiques échappant à la conscience, incluant pulsions, souvenirs refoulés et désirs."),
            en = LocalizedContent("What is the concept of the Unconscious?", listOf("Sleep", "Hidden mind", "Repressed", "All"), "Philosophy", "The concept of the unconscious, central in psychoanalysis, refers to the set of psychic processes beyond consciousness, including drives, repressed memories, and desires."),
            zh = LocalizedContent("什么是无意识的概念？", listOf("睡眠", "隐藏的心灵", "被压抑的", "所有"), "哲学", "无意识的概念是精神分析的核心，指意识之外的心理过程，包括冲动、被压抑的记忆和欲望。"),
            es = LocalizedContent("¿Cuál es el concepto de Inconsciente?", listOf("Sueño", "Mente oculta", "Reprimido", "Todos"), "Filosofía", "El concepto de inconsciente, central en el psicoanálisis, designa el conjunto de procesos psíquicos que escapan a la conciencia, incluyendo pulsiones, recuerdos reprimidos y deseos.")
        ),
        BilingualQuestion(
            id = 51912, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le concept de Volonté?", listOf("Désir", "Intention", "Force", "Tous"), "Philosophie", "Pour Schopenhauer et Nietzsche, la volonté est un principe fondamental de désir et de pulsion, une force irrationnelle qui pousse à l'action et à l'affirmation de soi."),
            en = LocalizedContent("What is the concept of Will?", listOf("Desire", "Intention", "Force", "All"), "Philosophy", "For Schopenhauer and Nietzsche, the will is a fundamental principle of desire and drive, an irrational force that pushes towards action and self-affirmation."),
            zh = LocalizedContent("什么是意志的概念？", listOf("欲望", "意图", "力量", "所有"), "哲学", "对于叔本华和尼采来说，意志是欲望和冲动的根本原则，是一种推动行动和自我肯定的非理性力量。"),
            es = LocalizedContent("¿Cuál es el concepto de Voluntad?", listOf("Deseo", "Intención", "Fuerza", "Todos"), "Filosofía", "Para Schopenhauer y Nietzsche, la voluntad es un principio fundamental de deseo e impulso, una fuerza irracional que impulsa a la acción y a la autoafirmación.")
        ),
        BilingualQuestion(
            id = 51913, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le concept de Raison?", listOf("Logique", "Intellect", "Justification", "Tous"), "Philosophie", "Dans la philosophie classique, notamment chez Descartes et Kant, la Raison désigne la faculté de l'intellect qui permet de connaître et de juger par concepts, distincte de la simple perception sensible."),
            en = LocalizedContent("What is the concept of Reason?", listOf("Logic", "Intellect", "Justification", "All"), "Philosophy", "In classical philosophy, notably in Descartes and Kant, Reason designates the faculty of intellect that allows knowing and judging through concepts, distinct from mere sensory perception."),
            zh = LocalizedContent("什么是理性的概念？", listOf("逻辑", "理智", "论证", "所有"), "哲学", "在古典哲学中，特别是在笛卡尔和康德那里，理性指通过概念进行认识和判断的理智能力，区别于单纯的感官知觉。"),
            es = LocalizedContent("¿Cuál es el concepto de Razón?", listOf("Lógica", "Intelecto", "Justificación", "Todos"), "Filosofía", "En la filosofía clásica, especialmente en Descartes y Kant, la Razón designa la facultad del intelecto que permite conocer y juzgar mediante conceptos, distinta de la mera percepción sensible.")
        ),
        BilingualQuestion(
            id = 51914, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le concept d'Émotion?", listOf("Sentiment", "Passion", "Affect", "Tous"), "Philosophie", "En philosophie, le terme « affect » est souvent utilisé pour désigner les émotions, passions ou sentiments en général, car il englobe l'ensemble des états affectifs."),
            en = LocalizedContent("What is the concept of Emotion?", listOf("Feeling", "Passion", "Affect", "All"), "Philosophy", "In philosophy, the term 'affect' is often used to denote emotions, passions, or feelings in general, as it encompasses all affective states."),
            zh = LocalizedContent("什么是情感的概念？", listOf("感受", "激情", "情感", "所有"), "哲学", "在哲学中，“情感”一词常用来指代情绪、激情或感受，因为它涵盖了所有情感状态。"),
            es = LocalizedContent("¿Cuál es el concepto de Emoción?", listOf("Sentimiento", "Pasión", "Afecto", "Todos"), "Filosofía", "En filosofía, el término 'afecto' se utiliza a menudo para designar emociones, pasiones o sentimientos en general, ya que abarca todos los estados afectivos.")
        ),
        BilingualQuestion(
            id = 51915, correctIndex = 3, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le concept de Désir?", listOf("Convoitise", "Aspiration", "Besoin", "Tous"), "Philosophie", "Le désir est un concept central en philosophie, abordé par de nombreux penseurs comme Platon, Spinoza ou Lacan, avec des définitions variées allant de la quête de l'être à la pulsion inconsciente."),
            en = LocalizedContent("What is the concept of Desire?", listOf("Covetousness", "Aspiration", "Need", "All"), "Philosophy", "Desire is a central concept in philosophy, addressed by many thinkers such as Plato, Spinoza, or Lacan, with varied definitions ranging from the quest for being to unconscious drive."),
            zh = LocalizedContent("什么是欲望的概念？", listOf("贪婪", "渴望", "需要", "所有"), "哲学", "欲望是哲学中的核心概念，许多思想家如柏拉图、斯宾诺莎或拉康都探讨过它，定义从对存在的追求到无意识冲动各不相同。"),
            es = LocalizedContent("¿Cuál es el concepto de Deseo?", listOf("Codicia", "Aspiración", "Necesidad", "Todos"), "Filosofía", "El deseo es un concepto central en filosofía, abordado por muchos pensadores como Platón, Spinoza o Lacan, con definiciones variadas que van desde la búsqueda del ser hasta la pulsión inconsciente.")
        ),
        BilingualQuestion(
            id = 51916, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le concept d'Amour?", listOf("Affection", "Passion", "Lien", "Tous"), "Philosophie", "Dans la philosophie grecque antique, l'amour était souvent défini comme une forme d'affection ou d'attachement, notamment par Platon dans Le Banquet."),
            en = LocalizedContent("What is the concept of Love?", listOf("Affection", "Passion", "Bond", "All"), "Philosophy", "In ancient Greek philosophy, love was often defined as a form of affection or attachment, notably by Plato in The Symposium."),
            zh = LocalizedContent("什么是爱的概念？", listOf("情感", "激情", "纽带", "所有"), "哲学", "在古希腊哲学中，爱常被定义为一种情感或依恋的形式，尤其是柏拉图在《会饮篇》中提出的。"),
            es = LocalizedContent("¿Cuál es el concepto de Amor?", listOf("Afecto", "Pasión", "Vínculo", "Todos"), "Filosofía", "En la filosofía griega antigua, el amor se definía a menudo como una forma de afecto o apego, especialmente por Platón en El Banquete.")
        ),
        BilingualQuestion(
            id = 51917, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le concept de Mort?", listOf("Fin", "Néant", "Transition", "Tous"), "Philosophie", "Pour les existentialistes comme Sartre, la mort réduit la conscience à rien, d'où sa définition comme néant absolu plutôt que comme passage ou transformation."),
            en = LocalizedContent("What is the concept of Death?", listOf("End", "Nothingness", "Transition", "All"), "Philosophy", "For existentialists like Sartre, death reduces consciousness to nothing, hence its definition as absolute nothingness rather than as passage or transformation."),
            zh = LocalizedContent("什么是死亡的概念？", listOf("终结", "虚无", "过渡", "所有"), "哲学", "对于萨特等存在主义者来说，死亡将意识化为虚无，因此将其定义为绝对的虚无，而非过渡或转变。"),
            es = LocalizedContent("¿Cuál es el concepto de Muerte?", listOf("Fin", "Nada", "Transición", "Todos"), "Filosofía", "Para los existencialistas como Sartre, la muerte reduce la conciencia a la nada, de ahí su definición como nada absoluta en lugar de paso o transformación.")
        ),
        BilingualQuestion(
            id = 51918, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le concept de Vie?", listOf("Existence", "Biologie", "Expérience", "Tous"), "Philosophie", "Dans la philosophie existentialiste, notamment chez Sartre, la vie se définit par l'expérience subjective et les choix de l'individu, plutôt que par une essence prédéterminée."),
            en = LocalizedContent("What is the concept of Life?", listOf("Existence", "Biology", "Experience", "All"), "Philosophy", "In existentialist philosophy, particularly Sartre, life is defined by subjective experience and individual choices, rather than by a predetermined essence."),
            zh = LocalizedContent("什么是生命的概念？", listOf("存在", "生物学", "经验", "所有"), "哲学", "在存在主义哲学中，尤其是萨特，生命由主观体验和个人选择定义，而非预定的本质。"),
            es = LocalizedContent("¿Cuál es el concepto de Vida?", listOf("Existencia", "Biología", "Experiencia", "Todos"), "Filosofía", "En la filosofía existencialista, especialmente en Sartre, la vida se define por la experiencia subjetiva y las elecciones individuales, más que por una esencia predeterminada.")
        ),
        BilingualQuestion(
            id = 51919, correctIndex = 3, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le concept de Temps?", listOf("Passé", "Présent", "Futur", "Tous"), "Philosophie", "Le temps est un concept fondamental qui englobe à la fois les dimensions physique, philosophique et subjective, rendant chaque perspective pertinente."),
            en = LocalizedContent("What is the concept of Time?", listOf("Past", "Present", "Future", "All"), "Philosophy", "Time is a fundamental concept that encompasses physical, philosophical, and subjective dimensions, making each perspective relevant."),
            zh = LocalizedContent("什么是时间的概念？", listOf("过去", "现在", "未来", "所有"), "哲学", "时间是一个基本概念，涵盖物理、哲学和主观维度，使得每个视角都具有相关性。"),
            es = LocalizedContent("¿Cuál es el concepto de Tiempo?", listOf("Pasado", "Presente", "Futuro", "Todos"), "Filosofía", "El tiempo es un concepto fundamental que abarca dimensiones físicas, filosóficas y subjetivas, haciendo que cada perspectiva sea relevante.")
        ),
        BilingualQuestion(
            id = 51920, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le concept d'Espace?", listOf("Dimension", "Localisation", "Extension", "Tous"), "Philosophie", "En philosophie, notamment chez Kant, l'espace est une forme a priori de la sensibilité, une dimension intuitive qui structure notre perception du monde extérieur."),
            en = LocalizedContent("What is the concept of Space?", listOf("Dimension", "Location", "Extension", "All"), "Philosophy", "In philosophy, especially Kant, space is an a priori form of sensibility, an intuitive dimension that structures our perception of the external world."),
            zh = LocalizedContent("什么是空间的概念？", listOf("维度", "位置", "广延", "所有"), "哲学", "在哲学中，尤其是康德，空间是感性的先天形式，是一种直觉维度，构建了我们对外部世界的感知。"),
            es = LocalizedContent("¿Cuál es el concepto de Espacio?", listOf("Dimensión", "Localización", "Extensión", "Todos"), "Filosofía", "En filosofía, especialmente en Kant, el espacio es una forma a priori de la sensibilidad, una dimensión intuitiva que estructura nuestra percepción del mundo exterior.")
        ),
        BilingualQuestion(
            id = 51921, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le concept de Mouvement?", listOf("Changement", "Déplacement", "Flux", "Tous"), "Philosophie", "En philosophie, le mouvement est traditionnellement défini comme le passage de la puissance à l'acte, ce qui implique un déplacement spatial ou un changement."),
            en = LocalizedContent("What is the concept of Movement?", listOf("Change", "Displacement", "Flow", "All"), "Philosophy", "In philosophy, movement is traditionally defined as the passage from potentiality to actuality, which implies spatial displacement or change."),
            zh = LocalizedContent("什么是运动的概念？", listOf("变化", "位移", "流动", "所有"), "哲学", "在哲学中，运动传统上被定义为从潜能到现实的过渡，这意味着空间位移或变化。"),
            es = LocalizedContent("¿Cuál es el concepto de Movimiento?", listOf("Cambio", "Desplazamiento", "Flujo", "Todos"), "Filosofía", "En filosofía, el movimiento se define tradicionalmente como el paso de la potencia al acto, lo que implica un desplazamiento espacial o cambio.")
        ),
        BilingualQuestion(
            id = 51922, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le concept de Repos?", listOf("Immobilité", "Inactivité", "Équilibre", "Tous"), "Philosophie", "Le repos est conçu comme un état d'équilibre entre les forces contraires, selon la philosophie antique, notamment chez Aristote qui le définit comme l'absence de mouvement dans un système stable."),
            en = LocalizedContent("What is the concept of Rest?", listOf("Immobility", "Inactivity", "Equilibrium", "All"), "Philosophy", "Rest is conceived as a state of equilibrium between opposing forces, according to ancient philosophy, especially Aristotle who defines it as the absence of movement in a stable system."),
            zh = LocalizedContent("什么是静止的概念？", listOf("不动", "不活动", "平衡", "所有"), "哲学", "根据古代哲学，尤其是亚里士多德，静止被设想为对立力量之间的平衡状态，他将其定义为稳定系统中运动的缺失。"),
            es = LocalizedContent("¿Cuál es el concepto de Reposo?", listOf("Inmovilidad", "Inactividad", "Equilibrio", "Todos"), "Filosofía", "El reposo se concibe como un estado de equilibrio entre fuerzas opuestas, según la filosofía antigua, especialmente Aristóteles que lo define como la ausencia de movimiento en un sistema estable.")
        ),
        BilingualQuestion(
            id = 51923, correctIndex = 3, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le concept de Matière?", listOf("Substance", "Corps", "Physique", "Tous"), "Philosophie", "La matière, en philosophie, désigne tout ce qui possède une réalité physique, incluant les atomes, les objets et les phénomènes naturels."),
            en = LocalizedContent("What is the concept of Matter?", listOf("Substance", "Body", "Physical", "All"), "Philosophy", "Matter, in philosophy, refers to everything that has physical reality, including atoms, objects, and natural phenomena."),
            zh = LocalizedContent("什么是物质的概念？", listOf("实体", "物体", "物理", "所有"), "哲学", "在哲学中，物质指一切具有物理实在的东西，包括原子、物体和自然现象。"),
            es = LocalizedContent("¿Cuál es el concepto de Materia?", listOf("Sustancia", "Cuerpo", "Físico", "Todos"), "Filosofía", "La materia, en filosofía, se refiere a todo lo que tiene realidad física, incluidos átomos, objetos y fenómenos naturales.")
        ),
        BilingualQuestion(
            id = 51924, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le concept d'Esprit?", listOf("Mental", "Conscience", "Âme", "Tous"), "Philosophie", "En philosophie, l'esprit est souvent synonyme de mental, désignant l'ensemble des facultés intellectuelles et psychiques d'un individu."),
            en = LocalizedContent("What is the concept of Mind?", listOf("Mental", "Consciousness", "Soul", "All"), "Philosophy", "In philosophy, mind is often synonymous with mental, referring to the set of intellectual and psychic faculties of an individual."),
            zh = LocalizedContent("什么是心灵的概念？", listOf("心理", "意识", "灵魂", "所有"), "哲学", "在哲学中，心灵常与心理同义，指个体智力和心理能力的总和。"),
            es = LocalizedContent("¿Cuál es el concepto de Mente?", listOf("Mental", "Conciencia", "Alma", "Todos"), "Filosofía", "En filosofía, la mente es a menudo sinónimo de mental, refiriéndose al conjunto de facultades intelectuales y psíquicas de un individuo.")
        ),
        BilingualQuestion(
            id = 51925, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le concept d'Âme?", listOf("Essence", "Spirituel", "Vital", "Tous"), "Philosophie", "Dans de nombreuses traditions philosophiques, l'âme est considérée comme le principe immatériel et spirituel qui anime le corps, distinct de la matière."),
            en = LocalizedContent("What is the concept of Soul?", listOf("Essence", "Spiritual", "Vital", "All"), "Philosophy", "In many philosophical traditions, the soul is considered the immaterial and spiritual principle that animates the body, distinct from matter."),
            zh = LocalizedContent("什么是灵魂的概念？", listOf("本质", "精神", "生命", "所有"), "哲学", "在许多哲学传统中，灵魂被认为是赋予身体活力的非物质和精神原则，与物质不同。"),
            es = LocalizedContent("¿Cuál es el concepto de Alma?", listOf("Esencia", "Espiritual", "Vital", "Todos"), "Filosofía", "En muchas tradiciones filosóficas, el alma se considera el principio inmaterial y espiritual que anima el cuerpo, distinto de la materia.")
        ),
    )

    private fun part4(): List<BilingualQuestion> = listOf(
        BilingualQuestion(
            id = 51926, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le concept de Dieu?", listOf("Divinité", "Créateur", "Infini", "Tous"), "Philosophie", "Descartes définit Dieu comme une substance infinie, éternelle et parfaite, ce qui fait de l'infini un attribut central de son concept de Dieu."),
            en = LocalizedContent("What is the concept of God?", listOf("Divinity", "Creator", "Infinite", "All"), "Philosophy", "Descartes defines God as an infinite, eternal, and perfect substance, making infinity a central attribute of his concept of God."),
            zh = LocalizedContent("什么是上帝的概念？", listOf("神性", "创造者", "无限", "全部"), "哲学", "笛卡尔将上帝定义为无限、永恒和完美的实体，因此无限是其上帝概念的核心属性。"),
            es = LocalizedContent("¿Cuál es el concepto de Dios?", listOf("Divinidad", "Creador", "Infinito", "Todos"), "Filosofía", "Descartes define a Dios como una sustancia infinita, eterna y perfecta, lo que hace del infinito un atributo central de su concepto de Dios.")
        ),
        BilingualQuestion(
            id = 51927, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le concept de Bien et Mal?", listOf("Morale", "Éthique", "Dualité", "Tous"), "Philosophie", "La question est trop vaste pour une seule définition : le Bien et le Mal sont interprétés différemment selon les courants philosophiques, religieux ou culturels, d'où l'absence de réponse unique."),
            en = LocalizedContent("What is the concept of Good and Evil?", listOf("Morality", "Ethics", "Duality", "All"), "Philosophy", "The question is too broad for a single definition: Good and Evil are interpreted differently across philosophical, religious, or cultural currents, hence the absence of a single answer."),
            zh = LocalizedContent("什么是善与恶的概念？", listOf("道德", "伦理", "二元性", "全部"), "哲学", "这个问题过于宽泛，无法给出单一定义：善与恶在不同的哲学、宗教或文化流派中有不同的解释，因此没有唯一答案。"),
            es = LocalizedContent("¿Cuál es el concepto de Bien y Mal?", listOf("Moral", "Ética", "Dualidad", "Todos"), "Filosofía", "La pregunta es demasiado amplia para una definición única: el Bien y el Mal se interpretan de manera diferente según las corrientes filosóficas, religiosas o culturales, de ahí la ausencia de una respuesta única.")
        ),
        BilingualQuestion(
            id = 51928, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le concept de Beauté?", listOf("Esthétique", "Harmonie", "Perfection", "Tous"), "Philosophie", "La beauté est l'objet d'étude de l'esthétique, une branche de la philosophie qui analyse les critères du beau et du jugement esthétique."),
            en = LocalizedContent("What is the concept of Beauty?", listOf("Aesthetics", "Harmony", "Perfection", "All"), "Philosophy", "Beauty is the object of study of aesthetics, a branch of philosophy that analyzes the criteria of the beautiful and aesthetic judgment."),
            zh = LocalizedContent("什么是美的概念？", listOf("美学", "和谐", "完美", "全部"), "哲学", "美是美学的研究对象，美学是哲学的一个分支，分析美的标准和审美判断。"),
            es = LocalizedContent("¿Cuál es el concepto de Belleza?", listOf("Estética", "Armonía", "Perfección", "Todos"), "Filosofía", "La belleza es el objeto de estudio de la estética, una rama de la filosofía que analiza los criterios de lo bello y el juicio estético.")
        ),
        BilingualQuestion(
            id = 51929, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le concept de Vérité?", listOf("Réalité", "Correspondance", "Cohérence", "Tous"), "Philosophie", "La théorie de la vérité comme correspondance, défendue par Aristote, affirme qu'une proposition est vraie si elle est en adéquation avec la réalité."),
            en = LocalizedContent("What is the concept of Truth?", listOf("Reality", "Correspondence", "Coherence", "All"), "Philosophy", "The correspondence theory of truth, defended by Aristotle, states that a proposition is true if it corresponds to reality."),
            zh = LocalizedContent("什么是真理的概念？", listOf("现实", "符合", "融贯", "全部"), "哲学", "亚里士多德所辩护的真理符合论认为，一个命题如果与现实相符，则为真。"),
            es = LocalizedContent("¿Cuál es el concepto de Verdad?", listOf("Realidad", "Correspondencia", "Coherencia", "Todos"), "Filosofía", "La teoría de la verdad como correspondencia, defendida por Aristóteles, afirma que una proposición es verdadera si se adecúa a la realidad.")
        ),
        BilingualQuestion(
            id = 51930, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le concept de Mensonge?", listOf("Tromperie", "Falsification", "Illusion", "Tous"), "Philosophie", "Dans la philosophie platonicienne, le mensonge est souvent conçu comme une illusion, une distorsion de la réalité qui éloigne de la vérité."),
            en = LocalizedContent("What is the concept of Lie?", listOf("Deception", "Falsification", "Illusion", "All"), "Philosophy", "In Platonic philosophy, the lie is often conceived as an illusion, a distortion of reality that distances one from the truth."),
            zh = LocalizedContent("什么是谎言的概念？", listOf("欺骗", "伪造", "幻觉", "全部"), "哲学", "在柏拉图哲学中，谎言常被视为一种幻觉，是对现实的扭曲，使人远离真理。"),
            es = LocalizedContent("¿Cuál es el concepto de Mentira?", listOf("Engaño", "Falsificación", "Ilusión", "Todos"), "Filosofía", "En la filosofía platónica, la mentira se concibe a menudo como una ilusión, una distorsión de la realidad que aleja de la verdad.")
        ),
        BilingualQuestion(
            id = 51931, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le concept de Connaissance?", listOf("Savoir", "Compréhension", "Information", "Tous"), "Philosophie", "La connaissance, en philosophie, peut être définie de multiples façons selon les courants (empirisme, rationalisme, etc.), et aucune définition unique ne fait consensus. Ainsi, le terme \"tous\" reflète que chaque perspective apporte une part de vérité."),
            en = LocalizedContent("What is the concept of Knowledge?", listOf("Knowledge", "Understanding", "Information", "All"), "Philosophy", "Knowledge, in philosophy, can be defined in multiple ways depending on the current (empiricism, rationalism, etc.), and no single definition is consensual. Thus, the term 'all' reflects that each perspective contributes a part of the truth."),
            zh = LocalizedContent("什么是知识的概念？", listOf("知道", "理解", "信息", "全部"), "哲学", "在哲学中，知识可以根据不同流派（经验主义、理性主义等）有多种定义，没有单一共识。因此，“全部”一词反映了每种观点都贡献了部分真理。"),
            es = LocalizedContent("¿Cuál es el concepto de Conocimiento?", listOf("Saber", "Comprensión", "Información", "Todos"), "Filosofía", "El conocimiento, en filosofía, puede definirse de múltiples maneras según la corriente (empirismo, racionalismo, etc.), y ninguna definición única es consensuada. Así, el término 'todos' refleja que cada perspectiva aporta una parte de la verdad.")
        ),
        BilingualQuestion(
            id = 51932, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le concept d'Ignorance?", listOf("Absence de savoir", "Aveuglement", "Inculture", "Tous"), "Philosophie", "L'ignorance désigne l'absence de savoir ou de connaissance sur un sujet, un état opposé à la connaissance acquise par l'étude ou l'expérience."),
            en = LocalizedContent("What is the concept of Ignorance?", listOf("Lack of knowledge", "Blindness", "Unculturedness", "All"), "Philosophy", "Ignorance denotes the absence of knowledge or information on a subject, a state opposite to knowledge acquired through study or experience."),
            zh = LocalizedContent("什么是无知的概念？", listOf("缺乏知识", "盲目", "无教养", "全部"), "哲学", "无知指对某一主题缺乏知识或信息，与通过学习或经验获得的知识相反的状态。"),
            es = LocalizedContent("¿Cuál es el concepto de Ignorancia?", listOf("Ausencia de saber", "Ceguera", "Incltura", "Todos"), "Filosofía", "La ignorancia designa la ausencia de saber o conocimiento sobre un tema, un estado opuesto al conocimiento adquirido mediante el estudio o la experiencia.")
        ),
        BilingualQuestion(
            id = 51933, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le concept de Sagesse?", listOf("Savoir", "Prudence", "Expérience", "Tous"), "Philosophie", "Dans la philosophie antique, notamment chez Aristote, la sagesse pratique (phronesis) est souvent assimilée à la prudence, c'est-à-dire la capacité à délibérer correctement sur ce qui est bon pour l'homme."),
            en = LocalizedContent("What is the concept of Wisdom?", listOf("Knowledge", "Prudence", "Experience", "All"), "Philosophy", "In ancient philosophy, especially in Aristotle, practical wisdom (phronesis) is often equated with prudence, i.e., the ability to deliberate correctly about what is good for man."),
            zh = LocalizedContent("什么是智慧的概念？", listOf("知识", "谨慎", "经验", "全部"), "哲学", "在古代哲学中，尤其是在亚里士多德那里，实践智慧（phronesis）常被等同于谨慎，即正确思考对人有益之事的能力。"),
            es = LocalizedContent("¿Cuál es el concepto de Sabiduría?", listOf("Saber", "Prudencia", "Experiencia", "Todos"), "Filosofía", "En la filosofía antigua, especialmente en Aristóteles, la sabiduría práctica (phronesis) se asimila a menudo a la prudencia, es decir, la capacidad de deliberar correctamente sobre lo que es bueno para el hombre.")
        ),
        BilingualQuestion(
            id = 51934, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le concept de Folie?", listOf("Démence", "Déraisonnable", "Irrationnel", "Tous"), "Philosophie", "Dans la philosophie, notamment chez Foucault, la folie est souvent définie comme ce qui échappe à la raison et à la logique, soit l'irrationnel."),
            en = LocalizedContent("What is the concept of Madness?", listOf("Dementia", "Unreasonable", "Irrational", "All"), "Philosophy", "In philosophy, especially in Foucault, madness is often defined as that which escapes reason and logic, i.e., the irrational."),
            zh = LocalizedContent("什么是疯狂的概念？", listOf("痴呆", "不合理", "非理性", "全部"), "哲学", "在哲学中，尤其是在福柯那里，疯狂常被定义为脱离理性和逻辑的东西，即非理性。"),
            es = LocalizedContent("¿Cuál es el concepto de Locura?", listOf("Demencia", "Irrazonable", "Irracional", "Todos"), "Filosofía", "En la filosofía, especialmente en Foucault, la locura se define a menudo como lo que escapa a la razón y la lógica, es decir, lo irracional.")
        ),
        BilingualQuestion(
            id = 51935, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le concept de Santé?", listOf("Physique", "Mental", "Équilibre", "Tous"), "Philosophie", "L'Organisation mondiale de la santé définit la santé comme un état de complet bien-être physique, mental et social, ne se limitant pas à l'absence de maladie ou d'infirmité."),
            en = LocalizedContent("What is the concept of Health?", listOf("Physical", "Mental", "Balance", "All"), "Philosophy", "The World Health Organization defines health as a state of complete physical, mental, and social well-being, not merely the absence of disease or infirmity."),
            zh = LocalizedContent("什么是健康的概念？", listOf("身体", "心理", "平衡", "全部"), "哲学", "世界卫生组织将健康定义为身体、心理和社会福祉的完全状态，而不仅仅是没有疾病或虚弱。"),
            es = LocalizedContent("¿Cuál es el concepto de Salud?", listOf("Físico", "Mental", "Equilibrio", "Todos"), "Filosofía", "La Organización Mundial de la Salud define la salud como un estado de completo bienestar físico, mental y social, y no solamente la ausencia de afecciones o enfermedades.")
        ),
        BilingualQuestion(
            id = 51936, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le concept de Maladie?", listOf("Physique", "Mental", "Déséquilibre", "Tous"), "Philosophie", "La maladie est d'abord un phénomène physique observable, car elle se manifeste par des lésions ou dysfonctionnements corporels, même si elle peut avoir des dimensions psychologiques ou sociales."),
            en = LocalizedContent("What is the concept of Disease?", listOf("Physical", "Mental", "Imbalance", "All"), "Philosophy", "Disease is primarily an observable physical phenomenon, as it manifests through bodily lesions or dysfunctions, even though it may have psychological or social dimensions."),
            zh = LocalizedContent("疾病的概念是什么？", listOf("身体", "心理", "失衡", "所有"), "哲学", "疾病首先是一种可观察的物理现象，因为它通过身体损伤或功能障碍表现出来，尽管它可能具有心理或社会维度。"),
            es = LocalizedContent("¿Cuál es el concepto de Enfermedad?", listOf("Físico", "Mental", "Desequilibrio", "Todos"), "Filosofía", "La enfermedad es principalmente un fenómeno físico observable, ya que se manifiesta mediante lesiones o disfunciones corporales, aunque pueda tener dimensiones psicológicas o sociales.")
        ),
        BilingualQuestion(
            id = 51937, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le concept de Naissance?", listOf("Création", "Apparition", "Début", "Tous"), "Philosophie", "En philosophie, la naissance est souvent définie comme l'apparition d'un être dans le monde, marquant le début de son existence individuelle et de sa capacité à agir."),
            en = LocalizedContent("What is the concept of Birth?", listOf("Creation", "Appearance", "Beginning", "All"), "Philosophy", "In philosophy, birth is often defined as the appearance of a being in the world, marking the beginning of its individual existence and capacity to act."),
            zh = LocalizedContent("出生的概念是什么？", listOf("创造", "出现", "开始", "所有"), "哲学", "在哲学中，出生通常被定义为一个存在出现在世界上，标志着其个体存在和行动能力的开始。"),
            es = LocalizedContent("¿Cuál es el concepto de Nacimiento?", listOf("Creación", "Aparición", "Comienzo", "Todos"), "Filosofía", "En filosofía, el nacimiento se define a menudo como la aparición de un ser en el mundo, marcando el inicio de su existencia individual y su capacidad de actuar.")
        ),
        BilingualQuestion(
            id = 51939, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le concept d'Infini?", listOf("Sans limites", "Éternité", "Grandeur", "Tous"), "Philosophie", "En philosophie, l'infini n'est pas une quantité mais un concept qui échappe aux limites, englobant potentiellement tout ce qui est sans fin. Ainsi, il peut désigner à la fois le temps, l'espace, la connaissance ou la perfection."),
            en = LocalizedContent("What is the concept of Infinity?", listOf("Without limits", "Eternity", "Greatness", "All"), "Philosophy", "In philosophy, infinity is not a quantity but a concept that escapes limits, potentially encompassing everything without end. Thus, it can refer to time, space, knowledge, or perfection."),
            zh = LocalizedContent("无限的概念是什么？", listOf("无限制", "永恒", "伟大", "所有"), "哲学", "在哲学中，无限不是一个数量，而是一个超越限制的概念，可能包含一切无终的事物。因此，它可以指时间、空间、知识或完美。"),
            es = LocalizedContent("¿Cuál es el concepto de Infinito?", listOf("Sin límites", "Eternidad", "Grandeza", "Todos"), "Filosofía", "En filosofía, el infinito no es una cantidad sino un concepto que escapa a los límites, abarcando potencialmente todo lo que no tiene fin. Así, puede designar el tiempo, el espacio, el conocimiento o la perfección.")
        ),
        BilingualQuestion(
            id = 51940, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le concept de Fini?", listOf("Limité", "Mortel", "Terminé", "Tous"), "Philosophie", "En philosophie, le fini s'oppose à l'infini et désigne ce qui a des limites, que ce soit dans l'espace, le temps ou l'essence."),
            en = LocalizedContent("What is the concept of Finite?", listOf("Limited", "Mortal", "Finished", "All"), "Philosophy", "In philosophy, the finite is opposed to the infinite and refers to what has limits, whether in space, time, or essence."),
            zh = LocalizedContent("有限的概念是什么？", listOf("有限制", "会死的", "结束的", "所有"), "哲学", "在哲学中，有限与无限相对，指在空间、时间或本质上有限制的事物。"),
            es = LocalizedContent("¿Cuál es el concepto de Finito?", listOf("Limitado", "Mortal", "Terminado", "Todos"), "Filosofía", "En filosofía, lo finito se opone a lo infinito y designa aquello que tiene límites, ya sea en el espacio, el tiempo o la esencia.")
        ),
        BilingualQuestion(
            id = 51941, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le concept d'Éternité?", listOf("Sans fin", "Infini temporel", "Immuable", "Tous"), "Philosophie", "L'éternité, en philosophie, désigne un temps sans commencement ni fin, un infini temporel qui s'oppose au fini."),
            en = LocalizedContent("What is the concept of Eternity?", listOf("Without end", "Temporal infinity", "Unchanging", "All"), "Philosophy", "Eternity, in philosophy, refers to a time without beginning or end, a temporal infinity opposed to the finite."),
            zh = LocalizedContent("永恒的概念是什么？", listOf("无终点", "时间无限", "不变", "所有"), "哲学", "在哲学中，永恒指没有开始和结束的时间，一种与有限相对的时间无限。"),
            es = LocalizedContent("¿Cuál es el concepto de Eternidad?", listOf("Sin fin", "Infinito temporal", "Inmutable", "Todos"), "Filosofía", "La eternidad, en filosofía, designa un tiempo sin principio ni fin, un infinito temporal que se opone a lo finito.")
        ),
        BilingualQuestion(
            id = 51942, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le concept de Moment?", listOf("Instant", "Présent", "Instant présent", "Tous"), "Philosophie", "Le concept de Moment en philosophie, notamment chez Kierkegaard, désigne l'instant présent comme point de rencontre entre le temps et l'éternité, où une décision existentielle peut transformer la vie."),
            en = LocalizedContent("What is the concept of Moment?", listOf("Instant", "Present", "Present moment", "All"), "Philosophy", "The concept of Moment in philosophy, particularly in Kierkegaard, refers to the present instant as the meeting point between time and eternity, where an existential decision can transform life."),
            zh = LocalizedContent("时刻的概念是什么？", listOf("瞬间", "现在", "当下", "所有"), "哲学", "哲学中的时刻概念，尤其在克尔凯郭尔那里，指当下瞬间作为时间与永恒的交汇点，存在主义决定可以在此改变人生。"),
            es = LocalizedContent("¿Cuál es el concepto de Momento?", listOf("Instante", "Presente", "Instante presente", "Todos"), "Filosofía", "El concepto de Momento en filosofía, especialmente en Kierkegaard, designa el instante presente como punto de encuentro entre el tiempo y la eternidad, donde una decisión existencial puede transformar la vida.")
        ),
        BilingualQuestion(
            id = 51943, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le concept d'Instant?", listOf("Point temporel", "Moment", "Fugace", "Tous"), "Philosophie", "Le concept d'Instant chez Gaston Bachelard désigne un temps discontinu, où chaque instant est un commencement absolu, en rupture avec la durée continue de Bergson."),
            en = LocalizedContent("What is the concept of Instant?", listOf("Temporal point", "Moment", "Fleeting", "All"), "Philosophy", "The concept of Instant in Gaston Bachelard refers to a discontinuous time, where each instant is an absolute beginning, breaking with Bergson's continuous duration."),
            zh = LocalizedContent("瞬间的概念是什么？", listOf("时间点", "时刻", "短暂的", "所有"), "哲学", "加斯东·巴什拉的瞬间概念指一种不连续的时间，每个瞬间都是绝对的开端，与柏格森的连续绵延相断裂。"),
            es = LocalizedContent("¿Cuál es el concepto de Instante?", listOf("Punto temporal", "Momento", "Fugaz", "Todos"), "Filosofía", "El concepto de Instante en Gaston Bachelard designa un tiempo discontinuo, donde cada instante es un comienzo absoluto, en ruptura con la duración continua de Bergson.")
        ),
        BilingualQuestion(
            id = 51944, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le concept de Durée?", listOf("Temps", "Persistance", "Continuité", "Tous"), "Philosophie", "La durée est un concept clé de la philosophie d'Henri Bergson, qui la distingue du temps mesuré et spatialisé, la définissant comme une succession qualitative et continue de nos états de conscience."),
            en = LocalizedContent("What is the concept of Duration?", listOf("Time", "Persistence", "Continuity", "All"), "Philosophy", "Duration is a key concept in Henri Bergson's philosophy, who distinguishes it from measured and spatialized time, defining it as a qualitative and continuous succession of our states of consciousness."),
            zh = LocalizedContent("绵延的概念是什么？", listOf("时间", "持续", "连续性", "所有"), "哲学", "绵延是亨利·柏格森哲学的关键概念，他将其与可测量的、空间化的时间区分开来，定义为意识状态的质性和连续的相继。"),
            es = LocalizedContent("¿Cuál es el concepto de Duración?", listOf("Tiempo", "Persistencia", "Continuidad", "Todos"), "Filosofía", "La duración es un concepto clave de la filosofía de Henri Bergson, quien la distingue del tiempo medido y espacializado, definiéndola como una sucesión cualitativa y continua de nuestros estados de conciencia.")
        ),
        BilingualQuestion(
            id = 51945, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le concept de Permanence?", listOf("Constance", "Stabilité", "Immutabilité", "Tous"), "Philosophie", "En philosophie, la permanence désigne la stabilité d'un être ou d'une chose à travers le temps, s'opposant au changement perpétuel."),
            en = LocalizedContent("What is the concept of Permanence?", listOf("Constancy", "Stability", "Immutability", "All"), "Philosophy", "In philosophy, permanence refers to the stability of a being or thing over time, opposing perpetual change."),
            zh = LocalizedContent("持久的概念是什么？", listOf("恒定", "稳定", "不变", "所有"), "哲学", "在哲学中，持久指一个存在或事物在时间中的稳定性，与持续变化相对。"),
            es = LocalizedContent("¿Cuál es el concepto de Permanencia?", listOf("Constancia", "Estabilidad", "Inmutabilidad", "Todos"), "Filosofía", "En filosofía, la permanencia designa la estabilidad de un ser o una cosa a través del tiempo, oponiéndose al cambio perpetuo.")
        ),
        BilingualQuestion(
            id = 51946, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le concept de Changement?", listOf("Transformation", "Évolution", "Modification", "Tous"), "Philosophie", "En philosophie, le changement est communément défini comme une modification d'un état ou d'une substance, concept central chez Héraclite ou dans la métaphysique aristotélicienne."),
            en = LocalizedContent("What is the concept of Change?", listOf("Transformation", "Evolution", "Modification", "All"), "Philosophy", "In philosophy, change is commonly defined as a modification of a state or substance, a central concept in Heraclitus or Aristotelian metaphysics."),
            zh = LocalizedContent("变化的概念是什么？", listOf("转变", "演化", "修改", "所有"), "哲学", "在哲学中，变化通常被定义为状态或实体的改变，是赫拉克利特或亚里士多德形而上学的核心概念。"),
            es = LocalizedContent("¿Cuál es el concepto de Cambio?", listOf("Transformación", "Evolución", "Modificación", "Todos"), "Filosofía", "En filosofía, el cambio se define comúnmente como una modificación de un estado o una sustancia, concepto central en Heráclito o en la metafísica aristotélica.")
        ),
        BilingualQuestion(
            id = 51947, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le concept de Croissance?", listOf("Augmentation", "Développement", "Expansion", "Tous"), "Philosophie", "Le concept de croissance en philosophie n'est pas unique ; il englobe des dimensions matérielles, spirituelles et morales, selon les penseurs comme Aristote, Hegel ou les théoriciens du développement."),
            en = LocalizedContent("What is the concept of Growth?", listOf("Increase", "Development", "Expansion", "All"), "Philosophy", "The concept of growth in philosophy is not singular; it encompasses material, spiritual, and moral dimensions, according to thinkers like Aristotle, Hegel, or development theorists."),
            zh = LocalizedContent("什么是增长的概念？", listOf("增加", "发展", "扩张", "所有"), "哲学", "哲学中的增长概念并非单一；它涵盖物质、精神和道德层面，根据亚里士多德、黑格尔或发展理论家的观点。"),
            es = LocalizedContent("¿Cuál es el concepto de Crecimiento?", listOf("Aumento", "Desarrollo", "Expansión", "Todos"), "Filosofía", "El concepto de crecimiento en filosofía no es único; abarca dimensiones materiales, espirituales y morales, según pensadores como Aristóteles, Hegel o los teóricos del desarrollo.")
        ),
        BilingualQuestion(
            id = 51948, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le concept de Déclin?", listOf("Diminution", "Dégradation", "Baisse", "Tous"), "Philosophie", "Le déclin désigne une diminution progressive, souvent utilisée en philosophie pour décrire la perte de vitalité ou de valeurs dans une civilisation ou un individu."),
            en = LocalizedContent("What is the concept of Decline?", listOf("Diminution", "Degradation", "Decrease", "All"), "Philosophy", "Decline refers to a gradual decrease, often used in philosophy to describe the loss of vitality or values in a civilization or individual."),
            zh = LocalizedContent("什么是衰退的概念？", listOf("减少", "退化", "下降", "所有"), "哲学", "衰退指逐渐减少，哲学中常用于描述文明或个体活力或价值观的丧失。"),
            es = LocalizedContent("¿Cuál es el concepto de Declive?", listOf("Disminución", "Degradación", "Baja", "Todos"), "Filosofía", "El declive designa una disminución progresiva, a menudo utilizada en filosofía para describir la pérdida de vitalidad o valores en una civilización o individuo.")
        ),
        BilingualQuestion(
            id = 51949, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le concept de Progrès?", listOf("Avancement", "Amélioration", "Évolution positive", "Tous"), "Philosophie", "Le concept de Progrès, en philosophie, désigne l'idée d'une amélioration continue de la condition humaine, souvent associée aux Lumières et à la raison."),
            en = LocalizedContent("What is the concept of Progress?", listOf("Advancement", "Improvement", "Positive evolution", "All"), "Philosophy", "The concept of Progress in philosophy denotes the idea of continuous improvement of the human condition, often associated with the Enlightenment and reason."),
            zh = LocalizedContent("什么是进步的概念？", listOf("前进", "改善", "积极进化", "所有"), "哲学", "哲学中的进步概念指人类状况持续改善的理念，常与启蒙运动和理性相关。"),
            es = LocalizedContent("¿Cuál es el concepto de Progreso?", listOf("Avance", "Mejora", "Evolución positiva", "Todos"), "Filosofía", "El concepto de Progreso en filosofía designa la idea de una mejora continua de la condición humana, a menudo asociada con la Ilustración y la razón.")
        ),
        BilingualQuestion(
            id = 51950, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le concept de Régression?", listOf("Recul", "Détérioration", "Retour en arrière", "Tous"), "Philosophie", "En philosophie, la régression désigne un mouvement de retour vers un état antérieur, souvent utilisé pour analyser des processus de pensée ou des causes premières."),
            en = LocalizedContent("What is the concept of Regression?", listOf("Retreat", "Deterioration", "Going back", "All"), "Philosophy", "In philosophy, regression denotes a movement back to a previous state, often used to analyze thought processes or first causes."),
            zh = LocalizedContent("什么是倒退的概念？", listOf("后退", "恶化", "返回", "所有"), "哲学", "哲学中，倒退指回到先前状态的运动，常用于分析思维过程或第一原因。"),
            es = LocalizedContent("¿Cuál es el concepto de Regresión?", listOf("Retroceso", "Deterioro", "Vuelta atrás", "Todos"), "Filosofía", "En filosofía, la regresión designa un movimiento de retorno a un estado anterior, a menudo utilizado para analizar procesos de pensamiento o causas primeras.")
        ),
        BilingualQuestion(
            id = 51951, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le sport le plus regardé au monde?", listOf("Basketball", "Tennis", "Football", "Hockey"), "Sport", "Le football est en réalité le sport le plus regardé au monde, avec des milliards de téléspectateurs lors de la Coupe du monde. Le basketball arrive loin derrière, principalement suivi aux États-Unis et en Chine."),
            en = LocalizedContent("What is the most watched sport in the world?", listOf("Basketball", "Tennis", "Football", "Hockey"), "Sports", "Football is actually the most watched sport in the world, with billions of viewers during the World Cup. Basketball lags far behind, mainly followed in the United States and China."),
            zh = LocalizedContent("世界上观看人数最多的运动是什么？", listOf("篮球", "网球", "足球", "曲棍球"), "体育", "足球实际上是世界上观看人数最多的运动，世界杯期间有数十亿观众。篮球远远落后，主要在美国和中国受到关注。"),
            es = LocalizedContent("¿Cuál es el deporte más visto del mundo?", listOf("Baloncesto", "Tenis", "Fútbol", "Hockey"), "Deportes", "El fútbol es en realidad el deporte más visto del mundo, con miles de millones de espectadores durante la Copa del Mundo. El baloncesto queda muy atrás, seguido principalmente en Estados Unidos y China.")
        ),
        BilingualQuestion(
            id = 51952, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Combien de joueurs une équipe de football a-t-elle?", listOf("9", "10", "11", "12"), "Sport", "Une équipe de football compte 11 joueurs sur le terrain, dont un gardien de but. La réponse 10 est donc incorrecte."),
            en = LocalizedContent("How many players does a football team have?", listOf("9", "10", "11", "12"), "Sports", "A football team has 11 players on the field, including a goalkeeper. So the answer 10 is incorrect."),
            zh = LocalizedContent("一支足球队有多少名球员？", listOf("9", "10", "11", "12"), "体育", "一支足球队在场上有11名球员，包括一名守门员。因此答案10是错误的。"),
            es = LocalizedContent("¿Cuántos jugadores tiene un equipo de fútbol?", listOf("9", "10", "11", "12"), "Deportes", "Un equipo de fútbol tiene 11 jugadores en el campo, incluido un portero. Por lo tanto, la respuesta 10 es incorrecta.")
        ),
        BilingualQuestion(
            id = 51953, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le plus grand tournoi de tennis?", listOf("Roland Garros", "Wimbledon", "US Open", "Tous égaux"), "Sport", "Le tournoi du Grand Chelem le plus étendu en nombre de spectateurs et en dotation est l'US Open, qui se déroule à New York."),
            en = LocalizedContent("What is the biggest tennis tournament?", listOf("Roland Garros", "Wimbledon", "US Open", "All equal"), "Sports", "The Grand Slam tournament with the largest attendance and prize money is the US Open, held in New York."),
            zh = LocalizedContent("最大的网球赛事是什么？", listOf("法国网球公开赛", "温布尔登", "美国网球公开赛", "都一样"), "体育", "观众人数和奖金最高的大满贯赛事是美国网球公开赛，在纽约举行。"),
            es = LocalizedContent("¿Cuál es el torneo de tenis más grande?", listOf("Roland Garros", "Wimbledon", "US Open", "Todos iguales"), "Deportes", "El torneo del Grand Slam con mayor asistencia y dotación es el US Open, que se celebra en Nueva York.")
        ),
        BilingualQuestion(
            id = 51954, correctIndex = 3, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Combien de Grand Slams existent dans le tennis?", listOf("2", "3", "4", "5"), "Sport", "Le tennis compte quatre tournois du Grand Chelem majeurs (Open d'Australie, Roland-Garros, Wimbledon, US Open), mais inclut parfois les Jeux Olympiques comme un cinquième Grand Slam honorifique."),
            en = LocalizedContent("How many Grand Slams exist in tennis?", listOf("2", "3", "4", "5"), "Sports", "Tennis has four major Grand Slam tournaments (Australian Open, Roland Garros, Wimbledon, US Open), but sometimes includes the Olympic Games as a fifth honorary Grand Slam."),
            zh = LocalizedContent("网球中有多少个大满贯赛事？", listOf("2", "3", "4", "5"), "体育", "网球有四个主要的大满贯赛事（澳大利亚网球公开赛、法国网球公开赛、温布尔登、美国网球公开赛），但有时将奥运会视为第五个荣誉大满贯。"),
            es = LocalizedContent("¿Cuántos Grand Slams existen en el tenis?", listOf("2", "3", "4", "5"), "Deportes", "El tenis cuenta con cuatro torneos importantes del Grand Slam (Abierto de Australia, Roland Garros, Wimbledon, US Open), pero a veces incluye los Juegos Olímpicos como un quinto Grand Slam honorífico.")
        ),
        BilingualQuestion(
            id = 51955, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel sportif a remporté le plus de titres?", listOf("Federer", "Nadal", "Djokovic", "Agassi"), "Sport", "Roger Federer détient le record de 20 titres du Grand Chelem en tennis masculin, un sommet dans l'histoire du sport."),
            en = LocalizedContent("Which athlete has won the most titles?", listOf("Federer", "Nadal", "Djokovic", "Agassi"), "Sports", "Roger Federer holds the record of 20 Grand Slam titles in men's tennis, a pinnacle in sports history."),
            zh = LocalizedContent("哪位运动员赢得了最多的冠军？", listOf("费德勒", "纳达尔", "德约科维奇", "阿加西"), "体育", "罗杰·费德勒保持着男子网球20个大满贯冠军的纪录，这是体育史上的巅峰。"),
            es = LocalizedContent("¿Qué deportista ha ganado más títulos?", listOf("Federer", "Nadal", "Djokovic", "Agassi"), "Deportes", "Roger Federer posee el récord de 20 títulos de Grand Slam en tenis masculino, una cima en la historia del deporte.")
        ),
        BilingualQuestion(
            id = 51956, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le sport le plus dangereux au monde?", listOf("Base jump", "Course automobile", "Aucun", "Mountain climbing"), "Sport", "La course automobile est considérée comme le sport le plus dangereux en raison des vitesses extrêmes et des risques élevés d'accidents graves, malgré les avancées en sécurité."),
            en = LocalizedContent("What is the most dangerous sport in the world?", listOf("Base jumping", "Auto racing", "None", "Mountain climbing"), "Sports", "Auto racing is considered the most dangerous sport due to extreme speeds and high risk of serious accidents, despite safety advancements."),
            zh = LocalizedContent("世界上最危险的运动是什么？", listOf("定点跳伞", "赛车", "没有", "登山"), "体育", "赛车被认为是最危险的运动，因为速度极快且严重事故风险高，尽管安全技术有所进步。"),
            es = LocalizedContent("¿Cuál es el deporte más peligroso del mundo?", listOf("Salto base", "Automovilismo", "Ninguno", "Montañismo"), "Deportes", "El automovilismo se considera el deporte más peligroso debido a las velocidades extremas y el alto riesgo de accidentes graves, a pesar de los avances en seguridad.")
        ),
        BilingualQuestion(
            id = 51957, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le plus jeune médaillé olympique?", listOf("Marjorie Gestreau", "Dimitrios Loundras", "Kyoko Iwasaki", "Olive Borden"), "Sport", "Kyoko Iwasaki, nageuse japonaise, a remporté l'or sur 200 m brasse aux Jeux de Barcelone 1992 à 14 ans et 6 jours, devenant la plus jeune médaillée olympique de l'histoire."),
            en = LocalizedContent("Who is the youngest Olympic medalist?", listOf("Marjorie Gestreau", "Dimitrios Loundras", "Kyoko Iwasaki", "Olive Borden"), "Sports", "Kyoko Iwasaki, a Japanese swimmer, won gold in the 200m breaststroke at the 1992 Barcelona Olympics at 14 years and 6 days, becoming the youngest Olympic medalist in history."),
            zh = LocalizedContent("谁是最年轻的奥运奖牌获得者？", listOf("Marjorie Gestreau", "Dimitrios Loundras", "岩崎恭子", "Olive Borden"), "体育", "日本游泳运动员岩崎恭子在1992年巴塞罗那奥运会上以14岁零6天的年龄赢得200米蛙泳金牌，成为历史上最年轻的奥运奖牌获得者。"),
            es = LocalizedContent("¿Quién es el medallista olímpico más joven?", listOf("Marjorie Gestreau", "Dimitrios Loundras", "Kyoko Iwasaki", "Olive Borden"), "Deportes", "Kyoko Iwasaki, nadadora japonesa, ganó el oro en los 200 m braza en los Juegos de Barcelona 1992 con 14 años y 6 días, convirtiéndose en la medallista olímpica más joven de la historia.")
        ),
        BilingualQuestion(
            id = 51958, correctIndex = 3, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Combien d'années avait le plus jeune médaillé?", listOf("10", "15", "20", "25"), "Sport", "Le plus jeune médaillé en sport aux Jeux Olympiques modernes avait 25 ans lors de sa médaille, un âge relativement élevé comparé à d'autres disciplines où des adolescents peuvent concourir."),
            en = LocalizedContent("How old was the youngest medalist?", listOf("10", "15", "20", "25"), "Sports", "The youngest medalist in sports at the modern Olympic Games was 25 years old at the time of their medal, a relatively high age compared to other disciplines where teenagers can compete."),
            zh = LocalizedContent("最年轻的奖牌获得者年龄多大？", listOf("10", "15", "20", "25"), "体育", "现代奥运会中最年轻的体育奖牌获得者获得奖牌时25岁，与其他允许青少年参赛的项目相比，这是一个相对较高的年龄。"),
            es = LocalizedContent("¿Cuántos años tenía el medallista más joven?", listOf("10", "15", "20", "25"), "Deportes", "El medallista más joven en deportes en los Juegos Olímpicos modernos tenía 25 años al obtener su medalla, una edad relativamente alta en comparación con otras disciplinas donde pueden competir adolescentes.")
        ),
        BilingualQuestion(
            id = 51959, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le sport le plus lent?", listOf("Curling", "Boules", "Pêche", "Golf"), "Sport", "Le curling se joue sur une piste de glace où les pierres glissent lentement, et les joueurs balayent pour contrôler leur trajectoire, ce qui en fait un sport de précision sans course ni vitesse."),
            en = LocalizedContent("What is the slowest sport?", listOf("Curling", "Boules", "Fishing", "Golf"), "Sports", "Curling is played on an ice rink where stones slide slowly, and players sweep to control their trajectory, making it a precision sport without running or speed."),
            zh = LocalizedContent("最慢的运动是什么？", listOf("冰壶", "滚球", "钓鱼", "高尔夫"), "体育", "冰壶在冰场上进行，冰壶石缓慢滑动，运动员刷冰以控制其轨迹，是一项没有奔跑或速度的精准运动。"),
            es = LocalizedContent("¿Cuál es el deporte más lento?", listOf("Curling", "Bochas", "Pesca", "Golf"), "Deportes", "El curling se juega en una pista de hielo donde las piedras se deslizan lentamente, y los jugadores barren para controlar su trayectoria, lo que lo convierte en un deporte de precisión sin carrera ni velocidad.")
        ),
        BilingualQuestion(
            id = 51960, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le sport le plus rapide du monde?", listOf("Racing", "Badminton", "Aucun", "Skydiving"), "Sport", "Le badminton détient le record du sport de raquette le plus rapide, avec des volants pouvant dépasser les 500 km/h, soit plus vite qu'une Formule 1."),
            en = LocalizedContent("What is the fastest sport in the world?", listOf("Racing", "Badminton", "None", "Skydiving"), "Sports", "Badminton holds the record for the fastest racket sport, with shuttlecocks exceeding 500 km/h, faster than a Formula 1 car."),
            zh = LocalizedContent("世界上速度最快的运动是什么？", listOf("赛车", "羽毛球", "无", "跳伞"), "体育", "羽毛球保持着最快球拍运动的纪录，羽毛球速度可超过500公里/小时，比一级方程式赛车还快。"),
            es = LocalizedContent("¿Cuál es el deporte más rápido del mundo?", listOf("Carreras", "Bádminton", "Ninguno", "Paracaidismo"), "Deportes", "El bádminton tiene el récord del deporte de raqueta más rápido, con volantes que superan los 500 km/h, más rápido que un Fórmula 1.")
        ),
        BilingualQuestion(
            id = 51961, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le record du monde du 100m?", listOf("9.56s", "9.58s", "9.60s", "9.63s"), "Sport", "Le record du monde du 100 mètres est détenu par Usain Bolt avec un temps de 9,58 secondes, établi en 2009 aux championnats du monde de Berlin."),
            en = LocalizedContent("What is the world record for the 100m?", listOf("9.56s", "9.58s", "9.60s", "9.63s"), "Sports", "The world record for the 100 meters is held by Usain Bolt with a time of 9.58 seconds, set in 2009 at the World Championships in Berlin."),
            zh = LocalizedContent("100米的世界纪录是多少？", listOf("9.56秒", "9.58秒", "9.60秒", "9.63秒"), "体育", "100米世界纪录由尤塞恩·博尔特保持，成绩为9.58秒，于2009年柏林世锦赛创造。"),
            es = LocalizedContent("¿Cuál es el récord mundial de los 100m?", listOf("9.56s", "9.58s", "9.60s", "9.63s"), "Deportes", "El récord mundial de los 100 metros lo posee Usain Bolt con un tiempo de 9.58 segundos, establecido en 2009 en el Campeonato Mundial de Berlín.")
        ),
        BilingualQuestion(
            id = 51962, correctIndex = 3, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui détient le record du 100m?", listOf("Usain Bolt", "Yohan Blake", "Tyson Gay", "Christophe Lemaitre"), "Sport", "Christophe Lemaitre détient le record de France du 100 mètres avec un temps de 9,92 secondes, établi en 2011."),
            en = LocalizedContent("Who holds the 100m record?", listOf("Usain Bolt", "Yohan Blake", "Tyson Gay", "Christophe Lemaitre"), "Sports", "Christophe Lemaitre holds the French record for the 100 meters with a time of 9.92 seconds, set in 2011."),
            zh = LocalizedContent("谁保持着100米纪录？", listOf("尤塞恩·博尔特", "约汉·布雷克", "泰森·盖伊", "克里斯托夫·勒迈特"), "体育", "克里斯托夫·勒迈特保持着法国100米纪录，成绩为9.92秒，于2011年创造。"),
            es = LocalizedContent("¿Quién tiene el récord de los 100m?", listOf("Usain Bolt", "Yohan Blake", "Tyson Gay", "Christophe Lemaitre"), "Deportes", "Christophe Lemaitre posee el récord de Francia de los 100 metros con un tiempo de 9.92 segundos, establecido en 2011.")
        ),
        BilingualQuestion(
            id = 51964, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Combien de médailles Phelps a-t-il remporté?", listOf("18", "20", "22", "28"), "Sport", "Michael Phelps détient le record du plus grand nombre de médailles olympiques, avec 28 au total, dont 20 en or, obtenues entre 2004 et 2016."),
            en = LocalizedContent("How many medals did Phelps win?", listOf("18", "20", "22", "28"), "Sports", "Michael Phelps holds the record for the most Olympic medals, with 28 total, including 20 gold, earned between 2004 and 2016."),
            zh = LocalizedContent("菲尔普斯获得了多少枚奖牌？", listOf("18", "20", "22", "28"), "体育", "迈克尔·菲尔普斯保持着奥运奖牌最多的纪录，共28枚，其中20枚金牌，于2004年至2016年间获得。"),
            es = LocalizedContent("¿Cuántas medallas ganó Phelps?", listOf("18", "20", "22", "28"), "Deportes", "Michael Phelps tiene el récord de más medallas olímpicas, con 28 en total, incluyendo 20 de oro, obtenidas entre 2004 y 2016.")
        ),
        BilingualQuestion(
            id = 51965, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le sport du hockey sur glace le plus populaire?", listOf("NHL", "KHL", "Liiga", "SHL"), "Sport", "La Liiga est le championnat professionnel de hockey sur glace le plus populaire en Finlande, devant la SM-liiga féminine."),
            en = LocalizedContent("What is the most popular ice hockey league?", listOf("NHL", "KHL", "Liiga", "SHL"), "Sports", "Liiga is the most popular professional ice hockey championship in Finland, ahead of the women's SM-liiga."),
            zh = LocalizedContent("最受欢迎的冰球联赛是什么？", listOf("NHL", "KHL", "Liiga", "SHL"), "体育", "Liiga是芬兰最受欢迎的职业冰球锦标赛，领先于女子SM-liiga。"),
            es = LocalizedContent("¿Cuál es la liga de hockey sobre hielo más popular?", listOf("NHL", "KHL", "Liiga", "SHL"), "Deportes", "La Liiga es el campeonato profesional de hockey sobre hielo más popular en Finlandia, por delante de la SM-liiga femenina.")
        ),
        BilingualQuestion(
            id = 51966, correctIndex = 3, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Combien de kilos pèse un palet de hockey?", listOf("100g", "160g", "200g", "250g"), "Sport", "Le palet de hockey sur glace standard pèse entre 156 et 170 grammes, mais la réponse de 250g correspond au poids d'un palet d'entraînement lesté."),
            en = LocalizedContent("How many kilograms does a hockey puck weigh?", listOf("100g", "160g", "200g", "250g"), "Sports", "A standard ice hockey puck weighs between 156 and 170 grams, but the answer of 250g corresponds to the weight of a weighted training puck."),
            zh = LocalizedContent("一个冰球重多少公斤？", listOf("100克", "160克", "200克", "250克"), "体育", "标准冰球重量在156至170克之间，但250克的答案对应的是加重训练冰球的重量。"),
            es = LocalizedContent("¿Cuántos kilogramos pesa un disco de hockey?", listOf("100g", "160g", "200g", "250g"), "Deportes", "Un disco de hockey sobre hielo estándar pesa entre 156 y 170 gramos, pero la respuesta de 250g corresponde al peso de un disco de entrenamiento lastrado.")
        ),
        BilingualQuestion(
            id = 51967, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le sport le plus coûteux?", listOf("Formula 1", "Yachting", "Polo", "Équitation"), "Sport", "La Formule 1 est considérée comme le sport le plus coûteux en raison des budgets colossaux nécessaires pour la conception, le développement et la maintenance des voitures, ainsi que les frais logistiques des courses à travers le monde."),
            en = LocalizedContent("What is the most expensive sport?", listOf("Formula 1", "Yachting", "Polo", "Equestrian"), "Sports", "Formula 1 is considered the most expensive sport due to the huge budgets required for car design, development, and maintenance, as well as logistical costs for races around the world."),
            zh = LocalizedContent("最昂贵的运动是什么？", listOf("一级方程式", "帆船", "马球", "马术"), "体育", "一级方程式被认为是最昂贵的运动，因为赛车的设计、开发和维护需要巨额预算，以及全球比赛的物流成本。"),
            es = LocalizedContent("¿Cuál es el deporte más caro?", listOf("Fórmula 1", "Vela", "Polo", "Equitación"), "Deportes", "La Fórmula 1 se considera el deporte más caro debido a los enormes presupuestos necesarios para el diseño, desarrollo y mantenimiento de los coches, así como los costos logísticos de las carreras en todo el mundo.")
        ),
        BilingualQuestion(
            id = 51968, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Combien coûte une saison de Formula 1?", listOf("100 millions", "500 millions", "1 milliard", "5 milliards"), "Sport", "Le budget annuel d'une écurie de Formule 1 comme Ferrari ou Red Bull avoisine les 500 millions de dollars, incluant développement, salaires et logistique."),
            en = LocalizedContent("How much does a Formula 1 season cost?", listOf("100 million", "500 million", "1 billion", "5 billion"), "Sports", "The annual budget of a Formula 1 team like Ferrari or Red Bull is around $500 million, including development, salaries, and logistics."),
            zh = LocalizedContent("一个一级方程式赛季花费多少？", listOf("1亿", "5亿", "10亿", "50亿"), "体育", "法拉利或红牛等一级方程式车队的年度预算约为5亿美元，包括研发、工资和物流。"),
            es = LocalizedContent("¿Cuánto cuesta una temporada de Fórmula 1?", listOf("100 millones", "500 millones", "1 billón", "5 billones"), "Deportes", "El presupuesto anual de un equipo de Fórmula 1 como Ferrari o Red Bull ronda los 500 millones de dólares, incluyendo desarrollo, salarios y logística.")
        ),
        BilingualQuestion(
            id = 51969, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le plus grand scandale sportif?", listOf("Dopage", "Corruption", "Match-fixing", "Tous"), "Sport", "Le match-fixing, ou trucage de matchs, est souvent considéré comme le plus grand scandale sportif car il implique la corruption et la manipulation délibérée des résultats pour des gains illicites, sapant l'intégrité du sport."),
            en = LocalizedContent("What is the biggest sports scandal?", listOf("Doping", "Corruption", "Match-fixing", "All"), "Sports", "Match-fixing is often considered the biggest sports scandal because it involves corruption and deliberate manipulation of results for illicit gains, undermining the integrity of sport."),
            zh = LocalizedContent("最大的体育丑闻是什么？", listOf("兴奋剂", "腐败", "操纵比赛", "所有"), "体育", "操纵比赛通常被认为是最大的体育丑闻，因为它涉及腐败和故意操纵结果以获取非法利益，破坏了体育的诚信。"),
            es = LocalizedContent("¿Cuál es el mayor escándalo deportivo?", listOf("Dopaje", "Corrupción", "Arreglo de partidos", "Todos"), "Deportes", "El arreglo de partidos a menudo se considera el mayor escándalo deportivo porque implica corrupción y manipulación deliberada de resultados para obtener ganancias ilícitas, socavando la integridad del deporte.")
        ),
        BilingualQuestion(
            id = 51970, correctIndex = 3, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel athlète a été déchu de ses titres pour dopage?", listOf("Lance Armstrong", "Marion Jones", "Andre Agassi", "Tous"), "Sport", "De nombreux athlètes célèbres ont été déchus de leurs titres pour dopage, comme Lance Armstrong ou Ben Johnson, ce qui rend la réponse \"Tous\" pertinente dans un contexte de quiz."),
            en = LocalizedContent("Which athlete was stripped of titles for doping?", listOf("Lance Armstrong", "Marion Jones", "Andre Agassi", "All"), "Sports", "Many famous athletes have been stripped of titles for doping, such as Lance Armstrong or Ben Johnson, making the answer 'All' relevant in a quiz context."),
            zh = LocalizedContent("哪位运动员因兴奋剂被剥夺头衔？", listOf("兰斯·阿姆斯特朗", "玛丽昂·琼斯", "安德烈·阿加西", "所有"), "体育", "许多著名运动员因兴奋剂被剥夺头衔，如兰斯·阿姆斯特朗或本·约翰逊，因此在测验中答案“所有”是相关的。"),
            es = LocalizedContent("¿Qué atleta fue despojado de sus títulos por dopaje?", listOf("Lance Armstrong", "Marion Jones", "Andre Agassi", "Todos"), "Deportes", "Muchos atletas famosos han sido despojados de sus títulos por dopaje, como Lance Armstrong o Ben Johnson, lo que hace que la respuesta 'Todos' sea relevante en un contexto de prueba.")
        ),
        BilingualQuestion(
            id = 51971, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Combien de titres Lance Armstrong avait-il?", listOf("5", "7", "9", "11"), "Sport", "Lance Armstrong a remporté sept Tours de France consécutifs de 1999 à 2005, mais ses titres ont été annulés pour dopage, ne lui en laissant officiellement aucun."),
            en = LocalizedContent("How many titles did Lance Armstrong have?", listOf("5", "7", "9", "11"), "Sports", "Lance Armstrong won seven consecutive Tour de France titles from 1999 to 2005, but his titles were annulled for doping, leaving him with none officially."),
            zh = LocalizedContent("兰斯·阿姆斯特朗有多少个冠军？", listOf("5", "7", "9", "11"), "体育", "兰斯·阿姆斯特朗从1999年到2005年连续赢得七届环法自行车赛冠军，但因兴奋剂被取消，官方上他没有任何冠军。"),
            es = LocalizedContent("¿Cuántos títulos tenía Lance Armstrong?", listOf("5", "7", "9", "11"), "Deportes", "Lance Armstrong ganó siete Tours de Francia consecutivos de 1999 a 2005, pero sus títulos fueron anulados por dopaje, dejándolo oficialmente sin ninguno.")
        ),
        BilingualQuestion(
            id = 51972, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le sport le plus vieux au monde?", listOf("Lutte", "Boxe", "Équitation", "Athlétisme"), "Sport", "Des fresques sumériennes datant de 3000 av. J.-C. représentent des scènes de combat à mains nues, faisant de la boxe l'un des plus anciens sports attestés."),
            en = LocalizedContent("What is the oldest sport in the world?", listOf("Wrestling", "Boxing", "Equestrian", "Athletics"), "Sports", "Sumerian frescoes dating back to 3000 BC depict scenes of unarmed combat, making boxing one of the oldest attested sports."),
            zh = LocalizedContent("世界上最古老的运动是什么？", listOf("摔跤", "拳击", "马术", "田径"), "体育", "公元前3000年的苏美尔壁画描绘了徒手搏斗的场景，使拳击成为最古老的有记载的运动之一。"),
            es = LocalizedContent("¿Cuál es el deporte más antiguo del mundo?", listOf("Lucha", "Boxeo", "Equitación", "Atletismo"), "Deportes", "Frescos sumerios que datan del 3000 a.C. representan escenas de combate a mano desnuda, lo que convierte al boxeo en uno de los deportes más antiguos atestiguados.")
        ),
        BilingualQuestion(
            id = 51974, correctIndex = 3, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le sport le plus pratiqué au monde?", listOf("Football", "Badminton", "Volleyball", "Tennis"), "Sport", "Le tennis est souvent cité comme le sport individuel le plus pratiqué au monde, avec environ 87 millions de joueurs recensés, mais le football reste le sport collectif dominant avec plus de 4 milliards de fans."),
            en = LocalizedContent("What is the most practiced sport in the world?", listOf("Football", "Badminton", "Volleyball", "Tennis"), "Sports", "Tennis is often cited as the most practiced individual sport in the world, with about 87 million players, but football remains the dominant team sport with over 4 billion fans."),
            zh = LocalizedContent("世界上参与人数最多的运动是什么？", listOf("足球", "羽毛球", "排球", "网球"), "体育", "网球常被认为是世界上参与人数最多的个人运动，约有8700万玩家，但足球仍是主导的团队运动，拥有超过40亿粉丝。"),
            es = LocalizedContent("¿Cuál es el deporte más practicado del mundo?", listOf("Fútbol", "Bádminton", "Voleibol", "Tenis"), "Deportes", "El tenis a menudo se cita como el deporte individual más practicado del mundo, con unos 87 millones de jugadores, pero el fútbol sigue siendo el deporte de equipo dominante con más de 4 mil millones de aficionados.")
        ),
        BilingualQuestion(
            id = 51975, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le plus grand événement sportif au monde?", listOf("Coupe du Monde", "Jeux Olympiques", "Wimbledon", "Tour de France"), "Sport", "La Coupe du Monde de la FIFA est l'événement sportif le plus regardé et suivi mondialement, dépassant les Jeux Olympiques en audience télévisée et en nombre de spectateurs."),
            en = LocalizedContent("What is the biggest sporting event in the world?", listOf("World Cup", "Olympic Games", "Wimbledon", "Tour de France"), "Sports", "The FIFA World Cup is the most watched and followed sporting event globally, surpassing the Olympic Games in television audience and number of spectators."),
            zh = LocalizedContent("世界上最大的体育赛事是什么？", listOf("世界杯", "奥运会", "温布尔登", "环法自行车赛"), "体育", "国际足联世界杯是全球观看和关注度最高的体育赛事，在电视观众和观众数量上超过了奥运会。"),
            es = LocalizedContent("¿Cuál es el evento deportivo más grande del mundo?", listOf("Copa del Mundo", "Juegos Olímpicos", "Wimbledon", "Tour de Francia"), "Deportes", "La Copa del Mundo de la FIFA es el evento deportivo más visto y seguido a nivel mundial, superando a los Juegos Olímpicos en audiencia televisiva y número de espectadores.")
        ),
        BilingualQuestion(
            id = 51976, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Combien de milliards de spectateurs regardent les Jeux Olympiques?", listOf("1", "2", "3", "4"), "Sport", "Les Jeux Olympiques rassemblent environ 2 milliards de téléspectateurs dans le monde, un chiffre qui inclut les audiences cumulées des diffusions en direct et des rediffusions."),
            en = LocalizedContent("How many billion viewers watch the Olympic Games?", listOf("1", "2", "3", "4"), "Sports", "The Olympic Games attract about 2 billion television viewers worldwide, a figure that includes cumulative audiences from live broadcasts and replays."),
            zh = LocalizedContent("有多少亿观众观看奥运会？", listOf("1", "2", "3", "4"), "体育", "奥运会吸引全球约20亿电视观众，这个数字包括直播和重播的累计观众。"),
            es = LocalizedContent("¿Cuántos miles de millones de espectadores ven los Juegos Olímpicos?", listOf("1", "2", "3", "4"), "Deportes", "Los Juegos Olímpicos atraen a unos 2 mil millones de espectadores de televisión en todo el mundo, una cifra que incluye audiencias acumuladas de transmisiones en vivo y repeticiones.")
        ),
        BilingualQuestion(
            id = 51978, correctIndex = 3, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Combien de places le Rungrado a-t-il?", listOf("100000", "114000", "126000", "200000"), "Sport", "Le Rungrado, situé à Pyongyang en Corée du Nord, est le plus grand stade du monde avec une capacité officielle de 150 000 places, mais il peut en accueillir jusqu'à 200 000 pour certains événements."),
            en = LocalizedContent("How many seats does Rungrado have?", listOf("100000", "114000", "126000", "200000"), "Sports", "Rungrado, located in Pyongyang, North Korea, is the largest stadium in the world with an official capacity of 150,000 seats, but it can accommodate up to 200,000 for certain events."),
            zh = LocalizedContent("绫罗岛五一体育场有多少个座位？", listOf("100000", "114000", "126000", "200000"), "体育", "位于朝鲜平壤的绫罗岛五一体育场是世界上最大的体育场，官方容量为15万个座位，但某些活动可容纳多达20万人。"),
            es = LocalizedContent("¿Cuántos asientos tiene el Rungrado?", listOf("100000", "114000", "126000", "200000"), "Deportes", "El Rungrado, ubicado en Pyongyang, Corea del Norte, es el estadio más grande del mundo con una capacidad oficial de 150,000 asientos, pero puede albergar hasta 200,000 para ciertos eventos.")
        ),
        BilingualQuestion(
            id = 51979, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plus haut saut jamais enregistré?", listOf("2.40m", "2.45m", "2.48m", "2.50m"), "Sport", "Le record du monde de saut en hauteur masculin est détenu par Javier Sotomayor avec 2,45 m, mais 2,40 m correspond à la meilleure performance féminine, réalisée par Yaroslava Mahuchikh en 2024."),
            en = LocalizedContent("What is the highest jump ever recorded?", listOf("2.40m", "2.45m", "2.48m", "2.50m"), "Sports", "The men's high jump world record is held by Javier Sotomayor at 2.45 m, but 2.40 m corresponds to the best women's performance, achieved by Yaroslava Mahuchikh in 2024."),
            zh = LocalizedContent("有史以来最高的跳跃是多少？", listOf("2.40米", "2.45米", "2.48米", "2.50米"), "体育", "男子跳高世界纪录由哈维尔·索托马约尔保持，成绩为2.45米，但2.40米对应的是女子最佳成绩，由雅罗斯拉娃·马胡奇赫在2024年创造。"),
            es = LocalizedContent("¿Cuál es el salto más alto jamás registrado?", listOf("2.40m", "2.45m", "2.48m", "2.50m"), "Deportes", "El récord mundial de salto de altura masculino lo posee Javier Sotomayor con 2.45 m, pero 2.40 m corresponde a la mejor marca femenina, lograda por Yaroslava Mahuchikh en 2024.")
        ),
        BilingualQuestion(
            id = 51980, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plus long triple saut?", listOf("18m", "18.5m", "18.7m", "19m"), "Sport", "Le record du monde du triple saut masculin est détenu par Jonathan Edwards avec 18,29 mètres, établi en 1995. Le record féminin est de 15,67 mètres par Yulimar Rojas en 2021."),
            en = LocalizedContent("What is the longest triple jump?", listOf("18m", "18.5m", "18.7m", "19m"), "Sports", "The men's world record in triple jump is held by Jonathan Edwards with 18.29 meters, set in 1995. The women's record is 15.67 meters by Yulimar Rojas in 2021."),
            zh = LocalizedContent("最远的三级跳远是多少？", listOf("18米", "18.5米", "18.7米", "19米"), "体育", "男子三级跳远世界纪录由乔纳森·爱德华兹保持，成绩为18.29米，创于1995年。女子纪录是尤利马尔·罗哈斯在2021年跳出的15.67米。"),
            es = LocalizedContent("¿Cuál es el triple salto más largo?", listOf("18m", "18.5m", "18.7m", "19m"), "Deportes", "El récord mundial masculino de triple salto lo posee Jonathan Edwards con 18,29 metros, establecido en 1995. El récord femenino es de 15,67 metros por Yulimar Rojas en 2021.")
        ),
        BilingualQuestion(
            id = 51981, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plus loin jamais lancé un javelot?", listOf("95m", "100m", "110m", "120m"), "Sport", "Le record du monde du lancer de javelot masculin est détenu par Jan Železný avec 98,48 mètres, et non 110 mètres, car cette distance dépasse les limites humaines et techniques actuelles."),
            en = LocalizedContent("What is the farthest javelin throw ever?", listOf("95m", "100m", "110m", "120m"), "Sports", "The men's world record in javelin throw is held by Jan Železný with 98.48 meters, not 110 meters, as that distance exceeds current human and technical limits."),
            zh = LocalizedContent("最远的标枪投掷距离是多少？", listOf("95米", "100米", "110米", "120米"), "体育", "男子标枪世界纪录由扬·泽莱兹尼保持，成绩为98.48米，而非110米，因为这一距离超出了当前人类和技术的极限。"),
            es = LocalizedContent("¿Cuál es el lanzamiento de jabalina más lejano?", listOf("95m", "100m", "110m", "120m"), "Deportes", "El récord mundial masculino de lanzamiento de jabalina lo posee Jan Železný con 98,48 metros, no 110 metros, ya que esa distancia supera los límites humanos y técnicos actuales.")
        ),
        BilingualQuestion(
            id = 51982, correctIndex = 3, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plus vieux joueur à avoir remporté un Grand Slam?", listOf("35", "40", "45", "50"), "Sport", "Le joueur de tennis le plus âgé à avoir remporté un Grand Chelem est Ken Rosewall, qui a gagné l'Open d'Australie en 1972 à l'âge de 37 ans."),
            en = LocalizedContent("Who is the oldest player to win a Grand Slam?", listOf("35", "40", "45", "50"), "Sports", "The oldest tennis player to win a Grand Slam is Ken Rosewall, who won the Australian Open in 1972 at the age of 37."),
            zh = LocalizedContent("赢得大满贯最年长的球员是多少岁？", listOf("35", "40", "45", "50"), "体育", "赢得大满贯最年长的网球选手是肯·罗斯沃尔，他在1972年以37岁之龄赢得澳大利亚公开赛。"),
            es = LocalizedContent("¿Cuál es el jugador más viejo en ganar un Grand Slam?", listOf("35", "40", "45", "50"), "Deportes", "El tenista más longevo en ganar un Grand Slam es Ken Rosewall, quien ganó el Abierto de Australia en 1972 a los 37 años.")
        ),
        BilingualQuestion(
            id = 51983, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plus jeune joueur à avoir remporté un Grand Slam?", listOf("15", "16", "17", "18"), "Sport", "Martina Hingis avait 15 ans lorsqu'elle a remporté l'Open d'Australie en 1997, devenant ainsi la plus jeune vainqueur d'un tournoi du Grand Chelem de l'ère Open."),
            en = LocalizedContent("Who is the youngest player to win a Grand Slam?", listOf("15", "16", "17", "18"), "Sports", "Martina Hingis was 15 when she won the Australian Open in 1997, becoming the youngest Grand Slam winner in the Open Era."),
            zh = LocalizedContent("赢得大满贯最年轻的球员是多少岁？", listOf("15", "16", "17", "18"), "体育", "玛蒂娜·辛吉斯在1997年赢得澳大利亚公开赛时年仅15岁，成为公开赛时代最年轻的大满贯得主。"),
            es = LocalizedContent("¿Cuál es el jugador más joven en ganar un Grand Slam?", listOf("15", "16", "17", "18"), "Deportes", "Martina Hingis tenía 15 años cuando ganó el Abierto de Australia en 1997, convirtiéndose en la ganadora más joven de un Grand Slam en la Era Abierta.")
        ),
        BilingualQuestion(
            id = 51984, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le score record à Roland Garros?", listOf("7/5 6/4", "6/1 6/1", "7/6 7/6", "8/6 8/6"), "Sport", "Ce score record a été réalisé par Steffi Graf en finale de Roland-Garros 1988 contre Natasha Zvereva, en seulement 34 minutes de jeu."),
            en = LocalizedContent("What is the record score at Roland Garros?", listOf("7/5 6/4", "6/1 6/1", "7/6 7/6", "8/6 8/6"), "Sports", "This record score was achieved by Steffi Graf in the 1988 Roland Garros final against Natasha Zvereva, in just 34 minutes of play."),
            zh = LocalizedContent("罗兰·加洛斯最悬殊的比分是多少？", listOf("7/5 6/4", "6/1 6/1", "7/6 7/6", "8/6 8/6"), "体育", "这一悬殊比分由施特菲·格拉芙在1988年法网决赛中对阵娜塔莎·兹韦列娃时创造，仅用时34分钟。"),
            es = LocalizedContent("¿Cuál es el marcador récord en Roland Garros?", listOf("7/5 6/4", "6/1 6/1", "7/6 7/6", "8/6 8/6"), "Deportes", "Este marcador récord fue logrado por Steffi Graf en la final de Roland Garros 1988 contra Natasha Zvereva, en solo 34 minutos de juego.")
        ),
        BilingualQuestion(
            id = 51985, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le match le plus long du tennis?", listOf("5h", "7h", "11h", "15h"), "Sport", "Le match le plus long de l'histoire du tennis a opposé John Isner à Nicolas Mahut à Wimbledon en 2010, durant 11 heures et 5 minutes sur trois jours."),
            en = LocalizedContent("What is the longest tennis match?", listOf("5h", "7h", "11h", "15h"), "Sports", "The longest tennis match in history was between John Isner and Nicolas Mahut at Wimbledon in 2010, lasting 11 hours and 5 minutes over three days."),
            zh = LocalizedContent("最长的网球比赛持续了多久？", listOf("5小时", "7小时", "11小时", "15小时"), "体育", "历史上最长的网球比赛是2010年温布尔登锦标赛上约翰·伊斯内尔对阵尼古拉·马胡，历时11小时5分钟，分三天进行。"),
            es = LocalizedContent("¿Cuál es el partido de tenis más largo?", listOf("5h", "7h", "11h", "15h"), "Deportes", "El partido de tenis más largo de la historia enfrentó a John Isner y Nicolas Mahut en Wimbledon 2010, con una duración de 11 horas y 5 minutos en tres días.")
        ),
        BilingualQuestion(
            id = 51986, correctIndex = 3, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le nombre de balles utilisées à Wimbledon?", listOf("6000", "36000", "60000", "120000"), "Sport", "Wimbledon utilise environ 120 000 balles par édition, soit plus de 50 000 par semaine, car les balles sont changées tous les neuf jeux pour garantir une qualité de jeu optimale."),
            en = LocalizedContent("How many balls are used at Wimbledon?", listOf("6000", "36000", "60000", "120000"), "Sports", "Wimbledon uses approximately 120,000 balls per edition, over 50,000 per week, as balls are changed every nine games to ensure optimal playing quality."),
            zh = LocalizedContent("温布尔登使用多少球？", listOf("6000", "36000", "60000", "120000"), "体育", "温布尔登每届赛事使用约12万个球，每周超过5万个，因为每九局更换一次球以确保最佳比赛质量。"),
            es = LocalizedContent("¿Cuántas pelotas se usan en Wimbledon?", listOf("6000", "36000", "60000", "120000"), "Deportes", "Wimbledon utiliza aproximadamente 120,000 pelotas por edición, más de 50,000 por semana, ya que las pelotas se cambian cada nueve juegos para garantizar una calidad de juego óptima.")
        ),
        BilingualQuestion(
            id = 51987, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le nombre de joueurs inscrits à Roland Garros?", listOf("100", "500", "1000", "2000"), "Sport", "Le tableau principal de Roland-Garros compte 128 joueurs en simple, mais le nombre total de joueurs inscrits, incluant les qualifications et les doubles, dépasse largement ce chiffre."),
            en = LocalizedContent("How many players are registered at Roland Garros?", listOf("100", "500", "1000", "2000"), "Sports", "The main draw of Roland Garros has 128 singles players, but the total number of registered players, including qualifiers and doubles, far exceeds that number."),
            zh = LocalizedContent("罗兰·加洛斯有多少球员报名？", listOf("100", "500", "1000", "2000"), "体育", "罗兰·加洛斯正赛有128名单打选手，但包括资格赛和双打在内的总报名人数远超此数。"),
            es = LocalizedContent("¿Cuántos jugadores están inscritos en Roland Garros?", listOf("100", "500", "1000", "2000"), "Deportes", "El cuadro principal de Roland Garros cuenta con 128 jugadores en individuales, pero el número total de inscritos, incluyendo clasificatorios y dobles, supera ampliamente esa cifra.")
        ),
        BilingualQuestion(
            id = 51988, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plus jeune vainqueur de la Coupe du Monde?", listOf("17", "18", "19", "20"), "Sport", "Pelé avait 17 ans lors de la victoire du Brésil en 1958, ce qui en fait le plus jeune joueur à remporter la Coupe du Monde."),
            en = LocalizedContent("Who is the youngest World Cup winner?", listOf("17", "18", "19", "20"), "Sports", "Pelé was 17 when Brazil won in 1958, making him the youngest player to win the World Cup."),
            zh = LocalizedContent("最年轻的世界杯冠军球员是多少岁？", listOf("17", "18", "19", "20"), "体育", "贝利在1958年巴西夺冠时年仅17岁，成为最年轻的世界杯冠军球员。"),
            es = LocalizedContent("¿Cuál es el ganador más joven de la Copa del Mundo?", listOf("17", "18", "19", "20"), "Deportes", "Pelé tenía 17 años cuando Brasil ganó en 1958, lo que lo convierte en el jugador más joven en ganar la Copa del Mundo.")
        ),
        BilingualQuestion(
            id = 51989, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plus vieux vainqueur de la Coupe du Monde?", listOf("35", "38", "40", "43"), "Sport", "Le gardien camerounais Roger Milla avait 40 ans lors de la Coupe du Monde 1994, ce qui fait de lui le joueur le plus âgé à avoir remporté un match dans cette compétition."),
            en = LocalizedContent("Who is the oldest World Cup winner?", listOf("35", "38", "40", "43"), "Sports", "Cameroonian goalkeeper Roger Milla was 40 during the 1994 World Cup, making him the oldest player to win a match in the competition."),
            zh = LocalizedContent("最年长的世界杯冠军球员是多少岁？", listOf("35", "38", "40", "43"), "体育", "喀麦隆门将罗杰·米拉在1994年世界杯时40岁，成为该赛事中赢得比赛的最年长球员。"),
            es = LocalizedContent("¿Cuál es el ganador más viejo de la Copa del Mundo?", listOf("35", "38", "40", "43"), "Deportes", "El portero camerunés Roger Milla tenía 40 años durante la Copa del Mundo de 1994, lo que lo convierte en el jugador más longevo en ganar un partido en la competición.")
        ),
        BilingualQuestion(
            id = 51990, correctIndex = 3, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plus beau but jamais marqué au football?", listOf("Maradona", "Ronaldinho", "Messi", "Ronaldo"), "Sport", "Le but de Ronaldo en finale de la Ligue des champions 2002 contre Leverkusen est souvent cité comme le plus beau, pour sa frappe puissante et précise du gauche."),
            en = LocalizedContent("What is the most beautiful goal ever scored in football?", listOf("Maradona", "Ronaldinho", "Messi", "Ronaldo"), "Sports", "Ronaldo's goal in the 2002 Champions League final against Leverkusen is often cited as the most beautiful, for his powerful and precise left-footed strike."),
            zh = LocalizedContent("足球史上最漂亮的进球是哪个？", listOf("马拉多纳", "罗纳尔迪尼奥", "梅西", "罗纳尔多"), "体育", "罗纳尔多在2002年欧冠决赛对阵勒沃库森的进球常被认为是最漂亮的，因为他的左脚射门力量大且精准。"),
            es = LocalizedContent("¿Cuál es el gol más bonito jamás marcado en el fútbol?", listOf("Maradona", "Ronaldinho", "Messi", "Ronaldo"), "Deportes", "El gol de Ronaldo en la final de la Liga de Campeones de 2002 contra el Leverkusen es a menudo citado como el más bonito, por su potente y preciso disparo con la izquierda.")
        ),
        BilingualQuestion(
            id = 51991, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plus grand nombre de buts marqués en une saison?", listOf("50", "60", "73", "100"), "Sport", "Le record de 50 buts en une saison est détenu par Wayne Gretzky dans la LNH en 1981-1982, un exploit jamais égalé dans le hockey professionnel."),
            en = LocalizedContent("What is the highest number of goals scored in a season?", listOf("50", "60", "73", "100"), "Sports", "The record of 50 goals in a season is held by Wayne Gretzky in the NHL in 1981-1982, a feat never equaled in professional hockey."),
            zh = LocalizedContent("单赛季进球数最多的是多少？", listOf("50", "60", "73", "100"), "体育", "单赛季50球的纪录由韦恩·格雷茨基在1981-1982赛季的NHL中保持，这是职业冰球中从未被超越的成就。"),
            es = LocalizedContent("¿Cuál es el mayor número de goles marcados en una temporada?", listOf("50", "60", "73", "100"), "Deportes", "El récord de 50 goles en una temporada lo ostenta Wayne Gretzky en la NHL en 1981-1982, una hazaña nunca igualada en el hockey profesional.")
        ),
        BilingualQuestion(
            id = 51992, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le joueur ayant marqué le plus de buts en carrière?", listOf("Pelé", "Ronaldo", "Messi", "Maradona"), "Sport", "Le Brésilien Ronaldo, surnommé \"Il Fenomeno\", détient le record du nombre de buts marqués en carrière avec plus de 700 réalisations officielles."),
            en = LocalizedContent("Which player has scored the most goals in their career?", listOf("Pelé", "Ronaldo", "Messi", "Maradona"), "Sports", "Brazilian Ronaldo, nicknamed \"Il Fenomeno\", holds the record for the most career goals with over 700 official goals."),
            zh = LocalizedContent("职业生涯进球最多的球员是谁？", listOf("贝利", "罗纳尔多", "梅西", "马拉多纳"), "体育", "巴西人罗纳尔多，绰号“现象”，保持着职业生涯进球最多的纪录，超过700个正式进球。"),
            es = LocalizedContent("¿Qué jugador ha marcado más goles en su carrera?", listOf("Pelé", "Ronaldo", "Messi", "Maradona"), "Deportes", "El brasileño Ronaldo, apodado \"Il Fenomeno\", ostenta el récord de más goles en su carrera con más de 700 tantos oficiales.")
        ),
        BilingualQuestion(
            id = 51993, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Combien de buts Pelé a-t-il marqués en carrière?", listOf("500", "700", "1000", "1300"), "Sport", "Pelé a officiellement marqué 767 buts en matchs compétitifs, mais le chiffre de 1000 inclut les matchs amicaux et les tournois non officiels, un total symbolique célébré par le joueur brésilien."),
            en = LocalizedContent("How many goals did Pelé score in his career?", listOf("500", "700", "1000", "1300"), "Sports", "Pelé officially scored 767 goals in competitive matches, but the figure of 1000 includes friendlies and unofficial tournaments, a symbolic total celebrated by the Brazilian player."),
            zh = LocalizedContent("贝利职业生涯进了多少球？", listOf("500", "700", "1000", "1300"), "体育", "贝利在正式比赛中攻入767球，但1000球的数据包括友谊赛和非正式赛事，这是巴西球员庆祝的一个象征性总数。"),
            es = LocalizedContent("¿Cuántos goles marcó Pelé en su carrera?", listOf("500", "700", "1000", "1300"), "Deportes", "Pelé marcó oficialmente 767 goles en partidos competitivos, pero la cifra de 1000 incluye amistosos y torneos no oficiales, un total simbólico celebrado por el jugador brasileño.")
        ),
        BilingualQuestion(
            id = 51994, correctIndex = 3, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plus jeune joueur à signer un contrat professionnel?", listOf("10", "12", "14", "16"), "Sport", "Le record est détenu par le footballeur américain Freddy Adu, qui a signé un contrat professionnel avec le D.C. United à l'âge de 14 ans, mais la limite d'âge standard dans la plupart des ligues majeures est fixée à 16 ans."),
            en = LocalizedContent("What is the youngest age to sign a professional contract?", listOf("10", "12", "14", "16"), "Sports", "The record is held by American footballer Freddy Adu, who signed a professional contract with D.C. United at age 14, but the standard age limit in most major leagues is set at 16."),
            zh = LocalizedContent("签下职业合同的最小年龄是多少？", listOf("10", "12", "14", "16"), "体育", "这一纪录由美国足球运动员弗雷迪·阿杜保持，他在14岁时与华盛顿联队签下职业合同，但大多数主要联赛的标准年龄限制是16岁。"),
            es = LocalizedContent("¿Cuál es la edad más joven para firmar un contrato profesional?", listOf("10", "12", "14", "16"), "Deportes", "El récord lo ostenta el futbolista estadounidense Freddy Adu, quien firmó un contrato profesional con el D.C. United a los 14 años, pero el límite de edad estándar en la mayoría de las ligas importantes se fija en 16 años.")
        ),
        BilingualQuestion(
            id = 51995, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plus grand transfert footballistique jamais enregistré?", listOf("100 millions", "200 millions", "500 millions", "1 milliard"), "Sport", "Neymar a rejoint le Paris Saint-Germain en 2017 pour 222 millions d'euros, mais le record du plus grand transfert est souvent attribué au transfert de 100 millions de livres sterling de Gareth Bale au Real Madrid en 2013."),
            en = LocalizedContent("What is the largest football transfer ever recorded?", listOf("100 million", "200 million", "500 million", "1 billion"), "Sports", "Neymar joined Paris Saint-Germain in 2017 for €222 million, but the record for the largest transfer is often attributed to Gareth Bale's £100 million move to Real Madrid in 2013."),
            zh = LocalizedContent("有史以来最大的足球转会费是多少？", listOf("1亿", "2亿", "5亿", "10亿"), "体育", "内马尔在2017年以2.22亿欧元加盟巴黎圣日耳曼，但最大转会纪录常被归功于2013年加雷斯·贝尔以1亿英镑转会皇家马德里。"),
            es = LocalizedContent("¿Cuál es el mayor traspaso futbolístico jamás registrado?", listOf("100 millones", "200 millones", "500 millones", "1.000 millones"), "Deportes", "Neymar se unió al Paris Saint-Germain en 2017 por 222 millones de euros, pero el récord del mayor traspaso a menudo se atribuye al movimiento de Gareth Bale por 100 millones de libras al Real Madrid en 2013.")
        ),
        BilingualQuestion(
            id = 51996, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Combien d'euros a coûté la signature de Neymar au PSG?", listOf("150", "200", "222", "300"), "Sport", "Le transfert de Neymar du FC Barcelone au Paris Saint-Germain en 2017 a été officialisé pour 222 millions d'euros, un montant record qui a activé sa clause de libération."),
            en = LocalizedContent("How many euros did Neymar's signing for PSG cost?", listOf("150", "200", "222", "300"), "Sports", "Neymar's transfer from FC Barcelona to Paris Saint-Germain in 2017 was finalized for €222 million, a record amount that activated his release clause."),
            zh = LocalizedContent("内马尔签约巴黎圣日耳曼花费了多少欧元？", listOf("150", "200", "222", "300"), "体育", "内马尔在2017年从巴塞罗那转会至巴黎圣日耳曼的转会费为2.22亿欧元，这一创纪录的金额触发了他的解约条款。"),
            es = LocalizedContent("¿Cuántos euros costó el fichaje de Neymar por el PSG?", listOf("150", "200", "222", "300"), "Deportes", "El traspaso de Neymar del FC Barcelona al Paris Saint-Germain en 2017 se oficializó por 222 millones de euros, una cantidad récord que activó su cláusula de rescisión.")
        ),
        BilingualQuestion(
            id = 51997, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plus gros salaire annuel d'un joueur de football?", listOf("20 millions", "50 millions", "100 millions", "200 millions"), "Sport", "Le salaire annuel de 100 millions d'euros correspond au contrat de Cristiano Ronaldo avec Al-Nassr en Arabie Saoudite, signé en 2023, incluant salaire et droits d'image."),
            en = LocalizedContent("What is the highest annual salary of a football player?", listOf("20 million", "50 million", "100 million", "200 million"), "Sports", "The annual salary of €100 million corresponds to Cristiano Ronaldo's contract with Al-Nassr in Saudi Arabia, signed in 2023, including salary and image rights."),
            zh = LocalizedContent("足球运动员的最高年薪是多少？", listOf("2000万", "5000万", "1亿", "2亿"), "体育", "1亿欧元的年薪对应克里斯蒂亚诺·罗纳尔多2023年与沙特阿拉伯的阿尔纳斯尔签订的合同，包括薪水和肖像权。"),
            es = LocalizedContent("¿Cuál es el salario anual más alto de un futbolista?", listOf("20 millones", "50 millones", "100 millones", "200 millones"), "Deportes", "El salario anual de 100 millones de euros corresponde al contrato de Cristiano Ronaldo con el Al-Nassr en Arabia Saudita, firmado en 2023, incluyendo salario y derechos de imagen.")
        ),
        BilingualQuestion(
            id = 51998, correctIndex = 3, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le record du nombre d'assistances en une saison?", listOf("25", "35", "45", "55"), "Sport", "Le record de 55 passes décisives en une saison a été établi par le joueur de handball islandais Ólafur Stefánsson en 2002-2003 avec le club de Ciudad Real."),
            en = LocalizedContent("What is the record for the number of assists in a season?", listOf("25", "35", "45", "55"), "Sports", "The record of 55 assists in a season was set by Icelandic handball player Ólafur Stefánsson in 2002-2003 with the club Ciudad Real."),
            zh = LocalizedContent("单赛季助攻数的纪录是多少？", listOf("25", "35", "45", "55"), "体育", "单赛季55次助攻的纪录由冰岛手球运动员奥拉富尔·斯特凡松在2002-2003赛季效力于皇家城市俱乐部时创造。"),
            es = LocalizedContent("¿Cuál es el récord del número de asistencias en una temporada?", listOf("25", "35", "45", "55"), "Deportes", "El récord de 55 asistencias en una temporada fue establecido por el jugador de balonmano islandés Ólafur Stefánsson en 2002-2003 con el club Ciudad Real.")
        ),
        BilingualQuestion(
            id = 51999, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plus grand nombre de cartons rouges donnés en une saison?", listOf("50", "100", "150", "200"), "Sport", "Ce record a été établi par le club argentin de Claypole lors de la saison 2011-2012, où l'arbitre Damian Rubino a distribué 36 cartons rouges lors d'un seul match, contribuant au total annuel."),
            en = LocalizedContent("What is the highest number of red cards given in a season?", listOf("50", "100", "150", "200"), "Sports", "This record was set by the Argentine club Claypole during the 2011-2012 season, where referee Damian Rubino distributed 36 red cards in a single match, contributing to the annual total."),
            zh = LocalizedContent("单赛季出示红牌最多的是多少？", listOf("50", "100", "150", "200"), "体育", "这一纪录由阿根廷俱乐部克莱波尔在2011-2012赛季创造，当时裁判达米安·鲁比诺在一场比赛中出示了36张红牌，为年度总数做出了贡献。"),
            es = LocalizedContent("¿Cuál es el mayor número de tarjetas rojas mostradas en una temporada?", listOf("50", "100", "150", "200"), "Deportes", "Este récord fue establecido por el club argentino Claypole durante la temporada 2011-2012, donde el árbitro Damián Rubino distribuyó 36 tarjetas rojas en un solo partido, contribuyendo al total anual.")
        ),
        BilingualQuestion(
            id = 52000, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le record d'affluence à un match de football?", listOf("100000", "150000", "200000", "250000"), "Sport", "Le record d'affluence pour un match de football est d'environ 150 000 spectateurs, atteint lors de la finale de la Coupe du Monde 1950 au Brésil, entre l'Uruguay et le Brésil, au stade Maracanã."),
            en = LocalizedContent("What is the attendance record for a football match?", listOf("100000", "150000", "200000", "250000"), "Sports", "The attendance record for a football match is approximately 150,000 spectators, achieved during the 1950 World Cup final in Brazil between Uruguay and Brazil at the Maracanã Stadium."),
            zh = LocalizedContent("足球比赛的上座纪录是多少？", listOf("100000", "150000", "200000", "250000"), "体育", "足球比赛的上座纪录约为15万观众，在1950年巴西世界杯决赛中，乌拉圭对阵巴西，于马拉卡纳体育场创下。"),
            es = LocalizedContent("¿Cuál es el récord de asistencia a un partido de fútbol?", listOf("100000", "150000", "200000", "250000"), "Deportes", "El récord de asistencia a un partido de fútbol es de aproximadamente 150,000 espectadores, alcanzado durante la final de la Copa del Mundo de 1950 en Brasil, entre Uruguay y Brasil, en el Estadio Maracaná.")
        ),
        BilingualQuestion(
            id = 52001, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand événement sportif annuel?", listOf("Wimbledon", "Tour de France", "Super Bowl", "Jeux Olympiques"), "Sport", "Lionel Messi détient le record avec huit Ballons d'Or, remportés entre 2009 et 2023, surpassant son rival Cristiano Ronaldo qui en compte cinq."),
            en = LocalizedContent("What is the largest annual sporting event?", listOf("Wimbledon", "Tour de France", "Super Bowl", "Olympic Games"), "Sports", "Lionel Messi holds the record with eight Ballon d'Or awards, won between 2009 and 2023, surpassing his rival Cristiano Ronaldo who has five."),
            zh = LocalizedContent("最大的年度体育赛事是什么？", listOf("温布尔登", "环法自行车赛", "超级碗", "奥运会"), "体育", "莱昂内尔·梅西保持着八次金球奖的纪录，在2009年至2023年间获得，超越了他的对手克里斯蒂亚诺·罗纳尔多（五次）。"),
            es = LocalizedContent("¿Cuál es el mayor evento deportivo anual?", listOf("Wimbledon", "Tour de Francia", "Super Bowl", "Juegos Olímpicos"), "Deportes", "Lionel Messi ostenta el récord con ocho Balones de Oro, ganados entre 2009 y 2023, superando a su rival Cristiano Ronaldo que tiene cinco.")
        ),
        BilingualQuestion(
            id = 52002, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de spectateurs regarde le Tour de France?", listOf("1 million", "5 millions", "15 millions", "50 millions"), "Sport", "Lionel Messi a remporté la Ligue des Champions à quatre reprises avec le FC Barcelone, en 2006, 2009, 2011 et 2015."),
            en = LocalizedContent("How many spectators watch the Tour de France?", listOf("1 million", "5 million", "15 million", "50 million"), "Sports", "Lionel Messi won the Champions League four times with FC Barcelona, in 2006, 2009, 2011, and 2015."),
            zh = LocalizedContent("有多少观众观看环法自行车赛？", listOf("100万", "500万", "1500万", "5000万"), "体育", "莱昂内尔·梅西随巴塞罗那四次赢得欧冠冠军，分别在2006年、2009年、2011年和2015年。"),
            es = LocalizedContent("¿Cuántos espectadores ven el Tour de Francia?", listOf("1 millón", "5 millones", "15 millones", "50 millones"), "Deportes", "Lionel Messi ganó la Liga de Campeones cuatro veces con el FC Barcelona, en 2006, 2009, 2011 y 2015.")
        ),
        BilingualQuestion(
            id = 52003, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand nombre de pays ayant participé aux Jeux Olympiques?", listOf("150", "190", "205", "250"), "Sport", "Cristiano Ronaldo détient ce record avec 140 buts en Ligue des Champions, dont 17 lors des phases finales, soit le total le plus élevé de l'histoire de la compétition."),
            en = LocalizedContent("What is the largest number of countries that have participated in the Olympic Games?", listOf("150", "190", "205", "250"), "Sports", "Cristiano Ronaldo holds this record with 140 goals in the Champions League, including 17 in the knockout stages, the highest total in the competition's history."),
            zh = LocalizedContent("参加奥运会的国家最多有多少个？", listOf("150", "190", "205", "250"), "体育", "克里斯蒂亚诺·罗纳尔多保持着这一纪录，在欧冠中打入140球，其中17球在淘汰赛阶段，是赛事历史最高。"),
            es = LocalizedContent("¿Cuál es el mayor número de países que han participado en los Juegos Olímpicos?", listOf("150", "190", "205", "250"), "Deportes", "Cristiano Ronaldo ostenta este récord con 140 goles en la Liga de Campeones, incluidos 17 en las fases eliminatorias, el total más alto en la historia de la competición.")
        ),
        BilingualQuestion(
            id = 52004, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record du monde du marathon?", listOf("2h05m", "2h02m", "2h01m", "2h00m"), "Sport", "Zidane a marqué ce but lors de la finale de 2000 entre le Real Madrid et le Bayer Leverkusen, une reprise de volée du pied gauche qui a offert la victoire au Real."),
            en = LocalizedContent("What is the world record for the marathon?", listOf("2h05m", "2h02m", "2h01m", "2h00m"), "Sports", "Zidane scored this goal in the 2000 final between Real Madrid and Bayer Leverkusen, a left-footed volley that gave Real Madrid the victory."),
            zh = LocalizedContent("马拉松的世界纪录是多少？", listOf("2小时05分", "2小时02分", "2小时01分", "2小时00分"), "体育", "齐达内在2000年皇家马德里对阵勒沃库森的决赛中打入此球，一记左脚凌空抽射为皇马带来胜利。"),
            es = LocalizedContent("¿Cuál es el récord mundial de maratón?", listOf("2h05m", "2h02m", "2h01m", "2h00m"), "Deportes", "Zidane marcó este gol en la final de 2000 entre el Real Madrid y el Bayer Leverkusen, una volea con la izquierda que dio la victoria al Real Madrid.")
        ),
        BilingualQuestion(
            id = 52005, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record du monde du 1500m?", listOf("3m20s", "3m25s", "3m28s", "3m30s"), "Sport", "Clarence Seedorf a gagné la Ligue des Champions avec l’Ajax Amsterdam en 1995, le Real Madrid en 1998, et l’AC Milan en 2003 et 2007, un exploit unique."),
            en = LocalizedContent("What is the world record for the 1500m?", listOf("3m20s", "3m25s", "3m28s", "3m30s"), "Sports", "Clarence Seedorf won the Champions League with Ajax Amsterdam in 1995, Real Madrid in 1998, and AC Milan in 2003 and 2007, a unique feat."),
            zh = LocalizedContent("1500米的世界纪录是多少？", listOf("3分20秒", "3分25秒", "3分28秒", "3分30秒"), "体育", "克拉伦斯·西多夫随阿贾克斯（1995年）、皇家马德里（1998年）和AC米兰（2003年、2007年）赢得欧冠，这是一项独特的成就。"),
            es = LocalizedContent("¿Cuál es el récord mundial de los 1500m?", listOf("3m20s", "3m25s", "3m28s", "3m30s"), "Deportes", "Clarence Seedorf ganó la Liga de Campeones con el Ajax Ámsterdam en 1995, el Real Madrid en 1998 y el AC Milan en 2003 y 2007, una hazaña única.")
        ),
        BilingualQuestion(
            id = 52006, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record du monde du 5000m?", listOf("12m30s", "12m35s", "12m40s", "12m50s"), "Sport", "Le Real Madrid a remporté la Ligue des Champions en 2014, 2016, 2017 et 2018, soit quatre titres en cinq saisons, une performance unique dans l'histoire moderne de la compétition."),
            en = LocalizedContent("What is the world record for the 5000m?", listOf("12m30s", "12m35s", "12m40s", "12m50s"), "Sports", "Real Madrid won the Champions League in 2014, 2016, 2017, and 2018, four titles in five seasons, a unique performance in the modern history of the competition."),
            zh = LocalizedContent("5000米的世界纪录是多少？", listOf("12分30秒", "12分35秒", "12分40秒", "12分50秒"), "体育", "皇家马德里在2014年、2016年、2017年和2018年赢得欧冠，五个赛季内四次夺冠，这在现代赛事史上是独一无二的。"),
            es = LocalizedContent("¿Cuál es el récord mundial de los 5000m?", listOf("12m30s", "12m35s", "12m40s", "12m50s"), "Deportes", "El Real Madrid ganó la Liga de Campeones en 2014, 2016, 2017 y 2018, cuatro títulos en cinco temporadas, una actuación única en la historia moderna de la competición.")
        ),
        BilingualQuestion(
            id = 52007, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le sport ayant le plus de champions?", listOf("Badminton", "Volleyball", "Football", "Tennis"), "Sport", "Carlo Ancelotti détient le record avec cinq titres en Ligue des Champions, remportés avec l'AC Milan (2003, 2007) et le Real Madrid (2014, 2022, 2024)."),
            en = LocalizedContent("Which sport has the most champions?", listOf("Badminton", "Volleyball", "Football", "Tennis"), "Sports", "Carlo Ancelotti holds the record with five Champions League titles, won with AC Milan (2003, 2007) and Real Madrid (2014, 2022, 2024)."),
            zh = LocalizedContent("哪项运动拥有最多的冠军？", listOf("羽毛球", "排球", "足球", "网球"), "体育", "卡洛·安切洛蒂保持着五次欧冠冠军的纪录，随AC米兰（2003年、2007年）和皇家马德里（2014年、2022年、2024年）获得。"),
            es = LocalizedContent("¿Qué deporte tiene más campeones?", listOf("Bádminton", "Voleibol", "Fútbol", "Tenis"), "Deportes", "Carlo Ancelotti ostenta el récord con cinco títulos de la Liga de Campeones, ganados con el AC Milan (2003, 2007) y el Real Madrid (2014, 2022, 2024).")
        ),
        BilingualQuestion(
            id = 52008, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand nombre de joueurs sur un terrain?", listOf("11", "12", "13", "15"), "Sport", "Pep Guardiola a remporté la Ligue des Champions en 2009 et 2011 avec le FC Barcelone, puis en 2023 avec Manchester City, soit trois titres au total."),
            en = LocalizedContent("What is the largest number of players on a field?", listOf("11", "12", "13", "15"), "Sports", "Pep Guardiola won the Champions League in 2009 and 2011 with FC Barcelona, and in 2023 with Manchester City, for a total of three titles."),
            zh = LocalizedContent("场上的最大球员数是多少？", listOf("11", "12", "13", "15"), "体育", "佩普·瓜迪奥拉随巴塞罗那在2009年和2011年赢得欧冠，2023年随曼城夺冠，共三次。"),
            es = LocalizedContent("¿Cuál es el mayor número de jugadores en un campo?", listOf("11", "12", "13", "15"), "Deportes", "Pep Guardiola ganó la Liga de Campeones en 2009 y 2011 con el FC Barcelona, y en 2023 con el Manchester City, un total de tres títulos.")
        ),
        BilingualQuestion(
            id = 52009, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le sport au ballon le plus rapide?", listOf("Badminton", "Squash", "Aucun", "Tennis"), "Sport", "Liverpool et l'AC Milan ont marqué trois buts chacun en 90 minutes lors de la finale 2005, après que Milan ait mené 3-0 à la mi-temps."),
            en = LocalizedContent("What is the fastest ball sport?", listOf("Badminton", "Squash", "None", "Tennis"), "Sports", "Liverpool and AC Milan each scored three goals in 90 minutes during the 2005 final, after Milan led 3-0 at halftime."),
            zh = LocalizedContent("最快的球类运动是什么？", listOf("羽毛球", "壁球", "无", "网球"), "体育", "利物浦和AC米兰在2005年决赛的90分钟内各进三球，当时米兰半场以3-0领先。"),
            es = LocalizedContent("¿Cuál es el deporte de pelota más rápido?", listOf("Bádminton", "Squash", "Ninguno", "Tenis"), "Deportes", "Liverpool y AC Milan marcaron tres goles cada uno en 90 minutos durante la final de 2005, después de que el Milan liderara 3-0 al descanso.")
        ),
    )

    private fun part5(): List<BilingualQuestion> = listOf(
        BilingualQuestion(
            id = 52010, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le volley-ball le plus rapide jamais enregistré?", listOf("100 km/h", "130 km/h", "160 km/h", "190 km/h"), "Sport", "Ole Gunnar Solskjaer a inscrit le but décisif dans le temps additionnel, permettant à Manchester United de remporter la finale de la Ligue des champions 1999 contre le Bayern Munich."),
            en = LocalizedContent("What is the fastest volleyball serve ever recorded?", listOf("100 km/h", "130 km/h", "160 km/h", "190 km/h"), "Sports", "Ole Gunnar Solskjaer scored the decisive goal in stoppage time, allowing Manchester United to win the 1999 Champions League final against Bayern Munich."),
            zh = LocalizedContent("有记录以来最快的排球发球速度是多少？", listOf("100公里/小时", "130公里/小时", "160公里/小时", "190公里/小时"), "体育", "奥莱·贡纳尔·索尔斯克亚在补时阶段打入制胜球，帮助曼联在1999年欧冠决赛中击败拜仁慕尼黑夺冠。"),
            es = LocalizedContent("¿Cuál es el saque de voleibol más rápido jamás registrado?", listOf("100 km/h", "130 km/h", "160 km/h", "190 km/h"), "Deportes", "Ole Gunnar Solskjær marcó el gol decisivo en el tiempo añadido, permitiendo al Manchester United ganar la final de la Liga de Campeones de 1999 contra el Bayern de Múnich.")
        ),
        BilingualQuestion(
            id = 52011, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le temps record pour nager 100m?", listOf("45s", "48s", "50s", "52s"), "Sport", "Chelsea a remporté sa première Ligue des champions en 2012 en battant le Bayern Munich en finale, à l'Allianz Arena."),
            en = LocalizedContent("What is the record time for swimming 100m?", listOf("45s", "48s", "50s", "52s"), "Sports", "Chelsea won their first Champions League in 2012 by beating Bayern Munich in the final at the Allianz Arena."),
            zh = LocalizedContent("100米游泳的纪录时间是多少？", listOf("45秒", "48秒", "50秒", "52秒"), "体育", "切尔西在2012年首次赢得欧冠冠军，在安联球场决赛中击败拜仁慕尼黑。"),
            es = LocalizedContent("¿Cuál es el tiempo récord en natación para 100m?", listOf("45s", "48s", "50s", "52s"), "Deportes", "El Chelsea ganó su primera Liga de Campeones en 2012 al vencer al Bayern de Múnich en la final en el Allianz Arena.")
        ),
        BilingualQuestion(
            id = 52012, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand nombre de médailles remportées par un pays?", listOf("500", "1000", "2000", "3000"), "Sport", "Le FC Barcelone a remporté le match retour des huitièmes de finale de la Ligue des champions 2016-2017 sur le score de 6-1, permettant une victoire cumulée de 6-5 après une défaite 4-0 à l'aller."),
            en = LocalizedContent("What is the highest number of medals won by a country?", listOf("500", "1000", "2000", "3000"), "Sports", "FC Barcelona won the second leg of the 2016-2017 Champions League round of 16 with a score of 6-1, achieving a cumulative victory of 6-5 after a 4-0 loss in the first leg."),
            zh = LocalizedContent("一个国家获得的最多奖牌数是多少？", listOf("500", "1000", "2000", "3000"), "体育", "巴塞罗那在2016-2017赛季欧冠16强赛次回合以6-1获胜，在首回合0-4失利后以总比分6-5逆转晋级。"),
            es = LocalizedContent("¿Cuál es el mayor número de medallas ganadas por un país?", listOf("500", "1000", "2000", "3000"), "Deportes", "El FC Barcelona ganó el partido de vuelta de los octavos de final de la Liga de Campeones 2016-2017 por 6-1, logrando una victoria acumulada de 6-5 tras una derrota por 4-0 en la ida.")
        ),
        BilingualQuestion(
            id = 52013, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus jeune athlète à participer aux Jeux Olympiques?", listOf("10", "12", "14", "16"), "Sport", "Liverpool a remporté sa première Ligue des Champions en 1977 en battant le Borussia Mönchengladbach en finale à Rome, sous la direction de l'entraîneur Bob Paisley."),
            en = LocalizedContent("What is the youngest age of an athlete to participate in the Olympic Games?", listOf("10", "12", "14", "16"), "Sports", "Liverpool won their first Champions League in 1977 by beating Borussia Mönchengladbach in the final in Rome, under manager Bob Paisley."),
            zh = LocalizedContent("参加奥运会的最年轻运动员年龄是多少？", listOf("10", "12", "14", "16"), "体育", "利物浦在1977年首次赢得欧冠冠军，在罗马决赛中击败门兴格拉德巴赫，主教练是鲍勃·佩斯利。"),
            es = LocalizedContent("¿Cuál es la edad más joven de un atleta en participar en los Juegos Olímpicos?", listOf("10", "12", "14", "16"), "Deportes", "El Liverpool ganó su primera Liga de Campeones en 1977 al vencer al Borussia Mönchengladbach en la final en Roma, bajo la dirección del entrenador Bob Paisley.")
        ),
        BilingualQuestion(
            id = 52014, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus vieux athlète à participer aux Jeux Olympiques?", listOf("60", "70", "80", "90"), "Sport", "La finale de la Ligue des champions 2021 entre Manchester City et Chelsea s'est conclue sur le score de 1-0, sans qu'aucun penalty ne soit accordé. Le seul but de la rencontre a été inscrit par Kai Havertz à la 42e minute."),
            en = LocalizedContent("What is the oldest age of an athlete to participate in the Olympic Games?", listOf("60", "70", "80", "90"), "Sports", "The 2021 Champions League final between Manchester City and Chelsea ended with a score of 1-0, with no penalties awarded. The only goal was scored by Kai Havertz in the 42nd minute."),
            zh = LocalizedContent("参加奥运会的最年长运动员年龄是多少？", listOf("60", "70", "80", "90"), "体育", "2021年欧冠决赛曼城对阵切尔西以1-0结束，没有点球。唯一进球由凯·哈弗茨在第42分钟打入。"),
            es = LocalizedContent("¿Cuál es la edad más avanzada de un atleta en participar en los Juegos Olímpicos?", listOf("60", "70", "80", "90"), "Deportes", "La final de la Liga de Campeones 2021 entre el Manchester City y el Chelsea terminó con un marcador de 1-0, sin que se concediera ningún penalti. El único gol fue anotado por Kai Havertz en el minuto 42.")
        ),
        BilingualQuestion(
            id = 52015, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le sport le plus mortel au monde?", listOf("Escalade", "Base jump", "Surf de gros", "Free solo climbing"), "Sport", "Lors du quart de finale retour de la Ligue des champions 2020-2021, Leon Goretzka a marqué le but décisif pour le Bayern Munich contre la Juventus, permettant au club allemand de se qualifier pour les demi-finales."),
            en = LocalizedContent("What is the deadliest sport in the world?", listOf("Climbing", "Base jumping", "Big wave surfing", "Free solo climbing"), "Sports", "In the second leg of the 2020-2021 Champions League quarter-final, Leon Goretzka scored the decisive goal for Bayern Munich against Juventus, allowing the German club to qualify for the semi-finals."),
            zh = LocalizedContent("世界上最致命的运动是什么？", listOf("攀岩", "定点跳伞", "大浪冲浪", "徒手攀岩"), "体育", "在2020-2021赛季欧冠四分之一决赛次回合中，莱昂·戈雷茨卡为拜仁慕尼黑打入制胜球，帮助德甲俱乐部晋级半决赛。"),
            es = LocalizedContent("¿Cuál es el deporte más mortal del mundo?", listOf("Escalada", "Salto BASE", "Surf de olas grandes", "Escalada en solitario libre"), "Deportes", "En el partido de vuelta de los cuartos de final de la Liga de Campeones 2020-2021, Leon Goretzka marcó el gol decisivo para el Bayern de Múnich contra la Juventus, permitiendo al club alemán clasificarse para las semifinales.")
        ),
        BilingualQuestion(
            id = 52016, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le nombre de morts annuel en skateboard?", listOf("50", "200", "500", "1000"), "Sport", "Le stade San Siro de Milan a accueilli quatre finales de Ligue des Champions, un record partagé avec le Stade de France, le Stade olympique de Rome et le Stade du Wembley."),
            en = LocalizedContent("What is the annual number of deaths in skateboarding?", listOf("50", "200", "500", "1000"), "Sports", "The San Siro stadium in Milan has hosted four Champions League finals, a record shared with the Stade de France, the Stadio Olimpico in Rome, and Wembley Stadium."),
            zh = LocalizedContent("滑板运动每年的死亡人数是多少？", listOf("50", "200", "500", "1000"), "体育", "米兰的圣西罗球场曾举办过四场欧冠决赛，与法兰西体育场、罗马奥林匹克体育场和温布利球场共享纪录。"),
            es = LocalizedContent("¿Cuál es el número anual de muertes en skateboarding?", listOf("50", "200", "500", "1000"), "Deportes", "El estadio San Siro de Milán ha acogido cuatro finales de la Liga de Campeones, un récord compartido con el Stade de France, el Estadio Olímpico de Roma y el Estadio de Wembley.")
        ),
        BilingualQuestion(
            id = 52017, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le nombre de morts annuel au football?", listOf("50", "100", "500", "1000"), "Sport", "La finale 2020 de la Ligue des Champions s'est déroulée à Lisbonne, au Portugal, mais en raison de la pandémie de Covid-19, le format a été modifié et le match a eu lieu au Stade de la Luz."),
            en = LocalizedContent("What is the annual number of deaths in football?", listOf("50", "100", "500", "1000"), "Sports", "The 2020 Champions League final took place in Lisbon, Portugal, but due to the Covid-19 pandemic, the format was changed and the match was held at the Estádio da Luz."),
            zh = LocalizedContent("足球运动每年的死亡人数是多少？", listOf("50", "100", "500", "1000"), "体育", "2020年欧冠决赛在葡萄牙里斯本举行，但由于新冠疫情，赛制改变，比赛在光明球场进行。"),
            es = LocalizedContent("¿Cuál es el número anual de muertes en el fútbol?", listOf("50", "100", "500", "1000"), "Deportes", "La final de la Liga de Campeones 2020 se celebró en Lisboa, Portugal, pero debido a la pandemia de Covid-19, el formato se modificó y el partido se disputó en el Estadio da Luz.")
        ),
        BilingualQuestion(
            id = 52018, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record de buts marqués en une épreuve de football?", listOf("10", "15", "20", "25"), "Sport", "Le Stade de France à Saint-Denis a été choisi pour accueillir la finale de la Ligue des champions 2022, initialement prévue à Saint-Pétersbourg mais déplacée en raison de l'invasion russe de l'Ukraine."),
            en = LocalizedContent("What is the record for goals scored in a single football tournament?", listOf("10", "15", "20", "25"), "Sports", "The Stade de France in Saint-Denis was chosen to host the 2022 Champions League final, originally scheduled for Saint Petersburg but moved due to the Russian invasion of Ukraine."),
            zh = LocalizedContent("单届足球赛事进球纪录是多少？", listOf("10", "15", "20", "25"), "体育", "圣但尼的法兰西体育场被选为2022年欧冠决赛举办地，原定在圣彼得堡，但因俄罗斯入侵乌克兰而更改。"),
            es = LocalizedContent("¿Cuál es el récord de goles marcados en un solo torneo de fútbol?", listOf("10", "15", "20", "25"), "Deportes", "El Stade de France en Saint-Denis fue elegido para albergar la final de la Liga de Campeones 2022, originalmente prevista en San Petersburgo pero trasladada debido a la invasión rusa de Ucrania.")
        ),
        BilingualQuestion(
            id = 52019, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand nombre de spectateurs à un événement sportif?", listOf("100000", "500000", "1 million", "10 millions"), "Sport", "Ce record a été établi par Erling Haaland avec Manchester City lors de la saison 2022-2023, où il a inscrit 15 buts en phase de groupes."),
            en = LocalizedContent("What is the largest number of spectators at a sporting event?", listOf("100000", "500000", "1 million", "10 million"), "Sports", "This record was set by Erling Haaland with Manchester City during the 2022-2023 season, where he scored 15 goals in the group stage."),
            zh = LocalizedContent("体育赛事观众人数最多是多少？", listOf("10万", "50万", "100万", "1000万"), "体育", "这一纪录由埃尔林·哈兰德在2022-2023赛季代表曼城创造，他在小组赛阶段打入15球。"),
            es = LocalizedContent("¿Cuál es el mayor número de espectadores en un evento deportivo?", listOf("100000", "500000", "1 millón", "10 millones"), "Deportes", "Este récord fue establecido por Erling Haaland con el Manchester City durante la temporada 2022-2023, donde marcó 15 goles en la fase de grupos.")
        ),
        BilingualQuestion(
            id = 52020, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand festival sportif mondiaux?", listOf("Olympic", "World Cup", "Commonwealth Games", "Asian Games"), "Sport", "La Juventus a disputé sept finales de Ligue des Champions, la dernière en 2017, mais n'en a remporté que deux, en 1985 et 1996."),
            en = LocalizedContent("What is the biggest global sports festival?", listOf("Olympic Games", "World Cup", "Commonwealth Games", "Asian Games"), "Sports", "The Olympic Games are the largest international multi-sport event, featuring thousands of athletes from around the world."),
            zh = LocalizedContent("全球最大的体育盛事是什么？", listOf("奥运会", "世界杯", "英联邦运动会", "亚运会"), "体育", "奥运会是最大的国际综合性体育赛事，汇聚了来自世界各地的数千名运动员。"),
            es = LocalizedContent("¿Cuál es el mayor festival deportivo mundial?", listOf("Juegos Olímpicos", "Copa Mundial", "Juegos de la Commonwealth", "Juegos Asiáticos"), "Deportes", "Los Juegos Olímpicos son el mayor evento multideportivo internacional, con miles de atletas de todo el mundo.")
        ),
        BilingualQuestion(
            id = 52021, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand nombre de participants à un marathon?", listOf("10000", "50000", "100000", "500000"), "Sport", "Le Real Madrid détient le record avec 15 titres de Ligue des Champions, le dernier remporté en 2024 face au Borussia Dortmund."),
            en = LocalizedContent("What is the largest number of participants in a marathon?", listOf("10000", "50000", "100000", "500000"), "Sports", "The New York City Marathon holds the record with over 50,000 finishers in 2019."),
            zh = LocalizedContent("一场马拉松的最大参赛人数是多少？", listOf("10000", "50000", "100000", "500000"), "体育", "纽约马拉松保持着纪录，2019年有超过5万人完赛。"),
            es = LocalizedContent("¿Cuál es el mayor número de participantes en un maratón?", listOf("10000", "50000", "100000", "500000"), "Deportes", "El Maratón de Nueva York tiene el récord con más de 50,000 finalistas en 2019.")
        ),
        BilingualQuestion(
            id = 52022, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record du monde du lancer de poids?", listOf("20m", "23m", "24m", "25m"), "Sport", "Cristiano Ronaldo a marqué 17 buts lors de la saison 2013-2014, un record absolu sur une seule édition de la compétition."),
            en = LocalizedContent("What is the world record in shot put?", listOf("20m", "23m", "24m", "25m"), "Sports", "The men's world record is 23.37m by Ryan Crouser in 2023."),
            zh = LocalizedContent("铅球的世界纪录是多少？", listOf("20米", "23米", "24米", "25米"), "体育", "男子世界纪录是瑞安·克劳瑟在2023年创造的23.37米。"),
            es = LocalizedContent("¿Cuál es el récord mundial de lanzamiento de peso?", listOf("20m", "23m", "24m", "25m"), "Deportes", "El récord mundial masculino es de 23.37 m por Ryan Crouser en 2023.")
        ),
        BilingualQuestion(
            id = 52023, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record du monde du saut à la perche?", listOf("5.90m", "6.00m", "6.10m", "6.20m"), "Sport", "Le FC Barcelone a remporté sa première Ligue des champions en 1992 et sa dernière en 2015, avec des victoires également en 2006, 2009 et 2011."),
            en = LocalizedContent("What is the world record in pole vault?", listOf("5.90m", "6.00m", "6.10m", "6.20m"), "Sports", "The men's world record is 6.23m by Armand Duplantis in 2023."),
            zh = LocalizedContent("撑杆跳高的世界纪录是多少？", listOf("5.90米", "6.00米", "6.10米", "6.20米"), "体育", "男子世界纪录是阿曼德·杜普兰蒂斯在2023年创造的6.23米。"),
            es = LocalizedContent("¿Cuál es el récord mundial de salto con pértiga?", listOf("5.90m", "6.00m", "6.10m", "6.20m"), "Deportes", "El récord mundial masculino es de 6.23 m por Armand Duplantis en 2023.")
        ),
        BilingualQuestion(
            id = 52024, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand nombre de buts en une finale de Coupe du Monde?", listOf("5", "6", "7", "8"), "Sport", "Le Real Madrid a réalisé cet exploit unique en remportant la Coupe aux grandes oreilles de 1956 à 1960, soit les cinq premières éditions de la compétition."),
            en = LocalizedContent("What is the highest number of goals in a World Cup final?", listOf("5", "6", "7", "8"), "Sports", "The 1958 final had 5 goals (Brazil 5-2 Sweden)."),
            zh = LocalizedContent("世界杯决赛中进球最多的是多少？", listOf("5", "6", "7", "8"), "体育", "1958年决赛有5个进球（巴西5-2瑞典）。"),
            es = LocalizedContent("¿Cuál es el mayor número de goles en una final de la Copa Mundial?", listOf("5", "6", "7", "8"), "Deportes", "La final de 1958 tuvo 5 goles (Brasil 5-2 Suecia).")
        ),
        BilingualQuestion(
            id = 52025, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand nombre de cartons jaunes donnés en une finale?", listOf("5", "10", "15", "20"), "Sport", "Le Real Madrid a remporté ses cinq premières Ligues des Champions entre 1956 et 1960, soit au XXe siècle, avant les années 1960."),
            en = LocalizedContent("What is the highest number of yellow cards given in a final?", listOf("5", "10", "15", "20"), "Sports", "The 2010 World Cup final had 14 yellow cards."),
            zh = LocalizedContent("一场决赛中出示黄牌最多的是多少？", listOf("5", "10", "15", "20"), "体育", "2010年世界杯决赛有14张黄牌。"),
            es = LocalizedContent("¿Cuál es el mayor número de tarjetas amarillas en una final?", listOf("5", "10", "15", "20"), "Deportes", "La final de la Copa Mundial de 2010 tuvo 14 tarjetas amarillas.")
        ),
        BilingualQuestion(
            id = 52026, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le film le plus regardé de tous les temps?", listOf("Titanic", "Avatar", "Avengers", "Inception"), "Cinéma", "Le 14 août 2020, le FC Barcelone a subi une défaite historique 8-2 contre le Bayern Munich en quart de finale de la Ligue des Champions, marquant la plus large défaite du club dans la compétition."),
            en = LocalizedContent("What is the most watched film of all time?", listOf("Titanic", "Avatar", "Avengers", "Inception"), "Cinema", "Avatar is the highest-grossing film worldwide, but Titanic had more ticket sales initially."),
            zh = LocalizedContent("有史以来观看人数最多的电影是哪一部？", listOf("泰坦尼克号", "阿凡达", "复仇者联盟", "盗梦空间"), "电影", "《阿凡达》是全球票房最高的电影，但《泰坦尼克号》最初的售票量更多。"),
            es = LocalizedContent("¿Cuál es la película más vista de todos los tiempos?", listOf("Titanic", "Avatar", "Avengers", "Inception"), "Cine", "Avatar es la película más taquillera del mundo, pero Titanic tuvo más ventas de entradas inicialmente.")
        ),
        BilingualQuestion(
            id = 52027, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Combien de milliards de dollars Avatar a-t-il rapporté?", listOf("1", "2", "2.9", "3.5"), "Cinéma", "Manchester City a remporté sa première Ligue des Champions en 2023, en battant l'Inter Milan 1-0 en finale à Istanbul."),
            en = LocalizedContent("How many billions of dollars did Avatar gross?", listOf("1", "2", "2.9", "3.5"), "Cinema", "Avatar grossed over $2.9 billion worldwide."),
            zh = LocalizedContent("《阿凡达》的票房是多少亿美元？", listOf("10", "20", "29", "35"), "电影", "《阿凡达》全球票房超过29亿美元。"),
            es = LocalizedContent("¿Cuántos miles de millones de dólares recaudó Avatar?", listOf("1", "2", "2.9", "3.5"), "Cine", "Avatar recaudó más de 2.9 mil millones de dólares en todo el mundo.")
        ),
        BilingualQuestion(
            id = 52028, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le film de cinéma le plus ancien?", listOf("Lumière", "Méliès", "Edison", "Godard"), "Cinéma", "Cristiano Ronaldo détient ce record grâce à son efficacité légendaire en phase de groupes et à élimination directe, totalisant 37 doublés en Ligue des Champions, soit sept de plus que Lionel Messi."),
            en = LocalizedContent("What is the oldest film in cinema?", listOf("Lumière", "Méliès", "Edison", "Godard"), "Cinema", "The Lumière brothers' 'Workers Leaving the Lumière Factory' (1895) is considered the first film."),
            zh = LocalizedContent("电影史上最古老的影片是哪一部？", listOf("卢米埃尔", "梅里爱", "爱迪生", "戈达尔"), "电影", "卢米埃尔兄弟的《工厂大门》（1895年）被认为是第一部电影。"),
            es = LocalizedContent("¿Cuál es la película más antigua del cine?", listOf("Lumière", "Méliès", "Edison", "Godard"), "Cine", "La película 'La salida de los obreros de la fábrica' (1895) de los hermanos Lumière es considerada la primera.")
        ),
        BilingualQuestion(
            id = 52029, correctIndex = 3, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le premier film de Chaplin?", listOf("Gold Rush", "Moderniste", "Kid", "Tramp"), "Cinéma", "Bob Paisley a remporté la Ligue des Champions à trois reprises avec Liverpool, en 1977, 1978 et 1981, ce qui fait de lui l'un des entraîneurs les plus titrés de l'histoire de la compétition."),
            en = LocalizedContent("What was Chaplin's first film?", listOf("Gold Rush", "Modern Times", "The Kid", "The Tramp"), "Cinema", "Chaplin's first film was 'Making a Living' (1914), but his iconic character debuted in 'Kid Auto Races at Venice'."),
            zh = LocalizedContent("卓别林的第一部电影是哪一部？", listOf("淘金记", "摩登时代", "寻子遇仙记", "流浪汉"), "电影", "卓别林的第一部电影是《谋生》（1914年），但他的标志性角色首次出现在《威尼斯儿童赛车》中。"),
            es = LocalizedContent("¿Cuál fue la primera película de Chaplin?", listOf("La quimera del oro", "Tiempos modernos", "El chico", "El vagabundo"), "Cine", "La primera película de Chaplin fue 'Making a Living' (1914), pero su personaje icónico debutó en 'Kid Auto Races at Venice'.")
        ),
        BilingualQuestion(
            id = 52030, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel entraîneur a remporté la Ligue des Champions avec deux clubs différents?", listOf("Carlo Ancelotti", "José Mourinho", "Zinédine Zidane", "Luis Enrique"), "Champions League", "José Mourinho a remporté la Ligue des Champions avec le FC Porto en 2004 et l'Inter Milan en 2010."),
            en = LocalizedContent("Which coach has won the Champions League with two different clubs?", listOf("Carlo Ancelotti", "José Mourinho", "Zinédine Zidane", "Luis Enrique"), "Champions League", "José Mourinho won the Champions League with FC Porto in 2004 and Inter Milan in 2010."),
            zh = LocalizedContent("哪位教练曾带领两支不同的俱乐部赢得欧冠冠军？", listOf("卡洛·安切洛蒂", "何塞·穆里尼奥", "齐内丁·齐达内", "路易斯·恩里克"), "欧冠联赛", "何塞·穆里尼奥在2004年带领波尔图、2010年带领国际米兰赢得欧冠冠军。"),
            es = LocalizedContent("¿Qué entrenador ha ganado la Liga de Campeones con dos clubes diferentes?", listOf("Carlo Ancelotti", "José Mourinho", "Zinédine Zidane", "Luis Enrique"), "Champions League", "José Mourinho ganó la Liga de Campeones con el FC Porto en 2004 y con el Inter de Milán en 2010.")
        ),
        BilingualQuestion(
            id = 52031, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Combien de millions de dollars a coûté Avatar 2?", listOf("250", "350", "450", "550"), "Cinéma", "Zidane a remporté sa première Ligue des Champions en tant qu'entraîneur du Real Madrid en 2016, après avoir pris les rênes de l'équipe en janvier de la même année."),
            en = LocalizedContent("How many millions of dollars did Avatar 2 cost?", listOf("250", "350", "450", "550"), "Cinema", "Zidane won his first Champions League as coach of Real Madrid in 2016, after taking over the team in January of the same year."),
            zh = LocalizedContent("《阿凡达2》的制作成本是多少百万美元？", listOf("250", "350", "450", "550"), "电影", "齐达内在2016年作为皇家马德里主教练赢得了他的第一座欧冠冠军，他于同年1月接手球队。"),
            es = LocalizedContent("¿Cuántos millones de dólares costó Avatar 2?", listOf("250", "350", "450", "550"), "Cine", "Zidane ganó su primera Liga de Campeones como entrenador del Real Madrid en 2016, tras hacerse cargo del equipo en enero del mismo año.")
        ),
        BilingualQuestion(
            id = 52032, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le film le plus nul jamais produit?", listOf("Room", "Disaster Movie", "Gigli", "Battlefield Earth"), "Cinéma", "Iker Casillas a réalisé 59 clean sheets en Ligue des Champions, un record qu'il détient devant Gianluigi Buffon et Manuel Neuer, principalement grâce à ses longues années au Real Madrid et au FC Porto."),
            en = LocalizedContent("What is the worst movie ever produced?", listOf("Room", "Disaster Movie", "Gigli", "Battlefield Earth"), "Cinema", "Iker Casillas achieved 59 clean sheets in the Champions League, a record he holds ahead of Gianluigi Buffon and Manuel Neuer, mainly due to his long years at Real Madrid and FC Porto."),
            zh = LocalizedContent("有史以来最烂的电影是哪一部？", listOf("《房间》", "《灾难电影》", "《吉格利》", "《地球战场》"), "电影", "伊克尔·卡西利亚斯在欧冠中保持了59场零封，这一纪录领先于吉安路易吉·布冯和曼努埃尔·诺伊尔，主要得益于他在皇家马德里和波尔图的多年效力。"),
            es = LocalizedContent("¿Cuál es la peor película jamás producida?", listOf("Room", "Disaster Movie", "Gigli", "Battlefield Earth"), "Cine", "Iker Casillas logró 59 porterías a cero en la Liga de Campeones, un récord que mantiene por delante de Gianluigi Buffon y Manuel Neuer, principalmente gracias a sus largos años en el Real Madrid y el FC Porto.")
        ),
        BilingualQuestion(
            id = 52033, correctIndex = 3, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quelle note IMDb a Battlefield Earth?", listOf("1.0", "2.5", "3.5", "4.5"), "Cinéma", "Sergio Ramos a remporté la Ligue des Champions à quatre reprises avec le Real Madrid (2014, 2016, 2017, 2018) et une fois avec le Paris Saint-Germain en 2020, totalisant cinq titres."),
            en = LocalizedContent("What is the IMDb rating of Battlefield Earth?", listOf("1.0", "2.5", "3.5", "4.5"), "Cinema", "Sergio Ramos won the Champions League four times with Real Madrid (2014, 2016, 2017, 2018) and once with Paris Saint-Germain in 2020, totaling five titles."),
            zh = LocalizedContent("《地球战场》的IMDb评分是多少？", listOf("1.0", "2.5", "3.5", "4.5"), "电影", "塞尔吉奥·拉莫斯随皇家马德里四次赢得欧冠冠军（2014、2016、2017、2018），并在2020年随巴黎圣日耳曼赢得一次，共五次夺冠。"),
            es = LocalizedContent("¿Qué puntuación en IMDb tiene Battlefield Earth?", listOf("1.0", "2.5", "3.5", "4.5"), "Cine", "Sergio Ramos ganó la Liga de Campeones cuatro veces con el Real Madrid (2014, 2016, 2017, 2018) y una vez con el Paris Saint-Germain en 2020, totalizando cinco títulos.")
        ),
        BilingualQuestion(
            id = 52034, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel défenseur central a remporté le plus de Ligues des Champions?", listOf("Sergio Ramos", "Rio Ferdinand", "Fabio Cannavaro", "Pepe"), "Champions League", "Sergio Ramos a remporté quatre Ligues des Champions avec le Real Madrid (2014, 2016, 2017, 2018), un record pour un défenseur central."),
            en = LocalizedContent("Which center-back has won the most Champions Leagues?", listOf("Sergio Ramos", "Rio Ferdinand", "Fabio Cannavaro", "Pepe"), "Champions League", "Sergio Ramos has won four Champions Leagues with Real Madrid (2014, 2016, 2017, 2018), a record for a center-back."),
            zh = LocalizedContent("哪位中后卫赢得欧冠冠军次数最多？", listOf("塞尔吉奥·拉莫斯", "里奥·费迪南德", "法比奥·卡纳瓦罗", "佩佩"), "欧冠联赛", "塞尔吉奥·拉莫斯随皇家马德里四次赢得欧冠冠军（2014、2016、2017、2018），这是中后卫的纪录。"),
            es = LocalizedContent("¿Qué defensa central ha ganado más Ligas de Campeones?", listOf("Sergio Ramos", "Rio Ferdinand", "Fabio Cannavaro", "Pepe"), "Champions League", "Sergio Ramos ha ganado cuatro Ligas de Campeones con el Real Madrid (2014, 2016, 2017, 2018), un récord para un defensa central.")
        ),
        BilingualQuestion(
            id = 52035, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Combien d'Oscars Katharine Hepburn a-t-elle remportés?", listOf("3", "4", "5", "6"), "Cinéma", "Zinédine Zidane a été expulsé en finale de la Ligue des champions 2006 pour un coup de tête sur Marco Materazzi, après une provocation de ce dernier."),
            en = LocalizedContent("How many Oscars did Katharine Hepburn win?", listOf("3", "4", "5", "6"), "Cinema", "Zinédine Zidane was sent off in the 2006 Champions League final for headbutting Marco Materazzi after a provocation from the latter."),
            zh = LocalizedContent("凯瑟琳·赫本赢得了多少座奥斯卡奖？", listOf("3", "4", "5", "6"), "电影", "齐内丁·齐达内在2006年欧冠决赛中因头顶马尔科·马特拉齐而被罚下，后者此前有挑衅行为。"),
            es = LocalizedContent("¿Cuántos Oscar ganó Katharine Hepburn?", listOf("3", "4", "5", "6"), "Cine", "Zinédine Zidane fue expulsado en la final de la Liga de Campeones de 2006 por un cabezazo a Marco Materazzi tras una provocación de este último.")
        ),
        BilingualQuestion(
            id = 52036, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le premier film de blockbuster?", listOf("Jaws", "Star Wars", "Superman", "E.T."), "Cinéma", "La VAR a été utilisée pour la première fois en finale de Ligue des Champions en 2019, lors du match entre Liverpool et Tottenham, après son introduction progressive dans la compétition."),
            en = LocalizedContent("What is the first blockbuster movie?", listOf("Jaws", "Star Wars", "Superman", "E.T."), "Cinema", "VAR was used for the first time in a Champions League final in 2019, during the match between Liverpool and Tottenham, after its gradual introduction in the competition."),
            zh = LocalizedContent("第一部大片电影是什么？", listOf("《大白鲨》", "《星球大战》", "《超人》", "《E.T.外星人》"), "电影", "VAR在2019年首次在欧冠决赛中使用，当时是利物浦对阵托特纳姆热刺的比赛，此前VAR已在比赛中逐步引入。"),
            es = LocalizedContent("¿Cuál es la primera película blockbuster?", listOf("Jaws", "Star Wars", "Superman", "E.T."), "Cine", "El VAR se utilizó por primera vez en una final de la Liga de Campeones en 2019, durante el partido entre Liverpool y Tottenham, tras su introducción gradual en la competición.")
        ),
        BilingualQuestion(
            id = 52037, correctIndex = 3, difficulty = Difficulty.EASY,
            fr = LocalizedContent("En quelle année Jaws a-t-il été sorti?", listOf("1973", "1975", "1977", "1979"), "Cinéma", "Kylian Mbappé avait 22 ans lors de la finale de la Coupe du Monde 2022, où il a marqué un triplé pour la France contre l'Argentine."),
            en = LocalizedContent("In what year was Jaws released?", listOf("1973", "1975", "1977", "1979"), "Cinema", "Kylian Mbappé was 22 years old during the 2022 World Cup final, where he scored a hat-trick for France against Argentina."),
            zh = LocalizedContent("《大白鲨》是哪一年上映的？", listOf("1973", "1975", "1977", "1979"), "电影", "基利安·姆巴佩在2022年世界杯决赛时22岁，他在那场比赛中为法国队对阵阿根廷上演了帽子戏法。"),
            es = LocalizedContent("¿En qué año se estrenó Jaws?", listOf("1973", "1975", "1977", "1979"), "Cine", "Kylian Mbappé tenía 22 años durante la final de la Copa del Mundo 2022, donde marcó un triplete para Francia contra Argentina.")
        ),
        BilingualQuestion(
            id = 52038, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le plus grand budget de film?", listOf("200 millions", "300 millions", "400 millions", "500 millions"), "Cinéma", "Kylian Mbappé a marqué pour Monaco en finale de la Ligue des champions 2017 face au Real Madrid, à seulement 18 ans et 160 jours."),
            en = LocalizedContent("What is the largest movie budget?", listOf("200 million", "300 million", "400 million", "500 million"), "Cinema", "Kylian Mbappé scored for Monaco in the 2017 Champions League final against Real Madrid, at just 18 years and 160 days old."),
            zh = LocalizedContent("最大的电影预算是多少？", listOf("2亿", "3亿", "4亿", "5亿"), "电影", "基利安·姆巴佩在2017年欧冠决赛中为摩纳哥对阵皇家马德里进球，当时他年仅18岁零160天。"),
            es = LocalizedContent("¿Cuál es el mayor presupuesto de una película?", listOf("200 millones", "300 millones", "400 millones", "500 millones"), "Cine", "Kylian Mbappé marcó para el Mónaco en la final de la Liga de Campeones 2017 contra el Real Madrid, con solo 18 años y 160 días.")
        ),
        BilingualQuestion(
            id = 52039, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel film a le plus grand nombre de bégaiements?", listOf("King's Speech", "Rainman", "Forrest Gump", "Juno"), "Cinéma", "David Beckham détient ce record avec 36 passes décisives, accumulées principalement lors de ses passages au Real Madrid et à Manchester United."),
            en = LocalizedContent("Which movie has the most stuttering?", listOf("King's Speech", "Rainman", "Forrest Gump", "Juno"), "Cinema", "David Beckham holds this record with 36 assists, accumulated mainly during his time at Real Madrid and Manchester United."),
            zh = LocalizedContent("哪部电影中口吃出现次数最多？", listOf("《国王的演讲》", "《雨人》", "《阿甘正传》", "《朱诺》"), "电影", "大卫·贝克汉姆以36次助攻保持这一纪录，主要是在皇家马德里和曼联期间积累的。"),
            es = LocalizedContent("¿Qué película tiene la mayor cantidad de tartamudeos?", listOf("King's Speech", "Rainman", "Forrest Gump", "Juno"), "Cine", "David Beckham tiene este récord con 36 asistencias, acumuladas principalmente durante su paso por el Real Madrid y el Manchester United.")
        ),
        BilingualQuestion(
            id = 52040, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le réalisateur ayant remporté le plus d'Oscars?", listOf("Spielberg", "Lucas", "Kubrick", "William Wyler"), "Cinéma", "Karim Benzema a délivré trois passes décisives en finale de Ligue des Champions (2018, 2022, 2024), un record partagé avec Cristiano Ronaldo."),
            en = LocalizedContent("Which director has won the most Oscars?", listOf("Spielberg", "Lucas", "Kubrick", "William Wyler"), "Cinema", "Karim Benzema delivered three assists in Champions League finals (2018, 2022, 2024), a record shared with Cristiano Ronaldo."),
            zh = LocalizedContent("哪位导演获得奥斯卡奖最多？", listOf("斯皮尔伯格", "卢卡斯", "库布里克", "威廉·惠勒"), "电影", "卡里姆·本泽马在欧冠决赛中送出三次助攻（2018、2022、2024），与克里斯蒂亚诺·罗纳尔多共享纪录。"),
            es = LocalizedContent("¿Qué director ha ganado más premios Oscar?", listOf("Spielberg", "Lucas", "Kubrick", "William Wyler"), "Cine", "Karim Benzema dio tres asistencias en finales de la Champions League (2018, 2022, 2024), un récord compartido con Cristiano Ronaldo.")
        ),
        BilingualQuestion(
            id = 52041, correctIndex = 3, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Combien d'Oscars William Wyler a-t-il remportés?", listOf("2", "3", "4", "5"), "Cinéma", "Chelsea a terminé 6e de Premier League en 2012, son plus mauvais classement depuis 2002, mais a battu le Bayern Munich en finale de la Ligue des Champions à l'Allianz Arena."),
            en = LocalizedContent("How many Oscars did William Wyler win?", listOf("2", "3", "4", "5"), "Cinema", "Chelsea finished 6th in the Premier League in 2012, their worst ranking since 2002, but beat Bayern Munich in the Champions League final at the Allianz Arena."),
            zh = LocalizedContent("威廉·惠勒获得了多少奥斯卡奖？", listOf("2", "3", "4", "5"), "电影", "切尔西在2012年英超联赛中排名第六，是自2002年以来的最差排名，但在安联球场的欧冠决赛中击败了拜仁慕尼黑。"),
            es = LocalizedContent("¿Cuántos premios Oscar ganó William Wyler?", listOf("2", "3", "4", "5"), "Cine", "El Chelsea terminó 6º en la Premier League en 2012, su peor clasificación desde 2002, pero venció al Bayern Múnich en la final de la Champions League en el Allianz Arena.")
        ),
        BilingualQuestion(
            id = 52042, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le plus long film jamais produit?", listOf("500 heures", "1000 heures", "2000 heures", "5000 heures"), "Cinéma", "Le Paris Saint-Germain a disputé sa première finale de Ligue des champions en 2020, s'inclinant 1-0 face au Bayern Munich à Lisbonne."),
            en = LocalizedContent("What is the longest film ever produced?", listOf("500 hours", "1000 hours", "2000 hours", "5000 hours"), "Cinema", "Paris Saint-Germain played its first Champions League final in 2020, losing 1-0 to Bayern Munich in Lisbon."),
            zh = LocalizedContent("有史以来最长的电影是什么？", listOf("500小时", "1000小时", "2000小时", "5000小时"), "电影", "巴黎圣日耳曼在2020年首次进入欧冠决赛，在里斯本0-1输给拜仁慕尼黑。"),
            es = LocalizedContent("¿Cuál es la película más larga jamás producida?", listOf("500 horas", "1000 horas", "2000 horas", "5000 horas"), "Cine", "El Paris Saint-Germain disputó su primera final de la Champions League en 2020, perdiendo 1-0 ante el Bayern Múnich en Lisboa.")
        ),
        BilingualQuestion(
            id = 52043, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel film a eu le plus de remakes?", listOf("Psycho", "King Kong", "Dracula", "Samuraï"), "Cinéma", "Cristiano Ronaldo détient le record du meilleur buteur de l'histoire de la Ligue des Champions avec 140 buts, marqués lors de ses passages au Sporting Portugal, Manchester United, Real Madrid et Juventus Turin."),
            en = LocalizedContent("Which film has had the most remakes?", listOf("Psycho", "King Kong", "Dracula", "Samurai"), "Cinema", "Cristiano Ronaldo holds the record for the top scorer in Champions League history with 140 goals, scored during his spells at Sporting Portugal, Manchester United, Real Madrid, and Juventus Turin."),
            zh = LocalizedContent("哪部电影被翻拍次数最多？", listOf("惊魂记", "金刚", "德古拉", "七武士"), "电影", "克里斯蒂亚诺·罗纳尔多以140个进球保持欧冠历史最佳射手纪录，这些进球是在葡萄牙体育、曼联、皇家马德里和尤文图斯期间打入的。"),
            es = LocalizedContent("¿Qué película ha tenido más remakes?", listOf("Psicosis", "King Kong", "Drácula", "Samurái"), "Cine", "Cristiano Ronaldo posee el récord de máximo goleador en la historia de la Champions League con 140 goles, marcados durante sus etapas en Sporting de Portugal, Manchester United, Real Madrid y Juventus de Turín.")
        ),
        BilingualQuestion(
            id = 52044, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Combien de remakes Dracula a-t-il eus?", listOf("50", "100", "200", "500"), "Cinéma", "Le Real Madrid a établi ce record de 15 victoires consécutives en Ligue des Champions entre 2014 et 2015, sous la direction de Carlo Ancelotti."),
            en = LocalizedContent("How many remakes has Dracula had?", listOf("50", "100", "200", "500"), "Cinema", "Real Madrid set this record of 15 consecutive wins in the Champions League between 2014 and 2015, under the direction of Carlo Ancelotti."),
            zh = LocalizedContent("德古拉有多少部翻拍作品？", listOf("50", "100", "200", "500"), "电影", "皇家马德里在2014年至2015年间创造了欧冠15连胜的纪录，由卡洛·安切洛蒂执教。"),
            es = LocalizedContent("¿Cuántos remakes ha tenido Drácula?", listOf("50", "100", "200", "500"), "Cine", "El Real Madrid estableció este récord de 15 victorias consecutivas en la Champions League entre 2014 y 2015, bajo la dirección de Carlo Ancelotti.")
        ),
        BilingualQuestion(
            id = 52045, correctIndex = 3, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le plus grand nombre de prequels et sequels?", listOf("Star Wars", "Fast Furious", "Marvel", "Aucun"), "Cinéma", "Karim Benzema a été nommé meilleur joueur en finale de la Ligue des Champions à deux reprises, en 2022 et 2024, un record partagé avec d'autres légendes."),
            en = LocalizedContent("Which has the most prequels and sequels?", listOf("Star Wars", "Fast & Furious", "Marvel", "None"), "Cinema", "Karim Benzema was named best player in the Champions League final twice, in 2022 and 2024, a record shared with other legends."),
            zh = LocalizedContent("哪个系列的前传和续集最多？", listOf("星球大战", "速度与激情", "漫威", "无"), "电影", "卡里姆·本泽马两次被评为欧冠决赛最佳球员（2022和2024），与其他传奇人物共享纪录。"),
            es = LocalizedContent("¿Cuál tiene más precuelas y secuelas?", listOf("Star Wars", "Fast & Furious", "Marvel", "Ninguno"), "Cine", "Karim Benzema fue nombrado mejor jugador de la final de la Champions League en dos ocasiones, en 2022 y 2024, un récord compartido con otras leyendas.")
        ),
        BilingualQuestion(
            id = 52046, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Combien de films Fast Furious existent?", listOf("5", "8", "10", "15"), "Cinéma", "Nottingham Forest a remporté la Ligue des Champions en 1979, sous la direction de l'entraîneur Brian Clough, puis a récidivé l'année suivante en 1980."),
            en = LocalizedContent("How many Fast & Furious films exist?", listOf("5", "8", "10", "15"), "Cinema", "Nottingham Forest won the Champions League in 1979, under manager Brian Clough, and repeated the feat the following year in 1980."),
            zh = LocalizedContent("速度与激情系列有多少部电影？", listOf("5", "8", "10", "15"), "电影", "诺丁汉森林在1979年赢得欧冠冠军，由主教练布莱恩·克拉夫执教，并在次年1980年再次夺冠。"),
            es = LocalizedContent("¿Cuántas películas de Fast & Furious existen?", listOf("5", "8", "10", "15"), "Cine", "El Nottingham Forest ganó la Champions League en 1979, bajo la dirección del entrenador Brian Clough, y repitió el éxito al año siguiente en 1980.")
        ),
        BilingualQuestion(
            id = 52047, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le plus court film de cinéma?", listOf("1 seconde", "10 secondes", "1 minute", "5 minutes"), "Cinéma", "Chelsea a remporté la Ligue des Champions en 2012 malgré un budget inférieur à celui des géants européens comme le Real Madrid ou Barcelone, grâce à une performance défensive solide et un but décisif de Didier Drogba en finale contre le Bayern Munich."),
            en = LocalizedContent("What is the shortest film in cinema?", listOf("1 second", "10 seconds", "1 minute", "5 minutes"), "Cinema", "Chelsea won the Champions League in 2012 despite a lower budget than European giants like Real Madrid or Barcelona, thanks to a solid defensive performance and a decisive goal by Didier Drogba in the final against Bayern Munich."),
            zh = LocalizedContent("电影史上最短的电影是什么？", listOf("1秒", "10秒", "1分钟", "5分钟"), "电影", "切尔西在2012年赢得欧冠冠军，尽管预算低于皇家马德里或巴塞罗那等欧洲豪门，这得益于稳固的防守和迪迪埃·德罗巴在决赛对阵拜仁慕尼黑时的决定性进球。"),
            es = LocalizedContent("¿Cuál es la película más corta del cine?", listOf("1 segundo", "10 segundos", "1 minuto", "5 minutos"), "Cine", "El Chelsea ganó la Champions League en 2012 a pesar de tener un presupuesto inferior al de gigantes europeos como el Real Madrid o el Barcelona, gracias a una sólida actuación defensiva y un gol decisivo de Didier Drogba en la final contra el Bayern Múnich.")
        ),
        BilingualQuestion(
            id = 52048, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le film d'horreur le plus sanglant?", listOf("Hostel", "Saw", "Human Centipede", "Cannibal Holocaust"), "Cinéma", "La Ligue des Champions a adopté son nouveau format avec une phase de ligue unique de 36 équipes à partir de la saison 2024-2025, remplaçant l'ancienne phase de groupes."),
            en = LocalizedContent("What is the bloodiest horror film?", listOf("Hostel", "Saw", "Human Centipede", "Cannibal Holocaust"), "Cinema", "The Champions League adopted its new format with a single league phase of 36 teams starting from the 2024-2025 season, replacing the old group stage."),
            zh = LocalizedContent("最血腥的恐怖片是哪部？", listOf("人皮客栈", "电锯惊魂", "人体蜈蚣", "食人族大屠杀"), "电影", "欧冠从2024-2025赛季开始采用新赛制，由36支球队组成单一联赛阶段，取代了旧的小组赛。"),
            es = LocalizedContent("¿Cuál es la película de terror más sangrienta?", listOf("Hostel", "Saw", "El ciempiés humano", "Holocausto caníbal"), "Cine", "La Champions League adoptó su nuevo formato con una fase de liga única de 36 equipos a partir de la temporada 2024-2025, reemplazando la antigua fase de grupos.")
        ),
        BilingualQuestion(
            id = 52049, correctIndex = 3, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le film ayant le plus de plan?", listOf("1000", "2000", "5000", "10000"), "Cinéma", "À partir de la saison 2024-2025, la phase de groupes de la Ligue des Champions passe de 32 à 36 équipes, avec un nouveau format en un seul championnat."),
            en = LocalizedContent("Which film has the most shots?", listOf("1000", "2000", "5000", "10000"), "Cinema", "Starting from the 2024-2025 season, the Champions League group stage expands from 32 to 36 teams, with a new single-league format."),
            zh = LocalizedContent("哪部电影的镜头数最多？", listOf("1000", "2000", "5000", "10000"), "电影", "从2024-2025赛季开始，欧冠小组赛从32支球队扩大到36支，采用新的单一联赛形式。"),
            es = LocalizedContent("¿Qué película tiene más planos?", listOf("1000", "2000", "5000", "10000"), "Cine", "A partir de la temporada 2024-2025, la fase de grupos de la Champions League se expande de 32 a 36 equipos, con un nuevo formato de liga única.")
        ),
        BilingualQuestion(
            id = 52050, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel acteur a joué le plus de films?", listOf("Olivier", "Warner", "Thalberg", "Samuel L. Jackson"), "Cinéma", "Avec le nouveau format de la Ligue des champions à 36 équipes, chaque club dispute désormais 8 matchs en phase de ligue unique, contre 6 auparavant dans la phase de groupes."),
            en = LocalizedContent("Which actor has appeared in the most films?", listOf("Olivier", "Warner", "Thalberg", "Samuel L. Jackson"), "Cinema", "With the new 36-team Champions League format, each club now plays 8 matches in the single league phase, compared to 6 previously in the group stage."),
            zh = LocalizedContent("哪位演员出演的电影最多？", listOf("奥利维耶", "华纳", "塔尔伯格", "塞缪尔·L·杰克逊"), "电影", "随着新的36队欧冠赛制，每支俱乐部在单一联赛阶段进行8场比赛，而之前小组赛阶段为6场。"),
            es = LocalizedContent("¿Qué actor ha aparecido en más películas?", listOf("Olivier", "Warner", "Thalberg", "Samuel L. Jackson"), "Cine", "Con el nuevo formato de la Champions League de 36 equipos, cada club disputa ahora 8 partidos en la fase de liga única, frente a los 6 anteriores en la fase de grupos.")
        ),
        BilingualQuestion(
            id = 52051, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Combien de films Samuel L. Jackson a-t-il joué?", listOf("100", "150", "200", "300"), "Cinéma", "Le Real Madrid a remporté la Ligue des champions en 2014, 2016, 2017 et 2018, soit quatre titres en cinq ans, dont trois consécutifs de 2016 à 2018."),
            en = LocalizedContent("How many films has Samuel L. Jackson appeared in?", listOf("100", "150", "200", "300"), "Cinema", "Real Madrid won the Champions League in 2014, 2016, 2017 and 2018, four titles in five years, including three consecutive from 2016 to 2018."),
            zh = LocalizedContent("塞缪尔·L·杰克逊出演了多少部电影？", listOf("100", "150", "200", "300"), "电影", "皇家马德里在2014年、2016年、2017年和2018年赢得了欧冠冠军，五年内四次夺冠，其中2016年至2018年连续三次。"),
            es = LocalizedContent("¿En cuántas películas ha aparecido Samuel L. Jackson?", listOf("100", "150", "200", "300"), "Cine", "El Real Madrid ganó la Champions League en 2014, 2016, 2017 y 2018, cuatro títulos en cinco años, incluyendo tres consecutivos de 2016 a 2018.")
        ),
        BilingualQuestion(
            id = 52052, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plus grand nombre de nominations aux Oscars?", listOf("10", "15", "20", "30"), "Cinéma", "Le 6-1 correspond à la victoire de l'Inter Milan sur le Milan AC en 2023, soit le plus grand écart de buts en demi-finale de l'histoire de la compétition."),
            en = LocalizedContent("What is the highest number of Oscar nominations?", listOf("10", "15", "20", "30"), "Cinema", "The 6-1 corresponds to Inter Milan's victory over AC Milan in 2023, the biggest goal margin in a semi-final in the competition's history."),
            zh = LocalizedContent("奥斯卡提名最多的是多少？", listOf("10", "15", "20", "30"), "电影", "6-1对应的是2023年国际米兰战胜AC米兰，这是该赛事半决赛历史上最大的进球差距。"),
            es = LocalizedContent("¿Cuál es el mayor número de nominaciones al Oscar?", listOf("10", "15", "20", "30"), "Cine", "El 6-1 corresponde a la victoria del Inter de Milán sobre el AC Milan en 2023, la mayor diferencia de goles en una semifinal en la historia de la competición.")
        ),
        BilingualQuestion(
            id = 52053, correctIndex = 3, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel film a reçu 30 nominations?", listOf("Ben-Hur", "Titanic", "Cleopatra", "Aucun"), "Cinéma", "Aucun film n'a jamais reçu 30 nominations aux Oscars. Le record est détenu par *Tout sur ma mère* avec 14 nominations, et *La La Land* avec 14 nominations également."),
            en = LocalizedContent("Which film received 30 nominations?", listOf("Ben-Hur", "Titanic", "Cleopatra", "None"), "Cinema", "No film has ever received 30 Oscar nominations. The record is held by *All About My Mother* with 14 nominations, and *La La Land* also with 14 nominations."),
            zh = LocalizedContent("哪部电影获得了30项提名？", listOf("宾虚", "泰坦尼克号", "埃及艳后", "没有"), "电影", "没有电影获得过30项奥斯卡提名。纪录由《关于我母亲的一切》保持，有14项提名，《爱乐之城》也有14项提名。"),
            es = LocalizedContent("¿Qué película recibió 30 nominaciones?", listOf("Ben-Hur", "Titanic", "Cleopatra", "Ninguna"), "Cine", "Ninguna película ha recibido 30 nominaciones al Oscar. El récord lo tiene *Todo sobre mi madre* con 14 nominaciones, y *La La Land* también con 14 nominaciones.")
        ),
        BilingualQuestion(
            id = 52054, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plus grand nombre d'Oscars remportés par un film?", listOf("10", "12", "15", "20"), "Cinéma", "Le film \"Ben-Hur\" (1959) a remporté 11 Oscars, un record absolu. \"Titanic\" et \"Le Seigneur des anneaux : Le Retour du roi\" ont chacun gagné 11 Oscars, égalant ce record."),
            en = LocalizedContent("What is the highest number of Oscars won by a film?", listOf("10", "12", "15", "20"), "Cinema", "The film \"Ben-Hur\" (1959) won 11 Oscars, an absolute record. \"Titanic\" and \"The Lord of the Rings: The Return of the King\" each won 11 Oscars, tying this record."),
            zh = LocalizedContent("一部电影获得奥斯卡奖最多是多少？", listOf("10", "12", "15", "20"), "电影", "电影《宾虚》（1959年）获得了11项奥斯卡奖，是绝对纪录。《泰坦尼克号》和《指环王：王者归来》各获得11项奥斯卡奖，追平了这一纪录。"),
            es = LocalizedContent("¿Cuál es el mayor número de Oscars ganados por una película?", listOf("10", "12", "15", "20"), "Cine", "La película \"Ben-Hur\" (1959) ganó 11 Oscars, un récord absoluto. \"Titanic\" y \"El Señor de los Anillos: El Retorno del Rey\" ganaron cada una 11 Oscars, empatando este récord.")
        ),
        BilingualQuestion(
            id = 52055, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel film a remporté 11 Oscars?", listOf("Titanic", "Ben-Hur", "Seigneur des anneaux", "West Side Story"), "Cinéma", "Ben-Hur (1959) a égalé le record de 11 Oscars détenu par Titanic et Le Seigneur des anneaux : Le Retour du roi, notamment grâce à ses scènes de courses de chars spectaculaires."),
            en = LocalizedContent("Which film won 11 Oscars?", listOf("Titanic", "Ben-Hur", "Lord of the Rings", "West Side Story"), "Cinema", "Ben-Hur (1959) tied the record of 11 Oscars held by Titanic and The Lord of the Rings: The Return of the King, notably thanks to its spectacular chariot race scenes."),
            zh = LocalizedContent("哪部电影获得了11项奥斯卡奖？", listOf("泰坦尼克号", "宾虚", "指环王", "西区故事"), "电影", "《宾虚》（1959年）追平了《泰坦尼克号》和《指环王：王者归来》保持的11项奥斯卡奖纪录，这尤其归功于其壮观的战车比赛场景。"),
            es = LocalizedContent("¿Qué película ganó 11 Oscars?", listOf("Titanic", "Ben-Hur", "El Señor de los Anillos", "West Side Story"), "Cine", "Ben-Hur (1959) empató el récord de 11 Oscars que ostentan Titanic y El Señor de los Anillos: El Retorno del Rey, gracias especialmente a sus espectaculares escenas de carreras de carros.")
        ),
        BilingualQuestion(
            id = 52056, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le film documentaire le plus cher?", listOf("Planet Earth", "Our Planet", "Blue Planet", "Life"), "Cinéma", "Blue Planet, sorti en 2001, a coûté environ 200 millions de dollars, ce qui en fait le documentaire le plus cher jamais produit, en raison de ses techniques de tournage sous-marin révolutionnaires."),
            en = LocalizedContent("What is the most expensive documentary film?", listOf("Planet Earth", "Our Planet", "Blue Planet", "Life"), "Cinema", "Blue Planet, released in 2001, cost about $200 million, making it the most expensive documentary ever produced, due to its revolutionary underwater filming techniques."),
            zh = LocalizedContent("最贵的纪录片是哪部？", listOf("地球脉动", "我们的星球", "蓝色星球", "生命"), "电影", "《蓝色星球》于2001年上映，耗资约2亿美元，因其革命性的水下拍摄技术，成为有史以来最昂贵的纪录片。"),
            es = LocalizedContent("¿Cuál es el documental más caro?", listOf("Planeta Tierra", "Nuestro Planeta", "Planeta Azul", "Vida"), "Cine", "Planeta Azul, estrenado en 2001, costó unos 200 millones de dólares, lo que lo convierte en el documental más caro jamás producido, debido a sus revolucionarias técnicas de filmación submarina.")
        ),
        BilingualQuestion(
            id = 52057, correctIndex = 3, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Combien de millions de dollars Our Planet a-t-il coûté?", listOf("50", "100", "250", "500"), "Cinéma", "\"Our Planet\" est une série documentaire Netflix sur la nature, dont le budget de production s'est élevé à environ 500 millions de dollars, ce qui en fait l'un des documentaires les plus chers jamais réalisés."),
            en = LocalizedContent("How many million dollars did Our Planet cost?", listOf("50", "100", "250", "500"), "Cinema", "\"Our Planet\" is a Netflix nature documentary series, with a production budget of approximately $500 million, making it one of the most expensive documentaries ever made."),
            zh = LocalizedContent("《我们的星球》耗资多少百万美元？", listOf("50", "100", "250", "500"), "电影", "《我们的星球》是一部Netflix自然纪录片系列，制作预算约为5亿美元，使其成为有史以来最昂贵的纪录片之一。"),
            es = LocalizedContent("¿Cuántos millones de dólares costó Nuestro Planeta?", listOf("50", "100", "250", "500"), "Cine", "\"Nuestro Planeta\" es una serie documental de naturaleza de Netflix, con un presupuesto de producción de aproximadamente 500 millones de dólares, lo que la convierte en uno de los documentales más caros jamás realizados.")
        ),
        BilingualQuestion(
            id = 52058, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plus grand nombre de caméras utilisées en un film?", listOf("10", "50", "100", "500"), "Cinéma", "Le film \"Rogue One: A Star Wars Story\" a utilisé jusqu'à 10 caméras simultanément pour certaines scènes d'action complexes."),
            en = LocalizedContent("What is the highest number of cameras used in a film?", listOf("10", "50", "100", "500"), "Cinema", "The film \"Rogue One: A Star Wars Story\" used up to 10 cameras simultaneously for some complex action scenes."),
            zh = LocalizedContent("一部电影中使用的摄像机最多是多少？", listOf("10", "50", "100", "500"), "电影", "电影《侠盗一号：星球大战外传》在某些复杂的动作场景中同时使用了多达10台摄像机。"),
            es = LocalizedContent("¿Cuál es el mayor número de cámaras utilizadas en una película?", listOf("10", "50", "100", "500"), "Cine", "La película \"Rogue One: Una historia de Star Wars\" utilizó hasta 10 cámaras simultáneamente para algunas escenas de acción complejas.")
        ),
        BilingualQuestion(
            id = 52059, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plus grand nombre de cascadeurs en un film?", listOf("100", "500", "1000", "5000"), "Cinéma", "Le record de 500 cascadeurs a été atteint dans le film \"The Great Race\" (1965) pour une scène de course-poursuite."),
            en = LocalizedContent("What is the highest number of stunt performers in a film?", listOf("100", "500", "1000", "5000"), "Cinema", "The record of 500 stunt performers was achieved in the film \"The Great Race\" (1965) for a chase scene."),
            zh = LocalizedContent("一部电影中使用的特技演员最多是多少？", listOf("100", "500", "1000", "5000"), "电影", "500名特技演员的纪录是在电影《疯狂大赛车》（1965年）的一场追逐场景中实现的。"),
            es = LocalizedContent("¿Cuál es el mayor número de especialistas en una película?", listOf("100", "500", "1000", "5000"), "Cine", "El récord de 500 especialistas se alcanzó en la película \"La gran carrera\" (1965) para una escena de persecución.")
        ),
        BilingualQuestion(
            id = 52060, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le film ayant le plus de doublure?", listOf("Indiana Jones", "James Bond", "Matrix", "Die Hard"), "Cinéma", "Le film Matrix a nécessité un nombre record de doublures en raison de ses nombreuses scènes d'action complexes et de cascades, notamment les combats chorégraphiés et les effets de ralenti."),
            en = LocalizedContent("Which film has the most stunt doubles?", listOf("Indiana Jones", "James Bond", "The Matrix", "Die Hard"), "Cinema", "The Matrix required a record number of stunt doubles due to its many complex action scenes and stunts, including choreographed fights and slow-motion effects."),
            zh = LocalizedContent("哪部电影使用了最多的替身？", listOf("印第安纳·琼斯", "詹姆斯·邦德", "黑客帝国", "虎胆龙威"), "电影", "《黑客帝国》因其众多复杂的动作场景和特技，包括编排的打斗和慢动作效果，需要创纪录数量的替身。"),
            es = LocalizedContent("¿Qué película tiene más dobles de acción?", listOf("Indiana Jones", "James Bond", "Matrix", "Die Hard"), "Cine", "Matrix requirió un número récord de dobles debido a sus numerosas escenas de acción complejas y acrobacias, incluyendo peleas coreografiadas y efectos de cámara lenta.")
        ),
        BilingualQuestion(
            id = 52061, correctIndex = 3, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Combien de doublures James Bond a-t-il eus en moyenne?", listOf("2", "5", "10", "20"), "Cinéma", "Chaque film de James Bond nécessite plusieurs cascadeurs pour les scènes d'action, et la franchise compte 25 films officiels, ce qui porte la moyenne à environ 20 doublures par film."),
            en = LocalizedContent("How many stunt doubles did James Bond have on average?", listOf("2", "5", "10", "20"), "Cinema", "Each James Bond film requires several stunt performers for action scenes, and the franchise has 25 official films, bringing the average to about 20 stunt doubles per film."),
            zh = LocalizedContent("詹姆斯·邦德平均有多少替身？", listOf("2", "5", "10", "20"), "电影", "每部詹姆斯·邦德电影都需要多名特技演员进行动作场景，该系列共有25部官方电影，平均每部约20名替身。"),
            es = LocalizedContent("¿Cuántos dobles de acción tuvo James Bond en promedio?", listOf("2", "5", "10", "20"), "Cine", "Cada película de James Bond requiere varios especialistas para las escenas de acción, y la franquicia cuenta con 25 películas oficiales, lo que eleva el promedio a unos 20 dobles por película.")
        ),
        BilingualQuestion(
            id = 52062, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le film ayant demandé le plus de temps de tournage?", listOf("Avatar", "Lord of the Rings", "Apocalypse Now", "Cleopatra"), "Cinéma", "Le tournage principal d'Avatar a débuté en 2007, mais le développement des technologies et des effets visuels a commencé dès 2005, ce qui en fait l'un des films les plus longs à produire."),
            en = LocalizedContent("Which film required the most filming time?", listOf("Avatar", "The Lord of the Rings", "Apocalypse Now", "Cleopatra"), "Cinema", "Principal photography for Avatar began in 2007, but the development of technologies and visual effects started as early as 2005, making it one of the longest films to produce."),
            zh = LocalizedContent("哪部电影需要最长的拍摄时间？", listOf("阿凡达", "指环王", "现代启示录", "埃及艳后"), "电影", "《阿凡达》的主要拍摄始于2007年，但技术和视觉效果的发展早在2005年就开始了，使其成为制作时间最长的电影之一。"),
            es = LocalizedContent("¿Qué película requirió más tiempo de rodaje?", listOf("Avatar", "El Señor de los Anillos", "Apocalypse Now", "Cleopatra"), "Cine", "El rodaje principal de Avatar comenzó en 2007, pero el desarrollo de tecnologías y efectos visuales empezó ya en 2005, convirtiéndola en una de las películas más largas de producir.")
        ),
        BilingualQuestion(
            id = 52063, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Combien de temps a duré le tournage d'Apocalypse Now?", listOf("6 mois", "1 an", "2 ans", "5 ans"), "Cinéma", "Le tournage d'Apocalypse Now a duré environ un an, de mars 1976 à mai 1977, en raison de nombreux problèmes de production comme la météo, la maladie de Martin Sheen et des retards logistiques aux Philippines."),
            en = LocalizedContent("How long did the filming of Apocalypse Now last?", listOf("6 months", "1 year", "2 years", "5 years"), "Cinema", "The filming of Apocalypse Now lasted about a year, from March 1976 to May 1977, due to many production problems like weather, Martin Sheen's illness, and logistical delays in the Philippines."),
            zh = LocalizedContent("《现代启示录》的拍摄持续了多久？", listOf("6个月", "1年", "2年", "5年"), "电影", "《现代启示录》的拍摄持续了大约一年，从1976年3月到1977年5月，原因是许多制作问题，如天气、马丁·辛的疾病以及菲律宾的后勤延误。"),
            es = LocalizedContent("¿Cuánto duró el rodaje de Apocalypse Now?", listOf("6 meses", "1 año", "2 años", "5 años"), "Cine", "El rodaje de Apocalypse Now duró aproximadamente un año, de marzo de 1976 a mayo de 1977, debido a muchos problemas de producción como el clima, la enfermedad de Martin Sheen y retrasos logísticos en Filipinas.")
        ),
        BilingualQuestion(
            id = 52064, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plus grand nombre de réalisateurs pour un film?", listOf("2", "5", "10", "20"), "Cinéma", "Le film chinois *The Founding of a Republic* (2009) détient ce record avec dix réalisateurs crédités, dont Huang Jianxin et Han Sanping."),
            en = LocalizedContent("What is the largest number of directors for a film?", listOf("2", "5", "10", "20"), "Cinema", "The Chinese film *The Founding of a Republic* (2009) holds this record with ten credited directors, including Huang Jianxin and Han Sanping."),
            zh = LocalizedContent("一部电影最多有多少位导演？", listOf("2", "5", "10", "20"), "电影", "中国电影《建国大业》（2009年）以十位署名导演保持这一纪录，包括黄建新和韩三平。"),
            es = LocalizedContent("¿Cuál es el mayor número de directores para una película?", listOf("2", "5", "10", "20"), "Cine", "La película china *The Founding of a Republic* (2009) ostenta este récord con diez directores acreditados, incluidos Huang Jianxin y Han Sanping.")
        ),
        BilingualQuestion(
            id = 52065, correctIndex = 3, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel film a eu 20 réalisateurs?", listOf("Twilight Zone", "Bolsheviks", "New York Stories", "RoboCop 2"), "Cinéma", "RoboCop 2 a eu 20 réalisateurs car le projet a connu un développement chaotique, avec de nombreux scénaristes et réalisateurs successifs avant que Irvin Kershner ne prenne finalement les rênes."),
            en = LocalizedContent("Which film had 20 directors?", listOf("Twilight Zone", "Bolsheviks", "New York Stories", "RoboCop 2"), "Cinema", "RoboCop 2 had 20 directors because the project underwent chaotic development, with many successive writers and directors before Irvin Kershner finally took the helm."),
            zh = LocalizedContent("哪部电影有20位导演？", listOf("阴阳魔界", "布尔什维克", "纽约故事", "机械战警2"), "电影", "《机械战警2》有20位导演，因为该项目经历了混乱的开发过程，在欧文·克什纳最终接手之前，有许多连续的编剧和导演。"),
            es = LocalizedContent("¿Qué película tuvo 20 directores?", listOf("Twilight Zone", "Bolsheviks", "New York Stories", "RoboCop 2"), "Cine", "RoboCop 2 tuvo 20 directores porque el proyecto tuvo un desarrollo caótico, con muchos guionistas y directores sucesivos antes de que Irvin Kershner finalmente tomara las riendas.")
        ),
        BilingualQuestion(
            id = 52066, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le film ayant demandé le plus de décors?", listOf("Cleopatra", "Ben-Hur", "Lord of the Rings", "Avatar"), "Cinéma", "Le film Cléopâtre (1963) détient le record du plus grand nombre de décors construits, avec plus de 300 décors différents, dont certains nécessitant des mois de préparation."),
            en = LocalizedContent("Which film required the most sets?", listOf("Cleopatra", "Ben-Hur", "The Lord of the Rings", "Avatar"), "Cinema", "The film Cleopatra (1963) holds the record for the most sets built, with over 300 different sets, some requiring months of preparation."),
            zh = LocalizedContent("哪部电影需要最多的布景？", listOf("埃及艳后", "宾虚", "指环王", "阿凡达"), "电影", "电影《埃及艳后》（1963年）保持着建造最多布景的纪录，有超过300个不同的布景，其中一些需要数月的准备。"),
            es = LocalizedContent("¿Qué película requirió más decorados?", listOf("Cleopatra", "Ben-Hur", "El Señor de los Anillos", "Avatar"), "Cine", "La película Cleopatra (1963) ostenta el récord de la mayor cantidad de decorados construidos, con más de 300 decorados diferentes, algunos de los cuales requirieron meses de preparación.")
        ),
        BilingualQuestion(
            id = 52067, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Combien de décors Lord of the Rings a-t-il eus?", listOf("100", "500", "1000", "5000"), "Cinéma", "La trilogie du Seigneur des Anneaux a nécessité la construction d'environ 500 décors différents, répartis entre la Nouvelle-Zélande et les studios, pour représenter la Terre du Milieu."),
            en = LocalizedContent("How many sets did The Lord of the Rings have?", listOf("100", "500", "1000", "5000"), "Cinema", "The Lord of the Rings trilogy required the construction of about 500 different sets, spread across New Zealand and studios, to represent Middle-earth."),
            zh = LocalizedContent("《指环王》有多少个布景？", listOf("100", "500", "1000", "5000"), "电影", "《指环王》三部曲需要建造大约500个不同的布景，分布在新西兰和摄影棚，以代表中土世界。"),
            es = LocalizedContent("¿Cuántos decorados tuvo El Señor de los Anillos?", listOf("100", "500", "1000", "5000"), "Cine", "La trilogía de El Señor de los Anillos requirió la construcción de unos 500 decorados diferentes, repartidos entre Nueva Zelanda y los estudios, para representar la Tierra Media.")
        ),
        BilingualQuestion(
            id = 52068, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le premier film de Spielberg?", listOf("Jaws", "Duel", "E.T.", "Jurassic Park"), "Cinéma", "Le premier long-métrage réalisé par Steven Spielberg est Duel (1971), et non E.T. qui est sorti en 1982."),
            en = LocalizedContent("What was Spielberg's first film?", listOf("Jaws", "Duel", "E.T.", "Jurassic Park"), "Cinema", "Steven Spielberg's first feature film as director is Duel (1971), not E.T. which was released in 1982."),
            zh = LocalizedContent("斯皮尔伯格的第一部电影是什么？", listOf("大白鲨", "决斗", "E.T.外星人", "侏罗纪公园"), "电影", "史蒂文·斯皮尔伯格执导的第一部长片是《决斗》（1971年），而不是1982年上映的《E.T.外星人》。"),
            es = LocalizedContent("¿Cuál fue la primera película de Spielberg?", listOf("Tiburón", "Duel", "E.T.", "Parque Jurásico"), "Cine", "El primer largometraje dirigido por Steven Spielberg es Duel (1971), no E.T. que se estrenó en 1982.")
        ),
        BilingualQuestion(
            id = 52069, correctIndex = 3, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année Duel a-t-il été sorti?", listOf("1971", "1973", "1975", "1977"), "Cinéma", "Duel, premier long-métrage de Steven Spielberg, est sorti en 1971 à la télévision américaine, puis en version cinéma en 1972, et non en 1977."),
            en = LocalizedContent("In what year was Duel released?", listOf("1971", "1973", "1975", "1977"), "Cinema", "Duel, Steven Spielberg's first feature film, was released in 1971 on American television, then in theaters in 1972, not 1977."),
            zh = LocalizedContent("《决斗》是哪一年上映的？", listOf("1971", "1973", "1975", "1977"), "电影", "《决斗》是史蒂文·斯皮尔伯格的第一部长片，于1971年在美国电视上播出，随后于1972年在影院上映，而非1977年。"),
            es = LocalizedContent("¿En qué año se estrenó Duel?", listOf("1971", "1973", "1975", "1977"), "Cine", "Duel, el primer largometraje de Steven Spielberg, se estrenó en 1971 en la televisión estadounidense, luego en cines en 1972, no en 1977.")
        ),
        BilingualQuestion(
            id = 52070, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le premier film de Lucas?", listOf("American Graffiti", "Star Wars", "THX 1138", "Red Tails"), "Cinéma", "American Graffiti, sorti en 1973, est le premier long-métrage réalisé par George Lucas, avant la saga Star Wars."),
            en = LocalizedContent("What is Lucas's first film?", listOf("American Graffiti", "Star Wars", "THX 1138", "Red Tails"), "Cinema", "American Graffiti, released in 1973, is the first feature film directed by George Lucas, before the Star Wars saga."),
            zh = LocalizedContent("卢卡斯的第一部电影是什么？", listOf("美国风情画", "星球大战", "THX 1138", "红色机尾"), "电影", "《美国风情画》于1973年上映，是乔治·卢卡斯执导的第一部长片，早于《星球大战》系列。"),
            es = LocalizedContent("¿Cuál es la primera película de Lucas?", listOf("American Graffiti", "Star Wars", "THX 1138", "Red Tails"), "Cine", "American Graffiti, estrenada en 1973, es el primer largometraje dirigido por George Lucas, antes de la saga Star Wars.")
        ),
        BilingualQuestion(
            id = 52071, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année THX 1138 a-t-il été sorti?", listOf("1969", "1971", "1973", "1975"), "Cinéma", "THX 1138 est le premier long métrage de George Lucas, sorti en 1971."),
            en = LocalizedContent("In what year was THX 1138 released?", listOf("1969", "1971", "1973", "1975"), "Cinema", "THX 1138 is George Lucas's first feature film, released in 1971."),
            zh = LocalizedContent("THX 1138是哪一年上映的？", listOf("1969", "1971", "1973", "1975"), "电影", "《THX 1138》是乔治·卢卡斯的第一部长片，于1971年上映。"),
            es = LocalizedContent("¿En qué año se estrenó THX 1138?", listOf("1969", "1971", "1973", "1975"), "Cine", "THX 1138 es el primer largometraje de George Lucas, estrenado en 1971.")
        ),
        BilingualQuestion(
            id = 52072, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le premier film de Kubrick?", listOf("2001", "Dr. Strangelove", "Lolita", "Fear and Desire"), "Cinéma", "Lolita (1962) est souvent considéré comme le premier film majeur de Stanley Kubrick après ses débuts, bien qu'il ait réalisé des longs métrages plus tôt comme Fear and Desire."),
            en = LocalizedContent("What is Kubrick's first film?", listOf("2001", "Dr. Strangelove", "Lolita", "Fear and Desire"), "Cinema", "Lolita (1962) is often considered Stanley Kubrick's first major film after his early works, although he directed earlier feature films like Fear and Desire."),
            zh = LocalizedContent("库布里克的第一部电影是什么？", listOf("2001太空漫游", "奇爱博士", "洛丽塔", "恐惧与欲望"), "电影", "《洛丽塔》（1962年）通常被认为是斯坦利·库布里克早期作品后的第一部重要电影，尽管他之前执导过《恐惧与欲望》等长片。"),
            es = LocalizedContent("¿Cuál es la primera película de Kubrick?", listOf("2001", "Dr. Strangelove", "Lolita", "Fear and Desire"), "Cine", "Lolita (1962) es a menudo considerada la primera gran película de Stanley Kubrick después de sus inicios, aunque dirigió largometrajes anteriores como Fear and Desire.")
        ),
        BilingualQuestion(
            id = 52073, correctIndex = 3, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année Fear and Desire a-t-il été sorti?", listOf("1951", "1953", "1955", "1957"), "Cinéma", "Fear and Desire est le premier film de Stanley Kubrick, sorti en 1953, mais la date de 1957 correspond à une ressortie après des coupes et un montage révisé par le réalisateur."),
            en = LocalizedContent("In what year was Fear and Desire released?", listOf("1951", "1953", "1955", "1957"), "Cinema", "Fear and Desire is Stanley Kubrick's first film, released in 1953, but the date 1957 corresponds to a re-release after cuts and revised editing by the director."),
            zh = LocalizedContent("《恐惧与欲望》是哪一年上映的？", listOf("1951", "1953", "1955", "1957"), "电影", "《恐惧与欲望》是斯坦利·库布里克的第一部电影，于1953年上映，但1957年对应的是导演剪辑和修订后的重新上映。"),
            es = LocalizedContent("¿En qué año se estrenó Fear and Desire?", listOf("1951", "1953", "1955", "1957"), "Cine", "Fear and Desire es la primera película de Stanley Kubrick, estrenada en 1953, pero la fecha de 1957 corresponde a un reestreno tras cortes y un montaje revisado por el director.")
        ),
        BilingualQuestion(
            id = 52074, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plus grand nombre de films produits en une année?", listOf("500", "1000", "5000", "10000"), "Cinéma", "Le record de 500 films produits en une année est détenu par l'Inde, notamment via l'industrie de Bollywood, qui surpasse Hollywood en volume de production annuelle."),
            en = LocalizedContent("What is the largest number of films produced in one year?", listOf("500", "1000", "5000", "10000"), "Cinema", "The record of 500 films produced in one year is held by India, particularly through the Bollywood industry, which surpasses Hollywood in annual production volume."),
            zh = LocalizedContent("一年内制作电影的最大数量是多少？", listOf("500", "1000", "5000", "10000"), "电影", "一年制作500部电影的纪录由印度保持，尤其是通过宝莱坞产业，其年产量超过好莱坞。"),
            es = LocalizedContent("¿Cuál es el mayor número de películas producidas en un año?", listOf("500", "1000", "5000", "10000"), "Cine", "El récord de 500 películas producidas en un año lo ostenta la India, especialmente a través de la industria de Bollywood, que supera a Hollywood en volumen de producción anual.")
        ),
        BilingualQuestion(
            id = 52075, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le film ayant le budget le plus bas?", listOf("1 euro", "10 euros", "100 euros", "1000 euros"), "Cinéma", "Le film \"10 euros\" a été réalisé avec un budget de seulement 10 euros, ce qui en fait le film au budget le plus bas jamais enregistré."),
            en = LocalizedContent("Which film has the lowest budget?", listOf("1 euro", "10 euros", "100 euros", "1000 euros"), "Cinema", "The film \"10 euros\" was made with a budget of only 10 euros, making it the lowest-budget film ever recorded."),
            zh = LocalizedContent("哪部电影的预算最低？", listOf("1欧元", "10欧元", "100欧元", "1000欧元"), "电影", "电影《10欧元》仅以10欧元的预算制作，成为有史以来预算最低的电影。"),
            es = LocalizedContent("¿Qué película tiene el presupuesto más bajo?", listOf("1 euro", "10 euros", "100 euros", "1000 euros"), "Cine", "La película \"10 euros\" se realizó con un presupuesto de solo 10 euros, lo que la convierte en la película de menor presupuesto jamás registrada.")
        ),
        BilingualQuestion(
            id = 52076, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel film a été produit avec 1 euro?", listOf("Paranormal Activity", "Cheap Thrills", "Rubber", "Aucun"), "Cinéma", "Rubber est un film français de 2010 réalisé par Quentin Dupieux, dont le budget de production était symboliquement d'un euro pour dénoncer les excès des grosses productions hollywoodiennes."),
            en = LocalizedContent("Which film was produced with 1 euro?", listOf("Paranormal Activity", "Cheap Thrills", "Rubber", "None"), "Cinema", "Rubber is a 2010 French film directed by Quentin Dupieux, whose production budget was symbolically one euro to denounce the excesses of big Hollywood productions."),
            zh = LocalizedContent("哪部电影是用1欧元制作的？", listOf("灵动：鬼影实录", "廉价惊悚", "轮胎", "无"), "电影", "《轮胎》是2010年昆汀·杜皮约执导的法国电影，其制作预算象征性地为一欧元，以谴责好莱坞大制作的过度行为。"),
            es = LocalizedContent("¿Qué película se produjo con 1 euro?", listOf("Paranormal Activity", "Cheap Thrills", "Rubber", "Ninguna"), "Cine", "Rubber es una película francesa de 2010 dirigida por Quentin Dupieux, cuyo presupuesto de producción fue simbólicamente de un euro para denunciar los excesos de las grandes producciones de Hollywood.")
        ),
        BilingualQuestion(
            id = 52077, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand nombre d'acteurs dans un film?", listOf("100", "500", "1000", "5000"), "Cinéma", "Le film indien *RRR* (2022) détient ce record avec environ 5000 figurants et acteurs dans la scène de danse \"Naatu Naatu\"."),
            en = LocalizedContent("What is the largest number of actors in a film?", listOf("100", "500", "1000", "5000"), "Cinema", "The Indian film *RRR* (2022) holds this record with approximately 5000 extras and actors in the dance scene \"Naatu Naatu\"."),
            zh = LocalizedContent("一部电影中演员的最大数量是多少？", listOf("100", "500", "1000", "5000"), "电影", "印度电影《RRR》（2022年）在舞蹈场景“Naatu Naatu”中使用了约5000名群众演员和演员，保持这一纪录。"),
            es = LocalizedContent("¿Cuál es el mayor número de actores en una película?", listOf("100", "500", "1000", "5000"), "Cine", "La película india *RRR* (2022) ostenta este récord con aproximadamente 5000 figurantes y actores en la escena de baile \"Naatu Naatu\".")
        ),
        BilingualQuestion(
            id = 52078, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel film a plus de 5000 acteurs?", listOf("Intolerance", "Ben-Hur", "Cleopatra", "Épée de Damoclès"), "Cinéma", "Intolerance, réalisé par D.W. Griffith en 1916, est célèbre pour ses scènes de foule massives, employant plus de 5000 figurants et acteurs."),
            en = LocalizedContent("Which film has more than 5000 actors?", listOf("Intolerance", "Ben-Hur", "Cleopatra", "Sword of Damocles"), "Cinema", "Intolerance, directed by D.W. Griffith in 1916, is famous for its massive crowd scenes, employing over 5000 extras and actors."),
            zh = LocalizedContent("哪部电影有超过5000名演员？", listOf("党同伐异", "宾虚", "埃及艳后", "达摩克利斯之剑"), "电影", "《党同伐异》由D.W.格里菲斯于1916年执导，以其宏大的群众场景而闻名，使用了超过5000名群众演员和演员。"),
            es = LocalizedContent("¿Qué película tiene más de 5000 actores?", listOf("Intolerancia", "Ben-Hur", "Cleopatra", "Espada de Damocles"), "Cine", "Intolerancia, dirigida por D.W. Griffith en 1916, es famosa por sus escenas masivas de multitudes, empleando a más de 5000 figurantes y actores.")
        ),
        BilingualQuestion(
            id = 52079, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le film avec le plus grand nombre de scènes d'action?", listOf("Mad Max", "John Wick", "Mission Impossible", "Die Hard"), "Cinéma", "La franchise John Wick est reconnue pour ses chorégraphies d'action intenses et son nombre record de scènes de combat, le premier film comptant plus de 300 scènes d'action."),
            en = LocalizedContent("Which film has the largest number of action scenes?", listOf("Mad Max", "John Wick", "Mission Impossible", "Die Hard"), "Cinema", "The John Wick franchise is known for its intense action choreography and record number of fight scenes, with the first film featuring over 300 action scenes."),
            zh = LocalizedContent("哪部电影的动作场景数量最多？", listOf("疯狂的麦克斯", "疾速追杀", "碟中谍", "虎胆龙威"), "电影", "《疾速追杀》系列以其激烈的动作编排和创纪录的打斗场景数量而闻名，第一部电影包含超过300个动作场景。"),
            es = LocalizedContent("¿Qué película tiene el mayor número de escenas de acción?", listOf("Mad Max", "John Wick", "Misión Imposible", "Die Hard"), "Cine", "La franquicia John Wick es conocida por sus intensas coreografías de acción y su número récord de escenas de lucha, con la primera película contando con más de 300 escenas de acción.")
        ),
        BilingualQuestion(
            id = 52080, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de scènes d'action Mission Impossible a-t-il?", listOf("50", "100", "150", "200"), "Cinéma", "La saga Mission Impossible compte environ 150 scènes d'action réparties sur ses huit films, incluant cascades, poursuites et combats."),
            en = LocalizedContent("How many action scenes does Mission Impossible have?", listOf("50", "100", "150", "200"), "Cinema", "The Mission Impossible saga has approximately 150 action scenes across its eight films, including stunts, chases, and fights."),
            zh = LocalizedContent("《碟中谍》系列有多少个动作场景？", listOf("50", "100", "150", "200"), "电影", "《碟中谍》系列在其八部电影中约有150个动作场景，包括特技、追逐和打斗。"),
            es = LocalizedContent("¿Cuántas escenas de acción tiene Misión Imposible?", listOf("50", "100", "150", "200"), "Cine", "La saga Misión Imposible tiene aproximadamente 150 escenas de acción repartidas en sus ocho películas, incluyendo acrobacias, persecuciones y peleas.")
        ),
        BilingualQuestion(
            id = 52081, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le film avec le plus grand nombre de dialogues?", listOf("Whiplash", "Her", "Before Sunrise", "My Dinner with Andre"), "Cinéma", "My Dinner with Andre est essentiellement une conversation entre deux hommes autour d'un dîner, ce qui en fait le film avec le plus grand nombre de dialogues."),
            en = LocalizedContent("Which movie has the most dialogue?", listOf("Whiplash", "Her", "Before Sunrise", "My Dinner with Andre"), "Cinema", "My Dinner with Andre is essentially a conversation between two men over dinner, making it the movie with the most dialogue."),
            zh = LocalizedContent("哪部电影的对白最多？", listOf("爆裂鼓手", "她", "爱在黎明破晓前", "与安德烈晚餐"), "电影", "《与安德烈晚餐》基本上是两个男人在晚餐时的对话，因此成为对白最多的电影。"),
            es = LocalizedContent("¿Qué película tiene la mayor cantidad de diálogos?", listOf("Whiplash", "Her", "Antes del amanecer", "Mi cena con André"), "Cine", "Mi cena con André es esencialmente una conversación entre dos hombres durante una cena, lo que la convierte en la película con más diálogos.")
        ),
        BilingualQuestion(
            id = 52082, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le film ayant les meilleures critiques?", listOf("Citizen Kane", "Godfather", "Vertigo", "Tous"), "Cinéma", "Citizen Kane est souvent considéré comme le plus grand film de l'histoire du cinéma, notamment grâce à sa mise en scène novatrice et sa narration non linéaire, ce qui lui vaut les meilleures critiques depuis sa sortie."),
            en = LocalizedContent("Which movie has the best reviews?", listOf("Citizen Kane", "Godfather", "Vertigo", "All"), "Cinema", "Citizen Kane is often considered the greatest film in cinema history, thanks to its innovative direction and non-linear narrative, earning it the best reviews since its release."),
            zh = LocalizedContent("哪部电影获得了最佳评价？", listOf("公民凯恩", "教父", "迷魂记", "全部"), "电影", "《公民凯恩》常被认为是电影史上最伟大的电影，因其创新的导演手法和非线性叙事，自上映以来获得了最佳评价。"),
            es = LocalizedContent("¿Qué película tiene las mejores críticas?", listOf("Ciudadano Kane", "El Padrino", "Vértigo", "Todas"), "Cine", "Ciudadano Kane es a menudo considerada la mejor película de la historia del cine, gracias a su innovadora dirección y narrativa no lineal, lo que le ha valido las mejores críticas desde su estreno.")
        ),
        BilingualQuestion(
            id = 52083, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel film a la note IMDb la plus élevée?", listOf("Shawshank", "Dark Knight", "Godfather", "Pulp Fiction"), "Cinéma", "The Dark Knight est souvent cité comme l'un des meilleurs films de super-héros, et sa note IMDb de 9,0 en fait l'un des films les mieux notés de la plateforme."),
            en = LocalizedContent("Which movie has the highest IMDb rating?", listOf("Shawshank", "Dark Knight", "Godfather", "Pulp Fiction"), "Cinema", "The Dark Knight is often cited as one of the best superhero movies, and its IMDb rating of 9.0 makes it one of the highest-rated films on the platform."),
            zh = LocalizedContent("哪部电影的IMDb评分最高？", listOf("肖申克的救赎", "黑暗骑士", "教父", "低俗小说"), "电影", "《黑暗骑士》常被认为是最佳超级英雄电影之一，其IMDb评分9.0使其成为该平台评分最高的电影之一。"),
            es = LocalizedContent("¿Qué película tiene la calificación más alta en IMDb?", listOf("Cadena perpetua", "El Caballero Oscuro", "El Padrino", "Pulp Fiction"), "Cine", "El Caballero Oscuro es a menudo citada como una de las mejores películas de superhéroes, y su calificación de 9.0 en IMDb la convierte en una de las películas mejor calificadas de la plataforma.")
        ),
        BilingualQuestion(
            id = 52084, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quelle note IMDb Shawshank a-t-il?", listOf("9.0", "9.2", "9.4", "9.6"), "Cinéma", "The Shawshank Redemption est le film le mieux noté sur IMDb avec une note de 9.4/10, basée sur plus d'un million de votes d'utilisateurs."),
            en = LocalizedContent("What is the IMDb rating of Shawshank?", listOf("9.0", "9.2", "9.4", "9.6"), "Cinema", "The Shawshank Redemption is the highest-rated movie on IMDb with a score of 9.4/10, based on over a million user votes."),
            zh = LocalizedContent("《肖申克的救赎》的IMDb评分是多少？", listOf("9.0", "9.2", "9.4", "9.6"), "电影", "《肖申克的救赎》是IMDb上评分最高的电影，得分为9.4/10，基于超过一百万用户投票。"),
            es = LocalizedContent("¿Cuál es la calificación en IMDb de Cadena perpetua?", listOf("9.0", "9.2", "9.4", "9.6"), "Cine", "Cadena perpetua es la película mejor calificada en IMDb con una puntuación de 9.4/10, basada en más de un millón de votos de usuarios.")
        ),
        BilingualQuestion(
            id = 52085, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le film d'animation le plus cher?", listOf("Toy Story 4", "Incredibles 2", "Frozen", "Encanto"), "Cinéma", "Avec un budget estimé à 150 millions de dollars, Encanto est officiellement le film d'animation le plus cher jamais produit par Disney."),
            en = LocalizedContent("What is the most expensive animated movie?", listOf("Toy Story 4", "Incredibles 2", "Frozen", "Encanto"), "Cinema", "With an estimated budget of $150 million, Encanto is officially the most expensive animated movie ever produced by Disney."),
            zh = LocalizedContent("哪部动画电影制作成本最高？", listOf("玩具总动员4", "超人总动员2", "冰雪奇缘", "魔法满屋"), "电影", "《魔法满屋》的预算估计为1.5亿美元，是迪士尼有史以来制作成本最高的动画电影。"),
            es = LocalizedContent("¿Cuál es la película animada más cara?", listOf("Toy Story 4", "Los Increíbles 2", "Frozen", "Encanto"), "Cine", "Con un presupuesto estimado de 150 millones de dólares, Encanto es oficialmente la película animada más cara producida por Disney.")
        ),
        BilingualQuestion(
            id = 52086, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de millions de dollars Incredibles 2 a-t-il coûté?", listOf("50", "100", "150", "200"), "Cinéma", "Le budget de production d'Incredibles 2 est estimé à 50 millions de dollars, un montant typique pour un film d'animation Pixar de cette époque."),
            en = LocalizedContent("How many million dollars did Incredibles 2 cost?", listOf("50", "100", "150", "200"), "Cinema", "The production budget of Incredibles 2 is estimated at $50 million, a typical amount for a Pixar animated film of that era."),
            zh = LocalizedContent("《超人总动员2》的制作成本是多少百万美元？", listOf("50", "100", "150", "200"), "电影", "《超人总动员2》的制作预算估计为5000万美元，这是当时皮克斯动画电影的典型成本。"),
            es = LocalizedContent("¿Cuántos millones de dólares costó Los Increíbles 2?", listOf("50", "100", "150", "200"), "Cine", "El presupuesto de producción de Los Increíbles 2 se estima en 50 millones de dólares, una cantidad típica para una película animada de Pixar de esa época.")
        ),
        BilingualQuestion(
            id = 52087, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand nombre de prix du festival de Cannes?", listOf("1", "3", "5", "10"), "Cinéma", "Le record du nombre de récompenses remportées par un même film au Festival de Cannes est de trois prix, un exploit atteint par plusieurs œuvres comme *La Dolce Vita* et *Pulp Fiction*."),
            en = LocalizedContent("What is the highest number of awards won at the Cannes Film Festival?", listOf("1", "3", "5", "10"), "Cinema", "The record for the number of awards won by a single film at the Cannes Film Festival is three, an achievement reached by several works such as *La Dolce Vita* and *Pulp Fiction*."),
            zh = LocalizedContent("戛纳电影节上单部电影获奖的最高数量是多少？", listOf("1", "3", "5", "10"), "电影", "单部电影在戛纳电影节获奖的最高纪录是三项，这一成就由《甜蜜的生活》和《低俗小说》等多部作品达成。"),
            es = LocalizedContent("¿Cuál es el mayor número de premios ganados en el Festival de Cannes?", listOf("1", "3", "5", "10"), "Cine", "El récord de premios ganados por una sola película en el Festival de Cannes es de tres, un logro alcanzado por varias obras como *La Dolce Vita* y *Pulp Fiction*.")
        ),
        BilingualQuestion(
            id = 52088, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel film a reçu 10 prix à Cannes?", listOf("Parasite", "All About Eve", "The Best Years of Our Lives", "Aucun"), "Cinéma", "The Best Years of Our Lives a reçu 10 prix au Festival de Cannes 1946, un record pour une seule édition, incluant le Grand Prix (ancêtre de la Palme d'or) et des prix d'interprétation. Ce film américain de William Wyler traitait du retour des vétérans de la Seconde Guerre mondiale."),
            en = LocalizedContent("Which movie received 10 awards at Cannes?", listOf("Parasite", "All About Eve", "The Best Years of Our Lives", "None"), "Cinema", "The Best Years of Our Lives received 10 awards at the 1946 Cannes Film Festival, a record for a single edition, including the Grand Prix (predecessor of the Palme d'Or) and acting awards. This American film by William Wyler dealt with the return of World War II veterans."),
            zh = LocalizedContent("哪部电影在戛纳获得了10项大奖？", listOf("寄生虫", "彗星美人", "黄金时代", "没有"), "电影", "《黄金时代》在1946年戛纳电影节上获得了10项大奖，这是单届电影节的纪录，包括大奖（金棕榈奖的前身）和表演奖。这部威廉·惠勒执导的美国电影讲述了二战老兵返乡的故事。"),
            es = LocalizedContent("¿Qué película recibió 10 premios en Cannes?", listOf("Parásitos", "Eva al desnudo", "Los mejores años de nuestra vida", "Ninguna"), "Cine", "Los mejores años de nuestra vida recibió 10 premios en el Festival de Cannes de 1946, un récord para una sola edición, incluyendo el Gran Premio (predecesor de la Palma de Oro) y premios de interpretación. Esta película estadounidense de William Wyler trataba sobre el regreso de los veteranos de la Segunda Guerra Mundial.")
        ),
        BilingualQuestion(
            id = 52089, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand nombre de films produits par un réalisateur?", listOf("100", "200", "500", "1000"), "Cinéma", "Le réalisateur indien Dadasaheb Phalke est crédité de plus de 1000 films, principalement des courts métrages et documentaires, durant sa carrière au début du cinéma indien."),
            en = LocalizedContent("What is the highest number of films produced by a director?", listOf("100", "200", "500", "1000"), "Cinema", "Indian director Dadasaheb Phalke is credited with over 1000 films, mainly short films and documentaries, during his career in early Indian cinema."),
            zh = LocalizedContent("一位导演制作电影的最高数量是多少？", listOf("100", "200", "500", "1000"), "电影", "印度导演达达萨赫布·法尔克在其早期印度电影生涯中制作了超过1000部电影，主要是短片和纪录片。"),
            es = LocalizedContent("¿Cuál es el mayor número de películas producidas por un director?", listOf("100", "200", "500", "1000"), "Cine", "El director indio Dadasaheb Phalke tiene crédito por más de 1000 películas, principalmente cortometrajes y documentales, durante su carrera en los inicios del cine indio.")
        ),
    )

    private fun part6(): List<BilingualQuestion> = listOf(
        BilingualQuestion(
            id = 52090, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel réalisateur a produit plus de 500 films?", listOf("Godard", "Bresson", "Tarkovsky", "Aucun"), "Cinéma", "Jean-Luc Godard est connu pour son immense productivité, ayant réalisé plus de 500 films, courts et longs métrages confondus, tout au long de sa carrière expérimentale."),
            en = LocalizedContent("Which director produced over 500 films?", listOf("Godard", "Bresson", "Tarkovsky", "None"), "Cinema", "Jean-Luc Godard is known for his immense productivity, having directed over 500 films, both short and feature-length, throughout his experimental career."),
            zh = LocalizedContent("哪位导演制作了超过500部电影？", listOf("戈达尔", "布列松", "塔可夫斯基", "无"), "电影", "让-吕克·戈达尔以其极高的产量而闻名，在其实验性职业生涯中执导了超过500部短片和长片。"),
            es = LocalizedContent("¿Qué director produjo más de 500 películas?", listOf("Godard", "Bresson", "Tarkovsky", "Ninguno"), "Cine", "Jean-Luc Godard es conocido por su inmensa productividad, habiendo dirigido más de 500 películas, entre cortometrajes y largometrajes, a lo largo de su carrera experimental.")
        ),
        BilingualQuestion(
            id = 52091, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le premier film de superhéros?", listOf("Superman", "Batman", "Spider-Man", "Superman Returns"), "Cinéma", "Batman (1943) est considéré comme le premier film de superhéros, avec un serial en 15 chapitres adapté du comic book."),
            en = LocalizedContent("What is the first superhero movie?", listOf("Superman", "Batman", "Spider-Man", "Superman Returns"), "Cinema", "Batman (1943) is considered the first superhero movie, a 15-chapter serial adapted from the comic book."),
            zh = LocalizedContent("第一部超级英雄电影是什么？", listOf("超人", "蝙蝠侠", "蜘蛛侠", "超人归来"), "电影", "《蝙蝠侠》（1943）被认为是第一部超级英雄电影，是一部改编自漫画的15章系列片。"),
            es = LocalizedContent("¿Cuál es la primera película de superhéroes?", listOf("Superman", "Batman", "Spider-Man", "Superman Returns"), "Cine", "Batman (1943) es considerada la primera película de superhéroes, un serial de 15 capítulos adaptado del cómic.")
        ),
        BilingualQuestion(
            id = 52092, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année le premier Superman a-t-il été sorti?", listOf("1975", "1978", "1980", "1985"), "Cinéma", "Superman, avec Christopher Reeve, est sorti en 1978 aux États-Unis, mais en France, il a été distribué en 1980, ce qui explique la date retenue."),
            en = LocalizedContent("In what year was the first Superman released?", listOf("1975", "1978", "1980", "1985"), "Cinema", "Superman, starring Christopher Reeve, was released in 1978 in the United States, but in France it was distributed in 1980, which explains the retained date."),
            zh = LocalizedContent("第一部《超人》在哪一年上映？", listOf("1975", "1978", "1980", "1985"), "电影", "由克里斯托弗·里夫主演的《超人》于1978年在美国上映，但在法国于1980年发行，这解释了所采用的日期。"),
            es = LocalizedContent("¿En qué año se estrenó el primer Superman?", listOf("1975", "1978", "1980", "1985"), "Cine", "Superman, con Christopher Reeve, se estrenó en 1978 en Estados Unidos, pero en Francia se distribuyó en 1980, lo que explica la fecha retenida.")
        ),
        BilingualQuestion(
            id = 52093, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le film de zombie le plus cher?", listOf("Resident Evil", "28 Days Later", "World War Z", "Night of the Living Dead"), "Cinéma", "Night of the Living Dead, réalisé en 1968 par George A. Romero, est souvent cité comme le film de zombie le plus cher en raison de son influence majeure et de son budget de 114 000 dollars, modeste pour l'époque mais élevé pour un film d'horreur indépendant."),
            en = LocalizedContent("What is the most expensive zombie movie?", listOf("Resident Evil", "28 Days Later", "World War Z", "Night of the Living Dead"), "Cinema", "Night of the Living Dead, directed in 1968 by George A. Romero, is often cited as the most expensive zombie movie due to its major influence and budget of $114,000, modest for the time but high for an independent horror film."),
            zh = LocalizedContent("最昂贵的僵尸电影是哪一部？", listOf("生化危机", "惊变28天", "僵尸世界大战", "活死人之夜"), "电影", "乔治·A·罗梅罗于1968年执导的《活死人之夜》常被称为最昂贵的僵尸电影，因其巨大影响力和11.4万美元的预算，在当时虽不算高，但对独立恐怖片来说已属高昂。"),
            es = LocalizedContent("¿Cuál es la película de zombis más cara?", listOf("Resident Evil", "28 Days Later", "World War Z", "Night of the Living Dead"), "Cine", "Night of the Living Dead, dirigida en 1968 por George A. Romero, a menudo se cita como la película de zombis más cara debido a su gran influencia y su presupuesto de 114.000 dólares, modesto para la época pero elevado para una película de terror independiente.")
        ),
        BilingualQuestion(
            id = 52094, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de millions de dollars World War Z a-t-il coûté?", listOf("50", "100", "150", "200"), "Cinéma", "Le budget de production de World War Z est estimé à 190 millions de dollars, mais après des reshoots coûteux, le total a atteint environ 200 millions. Le chiffre de 50 millions est donc incorrect."),
            en = LocalizedContent("How many millions of dollars did World War Z cost?", listOf("50", "100", "150", "200"), "Cinema", "The production budget of World War Z is estimated at $190 million, but after costly reshoots, the total reached about $200 million. The figure of $50 million is therefore incorrect."),
            zh = LocalizedContent("《僵尸世界大战》花费了多少百万美元？", listOf("50", "100", "150", "200"), "电影", "《僵尸世界大战》的制作预算估计为1.9亿美元，但经过昂贵的重拍后，总额达到约2亿美元。因此5000万美元的数字是不正确的。"),
            es = LocalizedContent("¿Cuántos millones de dólares costó World War Z?", listOf("50", "100", "150", "200"), "Cine", "El presupuesto de producción de World War Z se estima en 190 millones de dólares, pero después de costosos reshoots, el total alcanzó unos 200 millones. Por lo tanto, la cifra de 50 millones es incorrecta.")
        ),
        BilingualQuestion(
            id = 52095, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le film de vampires le plus cher?", listOf("Twilight", "Dracula", "Nosferatu", "Let the Right One In"), "Cinéma", "Le film \"Dracula\" (1992) de Francis Ford Coppola a coûté environ 40 millions de dollars, un budget record pour un film de vampires à l'époque."),
            en = LocalizedContent("What is the most expensive vampire movie?", listOf("Twilight", "Dracula", "Nosferatu", "Let the Right One In"), "Cinema", "The film \"Dracula\" (1992) by Francis Ford Coppola cost about $40 million, a record budget for a vampire movie at the time."),
            zh = LocalizedContent("最昂贵的吸血鬼电影是哪一部？", listOf("暮光之城", "惊情四百年", "诺斯费拉图", "生人勿进"), "电影", "弗朗西斯·福特·科波拉的《惊情四百年》（1992年）耗资约4000万美元，是当时吸血鬼电影的最高预算。"),
            es = LocalizedContent("¿Cuál es la película de vampiros más cara?", listOf("Twilight", "Dracula", "Nosferatu", "Let the Right One In"), "Cine", "La película \"Drácula\" (1992) de Francis Ford Coppola costó unos 40 millones de dólares, un presupuesto récord para una película de vampiros en ese momento.")
        ),
        BilingualQuestion(
            id = 52096, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de millions de dollars Twilight a-t-il coûté?", listOf("25", "50", "100", "150"), "Cinéma", "Le premier film Twilight, sorti en 2008, a été produit avec un budget de 37 millions de dollars, mais le coût total de production de la saga est souvent estimé à environ 100 millions de dollars pour l'ensemble des films."),
            en = LocalizedContent("How many millions of dollars did Twilight cost?", listOf("25", "50", "100", "150"), "Cinema", "The first Twilight film, released in 2008, was produced with a budget of $37 million, but the total production cost of the saga is often estimated at about $100 million for all films."),
            zh = LocalizedContent("《暮光之城》花费了多少百万美元？", listOf("25", "50", "100", "150"), "电影", "第一部《暮光之城》电影于2008年上映，制作预算为3700万美元，但整个系列的总制作成本通常估计约为1亿美元。"),
            es = LocalizedContent("¿Cuántos millones de dólares costó Twilight?", listOf("25", "50", "100", "150"), "Cine", "La primera película de Twilight, estrenada en 2008, se produjo con un presupuesto de 37 millones de dólares, pero el costo total de producción de la saga a menudo se estima en unos 100 millones de dólares para todas las películas.")
        ),
        BilingualQuestion(
            id = 52097, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le film d'amour le plus cher?", listOf("Titanic", "Avatar", "La Reine des Damnés", "Raiponce"), "Cinéma", "Avec un budget de 260 millions de dollars, Raiponce (2010) est le film d'amour le plus cher jamais produit, en raison de son animation révolutionnaire et de ses coûts de développement."),
            en = LocalizedContent("What is the most expensive romance movie?", listOf("Titanic", "Avatar", "Queen of the Damned", "Tangled"), "Cinema", "With a budget of $260 million, Tangled (2010) is the most expensive romance movie ever produced, due to its revolutionary animation and development costs."),
            zh = LocalizedContent("最昂贵的爱情电影是哪一部？", listOf("泰坦尼克号", "阿凡达", "吸血鬼女王", "魔发奇缘"), "电影", "《魔发奇缘》（2010年）以2.6亿美元的预算成为有史以来最昂贵的爱情电影，因其革命性的动画和开发成本。"),
            es = LocalizedContent("¿Cuál es la película romántica más cara?", listOf("Titanic", "Avatar", "La Reina de los Condenados", "Enredados"), "Cine", "Con un presupuesto de 260 millones de dólares, Enredados (2010) es la película romántica más cara jamás producida, debido a su animación revolucionaria y sus costos de desarrollo.")
        ),
        BilingualQuestion(
            id = 52098, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le film d'horreur ayant le plus de suite?", listOf("Saw", "Freddy", "Jason", "Halloween"), "Cinéma", "La saga Saw compte dix films à ce jour, incluant le neuvième volet sorti en 2023 et un dixième prévu pour 2024, ce qui en fait la franchise horrifique la plus étendue."),
            en = LocalizedContent("Which horror movie has the most sequels?", listOf("Saw", "Freddy", "Jason", "Halloween"), "Cinema", "The Saw saga has ten films to date, including the ninth installment released in 2023 and a tenth planned for 2024, making it the most extensive horror franchise."),
            zh = LocalizedContent("哪部恐怖电影的续集最多？", listOf("电锯惊魂", "猛鬼街", "十三号星期五", "万圣节"), "电影", "《电锯惊魂》系列至今已有十部电影，包括2023年上映的第九部和计划于2024年上映的第十部，使其成为最庞大的恐怖系列。"),
            es = LocalizedContent("¿Qué película de terror tiene más secuelas?", listOf("Saw", "Freddy", "Jason", "Halloween"), "Cine", "La saga Saw tiene diez películas hasta la fecha, incluyendo la novena entrega estrenada en 2023 y una décima prevista para 2024, lo que la convierte en la franquicia de terror más extensa.")
        ),
        BilingualQuestion(
            id = 52099, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de films Freddy a-t-il eus?", listOf("5", "8", "9", "15"), "Cinéma", "La franchise Freddy (Les Griffes de la nuit) compte huit films, incluant le premier de 1984, six suites et le crossover Freddy vs Jason."),
            en = LocalizedContent("How many Freddy movies were there?", listOf("5", "8", "9", "15"), "Cinema", "The Freddy franchise (A Nightmare on Elm Street) has eight films, including the first in 1984, six sequels, and the crossover Freddy vs. Jason."),
            zh = LocalizedContent("弗莱迪系列电影有多少部？", listOf("5", "8", "9", "15"), "电影", "弗莱迪系列（《猛鬼街》）共有八部电影，包括1984年的第一部、六部续集以及跨界作品《弗莱迪大战杰森》。"),
            es = LocalizedContent("¿Cuántas películas de Freddy hubo?", listOf("5", "8", "9", "15"), "Cine", "La franquicia de Freddy (Pesadilla en Elm Street) tiene ocho películas, incluyendo la primera de 1984, seis secuelas y el crossover Freddy vs. Jason.")
        ),
        BilingualQuestion(
            id = 52100, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le film de science-fiction le plus récent à avoir gagné un Oscar?", listOf("Avatar", "Interstellar", "Arrival", "Dune"), "Cinéma", "Arrival a remporté l'Oscar du meilleur montage sonore en 2017, ce qui en fait le film de SF le plus récent à avoir gagné un Oscar à cette date."),
            en = LocalizedContent("Which is the most recent science fiction film to win an Oscar?", listOf("Avatar", "Interstellar", "Arrival", "Dune"), "Cinema", "Arrival won the Oscar for Best Sound Editing in 2017, making it the most recent sci-fi film to win an Oscar at that time."),
            zh = LocalizedContent("哪部科幻电影最近获得了奥斯卡奖？", listOf("阿凡达", "星际穿越", "降临", "沙丘"), "电影", "《降临》在2017年获得了奥斯卡最佳音效剪辑奖，使其成为当时最近获得奥斯卡奖的科幻电影。"),
            es = LocalizedContent("¿Cuál es la película de ciencia ficción más reciente en ganar un Oscar?", listOf("Avatar", "Interestelar", "La llegada", "Dune"), "Cine", "La llegada ganó el Oscar al mejor montaje de sonido en 2017, lo que la convierte en la película de ciencia ficción más reciente en ganar un Oscar en esa fecha.")
        ),
    )
}
