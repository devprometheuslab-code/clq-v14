package com.prometheus.clq.data

import com.prometheus.clq.model.BilingualQuestion
import com.prometheus.clq.model.Difficulty
import com.prometheus.clq.model.Language
import com.prometheus.clq.model.LocalizedContent
import com.prometheus.clq.model.Question

/** Auto-generated batch 6 : 500 questions bilingues */
object QuestionsBilingualGenerated_6 {
    fun get(lang: Language = Language.FR): List<Question> = list.map { it.toQuestion(lang) }

    val list: List<BilingualQuestion> by lazy {
        part1() + part2() + part3() + part4() + part5() + part6() + part7()
    }

    private fun part1(): List<BilingualQuestion> = listOf(
        BilingualQuestion(
            id = 8930, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel gland produit la GH?", listOf("Hypophyse antérieure", "Hypothalamus", "Thyroïde", "Pancréas"), "Science", "La GH, ou hormone de croissance, est sécrétée par l'hypophyse antérieure, une glande endocrine située à la base du cerveau."),
            en = LocalizedContent("Which gland produces GH?", listOf("Anterior pituitary", "Hypothalamus", "Thyroid", "Pancreas"), "Science", "GH, or growth hormone, is secreted by the anterior pituitary, an endocrine gland located at the base of the brain."),
            zh = LocalizedContent("哪种腺体产生生长激素？", listOf("垂体前叶", "下丘脑", "甲状腺", "胰腺"), "科学", "生长激素由垂体前叶分泌，垂体前叶是位于大脑底部的一个内分泌腺。"),
            es = LocalizedContent("¿Qué glándula produce la GH?", listOf("Hipófisis anterior", "Hipotálamo", "Tiroides", "Páncreas"), "Ciencia", "La GH, u hormona del crecimiento, es secretada por la hipófisis anterior, una glándula endocrina situada en la base del cerebro.")
        ),
        BilingualQuestion(
            id = 8931, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand phare antique?", listOf("Phare d'Alexandrie", "Phare de Colosse de Rhodes", "Phare de la Pharos", "Phare du Cap"), "Science", "Construit au IIIe siècle av. J.-C. sur l'île de Pharos, le phare d'Alexandrie était l'une des Sept Merveilles du monde antique et culminait à environ 130 mètres."),
            en = LocalizedContent("What is the largest ancient lighthouse?", listOf("Lighthouse of Alexandria", "Colossus of Rhodes lighthouse", "Pharos lighthouse", "Cape lighthouse"), "Science", "Built in the 3rd century BC on the island of Pharos, the Lighthouse of Alexandria was one of the Seven Wonders of the Ancient World and stood about 130 meters tall."),
            zh = LocalizedContent("最大的古代灯塔是什么？", listOf("亚历山大灯塔", "罗得岛巨像灯塔", "法罗斯灯塔", "海角灯塔"), "科学", "亚历山大灯塔建于公元前3世纪的法罗斯岛上，是古代世界七大奇迹之一，高约130米。"),
            es = LocalizedContent("¿Cuál es el faro antiguo más grande?", listOf("Faro de Alejandría", "Faro del Coloso de Rodas", "Faro de Faros", "Faro del Cabo"), "Ciencia", "Construido en el siglo III a.C. en la isla de Faros, el Faro de Alejandría era una de las Siete Maravillas del Mundo Antiguo y alcanzaba unos 130 metros de altura.")
        ),
        BilingualQuestion(
            id = 8932, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel scientifique a découvert les anomalies chirales?", listOf("Théorique", "Albert Einstein", "Max Planck", "Werner Heisenberg"), "Science", "Les anomalies chirales ont été découvertes par le physicien théorique Tsung-Dao Lee et Chen Ning Yang, qui ont reçu le prix Nobel en 1957 pour leurs travaux théoriques sur la violation de la parité."),
            en = LocalizedContent("Which scientist discovered chiral anomalies?", listOf("Theoretical", "Albert Einstein", "Max Planck", "Werner Heisenberg"), "Science", "Chiral anomalies were discovered by theoretical physicists Tsung-Dao Lee and Chen Ning Yang, who received the Nobel Prize in 1957 for their theoretical work on parity violation."),
            zh = LocalizedContent("哪位科学家发现了手征反常？", listOf("理论物理学家", "阿尔伯特·爱因斯坦", "马克斯·普朗克", "维尔纳·海森堡"), "科学", "手征反常由理论物理学家李政道和杨振宁发现，他们因在宇称不守恒方面的理论工作于1957年获得诺贝尔奖。"),
            es = LocalizedContent("¿Qué científico descubrió las anomalías quirales?", listOf("Teórico", "Albert Einstein", "Max Planck", "Werner Heisenberg"), "Ciencia", "Las anomalías quirales fueron descubiertas por los físicos teóricos Tsung-Dao Lee y Chen Ning Yang, quienes recibieron el Premio Nobel en 1957 por su trabajo teórico sobre la violación de la paridad.")
        ),
        BilingualQuestion(
            id = 8933, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le symbole chimique de la chrysène?", listOf("C18H12", "C18H10", "C18H14", "C18H8"), "Science", "La chrysène est un hydrocarbure aromatique polycyclique composé de 18 atomes de carbone et 12 d'hydrogène, d'où sa formule brute C18H12."),
            en = LocalizedContent("What is the chemical symbol of chrysene?", listOf("C18H12", "C18H10", "C18H14", "C18H8"), "Science", "Chrysene is a polycyclic aromatic hydrocarbon composed of 18 carbon atoms and 12 hydrogen atoms, hence its molecular formula C18H12."),
            zh = LocalizedContent("屈的化学符号是什么？", listOf("C18H12", "C18H10", "C18H14", "C18H8"), "科学", "屈是一种多环芳烃，由18个碳原子和12个氢原子组成，因此其分子式为C18H12。"),
            es = LocalizedContent("¿Cuál es el símbolo químico del criseno?", listOf("C18H12", "C18H10", "C18H14", "C18H8"), "Ciencia", "El criseno es un hidrocarburo aromático policíclico compuesto por 18 átomos de carbono y 12 de hidrógeno, de ahí su fórmula molecular C18H12.")
        ),
        BilingualQuestion(
            id = 8934, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quelle est la concentration de la créatinine dans le plasma?", listOf("0.6-1.2 mg/100 mL", "0.1-0.6 mg/100 mL", "2-3 mg/100 mL", "3-4 mg/100 mL"), "Science", "La créatinine est un déchet musculaire filtré par les reins, et sa concentration plasmatique normale se situe entre 0,6 et 1,2 mg/100 mL, reflétant une fonction rénale saine."),
            en = LocalizedContent("What is the concentration of creatinine in plasma?", listOf("0.6-1.2 mg/100 mL", "0.1-0.6 mg/100 mL", "2-3 mg/100 mL", "3-4 mg/100 mL"), "Science", "Creatinine is a muscle waste product filtered by the kidneys, and its normal plasma concentration ranges from 0.6 to 1.2 mg/100 mL, reflecting healthy kidney function."),
            zh = LocalizedContent("血浆中肌酐的浓度是多少？", listOf("0.6-1.2 mg/100 mL", "0.1-0.6 mg/100 mL", "2-3 mg/100 mL", "3-4 mg/100 mL"), "科学", "肌酐是肌肉代谢废物，由肾脏过滤，其正常血浆浓度在0.6-1.2 mg/100 mL之间，反映肾功能健康。"),
            es = LocalizedContent("¿Cuál es la concentración de creatinina en el plasma?", listOf("0.6-1.2 mg/100 mL", "0.1-0.6 mg/100 mL", "2-3 mg/100 mL", "3-4 mg/100 mL"), "Ciencia", "La creatinina es un desecho muscular filtrado por los riñones, y su concentración plasmática normal se sitúa entre 0,6 y 1,2 mg/100 mL, reflejando una función renal saludable.")
        ),
        BilingualQuestion(
            id = 8935, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel élément chimique a le plus faible potentiel d'ionisation?", listOf("Francium", "Césium", "Rubidium", "Potassium"), "Science", "Le francium est l'élément le plus électropositif du tableau périodique, ce qui signifie qu'il perd très facilement son électron le plus externe, d'où son potentiel d'ionisation le plus bas."),
            en = LocalizedContent("Which chemical element has the lowest ionization potential?", listOf("Francium", "Cesium", "Rubidium", "Potassium"), "Science", "Francium is the most electropositive element in the periodic table, meaning it very easily loses its outermost electron, hence its lowest ionization potential."),
            zh = LocalizedContent("哪种化学元素的电离势最低？", listOf("钫", "铯", "铷", "钾"), "科学", "钫是元素周期表中电正性最强的元素，意味着它极易失去最外层电子，因此电离势最低。"),
            es = LocalizedContent("¿Qué elemento químico tiene el potencial de ionización más bajo?", listOf("Francio", "Cesio", "Rubidio", "Potasio"), "Ciencia", "El francio es el elemento más electropositivo de la tabla periódica, lo que significa que pierde muy fácilmente su electrón más externo, de ahí su potencial de ionización más bajo.")
        ),
        BilingualQuestion(
            id = 8936, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel scientifique a découvert les cordes topologiques?", listOf("Théorique", "Albert Einstein", "Max Planck", "Werner Heisenberg"), "Science", "Les cordes topologiques sont un concept issu de la physique théorique, et non d'une découverte expérimentale attribuée à un scientifique unique."),
            en = LocalizedContent("Which scientist discovered topological strings?", listOf("Theoretical", "Albert Einstein", "Max Planck", "Werner Heisenberg"), "Science", "Topological strings are a concept from theoretical physics, not an experimental discovery attributed to a single scientist."),
            zh = LocalizedContent("哪位科学家发现了拓扑弦？", listOf("理论物理学家", "阿尔伯特·爱因斯坦", "马克斯·普朗克", "维尔纳·海森堡"), "科学", "拓扑弦是理论物理中的一个概念，并非由某一位科学家通过实验发现。"),
            es = LocalizedContent("¿Qué científico descubrió las cuerdas topológicas?", listOf("Teórico", "Albert Einstein", "Max Planck", "Werner Heisenberg"), "Ciencia", "Las cuerdas topológicas son un concepto de la física teórica, no un descubrimiento experimental atribuido a un solo científico.")
        ),
        BilingualQuestion(
            id = 8937, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le symbole chimique du tétraphène?", listOf("C22H14", "C22H12", "C22H16", "C22H10"), "Science", "Le tétraphène est un hydrocarbure aromatique polycyclique composé de 22 atomes de carbone et 14 atomes d'hydrogène, d'où sa formule brute C22H14."),
            en = LocalizedContent("What is the chemical symbol of tetraphene?", listOf("C22H14", "C22H12", "C22H16", "C22H10"), "Science", "Tetraphene is a polycyclic aromatic hydrocarbon composed of 22 carbon atoms and 14 hydrogen atoms, hence its molecular formula C22H14."),
            zh = LocalizedContent("并四苯的化学符号是什么？", listOf("C22H14", "C22H12", "C22H16", "C22H10"), "科学", "并四苯是一种多环芳烃，由22个碳原子和14个氢原子组成，因此其分子式为C22H14。"),
            es = LocalizedContent("¿Cuál es el símbolo químico del tetrafeno?", listOf("C22H14", "C22H12", "C22H16", "C22H10"), "Ciencia", "El tetrafeno es un hidrocarburo aromático policíclico compuesto por 22 átomos de carbono y 14 de hidrógeno, de ahí su fórmula molecular C22H14.")
        ),
        BilingualQuestion(
            id = 8938, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de corpuscules de Lamellar a la peau?", listOf("~100 millions", "~10 millions", "~500 millions", "~1 milliard"), "Science", "Les corpuscules de Lamellar (ou de Pacini) sont des récepteurs sensoriels situés dans le derme. La peau humaine en contient environ 100 millions, répartis sur l'ensemble du corps."),
            en = LocalizedContent("How many lamellar corpuscles does the skin have?", listOf("~100 million", "~10 million", "~500 million", "~1 billion"), "Science", "Lamellar corpuscles (or Pacinian corpuscles) are sensory receptors located in the dermis. Human skin contains about 100 million of them, distributed throughout the body."),
            zh = LocalizedContent("皮肤中有多少层状小体？", listOf("约1亿", "约1000万", "约5亿", "约10亿"), "科学", "层状小体（或帕西尼小体）是位于真皮中的感觉受体。人类皮肤中约有1亿个，遍布全身。"),
            es = LocalizedContent("¿Cuántos corpúsculos laminares tiene la piel?", listOf("~100 millones", "~10 millones", "~500 millones", "~1 billón"), "Ciencia", "Los corpúsculos laminares (o de Pacini) son receptores sensoriales situados en la dermis. La piel humana contiene aproximadamente 100 millones de ellos, distribuidos por todo el cuerpo.")
        ),
        BilingualQuestion(
            id = 8939, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel gland produit l'TSH?", listOf("Hypophyse antérieure", "Hypothalamus", "Thyroïde", "Pancréas"), "Science", "L'hypothalamus produit la TSH (hormone thyréotrope) via la TRH, qui stimule ensuite l'hypophyse."),
            en = LocalizedContent("Which gland produces TSH?", listOf("Anterior pituitary", "Hypothalamus", "Thyroid", "Pancreas"), "Science", "The hypothalamus produces TRH, which stimulates the anterior pituitary to secrete TSH (thyroid-stimulating hormone)."),
            zh = LocalizedContent("哪种腺体产生促甲状腺激素？", listOf("垂体前叶", "下丘脑", "甲状腺", "胰腺"), "科学", "下丘脑产生促甲状腺激素释放激素，刺激垂体前叶分泌促甲状腺激素。"),
            es = LocalizedContent("¿Qué glándula produce la TSH?", listOf("Hipófisis anterior", "Hipotálamo", "Tiroides", "Páncreas"), "Ciencia", "El hipotálamo produce TRH, que estimula la hipófisis anterior para secretar TSH (hormona estimulante de la tiroides).")
        ),
        BilingualQuestion(
            id = 8940, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand aqueduc romain?", listOf("Pont du Gard", "Aqueduc de Roquefavour", "Pont d'Alcántara", "Pont Aelianus"), "Science", "Le Pont du Gard, dans le sud de la France, est le plus haut aqueduc romain conservé, culminant à près de 49 mètres. Il faisait partie d'un système de 50 km amenant l'eau à Nîmes."),
            en = LocalizedContent("What is the largest Roman aqueduct?", listOf("Pont du Gard", "Aqueduct of Roquefavour", "Alcántara Bridge", "Aelian Bridge"), "Science", "The Pont du Gard in southern France is the tallest preserved Roman aqueduct, reaching nearly 49 meters. It was part of a 50 km system bringing water to Nîmes."),
            zh = LocalizedContent("最大的罗马高架渠是什么？", listOf("加尔桥", "罗克法沃尔高架渠", "阿尔坎塔拉桥", "埃利安桥"), "科学", "法国南部的加尔桥是保存最完好的罗马高架渠，高近49米。它是长达50公里、向尼姆供水的系统的一部分。"),
            es = LocalizedContent("¿Cuál es el acueducto romano más grande?", listOf("Puente del Gard", "Acueducto de Roquefavour", "Puente de Alcántara", "Puente Aeliano"), "Ciencia", "El Puente del Gard, en el sur de Francia, es el acueducto romano conservado más alto, con casi 49 metros. Formaba parte de un sistema de 50 km que llevaba agua a Nîmes.")
        ),
        BilingualQuestion(
            id = 8941, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel scientifique a découvert la théorie de Toda?", listOf("Théorique", "Albert Einstein", "Max Planck", "Werner Heisenberg"), "Science", "Morikazu Toda, physicien théoricien japonais, a développé cette théorie dans les années 1960 pour modéliser les interactions non linéaires dans les chaînes d'atomes."),
            en = LocalizedContent("Which scientist discovered the Toda theory?", listOf("Theoretical", "Albert Einstein", "Max Planck", "Werner Heisenberg"), "Science", "Morikazu Toda, a Japanese theoretical physicist, developed this theory in the 1960s to model nonlinear interactions in atomic chains."),
            zh = LocalizedContent("哪位科学家发现了户田理论？", listOf("理论家", "阿尔伯特·爱因斯坦", "马克斯·普朗克", "维尔纳·海森堡"), "科学", "日本理论物理学家户田盛和于20世纪60年代提出了这一理论，用于模拟原子链中的非线性相互作用。"),
            es = LocalizedContent("¿Qué científico descubrió la teoría de Toda?", listOf("Teórico", "Albert Einstein", "Max Planck", "Werner Heisenberg"), "Ciencia", "Morikazu Toda, un físico teórico japonés, desarrolló esta teoría en la década de 1960 para modelar interacciones no lineales en cadenas de átomos.")
        ),
        BilingualQuestion(
            id = 8942, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le symbole chimique du triphenylène?", listOf("C18H12", "C18H10", "C18H14", "C18H8"), "Science", "Le triphenylène est un hydrocarbure aromatique polycyclique composé de 18 atomes de carbone et 10 d'hydrogène, d'où sa formule brute C18H10."),
            en = LocalizedContent("What is the chemical symbol of triphenylene?", listOf("C18H12", "C18H10", "C18H14", "C18H8"), "Science", "Triphenylene is a polycyclic aromatic hydrocarbon composed of 18 carbon atoms and 10 hydrogen atoms, hence its molecular formula C18H10."),
            zh = LocalizedContent("三亚苯的化学式是什么？", listOf("C18H12", "C18H10", "C18H14", "C18H8"), "科学", "三亚苯是一种多环芳烃，由18个碳原子和10个氢原子组成，因此其分子式为C18H10。"),
            es = LocalizedContent("¿Cuál es el símbolo químico del trifenileno?", listOf("C18H12", "C18H10", "C18H14", "C18H8"), "Ciencia", "El trifenileno es un hidrocarburo aromático policíclico compuesto por 18 átomos de carbono y 10 de hidrógeno, de ahí su fórmula molecular C18H10.")
        ),
        BilingualQuestion(
            id = 8943, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quelle est la concentration de l'urée dans le sang?", listOf("7-20 mg/100 mL", "1-7 mg/100 mL", "30-40 mg/100 mL", "40-50 mg/100 mL"), "Science", "L'urée, déchet du métabolisme des protéines, est filtrée par les reins. Une concentration de 7 à 20 mg/100 mL est considérée comme normale chez l'adulte."),
            en = LocalizedContent("What is the concentration of urea in blood?", listOf("7-20 mg/100 mL", "1-7 mg/100 mL", "30-40 mg/100 mL", "40-50 mg/100 mL"), "Science", "Urea, a waste product of protein metabolism, is filtered by the kidneys. A concentration of 7 to 20 mg/100 mL is considered normal in adults."),
            zh = LocalizedContent("血液中尿素的浓度是多少？", listOf("7-20 mg/100 mL", "1-7 mg/100 mL", "30-40 mg/100 mL", "40-50 mg/100 mL"), "科学", "尿素是蛋白质代谢的废物，由肾脏过滤。成人正常浓度为7至20 mg/100 mL。"),
            es = LocalizedContent("¿Cuál es la concentración de urea en la sangre?", listOf("7-20 mg/100 mL", "1-7 mg/100 mL", "30-40 mg/100 mL", "40-50 mg/100 mL"), "Ciencia", "La urea, un desecho del metabolismo de las proteínas, es filtrada por los riñones. Una concentración de 7 a 20 mg/100 mL se considera normal en adultos.")
        ),
        BilingualQuestion(
            id = 8944, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel élément chimique a le plus haut potentiel d'ionisation?", listOf("Hélium", "Fluorine", "Azote", "Hydrogène"), "Science", "L'hélium possède le plus haut potentiel d'ionisation car son noyau exerce une forte attraction sur ses deux électrons, très proches et formant une couche électronique complète et stable."),
            en = LocalizedContent("Which chemical element has the highest ionization potential?", listOf("Helium", "Fluorine", "Nitrogen", "Hydrogen"), "Science", "Helium has the highest ionization potential because its nucleus exerts a strong attraction on its two electrons, which are very close and form a complete and stable electron shell."),
            zh = LocalizedContent("哪种化学元素的电离势最高？", listOf("氦", "氟", "氮", "氢"), "科学", "氦的电离势最高，因为其原子核对两个电子有很强的吸引力，这两个电子非常接近并形成完整稳定的电子层。"),
            es = LocalizedContent("¿Qué elemento químico tiene el mayor potencial de ionización?", listOf("Helio", "Flúor", "Nitrógeno", "Hidrógeno"), "Ciencia", "El helio tiene el mayor potencial de ionización porque su núcleo ejerce una fuerte atracción sobre sus dos electrones, que están muy cerca y forman una capa electrónica completa y estable.")
        ),
        BilingualQuestion(
            id = 8945, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel scientifique a découvert la théorie de Yang-Mills non-abélienne?", listOf("Yang et Mills", "Albert Einstein", "Max Planck", "Werner Heisenberg"), "Science", "Chen Ning Yang et Robert Mills ont formulé cette théorie en 1954 pour généraliser l'électromagnétisme à des interactions nucléaires, jetant les bases du modèle standard de la physique des particules."),
            en = LocalizedContent("Which scientist discovered the non-abelian Yang-Mills theory?", listOf("Yang and Mills", "Albert Einstein", "Max Planck", "Werner Heisenberg"), "Science", "Chen Ning Yang and Robert Mills formulated this theory in 1954 to generalize electromagnetism to nuclear interactions, laying the foundations of the standard model of particle physics."),
            zh = LocalizedContent("哪位科学家发现了非阿贝尔杨-米尔斯理论？", listOf("杨振宁和米尔斯", "阿尔伯特·爱因斯坦", "马克斯·普朗克", "维尔纳·海森堡"), "科学", "杨振宁和罗伯特·米尔斯于1954年提出了这一理论，将电磁学推广到核相互作用，为粒子物理标准模型奠定了基础。"),
            es = LocalizedContent("¿Qué científico descubrió la teoría de Yang-Mills no abeliana?", listOf("Yang y Mills", "Albert Einstein", "Max Planck", "Werner Heisenberg"), "Ciencia", "Chen Ning Yang y Robert Mills formularon esta teoría en 1954 para generalizar el electromagnetismo a interacciones nucleares, sentando las bases del modelo estándar de la física de partículas.")
        ),
        BilingualQuestion(
            id = 8946, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le symbole chimique du dibenzothiophène?", listOf("C12H8S", "C12H10S", "C12H6S", "C12H12S"), "Science", "Le dibenzothiophène est un composé organique soufré, sa formule chimique est C12H10S, indiquant 12 atomes de carbone, 10 d'hydrogène et un de soufre."),
            en = LocalizedContent("What is the chemical symbol of dibenzothiophene?", listOf("C12H8S", "C12H10S", "C12H6S", "C12H12S"), "Science", "Dibenzothiophene is an organosulfur compound, its chemical formula is C12H10S, indicating 12 carbon atoms, 10 hydrogen atoms, and one sulfur atom."),
            zh = LocalizedContent("二苯并噻吩的化学式是什么？", listOf("C12H8S", "C12H10S", "C12H6S", "C12H12S"), "科学", "二苯并噻吩是一种有机硫化合物，其化学式为C12H10S，表示12个碳原子、10个氢原子和1个硫原子。"),
            es = LocalizedContent("¿Cuál es el símbolo químico del dibenzotiofeno?", listOf("C12H8S", "C12H10S", "C12H6S", "C12H12S"), "Ciencia", "El dibenzotiofeno es un compuesto orgánico de azufre, su fórmula química es C12H10S, que indica 12 átomos de carbono, 10 de hidrógeno y uno de azufre.")
        ),
        BilingualQuestion(
            id = 8947, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de récepteurs olfactifs a l'humain?", listOf("~400", "~100", "~800", "~1000"), "Science", "L'humain possède environ 400 récepteurs olfactifs fonctionnels, ce qui est bien moins que chez d'autres mammifères comme les rongeurs, mais permet tout de même de distinguer des milliers d'odeurs."),
            en = LocalizedContent("How many olfactory receptors does a human have?", listOf("~400", "~100", "~800", "~1000"), "Science", "Humans have about 400 functional olfactory receptors, which is far fewer than other mammals like rodents, but still allows distinguishing thousands of odors."),
            zh = LocalizedContent("人类有多少种嗅觉受体？", listOf("约400", "约100", "约800", "约1000"), "科学", "人类约有400种功能性嗅觉受体，远少于啮齿动物等其他哺乳动物，但仍能区分数千种气味。"),
            es = LocalizedContent("¿Cuántos receptores olfativos tiene un humano?", listOf("~400", "~100", "~800", "~1000"), "Ciencia", "Los humanos tienen alrededor de 400 receptores olfativos funcionales, muchos menos que otros mamíferos como los roedores, pero aún así permiten distinguir miles de olores.")
        ),
        BilingualQuestion(
            id = 8948, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel gland produit la FSH?", listOf("Hypophyse antérieure", "Hypothalamus", "Thyroïde", "Pancréas"), "Science", "L'hypothalamus produit la FSH via la GnRH, qui stimule l'hypophyse. La FSH est ensuite libérée par l'hypophyse, pas directement par l'hypothalamus."),
            en = LocalizedContent("Which gland produces FSH?", listOf("Anterior pituitary", "Hypothalamus", "Thyroid", "Pancreas"), "Science", "The hypothalamus produces GnRH which stimulates the pituitary. FSH is then released by the anterior pituitary, not directly by the hypothalamus."),
            zh = LocalizedContent("哪个腺体产生促卵泡激素（FSH）？", listOf("垂体前叶", "下丘脑", "甲状腺", "胰腺"), "科学", "下丘脑产生促性腺激素释放激素（GnRH），刺激垂体。FSH随后由垂体前叶释放，而非直接由下丘脑释放。"),
            es = LocalizedContent("¿Qué glándula produce la FSH?", listOf("Hipófisis anterior", "Hipotálamo", "Tiroides", "Páncreas"), "Ciencia", "El hipotálamo produce GnRH que estimula la hipófisis. La FSH es liberada por la hipófisis anterior, no directamente por el hipotálamo.")
        ),
        BilingualQuestion(
            id = 8949, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plus grand mur antique?", listOf("Grande Muraille de Chine", "Mur d'Hadrien", "Mur d'Antonin", "Murs de Jéricho"), "Science", "Le mur d'Hadrien, construit par l'Empire romain en Grande-Bretagne, s'étend sur 117 km, ce qui en fait le plus long mur antique."),
            en = LocalizedContent("What is the largest ancient wall?", listOf("Great Wall of China", "Hadrian's Wall", "Antonine Wall", "Walls of Jericho"), "Science", "Hadrian's Wall, built by the Roman Empire in Britain, stretches 117 km, making it the longest ancient wall."),
            zh = LocalizedContent("最大的古代城墙是什么？", listOf("中国长城", "哈德良长城", "安东尼长城", "杰里科城墙"), "科学", "哈德良长城由罗马帝国在不列颠修建，全长117公里，是最长的古代城墙。"),
            es = LocalizedContent("¿Cuál es el muro antiguo más grande?", listOf("Gran Muralla China", "Muro de Adriano", "Muro de Antonino", "Murallas de Jericó"), "Ciencia", "El Muro de Adriano, construido por el Imperio Romano en Gran Bretaña, se extiende 117 km, lo que lo convierte en el muro antiguo más largo.")
        ),
        BilingualQuestion(
            id = 8950, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel scientifique a découvert la gravité semi-classique?", listOf("Théorique", "Albert Einstein", "Max Planck", "Werner Heisenberg"), "Science", "La gravité semi-classique est un cadre théorique qui combine la relativité générale classique avec la théorie quantique des champs, sans être une théorie quantique complète de la gravité. Elle est donc principalement étudiée par des physiciens théoriciens."),
            en = LocalizedContent("Which scientist discovered semiclassical gravity?", listOf("Theoretical", "Albert Einstein", "Max Planck", "Werner Heisenberg"), "Science", "Semiclassical gravity is a theoretical framework that combines classical general relativity with quantum field theory, without being a complete quantum theory of gravity. It is therefore primarily studied by theoretical physicists."),
            zh = LocalizedContent("哪位科学家发现了半经典引力？", listOf("理论物理学家", "阿尔伯特·爱因斯坦", "马克斯·普朗克", "维尔纳·海森堡"), "科学", "半经典引力是一个理论框架，将经典广义相对论与量子场论结合起来，但并非完整的量子引力理论。因此，它主要由理论物理学家研究。"),
            es = LocalizedContent("¿Qué científico descubrió la gravedad semiclásica?", listOf("Teórico", "Albert Einstein", "Max Planck", "Werner Heisenberg"), "Ciencia", "La gravedad semiclásica es un marco teórico que combina la relatividad general clásica con la teoría cuántica de campos, sin ser una teoría cuántica completa de la gravedad. Por lo tanto, es estudiada principalmente por físicos teóricos.")
        ),
        BilingualQuestion(
            id = 8951, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le symbole chimique du fluoranthène?", listOf("C16H10", "C16H8", "C16H12", "C16H6"), "Science", "Le fluoranthène est un hydrocarbure aromatique polycyclique composé de 16 atomes de carbone et 10 d'hydrogène, d'où son symbole chimique C16H10."),
            en = LocalizedContent("What is the chemical symbol of fluoranthene?", listOf("C16H10", "C16H8", "C16H12", "C16H6"), "Science", "Fluoranthene is a polycyclic aromatic hydrocarbon composed of 16 carbon atoms and 10 hydrogen atoms, hence its chemical formula C16H10."),
            zh = LocalizedContent("荧蒽的化学符号是什么？", listOf("C16H10", "C16H8", "C16H12", "C16H6"), "科学", "荧蒽是一种多环芳烃，由16个碳原子和10个氢原子组成，因此其化学式为C16H10。"),
            es = LocalizedContent("¿Cuál es el símbolo químico del fluoranteno?", listOf("C16H10", "C16H8", "C16H12", "C16H6"), "Ciencia", "El fluoranteno es un hidrocarburo aromático policíclico compuesto por 16 átomos de carbono y 10 de hidrógeno, de ahí su fórmula química C16H10.")
        ),
        BilingualQuestion(
            id = 8952, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quelle est la concentration du cholestérol HDL dans le plasma?", listOf("35-65 mg/100 mL", "20-35 mg/100 mL", "70-100 mg/100 mL", "100-130 mg/100 mL"), "Science", "Le cholestérol HDL, dit \"bon cholestérol\", a une concentration plasmatique normale comprise entre 35 et 65 mg/100 mL, car il aide à éliminer l'excès de cholestérol des artères."),
            en = LocalizedContent("What is the concentration of HDL cholesterol in plasma?", listOf("35-65 mg/100 mL", "20-35 mg/100 mL", "70-100 mg/100 mL", "100-130 mg/100 mL"), "Science", "HDL cholesterol, known as \"good cholesterol,\" has a normal plasma concentration between 35 and 65 mg/100 mL, as it helps remove excess cholesterol from arteries."),
            zh = LocalizedContent("血浆中高密度脂蛋白胆固醇的浓度是多少？", listOf("35-65 mg/100 mL", "20-35 mg/100 mL", "70-100 mg/100 mL", "100-130 mg/100 mL"), "科学", "高密度脂蛋白胆固醇，即“好胆固醇”，其正常血浆浓度在35至65 mg/100 mL之间，因为它有助于清除动脉中的多余胆固醇。"),
            es = LocalizedContent("¿Cuál es la concentración de colesterol HDL en el plasma?", listOf("35-65 mg/100 mL", "20-35 mg/100 mL", "70-100 mg/100 mL", "100-130 mg/100 mL"), "Ciencia", "El colesterol HDL, conocido como \"colesterol bueno\", tiene una concentración plasmática normal entre 35 y 65 mg/100 mL, ya que ayuda a eliminar el exceso de colesterol de las arterias.")
        ),
        BilingualQuestion(
            id = 8953, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel élément chimique a la configuration électronique la plus stable?", listOf("Gaz nobles", "Métaux alcalins", "Halogènes", "Métaux de transition"), "Science", "Les gaz nobles possèdent une couche électronique de valence complète (8 électrons, sauf l'hélium avec 2), ce qui leur confère une stabilité chimique maximale et une très faible réactivité."),
            en = LocalizedContent("Which chemical element has the most stable electron configuration?", listOf("Noble gases", "Alkali metals", "Halogens", "Transition metals"), "Science", "Noble gases have a complete valence electron shell (8 electrons, except helium with 2), which gives them maximum chemical stability and very low reactivity."),
            zh = LocalizedContent("哪种化学元素具有最稳定的电子构型？", listOf("稀有气体", "碱金属", "卤素", "过渡金属"), "科学", "稀有气体具有完整的价电子层（8个电子，氦除外有2个），这赋予了它们最大的化学稳定性和极低的反应性。"),
            es = LocalizedContent("¿Qué elemento químico tiene la configuración electrónica más estable?", listOf("Gases nobles", "Metales alcalinos", "Halógenos", "Metales de transición"), "Ciencia", "Los gases nobles tienen una capa de electrones de valencia completa (8 electrones, excepto el helio con 2), lo que les confiere máxima estabilidad química y muy baja reactividad.")
        ),
        BilingualQuestion(
            id = 8954, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel scientifique a découvert la théorie de Chern-Simons?", listOf("Théorique", "Albert Einstein", "Max Planck", "Werner Heisenberg"), "Science", "Shiing-Shen Chern et James Simons ont formulé cette théorie en mathématiques et physique théorique dans les années 1970."),
            en = LocalizedContent("Which scientist discovered the Chern-Simons theory?", listOf("Theoretical", "Albert Einstein", "Max Planck", "Werner Heisenberg"), "Science", "Shiing-Shen Chern and James Simons formulated this theory in mathematics and theoretical physics in the 1970s."),
            zh = LocalizedContent("哪位科学家发现了陈-西蒙斯理论？", listOf("理论物理学家", "阿尔伯特·爱因斯坦", "马克斯·普朗克", "维尔纳·海森堡"), "科学", "陈省身和詹姆斯·西蒙斯在20世纪70年代在数学和理论物理学中提出了这一理论。"),
            es = LocalizedContent("¿Qué científico descubrió la teoría de Chern-Simons?", listOf("Teórico", "Albert Einstein", "Max Planck", "Werner Heisenberg"), "Ciencia", "Shiing-Shen Chern y James Simons formularon esta teoría en matemáticas y física teórica en la década de 1970.")
        ),
        BilingualQuestion(
            id = 8955, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le symbole chimique de l'acenaphthène?", listOf("C12H8", "C12H10", "C12H6", "C12H12"), "Science", "L'acénaphtène est un hydrocarbure aromatique polycyclique composé de 12 atomes de carbone et 8 atomes d'hydrogène, d'où sa formule brute C12H8."),
            en = LocalizedContent("What is the chemical symbol of acenaphthene?", listOf("C12H8", "C12H10", "C12H6", "C12H12"), "Science", "Acenaphthene is a polycyclic aromatic hydrocarbon composed of 12 carbon atoms and 8 hydrogen atoms, hence its molecular formula C12H8."),
            zh = LocalizedContent("苊的化学符号是什么？", listOf("C12H8", "C12H10", "C12H6", "C12H12"), "科学", "苊是一种多环芳烃，由12个碳原子和8个氢原子组成，因此其分子式为C12H8。"),
            es = LocalizedContent("¿Cuál es el símbolo químico del acenafteno?", listOf("C12H8", "C12H10", "C12H6", "C12H12"), "Ciencia", "El acenafteno es un hidrocarburo aromático policíclico compuesto por 12 átomos de carbono y 8 de hidrógeno, de ahí su fórmula molecular C12H8.")
        ),
        BilingualQuestion(
            id = 8956, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de récepteurs gustatifs a la langue?", listOf("~5000-10000", "~1000-2000", "~10000-15000", "~15000-20000"), "Science", "La langue humaine contient entre 5 000 et 10 000 papilles gustatives, chacune abritant des cellules réceptrices capables de détecter les saveurs."),
            en = LocalizedContent("How many taste receptors does the tongue have?", listOf("~5000-10000", "~1000-2000", "~10000-15000", "~15000-20000"), "Science", "The human tongue contains between 5,000 and 10,000 taste buds, each housing receptor cells capable of detecting flavors."),
            zh = LocalizedContent("舌头有多少个味觉感受器？", listOf("约5000-10000", "约1000-2000", "约10000-15000", "约15000-20000"), "科学", "人类舌头含有5000到10000个味蕾，每个味蕾内含有能够检测味道的受体细胞。"),
            es = LocalizedContent("¿Cuántos receptores gustativos tiene la lengua?", listOf("~5000-10000", "~1000-2000", "~10000-15000", "~15000-20000"), "Ciencia", "La lengua humana contiene entre 5,000 y 10,000 papilas gustativas, cada una alberga células receptoras capaces de detectar sabores.")
        ),
        BilingualQuestion(
            id = 8957, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel gland produit la hormone du lutéal?", listOf("Hypophyse antérieure", "Hypothalamus", "Thyroïde", "Pancréas"), "Science", "L'hormone lutéinisante (LH) est produite par l'hypophyse antérieure, une glande endocrine située à la base du cerveau. Elle joue un rôle clé dans la régulation du cycle menstruel et de l'ovulation."),
            en = LocalizedContent("Which gland produces the luteal hormone?", listOf("Anterior pituitary", "Hypothalamus", "Thyroid", "Pancreas"), "Science", "Luteinizing hormone (LH) is produced by the anterior pituitary gland, an endocrine gland located at the base of the brain. It plays a key role in regulating the menstrual cycle and ovulation."),
            zh = LocalizedContent("哪个腺体产生黄体激素？", listOf("垂体前叶", "下丘脑", "甲状腺", "胰腺"), "科学", "黄体生成素（LH）由垂体前叶产生，垂体前叶是位于大脑底部的一个内分泌腺。它在调节月经周期和排卵中起关键作用。"),
            es = LocalizedContent("¿Qué glándula produce la hormona lútea?", listOf("Hipófisis anterior", "Hipotálamo", "Tiroides", "Páncreas"), "Ciencia", "La hormona luteinizante (LH) es producida por la hipófisis anterior, una glándula endocrina ubicada en la base del cerebro. Desempeña un papel clave en la regulación del ciclo menstrual y la ovulación.")
        ),
        BilingualQuestion(
            id = 8958, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand temple antique?", listOf("Parthénon", "Temple de Jupiter", "Temple de Diane d'Éphèse", "Temple de Hatshepsut"), "Science", "Le Parthénon, situé sur l'Acropole d'Athènes, est souvent considéré comme le plus grand temple antique grec, dédié à la déesse Athéna."),
            en = LocalizedContent("What is the largest ancient temple?", listOf("Parthenon", "Temple of Jupiter", "Temple of Artemis at Ephesus", "Temple of Hatshepsut"), "Science", "The Parthenon, located on the Acropolis of Athens, is often considered the largest ancient Greek temple, dedicated to the goddess Athena."),
            zh = LocalizedContent("最大的古代神庙是什么？", listOf("帕特农神庙", "朱庇特神庙", "以弗所的阿尔忒弥斯神庙", "哈特谢普苏特神庙"), "科学", "帕特农神庙位于雅典卫城，通常被认为是最大的古希腊神庙，供奉女神雅典娜。"),
            es = LocalizedContent("¿Cuál es el templo antiguo más grande?", listOf("Partenón", "Templo de Júpiter", "Templo de Artemisa en Éfeso", "Templo de Hatshepsut"), "Ciencia", "El Partenón, ubicado en la Acrópolis de Atenas, a menudo se considera el templo griego antiguo más grande, dedicado a la diosa Atenea.")
        ),
        BilingualQuestion(
            id = 8959, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel scientifique a découvert la théorie de Toda classique?", listOf("Théorique", "Albert Einstein", "Max Planck", "Werner Heisenberg"), "Science", "Morikazu Toda, un physicien théoricien japonais, a formulé cette théorie en 1967 pour modéliser les interactions non linéaires dans les chaînes de particules."),
            en = LocalizedContent("Which scientist discovered the classical Toda theory?", listOf("Theoretical", "Albert Einstein", "Max Planck", "Werner Heisenberg"), "Science", "Morikazu Toda, a Japanese theoretical physicist, formulated this theory in 1967 to model nonlinear interactions in particle chains."),
            zh = LocalizedContent("哪位科学家发现了经典户田理论？", listOf("理论物理学家", "阿尔伯特·爱因斯坦", "马克斯·普朗克", "维尔纳·海森堡"), "科学", "日本理论物理学家户田盛和在1967年提出了这一理论，用于模拟粒子链中的非线性相互作用。"),
            es = LocalizedContent("¿Qué científico descubrió la teoría clásica de Toda?", listOf("Teórico", "Albert Einstein", "Max Planck", "Werner Heisenberg"), "Ciencia", "Morikazu Toda, un físico teórico japonés, formuló esta teoría en 1967 para modelar interacciones no lineales en cadenas de partículas.")
        ),
        BilingualQuestion(
            id = 8960, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le symbole chimique du benzo[c]phénanthrène?", listOf("C18H12", "C18H10", "C18H14", "C18H8"), "Science", "Le benzo[c]phénanthrène est un hydrocarbure aromatique polycyclique composé de 18 atomes de carbone et 12 atomes d'hydrogène, d'où sa formule brute C18H12."),
            en = LocalizedContent("What is the chemical symbol of benzo[c]phenanthrene?", listOf("C18H12", "C18H10", "C18H14", "C18H8"), "Science", "Benzo[c]phenanthrene is a polycyclic aromatic hydrocarbon composed of 18 carbon atoms and 12 hydrogen atoms, hence its molecular formula C18H12."),
            zh = LocalizedContent("苯并[c]菲的化学符号是什么？", listOf("C18H12", "C18H10", "C18H14", "C18H8"), "科学", "苯并[c]菲是一种多环芳烃，由18个碳原子和12个氢原子组成，因此其分子式为C18H12。"),
            es = LocalizedContent("¿Cuál es el símbolo químico del benzo[c]fenantreno?", listOf("C18H12", "C18H10", "C18H14", "C18H8"), "Ciencia", "El benzo[c]fenantreno es un hidrocarburo aromático policíclico compuesto por 18 átomos de carbono y 12 átomos de hidrógeno, de ahí su fórmula molecular C18H12.")
        ),
        BilingualQuestion(
            id = 8961, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quelle est la concentration du cholestérol LDL dans le plasma?", listOf("130-160 mg/100 mL", "100-130 mg/100 mL", "160-190 mg/100 mL", "190-220 mg/100 mL"), "Science", "Le cholestérol LDL, dit « mauvais cholestérol », est considéré comme normal entre 130 et 160 mg/100 mL de plasma, au-delà augmentant le risque cardiovasculaire."),
            en = LocalizedContent("What is the concentration of LDL cholesterol in plasma?", listOf("130-160 mg/100 mL", "100-130 mg/100 mL", "160-190 mg/100 mL", "190-220 mg/100 mL"), "Science", "LDL cholesterol, known as 'bad cholesterol', is considered normal between 130 and 160 mg/100 mL of plasma, above which cardiovascular risk increases."),
            zh = LocalizedContent("血浆中低密度脂蛋白胆固醇的浓度是多少？", listOf("130-160 mg/100 mL", "100-130 mg/100 mL", "160-190 mg/100 mL", "190-220 mg/100 mL"), "科学", "低密度脂蛋白胆固醇，即“坏胆固醇”，在血浆中正常范围为130至160 mg/100 mL，超过此值会增加心血管风险。"),
            es = LocalizedContent("¿Cuál es la concentración de colesterol LDL en el plasma?", listOf("130-160 mg/100 mL", "100-130 mg/100 mL", "160-190 mg/100 mL", "190-220 mg/100 mL"), "Ciencia", "El colesterol LDL, conocido como 'colesterol malo', se considera normal entre 130 y 160 mg/100 mL de plasma, por encima de lo cual aumenta el riesgo cardiovascular.")
        ),
        BilingualQuestion(
            id = 8962, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel élément chimique n'a pas de configuration stable?", listOf("Technétium", "Francium", "Astatine", "Plutonium"), "Science", "Le technétium est un élément synthétique radioactif dont tous les isotopes sont instables, ce qui en fait le premier élément du tableau périodique sans isotope stable."),
            en = LocalizedContent("Which chemical element has no stable configuration?", listOf("Technetium", "Francium", "Astatine", "Plutonium"), "Science", "Technetium is a synthetic radioactive element whose all isotopes are unstable, making it the first element in the periodic table without a stable isotope."),
            zh = LocalizedContent("哪种化学元素没有稳定构型？", listOf("锝", "钫", "砹", "钚"), "科学", "锝是一种合成放射性元素，其所有同位素都不稳定，使其成为元素周期表中第一个没有稳定同位素的元素。"),
            es = LocalizedContent("¿Qué elemento químico no tiene configuración estable?", listOf("Tecnecio", "Francio", "Ástato", "Plutonio"), "Ciencia", "El tecnecio es un elemento sintético radiactivo cuyos isótopos son todos inestables, lo que lo convierte en el primer elemento de la tabla periódica sin isótopo estable.")
        ),
        BilingualQuestion(
            id = 8963, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel scientifique a découvert les théories de jauge supersymétriques?", listOf("Théorique", "Albert Einstein", "Max Planck", "Werner Heisenberg"), "Science", "Les théories de jauge supersymétriques sont des concepts de physique théorique, développés par des scientifiques comme Julius Wess et Bruno Zumino, sans découverte expérimentale directe."),
            en = LocalizedContent("Which scientist discovered supersymmetric gauge theories?", listOf("Theoretical", "Albert Einstein", "Max Planck", "Werner Heisenberg"), "Science", "Supersymmetric gauge theories are concepts in theoretical physics, developed by scientists such as Julius Wess and Bruno Zumino, without direct experimental discovery."),
            zh = LocalizedContent("哪位科学家发现了超对称规范理论？", listOf("理论", "阿尔伯特·爱因斯坦", "马克斯·普朗克", "维尔纳·海森堡"), "科学", "超对称规范理论是理论物理中的概念，由朱利叶斯·韦斯和布鲁诺·祖米诺等科学家发展，没有直接的实验发现。"),
            es = LocalizedContent("¿Qué científico descubrió las teorías de gauge supersimétricas?", listOf("Teórico", "Albert Einstein", "Max Planck", "Werner Heisenberg"), "Ciencia", "Las teorías de gauge supersimétricas son conceptos de física teórica, desarrollados por científicos como Julius Wess y Bruno Zumino, sin descubrimiento experimental directo.")
        ),
        BilingualQuestion(
            id = 8964, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le symbole chimique de l'acenaphthylène?", listOf("C12H6", "C12H8", "C12H10", "C12H12"), "Science", "L'acenaphthylène est un hydrocarbure aromatique polycyclique de formule brute C12H6, composé de 12 atomes de carbone et 6 atomes d'hydrogène."),
            en = LocalizedContent("What is the chemical symbol of acenaphthylene?", listOf("C12H6", "C12H8", "C12H10", "C12H12"), "Science", "Acenaphthylene is a polycyclic aromatic hydrocarbon with molecular formula C12H6, composed of 12 carbon atoms and 6 hydrogen atoms."),
            zh = LocalizedContent("苊烯的化学符号是什么？", listOf("C12H6", "C12H8", "C12H10", "C12H12"), "科学", "苊烯是一种多环芳烃，分子式为C12H6，由12个碳原子和6个氢原子组成。"),
            es = LocalizedContent("¿Cuál es el símbolo químico del acenaftileno?", listOf("C12H6", "C12H8", "C12H10", "C12H12"), "Ciencia", "El acenaftileno es un hidrocarburo aromático policíclico de fórmula molecular C12H6, compuesto por 12 átomos de carbono y 6 átomos de hidrógeno.")
        ),
        BilingualQuestion(
            id = 8965, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de glandes sébacées a la peau?", listOf("~2 millions", "~1 million", "~5 millions", "~10 millions"), "Science", "La peau humaine contient environ 2 millions de glandes sébacées, réparties sur tout le corps sauf les paumes et les plantes, et leur fonction est de produire du sébum pour lubrifier et protéger la peau."),
            en = LocalizedContent("How many sebaceous glands does the skin have?", listOf("~2 million", "~1 million", "~5 million", "~10 million"), "Science", "Human skin contains about 2 million sebaceous glands, distributed all over the body except palms and soles, and their function is to produce sebum to lubricate and protect the skin."),
            zh = LocalizedContent("皮肤有多少个皮脂腺？", listOf("约200万", "约100万", "约500万", "约1000万"), "科学", "人类皮肤含有约200万个皮脂腺，分布在全身除手掌和脚底以外的部位，其功能是产生皮脂以润滑和保护皮肤。"),
            es = LocalizedContent("¿Cuántas glándulas sebáceas tiene la piel?", listOf("~2 millones", "~1 millón", "~5 millones", "~10 millones"), "Ciencia", "La piel humana contiene aproximadamente 2 millones de glándulas sebáceas, distribuidas por todo el cuerpo excepto palmas y plantas, y su función es producir sebo para lubricar y proteger la piel.")
        ),
        BilingualQuestion(
            id = 8966, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel gland produit la hormone de relaxine?", listOf("Ovaire", "Hypophyse", "Thyroïde", "Pancréas"), "Science", "La relaxine est une hormone principalement sécrétée par le corps jaune de l'ovaire pendant la grossesse, où elle aide à détendre les ligaments pelviens et à inhiber les contractions utérines."),
            en = LocalizedContent("Which gland produces the hormone relaxin?", listOf("Ovary", "Pituitary", "Thyroid", "Pancreas"), "Science", "Relaxin is a hormone primarily secreted by the corpus luteum of the ovary during pregnancy, where it helps relax pelvic ligaments and inhibit uterine contractions."),
            zh = LocalizedContent("哪个腺体产生松弛素？", listOf("卵巢", "垂体", "甲状腺", "胰腺"), "科学", "松弛素是一种主要在妊娠期间由卵巢黄体分泌的激素，有助于放松骨盆韧带并抑制子宫收缩。"),
            es = LocalizedContent("¿Qué glándula produce la hormona relaxina?", listOf("Ovario", "Hipófisis", "Tiroides", "Páncreas"), "Ciencia", "La relaxina es una hormona secretada principalmente por el cuerpo lúteo del ovario durante el embarazo, donde ayuda a relajar los ligamentos pélvicos e inhibir las contracciones uterinas.")
        ),
        BilingualQuestion(
            id = 8967, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand musée antique?", listOf("Musée d'Alexandrie", "Bibliothèque d'Alexandrie", "Musée du Louvre", "Musée Britannique"), "Science", "Le Musée d'Alexandrie, fondé au IIIe siècle av. J.-C., était un centre de recherche et d'enseignement majeur de l'Antiquité, abritant la célèbre Bibliothèque d'Alexandrie."),
            en = LocalizedContent("What is the largest ancient museum?", listOf("Museum of Alexandria", "Library of Alexandria", "Louvre Museum", "British Museum"), "Science", "The Museum of Alexandria, founded in the 3rd century BC, was a major research and teaching center of antiquity, housing the famous Library of Alexandria."),
            zh = LocalizedContent("最大的古代博物馆是什么？", listOf("亚历山大博物馆", "亚历山大图书馆", "卢浮宫", "大英博物馆"), "科学", "亚历山大博物馆建于公元前3世纪，是古代重要的研究和教学中心，收藏了著名的亚历山大图书馆。"),
            es = LocalizedContent("¿Cuál es el museo antiguo más grande?", listOf("Museo de Alejandría", "Biblioteca de Alejandría", "Museo del Louvre", "Museo Británico"), "Ciencia", "El Museo de Alejandría, fundado en el siglo III a.C., fue un importante centro de investigación y enseñanza de la antigüedad, que albergaba la famosa Biblioteca de Alejandría.")
        ),
        BilingualQuestion(
            id = 8968, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel scientifique a découvert les théories topologiques?", listOf("Théorique", "Albert Einstein", "Max Planck", "Werner Heisenberg"), "Science", "Le terme \"théorique\" ne désigne pas un scientifique spécifique, mais plutôt le domaine abstrait des mathématiques où les théories topologiques ont été développées par plusieurs chercheurs comme Henri Poincaré."),
            en = LocalizedContent("Which scientist discovered topological theories?", listOf("Theoretical", "Albert Einstein", "Max Planck", "Werner Heisenberg"), "Science", "The term 'theoretical' does not refer to a specific scientist, but rather the abstract field of mathematics where topological theories were developed by several researchers like Henri Poincaré."),
            zh = LocalizedContent("哪位科学家发现了拓扑理论？", listOf("理论", "阿尔伯特·爱因斯坦", "马克斯·普朗克", "维尔纳·海森堡"), "科学", "“理论”一词并非指特定科学家，而是指数学的抽象领域，拓扑理论由亨利·庞加莱等多位研究者发展。"),
            es = LocalizedContent("¿Qué científico descubrió las teorías topológicas?", listOf("Teórico", "Albert Einstein", "Max Planck", "Werner Heisenberg"), "Ciencia", "El término 'teórico' no se refiere a un científico específico, sino al campo abstracto de las matemáticas donde las teorías topológicas fueron desarrolladas por varios investigadores como Henri Poincaré.")
        ),
        BilingualQuestion(
            id = 8969, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le symbole chimique du fluorène?", listOf("C13H10", "C13H8", "C13H12", "C13H6"), "Science", "Le fluorène est un hydrocarbure aromatique polycyclique de formule brute C13H10, composé de 13 atomes de carbone et 10 d'hydrogène."),
            en = LocalizedContent("What is the chemical symbol of fluorene?", listOf("C13H10", "C13H8", "C13H12", "C13H6"), "Science", "Fluorene is a polycyclic aromatic hydrocarbon with molecular formula C13H10, composed of 13 carbon atoms and 10 hydrogen atoms."),
            zh = LocalizedContent("芴的化学符号是什么？", listOf("C13H10", "C13H8", "C13H12", "C13H6"), "科学", "芴是一种多环芳烃，分子式为C13H10，由13个碳原子和10个氢原子组成。"),
            es = LocalizedContent("¿Cuál es el símbolo químico del fluoreno?", listOf("C13H10", "C13H8", "C13H12", "C13H6"), "Ciencia", "El fluoreno es un hidrocarburo aromático policíclico de fórmula molecular C13H10, compuesto por 13 átomos de carbono y 10 átomos de hidrógeno.")
        ),
        BilingualQuestion(
            id = 8970, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quelle est la concentration du cholestérol VLDL dans le plasma?", listOf("5-30 mg/100 mL", "1-5 mg/100 mL", "50-70 mg/100 mL", "70-100 mg/100 mL"), "Science", "Le cholestérol VLDL (lipoprotéine de très basse densité) transporte les triglycérides du foie vers les tissus, et sa concentration plasmatique normale se situe entre 5 et 30 mg/100 mL."),
            en = LocalizedContent("What is the concentration of VLDL cholesterol in plasma?", listOf("5-30 mg/100 mL", "1-5 mg/100 mL", "50-70 mg/100 mL", "70-100 mg/100 mL"), "Science", "VLDL (very low-density lipoprotein) cholesterol transports triglycerides from the liver to tissues, and its normal plasma concentration ranges from 5 to 30 mg/100 mL."),
            zh = LocalizedContent("血浆中极低密度脂蛋白胆固醇的浓度是多少？", listOf("5-30 mg/100 mL", "1-5 mg/100 mL", "50-70 mg/100 mL", "70-100 mg/100 mL"), "科学", "极低密度脂蛋白胆固醇将甘油三酯从肝脏运输到组织，其正常血浆浓度在5至30 mg/100 mL之间。"),
            es = LocalizedContent("¿Cuál es la concentración de colesterol VLDL en el plasma?", listOf("5-30 mg/100 mL", "1-5 mg/100 mL", "50-70 mg/100 mL", "70-100 mg/100 mL"), "Ciencia", "El colesterol VLDL (lipoproteína de muy baja densidad) transporta triglicéridos del hígado a los tejidos, y su concentración plasmática normal se sitúa entre 5 y 30 mg/100 mL.")
        ),
        BilingualQuestion(
            id = 8971, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel élément chimique a le plus grand nombre d'isotopes?", listOf("Étain", "Plomb", "Fer", "Nickel"), "Science", "L'étain possède 10 isotopes stables, le plus grand nombre pour un élément chimique, ce qui s'explique par sa configuration nucléaire particulièrement favorable."),
            en = LocalizedContent("Which chemical element has the largest number of isotopes?", listOf("Tin", "Lead", "Iron", "Nickel"), "Science", "Tin has 10 stable isotopes, the largest number for a chemical element, due to its particularly favorable nuclear configuration."),
            zh = LocalizedContent("哪种化学元素拥有最多的同位素？", listOf("锡", "铅", "铁", "镍"), "科学", "锡有10种稳定同位素，是化学元素中最多的，这归因于其特别有利的核结构。"),
            es = LocalizedContent("¿Qué elemento químico tiene el mayor número de isótopos?", listOf("Estaño", "Plomo", "Hierro", "Níquel"), "Ciencia", "El estaño posee 10 isótopos estables, el mayor número para un elemento químico, debido a su configuración nuclear particularmente favorable.")
        ),
        BilingualQuestion(
            id = 8972, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel scientifique a découvert la dualité T?", listOf("Théorique", "Albert Einstein", "Max Planck", "Werner Heisenberg"), "Science", "La dualité T est un concept de la théorie des cordes, découvert par des physiciens théoriciens dans les années 1980. Elle relie des théories de cordes apparemment différentes via des transformations mathématiques."),
            en = LocalizedContent("Which scientist discovered T-duality?", listOf("Theoretical", "Albert Einstein", "Max Planck", "Werner Heisenberg"), "Science", "T-duality is a concept in string theory, discovered by theoretical physicists in the 1980s. It relates seemingly different string theories through mathematical transformations."),
            zh = LocalizedContent("哪位科学家发现了T对偶性？", listOf("理论物理学家", "阿尔伯特·爱因斯坦", "马克斯·普朗克", "维尔纳·海森堡"), "科学", "T对偶性是弦理论中的一个概念，由理论物理学家在20世纪80年代发现。它通过数学变换将看似不同的弦理论联系起来。"),
            es = LocalizedContent("¿Qué científico descubrió la dualidad T?", listOf("Teórico", "Albert Einstein", "Max Planck", "Werner Heisenberg"), "Ciencia", "La dualidad T es un concepto de la teoría de cuerdas, descubierto por físicos teóricos en la década de 1980. Relaciona teorías de cuerdas aparentemente diferentes mediante transformaciones matemáticas.")
        ),
        BilingualQuestion(
            id = 8973, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le symbole chimique de la phénanthrène?", listOf("C14H10", "C14H8", "C14H12", "C14H6"), "Science", "La phénanthrène est un hydrocarbure aromatique polycyclique composé de 14 atomes de carbone et 10 d'hydrogène, d'où son symbole C14H10."),
            en = LocalizedContent("What is the chemical symbol of phenanthrene?", listOf("C14H10", "C14H8", "C14H12", "C14H6"), "Science", "Phenanthrene is a polycyclic aromatic hydrocarbon composed of 14 carbon atoms and 10 hydrogen atoms, hence its formula C14H10."),
            zh = LocalizedContent("菲的化学符号是什么？", listOf("C14H10", "C14H8", "C14H12", "C14H6"), "科学", "菲是一种多环芳烃，由14个碳原子和10个氢原子组成，因此其分子式为C14H10。"),
            es = LocalizedContent("¿Cuál es el símbolo químico del fenantreno?", listOf("C14H10", "C14H8", "C14H12", "C14H6"), "Ciencia", "El fenantreno es un hidrocarburo aromático policíclico compuesto por 14 átomos de carbono y 10 de hidrógeno, de ahí su fórmula C14H10.")
        ),
        BilingualQuestion(
            id = 8974, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de glandes sudoripares a la peau?", listOf("~2-3 millions", "~1 million", "~5 millions", "~10 millions"), "Science", "La peau humaine contient entre 2 et 3 millions de glandes sudoripares, réparties sur tout le corps, avec une densité plus élevée sur la paume des mains et la plante des pieds."),
            en = LocalizedContent("How many sweat glands does the skin have?", listOf("~2-3 million", "~1 million", "~5 million", "~10 million"), "Science", "Human skin contains between 2 and 3 million sweat glands, distributed throughout the body, with higher density on the palms of the hands and soles of the feet."),
            zh = LocalizedContent("皮肤有多少个汗腺？", listOf("约2-3百万", "约1百万", "约5百万", "约10百万"), "科学", "人类皮肤含有200万到300万个汗腺，分布在全身，手掌和脚底密度更高。"),
            es = LocalizedContent("¿Cuántas glándulas sudoríparas tiene la piel?", listOf("~2-3 millones", "~1 millón", "~5 millones", "~10 millones"), "Ciencia", "La piel humana contiene entre 2 y 3 millones de glándulas sudoríparas, distribuidas por todo el cuerpo, con mayor densidad en las palmas de las manos y las plantas de los pies.")
        ),
        BilingualQuestion(
            id = 8975, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel gland produit la hormone inhibitrice de prolactine?", listOf("Hypothalamus", "Hypophyse", "Thyroïde", "Pancréas"), "Science", "L'hypothalamus produit la dopamine, qui agit comme l'hormone inhibitrice de prolactine en régulant la sécrétion de prolactine par l'hypophyse."),
            en = LocalizedContent("Which gland produces prolactin-inhibiting hormone?", listOf("Hypothalamus", "Pituitary", "Thyroid", "Pancreas"), "Science", "The hypothalamus produces dopamine, which acts as the prolactin-inhibiting hormone by regulating prolactin secretion from the pituitary."),
            zh = LocalizedContent("哪个腺体产生催乳素抑制激素？", listOf("下丘脑", "垂体", "甲状腺", "胰腺"), "科学", "下丘脑产生多巴胺，它作为催乳素抑制激素，调节垂体分泌催乳素。"),
            es = LocalizedContent("¿Qué glándula produce la hormona inhibidora de prolactina?", listOf("Hipotálamo", "Hipófisis", "Tiroides", "Páncreas"), "Ciencia", "El hipotálamo produce dopamina, que actúa como la hormona inhibidora de prolactina al regular la secreción de prolactina por la hipófisis.")
        ),
        BilingualQuestion(
            id = 8976, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand grenier antique?", listOf("Grenier d'Alexandrie", "Grenier de Rome", "Grenier d'Égypte", "Grenier de Grèce"), "Science", "Le Grenier d'Alexandrie désigne la région fertile d'Égypte qui approvisionnait l'Empire romain en blé, faisant d'Alexandrie un centre majeur de stockage et d'exportation céréalière dans l'Antiquité."),
            en = LocalizedContent("What is the largest ancient granary?", listOf("Granary of Alexandria", "Granary of Rome", "Granary of Egypt", "Granary of Greece"), "Science", "The Granary of Alexandria refers to the fertile region of Egypt that supplied the Roman Empire with wheat, making Alexandria a major center for grain storage and export in antiquity."),
            zh = LocalizedContent("最大的古代粮仓是什么？", listOf("亚历山大粮仓", "罗马粮仓", "埃及粮仓", "希腊粮仓"), "科学", "亚历山大粮仓指的是埃及的肥沃地区，它为罗马帝国供应小麦，使亚历山大成为古代谷物储存和出口的主要中心。"),
            es = LocalizedContent("¿Cuál es el granero antiguo más grande?", listOf("Granero de Alejandría", "Granero de Roma", "Granero de Egipto", "Granero de Grecia"), "Ciencia", "El Granero de Alejandría se refiere a la región fértil de Egipto que abastecía al Imperio Romano de trigo, convirtiendo a Alejandría en un centro importante de almacenamiento y exportación de cereales en la antigüedad.")
        ),
        BilingualQuestion(
            id = 8977, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel scientifique a découvert la dualité S?", listOf("Théorique", "Albert Einstein", "Max Planck", "Werner Heisenberg"), "Science", "La dualité S est un concept de la théorie des cordes, développé par des physiciens théoriciens comme Edward Witten, et non par un expérimentateur."),
            en = LocalizedContent("Which scientist discovered S-duality?", listOf("Theoretical", "Albert Einstein", "Max Planck", "Werner Heisenberg"), "Science", "S-duality is a concept in string theory, developed by theoretical physicists such as Edward Witten, not by an experimenter."),
            zh = LocalizedContent("哪位科学家发现了S对偶性？", listOf("理论物理学家", "阿尔伯特·爱因斯坦", "马克斯·普朗克", "维尔纳·海森堡"), "科学", "S对偶性是弦理论中的一个概念，由爱德华·威滕等理论物理学家提出，而非实验物理学家。"),
            es = LocalizedContent("¿Qué científico descubrió la dualidad S?", listOf("Teórico", "Albert Einstein", "Max Planck", "Werner Heisenberg"), "Ciencia", "La dualidad S es un concepto de la teoría de cuerdas, desarrollado por físicos teóricos como Edward Witten, no por un experimentalista.")
        ),
        BilingualQuestion(
            id = 8978, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le symbole chimique du dibenzo[a,l]pyrène?", listOf("C26H16", "C26H14", "C26H18", "C26H12"), "Science", "Le dibenzo[a,l]pyrène est un hydrocarbure aromatique polycyclique composé de 26 atomes de carbone et 16 atomes d'hydrogène, d'où sa formule brute C26H16."),
            en = LocalizedContent("What is the chemical symbol of dibenzo[a,l]pyrene?", listOf("C26H16", "C26H14", "C26H18", "C26H12"), "Science", "Dibenzo[a,l]pyrene is a polycyclic aromatic hydrocarbon composed of 26 carbon atoms and 16 hydrogen atoms, hence its molecular formula C26H16."),
            zh = LocalizedContent("二苯并[a,l]芘的化学符号是什么？", listOf("C26H16", "C26H14", "C26H18", "C26H12"), "科学", "二苯并[a,l]芘是一种多环芳烃，由26个碳原子和16个氢原子组成，因此其分子式为C26H16。"),
            es = LocalizedContent("¿Cuál es el símbolo químico del dibenzo[a,l]pireno?", listOf("C26H16", "C26H14", "C26H18", "C26H12"), "Ciencia", "El dibenzo[a,l]pireno es un hidrocarburo aromático policíclico compuesto por 26 átomos de carbono y 16 de hidrógeno, de ahí su fórmula molecular C26H16.")
        ),
        BilingualQuestion(
            id = 8979, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quelle est la concentration des plaquettes dans le sang?", listOf("150-400 × 10³/μL", "50-150 × 10³/μL", "400-600 × 10³/μL", "600-800 × 10³/μL"), "Science", "Les plaquettes sont des fragments cellulaires essentiels à la coagulation. Leur taux normal se situe entre 150 000 et 400 000 par microlitre de sang."),
            en = LocalizedContent("What is the concentration of platelets in blood?", listOf("150-400 × 10³/μL", "50-150 × 10³/μL", "400-600 × 10³/μL", "600-800 × 10³/μL"), "Science", "Platelets are cell fragments essential for coagulation. Their normal count ranges from 150,000 to 400,000 per microliter of blood."),
            zh = LocalizedContent("血液中血小板的浓度是多少？", listOf("150-400 × 10³/μL", "50-150 × 10³/μL", "400-600 × 10³/μL", "600-800 × 10³/μL"), "科学", "血小板是凝血所必需的细胞碎片。其正常计数范围为每微升血液15万至40万个。"),
            es = LocalizedContent("¿Cuál es la concentración de plaquetas en la sangre?", listOf("150-400 × 10³/μL", "50-150 × 10³/μL", "400-600 × 10³/μL", "600-800 × 10³/μL"), "Ciencia", "Las plaquetas son fragmentos celulares esenciales para la coagulación. Su recuento normal oscila entre 150 000 y 400 000 por microlitro de sangre.")
        ),
        BilingualQuestion(
            id = 8980, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel élément chimique a le plus grand nombre de valences?", listOf("Carbone", "Oxygène", "Azote", "Soufre"), "Science", "Le carbone possède quatre électrons de valence, ce qui lui permet de former jusqu'à quatre liaisons covalentes, un nombre maximal parmi les éléments courants."),
            en = LocalizedContent("Which chemical element has the highest number of valences?", listOf("Carbon", "Oxygen", "Nitrogen", "Sulfur"), "Science", "Carbon has four valence electrons, allowing it to form up to four covalent bonds, the maximum among common elements."),
            zh = LocalizedContent("哪种化学元素的价电子数最多？", listOf("碳", "氧", "氮", "硫"), "科学", "碳有四个价电子，能形成最多四个共价键，在常见元素中数量最多。"),
            es = LocalizedContent("¿Qué elemento químico tiene el mayor número de valencias?", listOf("Carbono", "Oxígeno", "Nitrógeno", "Azufre"), "Ciencia", "El carbono tiene cuatro electrones de valencia, lo que le permite formar hasta cuatro enlaces covalentes, un número máximo entre los elementos comunes.")
        ),
        BilingualQuestion(
            id = 8981, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel scientifique a découvert la dualité U?", listOf("Théorique", "Albert Einstein", "Max Planck", "Werner Heisenberg"), "Science", "La dualité onde-particule, concept clé de la mécanique quantique, a été formalisée par Louis de Broglie, un physicien théoricien français, en 1924."),
            en = LocalizedContent("Which scientist discovered wave-particle duality?", listOf("Theoretical", "Albert Einstein", "Max Planck", "Werner Heisenberg"), "Science", "Wave-particle duality, a key concept in quantum mechanics, was formalized by Louis de Broglie, a French theoretical physicist, in 1924."),
            zh = LocalizedContent("哪位科学家发现了波粒二象性？", listOf("理论物理学家", "阿尔伯特·爱因斯坦", "马克斯·普朗克", "维尔纳·海森堡"), "科学", "波粒二象性是量子力学的关键概念，由法国理论物理学家路易·德布罗意于1924年正式提出。"),
            es = LocalizedContent("¿Qué científico descubrió la dualidad onda-partícula?", listOf("Teórico", "Albert Einstein", "Max Planck", "Werner Heisenberg"), "Ciencia", "La dualidad onda-partícula, concepto clave de la mecánica cuántica, fue formalizada por Louis de Broglie, un físico teórico francés, en 1924.")
        ),
        BilingualQuestion(
            id = 8982, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le symbole chimique du benzo[ghi]périlène?", listOf("C22H12", "C22H10", "C22H14", "C22H8"), "Science", "Le benzo[ghi]périlène est un hydrocarbure aromatique polycyclique composé de 22 atomes de carbone et 12 atomes d'hydrogène, d'où sa formule brute C22H12."),
            en = LocalizedContent("What is the chemical symbol of benzo[ghi]perylene?", listOf("C22H12", "C22H10", "C22H14", "C22H8"), "Science", "Benzo[ghi]perylene is a polycyclic aromatic hydrocarbon composed of 22 carbon atoms and 12 hydrogen atoms, hence its molecular formula C22H12."),
            zh = LocalizedContent("苯并[ghi]苝的化学符号是什么？", listOf("C22H12", "C22H10", "C22H14", "C22H8"), "科学", "苯并[ghi]苝是一种多环芳烃，由22个碳原子和12个氢原子组成，因此其分子式为C22H12。"),
            es = LocalizedContent("¿Cuál es el símbolo químico del benzo[ghi]perileno?", listOf("C22H12", "C22H10", "C22H14", "C22H8"), "Ciencia", "El benzo[ghi]perileno es un hidrocarburo aromático policíclico compuesto por 22 átomos de carbono y 12 átomos de hidrógeno, de ahí su fórmula molecular C22H12.")
        ),
        BilingualQuestion(
            id = 8983, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de fibres de collagène a la peau?", listOf("~3 kg", "~1 kg", "~5 kg", "~10 kg"), "Science", "Le collagène est la protéine la plus abondante dans le corps humain, représentant environ 30% de ses protéines totales, et la peau en contient environ 3 kg, principalement dans le derme."),
            en = LocalizedContent("How much collagen fiber does the skin contain?", listOf("~3 kg", "~1 kg", "~5 kg", "~10 kg"), "Science", "Collagen is the most abundant protein in the human body, accounting for about 30% of its total proteins, and the skin contains approximately 3 kg, mainly in the dermis."),
            zh = LocalizedContent("皮肤中含有多少胶原纤维？", listOf("约3公斤", "约1公斤", "约5公斤", "约10公斤"), "科学", "胶原蛋白是人体中最丰富的蛋白质，约占蛋白质总量的30%，皮肤中约含3公斤，主要分布在真皮层。"),
            es = LocalizedContent("¿Cuánta fibra de colágeno tiene la piel?", listOf("~3 kg", "~1 kg", "~5 kg", "~10 kg"), "Ciencia", "El colágeno es la proteína más abundante en el cuerpo humano, representando aproximadamente el 30% de sus proteínas totales, y la piel contiene alrededor de 3 kg, principalmente en la dermis.")
        ),
        BilingualQuestion(
            id = 8984, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel gland produit la parathormone?", listOf("Glande parathyroïde", "Hypophyse", "Thyroïde", "Pancréas"), "Science", "La parathormone est produite par les glandes parathyroïdes, situées derrière la thyroïde, et non par l'hypophyse. L'hypophyse sécrète d'autres hormones comme l'hormone de croissance."),
            en = LocalizedContent("Which gland produces parathyroid hormone?", listOf("Parathyroid gland", "Pituitary gland", "Thyroid", "Pancreas"), "Science", "Parathyroid hormone is produced by the parathyroid glands, located behind the thyroid, not by the pituitary gland. The pituitary secretes other hormones like growth hormone."),
            zh = LocalizedContent("哪个腺体产生甲状旁腺激素？", listOf("甲状旁腺", "垂体", "甲状腺", "胰腺"), "科学", "甲状旁腺激素由甲状旁腺产生，位于甲状腺后方，而非垂体。垂体分泌其他激素如生长激素。"),
            es = LocalizedContent("¿Qué glándula produce la parathormona?", listOf("Glándula paratiroides", "Hipófisis", "Tiroides", "Páncreas"), "Ciencia", "La parathormona es producida por las glándulas paratiroides, situadas detrás de la tiroides, y no por la hipófisis. La hipófisis secreta otras hormonas como la hormona del crecimiento.")
        ),
        BilingualQuestion(
            id = 8985, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand tombeau antique?", listOf("Tombeau de Qin Shi Huang", "Pyramide de Khéops", "Mausolée d'Halicarnasse", "Tombeau de Darius"), "Science", "Le tombeau de Qin Shi Huang, premier empereur de Chine, est le plus grand tombeau antique connu, abritant la célèbre armée de terre cuite. Sa construction a mobilisé des centaines de milliers d'ouvriers pendant près de 40 ans."),
            en = LocalizedContent("What is the largest ancient tomb?", listOf("Tomb of Qin Shi Huang", "Pyramid of Khufu", "Mausoleum at Halicarnassus", "Tomb of Darius"), "Science", "The tomb of Qin Shi Huang, the first emperor of China, is the largest known ancient tomb, housing the famous Terracotta Army. Its construction mobilized hundreds of thousands of workers for nearly 40 years."),
            zh = LocalizedContent("最大的古代陵墓是什么？", listOf("秦始皇陵", "胡夫金字塔", "摩索拉斯陵墓", "大流士墓"), "科学", "秦始皇陵是中国第一位皇帝的陵墓，是已知最大的古代陵墓，内有著名的兵马俑。其建造动用了数十万工人，历时近40年。"),
            es = LocalizedContent("¿Cuál es la tumba antigua más grande?", listOf("Tumba de Qin Shi Huang", "Pirámide de Keops", "Mausoleo de Halicarnaso", "Tumba de Darío"), "Ciencia", "La tumba de Qin Shi Huang, primer emperador de China, es la tumba antigua más grande conocida, que alberga el famoso ejército de terracota. Su construcción movilizó a cientos de miles de trabajadores durante casi 40 años.")
        ),
        BilingualQuestion(
            id = 8986, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel scientifique a découvert les conjectures en serre?", listOf("Théorique", "Albert Einstein", "Max Planck", "Werner Heisenberg"), "Science", "Svante Arrhenius a formulé la première théorie quantifiant l'effet de serre en 1896, reliant le dioxyde de carbone aux températures terrestres."),
            en = LocalizedContent("Which scientist discovered the greenhouse effect theory?", listOf("Theoretical", "Albert Einstein", "Max Planck", "Werner Heisenberg"), "Science", "Svante Arrhenius formulated the first theory quantifying the greenhouse effect in 1896, linking carbon dioxide to Earth's temperatures."),
            zh = LocalizedContent("哪位科学家发现了温室效应理论？", listOf("理论物理学家", "阿尔伯特·爱因斯坦", "马克斯·普朗克", "维尔纳·海森堡"), "科学", "斯万特·阿伦尼乌斯于1896年提出了第一个量化温室效应的理论，将二氧化碳与地球温度联系起来。"),
            es = LocalizedContent("¿Qué científico descubrió la teoría del efecto invernadero?", listOf("Teórico", "Albert Einstein", "Max Planck", "Werner Heisenberg"), "Ciencia", "Svante Arrhenius formuló la primera teoría que cuantifica el efecto invernadero en 1896, relacionando el dióxido de carbono con las temperaturas terrestres.")
        ),
        BilingualQuestion(
            id = 8987, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le symbole chimique de l'indène?", listOf("C9H8", "C9H6", "C9H10", "C9H4"), "Science", "L'indène est un hydrocarbure aromatique composé de 9 atomes de carbone et 8 atomes d'hydrogène, d'où son symbole chimique C9H8."),
            en = LocalizedContent("What is the chemical symbol of indene?", listOf("C9H8", "C9H6", "C9H10", "C9H4"), "Science", "Indene is an aromatic hydrocarbon composed of 9 carbon atoms and 8 hydrogen atoms, hence its chemical symbol C9H8."),
            zh = LocalizedContent("茚的化学符号是什么？", listOf("C9H8", "C9H6", "C9H10", "C9H4"), "科学", "茚是一种芳香烃，由9个碳原子和8个氢原子组成，因此其化学符号为C9H8。"),
            es = LocalizedContent("¿Cuál es el símbolo químico del indeno?", listOf("C9H8", "C9H6", "C9H10", "C9H4"), "Ciencia", "El indeno es un hidrocarburo aromático compuesto por 9 átomos de carbono y 8 átomos de hidrógeno, de ahí su símbolo químico C9H8.")
        ),
        BilingualQuestion(
            id = 8988, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quelle est la concentration de la myoglobine dans le muscle?", listOf("50-70 g/kg", "20-40 g/kg", "80-100 g/kg", "100-120 g/kg"), "Science", "La myoglobine, protéine stockant l'oxygène, est très concentrée dans les muscles pour soutenir l'effort, atteignant 50 à 70 g/kg chez les mammifères actifs."),
            en = LocalizedContent("What is the concentration of myoglobin in muscle?", listOf("50-70 g/kg", "20-40 g/kg", "80-100 g/kg", "100-120 g/kg"), "Science", "Myoglobin, an oxygen-storing protein, is highly concentrated in muscles to support exertion, reaching 50 to 70 g/kg in active mammals."),
            zh = LocalizedContent("肌肉中肌红蛋白的浓度是多少？", listOf("50-70克/千克", "20-40克/千克", "80-100克/千克", "100-120克/千克"), "科学", "肌红蛋白是一种储存氧气的蛋白质，在肌肉中浓度很高以支持运动，活跃的哺乳动物可达50至70克/千克。"),
            es = LocalizedContent("¿Cuál es la concentración de mioglobina en el músculo?", listOf("50-70 g/kg", "20-40 g/kg", "80-100 g/kg", "100-120 g/kg"), "Ciencia", "La mioglobina, una proteína que almacena oxígeno, está muy concentrada en los músculos para apoyar el esfuerzo, alcanzando 50 a 70 g/kg en mamíferos activos.")
        ),
        BilingualQuestion(
            id = 8989, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel élément chimique est le plus densément compacté?", listOf("Osmium", "Iridium", "Platine", "Tungstène"), "Science", "L'iridium est l'élément le plus dense, avec une densité d'environ 22,56 g/cm³, dépassant l'osmium dans des conditions standards."),
            en = LocalizedContent("Which chemical element is the most densely packed?", listOf("Osmium", "Iridium", "Platinum", "Tungsten"), "Science", "Iridium is the densest element, with a density of about 22.56 g/cm³, surpassing osmium under standard conditions."),
            zh = LocalizedContent("哪种化学元素密度最大？", listOf("锇", "铱", "铂", "钨"), "科学", "铱是密度最大的元素，密度约为22.56克/立方厘米，在标准条件下超过锇。"),
            es = LocalizedContent("¿Qué elemento químico es el más densamente compactado?", listOf("Osmio", "Iridio", "Platino", "Tungsteno"), "Ciencia", "El iridio es el elemento más denso, con una densidad de aproximadamente 22,56 g/cm³, superando al osmio en condiciones estándar.")
        ),
        BilingualQuestion(
            id = 8990, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel scientifique a découvert la théorie des cordes hétérotiques?", listOf("Théorique", "Albert Einstein", "Max Planck", "Werner Heisenberg"), "Science", "La théorie des cordes hétérotiques a été développée par David Gross, Jeffrey Harvey, Emil Martinec et Ryan Rohm en 1985, combinant des aspects des cordes bosoniques et supercordes."),
            en = LocalizedContent("Which scientist discovered the heterotic string theory?", listOf("Theoretical", "Albert Einstein", "Max Planck", "Werner Heisenberg"), "Science", "The heterotic string theory was developed by David Gross, Jeffrey Harvey, Emil Martinec, and Ryan Rohm in 1985, combining aspects of bosonic strings and superstrings."),
            zh = LocalizedContent("哪位科学家发现了杂化弦理论？", listOf("理论", "阿尔伯特·爱因斯坦", "马克斯·普朗克", "维尔纳·海森堡"), "科学", "杂化弦理论由戴维·格罗斯、杰弗里·哈维、埃米尔·马蒂内克和瑞安·罗姆于1985年提出，结合了玻色弦和超弦的方面。"),
            es = LocalizedContent("¿Qué científico descubrió la teoría de cuerdas heteróticas?", listOf("Teórico", "Albert Einstein", "Max Planck", "Werner Heisenberg"), "Ciencia", "La teoría de cuerdas heteróticas fue desarrollada por David Gross, Jeffrey Harvey, Emil Martinec y Ryan Rohm en 1985, combinando aspectos de cuerdas bosónicas y supercuerdas.")
        ),
        BilingualQuestion(
            id = 8991, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le symbole chimique du 1H-indène?", listOf("C9H8", "C9H6", "C9H10", "C9H4"), "Science", "Le 1H-indène est un hydrocarbure aromatique composé de 9 atomes de carbone et 6 d'hydrogène, d'où sa formule chimique C9H6. Ce symbole représente sa structure moléculaire standard en chimie organique."),
            en = LocalizedContent("What is the chemical symbol of 1H-indene?", listOf("C9H8", "C9H6", "C9H10", "C9H4"), "Science", "1H-indene is an aromatic hydrocarbon composed of 9 carbon atoms and 6 hydrogen atoms, hence its chemical formula C9H6. This symbol represents its standard molecular structure in organic chemistry."),
            zh = LocalizedContent("1H-茚的化学符号是什么？", listOf("C9H8", "C9H6", "C9H10", "C9H4"), "科学", "1H-茚是一种芳香烃，由9个碳原子和6个氢原子组成，因此其化学式为C9H6。该符号代表其在有机化学中的标准分子结构。"),
            es = LocalizedContent("¿Cuál es el símbolo químico del 1H-indeno?", listOf("C9H8", "C9H6", "C9H10", "C9H4"), "Ciencia", "El 1H-indeno es un hidrocarburo aromático compuesto por 9 átomos de carbono y 6 de hidrógeno, de ahí su fórmula química C9H6. Este símbolo representa su estructura molecular estándar en química orgánica.")
        ),
        BilingualQuestion(
            id = 8992, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien de fibres élastiques a la peau?", listOf("~10-20 g", "~1-5 g", "~30-50 g", "~50-70 g"), "Science", "La peau contient environ 10 à 20 grammes de fibres élastiques, principalement composées d'élastine, qui lui confèrent souplesse et résilience."),
            en = LocalizedContent("How many elastic fibers does the skin have?", listOf("~10-20 g", "~1-5 g", "~30-50 g", "~50-70 g"), "Science", "The skin contains about 10 to 20 grams of elastic fibers, mainly composed of elastin, which give it flexibility and resilience."),
            zh = LocalizedContent("皮肤有多少弹性纤维？", listOf("约10-20克", "约1-5克", "约30-50克", "约50-70克"), "科学", "皮肤含有约10至20克弹性纤维，主要由弹性蛋白组成，赋予其柔韧性和弹性。"),
            es = LocalizedContent("¿Cuántas fibras elásticas tiene la piel?", listOf("~10-20 g", "~1-5 g", "~30-50 g", "~50-70 g"), "Ciencia", "La piel contiene aproximadamente de 10 a 20 gramos de fibras elásticas, compuestas principalmente de elastina, que le confieren flexibilidad y resiliencia.")
        ),
        BilingualQuestion(
            id = 8993, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel gland produit la thyroxine?", listOf("Thyroïde", "Hypophyse", "Glande parathyroïde", "Pancréas"), "Science", "La thyroxine est produite par la glande thyroïde, mais sa sécrétion est contrôlée par l'hypophyse via la TSH."),
            en = LocalizedContent("Which gland produces thyroxine?", listOf("Thyroid", "Pituitary", "Parathyroid gland", "Pancreas"), "Science", "Thyroxine is produced by the thyroid gland, but its secretion is controlled by the pituitary gland via TSH."),
            zh = LocalizedContent("哪个腺体产生甲状腺素？", listOf("甲状腺", "垂体", "甲状旁腺", "胰腺"), "科学", "甲状腺素由甲状腺产生，但其分泌受垂体通过促甲状腺激素（TSH）控制。"),
            es = LocalizedContent("¿Qué glándula produce la tiroxina?", listOf("Tiroides", "Hipófisis", "Glándula paratiroides", "Páncreas"), "Ciencia", "La tiroxina es producida por la glándula tiroides, pero su secreción está controlada por la hipófisis a través de la TSH.")
        ),
        BilingualQuestion(
            id = 8994, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus grand mausolée antique?", listOf("Mausolée d'Halicarnasse", "Pyramide de Khéops", "Tombeau de Qin Shi Huang", "Mausolée d'Auguste"), "Science", "La pyramide de Khéops, construite vers 2560 av. J.-C., est le plus grand mausolée antique, avec une hauteur originale de 146,6 mètres. Elle servait de tombeau au pharaon Khéops de la IVe dynastie égyptienne."),
            en = LocalizedContent("What is the largest ancient mausoleum?", listOf("Mausoleum at Halicarnassus", "Pyramid of Khufu", "Tomb of Qin Shi Huang", "Mausoleum of Augustus"), "Science", "The Pyramid of Khufu, built around 2560 BC, is the largest ancient mausoleum, with an original height of 146.6 meters. It served as the tomb of Pharaoh Khufu of the 4th Egyptian dynasty."),
            zh = LocalizedContent("最大的古代陵墓是什么？", listOf("摩索拉斯陵墓", "胡夫金字塔", "秦始皇陵", "奥古斯都陵墓"), "科学", "胡夫金字塔建于公元前2560年左右，是最大的古代陵墓，原始高度为146.6米。它是埃及第四王朝法老胡夫的陵墓。"),
            es = LocalizedContent("¿Cuál es el mausoleo antiguo más grande?", listOf("Mausoleo de Halicarnaso", "Pirámide de Keops", "Tumba de Qin Shi Huang", "Mausoleo de Augusto"), "Ciencia", "La Pirámide de Keops, construida alrededor del 2560 a.C., es el mausoleo antiguo más grande, con una altura original de 146,6 metros. Sirvió como tumba del faraón Keops de la IV dinastía egipcia.")
        ),
        BilingualQuestion(
            id = 8995, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel scientifique a découvert la conjecture de Calabi-Yau?", listOf("Théorique", "Albert Einstein", "Max Planck", "Werner Heisenberg"), "Science", "Shing-Tung Yau a démontré la conjecture de Calabi en 1976, prouvant l'existence des variétés de Calabi-Yau."),
            en = LocalizedContent("Which scientist discovered the Calabi-Yau conjecture?", listOf("Theoretical", "Albert Einstein", "Max Planck", "Werner Heisenberg"), "Science", "Shing-Tung Yau proved the Calabi conjecture in 1976, establishing the existence of Calabi-Yau manifolds."),
            zh = LocalizedContent("哪位科学家发现了卡拉比-丘猜想？", listOf("理论", "阿尔伯特·爱因斯坦", "马克斯·普朗克", "维尔纳·海森堡"), "科学", "丘成桐于1976年证明了卡拉比猜想，确立了卡拉比-丘流形的存在。"),
            es = LocalizedContent("¿Qué científico descubrió la conjetura de Calabi-Yau?", listOf("Teórico", "Albert Einstein", "Max Planck", "Werner Heisenberg"), "Ciencia", "Shing-Tung Yau demostró la conjetura de Calabi en 1976, probando la existencia de las variedades de Calabi-Yau.")
        ),
        BilingualQuestion(
            id = 8996, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le symbole chimique du naphtalène?", listOf("C10H8", "C10H6", "C10H10", "C10H4"), "Science", "Le naphtalène est un hydrocarbure aromatique composé de 10 atomes de carbone et 8 atomes d'hydrogène, d'où sa formule chimique C10H8."),
            en = LocalizedContent("What is the chemical symbol of naphthalene?", listOf("C10H8", "C10H6", "C10H10", "C10H4"), "Science", "Naphthalene is an aromatic hydrocarbon composed of 10 carbon atoms and 8 hydrogen atoms, hence its chemical formula C10H8."),
            zh = LocalizedContent("萘的化学符号是什么？", listOf("C10H8", "C10H6", "C10H10", "C10H4"), "科学", "萘是一种芳香烃，由10个碳原子和8个氢原子组成，因此其化学式为C10H8。"),
            es = LocalizedContent("¿Cuál es el símbolo químico del naftaleno?", listOf("C10H8", "C10H6", "C10H10", "C10H4"), "Ciencia", "El naftaleno es un hidrocarburo aromático compuesto por 10 átomos de carbono y 8 de hidrógeno, de ahí su fórmula química C10H8.")
        ),
        BilingualQuestion(
            id = 8997, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quelle est la concentration de la hémoglobine fœtale dans le fœtus?", listOf("80% du total", "50% du total", "100% du total", "20% du total"), "Science", "L'hémoglobine fœtale (HbF) représente environ 80 % de l'hémoglobine totale chez le fœtus, car elle a une affinité plus élevée pour l'oxygène que l'hémoglobine adulte, facilitant le transfert d'oxygène depuis la mère."),
            en = LocalizedContent("What is the concentration of fetal hemoglobin in the fetus?", listOf("80% of total", "50% of total", "100% of total", "20% of total"), "Science", "Fetal hemoglobin (HbF) accounts for about 80% of total hemoglobin in the fetus, as it has a higher affinity for oxygen than adult hemoglobin, facilitating oxygen transfer from the mother."),
            zh = LocalizedContent("胎儿中胎儿血红蛋白的浓度是多少？", listOf("占总量的80%", "占总量的50%", "占总量的100%", "占总量的20%"), "科学", "胎儿血红蛋白（HbF）约占胎儿总血红蛋白的80%，因为它比成人血红蛋白对氧的亲和力更高，有助于从母体转移氧气。"),
            es = LocalizedContent("¿Cuál es la concentración de hemoglobina fetal en el feto?", listOf("80% del total", "50% del total", "100% del total", "20% del total"), "Ciencia", "La hemoglobina fetal (HbF) representa aproximadamente el 80% de la hemoglobina total en el feto, ya que tiene una mayor afinidad por el oxígeno que la hemoglobina adulta, facilitando la transferencia de oxígeno desde la madre.")
        ),
        BilingualQuestion(
            id = 8998, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel élément chimique a le plus grand nombre de composés?", listOf("Carbone", "Oxygène", "Azote", "Hydrogène"), "Science", "Le carbone peut former jusqu'à quatre liaisons covalentes stables avec d'autres atomes, ce qui lui permet de créer une immense variété de molécules, notamment les longues chaînes et cycles des composés organiques."),
            en = LocalizedContent("Which chemical element has the largest number of compounds?", listOf("Carbon", "Oxygen", "Nitrogen", "Hydrogen"), "Science", "Carbon can form up to four stable covalent bonds with other atoms, allowing it to create a vast variety of molecules, including long chains and rings of organic compounds."),
            zh = LocalizedContent("哪种化学元素形成的化合物最多？", listOf("碳", "氧", "氮", "氢"), "科学", "碳可以与其他原子形成多达四个稳定的共价键，从而能够创造种类繁多的分子，包括有机化合物的长链和环。"),
            es = LocalizedContent("¿Qué elemento químico tiene el mayor número de compuestos?", listOf("Carbono", "Oxígeno", "Nitrógeno", "Hidrógeno"), "Ciencia", "El carbono puede formar hasta cuatro enlaces covalentes estables con otros átomos, lo que le permite crear una inmensa variedad de moléculas, incluyendo largas cadenas y anillos de compuestos orgánicos.")
        ),
        BilingualQuestion(
            id = 8999, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel scientifique a découvert la théorie des espaces de modules?", listOf("Théorique", "Albert Einstein", "Max Planck", "Werner Heisenberg"), "Science", "La théorie des espaces de modules a été développée par plusieurs mathématiciens, dont Riemann, mais le terme et la formalisation moderne sont souvent attribués à Mumford."),
            en = LocalizedContent("Which scientist discovered the theory of moduli spaces?", listOf("Theoretical", "Albert Einstein", "Max Planck", "Werner Heisenberg"), "Science", "The theory of moduli spaces was developed by several mathematicians, including Riemann, but the term and modern formalization are often attributed to Mumford."),
            zh = LocalizedContent("哪位科学家发现了模空间理论？", listOf("理论", "阿尔伯特·爱因斯坦", "马克斯·普朗克", "维尔纳·海森堡"), "科学", "模空间理论由包括黎曼在内的多位数学家发展，但该术语和现代形式化通常归功于芒福德。"),
            es = LocalizedContent("¿Qué científico descubrió la teoría de los espacios de módulos?", listOf("Teórico", "Albert Einstein", "Max Planck", "Werner Heisenberg"), "Ciencia", "La teoría de los espacios de módulos fue desarrollada por varios matemáticos, incluido Riemann, pero el término y la formalización moderna a menudo se atribuyen a Mumford.")
        ),
        BilingualQuestion(
            id = 9000, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que la chimie verte ?", listOf("Chimie minimisant l'impact environnemental", "Chimie des végétaux", "Chimie des colorants naturels", "Agriculture chimique"), "Science", ""),
            en = LocalizedContent("What is green chemistry?", listOf("Chemistry that minimizes environmental impact", "Chemistry of plants", "Chemistry of natural dyes", "Chemical agriculture"), "Science", ""),
            zh = LocalizedContent("什么是绿色化学？", listOf("最小化环境影响的化学", "植物化学", "天然染料化学", "化学农业"), "科学", ""),
            es = LocalizedContent("¿Qué es la química verde?", listOf("Química que minimiza el impacto ambiental", "Química de los vegetales", "Química de los colorantes naturales", "Agricultura química"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 9001, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que la nanotechnologie ?", listOf("Manipulation de la matière à l'échelle nanométrique", "Technologie des micro-processeurs", "Miniaturisation des appareils", "Robotique avancée"), "Science", ""),
            en = LocalizedContent("What is nanotechnology?", listOf("Manipulation of matter at the nanoscale", "Microprocessor technology", "Miniaturization of devices", "Advanced robotics"), "Science", ""),
            zh = LocalizedContent("什么是纳米技术？", listOf("在纳米尺度上操纵物质", "微处理器技术", "设备小型化", "先进机器人技术"), "科学", ""),
            es = LocalizedContent("¿Qué es la nanotecnología?", listOf("Manipulación de la materia a escala nanométrica", "Tecnología de microprocesadores", "Miniaturización de dispositivos", "Robótica avanzada"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 9002, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le composant principal du verre ordinaire ?", listOf("Silice (dioxyde de silicium SiO₂)", "Calcium", "Alumine", "Sodium"), "Science", ""),
            en = LocalizedContent("What is the main component of ordinary glass?", listOf("Silica (silicon dioxide SiO₂)", "Calcium", "Alumina", "Sodium"), "Science", ""),
            zh = LocalizedContent("普通玻璃的主要成分是什么？", listOf("二氧化硅（SiO₂）", "钙", "氧化铝", "钠"), "科学", ""),
            es = LocalizedContent("¿Cuál es el componente principal del vidrio ordinario?", listOf("Sílice (dióxido de silicio SiO₂)", "Calcio", "Alúmina", "Sodio"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 9003, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qu'est-ce que la physique des plasmas ?", listOf("Étude de la matière ionisée (4e état de la matière)", "Physique des liquides visqueux", "Physique des gaz comprimés", "Étude des bulles"), "Science", ""),
            en = LocalizedContent("What is plasma physics?", listOf("Study of ionized matter (4th state of matter)", "Physics of viscous liquids", "Physics of compressed gases", "Study of bubbles"), "Science", ""),
            zh = LocalizedContent("什么是等离子体物理学？", listOf("研究电离物质（物质的第四态）", "粘性液体物理学", "压缩气体物理学", "气泡研究"), "科学", ""),
            es = LocalizedContent("¿Qué es la física de plasmas?", listOf("Estudio de la materia ionizada (4º estado de la materia)", "Física de líquidos viscosos", "Física de gases comprimidos", "Estudio de burbujas"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 9004, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le rôle de l'hémoglobine dans le sang ?", listOf("Transporter l'oxygène des poumons aux tissus", "Défendre contre les infections", "Coaguler le sang", "Transporter le CO₂ uniquement"), "Science", ""),
            en = LocalizedContent("What is the role of hemoglobin in blood?", listOf("Transport oxygen from lungs to tissues", "Defend against infections", "Coagulate blood", "Transport CO₂ only"), "Science", ""),
            zh = LocalizedContent("血红蛋白在血液中的作用是什么？", listOf("将氧气从肺部输送到组织", "防御感染", "凝血", "仅运输二氧化碳"), "科学", ""),
            es = LocalizedContent("¿Cuál es el papel de la hemoglobina en la sangre?", listOf("Transportar oxígeno de los pulmones a los tejidos", "Defender contra infecciones", "Coagular la sangre", "Transportar solo CO₂"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 9005, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Qu'est-ce que le principe d'exclusion de Pauli ?", listOf("Deux fermions identiques ne peuvent occuper le même état quantique", "Tout photon a une énergie fixe", "Les électrons se repoussent", "La masse est conservée"), "Science", ""),
            en = LocalizedContent("What is the Pauli exclusion principle?", listOf("Two identical fermions cannot occupy the same quantum state", "Every photon has a fixed energy", "Electrons repel each other", "Mass is conserved"), "Science", ""),
            zh = LocalizedContent("什么是泡利不相容原理？", listOf("两个相同的费米子不能占据同一个量子态", "每个光子都有固定的能量", "电子相互排斥", "质量守恒"), "科学", ""),
            es = LocalizedContent("¿Qué es el principio de exclusión de Pauli?", listOf("Dos fermiones idénticos no pueden ocupar el mismo estado cuántico", "Todo fotón tiene una energía fija", "Los electrones se repelen", "La masa se conserva"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 9006, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel phénomène cause les tremblements de terre ?", listOf("Mouvement des plaques tectoniques (failles)", "Éruptions volcaniques souterraines", "Impacts de météorites", "Variations de pression atmosphérique"), "Science", ""),
            en = LocalizedContent("What phenomenon causes earthquakes?", listOf("Movement of tectonic plates (faults)", "Underground volcanic eruptions", "Meteorite impacts", "Atmospheric pressure variations"), "Science", ""),
            zh = LocalizedContent("什么现象导致地震？", listOf("板块运动（断层）", "地下火山喷发", "陨石撞击", "大气压力变化"), "科学", ""),
            es = LocalizedContent("¿Qué fenómeno causa los terremotos?", listOf("Movimiento de placas tectónicas (fallas)", "Erupciones volcánicas subterráneas", "Impactos de meteoritos", "Variaciones de presión atmosférica"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 9007, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qu'est-ce qu'un atome neutre ?", listOf("Atome avec autant de protons que d'électrons", "Atome sans charge positive", "Atome sans neutrons", "Atome stable"), "Science", ""),
            en = LocalizedContent("What is a neutral atom?", listOf("Atom with as many protons as electrons", "Atom without positive charge", "Atom without neutrons", "Stable atom"), "Science", ""),
            zh = LocalizedContent("什么是中性原子？", listOf("质子数和电子数相等的原子", "没有正电荷的原子", "没有中子的原子", "稳定的原子"), "科学", ""),
            es = LocalizedContent("¿Qué es un átomo neutro?", listOf("Átomo con tantos protones como electrones", "Átomo sin carga positiva", "Átomo sin neutrones", "Átomo estable"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 9008, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quelle est la vitesse de la lumière dans le vide ?", listOf("299 792 458 m/s (≈ 3×10⁸ m/s)", "300 000 km/h", "186 000 miles/h", "1 080 000 km/h"), "Science", ""),
            en = LocalizedContent("What is the speed of light in a vacuum?", listOf("299,792,458 m/s (≈ 3×10⁸ m/s)", "300,000 km/h", "186,000 miles/h", "1,080,000 km/h"), "Science", ""),
            zh = LocalizedContent("真空中的光速是多少？", listOf("299,792,458 米/秒（约 3×10⁸ 米/秒）", "300,000 公里/小时", "186,000 英里/小时", "1,080,000 公里/小时"), "科学", ""),
            es = LocalizedContent("¿Cuál es la velocidad de la luz en el vacío?", listOf("299 792 458 m/s (≈ 3×10⁸ m/s)", "300 000 km/h", "186 000 millas/h", "1 080 000 km/h"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 9009, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Qu'est-ce que la loi de Hardy-Weinberg ?", listOf("Équilibre des fréquences alléliques dans une population", "Hérédité des caractères liés au sexe", "Loi de ségrégation de Mendel", "Dérive génétique"), "Science", ""),
            en = LocalizedContent("What is the Hardy-Weinberg law?", listOf("Equilibrium of allele frequencies in a population", "Inheritance of sex-linked traits", "Mendel's law of segregation", "Genetic drift"), "Science", ""),
            zh = LocalizedContent("什么是哈代-温伯格定律？", listOf("群体中等位基因频率的平衡", "性连锁性状的遗传", "孟德尔分离定律", "遗传漂变"), "科学", ""),
            es = LocalizedContent("¿Qué es la ley de Hardy-Weinberg?", listOf("Equilibrio de frecuencias alélicas en una población", "Herencia de caracteres ligados al sexo", "Ley de segregación de Mendel", "Deriva genética"), "Ciencia", "")
        ),
    )

    private fun part2(): List<BilingualQuestion> = listOf(
        BilingualQuestion(
            id = 9010, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est l'organite responsable de la photosynthèse ?", listOf("Le chloroplaste", "La mitochondrie", "Le noyau", "Le réticulum endoplasmique"), "Science", ""),
            en = LocalizedContent("Which organelle is responsible for photosynthesis?", listOf("Chloroplast", "Mitochondrion", "Nucleus", "Endoplasmic reticulum"), "Science", ""),
            zh = LocalizedContent("哪个细胞器负责光合作用？", listOf("叶绿体", "线粒体", "细胞核", "内质网"), "科学", ""),
            es = LocalizedContent("¿Qué orgánulo es responsable de la fotosíntesis?", listOf("El cloroplasto", "La mitocondria", "El núcleo", "El retículo endoplasmático"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 9011, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que la masse molaire ?", listOf("Masse d'une mole de substance en g/mol", "Masse d'un atome", "Nombre de protons × masse", "Volume d'une mole de gaz"), "Science", ""),
            en = LocalizedContent("What is molar mass?", listOf("Mass of one mole of substance in g/mol", "Mass of an atom", "Number of protons × mass", "Volume of one mole of gas"), "Science", ""),
            zh = LocalizedContent("什么是摩尔质量？", listOf("一摩尔物质的质量，单位g/mol", "一个原子的质量", "质子数×质量", "一摩尔气体的体积"), "科学", ""),
            es = LocalizedContent("¿Qué es la masa molar?", listOf("Masa de un mol de sustancia en g/mol", "Masa de un átomo", "Número de protones × masa", "Volumen de un mol de gas"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 9012, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le phénomène derrière la fluorescence ?", listOf("Absorption de lumière UV et émission de lumière visible", "Réflexion de la lumière", "Bioluminescence chimique", "Phosphorescence persistante"), "Science", ""),
            en = LocalizedContent("What is the phenomenon behind fluorescence?", listOf("Absorption of UV light and emission of visible light", "Reflection of light", "Chemical bioluminescence", "Persistent phosphorescence"), "Science", ""),
            zh = LocalizedContent("荧光背后的现象是什么？", listOf("吸收紫外光并发射可见光", "光的反射", "化学生物发光", "持久磷光"), "科学", ""),
            es = LocalizedContent("¿Cuál es el fenómeno detrás de la fluorescencia?", listOf("Absorción de luz UV y emisión de luz visible", "Reflexión de la luz", "Bioluminiscencia química", "Fosforescencia persistente"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 9013, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que la tension superficielle ?", listOf("Force cohésive à la surface d'un liquide", "Résistance d'un solide à la compression", "Viscosité d'un fluide", "Pression osmotique"), "Science", ""),
            en = LocalizedContent("What is surface tension?", listOf("Cohesive force at the surface of a liquid", "Resistance of a solid to compression", "Viscosity of a fluid", "Osmotic pressure"), "Science", ""),
            zh = LocalizedContent("什么是表面张力？", listOf("液体表面的内聚力", "固体抗压缩的能力", "流体的粘度", "渗透压"), "科学", ""),
            es = LocalizedContent("¿Qué es la tensión superficial?", listOf("Fuerza cohesiva en la superficie de un líquido", "Resistencia de un sólido a la compresión", "Viscosidad de un fluido", "Presión osmótica"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 9014, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est l'effet de l'alcool sur le système nerveux ?", listOf("Dépresseur du SNC (ralentit les fonctions cérébrales)", "Stimulant du SNC", "Neutre sur le SNC", "Hallucinogène"), "Science", ""),
            en = LocalizedContent("What is the effect of alcohol on the nervous system?", listOf("CNS depressant (slows brain functions)", "CNS stimulant", "Neutral on CNS", "Hallucinogen"), "Science", ""),
            zh = LocalizedContent("酒精对神经系统有什么影响？", listOf("中枢神经系统抑制剂（减缓大脑功能）", "中枢神经系统兴奋剂", "对中枢神经系统无影响", "致幻剂"), "科学", ""),
            es = LocalizedContent("¿Cuál es el efecto del alcohol en el sistema nervioso?", listOf("Depresor del SNC (ralentiza las funciones cerebrales)", "Estimulante del SNC", "Neutro sobre el SNC", "Alucinógeno"), "Ciencia", "")
        ),
        BilingualQuestion(
            id = 9015, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui a dirigé la conquête des Amériques pour l'Espagne au XVIe siècle ?", listOf("Cortés (Mexique), Pizarro (Pérou), et d'autres conquistadors", "Colomb uniquement", "Ferdinand de Magellan", "Vasco de Gama"), "Histoire", ""),
            en = LocalizedContent("Who led the conquest of the Americas for Spain in the 16th century?", listOf("Cortés (Mexico), Pizarro (Peru), and other conquistadors", "Columbus only", "Ferdinand Magellan", "Vasco da Gama"), "History", ""),
            zh = LocalizedContent("16世纪谁领导了西班牙对美洲的征服？", listOf("科尔特斯（墨西哥）、皮萨罗（秘鲁）及其他征服者", "仅哥伦布", "斐迪南·麦哲伦", "瓦斯科·达·伽马"), "历史", ""),
            es = LocalizedContent("¿Quién lideró la conquista de las Américas para España en el siglo XVI?", listOf("Cortés (México), Pizarro (Perú) y otros conquistadores", "Solo Colón", "Fernando de Magallanes", "Vasco de Gama"), "Historia", "")
        ),
        BilingualQuestion(
            id = 9016, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel empire a fondé Constantinople en 330 ap. J.-C. ?", listOf("L'Empire romain (Constantin le Grand)", "L'Empire byzantin (est une continuation)", "L'Empire grec", "L'Empire ottoman"), "Histoire", ""),
            en = LocalizedContent("Which empire founded Constantinople in 330 AD?", listOf("Roman Empire (Constantine the Great)", "Byzantine Empire (is a continuation)", "Greek Empire", "Ottoman Empire"), "History", ""),
            zh = LocalizedContent("哪个帝国于公元330年建立了君士坦丁堡？", listOf("罗马帝国（君士坦丁大帝）", "拜占庭帝国（是延续）", "希腊帝国", "奥斯曼帝国"), "历史", ""),
            es = LocalizedContent("¿Qué imperio fundó Constantinopla en el año 330 d.C.?", listOf("Imperio romano (Constantino el Grande)", "Imperio bizantino (es una continuación)", "Imperio griego", "Imperio otomano"), "Historia", "")
        ),
        BilingualQuestion(
            id = 9017, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel philosophe grec a été condamné à mort et a bu la cigüe ?", listOf("Socrate (399 av. J.-C.)", "Platon", "Aristote", "Démocrite"), "Histoire", ""),
            en = LocalizedContent("Which Greek philosopher was sentenced to death and drank hemlock?", listOf("Socrates (399 BC)", "Plato", "Aristotle", "Democritus"), "History", ""),
            zh = LocalizedContent("哪位希腊哲学家被判处死刑并饮下毒芹？", listOf("苏格拉底（公元前399年）", "柏拉图", "亚里士多德", "德谟克利特"), "历史", ""),
            es = LocalizedContent("¿Qué filósofo griego fue condenado a muerte y bebió cicuta?", listOf("Sócrates (399 a.C.)", "Platón", "Aristóteles", "Demócrito"), "Historia", "")
        ),
        BilingualQuestion(
            id = 9018, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année l'Espagne a-t-elle expulsé les Maures et les Juifs ?", listOf("1492", "1400", "1481", "1502"), "Histoire", ""),
            en = LocalizedContent("In which year did Spain expel the Moors and Jews?", listOf("1492", "1400", "1481", "1502"), "History", ""),
            zh = LocalizedContent("西班牙在哪一年驱逐了摩尔人和犹太人？", listOf("1492", "1400", "1481", "1502"), "历史", ""),
            es = LocalizedContent("¿En qué año España expulsó a los moros y judíos?", listOf("1492", "1400", "1481", "1502"), "Historia", "")
        ),
        BilingualQuestion(
            id = 9019, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Qui était le premier Consul général de la Communauté économique européenne ?", listOf("Walter Hallstein (1ère Commission CEE, 1958)", "Jean Monnet", "Robert Schuman", "Alcide De Gasperi"), "Histoire", ""),
            en = LocalizedContent("Who was the first President of the European Economic Commission?", listOf("Walter Hallstein (1st EEC Commission, 1958)", "Jean Monnet", "Robert Schuman", "Alcide De Gasperi"), "History", ""),
            zh = LocalizedContent("谁是欧洲经济委员会的第一任主席？", listOf("瓦尔特·哈尔斯坦（1958年首任欧共体委员会主席）", "让·莫内", "罗伯特·舒曼", "阿尔契德·加斯贝利"), "历史", ""),
            es = LocalizedContent("¿Quién fue el primer Presidente de la Comisión Económica Europea?", listOf("Walter Hallstein (1ª Comisión CEE, 1958)", "Jean Monnet", "Robert Schuman", "Alcide De Gasperi"), "Historia", "")
        ),
        BilingualQuestion(
            id = 9020, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le nom de la première écriture humaine déchiffrée ?", listOf("Le cunéiforme sumérien", "Les hiéroglyphes égyptiens", "L'alphabet phénicien", "Les pictogrammes chinois"), "Histoire", ""),
            en = LocalizedContent("What is the name of the first deciphered human writing?", listOf("Sumerian cuneiform", "Egyptian hieroglyphs", "Phoenician alphabet", "Chinese pictograms"), "History", ""),
            zh = LocalizedContent("第一种被破译的人类文字是什么？", listOf("苏美尔楔形文字", "埃及象形文字", "腓尼基字母", "中国象形文字"), "历史", ""),
            es = LocalizedContent("¿Cuál es el nombre de la primera escritura humana descifrada?", listOf("Escritura cuneiforme sumeria", "Jeroglíficos egipcios", "Alfabeto fenicio", "Pictogramas chinos"), "Historia", "")
        ),
        BilingualQuestion(
            id = 9021, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel traité a mis fin à la guerre de Sept Ans en 1763 ?", listOf("Traité de Paris (1763)", "Traité de Versailles", "Traité de Londres", "Paix de Hubertusbourg"), "Histoire", ""),
            en = LocalizedContent("Which treaty ended the Seven Years' War in 1763?", listOf("Treaty of Paris (1763)", "Treaty of Versailles", "Treaty of London", "Peace of Hubertusburg"), "History", ""),
            zh = LocalizedContent("哪个条约在1763年结束了七年战争？", listOf("巴黎条约（1763年）", "凡尔赛条约", "伦敦条约", "胡贝图斯堡和约"), "历史", ""),
            es = LocalizedContent("¿Qué tratado puso fin a la Guerra de los Siete Años en 1763?", listOf("Tratado de París (1763)", "Tratado de Versalles", "Tratado de Londres", "Paz de Hubertusburgo"), "Historia", "")
        ),
        BilingualQuestion(
            id = 9022, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui était le successeur direct de Jules César (fils adoptif) ?", listOf("Octave Auguste", "Marc Antoine", "Lépide", "Brutus"), "Histoire", ""),
            en = LocalizedContent("Who was the direct successor (adopted son) of Julius Caesar?", listOf("Octavian Augustus", "Mark Antony", "Lepidus", "Brutus"), "History", ""),
            zh = LocalizedContent("谁是尤利乌斯·凯撒的直接继承人（养子）？", listOf("屋大维·奥古斯都", "马克·安东尼", "雷必达", "布鲁图斯"), "历史", ""),
            es = LocalizedContent("¿Quién fue el sucesor directo (hijo adoptivo) de Julio César?", listOf("Octavio Augusto", "Marco Antonio", "Lépido", "Bruto"), "Historia", "")
        ),
        BilingualQuestion(
            id = 9023, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quelle bataille de 1066 a changé l'histoire de l'Angleterre ?", listOf("Bataille de Hastings", "Bataille de Stamford Bridge", "Bataille de Lincoln", "Bataille d'Evesham"), "Histoire", ""),
            en = LocalizedContent("Which battle in 1066 changed the history of England?", listOf("Battle of Hastings", "Battle of Stamford Bridge", "Battle of Lincoln", "Battle of Evesham"), "History", ""),
            zh = LocalizedContent("1066年的哪场战役改变了英格兰的历史？", listOf("黑斯廷斯战役", "斯坦福桥战役", "林肯战役", "伊夫舍姆战役"), "历史", ""),
            es = LocalizedContent("¿Qué batalla de 1066 cambió la historia de Inglaterra?", listOf("Batalla de Hastings", "Batalla de Stamford Bridge", "Batalla de Lincoln", "Batalla de Evesham"), "Historia", "")
        ),
        BilingualQuestion(
            id = 9024, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année la France a-t-elle aboli l'esclavage définitivement ?", listOf("1848 (sous la IIe République)", "1794", "1815", "1789"), "Histoire", ""),
            en = LocalizedContent("In which year did France definitively abolish slavery?", listOf("1848 (under the Second Republic)", "1794", "1815", "1789"), "History", ""),
            zh = LocalizedContent("法国在哪一年最终废除了奴隶制？", listOf("1848年（第二共和国时期）", "1794年", "1815年", "1789年"), "历史", ""),
            es = LocalizedContent("¿En qué año abolió Francia definitivamente la esclavitud?", listOf("1848 (bajo la Segunda República)", "1794", "1815", "1789"), "Historia", "")
        ),
        BilingualQuestion(
            id = 9025, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui fut le premier dirigeant à unifier la Chine sous un seul empire ?", listOf("Qin Shi Huang (221 av. J.-C.)", "Confucius", "Liu Bang", "Sun Tzu"), "Histoire", ""),
            en = LocalizedContent("Who was the first ruler to unify China under a single empire?", listOf("Qin Shi Huang (221 BC)", "Confucius", "Liu Bang", "Sun Tzu"), "History", ""),
            zh = LocalizedContent("谁是第一个统一中国的统治者？", listOf("秦始皇（公元前221年）", "孔子", "刘邦", "孙子"), "历史", ""),
            es = LocalizedContent("¿Quién fue el primer gobernante en unificar China bajo un solo imperio?", listOf("Qin Shi Huang (221 a.C.)", "Confucio", "Liu Bang", "Sun Tzu"), "Historia", "")
        ),
        BilingualQuestion(
            id = 9026, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel empire islamique a dominé le Moyen-Orient de 750 à 1258 ?", listOf("Le Califat abbasside", "Le Califat omeyyade", "L'Empire ottoman", "Le Sultanat mamelouk"), "Histoire", ""),
            en = LocalizedContent("Which Islamic empire dominated the Middle East from 750 to 1258?", listOf("The Abbasid Caliphate", "The Umayyad Caliphate", "The Ottoman Empire", "The Mamluk Sultanate"), "History", ""),
            zh = LocalizedContent("哪个伊斯兰帝国在750年至1258年间统治了中东？", listOf("阿拔斯王朝", "倭马亚王朝", "奥斯曼帝国", "马穆鲁克苏丹国"), "历史", ""),
            es = LocalizedContent("¿Qué imperio islámico dominó Oriente Medio desde 750 hasta 1258?", listOf("El Califato abasí", "El Califato omeya", "El Imperio otomano", "El Sultanato mameluco"), "Historia", "")
        ),
        BilingualQuestion(
            id = 9027, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui a gagné la bataille de Trafalgar en 1805 ?", listOf("L'Angleterre (Nelson) contre France-Espagne", "Napoléon", "L'Espagne", "Le Portugal"), "Histoire", ""),
            en = LocalizedContent("Who won the Battle of Trafalgar in 1805?", listOf("England (Nelson) against France-Spain", "Napoleon", "Spain", "Portugal"), "History", ""),
            zh = LocalizedContent("谁赢得了1805年的特拉法尔加海战？", listOf("英国（纳尔逊）对抗法西联合舰队", "拿破仑", "西班牙", "葡萄牙"), "历史", ""),
            es = LocalizedContent("¿Quién ganó la Batalla de Trafalgar en 1805?", listOf("Inglaterra (Nelson) contra Francia-España", "Napoleón", "España", "Portugal"), "Historia", "")
        ),
        BilingualQuestion(
            id = 9028, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel événement a déclenché la guerre russo-japonaise de 1904 ?", listOf("Attaque surprise japonaise sur Port-Arthur", "Ultimatum russe au Japon", "Conflit de la Mandchourie", "Crise de la Corée"), "Histoire", ""),
            en = LocalizedContent("What event triggered the Russo-Japanese War of 1904?", listOf("Japanese surprise attack on Port Arthur", "Russian ultimatum to Japan", "Manchuria conflict", "Korea crisis"), "History", ""),
            zh = LocalizedContent("什么事件引发了1904年的日俄战争？", listOf("日本突袭旅顺港", "俄国对日本的最后通牒", "满洲冲突", "朝鲜危机"), "历史", ""),
            es = LocalizedContent("¿Qué evento desencadenó la Guerra Ruso-Japonesa de 1904?", listOf("Ataque sorpresa japonés a Port Arthur", "Ultimátum ruso a Japón", "Conflicto de Manchuria", "Crisis de Corea"), "Historia", "")
        ),
        BilingualQuestion(
            id = 9029, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("En quelle année la Déclaration universelle des droits de l'homme a-t-elle été adoptée ?", listOf("1948", "1945", "1950", "1955"), "Histoire", ""),
            en = LocalizedContent("In which year was the Universal Declaration of Human Rights adopted?", listOf("1948", "1945", "1950", "1955"), "History", ""),
            zh = LocalizedContent("世界人权宣言是在哪一年通过的？", listOf("1948年", "1945年", "1950年", "1955年"), "历史", ""),
            es = LocalizedContent("¿En qué año se adoptó la Declaración Universal de los Derechos Humanos?", listOf("1948", "1945", "1950", "1955"), "Historia", "")
        ),
        BilingualQuestion(
            id = 9030, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quelle est la capitale des Philippines ?", listOf("Manille", "Cebu", "Davao", "Quezon City"), "Géographie", ""),
            en = LocalizedContent("What is the capital of the Philippines?", listOf("Manila", "Cebu", "Davao", "Quezon City"), "Geography", ""),
            zh = LocalizedContent("菲律宾的首都是哪里？", listOf("马尼拉", "宿务", "达沃", "奎松城"), "地理", ""),
            es = LocalizedContent("¿Cuál es la capital de Filipinas?", listOf("Manila", "Cebú", "Dávao", "Ciudad Quezón"), "Geografia", "")
        ),
        BilingualQuestion(
            id = 9031, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Dans quel pays se trouve le Vésuve ?", listOf("Italie (Naples)", "Grèce", "Espagne", "France"), "Géographie", ""),
            en = LocalizedContent("In which country is Mount Vesuvius located?", listOf("Italy (Naples)", "Greece", "Spain", "France"), "Geography", ""),
            zh = LocalizedContent("维苏威火山位于哪个国家？", listOf("意大利（那不勒斯）", "希腊", "西班牙", "法国"), "地理", ""),
            es = LocalizedContent("¿En qué país se encuentra el Vesubio?", listOf("Italia (Nápoles)", "Grecia", "España", "Francia"), "Geografia", "")
        ),
        BilingualQuestion(
            id = 9032, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plus grand pays d'Afrique par superficie ?", listOf("Algérie", "Congo (RDC)", "Soudan", "Libye"), "Géographie", ""),
            en = LocalizedContent("What is the largest country in Africa by area?", listOf("Algeria", "Congo (DRC)", "Sudan", "Libya"), "Geography", ""),
            zh = LocalizedContent("非洲面积最大的国家是哪个？", listOf("阿尔及利亚", "刚果（金）", "苏丹", "利比亚"), "地理", ""),
            es = LocalizedContent("¿Cuál es el país más grande de África por superficie?", listOf("Argelia", "Congo (RDC)", "Sudán", "Libia"), "Geografia", "")
        ),
        BilingualQuestion(
            id = 9033, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Dans quel pays se trouve le fleuve Mékong à son embouchure ?", listOf("Vietnam (delta du Mékong)", "Cambodge", "Thaïlande", "Laos"), "Géographie", ""),
            en = LocalizedContent("In which country is the mouth of the Mekong River located?", listOf("Vietnam (Mekong Delta)", "Cambodia", "Thailand", "Laos"), "Geography", ""),
            zh = LocalizedContent("湄公河入海口位于哪个国家？", listOf("越南（湄公河三角洲）", "柬埔寨", "泰国", "老挝"), "地理", ""),
            es = LocalizedContent("¿En qué país se encuentra la desembocadura del río Mekong?", listOf("Vietnam (delta del Mekong)", "Camboya", "Tailandia", "Laos"), "Geografia", "")
        ),
        BilingualQuestion(
            id = 9034, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quelle est la capitale de la Finlande ?", listOf("Helsinki", "Turku", "Tampere", "Espoo"), "Géographie", ""),
            en = LocalizedContent("What is the capital of Finland?", listOf("Helsinki", "Turku", "Tampere", "Espoo"), "Geography", ""),
            zh = LocalizedContent("芬兰的首都是哪里？", listOf("赫尔辛基", "图尔库", "坦佩雷", "埃斯波"), "地理", ""),
            es = LocalizedContent("¿Cuál es la capital de Finlandia?", listOf("Helsinki", "Turku", "Tampere", "Espoo"), "Geografia", "")
        ),
        BilingualQuestion(
            id = 9035, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année le mur de Berlin est-il tombé?", listOf("1987", "1989", "1991", "1993"), "Histoire", "Le mur de Berlin est tombé le 9 novembre 1989, marquant la fin de la division de l'Allemagne et un symbole majeur de la chute du bloc soviétique."),
            en = LocalizedContent("In which year did the Berlin Wall fall?", listOf("1987", "1989", "1991", "1993"), "History", "The Berlin Wall fell on November 9, 1989, marking the end of Germany's division and a major symbol of the collapse of the Soviet bloc."),
            zh = LocalizedContent("柏林墙在哪一年倒塌？", listOf("1987年", "1989年", "1991年", "1993年"), "历史", "柏林墙于1989年11月9日倒塌，标志着德国分裂的结束以及苏联集团崩溃的重要象征。"),
            es = LocalizedContent("¿En qué año cayó el Muro de Berlín?", listOf("1987", "1989", "1991", "1993"), "Historia", "El Muro de Berlín cayó el 9 de noviembre de 1989, marcando el fin de la división de Alemania y un símbolo importante del colapso del bloque soviético.")
        ),
        BilingualQuestion(
            id = 9036, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Dans quel pays se trouve la baie de Montego ?", listOf("Jamaïque", "Haïti", "Cuba", "Trinidad"), "Géographie", ""),
            en = LocalizedContent("In which country is Montego Bay located?", listOf("Jamaica", "Haiti", "Cuba", "Trinidad"), "Geography", ""),
            zh = LocalizedContent("蒙特哥贝位于哪个国家？", listOf("牙买加", "海地", "古巴", "特立尼达"), "地理", ""),
            es = LocalizedContent("¿En qué país se encuentra la bahía de Montego?", listOf("Jamaica", "Haití", "Cuba", "Trinidad"), "Geografia", "")
        ),
        BilingualQuestion(
            id = 9037, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quelle est la frontière entre le Mexique et les États-Unis (fleuve) ?", listOf("Le Rio Grande (Rio Bravo)", "Le Colorado", "Le Mississippi", "Le Columbia"), "Géographie", ""),
            en = LocalizedContent("What river forms the border between Mexico and the United States?", listOf("Rio Grande (Rio Bravo)", "Colorado River", "Mississippi River", "Columbia River"), "Geography", ""),
            zh = LocalizedContent("墨西哥和美国之间的界河是什么？", listOf("格兰德河（布拉沃河）", "科罗拉多河", "密西西比河", "哥伦比亚河"), "地理", ""),
            es = LocalizedContent("¿Qué río forma la frontera entre México y Estados Unidos?", listOf("Río Grande (Río Bravo)", "Río Colorado", "Río Mississippi", "Río Columbia"), "Geografia", "")
        ),
        BilingualQuestion(
            id = 9038, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Dans quel pays se trouve la ville historique de Tombouctou ?", listOf("Mali", "Niger", "Mauritanie", "Burkina Faso"), "Géographie", ""),
            en = LocalizedContent("In which country is the historic city of Timbuktu located?", listOf("Mali", "Niger", "Mauritania", "Burkina Faso"), "Geography", ""),
            zh = LocalizedContent("历史名城廷巴克图位于哪个国家？", listOf("马里", "尼日尔", "毛里塔尼亚", "布基纳法索"), "地理", ""),
            es = LocalizedContent("¿En qué país se encuentra la ciudad histórica de Tombuctú?", listOf("Malí", "Níger", "Mauritania", "Burkina Faso"), "Geografia", "")
        ),
        BilingualQuestion(
            id = 9039, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plus grand désert d'Asie ?", listOf("Le désert de Gobi", "Le désert de Taklamakan", "Le désert d'Arabie", "Le désert de Thar"), "Géographie", ""),
            en = LocalizedContent("What is the largest desert in Asia?", listOf("Gobi Desert", "Taklamakan Desert", "Arabian Desert", "Thar Desert"), "Geography", ""),
            zh = LocalizedContent("亚洲最大的沙漠是哪个？", listOf("戈壁沙漠", "塔克拉玛干沙漠", "阿拉伯沙漠", "塔尔沙漠"), "地理", ""),
            es = LocalizedContent("¿Cuál es el desierto más grande de Asia?", listOf("Desierto de Gobi", "Desierto de Taklamakán", "Desierto de Arabia", "Desierto de Thar"), "Geografia", "")
        ),
        BilingualQuestion(
            id = 9040, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Dans quel pays se trouvent les gorges du Yangtsé ?", listOf("Chine", "Tibelt", "Myanmar", "Vietnam"), "Géographie", ""),
            en = LocalizedContent("In which country are the Yangtze Gorges located?", listOf("China", "Tibet", "Myanmar", "Vietnam"), "Geography", ""),
            zh = LocalizedContent("长江三峡位于哪个国家？", listOf("中国", "西藏", "缅甸", "越南"), "地理", ""),
            es = LocalizedContent("¿En qué país se encuentran las gargantas del Yangtsé?", listOf("China", "Tíbet", "Myanmar", "Vietnam"), "Geografia", "")
        ),
        BilingualQuestion(
            id = 9041, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quelle ville est la capitale du Bangladesh ?", listOf("Dacca (Dhaka)", "Chittagong", "Khulna", "Sylhet"), "Géographie", ""),
            en = LocalizedContent("Which city is the capital of Bangladesh?", listOf("Dhaka", "Chittagong", "Khulna", "Sylhet"), "Geography", ""),
            zh = LocalizedContent("孟加拉国的首都是哪个城市？", listOf("达卡", "吉大港", "库尔纳", "锡尔赫特"), "地理", ""),
            es = LocalizedContent("¿Qué ciudad es la capital de Bangladés?", listOf("Daca", "Chittagong", "Khulna", "Sylhet"), "Geografia", "")
        ),
        BilingualQuestion(
            id = 9042, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le nom du passage entre l'Atlantique et le Pacifique au sud de l'Amérique ?", listOf("Détroit de Magellan", "Cap Horn", "Détroit de Drake", "Canal de Beagle"), "Géographie", ""),
            en = LocalizedContent("What is the name of the passage between the Atlantic and Pacific south of America?", listOf("Strait of Magellan", "Cape Horn", "Drake Passage", "Beagle Channel"), "Geography", ""),
            zh = LocalizedContent("南美洲南部连接大西洋和太平洋的海峡叫什么？", listOf("麦哲伦海峡", "合恩角", "德雷克海峡", "比格尔海峡"), "地理", ""),
            es = LocalizedContent("¿Cuál es el nombre del paso entre el Atlántico y el Pacífico al sur de América?", listOf("Estrecho de Magallanes", "Cabo de Hornos", "Paso de Drake", "Canal Beagle"), "Geografia", "")
        ),
        BilingualQuestion(
            id = 9043, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Dans quel pays se trouve la ville d'Hanovre ?", listOf("Allemagne", "Autriche", "Suisse", "Pays-Bas"), "Géographie", ""),
            en = LocalizedContent("In which country is the city of Hanover located?", listOf("Germany", "Austria", "Switzerland", "Netherlands"), "Geography", ""),
            zh = LocalizedContent("汉诺威市位于哪个国家？", listOf("德国", "奥地利", "瑞士", "荷兰"), "地理", ""),
            es = LocalizedContent("¿En qué país se encuentra la ciudad de Hannover?", listOf("Alemania", "Austria", "Suiza", "Países Bajos"), "Geografia", "")
        ),
        BilingualQuestion(
            id = 9044, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel pays est entouré par 5 pays (dont Allemagne, France, Belgique) ?", listOf("Luxembourg", "Liechtenstein", "Andorre", "Monaco"), "Géographie", ""),
            en = LocalizedContent("Which country is surrounded by 5 countries (including Germany, France, Belgium)?", listOf("Luxembourg", "Liechtenstein", "Andorra", "Monaco"), "Geography", ""),
            zh = LocalizedContent("哪个国家被5个国家包围（包括德国、法国、比利时）？", listOf("卢森堡", "列支敦士登", "安道尔", "摩纳哥"), "地理", ""),
            es = LocalizedContent("¿Qué país está rodeado por 5 países (incluyendo Alemania, Francia, Bélgica)?", listOf("Luxemburgo", "Liechtenstein", "Andorra", "Mónaco"), "Geografia", "")
        ),
        BilingualQuestion(
            id = 9045, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui est l'auteur de 'Le Horla' ?", listOf("Guy de Maupassant", "Gustave Flaubert", "Jules Verne", "Alexandre Dumas"), "Culture", ""),
            en = LocalizedContent("Who is the author of 'The Horla'?", listOf("Guy de Maupassant", "Gustave Flaubert", "Jules Verne", "Alexandre Dumas"), "Culture", ""),
            zh = LocalizedContent("《奥尔拉》的作者是谁？", listOf("居伊·德·莫泊桑", "古斯塔夫·福楼拜", "儒勒·凡尔纳", "亚历山大·仲马"), "文化", ""),
            es = LocalizedContent("¿Quién es el autor de 'El Horla'?", listOf("Guy de Maupassant", "Gustave Flaubert", "Julio Verne", "Alejandro Dumas"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 9046, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel courant artistique utilise des objets du quotidien ?", listOf("Pop Art", "Surréalisme", "Dadaïsme", "Arte Povera"), "Culture", ""),
            en = LocalizedContent("Which artistic movement uses everyday objects?", listOf("Pop Art", "Surrealism", "Dadaism", "Arte Povera"), "Culture", ""),
            zh = LocalizedContent("哪个艺术流派使用日常物品？", listOf("波普艺术", "超现实主义", "达达主义", "贫穷艺术"), "文化", ""),
            es = LocalizedContent("¿Qué movimiento artístico utiliza objetos cotidianos?", listOf("Pop Art", "Surrealismo", "Dadá", "Arte Povera"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 9047, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel auteur a écrit 'Les Buddenbrook' ?", listOf("Thomas Mann", "Hermann Hesse", "Stefan Zweig", "Franz Kafka"), "Culture", ""),
            en = LocalizedContent("Which author wrote 'Buddenbrooks'?", listOf("Thomas Mann", "Hermann Hesse", "Stefan Zweig", "Franz Kafka"), "Culture", ""),
            zh = LocalizedContent("《布登勃洛克一家》的作者是谁？", listOf("托马斯·曼", "赫尔曼·黑塞", "斯特凡·茨威格", "弗朗茨·卡夫卡"), "文化", ""),
            es = LocalizedContent("¿Qué autor escribió 'Los Buddenbrook'?", listOf("Thomas Mann", "Hermann Hesse", "Stefan Zweig", "Franz Kafka"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 9048, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui est le compositeur de 'Habanera' dans l'opéra Carmen ?", listOf("Georges Bizet", "Giacomo Puccini", "Giuseppe Verdi", "Charles Gounod"), "Culture", ""),
            en = LocalizedContent("Who composed the 'Habanera' in the opera Carmen?", listOf("Georges Bizet", "Giacomo Puccini", "Giuseppe Verdi", "Charles Gounod"), "Culture", ""),
            zh = LocalizedContent("歌剧《卡门》中的《哈巴涅拉》是谁创作的？", listOf("乔治·比才", "贾科莫·普契尼", "朱塞佩·威尔第", "夏尔·古诺"), "文化", ""),
            es = LocalizedContent("¿Quién compuso la 'Habanera' en la ópera Carmen?", listOf("Georges Bizet", "Giacomo Puccini", "Giuseppe Verdi", "Charles Gounod"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 9049, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel auteur a écrit 'Pride and Prejudice' ?", listOf("Jane Austen", "Charlotte Brontë", "George Eliot", "Mary Shelley"), "Culture", ""),
            en = LocalizedContent("Which author wrote 'Pride and Prejudice'?", listOf("Jane Austen", "Charlotte Brontë", "George Eliot", "Mary Shelley"), "Culture", ""),
            zh = LocalizedContent("《傲慢与偏见》的作者是谁？", listOf("简·奥斯汀", "夏洛蒂·勃朗特", "乔治·艾略特", "玛丽·雪莱"), "文化", ""),
            es = LocalizedContent("¿Qué autor escribió 'Orgullo y prejuicio'?", listOf("Jane Austen", "Charlotte Brontë", "George Eliot", "Mary Shelley"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 9050, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel peintre flamand est connu pour ses portraits 'Un couple bourgeois' ?", listOf("Jan van Eyck", "Pieter Bruegel", "Rogier van der Weyden", "Hieronymus Bosch"), "Culture", ""),
            en = LocalizedContent("Which Flemish painter is known for his portrait 'The Arnolfini Portrait'?", listOf("Jan van Eyck", "Pieter Bruegel", "Rogier van der Weyden", "Hieronymus Bosch"), "Culture", ""),
            zh = LocalizedContent("哪位佛兰德斯画家以其肖像画《阿尔诺芬尼夫妇像》而闻名？", listOf("扬·凡·艾克", "彼得·勃鲁盖尔", "罗希尔·范德魏登", "希罗尼穆斯·博斯"), "文化", ""),
            es = LocalizedContent("¿Qué pintor flamenco es conocido por su retrato 'El matrimonio Arnolfini'?", listOf("Jan van Eyck", "Pieter Bruegel", "Rogier van der Weyden", "Hieronymus Bosch"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 9051, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui est l'auteur de 'Brave New World' ?", listOf("Aldous Huxley", "George Orwell", "H.G. Wells", "Ray Bradbury"), "Culture", ""),
            en = LocalizedContent("Who is the author of 'Brave New World'?", listOf("Aldous Huxley", "George Orwell", "H.G. Wells", "Ray Bradbury"), "Culture", ""),
            zh = LocalizedContent("《美丽新世界》的作者是谁？", listOf("奥尔德斯·赫胥黎", "乔治·奥威尔", "H.G.威尔斯", "雷·布拉德伯里"), "文化", ""),
            es = LocalizedContent("¿Quién es el autor de 'Un mundo feliz'?", listOf("Aldous Huxley", "George Orwell", "H.G. Wells", "Ray Bradbury"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 9052, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel compositeur est surnommé 'The Red Priest' (Il Prete Rosso) ?", listOf("Antonio Vivaldi", "Claudio Monteverdi", "Arcangelo Corelli", "Henry Purcell"), "Culture", ""),
            en = LocalizedContent("Which composer is nicknamed 'The Red Priest' (Il Prete Rosso)?", listOf("Antonio Vivaldi", "Claudio Monteverdi", "Arcangelo Corelli", "Henry Purcell"), "Culture", ""),
            zh = LocalizedContent("哪位作曲家被称为“红发神父”（Il Prete Rosso）？", listOf("安东尼奥·维瓦尔第", "克劳迪奥·蒙特威尔第", "阿尔坎杰罗·科雷利", "亨利·珀塞尔"), "文化", ""),
            es = LocalizedContent("¿Qué compositor es apodado 'El cura rojo' (Il Prete Rosso)?", listOf("Antonio Vivaldi", "Claudio Monteverdi", "Arcangelo Corelli", "Henry Purcell"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 9053, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui a écrit 'Le Père Noël est une ordure' ?", listOf("La Troupe du Splendid", "Michel Audiard", "Coluche", "Pierre Desproges"), "Culture", ""),
            en = LocalizedContent("Who wrote 'Le Père Noël est une ordure'?", listOf("La Troupe du Splendid", "Michel Audiard", "Coluche", "Pierre Desproges"), "Culture", ""),
            zh = LocalizedContent("《圣诞老人是垃圾》的作者是谁？", listOf("辉煌剧团", "米歇尔·奥迪亚尔", "科吕什", "皮埃尔·德普罗日"), "文化", ""),
            es = LocalizedContent("¿Quién escribió 'Le Père Noël est une ordure'?", listOf("La Troupe du Splendid", "Michel Audiard", "Coluche", "Pierre Desproges"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 9054, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le style architectural du château de Versailles ?", listOf("Baroque classique français", "Gothique", "Néoclassique", "Renaissance"), "Culture", ""),
            en = LocalizedContent("What is the architectural style of the Palace of Versailles?", listOf("French Baroque classicism", "Gothic", "Neoclassical", "Renaissance"), "Culture", ""),
            zh = LocalizedContent("凡尔赛宫的建筑风格是什么？", listOf("法国巴洛克古典主义", "哥特式", "新古典主义", "文艺复兴"), "文化", ""),
            es = LocalizedContent("¿Cuál es el estilo arquitectónico del Palacio de Versalles?", listOf("Barroco clásico francés", "Gótico", "Neoclásico", "Renacimiento"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 9055, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui a écrit 'Les Liaisons dangereuses' ?", listOf("Pierre Choderlos de Laclos", "Voltaire", "Jean-Jacques Rousseau", "Denis Diderot"), "Culture", ""),
            en = LocalizedContent("Who wrote 'Les Liaisons dangereuses'?", listOf("Pierre Choderlos de Laclos", "Voltaire", "Jean-Jacques Rousseau", "Denis Diderot"), "Culture", ""),
            zh = LocalizedContent("《危险关系》的作者是谁？", listOf("皮埃尔·肖代洛·德拉克洛", "伏尔泰", "让-雅克·卢梭", "德尼·狄德罗"), "文化", ""),
            es = LocalizedContent("¿Quién escribió 'Las amistades peligrosas'?", listOf("Pierre Choderlos de Laclos", "Voltaire", "Jean-Jacques Rousseau", "Denis Diderot"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 9056, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel opéra de Puccini se déroule au Japon ?", listOf("Madame Butterfly", "Tosca", "Turandot", "La Bohème"), "Culture", ""),
            en = LocalizedContent("Which Puccini opera is set in Japan?", listOf("Madama Butterfly", "Tosca", "Turandot", "La Bohème"), "Culture", ""),
            zh = LocalizedContent("普契尼的哪部歌剧以日本为背景？", listOf("《蝴蝶夫人》", "《托斯卡》", "《图兰朵》", "《波西米亚人》"), "文化", ""),
            es = LocalizedContent("¿Qué ópera de Puccini se desarrolla en Japón?", listOf("Madama Butterfly", "Tosca", "Turandot", "La Bohème"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 9057, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui a peint 'L'Origine du monde' (1866) ?", listOf("Gustave Courbet", "Édouard Manet", "Edgar Degas", "Paul Gauguin"), "Culture", ""),
            en = LocalizedContent("Who painted 'L'Origine du monde' (1866)?", listOf("Gustave Courbet", "Édouard Manet", "Edgar Degas", "Paul Gauguin"), "Culture", ""),
            zh = LocalizedContent("谁在1866年创作了《世界的起源》？", listOf("古斯塔夫·库尔贝", "爱德华·马奈", "埃德加·德加", "保罗·高更"), "文化", ""),
            es = LocalizedContent("¿Quién pintó 'El origen del mundo' (1866)?", listOf("Gustave Courbet", "Édouard Manet", "Edgar Degas", "Paul Gauguin"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 9058, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel auteur américain a écrit 'The Great Gatsby' ?", listOf("F. Scott Fitzgerald", "Ernest Hemingway", "John Steinbeck", "William Faulkner"), "Culture", ""),
            en = LocalizedContent("Which American author wrote 'The Great Gatsby'?", listOf("F. Scott Fitzgerald", "Ernest Hemingway", "John Steinbeck", "William Faulkner"), "Culture", ""),
            zh = LocalizedContent("哪位美国作家写了《了不起的盖茨比》？", listOf("F.斯科特·菲茨杰拉德", "欧内斯特·海明威", "约翰·斯坦贝克", "威廉·福克纳"), "文化", ""),
            es = LocalizedContent("¿Qué autor estadounidense escribió 'El gran Gatsby'?", listOf("F. Scott Fitzgerald", "Ernest Hemingway", "John Steinbeck", "William Faulkner"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 9059, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui est le compositeur de 'Gymnopédie No. 1' ?", listOf("Erik Satie", "Claude Debussy", "Gabriel Fauré", "César Franck"), "Culture", ""),
            en = LocalizedContent("Who composed 'Gymnopédie No. 1'?", listOf("Erik Satie", "Claude Debussy", "Gabriel Fauré", "César Franck"), "Culture", ""),
            zh = LocalizedContent("《裸体舞曲第一号》的作曲者是谁？", listOf("埃里克·萨蒂", "克洛德·德彪西", "加布里埃尔·福雷", "塞萨尔·弗兰克"), "文化", ""),
            es = LocalizedContent("¿Quién compuso 'Gymnopédie No. 1'?", listOf("Erik Satie", "Claude Debussy", "Gabriel Fauré", "César Franck"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 9060, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que le développement TDD ?", listOf("Test-Driven Development : écrire les tests avant le code", "Technical Design Document", "Deployment-Driven Development", "Tests de Débogage Dynamique"), "Tech", ""),
            en = LocalizedContent("What is TDD development?", listOf("Test-Driven Development: writing tests before code", "Technical Design Document", "Deployment-Driven Development", "Dynamic Debugging Tests"), "Technology", ""),
            zh = LocalizedContent("什么是TDD开发？", listOf("测试驱动开发：先编写测试再写代码", "技术设计文档", "部署驱动开发", "动态调试测试"), "科技", ""),
            es = LocalizedContent("¿Qué es el desarrollo TDD?", listOf("Desarrollo Guiado por Pruebas: escribir las pruebas antes del código", "Documento de Diseño Técnico", "Desarrollo Guiado por Despliegue", "Pruebas de Depuración Dinámica"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 9061, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qu'est-ce qu'une variable immuable ?", listOf("Variable dont la valeur ne peut être modifiée après initialisation", "Variable locale", "Variable globale", "Variable de type string"), "Tech", ""),
            en = LocalizedContent("What is an immutable variable?", listOf("Variable whose value cannot be changed after initialization", "Local variable", "Global variable", "String type variable"), "Technology", ""),
            zh = LocalizedContent("什么是不可变变量？", listOf("初始化后值不能被修改的变量", "局部变量", "全局变量", "字符串类型变量"), "科技", ""),
            es = LocalizedContent("¿Qué es una variable inmutable?", listOf("Variable cuyo valor no puede modificarse después de la inicialización", "Variable local", "Variable global", "Variable de tipo cadena"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 9062, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qu'est-ce que l'injection SQL ?", listOf("Attaque insérant du SQL malveillant dans une requête", "Type de base de données", "Technique de migration", "Optimisation de requête"), "Tech", ""),
            en = LocalizedContent("What is SQL injection?", listOf("Attack inserting malicious SQL into a query", "Type of database", "Migration technique", "Query optimization"), "Technology", ""),
            zh = LocalizedContent("什么是SQL注入？", listOf("在查询中插入恶意SQL的攻击", "数据库类型", "迁移技术", "查询优化"), "科技", ""),
            es = LocalizedContent("¿Qué es la inyección SQL?", listOf("Ataque que inserta SQL malicioso en una consulta", "Tipo de base de datos", "Técnica de migración", "Optimización de consultas"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 9063, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le principe DRY en programmation ?", listOf("Don't Repeat Yourself : éviter la duplication de code", "Design Reusable Yearly", "Declare Reassign Yield", "Data Recovery Yes"), "Tech", ""),
            en = LocalizedContent("What is the DRY principle in programming?", listOf("Don't Repeat Yourself: avoid code duplication", "Design Reusable Yearly", "Declare Reassign Yield", "Data Recovery Yes"), "Technology", ""),
            zh = LocalizedContent("编程中的DRY原则是什么？", listOf("不要重复自己：避免代码重复", "每年可重用设计", "声明重新分配产出", "数据恢复是"), "科技", ""),
            es = LocalizedContent("¿Cuál es el principio DRY en programación?", listOf("No te repitas: evitar la duplicación de código", "Diseño Reutilizable Anual", "Declarar Reasignar Rendimiento", "Recuperación de Datos Sí"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 9064, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qu'est-ce que Git rebase ?", listOf("Réappliquer des commits sur une autre base", "Fusionner deux branches", "Annuler des changements", "Créer une nouvelle branche"), "Tech", ""),
            en = LocalizedContent("What is Git rebase?", listOf("Reapply commits on top of another base", "Merge two branches", "Undo changes", "Create a new branch"), "Technology", ""),
            zh = LocalizedContent("什么是Git rebase？", listOf("将提交重新应用到另一个基础之上", "合并两个分支", "撤销更改", "创建新分支"), "科技", ""),
            es = LocalizedContent("¿Qué es Git rebase?", listOf("Reaplicar commits sobre otra base", "Fusionar dos ramas", "Deshacer cambios", "Crear una nueva rama"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 9065, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qu'est-ce qu'un test unitaire ?", listOf("Test d'une unité de code isolée (fonction, classe)", "Test de l'application complète", "Test de performance", "Test d'intégration"), "Tech", ""),
            en = LocalizedContent("What is a unit test?", listOf("Test of an isolated unit of code (function, class)", "Test of the complete application", "Performance test", "Integration test"), "Technology", ""),
            zh = LocalizedContent("什么是单元测试？", listOf("对隔离的代码单元（函数、类）进行测试", "对整个应用程序进行测试", "性能测试", "集成测试"), "科技", ""),
            es = LocalizedContent("¿Qué es una prueba unitaria?", listOf("Prueba de una unidad de código aislada (función, clase)", "Prueba de la aplicación completa", "Prueba de rendimiento", "Prueba de integración"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 9066, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le rôle d'un proxy inverse ?", listOf("Intermédiaire entre clients et serveurs backend", "Accélérateur DNS", "Filtre de contenu email", "Cache de base de données"), "Tech", ""),
            en = LocalizedContent("What is the role of a reverse proxy?", listOf("Intermediary between clients and backend servers", "DNS accelerator", "Email content filter", "Database cache"), "Technology", ""),
            zh = LocalizedContent("反向代理的作用是什么？", listOf("客户端和后端服务器之间的中介", "DNS加速器", "电子邮件内容过滤器", "数据库缓存"), "科技", ""),
            es = LocalizedContent("¿Cuál es el rol de un proxy inverso?", listOf("Intermediario entre clientes y servidores backend", "Acelerador DNS", "Filtro de contenido de correo electrónico", "Caché de base de datos"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 9067, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que la programmation fonctionnelle ?", listOf("Paradigme basé sur les fonctions pures sans effet de bord", "Programmation avec des fonctions Java", "Programmation orientée objets", "Programmation procédurale"), "Tech", ""),
            en = LocalizedContent("What is functional programming?", listOf("Paradigm based on pure functions without side effects", "Programming with Java functions", "Object-oriented programming", "Procedural programming"), "Technology", ""),
            zh = LocalizedContent("什么是函数式编程？", listOf("基于纯函数、无副作用的编程范式", "使用Java函数编程", "面向对象编程", "过程式编程"), "科技", ""),
            es = LocalizedContent("¿Qué es la programación funcional?", listOf("Paradigma basado en funciones puras sin efectos secundarios", "Programación con funciones Java", "Programación orientada a objetos", "Programación procedural"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 9068, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est l'avantage d'un index en base de données ?", listOf("Accélérer les recherches et requêtes", "Réduire l'espace de stockage", "Sécuriser les données", "Synchroniser les tables"), "Tech", ""),
            en = LocalizedContent("What is the advantage of a database index?", listOf("Speed up searches and queries", "Reduce storage space", "Secure data", "Synchronize tables"), "Technology", ""),
            zh = LocalizedContent("数据库索引的优势是什么？", listOf("加速搜索和查询", "减少存储空间", "保护数据安全", "同步表"), "科技", ""),
            es = LocalizedContent("¿Cuál es la ventaja de un índice en base de datos?", listOf("Acelerar búsquedas y consultas", "Reducir el espacio de almacenamiento", "Asegurar los datos", "Sincronizar tablas"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 9069, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que le cross-site scripting (XSS) ?", listOf("Injection de scripts malveillants dans des pages web vues par d'autres", "Attaque sur des serveurs croisés", "Usurpation de session", "Injection SQL avancée"), "Tech", ""),
            en = LocalizedContent("What is cross-site scripting (XSS)?", listOf("Injection of malicious scripts into web pages viewed by others", "Attack on cross servers", "Session hijacking", "Advanced SQL injection"), "Technology", ""),
            zh = LocalizedContent("什么是跨站脚本攻击（XSS）？", listOf("向他人浏览的网页中注入恶意脚本", "对跨服务器的攻击", "会话劫持", "高级SQL注入"), "科技", ""),
            es = LocalizedContent("¿Qué es el cross-site scripting (XSS)?", listOf("Inyección de scripts maliciosos en páginas web vistas por otros", "Ataque a servidores cruzados", "Suplantación de sesión", "Inyección SQL avanzada"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 9070, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qu'est-ce que la récursivité ?", listOf("Fonction qui s'appelle elle-même", "Boucle infinie", "Algorithme parallèle", "Fonction répétée manuellement"), "Tech", ""),
            en = LocalizedContent("What is recursion?", listOf("Function that calls itself", "Infinite loop", "Parallel algorithm", "Manually repeated function"), "Technology", ""),
            zh = LocalizedContent("什么是递归？", listOf("调用自身的函数", "无限循环", "并行算法", "手动重复的函数"), "科技", ""),
            es = LocalizedContent("¿Qué es la recursividad?", listOf("Función que se llama a sí misma", "Bucle infinito", "Algoritmo paralelo", "Función repetida manualmente"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 9071, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qu'est-ce que Kafka (Apache) ?", listOf("Plateforme de streaming d'événements distribué", "Base de données NoSQL", "Framework web Java", "Outil de monitoring"), "Tech", ""),
            en = LocalizedContent("What is Kafka (Apache)?", listOf("Distributed event streaming platform", "NoSQL database", "Java web framework", "Monitoring tool"), "Technology", ""),
            zh = LocalizedContent("什么是Kafka（Apache）？", listOf("分布式事件流平台", "NoSQL数据库", "Java Web框架", "监控工具"), "科技", ""),
            es = LocalizedContent("¿Qué es Kafka (Apache)?", listOf("Plataforma de streaming de eventos distribuido", "Base de datos NoSQL", "Framework web Java", "Herramienta de monitoreo"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 9072, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le principe de l'encapsulation en POO ?", listOf("Regrouper données et méthodes et contrôler l'accès", "Hériter des attributs", "Surcharger des méthodes", "Créer des interfaces"), "Tech", ""),
            en = LocalizedContent("What is the principle of encapsulation in OOP?", listOf("Group data and methods and control access", "Inherit attributes", "Overload methods", "Create interfaces"), "Technology", ""),
            zh = LocalizedContent("面向对象编程中封装的原则是什么？", listOf("将数据和方法分组并控制访问", "继承属性", "重载方法", "创建接口"), "科技", ""),
            es = LocalizedContent("¿Cuál es el principio de encapsulación en POO?", listOf("Agrupar datos y métodos y controlar el acceso", "Heredar atributos", "Sobrecargar métodos", "Crear interfaces"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 9073, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce qu'un JWT (JSON Web Token) ?", listOf("Token d'authentification encodé et signé", "Format JSON sécurisé", "Protocole de transfert", "Clé de chiffrement"), "Tech", ""),
            en = LocalizedContent("What is a JWT (JSON Web Token)?", listOf("Encoded and signed authentication token", "Secure JSON format", "Transfer protocol", "Encryption key"), "Technology", ""),
            zh = LocalizedContent("什么是JWT（JSON Web Token）？", listOf("编码并签名的身份验证令牌", "安全的JSON格式", "传输协议", "加密密钥"), "科技", ""),
            es = LocalizedContent("¿Qué es un JWT (JSON Web Token)?", listOf("Token de autenticación codificado y firmado", "Formato JSON seguro", "Protocolo de transferencia", "Clave de cifrado"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 9074, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel algorithme est utilisé pour le chiffrement des communications TLS ?", listOf("RSA ou ECC pour l'échange de clés + AES pour les données", "MD5", "SHA-256 uniquement", "DES"), "Tech", ""),
            en = LocalizedContent("Which algorithm is used for TLS communication encryption?", listOf("RSA or ECC for key exchange + AES for data", "MD5", "SHA-256 only", "DES"), "Technology", ""),
            zh = LocalizedContent("TLS通信加密使用哪种算法？", listOf("RSA或ECC用于密钥交换 + AES用于数据", "MD5", "仅SHA-256", "DES"), "科技", ""),
            es = LocalizedContent("¿Qué algoritmo se utiliza para el cifrado de comunicaciones TLS?", listOf("RSA o ECC para el intercambio de claves + AES para los datos", "MD5", "SHA-256 únicamente", "DES"), "Tecnología", "")
        ),
        BilingualQuestion(
            id = 9075, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que la technique 'à la meunière' en cuisine ?", listOf("Poisson fariné puis cuit au beurre", "Cuisson vapeur", "Cuisson au four", "Friture immergée"), "Gastronomie", ""),
            en = LocalizedContent("What is the 'à la meunière' technique in cooking?", listOf("Fish floured then cooked in butter", "Steaming", "Baking", "Deep frying"), "Gastronomy", ""),
            zh = LocalizedContent("烹饪中的'à la meunière'技巧是什么？", listOf("鱼裹上面粉后用黄油烹制", "蒸煮", "烘烤", "油炸"), "美食", ""),
            es = LocalizedContent("¿Qué es la técnica 'a la meunière' en cocina?", listOf("Pescado enharinado y luego cocido en mantequilla", "Cocción al vapor", "Cocción al horno", "Fritura profunda"), "Gastronomía", "")
        ),
        BilingualQuestion(
            id = 9076, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le fromage français à croûte lavée à l'odeur forte ?", listOf("Maroilles ou Époisses", "Brie", "Comté", "Chèvre frais"), "Gastronomie", ""),
            en = LocalizedContent("Which French cheese has a washed rind and strong smell?", listOf("Maroilles or Époisses", "Brie", "Comté", "Fresh goat cheese"), "Gastronomy", ""),
            zh = LocalizedContent("哪种法国奶酪有洗过的外皮和强烈的气味？", listOf("马鲁瓦耶或埃波瓦斯", "布里", "孔泰", "新鲜山羊奶酪"), "美食", ""),
            es = LocalizedContent("¿Qué queso francés tiene corteza lavada y olor fuerte?", listOf("Maroilles o Époisses", "Brie", "Comté", "Queso de cabra fresco"), "Gastronomía", "")
        ),
        BilingualQuestion(
            id = 9077, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que la 'mise en place' en cuisine professionnelle ?", listOf("Préparation et organisation de tous les ingrédients avant le service", "Présentation du plat", "Nettoyage post-service", "Organisation des équipes"), "Gastronomie", ""),
            en = LocalizedContent("What is 'mise en place' in professional cooking?", listOf("Preparation and organization of all ingredients before service", "Plating", "Post-service cleaning", "Team organization"), "Gastronomy", ""),
            zh = LocalizedContent("专业烹饪中的'mise en place'是什么？", listOf("在服务前准备和组织所有食材", "摆盘", "服务后清洁", "团队组织"), "美食", ""),
            es = LocalizedContent("¿Qué es la 'mise en place' en cocina profesional?", listOf("Preparación y organización de todos los ingredientes antes del servicio", "Presentación del plato", "Limpieza posterior al servicio", "Organización del equipo"), "Gastronomía", "")
        ),
        BilingualQuestion(
            id = 9078, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est l'ingrédient principal du tzatziki ?", listOf("Yaourt grec, concombre et ail", "Houmous et citron", "Fromage feta et olives", "Aubergine et tahini"), "Gastronomie", ""),
            en = LocalizedContent("What is the main ingredient of tzatziki?", listOf("Greek yogurt, cucumber and garlic", "Hummus and lemon", "Feta cheese and olives", "Eggplant and tahini"), "Gastronomy", ""),
            zh = LocalizedContent("tzatziki的主要成分是什么？", listOf("希腊酸奶、黄瓜和大蒜", "鹰嘴豆泥和柠檬", "菲达奶酪和橄榄", "茄子和芝麻酱"), "美食", ""),
            es = LocalizedContent("¿Cuál es el ingrediente principal del tzatziki?", listOf("Yogur griego, pepino y ajo", "Hummus y limón", "Queso feta y aceitunas", "Berenjena y tahini"), "Gastronomía", "")
        ),
        BilingualQuestion(
            id = 9079, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que la technique de 'blanchir' des légumes ?", listOf("Cuisson rapide à l'eau bouillante puis refroidissement", "Cuisson longue à basse température", "Cuisson à la vapeur", "Marinage dans du vinaigre"), "Gastronomie", ""),
            en = LocalizedContent("What is the technique of 'blanching' vegetables?", listOf("Quick cooking in boiling water then cooling", "Long cooking at low temperature", "Steaming", "Marinating in vinegar"), "Gastronomy", ""),
            zh = LocalizedContent("蔬菜的'焯水'技巧是什么？", listOf("在沸水中快速烹煮然后冷却", "长时间低温烹煮", "蒸煮", "用醋腌制"), "美食", ""),
            es = LocalizedContent("¿Qué es la técnica de 'escaldar' verduras?", listOf("Cocción rápida en agua hirviendo y luego enfriamiento", "Cocción larga a baja temperatura", "Cocción al vapor", "Marinado en vinagre"), "Gastronomía", "")
        ),
        BilingualQuestion(
            id = 9080, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le plat national de l'Allemagne ?", listOf("Pas de plat unique (choucroute, Bratwurst, Schnitzel selon régions)", "La choucroute uniquement", "Le Bratwurst", "Le Spätzle"), "Gastronomie", ""),
            en = LocalizedContent("What is the national dish of Germany?", listOf("No single dish (sauerkraut, Bratwurst, Schnitzel vary by region)", "Sauerkraut only", "Bratwurst", "Spätzle"), "Gastronomy", ""),
            zh = LocalizedContent("德国的国菜是什么？", listOf("没有单一菜肴（酸菜、德国香肠、炸肉排因地区而异）", "只有酸菜", "德国香肠", "鸡蛋面"), "美食", ""),
            es = LocalizedContent("¿Cuál es el plato nacional de Alemania?", listOf("No hay un plato único (chucrut, Bratwurst, Schnitzel según regiones)", "Solo chucrut", "Bratwurst", "Spätzle"), "Gastronomía", "")
        ),
        BilingualQuestion(
            id = 9081, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qu'est-ce que le 'deuxième service' dans un repas gastronomique français traditionnel ?", listOf("Les plats chauds après les entrées", "Le dessert", "Le fromage", "Le digestif"), "Gastronomie", ""),
            en = LocalizedContent("What is the 'second service' in a traditional French gastronomic meal?", listOf("Hot dishes after the starters", "Dessert", "Cheese", "Digestif"), "Gastronomy", ""),
            zh = LocalizedContent("在传统法式美食餐中，“第二道菜”是什么？", listOf("开胃菜后的热菜", "甜点", "奶酪", "餐后酒"), "美食", ""),
            es = LocalizedContent("¿Qué es el 'segundo servicio' en una comida gastronómica francesa tradicional?", listOf("Los platos calientes después de las entradas", "El postre", "El queso", "El digestivo"), "Gastronomía", "")
        ),
        BilingualQuestion(
            id = 9082, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le principal ingrédient de la paëlla valenciana traditionnelle ?", listOf("Poulet, lapin, haricots, escargots et riz (pas de fruits de mer)", "Fruits de mer uniquement", "Chorizo et moules", "Riz noir et calamars"), "Gastronomie", ""),
            en = LocalizedContent("What is the main ingredient of traditional Valencian paella?", listOf("Chicken, rabbit, beans, snails and rice (no seafood)", "Seafood only", "Chorizo and mussels", "Black rice and squid"), "Gastronomy", ""),
            zh = LocalizedContent("传统瓦伦西亚海鲜饭的主要成分是什么？", listOf("鸡肉、兔肉、豆类、蜗牛和米饭（不含海鲜）", "只有海鲜", "西班牙辣香肠和贻贝", "黑米饭和鱿鱼"), "美食", ""),
            es = LocalizedContent("¿Cuál es el ingrediente principal de la paella valenciana tradicional?", listOf("Pollo, conejo, judías, caracoles y arroz (sin mariscos)", "Solo mariscos", "Chorizo y mejillones", "Arroz negro y calamares"), "Gastronomía", "")
        ),
        BilingualQuestion(
            id = 9083, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que le 'butterscotch' ?", listOf("Confiserie à base de beurre et sucre brun caramélisé", "Sauce au beurre salé", "Caramel au lait", "Praline au beurre"), "Gastronomie", ""),
            en = LocalizedContent("What is 'butterscotch'?", listOf("Confectionery made from butter and caramelized brown sugar", "Salted butter sauce", "Milk caramel", "Butter praline"), "Gastronomy", ""),
            zh = LocalizedContent("什么是“奶油糖果”？", listOf("用黄油和焦化红糖制成的糖果", "咸黄油酱", "牛奶焦糖", "黄油果仁糖"), "美食", ""),
            es = LocalizedContent("¿Qué es el 'butterscotch'?", listOf("Dulce hecho con mantequilla y azúcar moreno caramelizado", "Salsa de mantequilla salada", "Caramelo de leche", "Praliné de mantequilla"), "Gastronomía", "")
        ),
        BilingualQuestion(
            id = 9084, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le plat national de la Hongrie ?", listOf("Le goulash (pörkölt)", "Le paprikash", "Le lángos", "La töltött káposzta"), "Gastronomie", ""),
            en = LocalizedContent("What is the national dish of Hungary?", listOf("Goulash (pörkölt)", "Paprikash", "Lángos", "Töltött káposzta"), "Gastronomy", ""),
            zh = LocalizedContent("匈牙利的国菜是什么？", listOf("古拉什（炖牛肉）", "辣椒鸡", "兰戈斯", "酿卷心菜"), "美食", ""),
            es = LocalizedContent("¿Cuál es el plato nacional de Hungría?", listOf("Gulash (pörkölt)", "Paprikash", "Lángos", "Töltött káposzta"), "Gastronomía", "")
        ),
        BilingualQuestion(
            id = 9085, correctIndex = 0, difficulty = Difficulty.EXPERT,
            fr = LocalizedContent("Quel est le record du monde du 110m haies masculin ?", listOf("12,80 s (Aries Merritt, 2012)", "12,91 s (Liu Xiang)", "12,75 s", "12,85 s"), "Sport", ""),
            en = LocalizedContent("What is the men's 110m hurdles world record?", listOf("12.80 s (Aries Merritt, 2012)", "12.91 s (Liu Xiang)", "12.75 s", "12.85 s"), "Sports", ""),
            zh = LocalizedContent("男子110米栏的世界纪录是多少？", listOf("12.80秒（阿里斯·梅里特，2012年）", "12.91秒（刘翔）", "12.75秒", "12.85秒"), "体育", ""),
            es = LocalizedContent("¿Cuál es el récord mundial de 110 m vallas masculino?", listOf("12,80 s (Aries Merritt, 2012)", "12,91 s (Liu Xiang)", "12,75 s", "12,85 s"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 9086, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Dans quel sport pratique-t-on le 'crochet du droit' ?", listOf("Boxe", "Karaté", "Judo", "Lutte"), "Sport", ""),
            en = LocalizedContent("In which sport is the 'right hook' practiced?", listOf("Boxing", "Karate", "Judo", "Wrestling"), "Sports", ""),
            zh = LocalizedContent("在哪种运动中练习“右勾拳”？", listOf("拳击", "空手道", "柔道", "摔跤"), "体育", ""),
            es = LocalizedContent("¿En qué deporte se practica el 'gancho de derecha'?", listOf("Boxeo", "Kárate", "Judo", "Lucha"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 9087, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel pays a le plus de clubs de football dans le Top 50 mondial ?", listOf("Espagne, Angleterre ou Italie (selon les classements)", "Espagne uniquement", "France", "Allemagne"), "Sport", ""),
            en = LocalizedContent("Which country has the most football clubs in the global Top 50?", listOf("Spain, England or Italy (depending on rankings)", "Spain only", "France", "Germany"), "Sports", ""),
            zh = LocalizedContent("哪个国家在全球前50名中拥有最多的足球俱乐部？", listOf("西班牙、英格兰或意大利（取决于排名）", "只有西班牙", "法国", "德国"), "体育", ""),
            es = LocalizedContent("¿Qué país tiene más clubes de fútbol en el Top 50 mundial?", listOf("España, Inglaterra o Italia (según clasificaciones)", "Solo España", "Francia", "Alemania"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 9088, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Combien d'équipes composent la Ligue 1 de football en France ?", listOf("18 équipes", "20 équipes", "16 équipes", "22 équipes"), "Sport", ""),
            en = LocalizedContent("How many teams make up Ligue 1 in France?", listOf("18 teams", "20 teams", "16 teams", "22 teams"), "Sports", ""),
            zh = LocalizedContent("法国足球甲级联赛由多少支球队组成？", listOf("18支球队", "20支球队", "16支球队", "22支球队"), "体育", ""),
            es = LocalizedContent("¿Cuántos equipos componen la Ligue 1 de fútbol en Francia?", listOf("18 equipos", "20 equipos", "16 equipos", "22 equipos"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 9089, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quelle est la distance d'un semi-marathon ?", listOf("21,097 km", "20 km", "25 km", "21,5 km"), "Sport", ""),
            en = LocalizedContent("What is the distance of a half marathon?", listOf("21.097 km", "20 km", "25 km", "21.5 km"), "Sports", ""),
            zh = LocalizedContent("半程马拉松的距离是多少？", listOf("21.097公里", "20公里", "25公里", "21.5公里"), "体育", ""),
            es = LocalizedContent("¿Cuál es la distancia de una media maratón?", listOf("21,097 km", "20 km", "25 km", "21,5 km"), "Deportes", "")
        ),
    )

    private fun part3(): List<BilingualQuestion> = listOf(
        BilingualQuestion(
            id = 9090, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le sport officiel de la Corée du Nord ?", listOf("Il n'y a pas de sport officiel (chasse, tir à la corde sont populaires)", "Taekwondo", "Judo", "Football"), "Sport", ""),
            en = LocalizedContent("What is the official sport of North Korea?", listOf("There is no official sport (hunting, tug of war are popular)", "Taekwondo", "Judo", "Football"), "Sports", ""),
            zh = LocalizedContent("朝鲜的官方运动是什么？", listOf("没有官方运动（狩猎、拔河很流行）", "跆拳道", "柔道", "足球"), "体育", ""),
            es = LocalizedContent("¿Cuál es el deporte oficial de Corea del Norte?", listOf("No hay deporte oficial (la caza, el tira y afloja son populares)", "Taekwondo", "Judo", "Fútbol"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 9091, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Dans quel sport pratique-t-on le 'drive' ?", listOf("Golf et cricket (termes différents)", "Seulement le golf", "Tennis uniquement", "Badminton"), "Sport", ""),
            en = LocalizedContent("In which sport is the 'drive' practiced?", listOf("Golf and cricket (different terms)", "Only golf", "Tennis only", "Badminton"), "Sports", ""),
            zh = LocalizedContent("在哪种运动中练习“drive”？", listOf("高尔夫和板球（术语不同）", "仅高尔夫", "仅网球", "羽毛球"), "体育", ""),
            es = LocalizedContent("¿En qué deporte se practica el 'drive'?", listOf("Golf y críquet (términos diferentes)", "Solo golf", "Solo tenis", "Bádminton"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 9092, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel fut le premier club de football professionnel en France ?", listOf("Difficile à déterminer : Le Havre AC (1872) est le plus ancien", "Paris Saint-Germain", "Olympique de Marseille", "AS Monaco"), "Sport", ""),
            en = LocalizedContent("What was the first professional football club in France?", listOf("Difficult to determine: Le Havre AC (1872) is the oldest", "Paris Saint-Germain", "Olympique de Marseille", "AS Monaco"), "Sports", ""),
            zh = LocalizedContent("法国第一家职业足球俱乐部是哪家？", listOf("难以确定：勒阿弗尔AC（1872年）是最古老的", "巴黎圣日耳曼", "马赛奥林匹克", "摩纳哥AS"), "体育", ""),
            es = LocalizedContent("¿Cuál fue el primer club de fútbol profesional en Francia?", listOf("Difícil de determinar: Le Havre AC (1872) es el más antiguo", "Paris Saint-Germain", "Olympique de Marseille", "AS Monaco"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 9093, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Combien de joueurs a une équipe de hockey sur glace sur la patinoire ?", listOf("6 joueurs (gardien + 5 joueurs de champ)", "5 joueurs", "7 joueurs", "8 joueurs"), "Sport", ""),
            en = LocalizedContent("How many players does an ice hockey team have on the rink?", listOf("6 players (goalie + 5 skaters)", "5 players", "7 players", "8 players"), "Sports", ""),
            zh = LocalizedContent("冰球队在冰场上有多少名球员？", listOf("6名球员（守门员+5名场上球员）", "5名球员", "7名球员", "8名球员"), "体育", ""),
            es = LocalizedContent("¿Cuántos jugadores tiene un equipo de hockey sobre hielo en la pista?", listOf("6 jugadores (portero + 5 jugadores de campo)", "5 jugadores", "7 jugadores", "8 jugadores"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 9094, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel pays a remporté le plus de Coupes du Monde de handball féminin ?", listOf("Norvège (8 titres)", "Russie", "Danemark", "France"), "Sport", ""),
            en = LocalizedContent("Which country has won the most Women's Handball World Championships?", listOf("Norway (8 titles)", "Russia", "Denmark", "France"), "Sports", ""),
            zh = LocalizedContent("哪个国家赢得了最多的女子手球世界锦标赛？", listOf("挪威（8次冠军）", "俄罗斯", "丹麦", "法国"), "体育", ""),
            es = LocalizedContent("¿Qué país ha ganado más Campeonatos Mundiales de Balonmano Femenino?", listOf("Noruega (8 títulos)", "Rusia", "Dinamarca", "Francia"), "Deportes", "")
        ),
        BilingualQuestion(
            id = 9095, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qu'est-ce que le Valhalla dans la mythologie nordique ?", listOf("Salle des guerriers morts honorablement, paradis des héros", "Demeure des dieux", "Monde des morts", "Royaume de glace"), "Culture", ""),
            en = LocalizedContent("What is Valhalla in Norse mythology?", listOf("Hall of warriors who died honorably, paradise of heroes", "Dwelling of the gods", "World of the dead", "Realm of ice"), "Culture", ""),
            zh = LocalizedContent("北欧神话中的瓦尔哈拉是什么？", listOf("光荣战死者的殿堂，英雄的天堂", "众神的居所", "死者世界", "冰之国度"), "文化", ""),
            es = LocalizedContent("¿Qué es el Valhalla en la mitología nórdica?", listOf("Sala de los guerreros muertos honorablemente, paraíso de los héroes", "Morada de los dioses", "Mundo de los muertos", "Reino de hielo"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 9096, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le dieu de la forge dans la mythologie romaine ?", listOf("Vulcain", "Mars", "Neptune", "Mercure"), "Culture", ""),
            en = LocalizedContent("Who is the god of the forge in Roman mythology?", listOf("Vulcan", "Mars", "Neptune", "Mercury"), "Culture", ""),
            zh = LocalizedContent("罗马神话中的锻造之神是谁？", listOf("伏尔甘", "马尔斯", "尼普顿", "墨丘利"), "文化", ""),
            es = LocalizedContent("¿Quién es el dios de la forja en la mitología romana?", listOf("Vulcano", "Marte", "Neptuno", "Mercurio"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 9097, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui sont les Amazones dans la mythologie grecque ?", listOf("Guerrières légendaires vivant sans hommes", "Déesses de la chasse", "Nymphes aquatiques", "Filles de Zeus"), "Culture", ""),
            en = LocalizedContent("Who are the Amazons in Greek mythology?", listOf("Legendary female warriors living without men", "Goddesses of the hunt", "Water nymphs", "Daughters of Zeus"), "Culture", ""),
            zh = LocalizedContent("希腊神话中的亚马逊人是谁？", listOf("没有男人生活的传奇女战士", "狩猎女神", "水仙女", "宙斯的女儿们"), "文化", ""),
            es = LocalizedContent("¿Quiénes son las Amazonas en la mitología griega?", listOf("Guerreras legendarias que viven sin hombres", "Diosas de la caza", "Ninfas acuáticas", "Hijas de Zeus"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 9098, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel animal est sacré dans la religion hindoue ?", listOf("La vache", "L'éléphant", "Le tigre", "Le paon"), "Culture", ""),
            en = LocalizedContent("Which animal is sacred in the Hindu religion?", listOf("The cow", "The elephant", "The tiger", "The peacock"), "Culture", ""),
            zh = LocalizedContent("印度教中哪种动物是神圣的？", listOf("牛", "大象", "老虎", "孔雀"), "文化", ""),
            es = LocalizedContent("¿Qué animal es sagrado en la religión hindú?", listOf("La vaca", "El elefante", "El tigre", "El pavo real"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 9099, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qu'est-ce que le Ramadan dans l'islam ?", listOf("Mois de jeûne du lever au coucher du soleil", "Pèlerinage à La Mecque", "Fête de fin d'année", "Prière quotidienne"), "Culture", ""),
            en = LocalizedContent("What is Ramadan in Islam?", listOf("Month of fasting from dawn to sunset", "Pilgrimage to Mecca", "End-of-year festival", "Daily prayer"), "Culture", ""),
            zh = LocalizedContent("伊斯兰教中的斋月是什么？", listOf("从黎明到日落禁食的月份", "前往麦加朝圣", "年终节日", "每日祈祷"), "文化", ""),
            es = LocalizedContent("¿Qué es el Ramadán en el islam?", listOf("Mes de ayuno desde el amanecer hasta el atardecer", "Peregrinación a La Meca", "Fiesta de fin de año", "Oración diaria"), "Cultura", "")
        ),
        BilingualQuestion(
            id = 9100, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que la théorie de l'attachement (Bowlby) ?", listOf("Lien affectif précoce entre enfant et figure d'attachement", "Dépendance aux soins parentaux", "Développement cognitif de l'enfant", "Apprentissage par imitation"), "Sciences Humaines", ""),
            en = LocalizedContent("What is Bowlby's attachment theory?", listOf("Early emotional bond between child and attachment figure", "Dependence on parental care", "Cognitive development of the child", "Learning by imitation"), "Human Sciences", ""),
            zh = LocalizedContent("什么是鲍尔比的依恋理论？", listOf("儿童与依恋对象之间的早期情感纽带", "对父母照顾的依赖", "儿童的认知发展", "通过模仿学习"), "人文科学", ""),
            es = LocalizedContent("¿Qué es la teoría del apego de Bowlby?", listOf("Vínculo afectivo temprano entre el niño y la figura de apego", "Dependencia del cuidado parental", "Desarrollo cognitivo del niño", "Aprendizaje por imitación"), "Ciencias Humanas", "")
        ),
        BilingualQuestion(
            id = 9101, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qu'est-ce que la sociologie de Durkheim apporte ?", listOf("Étude des faits sociaux comme réalités objectives (suicide, religion)", "Psychologie des masses", "Économie sociale", "Anthropologie culturelle"), "Sciences Humaines", ""),
            en = LocalizedContent("What does Durkheim's sociology contribute?", listOf("Study of social facts as objective realities (suicide, religion)", "Mass psychology", "Social economy", "Cultural anthropology"), "Human Sciences", ""),
            zh = LocalizedContent("涂尔干的社会学贡献了什么？", listOf("将社会事实作为客观现实进行研究（自杀、宗教）", "大众心理学", "社会经济学", "文化人类学"), "人文科学", ""),
            es = LocalizedContent("¿Qué aporta la sociología de Durkheim?", listOf("Estudio de los hechos sociales como realidades objetivas (suicidio, religión)", "Psicología de masas", "Economía social", "Antropología cultural"), "Ciencias Humanas", "")
        ),
        BilingualQuestion(
            id = 9102, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qu'est-ce que le structuralisme de Lévi-Strauss ?", listOf("Structures universelles inconscientes gouvernant les sociétés", "Étude des comportements observables", "Économie des sociétés primitives", "Évolution culturelle darwinienne"), "Sciences Humaines", ""),
            en = LocalizedContent("What is Lévi-Strauss's structuralism?", listOf("Universal unconscious structures governing societies", "Study of observable behaviors", "Economy of primitive societies", "Darwinian cultural evolution"), "Human Sciences", ""),
            zh = LocalizedContent("什么是列维-斯特劳斯的结构主义？", listOf("支配社会的普遍无意识结构", "对可观察行为的研究", "原始社会的经济", "达尔文式的文化进化"), "人文科学", ""),
            es = LocalizedContent("¿Qué es el estructuralismo de Lévi-Strauss?", listOf("Estructuras universales inconscientes que gobiernan las sociedades", "Estudio de los comportamientos observables", "Economía de las sociedades primitivas", "Evolución cultural darwiniana"), "Ciencias Humanas", "")
        ),
        BilingualQuestion(
            id = 9103, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qu'est-ce que la mémoire collective (Halbwachs) ?", listOf("Mémoire partagée par un groupe social", "Mémoire individuelle influencée par le groupe", "Archives nationales", "Transmision orale traditionnelle"), "Sciences Humaines", ""),
            en = LocalizedContent("What is collective memory (Halbwachs)?", listOf("Memory shared by a social group", "Individual memory influenced by the group", "National archives", "Traditional oral transmission"), "Human Sciences", ""),
            zh = LocalizedContent("什么是集体记忆（哈布瓦赫）？", listOf("社会群体共享的记忆", "受群体影响的个体记忆", "国家档案", "传统口头传承"), "人文科学", ""),
            es = LocalizedContent("¿Qué es la memoria colectiva (Halbwachs)?", listOf("Memoria compartida por un grupo social", "Memoria individual influenciada por el grupo", "Archivos nacionales", "Transmisión oral tradicional"), "Ciencias Humanas", "")
        ),
        BilingualQuestion(
            id = 9104, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que le behaviorisme ?", listOf("Étude du comportement observable et mesurable", "Étude de l'inconscient", "Psychologie cognitive", "Neurosciences"), "Sciences Humaines", ""),
            en = LocalizedContent("What is behaviorism?", listOf("Study of observable and measurable behavior", "Study of the unconscious", "Cognitive psychology", "Neuroscience"), "Human Sciences", ""),
            zh = LocalizedContent("什么是行为主义？", listOf("对可观察和可测量行为的研究", "对无意识的研究", "认知心理学", "神经科学"), "人文科学", ""),
            es = LocalizedContent("¿Qué es el conductismo?", listOf("Estudio del comportamiento observable y medible", "Estudio del inconsciente", "Psicología cognitiva", "Neurociencia"), "Ciencias Humanas", "")
        ),
        BilingualQuestion(
            id = 9105, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qu'est-ce que le produit marginal du travail ?", listOf("Production supplémentaire issue d'une unité de travail supplémentaire", "Salaire minimum", "Production totale par travailleur", "Coût du travail"), "Économie", ""),
            en = LocalizedContent("What is the marginal product of labor?", listOf("Additional output from an additional unit of labor", "Minimum wage", "Total output per worker", "Cost of labor"), "Economics", ""),
            zh = LocalizedContent("什么是劳动的边际产量？", listOf("额外一单位劳动带来的额外产出", "最低工资", "每个工人的总产出", "劳动成本"), "经济学", ""),
            es = LocalizedContent("¿Qué es el producto marginal del trabajo?", listOf("Producción adicional derivada de una unidad adicional de trabajo", "Salario mínimo", "Producción total por trabajador", "Costo del trabajo"), "Economía", "")
        ),
        BilingualQuestion(
            id = 9106, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que la stagflation ?", listOf("Combinaison simultanée de stagnation et d'inflation", "Inflation contrôlée", "Déflation avec chômage", "Récession sans inflation"), "Économie", ""),
            en = LocalizedContent("What is stagflation?", listOf("Simultaneous combination of stagnation and inflation", "Controlled inflation", "Deflation with unemployment", "Recession without inflation"), "Economics", ""),
            zh = LocalizedContent("什么是滞胀？", listOf("停滞和通货膨胀同时并存", "可控的通货膨胀", "通货紧缩伴随失业", "无通货膨胀的衰退"), "经济学", ""),
            es = LocalizedContent("¿Qué es la estanflación?", listOf("Combinación simultánea de estancamiento e inflación", "Inflación controlada", "Deflación con desempleo", "Recesión sin inflación"), "Economía", "")
        ),
        BilingualQuestion(
            id = 9107, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel économiste a popularisé le concept de 'destruction créatrice' ?", listOf("Joseph Schumpeter", "John Maynard Keynes", "Milton Friedman", "Karl Marx"), "Économie", ""),
            en = LocalizedContent("Which economist popularized the concept of 'creative destruction'?", listOf("Joseph Schumpeter", "John Maynard Keynes", "Milton Friedman", "Karl Marx"), "Economics", ""),
            zh = LocalizedContent("哪位经济学家普及了“创造性破坏”的概念？", listOf("约瑟夫·熊彼特", "约翰·梅纳德·凯恩斯", "米尔顿·弗里德曼", "卡尔·马克思"), "经济学", ""),
            es = LocalizedContent("¿Qué economista popularizó el concepto de 'destrucción creativa'?", listOf("Joseph Schumpeter", "John Maynard Keynes", "Milton Friedman", "Karl Marx"), "Economía", "")
        ),
        BilingualQuestion(
            id = 9108, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qu'est-ce que le déficit budgétaire ?", listOf("Dépenses gouvernementales supérieures aux recettes", "Dette nationale totale", "Balance commerciale négative", "Taux d'intérêt élevé"), "Économie", ""),
            en = LocalizedContent("What is a budget deficit?", listOf("Government spending exceeding revenue", "Total national debt", "Negative trade balance", "High interest rate"), "Economics", ""),
            zh = LocalizedContent("什么是预算赤字？", listOf("政府支出超过收入", "国家债务总额", "贸易逆差", "高利率"), "经济学", ""),
            es = LocalizedContent("¿Qué es el déficit presupuestario?", listOf("Gastos gubernamentales superiores a los ingresos", "Deuda nacional total", "Balanza comercial negativa", "Tasa de interés alta"), "Economía", "")
        ),
        BilingualQuestion(
            id = 9109, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que l'élasticité-prix de la demande ?", listOf("Sensibilité de la demande aux variations de prix", "Prix fixé par l'État", "Flexibilité des salaires", "Variation des taux de change"), "Économie", ""),
            en = LocalizedContent("What is the price elasticity of demand?", listOf("Sensitivity of demand to price changes", "Price set by the state", "Wage flexibility", "Exchange rate variation"), "Economics", ""),
            zh = LocalizedContent("什么是需求的价格弹性？", listOf("需求对价格变化的敏感度", "国家制定的价格", "工资灵活性", "汇率变动"), "经济学", ""),
            es = LocalizedContent("¿Qué es la elasticidad precio de la demanda?", listOf("Sensibilidad de la demanda a las variaciones de precio", "Precio fijado por el Estado", "Flexibilidad salarial", "Variación del tipo de cambio"), "Economía", "")
        ),
        BilingualQuestion(
            id = 9110, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que la géopolitique ?", listOf("Étude de l'influence de la géographie sur la politique", "Relations diplomatiques entre États", "Politique intérieure des États", "Économie internationale"), "Politique", ""),
            en = LocalizedContent("What is geopolitics?", listOf("Study of the influence of geography on politics", "Diplomatic relations between states", "Domestic politics of states", "International economics"), "Politics", ""),
            zh = LocalizedContent("什么是地缘政治学？", listOf("研究地理对政治影响的学科", "国家间的外交关系", "国家的国内政治", "国际经济"), "政治", ""),
            es = LocalizedContent("¿Qué es la geopolítica?", listOf("Estudio de la influencia de la geografía en la política", "Relaciones diplomáticas entre estados", "Política interior de los estados", "Economía internacional"), "Política", "")
        ),
        BilingualQuestion(
            id = 9111, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qu'est-ce qu'une dictature militaire ?", listOf("Régime où des militaires détiennent le pouvoir politique", "Régime avec une armée forte", "Guerre civile", "État d'urgence"), "Politique", ""),
            en = LocalizedContent("What is a military dictatorship?", listOf("Regime where the military holds political power", "Regime with a strong army", "Civil war", "State of emergency"), "Politics", ""),
            zh = LocalizedContent("什么是军事独裁？", listOf("军人掌握政治权力的政权", "拥有强大军队的政权", "内战", "紧急状态"), "政治", ""),
            es = LocalizedContent("¿Qué es una dictadura militar?", listOf("Régimen donde los militares detentan el poder político", "Régimen con un ejército fuerte", "Guerra civil", "Estado de emergencia"), "Política", "")
        ),
        BilingualQuestion(
            id = 9112, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qu'est-ce que le fédéralisme ?", listOf("Système où pouvoir est partagé entre gouvernement central et entités locales", "Confédération d'États souverains", "État unitaire décentralisé", "Régime parlementaire"), "Politique", ""),
            en = LocalizedContent("What is federalism?", listOf("System where power is shared between central government and local entities", "Confederation of sovereign states", "Decentralized unitary state", "Parliamentary system"), "Politics", ""),
            zh = LocalizedContent("什么是联邦制？", listOf("中央政府和地方实体共享权力的制度", "主权国家的邦联", "权力下放的单一制国家", "议会制"), "政治", ""),
            es = LocalizedContent("¿Qué es el federalismo?", listOf("Sistema donde el poder se comparte entre el gobierno central y entidades locales", "Confederación de estados soberanos", "Estado unitario descentralizado", "Régimen parlamentario"), "Política", "")
        ),
        BilingualQuestion(
            id = 9113, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qu'est-ce que l'OTAN ?", listOf("Alliance militaire de l'Atlantique Nord (fondée en 1949)", "Organisation de coopération économique", "Traité de sécurité asiatique", "Organisation des Nations Unis militaire"), "Politique", ""),
            en = LocalizedContent("What is NATO?", listOf("North Atlantic military alliance (founded in 1949)", "Economic cooperation organization", "Asian security treaty", "Military United Nations organization"), "Politics", ""),
            zh = LocalizedContent("什么是北约？", listOf("北大西洋军事联盟（成立于1949年）", "经济合作组织", "亚洲安全条约", "军事化的联合国组织"), "政治", ""),
            es = LocalizedContent("¿Qué es la OTAN?", listOf("Alianza militar del Atlántico Norte (fundada en 1949)", "Organización de cooperación económica", "Tratado de seguridad asiático", "Organización militar de las Naciones Unidas"), "Política", "")
        ),
        BilingualQuestion(
            id = 9114, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est le système politique de la Suisse ?", listOf("Démocratie directe fédérale avec référendums fréquents", "Monarchie constitutionnelle", "République présidentielle", "Démocratie parlementaire unicamérale"), "Politique", ""),
            en = LocalizedContent("What is the political system of Switzerland?", listOf("Federal direct democracy with frequent referendums", "Constitutional monarchy", "Presidential republic", "Unicameral parliamentary democracy"), "Politics", ""),
            zh = LocalizedContent("瑞士的政治制度是什么？", listOf("联邦直接民主制，频繁举行公投", "君主立宪制", "总统共和制", "一院制议会民主"), "政治", ""),
            es = LocalizedContent("¿Cuál es el sistema político de Suiza?", listOf("Democracia directa federal con referendos frecuentes", "Monarquía constitucional", "República presidencial", "Democracia parlamentaria unicameral"), "Política", "")
        ),
        BilingualQuestion(
            id = 9115, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qu'est-ce qu'une espèce invasive ?", listOf("Espèce introduite perturbant l'écosystème local", "Espèce en voie d'extinction", "Espèce endémique menacée", "Espèce migratrice"), "Nature", ""),
            en = LocalizedContent("What is an invasive species?", listOf("Introduced species that disrupts the local ecosystem", "Endangered species", "Threatened endemic species", "Migratory species"), "Nature", ""),
            zh = LocalizedContent("什么是入侵物种？", listOf("引入后破坏当地生态系统的物种", "濒危物种", "受威胁的特有物种", "迁徙物种"), "自然", ""),
            es = LocalizedContent("¿Qué es una especie invasora?", listOf("Especie introducida que perturba el ecosistema local", "Especie en peligro de extinción", "Especie endémica amenazada", "Especie migratoria"), "Naturaleza", "")
        ),
        BilingualQuestion(
            id = 9116, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qu'est-ce que le carbone bleu ?", listOf("Carbone stocké par les écosystèmes marins côtiers", "CO₂ dans l'eau", "Carbone des forêts tempérées", "Carbone des tourbières"), "Nature", ""),
            en = LocalizedContent("What is blue carbon?", listOf("Carbon stored by coastal marine ecosystems", "CO₂ in water", "Carbon from temperate forests", "Carbon from peatlands"), "Nature", ""),
            zh = LocalizedContent("什么是蓝碳？", listOf("沿海海洋生态系统储存的碳", "水中的二氧化碳", "温带森林的碳", "泥炭地的碳"), "自然", ""),
            es = LocalizedContent("¿Qué es el carbono azul?", listOf("Carbono almacenado por los ecosistemas marinos costeros", "CO₂ en el agua", "Carbono de los bosques templados", "Carbono de las turberas"), "Naturaleza", "")
        ),
        BilingualQuestion(
            id = 9117, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Quel est le plus grand animal terrestre ?", listOf("L'éléphant d'Afrique", "Le rhinocéros blanc", "L'hippopotame", "La girafe"), "Nature", ""),
            en = LocalizedContent("What is the largest land animal?", listOf("African elephant", "White rhinoceros", "Hippopotamus", "Giraffe"), "Nature", ""),
            zh = LocalizedContent("最大的陆地动物是什么？", listOf("非洲象", "白犀牛", "河马", "长颈鹿"), "自然", ""),
            es = LocalizedContent("¿Cuál es el animal terrestre más grande?", listOf("Elefante africano", "Rinoceronte blanco", "Hipopótamo", "Jirafa"), "Naturaleza", "")
        ),
        BilingualQuestion(
            id = 9118, correctIndex = 0, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qu'est-ce que la biosphère ?", listOf("L'ensemble des écosystèmes où la vie est présente sur Terre", "L'atmosphère terrestre", "Les océans uniquement", "La croûte terrestre"), "Nature", ""),
            en = LocalizedContent("What is the biosphere?", listOf("The set of ecosystems where life exists on Earth", "Earth's atmosphere", "Oceans only", "Earth's crust"), "Nature", ""),
            zh = LocalizedContent("什么是生物圈？", listOf("地球上生命存在的所有生态系统的总和", "地球大气层", "仅海洋", "地壳"), "自然", ""),
            es = LocalizedContent("¿Qué es la biosfera?", listOf("El conjunto de ecosistemas donde la vida está presente en la Tierra", "La atmósfera terrestre", "Solo los océanos", "La corteza terrestre"), "Naturaleza", "")
        ),
        BilingualQuestion(
            id = 9119, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel est l'oiseau le plus rapide en vol en piqué ?", listOf("Le faucon pèlerin (389 km/h en piqué)", "Le martinet (170 km/h en vol horizontal)", "L'aigle", "Le colibri"), "Nature", ""),
            en = LocalizedContent("What is the fastest bird in a dive?", listOf("Peregrine falcon (389 km/h in dive)", "Swift (170 km/h in horizontal flight)", "Eagle", "Hummingbird"), "Nature", ""),
            zh = LocalizedContent("俯冲速度最快的鸟是什么？", listOf("游隼（俯冲时速389公里）", "雨燕（水平飞行时速170公里）", "鹰", "蜂鸟"), "自然", ""),
            es = LocalizedContent("¿Cuál es el ave más rápida en picado?", listOf("Halcón peregrino (389 km/h en picado)", "Vencejo (170 km/h en vuelo horizontal)", "Águila", "Colibrí"), "Naturaleza", "")
        ),
        BilingualQuestion(
            id = 9120, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui a été le premier roi des Francs?", listOf("Clovis", "Pépin le Bref", "Charlemagne", "Louis le Pieux"), "Histoire", "Clovis Ier est considéré comme le premier roi des Francs car il unifia les tribus franques au Ve siècle et fonda la dynastie mérovingienne."),
            en = LocalizedContent("Who was the first king of the Franks?", listOf("Clovis", "Pepin the Short", "Charlemagne", "Louis the Pious"), "History", "Clovis I is considered the first king of the Franks because he united the Frankish tribes in the 5th century and founded the Merovingian dynasty."),
            zh = LocalizedContent("谁是法兰克人的第一位国王？", listOf("克洛维", "矮子丕平", "查理曼", "虔诚者路易"), "历史", "克洛维一世被认为是法兰克人的第一位国王，因为他在5世纪统一了法兰克部落，并建立了墨洛温王朝。"),
            es = LocalizedContent("¿Quién fue el primer rey de los francos?", listOf("Clodoveo", "Pipino el Breve", "Carlomagno", "Luis el Piadoso"), "Historia", "Clodoveo I es considerado el primer rey de los francos porque unificó las tribus francas en el siglo V y fundó la dinastía merovingia.")
        ),
        BilingualQuestion(
            id = 9121, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année Clovis a-t-il uni les royaumes francs?", listOf("480", "500", "507", "514"), "Histoire", "Clovis a unifié les royaumes francs après sa victoire sur les Wisigoths à la bataille de Vouillé en 507, ce qui lui a permis de contrôler la majeure partie de la Gaule."),
            en = LocalizedContent("In which year did Clovis unite the Frankish kingdoms?", listOf("480", "500", "507", "514"), "History", "Clovis united the Frankish kingdoms after his victory over the Visigoths at the Battle of Vouillé in 507, which allowed him to control most of Gaul."),
            zh = LocalizedContent("克洛维在哪一年统一了法兰克王国？", listOf("480", "500", "507", "514"), "历史", "克洛维在507年于武耶战役中击败西哥特人后统一了法兰克王国，这使他控制了高卢的大部分地区。"),
            es = LocalizedContent("¿En qué año unificó Clodoveo los reinos francos?", listOf("480", "500", "507", "514"), "Historia", "Clodoveo unificó los reinos francos tras su victoria sobre los visigodos en la batalla de Vouillé en 507, lo que le permitió controlar la mayor parte de la Galia.")
        ),
        BilingualQuestion(
            id = 9122, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a fondé la dynastie carolingienne?", listOf("Clovis", "Pépin le Bref", "Charles Martel", "Charlemagne"), "Histoire", "Pépin le Bref, fils de Charles Martel, déposa le dernier roi mérovingien en 751 et se fit sacrer roi, fondant ainsi la dynastie carolingienne."),
            en = LocalizedContent("Who founded the Carolingian dynasty?", listOf("Clovis", "Pepin the Short", "Charles Martel", "Charlemagne"), "History", "Pepin the Short, son of Charles Martel, deposed the last Merovingian king in 751 and had himself crowned king, thus founding the Carolingian dynasty."),
            zh = LocalizedContent("谁建立了加洛林王朝？", listOf("克洛维", "矮子丕平", "查理·马特", "查理曼"), "历史", "矮子丕平，查理·马特之子，于751年废黜了最后一位墨洛温国王，并加冕为王，从而建立了加洛林王朝。"),
            es = LocalizedContent("¿Quién fundó la dinastía carolingia?", listOf("Clodoveo", "Pipino el Breve", "Carlos Martel", "Carlomagno"), "Historia", "Pipino el Breve, hijo de Carlos Martel, depuso al último rey merovingio en 751 y se hizo coronar rey, fundando así la dinastía carolingia.")
        ),
        BilingualQuestion(
            id = 9123, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année Pépin le Bref a-t-il fondé la dynastie carolingienne?", listOf("748", "751", "768", "771"), "Histoire", "Pépin le Bref fut élu roi des Francs en 751, déposant le dernier Mérovingien, Childéric III. Cet événement marque le début officiel de la dynastie carolingienne."),
            en = LocalizedContent("In which year did Pepin the Short found the Carolingian dynasty?", listOf("748", "751", "768", "771"), "History", "Pepin the Short was elected king of the Franks in 751, deposing the last Merovingian, Childeric III. This event marks the official beginning of the Carolingian dynasty."),
            zh = LocalizedContent("矮子丕平在哪一年建立了加洛林王朝？", listOf("748", "751", "768", "771"), "历史", "矮子丕平于751年被选为法兰克国王，废黜了最后一位墨洛温国王希尔德里克三世。这一事件标志着加洛林王朝的正式开始。"),
            es = LocalizedContent("¿En qué año fundó Pipino el Breve la dinastía carolingia?", listOf("748", "751", "768", "771"), "Historia", "Pipino el Breve fue elegido rey de los francos en 751, deponiendo al último merovingio, Childerico III. Este evento marca el inicio oficial de la dinastía carolingia.")
        ),
        BilingualQuestion(
            id = 9124, correctIndex = 3, difficulty = Difficulty.EASY,
            fr = LocalizedContent("Qui était Charlemagne?", listOf("Un roi franc", "Un empereur des Romains", "Un pape", "Tous les deux premiers"), "Histoire", "Charlemagne est à la fois roi des Francs et empereur d'Occident, couronné en 800. Les deux premières réponses (roi des Francs et empereur) sont donc correctes."),
            en = LocalizedContent("Who was Charlemagne?", listOf("A Frankish king", "A Roman emperor", "A pope", "Both of the first two"), "History", "Charlemagne was both king of the Franks and emperor of the West, crowned in 800. The first two answers (king of the Franks and emperor) are therefore correct."),
            zh = LocalizedContent("查理曼是谁？", listOf("法兰克国王", "罗马皇帝", "教皇", "前两者都是"), "历史", "查理曼既是法兰克国王，也是西方皇帝，于800年加冕。因此前两个答案（法兰克国王和皇帝）都是正确的。"),
            es = LocalizedContent("¿Quién fue Carlomagno?", listOf("Un rey franco", "Un emperador romano", "Un papa", "Ambos primeros"), "Historia", "Carlomagno fue tanto rey de los francos como emperador de Occidente, coronado en 800. Por lo tanto, las dos primeras respuestas (rey de los francos y emperador) son correctas.")
        ),
        BilingualQuestion(
            id = 9125, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année Charlemagne a-t-il été couronné empereur?", listOf("768", "800", "814", "820"), "Histoire", "Le pape Léon III couronna Charlemagne empereur à Rome le 25 décembre 800, restauré le titre impérial en Occident."),
            en = LocalizedContent("In which year was Charlemagne crowned emperor?", listOf("768", "800", "814", "820"), "History", "Pope Leo III crowned Charlemagne emperor in Rome on December 25, 800, restoring the imperial title in the West."),
            zh = LocalizedContent("查理曼在哪一年加冕为皇帝？", listOf("768", "800", "814", "820"), "历史", "教皇利奥三世于800年12月25日在罗马为查理曼加冕，恢复了西方的皇帝头衔。"),
            es = LocalizedContent("¿En qué año fue coronado emperador Carlomagno?", listOf("768", "800", "814", "820"), "Historia", "El papa León III coronó a Carlomagno emperador en Roma el 25 de diciembre de 800, restaurando el título imperial en Occidente.")
        ),
        BilingualQuestion(
            id = 9126, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a été le fondateur de la Renaissance française?", listOf("Louis XII", "François Ier", "Henri II", "Henri IV"), "Histoire", "François Ier est considéré comme le fondateur de la Renaissance française car il a introduit l'art italien en France, notamment en invitant Léonard de Vinci à sa cour."),
            en = LocalizedContent("Who was the founder of the French Renaissance?", listOf("Louis XII", "Francis I", "Henry II", "Henry IV"), "History", "Francis I is considered the founder of the French Renaissance because he introduced Italian art to France, notably by inviting Leonardo da Vinci to his court."),
            zh = LocalizedContent("谁是法国文艺复兴的奠基人？", listOf("路易十二", "弗朗索瓦一世", "亨利二世", "亨利四世"), "历史", "弗朗索瓦一世被认为是法国文艺复兴的奠基人，因为他将意大利艺术引入法国，特别是邀请列奥纳多·达·芬奇到他的宫廷。"),
            es = LocalizedContent("¿Quién fue el fundador del Renacimiento francés?", listOf("Luis XII", "Francisco I", "Enrique II", "Enrique IV"), "Historia", "Francisco I es considerado el fundador del Renacimiento francés porque introdujo el arte italiano en Francia, especialmente al invitar a Leonardo da Vinci a su corte.")
        ),
        BilingualQuestion(
            id = 9127, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année François Ier a-t-il pris le pouvoir?", listOf("1515", "1520", "1525", "1530"), "Histoire", "François Ier succède à Louis XII en 1515, année de son sacre à Reims et de sa célèbre victoire à Marignan."),
            en = LocalizedContent("In which year did Francis I take power?", listOf("1515", "1520", "1525", "1530"), "History", "Francis I succeeded Louis XII in 1515, the year of his coronation at Reims and his famous victory at Marignan."),
            zh = LocalizedContent("弗朗索瓦一世在哪一年掌权？", listOf("1515", "1520", "1525", "1530"), "历史", "弗朗索瓦一世于1515年继承路易十二，同年他在兰斯加冕，并在马里尼亚诺取得著名胜利。"),
            es = LocalizedContent("¿En qué año tomó el poder Francisco I?", listOf("1515", "1520", "1525", "1530"), "Historia", "Francisco I sucedió a Luis XII en 1515, año de su coronación en Reims y de su famosa victoria en Marignano.")
        ),
        BilingualQuestion(
            id = 9128, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel événement a marqué la fin de la Guerre de Cent Ans?", listOf("Le siège d'Orléans", "La bataille d'Azincourt", "Le Traité de Troyes", "Le Traité de Paris"), "Histoire", "Le siège d'Orléans en 1429, marqué par l'intervention de Jeanne d'Arc, fut un tournant décisif qui permit aux Français de reprendre l'offensive, mais la guerre ne s'acheva officiellement qu'en 1453 avec la bataille de Castillon."),
            en = LocalizedContent("Which event marked the end of the Hundred Years' War?", listOf("The Siege of Orléans", "The Battle of Agincourt", "The Treaty of Troyes", "The Treaty of Paris"), "History", "The Siege of Orléans in 1429, marked by the intervention of Joan of Arc, was a decisive turning point that allowed the French to regain the offensive, but the war officially ended only in 1453 with the Battle of Castillon."),
            zh = LocalizedContent("哪个事件标志着百年战争的结束？", listOf("奥尔良围城战", "阿金库尔战役", "特鲁瓦条约", "巴黎条约"), "历史", "1429年的奥尔良围城战，以圣女贞德的干预为标志，是一个决定性的转折点，使法国人得以重新发动进攻，但战争直到1453年的卡斯蒂永战役才正式结束。"),
            es = LocalizedContent("¿Qué evento marcó el fin de la Guerra de los Cien Años?", listOf("El asedio de Orleans", "La batalla de Azincourt", "El Tratado de Troyes", "El Tratado de París"), "Historia", "El asedio de Orleans en 1429, marcado por la intervención de Juana de Arco, fue un punto de inflexión decisivo que permitió a los franceses retomar la ofensiva, pero la guerra terminó oficialmente solo en 1453 con la batalla de Castillon.")
        ),
        BilingualQuestion(
            id = 9129, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année la Guerre de Cent Ans a-t-elle pris fin?", listOf("1430", "1450", "1453", "1461"), "Histoire", "La guerre de Cent Ans s'achève en 1453 avec la bataille de Castillon, où les Français remportent une victoire décisive sur les Anglais, mettant fin au conflit qui durait depuis 1337."),
            en = LocalizedContent("In which year did the Hundred Years' War end?", listOf("1430", "1450", "1453", "1461"), "History", "The Hundred Years' War ended in 1453 with the Battle of Castillon, where the French won a decisive victory over the English, ending the conflict that had lasted since 1337."),
            zh = LocalizedContent("百年战争在哪一年结束？", listOf("1430", "1450", "1453", "1461"), "历史", "百年战争于1453年以卡斯蒂永战役结束，法国人在此战中取得了对英国的决定性胜利，结束了自1337年以来的冲突。"),
            es = LocalizedContent("¿En qué año terminó la Guerra de los Cien Años?", listOf("1430", "1450", "1453", "1461"), "Historia", "La Guerra de los Cien Años terminó en 1453 con la batalla de Castillon, donde los franceses obtuvieron una victoria decisiva sobre los ingleses, poniendo fin al conflicto que había durado desde 1337.")
        ),
        BilingualQuestion(
            id = 9130, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel roi anglais a été le plus grand combattant de la Guerre de Cent Ans?", listOf("Édouard III", "Henri V", "Édouard IV", "Richard II"), "Histoire", "Henri V d'Angleterre remporta la célèbre bataille d'Azincourt en 1415, une victoire écrasante qui lui permit de conquérir une grande partie de la France et d'être reconnu comme héritier du trône français par le traité de Troyes."),
            en = LocalizedContent("Which English king was the greatest fighter in the Hundred Years' War?", listOf("Edward III", "Henry V", "Edward IV", "Richard II"), "History", "Henry V of England won the famous Battle of Agincourt in 1415, a crushing victory that allowed him to conquer much of France and be recognized as heir to the French throne by the Treaty of Troyes."),
            zh = LocalizedContent("哪位英国国王是百年战争中最伟大的战士？", listOf("爱德华三世", "亨利五世", "爱德华四世", "理查二世"), "历史", "英格兰的亨利五世在1415年赢得了著名的阿金库尔战役，这场压倒性的胜利使他征服了法国大片领土，并通过特鲁瓦条约被承认为法国王位继承人。"),
            es = LocalizedContent("¿Qué rey inglés fue el mayor combatiente de la Guerra de los Cien Años?", listOf("Eduardo III", "Enrique V", "Eduardo IV", "Ricardo II"), "Historia", "Enrique V de Inglaterra ganó la famosa batalla de Azincourt en 1415, una victoria aplastante que le permitió conquistar gran parte de Francia y ser reconocido como heredero del trono francés por el Tratado de Troyes.")
        ),
        BilingualQuestion(
            id = 9131, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année la Bataille d'Azincourt s'est-elle déroulée?", listOf("1415", "1420", "1425", "1430"), "Histoire", "La bataille d'Azincourt a eu lieu le 25 octobre 1415, pendant la guerre de Cent Ans, opposant l'armée anglaise d'Henri V aux forces françaises."),
            en = LocalizedContent("In which year did the Battle of Agincourt take place?", listOf("1415", "1420", "1425", "1430"), "History", "The Battle of Agincourt took place on October 25, 1415, during the Hundred Years' War, opposing the English army of Henry V against French forces."),
            zh = LocalizedContent("阿金库尔战役发生在哪一年？", listOf("1415", "1420", "1425", "1430"), "历史", "阿金库尔战役发生于1415年10月25日，是百年战争期间亨利五世率领的英格兰军队与法军之间的战役。"),
            es = LocalizedContent("¿En qué año tuvo lugar la Batalla de Azincourt?", listOf("1415", "1420", "1425", "1430"), "Historia", "La Batalla de Azincourt tuvo lugar el 25 de octubre de 1415, durante la Guerra de los Cien Años, enfrentando al ejército inglés de Enrique V contra las fuerzas francesas.")
        ),
        BilingualQuestion(
            id = 9132, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a commandé l'armée française à la Bataille d'Azincourt?", listOf("Charles VI", "Charles VII", "Jean de Dunois", "Jean sans Terre"), "Histoire", "Charles VI était roi de France lors de la bataille d'Azincourt en 1415, mais il souffrait de troubles mentaux et n'a pas commandé directement l'armée, confiée au connétable Charles d'Albret."),
            en = LocalizedContent("Who commanded the French army at the Battle of Agincourt?", listOf("Charles VI", "Charles VII", "Jean de Dunois", "John Lackland"), "History", "Charles VI was king of France at the time of the Battle of Agincourt in 1415, but he suffered from mental illness and did not directly command the army, which was entrusted to Constable Charles d'Albret."),
            zh = LocalizedContent("谁在阿金库尔战役中指挥法军？", listOf("查理六世", "查理七世", "让·德·迪努瓦", "无地王约翰"), "历史", "查理六世在1415年阿金库尔战役时是法国国王，但他患有精神疾病，并未直接指挥军队，指挥权交给了法兰西统帅查理·德·阿尔布雷。"),
            es = LocalizedContent("¿Quién comandó el ejército francés en la Batalla de Azincourt?", listOf("Carlos VI", "Carlos VII", "Juan de Dunois", "Juan sin Tierra"), "Historia", "Carlos VI era rey de Francia en la Batalla de Azincourt en 1415, pero sufría trastornos mentales y no comandó directamente el ejército, que fue confiado al condestable Carlos de Albret.")
        ),
        BilingualQuestion(
            id = 9133, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel était le surnom de Jeanne d'Arc?", listOf("La Maid d'Orléans", "La Pucelle d'Orléans", "L'Héroïne de la France", "La Sainte Jeanne"), "Histoire", "Jeanne d'Arc, une jeune paysanne, mena l'armée française à la victoire contre les Anglais lors du siège d'Orléans en 1429, ce qui lui valut le surnom de \"La Pucelle d'Orléans\"."),
            en = LocalizedContent("What was Joan of Arc's nickname?", listOf("The Maid of Orléans", "The Maid of Orléans", "The Heroine of France", "Saint Joan"), "History", "Joan of Arc, a young peasant girl, led the French army to victory against the English during the Siege of Orléans in 1429, earning her the nickname 'The Maid of Orléans'."),
            zh = LocalizedContent("圣女贞德的绰号是什么？", listOf("奥尔良少女", "奥尔良少女", "法国女英雄", "圣女贞德"), "历史", "圣女贞德，一位年轻的农家女，在1429年奥尔良围城战中率领法军战胜英军，因此获得了“奥尔良少女”的绰号。"),
            es = LocalizedContent("¿Cuál era el apodo de Juana de Arco?", listOf("La Doncella de Orleans", "La Doncella de Orleans", "La Heroína de Francia", "Santa Juana"), "Historia", "Juana de Arco, una joven campesina, lideró al ejército francés a la victoria contra los ingleses durante el asedio de Orleans en 1429, lo que le valió el apodo de 'La Doncella de Orleans'.")
        ),
        BilingualQuestion(
            id = 9134, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année Jeanne d'Arc a-t-elle été capturée?", listOf("1429", "1430", "1431", "1432"), "Histoire", "Jeanne d'Arc a été capturée par les Bourguignons le 23 mai 1430 lors du siège de Compiègne, pendant la guerre de Cent Ans."),
            en = LocalizedContent("In which year was Joan of Arc captured?", listOf("1429", "1430", "1431", "1432"), "History", "Joan of Arc was captured by the Burgundians on May 23, 1430 during the Siege of Compiègne, during the Hundred Years' War."),
            zh = LocalizedContent("圣女贞德在哪一年被俘？", listOf("1429", "1430", "1431", "1432"), "历史", "圣女贞德于1430年5月23日在贡比涅围城战中被勃艮第人俘虏，当时正值百年战争期间。"),
            es = LocalizedContent("¿En qué año fue capturada Juana de Arco?", listOf("1429", "1430", "1431", "1432"), "Historia", "Juana de Arco fue capturada por los borgoñones el 23 de mayo de 1430 durante el asedio de Compiègne, en la Guerra de los Cien Años.")
        ),
        BilingualQuestion(
            id = 9135, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a capturé Jeanne d'Arc?", listOf("Les Anglais", "Les Bourguignons", "Les Français", "Les Allemands"), "Histoire", "Jeanne d'Arc a été capturée à Compiègne en 1430 par des soldats du duc de Bourgogne, alliés des Anglais pendant la guerre de Cent Ans."),
            en = LocalizedContent("Who captured Joan of Arc?", listOf("The English", "The Burgundians", "The French", "The Germans"), "History", "Joan of Arc was captured at Compiègne in 1430 by soldiers of the Duke of Burgundy, allies of the English during the Hundred Years' War."),
            zh = LocalizedContent("谁俘虏了圣女贞德？", listOf("英国人", "勃艮第人", "法国人", "德国人"), "历史", "圣女贞德于1430年在贡比涅被勃艮第公爵的士兵俘虏，勃艮第人在百年战争中是英国人的盟友。"),
            es = LocalizedContent("¿Quién capturó a Juana de Arco?", listOf("Los ingleses", "Los borgoñones", "Los franceses", "Los alemanes"), "Historia", "Juana de Arco fue capturada en Compiègne en 1430 por soldados del duque de Borgoña, aliados de los ingleses durante la Guerra de los Cien Años.")
        ),
        BilingualQuestion(
            id = 9136, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a jugé Jeanne d'Arc?", listOf("Le roi de France", "L'Inquisition espagnole", "L'évêque de Beauvais", "Le Pape"), "Histoire", "Le procès de Jeanne d'Arc en 1431 fut mené par Pierre Cauchon, évêque de Beauvais, qui agissait sous l'autorité des Anglais pour la condamner pour hérésie."),
            en = LocalizedContent("Who judged Joan of Arc?", listOf("The King of France", "The Spanish Inquisition", "The Bishop of Beauvais", "The Pope"), "History", "The trial of Joan of Arc in 1431 was conducted by Pierre Cauchon, Bishop of Beauvais, who acted under English authority to condemn her for heresy."),
            zh = LocalizedContent("谁审判了圣女贞德？", listOf("法国国王", "西班牙宗教裁判所", "博韦主教", "教皇"), "历史", "1431年对圣女贞德的审判由博韦主教皮埃尔·科雄主持，他在英国当局的授权下以异端罪名判处她。"),
            es = LocalizedContent("¿Quién juzgó a Juana de Arco?", listOf("El rey de Francia", "La Inquisición española", "El obispo de Beauvais", "El Papa"), "Historia", "El juicio de Juana de Arco en 1431 fue dirigido por Pierre Cauchon, obispo de Beauvais, quien actuó bajo la autoridad inglesa para condenarla por herejía.")
        ),
        BilingualQuestion(
            id = 9137, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année le Traité de Cateau-Cambrésis a-t-il été signé?", listOf("1555", "1559", "1565", "1570"), "Histoire", "Ce traité mit fin aux guerres d'Italie entre la France et l'Espagne, consacrant l'hégémonie espagnole en Europe."),
            en = LocalizedContent("In which year was the Treaty of Cateau-Cambrésis signed?", listOf("1555", "1559", "1565", "1570"), "History", "This treaty ended the Italian Wars between France and Spain, establishing Spanish hegemony in Europe."),
            zh = LocalizedContent("卡托-康布雷齐条约签署于哪一年？", listOf("1555", "1559", "1565", "1570"), "历史", "该条约结束了法国与西班牙之间的意大利战争，确立了西班牙在欧洲的霸权地位。"),
            es = LocalizedContent("¿En qué año se firmó el Tratado de Cateau-Cambrésis?", listOf("1555", "1559", "1565", "1570"), "Historia", "Este tratado puso fin a las Guerras de Italia entre Francia y España, consagrando la hegemonía española en Europa.")
        ),
        BilingualQuestion(
            id = 9138, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel traité a mis fin aux guerres d'Italie?", listOf("Traité de Madrid", "Traité de Cateau-Cambrésis", "Traité de Naples", "Traité de Blois"), "Histoire", "Le traité de Cateau-Cambrésis, signé en 1559, mit fin aux guerres d'Italie entre la France et l'Espagne, établissant la domination espagnole sur la péninsule italienne."),
            en = LocalizedContent("Which treaty ended the Italian Wars?", listOf("Treaty of Madrid", "Treaty of Cateau-Cambrésis", "Treaty of Naples", "Treaty of Blois"), "History", "The Treaty of Cateau-Cambrésis, signed in 1559, ended the Italian Wars between France and Spain, establishing Spanish dominance over the Italian peninsula."),
            zh = LocalizedContent("哪项条约结束了意大利战争？", listOf("马德里条约", "卡托-康布雷齐条约", "那不勒斯条约", "布卢瓦条约"), "历史", "1559年签署的卡托-康布雷齐条约结束了法国与西班牙之间的意大利战争，确立了西班牙对意大利半岛的统治地位。"),
            es = LocalizedContent("¿Qué tratado puso fin a las Guerras de Italia?", listOf("Tratado de Madrid", "Tratado de Cateau-Cambrésis", "Tratado de Nápoles", "Tratado de Blois"), "Historia", "El Tratado de Cateau-Cambrésis, firmado en 1559, puso fin a las Guerras de Italia entre Francia y España, estableciendo el dominio español sobre la península itálica.")
        ),
        BilingualQuestion(
            id = 9139, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année les Guerres de religion ont-elles commencé en France?", listOf("1560", "1562", "1567", "1572"), "Histoire", "Les Guerres de religion françaises débutent en 1562 avec le massacre de Wassy, où des soldats du duc de Guise tuent des protestants. Ce conflit oppose catholiques et protestants jusqu'en 1598."),
            en = LocalizedContent("In which year did the French Wars of Religion begin?", listOf("1560", "1562", "1567", "1572"), "History", "The French Wars of Religion began in 1562 with the Massacre of Wassy, where soldiers of the Duke of Guise killed Protestants. This conflict pitted Catholics against Protestants until 1598."),
            zh = LocalizedContent("法国宗教战争始于哪一年？", listOf("1560", "1562", "1567", "1572"), "历史", "法国宗教战争始于1562年的瓦西镇屠杀，吉斯公爵的士兵杀害了新教徒。这场冲突在天主教徒和新教徒之间持续到1598年。"),
            es = LocalizedContent("¿En qué año comenzaron las Guerras de Religión en Francia?", listOf("1560", "1562", "1567", "1572"), "Historia", "Las Guerras de Religión francesas comenzaron en 1562 con la masacre de Wassy, donde soldados del duque de Guisa mataron a protestantes. Este conflicto enfrentó a católicos y protestantes hasta 1598.")
        ),
        BilingualQuestion(
            id = 9140, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année le Massacre de la Saint-Barthélemy s'est-il produit?", listOf("1570", "1572", "1575", "1577"), "Histoire", "Le massacre des protestants par les catholiques à Paris a débuté le 24 août 1572, pendant les guerres de Religion, quelques jours après le mariage d'Henri de Navarre."),
            en = LocalizedContent("In which year did the St. Bartholomew's Day Massacre occur?", listOf("1570", "1572", "1575", "1577"), "History", "The massacre of Protestants by Catholics in Paris began on August 24, 1572, during the Wars of Religion, a few days after the marriage of Henry of Navarre."),
            zh = LocalizedContent("圣巴托罗缪大屠杀发生在哪一年？", listOf("1570", "1572", "1575", "1577"), "历史", "天主教徒在巴黎对新教徒的大屠杀始于1572年8月24日，发生在宗教战争期间，即亨利·德·纳瓦尔婚礼后几天。"),
            es = LocalizedContent("¿En qué año ocurrió la Matanza de San Bartolomé?", listOf("1570", "1572", "1575", "1577"), "Historia", "La masacre de protestantes por católicos en París comenzó el 24 de agosto de 1572, durante las Guerras de Religión, pocos días después de la boda de Enrique de Navarra.")
        ),
        BilingualQuestion(
            id = 9141, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a orchestré le Massacre de la Saint-Barthélemy?", listOf("Catherine de Médicis", "Henri de Valois", "Henri de Navarre", "Le duc de Guise"), "Histoire", "Catherine de Médicis, reine mère et régente, ordonna le massacre des chefs protestants pour préserver l'autorité royale après l'échec d'une tentative d'assassinat contre l'amiral de Coligny."),
            en = LocalizedContent("Who orchestrated the St. Bartholomew's Day Massacre?", listOf("Catherine de Medici", "Henry of Valois", "Henry of Navarre", "The Duke of Guise"), "History", "Catherine de Medici, queen mother and regent, ordered the massacre of Protestant leaders to preserve royal authority after a failed assassination attempt against Admiral de Coligny."),
            zh = LocalizedContent("谁策划了圣巴托罗缪大屠杀？", listOf("凯瑟琳·德·美第奇", "亨利·德·瓦卢瓦", "亨利·德·纳瓦尔", "吉斯公爵"), "历史", "王太后兼摄政王凯瑟琳·德·美第奇下令屠杀新教领袖，以在刺杀科利尼海军上将失败后维护王权。"),
            es = LocalizedContent("¿Quién orquestó la Matanza de San Bartolomé?", listOf("Catalina de Médici", "Enrique de Valois", "Enrique de Navarra", "El duque de Guisa"), "Historia", "Catalina de Médici, reina madre y regente, ordenó la masacre de los líderes protestantes para preservar la autoridad real tras el fracaso de un intento de asesinato contra el almirante de Coligny.")
        ),
        BilingualQuestion(
            id = 9142, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel traité a mis fin aux Guerres de religion en France?", listOf("Traité de Paris", "Édit de Nantes", "Traité de Cateau-Cambrésis", "Paix d'Amiens"), "Histoire", "Signé en 1598 par Henri IV, l'édit de Nantes accordait une liberté de culte limitée aux protestants, mettant fin à plusieurs décennies de conflits religieux en France."),
            en = LocalizedContent("Which treaty ended the French Wars of Religion?", listOf("Treaty of Paris", "Edict of Nantes", "Treaty of Cateau-Cambrésis", "Peace of Amiens"), "History", "Signed in 1598 by Henry IV, the Edict of Nantes granted limited religious freedom to Protestants, ending several decades of religious conflict in France."),
            zh = LocalizedContent("哪项条约结束了法国宗教战争？", listOf("巴黎条约", "南特敕令", "卡托-康布雷齐条约", "亚眠和约"), "历史", "亨利四世于1598年签署的南特敕令赋予新教徒有限的宗教自由，结束了法国数十年的宗教冲突。"),
            es = LocalizedContent("¿Qué tratado puso fin a las Guerras de Religión en Francia?", listOf("Tratado de París", "Edicto de Nantes", "Tratado de Cateau-Cambrésis", "Paz de Amiens"), "Historia", "Firmado en 1598 por Enrique IV, el Edicto de Nantes otorgaba libertad de culto limitada a los protestantes, poniendo fin a varias décadas de conflictos religiosos en Francia.")
        ),
        BilingualQuestion(
            id = 9143, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année l'Édit de Nantes a-t-il été signé?", listOf("1598", "1600", "1605", "1610"), "Histoire", "L'Édit de Nantes, signé en 1598 par Henri IV, mit fin aux guerres de Religion en accordant une tolérance limitée aux protestants."),
            en = LocalizedContent("In which year was the Edict of Nantes signed?", listOf("1598", "1600", "1605", "1610"), "History", "The Edict of Nantes, signed in 1598 by Henry IV, ended the Wars of Religion by granting limited tolerance to Protestants."),
            zh = LocalizedContent("南特敕令签署于哪一年？", listOf("1598", "1600", "1605", "1610"), "历史", "亨利四世于1598年签署的南特敕令通过赋予新教徒有限宽容结束了宗教战争。"),
            es = LocalizedContent("¿En qué año se firmó el Edicto de Nantes?", listOf("1598", "1600", "1605", "1610"), "Historia", "El Edicto de Nantes, firmado en 1598 por Enrique IV, puso fin a las Guerras de Religión al otorgar una tolerancia limitada a los protestantes.")
        ),
        BilingualQuestion(
            id = 9144, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a signé l'Édit de Nantes?", listOf("Henri III", "Henri IV", "Louis XIII", "Louis XIV"), "Histoire", "Henri IV signa l'édit de Nantes en 1598 pour mettre fin aux guerres de Religion entre catholiques et protestants, accordant une certaine liberté de culte aux huguenots."),
            en = LocalizedContent("Who signed the Edict of Nantes?", listOf("Henry III", "Henry IV", "Louis XIII", "Louis XIV"), "History", "Henry IV signed the Edict of Nantes in 1598 to end the Wars of Religion between Catholics and Protestants, granting limited religious freedom to the Huguenots."),
            zh = LocalizedContent("谁签署了南特敕令？", listOf("亨利三世", "亨利四世", "路易十三", "路易十四"), "历史", "亨利四世于1598年签署南特敕令，以结束天主教徒与新教徒之间的宗教战争，赋予胡格诺派有限的宗教自由。"),
            es = LocalizedContent("¿Quién firmó el Edicto de Nantes?", listOf("Enrique III", "Enrique IV", "Luis XIII", "Luis XIV"), "Historia", "Enrique IV firmó el Edicto de Nantes en 1598 para poner fin a las Guerras de Religión entre católicos y protestantes, otorgando una libertad de culto limitada a los hugonotes.")
        ),
        BilingualQuestion(
            id = 9145, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel événement a marqué le début de l'Inquisition espagnole?", listOf("L'expulsion des Juifs", "La Reconquista", "L'établissement du tribunal", "L'unification de l'Espagne"), "Histoire", "En 1478, les Rois Catholiques obtiennent du pape Sixte IV l'autorisation d'établir un tribunal pour traquer les hérétiques, marquant le début officiel de l'Inquisition espagnole."),
            en = LocalizedContent("What event marked the beginning of the Spanish Inquisition?", listOf("The expulsion of the Jews", "The Reconquista", "The establishment of the tribunal", "The unification of Spain"), "History", "In 1478, the Catholic Monarchs obtained permission from Pope Sixtus IV to establish a tribunal to hunt heretics, marking the official beginning of the Spanish Inquisition."),
            zh = LocalizedContent("哪一事件标志着西班牙宗教裁判所的开始？", listOf("驱逐犹太人", "收复失地运动", "设立法庭", "西班牙统一"), "历史", "1478年，天主教双王获得教皇西克斯图斯四世的许可，设立法庭追捕异端，标志着西班牙宗教裁判所的正式开端。"),
            es = LocalizedContent("¿Qué evento marcó el inicio de la Inquisición española?", listOf("La expulsión de los judíos", "La Reconquista", "El establecimiento del tribunal", "La unificación de España"), "Historia", "En 1478, los Reyes Católicos obtuvieron del papa Sixto IV la autorización para establecer un tribunal para perseguir herejes, marcando el inicio oficial de la Inquisición española.")
        ),
        BilingualQuestion(
            id = 9146, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année l'Inquisition espagnole a-t-elle été établie?", listOf("1478", "1492", "1500", "1515"), "Histoire", "L'Inquisition espagnole a été créée en 1478 par les Rois Catholiques, Ferdinand d'Aragon et Isabelle de Castille, pour maintenir l'orthodoxie catholique dans leurs royaumes."),
            en = LocalizedContent("In which year was the Spanish Inquisition established?", listOf("1478", "1492", "1500", "1515"), "History", "The Spanish Inquisition was created in 1478 by the Catholic Monarchs, Ferdinand of Aragon and Isabella of Castile, to maintain Catholic orthodoxy in their kingdoms."),
            zh = LocalizedContent("西班牙宗教裁判所成立于哪一年？", listOf("1478", "1492", "1500", "1515"), "历史", "西班牙宗教裁判所于1478年由天主教双王费迪南德二世和伊莎贝拉一世创立，以维护其王国的天主教正统。"),
            es = LocalizedContent("¿En qué año se estableció la Inquisición española?", listOf("1478", "1492", "1500", "1515"), "Historia", "La Inquisición española fue creada en 1478 por los Reyes Católicos, Fernando de Aragón e Isabel de Castilla, para mantener la ortodoxia católica en sus reinos.")
        ),
        BilingualQuestion(
            id = 9147, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a dirigé l'Inquisition espagnole?", listOf("Torquemada", "Cardinal Jiménez", "Le Roi Ferdinand", "Le Pape"), "Histoire", "Tomás de Torquemada, dominicain espagnol, fut le premier Grand Inquisiteur nommé par les Rois Catholiques en 1483, dirigeant l'Inquisition espagnole avec une sévérité extrême."),
            en = LocalizedContent("Who led the Spanish Inquisition?", listOf("Torquemada", "Cardinal Jiménez", "King Ferdinand", "The Pope"), "History", "Tomás de Torquemada, a Spanish Dominican, was the first Grand Inquisitor appointed by the Catholic Monarchs in 1483, leading the Spanish Inquisition with extreme severity."),
            zh = LocalizedContent("谁领导了西班牙宗教裁判所？", listOf("托尔克马达", "希梅内斯枢机", "费迪南德国王", "教皇"), "历史", "西班牙多明我会修士托马斯·德·托尔克马达于1483年被天主教双王任命为第一任大法官，以极端严厉的方式领导西班牙宗教裁判所。"),
            es = LocalizedContent("¿Quién dirigió la Inquisición española?", listOf("Torquemada", "Cardenal Jiménez", "El Rey Fernando", "El Papa"), "Historia", "Tomás de Torquemada, dominico español, fue el primer Inquisidor General nombrado por los Reyes Católicos en 1483, dirigiendo la Inquisición española con extrema severidad.")
        ),
        BilingualQuestion(
            id = 9148, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année les Juifs ont-ils été expulsés d'Espagne?", listOf("1480", "1492", "1510", "1550"), "Histoire", "En 1492, les Rois Catholiques Ferdinand et Isabelle ont signé le décret de l'Alhambra, ordonnant l'expulsion des Juifs d'Espagne sous peine de conversion forcée."),
            en = LocalizedContent("In which year were the Jews expelled from Spain?", listOf("1480", "1492", "1510", "1550"), "History", "In 1492, the Catholic Monarchs Ferdinand and Isabella signed the Alhambra Decree, ordering the expulsion of Jews from Spain under penalty of forced conversion."),
            zh = LocalizedContent("犹太人于哪一年被驱逐出西班牙？", listOf("1480", "1492", "1510", "1550"), "历史", "1492年，天主教双王费迪南德和伊莎贝拉签署了《阿尔罕布拉法令》，命令将犹太人驱逐出西班牙，违者强制改宗。"),
            es = LocalizedContent("¿En qué año fueron expulsados los judíos de España?", listOf("1480", "1492", "1510", "1550"), "Historia", "En 1492, los Reyes Católicos Fernando e Isabel firmaron el Decreto de la Alhambra, ordenando la expulsión de los judíos de España bajo pena de conversión forzada.")
        ),
        BilingualQuestion(
            id = 9149, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a exploré la côte de l'Afrique?", listOf("Christophe Colomb", "Henri le Navigateur", "Vasco de Gama", "Bartolomeu Dias"), "Histoire", "Henri le Navigateur, prince portugais, a financé et organisé les premières expéditions maritimes le long de la côte africaine au XVe siècle, ouvrant la voie à l'exploration européenne."),
            en = LocalizedContent("Who explored the coast of Africa?", listOf("Christopher Columbus", "Henry the Navigator", "Vasco da Gama", "Bartolomeu Dias"), "History", "Henry the Navigator, a Portuguese prince, financed and organized the first maritime expeditions along the African coast in the 15th century, paving the way for European exploration."),
            zh = LocalizedContent("谁探索了非洲海岸？", listOf("克里斯托弗·哥伦布", "航海家亨利", "瓦斯科·达·伽马", "巴托洛梅乌·迪亚士"), "历史", "葡萄牙王子航海家亨利在15世纪资助并组织了沿非洲海岸的首次海上探险，为欧洲探索开辟了道路。"),
            es = LocalizedContent("¿Quién exploró la costa de África?", listOf("Cristóbal Colón", "Enrique el Navegante", "Vasco de Gama", "Bartolomeu Dias"), "Historia", "Enrique el Navegante, príncipe portugués, financió y organizó las primeras expediciones marítimas a lo largo de la costa africana en el siglo XV, abriendo el camino a la exploración europea.")
        ),
        BilingualQuestion(
            id = 9150, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année Henri le Navigateur a-t-il commencé ses explorations?", listOf("1410", "1420", "1430", "1440"), "Histoire", "Henri le Navigateur, prince portugais, a lancé les premières expéditions maritimes vers l'Afrique en 1410, marquant le début de l'ère des grandes découvertes portugaises."),
            en = LocalizedContent("In what year did Henry the Navigator begin his explorations?", listOf("1410", "1420", "1430", "1440"), "History", "Henry the Navigator, a Portuguese prince, launched the first maritime expeditions to Africa in 1410, marking the beginning of the Portuguese Age of Discovery."),
            zh = LocalizedContent("航海家亨利在哪一年开始他的探险？", listOf("1410", "1420", "1430", "1440"), "历史", "葡萄牙王子航海家亨利于1410年发起了首次前往非洲的海上探险，标志着葡萄牙大航海时代的开始。"),
            es = LocalizedContent("¿En qué año comenzó Enrique el Navegante sus exploraciones?", listOf("1410", "1420", "1430", "1440"), "Historia", "Enrique el Navegante, príncipe portugués, lanzó las primeras expediciones marítimas hacia África en 1410, marcando el inicio de la era de los grandes descubrimientos portugueses.")
        ),
        BilingualQuestion(
            id = 9151, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui a découvert la route maritime vers l'Inde?", listOf("Christophe Colomb", "Vasco de Gama", "Bartolomeu Dias", "Ferdinand de Magellan"), "Histoire", "Vasco de Gama fut le premier Européen à atteindre l'Inde par voie maritime en 1498, contournant l'Afrique via le cap de Bonne-Espérance pour le Portugal."),
            en = LocalizedContent("Who discovered the sea route to India?", listOf("Christopher Columbus", "Vasco da Gama", "Bartolomeu Dias", "Ferdinand Magellan"), "History", "Vasco da Gama was the first European to reach India by sea in 1498, rounding Africa via the Cape of Good Hope for Portugal."),
            zh = LocalizedContent("谁发现了通往印度的海上航线？", listOf("克里斯托弗·哥伦布", "瓦斯科·达·伽马", "巴托洛梅乌·迪亚士", "费迪南德·麦哲伦"), "历史", "瓦斯科·达·伽马是第一位在1498年通过海路到达印度的欧洲人，他绕过非洲好望角为葡萄牙开辟了航线。"),
            es = LocalizedContent("¿Quién descubrió la ruta marítima hacia la India?", listOf("Cristóbal Colón", "Vasco da Gama", "Bartolomé Díaz", "Fernando de Magallanes"), "Historia", "Vasco da Gama fue el primer europeo en llegar a la India por mar en 1498, rodeando África a través del Cabo de Buena Esperanza para Portugal.")
        ),
        BilingualQuestion(
            id = 9152, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année Vasco de Gama a-t-il atteint l'Inde pour la première fois?", listOf("1495", "1498", "1502", "1505"), "Histoire", "Vasco de Gama atteint Calicut, en Inde, en 1498, ouvrant la route maritime européenne vers l'Asie en contournant l'Afrique."),
            en = LocalizedContent("In what year did Vasco da Gama first reach India?", listOf("1495", "1498", "1502", "1505"), "History", "Vasco da Gama reached Calicut, India, in 1498, opening the European maritime route to Asia by rounding Africa."),
            zh = LocalizedContent("瓦斯科·达·伽马在哪一年首次到达印度？", listOf("1495", "1498", "1502", "1505"), "历史", "瓦斯科·达·伽马于1498年到达印度卡利卡特，通过绕过非洲开辟了通往亚洲的欧洲海上航线。"),
            es = LocalizedContent("¿En qué año llegó Vasco da Gama por primera vez a la India?", listOf("1495", "1498", "1502", "1505"), "Historia", "Vasco da Gama llegó a Calicut, India, en 1498, abriendo la ruta marítima europea hacia Asia rodeando África.")
        ),
        BilingualQuestion(
            id = 9153, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel explorateur a complété le premier tour du monde?", listOf("Christophe Colomb", "Vasco de Gama", "Ferdinand de Magellan", "Jean Cartier"), "Histoire", "L'expédition de Magellan, partie en 1519, fut la première à accomplir la circumnavigation du globe, bien que Magellan lui-même soit mort aux Philippines en 1521."),
            en = LocalizedContent("Which explorer completed the first circumnavigation of the globe?", listOf("Christopher Columbus", "Vasco da Gama", "Ferdinand Magellan", "Jacques Cartier"), "History", "Magellan's expedition, which set out in 1519, was the first to circumnavigate the globe, although Magellan himself died in the Philippines in 1521."),
            zh = LocalizedContent("哪位探险家完成了首次环球航行？", listOf("克里斯托弗·哥伦布", "瓦斯科·达·伽马", "费迪南德·麦哲伦", "雅克·卡蒂埃"), "历史", "麦哲伦的探险队于1519年出发，是第一个完成环球航行的，尽管麦哲伦本人于1521年在菲律宾去世。"),
            es = LocalizedContent("¿Qué explorador completó la primera vuelta al mundo?", listOf("Cristóbal Colón", "Vasco da Gama", "Fernando de Magallanes", "Jacques Cartier"), "Historia", "La expedición de Magallanes, que partió en 1519, fue la primera en circunnavegar el globo, aunque Magallanes murió en Filipinas en 1521.")
        ),
        BilingualQuestion(
            id = 9154, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année le voyage de Magellan autour du monde a-t-il commencé?", listOf("1519", "1520", "1521", "1522"), "Histoire", "Le navigateur portugais Fernand de Magellan a quitté l'Espagne en septembre 1519 avec cinq navires, marquant le début de la première circumnavigation du globe, qu'il n'achèvera pas lui-même."),
            en = LocalizedContent("In what year did Magellan's voyage around the world begin?", listOf("1519", "1520", "1521", "1522"), "History", "The Portuguese navigator Ferdinand Magellan left Spain in September 1519 with five ships, marking the start of the first circumnavigation of the globe, which he would not complete himself."),
            zh = LocalizedContent("麦哲伦的环球航行在哪一年开始？", listOf("1519", "1520", "1521", "1522"), "历史", "葡萄牙航海家费迪南德·麦哲伦于1519年9月率领五艘船离开西班牙，开始了首次环球航行，但他本人未能完成。"),
            es = LocalizedContent("¿En qué año comenzó el viaje de Magallanes alrededor del mundo?", listOf("1519", "1520", "1521", "1522"), "Historia", "El navegante portugués Fernando de Magallanes partió de España en septiembre de 1519 con cinco barcos, marcando el inicio de la primera circunnavegación del globo, que él mismo no completaría.")
        ),
        BilingualQuestion(
            id = 9155, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a complété le voyage autour du monde après la mort de Magellan?", listOf("Juan Sebastián Elcano", "António de Albuquerque", "Bartolomeu Dias", "Fernão Mendes Pinto"), "Histoire", "Juan Sebastián Elcano prit le commandement de l'expédition après la mort de Magellan aux Philippines en 1521 et ramena le navire Victoria en Espagne en 1522, achevant ainsi le premier tour du monde."),
            en = LocalizedContent("Who completed the voyage around the world after Magellan's death?", listOf("Juan Sebastián Elcano", "António de Albuquerque", "Bartolomeu Dias", "Fernão Mendes Pinto"), "History", "Juan Sebastián Elcano took command of the expedition after Magellan's death in the Philippines in 1521 and returned the ship Victoria to Spain in 1522, completing the first circumnavigation."),
            zh = LocalizedContent("麦哲伦死后谁完成了环球航行？", listOf("胡安·塞巴斯蒂安·埃尔卡诺", "安东尼奥·德·阿尔布开克", "巴托洛梅乌·迪亚士", "费尔南·门德斯·平托"), "历史", "胡安·塞巴斯蒂安·埃尔卡诺在麦哲伦于1521年在菲律宾去世后接管了探险队，并于1522年将维多利亚号船带回西班牙，完成了首次环球航行。"),
            es = LocalizedContent("¿Quién completó el viaje alrededor del mundo después de la muerte de Magallanes?", listOf("Juan Sebastián Elcano", "António de Albuquerque", "Bartolomé Díaz", "Fernão Mendes Pinto"), "Historia", "Juan Sebastián Elcano tomó el mando de la expedición tras la muerte de Magallanes en Filipinas en 1521 y regresó el barco Victoria a España en 1522, completando así la primera vuelta al mundo.")
        ),
        BilingualQuestion(
            id = 9156, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année le voyage autour du monde a-t-il été complété?", listOf("1520", "1521", "1522", "1523"), "Histoire", "Le premier tour du monde, initié par Magellan, fut achevé en 1522 sous le commandement de Juan Sebastián Elcano après la mort de Magellan aux Philippines."),
            en = LocalizedContent("In what year was the circumnavigation of the globe completed?", listOf("1520", "1521", "1522", "1523"), "History", "The first circumnavigation of the globe, initiated by Magellan, was completed in 1522 under the command of Juan Sebastián Elcano after Magellan's death in the Philippines."),
            zh = LocalizedContent("环球航行在哪一年完成？", listOf("1520", "1521", "1522", "1523"), "历史", "由麦哲伦发起的首次环球航行于1522年在胡安·塞巴斯蒂安·埃尔卡诺的指挥下完成，此前麦哲伦在菲律宾去世。"),
            es = LocalizedContent("¿En qué año se completó la vuelta al mundo?", listOf("1520", "1521", "1522", "1523"), "Historia", "La primera circunnavegación del globo, iniciada por Magallanes, se completó en 1522 bajo el mando de Juan Sebastián Elcano tras la muerte de Magallanes en Filipinas.")
        ),
        BilingualQuestion(
            id = 9157, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus ancien code légal connu?", listOf("Code de Justinien", "Lois des Douze Tables", "Code de Hammourabi", "Lois mosaïques"), "Histoire", "Le Code de Hammourabi, gravé sur une stèle de basalte vers 1750 av. J.-C. en Mésopotamie, est le plus ancien recueil de lois complet découvert."),
            en = LocalizedContent("What is the oldest known legal code?", listOf("Code of Justinian", "Twelve Tables", "Code of Hammurabi", "Mosaic Law"), "History", "The Code of Hammurabi, inscribed on a basalt stele around 1750 BC in Mesopotamia, is the oldest complete collection of laws discovered."),
            zh = LocalizedContent("已知最古老的法典是什么？", listOf("查士丁尼法典", "十二铜表法", "汉谟拉比法典", "摩西律法"), "历史", "汉谟拉比法典刻在约公元前1750年美索不达米亚的一块玄武岩石碑上，是已发现的最完整的古老法律汇编。"),
            es = LocalizedContent("¿Cuál es el código legal más antiguo conocido?", listOf("Código de Justiniano", "Leyes de las Doce Tablas", "Código de Hammurabi", "Leyes mosaicas"), "Historia", "El Código de Hammurabi, grabado en una estela de basalto hacia el 1750 a.C. en Mesopotamia, es la colección de leyes completa más antigua descubierta.")
        ),
        BilingualQuestion(
            id = 9158, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a établi le Code de Justinien?", listOf("Auguste", "Justinien Ier", "Théodose Ier", "Constantin"), "Histoire", "Justinien Ier, empereur byzantin, ordonna la compilation et la réforme du droit romain au VIe siècle, aboutissant au Corpus Juris Civilis, dont le Code fait partie."),
            en = LocalizedContent("Who established the Code of Justinian?", listOf("Augustus", "Justinian I", "Theodosius I", "Constantine"), "History", "Justinian I, Byzantine emperor, ordered the compilation and reform of Roman law in the 6th century, resulting in the Corpus Juris Civilis, of which the Code is a part."),
            zh = LocalizedContent("谁制定了查士丁尼法典？", listOf("奥古斯都", "查士丁尼一世", "狄奥多西一世", "君士坦丁"), "历史", "拜占庭皇帝查士丁尼一世在6世纪下令编纂和改革罗马法，形成了《民法大全》，其中包含该法典。"),
            es = LocalizedContent("¿Quién estableció el Código de Justiniano?", listOf("Augusto", "Justiniano I", "Teodosio I", "Constantino"), "Historia", "Justiniano I, emperador bizantino, ordenó la compilación y reforma del derecho romano en el siglo VI, dando lugar al Corpus Juris Civilis, del cual el Código forma parte.")
        ),
        BilingualQuestion(
            id = 9159, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année le Code de Justinien a-t-il été compilé?", listOf("528", "532", "536", "540"), "Histoire", "Le Code de Justinien, compilation du droit romain, a été promulgué en 532 sous l'empereur byzantin Justinien Ier, visant à unifier et clarifier les lois."),
            en = LocalizedContent("In what year was the Code of Justinian compiled?", listOf("528", "532", "536", "540"), "History", "The Code of Justinian, a compilation of Roman law, was promulgated in 532 under Byzantine emperor Justinian I, aiming to unify and clarify the laws."),
            zh = LocalizedContent("查士丁尼法典在哪一年编纂完成？", listOf("528", "532", "536", "540"), "历史", "查士丁尼法典是罗马法的汇编，于532年在拜占庭皇帝查士丁尼一世统治下颁布，旨在统一和澄清法律。"),
            es = LocalizedContent("¿En qué año se compiló el Código de Justiniano?", listOf("528", "532", "536", "540"), "Historia", "El Código de Justiniano, una compilación del derecho romano, fue promulgado en 532 bajo el emperador bizantino Justiniano I, con el objetivo de unificar y clarificar las leyes.")
        ),
        BilingualQuestion(
            id = 9160, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel était le nom original de la Turquie?", listOf("Asie mineure", "Anatolie", "Périclès", "Thrace"), "Histoire", "Le nom Anatolie désignait la région asiatique de l'actuelle Turquie avant la fondation de la République turque en 1923."),
            en = LocalizedContent("What was the original name of Turkey?", listOf("Asia Minor", "Anatolia", "Pericles", "Thrace"), "History", "The name Anatolia referred to the Asian region of present-day Turkey before the founding of the Turkish Republic in 1923."),
            zh = LocalizedContent("土耳其的原名是什么？", listOf("小亚细亚", "安纳托利亚", "伯里克利", "色雷斯"), "历史", "在1923年土耳其共和国成立之前，安纳托利亚这个名称指的是现今土耳其的亚洲部分。"),
            es = LocalizedContent("¿Cuál era el nombre original de Turquía?", listOf("Asia Menor", "Anatolia", "Pericles", "Tracia"), "Historia", "El nombre Anatolia designaba la región asiática de la actual Turquía antes de la fundación de la República Turca en 1923.")
        ),
        BilingualQuestion(
            id = 9161, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année la Turquie moderne a-t-elle été fondée?", listOf("1920", "1923", "1925", "1930"), "Histoire", "Mustafa Kemal Atatürk proclama la République de Turquie le 29 octobre 1923, mettant fin à l'Empire ottoman et fondant l'État turc moderne et laïc."),
            en = LocalizedContent("In what year was modern Turkey founded?", listOf("1920", "1923", "1925", "1930"), "History", "Mustafa Kemal Atatürk proclaimed the Republic of Turkey on October 29, 1923, ending the Ottoman Empire and founding the modern, secular Turkish state."),
            zh = LocalizedContent("现代土耳其成立于哪一年？", listOf("1920", "1923", "1925", "1930"), "历史", "穆斯塔法·凯末尔·阿塔图尔克于1923年10月29日宣布成立土耳其共和国，结束了奥斯曼帝国，建立了现代世俗的土耳其国家。"),
            es = LocalizedContent("¿En qué año se fundó la Turquía moderna?", listOf("1920", "1923", "1925", "1930"), "Historia", "Mustafa Kemal Atatürk proclamó la República de Turquía el 29 de octubre de 1923, poniendo fin al Imperio Otomano y fundando el estado turco moderno y laico.")
        ),
        BilingualQuestion(
            id = 9162, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a fondé la Turquie moderne?", listOf("Mehmed II", "Mustafa Kemal Atatürk", "Süleyman le Magnifique", "Mehmed VI"), "Histoire", "Mustafa Kemal Atatürk a fondé la République de Turquie en 1923 après la guerre d'indépendance turque, modernisant le pays par des réformes politiques, sociales et culturelles radicales."),
            en = LocalizedContent("Who founded modern Turkey?", listOf("Mehmed II", "Mustafa Kemal Atatürk", "Suleiman the Magnificent", "Mehmed VI"), "History", "Mustafa Kemal Atatürk founded the Republic of Turkey in 1923 after the Turkish War of Independence, modernizing the country through radical political, social, and cultural reforms."),
            zh = LocalizedContent("谁建立了现代土耳其？", listOf("穆罕默德二世", "穆斯塔法·凯末尔·阿塔图尔克", "苏莱曼大帝", "穆罕默德六世"), "历史", "穆斯塔法·凯末尔·阿塔图尔克在土耳其独立战争后于1923年建立了土耳其共和国，通过激进的政治、社会和文化改革使国家现代化。"),
            es = LocalizedContent("¿Quién fundó la Turquía moderna?", listOf("Mehmed II", "Mustafa Kemal Atatürk", "Solimán el Magnífico", "Mehmed VI"), "Historia", "Mustafa Kemal Atatürk fundó la República de Turquía en 1923 tras la guerra de independencia turca, modernizando el país mediante reformas políticas, sociales y culturales radicales.")
        ),
        BilingualQuestion(
            id = 9163, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année la Grande Muraille de Chine a-t-elle été terminée?", listOf("1644", "1644", "1644", "1644"), "Histoire", "La construction de la Grande Muraille s'est étalée sur plusieurs dynasties, mais sa forme actuelle date de la dynastie Ming, qui s'est achevée en 1644."),
            en = LocalizedContent("In what year was the Great Wall of China completed?", listOf("1644", "1644", "1644", "1644"), "History", "The construction of the Great Wall spanned several dynasties, but its current form dates from the Ming Dynasty, which ended in 1644."),
            zh = LocalizedContent("中国的长城在哪一年建成？", listOf("1644", "1644", "1644", "1644"), "历史", "长城的修建跨越了几个朝代，但其现存形式始于明朝，明朝于1644年结束。"),
            es = LocalizedContent("¿En qué año se completó la Gran Muralla China?", listOf("1644", "1644", "1644", "1644"), "Historia", "La construcción de la Gran Muralla abarcó varias dinastías, pero su forma actual data de la dinastía Ming, que terminó en 1644.")
        ),
        BilingualQuestion(
            id = 9164, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a commandé la construction de la Grande Muraille?", listOf("Qin Shi Huang", "Kangxi", "Yongzheng", "Qianlong"), "Histoire", "Qin Shi Huang, premier empereur de Chine unifiée, ordonna la construction de la Grande Muraille pour protéger son territoire des invasions nomades venues du nord."),
            en = LocalizedContent("Who ordered the construction of the Great Wall?", listOf("Qin Shi Huang", "Kangxi", "Yongzheng", "Qianlong"), "History", "Qin Shi Huang, the first emperor of unified China, ordered the construction of the Great Wall to protect his territory from nomadic invasions from the north."),
            zh = LocalizedContent("谁下令修建长城？", listOf("秦始皇", "康熙", "雍正", "乾隆"), "历史", "秦始皇，统一中国的第一位皇帝，下令修建长城以保护其领土免受北方游牧民族的入侵。"),
            es = LocalizedContent("¿Quién ordenó la construcción de la Gran Muralla?", listOf("Qin Shi Huang", "Kangxi", "Yongzheng", "Qianlong"), "Historia", "Qin Shi Huang, el primer emperador de China unificada, ordenó la construcción de la Gran Muralla para proteger su territorio de las invasiones nómadas del norte.")
        ),
        BilingualQuestion(
            id = 9165, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année la Dynastie Ming a-t-elle commencé?", listOf("1344", "1368", "1388", "1405"), "Histoire", "La dynastie Ming a débuté en 1368 lorsque Zhu Yuanzhang a renversé la dynastie mongole Yuan et s'est proclamé empereur, fondant ainsi une nouvelle ère impériale chinoise."),
            en = LocalizedContent("In what year did the Ming Dynasty begin?", listOf("1344", "1368", "1388", "1405"), "History", "The Ming Dynasty began in 1368 when Zhu Yuanzhang overthrew the Mongol Yuan dynasty and proclaimed himself emperor, founding a new Chinese imperial era."),
            zh = LocalizedContent("明朝在哪一年开始？", listOf("1344", "1368", "1388", "1405"), "历史", "明朝始于1368年，当时朱元璋推翻了蒙古元朝，自立为帝，开创了中国新的帝国时代。"),
            es = LocalizedContent("¿En qué año comenzó la dinastía Ming?", listOf("1344", "1368", "1388", "1405"), "Historia", "La dinastía Ming comenzó en 1368 cuando Zhu Yuanzhang derrocó la dinastía mongola Yuan y se proclamó emperador, fundando una nueva era imperial china.")
        ),
        BilingualQuestion(
            id = 9166, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année la Dynastie Ming s'est-elle terminée?", listOf("1644", "1661", "1683", "1722"), "Histoire", "La dynastie Ming s'est effondrée en 1644 lorsque Pékin a été prise par les rebelles de Li Zicheng, marquant la fin de son règne et l'arrivée de la dynastie Qing."),
            en = LocalizedContent("In what year did the Ming Dynasty end?", listOf("1644", "1661", "1683", "1722"), "History", "The Ming Dynasty collapsed in 1644 when Beijing was taken by Li Zicheng's rebels, marking the end of its rule and the arrival of the Qing Dynasty."),
            zh = LocalizedContent("明朝在哪一年结束？", listOf("1644", "1661", "1683", "1722"), "历史", "明朝于1644年崩溃，当时北京被李自成的叛军攻占，标志着其统治的结束和清朝的到来。"),
            es = LocalizedContent("¿En qué año terminó la dinastía Ming?", listOf("1644", "1661", "1683", "1722"), "Historia", "La dinastía Ming colapsó en 1644 cuando Pekín fue tomada por los rebeldes de Li Zicheng, marcando el fin de su reinado y la llegada de la dinastía Qing.")
        ),
        BilingualQuestion(
            id = 9167, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel était le fondateur de la Dynastie Ming?", listOf("Kangxi", "Yongzheng", "Zhu Yuanzhang", "Zhu De"), "Histoire", "Zhu Yuanzhang, un ancien paysan, mena la révolte qui renversa la dynastie mongole Yuan et fonda la dynastie Ming en 1368, devenant l'empereur Hongwu."),
            en = LocalizedContent("Who was the founder of the Ming Dynasty?", listOf("Kangxi", "Yongzheng", "Zhu Yuanzhang", "Zhu De"), "History", "Zhu Yuanzhang, a former peasant, led the revolt that overthrew the Mongol Yuan dynasty and founded the Ming Dynasty in 1368, becoming the Hongwu Emperor."),
            zh = LocalizedContent("明朝的建立者是谁？", listOf("康熙", "雍正", "朱元璋", "朱德"), "历史", "朱元璋，一位前农民，领导了推翻蒙古元朝的起义，并于1368年建立了明朝，成为洪武帝。"),
            es = LocalizedContent("¿Quién fue el fundador de la dinastía Ming?", listOf("Kangxi", "Yongzheng", "Zhu Yuanzhang", "Zhu De"), "Historia", "Zhu Yuanzhang, un antiguo campesino, lideró la revuelta que derrocó la dinastía mongola Yuan y fundó la dinastía Ming en 1368, convirtiéndose en el emperador Hongwu.")
        ),
        BilingualQuestion(
            id = 9168, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année les Cités-États grecques ont-elles été unifiées?", listOf("338 avant J.C.", "320 avant J.C.", "300 avant J.C.", "280 avant J.C."), "Histoire", "Philippe II de Macédoine a unifié les Cités-États grecques en 338 av. J.-C. après sa victoire à la bataille de Chéronée, mettant fin à leur indépendance."),
            en = LocalizedContent("In what year were the Greek city-states unified?", listOf("338 BC", "320 BC", "300 BC", "280 BC"), "History", "Philip II of Macedon unified the Greek city-states in 338 BC after his victory at the Battle of Chaeronea, ending their independence."),
            zh = LocalizedContent("希腊城邦在哪一年统一？", listOf("公元前338年", "公元前320年", "公元前300年", "公元前280年"), "历史", "马其顿的腓力二世在公元前338年喀罗尼亚战役胜利后统一了希腊城邦，结束了它们的独立。"),
            es = LocalizedContent("¿En qué año se unificaron las ciudades-estado griegas?", listOf("338 a.C.", "320 a.C.", "300 a.C.", "280 a.C."), "Historia", "Filipo II de Macedonia unificó las ciudades-estado griegas en el 338 a.C. tras su victoria en la batalla de Queronea, poniendo fin a su independencia.")
        ),
        BilingualQuestion(
            id = 9169, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a unifié les Cités-États grecques?", listOf("Philippe II", "Alexandre le Grand", "Démosthène", "Périclès"), "Histoire", "Philippe II de Macédoine a unifié les cités-États grecques en les soumettant militairement après la bataille de Chéronée en 338 av. J.-C., créant la Ligue de Corinthe sous son hégémonie."),
            en = LocalizedContent("Who unified the Greek city-states?", listOf("Philip II", "Alexander the Great", "Demosthenes", "Pericles"), "History", "Philip II of Macedon unified the Greek city-states by subduing them militarily after the Battle of Chaeronea in 338 BC, creating the League of Corinth under his hegemony."),
            zh = LocalizedContent("谁统一了希腊城邦？", listOf("腓力二世", "亚历山大大帝", "德摩斯梯尼", "伯里克利"), "历史", "马其顿的腓力二世在公元前338年喀罗尼亚战役后通过军事征服统一了希腊城邦，建立了在他霸权下的科林斯同盟。"),
            es = LocalizedContent("¿Quién unificó las ciudades-estado griegas?", listOf("Filipo II", "Alejandro Magno", "Demóstenes", "Pericles"), "Historia", "Filipo II de Macedonia unificó las ciudades-estado griegas sometiéndolas militarmente tras la batalla de Queronea en el 338 a.C., creando la Liga de Corinto bajo su hegemonía.")
        ),
    )

    private fun part4(): List<BilingualQuestion> = listOf(
        BilingualQuestion(
            id = 9170, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année la Bataille de Marathon s'est-elle déroulée?", listOf("492 avant J.C.", "490 avant J.C.", "480 avant J.C.", "470 avant J.C."), "Histoire", "La bataille de Marathon en 490 avant J.-C. oppose les Athéniens aux Perses lors de la première guerre médique. Cette victoire grecque stoppe temporairement l'expansion perse en Europe."),
            en = LocalizedContent("In what year did the Battle of Marathon take place?", listOf("492 BC", "490 BC", "480 BC", "470 BC"), "History", "The Battle of Marathon in 490 BC pitted the Athenians against the Persians during the first Greco-Persian War. This Greek victory temporarily halted Persian expansion into Europe."),
            zh = LocalizedContent("马拉松战役发生在哪一年？", listOf("公元前492年", "公元前490年", "公元前480年", "公元前470年"), "历史", "马拉松战役于公元前490年发生，是第一次希波战争中雅典人与波斯人的对抗。这场希腊的胜利暂时阻止了波斯向欧洲的扩张。"),
            es = LocalizedContent("¿En qué año tuvo lugar la Batalla de Maratón?", listOf("492 a.C.", "490 a.C.", "480 a.C.", "470 a.C."), "Historia", "La Batalla de Maratón en el 490 a.C. enfrentó a los atenienses contra los persas durante la primera guerra médica. Esta victoria griega detuvo temporalmente la expansión persa en Europa.")
        ),
        BilingualQuestion(
            id = 9171, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel était le chef des Perses lors de la Bataille de Marathon?", listOf("Cyrus II", "Darius Ier", "Xerxès Ier", "Artaxerxès"), "Histoire", "Darius Ier était le roi de l'Empire perse et a ordonné l'invasion de la Grèce, menant à la bataille de Marathon en 490 av. J.-C., où les Athéniens ont remporté une victoire décisive."),
            en = LocalizedContent("Who was the leader of the Persians at the Battle of Marathon?", listOf("Cyrus II", "Darius I", "Xerxes I", "Artaxerxes"), "History", "Darius I was the king of the Persian Empire and ordered the invasion of Greece, leading to the Battle of Marathon in 490 BC, where the Athenians won a decisive victory."),
            zh = LocalizedContent("马拉松战役中波斯人的领袖是谁？", listOf("居鲁士二世", "大流士一世", "薛西斯一世", "阿尔塔薛西斯"), "历史", "大流士一世是波斯帝国的国王，他下令入侵希腊，导致了公元前490年的马拉松战役，雅典人取得了决定性的胜利。"),
            es = LocalizedContent("¿Quién fue el líder de los persas en la Batalla de Maratón?", listOf("Ciro II", "Darío I", "Jerjes I", "Artajerjes"), "Historia", "Darío I fue el rey del Imperio persa y ordenó la invasión de Grecia, lo que llevó a la Batalla de Maratón en el 490 a.C., donde los atenienses obtuvieron una victoria decisiva.")
        ),
        BilingualQuestion(
            id = 9172, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année la Bataille de Salamine s'est-elle déroulée?", listOf("490 avant J.C.", "480 avant J.C.", "470 avant J.C.", "450 avant J.C."), "Histoire", "La bataille de Salamine opposa la flotte grecque à celle de l'Empire perse en 480 avant J.-C., dans le cadre de la seconde guerre médique. Cette victoire navale grecque marqua un tournant décisif contre l'invasion perse menée par Xerxès Ier."),
            en = LocalizedContent("In what year did the Battle of Salamis take place?", listOf("490 BC", "480 BC", "470 BC", "450 BC"), "History", "The Battle of Salamis pitted the Greek fleet against that of the Persian Empire in 480 BC, during the second Greco-Persian War. This Greek naval victory marked a decisive turning point against the Persian invasion led by Xerxes I."),
            zh = LocalizedContent("萨拉米斯战役发生在哪一年？", listOf("公元前490年", "公元前480年", "公元前470年", "公元前450年"), "历史", "萨拉米斯战役于公元前480年发生，是第二次希波战争中希腊舰队与波斯帝国的对抗。这场希腊海军的胜利标志着对抗薛西斯一世领导的波斯入侵的决定性转折点。"),
            es = LocalizedContent("¿En qué año tuvo lugar la Batalla de Salamina?", listOf("490 a.C.", "480 a.C.", "470 a.C.", "450 a.C."), "Historia", "La Batalla de Salamina enfrentó a la flota griega contra la del Imperio persa en el 480 a.C., durante la segunda guerra médica. Esta victoria naval griega marcó un punto de inflexión decisivo contra la invasión persa liderada por Jerjes I.")
        ),
        BilingualQuestion(
            id = 9173, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a commandé la flotte grecque à la Bataille de Salamine?", listOf("Périclès", "Thémistocle", "Léonidas", "Miltiade"), "Histoire", "Thémistocle, stratège athénien, commandait la flotte grecque unifiée lors de la bataille de Salamine en 480 av. J.-C., où il utilisa une ruse pour attirer les Perses dans le détroit étroit."),
            en = LocalizedContent("Who commanded the Greek fleet at the Battle of Salamis?", listOf("Pericles", "Themistocles", "Leonidas", "Miltiades"), "History", "Themistocles, an Athenian strategist, commanded the unified Greek fleet at the Battle of Salamis in 480 BC, where he used a ruse to lure the Persians into the narrow strait."),
            zh = LocalizedContent("谁在萨拉米斯战役中指挥希腊舰队？", listOf("伯里克利", "地米斯托克利", "列奥尼达", "米太亚德"), "历史", "地米斯托克利，一位雅典战略家，在公元前480年的萨拉米斯战役中指挥统一的希腊舰队，他使用计谋将波斯人引诱到狭窄的海峡中。"),
            es = LocalizedContent("¿Quién comandó la flota griega en la Batalla de Salamina?", listOf("Pericles", "Temístocles", "Leónidas", "Milcíades"), "Historia", "Temístocles, un estratega ateniense, comandó la flota griega unificada en la Batalla de Salamina en el 480 a.C., donde utilizó un ardid para atraer a los persas al estrecho angosto.")
        ),
        BilingualQuestion(
            id = 9174, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année la Bataille des Thermopyles s'est-elle déroulée?", listOf("492 avant J.C.", "490 avant J.C.", "480 avant J.C.", "470 avant J.C."), "Histoire", "La Bataille des Thermopyles a eu lieu en 480 avant J.-C., durant la seconde guerre médique, opposant une coalition de cités grecques menée par le roi spartiate Léonidas à l'armée perse de Xerxès Ier."),
            en = LocalizedContent("In what year did the Battle of Thermopylae take place?", listOf("492 BC", "490 BC", "480 BC", "470 BC"), "History", "The Battle of Thermopylae took place in 480 BC, during the second Greco-Persian War, pitting a coalition of Greek city-states led by the Spartan king Leonidas against the Persian army of Xerxes I."),
            zh = LocalizedContent("温泉关战役发生在哪一年？", listOf("公元前492年", "公元前490年", "公元前480年", "公元前470年"), "历史", "温泉关战役发生于公元前480年，在第二次希波战争期间，由斯巴达国王列奥尼达领导的希腊城邦联盟对抗薛西斯一世的波斯军队。"),
            es = LocalizedContent("¿En qué año tuvo lugar la Batalla de las Termópilas?", listOf("492 a.C.", "490 a.C.", "480 a.C.", "470 a.C."), "Historia", "La Batalla de las Termópilas tuvo lugar en el 480 a.C., durante la segunda guerra médica, enfrentando a una coalición de ciudades-estado griegas lideradas por el rey espartano Leónidas contra el ejército persa de Jerjes I.")
        ),
        BilingualQuestion(
            id = 9175, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui a commandé les Grecs aux Thermopyles?", listOf("Périclès", "Thémistocle", "Léonidas", "Miltiade"), "Histoire", "Le roi spartiate Léonidas Ier commandait les forces grecques lors de la bataille des Thermopyles en 480 av. J.-C., où ils affrontèrent l'armée perse de Xerxès."),
            en = LocalizedContent("Who commanded the Greeks at Thermopylae?", listOf("Pericles", "Themistocles", "Leonidas", "Miltiades"), "History", "The Spartan king Leonidas I commanded the Greek forces at the Battle of Thermopylae in 480 BC, where they faced the Persian army of Xerxes."),
            zh = LocalizedContent("谁在温泉关指挥希腊军队？", listOf("伯里克利", "地米斯托克利", "列奥尼达", "米太亚德"), "历史", "斯巴达国王列奥尼达一世在公元前480年的温泉关战役中指挥希腊军队，他们面对的是薛西斯的波斯军队。"),
            es = LocalizedContent("¿Quién comandó a los griegos en las Termópilas?", listOf("Pericles", "Temístocles", "Leónidas", "Milcíades"), "Historia", "El rey espartano Leónidas I comandó las fuerzas griegas en la Batalla de las Termópilas en el 480 a.C., donde se enfrentaron al ejército persa de Jerjes.")
        ),
        BilingualQuestion(
            id = 9176, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année la Guerre du Péloponnèse a-t-elle commencé?", listOf("431 avant J.C.", "420 avant J.C.", "410 avant J.C.", "400 avant J.C."), "Histoire", "La guerre du Péloponnèse, opposant Athènes et Sparte, a débuté en 431 avant J.-C., suite aux tensions croissantes entre les deux cités grecques et leurs alliances respectives."),
            en = LocalizedContent("In what year did the Peloponnesian War begin?", listOf("431 BC", "420 BC", "410 BC", "400 BC"), "History", "The Peloponnesian War, opposing Athens and Sparta, began in 431 BC, following growing tensions between the two Greek city-states and their respective alliances."),
            zh = LocalizedContent("伯罗奔尼撒战争始于哪一年？", listOf("公元前431年", "公元前420年", "公元前410年", "公元前400年"), "历史", "伯罗奔尼撒战争，雅典与斯巴达之间的对抗，始于公元前431年，源于两个希腊城邦及其各自联盟之间日益紧张的局势。"),
            es = LocalizedContent("¿En qué año comenzó la Guerra del Peloponeso?", listOf("431 a.C.", "420 a.C.", "410 a.C.", "400 a.C."), "Historia", "La Guerra del Peloponeso, que enfrentó a Atenas y Esparta, comenzó en el 431 a.C., tras las crecientes tensiones entre las dos ciudades-estado griegas y sus respectivas alianzas.")
        ),
        BilingualQuestion(
            id = 9177, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année la Guerre du Péloponnèse s'est-elle terminée?", listOf("421 avant J.C.", "411 avant J.C.", "404 avant J.C.", "394 avant J.C."), "Histoire", "La guerre du Péloponnèse, opposant Athènes et Sparte, s'achève en 404 avant J.-C. avec la capitulation d'Athènes et la destruction de ses Longs Murs."),
            en = LocalizedContent("In what year did the Peloponnesian War end?", listOf("421 BC", "411 BC", "404 BC", "394 BC"), "History", "The Peloponnesian War, opposing Athens and Sparta, ended in 404 BC with the surrender of Athens and the destruction of its Long Walls."),
            zh = LocalizedContent("伯罗奔尼撒战争结束于哪一年？", listOf("公元前421年", "公元前411年", "公元前404年", "公元前394年"), "历史", "伯罗奔尼撒战争，雅典与斯巴达之间的对抗，于公元前404年结束，雅典投降，其长墙被摧毁。"),
            es = LocalizedContent("¿En qué año terminó la Guerra del Peloponeso?", listOf("421 a.C.", "411 a.C.", "404 a.C.", "394 a.C."), "Historia", "La Guerra del Peloponeso, que enfrentó a Atenas y Esparta, terminó en el 404 a.C. con la rendición de Atenas y la destrucción de sus Muros Largos.")
        ),
        BilingualQuestion(
            id = 9178, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a remporté la Guerre du Péloponnèse?", listOf("Athènes", "Sparte", "Thèbes", "Corinthe"), "Histoire", "Sparte et sa ligue ont vaincu Athènes et la ligue de Délos en 404 av. J.-C., mettant fin à la guerre du Péloponnèse après des décennies de conflit."),
            en = LocalizedContent("Who won the Peloponnesian War?", listOf("Athens", "Sparta", "Thebes", "Corinth"), "History", "Sparta and its league defeated Athens and the Delian League in 404 BC, ending the Peloponnesian War after decades of conflict."),
            zh = LocalizedContent("谁赢得了伯罗奔尼撒战争？", listOf("雅典", "斯巴达", "底比斯", "科林斯"), "历史", "斯巴达及其联盟在公元前404年击败了雅典和提洛同盟，结束了长达数十年的伯罗奔尼撒战争。"),
            es = LocalizedContent("¿Quién ganó la Guerra del Peloponeso?", listOf("Atenas", "Esparta", "Tebas", "Corinto"), "Historia", "Esparta y su liga derrotaron a Atenas y la Liga de Delos en el 404 a.C., poniendo fin a la Guerra del Peloponeso después de décadas de conflicto.")
        ),
        BilingualQuestion(
            id = 9179, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel général grec a remporté la victoire pour Sparte?", listOf("Alcibiade", "Lysandre", "Gylippus", "Épaminondas"), "Histoire", "Lysandre commanda la flotte spartiate qui vainquit Athènes à Aigos Potamos en 405 av. J.-C., mettant fin à la guerre du Péloponnèse."),
            en = LocalizedContent("Which Greek general won the victory for Sparta?", listOf("Alcibiades", "Lysander", "Gylippus", "Epaminondas"), "History", "Lysander commanded the Spartan fleet that defeated Athens at Aegospotami in 405 BC, ending the Peloponnesian War."),
            zh = LocalizedContent("哪位希腊将军为斯巴达赢得了胜利？", listOf("亚西比德", "吕山德", "吉利普斯", "伊巴密浓达"), "历史", "吕山德指挥斯巴达舰队在公元前405年的羊河战役中击败雅典，结束了伯罗奔尼撒战争。"),
            es = LocalizedContent("¿Qué general griego obtuvo la victoria para Esparta?", listOf("Alcibíades", "Lisandro", "Gílippo", "Epaminondas"), "Historia", "Lisandro comandó la flota espartana que derrotó a Atenas en Egospótamos en el 405 a.C., poniendo fin a la Guerra del Peloponeso.")
        ),
        BilingualQuestion(
            id = 9180, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année Sparte a-t-elle dominé la Grèce?", listOf("430 avant J.C.", "400 avant J.C.", "370 avant J.C.", "330 avant J.C."), "Histoire", "Sparte a dominé la Grèce après sa victoire contre Athènes lors de la guerre du Péloponnèse, qui s'est achevée en 404 avant J.C., marquant l'apogée de son hégémonie vers 400 avant J.C."),
            en = LocalizedContent("In which year did Sparta dominate Greece?", listOf("430 BC", "400 BC", "370 BC", "330 BC"), "History", "Sparta dominated Greece after its victory over Athens in the Peloponnesian War, which ended in 404 BC, marking the peak of its hegemony around 400 BC."),
            zh = LocalizedContent("斯巴达在哪一年统治了希腊？", listOf("公元前430年", "公元前400年", "公元前370年", "公元前330年"), "历史", "斯巴达在伯罗奔尼撒战争中战胜雅典后统治了希腊，战争于公元前404年结束，其霸权在公元前400年左右达到顶峰。"),
            es = LocalizedContent("¿En qué año dominó Esparta Grecia?", listOf("430 a.C.", "400 a.C.", "370 a.C.", "330 a.C."), "Historia", "Esparta dominó Grecia tras su victoria sobre Atenas en la Guerra del Peloponeso, que terminó en el 404 a.C., marcando el apogeo de su hegemonía hacia el 400 a.C.")
        ),
        BilingualQuestion(
            id = 9181, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année la Bataille de Leuctes s'est-elle déroulée?", listOf("380 avant J.C.", "371 avant J.C.", "360 avant J.C.", "350 avant J.C."), "Histoire", "La bataille de Leuctes en 371 av. J.-C. vit la défaite de Sparte face à Thèbes, dirigée par Épaminondas, brisant ainsi l'hégémonie spartiate en Grèce."),
            en = LocalizedContent("In which year did the Battle of Leuctra take place?", listOf("380 BC", "371 BC", "360 BC", "350 BC"), "History", "The Battle of Leuctra in 371 BC saw the defeat of Sparta by Thebes, led by Epaminondas, breaking Spartan hegemony in Greece."),
            zh = LocalizedContent("留克特拉战役发生在哪一年？", listOf("公元前380年", "公元前371年", "公元前360年", "公元前350年"), "历史", "公元前371年的留克特拉战役中，底比斯在伊巴密浓达的领导下击败了斯巴达，打破了斯巴达在希腊的霸权。"),
            es = LocalizedContent("¿En qué año tuvo lugar la Batalla de Leuctra?", listOf("380 a.C.", "371 a.C.", "360 a.C.", "350 a.C."), "Historia", "La Batalla de Leuctra en el 371 a.C. vio la derrota de Esparta por Tebas, dirigida por Epaminondas, rompiendo la hegemonía espartana en Grecia.")
        ),
        BilingualQuestion(
            id = 9182, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a mené Thèbes à la victoire à la Bataille de Leuctes?", listOf("Pélopidas", "Épaminondas", "Jason de Phères", "Alcibiade"), "Histoire", "Épaminondas, général thébain, révolutionna la tactique militaire en utilisant un ordre oblique pour vaincre Sparte à Leuctes en 371 av. J.-C., brisant ainsi sa suprématie."),
            en = LocalizedContent("Who led Thebes to victory at the Battle of Leuctra?", listOf("Pelopidas", "Epaminondas", "Jason of Pherae", "Alcibiades"), "History", "Epaminondas, a Theban general, revolutionized military tactics by using an oblique order to defeat Sparta at Leuctra in 371 BC, breaking its supremacy."),
            zh = LocalizedContent("谁领导底比斯在留克特拉战役中取得胜利？", listOf("佩洛皮达斯", "伊巴密浓达", "费拉的伊阿宋", "亚西比德"), "历史", "底比斯将军伊巴密浓达在公元前371年的留克特拉战役中采用斜形战术击败斯巴达，打破了斯巴达的霸权，革新了军事战术。"),
            es = LocalizedContent("¿Quién llevó a Tebas a la victoria en la Batalla de Leuctra?", listOf("Pelópidas", "Epaminondas", "Jasón de Feras", "Alcibíades"), "Historia", "Epaminondas, general tebano, revolucionó la táctica militar usando un orden oblicuo para derrotar a Esparta en Leuctra en el 371 a.C., rompiendo su supremacía.")
        ),
        BilingualQuestion(
            id = 9183, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année Alexandre le Grand a-t-il conquis l'Empire perse?", listOf("332 avant J.C.", "330 avant J.C.", "328 avant J.C.", "326 avant J.C."), "Histoire", "Alexandre le Grand a conquis l'Empire perse achéménide après sa victoire décisive à la bataille de Gaugamèles en 331 av. J.-C., menant à la chute de Persépolis en 330 av. J.-C."),
            en = LocalizedContent("In which year did Alexander the Great conquer the Persian Empire?", listOf("332 BC", "330 BC", "328 BC", "326 BC"), "History", "Alexander the Great conquered the Achaemenid Persian Empire after his decisive victory at the Battle of Gaugamela in 331 BC, leading to the fall of Persepolis in 330 BC."),
            zh = LocalizedContent("亚历山大大帝在哪一年征服了波斯帝国？", listOf("公元前332年", "公元前330年", "公元前328年", "公元前326年"), "历史", "亚历山大大帝在公元前331年的高加米拉战役中取得决定性胜利后征服了阿契美尼德波斯帝国，导致波斯波利斯于公元前330年陷落。"),
            es = LocalizedContent("¿En qué año conquistó Alejandro Magno el Imperio Persa?", listOf("332 a.C.", "330 a.C.", "328 a.C.", "326 a.C."), "Historia", "Alejandro Magno conquistó el Imperio Persa Aqueménida tras su victoria decisiva en la Batalla de Gaugamela en el 331 a.C., lo que llevó a la caída de Persépolis en el 330 a.C.")
        ),
        BilingualQuestion(
            id = 9184, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel était le nom du tuteur d'Alexandre le Grand?", listOf("Aristote", "Platon", "Plutarque", "Thucydide"), "Histoire", "Aristote fut le précepteur d'Alexandre le Grand à partir de 343 av. J.-C., sur invitation de son père Philippe II de Macédoine."),
            en = LocalizedContent("What was the name of Alexander the Great's tutor?", listOf("Aristotle", "Plato", "Plutarch", "Thucydides"), "History", "Aristotle was the tutor of Alexander the Great from 343 BC, invited by his father Philip II of Macedon."),
            zh = LocalizedContent("亚历山大大帝的导师叫什么名字？", listOf("亚里士多德", "柏拉图", "普鲁塔克", "修昔底德"), "历史", "亚里士多德从公元前343年起担任亚历山大大帝的导师，受其父马其顿的腓力二世之邀。"),
            es = LocalizedContent("¿Cuál era el nombre del tutor de Alejandro Magno?", listOf("Aristóteles", "Platón", "Plutarco", "Tucídides"), "Historia", "Aristóteles fue el tutor de Alejandro Magno a partir del 343 a.C., invitado por su padre Filipo II de Macedonia.")
        ),
        BilingualQuestion(
            id = 9185, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année la Bataille de Gaugamèles s'est-elle déroulée?", listOf("332 avant J.C.", "331 avant J.C.", "330 avant J.C.", "328 avant J.C."), "Histoire", "La bataille de Gaugamèles opposa Alexandre le Grand à Darius III en 331 avant J.-C., marquant la chute de l'Empire perse achéménide."),
            en = LocalizedContent("In which year did the Battle of Gaugamela take place?", listOf("332 BC", "331 BC", "330 BC", "328 BC"), "History", "The Battle of Gaugamela pitted Alexander the Great against Darius III in 331 BC, marking the fall of the Achaemenid Persian Empire."),
            zh = LocalizedContent("高加米拉战役发生在哪一年？", listOf("公元前332年", "公元前331年", "公元前330年", "公元前328年"), "历史", "高加米拉战役于公元前331年发生在亚历山大大帝与大流士三世之间，标志着阿契美尼德波斯帝国的覆灭。"),
            es = LocalizedContent("¿En qué año tuvo lugar la Batalla de Gaugamela?", listOf("332 a.C.", "331 a.C.", "330 a.C.", "328 a.C."), "Historia", "La Batalla de Gaugamela enfrentó a Alejandro Magno contra Darío III en el 331 a.C., marcando la caída del Imperio Persa Aqueménida.")
        ),
        BilingualQuestion(
            id = 9186, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui était Darius III?", listOf("Un général perse", "Un roi perse", "Un satrap", "Un général grec"), "Histoire", "Darius III fut le dernier roi de l'Empire achéménide, régnant de 336 à 330 avant J.-C., avant d'être vaincu par Alexandre le Grand."),
            en = LocalizedContent("Who was Darius III?", listOf("A Persian general", "A Persian king", "A satrap", "A Greek general"), "History", "Darius III was the last king of the Achaemenid Empire, reigning from 336 to 330 BC, before being defeated by Alexander the Great."),
            zh = LocalizedContent("大流士三世是谁？", listOf("一位波斯将军", "一位波斯国王", "一位总督", "一位希腊将军"), "历史", "大流士三世是阿契美尼德帝国的末代国王，统治时期为公元前336年至公元前330年，后被亚历山大大帝击败。"),
            es = LocalizedContent("¿Quién fue Darío III?", listOf("Un general persa", "Un rey persa", "Un sátrapa", "Un general griego"), "Historia", "Darío III fue el último rey del Imperio Aqueménida, reinando del 336 al 330 a.C., antes de ser derrotado por Alejandro Magno.")
        ),
        BilingualQuestion(
            id = 9187, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année la Bataille de l'Hydaspe s'est-elle déroulée?", listOf("328 avant J.C.", "327 avant J.C.", "326 avant J.C.", "325 avant J.C."), "Histoire", "La bataille de l'Hydaspe opposa Alexandre le Grand au roi indien Porus en 326 avant J.-C., marquant la dernière grande conquête d'Alexandre en Inde."),
            en = LocalizedContent("In which year did the Battle of the Hydaspes take place?", listOf("328 BC", "327 BC", "326 BC", "325 BC"), "History", "The Battle of the Hydaspes pitted Alexander the Great against the Indian king Porus in 326 BC, marking Alexander's last major conquest in India."),
            zh = LocalizedContent("希达斯皮斯河战役发生在哪一年？", listOf("公元前328年", "公元前327年", "公元前326年", "公元前325年"), "历史", "希达斯皮斯河战役于公元前326年发生在亚历山大大帝与印度国王波鲁斯之间，标志着亚历山大在印度的最后一次重大征服。"),
            es = LocalizedContent("¿En qué año tuvo lugar la Batalla del Hidaspes?", listOf("328 a.C.", "327 a.C.", "326 a.C.", "325 a.C."), "Historia", "La Batalla del Hidaspes enfrentó a Alejandro Magno contra el rey indio Poros en el 326 a.C., marcando la última gran conquista de Alejandro en la India.")
        ),
        BilingualQuestion(
            id = 9188, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a commandé l'armée indienne à la Bataille de l'Hydaspe?", listOf("Ashoka", "Porus", "Chandragupta", "Duriyodhana"), "Histoire", "Porus était le roi indien du royaume de Paurava qui affronta Alexandre le Grand sur les rives de l'Hydaspe en 326 av. J.-C."),
            en = LocalizedContent("Who commanded the Indian army at the Battle of the Hydaspes?", listOf("Ashoka", "Porus", "Chandragupta", "Duryodhana"), "History", "Porus was the Indian king of the Paurava kingdom who faced Alexander the Great on the banks of the Hydaspes in 326 BC."),
            zh = LocalizedContent("谁在希达斯皮斯河战役中指挥印度军队？", listOf("阿育王", "波鲁斯", "旃陀罗笈多", "难敌"), "历史", "波鲁斯是波拉瓦王国的印度国王，于公元前326年在希达斯皮斯河畔与亚历山大大帝交战。"),
            es = LocalizedContent("¿Quién comandó el ejército indio en la Batalla del Hidaspes?", listOf("Ashoka", "Poros", "Chandragupta", "Duryodhana"), "Historia", "Poros fue el rey indio del reino de Paurava que se enfrentó a Alejandro Magno en las orillas del Hidaspes en el 326 a.C.")
        ),
        BilingualQuestion(
            id = 9189, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année Alexandre le Grand est-il mort?", listOf("326 avant J.C.", "323 avant J.C.", "320 avant J.C.", "310 avant J.C."), "Histoire", "Alexandre le Grand est mort en 323 avant J.-C. à Babylone, probablement des suites d'une maladie ou d'un empoisonnement, à l'âge de 32 ans."),
            en = LocalizedContent("In which year did Alexander the Great die?", listOf("326 BC", "323 BC", "320 BC", "310 BC"), "History", "Alexander the Great died in 323 BC in Babylon, probably from illness or poisoning, at the age of 32."),
            zh = LocalizedContent("亚历山大大帝在哪一年去世？", listOf("公元前326年", "公元前323年", "公元前320年", "公元前310年"), "历史", "亚历山大大帝于公元前323年在巴比伦去世，享年32岁，死因可能是疾病或中毒。"),
            es = LocalizedContent("¿En qué año murió Alejandro Magno?", listOf("326 a.C.", "323 a.C.", "320 a.C.", "310 a.C."), "Historia", "Alejandro Magno murió en el 323 a.C. en Babilonia, probablemente por enfermedad o envenenamiento, a los 32 años.")
        ),
        BilingualQuestion(
            id = 9190, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel est le plus long règne d'un monarque?", listOf("Louis XIV", "Édouard III", "Georges III", "Victoria"), "Histoire", "Louis XIV a régné 72 ans, de 1643 à 1715, ce qui constitue le plus long règne d'un monarque dans l'histoire européenne."),
            en = LocalizedContent("What is the longest reign of a monarch?", listOf("Louis XIV", "Edward III", "George III", "Victoria"), "History", "Louis XIV reigned for 72 years, from 1643 to 1715, which constitutes the longest reign of a monarch in European history."),
            zh = LocalizedContent("哪位君主的统治时间最长？", listOf("路易十四", "爱德华三世", "乔治三世", "维多利亚"), "历史", "路易十四在位72年，从1643年到1715年，是欧洲历史上统治时间最长的君主。"),
            es = LocalizedContent("¿Cuál es el reinado más largo de un monarca?", listOf("Luis XIV", "Eduardo III", "Jorge III", "Victoria"), "Historia", "Luis XIV reinó 72 años, de 1643 a 1715, lo que constituye el reinado más largo de un monarca en la historia europea.")
        ),
        BilingualQuestion(
            id = 9191, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année Louis XIV a-t-il pris le pouvoir?", listOf("1643", "1654", "1661", "1672"), "Histoire", "Louis XIV a pris le pouvoir en 1661 après la mort du cardinal Mazarin, mettant fin à la régence et instaurant son règne personnel sans Premier ministre."),
            en = LocalizedContent("In which year did Louis XIV take power?", listOf("1643", "1654", "1661", "1672"), "History", "Louis XIV took power in 1661 after the death of Cardinal Mazarin, ending the regency and establishing his personal rule without a prime minister."),
            zh = LocalizedContent("路易十四在哪一年掌权？", listOf("1643", "1654", "1661", "1672"), "历史", "路易十四于1661年红衣主教马扎然去世后掌权，结束了摄政期，开始了没有首相的个人统治。"),
            es = LocalizedContent("¿En qué año tomó el poder Luis XIV?", listOf("1643", "1654", "1661", "1672"), "Historia", "Luis XIV tomó el poder en 1661 tras la muerte del cardenal Mazarino, poniendo fin a la regencia e instaurando su reinado personal sin primer ministro.")
        ),
        BilingualQuestion(
            id = 9192, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien d'années Louis XIV a-t-il régné?", listOf("54", "62", "72", "82"), "Histoire", "Louis XIV a régné 72 ans, de 1643 à 1715, ce qui constitue le plus long règne de l'histoire de France."),
            en = LocalizedContent("How many years did Louis XIV reign?", listOf("54", "62", "72", "82"), "History", "Louis XIV reigned for 72 years, from 1643 to 1715, which is the longest reign in French history."),
            zh = LocalizedContent("路易十四统治了多少年？", listOf("54", "62", "72", "82"), "历史", "路易十四在位72年，从1643年到1715年，是法国历史上最长的统治。"),
            es = LocalizedContent("¿Cuántos años reinó Luis XIV?", listOf("54", "62", "72", "82"), "Historia", "Luis XIV reinó 72 años, de 1643 a 1715, lo que constituye el reinado más largo de la historia de Francia.")
        ),
        BilingualQuestion(
            id = 9193, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel était le surnom de Louis XIV?", listOf("Le Roi sage", "Le Roi Soleil", "Le Roi guerrier", "Le Roi bâtisseur"), "Histoire", "Louis XIV a choisi le soleil comme emblème pour symboliser son pouvoir absolu et sa centralité dans l'État, évoquant l'astre qui éclaire et régit tout."),
            en = LocalizedContent("What was the nickname of Louis XIV?", listOf("The Wise King", "The Sun King", "The Warrior King", "The Builder King"), "History", "Louis XIV chose the sun as his emblem to symbolize his absolute power and centrality in the state, evoking the star that illuminates and governs everything."),
            zh = LocalizedContent("路易十四的绰号是什么？", listOf("贤王", "太阳王", "战士王", "建筑王"), "历史", "路易十四选择太阳作为象征，以体现他的绝对权力和国家中心地位，寓意照亮并统治一切的星辰。"),
            es = LocalizedContent("¿Cuál era el apodo de Luis XIV?", listOf("El Rey Sabio", "El Rey Sol", "El Rey Guerrero", "El Rey Constructor"), "Historia", "Luis XIV eligió el sol como emblema para simbolizar su poder absoluto y su centralidad en el Estado, evocando el astro que ilumina y rige todo.")
        ),
        BilingualQuestion(
            id = 9194, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année Louis XIV a-t-il commencé la construction de Versailles?", listOf("1661", "1668", "1672", "1680"), "Histoire", "Louis XIV transforma le pavillon de chasse de son père en palais à partir de 1668, marquant le début des grands travaux de Versailles qui durèrent plusieurs décennies."),
            en = LocalizedContent("In which year did Louis XIV begin the construction of Versailles?", listOf("1661", "1668", "1672", "1680"), "History", "Louis XIV transformed his father's hunting lodge into a palace starting in 1668, marking the beginning of the great works of Versailles that lasted several decades."),
            zh = LocalizedContent("路易十四在哪一年开始建造凡尔赛宫？", listOf("1661", "1668", "1672", "1680"), "历史", "路易十四从1668年开始将他父亲的狩猎行宫改造成宫殿，标志着凡尔赛宫大规模工程的开始，持续了数十年。"),
            es = LocalizedContent("¿En qué año comenzó Luis XIV la construcción de Versalles?", listOf("1661", "1668", "1672", "1680"), "Historia", "Luis XIV transformó el pabellón de caza de su padre en palacio a partir de 1668, marcando el inicio de las grandes obras de Versalles que duraron varias décadas.")
        ),
        BilingualQuestion(
            id = 9195, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année la Cour royale a-t-elle déménagé à Versailles?", listOf("1680", "1682", "1685", "1690"), "Histoire", "Louis XIV installa définitivement la Cour et le gouvernement à Versailles en 1682, afin de contrôler la noblesse et d'affirmer son pouvoir absolu."),
            en = LocalizedContent("In which year did the royal court move to Versailles?", listOf("1680", "1682", "1685", "1690"), "History", "Louis XIV permanently installed the Court and government at Versailles in 1682, in order to control the nobility and assert his absolute power."),
            zh = LocalizedContent("王室在哪一年迁至凡尔赛宫？", listOf("1680", "1682", "1685", "1690"), "历史", "路易十四于1682年将宫廷和政府永久迁至凡尔赛宫，以控制贵族并巩固其绝对权力。"),
            es = LocalizedContent("¿En qué año se trasladó la corte real a Versalles?", listOf("1680", "1682", "1685", "1690"), "Historia", "Luis XIV instaló definitivamente la Corte y el gobierno en Versalles en 1682, con el fin de controlar a la nobleza y afirmar su poder absoluto.")
        ),
        BilingualQuestion(
            id = 9196, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel était le ministre des finances de Louis XIV?", listOf("Colbert", "Louvois", "Le Tellier", "Richelieu"), "Histoire", "Jean-Baptiste Colbert fut le contrôleur général des finances de Louis XIV de 1665 à 1683, jouant un rôle clé dans le développement du mercantilisme et la modernisation de l'économie française."),
            en = LocalizedContent("Who was the finance minister of Louis XIV?", listOf("Colbert", "Louvois", "Le Tellier", "Richelieu"), "History", "Jean-Baptiste Colbert was the Controller-General of Finances of Louis XIV from 1665 to 1683, playing a key role in the development of mercantilism and the modernization of the French economy."),
            zh = LocalizedContent("路易十四的财政大臣是谁？", listOf("科尔贝", "卢瓦", "勒泰利耶", "黎塞留"), "历史", "让-巴蒂斯特·科尔贝于1665年至1683年担任路易十四的财政总监，在重商主义发展和法国经济现代化中发挥了关键作用。"),
            es = LocalizedContent("¿Quién fue el ministro de finanzas de Luis XIV?", listOf("Colbert", "Louvois", "Le Tellier", "Richelieu"), "Historia", "Jean-Baptiste Colbert fue el controlador general de finanzas de Luis XIV de 1665 a 1683, desempeñando un papel clave en el desarrollo del mercantilismo y la modernización de la economía francesa.")
        ),
        BilingualQuestion(
            id = 9197, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année la Guerre de Succession d'Espagne a-t-elle commencé?", listOf("1700", "1701", "1702", "1703"), "Histoire", "La guerre éclata en 1701 après la mort sans héritier de Charles II d'Espagne, provoquant un conflit européen pour le contrôle de son empire."),
            en = LocalizedContent("In which year did the War of the Spanish Succession begin?", listOf("1700", "1701", "1702", "1703"), "History", "The war broke out in 1701 after the death without heir of Charles II of Spain, triggering a European conflict for control of his empire."),
            zh = LocalizedContent("西班牙王位继承战争在哪一年开始？", listOf("1700", "1701", "1702", "1703"), "历史", "战争于1701年爆发，起因是西班牙国王卡洛斯二世无嗣去世，引发了欧洲列强对其帝国控制权的争夺。"),
            es = LocalizedContent("¿En qué año comenzó la Guerra de Sucesión Española?", listOf("1700", "1701", "1702", "1703"), "Historia", "La guerra estalló en 1701 tras la muerte sin heredero de Carlos II de España, provocando un conflicto europeo por el control de su imperio.")
        ),
        BilingualQuestion(
            id = 9198, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année la Guerre de Succession d'Espagne s'est-elle terminée?", listOf("1710", "1711", "1712", "1713"), "Histoire", "Le traité d'Utrecht, signé en 1713, mit fin à la Guerre de Succession d'Espagne en reconnaissant Philippe V comme roi d'Espagne tout en lui imposant la renonciation à ses droits sur le trône de France."),
            en = LocalizedContent("In which year did the War of the Spanish Succession end?", listOf("1710", "1711", "1712", "1713"), "History", "The Treaty of Utrecht, signed in 1713, ended the War of the Spanish Succession by recognizing Philip V as King of Spain while imposing his renunciation of rights to the French throne."),
            zh = LocalizedContent("西班牙王位继承战争在哪一年结束？", listOf("1710", "1711", "1712", "1713"), "历史", "1713年签署的《乌得勒支条约》结束了西班牙王位继承战争，承认腓力五世为西班牙国王，但要求他放弃对法国王位的继承权。"),
            es = LocalizedContent("¿En qué año terminó la Guerra de Sucesión Española?", listOf("1710", "1711", "1712", "1713"), "Historia", "El Tratado de Utrecht, firmado en 1713, puso fin a la Guerra de Sucesión Española al reconocer a Felipe V como rey de España, imponiéndole la renuncia a sus derechos sobre el trono francés.")
        ),
        BilingualQuestion(
            id = 9199, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel traité a mis fin à la Guerre de Succession d'Espagne?", listOf("Traité de Madrid", "Traité d'Utrecht", "Traité de Rastadt", "Traité de Nystad"), "Histoire", "Signé en 1713, le Traité d'Utrecht mit fin à la Guerre de Succession d'Espagne en reconnaissant Philippe V comme roi d'Espagne, tout en redistribuant les territoires européens pour maintenir l'équilibre des puissances."),
            en = LocalizedContent("Which treaty ended the War of the Spanish Succession?", listOf("Treaty of Madrid", "Treaty of Utrecht", "Treaty of Rastatt", "Treaty of Nystad"), "History", "Signed in 1713, the Treaty of Utrecht ended the War of the Spanish Succession by recognizing Philip V as King of Spain, while redistributing European territories to maintain the balance of power."),
            zh = LocalizedContent("哪项条约结束了西班牙王位继承战争？", listOf("马德里条约", "乌得勒支条约", "拉施塔特条约", "尼斯塔德条约"), "历史", "1713年签署的《乌得勒支条约》结束了西班牙王位继承战争，承认腓力五世为西班牙国王，同时重新分配欧洲领土以维持权力平衡。"),
            es = LocalizedContent("¿Qué tratado puso fin a la Guerra de Sucesión Española?", listOf("Tratado de Madrid", "Tratado de Utrecht", "Tratado de Rastatt", "Tratado de Nystad"), "Historia", "Firmado en 1713, el Tratado de Utrecht puso fin a la Guerra de Sucesión Española al reconocer a Felipe V como rey de España, redistribuyendo los territorios europeos para mantener el equilibrio de poder.")
        ),
        BilingualQuestion(
            id = 9200, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui a été le successeur de Louis XIV?", listOf("Louis XV", "Philippe d'Orléans", "Louis le Brun", "Le Regent"), "Histoire", "Louis XIV est mort en 1715 après 72 ans de règne. Son arrière-petit-fils, Louis XV, lui a succédé à l'âge de 5 ans, sous la régence de Philippe d'Orléans."),
            en = LocalizedContent("Who was the successor of Louis XIV?", listOf("Louis XV", "Philippe d'Orléans", "Louis le Brun", "Le Regent"), "History", "Louis XIV died in 1715 after a 72-year reign. His great-grandson, Louis XV, succeeded him at the age of 5, under the regency of Philippe d'Orléans."),
            zh = LocalizedContent("路易十四的继任者是谁？", listOf("路易十五", "菲利普·奥尔良", "路易·勒布朗", "摄政王"), "历史", "路易十四于1715年去世，在位72年。他的曾孙路易十五在5岁时继位，由菲利普·奥尔良摄政。"),
            es = LocalizedContent("¿Quién fue el sucesor de Luis XIV?", listOf("Luis XV", "Felipe de Orleans", "Luis el Brun", "El Regente"), "Historia", "Luis XIV murió en 1715 después de 72 años de reinado. Su bisnieto, Luis XV, le sucedió a los 5 años, bajo la regencia de Felipe de Orleans.")
        ),
        BilingualQuestion(
            id = 9201, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année Louis XV a-t-il pris le pouvoir?", listOf("1710", "1715", "1720", "1725"), "Histoire", "Louis XV devient roi à la mort de son arrière-grand-père Louis XIV en 1715, mais il ne gouverne effectivement qu'à partir de 1723, après la régence de Philippe d'Orléans."),
            en = LocalizedContent("In which year did Louis XV take power?", listOf("1710", "1715", "1720", "1725"), "History", "Louis XV became king upon the death of his great-grandfather Louis XIV in 1715, but he only effectively governed from 1723, after the regency of Philippe d'Orléans."),
            zh = LocalizedContent("路易十五在哪一年掌权？", listOf("1710", "1715", "1720", "1725"), "历史", "路易十五在其曾祖父路易十四于1715年去世后成为国王，但直到1723年菲利普·奥尔良摄政结束后才真正执政。"),
            es = LocalizedContent("¿En qué año tomó el poder Luis XV?", listOf("1710", "1715", "1720", "1725"), "Historia", "Luis XV se convirtió en rey a la muerte de su bisabuelo Luis XIV en 1715, pero no gobernó efectivamente hasta 1723, después de la regencia de Felipe de Orleans.")
        ),
        BilingualQuestion(
            id = 9202, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel était le surnom de Louis XV?", listOf("Le Bien-Aimé", "Le Sage", "Le Magnifique", "L'Aventureux"), "Histoire", "Louis XV reçut ce surnom après sa guérison miraculeuse d'une grave maladie à Metz en 1744, qui suscita un élan de ferveur populaire."),
            en = LocalizedContent("What was the nickname of Louis XV?", listOf("The Beloved", "The Wise", "The Magnificent", "The Adventurous"), "History", "Louis XV received this nickname after his miraculous recovery from a serious illness in Metz in 1744, which sparked a wave of popular fervor."),
            zh = LocalizedContent("路易十五的绰号是什么？", listOf("受爱戴者", "智者", "辉煌者", "冒险者"), "历史", "路易十五在1744年于梅斯奇迹般地从重病中康复后获得了这个绰号，引发了民众的热情。"),
            es = LocalizedContent("¿Cuál era el apodo de Luis XV?", listOf("El Bienamado", "El Sabio", "El Magnífico", "El Aventurero"), "Historia", "Luis XV recibió este apodo tras su milagrosa recuperación de una grave enfermedad en Metz en 1744, que provocó una oleada de fervor popular.")
        ),
        BilingualQuestion(
            id = 9203, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année la Guerre de Sept Ans a-t-elle commencé?", listOf("1754", "1756", "1758", "1759"), "Histoire", "La guerre de Sept Ans, qui opposa la France et l'Autriche à la Prusse et la Grande-Bretagne, débuta officiellement en 1756 après des affrontements coloniaux en Amérique du Nord dès 1754."),
            en = LocalizedContent("In which year did the Seven Years' War begin?", listOf("1754", "1756", "1758", "1759"), "History", "The Seven Years' War, which pitted France and Austria against Prussia and Great Britain, officially began in 1756 after colonial clashes in North America as early as 1754."),
            zh = LocalizedContent("七年战争在哪一年开始？", listOf("1754", "1756", "1758", "1759"), "历史", "七年战争是法国和奥地利对抗普鲁士和英国的战争，正式始于1756年，但早在1754年北美殖民地就已发生冲突。"),
            es = LocalizedContent("¿En qué año comenzó la Guerra de los Siete Años?", listOf("1754", "1756", "1758", "1759"), "Historia", "La Guerra de los Siete Años, que enfrentó a Francia y Austria contra Prusia y Gran Bretaña, comenzó oficialmente en 1756 tras enfrentamientos coloniales en América del Norte desde 1754.")
        ),
        BilingualQuestion(
            id = 9204, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année la Guerre de Sept Ans s'est-elle terminée?", listOf("1760", "1761", "1762", "1763"), "Histoire", "Le traité de Paris, signé le 10 février 1763, mit fin à la guerre de Sept Ans entre la France et la Grande-Bretagne, redessinant les colonies nord-américaines."),
            en = LocalizedContent("In which year did the Seven Years' War end?", listOf("1760", "1761", "1762", "1763"), "History", "The Treaty of Paris, signed on February 10, 1763, ended the Seven Years' War between France and Great Britain, redrawing the North American colonies."),
            zh = LocalizedContent("七年战争在哪一年结束？", listOf("1760", "1761", "1762", "1763"), "历史", "1763年2月10日签署的《巴黎条约》结束了法国和英国之间的七年战争，重新划分了北美殖民地。"),
            es = LocalizedContent("¿En qué año terminó la Guerra de los Siete Años?", listOf("1760", "1761", "1762", "1763"), "Historia", "El Tratado de París, firmado el 10 de febrero de 1763, puso fin a la Guerra de los Siete Años entre Francia y Gran Bretaña, redibujando las colonias norteamericanas.")
        ),
        BilingualQuestion(
            id = 9205, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel traité a mis fin à la Guerre de Sept Ans?", listOf("Traité de Hubertusburg", "Traité de Paris", "Traité d'Hubertusbourg", "Les deux A et B"), "Histoire", "Le traité de Paris (1763) et le traité d'Hubertsbourg (1763) ont tous deux mis fin à la Guerre de Sept Ans, le premier entre la France, l'Espagne et la Grande-Bretagne, le second entre la Prusse et l'Autriche."),
            en = LocalizedContent("Which treaty ended the Seven Years' War?", listOf("Treaty of Hubertusburg", "Treaty of Paris", "Treaty of Hubertusbourg", "Both A and B"), "History", "The Treaty of Paris (1763) and the Treaty of Hubertusburg (1763) both ended the Seven Years' War, the first between France, Spain, and Great Britain, the second between Prussia and Austria."),
            zh = LocalizedContent("哪个条约结束了七年战争？", listOf("胡贝图斯堡条约", "巴黎条约", "胡贝图斯堡条约", "A和B都对"), "历史", "《巴黎条约》（1763年）和《胡贝图斯堡条约》（1763年）都结束了七年战争，前者在法国、西班牙和英国之间，后者在普鲁士和奥地利之间。"),
            es = LocalizedContent("¿Qué tratado puso fin a la Guerra de los Siete Años?", listOf("Tratado de Hubertusburgo", "Tratado de París", "Tratado de Hubertusburgo", "Ambos A y B"), "Historia", "El Tratado de París (1763) y el Tratado de Hubertusburgo (1763) pusieron fin a la Guerra de los Siete Años, el primero entre Francia, España y Gran Bretaña, el segundo entre Prusia y Austria.")
        ),
        BilingualQuestion(
            id = 9206, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui était le principal adversaire de la France pendant la Guerre de Sept Ans?", listOf("La Prusse", "L'Autriche", "La Grande-Bretagne", "La Russie"), "Histoire", "La Guerre de Sept Ans (1756-1763) opposa principalement la France et la Grande-Bretagne pour la domination coloniale et maritime."),
            en = LocalizedContent("Who was France's main adversary during the Seven Years' War?", listOf("Prussia", "Austria", "Great Britain", "Russia"), "History", "The Seven Years' War (1756-1763) primarily pitted France against Great Britain for colonial and maritime dominance."),
            zh = LocalizedContent("七年战争期间法国的主要对手是谁？", listOf("普鲁士", "奥地利", "英国", "俄罗斯"), "历史", "七年战争（1756-1763）主要是法国和英国争夺殖民地和海上霸权的战争。"),
            es = LocalizedContent("¿Quién fue el principal adversario de Francia durante la Guerra de los Siete Años?", listOf("Prusia", "Austria", "Gran Bretaña", "Rusia"), "Historia", "La Guerra de los Siete Años (1756-1763) enfrentó principalmente a Francia y Gran Bretaña por el dominio colonial y marítimo.")
        ),
        BilingualQuestion(
            id = 9207, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel roi prussien a dominé la Guerre de Sept Ans?", listOf("Frédéric Ier", "Frédéric II", "Frédéric III", "Frédéric IV"), "Histoire", "Frédéric II, dit le Grand, a mené la Prusse durant la guerre de Sept Ans (1756-1763), affrontant avec succès une coalition européenne malgré des ressources limitées."),
            en = LocalizedContent("Which Prussian king dominated the Seven Years' War?", listOf("Frederick I", "Frederick II", "Frederick III", "Frederick IV"), "History", "Frederick II, known as Frederick the Great, led Prussia during the Seven Years' War (1756-1763), successfully facing a European coalition despite limited resources."),
            zh = LocalizedContent("哪位普鲁士国王主导了七年战争？", listOf("腓特烈一世", "腓特烈二世", "腓特烈三世", "腓特烈四世"), "历史", "腓特烈二世，即腓特烈大帝，在七年战争（1756-1763）中领导普鲁士，尽管资源有限，仍成功对抗了欧洲联盟。"),
            es = LocalizedContent("¿Qué rey prusiano dominó la Guerra de los Siete Años?", listOf("Federico I", "Federico II", "Federico III", "Federico IV"), "Historia", "Federico II, conocido como Federico el Grande, lideró Prusia durante la Guerra de los Siete Años (1756-1763), enfrentando con éxito una coalición europea a pesar de los recursos limitados.")
        ),
        BilingualQuestion(
            id = 9208, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année Frédéric II a-t-il pris le pouvoir?", listOf("1730", "1740", "1745", "1750"), "Histoire", "Frédéric II de Prusse, dit Frédéric le Grand, accède au trône en 1740 à la mort de son père Frédéric-Guillaume Ier."),
            en = LocalizedContent("In which year did Frederick II take power?", listOf("1730", "1740", "1745", "1750"), "History", "Frederick II of Prussia, known as Frederick the Great, ascended the throne in 1740 upon the death of his father Frederick William I."),
            zh = LocalizedContent("腓特烈二世在哪一年掌权？", listOf("1730", "1740", "1745", "1750"), "历史", "普鲁士的腓特烈二世，即腓特烈大帝，在其父腓特烈·威廉一世去世后于1740年即位。"),
            es = LocalizedContent("¿En qué año tomó el poder Federico II?", listOf("1730", "1740", "1745", "1750"), "Historia", "Federico II de Prusia, conocido como Federico el Grande, accedió al trono en 1740 tras la muerte de su padre Federico Guillermo I.")
        ),
        BilingualQuestion(
            id = 9209, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel était le surnom de Frédéric II?", listOf("Frédéric le Sage", "Frédéric le Grand", "Frédéric le Magnifique", "Frédéric le Bâtisseur"), "Histoire", "Frédéric II, roi de Prusse de 1740 à 1786, fut surnommé Frédéric le Grand en raison de ses réformes éclairées et de ses victoires militaires, notamment pendant la guerre de Sept Ans."),
            en = LocalizedContent("What was the nickname of Frederick II?", listOf("Frederick the Wise", "Frederick the Great", "Frederick the Magnificent", "Frederick the Builder"), "History", "Frederick II, King of Prussia from 1740 to 1786, was nicknamed Frederick the Great due to his enlightened reforms and military victories, especially during the Seven Years' War."),
            zh = LocalizedContent("腓特烈二世的绰号是什么？", listOf("腓特烈智者", "腓特烈大帝", "腓特烈辉煌者", "腓特烈建造者"), "历史", "腓特烈二世，1740年至1786年的普鲁士国王，因其开明改革和军事胜利，特别是在七年战争中的表现，被称为腓特烈大帝。"),
            es = LocalizedContent("¿Cuál era el apodo de Federico II?", listOf("Federico el Sabio", "Federico el Grande", "Federico el Magnífico", "Federico el Constructor"), "Historia", "Federico II, rey de Prusia de 1740 a 1786, fue apodado Federico el Grande debido a sus reformas ilustradas y victorias militares, especialmente durante la Guerra de los Siete Años.")
        ),
        BilingualQuestion(
            id = 9210, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année la Révolution française a-t-elle pris fin?", listOf("1793", "1794", "1799", "1804"), "Histoire", "La Révolution française s'achève en 1799 avec le coup d'État du 18 Brumaire, qui porte Napoléon Bonaparte au pouvoir et instaure le Consulat."),
            en = LocalizedContent("In which year did the French Revolution end?", listOf("1793", "1794", "1799", "1804"), "History", "The French Revolution ended in 1799 with the coup of 18 Brumaire, which brought Napoleon Bonaparte to power and established the Consulate."),
            zh = LocalizedContent("法国大革命在哪一年结束？", listOf("1793", "1794", "1799", "1804"), "历史", "法国大革命于1799年结束，雾月18日政变使拿破仑·波拿巴上台，建立了执政府。"),
            es = LocalizedContent("¿En qué año terminó la Revolución Francesa?", listOf("1793", "1794", "1799", "1804"), "Historia", "La Revolución Francesa terminó en 1799 con el golpe de Estado del 18 de Brumario, que llevó a Napoleón Bonaparte al poder e instauró el Consulado.")
        ),
        BilingualQuestion(
            id = 9211, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel événement a marqué la fin de la Révolution française?", listOf("L'exécution du roi", "Le Thermidor", "Le Coup d'État de Napoléon", "L'établissement du Consulat"), "Histoire", "Le 9 novembre 1799, Napoléon Bonaparte renverse le Directoire par un coup d'État, mettant fin à la Révolution française et instaurant le Consulat."),
            en = LocalizedContent("Which event marked the end of the French Revolution?", listOf("The execution of the king", "Thermidor", "Napoleon's coup d'état", "The establishment of the Consulate"), "History", "On November 9, 1799, Napoleon Bonaparte overthrew the Directory in a coup d'état, ending the French Revolution and establishing the Consulate."),
            zh = LocalizedContent("哪个事件标志着法国大革命的结束？", listOf("处决国王", "热月政变", "拿破仑政变", "建立执政府"), "历史", "1799年11月9日，拿破仑·波拿巴通过政变推翻了督政府，结束了法国大革命，建立了执政府。"),
            es = LocalizedContent("¿Qué evento marcó el fin de la Revolución Francesa?", listOf("La ejecución del rey", "Termidor", "El golpe de Estado de Napoleón", "El establecimiento del Consulado"), "Historia", "El 9 de noviembre de 1799, Napoleón Bonaparte derrocó al Directorio mediante un golpe de Estado, poniendo fin a la Revolución Francesa e instaurando el Consulado.")
        ),
        BilingualQuestion(
            id = 9212, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année Robespierre a-t-il établi la Terreur?", listOf("1791", "1792", "1793", "1794"), "Histoire", "La Terreur est instaurée par le Comité de salut public dirigé par Robespierre en septembre 1793, marquant une période de répression politique intense pendant la Révolution française."),
            en = LocalizedContent("In which year did Robespierre establish the Reign of Terror?", listOf("1791", "1792", "1793", "1794"), "History", "The Reign of Terror was instituted by the Committee of Public Safety led by Robespierre in September 1793, marking a period of intense political repression during the French Revolution."),
            zh = LocalizedContent("罗伯斯庇尔在哪一年建立了恐怖统治？", listOf("1791", "1792", "1793", "1794"), "历史", "恐怖统治由罗伯斯庇尔领导的公共安全委员会于1793年9月建立，标志着法国大革命期间一段激烈的政治镇压时期。"),
            es = LocalizedContent("¿En qué año estableció Robespierre el Reinado del Terror?", listOf("1791", "1792", "1793", "1794"), "Historia", "El Reinado del Terror fue instaurado por el Comité de Salvación Pública dirigido por Robespierre en septiembre de 1793, marcando un período de intensa represión política durante la Revolución Francesa.")
        ),
        BilingualQuestion(
            id = 9213, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année le Thermidor s'est-il produit?", listOf("1792", "1793", "1794", "1795"), "Histoire", "Le 9 Thermidor an II (27 juillet 1794) marque la chute de Robespierre et la fin de la Terreur, événement clé de la Révolution française."),
            en = LocalizedContent("In which year did Thermidor occur?", listOf("1792", "1793", "1794", "1795"), "History", "The 9th of Thermidor, Year II (July 27, 1794) marked the fall of Robespierre and the end of the Reign of Terror, a key event of the French Revolution."),
            zh = LocalizedContent("热月政变发生在哪一年？", listOf("1792", "1793", "1794", "1795"), "历史", "共和二年热月9日（1794年7月27日）标志着罗伯斯庇尔的倒台和恐怖统治的结束，这是法国大革命的关键事件。"),
            es = LocalizedContent("¿En qué año ocurrió Termidor?", listOf("1792", "1793", "1794", "1795"), "Historia", "El 9 de Termidor del año II (27 de julio de 1794) marcó la caída de Robespierre y el fin del Reinado del Terror, un evento clave de la Revolución Francesa.")
        ),
        BilingualQuestion(
            id = 9214, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a renversé Robespierre lors du Thermidor?", listOf("Danton", "Desmoulins", "Tallien", "Fréron"), "Histoire", "Tallien, député montagnard, organisa la chute de Robespierre le 9 Thermidor an II (27 juillet 1794) pour mettre fin à la Terreur et sauver sa propre tête."),
            en = LocalizedContent("Who overthrew Robespierre during Thermidor?", listOf("Danton", "Desmoulins", "Tallien", "Fréron"), "History", "Tallien, a Montagnard deputy, organized the fall of Robespierre on 9 Thermidor Year II (July 27, 1794) to end the Reign of Terror and save his own life."),
            zh = LocalizedContent("谁在热月政变中推翻了罗伯斯庇尔？", listOf("丹东", "德穆兰", "塔利安", "弗雷隆"), "历史", "塔利安，一位山岳派代表，在共和二年热月9日（1794年7月27日）组织了罗伯斯庇尔的倒台，以结束恐怖统治并保全自己的性命。"),
            es = LocalizedContent("¿Quién derrocó a Robespierre durante Termidor?", listOf("Danton", "Desmoulins", "Tallien", "Fréron"), "Historia", "Tallien, diputado montañés, organizó la caída de Robespierre el 9 de Termidor del año II (27 de julio de 1794) para poner fin al Reinado del Terror y salvar su propia vida.")
        ),
        BilingualQuestion(
            id = 9215, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année la Constitution de 1795 a-t-elle été adoptée?", listOf("1793", "1794", "1795", "1796"), "Histoire", "Adoptée le 22 août 1795, cette Constitution établit le Directoire, un régime qui succède à la Terreur et marque la fin de la Convention nationale."),
            en = LocalizedContent("In which year was the Constitution of 1795 adopted?", listOf("1793", "1794", "1795", "1796"), "History", "Adopted on August 22, 1795, this Constitution established the Directory, a regime that succeeded the Reign of Terror and marked the end of the National Convention."),
            zh = LocalizedContent("1795年宪法在哪一年通过？", listOf("1793", "1794", "1795", "1796"), "历史", "该宪法于1795年8月22日通过，建立了督政府，这一政权接替了恐怖统治，标志着国民公会的结束。"),
            es = LocalizedContent("¿En qué año se adoptó la Constitución de 1795?", listOf("1793", "1794", "1795", "1796"), "Historia", "Adoptada el 22 de agosto de 1795, esta Constitución estableció el Directorio, un régimen que sucedió al Reinado del Terror y marcó el fin de la Convención Nacional.")
        ),
        BilingualQuestion(
            id = 9216, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel était le nom du gouvernement établi en 1795?", listOf("Le Directoire", "Le Consulat", "L'Assemblée nationale", "La Convention"), "Histoire", "Le Directoire est le régime politique qui a dirigé la France de 1795 à 1799, succédant à la Convention nationale et précédant le Consulat de Napoléon Bonaparte."),
            en = LocalizedContent("What was the name of the government established in 1795?", listOf("The Directory", "The Consulate", "The National Assembly", "The Convention"), "History", "The Directory was the political regime that governed France from 1795 to 1799, succeeding the National Convention and preceding Napoleon Bonaparte's Consulate."),
            zh = LocalizedContent("1795年建立的政府名称是什么？", listOf("督政府", "执政府", "国民议会", "国民公会"), "历史", "督政府是1795年至1799年统治法国的政治体制，接替国民公会，并先于拿破仑·波拿巴的执政府。"),
            es = LocalizedContent("¿Cuál era el nombre del gobierno establecido en 1795?", listOf("El Directorio", "El Consulado", "La Asamblea Nacional", "La Convención"), "Historia", "El Directorio fue el régimen político que gobernó Francia de 1795 a 1799, sucediendo a la Convención Nacional y precediendo al Consulado de Napoleón Bonaparte.")
        ),
        BilingualQuestion(
            id = 9217, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année Napoléon a-t-il renversé le Directoire?", listOf("1797", "1798", "1799", "1800"), "Histoire", "Le coup d'État du 18 Brumaire, qui mit fin au Directoire, eut lieu en novembre 1799. Napoléon Bonaparte y instaura le Consulat, dont il devint Premier consul."),
            en = LocalizedContent("In which year did Napoleon overthrow the Directory?", listOf("1797", "1798", "1799", "1800"), "History", "The coup of 18 Brumaire, which ended the Directory, took place in November 1799. Napoleon Bonaparte established the Consulate, becoming First Consul."),
            zh = LocalizedContent("拿破仑在哪一年推翻了督政府？", listOf("1797", "1798", "1799", "1800"), "历史", "雾月18日政变结束了督政府，发生在1799年11月。拿破仑·波拿巴建立了执政府，成为第一执政。"),
            es = LocalizedContent("¿En qué año derrocó Napoleón al Directorio?", listOf("1797", "1798", "1799", "1800"), "Historia", "El golpe de Estado del 18 de Brumario, que puso fin al Directorio, tuvo lugar en noviembre de 1799. Napoleón Bonaparte instauró el Consulado, del que se convirtió en Primer Cónsul.")
        ),
        BilingualQuestion(
            id = 9218, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel coup d'État Napoléon a-t-il organisé?", listOf("Le coup d'État du 18 Brumaire", "Le coup d'État du 9 Thermidor", "Le coup d'État du 14 juillet", "Le coup d'État du 10 août"), "Histoire", "Le 18 Brumaire an VIII (9 novembre 1799), Napoléon Bonaparte renverse le Directoire par un coup d'État, instaurant le Consulat dont il devient Premier consul."),
            en = LocalizedContent("Which coup d'état did Napoleon organize?", listOf("The coup of 18 Brumaire", "The coup of 9 Thermidor", "The coup of July 14", "The coup of August 10"), "History", "On 18 Brumaire, Year VIII (November 9, 1799), Napoleon Bonaparte overthrew the Directory in a coup d'état, establishing the Consulate and becoming First Consul."),
            zh = LocalizedContent("拿破仑组织了哪次政变？", listOf("雾月18日政变", "热月9日政变", "7月14日政变", "8月10日政变"), "历史", "共和八年雾月18日（1799年11月9日），拿破仑·波拿巴通过政变推翻了督政府，建立了执政府，并成为第一执政。"),
            es = LocalizedContent("¿Qué golpe de Estado organizó Napoleón?", listOf("El golpe del 18 de Brumario", "El golpe del 9 de Termidor", "El golpe del 14 de julio", "El golpe del 10 de agosto"), "Historia", "El 18 de Brumario del año VIII (9 de noviembre de 1799), Napoleón Bonaparte derrocó al Directorio mediante un golpe de Estado, instaurando el Consulado y convirtiéndose en Primer Cónsul.")
        ),
        BilingualQuestion(
            id = 9219, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année Napoléon a-t-il établi le Consulat?", listOf("1798", "1799", "1800", "1801"), "Histoire", "Le coup d'État du 18 Brumaire an VIII (9 novembre 1799) renversa le Directoire et permit à Napoléon Bonaparte de prendre le pouvoir en instaurant le Consulat, dont il devint Premier consul."),
            en = LocalizedContent("In which year did Napoleon establish the Consulate?", listOf("1798", "1799", "1800", "1801"), "History", "The coup of 18 Brumaire, Year VIII (November 9, 1799) overthrew the Directory and allowed Napoleon Bonaparte to take power by establishing the Consulate, of which he became First Consul."),
            zh = LocalizedContent("拿破仑在哪一年建立了执政府？", listOf("1798", "1799", "1800", "1801"), "历史", "共和八年雾月18日（1799年11月9日）的政变推翻了督政府，使拿破仑·波拿巴得以掌权，建立了执政府，并成为第一执政。"),
            es = LocalizedContent("¿En qué año estableció Napoleón el Consulado?", listOf("1798", "1799", "1800", "1801"), "Historia", "El golpe de Estado del 18 de Brumario del año VIII (9 de noviembre de 1799) derrocó al Directorio y permitió a Napoleón Bonaparte tomar el poder instaurando el Consulado, del que se convirtió en Primer Cónsul.")
        ),
        BilingualQuestion(
            id = 9220, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année Napoléon a-t-il remporté la Bataille de Marengo?", listOf("1798", "1799", "1800", "1801"), "Histoire", "Cette bataille décisive de la deuxième campagne d'Italie eut lieu le 14 juin 1800 et permit à Napoléon de consolider son pouvoir après son retour d'Égypte."),
            en = LocalizedContent("In which year did Napoleon win the Battle of Marengo?", listOf("1798", "1799", "1800", "1801"), "History", "This decisive battle of the second Italian campaign took place on June 14, 1800, and allowed Napoleon to consolidate his power after his return from Egypt."),
            zh = LocalizedContent("拿破仑在哪一年赢得了马伦戈战役？", listOf("1798", "1799", "1800", "1801"), "历史", "这场第二次意大利战役的决定性战斗发生于1800年6月14日，使拿破仑在从埃及返回后巩固了权力。"),
            es = LocalizedContent("¿En qué año ganó Napoleón la Batalla de Marengo?", listOf("1798", "1799", "1800", "1801"), "Historia", "Esta batalla decisiva de la segunda campaña italiana tuvo lugar el 14 de junio de 1800 y permitió a Napoleón consolidar su poder tras su regreso de Egipto.")
        ),
        BilingualQuestion(
            id = 9221, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année la Bataille de Austerlitz s'est-elle déroulée?", listOf("1804", "1805", "1806", "1807"), "Histoire", "La bataille d'Austerlitz, aussi appelée bataille des Trois Empereurs, a eu lieu le 2 décembre 1805 et oppose la Grande Armée de Napoléon Ier aux armées russe et autrichienne."),
            en = LocalizedContent("In which year did the Battle of Austerlitz take place?", listOf("1804", "1805", "1806", "1807"), "History", "The Battle of Austerlitz, also known as the Battle of the Three Emperors, took place on December 2, 1805, and pitted Napoleon's Grande Armée against the Russian and Austrian armies."),
            zh = LocalizedContent("奥斯特里茨战役发生在哪一年？", listOf("1804", "1805", "1806", "1807"), "历史", "奥斯特里茨战役，又称三皇之战，发生于1805年12月2日，拿破仑的大军团与俄奥联军交战。"),
            es = LocalizedContent("¿En qué año tuvo lugar la Batalla de Austerlitz?", listOf("1804", "1805", "1806", "1807"), "Historia", "La Batalla de Austerlitz, también conocida como la Batalla de los Tres Emperadores, tuvo lugar el 2 de diciembre de 1805 y enfrentó a la Grande Armée de Napoleón contra los ejércitos ruso y austriaco.")
        ),
        BilingualQuestion(
            id = 9222, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année la Bataille de Iéna s'est-elle déroulée?", listOf("1804", "1805", "1806", "1807"), "Histoire", "La bataille de Iéna a eu lieu le 14 octobre 1806, opposant la Grande Armée de Napoléon Ier aux forces prussiennes, et se soldant par une victoire française décisive."),
            en = LocalizedContent("In which year did the Battle of Jena take place?", listOf("1804", "1805", "1806", "1807"), "History", "The Battle of Jena took place on October 14, 1806, pitting Napoleon's Grande Armée against Prussian forces, resulting in a decisive French victory."),
            zh = LocalizedContent("耶拿战役发生在哪一年？", listOf("1804", "1805", "1806", "1807"), "历史", "耶拿战役发生于1806年10月14日，拿破仑的大军团与普鲁士军队交战，法军取得决定性胜利。"),
            es = LocalizedContent("¿En qué año tuvo lugar la Batalla de Jena?", listOf("1804", "1805", "1806", "1807"), "Historia", "La Batalla de Jena tuvo lugar el 14 de octubre de 1806, enfrentando a la Grande Armée de Napoleón contra las fuerzas prusianas, resultando en una victoria francesa decisiva.")
        ),
        BilingualQuestion(
            id = 9223, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année la Bataille d'Eylau s'est-elle déroulée?", listOf("1805", "1806", "1807", "1808"), "Histoire", "La bataille d'Eylau opposa la Grande Armée de Napoléon Ier aux forces russo-prussiennes en Prusse-Orientale, et se déroula les 7 et 8 février 1807."),
            en = LocalizedContent("In which year did the Battle of Eylau take place?", listOf("1805", "1806", "1807", "1808"), "History", "The Battle of Eylau pitted Napoleon's Grande Armée against Russo-Prussian forces in East Prussia, taking place on February 7-8, 1807."),
            zh = LocalizedContent("埃劳战役发生在哪一年？", listOf("1805", "1806", "1807", "1808"), "历史", "埃劳战役中拿破仑的大军团在东普鲁士与俄普联军交战，发生于1807年2月7日至8日。"),
            es = LocalizedContent("¿En qué año tuvo lugar la Batalla de Eylau?", listOf("1805", "1806", "1807", "1808"), "Historia", "La Batalla de Eylau enfrentó a la Grande Armée de Napoleón contra las fuerzas ruso-prusianas en Prusia Oriental, teniendo lugar los días 7 y 8 de febrero de 1807.")
        ),
        BilingualQuestion(
            id = 9224, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année le Traité de Tilsit a-t-il été signé?", listOf("1805", "1806", "1807", "1808"), "Histoire", "Le Traité de Tilsit fut signé en 1807 entre Napoléon Ier et le tsar Alexandre Ier, mettant fin à la guerre de la Quatrième Coalition."),
            en = LocalizedContent("In which year was the Treaty of Tilsit signed?", listOf("1805", "1806", "1807", "1808"), "History", "The Treaty of Tilsit was signed in 1807 between Napoleon I and Tsar Alexander I, ending the War of the Fourth Coalition."),
            zh = LocalizedContent("提尔西特条约在哪一年签署？", listOf("1805", "1806", "1807", "1808"), "历史", "提尔西特条约于1807年由拿破仑一世和沙皇亚历山大一世签署，结束了第四次反法同盟战争。"),
            es = LocalizedContent("¿En qué año se firmó el Tratado de Tilsit?", listOf("1805", "1806", "1807", "1808"), "Historia", "El Tratado de Tilsit fue firmado en 1807 entre Napoleón I y el zar Alejandro I, poniendo fin a la Guerra de la Cuarta Coalición.")
        ),
        BilingualQuestion(
            id = 9225, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année le Blocus continental a-t-il été établi?", listOf("1805", "1806", "1807", "1808"), "Histoire", "Napoléon Ier instaure le Blocus continental par le décret de Berlin le 21 novembre 1806, mais il est effectivement mis en œuvre à partir de 1807."),
            en = LocalizedContent("In which year was the Continental Blockade established?", listOf("1805", "1806", "1807", "1808"), "History", "Napoleon I established the Continental Blockade by the Berlin Decree on November 21, 1806, but it was effectively implemented from 1807."),
            zh = LocalizedContent("大陆封锁体系在哪一年建立？", listOf("1805", "1806", "1807", "1808"), "历史", "拿破仑一世于1806年11月21日通过柏林敕令建立大陆封锁体系，但实际实施从1807年开始。"),
            es = LocalizedContent("¿En qué año se estableció el Bloqueo Continental?", listOf("1805", "1806", "1807", "1808"), "Historia", "Napoleón I estableció el Bloqueo Continental mediante el Decreto de Berlín el 21 de noviembre de 1806, pero se implementó efectivamente a partir de 1807.")
        ),
        BilingualQuestion(
            id = 9226, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année la Campagne d'Égypte a-t-elle commencé?", listOf("1796", "1797", "1798", "1799"), "Histoire", "La campagne d'Égypte est une expédition militaire menée par Napoléon Bonaparte à partir de 1798, visant à menacer les intérêts britanniques en Orient."),
            en = LocalizedContent("In which year did the Egyptian Campaign begin?", listOf("1796", "1797", "1798", "1799"), "History", "The Egyptian Campaign was a military expedition led by Napoleon Bonaparte starting in 1798, aimed at threatening British interests in the Orient."),
            zh = LocalizedContent("埃及战役在哪一年开始？", listOf("1796", "1797", "1798", "1799"), "历史", "埃及战役是拿破仑·波拿巴从1798年开始领导的一次军事远征，旨在威胁英国在东方的利益。"),
            es = LocalizedContent("¿En qué año comenzó la Campaña de Egipto?", listOf("1796", "1797", "1798", "1799"), "Historia", "La Campaña de Egipto fue una expedición militar liderada por Napoleón Bonaparte a partir de 1798, con el objetivo de amenazar los intereses británicos en Oriente.")
        ),
        BilingualQuestion(
            id = 9227, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année Napoléon a-t-il envahi l'Espagne?", listOf("1806", "1807", "1808", "1809"), "Histoire", "Napoléon envahit l'Espagne en 1808 sous prétexte de renforcer le blocus continental contre le Royaume-Uni, ce qui déclencha la guerre d'indépendance espagnole."),
            en = LocalizedContent("In which year did Napoleon invade Spain?", listOf("1806", "1807", "1808", "1809"), "History", "Napoleon invaded Spain in 1808 under the pretext of strengthening the Continental Blockade against the United Kingdom, which sparked the Spanish War of Independence."),
            zh = LocalizedContent("拿破仑在哪一年入侵西班牙？", listOf("1806", "1807", "1808", "1809"), "历史", "拿破仑于1808年以加强针对英国的大陆封锁体系为借口入侵西班牙，引发了西班牙独立战争。"),
            es = LocalizedContent("¿En qué año invadió Napoleón España?", listOf("1806", "1807", "1808", "1809"), "Historia", "Napoleón invadió España en 1808 con el pretexto de reforzar el Bloqueo Continental contra el Reino Unido, lo que desencadenó la Guerra de Independencia Española.")
        ),
        BilingualQuestion(
            id = 9228, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année la Guerre de la Péninsule a-t-elle commencé?", listOf("1806", "1807", "1808", "1809"), "Histoire", "La Guerre de la Péninsule a débuté en 1808 lorsque Napoléon a envahi l'Espagne et le Portugal, déclenchant un conflit majeur de la guerre d'indépendance espagnole."),
            en = LocalizedContent("In which year did the Peninsular War begin?", listOf("1806", "1807", "1808", "1809"), "History", "The Peninsular War began in 1808 when Napoleon invaded Spain and Portugal, triggering a major conflict of the Spanish War of Independence."),
            zh = LocalizedContent("半岛战争在哪一年开始？", listOf("1806", "1807", "1808", "1809"), "历史", "半岛战争始于1808年，拿破仑入侵西班牙和葡萄牙，引发了西班牙独立战争中的一场重大冲突。"),
            es = LocalizedContent("¿En qué año comenzó la Guerra de la Península?", listOf("1806", "1807", "1808", "1809"), "Historia", "La Guerra de la Península comenzó en 1808 cuando Napoleón invadió España y Portugal, desencadenando un conflicto importante de la Guerra de Independencia Española.")
        ),
        BilingualQuestion(
            id = 9229, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année Napoléon a-t-elle envahi la Russie?", listOf("1810", "1811", "1812", "1813"), "Histoire", "La Grande Armée de Napoléon a envahi la Russie en juin 1812, marquant le début de la campagne de Russie qui s'est soldée par une retraite désastreuse."),
            en = LocalizedContent("In which year did Napoleon invade Russia?", listOf("1810", "1811", "1812", "1813"), "History", "Napoleon's Grande Armée invaded Russia in June 1812, marking the start of the Russian campaign which ended in a disastrous retreat."),
            zh = LocalizedContent("拿破仑在哪一年入侵俄罗斯？", listOf("1810", "1811", "1812", "1813"), "历史", "拿破仑的大军团于1812年6月入侵俄罗斯，标志着俄罗斯战役的开始，最终以灾难性的撤退告终。"),
            es = LocalizedContent("¿En qué año invadió Napoleón Rusia?", listOf("1810", "1811", "1812", "1813"), "Historia", "La Grande Armée de Napoleón invadió Rusia en junio de 1812, marcando el inicio de la campaña rusa que terminó en una retirada desastrosa.")
        ),
        BilingualQuestion(
            id = 9230, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année la Grande Armée a-t-elle été vaincue en Russie?", listOf("1811", "1812", "1813", "1814"), "Histoire", "La Grande Armée de Napoléon a subi une défaite catastrophique lors de la campagne de Russie en 1812, marquée par la retraite meurtrière de l'hiver russe."),
            en = LocalizedContent("In which year was the Grande Armée defeated in Russia?", listOf("1811", "1812", "1813", "1814"), "History", "Napoleon's Grande Armée suffered a catastrophic defeat during the Russian campaign in 1812, marked by the deadly retreat in the Russian winter."),
            zh = LocalizedContent("大军团在哪一年在俄罗斯被击败？", listOf("1811", "1812", "1813", "1814"), "历史", "拿破仑的大军团在1812年的俄罗斯战役中遭受了灾难性的失败，以俄罗斯冬季的致命撤退为标志。"),
            es = LocalizedContent("¿En qué año fue derrotada la Grande Armée en Rusia?", listOf("1811", "1812", "1813", "1814"), "Historia", "La Grande Armée de Napoleón sufrió una derrota catastrófica durante la campaña rusa en 1812, marcada por la mortífera retirada en el invierno ruso.")
        ),
        BilingualQuestion(
            id = 9231, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel événement a marqué le début de la fin pour Napoléon?", listOf("La Campagne de Russie", "Le Traité de Tilsit", "La Guerre de la Péninsule", "La Bataille de Waterloo"), "Histoire", "La campagne de Russie en 1812 fut un désastre militaire pour Napoléon, avec la perte de la Grande Armée, ce qui affaiblit son empire et encouragea ses ennemis à se coaliser contre lui."),
            en = LocalizedContent("Which event marked the beginning of the end for Napoleon?", listOf("The Russian Campaign", "The Treaty of Tilsit", "The Peninsular War", "The Battle of Waterloo"), "History", "The Russian campaign in 1812 was a military disaster for Napoleon, with the loss of the Grande Armée, which weakened his empire and encouraged his enemies to form a coalition against him."),
            zh = LocalizedContent("哪一事件标志着拿破仑末日的开始？", listOf("俄罗斯战役", "提尔西特条约", "半岛战争", "滑铁卢战役"), "历史", "1812年的俄罗斯战役对拿破仑来说是一场军事灾难，大军团覆灭，削弱了他的帝国，并鼓励他的敌人联合起来反对他。"),
            es = LocalizedContent("¿Qué evento marcó el principio del fin para Napoleón?", listOf("La Campaña de Rusia", "El Tratado de Tilsit", "La Guerra de la Península", "La Batalla de Waterloo"), "Historia", "La campaña rusa de 1812 fue un desastre militar para Napoleón, con la pérdida de la Grande Armée, lo que debilitó su imperio y alentó a sus enemigos a coaligarse contra él.")
        ),
        BilingualQuestion(
            id = 9232, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année les Alliés ont-ils envahi la France?", listOf("1812", "1813", "1814", "1815"), "Histoire", "En 1814, les armées alliées (Prusse, Autriche, Russie, Royaume-Uni) envahissent la France pour renverser Napoléon Ier, menant à son abdication en avril."),
            en = LocalizedContent("In which year did the Allies invade France?", listOf("1812", "1813", "1814", "1815"), "History", "In 1814, the allied armies (Prussia, Austria, Russia, United Kingdom) invaded France to overthrow Napoleon I, leading to his abdication in April."),
            zh = LocalizedContent("盟军在哪一年入侵法国？", listOf("1812", "1813", "1814", "1815"), "历史", "1814年，盟军（普鲁士、奥地利、俄罗斯、英国）入侵法国以推翻拿破仑一世，导致他于四月退位。"),
            es = LocalizedContent("¿En qué año invadieron los Aliados Francia?", listOf("1812", "1813", "1814", "1815"), "Historia", "En 1814, los ejércitos aliados (Prusia, Austria, Rusia, Reino Unido) invadieron Francia para derrocar a Napoleón I, lo que llevó a su abdicación en abril.")
        ),
        BilingualQuestion(
            id = 9233, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année Napoléon a-t-il abdiqué pour la première fois?", listOf("1813", "1814", "1815", "1816"), "Histoire", "Après la défaite de la campagne de France et l’entrée des coalisés à Paris, Napoléon abdique sans condition le 6 avril 1814."),
            en = LocalizedContent("In which year did Napoleon abdicate for the first time?", listOf("1813", "1814", "1815", "1816"), "History", "After the defeat in the Campaign of France and the entry of the coalition into Paris, Napoleon abdicated unconditionally on April 6, 1814."),
            zh = LocalizedContent("拿破仑在哪一年第一次退位？", listOf("1813", "1814", "1815", "1816"), "历史", "在法国战役失败和联军进入巴黎后，拿破仑于1814年4月6日无条件退位。"),
            es = LocalizedContent("¿En qué año abdicó Napoleón por primera vez?", listOf("1813", "1814", "1815", "1816"), "Historia", "Tras la derrota en la Campaña de Francia y la entrada de los coaligados en París, Napoleón abdicó sin condiciones el 6 de abril de 1814.")
        ),
        BilingualQuestion(
            id = 9234, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année Napoléon a-t-il échappé de l'île d'Elbe?", listOf("1814", "1815", "1816", "1817"), "Histoire", "Napoléon s'est évadé de l'île d'Elbe le 26 février 1815, entamant les Cent-Jours qui ont mené à la bataille de Waterloo."),
            en = LocalizedContent("In which year did Napoleon escape from the island of Elba?", listOf("1814", "1815", "1816", "1817"), "History", "Napoleon escaped from the island of Elba on February 26, 1815, beginning the Hundred Days that led to the Battle of Waterloo."),
            zh = LocalizedContent("拿破仑在哪一年从厄尔巴岛逃脱？", listOf("1814", "1815", "1816", "1817"), "历史", "拿破仑于1815年2月26日从厄尔巴岛逃脱，开始了导致滑铁卢战役的百日王朝。"),
            es = LocalizedContent("¿En qué año escapó Napoleón de la isla de Elba?", listOf("1814", "1815", "1816", "1817"), "Historia", "Napoleón escapó de la isla de Elba el 26 de febrero de 1815, iniciando los Cien Días que llevaron a la batalla de Waterloo.")
        ),
        BilingualQuestion(
            id = 9235, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel était le nom de la période des 100 jours?", listOf("Les 100 jours de Napoléon", "Le retour de Napoléon", "Le Second Empire", "L'Époque des Cent-Jours"), "Histoire", "Napoléon Bonaparte revint au pouvoir en France en mars 1815 après son exil sur l'île d'Elbe, mais fut définitivement vaincu à Waterloo en juin, marquant cette courte période de cent jours."),
            en = LocalizedContent("What was the name of the period of the Hundred Days?", listOf("Napoleon's Hundred Days", "Napoleon's Return", "The Second Empire", "The Hundred Days Era"), "History", "Napoleon Bonaparte returned to power in France in March 1815 after his exile on the island of Elba, but was definitively defeated at Waterloo in June, marking this short period of one hundred days."),
            zh = LocalizedContent("百日王朝时期叫什么名字？", listOf("拿破仑的百日王朝", "拿破仑的回归", "第二帝国", "百日时代"), "历史", "拿破仑·波拿巴在厄尔巴岛流放后于1815年3月重返法国掌权，但在6月的滑铁卢被彻底击败，标志着这一百天的短暂时期。"),
            es = LocalizedContent("¿Cuál fue el nombre del período de los Cien Días?", listOf("Los Cien Días de Napoleón", "El regreso de Napoleón", "El Segundo Imperio", "La Época de los Cien Días"), "Historia", "Napoleón Bonaparte regresó al poder en Francia en marzo de 1815 tras su exilio en la isla de Elba, pero fue definitivamente derrotado en Waterloo en junio, marcando este corto período de cien días.")
        ),
        BilingualQuestion(
            id = 9236, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année Napoléon a-t-il abdiqué définitivement?", listOf("1814", "1815", "1816", "1817"), "Histoire", "Napoléon abdique définitivement le 22 juin 1815, après sa défaite à Waterloo, mettant fin à l'Empire des Cent-Jours."),
            en = LocalizedContent("In which year did Napoleon definitively abdicate?", listOf("1814", "1815", "1816", "1817"), "History", "Napoleon definitively abdicated on June 22, 1815, after his defeat at Waterloo, ending the Hundred Days Empire."),
            zh = LocalizedContent("拿破仑在哪一年最终退位？", listOf("1814", "1815", "1816", "1817"), "历史", "拿破仑在滑铁卢战败后于1815年6月22日最终退位，结束了百日帝国。"),
            es = LocalizedContent("¿En qué año abdicó Napoleón definitivamente?", listOf("1814", "1815", "1816", "1817"), "Historia", "Napoleón abdicó definitivamente el 22 de junio de 1815, tras su derrota en Waterloo, poniendo fin al Imperio de los Cien Días.")
        ),
        BilingualQuestion(
            id = 9237, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année Napoléon est-il mort?", listOf("1820", "1821", "1822", "1823"), "Histoire", "Napoléon Bonaparte est mort le 5 mai 1821 sur l'île de Sainte-Hélène, où il était exilé par les Britanniques depuis 1815."),
            en = LocalizedContent("In which year did Napoleon die?", listOf("1820", "1821", "1822", "1823"), "History", "Napoleon Bonaparte died on May 5, 1821 on the island of Saint Helena, where he had been exiled by the British since 1815."),
            zh = LocalizedContent("拿破仑在哪一年去世？", listOf("1820", "1821", "1822", "1823"), "历史", "拿破仑·波拿巴于1821年5月5日在圣赫勒拿岛去世，自1815年起他被英国人流放至此。"),
            es = LocalizedContent("¿En qué año murió Napoleón?", listOf("1820", "1821", "1822", "1823"), "Historia", "Napoleón Bonaparte murió el 5 de mayo de 1821 en la isla de Santa Elena, donde había sido exiliado por los británicos desde 1815.")
        ),
        BilingualQuestion(
            id = 9238, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel était le siège de l'exil final de Napoléon?", listOf("L'île d'Elbe", "Sainte-Hélène", "Corse", "Malta"), "Histoire", "Après sa défaite à Waterloo en 1815, les Britanniques l'ont exilé sur cette île isolée de l'Atlantique Sud pour empêcher toute évasion. Il y est mort en 1821."),
            en = LocalizedContent("What was the location of Napoleon's final exile?", listOf("Elba", "Saint Helena", "Corsica", "Malta"), "History", "After his defeat at Waterloo in 1815, the British exiled him to this isolated island in the South Atlantic to prevent any escape. He died there in 1821."),
            zh = LocalizedContent("拿破仑最终流放的地点在哪里？", listOf("厄尔巴岛", "圣赫勒拿岛", "科西嘉岛", "马耳他"), "历史", "1815年滑铁卢战败后，英国人将他流放到南大西洋的这个孤岛上，以防止他逃脱。他于1821年在那里去世。"),
            es = LocalizedContent("¿Cuál fue el lugar del exilio final de Napoleón?", listOf("Elba", "Santa Elena", "Córcega", "Malta"), "Historia", "Tras su derrota en Waterloo en 1815, los británicos lo exiliaron a esta isla aislada del Atlántico Sur para impedir cualquier fuga. Allí murió en 1821.")
        ),
        BilingualQuestion(
            id = 9239, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année Louis XVIII a-t-il été restauré au trône?", listOf("1813", "1814", "1815", "1816"), "Histoire", "Louis XVIII a été restauré au trône en 1814 après la première abdication de Napoléon Ier, marquant le début de la Première Restauration."),
            en = LocalizedContent("In which year was Louis XVIII restored to the throne?", listOf("1813", "1814", "1815", "1816"), "History", "Louis XVIII was restored to the throne in 1814 after the first abdication of Napoleon I, marking the beginning of the First Restoration."),
            zh = LocalizedContent("路易十八在哪一年复辟？", listOf("1813", "1814", "1815", "1816"), "历史", "路易十八在拿破仑一世第一次退位后于1814年复辟，标志着第一次复辟的开始。"),
            es = LocalizedContent("¿En qué año fue restaurado Luis XVIII al trono?", listOf("1813", "1814", "1815", "1816"), "Historia", "Luis XVIII fue restaurado al trono en 1814 tras la primera abdicación de Napoleón I, marcando el inicio de la Primera Restauración.")
        ),
        BilingualQuestion(
            id = 9240, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel était le nom du congrès qui a réorganisé l'Europe après la chute de Napoléon?", listOf("Congrès de Paris", "Congrès de Vienne", "Congrès d'Aix-la-Chapelle", "Congrès de Berlin"), "Histoire", "Le Congrès de Vienne, tenu de 1814 à 1815, a redessiné les frontières européennes et rétabli l'équilibre des puissances après les guerres napoléoniennes."),
            en = LocalizedContent("What was the name of the congress that reorganized Europe after the fall of Napoleon?", listOf("Congress of Paris", "Congress of Vienna", "Congress of Aix-la-Chapelle", "Congress of Berlin"), "History", "The Congress of Vienna, held from 1814 to 1815, redrew European borders and restored the balance of power after the Napoleonic Wars."),
            zh = LocalizedContent("拿破仑倒台后重新组织欧洲的会议叫什么名字？", listOf("巴黎会议", "维也纳会议", "亚琛会议", "柏林会议"), "历史", "维也纳会议于1814年至1815年举行，重新绘制了欧洲边界，并在拿破仑战争后恢复了权力平衡。"),
            es = LocalizedContent("¿Cuál fue el nombre del congreso que reorganizó Europa tras la caída de Napoleón?", listOf("Congreso de París", "Congreso de Viena", "Congreso de Aquisgrán", "Congreso de Berlín"), "Historia", "El Congreso de Viena, celebrado de 1814 a 1815, redibujó las fronteras europeas y restableció el equilibrio de poder tras las guerras napoleónicas.")
        ),
        BilingualQuestion(
            id = 9241, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année le Congrès de Vienne s'est-il terminé?", listOf("1814", "1815", "1816", "1817"), "Histoire", "Le Congrès de Vienne, qui a redessiné la carte de l'Europe après les guerres napoléoniennes, s'est achevé en juin 1815, juste avant la défaite définitive de Napoléon à Waterloo."),
            en = LocalizedContent("In what year did the Congress of Vienna end?", listOf("1814", "1815", "1816", "1817"), "History", "The Congress of Vienna, which redrew the map of Europe after the Napoleonic Wars, ended in June 1815, just before Napoleon's final defeat at Waterloo."),
            zh = LocalizedContent("维也纳会议在哪一年结束？", listOf("1814年", "1815年", "1816年", "1817年"), "历史", "维也纳会议在拿破仑战争后重新绘制了欧洲地图，于1815年6月结束，就在拿破仑在滑铁卢最终失败之前。"),
            es = LocalizedContent("¿En qué año terminó el Congreso de Viena?", listOf("1814", "1815", "1816", "1817"), "Historia", "El Congreso de Viena, que redibujó el mapa de Europa tras las guerras napoleónicas, finalizó en junio de 1815, justo antes de la derrota definitiva de Napoleón en Waterloo.")
        ),
        BilingualQuestion(
            id = 9242, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a présidé le Congrès de Vienne?", listOf("Castlereagh", "Metternich", "Talleyrand", "Bismarck"), "Histoire", "Le chancelier autrichien Metternich a présidé le Congrès de Vienne en 1814-1815, jouant un rôle central dans la réorganisation de l'Europe après les guerres napoléoniennes."),
            en = LocalizedContent("Who presided over the Congress of Vienna?", listOf("Castlereagh", "Metternich", "Talleyrand", "Bismarck"), "History", "Austrian Chancellor Metternich presided over the Congress of Vienna in 1814-1815, playing a central role in the reorganization of Europe after the Napoleonic Wars."),
            zh = LocalizedContent("谁主持了维也纳会议？", listOf("卡斯尔雷", "梅特涅", "塔列朗", "俾斯麦"), "历史", "奥地利首相梅特涅在1814-1815年主持了维也纳会议，在拿破仑战争后欧洲的重组中发挥了核心作用。"),
            es = LocalizedContent("¿Quién presidió el Congreso de Viena?", listOf("Castlereagh", "Metternich", "Talleyrand", "Bismarck"), "Historia", "El canciller austriaco Metternich presidió el Congreso de Viena en 1814-1815, desempeñando un papel central en la reorganización de Europa tras las guerras napoleónicas.")
        ),
        BilingualQuestion(
            id = 9243, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année la Sainte-Alliance a-t-elle été créée?", listOf("1814", "1815", "1816", "1817"), "Histoire", "La Sainte-Alliance fut créée en 1815, après la défaite de Napoléon, par les monarques de Russie, d'Autriche et de Prusse pour défendre l'ordre monarchique en Europe."),
            en = LocalizedContent("In what year was the Holy Alliance created?", listOf("1814", "1815", "1816", "1817"), "History", "The Holy Alliance was created in 1815, after Napoleon's defeat, by the monarchs of Russia, Austria, and Prussia to defend the monarchical order in Europe."),
            zh = LocalizedContent("神圣同盟是在哪一年成立的？", listOf("1814年", "1815年", "1816年", "1817年"), "历史", "神圣同盟于1815年拿破仑战败后，由俄罗斯、奥地利和普鲁士的君主创建，旨在捍卫欧洲的君主制秩序。"),
            es = LocalizedContent("¿En qué año se creó la Santa Alianza?", listOf("1814", "1815", "1816", "1817"), "Historia", "La Santa Alianza fue creada en 1815, tras la derrota de Napoleón, por los monarcas de Rusia, Austria y Prusia para defender el orden monárquico en Europa.")
        ),
        BilingualQuestion(
            id = 9244, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a créé la Sainte-Alliance?", listOf("François Ier", "Alexandre Ier", "Frédéric II", "Napoléon"), "Histoire", "Alexandre Ier, tsar de Russie, proposa la Sainte-Alliance en 1815 après la défaite de Napoléon, un pacte entre monarques européens pour défendre les principes chrétiens et l'ordre conservateur."),
            en = LocalizedContent("Who created the Holy Alliance?", listOf("Francis I", "Alexander I", "Frederick II", "Napoleon"), "History", "Alexander I, Tsar of Russia, proposed the Holy Alliance in 1815 after Napoleon's defeat, a pact among European monarchs to defend Christian principles and the conservative order."),
            zh = LocalizedContent("谁创建了神圣同盟？", listOf("弗朗茨一世", "亚历山大一世", "腓特烈二世", "拿破仑"), "历史", "俄罗斯沙皇亚历山大一世在1815年拿破仑战败后提出了神圣同盟，这是一个欧洲君主之间的盟约，旨在捍卫基督教原则和保守秩序。"),
            es = LocalizedContent("¿Quién creó la Santa Alianza?", listOf("Francisco I", "Alejandro I", "Federico II", "Napoleón"), "Historia", "Alejandro I, zar de Rusia, propuso la Santa Alianza en 1815 tras la derrota de Napoleón, un pacto entre monarcas europeos para defender los principios cristianos y el orden conservador.")
        ),
        BilingualQuestion(
            id = 9245, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année la Révolution de 1848 a-t-elle commencé?", listOf("1846", "1847", "1848", "1849"), "Histoire", "Cette révolution, qui débuta en février 1848, mit fin à la monarchie de Juillet et instaura la Deuxième République en France."),
            en = LocalizedContent("In what year did the Revolution of 1848 begin?", listOf("1846", "1847", "1848", "1849"), "History", "This revolution, which began in February 1848, ended the July Monarchy and established the Second Republic in France."),
            zh = LocalizedContent("1848年革命在哪一年开始？", listOf("1846年", "1847年", "1848年", "1849年"), "历史", "这场革命始于1848年2月，结束了七月王朝，并在法国建立了第二共和国。"),
            es = LocalizedContent("¿En qué año comenzó la Revolución de 1848?", listOf("1846", "1847", "1848", "1849"), "Historia", "Esta revolución, que comenzó en febrero de 1848, puso fin a la Monarquía de Julio y estableció la Segunda República en Francia.")
        ),
        BilingualQuestion(
            id = 9246, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel événement a déclenché la Révolution de 1848?", listOf("La crise économique", "L'effondrement financier", "La famine des pommes de terre", "Les réformes politiques"), "Histoire", "La famine de la pomme de terre en Europe, notamment en Irlande et en France, a provoqué une grave crise alimentaire et économique, exacerbant les tensions sociales et politiques qui ont conduit à la Révolution de 1848."),
            en = LocalizedContent("What event triggered the Revolution of 1848?", listOf("The economic crisis", "The financial collapse", "The potato famine", "The political reforms"), "History", "The potato famine in Europe, particularly in Ireland and France, caused a severe food and economic crisis, exacerbating social and political tensions that led to the Revolution of 1848."),
            zh = LocalizedContent("什么事件引发了1848年革命？", listOf("经济危机", "金融崩溃", "马铃薯饥荒", "政治改革"), "历史", "欧洲的马铃薯饥荒，特别是在爱尔兰和法国，导致了严重的粮食和经济危机，加剧了社会和政治紧张局势，最终引发了1848年革命。"),
            es = LocalizedContent("¿Qué evento desencadenó la Revolución de 1848?", listOf("La crisis económica", "El colapso financiero", "La hambruna de la patata", "Las reformas políticas"), "Historia", "La hambruna de la patata en Europa, especialmente en Irlanda y Francia, provocó una grave crisis alimentaria y económica, exacerbando las tensiones sociales y políticas que llevaron a la Revolución de 1848.")
        ),
        BilingualQuestion(
            id = 9247, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année Louis-Philippe a-t-il abdiqué?", listOf("1846", "1847", "1848", "1849"), "Histoire", "Louis-Philippe abdique le 24 février 1848, marquant la fin de la monarchie de Juillet et ouvrant la voie à la Deuxième République française."),
            en = LocalizedContent("In what year did Louis-Philippe abdicate?", listOf("1846", "1847", "1848", "1849"), "History", "Louis-Philippe abdicated on February 24, 1848, marking the end of the July Monarchy and paving the way for the Second French Republic."),
            zh = LocalizedContent("路易-菲利普在哪一年退位？", listOf("1846年", "1847年", "1848年", "1849年"), "历史", "路易-菲利普于1848年2月24日退位，标志着七月王朝的结束，并为法兰西第二共和国铺平了道路。"),
            es = LocalizedContent("¿En qué año abdicó Luis Felipe?", listOf("1846", "1847", "1848", "1849"), "Historia", "Luis Felipe abdicó el 24 de febrero de 1848, marcando el fin de la Monarquía de Julio y allanando el camino para la Segunda República Francesa.")
        ),
        BilingualQuestion(
            id = 9248, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel était le nom du gouvernement établi après la Révolution de 1848?", listOf("La Deuxième République", "Le Second Empire", "La Troisième République", "La Première République"), "Histoire", "La Révolution de 1848 mit fin à la monarchie de Juillet, conduisant à la proclamation de la Deuxième République en France."),
            en = LocalizedContent("What was the name of the government established after the Revolution of 1848?", listOf("The Second Republic", "The Second Empire", "The Third Republic", "The First Republic"), "History", "The Revolution of 1848 ended the July Monarchy, leading to the proclamation of the Second Republic in France."),
            zh = LocalizedContent("1848年革命后建立的政府叫什么名字？", listOf("第二共和国", "第二帝国", "第三共和国", "第一共和国"), "历史", "1848年革命结束了七月王朝，导致了法兰西第二共和国的宣告成立。"),
            es = LocalizedContent("¿Cuál fue el nombre del gobierno establecido tras la Revolución de 1848?", listOf("La Segunda República", "El Segundo Imperio", "La Tercera República", "La Primera República"), "Historia", "La Revolución de 1848 puso fin a la Monarquía de Julio, dando lugar a la proclamación de la Segunda República en Francia.")
        ),
        BilingualQuestion(
            id = 9249, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année la Seconde République s'est-elle terminée?", listOf("1850", "1851", "1852", "1853"), "Histoire", "La Seconde République française prit fin en 1852 lorsque Louis-Napoléon Bonaparte, après son coup d'État de 1851, rétablit l'Empire par un plébiscite et devint Napoléon III."),
            en = LocalizedContent("In what year did the Second Republic end?", listOf("1850", "1851", "1852", "1853"), "History", "The Second French Republic ended in 1852 when Louis-Napoléon Bonaparte, after his coup d'état in 1851, reestablished the Empire through a plebiscite and became Napoleon III."),
            zh = LocalizedContent("第二共和国在哪一年结束？", listOf("1850年", "1851年", "1852年", "1853年"), "历史", "法兰西第二共和国于1852年结束，当时路易-拿破仑·波拿巴在1851年政变后，通过全民公决重建了帝国，成为拿破仑三世。"),
            es = LocalizedContent("¿En qué año terminó la Segunda República?", listOf("1850", "1851", "1852", "1853"), "Historia", "La Segunda República Francesa terminó en 1852 cuando Luis Napoleón Bonaparte, tras su golpe de Estado en 1851, restableció el Imperio mediante un plebiscito y se convirtió en Napoleón III.")
        ),
    )

    private fun part5(): List<BilingualQuestion> = listOf(
        BilingualQuestion(
            id = 9250, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a établi le Second Empire?", listOf("Napoléon III", "Napoléon Bonaparte", "Louis-Napoléon", "Victor Hugo"), "Histoire", "Napoléon III, neveu de Napoléon Ier, proclame le Second Empire le 2 décembre 1852 après un coup d'État en 1851 et un plébiscite favorable."),
            en = LocalizedContent("Who established the Second Empire?", listOf("Napoleon III", "Napoleon Bonaparte", "Louis-Napoleon", "Victor Hugo"), "History", "Napoleon III, nephew of Napoleon I, proclaimed the Second Empire on December 2, 1852, after a coup d'état in 1851 and a favorable plebiscite."),
            zh = LocalizedContent("谁建立了第二帝国？", listOf("拿破仑三世", "拿破仑·波拿巴", "路易-拿破仑", "维克多·雨果"), "历史", "拿破仑三世，拿破仑一世的侄子，在1851年政变和全民公决后，于1852年12月2日宣布建立第二帝国。"),
            es = LocalizedContent("¿Quién estableció el Segundo Imperio?", listOf("Napoleón III", "Napoleón Bonaparte", "Luis Napoleón", "Víctor Hugo"), "Historia", "Napoleón III, sobrino de Napoleón I, proclamó el Segundo Imperio el 2 de diciembre de 1852 tras un golpe de Estado en 1851 y un plebiscito favorable.")
        ),
        BilingualQuestion(
            id = 9251, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année le Second Empire a-t-il été établi?", listOf("1850", "1851", "1852", "1853"), "Histoire", "Louis-Napoléon Bonaparte, neveu de Napoléon Ier, proclame le Second Empire le 2 décembre 1852, un an après son coup d'État."),
            en = LocalizedContent("In which year was the Second Empire established?", listOf("1850", "1851", "1852", "1853"), "History", "Louis-Napoleon Bonaparte, nephew of Napoleon I, proclaimed the Second Empire on December 2, 1852, one year after his coup d'état."),
            zh = LocalizedContent("第二帝国成立于哪一年？", listOf("1850年", "1851年", "1852年", "1853年"), "历史", "路易-拿破仑·波拿巴，拿破仑一世的侄子，在其政变一年后，于1852年12月2日宣布建立第二帝国。"),
            es = LocalizedContent("¿En qué año se estableció el Segundo Imperio?", listOf("1850", "1851", "1852", "1853"), "Historia", "Luis Napoleón Bonaparte, sobrino de Napoleón I, proclamó el Segundo Imperio el 2 de diciembre de 1852, un año después de su golpe de Estado.")
        ),
        BilingualQuestion(
            id = 9252, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année le Second Empire s'est-il terminé?", listOf("1868", "1869", "1870", "1871"), "Histoire", "Le Second Empire s'est terminé le 4 septembre 1870, après la défaite de Sedan face à la Prusse et la capture de Napoléon III."),
            en = LocalizedContent("In which year did the Second Empire end?", listOf("1868", "1869", "1870", "1871"), "History", "The Second Empire ended on September 4, 1870, after the defeat at Sedan against Prussia and the capture of Napoleon III."),
            zh = LocalizedContent("第二帝国在哪一年结束？", listOf("1868年", "1869年", "1870年", "1871年"), "历史", "第二帝国于1870年9月4日结束，此前在色当战役中败给普鲁士，拿破仑三世被俘。"),
            es = LocalizedContent("¿En qué año terminó el Segundo Imperio?", listOf("1868", "1869", "1870", "1871"), "Historia", "El Segundo Imperio terminó el 4 de septiembre de 1870, tras la derrota en Sedán frente a Prusia y la captura de Napoleón III.")
        ),
        BilingualQuestion(
            id = 9253, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel événement a marqué la fin du Second Empire?", listOf("La Guerre franco-prussienne", "La Commode", "La Révolution", "L'exil de Napoléon"), "Histoire", "La défaite de Napoléon III à Sedan en 1870 face aux Prussiens entraîne sa capture et l'effondrement du régime, proclamant la Troisième République."),
            en = LocalizedContent("What event marked the end of the Second Empire?", listOf("The Franco-Prussian War", "The Commune", "The Revolution", "The exile of Napoleon"), "History", "The defeat of Napoleon III at Sedan in 1870 against the Prussians led to his capture and the collapse of the regime, proclaiming the Third Republic."),
            zh = LocalizedContent("什么事件标志着第二帝国的结束？", listOf("普法战争", "巴黎公社", "革命", "拿破仑流放"), "历史", "1870年拿破仑三世在色当战役中败给普鲁士，导致他被俘和政权崩溃，随后宣布成立第三共和国。"),
            es = LocalizedContent("¿Qué evento marcó el fin del Segundo Imperio?", listOf("La Guerra Franco-Prusiana", "La Comuna", "La Revolución", "El exilio de Napoleón"), "Historia", "La derrota de Napoleón III en Sedán en 1870 frente a los prusianos provocó su captura y el colapso del régimen, proclamándose la Tercera República.")
        ),
        BilingualQuestion(
            id = 9254, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année la Guerre franco-prussienne a-t-elle commencé?", listOf("1868", "1869", "1870", "1871"), "Histoire", "La guerre franco-prussienne débute en 1870, lorsque Napoléon III déclare la guerre à la Prusse après la dépêche d'Ems."),
            en = LocalizedContent("In which year did the Franco-Prussian War begin?", listOf("1868", "1869", "1870", "1871"), "History", "The Franco-Prussian War began in 1870, when Napoleon III declared war on Prussia after the Ems Dispatch."),
            zh = LocalizedContent("普法战争在哪一年开始？", listOf("1868年", "1869年", "1870年", "1871年"), "历史", "普法战争始于1870年，拿破仑三世在埃姆斯电报事件后向普鲁士宣战。"),
            es = LocalizedContent("¿En qué año comenzó la Guerra Franco-Prusiana?", listOf("1868", "1869", "1870", "1871"), "Historia", "La Guerra Franco-Prusiana comenzó en 1870, cuando Napoleón III declaró la guerra a Prusia tras el Telegrama de Ems.")
        ),
        BilingualQuestion(
            id = 9255, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année la Guerre franco-prussienne s'est-elle terminée?", listOf("1870", "1871", "1872", "1873"), "Histoire", "Le traité de Francfort, signé le 10 mai 1871, a officiellement mis fin à la guerre franco-prussienne, entamée en juillet 1870. Cette défaite française a conduit à la perte de l'Alsace-Moselle et à la chute du Second Empire."),
            en = LocalizedContent("In which year did the Franco-Prussian War end?", listOf("1870", "1871", "1872", "1873"), "History", "The Treaty of Frankfurt, signed on May 10, 1871, officially ended the Franco-Prussian War, which began in July 1870. This French defeat led to the loss of Alsace-Moselle and the fall of the Second Empire."),
            zh = LocalizedContent("普法战争在哪一年结束？", listOf("1870年", "1871年", "1872年", "1873年"), "历史", "1871年5月10日签署的《法兰克福条约》正式结束了始于1870年7月的普法战争。法国的战败导致阿尔萨斯-摩泽尔地区丧失和第二帝国的覆灭。"),
            es = LocalizedContent("¿En qué año terminó la Guerra Franco-Prusiana?", listOf("1870", "1871", "1872", "1873"), "Historia", "El Tratado de Fráncfort, firmado el 10 de mayo de 1871, puso fin oficialmente a la Guerra Franco-Prusiana, iniciada en julio de 1870. Esta derrota francesa provocó la pérdida de Alsacia-Mosela y la caída del Segundo Imperio.")
        ),
        BilingualQuestion(
            id = 9256, correctIndex = 3, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui a vaincu la France dans la Guerre franco-prussienne?", listOf("L'Allemagne", "La Prusse", "Bismarck", "Tous les trois"), "Histoire", "La guerre franco-prussienne de 1870-1871 a opposé la France à une coalition d'États allemands menée par la Prusse, incluant également la Bavière et le Bade."),
            en = LocalizedContent("Who defeated France in the Franco-Prussian War?", listOf("Germany", "Prussia", "Bismarck", "All three"), "History", "The Franco-Prussian War of 1870-1871 pitted France against a coalition of German states led by Prussia, also including Bavaria and Baden."),
            zh = LocalizedContent("谁在普法战争中击败了法国？", listOf("德国", "普鲁士", "俾斯麦", "以上全部"), "历史", "1870-1871年的普法战争是法国与由普鲁士领导的德意志邦联（包括巴伐利亚和巴登）之间的战争。"),
            es = LocalizedContent("¿Quién derrotó a Francia en la Guerra Franco-Prusiana?", listOf("Alemania", "Prusia", "Bismarck", "Los tres"), "Historia", "La Guerra Franco-Prusiana de 1870-1871 enfrentó a Francia contra una coalición de estados alemanes liderada por Prusia, que incluía también a Baviera y Baden.")
        ),
        BilingualQuestion(
            id = 9257, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel traité a mis fin à la Guerre franco-prussienne?", listOf("Traité de Frankfurt", "Traité de Francfort", "Traité de Paris", "Traité de Bismarck"), "Histoire", "Le Traité de Francfort, signé le 10 mai 1871, a officiellement mis fin à la Guerre franco-prussienne, imposant à la France la perte de l'Alsace-Lorraine et le paiement d'une lourde indemnité."),
            en = LocalizedContent("Which treaty ended the Franco-Prussian War?", listOf("Treaty of Frankfurt", "Treaty of Frankfurt", "Treaty of Paris", "Treaty of Bismarck"), "History", "The Treaty of Frankfurt, signed on May 10, 1871, officially ended the Franco-Prussian War, imposing on France the loss of Alsace-Lorraine and the payment of a heavy indemnity."),
            zh = LocalizedContent("哪项条约结束了普法战争？", listOf("法兰克福条约", "法兰克福条约", "巴黎条约", "俾斯麦条约"), "历史", "1871年5月10日签署的《法兰克福条约》正式结束了普法战争，迫使法国割让阿尔萨斯-洛林并支付巨额赔款。"),
            es = LocalizedContent("¿Qué tratado puso fin a la Guerra Franco-Prusiana?", listOf("Tratado de Fráncfort", "Tratado de Fráncfort", "Tratado de París", "Tratado de Bismarck"), "Historia", "El Tratado de Fráncfort, firmado el 10 de mayo de 1871, puso fin oficialmente a la Guerra Franco-Prusiana, imponiendo a Francia la pérdida de Alsacia-Lorena y el pago de una fuerte indemnización.")
        ),
        BilingualQuestion(
            id = 9258, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année la Commune de Paris a-t-elle été établie?", listOf("1870", "1871", "1872", "1873"), "Histoire", "La Commune de Paris fut proclamée le 18 mars 1871 après la défaite de la France face à la Prusse et le soulèvement des Parisiens contre le gouvernement provisoire."),
            en = LocalizedContent("In which year was the Paris Commune established?", listOf("1870", "1871", "1872", "1873"), "History", "The Paris Commune was proclaimed on March 18, 1871, after France's defeat against Prussia and the uprising of Parisians against the provisional government."),
            zh = LocalizedContent("巴黎公社在哪一年成立？", listOf("1870年", "1871年", "1872年", "1873年"), "历史", "巴黎公社于1871年3月18日宣布成立，此前法国在普法战争中战败，巴黎人民起义反对临时政府。"),
            es = LocalizedContent("¿En qué año se estableció la Comuna de París?", listOf("1870", "1871", "1872", "1873"), "Historia", "La Comuna de París fue proclamada el 18 de marzo de 1871, tras la derrota de Francia frente a Prusia y el levantamiento de los parisinos contra el gobierno provisional.")
        ),
        BilingualQuestion(
            id = 9259, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année la Commune de Paris a-t-elle été écrasée?", listOf("1871", "1872", "1873", "1874"), "Histoire", "La Commune de Paris a été écrasée lors de la Semaine sanglante, du 21 au 28 mai 1871, par les troupes versaillaises."),
            en = LocalizedContent("In which year was the Paris Commune crushed?", listOf("1871", "1872", "1873", "1874"), "History", "The Paris Commune was crushed during the Bloody Week, from May 21 to 28, 1871, by the Versailles troops."),
            zh = LocalizedContent("巴黎公社在哪一年被镇压？", listOf("1871年", "1872年", "1873年", "1874年"), "历史", "巴黎公社在1871年5月21日至28日的“血腥一周”中被凡尔赛军队镇压。"),
            es = LocalizedContent("¿En qué año fue aplastada la Comuna de París?", listOf("1871", "1872", "1873", "1874"), "Historia", "La Comuna de París fue aplastada durante la Semana Sangrienta, del 21 al 28 de mayo de 1871, por las tropas versallescas.")
        ),
        BilingualQuestion(
            id = 9260, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a établi la Troisième République en France?", listOf("Adolphe Thiers", "Jules Grévy", "Léon Gambetta", "Patrice de MacMahon"), "Histoire", "Léon Gambetta proclame la Troisième République le 4 septembre 1870 après la défaite de Sedan et la chute de Napoléon III."),
            en = LocalizedContent("Who established the Third Republic in France?", listOf("Adolphe Thiers", "Jules Grévy", "Léon Gambetta", "Patrice de MacMahon"), "History", "Léon Gambetta proclaimed the Third Republic on September 4, 1870, after the defeat at Sedan and the fall of Napoleon III."),
            zh = LocalizedContent("谁在法国建立了第三共和国？", listOf("阿道夫·梯也尔", "儒勒·格雷维", "莱昂·甘必大", "帕特里斯·麦克马洪"), "历史", "莱昂·甘必大于1870年9月4日在色当战败和拿破仑三世倒台后宣布成立第三共和国。"),
            es = LocalizedContent("¿Quién estableció la Tercera República en Francia?", listOf("Adolphe Thiers", "Jules Grévy", "Léon Gambetta", "Patrice de MacMahon"), "Historia", "Léon Gambetta proclamó la Tercera República el 4 de septiembre de 1870 tras la derrota de Sedán y la caída de Napoleón III.")
        ),
        BilingualQuestion(
            id = 9261, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année la Troisième République a-t-elle été établie?", listOf("1870", "1871", "1872", "1873"), "Histoire", "La Troisième République a été proclamée le 4 septembre 1870 après la chute du Second Empire, mais elle n'a été définitivement établie qu'en 1871 après la défaite française face à la Prusse et la Commune de Paris."),
            en = LocalizedContent("In which year was the Third Republic established?", listOf("1870", "1871", "1872", "1873"), "History", "The Third Republic was proclaimed on September 4, 1870, after the fall of the Second Empire, but it was definitively established in 1871 after the French defeat against Prussia and the Paris Commune."),
            zh = LocalizedContent("第三共和国成立于哪一年？", listOf("1870", "1871", "1872", "1873"), "历史", "第三共和国于1870年9月4日第二帝国倒台后宣布成立，但最终在1871年法国战败于普鲁士和巴黎公社之后才确立。"),
            es = LocalizedContent("¿En qué año se estableció la Tercera República?", listOf("1870", "1871", "1872", "1873"), "Historia", "La Tercera República fue proclamada el 4 de septiembre de 1870 tras la caída del Segundo Imperio, pero se estableció definitivamente en 1871 después de la derrota francesa ante Prusia y la Comuna de París.")
        ),
        BilingualQuestion(
            id = 9262, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui a unifié l'Allemagne?", listOf("Frédéric II", "Guillaume Ier", "Otto von Bismarck", "Léopold Ier"), "Histoire", "Otto von Bismarck, en tant que chancelier prussien, a orchestré l'unification allemande par une série de guerres victorieuses entre 1864 et 1871."),
            en = LocalizedContent("Who unified Germany?", listOf("Frederick II", "William I", "Otto von Bismarck", "Leopold I"), "History", "Otto von Bismarck, as Prussian chancellor, orchestrated German unification through a series of victorious wars between 1864 and 1871."),
            zh = LocalizedContent("谁统一了德国？", listOf("腓特烈二世", "威廉一世", "奥托·冯·俾斯麦", "利奥波德一世"), "历史", "奥托·冯·俾斯麦作为普鲁士首相，通过1864年至1871年间的一系列胜利战争策划了德国统一。"),
            es = LocalizedContent("¿Quién unificó Alemania?", listOf("Federico II", "Guillermo I", "Otto von Bismarck", "Leopoldo I"), "Historia", "Otto von Bismarck, como canciller prusiano, orquestó la unificación alemana mediante una serie de guerras victoriosas entre 1864 y 1871.")
        ),
        BilingualQuestion(
            id = 9263, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année l'Allemagne s'est-elle unifiée?", listOf("1868", "1869", "1870", "1871"), "Histoire", "L'unification allemande a été proclamée le 18 janvier 1871 dans la galerie des Glaces du château de Versailles, après la victoire de la Prusse sur la France lors de la guerre franco-prussienne."),
            en = LocalizedContent("In which year did Germany unify?", listOf("1868", "1869", "1870", "1871"), "History", "German unification was proclaimed on January 18, 1871, in the Hall of Mirrors at the Palace of Versailles, after Prussia's victory over France in the Franco-Prussian War."),
            zh = LocalizedContent("德国在哪一年统一？", listOf("1868", "1869", "1870", "1871"), "历史", "德国统一于1871年1月18日在凡尔赛宫镜厅宣布，此前普鲁士在普法战争中战胜法国。"),
            es = LocalizedContent("¿En qué año se unificó Alemania?", listOf("1868", "1869", "1870", "1871"), "Historia", "La unificación alemana fue proclamada el 18 de enero de 1871 en la Galería de los Espejos del Palacio de Versalles, tras la victoria de Prusia sobre Francia en la guerra franco-prusiana.")
        ),
        BilingualQuestion(
            id = 9264, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel événement a marqué l'unification de l'Allemagne?", listOf("La Bataille de Sedan", "La Proclamation de l'Empereur", "Le Traité de Francfort", "La Bataille de Königgrätz"), "Histoire", "La Proclamation de l'Empereur, le 18 janvier 1871 dans la galerie des Glaces à Versailles, a officialisé l'unification des États allemands sous la direction de la Prusse et du roi Guillaume Ier."),
            en = LocalizedContent("Which event marked the unification of Germany?", listOf("The Battle of Sedan", "The Proclamation of the Emperor", "The Treaty of Frankfurt", "The Battle of Königgrätz"), "History", "The Proclamation of the Emperor, on January 18, 1871, in the Hall of Mirrors at Versailles, formalized the unification of the German states under Prussian leadership and King William I."),
            zh = LocalizedContent("哪个事件标志着德国的统一？", listOf("色当战役", "皇帝宣告", "法兰克福条约", "柯尼希格雷茨战役"), "历史", "1871年1月18日在凡尔赛宫镜厅的皇帝宣告，正式确立了德意志各邦在普鲁士领导及威廉一世国王下的统一。"),
            es = LocalizedContent("¿Qué evento marcó la unificación de Alemania?", listOf("La Batalla de Sedán", "La Proclamación del Emperador", "El Tratado de Fráncfort", "La Batalla de Königgrätz"), "Historia", "La Proclamación del Emperador, el 18 de enero de 1871 en la Galería de los Espejos de Versalles, formalizó la unificación de los estados alemanes bajo el liderazgo prusiano y el rey Guillermo I.")
        ),
        BilingualQuestion(
            id = 9265, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année l'Italie s'est-elle unifiée?", listOf("1859", "1860", "1861", "1870"), "Histoire", "Le processus du Risorgimento a abouti à la proclamation du royaume d'Italie en 1861, avec Victor-Emmanuel II comme roi."),
            en = LocalizedContent("In which year did Italy unify?", listOf("1859", "1860", "1861", "1870"), "History", "The Risorgimento process culminated in the proclamation of the Kingdom of Italy in 1861, with Victor Emmanuel II as king."),
            zh = LocalizedContent("意大利在哪一年统一？", listOf("1859", "1860", "1861", "1870"), "历史", "复兴运动进程最终于1861年宣布成立意大利王国，维托里奥·埃马努埃莱二世为国王。"),
            es = LocalizedContent("¿En qué año se unificó Italia?", listOf("1859", "1860", "1861", "1870"), "Historia", "El proceso del Risorgimento culminó con la proclamación del Reino de Italia en 1861, con Víctor Manuel II como rey.")
        ),
        BilingualQuestion(
            id = 9266, correctIndex = 3, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui a unifié l'Italie?", listOf("Camillo Cavour", "Giuseppe Garibaldi", "Victor-Emmanuel II", "Tous les trois"), "Histoire", "Garibaldi, Cavour et Victor-Emmanuel II ont chacun joué un rôle clé dans l'unification italienne au XIXe siècle, par des actions militaires, diplomatiques et politiques."),
            en = LocalizedContent("Who unified Italy?", listOf("Camillo Cavour", "Giuseppe Garibaldi", "Victor Emmanuel II", "All three"), "History", "Garibaldi, Cavour, and Victor Emmanuel II each played key roles in Italian unification in the 19th century through military, diplomatic, and political actions."),
            zh = LocalizedContent("谁统一了意大利？", listOf("卡米洛·加富尔", "朱塞佩·加里波第", "维托里奥·埃马努埃莱二世", "以上三者"), "历史", "加里波第、加富尔和维托里奥·埃马努埃莱二世各自通过军事、外交和政治行动在19世纪的意大利统一中发挥了关键作用。"),
            es = LocalizedContent("¿Quién unificó Italia?", listOf("Camillo Cavour", "Giuseppe Garibaldi", "Víctor Manuel II", "Los tres"), "Historia", "Garibaldi, Cavour y Víctor Manuel II desempeñaron papeles clave en la unificación italiana del siglo XIX mediante acciones militares, diplomáticas y políticas.")
        ),
        BilingualQuestion(
            id = 9267, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année Cavour a-t-il commencé l'unification italienne?", listOf("1855", "1858", "1859", "1860"), "Histoire", "Camillo Cavour, alors Premier ministre du royaume de Sardaigne, engagea le processus d'unification italienne en 1859 en signant les accords de Plombières avec la France et en déclenchant la deuxième guerre d'indépendance italienne contre l'Autriche."),
            en = LocalizedContent("In which year did Cavour begin Italian unification?", listOf("1855", "1858", "1859", "1860"), "History", "Camillo Cavour, then Prime Minister of the Kingdom of Sardinia, began the process of Italian unification in 1859 by signing the Plombières Agreement with France and launching the Second Italian War of Independence against Austria."),
            zh = LocalizedContent("加富尔在哪一年开始意大利统一？", listOf("1855", "1858", "1859", "1860"), "历史", "卡米洛·加富尔，时任撒丁王国首相，于1859年通过与法国签署普隆比耶尔协议并发动第二次意大利独立战争对抗奥地利，开始了意大利统一进程。"),
            es = LocalizedContent("¿En qué año comenzó Cavour la unificación italiana?", listOf("1855", "1858", "1859", "1860"), "Historia", "Camillo Cavour, entonces primer ministro del Reino de Cerdeña, inició el proceso de unificación italiana en 1859 al firmar los Acuerdos de Plombières con Francia y lanzar la Segunda Guerra de Independencia Italiana contra Austria.")
        ),
        BilingualQuestion(
            id = 9268, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année Garibaldi a-t-il débarqué en Sicile?", listOf("1858", "1859", "1860", "1861"), "Histoire", "L'expédition des Mille, menée par Garibaldi, débarqua à Marsala en Sicile le 11 mai 1860, marquant le début de la campagne qui permit l'unification de l'Italie."),
            en = LocalizedContent("In which year did Garibaldi land in Sicily?", listOf("1858", "1859", "1860", "1861"), "History", "The Expedition of the Thousand, led by Garibaldi, landed at Marsala in Sicily on May 11, 1860, marking the beginning of the campaign that led to the unification of Italy."),
            zh = LocalizedContent("加里波第在哪一年登陆西西里岛？", listOf("1858", "1859", "1860", "1861"), "历史", "由加里波第率领的千人远征军于1860年5月11日在西西里岛的马尔萨拉登陆，标志着最终促成意大利统一的战役开始。"),
            es = LocalizedContent("¿En qué año desembarcó Garibaldi en Sicilia?", listOf("1858", "1859", "1860", "1861"), "Historia", "La Expedición de los Mil, liderada por Garibaldi, desembarcó en Marsala, Sicilia, el 11 de mayo de 1860, marcando el inicio de la campaña que condujo a la unificación de Italia.")
        ),
        BilingualQuestion(
            id = 9269, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel était le nom de l'expédition de Garibaldi?", listOf("L'expédition des Mille", "L'expédition des Chevaliers", "L'expédition du Risorgimento", "L'expédition de la Liberté"), "Histoire", "L'expédition des Mille, menée par Garibaldi en 1860, visait à conquérir le royaume des Deux-Siciles pour unifier l'Italie."),
            en = LocalizedContent("What was the name of Garibaldi's expedition?", listOf("Expedition of the Thousand", "Expedition of the Knights", "Expedition of the Risorgimento", "Expedition of Liberty"), "History", "The Expedition of the Thousand, led by Garibaldi in 1860, aimed to conquer the Kingdom of the Two Sicilies to unify Italy."),
            zh = LocalizedContent("加里波第的远征叫什么名字？", listOf("千人远征", "骑士远征", "复兴远征", "自由远征"), "历史", "由加里波第于1860年领导的千人远征旨在征服两西西里王国以统一意大利。"),
            es = LocalizedContent("¿Cómo se llamó la expedición de Garibaldi?", listOf("Expedición de los Mil", "Expedición de los Caballeros", "Expedición del Risorgimento", "Expedición de la Libertad"), "Historia", "La Expedición de los Mil, liderada por Garibaldi en 1860, tenía como objetivo conquistar el Reino de las Dos Sicilias para unificar Italia.")
        ),
        BilingualQuestion(
            id = 9270, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année Rome a-t-elle été annexée à l'Italie?", listOf("1860", "1867", "1869", "1870"), "Histoire", "L'annexion de Rome à l'Italie eut lieu en 1870, lorsque les troupes italiennes entrèrent dans la ville, mettant fin au pouvoir temporel des papes."),
            en = LocalizedContent("In which year was Rome annexed to Italy?", listOf("1860", "1867", "1869", "1870"), "History", "The annexation of Rome to Italy took place in 1870, when Italian troops entered the city, ending the temporal power of the popes."),
            zh = LocalizedContent("罗马在哪一年被并入意大利？", listOf("1860", "1867", "1869", "1870"), "历史", "罗马于1870年被并入意大利，当时意大利军队进入该城，结束了教皇的世俗权力。"),
            es = LocalizedContent("¿En qué año fue anexada Roma a Italia?", listOf("1860", "1867", "1869", "1870"), "Historia", "La anexión de Roma a Italia tuvo lugar en 1870, cuando las tropas italianas entraron en la ciudad, poniendo fin al poder temporal de los papas.")
        ),
        BilingualQuestion(
            id = 9271, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel événement a marqué la fin du pouvoir temporal du Pape?", listOf("L'annexion de Rome", "La Révolution de 1848", "La Guerre franco-prussienne", "L'unification italienne"), "Histoire", "L'annexion de Rome par le royaume d'Italie en 1870 a mis fin aux États pontificaux, supprimant le pouvoir temporel du pape sur un territoire."),
            en = LocalizedContent("What event marked the end of the Pope's temporal power?", listOf("The annexation of Rome", "The Revolution of 1848", "The Franco-Prussian War", "Italian unification"), "History", "The annexation of Rome by the Kingdom of Italy in 1870 ended the Papal States, removing the Pope's temporal power over a territory."),
            zh = LocalizedContent("哪个事件标志着教皇世俗权力的终结？", listOf("罗马的吞并", "1848年革命", "普法战争", "意大利统一"), "历史", "1870年意大利王国吞并罗马，结束了教皇国，从而剥夺了教皇对领土的世俗权力。"),
            es = LocalizedContent("¿Qué evento marcó el fin del poder temporal del Papa?", listOf("La anexión de Roma", "La Revolución de 1848", "La Guerra Franco-Prusiana", "La unificación italiana"), "Historia", "La anexión de Roma por el Reino de Italia en 1870 puso fin a los Estados Pontificios, eliminando el poder temporal del Papa sobre un territorio.")
        ),
        BilingualQuestion(
            id = 9272, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année l'Afrique a-t-elle été colonisée par les Européens?", listOf("1850", "1880", "1890", "1900"), "Histoire", "La colonisation européenne de l'Afrique s'est intensifiée à partir de 1880, marquant le début du \"partage de l'Afrique\" lors de la conférence de Berlin (1884-1885)."),
            en = LocalizedContent("In which year was Africa colonized by Europeans?", listOf("1850", "1880", "1890", "1900"), "History", "European colonization of Africa intensified from 1880, marking the beginning of the 'Scramble for Africa' during the Berlin Conference (1884-1885)."),
            zh = LocalizedContent("非洲在哪一年被欧洲人殖民？", listOf("1850", "1880", "1890", "1900"), "历史", "欧洲对非洲的殖民从1880年开始加剧，标志着柏林会议（1884-1885）期间“瓜分非洲”的开始。"),
            es = LocalizedContent("¿En qué año fue colonizada África por los europeos?", listOf("1850", "1880", "1890", "1900"), "Historia", "La colonización europea de África se intensificó a partir de 1880, marcando el inicio del 'Reparto de África' durante la Conferencia de Berlín (1884-1885).")
        ),
        BilingualQuestion(
            id = 9273, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année la Conférence de Berlin a-t-elle eu lieu?", listOf("1882", "1883", "1884", "1885"), "Histoire", "La Conférence de Berlin, qui s'est tenue de novembre 1884 à février 1885, a organisé le partage de l'Afrique entre les puissances européennes."),
            en = LocalizedContent("In which year did the Berlin Conference take place?", listOf("1882", "1883", "1884", "1885"), "History", "The Berlin Conference, held from November 1884 to February 1885, organized the partition of Africa among European powers."),
            zh = LocalizedContent("柏林会议在哪一年举行？", listOf("1882", "1883", "1884", "1885"), "历史", "柏林会议于1884年11月至1885年2月举行，组织了欧洲列强对非洲的瓜分。"),
            es = LocalizedContent("¿En qué año tuvo lugar la Conferencia de Berlín?", listOf("1882", "1883", "1884", "1885"), "Historia", "La Conferencia de Berlín, celebrada de noviembre de 1884 a febrero de 1885, organizó el reparto de África entre las potencias europeas.")
        ),
        BilingualQuestion(
            id = 9274, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a présidé la Conférence de Berlin?", listOf("Léopold II", "Otto von Bismarck", "Jules Ferry", "Stanley"), "Histoire", "La Conférence de Berlin (1884-1885) sur le partage de l'Afrique fut organisée et présidée par le chancelier allemand Otto von Bismarck."),
            en = LocalizedContent("Who presided over the Berlin Conference?", listOf("Leopold II", "Otto von Bismarck", "Jules Ferry", "Stanley"), "History", "The Berlin Conference (1884-1885) on the partition of Africa was organized and presided over by German Chancellor Otto von Bismarck."),
            zh = LocalizedContent("谁主持了柏林会议？", listOf("利奥波德二世", "奥托·冯·俾斯麦", "朱尔·费里", "斯坦利"), "历史", "关于瓜分非洲的柏林会议（1884-1885）由德国总理奥托·冯·俾斯麦组织和主持。"),
            es = LocalizedContent("¿Quién presidió la Conferencia de Berlín?", listOf("Leopoldo II", "Otto von Bismarck", "Jules Ferry", "Stanley"), "Historia", "La Conferencia de Berlín (1884-1885) sobre el reparto de África fue organizada y presidida por el canciller alemán Otto von Bismarck.")
        ),
        BilingualQuestion(
            id = 9275, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel était l'objectif de la Conférence de Berlin?", listOf("Coloniser l'Afrique", "Diviser l'Afrique", "Établir les règles du commerce africain", "Tous les trois"), "Histoire", "La conférence de Berlin (1884-1885) a fixé les règles du partage colonial de l'Afrique entre les puissances européennes, sans consulter les populations locales."),
            en = LocalizedContent("What was the objective of the Berlin Conference?", listOf("Colonize Africa", "Divide Africa", "Establish rules for African trade", "All three"), "History", "The Berlin Conference (1884-1885) set the rules for the colonial partition of Africa among European powers, without consulting local populations."),
            zh = LocalizedContent("柏林会议的目标是什么？", listOf("殖民非洲", "瓜分非洲", "制定非洲贸易规则", "以上所有"), "历史", "柏林会议（1884-1885）制定了欧洲列强殖民瓜分非洲的规则，未咨询当地民众。"),
            es = LocalizedContent("¿Cuál fue el objetivo de la Conferencia de Berlín?", listOf("Colonizar África", "Dividir África", "Establecer reglas para el comercio africano", "Los tres"), "Historia", "La Conferencia de Berlín (1884-1885) fijó las reglas del reparto colonial de África entre las potencias europeas, sin consultar a las poblaciones locales.")
        ),
        BilingualQuestion(
            id = 9276, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel roi belge a contrôlé le Congo?", listOf("Léopold Ier", "Léopold II", "Léopold III", "Albert Ier"), "Histoire", "Léopold II a dirigé l'État indépendant du Congo de 1885 à 1908, une période marquée par l'exploitation des ressources et des violences contre la population locale."),
            en = LocalizedContent("Which Belgian king controlled the Congo?", listOf("Leopold I", "Leopold II", "Leopold III", "Albert I"), "History", "Leopold II ruled the Congo Free State from 1885 to 1908, a period marked by resource exploitation and violence against the local population."),
            zh = LocalizedContent("哪位比利时国王控制了刚果？", listOf("利奥波德一世", "利奥波德二世", "利奥波德三世", "阿尔贝一世"), "历史", "利奥波德二世从1885年到1908年统治刚果自由邦，这一时期以资源剥削和对当地居民的暴力为特征。"),
            es = LocalizedContent("¿Qué rey belga controló el Congo?", listOf("Leopoldo I", "Leopoldo II", "Leopoldo III", "Alberto I"), "Historia", "Leopoldo II gobernó el Estado Libre del Congo de 1885 a 1908, un período marcado por la explotación de recursos y la violencia contra la población local.")
        ),
        BilingualQuestion(
            id = 9277, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année la Reine Victoria a-t-elle accédé au trône?", listOf("1835", "1837", "1840", "1845"), "Histoire", "Victoria monta sur le trône britannique en 1837 à l'âge de 18 ans, après la mort de son oncle, le roi Guillaume IV."),
            en = LocalizedContent("In which year did Queen Victoria ascend to the throne?", listOf("1835", "1837", "1840", "1845"), "History", "Victoria ascended the British throne in 1837 at the age of 18, after the death of her uncle, King William IV."),
            zh = LocalizedContent("维多利亚女王在哪一年登基？", listOf("1835", "1837", "1840", "1845"), "历史", "维多利亚于1837年在其叔父威廉四世去世后登上英国王位，时年18岁。"),
            es = LocalizedContent("¿En qué año ascendió al trono la reina Victoria?", listOf("1835", "1837", "1840", "1845"), "Historia", "Victoria ascendió al trono británico en 1837 a los 18 años, tras la muerte de su tío, el rey Guillermo IV.")
        ),
        BilingualQuestion(
            id = 9278, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Combien d'années Victoria a-t-elle régné?", listOf("50", "60", "64", "70"), "Histoire", "Le règne de la reine Victoria a duré de 1837 à 1901, soit 63 ans et sept mois, ce qui est souvent arrondi à 64 ans."),
            en = LocalizedContent("How many years did Victoria reign?", listOf("50", "60", "64", "70"), "History", "Queen Victoria's reign lasted from 1837 to 1901, a total of 63 years and seven months, often rounded to 64 years."),
            zh = LocalizedContent("维多利亚统治了多少年？", listOf("50", "60", "64", "70"), "历史", "维多利亚女王的统治从1837年持续到1901年，共63年零7个月，通常四舍五入为64年。"),
            es = LocalizedContent("¿Cuántos años reinó Victoria?", listOf("50", "60", "64", "70"), "Historia", "El reinado de la reina Victoria duró de 1837 a 1901, un total de 63 años y siete meses, a menudo redondeado a 64 años.")
        ),
        BilingualQuestion(
            id = 9279, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel était le surnom de l'époque du règne de Victoria?", listOf("L'époque géorgienne", "L'époque victorienne", "L'époque édouardienne", "L'époque georgienne"), "Histoire", "Victoria a régné sur le Royaume-Uni de 1837 à 1901, une période marquée par l'expansion industrielle et culturelle, d'où le nom d'époque victorienne donné à son règne."),
            en = LocalizedContent("What was the nickname of the era of Victoria's reign?", listOf("Georgian era", "Victorian era", "Edwardian era", "Georgian era"), "History", "Victoria reigned over the United Kingdom from 1837 to 1901, a period marked by industrial and cultural expansion, hence the name Victorian era for her reign."),
            zh = LocalizedContent("维多利亚统治时期的别称是什么？", listOf("乔治时代", "维多利亚时代", "爱德华时代", "乔治时代"), "历史", "维多利亚从1837年到1901年统治英国，这一时期以工业和文化的扩张为特征，因此她的统治时期被称为维多利亚时代。"),
            es = LocalizedContent("¿Cuál fue el apodo de la época del reinado de Victoria?", listOf("Época georgiana", "Época victoriana", "Época eduardiana", "Época georgiana"), "Historia", "Victoria reinó sobre el Reino Unido de 1837 a 1901, un período marcado por la expansión industrial y cultural, de ahí el nombre de época victoriana para su reinado.")
        ),
        BilingualQuestion(
            id = 9280, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année Albert a-t-il épousé Victoria?", listOf("1835", "1837", "1839", "1840"), "Histoire", "Le mariage de la reine Victoria et du prince Albert a eu lieu le 10 février 1840, après des fiançailles officialisées en octobre 1839."),
            en = LocalizedContent("In which year did Albert marry Victoria?", listOf("1835", "1837", "1839", "1840"), "History", "The marriage of Queen Victoria and Prince Albert took place on February 10, 1840, after an engagement formalized in October 1839."),
            zh = LocalizedContent("阿尔伯特在哪一年与维多利亚结婚？", listOf("1835", "1837", "1839", "1840"), "历史", "维多利亚女王与阿尔伯特亲王的婚礼于1840年2月10日举行，此前订婚于1839年10月正式确定。"),
            es = LocalizedContent("¿En qué año se casó Alberto con Victoria?", listOf("1835", "1837", "1839", "1840"), "Historia", "La boda de la reina Victoria y el príncipe Alberto tuvo lugar el 10 de febrero de 1840, tras un compromiso formalizado en octubre de 1839.")
        ),
        BilingualQuestion(
            id = 9281, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année Albert est-il mort?", listOf("1859", "1860", "1861", "1862"), "Histoire", "Albert, prince consort du Royaume-Uni et époux de la reine Victoria, est mort en 1861 des suites d'une fièvre typhoïde."),
            en = LocalizedContent("In which year did Albert die?", listOf("1859", "1860", "1861", "1862"), "History", "Albert, Prince Consort of the United Kingdom and husband of Queen Victoria, died in 1861 from typhoid fever."),
            zh = LocalizedContent("阿尔伯特在哪一年去世？", listOf("1859", "1860", "1861", "1862"), "历史", "阿尔伯特，英国王夫、维多利亚女王的丈夫，于1861年因伤寒去世。"),
            es = LocalizedContent("¿En qué año murió Alberto?", listOf("1859", "1860", "1861", "1862"), "Historia", "Alberto, príncipe consorte del Reino Unido y esposo de la reina Victoria, murió en 1861 a causa de la fiebre tifoidea.")
        ),
        BilingualQuestion(
            id = 9282, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel était le monument construit en l'honneur d'Albert?", listOf("Le Palais de Crystal", "Le Albert Memorial", "L'Abbaye de Westminster", "Big Ben"), "Histoire", "Le Albert Memorial est un monument situé à Londres, érigé à la mémoire du prince Albert, époux de la reine Victoria, après sa mort en 1861."),
            en = LocalizedContent("What was the monument built in honor of Albert?", listOf("The Crystal Palace", "The Albert Memorial", "Westminster Abbey", "Big Ben"), "History", "The Albert Memorial is a monument in London, erected in memory of Prince Albert, husband of Queen Victoria, after his death in 1861."),
            zh = LocalizedContent("为纪念阿尔伯特而建造的纪念碑是什么？", listOf("水晶宫", "阿尔伯特纪念亭", "威斯敏斯特教堂", "大本钟"), "历史", "阿尔伯特纪念亭是伦敦的一座纪念碑，为纪念维多利亚女王的丈夫阿尔伯特亲王于1861年去世后而建。"),
            es = LocalizedContent("¿Cuál fue el monumento construido en honor a Alberto?", listOf("El Palacio de Cristal", "El Monumento a Alberto", "La Abadía de Westminster", "Big Ben"), "Historia", "El Monumento a Alberto es un monumento en Londres, erigido en memoria del príncipe Alberto, esposo de la reina Victoria, tras su muerte en 1861.")
        ),
        BilingualQuestion(
            id = 9283, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année l'Exposition universelle de 1851 a-t-elle eu lieu?", listOf("1849", "1850", "1851", "1852"), "Histoire", "L'Exposition universelle de 1851 s'est tenue à Londres, au Crystal Palace, et a été la première exposition internationale des produits de l'industrie."),
            en = LocalizedContent("In which year did the 1851 Great Exhibition take place?", listOf("1849", "1850", "1851", "1852"), "History", "The 1851 Great Exhibition was held in London at the Crystal Palace and was the first international exhibition of industrial products."),
            zh = LocalizedContent("1851年万国工业博览会在哪一年举行？", listOf("1849", "1850", "1851", "1852"), "历史", "1851年万国工业博览会在伦敦水晶宫举行，是首届国际工业产品展览会。"),
            es = LocalizedContent("¿En qué año tuvo lugar la Gran Exposición de 1851?", listOf("1849", "1850", "1851", "1852"), "Historia", "La Gran Exposición de 1851 se celebró en Londres, en el Crystal Palace, y fue la primera exposición internacional de productos industriales.")
        ),
        BilingualQuestion(
            id = 9284, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Où l'Exposition universelle de 1851 a-t-elle eu lieu?", listOf("Paris", "Londres", "Amsterdam", "Berlin"), "Histoire", "La Grande Exposition de 1851 s'est tenue à Hyde Park à Londres, dans le célèbre Crystal Palace, un bâtiment innovant en verre et en fer."),
            en = LocalizedContent("Where did the 1851 Great Exhibition take place?", listOf("Paris", "London", "Amsterdam", "Berlin"), "History", "The Great Exhibition of 1851 was held in Hyde Park, London, in the famous Crystal Palace, an innovative building of glass and iron."),
            zh = LocalizedContent("1851年万国工业博览会在哪里举行？", listOf("巴黎", "伦敦", "阿姆斯特丹", "柏林"), "历史", "1851年万国工业博览会在伦敦海德公园的水晶宫举行，这是一座由玻璃和铁建造的创新建筑。"),
            es = LocalizedContent("¿Dónde tuvo lugar la Gran Exposición de 1851?", listOf("París", "Londres", "Ámsterdam", "Berlín"), "Historia", "La Gran Exposición de 1851 se celebró en Hyde Park, Londres, en el famoso Crystal Palace, un innovador edificio de vidrio y hierro.")
        ),
        BilingualQuestion(
            id = 9285, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel était le bâtiment principal de l'Exposition de 1851?", listOf("Le Palais des Machines", "Le Palais de Crystal", "La Tour Eiffel", "Le Palais de l'Industrie"), "Histoire", "Le Palais de Cristal, immense structure de verre et de fer, fut construit à Hyde Park pour accueillir la Grande Exposition de 1851, symbole de l'innovation industrielle britannique."),
            en = LocalizedContent("What was the main building of the 1851 Exhibition?", listOf("The Palace of Machines", "The Crystal Palace", "The Eiffel Tower", "The Palace of Industry"), "History", "The Crystal Palace, a huge structure of glass and iron, was built in Hyde Park to host the Great Exhibition of 1851, a symbol of British industrial innovation."),
            zh = LocalizedContent("1851年博览会的主要建筑是什么？", listOf("机器宫", "水晶宫", "埃菲尔铁塔", "工业宫"), "历史", "水晶宫是一座巨大的玻璃和铁结构建筑，建于海德公园，用于举办1851年万国工业博览会，是英国工业创新的象征。"),
            es = LocalizedContent("¿Cuál fue el edificio principal de la Exposición de 1851?", listOf("El Palacio de las Máquinas", "El Crystal Palace", "La Torre Eiffel", "El Palacio de la Industria"), "Historia", "El Crystal Palace, una enorme estructura de vidrio y hierro, fue construido en Hyde Park para albergar la Gran Exposición de 1851, símbolo de la innovación industrial británica.")
        ),
        BilingualQuestion(
            id = 9286, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année la Reine Victoria a-t-elle été proclamée Impératrice?", listOf("1872", "1875", "1876", "1877"), "Histoire", "Victoria fut proclamée impératrice des Indes en 1876 sur proposition du Premier ministre Disraeli, renforçant les liens entre la couronne britannique et son empire colonial indien."),
            en = LocalizedContent("In which year was Queen Victoria proclaimed Empress?", listOf("1872", "1875", "1876", "1877"), "History", "Victoria was proclaimed Empress of India in 1876 on the proposal of Prime Minister Disraeli, strengthening ties between the British crown and its Indian colonial empire."),
            zh = LocalizedContent("维多利亚女王在哪一年被宣布为女皇？", listOf("1872", "1875", "1876", "1877"), "历史", "维多利亚于1876年根据首相迪斯雷利的提议被宣布为印度女皇，加强了英国王室与其印度殖民帝国之间的联系。"),
            es = LocalizedContent("¿En qué año fue proclamada Emperatriz la reina Victoria?", listOf("1872", "1875", "1876", "1877"), "Historia", "Victoria fue proclamada Emperatriz de la India en 1876 por propuesta del primer ministro Disraeli, fortaleciendo los lazos entre la corona británica y su imperio colonial indio.")
        ),
        BilingualQuestion(
            id = 9287, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année Disraeli a-t-il proclamé Victoria Impératrice?", listOf("1872", "1875", "1876", "1877"), "Histoire", "En 1876, le Premier ministre britannique Benjamin Disraeli fit adopter le Royal Titles Act, qui ajouta le titre d'Impératrice des Indes à la reine Victoria, renforçant ainsi les liens entre la couronne britannique et l'empire colonial indien."),
            en = LocalizedContent("In which year did Disraeli proclaim Victoria Empress?", listOf("1872", "1875", "1876", "1877"), "History", "In 1876, British Prime Minister Benjamin Disraeli passed the Royal Titles Act, which added the title of Empress of India to Queen Victoria, thus strengthening ties between the British crown and the Indian colonial empire."),
            zh = LocalizedContent("迪斯雷利在哪一年宣布维多利亚为女皇？", listOf("1872", "1875", "1876", "1877"), "历史", "1876年，英国首相本杰明·迪斯雷利通过了《皇家头衔法案》，为维多利亚女王增加了印度女皇的头衔，从而加强了英国王室与印度殖民帝国之间的联系。"),
            es = LocalizedContent("¿En qué año proclamó Disraeli a Victoria Emperatriz?", listOf("1872", "1875", "1876", "1877"), "Historia", "En 1876, el primer ministro británico Benjamin Disraeli hizo aprobar la Ley de Títulos Reales, que añadió el título de Emperatriz de la India a la reina Victoria, fortaleciendo así los lazos entre la corona británica y el imperio colonial indio.")
        ),
        BilingualQuestion(
            id = 9288, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année la Reine Victoria est-elle morte?", listOf("1899", "1900", "1901", "1902"), "Histoire", "La reine Victoria est morte le 22 janvier 1901, après un règne de 63 ans, le plus long de l'histoire britannique à l'époque."),
            en = LocalizedContent("In which year did Queen Victoria die?", listOf("1899", "1900", "1901", "1902"), "History", "Queen Victoria died on January 22, 1901, after a reign of 63 years, the longest in British history at the time."),
            zh = LocalizedContent("维多利亚女王在哪一年去世？", listOf("1899", "1900", "1901", "1902"), "历史", "维多利亚女王于1901年1月22日去世，在位63年，是当时英国历史上在位时间最长的君主。"),
            es = LocalizedContent("¿En qué año murió la reina Victoria?", listOf("1899", "1900", "1901", "1902"), "Historia", "La reina Victoria murió el 22 de enero de 1901, tras un reinado de 63 años, el más largo de la historia británica en ese momento.")
        ),
        BilingualQuestion(
            id = 9289, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui a succédé à Victoria?", listOf("Georges V", "Édouard VII", "Georges VI", "Édouard VIII"), "Histoire", "Victoria, reine du Royaume-Uni, est décédée en 1901 après 63 ans de règne. Son fils aîné lui a succédé sous le nom d'Édouard VII."),
            en = LocalizedContent("Who succeeded Victoria?", listOf("George V", "Edward VII", "George VI", "Edward VIII"), "History", "Victoria, Queen of the United Kingdom, died in 1901 after a 63-year reign. Her eldest son succeeded her as Edward VII."),
            zh = LocalizedContent("谁继承了维多利亚的王位？", listOf("乔治五世", "爱德华七世", "乔治六世", "爱德华八世"), "历史", "英国维多利亚女王于1901年去世，在位63年。她的长子继位，成为爱德华七世。"),
            es = LocalizedContent("¿Quién sucedió a Victoria?", listOf("Jorge V", "Eduardo VII", "Jorge VI", "Eduardo VIII"), "Historia", "Victoria, reina del Reino Unido, falleció en 1901 tras 63 años de reinado. Su hijo mayor le sucedió como Eduardo VII.")
        ),
        BilingualQuestion(
            id = 9290, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année Édouard VII a-t-il accédé au trône?", listOf("1899", "1900", "1901", "1902"), "Histoire", "Édouard VII succède à sa mère, la reine Victoria, morte le 22 janvier 1901, après un long règne de 63 ans. Il devient roi à l'âge de 59 ans."),
            en = LocalizedContent("In which year did Edward VII ascend the throne?", listOf("1899", "1900", "1901", "1902"), "History", "Edward VII succeeded his mother, Queen Victoria, who died on January 22, 1901, after a long reign of 63 years. He became king at the age of 59."),
            zh = LocalizedContent("爱德华七世在哪一年登基？", listOf("1899", "1900", "1901", "1902"), "历史", "爱德华七世在其母亲维多利亚女王于1901年1月22日去世后继位，维多利亚女王在位长达63年。他登基时59岁。"),
            es = LocalizedContent("¿En qué año accedió Eduardo VII al trono?", listOf("1899", "1900", "1901", "1902"), "Historia", "Eduardo VII sucedió a su madre, la reina Victoria, fallecida el 22 de enero de 1901, tras un largo reinado de 63 años. Se convirtió en rey a los 59 años.")
        ),
        BilingualQuestion(
            id = 9291, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année l'Alliance franco-russe a-t-elle été formée?", listOf("1891", "1892", "1893", "1894"), "Histoire", "L'Alliance franco-russe a été officialisée par une convention militaire secrète en 1894, mettant fin à l'isolement diplomatique de la France et créant un contrepoids à la Triple Alliance."),
            en = LocalizedContent("In which year was the Franco-Russian Alliance formed?", listOf("1891", "1892", "1893", "1894"), "History", "The Franco-Russian Alliance was formalized by a secret military convention in 1894, ending France's diplomatic isolation and creating a counterbalance to the Triple Alliance."),
            zh = LocalizedContent("法俄同盟在哪一年成立？", listOf("1891", "1892", "1893", "1894"), "历史", "法俄同盟于1894年通过一项秘密军事公约正式确立，结束了法国的外交孤立，并制衡了三国同盟。"),
            es = LocalizedContent("¿En qué año se formó la Alianza Franco-Rusa?", listOf("1891", "1892", "1893", "1894"), "Historia", "La Alianza Franco-Rusa se formalizó mediante una convención militar secreta en 1894, poniendo fin al aislamiento diplomático de Francia y creando un contrapeso a la Triple Alianza.")
        ),
        BilingualQuestion(
            id = 9292, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année l'Entente cordiale a-t-elle été signée?", listOf("1902", "1904", "1906", "1908"), "Histoire", "L'Entente cordiale, signée le 8 avril 1904, mit fin aux rivalités coloniales entre la France et le Royaume-Uni, posant les bases de leur alliance future lors des deux guerres mondiales."),
            en = LocalizedContent("In which year was the Entente Cordiale signed?", listOf("1902", "1904", "1906", "1908"), "History", "The Entente Cordiale, signed on April 8, 1904, ended colonial rivalries between France and the United Kingdom, laying the foundations for their future alliance in both world wars."),
            zh = LocalizedContent("英法协约在哪一年签署？", listOf("1902", "1904", "1906", "1908"), "历史", "英法协约于1904年4月8日签署，结束了法国与英国之间的殖民竞争，为两国在两次世界大战中的同盟奠定了基础。"),
            es = LocalizedContent("¿En qué año se firmó la Entente Cordiale?", listOf("1902", "1904", "1906", "1908"), "Historia", "La Entente Cordiale, firmada el 8 de abril de 1904, puso fin a las rivalidades coloniales entre Francia y el Reino Unido, sentando las bases de su futura alianza durante las dos guerras mundiales.")
        ),
        BilingualQuestion(
            id = 9293, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année l'Accord anglo-russe a-t-il été signé?", listOf("1904", "1905", "1906", "1907"), "Histoire", "Signé en 1907, cet accord mit fin aux rivalités coloniales entre la Russie et le Royaume-Uni en Asie, notamment en Perse, en Afghanistan et au Tibet, et contribua à la formation de la Triple-Entente."),
            en = LocalizedContent("In which year was the Anglo-Russian Convention signed?", listOf("1904", "1905", "1906", "1907"), "History", "Signed in 1907, this agreement ended colonial rivalries between Russia and the United Kingdom in Asia, particularly in Persia, Afghanistan, and Tibet, and contributed to the formation of the Triple Entente."),
            zh = LocalizedContent("英俄协约在哪一年签署？", listOf("1904", "1905", "1906", "1907"), "历史", "该协议于1907年签署，结束了俄罗斯与英国在亚洲（特别是波斯、阿富汗和西藏）的殖民竞争，并促成了三国协约的形成。"),
            es = LocalizedContent("¿En qué año se firmó el Acuerdo Anglo-Ruso?", listOf("1904", "1905", "1906", "1907"), "Historia", "Firmado en 1907, este acuerdo puso fin a las rivalidades coloniales entre Rusia y el Reino Unido en Asia, especialmente en Persia, Afganistán y el Tíbet, y contribuyó a la formación de la Triple Entente.")
        ),
        BilingualQuestion(
            id = 9294, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année la Triple Alliance a-t-elle été formée?", listOf("1880", "1882", "1884", "1886"), "Histoire", "La Triple Alliance, liant l'Allemagne, l'Autriche-Hongrie et l'Italie, a été signée en 1882 pour contrer l'influence de la France et de la Russie."),
            en = LocalizedContent("In which year was the Triple Alliance formed?", listOf("1880", "1882", "1884", "1886"), "History", "The Triple Alliance, linking Germany, Austria-Hungary, and Italy, was signed in 1882 to counter the influence of France and Russia."),
            zh = LocalizedContent("三国同盟在哪一年成立？", listOf("1880", "1882", "1884", "1886"), "历史", "三国同盟于1882年签署，连接德国、奥匈帝国和意大利，旨在对抗法国和俄罗斯的影响力。"),
            es = LocalizedContent("¿En qué año se formó la Triple Alianza?", listOf("1880", "1882", "1884", "1886"), "Historia", "La Triple Alianza, que vinculaba a Alemania, Austria-Hungría e Italia, se firmó en 1882 para contrarrestar la influencia de Francia y Rusia.")
        ),
        BilingualQuestion(
            id = 9295, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quels pays formaient la Triple Alliance?", listOf("France, Russie, Grande-Bretagne", "Allemagne, Autriche-Hongrie, Italie", "Allemagne, Prusse, Saxe", "France, Belgique, Hollande"), "Histoire", "La Triple Alliance, signée en 1882, était un pacte militaire défensif entre l'Allemagne, l'Autriche-Hongrie et l'Italie, visant à isoler la France et à maintenir l'équilibre des puissances en Europe."),
            en = LocalizedContent("Which countries formed the Triple Alliance?", listOf("France, Russia, Great Britain", "Germany, Austria-Hungary, Italy", "Germany, Prussia, Saxony", "France, Belgium, Netherlands"), "History", "The Triple Alliance, signed in 1882, was a defensive military pact between Germany, Austria-Hungary, and Italy, aimed at isolating France and maintaining the balance of power in Europe."),
            zh = LocalizedContent("哪些国家组成了三国同盟？", listOf("法国、俄罗斯、英国", "德国、奥匈帝国、意大利", "德国、普鲁士、萨克森", "法国、比利时、荷兰"), "历史", "三国同盟于1882年签署，是德国、奥匈帝国和意大利之间的防御性军事条约，旨在孤立法国并维持欧洲的力量平衡。"),
            es = LocalizedContent("¿Qué países formaban la Triple Alianza?", listOf("Francia, Rusia, Gran Bretaña", "Alemania, Austria-Hungría, Italia", "Alemania, Prusia, Sajonia", "Francia, Bélgica, Países Bajos"), "Historia", "La Triple Alianza, firmada en 1882, era un pacto militar defensivo entre Alemania, Austria-Hungría e Italia, destinado a aislar a Francia y mantener el equilibrio de poder en Europa.")
        ),
        BilingualQuestion(
            id = 9296, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année la Crise marocaine a-t-elle commencé?", listOf("1903", "1904", "1905", "1906"), "Histoire", "La première crise marocaine a débuté en 1905 suite à la visite de l'empereur allemand Guillaume II à Tanger, contestant l'influence française au Maroc."),
            en = LocalizedContent("In which year did the Moroccan Crisis begin?", listOf("1903", "1904", "1905", "1906"), "History", "The first Moroccan Crisis began in 1905 following the visit of German Emperor Wilhelm II to Tangier, challenging French influence in Morocco."),
            zh = LocalizedContent("摩洛哥危机在哪一年开始？", listOf("1903", "1904", "1905", "1906"), "历史", "第一次摩洛哥危机始于1905年，起因是德国皇帝威廉二世访问丹吉尔，挑战法国在摩洛哥的影响力。"),
            es = LocalizedContent("¿En qué año comenzó la Crisis Marroquí?", listOf("1903", "1904", "1905", "1906"), "Historia", "La primera crisis marroquí comenzó en 1905 tras la visita del emperador alemán Guillermo II a Tánger, desafiando la influencia francesa en Marruecos.")
        ),
        BilingualQuestion(
            id = 9297, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année la Crise bosniaque a-t-elle eu lieu?", listOf("1905", "1906", "1907", "1908"), "Histoire", "La Crise bosniaque de 1908 a éclaté après l'annexion officielle de la Bosnie-Herzégovine par l'Autriche-Hongrie, violant le traité de Berlin de 1878 et provoquant des tensions avec la Serbie et la Russie."),
            en = LocalizedContent("In which year did the Bosnian Crisis take place?", listOf("1905", "1906", "1907", "1908"), "History", "The Bosnian Crisis of 1908 erupted after Austria-Hungary's official annexation of Bosnia-Herzegovina, violating the Treaty of Berlin of 1878 and causing tensions with Serbia and Russia."),
            zh = LocalizedContent("波斯尼亚危机发生在哪一年？", listOf("1905", "1906", "1907", "1908"), "历史", "1908年的波斯尼亚危机在奥匈帝国正式吞并波斯尼亚和黑塞哥维那后爆发，违反了1878年的柏林条约，并引发了与塞尔维亚和俄罗斯的紧张关系。"),
            es = LocalizedContent("¿En qué año tuvo lugar la Crisis Bosnia?", listOf("1905", "1906", "1907", "1908"), "Historia", "La Crisis Bosnia de 1908 estalló tras la anexión oficial de Bosnia-Herzegovina por Austria-Hungría, violando el Tratado de Berlín de 1878 y provocando tensiones con Serbia y Rusia.")
        ),
        BilingualQuestion(
            id = 9298, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année la Guerre russo-japonaise a-t-elle commencé?", listOf("1902", "1903", "1904", "1905"), "Histoire", "Le conflit éclata en 1904, opposant l'Empire russe et l'Empire du Japon pour le contrôle de la Mandchourie et de la Corée."),
            en = LocalizedContent("In which year did the Russo-Japanese War begin?", listOf("1902", "1903", "1904", "1905"), "History", "The conflict broke out in 1904, opposing the Russian Empire and the Empire of Japan for control of Manchuria and Korea."),
            zh = LocalizedContent("日俄战争在哪一年开始？", listOf("1902", "1903", "1904", "1905"), "历史", "冲突于1904年爆发，俄罗斯帝国与日本帝国为争夺满洲和朝鲜的控制权而战。"),
            es = LocalizedContent("¿En qué año comenzó la Guerra Ruso-Japonesa?", listOf("1902", "1903", "1904", "1905"), "Historia", "El conflicto estalló en 1904, enfrentando al Imperio Ruso y al Imperio de Japón por el control de Manchuria y Corea.")
        ),
        BilingualQuestion(
            id = 9299, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année la Guerre russo-japonaise s'est-elle terminée?", listOf("1904", "1905", "1906", "1907"), "Histoire", "La guerre russo-japonaise s'est achevée en 1905 avec la signature du traité de Portsmouth, négocié par les États-Unis. Le Japon en sortit vainqueur, marquant la première défaite d'une puissance européenne face à une nation asiatique à l'époque moderne."),
            en = LocalizedContent("In which year did the Russo-Japanese War end?", listOf("1904", "1905", "1906", "1907"), "History", "The Russo-Japanese War ended in 1905 with the signing of the Treaty of Portsmouth, mediated by the United States. Japan emerged victorious, marking the first defeat of a European power by an Asian nation in modern times."),
            zh = LocalizedContent("日俄战争在哪一年结束？", listOf("1904", "1905", "1906", "1907"), "历史", "日俄战争于1905年结束，双方签署了由美国斡旋的《朴茨茅斯和约》。日本获胜，标志着现代史上欧洲强国首次被亚洲国家击败。"),
            es = LocalizedContent("¿En qué año terminó la Guerra Ruso-Japonesa?", listOf("1904", "1905", "1906", "1907"), "Historia", "La Guerra Ruso-Japonesa terminó en 1905 con la firma del Tratado de Portsmouth, negociado por Estados Unidos. Japón resultó victorioso, marcando la primera derrota de una potencia europea por una nación asiática en la era moderna.")
        ),
        BilingualQuestion(
            id = 9300, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a remporté la Guerre russo-japonaise?", listOf("La Russie", "Le Japon", "L'Allemagne", "La France"), "Histoire", "Le conflit de 1904-1905 opposa l'Empire russe et l'Empire japonais pour le contrôle de la Mandchourie et de la Corée. Le Japon remporta une victoire décisive, marquant la première défaite d'une puissance européenne face à une nation asiatique à l'époque moderne."),
            en = LocalizedContent("Who won the Russo-Japanese War?", listOf("Russia", "Japan", "Germany", "France"), "History", "The 1904-1905 conflict between the Russian Empire and the Empire of Japan over control of Manchuria and Korea ended with a decisive Japanese victory, marking the first time a European power was defeated by an Asian nation in modern times."),
            zh = LocalizedContent("谁赢得了日俄战争？", listOf("俄罗斯", "日本", "德国", "法国"), "历史", "1904-1905年的冲突是俄罗斯帝国与日本帝国为争夺满洲和朝鲜的控制权而战。日本取得了决定性胜利，标志着近代以来欧洲强国首次被亚洲国家击败。"),
            es = LocalizedContent("¿Quién ganó la Guerra Ruso-Japonesa?", listOf("Rusia", "Japón", "Alemania", "Francia"), "Historia", "El conflicto de 1904-1905 entre el Imperio ruso y el Imperio japonés por el control de Manchuria y Corea terminó con una victoria decisiva japonesa, marcando la primera vez que una potencia europea era derrotada por una nación asiática en la era moderna.")
        ),
        BilingualQuestion(
            id = 9301, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année la Révolution russe de 1905 a-t-elle eu lieu?", listOf("1903", "1904", "1905", "1906"), "Histoire", "La révolution de 1905 tire son nom de l'année où elle s'est déroulée, marquée par des grèves et des soulèvements contre le régime tsariste."),
            en = LocalizedContent("In which year did the Russian Revolution of 1905 take place?", listOf("1903", "1904", "1905", "1906"), "History", "The 1905 Revolution is named after the year it occurred, marked by strikes and uprisings against the tsarist regime."),
            zh = LocalizedContent("1905年俄国革命发生在哪一年？", listOf("1903", "1904", "1905", "1906"), "历史", "1905年革命以其发生的年份命名，期间发生了反对沙皇政权的罢工和起义。"),
            es = LocalizedContent("¿En qué año tuvo lugar la Revolución Rusa de 1905?", listOf("1903", "1904", "1905", "1906"), "Historia", "La Revolución de 1905 recibe su nombre del año en que ocurrió, caracterizada por huelgas y levantamientos contra el régimen zarista.")
        ),
        BilingualQuestion(
            id = 9302, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel était l'événement déclencheur de la Révolution de 1905?", listOf("L'Incident du Dimanche rouge", "La Famine", "La Défaite au Japon", "L'Assassinat du Tsar"), "Histoire", "Le Dimanche rouge du 9 janvier 1905, où l'armée impériale a tiré sur une manifestation pacifique d'ouvriers à Saint-Pétersbourg, a brisé la confiance populaire envers le tsar et déclenché une vague de grèves et de révoltes."),
            en = LocalizedContent("What was the triggering event of the 1905 Revolution?", listOf("Bloody Sunday Incident", "The Famine", "Defeat by Japan", "Assassination of the Tsar"), "History", "Bloody Sunday on January 9, 1905, when the imperial army fired on a peaceful workers' demonstration in St. Petersburg, shattered popular trust in the tsar and sparked a wave of strikes and revolts."),
            zh = LocalizedContent("1905年革命的导火索是什么？", listOf("血腥星期日事件", "饥荒", "被日本击败", "沙皇遇刺"), "历史", "1905年1月9日的血腥星期日，帝国军队向圣彼得堡和平示威的工人开枪，粉碎了民众对沙皇的信任，引发了罢工和起义浪潮。"),
            es = LocalizedContent("¿Cuál fue el evento desencadenante de la Revolución de 1905?", listOf("Incidente del Domingo Sangriento", "La hambruna", "La derrota ante Japón", "El asesinato del zar"), "Historia", "El Domingo Sangriento del 9 de enero de 1905, cuando el ejército imperial disparó contra una manifestación pacífica de trabajadores en San Petersburgo, rompió la confianza popular en el zar y desencadenó una ola de huelgas y revueltas.")
        ),
        BilingualQuestion(
            id = 9303, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année le Manifeste d'octobre a-t-il été publié?", listOf("1903", "1904", "1905", "1906"), "Histoire", "Le Manifeste d'octobre a été publié en 1905 par le tsar Nicolas II, sous la pression de la révolution russe de 1905, promettant des libertés civiles et la création d'une Douma."),
            en = LocalizedContent("In which year was the October Manifesto published?", listOf("1903", "1904", "1905", "1906"), "History", "The October Manifesto was published in 1905 by Tsar Nicholas II under pressure from the Russian Revolution of 1905, promising civil liberties and the creation of a Duma."),
            zh = LocalizedContent("十月宣言是在哪一年发布的？", listOf("1903", "1904", "1905", "1906"), "历史", "十月宣言于1905年由沙皇尼古拉二世在1905年俄国革命的压力下发布，承诺给予公民自由并建立杜马。"),
            es = LocalizedContent("¿En qué año se publicó el Manifiesto de Octubre?", listOf("1903", "1904", "1905", "1906"), "Historia", "El Manifiesto de Octubre fue publicado en 1905 por el zar Nicolás II bajo la presión de la Revolución Rusa de 1905, prometiendo libertades civiles y la creación de una Duma.")
        ),
        BilingualQuestion(
            id = 9304, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a publié le Manifeste d'octobre?", listOf("Lénine", "Trotski", "Nicolas II", "Witte"), "Histoire", "Le Manifeste d'octobre, promulgué en 1905 sous la pression de la révolution russe, fut rédigé et publié par le comte Serge Witte, alors président du Conseil des ministres de l'Empire russe."),
            en = LocalizedContent("Who published the October Manifesto?", listOf("Lenin", "Trotsky", "Nicholas II", "Witte"), "History", "The October Manifesto, promulgated in 1905 under pressure from the Russian Revolution, was drafted and published by Count Sergei Witte, then Chairman of the Council of Ministers of the Russian Empire."),
            zh = LocalizedContent("谁发布了十月宣言？", listOf("列宁", "托洛茨基", "尼古拉二世", "维特"), "历史", "十月宣言于1905年在俄国革命的压力下颁布，由时任俄罗斯帝国大臣会议主席的谢尔盖·维特伯爵起草并发布。"),
            es = LocalizedContent("¿Quién publicó el Manifiesto de Octubre?", listOf("Lenin", "Trotski", "Nicolás II", "Witte"), "Historia", "El Manifiesto de Octubre, promulgado en 1905 bajo la presión de la Revolución Rusa, fue redactado y publicado por el conde Serguéi Witte, entonces presidente del Consejo de Ministros del Imperio ruso.")
        ),
        BilingualQuestion(
            id = 9305, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année la Douma a-t-elle été établie?", listOf("1904", "1905", "1906", "1907"), "Histoire", "La Douma d'État a été créée en 1906 suite à la Révolution russe de 1905, lorsque le tsar Nicolas II a accepté de former un parlement élu pour apaiser les troubles politiques."),
            en = LocalizedContent("In which year was the Duma established?", listOf("1904", "1905", "1906", "1907"), "History", "The State Duma was created in 1906 following the Russian Revolution of 1905, when Tsar Nicholas II agreed to form an elected parliament to quell political unrest."),
            zh = LocalizedContent("杜马是在哪一年建立的？", listOf("1904", "1905", "1906", "1907"), "历史", "国家杜马于1906年成立，是在1905年俄国革命后，沙皇尼古拉二世同意组建选举产生的议会以平息政治动荡。"),
            es = LocalizedContent("¿En qué año se estableció la Duma?", listOf("1904", "1905", "1906", "1907"), "Historia", "La Duma Estatal fue creada en 1906 tras la Revolución Rusa de 1905, cuando el zar Nicolás II aceptó formar un parlamento electo para calmar los disturbios políticos.")
        ),
        BilingualQuestion(
            id = 9306, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui était le tsar de Russie en 1905?", listOf("Alexandre III", "Nicolas II", "Nicolas Ier", "Paul Ier"), "Histoire", "Nicolas II était le tsar de Russie en 1905, année marquée par la révolution russe et le Dimanche rouge."),
            en = LocalizedContent("Who was the Tsar of Russia in 1905?", listOf("Alexander III", "Nicholas II", "Nicholas I", "Paul I"), "History", "Nicholas II was the Tsar of Russia in 1905, a year marked by the Russian Revolution and Bloody Sunday."),
            zh = LocalizedContent("1905年俄国的沙皇是谁？", listOf("亚历山大三世", "尼古拉二世", "尼古拉一世", "保罗一世"), "历史", "尼古拉二世是1905年俄国的沙皇，这一年发生了俄国革命和血腥星期日事件。"),
            es = LocalizedContent("¿Quién era el zar de Rusia en 1905?", listOf("Alejandro III", "Nicolás II", "Nicolás I", "Pablo I"), "Historia", "Nicolás II era el zar de Rusia en 1905, año marcado por la Revolución Rusa y el Domingo Sangriento.")
        ),
        BilingualQuestion(
            id = 9307, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année Nicolas II a-t-il accédé au trône?", listOf("1890", "1894", "1898", "1900"), "Histoire", "Nicolas II devient tsar de Russie en 1894, après la mort de son père Alexandre III. Son règne s'achève avec son abdication en 1917, durant la révolution russe."),
            en = LocalizedContent("In which year did Nicholas II ascend the throne?", listOf("1890", "1894", "1898", "1900"), "History", "Nicholas II became Tsar of Russia in 1894 after the death of his father Alexander III. His reign ended with his abdication in 1917 during the Russian Revolution."),
            zh = LocalizedContent("尼古拉二世在哪一年登基？", listOf("1890", "1894", "1898", "1900"), "历史", "尼古拉二世于1894年在其父亚历山大三世去世后成为俄国沙皇。他的统治在1917年俄国革命期间因退位而结束。"),
            es = LocalizedContent("¿En qué año ascendió al trono Nicolás II?", listOf("1890", "1894", "1898", "1900"), "Historia", "Nicolás II se convirtió en zar de Rusia en 1894 tras la muerte de su padre Alejandro III. Su reinado terminó con su abdicación en 1917 durante la Revolución Rusa.")
        ),
        BilingualQuestion(
            id = 9308, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("En quelle année la Première Guerre mondiale s'est-elle déroulée?", listOf("1914-1917", "1914-1918", "1914-1919", "1914-1920"), "Histoire", "Le conflit débuta en juillet 1914 avec l'invasion de la Serbie par l'Autriche-Hongrie et s'acheva le 11 novembre 1918 par l'armistice signé à Rethondes."),
            en = LocalizedContent("In which years did World War I take place?", listOf("1914-1917", "1914-1918", "1914-1919", "1914-1920"), "History", "The conflict began in July 1914 with Austria-Hungary's invasion of Serbia and ended on November 11, 1918 with the armistice signed at Rethondes."),
            zh = LocalizedContent("第一次世界大战发生在哪几年？", listOf("1914-1917", "1914-1918", "1914-1919", "1914-1920"), "历史", "冲突始于1914年7月奥匈帝国入侵塞尔维亚，结束于1918年11月11日贡比涅停战协定的签署。"),
            es = LocalizedContent("¿En qué años tuvo lugar la Primera Guerra Mundial?", listOf("1914-1917", "1914-1918", "1914-1919", "1914-1920"), "Historia", "El conflicto comenzó en julio de 1914 con la invasión de Serbia por Austria-Hungría y terminó el 11 de noviembre de 1918 con el armisticio firmado en Rethondes.")
        ),
        BilingualQuestion(
            id = 9309, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel était le casus belli de la Première Guerre mondiale?", listOf("L'invasion de la Belgique", "L'assassinat de François-Ferdinand", "La crise marocaine", "La Bosnie"), "Histoire", "L'assassinat de l'archiduc François-Ferdinand, héritier du trône austro-hongrois, par un nationaliste serbe à Sarajevo le 28 juin 1914 a déclenché une crise diplomatique menant à la guerre."),
            en = LocalizedContent("What was the casus belli of World War I?", listOf("Invasion of Belgium", "Assassination of Franz Ferdinand", "Moroccan Crisis", "Bosnia"), "History", "The assassination of Archduke Franz Ferdinand, heir to the Austro-Hungarian throne, by a Serbian nationalist in Sarajevo on June 28, 1914, triggered a diplomatic crisis that led to war."),
            zh = LocalizedContent("第一次世界大战的宣战理由是什么？", listOf("入侵比利时", "弗朗茨·斐迪南遇刺", "摩洛哥危机", "波斯尼亚"), "历史", "1914年6月28日，奥匈帝国皇储弗朗茨·斐迪南大公在萨拉热窝被一名塞尔维亚民族主义者刺杀，引发了一场导致战争的外交危机。"),
            es = LocalizedContent("¿Cuál fue el casus belli de la Primera Guerra Mundial?", listOf("Invasión de Bélgica", "Asesinato de Francisco Fernando", "Crisis marroquí", "Bosnia"), "Historia", "El asesinato del archiduque Francisco Fernando, heredero del trono austrohúngaro, por un nacionalista serbio en Sarajevo el 28 de junio de 1914 desencadenó una crisis diplomática que llevó a la guerra.")
        ),
        BilingualQuestion(
            id = 9310, correctIndex = 2, difficulty = Difficulty.EASY,
            fr = LocalizedContent("En quelle année les États-Unis ont-ils rejoint la Première Guerre mondiale?", listOf("1915", "1916", "1917", "1918"), "Histoire", "Les États-Unis ont déclaré la guerre à l'Allemagne en avril 1917, après le torpillage de navires américains et la découverte du télégramme Zimmermann."),
            en = LocalizedContent("In which year did the United States enter World War I?", listOf("1915", "1916", "1917", "1918"), "History", "The United States declared war on Germany in April 1917, after the sinking of American ships and the discovery of the Zimmermann Telegram."),
            zh = LocalizedContent("美国在哪一年加入第一次世界大战？", listOf("1915", "1916", "1917", "1918"), "历史", "美国于1917年4月对德宣战，此前美国船只被击沉以及齐默尔曼电报被发现。"),
            es = LocalizedContent("¿En qué año se unió Estados Unidos a la Primera Guerra Mundial?", listOf("1915", "1916", "1917", "1918"), "Historia", "Estados Unidos declaró la guerra a Alemania en abril de 1917, después del hundimiento de barcos estadounidenses y el descubrimiento del Telegrama Zimmermann.")
        ),
        BilingualQuestion(
            id = 9311, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année la Bataille de la Somme s'est-elle déroulée?", listOf("1915", "1916", "1917", "1918"), "Histoire", "La bataille de la Somme, l'une des plus meurtrières de la Première Guerre mondiale, a eu lieu en 1916, principalement entre forces britanniques et allemandes."),
            en = LocalizedContent("In which year did the Battle of the Somme take place?", listOf("1915", "1916", "1917", "1918"), "History", "The Battle of the Somme, one of the deadliest of World War I, took place in 1916, primarily between British and German forces."),
            zh = LocalizedContent("索姆河战役发生在哪一年？", listOf("1915", "1916", "1917", "1918"), "历史", "索姆河战役是第一次世界大战中最惨烈的战役之一，发生于1916年，主要交战方是英国和德国。"),
            es = LocalizedContent("¿En qué año tuvo lugar la Batalla del Somme?", listOf("1915", "1916", "1917", "1918"), "Historia", "La Batalla del Somme, una de las más mortíferas de la Primera Guerra Mundial, tuvo lugar en 1916, principalmente entre fuerzas británicas y alemanas.")
        ),
        BilingualQuestion(
            id = 9312, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année la Bataille de Verdun s'est-elle déroulée?", listOf("1915", "1916", "1917", "1918"), "Histoire", "La bataille de Verdun, l'une des plus longues et meurtrières de la Première Guerre mondiale, a opposé les armées française et allemande de février à décembre 1916."),
            en = LocalizedContent("In which year did the Battle of Verdun take place?", listOf("1915", "1916", "1917", "1918"), "History", "The Battle of Verdun, one of the longest and deadliest of World War I, pitted the French and German armies from February to December 1916."),
            zh = LocalizedContent("凡尔登战役发生在哪一年？", listOf("1915", "1916", "1917", "1918"), "历史", "凡尔登战役是第一次世界大战中持续时间最长、最惨烈的战役之一，法德两军于1916年2月至12月在此交战。"),
            es = LocalizedContent("¿En qué año tuvo lugar la Batalla de Verdún?", listOf("1915", "1916", "1917", "1918"), "Historia", "La Batalla de Verdún, una de las más largas y mortíferas de la Primera Guerra Mundial, enfrentó a los ejércitos francés y alemán de febrero a diciembre de 1916.")
        ),
        BilingualQuestion(
            id = 9313, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a commandé les troupes allemandes à Verdun?", listOf("Hindenburg", "Falkenhayn", "Mackensen", "Bellow"), "Histoire", "Erich von Falkenhayn, chef d’état-major général de l’armée allemande, planifia l’offensive de Verdun en 1916 pour saigner l’armée française."),
            en = LocalizedContent("Who commanded the German troops at Verdun?", listOf("Hindenburg", "Falkenhayn", "Mackensen", "Bellow"), "History", "Erich von Falkenhayn, Chief of the German General Staff, planned the Verdun offensive in 1916 to bleed the French army."),
            zh = LocalizedContent("谁指挥了凡尔登的德军？", listOf("兴登堡", "法尔肯海因", "马肯森", "贝洛"), "历史", "埃里希·冯·法尔肯海因，德国总参谋长，策划了1916年的凡尔登攻势，旨在消耗法军。"),
            es = LocalizedContent("¿Quién comandó las tropas alemanas en Verdún?", listOf("Hindenburg", "Falkenhayn", "Mackensen", "Bellow"), "Historia", "Erich von Falkenhayn, jefe del Estado Mayor alemán, planeó la ofensiva de Verdún en 1916 para desangrar al ejército francés.")
        ),
        BilingualQuestion(
            id = 9314, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a commandé les troupes françaises à Verdun?", listOf("Joffre", "Pétain", "Foch", "Nivelle"), "Histoire", "Le général Philippe Pétain a pris le commandement des troupes françaises lors de la bataille de Verdun en 1916, où il a organisé la défense et la logistique pour résister à l'offensive allemande."),
            en = LocalizedContent("Who commanded the French troops at Verdun?", listOf("Joffre", "Pétain", "Foch", "Nivelle"), "History", "General Philippe Pétain took command of the French troops during the Battle of Verdun in 1916, organizing defense and logistics to withstand the German offensive."),
            zh = LocalizedContent("谁指挥了凡尔登的法军？", listOf("霞飞", "贝当", "福煦", "尼韦勒"), "历史", "菲利普·贝当将军在1916年凡尔登战役中指挥法军，组织防御和后勤以抵御德军攻势。"),
            es = LocalizedContent("¿Quién comandó las tropas francesas en Verdún?", listOf("Joffre", "Pétain", "Foch", "Nivelle"), "Historia", "El general Philippe Pétain asumió el mando de las tropas francesas durante la Batalla de Verdún en 1916, organizando la defensa y la logística para resistir la ofensiva alemana.")
        ),
        BilingualQuestion(
            id = 9315, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année la Révolution de février a-t-elle eu lieu en Russie?", listOf("1916", "1917", "1918", "1919"), "Histoire", "La Révolution de février 1917 a mis fin au tsarisme en Russie, provoquant l'abdication de Nicolas II et l'établissement d'un gouvernement provisoire."),
            en = LocalizedContent("In which year did the February Revolution take place in Russia?", listOf("1916", "1917", "1918", "1919"), "History", "The February Revolution of 1917 ended tsarism in Russia, leading to the abdication of Nicholas II and the establishment of a provisional government."),
            zh = LocalizedContent("俄国二月革命发生在哪一年？", listOf("1916", "1917", "1918", "1919"), "历史", "1917年的二月革命结束了俄国的沙皇制度，导致尼古拉二世退位并建立了临时政府。"),
            es = LocalizedContent("¿En qué año tuvo lugar la Revolución de Febrero en Rusia?", listOf("1916", "1917", "1918", "1919"), "Historia", "La Revolución de Febrero de 1917 puso fin al zarismo en Rusia, provocando la abdicación de Nicolás II y el establecimiento de un gobierno provisional.")
        ),
        BilingualQuestion(
            id = 9316, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("En quelle année la Révolution d'octobre a-t-elle eu lieu en Russie?", listOf("1916", "1917", "1918", "1919"), "Histoire", "La Révolution d'octobre a eu lieu en 1917, selon le calendrier julien alors en vigueur en Russie, correspondant au 7 novembre du calendrier grégorien."),
            en = LocalizedContent("In which year did the October Revolution take place in Russia?", listOf("1916", "1917", "1918", "1919"), "History", "The October Revolution took place in 1917 according to the Julian calendar then in use in Russia, corresponding to November 7 of the Gregorian calendar."),
            zh = LocalizedContent("俄国十月革命发生在哪一年？", listOf("1916", "1917", "1918", "1919"), "历史", "十月革命发生于1917年（当时俄国使用的儒略历），对应公历11月7日。"),
            es = LocalizedContent("¿En qué año tuvo lugar la Revolución de Octubre en Rusia?", listOf("1916", "1917", "1918", "1919"), "Historia", "La Revolución de Octubre tuvo lugar en 1917 según el calendario juliano entonces vigente en Rusia, correspondiente al 7 de noviembre del calendario gregoriano.")
        ),
        BilingualQuestion(
            id = 9317, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui a mené la Révolution d'octobre?", listOf("Trotski", "Lénine", "Staline", "Kerenski"), "Histoire", "Lénine a dirigé les Bolcheviks lors de la prise du pouvoir en Russie en octobre 1917, renversant le gouvernement provisoire."),
            en = LocalizedContent("Who led the October Revolution?", listOf("Trotsky", "Lenin", "Stalin", "Kerensky"), "History", "Lenin led the Bolsheviks in seizing power in Russia in October 1917, overthrowing the provisional government."),
            zh = LocalizedContent("谁领导了十月革命？", listOf("托洛茨基", "列宁", "斯大林", "克伦斯基"), "历史", "列宁领导布尔什维克于1917年10月在俄国夺取政权，推翻了临时政府。"),
            es = LocalizedContent("¿Quién lideró la Revolución de Octubre?", listOf("Trotski", "Lenin", "Stalin", "Kerenski"), "Historia", "Lenin dirigió a los bolcheviques en la toma del poder en Rusia en octubre de 1917, derrocando al gobierno provisional.")
        ),
        BilingualQuestion(
            id = 9318, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année le Traité de Brest-Litovsk a-t-il été signé?", listOf("1917", "1918", "1919", "1920"), "Histoire", "Ce traité, signé le 3 mars 1918, met fin à la participation de la Russie soviétique à la Première Guerre mondiale face aux puissances centrales."),
            en = LocalizedContent("In which year was the Treaty of Brest-Litovsk signed?", listOf("1917", "1918", "1919", "1920"), "History", "This treaty, signed on March 3, 1918, ended Soviet Russia's participation in World War I against the Central Powers."),
            zh = LocalizedContent("《布列斯特-立托夫斯克条约》在哪一年签署？", listOf("1917", "1918", "1919", "1920"), "历史", "该条约于1918年3月3日签署，结束了苏俄与同盟国之间的第一次世界大战。"),
            es = LocalizedContent("¿En qué año se firmó el Tratado de Brest-Litovsk?", listOf("1917", "1918", "1919", "1920"), "Historia", "Este tratado, firmado el 3 de marzo de 1918, puso fin a la participación de la Rusia soviética en la Primera Guerra Mundial contra las Potencias Centrales.")
        ),
        BilingualQuestion(
            id = 9319, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("En quelle année la Première Guerre mondiale s'est-elle terminée?", listOf("1917", "1918", "1919", "1920"), "Histoire", "L'armistice mettant fin aux combats de la Première Guerre mondiale a été signé le 11 novembre 1918, dans un wagon-restaurant à Rethondes."),
            en = LocalizedContent("In which year did World War I end?", listOf("1917", "1918", "1919", "1920"), "History", "The armistice ending the fighting of World War I was signed on November 11, 1918, in a railway carriage at Rethondes."),
            zh = LocalizedContent("第一次世界大战在哪一年结束？", listOf("1917", "1918", "1919", "1920"), "历史", "结束第一次世界大战战斗的停战协定于1918年11月11日在雷通德的火车车厢内签署。"),
            es = LocalizedContent("¿En qué año terminó la Primera Guerra Mundial?", listOf("1917", "1918", "1919", "1920"), "Historia", "El armisticio que puso fin a los combates de la Primera Guerra Mundial se firmó el 11 de noviembre de 1918, en un vagón de ferrocarril en Rethondes.")
        ),
        BilingualQuestion(
            id = 9320, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel événement a marqué la fin de la Première Guerre mondiale?", listOf("L'armistice du 11 novembre", "Le Traité de Versailles", "La Révolution russe", "La signature du Traité de Brest-Litovsk"), "Histoire", "Signé le 11 novembre 1918 à Rethondes, cet armistice met fin aux combats entre les Alliés et l'Allemagne, aboutissant à la capitulation de cette dernière et à la cessation des hostilités sur le front occidental."),
            en = LocalizedContent("What event marked the end of World War I?", listOf("The Armistice of November 11", "The Treaty of Versailles", "The Russian Revolution", "The signing of the Treaty of Brest-Litovsk"), "History", "Signed on November 11, 1918 in Rethondes, this armistice ended the fighting between the Allies and Germany, leading to Germany's capitulation and the cessation of hostilities on the Western Front."),
            zh = LocalizedContent("什么事件标志着第一次世界大战的结束？", listOf("11月11日停战协定", "凡尔赛条约", "俄国革命", "布列斯特-立托夫斯克条约的签署"), "历史", "1918年11月11日在雷通德签署的停战协定结束了协约国与德国之间的战斗，导致德国投降并停止了西线的敌对行动。"),
            es = LocalizedContent("¿Qué evento marcó el final de la Primera Guerra Mundial?", listOf("El Armisticio del 11 de noviembre", "El Tratado de Versalles", "La Revolución Rusa", "La firma del Tratado de Brest-Litovsk"), "Historia", "Firmado el 11 de noviembre de 1918 en Rethondes, este armisticio puso fin a los combates entre los Aliados y Alemania, resultando en la capitulación de esta última y el cese de hostilidades en el frente occidental.")
        ),
        BilingualQuestion(
            id = 9321, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("En quelle année le Traité de Versailles a-t-il été signé?", listOf("1918", "1919", "1920", "1921"), "Histoire", "Le Traité de Versailles, qui mit officiellement fin à la Première Guerre mondiale, fut signé le 28 juin 1919 dans la galerie des Glaces du château de Versailles."),
            en = LocalizedContent("In what year was the Treaty of Versailles signed?", listOf("1918", "1919", "1920", "1921"), "History", "The Treaty of Versailles, which officially ended World War I, was signed on June 28, 1919 in the Hall of Mirrors at the Palace of Versailles."),
            zh = LocalizedContent("凡尔赛条约签署于哪一年？", listOf("1918年", "1919年", "1920年", "1921年"), "历史", "正式结束第一次世界大战的凡尔赛条约于1919年6月28日在凡尔赛宫的镜厅签署。"),
            es = LocalizedContent("¿En qué año se firmó el Tratado de Versalles?", listOf("1918", "1919", "1920", "1921"), "Historia", "El Tratado de Versalles, que puso fin oficialmente a la Primera Guerra Mundial, fue firmado el 28 de junio de 1919 en la Galería de los Espejos del Palacio de Versalles.")
        ),
        BilingualQuestion(
            id = 9322, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a été le président de la conférence de paix à Versailles?", listOf("Lloyd George", "Clemenceau", "Woodrow Wilson", "Orlando"), "Histoire", "Georges Clemenceau, président du Conseil français, présida la conférence de paix de Versailles en 1919 en tant que doyen des chefs d'État alliés."),
            en = LocalizedContent("Who was the president of the peace conference at Versailles?", listOf("Lloyd George", "Clemenceau", "Woodrow Wilson", "Orlando"), "History", "Georges Clemenceau, President of the French Council, presided over the Versailles Peace Conference in 1919 as the dean of the Allied heads of state."),
            zh = LocalizedContent("谁担任了凡尔赛和会的主席？", listOf("劳合·乔治", "克列孟梭", "伍德罗·威尔逊", "奥兰多"), "历史", "法国总理乔治·克列孟梭作为协约国国家元首中的资深者，主持了1919年的凡尔赛和会。"),
            es = LocalizedContent("¿Quién fue el presidente de la conferencia de paz en Versalles?", listOf("Lloyd George", "Clemenceau", "Woodrow Wilson", "Orlando"), "Historia", "Georges Clemenceau, presidente del Consejo francés, presidió la conferencia de paz de Versalles en 1919 como decano de los jefes de Estado aliados.")
        ),
        BilingualQuestion(
            id = 9323, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel était le principal objectif de la Conférence de Versailles?", listOf("Punir l'Allemagne", "Établir une paix durable", "Restaurer l'équilibre européen", "Tous les trois"), "Histoire", "La Conférence de Versailles visait à établir les conditions de paix après la Première Guerre mondiale, incluant la redéfinition des frontières, les réparations et la création de la Société des Nations."),
            en = LocalizedContent("What was the main objective of the Versailles Conference?", listOf("Punish Germany", "Establish lasting peace", "Restore European balance", "All three"), "History", "The Versailles Conference aimed to establish the peace conditions after World War I, including redefining borders, reparations, and the creation of the League of Nations."),
            zh = LocalizedContent("凡尔赛会议的主要目标是什么？", listOf("惩罚德国", "建立持久和平", "恢复欧洲均势", "以上所有"), "历史", "凡尔赛会议旨在确立第一次世界大战后的和平条件，包括重新划定边界、赔款以及创建国际联盟。"),
            es = LocalizedContent("¿Cuál fue el objetivo principal de la Conferencia de Versalles?", listOf("Castigar a Alemania", "Establecer una paz duradera", "Restaurar el equilibrio europeo", "Los tres"), "Historia", "La Conferencia de Versalles buscaba establecer las condiciones de paz tras la Primera Guerra Mundial, incluyendo la redefinición de fronteras, reparaciones y la creación de la Sociedad de Naciones.")
        ),
        BilingualQuestion(
            id = 9324, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année la Société des Nations a-t-elle été établie?", listOf("1918", "1919", "1920", "1921"), "Histoire", "La Société des Nations a été créée par le Traité de Versailles en 1919, mais elle a officiellement commencé ses activités le 10 janvier 1920."),
            en = LocalizedContent("In what year was the League of Nations established?", listOf("1918", "1919", "1920", "1921"), "History", "The League of Nations was created by the Treaty of Versailles in 1919, but it officially began its activities on January 10, 1920."),
            zh = LocalizedContent("国际联盟成立于哪一年？", listOf("1918年", "1919年", "1920年", "1921年"), "历史", "国际联盟由凡尔赛条约于1919年创建，但正式活动始于1920年1月10日。"),
            es = LocalizedContent("¿En qué año se estableció la Sociedad de Naciones?", listOf("1918", "1919", "1920", "1921"), "Historia", "La Sociedad de Naciones fue creada por el Tratado de Versalles en 1919, pero comenzó oficialmente sus actividades el 10 de enero de 1920.")
        ),
        BilingualQuestion(
            id = 9325, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a proposé la Société des Nations?", listOf("Lloyd George", "Clemenceau", "Woodrow Wilson", "Lénine"), "Histoire", "Woodrow Wilson, président des États-Unis, a proposé la Société des Nations dans ses Quatorze Points en 1918, visant à garantir la paix après la Première Guerre mondiale."),
            en = LocalizedContent("Who proposed the League of Nations?", listOf("Lloyd George", "Clemenceau", "Woodrow Wilson", "Lenin"), "History", "Woodrow Wilson, President of the United States, proposed the League of Nations in his Fourteen Points in 1918, aiming to guarantee peace after World War I."),
            zh = LocalizedContent("谁提出了国际联盟？", listOf("劳合·乔治", "克列孟梭", "伍德罗·威尔逊", "列宁"), "历史", "美国总统伍德罗·威尔逊在1918年的十四点原则中提出了国际联盟，旨在保障第一次世界大战后的和平。"),
            es = LocalizedContent("¿Quién propuso la Sociedad de Naciones?", listOf("Lloyd George", "Clemenceau", "Woodrow Wilson", "Lenin"), "Historia", "Woodrow Wilson, presidente de los Estados Unidos, propuso la Sociedad de Naciones en sus Catorce Puntos en 1918, con el objetivo de garantizar la paz después de la Primera Guerra Mundial.")
        ),
        BilingualQuestion(
            id = 9326, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année la Guerre civile russe a-t-elle commencé?", listOf("1918", "1919", "1920", "1921"), "Histoire", "La guerre civile russe a débuté en 1918, après la révolution d'Octobre 1917, lorsque les bolcheviks ont pris le pouvoir et que leurs opposants ont formé l'Armée blanche."),
            en = LocalizedContent("In what year did the Russian Civil War begin?", listOf("1918", "1919", "1920", "1921"), "History", "The Russian Civil War began in 1918, after the October Revolution of 1917, when the Bolsheviks took power and their opponents formed the White Army."),
            zh = LocalizedContent("俄国内战始于哪一年？", listOf("1918年", "1919年", "1920年", "1921年"), "历史", "俄国内战始于1918年，在1917年十月革命之后，布尔什维克夺取政权，其反对者组成了白军。"),
            es = LocalizedContent("¿En qué año comenzó la Guerra Civil Rusa?", listOf("1918", "1919", "1920", "1921"), "Historia", "La Guerra Civil Rusa comenzó en 1918, después de la Revolución de Octubre de 1917, cuando los bolcheviques tomaron el poder y sus oponentes formaron el Ejército Blanco.")
        ),
        BilingualQuestion(
            id = 9327, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année la Guerre civile russe s'est-elle terminée?", listOf("1920", "1921", "1922", "1923"), "Histoire", "La Guerre civile russe s'est officiellement terminée en 1920 avec la défaite des armées blanches face aux bolcheviks, bien que des combats isolés aient persisté jusqu'en 1922 en Extrême-Orient."),
            en = LocalizedContent("In what year did the Russian Civil War end?", listOf("1920", "1921", "1922", "1923"), "History", "The Russian Civil War officially ended in 1920 with the defeat of the White armies by the Bolsheviks, although isolated fighting persisted until 1922 in the Far East."),
            zh = LocalizedContent("俄国内战结束于哪一年？", listOf("1920年", "1921年", "1922年", "1923年"), "历史", "俄国内战于1920年正式结束，白军被布尔什维克击败，但在远东地区零星的战斗持续到1922年。"),
            es = LocalizedContent("¿En qué año terminó la Guerra Civil Rusa?", listOf("1920", "1921", "1922", "1923"), "Historia", "La Guerra Civil Rusa terminó oficialmente en 1920 con la derrota de los ejércitos blancos por los bolcheviques, aunque combates aislados persistieron hasta 1922 en el Lejano Oriente.")
        ),
        BilingualQuestion(
            id = 9328, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a vaincu dans la Guerre civile russe?", listOf("Les Blancs", "Les Rouges", "Les Verts", "Les Anarchistes"), "Histoire", "Les Rouges, dirigés par Lénine et Trotsky, ont vaincu les Blancs et leurs alliés étrangers, établissant l'Union soviétique en 1922."),
            en = LocalizedContent("Who won the Russian Civil War?", listOf("The Whites", "The Reds", "The Greens", "The Anarchists"), "History", "The Reds, led by Lenin and Trotsky, defeated the Whites and their foreign allies, establishing the Soviet Union in 1922."),
            zh = LocalizedContent("谁赢得了俄国内战？", listOf("白军", "红军", "绿军", "无政府主义者"), "历史", "由列宁和托洛茨基领导的红军击败了白军及其外国盟友，于1922年建立了苏联。"),
            es = LocalizedContent("¿Quién ganó la Guerra Civil Rusa?", listOf("Los Blancos", "Los Rojos", "Los Verdes", "Los Anarquistas"), "Historia", "Los Rojos, liderados por Lenin y Trotsky, derrotaron a los Blancos y sus aliados extranjeros, estableciendo la Unión Soviética en 1922.")
        ),
        BilingualQuestion(
            id = 9329, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année l'URSS a-t-elle été établie?", listOf("1920", "1921", "1922", "1923"), "Histoire", "L'Union des républiques socialistes soviétiques a été officiellement créée le 30 décembre 1922 par le traité d'union entre la Russie, l'Ukraine, la Biélorussie et la Transcaucasie."),
            en = LocalizedContent("In what year was the USSR established?", listOf("1920", "1921", "1922", "1923"), "History", "The Union of Soviet Socialist Republics was officially created on December 30, 1922 by the treaty of union between Russia, Ukraine, Belarus, and Transcaucasia."),
            zh = LocalizedContent("苏联成立于哪一年？", listOf("1920年", "1921年", "1922年", "1923年"), "历史", "苏维埃社会主义共和国联盟于1922年12月30日由俄罗斯、乌克兰、白俄罗斯和外高加索之间的联盟条约正式成立。"),
            es = LocalizedContent("¿En qué año se estableció la URSS?", listOf("1920", "1921", "1922", "1923"), "Historia", "La Unión de Repúblicas Socialistas Soviéticas fue creada oficialmente el 30 de diciembre de 1922 mediante el tratado de unión entre Rusia, Ucrania, Bielorrusia y Transcaucasia.")
        ),
    )

    private fun part6(): List<BilingualQuestion> = listOf(
        BilingualQuestion(
            id = 9330, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Qui était le premier chef de l'URSS?", listOf("Staline", "Lénine", "Trotski", "Kamenev"), "Histoire", "Lénine a dirigé la révolution bolchevique de 1917 et est devenu le premier chef de l'Union soviétique après sa création en 1922."),
            en = LocalizedContent("Who was the first leader of the USSR?", listOf("Stalin", "Lenin", "Trotsky", "Kamenev"), "History", "Lenin led the Bolshevik Revolution of 1917 and became the first leader of the Soviet Union after its creation in 1922."),
            zh = LocalizedContent("谁是苏联的第一位领导人？", listOf("斯大林", "列宁", "托洛茨基", "加米涅夫"), "历史", "列宁领导了1917年的布尔什维克革命，并在1922年苏联成立后成为其第一位领导人。"),
            es = LocalizedContent("¿Quién fue el primer líder de la URSS?", listOf("Stalin", "Lenin", "Trotski", "Kamenev"), "Historia", "Lenin lideró la Revolución Bolchevique de 1917 y se convirtió en el primer líder de la Unión Soviética tras su creación en 1922.")
        ),
        BilingualQuestion(
            id = 9331, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année Lénine est-il mort?", listOf("1921", "1922", "1923", "1924"), "Histoire", "Lénine, dirigeant de la révolution russe de 1917 et premier chef de l'URSS, est décédé le 21 janvier 1924. L'année 1923 est incorrecte."),
            en = LocalizedContent("In what year did Lenin die?", listOf("1921", "1922", "1923", "1924"), "History", "Lenin, leader of the Russian Revolution of 1917 and first head of the USSR, died on January 21, 1924. The year 1923 is incorrect."),
            zh = LocalizedContent("列宁在哪一年去世？", listOf("1921", "1922", "1923", "1924"), "历史", "列宁是1917年俄国革命的领导人和苏联的第一位领导人，于1924年1月21日去世。1923年不正确。"),
            es = LocalizedContent("¿En qué año murió Lenin?", listOf("1921", "1922", "1923", "1924"), "Historia", "Lenin, líder de la Revolución Rusa de 1917 y primer jefe de la URSS, falleció el 21 de enero de 1924. El año 1923 es incorrecto.")
        ),
        BilingualQuestion(
            id = 9332, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année Staline a-t-il pris le pouvoir?", listOf("1922", "1924", "1926", "1928"), "Histoire", "Après la mort de Lénine en 1924, Staline a consolidé son autorité au sein du Parti communiste et est devenu le dirigeant incontesté de l'Union soviétique en 1926."),
            en = LocalizedContent("In what year did Stalin take power?", listOf("1922", "1924", "1926", "1928"), "History", "After Lenin's death in 1924, Stalin consolidated his authority within the Communist Party and became the undisputed leader of the Soviet Union in 1926."),
            zh = LocalizedContent("斯大林在哪一年掌权？", listOf("1922", "1924", "1926", "1928"), "历史", "列宁于1924年去世后，斯大林在共产党内巩固了权力，并于1926年成为苏联无可争议的领导人。"),
            es = LocalizedContent("¿En qué año tomó Stalin el poder?", listOf("1922", "1924", "1926", "1928"), "Historia", "Tras la muerte de Lenin en 1924, Stalin consolidó su autoridad dentro del Partido Comunista y se convirtió en el líder indiscutible de la Unión Soviética en 1926.")
        ),
        BilingualQuestion(
            id = 9333, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel était le principal rival de Staline?", listOf("Lénine", "Kamenev", "Trotski", "Boukharine"), "Histoire", "Léon Trotski, figure majeure de la Révolution russe, s'opposa à Staline après la mort de Lénine, notamment sur la politique économique et la bureaucratisation du parti."),
            en = LocalizedContent("Who was Stalin's main rival?", listOf("Lenin", "Kamenev", "Trotsky", "Bukharin"), "History", "Leon Trotsky, a major figure of the Russian Revolution, opposed Stalin after Lenin's death, especially on economic policy and the bureaucratization of the party."),
            zh = LocalizedContent("斯大林的主要对手是谁？", listOf("列宁", "加米涅夫", "托洛茨基", "布哈林"), "历史", "列夫·托洛茨基是俄国革命的重要人物，在列宁去世后反对斯大林，特别是在经济政策和党的官僚化问题上。"),
            es = LocalizedContent("¿Quién fue el principal rival de Stalin?", listOf("Lenin", "Kamenev", "Trotski", "Bujarin"), "Historia", "León Trotski, figura importante de la Revolución Rusa, se opuso a Stalin tras la muerte de Lenin, especialmente en la política económica y la burocratización del partido.")
        ),
        BilingualQuestion(
            id = 9334, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année Trotski a-t-il été exilé?", listOf("1926", "1927", "1928", "1929"), "Histoire", "Léon Trotski a été exilé par Staline en 1928 après avoir perdu la lutte pour le pouvoir au sein du Parti communiste soviétique, marquant la fin de son influence politique en URSS."),
            en = LocalizedContent("In what year was Trotsky exiled?", listOf("1926", "1927", "1928", "1929"), "History", "Leon Trotsky was exiled by Stalin in 1928 after losing the power struggle within the Soviet Communist Party, marking the end of his political influence in the USSR."),
            zh = LocalizedContent("托洛茨基在哪一年被流放？", listOf("1926", "1927", "1928", "1929"), "历史", "列夫·托洛茨基在1928年被斯大林流放，此前他在苏联共产党内的权力斗争中失败，标志着他在苏联政治影响力的终结。"),
            es = LocalizedContent("¿En qué año fue exiliado Trotski?", listOf("1926", "1927", "1928", "1929"), "Historia", "León Trotski fue exiliado por Stalin en 1928 tras perder la lucha por el poder dentro del Partido Comunista Soviético, marcando el fin de su influencia política en la URSS.")
        ),
        BilingualQuestion(
            id = 9335, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année la Grande Purge a-t-elle commencé?", listOf("1934", "1935", "1936", "1937"), "Histoire", "La Grande Purge, une campagne de répression politique massive en Union soviétique, a été officiellement lancée en 1937 sous le régime de Staline."),
            en = LocalizedContent("In what year did the Great Purge begin?", listOf("1934", "1935", "1936", "1937"), "History", "The Great Purge, a massive political repression campaign in the Soviet Union, was officially launched in 1937 under Stalin's regime."),
            zh = LocalizedContent("大清洗在哪一年开始？", listOf("1934", "1935", "1936", "1937"), "历史", "大清洗是苏联的一场大规模政治镇压运动，于1937年在斯大林政权下正式启动。"),
            es = LocalizedContent("¿En qué año comenzó la Gran Purga?", listOf("1934", "1935", "1936", "1937"), "Historia", "La Gran Purga, una campaña masiva de represión política en la Unión Soviética, se lanzó oficialmente en 1937 bajo el régimen de Stalin.")
        ),
        BilingualQuestion(
            id = 9336, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année la Grande Purge s'est-elle terminée?", listOf("1937", "1938", "1939", "1940"), "Histoire", "La Grande Purge, une campagne de répression politique menée par Staline en URSS, a culminé en 1938 avant de ralentir. Cette année marque la fin des exécutions de masse et des arrestations les plus intenses."),
            en = LocalizedContent("In what year did the Great Purge end?", listOf("1937", "1938", "1939", "1940"), "History", "The Great Purge, a political repression campaign led by Stalin in the USSR, peaked in 1938 before slowing down. This year marks the end of the most intense mass executions and arrests."),
            zh = LocalizedContent("大清洗在哪一年结束？", listOf("1937", "1938", "1939", "1940"), "历史", "大清洗是斯大林在苏联领导的政治镇压运动，于1938年达到顶峰后逐渐放缓。这一年标志着最激烈的大规模处决和逮捕的结束。"),
            es = LocalizedContent("¿En qué año terminó la Gran Purga?", listOf("1937", "1938", "1939", "1940"), "Historia", "La Gran Purga, una campaña de represión política liderada por Stalin en la URSS, alcanzó su punto máximo en 1938 antes de disminuir. Este año marca el fin de las ejecuciones masivas y arrestos más intensos.")
        ),
        BilingualQuestion(
            id = 9337, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année le Procès de Moscou a-t-il eu lieu?", listOf("1935", "1936", "1937", "1938"), "Histoire", "Le premier grand procès de Moscou, où d'anciens bolcheviks comme Zinoviev et Kamenev furent jugés pour trahison, s'est tenu en août 1936, marquant le début des Grandes Purges staliniennes."),
            en = LocalizedContent("In what year did the Moscow Trials take place?", listOf("1935", "1936", "1937", "1938"), "History", "The first major Moscow Trial, where former Bolsheviks like Zinoviev and Kamenev were tried for treason, took place in August 1936, marking the beginning of Stalin's Great Purges."),
            zh = LocalizedContent("莫斯科审判在哪一年进行？", listOf("1935", "1936", "1937", "1938"), "历史", "第一次重大莫斯科审判于1936年8月举行，季诺维也夫和加米涅夫等前布尔什维克被控叛国，标志着斯大林大清洗的开始。"),
            es = LocalizedContent("¿En qué año tuvieron lugar los Juicios de Moscú?", listOf("1935", "1936", "1937", "1938"), "Historia", "El primer gran Juicio de Moscú, donde antiguos bolcheviques como Zinóviev y Kamenev fueron juzgados por traición, tuvo lugar en agosto de 1936, marcando el inicio de las Grandes Purgas de Stalin.")
        ),
        BilingualQuestion(
            id = 9338, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année la Nouvelle Politique Économique a-t-elle été établie?", listOf("1919", "1921", "1923", "1925"), "Histoire", "La Nouvelle Politique Économique (NEP) fut introduite par Lénine en 1921 pour relancer l'économie soviétique après la guerre civile, en autorisant un certain capitalisme privé."),
            en = LocalizedContent("In what year was the New Economic Policy established?", listOf("1919", "1921", "1923", "1925"), "History", "The New Economic Policy (NEP) was introduced by Lenin in 1921 to revive the Soviet economy after the civil war, allowing some private capitalism."),
            zh = LocalizedContent("新经济政策在哪一年确立？", listOf("1919", "1921", "1923", "1925"), "历史", "新经济政策（NEP）由列宁于1921年提出，旨在内战后恢复苏联经济，允许一定程度的私人资本主义。"),
            es = LocalizedContent("¿En qué año se estableció la Nueva Política Económica?", listOf("1919", "1921", "1923", "1925"), "Historia", "La Nueva Política Económica (NEP) fue introducida por Lenin en 1921 para reactivar la economía soviética tras la guerra civil, permitiendo cierto capitalismo privado.")
        ),
        BilingualQuestion(
            id = 9339, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année le Plan quinquennal a-t-il commencé?", listOf("1927", "1928", "1929", "1930"), "Histoire", "Le premier Plan quinquennal de l'Union soviétique, visant à industrialiser rapidement le pays, a été lancé en 1928 sous Joseph Staline."),
            en = LocalizedContent("In what year did the Five-Year Plan begin?", listOf("1927", "1928", "1929", "1930"), "History", "The first Five-Year Plan of the Soviet Union, aimed at rapid industrialization, was launched in 1928 under Joseph Stalin."),
            zh = LocalizedContent("五年计划在哪一年开始？", listOf("1927", "1928", "1929", "1930"), "历史", "苏联的第一个五年计划旨在快速工业化，于1928年在约瑟夫·斯大林领导下启动。"),
            es = LocalizedContent("¿En qué año comenzó el Plan Quinquenal?", listOf("1927", "1928", "1929", "1930"), "Historia", "El primer Plan Quinquenal de la Unión Soviética, destinado a una rápida industrialización, se lanzó en 1928 bajo Joseph Stalin.")
        ),
        BilingualQuestion(
            id = 9340, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel était l'objectif principal du Plan quinquennal?", listOf("Industrialiser l'URSS", "Collectiviser l'agriculture", "Augmenter la production", "Tous les trois"), "Histoire", "Les plans quinquennaux soviétiques visaient à industrialiser rapidement le pays, collectiviser l'agriculture et renforcer la puissance militaire, donc tous ces objectifs étaient poursuivis simultanément."),
            en = LocalizedContent("What was the main objective of the Five-Year Plan?", listOf("Industrialize the USSR", "Collectivize agriculture", "Increase production", "All three"), "History", "The Soviet five-year plans aimed to rapidly industrialize the country, collectivize agriculture, and strengthen military power, so all these objectives were pursued simultaneously."),
            zh = LocalizedContent("五年计划的主要目标是什么？", listOf("工业化苏联", "农业集体化", "增加生产", "以上所有"), "历史", "苏联的五年计划旨在快速工业化国家、农业集体化并增强军事实力，因此所有这些目标都是同时追求的。"),
            es = LocalizedContent("¿Cuál era el objetivo principal del Plan Quinquenal?", listOf("Industrializar la URSS", "Colectivizar la agricultura", "Aumentar la producción", "Los tres"), "Historia", "Los planes quinquenales soviéticos buscaban industrializar rápidamente el país, colectivizar la agricultura y fortalecer el poder militar, por lo que todos estos objetivos se perseguían simultáneamente.")
        ),
        BilingualQuestion(
            id = 9341, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année Hitler a-t-il écrit Mein Kampf?", listOf("1920", "1923", "1925", "1928"), "Histoire", "Hitler a rédigé Mein Kampf en 1924 lors de son emprisonnement après le putsch de la Brasserie, et l'ouvrage a été publié en deux volumes en 1925 et 1926."),
            en = LocalizedContent("In what year did Hitler write Mein Kampf?", listOf("1920", "1923", "1925", "1928"), "History", "Hitler wrote Mein Kampf in 1924 during his imprisonment after the Beer Hall Putsch, and the work was published in two volumes in 1925 and 1926."),
            zh = LocalizedContent("希特勒在哪一年写了《我的奋斗》？", listOf("1920", "1923", "1925", "1928"), "历史", "希特勒在1924年因啤酒馆政变入狱期间撰写了《我的奋斗》，该书于1925年和1926年分两卷出版。"),
            es = LocalizedContent("¿En qué año escribió Hitler Mein Kampf?", listOf("1920", "1923", "1925", "1928"), "Historia", "Hitler redactó Mein Kampf en 1924 durante su encarcelamiento tras el Putsch de la Cervecería, y la obra se publicó en dos volúmenes en 1925 y 1926.")
        ),
        BilingualQuestion(
            id = 9342, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année le Putsch de la Brasserie a-t-il eu lieu?", listOf("1920", "1923", "1925", "1928"), "Histoire", "Le Putsch de la Brasserie, tentative de coup d'État menée par Adolf Hitler et le parti nazi à Munich, a échoué le 8-9 novembre 1923."),
            en = LocalizedContent("In what year did the Beer Hall Putsch take place?", listOf("1920", "1923", "1925", "1928"), "History", "The Beer Hall Putsch, a coup attempt led by Adolf Hitler and the Nazi Party in Munich, failed on November 8-9, 1923."),
            zh = LocalizedContent("啤酒馆政变发生在哪一年？", listOf("1920", "1923", "1925", "1928"), "历史", "啤酒馆政变是阿道夫·希特勒和纳粹党在慕尼黑发动的政变企图，于1923年11月8日至9日失败。"),
            es = LocalizedContent("¿En qué año tuvo lugar el Putsch de la Cervecería?", listOf("1920", "1923", "1925", "1928"), "Historia", "El Putsch de la Cervecería, un intento de golpe de Estado liderado por Adolf Hitler y el partido nazi en Múnich, fracasó el 8-9 de noviembre de 1923.")
        ),
        BilingualQuestion(
            id = 9343, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année Hitler a-t-il été emprisonné?", listOf("1920", "1923", "1925", "1928"), "Histoire", "Hitler fut emprisonné en 1923 après l'échec du putsch de la Brasserie à Munich, un coup d'État raté contre le gouvernement bavarois."),
            en = LocalizedContent("In what year was Hitler imprisoned?", listOf("1920", "1923", "1925", "1928"), "History", "Hitler was imprisoned in 1923 after the failed Beer Hall Putsch in Munich, a failed coup against the Bavarian government."),
            zh = LocalizedContent("希特勒在哪一年被监禁？", listOf("1920", "1923", "1925", "1928"), "历史", "希特勒在1923年因慕尼黑啤酒馆政变失败后被监禁，这是一次针对巴伐利亚政府的未遂政变。"),
            es = LocalizedContent("¿En qué año fue encarcelado Hitler?", listOf("1920", "1923", "1925", "1928"), "Historia", "Hitler fue encarcelado en 1923 tras el fracaso del Putsch de la Cervecería en Múnich, un golpe de Estado fallido contra el gobierno bávaro.")
        ),
        BilingualQuestion(
            id = 9344, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année la Grande Dépression a-t-elle commencé?", listOf("1927", "1928", "1929", "1930"), "Histoire", "Le krach boursier de Wall Street en octobre 1929 a déclenché une crise économique mondiale, marquant le début de la Grande Dépression."),
            en = LocalizedContent("In what year did the Great Depression begin?", listOf("1927", "1928", "1929", "1930"), "History", "The Wall Street stock market crash in October 1929 triggered a global economic crisis, marking the beginning of the Great Depression."),
            zh = LocalizedContent("大萧条在哪一年开始？", listOf("1927", "1928", "1929", "1930"), "历史", "1929年10月的华尔街股市崩盘引发了全球经济危机，标志着大萧条的开始。"),
            es = LocalizedContent("¿En qué año comenzó la Gran Depresión?", listOf("1927", "1928", "1929", "1930"), "Historia", "El crac bursátil de Wall Street en octubre de 1929 desencadenó una crisis económica mundial, marcando el inicio de la Gran Depresión.")
        ),
        BilingualQuestion(
            id = 9345, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel événement a déclenché la Grande Dépression?", listOf("Le krach boursier", "L'effondrement de l'économie", "La crise bancaire", "La famine"), "Histoire", "Le krach boursier de Wall Street en octobre 1929 a provoqué une panique financière et l'effondrement des banques, plongeant l'économie mondiale dans une crise durable."),
            en = LocalizedContent("What event triggered the Great Depression?", listOf("The stock market crash", "The economic collapse", "The banking crisis", "The famine"), "History", "The Wall Street stock market crash in October 1929 caused financial panic and bank failures, plunging the global economy into a prolonged crisis."),
            zh = LocalizedContent("什么事件引发了大萧条？", listOf("股市崩盘", "经济崩溃", "银行危机", "饥荒"), "历史", "1929年10月的华尔街股市崩盘引发了金融恐慌和银行倒闭，使全球经济陷入长期危机。"),
            es = LocalizedContent("¿Qué evento desencadenó la Gran Depresión?", listOf("El crac bursátil", "El colapso económico", "La crisis bancaria", "La hambruna"), "Historia", "El crac bursátil de Wall Street en octubre de 1929 provocó pánico financiero y quiebras bancarias, sumiendo a la economía mundial en una crisis prolongada.")
        ),
        BilingualQuestion(
            id = 9346, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année le krach boursier a-t-il eu lieu?", listOf("1927", "1928", "1929", "1930"), "Histoire", "Le krach boursier de 1929, qui a débuté le jeudi 24 octobre, est considéré comme le point de départ de la Grande Dépression, la plus grave crise économique du XXe siècle."),
            en = LocalizedContent("In what year did the stock market crash occur?", listOf("1927", "1928", "1929", "1930"), "History", "The stock market crash of 1929, which began on Thursday, October 24, is considered the starting point of the Great Depression, the most severe economic crisis of the 20th century."),
            zh = LocalizedContent("股市崩盘发生在哪一年？", listOf("1927", "1928", "1929", "1930"), "历史", "1929年的股市崩盘始于10月24日星期四，被认为是20世纪最严重的经济危机——大萧条的开端。"),
            es = LocalizedContent("¿En qué año ocurrió el crac bursátil?", listOf("1927", "1928", "1929", "1930"), "Historia", "El crac bursátil de 1929, que comenzó el jueves 24 de octubre, se considera el punto de partida de la Gran Depresión, la crisis económica más grave del siglo XX.")
        ),
        BilingualQuestion(
            id = 9347, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année le NSDAP a-t-il remporté les élections?", listOf("1930", "1932", "1933", "1934"), "Histoire", "Le NSDAP d'Adolf Hitler remporta les élections législatives de mars 1933, ce qui lui permit de prendre le pouvoir et d'instaurer la dictature nazie."),
            en = LocalizedContent("In what year did the NSDAP win the elections?", listOf("1930", "1932", "1933", "1934"), "History", "Adolf Hitler's NSDAP won the parliamentary elections in March 1933, which allowed it to take power and establish the Nazi dictatorship."),
            zh = LocalizedContent("纳粹党在哪一年赢得选举？", listOf("1930", "1932", "1933", "1934"), "历史", "阿道夫·希特勒的纳粹党在1933年3月的议会选举中获胜，从而得以掌权并建立纳粹独裁统治。"),
            es = LocalizedContent("¿En qué año ganó el NSDAP las elecciones?", listOf("1930", "1932", "1933", "1934"), "Historia", "El NSDAP de Adolf Hitler ganó las elecciones parlamentarias de marzo de 1933, lo que le permitió tomar el poder e instaurar la dictadura nazi.")
        ),
        BilingualQuestion(
            id = 9348, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("En quelle année Hitler a-t-il accédé au pouvoir?", listOf("1932", "1933", "1934", "1935"), "Histoire", "Hitler est nommé chancelier le 30 janvier 1933, marquant son accession légale au pouvoir en Allemagne."),
            en = LocalizedContent("In what year did Hitler come to power?", listOf("1932", "1933", "1934", "1935"), "History", "Hitler was appointed Chancellor on January 30, 1933, marking his legal accession to power in Germany."),
            zh = LocalizedContent("希特勒在哪一年上台？", listOf("1932", "1933", "1934", "1935"), "历史", "希特勒于1933年1月30日被任命为总理，标志着他在德国合法上台。"),
            es = LocalizedContent("¿En qué año llegó Hitler al poder?", listOf("1932", "1933", "1934", "1935"), "Historia", "Hitler fue nombrado canciller el 30 de enero de 1933, marcando su acceso legal al poder en Alemania.")
        ),
        BilingualQuestion(
            id = 9349, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel événement a consolidé le pouvoir de Hitler?", listOf("Le putsch de la brasserie", "L'incendie du Reichstag", "La Nuit des longs couteaux", "L'Anschluss"), "Histoire", "En juin 1934, Hitler ordonna l'élimination des dirigeants SA, dont Ernst Röhm, lors de la Nuit des longs couteaux, ce qui neutralisa une menace interne et gagna le soutien de l'armée allemande."),
            en = LocalizedContent("What event consolidated Hitler's power?", listOf("The Beer Hall Putsch", "The Reichstag fire", "The Night of the Long Knives", "The Anschluss"), "History", "In June 1934, Hitler ordered the elimination of SA leaders, including Ernst Röhm, during the Night of the Long Knives, which neutralized an internal threat and won the support of the German army."),
            zh = LocalizedContent("什么事件巩固了希特勒的权力？", listOf("啤酒馆政变", "国会纵火案", "长刀之夜", "德奥合并"), "历史", "1934年6月，希特勒在长刀之夜下令清除包括恩斯特·罗姆在内的冲锋队领导人，这消除了内部威胁并赢得了德国军队的支持。"),
            es = LocalizedContent("¿Qué evento consolidó el poder de Hitler?", listOf("El Putsch de la Cervecería", "El incendio del Reichstag", "La Noche de los Cuchillos Largos", "El Anschluss"), "Historia", "En junio de 1934, Hitler ordenó la eliminación de los líderes de las SA, incluido Ernst Röhm, durante la Noche de los Cuchillos Largos, lo que neutralizó una amenaza interna y ganó el apoyo del ejército alemán.")
        ),
        BilingualQuestion(
            id = 9350, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année l'incendie du Reichstag a-t-il eu lieu?", listOf("1932", "1933", "1934", "1935"), "Histoire", "L'incendie du Reichstag, le bâtiment du Parlement allemand à Berlin, s'est produit le 27 février 1933. Cet événement a été utilisé par Adolf Hitler pour justifier des mesures répressives contre ses opposants politiques."),
            en = LocalizedContent("In which year did the Reichstag fire occur?", listOf("1932", "1933", "1934", "1935"), "History", "The Reichstag fire, at the German Parliament building in Berlin, occurred on February 27, 1933. This event was used by Adolf Hitler to justify repressive measures against his political opponents."),
            zh = LocalizedContent("国会纵火案发生在哪一年？", listOf("1932", "1933", "1934", "1935"), "历史", "国会纵火案发生在1933年2月27日，地点是柏林德国国会大厦。阿道夫·希特勒利用这一事件为其镇压政治对手的措施辩护。"),
            es = LocalizedContent("¿En qué año ocurrió el incendio del Reichstag?", listOf("1932", "1933", "1934", "1935"), "Historia", "El incendio del Reichstag, el edificio del Parlamento alemán en Berlín, ocurrió el 27 de febrero de 1933. Este evento fue utilizado por Adolf Hitler para justificar medidas represivas contra sus oponentes políticos.")
        ),
        BilingualQuestion(
            id = 9351, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année la Nuit des longs couteaux a-t-elle eu lieu?", listOf("1933", "1934", "1935", "1936"), "Histoire", "La Nuit des longs couteaux, purge politique menée par Hitler contre les SA, s'est déroulée du 30 juin au 2 juillet 1934."),
            en = LocalizedContent("In which year did the Night of the Long Knives occur?", listOf("1933", "1934", "1935", "1936"), "History", "The Night of the Long Knives, a political purge led by Hitler against the SA, took place from June 30 to July 2, 1934."),
            zh = LocalizedContent("长刀之夜发生在哪一年？", listOf("1933", "1934", "1935", "1936"), "历史", "长刀之夜是希特勒针对冲锋队进行的一场政治清洗，发生于1934年6月30日至7月2日。"),
            es = LocalizedContent("¿En qué año ocurrió la Noche de los Cuchillos Largos?", listOf("1933", "1934", "1935", "1936"), "Historia", "La Noche de los Cuchillos Largos, una purga política liderada por Hitler contra las SA, tuvo lugar del 30 de junio al 2 de julio de 1934.")
        ),
        BilingualQuestion(
            id = 9352, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a été victime de la Nuit des longs couteaux?", listOf("Les communistes", "Les SA", "Les Juifs", "Les opposants"), "Histoire", "La Nuit des longs couteaux en 1934 fut une purge ordonnée par Hitler contre les SA, dont il jugeait le chef Ernst Röhm trop menaçant pour son pouvoir."),
            en = LocalizedContent("Who was the victim of the Night of the Long Knives?", listOf("The communists", "The SA", "The Jews", "The opponents"), "History", "The Night of the Long Knives in 1934 was a purge ordered by Hitler against the SA, whose leader Ernst Röhm he considered too threatening to his power."),
            zh = LocalizedContent("长刀之夜的目标是谁？", listOf("共产党人", "冲锋队", "犹太人", "反对派"), "历史", "1934年的长刀之夜是希特勒下令对冲锋队进行的清洗，他认为冲锋队领袖恩斯特·罗姆对他的权力构成了威胁。"),
            es = LocalizedContent("¿Quién fue víctima de la Noche de los Cuchillos Largos?", listOf("Los comunistas", "Las SA", "Los judíos", "Los opositores"), "Historia", "La Noche de los Cuchillos Largos en 1934 fue una purga ordenada por Hitler contra las SA, cuyo líder Ernst Röhm consideraba demasiado amenazante para su poder.")
        ),
        BilingualQuestion(
            id = 9353, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année Hindenburg est-il mort?", listOf("1933", "1934", "1935", "1936"), "Histoire", "Paul von Hindenburg, président de la République de Weimar, est mort le 2 août 1934, ce qui permit à Adolf Hitler de cumuler les fonctions de chancelier et de président."),
            en = LocalizedContent("In which year did Hindenburg die?", listOf("1933", "1934", "1935", "1936"), "History", "Paul von Hindenburg, President of the Weimar Republic, died on August 2, 1934, which allowed Adolf Hitler to combine the offices of Chancellor and President."),
            zh = LocalizedContent("兴登堡在哪一年去世？", listOf("1933", "1934", "1935", "1936"), "历史", "魏玛共和国总统保罗·冯·兴登堡于1934年8月2日去世，这使得阿道夫·希特勒得以兼任总理和总统职务。"),
            es = LocalizedContent("¿En qué año murió Hindenburg?", listOf("1933", "1934", "1935", "1936"), "Historia", "Paul von Hindenburg, presidente de la República de Weimar, murió el 2 de agosto de 1934, lo que permitió a Adolf Hitler combinar los cargos de canciller y presidente.")
        ),
        BilingualQuestion(
            id = 9354, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année Hitler s'est-il autoproclamé Führer?", listOf("1933", "1934", "1935", "1936"), "Histoire", "En août 1934, à la mort du président Hindenburg, Hitler cumule les fonctions de chancelier et de président, devenant ainsi le Führer et chef suprême de l'Allemagne."),
            en = LocalizedContent("In which year did Hitler proclaim himself Führer?", listOf("1933", "1934", "1935", "1936"), "History", "In August 1934, upon the death of President Hindenburg, Hitler combined the offices of Chancellor and President, thus becoming the Führer and supreme leader of Germany."),
            zh = LocalizedContent("希特勒在哪一年自封为元首？", listOf("1933", "1934", "1935", "1936"), "历史", "1934年8月，兴登堡总统去世后，希特勒兼任总理和总统职务，从而成为德国的元首和最高领袖。"),
            es = LocalizedContent("¿En qué año se autoproclamó Hitler Führer?", listOf("1933", "1934", "1935", "1936"), "Historia", "En agosto de 1934, tras la muerte del presidente Hindenburg, Hitler combinó los cargos de canciller y presidente, convirtiéndose así en el Führer y líder supremo de Alemania.")
        ),
        BilingualQuestion(
            id = 9355, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année le réarmement allemand a-t-il commencé?", listOf("1933", "1934", "1935", "1936"), "Histoire", "Le réarmement allemand a officiellement débuté en 1935 avec l'annonce par Hitler de la création de la Luftwaffe et du rétablissement du service militaire obligatoire, violant le traité de Versailles."),
            en = LocalizedContent("In which year did German rearmament begin?", listOf("1933", "1934", "1935", "1936"), "History", "German rearmament officially began in 1935 with Hitler's announcement of the creation of the Luftwaffe and the reintroduction of compulsory military service, violating the Treaty of Versailles."),
            zh = LocalizedContent("德国重新武装始于哪一年？", listOf("1933", "1934", "1935", "1936"), "历史", "德国重新武装于1935年正式开始，希特勒宣布成立空军并恢复义务兵役制，违反了《凡尔赛条约》。"),
            es = LocalizedContent("¿En qué año comenzó el rearme alemán?", listOf("1933", "1934", "1935", "1936"), "Historia", "El rearme alemán comenzó oficialmente en 1935 con el anuncio de Hitler de la creación de la Luftwaffe y el restablecimiento del servicio militar obligatorio, violando el Tratado de Versalles.")
        ),
        BilingualQuestion(
            id = 9356, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année la Remilitarisation de la Rhénanie a-t-elle eu lieu?", listOf("1934", "1935", "1936", "1937"), "Histoire", "La remilitarisation de la Rhénanie en 1936 a violé le traité de Versailles et les accords de Locarno, marquant une escalade majeure des ambitions expansionnistes d'Hitler."),
            en = LocalizedContent("In which year did the Remilitarization of the Rhineland occur?", listOf("1934", "1935", "1936", "1937"), "History", "The remilitarization of the Rhineland in 1936 violated the Treaty of Versailles and the Locarno Treaties, marking a major escalation of Hitler's expansionist ambitions."),
            zh = LocalizedContent("莱茵兰重新军事化发生在哪一年？", listOf("1934", "1935", "1936", "1937"), "历史", "1936年莱茵兰重新军事化违反了《凡尔赛条约》和《洛迦诺公约》，标志着希特勒扩张野心的一次重大升级。"),
            es = LocalizedContent("¿En qué año ocurrió la Remilitarización de Renania?", listOf("1934", "1935", "1936", "1937"), "Historia", "La remilitarización de Renania en 1936 violó el Tratado de Versalles y los Acuerdos de Locarno, marcando una escalada importante de las ambiciones expansionistas de Hitler.")
        ),
        BilingualQuestion(
            id = 9357, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année la Guerre civile espagnole a-t-elle commencé?", listOf("1934", "1935", "1936", "1937"), "Histoire", "La Guerre civile espagnole éclata en juillet 1936 après le soulèvement militaire nationaliste contre le gouvernement républicain."),
            en = LocalizedContent("In which year did the Spanish Civil War begin?", listOf("1934", "1935", "1936", "1937"), "History", "The Spanish Civil War broke out in July 1936 after the nationalist military uprising against the republican government."),
            zh = LocalizedContent("西班牙内战在哪一年爆发？", listOf("1934", "1935", "1936", "1937"), "历史", "西班牙内战于1936年7月爆发，起因是民族主义军队起义反对共和政府。"),
            es = LocalizedContent("¿En qué año comenzó la Guerra Civil Española?", listOf("1934", "1935", "1936", "1937"), "Historia", "La Guerra Civil Española estalló en julio de 1936 tras el levantamiento militar nacionalista contra el gobierno republicano.")
        ),
        BilingualQuestion(
            id = 9358, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a déclenché le soulèvement en Espagne?", listOf("Francisco Franco", "Salvador Allende", "Pablo Casals", "Miguel de Unamuno"), "Histoire", "Francisco Franco, général nationaliste, a lancé un coup d'État militaire en juillet 1936 contre le gouvernement républicain, déclenchant la guerre civile espagnole."),
            en = LocalizedContent("Who triggered the uprising in Spain?", listOf("Francisco Franco", "Salvador Allende", "Pablo Casals", "Miguel de Unamuno"), "History", "Francisco Franco, a nationalist general, launched a military coup in July 1936 against the republican government, triggering the Spanish Civil War."),
            zh = LocalizedContent("谁在西班牙发动了起义？", listOf("弗朗西斯科·佛朗哥", "萨尔瓦多·阿连德", "巴勃罗·卡萨尔斯", "米格尔·德·乌纳穆诺"), "历史", "民族主义将军弗朗西斯科·佛朗哥于1936年7月发动军事政变，反对共和政府，从而引发了西班牙内战。"),
            es = LocalizedContent("¿Quién desencadenó el levantamiento en España?", listOf("Francisco Franco", "Salvador Allende", "Pablo Casals", "Miguel de Unamuno"), "Historia", "Francisco Franco, general nacionalista, lanzó un golpe de Estado militar en julio de 1936 contra el gobierno republicano, desencadenando la Guerra Civil Española.")
        ),
        BilingualQuestion(
            id = 9359, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année la Guerre civile espagnole s'est-elle terminée?", listOf("1937", "1938", "1939", "1940"), "Histoire", "Le conflit s'acheva en 1939 avec la victoire des nationalistes de Franco, qui établirent une dictature jusqu'en 1975."),
            en = LocalizedContent("In which year did the Spanish Civil War end?", listOf("1937", "1938", "1939", "1940"), "History", "The conflict ended in 1939 with the victory of Franco's nationalists, who established a dictatorship until 1975."),
            zh = LocalizedContent("西班牙内战在哪一年结束？", listOf("1937", "1938", "1939", "1940"), "历史", "冲突于1939年结束，佛朗哥的民族主义者获胜，建立了持续到1975年的独裁统治。"),
            es = LocalizedContent("¿En qué año terminó la Guerra Civil Española?", listOf("1937", "1938", "1939", "1940"), "Historia", "El conflicto terminó en 1939 con la victoria de los nacionalistas de Franco, quienes establecieron una dictadura hasta 1975.")
        ),
        BilingualQuestion(
            id = 9360, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a soutenu Franco pendant la Guerre civile espagnole?", listOf("L'Allemagne et l'Italie", "L'URSS", "La France et la Grande-Bretagne", "Les États-Unis"), "Histoire", "Pendant la Guerre civile espagnole (1936-1939), l'Allemagne nazie et l'Italie fasciste ont soutenu militairement le camp nationaliste de Franco, notamment via la légion Condor et des troupes italiennes."),
            en = LocalizedContent("Who supported Franco during the Spanish Civil War?", listOf("Germany and Italy", "USSR", "France and Great Britain", "United States"), "History", "During the Spanish Civil War (1936-1939), Nazi Germany and Fascist Italy militarily supported Franco's nationalist side, notably through the Condor Legion and Italian troops."),
            zh = LocalizedContent("西班牙内战期间谁支持了佛朗哥？", listOf("德国和意大利", "苏联", "法国和英国", "美国"), "历史", "西班牙内战（1936-1939）期间，纳粹德国和法西斯意大利通过秃鹰军团和意大利军队等军事力量支持了佛朗哥的民族主义阵营。"),
            es = LocalizedContent("¿Quién apoyó a Franco durante la Guerra Civil Española?", listOf("Alemania e Italia", "URSS", "Francia y Gran Bretaña", "Estados Unidos"), "Historia", "Durante la Guerra Civil Española (1936-1939), la Alemania nazi y la Italia fascista apoyaron militarmente al bando nacionalista de Franco, especialmente a través de la Legión Cóndor y tropas italianas.")
        ),
        BilingualQuestion(
            id = 9361, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a soutenu les Républicains espagnols?", listOf("L'Allemagne et l'Italie", "L'URSS", "La France et la Grande-Bretagne", "Les États-Unis"), "Histoire", "L'URSS a fourni des armes et des conseillers militaires aux Républicains espagnols pendant la guerre civile, tandis que les puissances fascistes soutenaient les nationalistes de Franco."),
            en = LocalizedContent("Who supported the Spanish Republicans?", listOf("Germany and Italy", "USSR", "France and Great Britain", "United States"), "History", "The USSR provided weapons and military advisors to the Spanish Republicans during the civil war, while the fascist powers supported Franco's nationalists."),
            zh = LocalizedContent("谁支持了西班牙共和派？", listOf("德国和意大利", "苏联", "法国和英国", "美国"), "历史", "苏联在内战期间向西班牙共和派提供了武器和军事顾问，而法西斯势力则支持佛朗哥的民族主义者。"),
            es = LocalizedContent("¿Quién apoyó a los republicanos españoles?", listOf("Alemania e Italia", "URSS", "Francia y Gran Bretaña", "Estados Unidos"), "Historia", "La URSS proporcionó armas y asesores militares a los republicanos españoles durante la guerra civil, mientras que las potencias fascistas apoyaban a los nacionalistas de Franco.")
        ),
        BilingualQuestion(
            id = 9362, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année l'Anschluss a-t-elle eu lieu?", listOf("1936", "1937", "1938", "1939"), "Histoire", "L'Anschluss, l'annexion de l'Autriche par l'Allemagne nazie, a eu lieu en mars 1938, sans résistance militaire significative."),
            en = LocalizedContent("In which year did the Anschluss take place?", listOf("1936", "1937", "1938", "1939"), "History", "The Anschluss, the annexation of Austria by Nazi Germany, took place in March 1938 without significant military resistance."),
            zh = LocalizedContent("德奥合并发生在哪一年？", listOf("1936", "1937", "1938", "1939"), "历史", "德奥合并，即纳粹德国吞并奥地利，发生在1938年3月，未遇到重大军事抵抗。"),
            es = LocalizedContent("¿En qué año tuvo lugar el Anschluss?", listOf("1936", "1937", "1938", "1939"), "Historia", "El Anschluss, la anexión de Austria por la Alemania nazi, tuvo lugar en marzo de 1938 sin resistencia militar significativa.")
        ),
        BilingualQuestion(
            id = 9363, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel était l'objectif de l'Anschluss?", listOf("Annexer l'Autriche", "Annexer la Tchécoslovaquie", "Annexer la Pologne", "Annexer la France"), "Histoire", "L'Anschluss était l'annexion de l'Autriche par l'Allemagne nazie en 1938, violant le traité de Versailles et réalisant l'objectif d'Hitler d'unir tous les germanophones sous un seul Reich."),
            en = LocalizedContent("What was the objective of the Anschluss?", listOf("Annex Austria", "Annex Czechoslovakia", "Annex Poland", "Annex France"), "History", "The Anschluss was the annexation of Austria by Nazi Germany in 1938, violating the Treaty of Versailles and fulfilling Hitler's goal of uniting all German-speaking people under one Reich."),
            zh = LocalizedContent("德奥合并的目标是什么？", listOf("吞并奥地利", "吞并捷克斯洛伐克", "吞并波兰", "吞并法国"), "历史", "德奥合并是1938年纳粹德国吞并奥地利，违反了《凡尔赛条约》，实现了希特勒将所有德语人口统一在一个帝国下的目标。"),
            es = LocalizedContent("¿Cuál era el objetivo del Anschluss?", listOf("Anexar Austria", "Anexar Checoslovaquia", "Anexar Polonia", "Anexar Francia"), "Historia", "El Anschluss fue la anexión de Austria por la Alemania nazi en 1938, violando el Tratado de Versalles y cumpliendo el objetivo de Hitler de unir a todos los germanohablantes bajo un solo Reich.")
        ),
        BilingualQuestion(
            id = 9364, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année la Crise des Sudètes a-t-elle eu lieu?", listOf("1936", "1937", "1938", "1939"), "Histoire", "La crise des Sudètes, déclenchée par les revendications allemandes sur cette région tchécoslovaque, a culminé en 1938 avec les accords de Munich qui cèdent le territoire à l'Allemagne nazie."),
            en = LocalizedContent("In which year did the Sudeten Crisis take place?", listOf("1936", "1937", "1938", "1939"), "History", "The Sudeten Crisis, triggered by German claims on this Czechoslovak region, culminated in 1938 with the Munich Agreement ceding the territory to Nazi Germany."),
            zh = LocalizedContent("苏台德危机发生在哪一年？", listOf("1936", "1937", "1938", "1939"), "历史", "苏台德危机由德国对捷克斯洛伐克这一地区的主权要求引发，于1938年达到高潮，最终通过《慕尼黑协定》将该领土割让给纳粹德国。"),
            es = LocalizedContent("¿En qué año tuvo lugar la Crisis de los Sudetes?", listOf("1936", "1937", "1938", "1939"), "Historia", "La Crisis de los Sudetes, desencadenada por las reclamaciones alemanas sobre esta región checoslovaca, culminó en 1938 con el Acuerdo de Múnich que cedió el territorio a la Alemania nazi.")
        ),
        BilingualQuestion(
            id = 9365, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel accord a permis à Hitler d'annexer les Sudètes?", listOf("Accord de Munich", "Accord de Versailles", "Accord de Locarno", "Accord de Brest-Litovsk"), "Histoire", "Signé en septembre 1938 entre l'Allemagne, la France, le Royaume-Uni et l'Italie, l'Accord de Munich a cédé les Sudètes à Hitler sans consulter la Tchécoslovaquie."),
            en = LocalizedContent("Which agreement allowed Hitler to annex the Sudetenland?", listOf("Munich Agreement", "Treaty of Versailles", "Locarno Treaties", "Treaty of Brest-Litovsk"), "History", "Signed in September 1938 between Germany, France, the United Kingdom, and Italy, the Munich Agreement ceded the Sudetenland to Hitler without consulting Czechoslovakia."),
            zh = LocalizedContent("哪项协议允许希特勒吞并苏台德地区？", listOf("慕尼黑协定", "凡尔赛条约", "洛迦诺公约", "布列斯特-立托夫斯克条约"), "历史", "1938年9月，德国、法国、英国和意大利签署了《慕尼黑协定》，未经捷克斯洛伐克同意就将苏台德地区割让给希特勒。"),
            es = LocalizedContent("¿Qué acuerdo permitió a Hitler anexar los Sudetes?", listOf("Acuerdo de Múnich", "Tratado de Versalles", "Tratados de Locarno", "Tratado de Brest-Litovsk"), "Historia", "Firmado en septiembre de 1938 entre Alemania, Francia, el Reino Unido e Italia, el Acuerdo de Múnich cedió los Sudetes a Hitler sin consultar a Checoslovaquia.")
        ),
        BilingualQuestion(
            id = 9366, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année l'accord de Munich a-t-il été signé?", listOf("1937", "1938", "1939", "1940"), "Histoire", "L'accord de Munich, signé le 30 septembre 1938, permit à l'Allemagne nazie d'annexer les Sudètes, région tchécoslovaque, sans déclencher de guerre, dans une tentative de politique d'apaisement."),
            en = LocalizedContent("In which year was the Munich Agreement signed?", listOf("1937", "1938", "1939", "1940"), "History", "The Munich Agreement, signed on September 30, 1938, allowed Nazi Germany to annex the Sudetenland, a Czechoslovak region, without triggering war, as part of a policy of appeasement."),
            zh = LocalizedContent("慕尼黑协定签署于哪一年？", listOf("1937", "1938", "1939", "1940"), "历史", "《慕尼黑协定》于1938年9月30日签署，允许纳粹德国吞并捷克斯洛伐克的苏台德地区，未引发战争，是绥靖政策的一部分。"),
            es = LocalizedContent("¿En qué año se firmó el Acuerdo de Múnich?", listOf("1937", "1938", "1939", "1940"), "Historia", "El Acuerdo de Múnich, firmado el 30 de septiembre de 1938, permitió a la Alemania nazi anexar los Sudetes, una región checoslovaca, sin desencadenar una guerra, como parte de una política de apaciguamiento.")
        ),
        BilingualQuestion(
            id = 9367, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a signé l'Accord de Munich?", listOf("Daladier, Chamberlain et Hitler", "Mussolini et Hitler", "Daladier et Chamberlain", "Roosevelt et Churchill"), "Histoire", "L'Accord de Munich de 1938, qui cédait les Sudètes à l'Allemagne nazie, fut signé par le Premier ministre britannique Neville Chamberlain, le président du Conseil français Édouard Daladier et le chancelier allemand Adolf Hitler."),
            en = LocalizedContent("Who signed the Munich Agreement?", listOf("Daladier, Chamberlain and Hitler", "Mussolini and Hitler", "Daladier and Chamberlain", "Roosevelt and Churchill"), "History", "The 1938 Munich Agreement, which ceded the Sudetenland to Nazi Germany, was signed by British Prime Minister Neville Chamberlain, French Prime Minister Édouard Daladier, and German Chancellor Adolf Hitler."),
            zh = LocalizedContent("谁签署了慕尼黑协定？", listOf("达拉第、张伯伦和希特勒", "墨索里尼和希特勒", "达拉第和张伯伦", "罗斯福和丘吉尔"), "历史", "1938年的《慕尼黑协定》将苏台德地区割让给纳粹德国，由英国首相内维尔·张伯伦、法国总理爱德华·达拉第和德国总理阿道夫·希特勒签署。"),
            es = LocalizedContent("¿Quién firmó el Acuerdo de Múnich?", listOf("Daladier, Chamberlain y Hitler", "Mussolini y Hitler", "Daladier y Chamberlain", "Roosevelt y Churchill"), "Historia", "El Acuerdo de Múnich de 1938, que cedió los Sudetes a la Alemania nazi, fue firmado por el primer ministro británico Neville Chamberlain, el presidente del Consejo francés Édouard Daladier y el canciller alemán Adolf Hitler.")
        ),
        BilingualQuestion(
            id = 9368, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année Hitler a-t-il annexé le reste de la Tchécoslovaquie?", listOf("1938", "1939", "1940", "1941"), "Histoire", "Hitler ordonna l'invasion du reste de la Tchécoslovaquie en mars 1939, violant les accords de Munich de 1938. Cette annexion créa le protectorat de Bohême-Moravie."),
            en = LocalizedContent("In which year did Hitler annex the rest of Czechoslovakia?", listOf("1938", "1939", "1940", "1941"), "History", "Hitler ordered the invasion of the rest of Czechoslovakia in March 1939, violating the 1938 Munich Agreement. This annexation created the Protectorate of Bohemia and Moravia."),
            zh = LocalizedContent("希特勒在哪一年吞并了捷克斯洛伐克的剩余部分？", listOf("1938", "1939", "1940", "1941"), "历史", "希特勒于1939年3月下令入侵捷克斯洛伐克剩余部分，违反了1938年的《慕尼黑协定》。这次吞并建立了波希米亚和摩拉维亚保护国。"),
            es = LocalizedContent("¿En qué año anexó Hitler el resto de Checoslovaquia?", listOf("1938", "1939", "1940", "1941"), "Historia", "Hitler ordenó la invasión del resto de Checoslovaquia en marzo de 1939, violando el Acuerdo de Múnich de 1938. Esta anexión creó el Protectorado de Bohemia y Moravia.")
        ),
        BilingualQuestion(
            id = 9369, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année le Pacte Molotov-Ribbentrop a-t-il été signé?", listOf("1937", "1938", "1939", "1940"), "Histoire", "Le Pacte Molotov-Ribbentrop, un traité de non-agression entre l'Allemagne nazie et l'URSS, a été signé le 23 août 1939, peu avant le déclenchement de la Seconde Guerre mondiale."),
            en = LocalizedContent("In which year was the Molotov-Ribbentrop Pact signed?", listOf("1937", "1938", "1939", "1940"), "History", "The Molotov-Ribbentrop Pact, a non-aggression treaty between Nazi Germany and the USSR, was signed on August 23, 1939, shortly before the outbreak of World War II."),
            zh = LocalizedContent("莫洛托夫-里宾特洛甫条约签署于哪一年？", listOf("1937", "1938", "1939", "1940"), "历史", "《莫洛托夫-里宾特洛甫条约》是纳粹德国与苏联之间的互不侵犯条约，于1939年8月23日签署，不久后第二次世界大战爆发。"),
            es = LocalizedContent("¿En qué año se firmó el Pacto Molotov-Ribbentrop?", listOf("1937", "1938", "1939", "1940"), "Historia", "El Pacto Molotov-Ribbentrop, un tratado de no agresión entre la Alemania nazi y la URSS, se firmó el 23 de agosto de 1939, poco antes del estallido de la Segunda Guerra Mundial.")
        ),
        BilingualQuestion(
            id = 9370, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel était l'objectif du Pacte Molotov-Ribbentrop?", listOf("Forme une alliance contre les Alliés", "Non-agression mutuelle", "Partager la Pologne", "Tous les trois"), "Histoire", "Signé en 1939 entre l'URSS et l'Allemagne nazie, ce pacte de non-agression incluait un protocole secret divisant l'Europe de l'Est en zones d'influence."),
            en = LocalizedContent("What was the purpose of the Molotov-Ribbentrop Pact?", listOf("Form an alliance against the Allies", "Mutual non-aggression", "Partition Poland", "All three"), "History", "Signed in 1939 between the USSR and Nazi Germany, this non-aggression pact included a secret protocol dividing Eastern Europe into spheres of influence."),
            zh = LocalizedContent("莫洛托夫-里宾特洛甫条约的目的是什么？", listOf("结盟对抗同盟国", "互不侵犯", "瓜分波兰", "以上全部"), "历史", "该条约于1939年由苏联和纳粹德国签署，是一项互不侵犯条约，并包含划分东欧势力范围的秘密议定书。"),
            es = LocalizedContent("¿Cuál era el objetivo del Pacto Molotov-Ribbentrop?", listOf("Formar una alianza contra los Aliados", "No agresión mutua", "Repartirse Polonia", "Los tres"), "Historia", "Firmado en 1939 entre la URSS y la Alemania nazi, este pacto de no agresión incluía un protocolo secreto que dividía Europa del Este en zonas de influencia.")
        ),
        BilingualQuestion(
            id = 9371, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("En quelle année la Seconde Guerre mondiale a-t-elle commencé?", listOf("1938", "1939", "1940", "1941"), "Histoire", "L'invasion de la Pologne par l'Allemagne nazie le 1er septembre 1939 est généralement considérée comme le déclencheur du conflit mondial."),
            en = LocalizedContent("In what year did World War II begin?", listOf("1938", "1939", "1940", "1941"), "History", "The invasion of Poland by Nazi Germany on September 1, 1939 is generally considered the trigger of the global conflict."),
            zh = LocalizedContent("第二次世界大战在哪一年开始？", listOf("1938", "1939", "1940", "1941"), "历史", "1939年9月1日纳粹德国入侵波兰通常被认为是全球冲突的导火索。"),
            es = LocalizedContent("¿En qué año comenzó la Segunda Guerra Mundial?", listOf("1938", "1939", "1940", "1941"), "Historia", "La invasión de Polonia por la Alemania nazi el 1 de septiembre de 1939 se considera generalmente el desencadenante del conflicto mundial.")
        ),
        BilingualQuestion(
            id = 9372, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("En quelle année Hitler a-t-il envahi la Pologne?", listOf("1938", "1939", "1940", "1941"), "Histoire", "L'invasion de la Pologne par l'Allemagne nazie le 1er septembre 1939 déclencha la Seconde Guerre mondiale, après l'échec des ultimatums diplomatiques."),
            en = LocalizedContent("In what year did Hitler invade Poland?", listOf("1938", "1939", "1940", "1941"), "History", "The invasion of Poland by Nazi Germany on September 1, 1939 triggered World War II, after the failure of diplomatic ultimatums."),
            zh = LocalizedContent("希特勒在哪一年入侵波兰？", listOf("1938", "1939", "1940", "1941"), "历史", "1939年9月1日纳粹德国入侵波兰，在外交最后通牒失败后引发了第二次世界大战。"),
            es = LocalizedContent("¿En qué año invadió Hitler Polonia?", listOf("1938", "1939", "1940", "1941"), "Historia", "La invasión de Polonia por la Alemania nazi el 1 de septiembre de 1939 desencadenó la Segunda Guerra Mundial, tras el fracaso de los ultimátums diplomáticos.")
        ),
        BilingualQuestion(
            id = 9373, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année la Bataille de France a-t-elle eu lieu?", listOf("1939", "1940", "1941", "1942"), "Histoire", "La Bataille de France a eu lieu en 1940, lors de la Seconde Guerre mondiale, opposant les forces allemandes aux armées françaises et alliées."),
            en = LocalizedContent("In what year did the Battle of France take place?", listOf("1939", "1940", "1941", "1942"), "History", "The Battle of France took place in 1940, during World War II, opposing German forces to the French and Allied armies."),
            zh = LocalizedContent("法国战役发生在哪一年？", listOf("1939", "1940", "1941", "1942"), "历史", "法国战役发生在1940年，第二次世界大战期间，德军与法军及盟军交战。"),
            es = LocalizedContent("¿En qué año tuvo lugar la Batalla de Francia?", listOf("1939", "1940", "1941", "1942"), "Historia", "La Batalla de Francia tuvo lugar en 1940, durante la Segunda Guerra Mundial, enfrentando a las fuerzas alemanas contra los ejércitos francés y aliados.")
        ),
        BilingualQuestion(
            id = 9374, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("En quelle année la France a-t-elle capitulé?", listOf("1939", "1940", "1941", "1942"), "Histoire", "L'armée française a capitulé face à l'Allemagne nazie le 22 juin 1940, après la défaite lors de la bataille de France. Le maréchal Pétain a signé l'armistice à Rethondes."),
            en = LocalizedContent("In what year did France capitulate?", listOf("1939", "1940", "1941", "1942"), "History", "The French army capitulated to Nazi Germany on June 22, 1940, after the defeat in the Battle of France. Marshal Pétain signed the armistice at Rethondes."),
            zh = LocalizedContent("法国在哪一年投降？", listOf("1939", "1940", "1941", "1942"), "历史", "1940年6月22日，法国军队在法国战役失败后向纳粹德国投降。贝当元帅在雷通德签署了停战协定。"),
            es = LocalizedContent("¿En qué año capituló Francia?", listOf("1939", "1940", "1941", "1942"), "Historia", "El ejército francés capituló ante la Alemania nazi el 22 de junio de 1940, tras la derrota en la Batalla de Francia. El mariscal Pétain firmó el armisticio en Rethondes.")
        ),
        BilingualQuestion(
            id = 9375, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel événement a marqué la défaite de la France?", listOf("L'armistice avec l'Allemagne", "L'invasion allemande", "La Bataille de France", "Le Blitzkrieg"), "Histoire", "Le 22 juin 1940, la France signe l'armistice avec l'Allemagne nazie, mettant fin aux combats de la bataille de France et consacrant sa défaite lors de la Seconde Guerre mondiale."),
            en = LocalizedContent("What event marked the defeat of France?", listOf("The armistice with Germany", "The German invasion", "The Battle of France", "The Blitzkrieg"), "History", "On June 22, 1940, France signed the armistice with Nazi Germany, ending the fighting of the Battle of France and confirming its defeat in World War II."),
            zh = LocalizedContent("什么事件标志着法国的失败？", listOf("与德国停战", "德国入侵", "法国战役", "闪电战"), "历史", "1940年6月22日，法国与纳粹德国签署停战协定，结束了法国战役的战斗，确认了其在第二次世界大战中的失败。"),
            es = LocalizedContent("¿Qué evento marcó la derrota de Francia?", listOf("El armisticio con Alemania", "La invasión alemana", "La Batalla de Francia", "La Blitzkrieg"), "Historia", "El 22 de junio de 1940, Francia firmó el armisticio con la Alemania nazi, poniendo fin a los combates de la Batalla de Francia y consagrando su derrota en la Segunda Guerra Mundial.")
        ),
        BilingualQuestion(
            id = 9376, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année la Bataille de Dunkerque a-t-elle eu lieu?", listOf("1939", "1940", "1941", "1942"), "Histoire", "La bataille de Dunkerque s'est déroulée en 1940, lors de la Seconde Guerre mondiale, opposant les forces alliées à l'armée allemande."),
            en = LocalizedContent("In what year did the Battle of Dunkirk take place?", listOf("1939", "1940", "1941", "1942"), "History", "The Battle of Dunkirk took place in 1940, during World War II, opposing Allied forces to the German army."),
            zh = LocalizedContent("敦刻尔克战役发生在哪一年？", listOf("1939", "1940", "1941", "1942"), "历史", "敦刻尔克战役发生在1940年，第二次世界大战期间，盟军与德军交战。"),
            es = LocalizedContent("¿En qué año tuvo lugar la Batalla de Dunkerque?", listOf("1939", "1940", "1941", "1942"), "Historia", "La Batalla de Dunkerque tuvo lugar en 1940, durante la Segunda Guerra Mundial, enfrentando a las fuerzas aliadas contra el ejército alemán.")
        ),
        BilingualQuestion(
            id = 9377, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année la Bataille de Grande-Bretagne a-t-elle eu lieu?", listOf("1939", "1940", "1941", "1942"), "Histoire", "La bataille de Grande-Bretagne opposa la Royal Air Force à la Luftwaffe allemande de juillet à octobre 1940, dans le cadre de la Seconde Guerre mondiale."),
            en = LocalizedContent("In what year did the Battle of Britain take place?", listOf("1939", "1940", "1941", "1942"), "History", "The Battle of Britain pitted the Royal Air Force against the German Luftwaffe from July to October 1940, as part of World War II."),
            zh = LocalizedContent("不列颠战役发生在哪一年？", listOf("1939", "1940", "1941", "1942"), "历史", "不列颠战役于1940年7月至10月期间，英国皇家空军与德国空军交战，是第二次世界大战的一部分。"),
            es = LocalizedContent("¿En qué año tuvo lugar la Batalla de Gran Bretaña?", listOf("1939", "1940", "1941", "1942"), "Historia", "La Batalla de Gran Bretaña enfrentó a la Royal Air Force contra la Luftwaffe alemana de julio a octubre de 1940, como parte de la Segunda Guerra Mundial.")
        ),
        BilingualQuestion(
            id = 9378, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a commandé la Royal Air Force pendant la Bataille de Grande-Bretagne?", listOf("Hugh Dowding", "Trafford Leigh-Mallory", "Keith Park", "Max Aitken"), "Histoire", "Hugh Dowding était le commandant en chef du Fighter Command de la Royal Air Force pendant la Bataille d'Angleterre en 1940, supervisant la défense aérienne contre la Luftwaffe."),
            en = LocalizedContent("Who commanded the Royal Air Force during the Battle of Britain?", listOf("Hugh Dowding", "Trafford Leigh-Mallory", "Keith Park", "Max Aitken"), "History", "Hugh Dowding was the Commander-in-Chief of Fighter Command of the Royal Air Force during the Battle of Britain in 1940, overseeing air defense against the Luftwaffe."),
            zh = LocalizedContent("不列颠战役期间谁指挥了英国皇家空军？", listOf("休·道丁", "特拉福德·利-马洛里", "基思·帕克", "马克斯·艾特肯"), "历史", "休·道丁在1940年不列颠战役期间担任英国皇家空军战斗机司令部总司令，负责指挥对德国空军的防空作战。"),
            es = LocalizedContent("¿Quién comandó la Royal Air Force durante la Batalla de Gran Bretaña?", listOf("Hugh Dowding", "Trafford Leigh-Mallory", "Keith Park", "Max Aitken"), "Historia", "Hugh Dowding fue el comandante en jefe del Mando de Caza de la Royal Air Force durante la Batalla de Gran Bretaña en 1940, supervisando la defensa aérea contra la Luftwaffe.")
        ),
        BilingualQuestion(
            id = 9379, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année la Barbarossa a-t-elle commencé?", listOf("1940", "1941", "1942", "1943"), "Histoire", "L'opération Barbarossa, l'invasion de l'Union soviétique par l'Allemagne nazie, a débuté le 22 juin 1941, marquant un tournant majeur dans la Seconde Guerre mondiale."),
            en = LocalizedContent("In what year did Barbarossa begin?", listOf("1940", "1941", "1942", "1943"), "History", "Operation Barbarossa, the invasion of the Soviet Union by Nazi Germany, began on June 22, 1941, marking a major turning point in World War II."),
            zh = LocalizedContent("巴巴罗萨行动在哪一年开始？", listOf("1940", "1941", "1942", "1943"), "历史", "巴巴罗萨行动，即纳粹德国入侵苏联的行动，于1941年6月22日开始，标志着第二次世界大战的重大转折点。"),
            es = LocalizedContent("¿En qué año comenzó Barbarroja?", listOf("1940", "1941", "1942", "1943"), "Historia", "La Operación Barbarroja, la invasión de la Unión Soviética por la Alemania nazi, comenzó el 22 de junio de 1941, marcando un punto de inflexión importante en la Segunda Guerra Mundial.")
        ),
        BilingualQuestion(
            id = 9380, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel était l'objectif de Barbarossa?", listOf("Envahir l'URSS", "Conquérir la Méditerranée", "Prendre l'Afrique", "Coloniser l'Asie"), "Histoire", "Barbarossa était le nom de code de l'invasion de l'Union soviétique par l'Allemagne nazie, lancée le 22 juin 1941."),
            en = LocalizedContent("What was the objective of Barbarossa?", listOf("Invade the USSR", "Conquer the Mediterranean", "Take Africa", "Colonize Asia"), "History", "Barbarossa was the code name for Nazi Germany's invasion of the Soviet Union, launched on June 22, 1941."),
            zh = LocalizedContent("巴巴罗萨行动的目标是什么？", listOf("入侵苏联", "征服地中海", "占领非洲", "殖民亚洲"), "历史", "巴巴罗萨是纳粹德国入侵苏联的行动代号，于1941年6月22日发起。"),
            es = LocalizedContent("¿Cuál era el objetivo de Barbarroja?", listOf("Invadir la URSS", "Conquistar el Mediterráneo", "Tomar África", "Colonizar Asia"), "Historia", "Barbarroja fue el nombre en clave de la invasión de la Unión Soviética por la Alemania nazi, lanzada el 22 de junio de 1941.")
        ),
        BilingualQuestion(
            id = 9381, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année la Bataille de Stalingrad a-t-elle commencé?", listOf("1941", "1942", "1943", "1944"), "Histoire", "L'offensive allemande contre Stalingrad a débuté le 23 août 1942, marquant le début de cette bataille majeure de la Seconde Guerre mondiale."),
            en = LocalizedContent("In which year did the Battle of Stalingrad begin?", listOf("1941", "1942", "1943", "1944"), "History", "The German offensive against Stalingrad began on August 23, 1942, marking the start of this major battle of World War II."),
            zh = LocalizedContent("斯大林格勒战役在哪一年开始？", listOf("1941", "1942", "1943", "1944"), "历史", "德军对斯大林格勒的进攻始于1942年8月23日，标志着这场二战重大战役的开始。"),
            es = LocalizedContent("¿En qué año comenzó la Batalla de Stalingrado?", listOf("1941", "1942", "1943", "1944"), "Historia", "La ofensiva alemana contra Stalingrado comenzó el 23 de agosto de 1942, marcando el inicio de esta importante batalla de la Segunda Guerra Mundial.")
        ),
        BilingualQuestion(
            id = 9382, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année la Bataille de Stalingrad s'est-elle terminée?", listOf("1942", "1943", "1944", "1945"), "Histoire", "La bataille de Stalingrad, tournant majeur de la Seconde Guerre mondiale, s'est achevée le 2 février 1943 avec la capitulation de la 6e armée allemande."),
            en = LocalizedContent("In which year did the Battle of Stalingrad end?", listOf("1942", "1943", "1944", "1945"), "History", "The Battle of Stalingrad, a major turning point in World War II, ended on February 2, 1943, with the surrender of the German 6th Army."),
            zh = LocalizedContent("斯大林格勒战役在哪一年结束？", listOf("1942", "1943", "1944", "1945"), "历史", "斯大林格勒战役是二战的重要转折点，于1943年2月2日以德国第6集团军投降而告终。"),
            es = LocalizedContent("¿En qué año terminó la Batalla de Stalingrado?", listOf("1942", "1943", "1944", "1945"), "Historia", "La Batalla de Stalingrado, un punto de inflexión importante en la Segunda Guerra Mundial, terminó el 2 de febrero de 1943 con la rendición del 6.º Ejército alemán.")
        ),
        BilingualQuestion(
            id = 9383, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a commandé les forces soviétiques à Stalingrad?", listOf("Joukov", "Vatutin", "Chuikov", "Rochossovski"), "Histoire", "Vassili Tchouïkov commandait la 62e armée soviétique, chargée de défendre Stalingrad contre l'offensive allemande."),
            en = LocalizedContent("Who commanded the Soviet forces at Stalingrad?", listOf("Zhukov", "Vatutin", "Chuikov", "Rokossovsky"), "History", "Vasily Chuikov commanded the Soviet 62nd Army, tasked with defending Stalingrad against the German offensive."),
            zh = LocalizedContent("谁在斯大林格勒指挥苏联军队？", listOf("朱可夫", "瓦图京", "崔可夫", "罗科索夫斯基"), "历史", "瓦西里·崔可夫指挥苏联第62集团军，负责保卫斯大林格勒抵御德军进攻。"),
            es = LocalizedContent("¿Quién comandó las fuerzas soviéticas en Stalingrado?", listOf("Zhúkov", "Vatutin", "Chuikov", "Rokossovski"), "Historia", "Vasili Chuikov comandó el 62.º Ejército soviético, encargado de defender Stalingrado contra la ofensiva alemana.")
        ),
        BilingualQuestion(
            id = 9384, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a commandé les forces allemandes à Stalingrad?", listOf("Paulus", "Rommel", "Model", "Guderian"), "Histoire", "Friedrich Paulus commandait la 6e armée allemande lors de la bataille de Stalingrad, où il fut encerclé et contraint de capituler en février 1943, marquant un tournant majeur de la Seconde Guerre mondiale."),
            en = LocalizedContent("Who commanded the German forces at Stalingrad?", listOf("Paulus", "Rommel", "Model", "Guderian"), "History", "Friedrich Paulus commanded the German 6th Army during the Battle of Stalingrad, where he was encircled and forced to surrender in February 1943, marking a major turning point in World War II."),
            zh = LocalizedContent("谁在斯大林格勒指挥德国军队？", listOf("保卢斯", "隆美尔", "莫德尔", "古德里安"), "历史", "弗里德里希·保卢斯在斯大林格勒战役中指挥德国第6集团军，被包围并于1943年2月被迫投降，标志着二战的重要转折点。"),
            es = LocalizedContent("¿Quién comandó las fuerzas alemanas en Stalingrado?", listOf("Paulus", "Rommel", "Model", "Guderian"), "Historia", "Friedrich Paulus comandó el 6.º Ejército alemán durante la Batalla de Stalingrado, donde fue cercado y obligado a rendirse en febrero de 1943, marcando un punto de inflexión importante en la Segunda Guerra Mundial.")
        ),
        BilingualQuestion(
            id = 9385, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année la Bataille de Koursk a-t-elle eu lieu?", listOf("1942", "1943", "1944", "1945"), "Histoire", "La bataille de Koursk, qui s'est déroulée en 1943, est l'une des plus grandes batailles de chars de la Seconde Guerre mondiale, marquant un tournant décisif sur le front de l'Est."),
            en = LocalizedContent("In which year did the Battle of Kursk take place?", listOf("1942", "1943", "1944", "1945"), "History", "The Battle of Kursk, which took place in 1943, was one of the largest tank battles of World War II, marking a decisive turning point on the Eastern Front."),
            zh = LocalizedContent("库尔斯克战役发生在哪一年？", listOf("1942", "1943", "1944", "1945"), "历史", "库尔斯克战役发生在1943年，是二战中最大的坦克战役之一，标志着东线的决定性转折点。"),
            es = LocalizedContent("¿En qué año tuvo lugar la Batalla de Kursk?", listOf("1942", "1943", "1944", "1945"), "Historia", "La Batalla de Kursk, que tuvo lugar en 1943, fue una de las mayores batallas de tanques de la Segunda Guerra Mundial, marcando un punto de inflexión decisivo en el Frente Oriental.")
        ),
        BilingualQuestion(
            id = 9386, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année l'Allemagne a-t-elle attaqué Pearl Harbor?", listOf("1940", "1941", "1942", "1943"), "Histoire", "L'Allemagne n'a pas attaqué Pearl Harbor. C'est le Japon qui a attaqué Pearl Harbor le 7 décembre 1941, et l'Allemagne a ensuite déclaré la guerre aux États-Unis."),
            en = LocalizedContent("In which year did Germany attack Pearl Harbor?", listOf("1940", "1941", "1942", "1943"), "History", "Germany did not attack Pearl Harbor. Japan attacked Pearl Harbor on December 7, 1941, and Germany subsequently declared war on the United States."),
            zh = LocalizedContent("德国在哪一年袭击了珍珠港？", listOf("1940", "1941", "1942", "1943"), "历史", "德国没有袭击珍珠港。日本于1941年12月7日袭击了珍珠港，随后德国对美国宣战。"),
            es = LocalizedContent("¿En qué año atacó Alemania Pearl Harbor?", listOf("1940", "1941", "1942", "1943"), "Historia", "Alemania no atacó Pearl Harbor. Japón atacó Pearl Harbor el 7 de diciembre de 1941, y Alemania posteriormente declaró la guerra a Estados Unidos.")
        ),
        BilingualQuestion(
            id = 9387, correctIndex = 0, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel était l'objectif de l'attaque de Pearl Harbor?", listOf("Détruire la flotte américaine", "Conquérir les Philippines", "Prendre l'Asie du Sud-Est", "Éliminer les alliés"), "Histoire", "Le Japon cherchait à neutraliser la puissance navale américaine dans le Pacifique pour sécuriser ses conquêtes territoriales sans interférence."),
            en = LocalizedContent("What was the objective of the attack on Pearl Harbor?", listOf("Destroy the US fleet", "Conquer the Philippines", "Take Southeast Asia", "Eliminate the allies"), "History", "Japan sought to neutralize American naval power in the Pacific to secure its territorial conquests without interference."),
            zh = LocalizedContent("珍珠港袭击的目标是什么？", listOf("摧毁美国舰队", "征服菲律宾", "占领东南亚", "消灭盟国"), "历史", "日本试图削弱美国在太平洋的海军力量，以确保其领土扩张不受干扰。"),
            es = LocalizedContent("¿Cuál era el objetivo del ataque a Pearl Harbor?", listOf("Destruir la flota estadounidense", "Conquistar Filipinas", "Tomar el Sudeste Asiático", "Eliminar a los aliados"), "Historia", "Japón buscaba neutralizar el poder naval estadounidense en el Pacífico para asegurar sus conquistas territoriales sin interferencias.")
        ),
        BilingualQuestion(
            id = 9388, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année les États-Unis ont-ils déclaré la guerre au Japon?", listOf("1940", "1941", "1942", "1943"), "Histoire", "L'attaque japonaise sur Pearl Harbor le 7 décembre 1941 a poussé les États-Unis à déclarer la guerre au Japon le lendemain, les engageant dans la Seconde Guerre mondiale."),
            en = LocalizedContent("In which year did the United States declare war on Japan?", listOf("1940", "1941", "1942", "1943"), "History", "The Japanese attack on Pearl Harbor on December 7, 1941, prompted the United States to declare war on Japan the next day, entering World War II."),
            zh = LocalizedContent("美国在哪一年对日本宣战？", listOf("1940", "1941", "1942", "1943"), "历史", "日本于1941年12月7日袭击珍珠港，促使美国于次日对日本宣战，从而加入第二次世界大战。"),
            es = LocalizedContent("¿En qué año declaró Estados Unidos la guerra a Japón?", listOf("1940", "1941", "1942", "1943"), "Historia", "El ataque japonés a Pearl Harbor el 7 de diciembre de 1941 llevó a Estados Unidos a declarar la guerra a Japón al día siguiente, entrando en la Segunda Guerra Mundial.")
        ),
        BilingualQuestion(
            id = 9389, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année la Bataille de Midway a-t-elle eu lieu?", listOf("1941", "1942", "1943", "1944"), "Histoire", "La bataille de Midway s'est déroulée en juin 1942, pendant la Seconde Guerre mondiale, et fut une victoire décisive des États-Unis contre le Japon dans le Pacifique."),
            en = LocalizedContent("In which year did the Battle of Midway take place?", listOf("1941", "1942", "1943", "1944"), "History", "The Battle of Midway took place in June 1942, during World War II, and was a decisive victory for the United States against Japan in the Pacific."),
            zh = LocalizedContent("中途岛战役发生在哪一年？", listOf("1941", "1942", "1943", "1944"), "历史", "中途岛战役发生在1942年6月，是二战期间美国在太平洋对日本的一次决定性胜利。"),
            es = LocalizedContent("¿En qué año tuvo lugar la Batalla de Midway?", listOf("1941", "1942", "1943", "1944"), "Historia", "La Batalla de Midway tuvo lugar en junio de 1942, durante la Segunda Guerra Mundial, y fue una victoria decisiva de Estados Unidos contra Japón en el Pacífico.")
        ),
        BilingualQuestion(
            id = 9390, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a commandé la flotte américaine à Midway?", listOf("Douglas MacArthur", "Chester Nimitz", "William Halsey", "Frank Jack Fletcher"), "Histoire", "Bien qu'Halsey fût le commandant désigné, il était hospitalisé pour une infection cutanée. Le contre-amiral Raymond Spruance le remplaça donc à la tête de la flotte américaine lors de la bataille de Midway."),
            en = LocalizedContent("Who commanded the US fleet at Midway?", listOf("Douglas MacArthur", "Chester Nimitz", "William Halsey", "Frank Jack Fletcher"), "History", "Although Halsey was the designated commander, he was hospitalized for a skin infection. Rear Admiral Raymond Spruance replaced him as head of the US fleet during the Battle of Midway."),
            zh = LocalizedContent("谁在中途岛指挥了美国舰队？", listOf("道格拉斯·麦克阿瑟", "切斯特·尼米兹", "威廉·哈尔西", "弗兰克·杰克·弗莱彻"), "历史", "尽管哈尔西是指定的指挥官，但他因皮肤感染住院。雷蒙德·斯普鲁恩斯少将接替他指挥中途岛海战中的美国舰队。"),
            es = LocalizedContent("¿Quién comandó la flota estadounidense en Midway?", listOf("Douglas MacArthur", "Chester Nimitz", "William Halsey", "Frank Jack Fletcher"), "Historia", "Aunque Halsey era el comandante designado, fue hospitalizado por una infección cutánea. El contraalmirante Raymond Spruance lo reemplazó al frente de la flota estadounidense durante la batalla de Midway.")
        ),
        BilingualQuestion(
            id = 9391, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année la Bataille de Guadalcanal a-t-elle commencé?", listOf("1941", "1942", "1943", "1944"), "Histoire", "La bataille de Guadalcanal, une campagne clé du Pacifique durant la Seconde Guerre mondiale, a débuté le 7 août 1942 avec le débarquement des forces américaines sur l'île."),
            en = LocalizedContent("In what year did the Battle of Guadalcanal begin?", listOf("1941", "1942", "1943", "1944"), "History", "The Battle of Guadalcanal, a key Pacific campaign during World War II, began on August 7, 1942 with the landing of US forces on the island."),
            zh = LocalizedContent("瓜达尔卡纳尔岛战役在哪一年开始？", listOf("1941", "1942", "1943", "1944"), "历史", "瓜达尔卡纳尔岛战役是二战期间太平洋战场的关键战役，于1942年8月7日以美军登陆该岛开始。"),
            es = LocalizedContent("¿En qué año comenzó la Batalla de Guadalcanal?", listOf("1941", "1942", "1943", "1944"), "Historia", "La Batalla de Guadalcanal, una campaña clave del Pacífico durante la Segunda Guerra Mundial, comenzó el 7 de agosto de 1942 con el desembarco de las fuerzas estadounidenses en la isla.")
        ),
        BilingualQuestion(
            id = 9392, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année la Bataille de Guadalcanal s'est-elle terminée?", listOf("1941", "1942", "1943", "1944"), "Histoire", "La bataille de Guadalcanal, une campagne majeure du Pacifique pendant la Seconde Guerre mondiale, s'est achevée en février 1943 avec la victoire des Alliés sur les forces japonaises."),
            en = LocalizedContent("In what year did the Battle of Guadalcanal end?", listOf("1941", "1942", "1943", "1944"), "History", "The Battle of Guadalcanal, a major Pacific campaign during World War II, ended in February 1943 with the Allied victory over Japanese forces."),
            zh = LocalizedContent("瓜达尔卡纳尔岛战役在哪一年结束？", listOf("1941", "1942", "1943", "1944"), "历史", "瓜达尔卡纳尔岛战役是二战期间太平洋战场的一场重要战役，于1943年2月以盟军战胜日军而告终。"),
            es = LocalizedContent("¿En qué año terminó la Batalla de Guadalcanal?", listOf("1941", "1942", "1943", "1944"), "Historia", "La Batalla de Guadalcanal, una importante campaña del Pacífico durante la Segunda Guerra Mundial, terminó en febrero de 1943 con la victoria de los Aliados sobre las fuerzas japonesas.")
        ),
        BilingualQuestion(
            id = 9393, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("En quelle année le Jour J a-t-il eu lieu?", listOf("1943", "1944", "1945", "1946"), "Histoire", "Le débarquement allié en Normandie, connu sous le nom de Jour J, s'est déroulé le 6 juin 1944 pendant la Seconde Guerre mondiale."),
            en = LocalizedContent("In what year did D-Day take place?", listOf("1943", "1944", "1945", "1946"), "History", "The Allied landings in Normandy, known as D-Day, took place on June 6, 1944 during World War II."),
            zh = LocalizedContent("诺曼底登陆发生在哪一年？", listOf("1943", "1944", "1945", "1946"), "历史", "盟军在诺曼底的登陆，即诺曼底登陆日，发生在1944年6月6日，是二战期间的一次行动。"),
            es = LocalizedContent("¿En qué año tuvo lugar el Día D?", listOf("1943", "1944", "1945", "1946"), "Historia", "El desembarco aliado en Normandía, conocido como el Día D, tuvo lugar el 6 de junio de 1944 durante la Segunda Guerra Mundial.")
        ),
        BilingualQuestion(
            id = 9394, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("Quel était la date du Jour J?", listOf("5 juin 1944", "6 juin 1944", "7 juin 1944", "8 juin 1944"), "Histoire", "Le 6 juin 1944 marque le début du débarquement allié en Normandie, une opération militaire majeure de la Seconde Guerre mondiale qui a permis la libération de l'Europe de l'Ouest."),
            en = LocalizedContent("What was the date of D-Day?", listOf("June 5, 1944", "June 6, 1944", "June 7, 1944", "June 8, 1944"), "History", "June 6, 1944 marks the beginning of the Allied landings in Normandy, a major military operation of World War II that enabled the liberation of Western Europe."),
            zh = LocalizedContent("诺曼底登陆的日期是哪一天？", listOf("1944年6月5日", "1944年6月6日", "1944年6月7日", "1944年6月8日"), "历史", "1944年6月6日是盟军在诺曼底登陆的开始，这是二战中的一次重大军事行动，促成了西欧的解放。"),
            es = LocalizedContent("¿Cuál fue la fecha del Día D?", listOf("5 de junio de 1944", "6 de junio de 1944", "7 de junio de 1944", "8 de junio de 1944"), "Historia", "El 6 de junio de 1944 marca el inicio del desembarco aliado en Normandía, una operación militar importante de la Segunda Guerra Mundial que permitió la liberación de Europa Occidental.")
        ),
        BilingualQuestion(
            id = 9395, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a commandé les forces alliées le Jour J?", listOf("Bernard Montgomery", "Dwight D. Eisenhower", "Omar Bradley", "George Patton"), "Histoire", "Dwight D. Eisenhower était le commandant suprême des forces alliées en Europe, ce qui incluait la planification et l'exécution du débarquement du 6 juin 1944 en Normandie."),
            en = LocalizedContent("Who commanded the Allied forces on D-Day?", listOf("Bernard Montgomery", "Dwight D. Eisenhower", "Omar Bradley", "George Patton"), "History", "Dwight D. Eisenhower was the Supreme Commander of the Allied forces in Europe, which included the planning and execution of the June 6, 1944 landings in Normandy."),
            zh = LocalizedContent("谁在诺曼底登陆日指挥盟军？", listOf("伯纳德·蒙哥马利", "德怀特·D·艾森豪威尔", "奥马尔·布拉德利", "乔治·巴顿"), "历史", "德怀特·D·艾森豪威尔是欧洲盟军最高司令，负责策划和执行1944年6月6日的诺曼底登陆。"),
            es = LocalizedContent("¿Quién comandó las fuerzas aliadas en el Día D?", listOf("Bernard Montgomery", "Dwight D. Eisenhower", "Omar Bradley", "George Patton"), "Historia", "Dwight D. Eisenhower fue el comandante supremo de las fuerzas aliadas en Europa, lo que incluía la planificación y ejecución del desembarco del 6 de junio de 1944 en Normandía.")
        ),
        BilingualQuestion(
            id = 9396, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année la Libération de Paris a-t-elle eu lieu?", listOf("1943", "1944", "1945", "1946"), "Histoire", "La Libération de Paris a eu lieu du 19 au 25 août 1944, marquant la fin de l'occupation allemande de la capitale française pendant la Seconde Guerre mondiale."),
            en = LocalizedContent("In what year did the Liberation of Paris take place?", listOf("1943", "1944", "1945", "1946"), "History", "The Liberation of Paris took place from August 19 to 25, 1944, marking the end of the German occupation of the French capital during World War II."),
            zh = LocalizedContent("巴黎解放发生在哪一年？", listOf("1943", "1944", "1945", "1946"), "历史", "巴黎解放发生在1944年8月19日至25日，标志着二战期间德国对法国首都占领的结束。"),
            es = LocalizedContent("¿En qué año tuvo lugar la Liberación de París?", listOf("1943", "1944", "1945", "1946"), "Historia", "La Liberación de París tuvo lugar del 19 al 25 de agosto de 1944, marcando el fin de la ocupación alemana de la capital francesa durante la Segunda Guerra Mundial.")
        ),
        BilingualQuestion(
            id = 9397, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a libéré Paris?", listOf("Les Américains", "Les Britanniques", "Les Forces françaises libres", "Les Soviétiques"), "Histoire", "Paris a été libérée le 25 août 1944 par la 2e division blindée du général Leclerc, appartenant aux Forces françaises libres, avec le soutien de la Résistance intérieure."),
            en = LocalizedContent("Who liberated Paris?", listOf("The Americans", "The British", "The Free French Forces", "The Soviets"), "History", "Paris was liberated on August 25, 1944 by General Leclerc's 2nd Armored Division, belonging to the Free French Forces, with the support of the internal Resistance."),
            zh = LocalizedContent("谁解放了巴黎？", listOf("美国人", "英国人", "自由法国部队", "苏联人"), "历史", "巴黎于1944年8月25日由勒克莱尔将军的第2装甲师解放，该师属于自由法国部队，并得到内部抵抗运动的支持。"),
            es = LocalizedContent("¿Quién liberó París?", listOf("Los estadounidenses", "Los británicos", "Las Fuerzas Francesas Libres", "Los soviéticos"), "Historia", "París fue liberada el 25 de agosto de 1944 por la 2.ª División Blindada del general Leclerc, perteneciente a las Fuerzas Francesas Libres, con el apoyo de la Resistencia interior.")
        ),
        BilingualQuestion(
            id = 9398, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année la Bataille des Ardennes a-t-elle eu lieu?", listOf("1943", "1944", "1945", "1946"), "Histoire", "La Bataille des Ardennes, dernière grande offensive allemande sur le front ouest, a débuté le 16 décembre 1944 et s'est achevée en janvier 1945."),
            en = LocalizedContent("In what year did the Battle of the Bulge take place?", listOf("1943", "1944", "1945", "1946"), "History", "The Battle of the Bulge, the last major German offensive on the Western Front, began on December 16, 1944 and ended in January 1945."),
            zh = LocalizedContent("突出部战役发生在哪一年？", listOf("1943", "1944", "1945", "1946"), "历史", "突出部战役是德军在西线的最后一次大规模进攻，始于1944年12月16日，结束于1945年1月。"),
            es = LocalizedContent("¿En qué año tuvo lugar la Batalla de las Ardenas?", listOf("1943", "1944", "1945", "1946"), "Historia", "La Batalla de las Ardenas, la última gran ofensiva alemana en el frente occidental, comenzó el 16 de diciembre de 1944 y terminó en enero de 1945.")
        ),
        BilingualQuestion(
            id = 9399, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel était l'objectif de la Bataille des Ardennes?", listOf("Repousser les Alliés", "Atteindre la mer du Nord", "Détruire Anvers", "Diviser les forces alliées"), "Histoire", "Lancée en décembre 1944, cette offensive allemande visait à briser les lignes alliées, reprendre le port d'Anvers et forcer les Alliés à négocier une paix séparée."),
            en = LocalizedContent("What was the objective of the Battle of the Bulge?", listOf("Push back the Allies", "Reach the North Sea", "Destroy Antwerp", "Divide the Allied forces"), "History", "Launched in December 1944, this German offensive aimed to break Allied lines, recapture the port of Antwerp, and force the Allies to negotiate a separate peace."),
            zh = LocalizedContent("突出部战役的目标是什么？", listOf("击退盟军", "到达北海", "摧毁安特卫普", "分割盟军"), "历史", "这场德军于1944年12月发起的进攻旨在突破盟军防线，夺回安特卫普港，并迫使盟军进行单独和谈。"),
            es = LocalizedContent("¿Cuál fue el objetivo de la Batalla de las Ardenas?", listOf("Rechazar a los Aliados", "Alcanzar el Mar del Norte", "Destruir Amberes", "Dividir las fuerzas aliadas"), "Historia", "Lanzada en diciembre de 1944, esta ofensiva alemana pretendía romper las líneas aliadas, recuperar el puerto de Amberes y forzar a los Aliados a negociar una paz por separado.")
        ),
        BilingualQuestion(
            id = 9400, correctIndex = 1, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année Hitler s'est-il suicidé?", listOf("1944", "1945", "1946", "1947"), "Histoire", "Hitler s'est suicidé le 30 avril 1945 dans son bunker à Berlin, alors que l'Armée rouge était sur le point de prendre la ville, marquant la fin du régime nazi."),
            en = LocalizedContent("In which year did Hitler commit suicide?", listOf("1944", "1945", "1946", "1947"), "History", "Hitler committed suicide on April 30, 1945 in his bunker in Berlin, as the Red Army was about to take the city, marking the end of the Nazi regime."),
            zh = LocalizedContent("希特勒在哪一年自杀？", listOf("1944", "1945", "1946", "1947"), "历史", "希特勒于1945年4月30日在柏林的地堡中自杀，当时红军即将攻占该市，标志着纳粹政权的终结。"),
            es = LocalizedContent("¿En qué año se suicidó Hitler?", listOf("1944", "1945", "1946", "1947"), "Historia", "Hitler se suicidó el 30 de abril de 1945 en su búnker de Berlín, cuando el Ejército Rojo estaba a punto de tomar la ciudad, marcando el fin del régimen nazi.")
        ),
        BilingualQuestion(
            id = 9401, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("En quelle année la Seconde Guerre mondiale en Europe s'est-elle terminée?", listOf("1944", "1945", "1946", "1947"), "Histoire", "La Seconde Guerre mondiale en Europe s'est achevée le 8 mai 1945 avec la capitulation sans condition de l'Allemagne nazie."),
            en = LocalizedContent("In which year did World War II in Europe end?", listOf("1944", "1945", "1946", "1947"), "History", "World War II in Europe ended on May 8, 1945 with the unconditional surrender of Nazi Germany."),
            zh = LocalizedContent("欧洲的第二次世界大战在哪一年结束？", listOf("1944", "1945", "1946", "1947"), "历史", "欧洲的第二次世界大战于1945年5月8日随着纳粹德国的无条件投降而结束。"),
            es = LocalizedContent("¿En qué año terminó la Segunda Guerra Mundial en Europa?", listOf("1944", "1945", "1946", "1947"), "Historia", "La Segunda Guerra Mundial en Europa terminó el 8 de mayo de 1945 con la rendición incondicional de la Alemania nazi.")
        ),
        BilingualQuestion(
            id = 9402, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a signé l'acte de capitulation allemande?", listOf("Goering", "Doenitz", "Jodl", "Speer"), "Histoire", "Le général Alfred Jodl, chef d'état-major de la Wehrmacht, a signé la capitulation sans conditions de l'Allemagne nazie le 7 mai 1945 à Reims, mettant fin à la Seconde Guerre mondiale en Europe."),
            en = LocalizedContent("Who signed the German act of surrender?", listOf("Goering", "Doenitz", "Jodl", "Speer"), "History", "General Alfred Jodl, Chief of Staff of the Wehrmacht, signed the unconditional surrender of Nazi Germany on May 7, 1945 in Reims, ending World War II in Europe."),
            zh = LocalizedContent("谁签署了德国的投降书？", listOf("戈林", "邓尼茨", "约德尔", "施佩尔"), "历史", "德国国防军参谋长阿尔弗雷德·约德尔将军于1945年5月7日在兰斯签署了纳粹德国的无条件投降书，结束了欧洲的第二次世界大战。"),
            es = LocalizedContent("¿Quién firmó el acta de rendición alemana?", listOf("Goering", "Doenitz", "Jodl", "Speer"), "Historia", "El general Alfred Jodl, jefe del Estado Mayor de la Wehrmacht, firmó la rendición incondicional de la Alemania nazi el 7 de mayo de 1945 en Reims, poniendo fin a la Segunda Guerra Mundial en Europa.")
        ),
        BilingualQuestion(
            id = 9403, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("En quelle année le Japon s'est-il rendu?", listOf("1944", "1945", "1946", "1947"), "Histoire", "Le Japon a capitulé le 2 septembre 1945, mettant fin à la Seconde Guerre mondiale après les bombardements atomiques d'Hiroshima et Nagasaki."),
            en = LocalizedContent("In which year did Japan surrender?", listOf("1944", "1945", "1946", "1947"), "History", "Japan surrendered on September 2, 1945, ending World War II after the atomic bombings of Hiroshima and Nagasaki."),
            zh = LocalizedContent("日本在哪一年投降？", listOf("1944", "1945", "1946", "1947"), "历史", "日本于1945年9月2日投降，在广岛和长崎原子弹爆炸后结束了第二次世界大战。"),
            es = LocalizedContent("¿En qué año se rindió Japón?", listOf("1944", "1945", "1946", "1947"), "Historia", "Japón se rindió el 2 de septiembre de 1945, poniendo fin a la Segunda Guerra Mundial tras los bombardeos atómicos de Hiroshima y Nagasaki.")
        ),
        BilingualQuestion(
            id = 9404, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel événement a forcé la reddition du Japon?", listOf("Les bombings atomiques", "La défaite en Chine", "L'invasion soviétique de la Mandchourie", "Tous les trois"), "Histoire", "Les bombardements atomiques d'Hiroshima et Nagasaki, ainsi que l'entrée en guerre de l'Union soviétique, ont contraint le Japon à capituler en août 1945."),
            en = LocalizedContent("What event forced Japan's surrender?", listOf("Atomic bombings", "Defeat in China", "Soviet invasion of Manchuria", "All three"), "History", "The atomic bombings of Hiroshima and Nagasaki, along with the Soviet Union's entry into the war, forced Japan to surrender in August 1945."),
            zh = LocalizedContent("什么事件迫使日本投降？", listOf("原子弹轰炸", "在中国战败", "苏联入侵满洲", "以上所有"), "历史", "广岛和长崎的原子弹轰炸，以及苏联的参战，迫使日本于1945年8月投降。"),
            es = LocalizedContent("¿Qué evento forzó la rendición de Japón?", listOf("Bombardeos atómicos", "Derrota en China", "Invasión soviética de Manchuria", "Los tres"), "Historia", "Los bombardeos atómicos de Hiroshima y Nagasaki, junto con la entrada en guerra de la Unión Soviética, obligaron a Japón a rendirse en agosto de 1945.")
        ),
        BilingualQuestion(
            id = 9405, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année le Procès de Nuremberg a-t-il commencé?", listOf("1944", "1945", "1946", "1947"), "Histoire", "Le procès de Nuremberg s'est ouvert le 20 novembre 1945, mais les principaux dirigeants nazis ont été jugés à partir de 1946, année où les audiences ont véritablement débuté."),
            en = LocalizedContent("In which year did the Nuremberg Trials begin?", listOf("1944", "1945", "1946", "1947"), "History", "The Nuremberg Trials opened on November 20, 1945, but the main Nazi leaders were tried starting in 1946, the year the hearings truly began."),
            zh = LocalizedContent("纽伦堡审判在哪一年开始？", listOf("1944", "1945", "1946", "1947"), "历史", "纽伦堡审判于1945年11月20日开庭，但主要纳粹领导人的审判从1946年开始，这一年听证会才真正开始。"),
            es = LocalizedContent("¿En qué año comenzaron los Juicios de Núremberg?", listOf("1944", "1945", "1946", "1947"), "Historia", "Los Juicios de Núremberg se abrieron el 20 de noviembre de 1945, pero los principales líderes nazis fueron juzgados a partir de 1946, año en que realmente comenzaron las audiencias.")
        ),
        BilingualQuestion(
            id = 9406, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel était l'objectif du Procès de Nuremberg?", listOf("Juger les criminels de guerre nazis", "Établir le droit international", "Punir les responsables", "Tous les trois"), "Histoire", "Le Procès de Nuremberg visait à juger les criminels de guerre nazis, à établir les principes du droit international et à documenter les atrocités du régime hitlérien."),
            en = LocalizedContent("What was the purpose of the Nuremberg Trials?", listOf("To judge Nazi war criminals", "To establish international law", "To punish those responsible", "All three"), "History", "The Nuremberg Trials aimed to judge Nazi war criminals, establish principles of international law, and document the atrocities of the Hitler regime."),
            zh = LocalizedContent("纽伦堡审判的目的是什么？", listOf("审判纳粹战犯", "建立国际法", "惩罚责任人", "以上所有"), "历史", "纽伦堡审判旨在审判纳粹战犯，确立国际法原则，并记录希特勒政权的暴行。"),
            es = LocalizedContent("¿Cuál fue el propósito de los Juicios de Núremberg?", listOf("Juzgar a los criminales de guerra nazis", "Establecer el derecho internacional", "Castigar a los responsables", "Los tres"), "Historia", "Los Juicios de Núremberg tenían como objetivo juzgar a los criminales de guerra nazis, establecer principios de derecho internacional y documentar las atrocidades del régimen de Hitler.")
        ),
        BilingualQuestion(
            id = 9407, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année le Procès de Nuremberg s'est-il terminé?", listOf("1945", "1946", "1947", "1948"), "Histoire", "Le Procès de Nuremberg, qui jugea les principaux criminels de guerre nazis, s'est ouvert en novembre 1945 et s'est conclu en octobre 1947 avec le verdict final."),
            en = LocalizedContent("In which year did the Nuremberg Trials end?", listOf("1945", "1946", "1947", "1948"), "History", "The Nuremberg Trials, which judged the main Nazi war criminals, opened in November 1945 and concluded in October 1947 with the final verdict."),
            zh = LocalizedContent("纽伦堡审判在哪一年结束？", listOf("1945", "1946", "1947", "1948"), "历史", "审判主要纳粹战犯的纽伦堡审判于1945年11月开庭，并于1947年10月以最终判决结束。"),
            es = LocalizedContent("¿En qué año terminaron los Juicios de Núremberg?", listOf("1945", "1946", "1947", "1948"), "Historia", "Los Juicios de Núremberg, que juzgaron a los principales criminales de guerra nazis, se abrieron en noviembre de 1945 y concluyeron en octubre de 1947 con el veredicto final.")
        ),
        BilingualQuestion(
            id = 9408, correctIndex = 1, difficulty = Difficulty.EASY,
            fr = LocalizedContent("En quelle année l'Organisation des Nations unies a-t-elle été créée?", listOf("1944", "1945", "1946", "1947"), "Histoire", "L'ONU a été fondée le 24 octobre 1945, après la Seconde Guerre mondiale, pour remplacer la Société des Nations et promouvoir la paix et la coopération internationale."),
            en = LocalizedContent("In which year was the United Nations founded?", listOf("1944", "1945", "1946", "1947"), "History", "The UN was founded on October 24, 1945, after World War II, to replace the League of Nations and promote peace and international cooperation."),
            zh = LocalizedContent("联合国在哪一年成立？", listOf("1944", "1945", "1946", "1947"), "历史", "联合国于1945年10月24日成立，在第二次世界大战之后，取代国际联盟，促进和平与国际合作。"),
            es = LocalizedContent("¿En qué año se fundó la Organización de las Naciones Unidas?", listOf("1944", "1945", "1946", "1947"), "Historia", "La ONU se fundó el 24 de octubre de 1945, después de la Segunda Guerra Mundial, para reemplazar a la Sociedad de Naciones y promover la paz y la cooperación internacional.")
        ),
        BilingualQuestion(
            id = 9409, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel traité a marqué la fin officielle de la Seconde Guerre mondiale en Europe?", listOf("Traité de Potsdam", "Traité de Versailles", "Traité de San Francisco", "Traité de Paris"), "Histoire", "Le Traité de Potsdam, signé en août 1945, a officialisé la fin de la Seconde Guerre mondiale en Europe en fixant les conditions de l'après-guerre et les frontières allemandes."),
            en = LocalizedContent("Which treaty marked the official end of World War II in Europe?", listOf("Treaty of Potsdam", "Treaty of Versailles", "Treaty of San Francisco", "Treaty of Paris"), "History", "The Treaty of Potsdam, signed in August 1945, formalized the end of World War II in Europe by setting post-war conditions and German borders."),
            zh = LocalizedContent("哪个条约标志着欧洲第二次世界大战的正式结束？", listOf("波茨坦条约", "凡尔赛条约", "旧金山条约", "巴黎条约"), "历史", "1945年8月签署的《波茨坦条约》通过设定战后条件和德国边界，正式结束了欧洲的第二次世界大战。"),
            es = LocalizedContent("¿Qué tratado marcó el fin oficial de la Segunda Guerra Mundial en Europa?", listOf("Tratado de Potsdam", "Tratado de Versalles", "Tratado de San Francisco", "Tratado de París"), "Historia", "El Tratado de Potsdam, firmado en agosto de 1945, formalizó el fin de la Segunda Guerra Mundial en Europa al establecer las condiciones de posguerra y las fronteras alemanas.")
        ),
    )

    private fun part7(): List<BilingualQuestion> = listOf(
        BilingualQuestion(
            id = 9410, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année la Conférence de Yalta a-t-elle eu lieu?", listOf("1943", "1944", "1945", "1946"), "Histoire", "La conférence de Yalta s'est tenue en février 1945, réunissant Roosevelt, Churchill et Staline pour planifier l'après-guerre et la division de l'Allemagne."),
            en = LocalizedContent("In which year did the Yalta Conference take place?", listOf("1943", "1944", "1945", "1946"), "History", "The Yalta Conference was held in February 1945, bringing together Roosevelt, Churchill, and Stalin to plan the post-war period and the division of Germany."),
            zh = LocalizedContent("雅尔塔会议在哪一年举行？", listOf("1943", "1944", "1945", "1946"), "历史", "雅尔塔会议于1945年2月举行，罗斯福、丘吉尔和斯大林齐聚一堂，规划战后事宜及德国分割问题。"),
            es = LocalizedContent("¿En qué año tuvo lugar la Conferencia de Yalta?", listOf("1943", "1944", "1945", "1946"), "Historia", "La Conferencia de Yalta se celebró en febrero de 1945, reuniendo a Roosevelt, Churchill y Stalin para planificar la posguerra y la división de Alemania.")
        ),
        BilingualQuestion(
            id = 9411, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a participé à la Conférence de Yalta?", listOf("Roosevelt, Churchill et Staline", "Eisenhower, Montgomery et Joukov", "Truman, Attlee et Staline", "Roosevelt, Churchill et De Gaulle"), "Histoire", "La Conférence de Yalta, en février 1945, réunissait les dirigeants des trois principales puissances alliées : Franklin D. Roosevelt (États-Unis), Winston Churchill (Royaume-Uni) et Joseph Staline (URSS), pour planifier l'après-guerre."),
            en = LocalizedContent("Who participated in the Yalta Conference?", listOf("Roosevelt, Churchill and Stalin", "Eisenhower, Montgomery and Zhukov", "Truman, Attlee and Stalin", "Roosevelt, Churchill and De Gaulle"), "History", "The Yalta Conference, in February 1945, brought together the leaders of the three main Allied powers: Franklin D. Roosevelt (USA), Winston Churchill (UK), and Joseph Stalin (USSR), to plan the post-war period."),
            zh = LocalizedContent("谁参加了雅尔塔会议？", listOf("罗斯福、丘吉尔和斯大林", "艾森豪威尔、蒙哥马利和朱可夫", "杜鲁门、艾德礼和斯大林", "罗斯福、丘吉尔和戴高乐"), "历史", "1945年2月的雅尔塔会议汇集了三大同盟国领导人：富兰克林·D·罗斯福（美国）、温斯顿·丘吉尔（英国）和约瑟夫·斯大林（苏联），共同规划战后事宜。"),
            es = LocalizedContent("¿Quién participó en la Conferencia de Yalta?", listOf("Roosevelt, Churchill y Stalin", "Eisenhower, Montgomery y Zhukov", "Truman, Attlee y Stalin", "Roosevelt, Churchill y De Gaulle"), "Historia", "La Conferencia de Yalta, en febrero de 1945, reunió a los líderes de las tres principales potencias aliadas: Franklin D. Roosevelt (EE. UU.), Winston Churchill (Reino Unido) y Joseph Stalin (URSS), para planificar la posguerra.")
        ),
        BilingualQuestion(
            id = 9412, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année la Conférence de Potsdam a-t-elle eu lieu?", listOf("1944", "1945", "1946", "1947"), "Histoire", "La Conférence de Potsdam s'est tenue du 17 juillet au 2 août 1945, après la capitulation de l'Allemagne nazie, pour organiser l'après-guerre en Europe."),
            en = LocalizedContent("In which year did the Potsdam Conference take place?", listOf("1944", "1945", "1946", "1947"), "History", "The Potsdam Conference was held from July 17 to August 2, 1945, after the surrender of Nazi Germany, to organize the post-war period in Europe."),
            zh = LocalizedContent("波茨坦会议在哪一年举行？", listOf("1944", "1945", "1946", "1947"), "历史", "波茨坦会议于1945年7月17日至8月2日举行，在纳粹德国投降后，旨在组织欧洲的战后事宜。"),
            es = LocalizedContent("¿En qué año tuvo lugar la Conferencia de Potsdam?", listOf("1944", "1945", "1946", "1947"), "Historia", "La Conferencia de Potsdam se celebró del 17 de julio al 2 de agosto de 1945, tras la rendición de la Alemania nazi, para organizar la posguerra en Europa.")
        ),
        BilingualQuestion(
            id = 9413, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a participé à la Conférence de Potsdam?", listOf("Roosevelt, Churchill et Staline", "Truman, Attlee et Staline", "Roosevelt, Churchill et De Gaulle", "Eisenhower, Montgomery et Joukov"), "Histoire", "La Conférence de Potsdam (juillet-août 1945) réunissait les dirigeants des trois grandes puissances alliées : le président américain Harry Truman, le Premier ministre britannique Clement Attlee (qui succéda à Churchill en cours de conférence) et le dirigeant soviétique Joseph Staline."),
            en = LocalizedContent("Who participated in the Potsdam Conference?", listOf("Roosevelt, Churchill and Stalin", "Truman, Attlee and Stalin", "Roosevelt, Churchill and De Gaulle", "Eisenhower, Montgomery and Zhukov"), "History", "The Potsdam Conference (July-August 1945) brought together the leaders of the three major Allied powers: US President Harry Truman, British Prime Minister Clement Attlee (who succeeded Churchill during the conference), and Soviet leader Joseph Stalin."),
            zh = LocalizedContent("谁参加了波茨坦会议？", listOf("罗斯福、丘吉尔和斯大林", "杜鲁门、艾德礼和斯大林", "罗斯福、丘吉尔和戴高乐", "艾森豪威尔、蒙哥马利和朱可夫"), "历史", "波茨坦会议（1945年7月至8月）汇集了三大同盟国领导人：美国总统哈里·杜鲁门、英国首相克莱门特·艾德礼（会议期间接替丘吉尔）和苏联领导人约瑟夫·斯大林。"),
            es = LocalizedContent("¿Quién participó en la Conferencia de Potsdam?", listOf("Roosevelt, Churchill y Stalin", "Truman, Attlee y Stalin", "Roosevelt, Churchill y De Gaulle", "Eisenhower, Montgomery y Zhukov"), "Historia", "La Conferencia de Potsdam (julio-agosto de 1945) reunió a los líderes de las tres grandes potencias aliadas: el presidente estadounidense Harry Truman, el primer ministro británico Clement Attlee (que sucedió a Churchill durante la conferencia) y el líder soviético Joseph Stalin.")
        ),
        BilingualQuestion(
            id = 9414, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année la Ligne Oder-Neisse a-t-elle été établie?", listOf("1943", "1944", "1945", "1946"), "Histoire", "Cette frontière entre l'Allemagne et la Pologne a été fixée en 1945 lors de la conférence de Potsdam, à la fin de la Seconde Guerre mondiale."),
            en = LocalizedContent("In which year was the Oder-Neisse Line established?", listOf("1943", "1944", "1945", "1946"), "History", "This border between Germany and Poland was fixed in 1945 during the Potsdam Conference, at the end of World War II."),
            zh = LocalizedContent("奥得-尼斯河线在哪一年确立？", listOf("1943", "1944", "1945", "1946"), "历史", "这条德国与波兰之间的边界于1945年在波茨坦会议上确定，正值第二次世界大战结束之际。"),
            es = LocalizedContent("¿En qué año se estableció la Línea Oder-Neisse?", listOf("1943", "1944", "1945", "1946"), "Historia", "Esta frontera entre Alemania y Polonia se fijó en 1945 durante la Conferencia de Potsdam, al final de la Segunda Guerra Mundial.")
        ),
        BilingualQuestion(
            id = 9415, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel était l'objectif de la Ligne Oder-Neisse?", listOf("Frontière entre l'Allemagne et la Pologne", "Frontière entre l'Allemagne et la Tchécoslovaquie", "Frontière entre l'Allemagne et l'URSS", "Ligne de défense allemande"), "Histoire", "Établie après la Seconde Guerre mondiale, la ligne Oder-Neisse fixait la frontière entre l'Allemagne et la Pologne, déplaçant le territoire allemand vers l'ouest."),
            en = LocalizedContent("What was the purpose of the Oder-Neisse Line?", listOf("Border between Germany and Poland", "Border between Germany and Czechoslovakia", "Border between Germany and the USSR", "German defensive line"), "History", "Established after World War II, the Oder-Neisse Line fixed the border between Germany and Poland, shifting German territory westward."),
            zh = LocalizedContent("奥得-尼斯河线的目的是什么？", listOf("德国与波兰之间的边界", "德国与捷克斯洛伐克之间的边界", "德国与苏联之间的边界", "德国防线"), "历史", "二战后确立的奥得-尼斯河线划定了德国与波兰之间的边界，将德国领土向西推移。"),
            es = LocalizedContent("¿Cuál era el objetivo de la Línea Oder-Neisse?", listOf("Frontera entre Alemania y Polonia", "Frontera entre Alemania y Checoslovaquia", "Frontera entre Alemania y la URSS", "Línea defensiva alemana"), "Historia", "Establecida después de la Segunda Guerra Mundial, la Línea Oder-Neisse fijó la frontera entre Alemania y Polonia, desplazando el territorio alemán hacia el oeste.")
        ),
        BilingualQuestion(
            id = 9416, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année la Division de l'Allemagne a-t-elle eu lieu?", listOf("1943", "1944", "1945", "1946"), "Histoire", "Après la capitulation de l'Allemagne nazie le 8 mai 1945, les Alliés ont divisé le pays en quatre zones d'occupation, marquant le début de la partition."),
            en = LocalizedContent("In which year did the Division of Germany take place?", listOf("1943", "1944", "1945", "1946"), "History", "After the surrender of Nazi Germany on May 8, 1945, the Allies divided the country into four occupation zones, marking the beginning of the partition."),
            zh = LocalizedContent("德国分裂发生在哪一年？", listOf("1943", "1944", "1945", "1946"), "历史", "1945年5月8日纳粹德国投降后，同盟国将该国划分为四个占领区，标志着分裂的开始。"),
            es = LocalizedContent("¿En qué año tuvo lugar la División de Alemania?", listOf("1943", "1944", "1945", "1946"), "Historia", "Tras la rendición de la Alemania nazi el 8 de mayo de 1945, los Aliados dividieron el país en cuatro zonas de ocupación, marcando el inicio de la partición.")
        ),
        BilingualQuestion(
            id = 9417, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année la Guerre froide a-t-elle commencé?", listOf("1944", "1945", "1946", "1947"), "Histoire", "Le discours de Fulton de Winston Churchill en 1946, où il évoque le « rideau de fer », est généralement considéré comme le point de départ symbolique de la Guerre froide."),
            en = LocalizedContent("In which year did the Cold War begin?", listOf("1944", "1945", "1946", "1947"), "History", "Winston Churchill's Fulton speech in 1946, where he mentioned the 'Iron Curtain', is generally considered the symbolic starting point of the Cold War."),
            zh = LocalizedContent("冷战在哪一年开始？", listOf("1944", "1945", "1946", "1947"), "历史", "温斯顿·丘吉尔1946年的富尔顿演说中提及“铁幕”，通常被视为冷战的象征性起点。"),
            es = LocalizedContent("¿En qué año comenzó la Guerra Fría?", listOf("1944", "1945", "1946", "1947"), "Historia", "El discurso de Fulton de Winston Churchill en 1946, donde mencionó el 'Telón de Acero', se considera generalmente el punto de partida simbólico de la Guerra Fría.")
        ),
        BilingualQuestion(
            id = 9418, correctIndex = 0, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel événement a marqué le début de la Guerre froide?", listOf("La fin de la Seconde Guerre mondiale", "Le Discours de Fulton", "La Doctrine Truman", "Le Blocus de Berlin"), "Histoire", "La fin de la Seconde Guerre mondiale en 1945 a laissé les États-Unis et l'URSS comme superpuissances rivales, avec des idéologies opposées, déclenchant la Guerre froide."),
            en = LocalizedContent("Which event marked the beginning of the Cold War?", listOf("The end of World War II", "The Fulton Speech", "The Truman Doctrine", "The Berlin Blockade"), "History", "The end of World War II in 1945 left the United States and the USSR as rival superpowers with opposing ideologies, triggering the Cold War."),
            zh = LocalizedContent("哪个事件标志着冷战的开始？", listOf("第二次世界大战结束", "富尔顿演说", "杜鲁门主义", "柏林封锁"), "历史", "1945年第二次世界大战结束，使美国和苏联成为意识形态对立的超级大国，引发了冷战。"),
            es = LocalizedContent("¿Qué evento marcó el inicio de la Guerra Fría?", listOf("El fin de la Segunda Guerra Mundial", "El Discurso de Fulton", "La Doctrina Truman", "El Bloqueo de Berlín"), "Historia", "El fin de la Segunda Guerra Mundial en 1945 dejó a Estados Unidos y la URSS como superpotencias rivales con ideologías opuestas, desencadenando la Guerra Fría.")
        ),
        BilingualQuestion(
            id = 9419, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année le Discours de Fulton a-t-il été prononcé?", listOf("1945", "1946", "1947", "1948"), "Histoire", "Le 5 mars 1946, Winston Churchill prononce son célèbre discours à Fulton, dans le Missouri, où il utilise l'expression « rideau de fer » pour décrire la division de l'Europe."),
            en = LocalizedContent("In which year was the Fulton Speech delivered?", listOf("1945", "1946", "1947", "1948"), "History", "On March 5, 1946, Winston Churchill delivered his famous speech in Fulton, Missouri, where he used the term 'Iron Curtain' to describe the division of Europe."),
            zh = LocalizedContent("富尔顿演说在哪一年发表？", listOf("1945", "1946", "1947", "1948"), "历史", "1946年3月5日，温斯顿·丘吉尔在密苏里州富尔顿发表著名演说，用“铁幕”一词描述欧洲的分裂。"),
            es = LocalizedContent("¿En qué año se pronunció el Discurso de Fulton?", listOf("1945", "1946", "1947", "1948"), "Historia", "El 5 de marzo de 1946, Winston Churchill pronunció su famoso discurso en Fulton, Misuri, donde utilizó el término 'Telón de Acero' para describir la división de Europa.")
        ),
        BilingualQuestion(
            id = 9420, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a prononcé le Discours de Fulton?", listOf("Harry Truman", "Winston Churchill", "Clement Attlee", "Franklin Roosevelt"), "Histoire", "Le 5 mars 1946, Winston Churchill prononça le discours de Fulton, dans le Missouri, où il employa l'expression « rideau de fer » pour décrire la division de l'Europe."),
            en = LocalizedContent("Who delivered the Fulton Speech?", listOf("Harry Truman", "Winston Churchill", "Clement Attlee", "Franklin Roosevelt"), "History", "On March 5, 1946, Winston Churchill delivered the Fulton Speech in Missouri, where he used the term 'Iron Curtain' to describe the division of Europe."),
            zh = LocalizedContent("谁发表了富尔顿演说？", listOf("哈里·杜鲁门", "温斯顿·丘吉尔", "克莱门特·艾德礼", "富兰克林·罗斯福"), "历史", "1946年3月5日，温斯顿·丘吉尔在密苏里州发表了富尔顿演说，其中使用了“铁幕”一词来描述欧洲的分裂。"),
            es = LocalizedContent("¿Quién pronunció el Discurso de Fulton?", listOf("Harry Truman", "Winston Churchill", "Clement Attlee", "Franklin Roosevelt"), "Historia", "El 5 de marzo de 1946, Winston Churchill pronunció el Discurso de Fulton en Misuri, donde utilizó la expresión 'telón de acero' para describir la división de Europa.")
        ),
        BilingualQuestion(
            id = 9421, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année la Doctrine Truman a-t-elle été annoncée?", listOf("1946", "1947", "1948", "1949"), "Histoire", "La Doctrine Truman a été annoncée en 1947 par le président américain Harry S. Truman, établissant une politique d'endiguement du communisme."),
            en = LocalizedContent("In what year was the Truman Doctrine announced?", listOf("1946", "1947", "1948", "1949"), "History", "The Truman Doctrine was announced in 1947 by US President Harry S. Truman, establishing a policy of containing communism."),
            zh = LocalizedContent("杜鲁门主义是在哪一年宣布的？", listOf("1946", "1947", "1948", "1949"), "历史", "杜鲁门主义于1947年由美国总统哈里·S·杜鲁门宣布，确立了遏制共产主义的政策。"),
            es = LocalizedContent("¿En qué año se anunció la Doctrina Truman?", listOf("1946", "1947", "1948", "1949"), "Historia", "La Doctrina Truman fue anunciada en 1947 por el presidente estadounidense Harry S. Truman, estableciendo una política de contención del comunismo.")
        ),
        BilingualQuestion(
            id = 9422, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel était l'objectif de la Doctrine Truman?", listOf("Contenir l'expansion soviétique", "Aider les pays menacés par le communisme", "Établir une alliance avec les États-Unis", "Tous les trois"), "Histoire", "La doctrine Truman visait à endiguer l'expansion du communisme en soutenant les pays menacés par l'URSS, par une aide économique et militaire, et en affirmant l'engagement américain dans la guerre froide."),
            en = LocalizedContent("What was the objective of the Truman Doctrine?", listOf("Contain Soviet expansion", "Help countries threatened by communism", "Establish an alliance with the United States", "All three"), "History", "The Truman Doctrine aimed to contain the expansion of communism by supporting countries threatened by the USSR, through economic and military aid, and affirming US commitment in the Cold War."),
            zh = LocalizedContent("杜鲁门主义的目标是什么？", listOf("遏制苏联扩张", "帮助受共产主义威胁的国家", "与美国建立联盟", "以上所有"), "历史", "杜鲁门主义旨在通过经济和军事援助支持受苏联威胁的国家，遏制共产主义扩张，并确认美国在冷战中的承诺。"),
            es = LocalizedContent("¿Cuál era el objetivo de la Doctrina Truman?", listOf("Contener la expansión soviética", "Ayudar a los países amenazados por el comunismo", "Establecer una alianza con Estados Unidos", "Los tres"), "Historia", "La Doctrina Truman buscaba contener la expansión del comunismo apoyando a los países amenazados por la URSS, mediante ayuda económica y militar, y afirmando el compromiso estadounidense en la Guerra Fría.")
        ),
        BilingualQuestion(
            id = 9423, correctIndex = 2, difficulty = Difficulty.MEDIUM,
            fr = LocalizedContent("En quelle année le Plan Marshall a-t-il été lancé?", listOf("1946", "1947", "1948", "1949"), "Histoire", "Le Plan Marshall, officiellement nommé Programme de rétablissement européen, a été lancé en 1948 pour aider à la reconstruction de l'Europe après la Seconde Guerre mondiale."),
            en = LocalizedContent("In what year was the Marshall Plan launched?", listOf("1946", "1947", "1948", "1949"), "History", "The Marshall Plan, officially named the European Recovery Program, was launched in 1948 to help rebuild Europe after World War II."),
            zh = LocalizedContent("马歇尔计划是在哪一年启动的？", listOf("1946", "1947", "1948", "1949"), "历史", "马歇尔计划，正式名称为欧洲复兴计划，于1948年启动，旨在帮助二战后的欧洲重建。"),
            es = LocalizedContent("¿En qué año se lanzó el Plan Marshall?", listOf("1946", "1947", "1948", "1949"), "Historia", "El Plan Marshall, oficialmente denominado Programa de Recuperación Europea, se lanzó en 1948 para ayudar a la reconstrucción de Europa después de la Segunda Guerra Mundial.")
        ),
        BilingualQuestion(
            id = 9424, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel était l'objectif du Plan Marshall?", listOf("Aider la reconstruction de l'Europe", "Contenir l'expansion soviétique", "Établir la stabilité économique", "Tous les trois"), "Histoire", "Le Plan Marshall visait à reconstruire l'Europe après la Seconde Guerre mondiale, à stabiliser les économies pour contrer l'influence soviétique, et à ouvrir les marchés aux produits américains."),
            en = LocalizedContent("What was the objective of the Marshall Plan?", listOf("Help rebuild Europe", "Contain Soviet expansion", "Establish economic stability", "All three"), "History", "The Marshall Plan aimed to rebuild Europe after World War II, stabilize economies to counter Soviet influence, and open markets to American products."),
            zh = LocalizedContent("马歇尔计划的目标是什么？", listOf("帮助重建欧洲", "遏制苏联扩张", "建立经济稳定", "以上所有"), "历史", "马歇尔计划旨在重建二战后的欧洲，稳定经济以对抗苏联影响，并为美国产品开放市场。"),
            es = LocalizedContent("¿Cuál era el objetivo del Plan Marshall?", listOf("Ayudar a la reconstrucción de Europa", "Contener la expansión soviética", "Establecer estabilidad económica", "Los tres"), "Historia", "El Plan Marshall buscaba reconstruir Europa después de la Segunda Guerra Mundial, estabilizar las economías para contrarrestar la influencia soviética y abrir mercados a los productos estadounidenses.")
        ),
        BilingualQuestion(
            id = 9425, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Qui a proposé le Plan Marshall?", listOf("Harry Truman", "George Marshall", "Dean Acheson", "John Foster Dulles"), "Histoire", "Le Plan Marshall, officiellement nommé Programme de rétablissement européen, a été proposé par le secrétaire d'État américain George Marshall en 1947 pour aider à la reconstruction de l'Europe après la Seconde Guerre mondiale."),
            en = LocalizedContent("Who proposed the Marshall Plan?", listOf("Harry Truman", "George Marshall", "Dean Acheson", "John Foster Dulles"), "History", "The Marshall Plan, officially named the European Recovery Program, was proposed by US Secretary of State George Marshall in 1947 to help rebuild Europe after World War II."),
            zh = LocalizedContent("谁提出了马歇尔计划？", listOf("哈里·杜鲁门", "乔治·马歇尔", "迪安·艾奇逊", "约翰·福斯特·杜勒斯"), "历史", "马歇尔计划，正式名称为欧洲复兴计划，由美国国务卿乔治·马歇尔于1947年提出，旨在帮助二战后的欧洲重建。"),
            es = LocalizedContent("¿Quién propuso el Plan Marshall?", listOf("Harry Truman", "George Marshall", "Dean Acheson", "John Foster Dulles"), "Historia", "El Plan Marshall, oficialmente denominado Programa de Recuperación Europea, fue propuesto por el Secretario de Estado estadounidense George Marshall en 1947 para ayudar a la reconstrucción de Europa después de la Segunda Guerra Mundial.")
        ),
        BilingualQuestion(
            id = 9426, correctIndex = 2, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année le Blocus de Berlin a-t-il eu lieu?", listOf("1946", "1947", "1948", "1949"), "Histoire", "Le Blocus de Berlin a débuté le 24 juin 1948, lorsque l'Union soviétique a bloqué les accès terrestres à Berlin-Ouest. Cette crise majeure de la Guerre froide a duré près d'un an, jusqu'au 12 mai 1949."),
            en = LocalizedContent("In what year did the Berlin Blockade occur?", listOf("1946", "1947", "1948", "1949"), "History", "The Berlin Blockade began on June 24, 1948, when the Soviet Union blocked land access to West Berlin. This major Cold War crisis lasted nearly a year, until May 12, 1949."),
            zh = LocalizedContent("柏林封锁发生在哪一年？", listOf("1946", "1947", "1948", "1949"), "历史", "柏林封锁始于1948年6月24日，当时苏联封锁了通往西柏林的地面通道。这场冷战重大危机持续了近一年，直到1949年5月12日。"),
            es = LocalizedContent("¿En qué año ocurrió el Bloqueo de Berlín?", listOf("1946", "1947", "1948", "1949"), "Historia", "El Bloqueo de Berlín comenzó el 24 de junio de 1948, cuando la Unión Soviética bloqueó los accesos terrestres a Berlín Occidental. Esta importante crisis de la Guerra Fría duró casi un año, hasta el 12 de mayo de 1949.")
        ),
        BilingualQuestion(
            id = 9427, correctIndex = 3, difficulty = Difficulty.HARD,
            fr = LocalizedContent("Quel était l'objectif du Blocus de Berlin?", listOf("Forcer l'Occident à quitter Berlin", "Affamer la population", "Établir le contrôle soviétique", "Tous les trois"), "Histoire", "Le blocus de Berlin (1948-1949) visait à forcer les Alliés occidentaux à abandonner Berlin-Ouest, mais il échoua grâce au pont aérien, renforçant la division de l'Allemagne."),
            en = LocalizedContent("What was the objective of the Berlin Blockade?", listOf("Force the West to leave Berlin", "Starve the population", "Establish Soviet control", "All three"), "History", "The Berlin Blockade (1948-1949) aimed to force the Western Allies to abandon West Berlin, but it failed due to the airlift, reinforcing the division of Germany."),
            zh = LocalizedContent("柏林封锁的目标是什么？", listOf("迫使西方离开柏林", "使人口挨饿", "建立苏联控制", "以上所有"), "历史", "柏林封锁（1948-1949）旨在迫使西方盟国放弃西柏林，但由于空运的成功而失败，反而加强了德国的分裂。"),
            es = LocalizedContent("¿Cuál era el objetivo del Bloqueo de Berlín?", listOf("Forzar a Occidente a abandonar Berlín", "Hambrear a la población", "Establecer el control soviético", "Los tres"), "Historia", "El Bloqueo de Berlín (1948-1949) pretendía obligar a los Aliados occidentales a abandonar Berlín Occidental, pero fracasó gracias al puente aéreo, reforzando la división de Alemania.")
        ),
        BilingualQuestion(
            id = 9428, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année le Pont aérien de Berlin a-t-il commencé?", listOf("1947", "1948", "1949", "1950"), "Histoire", "Le blocus de Berlin par l'Union soviétique a débuté en juin 1948, poussant les Alliés à mettre en place un pont aérien pour ravitailler la ville."),
            en = LocalizedContent("In what year did the Berlin Airlift begin?", listOf("1947", "1948", "1949", "1950"), "History", "The Soviet blockade of Berlin began in June 1948, prompting the Allies to set up an airlift to supply the city."),
            zh = LocalizedContent("柏林空运是在哪一年开始的？", listOf("1947", "1948", "1949", "1950"), "历史", "苏联对柏林的封锁始于1948年6月，促使盟国建立空运来为城市提供补给。"),
            es = LocalizedContent("¿En qué año comenzó el Puente Aéreo de Berlín?", listOf("1947", "1948", "1949", "1950"), "Historia", "El bloqueo soviético de Berlín comenzó en junio de 1948, lo que llevó a los Aliados a establecer un puente aéreo para abastecer la ciudad.")
        ),
        BilingualQuestion(
            id = 9429, correctIndex = 1, difficulty = Difficulty.HARD,
            fr = LocalizedContent("En quelle année le Blocus de Berlin a-t-il pris fin?", listOf("1948", "1949", "1950", "1951"), "Histoire", "Le blocus de Berlin, imposé par l'Union soviétique, a pris fin le 12 mai 1949 après que les Alliés occidentaux eurent réussi à ravitailler la ville par un pont aérien pendant près d'un an."),
            en = LocalizedContent("In what year did the Berlin Blockade end?", listOf("1948", "1949", "1950", "1951"), "History", "The Berlin Blockade, imposed by the Soviet Union, ended on May 12, 1949, after the Western Allies successfully supplied the city via an airlift for nearly a year."),
            zh = LocalizedContent("柏林封锁是在哪一年结束的？", listOf("1948", "1949", "1950", "1951"), "历史", "由苏联实施的柏林封锁于1949年5月12日结束，此前西方盟国通过空运成功为城市提供了近一年的补给。"),
            es = LocalizedContent("¿En qué año terminó el Bloqueo de Berlín?", listOf("1948", "1949", "1950", "1951"), "Historia", "El Bloqueo de Berlín, impuesto por la Unión Soviética, terminó el 12 de mayo de 1949, después de que los Aliados occidentales abastecieran con éxito la ciudad mediante un puente aéreo durante casi un año.")
        ),
    )
}
