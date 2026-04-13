package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.PersonAccounts20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PersonAccounts20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(9f, 2f)
            curveTo(6.79f, 2f, 5f, 3.79f, 5f, 6f)
            reflectiveCurveToRelative(1.79f, 4f, 4f, 4f)
            reflectiveCurveToRelative(4f, -1.79f, 4f, -4f)
            reflectiveCurveToRelative(-1.79f, -4f, -4f, -4f)
            close()
            moveToRelative(-4.991f, 9f)
            curveTo(2.903f, 11f, 2f, 11.887f, 2f, 13f)
            curveToRelative(0f, 1.691f, 0.833f, 2.966f, 2.135f, 3.797f)
            curveTo(5.417f, 17.614f, 7.145f, 18f, 9f, 18f)
            horizontalLineToRelative(0.05f)
            curveTo(9.017f, 17.838f, 9f, 17.67f, 9f, 17.5f)
            verticalLineToRelative(-4f)
            curveToRelative(0f, -1.224f, 0.88f, -2.243f, 2.042f, -2.458f)
            lineTo(11.05f, 11f)
            horizontalLineTo(4.009f)
            close()
            moveTo(12f, 11.5f)
            verticalLineTo(12f)
            horizontalLineToRelative(-0.5f)
            curveToRelative(-0.828f, 0f, -1.5f, 0.672f, -1.5f, 1.5f)
            verticalLineToRelative(4f)
            curveToRelative(0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(6f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            verticalLineToRelative(-4f)
            curveToRelative(0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
            horizontalLineTo(17f)
            verticalLineToRelative(-0.5f)
            curveToRelative(0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
            horizontalLineToRelative(-2f)
            curveToRelative(-0.828f, 0f, -1.5f, 0.672f, -1.5f, 1.5f)
            close()
            moveToRelative(1.5f, -0.5f)
            horizontalLineToRelative(2f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            verticalLineTo(12f)
            horizontalLineToRelative(-3f)
            verticalLineToRelative(-0.5f)
            curveToRelative(0f, -0.276f, 0.224f, -0.5f, 0.5f, -0.5f)
            close()
        }
    }.build()
}
