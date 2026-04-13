package com.sheshu.fluenticons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Light.PaintBrush32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Light.PaintBrush32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7f, 2f)
            curveTo(6.448f, 2f, 6f, 2.448f, 6f, 3f)
            verticalLineToRelative(15.5f)
            curveTo(6f, 20.433f, 7.567f, 22f, 9.5f, 22f)
            horizontalLineTo(12f)
            verticalLineToRelative(4f)
            curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
            reflectiveCurveToRelative(4f, -1.79f, 4f, -4f)
            verticalLineToRelative(-4f)
            horizontalLineToRelative(2.5f)
            curveToRelative(1.933f, 0f, 3.5f, -1.567f, 3.5f, -3.5f)
            verticalLineTo(3f)
            curveToRelative(0f, -0.552f, -0.448f, -1f, -1f, -1f)
            horizontalLineTo(7f)
            close()
            moveToRelative(11f, 1f)
            horizontalLineToRelative(3f)
            verticalLineToRelative(6.5f)
            curveToRelative(0f, 0.276f, 0.224f, 0.5f, 0.5f, 0.5f)
            reflectiveCurveTo(22f, 9.776f, 22f, 9.5f)
            verticalLineTo(3f)
            horizontalLineToRelative(3f)
            verticalLineToRelative(12f)
            horizontalLineTo(7f)
            verticalLineTo(3f)
            horizontalLineToRelative(10f)
            verticalLineToRelative(4.5f)
            curveTo(17f, 7.776f, 17.224f, 8f, 17.5f, 8f)
            reflectiveCurveTo(18f, 7.776f, 18f, 7.5f)
            verticalLineTo(3f)
            close()
            moveTo(7f, 16f)
            horizontalLineToRelative(18f)
            verticalLineToRelative(2.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineTo(20f)
            curveToRelative(-0.552f, 0f, -1f, 0.448f, -1f, 1f)
            verticalLineToRelative(4f)
            curveToRelative(0f, 1.657f, -1.343f, 3f, -3f, 3f)
            reflectiveCurveToRelative(-3f, -1.343f, -3f, -3f)
            verticalLineToRelative(-4f)
            curveToRelative(0f, -0.552f, -0.448f, -1f, -1f, -1f)
            horizontalLineTo(9.5f)
            curveTo(8.12f, 21f, 7f, 19.88f, 7f, 18.5f)
            verticalLineTo(16f)
            close()
        }
    }.build()
}
