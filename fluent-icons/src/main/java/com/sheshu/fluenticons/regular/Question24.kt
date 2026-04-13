package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Question24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Question24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 4f)
            curveTo(9.236f, 4f, 7f, 6.236f, 7f, 9f)
            curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
            reflectiveCurveTo(8.5f, 9.414f, 8.5f, 9f)
            curveToRelative(0f, -1.936f, 1.564f, -3.5f, 3.5f, -3.5f)
            reflectiveCurveToRelative(3.5f, 1.564f, 3.5f, 3.5f)
            curveToRelative(0f, 0.852f, -0.222f, 1.42f, -0.529f, 1.86f)
            curveToRelative(-0.324f, 0.463f, -0.767f, 0.823f, -1.302f, 1.232f)
            lineToRelative(-0.138f, 0.105f)
            curveTo(12.521f, 12.965f, 11.25f, 13.93f, 11.25f, 16f)
            verticalLineToRelative(0.25f)
            curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
            reflectiveCurveToRelative(0.75f, -0.336f, 0.75f, -0.75f)
            verticalLineTo(16f)
            curveToRelative(0f, -1.317f, 0.714f, -1.863f, 1.785f, -2.682f)
            lineToRelative(0.046f, -0.035f)
            curveToRelative(0.527f, -0.403f, 1.147f, -0.887f, 1.62f, -1.564f)
            curveTo(16.69f, 11.018f, 17f, 10.149f, 17f, 9f)
            curveToRelative(0f, -2.764f, -2.236f, -5f, -5f, -5f)
            close()
            moveToRelative(0f, 17f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            reflectiveCurveToRelative(-0.448f, -1f, -1f, -1f)
            reflectiveCurveToRelative(-1f, 0.448f, -1f, 1f)
            reflectiveCurveToRelative(0.448f, 1f, 1f, 1f)
            close()
        }
    }.build()
}
