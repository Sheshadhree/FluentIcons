package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Headphones16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Headphones16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8f, 1f)
            curveToRelative(3.866f, 0f, 7f, 3.134f, 7f, 7f)
            verticalLineToRelative(4.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineToRelative(-2f)
            curveToRelative(-0.276f, 0f, -0.5f, -0.224f, -0.5f, -0.5f)
            verticalLineToRelative(-5f)
            curveTo(10f, 9.224f, 10.224f, 9f, 10.5f, 9f)
            horizontalLineTo(14f)
            verticalLineTo(8f)
            curveToRelative(0f, -3.314f, -2.686f, -6f, -6f, -6f)
            reflectiveCurveTo(2f, 4.686f, 2f, 8f)
            verticalLineToRelative(1f)
            horizontalLineToRelative(3.5f)
            curveTo(5.776f, 9f, 6f, 9.224f, 6f, 9.5f)
            verticalLineToRelative(5f)
            curveTo(6f, 14.776f, 5.776f, 15f, 5.5f, 15f)
            horizontalLineToRelative(-2f)
            curveToRelative(-1.294f, 0f, -2.36f, -0.984f, -2.487f, -2.244f)
            lineTo(1f, 12.5f)
            verticalLineTo(8f)
            curveToRelative(0f, -3.866f, 3.134f, -7f, 7f, -7f)
            close()
            moveTo(2f, 12.5f)
            lineToRelative(0.008f, 0.153f)
            curveTo(2.085f, 13.41f, 2.723f, 14f, 3.5f, 14f)
            horizontalLineTo(5f)
            verticalLineToRelative(-4f)
            horizontalLineTo(2f)
            verticalLineToRelative(2.5f)
            close()
            moveToRelative(9f, 1.5f)
            horizontalLineToRelative(1.5f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            verticalLineTo(10f)
            horizontalLineToRelative(-3f)
            verticalLineToRelative(4f)
            close()
        }
    }.build()
}
