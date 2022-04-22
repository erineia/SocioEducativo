package br.com.jus.runners;

import br.com.jus.tests.adolescente.tests.GetConsultarTodosAdolescentesTest;
import br.com.jus.suites.Contract;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
@Categories.IncludeCategory(Contract.class)
@Suite.SuiteClasses({

        /**
         * API Socio Educativo
         */

        GetConsultarTodosAdolescentesTest.class
})
public class Contracts {
}
