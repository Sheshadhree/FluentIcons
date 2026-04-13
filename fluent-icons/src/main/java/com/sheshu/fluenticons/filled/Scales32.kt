package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Scales32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Scales32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5f, 4f)
            curveTo(4.448f, 4f, 4f, 4.448f, 4f, 5f)
            reflectiveCurveToRelative(0.448f, 1f, 1f, 1f)
            horizontalLineToRelative(1.557f)
            lineToRelative(-3.491f, 9.143f)
            curveTo(3.022f, 15.257f, 3f, 15.378f, 3f, 15.5f)
            curveTo(3f, 18.077f, 4.923f, 20f, 7.5f, 20f)
            reflectiveCurveToRelative(4.5f, -1.923f, 4.5f, -4.5f)
            curveToRelative(0f, -0.122f, -0.022f, -0.243f, -0.066f, -0.357f)
            lineTo(8.444f, 6f)
            horizontalLineTo(15f)
            verticalLineToRelative(16f)
            horizontalLineTo(9f)
            curveToRelative(-1.657f, 0f, -3f, 1.343f, -3f, 3f)
            reflectiveCurveToRelative(1.343f, 3f, 3f, 3f)
            horizontalLineToRelative(14f)
            curveToRelative(1.657f, 0f, 3f, -1.343f, 3f, -3f)
            reflectiveCurveToRelative(-1.343f, -3f, -3f, -3f)
            horizontalLineToRelative(-6f)
            verticalLineTo(6f)
            horizontalLineToRelative(6.434f)
            lineToRelative(-3.372f, 9.154f)
            curveTo(20.02f, 15.265f, 20f, 15.382f, 20f, 15.5f)
            curveToRelative(0f, 2.577f, 1.923f, 4.5f, 4.5f, 4.5f)
            reflectiveCurveToRelative(4.5f, -1.923f, 4.5f, -4.5f)
            curveToRelative(0f, -0.118f, -0.02f, -0.235f, -0.062f, -0.346f)
            lineTo(25.566f, 6f)
            horizontalLineTo(27f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            reflectiveCurveToRelative(-0.448f, -1f, -1f, -1f)
            horizontalLineTo(5f)
            close()
            moveToRelative(2.5f, 5.137f)
            lineTo(9.548f, 14.5f)
            horizontalLineTo(5.452f)
            lineTo(7.5f, 9.137f)
            close()
            moveTo(22.434f, 14.5f)
            lineTo(24.5f, 8.893f)
            lineToRelative(2.066f, 5.607f)
            horizontalLineToRelative(-4.132f)
            close()
        }
    }.build()
}
