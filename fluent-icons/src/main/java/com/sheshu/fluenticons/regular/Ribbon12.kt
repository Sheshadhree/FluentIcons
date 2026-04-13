package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Ribbon12: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Ribbon12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3.5f, 4.5f)
            curveTo(3.5f, 3.12f, 4.62f, 2f, 6f, 2f)
            reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
            reflectiveCurveTo(7.38f, 7f, 6f, 7f)
            reflectiveCurveTo(3.5f, 5.88f, 3.5f, 4.5f)
            close()
            moveTo(6f, 1f)
            curveTo(4.067f, 1f, 2.5f, 2.567f, 2.5f, 4.5f)
            curveToRelative(0f, 1.19f, 0.593f, 2.24f, 1.5f, 2.873f)
            verticalLineTo(10.5f)
            curveToRelative(0f, 0.184f, 0.101f, 0.354f, 0.264f, 0.44f)
            curveToRelative(0.163f, 0.088f, 0.36f, 0.078f, 0.513f, -0.024f)
            lineTo(6f, 10.101f)
            lineToRelative(1.223f, 0.815f)
            curveToRelative(0.153f, 0.102f, 0.35f, 0.112f, 0.513f, 0.025f)
            curveTo(7.899f, 10.854f, 8f, 10.684f, 8f, 10.5f)
            verticalLineTo(7.373f)
            curveTo(8.907f, 6.74f, 9.5f, 5.689f, 9.5f, 4.5f)
            curveTo(9.5f, 2.567f, 7.933f, 1f, 6f, 1f)
            close()
            moveToRelative(1f, 6.855f)
            verticalLineToRelative(1.71f)
            lineToRelative(-0.723f, -0.48f)
            curveToRelative(-0.168f, -0.112f, -0.386f, -0.112f, -0.554f, 0f)
            lineTo(5f, 9.566f)
            verticalLineToRelative(-1.71f)
            curveTo(5.317f, 7.948f, 5.652f, 8f, 6f, 8f)
            reflectiveCurveToRelative(0.683f, -0.05f, 1f, -0.145f)
            close()
        }
    }.build()
}
