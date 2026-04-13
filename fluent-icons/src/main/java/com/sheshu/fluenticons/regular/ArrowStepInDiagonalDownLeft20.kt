package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowStepInDiagonalDownLeft20: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowStepInDiagonalDownLeft20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(16.854f, 3.147f)
            curveToRelative(0.195f, 0.195f, 0.195f, 0.511f, 0f, 0.707f)
            lineTo(9.707f, 11f)
            horizontalLineTo(14.5f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            reflectiveCurveTo(14.776f, 12f, 14.5f, 12f)
            horizontalLineTo(8.476f)
            curveToRelative(-0.057f, -0.003f, -0.114f, -0.016f, -0.167f, -0.038f)
            curveToRelative(-0.06f, -0.024f, -0.115f, -0.06f, -0.162f, -0.108f)
            curveToRelative(-0.049f, -0.048f, -0.085f, -0.104f, -0.11f, -0.163f)
            curveTo(8.014f, 11.632f, 8f, 11.568f, 8f, 11.5f)
            verticalLineToRelative(-6f)
            curveTo(8f, 5.224f, 8.224f, 5f, 8.5f, 5f)
            reflectiveCurveTo(9f, 5.224f, 9f, 5.5f)
            verticalLineToRelative(4.793f)
            lineToRelative(7.146f, -7.146f)
            curveToRelative(0.196f, -0.196f, 0.512f, -0.196f, 0.708f, 0f)
            close()
            moveTo(7f, 15f)
            curveToRelative(0f, 1.105f, -0.895f, 2f, -2f, 2f)
            reflectiveCurveToRelative(-2f, -0.895f, -2f, -2f)
            reflectiveCurveToRelative(0.895f, -2f, 2f, -2f)
            reflectiveCurveToRelative(2f, 0.895f, 2f, 2f)
            close()
            moveToRelative(-1f, 0f)
            curveToRelative(0f, -0.552f, -0.448f, -1f, -1f, -1f)
            reflectiveCurveToRelative(-1f, 0.448f, -1f, 1f)
            reflectiveCurveToRelative(0.448f, 1f, 1f, 1f)
            reflectiveCurveToRelative(1f, -0.448f, 1f, -1f)
            close()
        }
    }.build()
}
