package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowFlowDiagonalUpRight28: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowFlowDiagonalUpRight28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(23.25f, 14f)
            curveToRelative(-0.414f, 0f, -0.75f, -0.336f, -0.75f, -0.75f)
            verticalLineTo(6.56f)
            lineTo(12.02f, 17.042f)
            curveToRelative(0.461f, 0.707f, 0.73f, 1.552f, 0.73f, 2.459f)
            curveToRelative(0f, 2.485f, -2.015f, 4.5f, -4.5f, 4.5f)
            reflectiveCurveToRelative(-4.5f, -2.015f, -4.5f, -4.5f)
            reflectiveCurveTo(5.765f, 15f, 8.25f, 15f)
            curveToRelative(1.036f, 0f, 1.99f, 0.35f, 2.75f, 0.938f)
            lineTo(21.44f, 5.5f)
            horizontalLineToRelative(-6.69f)
            curveTo(14.336f, 5.5f, 14f, 5.164f, 14f, 4.75f)
            reflectiveCurveTo(14.336f, 4f, 14.75f, 4f)
            horizontalLineToRelative(8.5f)
            curveTo(23.664f, 4f, 24f, 4.336f, 24f, 4.75f)
            verticalLineToRelative(8.5f)
            curveToRelative(0f, 0.414f, -0.336f, 0.75f, -0.75f, 0.75f)
            close()
            moveToRelative(-15f, 8.5f)
            curveToRelative(1.657f, 0f, 3f, -1.343f, 3f, -3f)
            reflectiveCurveToRelative(-1.343f, -3f, -3f, -3f)
            reflectiveCurveToRelative(-3f, 1.343f, -3f, 3f)
            reflectiveCurveToRelative(1.343f, 3f, 3f, 3f)
            close()
        }
    }.build()
}
