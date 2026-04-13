package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Reward32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Reward32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(11f, 5f)
            verticalLineToRelative(8.154f)
            lineToRelative(4.88f, 2.644f)
            curveToRelative(0.075f, 0.04f, 0.165f, 0.04f, 0.24f, 0f)
            lineTo(21f, 13.154f)
            verticalLineTo(5f)
            horizontalLineTo(11f)
            close()
            moveTo(3f, 6.25f)
            curveTo(3f, 4.455f, 4.455f, 3f, 6.25f, 3f)
            horizontalLineToRelative(19.5f)
            curveTo(27.545f, 3f, 29f, 4.455f, 29f, 6.25f)
            verticalLineToRelative(2.314f)
            curveToRelative(0f, 1.56f, -0.854f, 2.994f, -2.226f, 3.737f)
            lineToRelative(-7.986f, 4.326f)
            curveTo(20.983f, 17.67f, 22.5f, 19.908f, 22.5f, 22.5f)
            curveToRelative(0f, 3.59f, -2.91f, 6.5f, -6.5f, 6.5f)
            reflectiveCurveToRelative(-6.5f, -2.91f, -6.5f, -6.5f)
            curveToRelative(0f, -2.592f, 1.517f, -4.83f, 3.711f, -5.873f)
            lineTo(5.226f, 12.3f)
            curveTo(3.854f, 11.558f, 3f, 10.124f, 3f, 8.564f)
            verticalLineTo(6.25f)
            close()
            moveToRelative(8.5f, 16.25f)
            curveToRelative(0f, 2.485f, 2.015f, 4.5f, 4.5f, 4.5f)
            reflectiveCurveToRelative(4.5f, -2.015f, 4.5f, -4.5f)
            reflectiveCurveTo(18.485f, 18f, 16f, 18f)
            reflectiveCurveToRelative(-4.5f, 2.015f, -4.5f, 4.5f)
            close()
        }
    }.build()
}
