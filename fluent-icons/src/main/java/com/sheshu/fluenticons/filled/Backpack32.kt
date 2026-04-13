package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Backpack32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Backpack32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 16f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            horizontalLineToRelative(4f)
            curveToRelative(1.105f, 0f, 2f, 0.895f, 2f, 2f)
            horizontalLineToRelative(-8f)
            close()
            moveToRelative(4f, -14f)
            curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
            verticalLineToRelative(0.832f)
            curveTo(8.468f, 8.375f, 6f, 11.9f, 6f, 16f)
            verticalLineToRelative(4f)
            horizontalLineToRelative(20f)
            verticalLineToRelative(-4f)
            curveToRelative(0f, -4.1f, -2.468f, -7.625f, -6f, -9.168f)
            verticalLineTo(6f)
            curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
            close()
            moveToRelative(0f, 4f)
            curveToRelative(-0.685f, 0f, -1.354f, 0.069f, -2f, 0.2f)
            verticalLineTo(6f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            reflectiveCurveToRelative(2f, 0.895f, 2f, 2f)
            verticalLineToRelative(0.2f)
            curveTo(17.354f, 6.069f, 16.685f, 6f, 16f, 6f)
            close()
            moveToRelative(-2f, 6f)
            horizontalLineToRelative(4f)
            curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
            curveToRelative(0f, 1.105f, -0.895f, 2f, -2f, 2f)
            horizontalLineToRelative(-8f)
            curveToRelative(-1.105f, 0f, -2f, -0.895f, -2f, -2f)
            curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
            close()
            moveToRelative(-2f, 13f)
            verticalLineToRelative(-3f)
            horizontalLineTo(6f)
            verticalLineToRelative(3f)
            curveToRelative(0f, 2.761f, 2.239f, 5f, 5f, 5f)
            horizontalLineToRelative(10f)
            curveToRelative(2.761f, 0f, 5f, -2.239f, 5f, -5f)
            verticalLineToRelative(-3f)
            horizontalLineTo(14f)
            verticalLineToRelative(3f)
            curveToRelative(0f, 0.552f, -0.448f, 1f, -1f, 1f)
            reflectiveCurveToRelative(-1f, -0.448f, -1f, -1f)
            close()
        }
    }.build()
}
