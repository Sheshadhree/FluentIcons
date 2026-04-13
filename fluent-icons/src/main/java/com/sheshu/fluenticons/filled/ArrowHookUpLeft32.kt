package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowHookUpLeft32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowHookUpLeft32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(11.46f, 5.78f)
            curveToRelative(0.492f, -0.4f, 1.216f, -0.372f, 1.674f, 0.086f)
            curveToRelative(0.457f, 0.458f, 0.486f, 1.182f, 0.086f, 1.673f)
            lineToRelative(-0.086f, 0.095f)
            lineToRelative(-2.867f, 2.866f)
            horizontalLineToRelative(8.483f)
            curveToRelative(4.004f, 0f, 7.25f, 3.246f, 7.25f, 7.25f)
            reflectiveCurveTo(22.754f, 25f, 18.75f, 25f)
            horizontalLineTo(10f)
            curveToRelative(-0.69f, 0f, -1.25f, -0.56f, -1.25f, -1.25f)
            reflectiveCurveTo(9.31f, 22.5f, 10f, 22.5f)
            horizontalLineToRelative(8.75f)
            curveToRelative(2.623f, 0f, 4.75f, -2.127f, 4.75f, -4.75f)
            reflectiveCurveTo(21.373f, 13f, 18.75f, 13f)
            horizontalLineToRelative(-8.482f)
            lineToRelative(2.866f, 2.866f)
            curveToRelative(0.488f, 0.488f, 0.488f, 1.28f, 0f, 1.768f)
            reflectiveCurveToRelative(-1.28f, 0.488f, -1.768f, 0f)
            lineToRelative(-5f, -5f)
            curveToRelative(-0.488f, -0.488f, -0.488f, -1.28f, 0f, -1.768f)
            lineToRelative(5f, -5f)
            lineToRelative(0.095f, -0.086f)
            close()
        }
    }.build()
}
