package br.com.portoseguro.controlequalidade.service;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("rest")
public class ConfigService extends Application {

	@Override
    public Set<Class<?>> getClasses() {
        final Set<Class<?>> classes = new HashSet<Class<?>>();
        classes.add(LoginService.class);
        classes.add(UsuarioService.class);
        classes.add(AnaliseService.class);
        classes.add(EquipeService.class);
        classes.add(TipoProcessoService.class);
        return classes;
    }
 
    @Override
    public Set<Object> getSingletons() {
        final Set<Object> singletons = new HashSet<Object>();
        return singletons;
    }
 
    @Override
    public Map<String, Object> getProperties() {
        final Map<String, Object> properties = new HashMap<String, Object>();
        return properties;
    }
	
}
