package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Alert12: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Alert12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3f, 5f)
            verticalLineToRelative(1.5f)
            curveToRelative(0f, 0.078f, -0.018f, 0.154f, -0.053f, 0.224f)
            lineTo(2.31f, 8f)
            horizontalLineToRelative(7.382f)
            lineTo(9.053f, 6.724f)
            curveTo(9.018f, 6.654f, 9f, 6.578f, 9f, 6.5f)
            verticalLineTo(5f)
            curveToRelative(0f, -1.657f, -1.343f, -3f, -3f, -3f)
            reflectiveCurveTo(3f, 3.343f, 3f, 5f)
            close()
            moveToRelative(1f, 4f)
            horizontalLineTo(1.5f)
            curveTo(1.327f, 9f, 1.166f, 8.91f, 1.075f, 8.763f)
            curveToRelative(-0.091f, -0.147f, -0.1f, -0.332f, -0.022f, -0.487f)
            lineTo(2f, 6.382f)
            verticalLineTo(5f)
            curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
            reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
            verticalLineToRelative(1.382f)
            lineToRelative(0.947f, 1.894f)
            curveToRelative(0.078f, 0.155f, 0.07f, 0.34f, -0.022f, 0.487f)
            curveTo(10.835f, 8.91f, 10.673f, 9f, 10.5f, 9f)
            horizontalLineTo(8f)
            curveToRelative(0f, 1.105f, -0.895f, 2f, -2f, 2f)
            reflectiveCurveToRelative(-2f, -0.895f, -2f, -2f)
            close()
            moveToRelative(3f, 0f)
            horizontalLineTo(5f)
            curveToRelative(0f, 0.552f, 0.448f, 1f, 1f, 1f)
            reflectiveCurveToRelative(1f, -0.448f, 1f, -1f)
            close()
        }
    }.build()
}
