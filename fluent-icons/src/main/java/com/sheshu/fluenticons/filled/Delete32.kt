package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Delete32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Delete32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(13.5f, 6.5f)
            verticalLineTo(7f)
            horizontalLineToRelative(5f)
            verticalLineTo(6.5f)
            curveTo(18.5f, 5.12f, 17.38f, 4f, 16f, 4f)
            reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
            close()
            moveToRelative(-2f, 0.5f)
            verticalLineTo(6.5f)
            curveTo(11.5f, 4.015f, 13.515f, 2f, 16f, 2f)
            reflectiveCurveToRelative(4.5f, 2.015f, 4.5f, 4.5f)
            verticalLineTo(7f)
            horizontalLineTo(28f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            reflectiveCurveToRelative(-0.448f, 1f, -1f, 1f)
            horizontalLineToRelative(-1.508f)
            lineTo(24.6f, 25.568f)
            curveTo(24.31f, 28.093f, 22.173f, 30f, 19.63f, 30f)
            horizontalLineToRelative(-7.26f)
            curveToRelative(-2.542f, 0f, -4.68f, -1.907f, -4.968f, -4.432f)
            lineTo(5.508f, 9f)
            horizontalLineTo(4f)
            curveTo(3.448f, 9f, 3f, 8.552f, 3f, 8f)
            reflectiveCurveToRelative(0.448f, -1f, 1f, -1f)
            horizontalLineToRelative(7.5f)
            close()
            moveToRelative(2.5f, 6.5f)
            curveToRelative(0f, -0.552f, -0.448f, -1f, -1f, -1f)
            reflectiveCurveToRelative(-1f, 0.448f, -1f, 1f)
            verticalLineToRelative(10f)
            curveToRelative(0f, 0.552f, 0.448f, 1f, 1f, 1f)
            reflectiveCurveToRelative(1f, -0.448f, 1f, -1f)
            verticalLineToRelative(-10f)
            close()
            moveToRelative(5f, -1f)
            curveToRelative(-0.552f, 0f, -1f, 0.448f, -1f, 1f)
            verticalLineToRelative(10f)
            curveToRelative(0f, 0.552f, 0.448f, 1f, 1f, 1f)
            reflectiveCurveToRelative(1f, -0.448f, 1f, -1f)
            verticalLineToRelative(-10f)
            curveToRelative(0f, -0.552f, -0.448f, -1f, -1f, -1f)
            close()
        }
    }.build()
}
