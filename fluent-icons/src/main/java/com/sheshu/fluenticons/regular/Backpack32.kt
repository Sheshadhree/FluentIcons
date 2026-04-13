package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Backpack32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Backpack32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(14f, 12f)
            curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
            curveToRelative(0f, 1.105f, 0.895f, 2f, 2f, 2f)
            horizontalLineToRelative(8f)
            curveToRelative(1.105f, 0f, 2f, -0.895f, 2f, -2f)
            curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
            horizontalLineToRelative(-4f)
            close()
            moveToRelative(-2f, 4f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            horizontalLineToRelative(4f)
            curveToRelative(1.105f, 0f, 2f, 0.895f, 2f, 2f)
            horizontalLineToRelative(-8f)
            close()
            moveToRelative(4f, -14f)
            curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
            verticalLineToRelative(0.832f)
            curveTo(8.468f, 8.375f, 6f, 11.9f, 6f, 16f)
            verticalLineToRelative(9f)
            curveToRelative(0f, 2.761f, 2.239f, 5f, 5f, 5f)
            horizontalLineToRelative(10f)
            curveToRelative(2.761f, 0f, 5f, -2.239f, 5f, -5f)
            verticalLineToRelative(-9f)
            curveToRelative(0f, -4.1f, -2.468f, -7.625f, -6f, -9.168f)
            verticalLineTo(6f)
            curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
            close()
            moveToRelative(8f, 18f)
            horizontalLineTo(8f)
            verticalLineToRelative(-4f)
            curveToRelative(0f, -4.418f, 3.582f, -8f, 8f, -8f)
            reflectiveCurveToRelative(8f, 3.582f, 8f, 8f)
            verticalLineToRelative(4f)
            close()
            moveToRelative(-12f, 5f)
            curveToRelative(0f, 0.552f, 0.448f, 1f, 1f, 1f)
            reflectiveCurveToRelative(1f, -0.448f, 1f, -1f)
            verticalLineToRelative(-3f)
            horizontalLineToRelative(10f)
            verticalLineToRelative(3f)
            curveToRelative(0f, 1.657f, -1.343f, 3f, -3f, 3f)
            horizontalLineTo(11f)
            curveToRelative(-1.657f, 0f, -3f, -1.343f, -3f, -3f)
            verticalLineToRelative(-3f)
            horizontalLineToRelative(4f)
            verticalLineToRelative(3f)
            close()
            moveToRelative(4f, -19f)
            curveToRelative(-0.685f, 0f, -1.354f, 0.069f, -2f, 0.2f)
            verticalLineTo(6f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            reflectiveCurveToRelative(2f, 0.895f, 2f, 2f)
            verticalLineToRelative(0.2f)
            curveTo(17.354f, 6.069f, 16.685f, 6f, 16f, 6f)
            close()
        }
    }.build()
}
