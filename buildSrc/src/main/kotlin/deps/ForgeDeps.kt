package deps

object ForgeDeps {
    fun get(minecraft: String): List<VersionedDependency> {
        return buildDependencies{


            modstitchLegacyModImplementation("thedarkcolour:kotlinforforge:4.11.0")

            modstitchLegacyModRuntimeOnly ("top.theillusivec4.curios:curios-forge:5.14.1+1.20.1")
            modstitchModCompileOnly ("top.theillusivec4.curios:curios-forge:5.14.1+1.20.1:api")

            modstitchLegacyModImplementation ("com.tterrag.registrate:Registrate:MC1.20-1.3.11")
            modstitchJiJ ("com.tterrag.registrate:Registrate:MC1.20-1.3.11")

        }
    }
}