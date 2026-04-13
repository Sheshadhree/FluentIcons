package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ImageBorder16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ImageBorder16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(9f, 6f)
            curveTo(8.448f, 6f, 8f, 6.448f, 8f, 7f)
            reflectiveCurveToRelative(0.448f, 1f, 1f, 1f)
            reflectiveCurveToRelative(1f, -0.448f, 1f, -1f)
            reflectiveCurveToRelative(-0.448f, -1f, -1f, -1f)
            close()
            moveTo(4.501f, 4f)
            curveTo(4.224f, 4f, 4f, 4.224f, 4f, 4.501f)
            verticalLineToRelative(6.998f)
            curveTo(4f, 11.776f, 4.224f, 12f, 4.501f, 12f)
            horizontalLineToRelative(6.998f)
            curveTo(11.776f, 12f, 12f, 11.776f, 12f, 11.499f)
            verticalLineTo(4.501f)
            curveTo(12f, 4.224f, 11.776f, 4f, 11.499f, 4f)
            horizontalLineTo(4.501f)
            close()
            moveTo(5f, 11f)
            verticalLineTo(5f)
            horizontalLineToRelative(6f)
            verticalLineToRelative(6f)
            horizontalLineToRelative(-0.296f)
            lineTo(9.202f, 9.498f)
            curveToRelative(-0.664f, -0.664f, -1.74f, -0.664f, -2.404f, 0f)
            lineTo(5.296f, 11f)
            horizontalLineTo(5f)
            close()
            moveToRelative(3.495f, -0.795f)
            lineTo(9.29f, 11f)
            horizontalLineTo(6.71f)
            lineToRelative(0.795f, -0.795f)
            curveToRelative(0.273f, -0.273f, 0.717f, -0.273f, 0.99f, 0f)
            close()
            moveTo(4.5f, 2f)
            curveTo(3.12f, 2f, 2f, 3.12f, 2f, 4.5f)
            verticalLineToRelative(7f)
            curveTo(2f, 12.88f, 3.12f, 14f, 4.5f, 14f)
            horizontalLineToRelative(7f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineToRelative(-7f)
            curveTo(14f, 3.12f, 12.88f, 2f, 11.5f, 2f)
            horizontalLineToRelative(-7f)
            close()
            moveTo(3f, 4.5f)
            curveTo(3f, 3.672f, 3.672f, 3f, 4.5f, 3f)
            horizontalLineToRelative(7f)
            curveTo(12.328f, 3f, 13f, 3.672f, 13f, 4.5f)
            verticalLineToRelative(7f)
            curveToRelative(0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-7f)
            curveTo(3.672f, 13f, 3f, 12.328f, 3f, 11.5f)
            verticalLineToRelative(-7f)
            close()
        }
    }.build()
}
