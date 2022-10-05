package packmvn.util;

import java.io.File;
import java.nio.file.Path;

import gg.jte.ContentType;
import gg.jte.TemplateEngine;
import gg.jte.resolve.DirectoryCodeResolver;

public class PreCompileJte {
    private static final boolean isDev = (new File("debugFlag.txt" )).exists();
    
    public static TemplateEngine createTemplateEngine() {
        if (isDev) {
            DirectoryCodeResolver codeResolver = new DirectoryCodeResolver(Path.of("src", "main", "jte"));
            return TemplateEngine.create(codeResolver, ContentType.Html);
        } else {
            return TemplateEngine.createPrecompiled(Path.of("jte-classes"), ContentType.Html);
        }
    }

}
