import gitbucket.core.plugin.PluginRegistry
import gitbucket.core.service.SystemSettingsService
import io.github.gitbucket.solidbase.model.Version
import javax.servlet.ServletContext

class Plugin extends gitbucket.core.plugin.Plugin {
  override val pluginId: String = "fileicon"
  override val pluginName: String = "File Icon Plugin"
  override val description: String = "Fancy file icon for  GitBucket plug-in"
  override val versions: List[Version] = List(new Version("1.0.0"))

  override val assetsMappings: Seq[(String, String)] = Seq("/fileicon" -> "/")

  override def javaScripts(registry: PluginRegistry, context: ServletContext, settings: SystemSettingsService.SystemSettings): Seq[(String, String)] = {
    val jsPath = settings.baseUrl.getOrElse(context.getContextPath) + "/plugin-assets/fileicon/bundle/entry.js"
    Seq(".*" ->
      s"""</script>
        |<script src="${jsPath}">""".stripMargin)
  }

}
