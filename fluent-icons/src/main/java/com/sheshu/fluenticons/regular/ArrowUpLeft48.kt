package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowUpLeft48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowUpLeft48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(25.75f, 6f)
            curveTo(26.44f, 6f, 27f, 6.56f, 27f, 7.25f)
            reflectiveCurveTo(26.44f, 8.5f, 25.75f, 8.5f)
            horizontalLineTo(10.268f)
            lineToRelative(31.366f, 31.366f)
            curveToRelative(0.488f, 0.488f, 0.488f, 1.28f, 0f, 1.768f)
            reflectiveCurveToRelative(-1.28f, 0.488f, -1.768f, 0f)
            lineTo(8.5f, 10.268f)
            verticalLineTo(25.75f)
            curveTo(8.5f, 26.44f, 7.94f, 27f, 7.25f, 27f)
            reflectiveCurveTo(6f, 26.44f, 6f, 25.75f)
            verticalLineTo(7.25f)
            curveTo(6f, 6.56f, 6.56f, 6f, 7.25f, 6f)
            horizontalLineToRelative(18.5f)
            close()
        }
    }.build()
}
