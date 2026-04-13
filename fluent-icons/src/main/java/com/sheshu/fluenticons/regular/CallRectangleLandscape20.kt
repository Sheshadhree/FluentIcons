package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.CallRectangleLandscape20: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.CallRectangleLandscape20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5f, 4f)
            curveTo(3.343f, 4f, 2f, 5.343f, 2f, 7f)
            verticalLineToRelative(6f)
            curveToRelative(0f, 1.657f, 1.343f, 3f, 3f, 3f)
            horizontalLineToRelative(10f)
            curveToRelative(1.657f, 0f, 3f, -1.343f, 3f, -3f)
            verticalLineTo(7f)
            curveToRelative(0f, -1.657f, -1.343f, -3f, -3f, -3f)
            horizontalLineTo(5f)
            close()
            moveTo(3f, 7f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            horizontalLineToRelative(10f)
            curveToRelative(1.105f, 0f, 2f, 0.895f, 2f, 2f)
            verticalLineToRelative(6f)
            curveToRelative(0f, 1.105f, -0.895f, 2f, -2f, 2f)
            horizontalLineTo(5f)
            curveToRelative(-1.105f, 0f, -2f, -0.895f, -2f, -2f)
            verticalLineTo(7f)
            close()
            moveToRelative(3.594f, 1.212f)
            curveTo(7.492f, 7.763f, 8.697f, 7.5f, 10f, 7.5f)
            reflectiveCurveToRelative(2.508f, 0.263f, 3.405f, 0.712f)
            curveTo(14.274f, 8.646f, 15f, 9.337f, 15f, 10.25f)
            verticalLineToRelative(0.745f)
            curveToRelative(0f, 0.887f, -0.766f, 1.58f, -1.65f, 1.493f)
            lineToRelative(-0.714f, -0.072f)
            curveToRelative(-0.62f, -0.062f, -1.136f, -0.5f, -1.299f, -1.101f)
            lineToRelative(-0.285f, -1.056f)
            lineToRelative(-0.02f, -0.08f)
            verticalLineToRelative(-0.004f)
            lineToRelative(-0.003f, -0.013f)
            curveTo(10.959f, 10.12f, 10.709f, 10f, 10f, 10f)
            curveToRelative(-0.709f, 0f, -0.96f, 0.12f, -1.029f, 0.162f)
            lineToRelative(-0.003f, 0.013f)
            verticalLineToRelative(0.004f)
            lineToRelative(-0.02f, 0.08f)
            lineToRelative(-0.286f, 1.056f)
            curveToRelative(-0.162f, 0.6f, -0.679f, 1.04f, -1.298f, 1.101f)
            lineToRelative(-0.715f, 0.072f)
            curveTo(5.766f, 12.575f, 5f, 11.882f, 5f, 10.995f)
            verticalLineTo(10.25f)
            curveToRelative(0f, -0.913f, 0.727f, -1.604f, 1.594f, -2.038f)
            close()
        }
    }.build()
}
