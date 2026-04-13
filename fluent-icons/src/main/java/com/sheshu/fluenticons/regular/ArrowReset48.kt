package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowReset48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowReset48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(13.634f, 6.634f)
            curveToRelative(0.488f, -0.488f, 0.488f, -1.28f, 0f, -1.768f)
            reflectiveCurveToRelative(-1.28f, -0.488f, -1.768f, 0f)
            lineToRelative(-7.5f, 7.5f)
            curveToRelative(-0.488f, 0.488f, -0.488f, 1.28f, 0f, 1.768f)
            lineToRelative(7.5f, 7.5f)
            curveToRelative(0.488f, 0.488f, 1.28f, 0.488f, 1.768f, 0f)
            reflectiveCurveToRelative(0.488f, -1.28f, 0f, -1.768f)
            lineTo(8.268f, 14.5f)
            horizontalLineTo(26.5f)
            curveToRelative(7.18f, 0f, 13f, 5.82f, 13f, 13f)
            reflectiveCurveToRelative(-5.82f, 13f, -13f, 13f)
            reflectiveCurveToRelative(-13f, -5.82f, -13f, -13f)
            curveToRelative(0f, -0.69f, -0.56f, -1.25f, -1.25f, -1.25f)
            reflectiveCurveTo(11f, 26.81f, 11f, 27.5f)
            curveTo(11f, 36.06f, 17.94f, 43f, 26.5f, 43f)
            curveTo(35.06f, 43f, 42f, 36.06f, 42f, 27.5f)
            curveTo(42f, 18.94f, 35.06f, 12f, 26.5f, 12f)
            horizontalLineTo(8.268f)
            lineToRelative(5.366f, -5.366f)
            close()
        }
    }.build()
}
