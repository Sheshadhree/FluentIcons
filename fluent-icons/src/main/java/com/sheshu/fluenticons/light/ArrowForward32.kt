package com.sheshu.fluenticons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Light.ArrowForward32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Light.ArrowForward32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(21.146f, 6.854f)
            curveToRelative(-0.195f, -0.196f, -0.195f, -0.512f, 0f, -0.708f)
            curveToRelative(0.196f, -0.195f, 0.512f, -0.195f, 0.708f, 0f)
            lineToRelative(7f, 7f)
            curveToRelative(0.195f, 0.196f, 0.195f, 0.512f, 0f, 0.708f)
            lineToRelative(-7f, 7f)
            curveToRelative(-0.196f, 0.195f, -0.512f, 0.195f, -0.708f, 0f)
            curveToRelative(-0.195f, -0.196f, -0.195f, -0.512f, 0f, -0.708f)
            lineTo(27.293f, 14f)
            horizontalLineTo(15.5f)
            curveTo(9.149f, 14f, 4f, 19.149f, 4f, 25.5f)
            curveTo(4f, 25.776f, 3.776f, 26f, 3.5f, 26f)
            reflectiveCurveTo(3f, 25.776f, 3f, 25.5f)
            curveTo(3f, 18.596f, 8.596f, 13f, 15.5f, 13f)
            horizontalLineToRelative(11.793f)
            lineToRelative(-6.147f, -6.146f)
            close()
        }
    }.build()
}
