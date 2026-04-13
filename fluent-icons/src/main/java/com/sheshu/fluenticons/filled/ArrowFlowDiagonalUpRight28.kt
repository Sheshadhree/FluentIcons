package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowFlowDiagonalUpRight28: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowFlowDiagonalUpRight28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(22.5f, 13.25f)
            curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
            reflectiveCurveTo(24f, 13.664f, 24f, 13.25f)
            verticalLineToRelative(-8.5f)
            curveTo(24f, 4.336f, 23.664f, 4f, 23.25f, 4f)
            horizontalLineToRelative(-8.5f)
            curveTo(14.336f, 4f, 14f, 4.336f, 14f, 4.75f)
            reflectiveCurveToRelative(0.336f, 0.75f, 0.75f, 0.75f)
            horizontalLineToRelative(6.69f)
            lineTo(11f, 15.938f)
            curveTo(10.24f, 15.35f, 9.287f, 15f, 8.25f, 15f)
            curveToRelative(-2.485f, 0f, -4.5f, 2.015f, -4.5f, 4.5f)
            reflectiveCurveTo(5.765f, 24f, 8.25f, 24f)
            reflectiveCurveToRelative(4.5f, -2.015f, 4.5f, -4.5f)
            curveToRelative(0f, -0.907f, -0.269f, -1.752f, -0.73f, -2.459f)
            lineTo(22.5f, 6.561f)
            verticalLineToRelative(6.689f)
            close()
        }
    }.build()
}
