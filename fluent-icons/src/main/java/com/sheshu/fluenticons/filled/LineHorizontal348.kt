package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.LineHorizontal348: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.LineHorizontal348",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3.997f, 11.5f)
            curveToRelative(0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(37f)
            curveToRelative(0.828f, 0f, 1.5f, 0.672f, 1.5f, 1.5f)
            reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-37f)
            curveToRelative(-0.828f, 0f, -1.5f, -0.672f, -1.5f, -1.5f)
            close()
            moveTo(4f, 24.5f)
            curveTo(4f, 23.672f, 4.672f, 23f, 5.5f, 23f)
            horizontalLineToRelative(37f)
            curveToRelative(0.828f, 0f, 1.5f, 0.672f, 1.5f, 1.5f)
            reflectiveCurveTo(43.328f, 26f, 42.5f, 26f)
            horizontalLineToRelative(-37f)
            curveTo(4.672f, 26f, 4f, 25.328f, 4f, 24.5f)
            close()
            moveTo(5.5f, 36f)
            curveTo(4.672f, 36f, 4f, 36.672f, 4f, 37.5f)
            reflectiveCurveTo(4.672f, 39f, 5.5f, 39f)
            horizontalLineToRelative(37f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            reflectiveCurveTo(43.328f, 36f, 42.5f, 36f)
            horizontalLineToRelative(-37f)
            close()
        }
    }.build()
}
