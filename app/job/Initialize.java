package job;

import models.Funcao;
import models.Usuario;
import play.jobs.Job;
import play.jobs.OnApplicationStart;

@OnApplicationStart
public class Initialize extends Job {

	@Override
	public void doJob() throws Exception {
		if (Usuario.count() == 0) {
			Usuario usuario1 = new Usuario();
			usuario1.nome = "João";
			usuario1.email = "joao12@gmail.com";
			usuario1.senha = "joaoBanana";
			usuario1.matricula = "20191064020045";
			usuario1.funcao = Funcao.admin;
			usuario1.save();

		}
	}
}
