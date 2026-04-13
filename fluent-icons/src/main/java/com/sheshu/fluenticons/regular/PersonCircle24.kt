package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.PersonCircle24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.PersonCircle24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(17f, 13.5f)
            curveToRelative(0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
            horizontalLineToRelative(-7f)
            curveTo(7.672f, 12f, 7f, 12.672f, 7f, 13.5f)
            verticalLineTo(14f)
            curveToRelative(0f, 1.971f, 1.86f, 4f, 5f, 4f)
            curveToRelative(3.14f, 0f, 5f, -2.029f, 5f, -4f)
            verticalLineToRelative(-0.5f)
            close()
            moveToRelative(-2.25f, -5.25f)
            curveToRelative(0f, -1.519f, -1.231f, -2.75f, -2.75f, -2.75f)
            reflectiveCurveTo(9.25f, 6.731f, 9.25f, 8.25f)
            reflectiveCurveTo(10.481f, 11f, 12f, 11f)
            reflectiveCurveToRelative(2.75f, -1.231f, 2.75f, -2.75f)
            close()
            moveTo(22f, 12f)
            curveToRelative(0f, 5.523f, -4.477f, 10f, -10f, 10f)
            reflectiveCurveTo(2f, 17.523f, 2f, 12f)
            reflectiveCurveTo(6.477f, 2f, 12f, 2f)
            reflectiveCurveToRelative(10f, 4.477f, 10f, 10f)
            close()
            moveToRelative(-1.5f, 0f)
            curveToRelative(0f, -4.694f, -3.806f, -8.5f, -8.5f, -8.5f)
            reflectiveCurveTo(3.5f, 7.306f, 3.5f, 12f)
            reflectiveCurveToRelative(3.806f, 8.5f, 8.5f, 8.5f)
            reflectiveCurveToRelative(8.5f, -3.806f, 8.5f, -8.5f)
            close()
        }
    }.build()
}
