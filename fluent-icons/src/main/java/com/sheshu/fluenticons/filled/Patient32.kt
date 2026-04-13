package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Patient32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Patient32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(20f, 10f)
            curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
            reflectiveCurveToRelative(-4f, -1.79f, -4f, -4f)
            reflectiveCurveToRelative(1.79f, -4f, 4f, -4f)
            reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
            close()
            moveTo(10f, 24f)
            curveToRelative(-0.552f, 0f, -1f, 0.448f, -1f, 1f)
            reflectiveCurveToRelative(0.448f, 1f, 1f, 1f)
            horizontalLineToRelative(12f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            reflectiveCurveToRelative(-0.448f, -1f, -1f, -1f)
            horizontalLineTo(10f)
            close()
            moveTo(5f, 5.5f)
            curveTo(5f, 3.567f, 6.567f, 2f, 8.5f, 2f)
            horizontalLineToRelative(15f)
            curveTo(25.433f, 2f, 27f, 3.567f, 27f, 5.5f)
            verticalLineToRelative(21f)
            curveToRelative(0f, 1.933f, -1.567f, 3.5f, -3.5f, 3.5f)
            horizontalLineToRelative(-15f)
            curveTo(6.567f, 30f, 5f, 28.433f, 5f, 26.5f)
            verticalLineToRelative(-21f)
            close()
            moveTo(8.5f, 4f)
            curveTo(7.672f, 4f, 7f, 4.672f, 7f, 5.5f)
            verticalLineTo(20f)
            horizontalLineToRelative(3f)
            verticalLineToRelative(-3f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            horizontalLineToRelative(8f)
            curveToRelative(1.105f, 0f, 2f, 0.895f, 2f, 2f)
            verticalLineToRelative(3f)
            horizontalLineToRelative(3f)
            verticalLineTo(5.5f)
            curveTo(25f, 4.672f, 24.328f, 4f, 23.5f, 4f)
            horizontalLineToRelative(-15f)
            close()
            moveTo(7f, 26.5f)
            curveTo(7f, 27.328f, 7.672f, 28f, 8.5f, 28f)
            horizontalLineToRelative(15f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            verticalLineTo(22f)
            horizontalLineTo(7f)
            verticalLineToRelative(4.5f)
            close()
        }
    }.build()
}
