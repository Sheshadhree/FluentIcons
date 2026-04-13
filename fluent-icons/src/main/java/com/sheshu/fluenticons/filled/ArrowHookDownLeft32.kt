package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowHookDownLeft32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowHookDownLeft32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(18.75f, 7f)
            curveTo(22.754f, 7f, 26f, 10.246f, 26f, 14.25f)
            reflectiveCurveToRelative(-3.246f, 7.25f, -7.25f, 7.25f)
            horizontalLineToRelative(-8.482f)
            lineToRelative(2.866f, 2.866f)
            lineToRelative(0.086f, 0.095f)
            curveToRelative(0.4f, 0.49f, 0.371f, 1.215f, -0.086f, 1.673f)
            curveToRelative(-0.458f, 0.457f, -1.182f, 0.486f, -1.673f, 0.086f)
            lineToRelative(-0.095f, -0.086f)
            lineToRelative(-5f, -5f)
            curveToRelative(-0.488f, -0.488f, -0.488f, -1.28f, 0f, -1.768f)
            lineToRelative(5f, -5f)
            curveToRelative(0.488f, -0.488f, 1.28f, -0.488f, 1.768f, 0f)
            reflectiveCurveToRelative(0.488f, 1.28f, 0f, 1.768f)
            lineTo(10.268f, 19f)
            horizontalLineToRelative(8.482f)
            curveToRelative(2.623f, 0f, 4.75f, -2.127f, 4.75f, -4.75f)
            reflectiveCurveTo(21.373f, 9.5f, 18.75f, 9.5f)
            horizontalLineTo(10f)
            curveToRelative(-0.69f, 0f, -1.25f, -0.56f, -1.25f, -1.25f)
            reflectiveCurveTo(9.31f, 7f, 10f, 7f)
            horizontalLineToRelative(8.75f)
            close()
        }
    }.build()
}
