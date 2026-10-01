package com.prometheus.clq.data

import com.prometheus.clq.model.BilingualQuestion
import com.prometheus.clq.model.Difficulty
import com.prometheus.clq.model.Language
import com.prometheus.clq.model.LocalizedContent
import com.prometheus.clq.model.Question

/** Auto-generated batch 10 : 500 questions bilingues */
object QuestionsBilingualGenerated_10 {
    fun get(lang: Language = Language.FR): List<Question> = list.map { it.toQuestion(lang) }

    val list: List<BilingualQuestion> by lazy {
        part1() + part2() + part3() + part4() + part5() + part6() + part7()
    }

    private fun part1(): List<BilingualQuestion> = listOf(
        BilingualQuestion(
            id = 10930, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est l'animal qui mange le plus?", listOf("l'éléphant", "la baleine", "l'hippopotame", "l'ours"), "Nature", "La baleine bleue consomme jusqu'à 4 tonnes de krill par jour, ce qui en fait l'animal avec le plus grand appétit en termes de masse alimentaire."),
            en = LocalizedContent("Which animal eats the most?", listOf("elephant", "whale", "hippopotamus", "bear"), "Nature", "The blue whale consumes up to 4 tons of krill per day, making it the animal with the largest appetite in terms of food mass."),
            zh = LocalizedContent("哪种动物吃得最多？", listOf("大象", "鲸鱼", "河马", "熊"), "自然", "蓝鲸每天消耗多达4吨磷虾，使其成为食物质量上食量最大的动物。"),
            es = LocalizedContent("¿Qué animal come más?", listOf("el elefante", "la ballena", "el hipopótamo", "el oso"), "Naturaleza", "La ballena azul consume hasta 4 toneladas de krill al día, lo que la convierte en el animal con mayor apetito en términos de masa alimenticia.")
        ),
        BilingualQuestion(
            id = 10931, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est l'animal qui mange le moins?", listOf("le colibri", "le hérisson", "la souris", "la chauve-souris"), "Nature", "Le colibri a un métabolisme extrêmement rapide et doit manger constamment pour survivre, mais il compense par des périodes de torpeur où son métabolisme ralentit fortement, lui permettant de jeûner la nuit."),
            en = LocalizedContent("Which animal eats the least?", listOf("hummingbird", "hedgehog", "mouse", "bat"), "Nature", "The hummingbird has an extremely fast metabolism and must eat constantly to survive, but it compensates with periods of torpor where its metabolism slows down greatly, allowing it to fast at night."),
            zh = LocalizedContent("哪种动物吃得最少？", listOf("蜂鸟", "刺猬", "老鼠", "蝙蝠"), "自然", "蜂鸟新陈代谢极快，必须不断进食才能生存，但它通过休眠期来补偿，此时新陈代谢大幅减慢，使其能够在夜间禁食。"),
            es = LocalizedContent("¿Qué animal come menos?", listOf("el colibrí", "el erizo", "el ratón", "el murciélago"), "Naturaleza", "El colibrí tiene un metabolismo extremadamente rápido y debe comer constantemente para sobrevivir, pero lo compensa con períodos de letargo donde su metabolismo se ralentiza mucho, permitiéndole ayunar por la noche.")
        ),
        BilingualQuestion(
            id = 10932, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est l'animal qui respire le plus?", listOf("la souris", "le pigeon", "le lapin", "l'oiseau"), "Nature", "Les oiseaux ont un système respiratoire très efficace avec des sacs aériens qui permettent un flux d'air unidirectionnel, leur assurant un apport constant en oxygène même en vol."),
            en = LocalizedContent("Which animal breathes the most?", listOf("mouse", "pigeon", "rabbit", "bird"), "Nature", "Birds have a very efficient respiratory system with air sacs that allow unidirectional airflow, ensuring a constant supply of oxygen even during flight."),
            zh = LocalizedContent("哪种动物呼吸最多？", listOf("老鼠", "鸽子", "兔子", "鸟"), "自然", "鸟类拥有非常高效的呼吸系统，带有气囊，可实现单向气流，即使在飞行中也能确保持续供氧。"),
            es = LocalizedContent("¿Qué animal respira más?", listOf("el ratón", "la paloma", "el conejo", "el ave"), "Naturaleza", "Las aves tienen un sistema respiratorio muy eficiente con sacos aéreos que permiten un flujo de aire unidireccional, asegurando un suministro constante de oxígeno incluso durante el vuelo.")
        ),
        BilingualQuestion(
            id = 10933, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est l'animal qui respire le moins?", listOf("la baleine", "le crocodile", "le requin", "la tortue"), "Nature", "Le crocodile peut retenir sa respiration sous l'eau pendant plus d'une heure grâce à son métabolisme lent et à sa capacité à ralentir son rythme cardiaque."),
            en = LocalizedContent("Which animal breathes the least?", listOf("whale", "crocodile", "shark", "turtle"), "Nature", "The crocodile can hold its breath underwater for over an hour thanks to its slow metabolism and ability to slow its heart rate."),
            zh = LocalizedContent("哪种动物呼吸最少？", listOf("鲸鱼", "鳄鱼", "鲨鱼", "海龟"), "自然", "鳄鱼可以在水下屏住呼吸超过一小时，这得益于其缓慢的新陈代谢和降低心率的能力。"),
            es = LocalizedContent("¿Qué animal respira menos?", listOf("la ballena", "el cocodrilo", "el tiburón", "la tortuga"), "Naturaleza", "El cocodrilo puede contener la respiración bajo el agua durante más de una hora gracias a su metabolismo lento y su capacidad para reducir su ritmo cardíaco.")
        ),
        BilingualQuestion(
            id = 10934, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est l'animal qui transpire le plus?", listOf("le cheval", "l'humain", "le chien", "le chat"), "Nature", "Les chevaux transpirent abondamment pour réguler leur température corporelle lors d'efforts intenses, produisant jusqu'à 15 litres de sueur par heure."),
            en = LocalizedContent("Which animal sweats the most?", listOf("horse", "human", "dog", "cat"), "Nature", "Horses sweat profusely to regulate their body temperature during intense exertion, producing up to 15 liters of sweat per hour."),
            zh = LocalizedContent("哪种动物出汗最多？", listOf("马", "人类", "狗", "猫"), "自然", "马在剧烈运动时大量出汗以调节体温，每小时可产生多达15升汗液。"),
            es = LocalizedContent("¿Qué animal suda más?", listOf("el caballo", "el humano", "el perro", "el gato"), "Naturaleza", "Los caballos sudan abundantemente para regular su temperatura corporal durante el esfuerzo intenso, produciendo hasta 15 litros de sudor por hora.")
        ),
        BilingualQuestion(
            id = 10935, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est l'animal qui transpire le moins?", listOf("le chameau", "le chat", "le chien", "l'oiseau"), "Nature", "Le chameau transpire très peu grâce à son pelage épais qui isole la chaleur et à sa capacité à réguler sa température corporelle, ce qui lui permet de conserver l'eau dans les déserts arides."),
            en = LocalizedContent("Which animal sweats the least?", listOf("camel", "cat", "dog", "bird"), "Nature", "The camel sweats very little thanks to its thick coat that insulates heat and its ability to regulate body temperature, allowing it to conserve water in arid deserts."),
            zh = LocalizedContent("哪种动物出汗最少？", listOf("骆驼", "猫", "狗", "鸟"), "自然", "骆驼出汗很少，这得益于其厚实的皮毛隔热以及调节体温的能力，使其能够在干旱沙漠中保存水分。"),
            es = LocalizedContent("¿Qué animal suda menos?", listOf("el camello", "el gato", "el perro", "el ave"), "Naturaleza", "El camello suda muy poco gracias a su pelaje grueso que aísla el calor y a su capacidad para regular la temperatura corporal, lo que le permite conservar agua en los desiertos áridos.")
        ),
        BilingualQuestion(
            id = 10936, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est l'animal qui saute le plus haut?", listOf("la puce", "le kangourou", "la grenouille", "la sauterelle"), "Nature", "Le kangourou peut sauter jusqu'à 3 mètres de haut grâce à ses puissantes pattes arrière et sa queue qui sert de balancier."),
            en = LocalizedContent("Which animal jumps the highest?", listOf("flea", "kangaroo", "frog", "grasshopper"), "Nature", "The kangaroo can jump up to 3 meters high thanks to its powerful hind legs and tail that acts as a counterbalance."),
            zh = LocalizedContent("哪种动物跳得最高？", listOf("跳蚤", "袋鼠", "青蛙", "蚱蜢"), "自然", "袋鼠可以跳到3米高，这得益于其强壮的后腿和用作平衡的尾巴。"),
            es = LocalizedContent("¿Qué animal salta más alto?", listOf("la pulga", "el canguro", "la rana", "el saltamontes"), "Naturaleza", "El canguro puede saltar hasta 3 metros de altura gracias a sus poderosas patas traseras y su cola que sirve de contrapeso.")
        ),
        BilingualQuestion(
            id = 10937, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est l'animal qui saute le plus loin?", listOf("la puce", "le kangourou", "la grenouille", "la sauterelle"), "Nature", "La puce peut sauter jusqu'à 200 fois sa propre longueur, ce qui en fait l'animal le plus performant en saut proportionnellement à sa taille."),
            en = LocalizedContent("Which animal jumps the farthest?", listOf("flea", "kangaroo", "frog", "grasshopper"), "Nature", "The flea can jump up to 200 times its own body length, making it the most efficient jumper relative to its size."),
            zh = LocalizedContent("哪种动物跳得最远？", listOf("跳蚤", "袋鼠", "青蛙", "蚱蜢"), "自然", "跳蚤可以跳到自身长度的200倍，使其成为相对于体型而言最有效的跳跃者。"),
            es = LocalizedContent("¿Qué animal salta más lejos?", listOf("la pulga", "el canguro", "la rana", "el saltamontes"), "Naturaleza", "La pulga puede saltar hasta 200 veces su propia longitud, lo que la convierte en el saltador más eficiente en proporción a su tamaño.")
        ),
        BilingualQuestion(
            id = 10938, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est l'animal qui plonge le plus profond?", listOf("le phoque", "la baleine", "le cachalot", "le dauphin"), "Nature", "Le cachalot peut plonger jusqu'à 2 000 mètres de profondeur pour chasser des calmars géants, ce qui en fait le mammifère plongeant le plus profondément."),
            en = LocalizedContent("Which animal dives the deepest?", listOf("seal", "whale", "sperm whale", "dolphin"), "Nature", "The sperm whale can dive up to 2,000 meters deep to hunt giant squid, making it the deepest diving mammal."),
            zh = LocalizedContent("哪种动物潜得最深？", listOf("海豹", "鲸鱼", "抹香鲸", "海豚"), "自然", "抹香鲸可以潜到2000米深处捕食巨型乌贼，使其成为潜水最深的哺乳动物。"),
            es = LocalizedContent("¿Qué animal bucea más profundo?", listOf("la foca", "la ballena", "el cachalote", "el delfín"), "Naturaleza", "El cachalote puede bucear hasta 2.000 metros de profundidad para cazar calamares gigantes, lo que lo convierte en el mamífero que bucea más profundo.")
        ),
        BilingualQuestion(
            id = 10939, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est l'animal qui nage le plus vite?", listOf("le dauphin", "le poisson-voile", "le requin-tigre", "la truite"), "Nature", "Le poisson-voile peut atteindre 110 km/h en vitesse de pointe, ce qui en fait le nageur le plus rapide du règne animal."),
            en = LocalizedContent("Which animal swims the fastest?", listOf("dolphin", "sailfish", "tiger shark", "trout"), "Nature", "The sailfish can reach 110 km/h in top speed, making it the fastest swimmer in the animal kingdom."),
            zh = LocalizedContent("哪种动物游得最快？", listOf("海豚", "旗鱼", "虎鲨", "鳟鱼"), "自然", "旗鱼最高时速可达110公里，使其成为动物王国中游得最快的动物。"),
            es = LocalizedContent("¿Qué animal nada más rápido?", listOf("el delfín", "el pez vela", "el tiburón tigre", "la trucha"), "Naturaleza", "El pez vela puede alcanzar 110 km/h en velocidad punta, lo que lo convierte en el nadador más rápido del reino animal.")
        ),
        BilingualQuestion(
            id = 10940, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est l'animal qui marche le plus longtemps sans repos?", listOf("la girafe", "le chameau", "l'autruche", "le cheval"), "Nature", "Le chameau peut parcourir de longues distances dans le désert sans boire ni se reposer, grâce à ses réserves de graisse dans ses bosses et son métabolisme adapté."),
            en = LocalizedContent("Which animal walks the longest without rest?", listOf("giraffe", "camel", "ostrich", "horse"), "Nature", "The camel can travel long distances in the desert without drinking or resting, thanks to its fat reserves in its humps and its adapted metabolism."),
            zh = LocalizedContent("哪种动物走路最久而不休息？", listOf("长颈鹿", "骆驼", "鸵鸟", "马"), "自然", "骆驼可以在沙漠中长途跋涉而不喝水或休息，这得益于其驼峰中的脂肪储备和适应的新陈代谢。"),
            es = LocalizedContent("¿Qué animal camina más tiempo sin descanso?", listOf("la jirafa", "el camello", "el avestruz", "el caballo"), "Naturaleza", "El camello puede recorrer largas distancias en el desierto sin beber ni descansar, gracias a sus reservas de grasa en las jorobas y su metabolismo adaptado.")
        ),
        BilingualQuestion(
            id = 10941, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est l'animal qui court le plus longtemps sans s'arrêter?", listOf("le loup", "l'antilope", "le chameau", "le cheval"), "Nature", "Le chameau peut parcourir de longues distances dans le désert sans boire ni s'arrêter, grâce à ses réserves d'eau et de graisse dans ses bosses."),
            en = LocalizedContent("Which animal runs the longest without stopping?", listOf("wolf", "antelope", "camel", "horse"), "Nature", "The camel can travel long distances in the desert without drinking or stopping, thanks to its water and fat reserves in its humps."),
            zh = LocalizedContent("哪种动物跑得最久而不停？", listOf("狼", "羚羊", "骆驼", "马"), "自然", "骆驼可以在沙漠中长途跋涉而不喝水或停下，这得益于其驼峰中的水分和脂肪储备。"),
            es = LocalizedContent("¿Qué animal corre más tiempo sin parar?", listOf("el lobo", "el antílope", "el camello", "el caballo"), "Naturaleza", "El camello puede recorrer largas distancias en el desierto sin beber ni parar, gracias a sus reservas de agua y grasa en las jorobas.")
        ),
        BilingualQuestion(
            id = 10942, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est l'animal qui vole le plus longtemps sans s'arrêter?", listOf("l'albatros", "l'aigle", "la cigogne", "le condor"), "Nature", "L'albatros peut voler sans se poser pendant plusieurs semaines, voire des mois, grâce à ses longues ailes et sa technique de vol plané au-dessus des océans."),
            en = LocalizedContent("Which animal flies the longest without stopping?", listOf("albatross", "eagle", "stork", "condor"), "Nature", "The albatross can fly without landing for several weeks or even months, thanks to its long wings and gliding technique over the oceans."),
            zh = LocalizedContent("哪种动物飞得最久而不停？", listOf("信天翁", "鹰", "鹳", "秃鹫"), "自然", "信天翁可以连续飞行数周甚至数月而不着陆，这得益于其长翅膀和在海洋上空的滑翔技术。"),
            es = LocalizedContent("¿Qué animal vuela más tiempo sin parar?", listOf("el albatros", "el águila", "la cigüeña", "el cóndor"), "Naturaleza", "El albatros puede volar sin posarse durante varias semanas o incluso meses, gracias a sus largas alas y su técnica de vuelo planeado sobre los océanos.")
        ),
        BilingualQuestion(
            id = 10943, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est l'animal qui allaite le plus longtemps?", listOf("la baleine", "l'éléphant", "l'ours", "le humain"), "Nature", "L'éléphanteau peut téter jusqu'à l'âge de 3 ou 4 ans, parfois plus, ce qui constitue la plus longue période d'allaitement chez les mammifères terrestres."),
            en = LocalizedContent("Which animal nurses the longest?", listOf("whale", "elephant", "bear", "human"), "Nature", "The elephant calf can suckle until the age of 3 or 4 years, sometimes longer, which is the longest nursing period among terrestrial mammals."),
            zh = LocalizedContent("哪种动物哺乳时间最长？", listOf("鲸", "大象", "熊", "人类"), "自然", "小象可以吃奶到3或4岁，有时更长，这是陆地哺乳动物中最长的哺乳期。"),
            es = LocalizedContent("¿Qué animal amamanta durante más tiempo?", listOf("la ballena", "el elefante", "el oso", "el humano"), "Naturaleza", "La cría de elefante puede mamar hasta los 3 o 4 años, a veces más, lo que constituye el período de lactancia más largo entre los mamíferos terrestres.")
        ),
        BilingualQuestion(
            id = 10944, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est l'animal qui élève ses jeunes le plus longtemps?", listOf("l'humain", "l'éléphant", "le dauphin", "le singe"), "Nature", "L'humain a la plus longue période de dépendance juvénile parmi tous les animaux, avec des soins parentaux qui durent souvent plus d'une décennie."),
            en = LocalizedContent("Which animal raises its young the longest?", listOf("human", "elephant", "dolphin", "monkey"), "Nature", "Humans have the longest period of juvenile dependency among all animals, with parental care often lasting more than a decade."),
            zh = LocalizedContent("哪种动物养育幼崽时间最长？", listOf("人类", "大象", "海豚", "猴子"), "自然", "人类是所有动物中幼年依赖期最长的，父母照顾通常持续十多年。"),
            es = LocalizedContent("¿Qué animal cría a sus crías durante más tiempo?", listOf("el humano", "el elefante", "el delfín", "el mono"), "Naturaleza", "El humano tiene el período más largo de dependencia juvenil entre todos los animales, con cuidados parentales que a menudo duran más de una década.")
        ),
        BilingualQuestion(
            id = 10945, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est l'animal qui a la plus grande portée?", listOf("la souris", "le porc", "la lapine", "la vache"), "Nature", "La truie peut donner naissance à une portée de 8 à 14 porcelets en moyenne, avec des records dépassant 30 petits, ce qui en fait le mammifère terrestre à la plus grande portée."),
            en = LocalizedContent("Which animal has the largest litter?", listOf("mouse", "pig", "rabbit", "cow"), "Nature", "The sow can give birth to a litter of 8 to 14 piglets on average, with records exceeding 30, making it the terrestrial mammal with the largest litter."),
            zh = LocalizedContent("哪种动物一胎产仔最多？", listOf("老鼠", "猪", "兔子", "牛"), "自然", "母猪平均一胎可产8到14只仔猪，记录超过30只，是陆地哺乳动物中产仔最多的。"),
            es = LocalizedContent("¿Qué animal tiene la camada más grande?", listOf("el ratón", "el cerdo", "la coneja", "la vaca"), "Naturaleza", "La cerda puede dar a luz una camada de 8 a 14 lechones en promedio, con récords que superan los 30, lo que la convierte en el mamífero terrestre con la camada más grande.")
        ),
        BilingualQuestion(
            id = 10946, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est l'animal qui a la plus petite portée?", listOf("l'éléphant", "la baleine", "la girafe", "l'hippopotame"), "Nature", "La gestation de l'éléphante dure près de 22 mois, et elle donne généralement naissance à un seul petit, ce qui constitue la plus petite portée parmi les mammifères."),
            en = LocalizedContent("Which animal has the smallest litter?", listOf("elephant", "whale", "giraffe", "hippopotamus"), "Nature", "The elephant's gestation lasts nearly 22 months, and it usually gives birth to a single calf, which is the smallest litter among mammals."),
            zh = LocalizedContent("哪种动物一胎产仔最少？", listOf("大象", "鲸", "长颈鹿", "河马"), "自然", "大象的妊娠期近22个月，通常只生一胎，是哺乳动物中产仔最少的。"),
            es = LocalizedContent("¿Qué animal tiene la camada más pequeña?", listOf("el elefante", "la ballena", "la jirafa", "el hipopótamo"), "Naturaleza", "La gestación de la elefanta dura casi 22 meses y generalmente da a luz una sola cría, lo que constituye la camada más pequeña entre los mamíferos.")
        ),
        BilingualQuestion(
            id = 10947, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est l'animal qui se reproduit le plus rapidement?", listOf("le lapin", "la mouche", "la bactérie", "le virus"), "Nature", "Les bactéries se reproduisent par division cellulaire toutes les 20 à 30 minutes dans des conditions idéales, ce qui dépasse largement le rythme de reproduction de tout animal."),
            en = LocalizedContent("Which animal reproduces the fastest?", listOf("rabbit", "fly", "bacterium", "virus"), "Nature", "Bacteria reproduce by cell division every 20 to 30 minutes under ideal conditions, far exceeding the reproduction rate of any animal."),
            zh = LocalizedContent("哪种动物繁殖最快？", listOf("兔子", "苍蝇", "细菌", "病毒"), "自然", "细菌在理想条件下每20到30分钟通过细胞分裂繁殖，远超任何动物的繁殖速度。"),
            es = LocalizedContent("¿Qué animal se reproduce más rápido?", listOf("el conejo", "la mosca", "la bacteria", "el virus"), "Naturaleza", "Las bacterias se reproducen por división celular cada 20 a 30 minutos en condiciones ideales, superando con creces la tasa de reproducción de cualquier animal.")
        ),
        BilingualQuestion(
            id = 10948, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est l'animal qui se reproduit le plus lentement?", listOf("l'éléphant", "la baleine", "la tortue", "l'humain"), "Nature", "La baleine franche a une gestation de 12 à 14 mois et les femelles ne mettent bas qu’un seul petit tous les 3 à 5 ans, ce qui en fait le mammifère au cycle de reproduction le plus lent."),
            en = LocalizedContent("Which animal reproduces the slowest?", listOf("elephant", "whale", "turtle", "human"), "Nature", "The right whale has a gestation of 12 to 14 months and females give birth to a single calf every 3 to 5 years, making it the mammal with the slowest reproductive cycle."),
            zh = LocalizedContent("哪种动物繁殖最慢？", listOf("大象", "鲸", "乌龟", "人类"), "自然", "露脊鲸的妊娠期为12到14个月，雌鲸每3到5年才产一胎，是繁殖周期最慢的哺乳动物。"),
            es = LocalizedContent("¿Qué animal se reproduce más lentamente?", listOf("el elefante", "la ballena", "la tortuga", "el humano"), "Naturaleza", "La ballena franca tiene una gestación de 12 a 14 meses y las hembras dan a luz una sola cría cada 3 a 5 años, lo que la convierte en el mamífero con el ciclo reproductivo más lento.")
        ),
        BilingualQuestion(
            id = 10949, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est l'animal qui meurt le plus jeune?", listOf("la mouche éphémère", "la libellule", "le moustique", "la mouche"), "Nature", "La mouche éphémère vit seulement quelques heures à quelques jours à l'état adulte, ce qui en fait l'animal à la durée de vie la plus courte."),
            en = LocalizedContent("Which animal dies the youngest?", listOf("mayfly", "dragonfly", "mosquito", "fly"), "Nature", "The mayfly lives only a few hours to a few days as an adult, making it the animal with the shortest lifespan."),
            zh = LocalizedContent("哪种动物寿命最短？", listOf("蜉蝣", "蜻蜓", "蚊子", "苍蝇"), "自然", "蜉蝣成虫仅存活几小时到几天，是寿命最短的动物。"),
            es = LocalizedContent("¿Qué animal muere más joven?", listOf("la efímera", "la libélula", "el mosquito", "la mosca"), "Naturaleza", "La efímera vive solo unas horas o unos días en estado adulto, lo que la convierte en el animal con la vida más corta.")
        ),
        BilingualQuestion(
            id = 10950, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est l'animal qui meurt le plus vieux?", listOf("la tortue géante", "le perroquet", "la baleine", "le humain"), "Nature", "Certaines espèces de baleines, comme la baleine boréale, peuvent vivre plus de 200 ans, ce qui en fait les mammifères les plus longévifs connus."),
            en = LocalizedContent("Which animal lives the longest?", listOf("the giant tortoise", "the parrot", "the whale", "the human"), "Nature", "Some whale species, like the bowhead whale, can live over 200 years, making them the longest-lived mammals known."),
            zh = LocalizedContent("哪种动物寿命最长？", listOf("巨型陆龟", "鹦鹉", "鲸鱼", "人类"), "自然", "某些鲸类，如弓头鲸，可以活到200年以上，是已知最长寿的哺乳动物。"),
            es = LocalizedContent("¿Qué animal vive más tiempo?", listOf("la tortuga gigante", "el loro", "la ballena", "el humano"), "Naturaleza", "Algunas especies de ballenas, como la ballena boreal, pueden vivir más de 200 años, lo que las convierte en los mamíferos más longevos conocidos.")
        ),
        BilingualQuestion(
            id = 10951, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est l'animal qui a le meilleur système immunitaire?", listOf("la chauve-souris", "le cafard", "le humain", "la méduse"), "Nature", "Le cafard possède un système immunitaire extrêmement résistant, capable de survivre à des radiations et à des environnements hostiles grâce à des enzymes antimicrobiennes puissantes."),
            en = LocalizedContent("Which animal has the best immune system?", listOf("the bat", "the cockroach", "the human", "the jellyfish"), "Nature", "The cockroach has an extremely resilient immune system, capable of surviving radiation and hostile environments thanks to powerful antimicrobial enzymes."),
            zh = LocalizedContent("哪种动物拥有最好的免疫系统？", listOf("蝙蝠", "蟑螂", "人类", "水母"), "自然", "蟑螂拥有极其顽强的免疫系统，能够抵抗辐射和恶劣环境，这得益于其强大的抗菌酶。"),
            es = LocalizedContent("¿Qué animal tiene el mejor sistema inmunológico?", listOf("el murciélago", "la cucaracha", "el humano", "la medusa"), "Naturaleza", "La cucaracha posee un sistema inmunológico extremadamente resistente, capaz de sobrevivir a radiaciones y entornos hostiles gracias a potentes enzimas antimicrobianas.")
        ),
        BilingualQuestion(
            id = 10952, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est l'animal qui régénère le plus rapidement?", listOf("l'étoile de mer", "le lézard", "l'hydre", "la planaire"), "Nature", "L'hydre, un petit cnidaire d'eau douce, possède des cellules souches qui lui permettent de régénérer n'importe quelle partie de son corps en quelques jours."),
            en = LocalizedContent("Which animal regenerates the fastest?", listOf("the starfish", "the lizard", "the hydra", "the planarian"), "Nature", "The hydra, a small freshwater cnidarian, has stem cells that allow it to regenerate any part of its body within a few days."),
            zh = LocalizedContent("哪种动物再生速度最快？", listOf("海星", "蜥蜴", "水螅", "涡虫"), "自然", "水螅是一种小型淡水刺胞动物，其干细胞使其能在几天内再生身体的任何部分。"),
            es = LocalizedContent("¿Qué animal se regenera más rápido?", listOf("la estrella de mar", "el lagarto", "la hidra", "la planaria"), "Naturaleza", "La hidra, un pequeño cnidario de agua dulce, posee células madre que le permiten regenerar cualquier parte de su cuerpo en pocos días.")
        ),
        BilingualQuestion(
            id = 10953, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est l'animal qui vieillit le plus lentement?", listOf("la tortue géante", "la baleine", "le perroquet", "le humain"), "Nature", "Les tortues géantes ont un métabolisme extrêmement lent et une longévité exceptionnelle, pouvant dépasser 150 ans, ce qui ralentit leur processus de vieillissement."),
            en = LocalizedContent("Which animal ages the slowest?", listOf("the giant tortoise", "the whale", "the parrot", "the human"), "Nature", "Giant tortoises have an extremely slow metabolism and exceptional longevity, often exceeding 150 years, which slows their aging process."),
            zh = LocalizedContent("哪种动物衰老最慢？", listOf("巨型陆龟", "鲸鱼", "鹦鹉", "人类"), "自然", "巨型陆龟新陈代谢极慢，寿命极长，常超过150年，从而减缓了衰老过程。"),
            es = LocalizedContent("¿Qué animal envejece más lentamente?", listOf("la tortuga gigante", "la ballena", "el loro", "el humano"), "Naturaleza", "Las tortugas gigantes tienen un metabolismo extremadamente lento y una longevidad excepcional, que a menudo supera los 150 años, lo que ralentiza su proceso de envejecimiento.")
        ),
        BilingualQuestion(
            id = 10954, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est l'animal qui rétrécit avec l'âge?", listOf("le humain", "le chien", "le chat", "le singe"), "Nature", "Le corps humain perd de la masse osseuse et musculaire avec l'âge, ce qui entraîne une diminution de la taille, notamment après 40 ans."),
            en = LocalizedContent("Which animal shrinks with age?", listOf("the human", "the dog", "the cat", "the monkey"), "Nature", "The human body loses bone and muscle mass with age, leading to a decrease in height, especially after age 40."),
            zh = LocalizedContent("哪种动物会随年龄增长而缩小？", listOf("人类", "狗", "猫", "猴子"), "自然", "人体随着年龄增长会失去骨量和肌肉质量，导致身高下降，尤其是在40岁以后。"),
            es = LocalizedContent("¿Qué animal se encoge con la edad?", listOf("el humano", "el perro", "el gato", "el mono"), "Naturaleza", "El cuerpo humano pierde masa ósea y muscular con la edad, lo que provoca una disminución de la estatura, especialmente después de los 40 años.")
        ),
        BilingualQuestion(
            id = 10955, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est l'animal qui gagne du poids le plus rapidement?", listOf("l'hippopotame", "l'ours", "la baleine", "l'éléphant"), "Nature", "La baleine bleue, le plus grand animal vivant, peut prendre jusqu'à 90 kg par jour pendant l'allaitement, grâce à un lait très riche en matières grasses."),
            en = LocalizedContent("Which animal gains weight the fastest?", listOf("the hippopotamus", "the bear", "the whale", "the elephant"), "Nature", "The blue whale, the largest living animal, can gain up to 90 kg per day during nursing, thanks to very fat-rich milk."),
            zh = LocalizedContent("哪种动物增重最快？", listOf("河马", "熊", "鲸鱼", "大象"), "自然", "蓝鲸是现存最大的动物，在哺乳期间每天可增重多达90公斤，这得益于其脂肪含量极高的乳汁。"),
            es = LocalizedContent("¿Qué animal gana peso más rápido?", listOf("el hipopótamo", "el oso", "la ballena", "el elefante"), "Naturaleza", "La ballena azul, el animal más grande vivo, puede ganar hasta 90 kg por día durante la lactancia, gracias a una leche muy rica en grasas.")
        ),
        BilingualQuestion(
            id = 10956, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est l'animal qui perd du poids le plus rapidement?", listOf("la baleine", "l'ours", "le phoque", "le renne"), "Nature", "Une baleine peut perdre jusqu'à 30% de son poids corporel pendant la migration, car elle jeûne sur de longues distances."),
            en = LocalizedContent("Which animal loses weight the fastest?", listOf("the whale", "the bear", "the seal", "the reindeer"), "Nature", "A whale can lose up to 30% of its body weight during migration, as it fasts over long distances."),
            zh = LocalizedContent("哪种动物减重最快？", listOf("鲸鱼", "熊", "海豹", "驯鹿"), "自然", "鲸鱼在迁徙过程中可以减掉多达30%的体重，因为它们在长途跋涉中禁食。"),
            es = LocalizedContent("¿Qué animal pierde peso más rápido?", listOf("la ballena", "el oso", "la foca", "el reno"), "Naturaleza", "Una ballena puede perder hasta el 30% de su peso corporal durante la migración, ya que ayuna en largas distancias.")
        ),
        BilingualQuestion(
            id = 10957, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est l'animal qui change le plus de couleur?", listOf("le caméléon", "la seiche", "le lézard", "la grenouille"), "Nature", "La seiche possède des cellules cutanées appelées chromatophores qui lui permettent de modifier instantanément la couleur et la texture de sa peau pour se camoufler ou communiquer."),
            en = LocalizedContent("Which animal changes color the most?", listOf("the chameleon", "the cuttlefish", "the lizard", "the frog"), "Nature", "The cuttlefish has skin cells called chromatophores that allow it to instantly change the color and texture of its skin for camouflage or communication."),
            zh = LocalizedContent("哪种动物变色能力最强？", listOf("变色龙", "乌贼", "蜥蜴", "青蛙"), "自然", "乌贼拥有称为色素细胞的皮肤细胞，使其能够瞬间改变皮肤的颜色和纹理，用于伪装或交流。"),
            es = LocalizedContent("¿Qué animal cambia más de color?", listOf("el camaleón", "la sepia", "el lagarto", "la rana"), "Naturaleza", "La sepia posee células cutáneas llamadas cromatóforos que le permiten cambiar instantáneamente el color y la textura de su piel para camuflarse o comunicarse.")
        ),
        BilingualQuestion(
            id = 10958, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est l'animal qui change le plus de forme?", listOf("la méduse", "l'éponge", "le poulpe", "le poisson"), "Nature", "Les éponges sont des animaux capables de se déformer et de se régénérer complètement, pouvant passer à travers un tamis pour reformer leur structure."),
            en = LocalizedContent("Which animal changes shape the most?", listOf("the jellyfish", "the sponge", "the octopus", "the fish"), "Nature", "Sponges are animals capable of deforming and completely regenerating, able to pass through a sieve and reform their structure."),
            zh = LocalizedContent("哪种动物变形能力最强？", listOf("水母", "海绵", "章鱼", "鱼"), "自然", "海绵是一种能够变形并完全再生的动物，可以通过筛网并重新形成其结构。"),
            es = LocalizedContent("¿Qué animal cambia más de forma?", listOf("la medusa", "la esponja", "el pulpo", "el pez"), "Naturaleza", "Las esponjas son animales capaces de deformarse y regenerarse completamente, pudiendo pasar a través de un tamiz para reformar su estructura.")
        ),
        BilingualQuestion(
            id = 10959, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est l'animal qui change le plus de texture?", listOf("le poulpe", "la seiche", "la méduse", "l'anémone"), "Nature", "Le poulpe peut modifier l'apparence de sa peau en changeant de couleur, de motif et même de texture grâce à des cellules spécialisées appelées chromatophores et papilles musculaires."),
            en = LocalizedContent("Which animal changes texture the most?", listOf("the octopus", "the cuttlefish", "the jellyfish", "the anemone"), "Nature", "The octopus can modify the appearance of its skin by changing color, pattern, and even texture thanks to specialized cells called chromatophores and muscular papillae."),
            zh = LocalizedContent("哪种动物改变纹理的能力最强？", listOf("章鱼", "乌贼", "水母", "海葵"), "自然", "章鱼可以通过称为色素细胞和肌肉乳突的特化细胞改变皮肤的颜色、图案甚至纹理，从而改变外观。"),
            es = LocalizedContent("¿Qué animal cambia más de textura?", listOf("el pulpo", "la sepia", "la medusa", "la anémona"), "Naturaleza", "El pulpo puede modificar la apariencia de su piel cambiando de color, patrón e incluso textura gracias a células especializadas llamadas cromatóforos y papilas musculares.")
        ),
        BilingualQuestion(
            id = 10960, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est l'animal qui a le plus de muscles?", listOf("l'humain", "le cheval", "l'éléphant", "la baleine"), "Nature", "L'éléphant possède environ 150 000 muscles dans sa trompe, ce qui en fait l'animal avec le plus grand nombre de muscles."),
            en = LocalizedContent("Which animal has the most muscles?", listOf("human", "horse", "elephant", "whale"), "Nature", "The elephant has about 150,000 muscles in its trunk, making it the animal with the largest number of muscles."),
            zh = LocalizedContent("哪种动物的肌肉最多？", listOf("人类", "马", "大象", "鲸鱼"), "自然", "大象的象鼻中约有15万块肌肉，使其成为肌肉数量最多的动物。"),
            es = LocalizedContent("¿Qué animal tiene más músculos?", listOf("el humano", "el caballo", "el elefante", "la ballena"), "Naturaleza", "El elefante posee alrededor de 150.000 músculos en su trompa, lo que lo convierte en el animal con mayor cantidad de músculos.")
        ),
        BilingualQuestion(
            id = 10961, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est l'animal qui a le moins de muscles?", listOf("la méduse", "l'éponge", "la lamproie", "le ver blanc"), "Nature", "Les éponges sont des animaux filtreurs sans tissus ni organes, et elles ne possèdent pas de muscles car elles sont composées de cellules spécialisées qui leur permettent de se contracter sans système musculaire."),
            en = LocalizedContent("Which animal has the fewest muscles?", listOf("jellyfish", "sponge", "lamprey", "white worm"), "Nature", "Sponges are filter-feeding animals without tissues or organs, and they lack muscles because they are composed of specialized cells that allow contraction without a muscular system."),
            zh = LocalizedContent("哪种动物的肌肉最少？", listOf("水母", "海绵", "七鳃鳗", "白虫"), "自然", "海绵是滤食性动物，没有组织或器官，它们没有肌肉，因为由特化细胞组成，无需肌肉系统即可收缩。"),
            es = LocalizedContent("¿Qué animal tiene menos músculos?", listOf("la medusa", "la esponja", "la lamprea", "el gusano blanco"), "Naturaleza", "Las esponjas son animales filtradores sin tejidos ni órganos, y carecen de músculos porque están compuestas por células especializadas que les permiten contraerse sin un sistema muscular.")
        ),
        BilingualQuestion(
            id = 10962, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est l'animal qui a le plus d'os?", listOf("le serpent", "le poisson", "l'oiseau", "l'humain"), "Nature", "Les poissons possèdent un grand nombre d'os, notamment grâce à leurs arêtes et à leur squelette complexe, ce qui leur confère le record parmi les animaux."),
            en = LocalizedContent("Which animal has the most bones?", listOf("snake", "fish", "bird", "human"), "Nature", "Fish have a large number of bones, especially due to their ribs and complex skeleton, giving them the record among animals."),
            zh = LocalizedContent("哪种动物的骨头最多？", listOf("蛇", "鱼", "鸟", "人类"), "自然", "鱼类的骨头数量很多，尤其是它们的鱼刺和复杂的骨骼结构，使其在动物中拥有最多的骨头。"),
            es = LocalizedContent("¿Qué animal tiene más huesos?", listOf("la serpiente", "el pez", "el ave", "el humano"), "Naturaleza", "Los peces poseen una gran cantidad de huesos, especialmente debido a sus espinas y esqueleto complejo, lo que les otorga el récord entre los animales.")
        ),
        BilingualQuestion(
            id = 10963, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est l'animal qui a le moins d'os?", listOf("la méduse", "l'éponge", "le vers", "la limace"), "Nature", "La méduse n'a pas d'os, car elle est composée à 95 % d'eau et son corps est gélatineux, sans squelette interne ni externe."),
            en = LocalizedContent("Which animal has the fewest bones?", listOf("jellyfish", "sponge", "worm", "slug"), "Nature", "Jellyfish have no bones, as they are composed of 95% water and have a gelatinous body with no internal or external skeleton."),
            zh = LocalizedContent("哪种动物的骨头最少？", listOf("水母", "海绵", "蠕虫", "蛞蝓"), "自然", "水母没有骨头，因为它们由95%的水组成，身体呈凝胶状，没有内部或外部骨骼。"),
            es = LocalizedContent("¿Qué animal tiene menos huesos?", listOf("la medusa", "la esponja", "el gusano", "la babosa"), "Naturaleza", "La medusa no tiene huesos, ya que está compuesta en un 95% de agua y su cuerpo es gelatinoso, sin esqueleto interno ni externo.")
        ),
        BilingualQuestion(
            id = 10964, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est l'animal qui a le plus de nerfs?", listOf("le poulpe", "l'humain", "le dauphin", "le singe"), "Nature", "Le poulpe possède un système nerveux très développé avec environ 500 millions de neurones, dont la majorité sont répartis dans ses bras, ce qui lui confère une grande capacité de contrôle et de coordination."),
            en = LocalizedContent("Which animal has the most nerves?", listOf("octopus", "human", "dolphin", "monkey"), "Nature", "The octopus has a highly developed nervous system with about 500 million neurons, most of which are distributed in its arms, giving it great control and coordination."),
            zh = LocalizedContent("哪种动物的神经最多？", listOf("章鱼", "人类", "海豚", "猴子"), "自然", "章鱼拥有高度发达的神经系统，约有5亿个神经元，其中大部分分布在触手中，使其具有强大的控制和协调能力。"),
            es = LocalizedContent("¿Qué animal tiene más nervios?", listOf("el pulpo", "el humano", "el delfín", "el mono"), "Naturaleza", "El pulpo posee un sistema nervioso muy desarrollado con unos 500 millones de neuronas, la mayoría distribuidas en sus brazos, lo que le confiere gran capacidad de control y coordinación.")
        ),
        BilingualQuestion(
            id = 10965, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est l'animal qui a le moins de nerfs?", listOf("la méduse", "l'éponge", "la limace", "le vers blanc"), "Nature", "Les éponges sont des animaux filtreurs dépourvus de système nerveux, de muscles et d'organes, ce qui en fait l'animal avec le moins de nerfs."),
            en = LocalizedContent("Which animal has the fewest nerves?", listOf("jellyfish", "sponge", "slug", "white worm"), "Nature", "Sponges are filter-feeding animals lacking a nervous system, muscles, and organs, making them the animal with the fewest nerves."),
            zh = LocalizedContent("哪种动物的神经最少？", listOf("水母", "海绵", "蛞蝓", "白虫"), "自然", "海绵是滤食性动物，没有神经系统、肌肉和器官，因此是神经最少的动物。"),
            es = LocalizedContent("¿Qué animal tiene menos nervios?", listOf("la medusa", "la esponja", "la babosa", "el gusano blanco"), "Naturaleza", "Las esponjas son animales filtradores que carecen de sistema nervioso, músculos y órganos, lo que las convierte en el animal con menos nervios.")
        ),
        BilingualQuestion(
            id = 10966, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est l'animal qui a le plus de cheveux par centimètre carré?", listOf("la loutre", "le chat", "le chien", "le singe"), "Nature", "La loutre possède la fourrure la plus dense du règne animal, avec jusqu'à 125 000 poils par centimètre carré, ce qui lui permet de rester au sec et isolée dans l'eau froide."),
            en = LocalizedContent("Which animal has the most hairs per square centimeter?", listOf("otter", "cat", "dog", "monkey"), "Nature", "The otter has the densest fur in the animal kingdom, with up to 125,000 hairs per square centimeter, allowing it to stay dry and insulated in cold water."),
            zh = LocalizedContent("哪种动物每平方厘米的毛发最多？", listOf("水獭", "猫", "狗", "猴子"), "自然", "水獭拥有动物界最密集的皮毛，每平方厘米多达12.5万根毛发，使其在冷水中保持干燥和隔热。"),
            es = LocalizedContent("¿Qué animal tiene más pelos por centímetro cuadrado?", listOf("la nutria", "el gato", "el perro", "el mono"), "Naturaleza", "La nutria posee el pelaje más denso del reino animal, con hasta 125.000 pelos por centímetro cuadrado, lo que le permite mantenerse seca y aislada en el agua fría.")
        ),
        BilingualQuestion(
            id = 10967, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est l'animal qui a le plus d'écailles?", listOf("le poisson", "le serpent", "le pangolin", "l'armadillo"), "Nature", "Le pangolin est le mammifère le plus couvert d'écailles, car son corps est entièrement recouvert d'écailles de kératine, ce qui le distingue de tous les autres animaux."),
            en = LocalizedContent("Which animal has the most scales?", listOf("fish", "snake", "pangolin", "armadillo"), "Nature", "The pangolin is the mammal most covered in scales, as its body is entirely covered with keratin scales, distinguishing it from all other animals."),
            zh = LocalizedContent("哪种动物的鳞片最多？", listOf("鱼", "蛇", "穿山甲", "犰狳"), "自然", "穿山甲是鳞片覆盖最多的哺乳动物，其全身覆盖着角蛋白鳞片，与其他动物截然不同。"),
            es = LocalizedContent("¿Qué animal tiene más escamas?", listOf("el pez", "la serpiente", "el pangolín", "el armadillo"), "Naturaleza", "El pangolín es el mamífero más cubierto de escamas, ya que su cuerpo está completamente recubierto de escamas de queratina, lo que lo distingue de todos los demás animales.")
        ),
        BilingualQuestion(
            id = 10968, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est l'animal qui a le plus de plumes?", listOf("l'autruche", "le cygne", "le paon", "l'aigle"), "Nature", "Le cygne possède jusqu'à 25 000 plumes, soit le plus grand nombre connu chez un oiseau, ce qui lui permet de flotter et de se protéger du froid."),
            en = LocalizedContent("Which animal has the most feathers?", listOf("ostrich", "swan", "peacock", "eagle"), "Nature", "The swan has up to 25,000 feathers, the largest known number in a bird, allowing it to float and protect itself from the cold."),
            zh = LocalizedContent("哪种动物的羽毛最多？", listOf("鸵鸟", "天鹅", "孔雀", "鹰"), "自然", "天鹅有多达2.5万根羽毛，是已知鸟类中数量最多的，使其能够漂浮并抵御寒冷。"),
            es = LocalizedContent("¿Qué animal tiene más plumas?", listOf("el avestruz", "el cisne", "el pavo real", "el águila"), "Naturaleza", "El cisne posee hasta 25.000 plumas, la mayor cantidad conocida en un ave, lo que le permite flotar y protegerse del frío.")
        ),
        BilingualQuestion(
            id = 10969, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est l'animal qui a le plus de piquants?", listOf("le porc-épic", "l'oursin", "le hérisson", "l'échidné"), "Nature", "L'oursin possède des milliers de piquants mobiles sur sa coquille calcaire, ce qui en fait l'animal le plus épineux."),
            en = LocalizedContent("Which animal has the most spines?", listOf("porcupine", "sea urchin", "hedgehog", "echidna"), "Nature", "The sea urchin has thousands of movable spines on its calcareous shell, making it the most spiny animal."),
            zh = LocalizedContent("哪种动物的刺最多？", listOf("豪猪", "海胆", "刺猬", "针鼹"), "自然", "海胆的钙质壳上有数千根可移动的刺，使其成为最多刺的动物。"),
            es = LocalizedContent("¿Qué animal tiene más púas?", listOf("el puercoespín", "el erizo de mar", "el erizo", "el equidna"), "Naturaleza", "El erizo de mar posee miles de púas móviles en su concha calcárea, lo que lo convierte en el animal más espinoso.")
        ),
        BilingualQuestion(
            id = 10970, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est l'animal qui a le plus de défenses?", listOf("l'éléphant", "le morse", "le narval", "l'hippopotame"), "Nature", "L'hippopotame possède de grandes canines et incisives en ivoire, utilisées pour le combat et la défense du territoire."),
            en = LocalizedContent("Which animal has the most tusks?", listOf("elephant", "walrus", "narwhal", "hippopotamus"), "Nature", "The hippopotamus has large canine and incisor teeth made of ivory, used for fighting and territory defense."),
            zh = LocalizedContent("哪种动物的獠牙最多？", listOf("大象", "海象", "独角鲸", "河马"), "自然", "河马拥有巨大的犬齿和门齿，由象牙质构成，用于战斗和领地防御。"),
            es = LocalizedContent("¿Qué animal tiene más colmillos?", listOf("elefante", "morsa", "narval", "hipopótamo"), "Naturaleza", "El hipopótamo posee grandes caninos e incisivos de marfil, utilizados para la lucha y la defensa del territorio.")
        ),
        BilingualQuestion(
            id = 10971, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est l'animal qui a le plus de cornes?", listOf("la girafe", "l'antilope", "le mouton", "la chèvre"), "Nature", "L'antilope saïga possède le plus grand nombre de cornes parmi les mammifères, avec deux paires distinctes, une caractéristique unique chez les bovidés."),
            en = LocalizedContent("Which animal has the most horns?", listOf("giraffe", "antelope", "sheep", "goat"), "Nature", "The saiga antelope has the highest number of horns among mammals, with two distinct pairs, a unique characteristic among bovids."),
            zh = LocalizedContent("哪种动物的角最多？", listOf("长颈鹿", "羚羊", "绵羊", "山羊"), "自然", "赛加羚羊拥有哺乳动物中最多的角，有两对明显的角，这在牛科动物中是独一无二的特征。"),
            es = LocalizedContent("¿Qué animal tiene más cuernos?", listOf("jirafa", "antílope", "oveja", "cabra"), "Naturaleza", "El antílope saiga posee el mayor número de cuernos entre los mamíferos, con dos pares distintos, una característica única entre los bóvidos.")
        ),
        BilingualQuestion(
            id = 10972, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est l'animal qui a le plus de bois?", listOf("l'élan", "le renne", "le cerf", "le chevreuil"), "Nature", "L'élan possède les plus grands bois parmi les cervidés, avec une envergure pouvant atteindre deux mètres. Ces bois sont portés par les mâles et tombent chaque hiver."),
            en = LocalizedContent("Which animal has the largest antlers?", listOf("moose", "reindeer", "deer", "roe deer"), "Nature", "The moose has the largest antlers among deer species, with a span that can reach two meters. These antlers are carried by males and shed each winter."),
            zh = LocalizedContent("哪种动物的鹿角最大？", listOf("驼鹿", "驯鹿", "鹿", "狍"), "自然", "驼鹿拥有鹿科动物中最大的鹿角，宽度可达两米。这些鹿角由雄性携带，每年冬天脱落。"),
            es = LocalizedContent("¿Qué animal tiene las astas más grandes?", listOf("alce", "reno", "ciervo", "corzo"), "Naturaleza", "El alce posee las astas más grandes entre los cérvidos, con una envergadura que puede alcanzar los dos metros. Estas astas son portadas por los machos y se caen cada invierno.")
        ),
        BilingualQuestion(
            id = 10973, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est l'animal qui a les ongles les plus longs?", listOf("l'ours", "le pangolin", "le paresseux", "l'oryctérope"), "Nature", "Les paresseux ont des griffes très longues, mesurant jusqu'à 7,5 cm, qui leur servent à s'accrocher aux branches dans la canopée des forêts tropicales."),
            en = LocalizedContent("Which animal has the longest claws?", listOf("bear", "pangolin", "sloth", "aardvark"), "Nature", "Sloths have very long claws, measuring up to 7.5 cm, which they use to hang from branches in the tropical forest canopy."),
            zh = LocalizedContent("哪种动物的爪子最长？", listOf("熊", "穿山甲", "树懒", "土豚"), "自然", "树懒的爪子非常长，可达7.5厘米，用于悬挂在热带雨林树冠的树枝上。"),
            es = LocalizedContent("¿Qué animal tiene las garras más largas?", listOf("oso", "pangolín", "perezoso", "cerdo hormiguero"), "Naturaleza", "Los perezosos tienen garras muy largas, de hasta 7,5 cm, que utilizan para colgarse de las ramas en el dosel de los bosques tropicales.")
        ),
        BilingualQuestion(
            id = 10974, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est l'animal qui a les serres les plus puissantes?", listOf("l'aigle", "le faucon", "la chouette", "le hibou"), "Nature", "L'aigle possède des serres capables d'exercer une pression de plusieurs centaines de kilos par centimètre carré, lui permettant de saisir et tuer des proies de grande taille."),
            en = LocalizedContent("Which animal has the most powerful talons?", listOf("eagle", "falcon", "owl", "horned owl"), "Nature", "The eagle has talons capable of exerting a pressure of several hundred kilograms per square centimeter, allowing it to grasp and kill large prey."),
            zh = LocalizedContent("哪种动物的爪子最有力？", listOf("鹰", "隼", "猫头鹰", "雕鸮"), "自然", "鹰的爪子能够施加每平方厘米数百公斤的压力，使其能够抓住并杀死大型猎物。"),
            es = LocalizedContent("¿Qué animal tiene las garras más poderosas?", listOf("águila", "halcón", "búho", "búho real"), "Naturaleza", "El águila posee garras capaces de ejercer una presión de varios cientos de kilogramos por centímetro cuadrado, lo que le permite agarrar y matar presas de gran tamaño.")
        ),
        BilingualQuestion(
            id = 10975, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est l'animal qui a les crocs les plus longs?", listOf("l'hippopotame", "le morse", "l'éléphant", "le sanglier"), "Nature", "Les canines supérieures du morse peuvent atteindre jusqu'à un mètre de long chez les mâles, servant à briser la glace et à se hisser hors de l'eau."),
            en = LocalizedContent("Which animal has the longest fangs?", listOf("hippopotamus", "walrus", "elephant", "wild boar"), "Nature", "The upper canines of the walrus can reach up to one meter in length in males, used to break ice and haul themselves out of the water."),
            zh = LocalizedContent("哪种动物的獠牙最长？", listOf("河马", "海象", "大象", "野猪"), "自然", "雄性海象的上犬齿可长达一米，用于破冰和将自己拖出水面。"),
            es = LocalizedContent("¿Qué animal tiene los colmillos más largos?", listOf("hipopótamo", "morsa", "elefante", "jabalí"), "Naturaleza", "Los caninos superiores de la morsa pueden alcanzar hasta un metro de longitud en los machos, sirviendo para romper el hielo y salir del agua.")
        ),
        BilingualQuestion(
            id = 10976, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est l'animal qui a les canines les plus pointues?", listOf("le cobra", "la vipère", "le crotale", "le mamba noir"), "Nature", "Le crotale possède des canines creuses et extrêmement pointues, capables d'injecter du venin, ce qui en fait l'animal avec les canines les plus acérées."),
            en = LocalizedContent("Which animal has the sharpest fangs?", listOf("cobra", "viper", "rattlesnake", "black mamba"), "Nature", "The rattlesnake has hollow, extremely sharp fangs capable of injecting venom, making it the animal with the sharpest fangs."),
            zh = LocalizedContent("哪种动物的毒牙最锋利？", listOf("眼镜蛇", "蝰蛇", "响尾蛇", "黑曼巴蛇"), "自然", "响尾蛇拥有中空且极其锋利的毒牙，能够注射毒液，使其成为毒牙最锋利的动物。"),
            es = LocalizedContent("¿Qué animal tiene los colmillos más afilados?", listOf("cobra", "víbora", "cascabel", "mamba negra"), "Naturaleza", "La serpiente de cascabel posee colmillos huecos y extremadamente afilados, capaces de inyectar veneno, lo que la convierte en el animal con los colmillos más agudos.")
        ),
        BilingualQuestion(
            id = 10977, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est l'animal qui a les ailes les plus larges?", listOf("l'albatros", "l'aigle", "le condor", "la mouche"), "Nature", "Le condor des Andes détient le record d'envergure parmi les oiseaux terrestres, avec des ailes pouvant atteindre 3,2 mètres."),
            en = LocalizedContent("Which animal has the widest wingspan?", listOf("albatross", "eagle", "condor", "fly"), "Nature", "The Andean condor holds the record for wingspan among terrestrial birds, with wings that can reach 3.2 meters."),
            zh = LocalizedContent("哪种动物的翼展最宽？", listOf("信天翁", "鹰", "秃鹫", "苍蝇"), "自然", "安第斯秃鹫保持着陆地鸟类翼展的记录，翅膀可达3.2米。"),
            es = LocalizedContent("¿Qué animal tiene la envergadura más ancha?", listOf("albatros", "águila", "cóndor", "mosca"), "Naturaleza", "El cóndor de los Andes posee el récord de envergadura entre las aves terrestres, con alas que pueden alcanzar los 3,2 metros.")
        ),
        BilingualQuestion(
            id = 10978, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est l'animal qui a les nageoires les plus grandes?", listOf("la raie manta", "le poisson-voile", "la baleine bleue", "le requin-baleine"), "Nature", "La raie manta possède les plus grandes nageoires pectorales, pouvant atteindre jusqu'à 7 mètres d'envergure, ce qui lui permet de planer dans l'eau comme un oiseau."),
            en = LocalizedContent("Which animal has the largest fins?", listOf("manta ray", "sailfish", "blue whale", "whale shark"), "Nature", "The manta ray has the largest pectoral fins, reaching up to 7 meters in span, allowing it to glide through the water like a bird."),
            zh = LocalizedContent("哪种动物的鳍最大？", listOf("蝠鲼", "旗鱼", "蓝鲸", "鲸鲨"), "自然", "蝠鲼拥有最大的胸鳍，宽度可达7米，使其能够像鸟一样在水中滑翔。"),
            es = LocalizedContent("¿Qué animal tiene las aletas más grandes?", listOf("raya manta", "pez vela", "ballena azul", "tiburón ballena"), "Naturaleza", "La raya manta posee las aletas pectorales más grandes, con una envergadura de hasta 7 metros, lo que le permite planear en el agua como un ave.")
        ),
        BilingualQuestion(
            id = 10979, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est l'animal qui a la queue la plus longue?", listOf("le lion", "le singe hurleur", "le lézard-dragon barbu", "le rat musqué"), "Nature", "Le singe hurleur possède une queue préhensile qui peut mesurer jusqu'à un mètre de long, soit plus que la longueur de son corps. Cette queue lui sert à s'agripper aux branches dans la canopée."),
            en = LocalizedContent("Which animal has the longest tail?", listOf("lion", "howler monkey", "bearded dragon lizard", "muskrat"), "Nature", "The howler monkey has a prehensile tail that can measure up to one meter in length, longer than its body. This tail is used to grip branches in the canopy."),
            zh = LocalizedContent("哪种动物的尾巴最长？", listOf("狮子", "吼猴", "鬃狮蜥", "麝鼠"), "自然", "吼猴有一条可卷曲的尾巴，长度可达一米，超过其身体长度。这条尾巴用于在树冠中抓握树枝。"),
            es = LocalizedContent("¿Qué animal tiene la cola más larga?", listOf("león", "mono aullador", "dragón barbudo", "rata almizclera"), "Naturaleza", "El mono aullador posee una cola prensil que puede medir hasta un metro de largo, más que la longitud de su cuerpo. Esta cola le sirve para agarrarse a las ramas en el dosel.")
        ),
        BilingualQuestion(
            id = 10980, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est l'animal qui a la queue la plus préhensile?", listOf("le singe", "l'opossum", "l'iguane", "le caméléon"), "Nature", "Les singes du Nouveau Monde, comme le singe-araignée, possèdent une queue préhensile capable de saisir des branches, servant de cinquième membre pour se déplacer dans les arbres."),
            en = LocalizedContent("Which animal has the most prehensile tail?", listOf("monkey", "opossum", "iguana", "chameleon"), "Nature", "New World monkeys, like the spider monkey, have a prehensile tail capable of grasping branches, serving as a fifth limb for moving through trees."),
            zh = LocalizedContent("哪种动物的尾巴最善于抓握？", listOf("猴子", "负鼠", "鬣蜥", "变色龙"), "自然", "新世界猴（如蜘蛛猴）拥有能抓握树枝的卷尾，作为第五肢在树间移动。"),
            es = LocalizedContent("¿Qué animal tiene la cola más prensil?", listOf("el mono", "la zarigüeya", "la iguana", "el camaleón"), "Naturaleza", "Los monos del Nuevo Mundo, como el mono araña, poseen una cola prensil capaz de agarrar ramas, sirviendo como un quinto miembro para moverse entre los árboles.")
        ),
        BilingualQuestion(
            id = 10981, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est l'animal qui a la langue la plus longue?", listOf("la girafe", "le lézard-dragon de Komodo", "le fourmilier", "l'autruche"), "Nature", "La girafe possède une langue pouvant atteindre 45 à 50 centimètres, ce qui lui permet de saisir les feuilles d’acacia épineuses sans se blesser."),
            en = LocalizedContent("Which animal has the longest tongue?", listOf("giraffe", "Komodo dragon", "anteater", "ostrich"), "Nature", "The giraffe has a tongue that can reach 45 to 50 centimeters, allowing it to grasp thorny acacia leaves without injury."),
            zh = LocalizedContent("哪种动物的舌头最长？", listOf("长颈鹿", "科莫多巨蜥", "食蚁兽", "鸵鸟"), "自然", "长颈鹿的舌头可达45至50厘米，使其能够抓取带刺的金合欢树叶而不受伤。"),
            es = LocalizedContent("¿Qué animal tiene la lengua más larga?", listOf("la jirafa", "el dragón de Komodo", "el oso hormiguero", "el avestruz"), "Naturaleza", "La jirafa posee una lengua que puede alcanzar 45 a 50 centímetros, lo que le permite agarrar hojas espinosas de acacia sin lastimarse.")
        ),
        BilingualQuestion(
            id = 10982, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est l'animal qui a la langue la plus préhensile?", listOf("le caméléon", "la girafe", "le fourmilier", "le koala"), "Nature", "La langue du caméléon peut s'allonger jusqu'à deux fois la taille de son corps et est dotée d'un muscle spécial qui lui permet d'attraper des proies avec une grande précision."),
            en = LocalizedContent("Which animal has the most prehensile tongue?", listOf("chameleon", "giraffe", "anteater", "koala"), "Nature", "The chameleon's tongue can extend up to twice its body length and is equipped with a special muscle that allows it to catch prey with great precision."),
            zh = LocalizedContent("哪种动物的舌头最善于抓握？", listOf("变色龙", "长颈鹿", "食蚁兽", "考拉"), "自然", "变色龙的舌头可伸展至体长的两倍，并配有特殊肌肉，使其能精准捕捉猎物。"),
            es = LocalizedContent("¿Qué animal tiene la lengua más prensil?", listOf("el camaleón", "la jirafa", "el oso hormiguero", "el koala"), "Naturaleza", "La lengua del camaleón puede extenderse hasta el doble de la longitud de su cuerpo y está dotada de un músculo especial que le permite atrapar presas con gran precisión.")
        ),
        BilingualQuestion(
            id = 10983, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est l'animal qui a les oreilles les plus longues?", listOf("le lièvre du Jackrabbit", "l'âne", "la chauve-souris", "le fennec"), "Nature", "La chauve-souris à oreilles de souris possède des oreilles pouvant atteindre 4 centimètres, soit près d'un tiers de la longueur de son corps."),
            en = LocalizedContent("Which animal has the longest ears?", listOf("jackrabbit", "donkey", "bat", "fennec fox"), "Nature", "The mouse-eared bat has ears that can reach 4 centimeters, nearly a third of its body length."),
            zh = LocalizedContent("哪种动物的耳朵最长？", listOf("长耳大野兔", "驴", "蝙蝠", "耳廓狐"), "自然", "鼠耳蝠的耳朵可达4厘米，接近其体长的三分之一。"),
            es = LocalizedContent("¿Qué animal tiene las orejas más largas?", listOf("la liebre de Jack", "el burro", "el murciélago", "el fénec"), "Naturaleza", "El murciélago orejudo tiene orejas que pueden alcanzar 4 centímetros, casi un tercio de la longitud de su cuerpo.")
        ),
        BilingualQuestion(
            id = 10984, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est l'animal qui a les oreilles les plus mobiles?", listOf("le chat", "le chien", "le cheval", "l'âne"), "Nature", "Le chat possède 32 muscles dans chaque oreille, lui permettant de les orienter indépendamment à 180 degrés pour localiser précisément les sons."),
            en = LocalizedContent("Which animal has the most mobile ears?", listOf("cat", "dog", "horse", "donkey"), "Nature", "The cat has 32 muscles in each ear, allowing it to rotate them independently up to 180 degrees to precisely locate sounds."),
            zh = LocalizedContent("哪种动物的耳朵最灵活？", listOf("猫", "狗", "马", "驴"), "自然", "猫的每只耳朵有32块肌肉，使其能独立旋转180度，精确定位声音。"),
            es = LocalizedContent("¿Qué animal tiene las orejas más móviles?", listOf("el gato", "el perro", "el caballo", "el burro"), "Naturaleza", "El gato posee 32 músculos en cada oreja, lo que le permite girarlas independientemente hasta 180 grados para localizar sonidos con precisión.")
        ),
        BilingualQuestion(
            id = 10985, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est l'animal qui a le nez le plus sensible?", listOf("le chien", "le requin", "l'ours", "le loup"), "Nature", "Le chien possède environ 300 millions de récepteurs olfactifs, contre 5 à 6 millions chez l'humain, ce qui lui confère une capacité de détection des odeurs extrêmement développée."),
            en = LocalizedContent("Which animal has the most sensitive nose?", listOf("dog", "shark", "bear", "wolf"), "Nature", "The dog has about 300 million olfactory receptors, compared to 5 to 6 million in humans, giving it an extremely developed sense of smell."),
            zh = LocalizedContent("哪种动物的鼻子最灵敏？", listOf("狗", "鲨鱼", "熊", "狼"), "自然", "狗拥有约3亿个嗅觉受体，而人类只有500万到600万个，因此其嗅觉极为发达。"),
            es = LocalizedContent("¿Qué animal tiene la nariz más sensible?", listOf("el perro", "el tiburón", "el oso", "el lobo"), "Naturaleza", "El perro posee unos 300 millones de receptores olfativos, frente a los 5 a 6 millones en los humanos, lo que le confiere un sentido del olfato extremadamente desarrollado.")
        ),
        BilingualQuestion(
            id = 10986, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est l'animal qui a les naseaux les plus grands?", listOf("l'hippopotame", "l'éléphant", "la baleine", "le chameau"), "Nature", "La baleine possède les plus grands naseaux du règne animal, appelés évents, situés sur le dessus de sa tête. Ces orifices nasaux peuvent mesurer jusqu'à 30 centimètres de large chez certaines espèces."),
            en = LocalizedContent("Which animal has the largest nostrils?", listOf("hippopotamus", "elephant", "whale", "camel"), "Nature", "The whale has the largest nostrils in the animal kingdom, called blowholes, located on top of its head. These nasal openings can be up to 30 centimeters wide in some species."),
            zh = LocalizedContent("哪种动物的鼻孔最大？", listOf("河马", "大象", "鲸鱼", "骆驼"), "自然", "鲸鱼拥有动物王国中最大的鼻孔，称为喷水孔，位于头顶。某些物种的鼻孔宽度可达30厘米。"),
            es = LocalizedContent("¿Qué animal tiene las fosas nasales más grandes?", listOf("el hipopótamo", "el elefante", "la ballena", "el camello"), "Naturaleza", "La ballena posee las fosas nasales más grandes del reino animal, llamados espiráculos, situados en la parte superior de la cabeza. Estas aberturas nasales pueden medir hasta 30 centímetros de ancho en algunas especies.")
        ),
        BilingualQuestion(
            id = 10987, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est l'animal qui a les pupilles les plus grandes?", listOf("la chauve-souris", "le loup", "la chouette", "le chat"), "Nature", "La chouette a des pupilles très larges pour capter un maximum de lumière, ce qui lui permet de chasser efficacement la nuit."),
            en = LocalizedContent("Which animal has the largest pupils?", listOf("bat", "wolf", "owl", "cat"), "Nature", "The owl has very large pupils to capture maximum light, allowing it to hunt effectively at night."),
            zh = LocalizedContent("哪种动物的瞳孔最大？", listOf("蝙蝠", "狼", "猫头鹰", "猫"), "自然", "猫头鹰的瞳孔非常大，以捕捉最多光线，使其能在夜间有效捕猎。"),
            es = LocalizedContent("¿Qué animal tiene las pupilas más grandes?", listOf("el murciélago", "el lobo", "el búho", "el gato"), "Naturaleza", "El búho tiene pupilas muy grandes para captar la máxima luz, lo que le permite cazar eficazmente por la noche.")
        ),
        BilingualQuestion(
            id = 10988, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est l'animal qui a les pupilles les plus petites?", listOf("l'aigle", "l'autruche", "le cheval", "le lapin"), "Nature", "Les aigles ont des pupilles très petites par rapport à leur taille oculaire, ce qui leur permet de voir avec une acuité extrême tout en limitant l'éblouissement."),
            en = LocalizedContent("Which animal has the smallest pupils?", listOf("eagle", "ostrich", "horse", "rabbit"), "Nature", "Eagles have very small pupils relative to their eye size, allowing them to see with extreme acuity while limiting glare."),
            zh = LocalizedContent("哪种动物的瞳孔最小？", listOf("鹰", "鸵鸟", "马", "兔子"), "自然", "鹰的瞳孔相对于眼睛尺寸非常小，使其能拥有极高视力，同时减少眩光。"),
            es = LocalizedContent("¿Qué animal tiene las pupilas más pequeñas?", listOf("el águila", "el avestruz", "el caballo", "el conejo"), "Naturaleza", "Las águilas tienen pupilas muy pequeñas en relación con el tamaño de sus ojos, lo que les permite ver con extrema agudeza mientras limitan el deslumbramiento.")
        ),
        BilingualQuestion(
            id = 10989, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est l'animal qui a les yeux les plus rapprochés?", listOf("le poisson-globe", "l'hippocampe", "le poisson-archer", "le poisson-papillon"), "Nature", "Le poisson-globe a les yeux très rapprochés car ils sont positionnés sur le dessus de sa tête, ce qui lui offre une vision binoculaire pour mieux viser ses proies."),
            en = LocalizedContent("Which animal has the closest-set eyes?", listOf("pufferfish", "seahorse", "archerfish", "butterflyfish"), "Nature", "The pufferfish has very close-set eyes because they are positioned on top of its head, providing binocular vision for better aiming at prey."),
            zh = LocalizedContent("哪种动物的眼睛间距最近？", listOf("河豚", "海马", "射水鱼", "蝴蝶鱼"), "自然", "河豚的眼睛非常靠近，因为它们位于头顶，提供双目视觉，以便更准确地瞄准猎物。"),
            es = LocalizedContent("¿Qué animal tiene los ojos más juntos?", listOf("el pez globo", "el caballito de mar", "el pez arquero", "el pez mariposa"), "Naturaleza", "El pez globo tiene los ojos muy juntos porque están situados en la parte superior de su cabeza, lo que le proporciona visión binocular para apuntar mejor a sus presas.")
        ),
        BilingualQuestion(
            id = 10990, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est l'animal qui a les yeux les plus éloignés?", listOf("le cheval", "la gazelle", "la girafe", "l'antilope"), "Nature", "Chez le cheval, les yeux sont placés très latéralement sur la tête, ce qui lui offre un champ de vision panoramique de près de 360 degrés."),
            en = LocalizedContent("Which animal has the most widely spaced eyes?", listOf("horse", "gazelle", "giraffe", "antelope"), "Nature", "In horses, the eyes are placed very laterally on the head, giving them a panoramic field of vision of nearly 360 degrees."),
            zh = LocalizedContent("哪种动物的眼睛间距最远？", listOf("马", "瞪羚", "长颈鹿", "羚羊"), "自然", "马的眼睛位于头部两侧，提供了近360度的全景视野。"),
            es = LocalizedContent("¿Qué animal tiene los ojos más separados?", listOf("el caballo", "la gacela", "la jirafa", "el antílope"), "Naturaleza", "En el caballo, los ojos están colocados muy lateralmente en la cabeza, lo que le ofrece un campo de visión panorámico de casi 360 grados.")
        ),
        BilingualQuestion(
            id = 10991, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est l'animal qui a les yeux les plus hauts?", listOf("l'hippopotame", "la girafe", "l'autruche", "le chameau"), "Nature", "Les yeux de l'hippopotame sont placés haut sur son crâne, ce qui lui permet de voir au-dessus de l'eau tout en restant quasiment immergé."),
            en = LocalizedContent("Which animal has the highest eyes?", listOf("hippopotamus", "giraffe", "ostrich", "camel"), "Nature", "The hippopotamus's eyes are placed high on its skull, allowing it to see above water while remaining almost completely submerged."),
            zh = LocalizedContent("哪种动物的眼睛位置最高？", listOf("河马", "长颈鹿", "鸵鸟", "骆驼"), "自然", "河马的眼睛位于头骨高处，使其能在几乎完全浸没时看到水面以上。"),
            es = LocalizedContent("¿Qué animal tiene los ojos más altos?", listOf("el hipopótamo", "la jirafa", "el avestruz", "el camello"), "Naturaleza", "Los ojos del hipopótamo están colocados en lo alto de su cráneo, lo que le permite ver sobre el agua mientras permanece casi completamente sumergido.")
        ),
        BilingualQuestion(
            id = 10992, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est l'animal qui a les yeux les plus bas?", listOf("le poisson-chat", "la baudroie", "le poisson des abysses", "le poisson-globe"), "Nature", "Le poisson-chat a des yeux situés très bas sur son corps, presque sous la tête, ce qui lui permet de fouiller le fond des eaux troubles pour trouver sa nourriture."),
            en = LocalizedContent("Which animal has the lowest eyes?", listOf("catfish", "anglerfish", "deep-sea fish", "pufferfish"), "Nature", "Catfish have eyes located very low on their body, almost under the head, allowing them to scour the muddy bottom for food."),
            zh = LocalizedContent("哪种动物的眼睛位置最低？", listOf("鲶鱼", "鮟鱇鱼", "深海鱼", "河豚"), "自然", "鲶鱼的眼睛位于身体非常低的位置，几乎在头部下方，使其能在浑浊的水底搜寻食物。"),
            es = LocalizedContent("¿Qué animal tiene los ojos más bajos?", listOf("el pez gato", "el rape", "el pez abisal", "el pez globo"), "Naturaleza", "El pez gato tiene ojos situados muy bajos en su cuerpo, casi debajo de la cabeza, lo que le permite escarbar en el fondo fangoso para encontrar alimento.")
        ),
        BilingualQuestion(
            id = 10993, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est l'animal qui a les yeux les plus latéraux?", listOf("le cheval", "la gazelle", "le lapin", "la girafe"), "Nature", "Le lapin possède des yeux placés très latéralement, ce qui lui offre un champ de vision presque à 360 degrés pour détecter les prédateurs."),
            en = LocalizedContent("Which animal has the most lateral eyes?", listOf("horse", "gazelle", "rabbit", "giraffe"), "Nature", "Rabbits have eyes placed very laterally, giving them a field of vision of almost 360 degrees to detect predators."),
            zh = LocalizedContent("哪种动物的眼睛最侧向？", listOf("马", "瞪羚", "兔子", "长颈鹿"), "自然", "兔子的眼睛位于头部两侧，提供了近360度的视野以探测捕食者。"),
            es = LocalizedContent("¿Qué animal tiene los ojos más laterales?", listOf("el caballo", "la gacela", "el conejo", "la jirafa"), "Naturaleza", "El conejo tiene ojos colocados muy lateralmente, lo que le ofrece un campo de visión de casi 360 grados para detectar depredadores.")
        ),
        BilingualQuestion(
            id = 10994, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est l'animal qui a les yeux les plus frontaux?", listOf("le hibou", "la chouette", "l'humain", "le singe"), "Nature", "Les singes ont des yeux frontaux car ils sont des primates arboricoles, ce qui leur offre une vision binoculaire pour mieux évaluer les distances en sautant de branche en branche."),
            en = LocalizedContent("Which animal has the most frontal eyes?", listOf("owl", "barn owl", "human", "monkey"), "Nature", "Monkeys have frontal eyes because they are arboreal primates, providing binocular vision to better judge distances when jumping from branch to branch."),
            zh = LocalizedContent("哪种动物的眼睛最朝前？", listOf("猫头鹰", "仓鸮", "人类", "猴子"), "自然", "猴子有朝前的眼睛，因为它们是树栖灵长类动物，双目视觉有助于在树枝间跳跃时判断距离。"),
            es = LocalizedContent("¿Qué animal tiene los ojos más frontales?", listOf("el búho", "la lechuza", "el humano", "el mono"), "Naturaleza", "Los monos tienen ojos frontales porque son primates arborícolas, lo que les proporciona visión binocular para evaluar mejor las distancias al saltar de rama en rama.")
        ),
        BilingualQuestion(
            id = 10995, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est l'animal qui a les yeux les plus grands en proportion du corps?", listOf("le colibri", "la chouette", "la larve de libellule", "la mouche"), "Nature", "La chouette possède des yeux très volumineux par rapport à sa taille, ce qui lui offre une excellente vision nocturne pour chasser dans l'obscurité."),
            en = LocalizedContent("Which animal has the largest eyes relative to body size?", listOf("hummingbird", "owl", "dragonfly larva", "fly"), "Nature", "Owls have very large eyes relative to their size, providing excellent night vision for hunting in darkness."),
            zh = LocalizedContent("哪种动物的眼睛相对于身体比例最大？", listOf("蜂鸟", "猫头鹰", "蜻蜓幼虫", "苍蝇"), "自然", "猫头鹰的眼睛相对于体型非常大，提供了出色的夜视能力，便于在黑暗中捕猎。"),
            es = LocalizedContent("¿Qué animal tiene los ojos más grandes en proporción al cuerpo?", listOf("el colibrí", "el búho", "la larva de libélula", "la mosca"), "Naturaleza", "El búho posee ojos muy voluminosos en relación a su tamaño, lo que le ofrece una excelente visión nocturna para cazar en la oscuridad.")
        ),
        BilingualQuestion(
            id = 10996, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est l'animal qui a les yeux les plus petits en proportion du corps?", listOf("la mouche", "l'abeille", "le moustique", "la fourmi"), "Nature", "Les fourmis ont des yeux composés minuscules par rapport à leur taille, car elles dépendent davantage de leurs antennes et de leur odorat que de la vision pour se déplacer et communiquer."),
            en = LocalizedContent("Which animal has the smallest eyes relative to body size?", listOf("fly", "bee", "mosquito", "ant"), "Nature", "Ants have tiny compound eyes relative to their size, as they rely more on their antennae and sense of smell than vision for movement and communication."),
            zh = LocalizedContent("哪种动物的眼睛相对于身体比例最小？", listOf("苍蝇", "蜜蜂", "蚊子", "蚂蚁"), "自然", "蚂蚁的复眼相对于体型非常小，因为它们更依赖触角和嗅觉而非视觉来移动和交流。"),
            es = LocalizedContent("¿Qué animal tiene los ojos más pequeños en proporción al cuerpo?", listOf("la mosca", "la abeja", "el mosquito", "la hormiga"), "Naturaleza", "Las hormigas tienen ojos compuestos diminutos en relación a su tamaño, ya que dependen más de sus antenas y del olfato que de la visión para desplazarse y comunicarse.")
        ),
        BilingualQuestion(
            id = 10997, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est l'animal qui a les yeux les plus mobiles?", listOf("le caméléon", "le poisson-globe", "l'autruche", "le lézard"), "Nature", "Le caméléon possède des yeux capables de bouger indépendamment l'un de l'autre, avec un champ de vision à 360 degrés."),
            en = LocalizedContent("Which animal has the most mobile eyes?", listOf("chameleon", "pufferfish", "ostrich", "lizard"), "Nature", "Chameleons have eyes that can move independently of each other, with a 360-degree field of vision."),
            zh = LocalizedContent("哪种动物的眼睛最灵活？", listOf("变色龙", "河豚", "鸵鸟", "蜥蜴"), "自然", "变色龙的眼睛可以独立移动，拥有360度的视野。"),
            es = LocalizedContent("¿Qué animal tiene los ojos más móviles?", listOf("el camaleón", "el pez globo", "el avestruz", "el lagarto"), "Naturaleza", "El camaleón posee ojos capaces de moverse independientemente el uno del otro, con un campo de visión de 360 grados.")
        ),
        BilingualQuestion(
            id = 10998, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est l'animal qui a les yeux les plus fixes?", listOf("le serpent", "le crocodile", "le glaçon", "le requin"), "Nature", "Le crocodile a une vision très fixe car ses yeux sont conçus pour rester immobiles, ce qui l’aide à guetter ses proies sans trahir sa présence."),
            en = LocalizedContent("Which animal has the most fixed eyes?", listOf("snake", "crocodile", "icefish", "shark"), "Nature", "Crocodiles have very fixed vision because their eyes are designed to remain still, helping them stalk prey without revealing their presence."),
            zh = LocalizedContent("哪种动物的眼睛最固定？", listOf("蛇", "鳄鱼", "冰鱼", "鲨鱼"), "自然", "鳄鱼的视力非常固定，因为它们的眼睛设计为保持不动，有助于在不暴露自己的情况下跟踪猎物。"),
            es = LocalizedContent("¿Qué animal tiene los ojos más fijos?", listOf("la serpiente", "el cocodrilo", "el pez hielo", "el tiburón"), "Naturaleza", "El cocodrilo tiene una visión muy fija porque sus ojos están diseñados para permanecer inmóviles, lo que le ayuda a acechar a sus presas sin delatar su presencia.")
        ),
        BilingualQuestion(
            id = 10999, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est l'animal qui peut voir le plus de directions à la fois?", listOf("le pigeon", "la chauve-souris", "le lézard", "le poisson"), "Nature", "Le pigeon possède un champ de vision de près de 340 degrés grâce à ses yeux placés sur les côtés de la tête, lui permettant de voir dans presque toutes les directions sans bouger."),
            en = LocalizedContent("Which animal can see the most directions at once?", listOf("pigeon", "bat", "lizard", "fish"), "Nature", "Pigeons have a field of vision of nearly 340 degrees thanks to their eyes placed on the sides of the head, allowing them to see in almost all directions without moving."),
            zh = LocalizedContent("哪种动物能同时看到最多方向？", listOf("鸽子", "蝙蝠", "蜥蜴", "鱼"), "自然", "鸽子的视野接近340度，因为它们的眼睛位于头部两侧，可以在不移动的情况下看到几乎所有方向。"),
            es = LocalizedContent("¿Qué animal puede ver más direcciones a la vez?", listOf("la paloma", "el murciélago", "el lagarto", "el pez"), "Naturaleza", "La paloma posee un campo de visión de casi 340 grados gracias a sus ojos colocados a los lados de la cabeza, lo que le permite ver en casi todas las direcciones sin moverse.")
        ),
        BilingualQuestion(
            id = 11000, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année le World Wide Web a-t-il été inventé?", listOf("1989", "1991", "1993", "1995"), "Technologie", "Tim Berners-Lee a proposé le concept du World Wide Web en 1989 au CERN, jetant les bases du système hypertexte qui a révolutionné Internet."),
            en = LocalizedContent("In what year was the World Wide Web invented?", listOf("1989", "1991", "1993", "1995"), "Technology", "Tim Berners-Lee proposed the concept of the World Wide Web in 1989 at CERN, laying the foundation for the hypertext system that revolutionized the Internet."),
            zh = LocalizedContent("万维网是在哪一年发明的？", listOf("1989", "1991", "1993", "1995"), "科技", "蒂姆·伯纳斯-李于1989年在欧洲核子研究中心提出了万维网的概念，为彻底改变互联网的超文本系统奠定了基础。"),
            es = LocalizedContent("¿En qué año se inventó la World Wide Web?", listOf("1989", "1991", "1993", "1995"), "Tecnología", "Tim Berners-Lee propuso el concepto de la World Wide Web en 1989 en el CERN, sentando las bases del sistema de hipertexto que revolucionó Internet.")
        ),
        BilingualQuestion(
            id = 11001, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le navigateur web le plus utilisé au monde?", listOf("Chrome", "Safari", "Firefox", "Edge"), "Technologie", "Chrome domine le marché des navigateurs web avec plus de 60 % de parts, grâce à sa rapidité et son intégration aux services Google."),
            en = LocalizedContent("What is the most used web browser in the world?", listOf("Chrome", "Safari", "Firefox", "Edge"), "Technology", "Chrome dominates the web browser market with over 60% share, thanks to its speed and integration with Google services."),
            zh = LocalizedContent("世界上使用最多的网页浏览器是什么？", listOf("Chrome", "Safari", "Firefox", "Edge"), "科技", "Chrome 以超过60%的市场份额主导网页浏览器市场，这得益于其速度和与谷歌服务的集成。"),
            es = LocalizedContent("¿Cuál es el navegador web más utilizado en el mundo?", listOf("Chrome", "Safari", "Firefox", "Edge"), "Tecnología", "Chrome domina el mercado de navegadores web con más del 60% de cuota, gracias a su rapidez e integración con los servicios de Google.")
        ),
        BilingualQuestion(
            id = 11002, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui a fondé Microsoft?", listOf("Bill Gates et Paul Allen", "Steve Jobs", "Mark Zuckerberg", "Elon Musk"), "Technologie", "Bill Gates et Paul Allen ont cofondé Microsoft en 1975 à Albuquerque, au Nouveau-Mexique, après avoir développé un interpréteur BASIC pour l'Altair 8800."),
            en = LocalizedContent("Who founded Microsoft?", listOf("Bill Gates and Paul Allen", "Steve Jobs", "Mark Zuckerberg", "Elon Musk"), "Technology", "Bill Gates and Paul Allen co-founded Microsoft in 1975 in Albuquerque, New Mexico, after developing a BASIC interpreter for the Altair 8800."),
            zh = LocalizedContent("谁创立了微软？", listOf("比尔·盖茨和保罗·艾伦", "史蒂夫·乔布斯", "马克·扎克伯格", "埃隆·马斯克"), "科技", "比尔·盖茨和保罗·艾伦于1975年在新墨西哥州阿尔伯克基共同创立了微软，此前他们为Altair 8800开发了BASIC解释器。"),
            es = LocalizedContent("¿Quién fundó Microsoft?", listOf("Bill Gates y Paul Allen", "Steve Jobs", "Mark Zuckerberg", "Elon Musk"), "Tecnología", "Bill Gates y Paul Allen cofundaron Microsoft en 1975 en Albuquerque, Nuevo México, después de desarrollar un intérprete BASIC para el Altair 8800.")
        ),
        BilingualQuestion(
            id = 11003, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année Android a-t-il été lancé?", listOf("2008", "2005", "2010", "2012"), "Technologie", "Android a été initialement développé par Android Inc., une entreprise rachetée par Google en 2005. Le premier téléphone commercial utilisant Android est sorti en 2008."),
            en = LocalizedContent("In what year was Android launched?", listOf("2008", "2005", "2010", "2012"), "Technology", "Android was initially developed by Android Inc., a company acquired by Google in 2005. The first commercial phone using Android was released in 2008."),
            zh = LocalizedContent("安卓是在哪一年推出的？", listOf("2008", "2005", "2010", "2012"), "科技", "安卓最初由Android Inc.开发，该公司于2005年被谷歌收购。第一款使用安卓的商业手机于2008年发布。"),
            es = LocalizedContent("¿En qué año se lanzó Android?", listOf("2008", "2005", "2010", "2012"), "Tecnología", "Android fue desarrollado inicialmente por Android Inc., una empresa adquirida por Google en 2005. El primer teléfono comercial con Android se lanzó en 2008.")
        ),
        BilingualQuestion(
            id = 11004, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel langage de programmation a été créé par Guido van Rossum?", listOf("Python", "Java", "C++", "Ruby"), "Technologie", "Guido van Rossum a créé Python à la fin des années 1980, avec sa première version publiée en 1991, en mettant l'accent sur la lisibilité du code."),
            en = LocalizedContent("Which programming language was created by Guido van Rossum?", listOf("Python", "Java", "C++", "Ruby"), "Technology", "Guido van Rossum created Python in the late 1980s, with its first version published in 1991, emphasizing code readability."),
            zh = LocalizedContent("哪种编程语言是由吉多·范罗苏姆创建的？", listOf("Python", "Java", "C++", "Ruby"), "科技", "吉多·范罗苏姆在20世纪80年代末创建了Python，其第一个版本于1991年发布，强调代码的可读性。"),
            es = LocalizedContent("¿Qué lenguaje de programación fue creado por Guido van Rossum?", listOf("Python", "Java", "C++", "Ruby"), "Tecnología", "Guido van Rossum creó Python a finales de los años 80, con su primera versión publicada en 1991, enfatizando la legibilidad del código.")
        ),
        BilingualQuestion(
            id = 11005, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qu'est-ce que HTML?", listOf("HyperText Markup Language", "High Technology Markup Language", "Home Tool Markup Language", "Hyper Transfer Markup Language"), "Technologie", "HTML est le langage standard utilisé pour créer et structurer le contenu des pages web, en définissant les éléments comme les titres, paragraphes et images via des balises."),
            en = LocalizedContent("What does HTML stand for?", listOf("HyperText Markup Language", "High Technology Markup Language", "Home Tool Markup Language", "Hyper Transfer Markup Language"), "Technology", "HTML is the standard language used to create and structure content on web pages, defining elements like headings, paragraphs, and images through tags."),
            zh = LocalizedContent("HTML代表什么？", listOf("超文本标记语言", "高科技标记语言", "家庭工具标记语言", "超传输标记语言"), "科技", "HTML是用于创建和结构化网页内容的标准语言，通过标签定义标题、段落和图像等元素。"),
            es = LocalizedContent("¿Qué significa HTML?", listOf("Lenguaje de Marcado de Hipertexto", "Lenguaje de Marcado de Alta Tecnología", "Lenguaje de Marcado de Herramientas del Hogar", "Lenguaje de Marcado de Hiper Transferencia"), "Tecnología", "HTML es el lenguaje estándar utilizado para crear y estructurar el contenido de las páginas web, definiendo elementos como encabezados, párrafos e imágenes mediante etiquetas.")
        ),
        BilingualQuestion(
            id = 11006, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le siège social d'Apple?", listOf("Cupertino, Californie", "Seattle, Washington", "San Francisco, Californie", "Palo Alto, Californie"), "Technologie", "Apple a établi son siège social à Cupertino, en Californie, en 1977, après avoir quitté le garage de Steve Jobs à Los Altos. Le campus principal, surnommé Apple Park, a ouvert en 2017."),
            en = LocalizedContent("What is Apple's headquarters?", listOf("Cupertino, California", "Seattle, Washington", "San Francisco, California", "Palo Alto, California"), "Technology", "Apple established its headquarters in Cupertino, California, in 1977, after leaving Steve Jobs' garage in Los Altos. The main campus, nicknamed Apple Park, opened in 2017."),
            zh = LocalizedContent("苹果公司的总部在哪里？", listOf("加利福尼亚州库比蒂诺", "华盛顿州西雅图", "加利福尼亚州旧金山", "加利福尼亚州帕洛阿尔托"), "科技", "苹果公司于1977年在加利福尼亚州库比蒂诺设立了总部，此前曾位于史蒂夫·乔布斯在洛斯阿尔托斯的车库。主园区被称为苹果公园，于2017年开放。"),
            es = LocalizedContent("¿Cuál es la sede de Apple?", listOf("Cupertino, California", "Seattle, Washington", "San Francisco, California", "Palo Alto, California"), "Tecnología", "Apple estableció su sede en Cupertino, California, en 1977, después de dejar el garaje de Steve Jobs en Los Altos. El campus principal, apodado Apple Park, se inauguró en 2017.")
        ),
        BilingualQuestion(
            id = 11007, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("En quelle année le premier iPhone a-t-il été lancé?", listOf("2007", "2005", "2009", "2011"), "Technologie", "Le premier iPhone a été dévoilé par Steve Jobs le 9 janvier 2007 et mis en vente aux États-Unis le 29 juin 2007. Ce lancement a révolutionné l'industrie des smartphones."),
            en = LocalizedContent("In what year was the first iPhone launched?", listOf("2007", "2005", "2009", "2011"), "Technology", "The first iPhone was unveiled by Steve Jobs on January 9, 2007, and went on sale in the United States on June 29, 2007. This launch revolutionized the smartphone industry."),
            zh = LocalizedContent("第一款iPhone是在哪一年推出的？", listOf("2007", "2005", "2009", "2011"), "科技", "第一款iPhone由史蒂夫·乔布斯于2007年1月9日发布，并于2007年6月29日在美国上市。这一发布彻底改变了智能手机行业。"),
            es = LocalizedContent("¿En qué año se lanzó el primer iPhone?", listOf("2007", "2005", "2009", "2011"), "Tecnología", "El primer iPhone fue presentado por Steve Jobs el 9 de enero de 2007 y salió a la venta en Estados Unidos el 29 de junio de 2007. Este lanzamiento revolucionó la industria de los teléfonos inteligentes.")
        ),
        BilingualQuestion(
            id = 11008, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le système d'exploitation le plus utilisé au monde?", listOf("Windows", "macOS", "Linux", "iOS"), "Technologie", "Windows domine le marché des systèmes d'exploitation pour PC depuis les années 1990, avec une part de marché d'environ 70% en 2024, grâce à sa compatibilité logicielle et son usage généralisé dans les entreprises."),
            en = LocalizedContent("What is the most used operating system in the world?", listOf("Windows", "macOS", "Linux", "iOS"), "Technology", "Windows has dominated the PC operating system market since the 1990s, with a market share of about 70% in 2024, thanks to its software compatibility and widespread use in businesses."),
            zh = LocalizedContent("世界上使用最多的操作系统是什么？", listOf("Windows", "macOS", "Linux", "iOS"), "科技", "自20世纪90年代以来，Windows一直主导着PC操作系统市场，2024年市场份额约为70%，这得益于其软件兼容性和在企业中的广泛使用。"),
            es = LocalizedContent("¿Cuál es el sistema operativo más utilizado en el mundo?", listOf("Windows", "macOS", "Linux", "iOS"), "Tecnología", "Windows ha dominado el mercado de sistemas operativos para PC desde la década de 1990, con una cuota de mercado de aproximadamente el 70% en 2024, gracias a su compatibilidad de software y su uso generalizado en empresas.")
        ),
        BilingualQuestion(
            id = 11009, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui a créé Facebook?", listOf("Mark Zuckerberg", "Bill Gates", "Steve Jobs", "Jack Dorsey"), "Technologie", "Mark Zuckerberg a créé Facebook en 2004 dans sa chambre d'université à Harvard, avec ses camarades Eduardo Saverin, Andrew McCollum, Dustin Moskovitz et Chris Hughes."),
            en = LocalizedContent("Who created Facebook?", listOf("Mark Zuckerberg", "Bill Gates", "Steve Jobs", "Jack Dorsey"), "Technology", "Mark Zuckerberg created Facebook in 2004 in his Harvard dorm room, along with his classmates Eduardo Saverin, Andrew McCollum, Dustin Moskovitz, and Chris Hughes."),
            zh = LocalizedContent("谁创建了Facebook？", listOf("马克·扎克伯格", "比尔·盖茨", "史蒂夫·乔布斯", "杰克·多西"), "科技", "马克·扎克伯格于2004年在哈佛大学的宿舍里创建了Facebook，与他一起的还有同学爱德华多·萨维林、安德鲁·麦科勒姆、达斯汀·莫斯科维茨和克里斯·休斯。"),
            es = LocalizedContent("¿Quién creó Facebook?", listOf("Mark Zuckerberg", "Bill Gates", "Steve Jobs", "Jack Dorsey"), "Tecnología", "Mark Zuckerberg creó Facebook en 2004 en su dormitorio de Harvard, junto con sus compañeros Eduardo Saverin, Andrew McCollum, Dustin Moskovitz y Chris Hughes.")
        ),
    )

    private fun part2(): List<BilingualQuestion> = listOf(
        BilingualQuestion(
            id = 11010, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce qu'un algorithme?", listOf("Un ensemble d'étapes pour résoudre un problème", "Un langage de programmation", "Un type de données", "Une base de données"), "Technologie", "Un algorithme est une séquence logique et finie d'instructions conçue pour accomplir une tâche ou résoudre un problème spécifique, utilisé en programmation et en mathématiques."),
            en = LocalizedContent("What is an algorithm?", listOf("A set of steps to solve a problem", "A programming language", "A type of data", "A database"), "Technology", "An algorithm is a logical and finite sequence of instructions designed to accomplish a task or solve a specific problem, used in programming and mathematics."),
            zh = LocalizedContent("什么是算法？", listOf("一组解决问题的步骤", "一种编程语言", "一种数据类型", "一个数据库"), "科技", "算法是为完成某项任务或解决特定问题而设计的逻辑且有限的指令序列，用于编程和数学中。"),
            es = LocalizedContent("¿Qué es un algoritmo?", listOf("Un conjunto de pasos para resolver un problema", "Un lenguaje de programación", "Un tipo de dato", "Una base de datos"), "Tecnología", "Un algoritmo es una secuencia lógica y finita de instrucciones diseñada para realizar una tarea o resolver un problema específico, utilizado en programación y matemáticas.")
        ),
        BilingualQuestion(
            id = 11011, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le nom de la première sonde spatiale à quitter le système solaire?", listOf("Voyager 1", "Pioneer 10", "Cassini", "Rosetta"), "Technologie", "Lancée en 1977, Voyager 1 a franchi l'héliopause en 2012, devenant le premier objet fabriqué par l'homme à pénétrer dans l'espace interstellaire."),
            en = LocalizedContent("What is the name of the first space probe to leave the solar system?", listOf("Voyager 1", "Pioneer 10", "Cassini", "Rosetta"), "Technology", "Launched in 1977, Voyager 1 crossed the heliopause in 2012, becoming the first human-made object to enter interstellar space."),
            zh = LocalizedContent("第一个离开太阳系的太空探测器叫什么名字？", listOf("旅行者1号", "先驱者10号", "卡西尼号", "罗塞塔号"), "科技", "旅行者1号于1977年发射，2012年穿越太阳风层顶，成为第一个进入星际空间的人造物体。"),
            es = LocalizedContent("¿Cuál es el nombre de la primera sonda espacial en salir del sistema solar?", listOf("Voyager 1", "Pioneer 10", "Cassini", "Rosetta"), "Tecnología", "Lanzada en 1977, la Voyager 1 cruzó la heliopausa en 2012, convirtiéndose en el primer objeto hecho por el hombre en ingresar al espacio interestelar.")
        ),
        BilingualQuestion(
            id = 11012, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année le premier satellite artificiel a-t-il été lancé?", listOf("1957", "1960", "1961", "1963"), "Technologie", "Le Spoutnik 1, premier satellite artificiel, a été lancé par l'Union soviétique le 4 octobre 1957, marquant le début de l'ère spatiale."),
            en = LocalizedContent("In what year was the first artificial satellite launched?", listOf("1957", "1960", "1961", "1963"), "Technology", "Sputnik 1, the first artificial satellite, was launched by the Soviet Union on October 4, 1957, marking the beginning of the space age."),
            zh = LocalizedContent("第一颗人造卫星是在哪一年发射的？", listOf("1957", "1960", "1961", "1963"), "科技", "斯普特尼克1号，第一颗人造卫星，于1957年10月4日由苏联发射，标志着太空时代的开始。"),
            es = LocalizedContent("¿En qué año se lanzó el primer satélite artificial?", listOf("1957", "1960", "1961", "1963"), "Tecnología", "El Sputnik 1, el primer satélite artificial, fue lanzado por la Unión Soviética el 4 de octubre de 1957, marcando el comienzo de la era espacial.")
        ),
        BilingualQuestion(
            id = 11013, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel était le nom du premier ordinateur personnel?", listOf("Apple II", "Altair 8800", "Commodore 64", "ZX Spectrum"), "Technologie", "L'Altair 8800, lancé en 1975 par MITS, est considéré comme le premier ordinateur personnel commercialisé en kit. Il a popularisé l'informatique individuelle avant l'Apple II et le Commodore PET."),
            en = LocalizedContent("What was the name of the first personal computer?", listOf("Apple II", "Altair 8800", "Commodore 64", "ZX Spectrum"), "Technology", "The Altair 8800, launched in 1975 by MITS, is considered the first commercially available personal computer in kit form. It popularized personal computing before the Apple II and Commodore PET."),
            zh = LocalizedContent("第一台个人电脑叫什么名字？", listOf("苹果II", "Altair 8800", "Commodore 64", "ZX Spectrum"), "科技", "Altair 8800于1975年由MITS推出，被认为是第一款以套件形式商业化的个人电脑。它在Apple II和Commodore PET之前普及了个人计算。"),
            es = LocalizedContent("¿Cuál fue el nombre de la primera computadora personal?", listOf("Apple II", "Altair 8800", "Commodore 64", "ZX Spectrum"), "Tecnología", "El Altair 8800, lanzado en 1975 por MITS, es considerado la primera computadora personal comercializada en kit. Popularizó la informática personal antes del Apple II y el Commodore PET.")
        ),
        BilingualQuestion(
            id = 11014, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que le cloud computing?", listOf("Stockage et traitement de données sur internet", "Un logiciel météorologique", "Un service de streaming de nuages", "Une technologie de disque dur"), "Technologie", "Le cloud computing désigne la fourniture de services informatiques (stockage, puissance de calcul, logiciels) via internet, plutôt que depuis un serveur local ou un ordinateur personnel."),
            en = LocalizedContent("What is cloud computing?", listOf("Storage and processing of data on the internet", "Weather software", "A cloud streaming service", "A hard drive technology"), "Technology", "Cloud computing refers to the delivery of computing services (storage, processing power, software) over the internet, rather than from a local server or personal computer."),
            zh = LocalizedContent("什么是云计算？", listOf("在互联网上存储和处理数据", "气象软件", "云流媒体服务", "一种硬盘技术"), "科技", "云计算是指通过互联网提供计算服务（存储、计算能力、软件），而不是从本地服务器或个人计算机提供。"),
            es = LocalizedContent("¿Qué es la computación en la nube?", listOf("Almacenamiento y procesamiento de datos en internet", "Un software meteorológico", "Un servicio de streaming de nubes", "Una tecnología de disco duro"), "Tecnología", "La computación en la nube se refiere a la prestación de servicios informáticos (almacenamiento, potencia de cálculo, software) a través de internet, en lugar de desde un servidor local o una computadora personal.")
        ),
        BilingualQuestion(
            id = 11015, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le plus grand réseau informatique du monde?", listOf("Internet", "Intranet", "Blockchain", "WiFi"), "Technologie", "Internet est un réseau mondial interconnectant des milliards d'appareils, ce qui en fait le plus vaste réseau informatique existant."),
            en = LocalizedContent("What is the largest computer network in the world?", listOf("Internet", "Intranet", "Blockchain", "WiFi"), "Technology", "The Internet is a global network interconnecting billions of devices, making it the largest existing computer network."),
            zh = LocalizedContent("世界上最大的计算机网络是什么？", listOf("互联网", "内联网", "区块链", "WiFi"), "科技", "互联网是一个连接数十亿设备的全球网络，使其成为现存最大的计算机网络。"),
            es = LocalizedContent("¿Cuál es la red informática más grande del mundo?", listOf("Internet", "Intranet", "Blockchain", "WiFi"), "Tecnología", "Internet es una red global que interconecta miles de millones de dispositivos, lo que la convierte en la red informática más grande existente.")
        ),
        BilingualQuestion(
            id = 11016, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a reçu le prix Turing 2023?", listOf("Geoffrey Hinton", "Demis Hassabis", "Paul Cohen", "Richard Karp"), "Technologie", "Geoffrey Hinton a reçu le prix Turing 2023 pour ses travaux pionniers sur les réseaux de neurones et l'apprentissage profond, qui ont révolutionné l'intelligence artificielle."),
            en = LocalizedContent("Who received the 2023 Turing Award?", listOf("Geoffrey Hinton", "Demis Hassabis", "Paul Cohen", "Richard Karp"), "Technology", "Geoffrey Hinton received the 2023 Turing Award for his pioneering work on neural networks and deep learning, which revolutionized artificial intelligence."),
            zh = LocalizedContent("谁获得了2023年图灵奖？", listOf("杰弗里·辛顿", "德米斯·哈萨比斯", "保罗·科恩", "理查德·卡普"), "科技", "杰弗里·辛顿因其在神经网络和深度学习方面的开创性工作获得了2023年图灵奖，这些工作彻底改变了人工智能。"),
            es = LocalizedContent("¿Quién recibió el Premio Turing 2023?", listOf("Geoffrey Hinton", "Demis Hassabis", "Paul Cohen", "Richard Karp"), "Tecnología", "Geoffrey Hinton recibió el Premio Turing 2023 por su trabajo pionero en redes neuronales y aprendizaje profundo, que revolucionó la inteligencia artificial.")
        ),
        BilingualQuestion(
            id = 11017, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le langage de programmation le plus ancien encore utilisé?", listOf("COBOL", "Fortran", "Lisp", "Algol"), "Technologie", "COBOL, créé en 1959, est encore utilisé dans les systèmes financiers et administratifs hérités, notamment pour le traitement de données à grande échelle."),
            en = LocalizedContent("What is the oldest programming language still in use?", listOf("COBOL", "Fortran", "Lisp", "Algol"), "Technology", "COBOL, created in 1959, is still used in legacy financial and administrative systems, especially for large-scale data processing."),
            zh = LocalizedContent("仍在使用的历史最悠久的编程语言是什么？", listOf("COBOL", "Fortran", "Lisp", "Algol"), "科技", "COBOL创建于1959年，仍在遗留的金融和行政系统中使用，特别是在大规模数据处理方面。"),
            es = LocalizedContent("¿Cuál es el lenguaje de programación más antiguo aún en uso?", listOf("COBOL", "Fortran", "Lisp", "Algol"), "Tecnología", "COBOL, creado en 1959, todavía se utiliza en sistemas financieros y administrativos heredados, especialmente para el procesamiento de datos a gran escala.")
        ),
        BilingualQuestion(
            id = 11018, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année la 5G a-t-elle commencé à être déployée?", listOf("2019", "2017", "2021", "2018"), "Technologie", "Le déploiement commercial de la 5G a débuté en 2019, avec les premières offres lancées par des opérateurs comme Verizon et SK Telecom."),
            en = LocalizedContent("In what year did 5G begin to be deployed?", listOf("2019", "2017", "2021", "2018"), "Technology", "Commercial deployment of 5G began in 2019, with the first offers launched by operators such as Verizon and SK Telecom."),
            zh = LocalizedContent("5G是在哪一年开始部署的？", listOf("2019", "2017", "2021", "2018"), "科技", "5G的商业部署始于2019年，Verizon和SK Telecom等运营商推出了首批服务。"),
            es = LocalizedContent("¿En qué año comenzó a desplegarse el 5G?", listOf("2019", "2017", "2021", "2018"), "Tecnología", "El despliegue comercial del 5G comenzó en 2019, con las primeras ofertas lanzadas por operadores como Verizon y SK Telecom.")
        ),
        BilingualQuestion(
            id = 11019, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel type de technologie utilise une blockchain?", listOf("Cryptomonnaie", "Intelligence artificielle", "Réalité virtuelle", "Biotechnologie"), "Technologie", "La blockchain est la technologie sous-jacente des cryptomonnaies comme le Bitcoin, permettant un registre décentralisé et sécurisé des transactions."),
            en = LocalizedContent("What type of technology uses a blockchain?", listOf("Cryptocurrency", "Artificial intelligence", "Virtual reality", "Biotechnology"), "Technology", "Blockchain is the underlying technology of cryptocurrencies like Bitcoin, enabling a decentralized and secure ledger of transactions."),
            zh = LocalizedContent("哪种技术使用区块链？", listOf("加密货币", "人工智能", "虚拟现实", "生物技术"), "科技", "区块链是比特币等加密货币的底层技术，实现了去中心化且安全的交易账本。"),
            es = LocalizedContent("¿Qué tipo de tecnología utiliza una cadena de bloques?", listOf("Criptomoneda", "Inteligencia artificial", "Realidad virtual", "Biotecnología"), "Tecnología", "La cadena de bloques es la tecnología subyacente de las criptomonedas como Bitcoin, permitiendo un registro descentralizado y seguro de las transacciones.")
        ),
        BilingualQuestion(
            id = 11020, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui a créé Tesla?", listOf("Elon Musk", "Steve Jobs", "Jeff Bezos", "Bill Gates"), "Technologie", "Elon Musk a cofondé Tesla Motors en 2003, mais l'entreprise a été fondée à l'origine par Martin Eberhard et Marc Tarpenning. Musk a rejoint peu après et en est devenu le principal dirigeant."),
            en = LocalizedContent("Who created Tesla?", listOf("Elon Musk", "Steve Jobs", "Jeff Bezos", "Bill Gates"), "Technology", "Elon Musk co-founded Tesla Motors in 2003, but the company was originally founded by Martin Eberhard and Marc Tarpenning. Musk joined shortly after and became its main leader."),
            zh = LocalizedContent("谁创立了特斯拉？", listOf("埃隆·马斯克", "史蒂夫·乔布斯", "杰夫·贝佐斯", "比尔·盖茨"), "科技", "埃隆·马斯克于2003年共同创立了特斯拉汽车公司，但该公司最初由马丁·艾伯哈德和马克·塔彭宁创立。马斯克不久后加入并成为其主要领导者。"),
            es = LocalizedContent("¿Quién creó Tesla?", listOf("Elon Musk", "Steve Jobs", "Jeff Bezos", "Bill Gates"), "Tecnología", "Elon Musk cofundó Tesla Motors en 2003, pero la empresa fue fundada originalmente por Martin Eberhard y Marc Tarpenning. Musk se unió poco después y se convirtió en su principal líder.")
        ),
        BilingualQuestion(
            id = 11021, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le langage de programmation utilisé pour le développement web côté client?", listOf("JavaScript", "Python", "Java", "C#"), "Technologie", "JavaScript est le langage de programmation standard pour le développement web côté client, car il est exécuté par le navigateur pour rendre les pages interactives."),
            en = LocalizedContent("What is the programming language used for client-side web development?", listOf("JavaScript", "Python", "Java", "C#"), "Technology", "JavaScript is the standard programming language for client-side web development, as it is executed by the browser to make pages interactive."),
            zh = LocalizedContent("用于客户端网页开发的编程语言是什么？", listOf("JavaScript", "Python", "Java", "C#"), "科技", "JavaScript是客户端网页开发的标准编程语言，因为它由浏览器执行，使页面具有交互性。"),
            es = LocalizedContent("¿Cuál es el lenguaje de programación utilizado para el desarrollo web del lado del cliente?", listOf("JavaScript", "Python", "Java", "C#"), "Tecnología", "JavaScript es el lenguaje de programación estándar para el desarrollo web del lado del cliente, ya que es ejecutado por el navegador para hacer las páginas interactivas.")
        ),
        BilingualQuestion(
            id = 11022, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qu'est-ce que l'intelligence artificielle?", listOf("La simulation de l'intelligence humaine par des machines", "Un type de robot", "Un langage de programmation", "Un système d'exploitation"), "Technologie", "L'intelligence artificielle désigne la capacité des machines à imiter des fonctions cognitives humaines comme l'apprentissage et la résolution de problèmes."),
            en = LocalizedContent("What is artificial intelligence?", listOf("The simulation of human intelligence by machines", "A type of robot", "A programming language", "An operating system"), "Technology", "Artificial intelligence refers to the ability of machines to imitate human cognitive functions such as learning and problem-solving."),
            zh = LocalizedContent("什么是人工智能？", listOf("机器对人类智能的模拟", "一种机器人", "一种编程语言", "一种操作系统"), "科技", "人工智能指的是机器模仿人类认知功能（如学习和解决问题）的能力。"),
            es = LocalizedContent("¿Qué es la inteligencia artificial?", listOf("La simulación de la inteligencia humana por máquinas", "Un tipo de robot", "Un lenguaje de programación", "Un sistema operativo"), "Tecnología", "La inteligencia artificial se refiere a la capacidad de las máquinas para imitar funciones cognitivas humanas como el aprendizaje y la resolución de problemas.")
        ),
        BilingualQuestion(
            id = 11023, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année YouTube a-t-il été fondé?", listOf("2005", "2003", "2007", "2009"), "Technologie", "YouTube a été fondé le 14 février 2005 par trois anciens employés de PayPal. Le premier site a été mis en ligne en mai 2005."),
            en = LocalizedContent("In what year was YouTube founded?", listOf("2005", "2003", "2007", "2009"), "Technology", "YouTube was founded on February 14, 2005 by three former PayPal employees. The first site went online in May 2005."),
            zh = LocalizedContent("YouTube是哪一年创立的？", listOf("2005", "2003", "2007", "2009"), "科技", "YouTube于2005年2月14日由三位前PayPal员工创立。第一个网站于2005年5月上线。"),
            es = LocalizedContent("¿En qué año se fundó YouTube?", listOf("2005", "2003", "2007", "2009"), "Tecnología", "YouTube fue fundado el 14 de febrero de 2005 por tres ex empleados de PayPal. El primer sitio se puso en línea en mayo de 2005.")
        ),
        BilingualQuestion(
            id = 11024, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le navigateur web le plus rapide?", listOf("Chrome", "Firefox", "Safari", "Edge"), "Technologie", "Chrome est souvent considéré comme le navigateur le plus rapide grâce à son moteur JavaScript V8 et à son optimisation constante des performances de chargement des pages."),
            en = LocalizedContent("What is the fastest web browser?", listOf("Chrome", "Firefox", "Safari", "Edge"), "Technology", "Chrome is often considered the fastest browser due to its V8 JavaScript engine and constant optimization of page loading performance."),
            zh = LocalizedContent("最快的网页浏览器是什么？", listOf("Chrome", "Firefox", "Safari", "Edge"), "科技", "Chrome通常被认为是最快的浏览器，这得益于其V8 JavaScript引擎和对页面加载性能的持续优化。"),
            es = LocalizedContent("¿Cuál es el navegador web más rápido?", listOf("Chrome", "Firefox", "Safari", "Edge"), "Tecnología", "Chrome a menudo se considera el navegador más rápido gracias a su motor JavaScript V8 y su optimización constante del rendimiento de carga de páginas.")
        ),
        BilingualQuestion(
            id = 11025, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui a inventé la Toile d'araignée mondiale (World Wide Web)?", listOf("Tim Berners-Lee", "Vint Cerf", "Bob Kahn", "Jon Postel"), "Technologie", "Tim Berners-Lee a inventé le World Wide Web en 1989 au CERN, proposant un système de documents hypertextes liés par des liens."),
            en = LocalizedContent("Who invented the World Wide Web?", listOf("Tim Berners-Lee", "Vint Cerf", "Bob Kahn", "Jon Postel"), "Technology", "Tim Berners-Lee invented the World Wide Web in 1989 at CERN, proposing a system of hypertext documents linked by links."),
            zh = LocalizedContent("谁发明了万维网？", listOf("蒂姆·伯纳斯-李", "文特·瑟夫", "鲍勃·卡恩", "乔恩·波斯特尔"), "科技", "蒂姆·伯纳斯-李于1989年在欧洲核子研究中心发明了万维网，提出了一个由链接连接的超文本文档系统。"),
            es = LocalizedContent("¿Quién inventó la World Wide Web?", listOf("Tim Berners-Lee", "Vint Cerf", "Bob Kahn", "Jon Postel"), "Tecnología", "Tim Berners-Lee inventó la World Wide Web en 1989 en el CERN, proponiendo un sistema de documentos hipertexto enlazados mediante vínculos.")
        ),
        BilingualQuestion(
            id = 11026, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus ancien moteur de recherche encore actif?", listOf("AltaVista", "Yahoo", "Google", "Excite"), "Technologie", "Yahoo, lancé en 1994 sous le nom \"Jerry and David's Guide to the World Wide Web\", est le plus ancien moteur de recherche encore en activité, bien qu'il ait évolué en portail web."),
            en = LocalizedContent("What is the oldest search engine still active?", listOf("AltaVista", "Yahoo", "Google", "Excite"), "Technology", "Yahoo, launched in 1994 as \"Jerry and David's Guide to the World Wide Web\", is the oldest search engine still active, although it has evolved into a web portal."),
            zh = LocalizedContent("最古老的仍在运行的搜索引擎是什么？", listOf("AltaVista", "Yahoo", "Google", "Excite"), "科技", "雅虎于1994年以“杰瑞和大卫的万维网指南”之名推出，是最古老的仍在运行的搜索引擎，尽管它已演变为一个门户网站。"),
            es = LocalizedContent("¿Cuál es el motor de búsqueda más antiguo aún activo?", listOf("AltaVista", "Yahoo", "Google", "Excite"), "Tecnología", "Yahoo, lanzado en 1994 como \"Jerry and David's Guide to the World Wide Web\", es el motor de búsqueda más antiguo aún activo, aunque ha evolucionado a un portal web.")
        ),
        BilingualQuestion(
            id = 11027, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année Bitcoin a-t-il été créé?", listOf("2009", "2008", "2011", "2010"), "Technologie", "Bitcoin a été créé en 2009 par une personne ou un groupe sous le pseudonyme de Satoshi Nakamoto, marquant le lancement du premier réseau de cryptomonnaie décentralisée."),
            en = LocalizedContent("In what year was Bitcoin created?", listOf("2009", "2008", "2011", "2010"), "Technology", "Bitcoin was created in 2009 by a person or group under the pseudonym Satoshi Nakamoto, marking the launch of the first decentralized cryptocurrency network."),
            zh = LocalizedContent("比特币是哪一年创建的？", listOf("2009", "2008", "2011", "2010"), "科技", "比特币于2009年由化名为中本聪的个人或团体创建，标志着第一个去中心化加密货币网络的启动。"),
            es = LocalizedContent("¿En qué año se creó Bitcoin?", listOf("2009", "2008", "2011", "2010"), "Tecnología", "Bitcoin fue creado en 2009 por una persona o grupo bajo el seudónimo de Satoshi Nakamoto, marcando el lanzamiento de la primera red de criptomoneda descentralizada.")
        ),
        BilingualQuestion(
            id = 11028, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le langage de programmation créé par Brendan Eich?", listOf("JavaScript", "TypeScript", "CoffeeScript", "Dart"), "Technologie", "Brendan Eich a créé JavaScript en 1995 alors qu'il travaillait chez Netscape, pour ajouter de l'interactivité aux pages web."),
            en = LocalizedContent("What programming language was created by Brendan Eich?", listOf("JavaScript", "TypeScript", "CoffeeScript", "Dart"), "Technology", "Brendan Eich created JavaScript in 1995 while working at Netscape, to add interactivity to web pages."),
            zh = LocalizedContent("布兰登·艾克创建了哪种编程语言？", listOf("JavaScript", "TypeScript", "CoffeeScript", "Dart"), "科技", "布兰登·艾克于1995年在网景公司工作时创建了JavaScript，旨在为网页增加交互性。"),
            es = LocalizedContent("¿Qué lenguaje de programación fue creado por Brendan Eich?", listOf("JavaScript", "TypeScript", "CoffeeScript", "Dart"), "Tecnología", "Brendan Eich creó JavaScript en 1995 mientras trabajaba en Netscape, para añadir interactividad a las páginas web.")
        ),
        BilingualQuestion(
            id = 11029, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce qu'une adresse IP?", listOf("Un identifiant unique pour un appareil sur internet", "Une alimentation pour ordinateur", "Un type de logiciel", "Une base de données"), "Technologie", "Une adresse IP permet d'identifier chaque appareil connecté à un réseau, comme un ordinateur ou un smartphone, pour acheminer correctement les données sur internet."),
            en = LocalizedContent("What is an IP address?", listOf("A unique identifier for a device on the internet", "A power supply for a computer", "A type of software", "A database"), "Technology", "An IP address identifies each device connected to a network, such as a computer or smartphone, to correctly route data on the internet."),
            zh = LocalizedContent("什么是IP地址？", listOf("互联网上设备的唯一标识符", "计算机的电源", "一种软件", "一种数据库"), "科技", "IP地址用于识别连接到网络的每个设备（如计算机或智能手机），以便在互联网上正确路由数据。"),
            es = LocalizedContent("¿Qué es una dirección IP?", listOf("Un identificador único para un dispositivo en internet", "Una fuente de alimentación para una computadora", "Un tipo de software", "Una base de datos"), "Tecnología", "Una dirección IP identifica cada dispositivo conectado a una red, como una computadora o un teléfono inteligente, para enrutar correctamente los datos en internet.")
        ),
        BilingualQuestion(
            id = 11030, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le système d'exploitation créé par Google?", listOf("Android", "ChromeOS", "iOS", "Windows"), "Technologie", "Android est le système d'exploitation mobile open source développé par Google, principalement utilisé sur les smartphones et tablettes."),
            en = LocalizedContent("What is the operating system created by Google?", listOf("Android", "ChromeOS", "iOS", "Windows"), "Technology", "Android is the open-source mobile operating system developed by Google, primarily used on smartphones and tablets."),
            zh = LocalizedContent("谷歌创建的操作系统是什么？", listOf("Android", "ChromeOS", "iOS", "Windows"), "科技", "Android是谷歌开发的开源移动操作系统，主要用于智能手机和平板电脑。"),
            es = LocalizedContent("¿Cuál es el sistema operativo creado por Google?", listOf("Android", "ChromeOS", "iOS", "Windows"), "Tecnología", "Android es el sistema operativo móvil de código abierto desarrollado por Google, utilizado principalmente en teléfonos inteligentes y tabletas.")
        ),
        BilingualQuestion(
            id = 11031, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année LinkedIn a-t-il été fondé?", listOf("2003", "2005", "2007", "2009"), "Technologie", "LinkedIn a été fondé en décembre 2002 et lancé officiellement le 5 mai 2003."),
            en = LocalizedContent("In what year was LinkedIn founded?", listOf("2003", "2005", "2007", "2009"), "Technology", "LinkedIn was founded in December 2002 and officially launched on May 5, 2003."),
            zh = LocalizedContent("LinkedIn成立于哪一年？", listOf("2003", "2005", "2007", "2009"), "科技", "LinkedIn成立于2002年12月，并于2003年5月5日正式上线。"),
            es = LocalizedContent("¿En qué año se fundó LinkedIn?", listOf("2003", "2005", "2007", "2009"), "Tecnología", "LinkedIn fue fundada en diciembre de 2002 y lanzada oficialmente el 5 de mayo de 2003.")
        ),
        BilingualQuestion(
            id = 11032, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a créé le langage Ruby?", listOf("Yukihiro Matsumoto", "Guido van Rossum", "Graydon Hoare", "David Heinemeier Hansson"), "Technologie", "Yukihiro Matsumoto, souvent appelé Matz, a développé Ruby au Japon dans les années 1990 pour combiner des aspects de ses langages préférés (Perl, Smalltalk, etc.) avec une approche orientée objet."),
            en = LocalizedContent("Who created the Ruby language?", listOf("Yukihiro Matsumoto", "Guido van Rossum", "Graydon Hoare", "David Heinemeier Hansson"), "Technology", "Yukihiro Matsumoto, often called Matz, developed Ruby in Japan in the 1990s to combine aspects of his favorite languages (Perl, Smalltalk, etc.) with an object-oriented approach."),
            zh = LocalizedContent("谁创建了Ruby语言？", listOf("松本行弘", "吉多·范罗苏姆", "格雷登·霍尔", "大卫·海涅迈尔·汉森"), "科技", "松本行弘（常被称为Matz）在20世纪90年代于日本开发了Ruby，旨在结合他喜爱的语言（Perl、Smalltalk等）的特点，并采用面向对象的方法。"),
            es = LocalizedContent("¿Quién creó el lenguaje Ruby?", listOf("Yukihiro Matsumoto", "Guido van Rossum", "Graydon Hoare", "David Heinemeier Hansson"), "Tecnología", "Yukihiro Matsumoto, a menudo llamado Matz, desarrolló Ruby en Japón en la década de 1990 para combinar aspectos de sus lenguajes favoritos (Perl, Smalltalk, etc.) con un enfoque orientado a objetos.")
        ),
        BilingualQuestion(
            id = 11033, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qu'est-ce qu'un cache informatique?", listOf("Une mémoire rapide pour stocker les données fréquemment utilisées", "Un fichier temporaire", "Un type d'antivirus", "Un disque dur externe"), "Technologie", "Le cache est une mémoire tampon à haute vitesse qui permet d'accélérer l'accès aux données en conservant les informations les plus sollicitées par le processeur ou le navigateur."),
            en = LocalizedContent("What is a computer cache?", listOf("A fast memory for storing frequently used data", "A temporary file", "A type of antivirus", "An external hard drive"), "Technology", "Cache is a high-speed buffer memory that speeds up data access by storing the most frequently requested information by the processor or browser."),
            zh = LocalizedContent("什么是计算机缓存？", listOf("一种用于存储常用数据的快速内存", "一个临时文件", "一种杀毒软件", "一个外部硬盘"), "科技", "缓存是一种高速缓冲存储器，通过存储处理器或浏览器最常请求的信息来加速数据访问。"),
            es = LocalizedContent("¿Qué es una caché informática?", listOf("Una memoria rápida para almacenar datos de uso frecuente", "Un archivo temporal", "Un tipo de antivirus", "Un disco duro externo"), "Tecnología", "La caché es una memoria intermedia de alta velocidad que acelera el acceso a los datos al almacenar la información más solicitada por el procesador o el navegador.")
        ),
        BilingualQuestion(
            id = 11034, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le protocole internet le plus sécurisé?", listOf("HTTPS", "HTTP", "FTP", "SMTP"), "Technologie", "HTTPS chiffre les échanges entre le navigateur et le site web via TLS, protégeant ainsi les données contre les interceptions."),
            en = LocalizedContent("What is the most secure internet protocol?", listOf("HTTPS", "HTTP", "FTP", "SMTP"), "Technology", "HTTPS encrypts exchanges between the browser and the website via TLS, thus protecting data against interception."),
            zh = LocalizedContent("最安全的互联网协议是什么？", listOf("HTTPS", "HTTP", "FTP", "SMTP"), "科技", "HTTPS通过TLS加密浏览器和网站之间的通信，从而保护数据不被拦截。"),
            es = LocalizedContent("¿Cuál es el protocolo de internet más seguro?", listOf("HTTPS", "HTTP", "FTP", "SMTP"), "Tecnología", "HTTPS cifra los intercambios entre el navegador y el sitio web mediante TLS, protegiendo así los datos contra la interceptación.")
        ),
        BilingualQuestion(
            id = 11035, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année Snapchat a-t-il été fondé?", listOf("2011", "2009", "2013", "2015"), "Technologie", "Snapchat a été fondé en 2011 par Evan Spiegel, Bobby Murphy et Reggie Brown, alors étudiants à l'université Stanford. L'application a été lancée en septembre de cette année-là."),
            en = LocalizedContent("In what year was Snapchat founded?", listOf("2011", "2009", "2013", "2015"), "Technology", "Snapchat was founded in 2011 by Evan Spiegel, Bobby Murphy, and Reggie Brown, then students at Stanford University. The app was launched in September of that year."),
            zh = LocalizedContent("Snapchat成立于哪一年？", listOf("2011", "2009", "2013", "2015"), "科技", "Snapchat由埃文·斯皮格尔、鲍比·墨菲和雷吉·布朗于2011年创立，当时他们是斯坦福大学的学生。该应用于同年9月上线。"),
            es = LocalizedContent("¿En qué año se fundó Snapchat?", listOf("2011", "2009", "2013", "2015"), "Tecnología", "Snapchat fue fundado en 2011 por Evan Spiegel, Bobby Murphy y Reggie Brown, entonces estudiantes de la Universidad de Stanford. La aplicación se lanzó en septiembre de ese año.")
        ),
        BilingualQuestion(
            id = 11036, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a inventé le langage SQL?", listOf("Donald Chamberlin et Raymond Boyce", "Guido van Rossum", "Dennis Ritchie", "Bjarne Stroustrup"), "Technologie", "Donald Chamberlin et Raymond Boyce ont développé SQL dans les années 1970 chez IBM, initialement nommé SEQUEL, pour manipuler les bases de données relationnelles."),
            en = LocalizedContent("Who invented the SQL language?", listOf("Donald Chamberlin and Raymond Boyce", "Guido van Rossum", "Dennis Ritchie", "Bjarne Stroustrup"), "Technology", "Donald Chamberlin and Raymond Boyce developed SQL in the 1970s at IBM, initially named SEQUEL, to manipulate relational databases."),
            zh = LocalizedContent("谁发明了SQL语言？", listOf("唐纳德·钱柏林和雷蒙德·博伊斯", "吉多·范罗苏姆", "丹尼斯·里奇", "比雅尼·斯特劳斯特鲁普"), "科技", "唐纳德·钱柏林和雷蒙德·博伊斯在20世纪70年代于IBM开发了SQL，最初名为SEQUEL，用于操作关系数据库。"),
            es = LocalizedContent("¿Quién inventó el lenguaje SQL?", listOf("Donald Chamberlin y Raymond Boyce", "Guido van Rossum", "Dennis Ritchie", "Bjarne Stroustrup"), "Tecnología", "Donald Chamberlin y Raymond Boyce desarrollaron SQL en la década de 1970 en IBM, inicialmente llamado SEQUEL, para manipular bases de datos relacionales.")
        ),
        BilingualQuestion(
            id = 11037, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qu'est-ce que la cybersécurité?", listOf("La protection contre les attaques informatiques", "Un type d'antivirus", "Un langage de programmation", "Un système d'exploitation"), "Technologie", "La cybersécurité désigne l'ensemble des pratiques et technologies visant à protéger les systèmes informatiques, réseaux et données contre les accès non autorisés ou les attaques malveillantes."),
            en = LocalizedContent("What is cybersecurity?", listOf("Protection against computer attacks", "A type of antivirus", "A programming language", "An operating system"), "Technology", "Cybersecurity refers to the set of practices and technologies aimed at protecting computer systems, networks, and data from unauthorized access or malicious attacks."),
            zh = LocalizedContent("什么是网络安全？", listOf("防范计算机攻击的保护措施", "一种杀毒软件", "一种编程语言", "一种操作系统"), "科技", "网络安全是指旨在保护计算机系统、网络和数据免受未经授权访问或恶意攻击的一系列实践和技术。"),
            es = LocalizedContent("¿Qué es la ciberseguridad?", listOf("La protección contra ataques informáticos", "Un tipo de antivirus", "Un lenguaje de programación", "Un sistema operativo"), "Tecnología", "La ciberseguridad se refiere al conjunto de prácticas y tecnologías destinadas a proteger los sistemas informáticos, redes y datos contra accesos no autorizados o ataques maliciosos.")
        ),
        BilingualQuestion(
            id = 11038, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le plus grand réseau social du monde?", listOf("Facebook", "Instagram", "TikTok", "YouTube"), "Technologie", "Facebook comptait plus de 3 milliards d'utilisateurs actifs mensuels en 2024, dépassant largement YouTube et Instagram."),
            en = LocalizedContent("What is the largest social network in the world?", listOf("Facebook", "Instagram", "TikTok", "YouTube"), "Technology", "Facebook had over 3 billion monthly active users in 2024, far surpassing YouTube and Instagram."),
            zh = LocalizedContent("世界上最大的社交网络是什么？", listOf("Facebook", "Instagram", "TikTok", "YouTube"), "科技", "Facebook在2024年拥有超过30亿月活跃用户，远超YouTube和Instagram。"),
            es = LocalizedContent("¿Cuál es la red social más grande del mundo?", listOf("Facebook", "Instagram", "TikTok", "YouTube"), "Tecnología", "Facebook tenía más de 3 mil millones de usuarios activos mensuales en 2024, superando ampliamente a YouTube e Instagram.")
        ),
        BilingualQuestion(
            id = 11039, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année Intel a-t-il lancé le premier microprocesseur?", listOf("1971", "1975", "1980", "1985"), "Technologie", "Le premier microprocesseur commercialisé par Intel, le 4004, a été lancé en 1971, marquant le début de l'ère des microprocesseurs."),
            en = LocalizedContent("In what year did Intel launch the first microprocessor?", listOf("1971", "1975", "1980", "1985"), "Technology", "Intel's first commercial microprocessor, the 4004, was launched in 1971, marking the beginning of the microprocessor era."),
            zh = LocalizedContent("英特尔在哪一年推出了第一款微处理器？", listOf("1971", "1975", "1980", "1985"), "科技", "英特尔的第一款商用微处理器4004于1971年推出，标志着微处理器时代的开始。"),
            es = LocalizedContent("¿En qué año lanzó Intel el primer microprocesador?", listOf("1971", "1975", "1980", "1985"), "Tecnología", "El primer microprocesador comercial de Intel, el 4004, se lanzó en 1971, marcando el comienzo de la era de los microprocesadores.")
        ),
        BilingualQuestion(
            id = 11040, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a créé Apache Kafka?", listOf("LinkedIn", "Google", "Facebook", "Amazon"), "Technologie", "Apache Kafka a été créé par LinkedIn pour gérer les flux de données en temps réel, avant d'être open-sourcé via la fondation Apache."),
            en = LocalizedContent("Who created Apache Kafka?", listOf("LinkedIn", "Google", "Facebook", "Amazon"), "Technology", "Apache Kafka was created by LinkedIn to handle real-time data streams, before being open-sourced through the Apache Foundation."),
            zh = LocalizedContent("谁创建了Apache Kafka？", listOf("LinkedIn", "Google", "Facebook", "Amazon"), "科技", "Apache Kafka 由 LinkedIn 创建，用于处理实时数据流，随后通过 Apache 基金会开源。"),
            es = LocalizedContent("¿Quién creó Apache Kafka?", listOf("LinkedIn", "Google", "Facebook", "Amazon"), "Tecnología", "Apache Kafka fue creado por LinkedIn para manejar flujos de datos en tiempo real, antes de ser de código abierto a través de la Fundación Apache.")
        ),
        BilingualQuestion(
            id = 11041, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce qu'un pare-feu informatique?", listOf("Un système de sécurité qui contrôle le trafic réseau", "Un type de disque dur", "Un langage de programmation", "Un antivirus"), "Technologie", "Un pare-feu agit comme une barrière entre un réseau interne (comme un ordinateur) et Internet, filtrant les données entrantes et sortantes selon des règles de sécurité prédéfinies pour bloquer les accès non autorisés."),
            en = LocalizedContent("What is a computer firewall?", listOf("A security system that controls network traffic", "A type of hard drive", "A programming language", "An antivirus"), "Technology", "A firewall acts as a barrier between an internal network (like a computer) and the Internet, filtering incoming and outgoing data according to predefined security rules to block unauthorized access."),
            zh = LocalizedContent("什么是计算机防火墙？", listOf("一种控制网络流量的安全系统", "一种硬盘类型", "一种编程语言", "一种杀毒软件"), "科技", "防火墙充当内部网络（如计算机）与互联网之间的屏障，根据预定义的安全规则过滤进出数据，以阻止未经授权的访问。"),
            es = LocalizedContent("¿Qué es un cortafuegos informático?", listOf("Un sistema de seguridad que controla el tráfico de red", "Un tipo de disco duro", "Un lenguaje de programación", "Un antivirus"), "Tecnología", "Un cortafuegos actúa como una barrera entre una red interna (como un ordenador) e Internet, filtrando los datos entrantes y salientes según reglas de seguridad predefinidas para bloquear accesos no autorizados.")
        ),
        BilingualQuestion(
            id = 11042, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année Kubernetes a-t-il été lancé?", listOf("2014", "2015", "2013", "2016"), "Technologie", "Kubernetes a été initialement développé par Google et annoncé en 2014, avant d'être offert à la Cloud Native Computing Foundation en 2015."),
            en = LocalizedContent("In which year was Kubernetes launched?", listOf("2014", "2015", "2013", "2016"), "Technology", "Kubernetes was initially developed by Google and announced in 2014, before being offered to the Cloud Native Computing Foundation in 2015."),
            zh = LocalizedContent("Kubernetes 是哪一年推出的？", listOf("2014", "2015", "2013", "2016"), "科技", "Kubernetes 最初由 Google 开发，于 2014 年宣布，随后于 2015 年捐赠给云原生计算基金会。"),
            es = LocalizedContent("¿En qué año se lanzó Kubernetes?", listOf("2014", "2015", "2013", "2016"), "Tecnología", "Kubernetes fue desarrollado inicialmente por Google y anunciado en 2014, antes de ser ofrecido a la Cloud Native Computing Foundation en 2015.")
        ),
        BilingualQuestion(
            id = 11043, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le langage de programmation utilisé pour les scripts système?", listOf("Bash", "Python", "Java", "C++"), "Technologie", "Bash est le langage de script par défaut sur la plupart des systèmes Unix et Linux, utilisé pour automatiser des tâches système comme la gestion de fichiers ou l'exécution de commandes."),
            en = LocalizedContent("Which programming language is used for system scripting?", listOf("Bash", "Python", "Java", "C++"), "Technology", "Bash is the default scripting language on most Unix and Linux systems, used to automate system tasks like file management or command execution."),
            zh = LocalizedContent("哪种编程语言用于系统脚本？", listOf("Bash", "Python", "Java", "C++"), "科技", "Bash 是大多数 Unix 和 Linux 系统上的默认脚本语言，用于自动化系统任务，如文件管理或命令执行。"),
            es = LocalizedContent("¿Qué lenguaje de programación se utiliza para la creación de scripts del sistema?", listOf("Bash", "Python", "Java", "C++"), "Tecnología", "Bash es el lenguaje de script predeterminado en la mayoría de los sistemas Unix y Linux, utilizado para automatizar tareas del sistema como la gestión de archivos o la ejecución de comandos.")
        ),
        BilingualQuestion(
            id = 11044, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a créé le concept de machine virtuelle?", listOf("IBM", "Microsoft", "Apple", "Google"), "Technologie", "IBM a développé le concept de machine virtuelle dans les années 1960 avec le système CP-40, visant à partager les ressources d'un mainframe entre plusieurs utilisateurs."),
            en = LocalizedContent("Who created the concept of the virtual machine?", listOf("IBM", "Microsoft", "Apple", "Google"), "Technology", "IBM developed the concept of the virtual machine in the 1960s with the CP-40 system, aiming to share mainframe resources among multiple users."),
            zh = LocalizedContent("谁创造了虚拟机的概念？", listOf("IBM", "Microsoft", "Apple", "Google"), "科技", "IBM 在 20 世纪 60 年代通过 CP-40 系统开发了虚拟机的概念，旨在多个用户之间共享大型机资源。"),
            es = LocalizedContent("¿Quién creó el concepto de máquina virtual?", listOf("IBM", "Microsoft", "Apple", "Google"), "Tecnología", "IBM desarrolló el concepto de máquina virtual en la década de 1960 con el sistema CP-40, con el objetivo de compartir los recursos de un mainframe entre múltiples usuarios.")
        ),
        BilingualQuestion(
            id = 11045, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que le machine learning?", listOf("L'apprentissage automatique des machines", "Un type de robotique", "Un langage de programmation", "Un système d'exploitation"), "Technologie", "Le machine learning, ou apprentissage automatique, est une branche de l'intelligence artificielle où les machines apprennent à partir de données sans être explicitement programmées."),
            en = LocalizedContent("What is machine learning?", listOf("Automatic learning of machines", "A type of robotics", "A programming language", "An operating system"), "Technology", "Machine learning is a branch of artificial intelligence where machines learn from data without being explicitly programmed."),
            zh = LocalizedContent("什么是机器学习？", listOf("机器的自动学习", "一种机器人技术", "一种编程语言", "一种操作系统"), "科技", "机器学习是人工智能的一个分支，机器从数据中学习，而无需显式编程。"),
            es = LocalizedContent("¿Qué es el aprendizaje automático?", listOf("Aprendizaje automático de las máquinas", "Un tipo de robótica", "Un lenguaje de programación", "Un sistema operativo"), "Tecnología", "El aprendizaje automático es una rama de la inteligencia artificial donde las máquinas aprenden a partir de datos sin ser programadas explícitamente.")
        ),
        BilingualQuestion(
            id = 11046, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année Docker a-t-il été lancé?", listOf("2013", "2012", "2014", "2015"), "Technologie", "Docker a été lancé en 2013 par Solomon Hykes lors de la conférence PyCon, révolutionnant le déploiement d'applications avec la conteneurisation."),
            en = LocalizedContent("In which year was Docker launched?", listOf("2013", "2012", "2014", "2015"), "Technology", "Docker was launched in 2013 by Solomon Hykes at the PyCon conference, revolutionizing application deployment with containerization."),
            zh = LocalizedContent("Docker 是哪一年推出的？", listOf("2013", "2012", "2014", "2015"), "科技", "Docker 由 Solomon Hykes 在 2013 年的 PyCon 大会上推出，通过容器化彻底改变了应用程序的部署方式。"),
            es = LocalizedContent("¿En qué año se lanzó Docker?", listOf("2013", "2012", "2014", "2015"), "Tecnología", "Docker fue lanzado en 2013 por Solomon Hykes en la conferencia PyCon, revolucionando el despliegue de aplicaciones con la contenedorización.")
        ),
        BilingualQuestion(
            id = 11047, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le créateur de Rust?", listOf("Graydon Hoare", "Guido van Rossum", "Bjarne Stroustrup", "Dennis Ritchie"), "Technologie", "Graydon Hoare a conçu Rust comme un projet personnel chez Mozilla Research, visant à créer un langage système sûr et concurrent."),
            en = LocalizedContent("Who is the creator of Rust?", listOf("Graydon Hoare", "Guido van Rossum", "Bjarne Stroustrup", "Dennis Ritchie"), "Technology", "Graydon Hoare designed Rust as a personal project at Mozilla Research, aiming to create a safe and concurrent systems language."),
            zh = LocalizedContent("谁是 Rust 的创造者？", listOf("Graydon Hoare", "Guido van Rossum", "Bjarne Stroustrup", "Dennis Ritchie"), "科技", "Graydon Hoare 在 Mozilla Research 作为个人项目设计了 Rust，旨在创建一种安全且并发的系统语言。"),
            es = LocalizedContent("¿Quién es el creador de Rust?", listOf("Graydon Hoare", "Guido van Rossum", "Bjarne Stroustrup", "Dennis Ritchie"), "Tecnología", "Graydon Hoare diseñó Rust como un proyecto personal en Mozilla Research, con el objetivo de crear un lenguaje de sistemas seguro y concurrente.")
        ),
        BilingualQuestion(
            id = 11048, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce qu'une API?", listOf("Une interface de programmation d'application", "Un type de base de données", "Un langage de programmation", "Un système d'exploitation"), "Technologie", "Une API (Application Programming Interface) est un ensemble de règles qui permet à des logiciels de communiquer entre eux, comme un serveur de restaurant prenant les commandes entre le client et la cuisine."),
            en = LocalizedContent("What is an API?", listOf("An application programming interface", "A type of database", "A programming language", "An operating system"), "Technology", "An API (Application Programming Interface) is a set of rules that allows software to communicate with each other, like a restaurant server taking orders between the customer and the kitchen."),
            zh = LocalizedContent("什么是 API？", listOf("应用程序编程接口", "一种数据库类型", "一种编程语言", "一种操作系统"), "科技", "API（应用程序编程接口）是一组规则，允许软件之间相互通信，就像餐厅服务员在顾客和厨房之间传递订单一样。"),
            es = LocalizedContent("¿Qué es una API?", listOf("Una interfaz de programación de aplicaciones", "Un tipo de base de datos", "Un lenguaje de programación", "Un sistema operativo"), "Tecnología", "Una API (Interfaz de Programación de Aplicaciones) es un conjunto de reglas que permite que los programas de software se comuniquen entre sí, como un camarero que toma pedidos entre el cliente y la cocina.")
        ),
        BilingualQuestion(
            id = 11049, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année AWS a-t-il été lancé?", listOf("2006", "2005", "2007", "2008"), "Technologie", "AWS, le service de cloud computing d'Amazon, a été officiellement lancé en 2006 avec ses premiers services comme S3 et EC2."),
            en = LocalizedContent("In which year was AWS launched?", listOf("2006", "2005", "2007", "2008"), "Technology", "AWS, Amazon's cloud computing service, was officially launched in 2006 with its first services like S3 and EC2."),
            zh = LocalizedContent("AWS 是哪一年推出的？", listOf("2006", "2005", "2007", "2008"), "科技", "AWS，亚马逊的云计算服务，于 2006 年正式推出，首批服务包括 S3 和 EC2。"),
            es = LocalizedContent("¿En qué año se lanzó AWS?", listOf("2006", "2005", "2007", "2008"), "Tecnología", "AWS, el servicio de computación en la nube de Amazon, se lanzó oficialmente en 2006 con sus primeros servicios como S3 y EC2.")
        ),
        BilingualQuestion(
            id = 11050, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a créé le langage Perl?", listOf("Larry Wall", "Guido van Rossum", "Dennis Ritchie", "Bjarne Stroustrup"), "Technologie", "Larry Wall a créé Perl en 1987 pour faciliter le traitement de rapports et de fichiers texte. Il a conçu ce langage en combinant des éléments de C, sed, awk et shell scripting."),
            en = LocalizedContent("Who created the Perl language?", listOf("Larry Wall", "Guido van Rossum", "Dennis Ritchie", "Bjarne Stroustrup"), "Technology", "Larry Wall created Perl in 1987 to facilitate report and text file processing. He designed the language by combining elements of C, sed, awk, and shell scripting."),
            zh = LocalizedContent("谁创建了Perl语言？", listOf("拉里·沃尔", "吉多·范罗苏姆", "丹尼斯·里奇", "比雅尼·斯特劳斯特鲁普"), "科技", "拉里·沃尔于1987年创建了Perl，以简化报告和文本文件的处理。他结合了C、sed、awk和shell脚本的元素设计了该语言。"),
            es = LocalizedContent("¿Quién creó el lenguaje Perl?", listOf("Larry Wall", "Guido van Rossum", "Dennis Ritchie", "Bjarne Stroustrup"), "Tecnología", "Larry Wall creó Perl en 1987 para facilitar el procesamiento de informes y archivos de texto. Diseñó el lenguaje combinando elementos de C, sed, awk y shell scripting.")
        ),
        BilingualQuestion(
            id = 11051, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que la virtualisation?", listOf("La création de ressources informatiques virtuelles", "Un type d'antivirus", "Un langage de programmation", "Un système d'exploitation"), "Technologie", "La virtualisation permet de créer des versions virtuelles de ressources physiques (serveurs, stockage, réseau) via un logiciel, optimisant ainsi l'utilisation du matériel et réduisant les coûts."),
            en = LocalizedContent("What is virtualization?", listOf("The creation of virtual computing resources", "A type of antivirus", "A programming language", "An operating system"), "Technology", "Virtualization allows the creation of virtual versions of physical resources (servers, storage, network) via software, optimizing hardware usage and reducing costs."),
            zh = LocalizedContent("什么是虚拟化？", listOf("创建虚拟计算资源", "一种杀毒软件", "一种编程语言", "一种操作系统"), "科技", "虚拟化通过软件创建物理资源（服务器、存储、网络）的虚拟版本，从而优化硬件使用并降低成本。"),
            es = LocalizedContent("¿Qué es la virtualización?", listOf("La creación de recursos informáticos virtuales", "Un tipo de antivirus", "Un lenguaje de programación", "Un sistema operativo"), "Tecnología", "La virtualización permite crear versiones virtuales de recursos físicos (servidores, almacenamiento, red) mediante software, optimizando el uso del hardware y reduciendo costos.")
        ),
        BilingualQuestion(
            id = 11052, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année Git a-t-il été créé?", listOf("2005", "2004", "2006", "2007"), "Technologie", "Git a été créé en 2005 par Linus Torvalds pour gérer le développement du noyau Linux, après que la licence de son outil précédent, BitKeeper, ait été révoquée."),
            en = LocalizedContent("In what year was Git created?", listOf("2005", "2004", "2006", "2007"), "Technology", "Git was created in 2005 by Linus Torvalds to manage the development of the Linux kernel, after the license of its previous tool, BitKeeper, was revoked."),
            zh = LocalizedContent("Git是哪一年创建的？", listOf("2005", "2004", "2006", "2007"), "科技", "Git由林纳斯·托瓦兹于2005年创建，用于管理Linux内核的开发，此前其工具BitKeeper的许可证被撤销。"),
            es = LocalizedContent("¿En qué año se creó Git?", listOf("2005", "2004", "2006", "2007"), "Tecnología", "Git fue creado en 2005 por Linus Torvalds para gestionar el desarrollo del kernel de Linux, después de que se revocara la licencia de su herramienta anterior, BitKeeper.")
        ),
        BilingualQuestion(
            id = 11053, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le créateur de JavaScript?", listOf("Brendan Eich", "Guido van Rossum", "Dennis Ritchie", "Bjarne Stroustrup"), "Technologie", "Brendan Eich a créé JavaScript en 1995 alors qu'il travaillait chez Netscape, pour ajouter de l'interactivité aux pages web."),
            en = LocalizedContent("Who is the creator of JavaScript?", listOf("Brendan Eich", "Guido van Rossum", "Dennis Ritchie", "Bjarne Stroustrup"), "Technology", "Brendan Eich created JavaScript in 1995 while working at Netscape, to add interactivity to web pages."),
            zh = LocalizedContent("JavaScript的创建者是谁？", listOf("布兰登·艾克", "吉多·范罗苏姆", "丹尼斯·里奇", "比雅尼·斯特劳斯特鲁普"), "科技", "布兰登·艾克于1995年在网景公司工作时创建了JavaScript，旨在为网页增加交互性。"),
            es = LocalizedContent("¿Quién es el creador de JavaScript?", listOf("Brendan Eich", "Guido van Rossum", "Dennis Ritchie", "Bjarne Stroustrup"), "Tecnología", "Brendan Eich creó JavaScript en 1995 mientras trabajaba en Netscape, para añadir interactividad a las páginas web.")
        ),
        BilingualQuestion(
            id = 11054, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qu'est-ce que DevOps?", listOf("Une culture et des pratiques de développement et exploitation", "Un langage de programmation", "Un système d'exploitation", "Un type de base de données"), "Technologie", "DevOps désigne l'ensemble des pratiques visant à unifier le développement logiciel (Dev) et les opérations informatiques (Ops), en automatisant les processus pour améliorer la collaboration et la rapidité de livraison."),
            en = LocalizedContent("What is DevOps?", listOf("A culture and practices of development and operations", "A programming language", "An operating system", "A type of database"), "Technology", "DevOps refers to the set of practices that unify software development (Dev) and IT operations (Ops), automating processes to improve collaboration and delivery speed."),
            zh = LocalizedContent("什么是DevOps？", listOf("一种开发与运维的文化和实践", "一种编程语言", "一种操作系统", "一种数据库类型"), "科技", "DevOps指统一软件开发（Dev）和信息技术运维（Ops）的一系列实践，通过自动化流程改善协作并加快交付速度。"),
            es = LocalizedContent("¿Qué es DevOps?", listOf("Una cultura y prácticas de desarrollo y operaciones", "Un lenguaje de programación", "Un sistema operativo", "Un tipo de base de datos"), "Tecnología", "DevOps se refiere al conjunto de prácticas que unifican el desarrollo de software (Dev) y las operaciones de TI (Ops), automatizando procesos para mejorar la colaboración y la velocidad de entrega.")
        ),
        BilingualQuestion(
            id = 11055, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année React a-t-il été créé par Facebook?", listOf("2013", "2012", "2014", "2015"), "Technologie", "React a été initialement développé par Jordan Walke, un ingénieur de Facebook, et déployé pour la première fois sur le fil d'actualité du réseau social en 2011, avant d'être rendu open source en 2013."),
            en = LocalizedContent("In what year was React created by Facebook?", listOf("2013", "2012", "2014", "2015"), "Technology", "React was initially developed by Jordan Walke, a Facebook engineer, and first deployed on the social network's news feed in 2011, before being open-sourced in 2013."),
            zh = LocalizedContent("Facebook在哪一年创建了React？", listOf("2013", "2012", "2014", "2015"), "科技", "React最初由Facebook工程师乔丹·沃克开发，于2011年首次部署在社交网络的信息流上，随后于2013年开源。"),
            es = LocalizedContent("¿En qué año fue creado React por Facebook?", listOf("2013", "2012", "2014", "2015"), "Tecnología", "React fue desarrollado inicialmente por Jordan Walke, un ingeniero de Facebook, y se implementó por primera vez en el feed de noticias de la red social en 2011, antes de ser de código abierto en 2013.")
        ),
        BilingualQuestion(
            id = 11056, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le langage de programmation créé par Tim Berners-Lee?", listOf("HTML", "JavaScript", "Java", "Python"), "Technologie", "Tim Berners-Lee a inventé le HTML en 1990 comme langage de balisage pour structurer les pages web, en parallèle de la création du World Wide Web."),
            en = LocalizedContent("What is the programming language created by Tim Berners-Lee?", listOf("HTML", "JavaScript", "Java", "Python"), "Technology", "Tim Berners-Lee invented HTML in 1990 as a markup language to structure web pages, alongside the creation of the World Wide Web."),
            zh = LocalizedContent("蒂姆·伯纳斯-李创建的编程语言是什么？", listOf("HTML", "JavaScript", "Java", "Python"), "科技", "蒂姆·伯纳斯-李于1990年发明了HTML，作为一种标记语言来结构化网页，同时创建了万维网。"),
            es = LocalizedContent("¿Cuál es el lenguaje de programación creado por Tim Berners-Lee?", listOf("HTML", "JavaScript", "Java", "Python"), "Tecnología", "Tim Berners-Lee inventó HTML en 1990 como un lenguaje de marcado para estructurar páginas web, junto con la creación de la World Wide Web.")
        ),
        BilingualQuestion(
            id = 11057, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qu'est-ce que la tokenization en cryptographie?", listOf("La division de données en unités plus petites", "Un type de chiffrement", "Un langage de programmation", "Un système d'exploitation"), "Technologie", "En cryptographie, la tokenisation remplace des données sensibles par des jetons uniques, divisant ainsi l'information en unités plus petites et sécurisées pour éviter l'exposition directe des données originales."),
            en = LocalizedContent("What is tokenization in cryptography?", listOf("The division of data into smaller units", "A type of encryption", "A programming language", "An operating system"), "Technology", "In cryptography, tokenization replaces sensitive data with unique tokens, dividing information into smaller, secure units to avoid direct exposure of original data."),
            zh = LocalizedContent("密码学中的令牌化是什么？", listOf("将数据分割成更小的单元", "一种加密类型", "一种编程语言", "一种操作系统"), "科技", "在密码学中，令牌化用唯一令牌替换敏感数据，将信息分割成更小、更安全的单元，以避免原始数据的直接暴露。"),
            es = LocalizedContent("¿Qué es la tokenización en criptografía?", listOf("La división de datos en unidades más pequeñas", "Un tipo de cifrado", "Un lenguaje de programación", "Un sistema operativo"), "Tecnología", "En criptografía, la tokenización reemplaza datos sensibles con tokens únicos, dividiendo la información en unidades más pequeñas y seguras para evitar la exposición directa de los datos originales.")
        ),
        BilingualQuestion(
            id = 11058, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année Angular a-t-il été lancé?", listOf("2010", "2009", "2011", "2012"), "Technologie", "Angular a été initialement lancé par Google en 2010 sous le nom d'AngularJS, marquant le début de ce framework JavaScript pour applications web."),
            en = LocalizedContent("In what year was Angular launched?", listOf("2010", "2009", "2011", "2012"), "Technology", "Angular was initially launched by Google in 2010 under the name AngularJS, marking the beginning of this JavaScript framework for web applications."),
            zh = LocalizedContent("Angular是哪一年推出的？", listOf("2010", "2009", "2011", "2012"), "科技", "Angular最初由谷歌于2010年以AngularJS的名称推出，标志着这个用于Web应用的JavaScript框架的开始。"),
            es = LocalizedContent("¿En qué año se lanzó Angular?", listOf("2010", "2009", "2011", "2012"), "Tecnología", "Angular fue lanzado inicialmente por Google en 2010 bajo el nombre AngularJS, marcando el inicio de este framework JavaScript para aplicaciones web.")
        ),
        BilingualQuestion(
            id = 11059, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel est le créateur de Scala?", listOf("Martin Odersky", "Guido van Rossum", "Dennis Ritchie", "Bjarne Stroustrup"), "Technologie", "Martin Odersky a conçu Scala au début des années 2000 au laboratoire de programmation de l'École polytechnique fédérale de Lausanne, combinant programmation orientée objet et fonctionnelle."),
            en = LocalizedContent("Who is the creator of Scala?", listOf("Martin Odersky", "Guido van Rossum", "Dennis Ritchie", "Bjarne Stroustrup"), "Technology", "Martin Odersky designed Scala in the early 2000s at the Programming Laboratory of the Swiss Federal Institute of Technology Lausanne, combining object-oriented and functional programming."),
            zh = LocalizedContent("Scala的创建者是谁？", listOf("马丁·奥德斯基", "吉多·范罗苏姆", "丹尼斯·里奇", "比雅尼·斯特劳斯特鲁普"), "科技", "马丁·奥德斯基在21世纪初于洛桑联邦理工学院编程实验室设计了Scala，结合了面向对象和函数式编程。"),
            es = LocalizedContent("¿Quién es el creador de Scala?", listOf("Martin Odersky", "Guido van Rossum", "Dennis Ritchie", "Bjarne Stroustrup"), "Tecnología", "Martin Odersky diseñó Scala a principios de la década de 2000 en el Laboratorio de Programación de la Escuela Politécnica Federal de Lausana, combinando programación orientada a objetos y funcional.")
        ),
        BilingualQuestion(
            id = 11060, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qu'est-ce que la conteneurisation?", listOf("La technologie d'empaquetage des applications", "Un type de base de données", "Un langage de programmation", "Un système d'exploitation"), "Technologie", "La conteneurisation permet d'empaqueter une application avec ses dépendances dans un conteneur isolé, garantissant son fonctionnement uniforme sur différents environnements informatiques."),
            en = LocalizedContent("What is containerization?", listOf("Technology for packaging applications", "A type of database", "A programming language", "An operating system"), "Technology", "Containerization allows packaging an application with its dependencies into an isolated container, ensuring consistent operation across different computing environments."),
            zh = LocalizedContent("什么是容器化？", listOf("应用程序打包技术", "一种数据库", "一种编程语言", "一种操作系统"), "科技", "容器化允许将应用程序及其依赖项打包到隔离的容器中，确保在不同计算环境中的一致运行。"),
            es = LocalizedContent("¿Qué es la contenedorización?", listOf("Tecnología de empaquetado de aplicaciones", "Un tipo de base de datos", "Un lenguaje de programación", "Un sistema operativo"), "Tecnología", "La contenedorización permite empaquetar una aplicación con sus dependencias en un contenedor aislado, garantizando un funcionamiento uniforme en diferentes entornos informáticos.")
        ),
        BilingualQuestion(
            id = 11061, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année Node.js a-t-il été créé?", listOf("2009", "2008", "2010", "2011"), "Technologie", "Node.js a été créé en 2009 par Ryan Dahl, qui a présenté le projet lors de la conférence JSConf EU cette année-là."),
            en = LocalizedContent("In what year was Node.js created?", listOf("2009", "2008", "2010", "2011"), "Technology", "Node.js was created in 2009 by Ryan Dahl, who presented the project at the JSConf EU conference that year."),
            zh = LocalizedContent("Node.js 是哪一年创建的？", listOf("2009", "2008", "2010", "2011"), "科技", "Node.js 由 Ryan Dahl 于 2009 年创建，并在同年的 JSConf EU 会议上展示了该项目。"),
            es = LocalizedContent("¿En qué año se creó Node.js?", listOf("2009", "2008", "2010", "2011"), "Tecnología", "Node.js fue creado en 2009 por Ryan Dahl, quien presentó el proyecto en la conferencia JSConf EU ese año.")
        ),
        BilingualQuestion(
            id = 11062, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le créateur de Go?", listOf("Robert Griesemer, Rob Pike et Ken Thompson", "Guido van Rossum", "Dennis Ritchie", "Bjarne Stroustrup"), "Technologie", "Go a été créé chez Google en 2007 par Robert Griesemer, Rob Pike et Ken Thompson pour répondre aux besoins de programmation système moderne."),
            en = LocalizedContent("Who is the creator of Go?", listOf("Robert Griesemer, Rob Pike and Ken Thompson", "Guido van Rossum", "Dennis Ritchie", "Bjarne Stroustrup"), "Technology", "Go was created at Google in 2007 by Robert Griesemer, Rob Pike and Ken Thompson to meet the needs of modern system programming."),
            zh = LocalizedContent("Go 语言的创建者是谁？", listOf("Robert Griesemer、Rob Pike 和 Ken Thompson", "Guido van Rossum", "Dennis Ritchie", "Bjarne Stroustrup"), "科技", "Go 语言于 2007 年在 Google 由 Robert Griesemer、Rob Pike 和 Ken Thompson 创建，以满足现代系统编程的需求。"),
            es = LocalizedContent("¿Quién es el creador de Go?", listOf("Robert Griesemer, Rob Pike y Ken Thompson", "Guido van Rossum", "Dennis Ritchie", "Bjarne Stroustrup"), "Tecnología", "Go fue creado en Google en 2007 por Robert Griesemer, Rob Pike y Ken Thompson para satisfacer las necesidades de la programación de sistemas moderna.")
        ),
        BilingualQuestion(
            id = 11063, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qu'est-ce que l'orchestration de conteneurs?", listOf("La gestion automatisée des conteneurs", "Un type de base de données", "Un langage de programmation", "Un système d'exploitation"), "Technologie", "L'orchestration de conteneurs automatise le déploiement, la mise à l'échelle et la gestion des conteneurs, évitant les tâches manuelles complexes."),
            en = LocalizedContent("What is container orchestration?", listOf("Automated management of containers", "A type of database", "A programming language", "An operating system"), "Technology", "Container orchestration automates the deployment, scaling, and management of containers, avoiding complex manual tasks."),
            zh = LocalizedContent("什么是容器编排？", listOf("容器的自动化管理", "一种数据库", "一种编程语言", "一种操作系统"), "科技", "容器编排自动化容器的部署、扩展和管理，避免了复杂的手动任务。"),
            es = LocalizedContent("¿Qué es la orquestación de contenedores?", listOf("Gestión automatizada de contenedores", "Un tipo de base de datos", "Un lenguaje de programación", "Un sistema operativo"), "Tecnología", "La orquestación de contenedores automatiza el despliegue, escalado y gestión de contenedores, evitando tareas manuales complejas.")
        ),
        BilingualQuestion(
            id = 11064, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année Vue.js a-t-il été créé?", listOf("2014", "2013", "2015", "2016"), "Technologie", "Vue.js a été créé par Evan You en 2014, après qu'il ait travaillé sur AngularJS chez Google, cherchant à extraire les parties les plus intéressantes de ce framework."),
            en = LocalizedContent("In what year was Vue.js created?", listOf("2014", "2013", "2015", "2016"), "Technology", "Vue.js was created by Evan You in 2014, after working on AngularJS at Google, seeking to extract the most interesting parts of that framework."),
            zh = LocalizedContent("Vue.js 是哪一年创建的？", listOf("2014", "2013", "2015", "2016"), "科技", "Vue.js 由尤雨溪于 2014 年创建，他在 Google 从事 AngularJS 工作后，试图提取该框架中最有趣的部分。"),
            es = LocalizedContent("¿En qué año se creó Vue.js?", listOf("2014", "2013", "2015", "2016"), "Tecnología", "Vue.js fue creado por Evan You en 2014, después de trabajar en AngularJS en Google, buscando extraer las partes más interesantes de ese framework.")
        ),
        BilingualQuestion(
            id = 11065, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le créateur de TypeScript?", listOf("Anders Hejlsberg", "Guido van Rossum", "Dennis Ritchie", "Bjarne Stroustrup"), "Technologie", "Anders Hejlsberg, également créateur de Turbo Pascal et C#, a développé TypeScript chez Microsoft pour ajouter un typage statique optionnel à JavaScript."),
            en = LocalizedContent("Who is the creator of TypeScript?", listOf("Anders Hejlsberg", "Guido van Rossum", "Dennis Ritchie", "Bjarne Stroustrup"), "Technology", "Anders Hejlsberg, also creator of Turbo Pascal and C#, developed TypeScript at Microsoft to add optional static typing to JavaScript."),
            zh = LocalizedContent("TypeScript 的创建者是谁？", listOf("Anders Hejlsberg", "Guido van Rossum", "Dennis Ritchie", "Bjarne Stroustrup"), "科技", "Anders Hejlsberg，也是 Turbo Pascal 和 C# 的创建者，在微软开发了 TypeScript，为 JavaScript 添加了可选的静态类型。"),
            es = LocalizedContent("¿Quién es el creador de TypeScript?", listOf("Anders Hejlsberg", "Guido van Rossum", "Dennis Ritchie", "Bjarne Stroustrup"), "Tecnología", "Anders Hejlsberg, también creador de Turbo Pascal y C#, desarrolló TypeScript en Microsoft para añadir tipado estático opcional a JavaScript.")
        ),
        BilingualQuestion(
            id = 11066, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qu'est-ce que GraphQL?", listOf("Un langage de requête pour les APIs", "Un type de base de données", "Un système d'exploitation", "Un langage de programmation"), "Technologie", "GraphQL a été créé par Facebook en 2012 pour offrir plus de flexibilité que les APIs REST traditionnelles, permettant aux clients de demander exactement les données dont ils ont besoin."),
            en = LocalizedContent("What is GraphQL?", listOf("A query language for APIs", "A type of database", "An operating system", "A programming language"), "Technology", "GraphQL was created by Facebook in 2012 to offer more flexibility than traditional REST APIs, allowing clients to request exactly the data they need."),
            zh = LocalizedContent("什么是 GraphQL？", listOf("一种 API 查询语言", "一种数据库", "一种操作系统", "一种编程语言"), "科技", "GraphQL 由 Facebook 于 2012 年创建，旨在提供比传统 REST API 更大的灵活性，允许客户端精确请求所需的数据。"),
            es = LocalizedContent("¿Qué es GraphQL?", listOf("Un lenguaje de consulta para APIs", "Un tipo de base de datos", "Un sistema operativo", "Un lenguaje de programación"), "Tecnología", "GraphQL fue creado por Facebook en 2012 para ofrecer más flexibilidad que las APIs REST tradicionales, permitiendo a los clientes solicitar exactamente los datos que necesitan.")
        ),
        BilingualQuestion(
            id = 11067, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année Redis a-t-il été lancé?", listOf("2009", "2008", "2010", "2011"), "Technologie", "Redis a été créé par Salvatore Sanfilippo et lancé en 2009. Ce système de gestion de bases de données clé-valeur en mémoire est devenu populaire pour sa rapidité et sa simplicité."),
            en = LocalizedContent("In what year was Redis launched?", listOf("2009", "2008", "2010", "2011"), "Technology", "Redis was created by Salvatore Sanfilippo and launched in 2009. This in-memory key-value database management system became popular for its speed and simplicity."),
            zh = LocalizedContent("Redis 是哪一年推出的？", listOf("2009", "2008", "2010", "2011"), "科技", "Redis 由 Salvatore Sanfilippo 创建并于 2009 年推出。这种内存键值数据库管理系统因其速度和简单性而广受欢迎。"),
            es = LocalizedContent("¿En qué año se lanzó Redis?", listOf("2009", "2008", "2010", "2011"), "Tecnología", "Redis fue creado por Salvatore Sanfilippo y lanzado en 2009. Este sistema de gestión de bases de datos clave-valor en memoria se hizo popular por su rapidez y simplicidad.")
        ),
        BilingualQuestion(
            id = 11068, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel est le créateur de Solidity?", listOf("Gavin Wood", "Vitalik Buterin", "Satoshi Nakamoto", "Charlie Lee"), "Technologie", "Gavin Wood a proposé le langage Solidity en 2014 pour la plateforme Ethereum, dont il était cofondateur, afin de permettre l'écriture de contrats intelligents."),
            en = LocalizedContent("Who is the creator of Solidity?", listOf("Gavin Wood", "Vitalik Buterin", "Satoshi Nakamoto", "Charlie Lee"), "Technology", "Gavin Wood proposed the Solidity language in 2014 for the Ethereum platform, of which he was a co-founder, to enable writing smart contracts."),
            zh = LocalizedContent("Solidity 的创建者是谁？", listOf("Gavin Wood", "Vitalik Buterin", "Satoshi Nakamoto", "Charlie Lee"), "科技", "Gavin Wood 于 2014 年为以太坊平台提出了 Solidity 语言，他是以太坊的联合创始人，旨在编写智能合约。"),
            es = LocalizedContent("¿Quién es el creador de Solidity?", listOf("Gavin Wood", "Vitalik Buterin", "Satoshi Nakamoto", "Charlie Lee"), "Tecnología", "Gavin Wood propuso el lenguaje Solidity en 2014 para la plataforma Ethereum, de la que fue cofundador, para permitir la escritura de contratos inteligentes.")
        ),
        BilingualQuestion(
            id = 11069, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qu'est-ce que le hachage cryptographique?", listOf("Une fonction qui convertit des données en une chaîne fixe", "Un type de chiffrement", "Un langage de programmation", "Un système d'exploitation"), "Technologie", "Le hachage cryptographique transforme des données de taille variable en une empreinte numérique de taille fixe, utilisée pour vérifier l'intégrité des informations sans révéler leur contenu."),
            en = LocalizedContent("What is cryptographic hashing?", listOf("A function that converts data into a fixed string", "A type of encryption", "A programming language", "An operating system"), "Technology", "Cryptographic hashing transforms variable-size data into a fixed-size digital fingerprint, used to verify information integrity without revealing its content."),
            zh = LocalizedContent("什么是加密哈希？", listOf("一种将数据转换为固定字符串的函数", "一种加密类型", "一种编程语言", "一种操作系统"), "科技", "加密哈希将可变大小的数据转换为固定大小的数字指纹，用于验证信息完整性而不泄露其内容。"),
            es = LocalizedContent("¿Qué es el hash criptográfico?", listOf("Una función que convierte datos en una cadena fija", "Un tipo de cifrado", "Un lenguaje de programación", "Un sistema operativo"), "Tecnología", "El hash criptográfico transforma datos de tamaño variable en una huella digital de tamaño fijo, utilizada para verificar la integridad de la información sin revelar su contenido.")
        ),
        BilingualQuestion(
            id = 11070, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("En quelle année Mongoose a-t-il été créé?", listOf("2010", "2009", "2011", "2012"), "Technologie", "Mongoose, le framework JavaScript pour applications web, a été initialement publié en 2010 par LearnBoost."),
            en = LocalizedContent("In which year was Mongoose created?", listOf("2010", "2009", "2011", "2012"), "Technology", "Mongoose, the JavaScript framework for web applications, was initially released in 2010 by LearnBoost."),
            zh = LocalizedContent("Mongoose 是哪一年创建的？", listOf("2010", "2009", "2011", "2012"), "科技", "Mongoose 是一个用于 Web 应用的 JavaScript 框架，由 LearnBoost 于 2010 年首次发布。"),
            es = LocalizedContent("¿En qué año se creó Mongoose?", listOf("2010", "2009", "2011", "2012"), "Tecnología", "Mongoose, el framework JavaScript para aplicaciones web, fue lanzado inicialmente en 2010 por LearnBoost.")
        ),
        BilingualQuestion(
            id = 11071, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le créateur de Swift?", listOf("Chris Lattner", "Guido van Rossum", "Dennis Ritchie", "Bjarne Stroustrup"), "Technologie", "Chris Lattner a conçu Swift chez Apple en 2010, en s'inspirant d'Objective-C, Rust et Haskell, pour remplacer Objective-C dans le développement d'applications iOS et macOS."),
            en = LocalizedContent("Who is the creator of Swift?", listOf("Chris Lattner", "Guido van Rossum", "Dennis Ritchie", "Bjarne Stroustrup"), "Technology", "Chris Lattner designed Swift at Apple in 2010, drawing inspiration from Objective-C, Rust, and Haskell, to replace Objective-C in iOS and macOS app development."),
            zh = LocalizedContent("Swift 的创建者是谁？", listOf("克里斯·拉特纳", "吉多·范罗苏姆", "丹尼斯·里奇", "比雅尼·斯特劳斯特鲁普"), "科技", "克里斯·拉特纳于 2010 年在苹果公司设计了 Swift，灵感来自 Objective-C、Rust 和 Haskell，旨在取代 Objective-C 用于 iOS 和 macOS 应用开发。"),
            es = LocalizedContent("¿Quién es el creador de Swift?", listOf("Chris Lattner", "Guido van Rossum", "Dennis Ritchie", "Bjarne Stroustrup"), "Tecnología", "Chris Lattner diseñó Swift en Apple en 2010, inspirándose en Objective-C, Rust y Haskell, para reemplazar a Objective-C en el desarrollo de aplicaciones iOS y macOS.")
        ),
        BilingualQuestion(
            id = 11072, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Qu'est-ce que la microarchitecture?", listOf("L'architecture interne d'un processeur", "Un type de base de données", "Un langage de programmation", "Un système d'exploitation"), "Technologie", "La microarchitecture désigne l'organisation interne d'un processeur, incluant ses circuits, pipelines et caches, qui implémente une architecture de jeu d'instructions."),
            en = LocalizedContent("What is microarchitecture?", listOf("The internal architecture of a processor", "A type of database", "A programming language", "An operating system"), "Technology", "Microarchitecture refers to the internal organization of a processor, including its circuits, pipelines, and caches, which implements an instruction set architecture."),
            zh = LocalizedContent("什么是微架构？", listOf("处理器的内部架构", "一种数据库类型", "一种编程语言", "一种操作系统"), "科技", "微架构指的是处理器的内部组织，包括其电路、流水线和缓存，用于实现指令集架构。"),
            es = LocalizedContent("¿Qué es la microarquitectura?", listOf("La arquitectura interna de un procesador", "Un tipo de base de datos", "Un lenguaje de programación", "Un sistema operativo"), "Tecnología", "La microarquitectura se refiere a la organización interna de un procesador, incluyendo sus circuitos, tuberías y cachés, que implementa una arquitectura de conjunto de instrucciones.")
        ),
        BilingualQuestion(
            id = 11073, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("En quelle année Keras a-t-il été lancé?", listOf("2015", "2014", "2016", "2017"), "Technologie", "Keras a été initialement développé et publié en 2015 par François Chollet, un ingénieur chez Google, dans le but de simplifier la création de réseaux de neurones."),
            en = LocalizedContent("In which year was Keras launched?", listOf("2015", "2014", "2016", "2017"), "Technology", "Keras was initially developed and released in 2015 by François Chollet, an engineer at Google, with the goal of simplifying the creation of neural networks."),
            zh = LocalizedContent("Keras 是哪一年推出的？", listOf("2015", "2014", "2016", "2017"), "科技", "Keras 由谷歌工程师弗朗索瓦·肖莱于 2015 年首次开发并发布，旨在简化神经网络的创建。"),
            es = LocalizedContent("¿En qué año se lanzó Keras?", listOf("2015", "2014", "2016", "2017"), "Tecnología", "Keras fue desarrollado y lanzado inicialmente en 2015 por François Chollet, un ingeniero de Google, con el objetivo de simplificar la creación de redes neuronales.")
        ),
        BilingualQuestion(
            id = 11074, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le créateur de Kotlin?", listOf("JetBrains", "Google", "Facebook", "Microsoft"), "Technologie", "Kotlin a été développé par l'entreprise JetBrains, connue pour ses environnements de développement intégrés (IDE) comme IntelliJ IDEA. Le langage a été présenté en 2011 et est devenu un langage officiel pour Android en 2017."),
            en = LocalizedContent("Who is the creator of Kotlin?", listOf("JetBrains", "Google", "Facebook", "Microsoft"), "Technology", "Kotlin was developed by the company JetBrains, known for its integrated development environments (IDEs) like IntelliJ IDEA. The language was introduced in 2011 and became an official language for Android in 2017."),
            zh = LocalizedContent("Kotlin 的创建者是谁？", listOf("JetBrains", "谷歌", "脸书", "微软"), "科技", "Kotlin 由 JetBrains 公司开发，该公司以 IntelliJ IDEA 等集成开发环境（IDE）而闻名。该语言于 2011 年推出，并于 2017 年成为 Android 的官方语言。"),
            es = LocalizedContent("¿Quién es el creador de Kotlin?", listOf("JetBrains", "Google", "Facebook", "Microsoft"), "Tecnología", "Kotlin fue desarrollado por la empresa JetBrains, conocida por sus entornos de desarrollo integrados (IDE) como IntelliJ IDEA. El lenguaje se presentó en 2011 y se convirtió en un lenguaje oficial para Android en 2017.")
        ),
        BilingualQuestion(
            id = 11075, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qu'est-ce que le polymorphisme en programmation?", listOf("La capacité d'un objet à prendre plusieurs formes", "Un type de base de données", "Un système d'exploitation", "Un langage de programmation"), "Technologie", "Le polymorphisme permet à des objets de classes différentes de répondre au même appel de méthode de manière spécifique, simplifiant ainsi la gestion de code hétérogène."),
            en = LocalizedContent("What is polymorphism in programming?", listOf("The ability of an object to take multiple forms", "A type of database", "An operating system", "A programming language"), "Technology", "Polymorphism allows objects of different classes to respond to the same method call in a specific way, simplifying the management of heterogeneous code."),
            zh = LocalizedContent("编程中的多态是什么？", listOf("对象具有多种形式的能力", "一种数据库类型", "一种操作系统", "一种编程语言"), "科技", "多态允许不同类的对象以特定方式响应相同的方法调用，从而简化了异构代码的管理。"),
            es = LocalizedContent("¿Qué es el polimorfismo en programación?", listOf("La capacidad de un objeto de tomar múltiples formas", "Un tipo de base de datos", "Un sistema operativo", "Un lenguaje de programación"), "Tecnología", "El polimorfismo permite que objetos de diferentes clases respondan a la misma llamada de método de manera específica, simplificando la gestión de código heterogéneo.")
        ),
        BilingualQuestion(
            id = 11076, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("En quelle année Spark a-t-il été créé?", listOf("2009", "2008", "2010", "2011"), "Technologie", "Spark, le framework de traitement de données massives, a été créé en 2009 à l'Université de Californie à Berkeley par Matei Zaharia."),
            en = LocalizedContent("In which year was Spark created?", listOf("2009", "2008", "2010", "2011"), "Technology", "Spark, the big data processing framework, was created in 2009 at the University of California, Berkeley by Matei Zaharia."),
            zh = LocalizedContent("Spark 是哪一年创建的？", listOf("2009", "2008", "2010", "2011"), "科技", "Spark 是一个大数据处理框架，由马泰·扎哈里亚于 2009 年在加州大学伯克利分校创建。"),
            es = LocalizedContent("¿En qué año se creó Spark?", listOf("2009", "2008", "2010", "2011"), "Tecnología", "Spark, el framework de procesamiento de datos masivos, fue creado en 2009 en la Universidad de California, Berkeley por Matei Zaharia.")
        ),
        BilingualQuestion(
            id = 11077, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel est le créateur de Elixir?", listOf("José Valim", "Guido van Rossum", "Dennis Ritchie", "Bjarne Stroustrup"), "Technologie", "José Valim a créé Elixir en 2012 pour combiner la productivité de Ruby avec les performances et la concurrence de la machine virtuelle Erlang (BEAM)."),
            en = LocalizedContent("Who is the creator of Elixir?", listOf("José Valim", "Guido van Rossum", "Dennis Ritchie", "Bjarne Stroustrup"), "Technology", "José Valim created Elixir in 2012 to combine Ruby's productivity with the performance and concurrency of the Erlang virtual machine (BEAM)."),
            zh = LocalizedContent("Elixir 的创建者是谁？", listOf("若泽·瓦利姆", "吉多·范罗苏姆", "丹尼斯·里奇", "比雅尼·斯特劳斯特鲁普"), "科技", "若泽·瓦利姆于 2012 年创建了 Elixir，旨在将 Ruby 的生产力与 Erlang 虚拟机（BEAM）的性能和并发性结合起来。"),
            es = LocalizedContent("¿Quién es el creador de Elixir?", listOf("José Valim", "Guido van Rossum", "Dennis Ritchie", "Bjarne Stroustrup"), "Tecnología", "José Valim creó Elixir en 2012 para combinar la productividad de Ruby con el rendimiento y la concurrencia de la máquina virtual Erlang (BEAM).")
        ),
        BilingualQuestion(
            id = 11078, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que la programmation orientée objet?", listOf("Un paradigme de programmation basé sur des objets", "Un type de base de données", "Un système d'exploitation", "Un langage de programmation"), "Technologie", "La programmation orientée objet structure le code en regroupant données et fonctions dans des entités appelées objets, contrairement à la programmation procédurale qui utilise des fonctions et des variables séparées."),
            en = LocalizedContent("What is object-oriented programming?", listOf("A programming paradigm based on objects", "A type of database", "An operating system", "A programming language"), "Technology", "Object-oriented programming structures code by grouping data and functions into entities called objects, unlike procedural programming which uses separate functions and variables."),
            zh = LocalizedContent("什么是面向对象编程？", listOf("一种基于对象的编程范式", "一种数据库类型", "一种操作系统", "一种编程语言"), "科技", "面向对象编程通过将数据和函数分组到称为对象的实体中来组织代码，这与使用单独函数和变量的过程式编程不同。"),
            es = LocalizedContent("¿Qué es la programación orientada a objetos?", listOf("Un paradigma de programación basado en objetos", "Un tipo de base de datos", "Un sistema operativo", "Un lenguaje de programación"), "Tecnología", "La programación orientada a objetos estructura el código agrupando datos y funciones en entidades llamadas objetos, a diferencia de la programación procedural que utiliza funciones y variables separadas.")
        ),
        BilingualQuestion(
            id = 11079, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("En quelle année TensorFlow a-t-il été lancé?", listOf("2015", "2014", "2016", "2017"), "Technologie", "TensorFlow, la bibliothèque open-source d'apprentissage automatique, a été initialement publiée par Google en 2015."),
            en = LocalizedContent("In which year was TensorFlow launched?", listOf("2015", "2014", "2016", "2017"), "Technology", "TensorFlow, the open-source machine learning library, was initially released by Google in 2015."),
            zh = LocalizedContent("TensorFlow 是哪一年推出的？", listOf("2015", "2014", "2016", "2017"), "科技", "TensorFlow 是一个开源机器学习库，由谷歌于 2015 年首次发布。"),
            es = LocalizedContent("¿En qué año se lanzó TensorFlow?", listOf("2015", "2014", "2016", "2017"), "Tecnología", "TensorFlow, la biblioteca de aprendizaje automático de código abierto, fue lanzada inicialmente por Google en 2015.")
        ),
        BilingualQuestion(
            id = 11080, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel est le créateur de Groovy?", listOf("James Strachan", "Guido van Rossum", "Dennis Ritchie", "Bjarne Stroustrup"), "Technologie", "James Strachan a créé Groovy en 2003 en tant que langage de script dynamique pour la plateforme Java. Il l'a conçu pour offrir une syntaxe plus concise et flexible que Java, tout en restant compatible avec ses bibliothèques."),
            en = LocalizedContent("Who is the creator of Groovy?", listOf("James Strachan", "Guido van Rossum", "Dennis Ritchie", "Bjarne Stroustrup"), "Technology", "James Strachan created Groovy in 2003 as a dynamic scripting language for the Java platform. He designed it to offer a more concise and flexible syntax than Java while remaining compatible with its libraries."),
            zh = LocalizedContent("Groovy 的创建者是谁？", listOf("James Strachan", "Guido van Rossum", "Dennis Ritchie", "Bjarne Stroustrup"), "科技", "James Strachan 于 2003 年创建了 Groovy，作为 Java 平台的动态脚本语言。他设计它的目的是提供比 Java 更简洁、更灵活的语法，同时保持与其库的兼容性。"),
            es = LocalizedContent("¿Quién es el creador de Groovy?", listOf("James Strachan", "Guido van Rossum", "Dennis Ritchie", "Bjarne Stroustrup"), "Tecnología", "James Strachan creó Groovy en 2003 como un lenguaje de script dinámico para la plataforma Java. Lo diseñó para ofrecer una sintaxis más concisa y flexible que Java, manteniendo la compatibilidad con sus bibliotecas.")
        ),
        BilingualQuestion(
            id = 11081, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qu'est-ce que l'encapsulation en programmation?", listOf("La restriction de l'accès aux données internes", "Un type de base de données", "Un système d'exploitation", "Un langage de programmation"), "Technologie", "L'encapsulation est un principe fondamental de la programmation orientée objet qui consiste à protéger les données d'un objet en limitant leur accès direct depuis l'extérieur."),
            en = LocalizedContent("What is encapsulation in programming?", listOf("Restricting access to internal data", "A type of database", "An operating system", "A programming language"), "Technology", "Encapsulation is a fundamental principle of object-oriented programming that protects an object's data by limiting direct access from outside."),
            zh = LocalizedContent("编程中的封装是什么？", listOf("限制对内部数据的访问", "一种数据库类型", "一种操作系统", "一种编程语言"), "科技", "封装是面向对象编程的一个基本原则，通过限制外部直接访问来保护对象的数据。"),
            es = LocalizedContent("¿Qué es la encapsulación en programación?", listOf("Restringir el acceso a los datos internos", "Un tipo de base de datos", "Un sistema operativo", "Un lenguaje de programación"), "Tecnología", "La encapsulación es un principio fundamental de la programación orientada a objetos que protege los datos de un objeto limitando el acceso directo desde el exterior.")
        ),
        BilingualQuestion(
            id = 11082, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("En quelle année PyTorch a-t-il été lancé?", listOf("2016", "2015", "2017", "2018"), "Technologie", "PyTorch a été lancé en septembre 2016 par le laboratoire d'intelligence artificielle de Facebook (FAIR)."),
            en = LocalizedContent("In which year was PyTorch launched?", listOf("2016", "2015", "2017", "2018"), "Technology", "PyTorch was launched in September 2016 by Facebook's AI Research lab (FAIR)."),
            zh = LocalizedContent("PyTorch 是哪一年发布的？", listOf("2016", "2015", "2017", "2018"), "科技", "PyTorch 于 2016 年 9 月由 Facebook 的人工智能研究实验室 (FAIR) 发布。"),
            es = LocalizedContent("¿En qué año se lanzó PyTorch?", listOf("2016", "2015", "2017", "2018"), "Tecnología", "PyTorch se lanzó en septiembre de 2016 por el laboratorio de investigación de inteligencia artificial de Facebook (FAIR).")
        ),
        BilingualQuestion(
            id = 11083, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel est le créateur de Lua?", listOf("Roberto Ierusalimschy", "Guido van Rossum", "Dennis Ritchie", "Bjarne Stroustrup"), "Technologie", "Roberto Ierusalimschy a créé Lua en 1993 au Brésil, avec Luiz Henrique de Figueiredo et Waldemar Celes, pour offrir un langage de script léger et embarqué."),
            en = LocalizedContent("Who is the creator of Lua?", listOf("Roberto Ierusalimschy", "Guido van Rossum", "Dennis Ritchie", "Bjarne Stroustrup"), "Technology", "Roberto Ierusalimschy created Lua in 1993 in Brazil, together with Luiz Henrique de Figueiredo and Waldemar Celes, to provide a lightweight embedded scripting language."),
            zh = LocalizedContent("Lua 的创建者是谁？", listOf("Roberto Ierusalimschy", "Guido van Rossum", "Dennis Ritchie", "Bjarne Stroustrup"), "科技", "Roberto Ierusalimschy 于 1993 年在巴西与 Luiz Henrique de Figueiredo 和 Waldemar Celes 共同创建了 Lua，旨在提供一种轻量级的嵌入式脚本语言。"),
            es = LocalizedContent("¿Quién es el creador de Lua?", listOf("Roberto Ierusalimschy", "Guido van Rossum", "Dennis Ritchie", "Bjarne Stroustrup"), "Tecnología", "Roberto Ierusalimschy creó Lua en 1993 en Brasil, junto con Luiz Henrique de Figueiredo y Waldemar Celes, para ofrecer un lenguaje de script ligero y embebido.")
        ),
        BilingualQuestion(
            id = 11084, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qu'est-ce que l'héritage en programmation?", listOf("La transmission de propriétés d'une classe à une autre", "Un type de base de données", "Un système d'exploitation", "Un langage de programmation"), "Technologie", "L'héritage est un concept de la programmation orientée objet où une classe fille hérite des attributs et méthodes d'une classe mère, permettant la réutilisation et l'extension du code."),
            en = LocalizedContent("What is inheritance in programming?", listOf("Transmission of properties from one class to another", "A type of database", "An operating system", "A programming language"), "Technology", "Inheritance is a concept in object-oriented programming where a child class inherits attributes and methods from a parent class, enabling code reuse and extension."),
            zh = LocalizedContent("编程中的继承是什么？", listOf("从一个类向另一个类传递属性", "一种数据库类型", "一种操作系统", "一种编程语言"), "科技", "继承是面向对象编程中的一个概念，子类继承父类的属性和方法，从而实现代码复用和扩展。"),
            es = LocalizedContent("¿Qué es la herencia en programación?", listOf("Transmisión de propiedades de una clase a otra", "Un tipo de base de datos", "Un sistema operativo", "Un lenguaje de programación"), "Tecnología", "La herencia es un concepto de la programación orientada a objetos donde una clase hija hereda atributos y métodos de una clase padre, permitiendo la reutilización y extensión del código.")
        ),
        BilingualQuestion(
            id = 11085, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("En quelle année Pandas a-t-il été créé?", listOf("2008", "2007", "2009", "2010"), "Technologie", "Pandas a été créé en 2008 par Wes McKinney pour répondre aux besoins d'analyse de données financières en Python."),
            en = LocalizedContent("In which year was Pandas created?", listOf("2008", "2007", "2009", "2010"), "Technology", "Pandas was created in 2008 by Wes McKinney to meet the needs of financial data analysis in Python."),
            zh = LocalizedContent("Pandas 是哪一年创建的？", listOf("2008", "2007", "2009", "2010"), "科技", "Pandas 由 Wes McKinney 于 2008 年创建，旨在满足 Python 中金融数据分析的需求。"),
            es = LocalizedContent("¿En qué año se creó Pandas?", listOf("2008", "2007", "2009", "2010"), "Tecnología", "Pandas fue creado en 2008 por Wes McKinney para satisfacer las necesidades de análisis de datos financieros en Python.")
        ),
        BilingualQuestion(
            id = 11086, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel est le créateur de R?", listOf("Ross Ihaka et Robert Gentleman", "Guido van Rossum", "Dennis Ritchie", "Bjarne Stroustrup"), "Technologie", "Ross Ihaka et Robert Gentleman ont créé le langage R en 1993 à l'Université d'Auckland, en Nouvelle-Zélande, pour offrir une alternative libre au langage S."),
            en = LocalizedContent("Who is the creator of R?", listOf("Ross Ihaka and Robert Gentleman", "Guido van Rossum", "Dennis Ritchie", "Bjarne Stroustrup"), "Technology", "Ross Ihaka and Robert Gentleman created the R language in 1993 at the University of Auckland, New Zealand, to provide a free alternative to the S language."),
            zh = LocalizedContent("R 语言的创建者是谁？", listOf("Ross Ihaka 和 Robert Gentleman", "Guido van Rossum", "Dennis Ritchie", "Bjarne Stroustrup"), "科技", "Ross Ihaka 和 Robert Gentleman 于 1993 年在新西兰奥克兰大学创建了 R 语言，旨在提供 S 语言的免费替代品。"),
            es = LocalizedContent("¿Quién es el creador de R?", listOf("Ross Ihaka y Robert Gentleman", "Guido van Rossum", "Dennis Ritchie", "Bjarne Stroustrup"), "Tecnología", "Ross Ihaka y Robert Gentleman crearon el lenguaje R en 1993 en la Universidad de Auckland, Nueva Zelanda, para ofrecer una alternativa gratuita al lenguaje S.")
        ),
        BilingualQuestion(
            id = 11087, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Qu'est-ce que le polymorphisme d'héritage?", listOf("Un type de polymorphisme basé sur l'héritage", "Une base de données", "Un système d'exploitation", "Un langage de programmation"), "Technologie", "Le polymorphisme d'héritage permet à une classe fille de redéfinir le comportement d'une méthode héritée, tout en conservant l'interface de la classe parente."),
            en = LocalizedContent("What is inheritance polymorphism?", listOf("A type of polymorphism based on inheritance", "A database", "An operating system", "A programming language"), "Technology", "Inheritance polymorphism allows a child class to redefine the behavior of an inherited method while preserving the interface of the parent class."),
            zh = LocalizedContent("什么是继承多态？", listOf("一种基于继承的多态类型", "一种数据库", "一种操作系统", "一种编程语言"), "科技", "继承多态允许子类重新定义继承方法的行为，同时保留父类的接口。"),
            es = LocalizedContent("¿Qué es el polimorfismo de herencia?", listOf("Un tipo de polimorfismo basado en la herencia", "Una base de datos", "Un sistema operativo", "Un lenguaje de programación"), "Tecnología", "El polimorfismo de herencia permite a una clase hija redefinir el comportamiento de un método heredado, manteniendo la interfaz de la clase padre.")
        ),
        BilingualQuestion(
            id = 11088, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("En quelle année Seaborn a-t-il été lancé?", listOf("2012", "2011", "2013", "2014"), "Technologie", "Seaborn, une bibliothèque de visualisation de données pour Python, a été lancée en 2012 par Michael Waskom."),
            en = LocalizedContent("In which year was Seaborn launched?", listOf("2012", "2011", "2013", "2014"), "Technology", "Seaborn, a data visualization library for Python, was launched in 2012 by Michael Waskom."),
            zh = LocalizedContent("Seaborn 是哪一年发布的？", listOf("2012", "2011", "2013", "2014"), "科技", "Seaborn 是一个 Python 数据可视化库，由 Michael Waskom 于 2012 年发布。"),
            es = LocalizedContent("¿En qué año se lanzó Seaborn?", listOf("2012", "2011", "2013", "2014"), "Tecnología", "Seaborn, una biblioteca de visualización de datos para Python, fue lanzada en 2012 por Michael Waskom.")
        ),
        BilingualQuestion(
            id = 11089, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel est le créateur de MATLAB?", listOf("Cleve Moler", "Guido van Rossum", "Dennis Ritchie", "Bjarne Stroustrup"), "Technologie", "Cleve Moler a créé MATLAB dans les années 1970 pour donner aux étudiants un accès facile aux bibliothèques LINPACK et EISPACK, sans avoir à écrire de code Fortran."),
            en = LocalizedContent("Who is the creator of MATLAB?", listOf("Cleve Moler", "Guido van Rossum", "Dennis Ritchie", "Bjarne Stroustrup"), "Technology", "Cleve Moler created MATLAB in the 1970s to give students easy access to the LINPACK and EISPACK libraries without having to write Fortran code."),
            zh = LocalizedContent("MATLAB 的创建者是谁？", listOf("Cleve Moler", "Guido van Rossum", "Dennis Ritchie", "Bjarne Stroustrup"), "科技", "Cleve Moler 在 20 世纪 70 年代创建了 MATLAB，旨在让学生无需编写 Fortran 代码即可轻松访问 LINPACK 和 EISPACK 库。"),
            es = LocalizedContent("¿Quién es el creador de MATLAB?", listOf("Cleve Moler", "Guido van Rossum", "Dennis Ritchie", "Bjarne Stroustrup"), "Tecnología", "Cleve Moler creó MATLAB en la década de 1970 para dar a los estudiantes acceso fácil a las bibliotecas LINPACK y EISPACK sin tener que escribir código Fortran.")
        ),
    )

    private fun part3(): List<BilingualQuestion> = listOf(
        BilingualQuestion(
            id = 11090, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qu'est-ce que la programmation fonctionnelle?", listOf("Un paradigme basé sur des fonctions mathématiques", "Un type de base de données", "Un système d'exploitation", "Un langage de programmation"), "Technologie", "La programmation fonctionnelle traite les calculs comme l'évaluation de fonctions mathématiques, évitant les changements d'état et les données mutables, contrairement à la programmation impérative."),
            en = LocalizedContent("What is functional programming?", listOf("A paradigm based on mathematical functions", "A type of database", "An operating system", "A programming language"), "Technology", "Functional programming treats computation as the evaluation of mathematical functions, avoiding state changes and mutable data, unlike imperative programming."),
            zh = LocalizedContent("什么是函数式编程？", listOf("基于数学函数的编程范式", "一种数据库类型", "一种操作系统", "一种编程语言"), "科技", "函数式编程将计算视为数学函数的求值，避免状态变化和可变数据，与命令式编程不同。"),
            es = LocalizedContent("¿Qué es la programación funcional?", listOf("Un paradigma basado en funciones matemáticas", "Un tipo de base de datos", "Un sistema operativo", "Un lenguaje de programación"), "Tecnología", "La programación funcional trata los cálculos como la evaluación de funciones matemáticas, evitando cambios de estado y datos mutables, a diferencia de la programación imperativa.")
        ),
        BilingualQuestion(
            id = 11091, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("En quelle année SciPy a-t-il été créé?", listOf("2001", "2000", "2002", "2003"), "Technologie", "SciPy a été créé en 2001 par Travis Oliphant, Pearu Peterson et Eric Jones comme bibliothèque open source pour le calcul scientifique en Python."),
            en = LocalizedContent("In what year was SciPy created?", listOf("2001", "2000", "2002", "2003"), "Technology", "SciPy was created in 2001 by Travis Oliphant, Pearu Peterson, and Eric Jones as an open-source library for scientific computing in Python."),
            zh = LocalizedContent("SciPy 是哪一年创建的？", listOf("2001", "2000", "2002", "2003"), "科技", "SciPy 由 Travis Oliphant、Pearu Peterson 和 Eric Jones 于 2001 年创建，作为 Python 中科学计算的开源库。"),
            es = LocalizedContent("¿En qué año se creó SciPy?", listOf("2001", "2000", "2002", "2003"), "Tecnología", "SciPy fue creado en 2001 por Travis Oliphant, Pearu Peterson y Eric Jones como una biblioteca de código abierto para computación científica en Python.")
        ),
        BilingualQuestion(
            id = 11092, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel est le créateur de Fortran?", listOf("John Backus", "Guido van Rossum", "Dennis Ritchie", "Bjarne Stroustrup"), "Technologie", "John Backus a dirigé l'équipe d'IBM qui a développé Fortran, le premier langage de programmation de haut niveau, lancé en 1957."),
            en = LocalizedContent("Who is the creator of Fortran?", listOf("John Backus", "Guido van Rossum", "Dennis Ritchie", "Bjarne Stroustrup"), "Technology", "John Backus led the IBM team that developed Fortran, the first high-level programming language, released in 1957."),
            zh = LocalizedContent("Fortran 的创建者是谁？", listOf("约翰·巴克斯", "吉多·范罗苏姆", "丹尼斯·里奇", "比雅尼·斯特劳斯特鲁普"), "科技", "约翰·巴克斯领导了 IBM 团队开发了 Fortran，这是第一种高级编程语言，于 1957 年发布。"),
            es = LocalizedContent("¿Quién es el creador de Fortran?", listOf("John Backus", "Guido van Rossum", "Dennis Ritchie", "Bjarne Stroustrup"), "Tecnología", "John Backus lideró el equipo de IBM que desarrolló Fortran, el primer lenguaje de programación de alto nivel, lanzado en 1957.")
        ),
        BilingualQuestion(
            id = 11093, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qu'est-ce que le pattern strategy?", listOf("Un modèle de conception pour les stratégies", "Un type de base de données", "Un système d'exploitation", "Un langage de programmation"), "Technologie", "Le pattern Strategy est un modèle de conception qui permet de définir une famille d'algorithmes, de les encapsuler et de les rendre interchangeables, sans modifier le code client."),
            en = LocalizedContent("What is the strategy pattern?", listOf("A design pattern for strategies", "A type of database", "An operating system", "A programming language"), "Technology", "The Strategy pattern is a design pattern that allows defining a family of algorithms, encapsulating them, and making them interchangeable without modifying the client code."),
            zh = LocalizedContent("什么是策略模式？", listOf("一种用于策略的设计模式", "一种数据库类型", "一种操作系统", "一种编程语言"), "科技", "策略模式是一种设计模式，允许定义一系列算法，将它们封装起来，并使它们可以互换，而无需修改客户端代码。"),
            es = LocalizedContent("¿Qué es el patrón strategy?", listOf("Un patrón de diseño para estrategias", "Un tipo de base de datos", "Un sistema operativo", "Un lenguaje de programación"), "Tecnología", "El patrón Strategy es un patrón de diseño que permite definir una familia de algoritmos, encapsularlos y hacerlos intercambiables sin modificar el código cliente.")
        ),
        BilingualQuestion(
            id = 11094, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("En quelle année NumPy a-t-il été lancé?", listOf("2006", "2005", "2007", "2008"), "Technologie", "NumPy a été initialement publié en 2006, succédant à Numeric et Numarray, pour unifier la communauté du calcul numérique en Python."),
            en = LocalizedContent("In what year was NumPy released?", listOf("2006", "2005", "2007", "2008"), "Technology", "NumPy was initially released in 2006, succeeding Numeric and Numarray, to unify the numerical computing community in Python."),
            zh = LocalizedContent("NumPy 是哪一年发布的？", listOf("2006", "2005", "2007", "2008"), "科技", "NumPy 最初于 2006 年发布，接替了 Numeric 和 Numarray，以统一 Python 中的数值计算社区。"),
            es = LocalizedContent("¿En qué año se lanzó NumPy?", listOf("2006", "2005", "2007", "2008"), "Tecnología", "NumPy se lanzó inicialmente en 2006, sucediendo a Numeric y Numarray, para unificar la comunidad de computación numérica en Python.")
        ),
        BilingualQuestion(
            id = 11095, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel est le créateur de Ada?", listOf("Jean Ichbiah", "Guido van Rossum", "Dennis Ritchie", "Bjarne Stroustrup"), "Technologie", "Jean Ichbiah a dirigé l'équipe qui a conçu le langage de programmation Ada dans les années 1970, sous contrat avec le département de la Défense américain."),
            en = LocalizedContent("Who is the creator of Ada?", listOf("Jean Ichbiah", "Guido van Rossum", "Dennis Ritchie", "Bjarne Stroustrup"), "Technology", "Jean Ichbiah led the team that designed the Ada programming language in the 1970s, under contract with the US Department of Defense."),
            zh = LocalizedContent("Ada 的创建者是谁？", listOf("让·伊奇比亚", "吉多·范罗苏姆", "丹尼斯·里奇", "比雅尼·斯特劳斯特鲁普"), "科技", "让·伊奇比亚领导了设计 Ada 编程语言的团队，该语言在 1970 年代根据与美国国防部的合同开发。"),
            es = LocalizedContent("¿Quién es el creador de Ada?", listOf("Jean Ichbiah", "Guido van Rossum", "Dennis Ritchie", "Bjarne Stroustrup"), "Tecnología", "Jean Ichbiah lideró el equipo que diseñó el lenguaje de programación Ada en la década de 1970, bajo contrato con el Departamento de Defensa de EE. UU.")
        ),
        BilingualQuestion(
            id = 11096, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qu'est-ce que le pattern factory?", listOf("Un modèle de création d'objets", "Un type de base de données", "Un système d'exploitation", "Un langage de programmation"), "Technologie", "Le pattern factory est un patron de conception logicielle qui encapsule la logique d'instanciation d'objets, permettant de déléguer la création à des classes spécialisées."),
            en = LocalizedContent("What is the factory pattern?", listOf("A pattern for object creation", "A type of database", "An operating system", "A programming language"), "Technology", "The factory pattern is a software design pattern that encapsulates the logic of object instantiation, allowing delegation of creation to specialized classes."),
            zh = LocalizedContent("什么是工厂模式？", listOf("一种用于对象创建的模式", "一种数据库类型", "一种操作系统", "一种编程语言"), "科技", "工厂模式是一种软件设计模式，它封装了对象实例化的逻辑，允许将创建过程委托给专门的类。"),
            es = LocalizedContent("¿Qué es el patrón factory?", listOf("Un patrón de creación de objetos", "Un tipo de base de datos", "Un sistema operativo", "Un lenguaje de programación"), "Tecnología", "El patrón factory es un patrón de diseño de software que encapsula la lógica de instanciación de objetos, permitiendo delegar la creación a clases especializadas.")
        ),
        BilingualQuestion(
            id = 11097, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("En quelle année Scikit-learn a-t-il été créé?", listOf("2007", "2006", "2008", "2009"), "Technologie", "Scikit-learn a été initialement développé par David Cournapeau en 2007 dans le cadre d'un projet Google Summer of Code."),
            en = LocalizedContent("In what year was Scikit-learn created?", listOf("2007", "2006", "2008", "2009"), "Technology", "Scikit-learn was initially developed by David Cournapeau in 2007 as part of a Google Summer of Code project."),
            zh = LocalizedContent("Scikit-learn 是哪一年创建的？", listOf("2007", "2006", "2008", "2009"), "科技", "Scikit-learn 最初由 David Cournapeau 于 2007 年作为 Google Summer of Code 项目的一部分开发。"),
            es = LocalizedContent("¿En qué año se creó Scikit-learn?", listOf("2007", "2006", "2008", "2009"), "Tecnología", "Scikit-learn fue desarrollado inicialmente por David Cournapeau en 2007 como parte de un proyecto de Google Summer of Code.")
        ),
        BilingualQuestion(
            id = 11098, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel est le créateur de Modula?", listOf("Niklaus Wirth", "Guido van Rossum", "Dennis Ritchie", "Bjarne Stroustrup"), "Technologie", "Niklaus Wirth a créé le langage de programmation Modula en 1977, après avoir développé Pascal, en y ajoutant des concepts de modularité et de programmation concurrente."),
            en = LocalizedContent("Who is the creator of Modula?", listOf("Niklaus Wirth", "Guido van Rossum", "Dennis Ritchie", "Bjarne Stroustrup"), "Technology", "Niklaus Wirth created the Modula programming language in 1977, after developing Pascal, adding concepts of modularity and concurrent programming."),
            zh = LocalizedContent("Modula 的创建者是谁？", listOf("尼克劳斯·维尔特", "吉多·范罗苏姆", "丹尼斯·里奇", "比雅尼·斯特劳斯特鲁普"), "科技", "尼克劳斯·维尔特在开发 Pascal 之后，于 1977 年创建了 Modula 编程语言，增加了模块化和并发编程的概念。"),
            es = LocalizedContent("¿Quién es el creador de Modula?", listOf("Niklaus Wirth", "Guido van Rossum", "Dennis Ritchie", "Bjarne Stroustrup"), "Tecnología", "Niklaus Wirth creó el lenguaje de programación Modula en 1977, después de desarrollar Pascal, añadiendo conceptos de modularidad y programación concurrente.")
        ),
        BilingualQuestion(
            id = 11099, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qu'est-ce que le pattern observer?", listOf("Un modèle de comportement d'observation", "Un type de base de données", "Un système d'exploitation", "Un langage de programmation"), "Technologie", "Le pattern observer est un modèle de conception logicielle où un objet (le sujet) notifie automatiquement une liste d'observateurs de ses changements d'état, sans les coupler étroitement."),
            en = LocalizedContent("What is the observer pattern?", listOf("A behavioral pattern for observation", "A type of database", "An operating system", "A programming language"), "Technology", "The observer pattern is a software design pattern where an object (the subject) automatically notifies a list of observers of its state changes, without tightly coupling them."),
            zh = LocalizedContent("什么是观察者模式？", listOf("一种用于观察的行为模式", "一种数据库类型", "一种操作系统", "一种编程语言"), "科技", "观察者模式是一种软件设计模式，其中一个对象（主题）自动通知一组观察者其状态变化，而不将它们紧密耦合。"),
            es = LocalizedContent("¿Qué es el patrón observer?", listOf("Un patrón de comportamiento de observación", "Un tipo de base de datos", "Un sistema operativo", "Un lenguaje de programación"), "Tecnología", "El patrón observer es un patrón de diseño de software donde un objeto (el sujeto) notifica automáticamente a una lista de observadores sobre sus cambios de estado, sin acoplarlos estrechamente.")
        ),
        BilingualQuestion(
            id = 11100, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel est le créateur du langage Lua?", listOf("Roberto Ierusalimschy", "Guido van Rossum", "Dennis Ritchie", "Bjarne Stroustrup"), "Technologie", "Roberto Ierusalimschy a conçu Lua au Brésil en 1993, avec Luiz Henrique de Figueiredo et Waldemar Celes, pour répondre aux besoins de flexibilité et d'extensibilité dans les applications."),
            en = LocalizedContent("Who is the creator of the Lua language?", listOf("Roberto Ierusalimschy", "Guido van Rossum", "Dennis Ritchie", "Bjarne Stroustrup"), "Technology", "Roberto Ierusalimschy designed Lua in Brazil in 1993, with Luiz Henrique de Figueiredo and Waldemar Celes, to meet the needs of flexibility and extensibility in applications."),
            zh = LocalizedContent("Lua语言的创造者是谁？", listOf("Roberto Ierusalimschy", "Guido van Rossum", "Dennis Ritchie", "Bjarne Stroustrup"), "科技", "Roberto Ierusalimschy于1993年在巴西设计了Lua，与Luiz Henrique de Figueiredo和Waldemar Celes合作，以满足应用程序对灵活性和可扩展性的需求。"),
            es = LocalizedContent("¿Quién es el creador del lenguaje Lua?", listOf("Roberto Ierusalimschy", "Guido van Rossum", "Dennis Ritchie", "Bjarne Stroustrup"), "Tecnología", "Roberto Ierusalimschy diseñó Lua en Brasil en 1993, junto con Luiz Henrique de Figueiredo y Waldemar Celes, para satisfacer las necesidades de flexibilidad y extensibilidad en las aplicaciones.")
        ),
        BilingualQuestion(
            id = 11101, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qu'est-ce que la mémoire cache L1?", listOf("La mémoire cache la plus rapide d'un processeur", "Un type de base de données", "Un système d'exploitation", "Un langage de programmation"), "Technologie", "La mémoire cache L1 est intégrée directement dans le cœur du processeur, ce qui la rend plus rapide que les caches L2 et L3, car elle minimise les délais d'accès aux données fréquemment utilisées."),
            en = LocalizedContent("What is L1 cache memory?", listOf("The fastest cache memory of a processor", "A type of database", "An operating system", "A programming language"), "Technology", "L1 cache is integrated directly into the processor core, making it faster than L2 and L3 caches because it minimizes access delays to frequently used data."),
            zh = LocalizedContent("什么是L1缓存？", listOf("处理器中最快的缓存", "一种数据库", "一种操作系统", "一种编程语言"), "科技", "L1缓存直接集成在处理器核心中，比L2和L3缓存更快，因为它最小化了访问常用数据的延迟。"),
            es = LocalizedContent("¿Qué es la memoria caché L1?", listOf("La memoria caché más rápida de un procesador", "Un tipo de base de datos", "Un sistema operativo", "Un lenguaje de programación"), "Tecnología", "La caché L1 está integrada directamente en el núcleo del procesador, lo que la hace más rápida que las cachés L2 y L3, ya que minimiza los retrasos de acceso a los datos utilizados con frecuencia.")
        ),
        BilingualQuestion(
            id = 11102, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel est le créateur de Clojure?", listOf("Rich Hickey", "Guido van Rossum", "Dennis Ritchie", "Bjarne Stroustrup"), "Technologie", "Rich Hickey a créé Clojure en 2007 comme un dialecte moderne de Lisp fonctionnant sur la machine virtuelle Java, visant la concurrence et la simplicité."),
            en = LocalizedContent("Who is the creator of Clojure?", listOf("Rich Hickey", "Guido van Rossum", "Dennis Ritchie", "Bjarne Stroustrup"), "Technology", "Rich Hickey created Clojure in 2007 as a modern Lisp dialect running on the Java Virtual Machine, aiming for concurrency and simplicity."),
            zh = LocalizedContent("Clojure的创造者是谁？", listOf("Rich Hickey", "Guido van Rossum", "Dennis Ritchie", "Bjarne Stroustrup"), "科技", "Rich Hickey于2007年创建了Clojure，作为运行在Java虚拟机上的现代Lisp方言，旨在实现并发和简洁。"),
            es = LocalizedContent("¿Quién es el creador de Clojure?", listOf("Rich Hickey", "Guido van Rossum", "Dennis Ritchie", "Bjarne Stroustrup"), "Tecnología", "Rich Hickey creó Clojure en 2007 como un dialecto moderno de Lisp que se ejecuta en la máquina virtual Java, con el objetivo de lograr concurrencia y simplicidad.")
        ),
        BilingualQuestion(
            id = 11103, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qu'est-ce que un interrupt en informatique?", listOf("Un signal d'arrêt envoyé au processeur", "Un type de base de données", "Un système d'exploitation", "Un langage de programmation"), "Technologie", "Un interrupt est un signal matériel ou logiciel qui interrompt le processeur dans sa tâche en cours pour lui demander de traiter un événement urgent, comme une frappe au clavier ou une opération d'entrée-sortie terminée."),
            en = LocalizedContent("What is an interrupt in computing?", listOf("A stop signal sent to the processor", "A type of database", "An operating system", "A programming language"), "Technology", "An interrupt is a hardware or software signal that interrupts the processor's current task to request handling of an urgent event, such as a keystroke or a completed I/O operation."),
            zh = LocalizedContent("计算机中的中断是什么？", listOf("发送给处理器的停止信号", "一种数据库", "一种操作系统", "一种编程语言"), "科技", "中断是一种硬件或软件信号，它中断处理器当前的任务，请求处理紧急事件，如按键或完成的输入输出操作。"),
            es = LocalizedContent("¿Qué es una interrupción en informática?", listOf("Una señal de parada enviada al procesador", "Un tipo de base de datos", "Un sistema operativo", "Un lenguaje de programación"), "Tecnología", "Una interrupción es una señal de hardware o software que interrumpe la tarea actual del procesador para solicitar el manejo de un evento urgente, como una pulsación de tecla o una operación de E/S completada.")
        ),
        BilingualQuestion(
            id = 11104, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel est le créateur de Haskell?", listOf("Simon Peyton Jones et al.", "Guido van Rossum", "Dennis Ritchie", "Bjarne Stroustrup"), "Technologie", "Simon Peyton Jones est le principal concepteur de Haskell, un langage de programmation fonctionnel standardisé en 1990, développé avec d'autres chercheurs."),
            en = LocalizedContent("Who is the creator of Haskell?", listOf("Simon Peyton Jones et al.", "Guido van Rossum", "Dennis Ritchie", "Bjarne Stroustrup"), "Technology", "Simon Peyton Jones is the principal designer of Haskell, a functional programming language standardized in 1990, developed with other researchers."),
            zh = LocalizedContent("Haskell的创造者是谁？", listOf("Simon Peyton Jones等人", "Guido van Rossum", "Dennis Ritchie", "Bjarne Stroustrup"), "科技", "Simon Peyton Jones是Haskell的主要设计者，这是一种于1990年标准化的函数式编程语言，与其他研究人员共同开发。"),
            es = LocalizedContent("¿Quién es el creador de Haskell?", listOf("Simon Peyton Jones et al.", "Guido van Rossum", "Dennis Ritchie", "Bjarne Stroustrup"), "Tecnología", "Simon Peyton Jones es el diseñador principal de Haskell, un lenguaje de programación funcional estandarizado en 1990, desarrollado con otros investigadores.")
        ),
        BilingualQuestion(
            id = 11105, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que la gestion de la mémoire?", listOf("Le contrôle de l'utilisation de la mémoire RAM", "Un type de base de données", "Un système d'exploitation", "Un langage de programmation"), "Technologie", "La gestion de la mémoire désigne les mécanismes par lesquels un système d'exploitation alloue et libère la RAM entre les programmes en cours d'exécution pour optimiser les performances et éviter les conflits."),
            en = LocalizedContent("What is memory management?", listOf("The control of RAM usage", "A type of database", "An operating system", "A programming language"), "Technology", "Memory management refers to the mechanisms by which an operating system allocates and frees RAM among running programs to optimize performance and avoid conflicts."),
            zh = LocalizedContent("什么是内存管理？", listOf("对RAM使用的控制", "一种数据库", "一种操作系统", "一种编程语言"), "科技", "内存管理是指操作系统在运行的程序之间分配和释放RAM的机制，以优化性能并避免冲突。"),
            es = LocalizedContent("¿Qué es la gestión de memoria?", listOf("El control del uso de la RAM", "Un tipo de base de datos", "Un sistema operativo", "Un lenguaje de programación"), "Tecnología", "La gestión de memoria se refiere a los mecanismos mediante los cuales un sistema operativo asigna y libera RAM entre los programas en ejecución para optimizar el rendimiento y evitar conflictos.")
        ),
        BilingualQuestion(
            id = 11106, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel est le créateur de OCaml?", listOf("Xavier Leroy", "Guido van Rossum", "Dennis Ritchie", "Bjarne Stroustrup"), "Technologie", "Xavier Leroy a conçu et implémenté le langage OCaml à l'Inria dans les années 1990, en tant que successeur du langage Caml."),
            en = LocalizedContent("Who is the creator of OCaml?", listOf("Xavier Leroy", "Guido van Rossum", "Dennis Ritchie", "Bjarne Stroustrup"), "Technology", "Xavier Leroy designed and implemented the OCaml language at Inria in the 1990s, as a successor to the Caml language."),
            zh = LocalizedContent("OCaml的创造者是谁？", listOf("Xavier Leroy", "Guido van Rossum", "Dennis Ritchie", "Bjarne Stroustrup"), "科技", "Xavier Leroy在1990年代于Inria设计并实现了OCaml语言，作为Caml语言的继承者。"),
            es = LocalizedContent("¿Quién es el creador de OCaml?", listOf("Xavier Leroy", "Guido van Rossum", "Dennis Ritchie", "Bjarne Stroustrup"), "Tecnología", "Xavier Leroy diseñó e implementó el lenguaje OCaml en Inria en la década de 1990, como sucesor del lenguaje Caml.")
        ),
        BilingualQuestion(
            id = 11107, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qu'est-ce qu'une table de hachage?", listOf("Une structure de données utilisant le hachage", "Un type de base de données", "Un système d'exploitation", "Un langage de programmation"), "Technologie", "Une table de hachage associe des clés à des valeurs via une fonction de hachage, permettant un accès rapide aux données."),
            en = LocalizedContent("What is a hash table?", listOf("A data structure using hashing", "A type of database", "An operating system", "A programming language"), "Technology", "A hash table associates keys with values via a hash function, enabling fast data access."),
            zh = LocalizedContent("什么是哈希表？", listOf("一种使用哈希的数据结构", "一种数据库", "一种操作系统", "一种编程语言"), "科技", "哈希表通过哈希函数将键与值关联起来，从而实现快速的数据访问。"),
            es = LocalizedContent("¿Qué es una tabla hash?", listOf("Una estructura de datos que utiliza hashing", "Un tipo de base de datos", "Un sistema operativo", "Un lenguaje de programación"), "Tecnología", "Una tabla hash asocia claves con valores mediante una función hash, permitiendo un acceso rápido a los datos.")
        ),
        BilingualQuestion(
            id = 11108, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel est le créateur de Scheme?", listOf("Guy Lewis Steele Jr.", "Guido van Rossum", "Dennis Ritchie", "Bjarne Stroustrup"), "Technologie", "Guy Lewis Steele Jr. a co-créé le langage de programmation Scheme avec Gerald Jay Sussman au MIT dans les années 1970, en s'inspirant du lambda-calcul d'Alonzo Church."),
            en = LocalizedContent("Who is the creator of Scheme?", listOf("Guy Lewis Steele Jr.", "Guido van Rossum", "Dennis Ritchie", "Bjarne Stroustrup"), "Technology", "Guy Lewis Steele Jr. co-created the Scheme programming language with Gerald Jay Sussman at MIT in the 1970s, inspired by Alonzo Church's lambda calculus."),
            zh = LocalizedContent("Scheme的创造者是谁？", listOf("Guy Lewis Steele Jr.", "Guido van Rossum", "Dennis Ritchie", "Bjarne Stroustrup"), "科技", "Guy Lewis Steele Jr.与Gerald Jay Sussman在1970年代于麻省理工学院共同创建了Scheme编程语言，灵感来自Alonzo Church的lambda演算。"),
            es = LocalizedContent("¿Quién es el creador de Scheme?", listOf("Guy Lewis Steele Jr.", "Guido van Rossum", "Dennis Ritchie", "Bjarne Stroustrup"), "Tecnología", "Guy Lewis Steele Jr. co-creó el lenguaje de programación Scheme con Gerald Jay Sussman en el MIT en la década de 1970, inspirado en el cálculo lambda de Alonzo Church.")
        ),
        BilingualQuestion(
            id = 11109, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qu'est-ce qu'un arbre binaire?", listOf("Une structure de données arborescente avec deux enfants max", "Un type de base de données", "Un système d'exploitation", "Un langage de programmation"), "Technologie", "En informatique, un arbre binaire est une structure de données où chaque nœud a au plus deux enfants, appelés fils gauche et fils droit, ce qui permet de représenter des hiérarchies et d'optimiser les recherches."),
            en = LocalizedContent("What is a binary tree?", listOf("A tree data structure with at most two children", "A type of database", "An operating system", "A programming language"), "Technology", "In computer science, a binary tree is a data structure where each node has at most two children, called left and right child, allowing representation of hierarchies and optimized searches."),
            zh = LocalizedContent("什么是二叉树？", listOf("一种最多有两个子节点的树形数据结构", "一种数据库", "一种操作系统", "一种编程语言"), "科技", "在计算机科学中，二叉树是一种每个节点最多有两个子节点（称为左子节点和右子节点）的数据结构，可以表示层次结构并优化搜索。"),
            es = LocalizedContent("¿Qué es un árbol binario?", listOf("Una estructura de datos arbórea con un máximo de dos hijos", "Un tipo de base de datos", "Un sistema operativo", "Un lenguaje de programación"), "Tecnología", "En informática, un árbol binario es una estructura de datos donde cada nodo tiene como máximo dos hijos, llamados hijo izquierdo y derecho, lo que permite representar jerarquías y optimizar búsquedas.")
        ),
        BilingualQuestion(
            id = 11110, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel est le créateur de Objective-C?", listOf("Brad Cox et Tom Love", "Guido van Rossum", "Dennis Ritchie", "Bjarne Stroustrup"), "Technologie", "Objective-C a été créé par Brad Cox et Tom Love au début des années 1980 chez Stepstone, en ajoutant des fonctionnalités orientées objet au langage C."),
            en = LocalizedContent("Who created Objective-C?", listOf("Brad Cox and Tom Love", "Guido van Rossum", "Dennis Ritchie", "Bjarne Stroustrup"), "Technology", "Objective-C was created by Brad Cox and Tom Love in the early 1980s at Stepstone, adding object-oriented features to the C language."),
            zh = LocalizedContent("谁创造了 Objective-C？", listOf("Brad Cox 和 Tom Love", "Guido van Rossum", "Dennis Ritchie", "Bjarne Stroustrup"), "科技", "Objective-C 由 Brad Cox 和 Tom Love 在 20 世纪 80 年代初于 Stepstone 创建，为 C 语言增加了面向对象特性。"),
            es = LocalizedContent("¿Quién creó Objective-C?", listOf("Brad Cox y Tom Love", "Guido van Rossum", "Dennis Ritchie", "Bjarne Stroustrup"), "Tecnología", "Objective-C fue creado por Brad Cox y Tom Love a principios de los años 80 en Stepstone, añadiendo características orientadas a objetos al lenguaje C.")
        ),
        BilingualQuestion(
            id = 11111, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qu'est-ce qu'une queue de priorité?", listOf("Une structure où les éléments sont ordonnés par priorité", "Un type de base de données", "Un système d'exploitation", "Un langage de programmation"), "Technologie", "Une file de priorité est une structure de données où chaque élément possède une priorité, et l'élément avec la plus haute priorité est toujours retiré en premier."),
            en = LocalizedContent("What is a priority queue?", listOf("A structure where elements are ordered by priority", "A type of database", "An operating system", "A programming language"), "Technology", "A priority queue is a data structure where each element has a priority, and the element with the highest priority is always removed first."),
            zh = LocalizedContent("什么是优先队列？", listOf("一种按优先级排序元素的结构", "一种数据库类型", "一种操作系统", "一种编程语言"), "科技", "优先队列是一种数据结构，其中每个元素都有优先级，优先级最高的元素总是最先被移除。"),
            es = LocalizedContent("¿Qué es una cola de prioridad?", listOf("Una estructura donde los elementos se ordenan por prioridad", "Un tipo de base de datos", "Un sistema operativo", "Un lenguaje de programación"), "Tecnología", "Una cola de prioridad es una estructura de datos donde cada elemento tiene una prioridad, y el elemento con mayor prioridad siempre se elimina primero.")
        ),
        BilingualQuestion(
            id = 11112, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel est le créateur de Eiffel?", listOf("Bertrand Meyer", "Guido van Rossum", "Dennis Ritchie", "Bjarne Stroustrup"), "Technologie", "Bertrand Meyer a conçu le langage de programmation Eiffel en 1985, en mettant l'accent sur la conception par contrat et la fiabilité logicielle."),
            en = LocalizedContent("Who created Eiffel?", listOf("Bertrand Meyer", "Guido van Rossum", "Dennis Ritchie", "Bjarne Stroustrup"), "Technology", "Bertrand Meyer designed the Eiffel programming language in 1985, emphasizing design by contract and software reliability."),
            zh = LocalizedContent("谁创造了 Eiffel？", listOf("Bertrand Meyer", "Guido van Rossum", "Dennis Ritchie", "Bjarne Stroustrup"), "科技", "Bertrand Meyer 于 1985 年设计了 Eiffel 编程语言，强调契约式设计和软件可靠性。"),
            es = LocalizedContent("¿Quién creó Eiffel?", listOf("Bertrand Meyer", "Guido van Rossum", "Dennis Ritchie", "Bjarne Stroustrup"), "Tecnología", "Bertrand Meyer diseñó el lenguaje de programación Eiffel en 1985, enfatizando el diseño por contrato y la fiabilidad del software.")
        ),
        BilingualQuestion(
            id = 11113, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qu'est-ce que la complexité algorithmique?", listOf("L'étude de la performance des algorithmes", "Un type de base de données", "Un système d'exploitation", "Un langage de programmation"), "Technologie", "La complexité algorithmique évalue l'efficacité d'un algorithme en fonction du temps ou de la mémoire nécessaire selon la taille des données."),
            en = LocalizedContent("What is algorithmic complexity?", listOf("The study of algorithm performance", "A type of database", "An operating system", "A programming language"), "Technology", "Algorithmic complexity evaluates the efficiency of an algorithm in terms of time or memory required based on input size."),
            zh = LocalizedContent("什么是算法复杂度？", listOf("对算法性能的研究", "一种数据库类型", "一种操作系统", "一种编程语言"), "科技", "算法复杂度根据输入大小评估算法在时间或内存方面的效率。"),
            es = LocalizedContent("¿Qué es la complejidad algorítmica?", listOf("El estudio del rendimiento de los algoritmos", "Un tipo de base de datos", "Un sistema operativo", "Un lenguaje de programación"), "Tecnología", "La complejidad algorítmica evalúa la eficiencia de un algoritmo en términos de tiempo o memoria necesaria según el tamaño de los datos.")
        ),
        BilingualQuestion(
            id = 11114, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel est le créateur de Smalltalk?", listOf("Alan Kay", "Guido van Rossum", "Dennis Ritchie", "Bjarne Stroustrup"), "Technologie", "Alan Kay a conçu le langage Smalltalk dans les années 1970 au Xerox PARC, posant les bases de la programmation orientée objet moderne."),
            en = LocalizedContent("Who created Smalltalk?", listOf("Alan Kay", "Guido van Rossum", "Dennis Ritchie", "Bjarne Stroustrup"), "Technology", "Alan Kay designed the Smalltalk language in the 1970s at Xerox PARC, laying the foundations of modern object-oriented programming."),
            zh = LocalizedContent("谁创造了 Smalltalk？", listOf("Alan Kay", "Guido van Rossum", "Dennis Ritchie", "Bjarne Stroustrup"), "科技", "Alan Kay 在 20 世纪 70 年代于 Xerox PARC 设计了 Smalltalk 语言，奠定了现代面向对象编程的基础。"),
            es = LocalizedContent("¿Quién creó Smalltalk?", listOf("Alan Kay", "Guido van Rossum", "Dennis Ritchie", "Bjarne Stroustrup"), "Tecnología", "Alan Kay diseñó el lenguaje Smalltalk en los años 70 en Xerox PARC, sentando las bases de la programación orientada a objetos moderna.")
        ),
        BilingualQuestion(
            id = 11115, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce qu'une liste chaînée?", listOf("Une structure où les éléments sont chaînés entre eux", "Un type de base de données", "Un système d'exploitation", "Un langage de programmation"), "Technologie", "En informatique, une liste chaînée est une structure de données linéaire où chaque élément, appelé nœud, contient une valeur et un pointeur vers le nœud suivant."),
            en = LocalizedContent("What is a linked list?", listOf("A structure where elements are chained together", "A type of database", "An operating system", "A programming language"), "Technology", "In computer science, a linked list is a linear data structure where each element, called a node, contains a value and a pointer to the next node."),
            zh = LocalizedContent("什么是链表？", listOf("一种元素相互链接的结构", "一种数据库类型", "一种操作系统", "一种编程语言"), "科技", "在计算机科学中，链表是一种线性数据结构，每个元素（称为节点）包含一个值和指向下一个节点的指针。"),
            es = LocalizedContent("¿Qué es una lista enlazada?", listOf("Una estructura donde los elementos están encadenados entre sí", "Un tipo de base de datos", "Un sistema operativo", "Un lenguaje de programación"), "Tecnología", "En informática, una lista enlazada es una estructura de datos lineal donde cada elemento, llamado nodo, contiene un valor y un puntero al siguiente nodo.")
        ),
        BilingualQuestion(
            id = 11116, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel est le créateur de Simula?", listOf("Ole-Johan Dahl et Kristen Nygaard", "Guido van Rossum", "Dennis Ritchie", "Bjarne Stroustrup"), "Technologie", "Ole-Johan Dahl et Kristen Nygaard ont conçu Simula dans les années 1960 chez le Centre de calcul norvégien, posant les bases de la programmation orientée objet."),
            en = LocalizedContent("Who created Simula?", listOf("Ole-Johan Dahl and Kristen Nygaard", "Guido van Rossum", "Dennis Ritchie", "Bjarne Stroustrup"), "Technology", "Ole-Johan Dahl and Kristen Nygaard designed Simula in the 1960s at the Norwegian Computing Center, laying the foundations of object-oriented programming."),
            zh = LocalizedContent("谁创造了 Simula？", listOf("Ole-Johan Dahl 和 Kristen Nygaard", "Guido van Rossum", "Dennis Ritchie", "Bjarne Stroustrup"), "科技", "Ole-Johan Dahl 和 Kristen Nygaard 在 20 世纪 60 年代于挪威计算中心设计了 Simula，奠定了面向对象编程的基础。"),
            es = LocalizedContent("¿Quién creó Simula?", listOf("Ole-Johan Dahl y Kristen Nygaard", "Guido van Rossum", "Dennis Ritchie", "Bjarne Stroustrup"), "Tecnología", "Ole-Johan Dahl y Kristen Nygaard diseñaron Simula en los años 60 en el Centro de Computación Noruego, sentando las bases de la programación orientada a objetos.")
        ),
        BilingualQuestion(
            id = 11117, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qu'est-ce que le tri rapide?", listOf("Un algorithme de tri basé sur le partitionnement", "Un type de base de données", "Un système d'exploitation", "Un langage de programmation"), "Technologie", "Le tri rapide (ou quicksort) est un algorithme de tri efficace qui fonctionne en choisissant un pivot et en partitionnant le tableau en éléments plus petits et plus grands."),
            en = LocalizedContent("What is quicksort?", listOf("A sorting algorithm based on partitioning", "A type of database", "An operating system", "A programming language"), "Technology", "Quicksort is an efficient sorting algorithm that works by choosing a pivot and partitioning the array into smaller and larger elements."),
            zh = LocalizedContent("什么是快速排序？", listOf("一种基于分区的排序算法", "一种数据库类型", "一种操作系统", "一种编程语言"), "科技", "快速排序是一种高效的排序算法，通过选择一个基准并将数组划分为较小和较大的元素来工作。"),
            es = LocalizedContent("¿Qué es el ordenamiento rápido?", listOf("Un algoritmo de ordenamiento basado en particionamiento", "Un tipo de base de datos", "Un sistema operativo", "Un lenguaje de programación"), "Tecnología", "El ordenamiento rápido (quicksort) es un algoritmo de ordenamiento eficiente que funciona eligiendo un pivote y particionando el arreglo en elementos más pequeños y más grandes.")
        ),
        BilingualQuestion(
            id = 11118, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel est le créateur de Algol?", listOf("Un groupe international de scientifiques", "Guido van Rossum", "Dennis Ritchie", "Bjarne Stroustrup"), "Technologie", "Algol a été conçu par un comité international de scientifiques réunis pour créer un langage de programmation universel, et non par un individu seul."),
            en = LocalizedContent("Who created Algol?", listOf("An international group of scientists", "Guido van Rossum", "Dennis Ritchie", "Bjarne Stroustrup"), "Technology", "Algol was designed by an international committee of scientists gathered to create a universal programming language, not by a single individual."),
            zh = LocalizedContent("谁创造了 Algol？", listOf("一个国际科学家小组", "Guido van Rossum", "Dennis Ritchie", "Bjarne Stroustrup"), "科技", "Algol 由一个国际科学家委员会设计，旨在创建一种通用的编程语言，而非由个人单独完成。"),
            es = LocalizedContent("¿Quién creó Algol?", listOf("Un grupo internacional de científicos", "Guido van Rossum", "Dennis Ritchie", "Bjarne Stroustrup"), "Tecnología", "Algol fue diseñado por un comité internacional de científicos reunidos para crear un lenguaje de programación universal, no por un individuo solo.")
        ),
        BilingualQuestion(
            id = 11119, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qu'est-ce que le tri fusion?", listOf("Un algorithme de tri basé sur la division et fusion", "Un type de base de données", "Un système d'exploitation", "Un langage de programmation"), "Technologie", "Le tri fusion est un algorithme récursif qui divise une liste en sous-listes jusqu'à ce qu'elles soient triées, puis les fusionne pour obtenir une liste ordonnée."),
            en = LocalizedContent("What is merge sort?", listOf("A sorting algorithm based on divide and merge", "A type of database", "An operating system", "A programming language"), "Technology", "Merge sort is a recursive algorithm that divides a list into sublists until they are sorted, then merges them to obtain an ordered list."),
            zh = LocalizedContent("什么是归并排序？", listOf("一种基于分治和合并的排序算法", "一种数据库类型", "一种操作系统", "一种编程语言"), "科技", "归并排序是一种递归算法，将列表分成子列表直到它们有序，然后合并它们以获得有序列表。"),
            es = LocalizedContent("¿Qué es el ordenamiento por mezcla?", listOf("Un algoritmo de ordenamiento basado en dividir y fusionar", "Un tipo de base de datos", "Un sistema operativo", "Un lenguaje de programación"), "Tecnología", "El ordenamiento por mezcla (merge sort) es un algoritmo recursivo que divide una lista en sublistas hasta que están ordenadas, luego las fusiona para obtener una lista ordenada.")
        ),
        BilingualQuestion(
            id = 11120, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui a créé Minecraft?", listOf("Notch (Markus Persson)", "Johan Säfström", "Jens Bergensten", "Daniel Rosenfeld"), "Technologie", "Markus Persson, connu sous le pseudo Notch, a développé la première version de Minecraft en 2009 avant de fonder Mojang."),
            en = LocalizedContent("Who created Minecraft?", listOf("Notch (Markus Persson)", "Johan Säfström", "Jens Bergensten", "Daniel Rosenfeld"), "Technology", "Markus Persson, known by the pseudonym Notch, developed the first version of Minecraft in 2009 before founding Mojang."),
            zh = LocalizedContent("谁创造了《我的世界》？", listOf("Notch（马库斯·佩尔松）", "约翰·塞夫斯特罗姆", "延斯·伯根斯坦", "丹尼尔·罗森菲尔德"), "科技", "马库斯·佩尔松，以化名Notch闻名，于2009年开发了《我的世界》的第一个版本，随后创立了Mojang。"),
            es = LocalizedContent("¿Quién creó Minecraft?", listOf("Notch (Markus Persson)", "Johan Säfström", "Jens Bergensten", "Daniel Rosenfeld"), "Tecnología", "Markus Persson, conocido bajo el seudónimo Notch, desarrolló la primera versión de Minecraft en 2009 antes de fundar Mojang.")
        ),
        BilingualQuestion(
            id = 11121, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année Minecraft a-t-il été lancé?", listOf("2009", "2008", "2010", "2011"), "Technologie", "Minecraft a été rendu public pour la première fois le 17 mai 2009 en tant que version alpha développée par Markus Persson."),
            en = LocalizedContent("In what year was Minecraft released?", listOf("2009", "2008", "2010", "2011"), "Technology", "Minecraft was first made public on May 17, 2009 as an alpha version developed by Markus Persson."),
            zh = LocalizedContent("《我的世界》在哪一年发布？", listOf("2009", "2008", "2010", "2011"), "科技", "《我的世界》于2009年5月17日首次公开，作为马库斯·佩尔松开发的alpha版本。"),
            es = LocalizedContent("¿En qué año se lanzó Minecraft?", listOf("2009", "2008", "2010", "2011"), "Tecnología", "Minecraft se hizo público por primera vez el 17 de mayo de 2009 como una versión alfa desarrollada por Markus Persson.")
        ),
        BilingualQuestion(
            id = 11122, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le moteur de jeu créé par Epic Games?", listOf("Unreal Engine", "Unity", "Godot", "CryEngine"), "Technologie", "Epic Games a développé Unreal Engine, lancé en 1998 avec le jeu Unreal, et il est devenu un moteur de jeu très utilisé dans l'industrie du jeu vidéo et au-delà."),
            en = LocalizedContent("What is the game engine created by Epic Games?", listOf("Unreal Engine", "Unity", "Godot", "CryEngine"), "Technology", "Epic Games developed Unreal Engine, launched in 1998 with the game Unreal, and it has become a widely used game engine in the video game industry and beyond."),
            zh = LocalizedContent("Epic Games 创建的游戏引擎是什么？", listOf("虚幻引擎", "Unity", "Godot", "CryEngine"), "科技", "Epic Games 开发了虚幻引擎，于1998年与游戏《虚幻》一同推出，并已成为游戏行业及其他领域广泛使用的游戏引擎。"),
            es = LocalizedContent("¿Cuál es el motor de juego creado por Epic Games?", listOf("Unreal Engine", "Unity", "Godot", "CryEngine"), "Tecnología", "Epic Games desarrolló Unreal Engine, lanzado en 1998 con el juego Unreal, y se ha convertido en un motor de juego muy utilizado en la industria del videojuego y más allá.")
        ),
        BilingualQuestion(
            id = 11123, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année le moteur Unity a-t-il été lancé?", listOf("2005", "2003", "2007", "2009"), "Technologie", "Unity Technologies a présenté la première version du moteur Unity lors de la conférence Apple Worldwide Developers Conference en 2005, initialement conçu pour les jeux Mac OS X."),
            en = LocalizedContent("In what year was the Unity engine launched?", listOf("2005", "2003", "2007", "2009"), "Technology", "Unity Technologies presented the first version of the Unity engine at the Apple Worldwide Developers Conference in 2005, initially designed for Mac OS X games."),
            zh = LocalizedContent("Unity 引擎在哪一年发布？", listOf("2005", "2003", "2007", "2009"), "科技", "Unity Technologies 在2005年的苹果全球开发者大会上展示了Unity引擎的第一个版本，最初是为Mac OS X游戏设计的。"),
            es = LocalizedContent("¿En qué año se lanzó el motor Unity?", listOf("2005", "2003", "2007", "2009"), "Tecnología", "Unity Technologies presentó la primera versión del motor Unity en la Conferencia Mundial de Desarrolladores de Apple en 2005, inicialmente diseñado para juegos de Mac OS X.")
        ),
        BilingualQuestion(
            id = 11124, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui a créé Fortnite?", listOf("Epic Games", "Activision", "Ubisoft", "EA Games"), "Technologie", "Epic Games, entreprise américaine fondée par Tim Sweeney, a développé et publié Fortnite en 2017. Le jeu est devenu un phénomène mondial grâce à son mode Battle Royale gratuit."),
            en = LocalizedContent("Who created Fortnite?", listOf("Epic Games", "Activision", "Ubisoft", "EA Games"), "Technology", "Epic Games, an American company founded by Tim Sweeney, developed and published Fortnite in 2017. The game became a global phenomenon thanks to its free Battle Royale mode."),
            zh = LocalizedContent("谁创造了《堡垒之夜》？", listOf("Epic Games", "动视", "育碧", "EA Games"), "科技", "Epic Games，一家由蒂姆·斯威尼创立的美国公司，于2017年开发并发布了《堡垒之夜》。该游戏凭借其免费的Battle Royale模式成为全球现象。"),
            es = LocalizedContent("¿Quién creó Fortnite?", listOf("Epic Games", "Activision", "Ubisoft", "EA Games"), "Tecnología", "Epic Games, una empresa estadounidense fundada por Tim Sweeney, desarrolló y publicó Fortnite en 2017. El juego se convirtió en un fenómeno mundial gracias a su modo Battle Royale gratuito.")
        ),
        BilingualQuestion(
            id = 11125, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le créateur de The Legend of Zelda?", listOf("Shigeru Miyamoto", "Satoru Iwata", "Gunpei Yokoi", "Hiroshi Yamauchi"), "Technologie", "Shigeru Miyamoto a créé The Legend of Zelda en 1986, s'inspirant de ses explorations enfantines dans la campagne japonaise. Il est également le créateur de Super Mario."),
            en = LocalizedContent("Who is the creator of The Legend of Zelda?", listOf("Shigeru Miyamoto", "Satoru Iwata", "Gunpei Yokoi", "Hiroshi Yamauchi"), "Technology", "Shigeru Miyamoto created The Legend of Zelda in 1986, inspired by his childhood explorations in the Japanese countryside. He is also the creator of Super Mario."),
            zh = LocalizedContent("《塞尔达传说》的创作者是谁？", listOf("宫本茂", "岩田聪", "横井军平", "山内溥"), "科技", "宫本茂于1986年创作了《塞尔达传说》，灵感来源于他童年时在日本乡村的探索。他也是《超级马里奥》的创作者。"),
            es = LocalizedContent("¿Quién es el creador de The Legend of Zelda?", listOf("Shigeru Miyamoto", "Satoru Iwata", "Gunpei Yokoi", "Hiroshi Yamauchi"), "Tecnología", "Shigeru Miyamoto creó The Legend of Zelda en 1986, inspirándose en sus exploraciones infantiles en el campo japonés. También es el creador de Super Mario.")
        ),
        BilingualQuestion(
            id = 11126, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("En quelle année le PlayStation 5 a-t-il été lancé?", listOf("2020", "2019", "2021", "2022"), "Technologie", "La PlayStation 5 a été lancée en novembre 2020, succédant à la PlayStation 4 après sept ans de commercialisation."),
            en = LocalizedContent("In what year was the PlayStation 5 launched?", listOf("2020", "2019", "2021", "2022"), "Technology", "The PlayStation 5 was launched in November 2020, succeeding the PlayStation 4 after seven years on the market."),
            zh = LocalizedContent("PlayStation 5 在哪一年发布？", listOf("2020", "2019", "2021", "2022"), "科技", "PlayStation 5 于2020年11月发布，接替了上市七年的PlayStation 4。"),
            es = LocalizedContent("¿En qué año se lanzó la PlayStation 5?", listOf("2020", "2019", "2021", "2022"), "Tecnología", "La PlayStation 5 se lanzó en noviembre de 2020, sucediendo a la PlayStation 4 después de siete años en el mercado.")
        ),
        BilingualQuestion(
            id = 11127, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel studio a créé God of War?", listOf("Santa Monica Studio", "Naughty Dog", "Insomniac Games", "Guerrilla Games"), "Technologie", "Santa Monica Studio, filiale de Sony Interactive Entertainment, a développé la série God of War depuis son premier opus en 2005."),
            en = LocalizedContent("Which studio created God of War?", listOf("Santa Monica Studio", "Naughty Dog", "Insomniac Games", "Guerrilla Games"), "Technology", "Santa Monica Studio, a subsidiary of Sony Interactive Entertainment, developed the God of War series since its first installment in 2005."),
            zh = LocalizedContent("哪个工作室创造了《战神》？", listOf("圣莫尼卡工作室", "顽皮狗", "失眠组", "游骑兵工作室"), "科技", "圣莫尼卡工作室，索尼互动娱乐的子公司，自2005年第一部作品以来一直开发《战神》系列。"),
            es = LocalizedContent("¿Qué estudio creó God of War?", listOf("Santa Monica Studio", "Naughty Dog", "Insomniac Games", "Guerrilla Games"), "Tecnología", "Santa Monica Studio, una subsidiaria de Sony Interactive Entertainment, desarrolló la serie God of War desde su primera entrega en 2005.")
        ),
        BilingualQuestion(
            id = 11128, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année Steam a-t-il été lancé?", listOf("2003", "2001", "2005", "2007"), "Technologie", "Steam a été lancé par Valve en septembre 2003, initialement comme plateforme de mise à jour automatique pour ses jeux, avant de devenir le principal magasin de jeux PC."),
            en = LocalizedContent("In what year was Steam launched?", listOf("2003", "2001", "2005", "2007"), "Technology", "Steam was launched by Valve in September 2003, initially as an automatic update platform for its games, before becoming the leading PC game store."),
            zh = LocalizedContent("Steam 在哪一年发布？", listOf("2003", "2001", "2005", "2007"), "科技", "Steam 由 Valve 于2003年9月推出，最初作为其游戏的自动更新平台，后来成为主要的PC游戏商店。"),
            es = LocalizedContent("¿En qué año se lanzó Steam?", listOf("2003", "2001", "2005", "2007"), "Tecnología", "Steam fue lanzado por Valve en septiembre de 2003, inicialmente como una plataforma de actualización automática para sus juegos, antes de convertirse en la principal tienda de juegos para PC.")
        ),
        BilingualQuestion(
            id = 11129, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel jeu vidéo a remporté le Game of the Year 2023?", listOf("Baldur's Gate 3", "Alan Wake 2", "Starfield", "Spider-Man 2"), "Technologie", "Baldur's Gate 3, développé par Larian Studios, a remporté le Game of the Year 2023 aux Game Awards grâce à son gameplay profond et sa narration immersive."),
            en = LocalizedContent("Which video game won Game of the Year 2023?", listOf("Baldur's Gate 3", "Alan Wake 2", "Starfield", "Spider-Man 2"), "Technology", "Baldur's Gate 3, developed by Larian Studios, won Game of the Year 2023 at The Game Awards thanks to its deep gameplay and immersive storytelling."),
            zh = LocalizedContent("哪款游戏赢得了2023年年度游戏？", listOf("《博德之门3》", "《心灵杀手2》", "《星空》", "《蜘蛛侠2》"), "科技", "《博德之门3》，由拉瑞安工作室开发，凭借其深刻的游戏玩法和沉浸式叙事赢得了2023年游戏大奖的年度游戏。"),
            es = LocalizedContent("¿Qué videojuego ganó el Juego del Año 2023?", listOf("Baldur's Gate 3", "Alan Wake 2", "Starfield", "Spider-Man 2"), "Tecnología", "Baldur's Gate 3, desarrollado por Larian Studios, ganó el Juego del Año 2023 en The Game Awards gracias a su profunda jugabilidad y narrativa inmersiva.")
        ),
        BilingualQuestion(
            id = 11130, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a créé le concept de réalité virtuelle?", listOf("Jaron Lanier", "Mark Zuckerberg", "Steve Jobs", "Bill Gates"), "Technologie", "Jaron Lanier a popularisé le terme « réalité virtuelle » dans les années 1980 et a fondé VPL Research, la première entreprise à vendre des casques et gants de réalité virtuelle."),
            en = LocalizedContent("Who created the concept of virtual reality?", listOf("Jaron Lanier", "Mark Zuckerberg", "Steve Jobs", "Bill Gates"), "Technology", "Jaron Lanier popularized the term 'virtual reality' in the 1980s and founded VPL Research, the first company to sell VR headsets and gloves."),
            zh = LocalizedContent("谁创造了虚拟现实的概念？", listOf("杰伦·拉尼尔", "马克·扎克伯格", "史蒂夫·乔布斯", "比尔·盖茨"), "科技", "杰伦·拉尼尔在20世纪80年代推广了“虚拟现实”一词，并创立了VPL Research，这是第一家销售VR头盔和手套的公司。"),
            es = LocalizedContent("¿Quién creó el concepto de realidad virtual?", listOf("Jaron Lanier", "Mark Zuckerberg", "Steve Jobs", "Bill Gates"), "Tecnología", "Jaron Lanier popularizó el término 'realidad virtual' en la década de 1980 y fundó VPL Research, la primera empresa en vender cascos y guantes de realidad virtual.")
        ),
        BilingualQuestion(
            id = 11131, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le langage utilisé pour les scripts dans Unity?", listOf("C#", "C++", "Java", "Python"), "Technologie", "Unity utilise principalement C# comme langage de script, car il offre une intégration native avec le moteur et une syntaxe adaptée au développement de jeux."),
            en = LocalizedContent("What language is used for scripting in Unity?", listOf("C#", "C++", "Java", "Python"), "Technology", "Unity primarily uses C# as its scripting language, as it offers native integration with the engine and a syntax suited for game development."),
            zh = LocalizedContent("Unity中用于脚本的语言是什么？", listOf("C#", "C++", "Java", "Python"), "科技", "Unity主要使用C#作为脚本语言，因为它与引擎原生集成，并且语法适合游戏开发。"),
            es = LocalizedContent("¿Qué lenguaje se utiliza para los scripts en Unity?", listOf("C#", "C++", "Java", "Python"), "Tecnología", "Unity utiliza principalmente C# como lenguaje de script, ya que ofrece integración nativa con el motor y una sintaxis adecuada para el desarrollo de juegos.")
        ),
        BilingualQuestion(
            id = 11132, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année le Oculus Rift a-t-il été lancé?", listOf("2016", "2014", "2018", "2020"), "Technologie", "L'Oculus Rift, premier casque de réalité virtuelle grand public de la marque, a été commercialisé en mars 2016 après une campagne de financement participatif en 2012 et des versions développeurs."),
            en = LocalizedContent("In what year was the Oculus Rift launched?", listOf("2016", "2014", "2018", "2020"), "Technology", "The Oculus Rift, the first consumer virtual reality headset from the brand, was commercialized in March 2016 after a crowdfunding campaign in 2012 and developer versions."),
            zh = LocalizedContent("Oculus Rift是哪一年推出的？", listOf("2016", "2014", "2018", "2020"), "科技", "Oculus Rift是该品牌首款面向消费者的虚拟现实头盔，在2012年众筹活动和开发者版本之后，于2016年3月上市。"),
            es = LocalizedContent("¿En qué año se lanzó el Oculus Rift?", listOf("2016", "2014", "2018", "2020"), "Tecnología", "El Oculus Rift, el primer casco de realidad virtual de consumo de la marca, se comercializó en marzo de 2016 tras una campaña de financiación colectiva en 2012 y versiones para desarrolladores.")
        ),
        BilingualQuestion(
            id = 11133, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel studio a créé la série Halo?", listOf("Bungie", "343 Industries", "Gearbox Software", "Obsidian Entertainment"), "Technologie", "343 Industries a repris le développement de la série Halo en 2007, succédant à Bungie, et a produit la plupart des jeux principaux depuis Halo 4."),
            en = LocalizedContent("Which studio created the Halo series?", listOf("Bungie", "343 Industries", "Gearbox Software", "Obsidian Entertainment"), "Technology", "343 Industries took over the development of the Halo series in 2007, succeeding Bungie, and has produced most main games since Halo 4."),
            zh = LocalizedContent("哪个工作室创造了《光环》系列？", listOf("Bungie", "343 Industries", "Gearbox Software", "Obsidian Entertainment"), "科技", "343 Industries于2007年接手《光环》系列的开发，接替Bungie，并从《光环4》开始制作了大部分主要游戏。"),
            es = LocalizedContent("¿Qué estudio creó la serie Halo?", listOf("Bungie", "343 Industries", "Gearbox Software", "Obsidian Entertainment"), "Tecnología", "343 Industries asumió el desarrollo de la serie Halo en 2007, sucediendo a Bungie, y ha producido la mayoría de los juegos principales desde Halo 4.")
        ),
        BilingualQuestion(
            id = 11134, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année Roblox a-t-il été fondé?", listOf("2004", "2002", "2006", "2008"), "Technologie", "Roblox a été fondé en 2004 par David Baszucki et Erik Cassel, initialement sous le nom de Dynablocks avant d'être renommé en 2005."),
            en = LocalizedContent("In what year was Roblox founded?", listOf("2004", "2002", "2006", "2008"), "Technology", "Roblox was founded in 2004 by David Baszucki and Erik Cassel, initially under the name Dynablocks before being renamed in 2005."),
            zh = LocalizedContent("Roblox是哪一年成立的？", listOf("2004", "2002", "2006", "2008"), "科技", "Roblox由David Baszucki和Erik Cassel于2004年创立，最初名为Dynablocks，2005年更名。"),
            es = LocalizedContent("¿En qué año se fundó Roblox?", listOf("2004", "2002", "2006", "2008"), "Tecnología", "Roblox fue fundado en 2004 por David Baszucki y Erik Cassel, inicialmente bajo el nombre de Dynablocks antes de ser renombrado en 2005.")
        ),
        BilingualQuestion(
            id = 11135, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le moteur de jeu utilisé par Fortnite?", listOf("Unreal Engine 4", "Unity", "Godot", "CryEngine"), "Technologie", "Fortnite est développé par Epic Games, qui est aussi le créateur d'Unreal Engine, leur moteur de jeu propriétaire utilisé pour le titre."),
            en = LocalizedContent("What game engine does Fortnite use?", listOf("Unreal Engine 4", "Unity", "Godot", "CryEngine"), "Technology", "Fortnite is developed by Epic Games, which is also the creator of Unreal Engine, their proprietary game engine used for the title."),
            zh = LocalizedContent("《堡垒之夜》使用什么游戏引擎？", listOf("虚幻引擎4", "Unity", "Godot", "CryEngine"), "科技", "《堡垒之夜》由Epic Games开发，该公司也是虚幻引擎的创造者，该引擎是用于该游戏的专有游戏引擎。"),
            es = LocalizedContent("¿Qué motor de juego utiliza Fortnite?", listOf("Unreal Engine 4", "Unity", "Godot", "CryEngine"), "Tecnología", "Fortnite es desarrollado por Epic Games, que también es el creador de Unreal Engine, su motor de juego propietario utilizado para el título.")
        ),
        BilingualQuestion(
            id = 11136, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année le premier jeu vidéo commercial a-t-il été lancé?", listOf("1972", "1970", "1974", "1976"), "Technologie", "Le premier jeu vidéo commercial, Pong, a été lancé par Atari en 1972. Ce jeu de tennis simplifié a marqué le début de l'industrie vidéoludique grand public."),
            en = LocalizedContent("In what year was the first commercial video game launched?", listOf("1972", "1970", "1974", "1976"), "Technology", "The first commercial video game, Pong, was launched by Atari in 1972. This simplified tennis game marked the beginning of the consumer video game industry."),
            zh = LocalizedContent("第一款商业电子游戏是哪一年推出的？", listOf("1972", "1970", "1974", "1976"), "科技", "第一款商业电子游戏《乓》由雅达利于1972年推出。这款简化的网球游戏标志着消费电子游戏产业的开始。"),
            es = LocalizedContent("¿En qué año se lanzó el primer videojuego comercial?", listOf("1972", "1970", "1974", "1976"), "Tecnología", "El primer videojuego comercial, Pong, fue lanzado por Atari en 1972. Este juego de tenis simplificado marcó el inicio de la industria del videojuego de consumo.")
        ),
        BilingualQuestion(
            id = 11137, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel jeu vidéo a été le premier à vendre 100 millions de copies?", listOf("Tetris", "Super Mario Bros", "Wii Sports", "Minecraft"), "Technologie", "Tetris a atteint ce cap historique grâce à ses innombrables versions sur consoles, mobiles et ordinateurs depuis sa création en 1984, cumulant plus de 520 millions de téléchargements payants."),
            en = LocalizedContent("Which video game was the first to sell 100 million copies?", listOf("Tetris", "Super Mario Bros", "Wii Sports", "Minecraft"), "Technology", "Tetris reached this historic milestone thanks to its countless versions on consoles, mobiles, and computers since its creation in 1984, accumulating over 520 million paid downloads."),
            zh = LocalizedContent("哪款电子游戏是第一个销量达到1亿份的？", listOf("俄罗斯方块", "超级马力欧兄弟", "Wii Sports", "我的世界"), "科技", "《俄罗斯方块》自1984年诞生以来，凭借其在主机、手机和电脑上的无数版本，累计超过5.2亿次付费下载，达到了这一历史性里程碑。"),
            es = LocalizedContent("¿Qué videojuego fue el primero en vender 100 millones de copias?", listOf("Tetris", "Super Mario Bros", "Wii Sports", "Minecraft"), "Tecnología", "Tetris alcanzó este hito histórico gracias a sus innumerables versiones en consolas, móviles y ordenadores desde su creación en 1984, acumulando más de 520 millones de descargas de pago.")
        ),
        BilingualQuestion(
            id = 11138, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année le PlayStation a-t-il été lancé?", listOf("1994", "1992", "1996", "1998"), "Technologie", "La PlayStation originale a été lancée au Japon le 3 décembre 1994, marquant l'entrée de Sony sur le marché des consoles de salon."),
            en = LocalizedContent("In what year was the PlayStation launched?", listOf("1994", "1992", "1996", "1998"), "Technology", "The original PlayStation was launched in Japan on December 3, 1994, marking Sony's entry into the home console market."),
            zh = LocalizedContent("PlayStation是哪一年推出的？", listOf("1994", "1992", "1996", "1998"), "科技", "初代PlayStation于1994年12月3日在日本推出，标志着索尼进入家用游戏机市场。"),
            es = LocalizedContent("¿En qué año se lanzó la PlayStation?", listOf("1994", "1992", "1996", "1998"), "Tecnología", "La PlayStation original se lanzó en Japón el 3 de diciembre de 1994, marcando la entrada de Sony en el mercado de consolas domésticas.")
        ),
        BilingualQuestion(
            id = 11139, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le créateur de Pokémon?", listOf("Ken Sugimori et Satoshi Tajiri", "Shigeru Miyamoto", "Gunpei Yokoi", "Hiroshi Yamauchi"), "Technologie", "Satoshi Tajiri a imaginé Pokémon en 1996, inspiré par son enfance à collectionner des insectes, tandis que Ken Sugimori a conçu les premiers dessins des créatures."),
            en = LocalizedContent("Who is the creator of Pokémon?", listOf("Ken Sugimori and Satoshi Tajiri", "Shigeru Miyamoto", "Gunpei Yokoi", "Hiroshi Yamauchi"), "Technology", "Satoshi Tajiri conceived Pokémon in 1996, inspired by his childhood insect collecting, while Ken Sugimori designed the first creature drawings."),
            zh = LocalizedContent("宝可梦的创造者是谁？", listOf("杉森建和田尻智", "宫本茂", "横井军平", "山内溥"), "科技", "田尻智在1996年构思了宝可梦，灵感来自他童年收集昆虫的经历，而杉森建设计了最初的宝可梦形象。"),
            es = LocalizedContent("¿Quién es el creador de Pokémon?", listOf("Ken Sugimori y Satoshi Tajiri", "Shigeru Miyamoto", "Gunpei Yokoi", "Hiroshi Yamauchi"), "Tecnología", "Satoshi Tajiri concibió Pokémon en 1996, inspirado por su infancia coleccionando insectos, mientras que Ken Sugimori diseñó los primeros dibujos de las criaturas.")
        ),
        BilingualQuestion(
            id = 11140, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("En quelle année le Nintendo Switch a-t-il été lancé?", listOf("2017", "2015", "2019", "2021"), "Technologie", "La Nintendo Switch a été lancée mondialement en mars 2017, succédant à la Wii U et marquant un retour réussi pour Nintendo avec son concept hybride console portable et de salon."),
            en = LocalizedContent("In what year was the Nintendo Switch launched?", listOf("2017", "2015", "2019", "2021"), "Technology", "The Nintendo Switch was launched globally in March 2017, succeeding the Wii U and marking a successful return for Nintendo with its hybrid portable and home console concept."),
            zh = LocalizedContent("任天堂Switch是哪一年发布的？", listOf("2017", "2015", "2019", "2021"), "科技", "任天堂Switch于2017年3月全球发布，接替Wii U，以其便携和家用混合概念标志着任天堂的成功回归。"),
            es = LocalizedContent("¿En qué año se lanzó la Nintendo Switch?", listOf("2017", "2015", "2019", "2021"), "Tecnología", "La Nintendo Switch se lanzó a nivel mundial en marzo de 2017, sucediendo a la Wii U y marcando un regreso exitoso para Nintendo con su concepto híbrido de consola portátil y de sobremesa.")
        ),
        BilingualQuestion(
            id = 11141, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand éditeur de jeux vidéo au monde?", listOf("Tencent", "Sony", "Microsoft", "Nintendo"), "Technologie", "Tencent est le plus grand éditeur de jeux vidéo au monde en termes de revenus, grâce à ses participations dans Riot Games, Epic Games et Supercell."),
            en = LocalizedContent("What is the largest video game publisher in the world?", listOf("Tencent", "Sony", "Microsoft", "Nintendo"), "Technology", "Tencent is the largest video game publisher in the world by revenue, thanks to its stakes in Riot Games, Epic Games, and Supercell."),
            zh = LocalizedContent("世界上最大的视频游戏发行商是哪家？", listOf("腾讯", "索尼", "微软", "任天堂"), "科技", "腾讯是全球收入最高的视频游戏发行商，得益于其在Riot Games、Epic Games和Supercell的持股。"),
            es = LocalizedContent("¿Cuál es la editorial de videojuegos más grande del mundo?", listOf("Tencent", "Sony", "Microsoft", "Nintendo"), "Tecnología", "Tencent es la editorial de videojuegos más grande del mundo en términos de ingresos, gracias a sus participaciones en Riot Games, Epic Games y Supercell.")
        ),
        BilingualQuestion(
            id = 11142, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année la VR a-t-elle été commercialisée pour la première fois?", listOf("1995", "1990", "2000", "2005"), "Technologie", "La première console de réalité virtuelle grand public, la Virtual Boy de Nintendo, a été commercialisée en 1995."),
            en = LocalizedContent("In what year was VR first commercialized?", listOf("1995", "1990", "2000", "2005"), "Technology", "The first consumer virtual reality console, the Virtual Boy by Nintendo, was commercialized in 1995."),
            zh = LocalizedContent("虚拟现实是哪一年首次商业化的？", listOf("1995", "1990", "2000", "2005"), "科技", "第一款面向消费者的虚拟现实游戏机，任天堂的Virtual Boy，于1995年商业化。"),
            es = LocalizedContent("¿En qué año se comercializó por primera vez la realidad virtual?", listOf("1995", "1990", "2000", "2005"), "Tecnología", "La primera consola de realidad virtual para el público general, la Virtual Boy de Nintendo, se comercializó en 1995.")
        ),
        BilingualQuestion(
            id = 11143, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le jeu vidéo le plus joué au monde?", listOf("PUBG", "Fortnite", "League of Legends", "Minecraft"), "Technologie", "PUBG a détenu le record du nombre de joueurs simultanés sur Steam et a été un pionnier du battle royale, atteignant des centaines de millions de joueurs cumulés."),
            en = LocalizedContent("What is the most played video game in the world?", listOf("PUBG", "Fortnite", "League of Legends", "Minecraft"), "Technology", "PUBG held the record for concurrent players on Steam and was a pioneer of the battle royale genre, reaching hundreds of millions of cumulative players."),
            zh = LocalizedContent("世界上玩得最多的视频游戏是什么？", listOf("PUBG", "堡垒之夜", "英雄联盟", "我的世界"), "科技", "PUBG在Steam上保持了同时在线玩家记录，并且是吃鸡类游戏的先驱，累计玩家数达数亿。"),
            es = LocalizedContent("¿Cuál es el videojuego más jugado del mundo?", listOf("PUBG", "Fortnite", "League of Legends", "Minecraft"), "Tecnología", "PUBG ostentó el récord de jugadores simultáneos en Steam y fue pionero del género battle royale, alcanzando cientos de millones de jugadores acumulados.")
        ),
        BilingualQuestion(
            id = 11144, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année Twitch a-t-il été fondé?", listOf("2011", "2009", "2013", "2015"), "Technologie", "Twitch est né en 2011 sous le nom de Justin.tv, avant de se recentrer uniquement sur le jeu vidéo en direct et de prendre son nom actuel."),
            en = LocalizedContent("In what year was Twitch founded?", listOf("2011", "2009", "2013", "2015"), "Technology", "Twitch was born in 2011 under the name Justin.tv, before focusing solely on live video gaming and adopting its current name."),
            zh = LocalizedContent("Twitch是哪一年成立的？", listOf("2011", "2009", "2013", "2015"), "科技", "Twitch于2011年以Justin.tv之名诞生，之后专注于游戏直播并改用现名。"),
            es = LocalizedContent("¿En qué año se fundó Twitch?", listOf("2011", "2009", "2013", "2015"), "Tecnología", "Twitch nació en 2011 bajo el nombre de Justin.tv, antes de centrarse únicamente en el juego en vivo y adoptar su nombre actual.")
        ),
        BilingualQuestion(
            id = 11145, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le studio créateur de The Witcher?", listOf("CD Projekt Red", "Obsidian Entertainment", "BioWare", "Bethesda Game Studios"), "Technologie", "CD Projekt Red, studio polonais fondé en 2002, a développé la série de jeux The Witcher, adaptée des romans d'Andrzej Sapkowski."),
            en = LocalizedContent("Which studio created The Witcher?", listOf("CD Projekt Red", "Obsidian Entertainment", "BioWare", "Bethesda Game Studios"), "Technology", "CD Projekt Red, a Polish studio founded in 2002, developed the Witcher series of games, adapted from the novels by Andrzej Sapkowski."),
            zh = LocalizedContent("哪个工作室创造了《巫师》？", listOf("CD Projekt Red", "黑曜石娱乐", "BioWare", "贝塞斯达游戏工作室"), "科技", "CD Projekt Red，一家成立于2002年的波兰工作室，开发了《巫师》系列游戏，改编自安杰伊·萨普科夫斯基的小说。"),
            es = LocalizedContent("¿Qué estudio creó The Witcher?", listOf("CD Projekt Red", "Obsidian Entertainment", "BioWare", "Bethesda Game Studios"), "Tecnología", "CD Projekt Red, un estudio polaco fundado en 2002, desarrolló la serie de juegos The Witcher, adaptada de las novelas de Andrzej Sapkowski.")
        ),
        BilingualQuestion(
            id = 11146, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année Discord a-t-il été lancé?", listOf("2015", "2013", "2017", "2019"), "Technologie", "Discord a été lancé en 2015 par Jason Citron et Stanislav Vishnevskiy, initialement conçu pour les joueurs afin de communiquer vocalement pendant les parties."),
            en = LocalizedContent("In what year was Discord launched?", listOf("2015", "2013", "2017", "2019"), "Technology", "Discord was launched in 2015 by Jason Citron and Stanislav Vishnevskiy, initially designed for gamers to communicate vocally during games."),
            zh = LocalizedContent("Discord是哪一年推出的？", listOf("2015", "2013", "2017", "2019"), "科技", "Discord于2015年由Jason Citron和Stanislav Vishnevskiy推出，最初为游戏玩家在游戏中语音交流而设计。"),
            es = LocalizedContent("¿En qué año se lanzó Discord?", listOf("2015", "2013", "2017", "2019"), "Tecnología", "Discord se lanzó en 2015 por Jason Citron y Stanislav Vishnevskiy, inicialmente diseñado para que los jugadores se comunicaran por voz durante las partidas.")
        ),
        BilingualQuestion(
            id = 11147, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le créateur de League of Legends?", listOf("Riot Games", "Blizzard Entertainment", "Valve", "Activision"), "Technologie", "Riot Games a développé et publié League of Legends en 2009, devenant ainsi le créateur officiel du jeu."),
            en = LocalizedContent("Who created League of Legends?", listOf("Riot Games", "Blizzard Entertainment", "Valve", "Activision"), "Technology", "Riot Games developed and published League of Legends in 2009, thus becoming the official creator of the game."),
            zh = LocalizedContent("谁创造了《英雄联盟》？", listOf("Riot Games", "暴雪娱乐", "Valve", "动视"), "科技", "Riot Games于2009年开发并发布了《英雄联盟》，因此成为该游戏的官方创造者。"),
            es = LocalizedContent("¿Quién creó League of Legends?", listOf("Riot Games", "Blizzard Entertainment", "Valve", "Activision"), "Tecnología", "Riot Games desarrolló y publicó League of Legends en 2009, convirtiéndose así en el creador oficial del juego.")
        ),
        BilingualQuestion(
            id = 11148, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année Counter-Strike a-t-il été lancé?", listOf("2000", "1998", "2002", "2004"), "Technologie", "Counter-Strike est sorti en 2000 en tant que mod pour Half-Life, avant d'être racheté par Valve et de devenir un jeu à part entière."),
            en = LocalizedContent("In what year was Counter-Strike launched?", listOf("2000", "1998", "2002", "2004"), "Technology", "Counter-Strike was released in 2000 as a mod for Half-Life, before being acquired by Valve and becoming a standalone game."),
            zh = LocalizedContent("《反恐精英》是哪一年推出的？", listOf("2000", "1998", "2002", "2004"), "科技", "《反恐精英》于2000年作为《半条命》的一个模组发布，后被Valve收购并成为独立游戏。"),
            es = LocalizedContent("¿En qué año se lanzó Counter-Strike?", listOf("2000", "1998", "2002", "2004"), "Tecnología", "Counter-Strike se lanzó en 2000 como un mod para Half-Life, antes de ser adquirido por Valve y convertirse en un juego independiente.")
        ),
        BilingualQuestion(
            id = 11149, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus ancien jeu vidéo encore joué?", listOf("Pong", "Space Invaders", "Pac-Man", "Tetris"), "Technologie", "Pong, sorti en 1972 sur borne d'arcade, est souvent considéré comme le premier jeu vidéo grand public et reste jouable aujourd'hui via des émulateurs ou des rééditions."),
            en = LocalizedContent("What is the oldest video game still played?", listOf("Pong", "Space Invaders", "Pac-Man", "Tetris"), "Technology", "Pong, released in 1972 on arcade machines, is often considered the first mass-market video game and remains playable today via emulators or re-releases."),
            zh = LocalizedContent("哪款是最古老且仍在被玩的视频游戏？", listOf("Pong", "太空侵略者", "吃豆人", "俄罗斯方块"), "科技", "Pong于1972年在街机上发布，常被认为是第一款面向大众的视频游戏，至今仍可通过模拟器或重制版游玩。"),
            es = LocalizedContent("¿Cuál es el videojuego más antiguo que todavía se juega?", listOf("Pong", "Space Invaders", "Pac-Man", "Tetris"), "Tecnología", "Pong, lanzado en 1972 en máquinas recreativas, a menudo se considera el primer videojuego de consumo masivo y sigue siendo jugable hoy en día a través de emuladores o reediciones.")
        ),
        BilingualQuestion(
            id = 11150, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui a inventé l'ampoule électrique?", listOf("Thomas Edison", "Nikola Tesla", "Joseph Swan", "Humphry Davy"), "Technologie", "Thomas Edison a commercialisé la première ampoule électrique pratique en 1879, mais il s'est appuyé sur les travaux de nombreux prédécesseurs comme Joseph Swan."),
            en = LocalizedContent("Who invented the electric light bulb?", listOf("Thomas Edison", "Nikola Tesla", "Joseph Swan", "Humphry Davy"), "Technology", "Thomas Edison commercialized the first practical electric light bulb in 1879, but he built on the work of many predecessors like Joseph Swan."),
            zh = LocalizedContent("谁发明了电灯泡？", listOf("托马斯·爱迪生", "尼古拉·特斯拉", "约瑟夫·斯旺", "汉弗里·戴维"), "科技", "托马斯·爱迪生于1879年将第一个实用的电灯泡商业化，但他的工作建立在许多前人如约瑟夫·斯旺的基础上。"),
            es = LocalizedContent("¿Quién inventó la bombilla eléctrica?", listOf("Thomas Edison", "Nikola Tesla", "Joseph Swan", "Humphry Davy"), "Tecnología", "Thomas Edison comercializó la primera bombilla eléctrica práctica en 1879, pero se basó en el trabajo de muchos predecesores como Joseph Swan.")
        ),
        BilingualQuestion(
            id = 11151, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année l'ampoule électrique a-t-elle été inventée?", listOf("1879", "1875", "1883", "1887"), "Technologie", "Thomas Edison a présenté la première ampoule électrique pratique à incandescence en 1879, après des années d'expérimentation."),
            en = LocalizedContent("In what year was the electric light bulb invented?", listOf("1879", "1875", "1883", "1887"), "Technology", "Thomas Edison presented the first practical incandescent electric light bulb in 1879, after years of experimentation."),
            zh = LocalizedContent("电灯泡是哪一年发明的？", listOf("1879年", "1875年", "1883年", "1887年"), "科技", "托马斯·爱迪生在经过多年实验后，于1879年展示了第一个实用的白炽电灯泡。"),
            es = LocalizedContent("¿En qué año se inventó la bombilla eléctrica?", listOf("1879", "1875", "1883", "1887"), "Tecnología", "Thomas Edison presentó la primera bombilla eléctrica incandescente práctica en 1879, después de años de experimentación.")
        ),
        BilingualQuestion(
            id = 11152, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui a inventé le téléphone?", listOf("Alexander Graham Bell", "Nikola Tesla", "Thomas Edison", "Samuel Morse"), "Technologie", "Alexander Graham Bell a déposé le brevet du téléphone en 1876, bien que l'italien Antonio Meucci ait développé un prototype similaire plus tôt."),
            en = LocalizedContent("Who invented the telephone?", listOf("Alexander Graham Bell", "Nikola Tesla", "Thomas Edison", "Samuel Morse"), "Technology", "Alexander Graham Bell filed the patent for the telephone in 1876, although the Italian Antonio Meucci had developed a similar prototype earlier."),
            zh = LocalizedContent("谁发明了电话？", listOf("亚历山大·格拉汉姆·贝尔", "尼古拉·特斯拉", "托马斯·爱迪生", "塞缪尔·莫尔斯"), "科技", "亚历山大·格拉汉姆·贝尔于1876年申请了电话专利，尽管意大利人安东尼奥·梅乌奇更早开发了类似的原型。"),
            es = LocalizedContent("¿Quién inventó el teléfono?", listOf("Alexander Graham Bell", "Nikola Tesla", "Thomas Edison", "Samuel Morse"), "Tecnología", "Alexander Graham Bell presentó la patente del teléfono en 1876, aunque el italiano Antonio Meucci había desarrollado un prototipo similar antes.")
        ),
        BilingualQuestion(
            id = 11153, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année le téléphone a-t-il été inventé?", listOf("1876", "1872", "1880", "1884"), "Technologie", "Alexander Graham Bell a déposé le brevet du téléphone le 7 mars 1876, marquant l'invention officielle de cet appareil de communication."),
            en = LocalizedContent("In what year was the telephone invented?", listOf("1876", "1872", "1880", "1884"), "Technology", "Alexander Graham Bell filed the patent for the telephone on March 7, 1876, marking the official invention of this communication device."),
            zh = LocalizedContent("电话是哪一年发明的？", listOf("1876年", "1872年", "1880年", "1884年"), "科技", "亚历山大·格拉汉姆·贝尔于1876年3月7日申请了电话专利，标志着这一通信设备的正式发明。"),
            es = LocalizedContent("¿En qué año se inventó el teléfono?", listOf("1876", "1872", "1880", "1884"), "Tecnología", "Alexander Graham Bell presentó la patente del teléfono el 7 de marzo de 1876, marcando la invención oficial de este dispositivo de comunicación.")
        ),
        BilingualQuestion(
            id = 11154, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui a inventé la radio?", listOf("Guglielmo Marconi", "Nikola Tesla", "Thomas Edison", "Alexander Graham Bell"), "Technologie", "Guglielmo Marconi a réalisé la première transmission radio transatlantique en 1901, ce qui lui a valu le prix Nobel de physique en 1909."),
            en = LocalizedContent("Who invented the radio?", listOf("Guglielmo Marconi", "Nikola Tesla", "Thomas Edison", "Alexander Graham Bell"), "Technology", "Guglielmo Marconi achieved the first transatlantic radio transmission in 1901, which earned him the Nobel Prize in Physics in 1909."),
            zh = LocalizedContent("谁发明了无线电？", listOf("古列尔莫·马可尼", "尼古拉·特斯拉", "托马斯·爱迪生", "亚历山大·格拉汉姆·贝尔"), "科技", "古列尔莫·马可尼于1901年实现了首次跨大西洋无线电传输，这为他赢得了1909年的诺贝尔物理学奖。"),
            es = LocalizedContent("¿Quién inventó la radio?", listOf("Guglielmo Marconi", "Nikola Tesla", "Thomas Edison", "Alexander Graham Bell"), "Tecnología", "Guglielmo Marconi logró la primera transmisión de radio transatlántica en 1901, lo que le valió el Premio Nobel de Física en 1909.")
        ),
        BilingualQuestion(
            id = 11155, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année la radio a-t-elle été inventée?", listOf("1895", "1891", "1899", "1903"), "Technologie", "Guglielmo Marconi réalisa la première transmission radio réussie en 1895, marquant l'invention de la radio. Cette avancée technologique permit la communication sans fil à distance."),
            en = LocalizedContent("In what year was the radio invented?", listOf("1895", "1891", "1899", "1903"), "Technology", "Guglielmo Marconi achieved the first successful radio transmission in 1895, marking the invention of the radio. This technological breakthrough enabled long-distance wireless communication."),
            zh = LocalizedContent("无线电是哪一年发明的？", listOf("1895年", "1891年", "1899年", "1903年"), "科技", "古列尔莫·马可尼于1895年实现了首次成功的无线电传输，标志着无线电的发明。这一技术突破实现了远距离无线通信。"),
            es = LocalizedContent("¿En qué año se inventó la radio?", listOf("1895", "1891", "1899", "1903"), "Tecnología", "Guglielmo Marconi logró la primera transmisión de radio exitosa en 1895, marcando la invención de la radio. Este avance tecnológico permitió la comunicación inalámbrica a larga distancia.")
        ),
        BilingualQuestion(
            id = 11156, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a inventé la télévision?", listOf("Vladimir Zworykin", "Philo Farnsworth", "Paul Nipkow", "John Logie Baird"), "Technologie", "Vladimir Zworykin a déposé le brevet du premier tube cathodique entièrement électronique en 1923, posant les bases de la télévision moderne."),
            en = LocalizedContent("Who invented the television?", listOf("Vladimir Zworykin", "Philo Farnsworth", "Paul Nipkow", "John Logie Baird"), "Technology", "Vladimir Zworykin filed the patent for the first fully electronic cathode ray tube in 1923, laying the foundations for modern television."),
            zh = LocalizedContent("谁发明了电视？", listOf("弗拉基米尔·兹沃里金", "菲洛·法恩斯沃思", "保罗·尼普科夫", "约翰·洛吉·贝尔德"), "科技", "弗拉基米尔·兹沃里金于1923年申请了第一个全电子阴极射线管的专利，为现代电视奠定了基础。"),
            es = LocalizedContent("¿Quién inventó la televisión?", listOf("Vladimir Zworykin", "Philo Farnsworth", "Paul Nipkow", "John Logie Baird"), "Tecnología", "Vladimir Zworykin presentó la patente del primer tubo de rayos catódicos completamente electrónico en 1923, sentando las bases de la televisión moderna.")
        ),
        BilingualQuestion(
            id = 11157, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année la télévision a-t-elle été inventée?", listOf("1927", "1923", "1931", "1935"), "Technologie", "L'invention du premier système de télévision électronique fonctionnel est attribuée à Philo Farnsworth, qui a transmis la première image en 1927."),
            en = LocalizedContent("In what year was the television invented?", listOf("1927", "1923", "1931", "1935"), "Technology", "The invention of the first functional electronic television system is attributed to Philo Farnsworth, who transmitted the first image in 1927."),
            zh = LocalizedContent("电视是哪一年发明的？", listOf("1927年", "1923年", "1931年", "1935年"), "科技", "第一个功能正常的电子电视系统的发明归功于菲洛·法恩斯沃思，他于1927年传输了第一张图像。"),
            es = LocalizedContent("¿En qué año se inventó la televisión?", listOf("1927", "1923", "1931", "1935"), "Tecnología", "La invención del primer sistema de televisión electrónico funcional se atribuye a Philo Farnsworth, quien transmitió la primera imagen en 1927.")
        ),
        BilingualQuestion(
            id = 11158, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a inventé le transistor?", listOf("John Bardeen, Léon Cooper et Robert Schrieffer", "Nikola Tesla", "Thomas Edison", "Alexander Graham Bell"), "Technologie", "Nikola Tesla n'a pas inventé le transistor. Le transistor a été inventé en 1947 par John Bardeen, Walter Brattain et William Shockley chez Bell Labs."),
            en = LocalizedContent("Who invented the transistor?", listOf("John Bardeen, Léon Cooper and Robert Schrieffer", "Nikola Tesla", "Thomas Edison", "Alexander Graham Bell"), "Technology", "Nikola Tesla did not invent the transistor. The transistor was invented in 1947 by John Bardeen, Walter Brattain and William Shockley at Bell Labs."),
            zh = LocalizedContent("谁发明了晶体管？", listOf("约翰·巴丁、莱昂·库珀和罗伯特·施里弗", "尼古拉·特斯拉", "托马斯·爱迪生", "亚历山大·格拉汉姆·贝尔"), "科技", "尼古拉·特斯拉没有发明晶体管。晶体管是由约翰·巴丁、沃尔特·布拉顿和威廉·肖克利于1947年在贝尔实验室发明的。"),
            es = LocalizedContent("¿Quién inventó el transistor?", listOf("John Bardeen, Léon Cooper y Robert Schrieffer", "Nikola Tesla", "Thomas Edison", "Alexander Graham Bell"), "Tecnología", "Nikola Tesla no inventó el transistor. El transistor fue inventado en 1947 por John Bardeen, Walter Brattain y William Shockley en los Laboratorios Bell.")
        ),
        BilingualQuestion(
            id = 11159, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année le transistor a-t-il été inventé?", listOf("1947", "1943", "1951", "1955"), "Technologie", "Le transistor a été inventé en 1947 par les physiciens John Bardeen, Walter Brattain et William Shockley aux laboratoires Bell, marquant une révolution dans l'électronique."),
            en = LocalizedContent("In what year was the transistor invented?", listOf("1947", "1943", "1951", "1955"), "Technology", "The transistor was invented in 1947 by physicists John Bardeen, Walter Brattain and William Shockley at Bell Laboratories, marking a revolution in electronics."),
            zh = LocalizedContent("晶体管是哪一年发明的？", listOf("1947年", "1943年", "1951年", "1955年"), "科技", "晶体管于1947年由物理学家约翰·巴丁、沃尔特·布拉顿和威廉·肖克利在贝尔实验室发明，标志着电子学的一场革命。"),
            es = LocalizedContent("¿En qué año se inventó el transistor?", listOf("1947", "1943", "1951", "1955"), "Tecnología", "El transistor fue inventado en 1947 por los físicos John Bardeen, Walter Brattain y William Shockley en los Laboratorios Bell, marcando una revolución en la electrónica.")
        ),
        BilingualQuestion(
            id = 11160, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a inventé le circuit intégré?", listOf("Jack Kilby et Robert Noyce", "Nikola Tesla", "Thomas Edison", "Alexander Graham Bell"), "Technologie", "Jack Kilby, chez Texas Instruments, a créé le premier circuit intégré en 1958, tandis que Robert Noyce, chez Fairchild Semiconductor, a développé une version plus pratique en silicium en 1959."),
            en = LocalizedContent("Who invented the integrated circuit?", listOf("Jack Kilby and Robert Noyce", "Nikola Tesla", "Thomas Edison", "Alexander Graham Bell"), "Technology", "Jack Kilby at Texas Instruments created the first integrated circuit in 1958, while Robert Noyce at Fairchild Semiconductor developed a more practical silicon version in 1959."),
            zh = LocalizedContent("谁发明了集成电路？", listOf("杰克·基尔比和罗伯特·诺伊斯", "尼古拉·特斯拉", "托马斯·爱迪生", "亚历山大·格雷厄姆·贝尔"), "科技", "德州仪器的杰克·基尔比于1958年创造了第一个集成电路，而仙童半导体的罗伯特·诺伊斯于1959年开发了更实用的硅版本。"),
            es = LocalizedContent("¿Quién inventó el circuito integrado?", listOf("Jack Kilby y Robert Noyce", "Nikola Tesla", "Thomas Edison", "Alexander Graham Bell"), "Tecnología", "Jack Kilby, en Texas Instruments, creó el primer circuito integrado en 1958, mientras que Robert Noyce, en Fairchild Semiconductor, desarrolló una versión más práctica de silicio en 1959.")
        ),
        BilingualQuestion(
            id = 11161, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année le circuit intégré a-t-il été inventé?", listOf("1958", "1954", "1962", "1966"), "Technologie", "Le premier circuit intégré a été inventé en 1958 par Jack Kilby chez Texas Instruments, révolutionnant l'électronique en miniaturisant les composants sur une seule puce de silicium."),
            en = LocalizedContent("In what year was the integrated circuit invented?", listOf("1958", "1954", "1962", "1966"), "Technology", "The first integrated circuit was invented in 1958 by Jack Kilby at Texas Instruments, revolutionizing electronics by miniaturizing components onto a single silicon chip."),
            zh = LocalizedContent("集成电路是哪一年发明的？", listOf("1958", "1954", "1962", "1966"), "科技", "第一个集成电路于1958年由德州仪器的杰克·基尔比发明，通过将元件微型化到单个硅片上，彻底改变了电子学。"),
            es = LocalizedContent("¿En qué año se inventó el circuito integrado?", listOf("1958", "1954", "1962", "1966"), "Tecnología", "El primer circuito integrado fue inventado en 1958 por Jack Kilby en Texas Instruments, revolucionando la electrónica al miniaturizar componentes en un solo chip de silicio.")
        ),
        BilingualQuestion(
            id = 11162, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a inventé le microprocesseur?", listOf("Intel (Ted Hoff, Federico Faggin)", "Motorola", "AMD", "Zilog"), "Technologie", "Ted Hoff, ingénieur chez Intel, a conçu l'architecture du premier microprocesseur, le 4004, en 1971, et Federico Faggin l'a réalisé en circuits intégrés."),
            en = LocalizedContent("Who invented the microprocessor?", listOf("Intel (Ted Hoff, Federico Faggin)", "Motorola", "AMD", "Zilog"), "Technology", "Ted Hoff, an engineer at Intel, designed the architecture of the first microprocessor, the 4004, in 1971, and Federico Faggin implemented it in integrated circuits."),
            zh = LocalizedContent("谁发明了微处理器？", listOf("英特尔（特德·霍夫、费德里科·法金）", "摩托罗拉", "AMD", "齐洛格"), "科技", "英特尔工程师特德·霍夫于1971年设计了第一个微处理器4004的架构，费德里科·法金将其实现为集成电路。"),
            es = LocalizedContent("¿Quién inventó el microprocesador?", listOf("Intel (Ted Hoff, Federico Faggin)", "Motorola", "AMD", "Zilog"), "Tecnología", "Ted Hoff, ingeniero de Intel, diseñó la arquitectura del primer microprocesador, el 4004, en 1971, y Federico Faggin lo realizó en circuitos integrados.")
        ),
        BilingualQuestion(
            id = 11163, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année le microprocesseur a-t-il été inventé?", listOf("1971", "1967", "1975", "1979"), "Technologie", "Le premier microprocesseur, l'Intel 4004, a été commercialisé en 1971, marquant une révolution en intégrant l'unité centrale d'un ordinateur sur une seule puce."),
            en = LocalizedContent("In what year was the microprocessor invented?", listOf("1971", "1967", "1975", "1979"), "Technology", "The first microprocessor, the Intel 4004, was commercialized in 1971, marking a revolution by integrating the central processing unit of a computer onto a single chip."),
            zh = LocalizedContent("微处理器是哪一年发明的？", listOf("1971", "1967", "1975", "1979"), "科技", "第一个微处理器Intel 4004于1971年商业化，通过将计算机的中央处理单元集成到单个芯片上，标志着一次革命。"),
            es = LocalizedContent("¿En qué año se inventó el microprocesador?", listOf("1971", "1967", "1975", "1979"), "Tecnología", "El primer microprocesador, el Intel 4004, se comercializó en 1971, marcando una revolución al integrar la unidad central de procesamiento de una computadora en un solo chip.")
        ),
        BilingualQuestion(
            id = 11164, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a inventé le disque dur?", listOf("IBM", "Seagate", "Western Digital", "Maxtor"), "Technologie", "IBM a présenté le premier disque dur, le RAMAC 305, en 1956. Cette invention a révolutionné le stockage de données en permettant un accès aléatoire aux informations."),
            en = LocalizedContent("Who invented the hard disk drive?", listOf("IBM", "Seagate", "Western Digital", "Maxtor"), "Technology", "IBM introduced the first hard disk drive, the RAMAC 305, in 1956. This invention revolutionized data storage by enabling random access to information."),
            zh = LocalizedContent("谁发明了硬盘？", listOf("IBM", "希捷", "西部数据", "迈拓"), "科技", "IBM于1956年推出了第一个硬盘驱动器RAMAC 305。这项发明通过实现对信息的随机访问，彻底改变了数据存储。"),
            es = LocalizedContent("¿Quién inventó el disco duro?", listOf("IBM", "Seagate", "Western Digital", "Maxtor"), "Tecnología", "IBM presentó el primer disco duro, el RAMAC 305, en 1956. Esta invención revolucionó el almacenamiento de datos al permitir el acceso aleatorio a la información.")
        ),
        BilingualQuestion(
            id = 11165, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année le disque dur a-t-il été inventé?", listOf("1956", "1952", "1960", "1964"), "Technologie", "Le premier disque dur, le IBM 350 RAMAC, a été inventé en 1956 par IBM. Il stockait 5 Mo de données sur 50 plateaux de 24 pouces."),
            en = LocalizedContent("In what year was the hard disk drive invented?", listOf("1956", "1952", "1960", "1964"), "Technology", "The first hard disk drive, the IBM 350 RAMAC, was invented in 1956 by IBM. It stored 5 MB of data on 50 24-inch platters."),
            zh = LocalizedContent("硬盘是哪一年发明的？", listOf("1956", "1952", "1960", "1964"), "科技", "第一个硬盘驱动器IBM 350 RAMAC于1956年由IBM发明。它在50个24英寸的盘片上存储了5 MB数据。"),
            es = LocalizedContent("¿En qué año se inventó el disco duro?", listOf("1956", "1952", "1960", "1964"), "Tecnología", "El primer disco duro, el IBM 350 RAMAC, fue inventado en 1956 por IBM. Almacenaba 5 MB de datos en 50 platos de 24 pulgadas.")
        ),
        BilingualQuestion(
            id = 11166, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a inventé le laser?", listOf("Theodore Maiman", "Charles H. Townes", "Gordon Gould", "Albert Einstein"), "Technologie", "Theodore Maiman a construit le premier laser fonctionnel en 1960 au laboratoire Hughes Research, utilisant un cristal de rubis synthétique."),
            en = LocalizedContent("Who invented the laser?", listOf("Theodore Maiman", "Charles H. Townes", "Gordon Gould", "Albert Einstein"), "Technology", "Theodore Maiman built the first functional laser in 1960 at Hughes Research Laboratory, using a synthetic ruby crystal."),
            zh = LocalizedContent("谁发明了激光？", listOf("西奥多·梅曼", "查尔斯·H·汤斯", "戈登·古尔德", "阿尔伯特·爱因斯坦"), "科技", "西奥多·梅曼于1960年在休斯研究实验室制造了第一个功能性激光器，使用了合成红宝石晶体。"),
            es = LocalizedContent("¿Quién inventó el láser?", listOf("Theodore Maiman", "Charles H. Townes", "Gordon Gould", "Albert Einstein"), "Tecnología", "Theodore Maiman construyó el primer láser funcional en 1960 en el Laboratorio de Investigación Hughes, utilizando un cristal de rubí sintético.")
        ),
        BilingualQuestion(
            id = 11167, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année le laser a-t-il été inventé?", listOf("1960", "1956", "1964", "1968"), "Technologie", "Le premier laser fonctionnel a été créé en 1960 par Theodore Maiman, utilisant un cristal de rubis synthétique. Cette invention a marqué le début d'une nouvelle ère dans les technologies optiques."),
            en = LocalizedContent("In what year was the laser invented?", listOf("1960", "1956", "1964", "1968"), "Technology", "The first functional laser was created in 1960 by Theodore Maiman, using a synthetic ruby crystal. This invention marked the beginning of a new era in optical technologies."),
            zh = LocalizedContent("激光是哪一年发明的？", listOf("1960", "1956", "1964", "1968"), "科技", "第一个功能性激光器于1960年由西奥多·梅曼使用合成红宝石晶体创造。这项发明标志着光学技术新时代的开始。"),
            es = LocalizedContent("¿En qué año se inventó el láser?", listOf("1960", "1956", "1964", "1968"), "Tecnología", "El primer láser funcional fue creado en 1960 por Theodore Maiman, utilizando un cristal de rubí sintético. Este invento marcó el comienzo de una nueva era en las tecnologías ópticas.")
        ),
        BilingualQuestion(
            id = 11168, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a inventé les codes-barres?", listOf("Bernard Silver et Norman Joseph Woodland", "Nikola Tesla", "Thomas Edison", "Alexander Graham Bell"), "Technologie", "Bernard Silver et Norman Joseph Woodland ont breveté le premier code-barres en 1952, inspiré par le code Morse, pour automatiser la lecture des produits en magasin."),
            en = LocalizedContent("Who invented barcodes?", listOf("Bernard Silver and Norman Joseph Woodland", "Nikola Tesla", "Thomas Edison", "Alexander Graham Bell"), "Technology", "Bernard Silver and Norman Joseph Woodland patented the first barcode in 1952, inspired by Morse code, to automate product reading in stores."),
            zh = LocalizedContent("谁发明了条形码？", listOf("伯纳德·西尔弗和诺曼·约瑟夫·伍德兰", "尼古拉·特斯拉", "托马斯·爱迪生", "亚历山大·格雷厄姆·贝尔"), "科技", "伯纳德·西尔弗和诺曼·约瑟夫·伍德兰于1952年获得了第一个条形码的专利，灵感来自摩尔斯电码，用于自动化商店中的产品读取。"),
            es = LocalizedContent("¿Quién inventó los códigos de barras?", listOf("Bernard Silver y Norman Joseph Woodland", "Nikola Tesla", "Thomas Edison", "Alexander Graham Bell"), "Tecnología", "Bernard Silver y Norman Joseph Woodland patentaron el primer código de barras en 1952, inspirado en el código Morse, para automatizar la lectura de productos en tiendas.")
        ),
        BilingualQuestion(
            id = 11169, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année les codes-barres ont-ils été inventés?", listOf("1952", "1948", "1956", "1960"), "Technologie", "Les codes-barres ont été inventés en 1952 par Norman Woodland et Bernard Silver, qui ont déposé un brevet pour un système de lecture optique de motifs linéaires."),
            en = LocalizedContent("In what year were barcodes invented?", listOf("1952", "1948", "1956", "1960"), "Technology", "Barcodes were invented in 1952 by Norman Woodland and Bernard Silver, who filed a patent for an optical reading system of linear patterns."),
            zh = LocalizedContent("条形码是哪一年发明的？", listOf("1952", "1948", "1956", "1960"), "科技", "条形码于1952年由诺曼·伍德兰和伯纳德·西尔弗发明，他们为一种线性图案的光学读取系统申请了专利。"),
            es = LocalizedContent("¿En qué año se inventaron los códigos de barras?", listOf("1952", "1948", "1956", "1960"), "Tecnología", "Los códigos de barras fueron inventados en 1952 por Norman Woodland y Bernard Silver, quienes presentaron una patente para un sistema de lectura óptica de patrones lineales.")
        ),
    )

    private fun part4(): List<BilingualQuestion> = listOf(
        BilingualQuestion(
            id = 11170, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a inventé la fibre optique?", listOf("Charles K. Kao", "John Tyndall", "Alexander Graham Bell", "Guglielmo Marconi"), "Technologie", "Charles K. Kao a posé les bases théoriques de la transmission de la lumière par fibres de verre dans les années 1960, ce qui lui a valu le prix Nobel de physique en 2009."),
            en = LocalizedContent("Who invented optical fiber?", listOf("Charles K. Kao", "John Tyndall", "Alexander Graham Bell", "Guglielmo Marconi"), "Technology", "Charles K. Kao laid the theoretical foundations for light transmission through glass fibers in the 1960s, earning him the Nobel Prize in Physics in 2009."),
            zh = LocalizedContent("谁发明了光纤？", listOf("高锟", "约翰·丁达尔", "亚历山大·格拉汉姆·贝尔", "古列尔莫·马可尼"), "科技", "高锟在20世纪60年代奠定了通过玻璃纤维传输光的理论基础，并于2009年获得诺贝尔物理学奖。"),
            es = LocalizedContent("¿Quién inventó la fibra óptica?", listOf("Charles K. Kao", "John Tyndall", "Alexander Graham Bell", "Guglielmo Marconi"), "Tecnología", "Charles K. Kao sentó las bases teóricas para la transmisión de luz a través de fibras de vidrio en la década de 1960, lo que le valió el Premio Nobel de Física en 2009.")
        ),
        BilingualQuestion(
            id = 11171, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année la fibre optique a-t-elle été inventée?", listOf("1966", "1962", "1970", "1974"), "Technologie", "La fibre optique a été inventée en 1966 par les physiciens Charles Kao et George Hockham, qui ont démontré qu'elle pouvait transmettre la lumière sur de longues distances."),
            en = LocalizedContent("In what year was optical fiber invented?", listOf("1966", "1962", "1970", "1974"), "Technology", "Optical fiber was invented in 1966 by physicists Charles Kao and George Hockham, who demonstrated that it could transmit light over long distances."),
            zh = LocalizedContent("光纤是哪一年发明的？", listOf("1966", "1962", "1970", "1974"), "科技", "光纤由物理学家高锟和乔治·霍克汉姆于1966年发明，他们证明了光纤可以长距离传输光。"),
            es = LocalizedContent("¿En qué año se inventó la fibra óptica?", listOf("1966", "1962", "1970", "1974"), "Tecnología", "La fibra óptica fue inventada en 1966 por los físicos Charles Kao y George Hockham, quienes demostraron que podía transmitir luz a largas distancias.")
        ),
        BilingualQuestion(
            id = 11172, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a inventé le WiFi?", listOf("IEEE 802.11", "Nikola Tesla", "Thomas Edison", "Alexander Graham Bell"), "Technologie", "Le Wi-Fi est basé sur la norme IEEE 802.11, développée par l'Institute of Electrical and Electronics Engineers (IEEE). Aucun inventeur unique n'est à l'origine du Wi-Fi, mais un comité de l'IEEE a standardisé cette technologie en 1997."),
            en = LocalizedContent("Who invented WiFi?", listOf("IEEE 802.11", "Nikola Tesla", "Thomas Edison", "Alexander Graham Bell"), "Technology", "WiFi is based on the IEEE 802.11 standard, developed by the Institute of Electrical and Electronics Engineers (IEEE). No single inventor is credited, but an IEEE committee standardized the technology in 1997."),
            zh = LocalizedContent("谁发明了WiFi？", listOf("IEEE 802.11", "尼古拉·特斯拉", "托马斯·爱迪生", "亚历山大·格拉汉姆·贝尔"), "科技", "WiFi基于IEEE 802.11标准，由电气和电子工程师协会（IEEE）开发。没有单一的发明者，但IEEE的一个委员会在1997年将该技术标准化。"),
            es = LocalizedContent("¿Quién inventó el WiFi?", listOf("IEEE 802.11", "Nikola Tesla", "Thomas Edison", "Alexander Graham Bell"), "Tecnología", "El WiFi se basa en el estándar IEEE 802.11, desarrollado por el Instituto de Ingenieros Eléctricos y Electrónicos (IEEE). No hay un único inventor, sino que un comité del IEEE estandarizó la tecnología en 1997.")
        ),
        BilingualQuestion(
            id = 11173, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année le WiFi a-t-il été inventé?", listOf("1997", "1993", "2001", "2005"), "Technologie", "Le protocole WiFi a été standardisé en 1997 par l'IEEE sous la norme 802.11, permettant les premières communications sans fil locales."),
            en = LocalizedContent("In what year was WiFi invented?", listOf("1997", "1993", "2001", "2005"), "Technology", "The WiFi protocol was standardized in 1997 by the IEEE under the 802.11 standard, enabling the first local wireless communications."),
            zh = LocalizedContent("WiFi是哪一年发明的？", listOf("1997", "1993", "2001", "2005"), "科技", "WiFi协议于1997年由IEEE以802.11标准标准化，实现了首次本地无线通信。"),
            es = LocalizedContent("¿En qué año se inventó el WiFi?", listOf("1997", "1993", "2001", "2005"), "Tecnología", "El protocolo WiFi fue estandarizado en 1997 por el IEEE bajo el estándar 802.11, permitiendo las primeras comunicaciones inalámbricas locales.")
        ),
        BilingualQuestion(
            id = 11174, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a inventé le Bluetooth?", listOf("Jaap Haartsen", "Nikola Tesla", "Thomas Edison", "Alexander Graham Bell"), "Technologie", "Jaap Haartsen, ingénieur chez Ericsson, a développé la technologie Bluetooth en 1994 pour remplacer les câbles entre appareils."),
            en = LocalizedContent("Who invented Bluetooth?", listOf("Jaap Haartsen", "Nikola Tesla", "Thomas Edison", "Alexander Graham Bell"), "Technology", "Jaap Haartsen, an engineer at Ericsson, developed Bluetooth technology in 1994 to replace cables between devices."),
            zh = LocalizedContent("谁发明了蓝牙？", listOf("雅普·哈特森", "尼古拉·特斯拉", "托马斯·爱迪生", "亚历山大·格拉汉姆·贝尔"), "科技", "雅普·哈特森，爱立信公司的工程师，于1994年开发了蓝牙技术，用于替代设备之间的电缆。"),
            es = LocalizedContent("¿Quién inventó el Bluetooth?", listOf("Jaap Haartsen", "Nikola Tesla", "Thomas Edison", "Alexander Graham Bell"), "Tecnología", "Jaap Haartsen, ingeniero de Ericsson, desarrolló la tecnología Bluetooth en 1994 para reemplazar los cables entre dispositivos.")
        ),
        BilingualQuestion(
            id = 11175, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année le Bluetooth a-t-il été inventé?", listOf("1994", "1990", "1998", "2002"), "Technologie", "Le Bluetooth a été développé en 1994 par Ericsson, une entreprise suédoise de télécommunications, sous la direction de l'ingénieur Jaap Haartsen."),
            en = LocalizedContent("In what year was Bluetooth invented?", listOf("1994", "1990", "1998", "2002"), "Technology", "Bluetooth was developed in 1994 by Ericsson, a Swedish telecommunications company, under the leadership of engineer Jaap Haartsen."),
            zh = LocalizedContent("蓝牙是哪一年发明的？", listOf("1994", "1990", "1998", "2002"), "科技", "蓝牙由瑞典电信公司爱立信于1994年开发，由工程师雅普·哈特森领导。"),
            es = LocalizedContent("¿En qué año se inventó el Bluetooth?", listOf("1994", "1990", "1998", "2002"), "Tecnología", "El Bluetooth fue desarrollado en 1994 por Ericsson, una empresa sueca de telecomunicaciones, bajo la dirección del ingeniero Jaap Haartsen.")
        ),
        BilingualQuestion(
            id = 11176, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a inventé le GPS?", listOf("Ivan Getting et Robert Easton", "Nikola Tesla", "Thomas Edison", "Alexander Graham Bell"), "Technologie", "Ivan Getting a conçu le concept du GPS pour le département de la Défense américain, tandis que Robert Easton a développé le système de satellites Timation, posant les bases techniques du réseau."),
            en = LocalizedContent("Who invented GPS?", listOf("Ivan Getting and Robert Easton", "Nikola Tesla", "Thomas Edison", "Alexander Graham Bell"), "Technology", "Ivan Getting conceived the GPS concept for the US Department of Defense, while Robert Easton developed the Timation satellite system, laying the technical groundwork for the network."),
            zh = LocalizedContent("谁发明了GPS？", listOf("伊万·盖廷和罗伯特·伊斯顿", "尼古拉·特斯拉", "托马斯·爱迪生", "亚历山大·格拉汉姆·贝尔"), "科技", "伊万·盖廷为美国国防部构思了GPS概念，而罗伯特·伊斯顿开发了Timation卫星系统，为网络奠定了技术基础。"),
            es = LocalizedContent("¿Quién inventó el GPS?", listOf("Ivan Getting y Robert Easton", "Nikola Tesla", "Thomas Edison", "Alexander Graham Bell"), "Tecnología", "Ivan Getting concibió el concepto del GPS para el Departamento de Defensa de EE. UU., mientras que Robert Easton desarrolló el sistema de satélites Timation, sentando las bases técnicas de la red.")
        ),
        BilingualQuestion(
            id = 11177, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année le GPS a-t-il été inventé?", listOf("1973", "1969", "1977", "1981"), "Technologie", "Le système GPS a été développé par le département de la Défense américain, et le premier satellite expérimental a été lancé en 1978, mais le projet a officiellement débuté en 1973."),
            en = LocalizedContent("In what year was GPS invented?", listOf("1973", "1969", "1977", "1981"), "Technology", "The GPS system was developed by the US Department of Defense, and the first experimental satellite was launched in 1978, but the project officially began in 1973."),
            zh = LocalizedContent("GPS是哪一年发明的？", listOf("1973", "1969", "1977", "1981"), "科技", "GPS系统由美国国防部开发，第一颗实验卫星于1978年发射，但项目正式始于1973年。"),
            es = LocalizedContent("¿En qué año se inventó el GPS?", listOf("1973", "1969", "1977", "1981"), "Tecnología", "El sistema GPS fue desarrollado por el Departamento de Defensa de EE. UU., y el primer satélite experimental se lanzó en 1978, pero el proyecto comenzó oficialmente en 1973.")
        ),
        BilingualQuestion(
            id = 11178, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a inventé la batterie au lithium?", listOf("John Goodenough", "Stanley Whittingham", "Akira Yoshino", "Nikola Tesla"), "Technologie", "John Goodenough a inventé la batterie lithium-ion dans les années 1980, révolutionnant le stockage d'énergie portable."),
            en = LocalizedContent("Who invented the lithium battery?", listOf("John Goodenough", "Stanley Whittingham", "Akira Yoshino", "Nikola Tesla"), "Technology", "John Goodenough invented the lithium-ion battery in the 1980s, revolutionizing portable energy storage."),
            zh = LocalizedContent("谁发明了锂电池？", listOf("约翰·古迪纳夫", "斯坦利·惠廷厄姆", "吉野彰", "尼古拉·特斯拉"), "科技", "约翰·古迪纳夫在20世纪80年代发明了锂离子电池，彻底改变了便携式能量存储。"),
            es = LocalizedContent("¿Quién inventó la batería de litio?", listOf("John Goodenough", "Stanley Whittingham", "Akira Yoshino", "Nikola Tesla"), "Tecnología", "John Goodenough inventó la batería de iones de litio en la década de 1980, revolucionando el almacenamiento de energía portátil.")
        ),
        BilingualQuestion(
            id = 11179, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année la batterie au lithium a-t-elle été inventée?", listOf("1991", "1987", "1995", "1999"), "Technologie", "La batterie lithium-ion a été commercialisée pour la première fois par Sony en 1991, marquant une révolution dans le stockage d'énergie portable."),
            en = LocalizedContent("In what year was the lithium battery invented?", listOf("1991", "1987", "1995", "1999"), "Technology", "The lithium-ion battery was first commercialized by Sony in 1991, marking a revolution in portable energy storage."),
            zh = LocalizedContent("锂电池是哪一年发明的？", listOf("1991", "1987", "1995", "1999"), "科技", "锂离子电池于1991年由索尼首次商业化，标志着便携式能量存储的革命。"),
            es = LocalizedContent("¿En qué año se inventó la batería de litio?", listOf("1991", "1987", "1995", "1999"), "Tecnología", "La batería de iones de litio fue comercializada por primera vez por Sony en 1991, marcando una revolución en el almacenamiento de energía portátil.")
        ),
        BilingualQuestion(
            id = 11180, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Qui a inventé le capteur de puissance?", listOf("Image Sensor Foundation", "Nikola Tesla", "Thomas Edison", "Alexander Graham Bell"), "Technologie", "L'Image Sensor Foundation est un consortium industriel qui a standardisé le capteur de puissance, notamment dans le domaine des appareils photo numériques."),
            en = LocalizedContent("Who invented the power sensor?", listOf("Image Sensor Foundation", "Nikola Tesla", "Thomas Edison", "Alexander Graham Bell"), "Technology", "The Image Sensor Foundation is an industry consortium that standardized the power sensor, particularly in the field of digital cameras."),
            zh = LocalizedContent("谁发明了功率传感器？", listOf("图像传感器基金会", "尼古拉·特斯拉", "托马斯·爱迪生", "亚历山大·格拉汉姆·贝尔"), "科技", "图像传感器基金会是一个行业联盟，它标准化了功率传感器，特别是在数码相机领域。"),
            es = LocalizedContent("¿Quién inventó el sensor de potencia?", listOf("Image Sensor Foundation", "Nikola Tesla", "Thomas Edison", "Alexander Graham Bell"), "Tecnología", "Image Sensor Foundation es un consorcio industrial que estandarizó el sensor de potencia, especialmente en el ámbito de las cámaras digitales.")
        ),
        BilingualQuestion(
            id = 11181, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("En quelle année le capteur CMOS a-t-il été inventé?", listOf("1993", "1989", "1997", "2001"), "Technologie", "Le capteur CMOS a été inventé en 1993 par Eric Fossum au Jet Propulsion Laboratory de la NASA. Cette technologie a révolutionné l'imagerie numérique en offrant une consommation d'énergie plus faible que les capteurs CCD."),
            en = LocalizedContent("In what year was the CMOS sensor invented?", listOf("1993", "1989", "1997", "2001"), "Technology", "The CMOS sensor was invented in 1993 by Eric Fossum at NASA's Jet Propulsion Laboratory. This technology revolutionized digital imaging by offering lower power consumption than CCD sensors."),
            zh = LocalizedContent("CMOS传感器是哪一年发明的？", listOf("1993", "1989", "1997", "2001"), "科技", "CMOS传感器于1993年由NASA喷气推进实验室的埃里克·福萨姆发明。这项技术通过提供比CCD传感器更低的功耗，彻底改变了数字成像。"),
            es = LocalizedContent("¿En qué año se inventó el sensor CMOS?", listOf("1993", "1989", "1997", "2001"), "Tecnología", "El sensor CMOS fue inventado en 1993 por Eric Fossum en el Laboratorio de Propulsión a Chorro de la NASA. Esta tecnología revolucionó la imagen digital al ofrecer un menor consumo de energía que los sensores CCD.")
        ),
        BilingualQuestion(
            id = 11182, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le premier satellite artificiel lancé dans l'espace?", listOf("Spoutnik 1", "Explorer 1", "Spoutnik 2", "Youri Gagarine"), "Technologie", "Spoutnik 1, lancé par l'Union soviétique le 4 octobre 1957, fut le premier satellite artificiel à orbiter autour de la Terre."),
            en = LocalizedContent("What was the first artificial satellite launched into space?", listOf("Sputnik 1", "Explorer 1", "Sputnik 2", "Yuri Gagarin"), "Technology", "Sputnik 1, launched by the Soviet Union on October 4, 1957, was the first artificial satellite to orbit the Earth."),
            zh = LocalizedContent("第一颗发射到太空的人造卫星是什么？", listOf("斯普特尼克1号", "探索者1号", "斯普特尼克2号", "尤里·加加林"), "科技", "斯普特尼克1号由苏联于1957年10月4日发射，是第一颗绕地球轨道运行的人造卫星。"),
            es = LocalizedContent("¿Cuál fue el primer satélite artificial lanzado al espacio?", listOf("Sputnik 1", "Explorer 1", "Sputnik 2", "Yuri Gagarin"), "Tecnología", "El Sputnik 1, lanzado por la Unión Soviética el 4 de octubre de 1957, fue el primer satélite artificial en orbitar la Tierra.")
        ),
        BilingualQuestion(
            id = 11183, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année le premier satellite a-t-il été lancé?", listOf("1957", "1955", "1959", "1961"), "Technologie", "Le premier satellite artificiel, Spoutnik 1, a été lancé par l'Union soviétique le 4 octobre 1957, marquant le début de l'ère spatiale."),
            en = LocalizedContent("In what year was the first satellite launched?", listOf("1957", "1955", "1959", "1961"), "Technology", "The first artificial satellite, Sputnik 1, was launched by the Soviet Union on October 4, 1957, marking the beginning of the space age."),
            zh = LocalizedContent("第一颗卫星是哪一年发射的？", listOf("1957", "1955", "1959", "1961"), "科技", "第一颗人造卫星斯普特尼克1号由苏联于1957年10月4日发射，标志着太空时代的开始。"),
            es = LocalizedContent("¿En qué año se lanzó el primer satélite?", listOf("1957", "1955", "1959", "1961"), "Tecnología", "El primer satélite artificial, el Sputnik 1, fue lanzado por la Unión Soviética el 4 de octubre de 1957, marcando el inicio de la era espacial.")
        ),
        BilingualQuestion(
            id = 11184, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui a été le premier homme dans l'espace?", listOf("Youri Gagarine", "Alan Shepard", "John Glenn", "Buzz Aldrin"), "Technologie", "Le cosmonaute soviétique Youri Gagarine a effectué le premier vol spatial habité le 12 avril 1961 à bord de Vostok 1."),
            en = LocalizedContent("Who was the first man in space?", listOf("Yuri Gagarin", "Alan Shepard", "John Glenn", "Buzz Aldrin"), "Technology", "Soviet cosmonaut Yuri Gagarin made the first human spaceflight on April 12, 1961 aboard Vostok 1."),
            zh = LocalizedContent("谁是第一个进入太空的人？", listOf("尤里·加加林", "艾伦·谢泼德", "约翰·格伦", "巴兹·奥尔德林"), "科技", "苏联宇航员尤里·加加林于1961年4月12日乘坐东方1号飞船完成了首次载人太空飞行。"),
            es = LocalizedContent("¿Quién fue el primer hombre en el espacio?", listOf("Yuri Gagarin", "Alan Shepard", "John Glenn", "Buzz Aldrin"), "Tecnología", "El cosmonauta soviético Yuri Gagarin realizó el primer vuelo espacial tripulado el 12 de abril de 1961 a bordo del Vostok 1.")
        ),
        BilingualQuestion(
            id = 11185, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année le premier vol humain spatial a-t-il eu lieu?", listOf("1961", "1959", "1963", "1965"), "Technologie", "Le premier vol spatial habité a été réalisé par le cosmonaute soviétique Youri Gagarine le 12 avril 1961, à bord du vaisseau Vostok 1."),
            en = LocalizedContent("In what year did the first human spaceflight take place?", listOf("1961", "1959", "1963", "1965"), "Technology", "The first human spaceflight was accomplished by Soviet cosmonaut Yuri Gagarin on April 12, 1961, aboard the Vostok 1 spacecraft."),
            zh = LocalizedContent("第一次载人太空飞行发生在哪一年？", listOf("1961", "1959", "1963", "1965"), "科技", "第一次载人太空飞行由苏联宇航员尤里·加加林于1961年4月12日乘坐东方1号飞船完成。"),
            es = LocalizedContent("¿En qué año tuvo lugar el primer vuelo espacial tripulado?", listOf("1961", "1959", "1963", "1965"), "Tecnología", "El primer vuelo espacial tripulado fue realizado por el cosmonauta soviético Yuri Gagarin el 12 de abril de 1961, a bordo de la nave Vostok 1.")
        ),
        BilingualQuestion(
            id = 11186, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui a été le premier homme sur la Lune?", listOf("Neil Armstrong", "Buzz Aldrin", "Michael Collins", "Alan Bean"), "Technologie", "Neil Armstrong a été le premier humain à marcher sur la Lune le 20 juillet 1969, lors de la mission Apollo 11 de la NASA."),
            en = LocalizedContent("Who was the first man on the Moon?", listOf("Neil Armstrong", "Buzz Aldrin", "Michael Collins", "Alan Bean"), "Technology", "Neil Armstrong was the first human to walk on the Moon on July 20, 1969, during NASA's Apollo 11 mission."),
            zh = LocalizedContent("谁是第一个登上月球的人？", listOf("尼尔·阿姆斯特朗", "巴兹·奥尔德林", "迈克尔·柯林斯", "艾伦·比恩"), "科技", "尼尔·阿姆斯特朗于1969年7月20日在NASA的阿波罗11号任务中成为第一个在月球上行走的人。"),
            es = LocalizedContent("¿Quién fue el primer hombre en la Luna?", listOf("Neil Armstrong", "Buzz Aldrin", "Michael Collins", "Alan Bean"), "Tecnología", "Neil Armstrong fue el primer ser humano en caminar sobre la Luna el 20 de julio de 1969, durante la misión Apolo 11 de la NASA.")
        ),
        BilingualQuestion(
            id = 11187, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("En quelle année l'homme a-t-il marché sur la Lune pour la première fois?", listOf("1969", "1967", "1971", "1973"), "Technologie", "La mission Apollo 11 de la NASA a permis aux astronautes Neil Armstrong et Buzz Aldrin de poser le pied sur la Lune le 20 juillet 1969."),
            en = LocalizedContent("In what year did man first walk on the Moon?", listOf("1969", "1967", "1971", "1973"), "Technology", "NASA's Apollo 11 mission allowed astronauts Neil Armstrong and Buzz Aldrin to set foot on the Moon on July 20, 1969."),
            zh = LocalizedContent("人类首次登上月球是哪一年？", listOf("1969", "1967", "1971", "1973"), "科技", "NASA的阿波罗11号任务使宇航员尼尔·阿姆斯特朗和巴兹·奥尔德林于1969年7月20日踏上月球。"),
            es = LocalizedContent("¿En qué año el hombre pisó la Luna por primera vez?", listOf("1969", "1967", "1971", "1973"), "Tecnología", "La misión Apolo 11 de la NASA permitió a los astronautas Neil Armstrong y Buzz Aldrin pisar la Luna el 20 de julio de 1969.")
        ),
        BilingualQuestion(
            id = 11188, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel était le nom du premier télescope spatial?", listOf("Hubble", "Spitzer", "Kepler", "TESS"), "Technologie", "Le télescope spatial Hubble, lancé en 1990, est souvent considéré comme le premier grand observatoire spatial, bien que d'autres télescopes plus petits l'aient précédé."),
            en = LocalizedContent("What was the name of the first space telescope?", listOf("Hubble", "Spitzer", "Kepler", "TESS"), "Technology", "The Hubble Space Telescope, launched in 1990, is often considered the first major space observatory, although smaller telescopes preceded it."),
            zh = LocalizedContent("第一个太空望远镜叫什么名字？", listOf("哈勃", "斯皮策", "开普勒", "TESS"), "科技", "哈勃太空望远镜于1990年发射，通常被认为是第一个大型太空天文台，尽管之前有更小的望远镜。"),
            es = LocalizedContent("¿Cuál fue el nombre del primer telescopio espacial?", listOf("Hubble", "Spitzer", "Kepler", "TESS"), "Tecnología", "El telescopio espacial Hubble, lanzado en 1990, a menudo se considera el primer gran observatorio espacial, aunque telescopios más pequeños lo precedieron.")
        ),
        BilingualQuestion(
            id = 11189, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année le télescope Hubble a-t-il été lancé?", listOf("1990", "1988", "1992", "1994"), "Technologie", "Le télescope spatial Hubble a été mis en orbite le 24 avril 1990 par la navette spatiale Discovery. Il a révolutionné l'astronomie en fournissant des images d'une clarté inédite depuis l'espace."),
            en = LocalizedContent("In what year was the Hubble telescope launched?", listOf("1990", "1988", "1992", "1994"), "Technology", "The Hubble Space Telescope was placed into orbit on April 24, 1990 by the Space Shuttle Discovery. It revolutionized astronomy by providing unprecedented clarity from space."),
            zh = LocalizedContent("哈勃望远镜是哪一年发射的？", listOf("1990", "1988", "1992", "1994"), "科技", "哈勃太空望远镜于1990年4月24日由发现号航天飞机送入轨道。它通过从太空提供前所未有的清晰图像，彻底改变了天文学。"),
            es = LocalizedContent("¿En qué año se lanzó el telescopio Hubble?", listOf("1990", "1988", "1992", "1994"), "Tecnología", "El telescopio espacial Hubble fue puesto en órbita el 24 de abril de 1990 por el transbordador espacial Discovery. Revolucionó la astronomía al proporcionar imágenes de una claridad sin precedentes desde el espacio.")
        ),
        BilingualQuestion(
            id = 11190, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel programme spatial a envoyé des hommes sur la Lune?", listOf("Apollo", "Gemini", "Mercury", "Skylab"), "Technologie", "Le programme Apollo de la NASA a réalisé six alunissages habités entre 1969 et 1972, Apollo 11 étant la première mission à poser des hommes sur la Lune."),
            en = LocalizedContent("Which space program sent humans to the Moon?", listOf("Apollo", "Gemini", "Mercury", "Skylab"), "Technology", "NASA's Apollo program achieved six manned lunar landings between 1969 and 1972, with Apollo 11 being the first mission to land humans on the Moon."),
            zh = LocalizedContent("哪个太空计划将人类送上了月球？", listOf("阿波罗", "双子座", "水星", "天空实验室"), "科技", "美国宇航局的阿波罗计划在1969年至1972年间实现了六次载人登月，阿波罗11号是首次将人类送上月球的任务。"),
            es = LocalizedContent("¿Qué programa espacial envió hombres a la Luna?", listOf("Apolo", "Géminis", "Mercurio", "Skylab"), "Tecnología", "El programa Apolo de la NASA logró seis alunizajes tripulados entre 1969 y 1972, siendo Apolo 11 la primera misión en posar humanos en la Luna.")
        ),
        BilingualQuestion(
            id = 11191, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année la Station spatiale internationale a-t-elle été lancée?", listOf("1998", "1996", "2000", "2002"), "Technologie", "Le premier module de la Station spatiale internationale, Zarya, a été lancé en 1998, marquant le début de la construction en orbite de ce laboratoire international."),
            en = LocalizedContent("In what year was the International Space Station launched?", listOf("1998", "1996", "2000", "2002"), "Technology", "The first module of the International Space Station, Zarya, was launched in 1998, marking the beginning of the orbital construction of this international laboratory."),
            zh = LocalizedContent("国际空间站是哪一年发射的？", listOf("1998", "1996", "2000", "2002"), "科技", "国际空间站的第一个模块“曙光号”于1998年发射，标志着这个国际实验室在轨建设的开始。"),
            es = LocalizedContent("¿En qué año se lanzó la Estación Espacial Internacional?", listOf("1998", "1996", "2000", "2002"), "Tecnología", "El primer módulo de la Estación Espacial Internacional, Zarya, fue lanzado en 1998, marcando el inicio de la construcción en órbita de este laboratorio internacional.")
        ),
        BilingualQuestion(
            id = 11192, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand observatoire astronomique du monde?", listOf("Mauna Kea", "Paranal", "La Silla", "Greenwich"), "Technologie", "Le Mauna Kea, à Hawaï, abrite plusieurs télescopes majeurs à son sommet, à plus de 4 200 mètres d'altitude, offrant des conditions d'observation optimales grâce à la faible pollution lumineuse et à l'atmosphère stable."),
            en = LocalizedContent("What is the largest astronomical observatory in the world?", listOf("Mauna Kea", "Paranal", "La Silla", "Greenwich"), "Technology", "Mauna Kea in Hawaii hosts several major telescopes at its summit, over 4,200 meters high, offering optimal observation conditions due to low light pollution and stable atmosphere."),
            zh = LocalizedContent("世界上最大的天文台是什么？", listOf("莫纳克亚山", "帕瑞纳", "拉西拉", "格林威治"), "科技", "夏威夷的莫纳克亚山山顶海拔超过4200米，拥有多个大型望远镜，由于低光污染和稳定的大气条件，提供了最佳的观测环境。"),
            es = LocalizedContent("¿Cuál es el observatorio astronómico más grande del mundo?", listOf("Mauna Kea", "Paranal", "La Silla", "Greenwich"), "Tecnología", "Mauna Kea en Hawái alberga varios telescopios importantes en su cumbre, a más de 4.200 metros de altitud, ofreciendo condiciones óptimas de observación gracias a la baja contaminación lumínica y la atmósfera estable.")
        ),
        BilingualQuestion(
            id = 11193, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année Perseverance a-t-il été lancé vers Mars?", listOf("2020", "2018", "2022", "2024"), "Technologie", "Le rover Perseverance a été lancé le 30 juillet 2020 dans le cadre de la mission Mars 2020 de la NASA."),
            en = LocalizedContent("In what year was Perseverance launched to Mars?", listOf("2020", "2018", "2022", "2024"), "Technology", "The Perseverance rover was launched on July 30, 2020, as part of NASA's Mars 2020 mission."),
            zh = LocalizedContent("毅力号是哪一年发射前往火星的？", listOf("2020", "2018", "2022", "2024"), "科技", "毅力号火星车于2020年7月30日作为美国宇航局火星2020任务的一部分发射。"),
            es = LocalizedContent("¿En qué año se lanzó Perseverance hacia Marte?", listOf("2020", "2018", "2022", "2024"), "Tecnología", "El rover Perseverance fue lanzado el 30 de julio de 2020 como parte de la misión Mars 2020 de la NASA.")
        ),
        BilingualQuestion(
            id = 11194, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a créé le premier rover lunaire?", listOf("NASA", "Agence spatiale russe", "Agence spatiale chinoise", "ESA"), "Technologie", "Le premier rover lunaire, le Lunokhod 1, a été créé par l'Union soviétique en 1970, mais la NASA a développé le rover lunaire habité utilisé lors des missions Apollo 15, 16 et 17."),
            en = LocalizedContent("Who created the first lunar rover?", listOf("NASA", "Russian Space Agency", "Chinese Space Agency", "ESA"), "Technology", "The first lunar rover, Lunokhod 1, was created by the Soviet Union in 1970, but NASA developed the manned lunar rover used during Apollo missions 15, 16, and 17."),
            zh = LocalizedContent("谁制造了第一辆月球车？", listOf("美国宇航局", "俄罗斯航天局", "中国航天局", "欧洲航天局"), "科技", "第一辆月球车“月球车1号”由苏联于1970年制造，但美国宇航局开发了阿波罗15、16和17号任务中使用的载人月球车。"),
            es = LocalizedContent("¿Quién creó el primer rover lunar?", listOf("NASA", "Agencia Espacial Rusa", "Agencia Espacial China", "ESA"), "Tecnología", "El primer rover lunar, Lunokhod 1, fue creado por la Unión Soviética en 1970, pero la NASA desarrolló el rover lunar tripulado utilizado en las misiones Apolo 15, 16 y 17.")
        ),
        BilingualQuestion(
            id = 11195, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année le rover Curiosity a-t-il débarqué sur Mars?", listOf("2012", "2010", "2014", "2016"), "Technologie", "Le rover Curiosity a atterri sur Mars le 6 août 2012 dans le cadre de la mission Mars Science Laboratory de la NASA."),
            en = LocalizedContent("In what year did the Curiosity rover land on Mars?", listOf("2012", "2010", "2014", "2016"), "Technology", "The Curiosity rover landed on Mars on August 6, 2012, as part of NASA's Mars Science Laboratory mission."),
            zh = LocalizedContent("好奇号火星车是哪一年在火星着陆的？", listOf("2012", "2010", "2014", "2016"), "科技", "好奇号火星车于2012年8月6日作为美国宇航局火星科学实验室任务的一部分在火星着陆。"),
            es = LocalizedContent("¿En qué año aterrizó el rover Curiosity en Marte?", listOf("2012", "2010", "2014", "2016"), "Tecnología", "El rover Curiosity aterrizó en Marte el 6 de agosto de 2012 como parte de la misión Mars Science Laboratory de la NASA.")
        ),
        BilingualQuestion(
            id = 11196, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand télescope spatial actuel?", listOf("James Webb", "Hubble", "Spitzer", "Kepler"), "Technologie", "Le télescope spatial James Webb, lancé en 2021, est le plus grand jamais déployé dans l'espace, avec un miroir principal de 6,5 mètres de diamètre."),
            en = LocalizedContent("What is the largest current space telescope?", listOf("James Webb", "Hubble", "Spitzer", "Kepler"), "Technology", "The James Webb Space Telescope, launched in 2021, is the largest ever deployed in space, with a primary mirror 6.5 meters in diameter."),
            zh = LocalizedContent("目前最大的太空望远镜是什么？", listOf("詹姆斯·韦伯", "哈勃", "斯皮策", "开普勒"), "科技", "詹姆斯·韦伯太空望远镜于2021年发射，是太空中部署的最大望远镜，主镜直径达6.5米。"),
            es = LocalizedContent("¿Cuál es el telescopio espacial más grande actual?", listOf("James Webb", "Hubble", "Spitzer", "Kepler"), "Tecnología", "El telescopio espacial James Webb, lanzado en 2021, es el más grande jamás desplegado en el espacio, con un espejo principal de 6,5 metros de diámetro.")
        ),
        BilingualQuestion(
            id = 11197, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année le télescope James Webb a-t-il été lancé?", listOf("2021", "2019", "2023", "2025"), "Technologie", "Le télescope spatial James Webb a été lancé le 25 décembre 2021 depuis Kourou, en Guyane française, après de nombreux reports. Il succède au télescope Hubble pour observer l'univers en infrarouge."),
            en = LocalizedContent("In what year was the James Webb telescope launched?", listOf("2021", "2019", "2023", "2025"), "Technology", "The James Webb Space Telescope was launched on December 25, 2021, from Kourou, French Guiana, after many delays. It succeeds the Hubble telescope to observe the universe in infrared."),
            zh = LocalizedContent("詹姆斯·韦伯望远镜是哪一年发射的？", listOf("2021", "2019", "2023", "2025"), "科技", "詹姆斯·韦伯太空望远镜于2021年12月25日从法属圭亚那库鲁发射，经过多次推迟。它接替哈勃望远镜，以红外线观测宇宙。"),
            es = LocalizedContent("¿En qué año se lanzó el telescopio James Webb?", listOf("2021", "2019", "2023", "2025"), "Tecnología", "El telescopio espacial James Webb fue lanzado el 25 de diciembre de 2021 desde Kourou, en la Guayana Francesa, tras numerosos retrasos. Sucede al telescopio Hubble para observar el universo en infrarrojo.")
        ),
        BilingualQuestion(
            id = 11198, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus proche exoplanète découverte?", listOf("Proxima Centauri b", "Trappist-1e", "WASP-12b", "HD 209458b"), "Technologie", "Proxima Centauri b orbite autour de Proxima du Centaure, l'étoile la plus proche du Soleil, située à environ 4,2 années-lumière."),
            en = LocalizedContent("What is the closest exoplanet discovered?", listOf("Proxima Centauri b", "Trappist-1e", "WASP-12b", "HD 209458b"), "Technology", "Proxima Centauri b orbits Proxima Centauri, the closest star to the Sun, located about 4.2 light-years away."),
            zh = LocalizedContent("发现的最接近的系外行星是什么？", listOf("比邻星b", "特拉普斯特-1e", "WASP-12b", "HD 209458b"), "科技", "比邻星b绕比邻星运行，比邻星是离太阳最近的恒星，距离约4.2光年。"),
            es = LocalizedContent("¿Cuál es el exoplaneta más cercano descubierto?", listOf("Próxima Centauri b", "Trappist-1e", "WASP-12b", "HD 209458b"), "Tecnología", "Próxima Centauri b orbita alrededor de Próxima Centauri, la estrella más cercana al Sol, situada a unos 4,2 años luz.")
        ),
        BilingualQuestion(
            id = 11199, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année Kepler a-t-il découvert les premières exoplanètes?", listOf("2009", "2007", "2011", "2013"), "Technologie", "La mission Kepler de la NASA a été lancée en mars 2009, et ses premières découvertes d'exoplanètes ont été annoncées la même année."),
            en = LocalizedContent("In what year did Kepler discover the first exoplanets?", listOf("2009", "2007", "2011", "2013"), "Technology", "NASA's Kepler mission was launched in March 2009, and its first exoplanet discoveries were announced the same year."),
            zh = LocalizedContent("开普勒在哪一年发现了第一批系外行星？", listOf("2009", "2007", "2011", "2013"), "科技", "美国宇航局的开普勒任务于2009年3月发射，同年宣布了首批系外行星的发现。"),
            es = LocalizedContent("¿En qué año descubrió Kepler los primeros exoplanetas?", listOf("2009", "2007", "2011", "2013"), "Tecnología", "La misión Kepler de la NASA fue lanzada en marzo de 2009, y sus primeros descubrimientos de exoplanetas se anunciaron ese mismo año.")
        ),
        BilingualQuestion(
            id = 11200, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel est le plus grand trou noir connu?", listOf("TON 618", "Phoenix A", "IC 1101", "Holmberg 15A"), "Technologie", "TON 618 est un quasar extrêmement lumineux abritant un trou noir supermassif estimé à 66 milliards de masses solaires, ce qui en fait le plus massif jamais observé."),
            en = LocalizedContent("What is the largest known black hole?", listOf("TON 618", "Phoenix A", "IC 1101", "Holmberg 15A"), "Technology", "TON 618 is an extremely luminous quasar hosting a supermassive black hole estimated at 66 billion solar masses, making it the most massive ever observed."),
            zh = LocalizedContent("已知最大的黑洞是什么？", listOf("TON 618", "凤凰座A", "IC 1101", "霍尔姆伯格15A"), "科技", "TON 618是一个极其明亮的类星体，拥有一个估计质量为660亿太阳质量的超大质量黑洞，使其成为有史以来观测到的最大的黑洞。"),
            es = LocalizedContent("¿Cuál es el agujero negro más grande conocido?", listOf("TON 618", "Phoenix A", "IC 1101", "Holmberg 15A"), "Tecnología", "TON 618 es un cuásar extremadamente luminoso que alberga un agujero negro supermasivo estimado en 66 mil millones de masas solares, lo que lo convierte en el más masivo jamás observado.")
        ),
        BilingualQuestion(
            id = 11201, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de transistors le processeur Apple M1 contient-il?", listOf("16 milliards", "10 milliards", "20 milliards", "25 milliards"), "Technologie", "L'Apple M1, premier processeur conçu par Apple pour ses Mac, intègre 16 milliards de transistors sur une puce de 5 nanomètres, une densité élevée qui permet des performances et une efficacité énergétique remarquables."),
            en = LocalizedContent("How many transistors does the Apple M1 processor contain?", listOf("16 billion", "10 billion", "20 billion", "25 billion"), "Technology", "The Apple M1, the first processor designed by Apple for its Macs, integrates 16 billion transistors on a 5-nanometer chip, a high density that enables remarkable performance and energy efficiency."),
            zh = LocalizedContent("苹果M1处理器包含多少晶体管？", listOf("160亿", "100亿", "200亿", "250亿"), "科技", "苹果M1是苹果为其Mac设计的第一款处理器，在5纳米芯片上集成了160亿个晶体管，这种高密度实现了卓越的性能和能效。"),
            es = LocalizedContent("¿Cuántos transistores contiene el procesador Apple M1?", listOf("16 mil millones", "10 mil millones", "20 mil millones", "25 mil millones"), "Tecnología", "El Apple M1, el primer procesador diseñado por Apple para sus Mac, integra 16 mil millones de transistores en un chip de 5 nanómetros, una alta densidad que permite un rendimiento y una eficiencia energética notables.")
        ),
        BilingualQuestion(
            id = 11202, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le processeur le plus puissant actuellement?", listOf("NVIDIA H100", "Apple M3 Max", "AMD EPYC", "Intel Xeon"), "Technologie", "Le NVIDIA H100 est une unité de traitement graphique (GPU) conçue pour l'intelligence artificielle et le calcul haute performance, surpassant les processeurs classiques dans ces tâches spécifiques."),
            en = LocalizedContent("What is the most powerful processor currently?", listOf("NVIDIA H100", "Apple M3 Max", "AMD EPYC", "Intel Xeon"), "Technology", "The NVIDIA H100 is a graphics processing unit (GPU) designed for artificial intelligence and high-performance computing, surpassing traditional processors in these specific tasks."),
            zh = LocalizedContent("目前最强大的处理器是什么？", listOf("NVIDIA H100", "苹果M3 Max", "AMD EPYC", "英特尔至强"), "科技", "NVIDIA H100是一款专为人工智能和高性能计算设计的图形处理单元（GPU），在这些特定任务上超越了传统处理器。"),
            es = LocalizedContent("¿Cuál es el procesador más potente actualmente?", listOf("NVIDIA H100", "Apple M3 Max", "AMD EPYC", "Intel Xeon"), "Tecnología", "La NVIDIA H100 es una unidad de procesamiento gráfico (GPU) diseñada para inteligencia artificial y computación de alto rendimiento, superando a los procesadores tradicionales en estas tareas específicas.")
        ),
        BilingualQuestion(
            id = 11203, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année le processeur Apple Silicon a-t-il été lancé?", listOf("2020", "2018", "2022", "2024"), "Technologie", "Apple a annoncé le passage des processeurs Intel à ses propres puces Apple Silicon en juin 2020, avec le lancement du MacBook Air, MacBook Pro 13 pouces et Mac mini équipés de la puce M1 en novembre 2020."),
            en = LocalizedContent("In what year was the Apple Silicon processor launched?", listOf("2020", "2018", "2022", "2024"), "Technology", "Apple announced the transition from Intel processors to its own Apple Silicon chips in June 2020, with the launch of the MacBook Air, 13-inch MacBook Pro, and Mac mini equipped with the M1 chip in November 2020."),
            zh = LocalizedContent("苹果硅处理器是哪一年推出的？", listOf("2020", "2018", "2022", "2024"), "科技", "苹果于2020年6月宣布从英特尔处理器过渡到自己的苹果硅芯片，并于2020年11月推出了搭载M1芯片的MacBook Air、13英寸MacBook Pro和Mac mini。"),
            es = LocalizedContent("¿En qué año se lanzó el procesador Apple Silicon?", listOf("2020", "2018", "2022", "2024"), "Tecnología", "Apple anunció la transición de los procesadores Intel a sus propios chips Apple Silicon en junio de 2020, con el lanzamiento del MacBook Air, MacBook Pro de 13 pulgadas y Mac mini equipados con el chip M1 en noviembre de 2020.")
        ),
        BilingualQuestion(
            id = 11204, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le GPU le plus puissant actuellement?", listOf("NVIDIA RTX 6000 Ada", "RTX 4090", "AMD MI300X", "Intel Arc"), "Technologie", "La RTX 6000 Ada est le GPU le plus puissant de NVIDIA, conçu pour les stations de travail professionnelles avec 48 Go de VRAM et une architecture Ada Lovelace."),
            en = LocalizedContent("What is the most powerful GPU currently?", listOf("NVIDIA RTX 6000 Ada", "RTX 4090", "AMD MI300X", "Intel Arc"), "Technology", "The RTX 6000 Ada is NVIDIA's most powerful GPU, designed for professional workstations with 48 GB of VRAM and an Ada Lovelace architecture."),
            zh = LocalizedContent("目前最强大的GPU是什么？", listOf("NVIDIA RTX 6000 Ada", "RTX 4090", "AMD MI300X", "英特尔Arc"), "科技", "RTX 6000 Ada是NVIDIA最强大的GPU，专为专业工作站设计，配备48 GB显存和Ada Lovelace架构。"),
            es = LocalizedContent("¿Cuál es la GPU más potente actualmente?", listOf("NVIDIA RTX 6000 Ada", "RTX 4090", "AMD MI300X", "Intel Arc"), "Tecnología", "La RTX 6000 Ada es la GPU más potente de NVIDIA, diseñada para estaciones de trabajo profesionales con 48 GB de VRAM y arquitectura Ada Lovelace.")
        ),
        BilingualQuestion(
            id = 11205, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année RTX 4090 a-t-il été lancé?", listOf("2022", "2020", "2024", "2025"), "Technologie", "La RTX 4090 a été lancée en octobre 2022 par Nvidia, dans le cadre de la série GeForce RTX 40 basée sur l'architecture Ada Lovelace."),
            en = LocalizedContent("In what year was the RTX 4090 launched?", listOf("2022", "2020", "2024", "2025"), "Technology", "The RTX 4090 was launched in October 2022 by Nvidia, as part of the GeForce RTX 40 series based on the Ada Lovelace architecture."),
            zh = LocalizedContent("RTX 4090是哪一年推出的？", listOf("2022", "2020", "2024", "2025"), "科技", "RTX 4090于2022年10月由Nvidia推出，作为基于Ada Lovelace架构的GeForce RTX 40系列的一部分。"),
            es = LocalizedContent("¿En qué año se lanzó la RTX 4090?", listOf("2022", "2020", "2024", "2025"), "Tecnología", "La RTX 4090 fue lanzada en octubre de 2022 por Nvidia, como parte de la serie GeForce RTX 40 basada en la arquitectura Ada Lovelace.")
        ),
        BilingualQuestion(
            id = 11206, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le système de refroidissement le plus efficace?", listOf("Refroidissement liquide", "Refroidissement air", "Refroidissement phase", "Thermoélectrique"), "Technologie", "Le refroidissement liquide est plus efficace que l'air car l'eau a une capacité thermique massique plus élevée, permettant d'évacuer davantage de chaleur des composants électroniques."),
            en = LocalizedContent("What is the most efficient cooling system?", listOf("Liquid cooling", "Air cooling", "Phase-change cooling", "Thermoelectric cooling"), "Technology", "Liquid cooling is more efficient than air because water has a higher specific heat capacity, allowing it to dissipate more heat from electronic components."),
            zh = LocalizedContent("最高效的冷却系统是什么？", listOf("液冷", "风冷", "相变冷却", "热电冷却"), "科技", "液冷比风冷更高效，因为水的比热容更高，能够从电子元件中散发更多热量。"),
            es = LocalizedContent("¿Cuál es el sistema de refrigeración más eficiente?", listOf("Refrigeración líquida", "Refrigeración por aire", "Refrigeración por cambio de fase", "Refrigeración termoeléctrica"), "Tecnología", "La refrigeración líquida es más eficiente que la de aire porque el agua tiene una capacidad calorífica específica más alta, lo que permite disipar más calor de los componentes electrónicos.")
        ),
        BilingualQuestion(
            id = 11207, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année AMD Ryzen a-t-il été lancé?", listOf("2017", "2015", "2019", "2021"), "Technologie", "La première génération de processeurs AMD Ryzen, basée sur l'architecture Zen, a été commercialisée en mars 2017, marquant le retour d'AMD sur le marché haut de gamme face à Intel."),
            en = LocalizedContent("In what year was AMD Ryzen launched?", listOf("2017", "2015", "2019", "2021"), "Technology", "The first generation of AMD Ryzen processors, based on the Zen architecture, was commercialized in March 2017, marking AMD's return to the high-end market against Intel."),
            zh = LocalizedContent("AMD Ryzen是哪一年推出的？", listOf("2017", "2015", "2019", "2021"), "科技", "第一代AMD Ryzen处理器基于Zen架构，于2017年3月上市，标志着AMD重返高端市场与英特尔竞争。"),
            es = LocalizedContent("¿En qué año se lanzó AMD Ryzen?", listOf("2017", "2015", "2019", "2021"), "Tecnología", "La primera generación de procesadores AMD Ryzen, basada en la arquitectura Zen, se comercializó en marzo de 2017, marcando el regreso de AMD al mercado de gama alta frente a Intel.")
        ),
        BilingualQuestion(
            id = 11208, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le disque dur le plus rapide actuellement?", listOf("SSD NVMe", "SSD SATA", "HDD Mécanique", "Mémoire Flash"), "Technologie", "Les SSD NVMe utilisent l'interface PCI Express, offrant des vitesses de lecture/écriture bien supérieures aux SSD SATA ou aux disques durs mécaniques, ce qui en fait le type de stockage le plus rapide actuellement."),
            en = LocalizedContent("What is the fastest hard drive currently?", listOf("NVMe SSD", "SATA SSD", "Mechanical HDD", "Flash memory"), "Technology", "NVMe SSDs use the PCI Express interface, offering read/write speeds far superior to SATA SSDs or mechanical hard drives, making them the fastest storage type currently."),
            zh = LocalizedContent("目前最快的硬盘是什么？", listOf("NVMe固态硬盘", "SATA固态硬盘", "机械硬盘", "闪存"), "科技", "NVMe固态硬盘使用PCI Express接口，提供远高于SATA固态硬盘或机械硬盘的读写速度，使其成为目前最快的存储类型。"),
            es = LocalizedContent("¿Cuál es el disco duro más rápido actualmente?", listOf("SSD NVMe", "SSD SATA", "HDD mecánico", "Memoria flash"), "Tecnología", "Los SSD NVMe utilizan la interfaz PCI Express, ofreciendo velocidades de lectura/escritura muy superiores a los SSD SATA o discos duros mecánicos, lo que los convierte en el tipo de almacenamiento más rápido actualmente.")
        ),
        BilingualQuestion(
            id = 11209, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année Intel Core i7 a-t-il été lancé?", listOf("2008", "2006", "2010", "2012"), "Technologie", "Le premier processeur Intel Core i7, basé sur l'architecture Nehalem, a été officiellement lancé en novembre 2008."),
            en = LocalizedContent("In what year was the Intel Core i7 launched?", listOf("2008", "2006", "2010", "2012"), "Technology", "The first Intel Core i7 processor, based on the Nehalem architecture, was officially launched in November 2008."),
            zh = LocalizedContent("英特尔酷睿i7是哪一年推出的？", listOf("2008", "2006", "2010", "2012"), "科技", "第一款英特尔酷睿i7处理器基于Nehalem架构，于2008年11月正式推出。"),
            es = LocalizedContent("¿En qué año se lanzó el Intel Core i7?", listOf("2008", "2006", "2010", "2012"), "Tecnología", "El primer procesador Intel Core i7, basado en la arquitectura Nehalem, se lanzó oficialmente en noviembre de 2008.")
        ),
        BilingualQuestion(
            id = 11210, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus gros superordinateur du monde?", listOf("Frontier", "Fugaku", "Sunway", "Perlmutter"), "Technologie", "Frontier, installé au Oak Ridge National Laboratory aux États-Unis, a dépassé le japonais Fugaku en juin 2022 pour devenir le superordinateur le plus puissant, avec une performance de plus d'un exaflop."),
            en = LocalizedContent("What is the largest supercomputer in the world?", listOf("Frontier", "Fugaku", "Sunway", "Perlmutter"), "Technology", "Frontier, installed at Oak Ridge National Laboratory in the United States, surpassed Japan's Fugaku in June 2022 to become the most powerful supercomputer, with a performance of over one exaflop."),
            zh = LocalizedContent("世界上最大的超级计算机是什么？", listOf("Frontier", "Fugaku", "Sunway", "Perlmutter"), "科技", "Frontier，安装在美国橡树岭国家实验室，于2022年6月超越日本的Fugaku成为最强大的超级计算机，性能超过一个exaflop。"),
            es = LocalizedContent("¿Cuál es la supercomputadora más grande del mundo?", listOf("Frontier", "Fugaku", "Sunway", "Perlmutter"), "Tecnología", "Frontier, instalada en el Laboratorio Nacional Oak Ridge en Estados Unidos, superó a la japonesa Fugaku en junio de 2022 para convertirse en la supercomputadora más potente, con un rendimiento de más de un exaflop.")
        ),
        BilingualQuestion(
            id = 11211, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui a créé Instagram?", listOf("Kevin Systrom et Mike Krieger", "Mark Zuckerberg", "Jack Dorsey", "Evan Spiegel"), "Technologie", "Kevin Systrom a cofondé Instagram avec Mike Krieger en 2010, initialement lancé sous le nom de Burbn avant de se recentrer sur le partage de photos."),
            en = LocalizedContent("Who created Instagram?", listOf("Kevin Systrom and Mike Krieger", "Mark Zuckerberg", "Jack Dorsey", "Evan Spiegel"), "Technology", "Kevin Systrom co-founded Instagram with Mike Krieger in 2010, initially launched under the name Burbn before focusing on photo sharing."),
            zh = LocalizedContent("谁创建了Instagram？", listOf("凯文·斯特罗姆和迈克·克里格", "马克·扎克伯格", "杰克·多西", "埃文·斯皮格尔"), "科技", "凯文·斯特罗姆与迈克·克里格于2010年共同创立了Instagram，最初以Burbn之名推出，后专注于照片分享。"),
            es = LocalizedContent("¿Quién creó Instagram?", listOf("Kevin Systrom y Mike Krieger", "Mark Zuckerberg", "Jack Dorsey", "Evan Spiegel"), "Tecnología", "Kevin Systrom cofundó Instagram con Mike Krieger en 2010, inicialmente lanzado bajo el nombre de Burbn antes de centrarse en el intercambio de fotos.")
        ),
        BilingualQuestion(
            id = 11212, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année Instagram a-t-il été fondé?", listOf("2010", "2008", "2012", "2014"), "Technologie", "Instagram a été fondé en 2010 par Kevin Systrom et Mike Krieger, initialement sous le nom de Burbn avant d'être renommé et lancé en octobre de la même année."),
            en = LocalizedContent("In what year was Instagram founded?", listOf("2010", "2008", "2012", "2014"), "Technology", "Instagram was founded in 2010 by Kevin Systrom and Mike Krieger, initially under the name Burbn before being renamed and launched in October of the same year."),
            zh = LocalizedContent("Instagram成立于哪一年？", listOf("2010", "2008", "2012", "2014"), "科技", "Instagram由凯文·斯特罗姆和迈克·克里格于2010年创立，最初名为Burbn，后更名并于同年10月推出。"),
            es = LocalizedContent("¿En qué año se fundó Instagram?", listOf("2010", "2008", "2012", "2014"), "Tecnología", "Instagram fue fundado en 2010 por Kevin Systrom y Mike Krieger, inicialmente bajo el nombre de Burbn antes de ser renombrado y lanzado en octubre del mismo año.")
        ),
        BilingualQuestion(
            id = 11213, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui a créé Twitter?", listOf("Jack Dorsey, Noah Glass, Evan Williams, Christopher Stone", "Mark Zuckerberg", "Kevin Systrom", "Evan Spiegel"), "Technologie", "Jack Dorsey, Noah Glass, Evan Williams et Christopher Stone ont cofondé Twitter en 2006, avec Dorsey souvent considéré comme l'inventeur principal du concept de microblogging."),
            en = LocalizedContent("Who created Twitter?", listOf("Jack Dorsey, Noah Glass, Evan Williams, Christopher Stone", "Mark Zuckerberg", "Kevin Systrom", "Evan Spiegel"), "Technology", "Jack Dorsey, Noah Glass, Evan Williams, and Christopher Stone co-founded Twitter in 2006, with Dorsey often considered the main inventor of the microblogging concept."),
            zh = LocalizedContent("谁创建了Twitter？", listOf("杰克·多西、诺亚·格拉斯、埃文·威廉姆斯、克里斯托弗·斯通", "马克·扎克伯格", "凯文·斯特罗姆", "埃文·斯皮格尔"), "科技", "杰克·多西、诺亚·格拉斯、埃文·威廉姆斯和克里斯托弗·斯通于2006年共同创立了Twitter，多西常被视为微博概念的主要发明者。"),
            es = LocalizedContent("¿Quién creó Twitter?", listOf("Jack Dorsey, Noah Glass, Evan Williams, Christopher Stone", "Mark Zuckerberg", "Kevin Systrom", "Evan Spiegel"), "Tecnología", "Jack Dorsey, Noah Glass, Evan Williams y Christopher Stone cofundaron Twitter en 2006, con Dorsey a menudo considerado el inventor principal del concepto de microblogging.")
        ),
        BilingualQuestion(
            id = 11214, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année Twitter a-t-il été fondé?", listOf("2006", "2004", "2008", "2010"), "Technologie", "Twitter a été fondé en mars 2006 par Jack Dorsey, Noah Glass, Biz Stone et Evan Williams, le premier tweet ayant été publié le 21 mars de cette année-là."),
            en = LocalizedContent("In what year was Twitter founded?", listOf("2006", "2004", "2008", "2010"), "Technology", "Twitter was founded in March 2006 by Jack Dorsey, Noah Glass, Biz Stone, and Evan Williams, with the first tweet published on March 21 of that year."),
            zh = LocalizedContent("Twitter成立于哪一年？", listOf("2006", "2004", "2008", "2010"), "科技", "Twitter由杰克·多西、诺亚·格拉斯、比兹·斯通和埃文·威廉姆斯于2006年3月创立，第一条推文于同年3月21日发布。"),
            es = LocalizedContent("¿En qué año se fundó Twitter?", listOf("2006", "2004", "2008", "2010"), "Tecnología", "Twitter fue fundado en marzo de 2006 por Jack Dorsey, Noah Glass, Biz Stone y Evan Williams, y el primer tuit se publicó el 21 de marzo de ese año.")
        ),
        BilingualQuestion(
            id = 11215, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui a créé Snapchat?", listOf("Evan Spiegel, Bobby Murphy et Reggie Brown", "Mark Zuckerberg", "Jack Dorsey", "Kevin Systrom"), "Technologie", "Snapchat a été créé en 2011 par Evan Spiegel, Bobby Murphy et Reggie Brown, alors étudiants à l'université Stanford."),
            en = LocalizedContent("Who created Snapchat?", listOf("Evan Spiegel, Bobby Murphy and Reggie Brown", "Mark Zuckerberg", "Jack Dorsey", "Kevin Systrom"), "Technology", "Snapchat was created in 2011 by Evan Spiegel, Bobby Murphy, and Reggie Brown, then students at Stanford University."),
            zh = LocalizedContent("谁创建了Snapchat？", listOf("埃文·斯皮格尔、鲍比·墨菲和雷吉·布朗", "马克·扎克伯格", "杰克·多西", "凯文·斯特罗姆"), "科技", "Snapchat由埃文·斯皮格尔、鲍比·墨菲和雷吉·布朗于2011年创建，当时他们是斯坦福大学的学生。"),
            es = LocalizedContent("¿Quién creó Snapchat?", listOf("Evan Spiegel, Bobby Murphy y Reggie Brown", "Mark Zuckerberg", "Jack Dorsey", "Kevin Systrom"), "Tecnología", "Snapchat fue creado en 2011 por Evan Spiegel, Bobby Murphy y Reggie Brown, entonces estudiantes de la Universidad de Stanford.")
        ),
        BilingualQuestion(
            id = 11216, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année Snapchat a-t-il été fondé?", listOf("2011", "2009", "2013", "2015"), "Technologie", "Snapchat a été fondé en 2011 par Evan Spiegel, Bobby Murphy et Reggie Brown, alors étudiants à l'université Stanford."),
            en = LocalizedContent("In what year was Snapchat founded?", listOf("2011", "2009", "2013", "2015"), "Technology", "Snapchat was founded in 2011 by Evan Spiegel, Bobby Murphy, and Reggie Brown, then students at Stanford University."),
            zh = LocalizedContent("Snapchat成立于哪一年？", listOf("2011", "2009", "2013", "2015"), "科技", "Snapchat由埃文·斯皮格尔、鲍比·墨菲和雷吉·布朗于2011年创立，当时他们是斯坦福大学的学生。"),
            es = LocalizedContent("¿En qué año se fundó Snapchat?", listOf("2011", "2009", "2013", "2015"), "Tecnología", "Snapchat fue fundado en 2011 por Evan Spiegel, Bobby Murphy y Reggie Brown, entonces estudiantes de la Universidad de Stanford.")
        ),
        BilingualQuestion(
            id = 11217, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui a créé TikTok?", listOf("ByteDance", "Alibaba", "Tencent", "Xiaomi"), "Technologie", "ByteDance, entreprise chinoise fondée par Zhang Yiming, a lancé TikTok en 2016 sous le nom de Douyin pour le marché chinois, puis en version internationale en 2017."),
            en = LocalizedContent("Who created TikTok?", listOf("ByteDance", "Alibaba", "Tencent", "Xiaomi"), "Technology", "ByteDance, a Chinese company founded by Zhang Yiming, launched TikTok in 2016 under the name Douyin for the Chinese market, then an international version in 2017."),
            zh = LocalizedContent("谁创建了TikTok？", listOf("字节跳动", "阿里巴巴", "腾讯", "小米"), "科技", "字节跳动，由张一鸣创立的中国公司，于2016年以抖音之名在中国市场推出TikTok，随后于2017年推出国际版。"),
            es = LocalizedContent("¿Quién creó TikTok?", listOf("ByteDance", "Alibaba", "Tencent", "Xiaomi"), "Tecnología", "ByteDance, una empresa china fundada por Zhang Yiming, lanzó TikTok en 2016 bajo el nombre de Douyin para el mercado chino, y luego una versión internacional en 2017.")
        ),
        BilingualQuestion(
            id = 11218, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année TikTok a-t-il été fondé?", listOf("2016", "2014", "2018", "2020"), "Technologie", "TikTok a été lancé en septembre 2016 par la société chinoise ByteDance sous le nom de Douyin pour le marché chinois, avant d'être déployé à l'international sous le nom de TikTok en 2017."),
            en = LocalizedContent("In what year was TikTok founded?", listOf("2016", "2014", "2018", "2020"), "Technology", "TikTok was launched in September 2016 by the Chinese company ByteDance under the name Douyin for the Chinese market, before being deployed internationally as TikTok in 2017."),
            zh = LocalizedContent("TikTok成立于哪一年？", listOf("2016", "2014", "2018", "2020"), "科技", "TikTok由中国公司字节跳动于2016年9月以抖音之名在中国市场推出，随后于2017年以TikTok之名在国际上推出。"),
            es = LocalizedContent("¿En qué año se fundó TikTok?", listOf("2016", "2014", "2018", "2020"), "Tecnología", "TikTok fue lanzado en septiembre de 2016 por la empresa china ByteDance bajo el nombre de Douyin para el mercado chino, antes de ser desplegado internacionalmente como TikTok en 2017.")
        ),
        BilingualQuestion(
            id = 11219, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui a créé WhatsApp?", listOf("Jan Koum et Brian Acton", "Mark Zuckerberg", "Jack Dorsey", "Evan Spiegel"), "Technologie", "Jan Koum et Brian Acton, deux anciens employés de Yahoo!, ont fondé WhatsApp en 2009 pour offrir une messagerie simple et sans publicité."),
            en = LocalizedContent("Who created WhatsApp?", listOf("Jan Koum and Brian Acton", "Mark Zuckerberg", "Jack Dorsey", "Evan Spiegel"), "Technology", "Jan Koum and Brian Acton, two former Yahoo! employees, founded WhatsApp in 2009 to provide simple, ad-free messaging."),
            zh = LocalizedContent("谁创建了WhatsApp？", listOf("简·库姆和布莱恩·阿克顿", "马克·扎克伯格", "杰克·多西", "埃文·斯皮格尔"), "科技", "简·库姆和布莱恩·阿克顿，两位前雅虎员工，于2009年创立了WhatsApp，旨在提供简单、无广告的即时通讯服务。"),
            es = LocalizedContent("¿Quién creó WhatsApp?", listOf("Jan Koum y Brian Acton", "Mark Zuckerberg", "Jack Dorsey", "Evan Spiegel"), "Tecnología", "Jan Koum y Brian Acton, dos ex empleados de Yahoo!, fundaron WhatsApp en 2009 para ofrecer mensajería simple y sin publicidad.")
        ),
        BilingualQuestion(
            id = 11220, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année WhatsApp a-t-il été fondé?", listOf("2009", "2007", "2011", "2013"), "Technologie", "WhatsApp a été fondé en 2009 par Jan Koum et Brian Acton, anciens employés de Yahoo!, pour offrir une alternative aux SMS."),
            en = LocalizedContent("In what year was WhatsApp founded?", listOf("2009", "2007", "2011", "2013"), "Technology", "WhatsApp was founded in 2009 by Jan Koum and Brian Acton, former employees of Yahoo!, to offer an alternative to SMS."),
            zh = LocalizedContent("WhatsApp是哪一年创立的？", listOf("2009", "2007", "2011", "2013"), "科技", "WhatsApp由前雅虎员工Jan Koum和Brian Acton于2009年创立，旨在提供短信的替代方案。"),
            es = LocalizedContent("¿En qué año se fundó WhatsApp?", listOf("2009", "2007", "2011", "2013"), "Tecnología", "WhatsApp fue fundado en 2009 por Jan Koum y Brian Acton, ex empleados de Yahoo!, para ofrecer una alternativa a los SMS.")
        ),
        BilingualQuestion(
            id = 11221, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a créé Telegram?", listOf("Pavel Durov et Nikolai Durov", "Mark Zuckerberg", "Jack Dorsey", "Jan Koum"), "Technologie", "Pavel Durov, fondateur de VKontakte, a co-créé Telegram avec son frère Nikolai en 2013 pour offrir une messagerie sécurisée et cryptée."),
            en = LocalizedContent("Who created Telegram?", listOf("Pavel Durov and Nikolai Durov", "Mark Zuckerberg", "Jack Dorsey", "Jan Koum"), "Technology", "Pavel Durov, founder of VKontakte, co-created Telegram with his brother Nikolai in 2013 to offer a secure and encrypted messaging service."),
            zh = LocalizedContent("谁创建了Telegram？", listOf("帕维尔·杜罗夫和尼古拉·杜罗夫", "马克·扎克伯格", "杰克·多西", "扬·库姆"), "科技", "VKontakte的创始人帕维尔·杜罗夫与他的兄弟尼古拉于2013年共同创建了Telegram，以提供安全加密的通讯服务。"),
            es = LocalizedContent("¿Quién creó Telegram?", listOf("Pavel Durov y Nikolai Durov", "Mark Zuckerberg", "Jack Dorsey", "Jan Koum"), "Tecnología", "Pavel Durov, fundador de VKontakte, co-creó Telegram con su hermano Nikolai en 2013 para ofrecer un servicio de mensajería segura y cifrada.")
        ),
        BilingualQuestion(
            id = 11222, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année Telegram a-t-il été fondé?", listOf("2013", "2011", "2015", "2017"), "Technologie", "Telegram a été fondé par les frères Nikolaï et Pavel Durov en 2013, après leur départ de Russie suite à des conflits avec les autorités concernant la gestion de leur précédent réseau social, VKontakte."),
            en = LocalizedContent("In what year was Telegram founded?", listOf("2013", "2011", "2015", "2017"), "Technology", "Telegram was founded by brothers Nikolai and Pavel Durov in 2013, after leaving Russia due to conflicts with authorities over the management of their previous social network, VKontakte."),
            zh = LocalizedContent("Telegram是哪一年创立的？", listOf("2013", "2011", "2015", "2017"), "科技", "Telegram由尼古拉·杜罗夫和帕维尔·杜罗夫兄弟于2013年创立，此前他们因与当局在管理前社交网络VKontakte上的冲突而离开俄罗斯。"),
            es = LocalizedContent("¿En qué año se fundó Telegram?", listOf("2013", "2011", "2015", "2017"), "Tecnología", "Telegram fue fundado por los hermanos Nikolai y Pavel Durov en 2013, después de abandonar Rusia debido a conflictos con las autoridades por la gestión de su anterior red social, VKontakte.")
        ),
        BilingualQuestion(
            id = 11223, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a créé Viber?", listOf("Talmon Marco et Iqbal Harrosh", "Mark Zuckerberg", "Jack Dorsey", "Jan Koum"), "Technologie", "Viber a été fondé en 2010 par Talmon Marco et Iqbal Harrosh, des entrepreneurs israéliens, pour offrir une alternative gratuite aux appels et messages téléphoniques."),
            en = LocalizedContent("Who created Viber?", listOf("Talmon Marco and Iqbal Harrosh", "Mark Zuckerberg", "Jack Dorsey", "Jan Koum"), "Technology", "Viber was founded in 2010 by Talmon Marco and Iqbal Harrosh, Israeli entrepreneurs, to offer a free alternative to phone calls and messages."),
            zh = LocalizedContent("谁创建了Viber？", listOf("塔尔蒙·马尔科和伊克巴尔·哈罗什", "马克·扎克伯格", "杰克·多西", "扬·库姆"), "科技", "Viber由以色列企业家塔尔蒙·马尔科和伊克巴尔·哈罗什于2010年创立，旨在提供免费的电话和短信替代方案。"),
            es = LocalizedContent("¿Quién creó Viber?", listOf("Talmon Marco e Iqbal Harrosh", "Mark Zuckerberg", "Jack Dorsey", "Jan Koum"), "Tecnología", "Viber fue fundado en 2010 por Talmon Marco e Iqbal Harrosh, empresarios israelíes, para ofrecer una alternativa gratuita a las llamadas y mensajes telefónicos.")
        ),
        BilingualQuestion(
            id = 11224, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année Viber a-t-il été fondé?", listOf("2010", "2008", "2012", "2014"), "Technologie", "Viber a été fondé en 2010 par l'entrepreneur israélien Talmon Marco, initialement comme une application de messagerie vocale sur iPhone avant de devenir une plateforme de communication complète."),
            en = LocalizedContent("In what year was Viber founded?", listOf("2010", "2008", "2012", "2014"), "Technology", "Viber was founded in 2010 by Israeli entrepreneur Talmon Marco, initially as a voice messaging app on iPhone before becoming a full communication platform."),
            zh = LocalizedContent("Viber是哪一年创立的？", listOf("2010", "2008", "2012", "2014"), "科技", "Viber由以色列企业家塔尔蒙·马尔科于2010年创立，最初是iPhone上的语音消息应用，后来发展成为完整的通讯平台。"),
            es = LocalizedContent("¿En qué año se fundó Viber?", listOf("2010", "2008", "2012", "2014"), "Tecnología", "Viber fue fundado en 2010 por el empresario israelí Talmon Marco, inicialmente como una aplicación de mensajería de voz en iPhone antes de convertirse en una plataforma de comunicación completa.")
        ),
        BilingualQuestion(
            id = 11225, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a créé Signal?", listOf("Moxie Marlinspike", "Mark Zuckerberg", "Jack Dorsey", "Jan Koum"), "Technologie", "Moxie Marlinspike a fondé Signal en 2013, après avoir co-créé le protocole de chiffrement de bout en bout utilisé par l'application."),
            en = LocalizedContent("Who created Signal?", listOf("Moxie Marlinspike", "Mark Zuckerberg", "Jack Dorsey", "Jan Koum"), "Technology", "Moxie Marlinspike founded Signal in 2013, after co-creating the end-to-end encryption protocol used by the app."),
            zh = LocalizedContent("谁创建了Signal？", listOf("莫克西·马林斯派克", "马克·扎克伯格", "杰克·多西", "扬·库姆"), "科技", "莫克西·马林斯派克于2013年创立了Signal，此前他共同创建了该应用使用的端到端加密协议。"),
            es = LocalizedContent("¿Quién creó Signal?", listOf("Moxie Marlinspike", "Mark Zuckerberg", "Jack Dorsey", "Jan Koum"), "Tecnología", "Moxie Marlinspike fundó Signal en 2013, después de co-crear el protocolo de cifrado de extremo a extremo utilizado por la aplicación.")
        ),
        BilingualQuestion(
            id = 11226, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année Signal a-t-il été fondé?", listOf("2010", "2008", "2012", "2014"), "Technologie", "Signal a été fondé en 2010 par Matthew Rosenfeld (Moxie Marlinspike) et Stuart Anderson, sous le nom initial de TextSecure."),
            en = LocalizedContent("In what year was Signal founded?", listOf("2010", "2008", "2012", "2014"), "Technology", "Signal was founded in 2010 by Matthew Rosenfeld (Moxie Marlinspike) and Stuart Anderson, under the initial name TextSecure."),
            zh = LocalizedContent("Signal是哪一年创立的？", listOf("2010", "2008", "2012", "2014"), "科技", "Signal由马修·罗森菲尔德（莫克西·马林斯派克）和斯图尔特·安德森于2010年创立，最初名为TextSecure。"),
            es = LocalizedContent("¿En qué año se fundó Signal?", listOf("2010", "2008", "2012", "2014"), "Tecnología", "Signal fue fundado en 2010 por Matthew Rosenfeld (Moxie Marlinspike) y Stuart Anderson, bajo el nombre inicial de TextSecure.")
        ),
        BilingualQuestion(
            id = 11227, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a créé Slack?", listOf("Stewart Butterfield", "Mark Zuckerberg", "Jack Dorsey", "Jan Koum"), "Technologie", "Stewart Butterfield a fondé Slack en 2013, après avoir créé le jeu en ligne Glitch. L'application de messagerie d'entreprise est devenue un outil majeur pour la collaboration en équipe."),
            en = LocalizedContent("Who created Slack?", listOf("Stewart Butterfield", "Mark Zuckerberg", "Jack Dorsey", "Jan Koum"), "Technology", "Stewart Butterfield founded Slack in 2013, after creating the online game Glitch. The enterprise messaging app became a major tool for team collaboration."),
            zh = LocalizedContent("谁创建了Slack？", listOf("斯图尔特·巴特菲尔德", "马克·扎克伯格", "杰克·多西", "扬·库姆"), "科技", "斯图尔特·巴特菲尔德于2013年创立了Slack，此前他创建了在线游戏Glitch。这款企业通讯应用成为团队协作的重要工具。"),
            es = LocalizedContent("¿Quién creó Slack?", listOf("Stewart Butterfield", "Mark Zuckerberg", "Jack Dorsey", "Jan Koum"), "Tecnología", "Stewart Butterfield fundó Slack en 2013, después de crear el juego en línea Glitch. La aplicación de mensajería empresarial se convirtió en una herramienta importante para la colaboración en equipo.")
        ),
        BilingualQuestion(
            id = 11228, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année Slack a-t-il été fondé?", listOf("2013", "2011", "2015", "2017"), "Technologie", "Slack a été fondé en 2013 par Stewart Butterfield, initialement comme un outil interne pour son entreprise de jeux vidéo, avant d'être lancé publiquement comme plateforme de communication professionnelle."),
            en = LocalizedContent("In what year was Slack founded?", listOf("2013", "2011", "2015", "2017"), "Technology", "Slack was founded in 2013 by Stewart Butterfield, initially as an internal tool for his video game company, before being publicly launched as a professional communication platform."),
            zh = LocalizedContent("Slack是哪一年创立的？", listOf("2013", "2011", "2015", "2017"), "科技", "Slack由斯图尔特·巴特菲尔德于2013年创立，最初是其视频游戏公司的内部工具，后来作为专业通讯平台公开发布。"),
            es = LocalizedContent("¿En qué año se fundó Slack?", listOf("2013", "2011", "2015", "2017"), "Tecnología", "Slack fue fundado en 2013 por Stewart Butterfield, inicialmente como una herramienta interna para su empresa de videojuegos, antes de ser lanzado públicamente como plataforma de comunicación profesional.")
        ),
        BilingualQuestion(
            id = 11229, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a créé Discord?", listOf("Jason Citron et Stan Vishnevskiy", "Mark Zuckerberg", "Jack Dorsey", "Stewart Butterfield"), "Technologie", "Discord a été fondé en 2015 par Jason Citron et Stan Vishnevskiy pour offrir une plateforme de communication vocale et textuelle dédiée aux joueurs, avant de s'étendre à d'autres communautés."),
            en = LocalizedContent("Who created Discord?", listOf("Jason Citron and Stan Vishnevskiy", "Mark Zuckerberg", "Jack Dorsey", "Stewart Butterfield"), "Technology", "Discord was founded in 2015 by Jason Citron and Stan Vishnevskiy to provide a voice and text communication platform for gamers, before expanding to other communities."),
            zh = LocalizedContent("谁创建了Discord？", listOf("杰森·西特龙和斯坦·维什涅夫斯基", "马克·扎克伯格", "杰克·多西", "斯图尔特·巴特菲尔德"), "科技", "Discord由杰森·西特龙和斯坦·维什涅夫斯基于2015年创立，旨在为游戏玩家提供语音和文字通讯平台，后来扩展到其他社区。"),
            es = LocalizedContent("¿Quién creó Discord?", listOf("Jason Citron y Stan Vishnevskiy", "Mark Zuckerberg", "Jack Dorsey", "Stewart Butterfield"), "Tecnología", "Discord fue fundado en 2015 por Jason Citron y Stan Vishnevskiy para proporcionar una plataforma de comunicación de voz y texto para jugadores, antes de expandirse a otras comunidades.")
        ),
        BilingualQuestion(
            id = 11230, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année Discord a-t-il été fondé?", listOf("2015", "2013", "2017", "2019"), "Technologie", "Discord a été fondé en 2015 par Jason Citron et Stan Vishnevskiy, initialement conçu comme une plateforme de communication pour les joueurs."),
            en = LocalizedContent("In what year was Discord founded?", listOf("2015", "2013", "2017", "2019"), "Technology", "Discord was founded in 2015 by Jason Citron and Stan Vishnevskiy, initially designed as a communication platform for gamers."),
            zh = LocalizedContent("Discord 成立于哪一年？", listOf("2015", "2013", "2017", "2019"), "科技", "Discord 由 Jason Citron 和 Stan Vishnevskiy 于 2015 年创立，最初设计为游戏玩家的通信平台。"),
            es = LocalizedContent("¿En qué año se fundó Discord?", listOf("2015", "2013", "2017", "2019"), "Tecnología", "Discord fue fundado en 2015 por Jason Citron y Stan Vishnevskiy, inicialmente diseñado como una plataforma de comunicación para jugadores.")
        ),
        BilingualQuestion(
            id = 11231, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a créé Zoom?", listOf("Eric Yuan", "Mark Zuckerberg", "Jack Dorsey", "Satya Nadella"), "Technologie", "Eric Yuan, un ancien ingénieur de Cisco, a fondé Zoom en 2011 et lancé le service en 2013."),
            en = LocalizedContent("Who created Zoom?", listOf("Eric Yuan", "Mark Zuckerberg", "Jack Dorsey", "Satya Nadella"), "Technology", "Eric Yuan, a former Cisco engineer, founded Zoom in 2011 and launched the service in 2013."),
            zh = LocalizedContent("谁创建了 Zoom？", listOf("袁征", "马克·扎克伯格", "杰克·多西", "萨提亚·纳德拉"), "科技", "袁征，前思科工程师，于 2011 年创立 Zoom，并于 2013 年推出该服务。"),
            es = LocalizedContent("¿Quién creó Zoom?", listOf("Eric Yuan", "Mark Zuckerberg", "Jack Dorsey", "Satya Nadella"), "Tecnología", "Eric Yuan, un ex ingeniero de Cisco, fundó Zoom en 2011 y lanzó el servicio en 2013.")
        ),
        BilingualQuestion(
            id = 11232, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année Zoom a-t-il été fondé?", listOf("2011", "2009", "2013", "2015"), "Technologie", "Zoom a été fondé en 2011 par Eric Yuan, un ancien cadre de Cisco. L'application a connu une croissance fulgurante lors de la pandémie de Covid-19."),
            en = LocalizedContent("In what year was Zoom founded?", listOf("2011", "2009", "2013", "2015"), "Technology", "Zoom was founded in 2011 by Eric Yuan, a former Cisco executive. The app experienced explosive growth during the Covid-19 pandemic."),
            zh = LocalizedContent("Zoom 成立于哪一年？", listOf("2011", "2009", "2013", "2015"), "科技", "Zoom 由前思科高管袁征于 2011 年创立。该应用在新冠疫情大流行期间经历了爆炸性增长。"),
            es = LocalizedContent("¿En qué año se fundó Zoom?", listOf("2011", "2009", "2013", "2015"), "Tecnología", "Zoom fue fundado en 2011 por Eric Yuan, un ex ejecutivo de Cisco. La aplicación experimentó un crecimiento explosivo durante la pandemia de Covid-19.")
        ),
        BilingualQuestion(
            id = 11233, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a créé Dropbox?", listOf("Drew Houston et Arash Ferdowsi", "Mark Zuckerberg", "Jack Dorsey", "Jan Koum"), "Technologie", "Drew Houston a fondé Dropbox en 2007 après avoir oublié sa clé USB, et Arash Ferdowsi l'a rejoint comme cofondateur technique."),
            en = LocalizedContent("Who created Dropbox?", listOf("Drew Houston and Arash Ferdowsi", "Mark Zuckerberg", "Jack Dorsey", "Jan Koum"), "Technology", "Drew Houston founded Dropbox in 2007 after forgetting his USB drive, and Arash Ferdowsi joined as co-founder and technical lead."),
            zh = LocalizedContent("谁创建了 Dropbox？", listOf("德鲁·休斯顿和阿拉什·费尔多西", "马克·扎克伯格", "杰克·多西", "简·库姆"), "科技", "德鲁·休斯顿在忘记带 U 盘后于 2007 年创立了 Dropbox，阿拉什·费尔多西作为联合创始人兼技术负责人加入。"),
            es = LocalizedContent("¿Quién creó Dropbox?", listOf("Drew Houston y Arash Ferdowsi", "Mark Zuckerberg", "Jack Dorsey", "Jan Koum"), "Tecnología", "Drew Houston fundó Dropbox en 2007 después de olvidar su unidad USB, y Arash Ferdowsi se unió como cofundador y líder técnico.")
        ),
        BilingualQuestion(
            id = 11234, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année Dropbox a-t-il été fondé?", listOf("2008", "2006", "2010", "2012"), "Technologie", "Dropbox a été fondé en 2008 par Drew Houston et Arash Ferdowsi. Le service de stockage en ligne a été lancé officiellement cette année-là après une phase de développement."),
            en = LocalizedContent("In what year was Dropbox founded?", listOf("2008", "2006", "2010", "2012"), "Technology", "Dropbox was founded in 2008 by Drew Houston and Arash Ferdowsi. The online storage service was officially launched that year after a development phase."),
            zh = LocalizedContent("Dropbox 成立于哪一年？", listOf("2008", "2006", "2010", "2012"), "科技", "Dropbox 由德鲁·休斯顿和阿拉什·费尔多西于 2008 年创立。该在线存储服务在经过开发阶段后于同年正式推出。"),
            es = LocalizedContent("¿En qué año se fundó Dropbox?", listOf("2008", "2006", "2010", "2012"), "Tecnología", "Dropbox fue fundado en 2008 por Drew Houston y Arash Ferdowsi. El servicio de almacenamiento en línea se lanzó oficialmente ese año después de una fase de desarrollo.")
        ),
        BilingualQuestion(
            id = 11235, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a créé Airbnb?", listOf("Brian Chesky, Joe Gebbia et Nathan Blecharczyk", "Mark Zuckerberg", "Jack Dorsey", "Evan Spiegel"), "Technologie", "Airbnb a été fondé en 2008 par Brian Chesky, Joe Gebbia et Nathan Blecharczyk à San Francisco, après que les deux premiers ont loué des matelas gonflables dans leur appartement pour financer leur loyer."),
            en = LocalizedContent("Who created Airbnb?", listOf("Brian Chesky, Joe Gebbia and Nathan Blecharczyk", "Mark Zuckerberg", "Jack Dorsey", "Evan Spiegel"), "Technology", "Airbnb was founded in 2008 by Brian Chesky, Joe Gebbia and Nathan Blecharczyk in San Francisco, after the first two rented out air mattresses in their apartment to pay their rent."),
            zh = LocalizedContent("谁创建了 Airbnb？", listOf("布莱恩·切斯基、乔·格比亚和内森·布莱查奇克", "马克·扎克伯格", "杰克·多西", "埃文·斯皮格尔"), "科技", "Airbnb 由布莱恩·切斯基、乔·格比亚和内森·布莱查奇克于 2008 年在旧金山创立，此前两人在公寓里出租气垫床以支付房租。"),
            es = LocalizedContent("¿Quién creó Airbnb?", listOf("Brian Chesky, Joe Gebbia y Nathan Blecharczyk", "Mark Zuckerberg", "Jack Dorsey", "Evan Spiegel"), "Tecnología", "Airbnb fue fundado en 2008 por Brian Chesky, Joe Gebbia y Nathan Blecharczyk en San Francisco, después de que los dos primeros alquilaran colchones inflables en su apartamento para pagar el alquiler.")
        ),
        BilingualQuestion(
            id = 11236, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année Airbnb a-t-il été fondé?", listOf("2008", "2006", "2010", "2012"), "Technologie", "Airbnb a été fondé en 2008 par Brian Chesky, Joe Gebbia et Nathan Blecharczyk, après avoir loué des matelas gonflables dans leur appartement de San Francisco pour financer leur loyer."),
            en = LocalizedContent("In what year was Airbnb founded?", listOf("2008", "2006", "2010", "2012"), "Technology", "Airbnb was founded in 2008 by Brian Chesky, Joe Gebbia and Nathan Blecharczyk, after renting out air mattresses in their San Francisco apartment to pay their rent."),
            zh = LocalizedContent("Airbnb 成立于哪一年？", listOf("2008", "2006", "2010", "2012"), "科技", "Airbnb 由布莱恩·切斯基、乔·格比亚和内森·布莱查奇克于 2008 年创立，此前他们在旧金山的公寓里出租气垫床以支付房租。"),
            es = LocalizedContent("¿En qué año se fundó Airbnb?", listOf("2008", "2006", "2010", "2012"), "Tecnología", "Airbnb fue fundado en 2008 por Brian Chesky, Joe Gebbia y Nathan Blecharczyk, después de alquilar colchones inflables en su apartamento de San Francisco para pagar el alquiler.")
        ),
        BilingualQuestion(
            id = 11237, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui a créé Uber?", listOf("Travis Kalanick et Garrett Camp", "Mark Zuckerberg", "Jack Dorsey", "Evan Spiegel"), "Technologie", "Travis Kalanick et Garrett Camp ont cofondé Uber en 2009 pour résoudre le problème des taxis difficiles à trouver à San Francisco."),
            en = LocalizedContent("Who created Uber?", listOf("Travis Kalanick and Garrett Camp", "Mark Zuckerberg", "Jack Dorsey", "Evan Spiegel"), "Technology", "Travis Kalanick and Garrett Camp co-founded Uber in 2009 to solve the problem of hard-to-find taxis in San Francisco."),
            zh = LocalizedContent("谁创建了 Uber？", listOf("特拉维斯·卡兰尼克和加勒特·坎普", "马克·扎克伯格", "杰克·多西", "埃文·斯皮格尔"), "科技", "特拉维斯·卡兰尼克和加勒特·坎普于 2009 年共同创立了 Uber，以解决旧金山打车难的问题。"),
            es = LocalizedContent("¿Quién creó Uber?", listOf("Travis Kalanick y Garrett Camp", "Mark Zuckerberg", "Jack Dorsey", "Evan Spiegel"), "Tecnología", "Travis Kalanick y Garrett Camp cofundaron Uber en 2009 para resolver el problema de los taxis difíciles de encontrar en San Francisco.")
        ),
        BilingualQuestion(
            id = 11238, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année Uber a-t-il été fondé?", listOf("2009", "2007", "2011", "2013"), "Technologie", "Uber a été fondé en 2009 par Garrett Camp et Travis Kalanick à San Francisco, initialement sous le nom UberCab."),
            en = LocalizedContent("In what year was Uber founded?", listOf("2009", "2007", "2011", "2013"), "Technology", "Uber was founded in 2009 by Garrett Camp and Travis Kalanick in San Francisco, initially under the name UberCab."),
            zh = LocalizedContent("Uber 成立于哪一年？", listOf("2009", "2007", "2011", "2013"), "科技", "Uber 由加勒特·坎普和特拉维斯·卡兰尼克于 2009 年在旧金山创立，最初名为 UberCab。"),
            es = LocalizedContent("¿En qué año se fundó Uber?", listOf("2009", "2007", "2011", "2013"), "Tecnología", "Uber fue fundado en 2009 por Garrett Camp y Travis Kalanick en San Francisco, inicialmente con el nombre UberCab.")
        ),
        BilingualQuestion(
            id = 11239, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui a créé Spotify?", listOf("Daniel Ek et Martin Lorentzon", "Mark Zuckerberg", "Jack Dorsey", "Evan Spiegel"), "Technologie", "Daniel Ek et Martin Lorentzon ont cofondé Spotify en 2006 à Stockholm, en Suède, pour lutter contre le piratage musical."),
            en = LocalizedContent("Who created Spotify?", listOf("Daniel Ek and Martin Lorentzon", "Mark Zuckerberg", "Jack Dorsey", "Evan Spiegel"), "Technology", "Daniel Ek and Martin Lorentzon co-founded Spotify in 2006 in Stockholm, Sweden, to combat music piracy."),
            zh = LocalizedContent("谁创建了 Spotify？", listOf("丹尼尔·埃克和马丁·洛伦松", "马克·扎克伯格", "杰克·多西", "埃文·斯皮格尔"), "科技", "丹尼尔·埃克和马丁·洛伦松于 2006 年在瑞典斯德哥尔摩共同创立了 Spotify，以打击音乐盗版。"),
            es = LocalizedContent("¿Quién creó Spotify?", listOf("Daniel Ek y Martin Lorentzon", "Mark Zuckerberg", "Jack Dorsey", "Evan Spiegel"), "Tecnología", "Daniel Ek y Martin Lorentzon cofundaron Spotify en 2006 en Estocolmo, Suecia, para combatir la piratería musical.")
        ),
        BilingualQuestion(
            id = 11240, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année Spotify a-t-il été fondé?", listOf("2006", "2004", "2008", "2010"), "Technologie", "Spotify a été fondé en 2006 à Stockholm, en Suède, par Daniel Ek et Martin Lorentzon. Le service a été officiellement lancé en 2008."),
            en = LocalizedContent("In which year was Spotify founded?", listOf("2006", "2004", "2008", "2010"), "Technology", "Spotify was founded in 2006 in Stockholm, Sweden, by Daniel Ek and Martin Lorentzon. The service was officially launched in 2008."),
            zh = LocalizedContent("Spotify成立于哪一年？", listOf("2006", "2004", "2008", "2010"), "科技", "Spotify于2006年在瑞典斯德哥尔摩由Daniel Ek和Martin Lorentzon创立。该服务于2008年正式推出。"),
            es = LocalizedContent("¿En qué año se fundó Spotify?", listOf("2006", "2004", "2008", "2010"), "Tecnología", "Spotify fue fundado en 2006 en Estocolmo, Suecia, por Daniel Ek y Martin Lorentzon. El servicio se lanzó oficialmente en 2008.")
        ),
        BilingualQuestion(
            id = 11241, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui a créé Netflix?", listOf("Reed Hastings et Marc Randolph", "Mark Zuckerberg", "Jack Dorsey", "Evan Spiegel"), "Technologie", "Reed Hastings et Marc Randolph ont cofondé Netflix en 1997, initialement comme un service de location de DVD par correspondance, avant de le transformer en plateforme de streaming."),
            en = LocalizedContent("Who created Netflix?", listOf("Reed Hastings and Marc Randolph", "Mark Zuckerberg", "Jack Dorsey", "Evan Spiegel"), "Technology", "Reed Hastings and Marc Randolph co-founded Netflix in 1997, initially as a DVD rental-by-mail service, before transforming it into a streaming platform."),
            zh = LocalizedContent("谁创立了Netflix？", listOf("Reed Hastings和Marc Randolph", "Mark Zuckerberg", "Jack Dorsey", "Evan Spiegel"), "科技", "Reed Hastings和Marc Randolph于1997年共同创立了Netflix，最初是一家DVD邮寄租赁服务，后来转型为流媒体平台。"),
            es = LocalizedContent("¿Quién creó Netflix?", listOf("Reed Hastings y Marc Randolph", "Mark Zuckerberg", "Jack Dorsey", "Evan Spiegel"), "Tecnología", "Reed Hastings y Marc Randolph cofundaron Netflix en 1997, inicialmente como un servicio de alquiler de DVD por correo, antes de transformarlo en una plataforma de streaming.")
        ),
        BilingualQuestion(
            id = 11242, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année Netflix a-t-il été fondé?", listOf("1997", "1995", "1999", "2001"), "Technologie", "Netflix a été fondé en 1997 par Reed Hastings et Marc Randolph à Scotts Valley, en Californie, initialement comme un service de location de DVD par correspondance."),
            en = LocalizedContent("In which year was Netflix founded?", listOf("1997", "1995", "1999", "2001"), "Technology", "Netflix was founded in 1997 by Reed Hastings and Marc Randolph in Scotts Valley, California, initially as a DVD rental-by-mail service."),
            zh = LocalizedContent("Netflix成立于哪一年？", listOf("1997", "1995", "1999", "2001"), "科技", "Netflix于1997年由Reed Hastings和Marc Randolph在加利福尼亚州斯科茨谷创立，最初是一家DVD邮寄租赁服务。"),
            es = LocalizedContent("¿En qué año se fundó Netflix?", listOf("1997", "1995", "1999", "2001"), "Tecnología", "Netflix fue fundado en 1997 por Reed Hastings y Marc Randolph en Scotts Valley, California, inicialmente como un servicio de alquiler de DVD por correo.")
        ),
        BilingualQuestion(
            id = 11243, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui a créé Airbnb?", listOf("Airbnb", "Booking.com", "Expedia", "Hotels.com"), "Technologie", "Airbnb a été fondé en 2008 par Brian Chesky, Joe Gebbia et Nathan Blecharczyk à San Francisco, après que les deux premiers aient loué des matelas gonflables dans leur appartement lors d'une conférence."),
            en = LocalizedContent("Who created Airbnb?", listOf("Airbnb", "Booking.com", "Expedia", "Hotels.com"), "Technology", "Airbnb was founded in 2008 by Brian Chesky, Joe Gebbia and Nathan Blecharczyk in San Francisco, after the first two rented out air mattresses in their apartment during a conference."),
            zh = LocalizedContent("谁创立了Airbnb？", listOf("Airbnb", "Booking.com", "Expedia", "Hotels.com"), "科技", "Airbnb于2008年由Brian Chesky、Joe Gebbia和Nathan Blecharczyk在旧金山创立，此前两人在一次会议期间将公寓里的气垫床出租。"),
            es = LocalizedContent("¿Quién creó Airbnb?", listOf("Airbnb", "Booking.com", "Expedia", "Hotels.com"), "Tecnología", "Airbnb fue fundado en 2008 por Brian Chesky, Joe Gebbia y Nathan Blecharczyk en San Francisco, después de que los dos primeros alquilaran colchones inflables en su apartamento durante una conferencia.")
        ),
        BilingualQuestion(
            id = 11244, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année Airbnb a-t-il démarré le partage de logements?", listOf("2008", "2006", "2010", "2012"), "Technologie", "Airbnb a été fondé en 2008 à San Francisco, lorsque ses créateurs ont loué des matelas gonflables dans leur appartement pour pallier le manque d'hôtels lors d'une conférence."),
            en = LocalizedContent("In which year did Airbnb start home sharing?", listOf("2008", "2006", "2010", "2012"), "Technology", "Airbnb was founded in 2008 in San Francisco, when its creators rented out air mattresses in their apartment to compensate for the lack of hotels during a conference."),
            zh = LocalizedContent("Airbnb在哪一年开始共享住宿？", listOf("2008", "2006", "2010", "2012"), "科技", "Airbnb于2008年在旧金山创立，当时其创始人在一次会议期间出租公寓里的气垫床，以弥补酒店不足。"),
            es = LocalizedContent("¿En qué año comenzó Airbnb a compartir alojamiento?", listOf("2008", "2006", "2010", "2012"), "Tecnología", "Airbnb fue fundado en 2008 en San Francisco, cuando sus creadores alquilaron colchones inflables en su apartamento para compensar la falta de hoteles durante una conferencia.")
        ),
        BilingualQuestion(
            id = 11245, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a créé Amazon Web Services?", listOf("Andy Jassy", "Jeff Bezos", "Andy Jassy", "Werner Vogels"), "Technologie", "Andy Jassy a dirigé le développement d'Amazon Web Services, lancé en 2006, et en est devenu le PDG avant de succéder à Jeff Bezos comme PDG d'Amazon en 2021."),
            en = LocalizedContent("Who created Amazon Web Services?", listOf("Andy Jassy", "Jeff Bezos", "Andy Jassy", "Werner Vogels"), "Technology", "Andy Jassy led the development of Amazon Web Services, launched in 2006, and became its CEO before succeeding Jeff Bezos as CEO of Amazon in 2021."),
            zh = LocalizedContent("谁创立了Amazon Web Services？", listOf("Andy Jassy", "Jeff Bezos", "Andy Jassy", "Werner Vogels"), "科技", "Andy Jassy领导了Amazon Web Services的开发，该服务于2006年推出，他成为其CEO，并于2021年接替Jeff Bezos担任亚马逊CEO。"),
            es = LocalizedContent("¿Quién creó Amazon Web Services?", listOf("Andy Jassy", "Jeff Bezos", "Andy Jassy", "Werner Vogels"), "Tecnología", "Andy Jassy lideró el desarrollo de Amazon Web Services, lanzado en 2006, y se convirtió en su CEO antes de suceder a Jeff Bezos como CEO de Amazon en 2021.")
        ),
        BilingualQuestion(
            id = 11246, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année AWS a-t-il été lancé?", listOf("2006", "2004", "2008", "2010"), "Technologie", "Amazon Web Services a été officiellement lancé en 2006, proposant ses premiers services de cloud computing comme S3 et EC2."),
            en = LocalizedContent("In which year was AWS launched?", listOf("2006", "2004", "2008", "2010"), "Technology", "Amazon Web Services was officially launched in 2006, offering its first cloud computing services like S3 and EC2."),
            zh = LocalizedContent("AWS在哪一年推出？", listOf("2006", "2004", "2008", "2010"), "科技", "Amazon Web Services于2006年正式推出，提供其首批云计算服务，如S3和EC2。"),
            es = LocalizedContent("¿En qué año se lanzó AWS?", listOf("2006", "2004", "2008", "2010"), "Tecnología", "Amazon Web Services se lanzó oficialmente en 2006, ofreciendo sus primeros servicios de computación en la nube como S3 y EC2.")
        ),
        BilingualQuestion(
            id = 11247, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a créé Google Cloud?", listOf("Google", "Amazon", "Microsoft", "IBM"), "Technologie", "Google Cloud est une suite de services de cloud computing proposée par Google, lancée en 2008. Elle fait partie intégrante des offres technologiques de l'entreprise."),
            en = LocalizedContent("Who created Google Cloud?", listOf("Google", "Amazon", "Microsoft", "IBM"), "Technology", "Google Cloud is a suite of cloud computing services offered by Google, launched in 2008. It is an integral part of the company's technology offerings."),
            zh = LocalizedContent("谁创立了Google Cloud？", listOf("Google", "Amazon", "Microsoft", "IBM"), "科技", "Google Cloud是Google提供的一套云计算服务，于2008年推出。它是该公司技术产品的重要组成部分。"),
            es = LocalizedContent("¿Quién creó Google Cloud?", listOf("Google", "Amazon", "Microsoft", "IBM"), "Tecnología", "Google Cloud es un conjunto de servicios de computación en la nube ofrecidos por Google, lanzado en 2008. Es una parte integral de las ofertas tecnológicas de la empresa.")
        ),
        BilingualQuestion(
            id = 11248, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année Google Cloud a-t-il été lancé?", listOf("2008", "2006", "2010", "2012"), "Technologie", "Google Cloud a été officiellement lancé en 2008 avec l'introduction d'App Engine, le premier service de cloud computing de Google."),
            en = LocalizedContent("In which year was Google Cloud launched?", listOf("2008", "2006", "2010", "2012"), "Technology", "Google Cloud was officially launched in 2008 with the introduction of App Engine, Google's first cloud computing service."),
            zh = LocalizedContent("Google Cloud在哪一年推出？", listOf("2008", "2006", "2010", "2012"), "科技", "Google Cloud于2008年正式推出，推出了App Engine，这是Google的第一个云计算服务。"),
            es = LocalizedContent("¿En qué año se lanzó Google Cloud?", listOf("2008", "2006", "2010", "2012"), "Tecnología", "Google Cloud se lanzó oficialmente en 2008 con la introducción de App Engine, el primer servicio de computación en la nube de Google.")
        ),
        BilingualQuestion(
            id = 11249, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a créé Microsoft Azure?", listOf("Microsoft", "Google", "Amazon", "IBM"), "Technologie", "Microsoft Azure est la plateforme de cloud computing de Microsoft, lancée en 2010 sous le nom Windows Azure."),
            en = LocalizedContent("Who created Microsoft Azure?", listOf("Microsoft", "Google", "Amazon", "IBM"), "Technology", "Microsoft Azure is Microsoft's cloud computing platform, launched in 2010 under the name Windows Azure."),
            zh = LocalizedContent("谁创立了Microsoft Azure？", listOf("Microsoft", "Google", "Amazon", "IBM"), "科技", "Microsoft Azure是微软的云计算平台，于2010年以Windows Azure的名称推出。"),
            es = LocalizedContent("¿Quién creó Microsoft Azure?", listOf("Microsoft", "Google", "Amazon", "IBM"), "Tecnología", "Microsoft Azure es la plataforma de computación en la nube de Microsoft, lanzada en 2010 bajo el nombre de Windows Azure.")
        ),
    )

    private fun part5(): List<BilingualQuestion> = listOf(
        BilingualQuestion(
            id = 11250, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année Azure a-t-il été lancé?", listOf("2010", "2008", "2012", "2014"), "Technologie", "Azure, le service cloud de Microsoft, a été officiellement lancé en 2010 sous le nom Windows Azure, avant d'être renommé Microsoft Azure en 2014."),
            en = LocalizedContent("In what year was Azure launched?", listOf("2010", "2008", "2012", "2014"), "Technology", "Azure, Microsoft's cloud service, was officially launched in 2010 under the name Windows Azure, before being renamed Microsoft Azure in 2014."),
            zh = LocalizedContent("Azure 是在哪一年推出的？", listOf("2010", "2008", "2012", "2014"), "科技", "微软的云服务 Azure 于 2010 年以 Windows Azure 的名称正式推出，随后在 2014 年更名为 Microsoft Azure。"),
            es = LocalizedContent("¿En qué año se lanzó Azure?", listOf("2010", "2008", "2012", "2014"), "Tecnología", "Azure, el servicio en la nube de Microsoft, se lanzó oficialmente en 2010 con el nombre Windows Azure, antes de ser renombrado Microsoft Azure en 2014.")
        ),
        BilingualQuestion(
            id = 11251, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand cloud provider du monde?", listOf("Amazon Web Services", "Microsoft Azure", "Google Cloud", "IBM Cloud"), "Technologie", "Amazon Web Services (AWS) est le leader mondial du cloud computing, détenant la plus grande part de marché devant Microsoft Azure et Google Cloud."),
            en = LocalizedContent("What is the largest cloud provider in the world?", listOf("Amazon Web Services", "Microsoft Azure", "Google Cloud", "IBM Cloud"), "Technology", "Amazon Web Services (AWS) is the global leader in cloud computing, holding the largest market share ahead of Microsoft Azure and Google Cloud."),
            zh = LocalizedContent("世界上最大的云服务提供商是哪个？", listOf("亚马逊云服务", "微软 Azure", "谷歌云", "IBM 云"), "科技", "亚马逊云服务（AWS）是云计算领域的全球领导者，市场份额最大，领先于微软 Azure 和谷歌云。"),
            es = LocalizedContent("¿Cuál es el mayor proveedor de nube del mundo?", listOf("Amazon Web Services", "Microsoft Azure", "Google Cloud", "IBM Cloud"), "Tecnología", "Amazon Web Services (AWS) es el líder mundial en computación en la nube, con la mayor cuota de mercado por delante de Microsoft Azure y Google Cloud.")
        ),
        BilingualQuestion(
            id = 11252, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année Kubernetes a-t-il été créé?", listOf("2014", "2012", "2016", "2018"), "Technologie", "Kubernetes a été initialement développé par Google et annoncé en 2014, avant d'être offert à la Cloud Native Computing Foundation en 2015."),
            en = LocalizedContent("In what year was Kubernetes created?", listOf("2014", "2012", "2016", "2018"), "Technology", "Kubernetes was initially developed by Google and announced in 2014, before being donated to the Cloud Native Computing Foundation in 2015."),
            zh = LocalizedContent("Kubernetes 是在哪一年创建的？", listOf("2014", "2012", "2016", "2018"), "科技", "Kubernetes 最初由谷歌开发并于 2014 年宣布，随后于 2015 年捐赠给云原生计算基金会。"),
            es = LocalizedContent("¿En qué año se creó Kubernetes?", listOf("2014", "2012", "2016", "2018"), "Tecnología", "Kubernetes fue desarrollado inicialmente por Google y anunciado en 2014, antes de ser donado a la Cloud Native Computing Foundation en 2015.")
        ),
        BilingualQuestion(
            id = 11253, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le principal langage de programmation pour le machine learning?", listOf("Python", "Java", "C++", "JavaScript"), "Technologie", "Python est devenu le langage de référence pour le machine learning grâce à sa simplicité et à ses bibliothèques spécialisées comme TensorFlow et scikit-learn."),
            en = LocalizedContent("What is the main programming language for machine learning?", listOf("Python", "Java", "C++", "JavaScript"), "Technology", "Python has become the reference language for machine learning due to its simplicity and specialized libraries like TensorFlow and scikit-learn."),
            zh = LocalizedContent("机器学习的主要编程语言是什么？", listOf("Python", "Java", "C++", "JavaScript"), "科技", "Python 因其简洁性和 TensorFlow、scikit-learn 等专业库而成为机器学习的首选语言。"),
            es = LocalizedContent("¿Cuál es el principal lenguaje de programación para el machine learning?", listOf("Python", "Java", "C++", "JavaScript"), "Tecnología", "Python se ha convertido en el lenguaje de referencia para el machine learning gracias a su simplicidad y a bibliotecas especializadas como TensorFlow y scikit-learn.")
        ),
        BilingualQuestion(
            id = 11254, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année TensorFlow a-t-il été lancé?", listOf("2015", "2013", "2017", "2019"), "Technologie", "TensorFlow, la bibliothèque open-source de machine learning développée par Google, a été officiellement publiée en novembre 2015."),
            en = LocalizedContent("In what year was TensorFlow launched?", listOf("2015", "2013", "2017", "2019"), "Technology", "TensorFlow, the open-source machine learning library developed by Google, was officially released in November 2015."),
            zh = LocalizedContent("TensorFlow 是在哪一年推出的？", listOf("2015", "2013", "2017", "2019"), "科技", "TensorFlow 是谷歌开发的开源机器学习库，于 2015 年 11 月正式发布。"),
            es = LocalizedContent("¿En qué año se lanzó TensorFlow?", listOf("2015", "2013", "2017", "2019"), "Tecnología", "TensorFlow, la biblioteca de machine learning de código abierto desarrollada por Google, se lanzó oficialmente en noviembre de 2015.")
        ),
        BilingualQuestion(
            id = 11255, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le principal framework de deep learning?", listOf("TensorFlow", "Keras", "PyTorch", "Caffe"), "Technologie", "TensorFlow, développé par Google, est le framework de deep learning le plus utilisé grâce à sa flexibilité et son large écosystème pour la recherche et la production."),
            en = LocalizedContent("What is the main deep learning framework?", listOf("TensorFlow", "Keras", "PyTorch", "Caffe"), "Technology", "TensorFlow, developed by Google, is the most used deep learning framework due to its flexibility and large ecosystem for research and production."),
            zh = LocalizedContent("主要的深度学习框架是什么？", listOf("TensorFlow", "Keras", "PyTorch", "Caffe"), "科技", "TensorFlow 由谷歌开发，因其灵活性和用于研究与生产的庞大生态系统而成为最常用的深度学习框架。"),
            es = LocalizedContent("¿Cuál es el principal framework de deep learning?", listOf("TensorFlow", "Keras", "PyTorch", "Caffe"), "Tecnología", "TensorFlow, desarrollado por Google, es el framework de deep learning más utilizado gracias a su flexibilidad y su amplio ecosistema para la investigación y la producción.")
        ),
        BilingualQuestion(
            id = 11256, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année PyTorch a-t-il été lancé?", listOf("2016", "2014", "2018", "2020"), "Technologie", "PyTorch a été officiellement lancé en septembre 2016 par l'équipe de recherche en IA de Facebook, devenant rapidement une bibliothèque populaire pour l'apprentissage profond."),
            en = LocalizedContent("In what year was PyTorch launched?", listOf("2016", "2014", "2018", "2020"), "Technology", "PyTorch was officially launched in September 2016 by Facebook's AI research team, quickly becoming a popular library for deep learning."),
            zh = LocalizedContent("PyTorch 是在哪一年推出的？", listOf("2016", "2014", "2018", "2020"), "科技", "PyTorch 于 2016 年 9 月由 Facebook 的 AI 研究团队正式推出，迅速成为流行的深度学习库。"),
            es = LocalizedContent("¿En qué año se lanzó PyTorch?", listOf("2016", "2014", "2018", "2020"), "Tecnología", "PyTorch se lanzó oficialmente en septiembre de 2016 por el equipo de investigación de IA de Facebook, convirtiéndose rápidamente en una biblioteca popular para el aprendizaje profundo.")
        ),
        BilingualQuestion(
            id = 11257, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui a créé OpenAI?", listOf("Sam Altman, Elon Musk et al.", "Mark Zuckerberg", "Jack Dorsey", "Evan Spiegel"), "Technologie", "OpenAI a été fondée en 2015 par Sam Altman, Elon Musk et plusieurs autres investisseurs, dans le but de promouvoir et développer une intelligence artificielle bénéfique pour l'humanité."),
            en = LocalizedContent("Who created OpenAI?", listOf("Sam Altman, Elon Musk et al.", "Mark Zuckerberg", "Jack Dorsey", "Evan Spiegel"), "Technology", "OpenAI was founded in 2015 by Sam Altman, Elon Musk, and several other investors, with the goal of promoting and developing beneficial artificial intelligence for humanity."),
            zh = LocalizedContent("谁创立了 OpenAI？", listOf("Sam Altman、Elon Musk 等人", "马克·扎克伯格", "杰克·多西", "埃文·斯皮格尔"), "科技", "OpenAI 于 2015 年由 Sam Altman、Elon Musk 和其他几位投资者创立，旨在促进和发展有益于人类的人工智能。"),
            es = LocalizedContent("¿Quién creó OpenAI?", listOf("Sam Altman, Elon Musk y otros", "Mark Zuckerberg", "Jack Dorsey", "Evan Spiegel"), "Tecnología", "OpenAI fue fundada en 2015 por Sam Altman, Elon Musk y varios otros inversores, con el objetivo de promover y desarrollar una inteligencia artificial beneficiosa para la humanidad.")
        ),
        BilingualQuestion(
            id = 11258, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année OpenAI a-t-il été fondé?", listOf("2015", "2013", "2017", "2019"), "Technologie", "OpenAI a été fondée en décembre 2015 par Elon Musk, Sam Altman et d'autres, dans le but de promouvoir une intelligence artificielle bénéfique pour l'humanité."),
            en = LocalizedContent("In what year was OpenAI founded?", listOf("2015", "2013", "2017", "2019"), "Technology", "OpenAI was founded in December 2015 by Elon Musk, Sam Altman, and others, with the goal of promoting beneficial artificial intelligence for humanity."),
            zh = LocalizedContent("OpenAI 是在哪一年成立的？", listOf("2015", "2013", "2017", "2019"), "科技", "OpenAI 于 2015 年 12 月由 Elon Musk、Sam Altman 等人创立，旨在促进有益于人类的人工智能。"),
            es = LocalizedContent("¿En qué año se fundó OpenAI?", listOf("2015", "2013", "2017", "2019"), "Tecnología", "OpenAI fue fundada en diciembre de 2015 por Elon Musk, Sam Altman y otros, con el objetivo de promover una inteligencia artificial beneficiosa para la humanidad.")
        ),
        BilingualQuestion(
            id = 11259, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le modèle de langage créé par OpenAI?", listOf("GPT", "BERT", "Transformer", "Megatron"), "Technologie", "OpenAI a développé la série de modèles de langage GPT, dont le premier est sorti en 2018, révolutionnant le traitement du langage naturel par l'intelligence artificielle."),
            en = LocalizedContent("What is the language model created by OpenAI?", listOf("GPT", "BERT", "Transformer", "Megatron"), "Technology", "OpenAI developed the GPT series of language models, the first of which was released in 2018, revolutionizing natural language processing through artificial intelligence."),
            zh = LocalizedContent("OpenAI 创建的语言模型是什么？", listOf("GPT", "BERT", "Transformer", "Megatron"), "科技", "OpenAI 开发了 GPT 系列语言模型，首个模型于 2018 年发布，通过人工智能彻底改变了自然语言处理。"),
            es = LocalizedContent("¿Cuál es el modelo de lenguaje creado por OpenAI?", listOf("GPT", "BERT", "Transformer", "Megatron"), "Tecnología", "OpenAI desarrolló la serie de modelos de lenguaje GPT, el primero de los cuales se lanzó en 2018, revolucionando el procesamiento del lenguaje natural mediante inteligencia artificial.")
        ),
        BilingualQuestion(
            id = 11260, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("En quelle année ChatGPT a-t-il été lancé?", listOf("2022", "2020", "2024", "2025"), "Technologie", "ChatGPT a été lancé par OpenAI le 30 novembre 2022, marquant une avancée majeure dans l'accès public aux modèles de langage conversationnels."),
            en = LocalizedContent("In what year was ChatGPT launched?", listOf("2022", "2020", "2024", "2025"), "Technology", "ChatGPT was launched by OpenAI on November 30, 2022, marking a major advance in public access to conversational language models."),
            zh = LocalizedContent("ChatGPT是在哪一年推出的？", listOf("2022", "2020", "2024", "2025"), "科技", "ChatGPT由OpenAI于2022年11月30日推出，标志着公众获取对话式语言模型的重大进步。"),
            es = LocalizedContent("¿En qué año se lanzó ChatGPT?", listOf("2022", "2020", "2024", "2025"), "Tecnología", "ChatGPT fue lanzado por OpenAI el 30 de noviembre de 2022, marcando un avance importante en el acceso público a modelos de lenguaje conversacionales.")
        ),
        BilingualQuestion(
            id = 11261, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le premier modèle GPT créé par OpenAI?", listOf("GPT-1", "GPT-2", "GPT-3", "GPT-4"), "Technologie", "OpenAI a lancé GPT-1 en 2018, marquant le premier modèle de la série Generative Pre-trained Transformer, posant les bases des versions ultérieures."),
            en = LocalizedContent("What is the first GPT model created by OpenAI?", listOf("GPT-1", "GPT-2", "GPT-3", "GPT-4"), "Technology", "OpenAI launched GPT-1 in 2018, marking the first model of the Generative Pre-trained Transformer series, laying the foundation for later versions."),
            zh = LocalizedContent("OpenAI创建的第一个GPT模型是什么？", listOf("GPT-1", "GPT-2", "GPT-3", "GPT-4"), "科技", "OpenAI于2018年推出了GPT-1，这是生成式预训练Transformer系列的第一个模型，为后续版本奠定了基础。"),
            es = LocalizedContent("¿Cuál es el primer modelo GPT creado por OpenAI?", listOf("GPT-1", "GPT-2", "GPT-3", "GPT-4"), "Tecnología", "OpenAI lanzó GPT-1 en 2018, marcando el primer modelo de la serie Generative Pre-trained Transformer, sentando las bases para versiones posteriores.")
        ),
        BilingualQuestion(
            id = 11262, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année GPT-3 a-t-il été lancé?", listOf("2020", "2018", "2022", "2024"), "Technologie", "GPT-3 a été présenté par OpenAI en juin 2020, marquant une avancée majeure dans les modèles de langage avec ses 175 milliards de paramètres."),
            en = LocalizedContent("In what year was GPT-3 launched?", listOf("2020", "2018", "2022", "2024"), "Technology", "GPT-3 was introduced by OpenAI in June 2020, marking a major advance in language models with its 175 billion parameters."),
            zh = LocalizedContent("GPT-3是在哪一年推出的？", listOf("2020", "2018", "2022", "2024"), "科技", "GPT-3由OpenAI于2020年6月推出，以其1750亿个参数标志着语言模型的重大进步。"),
            es = LocalizedContent("¿En qué año se lanzó GPT-3?", listOf("2020", "2018", "2022", "2024"), "Tecnología", "GPT-3 fue presentado por OpenAI en junio de 2020, marcando un avance importante en los modelos de lenguaje con sus 175 mil millones de parámetros.")
        ),
        BilingualQuestion(
            id = 11263, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le créateur de Claude?", listOf("Anthropic", "OpenAI", "Google", "Meta"), "Technologie", "Anthropic est la société d'intelligence artificielle fondée par d'anciens employés d'OpenAI, qui a développé le modèle de langage Claude."),
            en = LocalizedContent("Who is the creator of Claude?", listOf("Anthropic", "OpenAI", "Google", "Meta"), "Technology", "Anthropic is the artificial intelligence company founded by former OpenAI employees, which developed the Claude language model."),
            zh = LocalizedContent("Claude的创造者是谁？", listOf("Anthropic", "OpenAI", "Google", "Meta"), "科技", "Anthropic是一家由前OpenAI员工创立的人工智能公司，开发了Claude语言模型。"),
            es = LocalizedContent("¿Quién es el creador de Claude?", listOf("Anthropic", "OpenAI", "Google", "Meta"), "Tecnología", "Anthropic es la empresa de inteligencia artificial fundada por exempleados de OpenAI, que desarrolló el modelo de lenguaje Claude.")
        ),
        BilingualQuestion(
            id = 11264, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année Claude a-t-il été lancé?", listOf("2023", "2021", "2025", "2026"), "Technologie", "Claude, le modèle d'IA développé par Anthropic, a été lancé pour la première fois en mars 2023."),
            en = LocalizedContent("In what year was Claude launched?", listOf("2023", "2021", "2025", "2026"), "Technology", "Claude, the AI model developed by Anthropic, was first launched in March 2023."),
            zh = LocalizedContent("Claude是在哪一年推出的？", listOf("2023", "2021", "2025", "2026"), "科技", "Claude是由Anthropic开发的人工智能模型，于2023年3月首次推出。"),
            es = LocalizedContent("¿En qué año se lanzó Claude?", listOf("2023", "2021", "2025", "2026"), "Tecnología", "Claude, el modelo de IA desarrollado por Anthropic, se lanzó por primera vez en marzo de 2023.")
        ),
        BilingualQuestion(
            id = 11265, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le principal concurrent de ChatGPT?", listOf("Claude", "Bard", "LLaMA", "Copilot"), "Technologie", "Développé par Anthropic, Claude est un modèle de langage concurrent direct de ChatGPT, créé par OpenAI, tous deux leaders dans le domaine de l'IA générative."),
            en = LocalizedContent("What is the main competitor of ChatGPT?", listOf("Claude", "Bard", "LLaMA", "Copilot"), "Technology", "Developed by Anthropic, Claude is a direct competitor to ChatGPT, created by OpenAI, both leaders in the field of generative AI."),
            zh = LocalizedContent("ChatGPT的主要竞争对手是什么？", listOf("Claude", "Bard", "LLaMA", "Copilot"), "科技", "由Anthropic开发的Claude是ChatGPT的直接竞争对手，两者都是生成式AI领域的领导者。"),
            es = LocalizedContent("¿Cuál es el principal competidor de ChatGPT?", listOf("Claude", "Bard", "LLaMA", "Copilot"), "Tecnología", "Desarrollado por Anthropic, Claude es un competidor directo de ChatGPT, creado por OpenAI, ambos líderes en el campo de la IA generativa.")
        ),
        BilingualQuestion(
            id = 11266, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année Bard a-t-il été lancé?", listOf("2023", "2021", "2025", "2026"), "Technologie", "Bard, le chatbot conversationnel de Google, a été lancé en mars 2023 en réponse à la popularité de ChatGPT."),
            en = LocalizedContent("In what year was Bard launched?", listOf("2023", "2021", "2025", "2026"), "Technology", "Bard, Google's conversational chatbot, was launched in March 2023 in response to the popularity of ChatGPT."),
            zh = LocalizedContent("Bard是在哪一年推出的？", listOf("2023", "2021", "2025", "2026"), "科技", "Bard是谷歌的对话式聊天机器人，于2023年3月推出，以回应ChatGPT的流行。"),
            es = LocalizedContent("¿En qué año se lanzó Bard?", listOf("2023", "2021", "2025", "2026"), "Tecnología", "Bard, el chatbot conversacional de Google, se lanzó en marzo de 2023 en respuesta a la popularidad de ChatGPT.")
        ),
        BilingualQuestion(
            id = 11267, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui a créé Meta?", listOf("Mark Zuckerberg", "Bill Gates", "Steve Jobs", "Elon Musk"), "Technologie", "Mark Zuckerberg a fondé Facebook en 2004, puis a renommé la société mère Meta en 2021 pour refléter son orientation vers le métavers."),
            en = LocalizedContent("Who created Meta?", listOf("Mark Zuckerberg", "Bill Gates", "Steve Jobs", "Elon Musk"), "Technology", "Mark Zuckerberg founded Facebook in 2004, then renamed the parent company Meta in 2021 to reflect its focus on the metaverse."),
            zh = LocalizedContent("谁创建了Meta？", listOf("马克·扎克伯格", "比尔·盖茨", "史蒂夫·乔布斯", "埃隆·马斯克"), "科技", "马克·扎克伯格于2004年创立了Facebook，随后于2021年将母公司更名为Meta，以反映其对元宇宙的关注。"),
            es = LocalizedContent("¿Quién creó Meta?", listOf("Mark Zuckerberg", "Bill Gates", "Steve Jobs", "Elon Musk"), "Tecnología", "Mark Zuckerberg fundó Facebook en 2004, luego renombró la empresa matriz como Meta en 2021 para reflejar su enfoque en el metaverso.")
        ),
        BilingualQuestion(
            id = 11268, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année Meta a-t-il changé son nom?", listOf("2021", "2019", "2023", "2025"), "Technologie", "Meta, alors connu sous le nom de Facebook Inc., a annoncé ce changement de nom en octobre 2021 pour refléter son recentrage sur le métavers."),
            en = LocalizedContent("In what year did Meta change its name?", listOf("2021", "2019", "2023", "2025"), "Technology", "Meta, then known as Facebook Inc., announced this name change in October 2021 to reflect its refocus on the metaverse."),
            zh = LocalizedContent("Meta在哪一年更名？", listOf("2021", "2019", "2023", "2025"), "科技", "Meta（当时名为Facebook Inc.）于2021年10月宣布更名，以反映其对元宇宙的重新聚焦。"),
            es = LocalizedContent("¿En qué año cambió Meta su nombre?", listOf("2021", "2019", "2023", "2025"), "Tecnología", "Meta, entonces conocida como Facebook Inc., anunció este cambio de nombre en octubre de 2021 para reflejar su reenfoque en el metaverso.")
        ),
        BilingualQuestion(
            id = 11269, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le principal projet de Meta?", listOf("Metaverse", "Oculus", "Portal", "WhatsApp"), "Technologie", "Meta a annoncé en 2021 son pivot stratégique vers le métavers, un univers virtuel collectif, en changeant même son nom de Facebook pour refléter cette priorité."),
            en = LocalizedContent("What is Meta's main project?", listOf("Metaverse", "Oculus", "Portal", "WhatsApp"), "Technology", "Meta announced in 2021 its strategic pivot to the metaverse, a collective virtual universe, even changing its name from Facebook to reflect this priority."),
            zh = LocalizedContent("Meta的主要项目是什么？", listOf("元宇宙", "Oculus", "Portal", "WhatsApp"), "科技", "Meta于2021年宣布战略转向元宇宙（一个集体虚拟宇宙），甚至将Facebook更名为Meta以反映这一优先事项。"),
            es = LocalizedContent("¿Cuál es el proyecto principal de Meta?", listOf("Metaverso", "Oculus", "Portal", "WhatsApp"), "Tecnología", "Meta anunció en 2021 su giro estratégico hacia el metaverso, un universo virtual colectivo, incluso cambiando su nombre de Facebook para reflejar esta prioridad.")
        ),
        BilingualQuestion(
            id = 11270, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année le metaverse a-t-il commencé à se développer?", listOf("2021", "2019", "2023", "2025"), "Technologie", "Le terme \"metaverse\" a gagné en popularité en 2021 après que Mark Zuckerberg a annoncé le changement de nom de Facebook en Meta, marquant un tournant médiatique et d'investissement majeur."),
            en = LocalizedContent("In which year did the metaverse start to develop?", listOf("2021", "2019", "2023", "2025"), "Technology", "The term \"metaverse\" gained popularity in 2021 after Mark Zuckerberg announced the rebranding of Facebook to Meta, marking a major media and investment turning point."),
            zh = LocalizedContent("元宇宙是在哪一年开始发展的？", listOf("2021", "2019", "2023", "2025"), "科技", "“元宇宙”一词在2021年马克·扎克伯格宣布将Facebook更名为Meta后开始流行，标志着媒体和投资的重大转折点。"),
            es = LocalizedContent("¿En qué año comenzó a desarrollarse el metaverso?", listOf("2021", "2019", "2023", "2025"), "Tecnología", "El término \"metaverso\" ganó popularidad en 2021 después de que Mark Zuckerberg anunciara el cambio de nombre de Facebook a Meta, marcando un punto de inflexión mediático y de inversión.")
        ),
        BilingualQuestion(
            id = 11271, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui a créé Ethereum?", listOf("Vitalik Buterin", "Satoshi Nakamoto", "Charlie Lee", "Roger Ver"), "Technologie", "Vitalik Buterin, un programmeur canado-russe, a proposé Ethereum en 2013 et l'a cofondé en 2015, introduisant les contrats intelligents et la blockchain programmable."),
            en = LocalizedContent("Who created Ethereum?", listOf("Vitalik Buterin", "Satoshi Nakamoto", "Charlie Lee", "Roger Ver"), "Technology", "Vitalik Buterin, a Canadian-Russian programmer, proposed Ethereum in 2013 and co-founded it in 2015, introducing smart contracts and programmable blockchain."),
            zh = LocalizedContent("谁创建了以太坊？", listOf("维塔利克·布特林", "中本聪", "查理·李", "罗杰·维尔"), "科技", "维塔利克·布特林，一位加拿大裔俄罗斯程序员，于2013年提出以太坊，并于2015年共同创立，引入了智能合约和可编程区块链。"),
            es = LocalizedContent("¿Quién creó Ethereum?", listOf("Vitalik Buterin", "Satoshi Nakamoto", "Charlie Lee", "Roger Ver"), "Tecnología", "Vitalik Buterin, un programador canadiense-ruso, propuso Ethereum en 2013 y lo cofundó en 2015, introduciendo contratos inteligentes y blockchain programable.")
        ),
        BilingualQuestion(
            id = 11272, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année Ethereum a-t-il été fondé?", listOf("2015", "2013", "2017", "2019"), "Technologie", "Ethereum a été proposé fin 2013 par Vitalik Buterin, et son réseau principal a été lancé le 30 juillet 2015."),
            en = LocalizedContent("In which year was Ethereum founded?", listOf("2015", "2013", "2017", "2019"), "Technology", "Ethereum was proposed in late 2013 by Vitalik Buterin, and its mainnet was launched on July 30, 2015."),
            zh = LocalizedContent("以太坊是在哪一年创立的？", listOf("2015", "2013", "2017", "2019"), "科技", "以太坊由维塔利克·布特林于2013年底提出，其主网于2015年7月30日启动。"),
            es = LocalizedContent("¿En qué año se fundó Ethereum?", listOf("2015", "2013", "2017", "2019"), "Tecnología", "Ethereum fue propuesto a finales de 2013 por Vitalik Buterin, y su red principal se lanzó el 30 de julio de 2015.")
        ),
        BilingualQuestion(
            id = 11273, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le langage de programmation utilisé pour Ethereum?", listOf("Solidity", "Rust", "Go", "C++"), "Technologie", "Solidity est un langage de programmation orienté objet conçu spécifiquement pour développer des smart contracts sur la blockchain Ethereum. Il permet d'écrire des contrats auto-exécutables qui régissent les transactions."),
            en = LocalizedContent("What is the programming language used for Ethereum?", listOf("Solidity", "Rust", "Go", "C++"), "Technology", "Solidity is an object-oriented programming language designed specifically for developing smart contracts on the Ethereum blockchain. It allows writing self-executing contracts that govern transactions."),
            zh = LocalizedContent("以太坊使用的编程语言是什么？", listOf("Solidity", "Rust", "Go", "C++"), "科技", "Solidity是一种面向对象的编程语言，专门为在以太坊区块链上开发智能合约而设计。它允许编写自动执行合约来管理交易。"),
            es = LocalizedContent("¿Cuál es el lenguaje de programación utilizado para Ethereum?", listOf("Solidity", "Rust", "Go", "C++"), "Tecnología", "Solidity es un lenguaje de programación orientado a objetos diseñado específicamente para desarrollar contratos inteligentes en la blockchain de Ethereum. Permite escribir contratos auto-ejecutables que rigen las transacciones.")
        ),
        BilingualQuestion(
            id = 11274, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année Solidity a-t-il été créé?", listOf("2014", "2012", "2016", "2018"), "Technologie", "Solidity a été créé en 2014 par Gavin Wood, Christian Reitwiessner et d'autres contributeurs pour développer des contrats intelligents sur la blockchain Ethereum."),
            en = LocalizedContent("In which year was Solidity created?", listOf("2014", "2012", "2016", "2018"), "Technology", "Solidity was created in 2014 by Gavin Wood, Christian Reitwiessner, and other contributors to develop smart contracts on the Ethereum blockchain."),
            zh = LocalizedContent("Solidity是在哪一年创建的？", listOf("2014", "2012", "2016", "2018"), "科技", "Solidity由加文·伍德、克里斯蒂安·雷特维森纳和其他贡献者于2014年创建，用于在以太坊区块链上开发智能合约。"),
            es = LocalizedContent("¿En qué año se creó Solidity?", listOf("2014", "2012", "2016", "2018"), "Tecnología", "Solidity fue creado en 2014 por Gavin Wood, Christian Reitwiessner y otros colaboradores para desarrollar contratos inteligentes en la blockchain de Ethereum.")
        ),
        BilingualQuestion(
            id = 11275, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a créé Dogecoin?", listOf("Billy Markus et Jackson Palmer", "Satoshi Nakamoto", "Charlie Lee", "Roger Ver"), "Technologie", "Billy Markus et Jackson Palmer ont lancé Dogecoin en 2013 comme une parodie des cryptomonnaies, inspirée par le mème du chien Shiba Inu."),
            en = LocalizedContent("Who created Dogecoin?", listOf("Billy Markus and Jackson Palmer", "Satoshi Nakamoto", "Charlie Lee", "Roger Ver"), "Technology", "Billy Markus and Jackson Palmer launched Dogecoin in 2013 as a parody of cryptocurrencies, inspired by the Shiba Inu dog meme."),
            zh = LocalizedContent("谁创建了狗狗币？", listOf("比利·马库斯和杰克逊·帕尔默", "中本聪", "查理·李", "罗杰·维尔"), "科技", "比利·马库斯和杰克逊·帕尔默于2013年推出了狗狗币，作为对加密货币的恶搞，灵感来自柴犬表情包。"),
            es = LocalizedContent("¿Quién creó Dogecoin?", listOf("Billy Markus y Jackson Palmer", "Satoshi Nakamoto", "Charlie Lee", "Roger Ver"), "Tecnología", "Billy Markus y Jackson Palmer lanzaron Dogecoin en 2013 como una parodia de las criptomonedas, inspirada en el meme del perro Shiba Inu.")
        ),
        BilingualQuestion(
            id = 11276, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année Dogecoin a-t-il été créé?", listOf("2013", "2011", "2015", "2017"), "Technologie", "Dogecoin a été créé en 2013 par les ingénieurs Billy Markus et Jackson Palmer comme une parodie du Bitcoin, basée sur le mème du chien Shiba Inu."),
            en = LocalizedContent("In which year was Dogecoin created?", listOf("2013", "2011", "2015", "2017"), "Technology", "Dogecoin was created in 2013 by engineers Billy Markus and Jackson Palmer as a parody of Bitcoin, based on the Shiba Inu dog meme."),
            zh = LocalizedContent("狗狗币是在哪一年创建的？", listOf("2013", "2011", "2015", "2017"), "科技", "狗狗币由工程师比利·马库斯和杰克逊·帕尔默于2013年创建，作为对比特币的恶搞，基于柴犬表情包。"),
            es = LocalizedContent("¿En qué año se creó Dogecoin?", listOf("2013", "2011", "2015", "2017"), "Tecnología", "Dogecoin fue creado en 2013 por los ingenieros Billy Markus y Jackson Palmer como una parodia de Bitcoin, basada en el meme del perro Shiba Inu.")
        ),
        BilingualQuestion(
            id = 11277, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a créé Litecoin?", listOf("Charlie Lee", "Satoshi Nakamoto", "Billy Markus", "Roger Ver"), "Technologie", "Charlie Lee, un ancien ingénieur de Google, a lancé Litecoin en 2011 comme une alternative plus rapide et plus légère au Bitcoin."),
            en = LocalizedContent("Who created Litecoin?", listOf("Charlie Lee", "Satoshi Nakamoto", "Billy Markus", "Roger Ver"), "Technology", "Charlie Lee, a former Google engineer, launched Litecoin in 2011 as a faster and lighter alternative to Bitcoin."),
            zh = LocalizedContent("谁创建了莱特币？", listOf("查理·李", "中本聪", "比利·马库斯", "罗杰·维尔"), "科技", "查理·李，前谷歌工程师，于2011年推出了莱特币，作为比特币更快、更轻的替代品。"),
            es = LocalizedContent("¿Quién creó Litecoin?", listOf("Charlie Lee", "Satoshi Nakamoto", "Billy Markus", "Roger Ver"), "Tecnología", "Charlie Lee, un ex ingeniero de Google, lanzó Litecoin en 2011 como una alternativa más rápida y ligera a Bitcoin.")
        ),
        BilingualQuestion(
            id = 11278, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année Litecoin a-t-il été créé?", listOf("2011", "2009", "2013", "2015"), "Technologie", "Litecoin, une cryptomonnaie créée par Charlie Lee, a été lancée en 2011 comme une alternative plus rapide au Bitcoin."),
            en = LocalizedContent("In which year was Litecoin created?", listOf("2011", "2009", "2013", "2015"), "Technology", "Litecoin, a cryptocurrency created by Charlie Lee, was launched in 2011 as a faster alternative to Bitcoin."),
            zh = LocalizedContent("莱特币是在哪一年创建的？", listOf("2011", "2009", "2013", "2015"), "科技", "莱特币由查理·李创建，于2011年推出，作为比特币的更快替代品。"),
            es = LocalizedContent("¿En qué año se creó Litecoin?", listOf("2011", "2009", "2013", "2015"), "Tecnología", "Litecoin, una criptomoneda creada por Charlie Lee, se lanzó en 2011 como una alternativa más rápida a Bitcoin.")
        ),
        BilingualQuestion(
            id = 11279, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a créé Bitcoin Cash?", listOf("Roger Ver", "Satoshi Nakamoto", "Charlie Lee", "Billy Markus"), "Technologie", "Roger Ver, un early adopter et promoteur de Bitcoin, a soutenu la création de Bitcoin Cash en 2017 pour augmenter la taille des blocs et améliorer les transactions."),
            en = LocalizedContent("Who created Bitcoin Cash?", listOf("Roger Ver", "Satoshi Nakamoto", "Charlie Lee", "Billy Markus"), "Technology", "Roger Ver, an early adopter and promoter of Bitcoin, supported the creation of Bitcoin Cash in 2017 to increase block size and improve transactions."),
            zh = LocalizedContent("谁创建了比特币现金？", listOf("罗杰·维尔", "中本聪", "查理·李", "比利·马库斯"), "科技", "罗杰·维尔，比特币的早期采用者和推广者，支持了2017年比特币现金的创建，以增加区块大小并改善交易。"),
            es = LocalizedContent("¿Quién creó Bitcoin Cash?", listOf("Roger Ver", "Satoshi Nakamoto", "Charlie Lee", "Billy Markus"), "Tecnología", "Roger Ver, un adoptante temprano y promotor de Bitcoin, apoyó la creación de Bitcoin Cash en 2017 para aumentar el tamaño de los bloques y mejorar las transacciones.")
        ),
        BilingualQuestion(
            id = 11280, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année Bitcoin Cash a-t-il été créé?", listOf("2017", "2015", "2019", "2021"), "Technologie", "Bitcoin Cash a été créé en 2017 suite à un fork du réseau Bitcoin, visant à augmenter la taille des blocs pour améliorer les transactions."),
            en = LocalizedContent("In what year was Bitcoin Cash created?", listOf("2017", "2015", "2019", "2021"), "Technology", "Bitcoin Cash was created in 2017 following a fork of the Bitcoin network, aiming to increase block size to improve transactions."),
            zh = LocalizedContent("比特币现金是哪一年创建的？", listOf("2017", "2015", "2019", "2021"), "科技", "比特币现金于2017年通过比特币网络的分叉创建，旨在增加区块大小以改善交易。"),
            es = LocalizedContent("¿En qué año se creó Bitcoin Cash?", listOf("2017", "2015", "2019", "2021"), "Tecnología", "Bitcoin Cash se creó en 2017 tras una bifurcación de la red Bitcoin, con el objetivo de aumentar el tamaño de los bloques para mejorar las transacciones.")
        ),
        BilingualQuestion(
            id = 11281, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le premier antivirus commercial?", listOf("Norton AntiVirus", "McAfee", "Kaspersky", "AVG"), "Technologie", "Norton AntiVirus, lancé en 1990 par Peter Norton, est considéré comme le premier logiciel antivirus commercialisé auprès du grand public."),
            en = LocalizedContent("What is the first commercial antivirus?", listOf("Norton AntiVirus", "McAfee", "Kaspersky", "AVG"), "Technology", "Norton AntiVirus, launched in 1990 by Peter Norton, is considered the first antivirus software marketed to the general public."),
            zh = LocalizedContent("第一款商业防病毒软件是什么？", listOf("诺顿防病毒", "迈克菲", "卡巴斯基", "AVG"), "科技", "诺顿防病毒由彼得·诺顿于1990年推出，被认为是第一款面向大众市场的防病毒软件。"),
            es = LocalizedContent("¿Cuál es el primer antivirus comercial?", listOf("Norton AntiVirus", "McAfee", "Kaspersky", "AVG"), "Tecnología", "Norton AntiVirus, lanzado en 1990 por Peter Norton, es considerado el primer software antivirus comercializado para el público general.")
        ),
        BilingualQuestion(
            id = 11282, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année Norton AntiVirus a-t-il été lancé?", listOf("1991", "1989", "1993", "1995"), "Technologie", "Norton AntiVirus a été lancé en 1991 par Peter Norton, pionnier des logiciels de sécurité, pour protéger les ordinateurs contre les virus émergents."),
            en = LocalizedContent("In what year was Norton AntiVirus launched?", listOf("1991", "1989", "1993", "1995"), "Technology", "Norton AntiVirus was launched in 1991 by Peter Norton, a pioneer in security software, to protect computers against emerging viruses."),
            zh = LocalizedContent("诺顿防病毒是哪一年推出的？", listOf("1991", "1989", "1993", "1995"), "科技", "诺顿防病毒由安全软件先驱彼得·诺顿于1991年推出，旨在保护计算机免受新兴病毒的侵害。"),
            es = LocalizedContent("¿En qué año se lanzó Norton AntiVirus?", listOf("1991", "1989", "1993", "1995"), "Tecnología", "Norton AntiVirus fue lanzado en 1991 por Peter Norton, pionero en software de seguridad, para proteger las computadoras contra virus emergentes.")
        ),
        BilingualQuestion(
            id = 11283, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a créé le premier ver informatique?", listOf("Robert Morris Jr.", "Satoshi Nakamoto", "Charlie Lee", "Billy Markus"), "Technologie", "En novembre 1988, Robert Morris Jr., étudiant à Cornell, a lancé le premier ver informatique depuis le MIT, infectant environ 6 000 ordinateurs sur l'ARPANET."),
            en = LocalizedContent("Who created the first computer worm?", listOf("Robert Morris Jr.", "Satoshi Nakamoto", "Charlie Lee", "Billy Markus"), "Technology", "In November 1988, Robert Morris Jr., a student at Cornell, launched the first computer worm from MIT, infecting about 6,000 computers on ARPANET."),
            zh = LocalizedContent("谁创造了第一个计算机蠕虫？", listOf("小罗伯特·莫里斯", "中本聪", "李启威", "比利·马库斯"), "科技", "1988年11月，康奈尔大学学生小罗伯特·莫里斯从麻省理工学院发布了第一个计算机蠕虫，感染了ARPANET上约6000台计算机。"),
            es = LocalizedContent("¿Quién creó el primer gusano informático?", listOf("Robert Morris Jr.", "Satoshi Nakamoto", "Charlie Lee", "Billy Markus"), "Tecnología", "En noviembre de 1988, Robert Morris Jr., estudiante de Cornell, lanzó el primer gusano informático desde el MIT, infectando alrededor de 6,000 computadoras en ARPANET.")
        ),
        BilingualQuestion(
            id = 11284, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année le premier ver informatique a-t-il été créé?", listOf("1988", "1986", "1990", "1992"), "Technologie", "Le premier ver informatique, nommé Morris, a été créé en 1988 par Robert Tappan Morris, causant des perturbations majeures sur Internet."),
            en = LocalizedContent("In what year was the first computer worm created?", listOf("1988", "1986", "1990", "1992"), "Technology", "The first computer worm, named Morris, was created in 1988 by Robert Tappan Morris, causing major disruptions on the Internet."),
            zh = LocalizedContent("第一个计算机蠕虫是哪一年创建的？", listOf("1988", "1986", "1990", "1992"), "科技", "第一个计算机蠕虫名为莫里斯蠕虫，由罗伯特·塔潘·莫里斯于1988年创建，对互联网造成了重大干扰。"),
            es = LocalizedContent("¿En qué año se creó el primer gusano informático?", listOf("1988", "1986", "1990", "1992"), "Tecnología", "El primer gusano informático, llamado Morris, fue creado en 1988 por Robert Tappan Morris, causando importantes perturbaciones en Internet.")
        ),
        BilingualQuestion(
            id = 11285, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand hack informatique de tous les temps?", listOf("Yahoo (2013-2014)", "Target (2013)", "Equifax (2017)", "Facebook (2018)"), "Technologie", "La fuite de données de Yahoo en 2013-2014 a touché 3 milliards de comptes, soit la totalité de ses utilisateurs, ce qui en fait la plus grande brèche informatique jamais révélée."),
            en = LocalizedContent("What is the biggest computer hack of all time?", listOf("Yahoo (2013-2014)", "Target (2013)", "Equifax (2017)", "Facebook (2018)"), "Technology", "The Yahoo data breach in 2013-2014 affected 3 billion accounts, all of its users, making it the largest computer breach ever revealed."),
            zh = LocalizedContent("有史以来最大的计算机黑客攻击是什么？", listOf("雅虎（2013-2014）", "塔吉特（2013）", "Equifax（2017）", "脸书（2018）"), "科技", "雅虎在2013-2014年的数据泄露影响了30亿账户，即其所有用户，使其成为有史以来最大的计算机安全漏洞。"),
            es = LocalizedContent("¿Cuál es el mayor hackeo informático de todos los tiempos?", listOf("Yahoo (2013-2014)", "Target (2013)", "Equifax (2017)", "Facebook (2018)"), "Tecnología", "La filtración de datos de Yahoo en 2013-2014 afectó a 3 mil millones de cuentas, la totalidad de sus usuarios, lo que la convierte en la mayor brecha informática jamás revelada.")
        ),
        BilingualQuestion(
            id = 11286, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année le hack Yahoo a-t-il eu lieu?", listOf("2013", "2011", "2015", "2017"), "Technologie", "En 2013, Yahoo a subi une cyberattaque massive compromettant les données de ses trois milliards d'utilisateurs."),
            en = LocalizedContent("In what year did the Yahoo hack occur?", listOf("2013", "2011", "2015", "2017"), "Technology", "In 2013, Yahoo suffered a massive cyberattack compromising the data of its three billion users."),
            zh = LocalizedContent("雅虎黑客攻击发生在哪一年？", listOf("2013", "2011", "2015", "2017"), "科技", "2013年，雅虎遭受了一次大规模网络攻击，导致其30亿用户的数据泄露。"),
            es = LocalizedContent("¿En qué año ocurrió el hackeo de Yahoo?", listOf("2013", "2011", "2015", "2017"), "Tecnología", "En 2013, Yahoo sufrió un ciberataque masivo que comprometió los datos de sus tres mil millones de usuarios.")
        ),
        BilingualQuestion(
            id = 11287, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le type de malware le plus courant?", listOf("Ransomware", "Trojan", "Botnet", "Worm"), "Technologie", "Les ransomwares sont devenus les malwares les plus répandus car ils permettent aux cybercriminels de monnayer directement l'accès aux données des victimes via le chiffrement des fichiers."),
            en = LocalizedContent("What is the most common type of malware?", listOf("Ransomware", "Trojan", "Botnet", "Worm"), "Technology", "Ransomware has become the most widespread malware because it allows cybercriminals to directly monetize access to victims' data through file encryption."),
            zh = LocalizedContent("最常见的恶意软件类型是什么？", listOf("勒索软件", "木马", "僵尸网络", "蠕虫"), "科技", "勒索软件已成为最普遍的恶意软件，因为它允许网络犯罪分子通过文件加密直接向受害者勒索钱财以获取数据访问权限。"),
            es = LocalizedContent("¿Cuál es el tipo de malware más común?", listOf("Ransomware", "Trojan", "Botnet", "Worm"), "Tecnología", "El ransomware se ha convertido en el malware más extendido porque permite a los ciberdelincuentes monetizar directamente el acceso a los datos de las víctimas mediante el cifrado de archivos.")
        ),
        BilingualQuestion(
            id = 11288, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année WannaCry a-t-il frappé le monde?", listOf("2017", "2015", "2019", "2021"), "Technologie", "WannaCry, un ransomware de grande ampleur, a paralysé des centaines de milliers d'ordinateurs dans le monde en mai 2017, exploitant une faille de Windows."),
            en = LocalizedContent("In what year did WannaCry strike the world?", listOf("2017", "2015", "2019", "2021"), "Technology", "WannaCry, a large-scale ransomware, paralyzed hundreds of thousands of computers worldwide in May 2017, exploiting a Windows vulnerability."),
            zh = LocalizedContent("WannaCry是在哪一年袭击全球的？", listOf("2017", "2015", "2019", "2021"), "科技", "WannaCry是一种大规模勒索软件，于2017年5月利用Windows漏洞瘫痪了全球数十万台计算机。"),
            es = LocalizedContent("¿En qué año atacó WannaCry al mundo?", listOf("2017", "2015", "2019", "2021"), "Tecnología", "WannaCry, un ransomware a gran escala, paralizó cientos de miles de computadoras en todo el mundo en mayo de 2017, explotando una vulnerabilidad de Windows.")
        ),
        BilingualQuestion(
            id = 11289, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le protocole de chiffrement le plus sûr?", listOf("AES-256", "DES", "RSA", "MD5"), "Technologie", "AES-256 est considéré comme le standard de chiffrement le plus sûr car il utilise une clé de 256 bits, offrant une résistance extrême aux attaques par force brute. Il est approuvé par la NSA pour les données classifiées."),
            en = LocalizedContent("What is the most secure encryption protocol?", listOf("AES-256", "DES", "RSA", "MD5"), "Technology", "AES-256 is considered the most secure encryption standard because it uses a 256-bit key, offering extreme resistance to brute-force attacks. It is approved by the NSA for classified data."),
            zh = LocalizedContent("最安全的加密协议是什么？", listOf("AES-256", "DES", "RSA", "MD5"), "科技", "AES-256被认为是最安全的加密标准，因为它使用256位密钥，对暴力破解攻击具有极强的抵抗力。它被美国国家安全局批准用于机密数据。"),
            es = LocalizedContent("¿Cuál es el protocolo de cifrado más seguro?", listOf("AES-256", "DES", "RSA", "MD5"), "Tecnología", "AES-256 se considera el estándar de cifrado más seguro porque utiliza una clave de 256 bits, ofreciendo una resistencia extrema a los ataques de fuerza bruta. Está aprobado por la NSA para datos clasificados.")
        ),
        BilingualQuestion(
            id = 11290, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année AES a-t-il été adopté comme standard?", listOf("2001", "1999", "2003", "2005"), "Technologie", "L'AES (Advanced Encryption Standard) a été adopté comme standard fédéral de chiffrement par le National Institute of Standards and Technology (NIST) en 2001, remplaçant le DES."),
            en = LocalizedContent("In which year was AES adopted as a standard?", listOf("2001", "1999", "2003", "2005"), "Technology", "AES (Advanced Encryption Standard) was adopted as a federal encryption standard by the National Institute of Standards and Technology (NIST) in 2001, replacing DES."),
            zh = LocalizedContent("AES在哪一年被采纳为标准？", listOf("2001", "1999", "2003", "2005"), "科技", "AES（高级加密标准）于2001年被美国国家标准与技术研究院（NIST）采纳为联邦加密标准，取代了DES。"),
            es = LocalizedContent("¿En qué año se adoptó AES como estándar?", listOf("2001", "1999", "2003", "2005"), "Tecnología", "AES (Advanced Encryption Standard) fue adoptado como estándar federal de cifrado por el Instituto Nacional de Estándares y Tecnología (NIST) en 2001, reemplazando a DES.")
        ),
        BilingualQuestion(
            id = 11291, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le créateur de RSA?", listOf("Ron Rivest, Adi Shamir et Len Adleman", "Nikola Tesla", "Thomas Edison", "Alexander Graham Bell"), "Technologie", "Le nom RSA vient des initiales de ses trois inventeurs : Ron Rivest, Adi Shamir et Len Adleman, qui ont publié cet algorithme de cryptographie asymétrique en 1977."),
            en = LocalizedContent("Who created RSA?", listOf("Ron Rivest, Adi Shamir and Len Adleman", "Nikola Tesla", "Thomas Edison", "Alexander Graham Bell"), "Technology", "The name RSA comes from the initials of its three inventors: Ron Rivest, Adi Shamir and Len Adleman, who published this asymmetric cryptography algorithm in 1977."),
            zh = LocalizedContent("RSA的创造者是谁？", listOf("罗恩·里维斯特、阿迪·萨莫尔和伦·阿德曼", "尼古拉·特斯拉", "托马斯·爱迪生", "亚历山大·格雷厄姆·贝尔"), "科技", "RSA这个名字来源于其三位发明者的姓氏首字母：罗恩·里维斯特（Ron Rivest）、阿迪·萨莫尔（Adi Shamir）和伦·阿德曼（Len Adleman），他们于1977年发表了这一非对称加密算法。"),
            es = LocalizedContent("¿Quién creó RSA?", listOf("Ron Rivest, Adi Shamir y Len Adleman", "Nikola Tesla", "Thomas Edison", "Alexander Graham Bell"), "Tecnología", "El nombre RSA proviene de las iniciales de sus tres inventores: Ron Rivest, Adi Shamir y Len Adleman, quienes publicaron este algoritmo de criptografía asimétrica en 1977.")
        ),
        BilingualQuestion(
            id = 11292, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année RSA a-t-il été créé?", listOf("1977", "1975", "1979", "1981"), "Technologie", "RSA a été inventé en 1977 par Ron Rivest, Adi Shamir et Leonard Adleman au MIT, d'où son nom issu de leurs initiales."),
            en = LocalizedContent("In which year was RSA created?", listOf("1977", "1975", "1979", "1981"), "Technology", "RSA was invented in 1977 by Ron Rivest, Adi Shamir and Leonard Adleman at MIT, hence its name derived from their initials."),
            zh = LocalizedContent("RSA在哪一年被创建？", listOf("1977", "1975", "1979", "1981"), "科技", "RSA于1977年由罗恩·里维斯特、阿迪·萨莫尔和伦纳德·阿德曼在麻省理工学院发明，其名称来源于他们姓氏的首字母。"),
            es = LocalizedContent("¿En qué año se creó RSA?", listOf("1977", "1975", "1979", "1981"), "Tecnología", "RSA fue inventado en 1977 por Ron Rivest, Adi Shamir y Leonard Adleman en el MIT, de ahí su nombre derivado de sus iniciales.")
        ),
        BilingualQuestion(
            id = 11293, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le protocole HTTPS?", listOf("HTTP Secure avec SSL/TLS", "HTTP Secure Protocol", "HyperText Protocol Secure", "HTTP Super Secure"), "Technologie", "HTTPS est la version sécurisée du protocole HTTP, utilisant les protocoles SSL/TLS pour chiffrer les échanges entre le navigateur et le serveur web."),
            en = LocalizedContent("What is the HTTPS protocol?", listOf("HTTP Secure with SSL/TLS", "HTTP Secure Protocol", "HyperText Protocol Secure", "HTTP Super Secure"), "Technology", "HTTPS is the secure version of the HTTP protocol, using SSL/TLS protocols to encrypt exchanges between the browser and the web server."),
            zh = LocalizedContent("HTTPS协议是什么？", listOf("带SSL/TLS的HTTP安全协议", "HTTP安全协议", "超文本安全协议", "HTTP超级安全"), "科技", "HTTPS是HTTP协议的安全版本，使用SSL/TLS协议加密浏览器和网络服务器之间的通信。"),
            es = LocalizedContent("¿Qué es el protocolo HTTPS?", listOf("HTTP Secure con SSL/TLS", "Protocolo HTTP Seguro", "Protocolo HiperTexto Seguro", "HTTP Súper Seguro"), "Tecnología", "HTTPS es la versión segura del protocolo HTTP, que utiliza los protocolos SSL/TLS para cifrar los intercambios entre el navegador y el servidor web.")
        ),
        BilingualQuestion(
            id = 11294, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année HTTPS a-t-il été créé?", listOf("1994", "1992", "1996", "1998"), "Technologie", "HTTPS a été créé en 1994 par Netscape Communications pour sécuriser les transactions sur le web, en combinant HTTP avec le protocole SSL."),
            en = LocalizedContent("In which year was HTTPS created?", listOf("1994", "1992", "1996", "1998"), "Technology", "HTTPS was created in 1994 by Netscape Communications to secure web transactions, combining HTTP with the SSL protocol."),
            zh = LocalizedContent("HTTPS在哪一年被创建？", listOf("1994", "1992", "1996", "1998"), "科技", "HTTPS于1994年由网景通信公司创建，用于保护网络交易安全，将HTTP与SSL协议结合。"),
            es = LocalizedContent("¿En qué año se creó HTTPS?", listOf("1994", "1992", "1996", "1998"), "Tecnología", "HTTPS fue creado en 1994 por Netscape Communications para asegurar las transacciones web, combinando HTTP con el protocolo SSL.")
        ),
        BilingualQuestion(
            id = 11295, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le créateur de SSL/TLS?", listOf("Netscape Communications", "Microsoft", "Apple", "Google"), "Technologie", "Netscape Communications a développé le protocole SSL (Secure Sockets Layer) en 1994 pour sécuriser les transactions web, dont TLS est le successeur standardisé."),
            en = LocalizedContent("Who created SSL/TLS?", listOf("Netscape Communications", "Microsoft", "Apple", "Google"), "Technology", "Netscape Communications developed the SSL (Secure Sockets Layer) protocol in 1994 to secure web transactions, with TLS being its standardized successor."),
            zh = LocalizedContent("SSL/TLS的创造者是谁？", listOf("网景通信公司", "微软", "苹果", "谷歌"), "科技", "网景通信公司于1994年开发了SSL（安全套接层）协议，用于保护网络交易安全，TLS是其标准化后的继任者。"),
            es = LocalizedContent("¿Quién creó SSL/TLS?", listOf("Netscape Communications", "Microsoft", "Apple", "Google"), "Tecnología", "Netscape Communications desarrolló el protocolo SSL (Secure Sockets Layer) en 1994 para asegurar las transacciones web, siendo TLS su sucesor estandarizado.")
        ),
        BilingualQuestion(
            id = 11296, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année SSL a-t-il été créé?", listOf("1994", "1992", "1996", "1998"), "Technologie", "Netscape a développé le protocole SSL (Secure Sockets Layer) en 1994 pour sécuriser les transactions en ligne, notamment avec son navigateur Navigator."),
            en = LocalizedContent("In which year was SSL created?", listOf("1994", "1992", "1996", "1998"), "Technology", "Netscape developed the SSL (Secure Sockets Layer) protocol in 1994 to secure online transactions, especially with its Navigator browser."),
            zh = LocalizedContent("SSL在哪一年被创建？", listOf("1994", "1992", "1996", "1998"), "科技", "网景公司于1994年开发了SSL（安全套接层）协议，用于保护在线交易安全，特别是与其Navigator浏览器配合使用。"),
            es = LocalizedContent("¿En qué año se creó SSL?", listOf("1994", "1992", "1996", "1998"), "Tecnología", "Netscape desarrolló el protocolo SSL (Secure Sockets Layer) en 1994 para asegurar las transacciones en línea, especialmente con su navegador Navigator.")
        ),
        BilingualQuestion(
            id = 11297, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le type de code malveillant qui se propage via email?", listOf("Virus", "Worm", "Trojan", "Rootkit"), "Technologie", "Les virus informatiques sont souvent conçus pour se propager via des pièces jointes ou des liens malveillants dans les emails, infectant ainsi d'autres systèmes."),
            en = LocalizedContent("What type of malicious code spreads via email?", listOf("Virus", "Worm", "Trojan", "Rootkit"), "Technology", "Computer viruses are often designed to spread via malicious attachments or links in emails, infecting other systems."),
            zh = LocalizedContent("哪种恶意代码通过电子邮件传播？", listOf("病毒", "蠕虫", "木马", "Rootkit"), "科技", "计算机病毒通常设计为通过电子邮件中的恶意附件或链接传播，从而感染其他系统。"),
            es = LocalizedContent("¿Qué tipo de código malicioso se propaga a través del correo electrónico?", listOf("Virus", "Gusano", "Troya", "Rootkit"), "Tecnología", "Los virus informáticos suelen estar diseñados para propagarse a través de archivos adjuntos o enlaces maliciosos en correos electrónicos, infectando otros sistemas.")
        ),
        BilingualQuestion(
            id = 11298, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année l'ILOVEYOU a-t-il frappé le monde?", listOf("2000", "1998", "2002", "2004"), "Technologie", "Le ver ILOVEYOU, l'un des premiers virus informatiques massifs, s'est propagé en mai 2000 via des emails, infectant des millions d'ordinateurs dans le monde."),
            en = LocalizedContent("In which year did ILOVEYOU strike the world?", listOf("2000", "1998", "2002", "2004"), "Technology", "The ILOVEYOU worm, one of the first massive computer viruses, spread in May 2000 via emails, infecting millions of computers worldwide."),
            zh = LocalizedContent("ILOVEYOU在哪一年袭击了世界？", listOf("2000", "1998", "2002", "2004"), "科技", "ILOVEYOU蠕虫是最早的大规模计算机病毒之一，于2000年5月通过电子邮件传播，感染了全球数百万台计算机。"),
            es = LocalizedContent("¿En qué año atacó ILOVEYOU al mundo?", listOf("2000", "1998", "2002", "2004"), "Tecnología", "El gusano ILOVEYOU, uno de los primeros virus informáticos masivos, se propagó en mayo de 2000 a través de correos electrónicos, infectando millones de computadoras en todo el mundo.")
        ),
        BilingualQuestion(
            id = 11299, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le protocole de communication le plus ancien?", listOf("SMTP", "HTTP", "FTP", "Telnet"), "Technologie", "SMTP (Simple Mail Transfer Protocol) a été développé en 1982, ce qui en fait l'un des plus anciens protocoles encore utilisés sur Internet, conçu pour l'envoi de courriers électroniques."),
            en = LocalizedContent("What is the oldest communication protocol?", listOf("SMTP", "HTTP", "FTP", "Telnet"), "Technology", "SMTP (Simple Mail Transfer Protocol) was developed in 1982, making it one of the oldest protocols still used on the Internet, designed for sending emails."),
            zh = LocalizedContent("最古老的通信协议是什么？", listOf("SMTP", "HTTP", "FTP", "Telnet"), "科技", "SMTP（简单邮件传输协议）于1982年开发，是互联网上仍在使用的古老协议之一，用于发送电子邮件。"),
            es = LocalizedContent("¿Cuál es el protocolo de comunicación más antiguo?", listOf("SMTP", "HTTP", "FTP", "Telnet"), "Tecnología", "SMTP (Simple Mail Transfer Protocol) fue desarrollado en 1982, lo que lo convierte en uno de los protocolos más antiguos aún en uso en Internet, diseñado para el envío de correos electrónicos.")
        ),
        BilingualQuestion(
            id = 11300, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année SMTP a-t-il été créé?", listOf("1982", "1980", "1984", "1986"), "Technologie", "SMTP a été défini pour la première fois en 1982 dans la RFC 821, établissant les bases du transfert de courriers électroniques sur Internet."),
            en = LocalizedContent("In what year was SMTP created?", listOf("1982", "1980", "1984", "1986"), "Technology", "SMTP was first defined in 1982 in RFC 821, establishing the basis for email transfer on the Internet."),
            zh = LocalizedContent("SMTP 是在哪一年创建的？", listOf("1982", "1980", "1984", "1986"), "科技", "SMTP 于 1982 年在 RFC 821 中首次定义，奠定了互联网电子邮件传输的基础。"),
            es = LocalizedContent("¿En qué año se creó SMTP?", listOf("1982", "1980", "1984", "1986"), "Tecnología", "SMTP se definió por primera vez en 1982 en la RFC 821, estableciendo las bases para la transferencia de correo electrónico en Internet.")
        ),
        BilingualQuestion(
            id = 11301, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le premier moteur de recherche?", listOf("Archie", "Yahoo", "Google", "AltaVista"), "Technologie", "Archie, créé en 1990 par Alan Emtage, est considéré comme le premier moteur de recherche car il indexait les fichiers disponibles sur des serveurs FTP anonymes."),
            en = LocalizedContent("What is the first search engine?", listOf("Archie", "Yahoo", "Google", "AltaVista"), "Technology", "Archie, created in 1990 by Alan Emtage, is considered the first search engine as it indexed files available on anonymous FTP servers."),
            zh = LocalizedContent("第一个搜索引擎是什么？", listOf("Archie", "Yahoo", "Google", "AltaVista"), "科技", "Archie 由 Alan Emtage 于 1990 年创建，被认为是第一个搜索引擎，因为它索引了匿名 FTP 服务器上的文件。"),
            es = LocalizedContent("¿Cuál es el primer motor de búsqueda?", listOf("Archie", "Yahoo", "Google", "AltaVista"), "Tecnología", "Archie, creado en 1990 por Alan Emtage, es considerado el primer motor de búsqueda porque indexaba archivos disponibles en servidores FTP anónimos.")
        ),
        BilingualQuestion(
            id = 11302, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année Archie a-t-il été créé?", listOf("1990", "1988", "1992", "1994"), "Technologie", "Archie, considéré comme le premier moteur de recherche internet, a été créé en 1990 par Alan Emtage, un étudiant de l'Université McGill."),
            en = LocalizedContent("In what year was Archie created?", listOf("1990", "1988", "1992", "1994"), "Technology", "Archie, considered the first internet search engine, was created in 1990 by Alan Emtage, a student at McGill University."),
            zh = LocalizedContent("Archie 是在哪一年创建的？", listOf("1990", "1988", "1992", "1994"), "科技", "Archie 被认为是第一个互联网搜索引擎，由麦吉尔大学的学生 Alan Emtage 于 1990 年创建。"),
            es = LocalizedContent("¿En qué año se creó Archie?", listOf("1990", "1988", "1992", "1994"), "Tecnología", "Archie, considerado el primer motor de búsqueda de Internet, fue creado en 1990 por Alan Emtage, un estudiante de la Universidad McGill.")
        ),
        BilingualQuestion(
            id = 11303, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel est le créateur d'Archie?", listOf("Alan Emtage", "Mark Zuckerberg", "Jack Dorsey", "Steve Jobs"), "Technologie", "Alan Emtage a créé Archie en 1990, considéré comme le premier moteur de recherche sur Internet, permettant d'indexer des fichiers FTP."),
            en = LocalizedContent("Who is the creator of Archie?", listOf("Alan Emtage", "Mark Zuckerberg", "Jack Dorsey", "Steve Jobs"), "Technology", "Alan Emtage created Archie in 1990, considered the first internet search engine, which indexed FTP files."),
            zh = LocalizedContent("Archie 的创建者是谁？", listOf("Alan Emtage", "Mark Zuckerberg", "Jack Dorsey", "Steve Jobs"), "科技", "Alan Emtage 于 1990 年创建了 Archie，它被认为是第一个互联网搜索引擎，用于索引 FTP 文件。"),
            es = LocalizedContent("¿Quién es el creador de Archie?", listOf("Alan Emtage", "Mark Zuckerberg", "Jack Dorsey", "Steve Jobs"), "Tecnología", "Alan Emtage creó Archie en 1990, considerado el primer motor de búsqueda de Internet, que indexaba archivos FTP.")
        ),
        BilingualQuestion(
            id = 11304, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("En quelle année Veronica a-t-il été créé?", listOf("1992", "1990", "1994", "1996"), "Technologie", "Veronica, un des premiers moteurs de recherche sur le web, a été créé en 1992 par des étudiants de l’Université du Nevada."),
            en = LocalizedContent("In what year was Veronica created?", listOf("1992", "1990", "1994", "1996"), "Technology", "Veronica, one of the first web search engines, was created in 1992 by students at the University of Nevada."),
            zh = LocalizedContent("Veronica 是在哪一年创建的？", listOf("1992", "1990", "1994", "1996"), "科技", "Veronica 是最早的网络搜索引擎之一，由内华达大学的学生于 1992 年创建。"),
            es = LocalizedContent("¿En qué año se creó Veronica?", listOf("1992", "1990", "1994", "1996"), "Tecnología", "Veronica, uno de los primeros motores de búsqueda web, fue creado en 1992 por estudiantes de la Universidad de Nevada.")
        ),
        BilingualQuestion(
            id = 11305, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel est le créateur de Veronica?", listOf("Université du Nevada", "Université d'Oxford", "Université de Stanford", "MIT"), "Technologie", "Veronica, l'un des premiers moteurs de recherche sur Internet, a été créée par des chercheurs de l'Université du Nevada en 1992."),
            en = LocalizedContent("Who is the creator of Veronica?", listOf("University of Nevada", "University of Oxford", "Stanford University", "MIT"), "Technology", "Veronica, one of the first internet search engines, was created by researchers at the University of Nevada in 1992."),
            zh = LocalizedContent("Veronica 的创建者是谁？", listOf("内华达大学", "牛津大学", "斯坦福大学", "麻省理工学院"), "科技", "Veronica 是最早的互联网搜索引擎之一，由内华达大学的研究人员于 1992 年创建。"),
            es = LocalizedContent("¿Quién es el creador de Veronica?", listOf("Universidad de Nevada", "Universidad de Oxford", "Universidad de Stanford", "MIT"), "Tecnología", "Veronica, uno de los primeros motores de búsqueda de Internet, fue creado por investigadores de la Universidad de Nevada en 1992.")
        ),
        BilingualQuestion(
            id = 11306, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année Yahoo a-t-il été créé?", listOf("1994", "1992", "1996", "1998"), "Technologie", "Yahoo a été fondé en janvier 1994 par Jerry Yang et David Filo, alors étudiants à l'université de Stanford, comme un annuaire de sites web."),
            en = LocalizedContent("In what year was Yahoo created?", listOf("1994", "1992", "1996", "1998"), "Technology", "Yahoo was founded in January 1994 by Jerry Yang and David Filo, then students at Stanford University, as a web directory."),
            zh = LocalizedContent("Yahoo 是在哪一年创建的？", listOf("1994", "1992", "1996", "1998"), "科技", "Yahoo 由 Jerry Yang 和 David Filo 于 1994 年 1 月创立，当时他们是斯坦福大学的学生，最初是一个网站目录。"),
            es = LocalizedContent("¿En qué año se creó Yahoo?", listOf("1994", "1992", "1996", "1998"), "Tecnología", "Yahoo fue fundado en enero de 1994 por Jerry Yang y David Filo, entonces estudiantes de la Universidad de Stanford, como un directorio web.")
        ),
        BilingualQuestion(
            id = 11307, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a créé Yahoo?", listOf("Jerry Yang et David Filo", "Mark Zuckerberg", "Jack Dorsey", "Steve Jobs"), "Technologie", "Jerry Yang et David Filo ont fondé Yahoo en 1994 alors qu'ils étaient étudiants à l'Université Stanford, initialement comme un annuaire de sites web appelé \"Jerry and David's Guide to the World Wide Web\"."),
            en = LocalizedContent("Who created Yahoo?", listOf("Jerry Yang and David Filo", "Mark Zuckerberg", "Jack Dorsey", "Steve Jobs"), "Technology", "Jerry Yang and David Filo founded Yahoo in 1994 while they were students at Stanford University, initially as a web directory called \"Jerry and David's Guide to the World Wide Web\"."),
            zh = LocalizedContent("谁创建了 Yahoo？", listOf("Jerry Yang 和 David Filo", "Mark Zuckerberg", "Jack Dorsey", "Steve Jobs"), "科技", "Jerry Yang 和 David Filo 于 1994 年创立了 Yahoo，当时他们是斯坦福大学的学生，最初是一个名为“Jerry and David's Guide to the World Wide Web”的网站目录。"),
            es = LocalizedContent("¿Quién creó Yahoo?", listOf("Jerry Yang y David Filo", "Mark Zuckerberg", "Jack Dorsey", "Steve Jobs"), "Tecnología", "Jerry Yang y David Filo fundaron Yahoo en 1994 mientras eran estudiantes de la Universidad de Stanford, inicialmente como un directorio web llamado \"Jerry and David's Guide to the World Wide Web\".")
        ),
        BilingualQuestion(
            id = 11308, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année AltaVista a-t-il été créé?", listOf("1995", "1993", "1997", "1999"), "Technologie", "AltaVista a été lancé en 1995 par des chercheurs du Digital Equipment Corporation, devenant l'un des premiers moteurs de recherche web populaires."),
            en = LocalizedContent("In what year was AltaVista created?", listOf("1995", "1993", "1997", "1999"), "Technology", "AltaVista was launched in 1995 by researchers at Digital Equipment Corporation, becoming one of the first popular web search engines."),
            zh = LocalizedContent("AltaVista 是在哪一年创建的？", listOf("1995", "1993", "1997", "1999"), "科技", "AltaVista 于 1995 年由 Digital Equipment Corporation 的研究人员推出，成为最早流行的网络搜索引擎之一。"),
            es = LocalizedContent("¿En qué año se creó AltaVista?", listOf("1995", "1993", "1997", "1999"), "Tecnología", "AltaVista fue lanzado en 1995 por investigadores de Digital Equipment Corporation, convirtiéndose en uno de los primeros motores de búsqueda web populares.")
        ),
        BilingualQuestion(
            id = 11309, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a créé AltaVista?", listOf("AltaVista Company", "Yahoo", "Google", "Microsoft"), "Technologie", "AltaVista a été développé par des chercheurs du Digital Equipment Corporation (DEC), qui ont fondé la société AltaVista Company pour commercialiser le moteur de recherche lancé en 1995."),
            en = LocalizedContent("Who created AltaVista?", listOf("AltaVista Company", "Yahoo", "Google", "Microsoft"), "Technology", "AltaVista was developed by researchers at Digital Equipment Corporation (DEC), who founded the AltaVista Company to commercialize the search engine launched in 1995."),
            zh = LocalizedContent("谁创建了 AltaVista？", listOf("AltaVista 公司", "Yahoo", "Google", "Microsoft"), "科技", "AltaVista 由 Digital Equipment Corporation (DEC) 的研究人员开发，他们成立了 AltaVista 公司以商业化于 1995 年推出的搜索引擎。"),
            es = LocalizedContent("¿Quién creó AltaVista?", listOf("AltaVista Company", "Yahoo", "Google", "Microsoft"), "Tecnología", "AltaVista fue desarrollado por investigadores de Digital Equipment Corporation (DEC), quienes fundaron la empresa AltaVista Company para comercializar el motor de búsqueda lanzado en 1995.")
        ),
        BilingualQuestion(
            id = 11310, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année Lycos a-t-il été créé?", listOf("1994", "1992", "1996", "1998"), "Technologie", "Lycos, l'un des premiers moteurs de recherche web, a été lancé en 1994 par Michael Mauldin à l'Université Carnegie Mellon."),
            en = LocalizedContent("In which year was Lycos created?", listOf("1994", "1992", "1996", "1998"), "Technology", "Lycos, one of the first web search engines, was launched in 1994 by Michael Mauldin at Carnegie Mellon University."),
            zh = LocalizedContent("Lycos 是哪一年创建的？", listOf("1994", "1992", "1996", "1998"), "科技", "Lycos 是最早的网络搜索引擎之一，由 Michael Mauldin 于 1994 年在卡内基梅隆大学推出。"),
            es = LocalizedContent("¿En qué año se creó Lycos?", listOf("1994", "1992", "1996", "1998"), "Tecnología", "Lycos, uno de los primeros motores de búsqueda web, fue lanzado en 1994 por Michael Mauldin en la Universidad Carnegie Mellon.")
        ),
        BilingualQuestion(
            id = 11311, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année Excite a-t-il été créé?", listOf("1995", "1993", "1997", "1999"), "Technologie", "Excite a été fondé en 1995, devenant l'un des premiers moteurs de recherche web populaires avant l'essor de Google."),
            en = LocalizedContent("In which year was Excite created?", listOf("1995", "1993", "1997", "1999"), "Technology", "Excite was founded in 1995, becoming one of the first popular web search engines before the rise of Google."),
            zh = LocalizedContent("Excite 是哪一年创建的？", listOf("1995", "1993", "1997", "1999"), "科技", "Excite 成立于 1995 年，在谷歌崛起之前成为最早流行的网络搜索引擎之一。"),
            es = LocalizedContent("¿En qué año se creó Excite?", listOf("1995", "1993", "1997", "1999"), "Tecnología", "Excite fue fundado en 1995, convirtiéndose en uno de los primeros motores de búsqueda web populares antes del auge de Google.")
        ),
        BilingualQuestion(
            id = 11312, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année Inktomi a-t-il été créé?", listOf("1996", "1994", "1998", "2000"), "Technologie", "Inktomi, un moteur de recherche pionnier, a été fondé en 1996 par des chercheurs de l'Université de Californie à Berkeley."),
            en = LocalizedContent("In which year was Inktomi created?", listOf("1996", "1994", "1998", "2000"), "Technology", "Inktomi, a pioneering search engine, was founded in 1996 by researchers at the University of California, Berkeley."),
            zh = LocalizedContent("Inktomi 是哪一年创建的？", listOf("1996", "1994", "1998", "2000"), "科技", "Inktomi 是一个开创性的搜索引擎，由加州大学伯克利分校的研究人员于 1996 年创立。"),
            es = LocalizedContent("¿En qué año se creó Inktomi?", listOf("1996", "1994", "1998", "2000"), "Tecnología", "Inktomi, un motor de búsqueda pionero, fue fundado en 1996 por investigadores de la Universidad de California en Berkeley.")
        ),
        BilingualQuestion(
            id = 11313, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année AllTheWeb a-t-il été créé?", listOf("1999", "1997", "2001", "2003"), "Technologie", "AllTheWeb a été fondé en 1999 par des chercheurs norvégiens, devenant l'un des premiers moteurs de recherche à indexer le contenu web de manière exhaustive."),
            en = LocalizedContent("In which year was AllTheWeb created?", listOf("1999", "1997", "2001", "2003"), "Technology", "AllTheWeb was founded in 1999 by Norwegian researchers, becoming one of the first search engines to comprehensively index web content."),
            zh = LocalizedContent("AllTheWeb 是哪一年创建的？", listOf("1999", "1997", "2001", "2003"), "科技", "AllTheWeb 由挪威研究人员于 1999 年创立，成为最早全面索引网络内容的搜索引擎之一。"),
            es = LocalizedContent("¿En qué año se creó AllTheWeb?", listOf("1999", "1997", "2001", "2003"), "Tecnología", "AllTheWeb fue fundado en 1999 por investigadores noruegos, convirtiéndose en uno de los primeros motores de búsqueda en indexar exhaustivamente el contenido web.")
        ),
        BilingualQuestion(
            id = 11314, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année Ask Jeeves a-t-il été créé?", listOf("1997", "1995", "1999", "2001"), "Technologie", "Ask Jeeves a été fondé en 1997, devenant l'un des premiers moteurs de recherche en langage naturel."),
            en = LocalizedContent("In which year was Ask Jeeves created?", listOf("1997", "1995", "1999", "2001"), "Technology", "Ask Jeeves was founded in 1997, becoming one of the first natural language search engines."),
            zh = LocalizedContent("Ask Jeeves 是哪一年创建的？", listOf("1997", "1995", "1999", "2001"), "科技", "Ask Jeeves 成立于 1997 年，成为最早的自然语言搜索引擎之一。"),
            es = LocalizedContent("¿En qué año se creó Ask Jeeves?", listOf("1997", "1995", "1999", "2001"), "Tecnología", "Ask Jeeves fue fundado en 1997, convirtiéndose en uno de los primeros motores de búsqueda en lenguaje natural.")
        ),
        BilingualQuestion(
            id = 11315, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("En quelle année Google a-t-il été créé?", listOf("1998", "1996", "2000", "2002"), "Technologie", "Google a été fondé en septembre 1998 par Larry Page et Sergey Brin alors qu'ils étaient doctorants à l'université Stanford."),
            en = LocalizedContent("In which year was Google created?", listOf("1998", "1996", "2000", "2002"), "Technology", "Google was founded in September 1998 by Larry Page and Sergey Brin while they were PhD students at Stanford University."),
            zh = LocalizedContent("Google 是哪一年创建的？", listOf("1998", "1996", "2000", "2002"), "科技", "Google 由拉里·佩奇和谢尔盖·布林于 1998 年 9 月创立，当时他们是斯坦福大学的博士生。"),
            es = LocalizedContent("¿En qué año se creó Google?", listOf("1998", "1996", "2000", "2002"), "Tecnología", "Google fue fundado en septiembre de 1998 por Larry Page y Sergey Brin mientras eran estudiantes de doctorado en la Universidad de Stanford.")
        ),
        BilingualQuestion(
            id = 11316, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui a créé Google?", listOf("Larry Page et Sergey Brin", "Mark Zuckerberg", "Steve Jobs", "Bill Gates"), "Technologie", "Larry Page et Sergey Brin ont fondé Google en 1998 alors qu'ils étaient doctorants à l'Université Stanford, développant un moteur de recherche basé sur un algorithme novateur nommé PageRank."),
            en = LocalizedContent("Who created Google?", listOf("Larry Page and Sergey Brin", "Mark Zuckerberg", "Steve Jobs", "Bill Gates"), "Technology", "Larry Page and Sergey Brin founded Google in 1998 while they were PhD students at Stanford University, developing a search engine based on an innovative algorithm called PageRank."),
            zh = LocalizedContent("谁创建了 Google？", listOf("拉里·佩奇和谢尔盖·布林", "马克·扎克伯格", "史蒂夫·乔布斯", "比尔·盖茨"), "科技", "拉里·佩奇和谢尔盖·布林于 1998 年创立了 Google，当时他们是斯坦福大学的博士生，开发了一种基于创新算法 PageRank 的搜索引擎。"),
            es = LocalizedContent("¿Quién creó Google?", listOf("Larry Page y Sergey Brin", "Mark Zuckerberg", "Steve Jobs", "Bill Gates"), "Tecnología", "Larry Page y Sergey Brin fundaron Google en 1998 mientras eran estudiantes de doctorado en la Universidad de Stanford, desarrollando un motor de búsqueda basado en un algoritmo innovador llamado PageRank.")
        ),
        BilingualQuestion(
            id = 11317, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le premier algorithme de Google?", listOf("PageRank", "RankBrain", "Hummingbird", "Penguin"), "Technologie", "PageRank, développé par Larry Page et Sergey Brin, a été le premier algorithme de Google, classant les pages web selon leur popularité via les liens entrants."),
            en = LocalizedContent("What is Google's first algorithm?", listOf("PageRank", "RankBrain", "Hummingbird", "Penguin"), "Technology", "PageRank, developed by Larry Page and Sergey Brin, was Google's first algorithm, ranking web pages based on their popularity through incoming links."),
            zh = LocalizedContent("Google 的第一个算法是什么？", listOf("PageRank", "RankBrain", "Hummingbird", "Penguin"), "科技", "PageRank 由拉里·佩奇和谢尔盖·布林开发，是 Google 的第一个算法，通过入站链接根据网页的流行度进行排名。"),
            es = LocalizedContent("¿Cuál es el primer algoritmo de Google?", listOf("PageRank", "RankBrain", "Hummingbird", "Penguin"), "Tecnología", "PageRank, desarrollado por Larry Page y Sergey Brin, fue el primer algoritmo de Google, clasificando las páginas web según su popularidad a través de enlaces entrantes.")
        ),
        BilingualQuestion(
            id = 11318, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année PageRank a-t-il été créé?", listOf("1998", "1996", "2000", "2002"), "Technologie", "PageRank a été développé par Larry Page et Sergey Brin en 1998, alors qu'ils étaient doctorants à Stanford, et a servi de fondation à l'algorithme de recherche de Google."),
            en = LocalizedContent("In which year was PageRank created?", listOf("1998", "1996", "2000", "2002"), "Technology", "PageRank was developed by Larry Page and Sergey Brin in 1998, while they were PhD students at Stanford, and served as the foundation for Google's search algorithm."),
            zh = LocalizedContent("PageRank 是哪一年创建的？", listOf("1998", "1996", "2000", "2002"), "科技", "PageRank 由拉里·佩奇和谢尔盖·布林于 1998 年开发，当时他们是斯坦福大学的博士生，并成为 Google 搜索算法的基础。"),
            es = LocalizedContent("¿En qué año se creó PageRank?", listOf("1998", "1996", "2000", "2002"), "Tecnología", "PageRank fue desarrollado por Larry Page y Sergey Brin en 1998, mientras eran estudiantes de doctorado en Stanford, y sirvió como base para el algoritmo de búsqueda de Google.")
        ),
        BilingualQuestion(
            id = 11319, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a créé PageRank?", listOf("Larry Page et Sergey Brin", "Mark Zuckerberg", "Steve Jobs", "Bill Gates"), "Technologie", "PageRank a été développé par Larry Page et Sergey Brin en 1996 à l'université de Stanford, avant de devenir le fondement de leur moteur de recherche Google."),
            en = LocalizedContent("Who created PageRank?", listOf("Larry Page and Sergey Brin", "Mark Zuckerberg", "Steve Jobs", "Bill Gates"), "Technology", "PageRank was developed by Larry Page and Sergey Brin in 1996 at Stanford University, before becoming the foundation of their Google search engine."),
            zh = LocalizedContent("谁创建了 PageRank？", listOf("拉里·佩奇和谢尔盖·布林", "马克·扎克伯格", "史蒂夫·乔布斯", "比尔·盖茨"), "科技", "PageRank 由拉里·佩奇和谢尔盖·布林于 1996 年在斯坦福大学开发，后来成为他们 Google 搜索引擎的基础。"),
            es = LocalizedContent("¿Quién creó PageRank?", listOf("Larry Page y Sergey Brin", "Mark Zuckerberg", "Steve Jobs", "Bill Gates"), "Tecnología", "PageRank fue desarrollado por Larry Page y Sergey Brin en 1996 en la Universidad de Stanford, antes de convertirse en la base de su motor de búsqueda Google.")
        ),
        BilingualQuestion(
            id = 11320, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année Bing a-t-il été lancé?", listOf("2009", "2007", "2011", "2013"), "Technologie", "Bing a été lancé par Microsoft en 2009 en tant que successeur de Live Search, afin de concurrencer Google dans le domaine des moteurs de recherche."),
            en = LocalizedContent("In what year was Bing launched?", listOf("2009", "2007", "2011", "2013"), "Technology", "Bing was launched by Microsoft in 2009 as a successor to Live Search, to compete with Google in the search engine market."),
            zh = LocalizedContent("Bing是哪一年推出的？", listOf("2009", "2007", "2011", "2013"), "科技", "Bing由微软于2009年推出，作为Live Search的继任者，旨在与谷歌在搜索引擎领域竞争。"),
            es = LocalizedContent("¿En qué año se lanzó Bing?", listOf("2009", "2007", "2011", "2013"), "Tecnología", "Bing fue lanzado por Microsoft en 2009 como sucesor de Live Search, para competir con Google en el ámbito de los motores de búsqueda.")
        ),
        BilingualQuestion(
            id = 11321, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui a créé Bing?", listOf("Microsoft", "Google", "Yahoo", "Ask.com"), "Technologie", "Bing a été développé par Microsoft en 2009 pour concurrencer Google dans le domaine des moteurs de recherche."),
            en = LocalizedContent("Who created Bing?", listOf("Microsoft", "Google", "Yahoo", "Ask.com"), "Technology", "Bing was developed by Microsoft in 2009 to compete with Google in the search engine market."),
            zh = LocalizedContent("谁创建了Bing？", listOf("微软", "谷歌", "雅虎", "Ask.com"), "科技", "Bing由微软于2009年开发，旨在与谷歌在搜索引擎领域竞争。"),
            es = LocalizedContent("¿Quién creó Bing?", listOf("Microsoft", "Google", "Yahoo", "Ask.com"), "Tecnología", "Bing fue desarrollado por Microsoft en 2009 para competir con Google en el ámbito de los motores de búsqueda.")
        ),
        BilingualQuestion(
            id = 11322, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année DuckDuckGo a-t-il été lancé?", listOf("2008", "2006", "2010", "2012"), "Technologie", "DuckDuckGo a été fondé par Gabriel Weinberg et officiellement lancé en 2008, se positionnant comme un moteur de recherche axé sur la protection de la vie privée des utilisateurs."),
            en = LocalizedContent("In what year was DuckDuckGo launched?", listOf("2008", "2006", "2010", "2012"), "Technology", "DuckDuckGo was founded by Gabriel Weinberg and officially launched in 2008, positioning itself as a search engine focused on user privacy."),
            zh = LocalizedContent("DuckDuckGo是哪一年推出的？", listOf("2008", "2006", "2010", "2012"), "科技", "DuckDuckGo由Gabriel Weinberg创立，于2008年正式推出，定位为注重用户隐私保护的搜索引擎。"),
            es = LocalizedContent("¿En qué año se lanzó DuckDuckGo?", listOf("2008", "2006", "2010", "2012"), "Tecnología", "DuckDuckGo fue fundado por Gabriel Weinberg y lanzado oficialmente en 2008, posicionándose como un motor de búsqueda centrado en la privacidad del usuario.")
        ),
        BilingualQuestion(
            id = 11323, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a créé DuckDuckGo?", listOf("Gabriel Weinberg", "Mark Zuckerberg", "Jack Dorsey", "Steve Jobs"), "Technologie", "Gabriel Weinberg a lancé DuckDuckGo en 2008, motivé par le souhait de proposer un moteur de recherche respectueux de la vie privée, sans traçage des utilisateurs."),
            en = LocalizedContent("Who created DuckDuckGo?", listOf("Gabriel Weinberg", "Mark Zuckerberg", "Jack Dorsey", "Steve Jobs"), "Technology", "Gabriel Weinberg launched DuckDuckGo in 2008, motivated by the desire to offer a privacy-respecting search engine without user tracking."),
            zh = LocalizedContent("谁创建了DuckDuckGo？", listOf("Gabriel Weinberg", "马克·扎克伯格", "杰克·多西", "史蒂夫·乔布斯"), "科技", "Gabriel Weinberg于2008年推出DuckDuckGo，旨在提供尊重隐私、不追踪用户的搜索引擎。"),
            es = LocalizedContent("¿Quién creó DuckDuckGo?", listOf("Gabriel Weinberg", "Mark Zuckerberg", "Jack Dorsey", "Steve Jobs"), "Tecnología", "Gabriel Weinberg lanzó DuckDuckGo en 2008, motivado por el deseo de ofrecer un motor de búsqueda respetuoso con la privacidad, sin rastreo de usuarios.")
        ),
        BilingualQuestion(
            id = 11324, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année Yandex a-t-il été lancé?", listOf("1997", "1995", "1999", "2001"), "Technologie", "Yandex a été fondé en 1997 par Arkady Volozh et Ilya Segalovich, initialement comme un moteur de recherche pour le web russe. Le nom est une abréviation de \"Yet Another iNDEX\"."),
            en = LocalizedContent("In what year was Yandex launched?", listOf("1997", "1995", "1999", "2001"), "Technology", "Yandex was founded in 1997 by Arkady Volozh and Ilya Segalovich, initially as a search engine for the Russian web. The name is an abbreviation of 'Yet Another iNDEX'."),
            zh = LocalizedContent("Yandex是哪一年推出的？", listOf("1997", "1995", "1999", "2001"), "科技", "Yandex由Arkady Volozh和Ilya Segalovich于1997年创立，最初作为俄罗斯网络的搜索引擎。名称是'Yet Another iNDEX'的缩写。"),
            es = LocalizedContent("¿En qué año se lanzó Yandex?", listOf("1997", "1995", "1999", "2001"), "Tecnología", "Yandex fue fundado en 1997 por Arkady Volozh e Ilya Segalovich, inicialmente como un motor de búsqueda para la web rusa. El nombre es una abreviatura de 'Yet Another iNDEX'.")
        ),
        BilingualQuestion(
            id = 11325, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année Baidu a-t-il été lancé?", listOf("2000", "1998", "2002", "2004"), "Technologie", "Baidu, le principal moteur de recherche chinois, a été fondé en janvier 2000 par Robin Li et Eric Xu."),
            en = LocalizedContent("In what year was Baidu launched?", listOf("2000", "1998", "2002", "2004"), "Technology", "Baidu, the leading Chinese search engine, was founded in January 2000 by Robin Li and Eric Xu."),
            zh = LocalizedContent("百度是哪一年推出的？", listOf("2000", "1998", "2002", "2004"), "科技", "百度，中国领先的搜索引擎，由李彦宏和徐勇于2000年1月创立。"),
            es = LocalizedContent("¿En qué año se lanzó Baidu?", listOf("2000", "1998", "2002", "2004"), "Tecnología", "Baidu, el principal motor de búsqueda chino, fue fundado en enero de 2000 por Robin Li y Eric Xu.")
        ),
        BilingualQuestion(
            id = 11326, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a créé Baidu?", listOf("Robin Li et Eric Xu", "Mark Zuckerberg", "Jack Dorsey", "Steve Jobs"), "Technologie", "Robin Li, cofondateur et PDG, a lancé Baidu en 2000 avec Eric Xu, un autre ingénieur chinois, pour créer le principal moteur de recherche en Chine."),
            en = LocalizedContent("Who created Baidu?", listOf("Robin Li and Eric Xu", "Mark Zuckerberg", "Jack Dorsey", "Steve Jobs"), "Technology", "Robin Li, co-founder and CEO, launched Baidu in 2000 with Eric Xu, another Chinese engineer, to create the leading search engine in China."),
            zh = LocalizedContent("谁创建了百度？", listOf("李彦宏和徐勇", "马克·扎克伯格", "杰克·多西", "史蒂夫·乔布斯"), "科技", "李彦宏（联合创始人兼CEO）与徐勇于2000年共同创立百度，打造中国领先的搜索引擎。"),
            es = LocalizedContent("¿Quién creó Baidu?", listOf("Robin Li y Eric Xu", "Mark Zuckerberg", "Jack Dorsey", "Steve Jobs"), "Tecnología", "Robin Li, cofundador y CEO, lanzó Baidu en 2000 junto con Eric Xu, otro ingeniero chino, para crear el principal motor de búsqueda en China.")
        ),
        BilingualQuestion(
            id = 11327, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année Qwant a-t-il été lancé?", listOf("2013", "2011", "2015", "2017"), "Technologie", "Qwant, moteur de recherche français respectueux de la vie privée, a été officiellement lancé en février 2013 par des entrepreneurs français."),
            en = LocalizedContent("In what year was Qwant launched?", listOf("2013", "2011", "2015", "2017"), "Technology", "Qwant, a French privacy-respecting search engine, was officially launched in February 2013 by French entrepreneurs."),
            zh = LocalizedContent("Qwant是哪一年推出的？", listOf("2013", "2011", "2015", "2017"), "科技", "Qwant，一款注重隐私的法国搜索引擎，由法国企业家于2013年2月正式推出。"),
            es = LocalizedContent("¿En qué año se lanzó Qwant?", listOf("2013", "2011", "2015", "2017"), "Tecnología", "Qwant, un motor de búsqueda francés respetuoso con la privacidad, fue lanzado oficialmente en febrero de 2013 por emprendedores franceses.")
        ),
        BilingualQuestion(
            id = 11328, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Qui a créé Qwant?", listOf("Éric Léandri", "Mark Zuckerberg", "Jack Dorsey", "Steve Jobs"), "Technologie", "Éric Léandri a cofondé Qwant en 2013 avec Jean-Baptiste Rudelle et Patrick Constant, pour proposer un moteur de recherche français respectueux de la vie privée."),
            en = LocalizedContent("Who created Qwant?", listOf("Éric Léandri", "Mark Zuckerberg", "Jack Dorsey", "Steve Jobs"), "Technology", "Éric Léandri co-founded Qwant in 2013 with Jean-Baptiste Rudelle and Patrick Constant, to offer a French privacy-respecting search engine."),
            zh = LocalizedContent("谁创建了Qwant？", listOf("Éric Léandri", "马克·扎克伯格", "杰克·多西", "史蒂夫·乔布斯"), "科技", "Éric Léandri于2013年与Jean-Baptiste Rudelle和Patrick Constant共同创立Qwant，旨在提供一款注重隐私的法国搜索引擎。"),
            es = LocalizedContent("¿Quién creó Qwant?", listOf("Éric Léandri", "Mark Zuckerberg", "Jack Dorsey", "Steve Jobs"), "Tecnología", "Éric Léandri cofundó Qwant en 2013 con Jean-Baptiste Rudelle y Patrick Constant, para ofrecer un motor de búsqueda francés respetuoso con la privacidad.")
        ),
        BilingualQuestion(
            id = 11329, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année Ecosia a-t-il été lancé?", listOf("2009", "2007", "2011", "2013"), "Technologie", "Ecosia, le moteur de recherche qui utilise ses revenus pour planter des arbres, a été fondé en 2009 par Christian Kroll à Berlin."),
            en = LocalizedContent("In what year was Ecosia launched?", listOf("2009", "2007", "2011", "2013"), "Technology", "Ecosia, the search engine that uses its revenue to plant trees, was founded in 2009 by Christian Kroll in Berlin."),
            zh = LocalizedContent("Ecosia是哪一年推出的？", listOf("2009", "2007", "2011", "2013"), "科技", "Ecosia，一款利用收入植树造林的搜索引擎，由Christian Kroll于2009年在柏林创立。"),
            es = LocalizedContent("¿En qué año se lanzó Ecosia?", listOf("2009", "2007", "2011", "2013"), "Tecnología", "Ecosia, el motor de búsqueda que utiliza sus ingresos para plantar árboles, fue fundado en 2009 por Christian Kroll en Berlín.")
        ),
    )

    private fun part6(): List<BilingualQuestion> = listOf(
        BilingualQuestion(
            id = 11330, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Qui a créé Ecosia?", listOf("Christian Kroll", "Mark Zuckerberg", "Jack Dorsey", "Steve Jobs"), "Technologie", "Christian Kroll a fondé Ecosia en 2009, un moteur de recherche qui utilise ses revenus publicitaires pour financer la plantation d'arbres dans le monde."),
            en = LocalizedContent("Who created Ecosia?", listOf("Christian Kroll", "Mark Zuckerberg", "Jack Dorsey", "Steve Jobs"), "Technology", "Christian Kroll founded Ecosia in 2009, a search engine that uses its advertising revenue to fund tree planting around the world."),
            zh = LocalizedContent("谁创建了Ecosia？", listOf("Christian Kroll", "马克·扎克伯格", "杰克·多西", "史蒂夫·乔布斯"), "科技", "Christian Kroll于2009年创立了Ecosia，这是一个利用广告收入资助全球植树活动的搜索引擎。"),
            es = LocalizedContent("¿Quién creó Ecosia?", listOf("Christian Kroll", "Mark Zuckerberg", "Jack Dorsey", "Steve Jobs"), "Tecnología", "Christian Kroll fundó Ecosia en 2009, un motor de búsqueda que utiliza sus ingresos publicitarios para financiar la plantación de árboles en todo el mundo.")
        ),
        BilingualQuestion(
            id = 11331, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel est le processeur le plus ancien encore utilisé?", listOf("Intel 4004", "Intel 8008", "Intel 8080", "Motorola 68000"), "Technologie", "Lancé en 1971, l'Intel 4004 est le premier microprocesseur commercialisé, encore utilisé dans certaines applications embarquées ou éducatives pour sa simplicité."),
            en = LocalizedContent("What is the oldest processor still in use?", listOf("Intel 4004", "Intel 8008", "Intel 8080", "Motorola 68000"), "Technology", "Launched in 1971, the Intel 4004 is the first commercial microprocessor, still used in some embedded or educational applications for its simplicity."),
            zh = LocalizedContent("仍在使用的处理器中最古老的是哪个？", listOf("Intel 4004", "Intel 8008", "Intel 8080", "Motorola 68000"), "科技", "Intel 4004于1971年推出，是第一款商业化的微处理器，由于其简单性，仍被用于某些嵌入式或教育应用。"),
            es = LocalizedContent("¿Cuál es el procesador más antiguo que aún se utiliza?", listOf("Intel 4004", "Intel 8008", "Intel 8080", "Motorola 68000"), "Tecnología", "Lanzado en 1971, el Intel 4004 es el primer microprocesador comercializado, todavía utilizado en algunas aplicaciones integradas o educativas por su simplicidad.")
        ),
        BilingualQuestion(
            id = 11332, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année Intel 4004 a-t-il été lancé?", listOf("1971", "1969", "1973", "1975"), "Technologie", "L'Intel 4004, premier microprocesseur commercialisé, a été lancé en 1971. Il ouvrait la voie à l'informatique personnelle en intégrant l'unité centrale sur une seule puce."),
            en = LocalizedContent("In what year was the Intel 4004 launched?", listOf("1971", "1969", "1973", "1975"), "Technology", "The Intel 4004, the first commercial microprocessor, was launched in 1971. It paved the way for personal computing by integrating the central unit on a single chip."),
            zh = LocalizedContent("Intel 4004是在哪一年推出的？", listOf("1971", "1969", "1973", "1975"), "科技", "Intel 4004是第一款商业化的微处理器，于1971年推出。它通过将中央单元集成在单个芯片上，为个人计算铺平了道路。"),
            es = LocalizedContent("¿En qué año se lanzó el Intel 4004?", listOf("1971", "1969", "1973", "1975"), "Tecnología", "El Intel 4004, el primer microprocesador comercializado, se lanzó en 1971. Abrió el camino a la informática personal al integrar la unidad central en un solo chip.")
        ),
        BilingualQuestion(
            id = 11333, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Combien de transistors avait Intel 4004?", listOf("2300", "1000", "5000", "10000"), "Technologie", "L'Intel 4004, premier microprocesseur commercialisé en 1971, contenait 2 300 transistors, une prouesse technique pour l'époque."),
            en = LocalizedContent("How many transistors did the Intel 4004 have?", listOf("2300", "1000", "5000", "10000"), "Technology", "The Intel 4004, the first commercial microprocessor launched in 1971, contained 2,300 transistors, a technical feat for its time."),
            zh = LocalizedContent("Intel 4004有多少个晶体管？", listOf("2300", "1000", "5000", "10000"), "科技", "Intel 4004是1971年推出的第一款商业微处理器，包含2300个晶体管，这在当时是一项技术壮举。"),
            es = LocalizedContent("¿Cuántos transistores tenía el Intel 4004?", listOf("2300", "1000", "5000", "10000"), "Tecnología", "El Intel 4004, el primer microprocesador comercializado en 1971, contenía 2.300 transistores, una hazaña técnica para su época.")
        ),
        BilingualQuestion(
            id = 11334, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel est le premier processeur à 64 bits?", listOf("Alpha 21064", "Pentium Pro", "SPARC", "MIPS"), "Technologie", "L'Alpha 21064, sorti en 1992, est considéré comme le premier processeur grand public à architecture 64 bits, développé par Digital Equipment Corporation."),
            en = LocalizedContent("What is the first 64-bit processor?", listOf("Alpha 21064", "Pentium Pro", "SPARC", "MIPS"), "Technology", "The Alpha 21064, released in 1992, is considered the first mainstream 64-bit processor, developed by Digital Equipment Corporation."),
            zh = LocalizedContent("第一款64位处理器是什么？", listOf("Alpha 21064", "Pentium Pro", "SPARC", "MIPS"), "科技", "Alpha 21064于1992年发布，被认为是第一款主流64位处理器，由Digital Equipment Corporation开发。"),
            es = LocalizedContent("¿Cuál es el primer procesador de 64 bits?", listOf("Alpha 21064", "Pentium Pro", "SPARC", "MIPS"), "Tecnología", "El Alpha 21064, lanzado en 1992, es considerado el primer procesador de 64 bits para el gran público, desarrollado por Digital Equipment Corporation.")
        ),
        BilingualQuestion(
            id = 11335, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("En quelle année le premier processeur 64 bits a-t-il été lancé?", listOf("1992", "1990", "1994", "1996"), "Technologie", "Le premier processeur 64 bits grand public, le R4000 de MIPS, a été lancé en 1992, marquant une avancée majeure dans l'architecture des ordinateurs."),
            en = LocalizedContent("In what year was the first 64-bit processor launched?", listOf("1992", "1990", "1994", "1996"), "Technology", "The first mainstream 64-bit processor, the MIPS R4000, was launched in 1992, marking a major advance in computer architecture."),
            zh = LocalizedContent("第一款64位处理器是在哪一年推出的？", listOf("1992", "1990", "1994", "1996"), "科技", "第一款主流64位处理器MIPS R4000于1992年推出，标志着计算机架构的重大进步。"),
            es = LocalizedContent("¿En qué año se lanzó el primer procesador de 64 bits?", listOf("1992", "1990", "1994", "1996"), "Tecnología", "El primer procesador de 64 bits para el gran público, el MIPS R4000, se lanzó en 1992, marcando un avance importante en la arquitectura de computadoras.")
        ),
        BilingualQuestion(
            id = 11336, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le processeur mobile le plus puissant?", listOf("Snapdragon 8 Gen 3", "Apple A17 Pro", "Exynos 2400", "MediaTek Dimensity"), "Technologie", "Le Snapdragon 8 Gen 3 de Qualcomm est le processeur mobile le plus puissant en 2024, surpassant ses concurrents en performances CPU et GPU pour les smartphones haut de gamme."),
            en = LocalizedContent("What is the most powerful mobile processor?", listOf("Snapdragon 8 Gen 3", "Apple A17 Pro", "Exynos 2400", "MediaTek Dimensity"), "Technology", "The Snapdragon 8 Gen 3 from Qualcomm is the most powerful mobile processor in 2024, surpassing its competitors in CPU and GPU performance for high-end smartphones."),
            zh = LocalizedContent("最强大的移动处理器是什么？", listOf("Snapdragon 8 Gen 3", "Apple A17 Pro", "Exynos 2400", "MediaTek Dimensity"), "科技", "高通的Snapdragon 8 Gen 3是2024年最强大的移动处理器，在高端智能手机的CPU和GPU性能上超越了竞争对手。"),
            es = LocalizedContent("¿Cuál es el procesador móvil más potente?", listOf("Snapdragon 8 Gen 3", "Apple A17 Pro", "Exynos 2400", "MediaTek Dimensity"), "Tecnología", "El Snapdragon 8 Gen 3 de Qualcomm es el procesador móvil más potente en 2024, superando a sus competidores en rendimiento de CPU y GPU para teléfonos inteligentes de gama alta.")
        ),
        BilingualQuestion(
            id = 11337, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année Snapdragon a-t-il été créé?", listOf("2007", "2005", "2009", "2011"), "Technologie", "Snapdragon a été créé en 2007 par Qualcomm, marquant le lancement de sa première plateforme mobile intégrée."),
            en = LocalizedContent("In what year was Snapdragon created?", listOf("2007", "2005", "2009", "2011"), "Technology", "Snapdragon was created in 2007 by Qualcomm, marking the launch of its first integrated mobile platform."),
            zh = LocalizedContent("Snapdragon是在哪一年创建的？", listOf("2007", "2005", "2009", "2011"), "科技", "Snapdragon由高通于2007年创建，标志着其首个集成移动平台的推出。"),
            es = LocalizedContent("¿En qué año se creó Snapdragon?", listOf("2007", "2005", "2009", "2011"), "Tecnología", "Snapdragon fue creado en 2007 por Qualcomm, marcando el lanzamiento de su primera plataforma móvil integrada.")
        ),
        BilingualQuestion(
            id = 11338, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a créé Snapdragon?", listOf("Qualcomm", "Intel", "AMD", "ARM"), "Technologie", "Qualcomm a conçu la plateforme Snapdragon pour ses processeurs mobiles, lancée en 2007."),
            en = LocalizedContent("Who created Snapdragon?", listOf("Qualcomm", "Intel", "AMD", "ARM"), "Technology", "Qualcomm designed the Snapdragon platform for its mobile processors, launched in 2007."),
            zh = LocalizedContent("谁创建了Snapdragon？", listOf("高通", "英特尔", "AMD", "ARM"), "科技", "高通为其移动处理器设计了Snapdragon平台，于2007年推出。"),
            es = LocalizedContent("¿Quién creó Snapdragon?", listOf("Qualcomm", "Intel", "AMD", "ARM"), "Tecnología", "Qualcomm diseñó la plataforma Snapdragon para sus procesadores móviles, lanzada en 2007.")
        ),
        BilingualQuestion(
            id = 11339, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année Apple A14 a-t-il été lancé?", listOf("2020", "2018", "2022", "2024"), "Technologie", "L'Apple A14 Bionic a été dévoilé en septembre 2020 avec l'iPad Air 4, puis intégré à l'iPhone 12 en octobre de la même année."),
            en = LocalizedContent("In what year was the Apple A14 launched?", listOf("2020", "2018", "2022", "2024"), "Technology", "The Apple A14 Bionic was unveiled in September 2020 with the iPad Air 4, then integrated into the iPhone 12 in October of the same year."),
            zh = LocalizedContent("Apple A14是在哪一年推出的？", listOf("2020", "2018", "2022", "2024"), "科技", "Apple A14 Bionic于2020年9月随iPad Air 4发布，随后于同年10月集成到iPhone 12中。"),
            es = LocalizedContent("¿En qué año se lanzó el Apple A14?", listOf("2020", "2018", "2022", "2024"), "Tecnología", "El Apple A14 Bionic se presentó en septiembre de 2020 con el iPad Air 4, y luego se integró en el iPhone 12 en octubre del mismo año.")
        ),
        BilingualQuestion(
            id = 11340, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le nombre de transistors dans Apple M1?", listOf("16 milliards", "10 milliards", "20 milliards", "25 milliards"), "Technologie", "L'Apple M1 est le premier système sur une puce (SoC) d'Apple pour Mac, gravé en 5 nm, et il intègre 16 milliards de transistors pour combiner CPU, GPU et Neural Engine."),
            en = LocalizedContent("How many transistors does the Apple M1 have?", listOf("16 billion", "10 billion", "20 billion", "25 billion"), "Technology", "The Apple M1 is Apple's first system on a chip (SoC) for Mac, built on a 5nm process, and it integrates 16 billion transistors to combine CPU, GPU, and Neural Engine."),
            zh = LocalizedContent("Apple M1 有多少个晶体管？", listOf("160亿", "100亿", "200亿", "250亿"), "科技", "Apple M1 是苹果为 Mac 设计的首款片上系统（SoC），采用 5 纳米工艺，集成了 160 亿个晶体管，将 CPU、GPU 和神经网络引擎结合在一起。"),
            es = LocalizedContent("¿Cuántos transistores tiene el Apple M1?", listOf("16 mil millones", "10 mil millones", "20 mil millones", "25 mil millones"), "Tecnología", "El Apple M1 es el primer sistema en un chip (SoC) de Apple para Mac, fabricado en 5 nm, e integra 16 mil millones de transistores para combinar CPU, GPU y Neural Engine.")
        ),
        BilingualQuestion(
            id = 11341, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année Exynos a-t-il été créé?", listOf("2009", "2007", "2011", "2013"), "Technologie", "Exynos est la gamme de processeurs mobiles conçue par Samsung, et sa première génération a été lancée en 2009 avec le processeur S5PC110, utilisé dans le Samsung Galaxy S."),
            en = LocalizedContent("In what year was Exynos created?", listOf("2009", "2007", "2011", "2013"), "Technology", "Exynos is Samsung's line of mobile processors, and its first generation was launched in 2009 with the S5PC110 processor, used in the Samsung Galaxy S."),
            zh = LocalizedContent("Exynos 是哪一年创建的？", listOf("2009", "2007", "2011", "2013"), "科技", "Exynos 是三星的移动处理器系列，其第一代产品于 2009 年推出，采用 S5PC110 处理器，用于三星 Galaxy S。"),
            es = LocalizedContent("¿En qué año se creó Exynos?", listOf("2009", "2007", "2011", "2013"), "Tecnología", "Exynos es la gama de procesadores móviles de Samsung, y su primera generación se lanzó en 2009 con el procesador S5PC110, utilizado en el Samsung Galaxy S.")
        ),
        BilingualQuestion(
            id = 11342, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a créé Exynos?", listOf("Samsung", "Intel", "Qualcomm", "ARM"), "Technologie", "Exynos est une gamme de systèmes sur puce (SoC) conçue et fabriquée par Samsung Electronics, principalement pour ses smartphones et tablettes Galaxy."),
            en = LocalizedContent("Who created Exynos?", listOf("Samsung", "Intel", "Qualcomm", "ARM"), "Technology", "Exynos is a line of system-on-chips (SoCs) designed and manufactured by Samsung Electronics, primarily for its Galaxy smartphones and tablets."),
            zh = LocalizedContent("谁创建了 Exynos？", listOf("三星", "英特尔", "高通", "ARM"), "科技", "Exynos 是三星电子设计和制造的片上系统（SoC）系列，主要用于其 Galaxy 智能手机和平板电脑。"),
            es = LocalizedContent("¿Quién creó Exynos?", listOf("Samsung", "Intel", "Qualcomm", "ARM"), "Tecnología", "Exynos es una gama de sistemas en chip (SoC) diseñada y fabricada por Samsung Electronics, principalmente para sus teléfonos inteligentes y tabletas Galaxy.")
        ),
        BilingualQuestion(
            id = 11343, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année Dimensity a-t-il été créé?", listOf("2019", "2017", "2021", "2023"), "Technologie", "Dimensity est la gamme de processeurs pour smartphones de MediaTek, lancée en 2019 pour concurrencer directement les puces haut de gamme de Qualcomm."),
            en = LocalizedContent("In what year was Dimensity created?", listOf("2019", "2017", "2021", "2023"), "Technology", "Dimensity is MediaTek's line of smartphone processors, launched in 2019 to directly compete with Qualcomm's high-end chips."),
            zh = LocalizedContent("Dimensity 是哪一年创建的？", listOf("2019", "2017", "2021", "2023"), "科技", "Dimensity 是联发科的智能手机处理器系列，于 2019 年推出，直接与高通的高端芯片竞争。"),
            es = LocalizedContent("¿En qué año se creó Dimensity?", listOf("2019", "2017", "2021", "2023"), "Tecnología", "Dimensity es la gama de procesadores para teléfonos inteligentes de MediaTek, lanzada en 2019 para competir directamente con los chips de gama alta de Qualcomm.")
        ),
        BilingualQuestion(
            id = 11344, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a créé Dimensity?", listOf("MediaTek", "Qualcomm", "Samsung", "Apple"), "Technologie", "MediaTek a créé la gamme Dimensity pour ses processeurs mobiles haut de gamme, concurrents des Snapdragon de Qualcomm et des Exynos de Samsung."),
            en = LocalizedContent("Who created Dimensity?", listOf("MediaTek", "Qualcomm", "Samsung", "Apple"), "Technology", "MediaTek created the Dimensity line for its high-end mobile processors, competing with Qualcomm's Snapdragon and Samsung's Exynos."),
            zh = LocalizedContent("谁创建了 Dimensity？", listOf("联发科", "高通", "三星", "苹果"), "科技", "联发科创建了 Dimensity 系列，用于其高端移动处理器，与高通的骁龙和三星的 Exynos 竞争。"),
            es = LocalizedContent("¿Quién creó Dimensity?", listOf("MediaTek", "Qualcomm", "Samsung", "Apple"), "Tecnología", "MediaTek creó la gama Dimensity para sus procesadores móviles de gama alta, compitiendo con los Snapdragon de Qualcomm y los Exynos de Samsung.")
        ),
        BilingualQuestion(
            id = 11345, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année Bionic a-t-il été créé?", listOf("2017", "2015", "2019", "2021"), "Technologie", "Bionic, le moteur de recherche axé sur la vie privée, a été lancé en 2017 par une équipe souhaitant offrir une alternative sans traçage des données."),
            en = LocalizedContent("In what year was Bionic created?", listOf("2017", "2015", "2019", "2021"), "Technology", "Bionic, the privacy-focused search engine, was launched in 2017 by a team aiming to provide a data-tracking-free alternative."),
            zh = LocalizedContent("Bionic 是哪一年创建的？", listOf("2017", "2015", "2019", "2021"), "科技", "Bionic 是一款注重隐私的搜索引擎，由一支团队于 2017 年推出，旨在提供无数据追踪的替代方案。"),
            es = LocalizedContent("¿En qué año se creó Bionic?", listOf("2017", "2015", "2019", "2021"), "Tecnología", "Bionic, el motor de búsqueda centrado en la privacidad, fue lanzado en 2017 por un equipo que buscaba ofrecer una alternativa sin rastreo de datos.")
        ),
        BilingualQuestion(
            id = 11346, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a créé Bionic?", listOf("Google", "Apple", "Qualcomm", "MediaTek"), "Technologie", "Bionic est un projet de Google visant à développer des prothèses robotiques avancées, notamment pour les personnes amputées."),
            en = LocalizedContent("Who created Bionic?", listOf("Google", "Apple", "Qualcomm", "MediaTek"), "Technology", "Bionic is a Google project aimed at developing advanced robotic prosthetics, especially for amputees."),
            zh = LocalizedContent("谁创建了 Bionic？", listOf("谷歌", "苹果", "高通", "联发科"), "科技", "Bionic 是谷歌的一个项目，旨在开发先进的机器人假肢，特别是为截肢者服务。"),
            es = LocalizedContent("¿Quién creó Bionic?", listOf("Google", "Apple", "Qualcomm", "MediaTek"), "Tecnología", "Bionic es un proyecto de Google destinado a desarrollar prótesis robóticas avanzadas, especialmente para personas amputadas.")
        ),
        BilingualQuestion(
            id = 11347, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année Helio a-t-il été créé?", listOf("2016", "2014", "2018", "2020"), "Technologie", "Helio a été fondé en 2016 par des anciens d'Apple et de Google pour développer des smartphones."),
            en = LocalizedContent("In what year was Helio created?", listOf("2016", "2014", "2018", "2020"), "Technology", "Helio was founded in 2016 by former Apple and Google employees to develop smartphones."),
            zh = LocalizedContent("Helio 是哪一年创建的？", listOf("2016", "2014", "2018", "2020"), "科技", "Helio 由前苹果和谷歌员工于 2016 年创立，旨在开发智能手机。"),
            es = LocalizedContent("¿En qué año se creó Helio?", listOf("2016", "2014", "2018", "2020"), "Tecnología", "Helio fue fundado en 2016 por exempleados de Apple y Google para desarrollar teléfonos inteligentes.")
        ),
        BilingualQuestion(
            id = 11348, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a créé Helio?", listOf("MediaTek", "Qualcomm", "Samsung", "Apple"), "Technologie", "MediaTek a développé Helio, une gamme de processeurs pour smartphones, afin de concurrencer Qualcomm et Samsung sur le marché des puces mobiles."),
            en = LocalizedContent("Who created Helio?", listOf("MediaTek", "Qualcomm", "Samsung", "Apple"), "Technology", "MediaTek developed Helio, a line of smartphone processors, to compete with Qualcomm and Samsung in the mobile chip market."),
            zh = LocalizedContent("谁创建了 Helio？", listOf("联发科", "高通", "三星", "苹果"), "科技", "联发科开发了 Helio 系列智能手机处理器，以在移动芯片市场上与高通和三星竞争。"),
            es = LocalizedContent("¿Quién creó Helio?", listOf("MediaTek", "Qualcomm", "Samsung", "Apple"), "Tecnología", "MediaTek desarrolló Helio, una gama de procesadores para teléfonos inteligentes, para competir con Qualcomm y Samsung en el mercado de chips móviles.")
        ),
        BilingualQuestion(
            id = 11349, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année Kirin a-t-il été créé?", listOf("2012", "2010", "2014", "2016"), "Technologie", "Kirin est une marque de processeurs mobiles développée par Huawei, et sa première puce, le Kirin 910, a été lancée en 2012."),
            en = LocalizedContent("In what year was Kirin created?", listOf("2012", "2010", "2014", "2016"), "Technology", "Kirin is a brand of mobile processors developed by Huawei, and its first chip, the Kirin 910, was launched in 2012."),
            zh = LocalizedContent("Kirin 是哪一年创建的？", listOf("2012", "2010", "2014", "2016"), "科技", "Kirin 是华为开发的移动处理器品牌，其首款芯片 Kirin 910 于 2012 年推出。"),
            es = LocalizedContent("¿En qué año se creó Kirin?", listOf("2012", "2010", "2014", "2016"), "Tecnología", "Kirin es una marca de procesadores móviles desarrollada por Huawei, y su primer chip, el Kirin 910, se lanzó en 2012.")
        ),
        BilingualQuestion(
            id = 11350, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a créé Kirin?", listOf("Huawei", "Samsung", "Apple", "Qualcomm"), "Technologie", "Kirin est une marque de processeurs pour smartphones développée par la société chinoise Huawei, via sa filiale HiSilicon."),
            en = LocalizedContent("Who created Kirin?", listOf("Huawei", "Samsung", "Apple", "Qualcomm"), "Technology", "Kirin is a brand of smartphone processors developed by the Chinese company Huawei, through its subsidiary HiSilicon."),
            zh = LocalizedContent("谁创造了麒麟？", listOf("华为", "三星", "苹果", "高通"), "科技", "麒麟是智能手机处理器品牌，由中国公司华为通过其子公司海思半导体开发。"),
            es = LocalizedContent("¿Quién creó Kirin?", listOf("Huawei", "Samsung", "Apple", "Qualcomm"), "Tecnología", "Kirin es una marca de procesadores para teléfonos inteligentes desarrollada por la empresa china Huawei, a través de su filial HiSilicon.")
        ),
        BilingualQuestion(
            id = 11351, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le langage de programmation le plus utilisé au monde?", listOf("Python", "JavaScript", "Java", "C++"), "Technologie", "Python est largement utilisé dans l'intelligence artificielle, la science des données et le développement web, ce qui explique sa popularité mondiale. Son classement en tête des indices TIOBE et PYPL reflète cette adoption massive."),
            en = LocalizedContent("What is the most used programming language in the world?", listOf("Python", "JavaScript", "Java", "C++"), "Technology", "Python is widely used in artificial intelligence, data science, and web development, explaining its global popularity. Its top ranking in TIOBE and PYPL indices reflects this massive adoption."),
            zh = LocalizedContent("世界上使用最多的编程语言是什么？", listOf("Python", "JavaScript", "Java", "C++"), "科技", "Python广泛应用于人工智能、数据科学和Web开发，这解释了其全球流行度。它在TIOBE和PYPL指数中的领先排名反映了这种大规模采用。"),
            es = LocalizedContent("¿Cuál es el lenguaje de programación más utilizado en el mundo?", listOf("Python", "JavaScript", "Java", "C++"), "Tecnología", "Python se usa ampliamente en inteligencia artificial, ciencia de datos y desarrollo web, lo que explica su popularidad mundial. Su clasificación superior en los índices TIOBE y PYPL refleja esta adopción masiva.")
        ),
        BilingualQuestion(
            id = 11352, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année C a-t-il été créé?", listOf("1972", "1970", "1974", "1976"), "Technologie", "Le langage C a été développé par Dennis Ritchie aux Bell Labs en 1972 pour la création du système d'exploitation Unix."),
            en = LocalizedContent("In what year was C created?", listOf("1972", "1970", "1974", "1976"), "Technology", "The C language was developed by Dennis Ritchie at Bell Labs in 1972 for the creation of the Unix operating system."),
            zh = LocalizedContent("C语言是哪一年创建的？", listOf("1972", "1970", "1974", "1976"), "科技", "C语言由丹尼斯·里奇于1972年在贝尔实验室开发，用于创建Unix操作系统。"),
            es = LocalizedContent("¿En qué año se creó C?", listOf("1972", "1970", "1974", "1976"), "Tecnología", "El lenguaje C fue desarrollado por Dennis Ritchie en los Laboratorios Bell en 1972 para la creación del sistema operativo Unix.")
        ),
        BilingualQuestion(
            id = 11353, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a créé C?", listOf("Dennis Ritchie", "Guido van Rossum", "Bjarne Stroustrup", "Graydon Hoare"), "Technologie", "Dennis Ritchie a créé le langage C aux Bell Labs dans les années 1970, principalement pour le développement du système d'exploitation Unix."),
            en = LocalizedContent("Who created C?", listOf("Dennis Ritchie", "Guido van Rossum", "Bjarne Stroustrup", "Graydon Hoare"), "Technology", "Dennis Ritchie created the C language at Bell Labs in the 1970s, primarily for the development of the Unix operating system."),
            zh = LocalizedContent("谁创造了C语言？", listOf("丹尼斯·里奇", "吉多·范罗苏姆", "比雅尼·斯特劳斯特鲁普", "格雷登·霍尔"), "科技", "丹尼斯·里奇在20世纪70年代于贝尔实验室创建了C语言，主要用于Unix操作系统的开发。"),
            es = LocalizedContent("¿Quién creó C?", listOf("Dennis Ritchie", "Guido van Rossum", "Bjarne Stroustrup", "Graydon Hoare"), "Tecnología", "Dennis Ritchie creó el lenguaje C en los Laboratorios Bell en la década de 1970, principalmente para el desarrollo del sistema operativo Unix.")
        ),
        BilingualQuestion(
            id = 11354, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année C++ a-t-il été créé?", listOf("1983", "1981", "1985", "1987"), "Technologie", "Le langage C++ a été développé par Bjarne Stroustrup aux laboratoires Bell, avec la première version publiée en 1983."),
            en = LocalizedContent("In what year was C++ created?", listOf("1983", "1981", "1985", "1987"), "Technology", "The C++ language was developed by Bjarne Stroustrup at Bell Labs, with the first version published in 1983."),
            zh = LocalizedContent("C++是哪一年创建的？", listOf("1983", "1981", "1985", "1987"), "科技", "C++语言由比雅尼·斯特劳斯特鲁普在贝尔实验室开发，第一个版本于1983年发布。"),
            es = LocalizedContent("¿En qué año se creó C++?", listOf("1983", "1981", "1985", "1987"), "Tecnología", "El lenguaje C++ fue desarrollado por Bjarne Stroustrup en los Laboratorios Bell, con la primera versión publicada en 1983.")
        ),
        BilingualQuestion(
            id = 11355, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a créé C++?", listOf("Bjarne Stroustrup", "Guido van Rossum", "Dennis Ritchie", "Graydon Hoare"), "Technologie", "Bjarne Stroustrup, un informaticien danois, a développé le langage C++ au début des années 1980 aux Bell Labs comme une extension du langage C."),
            en = LocalizedContent("Who created C++?", listOf("Bjarne Stroustrup", "Guido van Rossum", "Dennis Ritchie", "Graydon Hoare"), "Technology", "Bjarne Stroustrup, a Danish computer scientist, developed the C++ language in the early 1980s at Bell Labs as an extension of the C language."),
            zh = LocalizedContent("谁创造了C++？", listOf("比雅尼·斯特劳斯特鲁普", "吉多·范罗苏姆", "丹尼斯·里奇", "格雷登·霍尔"), "科技", "丹麦计算机科学家比雅尼·斯特劳斯特鲁普在20世纪80年代初于贝尔实验室开发了C++语言，作为C语言的扩展。"),
            es = LocalizedContent("¿Quién creó C++?", listOf("Bjarne Stroustrup", "Guido van Rossum", "Dennis Ritchie", "Graydon Hoare"), "Tecnología", "Bjarne Stroustrup, un informático danés, desarrolló el lenguaje C++ a principios de la década de 1980 en los Laboratorios Bell como una extensión del lenguaje C.")
        ),
        BilingualQuestion(
            id = 11356, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année Java a-t-il été créé?", listOf("1995", "1993", "1997", "1999"), "Technologie", "Java a été créé par James Gosling chez Sun Microsystems et sa première version publique est sortie en 1995."),
            en = LocalizedContent("In what year was Java created?", listOf("1995", "1993", "1997", "1999"), "Technology", "Java was created by James Gosling at Sun Microsystems and its first public version was released in 1995."),
            zh = LocalizedContent("Java是哪一年创建的？", listOf("1995", "1993", "1997", "1999"), "科技", "Java由詹姆斯·高斯林在Sun Microsystems创建，其第一个公开版本于1995年发布。"),
            es = LocalizedContent("¿En qué año se creó Java?", listOf("1995", "1993", "1997", "1999"), "Tecnología", "Java fue creado por James Gosling en Sun Microsystems y su primera versión pública se lanzó en 1995.")
        ),
        BilingualQuestion(
            id = 11357, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a créé Java?", listOf("James Gosling", "Guido van Rossum", "Dennis Ritchie", "Bjarne Stroustrup"), "Technologie", "James Gosling a conçu Java chez Sun Microsystems au début des années 1990, avec pour objectif de créer un langage portable et indépendant des plateformes."),
            en = LocalizedContent("Who created Java?", listOf("James Gosling", "Guido van Rossum", "Dennis Ritchie", "Bjarne Stroustrup"), "Technology", "James Gosling designed Java at Sun Microsystems in the early 1990s, with the goal of creating a portable and platform-independent language."),
            zh = LocalizedContent("谁创造了Java？", listOf("詹姆斯·高斯林", "吉多·范罗苏姆", "丹尼斯·里奇", "比雅尼·斯特劳斯特鲁普"), "科技", "詹姆斯·高斯林在20世纪90年代初于Sun Microsystems设计了Java，目标是创建一种可移植且独立于平台的语言。"),
            es = LocalizedContent("¿Quién creó Java?", listOf("James Gosling", "Guido van Rossum", "Dennis Ritchie", "Bjarne Stroustrup"), "Tecnología", "James Gosling diseñó Java en Sun Microsystems a principios de la década de 1990, con el objetivo de crear un lenguaje portátil e independiente de la plataforma.")
        ),
        BilingualQuestion(
            id = 11358, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année Python a-t-il été créé?", listOf("1989", "1987", "1991", "1993"), "Technologie", "Python a été créé par Guido van Rossum en 1989, bien que la première version publique soit sortie en 1991."),
            en = LocalizedContent("In what year was Python created?", listOf("1989", "1987", "1991", "1993"), "Technology", "Python was created by Guido van Rossum in 1989, although the first public version was released in 1991."),
            zh = LocalizedContent("Python是哪一年创建的？", listOf("1989", "1987", "1991", "1993"), "科技", "Python由吉多·范罗苏姆于1989年创建，尽管第一个公开版本于1991年发布。"),
            es = LocalizedContent("¿En qué año se creó Python?", listOf("1989", "1987", "1991", "1993"), "Tecnología", "Python fue creado por Guido van Rossum en 1989, aunque la primera versión pública se lanzó en 1991.")
        ),
        BilingualQuestion(
            id = 11359, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui a créé Python?", listOf("Guido van Rossum", "Dennis Ritchie", "Bjarne Stroustrup", "James Gosling"), "Technologie", "Guido van Rossum a créé Python à la fin des années 1980, et le langage a été publié pour la première fois en 1991. Il est souvent surnommé le « BDFL » (Benevolent Dictator For Life) de Python."),
            en = LocalizedContent("Who created Python?", listOf("Guido van Rossum", "Dennis Ritchie", "Bjarne Stroustrup", "James Gosling"), "Technology", "Guido van Rossum created Python in the late 1980s, and the language was first published in 1991. He is often referred to as the 'BDFL' (Benevolent Dictator For Life) of Python."),
            zh = LocalizedContent("谁创造了Python？", listOf("吉多·范罗苏姆", "丹尼斯·里奇", "比雅尼·斯特劳斯特鲁普", "詹姆斯·高斯林"), "科技", "吉多·范罗苏姆在20世纪80年代末创建了Python，该语言于1991年首次发布。他常被称为Python的“终身仁慈独裁者”（BDFL）。"),
            es = LocalizedContent("¿Quién creó Python?", listOf("Guido van Rossum", "Dennis Ritchie", "Bjarne Stroustrup", "James Gosling"), "Tecnología", "Guido van Rossum creó Python a finales de la década de 1980, y el lenguaje se publicó por primera vez en 1991. A menudo se le conoce como el 'BDFL' (Dictador Benevolente Vitalicio) de Python.")
        ),
        BilingualQuestion(
            id = 11360, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année PHP a-t-il été créé?", listOf("1995", "1993", "1997", "1999"), "Technologie", "PHP a été créé en 1995 par Rasmus Lerdorf, initialement comme un ensemble de scripts CGI pour suivre les visites de son site web."),
            en = LocalizedContent("In what year was PHP created?", listOf("1995", "1993", "1997", "1999"), "Technology", "PHP was created in 1995 by Rasmus Lerdorf, initially as a set of CGI scripts to track visits to his website."),
            zh = LocalizedContent("PHP 是哪一年创建的？", listOf("1995", "1993", "1997", "1999"), "科技", "PHP 由 Rasmus Lerdorf 于 1995 年创建，最初是一组用于跟踪其网站访问量的 CGI 脚本。"),
            es = LocalizedContent("¿En qué año se creó PHP?", listOf("1995", "1993", "1997", "1999"), "Tecnología", "PHP fue creado en 1995 por Rasmus Lerdorf, inicialmente como un conjunto de scripts CGI para rastrear las visitas a su sitio web.")
        ),
        BilingualQuestion(
            id = 11361, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a créé PHP?", listOf("Rasmus Lerdorf", "Guido van Rossum", "Dennis Ritchie", "Bjarne Stroustrup"), "Technologie", "Rasmus Lerdorf a créé PHP en 1994 comme un ensemble de scripts CGI pour gérer son site web personnel. Le langage a ensuite évolué pour devenir un langage de programmation serveur largement utilisé."),
            en = LocalizedContent("Who created PHP?", listOf("Rasmus Lerdorf", "Guido van Rossum", "Dennis Ritchie", "Bjarne Stroustrup"), "Technology", "Rasmus Lerdorf created PHP in 1994 as a set of CGI scripts to manage his personal website. The language later evolved into a widely used server-side programming language."),
            zh = LocalizedContent("谁创建了 PHP？", listOf("拉斯穆斯·勒多夫", "吉多·范罗苏姆", "丹尼斯·里奇", "比雅尼·斯特劳斯特鲁普"), "科技", "拉斯穆斯·勒多夫于 1994 年创建了 PHP，最初是一组用于管理其个人网站的 CGI 脚本。该语言后来演变为广泛使用的服务器端编程语言。"),
            es = LocalizedContent("¿Quién creó PHP?", listOf("Rasmus Lerdorf", "Guido van Rossum", "Dennis Ritchie", "Bjarne Stroustrup"), "Tecnología", "Rasmus Lerdorf creó PHP en 1994 como un conjunto de scripts CGI para gestionar su sitio web personal. El lenguaje luego evolucionó hasta convertirse en un lenguaje de programación del lado del servidor ampliamente utilizado.")
        ),
        BilingualQuestion(
            id = 11362, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année Perl a-t-il été créé?", listOf("1987", "1985", "1989", "1991"), "Technologie", "Perl a été créé par Larry Wall en 1987, initialement comme un outil de traitement de texte pour systèmes Unix."),
            en = LocalizedContent("In what year was Perl created?", listOf("1987", "1985", "1989", "1991"), "Technology", "Perl was created by Larry Wall in 1987, initially as a text processing tool for Unix systems."),
            zh = LocalizedContent("Perl 是哪一年创建的？", listOf("1987", "1985", "1989", "1991"), "科技", "Perl 由 Larry Wall 于 1987 年创建，最初是 Unix 系统上的文本处理工具。"),
            es = LocalizedContent("¿En qué año se creó Perl?", listOf("1987", "1985", "1989", "1991"), "Tecnología", "Perl fue creado por Larry Wall en 1987, inicialmente como una herramienta de procesamiento de texto para sistemas Unix.")
        ),
        BilingualQuestion(
            id = 11363, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année Ruby a-t-il été créé?", listOf("1995", "1993", "1997", "1999"), "Technologie", "Ruby a été créé par Yukihiro Matsumoto en 1995, combinant des éléments de Perl, Smalltalk et Lisp pour un langage orienté objet et facile à lire."),
            en = LocalizedContent("In what year was Ruby created?", listOf("1995", "1993", "1997", "1999"), "Technology", "Ruby was created by Yukihiro Matsumoto in 1995, combining elements of Perl, Smalltalk, and Lisp for an object-oriented and easy-to-read language."),
            zh = LocalizedContent("Ruby 是哪一年创建的？", listOf("1995", "1993", "1997", "1999"), "科技", "Ruby 由松本行弘于 1995 年创建，结合了 Perl、Smalltalk 和 Lisp 的元素，成为一种面向对象且易于阅读的语言。"),
            es = LocalizedContent("¿En qué año se creó Ruby?", listOf("1995", "1993", "1997", "1999"), "Tecnología", "Ruby fue creado por Yukihiro Matsumoto en 1995, combinando elementos de Perl, Smalltalk y Lisp para un lenguaje orientado a objetos y fácil de leer.")
        ),
        BilingualQuestion(
            id = 11364, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année Go a-t-il été créé?", listOf("2009", "2007", "2011", "2013"), "Technologie", "Go, le langage de programmation développé par Google, a été créé en 2009 par Robert Griesemer, Rob Pike et Ken Thompson."),
            en = LocalizedContent("In what year was Go created?", listOf("2009", "2007", "2011", "2013"), "Technology", "Go, the programming language developed by Google, was created in 2009 by Robert Griesemer, Rob Pike, and Ken Thompson."),
            zh = LocalizedContent("Go 是哪一年创建的？", listOf("2009", "2007", "2011", "2013"), "科技", "Go 是 Google 开发的编程语言，由 Robert Griesemer、Rob Pike 和 Ken Thompson 于 2009 年创建。"),
            es = LocalizedContent("¿En qué año se creó Go?", listOf("2009", "2007", "2011", "2013"), "Tecnología", "Go, el lenguaje de programación desarrollado por Google, fue creado en 2009 por Robert Griesemer, Rob Pike y Ken Thompson.")
        ),
        BilingualQuestion(
            id = 11365, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année Rust a-t-il été créé?", listOf("2010", "2008", "2012", "2014"), "Technologie", "Le langage de programmation Rust a été initialement conçu par Graydon Hoare en 2006, mais sa première version stable est sortie en 2010."),
            en = LocalizedContent("In what year was Rust created?", listOf("2010", "2008", "2012", "2014"), "Technology", "The Rust programming language was initially designed by Graydon Hoare in 2006, but its first stable version was released in 2010."),
            zh = LocalizedContent("Rust 是哪一年创建的？", listOf("2010", "2008", "2012", "2014"), "科技", "Rust 编程语言最初由 Graydon Hoare 于 2006 年设计，但其第一个稳定版本于 2010 年发布。"),
            es = LocalizedContent("¿En qué año se creó Rust?", listOf("2010", "2008", "2012", "2014"), "Tecnología", "El lenguaje de programación Rust fue diseñado inicialmente por Graydon Hoare en 2006, pero su primera versión estable se lanzó en 2010.")
        ),
        BilingualQuestion(
            id = 11366, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année TypeScript a-t-il été créé?", listOf("2012", "2010", "2014", "2016"), "Technologie", "TypeScript a été créé par Microsoft en 2012 pour ajouter un typage statique optionnel à JavaScript, améliorant ainsi le développement d'applications à grande échelle."),
            en = LocalizedContent("In what year was TypeScript created?", listOf("2012", "2010", "2014", "2016"), "Technology", "TypeScript was created by Microsoft in 2012 to add optional static typing to JavaScript, improving large-scale application development."),
            zh = LocalizedContent("TypeScript 是哪一年创建的？", listOf("2012", "2010", "2014", "2016"), "科技", "TypeScript 由微软于 2012 年创建，为 JavaScript 添加了可选的静态类型，改进了大规模应用程序的开发。"),
            es = LocalizedContent("¿En qué año se creó TypeScript?", listOf("2012", "2010", "2014", "2016"), "Tecnología", "TypeScript fue creado por Microsoft en 2012 para agregar tipado estático opcional a JavaScript, mejorando el desarrollo de aplicaciones a gran escala.")
        ),
        BilingualQuestion(
            id = 11367, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année Kotlin a-t-il été créé?", listOf("2011", "2009", "2013", "2015"), "Technologie", "Kotlin a été créé par JetBrains en 2011, initialement comme un langage de programmation pour la JVM, avant de devenir un langage officiel pour Android en 2017."),
            en = LocalizedContent("In what year was Kotlin created?", listOf("2011", "2009", "2013", "2015"), "Technology", "Kotlin was created by JetBrains in 2011, initially as a programming language for the JVM, before becoming an official language for Android in 2017."),
            zh = LocalizedContent("Kotlin 是哪一年创建的？", listOf("2011", "2009", "2013", "2015"), "科技", "Kotlin 由 JetBrains 于 2011 年创建，最初是 JVM 的编程语言，后来于 2017 年成为 Android 的官方语言。"),
            es = LocalizedContent("¿En qué año se creó Kotlin?", listOf("2011", "2009", "2013", "2015"), "Tecnología", "Kotlin fue creado por JetBrains en 2011, inicialmente como un lenguaje de programación para la JVM, antes de convertirse en un lenguaje oficial para Android en 2017.")
        ),
        BilingualQuestion(
            id = 11368, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année Swift a-t-il été créé?", listOf("2014", "2012", "2016", "2018"), "Technologie", "Swift a été dévoilé par Apple lors de la WWDC en juin 2014, remplaçant progressivement Objective-C pour le développement d'applications iOS et macOS."),
            en = LocalizedContent("In what year was Swift created?", listOf("2014", "2012", "2016", "2018"), "Technology", "Swift was unveiled by Apple at WWDC in June 2014, gradually replacing Objective-C for iOS and macOS app development."),
            zh = LocalizedContent("Swift 是哪一年创建的？", listOf("2014", "2012", "2016", "2018"), "科技", "Swift 由苹果公司在 2014 年 6 月的 WWDC 上发布，逐渐取代 Objective-C 用于 iOS 和 macOS 应用开发。"),
            es = LocalizedContent("¿En qué año se creó Swift?", listOf("2014", "2012", "2016", "2018"), "Tecnología", "Swift fue presentado por Apple en la WWDC de junio de 2014, reemplazando gradualmente a Objective-C para el desarrollo de aplicaciones iOS y macOS.")
        ),
        BilingualQuestion(
            id = 11369, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année Dart a-t-il été créé?", listOf("2011", "2009", "2013", "2015"), "Technologie", "Dart a été dévoilé par Google en 2011 comme une alternative à JavaScript pour le développement web. Il a été conçu par Lars Bak et Kasper Lund."),
            en = LocalizedContent("In what year was Dart created?", listOf("2011", "2009", "2013", "2015"), "Technology", "Dart was unveiled by Google in 2011 as an alternative to JavaScript for web development. It was designed by Lars Bak and Kasper Lund."),
            zh = LocalizedContent("Dart 是哪一年创建的？", listOf("2011", "2009", "2013", "2015"), "科技", "Dart 由谷歌于 2011 年发布，作为 JavaScript 的替代品用于 Web 开发。它由 Lars Bak 和 Kasper Lund 设计。"),
            es = LocalizedContent("¿En qué año se creó Dart?", listOf("2011", "2009", "2013", "2015"), "Tecnología", "Dart fue presentado por Google en 2011 como una alternativa a JavaScript para el desarrollo web. Fue diseñado por Lars Bak y Kasper Lund.")
        ),
        BilingualQuestion(
            id = 11370, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année R a-t-il été créé?", listOf("1993", "1991", "1995", "1997"), "Technologie", "R a été créé en 1993 par Ross Ihaka et Robert Gentleman à l'Université d'Auckland, en Nouvelle-Zélande, comme un langage de programmation statistique."),
            en = LocalizedContent("In what year was R created?", listOf("1993", "1991", "1995", "1997"), "Technology", "R was created in 1993 by Ross Ihaka and Robert Gentleman at the University of Auckland, New Zealand, as a statistical programming language."),
            zh = LocalizedContent("R语言是哪一年创建的？", listOf("1993", "1991", "1995", "1997"), "科技", "R语言于1993年由Ross Ihaka和Robert Gentleman在新西兰奥克兰大学创建，作为一种统计编程语言。"),
            es = LocalizedContent("¿En qué año se creó R?", listOf("1993", "1991", "1995", "1997"), "Tecnología", "R fue creado en 1993 por Ross Ihaka y Robert Gentleman en la Universidad de Auckland, Nueva Zelanda, como un lenguaje de programación estadística.")
        ),
        BilingualQuestion(
            id = 11371, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année MATLAB a-t-il été créé?", listOf("1984", "1982", "1986", "1988"), "Technologie", "MATLAB a été créé en 1984 par Cleve Moler, un mathématicien américain, pour offrir un accès simplifié aux bibliothèques de calcul numérique."),
            en = LocalizedContent("In what year was MATLAB created?", listOf("1984", "1982", "1986", "1988"), "Technology", "MATLAB was created in 1984 by Cleve Moler, an American mathematician, to provide simplified access to numerical computing libraries."),
            zh = LocalizedContent("MATLAB是哪一年创建的？", listOf("1984", "1982", "1986", "1988"), "科技", "MATLAB于1984年由美国数学家Cleve Moler创建，旨在简化对数值计算库的访问。"),
            es = LocalizedContent("¿En qué año se creó MATLAB?", listOf("1984", "1982", "1986", "1988"), "Tecnología", "MATLAB fue creado en 1984 por Cleve Moler, un matemático estadounidense, para proporcionar acceso simplificado a bibliotecas de cálculo numérico.")
        ),
        BilingualQuestion(
            id = 11372, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année Lua a-t-il été créé?", listOf("1993", "1991", "1995", "1997"), "Technologie", "Lua a été créé en 1993 par un groupe de chercheurs brésiliens de l'Université pontificale catholique de Rio de Janeiro pour offrir un langage de script léger et extensible."),
            en = LocalizedContent("In what year was Lua created?", listOf("1993", "1991", "1995", "1997"), "Technology", "Lua was created in 1993 by a group of Brazilian researchers at the Pontifical Catholic University of Rio de Janeiro to provide a lightweight and extensible scripting language."),
            zh = LocalizedContent("Lua是哪一年创建的？", listOf("1993", "1991", "1995", "1997"), "科技", "Lua于1993年由巴西里约热内卢天主教大学的一组研究人员创建，旨在提供一种轻量级且可扩展的脚本语言。"),
            es = LocalizedContent("¿En qué año se creó Lua?", listOf("1993", "1991", "1995", "1997"), "Tecnología", "Lua fue creado en 1993 por un grupo de investigadores brasileños de la Universidad Pontificia Católica de Río de Janeiro para ofrecer un lenguaje de script ligero y extensible.")
        ),
        BilingualQuestion(
            id = 11373, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année Groovy a-t-il été créé?", listOf("2003", "2001", "2005", "2007"), "Technologie", "Groovy a été créé par James Strachan en 2003 comme un langage de script dynamique pour la plateforme Java, visant à offrir une syntaxe plus concise."),
            en = LocalizedContent("In what year was Groovy created?", listOf("2003", "2001", "2005", "2007"), "Technology", "Groovy was created by James Strachan in 2003 as a dynamic scripting language for the Java platform, aiming to provide a more concise syntax."),
            zh = LocalizedContent("Groovy是哪一年创建的？", listOf("2003", "2001", "2005", "2007"), "科技", "Groovy由James Strachan于2003年创建，作为Java平台的动态脚本语言，旨在提供更简洁的语法。"),
            es = LocalizedContent("¿En qué año se creó Groovy?", listOf("2003", "2001", "2005", "2007"), "Tecnología", "Groovy fue creado por James Strachan en 2003 como un lenguaje de script dinámico para la plataforma Java, con el objetivo de ofrecer una sintaxis más concisa.")
        ),
        BilingualQuestion(
            id = 11374, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année Scala a-t-il été créé?", listOf("2004", "2002", "2006", "2008"), "Technologie", "Scala a été conçu par Martin Odersky et présenté pour la première fois en 2004, combinant programmation fonctionnelle et orientée objet pour la machine virtuelle Java."),
            en = LocalizedContent("In what year was Scala created?", listOf("2004", "2002", "2006", "2008"), "Technology", "Scala was designed by Martin Odersky and first presented in 2004, combining functional and object-oriented programming for the Java Virtual Machine."),
            zh = LocalizedContent("Scala是哪一年创建的？", listOf("2004", "2002", "2006", "2008"), "科技", "Scala由Martin Odersky设计，并于2004年首次发布，结合了函数式编程和面向对象编程，运行在Java虚拟机上。"),
            es = LocalizedContent("¿En qué año se creó Scala?", listOf("2004", "2002", "2006", "2008"), "Tecnología", "Scala fue diseñado por Martin Odersky y presentado por primera vez en 2004, combinando programación funcional y orientada a objetos para la máquina virtual Java.")
        ),
        BilingualQuestion(
            id = 11375, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année Clojure a-t-il été créé?", listOf("2007", "2005", "2009", "2011"), "Technologie", "Clojure a été créé par Rich Hickey en 2007 comme un dialecte moderne de Lisp fonctionnant sur la machine virtuelle Java (JVM)."),
            en = LocalizedContent("In what year was Clojure created?", listOf("2007", "2005", "2009", "2011"), "Technology", "Clojure was created by Rich Hickey in 2007 as a modern dialect of Lisp running on the Java Virtual Machine (JVM)."),
            zh = LocalizedContent("Clojure是哪一年创建的？", listOf("2007", "2005", "2009", "2011"), "科技", "Clojure由Rich Hickey于2007年创建，作为运行在Java虚拟机（JVM）上的现代Lisp方言。"),
            es = LocalizedContent("¿En qué año se creó Clojure?", listOf("2007", "2005", "2009", "2011"), "Tecnología", "Clojure fue creado por Rich Hickey en 2007 como un dialecto moderno de Lisp que funciona en la máquina virtual Java (JVM).")
        ),
        BilingualQuestion(
            id = 11376, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année Elixir a-t-il été créé?", listOf("2011", "2009", "2013", "2015"), "Technologie", "Elixir a été créé en 2011 par le développeur José Valim, initialement comme un langage de programmation fonctionnel conçu pour la concurrence et la tolérance aux pannes, s'appuyant sur la machine virtuelle Erlang."),
            en = LocalizedContent("In what year was Elixir created?", listOf("2011", "2009", "2013", "2015"), "Technology", "Elixir was created in 2011 by developer José Valim, initially as a functional programming language designed for concurrency and fault tolerance, built on the Erlang Virtual Machine."),
            zh = LocalizedContent("Elixir是哪一年创建的？", listOf("2011", "2009", "2013", "2015"), "科技", "Elixir由开发者José Valim于2011年创建，最初是一种为并发和容错设计的函数式编程语言，构建在Erlang虚拟机上。"),
            es = LocalizedContent("¿En qué año se creó Elixir?", listOf("2011", "2009", "2013", "2015"), "Tecnología", "Elixir fue creado en 2011 por el desarrollador José Valim, inicialmente como un lenguaje de programación funcional diseñado para la concurrencia y la tolerancia a fallos, basado en la máquina virtual de Erlang.")
        ),
        BilingualQuestion(
            id = 11377, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année Haskell a-t-il été créé?", listOf("1990", "1988", "1992", "1994"), "Technologie", "Haskell a été créé en 1990 par un comité de chercheurs, dont Simon Peyton Jones, pour standardiser les langages fonctionnels paresseux existants."),
            en = LocalizedContent("In what year was Haskell created?", listOf("1990", "1988", "1992", "1994"), "Technology", "Haskell was created in 1990 by a committee of researchers, including Simon Peyton Jones, to standardize existing lazy functional languages."),
            zh = LocalizedContent("Haskell是哪一年创建的？", listOf("1990", "1988", "1992", "1994"), "科技", "Haskell于1990年由包括Simon Peyton Jones在内的研究人员委员会创建，旨在标准化现有的惰性函数式语言。"),
            es = LocalizedContent("¿En qué año se creó Haskell?", listOf("1990", "1988", "1992", "1994"), "Tecnología", "Haskell fue creado en 1990 por un comité de investigadores, incluido Simon Peyton Jones, para estandarizar los lenguajes funcionales perezosos existentes.")
        ),
        BilingualQuestion(
            id = 11378, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année OCaml a-t-il été créé?", listOf("1996", "1994", "1998", "2000"), "Technologie", "OCaml a été créé en 1996 par l'INRIA, issu de la fusion du langage Caml Special Light avec des fonctionnalités orientées objet."),
            en = LocalizedContent("In what year was OCaml created?", listOf("1996", "1994", "1998", "2000"), "Technology", "OCaml was created in 1996 by INRIA, resulting from the merger of the Caml Special Light language with object-oriented features."),
            zh = LocalizedContent("OCaml是哪一年创建的？", listOf("1996", "1994", "1998", "2000"), "科技", "OCaml于1996年由法国国家信息与自动化研究所（INRIA）创建，由Caml Special Light语言与面向对象特性合并而成。"),
            es = LocalizedContent("¿En qué año se creó OCaml?", listOf("1996", "1994", "1998", "2000"), "Tecnología", "OCaml fue creado en 1996 por INRIA, resultado de la fusión del lenguaje Caml Special Light con características orientadas a objetos.")
        ),
        BilingualQuestion(
            id = 11379, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année Scheme a-t-il été créé?", listOf("1975", "1973", "1977", "1979"), "Technologie", "Scheme a été créé en 1975 par Guy L. Steele Jr. et Gerald Jay Sussman au MIT, comme un dialecte minimaliste du langage Lisp."),
            en = LocalizedContent("In what year was Scheme created?", listOf("1975", "1973", "1977", "1979"), "Technology", "Scheme was created in 1975 by Guy L. Steele Jr. and Gerald Jay Sussman at MIT, as a minimalist dialect of the Lisp language."),
            zh = LocalizedContent("Scheme是哪一年创建的？", listOf("1975", "1973", "1977", "1979"), "科技", "Scheme于1975年由Guy L. Steele Jr.和Gerald Jay Sussman在麻省理工学院创建，作为Lisp语言的一个极简方言。"),
            es = LocalizedContent("¿En qué año se creó Scheme?", listOf("1975", "1973", "1977", "1979"), "Tecnología", "Scheme fue creado en 1975 por Guy L. Steele Jr. y Gerald Jay Sussman en el MIT, como un dialecto minimalista del lenguaje Lisp.")
        ),
        BilingualQuestion(
            id = 11380, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le protocole de transfert de fichiers le plus ancien?", listOf("FTP", "SFTP", "SCP", "RSYNC"), "Technologie", "FTP (File Transfer Protocol) a été développé en 1971, bien avant HTTP, ce qui en fait le plus ancien protocole standard de transfert de fichiers sur Internet."),
            en = LocalizedContent("What is the oldest file transfer protocol?", listOf("FTP", "SFTP", "SCP", "RSYNC"), "Technology", "FTP (File Transfer Protocol) was developed in 1971, well before HTTP, making it the oldest standard file transfer protocol on the Internet."),
            zh = LocalizedContent("最古老的文件传输协议是什么？", listOf("FTP", "SFTP", "SCP", "RSYNC"), "科技", "FTP（文件传输协议）于1971年开发，远早于HTTP，是互联网上最古老的标准文件传输协议。"),
            es = LocalizedContent("¿Cuál es el protocolo de transferencia de archivos más antiguo?", listOf("FTP", "SFTP", "SCP", "RSYNC"), "Tecnología", "FTP (Protocolo de Transferencia de Archivos) fue desarrollado en 1971, mucho antes que HTTP, lo que lo convierte en el protocolo estándar de transferencia de archivos más antiguo en Internet.")
        ),
        BilingualQuestion(
            id = 11381, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année FTP a-t-il été créé?", listOf("1971", "1969", "1973", "1975"), "Technologie", "Le protocole FTP (File Transfer Protocol) a été développé en 1971 par Abhay Bhushan dans le cadre du projet ARPANET, l'ancêtre d'Internet."),
            en = LocalizedContent("In what year was FTP created?", listOf("1971", "1969", "1973", "1975"), "Technology", "The FTP (File Transfer Protocol) was developed in 1971 by Abhay Bhushan as part of the ARPANET project, the precursor to the Internet."),
            zh = LocalizedContent("FTP是哪一年创建的？", listOf("1971", "1969", "1973", "1975"), "科技", "FTP（文件传输协议）由Abhay Bhushan于1971年在ARPANET项目（互联网的前身）中开发。"),
            es = LocalizedContent("¿En qué año se creó FTP?", listOf("1971", "1969", "1973", "1975"), "Tecnología", "El protocolo FTP (Protocolo de Transferencia de Archivos) fue desarrollado en 1971 por Abhay Bhushan como parte del proyecto ARPANET, el precursor de Internet.")
        ),
        BilingualQuestion(
            id = 11382, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le protocole de shell sécurisé?", listOf("SSH", "Telnet", "Rsh", "Rlogin"), "Technologie", "SSH, pour Secure Shell, est un protocole réseau qui permet de se connecter à distance à un serveur de manière chiffrée, offrant une alternative sécurisée à des protocoles non cryptés comme Telnet."),
            en = LocalizedContent("What is the secure shell protocol?", listOf("SSH", "Telnet", "Rsh", "Rlogin"), "Technology", "SSH, for Secure Shell, is a network protocol that allows remote connection to a server in an encrypted manner, providing a secure alternative to unencrypted protocols like Telnet."),
            zh = LocalizedContent("什么是安全外壳协议？", listOf("SSH", "Telnet", "Rsh", "Rlogin"), "科技", "SSH（安全外壳）是一种网络协议，允许以加密方式远程连接到服务器，为Telnet等未加密协议提供了安全的替代方案。"),
            es = LocalizedContent("¿Cuál es el protocolo de shell seguro?", listOf("SSH", "Telnet", "Rsh", "Rlogin"), "Tecnología", "SSH, por Secure Shell, es un protocolo de red que permite conectarse de forma remota a un servidor de manera cifrada, ofreciendo una alternativa segura a protocolos no cifrados como Telnet.")
        ),
        BilingualQuestion(
            id = 11383, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année SSH a-t-il été créé?", listOf("1995", "1993", "1997", "1999"), "Technologie", "SSH a été développé en 1995 par Tatu Ylönen à l'université d'Helsinki pour remplacer les protocoles non sécurisés comme Telnet."),
            en = LocalizedContent("In what year was SSH created?", listOf("1995", "1993", "1997", "1999"), "Technology", "SSH was developed in 1995 by Tatu Ylönen at the University of Helsinki to replace insecure protocols like Telnet."),
            zh = LocalizedContent("SSH是哪一年创建的？", listOf("1995", "1993", "1997", "1999"), "科技", "SSH由Tatu Ylönen于1995年在赫尔辛基大学开发，用于替代Telnet等不安全的协议。"),
            es = LocalizedContent("¿En qué año se creó SSH?", listOf("1995", "1993", "1997", "1999"), "Tecnología", "SSH fue desarrollado en 1995 por Tatu Ylönen en la Universidad de Helsinki para reemplazar protocolos inseguros como Telnet.")
        ),
        BilingualQuestion(
            id = 11384, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a créé SSH?", listOf("Tatu Ylönen", "Mark Zuckerberg", "Jack Dorsey", "Steve Jobs"), "Technologie", "Tatu Ylönen a développé SSH en 1995 pour remplacer les protocoles non sécurisés comme Telnet, après une attaque par sniffing de mots de passe sur son réseau universitaire en Finlande."),
            en = LocalizedContent("Who created SSH?", listOf("Tatu Ylönen", "Mark Zuckerberg", "Jack Dorsey", "Steve Jobs"), "Technology", "Tatu Ylönen developed SSH in 1995 to replace insecure protocols like Telnet, after a password sniffing attack on his university network in Finland."),
            zh = LocalizedContent("谁创建了SSH？", listOf("Tatu Ylönen", "马克·扎克伯格", "杰克·多西", "史蒂夫·乔布斯"), "科技", "Tatu Ylönen于1995年开发了SSH，以替代Telnet等不安全的协议，此前他在芬兰的大学网络遭受了密码嗅探攻击。"),
            es = LocalizedContent("¿Quién creó SSH?", listOf("Tatu Ylönen", "Mark Zuckerberg", "Jack Dorsey", "Steve Jobs"), "Tecnología", "Tatu Ylönen desarrolló SSH en 1995 para reemplazar protocolos inseguros como Telnet, después de un ataque de sniffing de contraseñas en su red universitaria en Finlandia.")
        ),
        BilingualQuestion(
            id = 11385, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le protocole de messagerie le plus ancien?", listOf("SMTP", "POP3", "IMAP", "MAPI"), "Technologie", "SMTP (Simple Mail Transfer Protocol) a été défini en 1982 dans la RFC 821, ce qui en fait le plus ancien protocole de messagerie encore utilisé aujourd'hui."),
            en = LocalizedContent("What is the oldest email protocol?", listOf("SMTP", "POP3", "IMAP", "MAPI"), "Technology", "SMTP (Simple Mail Transfer Protocol) was defined in 1982 in RFC 821, making it the oldest email protocol still in use today."),
            zh = LocalizedContent("最古老的电子邮件协议是什么？", listOf("SMTP", "POP3", "IMAP", "MAPI"), "科技", "SMTP（简单邮件传输协议）于1982年在RFC 821中定义，是至今仍在使用的最古老的电子邮件协议。"),
            es = LocalizedContent("¿Cuál es el protocolo de correo electrónico más antiguo?", listOf("SMTP", "POP3", "IMAP", "MAPI"), "Tecnología", "SMTP (Protocolo Simple de Transferencia de Correo) fue definido en 1982 en la RFC 821, lo que lo convierte en el protocolo de correo electrónico más antiguo aún en uso.")
        ),
        BilingualQuestion(
            id = 11386, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année POP3 a-t-il été créé?", listOf("1988", "1986", "1990", "1992"), "Technologie", "Le protocole POP3 (Post Office Protocol version 3) a été développé en 1988 pour permettre la récupération de courriels depuis un serveur distant."),
            en = LocalizedContent("In what year was POP3 created?", listOf("1988", "1986", "1990", "1992"), "Technology", "The POP3 (Post Office Protocol version 3) was developed in 1988 to allow retrieval of emails from a remote server."),
            zh = LocalizedContent("POP3是哪一年创建的？", listOf("1988", "1986", "1990", "1992"), "科技", "POP3（邮局协议第3版）于1988年开发，用于从远程服务器检索电子邮件。"),
            es = LocalizedContent("¿En qué año se creó POP3?", listOf("1988", "1986", "1990", "1992"), "Tecnología", "El protocolo POP3 (Protocolo de Oficina de Correos versión 3) fue desarrollado en 1988 para permitir la recuperación de correos electrónicos desde un servidor remoto.")
        ),
        BilingualQuestion(
            id = 11387, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année IMAP a-t-il été créé?", listOf("1986", "1984", "1988", "1990"), "Technologie", "IMAP a été créé en 1986 par Mark Crispin comme alternative à POP, permettant une gestion plus flexible des emails directement sur le serveur."),
            en = LocalizedContent("In what year was IMAP created?", listOf("1986", "1984", "1988", "1990"), "Technology", "IMAP was created in 1986 by Mark Crispin as an alternative to POP, allowing more flexible management of emails directly on the server."),
            zh = LocalizedContent("IMAP是哪一年创建的？", listOf("1986", "1984", "1988", "1990"), "科技", "IMAP由Mark Crispin于1986年创建，作为POP的替代方案，允许直接在服务器上更灵活地管理电子邮件。"),
            es = LocalizedContent("¿En qué año se creó IMAP?", listOf("1986", "1984", "1988", "1990"), "Tecnología", "IMAP fue creado en 1986 por Mark Crispin como alternativa a POP, permitiendo una gestión más flexible de los correos electrónicos directamente en el servidor.")
        ),
        BilingualQuestion(
            id = 11388, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le protocole DNS?", listOf("Domain Name System", "Dynamic Network System", "Data Network Service", "Digital Name System"), "Technologie", "Le DNS, pour Domain Name System, est le protocole qui traduit les noms de domaine lisibles par les humains en adresses IP numériques, permettant ainsi d'accéder aux sites web."),
            en = LocalizedContent("What is the DNS protocol?", listOf("Domain Name System", "Dynamic Network System", "Data Network Service", "Digital Name System"), "Technology", "DNS, for Domain Name System, is the protocol that translates human-readable domain names into numerical IP addresses, enabling access to websites."),
            zh = LocalizedContent("什么是DNS协议？", listOf("域名系统", "动态网络系统", "数据网络服务", "数字名称系统"), "科技", "DNS（域名系统）是将人类可读的域名转换为数字IP地址的协议，从而实现对网站的访问。"),
            es = LocalizedContent("¿Cuál es el protocolo DNS?", listOf("Sistema de Nombres de Dominio", "Sistema de Red Dinámica", "Servicio de Red de Datos", "Sistema de Nombres Digitales"), "Tecnología", "DNS, por Sistema de Nombres de Dominio, es el protocolo que traduce los nombres de dominio legibles por humanos en direcciones IP numéricas, permitiendo acceder a sitios web.")
        ),
        BilingualQuestion(
            id = 11389, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année DNS a-t-il été créé?", listOf("1983", "1981", "1985", "1987"), "Technologie", "Le système DNS (Domain Name System) a été inventé en 1983 par Paul Mockapetris pour remplacer le fichier hosts.txt, permettant de traduire les noms de domaine en adresses IP."),
            en = LocalizedContent("In what year was DNS created?", listOf("1983", "1981", "1985", "1987"), "Technology", "The DNS (Domain Name System) was invented in 1983 by Paul Mockapetris to replace the hosts.txt file, enabling translation of domain names into IP addresses."),
            zh = LocalizedContent("DNS是哪一年创建的？", listOf("1983", "1981", "1985", "1987"), "科技", "DNS（域名系统）由Paul Mockapetris于1983年发明，用于替代hosts.txt文件，实现域名到IP地址的转换。"),
            es = LocalizedContent("¿En qué año se creó DNS?", listOf("1983", "1981", "1985", "1987"), "Tecnología", "El sistema DNS (Sistema de Nombres de Dominio) fue inventado en 1983 por Paul Mockapetris para reemplazar el archivo hosts.txt, permitiendo la traducción de nombres de dominio en direcciones IP.")
        ),
        BilingualQuestion(
            id = 11390, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a créé DNS?", listOf("Paul Mockapetris", "Mark Zuckerberg", "Jack Dorsey", "Steve Jobs"), "Technologie", "Paul Mockapetris a conçu le Domain Name System (DNS) en 1983, alors qu'il travaillait à l'Université de Californie du Sud, pour remplacer le fichier hosts.txt centralisé."),
            en = LocalizedContent("Who created DNS?", listOf("Paul Mockapetris", "Mark Zuckerberg", "Jack Dorsey", "Steve Jobs"), "Technology", "Paul Mockapetris designed the Domain Name System (DNS) in 1983 while working at the University of Southern California, to replace the centralized hosts.txt file."),
            zh = LocalizedContent("谁创建了DNS？", listOf("保罗·莫卡佩特里斯", "马克·扎克伯格", "杰克·多西", "史蒂夫·乔布斯"), "科技", "保罗·莫卡佩特里斯于1983年在南加州大学工作时设计了域名系统（DNS），以取代集中式的hosts.txt文件。"),
            es = LocalizedContent("¿Quién creó el DNS?", listOf("Paul Mockapetris", "Mark Zuckerberg", "Jack Dorsey", "Steve Jobs"), "Tecnología", "Paul Mockapetris diseñó el Sistema de Nombres de Dominio (DNS) en 1983 mientras trabajaba en la Universidad del Sur de California, para reemplazar el archivo hosts.txt centralizado.")
        ),
        BilingualQuestion(
            id = 11391, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le protocole DHCP?", listOf("Dynamic Host Configuration Protocol", "Dynamic Hardware Configuration Protocol", "Data Host Configuration Protocol", "Digital Host Configuration Protocol"), "Technologie", "Le DHCP (Dynamic Host Configuration Protocol) attribue automatiquement des adresses IP et autres paramètres réseau aux appareils, évitant une configuration manuelle."),
            en = LocalizedContent("What is the DHCP protocol?", listOf("Dynamic Host Configuration Protocol", "Dynamic Hardware Configuration Protocol", "Data Host Configuration Protocol", "Digital Host Configuration Protocol"), "Technology", "DHCP (Dynamic Host Configuration Protocol) automatically assigns IP addresses and other network parameters to devices, avoiding manual configuration."),
            zh = LocalizedContent("什么是DHCP协议？", listOf("动态主机配置协议", "动态硬件配置协议", "数据主机配置协议", "数字主机配置协议"), "科技", "DHCP（动态主机配置协议）自动为设备分配IP地址和其他网络参数，避免了手动配置。"),
            es = LocalizedContent("¿Qué es el protocolo DHCP?", listOf("Protocolo de Configuración Dinámica de Host", "Protocolo de Configuración Dinámica de Hardware", "Protocolo de Configuración de Host de Datos", "Protocolo de Configuración de Host Digital"), "Tecnología", "DHCP (Protocolo de Configuración Dinámica de Host) asigna automáticamente direcciones IP y otros parámetros de red a los dispositivos, evitando la configuración manual.")
        ),
        BilingualQuestion(
            id = 11392, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année DHCP a-t-il été créé?", listOf("1993", "1991", "1995", "1997"), "Technologie", "DHCP a été créé en 1993 en tant que successeur du protocole BOOTP, permettant l'attribution automatique d'adresses IP sur les réseaux."),
            en = LocalizedContent("In what year was DHCP created?", listOf("1993", "1991", "1995", "1997"), "Technology", "DHCP was created in 1993 as a successor to the BOOTP protocol, enabling automatic IP address assignment on networks."),
            zh = LocalizedContent("DHCP是哪一年创建的？", listOf("1993", "1991", "1995", "1997"), "科技", "DHCP于1993年创建，作为BOOTP协议的继任者，实现了网络上IP地址的自动分配。"),
            es = LocalizedContent("¿En qué año se creó DHCP?", listOf("1993", "1991", "1995", "1997"), "Tecnología", "DHCP se creó en 1993 como sucesor del protocolo BOOTP, permitiendo la asignación automática de direcciones IP en las redes.")
        ),
        BilingualQuestion(
            id = 11393, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le protocole ARP?", listOf("Address Resolution Protocol", "Advanced Resolution Protocol", "Application Resolution Protocol", "Adapter Resolution Protocol"), "Technologie", "ARP, pour Address Resolution Protocol, est un protocole réseau qui associe une adresse IP à une adresse MAC sur un réseau local, permettant ainsi la communication entre machines."),
            en = LocalizedContent("What is the ARP protocol?", listOf("Address Resolution Protocol", "Advanced Resolution Protocol", "Application Resolution Protocol", "Adapter Resolution Protocol"), "Technology", "ARP, for Address Resolution Protocol, is a network protocol that maps an IP address to a MAC address on a local network, enabling communication between machines."),
            zh = LocalizedContent("什么是ARP协议？", listOf("地址解析协议", "高级解析协议", "应用解析协议", "适配器解析协议"), "科技", "ARP（地址解析协议）是一种网络协议，将IP地址映射到本地网络上的MAC地址，从而实现机器之间的通信。"),
            es = LocalizedContent("¿Qué es el protocolo ARP?", listOf("Protocolo de Resolución de Direcciones", "Protocolo de Resolución Avanzada", "Protocolo de Resolución de Aplicaciones", "Protocolo de Resolución de Adaptadores"), "Tecnología", "ARP (Protocolo de Resolución de Direcciones) es un protocolo de red que asocia una dirección IP a una dirección MAC en una red local, permitiendo la comunicación entre máquinas.")
        ),
        BilingualQuestion(
            id = 11394, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année ARP a-t-il été créé?", listOf("1982", "1980", "1984", "1986"), "Technologie", "ARPANET a adopté le protocole ARP (Address Resolution Protocol) en 1982, permettant de mapper les adresses IP aux adresses physiques des machines sur le réseau."),
            en = LocalizedContent("In what year was ARP created?", listOf("1982", "1980", "1984", "1986"), "Technology", "ARPANET adopted the ARP (Address Resolution Protocol) in 1982, allowing mapping of IP addresses to physical machine addresses on the network."),
            zh = LocalizedContent("ARP是哪一年创建的？", listOf("1982", "1980", "1984", "1986"), "科技", "ARPANET于1982年采用了ARP（地址解析协议），允许将IP地址映射到网络上的物理机器地址。"),
            es = LocalizedContent("¿En qué año se creó ARP?", listOf("1982", "1980", "1984", "1986"), "Tecnología", "ARPANET adoptó el protocolo ARP (Protocolo de Resolución de Direcciones) en 1982, permitiendo mapear direcciones IP a direcciones físicas de las máquinas en la red.")
        ),
        BilingualQuestion(
            id = 11395, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le protocole ICMP?", listOf("Internet Control Message Protocol", "Internet Communication Message Protocol", "Internet Control Management Protocol", "Internet Computer Message Protocol"), "Technologie", "ICMP est un protocole de la couche réseau utilisé pour transmettre des messages d'erreur et des informations opérationnelles, comme dans la commande ping."),
            en = LocalizedContent("What is the ICMP protocol?", listOf("Internet Control Message Protocol", "Internet Communication Message Protocol", "Internet Control Management Protocol", "Internet Computer Message Protocol"), "Technology", "ICMP is a network layer protocol used to transmit error messages and operational information, such as in the ping command."),
            zh = LocalizedContent("什么是ICMP协议？", listOf("互联网控制消息协议", "互联网通信消息协议", "互联网控制管理协议", "互联网计算机消息协议"), "科技", "ICMP是一种网络层协议，用于传输错误消息和操作信息，例如在ping命令中。"),
            es = LocalizedContent("¿Qué es el protocolo ICMP?", listOf("Protocolo de Mensajes de Control de Internet", "Protocolo de Mensajes de Comunicación de Internet", "Protocolo de Gestión de Control de Internet", "Protocolo de Mensajes de Computadora de Internet"), "Tecnología", "ICMP es un protocolo de la capa de red utilizado para transmitir mensajes de error e información operativa, como en el comando ping.")
        ),
        BilingualQuestion(
            id = 11396, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année ICMP a-t-il été créé?", listOf("1981", "1979", "1983", "1985"), "Technologie", "Le protocole ICMP (Internet Control Message Protocol) a été défini pour la première fois dans la RFC 792 en septembre 1981, dans le cadre du développement des protocoles TCP/IP."),
            en = LocalizedContent("In what year was ICMP created?", listOf("1981", "1979", "1983", "1985"), "Technology", "The ICMP (Internet Control Message Protocol) was first defined in RFC 792 in September 1981, as part of the development of TCP/IP protocols."),
            zh = LocalizedContent("ICMP是哪一年创建的？", listOf("1981", "1979", "1983", "1985"), "科技", "ICMP（互联网控制消息协议）首次在1981年9月的RFC 792中定义，作为TCP/IP协议开发的一部分。"),
            es = LocalizedContent("¿En qué año se creó ICMP?", listOf("1981", "1979", "1983", "1985"), "Tecnología", "El protocolo ICMP (Protocolo de Mensajes de Control de Internet) se definió por primera vez en la RFC 792 en septiembre de 1981, como parte del desarrollo de los protocolos TCP/IP.")
        ),
        BilingualQuestion(
            id = 11397, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le protocole UDP?", listOf("User Datagram Protocol", "Universal Data Protocol", "Unified Data Protocol", "Unique Data Protocol"), "Technologie", "UDP signifie User Datagram Protocol, un protocole de communication qui envoie des données sans établir de connexion préalable, privilégiant la vitesse sur la fiabilité."),
            en = LocalizedContent("What is the UDP protocol?", listOf("User Datagram Protocol", "Universal Data Protocol", "Unified Data Protocol", "Unique Data Protocol"), "Technology", "UDP stands for User Datagram Protocol, a communication protocol that sends data without establishing a prior connection, prioritizing speed over reliability."),
            zh = LocalizedContent("什么是UDP协议？", listOf("用户数据报协议", "通用数据协议", "统一数据协议", "唯一数据协议"), "科技", "UDP代表用户数据报协议，一种无需建立连接即可发送数据的通信协议，优先考虑速度而非可靠性。"),
            es = LocalizedContent("¿Qué es el protocolo UDP?", listOf("Protocolo de Datagramas de Usuario", "Protocolo de Datos Universal", "Protocolo de Datos Unificado", "Protocolo de Datos Único"), "Tecnología", "UDP significa Protocolo de Datagramas de Usuario, un protocolo de comunicación que envía datos sin establecer una conexión previa, priorizando la velocidad sobre la fiabilidad.")
        ),
        BilingualQuestion(
            id = 11398, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année UDP a-t-il été créé?", listOf("1980", "1978", "1982", "1984"), "Technologie", "UDP (User Datagram Protocol) a été conçu par David P. Reed en 1980 et standardisé dans la RFC 768, afin de fournir un protocole de transport sans connexion pour Internet."),
            en = LocalizedContent("In what year was UDP created?", listOf("1980", "1978", "1982", "1984"), "Technology", "UDP (User Datagram Protocol) was designed by David P. Reed in 1980 and standardized in RFC 768, to provide a connectionless transport protocol for the Internet."),
            zh = LocalizedContent("UDP是哪一年创建的？", listOf("1980", "1978", "1982", "1984"), "科技", "UDP（用户数据报协议）由David P. Reed于1980年设计，并在RFC 768中标准化，为互联网提供无连接的传输协议。"),
            es = LocalizedContent("¿En qué año se creó UDP?", listOf("1980", "1978", "1982", "1984"), "Tecnología", "UDP (Protocolo de Datagramas de Usuario) fue diseñado por David P. Reed en 1980 y estandarizado en la RFC 768, para proporcionar un protocolo de transporte sin conexión para Internet.")
        ),
        BilingualQuestion(
            id = 11399, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le protocole TCP?", listOf("Transmission Control Protocol", "Transfer Control Protocol", "Transport Control Protocol", "Trusted Control Protocol"), "Technologie", "TCP signifie Transmission Control Protocol et est un protocole fondamental d'Internet, garantissant une transmission fiable et ordonnée des données entre les appareils."),
            en = LocalizedContent("What is the TCP protocol?", listOf("Transmission Control Protocol", "Transfer Control Protocol", "Transport Control Protocol", "Trusted Control Protocol"), "Technology", "TCP stands for Transmission Control Protocol and is a fundamental Internet protocol, ensuring reliable and ordered data transmission between devices."),
            zh = LocalizedContent("什么是TCP协议？", listOf("传输控制协议", "传送控制协议", "运输控制协议", "可信控制协议"), "科技", "TCP代表传输控制协议，是一种基本的互联网协议，确保设备之间可靠有序的数据传输。"),
            es = LocalizedContent("¿Qué es el protocolo TCP?", listOf("Protocolo de Control de Transmisión", "Protocolo de Control de Transferencia", "Protocolo de Control de Transporte", "Protocolo de Control Confiable"), "Tecnología", "TCP significa Protocolo de Control de Transmisión y es un protocolo fundamental de Internet, que garantiza una transmisión de datos fiable y ordenada entre dispositivos.")
        ),
        BilingualQuestion(
            id = 11400, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année TCP a-t-il été créé?", listOf("1974", "1972", "1976", "1978"), "Technologie", "TCP a été créé en 1974 par Vint Cerf et Bob Kahn, posant les bases du protocole qui deviendra plus tard TCP/IP, essentiel à Internet."),
            en = LocalizedContent("In what year was TCP created?", listOf("1974", "1972", "1976", "1978"), "Technology", "TCP was created in 1974 by Vint Cerf and Bob Kahn, laying the foundation for the protocol that later became TCP/IP, essential to the Internet."),
            zh = LocalizedContent("TCP 是在哪一年创建的？", listOf("1974", "1972", "1976", "1978"), "科技", "TCP 由 Vint Cerf 和 Bob Kahn 于 1974 年创建，为后来成为互联网核心的 TCP/IP 协议奠定了基础。"),
            es = LocalizedContent("¿En qué año se creó TCP?", listOf("1974", "1972", "1976", "1978"), "Tecnología", "TCP fue creado en 1974 por Vint Cerf y Bob Kahn, sentando las bases del protocolo que luego se convertiría en TCP/IP, esencial para Internet.")
        ),
        BilingualQuestion(
            id = 11401, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel était le nom du premier téléphone intelligent?", listOf("Simon", "iPhone", "Blackberry", "Windows Mobile"), "Technologie", "Le IBM Simon, lancé en 1994, est considéré comme le premier smartphone car il combinait téléphone mobile et fonctions d'assistant personnel tactile."),
            en = LocalizedContent("What was the name of the first smartphone?", listOf("Simon", "iPhone", "Blackberry", "Windows Mobile"), "Technology", "The IBM Simon, launched in 1994, is considered the first smartphone because it combined a mobile phone with touchscreen personal assistant functions."),
            zh = LocalizedContent("第一款智能手机叫什么名字？", listOf("Simon", "iPhone", "Blackberry", "Windows Mobile"), "科技", "1994 年推出的 IBM Simon 被认为是第一款智能手机，因为它将移动电话与触摸屏个人助理功能结合在一起。"),
            es = LocalizedContent("¿Cuál fue el nombre del primer teléfono inteligente?", listOf("Simon", "iPhone", "Blackberry", "Windows Mobile"), "Tecnología", "El IBM Simon, lanzado en 1994, es considerado el primer smartphone porque combinaba un teléfono móvil con funciones de asistente personal táctil.")
        ),
        BilingualQuestion(
            id = 11402, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année Simon a-t-il été lancé?", listOf("1994", "1992", "1996", "1998"), "Technologie", "Simon est un assistant vocal développé par Bell Labs, lancé en 1994, considéré comme le premier smartphone de l'histoire."),
            en = LocalizedContent("In what year was Simon launched?", listOf("1994", "1992", "1996", "1998"), "Technology", "Simon is a voice assistant developed by Bell Labs, launched in 1994, considered the first smartphone in history."),
            zh = LocalizedContent("Simon 是在哪一年推出的？", listOf("1994", "1992", "1996", "1998"), "科技", "Simon 是由贝尔实验室开发的语音助手，于 1994 年推出，被认为是历史上第一款智能手机。"),
            es = LocalizedContent("¿En qué año se lanzó Simon?", listOf("1994", "1992", "1996", "1998"), "Tecnología", "Simon es un asistente de voz desarrollado por Bell Labs, lanzado en 1994, considerado el primer smartphone de la historia.")
        ),
        BilingualQuestion(
            id = 11403, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a créé Simon?", listOf("IBM", "Apple", "Motorola", "Ericsson"), "Technologie", "Simon a été créé par IBM en 1975, initialement comme jeu électronique de mémoire visuelle."),
            en = LocalizedContent("Who created Simon?", listOf("IBM", "Apple", "Motorola", "Ericsson"), "Technology", "Simon was created by IBM in 1975, initially as an electronic visual memory game."),
            zh = LocalizedContent("谁创造了 Simon？", listOf("IBM", "Apple", "Motorola", "Ericsson"), "科技", "Simon 由 IBM 于 1975 年创建，最初是一款电子视觉记忆游戏。"),
            es = LocalizedContent("¿Quién creó Simon?", listOf("IBM", "Apple", "Motorola", "Ericsson"), "Tecnología", "Simon fue creado por IBM en 1975, inicialmente como un juego electrónico de memoria visual.")
        ),
        BilingualQuestion(
            id = 11404, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel était le Blackberry le plus populaire?", listOf("Bold", "Curve", "Storm", "Pearl"), "Technologie", "Le BlackBerry Bold, lancé en 2008, a été le modèle le plus vendu de la marque grâce à son clavier physique ergonomique et son écran haute résolution, devenant un symbole de la messagerie professionnelle."),
            en = LocalizedContent("What was the most popular Blackberry?", listOf("Bold", "Curve", "Storm", "Pearl"), "Technology", "The BlackBerry Bold, launched in 2008, was the best-selling model of the brand thanks to its ergonomic physical keyboard and high-resolution screen, becoming a symbol of professional messaging."),
            zh = LocalizedContent("最受欢迎的 Blackberry 是哪一款？", listOf("Bold", "Curve", "Storm", "Pearl"), "科技", "2008 年推出的 BlackBerry Bold 是该品牌最畅销的型号，凭借其符合人体工学的物理键盘和高分辨率屏幕，成为专业消息传递的象征。"),
            es = LocalizedContent("¿Cuál fue el Blackberry más popular?", listOf("Bold", "Curve", "Storm", "Pearl"), "Tecnología", "El BlackBerry Bold, lanzado en 2008, fue el modelo más vendido de la marca gracias a su teclado físico ergonómico y pantalla de alta resolución, convirtiéndose en un símbolo de la mensajería profesional.")
        ),
        BilingualQuestion(
            id = 11405, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année Blackberry Bold a-t-il été lancé?", listOf("2008", "2006", "2010", "2012"), "Technologie", "Le Blackberry Bold 9000 a été lancé en 2008, marquant une évolution majeure pour la marque avec un écran haute résolution et un clavier amélioré."),
            en = LocalizedContent("In what year was the Blackberry Bold launched?", listOf("2008", "2006", "2010", "2012"), "Technology", "The Blackberry Bold 9000 was launched in 2008, marking a major evolution for the brand with a high-resolution screen and improved keyboard."),
            zh = LocalizedContent("Blackberry Bold 是在哪一年推出的？", listOf("2008", "2006", "2010", "2012"), "科技", "Blackberry Bold 9000 于 2008 年推出，凭借高分辨率屏幕和改进的键盘，标志着该品牌的重大发展。"),
            es = LocalizedContent("¿En qué año se lanzó el Blackberry Bold?", listOf("2008", "2006", "2010", "2012"), "Tecnología", "El Blackberry Bold 9000 se lanzó en 2008, marcando una evolución importante para la marca con una pantalla de alta resolución y un teclado mejorado.")
        ),
        BilingualQuestion(
            id = 11406, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel était le premier Windows Phone?", listOf("HTC HD2", "Nokia Lumia", "Samsung Focus", "LG Optimus"), "Technologie", "Le HTC HD2, bien que lancé sous Windows Mobile 6.5, est souvent considéré comme le premier Windows Phone car il a été le premier appareil à pouvoir officiellement exécuter Windows Phone 7 après une mise à jour."),
            en = LocalizedContent("What was the first Windows Phone?", listOf("HTC HD2", "Nokia Lumia", "Samsung Focus", "LG Optimus"), "Technology", "The HTC HD2, although launched under Windows Mobile 6.5, is often considered the first Windows Phone because it was the first device to officially run Windows Phone 7 after an update."),
            zh = LocalizedContent("第一款 Windows Phone 是什么？", listOf("HTC HD2", "Nokia Lumia", "Samsung Focus", "LG Optimus"), "科技", "HTC HD2 虽然最初搭载 Windows Mobile 6.5，但通常被认为是第一款 Windows Phone，因为它是第一款通过更新正式运行 Windows Phone 7 的设备。"),
            es = LocalizedContent("¿Cuál fue el primer Windows Phone?", listOf("HTC HD2", "Nokia Lumia", "Samsung Focus", "LG Optimus"), "Tecnología", "El HTC HD2, aunque lanzado con Windows Mobile 6.5, a menudo se considera el primer Windows Phone porque fue el primer dispositivo en ejecutar oficialmente Windows Phone 7 después de una actualización.")
        ),
        BilingualQuestion(
            id = 11407, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année Windows Phone a-t-il été lancé?", listOf("2010", "2008", "2012", "2014"), "Technologie", "Windows Phone a été lancé en 2010 par Microsoft pour concurrencer iOS et Android, succédant à Windows Mobile."),
            en = LocalizedContent("In what year was Windows Phone launched?", listOf("2010", "2008", "2012", "2014"), "Technology", "Windows Phone was launched in 2010 by Microsoft to compete with iOS and Android, succeeding Windows Mobile."),
            zh = LocalizedContent("Windows Phone 是在哪一年推出的？", listOf("2010", "2008", "2012", "2014"), "科技", "Windows Phone 由微软于 2010 年推出，旨在与 iOS 和 Android 竞争，接替 Windows Mobile。"),
            es = LocalizedContent("¿En qué año se lanzó Windows Phone?", listOf("2010", "2008", "2012", "2014"), "Tecnología", "Windows Phone fue lanzado en 2010 por Microsoft para competir con iOS y Android, sucediendo a Windows Mobile.")
        ),
        BilingualQuestion(
            id = 11408, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le premier téléphone Android?", listOf("HTC Dream", "Motorola Droid", "Samsung Galaxy", "LG G1"), "Technologie", "Lancé en 2008, le HTC Dream (aussi appelé T-Mobile G1) fut le premier smartphone commercialisé avec le système d'exploitation Android."),
            en = LocalizedContent("What is the first Android phone?", listOf("HTC Dream", "Motorola Droid", "Samsung Galaxy", "LG G1"), "Technology", "Launched in 2008, the HTC Dream (also called T-Mobile G1) was the first commercial smartphone with the Android operating system."),
            zh = LocalizedContent("第一款安卓手机是什么？", listOf("HTC Dream", "Motorola Droid", "Samsung Galaxy", "LG G1"), "科技", "2008 年推出的 HTC Dream（也称为 T-Mobile G1）是第一款搭载安卓操作系统的商用智能手机。"),
            es = LocalizedContent("¿Cuál es el primer teléfono Android?", listOf("HTC Dream", "Motorola Droid", "Samsung Galaxy", "LG G1"), "Tecnología", "Lanzado en 2008, el HTC Dream (también llamado T-Mobile G1) fue el primer smartphone comercial con el sistema operativo Android.")
        ),
        BilingualQuestion(
            id = 11409, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année HTC Dream a-t-il été lancé?", listOf("2008", "2006", "2010", "2012"), "Technologie", "Le HTC Dream, premier smartphone fonctionnant sous Android, a été commercialisé en octobre 2008 aux États-Unis, marquant le début de l'ère Android."),
            en = LocalizedContent("In what year was the HTC Dream launched?", listOf("2008", "2006", "2010", "2012"), "Technology", "The HTC Dream, the first smartphone running Android, was commercialized in October 2008 in the United States, marking the beginning of the Android era."),
            zh = LocalizedContent("HTC Dream 是在哪一年推出的？", listOf("2008", "2006", "2010", "2012"), "科技", "HTC Dream 是第一款运行安卓系统的智能手机，于 2008 年 10 月在美国上市，标志着安卓时代的开始。"),
            es = LocalizedContent("¿En qué año se lanzó el HTC Dream?", listOf("2008", "2006", "2010", "2012"), "Tecnología", "El HTC Dream, el primer smartphone con Android, se comercializó en octubre de 2008 en Estados Unidos, marcando el inicio de la era Android.")
        ),
    )

    private fun part7(): List<BilingualQuestion> = listOf(
        BilingualQuestion(
            id = 11410, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le premier téléphone iOS?", listOf("iPhone", "iPhone 3G", "iPhone 4", "iPhone 5"), "Technologie", "Lancé en 2007 par Apple, l'iPhone a été le premier appareil à utiliser le système d'exploitation iOS, alors appelé iPhone OS."),
            en = LocalizedContent("What was the first iOS phone?", listOf("iPhone", "iPhone 3G", "iPhone 4", "iPhone 5"), "Technology", "Launched in 2007 by Apple, the iPhone was the first device to use the iOS operating system, then called iPhone OS."),
            zh = LocalizedContent("第一款iOS手机是什么？", listOf("iPhone", "iPhone 3G", "iPhone 4", "iPhone 5"), "科技", "2007年由苹果公司推出，iPhone是第一款使用iOS操作系统（当时称为iPhone OS）的设备。"),
            es = LocalizedContent("¿Cuál fue el primer teléfono iOS?", listOf("iPhone", "iPhone 3G", "iPhone 4", "iPhone 5"), "Tecnología", "Lanzado en 2007 por Apple, el iPhone fue el primer dispositivo en usar el sistema operativo iOS, entonces llamado iPhone OS.")
        ),
        BilingualQuestion(
            id = 11411, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("En quelle année le premier iPhone a-t-il été lancé?", listOf("2007", "2005", "2009", "2011"), "Technologie", "Le premier iPhone a été présenté par Steve Jobs le 9 janvier 2007 et mis en vente le 29 juin 2007 aux États-Unis."),
            en = LocalizedContent("In what year was the first iPhone launched?", listOf("2007", "2005", "2009", "2011"), "Technology", "The first iPhone was introduced by Steve Jobs on January 9, 2007 and went on sale on June 29, 2007 in the United States."),
            zh = LocalizedContent("第一款iPhone是在哪一年推出的？", listOf("2007", "2005", "2009", "2011"), "科技", "第一款iPhone由史蒂夫·乔布斯于2007年1月9日发布，并于2007年6月29日在美国上市。"),
            es = LocalizedContent("¿En qué año se lanzó el primer iPhone?", listOf("2007", "2005", "2009", "2011"), "Tecnología", "El primer iPhone fue presentado por Steve Jobs el 9 de enero de 2007 y salió a la venta el 29 de junio de 2007 en Estados Unidos.")
        ),
        BilingualQuestion(
            id = 11412, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le téléphone le plus vendu au monde?", listOf("iPhone", "Samsung Galaxy", "Xiaomi Redmi", "Oppo A Series"), "Technologie", "L'iPhone est le téléphone le plus vendu au monde en termes de chiffre d'affaires et de modèle unique, bien que Samsung domine en volume total d'appareils vendus."),
            en = LocalizedContent("What is the best-selling phone in the world?", listOf("iPhone", "Samsung Galaxy", "Xiaomi Redmi", "Oppo A Series"), "Technology", "The iPhone is the best-selling phone in the world in terms of revenue and single model, although Samsung dominates in total volume of devices sold."),
            zh = LocalizedContent("全球最畅销的手机是什么？", listOf("iPhone", "Samsung Galaxy", "Xiaomi Redmi", "Oppo A Series"), "科技", "iPhone在收入和单一型号销量方面是全球最畅销的手机，尽管三星在总销量上占主导地位。"),
            es = LocalizedContent("¿Cuál es el teléfono más vendido del mundo?", listOf("iPhone", "Samsung Galaxy", "Xiaomi Redmi", "Oppo A Series"), "Tecnología", "El iPhone es el teléfono más vendido del mundo en términos de ingresos y modelo único, aunque Samsung domina en volumen total de dispositivos vendidos.")
        ),
        BilingualQuestion(
            id = 11413, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année Samsung Galaxy S a-t-il été lancé?", listOf("2010", "2008", "2012", "2014"), "Technologie", "Le premier Samsung Galaxy S a été dévoilé en mars 2010 et commercialisé en juin de la même année. Il a marqué le début de la gamme phare Android de Samsung."),
            en = LocalizedContent("In what year was the Samsung Galaxy S launched?", listOf("2010", "2008", "2012", "2014"), "Technology", "The first Samsung Galaxy S was unveiled in March 2010 and went on sale in June of the same year. It marked the beginning of Samsung's flagship Android line."),
            zh = LocalizedContent("三星Galaxy S是在哪一年推出的？", listOf("2010", "2008", "2012", "2014"), "科技", "第一款三星Galaxy S于2010年3月发布，同年6月上市。它标志着三星旗舰Android系列的开端。"),
            es = LocalizedContent("¿En qué año se lanzó el Samsung Galaxy S?", listOf("2010", "2008", "2012", "2014"), "Tecnología", "El primer Samsung Galaxy S se presentó en marzo de 2010 y salió a la venta en junio del mismo año. Marcó el inicio de la línea insignia Android de Samsung.")
        ),
        BilingualQuestion(
            id = 11414, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le téléphone pliable le plus populaire?", listOf("Samsung Galaxy Z Fold", "Motorola Razr", "Xiaomi Mi Mix Fold", "Oppo Find N"), "Technologie", "Le Samsung Galaxy Z Fold domine le marché des téléphones pliables depuis son lancement en 2019, avec des ventes représentant plus de la moitié du segment grâce à son écran large et son design mature."),
            en = LocalizedContent("What is the most popular foldable phone?", listOf("Samsung Galaxy Z Fold", "Motorola Razr", "Xiaomi Mi Mix Fold", "Oppo Find N"), "Technology", "The Samsung Galaxy Z Fold has dominated the foldable phone market since its launch in 2019, with sales representing more than half of the segment thanks to its large screen and mature design."),
            zh = LocalizedContent("最受欢迎的折叠屏手机是什么？", listOf("Samsung Galaxy Z Fold", "Motorola Razr", "Xiaomi Mi Mix Fold", "Oppo Find N"), "科技", "三星Galaxy Z Fold自2019年推出以来一直主导折叠屏手机市场，其销量占该细分市场的一半以上，这得益于其大屏幕和成熟的设计。"),
            es = LocalizedContent("¿Cuál es el teléfono plegable más popular?", listOf("Samsung Galaxy Z Fold", "Motorola Razr", "Xiaomi Mi Mix Fold", "Oppo Find N"), "Tecnología", "El Samsung Galaxy Z Fold ha dominado el mercado de teléfonos plegables desde su lanzamiento en 2019, con ventas que representan más de la mitad del segmento gracias a su pantalla grande y diseño maduro.")
        ),
        BilingualQuestion(
            id = 11415, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année Samsung Galaxy Z Fold a-t-il été lancé?", listOf("2020", "2018", "2022", "2024"), "Technologie", "Le Samsung Galaxy Z Fold, premier smartphone pliable de la marque, a été commercialisé en septembre 2020 après des années de développement."),
            en = LocalizedContent("In what year was the Samsung Galaxy Z Fold launched?", listOf("2020", "2018", "2022", "2024"), "Technology", "The Samsung Galaxy Z Fold, the brand's first foldable smartphone, was commercialized in September 2020 after years of development."),
            zh = LocalizedContent("三星Galaxy Z Fold是在哪一年推出的？", listOf("2020", "2018", "2022", "2024"), "科技", "三星Galaxy Z Fold是该品牌首款折叠屏智能手机，经过多年研发后于2020年9月上市。"),
            es = LocalizedContent("¿En qué año se lanzó el Samsung Galaxy Z Fold?", listOf("2020", "2018", "2022", "2024"), "Tecnología", "El Samsung Galaxy Z Fold, el primer teléfono inteligente plegable de la marca, se comercializó en septiembre de 2020 después de años de desarrollo.")
        ),
        BilingualQuestion(
            id = 11416, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le constructeur de téléphones le plus ancien?", listOf("Nokia", "Motorola", "Samsung", "LG"), "Technologie", "Nokia a été fondée en 1865, bien avant l'ère des téléphones mobiles, et a produit son premier téléphone portable en 1982, ce qui en fait le plus ancien constructeur de téléphones encore en activité."),
            en = LocalizedContent("What is the oldest phone manufacturer?", listOf("Nokia", "Motorola", "Samsung", "LG"), "Technology", "Nokia was founded in 1865, long before the era of mobile phones, and produced its first mobile phone in 1982, making it the oldest phone manufacturer still in operation."),
            zh = LocalizedContent("最古老的手机制造商是哪家？", listOf("Nokia", "Motorola", "Samsung", "LG"), "科技", "诺基亚成立于1865年，远在手机时代之前，并于1982年生产了其第一部手机，使其成为仍在运营的最古老的手机制造商。"),
            es = LocalizedContent("¿Cuál es el fabricante de teléfonos más antiguo?", listOf("Nokia", "Motorola", "Samsung", "LG"), "Tecnología", "Nokia fue fundada en 1865, mucho antes de la era de los teléfonos móviles, y produjo su primer teléfono móvil en 1982, lo que la convierte en el fabricante de teléfonos más antiguo aún en funcionamiento.")
        ),
        BilingualQuestion(
            id = 11417, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année Nokia a-t-il été créé?", listOf("1865", "1863", "1867", "1869"), "Technologie", "Nokia a été fondé en 1865 comme une usine de pâte à papier en Finlande, bien avant de devenir un géant des télécommunications."),
            en = LocalizedContent("In what year was Nokia founded?", listOf("1865", "1863", "1867", "1869"), "Technology", "Nokia was founded in 1865 as a pulp mill in Finland, long before becoming a telecommunications giant."),
            zh = LocalizedContent("诺基亚是在哪一年成立的？", listOf("1865", "1863", "1867", "1869"), "科技", "诺基亚成立于1865年，最初是芬兰的一家纸浆厂，远在成为电信巨头之前。"),
            es = LocalizedContent("¿En qué año se fundó Nokia?", listOf("1865", "1863", "1867", "1869"), "Tecnología", "Nokia fue fundada en 1865 como una fábrica de pasta de papel en Finlandia, mucho antes de convertirse en un gigante de las telecomunicaciones.")
        ),
        BilingualQuestion(
            id = 11418, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand constructeur de téléphones?", listOf("Apple", "Samsung", "Xiaomi", "Oppo"), "Technologie", "Apple est régulièrement en tête du marché des smartphones en valeur et en bénéfices, bien que Samsung le dépasse souvent en volume de ventes."),
            en = LocalizedContent("What is the largest phone manufacturer?", listOf("Apple", "Samsung", "Xiaomi", "Oppo"), "Technology", "Apple regularly leads the smartphone market in value and profits, although Samsung often surpasses it in sales volume."),
            zh = LocalizedContent("最大的手机制造商是哪家？", listOf("Apple", "Samsung", "Xiaomi", "Oppo"), "科技", "苹果在价值和利润方面经常领先智能手机市场，尽管三星在销量上常常超过它。"),
            es = LocalizedContent("¿Cuál es el mayor fabricante de teléfonos?", listOf("Apple", "Samsung", "Xiaomi", "Oppo"), "Tecnología", "Apple lidera regularmente el mercado de teléfonos inteligentes en valor y beneficios, aunque Samsung a menudo lo supera en volumen de ventas.")
        ),
        BilingualQuestion(
            id = 11419, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année Xiaomi a-t-il été créé?", listOf("2010", "2008", "2012", "2014"), "Technologie", "Xiaomi a été fondé en 2010 par Lei Jun, lançant son premier smartphone en 2011."),
            en = LocalizedContent("In what year was Xiaomi founded?", listOf("2010", "2008", "2012", "2014"), "Technology", "Xiaomi was founded in 2010 by Lei Jun, launching its first smartphone in 2011."),
            zh = LocalizedContent("小米是在哪一年成立的？", listOf("2010", "2008", "2012", "2014"), "科技", "小米由雷军于2010年创立，并于2011年推出其第一款智能手机。"),
            es = LocalizedContent("¿En qué año se fundó Xiaomi?", listOf("2010", "2008", "2012", "2014"), "Tecnología", "Xiaomi fue fundada en 2010 por Lei Jun, lanzando su primer teléfono inteligente en 2011.")
        ),
        BilingualQuestion(
            id = 11420, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a créé Xiaomi?", listOf("Lei Jun", "Jack Ma", "Pony Ma", "Robin Li"), "Technologie", "Lei Jun a fondé Xiaomi en 2010 avec plusieurs cofondateurs, dont Lin Bin. Il est l'actuel PDG et la figure emblématique de l'entreprise."),
            en = LocalizedContent("Who created Xiaomi?", listOf("Lei Jun", "Jack Ma", "Pony Ma", "Robin Li"), "Technology", "Lei Jun founded Xiaomi in 2010 with several co-founders, including Lin Bin. He is the current CEO and the iconic figure of the company."),
            zh = LocalizedContent("谁创立了小米？", listOf("雷军", "马云", "马化腾", "李彦宏"), "科技", "雷军于2010年与包括林斌在内的多位联合创始人共同创立了小米。他是现任CEO，也是公司的标志性人物。"),
            es = LocalizedContent("¿Quién creó Xiaomi?", listOf("Lei Jun", "Jack Ma", "Pony Ma", "Robin Li"), "Tecnología", "Lei Jun fundó Xiaomi en 2010 con varios cofundadores, incluido Lin Bin. Es el actual CEO y la figura emblemática de la empresa.")
        ),
        BilingualQuestion(
            id = 11421, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année Oppo a-t-il été créé?", listOf("2004", "2002", "2006", "2008"), "Technologie", "Oppo a été fondée en 2004 par Tony Chen en Chine, initialement comme fabricant de lecteurs MP3 avant de se diversifier dans les smartphones."),
            en = LocalizedContent("In what year was Oppo created?", listOf("2004", "2002", "2006", "2008"), "Technology", "Oppo was founded in 2004 by Tony Chen in China, initially as a manufacturer of MP3 players before diversifying into smartphones."),
            zh = LocalizedContent("Oppo成立于哪一年？", listOf("2004", "2002", "2006", "2008"), "科技", "Oppo由陈明永于2004年在中国创立，最初是MP3播放器制造商，后来扩展到智能手机领域。"),
            es = LocalizedContent("¿En qué año se creó Oppo?", listOf("2004", "2002", "2006", "2008"), "Tecnología", "Oppo fue fundada en 2004 por Tony Chen en China, inicialmente como fabricante de reproductores MP3 antes de diversificarse en teléfonos inteligentes.")
        ),
        BilingualQuestion(
            id = 11422, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a créé Oppo?", listOf("Chen Mingyong", "Lei Jun", "Jack Ma", "Pony Ma"), "Technologie", "Chen Mingyong a fondé Oppo en 2001, initialement comme une marque de lecteurs MP3, avant de se lancer dans les smartphones."),
            en = LocalizedContent("Who created Oppo?", listOf("Chen Mingyong", "Lei Jun", "Jack Ma", "Pony Ma"), "Technology", "Chen Mingyong founded Oppo in 2001, initially as a brand of MP3 players, before entering the smartphone market."),
            zh = LocalizedContent("谁创立了Oppo？", listOf("陈明永", "雷军", "马云", "马化腾"), "科技", "陈明永于2001年创立了Oppo，最初是一个MP3播放器品牌，后来进入智能手机市场。"),
            es = LocalizedContent("¿Quién creó Oppo?", listOf("Chen Mingyong", "Lei Jun", "Jack Ma", "Pony Ma"), "Tecnología", "Chen Mingyong fundó Oppo en 2001, inicialmente como una marca de reproductores MP3, antes de incursionar en los teléfonos inteligentes.")
        ),
        BilingualQuestion(
            id = 11423, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année Vivo a-t-il été créé?", listOf("2009", "2007", "2011", "2013"), "Technologie", "Vivo a été fondé en 2009 à Dongguan, en Chine, en tant que filiale de BBK Electronics, spécialisée dans les smartphones."),
            en = LocalizedContent("In what year was Vivo created?", listOf("2009", "2007", "2011", "2013"), "Technology", "Vivo was founded in 2009 in Dongguan, China, as a subsidiary of BBK Electronics, specializing in smartphones."),
            zh = LocalizedContent("Vivo成立于哪一年？", listOf("2009", "2007", "2011", "2013"), "科技", "Vivo于2009年在中国东莞成立，是BBK电子的子公司，专注于智能手机。"),
            es = LocalizedContent("¿En qué año se creó Vivo?", listOf("2009", "2007", "2011", "2013"), "Tecnología", "Vivo fue fundada en 2009 en Dongguan, China, como una subsidiaria de BBK Electronics, especializada en teléfonos inteligentes.")
        ),
        BilingualQuestion(
            id = 11424, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a créé Vivo?", listOf("Shen Wei", "Lei Jun", "Jack Ma", "Pony Ma"), "Technologie", "Shen Wei a fondé Vivo en 2009 à Dongguan, en Chine, après avoir dirigé la société BBK Electronics."),
            en = LocalizedContent("Who created Vivo?", listOf("Shen Wei", "Lei Jun", "Jack Ma", "Pony Ma"), "Technology", "Shen Wei founded Vivo in 2009 in Dongguan, China, after leading BBK Electronics."),
            zh = LocalizedContent("谁创立了Vivo？", listOf("沈炜", "雷军", "马云", "马化腾"), "科技", "沈炜在领导BBK电子后，于2009年在中国东莞创立了Vivo。"),
            es = LocalizedContent("¿Quién creó Vivo?", listOf("Shen Wei", "Lei Jun", "Jack Ma", "Pony Ma"), "Tecnología", "Shen Wei fundó Vivo en 2009 en Dongguan, China, después de dirigir BBK Electronics.")
        ),
        BilingualQuestion(
            id = 11425, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année OnePlus a-t-il été créé?", listOf("2013", "2011", "2015", "2017"), "Technologie", "OnePlus a été fondé en décembre 2013 par Pete Lau et Carl Pei, avec l'objectif de créer un smartphone haut de gamme à prix compétitif."),
            en = LocalizedContent("In what year was OnePlus created?", listOf("2013", "2011", "2015", "2017"), "Technology", "OnePlus was founded in December 2013 by Pete Lau and Carl Pei, with the goal of creating a high-end smartphone at a competitive price."),
            zh = LocalizedContent("OnePlus成立于哪一年？", listOf("2013", "2011", "2015", "2017"), "科技", "OnePlus由刘作虎和裴宇于2013年12月创立，旨在打造一款价格有竞争力的高端智能手机。"),
            es = LocalizedContent("¿En qué año se creó OnePlus?", listOf("2013", "2011", "2015", "2017"), "Tecnología", "OnePlus fue fundada en diciembre de 2013 por Pete Lau y Carl Pei, con el objetivo de crear un teléfono inteligente de alta gama a un precio competitivo.")
        ),
        BilingualQuestion(
            id = 11426, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a créé OnePlus?", listOf("Pete Lau", "Lei Jun", "Jack Ma", "Pony Ma"), "Technologie", "Pete Lau, ancien vice-président d'Oppo, a cofondé OnePlus en 2013 pour lancer des smartphones haut de gamme à prix compétitif."),
            en = LocalizedContent("Who created OnePlus?", listOf("Pete Lau", "Lei Jun", "Jack Ma", "Pony Ma"), "Technology", "Pete Lau, former vice president of Oppo, co-founded OnePlus in 2013 to launch high-end smartphones at competitive prices."),
            zh = LocalizedContent("谁创立了OnePlus？", listOf("刘作虎", "雷军", "马云", "马化腾"), "科技", "刘作虎，前Oppo副总裁，于2013年共同创立了OnePlus，旨在推出价格有竞争力的高端智能手机。"),
            es = LocalizedContent("¿Quién creó OnePlus?", listOf("Pete Lau", "Lei Jun", "Jack Ma", "Pony Ma"), "Tecnología", "Pete Lau, exvicepresidente de Oppo, cofundó OnePlus en 2013 para lanzar teléfonos inteligentes de alta gama a precios competitivos.")
        ),
        BilingualQuestion(
            id = 11427, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année Realme a-t-il été créé?", listOf("2018", "2016", "2020", "2022"), "Technologie", "Realme a été fondée en 2018 en tant que sous-marque d'Oppo, avant de devenir une marque indépendante en 2019."),
            en = LocalizedContent("In what year was Realme created?", listOf("2018", "2016", "2020", "2022"), "Technology", "Realme was founded in 2018 as a sub-brand of Oppo, before becoming an independent brand in 2019."),
            zh = LocalizedContent("Realme成立于哪一年？", listOf("2018", "2016", "2020", "2022"), "科技", "Realme于2018年作为Oppo的子品牌成立，随后在2019年成为独立品牌。"),
            es = LocalizedContent("¿En qué año se creó Realme?", listOf("2018", "2016", "2020", "2022"), "Tecnología", "Realme fue fundada en 2018 como una submarca de Oppo, antes de convertirse en una marca independiente en 2019.")
        ),
        BilingualQuestion(
            id = 11428, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a créé Realme?", listOf("Madhav Sheth", "Lei Jun", "Jack Ma", "Pony Ma"), "Technologie", "Madhav Sheth est le fondateur de Realme, une marque de smartphones lancée en 2018 en tant que filiale d'OPPO, avant de devenir indépendante."),
            en = LocalizedContent("Who created Realme?", listOf("Madhav Sheth", "Lei Jun", "Jack Ma", "Pony Ma"), "Technology", "Madhav Sheth is the founder of Realme, a smartphone brand launched in 2018 as a subsidiary of OPPO, before becoming independent."),
            zh = LocalizedContent("谁创立了Realme？", listOf("Madhav Sheth", "雷军", "马云", "马化腾"), "科技", "Madhav Sheth是Realme的创始人，该品牌于2018年作为OPPO的子公司推出，后来独立。"),
            es = LocalizedContent("¿Quién creó Realme?", listOf("Madhav Sheth", "Lei Jun", "Jack Ma", "Pony Ma"), "Tecnología", "Madhav Sheth es el fundador de Realme, una marca de teléfonos inteligentes lanzada en 2018 como subsidiaria de OPPO, antes de independizarse.")
        ),
        BilingualQuestion(
            id = 11429, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année Huawei a-t-il été créé?", listOf("1987", "1985", "1989", "1991"), "Technologie", "Huawei a été fondé en 1987 à Shenzhen, en Chine, par Ren Zhengfei, un ancien ingénieur de l'Armée populaire de libération."),
            en = LocalizedContent("In what year was Huawei created?", listOf("1987", "1985", "1989", "1991"), "Technology", "Huawei was founded in 1987 in Shenzhen, China, by Ren Zhengfei, a former engineer of the People's Liberation Army."),
            zh = LocalizedContent("华为成立于哪一年？", listOf("1987", "1985", "1989", "1991"), "科技", "华为由任正非于1987年在中国深圳创立，他是一名前中国人民解放军工程师。"),
            es = LocalizedContent("¿En qué año se creó Huawei?", listOf("1987", "1985", "1989", "1991"), "Tecnología", "Huawei fue fundada en 1987 en Shenzhen, China, por Ren Zhengfei, un exingeniero del Ejército Popular de Liberación.")
        ),
    )
}
