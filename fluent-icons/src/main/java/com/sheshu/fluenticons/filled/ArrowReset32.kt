package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowReset32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowReset32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8.884f, 3.116f)
            curveToRelative(0.488f, 0.488f, 0.488f, 1.28f, 0f, 1.768f)
            lineTo(6.018f, 7.75f)
            horizontalLineTo(17.5f)
            curveToRelative(5.937f, 0f, 10.75f, 4.813f, 10.75f, 10.75f)
            reflectiveCurveTo(23.437f, 29.25f, 17.5f, 29.25f)
            reflectiveCurveTo(6.75f, 24.437f, 6.75f, 18.5f)
            curveToRelative(0f, -0.69f, 0.56f, -1.25f, 1.25f, -1.25f)
            reflectiveCurveToRelative(1.25f, 0.56f, 1.25f, 1.25f)
            curveToRelative(0f, 4.556f, 3.694f, 8.25f, 8.25f, 8.25f)
            reflectiveCurveToRelative(8.25f, -3.694f, 8.25f, -8.25f)
            reflectiveCurveToRelative(-3.694f, -8.25f, -8.25f, -8.25f)
            horizontalLineTo(6.018f)
            lineToRelative(2.866f, 2.866f)
            curveToRelative(0.488f, 0.488f, 0.488f, 1.28f, 0f, 1.768f)
            reflectiveCurveToRelative(-1.28f, 0.488f, -1.768f, 0f)
            lineToRelative(-5f, -5f)
            curveToRelative(-0.488f, -0.488f, -0.488f, -1.28f, 0f, -1.768f)
            lineToRelative(5f, -5f)
            curveToRelative(0.488f, -0.488f, 1.28f, -0.488f, 1.768f, 0f)
            close()
        }
    }.build()
}
