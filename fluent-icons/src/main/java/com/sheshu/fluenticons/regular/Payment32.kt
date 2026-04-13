package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Payment32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Payment32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2f, 9.5f)
            curveTo(2f, 7.015f, 4.015f, 5f, 6.5f, 5f)
            horizontalLineToRelative(19f)
            curveTo(27.985f, 5f, 30f, 7.015f, 30f, 9.5f)
            verticalLineToRelative(13f)
            curveToRelative(0f, 2.485f, -2.015f, 4.5f, -4.5f, 4.5f)
            horizontalLineToRelative(-19f)
            curveTo(4.015f, 27f, 2f, 24.985f, 2f, 22.5f)
            verticalLineToRelative(-13f)
            close()
            moveTo(6.5f, 7f)
            curveTo(5.12f, 7f, 4f, 8.12f, 4f, 9.5f)
            verticalLineTo(11f)
            horizontalLineToRelative(24f)
            verticalLineTo(9.5f)
            curveTo(28f, 8.12f, 26.88f, 7f, 25.5f, 7f)
            horizontalLineToRelative(-19f)
            close()
            moveTo(4f, 22.5f)
            curveTo(4f, 23.88f, 5.12f, 25f, 6.5f, 25f)
            horizontalLineToRelative(19f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineTo(13f)
            horizontalLineTo(4f)
            verticalLineToRelative(9.5f)
            close()
            moveTo(21f, 19f)
            horizontalLineToRelative(3f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            reflectiveCurveToRelative(-0.448f, 1f, -1f, 1f)
            horizontalLineToRelative(-3f)
            curveToRelative(-0.552f, 0f, -1f, -0.448f, -1f, -1f)
            reflectiveCurveToRelative(0.448f, -1f, 1f, -1f)
            close()
        }
    }.build()
}
