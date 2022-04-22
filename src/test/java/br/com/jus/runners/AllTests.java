package br.com.jus.runners;

import br.com.jus.tests.adolescente.tests.GetConsultarTodosAdolescentesTest;
import br.com.jus.tests.adolescente.tests.PostCadastrarAdolescenteTest;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
@Categories.IncludeCategory(br.com.jus.suites.AllTests.class)
@Suite.SuiteClasses({

        /**
         * API Socio Educativo
         */

        GetConsultarTodosAdolescentesTest.class,
        PostCadastrarAdolescenteTest.class
})
public class AllTests {
}
