package com.prometheus.clq.data

import com.prometheus.clq.model.BilingualQuestion
import com.prometheus.clq.model.Difficulty
import com.prometheus.clq.model.Language
import com.prometheus.clq.model.LocalizedContent
import com.prometheus.clq.model.Question

/** Auto-generated batch 7 : 500 questions bilingues */
object QuestionsBilingualGenerated_7 {
    fun get(lang: Language = Language.FR): List<Question> = list.map { it.toQuestion(lang) }

    val list: List<BilingualQuestion> by lazy {
        part1() + part2() + part3() + part4() + part5() + part6() + part7()
    }

    private fun part1(): List<BilingualQuestion> = listOf(
        BilingualQuestion(
            id = 9430, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("En quelle année l'OTAN a-t-elle été créée?", listOf("1947", "1948", "1949", "1950"), "Histoire", "L'OTAN a été créée en 1949 par le traité de Washington pour assurer la défense collective des pays occidentaux face à l'Union soviétique durant la guerre froide."),
            en = LocalizedContent("In what year was NATO created?", listOf("1947", "1948", "1949", "1950"), "History", "NATO was created in 1949 by the Washington Treaty to ensure the collective defense of Western countries against the Soviet Union during the Cold War."),
            zh = LocalizedContent("北约是哪一年成立的？", listOf("1947", "1948", "1949", "1950"), "历史", "北约于1949年根据《华盛顿条约》成立，旨在冷战期间确保西方国家对抗苏联的集体防御。"),
            es = LocalizedContent("¿En qué año se creó la OTAN?", listOf("1947", "1948", "1949", "1950"), "Historia", "La OTAN se creó en 1949 mediante el Tratado de Washington para garantizar la defensa colectiva de los países occidentales frente a la Unión Soviética durante la Guerra Fría.")
        ),
        BilingualQuestion(
            id = 9431, correctIndex = 3, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel était l'objectif de l'OTAN?", listOf("Défense collective contre l'URSS", "Établir la stabilité en Europe", "Promouvoir la démocratie", "Tous les trois"), "Histoire", "L'OTAN a été créée en 1949 pour assurer la défense collective de ses membres, mais ses objectifs incluent aussi la promotion de la démocratie et la gestion de crises. Les trois réponses proposées (défense collective, valeurs démocratiques, gestion de crises) sont donc correctes."),
            en = LocalizedContent("What was the objective of NATO?", listOf("Collective defense against the USSR", "Establish stability in Europe", "Promote democracy", "All three"), "History", "NATO was created in 1949 to ensure the collective defense of its members, but its objectives also include promoting democracy and crisis management. All three proposed answers (collective defense, democratic values, crisis management) are therefore correct."),
            zh = LocalizedContent("北约的目标是什么？", listOf("集体防御苏联", "建立欧洲稳定", "促进民主", "以上所有"), "历史", "北约成立于1949年，旨在确保其成员国的集体防御，但其目标还包括促进民主和危机管理。因此，三个提议的答案（集体防御、民主价值观、危机管理）都是正确的。"),
            es = LocalizedContent("¿Cuál era el objetivo de la OTAN?", listOf("Defensa colectiva contra la URSS", "Establecer estabilidad en Europa", "Promover la democracia", "Los tres"), "Historia", "La OTAN se creó en 1949 para garantizar la defensa colectiva de sus miembros, pero sus objetivos también incluyen la promoción de la democracia y la gestión de crisis. Por lo tanto, las tres respuestas propuestas (defensa colectiva, valores democráticos, gestión de crisis) son correctas.")
        ),
        BilingualQuestion(
            id = 9432, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année la Corée a-t-elle été divisée?", listOf("1943", "1945", "1948", "1950"), "Histoire", "La division de la Corée en deux zones d'occupation, au nord par l'URSS et au sud par les États-Unis, a été décidée à la fin de la Seconde Guerre mondiale en 1945."),
            en = LocalizedContent("In what year was Korea divided?", listOf("1943", "1945", "1948", "1950"), "History", "The division of Korea into two occupation zones, north by the USSR and south by the United States, was decided at the end of World War II in 1945."),
            zh = LocalizedContent("朝鲜是哪一年分裂的？", listOf("1943", "1945", "1948", "1950"), "历史", "朝鲜半岛在1945年二战结束时被划分为两个占领区，北部由苏联占领，南部由美国占领。"),
            es = LocalizedContent("¿En qué año se dividió Corea?", listOf("1943", "1945", "1948", "1950"), "Historia", "La división de Corea en dos zonas de ocupación, al norte por la URSS y al sur por Estados Unidos, se decidió al final de la Segunda Guerra Mundial en 1945.")
        ),
        BilingualQuestion(
            id = 9433, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année la Corée du Nord a-t-elle envahi la Corée du Sud?", listOf("1948", "1950", "1952", "1953"), "Histoire", "L'invasion nord-coréenne de la Corée du Sud a débuté le 25 juin 1950, déclenchant la guerre de Corée qui a duré jusqu'en 1953."),
            en = LocalizedContent("In what year did North Korea invade South Korea?", listOf("1948", "1950", "1952", "1953"), "History", "The North Korean invasion of South Korea began on June 25, 1950, triggering the Korean War which lasted until 1953."),
            zh = LocalizedContent("朝鲜在哪一年入侵韩国？", listOf("1948", "1950", "1952", "1953"), "历史", "朝鲜于1950年6月25日入侵韩国，引发了持续到1953年的朝鲜战争。"),
            es = LocalizedContent("¿En qué año Corea del Norte invadió Corea del Sur?", listOf("1948", "1950", "1952", "1953"), "Historia", "La invasión norcoreana de Corea del Sur comenzó el 25 de junio de 1950, desencadenando la Guerra de Corea que duró hasta 1953.")
        ),
        BilingualQuestion(
            id = 9434, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année la Guerre de Corée s'est-elle terminée?", listOf("1951", "1952", "1953", "1954"), "Histoire", "L'armistice de Panmunjeom, signé le 27 juillet 1953, a mis fin aux combats de la Guerre de Corée, bien qu'aucun traité de paix n'ait été conclu."),
            en = LocalizedContent("In what year did the Korean War end?", listOf("1951", "1952", "1953", "1954"), "History", "The Panmunjom Armistice, signed on July 27, 1953, ended the fighting of the Korean War, although no peace treaty was concluded."),
            zh = LocalizedContent("朝鲜战争在哪一年结束？", listOf("1951", "1952", "1953", "1954"), "历史", "1953年7月27日签署的《板门店停战协定》结束了朝鲜战争的战斗，但并未缔结和平条约。"),
            es = LocalizedContent("¿En qué año terminó la Guerra de Corea?", listOf("1951", "1952", "1953", "1954"), "Historia", "El Armisticio de Panmunjom, firmado el 27 de julio de 1953, puso fin a los combates de la Guerra de Corea, aunque no se concluyó ningún tratado de paz.")
        ),
        BilingualQuestion(
            id = 9435, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a commandé les forces des Nations unies en Corée?", listOf("Eisenhower", "Douglas MacArthur", "Matthew Ridgway", "Van Fleet"), "Histoire", "MacArthur fut nommé commandant en chef des forces de l'ONU en 1950, lors de la guerre de Corée, après l'invasion nord-coréenne du Sud."),
            en = LocalizedContent("Who commanded the United Nations forces in Korea?", listOf("Eisenhower", "Douglas MacArthur", "Matthew Ridgway", "Van Fleet"), "History", "MacArthur was appointed commander-in-chief of UN forces in 1950, during the Korean War, after the North Korean invasion of the South."),
            zh = LocalizedContent("谁指挥了朝鲜的联合国军？", listOf("艾森豪威尔", "道格拉斯·麦克阿瑟", "马修·李奇微", "范·弗利特"), "历史", "麦克阿瑟于1950年朝鲜战争期间被任命为联合国军总司令，此前朝鲜入侵了韩国。"),
            es = LocalizedContent("¿Quién comandó las fuerzas de las Naciones Unidas en Corea?", listOf("Eisenhower", "Douglas MacArthur", "Matthew Ridgway", "Van Fleet"), "Historia", "MacArthur fue nombrado comandante en jefe de las fuerzas de la ONU en 1950, durante la Guerra de Corea, tras la invasión norcoreana del Sur.")
        ),
        BilingualQuestion(
            id = 9436, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel traité a mis fin à la Guerre de Corée?", listOf("Armistice de Panmunjom", "Traité de Séoul", "Traité de Pusan", "Traité de Kaesong"), "Histoire", "Signé en 1953, l'armistice de Panmunjom a établi un cessez-le-feu sans traité de paix officiel, laissant la péninsule coréenne techniquement en guerre."),
            en = LocalizedContent("What treaty ended the Korean War?", listOf("Armistice of Panmunjom", "Treaty of Seoul", "Treaty of Busan", "Treaty of Kaesong"), "History", "Signed in 1953, the Panmunjom Armistice established a ceasefire without a formal peace treaty, leaving the Korean peninsula technically still at war."),
            zh = LocalizedContent("哪个条约结束了朝鲜战争？", listOf("板门店停战协定", "首尔条约", "釜山条约", "开城条约"), "历史", "1953年签署的《板门店停战协定》建立了停火，但没有正式和平条约，使朝鲜半岛在技术上仍处于战争状态。"),
            es = LocalizedContent("¿Qué tratado puso fin a la Guerra de Corea?", listOf("Armisticio de Panmunjom", "Tratado de Seúl", "Tratado de Busan", "Tratado de Kaesong"), "Historia", "Firmado en 1953, el Armisticio de Panmunjom estableció un alto el fuego sin un tratado de paz formal, dejando la península de Corea técnicamente en guerra.")
        ),
        BilingualQuestion(
            id = 9437, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année le Pacte de Varsovie a-t-il été créé?", listOf("1953", "1954", "1955", "1956"), "Histoire", "Le Pacte de Varsovie fut signé le 14 mai 1955 par l'Union soviétique et sept pays satellites d'Europe de l'Est, en réponse à l'intégration de l'Allemagne de l'Ouest dans l'OTAN."),
            en = LocalizedContent("In what year was the Warsaw Pact created?", listOf("1953", "1954", "1955", "1956"), "History", "The Warsaw Pact was signed on May 14, 1955 by the Soviet Union and seven Eastern European satellite states, in response to the integration of West Germany into NATO."),
            zh = LocalizedContent("华沙条约是哪一年成立的？", listOf("1953", "1954", "1955", "1956"), "历史", "华沙条约于1955年5月14日由苏联和七个东欧卫星国签署，以回应西德加入北约。"),
            es = LocalizedContent("¿En qué año se creó el Pacto de Varsovia?", listOf("1953", "1954", "1955", "1956"), "Historia", "El Pacto de Varsovia fue firmado el 14 de mayo de 1955 por la Unión Soviética y siete estados satélite de Europa del Este, en respuesta a la integración de Alemania Occidental en la OTAN.")
        ),
        BilingualQuestion(
            id = 9438, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel était l'objectif du Pacte de Varsovie?", listOf("Alliance militaire soviétique", "Contrer l'OTAN", "Établir la domination soviétique", "Tous les trois"), "Histoire", "Le Pacte de Varsovie, créé en 1955, visait à coordonner les défenses des pays du bloc de l'Est contre l'OTAN, à maintenir l'unité communiste et à justifier l'intervention soviétique en cas de menace."),
            en = LocalizedContent("What was the objective of the Warsaw Pact?", listOf("Soviet military alliance", "Counter NATO", "Establish Soviet dominance", "All three"), "History", "The Warsaw Pact, created in 1955, aimed to coordinate the defenses of Eastern Bloc countries against NATO, maintain communist unity, and justify Soviet intervention if threatened."),
            zh = LocalizedContent("华沙条约的目标是什么？", listOf("苏联军事联盟", "对抗北约", "建立苏联主导地位", "以上所有"), "历史", "华沙条约成立于1955年，旨在协调东方集团国家对抗北约的防御，维护共产主义团结，并在受到威胁时为苏联干预提供理由。"),
            es = LocalizedContent("¿Cuál era el objetivo del Pacto de Varsovia?", listOf("Alianza militar soviética", "Contrarrestar la OTAN", "Establecer el dominio soviético", "Los tres"), "Historia", "El Pacto de Varsovia, creado en 1955, tenía como objetivo coordinar las defensas de los países del bloque del Este contra la OTAN, mantener la unidad comunista y justificar la intervención soviética en caso de amenaza.")
        ),
        BilingualQuestion(
            id = 9439, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année la Crise de Suez a-t-elle eu lieu?", listOf("1954", "1955", "1956", "1957"), "Histoire", "La Crise de Suez a éclaté en 1956 après la nationalisation du canal de Suez par l'Égypte de Nasser, provoquant une intervention militaire de la France, du Royaume-Uni et d'Israël."),
            en = LocalizedContent("In what year did the Suez Crisis take place?", listOf("1954", "1955", "1956", "1957"), "History", "The Suez Crisis erupted in 1956 after the nationalization of the Suez Canal by Nasser's Egypt, prompting a military intervention by France, the United Kingdom, and Israel."),
            zh = LocalizedContent("苏伊士危机发生在哪一年？", listOf("1954", "1955", "1956", "1957"), "历史", "苏伊士危机于1956年爆发，起因是纳赛尔领导的埃及将苏伊士运河国有化，引发了法国、英国和以色列的军事干预。"),
            es = LocalizedContent("¿En qué año ocurrió la Crisis de Suez?", listOf("1954", "1955", "1956", "1957"), "Historia", "La Crisis de Suez estalló en 1956 tras la nacionalización del Canal de Suez por parte del Egipto de Nasser, provocando una intervención militar de Francia, el Reino Unido e Israel.")
        ),
        BilingualQuestion(
            id = 9440, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel événement a déclenché la Crise de Suez?", listOf("La nationalisation du Canal", "L'invasion d'Égypte", "L'attaque israélienne", "Tous les trois"), "Histoire", "En juillet 1956, le président égyptien Gamal Abdel Nasser nationalise la Compagnie du canal de Suez, jusque-là contrôlée par des intérêts franco-britanniques, provoquant une intervention militaire de la France, du Royaume-Uni et d'Israël."),
            en = LocalizedContent("What event triggered the Suez Crisis?", listOf("Nationalization of the Canal", "Invasion of Egypt", "Israeli attack", "All three"), "History", "In July 1956, Egyptian President Gamal Abdel Nasser nationalized the Suez Canal Company, previously controlled by Franco-British interests, prompting a military intervention by France, the United Kingdom, and Israel."),
            zh = LocalizedContent("什么事件引发了苏伊士危机？", listOf("运河国有化", "入侵埃及", "以色列袭击", "以上所有"), "历史", "1956年7月，埃及总统贾迈勒·阿卜杜勒·纳赛尔将此前由英法利益控制的苏伊士运河公司国有化，引发了法国、英国和以色列的军事干预。"),
            es = LocalizedContent("¿Qué evento desencadenó la Crisis de Suez?", listOf("Nacionalización del Canal", "Invasión de Egipto", "Ataque israelí", "Los tres"), "Historia", "En julio de 1956, el presidente egipcio Gamal Abdel Nasser nacionalizó la Compañía del Canal de Suez, controlada hasta entonces por intereses franco-británicos, provocando una intervención militar de Francia, Reino Unido e Israel.")
        ),
        BilingualQuestion(
            id = 9441, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a nationalisé le Canal de Suez?", listOf("Gamal Abdel Nasser", "Anwar Sadate", "Saïd Pacha", "Ismaïl Pacha"), "Histoire", "Gamal Abdel Nasser, alors président de l'Égypte, a nationalisé le Canal de Suez le 26 juillet 1956, après le retrait du financement américain et britannique pour le barrage d'Assouan."),
            en = LocalizedContent("Who nationalized the Suez Canal?", listOf("Gamal Abdel Nasser", "Anwar Sadat", "Said Pasha", "Ismail Pasha"), "History", "Gamal Abdel Nasser, then President of Egypt, nationalized the Suez Canal on July 26, 1956, after the withdrawal of American and British funding for the Aswan Dam."),
            zh = LocalizedContent("谁将苏伊士运河国有化？", listOf("贾迈勒·阿卜杜勒·纳赛尔", "安瓦尔·萨达特", "赛义德帕夏", "伊斯梅尔帕夏"), "历史", "时任埃及总统贾迈勒·阿卜杜勒·纳赛尔于1956年7月26日将苏伊士运河国有化，此前美国和英国撤回了对阿斯旺大坝的资助。"),
            es = LocalizedContent("¿Quién nacionalizó el Canal de Suez?", listOf("Gamal Abdel Nasser", "Anwar Sadat", "Said Pachá", "Ismail Pachá"), "Historia", "Gamal Abdel Nasser, entonces presidente de Egipto, nacionalizó el Canal de Suez el 26 de julio de 1956, tras la retirada del financiamiento estadounidense y británico para la presa de Asuán.")
        ),
        BilingualQuestion(
            id = 9442, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année l'Insurrection de Hongrie a-t-elle eu lieu?", listOf("1955", "1956", "1957", "1958"), "Histoire", "L'insurrection de Budapest en 1956 fut un soulèvement populaire contre le régime communiste hongrois et la domination soviétique, écrasé par l'intervention militaire de l'URSS."),
            en = LocalizedContent("In which year did the Hungarian Uprising take place?", listOf("1955", "1956", "1957", "1958"), "History", "The Budapest Uprising in 1956 was a popular revolt against the Hungarian communist regime and Soviet domination, crushed by Soviet military intervention."),
            zh = LocalizedContent("匈牙利起义发生在哪一年？", listOf("1955", "1956", "1957", "1958"), "历史", "1956年的布达佩斯起义是一场反对匈牙利共产主义政权和苏联统治的民众起义，被苏联军事干预镇压。"),
            es = LocalizedContent("¿En qué año ocurrió la Insurrección de Hungría?", listOf("1955", "1956", "1957", "1958"), "Historia", "La insurrección de Budapest en 1956 fue un levantamiento popular contra el régimen comunista húngaro y la dominación soviética, aplastado por la intervención militar de la URSS.")
        ),
        BilingualQuestion(
            id = 9443, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel était l'objectif de l'Insurrection de Hongrie?", listOf("Renverser le régime communiste", "Obtenir l'indépendance de l'URSS", "Établir un régime démocratique", "Tous les trois"), "Histoire", "L'Insurrection de Hongrie en 1956 visait à la fois à quitter le Pacte de Varsovie, instaurer un multipartisme et obtenir la neutralité du pays. Ces trois objectifs étaient liés dans la lutte contre le régime communiste soviétique."),
            en = LocalizedContent("What was the goal of the Hungarian Uprising?", listOf("Overthrow the communist regime", "Achieve independence from the USSR", "Establish a democratic regime", "All three"), "History", "The Hungarian Uprising in 1956 aimed to leave the Warsaw Pact, establish a multi-party system, and achieve neutrality. These three goals were linked in the struggle against the Soviet communist regime."),
            zh = LocalizedContent("匈牙利起义的目标是什么？", listOf("推翻共产主义政权", "脱离苏联独立", "建立民主政权", "以上所有"), "历史", "1956年的匈牙利起义旨在退出华沙条约、建立多党制并实现中立。这三个目标在反对苏联共产主义政权的斗争中相互关联。"),
            es = LocalizedContent("¿Cuál era el objetivo de la Insurrección de Hungría?", listOf("Derrocar el régimen comunista", "Obtener independencia de la URSS", "Establecer un régimen democrático", "Los tres"), "Historia", "La Insurrección de Hungría en 1956 buscaba abandonar el Pacto de Varsovia, instaurar un multipartidismo y lograr la neutralidad. Estos tres objetivos estaban vinculados en la lucha contra el régimen comunista soviético.")
        ),
        BilingualQuestion(
            id = 9444, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année les soviétiques ont-ils écrasé l'insurrection hongroise?", listOf("1955", "1956", "1957", "1958"), "Histoire", "L'insurrection de Budapest, réprimée par l'armée soviétique, a eu lieu du 23 octobre au 10 novembre 1956."),
            en = LocalizedContent("In which year did the Soviets crush the Hungarian Uprising?", listOf("1955", "1956", "1957", "1958"), "History", "The Budapest Uprising, suppressed by the Soviet army, took place from October 23 to November 10, 1956."),
            zh = LocalizedContent("苏联在哪一年镇压了匈牙利起义？", listOf("1955", "1956", "1957", "1958"), "历史", "布达佩斯起义于1956年10月23日至11月10日发生，被苏联军队镇压。"),
            es = LocalizedContent("¿En qué año aplastaron los soviéticos la insurrección húngara?", listOf("1955", "1956", "1957", "1958"), "Historia", "La insurrección de Budapest, reprimida por el ejército soviético, tuvo lugar del 23 de octubre al 10 de noviembre de 1956.")
        ),
        BilingualQuestion(
            id = 9445, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("En quelle année Spoutnik a-t-il été lancé?", listOf("1956", "1957", "1958", "1959"), "Histoire", "Spoutnik 1, le premier satellite artificiel, a été lancé par l'Union soviétique le 4 octobre 1957, marquant le début de la course spatiale."),
            en = LocalizedContent("In which year was Sputnik launched?", listOf("1956", "1957", "1958", "1959"), "History", "Sputnik 1, the first artificial satellite, was launched by the Soviet Union on October 4, 1957, marking the start of the space race."),
            zh = LocalizedContent("斯普特尼克号在哪一年发射？", listOf("1956", "1957", "1958", "1959"), "历史", "斯普特尼克1号，第一颗人造卫星，于1957年10月4日由苏联发射，标志着太空竞赛的开始。"),
            es = LocalizedContent("¿En qué año se lanzó el Sputnik?", listOf("1956", "1957", "1958", "1959"), "Historia", "El Sputnik 1, el primer satélite artificial, fue lanzado por la Unión Soviética el 4 de octubre de 1957, marcando el inicio de la carrera espacial.")
        ),
        BilingualQuestion(
            id = 9446, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel était l'objectif de Spoutnik?", listOf("Démontrer la supériorité technologique soviétique", "Lancer un satellite orbital", "Établir la domination spatiale", "Tous les trois"), "Histoire", "Spoutnik 1 a démontré la faisabilité des satellites artificiels, Spoutnik 2 a envoyé un être vivant dans l'espace, et Spoutnik 3 a mené des études scientifiques. Le programme visait donc à la fois la recherche, l'exploration et la démonstration technologique."),
            en = LocalizedContent("What was the goal of Sputnik?", listOf("Demonstrate Soviet technological superiority", "Launch an orbital satellite", "Establish space dominance", "All three"), "History", "Sputnik 1 demonstrated the feasibility of artificial satellites, Sputnik 2 sent a living being into space, and Sputnik 3 conducted scientific studies. The program thus aimed at research, exploration, and technological demonstration."),
            zh = LocalizedContent("斯普特尼克号的目标是什么？", listOf("展示苏联技术优势", "发射轨道卫星", "建立太空主导地位", "以上所有"), "历史", "斯普特尼克1号展示了人造卫星的可行性，斯普特尼克2号将活体生物送入太空，斯普特尼克3号进行了科学研究。因此，该计划旨在研究、探索和技术展示。"),
            es = LocalizedContent("¿Cuál era el objetivo del Sputnik?", listOf("Demostrar la superioridad tecnológica soviética", "Lanzar un satélite orbital", "Establecer el dominio espacial", "Los tres"), "Historia", "El Sputnik 1 demostró la viabilidad de los satélites artificiales, el Sputnik 2 envió un ser vivo al espacio y el Sputnik 3 realizó estudios científicos. El programa apuntaba tanto a la investigación, la exploración como a la demostración tecnológica.")
        ),
        BilingualQuestion(
            id = 9447, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("En quelle année Gagarine a-t-il été le premier homme dans l'espace?", listOf("1960", "1961", "1962", "1963"), "Histoire", "Le 12 avril 1961, Youri Gagarine a effectué un vol orbital à bord de Vostok 1, marquant le premier voyage humain dans l'espace."),
            en = LocalizedContent("In which year did Gagarin become the first man in space?", listOf("1960", "1961", "1962", "1963"), "History", "On April 12, 1961, Yuri Gagarin completed an orbital flight aboard Vostok 1, marking the first human spaceflight."),
            zh = LocalizedContent("加加林在哪一年成为第一个进入太空的人？", listOf("1960", "1961", "1962", "1963"), "历史", "1961年4月12日，尤里·加加林乘坐东方一号完成轨道飞行，标志着首次载人航天飞行。"),
            es = LocalizedContent("¿En qué año Gagarin fue el primer hombre en el espacio?", listOf("1960", "1961", "1962", "1963"), "Historia", "El 12 de abril de 1961, Yuri Gagarin realizó un vuelo orbital a bordo del Vostok 1, marcando el primer viaje humano al espacio.")
        ),
        BilingualQuestion(
            id = 9448, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année John Glenn a-t-il orbitée autour de la Terre?", listOf("1960", "1961", "1962", "1963"), "Histoire", "John Glenn est devenu le premier Américain à orbiter autour de la Terre le 20 février 1962, à bord de la capsule Friendship 7."),
            en = LocalizedContent("In which year did John Glenn orbit the Earth?", listOf("1960", "1961", "1962", "1963"), "History", "John Glenn became the first American to orbit the Earth on February 20, 1962, aboard the Friendship 7 capsule."),
            zh = LocalizedContent("约翰·格伦在哪一年绕地球轨道飞行？", listOf("1960", "1961", "1962", "1963"), "历史", "约翰·格伦于1962年2月20日乘坐友谊7号太空舱成为第一个绕地球轨道飞行的美国人。"),
            es = LocalizedContent("¿En qué año John Glenn orbitó la Tierra?", listOf("1960", "1961", "1962", "1963"), "Historia", "John Glenn se convirtió en el primer estadounidense en orbitar la Tierra el 20 de febrero de 1962, a bordo de la cápsula Friendship 7.")
        ),
        BilingualQuestion(
            id = 9449, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année la Crise des missiles cubains a-t-elle eu lieu?", listOf("1960", "1961", "1962", "1963"), "Histoire", "En octobre 1962, l'URSS a installé des missiles nucléaires à Cuba, provoquant une confrontation directe avec les États-Unis."),
            en = LocalizedContent("In which year did the Cuban Missile Crisis take place?", listOf("1960", "1961", "1962", "1963"), "History", "In October 1962, the USSR installed nuclear missiles in Cuba, leading to a direct confrontation with the United States."),
            zh = LocalizedContent("古巴导弹危机发生在哪一年？", listOf("1960", "1961", "1962", "1963"), "历史", "1962年10月，苏联在古巴部署核导弹，导致与美国直接对抗。"),
            es = LocalizedContent("¿En qué año ocurrió la Crisis de los misiles cubanos?", listOf("1960", "1961", "1962", "1963"), "Historia", "En octubre de 1962, la URSS instaló misiles nucleares en Cuba, provocando una confrontación directa con Estados Unidos.")
        ),
        BilingualQuestion(
            id = 9450, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel était l'objectif de la Crise des missiles cubains?", listOf("Placer des missiles en Floride", "Placer des missiles à Cuba", "Établir la domination américaine", "Contrer les missiles américains"), "Histoire", "En 1962, l'URSS a installé secrètement des missiles nucléaires à Cuba, à proximité des États-Unis, pour dissuader une invasion américaine et équilibrer la puissance nucléaire."),
            en = LocalizedContent("What was the objective of the Cuban Missile Crisis?", listOf("Place missiles in Florida", "Place missiles in Cuba", "Establish American dominance", "Counter American missiles"), "History", "In 1962, the USSR secretly installed nuclear missiles in Cuba, near the United States, to deter a US invasion and balance nuclear power."),
            zh = LocalizedContent("古巴导弹危机的目标是什么？", listOf("在佛罗里达部署导弹", "在古巴部署导弹", "建立美国霸权", "对抗美国导弹"), "历史", "1962年，苏联在古巴秘密部署核导弹，靠近美国，以威慑美国入侵并平衡核力量。"),
            es = LocalizedContent("¿Cuál fue el objetivo de la Crisis de los Misiles en Cuba?", listOf("Colocar misiles en Florida", "Colocar misiles en Cuba", "Establecer el dominio estadounidense", "Contrarrestar los misiles estadounidenses"), "Historia", "En 1962, la URSS instaló secretamente misiles nucleares en Cuba, cerca de Estados Unidos, para disuadir una invasión estadounidense y equilibrar el poder nuclear.")
        ),
        BilingualQuestion(
            id = 9451, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui était le leader cubain pendant la Crise des missiles?", listOf("Fidel Castro", "Che Guevara", "Camilo Cienfuegos", "Juan Almeida"), "Histoire", "Fidel Castro dirigeait Cuba en 1962, lorsque l'URSS y installa des missiles nucléaires, déclenchant la Crise des missiles avec les États-Unis."),
            en = LocalizedContent("Who was the Cuban leader during the Cuban Missile Crisis?", listOf("Fidel Castro", "Che Guevara", "Camilo Cienfuegos", "Juan Almeida"), "History", "Fidel Castro led Cuba in 1962, when the USSR installed nuclear missiles there, triggering the Missile Crisis with the United States."),
            zh = LocalizedContent("古巴导弹危机期间古巴的领导人是谁？", listOf("菲德尔·卡斯特罗", "切·格瓦拉", "卡米洛·西恩富戈斯", "胡安·阿尔梅达"), "历史", "1962年，菲德尔·卡斯特罗领导古巴，当时苏联在古巴部署核导弹，引发了与美国之间的导弹危机。"),
            es = LocalizedContent("¿Quién fue el líder cubano durante la Crisis de los Misiles?", listOf("Fidel Castro", "Che Guevara", "Camilo Cienfuegos", "Juan Almeida"), "Historia", "Fidel Castro lideraba Cuba en 1962, cuando la URSS instaló misiles nucleares allí, desencadenando la Crisis de los Misiles con Estados Unidos.")
        ),
        BilingualQuestion(
            id = 9452, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année la Baie des Cochons a-t-elle eu lieu?", listOf("1960", "1961", "1962", "1963"), "Histoire", "L'invasion de la Baie des Cochons, une tentative avortée de renverser Fidel Castro, s'est déroulée en avril 1961 sous l'administration Kennedy."),
            en = LocalizedContent("In what year did the Bay of Pigs invasion take place?", listOf("1960", "1961", "1962", "1963"), "History", "The Bay of Pigs invasion, a failed attempt to overthrow Fidel Castro, occurred in April 1961 under the Kennedy administration."),
            zh = LocalizedContent("猪湾入侵发生在哪一年？", listOf("1960年", "1961年", "1962年", "1963年"), "历史", "猪湾入侵是一次推翻菲德尔·卡斯特罗的失败尝试，发生在1961年4月，肯尼迪政府时期。"),
            es = LocalizedContent("¿En qué año ocurrió la invasión de Bahía de Cochinos?", listOf("1960", "1961", "1962", "1963"), "Historia", "La invasión de Bahía de Cochinos, un intento fallido de derrocar a Fidel Castro, ocurrió en abril de 1961 bajo la administración Kennedy.")
        ),
        BilingualQuestion(
            id = 9453, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel était l'objectif de la Baie des Cochons?", listOf("Renverser Fidel Castro", "Envahir Cuba", "Établir un gouvernement pro-américain", "Tous les trois"), "Histoire", "L'invasion de la Baie des Cochons en 1961 visait à renverser Fidel Castro, mais elle échoua. Les trois objectifs principaux étaient d'établir une tête de pont, de déclencher un soulèvement populaire et de remplacer le gouvernement cubain."),
            en = LocalizedContent("What was the objective of the Bay of Pigs invasion?", listOf("Overthrow Fidel Castro", "Invade Cuba", "Establish a pro-American government", "All three"), "History", "The Bay of Pigs invasion in 1961 aimed to overthrow Fidel Castro, but it failed. The three main objectives were to establish a beachhead, trigger a popular uprising, and replace the Cuban government."),
            zh = LocalizedContent("猪湾入侵的目标是什么？", listOf("推翻菲德尔·卡斯特罗", "入侵古巴", "建立亲美政府", "以上所有"), "历史", "1961年的猪湾入侵旨在推翻菲德尔·卡斯特罗，但失败了。三个主要目标是建立滩头阵地、引发民众起义和取代古巴政府。"),
            es = LocalizedContent("¿Cuál fue el objetivo de la invasión de Bahía de Cochinos?", listOf("Derrocar a Fidel Castro", "Invadir Cuba", "Establecer un gobierno proestadounidense", "Los tres"), "Historia", "La invasión de Bahía de Cochinos en 1961 buscaba derrocar a Fidel Castro, pero fracasó. Los tres objetivos principales eran establecer una cabeza de playa, desencadenar un levantamiento popular y reemplazar al gobierno cubano.")
        ),
        BilingualQuestion(
            id = 9454, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année la Révolution culturelle en Chine a-t-elle commencé?", listOf("1964", "1965", "1966", "1967"), "Histoire", "Lancée par Mao Zedong en 1966, la Révolution culturelle visait à purger le Parti communiste chinois des éléments bourgeois et à réaffirmer l'idéologie maoïste."),
            en = LocalizedContent("In what year did the Cultural Revolution in China begin?", listOf("1964", "1965", "1966", "1967"), "History", "Launched by Mao Zedong in 1966, the Cultural Revolution aimed to purge the Chinese Communist Party of bourgeois elements and reaffirm Maoist ideology."),
            zh = LocalizedContent("中国的文化大革命始于哪一年？", listOf("1964年", "1965年", "1966年", "1967年"), "历史", "文化大革命由毛泽东于1966年发动，旨在清除中国共产党内的资产阶级分子，并重申毛泽东思想。"),
            es = LocalizedContent("¿En qué año comenzó la Revolución Cultural en China?", listOf("1964", "1965", "1966", "1967"), "Historia", "Lanzada por Mao Zedong en 1966, la Revolución Cultural buscaba purgar al Partido Comunista Chino de elementos burgueses y reafirmar la ideología maoísta.")
        ),
        BilingualQuestion(
            id = 9455, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel était l'objectif de la Révolution culturelle?", listOf("Purger la Chine des éléments capitalistes", "Établir la suprématie de Mao", "Transformer la société chinoise", "Tous les trois"), "Histoire", "La Révolution culturelle, lancée par Mao Zedong en 1966, visait à purger les éléments bourgeois du Parti communiste chinois, à renforcer l'idéologie maoïste et à consolider son pouvoir, d'où la réponse \"Tous les trois\"."),
            en = LocalizedContent("What was the objective of the Cultural Revolution?", listOf("Purge China of capitalist elements", "Establish Mao's supremacy", "Transform Chinese society", "All three"), "History", "The Cultural Revolution, launched by Mao Zedong in 1966, aimed to purge bourgeois elements from the Chinese Communist Party, strengthen Maoist ideology, and consolidate his power, hence the answer 'All three'."),
            zh = LocalizedContent("文化大革命的目标是什么？", listOf("清除中国的资本主义分子", "确立毛泽东的至高地位", "改造中国社会", "以上所有"), "历史", "文化大革命由毛泽东于1966年发动，旨在清除中国共产党内的资产阶级分子，加强毛泽东思想，巩固其权力，因此答案为“以上所有”。"),
            es = LocalizedContent("¿Cuál fue el objetivo de la Revolución Cultural?", listOf("Purgar a China de elementos capitalistas", "Establecer la supremacía de Mao", "Transformar la sociedad china", "Los tres"), "Historia", "La Revolución Cultural, lanzada por Mao Zedong en 1966, buscaba purgar los elementos burgueses del Partido Comunista Chino, fortalecer la ideología maoísta y consolidar su poder, de ahí la respuesta 'Los tres'.")
        ),
        BilingualQuestion(
            id = 9456, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année la Révolution culturelle s'est-elle terminée?", listOf("1968", "1969", "1976", "1978"), "Histoire", "La Révolution culturelle, lancée par Mao Zedong en 1966, s'est officiellement achevée avec sa mort en 1976 et l'arrestation de la Bande des quatre."),
            en = LocalizedContent("In what year did the Cultural Revolution end?", listOf("1968", "1969", "1976", "1978"), "History", "The Cultural Revolution, launched by Mao Zedong in 1966, officially ended with his death in 1976 and the arrest of the Gang of Four."),
            zh = LocalizedContent("文化大革命在哪一年结束？", listOf("1968年", "1969年", "1976年", "1978年"), "历史", "文化大革命由毛泽东于1966年发动，随着他于1976年去世以及“四人帮”被捕而正式结束。"),
            es = LocalizedContent("¿En qué año terminó la Revolución Cultural?", listOf("1968", "1969", "1976", "1978"), "Historia", "La Revolución Cultural, lanzada por Mao Zedong en 1966, terminó oficialmente con su muerte en 1976 y el arresto de la Banda de los Cuatro.")
        ),
        BilingualQuestion(
            id = 9457, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année la Guerre du Viêt Nam a-t-elle commencé pour les États-Unis?", listOf("1962", "1964", "1965", "1966"), "Histoire", "L'engagement militaire direct des États-Unis au Viêt Nam a commencé en 1965 avec l'opération Rolling Thunder et le déploiement des premiers combattants à Da Nang."),
            en = LocalizedContent("In what year did the Vietnam War begin for the United States?", listOf("1962", "1964", "1965", "1966"), "History", "Direct US military involvement in Vietnam began in 1965 with Operation Rolling Thunder and the deployment of the first combat troops to Da Nang."),
            zh = LocalizedContent("美国参与的越南战争始于哪一年？", listOf("1962年", "1964年", "1965年", "1966年"), "历史", "美国直接军事介入越南始于1965年，以“滚雷行动”和首批作战部队部署至岘港为标志。"),
            es = LocalizedContent("¿En qué año comenzó la Guerra de Vietnam para Estados Unidos?", listOf("1962", "1964", "1965", "1966"), "Historia", "La participación militar directa de Estados Unidos en Vietnam comenzó en 1965 con la Operación Rolling Thunder y el despliegue de los primeros soldados de combate en Da Nang.")
        ),
        BilingualQuestion(
            id = 9458, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel événement a déclenché l'escalade américaine au Viêt Nam?", listOf("L'incident du Golfe du Tonkin", "La chute de Diên Biên Phủ", "L'indépendance du Viêt Nam du Nord", "L'attaque du Viêt Cong"), "Histoire", "En août 1964, une prétendue attaque nord-vietnamienne contre un destroyer américain dans le golfe du Tonkin a conduit le Congrès américain à adopter une résolution autorisant une intervention militaire accrue."),
            en = LocalizedContent("What event triggered the US escalation in Vietnam?", listOf("The Gulf of Tonkin incident", "The fall of Dien Bien Phu", "North Vietnam's independence", "The Viet Cong attack"), "History", "In August 1964, an alleged North Vietnamese attack on a US destroyer in the Gulf of Tonkin led the US Congress to pass a resolution authorizing increased military intervention."),
            zh = LocalizedContent("什么事件引发了美国在越南的升级行动？", listOf("北部湾事件", "奠边府战役失败", "北越独立", "越共袭击"), "历史", "1964年8月，北越据称袭击了美国驱逐舰的北部湾事件，导致美国国会通过决议，授权增加军事干预。"),
            es = LocalizedContent("¿Qué evento desencadenó la escalada estadounidense en Vietnam?", listOf("El incidente del Golfo de Tonkín", "La caída de Dien Bien Phu", "La independencia de Vietnam del Norte", "El ataque del Viet Cong"), "Historia", "En agosto de 1964, un presunto ataque norvietnamita contra un destructor estadounidense en el Golfo de Tonkín llevó al Congreso de EE. UU. a aprobar una resolución autorizando una mayor intervención militar.")
        ),
        BilingualQuestion(
            id = 9459, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année la Guerre du Viêt Nam s'est-elle terminée?", listOf("1972", "1973", "1974", "1975"), "Histoire", "La guerre du Viêt Nam s'est officiellement terminée le 30 avril 1975 avec la chute de Saïgon, marquant la victoire du Nord-Viêt Nam et la réunification du pays sous régime communiste."),
            en = LocalizedContent("In what year did the Vietnam War end?", listOf("1972", "1973", "1974", "1975"), "History", "The Vietnam War officially ended on April 30, 1975, with the fall of Saigon, marking the victory of North Vietnam and the reunification of the country under communist rule."),
            zh = LocalizedContent("越南战争在哪一年结束？", listOf("1972年", "1973年", "1974年", "1975年"), "历史", "越南战争于1975年4月30日以西贡陷落正式结束，标志着北越的胜利和越南在共产主义统治下的统一。"),
            es = LocalizedContent("¿En qué año terminó la Guerra de Vietnam?", listOf("1972", "1973", "1974", "1975"), "Historia", "La Guerra de Vietnam terminó oficialmente el 30 de abril de 1975 con la caída de Saigón, marcando la victoria de Vietnam del Norte y la reunificación del país bajo el régimen comunista.")
        ),
        BilingualQuestion(
            id = 9460, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel événement a marqué la fin de la Guerre du Viêt Nam?", listOf("La chute de Saïgon", "La Paix avec honneur", "Le Traité de Paris", "L'offensive de Tet"), "Histoire", "La chute de Saïgon, le 30 avril 1975, a mis fin à la guerre du Viêt Nam lorsque les forces nord-vietnamiennes ont pris le contrôle de la capitale sud-vietnamienne."),
            en = LocalizedContent("What event marked the end of the Vietnam War?", listOf("Fall of Saigon", "Peace with Honor", "Paris Peace Accords", "Tet Offensive"), "History", "The Fall of Saigon on April 30, 1975, ended the Vietnam War when North Vietnamese forces captured the South Vietnamese capital."),
            zh = LocalizedContent("什么事件标志着越南战争的结束？", listOf("西贡陷落", "光荣和平", "巴黎和平协定", "春节攻势"), "历史", "1975年4月30日西贡陷落，北越军队攻占南越首都，结束了越南战争。"),
            es = LocalizedContent("¿Qué evento marcó el fin de la Guerra de Vietnam?", listOf("Caída de Saigón", "Paz con honor", "Acuerdos de Paz de París", "Ofensiva del Tet"), "Historia", "La Caída de Saigón el 30 de abril de 1975 puso fin a la Guerra de Vietnam cuando las fuerzas norvietnamitas tomaron la capital survietnamita.")
        ),
        BilingualQuestion(
            id = 9461, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année le Traité de Paris sur le Viêt Nam a-t-il été signé?", listOf("1972", "1973", "1974", "1975"), "Histoire", "Le Traité de Paris, officiellement les Accords de paix de Paris, a été signé le 27 janvier 1973, mettant fin à la participation directe des États-Unis à la guerre du Viêt Nam."),
            en = LocalizedContent("In what year was the Paris Peace Accords on Vietnam signed?", listOf("1972", "1973", "1974", "1975"), "History", "The Paris Peace Accords, officially the Paris Peace Agreement, was signed on January 27, 1973, ending direct U.S. involvement in the Vietnam War."),
            zh = LocalizedContent("关于越南的巴黎和平协定是在哪一年签署的？", listOf("1972年", "1973年", "1974年", "1975年"), "历史", "巴黎和平协定，正式名称为巴黎和平协议，于1973年1月27日签署，结束了美国对越南战争的直接参与。"),
            es = LocalizedContent("¿En qué año se firmaron los Acuerdos de Paz de París sobre Vietnam?", listOf("1972", "1973", "1974", "1975"), "Historia", "Los Acuerdos de Paz de París, oficialmente el Acuerdo de Paz de París, se firmaron el 27 de enero de 1973, poniendo fin a la participación directa de Estados Unidos en la Guerra de Vietnam.")
        ),
        BilingualQuestion(
            id = 9462, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année la Chute de Saïgon a-t-elle eu lieu?", listOf("1973", "1974", "1975", "1976"), "Histoire", "La chute de Saïgon le 30 avril 1975 marque la fin de la guerre du Vietnam, avec la prise de la ville par les forces nord-vietnamiennes et la reddition inconditionnelle du Sud-Vietnam."),
            en = LocalizedContent("In what year did the Fall of Saigon occur?", listOf("1973", "1974", "1975", "1976"), "History", "The Fall of Saigon on April 30, 1975, marked the end of the Vietnam War, with the capture of the city by North Vietnamese forces and the unconditional surrender of South Vietnam."),
            zh = LocalizedContent("西贡陷落发生在哪一年？", listOf("1973年", "1974年", "1975年", "1976年"), "历史", "1975年4月30日西贡陷落，北越军队攻占该市，南越无条件投降，标志着越南战争的结束。"),
            es = LocalizedContent("¿En qué año ocurrió la Caída de Saigón?", listOf("1973", "1974", "1975", "1976"), "Historia", "La Caída de Saigón el 30 de abril de 1975 marcó el fin de la Guerra de Vietnam, con la captura de la ciudad por las fuerzas norvietnamitas y la rendición incondicional de Vietnam del Sur.")
        ),
        BilingualQuestion(
            id = 9463, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année Richard Nixon a-t-il été élu président?", listOf("1966", "1968", "1970", "1972"), "Histoire", "Richard Nixon a remporté l'élection présidentielle américaine de 1968 face au démocrate Hubert Humphrey, dans un contexte marqué par la guerre du Vietnam et les tensions sociales."),
            en = LocalizedContent("In what year was Richard Nixon elected president?", listOf("1966", "1968", "1970", "1972"), "History", "Richard Nixon won the 1968 U.S. presidential election against Democrat Hubert Humphrey, amid the Vietnam War and social tensions."),
            zh = LocalizedContent("理查德·尼克松在哪一年当选总统？", listOf("1966年", "1968年", "1970年", "1972年"), "历史", "理查德·尼克松在1968年美国总统大选中击败民主党候选人休伯特·汉弗莱，当时正值越南战争和社会紧张局势。"),
            es = LocalizedContent("¿En qué año fue elegido presidente Richard Nixon?", listOf("1966", "1968", "1970", "1972"), "Historia", "Richard Nixon ganó las elecciones presidenciales de EE. UU. de 1968 contra el demócrata Hubert Humphrey, en un contexto marcado por la Guerra de Vietnam y las tensiones sociales.")
        ),
        BilingualQuestion(
            id = 9464, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année Nixon a-t-il visité la Chine?", listOf("1970", "1971", "1972", "1973"), "Histoire", "La visite de Richard Nixon en Chine en février 1972 a mis fin à plus de deux décennies d'isolement diplomatique entre les deux pays."),
            en = LocalizedContent("In what year did Nixon visit China?", listOf("1970", "1971", "1972", "1973"), "History", "Richard Nixon's visit to China in February 1972 ended more than two decades of diplomatic isolation between the two countries."),
            zh = LocalizedContent("尼克松在哪一年访问了中国？", listOf("1970年", "1971年", "1972年", "1973年"), "历史", "理查德·尼克松于1972年2月访问中国，结束了中美两国二十多年的外交隔绝。"),
            es = LocalizedContent("¿En qué año visitó Nixon China?", listOf("1970", "1971", "1972", "1973"), "Historia", "La visita de Richard Nixon a China en febrero de 1972 puso fin a más de dos décadas de aislamiento diplomático entre los dos países.")
        ),
        BilingualQuestion(
            id = 9465, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel était l'objectif de la visite de Nixon en Chine?", listOf("Établir des relations diplomatiques", "Contrer l'URSS", "Promouvoir les échanges commerciaux", "Tous les trois"), "Histoire", "La visite de Nixon en Chine en 1972 visait à normaliser les relations diplomatiques, à ouvrir des échanges économiques et à établir une coopération stratégique contre l'Union soviétique."),
            en = LocalizedContent("What was the purpose of Nixon's visit to China?", listOf("Establish diplomatic relations", "Counter the USSR", "Promote trade", "All three"), "History", "Nixon's 1972 visit to China aimed to normalize diplomatic relations, open economic exchanges, and establish strategic cooperation against the Soviet Union."),
            zh = LocalizedContent("尼克松访华的目的是什么？", listOf("建立外交关系", "对抗苏联", "促进贸易", "以上所有"), "历史", "尼克松1972年访华旨在实现两国关系正常化、开放经济交流，并建立对抗苏联的战略合作。"),
            es = LocalizedContent("¿Cuál fue el propósito de la visita de Nixon a China?", listOf("Establecer relaciones diplomáticas", "Contrarrestar a la URSS", "Promover el comercio", "Los tres"), "Historia", "La visita de Nixon a China en 1972 buscaba normalizar las relaciones diplomáticas, abrir intercambios económicos y establecer una cooperación estratégica contra la Unión Soviética.")
        ),
        BilingualQuestion(
            id = 9466, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année le Scandale du Watergate a-t-il éclaté?", listOf("1971", "1972", "1973", "1974"), "Histoire", "Le scandale du Watergate a éclaté en 1972 après l'arrestation de cinq hommes ayant cambriolé le siège du Parti démocrate, situé dans l'immeuble du Watergate à Washington. Cette affaire a conduit à la démission du président Richard Nixon en 1974."),
            en = LocalizedContent("In what year did the Watergate scandal break?", listOf("1971", "1972", "1973", "1974"), "History", "The Watergate scandal broke in 1972 after the arrest of five men who burglarized the Democratic National Committee headquarters at the Watergate complex in Washington, D.C., leading to President Richard Nixon's resignation in 1974."),
            zh = LocalizedContent("水门事件在哪一年爆发？", listOf("1971年", "1972年", "1973年", "1974年"), "历史", "水门事件于1972年爆发，五名男子闯入华盛顿水门大厦的民主党全国委员会总部被捕，最终导致理查德·尼克松总统于1974年辞职。"),
            es = LocalizedContent("¿En qué año estalló el escándalo de Watergate?", listOf("1971", "1972", "1973", "1974"), "Historia", "El escándalo de Watergate estalló en 1972 tras el arresto de cinco hombres que allanaron la sede del Partido Demócrata en el complejo Watergate en Washington, D.C., lo que llevó a la renuncia del presidente Richard Nixon en 1974.")
        ),
        BilingualQuestion(
            id = 9467, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année Nixon a-t-il démissionné?", listOf("1972", "1973", "1974", "1975"), "Histoire", "Richard Nixon a démissionné de la présidence des États-Unis en 1974, suite au scandale du Watergate, pour éviter une procédure de destitution."),
            en = LocalizedContent("In what year did Nixon resign?", listOf("1972", "1973", "1974", "1975"), "History", "Richard Nixon resigned the presidency of the United States in 1974, following the Watergate scandal, to avoid impeachment."),
            zh = LocalizedContent("尼克松在哪一年辞职？", listOf("1972年", "1973年", "1974年", "1975年"), "历史", "理查德·尼克松于1974年因水门事件辞职，以避免被弹劾。"),
            es = LocalizedContent("¿En qué año renunció Nixon?", listOf("1972", "1973", "1974", "1975"), "Historia", "Richard Nixon renunció a la presidencia de Estados Unidos en 1974, tras el escándalo de Watergate, para evitar un juicio político.")
        ),
        BilingualQuestion(
            id = 9468, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a succédé à Nixon?", listOf("Gerald Ford", "Henry Kissinger", "Alexander Haig", "Barry Goldwater"), "Histoire", "Gerald Ford est devenu président après la démission de Richard Nixon en 1974, suite au scandale du Watergate. Il est le seul président américain à n'avoir jamais été élu à la vice-présidence ou à la présidence."),
            en = LocalizedContent("Who succeeded Nixon?", listOf("Gerald Ford", "Henry Kissinger", "Alexander Haig", "Barry Goldwater"), "History", "Gerald Ford became president after Richard Nixon's resignation in 1974, following the Watergate scandal. He is the only U.S. president never elected to the vice presidency or presidency."),
            zh = LocalizedContent("谁接替了尼克松？", listOf("杰拉尔德·福特", "亨利·基辛格", "亚历山大·黑格", "巴里·戈德华特"), "历史", "杰拉尔德·福特在理查德·尼克松于1974年因水门事件辞职后成为总统。他是唯一一位未经选举就任副总统和总统的美国总统。"),
            es = LocalizedContent("¿Quién sucedió a Nixon?", listOf("Gerald Ford", "Henry Kissinger", "Alexander Haig", "Barry Goldwater"), "Historia", "Gerald Ford se convirtió en presidente tras la renuncia de Richard Nixon en 1974, debido al escándalo de Watergate. Es el único presidente de EE. UU. que nunca fue elegido para la vicepresidencia o la presidencia.")
        ),
        BilingualQuestion(
            id = 9469, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année la Détente entre les superpuissances a-t-elle commencé?", listOf("1968", "1969", "1970", "1971"), "Histoire", "La Détente, période d'apaisement des tensions entre les États-Unis et l'Union soviétique, a débuté en 1969 avec l'arrivée au pouvoir de Richard Nixon et sa politique de négociation."),
            en = LocalizedContent("In what year did Détente between the superpowers begin?", listOf("1968", "1969", "1970", "1971"), "History", "Détente, a period of easing tensions between the United States and the Soviet Union, began in 1969 with the rise of Richard Nixon and his policy of negotiation."),
            zh = LocalizedContent("超级大国之间的缓和始于哪一年？", listOf("1968年", "1969年", "1970年", "1971年"), "历史", "缓和，即美苏之间紧张局势的缓和时期，始于1969年理查德·尼克松上台及其谈判政策。"),
            es = LocalizedContent("¿En qué año comenzó la Distensión entre las superpotencias?", listOf("1968", "1969", "1970", "1971"), "Historia", "La Distensión, un período de relajación de las tensiones entre Estados Unidos y la Unión Soviética, comenzó en 1969 con el ascenso de Richard Nixon y su política de negociación.")
        ),
        BilingualQuestion(
            id = 9470, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel traité a marqué le sommet de la Détente?", listOf("SALT I", "SALT II", "ABM Treaty", "START I"), "Histoire", "Le traité ABM (Anti-Ballistic Missile Treaty), signé en 1972 entre les États-Unis et l'URSS, a limité les systèmes de défense antimissile, symbolisant l'apogée de la Détente pendant la Guerre froide."),
            en = LocalizedContent("Which treaty marked the peak of Détente?", listOf("SALT I", "SALT II", "ABM Treaty", "START I"), "History", "The ABM (Anti-Ballistic Missile) Treaty, signed in 1972 between the US and USSR, limited anti-missile defense systems, symbolizing the peak of Détente during the Cold War."),
            zh = LocalizedContent("哪项条约标志着缓和政策的顶峰？", listOf("第一阶段限制战略武器条约", "第二阶段限制战略武器条约", "反弹道导弹条约", "第一阶段削减战略武器条约"), "历史", "1972年美国和苏联签署的《反弹道导弹条约》限制了反导防御系统，象征着冷战期间缓和政策的顶峰。"),
            es = LocalizedContent("¿Qué tratado marcó la cima de la Distensión?", listOf("SALT I", "SALT II", "Tratado ABM", "START I"), "Historia", "El Tratado ABM (Antibalísticos), firmado en 1972 entre EE. UU. y la URSS, limitó los sistemas de defensa antimisiles, simbolizando el apogeo de la Distensión durante la Guerra Fría.")
        ),
        BilingualQuestion(
            id = 9471, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année la Nouvelle Politique Économique en URSS a-t-elle commencé?", listOf("1985", "1986", "1987", "1988"), "Histoire", "Lancée en 1985 par Mikhaïl Gorbatchev, la Nouvelle Politique Économique (NEP) visait à réformer l'économie soviétique en introduisant des éléments de marché, après des décennies de planification centralisée."),
            en = LocalizedContent("In what year did the New Economic Policy in the USSR begin?", listOf("1985", "1986", "1987", "1988"), "History", "Launched in 1985 by Mikhail Gorbachev, the New Economic Policy (NEP) aimed to reform the Soviet economy by introducing market elements after decades of centralized planning."),
            zh = LocalizedContent("苏联的新经济政策始于哪一年？", listOf("1985", "1986", "1987", "1988"), "历史", "1985年由米哈伊尔·戈尔巴乔夫发起的新经济政策旨在通过引入市场元素来改革苏联经济，此前经历了数十年的中央计划经济。"),
            es = LocalizedContent("¿En qué año comenzó la Nueva Política Económica en la URSS?", listOf("1985", "1986", "1987", "1988"), "Historia", "Lanzada en 1985 por Mijaíl Gorbachov, la Nueva Política Económica (NEP) buscaba reformar la economía soviética introduciendo elementos de mercado tras décadas de planificación centralizada.")
        ),
        BilingualQuestion(
            id = 9472, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année Mikhail Gorbatchev a-t-il pris le pouvoir?", listOf("1984", "1985", "1986", "1987"), "Histoire", "Mikhail Gorbatchev est devenu secrétaire général du Parti communiste de l'Union soviétique en mars 1985, succédant à Konstantin Tchernenko."),
            en = LocalizedContent("In what year did Mikhail Gorbachev come to power?", listOf("1984", "1985", "1986", "1987"), "History", "Mikhail Gorbachev became General Secretary of the Communist Party of the Soviet Union in March 1985, succeeding Konstantin Chernenko."),
            zh = LocalizedContent("米哈伊尔·戈尔巴乔夫在哪一年上台？", listOf("1984", "1985", "1986", "1987"), "历史", "米哈伊尔·戈尔巴乔夫于1985年3月成为苏联共产党总书记，接替康斯坦丁·契尔年科。"),
            es = LocalizedContent("¿En qué año llegó al poder Mijaíl Gorbachov?", listOf("1984", "1985", "1986", "1987"), "Historia", "Mijaíl Gorbachov se convirtió en secretario general del Partido Comunista de la Unión Soviética en marzo de 1985, sucediendo a Konstantín Chernenko.")
        ),
        BilingualQuestion(
            id = 9473, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel était le nom de la politique de reformes de Gorbatchev?", listOf("Glasnost et Perestroika", "Détente", "Coexistence pacifique", "Ouverture"), "Histoire", "Glasnost (transparence) et Perestroika (restructuration) étaient les deux piliers des réformes lancées par Mikhaïl Gorbatchev en URSS dans les années 1980 pour moderniser le système soviétique."),
            en = LocalizedContent("What was the name of Gorbachev's reform policy?", listOf("Glasnost and Perestroika", "Détente", "Peaceful coexistence", "Opening"), "History", "Glasnost (openness) and Perestroika (restructuring) were the two pillars of reforms launched by Mikhail Gorbachev in the USSR in the 1980s to modernize the Soviet system."),
            zh = LocalizedContent("戈尔巴乔夫的改革政策叫什么？", listOf("公开性和改革", "缓和", "和平共处", "开放"), "历史", "公开性（Glasnost）和改革（Perestroika）是米哈伊尔·戈尔巴乔夫在20世纪80年代为现代化苏联体系而发起的改革的两大支柱。"),
            es = LocalizedContent("¿Cuál era el nombre de la política de reformas de Gorbachov?", listOf("Glasnost y Perestroika", "Distensión", "Coexistencia pacífica", "Apertura"), "Historia", "Glasnost (transparencia) y Perestroika (reestructuración) fueron los dos pilares de las reformas lanzadas por Mijaíl Gorbachov en la URSS en los años 80 para modernizar el sistema soviético.")
        ),
        BilingualQuestion(
            id = 9474, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année le Mur de Berlin est-il tombé?", listOf("1988", "1989", "1990", "1991"), "Histoire", "Le Mur de Berlin est tombé le 9 novembre 1989, marquant la fin de la division de l'Allemagne et un tournant majeur dans la guerre froide."),
            en = LocalizedContent("In what year did the Berlin Wall fall?", listOf("1988", "1989", "1990", "1991"), "History", "The Berlin Wall fell on November 9, 1989, marking the end of Germany's division and a major turning point in the Cold War."),
            zh = LocalizedContent("柏林墙在哪一年倒塌？", listOf("1988", "1989", "1990", "1991"), "历史", "柏林墙于1989年11月9日倒塌，标志着德国分裂的结束和冷战的一个重大转折点。"),
            es = LocalizedContent("¿En qué año cayó el Muro de Berlín?", listOf("1988", "1989", "1990", "1991"), "Historia", "El Muro de Berlín cayó el 9 de noviembre de 1989, marcando el fin de la división de Alemania y un punto de inflexión importante en la Guerra Fría.")
        ),
        BilingualQuestion(
            id = 9475, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel événement a marqué la fin de la Guerre froide?", listOf("La chute du Mur de Berlin", "La dissolution de l'URSS", "La réunification de l'Allemagne", "Tous les trois"), "Histoire", "La chute du mur de Berlin en 1989, la réunification allemande en 1990 et la dissolution de l'URSS en 1991 sont les trois événements clés qui ont mis fin à la Guerre froide."),
            en = LocalizedContent("Which event marked the end of the Cold War?", listOf("The fall of the Berlin Wall", "The dissolution of the USSR", "The reunification of Germany", "All three"), "History", "The fall of the Berlin Wall in 1989, German reunification in 1990, and the dissolution of the USSR in 1991 are the three key events that ended the Cold War."),
            zh = LocalizedContent("哪个事件标志着冷战的结束？", listOf("柏林墙倒塌", "苏联解体", "德国统一", "以上所有"), "历史", "1989年柏林墙倒塌、1990年德国统一和1991年苏联解体是结束冷战的三个关键事件。"),
            es = LocalizedContent("¿Qué evento marcó el fin de la Guerra Fría?", listOf("La caída del Muro de Berlín", "La disolución de la URSS", "La reunificación de Alemania", "Los tres"), "Historia", "La caída del Muro de Berlín en 1989, la reunificación alemana en 1990 y la disolución de la URSS en 1991 son los tres eventos clave que pusieron fin a la Guerra Fría.")
        ),
        BilingualQuestion(
            id = 9476, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("En quelle année l'Allemagne a-t-elle été réunifiée?", listOf("1988", "1989", "1990", "1991"), "Histoire", "La réunification allemande a eu lieu le 3 octobre 1990, après la chute du mur de Berlin en 1989 et la dissolution de la RDA."),
            en = LocalizedContent("In what year was Germany reunified?", listOf("1988", "1989", "1990", "1991"), "History", "German reunification took place on October 3, 1990, after the fall of the Berlin Wall in 1989 and the dissolution of the GDR."),
            zh = LocalizedContent("德国在哪一年统一？", listOf("1988", "1989", "1990", "1991"), "历史", "德国统一于1990年10月3日，此前1989年柏林墙倒塌，东德解体。"),
            es = LocalizedContent("¿En qué año se reunificó Alemania?", listOf("1988", "1989", "1990", "1991"), "Historia", "La reunificación alemana tuvo lugar el 3 de octubre de 1990, tras la caída del Muro de Berlín en 1989 y la disolución de la RDA.")
        ),
        BilingualQuestion(
            id = 9477, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année la Révolte dans les pays de l'Europe de l'Est a-t-elle commencé?", listOf("1988", "1989", "1990", "1991"), "Histoire", "L'année 1989 marque le début des révolutions anticommunistes en Europe de l'Est, avec des manifestations et des changements de régime en Pologne, en Hongrie, en Tchécoslovaquie et en Roumanie."),
            en = LocalizedContent("In what year did the Revolt in Eastern European countries begin?", listOf("1988", "1989", "1990", "1991"), "History", "The year 1989 marks the beginning of the anti-communist revolutions in Eastern Europe, with protests and regime changes in Poland, Hungary, Czechoslovakia, and Romania."),
            zh = LocalizedContent("东欧国家的起义在哪一年开始？", listOf("1988", "1989", "1990", "1991"), "历史", "1989年标志着东欧反共革命的开始，波兰、匈牙利、捷克斯洛伐克和罗马尼亚发生了抗议和政权更迭。"),
            es = LocalizedContent("¿En qué año comenzó la Revuelta en los países de Europa del Este?", listOf("1988", "1989", "1990", "1991"), "Historia", "El año 1989 marca el inicio de las revoluciones anticomunistas en Europa del Este, con protestas y cambios de régimen en Polonia, Hungría, Checoslovaquia y Rumania.")
        ),
        BilingualQuestion(
            id = 9478, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("En quelle année l'URSS s'est-elle officiellement dissoute?", listOf("1989", "1990", "1991", "1992"), "Histoire", "L'URSS s'est officiellement dissoute le 26 décembre 1991, à la suite de la déclaration de l'indépendance de plusieurs républiques et de la démission de Mikhaïl Gorbatchev."),
            en = LocalizedContent("In what year was the USSR officially dissolved?", listOf("1989", "1990", "1991", "1992"), "History", "The USSR was officially dissolved on December 26, 1991, following the declaration of independence by several republics and the resignation of Mikhail Gorbachev."),
            zh = LocalizedContent("苏联在哪一年正式解体？", listOf("1989", "1990", "1991", "1992"), "历史", "苏联于1991年12月26日正式解体，此前多个共和国宣布独立，米哈伊尔·戈尔巴乔夫辞职。"),
            es = LocalizedContent("¿En qué año se disolvió oficialmente la URSS?", listOf("1989", "1990", "1991", "1992"), "Historia", "La URSS se disolvió oficialmente el 26 de diciembre de 1991, tras la declaración de independencia de varias repúblicas y la dimisión de Mijaíl Gorbachov.")
        ),
        BilingualQuestion(
            id = 9479, correctIndex = 3, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui a été le dernier leader de l'URSS?", listOf("Léonid Brejnev", "Iouri Andropov", "Konstantin Tchernenko", "Mikhail Gorbatchev"), "Histoire", "Mikhail Gorbatchev a été le dernier dirigeant de l'URSS, de 1985 à 1991, et a mis en œuvre les réformes de la perestroïka et de la glasnost qui ont accéléré la dissolution de l'Union soviétique."),
            en = LocalizedContent("Who was the last leader of the USSR?", listOf("Leonid Brezhnev", "Yuri Andropov", "Konstantin Chernenko", "Mikhail Gorbachev"), "History", "Mikhail Gorbachev was the last leader of the USSR, from 1985 to 1991, and implemented the reforms of perestroika and glasnost that accelerated the dissolution of the Soviet Union."),
            zh = LocalizedContent("谁是苏联的最后一位领导人？", listOf("列昂尼德·勃列日涅夫", "尤里·安德罗波夫", "康斯坦丁·契尔年科", "米哈伊尔·戈尔巴乔夫"), "历史", "米哈伊尔·戈尔巴乔夫是苏联的最后一位领导人，从1985年到1991年，他实施了改革和公开性政策，加速了苏联的解体。"),
            es = LocalizedContent("¿Quién fue el último líder de la URSS?", listOf("Leonid Brézhnev", "Yuri Andrópov", "Konstantín Chernenko", "Mijaíl Gorbachov"), "Historia", "Mijaíl Gorbachov fue el último líder de la URSS, de 1985 a 1991, e implementó las reformas de la perestroika y la glasnost que aceleraron la disolución de la Unión Soviética.")
        ),
        BilingualQuestion(
            id = 9480, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année la Première Guerre du Golfe a-t-elle commencé?", listOf("1989", "1990", "1991", "1992"), "Histoire", "L'Irak de Saddam Hussein a envahi le Koweït le 2 août 1990, déclenchant la Première Guerre du Golfe après l'ultimatum de l'ONU."),
            en = LocalizedContent("In which year did the First Gulf War begin?", listOf("1989", "1990", "1991", "1992"), "History", "Saddam Hussein's Iraq invaded Kuwait on August 2, 1990, triggering the First Gulf War after the UN ultimatum."),
            zh = LocalizedContent("第一次海湾战争在哪一年开始？", listOf("1989", "1990", "1991", "1992"), "历史", "萨达姆·侯赛因的伊拉克于1990年8月2日入侵科威特，在联合国最后通牒后引发了第一次海湾战争。"),
            es = LocalizedContent("¿En qué año comenzó la Primera Guerra del Golfo?", listOf("1989", "1990", "1991", "1992"), "Historia", "El Irak de Saddam Hussein invadió Kuwait el 2 de agosto de 1990, desencadenando la Primera Guerra del Golfo tras el ultimátum de la ONU.")
        ),
        BilingualQuestion(
            id = 9481, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel événement a déclenché la Première Guerre du Golfe?", listOf("L'invasion du Koweït", "Le soutien d'Israël", "L'embargo pétrolier", "L'attaque de l'Iran"), "Histoire", "L'invasion du Koweït par l'Irak de Saddam Hussein en août 1990 a conduit à une coalition internationale menée par les États-Unis pour libérer le pays, déclenchant la Première Guerre du Golfe en 1991."),
            en = LocalizedContent("What event triggered the First Gulf War?", listOf("The invasion of Kuwait", "Support for Israel", "The oil embargo", "The attack on Iran"), "History", "Iraq's invasion of Kuwait under Saddam Hussein in August 1990 led to an international coalition led by the United States to liberate the country, triggering the First Gulf War in 1991."),
            zh = LocalizedContent("什么事件引发了第一次海湾战争？", listOf("入侵科威特", "支持以色列", "石油禁运", "攻击伊朗"), "历史", "萨达姆·侯赛因领导的伊拉克于1990年8月入侵科威特，导致美国领导的国际联盟解放该国，从而引发了1991年的第一次海湾战争。"),
            es = LocalizedContent("¿Qué evento desencadenó la Primera Guerra del Golfo?", listOf("La invasión de Kuwait", "El apoyo a Israel", "El embargo petrolero", "El ataque a Irán"), "Historia", "La invasión de Kuwait por parte del Irak de Saddam Hussein en agosto de 1990 llevó a una coalición internacional liderada por Estados Unidos para liberar el país, desencadenando la Primera Guerra del Golfo en 1991.")
        ),
        BilingualQuestion(
            id = 9482, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui a envahi le Koweït?", listOf("L'Irak", "L'Iran", "L'Arabie Saoudite", "La Syrie"), "Histoire", "L'Irak, sous la direction de Saddam Hussein, a envahi le Koweït en août 1990, déclenchant la guerre du Golfe."),
            en = LocalizedContent("Who invaded Kuwait?", listOf("Iraq", "Iran", "Saudi Arabia", "Syria"), "History", "Iraq, under the leadership of Saddam Hussein, invaded Kuwait in August 1990, triggering the Gulf War."),
            zh = LocalizedContent("谁入侵了科威特？", listOf("伊拉克", "伊朗", "沙特阿拉伯", "叙利亚"), "历史", "伊拉克在萨达姆·侯赛因的领导下于1990年8月入侵科威特，引发了海湾战争。"),
            es = LocalizedContent("¿Quién invadió Kuwait?", listOf("Irak", "Irán", "Arabia Saudita", "Siria"), "Historia", "Irak, bajo el liderazgo de Saddam Hussein, invadió Kuwait en agosto de 1990, desencadenando la Guerra del Golfo.")
        ),
        BilingualQuestion(
            id = 9483, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année la Première Guerre du Golfe s'est-elle terminée?", listOf("1990", "1991", "1992", "1993"), "Histoire", "La guerre a pris fin en février 1991 après l'opération Tempête du désert menée par une coalition internationale contre l'Irak."),
            en = LocalizedContent("In which year did the First Gulf War end?", listOf("1990", "1991", "1992", "1993"), "History", "The war ended in February 1991 after Operation Desert Storm led by an international coalition against Iraq."),
            zh = LocalizedContent("第一次海湾战争在哪一年结束？", listOf("1990", "1991", "1992", "1993"), "历史", "战争于1991年2月结束，此前国际联盟对伊拉克发动了沙漠风暴行动。"),
            es = LocalizedContent("¿En qué año terminó la Primera Guerra del Golfo?", listOf("1990", "1991", "1992", "1993"), "Historia", "La guerra terminó en febrero de 1991 tras la Operación Tormenta del Desierto liderada por una coalición internacional contra Irak.")
        ),
        BilingualQuestion(
            id = 9484, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a commandé les forces de la Coalition pendant la Première Guerre du Golfe?", listOf("Norman Schwarzkopf", "Colin Powell", "Tommy Franks", "David Petraeus"), "Histoire", "Le général américain Norman Schwarzkopf a dirigé les forces de la Coalition internationale lors de l'opération Tempête du désert en 1991, qui visait à libérer le Koweït de l'invasion irakienne."),
            en = LocalizedContent("Who commanded the Coalition forces during the First Gulf War?", listOf("Norman Schwarzkopf", "Colin Powell", "Tommy Franks", "David Petraeus"), "History", "American General Norman Schwarzkopf led the international Coalition forces during Operation Desert Storm in 1991, which aimed to liberate Kuwait from the Iraqi invasion."),
            zh = LocalizedContent("第一次海湾战争期间谁指挥了联军？", listOf("诺曼·施瓦茨科普夫", "科林·鲍威尔", "汤米·弗兰克斯", "戴维·彼得雷乌斯"), "历史", "美国将军诺曼·施瓦茨科普夫在1991年的沙漠风暴行动中领导了国际联军，旨在从伊拉克入侵中解放科威特。"),
            es = LocalizedContent("¿Quién comandó las fuerzas de la Coalición durante la Primera Guerra del Golfo?", listOf("Norman Schwarzkopf", "Colin Powell", "Tommy Franks", "David Petraeus"), "Historia", "El general estadounidense Norman Schwarzkopf dirigió las fuerzas de la Coalición internacional durante la Operación Tormenta del Desierto en 1991, cuyo objetivo era liberar Kuwait de la invasión iraquí.")
        ),
        BilingualQuestion(
            id = 9485, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année la Seconde Intifada a-t-elle commencé?", listOf("1998", "1999", "2000", "2001"), "Histoire", "La Seconde Intifada, un soulèvement palestinien contre l'occupation israélienne, a débuté en septembre 2000 après la visite d'Ariel Sharon sur l'esplanade des Mosquées à Jérusalem."),
            en = LocalizedContent("In which year did the Second Intifada begin?", listOf("1998", "1999", "2000", "2001"), "History", "The Second Intifada, a Palestinian uprising against Israeli occupation, began in September 2000 after Ariel Sharon's visit to the Temple Mount in Jerusalem."),
            zh = LocalizedContent("第二次起义在哪一年开始？", listOf("1998", "1999", "2000", "2001"), "历史", "第二次起义是巴勒斯坦人反对以色列占领的起义，于2000年9月在阿里埃勒·沙龙访问耶路撒冷圣殿山后开始。"),
            es = LocalizedContent("¿En qué año comenzó la Segunda Intifada?", listOf("1998", "1999", "2000", "2001"), "Historia", "La Segunda Intifada, un levantamiento palestino contra la ocupación israelí, comenzó en septiembre de 2000 tras la visita de Ariel Sharon a la Explanada de las Mezquitas en Jerusalén.")
        ),
        BilingualQuestion(
            id = 9486, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("En quelle année les attentats du 11 septembre ont-ils eu lieu?", listOf("1999", "2000", "2001", "2002"), "Histoire", "Les attentats du 11 septembre 2001 ont été perpétrés par le réseau terroriste Al-Qaïda contre les États-Unis, ciblant les tours jumelles du World Trade Center et le Pentagone."),
            en = LocalizedContent("In which year did the September 11 attacks occur?", listOf("1999", "2000", "2001", "2002"), "History", "The September 11, 2001 attacks were perpetrated by the terrorist network Al-Qaeda against the United States, targeting the Twin Towers of the World Trade Center and the Pentagon."),
            zh = LocalizedContent("9·11袭击发生在哪一年？", listOf("1999", "2000", "2001", "2002"), "历史", "2001年9月11日的袭击是由恐怖组织基地组织对美国实施的，目标是世界贸易中心的双子塔和五角大楼。"),
            es = LocalizedContent("¿En qué año ocurrieron los atentados del 11 de septiembre?", listOf("1999", "2000", "2001", "2002"), "Historia", "Los atentados del 11 de septiembre de 2001 fueron perpetrados por la red terrorista Al-Qaeda contra Estados Unidos, atacando las Torres Gemelas del World Trade Center y el Pentágono.")
        ),
        BilingualQuestion(
            id = 9487, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui était responsable des attentats du 11 septembre?", listOf("Al-Qaïda", "Oussama ben Laden", "Taliban", "Mujahidines"), "Histoire", "Al-Qaïda, dirigée par Oussama ben Laden, a revendiqué les attentats du 11 septembre 2001 contre les États-Unis, perpétrés par 19 pirates de l'air liés au réseau."),
            en = LocalizedContent("Who was responsible for the September 11 attacks?", listOf("Al-Qaeda", "Osama bin Laden", "Taliban", "Mujahideen"), "History", "Al-Qaeda, led by Osama bin Laden, claimed responsibility for the September 11, 2001 attacks against the United States, carried out by 19 hijackers linked to the network."),
            zh = LocalizedContent("谁对9·11袭击负责？", listOf("基地组织", "奥萨马·本·拉登", "塔利班", "圣战者"), "历史", "由奥萨马·本·拉登领导的基地组织声称对2001年9月11日针对美国的袭击负责，该袭击由与该网络有关的19名劫机者实施。"),
            es = LocalizedContent("¿Quién fue responsable de los atentados del 11 de septiembre?", listOf("Al-Qaeda", "Osama bin Laden", "Talibán", "Muyahidines"), "Historia", "Al-Qaeda, liderada por Osama bin Laden, reivindicó los atentados del 11 de septiembre de 2001 contra Estados Unidos, perpetrados por 19 secuestradores vinculados a la red.")
        ),
        BilingualQuestion(
            id = 9488, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("En quelle année la Deuxième Guerre du Golfe a-t-elle commencé?", listOf("2001", "2002", "2003", "2004"), "Histoire", "L'invasion de l'Irak par une coalition menée par les États-Unis a débuté le 20 mars 2003, marquant le début officiel de la Deuxième Guerre du Golfe."),
            en = LocalizedContent("In which year did the Second Gulf War begin?", listOf("2001", "2002", "2003", "2004"), "History", "The invasion of Iraq by a US-led coalition began on March 20, 2003, marking the official start of the Second Gulf War."),
            zh = LocalizedContent("第二次海湾战争在哪一年开始？", listOf("2001", "2002", "2003", "2004"), "历史", "美国领导的联军入侵伊拉克于2003年3月20日开始，标志着第二次海湾战争的正式开始。"),
            es = LocalizedContent("¿En qué año comenzó la Segunda Guerra del Golfo?", listOf("2001", "2002", "2003", "2004"), "Historia", "La invasión de Irak por una coalición liderada por Estados Unidos comenzó el 20 de marzo de 2003, marcando el inicio oficial de la Segunda Guerra del Golfo.")
        ),
        BilingualQuestion(
            id = 9489, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel était le prétexte de la Deuxième Guerre du Golfe?", listOf("Les armes de destruction massive", "Le soutien du terrorisme", "L'invasion de l'Iran", "La crise du Koweït"), "Histoire", "Les États-Unis et leurs alliés ont justifié l'invasion de l'Irak en 2003 en accusant Saddam Hussein de posséder des armes de destruction massive, une menace jamais confirmée."),
            en = LocalizedContent("What was the pretext for the Second Gulf War?", listOf("Weapons of mass destruction", "Support for terrorism", "Invasion of Iran", "Kuwait crisis"), "History", "The United States and its allies justified the invasion of Iraq in 2003 by accusing Saddam Hussein of possessing weapons of mass destruction, a threat that was never confirmed."),
            zh = LocalizedContent("第二次海湾战争的借口是什么？", listOf("大规模杀伤性武器", "支持恐怖主义", "入侵伊朗", "科威特危机"), "历史", "美国及其盟友以萨达姆·侯赛因拥有大规模杀伤性武器为由，为2003年入侵伊拉克辩护，这一威胁从未得到证实。"),
            es = LocalizedContent("¿Cuál fue el pretexto de la Segunda Guerra del Golfo?", listOf("Armas de destrucción masiva", "Apoyo al terrorismo", "Invasión de Irán", "Crisis de Kuwait"), "Historia", "Estados Unidos y sus aliados justificaron la invasión de Irak en 2003 acusando a Saddam Hussein de poseer armas de destrucción masiva, una amenaza que nunca se confirmó.")
        ),
        BilingualQuestion(
            id = 9490, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a commandé les forces de la Coalition pendant la Deuxième Guerre du Golfe?", listOf("Norman Schwarzkopf", "Tommy Franks", "David Petraeus", "George Casey"), "Histoire", "Le général Tommy Franks commandait le Commandement central des États-Unis, supervisant les opérations militaires américaines et alliées lors de l'invasion de l'Irak en 2003."),
            en = LocalizedContent("Who commanded the Coalition forces during the Second Gulf War?", listOf("Norman Schwarzkopf", "Tommy Franks", "David Petraeus", "George Casey"), "History", "General Tommy Franks commanded the United States Central Command, overseeing American and allied military operations during the 2003 invasion of Iraq."),
            zh = LocalizedContent("第二次海湾战争期间谁指挥了联军？", listOf("诺曼·施瓦茨科普夫", "汤米·弗兰克斯", "戴维·彼得雷乌斯", "乔治·凯西"), "历史", "汤米·弗兰克斯将军指挥美国中央司令部，在2003年入侵伊拉克期间监督美国及盟军的军事行动。"),
            es = LocalizedContent("¿Quién comandó las fuerzas de la Coalición durante la Segunda Guerra del Golfo?", listOf("Norman Schwarzkopf", "Tommy Franks", "David Petraeus", "George Casey"), "Historia", "El general Tommy Franks comandó el Comando Central de Estados Unidos, supervisando las operaciones militares estadounidenses y aliadas durante la invasión de Irak en 2003.")
        ),
        BilingualQuestion(
            id = 9491, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année Saddam Hussein a-t-il été arrêté?", listOf("2002", "2003", "2004", "2005"), "Histoire", "Saddam Hussein a été capturé par les forces américaines le 13 décembre 2003 lors de l'opération Red Dawn, près de Tikrit, en Irak."),
            en = LocalizedContent("In what year was Saddam Hussein arrested?", listOf("2002", "2003", "2004", "2005"), "History", "Saddam Hussein was captured by American forces on December 13, 2003, during Operation Red Dawn, near Tikrit, Iraq."),
            zh = LocalizedContent("萨达姆·侯赛因在哪一年被捕？", listOf("2002", "2003", "2004", "2005"), "历史", "萨达姆·侯赛因于2003年12月13日在伊拉克提克里特附近被美军在“红色黎明行动”中抓获。"),
            es = LocalizedContent("¿En qué año fue arrestado Saddam Hussein?", listOf("2002", "2003", "2004", "2005"), "Historia", "Saddam Hussein fue capturado por las fuerzas estadounidenses el 13 de diciembre de 2003 durante la Operación Amanecer Rojo, cerca de Tikrit, Irak.")
        ),
        BilingualQuestion(
            id = 9492, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année Saddam Hussein a-t-il été exécuté?", listOf("2004", "2005", "2006", "2007"), "Histoire", "Saddam Hussein, ancien président irakien, a été exécuté par pendaison le 30 décembre 2006 après avoir été condamné pour crimes contre l'humanité liés au massacre de 148 chiites à Dujail en 1982."),
            en = LocalizedContent("In what year was Saddam Hussein executed?", listOf("2004", "2005", "2006", "2007"), "History", "Saddam Hussein, former Iraqi president, was executed by hanging on December 30, 2006, after being convicted of crimes against humanity related to the massacre of 148 Shia Muslims in Dujail in 1982."),
            zh = LocalizedContent("萨达姆·侯赛因在哪一年被处决？", listOf("2004", "2005", "2006", "2007"), "历史", "伊拉克前总统萨达姆·侯赛因因1982年在杜贾尔村屠杀148名什叶派穆斯林被判反人类罪，于2006年12月30日被处以绞刑。"),
            es = LocalizedContent("¿En qué año fue ejecutado Saddam Hussein?", listOf("2004", "2005", "2006", "2007"), "Historia", "Saddam Hussein, expresidente iraquí, fue ejecutado en la horca el 30 de diciembre de 2006 tras ser condenado por crímenes de lesa humanidad relacionados con la masacre de 148 chiíes en Dujail en 1982.")
        ),
        BilingualQuestion(
            id = 9493, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année la Chute du Mur de Berlin a-t-elle été officialisée?", listOf("1989", "1990", "1991", "1992"), "Histoire", "Le mur de Berlin est tombé le 9 novembre 1989, marquant la fin de la division de l'Allemagne et un tournant dans la guerre froide."),
            en = LocalizedContent("In what year was the fall of the Berlin Wall made official?", listOf("1989", "1990", "1991", "1992"), "History", "The Berlin Wall fell on November 9, 1989, marking the end of Germany's division and a turning point in the Cold War."),
            zh = LocalizedContent("柏林墙倒塌在哪一年被正式确认？", listOf("1989", "1990", "1991", "1992"), "历史", "柏林墙于1989年11月9日倒塌，标志着德国分裂的结束和冷战的一个转折点。"),
            es = LocalizedContent("¿En qué año se oficializó la caída del Muro de Berlín?", listOf("1989", "1990", "1991", "1992"), "Historia", "El Muro de Berlín cayó el 9 de noviembre de 1989, marcando el fin de la división de Alemania y un punto de inflexión en la Guerra Fría.")
        ),
        BilingualQuestion(
            id = 9494, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année la Constitution de la Troisième République a-t-elle été établie?", listOf("1870", "1871", "1875", "1876"), "Histoire", "Les lois constitutionnelles de 1875 ont mis en place la Troisième République, qui a duré jusqu'en 1940. Cette constitution a été adoptée après la chute du Second Empire et la défaite de 1870."),
            en = LocalizedContent("In what year was the Constitution of the Third Republic established?", listOf("1870", "1871", "1875", "1876"), "History", "The constitutional laws of 1875 established the Third Republic, which lasted until 1940. This constitution was adopted after the fall of the Second Empire and the defeat of 1870."),
            zh = LocalizedContent("第三共和国宪法在哪一年确立？", listOf("1870", "1871", "1875", "1876"), "历史", "1875年的宪法法律确立了第三共和国，该共和国一直持续到1940年。这部宪法是在第二帝国垮台和1870年战败后通过的。"),
            es = LocalizedContent("¿En qué año se estableció la Constitución de la Tercera República?", listOf("1870", "1871", "1875", "1876"), "Historia", "Las leyes constitucionales de 1875 establecieron la Tercera República, que duró hasta 1940. Esta constitución fue adoptada tras la caída del Segundo Imperio y la derrota de 1870.")
        ),
        BilingualQuestion(
            id = 9495, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel pharaon a établi le Nouvel Empire égyptien?", listOf("Amenhotep Ier", "Thoutmosis Ier", "Ahmosis", "Karnak"), "Histoire", "Ahmosis Ier a chassé les Hyksôs d'Égypte et réunifié le pays, fondant ainsi la XVIIIe dynastie et inaugurant la période du Nouvel Empire."),
            en = LocalizedContent("Which pharaoh established the Egyptian New Kingdom?", listOf("Amenhotep I", "Thutmose I", "Ahmose", "Karnak"), "History", "Ahmose I expelled the Hyksos from Egypt and reunified the country, thus founding the 18th Dynasty and inaugurating the New Kingdom period."),
            zh = LocalizedContent("哪位法老建立了埃及新王国？", listOf("阿蒙霍特普一世", "图特摩斯一世", "雅赫摩斯", "卡纳克"), "历史", "雅赫摩斯一世将希克索斯人逐出埃及并重新统一国家，从而建立了第十八王朝，开启了新王国时期。"),
            es = LocalizedContent("¿Qué faraón estableció el Imperio Nuevo egipcio?", listOf("Amenhotep I", "Tutmosis I", "Ahmose", "Karnak"), "Historia", "Ahmose I expulsó a los hicsos de Egipto y reunificó el país, fundando así la dinastía XVIII e inaugurando el período del Imperio Nuevo.")
        ),
        BilingualQuestion(
            id = 9496, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année l'Empire des Achéménides a-t-il été fondé?", listOf("700 avant J.C.", "600 avant J.C.", "550 avant J.C.", "500 avant J.C."), "Histoire", "L'Empire achéménide a été fondé vers 550 av. J.-C. par Cyrus le Grand après sa révolte contre l'Empire mède."),
            en = LocalizedContent("In what year was the Achaemenid Empire founded?", listOf("700 BC", "600 BC", "550 BC", "500 BC"), "History", "The Achaemenid Empire was founded around 550 BC by Cyrus the Great after his revolt against the Median Empire."),
            zh = LocalizedContent("阿契美尼德帝国在哪一年建立？", listOf("公元前700年", "公元前600年", "公元前550年", "公元前500年"), "历史", "阿契美尼德帝国大约在公元前550年由居鲁士大帝在反抗米底帝国后建立。"),
            es = LocalizedContent("¿En qué año se fundó el Imperio aqueménida?", listOf("700 a.C.", "600 a.C.", "550 a.C.", "500 a.C."), "Historia", "El Imperio aqueménida fue fundado alrededor del 550 a.C. por Ciro el Grande tras su revuelta contra el Imperio medo.")
        ),
        BilingualQuestion(
            id = 9497, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a fondé l'Empire des Achéménides?", listOf("Cyrus II", "Darius Ier", "Xerxès Ier", "Artaxerxès"), "Histoire", "Cyrus II, dit Cyrus le Grand, a unifié les tribus perses et conquis les Mèdes, la Lydie et Babylone pour fonder le premier empire perse au VIe siècle av. J.-C."),
            en = LocalizedContent("Who founded the Achaemenid Empire?", listOf("Cyrus II", "Darius I", "Xerxes I", "Artaxerxes"), "History", "Cyrus II, known as Cyrus the Great, united the Persian tribes and conquered the Medes, Lydia, and Babylon to found the first Persian Empire in the 6th century BC."),
            zh = LocalizedContent("谁建立了阿契美尼德帝国？", listOf("居鲁士二世", "大流士一世", "薛西斯一世", "阿尔塔薛西斯"), "历史", "居鲁士二世，即居鲁士大帝，统一了波斯部落，征服了米底、吕底亚和巴比伦，在公元前6世纪建立了第一个波斯帝国。"),
            es = LocalizedContent("¿Quién fundó el Imperio aqueménida?", listOf("Ciro II", "Darío I", "Jerjes I", "Artajerjes"), "Historia", "Ciro II, conocido como Ciro el Grande, unificó las tribus persas y conquistó a los medos, Lidia y Babilonia para fundar el primer imperio persa en el siglo VI a.C.")
        ),
        BilingualQuestion(
            id = 9498, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année le Règne de Périclès a-t-il commencé?", listOf("461 avant J.C.", "455 avant J.C.", "450 avant J.C.", "445 avant J.C."), "Histoire", "Périclès devient le principal dirigeant d'Athènes en 461 avant J.C., marquant le début de l'âge d'or athénien."),
            en = LocalizedContent("In what year did the Age of Pericles begin?", listOf("461 BC", "455 BC", "450 BC", "445 BC"), "History", "Pericles became the leading statesman of Athens in 461 BC, marking the beginning of the Athenian Golden Age."),
            zh = LocalizedContent("伯里克利时代在哪一年开始？", listOf("公元前461年", "公元前455年", "公元前450年", "公元前445年"), "历史", "伯里克利于公元前461年成为雅典的主要领导人，标志着雅典黄金时代的开始。"),
            es = LocalizedContent("¿En qué año comenzó el Siglo de Pericles?", listOf("461 a.C.", "455 a.C.", "450 a.C.", "445 a.C."), "Historia", "Pericles se convirtió en el principal estadista de Atenas en el 461 a.C., marcando el inicio de la Edad de Oro ateniense.")
        ),
        BilingualQuestion(
            id = 9499, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année Périclès est-il mort?", listOf("430 avant J.C.", "429 avant J.C.", "428 avant J.C.", "427 avant J.C."), "Histoire", "Périclès, stratège et homme d'État majeur d'Athènes, est mort en 430 avant J.-C., victime de la peste qui ravageait la ville durant la guerre du Péloponnèse."),
            en = LocalizedContent("In what year did Pericles die?", listOf("430 BC", "429 BC", "428 BC", "427 BC"), "History", "Pericles, a major Athenian statesman and general, died in 430 BC, a victim of the plague that ravaged the city during the Peloponnesian War."),
            zh = LocalizedContent("伯里克利在哪一年去世？", listOf("公元前430年", "公元前429年", "公元前428年", "公元前427年"), "历史", "伯里克利，雅典重要的政治家和将军，于公元前430年去世，死于伯罗奔尼撒战争期间肆虐雅典的瘟疫。"),
            es = LocalizedContent("¿En qué año murió Pericles?", listOf("430 a.C.", "429 a.C.", "428 a.C.", "427 a.C."), "Historia", "Pericles, importante estadista y general ateniense, murió en el 430 a.C., víctima de la peste que asoló la ciudad durante la Guerra del Peloponeso.")
        ),
        BilingualQuestion(
            id = 9500, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que la viscosité d'un fluide ?", listOf("Résistance à l'écoulement", "Densité du fluide", "Pression du fluide", "Température de fusion"), "Science", ""),
            en = LocalizedContent("What is the viscosity of a fluid?", listOf("Resistance to flow", "Fluid density", "Fluid pressure", "Melting temperature"), "Science", ""),
            zh = LocalizedContent("什么是流体的粘度？", listOf("抵抗流动的能力", "流体密度", "流体压力", "熔化温度"), "科学", ""),
            es = LocalizedContent("¿Qué es la viscosidad de un fluido?", listOf("Resistencia al flujo", "Densidad del fluido", "Presión del fluido", "Temperatura de fusión"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 9501, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qu'est-ce que l'effet de Coriolis ?", listOf("Déviation des mouvements due à la rotation de la Terre", "Courant marin", "Typhon tropicaux", "Vents solaires"), "Science", ""),
            en = LocalizedContent("What is the Coriolis effect?", listOf("Deviation of movements due to Earth's rotation", "Ocean current", "Tropical typhoon", "Solar winds"), "Science", ""),
            zh = LocalizedContent("什么是科里奥利效应？", listOf("由于地球自转引起的运动偏转", "洋流", "热带台风", "太阳风"), "科学", ""),
            es = LocalizedContent("¿Qué es el efecto Coriolis?", listOf("Desviación de movimientos debido a la rotación de la Tierra", "Corriente marina", "Tifón tropical", "Vientos solares"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 9502, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le symbole chimique du cuivre ?", listOf("Cu", "Co", "Cr", "Cs"), "Science", ""),
            en = LocalizedContent("What is the chemical symbol for copper?", listOf("Cu", "Co", "Cr", "Cs"), "Science", ""),
            zh = LocalizedContent("铜的化学符号是什么？", listOf("Cu", "Co", "Cr", "Cs"), "科学", ""),
            es = LocalizedContent("¿Cuál es el símbolo químico del cobre?", listOf("Cu", "Co", "Cr", "Cs"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 9503, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qu'est-ce que la pression de vapeur saturante ?", listOf("Pression d'équilibre entre liquide et vapeur", "Pression atmosphérique maximale", "Pression d'un gaz comprimé", "Pression à l'ébullition uniquement"), "Science", ""),
            en = LocalizedContent("What is saturated vapor pressure?", listOf("Equilibrium pressure between liquid and vapor", "Maximum atmospheric pressure", "Pressure of compressed gas", "Pressure only at boiling"), "Science", ""),
            zh = LocalizedContent("什么是饱和蒸气压？", listOf("液体和蒸气之间的平衡压力", "最大大气压", "压缩气体的压力", "仅在沸腾时的压力"), "科学", ""),
            es = LocalizedContent("¿Qué es la presión de vapor saturado?", listOf("Presión de equilibrio entre líquido y vapor", "Presión atmosférica máxima", "Presión de un gas comprimido", "Presión solo en ebullición"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 9504, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est l'élément le plus abondant dans l'univers ?", listOf("Hydrogène", "Hélium", "Oxygène", "Carbone"), "Science", ""),
            en = LocalizedContent("What is the most abundant element in the universe?", listOf("Hydrogen", "Helium", "Oxygen", "Carbon"), "Science", ""),
            zh = LocalizedContent("宇宙中最丰富的元素是什么？", listOf("氢", "氦", "氧", "碳"), "科学", ""),
            es = LocalizedContent("¿Cuál es el elemento más abundante en el universo?", listOf("Hidrógeno", "Helio", "Oxígeno", "Carbono"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 9505, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce qu'une onde électromagnétique ?", listOf("Perturbation des champs électrique et magnétique se propageant", "Son à haute fréquence", "Vibration des atomes", "Onde sonore intense"), "Science", ""),
            en = LocalizedContent("What is an electromagnetic wave?", listOf("Propagating disturbance of electric and magnetic fields", "High frequency sound", "Vibration of atoms", "Intense sound wave"), "Science", ""),
            zh = LocalizedContent("什么是电磁波？", listOf("电场和磁场的传播扰动", "高频声音", "原子振动", "强声波"), "科学", ""),
            es = LocalizedContent("¿Qué es una onda electromagnética?", listOf("Perturbación de campos eléctrico y magnético que se propaga", "Sonido de alta frecuencia", "Vibración de átomos", "Onda sonora intensa"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 9506, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le principal composant de l'air que nous respirons ?", listOf("Azote (78%)", "Oxygène (21%)", "CO₂ (0,04%)", "Argon (0,9%)"), "Science", ""),
            en = LocalizedContent("What is the main component of the air we breathe?", listOf("Nitrogen (78%)", "Oxygen (21%)", "CO₂ (0.04%)", "Argon (0.9%)"), "Science", ""),
            zh = LocalizedContent("我们呼吸的空气的主要成分是什么？", listOf("氮气（78%）", "氧气（21%）", "二氧化碳（0.04%）", "氩气（0.9%）"), "科学", ""),
            es = LocalizedContent("¿Cuál es el componente principal del aire que respiramos?", listOf("Nitrógeno (78%)", "Oxígeno (21%)", "CO₂ (0.04%)", "Argón (0.9%)"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 9507, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel phénomène physique explique le fonctionnement des panneaux solaires ?", listOf("L'effet photoélectrique", "La fusion nucléaire", "La fluorescence", "La thermoélectricité"), "Science", ""),
            en = LocalizedContent("What physical phenomenon explains the operation of solar panels?", listOf("The photoelectric effect", "Nuclear fusion", "Fluorescence", "Thermoelectricity"), "Science", ""),
            zh = LocalizedContent("什么物理现象解释了太阳能电池板的工作原理？", listOf("光电效应", "核聚变", "荧光", "热电效应"), "科学", ""),
            es = LocalizedContent("¿Qué fenómeno físico explica el funcionamiento de los paneles solares?", listOf("El efecto fotoeléctrico", "La fusión nuclear", "La fluorescencia", "La termoelectricidad"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 9508, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que la loi de Boyle-Mariotte ?", listOf("À température constante, pression × volume = constante pour un gaz parfait", "Les gaz se dilatent avec la chaleur", "La pression augmente avec la température", "Volume et température sont proportionnels"), "Science", ""),
            en = LocalizedContent("What is Boyle's law?", listOf("At constant temperature, pressure × volume = constant for an ideal gas", "Gases expand with heat", "Pressure increases with temperature", "Volume and temperature are proportional"), "Science", ""),
            zh = LocalizedContent("什么是玻意耳定律？", listOf("在恒定温度下，理想气体的压力×体积为常数", "气体受热膨胀", "压力随温度升高而增加", "体积和温度成正比"), "科学", ""),
            es = LocalizedContent("¿Qué es la ley de Boyle?", listOf("A temperatura constante, presión × volumen = constante para un gas ideal", "Los gases se expanden con el calor", "La presión aumenta con la temperatura", "Volumen y temperatura son proporcionales"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 9509, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le rôle des ribosomes dans la cellule ?", listOf("Synthétiser les protéines", "Produire de l'énergie", "Décomposer les déchets", "Transporter les nutriments"), "Science", ""),
            en = LocalizedContent("What is the role of ribosomes in the cell?", listOf("Synthesize proteins", "Produce energy", "Break down waste", "Transport nutrients"), "Science", ""),
            zh = LocalizedContent("核糖体在细胞中的作用是什么？", listOf("合成蛋白质", "产生能量", "分解废物", "运输营养物质"), "科学", ""),
            es = LocalizedContent("¿Cuál es el papel de los ribosomas en la célula?", listOf("Sintetizar proteínas", "Producir energía", "Descomponer desechos", "Transportar nutrientes"), "Ciencia", "")
        ),
    )

    private fun part2(): List<BilingualQuestion> = listOf(
        BilingualQuestion(
            id = 9510, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que la liaison covalente ?", listOf("Partage d'électrons entre deux atomes", "Transfert d'électrons", "Force d'attraction ionique", "Liaison hydrogène"), "Science", ""),
            en = LocalizedContent("What is a covalent bond?", listOf("Sharing of electrons between two atoms", "Transfer of electrons", "Ionic attraction force", "Hydrogen bond"), "Science", ""),
            zh = LocalizedContent("什么是共价键？", listOf("两个原子之间共享电子", "电子转移", "离子吸引力", "氢键"), "科学", ""),
            es = LocalizedContent("¿Qué es el enlace covalente?", listOf("Compartición de electrones entre dos átomos", "Transferencia de electrones", "Fuerza de atracción iónica", "Enlace de hidrógeno"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 9511, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel gaz est produit lors de la respiration cellulaire ?", listOf("CO₂ (dioxyde de carbone)", "O₂ (oxygène)", "N₂ (azote)", "CH₄ (méthane)"), "Science", ""),
            en = LocalizedContent("Which gas is produced during cellular respiration?", listOf("CO₂ (carbon dioxide)", "O₂ (oxygen)", "N₂ (nitrogen)", "CH₄ (methane)"), "Science", ""),
            zh = LocalizedContent("细胞呼吸过程中产生哪种气体？", listOf("CO₂（二氧化碳）", "O₂（氧气）", "N₂（氮气）", "CH₄（甲烷）"), "科学", ""),
            es = LocalizedContent("¿Qué gas se produce durante la respiración celular?", listOf("CO₂ (dióxido de carbono)", "O₂ (oxígeno)", "N₂ (nitrógeno)", "CH₄ (metano)"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 9512, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le point d'ébullition de l'eau à pression atmosphérique normale ?", listOf("100°C", "90°C", "110°C", "95°C"), "Science", ""),
            en = LocalizedContent("What is the boiling point of water at normal atmospheric pressure?", listOf("100°C", "90°C", "110°C", "95°C"), "Science", ""),
            zh = LocalizedContent("在标准大气压下，水的沸点是多少？", listOf("100°C", "90°C", "110°C", "95°C"), "科学", ""),
            es = LocalizedContent("¿Cuál es el punto de ebullición del agua a presión atmosférica normal?", listOf("100°C", "90°C", "110°C", "95°C"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 9513, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que la polarité d'une molécule ?", listOf("Distribution inégale des charges électriques dans la molécule", "Charge totale de la molécule", "Solubilité dans l'eau", "Réactivité chimique"), "Science", ""),
            en = LocalizedContent("What is the polarity of a molecule?", listOf("Uneven distribution of electrical charges in the molecule", "Total charge of the molecule", "Solubility in water", "Chemical reactivity"), "Science", ""),
            zh = LocalizedContent("什么是分子的极性？", listOf("分子中电荷分布不均匀", "分子的总电荷", "在水中的溶解度", "化学反应性"), "科学", ""),
            es = LocalizedContent("¿Qué es la polaridad de una molécula?", listOf("Distribución desigual de las cargas eléctricas en la molécula", "Carga total de la molécula", "Solubilidad en agua", "Reactividad química"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 9514, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le principe de l'effet serre naturel ?", listOf("Les gaz atmosphériques absorbent et réémettent la chaleur", "La chaleur solaire est directement absorbée par le sol", "Les nuages bloquent la chaleur", "La Terre génère sa propre chaleur"), "Science", ""),
            en = LocalizedContent("What is the principle of the natural greenhouse effect?", listOf("Atmospheric gases absorb and re-emit heat", "Solar heat is directly absorbed by the ground", "Clouds block heat", "The Earth generates its own heat"), "Science", ""),
            zh = LocalizedContent("自然温室效应的原理是什么？", listOf("大气气体吸收并重新辐射热量", "太阳热量直接被地面吸收", "云层阻挡热量", "地球自身产生热量"), "科学", ""),
            es = LocalizedContent("¿Cuál es el principio del efecto invernadero natural?", listOf("Los gases atmosféricos absorben y reemiten el calor", "El calor solar es absorbido directamente por el suelo", "Las nubes bloquean el calor", "La Tierra genera su propio calor"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 9515, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que la demi-vie d'un isotope radioactif ?", listOf("Temps pour que la moitié des atomes se désintègrent", "Temps de vie d'un atome", "Période entre deux émissions", "Énergie émise par désintégration"), "Science", ""),
            en = LocalizedContent("What is the half-life of a radioactive isotope?", listOf("Time for half of the atoms to decay", "Lifetime of an atom", "Period between two emissions", "Energy emitted by decay"), "Science", ""),
            zh = LocalizedContent("放射性同位素的半衰期是什么？", listOf("一半原子衰变所需的时间", "一个原子的寿命", "两次发射之间的时间", "衰变释放的能量"), "科学", ""),
            es = LocalizedContent("¿Qué es la vida media de un isótopo radiactivo?", listOf("Tiempo para que la mitad de los átomos se desintegren", "Vida de un átomo", "Período entre dos emisiones", "Energía emitida por desintegración"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 9516, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le symbole chimique de l'azote ?", listOf("N", "Az", "Ni", "Na"), "Science", ""),
            en = LocalizedContent("What is the chemical symbol for nitrogen?", listOf("N", "Az", "Ni", "Na"), "Science", ""),
            zh = LocalizedContent("氮的化学符号是什么？", listOf("N", "Az", "Ni", "Na"), "科学", ""),
            es = LocalizedContent("¿Cuál es el símbolo químico del nitrógeno?", listOf("N", "Az", "Ni", "Na"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 9517, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qu'est-ce que la thermodynamique étudie ?", listOf("Relations entre chaleur, travail et énergie", "Température des matériaux", "Transfert de chaleur uniquement", "Propriétés des gaz uniquement"), "Science", ""),
            en = LocalizedContent("What does thermodynamics study?", listOf("Relations between heat, work, and energy", "Temperature of materials", "Heat transfer only", "Properties of gases only"), "Science", ""),
            zh = LocalizedContent("热力学研究什么？", listOf("热、功和能量之间的关系", "材料的温度", "仅热传递", "仅气体性质"), "科学", ""),
            es = LocalizedContent("¿Qué estudia la termodinámica?", listOf("Relaciones entre calor, trabajo y energía", "Temperatura de los materiales", "Transferencia de calor únicamente", "Propiedades de los gases únicamente"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 9518, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le principe de conservation de la quantité de mouvement ?", listOf("La quantité de mouvement totale d'un système isolé est constante", "La vitesse est toujours conservée", "La masse ne change pas", "L'énergie cinétique est conservée"), "Science", ""),
            en = LocalizedContent("What is the principle of conservation of momentum?", listOf("The total momentum of an isolated system is constant", "Velocity is always conserved", "Mass does not change", "Kinetic energy is conserved"), "Science", ""),
            zh = LocalizedContent("动量守恒原理是什么？", listOf("孤立系统的总动量保持不变", "速度总是守恒的", "质量不变", "动能守恒"), "科学", ""),
            es = LocalizedContent("¿Cuál es el principio de conservación de la cantidad de movimiento?", listOf("La cantidad de movimiento total de un sistema aislado es constante", "La velocidad siempre se conserva", "La masa no cambia", "La energía cinética se conserva"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 9519, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que la capillarité ?", listOf("Montée d'un liquide dans un tube fin contre la gravité", "Pression dans un tuyau", "Vaporisation de l'eau", "Osmose dans les plantes"), "Science", ""),
            en = LocalizedContent("What is capillarity?", listOf("Rise of a liquid in a thin tube against gravity", "Pressure in a pipe", "Vaporization of water", "Osmosis in plants"), "Science", ""),
            zh = LocalizedContent("什么是毛细现象？", listOf("液体在细管中克服重力上升", "管道中的压力", "水的蒸发", "植物中的渗透作用"), "科学", ""),
            es = LocalizedContent("¿Qué es la capilaridad?", listOf("Ascenso de un líquido en un tubo fino contra la gravedad", "Presión en una tubería", "Vaporización del agua", "Ósmosis en las plantas"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 9520, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel général romain a traversé le Rubicon pour marcher sur Rome ?", listOf("Jules César (49 av. J.-C.)", "Pompée", "Marius", "Sylla"), "Histoire", ""),
            en = LocalizedContent("Which Roman general crossed the Rubicon to march on Rome?", listOf("Julius Caesar (49 BC)", "Pompey", "Marius", "Sulla"), "History", ""),
            zh = LocalizedContent("哪位罗马将军渡过卢比孔河向罗马进军？", listOf("尤利乌斯·凯撒（公元前49年）", "庞培", "马略", "苏拉"), "历史", ""),
            es = LocalizedContent("¿Qué general romano cruzó el Rubicón para marchar sobre Roma?", listOf("Julio César (49 a.C.)", "Pompeyo", "Mario", "Sila"), "Historia", "")
        ),
        BilingualQuestion(
            id = 9521, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le nom de la plaine où se déroula la bataille de Waterloo ?", listOf("La plaine de Waterloo (Belgique)", "La plaine de Wagram", "La campagne de Russie", "La plaine de Leipzig"), "Histoire", ""),
            en = LocalizedContent("What is the name of the plain where the Battle of Waterloo took place?", listOf("The plain of Waterloo (Belgium)", "The plain of Wagram", "The Russian campaign", "The plain of Leipzig"), "History", ""),
            zh = LocalizedContent("滑铁卢战役发生在哪片平原？", listOf("滑铁卢平原（比利时）", "瓦格拉姆平原", "俄罗斯战役", "莱比锡平原"), "历史", ""),
            es = LocalizedContent("¿Cuál es el nombre de la llanura donde tuvo lugar la batalla de Waterloo?", listOf("La llanura de Waterloo (Bélgica)", "La llanura de Wagram", "La campaña de Rusia", "La llanura de Leipzig"), "Historia", "")
        ),
        BilingualQuestion(
            id = 9522, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("En quelle année les États-Unis sont-ils entrés dans la Seconde Guerre mondiale ?", listOf("1941 (Pearl Harbor)", "1939", "1942", "1940"), "Histoire", ""),
            en = LocalizedContent("In which year did the United States enter World War II?", listOf("1941 (Pearl Harbor)", "1939", "1942", "1940"), "History", ""),
            zh = LocalizedContent("美国在哪一年加入第二次世界大战？", listOf("1941年（珍珠港事件）", "1939年", "1942年", "1940年"), "历史", ""),
            es = LocalizedContent("¿En qué año entró Estados Unidos en la Segunda Guerra Mundial?", listOf("1941 (Pearl Harbor)", "1939", "1942", "1940"), "Historia", "")
        ),
        BilingualQuestion(
            id = 9523, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui était la 'reine des Amazones' selon la mythologie grecque ?", listOf("Hippolyte", "Thémistokle", "Antiope", "Penthésilée"), "Histoire", ""),
            en = LocalizedContent("Who was the 'queen of the Amazons' according to Greek mythology?", listOf("Hippolyta", "Themistokle", "Antiope", "Penthesilea"), "History", ""),
            zh = LocalizedContent("根据希腊神话，谁是“亚马逊女王”？", listOf("希波吕忒", "特米斯托克勒", "安提奥佩", "彭忒西勒亚"), "历史", ""),
            es = LocalizedContent("¿Quién fue la 'reina de las amazonas' según la mitología griega?", listOf("Hipólita", "Temístocles", "Antíope", "Pentesilea"), "Historia", "")
        ),
        BilingualQuestion(
            id = 9524, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel empire a dominé les Indes de 1526 à 1857 ?", listOf("L'Empire moghol", "L'Empire britanique", "L'Empire perse", "L'Empire ottoman"), "Histoire", ""),
            en = LocalizedContent("Which empire dominated India from 1526 to 1857?", listOf("The Mughal Empire", "The British Empire", "The Persian Empire", "The Ottoman Empire"), "History", ""),
            zh = LocalizedContent("哪个帝国从1526年到1857年统治了印度？", listOf("莫卧儿帝国", "大英帝国", "波斯帝国", "奥斯曼帝国"), "历史", ""),
            es = LocalizedContent("¿Qué imperio dominó la India de 1526 a 1857?", listOf("El Imperio mogol", "El Imperio británico", "El Imperio persa", "El Imperio otomano"), "Historia", "")
        ),
        BilingualQuestion(
            id = 9525, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année la France est-elle devenue une République pour la première fois ?", listOf("1792 (Première République)", "1789", "1793", "1799"), "Histoire", ""),
            en = LocalizedContent("In which year did France become a Republic for the first time?", listOf("1792 (First Republic)", "1789", "1793", "1799"), "History", ""),
            zh = LocalizedContent("法国在哪一年首次成为共和国？", listOf("1792年（第一共和国）", "1789年", "1793年", "1799年"), "历史", ""),
            es = LocalizedContent("¿En qué año se convirtió Francia en República por primera vez?", listOf("1792 (Primera República)", "1789", "1793", "1799"), "Historia", "")
        ),
        BilingualQuestion(
            id = 9526, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le nom du plan nazi d'extermination des Juifs ?", listOf("La Solution Finale (Endlösung)", "Le Plan de Berlin", "L'Opération Nacht und Nebel", "L'Ordre noir"), "Histoire", ""),
            en = LocalizedContent("What is the name of the Nazi plan for the extermination of Jews?", listOf("The Final Solution (Endlösung)", "The Berlin Plan", "Operation Nacht und Nebel", "The Black Order"), "History", ""),
            zh = LocalizedContent("纳粹灭绝犹太人的计划叫什么？", listOf("最终解决方案（Endlösung）", "柏林计划", "夜雾行动", "黑色秩序"), "历史", ""),
            es = LocalizedContent("¿Cuál es el nombre del plan nazi para el exterminio de los judíos?", listOf("La Solución Final (Endlösung)", "El Plan de Berlín", "La Operación Nacht und Nebel", "La Orden Negra"), "Historia", "")
        ),
        BilingualQuestion(
            id = 9527, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui a inventé l'imprimerie à caractères mobiles en Europe ?", listOf("Johannes Gutenberg (vers 1440)", "Roger Bacon", "Léonard de Vinci", "William Caxton"), "Histoire", ""),
            en = LocalizedContent("Who invented the printing press with movable type in Europe?", listOf("Johannes Gutenberg (around 1440)", "Roger Bacon", "Leonardo da Vinci", "William Caxton"), "History", ""),
            zh = LocalizedContent("谁在欧洲发明了活字印刷术？", listOf("约翰内斯·古腾堡（约1440年）", "罗杰·培根", "列奥纳多·达·芬奇", "威廉·卡克斯顿"), "历史", ""),
            es = LocalizedContent("¿Quién inventó la imprenta de tipos móviles en Europa?", listOf("Johannes Gutenberg (alrededor de 1440)", "Roger Bacon", "Leonardo da Vinci", "William Caxton"), "Historia", "")
        ),
        BilingualQuestion(
            id = 9528, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel traité a mis fin à la guerre franco-prussienne de 1870-71 ?", listOf("Traité de Francfort (1871)", "Traité de Versailles", "Armistice de Bordeaux", "Traité de Paris"), "Histoire", ""),
            en = LocalizedContent("Which treaty ended the Franco-Prussian War of 1870-71?", listOf("Treaty of Frankfurt (1871)", "Treaty of Versailles", "Armistice of Bordeaux", "Treaty of Paris"), "History", ""),
            zh = LocalizedContent("哪项条约结束了1870-71年的普法战争？", listOf("法兰克福条约（1871年）", "凡尔赛条约", "波尔多停战协定", "巴黎条约"), "历史", ""),
            es = LocalizedContent("¿Qué tratado puso fin a la guerra franco-prusiana de 1870-71?", listOf("Tratado de Fráncfort (1871)", "Tratado de Versalles", "Armisticio de Burdeos", "Tratado de París"), "Historia", "")
        ),
        BilingualQuestion(
            id = 9529, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le nom de la première constitution écrite de l'histoire moderne ?", listOf("Constitution des États-Unis (1787)", "Magna Carta (1215)", "Constitution française (1791)", "Constitution polonaise (1791)"), "Histoire", ""),
            en = LocalizedContent("What is the name of the first written constitution in modern history?", listOf("United States Constitution (1787)", "Magna Carta (1215)", "French Constitution (1791)", "Polish Constitution (1791)"), "History", ""),
            zh = LocalizedContent("现代历史上第一部成文宪法叫什么？", listOf("美国宪法（1787年）", "大宪章（1215年）", "法国宪法（1791年）", "波兰宪法（1791年）"), "历史", ""),
            es = LocalizedContent("¿Cuál es el nombre de la primera constitución escrita de la historia moderna?", listOf("Constitución de los Estados Unidos (1787)", "Carta Magna (1215)", "Constitución francesa (1791)", "Constitución polaca (1791)"), "Historia", "")
        ),
        BilingualQuestion(
            id = 9530, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année s'est terminée la guerre d'Indochine française ?", listOf("1954 (accords de Genève)", "1950", "1956", "1960"), "Histoire", ""),
            en = LocalizedContent("In which year did the French Indochina War end?", listOf("1954 (Geneva Accords)", "1950", "1956", "1960"), "History", ""),
            zh = LocalizedContent("法国印度支那战争在哪一年结束？", listOf("1954年（日内瓦协议）", "1950年", "1956年", "1960年"), "历史", ""),
            es = LocalizedContent("¿En qué año terminó la guerra de Indochina francesa?", listOf("1954 (Acuerdos de Ginebra)", "1950", "1956", "1960"), "Historia", "")
        ),
        BilingualQuestion(
            id = 9531, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel fleuve sépare la France de l'Allemagne sur une partie de leur frontière ?", listOf("Le Rhin", "La Moselle", "La Sarre", "Le Main"), "Géographie", ""),
            en = LocalizedContent("Which river separates France from Germany along part of their border?", listOf("The Rhine", "The Moselle", "The Saar", "The Main"), "Geography", ""),
            zh = LocalizedContent("哪条河流在部分边界上分隔法国和德国？", listOf("莱茵河", "摩泽尔河", "萨尔河", "美因河"), "地理", ""),
            es = LocalizedContent("¿Qué río separa Francia de Alemania en una parte de su frontera?", listOf("El Rin", "El Mosela", "El Sarre", "El Meno"), "Geografía", "")
        ),
        BilingualQuestion(
            id = 9532, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quelle mer se trouve entre l'Ukraine et la Russie ?", listOf("La mer d'Azov", "La mer Noire", "La mer Caspienne", "La mer Baltique"), "Géographie", ""),
            en = LocalizedContent("Which sea lies between Ukraine and Russia?", listOf("Sea of Azov", "Black Sea", "Caspian Sea", "Baltic Sea"), "Geography", ""),
            zh = LocalizedContent("哪个海位于乌克兰和俄罗斯之间？", listOf("亚速海", "黑海", "里海", "波罗的海"), "地理", ""),
            es = LocalizedContent("¿Qué mar se encuentra entre Ucrania y Rusia?", listOf("Mar de Azov", "Mar Negro", "Mar Caspio", "Mar Báltico"), "Geografía", "")
        ),
        BilingualQuestion(
            id = 9533, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel pays est surnommé 'le pays du matin calme' ?", listOf("Corée (du Sud)", "Japon", "Chine", "Thaïlande"), "Géographie", ""),
            en = LocalizedContent("Which country is nicknamed 'the land of the morning calm'?", listOf("Korea (South)", "Japan", "China", "Thailand"), "Geography", ""),
            zh = LocalizedContent("哪个国家被称为“晨静之国”？", listOf("韩国", "日本", "中国", "泰国"), "地理", ""),
            es = LocalizedContent("¿Qué país es apodado 'el país de la calma matutina'?", listOf("Corea (del Sur)", "Japón", "China", "Tailandia"), "Geografía", "")
        ),
        BilingualQuestion(
            id = 9534, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Dans quel pays se trouve la ville de Québec ?", listOf("Canada", "États-Unis", "France", "Belgique"), "Géographie", ""),
            en = LocalizedContent("In which country is the city of Quebec located?", listOf("Canada", "United States", "France", "Belgium"), "Geography", ""),
            zh = LocalizedContent("魁北克市位于哪个国家？", listOf("加拿大", "美国", "法国", "比利时"), "地理", ""),
            es = LocalizedContent("¿En qué país se encuentra la ciudad de Quebec?", listOf("Canadá", "Estados Unidos", "Francia", "Bélgica"), "Geografía", "")
        ),
        BilingualQuestion(
            id = 9535, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plus grand port d'Europe par tonnage ?", listOf("Rotterdam (Pays-Bas)", "Anvers (Belgique)", "Hambourg (Allemagne)", "Marseille (France)"), "Géographie", ""),
            en = LocalizedContent("What is the largest port in Europe by tonnage?", listOf("Rotterdam (Netherlands)", "Antwerp (Belgium)", "Hamburg (Germany)", "Marseille (France)"), "Geography", ""),
            zh = LocalizedContent("按吨位计算，欧洲最大的港口是哪个？", listOf("鹿特丹（荷兰）", "安特卫普（比利时）", "汉堡（德国）", "马赛（法国）"), "地理", ""),
            es = LocalizedContent("¿Cuál es el puerto más grande de Europa por tonelaje?", listOf("Róterdam (Países Bajos)", "Amberes (Bélgica)", "Hamburgo (Alemania)", "Marsella (Francia)"), "Geografía", "")
        ),
        BilingualQuestion(
            id = 9536, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("La capitale du Chili est...", listOf("Valparaíso", "Santiago", "Concepción", "Valdivia"), "Géographie", "Santiago est la capitale du Chili car elle concentre les institutions politiques et administratives du pays depuis sa fondation en 1541."),
            en = LocalizedContent("The capital of Chile is...", listOf("Valparaíso", "Santiago", "Concepción", "Valdivia"), "Geography", "Santiago is the capital of Chile because it has concentrated the country's political and administrative institutions since its foundation in 1541."),
            zh = LocalizedContent("智利的首都是...", listOf("瓦尔帕莱索", "圣地亚哥", "康塞普西翁", "瓦尔迪维亚"), "地理", "圣地亚哥是智利的首都，因为自1541年建城以来，它集中了该国的政治和行政机构。"),
            es = LocalizedContent("La capital de Chile es...", listOf("Valparaíso", "Santiago", "Concepción", "Valdivia"), "Geografía", "Santiago es la capital de Chile porque concentra las instituciones políticas y administrativas del país desde su fundación en 1541.")
        ),
        BilingualQuestion(
            id = 9537, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Dans quel pays se trouve le mont Everest du côté nord ?", listOf("Tibet (Chine)", "Népal", "Inde", "Bhoutan"), "Géographie", ""),
            en = LocalizedContent("In which country is the north side of Mount Everest located?", listOf("Tibet (China)", "Nepal", "India", "Bhutan"), "Geography", ""),
            zh = LocalizedContent("珠穆朗玛峰的北坡位于哪个国家？", listOf("西藏（中国）", "尼泊尔", "印度", "不丹"), "地理", ""),
            es = LocalizedContent("¿En qué país se encuentra la cara norte del Monte Everest?", listOf("Tíbet (China)", "Nepal", "India", "Bután"), "Geografía", "")
        ),
        BilingualQuestion(
            id = 9538, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quelle est la capitale de l'Islande ?", listOf("Reykjavik", "Akureyri", "Hafnarfjörður", "Selfoss"), "Géographie", ""),
            en = LocalizedContent("What is the capital of Iceland?", listOf("Reykjavik", "Akureyri", "Hafnarfjörður", "Selfoss"), "Geography", ""),
            zh = LocalizedContent("冰岛的首都是什么？", listOf("雷克雅未克", "阿克雷里", "哈夫纳菲厄泽", "塞尔福斯"), "地理", ""),
            es = LocalizedContent("¿Cuál es la capital de Islandia?", listOf("Reikiavik", "Akureyri", "Hafnarfjörður", "Selfoss"), "Geografía", "")
        ),
        BilingualQuestion(
            id = 9539, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus petit pays d'Asie ?", listOf("Maldives (298 km²)", "Singapour", "Bahreïn", "Brunei"), "Géographie", ""),
            en = LocalizedContent("What is the smallest country in Asia?", listOf("Maldives (298 km²)", "Singapore", "Bahrain", "Brunei"), "Geography", ""),
            zh = LocalizedContent("亚洲最小的国家是哪个？", listOf("马尔代夫（298平方公里）", "新加坡", "巴林", "文莱"), "地理", ""),
            es = LocalizedContent("¿Cuál es el país más pequeño de Asia?", listOf("Maldivas (298 km²)", "Singapur", "Baréin", "Brunéi"), "Geografía", "")
        ),
        BilingualQuestion(
            id = 9540, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quelle est la capitale du Chili ?", listOf("Santiago", "Valparaíso", "Concepción", "La Serena"), "Géographie", ""),
            en = LocalizedContent("What is the capital of Chile?", listOf("Santiago", "Valparaíso", "Concepción", "La Serena"), "Geography", ""),
            zh = LocalizedContent("智利的首都是什么？", listOf("圣地亚哥", "瓦尔帕莱索", "康塞普西翁", "拉塞雷纳"), "地理", ""),
            es = LocalizedContent("¿Cuál es la capital de Chile?", listOf("Santiago", "Valparaíso", "Concepción", "La Serena"), "Geografia", "")
        ),
        BilingualQuestion(
            id = 9541, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Dans quel pays se trouvent les villes de Bruges et Gand ?", listOf("Belgique", "Pays-Bas", "France", "Luxembourg"), "Géographie", ""),
            en = LocalizedContent("In which country are the cities of Bruges and Ghent located?", listOf("Belgium", "Netherlands", "France", "Luxembourg"), "Geography", ""),
            zh = LocalizedContent("布鲁日和根特位于哪个国家？", listOf("比利时", "荷兰", "法国", "卢森堡"), "地理", ""),
            es = LocalizedContent("¿En qué país se encuentran las ciudades de Brujas y Gante?", listOf("Bélgica", "Países Bajos", "Francia", "Luxemburgo"), "Geografia", "")
        ),
        BilingualQuestion(
            id = 9542, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le nom de l'archipel portugais dans l'Atlantique Nord ?", listOf("Açores", "Madère", "Canaries (espagnoles)", "Cap-Vert (indépendant)"), "Géographie", ""),
            en = LocalizedContent("What is the name of the Portuguese archipelago in the North Atlantic?", listOf("Azores", "Madeira", "Canary Islands (Spanish)", "Cape Verde (independent)"), "Geography", ""),
            zh = LocalizedContent("北大西洋中的葡萄牙群岛叫什么名字？", listOf("亚速尔群岛", "马德拉群岛", "加那利群岛（西班牙）", "佛得角（独立）"), "地理", ""),
            es = LocalizedContent("¿Cuál es el nombre del archipiélago portugués en el Atlántico Norte?", listOf("Azores", "Madeira", "Canarias (españolas)", "Cabo Verde (independiente)"), "Geografia", "")
        ),
        BilingualQuestion(
            id = 9543, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quelle est la plus grande ville d'Amérique du Sud ?", listOf("São Paulo", "Buenos Aires", "Lima", "Rio de Janeiro"), "Géographie", ""),
            en = LocalizedContent("What is the largest city in South America?", listOf("São Paulo", "Buenos Aires", "Lima", "Rio de Janeiro"), "Geography", ""),
            zh = LocalizedContent("南美洲最大的城市是哪个？", listOf("圣保罗", "布宜诺斯艾利斯", "利马", "里约热内卢"), "地理", ""),
            es = LocalizedContent("¿Cuál es la ciudad más grande de América del Sur?", listOf("São Paulo", "Buenos Aires", "Lima", "Río de Janeiro"), "Geografia", "")
        ),
        BilingualQuestion(
            id = 9544, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Dans quel pays se trouve la ville de Katmandou ?", listOf("Népal", "Bhoutan", "Inde", "Tibet"), "Géographie", ""),
            en = LocalizedContent("In which country is the city of Kathmandu located?", listOf("Nepal", "Bhutan", "India", "Tibet"), "Geography", ""),
            zh = LocalizedContent("加德满都位于哪个国家？", listOf("尼泊尔", "不丹", "印度", "西藏"), "地理", ""),
            es = LocalizedContent("¿En qué país se encuentra la ciudad de Katmandú?", listOf("Nepal", "Bután", "India", "Tíbet"), "Geografia", "")
        ),
        BilingualQuestion(
            id = 9545, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui a écrit 'Les Confessions' au XVIIIe siècle ?", listOf("Jean-Jacques Rousseau", "Voltaire", "Denis Diderot", "Montesquieu"), "Culture", ""),
            en = LocalizedContent("Who wrote 'The Confessions' in the 18th century?", listOf("Jean-Jacques Rousseau", "Voltaire", "Denis Diderot", "Montesquieu"), "Culture", ""),
            zh = LocalizedContent("18世纪谁写了《忏悔录》？", listOf("让-雅克·卢梭", "伏尔泰", "德尼·狄德罗", "孟德斯鸠"), "文化", ""),
            es = LocalizedContent("¿Quién escribió 'Las confesiones' en el siglo XVIII?", listOf("Jean-Jacques Rousseau", "Voltaire", "Denis Diderot", "Montesquieu"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 9546, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel roman de Stendhal se passe en Italie ?", listOf("La Chartreuse de Parme", "Le Rouge et le Noir", "Lucien Leuwen", "Rome, Naples et Florence"), "Culture", ""),
            en = LocalizedContent("Which novel by Stendhal is set in Italy?", listOf("The Charterhouse of Parma", "The Red and the Black", "Lucien Leuwen", "Rome, Naples and Florence"), "Culture", ""),
            zh = LocalizedContent("司汤达的哪部小说以意大利为背景？", listOf("帕尔马修道院", "红与黑", "吕西安·娄凡", "罗马、那不勒斯和佛罗伦萨"), "文化", ""),
            es = LocalizedContent("¿Qué novela de Stendhal transcurre en Italia?", listOf("La cartuja de Parma", "Rojo y negro", "Lucien Leuwen", "Roma, Nápoles y Florencia"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 9547, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui est l'auteur de 'Le Monde selon Garp' ?", listOf("John Irving", "Philip Roth", "John Updike", "Don DeLillo"), "Culture", ""),
            en = LocalizedContent("Who is the author of 'The World According to Garp'?", listOf("John Irving", "Philip Roth", "John Updike", "Don DeLillo"), "Culture", ""),
            zh = LocalizedContent("《盖普眼中的世界》的作者是谁？", listOf("约翰·欧文", "菲利普·罗斯", "约翰·厄普代克", "唐·德里罗"), "文化", ""),
            es = LocalizedContent("¿Quién es el autor de 'El mundo según Garp'?", listOf("John Irving", "Philip Roth", "John Updike", "Don DeLillo"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 9548, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel compositeur américain est connu pour 'Rhapsody in Blue' ?", listOf("George Gershwin", "Leonard Bernstein", "Aaron Copland", "Samuel Barber"), "Culture", ""),
            en = LocalizedContent("Which American composer is known for 'Rhapsody in Blue'?", listOf("George Gershwin", "Leonard Bernstein", "Aaron Copland", "Samuel Barber"), "Culture", ""),
            zh = LocalizedContent("哪位美国作曲家以《蓝色狂想曲》闻名？", listOf("乔治·格什温", "伦纳德·伯恩斯坦", "阿隆·科普兰", "塞缪尔·巴伯"), "文化", ""),
            es = LocalizedContent("¿Qué compositor estadounidense es conocido por 'Rhapsody in Blue'?", listOf("George Gershwin", "Leonard Bernstein", "Aaron Copland", "Samuel Barber"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 9549, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui a peint 'American Gothic' (l'homme à la fourche) ?", listOf("Grant Wood", "Edward Hopper", "Andrew Wyeth", "Norman Rockwell"), "Culture", ""),
            en = LocalizedContent("Who painted 'American Gothic' (the man with the pitchfork)?", listOf("Grant Wood", "Edward Hopper", "Andrew Wyeth", "Norman Rockwell"), "Culture", ""),
            zh = LocalizedContent("谁画了《美国哥特式》（拿干草叉的男人）？", listOf("格兰特·伍德", "爱德华·霍珀", "安德鲁·怀斯", "诺曼·洛克威尔"), "文化", ""),
            es = LocalizedContent("¿Quién pintó 'American Gothic' (el hombre con la horca)?", listOf("Grant Wood", "Edward Hopper", "Andrew Wyeth", "Norman Rockwell"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 9550, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel auteur a écrit 'Solaris' ?", listOf("Stanisław Lem", "Isaac Asimov", "Philip K. Dick", "Arthur C. Clarke"), "Culture", ""),
            en = LocalizedContent("Which author wrote 'Solaris'?", listOf("Stanisław Lem", "Isaac Asimov", "Philip K. Dick", "Arthur C. Clarke"), "Culture", ""),
            zh = LocalizedContent("哪位作者写了《索拉里斯星》？", listOf("斯坦尼斯瓦夫·莱姆", "艾萨克·阿西莫夫", "菲利普·K·迪克", "阿瑟·C·克拉克"), "文化", ""),
            es = LocalizedContent("¿Qué autor escribió 'Solaris'?", listOf("Stanisław Lem", "Isaac Asimov", "Philip K. Dick", "Arthur C. Clarke"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 9551, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel monument parisien était à l'origine une prison royale ?", listOf("La Bastille (détruite)", "La Conciergerie", "La Tour Saint-Jacques", "Les Invalides"), "Culture", ""),
            en = LocalizedContent("Which Parisian monument was originally a royal prison?", listOf("The Bastille (destroyed)", "La Conciergerie", "Tour Saint-Jacques", "Les Invalides"), "Culture", ""),
            zh = LocalizedContent("巴黎的哪座纪念碑最初是一座皇家监狱？", listOf("巴士底狱（已毁）", "巴黎古监狱", "圣雅克塔", "荣军院"), "文化", ""),
            es = LocalizedContent("¿Qué monumento parisino fue originalmente una prisión real?", listOf("La Bastilla (destruida)", "La Conciergerie", "La Torre Saint-Jacques", "Los Inválidos"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 9552, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui a écrit 'La Nausée' (1938) ?", listOf("Jean-Paul Sartre", "Albert Camus", "Simone de Beauvoir", "André Malraux"), "Culture", ""),
            en = LocalizedContent("Who wrote 'Nausea' (1938)?", listOf("Jean-Paul Sartre", "Albert Camus", "Simone de Beauvoir", "André Malraux"), "Culture", ""),
            zh = LocalizedContent("谁写了《恶心》（1938年）？", listOf("让-保罗·萨特", "阿尔贝·加缪", "西蒙娜·德·波伏娃", "安德烈·马尔罗"), "文化", ""),
            es = LocalizedContent("¿Quién escribió 'La náusea' (1938)?", listOf("Jean-Paul Sartre", "Albert Camus", "Simone de Beauvoir", "André Malraux"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 9553, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel opéra de Mozart est une comédie sur deux couples ?", listOf("Così fan tutte", "Les Noces de Figaro", "Don Giovanni", "La Flûte enchantée"), "Culture", ""),
            en = LocalizedContent("Which Mozart opera is a comedy about two couples?", listOf("Così fan tutte", "The Marriage of Figaro", "Don Giovanni", "The Magic Flute"), "Culture", ""),
            zh = LocalizedContent("莫扎特的哪部歌剧是关于两对情侣的喜剧？", listOf("女人心", "费加罗的婚礼", "唐·乔瓦尼", "魔笛"), "文化", ""),
            es = LocalizedContent("¿Qué ópera de Mozart es una comedia sobre dos parejas?", listOf("Così fan tutte", "Las bodas de Fígaro", "Don Giovanni", "La flauta mágica"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 9554, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui a peint 'Le Fils de l'homme' (homme au chapeau melon avec pomme) ?", listOf("René Magritte", "Salvador Dalí", "Marcel Duchamp", "Max Ernst"), "Culture", ""),
            en = LocalizedContent("Who painted 'The Son of Man' (man in bowler hat with apple)?", listOf("René Magritte", "Salvador Dalí", "Marcel Duchamp", "Max Ernst"), "Culture", ""),
            zh = LocalizedContent("谁画了《人类之子》（戴圆顶礼帽、苹果遮脸的男人）？", listOf("勒内·马格利特", "萨尔瓦多·达利", "马塞尔·杜尚", "马克斯·恩斯特"), "文化", ""),
            es = LocalizedContent("¿Quién pintó 'El hijo del hombre' (hombre con bombín y manzana)?", listOf("René Magritte", "Salvador Dalí", "Marcel Duchamp", "Max Ernst"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 9555, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel auteur a écrit 'Fahrenheit 451' ?", listOf("Ray Bradbury", "George Orwell", "Aldous Huxley", "Philip K. Dick"), "Culture", ""),
            en = LocalizedContent("Which author wrote 'Fahrenheit 451'?", listOf("Ray Bradbury", "George Orwell", "Aldous Huxley", "Philip K. Dick"), "Culture", ""),
            zh = LocalizedContent("哪位作者写了《华氏451度》？", listOf("雷·布拉德伯里", "乔治·奥威尔", "奥尔德斯·赫胥黎", "菲利普·K·迪克"), "文化", ""),
            es = LocalizedContent("¿Qué autor escribió 'Fahrenheit 451'?", listOf("Ray Bradbury", "George Orwell", "Aldous Huxley", "Philip K. Dick"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 9556, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui est l'auteur de 'L'Écume des jours' ?", listOf("Boris Vian", "Raymond Queneau", "Georges Perec", "Marguerite Duras"), "Culture", ""),
            en = LocalizedContent("Who is the author of 'Froth on the Daydream'?", listOf("Boris Vian", "Raymond Queneau", "Georges Perec", "Marguerite Duras"), "Culture", ""),
            zh = LocalizedContent("《岁月的泡沫》的作者是谁？", listOf("鲍里斯·维安", "雷蒙·格诺", "乔治·佩雷克", "玛格丽特·杜拉斯"), "文化", ""),
            es = LocalizedContent("¿Quién es el autor de 'La espuma de los días'?", listOf("Boris Vian", "Raymond Queneau", "Georges Perec", "Marguerite Duras"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 9557, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel peintre est connu pour ses 'Girasoles' (tournesols) ?", listOf("Vincent van Gogh", "Paul Gauguin", "Henri Matisse", "Pierre-Auguste Renoir"), "Culture", ""),
            en = LocalizedContent("Which painter is known for his 'Sunflowers'?", listOf("Vincent van Gogh", "Paul Gauguin", "Henri Matisse", "Pierre-Auguste Renoir"), "Culture", ""),
            zh = LocalizedContent("哪位画家以《向日葵》闻名？", listOf("文森特·梵高", "保罗·高更", "亨利·马蒂斯", "皮埃尔-奥古斯特·雷诺阿"), "文化", ""),
            es = LocalizedContent("¿Qué pintor es conocido por sus 'Girasoles'?", listOf("Vincent van Gogh", "Paul Gauguin", "Henri Matisse", "Pierre-Auguste Renoir"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 9558, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui a composé 'Clair de lune' (Debussy ou autre ?) ?", listOf("Claude Debussy (Suite Bergamasque)", "Gabriel Fauré", "Frédéric Chopin", "Erik Satie"), "Culture", ""),
            en = LocalizedContent("Who composed 'Clair de Lune' (Debussy or other)?", listOf("Claude Debussy (Suite Bergamasque)", "Gabriel Fauré", "Frédéric Chopin", "Erik Satie"), "Culture", ""),
            zh = LocalizedContent("谁创作了《月光》（德彪西或其他）？", listOf("克劳德·德彪西（贝加莫组曲）", "加布里埃尔·福雷", "弗雷德里克·肖邦", "埃里克·萨蒂"), "文化", ""),
            es = LocalizedContent("¿Quién compuso 'Claro de luna' (¿Debussy u otro?)?", listOf("Claude Debussy (Suite bergamasque)", "Gabriel Fauré", "Frédéric Chopin", "Erik Satie"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 9559, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel auteur polonais a écrit 'Quo Vadis' ?", listOf("Henryk Sienkiewicz", "Bolesław Prus", "Władysław Reymont", "Adam Mickiewicz"), "Culture", ""),
            en = LocalizedContent("Which Polish author wrote 'Quo Vadis'?", listOf("Henryk Sienkiewicz", "Bolesław Prus", "Władysław Reymont", "Adam Mickiewicz"), "Culture", ""),
            zh = LocalizedContent("哪位波兰作者写了《你往何处去》？", listOf("亨利克·显克维奇", "博莱斯瓦夫·普鲁斯", "瓦迪斯瓦夫·雷蒙特", "亚当·密茨凯维奇"), "文化", ""),
            es = LocalizedContent("¿Qué autor polaco escribió 'Quo Vadis'?", listOf("Henryk Sienkiewicz", "Bolesław Prus", "Władysław Reymont", "Adam Mickiewicz"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 9560, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel film de 2019 a remporté la Palme d'or à Cannes ?", listOf("Parasite (Bong Joon-ho)", "Portrait de la jeune fille en feu", "It Must Be Heaven", "Les Misérables"), "Cinéma", ""),
            en = LocalizedContent("Which 2019 film won the Palme d'Or at Cannes?", listOf("Parasite (Bong Joon-ho)", "Portrait of a Lady on Fire", "It Must Be Heaven", "Les Misérables"), "Cinema", ""),
            zh = LocalizedContent("哪部2019年的电影获得了戛纳金棕榈奖？", listOf("寄生虫（奉俊昊）", "燃烧女子的肖像", "必是天堂", "悲惨世界"), "电影", ""),
            es = LocalizedContent("¿Qué película de 2019 ganó la Palma de Oro en Cannes?", listOf("Parásitos (Bong Joon-ho)", "Retrato de una mujer en llamas", "It Must Be Heaven", "Los miserables"), "Cine", "")
        ),
        BilingualQuestion(
            id = 9561, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui joue le personnage de Jack Sparrow dans 'Pirates des Caraïbes' ?", listOf("Johnny Depp", "Orlando Bloom", "Keira Knightley", "Geoffrey Rush"), "Cinéma", ""),
            en = LocalizedContent("Who plays the character Jack Sparrow in 'Pirates of the Caribbean'?", listOf("Johnny Depp", "Orlando Bloom", "Keira Knightley", "Geoffrey Rush"), "Cinema", ""),
            zh = LocalizedContent("在《加勒比海盗》中，谁饰演杰克·斯派罗船长？", listOf("约翰尼·德普", "奥兰多·布鲁姆", "凯拉·奈特莉", "杰弗里·拉什"), "电影", ""),
            es = LocalizedContent("¿Quién interpreta al personaje de Jack Sparrow en 'Piratas del Caribe'?", listOf("Johnny Depp", "Orlando Bloom", "Keira Knightley", "Geoffrey Rush"), "Cine", "")
        ),
        BilingualQuestion(
            id = 9562, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel film de 1980 de Kubrick est une adaptation de Stephen King ?", listOf("Shining (The Shining)", "A Clockwork Orange", "Eyes Wide Shut", "Full Metal Jacket"), "Cinéma", ""),
            en = LocalizedContent("Which 1980 Kubrick film is an adaptation of Stephen King?", listOf("The Shining", "A Clockwork Orange", "Eyes Wide Shut", "Full Metal Jacket"), "Cinema", ""),
            zh = LocalizedContent("库布里克1980年的哪部电影改编自斯蒂芬·金的作品？", listOf("闪灵", "发条橙", "大开眼戒", "全金属外壳"), "电影", ""),
            es = LocalizedContent("¿Qué película de Kubrick de 1980 es una adaptación de Stephen King?", listOf("El resplandor", "La naranja mecánica", "Eyes Wide Shut", "La chaqueta metálica"), "Cine", "")
        ),
        BilingualQuestion(
            id = 9563, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui a réalisé 'Mulholland Drive' (2001) ?", listOf("David Lynch", "David Fincher", "Tim Burton", "Joel Coen"), "Cinéma", ""),
            en = LocalizedContent("Who directed 'Mulholland Drive' (2001)?", listOf("David Lynch", "David Fincher", "Tim Burton", "Joel Coen"), "Cinema", ""),
            zh = LocalizedContent("谁执导了《穆赫兰道》（2001年）？", listOf("大卫·林奇", "大卫·芬奇", "蒂姆·伯顿", "乔尔·科恩"), "电影", ""),
            es = LocalizedContent("¿Quién dirigió 'Mulholland Drive' (2001)?", listOf("David Lynch", "David Fincher", "Tim Burton", "Joel Coen"), "Cine", "")
        ),
        BilingualQuestion(
            id = 9564, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Dans quel film Charlton Heston joue-t-il un chef juif dans la Rome antique ?", listOf("Ben-Hur", "Spartacus", "Quo Vadis", "The Ten Commandments"), "Cinéma", ""),
            en = LocalizedContent("In which film does Charlton Heston play a Jewish leader in ancient Rome?", listOf("Ben-Hur", "Spartacus", "Quo Vadis", "The Ten Commandments"), "Cinema", ""),
            zh = LocalizedContent("在哪部电影中，查尔顿·赫斯顿饰演古罗马的一位犹太领袖？", listOf("宾虚", "斯巴达克斯", "暴君焚城录", "十诫"), "电影", ""),
            es = LocalizedContent("¿En qué película Charlton Heston interpreta a un líder judío en la antigua Roma?", listOf("Ben-Hur", "Espartaco", "Quo Vadis", "Los diez mandamientos"), "Cine", "")
        ),
        BilingualQuestion(
            id = 9565, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel acteur joue le personnage de Rocky Balboa ?", listOf("Sylvester Stallone", "Arnold Schwarzenegger", "Bruce Willis", "Jean-Claude Van Damme"), "Cinéma", ""),
            en = LocalizedContent("Which actor plays the character Rocky Balboa?", listOf("Sylvester Stallone", "Arnold Schwarzenegger", "Bruce Willis", "Jean-Claude Van Damme"), "Cinema", ""),
            zh = LocalizedContent("哪位演员饰演洛奇·巴尔博亚这个角色？", listOf("西尔维斯特·史泰龙", "阿诺德·施瓦辛格", "布鲁斯·威利斯", "尚格·云顿"), "电影", ""),
            es = LocalizedContent("¿Qué actor interpreta al personaje de Rocky Balboa?", listOf("Sylvester Stallone", "Arnold Schwarzenegger", "Bruce Willis", "Jean-Claude Van Damme"), "Cine", "")
        ),
        BilingualQuestion(
            id = 9566, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel film d'animation Pixar explore le monde des défunts au Mexique ?", listOf("Coco", "Soul", "Turning Red", "Brave"), "Cinéma", ""),
            en = LocalizedContent("Which Pixar animated film explores the world of the dead in Mexico?", listOf("Coco", "Soul", "Turning Red", "Brave"), "Cinema", ""),
            zh = LocalizedContent("哪部皮克斯动画电影探索了墨西哥的亡灵世界？", listOf("寻梦环游记", "心灵奇旅", "青春变形记", "勇敢传说"), "电影", ""),
            es = LocalizedContent("¿Qué película animada de Pixar explora el mundo de los muertos en México?", listOf("Coco", "Soul", "Turning Red", "Brave"), "Cine", "")
        ),
        BilingualQuestion(
            id = 9567, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui joue le rôle de Katniss Everdeen dans 'Hunger Games' ?", listOf("Jennifer Lawrence", "Emma Watson", "Shailene Woodley", "Kristen Stewart"), "Cinéma", ""),
            en = LocalizedContent("Who plays the role of Katniss Everdeen in 'The Hunger Games'?", listOf("Jennifer Lawrence", "Emma Watson", "Shailene Woodley", "Kristen Stewart"), "Cinema", ""),
            zh = LocalizedContent("在《饥饿游戏》中，谁饰演凯特尼斯·伊夫狄恩？", listOf("詹妮弗·劳伦斯", "艾玛·沃特森", "谢琳·伍德蕾", "克里斯汀·斯图尔特"), "电影", ""),
            es = LocalizedContent("¿Quién interpreta el papel de Katniss Everdeen en 'Los juegos del hambre'?", listOf("Jennifer Lawrence", "Emma Watson", "Shailene Woodley", "Kristen Stewart"), "Cine", "")
        ),
        BilingualQuestion(
            id = 9568, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel film de James Cameron se passe sous l'eau sur un navire naufragé ?", listOf("Titanic", "The Abyss", "Avatar", "Aliens"), "Cinéma", ""),
            en = LocalizedContent("Which James Cameron film takes place underwater on a sunken ship?", listOf("Titanic", "The Abyss", "Avatar", "Aliens"), "Cinema", ""),
            zh = LocalizedContent("詹姆斯·卡梅隆的哪部电影发生在水下的一艘沉船上？", listOf("泰坦尼克号", "深渊", "阿凡达", "异形2"), "电影", ""),
            es = LocalizedContent("¿Qué película de James Cameron transcurre bajo el agua en un barco hundido?", listOf("Titanic", "The Abyss", "Avatar", "Aliens"), "Cine", "")
        ),
        BilingualQuestion(
            id = 9569, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui a réalisé 'Les Quatre Cents Coups' (1959) ?", listOf("François Truffaut", "Jean-Luc Godard", "Claude Chabrol", "Alain Resnais"), "Cinéma", ""),
            en = LocalizedContent("Who directed 'The 400 Blows' (1959)?", listOf("François Truffaut", "Jean-Luc Godard", "Claude Chabrol", "Alain Resnais"), "Cinema", ""),
            zh = LocalizedContent("谁执导了《四百击》（1959年）？", listOf("弗朗索瓦·特吕弗", "让-吕克·戈达尔", "克劳德·夏布洛尔", "阿伦·雷乃"), "电影", ""),
            es = LocalizedContent("¿Quién dirigió 'Los cuatrocientos golpes' (1959)?", listOf("François Truffaut", "Jean-Luc Godard", "Claude Chabrol", "Alain Resnais"), "Cine", "")
        ),
        BilingualQuestion(
            id = 9570, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record du monde du 200m masculin ?", listOf("19,19 s (Usain Bolt, 2009)", "19,30 s", "19,50 s", "19,78 s"), "Sport", ""),
            en = LocalizedContent("What is the men's 200m world record?", listOf("19.19 s (Usain Bolt, 2009)", "19.30 s", "19.50 s", "19.78 s"), "Sports", ""),
            zh = LocalizedContent("男子200米世界纪录是多少？", listOf("19.19秒（尤塞恩·博尔特，2009年）", "19.30秒", "19.50秒", "19.78秒"), "体育", ""),
            es = LocalizedContent("¿Cuál es el récord mundial de los 200 m masculinos?", listOf("19,19 s (Usain Bolt, 2009)", "19,30 s", "19,50 s", "19,78 s"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 9571, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Dans quel pays se trouve le Stade de Wembley ?", listOf("Angleterre (Londres)", "Pays de Galles", "Écosse", "Irlande"), "Sport", ""),
            en = LocalizedContent("In which country is Wembley Stadium located?", listOf("England (London)", "Wales", "Scotland", "Ireland"), "Sports", ""),
            zh = LocalizedContent("温布利球场位于哪个国家？", listOf("英格兰（伦敦）", "威尔士", "苏格兰", "爱尔兰"), "体育", ""),
            es = LocalizedContent("¿En qué país se encuentra el Estadio de Wembley?", listOf("Inglaterra (Londres)", "Gales", "Escocia", "Irlanda"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 9572, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quelle équipe de football a gagné la Ligue des Champions en 2024 ?", listOf("Real Madrid", "Manchester City", "Bayern Munich", "PSG"), "Sport", ""),
            en = LocalizedContent("Which football team won the Champions League in 2024?", listOf("Real Madrid", "Manchester City", "Bayern Munich", "PSG"), "Sports", ""),
            zh = LocalizedContent("哪支足球队赢得了2024年欧冠冠军？", listOf("皇家马德里", "曼彻斯特城", "拜仁慕尼黑", "巴黎圣日耳曼"), "体育", ""),
            es = LocalizedContent("¿Qué equipo de fútbol ganó la Liga de Campeones en 2024?", listOf("Real Madrid", "Manchester City", "Bayern Munich", "PSG"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 9573, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le poids d'un ballon de basketball NBA officiel ?", listOf("567-650 grammes", "400-450 grammes", "700-750 grammes", "500-550 grammes"), "Sport", ""),
            en = LocalizedContent("What is the weight of an official NBA basketball?", listOf("567-650 grams", "400-450 grams", "700-750 grams", "500-550 grams"), "Sports", ""),
            zh = LocalizedContent("NBA官方篮球的重量是多少？", listOf("567-650克", "400-450克", "700-750克", "500-550克"), "体育", ""),
            es = LocalizedContent("¿Cuál es el peso de un balón de baloncesto oficial de la NBA?", listOf("567-650 gramos", "400-450 gramos", "700-750 gramos", "500-550 gramos"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 9574, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Dans quel sport Laure Manaudou est-elle championne olympique ?", listOf("Natation (400m nage libre)", "Natation synchronisée", "Plongeon", "Water-polo"), "Sport", ""),
            en = LocalizedContent("In which sport is Laure Manaudou an Olympic champion?", listOf("Swimming (400m freestyle)", "Synchronized swimming", "Diving", "Water polo"), "Sports", ""),
            zh = LocalizedContent("洛尔·马纳多在哪个项目上是奥运冠军？", listOf("游泳（400米自由泳）", "花样游泳", "跳水", "水球"), "体育", ""),
            es = LocalizedContent("¿En qué deporte es Laure Manaudou campeona olímpica?", listOf("Natación (400 m estilo libre)", "Natación sincronizada", "Salto", "Waterpolo"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 9575, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Combien de matchs dure une saison régulière NBA ?", listOf("82 matchs", "72 matchs", "60 matchs", "100 matchs"), "Sport", ""),
            en = LocalizedContent("How many games are in an NBA regular season?", listOf("82 games", "72 games", "60 games", "100 games"), "Sports", ""),
            zh = LocalizedContent("NBA常规赛有多少场比赛？", listOf("82场", "72场", "60场", "100场"), "体育", ""),
            es = LocalizedContent("¿Cuántos partidos tiene una temporada regular de la NBA?", listOf("82 partidos", "72 partidos", "60 partidos", "100 partidos"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 9576, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le record mondial du 800m masculin ?", listOf("1:40.91 (David Rudisha, 2012)", "1:41.11 (Wilson Kipketer)", "1:42.58", "1:39.50"), "Sport", ""),
            en = LocalizedContent("What is the men's 800m world record?", listOf("1:40.91 (David Rudisha, 2012)", "1:41.11 (Wilson Kipketer)", "1:42.58", "1:39.50"), "Sports", ""),
            zh = LocalizedContent("男子800米世界纪录是多少？", listOf("1分40秒91（大卫·鲁迪沙，2012年）", "1分41秒11（威尔逊·基普凯特）", "1分42秒58", "1分39秒50"), "体育", ""),
            es = LocalizedContent("¿Cuál es el récord mundial de los 800 m masculinos?", listOf("1:40.91 (David Rudisha, 2012)", "1:41.11 (Wilson Kipketer)", "1:42.58", "1:39.50"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 9577, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Dans quel sport Renaud Lavillenie est-il champion olympique ?", listOf("Saut à la perche", "Saut en hauteur", "Saut en longueur", "Triple saut"), "Sport", ""),
            en = LocalizedContent("In which sport is Renaud Lavillenie an Olympic champion?", listOf("Pole vault", "High jump", "Long jump", "Triple jump"), "Sports", ""),
            zh = LocalizedContent("雷诺·拉维勒尼在哪个项目上是奥运冠军？", listOf("撑杆跳高", "跳高", "跳远", "三级跳远"), "体育", ""),
            es = LocalizedContent("¿En qué deporte es Renaud Lavillenie campeón olímpico?", listOf("Salto con pértiga", "Salto de altura", "Salto de longitud", "Triple salto"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 9578, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel pays a organisé la Coupe du monde de football 2014 ?", listOf("Brésil", "Allemagne", "Argentine", "Afrique du Sud"), "Sport", ""),
            en = LocalizedContent("Which country hosted the 2014 FIFA World Cup?", listOf("Brazil", "Germany", "Argentina", "South Africa"), "Sports", ""),
            zh = LocalizedContent("哪个国家举办了2014年世界杯？", listOf("巴西", "德国", "阿根廷", "南非"), "体育", ""),
            es = LocalizedContent("¿Qué país organizó la Copa Mundial de la FIFA 2014?", listOf("Brasil", "Alemania", "Argentina", "Sudáfrica"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 9579, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Combien de matchs dure une série en NBA (playoffs) ?", listOf("7 matchs maximum (meilleur de 7)", "5 matchs", "9 matchs", "3 matchs"), "Sport", ""),
            en = LocalizedContent("How many games are in an NBA playoff series?", listOf("7 games maximum (best of 7)", "5 games", "9 games", "3 games"), "Sports", ""),
            zh = LocalizedContent("NBA季后赛系列赛有多少场比赛？", listOf("最多7场（七局四胜）", "5场", "9场", "3场"), "体育", ""),
            es = LocalizedContent("¿Cuántos partidos tiene una serie de playoffs de la NBA?", listOf("7 partidos como máximo (al mejor de 7)", "5 partidos", "9 partidos", "3 partidos"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 9580, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qu'est-ce que le shadow DOM ?", listOf("Encapsulation du DOM dans les Web Components", "Copie cachée du DOM principal", "DOM rendu côté serveur", "DOM virtuel de React"), "Tech", ""),
            en = LocalizedContent("What is the shadow DOM?", listOf("DOM encapsulation in Web Components", "Hidden copy of the main DOM", "Server-side rendered DOM", "React virtual DOM"), "Technology", ""),
            zh = LocalizedContent("什么是影子 DOM？", listOf("Web 组件中的 DOM 封装", "主 DOM 的隐藏副本", "服务器端渲染的 DOM", "React 虚拟 DOM"), "科技", ""),
            es = LocalizedContent("¿Qué es el shadow DOM?", listOf("Encapsulación del DOM en los Web Components", "Copia oculta del DOM principal", "DOM renderizado del lado del servidor", "DOM virtual de React"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 9581, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est l'avantage de la programmation fonctionnelle pure ?", listOf("Prévisibilité, testabilité et absence d'effets de bord", "Rapidité d'exécution", "Facilité d'apprentissage", "Moins de code à écrire"), "Tech", ""),
            en = LocalizedContent("What is the advantage of pure functional programming?", listOf("Predictability, testability, and absence of side effects", "Execution speed", "Ease of learning", "Less code to write"), "Technology", ""),
            zh = LocalizedContent("纯函数式编程的优势是什么？", listOf("可预测性、可测试性和无副作用", "执行速度快", "易于学习", "编写更少的代码"), "科技", ""),
            es = LocalizedContent("¿Cuál es la ventaja de la programación funcional pura?", listOf("Previsibilidad, testabilidad y ausencia de efectos secundarios", "Rapidez de ejecución", "Facilidad de aprendizaje", "Menos código que escribir"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 9582, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que le hot reload en développement mobile ?", listOf("Mise à jour du code en temps réel sans redémarrer l'app", "Rechargement complet de l'application", "Test automatique au changement", "Déploiement automatique"), "Tech", ""),
            en = LocalizedContent("What is hot reload in mobile development?", listOf("Real-time code update without restarting the app", "Full application reload", "Automatic test on change", "Automatic deployment"), "Technology", ""),
            zh = LocalizedContent("移动开发中的热重载是什么？", listOf("无需重启应用即可实时更新代码", "完全重新加载应用", "更改时自动测试", "自动部署"), "科技", ""),
            es = LocalizedContent("¿Qué es el hot reload en el desarrollo móvil?", listOf("Actualización de código en tiempo real sin reiniciar la app", "Recarga completa de la aplicación", "Prueba automática al cambio", "Despliegue automático"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 9583, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le rôle du manifest dans une app Android ?", listOf("Déclarer les composants, permissions et métadonnées de l'app", "Stocker les ressources", "Définir la mise en page", "Configurer les tests"), "Tech", ""),
            en = LocalizedContent("What is the role of the manifest in an Android app?", listOf("Declare the app's components, permissions, and metadata", "Store resources", "Define the layout", "Configure tests"), "Technology", ""),
            zh = LocalizedContent("Android 应用中的清单文件的作用是什么？", listOf("声明应用的组件、权限和元数据", "存储资源", "定义布局", "配置测试"), "科技", ""),
            es = LocalizedContent("¿Cuál es el rol del manifest en una app Android?", listOf("Declarar los componentes, permisos y metadatos de la app", "Almacenar los recursos", "Definir el diseño", "Configurar las pruebas"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 9584, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que la sérialisation en informatique ?", listOf("Conversion d'un objet en format transmissible (JSON, XML, bytes)", "Compression des données", "Chiffrement des données", "Indexation des données"), "Tech", ""),
            en = LocalizedContent("What is serialization in computing?", listOf("Conversion of an object into a transmittable format (JSON, XML, bytes)", "Data compression", "Data encryption", "Data indexing"), "Technology", ""),
            zh = LocalizedContent("计算机中的序列化是什么？", listOf("将对象转换为可传输的格式（JSON、XML、字节）", "数据压缩", "数据加密", "数据索引"), "科技", ""),
            es = LocalizedContent("¿Qué es la serialización en informática?", listOf("Conversión de un objeto en un formato transmisible (JSON, XML, bytes)", "Compresión de datos", "Cifrado de datos", "Indexación de datos"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 9585, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le principe du lazy loading ?", listOf("Chargement des ressources uniquement quand nécessaire", "Chargement de toutes les ressources à l'avance", "Cache des ressources fréquentes", "Compression pour chargement rapide"), "Tech", ""),
            en = LocalizedContent("What is the principle of lazy loading?", listOf("Loading resources only when needed", "Loading all resources in advance", "Caching frequent resources", "Compression for fast loading"), "Technology", ""),
            zh = LocalizedContent("懒加载的原理是什么？", listOf("仅在需要时加载资源", "提前加载所有资源", "缓存常用资源", "压缩以加快加载"), "科技", ""),
            es = LocalizedContent("¿Cuál es el principio del lazy loading?", listOf("Carga de recursos solo cuando sea necesario", "Carga de todos los recursos por adelantado", "Caché de recursos frecuentes", "Compresión para carga rápida"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 9586, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce qu'un microcontrôleur ?", listOf("Puce intégrant CPU, mémoire et périphériques pour systèmes embarqués", "Processeur pour smartphones", "Carte graphique compacte", "Module réseau compact"), "Tech", ""),
            en = LocalizedContent("What is a microcontroller?", listOf("Chip integrating CPU, memory, and peripherals for embedded systems", "Processor for smartphones", "Compact graphics card", "Compact network module"), "Technology", ""),
            zh = LocalizedContent("什么是微控制器？", listOf("集成 CPU、内存和外设的芯片，用于嵌入式系统", "智能手机处理器", "紧凑型显卡", "紧凑型网络模块"), "科技", ""),
            es = LocalizedContent("¿Qué es un microcontrolador?", listOf("Chip que integra CPU, memoria y periféricos para sistemas embebidos", "Procesador para smartphones", "Tarjeta gráfica compacta", "Módulo de red compacto"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 9587, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le rôle du cache L1/L2 du processeur ?", listOf("Accélérer l'accès aux données fréquemment utilisées", "Stocker les données permanentes", "Gérer la RAM", "Calculer les graphiques"), "Tech", ""),
            en = LocalizedContent("What is the role of the processor's L1/L2 cache?", listOf("Speed up access to frequently used data", "Store permanent data", "Manage RAM", "Compute graphics"), "Technology", ""),
            zh = LocalizedContent("处理器 L1/L2 缓存的作用是什么？", listOf("加速对常用数据的访问", "存储永久数据", "管理 RAM", "计算图形"), "科技", ""),
            es = LocalizedContent("¿Cuál es el rol de la caché L1/L2 del procesador?", listOf("Acelerar el acceso a datos usados frecuentemente", "Almacenar datos permanentes", "Gestionar la RAM", "Calcular gráficos"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 9588, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qu'est-ce que la compilation just-in-time (JIT) ?", listOf("Compilation du bytecode en code machine au moment de l'exécution", "Compilation à l'avance", "Interprétation ligne par ligne", "Compilation partielle"), "Tech", ""),
            en = LocalizedContent("What is just-in-time (JIT) compilation?", listOf("Compilation of bytecode into machine code at runtime", "Ahead-of-time compilation", "Line-by-line interpretation", "Partial compilation"), "Technology", ""),
            zh = LocalizedContent("什么是即时（JIT）编译？", listOf("在运行时将字节码编译为机器码", "提前编译", "逐行解释", "部分编译"), "科技", ""),
            es = LocalizedContent("¿Qué es la compilación just-in-time (JIT)?", listOf("Compilación del bytecode a código máquina en tiempo de ejecución", "Compilación anticipada", "Interpretación línea por línea", "Compilación parcial"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 9589, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qu'est-ce que WebRTC ?", listOf("Protocole peer-to-peer pour communication temps réel dans le navigateur", "Format vidéo web", "Protocole de streaming", "API de stockage web"), "Tech", ""),
            en = LocalizedContent("What is WebRTC?", listOf("Peer-to-peer protocol for real-time communication in the browser", "Web video format", "Streaming protocol", "Web storage API"), "Technology", ""),
            zh = LocalizedContent("什么是 WebRTC？", listOf("用于浏览器中实时通信的点对点协议", "网络视频格式", "流媒体协议", "网络存储 API"), "科技", ""),
            es = LocalizedContent("¿Qué es WebRTC?", listOf("Protocolo peer-to-peer para comunicación en tiempo real en el navegador", "Formato de video web", "Protocolo de streaming", "API de almacenamiento web"), "Tecnología", "")
        ),
    )

    private fun part3(): List<BilingualQuestion> = listOf(
        BilingualQuestion(
            id = 9590, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel mammifère marin peut rester sous l'eau plus de 2 heures ?", listOf("Le cachalot (sperm whale)", "Le dauphin (15 minutes)", "La baleine bleue (30 minutes)", "Le morse (20 minutes)"), "Nature", ""),
            en = LocalizedContent("Which marine mammal can stay underwater for more than 2 hours?", listOf("Sperm whale", "Dolphin (15 minutes)", "Blue whale (30 minutes)", "Walrus (20 minutes)"), "Nature", ""),
            zh = LocalizedContent("哪种海洋哺乳动物可以在水下停留超过2小时？", listOf("抹香鲸", "海豚（15分钟）", "蓝鲸（30分钟）", "海象（20分钟）"), "自然", ""),
            es = LocalizedContent("¿Qué mamífero marino puede permanecer bajo el agua más de 2 horas?", listOf("El cachalote", "El delfín (15 minutos)", "La ballena azul (30 minutos)", "La morsa (20 minutos)"), "Naturaleza", "")
        ),
        BilingualQuestion(
            id = 9591, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qu'est-ce qu'un marécage ?", listOf("Zone humide à végétation herbacée", "Forêt inondée", "Lagune côtière", "Prairie humide montagnarde"), "Nature", ""),
            en = LocalizedContent("What is a marsh?", listOf("Wetland with herbaceous vegetation", "Flooded forest", "Coastal lagoon", "Mountain wet meadow"), "Nature", ""),
            zh = LocalizedContent("什么是沼泽？", listOf("草本植被的湿地", "淹没的森林", "沿海泻湖", "山地湿草甸"), "自然", ""),
            es = LocalizedContent("¿Qué es un pantano?", listOf("Zona húmeda con vegetación herbácea", "Bosque inundado", "Laguna costera", "Pradera húmeda de montaña"), "Naturaleza", "")
        ),
        BilingualQuestion(
            id = 9592, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le plus grand oiseau non volant ?", listOf("L'autruche", "L'émeu", "Le kiwi", "Le manchot Empereur"), "Nature", ""),
            en = LocalizedContent("What is the largest flightless bird?", listOf("Ostrich", "Emu", "Kiwi", "Emperor penguin"), "Nature", ""),
            zh = LocalizedContent("最大的不会飞的鸟是什么？", listOf("鸵鸟", "鸸鹋", "几维鸟", "帝企鹅"), "自然", ""),
            es = LocalizedContent("¿Cuál es el ave no voladora más grande?", listOf("El avestruz", "El emú", "El kiwi", "El pingüino emperador"), "Naturaleza", "")
        ),
        BilingualQuestion(
            id = 9593, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que la pollinisation croisée ?", listOf("Transfert de pollen entre fleurs différentes (facilitant diversité génétique)", "Autofécondation d'une plante", "Reproduction asexuée des plantes", "Germination des graines"), "Nature", ""),
            en = LocalizedContent("What is cross-pollination?", listOf("Transfer of pollen between different flowers (promoting genetic diversity)", "Self-fertilization of a plant", "Asexual reproduction of plants", "Seed germination"), "Nature", ""),
            zh = LocalizedContent("什么是异花授粉？", listOf("不同花朵之间的花粉传递（促进遗传多样性）", "植物的自花受精", "植物的无性繁殖", "种子萌发"), "自然", ""),
            es = LocalizedContent("¿Qué es la polinización cruzada?", listOf("Transferencia de polen entre diferentes flores (favoreciendo la diversidad genética)", "Autofecundación de una planta", "Reproducción asexual de las plantas", "Germinación de semillas"), "Naturaleza", "")
        ),
        BilingualQuestion(
            id = 9594, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel est le venin le plus toxique du monde animal ?", listOf("Méduse de mer (Chironex fleckeri) ou guêpe de mer", "Cobra royal", "Pieuvre à anneaux bleus", "Inland taipan"), "Nature", ""),
            en = LocalizedContent("What is the most toxic venom in the animal kingdom?", listOf("Sea wasp (Chironex fleckeri) or box jellyfish", "King cobra", "Blue-ringed octopus", "Inland taipan"), "Nature", ""),
            zh = LocalizedContent("动物界中最毒的毒液是什么？", listOf("海黄蜂（Chironex fleckeri）或箱水母", "眼镜王蛇", "蓝环章鱼", "内陆太攀蛇"), "自然", ""),
            es = LocalizedContent("¿Cuál es el veneno más tóxico del reino animal?", listOf("Medusa de mar (Chironex fleckeri) o avispa de mar", "Cobra real", "Pulpo de anillos azules", "Taipán del interior"), "Naturaleza", "")
        ),
        BilingualQuestion(
            id = 9595, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qu'est-ce que la photopériodisme des plantes ?", listOf("Réponse des plantes à la durée du jour et de la nuit", "Croissance selon l'intensité lumineuse", "Mouvements vers la lumière", "Adaptation à l'obscurité"), "Nature", ""),
            en = LocalizedContent("What is photoperiodism in plants?", listOf("Response of plants to day and night length", "Growth according to light intensity", "Movements toward light", "Adaptation to darkness"), "Nature", ""),
            zh = LocalizedContent("植物的光周期现象是什么？", listOf("植物对昼夜长度的响应", "根据光照强度的生长", "向光运动", "对黑暗的适应"), "自然", ""),
            es = LocalizedContent("¿Qué es el fotoperiodismo en las plantas?", listOf("Respuesta de las plantas a la duración del día y la noche", "Crecimiento según la intensidad lumínica", "Movimientos hacia la luz", "Adaptación a la oscuridad"), "Naturaleza", "")
        ),
        BilingualQuestion(
            id = 9596, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est l'animal qui vit le plus longtemps naturellement ?", listOf("Quahog océanique (palourde) : 500+ ans", "Tortue géante (180 ans)", "Baleine boréale (200 ans)", "Méduse immortelle (Turritopsis)"), "Nature", ""),
            en = LocalizedContent("Which animal lives the longest naturally?", listOf("Ocean quahog (clam): 500+ years", "Giant tortoise (180 years)", "Bowhead whale (200 years)", "Immortal jellyfish (Turritopsis)"), "Nature", ""),
            zh = LocalizedContent("哪种动物自然寿命最长？", listOf("海洋圆蛤（蛤蜊）：500年以上", "巨龟（180年）", "弓头鲸（200年）", "永生水母（Turritopsis）"), "自然", ""),
            es = LocalizedContent("¿Qué animal vive más tiempo de forma natural?", listOf("Almeja oceánica (quahog): más de 500 años", "Tortuga gigante (180 años)", "Ballena boreal (200 años)", "Medusa inmortal (Turritopsis)"), "Naturaleza", "")
        ),
        BilingualQuestion(
            id = 9597, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que la décomposition dans un écosystème ?", listOf("Dégradation de la matière organique morte par micro-organismes", "Prédation des animaux morts", "Évaporation des éléments", "Minéralisation des sols"), "Nature", ""),
            en = LocalizedContent("What is decomposition in an ecosystem?", listOf("Breakdown of dead organic matter by microorganisms", "Predation of dead animals", "Evaporation of elements", "Mineralization of soils"), "Nature", ""),
            zh = LocalizedContent("生态系统中的分解是什么？", listOf("微生物分解死亡有机物", "对死亡动物的捕食", "元素的蒸发", "土壤矿化"), "自然", ""),
            es = LocalizedContent("¿Qué es la descomposición en un ecosistema?", listOf("Degradación de materia orgánica muerta por microorganismos", "Depredación de animales muertos", "Evaporación de elementos", "Mineralización de suelos"), "Naturaleza", "")
        ),
        BilingualQuestion(
            id = 9598, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel pourcentage de l'eau sur Terre est potable directement ?", listOf("Environ 0,3% (eau douce liquide accessible)", "3%", "10%", "1%"), "Nature", ""),
            en = LocalizedContent("What percentage of Earth's water is directly drinkable?", listOf("About 0.3% (accessible liquid freshwater)", "3%", "10%", "1%"), "Nature", ""),
            zh = LocalizedContent("地球上可直接饮用的水占多少百分比？", listOf("约0.3%（可获取的液态淡水）", "3%", "10%", "1%"), "自然", ""),
            es = LocalizedContent("¿Qué porcentaje del agua de la Tierra es directamente potable?", listOf("Alrededor del 0,3% (agua dulce líquida accesible)", "3%", "10%", "1%"), "Naturaleza", "")
        ),
        BilingualQuestion(
            id = 9599, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qu'est-ce que la succession écologique ?", listOf("Évolution progressive d'un écosystème vers un état climacique", "Remplacement d'une espèce par une autre", "Migration saisonnière", "Adaptation génétique"), "Nature", ""),
            en = LocalizedContent("What is ecological succession?", listOf("Progressive evolution of an ecosystem toward a climax state", "Replacement of one species by another", "Seasonal migration", "Genetic adaptation"), "Nature", ""),
            zh = LocalizedContent("什么是生态演替？", listOf("生态系统向顶级状态的渐进演化", "一个物种被另一个物种取代", "季节性迁徙", "遗传适应"), "自然", ""),
            es = LocalizedContent("¿Qué es la sucesión ecológica?", listOf("Evolución progresiva de un ecosistema hacia un estado clímax", "Reemplazo de una especie por otra", "Migración estacional", "Adaptación genética"), "Naturaleza", "")
        ),
        BilingualQuestion(
            id = 9600, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand pays de la Péninsule Arabique?", listOf("Yémen", "Oman", "Arabie Saoudite", "Émirats"), "Géographie", "L'Arabie Saoudite est le plus grand pays de la Péninsule Arabique, couvrant environ 80 % de sa superficie totale."),
            en = LocalizedContent("What is the largest country in the Arabian Peninsula?", listOf("Yemen", "Oman", "Saudi Arabia", "United Arab Emirates"), "Geography", "Saudi Arabia is the largest country in the Arabian Peninsula, covering about 80% of its total area."),
            zh = LocalizedContent("阿拉伯半岛上最大的国家是哪个？", listOf("也门", "阿曼", "沙特阿拉伯", "阿拉伯联合酋长国"), "地理", "沙特阿拉伯是阿拉伯半岛上最大的国家，约占其总面积的80%。"),
            es = LocalizedContent("¿Cuál es el país más grande de la Península Arábiga?", listOf("Yemen", "Omán", "Arabia Saudita", "Emiratos Árabes Unidos"), "Geografía", "Arabia Saudita es el país más grande de la Península Arábiga, cubriendo aproximadamente el 80% de su superficie total.")
        ),
        BilingualQuestion(
            id = 9601, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("La capitale des Émirats Arabes Unis est...", listOf("Dubaï", "Charm el-Cheikh", "Abou Dabi", "Charja"), "Géographie", "Abou Dabi est la capitale politique et administrative des Émirats Arabes Unis, abritant le siège du gouvernement fédéral et la résidence du président."),
            en = LocalizedContent("The capital of the United Arab Emirates is...", listOf("Dubai", "Sharm el-Sheikh", "Abu Dhabi", "Sharjah"), "Geography", "Abu Dhabi is the political and administrative capital of the United Arab Emirates, housing the federal government headquarters and the president's residence."),
            zh = LocalizedContent("阿拉伯联合酋长国的首都是...", listOf("迪拜", "沙姆沙伊赫", "阿布扎比", "沙迦"), "地理", "阿布扎比是阿拉伯联合酋长国的政治和行政首都，设有联邦政府总部和总统官邸。"),
            es = LocalizedContent("La capital de los Emiratos Árabes Unidos es...", listOf("Dubái", "Sharm el-Sheij", "Abu Dabi", "Sharjah"), "Geografía", "Abu Dabi es la capital política y administrativa de los Emiratos Árabes Unidos, albergando la sede del gobierno federal y la residencia del presidente.")
        ),
        BilingualQuestion(
            id = 9602, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel océan borde les Émirats Arabes Unis?", listOf("Océan Indien", "Golfe Persique", "Mer d'Arabie", "Golfe d'Oman"), "Géographie", "Les Émirats Arabes Unis sont situés sur la péninsule arabique, bordés au nord par le golfe Persique, qui est une mer marginale de l'océan Indien."),
            en = LocalizedContent("Which ocean borders the United Arab Emirates?", listOf("Indian Ocean", "Persian Gulf", "Arabian Sea", "Gulf of Oman"), "Geography", "The United Arab Emirates is located on the Arabian Peninsula, bordered to the north by the Persian Gulf, which is a marginal sea of the Indian Ocean."),
            zh = LocalizedContent("哪个海洋与阿拉伯联合酋长国接壤？", listOf("印度洋", "波斯湾", "阿拉伯海", "阿曼湾"), "地理", "阿拉伯联合酋长国位于阿拉伯半岛，北临波斯湾，波斯湾是印度洋的一个边缘海。"),
            es = LocalizedContent("¿Qué océano bordea los Emiratos Árabes Unidos?", listOf("Océano Índico", "Golfo Pérsico", "Mar Arábigo", "Golfo de Omán"), "Geografía", "Los Emiratos Árabes Unidos están situados en la península arábiga, limitados al norte por el golfo Pérsico, que es un mar marginal del océano Índico.")
        ),
        BilingualQuestion(
            id = 9603, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("La capitale du Qatar est...", listOf("Al Wakrah", "Al Rayyan", "Doha", "Dukhan"), "Géographie", "Doha est la capitale et la plus grande ville du Qatar, située sur la côte est de la péninsule qatarie."),
            en = LocalizedContent("The capital of Qatar is...", listOf("Al Wakrah", "Al Rayyan", "Doha", "Dukhan"), "Geography", "Doha is the capital and largest city of Qatar, located on the east coast of the Qatar Peninsula."),
            zh = LocalizedContent("卡塔尔的首都是...", listOf("沃克拉", "赖扬", "多哈", "杜汉"), "地理", "多哈是卡塔尔的首都和最大城市，位于卡塔尔半岛的东海岸。"),
            es = LocalizedContent("La capital de Catar es...", listOf("Al Wakrah", "Al Rayyan", "Doha", "Dukhan"), "Geografía", "Doha es la capital y ciudad más grande de Catar, situada en la costa este de la península de Catar.")
        ),
        BilingualQuestion(
            id = 9604, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus petit pays du Moyen-Orient?", listOf("Bahreïn", "Qatar", "Koweït", "Liban"), "Géographie", "Bahreïn est un archipel situé dans le golfe Persique, avec une superficie d'environ 760 km², ce qui en fait le plus petit État souverain du Moyen-Orient."),
            en = LocalizedContent("What is the smallest country in the Middle East?", listOf("Bahrain", "Qatar", "Kuwait", "Lebanon"), "Geography", "Bahrain is an archipelago in the Persian Gulf, with an area of about 760 km², making it the smallest sovereign state in the Middle East."),
            zh = LocalizedContent("中东最小的国家是哪个？", listOf("巴林", "卡塔尔", "科威特", "黎巴嫩"), "地理", "巴林是波斯湾的一个群岛，面积约760平方公里，是中东最小的主权国家。"),
            es = LocalizedContent("¿Cuál es el país más pequeño de Oriente Medio?", listOf("Baréin", "Catar", "Kuwait", "Líbano"), "Geografía", "Baréin es un archipiélago en el golfo Pérsico, con una superficie de unos 760 km², lo que lo convierte en el estado soberano más pequeño de Oriente Medio.")
        ),
        BilingualQuestion(
            id = 9605, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("La capitale de Bahreïn est...", listOf("Riffa", "Al Manama", "Manama", "Sitra"), "Géographie", "Manama est la capitale et la plus grande ville de Bahreïn, située sur la côte nord de l'île de Bahreïn, dans le golfe Persique."),
            en = LocalizedContent("The capital of Bahrain is...", listOf("Riffa", "Al Manama", "Manama", "Sitra"), "Geography", "Manama is the capital and largest city of Bahrain, located on the north coast of Bahrain Island in the Persian Gulf."),
            zh = LocalizedContent("巴林的首都是...", listOf("里法", "麦纳麦", "麦纳麦", "锡特拉"), "地理", "麦纳麦是巴林的首都和最大城市，位于波斯湾巴林岛的北海岸。"),
            es = LocalizedContent("La capital de Baréin es...", listOf("Riffa", "Al Manama", "Manama", "Sitra"), "Geografía", "Manama es la capital y ciudad más grande de Baréin, situada en la costa norte de la isla de Baréin en el golfo Pérsico.")
        ),
        BilingualQuestion(
            id = 9606, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le point culminant du Moyen-Orient?", listOf("Pic Damavand", "Mont Ararat", "Pic Zard Kuh", "Mont Hadj"), "Géographie", "Le Pic Damavand, situé en Iran, est un volcan endormi culminant à 5 610 mètres, ce qui en fait le plus haut sommet du Moyen-Orient."),
            en = LocalizedContent("What is the highest point in the Middle East?", listOf("Mount Damavand", "Mount Ararat", "Zard Kuh Peak", "Mount Hajj"), "Geography", "Mount Damavand, located in Iran, is a dormant volcano with a height of 5,610 meters, making it the highest peak in the Middle East."),
            zh = LocalizedContent("中东的最高点是什么？", listOf("达马万德峰", "亚拉腊山", "扎尔德库赫峰", "哈杰山"), "地理", "达马万德峰位于伊朗，是一座休眠火山，海拔5610米，是中东的最高峰。"),
            es = LocalizedContent("¿Cuál es el punto más alto de Oriente Medio?", listOf("Monte Damavand", "Monte Ararat", "Pico Zard Kuh", "Monte Hajj"), "Geografía", "El Monte Damavand, situado en Irán, es un volcán inactivo con una altura de 5.610 metros, lo que lo convierte en el pico más alto de Oriente Medio.")
        ),
        BilingualQuestion(
            id = 9607, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("La capitale du Koweït est...", listOf("Jahra", "Ahmadi", "Koweit City", "Salimiya"), "Géographie", "Koweït City est la capitale et la plus grande ville du Koweït, située sur la côte du golfe Persique. Elle concentre la majorité de la population et des institutions du pays."),
            en = LocalizedContent("The capital of Kuwait is...", listOf("Jahra", "Ahmadi", "Kuwait City", "Salmiya"), "Geography", "Kuwait City is the capital and largest city of Kuwait, located on the coast of the Persian Gulf. It concentrates the majority of the country's population and institutions."),
            zh = LocalizedContent("科威特的首都是...", listOf("贾赫拉", "艾哈迈迪", "科威特城", "萨利米亚"), "地理", "科威特城是科威特的首都和最大城市，位于波斯湾沿岸，集中了该国大部分人口和机构。"),
            es = LocalizedContent("La capital de Kuwait es...", listOf("Jahra", "Ahmadi", "Ciudad de Kuwait", "Salmiya"), "Geografía", "La Ciudad de Kuwait es la capital y ciudad más grande de Kuwait, situada en la costa del golfo Pérsico. Concentra la mayoría de la población e instituciones del país.")
        ),
        BilingualQuestion(
            id = 9608, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel fleuve borde l'Égypte au sud?", listOf("Bahr el-Ghazal", "Sobat", "Atbarah", "Nil"), "Géographie", "Le Nil traverse l'Égypte du sud au nord, formant sa frontière méridionale avec le Soudan avant de se jeter dans la Méditerranée."),
            en = LocalizedContent("Which river borders Egypt to the south?", listOf("Bahr el-Ghazal", "Sobat", "Atbarah", "Nile"), "Geography", "The Nile flows through Egypt from south to north, forming its southern border with Sudan before emptying into the Mediterranean."),
            zh = LocalizedContent("哪条河流与埃及南部接壤？", listOf("加扎勒河", "索巴特河", "阿特巴拉河", "尼罗河"), "地理", "尼罗河从南向北流经埃及，与苏丹形成南部边界，然后注入地中海。"),
            es = LocalizedContent("¿Qué río bordea Egipto al sur?", listOf("Bahr el-Ghazal", "Sobat", "Atbara", "Nilo"), "Geografía", "El Nilo atraviesa Egipto de sur a norte, formando su frontera meridional con Sudán antes de desembocar en el Mediterráneo.")
        ),
        BilingualQuestion(
            id = 9609, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("La capitale de l'Oman est...", listOf("Sohar", "Salalah", "Mascate", "Ibri"), "Géographie", "Mascate est la capitale et la plus grande ville d'Oman, située sur la côte du golfe d'Oman. Elle abrite le siège du gouvernement et les principales institutions du pays."),
            en = LocalizedContent("The capital of Oman is...", listOf("Sohar", "Salalah", "Muscat", "Ibri"), "Geography", "Muscat is the capital and largest city of Oman, located on the coast of the Gulf of Oman. It houses the seat of government and the country's main institutions."),
            zh = LocalizedContent("阿曼的首都是...", listOf("苏哈尔", "塞拉莱", "马斯喀特", "伊卜里"), "地理", "马斯喀特是阿曼的首都和最大城市，位于阿曼湾沿岸，设有政府所在地和国家主要机构。"),
            es = LocalizedContent("La capital de Omán es...", listOf("Sohar", "Salalah", "Mascate", "Ibri"), "Geografía", "Mascate es la capital y ciudad más grande de Omán, situada en la costa del golfo de Omán. Alberga la sede del gobierno y las principales instituciones del país.")
        ),
        BilingualQuestion(
            id = 9610, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus haut sommet d'Afrique du Nord?", listOf("Pic Toubkal", "Pic Gueliz", "Mont Atlas", "Pic Tissoued"), "Géographie", "Le Pic Toubkal culmine à 4 167 mètres dans le massif du Haut Atlas marocain, ce qui en fait le point culminant de l'Afrique du Nord."),
            en = LocalizedContent("What is the highest peak in North Africa?", listOf("Toubkal Peak", "Gueliz Peak", "Mount Atlas", "Tissoued Peak"), "Geography", "Toubkal Peak rises to 4,167 meters in the High Atlas massif of Morocco, making it the highest point in North Africa."),
            zh = LocalizedContent("北非最高峰是什么？", listOf("图卜卡勒峰", "古利兹峰", "阿特拉斯山", "提苏埃德峰"), "地理", "图卜卡勒峰位于摩洛哥高阿特拉斯山脉，海拔4167米，是北非最高点。"),
            es = LocalizedContent("¿Cuál es el pico más alto del norte de África?", listOf("Pico Toubkal", "Pico Gueliz", "Monte Atlas", "Pico Tissoued"), "Geografía", "El pico Toubkal se eleva a 4.167 metros en el macizo del Alto Atlas marroquí, lo que lo convierte en el punto más alto del norte de África.")
        ),
        BilingualQuestion(
            id = 9611, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("La capitale du Yémen est...", listOf("Aden", "Taiz", "Sanaa", "Hodeidah"), "Géographie", "Sanaa est la capitale du Yémen depuis l'unification du pays en 1990, et l'une des plus anciennes villes habitées en continu au monde."),
            en = LocalizedContent("The capital of Yemen is...", listOf("Aden", "Taiz", "Sanaa", "Hodeidah"), "Geography", "Sanaa has been the capital of Yemen since the country's unification in 1990, and is one of the oldest continuously inhabited cities in the world."),
            zh = LocalizedContent("也门的首都是...", listOf("亚丁", "塔伊兹", "萨那", "荷台达"), "地理", "萨那自1990年也门统一以来一直是首都，也是世界上连续有人居住的最古老城市之一。"),
            es = LocalizedContent("La capital de Yemen es...", listOf("Adén", "Taiz", "Saná", "Hodeida"), "Geografía", "Saná es la capital de Yemen desde la unificación del país en 1990, y una de las ciudades habitadas continuamente más antiguas del mundo.")
        ),
        BilingualQuestion(
            id = 9612, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand détroit du monde?", listOf("Détroit de Malacca", "Détroit de Béring", "Détroit de Magellan", "Détroit de Drake"), "Géographie", "Le détroit de Drake, entre le cap Horn et l'Antarctique, est le plus large du monde avec environ 800 km, reliant les océans Atlantique et Pacifique."),
            en = LocalizedContent("What is the largest strait in the world?", listOf("Strait of Malacca", "Bering Strait", "Strait of Magellan", "Drake Passage"), "Geography", "The Drake Passage, between Cape Horn and Antarctica, is the widest strait in the world at about 800 km, connecting the Atlantic and Pacific Oceans."),
            zh = LocalizedContent("世界上最大的海峡是什么？", listOf("马六甲海峡", "白令海峡", "麦哲伦海峡", "德雷克海峡"), "地理", "德雷克海峡位于合恩角和南极洲之间，宽约800公里，是世界上最宽的海峡，连接大西洋和太平洋。"),
            es = LocalizedContent("¿Cuál es el estrecho más grande del mundo?", listOf("Estrecho de Malaca", "Estrecho de Bering", "Estrecho de Magallanes", "Paso de Drake"), "Geografía", "El paso de Drake, entre el cabo de Hornos y la Antártida, es el estrecho más ancho del mundo con unos 800 km, conectando los océanos Atlántico y Pacífico.")
        ),
        BilingualQuestion(
            id = 9613, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("La capitale du Maroc est...", listOf("Casablanca", "Tanger", "Rabat", "Fès"), "Géographie", "Rabat est la capitale administrative et politique du Maroc depuis 1912, sous le protectorat français, en remplacement de Fès."),
            en = LocalizedContent("The capital of Morocco is...", listOf("Casablanca", "Tangier", "Rabat", "Fez"), "Geography", "Rabat has been the administrative and political capital of Morocco since 1912, under the French protectorate, replacing Fez."),
            zh = LocalizedContent("摩洛哥的首都是...", listOf("卡萨布兰卡", "丹吉尔", "拉巴特", "非斯"), "地理", "拉巴特自1912年法国保护国时期起成为摩洛哥的行政和政治首都，取代了非斯。"),
            es = LocalizedContent("La capital de Marruecos es...", listOf("Casablanca", "Tánger", "Rabat", "Fez"), "Geografía", "Rabat es la capital administrativa y política de Marruecos desde 1912, bajo el protectorado francés, en sustitución de Fez.")
        ),
        BilingualQuestion(
            id = 9614, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel montagnes forment la frontière entre le Maroc et l'Algérie?", listOf("Atlas du Haut", "Moyen Atlas", "Anti-Atlas", "Chaîne de l'Atlas"), "Géographie", "La chaîne de l'Atlas, et plus précisément le massif de l'Atlas saharien, constitue une barrière naturelle majeure séparant le Maroc et l'Algérie sur leur frontière commune."),
            en = LocalizedContent("Which mountains form the border between Morocco and Algeria?", listOf("High Atlas", "Middle Atlas", "Anti-Atlas", "Atlas Range"), "Geography", "The Atlas Range, more specifically the Saharan Atlas massif, forms a major natural barrier separating Morocco and Algeria along their common border."),
            zh = LocalizedContent("哪些山脉构成了摩洛哥和阿尔及利亚之间的边界？", listOf("高阿特拉斯山脉", "中阿特拉斯山脉", "反阿特拉斯山脉", "阿特拉斯山脉"), "地理", "阿特拉斯山脉，更具体地说是撒哈拉阿特拉斯山体，构成了摩洛哥和阿尔及利亚共同边界上的主要天然屏障。"),
            es = LocalizedContent("¿Qué montañas forman la frontera entre Marruecos y Argelia?", listOf("Alto Atlas", "Medio Atlas", "Anti-Atlas", "Cordillera del Atlas"), "Geografía", "La cordillera del Atlas, más precisamente el macizo del Atlas sahariano, constituye una barrera natural importante que separa Marruecos y Argelia en su frontera común.")
        ),
        BilingualQuestion(
            id = 9615, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("La capitale de l'Algérie est...", listOf("Oran", "Constantine", "Alger", "Annaba"), "Géographie", "Alger est la capitale de l'Algérie depuis l'indépendance en 1962, située sur la côte méditerranéenne."),
            en = LocalizedContent("The capital of Algeria is...", listOf("Oran", "Constantine", "Algiers", "Annaba"), "Geography", "Algiers has been the capital of Algeria since independence in 1962, located on the Mediterranean coast."),
            zh = LocalizedContent("阿尔及利亚的首都是...", listOf("奥兰", "君士坦丁", "阿尔及尔", "安纳巴"), "地理", "阿尔及尔自1962年独立以来一直是阿尔及利亚的首都，位于地中海沿岸。"),
            es = LocalizedContent("La capital de Argelia es...", listOf("Orán", "Constantina", "Argel", "Annaba"), "Geografía", "Argel es la capital de Argelia desde la independencia en 1962, situada en la costa mediterránea.")
        ),
        BilingualQuestion(
            id = 9616, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus long fleuve d'Afrique du Nord?", listOf("Draa", "Sous", "Nil", "Sebou"), "Géographie", "Le Nil traverse l'Afrique du Nord-Est sur environ 6 650 km, ce qui en fait le plus long fleuve du continent africain."),
            en = LocalizedContent("What is the longest river in North Africa?", listOf("Draa", "Sous", "Nile", "Sebou"), "Geography", "The Nile flows through northeastern Africa for about 6,650 km, making it the longest river on the African continent."),
            zh = LocalizedContent("北非最长的河流是什么？", listOf("德拉河", "苏斯河", "尼罗河", "塞布河"), "地理", "尼罗河流经非洲东北部，长约6650公里，是非洲大陆最长的河流。"),
            es = LocalizedContent("¿Cuál es el río más largo del norte de África?", listOf("Draa", "Sous", "Nilo", "Sebú"), "Geografía", "El Nilo fluye a través del noreste de África unos 6.650 km, lo que lo convierte en el río más largo del continente africano.")
        ),
        BilingualQuestion(
            id = 9617, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("La capitale de la Tunisie est...", listOf("Sfax", "Sousse", "Tunis", "Gabès"), "Géographie", "Tunis est la capitale de la Tunisie depuis l'indépendance en 1956, située sur la côte méditerranéenne. Elle abrite le siège du gouvernement et les principales institutions du pays."),
            en = LocalizedContent("The capital of Tunisia is...", listOf("Sfax", "Sousse", "Tunis", "Gabès"), "Geography", "Tunis has been the capital of Tunisia since independence in 1956, located on the Mediterranean coast. It houses the seat of government and the country's main institutions."),
            zh = LocalizedContent("突尼斯的首都是...", listOf("斯法克斯", "苏塞", "突尼斯市", "加贝斯"), "地理", "突尼斯市自1956年独立以来一直是突尼斯的首都，位于地中海沿岸，是政府和主要机构的所在地。"),
            es = LocalizedContent("La capital de Túnez es...", listOf("Sfax", "Susa", "Túnez", "Gabés"), "Geografía", "Túnez es la capital de Túnez desde la independencia en 1956, situada en la costa mediterránea. Alberga la sede del gobierno y las principales instituciones del país.")
        ),
        BilingualQuestion(
            id = 9618, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le point culminant de l'Afrique du Nord?", listOf("Pic Toubkal", "Mont Atlas", "Kef el-Ankhal", "Pic Tissoued"), "Géographie", "Le Pic Toubkal, situé dans le Haut Atlas marocain, est le plus haut sommet d'Afrique du Nord avec 4 167 mètres d'altitude."),
            en = LocalizedContent("What is the highest point in North Africa?", listOf("Toubkal Peak", "Mount Atlas", "Kef el-Ankhal", "Tissoued Peak"), "Geography", "Toubkal Peak, located in the High Atlas of Morocco, is the highest summit in North Africa at 4,167 meters above sea level."),
            zh = LocalizedContent("北非最高点是什么？", listOf("图卜卡勒峰", "阿特拉斯山", "凯夫埃尔安卡尔", "提苏埃德峰"), "地理", "图卜卡勒峰位于摩洛哥高阿特拉斯山脉，海拔4167米，是北非最高峰。"),
            es = LocalizedContent("¿Cuál es el punto más alto del norte de África?", listOf("Pico Toubkal", "Monte Atlas", "Kef el-Ankhal", "Pico Tissoued"), "Geografía", "El pico Toubkal, situado en el Alto Atlas marroquí, es la cumbre más alta del norte de África con 4.167 metros de altitud.")
        ),
        BilingualQuestion(
            id = 9619, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("La capitale de la Libye est...", listOf("Benghazi", "Misrata", "Tripoli", "Tobrouk"), "Géographie", "Tripoli est la plus grande ville de Libye et son principal port sur la mer Méditerranée, servant de centre politique et économique du pays depuis l'indépendance."),
            en = LocalizedContent("The capital of Libya is...", listOf("Benghazi", "Misrata", "Tripoli", "Tobruk"), "Geography", "Tripoli is the largest city in Libya and its main port on the Mediterranean Sea, serving as the country's political and economic center since independence."),
            zh = LocalizedContent("利比亚的首都是...", listOf("班加西", "米苏拉塔", "的黎波里", "图卜鲁格"), "地理", "的黎波里是利比亚最大的城市和地中海上的主要港口，自独立以来一直是该国的政治和经济中心。"),
            es = LocalizedContent("La capital de Libia es...", listOf("Bengasi", "Misrata", "Trípoli", "Tobruk"), "Geografía", "Trípoli es la ciudad más grande de Libia y su principal puerto en el mar Mediterráneo, sirviendo como centro político y económico del país desde la independencia.")
        ),
        BilingualQuestion(
            id = 9620, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand port d'Afrique?", listOf("Port de Durban", "Port d'Abidjan", "Port de Lagos", "Port d'Alexandrie"), "Géographie", "Le port d'Alexandrie, situé en Égypte sur la mer Méditerranée, est le plus grand port d'Afrique en termes de volume de marchandises traitées."),
            en = LocalizedContent("What is the largest port in Africa?", listOf("Port of Durban", "Port of Abidjan", "Port of Lagos", "Port of Alexandria"), "Geography", "The Port of Alexandria, located in Egypt on the Mediterranean Sea, is the largest port in Africa in terms of cargo volume handled."),
            zh = LocalizedContent("非洲最大的港口是哪个？", listOf("德班港", "阿比让港", "拉各斯港", "亚历山大港"), "地理", "亚历山大港位于埃及地中海沿岸，是非洲货物吞吐量最大的港口。"),
            es = LocalizedContent("¿Cuál es el puerto más grande de África?", listOf("Puerto de Durban", "Puerto de Abiyán", "Puerto de Lagos", "Puerto de Alejandría"), "Geografía", "El puerto de Alejandría, situado en Egipto en el mar Mediterráneo, es el puerto más grande de África en términos de volumen de carga manejada.")
        ),
        BilingualQuestion(
            id = 9621, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("La capitale du Soudan est...", listOf("Port Soudan", "Kassala", "Khartoum", "Renk"), "Géographie", "Khartoum est la capitale du Soudan depuis l'indépendance du pays en 1956, située au confluent du Nil Blanc et du Nil Bleu."),
            en = LocalizedContent("The capital of Sudan is...", listOf("Port Sudan", "Kassala", "Khartoum", "Renk"), "Geography", "Khartoum has been the capital of Sudan since the country's independence in 1956, located at the confluence of the White Nile and the Blue Nile."),
            zh = LocalizedContent("苏丹的首都是...", listOf("苏丹港", "卡萨拉", "喀土穆", "伦克"), "地理", "喀土穆自1956年苏丹独立以来一直是首都，位于白尼罗河和青尼罗河交汇处。"),
            es = LocalizedContent("La capital de Sudán es...", listOf("Puerto Sudán", "Kassala", "Jartum", "Renk"), "Geografía", "Jartum es la capital de Sudán desde la independencia del país en 1956, situada en la confluencia del Nilo Blanco y el Nilo Azul.")
        ),
        BilingualQuestion(
            id = 9622, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand archipel d'Afrique?", listOf("Archipel des Mascareignes", "Îles Seychelles", "Îles Comores", "Archipel de Socotra"), "Géographie", "L'archipel des Mascareignes, comprenant La Réunion, Maurice et Rodrigues, est le plus grand d'Afrique par sa superficie terrestre totale."),
            en = LocalizedContent("What is the largest archipelago in Africa?", listOf("Mascarene Islands", "Seychelles Islands", "Comoros Islands", "Socotra Archipelago"), "Geography", "The Mascarene Islands, comprising Réunion, Mauritius, and Rodrigues, are the largest archipelago in Africa by total land area."),
            zh = LocalizedContent("非洲最大的群岛是哪个？", listOf("马斯克林群岛", "塞舌尔群岛", "科摩罗群岛", "索科特拉群岛"), "地理", "马斯克林群岛包括留尼汪、毛里求斯和罗德里格斯，是非洲陆地总面积最大的群岛。"),
            es = LocalizedContent("¿Cuál es el archipiélago más grande de África?", listOf("Archipiélago de las Mascareñas", "Islas Seychelles", "Islas Comoras", "Archipiélago de Socotra"), "Geografía", "El archipiélago de las Mascareñas, que comprende Reunión, Mauricio y Rodrigues, es el más grande de África por superficie terrestre total.")
        ),
        BilingualQuestion(
            id = 9623, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("La capitale de la Somalie est...", listOf("Hargeisa", "Mogadiscio", "Kismayo", "Baidoa"), "Géographie", "Mogadiscio est la capitale et la plus grande ville de la Somalie, située sur la côte de l'océan Indien. Elle est le principal centre politique, économique et culturel du pays."),
            en = LocalizedContent("The capital of Somalia is...", listOf("Hargeisa", "Mogadishu", "Kismayo", "Baidoa"), "Geography", "Mogadishu is the capital and largest city of Somalia, located on the Indian Ocean coast. It is the country's main political, economic, and cultural center."),
            zh = LocalizedContent("索马里的首都是...", listOf("哈尔格萨", "摩加迪沙", "基斯马尤", "拜多阿"), "地理", "摩加迪沙是索马里首都和最大城市，位于印度洋沿岸，是该国主要的政治、经济和文化中心。"),
            es = LocalizedContent("La capital de Somalia es...", listOf("Hargeisa", "Mogadiscio", "Kismayo", "Baidoa"), "Geografía", "Mogadiscio es la capital y la ciudad más grande de Somalia, situada en la costa del océano Índico. Es el principal centro político, económico y cultural del país.")
        ),
        BilingualQuestion(
            id = 9624, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand pays d'Afrique orientale?", listOf("Kenya", "Ouganda", "Tanzanie", "Éthiopie"), "Géographie", "L'Éthiopie est le plus grand pays d'Afrique orientale avec une superficie d'environ 1,1 million de kilomètres carrés, dépassant la Tanzanie et la Somalie."),
            en = LocalizedContent("What is the largest country in East Africa?", listOf("Kenya", "Uganda", "Tanzania", "Ethiopia"), "Geography", "Ethiopia is the largest country in East Africa with an area of about 1.1 million square kilometers, surpassing Tanzania and Somalia."),
            zh = LocalizedContent("东非最大的国家是哪个？", listOf("肯尼亚", "乌干达", "坦桑尼亚", "埃塞俄比亚"), "地理", "埃塞俄比亚面积约110万平方公里，是东非最大的国家，超过坦桑尼亚和索马里。"),
            es = LocalizedContent("¿Cuál es el país más grande de África Oriental?", listOf("Kenia", "Uganda", "Tanzania", "Etiopía"), "Geografía", "Etiopía es el país más grande de África Oriental con una superficie de aproximadamente 1,1 millones de kilómetros cuadrados, superando a Tanzania y Somalia.")
        ),
        BilingualQuestion(
            id = 9625, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("La capitale de l'Éthiopie est...", listOf("Dire Daoua", "Adis-Abeba", "Mekele", "Assela"), "Géographie", "Addis-Abeba est la capitale de l'Éthiopie depuis 1889, fondée par l'empereur Ménélik II, et elle abrite le siège de l'Union africaine."),
            en = LocalizedContent("The capital of Ethiopia is...", listOf("Dire Dawa", "Addis Ababa", "Mekelle", "Assela"), "Geography", "Addis Ababa has been the capital of Ethiopia since 1889, founded by Emperor Menelik II, and it hosts the headquarters of the African Union."),
            zh = LocalizedContent("埃塞俄比亚的首都是...", listOf("德雷达瓦", "亚的斯亚贝巴", "默克莱", "阿塞拉"), "地理", "亚的斯亚贝巴自1889年起成为埃塞俄比亚首都，由皇帝孟尼利克二世建立，也是非洲联盟总部所在地。"),
            es = LocalizedContent("La capital de Etiopía es...", listOf("Dire Dawa", "Adís Abeba", "Mekele", "Assela"), "Geografía", "Adís Abeba es la capital de Etiopía desde 1889, fundada por el emperador Menelik II, y alberga la sede de la Unión Africana.")
        ),
        BilingualQuestion(
            id = 9626, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel fleuve traverse l'Éthiopie?", listOf("Sénégal", "Nil", "Congo", "Zambèze"), "Géographie", "Le Nil Bleu, principal affluent du Nil, prend sa source dans le lac Tana en Éthiopie."),
            en = LocalizedContent("Which river flows through Ethiopia?", listOf("Senegal", "Nile", "Congo", "Zambezi"), "Geography", "The Blue Nile, the main tributary of the Nile, originates from Lake Tana in Ethiopia."),
            zh = LocalizedContent("哪条河流经埃塞俄比亚？", listOf("塞内加尔河", "尼罗河", "刚果河", "赞比西河"), "地理", "青尼罗河是尼罗河的主要支流，发源于埃塞俄比亚的塔纳湖。"),
            es = LocalizedContent("¿Qué río atraviesa Etiopía?", listOf("Senegal", "Nilo", "Congo", "Zambeze"), "Geografía", "El Nilo Azul, el principal afluente del Nilo, nace en el lago Tana en Etiopía.")
        ),
        BilingualQuestion(
            id = 9627, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("La capitale de Djibouti est...", listOf("Ali Sabieh", "Djibouti City", "Tadjourah", "Arta"), "Géographie", "Djibouti City est à la fois la capitale et la plus grande ville du pays, portant le même nom que l'État."),
            en = LocalizedContent("The capital of Djibouti is...", listOf("Ali Sabieh", "Djibouti City", "Tadjourah", "Arta"), "Geography", "Djibouti City is both the capital and the largest city of the country, bearing the same name as the state."),
            zh = LocalizedContent("吉布提的首都是...", listOf("阿里萨比耶", "吉布提市", "塔朱拉", "阿尔塔"), "地理", "吉布提市既是首都也是该国最大城市，与国名相同。"),
            es = LocalizedContent("La capital de Yibuti es...", listOf("Ali Sabieh", "Ciudad de Yibuti", "Tadjourah", "Arta"), "Geografía", "La ciudad de Yibuti es tanto la capital como la ciudad más grande del país, con el mismo nombre que el estado.")
        ),
        BilingualQuestion(
            id = 9628, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand désert de l'Afrique orientale?", listOf("Désert de Chalbi", "Désert du Danakil", "Désert de Janjero", "Désert de Ogaden"), "Géographie", "Le désert du Danakil, situé dans la corne de l'Afrique (Éthiopie, Érythrée, Djibouti), est le plus grand désert d'Afrique orientale, connu pour ses températures extrêmes et ses paysages volcaniques."),
            en = LocalizedContent("What is the largest desert in East Africa?", listOf("Chalbi Desert", "Danakil Desert", "Janjero Desert", "Ogaden Desert"), "Geography", "The Danakil Desert, located in the Horn of Africa (Ethiopia, Eritrea, Djibouti), is the largest desert in East Africa, known for its extreme temperatures and volcanic landscapes."),
            zh = LocalizedContent("东非最大的沙漠是哪个？", listOf("查尔比沙漠", "达纳基尔沙漠", "詹杰罗沙漠", "欧加登沙漠"), "地理", "达纳基尔沙漠位于非洲之角（埃塞俄比亚、厄立特里亚、吉布提），是东非最大的沙漠，以极端温度和火山地貌闻名。"),
            es = LocalizedContent("¿Cuál es el desierto más grande de África Oriental?", listOf("Desierto de Chalbi", "Desierto de Danakil", "Desierto de Janjero", "Desierto de Ogaden"), "Geografía", "El desierto de Danakil, situado en el Cuerno de África (Etiopía, Eritrea, Yibuti), es el desierto más grande de África Oriental, conocido por sus temperaturas extremas y paisajes volcánicos.")
        ),
        BilingualQuestion(
            id = 9629, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("La capitale du Kenya est...", listOf("Mombasa", "Nairobi", "Kisumu", "Nakuru"), "Géographie", "Nairobi est la plus grande ville du Kenya et son centre économique et politique. Elle a été fondée en 1899 comme dépôt ferroviaire et est devenue la capitale en 1907."),
            en = LocalizedContent("The capital of Kenya is...", listOf("Mombasa", "Nairobi", "Kisumu", "Nakuru"), "Geography", "Nairobi is the largest city in Kenya and its economic and political center. It was founded in 1899 as a railway depot and became the capital in 1907."),
            zh = LocalizedContent("肯尼亚的首都是...", listOf("蒙巴萨", "内罗毕", "基苏木", "纳库鲁"), "地理", "内罗毕是肯尼亚最大城市和经济政治中心，1899年作为铁路仓库建立，1907年成为首都。"),
            es = LocalizedContent("La capital de Kenia es...", listOf("Mombasa", "Nairobi", "Kisumu", "Nakuru"), "Geografía", "Nairobi es la ciudad más grande de Kenia y su centro económico y político. Fue fundada en 1899 como depósito ferroviario y se convirtió en capital en 1907.")
        ),
        BilingualQuestion(
            id = 9630, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel montagnes abritent le Kilimandjarou?", listOf("Chaîne des Usambara", "Monts Uluguru", "Chaîne des Pare", "Aucune (sommet isolé)"), "Géographie", "Le Kilimandjaro est un volcan endormi et un sommet isolé, non rattaché à une chaîne de montagnes, ce qui en fait le plus haut sommet d'Afrique avec ses 5 895 mètres."),
            en = LocalizedContent("Which mountains shelter Kilimanjaro?", listOf("Usambara Range", "Uluguru Mountains", "Pare Range", "None (isolated peak)"), "Geography", "Kilimanjaro is a dormant volcano and an isolated peak, not part of a mountain range, making it the highest peak in Africa at 5,895 meters."),
            zh = LocalizedContent("哪些山脉庇护着乞力马扎罗山？", listOf("乌桑巴拉山脉", "乌鲁古鲁山脉", "帕雷山脉", "无（孤立山峰）"), "地理", "乞力马扎罗山是一座休眠火山和孤立山峰，不属于任何山脉，是非洲最高峰，海拔5895米。"),
            es = LocalizedContent("¿Qué montañas albergan el Kilimanjaro?", listOf("Cordillera de Usambara", "Montes Uluguru", "Cordillera de Pare", "Ninguna (pico aislado)"), "Geografía", "El Kilimanjaro es un volcán inactivo y un pico aislado, no perteneciente a una cadena montañosa, lo que lo convierte en la cumbre más alta de África con 5.895 metros.")
        ),
        BilingualQuestion(
            id = 9631, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("La capitale de la Tanzanie est...", listOf("Dar es-Salaam", "Dodoma", "Arusha", "Mbeya"), "Géographie", "Dodoma est devenue la capitale officielle de la Tanzanie en 1996, remplaçant Dar es Salam, principalement pour des raisons de centralisation géographique."),
            en = LocalizedContent("The capital of Tanzania is...", listOf("Dar es Salaam", "Dodoma", "Arusha", "Mbeya"), "Geography", "Dodoma became the official capital of Tanzania in 1996, replacing Dar es Salaam, mainly for reasons of geographical centralization."),
            zh = LocalizedContent("坦桑尼亚的首都是...", listOf("达累斯萨拉姆", "多多马", "阿鲁沙", "姆贝亚"), "地理", "多多马于1996年成为坦桑尼亚的官方首都，取代达累斯萨拉姆，主要是出于地理中心化的原因。"),
            es = LocalizedContent("La capital de Tanzania es...", listOf("Dar es Salaam", "Dodoma", "Arusha", "Mbeya"), "Geografía", "Dodoma se convirtió en la capital oficial de Tanzania en 1996, reemplazando a Dar es Salaam, principalmente por razones de centralización geográfica.")
        ),
        BilingualQuestion(
            id = 9632, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand lac de la vallée du Rift?", listOf("Lac Turkana", "Lac Kyoga", "Lac Victoria", "Lac Tanganyika"), "Géographie", "Le lac Tanganyika est le plus grand lac de la vallée du Rift en termes de volume et de profondeur, et le deuxième plus profond du monde. Il s'étend sur quatre pays d'Afrique de l'Est."),
            en = LocalizedContent("What is the largest lake in the Rift Valley?", listOf("Lake Turkana", "Lake Kyoga", "Lake Victoria", "Lake Tanganyika"), "Geography", "Lake Tanganyika is the largest lake in the Rift Valley in terms of volume and depth, and the second deepest in the world. It spans four East African countries."),
            zh = LocalizedContent("裂谷中最大的湖泊是？", listOf("图尔卡纳湖", "基奥加湖", "维多利亚湖", "坦噶尼喀湖"), "地理", "坦噶尼喀湖是裂谷中体积和深度最大的湖泊，也是世界第二深湖。它横跨四个东非国家。"),
            es = LocalizedContent("¿Cuál es el lago más grande del Valle del Rift?", listOf("Lago Turkana", "Lago Kyoga", "Lago Victoria", "Lago Tanganyika"), "Geografía", "El lago Tanganyika es el lago más grande del Valle del Rift en términos de volumen y profundidad, y el segundo más profundo del mundo. Se extiende por cuatro países de África Oriental.")
        ),
        BilingualQuestion(
            id = 9633, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("La capitale de l'Ouganda est...", listOf("Jinja", "Kampala", "Gulu", "Mbale"), "Géographie", "Kampala est la capitale et la plus grande ville de l'Ouganda, située sur les rives du lac Victoria. Elle est le centre politique, économique et culturel du pays."),
            en = LocalizedContent("The capital of Uganda is...", listOf("Jinja", "Kampala", "Gulu", "Mbale"), "Geography", "Kampala is the capital and largest city of Uganda, located on the shores of Lake Victoria. It is the political, economic, and cultural center of the country."),
            zh = LocalizedContent("乌干达的首都是...", listOf("金贾", "坎帕拉", "古卢", "姆巴莱"), "地理", "坎帕拉是乌干达的首都和最大城市，位于维多利亚湖沿岸。它是该国的政治、经济和文化中心。"),
            es = LocalizedContent("La capital de Uganda es...", listOf("Jinja", "Kampala", "Gulu", "Mbale"), "Geografía", "Kampala es la capital y ciudad más grande de Uganda, situada a orillas del lago Victoria. Es el centro político, económico y cultural del país.")
        ),
        BilingualQuestion(
            id = 9634, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel fleuve traverse l'Ouganda?", listOf("Kagera", "Katonga", "Nil Blanc", "Sénégal"), "Géographie", "Le Nil Blanc prend sa source dans le lac Victoria, dont la rive nord borde l'Ouganda, et traverse ce pays avant de poursuivre vers le Soudan."),
            en = LocalizedContent("Which river flows through Uganda?", listOf("Kagera", "Katonga", "White Nile", "Senegal"), "Geography", "The White Nile originates from Lake Victoria, whose northern shore borders Uganda, and flows through this country before continuing to Sudan."),
            zh = LocalizedContent("哪条河流经乌干达？", listOf("卡盖拉河", "卡通加河", "白尼罗河", "塞内加尔河"), "地理", "白尼罗河发源于维多利亚湖，其北岸与乌干达接壤，流经该国后继续流向苏丹。"),
            es = LocalizedContent("¿Qué río atraviesa Uganda?", listOf("Kagera", "Katonga", "Nilo Blanco", "Senegal"), "Geografía", "El Nilo Blanco nace en el lago Victoria, cuya orilla norte limita con Uganda, y atraviesa este país antes de continuar hacia Sudán.")
        ),
        BilingualQuestion(
            id = 9635, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("La capitale du Rwanda est...", listOf("Butare", "Muhanga", "Kigali", "Gisenyi"), "Géographie", "Kigali est la capitale et la plus grande ville du Rwanda, située au centre du pays. Elle est le principal centre politique, économique et culturel du Rwanda."),
            en = LocalizedContent("The capital of Rwanda is...", listOf("Butare", "Muhanga", "Kigali", "Gisenyi"), "Geography", "Kigali is the capital and largest city of Rwanda, located in the center of the country. It is the main political, economic, and cultural center of Rwanda."),
            zh = LocalizedContent("卢旺达的首都是...", listOf("布塔雷", "穆汉加", "基加利", "吉塞尼"), "地理", "基加利是卢旺达的首都和最大城市，位于该国中部。它是卢旺达的主要政治、经济和文化中心。"),
            es = LocalizedContent("La capital de Ruanda es...", listOf("Butare", "Muhanga", "Kigali", "Gisenyi"), "Geografía", "Kigali es la capital y ciudad más grande de Ruanda, situada en el centro del país. Es el principal centro político, económico y cultural de Ruanda.")
        ),
        BilingualQuestion(
            id = 9636, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand lac de l'Afrique centrale?", listOf("Lac Bangweolo", "Lac Mobutu", "Lac Maï-Ndombe", "Lac Kivu"), "Géographie", "Le lac Mobutu, aussi connu sous le nom de lac Albert, est le plus grand lac d'Afrique centrale, situé à la frontière entre l'Ouganda et la République démocratique du Congo."),
            en = LocalizedContent("What is the largest lake in Central Africa?", listOf("Lake Bangweulu", "Lake Mobutu", "Lake Mai-Ndombe", "Lake Kivu"), "Geography", "Lake Mobutu, also known as Lake Albert, is the largest lake in Central Africa, located on the border between Uganda and the Democratic Republic of the Congo."),
            zh = LocalizedContent("中非最大的湖泊是？", listOf("班韦乌卢湖", "莫布图湖", "马伊恩东贝湖", "基伍湖"), "地理", "莫布图湖，也称为艾伯特湖，是中非最大的湖泊，位于乌干达和刚果民主共和国边境。"),
            es = LocalizedContent("¿Cuál es el lago más grande de África Central?", listOf("Lago Bangweulu", "Lago Mobutu", "Lago Mai-Ndombe", "Lago Kivu"), "Geografía", "El lago Mobutu, también conocido como lago Alberto, es el lago más grande de África Central, situado en la frontera entre Uganda y la República Democrática del Congo.")
        ),
        BilingualQuestion(
            id = 9637, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("La capitale du Burundi est...", listOf("Bujumbura", "Gitega", "Ngozi", "Kayanza"), "Géographie", "Gitega est devenue la capitale politique du Burundi en 2019, remplaçant Bujumbura qui reste la capitale économique."),
            en = LocalizedContent("The capital of Burundi is...", listOf("Bujumbura", "Gitega", "Ngozi", "Kayanza"), "Geography", "Gitega became the political capital of Burundi in 2019, replacing Bujumbura which remains the economic capital."),
            zh = LocalizedContent("布隆迪的首都是...", listOf("布琼布拉", "基特加", "恩戈齐", "卡扬扎"), "地理", "基特加于2019年成为布隆迪的政治首都，取代布琼布拉，后者仍是经济首都。"),
            es = LocalizedContent("La capital de Burundi es...", listOf("Buyumbura", "Gitega", "Ngozi", "Kayanza"), "Geografía", "Gitega se convirtió en la capital política de Burundi en 2019, reemplazando a Buyumbura que sigue siendo la capital económica.")
        ),
        BilingualQuestion(
            id = 9638, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plus long fleuve d'Afrique centrale?", listOf("Chari", "Oubangui", "Congo", "Kasai"), "Géographie", "Le Congo est le plus long fleuve d'Afrique centrale, avec environ 4 700 km, traversant la République démocratique du Congo. Il est le deuxième plus long d'Afrique après le Nil."),
            en = LocalizedContent("What is the longest river in Central Africa?", listOf("Chari", "Ubangi", "Congo", "Kasai"), "Geography", "The Congo is the longest river in Central Africa, with about 4,700 km, flowing through the Democratic Republic of the Congo. It is the second longest in Africa after the Nile."),
            zh = LocalizedContent("中非最长的河流是？", listOf("沙里河", "乌班吉河", "刚果河", "开赛河"), "地理", "刚果河是中非最长的河流，长约4700公里，流经刚果民主共和国。它是非洲第二长河，仅次于尼罗河。"),
            es = LocalizedContent("¿Cuál es el río más largo de África Central?", listOf("Chari", "Ubangui", "Congo", "Kasai"), "Geografía", "El Congo es el río más largo de África Central, con unos 4.700 km, que atraviesa la República Democrática del Congo. Es el segundo más largo de África después del Nilo.")
        ),
        BilingualQuestion(
            id = 9639, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("La capitale de la République Démocratique du Congo est...", listOf("Lubumbashi", "Kananga", "Kinshasa", "Kisangani"), "Géographie", "Kinshasa est la capitale et la plus grande ville de la République Démocratique du Congo, située sur le fleuve Congo."),
            en = LocalizedContent("The capital of the Democratic Republic of the Congo is...", listOf("Lubumbashi", "Kananga", "Kinshasa", "Kisangani"), "Geography", "Kinshasa is the capital and largest city of the Democratic Republic of the Congo, located on the Congo River."),
            zh = LocalizedContent("刚果民主共和国的首都是...", listOf("卢本巴希", "卡南加", "金沙萨", "基桑加尼"), "地理", "金沙萨是刚果民主共和国的首都和最大城市，位于刚果河畔。"),
            es = LocalizedContent("La capital de la República Democrática del Congo es...", listOf("Lubumbashi", "Kananga", "Kinshasa", "Kisangani"), "Geografía", "Kinshasa es la capital y ciudad más grande de la República Democrática del Congo, situada en el río Congo.")
        ),
        BilingualQuestion(
            id = 9640, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plus grand bassin fluvial du monde?", listOf("Bassin du Gange", "Bassin du Congo", "Bassin de l'Amazone", "Bassin du Mississippi"), "Géographie", "Le bassin de l'Amazone couvre environ 7 millions de km², traversant neuf pays d'Amérique du Sud, ce qui en fait le plus vaste réseau hydrographique de la planète."),
            en = LocalizedContent("What is the largest river basin in the world?", listOf("Ganges Basin", "Congo Basin", "Amazon Basin", "Mississippi Basin"), "Geography", "The Amazon Basin covers approximately 7 million km², spanning nine South American countries, making it the largest river network on the planet."),
            zh = LocalizedContent("世界上最大的河流流域是哪个？", listOf("恒河流域", "刚果河流域", "亚马逊河流域", "密西西比河流域"), "地理", "亚马逊河流域面积约700万平方公里，流经南美洲九个国家，是地球上最大的水系网络。"),
            es = LocalizedContent("¿Cuál es la cuenca fluvial más grande del mundo?", listOf("Cuenca del Ganges", "Cuenca del Congo", "Cuenca del Amazonas", "Cuenca del Misisipi"), "Geografía", "La cuenca del Amazonas cubre aproximadamente 7 millones de km², abarcando nueve países de Sudamérica, lo que la convierte en la red hidrográfica más extensa del planeta.")
        ),
        BilingualQuestion(
            id = 9641, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("La capitale de la République du Congo est...", listOf("Dolisie", "Brazzaville", "Pointe-Noire", "Loubomo"), "Géographie", "Brazzaville est la capitale de la République du Congo, située sur la rive nord du fleuve Congo, en face de Kinshasa, la capitale de la République démocratique du Congo."),
            en = LocalizedContent("The capital of the Republic of the Congo is...", listOf("Dolisie", "Brazzaville", "Pointe-Noire", "Loubomo"), "Geography", "Brazzaville is the capital of the Republic of the Congo, located on the north bank of the Congo River, opposite Kinshasa, the capital of the Democratic Republic of the Congo."),
            zh = LocalizedContent("刚果共和国的首都是...", listOf("多利西", "布拉柴维尔", "黑角", "卢博莫"), "地理", "布拉柴维尔是刚果共和国的首都，位于刚果河北岸，与刚果民主共和国的首都金沙萨隔河相望。"),
            es = LocalizedContent("La capital de la República del Congo es...", listOf("Dolisie", "Brazzaville", "Pointe-Noire", "Loubomo"), "Geografía", "Brazzaville es la capital de la República del Congo, situada en la orilla norte del río Congo, frente a Kinshasa, la capital de la República Democrática del Congo.")
        ),
        BilingualQuestion(
            id = 9642, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand désert d'Afrique centrale?", listOf("Désert de Kgalagadi", "Désert du Kalahari", "Désert du Namib", "Désert de Sinai"), "Géographie", "Le Kalahari s'étend sur plusieurs pays d'Afrique australe, dont le Botswana et la Namibie, et est considéré comme le plus grand désert d'Afrique centrale."),
            en = LocalizedContent("What is the largest desert in Central Africa?", listOf("Kgalagadi Desert", "Kalahari Desert", "Namib Desert", "Sinai Desert"), "Geography", "The Kalahari extends across several southern African countries, including Botswana and Namibia, and is considered the largest desert in Central Africa."),
            zh = LocalizedContent("中非最大的沙漠是哪个？", listOf("卡拉哈迪沙漠", "卡拉哈里沙漠", "纳米布沙漠", "西奈沙漠"), "地理", "卡拉哈里沙漠横跨博茨瓦纳和纳米比亚等多个南部非洲国家，被认为是中非最大的沙漠。"),
            es = LocalizedContent("¿Cuál es el desierto más grande de África Central?", listOf("Desierto de Kgalagadi", "Desierto del Kalahari", "Desierto del Namib", "Desierto del Sinaí"), "Geografía", "El Kalahari se extiende por varios países del sur de África, incluidos Botsuana y Namibia, y se considera el desierto más grande de África Central.")
        ),
        BilingualQuestion(
            id = 9643, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("La capitale de l'Angola est...", listOf("Luanda", "Benguela", "Huambo", "Lobito"), "Géographie", "Luanda est la capitale et la plus grande ville d'Angola, située sur la côte atlantique. Elle fut fondée par les Portugais en 1575."),
            en = LocalizedContent("The capital of Angola is...", listOf("Luanda", "Benguela", "Huambo", "Lobito"), "Geography", "Luanda is the capital and largest city of Angola, located on the Atlantic coast. It was founded by the Portuguese in 1575."),
            zh = LocalizedContent("安哥拉的首都是...", listOf("罗安达", "本格拉", "万博", "洛比托"), "地理", "罗安达是安哥拉的首都和最大城市，位于大西洋沿岸，由葡萄牙人于1575年建立。"),
            es = LocalizedContent("La capital de Angola es...", listOf("Luanda", "Benguela", "Huambo", "Lobito"), "Geografía", "Luanda es la capital y ciudad más grande de Angola, situada en la costa atlántica. Fue fundada por los portugueses en 1575.")
        ),
        BilingualQuestion(
            id = 9644, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel fleuve est la frontière entre l'Angola et la Zambie?", listOf("Cassai", "Kwanza", "Zambèze", "Okavango"), "Géographie", "Le Zambèze marque une partie de la frontière entre l'Angola et la Zambie, notamment dans sa section supérieure avant de traverser la Namibie et le Botswana."),
            en = LocalizedContent("Which river forms the border between Angola and Zambia?", listOf("Kasai", "Kwanza", "Zambezi", "Okavango"), "Geography", "The Zambezi marks part of the border between Angola and Zambia, particularly in its upper section before flowing through Namibia and Botswana."),
            zh = LocalizedContent("哪条河流是安哥拉和赞比亚的边界？", listOf("开赛河", "宽扎河", "赞比西河", "奥卡万戈河"), "地理", "赞比西河在安哥拉和赞比亚之间形成部分边界，特别是在其上游河段，之后流经纳米比亚和博茨瓦纳。"),
            es = LocalizedContent("¿Qué río forma la frontera entre Angola y Zambia?", listOf("Kasai", "Kwanza", "Zambeze", "Okavango"), "Geografía", "El Zambeze marca parte de la frontera entre Angola y Zambia, especialmente en su sección superior antes de atravesar Namibia y Botsuana.")
        ),
        BilingualQuestion(
            id = 9645, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("La capitale de la Zambie est...", listOf("Kitwe", "Ndola", "Lusaka", "Livingstone"), "Géographie", "Lusaka est la capitale et la plus grande ville de la Zambie, située dans le centre-sud du pays. Elle a remplacé Livingstone comme capitale en 1935."),
            en = LocalizedContent("The capital of Zambia is...", listOf("Kitwe", "Ndola", "Lusaka", "Livingstone"), "Geography", "Lusaka is the capital and largest city of Zambia, located in the south-central part of the country. It replaced Livingstone as the capital in 1935."),
            zh = LocalizedContent("赞比亚的首都是...", listOf("基特韦", "恩多拉", "卢萨卡", "利文斯顿"), "地理", "卢萨卡是赞比亚的首都和最大城市，位于该国中南部，于1935年取代利文斯顿成为首都。"),
            es = LocalizedContent("La capital de Zambia es...", listOf("Kitwe", "Ndola", "Lusaka", "Livingstone"), "Geografía", "Lusaka es la capital y ciudad más grande de Zambia, ubicada en el centro-sur del país. Reemplazó a Livingstone como capital en 1935.")
        ),
        BilingualQuestion(
            id = 9646, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plus grand fleuve d'Afrique australe?", listOf("Okavango", "Kei", "Zambèze", "Limpopo"), "Géographie", "Le Zambèze est le plus long fleuve d'Afrique australe, s'écoulant sur environ 2 574 km à travers six pays avant de se jeter dans l'océan Indien."),
            en = LocalizedContent("What is the largest river in Southern Africa?", listOf("Okavango", "Kei", "Zambezi", "Limpopo"), "Geography", "The Zambezi is the longest river in Southern Africa, flowing approximately 2,574 km through six countries before emptying into the Indian Ocean."),
            zh = LocalizedContent("南部非洲最大的河流是哪个？", listOf("奥卡万戈河", "凯河", "赞比西河", "林波波河"), "地理", "赞比西河是南部非洲最长的河流，流经六个国家，全长约2574公里，最终注入印度洋。"),
            es = LocalizedContent("¿Cuál es el río más grande del sur de África?", listOf("Okavango", "Kei", "Zambeze", "Limpopo"), "Geografía", "El Zambeze es el río más largo del sur de África, con aproximadamente 2.574 km de longitud, fluyendo a través de seis países antes de desembocar en el océano Índico.")
        ),
        BilingualQuestion(
            id = 9647, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("La capitale du Zimbabwe est...", listOf("Bulawayo", "Harare", "Gweru", "Kwekwe"), "Géographie", "Harare est la capitale et la plus grande ville du Zimbabwe, située dans le nord-est du pays. Elle a succédé à Salisbury en 1982 après l'indépendance."),
            en = LocalizedContent("The capital of Zimbabwe is...", listOf("Bulawayo", "Harare", "Gweru", "Kwekwe"), "Geography", "Harare is the capital and largest city of Zimbabwe, located in the northeast of the country. It succeeded Salisbury in 1982 after independence."),
            zh = LocalizedContent("津巴布韦的首都是...", listOf("布拉瓦约", "哈拉雷", "圭鲁", "奎奎"), "地理", "哈拉雷是津巴布韦的首都和最大城市，位于该国东北部，独立后于1982年取代索尔兹伯里成为首都。"),
            es = LocalizedContent("La capital de Zimbabue es...", listOf("Bulawayo", "Harare", "Gweru", "Kwekwe"), "Geografía", "Harare es la capital y ciudad más grande de Zimbabue, ubicada en el noreste del país. Sucedió a Salisbury en 1982 tras la independencia.")
        ),
        BilingualQuestion(
            id = 9648, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel montagnes séparent le Zimbabwe et la Zambie?", listOf("Chaîne des Muchinga", "Monts Zambezi", "Chaîne Victoria", "Montagnes de Inyanga"), "Géographie", "La chaîne des Muchinga longe la vallée du Zambèze et forme une barrière naturelle entre la Zambie et le Zimbabwe."),
            en = LocalizedContent("Which mountains separate Zimbabwe and Zambia?", listOf("Muchinga Escarpment", "Zambezi Mountains", "Victoria Range", "Inyanga Mountains"), "Geography", "The Muchinga Escarpment runs along the Zambezi Valley and forms a natural barrier between Zambia and Zimbabwe."),
            zh = LocalizedContent("哪座山脉分隔了津巴布韦和赞比亚？", listOf("穆钦加山脉", "赞比西山脉", "维多利亚山脉", "伊尼扬加山脉"), "地理", "穆钦加山脉沿赞比西河谷延伸，形成了赞比亚和津巴布韦之间的天然屏障。"),
            es = LocalizedContent("¿Qué montañas separan Zimbabue y Zambia?", listOf("Escarpa de Muchinga", "Montañas Zambeze", "Cordillera Victoria", "Montañas Inyanga"), "Geografía", "La Escarpa de Muchinga recorre el valle del Zambeze y forma una barrera natural entre Zambia y Zimbabue.")
        ),
        BilingualQuestion(
            id = 9649, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("La capitale de la Namibie est...", listOf("Walvis Bay", "Windhoek", "Swakopmund", "Oshakati"), "Géographie", "Windhoek est la capitale de la Namibie depuis l'indépendance du pays en 1990, située dans le centre du territoire."),
            en = LocalizedContent("The capital of Namibia is...", listOf("Walvis Bay", "Windhoek", "Swakopmund", "Oshakati"), "Geography", "Windhoek has been the capital of Namibia since the country's independence in 1990, located in the central part of the territory."),
            zh = LocalizedContent("纳米比亚的首都是...", listOf("鲸湾港", "温得和克", "斯瓦科普蒙德", "奥沙卡蒂"), "地理", "温得和克自1990年纳米比亚独立以来一直是首都，位于该国中部。"),
            es = LocalizedContent("La capital de Namibia es...", listOf("Walvis Bay", "Windhoek", "Swakopmund", "Oshakati"), "Geografía", "Windhoek es la capital de Namibia desde la independencia del país en 1990, situada en la parte central del territorio.")
        ),
        BilingualQuestion(
            id = 9650, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel désert borde la Namibie?", listOf("Désert de Kalahari", "Désert du Namib", "Désert de la Kalahari", "Désert de l'Atacama"), "Géographie", "Le désert du Namib s'étend le long de la côte atlantique de la Namibie, donnant son nom au pays."),
            en = LocalizedContent("Which desert borders Namibia?", listOf("Kalahari Desert", "Namib Desert", "Kalahari Desert", "Atacama Desert"), "Geography", "The Namib Desert stretches along the Atlantic coast of Namibia, giving the country its name."),
            zh = LocalizedContent("哪个沙漠与纳米比亚接壤？", listOf("卡拉哈里沙漠", "纳米布沙漠", "卡拉哈里沙漠", "阿塔卡马沙漠"), "地理", "纳米布沙漠沿着纳米比亚的大西洋海岸延伸，该国因此得名。"),
            es = LocalizedContent("¿Qué desierto bordea Namibia?", listOf("Desierto de Kalahari", "Desierto del Namib", "Desierto de Kalahari", "Desierto de Atacama"), "Geografía", "El desierto del Namib se extiende a lo largo de la costa atlántica de Namibia, dando nombre al país.")
        ),
        BilingualQuestion(
            id = 9651, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("La capitale du Botswana est...", listOf("Francistown", "Gaborone", "Selibe-Phikwe", "Molepolole"), "Géographie", "Gaborone est la capitale du Botswana depuis 1965, remplaçant Mafeking qui se trouvait en Afrique du Sud. La ville a été choisie pour sa position centrale et sa proximité avec le chemin de fer."),
            en = LocalizedContent("The capital of Botswana is...", listOf("Francistown", "Gaborone", "Selibe-Phikwe", "Molepolole"), "Geography", "Gaborone has been the capital of Botswana since 1965, replacing Mafeking which was in South Africa. The city was chosen for its central position and proximity to the railway."),
            zh = LocalizedContent("博茨瓦纳的首都是...", listOf("弗朗西斯敦", "哈博罗内", "塞利贝-皮奎", "莫莱波洛莱"), "地理", "哈博罗内自1965年起成为博茨瓦纳首都，取代了位于南非的马弗京。该市因其中心位置和靠近铁路而被选中。"),
            es = LocalizedContent("La capital de Botsuana es...", listOf("Francistown", "Gaborone", "Selibe-Phikwe", "Molepolole"), "Geografía", "Gaborone es la capital de Botsuana desde 1965, reemplazando a Mafeking que se encontraba en Sudáfrica. La ciudad fue elegida por su posición central y su proximidad al ferrocarril.")
        ),
        BilingualQuestion(
            id = 9652, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand delta d'Afrique?", listOf("Delta de la Volta", "Delta du Niger", "Delta de l'Okavango", "Delta du Nil"), "Géographie", "Le delta de l'Okavango, au Botswana, est le plus grand delta intérieur d'Afrique, formé par le fleuve Okavango qui se déverse dans le désert du Kalahari."),
            en = LocalizedContent("What is the largest delta in Africa?", listOf("Volta Delta", "Niger Delta", "Okavango Delta", "Nile Delta"), "Geography", "The Okavango Delta in Botswana is the largest inland delta in Africa, formed by the Okavango River flowing into the Kalahari Desert."),
            zh = LocalizedContent("非洲最大的三角洲是哪个？", listOf("沃尔特三角洲", "尼日尔三角洲", "奥卡万戈三角洲", "尼罗河三角洲"), "地理", "博茨瓦纳的奥卡万戈三角洲是非洲最大的内陆三角洲，由奥卡万戈河流入卡拉哈里沙漠形成。"),
            es = LocalizedContent("¿Cuál es el delta más grande de África?", listOf("Delta del Volta", "Delta del Níger", "Delta del Okavango", "Delta del Nilo"), "Geografía", "El delta del Okavango en Botsuana es el delta interior más grande de África, formado por el río Okavango que desemboca en el desierto del Kalahari.")
        ),
        BilingualQuestion(
            id = 9653, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("La capitale de l'Afrique du Sud est...", listOf("Le Cap", "Johannesburg", "Pretoria", "Durban"), "Géographie", "L'Afrique du Sud est l'un des rares pays à avoir trois capitales : Pretoria (administrative), Le Cap (législative) et Bloemfontein (judiciaire). Pretoria abrite le siège du gouvernement."),
            en = LocalizedContent("The capital of South Africa is...", listOf("Cape Town", "Johannesburg", "Pretoria", "Durban"), "Geography", "South Africa is one of the few countries with three capitals: Pretoria (administrative), Cape Town (legislative), and Bloemfontein (judicial). Pretoria houses the seat of government."),
            zh = LocalizedContent("南非的首都是...", listOf("开普敦", "约翰内斯堡", "比勒陀利亚", "德班"), "地理", "南非是少数拥有三个首都的国家之一：比勒陀利亚（行政）、开普敦（立法）和布隆方丹（司法）。比勒陀利亚是政府所在地。"),
            es = LocalizedContent("La capital de Sudáfrica es...", listOf("Ciudad del Cabo", "Johannesburgo", "Pretoria", "Durban"), "Geografía", "Sudáfrica es uno de los pocos países con tres capitales: Pretoria (administrativa), Ciudad del Cabo (legislativa) y Bloemfontein (judicial). Pretoria alberga la sede del gobierno.")
        ),
        BilingualQuestion(
            id = 9654, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus haut sommet d'Afrique du Sud?", listOf("Pic d'Injasuthi", "Cathédrale du Drakensbergh", "Mont aux Sources", "Thabana Ntlenyana"), "Géographie", "Le plus haut sommet d'Afrique du Sud est la Cathédrale du Drakensbergh, culminant à 3 450 mètres dans la chaîne du Drakensberg."),
            en = LocalizedContent("What is the highest peak in South Africa?", listOf("Injasuthi Peak", "Cathedral Peak", "Mont-aux-Sources", "Thabana Ntlenyana"), "Geography", "The highest peak in South Africa is Cathedral Peak, rising to 3,450 meters in the Drakensberg range."),
            zh = LocalizedContent("南非的最高峰是哪个？", listOf("因贾苏提峰", "大教堂峰", "水源山", "塔巴纳恩特莱尼亚纳山"), "地理", "南非的最高峰是大教堂峰，位于德拉肯斯山脉，海拔3450米。"),
            es = LocalizedContent("¿Cuál es el pico más alto de Sudáfrica?", listOf("Pico Injasuthi", "Pico Catedral", "Mont-aux-Sources", "Thabana Ntlenyana"), "Geografía", "El pico más alto de Sudáfrica es el Pico Catedral, con 3.450 metros en la cordillera del Drakensberg.")
        ),
        BilingualQuestion(
            id = 9655, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("La capitale de la Lesotho est...", listOf("Teyateyaneng", "Maseru", "Leribe", "Mafeteng"), "Géographie", "Maseru est la capitale et la plus grande ville du Lesotho, un pays enclavé dans l'est de l'Afrique du Sud."),
            en = LocalizedContent("The capital of Lesotho is...", listOf("Teyateyaneng", "Maseru", "Leribe", "Mafeteng"), "Geography", "Maseru is the capital and largest city of Lesotho, a landlocked country in eastern South Africa."),
            zh = LocalizedContent("莱索托的首都是...", listOf("泰亚泰亚嫩", "马塞卢", "莱里贝", "马费滕"), "地理", "马塞卢是莱索托的首都和最大城市，莱索托是南非东部的一个内陆国家。"),
            es = LocalizedContent("La capital de Lesoto es...", listOf("Teyateyaneng", "Maseru", "Leribe", "Mafeteng"), "Geografía", "Maseru es la capital y ciudad más grande de Lesoto, un país sin litoral en el este de Sudáfrica.")
        ),
        BilingualQuestion(
            id = 9656, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand désert d'Afrique australe?", listOf("Désert du Namib", "Désert de Kgalagadi", "Désert du Kalahari", "Désert de la Kalahari"), "Géographie", "Le Kalahari s'étend sur plusieurs pays d'Afrique australe, dont le Botswana, la Namibie et l'Afrique du Sud, et couvre environ 900 000 km², ce qui en fait le plus grand désert de cette région."),
            en = LocalizedContent("What is the largest desert in Southern Africa?", listOf("Namib Desert", "Kgalagadi Desert", "Kalahari Desert", "Kalahari Desert"), "Geography", "The Kalahari extends across several Southern African countries, including Botswana, Namibia, and South Africa, covering about 900,000 km², making it the largest desert in this region."),
            zh = LocalizedContent("南部非洲最大的沙漠是哪个？", listOf("纳米布沙漠", "卡拉哈迪沙漠", "卡拉哈里沙漠", "卡拉哈里沙漠"), "地理", "卡拉哈里沙漠横跨多个南部非洲国家，包括博茨瓦纳、纳米比亚和南非，面积约90万平方公里，是该地区最大的沙漠。"),
            es = LocalizedContent("¿Cuál es el desierto más grande del África Austral?", listOf("Desierto del Namib", "Desierto de Kgalagadi", "Desierto del Kalahari", "Desierto del Kalahari"), "Geografía", "El Kalahari se extiende por varios países del África Austral, incluyendo Botsuana, Namibia y Sudáfrica, cubriendo unos 900.000 km², lo que lo convierte en el desierto más grande de esta región.")
        ),
        BilingualQuestion(
            id = 9657, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("La capitale de l'Eswatini est...", listOf("Manzini", "Mbabane", "Siteki", "Nhlangano"), "Géographie", "Mbabane est la capitale administrative et la plus grande ville d'Eswatini, un petit royaume d'Afrique australe."),
            en = LocalizedContent("The capital of Eswatini is...", listOf("Manzini", "Mbabane", "Siteki", "Nhlangano"), "Geography", "Mbabane is the administrative capital and largest city of Eswatini, a small kingdom in Southern Africa."),
            zh = LocalizedContent("斯威士兰的首都是...", listOf("曼齐尼", "姆巴巴内", "西特基", "恩赫兰加诺"), "地理", "姆巴巴内是斯威士兰的行政首都和最大城市，斯威士兰是南部非洲的一个小王国。"),
            es = LocalizedContent("La capital de Eswatini es...", listOf("Manzini", "Mbabane", "Siteki", "Nhlangano"), "Geografía", "Mbabane es la capital administrativa y ciudad más grande de Eswatini, un pequeño reino en el sur de África.")
        ),
        BilingualQuestion(
            id = 9658, correctIndex = 3, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel fleuve traverse l'Afrique du Sud?", listOf("Limpopo", "Vaal", "Orange", "Tous les trois"), "Géographie", "Les trois principaux fleuves d'Afrique du Sud sont l'Orange, le Limpopo et le Vaal, qui traversent tous le pays."),
            en = LocalizedContent("Which river flows through South Africa?", listOf("Limpopo", "Vaal", "Orange", "All three"), "Geography", "The three main rivers of South Africa are the Orange, Limpopo, and Vaal, all of which flow through the country."),
            zh = LocalizedContent("哪条河流经南非？", listOf("林波波河", "瓦尔河", "奥兰治河", "以上三条"), "地理", "南非的三条主要河流是奥兰治河、林波波河和瓦尔河，它们都流经该国。"),
            es = LocalizedContent("¿Qué río atraviesa Sudáfrica?", listOf("Limpopo", "Vaal", "Orange", "Los tres"), "Geografía", "Los tres principales ríos de Sudáfrica son el Orange, el Limpopo y el Vaal, todos ellos atraviesan el país.")
        ),
        BilingualQuestion(
            id = 9659, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("La capitale du Mozambique est...", listOf("Beira", "Maputo", "Quelimane", "Inhambane"), "Géographie", "Maputo, anciennement Lourenço Marques, est la capitale du Mozambique depuis l'indépendance du pays en 1975. Elle est située sur la côte sud-est de l'Afrique, au bord de l'océan Indien."),
            en = LocalizedContent("The capital of Mozambique is...", listOf("Beira", "Maputo", "Quelimane", "Inhambane"), "Geography", "Maputo, formerly Lourenço Marques, has been the capital of Mozambique since the country's independence in 1975. It is located on the southeast coast of Africa, on the Indian Ocean."),
            zh = LocalizedContent("莫桑比克的首都是...", listOf("贝拉", "马普托", "克利马内", "伊尼扬巴内"), "地理", "马普托，原名洛伦索-马贵斯，自1975年莫桑比克独立以来一直是首都。它位于非洲东南海岸，濒临印度洋。"),
            es = LocalizedContent("La capital de Mozambique es...", listOf("Beira", "Maputo", "Quelimane", "Inhambane"), "Geografía", "Maputo, anteriormente Lourenço Marques, es la capital de Mozambique desde la independencia del país en 1975. Está situada en la costa sureste de África, en el océano Índico.")
        ),
        BilingualQuestion(
            id = 9660, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand port d'Afrique australe?", listOf("Port de Maputo", "Port de Beira", "Port de Richards Bay", "Port de Durban"), "Géographie", "Le port de Durban, en Afrique du Sud, est le plus grand et le plus actif d'Afrique australe, traitant la majorité du trafic maritime de la région."),
            en = LocalizedContent("What is the largest port in Southern Africa?", listOf("Port of Maputo", "Port of Beira", "Port of Richards Bay", "Port of Durban"), "Geography", "The Port of Durban, in South Africa, is the largest and busiest port in Southern Africa, handling the majority of the region's maritime traffic."),
            zh = LocalizedContent("南部非洲最大的港口是哪个？", listOf("马普托港", "贝拉港", "理查兹湾港", "德班港"), "地理", "南非的德班港是南部非洲最大、最繁忙的港口，处理该地区大部分海上交通。"),
            es = LocalizedContent("¿Cuál es el puerto más grande del África Austral?", listOf("Puerto de Maputo", "Puerto de Beira", "Puerto de Richards Bay", "Puerto de Durban"), "Geografia", "El puerto de Durban, en Sudáfrica, es el más grande y activo del África Austral, manejando la mayor parte del tráfico marítimo de la región.")
        ),
        BilingualQuestion(
            id = 9661, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("La capitale de Madagascar est...", listOf("Antsirabe", "Toliara", "Antananarivo", "Mahajanga"), "Géographie", "Antananarivo est la capitale de Madagascar depuis l'époque du royaume merina au XVIIIe siècle. Son nom signifie « la ville des mille guerriers » en malgache."),
            en = LocalizedContent("The capital of Madagascar is...", listOf("Antsirabe", "Toliara", "Antananarivo", "Mahajanga"), "Geography", "Antananarivo has been the capital of Madagascar since the Merina kingdom in the 18th century. Its name means 'the city of a thousand warriors' in Malagasy."),
            zh = LocalizedContent("马达加斯加的首都是...", listOf("安齐拉贝", "图利亚拉", "塔那那利佛", "马哈赞加"), "地理", "塔那那利佛自18世纪梅里纳王国时期起就是马达加斯加的首都。其名称在马达加斯加语中意为“千勇士之城”。"),
            es = LocalizedContent("La capital de Madagascar es...", listOf("Antsirabe", "Toliara", "Antananarivo", "Mahajanga"), "Geografia", "Antananarivo es la capital de Madagascar desde la época del reino merina en el siglo XVIII. Su nombre significa 'la ciudad de los mil guerreros' en malgache.")
        ),
        BilingualQuestion(
            id = 9662, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel océan entoure Madagascar?", listOf("Océan Atlantique", "Océan Indien", "Océan Pacifique", "Golfe du Bengale"), "Géographie", "Madagascar est une île située dans l'océan Indien, au large de la côte sud-est de l'Afrique."),
            en = LocalizedContent("Which ocean surrounds Madagascar?", listOf("Atlantic Ocean", "Indian Ocean", "Pacific Ocean", "Bay of Bengal"), "Geography", "Madagascar is an island located in the Indian Ocean, off the southeastern coast of Africa."),
            zh = LocalizedContent("哪个海洋环绕马达加斯加？", listOf("大西洋", "印度洋", "太平洋", "孟加拉湾"), "地理", "马达加斯加是一个位于印度洋的岛屿，在非洲东南海岸附近。"),
            es = LocalizedContent("¿Qué océano rodea Madagascar?", listOf("Océano Atlántico", "Océano Índico", "Océano Pacífico", "Golfo de Bengala"), "Geografia", "Madagascar es una isla situada en el océano Índico, frente a la costa sureste de África.")
        ),
        BilingualQuestion(
            id = 9663, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("La capitale des Seychelles est...", listOf("Mahe", "Victoria", "Praslin", "La Digue"), "Géographie", "Victoria est la capitale des Seychelles, située sur l'île de Mahé. C'est la seule ville du pays et elle abrite la majorité de sa population."),
            en = LocalizedContent("The capital of Seychelles is...", listOf("Mahe", "Victoria", "Praslin", "La Digue"), "Geography", "Victoria is the capital of Seychelles, located on the island of Mahé. It is the only city in the country and houses the majority of its population."),
            zh = LocalizedContent("塞舌尔的首都是...", listOf("马埃", "维多利亚", "普拉兰", "拉迪格"), "地理", "维多利亚是塞舌尔的首都，位于马埃岛上。它是该国唯一的城市，居住着大部分人口。"),
            es = LocalizedContent("La capital de Seychelles es...", listOf("Mahé", "Victoria", "Praslin", "La Digue"), "Geografia", "Victoria es la capital de Seychelles, situada en la isla de Mahé. Es la única ciudad del país y alberga la mayoría de su población.")
        ),
        BilingualQuestion(
            id = 9664, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand port d'Afrique de l'Ouest?", listOf("Port de Casablanca", "Port de Lagos", "Port de Dakar", "Port d'Abidjan"), "Géographie", "Le port de Lagos, au Nigeria, est le plus grand et le plus actif d'Afrique de l'Ouest, traitant une part majeure du commerce maritime régional."),
            en = LocalizedContent("What is the largest port in West Africa?", listOf("Port of Casablanca", "Port of Lagos", "Port of Dakar", "Port of Abidjan"), "Geography", "The Port of Lagos, in Nigeria, is the largest and busiest port in West Africa, handling a major share of regional maritime trade."),
            zh = LocalizedContent("西非最大的港口是哪个？", listOf("卡萨布兰卡港", "拉各斯港", "达喀尔港", "阿比让港"), "地理", "尼日利亚的拉各斯港是西非最大、最繁忙的港口，处理该地区大部分海上贸易。"),
            es = LocalizedContent("¿Cuál es el puerto más grande de África Occidental?", listOf("Puerto de Casablanca", "Puerto de Lagos", "Puerto de Dakar", "Puerto de Abiyán"), "Geografia", "El puerto de Lagos, en Nigeria, es el más grande y activo de África Occidental, manejando una parte importante del comercio marítimo regional.")
        ),
        BilingualQuestion(
            id = 9665, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("La capitale du Mauritanie est...", listOf("Atar", "Tidjikja", "Nouakchott", "Kaédi"), "Géographie", "Nouakchott est la capitale de la Mauritanie depuis 1958, choisie pour sa position centrale sur la côte atlantique."),
            en = LocalizedContent("The capital of Mauritania is...", listOf("Atar", "Tidjikja", "Nouakchott", "Kaédi"), "Geography", "Nouakchott has been the capital of Mauritania since 1958, chosen for its central position on the Atlantic coast."),
            zh = LocalizedContent("毛里塔尼亚的首都是...", listOf("阿塔尔", "提吉克贾", "努瓦克肖特", "卡埃迪"), "地理", "努瓦克肖特自1958年起成为毛里塔尼亚的首都，因其位于大西洋沿岸的中心位置而被选中。"),
            es = LocalizedContent("La capital de Mauritania es...", listOf("Atar", "Tidjikja", "Nuakchot", "Kaédi"), "Geografia", "Nuakchot es la capital de Mauritania desde 1958, elegida por su posición central en la costa atlántica.")
        ),
        BilingualQuestion(
            id = 9666, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand désert de l'Afrique de l'Ouest?", listOf("Désert du Ténéré", "Sahara", "Désert du Namib", "Désert du Kalahari"), "Géographie", "Le Sahara s'étend sur plusieurs pays d'Afrique du Nord et de l'Ouest, comme le Mali, le Niger et la Mauritanie, ce qui en fait le plus vaste désert chaud de la région."),
            en = LocalizedContent("What is the largest desert in West Africa?", listOf("Ténéré Desert", "Sahara", "Namib Desert", "Kalahari Desert"), "Geography", "The Sahara extends across several countries in North and West Africa, such as Mali, Niger, and Mauritania, making it the largest hot desert in the region."),
            zh = LocalizedContent("西非最大的沙漠是哪个？", listOf("泰内雷沙漠", "撒哈拉沙漠", "纳米布沙漠", "卡拉哈里沙漠"), "地理", "撒哈拉沙漠横跨北非和西非的多个国家，如马里、尼日尔和毛里塔尼亚，是该地区最大的热带沙漠。"),
            es = LocalizedContent("¿Cuál es el desierto más grande de África Occidental?", listOf("Desierto del Teneré", "Sáhara", "Desierto del Namib", "Desierto del Kalahari"), "Geografia", "El Sáhara se extiende por varios países del norte y oeste de África, como Malí, Níger y Mauritania, siendo el desierto cálido más extenso de la región.")
        ),
        BilingualQuestion(
            id = 9667, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("La capitale du Sénégal est...", listOf("Saint-Louis", "Kaolack", "Dakar", "Tambacounda"), "Géographie", "Dakar est la capitale du Sénégal depuis l'indépendance en 1960. Située sur la presqu'île du Cap-Vert, c'est la ville la plus peuplée du pays."),
            en = LocalizedContent("The capital of Senegal is...", listOf("Saint-Louis", "Kaolack", "Dakar", "Tambacounda"), "Geography", "Dakar has been the capital of Senegal since independence in 1960. Located on the Cap-Vert peninsula, it is the most populous city in the country."),
            zh = LocalizedContent("塞内加尔的首都是...", listOf("圣路易", "考拉克", "达喀尔", "坦巴昆达"), "地理", "达喀尔自1960年独立以来一直是塞内加尔的首都。位于佛得角半岛，是该国人口最多的城市。"),
            es = LocalizedContent("La capital de Senegal es...", listOf("Saint-Louis", "Kaolack", "Dakar", "Tambacounda"), "Geografia", "Dakar es la capital de Senegal desde la independencia en 1960. Situada en la península de Cabo Verde, es la ciudad más poblada del país.")
        ),
        BilingualQuestion(
            id = 9668, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel fleuve traverse le Sénégal?", listOf("Niger", "Sénégal", "Gambie", "Volta"), "Géographie", "Le fleuve Sénégal prend sa source en Guinée et sert de frontière entre le Sénégal et la Mauritanie avant de se jeter dans l'océan Atlantique."),
            en = LocalizedContent("Which river flows through Senegal?", listOf("Niger", "Senegal", "Gambia", "Volta"), "Geography", "The Senegal River rises in Guinea and forms the border between Senegal and Mauritania before flowing into the Atlantic Ocean."),
            zh = LocalizedContent("哪条河流经塞内加尔？", listOf("尼日尔河", "塞内加尔河", "冈比亚河", "沃尔特河"), "地理", "塞内加尔河发源于几内亚，构成塞内加尔和毛里塔尼亚之间的边界，然后流入大西洋。"),
            es = LocalizedContent("¿Qué río atraviesa Senegal?", listOf("Níger", "Senegal", "Gambia", "Volta"), "Geografia", "El río Senegal nace en Guinea y sirve de frontera entre Senegal y Mauritania antes de desembocar en el océano Atlántico.")
        ),
        BilingualQuestion(
            id = 9669, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("La capitale de la Gambie est...", listOf("Serekunda", "Banjul", "Bakau", "Farafenni"), "Géographie", "Banjul est située sur l'île de Sainte-Marie, à l'embouchure du fleuve Gambie, et a été choisie comme capitale en 1965 lors de l'indépendance du pays."),
            en = LocalizedContent("The capital of Gambia is...", listOf("Serekunda", "Banjul", "Bakau", "Farafenni"), "Geography", "Banjul is located on St. Mary's Island, at the mouth of the Gambia River, and was chosen as the capital in 1965 upon the country's independence."),
            zh = LocalizedContent("冈比亚的首都是...", listOf("塞雷昆达", "班珠尔", "巴考", "法拉费尼"), "地理", "班珠尔位于圣玛丽岛，冈比亚河河口，于1965年该国独立时被选为首都。"),
            es = LocalizedContent("La capital de Gambia es...", listOf("Serekunda", "Banjul", "Bakau", "Farafenni"), "Geografia", "Banjul está situada en la isla de Santa María, en la desembocadura del río Gambia, y fue elegida como capital en 1965 tras la independencia del país.")
        ),
    )

    private fun part4(): List<BilingualQuestion> = listOf(
        BilingualQuestion(
            id = 9670, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus petit pays d'Afrique?", listOf("Malawi", "Seychelles", "Djibouti", "Mauritanie"), "Géographie", "Les Seychelles sont un archipel de l'océan Indien, avec une superficie totale d'environ 455 km², ce qui en fait le plus petit pays d'Afrique en termes de surface terrestre."),
            en = LocalizedContent("What is the smallest country in Africa?", listOf("Malawi", "Seychelles", "Djibouti", "Mauritania"), "Geography", "The Seychelles is an archipelago in the Indian Ocean, with a total area of about 455 km², making it the smallest country in Africa in terms of land area."),
            zh = LocalizedContent("非洲最小的国家是哪个？", listOf("马拉维", "塞舌尔", "吉布提", "毛里塔尼亚"), "地理", "塞舌尔是印度洋上的群岛国家，总面积约455平方公里，是非洲陆地面积最小的国家。"),
            es = LocalizedContent("¿Cuál es el país más pequeño de África?", listOf("Malaui", "Seychelles", "Yibuti", "Mauritania"), "Geografía", "Seychelles es un archipiélago en el océano Índico, con una superficie total de aproximadamente 455 km², lo que lo convierte en el país más pequeño de África en términos de superficie terrestre.")
        ),
        BilingualQuestion(
            id = 9671, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("La capitale de la Guinée-Bissau est...", listOf("Gabu", "Bolama", "Bissau", "Cacheu"), "Géographie", "Bissau est à la fois la capitale et la plus grande ville de la Guinée-Bissau, située sur l'estuaire du fleuve Geba."),
            en = LocalizedContent("The capital of Guinea-Bissau is...", listOf("Gabu", "Bolama", "Bissau", "Cacheu"), "Geography", "Bissau is both the capital and the largest city of Guinea-Bissau, located on the estuary of the Geba River."),
            zh = LocalizedContent("几内亚比绍的首都是...", listOf("加布", "博拉马", "比绍", "卡谢乌"), "地理", "比绍是几内亚比绍的首都和最大城市，位于热巴河河口。"),
            es = LocalizedContent("La capital de Guinea-Bisáu es...", listOf("Gabú", "Bolama", "Bisáu", "Cacheu"), "Geografía", "Bisáu es la capital y la ciudad más grande de Guinea-Bisáu, situada en el estuario del río Geba.")
        ),
        BilingualQuestion(
            id = 9672, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel fleuve traverse la Guinée-Bissau?", listOf("Corubal", "Cacheu", "Geba", "Tous les trois"), "Géographie", "Le fleuve Geba, le fleuve Cacheu et le fleuve Corubal traversent tous la Guinée-Bissau."),
            en = LocalizedContent("Which river flows through Guinea-Bissau?", listOf("Corubal", "Cacheu", "Geba", "All three"), "Geography", "The Geba River, the Cacheu River, and the Corubal River all flow through Guinea-Bissau."),
            zh = LocalizedContent("哪条河流经几内亚比绍？", listOf("科鲁巴尔河", "卡谢乌河", "热巴河", "以上三条"), "地理", "热巴河、卡谢乌河和科鲁巴尔河都流经几内亚比绍。"),
            es = LocalizedContent("¿Qué río atraviesa Guinea-Bisáu?", listOf("Corubal", "Cacheu", "Geba", "Los tres"), "Geografía", "El río Geba, el río Cacheu y el río Corubal atraviesan Guinea-Bisáu.")
        ),
        BilingualQuestion(
            id = 9673, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("La capitale de la Guinée est...", listOf("Kindia", "Mamou", "Conakry", "Forécariah"), "Géographie", "Conakry est la capitale et la plus grande ville de la Guinée, située sur la côte atlantique."),
            en = LocalizedContent("The capital of Guinea is...", listOf("Kindia", "Mamou", "Conakry", "Forécariah"), "Geography", "Conakry is the capital and largest city of Guinea, located on the Atlantic coast."),
            zh = LocalizedContent("几内亚的首都是...", listOf("金迪亚", "马穆", "科纳克里", "福雷卡里亚"), "地理", "科纳克里是几内亚的首都和最大城市，位于大西洋沿岸。"),
            es = LocalizedContent("La capital de Guinea es...", listOf("Kindia", "Mamú", "Conakri", "Forécariah"), "Geografía", "Conakri es la capital y la ciudad más grande de Guinea, situada en la costa atlántica.")
        ),
        BilingualQuestion(
            id = 9674, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel montagnes forment la frontière entre la Guinée et la Côte d'Ivoire?", listOf("Chaîne des Nimba", "Monts du Fouta-Djallon", "Chaîne du Simandou", "Montagnes du Gaoual"), "Géographie", "La chaîne des Nimba, située à cheval entre la Guinée, la Côte d'Ivoire et le Liberia, constitue la frontière naturelle entre la Guinée et la Côte d'Ivoire."),
            en = LocalizedContent("Which mountains form the border between Guinea and Côte d'Ivoire?", listOf("Nimba Range", "Fouta Djallon Highlands", "Simandou Range", "Gaoual Mountains"), "Geography", "The Nimba Range, straddling Guinea, Côte d'Ivoire, and Liberia, forms the natural border between Guinea and Côte d'Ivoire."),
            zh = LocalizedContent("哪些山脉构成了几内亚和科特迪瓦的边界？", listOf("宁巴山脉", "富塔贾隆高原", "西芒杜山脉", "加瓦尔山脉"), "地理", "宁巴山脉横跨几内亚、科特迪瓦和利比里亚，构成了几内亚和科特迪瓦之间的天然边界。"),
            es = LocalizedContent("¿Qué montañas forman la frontera entre Guinea y Costa de Marfil?", listOf("Cordillera de Nimba", "Macizo de Fouta Yallon", "Cordillera de Simandou", "Montañas de Gaoual"), "Geografía", "La cordillera de Nimba, situada entre Guinea, Costa de Marfil y Liberia, constituye la frontera natural entre Guinea y Costa de Marfil.")
        ),
        BilingualQuestion(
            id = 9675, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("La capitale de la Sierra Leone est...", listOf("Bo", "Kenema", "Freetown", "Makeni"), "Géographie", "Freetown a été fondée en 1787 comme refuge pour les esclaves affranchis, d'où son nom. Elle est le principal port et centre politique du pays."),
            en = LocalizedContent("The capital of Sierra Leone is...", listOf("Bo", "Kenema", "Freetown", "Makeni"), "Geography", "Freetown was founded in 1787 as a refuge for freed slaves, hence its name. It is the main port and political center of the country."),
            zh = LocalizedContent("塞拉利昂的首都是...", listOf("博城", "凯内马", "弗里敦", "马克尼"), "地理", "弗里敦于1787年建立，作为被解放奴隶的避难所，因此得名。它是该国的主要港口和政治中心。"),
            es = LocalizedContent("La capital de Sierra Leona es...", listOf("Bo", "Kenema", "Freetown", "Makeni"), "Geografía", "Freetown fue fundada en 1787 como refugio para esclavos liberados, de ahí su nombre. Es el principal puerto y centro político del país.")
        ),
        BilingualQuestion(
            id = 9676, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plus grand fleuve d'Afrique de l'Ouest?", listOf("Volta", "Sénégal", "Niger", "Gambie"), "Géographie", "Le Niger est le plus long fleuve d'Afrique de l'Ouest, avec environ 4 180 km, traversant plusieurs pays comme le Mali, le Niger et le Nigeria avant de se jeter dans le golfe de Guinée."),
            en = LocalizedContent("What is the largest river in West Africa?", listOf("Volta", "Senegal", "Niger", "Gambia"), "Geography", "The Niger is the longest river in West Africa, with about 4,180 km, flowing through several countries such as Mali, Niger, and Nigeria before emptying into the Gulf of Guinea."),
            zh = LocalizedContent("西非最大的河流是哪条？", listOf("沃尔特河", "塞内加尔河", "尼日尔河", "冈比亚河"), "地理", "尼日尔河是西非最长的河流，长约4180公里，流经马里、尼日尔和尼日利亚等多个国家，最终注入几内亚湾。"),
            es = LocalizedContent("¿Cuál es el río más grande de África Occidental?", listOf("Volta", "Senegal", "Níger", "Gambia"), "Geografía", "El Níger es el río más largo de África Occidental, con unos 4.180 km, que atraviesa varios países como Malí, Níger y Nigeria antes de desembocar en el golfo de Guinea.")
        ),
        BilingualQuestion(
            id = 9677, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("La capitale du Liberia est...", listOf("Monrovia", "Buchanan", "Harper", "Gbarnga"), "Géographie", "Monrovia a été nommée en l'honneur de James Monroe, le cinquième président des États-Unis, en raison du rôle de l'American Colonization Society dans la colonisation du Liberia."),
            en = LocalizedContent("The capital of Liberia is...", listOf("Monrovia", "Buchanan", "Harper", "Gbarnga"), "Geography", "Monrovia was named in honor of James Monroe, the fifth president of the United States, due to the role of the American Colonization Society in the colonization of Liberia."),
            zh = LocalizedContent("利比里亚的首都是...", listOf("蒙罗维亚", "布坎南", "哈珀", "邦加"), "地理", "蒙罗维亚以美国第五任总统詹姆斯·门罗的名字命名，因为美国殖民协会在利比里亚殖民中发挥了作用。"),
            es = LocalizedContent("La capital de Liberia es...", listOf("Monrovia", "Buchanan", "Harper", "Gbarnga"), "Geografía", "Monrovia fue nombrada en honor a James Monroe, el quinto presidente de los Estados Unidos, debido al papel de la American Colonization Society en la colonización de Liberia.")
        ),
        BilingualQuestion(
            id = 9678, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel mont abritent la plus grande forêt d'Afrique?", listOf("Mont Cameroun", "Mont Kilimandjarou", "Aucune réponse", "Mont Kenia"), "Géographie", "Aucun mont africain n'abrite la plus grande forêt du continent. La plus grande forêt d'Afrique est le bassin du Congo, une vaste région de plaine."),
            en = LocalizedContent("Which mountain is home to the largest forest in Africa?", listOf("Mount Cameroon", "Mount Kilimanjaro", "None of the above", "Mount Kenya"), "Geography", "No African mountain is home to the largest forest on the continent. The largest forest in Africa is the Congo Basin, a vast lowland region."),
            zh = LocalizedContent("哪座山拥有非洲最大的森林？", listOf("喀麦隆山", "乞力马扎罗山", "以上都不是", "肯尼亚山"), "地理", "没有非洲山脉拥有非洲最大的森林。非洲最大的森林是刚果盆地，一个广阔的平原地区。"),
            es = LocalizedContent("¿Qué montaña alberga el bosque más grande de África?", listOf("Monte Camerún", "Monte Kilimanjaro", "Ninguna de las anteriores", "Monte Kenia"), "Geografía", "Ninguna montaña africana alberga el bosque más grande del continente. El bosque más grande de África es la cuenca del Congo, una vasta región de tierras bajas.")
        ),
        BilingualQuestion(
            id = 9679, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("La capitale de la Côte d'Ivoire est...", listOf("Abidjan", "Bouaké", "Yamoussoukro", "Gagnoa"), "Géographie", "Yamoussoukro est la capitale politique et administrative de la Côte d'Ivoire depuis 1983, remplaçant Abidjan qui reste la capitale économique."),
            en = LocalizedContent("The capital of Côte d'Ivoire is...", listOf("Abidjan", "Bouaké", "Yamoussoukro", "Gagnoa"), "Geography", "Yamoussoukro has been the political and administrative capital of Côte d'Ivoire since 1983, replacing Abidjan which remains the economic capital."),
            zh = LocalizedContent("科特迪瓦的首都是...", listOf("阿比让", "布瓦凯", "亚穆苏克罗", "加尼奥阿"), "地理", "自1983年以来，亚穆苏克罗一直是科特迪瓦的政治和行政首都，取代了仍为经济首都的阿比让。"),
            es = LocalizedContent("La capital de Costa de Marfil es...", listOf("Abiyán", "Bouaké", "Yamusukro", "Gagnoa"), "Geografía", "Yamusukro ha sido la capital política y administrativa de Costa de Marfil desde 1983, reemplazando a Abiyán que sigue siendo la capital económica.")
        ),
        BilingualQuestion(
            id = 9680, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel fleuve traverse la Côte d'Ivoire?", listOf("Comoé", "Bandama", "Sassandra", "Tous les trois"), "Géographie", "Les fleuves Comoé, Bandama et Sassandra traversent tous la Côte d'Ivoire du nord au sud pour se jeter dans l'océan Atlantique."),
            en = LocalizedContent("Which river flows through Ivory Coast?", listOf("Comoé", "Bandama", "Sassandra", "All three"), "Geography", "The Comoé, Bandama, and Sassandra rivers all flow through Ivory Coast from north to south into the Atlantic Ocean."),
            zh = LocalizedContent("哪条河流经科特迪瓦？", listOf("科莫埃河", "班达马河", "萨桑德拉河", "以上全部"), "地理", "科莫埃河、班达马河和萨桑德拉河都从北向南流经科特迪瓦，注入大西洋。"),
            es = LocalizedContent("¿Qué río atraviesa Costa de Marfil?", listOf("Comoé", "Bandama", "Sassandra", "Los tres"), "Geografia", "Los ríos Comoé, Bandama y Sassandra atraviesan Costa de Marfil de norte a sur para desembocar en el océano Atlántico.")
        ),
        BilingualQuestion(
            id = 9681, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("La capitale du Ghana est...", listOf("Kumasi", "Accra", "Sekondi", "Tamale"), "Géographie", "Accra est la capitale et la plus grande ville du Ghana, située sur la côte atlantique du pays."),
            en = LocalizedContent("The capital of Ghana is...", listOf("Kumasi", "Accra", "Sekondi", "Tamale"), "Geography", "Accra is the capital and largest city of Ghana, located on the Atlantic coast of the country."),
            zh = LocalizedContent("加纳的首都是...", listOf("库马西", "阿克拉", "塞康第", "塔马利"), "地理", "阿克拉是加纳的首都和最大城市，位于该国的大西洋沿岸。"),
            es = LocalizedContent("La capital de Ghana es...", listOf("Kumasi", "Accra", "Sekondi", "Tamale"), "Geografia", "Accra es la capital y ciudad más grande de Ghana, situada en la costa atlántica del país.")
        ),
        BilingualQuestion(
            id = 9682, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel fleuve traverse le Ghana?", listOf("Ankobra", "Volta", "Pra", "Tous les trois"), "Géographie", "Le Ghana est traversé par trois fleuves principaux : la Volta Noire, la Volta Blanche et la Volta Rouge, qui se rejoignent pour former le fleuve Volta."),
            en = LocalizedContent("Which river flows through Ghana?", listOf("Ankobra", "Volta", "Pra", "All three"), "Geography", "Ghana is crossed by three main rivers: the Black Volta, White Volta, and Red Volta, which join to form the Volta River."),
            zh = LocalizedContent("哪条河流经加纳？", listOf("安科布拉河", "沃尔特河", "普拉河", "以上全部"), "地理", "加纳有三条主要河流：黑沃尔特河、白沃尔特河和红沃尔特河，它们汇合形成沃尔特河。"),
            es = LocalizedContent("¿Qué río atraviesa Ghana?", listOf("Ankobra", "Volta", "Pra", "Los tres"), "Geografia", "Ghana está atravesada por tres ríos principales: el Volta Negro, el Volta Blanco y el Volta Rojo, que se unen para formar el río Volta.")
        ),
        BilingualQuestion(
            id = 9683, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("La capitale du Togo est...", listOf("Lomé", "Kara", "Sokodé", "Atakpamé"), "Géographie", "Lomé est la capitale et la plus grande ville du Togo, située sur la côte du Golfe de Guinée. Elle est le principal port et centre économique du pays."),
            en = LocalizedContent("The capital of Togo is...", listOf("Lomé", "Kara", "Sokodé", "Atakpamé"), "Geography", "Lomé is the capital and largest city of Togo, located on the coast of the Gulf of Guinea. It is the country's main port and economic center."),
            zh = LocalizedContent("多哥的首都是...", listOf("洛美", "卡拉", "索科德", "阿塔帕梅"), "地理", "洛美是多哥的首都和最大城市，位于几内亚湾沿岸，是该国的主要港口和经济中心。"),
            es = LocalizedContent("La capital de Togo es...", listOf("Lomé", "Kara", "Sokodé", "Atakpamé"), "Geografia", "Lomé es la capital y ciudad más grande de Togo, situada en la costa del Golfo de Guinea. Es el principal puerto y centro económico del país.")
        ),
        BilingualQuestion(
            id = 9684, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel fleuve traverse le Togo?", listOf("Mono", "Ankobra", "Volta", "Pra"), "Géographie", "Le Mono prend sa source au Bénin et traverse le Togo sur environ 400 kilomètres avant de se jeter dans l'océan Atlantique, formant la frontière entre les deux pays."),
            en = LocalizedContent("Which river flows through Togo?", listOf("Mono", "Ankobra", "Volta", "Pra"), "Geography", "The Mono River rises in Benin and flows through Togo for about 400 kilometers before emptying into the Atlantic Ocean, forming the border between the two countries."),
            zh = LocalizedContent("哪条河流经多哥？", listOf("莫诺河", "安科布拉河", "沃尔特河", "普拉河"), "地理", "莫诺河发源于贝宁，流经多哥约400公里后注入大西洋，形成两国边界。"),
            es = LocalizedContent("¿Qué río atraviesa Togo?", listOf("Mono", "Ankobra", "Volta", "Pra"), "Geografia", "El río Mono nace en Benín y atraviesa Togo durante unos 400 kilómetros antes de desembocar en el océano Atlántico, formando la frontera entre ambos países.")
        ),
        BilingualQuestion(
            id = 9685, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("La capitale du Bénin est...", listOf("Cotonou", "Abomey", "Porto-Novo", "Parakou"), "Géographie", "Porto-Novo est la capitale officielle du Bénin, tandis que Cotonou est la capitale économique et le siège du gouvernement."),
            en = LocalizedContent("The capital of Benin is...", listOf("Cotonou", "Abomey", "Porto-Novo", "Parakou"), "Geography", "Porto-Novo is the official capital of Benin, while Cotonou is the economic capital and seat of government."),
            zh = LocalizedContent("贝宁的首都是...", listOf("科托努", "阿波美", "波多诺伏", "帕拉库"), "地理", "波多诺伏是贝宁的官方首都，而科托努是经济首都和政府所在地。"),
            es = LocalizedContent("La capital de Benín es...", listOf("Cotonú", "Abomey", "Porto-Novo", "Parakou"), "Geografia", "Porto-Novo es la capital oficial de Benín, mientras que Cotonú es la capital económica y sede del gobierno.")
        ),
        BilingualQuestion(
            id = 9686, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel fleuve traverse le Bénin?", listOf("Volta", "Niger", "Comoé", "Sénégal"), "Géographie", "Le fleuve Niger traverse le Bénin sur sa partie nord, formant une frontière naturelle avec le Niger."),
            en = LocalizedContent("Which river flows through Benin?", listOf("Volta", "Niger", "Comoé", "Senegal"), "Geography", "The Niger River flows through the northern part of Benin, forming a natural border with Niger."),
            zh = LocalizedContent("哪条河流经贝宁？", listOf("沃尔特河", "尼日尔河", "科莫埃河", "塞内加尔河"), "地理", "尼日尔河流经贝宁北部，与尼日尔形成天然边界。"),
            es = LocalizedContent("¿Qué río atraviesa Benín?", listOf("Volta", "Níger", "Comoé", "Senegal"), "Geografia", "El río Níger atraviesa la parte norte de Benín, formando una frontera natural con Níger.")
        ),
        BilingualQuestion(
            id = 9687, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("La capitale du Nigéria est...", listOf("Lagos", "Ibadan", "Abuja", "Kano"), "Géographie", "Abuja a remplacé Lagos comme capitale du Nigéria en 1991, choisie pour sa position centrale et moins peuplée."),
            en = LocalizedContent("The capital of Nigeria is...", listOf("Lagos", "Ibadan", "Abuja", "Kano"), "Geography", "Abuja replaced Lagos as the capital of Nigeria in 1991, chosen for its central location and lower population."),
            zh = LocalizedContent("尼日利亚的首都是...", listOf("拉各斯", "伊巴丹", "阿布贾", "卡诺"), "地理", "阿布贾于1991年取代拉各斯成为尼日利亚首都，因其中心位置和较少人口而被选中。"),
            es = LocalizedContent("La capital de Nigeria es...", listOf("Lagos", "Ibadán", "Abuya", "Kano"), "Geografia", "Abuya reemplazó a Lagos como capital de Nigeria en 1991, elegida por su ubicación central y menor población.")
        ),
        BilingualQuestion(
            id = 9688, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plus grand pays du continent africain par population?", listOf("Égypte", "Éthiopie", "Nigeria", "Congo"), "Géographie", "Le Nigeria dépasse les 220 millions d'habitants, ce qui en fait le pays le plus peuplé d'Afrique, loin devant l'Éthiopie et la République démocratique du Congo."),
            en = LocalizedContent("Which is the largest country in Africa by population?", listOf("Egypt", "Ethiopia", "Nigeria", "Congo"), "Geography", "Nigeria has over 220 million inhabitants, making it the most populous country in Africa, far ahead of Ethiopia and the Democratic Republic of the Congo."),
            zh = LocalizedContent("非洲人口最多的国家是哪个？", listOf("埃及", "埃塞俄比亚", "尼日利亚", "刚果"), "地理", "尼日利亚人口超过2.2亿，是非洲人口最多的国家，远超埃塞俄比亚和刚果民主共和国。"),
            es = LocalizedContent("¿Cuál es el país más grande de África por población?", listOf("Egipto", "Etiopía", "Nigeria", "Congo"), "Geografia", "Nigeria supera los 220 millones de habitantes, lo que lo convierte en el país más poblado de África, muy por delante de Etiopía y la República Democrática del Congo.")
        ),
        BilingualQuestion(
            id = 9689, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("La capitale du Cameroun est...", listOf("Douala", "Yaoundé", "Buea", "Bafoussam"), "Géographie", "Yaoundé est la capitale politique et administrative du Cameroun depuis 1909, sous administration allemande, puis confirmée après l'indépendance en 1960."),
            en = LocalizedContent("The capital of Cameroon is...", listOf("Douala", "Yaoundé", "Buea", "Bafoussam"), "Geography", "Yaoundé has been the political and administrative capital of Cameroon since 1909 under German administration, and was confirmed after independence in 1960."),
            zh = LocalizedContent("喀麦隆的首都是...", listOf("杜阿拉", "雅温得", "布埃亚", "巴富萨姆"), "地理", "雅温得自1909年德国统治时期起就是喀麦隆的政治和行政首都，1960年独立后得到确认。"),
            es = LocalizedContent("La capital de Camerún es...", listOf("Duala", "Yaundé", "Buea", "Bafusam"), "Geografia", "Yaundé es la capital política y administrativa de Camerún desde 1909, bajo administración alemana, y fue confirmada tras la independencia en 1960.")
        ),
        BilingualQuestion(
            id = 9690, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel montagnes abritent le plus haut sommet d'Afrique centrale?", listOf("Chaîne des Adamaoua", "Chaîne du Cameroun", "Monts de l' Adamaoua", "Chaîne des Mayombe"), "Géographie", "Les monts de l'Adamaoua, situés au Cameroun, culminent à environ 2 650 mètres, ce qui en fait le plus haut massif d'Afrique centrale."),
            en = LocalizedContent("Which mountains contain the highest peak in Central Africa?", listOf("Adamaoua Range", "Cameroon Range", "Adamaoua Mountains", "Mayombe Range"), "Geography", "The Adamaoua Mountains, located in Cameroon, rise to about 2,650 meters, making them the highest massif in Central Africa."),
            zh = LocalizedContent("哪些山脉拥有中非最高峰？", listOf("阿达马瓦山脉", "喀麦隆山脉", "阿达马瓦山", "马永贝山脉"), "地理", "位于喀麦隆的阿达马瓦山海拔约2650米，是中非最高的山体。"),
            es = LocalizedContent("¿Qué montañas albergan el pico más alto de África Central?", listOf("Cordillera de Adamaoua", "Cordillera de Camerún", "Montes de Adamaoua", "Cordillera de Mayombe"), "Geografía", "Los montes de Adamaoua, situados en Camerún, alcanzan unos 2.650 metros, lo que los convierte en el macizo más alto de África Central.")
        ),
        BilingualQuestion(
            id = 9691, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("La capitale de la Guinée Équatoriale est...", listOf("Bata", "Malabo", "Ebebiyin", "Mongomo"), "Géographie", "Malabo, située sur l'île de Bioko, est la capitale de la Guinée Équatoriale depuis son indépendance de l'Espagne en 1968."),
            en = LocalizedContent("The capital of Equatorial Guinea is...", listOf("Bata", "Malabo", "Ebebiyin", "Mongomo"), "Geography", "Malabo, located on Bioko Island, has been the capital of Equatorial Guinea since its independence from Spain in 1968."),
            zh = LocalizedContent("赤道几内亚的首都是...", listOf("巴塔", "马拉博", "埃贝比因", "蒙戈莫"), "地理", "马拉博位于比奥科岛，自1968年赤道几内亚脱离西班牙独立以来一直是首都。"),
            es = LocalizedContent("La capital de Guinea Ecuatorial es...", listOf("Bata", "Malabo", "Ebebiyin", "Mongomo"), "Geografía", "Malabo, situada en la isla de Bioko, es la capital de Guinea Ecuatorial desde su independencia de España en 1968.")
        ),
        BilingualQuestion(
            id = 9692, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand archipel de l'Afrique de l'Ouest?", listOf("Îles Bijagos", "Îles du Cap-Vert", "Île de Bioko", "Îles Comores"), "Géographie", "L'archipel du Cap-Vert, situé dans l'océan Atlantique, est le plus grand d'Afrique de l'Ouest avec dix îles principales et plusieurs îlots."),
            en = LocalizedContent("What is the largest archipelago in West Africa?", listOf("Bijagós Islands", "Cape Verde Islands", "Bioko Island", "Comoros Islands"), "Geography", "The Cape Verde archipelago, located in the Atlantic Ocean, is the largest in West Africa with ten main islands and several islets."),
            zh = LocalizedContent("西非最大的群岛是哪个？", listOf("比热戈斯群岛", "佛得角群岛", "比奥科岛", "科摩罗群岛"), "地理", "佛得角群岛位于大西洋，拥有十个主要岛屿和若干小岛，是西非最大的群岛。"),
            es = LocalizedContent("¿Cuál es el archipiélago más grande de África Occidental?", listOf("Islas Bijagós", "Islas de Cabo Verde", "Isla de Bioko", "Islas Comoras"), "Geografía", "El archipiélago de Cabo Verde, situado en el océano Atlántico, es el más grande de África Occidental con diez islas principales y varios islotes.")
        ),
        BilingualQuestion(
            id = 9693, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("La capitale de São Tomé et Príncipe est...", listOf("Santo António", "São Tomé", "Neves", "Ava"), "Géographie", "São Tomé est la plus grande ville du pays et abrite les institutions gouvernementales, ce qui en fait la capitale de l'archipel."),
            en = LocalizedContent("The capital of São Tomé and Príncipe is...", listOf("Santo António", "São Tomé", "Neves", "Ava"), "Geography", "São Tomé is the largest city in the country and houses the government institutions, making it the capital of the archipelago."),
            zh = LocalizedContent("圣多美和普林西比的首都是...", listOf("圣安东尼奥", "圣多美", "内维斯", "阿瓦"), "地理", "圣多美是该国最大城市，政府机构所在地，因此是群岛的首都。"),
            es = LocalizedContent("La capital de Santo Tomé y Príncipe es...", listOf("Santo António", "Santo Tomé", "Neves", "Ava"), "Geografía", "Santo Tomé es la ciudad más grande del país y alberga las instituciones gubernamentales, por lo que es la capital del archipiélago.")
        ),
        BilingualQuestion(
            id = 9694, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel océan entoure le Cap-Vert?", listOf("Océan Atlantique", "Océan Indien", "Océan Pacifique", "Golfe du Bengale"), "Géographie", "Le Cap-Vert est un archipel situé dans l'océan Atlantique, au large des côtes de l'Afrique de l'Ouest."),
            en = LocalizedContent("Which ocean surrounds Cape Verde?", listOf("Atlantic Ocean", "Indian Ocean", "Pacific Ocean", "Bay of Bengal"), "Geography", "Cape Verde is an archipelago located in the Atlantic Ocean, off the coast of West Africa."),
            zh = LocalizedContent("哪个海洋环绕佛得角？", listOf("大西洋", "印度洋", "太平洋", "孟加拉湾"), "地理", "佛得角是一个位于大西洋的群岛，靠近西非海岸。"),
            es = LocalizedContent("¿Qué océano rodea Cabo Verde?", listOf("Océano Atlántico", "Océano Índico", "Océano Pacífico", "Golfo de Bengala"), "Geografía", "Cabo Verde es un archipiélago situado en el océano Atlántico, frente a las costas de África Occidental.")
        ),
        BilingualQuestion(
            id = 9695, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("La capitale du Gabon est...", listOf("Port-Gentil", "Libreville", "Oyem", "Franciville"), "Géographie", "Libreville a été fondée en 1849 par des esclaves libérés, d'où son nom. Elle est devenue la capitale du Gabon à l'indépendance en 1960."),
            en = LocalizedContent("The capital of Gabon is...", listOf("Port-Gentil", "Libreville", "Oyem", "Franceville"), "Geography", "Libreville was founded in 1849 by freed slaves, hence its name. It became the capital of Gabon upon independence in 1960."),
            zh = LocalizedContent("加蓬的首都是...", listOf("让蒂尔港", "利伯维尔", "奥耶姆", "弗朗斯维尔"), "地理", "利伯维尔于1849年由被解放的奴隶建立，因此得名。1960年加蓬独立时成为首都。"),
            es = LocalizedContent("La capital de Gabón es...", listOf("Port-Gentil", "Libreville", "Oyem", "Franceville"), "Geografía", "Libreville fue fundada en 1849 por esclavos liberados, de ahí su nombre. Se convirtió en la capital de Gabón en la independencia en 1960.")
        ),
        BilingualQuestion(
            id = 9696, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel fleuve traverse le Gabon?", listOf("Ngounié", "Ogooué", "Ivindo", "Tous les trois"), "Géographie", "Le Gabon est traversé par trois grands fleuves : l'Ogooué, le Komo et le Nyanga, qui drainent tous le territoire."),
            en = LocalizedContent("Which river flows through Gabon?", listOf("Ngounié", "Ogooué", "Ivindo", "All three"), "Geography", "Gabon is crossed by three major rivers: the Ogooué, the Komo, and the Nyanga, all of which drain the territory."),
            zh = LocalizedContent("哪条河流经加蓬？", listOf("恩古涅河", "奥果韦河", "伊温多河", "以上全部"), "地理", "加蓬有三条主要河流：奥果韦河、科莫河和尼扬加河，它们都流经该国领土。"),
            es = LocalizedContent("¿Qué río atraviesa Gabón?", listOf("Ngounié", "Ogooué", "Ivindo", "Los tres"), "Geografía", "Gabón está atravesado por tres grandes ríos: el Ogooué, el Komo y el Nyanga, que drenan todo el territorio.")
        ),
        BilingualQuestion(
            id = 9697, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("La capitale de la Guinée Équatoriale (Malabo) est...", listOf("Sur la côte", "Sur une île", "En montagne", "En désert"), "Géographie", "Malabo est située sur l'île de Bioko, au large des côtes camerounaises, ce qui en fait une capitale insulaire."),
            en = LocalizedContent("The capital of Equatorial Guinea (Malabo) is...", listOf("On the coast", "On an island", "In the mountains", "In the desert"), "Geography", "Malabo is located on Bioko Island, off the coast of Cameroon, making it an island capital."),
            zh = LocalizedContent("赤道几内亚的首都（马拉博）位于...", listOf("沿海", "岛上", "山区", "沙漠"), "地理", "马拉博位于比奥科岛上，靠近喀麦隆海岸，因此是一个岛屿首都。"),
            es = LocalizedContent("La capital de Guinea Ecuatorial (Malabo) está...", listOf("En la costa", "En una isla", "En la montaña", "En el desierto"), "Geografía", "Malabo está situada en la isla de Bioko, frente a las costas de Camerún, lo que la convierte en una capital insular.")
        ),
        BilingualQuestion(
            id = 9698, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plus grand fleuve d'Afrique centrale?", listOf("Kassaï", "Oubangui", "Congo", "Lualaba"), "Géographie", "Le fleuve Congo, long de 4 700 km, est le plus grand d'Afrique centrale par son débit et son bassin versant. Il traverse la République démocratique du Congo et constitue une voie navigable majeure."),
            en = LocalizedContent("What is the largest river in Central Africa?", listOf("Kasai", "Ubangi", "Congo", "Lualaba"), "Geography", "The Congo River, 4,700 km long, is the largest in Central Africa by discharge and basin area. It flows through the Democratic Republic of the Congo and is a major navigable waterway."),
            zh = LocalizedContent("中非最大的河流是哪个？", listOf("开赛河", "乌班吉河", "刚果河", "卢阿拉巴河"), "地理", "刚果河长4700公里，按流量和流域面积计算是中非最大的河流。它流经刚果民主共和国，是一条重要的通航水道。"),
            es = LocalizedContent("¿Cuál es el río más grande de África Central?", listOf("Kasai", "Ubangui", "Congo", "Lualaba"), "Geografía", "El río Congo, de 4.700 km de longitud, es el más grande de África Central por su caudal y cuenca. Atraviesa la República Democrática del Congo y es una importante vía navegable.")
        ),
        BilingualQuestion(
            id = 9699, correctIndex = 3, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("La capitale du Tchad est...", listOf("Abéché", "Moundou", "Sarh", "N'Djaména"), "Géographie", "N'Djaména est la capitale du Tchad depuis 1960, année de l'indépendance du pays. Anciennement appelée Fort-Lamy, elle est située au confluent des fleuves Chari et Logone."),
            en = LocalizedContent("The capital of Chad is...", listOf("Abéché", "Moundou", "Sarh", "N'Djamena"), "Geography", "N'Djamena has been the capital of Chad since 1960, the year of the country's independence. Formerly called Fort-Lamy, it is located at the confluence of the Chari and Logone rivers."),
            zh = LocalizedContent("乍得的首都是...", listOf("阿贝歇", "蒙杜", "萨尔", "恩贾梅纳"), "地理", "恩贾梅纳自1960年乍得独立以来一直是首都。原名拉密堡，位于沙里河和洛贡河交汇处。"),
            es = LocalizedContent("La capital de Chad es...", listOf("Abéché", "Moundou", "Sarh", "Yamena"), "Geografía", "Yamena es la capital de Chad desde 1960, año de la independencia del país. Antiguamente llamada Fort-Lamy, está situada en la confluencia de los ríos Chari y Logone.")
        ),
        BilingualQuestion(
            id = 9700, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand lac d'Afrique centrale?", listOf("Lac Kivu", "Lac Tanganyika", "Lac Mobutu", "Lac Léopold II"), "Géographie", "Le lac Mobutu, aussi connu sous le nom de lac Albert, est le plus grand lac d'Afrique centrale par sa superficie, situé à la frontière entre l'Ouganda et la République démocratique du Congo."),
            en = LocalizedContent("What is the largest lake in Central Africa?", listOf("Lake Kivu", "Lake Tanganyika", "Lake Mobutu", "Lake Leopold II"), "Geography", "Lake Mobutu, also known as Lake Albert, is the largest lake in Central Africa by area, located on the border between Uganda and the Democratic Republic of the Congo."),
            zh = LocalizedContent("中非最大的湖泊是哪个？", listOf("基伍湖", "坦噶尼喀湖", "莫布图湖", "利奥波德二世湖"), "地理", "莫布图湖，也称为阿尔伯特湖，是中非面积最大的湖泊，位于乌干达和刚果民主共和国边境。"),
            es = LocalizedContent("¿Cuál es el lago más grande de África Central?", listOf("Lago Kivu", "Lago Tanganica", "Lago Mobutu", "Lago Leopoldo II"), "Geografía", "El lago Mobutu, también conocido como lago Alberto, es el lago más grande de África Central por superficie, situado en la frontera entre Uganda y la República Democrática del Congo.")
        ),
        BilingualQuestion(
            id = 9701, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("La capitale de la Centrafrique est...", listOf("Bambari", "Bouar", "Bangui", "Birao"), "Géographie", "Bangui est la capitale de la République centrafricaine, située sur les rives du fleuve Oubangui, qui marque la frontière avec la République démocratique du Congo."),
            en = LocalizedContent("The capital of the Central African Republic is...", listOf("Bambari", "Bouar", "Bangui", "Birao"), "Geography", "Bangui is the capital of the Central African Republic, located on the banks of the Ubangi River, which marks the border with the Democratic Republic of the Congo."),
            zh = LocalizedContent("中非共和国的首都是...", listOf("班巴里", "布阿尔", "班吉", "比劳"), "地理", "班吉是中非共和国的首都，位于乌班吉河畔，该河与刚果民主共和国接壤。"),
            es = LocalizedContent("La capital de la República Centroafricana es...", listOf("Bambari", "Bouar", "Bangui", "Birao"), "Geografía", "Bangui es la capital de la República Centroafricana, situada a orillas del río Ubangui, que marca la frontera con la República Democrática del Congo.")
        ),
        BilingualQuestion(
            id = 9702, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel fleuve traverse la Centrafrique?", listOf("Logone", "Oubangui", "Shari", "Tous les trois"), "Géographie", "Le territoire centrafricain est drainé par trois grands fleuves : l'Oubangui, le Chari et le Sangha, qui forment respectivement les frontières sud, nord-ouest et sud-ouest du pays."),
            en = LocalizedContent("Which river flows through the Central African Republic?", listOf("Logone", "Ubangi", "Shari", "All three"), "Geography", "The territory of the Central African Republic is drained by three major rivers: the Ubangi, the Chari, and the Sangha, which form the southern, northwestern, and southwestern borders of the country respectively."),
            zh = LocalizedContent("哪条河流经中非共和国？", listOf("洛贡河", "乌班吉河", "沙里河", "以上所有"), "地理", "中非共和国的领土由三条主要河流排水：乌班吉河、沙里河和桑加河，它们分别构成了该国的南部、西北部和西南部边界。"),
            es = LocalizedContent("¿Qué río atraviesa la República Centroafricana?", listOf("Logone", "Ubangui", "Shari", "Los tres"), "Geografía", "El territorio centroafricano está drenado por tres grandes ríos: el Ubangui, el Chari y el Sangha, que forman respectivamente las fronteras sur, noroeste y suroeste del país.")
        ),
        BilingualQuestion(
            id = 9703, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("La capitale du Cameroun (Yaoundé) est...", listOf("Sur le plan", "En montagne", "Sur la côte", "En forêt"), "Géographie", "Yaoundé est située sur un plateau à environ 750 mètres d'altitude, dans une région de collines et de reliefs accidentés."),
            en = LocalizedContent("The capital of Cameroon (Yaoundé) is...", listOf("On the plain", "In the mountains", "On the coast", "In the forest"), "Geography", "Yaoundé is located on a plateau at about 750 meters altitude, in a region of hills and rugged terrain."),
            zh = LocalizedContent("喀麦隆的首都（雅温得）位于...", listOf("平原上", "山区", "沿海", "森林中"), "地理", "雅温得位于海拔约750米的高原上，地处丘陵和崎岖地形区域。"),
            es = LocalizedContent("La capital de Camerún (Yaundé) está...", listOf("En la llanura", "En la montaña", "En la costa", "En el bosque"), "Geografía", "Yaundé está situada en una meseta a unos 750 metros de altitud, en una región de colinas y relieve accidentado.")
        ),
        BilingualQuestion(
            id = 9704, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plus grand fleuve d'Afrique de l'Ouest?", listOf("Volta", "Sénégal", "Niger", "Gambie"), "Géographie", "Le fleuve Niger, long d'environ 4 180 km, traverse plusieurs pays d'Afrique de l'Ouest comme le Mali, le Niger et le Nigeria, ce qui en fait le plus grand fleuve de la région."),
            en = LocalizedContent("What is the longest river in West Africa?", listOf("Volta", "Senegal", "Niger", "Gambia"), "Geography", "The Niger River, about 4,180 km long, flows through several West African countries such as Mali, Niger, and Nigeria, making it the largest river in the region."),
            zh = LocalizedContent("西非最长的河流是哪个？", listOf("沃尔特河", "塞内加尔河", "尼日尔河", "冈比亚河"), "地理", "尼日尔河长约4180公里，流经马里、尼日尔和尼日利亚等多个西非国家，是该地区最大的河流。"),
            es = LocalizedContent("¿Cuál es el río más largo de África Occidental?", listOf("Volta", "Senegal", "Níger", "Gambia"), "Geografía", "El río Níger, de unos 4.180 km de longitud, atraviesa varios países de África Occidental como Malí, Níger y Nigeria, lo que lo convierte en el río más grande de la región.")
        ),
        BilingualQuestion(
            id = 9705, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("La capitale du Mali est...", listOf("Gao", "Tombouctou", "Bamako", "Ségou"), "Géographie", "Bamako est la capitale du Mali depuis l'indépendance du pays en 1960, située sur les rives du fleuve Niger."),
            en = LocalizedContent("The capital of Mali is...", listOf("Gao", "Timbuktu", "Bamako", "Ségou"), "Geography", "Bamako has been the capital of Mali since the country's independence in 1960, located on the banks of the Niger River."),
            zh = LocalizedContent("马里的首都是...", listOf("加奥", "廷巴克图", "巴马科", "塞古"), "地理", "巴马科自1960年马里独立以来一直是首都，位于尼日尔河畔。"),
            es = LocalizedContent("La capital de Malí es...", listOf("Gao", "Tombuctú", "Bamako", "Ségou"), "Geografía", "Bamako es la capital de Malí desde la independencia del país en 1960, situada a orillas del río Níger.")
        ),
        BilingualQuestion(
            id = 9706, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel fleuve traverse le Mali?", listOf("Sénégal", "Volta", "Niger", "Tous les trois"), "Géographie", "Le fleuve Niger traverse le Mali sur environ 1 700 kilomètres, servant de voie de transport et d'irrigation essentielle pour le pays."),
            en = LocalizedContent("Which river flows through Mali?", listOf("Senegal", "Volta", "Niger", "All three"), "Geography", "The Niger River flows through Mali for about 1,700 kilometers, serving as an essential transport and irrigation route for the country."),
            zh = LocalizedContent("哪条河流经马里？", listOf("塞内加尔河", "沃尔特河", "尼日尔河", "以上所有"), "地理", "尼日尔河流经马里约1700公里，是该国重要的运输和灌溉通道。"),
            es = LocalizedContent("¿Qué río atraviesa Malí?", listOf("Senegal", "Volta", "Níger", "Los tres"), "Geografía", "El río Níger atraviesa Malí durante unos 1.700 kilómetros, sirviendo como una ruta de transporte y riego esencial para el país.")
        ),
        BilingualQuestion(
            id = 9707, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("La capitale du Burkina Faso est...", listOf("Bobo-Dioulasso", "Ouagadougou", "Koudougou", "Dédougou"), "Géographie", "Ouagadougou est la capitale politique et administrative du Burkina Faso, située au centre du pays. Elle est également la plus grande ville du pays."),
            en = LocalizedContent("The capital of Burkina Faso is...", listOf("Bobo-Dioulasso", "Ouagadougou", "Koudougou", "Dédougou"), "Geography", "Ouagadougou is the political and administrative capital of Burkina Faso, located in the center of the country. It is also the largest city in the country."),
            zh = LocalizedContent("布基纳法索的首都是...", listOf("博博迪乌拉索", "瓦加杜古", "库杜古", "代杜古"), "地理", "瓦加杜古是布基纳法索的政治和行政首都，位于该国中部，也是该国最大的城市。"),
            es = LocalizedContent("La capital de Burkina Faso es...", listOf("Bobo-Dioulasso", "Uagadugú", "Koudougou", "Dédougou"), "Geografía", "Uagadugú es la capital política y administrativa de Burkina Faso, situada en el centro del país. También es la ciudad más grande del país.")
        ),
        BilingualQuestion(
            id = 9708, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel fleuve traverse le Burkina Faso?", listOf("Volta", "Niger", "Sénégal", "Gambie"), "Géographie", "Le Burkina Faso est traversé par le fleuve Volta, qui donne son nom à la région historique de Haute-Volta, ancien nom du pays jusqu'en 1984."),
            en = LocalizedContent("Which river flows through Burkina Faso?", listOf("Volta", "Niger", "Senegal", "Gambia"), "Geography", "Burkina Faso is crossed by the Volta River, which gives its name to the historical region of Upper Volta, the former name of the country until 1984."),
            zh = LocalizedContent("哪条河流经布基纳法索？", listOf("沃尔特河", "尼日尔河", "塞内加尔河", "冈比亚河"), "地理", "布基纳法索由沃尔特河流经，该河得名于上沃尔特历史地区，这是该国1984年之前的旧称。"),
            es = LocalizedContent("¿Qué río atraviesa Burkina Faso?", listOf("Volta", "Níger", "Senegal", "Gambia"), "Geografía", "Burkina Faso está atravesado por el río Volta, que da nombre a la región histórica de Alto Volta, antiguo nombre del país hasta 1984.")
        ),
        BilingualQuestion(
            id = 9709, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("La capitale du Niger est...", listOf("Maradi", "Zinder", "Niamey", "Agadez"), "Géographie", "Niamey est la capitale du Niger depuis l'indépendance du pays en 1960, située sur les rives du fleuve Niger dans le sud-ouest du territoire."),
            en = LocalizedContent("The capital of Niger is...", listOf("Maradi", "Zinder", "Niamey", "Agadez"), "Geography", "Niamey has been the capital of Niger since the country's independence in 1960, located on the banks of the Niger River in the southwest of the territory."),
            zh = LocalizedContent("尼日尔的首都是...", listOf("马拉迪", "津德尔", "尼亚美", "阿加德兹"), "地理", "尼亚美自1960年尼日尔独立以来一直是首都，位于该国西南部的尼日尔河畔。"),
            es = LocalizedContent("La capital de Níger es...", listOf("Maradi", "Zinder", "Niamey", "Agadez"), "Geografía", "Niamey es la capital de Níger desde la independencia del país en 1960, situada a orillas del río Níger en el suroeste del territorio.")
        ),
        BilingualQuestion(
            id = 9710, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel fleuve traverse le Niger?", listOf("Sénégal", "Niger", "Volta", "Gambie"), "Géographie", "Le fleuve Niger traverse le Niger, dont il tire son nom, et constitue une artère vitale pour le pays en fournissant eau et irrigation dans une région aride."),
            en = LocalizedContent("Which river flows through Niger?", listOf("Senegal", "Niger", "Volta", "Gambia"), "Geography", "The Niger River flows through Niger, from which it takes its name, and is a vital artery for the country, providing water and irrigation in an arid region."),
            zh = LocalizedContent("哪条河流经尼日尔？", listOf("塞内加尔河", "尼日尔河", "沃尔特河", "冈比亚河"), "地理", "尼日尔河流经尼日尔，并因此得名，是该国的重要命脉，在干旱地区提供水源和灌溉。"),
            es = LocalizedContent("¿Qué río atraviesa Níger?", listOf("Senegal", "Níger", "Volta", "Gambia"), "Geografía", "El río Níger atraviesa Níger, del que toma su nombre, y constituye una arteria vital para el país al proporcionar agua e irrigación en una región árida.")
        ),
        BilingualQuestion(
            id = 9711, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand archipel du monde?", listOf("Hawaï", "Maldives", "Indonésie", "Philippines"), "Géographie", "L'Indonésie est le plus grand archipel du monde avec plus de 17 000 îles, s'étendant entre l'océan Indien et l'océan Pacifique."),
            en = LocalizedContent("What is the largest archipelago in the world?", listOf("Hawaii", "Maldives", "Indonesia", "Philippines"), "Geography", "Indonesia is the largest archipelago in the world with over 17,000 islands, stretching between the Indian Ocean and the Pacific Ocean."),
            zh = LocalizedContent("世界上最大的群岛是哪个？", listOf("夏威夷", "马尔代夫", "印度尼西亚", "菲律宾"), "地理", "印度尼西亚是世界上最大的群岛，拥有超过17,000个岛屿，横跨印度洋和太平洋之间。"),
            es = LocalizedContent("¿Cuál es el archipiélago más grande del mundo?", listOf("Hawái", "Maldivas", "Indonesia", "Filipinas"), "Geografía", "Indonesia es el archipiélago más grande del mundo con más de 17.000 islas, extendiéndose entre el océano Índico y el océano Pacífico.")
        ),
        BilingualQuestion(
            id = 9712, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus petit pays d'Asie?", listOf("Bhoutan", "Brunei", "Bahreïn", "Singapour"), "Géographie", "Singapour est une cité-État insulaire d'Asie du Sud-Est avec une superficie d'environ 728 km², ce qui en fait le plus petit pays du continent asiatique."),
            en = LocalizedContent("What is the smallest country in Asia?", listOf("Bhutan", "Brunei", "Bahrain", "Singapore"), "Geography", "Singapore is a city-state island in Southeast Asia with an area of about 728 km², making it the smallest country on the Asian continent."),
            zh = LocalizedContent("亚洲最小的国家是哪个？", listOf("不丹", "文莱", "巴林", "新加坡"), "地理", "新加坡是东南亚的一个城邦岛国，面积约728平方公里，是亚洲大陆最小的国家。"),
            es = LocalizedContent("¿Cuál es el país más pequeño de Asia?", listOf("Bután", "Brunéi", "Baréin", "Singapur"), "Geografía", "Singapur es una ciudad-estado insular del sudeste asiático con una superficie de aproximadamente 728 km², lo que lo convierte en el país más pequeño del continente asiático.")
        ),
        BilingualQuestion(
            id = 9713, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel continent a le plus de lacs?", listOf("Asie", "Amérique du Nord", "Europe", "Afrique"), "Géographie", "L'Europe compte plus de 1,5 million de lacs, principalement en Finlande, en Suède et en Russie, ce qui en fait le continent le plus riche en lacs."),
            en = LocalizedContent("Which continent has the most lakes?", listOf("Asia", "North America", "Europe", "Africa"), "Geography", "Europe has over 1.5 million lakes, mainly in Finland, Sweden, and Russia, making it the continent richest in lakes."),
            zh = LocalizedContent("哪个大洲的湖泊最多？", listOf("亚洲", "北美洲", "欧洲", "非洲"), "地理", "欧洲拥有超过150万个湖泊，主要分布在芬兰、瑞典和俄罗斯，是湖泊最多的大洲。"),
            es = LocalizedContent("¿Qué continente tiene más lagos?", listOf("Asia", "América del Norte", "Europa", "África"), "Geografía", "Europa cuenta con más de 1,5 millones de lagos, principalmente en Finlandia, Suecia y Rusia, lo que lo convierte en el continente más rico en lagos.")
        ),
        BilingualQuestion(
            id = 9714, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand estuaire du monde?", listOf("Estuaire du Gange", "Estuaire de l'Amazone", "Estuaire de l'Orénoque", "Estuaire du Mississippi"), "Géographie", "L'estuaire du Gange, situé au Bangladesh et en Inde, est le plus grand du monde en superficie et en débit d'eau, formant le delta du Gange-Brahmapoutre."),
            en = LocalizedContent("What is the largest estuary in the world?", listOf("Ganges Estuary", "Amazon Estuary", "Orinoco Estuary", "Mississippi Estuary"), "Geography", "The Ganges Estuary, located in Bangladesh and India, is the largest in the world in terms of area and water flow, forming the Ganges-Brahmaputra delta."),
            zh = LocalizedContent("世界上最大的河口湾是哪个？", listOf("恒河河口湾", "亚马逊河河口湾", "奥里诺科河河口湾", "密西西比河河口湾"), "地理", "恒河河口湾位于孟加拉国和印度，是世界上面积和水流量最大的河口湾，形成了恒河-布拉马普特拉河三角洲。"),
            es = LocalizedContent("¿Cuál es el estuario más grande del mundo?", listOf("Estuario del Ganges", "Estuario del Amazonas", "Estuario del Orinoco", "Estuario del Misisipi"), "Geografía", "El estuario del Ganges, situado en Bangladés y la India, es el más grande del mundo en superficie y caudal de agua, formando el delta del Ganges-Brahmaputra.")
        ),
        BilingualQuestion(
            id = 9715, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plus grand fleuve d'Amérique du Nord?", listOf("Yukon", "Mississippi", "Mackenzie", "Rio Bravo"), "Géographie", "Le Mississippi s'étend sur environ 3 730 kilomètres, drainant une grande partie du continent nord-américain avec son affluent le Missouri."),
            en = LocalizedContent("What is the longest river in North America?", listOf("Yukon", "Mississippi", "Mackenzie", "Rio Grande"), "Geography", "The Mississippi River stretches about 3,730 kilometers, draining a large part of the North American continent with its tributary the Missouri."),
            zh = LocalizedContent("北美洲最长的河流是哪条？", listOf("育空河", "密西西比河", "马更些河", "格兰德河"), "地理", "密西西比河长约3,730公里，与其支流密苏里河一起排干了北美大陆的大部分地区。"),
            es = LocalizedContent("¿Cuál es el río más largo de América del Norte?", listOf("Yukón", "Misisipi", "Mackenzie", "Río Bravo"), "Geografía", "El río Misisipi se extiende aproximadamente 3.730 kilómetros, drenando gran parte del continente norteamericano con su afluente el Misuri.")
        ),
        BilingualQuestion(
            id = 9716, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("La capitale du Groenland est...", listOf("Sisimiut", "Nuuk", "Aasiaat", "Qeqertarsuaq"), "Géographie", "Nuuk est la capitale et la plus grande ville du Groenland, située sur la côte sud-ouest de l'île. Elle abrite le siège du gouvernement groenlandais."),
            en = LocalizedContent("The capital of Greenland is...", listOf("Sisimiut", "Nuuk", "Aasiaat", "Qeqertarsuaq"), "Geography", "Nuuk is the capital and largest city of Greenland, located on the southwest coast of the island. It houses the seat of the Greenlandic government."),
            zh = LocalizedContent("格陵兰的首都是...", listOf("西西缪特", "努克", "阿西亚特", "凯凯塔苏瓦克"), "地理", "努克是格陵兰的首都和最大城市，位于该岛的西南海岸，是格陵兰政府的所在地。"),
            es = LocalizedContent("La capital de Groenlandia es...", listOf("Sisimiut", "Nuuk", "Aasiaat", "Qeqertarsuaq"), "Geografía", "Nuuk es la capital y ciudad más grande de Groenlandia, situada en la costa suroeste de la isla. Alberga la sede del gobierno groenlandés.")
        ),
        BilingualQuestion(
            id = 9717, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand glacier d'Amérique du Nord?", listOf("Glacier du Peito", "Glaciers d'Alaska", "Glacier du Rhône", "Glacier du Mendenhall"), "Géographie", "Le glacier d'Alaska, situé dans la chaîne côtière du Pacifique, est le plus vaste d'Amérique du Nord par sa superficie et son volume de glace."),
            en = LocalizedContent("What is the largest glacier in North America?", listOf("Peito Glacier", "Alaska Glacier", "Rhône Glacier", "Mendenhall Glacier"), "Geography", "The Alaska Glacier, located in the Pacific coastal range, is the largest in North America by area and ice volume."),
            zh = LocalizedContent("北美洲最大的冰川是哪个？", listOf("佩托冰川", "阿拉斯加冰川", "罗纳冰川", "门登霍尔冰川"), "地理", "阿拉斯加冰川位于太平洋海岸山脉，是北美洲面积和冰量最大的冰川。"),
            es = LocalizedContent("¿Cuál es el glaciar más grande de América del Norte?", listOf("Glaciar Peito", "Glaciar de Alaska", "Glaciar del Ródano", "Glaciar Mendenhall"), "Geografía", "El glaciar de Alaska, situado en la cordillera costera del Pacífico, es el más grande de América del Norte por superficie y volumen de hielo.")
        ),
        BilingualQuestion(
            id = 9718, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("La capitale d'Haïti est...", listOf("Cap-Haïtien", "Port-au-Prince", "Les Cayes", "Jérémie"), "Géographie", "Port-au-Prince est la capitale et la plus grande ville d'Haïti, située sur le golfe de la Gonâve. Elle fut fondée en 1749 par les colons français."),
            en = LocalizedContent("The capital of Haiti is...", listOf("Cap-Haïtien", "Port-au-Prince", "Les Cayes", "Jérémie"), "Geography", "Port-au-Prince is the capital and largest city of Haiti, located on the Gulf of Gonâve. It was founded in 1749 by French colonists."),
            zh = LocalizedContent("海地的首都是...", listOf("海地角", "太子港", "莱凯", "热雷米"), "地理", "太子港是海地的首都和最大城市，位于戈纳夫湾，由法国殖民者于1749年建立。"),
            es = LocalizedContent("La capital de Haití es...", listOf("Cabello Haitiano", "Puerto Príncipe", "Los Cayos", "Jeremías"), "Geografía", "Puerto Príncipe es la capital y ciudad más grande de Haití, situada en el golfo de la Gonâve. Fue fundada en 1749 por colonos franceses.")
        ),
        BilingualQuestion(
            id = 9719, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand archipel des Caraïbes?", listOf("Îles Bahamas", "Îles Turques et Caïques", "Îles Vierges", "Îles Caïmans"), "Géographie", "Les Bahamas comptent plus de 700 îles et cayes, ce qui en fait le plus vaste archipel des Caraïbes en termes de superficie et de nombre d'îles."),
            en = LocalizedContent("What is the largest archipelago in the Caribbean?", listOf("Bahamas", "Turks and Caicos Islands", "Virgin Islands", "Cayman Islands"), "Geography", "The Bahamas comprise over 700 islands and cays, making it the largest archipelago in the Caribbean in terms of area and number of islands."),
            zh = LocalizedContent("加勒比地区最大的群岛是哪个？", listOf("巴哈马群岛", "特克斯和凯科斯群岛", "维尔京群岛", "开曼群岛"), "地理", "巴哈马群岛由700多个岛屿和珊瑚礁组成，是加勒比地区面积和岛屿数量最大的群岛。"),
            es = LocalizedContent("¿Cuál es el archipiélago más grande del Caribe?", listOf("Islas Bahamas", "Islas Turcas y Caicos", "Islas Vírgenes", "Islas Caimán"), "Geografía", "Las Bahamas comprenden más de 700 islas y cayos, lo que las convierte en el archipiélago más grande del Caribe en términos de superficie y número de islas.")
        ),
        BilingualQuestion(
            id = 9720, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("La capitale de la Jamaïque est...", listOf("Montego Bay", "Kingston", "Spanish Town", "Portmore"), "Géographie", "Kingston est la capitale et la plus grande ville de la Jamaïque, située sur la côte sud-est de l'île."),
            en = LocalizedContent("The capital of Jamaica is...", listOf("Montego Bay", "Kingston", "Spanish Town", "Portmore"), "Geography", "Kingston is the capital and largest city of Jamaica, located on the southeastern coast of the island."),
            zh = LocalizedContent("牙买加的首都是...", listOf("蒙特哥贝", "金斯敦", "西班牙镇", "波特莫尔"), "地理", "金斯敦是牙买加的首都和最大城市，位于该岛的东南海岸。"),
            es = LocalizedContent("La capital de Jamaica es...", listOf("Montego Bay", "Kingston", "Spanish Town", "Portmore"), "Geografia", "Kingston es la capital y ciudad más grande de Jamaica, ubicada en la costa sureste de la isla.")
        ),
        BilingualQuestion(
            id = 9721, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand port des Caraïbes?", listOf("Port de Montego Bay", "Port de Kingston", "Port de Trinidad", "Port de La Havane"), "Géographie", "Le port de Montego Bay, en Jamaïque, est le plus grand port des Caraïbes en termes de trafic de conteneurs et de croisières, jouant un rôle clé dans l'économie régionale."),
            en = LocalizedContent("What is the largest port in the Caribbean?", listOf("Port of Montego Bay", "Port of Kingston", "Port of Trinidad", "Port of Havana"), "Geography", "The Port of Montego Bay in Jamaica is the largest port in the Caribbean in terms of container and cruise traffic, playing a key role in the regional economy."),
            zh = LocalizedContent("加勒比地区最大的港口是？", listOf("蒙特哥贝港", "金斯敦港", "特立尼达港", "哈瓦那港"), "地理", "牙买加的蒙特哥贝港是加勒比地区最大的港口，在集装箱和邮轮运输方面领先，对区域经济至关重要。"),
            es = LocalizedContent("¿Cuál es el puerto más grande del Caribe?", listOf("Puerto de Montego Bay", "Puerto de Kingston", "Puerto de Trinidad", "Puerto de La Habana"), "Geografia", "El puerto de Montego Bay en Jamaica es el puerto más grande del Caribe en términos de tráfico de contenedores y cruceros, desempeñando un papel clave en la economía regional.")
        ),
        BilingualQuestion(
            id = 9722, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("La capitale de la République Dominicaine est...", listOf("Santiago", "La Romana", "Saint-Domingue", "Punta Cana"), "Géographie", "Saint-Domingue, fondée en 1496 par Barthélemy Colomb, est la plus ancienne ville européenne des Amériques et le siège du gouvernement dominicain."),
            en = LocalizedContent("The capital of the Dominican Republic is...", listOf("Santiago", "La Romana", "Santo Domingo", "Punta Cana"), "Geography", "Santo Domingo, founded in 1496 by Bartholomew Columbus, is the oldest European city in the Americas and the seat of the Dominican government."),
            zh = LocalizedContent("多米尼加共和国的首都是...", listOf("圣地亚哥", "拉罗马纳", "圣多明各", "蓬塔卡纳"), "地理", "圣多明各由巴托洛梅·哥伦布于1496年建立，是美洲最古老的欧洲城市，也是多米尼加政府的所在地。"),
            es = LocalizedContent("La capital de la República Dominicana es...", listOf("Santiago", "La Romana", "Santo Domingo", "Punta Cana"), "Geografia", "Santo Domingo, fundada en 1496 por Bartolomé Colón, es la ciudad europea más antigua de las Américas y la sede del gobierno dominicano.")
        ),
        BilingualQuestion(
            id = 9723, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel océan entoure les Caraïbes?", listOf("Océan Atlantique", "Océan Indien", "Océan Pacifique", "Golfe du Mexique"), "Géographie", "La mer des Caraïbes est une mer bordière de l'océan Atlantique, située à l'est de l'Amérique centrale et au nord de l'Amérique du Sud."),
            en = LocalizedContent("Which ocean surrounds the Caribbean?", listOf("Atlantic Ocean", "Indian Ocean", "Pacific Ocean", "Gulf of Mexico"), "Geography", "The Caribbean Sea is a marginal sea of the Atlantic Ocean, located east of Central America and north of South America."),
            zh = LocalizedContent("哪个大洋环绕着加勒比地区？", listOf("大西洋", "印度洋", "太平洋", "墨西哥湾"), "地理", "加勒比海是大西洋的一个边缘海，位于中美洲以东和南美洲以北。"),
            es = LocalizedContent("¿Qué océano rodea el Caribe?", listOf("Océano Atlántico", "Océano Índico", "Océano Pacífico", "Golfo de México"), "Geografia", "El mar Caribe es un mar marginal del océano Atlántico, ubicado al este de América Central y al norte de América del Sur.")
        ),
        BilingualQuestion(
            id = 9724, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("La capitale de Cuba est...", listOf("Santiago", "Camagüey", "La Havane", "Guantánamo"), "Géographie", "La Havane est la capitale et la plus grande ville de Cuba, située sur la côte nord-ouest de l'île. Elle est le principal centre politique, économique et culturel du pays."),
            en = LocalizedContent("The capital of Cuba is...", listOf("Santiago", "Camagüey", "Havana", "Guantánamo"), "Geography", "Havana is the capital and largest city of Cuba, located on the northwestern coast of the island. It is the main political, economic, and cultural center of the country."),
            zh = LocalizedContent("古巴的首都是...", listOf("圣地亚哥", "卡马圭", "哈瓦那", "关塔那摩"), "地理", "哈瓦那是古巴的首都和最大城市，位于该岛的西北海岸。它是该国主要的政治、经济和文化中心。"),
            es = LocalizedContent("La capital de Cuba es...", listOf("Santiago", "Camagüey", "La Habana", "Guantánamo"), "Geografia", "La Habana es la capital y ciudad más grande de Cuba, ubicada en la costa noroeste de la isla. Es el principal centro político, económico y cultural del país.")
        ),
        BilingualQuestion(
            id = 9725, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus long fleuve de la Caraïbe?", listOf("Fleuve Artibonite", "Fleuve Magdalena", "Fleuve Orénoque", "Fleuve Grijalva"), "Géographie", "L'Orénoque, long d'environ 2 140 km, traverse le Venezuela et se jette dans l'océan Atlantique, ce qui en fait le plus long fleuve de la région caraïbe."),
            en = LocalizedContent("What is the longest river in the Caribbean?", listOf("Artibonite River", "Magdalena River", "Orinoco River", "Grijalva River"), "Geography", "The Orinoco, about 2,140 km long, flows through Venezuela and empties into the Atlantic Ocean, making it the longest river in the Caribbean region."),
            zh = LocalizedContent("加勒比地区最长的河流是？", listOf("阿蒂博尼特河", "马格达莱纳河", "奥里诺科河", "格里哈尔瓦河"), "地理", "奥里诺科河长约2140公里，流经委内瑞拉并注入大西洋，是加勒比地区最长的河流。"),
            es = LocalizedContent("¿Cuál es el río más largo del Caribe?", listOf("Río Artibonito", "Río Magdalena", "Río Orinoco", "Río Grijalva"), "Geografia", "El Orinoco, de unos 2.140 km de longitud, atraviesa Venezuela y desemboca en el océano Atlántico, lo que lo convierte en el río más largo de la región caribeña.")
        ),
        BilingualQuestion(
            id = 9726, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("La capitale de la Barbade est...", listOf("Bathsheba", "Bridgetown", "Belleplaine", "Bathurst"), "Géographie", "Bridgetown est la capitale et la plus grande ville de la Barbade, située sur la côte sud-ouest de l'île."),
            en = LocalizedContent("The capital of Barbados is...", listOf("Bathsheba", "Bridgetown", "Belleplaine", "Bathurst"), "Geography", "Bridgetown is the capital and largest city of Barbados, located on the southwestern coast of the island."),
            zh = LocalizedContent("巴巴多斯的首都是...", listOf("巴希巴", "布里奇顿", "贝尔普莱恩", "巴瑟斯特"), "地理", "布里奇顿是巴巴多斯的首都和最大城市，位于该岛的西南海岸。"),
            es = LocalizedContent("La capital de Barbados es...", listOf("Bathsheba", "Bridgetown", "Belleplaine", "Bathurst"), "Geografia", "Bridgetown es la capital y ciudad más grande de Barbados, ubicada en la costa suroeste de la isla.")
        ),
        BilingualQuestion(
            id = 9727, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel île des Caraïbes est la plus grande?", listOf("Cuba", "Hispaniola", "Jamaïque", "Porto Rico"), "Géographie", "Cuba est la plus grande île des Caraïbes avec une superficie d'environ 109 884 km², dépassant largement Hispaniola et la Jamaïque."),
            en = LocalizedContent("Which Caribbean island is the largest?", listOf("Cuba", "Hispaniola", "Jamaica", "Puerto Rico"), "Geography", "Cuba is the largest island in the Caribbean with an area of about 109,884 km², far surpassing Hispaniola and Jamaica."),
            zh = LocalizedContent("加勒比地区最大的岛屿是？", listOf("古巴", "伊斯帕尼奥拉岛", "牙买加", "波多黎各"), "地理", "古巴是加勒比地区最大的岛屿，面积约109,884平方公里，远超伊斯帕尼奥拉岛和牙买加。"),
            es = LocalizedContent("¿Cuál es la isla más grande del Caribe?", listOf("Cuba", "La Española", "Jamaica", "Puerto Rico"), "Geografia", "Cuba es la isla más grande del Caribe con una superficie de aproximadamente 109.884 km², superando ampliamente a La Española y Jamaica.")
        ),
        BilingualQuestion(
            id = 9728, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("La capitale de Sainte-Lucie est...", listOf("Gros-Islet", "Castries", "Soufrière", "Laborie"), "Géographie", "Castries est la capitale de Sainte-Lucie, une île des Caraïbes, et sert de centre administratif et économique du pays depuis l'époque coloniale britannique."),
            en = LocalizedContent("The capital of Saint Lucia is...", listOf("Gros Islet", "Castries", "Soufrière", "Laborie"), "Geography", "Castries is the capital of Saint Lucia, a Caribbean island, and has served as the administrative and economic center of the country since the British colonial era."),
            zh = LocalizedContent("圣卢西亚的首都是...", listOf("格罗斯岛", "卡斯特里", "苏弗里耶尔", "拉博里"), "地理", "卡斯特里是加勒比海岛国圣卢西亚的首都，自英国殖民时期以来一直是该国的行政和经济中心。"),
            es = LocalizedContent("La capital de Santa Lucía es...", listOf("Gros Islet", "Castries", "Soufrière", "Laborie"), "Geografia", "Castries es la capital de Santa Lucía, una isla del Caribe, y ha servido como centro administrativo y económico del país desde la época colonial británica.")
        ),
        BilingualQuestion(
            id = 9729, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus haut sommet des Caraïbes?", listOf("Pic la Selle", "Pic Duarte", "Pic Morne-la-Selle", "Pic Christophe"), "Géographie", "Le Pic Duarte, culminant à 3 098 mètres, est le point le plus élevé des Caraïbes et se situe en République dominicaine."),
            en = LocalizedContent("What is the highest peak in the Caribbean?", listOf("Pic la Selle", "Pico Duarte", "Morne la Selle", "Pic Christophe"), "Geography", "Pico Duarte, at 3,098 meters, is the highest point in the Caribbean and is located in the Dominican Republic."),
            zh = LocalizedContent("加勒比地区的最高峰是？", listOf("塞勒峰", "杜阿尔特峰", "莫尔纳塞勒峰", "克里斯托夫峰"), "地理", "杜阿尔特峰海拔3098米，是加勒比地区的最高点，位于多米尼加共和国。"),
            es = LocalizedContent("¿Cuál es el pico más alto del Caribe?", listOf("Pic la Selle", "Pico Duarte", "Morne la Selle", "Pic Christophe"), "Geografia", "El Pico Duarte, con 3.098 metros, es el punto más alto del Caribe y se encuentra en la República Dominicana.")
        ),
        BilingualQuestion(
            id = 9730, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("La capitale de la Grenade est...", listOf("Grenville", "Saint-Georges", "Sauteurs", "Gouyave"), "Géographie", "Saint-Georges est la capitale de la Grenade, un État insulaire des Caraïbes, en raison de son port naturel et de son rôle historique de centre administratif et économique."),
            en = LocalizedContent("The capital of Grenada is...", listOf("Grenville", "St. George's", "Sauteurs", "Gouyave"), "Geography", "St. George's is the capital of Grenada, an island nation in the Caribbean, due to its natural harbor and historical role as the administrative and economic center."),
            zh = LocalizedContent("格林纳达的首都是...", listOf("格林维尔", "圣乔治", "索特尔斯", "古亚夫"), "地理", "圣乔治是格林纳达的首都，格林纳达是加勒比海的一个岛国，因其天然港口和作为行政经济中心的历史角色而成为首都。"),
            es = LocalizedContent("La capital de Granada es...", listOf("Grenville", "Saint George's", "Sauteurs", "Gouyave"), "Geografía", "Saint George's es la capital de Granada, un estado insular del Caribe, debido a su puerto natural y su papel histórico como centro administrativo y económico.")
        ),
        BilingualQuestion(
            id = 9731, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plus grand pays de l'Amérique centrale?", listOf("Honduras", "Guatemala", "Nicaragua", "Panama"), "Géographie", "Le Guatemala est le pays le plus peuplé d'Amérique centrale et possède la plus grande superficie de la région, devant le Honduras et le Nicaragua."),
            en = LocalizedContent("What is the largest country in Central America?", listOf("Honduras", "Guatemala", "Nicaragua", "Panama"), "Geography", "Guatemala is the most populous country in Central America and has the largest area in the region, ahead of Honduras and Nicaragua."),
            zh = LocalizedContent("中美洲最大的国家是？", listOf("洪都拉斯", "危地马拉", "尼加拉瓜", "巴拿马"), "地理", "危地马拉是中美洲人口最多的国家，也是该地区面积最大的国家，超过洪都拉斯和尼加拉瓜。"),
            es = LocalizedContent("¿Cuál es el país más grande de América Central?", listOf("Honduras", "Guatemala", "Nicaragua", "Panamá"), "Geografía", "Guatemala es el país más poblado de América Central y tiene la mayor superficie de la región, por delante de Honduras y Nicaragua.")
        ),
        BilingualQuestion(
            id = 9732, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("La capitale du Honduras est...", listOf("San Pedro Sula", "Tegucigalpa", "La Ceiba", "Choluteca"), "Géographie", "Tegucigalpa est la capitale du Honduras depuis 1880, remplaçant Comayagua. Elle est aussi la plus grande ville du pays."),
            en = LocalizedContent("The capital of Honduras is...", listOf("San Pedro Sula", "Tegucigalpa", "La Ceiba", "Choluteca"), "Geography", "Tegucigalpa has been the capital of Honduras since 1880, replacing Comayagua. It is also the largest city in the country."),
            zh = LocalizedContent("洪都拉斯的首都是...", listOf("圣佩德罗苏拉", "特古西加尔巴", "拉塞瓦", "乔卢特卡"), "地理", "特古西加尔巴自1880年起成为洪都拉斯首都，取代了科马亚瓜。它也是该国最大的城市。"),
            es = LocalizedContent("La capital de Honduras es...", listOf("San Pedro Sula", "Tegucigalpa", "La Ceiba", "Choluteca"), "Geografía", "Tegucigalpa es la capital de Honduras desde 1880, reemplazando a Comayagua. También es la ciudad más grande del país.")
        ),
        BilingualQuestion(
            id = 9733, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand fleuve d'Amérique centrale?", listOf("Usumacinta", "Patuca", "Motagua", "Grijalva"), "Géographie", "L'Usumacinta est le plus grand fleuve d'Amérique centrale, formant une frontière naturelle entre le Mexique et le Guatemala. Il mesure environ 1 000 kilomètres de long et traverse la forêt tropicale du Petén."),
            en = LocalizedContent("What is the longest river in Central America?", listOf("Usumacinta", "Patuca", "Motagua", "Grijalva"), "Geography", "The Usumacinta is the longest river in Central America, forming a natural border between Mexico and Guatemala. It is about 1,000 kilometers long and flows through the Petén rainforest."),
            zh = LocalizedContent("中美洲最长的河流是？", listOf("乌苏马辛塔河", "帕图卡河", "莫塔瓜河", "格里哈尔瓦河"), "地理", "乌苏马辛塔河是中美洲最长的河流，构成墨西哥和危地马拉之间的天然边界。它长约1000公里，流经佩滕雨林。"),
            es = LocalizedContent("¿Cuál es el río más largo de América Central?", listOf("Usumacinta", "Patuca", "Motagua", "Grijalva"), "Geografía", "El Usumacinta es el río más largo de América Central, formando una frontera natural entre México y Guatemala. Mide aproximadamente 1,000 kilómetros de largo y atraviesa la selva del Petén.")
        ),
        BilingualQuestion(
            id = 9734, correctIndex = 3, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("La capitale du Guatemala est...", listOf("Antigua", "Chichicastenango", "Quetzaltenango", "Guatemala City"), "Géographie", "Guatemala City est la capitale et la plus grande ville du Guatemala, située dans la région sud du pays. Elle est le centre politique, économique et culturel du pays."),
            en = LocalizedContent("The capital of Guatemala is...", listOf("Antigua", "Chichicastenango", "Quetzaltenango", "Guatemala City"), "Geography", "Guatemala City is the capital and largest city of Guatemala, located in the southern region of the country. It is the political, economic, and cultural center."),
            zh = LocalizedContent("危地马拉的首都是...", listOf("安提瓜", "奇奇卡斯特南戈", "克萨尔特南戈", "危地马拉城"), "地理", "危地马拉城是危地马拉的首都和最大城市，位于该国南部地区。它是政治、经济和文化中心。"),
            es = LocalizedContent("La capital de Guatemala es...", listOf("Antigua", "Chichicastenango", "Quetzaltenango", "Ciudad de Guatemala"), "Geografía", "La Ciudad de Guatemala es la capital y la ciudad más grande de Guatemala, ubicada en la región sur del país. Es el centro político, económico y cultural.")
        ),
        BilingualQuestion(
            id = 9735, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel montagnes abritent le plus haut sommet d'Amérique centrale?", listOf("Sierra Madre de Chiapas", "Cordillère centrale", "Sierra Madre Oriental", "Chaîne des Andes"), "Géographie", "Le point culminant d'Amérique centrale, le volcan Tajumulco (4 220 m), se trouve dans la Sierra Madre de Chiapas, une chaîne de montagnes qui s'étend du Mexique au Guatemala."),
            en = LocalizedContent("Which mountains are home to the highest peak in Central America?", listOf("Sierra Madre de Chiapas", "Central Mountain Range", "Sierra Madre Oriental", "Andes Range"), "Geography", "The highest point in Central America, Tajumulco Volcano (4,220 m), is located in the Sierra Madre de Chiapas, a mountain range extending from Mexico to Guatemala."),
            zh = LocalizedContent("哪座山脉拥有中美洲的最高峰？", listOf("恰帕斯马德雷山脉", "中央山脉", "东马德雷山脉", "安第斯山脉"), "地理", "中美洲的最高点塔胡穆尔科火山（4220米）位于恰帕斯马德雷山脉，该山脉从墨西哥延伸至危地马拉。"),
            es = LocalizedContent("¿Qué montañas albergan el pico más alto de América Central?", listOf("Sierra Madre de Chiapas", "Cordillera Central", "Sierra Madre Oriental", "Cordillera de los Andes"), "Geografía", "El punto más alto de América Central, el volcán Tajumulco (4,220 m), se encuentra en la Sierra Madre de Chiapas, una cadena montañosa que se extiende desde México hasta Guatemala.")
        ),
        BilingualQuestion(
            id = 9736, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("La capitale du Belize est...", listOf("Belize City", "Belmopan", "Orange Walk", "San Ignacio"), "Géographie", "Belmopan est devenue la capitale du Belize en 1970 après la destruction de Belize City par l'ouragan Hattie en 1961."),
            en = LocalizedContent("The capital of Belize is...", listOf("Belize City", "Belmopan", "Orange Walk", "San Ignacio"), "Geography", "Belmopan became the capital of Belize in 1970 after Belize City was destroyed by Hurricane Hattie in 1961."),
            zh = LocalizedContent("伯利兹的首都是...", listOf("伯利兹城", "贝尔莫潘", "奥兰治沃克", "圣伊格纳西奥"), "地理", "贝尔莫潘于1970年成为伯利兹首都，此前伯利兹城在1961年被飓风哈蒂摧毁。"),
            es = LocalizedContent("La capital de Belice es...", listOf("Ciudad de Belice", "Belmopán", "Orange Walk", "San Ignacio"), "Geografía", "Belmopán se convirtió en la capital de Belice en 1970 después de que la Ciudad de Belice fuera destruida por el huracán Hattie en 1961.")
        ),
        BilingualQuestion(
            id = 9737, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand récif corallien d'Amérique centrale?", listOf("Récif de Mesoamérica", "Récif de Belize", "Récif de Akumal", "Récif de Xcaret"), "Géographie", "Le récif de Mesoamérica s'étend sur plus de 1 000 km le long des côtes du Belize, du Guatemala, du Honduras et du Mexique, ce qui en fait le plus grand récif corallien d'Amérique centrale."),
            en = LocalizedContent("What is the largest coral reef in Central America?", listOf("Mesoamerican Reef", "Belize Barrier Reef", "Akumal Reef", "Xcaret Reef"), "Geography", "The Mesoamerican Reef stretches over 1,000 km along the coasts of Belize, Guatemala, Honduras, and Mexico, making it the largest coral reef in Central America."),
            zh = LocalizedContent("中美洲最大的珊瑚礁是？", listOf("中美洲大堡礁", "伯利兹堡礁", "阿库马尔礁", "谢哈礁"), "地理", "中美洲大堡礁沿伯利兹、危地马拉、洪都拉斯和墨西哥海岸延伸超过1000公里，是中美洲最大的珊瑚礁。"),
            es = LocalizedContent("¿Cuál es el arrecife de coral más grande de América Central?", listOf("Arrecife Mesoamericano", "Barrera de Coral de Belice", "Arrecife de Akumal", "Arrecife de Xcaret"), "Geografía", "El Arrecife Mesoamericano se extiende más de 1,000 km a lo largo de las costas de Belice, Guatemala, Honduras y México, lo que lo convierte en el arrecife de coral más grande de América Central.")
        ),
        BilingualQuestion(
            id = 9738, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("La capitale du Salvador est...", listOf("Santa Ana", "San Salvador", "La Libertad", "Sonsonate"), "Géographie", "San Salvador est la capitale et la plus grande ville du Salvador, située dans le département de San Salvador. Elle est le centre politique, économique et culturel du pays."),
            en = LocalizedContent("The capital of El Salvador is...", listOf("Santa Ana", "San Salvador", "La Libertad", "Sonsonate"), "Geography", "San Salvador is the capital and largest city of El Salvador, located in the San Salvador department. It is the political, economic, and cultural center of the country."),
            zh = LocalizedContent("萨尔瓦多的首都是...", listOf("圣安娜", "圣萨尔瓦多", "拉利伯塔德", "松索纳特"), "地理", "圣萨尔瓦多是萨尔瓦多的首都和最大城市，位于圣萨尔瓦多省。它是该国的政治、经济和文化中心。"),
            es = LocalizedContent("La capital de El Salvador es...", listOf("Santa Ana", "San Salvador", "La Libertad", "Sonsonate"), "Geografía", "San Salvador es la capital y la ciudad más grande de El Salvador, ubicada en el departamento de San Salvador. Es el centro político, económico y cultural del país.")
        ),
        BilingualQuestion(
            id = 9739, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel fleuve est la frontière entre le Honduras et le Guatemala?", listOf("Patuca", "Motagua", "Usumacinta", "Grijalva"), "Géographie", "Le fleuve Usumacinta marque une partie de la frontière entre le Guatemala et le Mexique, mais il ne sépare pas le Honduras du Guatemala. La frontière entre le Honduras et le Guatemala est principalement terrestre."),
            en = LocalizedContent("Which river forms the border between Honduras and Guatemala?", listOf("Patuca", "Motagua", "Usumacinta", "Grijalva"), "Geography", "The Usumacinta River marks part of the border between Guatemala and Mexico, but it does not separate Honduras from Guatemala. The border between Honduras and Guatemala is mostly land-based."),
            zh = LocalizedContent("哪条河流是洪都拉斯和危地马拉之间的边界？", listOf("帕图卡河", "莫塔瓜河", "乌苏马辛塔河", "格里哈尔瓦河"), "地理", "乌苏马辛塔河是危地马拉和墨西哥部分边界，但并不分隔洪都拉斯和危地马拉。洪都拉斯和危地马拉的边界主要是陆地边界。"),
            es = LocalizedContent("¿Qué río forma la frontera entre Honduras y Guatemala?", listOf("Patuca", "Motagua", "Usumacinta", "Grijalva"), "Geografía", "El río Usumacinta marca parte de la frontera entre Guatemala y México, pero no separa a Honduras de Guatemala. La frontera entre Honduras y Guatemala es principalmente terrestre.")
        ),
        BilingualQuestion(
            id = 9740, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("La capitale du Nicaragua est...", listOf("León", "Managua", "Granada", "Estelí"), "Géographie", "Managua est la capitale du Nicaragua depuis 1852, située sur la rive sud du lac Managua. Elle a remplacé León comme capitale après des rivalités historiques entre les villes."),
            en = LocalizedContent("The capital of Nicaragua is...", listOf("León", "Managua", "Granada", "Estelí"), "Geography", "Managua has been the capital of Nicaragua since 1852, located on the southern shore of Lake Managua. It replaced León as the capital after historical rivalries between the cities."),
            zh = LocalizedContent("尼加拉瓜的首都是...", listOf("莱昂", "马那瓜", "格拉纳达", "埃斯特利"), "地理", "自1852年以来，马那瓜一直是尼加拉瓜的首都，位于马那瓜湖南岸。由于城市间的历史竞争，它取代了莱昂成为首都。"),
            es = LocalizedContent("La capital de Nicaragua es...", listOf("León", "Managua", "Granada", "Estelí"), "Geografía", "Managua es la capital de Nicaragua desde 1852, situada en la orilla sur del lago de Managua. Reemplazó a León como capital tras rivalidades históricas entre las ciudades.")
        ),
        BilingualQuestion(
            id = 9741, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand lac d'Amérique centrale?", listOf("Lac Atitlán", "Lac Arenal", "Lac de Nicaragua", "Lac de Izabal"), "Géographie", "Le lac de Nicaragua est le plus grand lac d'Amérique centrale avec une superficie d'environ 8 264 km². Il est également connu pour abriter des requins d'eau douce."),
            en = LocalizedContent("What is the largest lake in Central America?", listOf("Lake Atitlán", "Lake Arenal", "Lake Nicaragua", "Lake Izabal"), "Geography", "Lake Nicaragua is the largest lake in Central America with an area of about 8,264 km². It is also known for harboring freshwater sharks."),
            zh = LocalizedContent("中美洲最大的湖泊是？", listOf("阿蒂特兰湖", "阿雷纳尔湖", "尼加拉瓜湖", "伊萨瓦尔湖"), "地理", "尼加拉瓜湖是中美洲最大的湖泊，面积约8,264平方公里。它还以栖息淡水鲨鱼而闻名。"),
            es = LocalizedContent("¿Cuál es el lago más grande de América Central?", listOf("Lago Atitlán", "Lago Arenal", "Lago de Nicaragua", "Lago de Izabal"), "Geografía", "El lago de Nicaragua es el lago más grande de América Central con una superficie de aproximadamente 8,264 km². También es conocido por albergar tiburones de agua dulce.")
        ),
        BilingualQuestion(
            id = 9742, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("La capitale du Costa Rica est...", listOf("Alajuela", "San José", "Cartago", "Heredia"), "Géographie", "San José est la capitale du Costa Rica, située dans la vallée centrale du pays. Elle abrite la majorité des institutions gouvernementales et économiques du pays."),
            en = LocalizedContent("The capital of Costa Rica is...", listOf("Alajuela", "San José", "Cartago", "Heredia"), "Geography", "San José is the capital of Costa Rica, located in the country's Central Valley. It houses the majority of the country's governmental and economic institutions."),
            zh = LocalizedContent("哥斯达黎加的首都是...", listOf("阿拉胡埃拉", "圣何塞", "卡塔戈", "埃雷迪亚"), "地理", "圣何塞是哥斯达黎加的首都，位于该国的中央山谷。它集中了该国大部分政府和经济机构。"),
            es = LocalizedContent("La capital de Costa Rica es...", listOf("Alajuela", "San José", "Cartago", "Heredia"), "Geografía", "San José es la capital de Costa Rica, situada en el Valle Central del país. Alberga la mayoría de las instituciones gubernamentales y económicas del país.")
        ),
        BilingualQuestion(
            id = 9743, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand volcan d'Amérique centrale?", listOf("Volcán Arenal", "Volcán Irazú", "Volcán Ometepe", "Volcán Atitlán"), "Géographie", "Le Volcán Arenal, au Costa Rica, est considéré comme le plus grand volcan d'Amérique centrale en raison de sa hauteur de 1 670 mètres et de son activité historique majeure."),
            en = LocalizedContent("What is the largest volcano in Central America?", listOf("Arenal Volcano", "Irazú Volcano", "Ometepe Volcano", "Atitlán Volcano"), "Geography", "Arenal Volcano in Costa Rica is considered the largest volcano in Central America due to its height of 1,670 meters and major historical activity."),
            zh = LocalizedContent("中美洲最大的火山是？", listOf("阿雷纳尔火山", "伊拉苏火山", "奥梅特佩火山", "阿蒂特兰火山"), "地理", "哥斯达黎加的阿雷纳尔火山被认为是中美洲最大的火山，因其海拔1,670米和重大的历史活动。"),
            es = LocalizedContent("¿Cuál es el volcán más grande de América Central?", listOf("Volcán Arenal", "Volcán Irazú", "Volcán Ometepe", "Volcán Atitlán"), "Geografía", "El Volcán Arenal en Costa Rica es considerado el volcán más grande de América Central debido a su altura de 1,670 metros y su importante actividad histórica.")
        ),
        BilingualQuestion(
            id = 9744, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("La capitale du Panama est...", listOf("Colón", "Panama City", "David", "Penonomé"), "Géographie", "Panama City est la capitale et la plus grande ville du Panama, située à l'entrée du canal de Panama sur la côte Pacifique."),
            en = LocalizedContent("The capital of Panama is...", listOf("Colón", "Panama City", "David", "Penonomé"), "Geography", "Panama City is the capital and largest city of Panama, located at the entrance of the Panama Canal on the Pacific coast."),
            zh = LocalizedContent("巴拿马的首都是...", listOf("科隆", "巴拿马城", "戴维", "佩诺诺梅"), "地理", "巴拿马城是巴拿马的首都和最大城市，位于太平洋沿岸巴拿马运河的入口处。"),
            es = LocalizedContent("La capital de Panamá es...", listOf("Colón", "Ciudad de Panamá", "David", "Penonomé"), "Geografía", "Ciudad de Panamá es la capital y ciudad más grande de Panamá, situada en la entrada del Canal de Panamá en la costa del Pacífico.")
        ),
        BilingualQuestion(
            id = 9745, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel détroit relie l'Amérique du Nord et l'Amérique centrale?", listOf("Détroit de Béring", "Détroit de Yucatán", "Canal de Panamá", "Détroit de Panama"), "Géographie", "Le canal de Panama, bien que souvent considéré comme un détroit artificiel, relie l'océan Atlantique au Pacifique et sépare l'Amérique du Nord de l'Amérique centrale."),
            en = LocalizedContent("Which strait connects North America and Central America?", listOf("Bering Strait", "Yucatán Strait", "Panama Canal", "Strait of Panama"), "Geography", "The Panama Canal, although often considered an artificial strait, connects the Atlantic Ocean to the Pacific and separates North America from Central America."),
            zh = LocalizedContent("哪个海峡连接北美洲和中美洲？", listOf("白令海峡", "尤卡坦海峡", "巴拿马运河", "巴拿马海峡"), "地理", "巴拿马运河虽然常被视为人工海峡，但它连接大西洋和太平洋，并将北美洲与中美洲分开。"),
            es = LocalizedContent("¿Qué estrecho conecta América del Norte y América Central?", listOf("Estrecho de Bering", "Estrecho de Yucatán", "Canal de Panamá", "Estrecho de Panamá"), "Geografía", "El Canal de Panamá, aunque a menudo considerado un estrecho artificial, conecta el océano Atlántico con el Pacífico y separa América del Norte de América Central.")
        ),
        BilingualQuestion(
            id = 9746, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel fleuve traverse le Venezuela?", listOf("Caura", "Orénoque", "Caroni", "Apure"), "Géographie", "L'Orénoque est l'un des plus longs fleuves d'Amérique du Sud, traversant le Venezuela d'ouest en est avant de se jeter dans l'océan Atlantique."),
            en = LocalizedContent("Which river flows through Venezuela?", listOf("Caura", "Orinoco", "Caroni", "Apure"), "Geography", "The Orinoco is one of the longest rivers in South America, flowing through Venezuela from west to east before emptying into the Atlantic Ocean."),
            zh = LocalizedContent("哪条河流经委内瑞拉？", listOf("考拉河", "奥里诺科河", "卡罗尼河", "阿普雷河"), "地理", "奥里诺科河是南美洲最长的河流之一，自西向东流经委内瑞拉，最终注入大西洋。"),
            es = LocalizedContent("¿Qué río atraviesa Venezuela?", listOf("Caura", "Orinoco", "Caroni", "Apure"), "Geografía", "El Orinoco es uno de los ríos más largos de América del Sur, atraviesa Venezuela de oeste a este antes de desembocar en el océano Atlántico.")
        ),
        BilingualQuestion(
            id = 9747, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("La capitale du Venezuela est...", listOf("Maracaibo", "Caracas", "Barquisimeto", "Valencia"), "Géographie", "Caracas est la capitale du Venezuela depuis 1830, située dans une vallée côtière au nord du pays. Elle concentre les institutions politiques et économiques de la nation."),
            en = LocalizedContent("The capital of Venezuela is...", listOf("Maracaibo", "Caracas", "Barquisimeto", "Valencia"), "Geography", "Caracas has been the capital of Venezuela since 1830, located in a coastal valley in the north of the country. It concentrates the nation's political and economic institutions."),
            zh = LocalizedContent("委内瑞拉的首都是...", listOf("马拉开波", "加拉加斯", "巴基西梅托", "巴伦西亚"), "地理", "自1830年以来，加拉加斯一直是委内瑞拉的首都，位于该国北部的一个沿海山谷。它集中了国家的政治和经济机构。"),
            es = LocalizedContent("La capital de Venezuela es...", listOf("Maracaibo", "Caracas", "Barquisimeto", "Valencia"), "Geografía", "Caracas es la capital de Venezuela desde 1830, situada en un valle costero al norte del país. Concentra las instituciones políticas y económicas de la nación.")
        ),
        BilingualQuestion(
            id = 9748, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus haut sommet du Venezuela?", listOf("Pic Espejo", "Pic Humboldt", "Pic Bonpland", "Pic de la Selle"), "Géographie", "Le Pic Humboldt, culminant à 4 940 mètres, est le plus haut sommet du Venezuela, situé dans la Sierra Nevada de Mérida, une chaîne des Andes."),
            en = LocalizedContent("What is the highest peak in Venezuela?", listOf("Pico Espejo", "Pico Humboldt", "Pico Bonpland", "Pic de la Selle"), "Geography", "Pico Humboldt, at 4,940 meters, is the highest peak in Venezuela, located in the Sierra Nevada de Mérida, a range of the Andes."),
            zh = LocalizedContent("委内瑞拉的最高峰是？", listOf("埃斯佩霍峰", "洪堡峰", "邦普朗峰", "塞勒峰"), "地理", "洪堡峰海拔4,940米，是委内瑞拉的最高峰，位于梅里达内华达山脉，属于安第斯山脉的一部分。"),
            es = LocalizedContent("¿Cuál es el pico más alto de Venezuela?", listOf("Pico Espejo", "Pico Humboldt", "Pico Bonpland", "Pic de la Selle"), "Geografía", "El Pico Humboldt, con 4,940 metros, es el pico más alto de Venezuela, ubicado en la Sierra Nevada de Mérida, una cordillera de los Andes.")
        ),
        BilingualQuestion(
            id = 9749, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("La capitale de la Colombie est...", listOf("Medellín", "Cali", "Bogotá", "Barranquilla"), "Géographie", "Bogotá est la capitale de la Colombie depuis 1886, située sur un haut plateau des Andes. C'est le centre politique, économique et culturel du pays."),
            en = LocalizedContent("The capital of Colombia is...", listOf("Medellín", "Cali", "Bogotá", "Barranquilla"), "Geography", "Bogotá has been the capital of Colombia since 1886, located on a high plateau in the Andes. It is the political, economic, and cultural center of the country."),
            zh = LocalizedContent("哥伦比亚的首都是...", listOf("麦德林", "卡利", "波哥大", "巴兰基亚"), "地理", "自1886年以来，波哥大一直是哥伦比亚的首都，位于安第斯山脉的一个高原上。它是该国的政治、经济和文化中心。"),
            es = LocalizedContent("La capital de Colombia es...", listOf("Medellín", "Cali", "Bogotá", "Barranquilla"), "Geografía", "Bogotá es la capital de Colombia desde 1886, situada en una altiplanicie de los Andes. Es el centro político, económico y cultural del país.")
        ),
    )

    private fun part5(): List<BilingualQuestion> = listOf(
        BilingualQuestion(
            id = 9750, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel fleuve traverse la Colombie?", listOf("Magdalena", "Atrato", "Cauca", "Tous les trois"), "Géographie", "Le fleuve Magdalena, le Cauca et l'Atrato sont les trois principaux fleuves qui traversent la Colombie, chacun jouant un rôle clé dans la géographie et l'économie du pays."),
            en = LocalizedContent("Which river flows through Colombia?", listOf("Magdalena", "Atrato", "Cauca", "All three"), "Geography", "The Magdalena, Cauca, and Atrato rivers are the three main rivers that flow through Colombia, each playing a key role in the country's geography and economy."),
            zh = LocalizedContent("哪条河流经哥伦比亚？", listOf("马格达莱纳河", "阿特拉托河", "考卡河", "以上全部"), "地理", "马格达莱纳河、考卡河和阿特拉托河是流经哥伦比亚的三条主要河流，每条河流在该国的地理和经济中都扮演着关键角色。"),
            es = LocalizedContent("¿Qué río atraviesa Colombia?", listOf("Magdalena", "Atrato", "Cauca", "Los tres"), "Geografía", "Los ríos Magdalena, Cauca y Atrato son los tres principales ríos que atraviesan Colombia, cada uno desempeñando un papel clave en la geografía y economía del país.")
        ),
        BilingualQuestion(
            id = 9751, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand désert d'Amérique du Sud?", listOf("Désert de Atacama", "Désert de Sechura", "Désert de Patagonie", "Pampas"), "Géographie", "Le désert d'Atacama, situé au nord du Chili, est le plus grand désert d'Amérique du Sud et l'un des plus arides au monde en raison de sa position entre la cordillère des Andes et l'océan Pacifique."),
            en = LocalizedContent("What is the largest desert in South America?", listOf("Atacama Desert", "Sechura Desert", "Patagonian Desert", "Pampas"), "Geography", "The Atacama Desert, located in northern Chile, is the largest desert in South America and one of the driest in the world due to its position between the Andes and the Pacific Ocean."),
            zh = LocalizedContent("南美洲最大的沙漠是什么？", listOf("阿塔卡马沙漠", "塞丘拉沙漠", "巴塔哥尼亚沙漠", "潘帕斯草原"), "地理", "阿塔卡马沙漠位于智利北部，是南美洲最大的沙漠，也是世界上最干旱的沙漠之一，因其位于安第斯山脉和太平洋之间。"),
            es = LocalizedContent("¿Cuál es el desierto más grande de Sudamérica?", listOf("Desierto de Atacama", "Desierto de Sechura", "Desierto de Patagonia", "Pampas"), "Geografía", "El desierto de Atacama, ubicado en el norte de Chile, es el desierto más grande de Sudamérica y uno de los más áridos del mundo debido a su posición entre la cordillera de los Andes y el océano Pacífico.")
        ),
        BilingualQuestion(
            id = 9752, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("La capitale de l'Équateur est...", listOf("Guayaquil", "Quito", "Cuenca", "Ambato"), "Géographie", "Quito est la capitale de l'Équateur, située dans les Andes à une altitude de 2 850 mètres, ce qui en fait la deuxième plus haute capitale du monde."),
            en = LocalizedContent("The capital of Ecuador is...", listOf("Guayaquil", "Quito", "Cuenca", "Ambato"), "Geography", "Quito is the capital of Ecuador, located in the Andes at an altitude of 2,850 meters, making it the second highest capital in the world."),
            zh = LocalizedContent("厄瓜多尔的首都是...", listOf("瓜亚基尔", "基多", "昆卡", "安巴托"), "地理", "基多是厄瓜多尔的首都，位于安第斯山脉，海拔2850米，是世界第二高的首都。"),
            es = LocalizedContent("La capital de Ecuador es...", listOf("Guayaquil", "Quito", "Cuenca", "Ambato"), "Geografía", "Quito es la capital de Ecuador, ubicada en los Andes a una altitud de 2.850 metros, lo que la convierte en la segunda capital más alta del mundo.")
        ),
        BilingualQuestion(
            id = 9753, correctIndex = 3, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel montagnes abritent le plus haut sommet d'Amérique du Sud?", listOf("Chaîne côtière", "Cordillère occidentale", "Cordillère orientale", "Andes"), "Géographie", "La cordillère des Andes traverse toute l'Amérique du Sud et son sommet, l'Aconcagua, culmine à 6 961 mètres, ce qui en fait le plus haut du continent."),
            en = LocalizedContent("Which mountains are home to the highest peak in South America?", listOf("Coastal Range", "Western Cordillera", "Eastern Cordillera", "Andes"), "Geography", "The Andes mountain range runs through all of South America and its peak, Aconcagua, rises to 6,961 meters, making it the highest on the continent."),
            zh = LocalizedContent("哪座山脉拥有南美洲的最高峰？", listOf("海岸山脉", "西科迪勒拉山脉", "东科迪勒拉山脉", "安第斯山脉"), "地理", "安第斯山脉纵贯南美洲，其最高峰阿空加瓜山海拔6961米，是南美洲的最高点。"),
            es = LocalizedContent("¿Qué montañas albergan el pico más alto de Sudamérica?", listOf("Cordillera de la Costa", "Cordillera Occidental", "Cordillera Oriental", "Andes"), "Geografía", "La cordillera de los Andes atraviesa toda Sudamérica y su pico, el Aconcagua, alcanza los 6.961 metros, siendo el más alto del continente.")
        ),
        BilingualQuestion(
            id = 9754, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("La capitale du Pérou est...", listOf("Arequipa", "Cuzco", "Lima", "Trujillo"), "Géographie", "Lima est la capitale du Pérou depuis sa fondation par les conquistadors espagnols en 1535. Elle est située sur la côte centrale du pays, au bord de l'océan Pacifique."),
            en = LocalizedContent("The capital of Peru is...", listOf("Arequipa", "Cusco", "Lima", "Trujillo"), "Geography", "Lima has been the capital of Peru since its founding by Spanish conquistadors in 1535. It is located on the central coast of the country, on the Pacific Ocean."),
            zh = LocalizedContent("秘鲁的首都是...", listOf("阿雷基帕", "库斯科", "利马", "特鲁希略"), "地理", "利马自1535年由西班牙征服者建立以来一直是秘鲁的首都，位于该国中部海岸，濒临太平洋。"),
            es = LocalizedContent("La capital de Perú es...", listOf("Arequipa", "Cuzco", "Lima", "Trujillo"), "Geografía", "Lima es la capital de Perú desde su fundación por los conquistadores españoles en 1535. Está ubicada en la costa central del país, a orillas del océano Pacífico.")
        ),
        BilingualQuestion(
            id = 9755, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel fleuve traverse le Pérou?", listOf("Urubamba", "Ucayali", "Amazone", "Tous les trois"), "Géographie", "Le Pérou est traversé par trois grands fleuves : l'Amazone, l'Ucayali et le Marañón, ces deux derniers étant les principales sources de l'Amazone."),
            en = LocalizedContent("Which river flows through Peru?", listOf("Urubamba", "Ucayali", "Amazon", "All three"), "Geography", "Peru is traversed by three major rivers: the Amazon, the Ucayali, and the Marañón, the latter two being the main sources of the Amazon."),
            zh = LocalizedContent("哪条河流经秘鲁？", listOf("乌鲁班巴河", "乌卡亚利河", "亚马逊河", "以上全部"), "地理", "秘鲁有三条主要河流流经：亚马逊河、乌卡亚利河和马腊尼翁河，后两者是亚马逊河的主要源头。"),
            es = LocalizedContent("¿Qué río atraviesa Perú?", listOf("Urubamba", "Ucayali", "Amazonas", "Los tres"), "Geografía", "Perú es atravesado por tres grandes ríos: el Amazonas, el Ucayali y el Marañón, siendo estos dos últimos las principales fuentes del Amazonas.")
        ),
        BilingualQuestion(
            id = 9756, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plus grand fleuve du monde?", listOf("Nil", "Amazone", "Congo", "Mississippi"), "Géographie", "L'Amazone est le plus grand fleuve du monde en volume d'eau, avec un débit moyen d'environ 209 000 m³/s, dépassant largement les autres fleuves comme le Nil."),
            en = LocalizedContent("What is the largest river in the world?", listOf("Nile", "Amazon", "Congo", "Mississippi"), "Geography", "The Amazon is the largest river in the world by water volume, with an average discharge of about 209,000 m³/s, far exceeding other rivers like the Nile."),
            zh = LocalizedContent("世界上最大的河流是什么？", listOf("尼罗河", "亚马逊河", "刚果河", "密西西比河"), "地理", "亚马逊河是世界上水量最大的河流，平均流量约为每秒209,000立方米，远超尼罗河等其他河流。"),
            es = LocalizedContent("¿Cuál es el río más grande del mundo?", listOf("Nilo", "Amazonas", "Congo", "Misisipi"), "Geografía", "El Amazonas es el río más grande del mundo en volumen de agua, con un caudal medio de aproximadamente 209.000 m³/s, superando ampliamente a otros ríos como el Nilo.")
        ),
        BilingualQuestion(
            id = 9757, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("La capitale du Brésil est...", listOf("Rio de Janeiro", "São Paulo", "Brasília", "Salvador"), "Géographie", "Brasília est devenue la capitale du Brésil en 1960, construite spécialement pour remplacer Rio de Janeiro et déplacer le centre politique vers l'intérieur du pays."),
            en = LocalizedContent("The capital of Brazil is...", listOf("Rio de Janeiro", "São Paulo", "Brasília", "Salvador"), "Geography", "Brasília became the capital of Brazil in 1960, built specifically to replace Rio de Janeiro and move the political center inland."),
            zh = LocalizedContent("巴西的首都是...", listOf("里约热内卢", "圣保罗", "巴西利亚", "萨尔瓦多"), "地理", "巴西利亚于1960年成为巴西首都，专门为取代里约热内卢而建，并将政治中心迁往内陆。"),
            es = LocalizedContent("La capital de Brasil es...", listOf("Río de Janeiro", "São Paulo", "Brasília", "Salvador"), "Geografía", "Brasília se convirtió en la capital de Brasil en 1960, construida específicamente para reemplazar a Río de Janeiro y trasladar el centro político hacia el interior del país.")
        ),
        BilingualQuestion(
            id = 9758, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel fleuve traverse le Brésil?", listOf("Rio Madeira", "Rio Negro", "Amazone", "Tous les trois"), "Géographie", "Le Brésil est traversé par l'Amazone, le São Francisco et le Paraná, qui sont les trois principaux fleuves du pays."),
            en = LocalizedContent("Which river flows through Brazil?", listOf("Madeira River", "Negro River", "Amazon", "All three"), "Geography", "Brazil is traversed by the Amazon, the São Francisco, and the Paraná, which are the three main rivers of the country."),
            zh = LocalizedContent("哪条河流经巴西？", listOf("马代拉河", "内格罗河", "亚马逊河", "以上全部"), "地理", "巴西有亚马逊河、圣弗朗西斯科河和巴拉那河三条主要河流流经。"),
            es = LocalizedContent("¿Qué río atraviesa Brasil?", listOf("Río Madeira", "Río Negro", "Amazonas", "Los tres"), "Geografía", "Brasil es atravesado por el Amazonas, el São Francisco y el Paraná, que son los tres principales ríos del país.")
        ),
        BilingualQuestion(
            id = 9759, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand désert du Brésil?", listOf("Désert de Atacama", "Désert de Iquique", "Sertão", "Cerrado"), "Géographie", "Le Sertão est une vaste région semi-aride du nord-est du Brésil, souvent considérée comme le plus grand désert du pays en raison de son climat sec et de sa végétation clairsemée."),
            en = LocalizedContent("What is the largest desert in Brazil?", listOf("Atacama Desert", "Iquique Desert", "Sertão", "Cerrado"), "Geography", "The Sertão is a vast semi-arid region in northeastern Brazil, often considered the largest desert in the country due to its dry climate and sparse vegetation."),
            zh = LocalizedContent("巴西最大的沙漠是什么？", listOf("阿塔卡马沙漠", "伊基克沙漠", "塞尔唐地区", "塞拉多地区"), "地理", "塞尔唐是巴西东北部一片广阔的半干旱地区，由于其干燥的气候和稀疏的植被，常被认为是该国最大的沙漠。"),
            es = LocalizedContent("¿Cuál es el desierto más grande de Brasil?", listOf("Desierto de Atacama", "Desierto de Iquique", "Sertão", "Cerrado"), "Geografía", "El Sertão es una vasta región semiárida en el noreste de Brasil, a menudo considerada el desierto más grande del país debido a su clima seco y vegetación escasa.")
        ),
        BilingualQuestion(
            id = 9760, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("La capitale de la Bolivie est...", listOf("Cochabamba", "Sucre", "La Paz", "Santa Cruz de la Sierra"), "Géographie", "La Paz est la capitale administrative et le siège du gouvernement bolivien, tandis que Sucre est la capitale constitutionnelle et judiciaire."),
            en = LocalizedContent("The capital of Bolivia is...", listOf("Cochabamba", "Sucre", "La Paz", "Santa Cruz de la Sierra"), "Geography", "La Paz is the administrative capital and seat of government of Bolivia, while Sucre is the constitutional and judicial capital."),
            zh = LocalizedContent("玻利维亚的首都是...", listOf("科恰班巴", "苏克雷", "拉巴斯", "圣克鲁斯"), "地理", "拉巴斯是玻利维亚的行政首都和政府所在地，而苏克雷是宪法首都和司法首都。"),
            es = LocalizedContent("La capital de Bolivia es...", listOf("Cochabamba", "Sucre", "La Paz", "Santa Cruz de la Sierra"), "Geografía", "La Paz es la capital administrativa y sede del gobierno boliviano, mientras que Sucre es la capital constitucional y judicial.")
        ),
        BilingualQuestion(
            id = 9761, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plus grand lac d'Amérique du Sud?", listOf("Lac Titicaca", "Lac Poopó", "Lac Coipasa", "Lac Chinchorro"), "Géographie", "Le lac Titicaca, situé à la frontière entre le Pérou et la Bolivie, est le plus grand lac d'Amérique du Sud par sa superficie et son volume d'eau, culminant à 3 812 mètres d'altitude."),
            en = LocalizedContent("What is the largest lake in South America?", listOf("Lake Titicaca", "Lake Poopó", "Lake Coipasa", "Lake Chinchorro"), "Geography", "Lake Titicaca, located on the border between Peru and Bolivia, is the largest lake in South America by surface area and water volume, at an altitude of 3,812 meters."),
            zh = LocalizedContent("南美洲最大的湖泊是？", listOf("的的喀喀湖", "波波湖", "科伊帕萨湖", "钦乔罗湖"), "地理", "的的喀喀湖位于秘鲁和玻利维亚边境，是南美洲面积最大、水量最多的湖泊，海拔3812米。"),
            es = LocalizedContent("¿Cuál es el lago más grande de América del Sur?", listOf("Lago Titicaca", "Lago Poopó", "Lago Coipasa", "Lago Chinchorro"), "Geografía", "El lago Titicaca, ubicado en la frontera entre Perú y Bolivia, es el lago más grande de América del Sur por superficie y volumen de agua, a una altitud de 3.812 metros.")
        ),
        BilingualQuestion(
            id = 9762, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("La capitale de l'Uruguay est...", listOf("Colonia", "Salto", "Montevideo", "Punta del Este"), "Géographie", "Montevideo est la capitale et la plus grande ville de l'Uruguay, située sur la rive nord du Río de la Plata. Elle concentre la majorité de la population et de l'activité économique du pays."),
            en = LocalizedContent("The capital of Uruguay is...", listOf("Colonia", "Salto", "Montevideo", "Punta del Este"), "Geography", "Montevideo is the capital and largest city of Uruguay, located on the northern bank of the Río de la Plata. It concentrates the majority of the country's population and economic activity."),
            zh = LocalizedContent("乌拉圭的首都是...", listOf("科洛尼亚", "萨尔托", "蒙得维的亚", "埃斯特角城"), "地理", "蒙得维的亚是乌拉圭的首都和最大城市，位于拉普拉塔河北岸，集中了该国大部分人口和经济活动。"),
            es = LocalizedContent("La capital de Uruguay es...", listOf("Colonia", "Salto", "Montevideo", "Punta del Este"), "Geografía", "Montevideo es la capital y ciudad más grande de Uruguay, ubicada en la margen norte del Río de la Plata. Concentra la mayor parte de la población y la actividad económica del país.")
        ),
        BilingualQuestion(
            id = 9763, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel fleuve borde l'Uruguay?", listOf("Paraná", "Río de la Plata", "Paraná", "Tous les deux"), "Géographie", "Le Rio de la Plata et le fleuve Uruguay forment la frontière ouest et sud de l'Uruguay. Le pays est bordé par ces deux cours d'eau."),
            en = LocalizedContent("Which river borders Uruguay?", listOf("Paraná", "Río de la Plata", "Paraná", "Both"), "Geography", "The Río de la Plata and the Uruguay River form the western and southern borders of Uruguay. The country is bordered by these two rivers."),
            zh = LocalizedContent("哪条河流与乌拉圭接壤？", listOf("巴拉那河", "拉普拉塔河", "巴拉那河", "两者都是"), "地理", "拉普拉塔河和乌拉圭河构成了乌拉圭的西部和南部边界。该国被这两条河流环绕。"),
            es = LocalizedContent("¿Qué río bordea Uruguay?", listOf("Paraná", "Río de la Plata", "Paraná", "Ambos"), "Geografía", "El Río de la Plata y el río Uruguay forman la frontera oeste y sur de Uruguay. El país está bordeado por estos dos ríos.")
        ),
        BilingualQuestion(
            id = 9764, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("La capitale de l'Argentine est...", listOf("Córdoba", "Rosario", "Buenos Aires", "Mendoza"), "Géographie", "Buenos Aires est la capitale et la plus grande ville d'Argentine, fondée en 1536 par l'explorateur espagnol Pedro de Mendoza."),
            en = LocalizedContent("The capital of Argentina is...", listOf("Córdoba", "Rosario", "Buenos Aires", "Mendoza"), "Geography", "Buenos Aires is the capital and largest city of Argentina, founded in 1536 by the Spanish explorer Pedro de Mendoza."),
            zh = LocalizedContent("阿根廷的首都是...", listOf("科尔多瓦", "罗萨里奥", "布宜诺斯艾利斯", "门多萨"), "地理", "布宜诺斯艾利斯是阿根廷的首都和最大城市，由西班牙探险家佩德罗·德·门多萨于1536年建立。"),
            es = LocalizedContent("La capital de Argentina es...", listOf("Córdoba", "Rosario", "Buenos Aires", "Mendoza"), "Geografía", "Buenos Aires es la capital y ciudad más grande de Argentina, fundada en 1536 por el explorador español Pedro de Mendoza.")
        ),
        BilingualQuestion(
            id = 9765, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel fleuve traverse l'Argentine?", listOf("Paraná", "Río de la Plata", "Uruguay", "Tous les trois"), "Géographie", "Le Colorado, le Paraná et le Río Negro sont les trois principaux fleuves qui traversent l'Argentine, chacun drainant une région différente du pays."),
            en = LocalizedContent("Which river flows through Argentina?", listOf("Paraná", "Río de la Plata", "Uruguay", "All three"), "Geography", "The Colorado, Paraná, and Río Negro are the three main rivers that flow through Argentina, each draining a different region of the country."),
            zh = LocalizedContent("哪条河流经阿根廷？", listOf("巴拉那河", "拉普拉塔河", "乌拉圭河", "以上三条"), "地理", "科罗拉多河、巴拉那河和内格罗河是流经阿根廷的三条主要河流，每条河流经该国不同地区。"),
            es = LocalizedContent("¿Qué río atraviesa Argentina?", listOf("Paraná", "Río de la Plata", "Uruguay", "Los tres"), "Geografía", "El Colorado, el Paraná y el Río Negro son los tres principales ríos que atraviesan Argentina, cada uno drenando una región diferente del país.")
        ),
        BilingualQuestion(
            id = 9766, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plus haut sommet d'Amérique du Sud?", listOf("Pic Chimborazo", "Mont Aconcagua", "Pic Huascarán", "Nevado Ojos del Salado"), "Géographie", "L'Aconcagua culmine à 6 961 mètres dans la cordillère des Andes, en Argentine, ce qui en fait le plus haut sommet d'Amérique du Sud et de l'hémisphère sud."),
            en = LocalizedContent("What is the highest peak in South America?", listOf("Chimborazo", "Aconcagua", "Huascarán", "Nevado Ojos del Salado"), "Geography", "Aconcagua rises to 6,961 meters in the Andes mountain range in Argentina, making it the highest peak in South America and the Southern Hemisphere."),
            zh = LocalizedContent("南美洲最高峰是？", listOf("钦博拉索山", "阿空加瓜山", "瓦斯卡兰山", "奥霍斯-德尔萨拉多山"), "地理", "阿空加瓜山位于阿根廷安第斯山脉，海拔6961米，是南美洲和南半球的最高峰。"),
            es = LocalizedContent("¿Cuál es el pico más alto de América del Sur?", listOf("Chimborazo", "Aconcagua", "Huascarán", "Nevado Ojos del Salado"), "Geografía", "El Aconcagua se eleva a 6.961 metros en la cordillera de los Andes en Argentina, lo que lo convierte en el pico más alto de América del Sur y del hemisferio sur.")
        ),
        BilingualQuestion(
            id = 9767, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("La capitale du Chili est...", listOf("Valparaíso", "Concepción", "Santiago", "Valdivia"), "Géographie", "Santiago est la capitale et la plus grande ville du Chili, située dans la vallée centrale du pays. Elle a été fondée en 1541 par le conquistador espagnol Pedro de Valdivia."),
            en = LocalizedContent("The capital of Chile is...", listOf("Valparaíso", "Concepción", "Santiago", "Valdivia"), "Geography", "Santiago is the capital and largest city of Chile, located in the country's central valley. It was founded in 1541 by the Spanish conquistador Pedro de Valdivia."),
            zh = LocalizedContent("智利的首都是...", listOf("瓦尔帕莱索", "康塞普西翁", "圣地亚哥", "瓦尔迪维亚"), "地理", "圣地亚哥是智利的首都和最大城市，位于该国中央山谷，由西班牙征服者佩德罗·德·瓦尔迪维亚于1541年建立。"),
            es = LocalizedContent("La capital de Chile es...", listOf("Valparaíso", "Concepción", "Santiago", "Valdivia"), "Geografía", "Santiago es la capital y ciudad más grande de Chile, ubicada en el valle central del país. Fue fundada en 1541 por el conquistador español Pedro de Valdivia.")
        ),
        BilingualQuestion(
            id = 9768, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel désert borde le Chili?", listOf("Désert de Sechura", "Désert d'Atacama", "Désert de Patagonie", "Pampas"), "Géographie", "Le désert d'Atacama, situé dans le nord du Chili, est l'un des plus arides au monde, bordant l'océan Pacifique."),
            en = LocalizedContent("Which desert borders Chile?", listOf("Sechura Desert", "Atacama Desert", "Patagonian Desert", "Pampas"), "Geography", "The Atacama Desert, located in northern Chile, is one of the driest in the world, bordering the Pacific Ocean."),
            zh = LocalizedContent("哪个沙漠与智利接壤？", listOf("塞丘拉沙漠", "阿塔卡马沙漠", "巴塔哥尼亚沙漠", "潘帕斯草原"), "地理", "阿塔卡马沙漠位于智利北部，是世界上最干旱的沙漠之一，毗邻太平洋。"),
            es = LocalizedContent("¿Qué desierto bordea Chile?", listOf("Desierto de Sechura", "Desierto de Atacama", "Desierto de Patagonia", "Pampas"), "Geografía", "El desierto de Atacama, ubicado en el norte de Chile, es uno de los más áridos del mundo, bordeando el océano Pacífico.")
        ),
        BilingualQuestion(
            id = 9769, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("La capitale du Paraguay est...", listOf("Encarnación", "Ciudad del Este", "Asunción", "Villarrica"), "Géographie", "Asunción est la capitale et la plus grande ville du Paraguay, située sur la rive gauche du fleuve Paraguay. Elle fut fondée en 1537 par les conquistadors espagnols."),
            en = LocalizedContent("The capital of Paraguay is...", listOf("Encarnación", "Ciudad del Este", "Asunción", "Villarrica"), "Geography", "Asunción is the capital and largest city of Paraguay, located on the left bank of the Paraguay River. It was founded in 1537 by Spanish conquistadors."),
            zh = LocalizedContent("巴拉圭的首都是...", listOf("恩卡纳西翁", "东方市", "亚松森", "比亚里卡"), "地理", "亚松森是巴拉圭的首都和最大城市，位于巴拉圭河左岸，由西班牙征服者于1537年建立。"),
            es = LocalizedContent("La capital de Paraguay es...", listOf("Encarnación", "Ciudad del Este", "Asunción", "Villarrica"), "Geografía", "Asunción es la capital y ciudad más grande de Paraguay, ubicada en la margen izquierda del río Paraguay. Fue fundada en 1537 por los conquistadores españoles.")
        ),
        BilingualQuestion(
            id = 9770, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel fleuve traverse le Paraguay?", listOf("Paraná", "Paraguay", "Tapajós", "Tous les deux"), "Géographie", "Le fleuve Paraguay traverse le pays du même nom du nord au sud, servant d'axe majeur pour le transport et l'économie, avant de se jeter dans le Paraná."),
            en = LocalizedContent("Which river flows through Paraguay?", listOf("Paraná", "Paraguay", "Tapajós", "Both"), "Geography", "The Paraguay River flows through the country of the same name from north to south, serving as a major axis for transport and economy, before joining the Paraná."),
            zh = LocalizedContent("哪条河流经巴拉圭？", listOf("巴拉那河", "巴拉圭河", "塔帕若斯河", "两者都是"), "地理", "巴拉圭河自北向南流经同名国家，是运输和经济的主要动脉，之后注入巴拉那河。"),
            es = LocalizedContent("¿Qué río atraviesa Paraguay?", listOf("Paraná", "Paraguay", "Tapajós", "Ambos"), "Geografia", "El río Paraguay atraviesa el país homónimo de norte a sur, sirviendo como eje principal para el transporte y la economía, antes de desembocar en el Paraná.")
        ),
        BilingualQuestion(
            id = 9771, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel continent a le plus de frontières terrestres?", listOf("Asie", "Amérique du Nord", "Europe", "Afrique"), "Géographie", "L'Asie est le plus grand continent et partage des frontières terrestres avec l'Europe et l'Afrique, ainsi qu'avec de nombreux pays voisins, ce qui lui donne le plus grand nombre de frontières terrestres."),
            en = LocalizedContent("Which continent has the most land borders?", listOf("Asia", "North America", "Europe", "Africa"), "Geography", "Asia is the largest continent and shares land borders with Europe and Africa, as well as many neighboring countries, giving it the highest number of land borders."),
            zh = LocalizedContent("哪个大洲的陆地边界最多？", listOf("亚洲", "北美洲", "欧洲", "非洲"), "地理", "亚洲是最大的大洲，与欧洲和非洲有陆地边界，并与许多邻国接壤，因此陆地边界数量最多。"),
            es = LocalizedContent("¿Qué continente tiene más fronteras terrestres?", listOf("Asia", "América del Norte", "Europa", "África"), "Geografia", "Asia es el continente más grande y comparte fronteras terrestres con Europa y África, así como con muchos países vecinos, lo que le otorga el mayor número de fronteras terrestres.")
        ),
        BilingualQuestion(
            id = 9772, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel pays a le plus de frontières terrestres?", listOf("Russie", "Canada", "Chine", "France"), "Géographie", "La Russie partage des frontières terrestres avec 14 pays, incluant la Norvège, la Finlande, la Chine et la Corée du Nord, ce qui en fait le record mondial."),
            en = LocalizedContent("Which country has the most land borders?", listOf("Russia", "Canada", "China", "France"), "Geography", "Russia shares land borders with 14 countries, including Norway, Finland, China, and North Korea, making it the world record holder."),
            zh = LocalizedContent("哪个国家的陆地边界最多？", listOf("俄罗斯", "加拿大", "中国", "法国"), "地理", "俄罗斯与14个国家有陆地边界，包括挪威、芬兰、中国和朝鲜，因此保持世界纪录。"),
            es = LocalizedContent("¿Qué país tiene más fronteras terrestres?", listOf("Rusia", "Canadá", "China", "Francia"), "Geografia", "Rusia comparte fronteras terrestres con 14 países, incluyendo Noruega, Finlandia, China y Corea del Norte, lo que lo convierte en el récord mundial.")
        ),
        BilingualQuestion(
            id = 9773, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le pays le plus peuplé du monde?", listOf("Inde", "Chine", "Indonésie", "Pakistan"), "Géographie", "L'Inde a dépassé la Chine en 2023 pour devenir le pays le plus peuplé du monde, avec plus de 1,4 milliard d'habitants."),
            en = LocalizedContent("Which is the most populous country in the world?", listOf("India", "China", "Indonesia", "Pakistan"), "Geography", "India surpassed China in 2023 to become the world's most populous country, with over 1.4 billion inhabitants."),
            zh = LocalizedContent("世界上人口最多的国家是哪个？", listOf("印度", "中国", "印度尼西亚", "巴基斯坦"), "地理", "印度在2023年超过中国，成为世界上人口最多的国家，人口超过14亿。"),
            es = LocalizedContent("¿Cuál es el país más poblado del mundo?", listOf("India", "China", "Indonesia", "Pakistán"), "Geografia", "La India superó a China en 2023 para convertirse en el país más poblado del mundo, con más de 1.400 millones de habitantes.")
        ),
        BilingualQuestion(
            id = 9774, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le pays le moins peuplé du monde?", listOf("Vatican", "Nauru", "Tuvalu", "Palaos"), "Géographie", "Le Vatican, avec environ 800 habitants, est une cité-État enclavée dans Rome et le siège de l'Église catholique, ce qui en fait le pays le moins peuplé du monde."),
            en = LocalizedContent("Which is the least populous country in the world?", listOf("Vatican City", "Nauru", "Tuvalu", "Palau"), "Geography", "Vatican City, with about 800 inhabitants, is a city-state enclaved within Rome and the seat of the Catholic Church, making it the least populous country in the world."),
            zh = LocalizedContent("世界上人口最少的国家是哪个？", listOf("梵蒂冈", "瑙鲁", "图瓦卢", "帕劳"), "地理", "梵蒂冈约有800名居民，是罗马城内的一块飞地，也是天主教会的所在地，因此是世界上人口最少的国家。"),
            es = LocalizedContent("¿Cuál es el país menos poblado del mundo?", listOf("Ciudad del Vaticano", "Nauru", "Tuvalu", "Palaos"), "Geografia", "La Ciudad del Vaticano, con unos 800 habitantes, es una ciudad-estado enclavada en Roma y sede de la Iglesia Católica, lo que la convierte en el país menos poblado del mundo.")
        ),
        BilingualQuestion(
            id = 9775, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel continent a le plus de pays?", listOf("Asie", "Afrique", "Amérique", "Europe"), "Géographie", "L'Afrique compte 54 pays reconnus par l'ONU, soit le plus grand nombre de tous les continents, devant l'Europe (environ 50) et l'Asie (48)."),
            en = LocalizedContent("Which continent has the most countries?", listOf("Asia", "Africa", "America", "Europe"), "Geography", "Africa has 54 countries recognized by the UN, the highest number of any continent, ahead of Europe (about 50) and Asia (48)."),
            zh = LocalizedContent("哪个大洲的国家数量最多？", listOf("亚洲", "非洲", "美洲", "欧洲"), "地理", "非洲有54个联合国承认的国家，是所有大洲中最多的，领先于欧洲（约50个）和亚洲（48个）。"),
            es = LocalizedContent("¿Qué continente tiene más países?", listOf("Asia", "África", "América", "Europa"), "Geografia", "África tiene 54 países reconocidos por la ONU, la mayor cantidad de todos los continentes, por delante de Europa (unos 50) y Asia (48).")
        ),
        BilingualQuestion(
            id = 9776, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plus grand désert du monde?", listOf("Arabie", "Gobi", "Sahara", "Antarctique"), "Géographie", "Le Sahara est le plus grand désert chaud du monde, mais si l'on considère les déserts polaires, l'Antarctique est en réalité le plus vaste."),
            en = LocalizedContent("Which is the largest desert in the world?", listOf("Arabian", "Gobi", "Sahara", "Antarctic"), "Geography", "The Sahara is the largest hot desert in the world, but if polar deserts are considered, Antarctica is actually the largest."),
            zh = LocalizedContent("世界上最大的沙漠是哪个？", listOf("阿拉伯沙漠", "戈壁沙漠", "撒哈拉沙漠", "南极洲"), "地理", "撒哈拉沙漠是世界上最大的热带沙漠，但如果考虑极地沙漠，南极洲实际上是最大的。"),
            es = LocalizedContent("¿Cuál es el desierto más grande del mundo?", listOf("Arábigo", "Gobi", "Sáhara", "Antártico"), "Geografia", "El Sáhara es el desierto cálido más grande del mundo, pero si se consideran los desiertos polares, la Antártida es en realidad el más extenso.")
        ),
        BilingualQuestion(
            id = 9777, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le plus haut sommet du monde?", listOf("K2", "Mont Everest", "Kangchenjunga", "Lhotse"), "Géographie", "L'Everest culmine à 8 848,86 mètres d'altitude dans l'Himalaya, à la frontière entre le Népal et le Tibet. Il doit son nom au géomètre britannique George Everest."),
            en = LocalizedContent("Which is the highest peak in the world?", listOf("K2", "Mount Everest", "Kangchenjunga", "Lhotse"), "Geography", "Mount Everest rises to 8,848.86 meters above sea level in the Himalayas, on the border between Nepal and Tibet. It is named after British surveyor George Everest."),
            zh = LocalizedContent("世界上最高的山峰是哪个？", listOf("K2", "珠穆朗玛峰", "干城章嘉峰", "洛子峰"), "地理", "珠穆朗玛峰海拔8848.86米，位于喜马拉雅山脉，尼泊尔与西藏交界处。它以英国测量师乔治·额菲尔士的名字命名。"),
            es = LocalizedContent("¿Cuál es el pico más alto del mundo?", listOf("K2", "Monte Everest", "Kangchenjunga", "Lhotse"), "Geografia", "El Everest se eleva a 8.848,86 metros sobre el nivel del mar en el Himalaya, en la frontera entre Nepal y el Tíbet. Debe su nombre al topógrafo británico George Everest.")
        ),
        BilingualQuestion(
            id = 9778, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus profond océan du monde?", listOf("Océan Atlantique", "Océan Indien", "Océan Pacifique", "Océan Arctique"), "Géographie", "L'océan Pacifique abrite la fosse des Mariannes, dont le point le plus profond, le Challenger Deep, descend à environ 11 000 mètres sous le niveau de la mer."),
            en = LocalizedContent("Which is the deepest ocean in the world?", listOf("Atlantic Ocean", "Indian Ocean", "Pacific Ocean", "Arctic Ocean"), "Geography", "The Pacific Ocean contains the Mariana Trench, whose deepest point, the Challenger Deep, descends to about 11,000 meters below sea level."),
            zh = LocalizedContent("世界上最深的海洋是哪个？", listOf("大西洋", "印度洋", "太平洋", "北冰洋"), "地理", "太平洋拥有马里亚纳海沟，其最深处挑战者深渊约在海平面以下11000米。"),
            es = LocalizedContent("¿Cuál es el océano más profundo del mundo?", listOf("Océano Atlántico", "Océano Índico", "Océano Pacífico", "Océano Ártico"), "Geografia", "El océano Pacífico alberga la fosa de las Marianas, cuyo punto más profundo, el Abismo Challenger, desciende a unos 11.000 metros bajo el nivel del mar.")
        ),
        BilingualQuestion(
            id = 9779, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le fleuve le plus long du monde?", listOf("Amazone", "Congo", "Nil", "Mississippi"), "Géographie", "Le Nil traverse l'Afrique de l'Est sur environ 6 650 kilomètres, ce qui en fait le plus long fleuve du monde selon les mesures standard."),
            en = LocalizedContent("Which is the longest river in the world?", listOf("Amazon", "Congo", "Nile", "Mississippi"), "Geography", "The Nile flows through East Africa for about 6,650 kilometers, making it the longest river in the world according to standard measurements."),
            zh = LocalizedContent("世界上最长的河流是哪个？", listOf("亚马逊河", "刚果河", "尼罗河", "密西西比河"), "地理", "尼罗河自南向北流经东非，长约6650公里，根据标准测量是世界上最长的河流。"),
            es = LocalizedContent("¿Cuál es el río más largo del mundo?", listOf("Amazonas", "Congo", "Nilo", "Misisipi"), "Geografia", "El Nilo atraviesa África Oriental durante unos 6.650 kilómetros, lo que lo convierte en el río más largo del mundo según las mediciones estándar.")
        ),
        BilingualQuestion(
            id = 9780, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand lac du monde?", listOf("Lac Baïkal", "Lac Victoria", "Lac Supérieur", "Mer Caspienne"), "Géographie", "La mer Caspienne, bien que nommée mer, est un lac salé endoréique bordé par cinq pays. Sa superficie d'environ 371 000 km² en fait le plus grand lac du monde."),
            en = LocalizedContent("What is the largest lake in the world?", listOf("Lake Baikal", "Lake Victoria", "Lake Superior", "Caspian Sea"), "Geography", "The Caspian Sea, although named a sea, is an endorheic salt lake bordered by five countries. Its area of about 371,000 km² makes it the largest lake in the world."),
            zh = LocalizedContent("世界上最大的湖泊是什么？", listOf("贝加尔湖", "维多利亚湖", "苏必利尔湖", "里海"), "地理", "里海虽然被称为海，但实际上是一个被五个国家包围的内陆咸水湖。其面积约37.1万平方公里，是世界上最大的湖泊。"),
            es = LocalizedContent("¿Cuál es el lago más grande del mundo?", listOf("Lago Baikal", "Lago Victoria", "Lago Superior", "Mar Caspio"), "Geografía", "El mar Caspio, aunque llamado mar, es un lago salado endorreico bordeado por cinco países. Su superficie de aproximadamente 371 000 km² lo convierte en el lago más grande del mundo.")
        ),
        BilingualQuestion(
            id = 9781, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand archipel du monde?", listOf("Hawaï", "Maldives", "Indonésie", "Philippines"), "Géographie", "L'Indonésie est le plus grand archipel du monde avec plus de 17 000 îles, s'étendant sur l'équateur entre l'océan Indien et l'océan Pacifique."),
            en = LocalizedContent("What is the largest archipelago in the world?", listOf("Hawaii", "Maldives", "Indonesia", "Philippines"), "Geography", "Indonesia is the largest archipelago in the world with over 17,000 islands, straddling the equator between the Indian Ocean and the Pacific Ocean."),
            zh = LocalizedContent("世界上最大的群岛是什么？", listOf("夏威夷", "马尔代夫", "印度尼西亚", "菲律宾"), "地理", "印度尼西亚是世界上最大的群岛，拥有超过17000个岛屿，横跨赤道，位于印度洋和太平洋之间。"),
            es = LocalizedContent("¿Cuál es el archipiélago más grande del mundo?", listOf("Hawái", "Maldivas", "Indonesia", "Filipinas"), "Geografía", "Indonesia es el archipiélago más grande del mundo con más de 17 000 islas, extendiéndose sobre el ecuador entre el océano Índico y el océano Pacífico.")
        ),
        BilingualQuestion(
            id = 9782, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand delta du monde?", listOf("Delta du Mékong", "Delta du Gange", "Delta du Nil", "Delta de l'Amazone"), "Géographie", "Le delta du Gange, situé principalement au Bangladesh et en Inde, est le plus grand du monde avec une superficie d'environ 100 000 km², formé par les fleuves Gange et Brahmapoutre."),
            en = LocalizedContent("What is the largest delta in the world?", listOf("Mekong Delta", "Ganges Delta", "Nile Delta", "Amazon Delta"), "Geography", "The Ganges Delta, located mainly in Bangladesh and India, is the largest delta in the world with an area of about 100,000 km², formed by the Ganges and Brahmaputra rivers."),
            zh = LocalizedContent("世界上最大的三角洲是什么？", listOf("湄公河三角洲", "恒河三角洲", "尼罗河三角洲", "亚马逊河三角洲"), "地理", "恒河三角洲主要位于孟加拉国和印度，由恒河和布拉马普特拉河冲积形成，面积约10万平方公里，是世界上最大的三角洲。"),
            es = LocalizedContent("¿Cuál es el delta más grande del mundo?", listOf("Delta del Mekong", "Delta del Ganges", "Delta del Nilo", "Delta del Amazonas"), "Geografía", "El delta del Ganges, situado principalmente en Bangladés y la India, es el más grande del mundo con una superficie de aproximadamente 100 000 km², formado por los ríos Ganges y Brahmaputra.")
        ),
        BilingualQuestion(
            id = 9783, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand golf du monde?", listOf("Golfe du Mexique", "Golfe du Bengale", "Golfe de Persique", "Golfe du Saint-Laurent"), "Géographie", "Le golfe du Bengale est le plus grand golfe du monde, s'étendant sur environ 2 172 000 km² entre la péninsule indienne et l'Asie du Sud-Est."),
            en = LocalizedContent("What is the largest gulf in the world?", listOf("Gulf of Mexico", "Bay of Bengal", "Persian Gulf", "Gulf of Saint Lawrence"), "Geography", "The Bay of Bengal is the largest gulf in the world, covering about 2,172,000 km² between the Indian peninsula and Southeast Asia."),
            zh = LocalizedContent("世界上最大的海湾是什么？", listOf("墨西哥湾", "孟加拉湾", "波斯湾", "圣劳伦斯湾"), "地理", "孟加拉湾是世界上最大的海湾，面积约217.2万平方公里，位于印度半岛和东南亚之间。"),
            es = LocalizedContent("¿Cuál es el golfo más grande del mundo?", listOf("Golfo de México", "Golfo de Bengala", "Golfo Pérsico", "Golfo de San Lorenzo"), "Geografía", "El golfo de Bengala es el golfo más grande del mundo, extendiéndose sobre aproximadamente 2 172 000 km² entre la península india y el sudeste asiático.")
        ),
        BilingualQuestion(
            id = 9784, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand détroit du monde?", listOf("Détroit de Malacca", "Détroit de Béring", "Détroit de Magellan", "Détroit de Drake"), "Géographie", "Le détroit de Drake, entre l'Amérique du Sud et l'Antarctique, est le plus large du monde avec environ 800 km, reliant l'océan Pacifique à l'océan Atlantique."),
            en = LocalizedContent("What is the largest strait in the world?", listOf("Strait of Malacca", "Bering Strait", "Strait of Magellan", "Drake Passage"), "Geography", "The Drake Passage, between South America and Antarctica, is the widest strait in the world at about 800 km, connecting the Pacific Ocean to the Atlantic Ocean."),
            zh = LocalizedContent("世界上最大的海峡是什么？", listOf("马六甲海峡", "白令海峡", "麦哲伦海峡", "德雷克海峡"), "地理", "德雷克海峡位于南美洲和南极洲之间，宽约800公里，连接太平洋和大西洋，是世界上最宽的海峡。"),
            es = LocalizedContent("¿Cuál es el estrecho más grande del mundo?", listOf("Estrecho de Malaca", "Estrecho de Bering", "Estrecho de Magallanes", "Paso de Drake"), "Geografía", "El paso de Drake, entre América del Sur y la Antártida, es el estrecho más ancho del mundo con unos 800 km, conectando el océano Pacífico con el océano Atlántico.")
        ),
        BilingualQuestion(
            id = 9785, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand glacier du monde?", listOf("Glacier Siachen", "Glacier Baltoro", "Glacier Lambert", "Inlandsis du Groenland"), "Géographie", "L'inlandsis du Groenland est le plus grand glacier du monde, couvrant environ 1,7 million de kilomètres carrés, soit 80 % de la surface du Groenland."),
            en = LocalizedContent("What is the largest glacier in the world?", listOf("Siachen Glacier", "Baltoro Glacier", "Lambert Glacier", "Greenland Ice Sheet"), "Geography", "The Greenland Ice Sheet is the largest glacier in the world, covering about 1.7 million square kilometers, or 80% of Greenland's surface."),
            zh = LocalizedContent("世界上最大的冰川是什么？", listOf("锡亚琴冰川", "巴尔托洛冰川", "兰伯特冰川", "格陵兰冰盖"), "地理", "格陵兰冰盖是世界上最大的冰川，覆盖面积约170万平方公里，占格陵兰表面积的80%。"),
            es = LocalizedContent("¿Cuál es el glaciar más grande del mundo?", listOf("Glaciar Siachen", "Glaciar Baltoro", "Glaciar Lambert", "Indlandsis de Groenlandia"), "Geografía", "El indlandsis de Groenlandia es el glaciar más grande del mundo, cubriendo aproximadamente 1,7 millones de kilómetros cuadrados, el 80% de la superficie de Groenlandia.")
        ),
        BilingualQuestion(
            id = 9786, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand plateau du monde?", listOf("Plateau du Tibet", "Plateau de l'Altaï", "Plateau du Colorado", "Plateau du Deccan"), "Géographie", "Le plateau du Tibet, souvent appelé le « toit du monde », est le plus vaste et le plus haut plateau de la planète, avec une altitude moyenne dépassant 4 500 mètres."),
            en = LocalizedContent("What is the largest plateau in the world?", listOf("Tibetan Plateau", "Altai Plateau", "Colorado Plateau", "Deccan Plateau"), "Geography", "The Tibetan Plateau, often called the 'Roof of the World', is the largest and highest plateau on Earth, with an average elevation exceeding 4,500 meters."),
            zh = LocalizedContent("世界上最大的高原是什么？", listOf("青藏高原", "阿尔泰山高原", "科罗拉多高原", "德干高原"), "地理", "青藏高原常被称为“世界屋脊”，是世界上最大、最高的高原，平均海拔超过4500米。"),
            es = LocalizedContent("¿Cuál es la meseta más grande del mundo?", listOf("Meseta del Tíbet", "Meseta de Altái", "Meseta del Colorado", "Meseta del Decán"), "Geografía", "La meseta del Tíbet, a menudo llamada el 'techo del mundo', es la meseta más extensa y alta del planeta, con una altitud media superior a los 4 500 metros.")
        ),
        BilingualQuestion(
            id = 9787, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand bassin de sédiments du monde?", listOf("Bassin du Gange", "Bassin du Congo", "Bassin de l'Amazone", "Bassin du Mississippi"), "Géographie", "Le bassin de l'Amazone, s'étendant sur environ 7 millions de km², est le plus grand bassin sédimentaire au monde en raison de l'immense volume de sédiments transportés par le fleuve Amazone depuis les Andes jusqu'à l'océan Atlantique."),
            en = LocalizedContent("What is the largest sedimentary basin in the world?", listOf("Ganges Basin", "Congo Basin", "Amazon Basin", "Mississippi Basin"), "Geography", "The Amazon Basin, covering about 7 million km², is the largest sedimentary basin in the world due to the immense volume of sediments transported by the Amazon River from the Andes to the Atlantic Ocean."),
            zh = LocalizedContent("世界上最大的沉积盆地是什么？", listOf("恒河盆地", "刚果盆地", "亚马逊盆地", "密西西比盆地"), "地理", "亚马逊盆地面积约700万平方公里，是世界上最大的沉积盆地，因为亚马逊河从安第斯山脉携带大量沉积物到大西洋。"),
            es = LocalizedContent("¿Cuál es la cuenca sedimentaria más grande del mundo?", listOf("Cuenca del Ganges", "Cuenca del Congo", "Cuenca del Amazonas", "Cuenca del Misisipi"), "Geografía", "La cuenca del Amazonas, que se extiende sobre unos 7 millones de km², es la cuenca sedimentaria más grande del mundo debido al inmenso volumen de sedimentos transportados por el río Amazonas desde los Andes hasta el océano Atlántico.")
        ),
        BilingualQuestion(
            id = 9788, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand port du monde?", listOf("Port de Rotterdam", "Port de Singapour", "Port de Shanghai", "Port de Hong Kong"), "Géographie", "Le port de Shanghai est le plus grand port du monde en termes de volume de conteneurs et de trafic de marchandises depuis 2010, dépassant Singapour."),
            en = LocalizedContent("What is the largest port in the world?", listOf("Port of Rotterdam", "Port of Singapore", "Port of Shanghai", "Port of Hong Kong"), "Geography", "The Port of Shanghai has been the largest port in the world in terms of container volume and cargo traffic since 2010, surpassing Singapore."),
            zh = LocalizedContent("世界上最大的港口是什么？", listOf("鹿特丹港", "新加坡港", "上海港", "香港港"), "地理", "上海港自2010年以来在集装箱吞吐量和货物运输量方面一直是世界上最大的港口，超过了新加坡。"),
            es = LocalizedContent("¿Cuál es el puerto más grande del mundo?", listOf("Puerto de Róterdam", "Puerto de Singapur", "Puerto de Shanghái", "Puerto de Hong Kong"), "Geografía", "El puerto de Shanghái es el puerto más grande del mundo en términos de volumen de contenedores y tráfico de mercancías desde 2010, superando a Singapur.")
        ),
        BilingualQuestion(
            id = 9789, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand aéroport du monde?", listOf("Aéroport de Dubaï", "Aéroport d'Atlanta", "Aéroport de Chicago", "Aéroport de Los Angeles"), "Géographie", "L'aéroport international Hartsfield-Jackson d'Atlanta est le plus fréquenté au monde en nombre de passagers depuis 1998, grâce à son rôle de hub majeur pour Delta Air Lines et sa situation géographique stratégique aux États-Unis."),
            en = LocalizedContent("What is the largest airport in the world?", listOf("Dubai Airport", "Atlanta Airport", "Chicago Airport", "Los Angeles Airport"), "Geography", "Hartsfield-Jackson Atlanta International Airport has been the busiest airport in the world by passenger numbers since 1998, thanks to its role as a major hub for Delta Air Lines and its strategic geographic location in the United States."),
            zh = LocalizedContent("世界上最大的机场是什么？", listOf("迪拜机场", "亚特兰大机场", "芝加哥机场", "洛杉矶机场"), "地理", "哈茨菲尔德-杰克逊亚特兰大国际机场自1998年以来一直是世界上客运量最繁忙的机场，这得益于其作为达美航空主要枢纽的地位以及在美国的战略地理位置。"),
            es = LocalizedContent("¿Cuál es el aeropuerto más grande del mundo?", listOf("Aeropuerto de Dubái", "Aeropuerto de Atlanta", "Aeropuerto de Chicago", "Aeropuerto de Los Ángeles"), "Geografía", "El Aeropuerto Internacional Hartsfield-Jackson de Atlanta es el más transitado del mundo en número de pasajeros desde 1998, gracias a su papel como centro principal de Delta Air Lines y su ubicación geográfica estratégica en Estados Unidos.")
        ),
        BilingualQuestion(
            id = 9790, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand stade du monde?", listOf("Stade de Michigan", "Stade Beaver", "Stade Tiger", "Stade de Rungrado"), "Géographie", "Le Stade de Rungrado, situé à Pyongyang en Corée du Nord, peut accueillir environ 114 000 spectateurs, ce qui en fait le plus grand stade du monde par sa capacité."),
            en = LocalizedContent("What is the largest stadium in the world?", listOf("Michigan Stadium", "Beaver Stadium", "Tiger Stadium", "Rungrado Stadium"), "Geography", "Rungrado Stadium, located in Pyongyang, North Korea, can accommodate about 114,000 spectators, making it the largest stadium in the world by capacity."),
            zh = LocalizedContent("世界上最大的体育场是哪个？", listOf("密歇根体育场", "海狸体育场", "老虎体育场", "绫罗岛体育场"), "地理", "位于朝鲜平壤的绫罗岛体育场可容纳约11.4万名观众，是世界上容量最大的体育场。"),
            es = LocalizedContent("¿Cuál es el estadio más grande del mundo?", listOf("Estadio de Míchigan", "Estadio Beaver", "Estadio Tiger", "Estadio de Rungrado"), "Geografía", "El Estadio de Rungrado, situado en Pionyang, Corea del Norte, puede albergar aproximadamente 114 000 espectadores, lo que lo convierte en el estadio más grande del mundo por capacidad.")
        ),
        BilingualQuestion(
            id = 9791, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand musée du monde?", listOf("Musée du Louvre", "Musée du Vatican", "Musée de l'Hermitage", "Musée d'art moderne"), "Géographie", "Le Louvre à Paris est le plus grand musée du monde par sa superficie totale de 72 735 mètres carrés, abritant des œuvres comme la Joconde et la Vénus de Milo."),
            en = LocalizedContent("What is the largest museum in the world?", listOf("Louvre Museum", "Vatican Museums", "Hermitage Museum", "Museum of Modern Art"), "Geography", "The Louvre in Paris is the largest museum in the world by total area of 72,735 square meters, housing works such as the Mona Lisa and the Venus de Milo."),
            zh = LocalizedContent("世界上最大的博物馆是哪个？", listOf("卢浮宫", "梵蒂冈博物馆", "冬宫博物馆", "现代艺术博物馆"), "地理", "巴黎卢浮宫总面积达72,735平方米，是世界上最大的博物馆，收藏有《蒙娜丽莎》和《米洛的维纳斯》等作品。"),
            es = LocalizedContent("¿Cuál es el museo más grande del mundo?", listOf("Museo del Louvre", "Museos Vaticanos", "Museo del Hermitage", "Museo de Arte Moderno"), "Geografía", "El Louvre en París es el museo más grande del mundo por superficie total de 72 735 metros cuadrados, albergando obras como la Mona Lisa y la Venus de Milo.")
        ),
        BilingualQuestion(
            id = 9792, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand zoo du monde?", listOf("Zoo de San Diego", "Zoo du Bronx", "Zoo de Berlin", "Zoo de San Antonio"), "Géographie", "Le zoo de San Diego est considéré comme le plus grand zoo du monde en termes de superficie et de collection d'animaux, avec plus de 12 000 spécimens représentant 650 espèces."),
            en = LocalizedContent("What is the largest zoo in the world?", listOf("San Diego Zoo", "Bronx Zoo", "Berlin Zoo", "San Antonio Zoo"), "Geography", "The San Diego Zoo is considered the largest zoo in the world in terms of area and animal collection, with over 12,000 specimens representing 650 species."),
            zh = LocalizedContent("世界上最大的动物园是哪个？", listOf("圣地亚哥动物园", "布朗克斯动物园", "柏林动物园", "圣安东尼奥动物园"), "地理", "圣地亚哥动物园在面积和动物种类上被认为是世界上最大的动物园，拥有超过12,000只动物，代表650个物种。"),
            es = LocalizedContent("¿Cuál es el zoológico más grande del mundo?", listOf("Zoológico de San Diego", "Zoológico del Bronx", "Zoológico de Berlín", "Zoológico de San Antonio"), "Geografía", "El Zoológico de San Diego es considerado el más grande del mundo en términos de superficie y colección de animales, con más de 12 000 especímenes que representan 650 especies.")
        ),
        BilingualQuestion(
            id = 9793, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand château du monde?", listOf("Château de Versailles", "Château de Prague", "Château de Windsor", "Château du Kremlin"), "Géographie", "Le château de Windsor, résidence royale en Angleterre, est le plus grand château habité du monde avec plus de 1 000 pièces. Il est également le plus ancien palais occupé en continu d'Europe."),
            en = LocalizedContent("What is the largest castle in the world?", listOf("Palace of Versailles", "Prague Castle", "Windsor Castle", "Kremlin Castle"), "Geography", "Windsor Castle, a royal residence in England, is the largest inhabited castle in the world with over 1,000 rooms. It is also the oldest continuously occupied palace in Europe."),
            zh = LocalizedContent("世界上最大的城堡是哪个？", listOf("凡尔赛宫", "布拉格城堡", "温莎城堡", "克里姆林宫"), "地理", "温莎城堡是英格兰的皇家住所，拥有超过1,000个房间，是世界上最大的有人居住的城堡，也是欧洲最古老的持续有人居住的宫殿。"),
            es = LocalizedContent("¿Cuál es el castillo más grande del mundo?", listOf("Palacio de Versalles", "Castillo de Praga", "Castillo de Windsor", "Castillo del Kremlin"), "Geografía", "El Castillo de Windsor, residencia real en Inglaterra, es el castillo habitado más grande del mundo con más de 1 000 habitaciones. También es el palacio ocupado continuamente más antiguo de Europa.")
        ),
        BilingualQuestion(
            id = 9794, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand temple du monde?", listOf("Temples d'Angkor Vat", "Temple du Mont-Athos", "Temple du Kailasa", "Temple Meenakshi"), "Géographie", "Angkor Vat, au Cambodge, est le plus grand temple du monde avec une superficie de 162,6 hectares. Il a été construit au XIIe siècle par le roi Suryavarman II."),
            en = LocalizedContent("What is the largest temple in the world?", listOf("Angkor Wat", "Mount Athos Temple", "Kailasa Temple", "Meenakshi Temple"), "Geography", "Angkor Wat in Cambodia is the largest temple in the world with an area of 162.6 hectares. It was built in the 12th century by King Suryavarman II."),
            zh = LocalizedContent("世界上最大的寺庙是哪个？", listOf("吴哥窟", "阿索斯山神庙", "凯拉萨神庙", "米纳克希神庙"), "地理", "柬埔寨的吴哥窟是世界上最大的寺庙，面积达162.6公顷，由苏利耶跋摩二世于12世纪建造。"),
            es = LocalizedContent("¿Cuál es el templo más grande del mundo?", listOf("Angkor Wat", "Templo del Monte Athos", "Templo Kailasa", "Templo Meenakshi"), "Geografía", "Angkor Wat en Camboya es el templo más grande del mundo con una superficie de 162,6 hectáreas. Fue construido en el siglo XII por el rey Suryavarman II.")
        ),
        BilingualQuestion(
            id = 9795, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand désert de glace du monde?", listOf("Inlandsis du Groenland", "Glacier Lambert", "Plateau du Tibet", "Inlandsis de l'Antarctique"), "Géographie", "L'inlandsis de l'Antarctique est le plus grand désert de glace car il recouvre 98 % du continent avec une épaisseur moyenne de 2 160 mètres, formant une calotte glaciaire immense et aride."),
            en = LocalizedContent("What is the largest ice desert in the world?", listOf("Greenland Ice Sheet", "Lambert Glacier", "Tibetan Plateau", "Antarctic Ice Sheet"), "Geography", "The Antarctic Ice Sheet is the largest ice desert because it covers 98% of the continent with an average thickness of 2,160 meters, forming a vast arid ice cap."),
            zh = LocalizedContent("世界上最大的冰沙漠是哪个？", listOf("格陵兰冰盖", "兰伯特冰川", "青藏高原", "南极冰盖"), "地理", "南极冰盖覆盖了南极大陆98%的面积，平均厚度达2,160米，形成了一片广阔干燥的冰盖，是世界上最大的冰沙漠。"),
            es = LocalizedContent("¿Cuál es el desierto de hielo más grande del mundo?", listOf("Indlandsis de Groenlandia", "Glaciar Lambert", "Meseta del Tíbet", "Indlandsis de la Antártida"), "Geografía", "El indlandsis de la Antártida es el desierto de hielo más grande porque cubre el 98% del continente con un espesor promedio de 2 160 metros, formando una vasta capa de hielo árida.")
        ),
        BilingualQuestion(
            id = 9796, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand parc national du monde?", listOf("Parc de Yellowstone", "Parc de Serengeti", "Parc du Groenland du Nord-Est", "Parc de la Vallée de la Mort"), "Géographie", "Le Parc national du Groenland du Nord-Est s'étend sur environ 972 000 km², ce qui en fait le plus vaste parc national au monde, couvrant une grande partie du nord-est du Groenland."),
            en = LocalizedContent("What is the largest national park in the world?", listOf("Yellowstone National Park", "Serengeti National Park", "Northeast Greenland National Park", "Death Valley National Park"), "Geography", "Northeast Greenland National Park covers about 972,000 km², making it the largest national park in the world, covering a large part of northeastern Greenland."),
            zh = LocalizedContent("世界上最大的国家公园是哪个？", listOf("黄石国家公园", "塞伦盖蒂国家公园", "东北格陵兰国家公园", "死亡谷国家公园"), "地理", "东北格陵兰国家公园面积约97.2万平方公里，是世界上最大的国家公园，覆盖了格陵兰东北部的大部分地区。"),
            es = LocalizedContent("¿Cuál es el parque nacional más grande del mundo?", listOf("Parque Nacional de Yellowstone", "Parque Nacional del Serengeti", "Parque Nacional del Noreste de Groenlandia", "Parque Nacional del Valle de la Muerte"), "Geografía", "El Parque Nacional del Noreste de Groenlandia se extiende sobre aproximadamente 972 000 km², lo que lo convierte en el parque nacional más grande del mundo, cubriendo gran parte del noreste de Groenlandia.")
        ),
        BilingualQuestion(
            id = 9797, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand pays sans accès à la mer?", listOf("Kazakhstan", "Mongolie", "Afghanistan", "Ouganda"), "Géographie", "Le Kazakhstan est le plus grand pays enclavé du monde, avec une superficie de 2,7 millions de km², dépassant ainsi la Mongolie et le Niger."),
            en = LocalizedContent("What is the largest landlocked country in the world?", listOf("Kazakhstan", "Mongolia", "Afghanistan", "Uganda"), "Geography", "Kazakhstan is the largest landlocked country in the world, with an area of 2.7 million km², surpassing Mongolia and Niger."),
            zh = LocalizedContent("世界上最大的内陆国是哪个？", listOf("哈萨克斯坦", "蒙古", "阿富汗", "乌干达"), "地理", "哈萨克斯坦是世界上最大的内陆国，面积达270万平方公里，超过蒙古和尼日尔。"),
            es = LocalizedContent("¿Cuál es el país sin litoral más grande del mundo?", listOf("Kazajistán", "Mongolia", "Afganistán", "Uganda"), "Geografía", "Kazajistán es el país sin litoral más grande del mundo, con una superficie de 2,7 millones de km², superando a Mongolia y Níger.")
        ),
        BilingualQuestion(
            id = 9798, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le pays le plus au nord du monde?", listOf("Groenland", "Islande", "Norvège", "Canada"), "Géographie", "Le Groenland est un territoire autonome du Danemark, et son point le plus septentrional, le cap Morris Jesup, est la terre la plus proche du pôle Nord."),
            en = LocalizedContent("What is the northernmost country in the world?", listOf("Greenland", "Iceland", "Norway", "Canada"), "Geography", "Greenland is an autonomous territory of Denmark, and its northernmost point, Cape Morris Jesup, is the closest land to the North Pole."),
            zh = LocalizedContent("世界上最北端的国家是哪个？", listOf("格陵兰", "冰岛", "挪威", "加拿大"), "地理", "格陵兰是丹麦的一个自治领土，其最北端莫里斯·杰塞普角是离北极最近的陆地。"),
            es = LocalizedContent("¿Cuál es el país más septentrional del mundo?", listOf("Groenlandia", "Islandia", "Noruega", "Canadá"), "Geografía", "Groenlandia es un territorio autónomo de Dinamarca, y su punto más septentrional, el cabo Morris Jesup, es la tierra más cercana al Polo Norte.")
        ),
        BilingualQuestion(
            id = 9799, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le pays le plus au sud du monde?", listOf("Chili", "Argentine", "Nouvelle-Zélande", "Australie"), "Géographie", "L'Argentine abrite l'île de Hornos, où se situe le cap Horn, point le plus méridional des terres émergées du continent américain."),
            en = LocalizedContent("What is the southernmost country in the world?", listOf("Chile", "Argentina", "New Zealand", "Australia"), "Geography", "Argentina is home to Hornos Island, where Cape Horn is located, the southernmost point of the emerged lands of the American continent."),
            zh = LocalizedContent("世界上最南端的国家是哪个？", listOf("智利", "阿根廷", "新西兰", "澳大利亚"), "地理", "阿根廷拥有合恩岛，合恩角位于该岛，是美洲大陆最南端的陆地。"),
            es = LocalizedContent("¿Cuál es el país más meridional del mundo?", listOf("Chile", "Argentina", "Nueva Zelanda", "Australia"), "Geografía", "Argentina alberga la isla de Hornos, donde se encuentra el cabo de Hornos, el punto más meridional de las tierras emergidas del continente americano.")
        ),
        BilingualQuestion(
            id = 9800, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le pays le plus à l'est du monde?", listOf("Nouvelle-Zélande", "Japon", "Océanie", "Kiribati"), "Géographie", "Kiribati est le pays le plus à l'est car il s'étend dans l'océan Pacifique jusqu'à la ligne de changement de date, incluant les îles de la Ligne qui sont les premières à voir le jour."),
            en = LocalizedContent("Which is the easternmost country in the world?", listOf("New Zealand", "Japan", "Oceania", "Kiribati"), "Geography", "Kiribati is the easternmost country because it extends into the Pacific Ocean up to the International Date Line, including the Line Islands which are the first to see the day."),
            zh = LocalizedContent("世界上最东的国家是哪个？", listOf("新西兰", "日本", "大洋洲", "基里巴斯"), "地理", "基里巴斯是最东的国家，因为它延伸到太平洋直至国际日期变更线，包括莱恩群岛，这些岛屿是最先看到日出的。"),
            es = LocalizedContent("¿Cuál es el país más oriental del mundo?", listOf("Nueva Zelanda", "Japón", "Oceanía", "Kiribati"), "Geografía", "Kiribati es el país más oriental porque se extiende en el océano Pacífico hasta la línea de cambio de fecha, incluyendo las islas de la Línea que son las primeras en ver el día.")
        ),
        BilingualQuestion(
            id = 9801, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le pays le plus à l'ouest du monde?", listOf("Canada", "États-Unis", "Samoa américaines", "Îles Aléoutiennes"), "Géographie", "Les Samoa américaines sont situées juste à l'ouest de la ligne de changement de date, ce qui en fait le territoire le plus à l'ouest du monde en termes de fuseau horaire."),
            en = LocalizedContent("Which is the westernmost country in the world?", listOf("Canada", "United States", "American Samoa", "Aleutian Islands"), "Geography", "American Samoa is located just west of the International Date Line, making it the westernmost territory in the world in terms of time zone."),
            zh = LocalizedContent("世界上最西的国家是哪个？", listOf("加拿大", "美国", "美属萨摩亚", "阿留申群岛"), "地理", "美属萨摩亚位于国际日期变更线以西，因此在时区上它是世界上最西的领土。"),
            es = LocalizedContent("¿Cuál es el país más occidental del mundo?", listOf("Canadá", "Estados Unidos", "Samoa Americana", "Islas Aleutianas"), "Geografía", "Samoa Americana está situada justo al oeste de la línea de cambio de fecha, lo que la convierte en el territorio más occidental del mundo en términos de huso horario.")
        ),
        BilingualQuestion(
            id = 9802, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le plus grand pays du monde par superficie?", listOf("Canada", "Chine", "Russie", "États-Unis"), "Géographie", "La Russie s'étend sur plus de 17 millions de kilomètres carrés, soit environ 11% des terres émergées, ce qui en fait le plus vaste pays du monde devant le Canada et les États-Unis."),
            en = LocalizedContent("Which is the largest country in the world by area?", listOf("Canada", "China", "Russia", "United States"), "Geography", "Russia covers over 17 million square kilometers, about 11% of the world's landmass, making it the largest country ahead of Canada and the United States."),
            zh = LocalizedContent("世界上面积最大的国家是哪个？", listOf("加拿大", "中国", "俄罗斯", "美国"), "地理", "俄罗斯面积超过1700万平方公里，约占世界陆地面积的11%，使其成为最大的国家，领先于加拿大和美国。"),
            es = LocalizedContent("¿Cuál es el país más grande del mundo por superficie?", listOf("Canadá", "China", "Rusia", "Estados Unidos"), "Geografía", "Rusia se extiende sobre más de 17 millones de kilómetros cuadrados, aproximadamente el 11% de las tierras emergidas, lo que lo convierte en el país más vasto por delante de Canadá y Estados Unidos.")
        ),
        BilingualQuestion(
            id = 9803, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le deuxième plus grand pays du monde par superficie?", listOf("Chine", "Canada", "Russie", "États-Unis"), "Géographie", "Le Canada est le deuxième plus vaste pays du monde après la Russie, avec une superficie d'environ 9,98 millions de kilomètres carrés."),
            en = LocalizedContent("Which is the second largest country in the world by area?", listOf("China", "Canada", "Russia", "United States"), "Geography", "Canada is the second largest country in the world after Russia, with an area of about 9.98 million square kilometers."),
            zh = LocalizedContent("世界上面积第二大的国家是哪个？", listOf("中国", "加拿大", "俄罗斯", "美国"), "地理", "加拿大是世界上第二大的国家，仅次于俄罗斯，面积约为998万平方公里。"),
            es = LocalizedContent("¿Cuál es el segundo país más grande del mundo por superficie?", listOf("China", "Canadá", "Rusia", "Estados Unidos"), "Geografía", "Canadá es el segundo país más vasto del mundo después de Rusia, con una superficie de aproximadamente 9,98 millones de kilómetros cuadrados.")
        ),
        BilingualQuestion(
            id = 9804, correctIndex = 3, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le troisième plus grand pays du monde par superficie?", listOf("Chine", "Canada", "Russie", "États-Unis"), "Géographie", "Les États-Unis sont le troisième plus grand pays du monde avec environ 9,8 millions de km², derrière la Russie et le Canada."),
            en = LocalizedContent("Which is the third largest country in the world by area?", listOf("China", "Canada", "Russia", "United States"), "Geography", "The United States is the third largest country in the world with about 9.8 million km², behind Russia and Canada."),
            zh = LocalizedContent("世界上面积第三大的国家是哪个？", listOf("中国", "加拿大", "俄罗斯", "美国"), "地理", "美国是世界上第三大的国家，面积约980万平方公里，仅次于俄罗斯和加拿大。"),
            es = LocalizedContent("¿Cuál es el tercer país más grande del mundo por superficie?", listOf("China", "Canadá", "Rusia", "Estados Unidos"), "Geografía", "Estados Unidos es el tercer país más grande del mundo con aproximadamente 9,8 millones de km², detrás de Rusia y Canadá.")
        ),
        BilingualQuestion(
            id = 9805, correctIndex = 3, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le quatrième plus grand pays du monde par superficie?", listOf("Chine", "Canada", "Russie", "États-Unis"), "Géographie", "Les États-Unis se classent au quatrième rang mondial avec une superficie d'environ 9,8 millions de km², derrière la Russie, le Canada et la Chine."),
            en = LocalizedContent("Which is the fourth largest country in the world by area?", listOf("China", "Canada", "Russia", "United States"), "Geography", "The United States ranks fourth in the world with an area of about 9.8 million km², behind Russia, Canada, and China."),
            zh = LocalizedContent("世界上面积第四大的国家是哪个？", listOf("中国", "加拿大", "俄罗斯", "美国"), "地理", "美国排名世界第四，面积约980万平方公里，仅次于俄罗斯、加拿大和中国。"),
            es = LocalizedContent("¿Cuál es el cuarto país más grande del mundo por superficie?", listOf("China", "Canadá", "Rusia", "Estados Unidos"), "Geografía", "Estados Unidos se clasifica en el cuarto lugar mundial con una superficie de aproximadamente 9,8 millones de km², detrás de Rusia, Canadá y China.")
        ),
        BilingualQuestion(
            id = 9806, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le cinquième plus grand pays du monde par superficie?", listOf("Brésil", "Australie", "Inde", "Kazakhstan"), "Géographie", "Le Brésil est le cinquième plus grand pays du monde avec environ 8,5 millions de km², derrière la Russie, le Canada, les États-Unis et la Chine."),
            en = LocalizedContent("Which is the fifth largest country in the world by area?", listOf("Brazil", "Australia", "India", "Kazakhstan"), "Geography", "Brazil is the fifth largest country in the world with about 8.5 million km², behind Russia, Canada, the United States, and China."),
            zh = LocalizedContent("世界上面积第五大的国家是哪个？", listOf("巴西", "澳大利亚", "印度", "哈萨克斯坦"), "地理", "巴西是世界上第五大的国家，面积约850万平方公里，仅次于俄罗斯、加拿大、美国和中国。"),
            es = LocalizedContent("¿Cuál es el quinto país más grande del mundo por superficie?", listOf("Brasil", "Australia", "India", "Kazajistán"), "Geografía", "Brasil es el quinto país más grande del mundo con aproximadamente 8,5 millones de km², detrás de Rusia, Canadá, Estados Unidos y China.")
        ),
        BilingualQuestion(
            id = 9807, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le sixième plus grand pays du monde par superficie?", listOf("Brésil", "Australie", "Inde", "Kazakhstan"), "Géographie", "L'Australie est le sixième plus grand pays du monde avec environ 7,7 millions de km², derrière la Russie, le Canada, les États-Unis, la Chine et le Brésil."),
            en = LocalizedContent("Which is the sixth largest country in the world by area?", listOf("Brazil", "Australia", "India", "Kazakhstan"), "Geography", "Australia is the sixth largest country in the world with about 7.7 million km², behind Russia, Canada, the United States, China, and Brazil."),
            zh = LocalizedContent("世界上面积第六大的国家是哪个？", listOf("巴西", "澳大利亚", "印度", "哈萨克斯坦"), "地理", "澳大利亚是世界上第六大的国家，面积约770万平方公里，仅次于俄罗斯、加拿大、美国、中国和巴西。"),
            es = LocalizedContent("¿Cuál es el sexto país más grande del mundo por superficie?", listOf("Brasil", "Australia", "India", "Kazajistán"), "Geografía", "Australia es el sexto país más grande del mundo con aproximadamente 7,7 millones de km², detrás de Rusia, Canadá, Estados Unidos, China y Brasil.")
        ),
        BilingualQuestion(
            id = 9808, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le septième plus grand pays du monde par superficie?", listOf("Brésil", "Australie", "Inde", "Kazakhstan"), "Géographie", "L'Inde est le septième plus grand pays du monde avec une superficie d'environ 3,287 millions de kilomètres carrés, derrière la Russie, le Canada, les États-Unis, la Chine, le Brésil et l'Australie."),
            en = LocalizedContent("Which is the seventh largest country in the world by area?", listOf("Brazil", "Australia", "India", "Kazakhstan"), "Geography", "India is the seventh largest country in the world with an area of about 3.287 million square kilometers, behind Russia, Canada, the United States, China, Brazil, and Australia."),
            zh = LocalizedContent("世界上面积第七大的国家是哪个？", listOf("巴西", "澳大利亚", "印度", "哈萨克斯坦"), "地理", "印度是世界上第七大的国家，面积约328.7万平方公里，仅次于俄罗斯、加拿大、美国、中国、巴西和澳大利亚。"),
            es = LocalizedContent("¿Cuál es el séptimo país más grande del mundo por superficie?", listOf("Brasil", "Australia", "India", "Kazajistán"), "Geografía", "India es el séptimo país más grande del mundo con una superficie de aproximadamente 3,287 millones de kilómetros cuadrados, detrás de Rusia, Canadá, Estados Unidos, China, Brasil y Australia.")
        ),
        BilingualQuestion(
            id = 9809, correctIndex = 3, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le huitième plus grand pays du monde par superficie?", listOf("Brésil", "Australie", "Inde", "Kazakhstan"), "Géographie", "Le Kazakhstan est le neuvième plus vaste pays du monde, avec une superficie d'environ 2,7 millions de km², derrière l'Argentine."),
            en = LocalizedContent("Which is the eighth largest country in the world by area?", listOf("Brazil", "Australia", "India", "Kazakhstan"), "Geography", "Kazakhstan is the ninth largest country in the world, with an area of about 2.7 million km², behind Argentina."),
            zh = LocalizedContent("世界上面积第八大的国家是哪个？", listOf("巴西", "澳大利亚", "印度", "哈萨克斯坦"), "地理", "哈萨克斯坦是世界上第九大的国家，面积约270万平方公里，仅次于阿根廷。"),
            es = LocalizedContent("¿Cuál es el octavo país más grande del mundo por superficie?", listOf("Brasil", "Australia", "India", "Kazajistán"), "Geografía", "Kazajistán es el noveno país más vasto del mundo, con una superficie de aproximadamente 2,7 millones de km², detrás de Argentina.")
        ),
        BilingualQuestion(
            id = 9810, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le neuvième plus grand pays du monde par superficie?", listOf("Groenland", "Mexique", "Indonésie", "Libye"), "Géographie", "Avec une superficie d'environ 1,9 million de km², l'Indonésie se classe neuvième, principalement grâce à son vaste territoire maritime et ses nombreuses îles."),
            en = LocalizedContent("What is the ninth largest country in the world by area?", listOf("Greenland", "Mexico", "Indonesia", "Libya"), "Geography", "With an area of about 1.9 million km², Indonesia ranks ninth, mainly due to its vast maritime territory and numerous islands."),
            zh = LocalizedContent("按面积计算，世界第九大国家是哪个？", listOf("格陵兰", "墨西哥", "印度尼西亚", "利比亚"), "地理", "印度尼西亚面积约190万平方公里，排名第九，主要得益于其广阔的海洋领土和众多岛屿。"),
            es = LocalizedContent("¿Cuál es el noveno país más grande del mundo por superficie?", listOf("Groenlandia", "México", "Indonesia", "Libia"), "Geografía", "Con una superficie de aproximadamente 1,9 millones de km², Indonesia ocupa el noveno lugar, principalmente debido a su vasto territorio marítimo y numerosas islas.")
        ),
        BilingualQuestion(
            id = 9811, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le dixième plus grand pays du monde par superficie?", listOf("Groenland", "Mexique", "Libye", "Pérou"), "Géographie", "La Libye est le dixième plus grand pays du monde avec une superficie d'environ 1,76 million de km², principalement couverte par le désert du Sahara."),
            en = LocalizedContent("What is the tenth largest country in the world by area?", listOf("Greenland", "Mexico", "Libya", "Peru"), "Geography", "Libya is the tenth largest country in the world with an area of about 1.76 million km², mostly covered by the Sahara Desert."),
            zh = LocalizedContent("按面积计算，世界第十大国家是哪个？", listOf("格陵兰", "墨西哥", "利比亚", "秘鲁"), "地理", "利比亚是世界第十大国家，面积约176万平方公里，大部分被撒哈拉沙漠覆盖。"),
            es = LocalizedContent("¿Cuál es el décimo país más grande del mundo por superficie?", listOf("Groenlandia", "México", "Libia", "Perú"), "Geografía", "Libia es el décimo país más grande del mundo con una superficie de aproximadamente 1,76 millones de km², cubierta en su mayor parte por el desierto del Sahara.")
        ),
        BilingualQuestion(
            id = 9812, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le pays le plus densément peuplé du monde (excluant les microstats)?", listOf("Singapour", "Bangladesh", "Malaisie", "Thaïlande"), "Géographie", "Le Bangladesh compte plus de 170 millions d'habitants sur un territoire de 147 570 km², soit une densité d'environ 1 265 personnes par km²."),
            en = LocalizedContent("What is the most densely populated country in the world (excluding microstates)?", listOf("Singapore", "Bangladesh", "Malaysia", "Thailand"), "Geography", "Bangladesh has over 170 million people in an area of 147,570 km², giving a density of about 1,265 people per km²."),
            zh = LocalizedContent("世界上人口密度最高的国家是哪个（不包括微型国家）？", listOf("新加坡", "孟加拉国", "马来西亚", "泰国"), "地理", "孟加拉国在147,570平方公里的土地上居住着超过1.7亿人，人口密度约为每平方公里1,265人。"),
            es = LocalizedContent("¿Cuál es el país más densamente poblado del mundo (excluyendo microestados)?", listOf("Singapur", "Bangladés", "Malasia", "Tailandia"), "Geografía", "Bangladés tiene más de 170 millones de habitantes en un territorio de 147.570 km², lo que supone una densidad de aproximadamente 1.265 personas por km².")
        ),
        BilingualQuestion(
            id = 9813, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le pays le moins densément peuplé du monde?", listOf("Mongolie", "Mauritanie", "Australie", "Canada"), "Géographie", "La Mongolie possède une très faible densité de population d'environ 2 habitants par km² en raison de ses vastes steppes arides et de son climat continental extrême."),
            en = LocalizedContent("What is the least densely populated country in the world?", listOf("Mongolia", "Mauritania", "Australia", "Canada"), "Geography", "Mongolia has a very low population density of about 2 people per km² due to its vast arid steppes and extreme continental climate."),
            zh = LocalizedContent("世界上人口密度最低的国家是哪个？", listOf("蒙古", "毛里塔尼亚", "澳大利亚", "加拿大"), "地理", "蒙古人口密度极低，约为每平方公里2人，原因是其广阔的干旱草原和极端的大陆性气候。"),
            es = LocalizedContent("¿Cuál es el país menos densamente poblado del mundo?", listOf("Mongolia", "Mauritania", "Australia", "Canadá"), "Geografía", "Mongolia tiene una densidad de población muy baja, de aproximadamente 2 habitantes por km², debido a sus vastas estepas áridas y su clima continental extremo.")
        ),
        BilingualQuestion(
            id = 9814, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand pays sans capitale établie?", listOf("Suisse", "Australie", "Nouvelle-Zélande", "Aucun"), "Géographie", "Tous les pays reconnus par l'ONU possèdent une capitale officielle. Aucun État souverain ne fonctionne sans un lieu désigné comme siège de son gouvernement."),
            en = LocalizedContent("What is the largest country without an established capital?", listOf("Switzerland", "Australia", "New Zealand", "None"), "Geography", "All UN-recognized countries have an official capital. No sovereign state functions without a designated seat of government."),
            zh = LocalizedContent("没有设立首都的最大国家是哪个？", listOf("瑞士", "澳大利亚", "新西兰", "无"), "地理", "所有联合国承认的国家都有官方首都。没有一个主权国家没有指定的政府所在地。"),
            es = LocalizedContent("¿Cuál es el país más grande sin capital establecida?", listOf("Suiza", "Australia", "Nueva Zelanda", "Ninguno"), "Geografía", "Todos los países reconocidos por la ONU tienen una capital oficial. Ningún estado soberano funciona sin un lugar designado como sede de su gobierno.")
        ),
        BilingualQuestion(
            id = 9815, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le pays avec le plus de capitales?", listOf("Afrique du Sud", "Suisse", "Australie", "Pays-Bas"), "Géographie", "L'Afrique du Sud possède trois capitales officielles : Pretoria (administrative), Le Cap (législative) et Bloemfontein (judiciaire), ce qui en fait le pays avec le plus de capitales au monde."),
            en = LocalizedContent("Which country has the most capitals?", listOf("South Africa", "Switzerland", "Australia", "Netherlands"), "Geography", "South Africa has three official capitals: Pretoria (administrative), Cape Town (legislative), and Bloemfontein (judicial), making it the country with the most capitals in the world."),
            zh = LocalizedContent("哪个国家的首都最多？", listOf("南非", "瑞士", "澳大利亚", "荷兰"), "地理", "南非有三个官方首都：比勒陀利亚（行政）、开普敦（立法）和布隆方丹（司法），使其成为世界上首都最多的国家。"),
            es = LocalizedContent("¿Qué país tiene más capitales?", listOf("Sudáfrica", "Suiza", "Australia", "Países Bajos"), "Geografía", "Sudáfrica tiene tres capitales oficiales: Pretoria (administrativa), Ciudad del Cabo (legislativa) y Bloemfontein (judicial), lo que lo convierte en el país con más capitales del mundo.")
        ),
        BilingualQuestion(
            id = 9816, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le pays avec le plus de fuseaux horaires?", listOf("Australie", "Russie", "France", "États-Unis"), "Géographie", "La France possède le plus grand nombre de fuseaux horaires au monde (12, voire 13 avec l'heure d'été) grâce à ses territoires d'outre-mer répartis sur tous les océans."),
            en = LocalizedContent("Which country has the most time zones?", listOf("Australia", "Russia", "France", "United States"), "Geography", "France has the most time zones in the world (12, or 13 with daylight saving time) due to its overseas territories spread across all oceans."),
            zh = LocalizedContent("哪个国家的时区最多？", listOf("澳大利亚", "俄罗斯", "法国", "美国"), "地理", "法国拥有世界上最多的时区（12个，夏令时13个），因为其海外领土遍布各大洋。"),
            es = LocalizedContent("¿Qué país tiene más husos horarios?", listOf("Australia", "Rusia", "Francia", "Estados Unidos"), "Geografía", "Francia tiene la mayor cantidad de husos horarios del mundo (12, o 13 con el horario de verano) gracias a sus territorios de ultramar repartidos por todos los océanos.")
        ),
        BilingualQuestion(
            id = 9817, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le pays avec le plus de voisins terrestres?", listOf("Russie", "Chine", "France", "Allemagne"), "Géographie", "La Russie partage ses frontières terrestres avec 14 pays, incluant la Norvège, la Finlande, la Chine et la Mongolie, ce qui en fait le pays avec le plus de voisins terrestres au monde."),
            en = LocalizedContent("Which country has the most land neighbors?", listOf("Russia", "China", "France", "Germany"), "Geography", "Russia shares land borders with 14 countries, including Norway, Finland, China, and Mongolia, making it the country with the most land neighbors in the world."),
            zh = LocalizedContent("哪个国家的陆地邻国最多？", listOf("俄罗斯", "中国", "法国", "德国"), "地理", "俄罗斯与14个国家接壤，包括挪威、芬兰、中国和蒙古，使其成为世界上陆地邻国最多的国家。"),
            es = LocalizedContent("¿Qué país tiene más vecinos terrestres?", listOf("Rusia", "China", "Francia", "Alemania"), "Geografía", "Rusia comparte fronteras terrestres con 14 países, incluyendo Noruega, Finlandia, China y Mongolia, lo que lo convierte en el país con más vecinos terrestres del mundo.")
        ),
        BilingualQuestion(
            id = 9818, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le pays avec le moins de voisins terrestres?", listOf("Islande", "Nouvelle-Zélande", "Japon", "Australie"), "Géographie", "La Nouvelle-Zélande est un pays insulaire, sans aucune frontière terrestre avec d'autres pays, ce qui en fait celui avec le moins de voisins terrestres."),
            en = LocalizedContent("Which country has the fewest land neighbors?", listOf("Iceland", "New Zealand", "Japan", "Australia"), "Geography", "New Zealand is an island country with no land borders with any other country, making it the one with the fewest land neighbors."),
            zh = LocalizedContent("哪个国家的陆地邻国最少？", listOf("冰岛", "新西兰", "日本", "澳大利亚"), "地理", "新西兰是一个岛国，与其他国家没有陆地边界，因此是陆地邻国最少的国家。"),
            es = LocalizedContent("¿Qué país tiene menos vecinos terrestres?", listOf("Islandia", "Nueva Zelanda", "Japón", "Australia"), "Geografía", "Nueva Zelanda es un país insular sin fronteras terrestres con ningún otro país, lo que lo convierte en el que tiene menos vecinos terrestres.")
        ),
        BilingualQuestion(
            id = 9819, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le pays le plus montagneux du monde?", listOf("Népal", "Suisse", "Kirghizistan", "Pérou"), "Géographie", "Le Kirghizistan est considéré comme le pays le plus montagneux du monde car plus de 90% de son territoire est recouvert par les chaînes du Tian Shan et du Pamir, avec une altitude moyenne dépassant 2 700 mètres."),
            en = LocalizedContent("What is the most mountainous country in the world?", listOf("Nepal", "Switzerland", "Kyrgyzstan", "Peru"), "Geography", "Kyrgyzstan is considered the most mountainous country in the world because over 90% of its territory is covered by the Tian Shan and Pamir ranges, with an average altitude exceeding 2,700 meters."),
            zh = LocalizedContent("世界上山脉最多的国家是哪个？", listOf("尼泊尔", "瑞士", "吉尔吉斯斯坦", "秘鲁"), "地理", "吉尔吉斯斯坦被认为是世界上山脉最多的国家，因为其90%以上的领土被天山和帕米尔山脉覆盖，平均海拔超过2700米。"),
            es = LocalizedContent("¿Cuál es el país más montañoso del mundo?", listOf("Nepal", "Suiza", "Kirguistán", "Perú"), "Geografía", "Kirguistán es considerado el país más montañoso del mundo, ya que más del 90% de su territorio está cubierto por las cordilleras de Tian Shan y Pamir, con una altitud media que supera los 2.700 metros.")
        ),
        BilingualQuestion(
            id = 9820, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le pays le plus plat du monde?", listOf("Belgique", "Pays-Bas", "Danemark", "Moldavie"), "Géographie", "Avec une altitude moyenne de seulement 30 mètres et un point culminant à 321 mètres, les Pays-Bas sont le pays le plus plat du monde, en grande partie grâce à leur topographie de polders et de plaines côtières."),
            en = LocalizedContent("Which is the flattest country in the world?", listOf("Belgium", "Netherlands", "Denmark", "Moldova"), "Geography", "With an average altitude of only 30 meters and a highest point at 321 meters, the Netherlands is the flattest country in the world, largely due to its polder and coastal plain topography."),
            zh = LocalizedContent("世界上最平坦的国家是哪个？", listOf("比利时", "荷兰", "丹麦", "摩尔多瓦"), "地理", "荷兰平均海拔仅30米，最高点321米，是世界上地势最平坦的国家，这主要归功于其圩田和沿海平原的地形。"),
            es = LocalizedContent("¿Cuál es el país más plano del mundo?", listOf("Bélgica", "Países Bajos", "Dinamarca", "Moldavia"), "Geografía", "Con una altitud media de solo 30 metros y un punto culminante a 321 metros, los Países Bajos son el país más plano del mundo, en gran parte debido a su topografía de pólders y llanuras costeras.")
        ),
        BilingualQuestion(
            id = 9821, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le pays le plus boisé du monde?", listOf("Russie", "Brésil", "Inde", "Canada"), "Géographie", "Le Brésil possède la plus grande forêt tropicale du monde, l'Amazonie, qui couvre environ 60 % de son territoire."),
            en = LocalizedContent("Which is the most forested country in the world?", listOf("Russia", "Brazil", "India", "Canada"), "Geography", "Brazil has the largest tropical rainforest in the world, the Amazon, which covers about 60% of its territory."),
            zh = LocalizedContent("世界上森林覆盖率最高的国家是哪个？", listOf("俄罗斯", "巴西", "印度", "加拿大"), "地理", "巴西拥有世界上最大的热带雨林——亚马逊雨林，覆盖其约60%的领土。"),
            es = LocalizedContent("¿Cuál es el país más boscoso del mundo?", listOf("Rusia", "Brasil", "India", "Canadá"), "Geografía", "Brasil posee la mayor selva tropical del mundo, el Amazonas, que cubre aproximadamente el 60% de su territorio.")
        ),
        BilingualQuestion(
            id = 9822, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le pays le plus désertique du monde?", listOf("Egypte", "Libye", "Chine", "Australie"), "Géographie", "La Libye est considérée comme le pays le plus désertique du monde car plus de 95% de son territoire est couvert par le désert du Sahara, avec une très faible densité de population et des précipitations annuelles infimes."),
            en = LocalizedContent("Which is the most desert country in the world?", listOf("Egypt", "Libya", "China", "Australia"), "Geography", "Libya is considered the most desert country in the world because more than 95% of its territory is covered by the Sahara Desert, with very low population density and minimal annual rainfall."),
            zh = LocalizedContent("世界上最沙漠化的国家是哪个？", listOf("埃及", "利比亚", "中国", "澳大利亚"), "地理", "利比亚被认为是世界上最沙漠化的国家，因为其超过95%的领土被撒哈拉沙漠覆盖，人口密度极低，年降水量极少。"),
            es = LocalizedContent("¿Cuál es el país más desértico del mundo?", listOf("Egipto", "Libia", "China", "Australia"), "Geografía", "Libia es considerada el país más desértico del mundo, ya que más del 95% de su territorio está cubierto por el desierto del Sahara, con una densidad de población muy baja y precipitaciones anuales mínimas.")
        ),
        BilingualQuestion(
            id = 9823, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le pays le plus humide du monde?", listOf("Colombie", "Malaisie", "Brésil", "Nouvelle-Zélande"), "Géographie", "La Colombie détient ce record en raison des précipitations extrêmes dans la région du Chocó, où la ville de Lloró reçoit en moyenne plus de 13 000 mm de pluie par an."),
            en = LocalizedContent("Which is the wettest country in the world?", listOf("Colombia", "Malaysia", "Brazil", "New Zealand"), "Geography", "Colombia holds this record due to extreme rainfall in the Chocó region, where the town of Lloró receives an average of over 13,000 mm of rain per year."),
            zh = LocalizedContent("世界上最潮湿的国家是哪个？", listOf("哥伦比亚", "马来西亚", "巴西", "新西兰"), "地理", "哥伦比亚因乔科地区的极端降雨而保持这一纪录，该地区的洛罗镇年平均降雨量超过13,000毫米。"),
            es = LocalizedContent("¿Cuál es el país más húmedo del mundo?", listOf("Colombia", "Malasia", "Brasil", "Nueva Zelanda"), "Geografía", "Colombia ostenta este récord debido a las precipitaciones extremas en la región del Chocó, donde la localidad de Lloró recibe un promedio de más de 13.000 mm de lluvia al año.")
        ),
        BilingualQuestion(
            id = 9824, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le pays le plus sec du monde?", listOf("Pérou", "Égypte", "Chili", "Atacama"), "Géographie", "L'Égypte est considérée comme le pays le plus sec du monde en raison de son climat désertique, avec des précipitations annuelles moyennes inférieures à 20 mm dans la plupart des régions."),
            en = LocalizedContent("Which is the driest country in the world?", listOf("Peru", "Egypt", "Chile", "Atacama"), "Geography", "Egypt is considered the driest country in the world due to its desert climate, with average annual rainfall below 20 mm in most regions."),
            zh = LocalizedContent("世界上最干燥的国家是哪个？", listOf("秘鲁", "埃及", "智利", "阿塔卡马"), "地理", "埃及因其沙漠气候被认为是世界上最干燥的国家，大部分地区年平均降雨量低于20毫米。"),
            es = LocalizedContent("¿Cuál es el país más seco del mundo?", listOf("Perú", "Egipto", "Chile", "Atacama"), "Geografía", "Egipto es considerado el país más seco del mundo debido a su clima desértico, con precipitaciones anuales medias inferiores a 20 mm en la mayoría de las regiones.")
        ),
        BilingualQuestion(
            id = 9825, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le pays le plus chaud du monde?", listOf("Soudan", "Arabie Saoudite", "Djibouti", "Mauritanie"), "Géographie", "Djibouti détient la température moyenne annuelle la plus élevée au monde, autour de 30°C, en raison de son climat désertique et de sa situation géographique près de l'équateur."),
            en = LocalizedContent("Which is the hottest country in the world?", listOf("Sudan", "Saudi Arabia", "Djibouti", "Mauritania"), "Geography", "Djibouti has the highest average annual temperature in the world, around 30°C, due to its desert climate and geographical location near the equator."),
            zh = LocalizedContent("世界上最热的国家是哪个？", listOf("苏丹", "沙特阿拉伯", "吉布提", "毛里塔尼亚"), "地理", "吉布提的年平均气温最高，约为30°C，这归因于其沙漠气候和靠近赤道的地理位置。"),
            es = LocalizedContent("¿Cuál es el país más cálido del mundo?", listOf("Sudán", "Arabia Saudita", "Yibuti", "Mauritania"), "Geografía", "Yibuti tiene la temperatura media anual más alta del mundo, alrededor de 30°C, debido a su clima desértico y su ubicación geográfica cerca del ecuador.")
        ),
        BilingualQuestion(
            id = 9826, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le pays le plus froid du monde?", listOf("Groenland", "Sibérie", "Antarctique", "Canada"), "Géographie", "L'Antarctique est le continent le plus froid du monde, avec des températures record descendant jusqu'à -89,2°C. Il n'est pas un pays, mais un territoire régi par un traité international."),
            en = LocalizedContent("Which is the coldest country in the world?", listOf("Greenland", "Siberia", "Antarctica", "Canada"), "Geography", "Antarctica is the coldest continent in the world, with record temperatures as low as -89.2°C. It is not a country but a territory governed by an international treaty."),
            zh = LocalizedContent("世界上最冷的国家是哪个？", listOf("格陵兰", "西伯利亚", "南极洲", "加拿大"), "地理", "南极洲是世界上最冷的大陆，记录温度低至-89.2°C。它不是一个国家，而是由国际条约管辖的领土。"),
            es = LocalizedContent("¿Cuál es el país más frío del mundo?", listOf("Groenlandia", "Siberia", "Antártida", "Canadá"), "Geografía", "La Antártida es el continente más frío del mundo, con temperaturas récord de hasta -89,2°C. No es un país, sino un territorio regido por un tratado internacional.")
        ),
        BilingualQuestion(
            id = 9827, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le pays avec le plus de lacs?", listOf("Suède", "Finlande", "Canada", "Russie"), "Géographie", "Le Canada compte plus de deux millions de lacs, soit environ 60% des lacs du monde, en raison de son histoire glaciaire et de son vaste territoire."),
            en = LocalizedContent("Which country has the most lakes?", listOf("Sweden", "Finland", "Canada", "Russia"), "Geography", "Canada has over two million lakes, about 60% of the world's lakes, due to its glacial history and vast territory."),
            zh = LocalizedContent("哪个国家的湖泊最多？", listOf("瑞典", "芬兰", "加拿大", "俄罗斯"), "地理", "加拿大拥有超过200万个湖泊，约占世界湖泊的60%，这归因于其冰川历史和广阔的领土。"),
            es = LocalizedContent("¿Qué país tiene más lagos?", listOf("Suecia", "Finlandia", "Canadá", "Rusia"), "Geografía", "Canadá cuenta con más de dos millones de lagos, aproximadamente el 60% de los lagos del mundo, debido a su historia glacial y su vasto territorio.")
        ),
        BilingualQuestion(
            id = 9828, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le pays avec le plus de rivières?", listOf("Brésil", "Inde", "Chine", "Russie"), "Géographie", "Le Brésil possède le plus grand réseau hydrographique du monde en raison de l'Amazonie et de ses nombreux affluents, totalisant plus de 12 000 rivières."),
            en = LocalizedContent("Which country has the most rivers?", listOf("Brazil", "India", "China", "Russia"), "Geography", "Brazil has the largest river network in the world due to the Amazon and its many tributaries, totaling over 12,000 rivers."),
            zh = LocalizedContent("哪个国家的河流最多？", listOf("巴西", "印度", "中国", "俄罗斯"), "地理", "巴西拥有世界上最大的河流网络，这归功于亚马逊河及其众多支流，河流总数超过12,000条。"),
            es = LocalizedContent("¿Qué país tiene más ríos?", listOf("Brasil", "India", "China", "Rusia"), "Geografía", "Brasil posee la mayor red fluvial del mundo debido al Amazonas y sus numerosos afluentes, totalizando más de 12.000 ríos.")
        ),
        BilingualQuestion(
            id = 9829, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le pays avec le plus de volcans?", listOf("Indonésie", "Chili", "Japon", "Mexique"), "Géographie", "L'Indonésie se trouve sur la ceinture de feu du Pacifique, une zone de forte activité tectonique, et compte plus de 130 volcans actifs, soit le plus grand nombre au monde."),
            en = LocalizedContent("Which country has the most volcanoes?", listOf("Indonesia", "Chile", "Japan", "Mexico"), "Geography", "Indonesia lies on the Pacific Ring of Fire, an area of high tectonic activity, and has over 130 active volcanoes, the highest number in the world."),
            zh = LocalizedContent("哪个国家的火山最多？", listOf("印度尼西亚", "智利", "日本", "墨西哥"), "地理", "印度尼西亚位于太平洋火山带，这是一个构造活动频繁的区域，拥有超过130座活火山，数量居世界之首。"),
            es = LocalizedContent("¿Qué país tiene más volcanes?", listOf("Indonesia", "Chile", "Japón", "México"), "Geografía", "Indonesia se encuentra en el Cinturón de Fuego del Pacífico, una zona de alta actividad tectónica, y cuenta con más de 130 volcanes activos, la mayor cantidad del mundo.")
        ),
    )

    private fun part6(): List<BilingualQuestion> = listOf(
        BilingualQuestion(
            id = 9830, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le pays avec le plus de tremblements de terre?", listOf("Japon", "Indonésie", "Chili", "Pérou"), "Géographie", "L'Indonésie se situe sur la ceinture de feu du Pacifique, une zone de forte activité tectonique où plusieurs plaques se rencontrent, provoquant de nombreux séismes."),
            en = LocalizedContent("Which country has the most earthquakes?", listOf("Japan", "Indonesia", "Chile", "Peru"), "Geography", "Indonesia lies on the Pacific Ring of Fire, an area of high tectonic activity where several plates meet, causing numerous earthquakes."),
            zh = LocalizedContent("哪个国家地震最多？", listOf("日本", "印度尼西亚", "智利", "秘鲁"), "地理", "印度尼西亚位于太平洋火山地震带，这是一个多板块交汇、构造活动频繁的区域，因此地震频发。"),
            es = LocalizedContent("¿Qué país tiene más terremotos?", listOf("Japón", "Indonesia", "Chile", "Perú"), "Geografia", "Indonesia se encuentra en el Cinturón de Fuego del Pacífico, una zona de alta actividad tectónica donde convergen varias placas, provocando numerosos sismos.")
        ),
        BilingualQuestion(
            id = 9831, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le pays avec le plus de glaciers?", listOf("Norvège", "Nouvelle-Zélande", "Groenland", "Canada"), "Géographie", "Le Canada possède le plus grand nombre de glaciers au monde, principalement concentrés dans l'Arctique et les montagnes Rocheuses, avec environ 200 000 glaciers recensés."),
            en = LocalizedContent("Which country has the most glaciers?", listOf("Norway", "New Zealand", "Greenland", "Canada"), "Geography", "Canada has the largest number of glaciers in the world, mainly concentrated in the Arctic and the Rocky Mountains, with about 200,000 glaciers recorded."),
            zh = LocalizedContent("哪个国家冰川最多？", listOf("挪威", "新西兰", "格陵兰", "加拿大"), "地理", "加拿大拥有世界上最多的冰川，主要集中在北极地区和落基山脉，约有20万条冰川被记录。"),
            es = LocalizedContent("¿Qué país tiene más glaciares?", listOf("Noruega", "Nueva Zelanda", "Groenlandia", "Canadá"), "Geografia", "Canadá posee la mayor cantidad de glaciares del mundo, concentrados principalmente en el Ártico y las Montañas Rocosas, con aproximadamente 200,000 glaciares registrados.")
        ),
        BilingualQuestion(
            id = 9832, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le pays avec le plus de îles?", listOf("Suède", "Finlande", "Norvège", "Canada"), "Géographie", "La Norvège possède le plus grand nombre d'îles au monde, avec environ 50 000 îles répertoriées le long de son littoral découpé par les fjords."),
            en = LocalizedContent("Which country has the most islands?", listOf("Sweden", "Finland", "Norway", "Canada"), "Geography", "Norway has the largest number of islands in the world, with about 50,000 islands recorded along its fjord-indented coastline."),
            zh = LocalizedContent("哪个国家岛屿最多？", listOf("瑞典", "芬兰", "挪威", "加拿大"), "地理", "挪威拥有世界上最多的岛屿，在其被峡湾切割的海岸线上约有5万个岛屿被记录。"),
            es = LocalizedContent("¿Qué país tiene más islas?", listOf("Suecia", "Finlandia", "Noruega", "Canadá"), "Geografia", "Noruega tiene la mayor cantidad de islas del mundo, con aproximadamente 50,000 islas registradas a lo largo de su costa recortada por fiordos.")
        ),
        BilingualQuestion(
            id = 9833, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le pays avec le plus de forêts tropicales?", listOf("Indonésie", "Pérou", "Brésil", "Congo"), "Géographie", "Le Brésil abrite environ 60% de la forêt amazonienne, la plus grande forêt tropicale du monde, ce qui en fait le pays avec la plus grande superficie de ce type de forêt."),
            en = LocalizedContent("Which country has the most tropical forests?", listOf("Indonesia", "Peru", "Brazil", "Congo"), "Geography", "Brazil is home to about 60% of the Amazon rainforest, the largest tropical forest in the world, making it the country with the largest area of this type of forest."),
            zh = LocalizedContent("哪个国家热带雨林最多？", listOf("印度尼西亚", "秘鲁", "巴西", "刚果"), "地理", "巴西拥有约60%的亚马逊雨林，这是世界上最大的热带雨林，因此巴西是热带雨林面积最大的国家。"),
            es = LocalizedContent("¿Qué país tiene más bosques tropicales?", listOf("Indonesia", "Perú", "Brasil", "Congo"), "Geografia", "Brasil alberga aproximadamente el 60% de la selva amazónica, la mayor selva tropical del mundo, lo que lo convierte en el país con la mayor superficie de este tipo de bosque.")
        ),
        BilingualQuestion(
            id = 9834, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le pays avec le plus de deserts?", listOf("Australie", "Russie", "États-Unis", "Égypte"), "Géographie", "L'Australie est le pays qui possède la plus grande superficie de déserts, avec environ 70% de son territoire classé comme aride ou semi-aride."),
            en = LocalizedContent("Which country has the most deserts?", listOf("Australia", "Russia", "United States", "Egypt"), "Geography", "Australia is the country with the largest desert area, with about 70% of its territory classified as arid or semi-arid."),
            zh = LocalizedContent("哪个国家沙漠最多？", listOf("澳大利亚", "俄罗斯", "美国", "埃及"), "地理", "澳大利亚是沙漠面积最大的国家，约70%的领土被归类为干旱或半干旱地区。"),
            es = LocalizedContent("¿Qué país tiene más desiertos?", listOf("Australia", "Rusia", "Estados Unidos", "Egipto"), "Geografia", "Australia es el país con la mayor superficie desértica, con aproximadamente el 70% de su territorio clasificado como árido o semiárido.")
        ),
        BilingualQuestion(
            id = 9835, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand pays multilingue du monde?", listOf("Inde", "Suisse", "Belgique", "Cameroun"), "Géographie", "L'Inde compte 22 langues officiellement reconnues et des centaines de dialectes, ce qui en fait le pays avec la plus grande diversité linguistique au monde."),
            en = LocalizedContent("Which is the most multilingual country in the world?", listOf("India", "Switzerland", "Belgium", "Cameroon"), "Geography", "India has 22 officially recognized languages and hundreds of dialects, making it the country with the greatest linguistic diversity in the world."),
            zh = LocalizedContent("世界上最多语言的国家是哪个？", listOf("印度", "瑞士", "比利时", "喀麦隆"), "地理", "印度有22种官方认可的语言和数百种方言，使其成为世界上语言多样性最丰富的国家。"),
            es = LocalizedContent("¿Cuál es el país más multilingüe del mundo?", listOf("India", "Suiza", "Bélgica", "Camerún"), "Geografia", "La India cuenta con 22 lenguas oficialmente reconocidas y cientos de dialectos, lo que la convierte en el país con mayor diversidad lingüística del mundo.")
        ),
        BilingualQuestion(
            id = 9836, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le pays avec le plus de religions?", listOf("Inde", "Chine", "États-Unis", "Brésil"), "Géographie", "L'Inde abrite une diversité religieuse exceptionnelle avec l'hindouisme, l'islam, le christianisme, le sikhisme, le bouddhisme et le jaïnisme, entre autres. Cette pluralité est reconnue et protégée par la constitution indienne."),
            en = LocalizedContent("Which country has the most religions?", listOf("India", "China", "United States", "Brazil"), "Geography", "India is home to exceptional religious diversity, including Hinduism, Islam, Christianity, Sikhism, Buddhism, and Jainism, among others. This plurality is recognized and protected by the Indian constitution."),
            zh = LocalizedContent("哪个国家宗教最多？", listOf("印度", "中国", "美国", "巴西"), "地理", "印度拥有非凡的宗教多样性，包括印度教、伊斯兰教、基督教、锡克教、佛教和耆那教等。这种多元性受到印度宪法的承认和保护。"),
            es = LocalizedContent("¿Qué país tiene más religiones?", listOf("India", "China", "Estados Unidos", "Brasil"), "Geografia", "La India alberga una diversidad religiosa excepcional, que incluye hinduismo, islam, cristianismo, sijismo, budismo y jainismo, entre otras. Esta pluralidad está reconocida y protegida por la constitución india.")
        ),
        BilingualQuestion(
            id = 9837, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le pays avec le plus de minorités?", listOf("Inde", "Indonésie", "Nigeria", "Chine"), "Géographie", "L'Inde abrite des centaines de groupes linguistiques, ethniques et religieux distincts, reconnus officiellement comme minorités, ce qui en fait le pays le plus diversifié au monde à cet égard."),
            en = LocalizedContent("Which country has the most minorities?", listOf("India", "Indonesia", "Nigeria", "China"), "Geography", "India is home to hundreds of distinct linguistic, ethnic, and religious groups officially recognized as minorities, making it the most diverse country in the world in this regard."),
            zh = LocalizedContent("哪个国家少数民族最多？", listOf("印度", "印度尼西亚", "尼日利亚", "中国"), "地理", "印度拥有数百个不同的语言、民族和宗教群体，被官方承认为少数民族，因此在这方面是世界上最多元化的国家。"),
            es = LocalizedContent("¿Qué país tiene más minorías?", listOf("India", "Indonesia", "Nigeria", "China"), "Geografia", "La India alberga cientos de grupos lingüísticos, étnicos y religiosos distintos reconocidos oficialmente como minorías, lo que la convierte en el país más diverso del mundo en este aspecto.")
        ),
        BilingualQuestion(
            id = 9838, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le pays avec le plus de traditions culturelles?", listOf("Inde", "Chine", "Japon", "Italie"), "Géographie", "L'Inde possède une diversité culturelle exceptionnelle avec des traditions variant selon les régions, langues et religions, ce qui lui confère le plus grand nombre de traditions culturelles recensées."),
            en = LocalizedContent("Which country has the most cultural traditions?", listOf("India", "China", "Japan", "Italy"), "Geography", "India possesses exceptional cultural diversity with traditions varying by region, language, and religion, giving it the largest number of recorded cultural traditions."),
            zh = LocalizedContent("哪个国家文化传统最多？", listOf("印度", "中国", "日本", "意大利"), "地理", "印度拥有非凡的文化多样性，传统因地区、语言和宗教而异，因此拥有最多的文化传统记录。"),
            es = LocalizedContent("¿Qué país tiene más tradiciones culturales?", listOf("India", "China", "Japón", "Italia"), "Geografia", "La India posee una diversidad cultural excepcional con tradiciones que varían según la región, el idioma y la religión, lo que le otorga el mayor número de tradiciones culturales registradas.")
        ),
        BilingualQuestion(
            id = 9839, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand pays en développement du monde?", listOf("Inde", "Chine", "Brésil", "Indonésie"), "Géographie", "L'Inde est considérée comme le plus grand pays en développement en raison de sa population massive et de son statut économique émergent, bien qu'elle soit encore classée comme un pays à revenu intermédiaire."),
            en = LocalizedContent("Which is the largest developing country in the world?", listOf("India", "China", "Brazil", "Indonesia"), "Geography", "India is considered the largest developing country due to its massive population and emerging economic status, although it is still classified as a middle-income country."),
            zh = LocalizedContent("世界上最大的发展中国家是哪个？", listOf("印度", "中国", "巴西", "印度尼西亚"), "地理", "印度因其庞大的人口和新兴的经济地位而被认为是最大的发展中国家，尽管它仍被归类为中等收入国家。"),
            es = LocalizedContent("¿Cuál es el país en desarrollo más grande del mundo?", listOf("India", "China", "Brasil", "Indonesia"), "Geografia", "La India es considerada el país en desarrollo más grande debido a su enorme población y su estatus económico emergente, aunque todavía está clasificada como un país de ingresos medios.")
        ),
        BilingualQuestion(
            id = 9840, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand pays insulaire du monde?", listOf("Philippines", "Indonésie", "Japon", "Nouvelle-Zélande"), "Géographie", "L'Indonésie est le plus grand archipel du monde avec plus de 17 000 îles, ce qui en fait le plus grand pays insulaire par superficie et population."),
            en = LocalizedContent("What is the largest island country in the world?", listOf("Philippines", "Indonesia", "Japan", "New Zealand"), "Geography", "Indonesia is the largest archipelago in the world with over 17,000 islands, making it the largest island country by area and population."),
            zh = LocalizedContent("世界上最大的岛国是哪个？", listOf("菲律宾", "印度尼西亚", "日本", "新西兰"), "地理", "印度尼西亚是世界上最大的群岛国家，拥有超过17000个岛屿，是面积和人口最大的岛国。"),
            es = LocalizedContent("¿Cuál es el país insular más grande del mundo?", listOf("Filipinas", "Indonesia", "Japón", "Nueva Zelanda"), "Geografía", "Indonesia es el archipiélago más grande del mundo con más de 17.000 islas, lo que lo convierte en el país insular más grande por superficie y población.")
        ),
        BilingualQuestion(
            id = 9841, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand pays sans ressources naturelles?", listOf("Singapour", "Luxembourg", "Liechtenstein", "Suisse"), "Géographie", "Singapour est une cité-État dépourvue de ressources naturelles comme le pétrole ou les minerais, mais elle a bâti sa richesse sur le commerce et la finance."),
            en = LocalizedContent("What is the largest country without natural resources?", listOf("Singapore", "Luxembourg", "Liechtenstein", "Switzerland"), "Geography", "Singapore is a city-state devoid of natural resources like oil or minerals, but it has built its wealth on trade and finance."),
            zh = LocalizedContent("哪个最大的国家没有自然资源？", listOf("新加坡", "卢森堡", "列支敦士登", "瑞士"), "地理", "新加坡是一个缺乏石油或矿产等自然资源的城邦，但它通过贸易和金融建立了财富。"),
            es = LocalizedContent("¿Cuál es el país más grande sin recursos naturales?", listOf("Singapur", "Luxemburgo", "Liechtenstein", "Suiza"), "Geografía", "Singapur es una ciudad-estado carente de recursos naturales como petróleo o minerales, pero ha construido su riqueza en el comercio y las finanzas.")
        ),
        BilingualQuestion(
            id = 9842, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand désert côtier du monde?", listOf("Atacama", "Namib", "Sahara", "Arabie"), "Géographie", "Le désert du Namib, situé le long de la côte atlantique de la Namibie, est considéré comme le plus ancien désert du monde et le plus grand désert côtier."),
            en = LocalizedContent("What is the largest coastal desert in the world?", listOf("Atacama", "Namib", "Sahara", "Arabian"), "Geography", "The Namib Desert, located along the Atlantic coast of Namibia, is considered the oldest desert in the world and the largest coastal desert."),
            zh = LocalizedContent("世界上最大的沿海沙漠是哪个？", listOf("阿塔卡马沙漠", "纳米布沙漠", "撒哈拉沙漠", "阿拉伯沙漠"), "地理", "纳米布沙漠位于纳米比亚的大西洋沿岸，被认为是世界上最古老的沙漠和最大的沿海沙漠。"),
            es = LocalizedContent("¿Cuál es el desierto costero más grande del mundo?", listOf("Atacama", "Namib", "Sahara", "Arábigo"), "Geografía", "El desierto de Namib, ubicado a lo largo de la costa atlántica de Namibia, es considerado el desierto más antiguo del mundo y el desierto costero más grande.")
        ),
        BilingualQuestion(
            id = 9843, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand delta fluvial du monde?", listOf("Delta du Gange", "Delta du Mékong", "Delta de l'Amazone", "Delta du Nil"), "Géographie", "Le delta du Gange, situé principalement au Bangladesh et en Inde, est le plus grand delta fluvial du monde en superficie, formé par les fleuves Gange et Brahmapoutre."),
            en = LocalizedContent("What is the largest river delta in the world?", listOf("Ganges Delta", "Mekong Delta", "Amazon Delta", "Nile Delta"), "Geography", "The Ganges Delta, located mainly in Bangladesh and India, is the largest river delta in the world by area, formed by the Ganges and Brahmaputra rivers."),
            zh = LocalizedContent("世界上最大的河流三角洲是哪个？", listOf("恒河三角洲", "湄公河三角洲", "亚马逊河三角洲", "尼罗河三角洲"), "地理", "恒河三角洲主要位于孟加拉国和印度，由恒河和布拉马普特拉河形成，是世界上面积最大的河流三角洲。"),
            es = LocalizedContent("¿Cuál es el delta fluvial más grande del mundo?", listOf("Delta del Ganges", "Delta del Mekong", "Delta del Amazonas", "Delta del Nilo"), "Geografía", "El delta del Ganges, ubicado principalmente en Bangladesh y la India, es el delta fluvial más grande del mundo por superficie, formado por los ríos Ganges y Brahmaputra.")
        ),
        BilingualQuestion(
            id = 9844, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand estuaire du monde?", listOf("Estuaire du Gange", "Estuaire de l'Amazone", "Estuaire de l'Orénoque", "Estuaire de la Tamise"), "Géographie", "L'estuaire du Gange, situé au Bangladesh, est le plus vaste du monde en superficie. Il se forme à la confluence du Gange et du Brahmapoutre avant de se jeter dans le golfe du Bengale."),
            en = LocalizedContent("What is the largest estuary in the world?", listOf("Ganges Estuary", "Amazon Estuary", "Orinoco Estuary", "Thames Estuary"), "Geography", "The Ganges Estuary, located in Bangladesh, is the largest in the world by area. It forms at the confluence of the Ganges and Brahmaputra before emptying into the Bay of Bengal."),
            zh = LocalizedContent("世界上最大的河口湾是哪个？", listOf("恒河河口湾", "亚马逊河河口湾", "奥里诺科河河口湾", "泰晤士河河口湾"), "地理", "恒河河口湾位于孟加拉国，是世界上面积最大的河口湾。它由恒河和布拉马普特拉河汇合而成，注入孟加拉湾。"),
            es = LocalizedContent("¿Cuál es el estuario más grande del mundo?", listOf("Estuario del Ganges", "Estuario del Amazonas", "Estuario del Orinoco", "Estuario del Támesis"), "Geografía", "El estuario del Ganges, ubicado en Bangladesh, es el más grande del mundo por superficie. Se forma en la confluencia del Ganges y el Brahmaputra antes de desembocar en la bahía de Bengala.")
        ),
        BilingualQuestion(
            id = 9845, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand fjord du monde?", listOf("Fjord de Sognefjord", "Fjord de Hardangerfjord", "Fjord de Scorsby Sund", "Fjord de Geirangerfjord"), "Géographie", "Le Scoresby Sund, situé au Groenland, est le plus grand fjord du monde avec une longueur de 350 kilomètres et une profondeur atteignant 1 450 mètres."),
            en = LocalizedContent("What is the largest fjord in the world?", listOf("Sognefjord", "Hardangerfjord", "Scoresby Sund", "Geirangerfjord"), "Geography", "Scoresby Sund, located in Greenland, is the largest fjord in the world with a length of 350 kilometers and a depth reaching 1,450 meters."),
            zh = LocalizedContent("世界上最大的峡湾是哪个？", listOf("松恩峡湾", "哈当厄尔峡湾", "斯科斯比峡湾", "盖朗厄尔峡湾"), "地理", "斯科斯比峡湾位于格陵兰，是世界上最大的峡湾，长350公里，深达1450米。"),
            es = LocalizedContent("¿Cuál es el fiordo más grande del mundo?", listOf("Fiordo de Sognefjord", "Fiordo de Hardangerfjord", "Fiordo de Scoresby Sund", "Fiordo de Geirangerfjord"), "Geografía", "El Scoresby Sund, ubicado en Groenlandia, es el fiordo más grande del mundo con una longitud de 350 kilómetros y una profundidad que alcanza los 1.450 metros.")
        ),
        BilingualQuestion(
            id = 9846, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand geyser du monde?", listOf("Great Geyser", "Strokkur", "Old Faithful", "Steamboat Geyser"), "Géographie", "Le Steamboat Geyser, situé dans le parc national de Yellowstone aux États-Unis, détient le record du plus haut geyser actif, avec des éruptions pouvant atteindre 90 mètres."),
            en = LocalizedContent("What is the largest geyser in the world?", listOf("Great Geyser", "Strokkur", "Old Faithful", "Steamboat Geyser"), "Geography", "Steamboat Geyser, located in Yellowstone National Park in the United States, holds the record for the tallest active geyser, with eruptions reaching up to 90 meters."),
            zh = LocalizedContent("世界上最大的间歇泉是哪个？", listOf("大间歇泉", "史托克间歇泉", "老忠实间歇泉", "汽船间歇泉"), "地理", "汽船间歇泉位于美国黄石国家公园，保持着最高活跃间歇泉的记录，喷发高度可达90米。"),
            es = LocalizedContent("¿Cuál es el géiser más grande del mundo?", listOf("Gran Géiser", "Strokkur", "Old Faithful", "Steamboat Geyser"), "Geografía", "El Steamboat Geyser, ubicado en el Parque Nacional de Yellowstone en Estados Unidos, tiene el récord del géiser activo más alto, con erupciones que alcanzan hasta 90 metros.")
        ),
        BilingualQuestion(
            id = 9847, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand cañon du monde?", listOf("Canyonlands", "Zion Canyon", "Grand Canyon", "Palo Duro Canyon"), "Géographie", "Le Grand Canyon, situé dans l'Arizona aux États-Unis, est le plus célèbre et le plus vaste canyon du monde, creusé par le fleuve Colorado sur des millions d'années."),
            en = LocalizedContent("What is the largest canyon in the world?", listOf("Canyonlands", "Zion Canyon", "Grand Canyon", "Palo Duro Canyon"), "Geography", "The Grand Canyon, located in Arizona, United States, is the most famous and largest canyon in the world, carved by the Colorado River over millions of years."),
            zh = LocalizedContent("世界上最大的峡谷是哪个？", listOf("峡谷地", "锡安峡谷", "大峡谷", "帕洛杜罗峡谷"), "地理", "大峡谷位于美国亚利桑那州，是世界上最著名和最大的峡谷，由科罗拉多河经过数百万年侵蚀而成。"),
            es = LocalizedContent("¿Cuál es el cañón más grande del mundo?", listOf("Canyonlands", "Cañón Zion", "Gran Cañón", "Cañón Palo Duro"), "Geografía", "El Gran Cañón, ubicado en Arizona, Estados Unidos, es el cañón más famoso y más grande del mundo, tallado por el río Colorado durante millones de años.")
        ),
        BilingualQuestion(
            id = 9848, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand îlot du monde?", listOf("Île de Baffin", "Île Greenland", "Île Nouvelle-Guinée", "Île de Sumatra"), "Géographie", "Le Groenland est la plus grande île du monde avec une superficie d'environ 2,16 millions de km², bien qu'il soit souvent considéré comme un territoire danois plutôt qu'un continent."),
            en = LocalizedContent("What is the largest island in the world?", listOf("Baffin Island", "Greenland", "New Guinea", "Sumatra"), "Geography", "Greenland is the largest island in the world with an area of about 2.16 million km², although it is often considered a Danish territory rather than a continent."),
            zh = LocalizedContent("世界上最大的岛屿是哪个？", listOf("巴芬岛", "格陵兰", "新几内亚岛", "苏门答腊岛"), "地理", "格陵兰是世界上最大的岛屿，面积约216万平方公里，尽管它通常被视为丹麦的领土而非一个大陆。"),
            es = LocalizedContent("¿Cuál es la isla más grande del mundo?", listOf("Isla de Baffin", "Groenlandia", "Nueva Guinea", "Sumatra"), "Geografía", "Groenlandia es la isla más grande del mundo con una superficie de aproximadamente 2,16 millones de km², aunque a menudo se considera un territorio danés en lugar de un continente.")
        ),
        BilingualQuestion(
            id = 9849, correctIndex = 3, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le plus petit continent du monde?", listOf("Europe", "Asie", "Afrique", "Océanie"), "Géographie", "L'Océanie est le plus petit continent en superficie, comprenant l'Australie, la Nouvelle-Zélande et les îles du Pacifique."),
            en = LocalizedContent("What is the smallest continent in the world?", listOf("Europe", "Asia", "Africa", "Oceania"), "Geography", "Oceania is the smallest continent by area, comprising Australia, New Zealand, and the Pacific islands."),
            zh = LocalizedContent("世界上最小的大洲是哪个？", listOf("欧洲", "亚洲", "非洲", "大洋洲"), "地理", "大洋洲是面积最小的大洲，包括澳大利亚、新西兰和太平洋岛屿。"),
            es = LocalizedContent("¿Cuál es el continente más pequeño del mundo?", listOf("Europa", "Asia", "África", "Oceanía"), "Geografía", "Oceanía es el continente más pequeño por superficie, que comprende Australia, Nueva Zelanda y las islas del Pacífico.")
        ),
        BilingualQuestion(
            id = 9850, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le continent le plus peuplé?", listOf("Afrique", "Asie", "Europe", "Amérique du Nord"), "Géographie", "L'Asie abrite environ 60% de la population mondiale, avec des pays comme la Chine et l'Inde dépassant chacun le milliard d'habitants."),
            en = LocalizedContent("Which is the most populous continent?", listOf("Africa", "Asia", "Europe", "North America"), "Geography", "Asia is home to about 60% of the world's population, with countries like China and India each exceeding one billion inhabitants."),
            zh = LocalizedContent("哪个大洲人口最多？", listOf("非洲", "亚洲", "欧洲", "北美洲"), "地理", "亚洲拥有世界约60%的人口，中国和印度等国家的人口均超过十亿。"),
            es = LocalizedContent("¿Cuál es el continente más poblado?", listOf("África", "Asia", "Europa", "América del Norte"), "Geografía", "Asia alberga aproximadamente el 60% de la población mundial, con países como China e India que superan cada uno los mil millones de habitantes.")
        ),
        BilingualQuestion(
            id = 9851, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le continent le plus froid?", listOf("Asie", "Antarctique", "Amérique du Nord", "Groenland"), "Géographie", "L'Antarctique détient le record de la température la plus basse sur Terre, avec des températures pouvant descendre en dessous de -90°C. Sa calotte glaciaire et son altitude élevée en font le continent le plus froid."),
            en = LocalizedContent("Which is the coldest continent?", listOf("Asia", "Antarctica", "North America", "Greenland"), "Geography", "Antarctica holds the record for the lowest temperature on Earth, with temperatures dropping below -90°C. Its ice sheet and high altitude make it the coldest continent."),
            zh = LocalizedContent("哪个大洲最冷？", listOf("亚洲", "南极洲", "北美洲", "格陵兰"), "地理", "南极洲保持着地球最低温度记录，气温可降至-90°C以下。其冰盖和高海拔使其成为最冷的大洲。"),
            es = LocalizedContent("¿Cuál es el continente más frío?", listOf("Asia", "Antártida", "América del Norte", "Groenlandia"), "Geografía", "La Antártida tiene el récord de la temperatura más baja en la Tierra, con temperaturas que pueden descender por debajo de -90°C. Su capa de hielo y su alta altitud la convierten en el continente más frío.")
        ),
        BilingualQuestion(
            id = 9852, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le continent le plus sec?", listOf("Afrique", "Asie", "Océanie", "Antarctique"), "Géographie", "Bien que l'Antarctique soit recouvert de glace, il reçoit très peu de précipitations, ce qui en fait un désert polaire et le continent le plus sec de la planète."),
            en = LocalizedContent("Which is the driest continent?", listOf("Africa", "Asia", "Oceania", "Antarctica"), "Geography", "Although Antarctica is covered in ice, it receives very little precipitation, making it a polar desert and the driest continent on the planet."),
            zh = LocalizedContent("哪个大洲最干燥？", listOf("非洲", "亚洲", "大洋洲", "南极洲"), "地理", "尽管南极洲被冰覆盖，但降水量极少，使其成为极地沙漠，也是地球上最干燥的大洲。"),
            es = LocalizedContent("¿Cuál es el continente más seco?", listOf("África", "Asia", "Oceanía", "Antártida"), "Geografía", "Aunque la Antártida está cubierta de hielo, recibe muy poca precipitación, lo que la convierte en un desierto polar y el continente más seco del planeta.")
        ),
        BilingualQuestion(
            id = 9853, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le continent le plus montagneux?", listOf("Asie", "Amérique du Nord", "Amérique du Sud", "Afrique"), "Géographie", "L'Asie abrite les plus hauts sommets du monde, dont l'Himalaya et le plateau tibétain, ce qui en fait le continent le plus montagneux en termes d'altitude moyenne et de relief."),
            en = LocalizedContent("Which is the most mountainous continent?", listOf("Asia", "North America", "South America", "Africa"), "Geography", "Asia is home to the world's highest peaks, including the Himalayas and the Tibetan Plateau, making it the most mountainous continent in terms of average altitude and relief."),
            zh = LocalizedContent("哪个大洲山脉最多？", listOf("亚洲", "北美洲", "南美洲", "非洲"), "地理", "亚洲拥有世界最高峰，包括喜马拉雅山脉和青藏高原，使其在平均海拔和地形起伏方面成为山脉最多的大洲。"),
            es = LocalizedContent("¿Cuál es el continente más montañoso?", listOf("Asia", "América del Norte", "América del Sur", "África"), "Geografía", "Asia alberga los picos más altos del mundo, incluidos el Himalaya y la meseta tibetana, lo que la convierte en el continente más montañoso en términos de altitud media y relieve.")
        ),
        BilingualQuestion(
            id = 9854, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le continent le plus boisé?", listOf("Asie", "Afrique", "Amérique du Sud", "Amérique du Nord"), "Géographie", "L'Amérique du Sud abrite la plus grande forêt tropicale du monde, l'Amazonie, qui représente environ 40% de la superficie forestière du continent."),
            en = LocalizedContent("Which is the most forested continent?", listOf("Asia", "Africa", "South America", "North America"), "Geography", "South America is home to the world's largest tropical rainforest, the Amazon, which represents about 40% of the continent's forest area."),
            zh = LocalizedContent("哪个大洲森林覆盖率最高？", listOf("亚洲", "非洲", "南美洲", "北美洲"), "地理", "南美洲拥有世界上最大的热带雨林——亚马逊雨林，约占该洲森林面积的40%。"),
            es = LocalizedContent("¿Cuál es el continente más boscoso?", listOf("Asia", "África", "América del Sur", "América del Norte"), "Geografía", "América del Sur alberga la selva tropical más grande del mundo, el Amazonas, que representa aproximadamente el 40% de la superficie forestal del continente.")
        ),
        BilingualQuestion(
            id = 9855, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le continent le plus densément peuplé?", listOf("Asie", "Afrique", "Europe", "Océanie"), "Géographie", "L'Asie abrite plus de 60% de la population mondiale, avec des pays très densément peuplés comme la Chine et l'Inde, ce qui en fait le continent le plus densément peuplé."),
            en = LocalizedContent("Which is the most densely populated continent?", listOf("Asia", "Africa", "Europe", "Oceania"), "Geography", "Asia is home to over 60% of the world's population, with highly densely populated countries like China and India, making it the most densely populated continent."),
            zh = LocalizedContent("哪个大洲人口密度最高？", listOf("亚洲", "非洲", "欧洲", "大洋洲"), "地理", "亚洲拥有世界60%以上的人口，中国和印度等国家人口密度极高，使其成为人口密度最高的大洲。"),
            es = LocalizedContent("¿Cuál es el continente más densamente poblado?", listOf("Asia", "África", "Europa", "Oceanía"), "Geografía", "Asia alberga más del 60% de la población mundial, con países muy densamente poblados como China e India, lo que la convierte en el continente más densamente poblado.")
        ),
        BilingualQuestion(
            id = 9856, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le continent le moins densément peuplé?", listOf("Antarctique", "Océanie", "Asie", "Amérique du Nord"), "Géographie", "L'Antarctique est le continent le moins densément peuplé car il n'a pas de population permanente, seulement des chercheurs et du personnel de soutien dans des stations scientifiques."),
            en = LocalizedContent("Which is the least densely populated continent?", listOf("Antarctica", "Oceania", "Asia", "North America"), "Geography", "Antarctica is the least densely populated continent because it has no permanent population, only researchers and support staff in scientific stations."),
            zh = LocalizedContent("哪个大洲人口密度最低？", listOf("南极洲", "大洋洲", "亚洲", "北美洲"), "地理", "南极洲是人口密度最低的大洲，因为它没有永久居民，只有科研站的研究人员和后勤人员。"),
            es = LocalizedContent("¿Cuál es el continente menos densamente poblado?", listOf("Antártida", "Oceanía", "Asia", "América del Norte"), "Geografía", "La Antártida es el continente menos densamente poblado porque no tiene población permanente, solo investigadores y personal de apoyo en estaciones científicas.")
        ),
        BilingualQuestion(
            id = 9857, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le continent avec le plus de pays?", listOf("Asie", "Afrique", "Europe", "Amérique"), "Géographie", "L'Afrique compte 54 pays reconnus par l'ONU, ce qui en fait le continent le plus fragmenté politiquement, devant l'Europe et l'Asie."),
            en = LocalizedContent("Which continent has the most countries?", listOf("Asia", "Africa", "Europe", "America"), "Geography", "Africa has 54 countries recognized by the UN, making it the most politically fragmented continent, ahead of Europe and Asia."),
            zh = LocalizedContent("哪个大洲国家最多？", listOf("亚洲", "非洲", "欧洲", "美洲"), "地理", "非洲有54个联合国承认的国家，使其成为政治分裂最严重的大洲，超过欧洲和亚洲。"),
            es = LocalizedContent("¿Cuál es el continente con más países?", listOf("Asia", "África", "Europa", "América"), "Geografía", "África tiene 54 países reconocidos por la ONU, lo que la convierte en el continente más fragmentado políticamente, por delante de Europa y Asia.")
        ),
        BilingualQuestion(
            id = 9858, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le continent avec le moins de pays?", listOf("Antarctique", "Océanie", "Amérique du Sud", "Europe"), "Géographie", "L'Antarctique n'est pas un pays et n'a pas de population permanente, ce qui en fait le continent avec le moins de pays, soit zéro."),
            en = LocalizedContent("Which continent has the fewest countries?", listOf("Antarctica", "Oceania", "South America", "Europe"), "Geography", "Antarctica is not a country and has no permanent population, making it the continent with the fewest countries, i.e., zero."),
            zh = LocalizedContent("哪个大洲国家最少？", listOf("南极洲", "大洋洲", "南美洲", "欧洲"), "地理", "南极洲不是一个国家，也没有永久居民，因此它是国家最少的大洲，数量为零。"),
            es = LocalizedContent("¿Cuál es el continente con menos países?", listOf("Antártida", "Oceanía", "América del Sur", "Europa"), "Geografía", "La Antártida no es un país y no tiene población permanente, lo que la convierte en el continente con menos países, es decir, cero.")
        ),
        BilingualQuestion(
            id = 9859, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le continent le plus jeune géologiquement?", listOf("Asie", "Amérique du Nord", "Antarctique", "Océanie"), "Géographie", "L'Océanie est le continent le plus jeune car il repose sur des plaques tectoniques en formation active, avec des terres émergées récentes comme la Nouvelle-Guinée et la Nouvelle-Zélande."),
            en = LocalizedContent("Which is the geologically youngest continent?", listOf("Asia", "North America", "Antarctica", "Oceania"), "Geography", "Oceania is the youngest continent because it sits on actively forming tectonic plates, with recent landmasses like New Guinea and New Zealand."),
            zh = LocalizedContent("哪个大洲地质上最年轻？", listOf("亚洲", "北美洲", "南极洲", "大洋洲"), "地理", "大洋洲是最年轻的大洲，因为它位于活跃的板块构造带上，拥有新几内亚和新西兰等较新的陆地。"),
            es = LocalizedContent("¿Cuál es el continente geológicamente más joven?", listOf("Asia", "América del Norte", "Antártida", "Oceanía"), "Geografía", "Oceanía es el continente más joven porque se asienta sobre placas tectónicas en formación activa, con masas terrestres recientes como Nueva Guinea y Nueva Zelanda.")
        ),
        BilingualQuestion(
            id = 9860, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le continent le plus ancien géologiquement?", listOf("Afrique", "Asie", "Amérique du Sud", "Antarctique"), "Géographie", "L'Afrique possède les plus anciennes roches datées sur Terre, avec des formations comme le craton du Kaapvaal vieux de plus de 3,6 milliards d'années."),
            en = LocalizedContent("Which is the oldest continent geologically?", listOf("Africa", "Asia", "South America", "Antarctica"), "Geography", "Africa has the oldest dated rocks on Earth, with formations like the Kaapvaal Craton dating back over 3.6 billion years."),
            zh = LocalizedContent("哪个大陆在地质上最古老？", listOf("非洲", "亚洲", "南美洲", "南极洲"), "地理", "非洲拥有地球上最古老的岩石，如卡普瓦尔克拉通，其历史可追溯到36亿多年前。"),
            es = LocalizedContent("¿Cuál es el continente más antiguo geológicamente?", listOf("África", "Asia", "América del Sur", "Antártida"), "Geografía", "África posee las rocas más antiguas datadas en la Tierra, con formaciones como el cratón de Kaapvaal de más de 3.600 millones de años.")
        ),
        BilingualQuestion(
            id = 9861, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le continent avec le plus grand nombre de tremblements de terre?", listOf("Asie", "Amérique du Nord", "Amérique du Sud", "Afrique"), "Géographie", "L'Asie est le continent le plus touché par les séismes car elle est située sur la ceinture de feu du Pacifique et la collision des plaques tectoniques y est très active."),
            en = LocalizedContent("Which continent has the most earthquakes?", listOf("Asia", "North America", "South America", "Africa"), "Geography", "Asia is the most earthquake-prone continent as it lies on the Pacific Ring of Fire and experiences highly active tectonic plate collisions."),
            zh = LocalizedContent("哪个大陆地震最多？", listOf("亚洲", "北美洲", "南美洲", "非洲"), "地理", "亚洲是地震最频繁的大陆，因为它位于环太平洋火山地震带上，板块碰撞非常活跃。"),
            es = LocalizedContent("¿Qué continente tiene más terremotos?", listOf("Asia", "América del Norte", "América del Sur", "África"), "Geografía", "Asia es el continente más sísmico, ya que se encuentra en el Cinturón de Fuego del Pacífico y la colisión de placas tectónicas es muy activa.")
        ),
        BilingualQuestion(
            id = 9862, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le continent avec le plus de volcans?", listOf("Asie", "Amérique du Nord", "Amérique du Sud", "Afrique"), "Géographie", "L'Asie abrite environ 60 % des volcans actifs du monde, notamment le long de la ceinture de feu du Pacifique, ce qui en fait le continent le plus volcanique."),
            en = LocalizedContent("Which continent has the most volcanoes?", listOf("Asia", "North America", "South America", "Africa"), "Geography", "Asia is home to about 60% of the world's active volcanoes, especially along the Pacific Ring of Fire, making it the most volcanic continent."),
            zh = LocalizedContent("哪个大陆火山最多？", listOf("亚洲", "北美洲", "南美洲", "非洲"), "地理", "亚洲拥有全球约60%的活火山，特别是沿环太平洋火山地震带，使其成为火山最多的大陆。"),
            es = LocalizedContent("¿Qué continente tiene más volcanes?", listOf("Asia", "América del Norte", "América del Sur", "África"), "Geografía", "Asia alberga alrededor del 60% de los volcanes activos del mundo, especialmente a lo largo del Cinturón de Fuego del Pacífico, lo que lo convierte en el continente más volcánico.")
        ),
        BilingualQuestion(
            id = 9863, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le continent avec le plus de glaciers?", listOf("Asie", "Amérique du Nord", "Antarctique", "Europe"), "Géographie", "L'Antarctique contient environ 90 % des glaces mondiales, avec une calotte glaciaire qui s'étend sur 14 millions de km², ce qui en fait le continent le plus glaciaire."),
            en = LocalizedContent("Which continent has the most glaciers?", listOf("Asia", "North America", "Antarctica", "Europe"), "Geography", "Antarctica contains about 90% of the world's ice, with an ice sheet covering 14 million km², making it the most glaciated continent."),
            zh = LocalizedContent("哪个大陆冰川最多？", listOf("亚洲", "北美洲", "南极洲", "欧洲"), "地理", "南极洲拥有全球约90%的冰，冰盖面积达1400万平方公里，使其成为冰川最多的大陆。"),
            es = LocalizedContent("¿Qué continente tiene más glaciares?", listOf("Asia", "América del Norte", "Antártida", "Europa"), "Geografía", "La Antártida contiene aproximadamente el 90% del hielo mundial, con una capa de hielo que se extiende sobre 14 millones de km², lo que la convierte en el continente más glaciar.")
        ),
        BilingualQuestion(
            id = 9864, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le continent avec le plus de déserts?", listOf("Asie", "Afrique", "Amérique du Nord", "Océanie"), "Géographie", "L'Asie abrite les plus grandes étendues désertiques du monde, comme le désert de Gobi et le désert d'Arabie, ce qui lui donne le plus grand nombre de déserts parmi tous les continents."),
            en = LocalizedContent("Which continent has the most deserts?", listOf("Asia", "Africa", "North America", "Oceania"), "Geography", "Asia has the largest desert expanses in the world, such as the Gobi Desert and the Arabian Desert, giving it the highest number of deserts among all continents."),
            zh = LocalizedContent("哪个大陆沙漠最多？", listOf("亚洲", "非洲", "北美洲", "大洋洲"), "地理", "亚洲拥有世界上最大的沙漠区域，如戈壁沙漠和阿拉伯沙漠，使其成为沙漠最多的大陆。"),
            es = LocalizedContent("¿Qué continente tiene más desiertos?", listOf("Asia", "África", "América del Norte", "Oceanía"), "Geografía", "Asia alberga las mayores extensiones desérticas del mundo, como el desierto de Gobi y el desierto de Arabia, lo que le otorga el mayor número de desiertos entre todos los continentes.")
        ),
        BilingualQuestion(
            id = 9865, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le continent avec le plus de forêts tropicales?", listOf("Asie", "Afrique", "Amérique du Sud", "Océanie"), "Géographie", "L'Amérique du Sud abrite la plus grande forêt tropicale du monde, l'Amazonie, qui s'étend sur neuf pays et représente environ la moitié des forêts tropicales restantes sur Terre."),
            en = LocalizedContent("Which continent has the most tropical rainforests?", listOf("Asia", "Africa", "South America", "Oceania"), "Geography", "South America is home to the world's largest tropical rainforest, the Amazon, which spans nine countries and represents about half of the remaining tropical rainforests on Earth."),
            zh = LocalizedContent("哪个大陆热带雨林最多？", listOf("亚洲", "非洲", "南美洲", "大洋洲"), "地理", "南美洲拥有世界上最大的热带雨林——亚马逊雨林，它横跨九个国家，约占全球现存热带雨林的一半。"),
            es = LocalizedContent("¿Qué continente tiene más selvas tropicales?", listOf("Asia", "África", "América del Sur", "Oceanía"), "Geografía", "América del Sur alberga la selva tropical más grande del mundo, el Amazonas, que se extiende por nueve países y representa aproximadamente la mitad de las selvas tropicales restantes en la Tierra.")
        ),
        BilingualQuestion(
            id = 9866, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le continent avec le plus de savanes?", listOf("Asie", "Afrique", "Amérique du Sud", "Océanie"), "Géographie", "L'Afrique abrite la plus vaste étendue de savanes au monde, notamment le célèbre Serengeti, grâce à son climat tropical alternant saisons sèches et humides."),
            en = LocalizedContent("Which continent has the most savannas?", listOf("Asia", "Africa", "South America", "Oceania"), "Geography", "Africa has the largest expanse of savannas in the world, including the famous Serengeti, due to its tropical climate alternating between dry and wet seasons."),
            zh = LocalizedContent("哪个大陆热带草原最多？", listOf("亚洲", "非洲", "南美洲", "大洋洲"), "地理", "非洲拥有世界上最大的热带草原区域，包括著名的塞伦盖蒂，这得益于其干湿季交替的热带气候。"),
            es = LocalizedContent("¿Qué continente tiene más sabanas?", listOf("Asia", "África", "América del Sur", "Oceanía"), "Geografía", "África posee la mayor extensión de sabanas del mundo, incluido el famoso Serengeti, gracias a su clima tropical que alterna estaciones secas y húmedas.")
        ),
        BilingualQuestion(
            id = 9867, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le continent avec le plus de toundras?", listOf("Asie", "Amérique du Nord", "Antarctique", "Océanie"), "Géographie", "La toundra arctique couvre une vaste partie du nord du Canada et de l'Alaska, faisant de l'Amérique du Nord le continent possédant la plus grande superficie de ce biome."),
            en = LocalizedContent("Which continent has the most tundra?", listOf("Asia", "North America", "Antarctica", "Oceania"), "Geography", "The Arctic tundra covers a vast part of northern Canada and Alaska, making North America the continent with the largest area of this biome."),
            zh = LocalizedContent("哪个大陆苔原最多？", listOf("亚洲", "北美洲", "南极洲", "大洋洲"), "地理", "北极苔原覆盖了加拿大北部和阿拉斯加的大片区域，使北美洲成为拥有最大面积苔原的大陆。"),
            es = LocalizedContent("¿Qué continente tiene más tundra?", listOf("Asia", "América del Norte", "Antártida", "Oceanía"), "Geografía", "La tundra ártica cubre una vasta parte del norte de Canadá y Alaska, lo que convierte a América del Norte en el continente con la mayor superficie de este bioma.")
        ),
        BilingualQuestion(
            id = 9868, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le continent avec le plus de lacs d'eau douce?", listOf("Asie", "Amérique du Nord", "Europe", "Afrique"), "Géographie", "L'Amérique du Nord abrite plus de lacs d'eau douce que tous les autres continents réunis, principalement en raison des glaciers qui ont creusé des bassins lacustres lors de la dernière période glaciaire."),
            en = LocalizedContent("Which continent has the most freshwater lakes?", listOf("Asia", "North America", "Europe", "Africa"), "Geography", "North America has more freshwater lakes than all other continents combined, mainly due to glaciers that carved out lake basins during the last ice age."),
            zh = LocalizedContent("哪个大陆淡水湖最多？", listOf("亚洲", "北美洲", "欧洲", "非洲"), "地理", "北美洲的淡水湖数量超过其他所有大陆的总和，这主要归因于上次冰河时期冰川侵蚀形成的湖盆。"),
            es = LocalizedContent("¿Qué continente tiene más lagos de agua dulce?", listOf("Asia", "América del Norte", "Europa", "África"), "Geografía", "América del Norte alberga más lagos de agua dulce que todos los demás continentes juntos, principalmente debido a los glaciares que excavaron cuencas lacustres durante la última glaciación.")
        ),
        BilingualQuestion(
            id = 9869, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le continent avec le plus de rivières?", listOf("Asie", "Amérique du Sud", "Afrique", "Océanie"), "Géographie", "L'Amérique du Sud abrite le bassin amazonien, le plus vaste réseau fluvial du monde, avec des milliers d'affluents comme l'Amazone, l'Orénoque et le Paraná."),
            en = LocalizedContent("Which continent has the most rivers?", listOf("Asia", "South America", "Africa", "Oceania"), "Geography", "South America is home to the Amazon basin, the largest river network in the world, with thousands of tributaries such as the Amazon, Orinoco, and Paraná."),
            zh = LocalizedContent("哪个大陆河流最多？", listOf("亚洲", "南美洲", "非洲", "大洋洲"), "地理", "南美洲拥有亚马逊盆地，这是世界上最大的河流网络，有数千条支流，如亚马逊河、奥里诺科河和巴拉那河。"),
            es = LocalizedContent("¿Qué continente tiene más ríos?", listOf("Asia", "América del Sur", "África", "Oceanía"), "Geografía", "América del Sur alberga la cuenca del Amazonas, la red fluvial más grande del mundo, con miles de afluentes como el Amazonas, el Orinoco y el Paraná.")
        ),
        BilingualQuestion(
            id = 9870, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le continent avec le plus de côtes?", listOf("Asie", "Océanie", "Amérique du Nord", "Afrique"), "Géographie", "L'Asie possède le plus long littoral du monde, avec environ 62 000 kilomètres de côtes, en raison de sa vaste superficie et de ses nombreuses péninsules et îles."),
            en = LocalizedContent("Which continent has the most coastline?", listOf("Asia", "Oceania", "North America", "Africa"), "Geography", "Asia has the longest coastline in the world, with approximately 62,000 kilometers of coast, due to its vast area and numerous peninsulas and islands."),
            zh = LocalizedContent("哪个大陆的海岸线最长？", listOf("亚洲", "大洋洲", "北美洲", "非洲"), "地理", "亚洲拥有世界上最长的海岸线，约62,000公里，这得益于其广阔的面积以及众多的半岛和岛屿。"),
            es = LocalizedContent("¿Qué continente tiene la costa más larga?", listOf("Asia", "Oceanía", "América del Norte", "África"), "Geografía", "Asia tiene la costa más larga del mundo, con aproximadamente 62.000 kilómetros, debido a su vasta superficie y sus numerosas penínsulas e islas.")
        ),
        BilingualQuestion(
            id = 9871, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le continent avec le plus d'îles?", listOf("Asie", "Océanie", "Europe", "Afrique"), "Géographie", "L'Asie possède le plus grand nombre d'îles au monde, notamment grâce à des archipels comme l'Indonésie, les Philippines et le Japon, qui comptent des milliers d'îles chacun."),
            en = LocalizedContent("Which continent has the most islands?", listOf("Asia", "Oceania", "Europe", "Africa"), "Geography", "Asia has the largest number of islands in the world, especially thanks to archipelagos like Indonesia, the Philippines, and Japan, each comprising thousands of islands."),
            zh = LocalizedContent("哪个大陆的岛屿最多？", listOf("亚洲", "大洋洲", "欧洲", "非洲"), "地理", "亚洲拥有世界上最多的岛屿，特别是得益于印度尼西亚、菲律宾和日本等群岛，每个群岛都包含数千个岛屿。"),
            es = LocalizedContent("¿Qué continente tiene más islas?", listOf("Asia", "Oceanía", "Europa", "África"), "Geografía", "Asia tiene el mayor número de islas del mundo, especialmente gracias a archipiélagos como Indonesia, Filipinas y Japón, cada uno con miles de islas.")
        ),
        BilingualQuestion(
            id = 9872, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le continent avec la plus grande biodiversité?", listOf("Asie", "Afrique", "Amérique du Sud", "Océanie"), "Géographie", "L'Amérique du Sud abrite la plus grande biodiversité mondiale grâce à l'Amazonie, qui couvre près de 40% du continent et concentre une immense variété d'espèces animales et végétales."),
            en = LocalizedContent("Which continent has the greatest biodiversity?", listOf("Asia", "Africa", "South America", "Oceania"), "Geography", "South America hosts the world's greatest biodiversity thanks to the Amazon, which covers nearly 40% of the continent and concentrates an immense variety of animal and plant species."),
            zh = LocalizedContent("哪个大陆的生物多样性最丰富？", listOf("亚洲", "非洲", "南美洲", "大洋洲"), "地理", "南美洲拥有世界上最丰富的生物多样性，这得益于亚马逊雨林，它覆盖了该大陆近40%的面积，并集中了极其多样的动植物物种。"),
            es = LocalizedContent("¿Qué continente tiene la mayor biodiversidad?", listOf("Asia", "África", "América del Sur", "Oceanía"), "Geografía", "América del Sur alberga la mayor biodiversidad del mundo gracias al Amazonas, que cubre casi el 40% del continente y concentra una inmensa variedad de especies animales y vegetales.")
        ),
        BilingualQuestion(
            id = 9873, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le continent avec le plus d'espèces menacées?", listOf("Asie", "Afrique", "Amérique du Sud", "Océanie"), "Géographie", "L'Asie abrite la plus grande diversité d'espèces animales et végétales, mais aussi les pressions humaines les plus fortes, comme la déforestation et le braconnage, ce qui en fait le continent comptant le plus d'espèces menacées."),
            en = LocalizedContent("Which continent has the most threatened species?", listOf("Asia", "Africa", "South America", "Oceania"), "Geography", "Asia hosts the greatest diversity of animal and plant species, but also the strongest human pressures such as deforestation and poaching, making it the continent with the most threatened species."),
            zh = LocalizedContent("哪个大陆的受威胁物种最多？", listOf("亚洲", "非洲", "南美洲", "大洋洲"), "地理", "亚洲拥有最丰富的动植物物种多样性，但也面临最强烈的人类压力，如森林砍伐和偷猎，这使其成为受威胁物种最多的大陆。"),
            es = LocalizedContent("¿Qué continente tiene más especies amenazadas?", listOf("Asia", "África", "América del Sur", "Oceanía"), "Geografía", "Asia alberga la mayor diversidad de especies animales y vegetales, pero también las presiones humanas más fuertes, como la deforestación y la caza furtiva, lo que la convierte en el continente con más especies amenazadas.")
        ),
        BilingualQuestion(
            id = 9874, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le continent le plus riche en minéraux?", listOf("Asie", "Afrique", "Amérique du Sud", "Océanie"), "Géographie", "L'Afrique possède d'importants gisements de diamants, d'or, de cobalt et de coltan, ce qui en fait le continent le plus riche en ressources minérales."),
            en = LocalizedContent("Which continent is richest in minerals?", listOf("Asia", "Africa", "South America", "Oceania"), "Geography", "Africa has significant deposits of diamonds, gold, cobalt, and coltan, making it the continent richest in mineral resources."),
            zh = LocalizedContent("哪个大陆的矿产资源最丰富？", listOf("亚洲", "非洲", "南美洲", "大洋洲"), "地理", "非洲拥有丰富的钻石、黄金、钴和钽铁矿等矿藏，使其成为矿产资源最丰富的大陆。"),
            es = LocalizedContent("¿Qué continente es más rico en minerales?", listOf("Asia", "África", "América del Sur", "Oceanía"), "Geografía", "África posee importantes yacimientos de diamantes, oro, cobalto y coltán, lo que la convierte en el continente más rico en recursos minerales.")
        ),
        BilingualQuestion(
            id = 9875, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le continent le plus riche en pétrole?", listOf("Asie", "Afrique", "Amérique du Sud", "Océanie"), "Géographie", "L'Asie, et plus précisément le Moyen-Orient, concentre les plus grandes réserves prouvées de pétrole, notamment en Arabie saoudite, en Irak et au Koweït."),
            en = LocalizedContent("Which continent is richest in oil?", listOf("Asia", "Africa", "South America", "Oceania"), "Geography", "Asia, specifically the Middle East, holds the largest proven oil reserves, notably in Saudi Arabia, Iraq, and Kuwait."),
            zh = LocalizedContent("哪个大陆的石油资源最丰富？", listOf("亚洲", "非洲", "南美洲", "大洋洲"), "地理", "亚洲，特别是中东地区，拥有最大的已探明石油储量，主要分布在沙特阿拉伯、伊拉克和科威特。"),
            es = LocalizedContent("¿Qué continente es más rico en petróleo?", listOf("Asia", "África", "América del Sur", "Oceanía"), "Geografía", "Asia, y más concretamente Oriente Medio, concentra las mayores reservas probadas de petróleo, especialmente en Arabia Saudí, Irak y Kuwait.")
        ),
        BilingualQuestion(
            id = 9876, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le continent le plus riche en gaz naturel?", listOf("Asie", "Afrique", "Amérique du Sud", "Océanie"), "Géographie", "L'Asie, notamment via le Qatar, l’Iran et la Russie, détient les plus grandes réserves prouvées de gaz naturel au monde."),
            en = LocalizedContent("Which continent is richest in natural gas?", listOf("Asia", "Africa", "South America", "Oceania"), "Geography", "Asia, particularly through Qatar, Iran, and Russia, holds the largest proven natural gas reserves in the world."),
            zh = LocalizedContent("哪个大陆的天然气资源最丰富？", listOf("亚洲", "非洲", "南美洲", "大洋洲"), "地理", "亚洲，尤其是卡塔尔、伊朗和俄罗斯，拥有世界上最大的已探明天然气储量。"),
            es = LocalizedContent("¿Qué continente es más rico en gas natural?", listOf("Asia", "África", "América del Sur", "Oceanía"), "Geografía", "Asia, especialmente a través de Catar, Irán y Rusia, posee las mayores reservas probadas de gas natural del mundo.")
        ),
        BilingualQuestion(
            id = 9877, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le continent le plus riche en métaux précieux?", listOf("Asie", "Afrique", "Amérique du Sud", "Amérique du Nord"), "Géographie", "L'Afrique possède d'importants gisements d'or, de diamants et de platine, notamment en Afrique du Sud, au Botswana et en République démocratique du Congo."),
            en = LocalizedContent("Which continent is richest in precious metals?", listOf("Asia", "Africa", "South America", "North America"), "Geography", "Africa has significant deposits of gold, diamonds, and platinum, especially in South Africa, Botswana, and the Democratic Republic of the Congo."),
            zh = LocalizedContent("哪个大陆的贵金属资源最丰富？", listOf("亚洲", "非洲", "南美洲", "北美洲"), "地理", "非洲拥有丰富的黄金、钻石和铂金矿藏，特别是在南非、博茨瓦纳和刚果民主共和国。"),
            es = LocalizedContent("¿Qué continente es más rico en metales preciosos?", listOf("Asia", "África", "América del Sur", "América del Norte"), "Geografía", "África posee importantes yacimientos de oro, diamantes y platino, especialmente en Sudáfrica, Botsuana y la República Democrática del Congo.")
        ),
        BilingualQuestion(
            id = 9878, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le continent le plus riche en ressources agricoles?", listOf("Asie", "Afrique", "Amérique du Sud", "Amérique du Nord"), "Géographie", "L'Amérique du Sud possède d'immenses terres fertiles comme le Cerrado brésilien et la Pampa argentine, et est un leader mondial pour le soja, le café et la viande bovine."),
            en = LocalizedContent("Which continent is richest in agricultural resources?", listOf("Asia", "Africa", "South America", "North America"), "Geography", "South America has vast fertile lands like the Brazilian Cerrado and the Argentine Pampas, and is a global leader in soybeans, coffee, and beef."),
            zh = LocalizedContent("哪个大陆的农业资源最丰富？", listOf("亚洲", "非洲", "南美洲", "北美洲"), "地理", "南美洲拥有广阔的肥沃土地，如巴西的塞拉多和阿根廷的潘帕斯草原，并且是大豆、咖啡和牛肉的全球领导者。"),
            es = LocalizedContent("¿Qué continente es más rico en recursos agrícolas?", listOf("Asia", "África", "América del Sur", "América del Norte"), "Geografía", "América del Sur posee vastas tierras fértiles como el Cerrado brasileño y la Pampa argentina, y es líder mundial en soja, café y carne de vacuno.")
        ),
        BilingualQuestion(
            id = 9879, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le continent le plus riche en ressources hydrologiques?", listOf("Asie", "Afrique", "Amérique du Sud", "Amérique du Nord"), "Géographie", "L'Amérique du Sud possède le plus grand fleuve du monde en volume d'eau, l'Amazone, ainsi que d'immenses nappes phréatiques comme l'aquifère Guarani."),
            en = LocalizedContent("Which continent is richest in hydrological resources?", listOf("Asia", "Africa", "South America", "North America"), "Geography", "South America has the largest river in the world by water volume, the Amazon, as well as immense aquifers like the Guarani Aquifer."),
            zh = LocalizedContent("哪个大陆的水资源最丰富？", listOf("亚洲", "非洲", "南美洲", "北美洲"), "地理", "南美洲拥有世界上水量最大的河流——亚马逊河，以及巨大的含水层，如瓜拉尼含水层。"),
            es = LocalizedContent("¿Qué continente es más rico en recursos hidrológicos?", listOf("Asia", "África", "América del Sur", "América del Norte"), "Geografía", "América del Sur tiene el río más grande del mundo en volumen de agua, el Amazonas, así como inmensos acuíferos como el Acuífero Guaraní.")
        ),
        BilingualQuestion(
            id = 9880, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le continent le plus riche en ressources éoliennes?", listOf("Asie", "Amérique du Nord", "Europe", "Océanie"), "Géographie", "L'Amérique du Nord possède les plus vastes étendues de plaines et de côtes exposées à des vents forts et constants, notamment dans les Grandes Plaines et au large des côtes atlantiques."),
            en = LocalizedContent("Which continent is the richest in wind energy resources?", listOf("Asia", "North America", "Europe", "Oceania"), "Geography", "North America has the largest expanses of plains and coasts exposed to strong and constant winds, especially in the Great Plains and off the Atlantic coasts."),
            zh = LocalizedContent("哪个大陆的风能资源最丰富？", listOf("亚洲", "北美洲", "欧洲", "大洋洲"), "地理", "北美洲拥有最广阔的平原和海岸线，暴露在强劲而持续的风中，特别是在大平原和大西洋沿岸。"),
            es = LocalizedContent("¿Qué continente es el más rico en recursos eólicos?", listOf("Asia", "América del Norte", "Europa", "Oceanía"), "Geografía", "América del Norte posee las mayores extensiones de llanuras y costas expuestas a vientos fuertes y constantes, especialmente en las Grandes Llanuras y frente a las costas atlánticas.")
        ),
        BilingualQuestion(
            id = 9881, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le continent le plus riche en ressources solaires?", listOf("Asie", "Afrique", "Amérique du Sud", "Océanie"), "Géographie", "L'Afrique reçoit le plus d'heures d'ensoleillement par an de tous les continents, avec un potentiel solaire particulièrement élevé dans le désert du Sahara."),
            en = LocalizedContent("Which continent is the richest in solar energy resources?", listOf("Asia", "Africa", "South America", "Oceania"), "Geography", "Africa receives the most hours of sunshine per year of all continents, with particularly high solar potential in the Sahara Desert."),
            zh = LocalizedContent("哪个大陆的太阳能资源最丰富？", listOf("亚洲", "非洲", "南美洲", "大洋洲"), "地理", "非洲每年接受的日照时数最多，撒哈拉沙漠的太阳能潜力尤其高。"),
            es = LocalizedContent("¿Qué continente es el más rico en recursos solares?", listOf("Asia", "África", "América del Sur", "Oceanía"), "Geografía", "África recibe la mayor cantidad de horas de sol al año de todos los continentes, con un potencial solar particularmente alto en el desierto del Sahara.")
        ),
        BilingualQuestion(
            id = 9882, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le continent le plus riche en ressources géothermales?", listOf("Asie", "Amérique du Nord", "Europe", "Océanie"), "Géographie", "L'Asie possède la plus grande concentration de volcans et de zones tectoniques actives, notamment dans la ceinture de feu du Pacifique, ce qui en fait le continent le plus riche en ressources géothermales."),
            en = LocalizedContent("Which continent is the richest in geothermal resources?", listOf("Asia", "North America", "Europe", "Oceania"), "Geography", "Asia has the highest concentration of volcanoes and active tectonic zones, especially in the Pacific Ring of Fire, making it the continent richest in geothermal resources."),
            zh = LocalizedContent("哪个大陆的地热资源最丰富？", listOf("亚洲", "北美洲", "欧洲", "大洋洲"), "地理", "亚洲拥有最集中的火山和活跃构造带，特别是在环太平洋火山带，使其成为地热资源最丰富的大陆。"),
            es = LocalizedContent("¿Qué continente es el más rico en recursos geotérmicos?", listOf("Asia", "América del Norte", "Europa", "Oceanía"), "Geografía", "Asia posee la mayor concentración de volcanes y zonas tectónicas activas, especialmente en el cinturón de fuego del Pacífico, lo que la convierte en el continente más rico en recursos geotérmicos.")
        ),
        BilingualQuestion(
            id = 9883, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le continent le plus développé?", listOf("Asie", "Afrique", "Europe", "Océanie"), "Géographie", "L'Europe est considérée comme le continent le plus développé en raison de son indice de développement humain élevé, de son économie avancée et de ses infrastructures modernes."),
            en = LocalizedContent("Which continent is the most developed?", listOf("Asia", "Africa", "Europe", "Oceania"), "Geography", "Europe is considered the most developed continent due to its high Human Development Index, advanced economy, and modern infrastructure."),
            zh = LocalizedContent("哪个大陆最发达？", listOf("亚洲", "非洲", "欧洲", "大洋洲"), "地理", "欧洲被认为是最发达的大陆，因为其人类发展指数高、经济先进、基础设施现代化。"),
            es = LocalizedContent("¿Qué continente es el más desarrollado?", listOf("Asia", "África", "Europa", "Oceanía"), "Geografía", "Europa es considerada el continente más desarrollado debido a su alto índice de desarrollo humano, economía avanzada e infraestructura moderna.")
        ),
        BilingualQuestion(
            id = 9884, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le continent le moins développé?", listOf("Asie", "Afrique", "Amérique du Sud", "Océanie"), "Géographie", "L'Afrique est considérée comme le continent le moins développé en raison de ses faibles indicateurs économiques, sociaux et d'infrastructures, comme le PIB par habitant et l'accès aux soins."),
            en = LocalizedContent("Which continent is the least developed?", listOf("Asia", "Africa", "South America", "Oceania"), "Geography", "Africa is considered the least developed continent due to its low economic, social, and infrastructure indicators, such as GDP per capita and access to healthcare."),
            zh = LocalizedContent("哪个大陆最不发达？", listOf("亚洲", "非洲", "南美洲", "大洋洲"), "地理", "非洲被认为是最不发达的大陆，因为其经济、社会和基础设施指标较低，如人均GDP和医疗保健可及性。"),
            es = LocalizedContent("¿Qué continente es el menos desarrollado?", listOf("Asia", "África", "América del Sur", "Oceanía"), "Geografía", "África es considerada el continente menos desarrollado debido a sus bajos indicadores económicos, sociales y de infraestructura, como el PIB per cápita y el acceso a la atención médica.")
        ),
        BilingualQuestion(
            id = 9885, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le continent avec le plus grand PIB?", listOf("Asie", "Afrique", "Europe", "Amérique du Nord"), "Géographie", "L'Asie abrite des économies majeures comme la Chine, le Japon et l'Inde, ce qui lui confère le PIB total le plus élevé, dépassant l'Amérique du Nord et l'Europe."),
            en = LocalizedContent("Which continent has the highest GDP?", listOf("Asia", "Africa", "Europe", "North America"), "Geography", "Asia is home to major economies like China, Japan, and India, giving it the highest total GDP, surpassing North America and Europe."),
            zh = LocalizedContent("哪个大陆的GDP最高？", listOf("亚洲", "非洲", "欧洲", "北美洲"), "地理", "亚洲拥有中国、日本和印度等主要经济体，因此GDP总量最高，超过北美洲和欧洲。"),
            es = LocalizedContent("¿Qué continente tiene el PIB más alto?", listOf("Asia", "África", "Europa", "América del Norte"), "Geografía", "Asia alberga economías importantes como China, Japón e India, lo que le otorga el PIB total más alto, superando a América del Norte y Europa.")
        ),
        BilingualQuestion(
            id = 9886, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le continent avec le plus petit PIB?", listOf("Asie", "Afrique", "Océanie", "Antarctique"), "Géographie", "L'Océanie a le plus petit PIB total en raison de sa faible population et de ses économies insulaires peu industrialisées, loin derrière les autres continents."),
            en = LocalizedContent("Which continent has the lowest GDP?", listOf("Asia", "Africa", "Oceania", "Antarctica"), "Geography", "Oceania has the lowest total GDP due to its small population and less industrialized island economies, far behind other continents."),
            zh = LocalizedContent("哪个大陆的GDP最低？", listOf("亚洲", "非洲", "大洋洲", "南极洲"), "地理", "大洋洲的GDP总量最低，因为人口少，岛屿经济工业化程度低，远落后于其他大陆。"),
            es = LocalizedContent("¿Qué continente tiene el PIB más bajo?", listOf("Asia", "África", "Oceanía", "Antártida"), "Geografía", "Oceanía tiene el PIB total más bajo debido a su pequeña población y economías insulares poco industrializadas, muy por detrás de otros continentes.")
        ),
        BilingualQuestion(
            id = 9887, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le continent avec le plus grand PIB par capita?", listOf("Asie", "Europe", "Amérique du Nord", "Océanie"), "Géographie", "L'Amérique du Nord possède le PIB par habitant le plus élevé grâce aux économies puissantes des États-Unis et du Canada, ainsi qu'à leur forte productivité et leurs ressources abondantes."),
            en = LocalizedContent("Which continent has the highest GDP per capita?", listOf("Asia", "Europe", "North America", "Oceania"), "Geography", "North America has the highest GDP per capita thanks to the powerful economies of the United States and Canada, as well as their high productivity and abundant resources."),
            zh = LocalizedContent("哪个大陆的人均GDP最高？", listOf("亚洲", "欧洲", "北美洲", "大洋洲"), "地理", "北美洲的人均GDP最高，这得益于美国和加拿大的强大经济、高生产力和丰富的资源。"),
            es = LocalizedContent("¿Qué continente tiene el PIB per cápita más alto?", listOf("Asia", "Europa", "América del Norte", "Oceanía"), "Geografía", "América del Norte tiene el PIB per cápita más alto gracias a las poderosas economías de Estados Unidos y Canadá, así como a su alta productividad y abundantes recursos.")
        ),
        BilingualQuestion(
            id = 9888, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le continent avec le plus petit PIB par capita?", listOf("Asie", "Afrique", "Amérique du Sud", "Océanie"), "Géographie", "L'Afrique a le PIB par capita le plus faible en raison de nombreux pays en développement, de conflits et d'une infrastructure économique limitée."),
            en = LocalizedContent("Which continent has the lowest GDP per capita?", listOf("Asia", "Africa", "South America", "Oceania"), "Geography", "Africa has the lowest GDP per capita due to many developing countries, conflicts, and limited economic infrastructure."),
            zh = LocalizedContent("哪个大陆的人均GDP最低？", listOf("亚洲", "非洲", "南美洲", "大洋洲"), "地理", "非洲的人均GDP最低，因为许多发展中国家、冲突和经济基础设施有限。"),
            es = LocalizedContent("¿Qué continente tiene el PIB per cápita más bajo?", listOf("Asia", "África", "América del Sur", "Oceanía"), "Geografía", "África tiene el PIB per cápita más bajo debido a muchos países en desarrollo, conflictos e infraestructura económica limitada.")
        ),
        BilingualQuestion(
            id = 9889, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le continent avec le plus grand commerce international?", listOf("Asie", "Europe", "Amérique du Nord", "Océanie"), "Géographie", "L'Asie domine le commerce international grâce à des puissances économiques comme la Chine et le Japon, et abrite les plus grands ports du monde."),
            en = LocalizedContent("Which continent has the largest international trade?", listOf("Asia", "Europe", "North America", "Oceania"), "Geography", "Asia dominates international trade thanks to economic powers like China and Japan, and is home to the world's largest ports."),
            zh = LocalizedContent("哪个大陆的国际贸易量最大？", listOf("亚洲", "欧洲", "北美洲", "大洋洲"), "地理", "亚洲主导国际贸易，得益于中国和日本等经济强国，并拥有世界上最大的港口。"),
            es = LocalizedContent("¿Qué continente tiene el mayor comercio internacional?", listOf("Asia", "Europa", "América del Norte", "Oceanía"), "Geografía", "Asia domina el comercio internacional gracias a potencias económicas como China y Japón, y alberga los puertos más grandes del mundo.")
        ),
        BilingualQuestion(
            id = 9890, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le continent avec le plus petit commerce international?", listOf("Asie", "Afrique", "Océanie", "Antarctique"), "Géographie", "L'Océanie regroupe des îles dispersées et peu peuplées, avec des économies souvent isolées et de petite taille, ce qui limite son volume d'échanges mondiaux."),
            en = LocalizedContent("Which continent has the smallest international trade?", listOf("Asia", "Africa", "Oceania", "Antarctica"), "Geography", "Oceania consists of scattered, sparsely populated islands with often isolated and small economies, limiting its global trade volume."),
            zh = LocalizedContent("哪个大陆的国际贸易最少？", listOf("亚洲", "非洲", "大洋洲", "南极洲"), "地理", "大洋洲由分散、人口稀少的岛屿组成，经济往往孤立且规模小，限制了其全球贸易量。"),
            es = LocalizedContent("¿Qué continente tiene el menor comercio internacional?", listOf("Asia", "África", "Oceanía", "Antártida"), "Geografía", "Oceanía está formada por islas dispersas y poco pobladas, con economías a menudo aisladas y de pequeño tamaño, lo que limita su volumen de intercambios mundiales.")
        ),
        BilingualQuestion(
            id = 9891, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le continent avec le plus de routes?", listOf("Asie", "Europe", "Amérique du Nord", "Afrique"), "Géographie", "L'Europe possède le réseau routier le plus dense au monde, avec des infrastructures très développées dans la plupart de ses pays."),
            en = LocalizedContent("Which continent has the most roads?", listOf("Asia", "Europe", "North America", "Africa"), "Geography", "Europe has the densest road network in the world, with highly developed infrastructure in most of its countries."),
            zh = LocalizedContent("哪个大陆的公路最多？", listOf("亚洲", "欧洲", "北美洲", "非洲"), "地理", "欧洲拥有世界上最密集的公路网，大多数国家的基础设施非常发达。"),
            es = LocalizedContent("¿Qué continente tiene más carreteras?", listOf("Asia", "Europa", "América del Norte", "África"), "Geografía", "Europa posee la red de carreteras más densa del mundo, con infraestructuras muy desarrolladas en la mayoría de sus países.")
        ),
        BilingualQuestion(
            id = 9892, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le continent avec le moins de routes?", listOf("Asie", "Afrique", "Océanie", "Antarctique"), "Géographie", "L'Antarctique est un continent inhabité en permanence, sans réseau routier organisé, à l'exception de quelques pistes temporaires près des bases scientifiques."),
            en = LocalizedContent("Which continent has the fewest roads?", listOf("Asia", "Africa", "Oceania", "Antarctica"), "Geography", "Antarctica is a permanently uninhabited continent, with no organized road network, except for some temporary tracks near scientific bases."),
            zh = LocalizedContent("哪个大陆的公路最少？", listOf("亚洲", "非洲", "大洋洲", "南极洲"), "地理", "南极洲是一个永久无人居住的大陆，没有有组织的公路网，除了科学基地附近的一些临时道路。"),
            es = LocalizedContent("¿Qué continente tiene menos carreteras?", listOf("Asia", "África", "Oceanía", "Antártida"), "Geografía", "La Antártida es un continente permanentemente deshabitado, sin una red de carreteras organizada, excepto algunas pistas temporales cerca de las bases científicas.")
        ),
        BilingualQuestion(
            id = 9893, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le continent avec le plus de chemins de fer?", listOf("Asie", "Europe", "Amérique du Nord", "Afrique"), "Géographie", "L'Amérique du Nord possède le plus long réseau ferroviaire au monde, notamment grâce aux États-Unis qui comptent environ 250 000 km de voies ferrées, principalement utilisées pour le transport de marchandises."),
            en = LocalizedContent("Which continent has the most railways?", listOf("Asia", "Europe", "North America", "Africa"), "Geography", "North America has the longest railway network in the world, especially thanks to the United States, which has about 250,000 km of tracks, mainly used for freight transport."),
            zh = LocalizedContent("哪个大陆的铁路最多？", listOf("亚洲", "欧洲", "北美洲", "非洲"), "地理", "北美洲拥有世界上最长的铁路网，尤其是美国，约有25万公里的轨道，主要用于货运。"),
            es = LocalizedContent("¿Qué continente tiene más ferrocarriles?", listOf("Asia", "Europa", "América del Norte", "África"), "Geografía", "América del Norte posee la red ferroviaria más larga del mundo, especialmente gracias a Estados Unidos, que cuenta con unos 250.000 km de vías, utilizadas principalmente para el transporte de mercancías.")
        ),
        BilingualQuestion(
            id = 9894, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le continent avec le moins de chemins de fer?", listOf("Asie", "Afrique", "Océanie", "Antarctique"), "Géographie", "L'Antarctique est un continent inhabité en permanence, sans réseau ferroviaire significatif, contrairement aux autres continents qui possèdent des infrastructures de transport développées."),
            en = LocalizedContent("Which continent has the fewest railways?", listOf("Asia", "Africa", "Oceania", "Antarctica"), "Geography", "Antarctica is a permanently uninhabited continent, with no significant railway network, unlike other continents that have developed transport infrastructure."),
            zh = LocalizedContent("哪个大陆的铁路最少？", listOf("亚洲", "非洲", "大洋洲", "南极洲"), "地理", "南极洲是一个永久无人居住的大陆，没有重要的铁路网，而其他大陆拥有发达的交通基础设施。"),
            es = LocalizedContent("¿Qué continente tiene menos ferrocarriles?", listOf("Asia", "África", "Oceanía", "Antártida"), "Geografía", "La Antártida es un continente permanentemente deshabitado, sin una red ferroviaria significativa, a diferencia de otros continentes que poseen infraestructuras de transporte desarrolladas.")
        ),
        BilingualQuestion(
            id = 9895, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le continent avec le plus d'aéroports?", listOf("Asie", "Europe", "Amérique du Nord", "Afrique"), "Géographie", "L'Amérique du Nord possède le plus grand nombre d'aéroports au monde, notamment grâce aux États-Unis, qui comptent à eux seuls des milliers d'aéroports, dont les plus fréquentés comme Atlanta et Chicago."),
            en = LocalizedContent("Which continent has the most airports?", listOf("Asia", "Europe", "North America", "Africa"), "Geography", "North America has the largest number of airports in the world, especially thanks to the United States, which alone has thousands of airports, including the busiest like Atlanta and Chicago."),
            zh = LocalizedContent("哪个大陆的机场最多？", listOf("亚洲", "欧洲", "北美洲", "非洲"), "地理", "北美洲拥有世界上最多的机场，尤其是美国，仅美国就有数千个机场，包括最繁忙的亚特兰大和芝加哥。"),
            es = LocalizedContent("¿Qué continente tiene más aeropuertos?", listOf("Asia", "Europa", "América del Norte", "África"), "Geografía", "América del Norte posee el mayor número de aeropuertos del mundo, especialmente gracias a Estados Unidos, que solo cuenta con miles de aeropuertos, incluidos los más transitados como Atlanta y Chicago.")
        ),
        BilingualQuestion(
            id = 9896, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le continent avec le moins d'aéroports?", listOf("Asie", "Afrique", "Océanie", "Antarctique"), "Géographie", "L'Antarctique compte très peu d'aéroports en raison de son climat extrême et de l'absence de population permanente, avec principalement des pistes de glace utilisées pour la recherche scientifique."),
            en = LocalizedContent("Which continent has the fewest airports?", listOf("Asia", "Africa", "Oceania", "Antarctica"), "Geography", "Antarctica has very few airports due to its extreme climate and lack of permanent population, with mainly ice runways used for scientific research."),
            zh = LocalizedContent("哪个大陆的机场最少？", listOf("亚洲", "非洲", "大洋洲", "南极洲"), "地理", "南极洲由于极端气候和缺乏永久人口，机场很少，主要是用于科学研究的冰跑道。"),
            es = LocalizedContent("¿Qué continente tiene menos aeropuertos?", listOf("Asia", "África", "Oceanía", "Antártida"), "Geografía", "La Antártida cuenta con muy pocos aeropuertos debido a su clima extremo y la ausencia de población permanente, con principalmente pistas de hielo utilizadas para la investigación científica.")
        ),
        BilingualQuestion(
            id = 9897, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le continent avec le plus de ports?", listOf("Asie", "Europe", "Amérique du Nord", "Afrique"), "Géographie", "L'Asie abrite les plus grands ports du monde, comme Shanghai et Singapour, et concentre plus de la moitié du trafic maritime mondial en raison de son rôle central dans le commerce international."),
            en = LocalizedContent("Which continent has the most ports?", listOf("Asia", "Europe", "North America", "Africa"), "Geography", "Asia is home to the world's largest ports, such as Shanghai and Singapore, and handles more than half of global maritime traffic due to its central role in international trade."),
            zh = LocalizedContent("哪个大陆的港口最多？", listOf("亚洲", "欧洲", "北美洲", "非洲"), "地理", "亚洲拥有世界上最大的港口，如上海和新加坡，由于其在国际贸易中的核心作用，处理了全球一半以上的海上交通。"),
            es = LocalizedContent("¿Qué continente tiene más puertos?", listOf("Asia", "Europa", "América del Norte", "África"), "Geografía", "Asia alberga los puertos más grandes del mundo, como Shanghái y Singapur, y concentra más de la mitad del tráfico marítimo mundial debido a su papel central en el comercio internacional.")
        ),
        BilingualQuestion(
            id = 9898, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le continent avec le moins de ports?", listOf("Asie", "Afrique", "Océanie", "Antarctique"), "Géographie", "L'Antarctique est presque entièrement entouré de glace et de banquise, ce qui rend la construction et l'exploitation de ports extrêmement difficiles, contrairement aux autres continents habités."),
            en = LocalizedContent("Which continent has the fewest ports?", listOf("Asia", "Africa", "Oceania", "Antarctica"), "Geography", "Antarctica is almost entirely surrounded by ice and pack ice, making the construction and operation of ports extremely difficult, unlike other inhabited continents."),
            zh = LocalizedContent("哪个大陆的港口最少？", listOf("亚洲", "非洲", "大洋洲", "南极洲"), "地理", "南极洲几乎完全被冰和浮冰包围，使得港口的建设和运营极其困难，而其他有人居住的大陆则不然。"),
            es = LocalizedContent("¿Qué continente tiene menos puertos?", listOf("Asia", "África", "Oceanía", "Antártida"), "Geografía", "La Antártida está casi completamente rodeada de hielo y banquisa, lo que hace que la construcción y explotación de puertos sea extremadamente difícil, a diferencia de otros continentes habitados.")
        ),
        BilingualQuestion(
            id = 9899, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le continent avec le plus de frontières internationales?", listOf("Asie", "Afrique", "Europe", "Amérique"), "Géographie", "L'Asie compte 57 pays et de nombreuses chaînes de montagnes, fleuves et zones historiques qui créent un grand nombre de frontières terrestres, dépassant tous les autres continents."),
            en = LocalizedContent("Which continent has the most international borders?", listOf("Asia", "Africa", "Europe", "America"), "Geography", "Asia has 57 countries and many mountain ranges, rivers, and historical areas that create a large number of land borders, surpassing all other continents."),
            zh = LocalizedContent("哪个大陆的国界最多？", listOf("亚洲", "非洲", "欧洲", "美洲"), "地理", "亚洲有57个国家，许多山脉、河流和历史区域创造了大量的陆地边界，超过了所有其他大陆。"),
            es = LocalizedContent("¿Qué continente tiene más fronteras internacionales?", listOf("Asia", "África", "Europa", "América"), "Geografía", "Asia cuenta con 57 países y numerosas cadenas montañosas, ríos y zonas históricas que crean un gran número de fronteras terrestres, superando a todos los demás continentes.")
        ),
        BilingualQuestion(
            id = 9900, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le continent avec le moins de frontières internationales?", listOf("Asie", "Afrique", "Océanie", "Antarctique"), "Géographie", "L'Antarctique n'a pas de frontières internationales car il est régi par le Traité sur l'Antarctique, qui gèle les revendications territoriales et interdit toute activité militaire."),
            en = LocalizedContent("Which continent has the fewest international borders?", listOf("Asia", "Africa", "Oceania", "Antarctica"), "Geography", "Antarctica has no international borders as it is governed by the Antarctic Treaty, which freezes territorial claims and prohibits military activity."),
            zh = LocalizedContent("哪个大陆的国际边界最少？", listOf("亚洲", "非洲", "大洋洲", "南极洲"), "地理", "南极洲没有国际边界，因为它受《南极条约》管辖，该条约冻结了领土主张并禁止军事活动。"),
            es = LocalizedContent("¿Qué continente tiene menos fronteras internacionales?", listOf("Asia", "África", "Oceanía", "Antártida"), "Geografía", "La Antártida no tiene fronteras internacionales, ya que está regida por el Tratado Antártico, que congela las reclamaciones territoriales y prohíbe cualquier actividad militar.")
        ),
        BilingualQuestion(
            id = 9901, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le continent avec le plus de zones protégées?", listOf("Asie", "Afrique", "Amérique du Nord", "Europe"), "Géographie", "L'Amérique du Nord compte le plus grand nombre de zones protégées au monde, incluant de vastes parcs nationaux comme ceux des États-Unis et du Canada."),
            en = LocalizedContent("Which continent has the most protected areas?", listOf("Asia", "Africa", "North America", "Europe"), "Geography", "North America has the largest number of protected areas in the world, including vast national parks like those in the United States and Canada."),
            zh = LocalizedContent("哪个大陆的保护区最多？", listOf("亚洲", "非洲", "北美洲", "欧洲"), "地理", "北美洲拥有世界上最多的保护区，包括美国和加拿大等地的广阔国家公园。"),
            es = LocalizedContent("¿Qué continente tiene más áreas protegidas?", listOf("Asia", "África", "América del Norte", "Europa"), "Geografía", "América del Norte tiene el mayor número de áreas protegidas del mundo, incluidos vastos parques nacionales como los de Estados Unidos y Canadá.")
        ),
        BilingualQuestion(
            id = 9902, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le continent avec le plus de villes millionnaires?", listOf("Asie", "Afrique", "Europe", "Amérique du Nord"), "Géographie", "L'Asie abrite les plus grandes mégalopoles mondiales comme Tokyo, Shanghai et Delhi, et concentre plus de la moitié des villes de plus d'un million d'habitants en raison de sa forte densité de population et de son urbanisation rapide."),
            en = LocalizedContent("Which continent has the most million-plus cities?", listOf("Asia", "Africa", "Europe", "North America"), "Geography", "Asia is home to the world's largest megacities like Tokyo, Shanghai, and Delhi, and concentrates more than half of the cities with over a million inhabitants due to its high population density and rapid urbanization."),
            zh = LocalizedContent("哪个大陆的百万人口城市最多？", listOf("亚洲", "非洲", "欧洲", "北美洲"), "地理", "亚洲拥有世界上最大的特大城市，如东京、上海和德里，由于人口密度高和快速城市化，集中了超过一半的百万人口城市。"),
            es = LocalizedContent("¿Qué continente tiene más ciudades millonarias?", listOf("Asia", "África", "Europa", "América del Norte"), "Geografía", "Asia alberga las megaciudades más grandes del mundo como Tokio, Shanghái y Delhi, y concentra más de la mitad de las ciudades con más de un millón de habitantes debido a su alta densidad de población y rápida urbanización.")
        ),
        BilingualQuestion(
            id = 9903, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le continent avec le moins de villes millionnaires?", listOf("Asie", "Afrique", "Océanie", "Antarctique"), "Géographie", "L'Antarctique est un continent sans population permanente, ce qui explique l'absence totale de villes millionnaires."),
            en = LocalizedContent("Which continent has the fewest million-plus cities?", listOf("Asia", "Africa", "Oceania", "Antarctica"), "Geography", "Antarctica is a continent with no permanent population, which explains the complete absence of million-plus cities."),
            zh = LocalizedContent("哪个大陆的百万人口城市最少？", listOf("亚洲", "非洲", "大洋洲", "南极洲"), "地理", "南极洲是一个没有永久人口的大陆，这解释了完全没有百万人口城市的原因。"),
            es = LocalizedContent("¿Qué continente tiene menos ciudades millonarias?", listOf("Asia", "África", "Oceanía", "Antártida"), "Geografía", "La Antártida es un continente sin población permanente, lo que explica la ausencia total de ciudades millonarias.")
        ),
        BilingualQuestion(
            id = 9904, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le continent avec la plus grande mégalopole?", listOf("Asie", "Afrique", "Europe", "Amérique du Nord"), "Géographie", "L'Asie abrite la plus grande mégalopole du monde, le Japon, avec la région du Grand Tokyo qui compte plus de 37 millions d'habitants."),
            en = LocalizedContent("Which continent has the largest megacity?", listOf("Asia", "Africa", "Europe", "North America"), "Geography", "Asia is home to the world's largest megacity, Japan, with the Greater Tokyo Area having over 37 million inhabitants."),
            zh = LocalizedContent("哪个大陆拥有最大的特大城市？", listOf("亚洲", "非洲", "欧洲", "北美洲"), "地理", "亚洲拥有世界上最大的特大城市——日本，东京都市圈人口超过3700万。"),
            es = LocalizedContent("¿Qué continente tiene la megaciudad más grande?", listOf("Asia", "África", "Europa", "América del Norte"), "Geografía", "Asia alberga la megaciudad más grande del mundo, Japón, con el área metropolitana de Tokio que cuenta con más de 37 millones de habitantes.")
        ),
        BilingualQuestion(
            id = 9905, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le continent avec le plus de conflits territoriaux?", listOf("Asie", "Afrique", "Amérique du Sud", "Europe"), "Géographie", "L'Asie concentre de nombreux conflits territoriaux en raison de sa densité de population, de ses frontières héritées de la colonisation et de ses ressources stratégiques, comme en mer de Chine méridionale ou au Cachemire."),
            en = LocalizedContent("Which continent has the most territorial conflicts?", listOf("Asia", "Africa", "South America", "Europe"), "Geography", "Asia concentrates many territorial conflicts due to its population density, borders inherited from colonization, and strategic resources, such as in the South China Sea or Kashmir."),
            zh = LocalizedContent("哪个大陆的领土冲突最多？", listOf("亚洲", "非洲", "南美洲", "欧洲"), "地理", "亚洲由于人口密度高、殖民时期遗留的边界以及战略资源（如南海或克什米尔）而集中了许多领土冲突。"),
            es = LocalizedContent("¿Qué continente tiene más conflictos territoriales?", listOf("Asia", "África", "América del Sur", "Europa"), "Geografía", "Asia concentra numerosos conflictos territoriales debido a su densidad de población, sus fronteras heredadas de la colonización y sus recursos estratégicos, como en el Mar de China Meridional o Cachemira.")
        ),
        BilingualQuestion(
            id = 9906, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel pays a la plus grande capacité hydroélectrique du monde?", listOf("Brésil", "Canada", "Chine", "Russie"), "Géographie", "Le Brésil possède la plus grande capacité hydroélectrique installée au monde grâce à ses nombreux fleuves puissants, dont l'Amazone, et à des barrages majeurs comme Itaipu."),
            en = LocalizedContent("Which country has the largest hydroelectric capacity in the world?", listOf("Brazil", "Canada", "China", "Russia"), "Geography", "Brazil has the largest installed hydroelectric capacity in the world thanks to its many powerful rivers, including the Amazon, and major dams like Itaipu."),
            zh = LocalizedContent("哪个国家拥有世界上最大的水力发电能力？", listOf("巴西", "加拿大", "中国", "俄罗斯"), "地理", "巴西拥有世界上最大的水力发电装机容量，得益于其众多强大的河流（包括亚马逊河）和伊泰普等大型水坝。"),
            es = LocalizedContent("¿Qué país tiene la mayor capacidad hidroeléctrica del mundo?", listOf("Brasil", "Canadá", "China", "Rusia"), "Geografía", "Brasil tiene la mayor capacidad hidroeléctrica instalada del mundo gracias a sus numerosos ríos caudalosos, incluido el Amazonas, y grandes represas como Itaipú.")
        ),
        BilingualQuestion(
            id = 9907, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel pays a la plus grande capacité nucléaire du monde?", listOf("États-Unis", "France", "Russie", "Chine"), "Géographie", "Les États-Unis possèdent le plus grand parc de réacteurs nucléaires en activité, avec environ 94 réacteurs, et une capacité installée totale de près de 100 gigawatts."),
            en = LocalizedContent("Which country has the largest nuclear capacity in the world?", listOf("United States", "France", "Russia", "China"), "Geography", "The United States has the largest fleet of operating nuclear reactors, with about 94 reactors, and a total installed capacity of nearly 100 gigawatts."),
            zh = LocalizedContent("哪个国家拥有世界上最大的核能发电能力？", listOf("美国", "法国", "俄罗斯", "中国"), "地理", "美国拥有最大的在运核反应堆群，约94座反应堆，总装机容量近100吉瓦。"),
            es = LocalizedContent("¿Qué país tiene la mayor capacidad nuclear del mundo?", listOf("Estados Unidos", "Francia", "Rusia", "China"), "Geografía", "Estados Unidos posee el mayor parque de reactores nucleares en funcionamiento, con aproximadamente 94 reactores, y una capacidad instalada total de casi 100 gigavatios.")
        ),
        BilingualQuestion(
            id = 9908, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel pays a la plus grande capacité éolienne du monde?", listOf("Allemagne", "Chine", "États-Unis", "Inde"), "Géographie", "La Chine possède la plus grande capacité éolienne installée au monde, dépassant largement les autres pays grâce à ses vastes parcs éoliens terrestres et offshore."),
            en = LocalizedContent("Which country has the largest wind capacity in the world?", listOf("Germany", "China", "United States", "India"), "Geography", "China has the largest installed wind capacity in the world, far surpassing other countries thanks to its vast onshore and offshore wind farms."),
            zh = LocalizedContent("哪个国家拥有世界上最大的风力发电能力？", listOf("德国", "中国", "美国", "印度"), "地理", "中国拥有世界上最大的风电装机容量，凭借其广阔的陆上和海上风电场，远超其他国家。"),
            es = LocalizedContent("¿Qué país tiene la mayor capacidad eólica del mundo?", listOf("Alemania", "China", "Estados Unidos", "India"), "Geografía", "China tiene la mayor capacidad eólica instalada del mundo, superando con creces a otros países gracias a sus vastos parques eólicos terrestres y marinos.")
        ),
        BilingualQuestion(
            id = 9909, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel pays a la plus grande capacité solaire du monde?", listOf("Allemagne", "Chine", "Japon", "États-Unis"), "Géographie", "La Chine est le leader mondial de la capacité solaire installée, dépassant largement les autres pays grâce à ses investissements massifs dans les parcs solaires et sa production de panneaux photovoltaïques."),
            en = LocalizedContent("Which country has the largest solar capacity in the world?", listOf("Germany", "China", "Japan", "United States"), "Geography", "China is the world leader in installed solar capacity, far surpassing other countries thanks to its massive investments in solar parks and photovoltaic panel production."),
            zh = LocalizedContent("哪个国家拥有世界上最大的太阳能发电能力？", listOf("德国", "中国", "日本", "美国"), "地理", "中国是太阳能装机容量的世界领导者，凭借其在太阳能园区和光伏板生产方面的大规模投资，远超其他国家。"),
            es = LocalizedContent("¿Qué país tiene la mayor capacidad solar del mundo?", listOf("Alemania", "China", "Japón", "Estados Unidos"), "Geografía", "China es el líder mundial en capacidad solar instalada, superando con creces a otros países gracias a sus masivas inversiones en parques solares y producción de paneles fotovoltaicos.")
        ),
    )

    private fun part7(): List<BilingualQuestion> = listOf(
        BilingualQuestion(
            id = 9910, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel pays a la plus grande capacité géothermale du monde?", listOf("Islande", "Nouvelle-Zélande", "États-Unis", "Indonésie"), "Géographie", "Les États-Unis possèdent la plus grande capacité géothermique installée au monde, principalement grâce aux centrales de The Geysers en Californie, le plus vaste complexe géothermique mondial."),
            en = LocalizedContent("Which country has the largest geothermal capacity in the world?", listOf("Iceland", "New Zealand", "United States", "Indonesia"), "Geography", "The United States has the largest installed geothermal capacity in the world, mainly due to The Geysers complex in California, the largest geothermal field globally."),
            zh = LocalizedContent("哪个国家拥有世界上最大的地热发电能力？", listOf("冰岛", "新西兰", "美国", "印度尼西亚"), "地理", "美国拥有世界上最大的地热装机容量，主要得益于加利福尼亚州的盖瑟斯地热田，这是全球最大的地热田。"),
            es = LocalizedContent("¿Qué país tiene la mayor capacidad geotérmica del mundo?", listOf("Islandia", "Nueva Zelanda", "Estados Unidos", "Indonesia"), "Geografía", "Estados Unidos posee la mayor capacidad geotérmica instalada del mundo, principalmente gracias a las centrales de The Geysers en California, el complejo geotérmico más grande del mundo.")
        ),
        BilingualQuestion(
            id = 9911, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le lac le plus profond d'Europe?", listOf("Lac Onega", "Lac Ladoga", "Lac Baïkal", "Lac Genève"), "Géographie", "Le lac Baïkal, situé en Sibérie orientale en Russie, atteint une profondeur maximale de 1 642 mètres, ce qui en fait le lac le plus profond d'Europe et du monde."),
            en = LocalizedContent("What is the deepest lake in Europe?", listOf("Lake Onega", "Lake Ladoga", "Lake Baikal", "Lake Geneva"), "Geography", "Lake Baikal, located in eastern Siberia, Russia, reaches a maximum depth of 1,642 meters, making it the deepest lake in Europe and the world."),
            zh = LocalizedContent("欧洲最深的湖泊是哪个？", listOf("奥涅加湖", "拉多加湖", "贝加尔湖", "日内瓦湖"), "地理", "贝加尔湖位于俄罗斯西伯利亚东部，最大深度达1642米，是欧洲乃至世界上最深的湖泊。"),
            es = LocalizedContent("¿Cuál es el lago más profundo de Europa?", listOf("Lago Onega", "Lago Ladoga", "Lago Baikal", "Lago Ginebra"), "Geografía", "El lago Baikal, situado en Siberia oriental, Rusia, alcanza una profundidad máxima de 1.642 metros, lo que lo convierte en el lago más profundo de Europa y del mundo.")
        ),
        BilingualQuestion(
            id = 9912, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le fleuve le plus long d'Europe?", listOf("Danube", "Volga", "Rhin", "Don"), "Géographie", "La Volga traverse la Russie sur 3 530 kilomètres avant de se jeter dans la mer Caspienne, ce qui en fait le plus long fleuve d'Europe."),
            en = LocalizedContent("What is the longest river in Europe?", listOf("Danube", "Volga", "Rhine", "Don"), "Geography", "The Volga flows through Russia for 3,530 kilometers before emptying into the Caspian Sea, making it the longest river in Europe."),
            zh = LocalizedContent("欧洲最长的河流是哪条？", listOf("多瑙河", "伏尔加河", "莱茵河", "顿河"), "地理", "伏尔加河全长3530公里，流经俄罗斯后注入里海，是欧洲最长的河流。"),
            es = LocalizedContent("¿Cuál es el río más largo de Europa?", listOf("Danubio", "Volga", "Rin", "Don"), "Geografía", "El Volga atraviesa Rusia a lo largo de 3.530 kilómetros antes de desembocar en el mar Caspio, lo que lo convierte en el río más largo de Europa.")
        ),
        BilingualQuestion(
            id = 9913, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plus grand désert d'Asie?", listOf("Gobi", "Taklamakan", "Rub' al Khali", "Arabie"), "Géographie", "Le désert de Gobi, situé principalement en Mongolie et en Chine, est le plus grand désert d'Asie avec une superficie d'environ 1,3 million de kilomètres carrés."),
            en = LocalizedContent("What is the largest desert in Asia?", listOf("Gobi", "Taklamakan", "Rub' al Khali", "Arabian"), "Geography", "The Gobi Desert, located mainly in Mongolia and China, is the largest desert in Asia with an area of about 1.3 million square kilometers."),
            zh = LocalizedContent("亚洲最大的沙漠是哪个？", listOf("戈壁沙漠", "塔克拉玛干沙漠", "鲁卜哈利沙漠", "阿拉伯沙漠"), "地理", "戈壁沙漠主要位于蒙古和中国，面积约130万平方公里，是亚洲最大的沙漠。"),
            es = LocalizedContent("¿Cuál es el desierto más grande de Asia?", listOf("Gobi", "Taklamakán", "Rub' al Khali", "Arábigo"), "Geografía", "El desierto de Gobi, situado principalmente en Mongolia y China, es el desierto más grande de Asia con una superficie de aproximadamente 1,3 millones de kilómetros cuadrados.")
        ),
        BilingualQuestion(
            id = 9914, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plus grand fleuve d'Asie?", listOf("Gange", "Yangtsé", "Amour", "Iénisseï"), "Géographie", "Le Yangtsé, long d'environ 6 300 km, traverse la Chine d'ouest en est avant de se jeter dans la mer de Chine orientale, ce qui en fait le plus long fleuve d'Asie et le troisième du monde."),
            en = LocalizedContent("What is the longest river in Asia?", listOf("Ganges", "Yangtze", "Amur", "Yenisei"), "Geography", "The Yangtze River, about 6,300 km long, flows across China from west to east before emptying into the East China Sea, making it the longest river in Asia and the third longest in the world."),
            zh = LocalizedContent("亚洲最长的河流是哪条？", listOf("恒河", "长江", "黑龙江", "叶尼塞河"), "地理", "长江全长约6300公里，自西向东流经中国，注入东海，是亚洲最长的河流，世界第三长。"),
            es = LocalizedContent("¿Cuál es el río más largo de Asia?", listOf("Ganges", "Yangtsé", "Amur", "Yeniséi"), "Geografía", "El río Yangtsé, de unos 6.300 km de longitud, atraviesa China de oeste a este antes de desembocar en el mar de China Oriental, lo que lo convierte en el río más largo de Asia y el tercero del mundo.")
        ),
        BilingualQuestion(
            id = 9915, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plus grand lac d'Asie?", listOf("Baïkal", "Aral", "Balkhach", "Issyk-Koul"), "Géographie", "Le lac d'Aral était autrefois le plus grand lac d'Asie, mais il s'est considérablement asséché depuis les années 1960 en raison de l'irrigation intensive."),
            en = LocalizedContent("What is the largest lake in Asia?", listOf("Baikal", "Aral", "Balkhash", "Issyk-Kul"), "Geography", "The Aral Sea was once the largest lake in Asia, but it has shrunk dramatically since the 1960s due to intensive irrigation."),
            zh = LocalizedContent("亚洲最大的湖泊是哪个？", listOf("贝加尔湖", "咸海", "巴尔喀什湖", "伊塞克湖"), "地理", "咸海曾经是亚洲最大的湖泊，但自20世纪60年代以来，由于密集的灌溉，其面积大幅缩小。"),
            es = LocalizedContent("¿Cuál es el lago más grande de Asia?", listOf("Baikal", "Aral", "Balkhash", "Issyk-Kul"), "Geografía", "El mar de Aral fue una vez el lago más grande de Asia, pero se ha reducido drásticamente desde la década de 1960 debido al riego intensivo.")
        ),
        BilingualQuestion(
            id = 9916, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand archipel d'Asie?", listOf("Hawaï", "Maldives", "Indonésie", "Philippines"), "Géographie", "L'Indonésie est le plus grand archipel d'Asie et du monde, avec plus de 17 000 îles, dont les principales sont Java, Sumatra, Bornéo et Sulawesi."),
            en = LocalizedContent("What is the largest archipelago in Asia?", listOf("Hawaii", "Maldives", "Indonesia", "Philippines"), "Geography", "Indonesia is the largest archipelago in Asia and the world, with over 17,000 islands, the main ones being Java, Sumatra, Borneo, and Sulawesi."),
            zh = LocalizedContent("亚洲最大的群岛是哪个？", listOf("夏威夷群岛", "马尔代夫", "印度尼西亚", "菲律宾"), "地理", "印度尼西亚是亚洲乃至世界上最大的群岛，拥有超过17000个岛屿，主要岛屿包括爪哇岛、苏门答腊岛、加里曼丹岛和苏拉威西岛。"),
            es = LocalizedContent("¿Cuál es el archipiélago más grande de Asia?", listOf("Hawái", "Maldivas", "Indonesia", "Filipinas"), "Geografía", "Indonesia es el archipiélago más grande de Asia y del mundo, con más de 17.000 islas, siendo las principales Java, Sumatra, Borneo y Célebes.")
        ),
        BilingualQuestion(
            id = 9917, correctIndex = 3, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le plus grand pays d'Océanie?", listOf("Nouvelle-Zélande", "Fidji", "Samoa", "Australie"), "Géographie", "L'Australie est le plus grand pays d'Océanie, avec une superficie de près de 7,7 millions de kilomètres carrés, dominant largement la région."),
            en = LocalizedContent("What is the largest country in Oceania?", listOf("New Zealand", "Fiji", "Samoa", "Australia"), "Geography", "Australia is the largest country in Oceania, with an area of nearly 7.7 million square kilometers, dominating the region."),
            zh = LocalizedContent("大洋洲最大的国家是哪个？", listOf("新西兰", "斐济", "萨摩亚", "澳大利亚"), "地理", "澳大利亚是大洋洲最大的国家，面积近770万平方公里，在该地区占据主导地位。"),
            es = LocalizedContent("¿Cuál es el país más grande de Oceanía?", listOf("Nueva Zelanda", "Fiyi", "Samoa", "Australia"), "Geografía", "Australia es el país más grande de Oceanía, con una superficie de casi 7,7 millones de kilómetros cuadrados, dominando ampliamente la región.")
        ),
        BilingualQuestion(
            id = 9918, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand archipel d'Océanie?", listOf("Hawaï", "Polynésie française", "Fiji", "Samoa"), "Géographie", "La Polynésie française est le plus grand archipel d'Océanie en superficie maritime, avec 118 îles réparties sur 2,5 millions de km² d'océan."),
            en = LocalizedContent("What is the largest archipelago in Oceania?", listOf("Hawaii", "French Polynesia", "Fiji", "Samoa"), "Geography", "French Polynesia is the largest archipelago in Oceania by maritime area, with 118 islands spread over 2.5 million km² of ocean."),
            zh = LocalizedContent("大洋洲最大的群岛是哪个？", listOf("夏威夷群岛", "法属波利尼西亚", "斐济", "萨摩亚"), "地理", "法属波利尼西亚是大洋洲海域面积最大的群岛，拥有118个岛屿，分布在250万平方公里的海洋上。"),
            es = LocalizedContent("¿Cuál es el archipiélago más grande de Oceanía?", listOf("Hawái", "Polinesia Francesa", "Fiyi", "Samoa"), "Geografía", "La Polinesia Francesa es el archipiélago más grande de Oceanía por superficie marítima, con 118 islas repartidas en 2,5 millones de km² de océano.")
        ),
        BilingualQuestion(
            id = 9919, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plus grand fleuve d'Amérique du Nord?", listOf("Yukon", "Mississippi", "Mackenzie", "Rio Bravo"), "Géographie", "Le Mississippi est le plus long fleuve d'Amérique du Nord avec ses 3 778 kilomètres, traversant dix États américains avant de se jeter dans le golfe du Mexique."),
            en = LocalizedContent("What is the longest river in North America?", listOf("Yukon", "Mississippi", "Mackenzie", "Rio Grande"), "Geography", "The Mississippi River is the longest river in North America at 3,778 kilometers, flowing through ten U.S. states before emptying into the Gulf of Mexico."),
            zh = LocalizedContent("北美洲最长的河流是哪条？", listOf("育空河", "密西西比河", "马更些河", "格兰德河"), "地理", "密西西比河全长3778公里，是北美洲最长的河流，流经美国十个州后注入墨西哥湾。"),
            es = LocalizedContent("¿Cuál es el río más largo de América del Norte?", listOf("Yukón", "Misisipi", "Mackenzie", "Río Bravo"), "Geografía", "El río Misisipi es el río más largo de América del Norte con 3.778 kilómetros, atravesando diez estados de EE. UU. antes de desembocar en el golfo de México.")
        ),
        BilingualQuestion(
            id = 9920, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plus grand lac d'Amérique du Nord?", listOf("Lac Michigan", "Lac Supérieur", "Grand Lac de l'Ours", "Grand Lac des Esclaves"), "Géographie", "Le lac Supérieur est le plus grand lac d'Amérique du Nord par sa superficie, situé entre les États-Unis et le Canada, faisant partie des Grands Lacs."),
            en = LocalizedContent("What is the largest lake in North America?", listOf("Lake Michigan", "Lake Superior", "Great Bear Lake", "Great Slave Lake"), "Geography", "Lake Superior is the largest lake in North America by surface area, located between the United States and Canada, part of the Great Lakes."),
            zh = LocalizedContent("北美最大的湖泊是哪个？", listOf("密歇根湖", "苏必利尔湖", "大熊湖", "大奴湖"), "地理", "苏必利尔湖是北美面积最大的湖泊，位于美国和加拿大之间，是五大湖的一部分。"),
            es = LocalizedContent("¿Cuál es el lago más grande de América del Norte?", listOf("Lago Míchigan", "Lago Superior", "Gran Lago del Oso", "Gran Lago de los Esclavos"), "Geografía", "El lago Superior es el lago más grande de América del Norte por superficie, ubicado entre Estados Unidos y Canadá, parte de los Grandes Lagos.")
        ),
        BilingualQuestion(
            id = 9921, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand archipel d'Amérique du Nord?", listOf("Îles de la Reine-Charlotte", "Îles Aléoutiennes", "Archipel du Canada arctique", "Îles Bahamas"), "Géographie", "L'archipel du Canada arctique, situé dans l'océan Arctique, est le plus vaste archipel d'Amérique du Nord avec plus de 36 000 îles, dont la plus grande est l'île de Baffin."),
            en = LocalizedContent("What is the largest archipelago in North America?", listOf("Queen Charlotte Islands", "Aleutian Islands", "Arctic Archipelago", "Bahamas"), "Geography", "The Arctic Archipelago, located in the Arctic Ocean, is the largest archipelago in North America with over 36,000 islands, the largest being Baffin Island."),
            zh = LocalizedContent("北美最大的群岛是哪个？", listOf("夏洛特皇后群岛", "阿留申群岛", "北极群岛", "巴哈马群岛"), "地理", "北极群岛位于北冰洋，是北美最大的群岛，拥有超过36,000个岛屿，其中最大的是巴芬岛。"),
            es = LocalizedContent("¿Cuál es el archipiélago más grande de América del Norte?", listOf("Islas de la Reina Carlota", "Islas Aleutianas", "Archipiélago Ártico Canadiense", "Islas Bahamas"), "Geografía", "El Archipiélago Ártico Canadiense, ubicado en el océano Ártico, es el archipiélago más grande de América del Norte con más de 36,000 islas, la más grande es la isla de Baffin.")
        ),
        BilingualQuestion(
            id = 9922, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand désert d'Amérique du Nord?", listOf("Désert de Chihuahua", "Désert du Mojave", "Grand Bassin", "Désert de Sonora"), "Géographie", "Le désert de Chihuahua s'étend du sud-ouest des États-Unis au nord du Mexique, couvrant environ 450 000 km², ce qui en fait le plus vaste désert d'Amérique du Nord."),
            en = LocalizedContent("What is the largest desert in North America?", listOf("Chihuahuan Desert", "Mojave Desert", "Great Basin", "Sonoran Desert"), "Geography", "The Chihuahuan Desert extends from the southwestern United States into northern Mexico, covering about 450,000 km², making it the largest desert in North America."),
            zh = LocalizedContent("北美最大的沙漠是哪个？", listOf("奇瓦瓦沙漠", "莫哈韦沙漠", "大盆地", "索诺兰沙漠"), "地理", "奇瓦瓦沙漠从美国西南部延伸到墨西哥北部，面积约45万平方公里，是北美最大的沙漠。"),
            es = LocalizedContent("¿Cuál es el desierto más grande de América del Norte?", listOf("Desierto de Chihuahua", "Desierto de Mojave", "Gran Cuenca", "Desierto de Sonora"), "Geografía", "El desierto de Chihuahua se extiende desde el suroeste de Estados Unidos hasta el norte de México, cubriendo aproximadamente 450,000 km², lo que lo convierte en el desierto más grande de América del Norte.")
        ),
        BilingualQuestion(
            id = 9923, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plus grand fleuve d'Amérique du Sud?", listOf("Amazone", "Orénoque", "Paraná", "São Francisco"), "Géographie", "L'Amazone est le plus grand fleuve d'Amérique du Sud en volume d'eau et en longueur, traversant le Brésil, le Pérou et la Colombie."),
            en = LocalizedContent("What is the largest river in South America?", listOf("Amazon", "Orinoco", "Paraná", "São Francisco"), "Geography", "The Amazon is the largest river in South America by water volume and length, flowing through Brazil, Peru, and Colombia."),
            zh = LocalizedContent("南美洲最大的河流是哪个？", listOf("亚马逊河", "奥里诺科河", "巴拉那河", "圣弗朗西斯科河"), "地理", "亚马逊河是南美洲水量最大、最长的河流，流经巴西、秘鲁和哥伦比亚。"),
            es = LocalizedContent("¿Cuál es el río más grande de América del Sur?", listOf("Amazonas", "Orinoco", "Paraná", "São Francisco"), "Geografía", "El Amazonas es el río más grande de América del Sur en volumen de agua y longitud, atravesando Brasil, Perú y Colombia.")
        ),
        BilingualQuestion(
            id = 9924, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plus grand lac d'Amérique du Sud?", listOf("Lac Titicaca", "Lac Poopó", "Lac Coipasa", "Lac Chinchorro"), "Géographie", "Le lac Titicaca, situé à la frontière entre le Pérou et la Bolivie, est le plus grand lac d'Amérique du Sud par sa superficie et son volume d'eau. Il est également le plus haut lac navigable du monde, à 3 812 mètres d'altitude."),
            en = LocalizedContent("What is the largest lake in South America?", listOf("Lake Titicaca", "Lake Poopó", "Lake Coipasa", "Lake Chinchorro"), "Geography", "Lake Titicaca, located on the border between Peru and Bolivia, is the largest lake in South America by surface area and water volume. It is also the highest navigable lake in the world, at 3,812 meters above sea level."),
            zh = LocalizedContent("南美洲最大的湖泊是哪个？", listOf("的的喀喀湖", "波波湖", "科伊帕萨湖", "钦乔罗湖"), "地理", "的的喀喀湖位于秘鲁和玻利维亚边境，是南美洲面积最大、水量最大的湖泊，也是世界上海拔最高的可通航湖泊，海拔3812米。"),
            es = LocalizedContent("¿Cuál es el lago más grande de América del Sur?", listOf("Lago Titicaca", "Lago Poopó", "Lago Coipasa", "Lago Chinchorro"), "Geografía", "El lago Titicaca, ubicado en la frontera entre Perú y Bolivia, es el lago más grande de América del Sur por superficie y volumen de agua. También es el lago navegable más alto del mundo, a 3,812 metros sobre el nivel del mar.")
        ),
        BilingualQuestion(
            id = 9925, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand archipel d'Amérique du Sud?", listOf("Îles Chloé", "Archipel de Juan Fernández", "Îles Galapagos", "Archipel de Tierra del Fuego"), "Géographie", "L'archipel des Galapagos, situé dans l'océan Pacifique à l'ouest de l'Équateur, est le plus grand d'Amérique du Sud avec ses 13 îles principales et des dizaines d'îlots."),
            en = LocalizedContent("What is the largest archipelago in South America?", listOf("Chiloé Islands", "Juan Fernández Archipelago", "Galapagos Islands", "Tierra del Fuego Archipelago"), "Geography", "The Galapagos Islands, located in the Pacific Ocean west of Ecuador, are the largest archipelago in South America with 13 main islands and dozens of islets."),
            zh = LocalizedContent("南美洲最大的群岛是哪个？", listOf("奇洛埃群岛", "胡安·费尔南德斯群岛", "加拉帕戈斯群岛", "火地群岛"), "地理", "加拉帕戈斯群岛位于厄瓜多尔以西的太平洋中，是南美洲最大的群岛，拥有13个主要岛屿和数十个小岛。"),
            es = LocalizedContent("¿Cuál es el archipiélago más grande de América del Sur?", listOf("Islas Chiloé", "Archipiélago Juan Fernández", "Islas Galápagos", "Archipiélago de Tierra del Fuego"), "Geografía", "Las islas Galápagos, ubicadas en el océano Pacífico al oeste de Ecuador, son el archipiélago más grande de América del Sur con 13 islas principales y decenas de islotes.")
        ),
        BilingualQuestion(
            id = 9926, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plus grand désert d'Amérique du Sud?", listOf("Désert d'Atacama", "Désert de Sechura", "Pampas", "Cerrado"), "Géographie", "Le désert d'Atacama, situé au nord du Chili, est le plus grand désert d'Amérique du Sud et l'un des plus arides au monde."),
            en = LocalizedContent("What is the largest desert in South America?", listOf("Atacama Desert", "Sechura Desert", "Pampas", "Cerrado"), "Geography", "The Atacama Desert, located in northern Chile, is the largest desert in South America and one of the driest in the world."),
            zh = LocalizedContent("南美洲最大的沙漠是哪个？", listOf("阿塔卡马沙漠", "塞丘拉沙漠", "潘帕斯草原", "塞拉多草原"), "地理", "阿塔卡马沙漠位于智利北部，是南美洲最大的沙漠，也是世界上最干旱的地区之一。"),
            es = LocalizedContent("¿Cuál es el desierto más grande de América del Sur?", listOf("Desierto de Atacama", "Desierto de Sechura", "Pampas", "Cerrado"), "Geografía", "El desierto de Atacama, ubicado en el norte de Chile, es el desierto más grande de América del Sur y uno de los más áridos del mundo.")
        ),
        BilingualQuestion(
            id = 9927, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le point le plus bas du monde?", listOf("Mer Morte", "Lac Baïkal", "Canyon Mariana", "Dépression de Turpan"), "Géographie", "La fosse des Mariannes, située dans l'océan Pacifique, atteint environ 11 034 mètres de profondeur à son point le plus bas, le Challenger Deep, ce qui en fait le point le plus profond de la croûte terrestre."),
            en = LocalizedContent("What is the lowest point on Earth?", listOf("Dead Sea", "Lake Baikal", "Mariana Trench", "Turpan Depression"), "Geography", "The Mariana Trench, located in the Pacific Ocean, reaches about 11,034 meters deep at its lowest point, the Challenger Deep, making it the deepest point on Earth's crust."),
            zh = LocalizedContent("地球上的最低点是哪里？", listOf("死海", "贝加尔湖", "马里亚纳海沟", "吐鲁番盆地"), "地理", "马里亚纳海沟位于太平洋，其最深处挑战者深渊深约11034米，是地壳的最深点。"),
            es = LocalizedContent("¿Cuál es el punto más bajo de la Tierra?", listOf("Mar Muerto", "Lago Baikal", "Fosa de las Marianas", "Depresión de Turpan"), "Geografía", "La fosa de las Marianas, ubicada en el océano Pacífico, alcanza unos 11,034 metros de profundidad en su punto más bajo, el Abismo Challenger, lo que la convierte en el punto más profundo de la corteza terrestre.")
        ),
        BilingualQuestion(
            id = 9928, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus long fleuve de Russie?", listOf("Obi", "Léna", "Iénisseï", "Volga"), "Géographie", "Long de 5 539 km, l'Iénisseï traverse la Sibérie avant de se jeter dans l'océan Arctique, dépassant la Lena et l'Ob en longueur."),
            en = LocalizedContent("What is the longest river in Russia?", listOf("Ob", "Lena", "Yenisei", "Volga"), "Geography", "The Yenisei, 5,539 km long, flows through Siberia before emptying into the Arctic Ocean, surpassing the Lena and Ob in length."),
            zh = LocalizedContent("俄罗斯最长的河流是哪个？", listOf("鄂毕河", "勒拿河", "叶尼塞河", "伏尔加河"), "地理", "叶尼塞河全长5539公里，流经西伯利亚后注入北冰洋，长度超过勒拿河和鄂毕河。"),
            es = LocalizedContent("¿Cuál es el río más largo de Rusia?", listOf("Ob", "Lena", "Yeniséi", "Volga"), "Geografía", "El Yeniséi, con 5,539 km de longitud, fluye a través de Siberia antes de desembocar en el océano Ártico, superando en longitud al Lena y al Ob.")
        ),
        BilingualQuestion(
            id = 9929, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand lac de Russie?", listOf("Lac Baïkal", "Ladoga", "Onega", "Vänern"), "Géographie", "Le lac Baïkal, situé en Sibérie, est le plus grand lac d'eau douce de Russie par son volume et le plus profond du monde."),
            en = LocalizedContent("What is the largest lake in Russia?", listOf("Lake Baikal", "Ladoga", "Onega", "Vänern"), "Geography", "Lake Baikal, located in Siberia, is the largest freshwater lake in Russia by volume and the deepest in the world."),
            zh = LocalizedContent("俄罗斯最大的湖泊是哪个？", listOf("贝加尔湖", "拉多加湖", "奥涅加湖", "维纳恩湖"), "地理", "贝加尔湖位于西伯利亚，是俄罗斯水量最大的淡水湖，也是世界上最深的湖泊。"),
            es = LocalizedContent("¿Cuál es el lago más grande de Rusia?", listOf("Lago Baikal", "Ládoga", "Onega", "Vänern"), "Geografía", "El lago Baikal, ubicado en Siberia, es el lago de agua dulce más grande de Rusia por volumen y el más profundo del mundo.")
        ),
    )
}
