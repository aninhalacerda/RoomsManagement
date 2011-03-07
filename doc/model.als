
abstract sig Alocavel {
}


sig Escritorio {
}

sig Laboratorio extends Alocavel {
}

sig SalaDeConferencia  extends Alocavel {
}


sig SalaDeAula extends Alocavel {
}

abstract sig Evento {
}

sig Aula extends Evento {
}

sig Conferencia extends Evento {
}

sig Alocacao {
     evento: one Evento,
     sala: one Alocavel
}

fact AulaEmSalaDeAulaOuLab {
	all aloc : Alocacao | aloc.evento in Aula => (aloc.sala in Laboratorio or aloc.sala in SalaDeAula) 
}

fact ConferenciaEmSalaDeConferencia {
	all aloc: Alocacao | aloc.evento in Conferencia => aloc.sala in SalaDeConferencia
}

fact EventoNoMaximoEmUmaSala {
	all e: Evento | lone aloc: Alocacao | e in aloc.evento 
}

pred NaoTrivial[]{
	#Alocacao>=2
}

pred Vazio[]{}

run NaoTrivial for 4
