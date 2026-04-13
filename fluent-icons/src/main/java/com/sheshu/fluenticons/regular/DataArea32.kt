package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.DataArea32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.DataArea32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5f, 4f)
            curveToRelative(0f, -0.552f, -0.448f, -1f, -1f, -1f)
            reflectiveCurveTo(3f, 3.448f, 3f, 4f)
            verticalLineToRelative(20.5f)
            curveTo(3f, 26.985f, 5.015f, 29f, 7.5f, 29f)
            horizontalLineTo(28f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            reflectiveCurveToRelative(-0.448f, -1f, -1f, -1f)
            horizontalLineToRelative(-2f)
            verticalLineTo(9f)
            curveToRelative(0f, -0.379f, -0.214f, -0.725f, -0.553f, -0.894f)
            curveToRelative(-0.339f, -0.17f, -0.744f, -0.133f, -1.047f, 0.094f)
            lineToRelative(-7.506f, 5.63f)
            lineToRelative(-5.447f, -2.724f)
            curveToRelative(-0.263f, -0.132f, -0.57f, -0.141f, -0.84f, -0.025f)
            lineTo(5f, 13.483f)
            verticalLineTo(4f)
            close()
            moveToRelative(0f, 11.66f)
            lineToRelative(5.968f, -2.558f)
            lineToRelative(5.585f, 2.792f)
            curveToRelative(0.339f, 0.17f, 0.744f, 0.133f, 1.047f, -0.094f)
            lineTo(24f, 11f)
            verticalLineToRelative(16f)
            horizontalLineTo(7.5f)
            curveTo(6.12f, 27f, 5f, 25.88f, 5f, 24.5f)
            verticalLineToRelative(-8.84f)
            close()
        }
    }.build()
}
