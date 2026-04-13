package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.LockClosed32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.LockClosed32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10f, 8f)
            curveToRelative(0f, -3.314f, 2.686f, -6f, 6f, -6f)
            reflectiveCurveToRelative(6f, 2.686f, 6f, 6f)
            verticalLineToRelative(1f)
            horizontalLineToRelative(1.5f)
            curveToRelative(2.485f, 0f, 4.5f, 2.015f, 4.5f, 4.5f)
            verticalLineToRelative(12f)
            curveToRelative(0f, 2.485f, -2.015f, 4.5f, -4.5f, 4.5f)
            horizontalLineToRelative(-15f)
            curveTo(6.015f, 30f, 4f, 27.985f, 4f, 25.5f)
            verticalLineToRelative(-12f)
            curveTo(4f, 11.015f, 6.015f, 9f, 8.5f, 9f)
            horizontalLineTo(10f)
            verticalLineTo(8f)
            close()
            moveToRelative(6f, -4f)
            curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
            verticalLineToRelative(1f)
            horizontalLineToRelative(8f)
            verticalLineTo(8f)
            curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
            close()
            moveToRelative(0f, 18f)
            curveToRelative(1.105f, 0f, 2f, -0.895f, 2f, -2f)
            reflectiveCurveToRelative(-0.895f, -2f, -2f, -2f)
            reflectiveCurveToRelative(-2f, 0.895f, -2f, 2f)
            reflectiveCurveToRelative(0.895f, 2f, 2f, 2f)
            close()
        }
    }.build()
}
