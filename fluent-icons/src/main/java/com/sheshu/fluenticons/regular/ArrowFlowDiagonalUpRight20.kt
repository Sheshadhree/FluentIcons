package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowFlowDiagonalUpRight20: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowFlowDiagonalUpRight20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10.5f, 4f)
            curveTo(10.224f, 4f, 10f, 4.224f, 10f, 4.5f)
            reflectiveCurveTo(10.224f, 5f, 10.5f, 5f)
            horizontalLineToRelative(3.793f)
            lineToRelative(-6.555f, 6.555f)
            curveTo(7.248f, 11.205f, 6.648f, 11f, 6f, 11f)
            curveToRelative(-1.657f, 0f, -3f, 1.343f, -3f, 3f)
            reflectiveCurveToRelative(1.343f, 3f, 3f, 3f)
            reflectiveCurveToRelative(3f, -1.343f, 3f, -3f)
            curveToRelative(0f, -0.648f, -0.205f, -1.248f, -0.555f, -1.738f)
            lineTo(15f, 5.707f)
            verticalLineTo(9.5f)
            curveToRelative(0f, 0.276f, 0.224f, 0.5f, 0.5f, 0.5f)
            reflectiveCurveTo(16f, 9.776f, 16f, 9.5f)
            verticalLineToRelative(-5f)
            curveTo(16f, 4.224f, 15.776f, 4f, 15.5f, 4f)
            horizontalLineToRelative(-5f)
            close()
            moveTo(4f, 14f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            reflectiveCurveToRelative(2f, 0.895f, 2f, 2f)
            reflectiveCurveToRelative(-0.895f, 2f, -2f, 2f)
            reflectiveCurveToRelative(-2f, -0.895f, -2f, -2f)
            close()
        }
    }.build()
}
