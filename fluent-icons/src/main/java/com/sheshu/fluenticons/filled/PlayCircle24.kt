package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.PlayCircle24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PlayCircle24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2f, 12f)
            curveTo(2f, 6.477f, 6.477f, 2f, 12f, 2f)
            reflectiveCurveToRelative(10f, 4.477f, 10f, 10f)
            reflectiveCurveToRelative(-4.477f, 10f, -10f, 10f)
            reflectiveCurveTo(2f, 17.523f, 2f, 12f)
            close()
            moveToRelative(8.856f, -3.845f)
            curveTo(10.023f, 7.694f, 9f, 8.296f, 9f, 9.249f)
            verticalLineToRelative(5.503f)
            curveToRelative(0f, 0.952f, 1.023f, 1.554f, 1.856f, 1.093f)
            lineToRelative(5.757f, -3.189f)
            curveTo(16.852f, 12.524f, 17f, 12.273f, 17f, 12f)
            reflectiveCurveToRelative(-0.148f, -0.524f, -0.387f, -0.656f)
            lineToRelative(-5.757f, -3.189f)
            close()
        }
    }.build()
}
