package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Send16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Send16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(1.177f, 1.119f)
            curveToRelative(0.152f, -0.13f, 0.368f, -0.156f, 0.547f, -0.066f)
            lineToRelative(13f, 6.5f)
            curveTo(14.893f, 7.638f, 15f, 7.81f, 15f, 8f)
            reflectiveCurveToRelative(-0.107f, 0.363f, -0.276f, 0.447f)
            lineToRelative(-13f, 6.5f)
            curveToRelative(-0.18f, 0.09f, -0.395f, 0.064f, -0.547f, -0.065f)
            curveToRelative(-0.153f, -0.13f, -0.214f, -0.338f, -0.155f, -0.529f)
            lineTo(2.977f, 8f)
            lineTo(1.022f, 1.647f)
            curveToRelative(-0.059f, -0.191f, 0.002f, -0.4f, 0.155f, -0.528f)
            close()
            moveTo(3.869f, 8.5f)
            lineToRelative(-1.548f, 5.03f)
            lineTo(13.383f, 8f)
            lineTo(2.322f, 2.47f)
            lineTo(3.869f, 7.5f)
            horizontalLineTo(9.5f)
            curveTo(9.776f, 7.5f, 10f, 7.724f, 10f, 8f)
            reflectiveCurveTo(9.776f, 8.5f, 9.5f, 8.5f)
            horizontalLineTo(3.87f)
            close()
        }
    }.build()
}
