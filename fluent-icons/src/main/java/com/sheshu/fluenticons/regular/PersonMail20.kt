package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.PersonMail20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.PersonMail20",
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
            moveTo(6f, 6f)
            curveToRelative(0f, -1.657f, 1.343f, -3f, 3f, -3f)
            reflectiveCurveToRelative(3f, 1.343f, 3f, 3f)
            reflectiveCurveToRelative(-1.343f, 3f, -3f, 3f)
            reflectiveCurveToRelative(-3f, -1.343f, -3f, -3f)
            close()
            moveToRelative(-1.991f, 5f)
            curveTo(2.903f, 11f, 2f, 11.887f, 2f, 13f)
            curveToRelative(0f, 1.691f, 0.833f, 2.966f, 2.135f, 3.797f)
            curveTo(5.417f, 17.614f, 7.145f, 18f, 9f, 18f)
            verticalLineToRelative(-1f)
            curveToRelative(-1.735f, 0f, -3.257f, -0.364f, -4.327f, -1.047f)
            curveTo(3.623f, 15.283f, 3f, 14.31f, 3f, 13f)
            curveToRelative(0f, -0.553f, 0.448f, -1f, 1.009f, -1f)
            horizontalLineToRelative(5.259f)
            curveToRelative(0.345f, -0.597f, 0.99f, -0.998f, 1.728f, -1f)
            horizontalLineTo(4.009f)
            close()
            moveToRelative(10.5f, 4.927f)
            lineToRelative(-4.496f, -2.623f)
            curveTo(10.109f, 12.568f, 10.738f, 12f, 11.5f, 12f)
            horizontalLineToRelative(6f)
            curveToRelative(0.828f, 0f, 1.5f, 0.672f, 1.5f, 1.5f)
            verticalLineToRelative(0.009f)
            lineToRelative(-4.49f, 2.418f)
            close()
            moveToRelative(0.228f, 1.013f)
            lineTo(19f, 14.645f)
            verticalLineTo(17.5f)
            curveToRelative(0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-6f)
            curveToRelative(-0.828f, 0f, -1.5f, -0.672f, -1.5f, -1.5f)
            verticalLineToRelative(-3.046f)
            lineToRelative(4.248f, 2.478f)
            curveToRelative(0.15f, 0.088f, 0.336f, 0.09f, 0.49f, 0.008f)
            close()
        }
    }.build()
}
