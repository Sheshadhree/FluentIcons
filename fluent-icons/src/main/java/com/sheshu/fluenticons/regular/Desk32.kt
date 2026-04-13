package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Desk32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Desk32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5.25f, 4f)
            curveTo(3.455f, 4f, 2f, 5.455f, 2f, 7.25f)
            verticalLineTo(23.5f)
            curveTo(2f, 25.985f, 4.015f, 28f, 6.5f, 28f)
            horizontalLineToRelative(5f)
            curveToRelative(2.485f, 0f, 4.5f, -2.015f, 4.5f, -4.5f)
            verticalLineTo(12f)
            horizontalLineToRelative(12f)
            verticalLineToRelative(15f)
            curveToRelative(0f, 0.552f, 0.448f, 1f, 1f, 1f)
            reflectiveCurveToRelative(1f, -0.448f, 1f, -1f)
            verticalLineTo(7.25f)
            curveTo(30f, 5.455f, 28.545f, 4f, 26.75f, 4f)
            horizontalLineTo(5.25f)
            close()
            moveTo(4f, 12f)
            horizontalLineToRelative(10f)
            verticalLineToRelative(11.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineToRelative(-5f)
            curveTo(5.12f, 26f, 4f, 24.88f, 4f, 23.5f)
            verticalLineTo(12f)
            close()
            moveToRelative(0f, -2f)
            verticalLineTo(7.25f)
            curveTo(4f, 6.56f, 4.56f, 6f, 5.25f, 6f)
            horizontalLineToRelative(21.5f)
            curveTo(27.44f, 6f, 28f, 6.56f, 28f, 7.25f)
            verticalLineTo(10f)
            horizontalLineTo(4f)
            close()
            moveToRelative(3f, 5f)
            curveToRelative(-0.552f, 0f, -1f, 0.448f, -1f, 1f)
            reflectiveCurveToRelative(0.448f, 1f, 1f, 1f)
            horizontalLineToRelative(4f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            reflectiveCurveToRelative(-0.448f, -1f, -1f, -1f)
            horizontalLineTo(7f)
            close()
        }
    }.build()
}
