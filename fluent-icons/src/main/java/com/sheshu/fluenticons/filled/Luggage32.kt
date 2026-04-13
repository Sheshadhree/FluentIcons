package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Luggage32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Luggage32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10f, 2f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            horizontalLineToRelative(10f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            reflectiveCurveToRelative(-0.448f, 1f, -1f, 1f)
            horizontalLineToRelative(-0.5f)
            verticalLineToRelative(2f)
            horizontalLineToRelative(2f)
            curveTo(24.985f, 5f, 27f, 7.015f, 27f, 9.5f)
            verticalLineToRelative(15f)
            curveToRelative(0f, 2.316f, -1.75f, 4.224f, -4f, 4.473f)
            verticalLineTo(30f)
            curveToRelative(0f, 0.552f, -0.448f, 1f, -1f, 1f)
            reflectiveCurveToRelative(-1f, -0.448f, -1f, -1f)
            verticalLineToRelative(-1f)
            horizontalLineTo(11f)
            verticalLineToRelative(1f)
            curveToRelative(0f, 0.552f, -0.448f, 1f, -1f, 1f)
            reflectiveCurveToRelative(-1f, -0.448f, -1f, -1f)
            verticalLineToRelative(-1.027f)
            curveToRelative(-2.25f, -0.25f, -4f, -2.157f, -4f, -4.473f)
            verticalLineToRelative(-15f)
            curveTo(5f, 7.015f, 7.015f, 5f, 9.5f, 5f)
            horizontalLineTo(12f)
            verticalLineTo(3f)
            horizontalLineToRelative(-1f)
            curveToRelative(-0.552f, 0f, -1f, -0.448f, -1f, -1f)
            close()
            moveToRelative(4f, 1f)
            verticalLineToRelative(2f)
            horizontalLineToRelative(4.5f)
            verticalLineTo(3f)
            horizontalLineTo(14f)
            close()
            moveToRelative(-3f, 8f)
            curveToRelative(-0.552f, 0f, -1f, 0.448f, -1f, 1f)
            reflectiveCurveToRelative(0.448f, 1f, 1f, 1f)
            horizontalLineToRelative(10f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            reflectiveCurveToRelative(-0.448f, -1f, -1f, -1f)
            horizontalLineTo(11f)
            close()
        }
    }.build()
}
