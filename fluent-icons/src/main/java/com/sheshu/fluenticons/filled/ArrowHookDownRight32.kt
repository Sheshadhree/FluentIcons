package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowHookDownRight32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowHookDownRight32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(22f, 7f)
            curveToRelative(0.69f, 0f, 1.25f, 0.56f, 1.25f, 1.25f)
            reflectiveCurveTo(22.69f, 9.5f, 22f, 9.5f)
            horizontalLineToRelative(-8.75f)
            curveToRelative(-2.623f, 0f, -4.75f, 2.127f, -4.75f, 4.75f)
            reflectiveCurveTo(10.627f, 19f, 13.25f, 19f)
            horizontalLineToRelative(8.482f)
            lineToRelative(-2.866f, -2.866f)
            curveToRelative(-0.488f, -0.488f, -0.488f, -1.28f, 0f, -1.768f)
            reflectiveCurveToRelative(1.28f, -0.488f, 1.768f, 0f)
            lineToRelative(5f, 5f)
            curveToRelative(0.488f, 0.488f, 0.488f, 1.28f, 0f, 1.768f)
            lineToRelative(-5f, 5f)
            lineToRelative(-0.095f, 0.086f)
            curveToRelative(-0.49f, 0.4f, -1.215f, 0.372f, -1.673f, -0.086f)
            curveToRelative(-0.457f, -0.458f, -0.486f, -1.182f, -0.086f, -1.673f)
            lineToRelative(0.086f, -0.095f)
            lineToRelative(2.866f, -2.866f)
            horizontalLineTo(13.25f)
            curveTo(9.246f, 21.5f, 6f, 18.254f, 6f, 14.25f)
            reflectiveCurveTo(9.246f, 7f, 13.25f, 7f)
            horizontalLineTo(22f)
            close()
        }
    }.build()
}
