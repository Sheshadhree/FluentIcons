package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.CircleImage16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.CircleImage16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.5f, 3f)
            curveTo(4.567f, 3f, 3f, 4.567f, 3f, 6.5f)
            curveToRelative(0f, 1.396f, 0.817f, 2.601f, 2f, 3.163f)
            verticalLineToRelative(1.08f)
            curveTo(3.252f, 10.127f, 2f, 8.46f, 2f, 6.5f)
            curveTo(2f, 4.015f, 4.015f, 2f, 6.5f, 2f)
            curveToRelative(1.96f, 0f, 3.626f, 1.252f, 4.244f, 3f)
            horizontalLineToRelative(-1.08f)
            curveTo(9.1f, 3.817f, 7.895f, 3f, 6.5f, 3f)
            close()
            moveTo(8f, 6f)
            curveTo(6.895f, 6f, 6f, 6.895f, 6f, 8f)
            verticalLineToRelative(4f)
            curveToRelative(0f, 1.105f, 0.895f, 2f, 2f, 2f)
            horizontalLineToRelative(4f)
            curveToRelative(1.105f, 0f, 2f, -0.895f, 2f, -2f)
            verticalLineTo(8f)
            curveToRelative(0f, -1.105f, -0.895f, -2f, -2f, -2f)
            horizontalLineTo(8f)
            close()
            moveTo(7f, 8f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            horizontalLineToRelative(4f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            verticalLineToRelative(4f)
            curveToRelative(0f, 0.09f, -0.012f, 0.176f, -0.034f, 0.259f)
            lineToRelative(-1.729f, -1.729f)
            curveToRelative(-0.683f, -0.683f, -1.791f, -0.683f, -2.474f, 0f)
            lineToRelative(-1.73f, 1.729f)
            curveTo(7.013f, 12.176f, 7f, 12.089f, 7f, 12f)
            verticalLineTo(8f)
            close()
            moveToRelative(0.741f, 4.966f)
            lineToRelative(1.729f, -1.729f)
            curveToRelative(0.293f, -0.293f, 0.767f, -0.293f, 1.06f, 0f)
            lineToRelative(1.729f, 1.73f)
            curveTo(12.176f, 12.987f, 12.089f, 13f, 12f, 13f)
            horizontalLineTo(8f)
            curveToRelative(-0.09f, 0f, -0.176f, -0.012f, -0.259f, -0.034f)
            close()
            moveTo(12.25f, 8.5f)
            curveToRelative(0f, 0.414f, -0.336f, 0.75f, -0.75f, 0.75f)
            reflectiveCurveToRelative(-0.75f, -0.336f, -0.75f, -0.75f)
            reflectiveCurveToRelative(0.336f, -0.75f, 0.75f, -0.75f)
            reflectiveCurveToRelative(0.75f, 0.336f, 0.75f, 0.75f)
            close()
        }
    }.build()
}
