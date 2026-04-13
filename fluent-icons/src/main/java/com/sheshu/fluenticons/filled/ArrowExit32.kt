package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowExit32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowExit32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7.25f, 2.5f)
            curveTo(4.627f, 2.5f, 2.5f, 4.627f, 2.5f, 7.25f)
            verticalLineToRelative(17.5f)
            curveToRelative(0f, 2.623f, 2.127f, 4.75f, 4.75f, 4.75f)
            horizontalLineToRelative(11.5f)
            curveToRelative(0.69f, 0f, 1.25f, -0.56f, 1.25f, -1.25f)
            reflectiveCurveTo(19.44f, 27f, 18.75f, 27f)
            horizontalLineTo(7.25f)
            curveTo(6.007f, 27f, 5f, 25.993f, 5f, 24.75f)
            verticalLineTo(7.25f)
            curveTo(5f, 6.007f, 6.007f, 5f, 7.25f, 5f)
            horizontalLineToRelative(11.5f)
            curveTo(19.44f, 5f, 20f, 4.44f, 20f, 3.75f)
            reflectiveCurveTo(19.44f, 2.5f, 18.75f, 2.5f)
            horizontalLineTo(7.25f)
            close()
            moveToRelative(15.884f, 6.116f)
            curveToRelative(-0.488f, -0.488f, -1.28f, -0.488f, -1.768f, 0f)
            reflectiveCurveToRelative(-0.488f, 1.28f, 0f, 1.768f)
            lineToRelative(4.366f, 4.366f)
            horizontalLineTo(11.25f)
            curveTo(10.56f, 14.75f, 10f, 15.31f, 10f, 16f)
            reflectiveCurveToRelative(0.56f, 1.25f, 1.25f, 1.25f)
            horizontalLineToRelative(14.482f)
            lineToRelative(-4.366f, 4.366f)
            curveToRelative(-0.488f, 0.488f, -0.488f, 1.28f, 0f, 1.768f)
            reflectiveCurveToRelative(1.28f, 0.488f, 1.768f, 0f)
            lineToRelative(6.5f, -6.5f)
            curveToRelative(0.488f, -0.488f, 0.488f, -1.28f, 0f, -1.768f)
            lineToRelative(-6.5f, -6.5f)
            close()
        }
    }.build()
}
